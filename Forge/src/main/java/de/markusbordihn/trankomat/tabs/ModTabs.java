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
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {

  public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
      DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

  protected static RegistryObject<CreativeModeTab> SODA_VENDING_MACHINES =
      CREATIVE_TABS.register(
          "soda_vending_machines",
          () ->
              CreativeModeTab.builder()
                  .icon(() -> ModItems.SODA_VENDING_MACHINE_01.get().getDefaultInstance())
                  .displayItems(new SodaVendingMachineItems())
                  .title(Component.translatable("itemGroup.trank_o_mat.soda_vending_machines"))
                  .build());

  protected static RegistryObject<CreativeModeTab> SODA_CANS =
      CREATIVE_TABS.register(
          "soda_cans",
          () ->
              CreativeModeTab.builder()
                  .icon(() -> ModItems.GRAY_SODA.get().getDefaultInstance())
                  .displayItems(new SodaCanItems())
                  .title(Component.translatable("itemGroup.trank_o_mat.soda_cans"))
                  .build());

  protected ModTabs() {}
}
