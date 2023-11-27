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

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public enum SodaCanTier implements StringRepresentable {
  // @formatter:off
  TIER_0(0, 16, new ItemStack(Items.IRON_NUGGET, 5)),
  TIER_1(1, 8, new ItemStack(Items.IRON_NUGGET, 9)),
  TIER_2(2, 4, new ItemStack(Items.GOLD_NUGGET, 9), ItemStack.EMPTY),
  TIER_3(3, 2, new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY),
  TIER_4(4, 1, new ItemStack(Items.EMERALD, 10), ItemStack.EMPTY);
  // @formatter:on

  int tierLevel = 0;
  int maxUses = 16;
  ItemStack costA = ItemStack.EMPTY;
  ItemStack costB = ItemStack.EMPTY;

  SodaCanTier(int tierLevel, int maxUses, ItemStack cost) {
    this.tierLevel = tierLevel;
    this.maxUses = maxUses;
    this.costB = cost;
  }

  SodaCanTier(int tierLevel, int maxUses, ItemStack costA, ItemStack costB) {
    this.tierLevel = tierLevel;
    this.maxUses = maxUses;
    this.costA = costA;
    this.costB = costB;
  }

  public int getTierLevel() {
    return this.tierLevel;
  }

  public int getMaxUses() {
    return this.maxUses;
  }

  public ItemStack getCostA() {
    return this.costA.copy();
  }

  public ItemStack getCostB() {
    return this.costB.copy();
  }

  @Override
  public String getSerializedName() {
    return this.name().toLowerCase();
  }
}
