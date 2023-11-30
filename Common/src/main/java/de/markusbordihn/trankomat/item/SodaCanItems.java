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

import de.markusbordihn.trankomat.data.SodaCanTier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class SodaCanItems {

  protected SodaCanItems() {}

  public static SodaCanItem getBlackSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.BLACK,
        new MobEffectInstance(MobEffects.BLINDNESS, 600, 1, false, false));
  }

  public static SodaCanItem getBlueSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.BLUE,
        new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 1, false, false));
  }

  public static SodaCanItem getBrownSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.BROWN,
        new MobEffectInstance(MobEffects.HUNGER, 600, 1, false, false));
  }

  public static SodaCanItem getCyanSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.CYAN,
        new MobEffectInstance(MobEffects.CONFUSION, 600, 1, false, false));
  }

  public static SodaCanItem getGraySodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.GRAY,
        new MobEffectInstance(MobEffects.UNLUCK, 600, 1, false, false));
  }

  public static SodaCanItem getGreenSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.GREEN,
        new MobEffectInstance(MobEffects.POISON, 600, 1, false, false));
  }

  public static SodaCanItem getLightBlueSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.LIGHT_BLUE,
        new MobEffectInstance(MobEffects.INVISIBILITY, 600, 1, false, false));
  }

  public static SodaCanItem getLightGraySodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.LIGHT_GRAY,
        new MobEffectInstance(MobEffects.WEAKNESS, 600, 1, false, false));
  }

  public static SodaCanItem getLimeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.JUMP, 600, 1, false, false));
  }

  public static SodaCanItem getMagentaSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.MAGENTA,
        new MobEffectInstance(MobEffects.LEVITATION, 600, 1, false, false));
  }

  public static SodaCanItem getOrangeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, false));
  }

  public static SodaCanItem getPinkSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.PINK,
        new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 1, false, false));
  }

  public static SodaCanItem getPurpleSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.PURPLE,
        new MobEffectInstance(MobEffects.REGENERATION, 600, 1, false, false));
  }

  public static SodaCanItem getRedSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.RED,
        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1, false, false));
  }

  public static SodaCanItem getWhiteSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.WHITE,
        new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1, false, false));
  }

  public static SodaCanItem getYellowSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.LUCK, 600, 1, false, false));
  }

  public static SodaCanItem getVitaAquaSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.CYAN,
        new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 1, false, false));
  }

  public static SodaCanItem getSpeedySodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.LIGHT_BLUE,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 1, false, false));
  }

  public static SodaCanItem getSodaLightSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.RED,
        new MobEffectInstance(MobEffects.GLOWING, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.LEVITATION, 1200, 1, false, false));
  }

  public static SodaCanItem getCaterpillarSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.HUNGER, 2400, 1, false, false));
  }

  public static SodaCanItem getHastyAleSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1, false, false));
  }

  public static SodaCanItem getWitherAleSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.BLACK,
        new MobEffectInstance(MobEffects.WITHER, 1200, 1, false, false));
  }

  public static SodaCanItem getCatsCokeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.PINK,
        new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.SLOW_FALLING, 1200, 1, false, false));
  }

  public static SodaCanItem getFieryCitronJuiceSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 1, false, false));
  }

  public static SodaCanItem getPoseidonsTonicWaterSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.LIGHT_BLUE,
        new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 1, false, false));
  }

  public static SodaCanItem getHadesLemonadeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.BLACK,
        new MobEffectInstance(MobEffects.LEVITATION, 2500, 1, false, false),
        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.WITHER, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.BAD_OMEN, 24000, 1, false, false),
        new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.UNLUCK, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.SATURATION, 36000, 1, false, false));
  }

  public static SodaCanItem getGuardiansCoralJuiceSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.CYAN,
        new MobEffectInstance(MobEffects.CONDUIT_POWER, 2400, 1, false, false));
  }

  public static SodaCanItem getWitchesRootBeerSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.JUMP, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.REGENERATION, 1200, 1, false, false));
  }

  public static SodaCanItem getAronsGrapeJuiceSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.GRAY,
        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 1, false, false));
  }

  public static SodaCanItem getKaworrusFavouriteCokeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.SATURATION, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.HEALTH_BOOST, 2400, 2, false, false));
  }

  public static SodaCanItem getVillagersAleSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIGHT_GRAY,
        new MobEffectInstance(MobEffects.LUCK, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 2400, 1, false, false));
  }

  public static SodaCanItem getIllagersCokeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIGHT_GRAY,
        new MobEffectInstance(MobEffects.UNLUCK, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.BAD_OMEN, 2400, 1, false, false));
  }

  public static SodaCanItem getPlutoniumLemonadeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.SATURATION, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.POISON, 24000, 2, false, false));
  }

  public static SodaCanItem getWandersAleSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_3,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 1, false, false));
  }

  public static SodaCanItem getMinersJuiceSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_3,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.LUCK, 3600, 1, false, false));
  }

  public static SodaCanItem getWarriorsLemonadeSodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_3,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.ABSORPTION, 3600, 1, false, false));
  }

  public static SodaCanItem getHolySodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_4,
        DyeColor.LIGHT_BLUE,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.HEAL, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.JUMP, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.LUCK, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.SATURATION, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.ABSORPTION, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 1, false, false));
  }

  public static SodaCanItem getUnholySodaCanItem(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_4,
        DyeColor.BLUE,
        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.HARM, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.HUNGER, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.WEAKNESS, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.POISON, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.WITHER, 2400, 0, false, false),
        new MobEffectInstance(MobEffects.UNLUCK, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.BAD_OMEN, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.CONFUSION, 4800, 2, false, false),
        new MobEffectInstance(MobEffects.LEVITATION, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.BLINDNESS, 3600, 1, false, false));
  }
}
