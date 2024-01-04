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
import de.markusbordihn.trankomat.block.VendingMachineBlock;
import de.markusbordihn.trankomat.item.SodaCanItem;
import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;

public class VendingMachineOffers {

  private static final int REFILL_UPDATE_INTERVAL_IN_SECONDS = 86400; // 1 day
  private static final int REFRESH_UPDATE_INTERVAL_IN_SECONDS = 259200; // 3 days
  private static final Map<BlockPos, Instant> refileUpdateMap = new HashMap<>();
  private static final Map<BlockPos, Instant> refreshUpdateMap = new HashMap<>();
  private static final Map<BlockPos, Boolean> needsUpdateMap = new HashMap<>();
  private static final Map<BlockPos, MerchantOffers> vendingMachineOffersMap = new HashMap<>();
  private static final HashSet<SodaCanItem> itemsTier0 = new HashSet<>();
  private static final HashSet<SodaCanItem> itemsTier1 = new HashSet<>();
  private static final HashSet<SodaCanItem> itemsTier2 = new HashSet<>();
  private static final HashSet<SodaCanItem> itemsTier3 = new HashSet<>();
  private static final HashSet<SodaCanItem> itemsTier4 = new HashSet<>();
  private static final Random random = new Random();
  private static boolean itemsInitialized = false;

  protected VendingMachineOffers() {}

  private static MerchantOffers updateVendingMachineOffers(
      VendingMachineBlock vendingMachineBlock, BlockPos blockPos) {

    long currentInstantInSeconds = Instant.now().getEpochSecond();

    // Check if refresh (3 days) is required.
    Instant refreshUpdateDate = refreshUpdateMap.get(blockPos);
    if (refreshUpdateDate != null
        && currentInstantInSeconds - refreshUpdateDate.getEpochSecond()
            >= REFRESH_UPDATE_INTERVAL_IN_SECONDS) {
      return createVendingMachineOffers(vendingMachineBlock, blockPos);
    }

    // Check if refile update (1 day) is required.
    Instant refileUpdateDate = refileUpdateMap.get(blockPos);
    if (refileUpdateDate != null
        && currentInstantInSeconds - refileUpdateDate.getEpochSecond()
            >= REFILL_UPDATE_INTERVAL_IN_SECONDS) {
      return refillVendingMachineOffers(vendingMachineBlock, blockPos);
    }

    return vendingMachineOffersMap.get(blockPos);
  }

  private static MerchantOffers refillVendingMachineOffers(
      VendingMachineBlock vendingMachineBlock, BlockPos blockPos) {
    Constants.LOG.info(
        "Refill vending machine offers for {} at {}.", vendingMachineBlock, blockPos);
    MerchantOffers merchantOffers = vendingMachineOffersMap.get(blockPos);
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
    vendingMachineOffersMap.put(blockPos, merchantOffers);
    return merchantOffers;
  }

  private static void initializedItems() {
    if (itemsInitialized) {
      return;
    }

    // Get all registered soda can items.
    BuiltInRegistries.ITEM.stream()
        .filter(item -> item.asItem() instanceof SodaCanItem)
        .forEach(
            item -> {
              if (item instanceof SodaCanItem sodaCanItems) {
                if (sodaCanItems.getTier() == SodaCanTier.TIER_0) {
                  itemsTier0.add(sodaCanItems);
                } else if (sodaCanItems.getTier() == SodaCanTier.TIER_1) {
                  itemsTier1.add(sodaCanItems);
                } else if (sodaCanItems.getTier() == SodaCanTier.TIER_2) {
                  itemsTier2.add(sodaCanItems);
                } else if (sodaCanItems.getTier() == SodaCanTier.TIER_3) {
                  itemsTier3.add(sodaCanItems);
                } else if (sodaCanItems.getTier() == SodaCanTier.TIER_4) {
                  itemsTier4.add(sodaCanItems);
                }
              }
            });

    itemsInitialized = true;
  }

