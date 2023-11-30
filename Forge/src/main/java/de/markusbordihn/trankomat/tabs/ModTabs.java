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

import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Output;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class ModTabs {

  protected static CreativeModeTab SODA_VENDING_MACHINES;

  protected static CreativeModeTab SODA_CANS;

  protected ModTabs() {}

  public static void handleCreativeModeTabRegister(CreativeModeTabEvent.Register event) {

    Constants.LOG.info("{} creative mod tabs ...", Constants.LOG_REGISTER_PREFIX);

    SODA_VENDING_MACHINES =
        event.registerCreativeModeTab(
            new ResourceLocation(Constants.MOD_ID, "mob_farm"),
            builder -> {
              builder
                  .icon(() -> new ItemStack(ModItems.SODA_VENDING_MACHINE_01.get()))
                  .displayItems(ModTabs::addSodaVendingMachines)
                  .title(Component.translatable("itemGroup.trank_o_mat.soda_vending_machines"))
                  .build();
            });
    SODA_CANS =
        event.registerCreativeModeTab(
            new ResourceLocation(Constants.MOD_ID, "tools"),
            builder -> {
              builder
                  .icon(() -> new ItemStack(ModItems.GRAY_SODA.get()))
                  .displayItems(ModTabs::addSodaCans)
                  .title(Component.translatable("itemGroup.trank_o_mat.soda_cans"))
                  .build();
            });
  }

  public static void addSodaVendingMachines(
      FeatureFlagSet featureFlagSet, Output outputTab, boolean hasPermissions) {
    outputTab.accept(ModItems.SOFA_DEPOSIT_MACHINE_01.get());
    outputTab.accept(ModItems.SODA_VENDING_MACHINE_01.get());
    outputTab.accept(ModItems.SODA_VENDING_MACHINE_02.get());
  }

  public static void addSodaCans(
      FeatureFlagSet featureFlagSet, Output outputTab, boolean hasPermissions) {
    outputTab.accept(ModItems.BLACK_SODA.get());
    outputTab.accept(ModItems.BLUE_SODA.get());
    outputTab.accept(ModItems.BROWN_SODA.get());
    outputTab.accept(ModItems.CYAN_SODA.get());
    outputTab.accept(ModItems.GRAY_SODA.get());
    outputTab.accept(ModItems.GREEN_SODA.get());
    outputTab.accept(ModItems.LIGHT_BLUE_SODA.get());
    outputTab.accept(ModItems.LIGHT_GRAY_SODA.get());
    outputTab.accept(ModItems.LIME_SODA.get());
    outputTab.accept(ModItems.MAGENTA_SODA.get());
    outputTab.accept(ModItems.ORANGE_SODA.get());
    outputTab.accept(ModItems.PINK_SODA.get());
    outputTab.accept(ModItems.PURPLE_SODA.get());
    outputTab.accept(ModItems.RED_SODA.get());
    outputTab.accept(ModItems.WHITE_SODA.get());
    outputTab.accept(ModItems.YELLOW_SODA.get());

    outputTab.accept(ModItems.VITA_AQUA_SODA.get());
    outputTab.accept(ModItems.SPEEDY_SODA.get());
    outputTab.accept(ModItems.SODA_LIGHT_SODA.get());
    outputTab.accept(ModItems.CATERPILLAR_SODA.get());
    outputTab.accept(ModItems.HASTY_ALE_SODA.get());
    outputTab.accept(ModItems.WITHER_ALE_SODA.get());
    outputTab.accept(ModItems.CATS_COKE_SODA.get());
    outputTab.accept(ModItems.FIERY_CITRON_JUICE_SODA.get());
    outputTab.accept(ModItems.POSEIDONS_TONIC_WATER_SODA.get());
    outputTab.accept(ModItems.HADES_LEMONADE_SODA.get());
    outputTab.accept(ModItems.GUARDIANS_CORAL_JUICE_SODA.get());
    outputTab.accept(ModItems.WITCHES_ROOT_BEER_SODA.get());
    outputTab.accept(ModItems.ARONS_GRAPE_JUICE_SODA.get());
    outputTab.accept(ModItems.KAWORRUS_FAVOURITE_COKE_SODA.get());
    outputTab.accept(ModItems.VILLAGERS_ALE_SODA.get());
    outputTab.accept(ModItems.ILLAGERS_COKE_SODA.get());
    outputTab.accept(ModItems.PLUTONIUM_LEMONADE_SODA.get());
    outputTab.accept(ModItems.WANDERS_ALE_SODA.get());
    outputTab.accept(ModItems.MINERS_JUICE_SODA.get());
    outputTab.accept(ModItems.WARRIORS_LEMONADE_SODA.get());
    outputTab.accept(ModItems.HOLY_SODA.get());
    outputTab.accept(ModItems.UNHOLY_SODA.get());

    outputTab.accept(ModItems.EMPTY_SODA_CAN.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_BLACK.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_BLUE.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_BROWN.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_CYAN.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_GRAY.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_GREEN.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_LIGHT_BLUE.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_LIGHT_GRAY.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_LIME.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_MAGENTA.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_ORANGE.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_PINK.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_PURPLE.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_RED.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_WHITE.get());
    outputTab.accept(ModItems.EMPTY_SODA_CAN_YELLOW.get());
  }
}
