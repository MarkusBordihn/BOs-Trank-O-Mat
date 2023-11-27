/**
 * Copyright 2023 Markus Bordihn
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.markusbordihn.trankomat.tabs;

import de.markusbordihn.trankomat.Constants;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModTabs {

  public static final CreativeModeTab SODA_VENDING_MACHINES =
      new CreativeModeTab(-1, Constants.MOD_ID + ".soda_vending_machines") {
        public ItemStack makeIcon() {
          Item item =
              Registry.ITEM
                  .getOptional(new ResourceLocation(Constants.MOD_ID, "soda_vending_machine_01"))
                  .orElse(Items.BREWING_STAND);
          return new ItemStack(item);
        }
      };
  public static final CreativeModeTab SODA_CANS =
      new CreativeModeTab(-1, Constants.MOD_ID + ".soda_cans") {
        public ItemStack makeIcon() {
          Item item =
              Registry.ITEM
                  .getOptional(new ResourceLocation(Constants.MOD_ID, "gray_soda"))
                  .orElse(Items.POTION);
          return new ItemStack(item);
        }
      };

  protected ModTabs() {}
}
