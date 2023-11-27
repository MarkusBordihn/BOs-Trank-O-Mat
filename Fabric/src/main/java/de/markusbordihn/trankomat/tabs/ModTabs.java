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
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;

public class ModTabs {

  protected ModTabs() {}

  public static void registerModTabs() {
    Constants.LOG.info("{} Soda Vending Machine Tabs ...", Constants.LOG_REGISTER_PREFIX);
    FabricItemGroupBuilder.create(new ResourceLocation(Constants.MOD_ID, "soda_vending_machines"))
        .icon(() -> ModBlocks.SODA_VENDING_MACHINE_01.asItem().getDefaultInstance())
        .appendItems(
            stack -> {
              stack.add(ModItems.SODA_VENDING_MACHINE_01.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_VENDING_MACHINE_02.asItem().getDefaultInstance());
            })
        .build();

    Constants.LOG.info("{} Soda Can's Tabs ...", Constants.LOG_REGISTER_PREFIX);
    FabricItemGroupBuilder.create(new ResourceLocation(Constants.MOD_ID, "soda_cans"))
        .icon(() -> ModItems.GRAY_SODA.asItem().getDefaultInstance())
        .appendItems(
            stack -> {
              stack.add(ModItems.BLACK_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.BLUE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.BROWN_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.CYAN_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.GRAY_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.GREEN_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.LIGHT_BLUE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.LIGHT_GRAY_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.LIME_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.MAGENTA_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.ORANGE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.PINK_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.PURPLE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.RED_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.WHITE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.YELLOW_SODA.asItem().getDefaultInstance());

              stack.add(ModItems.VITA_AQUA_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.SPEEDY_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_LIGHT_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.CATERPILLAR_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.HASTY_ALE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.WITHER_ALE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.CATS_COKE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.FIERY_CITRON_JUICE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.POSEIDONS_TONIC_WATER_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.HADES_LEMONADE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.GUARDIANS_CAROL_JUICE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.WITCHES_ROOT_BEER_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.ARONS_GRAPE_JUICE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.KAWORRUS_FAVOURITE_COKE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.VILLAGERS_ALE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.ILLAGERS_COKE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.PLUTONIUM_LEMONADE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.WANDERS_ALE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.MINERS_JUICE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.WARRIORS_LEMONADE_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.HOLY_SODA.asItem().getDefaultInstance());
              stack.add(ModItems.UNHOLY_SODA.asItem().getDefaultInstance());

              stack.add(ModItems.SODA_CAN_EMPTY.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_BLACK.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_BLUE.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_BROWN.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_CYAN.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_GRAY.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_GREEN.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_LIGHT_BLUE.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_LIGHT_GRAY.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_LIME.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_MAGENTA.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_ORANGE.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_PINK.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_PURPLE.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_RED.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_WHITE.asItem().getDefaultInstance());
              stack.add(ModItems.SODA_CAN_EMPTY_YELLOW.asItem().getDefaultInstance());
            })
        .build();
  }
}
