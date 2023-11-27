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
import de.markusbordihn.trankomat.tabs.ModTabs;
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
      ITEMS.register(
          "black_soda",
          () -> SodaCanItems.BLACK_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> BLUE_SODA =
      ITEMS.register(
          "blue_soda", () -> SodaCanItems.BLUE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> BROWN_SODA =
      ITEMS.register(
          "brown_soda",
          () -> SodaCanItems.BROWN_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> CYAN_SODA =
      ITEMS.register(
          "cyan_soda", () -> SodaCanItems.CYAN_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> GRAY_SODA =
      ITEMS.register(
          "gray_soda", () -> SodaCanItems.GRAY_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> GREEN_SODA =
      ITEMS.register(
          "green_soda",
          () -> SodaCanItems.GREEN_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> LIGHT_BLUE_SODA =
      ITEMS.register(
          "light_blue_soda",
          () -> SodaCanItems.LIGHT_BLUE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> LIGHT_GRAY_SODA =
      ITEMS.register(
          "light_gray_soda",
          () -> SodaCanItems.LIGHT_GRAY_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> LIME_SODA =
      ITEMS.register(
          "lime_soda", () -> SodaCanItems.LIME_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> MAGENTA_SODA =
      ITEMS.register(
          "magenta_soda",
          () -> SodaCanItems.MAGENTA_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> ORANGE_SODA =
      ITEMS.register(
          "orange_soda",
          () -> SodaCanItems.ORANGE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> PINK_SODA =
      ITEMS.register(
          "pink_soda", () -> SodaCanItems.PINK_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> PURPLE_SODA =
      ITEMS.register(
          "purple_soda",
          () -> SodaCanItems.PURPLE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> RED_SODA =
      ITEMS.register(
          "red_soda", () -> SodaCanItems.RED_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> WHITE_SODA =
      ITEMS.register(
          "white_soda",
          () -> SodaCanItems.WHITE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> YELLOW_SODA =
      ITEMS.register(
          "yellow_soda",
          () -> SodaCanItems.YELLOW_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));

  // Special Soda Cans
  public static final RegistryObject<Item> VITA_AQUA_SODA =
      ITEMS.register(
          "vita_aqua_soda",
          () -> SodaCanItems.VITA_AQUA_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> SPEEDY_SODA =
      ITEMS.register(
          "speedy_soda",
          () -> SodaCanItems.SPEEDY_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> SODA_LIGHT_SODA =
      ITEMS.register(
          "soda_light",
          () -> SodaCanItems.SODA_LIGHT_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> CATERPILLAR_SODA =
      ITEMS.register(
          "caterpillar_soda",
          () -> SodaCanItems.CATERPILLAR_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> HASTY_ALE_SODA =
      ITEMS.register(
          "hasty_ale",
          () -> SodaCanItems.HASTY_ALE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> WITHER_ALE_SODA =
      ITEMS.register(
          "wither_ale",
          () -> SodaCanItems.WITHER_ALE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> CATS_COKE_SODA =
      ITEMS.register(
          "cats_coke",
          () -> SodaCanItems.CATS_COKE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> FIERY_CITRON_JUICE_SODA =
      ITEMS.register(
          "fiery_citron_juice",
          () -> SodaCanItems.FIERY_CITRON_JUICE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> POSEIDONS_TONIC_WATER_SODA =
      ITEMS.register(
          "poseidons_tonic_water",
          () ->
              SodaCanItems.POSEIDONS_TONIC_WATER_SODA(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> HADES_LEMONADE_SODA =
      ITEMS.register(
          "hades_lemonade",
          () -> SodaCanItems.HADES_LEMONADE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> GUARDIANS_CAROL_JUICE_SODA =
      ITEMS.register(
          "guardians_carol_juice",
          () ->
              SodaCanItems.GUARDIANS_CAROL_JUICE_SODA(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> WITCHES_ROOT_BEER_SODA =
      ITEMS.register(
          "witches_root_beer",
          () -> SodaCanItems.WITCHES_ROOT_BEER_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> ARONS_GRAPE_JUICE_SODA =
      ITEMS.register(
          "arons_grape_juice",
          () -> SodaCanItems.ARONS_GRAPE_JUICE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> KAWORRUS_FAVOURITE_COKE_SODA =
      ITEMS.register(
          "kaworrus_favourite_coke",
          () ->
              SodaCanItems.KAWORRUS_FAVOURITE_COKE_SODA(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> VILLAGERS_ALE_SODA =
      ITEMS.register(
          "villagers_ale",
          () -> SodaCanItems.VILLAGERS_ALE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> ILLAGERS_COKE_SODA =
      ITEMS.register(
          "illagers_coke",
          () -> SodaCanItems.ILLAGERS_COKE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> PLUTONIUM_LEMONADE_SODA =
      ITEMS.register(
          "plutonium_lemonade",
          () -> SodaCanItems.PLUTONIUM_LEMONADE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> WANDERS_ALE_SODA =
      ITEMS.register(
          "wanders_ale",
          () -> SodaCanItems.WANDERS_ALE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> MINERS_JUICE_SODA =
      ITEMS.register(
          "miners_juice",
          () -> SodaCanItems.MINERS_JUICE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> WARRIORS_LEMONADE_SODA =
      ITEMS.register(
          "warriors_lemonade",
          () -> SodaCanItems.WARRIORS_LEMONADE_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> HOLY_SODA =
      ITEMS.register(
          "holy_soda", () -> SodaCanItems.HOLY_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> UNHOLY_SODA =
      ITEMS.register(
          "unholy_soda",
          () -> SodaCanItems.UNHOLY_SODA(new Item.Properties().tab(ModTabs.SODA_CANS)));

  // Empty Soda Cans
  public static final RegistryObject<Item> EMPTY_SODA_CAN =
      ITEMS.register(
          "soda_can_empty",
          () -> EmptySodaCanItems.EMPTY_SODA_CAN(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_BLACK =
      ITEMS.register(
          "soda_can_empty_black",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_BLACK(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_BLUE =
      ITEMS.register(
          "soda_can_empty_blue",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_BLUE(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_BROWN =
      ITEMS.register(
          "soda_can_empty_brown",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_BROWN(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_CYAN =
      ITEMS.register(
          "soda_can_empty_cyan",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_CYAN(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_GRAY =
      ITEMS.register(
          "soda_can_empty_gray",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_GRAY(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_GREEN =
      ITEMS.register(
          "soda_can_empty_green",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_GREEN(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_LIGHT_BLUE =
      ITEMS.register(
          "soda_can_empty_light_blue",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_LIGHT_BLUE(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_LIGHT_GRAY =
      ITEMS.register(
          "soda_can_empty_light_gray",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_LIGHT_GRAY(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_LIME =
      ITEMS.register(
          "soda_can_empty_lime",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_LIME(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_MAGENTA =
      ITEMS.register(
          "soda_can_empty_magenta",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_MAGENTA(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_ORANGE =
      ITEMS.register(
          "soda_can_empty_orange",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_ORANGE(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_PINK =
      ITEMS.register(
          "soda_can_empty_pink",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_PINK(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_PURPLE =
      ITEMS.register(
          "soda_can_empty_purple",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_PURPLE(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_RED =
      ITEMS.register(
          "soda_can_empty_red",
          () -> EmptySodaCanItems.EMPTY_SODA_CAN_RED(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_WHITE =
      ITEMS.register(
          "soda_can_empty_white",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_WHITE(new Item.Properties().tab(ModTabs.SODA_CANS)));
  public static final RegistryObject<Item> EMPTY_SODA_CAN_YELLOW =
      ITEMS.register(
          "soda_can_empty_yellow",
          () ->
              EmptySodaCanItems.EMPTY_SODA_CAN_YELLOW(
                  new Item.Properties().tab(ModTabs.SODA_CANS)));

  // Block Items
  public static final RegistryObject<Item> VENDING_MACHINE =
      ITEMS.register(
          "vending_machine",
          () ->
              new BlockItem(
                  ModBlocks.VENDING_MACHINE.get(),
                  new Item.Properties().tab(ModTabs.SODA_VENDING_MACHINES)));

  public static final RegistryObject<Item> SODA_VENDING_MACHINE_01 =
      ITEMS.register(
          "soda_vending_machine_01",
          () ->
              new BlockItem(
                  ModBlocks.SODA_VENDING_MACHINE_01.get(),
                  new Item.Properties().tab(ModTabs.SODA_VENDING_MACHINES)));
  public static final RegistryObject<Item> SODA_VENDING_MACHINE_02 =
      ITEMS.register(
          "soda_vending_machine_02",
          () ->
              new BlockItem(
                  ModBlocks.SODA_VENDING_MACHINE_02.get(),
                  new Item.Properties().tab(ModTabs.SODA_VENDING_MACHINES)));

  protected ModItems() {}
}
