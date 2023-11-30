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
import de.markusbordihn.trankomat.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class ModTabs {

  protected static CreativeModeTab SODA_VENDING_MACHINES;

  protected static CreativeModeTab SODA_CANS;

  protected ModTabs() {}

  public static void handleCreativeModeTabRegister(CreativeModeTabEvent.Register event) {

    Constants.LOG.info("{} creative mod tabs ...", Constants.LOG_REGISTER_PREFIX);

    SODA_VENDING_MACHINES =
        event.registerCreativeModeTab(
            new ResourceLocation(Constants.MOD_ID, "soda_vending_machines"),
            builder ->
                builder
                    .icon(() -> new ItemStack(ModItems.SODA_VENDING_MACHINE_01.get()))
                    .displayItems(new SodaVendingMachineItems())
                    .title(Component.translatable("itemGroup.trank_o_mat.soda_vending_machines"))
                    .build());
    SODA_CANS =
        event.registerCreativeModeTab(
            new ResourceLocation(Constants.MOD_ID, "soda_cans"),
            builder ->
                builder
                    .icon(() -> new ItemStack(ModItems.GRAY_SODA.get()))
                    .displayItems(new SodaCanItems())
                    .title(Component.translatable("itemGroup.trank_o_mat.soda_cans"))
                    .build());
  }
}
