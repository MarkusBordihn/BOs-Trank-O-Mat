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

import de.markusbordihn.trankomat.item.ModItems;
import net.minecraft.world.item.CreativeModeTab.DisplayItemsGenerator;
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters;
import net.minecraft.world.item.CreativeModeTab.Output;

public class SodaCanItems implements DisplayItemsGenerator {

  protected SodaCanItems() {}

  @Override
  public void accept(ItemDisplayParameters itemDisplayParameters, Output output) {
    output.accept(ModItems.BLACK_SODA.get());
    output.accept(ModItems.BLUE_SODA.get());
    output.accept(ModItems.BROWN_SODA.get());
    output.accept(ModItems.CYAN_SODA.get());
    output.accept(ModItems.GRAY_SODA.get());
    output.accept(ModItems.GREEN_SODA.get());
    output.accept(ModItems.LIGHT_BLUE_SODA.get());
    output.accept(ModItems.LIGHT_GRAY_SODA.get());
    output.accept(ModItems.LIME_SODA.get());
    output.accept(ModItems.MAGENTA_SODA.get());
    output.accept(ModItems.ORANGE_SODA.get());
    output.accept(ModItems.PINK_SODA.get());
    output.accept(ModItems.PURPLE_SODA.get());
    output.accept(ModItems.RED_SODA.get());
    output.accept(ModItems.WHITE_SODA.get());
    output.accept(ModItems.YELLOW_SODA.get());

    output.accept(ModItems.VITA_AQUA_SODA.get());
    output.accept(ModItems.SPEEDY_SODA.get());
    output.accept(ModItems.SODA_LIGHT_SODA.get());
    output.accept(ModItems.CATERPILLAR_SODA.get());
    output.accept(ModItems.HASTY_ALE_SODA.get());
    output.accept(ModItems.WITHER_ALE_SODA.get());
    output.accept(ModItems.CATS_COKE_SODA.get());
    output.accept(ModItems.FIERY_CITRON_JUICE_SODA.get());
    output.accept(ModItems.POSEIDONS_TONIC_WATER_SODA.get());
    output.accept(ModItems.HADES_LEMONADE_SODA.get());
    output.accept(ModItems.GUARDIANS_CORAL_JUICE_SODA.get());
    output.accept(ModItems.WITCHES_ROOT_BEER_SODA.get());
    output.accept(ModItems.ARONS_GRAPE_JUICE_SODA.get());
    output.accept(ModItems.KAWORRUS_FAVOURITE_COKE_SODA.get());
    output.accept(ModItems.VILLAGERS_ALE_SODA.get());
    output.accept(ModItems.ILLAGERS_COKE_SODA.get());
    output.accept(ModItems.PLUTONIUM_LEMONADE_SODA.get());
    output.accept(ModItems.WANDERS_ALE_SODA.get());
    output.accept(ModItems.MINERS_JUICE_SODA.get());
    output.accept(ModItems.WARRIORS_LEMONADE_SODA.get());
    output.accept(ModItems.HOLY_SODA.get());
    output.accept(ModItems.UNHOLY_SODA.get());

    output.accept(ModItems.EMPTY_SODA_CAN.get());
    output.accept(ModItems.EMPTY_SODA_CAN_BLACK.get());
    output.accept(ModItems.EMPTY_SODA_CAN_BLUE.get());
    output.accept(ModItems.EMPTY_SODA_CAN_BROWN.get());
    output.accept(ModItems.EMPTY_SODA_CAN_CYAN.get());
    output.accept(ModItems.EMPTY_SODA_CAN_GRAY.get());
    output.accept(ModItems.EMPTY_SODA_CAN_GREEN.get());
    output.accept(ModItems.EMPTY_SODA_CAN_LIGHT_BLUE.get());
    output.accept(ModItems.EMPTY_SODA_CAN_LIGHT_GRAY.get());
    output.accept(ModItems.EMPTY_SODA_CAN_LIME.get());
    output.accept(ModItems.EMPTY_SODA_CAN_MAGENTA.get());
    output.accept(ModItems.EMPTY_SODA_CAN_ORANGE.get());
    output.accept(ModItems.EMPTY_SODA_CAN_PINK.get());
    output.accept(ModItems.EMPTY_SODA_CAN_PURPLE.get());
    output.accept(ModItems.EMPTY_SODA_CAN_RED.get());
    output.accept(ModItems.EMPTY_SODA_CAN_WHITE.get());
    output.accept(ModItems.EMPTY_SODA_CAN_YELLOW.get());
  }
}
