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

package de.markusbordihn.trankomat;

import de.markusbordihn.trankomat.block.SodaDepositMachineBlocks;
import de.markusbordihn.trankomat.block.SodaVendingMachineBlocks;
import de.markusbordihn.trankomat.blocks.ModBlocks;
import de.markusbordihn.trankomat.item.ModItems;
import de.markusbordihn.trankomat.sounds.ModSoundEvents;
import de.markusbordihn.trankomat.tabs.ModTabs;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.client.renderer.RenderType;

public class TrankOMat implements ModInitializer {

  @Override
  public void onInitialize() {
    // Use Fabric to bootstrap the Common mod.
    Constants.LOG.info("Initializing {} (Fabric) ...", Constants.MOD_NAME);
    CommonClass.init();

    Constants.LOG.info("{} Blocks ...", Constants.LOG_REGISTER_PREFIX);
    ModBlocks.registerModBlocks();

    Constants.LOG.info("{} Register Block Layers ...", Constants.LOG_REGISTER_PREFIX);
    BlockRenderLayerMap.INSTANCE.putBlock(
        SodaDepositMachineBlocks.DEPOSIT_MACHINE_TOP, RenderType.translucent());
    BlockRenderLayerMap.INSTANCE.putBlock(
        SodaDepositMachineBlocks.SODA_DEPOSIT_MACHINE_01, RenderType.cutoutMipped());

    BlockRenderLayerMap.INSTANCE.putBlock(
        SodaVendingMachineBlocks.VENDING_MACHINE_TOP, RenderType.translucent());
    BlockRenderLayerMap.INSTANCE.putBlock(
        SodaVendingMachineBlocks.SODA_VENDING_MACHINE_01, RenderType.cutoutMipped());
    BlockRenderLayerMap.INSTANCE.putBlock(
        SodaVendingMachineBlocks.SODA_VENDING_MACHINE_02, RenderType.cutoutMipped());

    Constants.LOG.info("{} Items ...", Constants.LOG_REGISTER_PREFIX);
    ModItems.registerModItems();

    Constants.LOG.info("{} Item Groups ...", Constants.LOG_REGISTER_PREFIX);
    ModTabs.registerModTabs();

    Constants.LOG.info("{} Sound Events ...", Constants.LOG_REGISTER_PREFIX);
    ModSoundEvents.registerModSoundEvents();

    // Some code like events require special initialization from the
    // loader specific code.
    ItemTooltipCallback.EVENT.register(CommonClass::onItemTooltip);
  }
}
