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
import de.markusbordihn.trankomat.menu.VendingMachineMenu;
import java.time.Instant;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.Merchant;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;

public class VendingMachineOffer implements Merchant {

  protected final MerchantOffers merchantOffers;
  private final VendingMachineBlock vendingMachineBlock;
  private final BlockPos blockPos;
  private final boolean isClientSide;
  private Player tradingPlayer;
  private Instant lastDropSodaCanSound = Instant.now();

  public VendingMachineOffer(
      VendingMachineBlock vendingMachineBlock, Player player, BlockPos blockPos) {
    this.vendingMachineBlock = vendingMachineBlock;
    this.tradingPlayer = player;
    this.blockPos = blockPos;
    this.isClientSide = player.getLevel().isClientSide();

    if (VendingMachineOffers.needsUpdate(this.vendingMachineBlock, this.blockPos)) {
      Constants.LOG.debug(
          "Update Vending Machine Offers for {} at {} from {}",
          this,
          this.blockPos,
          this.tradingPlayer);
      VendingMachineOffers.setNeedsUpdate(this.blockPos, false);
    }
    this.merchantOffers =
        VendingMachineOffers.getVendingMachineOffers(this.vendingMachineBlock, this.blockPos);
    if (this.merchantOffers == null || this.merchantOffers.isEmpty()) {
      Constants.LOG.error(
          "No Vending Machine Offers found for {} at {} from {}",
          this,
          this.blockPos,
          this.tradingPlayer);
    }
  }

  public void openVendingMachineOfferScreen() {
    // Open Vending Machine Offers screen
    OptionalInt menuId =
        this.tradingPlayer.openMenu(
            new SimpleMenuProvider(
                (containerId, inventory, merchant) ->
                    new VendingMachineMenu(containerId, inventory, this, this.getOffers()),
                vendingMachineBlock.getName()));
    if (menuId.isPresent() && this.getOffers() != null) {
      Constants.LOG.debug(
          "Open Vending Machine Offer screen {} for {} with {} from {}",
          menuId.getAsInt(),
          this,
          this.getOffers(),
          this.tradingPlayer);
      this.tradingPlayer.sendMerchantOffers(
          menuId.getAsInt(),
          this.getOffers(),
          Entity.BASE_TICKS_REQUIRED_TO_FREEZE,
          this.getVillagerXp(),
          this.showProgressBar(),
          this.canRestock());
    }
  }

  public void overrideXp(int experience) {
    // Unused for now.
  }

  public Player getTradingPlayer() {
    return this.tradingPlayer;
  }

  public void setTradingPlayer(@Nullable Player player) {
    this.tradingPlayer = player;
  }

  public boolean showProgressBar() {
    return false;
  }

  public int getVillagerXp() {
    return 0;
  }

  @Nullable
  public MerchantOffers getOffers() {
    return this.merchantOffers;
  }

  @Override
  public void overrideOffers(MerchantOffers merchantOffers) {
    // Unused for now.
  }

  public void notifyTrade(MerchantOffer merchantOffer) {
    merchantOffer.increaseUses();

    // Play drop soda can sound, but only once per second.
    Player player = this.getTradingPlayer();
    if (player instanceof ServerPlayer serverPlayer
        && this.lastDropSodaCanSound.getEpochSecond() != Instant.now().getEpochSecond()) {
      BlockPos playerBlockPos = serverPlayer.blockPosition();
      BuiltInRegistries.SOUND_EVENT
          .getOptional(new ResourceLocation("trank_o_mat:drop_soda_can"))
          .ifPresent(
              soundEvent ->
                  serverPlayer
                      .getLevel()
                      .playSound(
                          null,
                          playerBlockPos.getX(),
                          playerBlockPos.getY(),
                          playerBlockPos.getZ(),
                          soundEvent,
                          SoundSource.NEUTRAL,
                          0.5F,
                          serverPlayer.getLevel().random.nextFloat() * 0.1F + 0.9F));
      this.lastDropSodaCanSound = Instant.now();
    }
  }

  public void notifyTradeUpdated(ItemStack itemStack) {
    // Unused for now.
  }

  protected SoundEvent getTradeUpdatedSound(boolean yesSound) {
    return yesSound ? SoundEvents.VILLAGER_YES : SoundEvents.VILLAGER_NO;
  }

  public SoundEvent getNotifyTradeSound() {
    return SoundEvents.VILLAGER_YES;
  }

  public BlockPos getBlockPos() {
    return this.blockPos;
  }

  public VendingMachineBlock getVendingMachineBlock() {
    return this.vendingMachineBlock;
  }

  @Override
  public boolean isClientSide() {
    return this.isClientSide;
  }
}