  private static MerchantOffers createVendingMachineOffers(
      VendingMachineBlock vendingMachineBlock, BlockPos blockPos) {
    Constants.LOG.info(
        "Create new vending machine offers for {} at {}.", vendingMachineBlock, blockPos);

    MerchantOffers merchantOffers = new MerchantOffers();

    // Get registered items, if not already done.
    initializedItems();

    // Add max. 8 random Tier 0 offers
    merchantOffers.addAll(getRandomOffers(itemsTier0, 8));

    // Add max. 4 random Tier 1 offers
    merchantOffers.addAll(getRandomOffers(itemsTier1, 4));

    // Add max. 2 random Tier 2 offers
    merchantOffers.addAll(getRandomOffers(itemsTier2, 2));

    // Add max. 1 random Tier 3 offers
    merchantOffers.addAll(getRandomOffers(itemsTier3, 1));

    // Add max. 0-1 random Tier 4 offers
    if (random.nextInt(2) == 0) {
      merchantOffers.addAll(getRandomOffers(itemsTier4, 1));
    }

    // Update trading offers and reset refill and refresh date.
    refileUpdateMap.put(blockPos, Instant.now());
    refreshUpdateMap.put(blockPos, Instant.now());
    needsUpdateMap.put(blockPos, true);
    vendingMachineOffersMap.put(blockPos, merchantOffers);
    return merchantOffers;
  }

  private static Set<MerchantOffer> getRandomOffers(Set<SodaCanItem> sodaCanItems, int maxItems) {
    Set<MerchantOffer> merchantOffers = new HashSet<>();
    Set<SodaCanItem> ignoredItems = new HashSet<>();
    for (int i = 0; i < maxItems; i++) {
      SodaCanItem sodaCanItem =
          sodaCanItems.stream().skip(random.nextInt(sodaCanItems.size())).findFirst().orElse(null);
      if (sodaCanItem == null || ignoredItems.contains(sodaCanItem)) {
        continue;
      }
      SodaCanTier sodaCanTier = sodaCanItem.getTier();
      ItemStack costA = sodaCanTier.getCostA();
      ItemStack costB = sodaCanTier.getCostB();
      int maxUses = sodaCanTier.getMaxUses();
      if (costB.isEmpty()) {
        if (sodaCanTier.getTierLevel() == 2) {
          costB = new ItemStack(Items.IRON_INGOT, 1 + random.nextInt(9));
        } else if (sodaCanTier.getTierLevel() == 3) {
          costB = new ItemStack(Items.GOLD_INGOT, 1 + random.nextInt(9));
        } else if (sodaCanTier.getTierLevel() == 4) {
          costB = new ItemStack(Items.GOLD_INGOT, 1 + random.nextInt(9));
        }
      }
      merchantOffers.add(
          new MerchantOffer(costA, costB, new ItemStack(sodaCanItem), maxUses, 0, 1));
      ignoredItems.add(sodaCanItem);
    }
    return merchantOffers;
  }

  public static void checkVendingMachineOffers(
      VendingMachineBlock vendingMachineBlock, BlockPos blockPos) {
    if (vendingMachineOffersMap.containsKey(blockPos)) {
      updateVendingMachineOffers(vendingMachineBlock, blockPos);
    } else {
      createVendingMachineOffers(vendingMachineBlock, blockPos);
    }
  }

  public static boolean needsUpdate(VendingMachineBlock vendingMachineBlock, BlockPos blockPos) {
    if (vendingMachineBlock instanceof VendingMachineBlock) {
      checkVendingMachineOffers(vendingMachineBlock, blockPos);
    }
    return needsUpdateMap.getOrDefault(blockPos, true);
  }

  public static void setNeedsUpdate(BlockPos blockPos, boolean needsUpdate) {
    needsUpdateMap.put(blockPos, needsUpdate);
  }

  public static MerchantOffers getVendingMachineOffers(
      VendingMachineBlock vendingMachineBlock, BlockPos blockPos) {
    if (vendingMachineBlock instanceof VendingMachineBlock) {
      return vendingMachineOffersMap.getOrDefault(blockPos, new MerchantOffers());
    }
    return new MerchantOffers();
  }
}
