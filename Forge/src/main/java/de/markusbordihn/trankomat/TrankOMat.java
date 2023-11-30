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

import de.markusbordihn.trankomat.block.ModBlocks;
import de.markusbordihn.trankomat.item.ModItems;
import de.markusbordihn.trankomat.sounds.ModSoundEvents;
import de.markusbordihn.trankomat.tabs.ModTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class TrankOMat {

  public TrankOMat() {
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    // Use Forge to bootstrap the Common mod.
    Constants.LOG.info("Initializing {} (Forge) ...", Constants.MOD_NAME);
    CommonClass.init();

    Constants.LOG.info("{} Blocks ...", Constants.LOG_REGISTER_PREFIX);
    ModBlocks.BLOCKS.register(modEventBus);

    Constants.LOG.info("{} Items ...", Constants.LOG_REGISTER_PREFIX);
    ModItems.ITEMS.register(modEventBus);

    Constants.LOG.info("{} Sound Events ...", Constants.LOG_REGISTER_PREFIX);
    ModSoundEvents.SOUNDS.register(modEventBus);

    DistExecutor.unsafeRunWhenOn(
        Dist.CLIENT,
        () ->
            () -> {
              ModTabs.CREATIVE_TABS.register(modEventBus);
              MinecraftForge.EVENT_BUS.addListener(this::onItemTooltip);
            });
  }

  // This method exists as a wrapper for the code in the Common project.
  // It takes Forge's event object and passes the parameters along to
  // the Common listener.
  private void onItemTooltip(ItemTooltipEvent event) {
    CommonClass.onItemTooltip(event.getItemStack(), event.getFlags(), event.getToolTip());
  }
}
