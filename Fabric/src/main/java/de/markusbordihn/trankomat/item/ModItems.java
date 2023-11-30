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

package de.markusbordihn.trankomat.item;

import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.blocks.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {

  public static final Item BLACK_SODA = SodaCanItems.getBlackSodaCanItem(new Item.Properties());
  public static final Item BLUE_SODA = SodaCanItems.getBlueSodaCanItem(new Item.Properties());
  public static final Item BROWN_SODA = SodaCanItems.getBrownSodaCanItem(new Item.Properties());
  public static final Item CYAN_SODA = SodaCanItems.getCyanSodaCanItem(new Item.Properties());
  public static final Item GRAY_SODA = SodaCanItems.getGraySodaCanItem(new Item.Properties());
  public static final Item GREEN_SODA = SodaCanItems.getGreenSodaCanItem(new Item.Properties());
  public static final Item LIGHT_BLUE_SODA =
      SodaCanItems.getLightBlueSodaCanItem(new Item.Properties());
  public static final Item LIGHT_GRAY_SODA =
      SodaCanItems.getLightGraySodaCanItem(new Item.Properties());
  public static final Item LIME_SODA = SodaCanItems.getLimeSodaCanItem(new Item.Properties());
  public static final Item MAGENTA_SODA = SodaCanItems.getMagentaSodaCanItem(new Item.Properties());
  public static final Item ORANGE_SODA = SodaCanItems.getOrangeSodaCanItem(new Item.Properties());
  public static final Item PINK_SODA = SodaCanItems.getPinkSodaCanItem(new Item.Properties());
  public static final Item PURPLE_SODA = SodaCanItems.getPurpleSodaCanItem(new Item.Properties());
  public static final Item RED_SODA = SodaCanItems.getRedSodaCanItem(new Item.Properties());
  public static final Item WHITE_SODA = SodaCanItems.getWhiteSodaCanItem(new Item.Properties());
  public static final Item YELLOW_SODA = SodaCanItems.getYellowSodaCanItem(new Item.Properties());

  public static final Item VITA_AQUA_SODA =
      SodaCanItems.getVitaAquaSodaCanItem(new Item.Properties());
  public static final Item SPEEDY_SODA = SodaCanItems.getSpeedySodaCanItem(new Item.Properties());
  public static final Item SODA_LIGHT_SODA =
      SodaCanItems.getSodaLightSodaCanItem(new Item.Properties());
  public static final Item CATERPILLAR_SODA =
      SodaCanItems.getCaterpillarSodaCanItem(new Item.Properties());
  public static final Item HASTY_ALE_SODA =
      SodaCanItems.getHastyAleSodaCanItem(new Item.Properties());
  public static final Item WITHER_ALE_SODA =
      SodaCanItems.getWitherAleSodaCanItem(new Item.Properties());
  public static final Item CATS_COKE_SODA =
      SodaCanItems.getCatsCokeSodaCanItem(new Item.Properties());
  public static final Item FIERY_CITRON_JUICE_SODA =
      SodaCanItems.getFieryCitronJuiceSodaCanItem(new Item.Properties());
  public static final Item POSEIDONS_TONIC_WATER_SODA =
      SodaCanItems.getPoseidonsTonicWaterSodaCanItem(new Item.Properties());
  public static final Item HADES_LEMONADE_SODA =
      SodaCanItems.getHadesLemonadeSodaCanItem(new Item.Properties());
  public static final Item GUARDIANS_CORAL_JUICE_SODA =
      SodaCanItems.getGuardiansCoralJuiceSodaCanItem(new Item.Properties());
  public static final Item WITCHES_ROOT_BEER_SODA =
      SodaCanItems.getWitchesRootBeerSodaCanItem(new Item.Properties());
  public static final Item ARONS_GRAPE_JUICE_SODA =
      SodaCanItems.getAronsGrapeJuiceSodaCanItem(new Item.Properties());
  public static final Item KAWORRUS_FAVOURITE_COKE_SODA =
      SodaCanItems.getKaworrusFavouriteCokeSodaCanItem(new Item.Properties());
  public static final Item VILLAGERS_ALE_SODA =
      SodaCanItems.getVillagersAleSodaCanItem(new Item.Properties());
  public static final Item ILLAGERS_COKE_SODA =
      SodaCanItems.getIllagersCokeSodaCanItem(new Item.Properties());
  public static final Item PLUTONIUM_LEMONADE_SODA =
      SodaCanItems.getPlutoniumLemonadeSodaCanItem(new Item.Properties());
  public static final Item WANDERS_ALE_SODA =
      SodaCanItems.getWandersAleSodaCanItem(new Item.Properties());
  public static final Item MINERS_JUICE_SODA =
      SodaCanItems.getMinersJuiceSodaCanItem(new Item.Properties());
  public static final Item WARRIORS_LEMONADE_SODA =
      SodaCanItems.getWarriorsLemonadeSodaCanItem(new Item.Properties());
  public static final Item HOLY_SODA = SodaCanItems.getHolySodaCanItem(new Item.Properties());
  public static final Item UNHOLY_SODA = SodaCanItems.getUnholySodaCanItem(new Item.Properties());

  public static final Item SODA_CAN_EMPTY =
      EmptySodaCanItems.getEmptySodaCanItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_BLACK =
      EmptySodaCanItems.getEmptySodaCanBlackItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_BLUE =
      EmptySodaCanItems.getEmptySodaCanBlueItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_BROWN =
      EmptySodaCanItems.getEmptySodaCanBrownItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_CYAN =
      EmptySodaCanItems.getEmptySodaCanCyanItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_GRAY =
      EmptySodaCanItems.getEmptySodaCanGrayItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_GREEN =
      EmptySodaCanItems.getEmptySodaCanGreenItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_LIGHT_BLUE =
      EmptySodaCanItems.getEmptySodaCanLightBlueItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_LIGHT_GRAY =
      EmptySodaCanItems.getEmptySodaCanLightGrayItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_LIME =
      EmptySodaCanItems.getEmptySodaCanLimeItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_MAGENTA =
      EmptySodaCanItems.getEmptySodaCanMagentaItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_ORANGE =
      EmptySodaCanItems.getEmptySodaCanOrangeItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_PINK =
      EmptySodaCanItems.getEmptySodaCanPinkItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_PURPLE =
      EmptySodaCanItems.getEmptySodaCanPurpleItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_RED =
      EmptySodaCanItems.getEmptySodaCanRedItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_WHITE =
      EmptySodaCanItems.getEmptySodaCanWhiteItem(new Item.Properties());
  public static final Item SODA_CAN_EMPTY_YELLOW =
      EmptySodaCanItems.getEmptySodaCanYellowItem(new Item.Properties());

  public static final BlockItem SODA_DEPOSIT_MACHINE_01 =
      new BlockItem(ModBlocks.SODA_DEPOSIT_MACHINE_01, new Item.Properties());
  public static final BlockItem VENDING_MACHINE =
      new BlockItem(ModBlocks.VENDING_MACHINE, new Item.Properties());
  public static final BlockItem SODA_VENDING_MACHINE_01 =
      new BlockItem(ModBlocks.SODA_VENDING_MACHINE_01, new Item.Properties());
  public static final BlockItem SODA_VENDING_MACHINE_02 =
      new BlockItem(ModBlocks.SODA_VENDING_MACHINE_02, new Item.Properties());

  protected ModItems() {}

  public static void registerModItems() {
    Constants.LOG.info("{} Soda Can Items ...", Constants.LOG_REGISTER_PREFIX);

    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "black_soda", BLACK_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "blue_soda", BLUE_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "brown_soda", BROWN_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "cyan_soda", CYAN_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "gray_soda", GRAY_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "green_soda", GREEN_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "light_blue_soda", LIGHT_BLUE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "light_gray_soda", LIGHT_GRAY_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "lime_soda", LIME_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "magenta_soda", MAGENTA_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "orange_soda", ORANGE_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "pink_soda", PINK_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "purple_soda", PURPLE_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "red_soda", RED_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "white_soda", WHITE_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "yellow_soda", YELLOW_SODA);

    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "vita_aqua_soda", VITA_AQUA_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "speedy_soda", SPEEDY_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "soda_light", SODA_LIGHT_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "caterpillar_soda", CATERPILLAR_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "hasty_ale", HASTY_ALE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "wither_ale", WITHER_ALE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "cats_coke", CATS_COKE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "fiery_citron_juice",
        FIERY_CITRON_JUICE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "poseidons_tonic_water",
        POSEIDONS_TONIC_WATER_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "hades_lemonade", HADES_LEMONADE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "guardians_coral_juice",
        GUARDIANS_CORAL_JUICE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "witches_root_beer",
        WITCHES_ROOT_BEER_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "arons_grape_juice",
        ARONS_GRAPE_JUICE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "kaworrus_favourite_coke",
        KAWORRUS_FAVOURITE_COKE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "villagers_ale", VILLAGERS_ALE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "illagers_coke", ILLAGERS_COKE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "plutonium_lemonade",
        PLUTONIUM_LEMONADE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "wanders_ale", WANDERS_ALE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "miners_juice", MINERS_JUICE_SODA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "warriors_lemonade",
        WARRIORS_LEMONADE_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "holy_soda", HOLY_SODA);
    Registry.register(BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "unholy_soda", UNHOLY_SODA);

    Constants.LOG.info("{} Empty Soda Can Items ...", Constants.LOG_REGISTER_PREFIX);

    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "soda_can_empty", SODA_CAN_EMPTY);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_black",
        SODA_CAN_EMPTY_BLACK);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_blue",
        SODA_CAN_EMPTY_BLUE);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_brown",
        SODA_CAN_EMPTY_BROWN);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_cyan",
        SODA_CAN_EMPTY_CYAN);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_gray",
        SODA_CAN_EMPTY_GRAY);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_green",
        SODA_CAN_EMPTY_GREEN);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_light_blue",
        SODA_CAN_EMPTY_LIGHT_BLUE);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_light_gray",
        SODA_CAN_EMPTY_LIGHT_GRAY);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_lime",
        SODA_CAN_EMPTY_LIME);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_magenta",
        SODA_CAN_EMPTY_MAGENTA);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_orange",
        SODA_CAN_EMPTY_ORANGE);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_pink",
        SODA_CAN_EMPTY_PINK);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_purple",
        SODA_CAN_EMPTY_PURPLE);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "soda_can_empty_red", SODA_CAN_EMPTY_RED);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_white",
        SODA_CAN_EMPTY_WHITE);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_can_empty_yellow",
        SODA_CAN_EMPTY_YELLOW);

    Constants.LOG.info("{} Block Items ...", Constants.LOG_REGISTER_PREFIX);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_deposit_machine_01",
        SODA_DEPOSIT_MACHINE_01);
    Registry.register(
        BuiltInRegistries.ITEM, Constants.MOD_ID_PREFIX + "vending_machine", VENDING_MACHINE);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_vending_machine_01",
        SODA_VENDING_MACHINE_01);
    Registry.register(
        BuiltInRegistries.ITEM,
        Constants.MOD_ID_PREFIX + "soda_vending_machine_02",
        SODA_VENDING_MACHINE_02);
  }
}
