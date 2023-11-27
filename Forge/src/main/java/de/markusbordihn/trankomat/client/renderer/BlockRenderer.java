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

package de.markusbordihn.trankomat.client.renderer;

import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class BlockRenderer {

  protected BlockRenderer() {}

  public static void registerBlockRenderer(final FMLClientSetupEvent event) {
    Constants.LOG.info("{} Block Renderer ...", Constants.LOG_REGISTER_PREFIX);

    event.enqueueWork(
        () -> {
          ItemBlockRenderTypes.setRenderLayer(
              ModBlocks.VENDING_MACHINE_TOP.get(), RenderType.translucent());
          ItemBlockRenderTypes.setRenderLayer(
              ModBlocks.SODA_VENDING_MACHINE_01.get(), RenderType.cutoutMipped());
          ItemBlockRenderTypes.setRenderLayer(
              ModBlocks.SODA_VENDING_MACHINE_02.get(), RenderType.cutoutMipped());
        });
  }
}
