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
    output.accept(ModItems.BLACK_SODA);
    output.accept(ModItems.BLUE_SODA);
    output.accept(ModItems.BROWN_SODA);
    output.accept(ModItems.CYAN_SODA);
    output.accept(ModItems.GRAY_SODA);
    output.accept(ModItems.GREEN_SODA);
    output.accept(ModItems.LIGHT_BLUE_SODA);
    output.accept(ModItems.LIGHT_GRAY_SODA);
    output.accept(ModItems.LIME_SODA);
    output.accept(ModItems.MAGENTA_SODA);
    output.accept(ModItems.ORANGE_SODA);
    output.accept(ModItems.PINK_SODA);
    output.accept(ModItems.PURPLE_SODA);
    output.accept(ModItems.RED_SODA);
    output.accept(ModItems.WHITE_SODA);
    output.accept(ModItems.YELLOW_SODA);

    output.accept(ModItems.VITA_AQUA_SODA);
    output.accept(ModItems.SPEEDY_SODA);
    output.accept(ModItems.SODA_LIGHT_SODA);
    output.accept(ModItems.CATERPILLAR_SODA);
    output.accept(ModItems.HASTY_ALE_SODA);
    output.accept(ModItems.WITHER_ALE_SODA);
    output.accept(ModItems.CATS_COKE_SODA);
    output.accept(ModItems.FIERY_CITRON_JUICE_SODA);
    output.accept(ModItems.POSEIDONS_TONIC_WATER_SODA);
    output.accept(ModItems.HADES_LEMONADE_SODA);
    output.accept(ModItems.GUARDIANS_CORAL_JUICE_SODA);
    output.accept(ModItems.WITCHES_ROOT_BEER_SODA);
    output.accept(ModItems.ARONS_GRAPE_JUICE_SODA);
    output.accept(ModItems.KAWORRUS_FAVOURITE_COKE_SODA);
    output.accept(ModItems.VILLAGERS_ALE_SODA);
    output.accept(ModItems.ILLAGERS_COKE_SODA);
    output.accept(ModItems.PLUTONIUM_LEMONADE_SODA);
    output.accept(ModItems.WANDERS_ALE_SODA);
    output.accept(ModItems.MINERS_JUICE_SODA);
    output.accept(ModItems.WARRIORS_LEMONADE_SODA);
    output.accept(ModItems.HOLY_SODA);
    output.accept(ModItems.UNHOLY_SODA);

    output.accept(ModItems.SODA_CAN_EMPTY);
    output.accept(ModItems.SODA_CAN_EMPTY_BLACK);
    output.accept(ModItems.SODA_CAN_EMPTY_BLUE);
    output.accept(ModItems.SODA_CAN_EMPTY_BROWN);
    output.accept(ModItems.SODA_CAN_EMPTY_CYAN);
    output.accept(ModItems.SODA_CAN_EMPTY_GRAY);
    output.accept(ModItems.SODA_CAN_EMPTY_GREEN);
    output.accept(ModItems.SODA_CAN_EMPTY_LIGHT_BLUE);
    output.accept(ModItems.SODA_CAN_EMPTY_LIGHT_GRAY);
    output.accept(ModItems.SODA_CAN_EMPTY_LIME);
    output.accept(ModItems.SODA_CAN_EMPTY_MAGENTA);
    output.accept(ModItems.SODA_CAN_EMPTY_ORANGE);
    output.accept(ModItems.SODA_CAN_EMPTY_PINK);
    output.accept(ModItems.SODA_CAN_EMPTY_PURPLE);
    output.accept(ModItems.SODA_CAN_EMPTY_RED);
    output.accept(ModItems.SODA_CAN_EMPTY_WHITE);
    output.accept(ModItems.SODA_CAN_EMPTY_YELLOW);
  }
}
