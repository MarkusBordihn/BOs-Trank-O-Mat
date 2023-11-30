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
import de.markusbordihn.trankomat.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

  // Soda Cans
  public static final RegistryObject<Item> BLACK_SODA =
      ITEMS.register("black_soda", () -> SodaCanItems.getBlackSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> BLUE_SODA =
      ITEMS.register("blue_soda", () -> SodaCanItems.getBlueSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> BROWN_SODA =
      ITEMS.register("brown_soda", () -> SodaCanItems.getBrownSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> CYAN_SODA =
      ITEMS.register("cyan_soda", () -> SodaCanItems.getCyanSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> GRAY_SODA =
      ITEMS.register("gray_soda", () -> SodaCanItems.getGraySodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> GREEN_SODA =
      ITEMS.register("green_soda", () -> SodaCanItems.getGreenSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> LIGHT_BLUE_SODA =
      ITEMS.register(
          "light_blue_soda", () -> SodaCanItems.getLightBlueSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> LIGHT_GRAY_SODA =
      ITEMS.register(
          "light_gray_soda", () -> SodaCanItems.getLightGraySodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> LIME_SODA =
      ITEMS.register("lime_soda", () -> SodaCanItems.getLimeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> MAGENTA_SODA =
      ITEMS.register(
          "magenta_soda", () -> SodaCanItems.getMagentaSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> ORANGE_SODA =
      ITEMS.register("orange_soda", () -> SodaCanItems.getOrangeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> PINK_SODA =
      ITEMS.register("pink_soda", () -> SodaCanItems.getPinkSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> PURPLE_SODA =
      ITEMS.register("purple_soda", () -> SodaCanItems.getPurpleSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> RED_SODA =
      ITEMS.register("red_soda", () -> SodaCanItems.getRedSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> WHITE_SODA =
      ITEMS.register("white_soda", () -> SodaCanItems.getWhiteSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> YELLOW_SODA =
      ITEMS.register("yellow_soda", () -> SodaCanItems.getYellowSodaCanItem(new Item.Properties()));

  // Special Soda Cans
  public static final RegistryObject<Item> VITA_AQUA_SODA =
      ITEMS.register(
          "vita_aqua_soda", () -> SodaCanItems.getVitaAquaSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> SPEEDY_SODA =
      ITEMS.register("speedy_soda", () -> SodaCanItems.getSpeedySodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_LIGHT_SODA =
      ITEMS.register(
          "soda_light", () -> SodaCanItems.getSodaLightSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> CATERPILLAR_SODA =
      ITEMS.register(
          "caterpillar_soda", () -> SodaCanItems.getCaterpillarSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> HASTY_ALE_SODA =
      ITEMS.register("hasty_ale", () -> SodaCanItems.getHastyAleSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> WITHER_ALE_SODA =
      ITEMS.register(
          "wither_ale", () -> SodaCanItems.getWitherAleSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> CATS_COKE_SODA =
      ITEMS.register("cats_coke", () -> SodaCanItems.getCatsCokeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> FIERY_CITRON_JUICE_SODA =
      ITEMS.register(
          "fiery_citron_juice",
          () -> SodaCanItems.getFieryCitronJuiceSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> POSEIDONS_TONIC_WATER_SODA =
      ITEMS.register(
          "poseidons_tonic_water",
          () -> SodaCanItems.getPoseidonsTonicWaterSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> HADES_LEMONADE_SODA =
      ITEMS.register(
          "hades_lemonade", () -> SodaCanItems.getHadesLemonadeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> GUARDIANS_CORAL_JUICE_SODA =
      ITEMS.register(
          "guardians_coral_juice",
          () -> SodaCanItems.getGuardiansCoralJuiceSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> WITCHES_ROOT_BEER_SODA =
      ITEMS.register(
          "witches_root_beer",
          () -> SodaCanItems.getWitchesRootBeerSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> ARONS_GRAPE_JUICE_SODA =
      ITEMS.register(
          "arons_grape_juice",
          () -> SodaCanItems.getAronsGrapeJuiceSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> KAWORRUS_FAVOURITE_COKE_SODA =
      ITEMS.register(
          "kaworrus_favourite_coke",
          () -> SodaCanItems.getKaworrusFavouriteCokeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> VILLAGERS_ALE_SODA =
      ITEMS.register(
          "villagers_ale", () -> SodaCanItems.getVillagersAleSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> ILLAGERS_COKE_SODA =
      ITEMS.register(
          "illagers_coke", () -> SodaCanItems.getIllagersCokeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> PLUTONIUM_LEMONADE_SODA =
      ITEMS.register(
          "plutonium_lemonade",
          () -> SodaCanItems.getPlutoniumLemonadeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> WANDERS_ALE_SODA =
      ITEMS.register(
          "wanders_ale", () -> SodaCanItems.getWandersAleSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> MINERS_JUICE_SODA =
      ITEMS.register(
          "miners_juice", () -> SodaCanItems.getMinersJuiceSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> WARRIORS_LEMONADE_SODA =
      ITEMS.register(
          "warriors_lemonade",
          () -> SodaCanItems.getWarriorsLemonadeSodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> HOLY_SODA =
      ITEMS.register("holy_soda", () -> SodaCanItems.getHolySodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> UNHOLY_SODA =
      ITEMS.register("unholy_soda", () -> SodaCanItems.getUnholySodaCanItem(new Item.Properties()));

  // Empty Soda Cans
  public static final RegistryObject<Item> SODA_CAN_EMPTY =
      ITEMS.register(
          "soda_can_empty", () -> EmptySodaCanItems.getEmptySodaCanItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_BLACK =
      ITEMS.register(
          "soda_can_empty_black",
          () -> EmptySodaCanItems.getEmptySodaCanBlackItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_BLUE =
      ITEMS.register(
          "soda_can_empty_blue",
          () -> EmptySodaCanItems.getEmptySodaCanBlueItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_BROWN =
      ITEMS.register(
          "soda_can_empty_brown",
          () -> EmptySodaCanItems.getEmptySodaCanBrownItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_CYAN =
      ITEMS.register(
          "soda_can_empty_cyan",
          () -> EmptySodaCanItems.getEmptySodaCanCyanItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_GRAY =
      ITEMS.register(
          "soda_can_empty_gray",
          () -> EmptySodaCanItems.getEmptySodaCanGrayItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_GREEN =
      ITEMS.register(
          "soda_can_empty_green",
          () -> EmptySodaCanItems.getEmptySodaCanGreenItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_LIGHT_BLUE =
      ITEMS.register(
          "soda_can_empty_light_blue",
          () -> EmptySodaCanItems.getEmptySodaCanLightBlueItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_LIGHT_GRAY =
      ITEMS.register(
          "soda_can_empty_light_gray",
          () -> EmptySodaCanItems.getEmptySodaCanLightGrayItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_LIME =
      ITEMS.register(
          "soda_can_empty_lime",
          () -> EmptySodaCanItems.getEmptySodaCanLimeItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_MAGENTA =
      ITEMS.register(
          "soda_can_empty_magenta",
          () -> EmptySodaCanItems.getEmptySodaCanMagentaItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_ORANGE =
      ITEMS.register(
          "soda_can_empty_orange",
          () -> EmptySodaCanItems.getEmptySodaCanOrangeItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_PINK =
      ITEMS.register(
          "soda_can_empty_pink",
          () -> EmptySodaCanItems.getEmptySodaCanPinkItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_PURPLE =
      ITEMS.register(
          "soda_can_empty_purple",
          () -> EmptySodaCanItems.getEmptySodaCanPurpleItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_RED =
      ITEMS.register(
          "soda_can_empty_red",
          () -> EmptySodaCanItems.getEmptySodaCanRedItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_WHITE =
      ITEMS.register(
          "soda_can_empty_white",
          () -> EmptySodaCanItems.getEmptySodaCanWhiteItem(new Item.Properties()));
  public static final RegistryObject<Item> SODA_CAN_EMPTY_YELLOW =
      ITEMS.register(
          "soda_can_empty_yellow",
          () -> EmptySodaCanItems.getEmptySodaCanYellowItem(new Item.Properties()));

  // Block Items
  public static final RegistryObject<Item> SODA_DEPOSIT_MACHINE_01 =
      ITEMS.register(
          "soda_deposit_machine_01",
          () -> new BlockItem(ModBlocks.SODA_DEPOSIT_MACHINE_01.get(), new Item.Properties()));
  public static final RegistryObject<Item> VENDING_MACHINE =
      ITEMS.register(
          "vending_machine",
          () -> new BlockItem(ModBlocks.VENDING_MACHINE.get(), new Item.Properties()));

  public static final RegistryObject<Item> SODA_VENDING_MACHINE_01 =
      ITEMS.register(
          "soda_vending_machine_01",
          () -> new BlockItem(ModBlocks.SODA_VENDING_MACHINE_01.get(), new Item.Properties()));
  public static final RegistryObject<Item> SODA_VENDING_MACHINE_02 =
      ITEMS.register(
          "soda_vending_machine_02",
          () -> new BlockItem(ModBlocks.SODA_VENDING_MACHINE_02.get(), new Item.Properties()));

  protected ModItems() {}
}
