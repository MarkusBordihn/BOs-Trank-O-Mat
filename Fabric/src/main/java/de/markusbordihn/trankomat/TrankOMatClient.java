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
import de.markusbordihn.trankomat.tabs.ModTabs;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class TrankOMatClient implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    // Use Fabric to bootstrap the Common mod.
    Constants.LOG.info("Initializing {} (Fabric-Client) ...", Constants.MOD_NAME);

    Constants.LOG.info("{} Tabs ...", Constants.LOG_REGISTER_PREFIX);
    ModTabs.registerModTabs();

    Constants.LOG.info("{} Block Layers ...", Constants.LOG_REGISTER_PREFIX);
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
  }
}
