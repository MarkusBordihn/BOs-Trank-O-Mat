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

package de.markusbordihn.trankomat.tabs;

import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.blocks.ModBlocks;
import de.markusbordihn.trankomat.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class ModTabs {

  private static final CreativeModeTab SODA_VENDING_MACHINES =
      FabricItemGroup.builder(new ResourceLocation(Constants.MOD_ID, "soda_vending_machines"))
          .icon(() -> ModBlocks.SODA_VENDING_MACHINE_01.asItem().getDefaultInstance())
          .build();
  private static final CreativeModeTab SODA_CANS =
      FabricItemGroup.builder(new ResourceLocation(Constants.MOD_ID, "soda_cans"))
          .icon(() -> ModItems.GRAY_SODA.asItem().getDefaultInstance())
          .build();

  protected ModTabs() {}

  public static void registerModTabs() {
    Constants.LOG.info("{} Soda Vending Machine Tabs ...", Constants.LOG_REGISTER_PREFIX);
    ItemGroupEvents.modifyEntriesEvent(SODA_VENDING_MACHINES)
        .register(
            content -> {
              content.accept(ModBlocks.SODA_VENDING_MACHINE_01.asItem().getDefaultInstance());
              content.accept(ModBlocks.SODA_VENDING_MACHINE_02.asItem().getDefaultInstance());
              content.accept(ModBlocks.SODA_DEPOSIT_MACHINE_01.asItem().getDefaultInstance());
              content.accept(ModBlocks.VENDING_MACHINE.asItem().getDefaultInstance());
            });

    Constants.LOG.info("{} Soda Can's Tabs ...", Constants.LOG_REGISTER_PREFIX);
    ItemGroupEvents.modifyEntriesEvent(SODA_CANS)
        .register(
            content -> {
              content.accept(ModItems.BLACK_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.BLUE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.BROWN_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.CYAN_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.GRAY_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.GREEN_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.LIGHT_BLUE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.LIGHT_GRAY_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.LIME_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.MAGENTA_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.ORANGE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.PINK_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.PURPLE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.RED_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.WHITE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.YELLOW_SODA.asItem().getDefaultInstance());

              content.accept(ModItems.VITA_AQUA_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.SPEEDY_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_LIGHT_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.CATERPILLAR_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.HASTY_ALE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.WITHER_ALE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.CATS_COKE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.FIERY_CITRON_JUICE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.POSEIDONS_TONIC_WATER_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.HADES_LEMONADE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.GUARDIANS_CORAL_JUICE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.WITCHES_ROOT_BEER_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.ARONS_GRAPE_JUICE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.KAWORRUS_FAVOURITE_COKE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.VILLAGERS_ALE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.ILLAGERS_COKE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.PLUTONIUM_LEMONADE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.WANDERS_ALE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.MINERS_JUICE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.WARRIORS_LEMONADE_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.HOLY_SODA.asItem().getDefaultInstance());
              content.accept(ModItems.UNHOLY_SODA.asItem().getDefaultInstance());

              content.accept(ModItems.SODA_CAN_EMPTY.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_BLACK.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_BLUE.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_BROWN.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_CYAN.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_GRAY.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_GREEN.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_LIGHT_BLUE.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_LIGHT_GRAY.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_LIME.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_MAGENTA.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_ORANGE.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_PINK.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_PURPLE.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_RED.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_WHITE.asItem().getDefaultInstance());
              content.accept(ModItems.SODA_CAN_EMPTY_YELLOW.asItem().getDefaultInstance());
            });
  }
}
