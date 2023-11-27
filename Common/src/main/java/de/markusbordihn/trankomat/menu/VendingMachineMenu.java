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

package de.markusbordihn.trankomat.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.MerchantMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.Merchant;
import net.minecraft.world.item.trading.MerchantOffers;

public class VendingMachineMenu extends MerchantMenu {

  private final MerchantOffers merchantOffers;

  public VendingMachineMenu(
      int containerId, Inventory inventory, Merchant merchant, MerchantOffers merchantOffers) {
    super(containerId, inventory, merchant);
    this.merchantOffers = merchantOffers;
  }

  @Override
  public MerchantOffers getOffers() {
    return this.merchantOffers;
  }

  @Override
  public ItemStack quickMoveStack(Player player, int slotIndex) {
    ItemStack itemStack = ItemStack.EMPTY;
    Slot slot = this.slots.get(slotIndex);
    if (!slot.hasItem()) {
      return itemStack;
    }
    ItemStack slotItemStack = slot.getItem();
    itemStack = slotItemStack.copy();
    if (slotIndex == 2) {
      if (!this.moveItemStackTo(slotItemStack, 3, 39, true)) {
        return ItemStack.EMPTY;
      }
      slot.onQuickCraft(slotItemStack, itemStack);
    } else if (slotIndex != 0 && slotIndex != 1) {
      if (slotIndex >= 3 && slotIndex < 30) {
        if (!this.moveItemStackTo(slotItemStack, 30, 39, false)) {
          return ItemStack.EMPTY;
        }
      } else if (slotIndex >= 30
          && slotIndex < 39
          && !this.moveItemStackTo(slotItemStack, 3, 30, false)) {
        return ItemStack.EMPTY;
      }
    } else if (!this.moveItemStackTo(slotItemStack, 3, 39, false)) {
      return ItemStack.EMPTY;
    }

    if (slotItemStack.isEmpty()) {
      slot.set(ItemStack.EMPTY);
    } else {
      slot.setChanged();
    }

    if (slotItemStack.getCount() == itemStack.getCount()) {
      return ItemStack.EMPTY;
    }

    slot.onTake(player, slotItemStack);

    return itemStack;
  }
}
