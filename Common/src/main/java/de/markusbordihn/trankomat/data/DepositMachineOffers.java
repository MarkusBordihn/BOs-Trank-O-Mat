/*
 * Copyright 2023 Markus Bordihn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.markusbordihn.trankomat.data;

import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.block.DepositMachineBlock;
import de.markusbordihn.trankomat.item.EmptySodaCanItem;
import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;

public class DepositMachineOffers {

  private static final int REFILL_UPDATE_INTERVAL_IN_SECONDS = 86400; // 1 day
  private static final Map<BlockPos, Instant> refileUpdateMap = new HashMap<>();
  private static final Map<BlockPos, Boolean> needsUpdateMap = new HashMap<>();
  private static final Map<BlockPos, MerchantOffers> depositMachineOffersMap = new HashMap<>();
  private static final HashSet<EmptySodaCanItem> emptySodaCans = new HashSet<>();
  private static final Random random = new Random();
  private static boolean itemsInitialized = false;

  protected DepositMachineOffers() {}

  private static MerchantOffers updateDepositMachineOffers(
      DepositMachineBlock depositMachineBlock, BlockPos blockPos) {

    long currentInstantInSeconds = Instant.now().getEpochSecond();

    // Check if refile update (1 day) is required.
    Instant refileUpdateDate = refileUpdateMap.get(blockPos);
    if (refileUpdateDate != null
        && currentInstantInSeconds - refileUpdateDate.getEpochSecond()
            >= REFILL_UPDATE_INTERVAL_IN_SECONDS) {
      return refillDepositMachineOffers(depositMachineBlock, blockPos);
    }

    return depositMachineOffersMap.get(blockPos);
  }

  private static MerchantOffers refillDepositMachineOffers(
      DepositMachineBlock depositMachineBlock, BlockPos blockPos) {
    Constants.LOG.info(
        "Refill deposit machine offers for {} at {}.", depositMachineBlock, blockPos);
    MerchantOffers merchantOffers = depositMachineOffersMap.get(blockPos);
    if (merchantOffers == null || merchantOffers.isEmpty()) {
      return new MerchantOffers();
    }

    // Reset trading offers
    for (MerchantOffer merchantOffer : merchantOffers) {
      merchantOffer.resetUses();
    }

    // Update trading offers
    refileUpdateMap.put(blockPos, Instant.now());
    needsUpdateMap.put(blockPos, true);
    depositMachineOffersMap.put(blockPos, merchantOffers);
    return merchantOffers;
  }

  private static void initializedItems() {
    if (itemsInitialized) {
      return;
    }

    // Get all registered empty soda can items.
    for (DyeColor dyeColor : DyeColor.values()) {
      Item emptySodaCanRegistryItem =
          BuiltInRegistries.ITEM
              .getOptional(
                  new ResourceLocation(
                      Constants.MOD_ID, "soda_can_empty_" + dyeColor.getName().toLowerCase()))
              .orElse(null);
      if (emptySodaCanRegistryItem instanceof EmptySodaCanItem emptySodaCanItem) {
        emptySodaCans.add(emptySodaCanItem);
      }
    }

    itemsInitialized = true;
  }

  private static MerchantOffers createDepositMachineOffers(
      DepositMachineBlock depositMachineBlock, BlockPos blockPos) {
    Constants.LOG.info(
        "Create new deposit machine offers for {} at {}.", depositMachineBlock, blockPos);

    MerchantOffers merchantOffers = new MerchantOffers();

    // Get registered items, if not already done.
    initializedItems();

    // Add empty soda can, for each color.
    merchantOffers.addAll(getEmptySodaCans());

    // Update trading offers and reset refill and refresh date.
    refileUpdateMap.put(blockPos, Instant.now());
    needsUpdateMap.put(blockPos, true);
    depositMachineOffersMap.put(blockPos, merchantOffers);
    return merchantOffers;
  }

  private static Set<MerchantOffer> getEmptySodaCans() {
    Set<MerchantOffer> merchantOffers = new HashSet<>();
    for (EmptySodaCanItem emptySodaCanItem : emptySodaCans) {
      if (emptySodaCanItem == null) {
        continue;
      }
      merchantOffers.add(
          new MerchantOffer(
              ItemStack.EMPTY,
              new ItemStack(emptySodaCanItem),
              new ItemStack(Items.IRON_NUGGET, 2 + random.nextInt(2)),
              1 + random.nextInt(32),
              0,
              1));
    }
    return merchantOffers;
  }

  public static void checkDepositMachineOffers(
      DepositMachineBlock depositMachineBlock, BlockPos blockPos) {
    if (depositMachineOffersMap.containsKey(blockPos)) {
      updateDepositMachineOffers(depositMachineBlock, blockPos);
    } else {
      createDepositMachineOffers(depositMachineBlock, blockPos);
    }
  }

  public static boolean needsUpdate(DepositMachineBlock depositMachineBlock, BlockPos blockPos) {
    if (depositMachineBlock instanceof DepositMachineBlock) {
      checkDepositMachineOffers(depositMachineBlock, blockPos);
    }
    return needsUpdateMap.getOrDefault(blockPos, true);
  }

  public static void setNeedsUpdate(BlockPos blockPos, boolean needsUpdate) {
    needsUpdateMap.put(blockPos, needsUpdate);
  }

  public static MerchantOffers getDepositMachineOffers(
      DepositMachineBlock depositMachineBlock, BlockPos blockPos) {
    if (depositMachineBlock instanceof DepositMachineBlock) {
      return depositMachineOffersMap.getOrDefault(blockPos, new MerchantOffers());
    }
    return new MerchantOffers();
  }
}
