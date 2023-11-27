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

  public static SodaCanItem BLACK_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.BLACK,
        new MobEffectInstance(MobEffects.BLINDNESS, 600, 1, false, false));
  }

  public static SodaCanItem BLUE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.BLUE,
        new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 1, false, false));
  }

  public static SodaCanItem BROWN_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.BROWN,
        new MobEffectInstance(MobEffects.HUNGER, 600, 1, false, false));
  }

  public static SodaCanItem CYAN_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.CYAN,
        new MobEffectInstance(MobEffects.CONFUSION, 600, 1, false, false));
  }

  public static SodaCanItem GRAY_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.GRAY,
        new MobEffectInstance(MobEffects.UNLUCK, 600, 1, false, false));
  }

  public static SodaCanItem GREEN_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.GREEN,
        new MobEffectInstance(MobEffects.POISON, 600, 1, false, false));
  }

  public static SodaCanItem LIGHT_BLUE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.LIGHT_BLUE,
        new MobEffectInstance(MobEffects.INVISIBILITY, 600, 1, false, false));
  }

  public static SodaCanItem LIGHT_GRAY_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.LIGHT_GRAY,
        new MobEffectInstance(MobEffects.WEAKNESS, 600, 1, false, false));
  }

  public static SodaCanItem LIME_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.JUMP, 600, 1, false, false));
  }

  public static SodaCanItem MAGENTA_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.MAGENTA,
        new MobEffectInstance(MobEffects.LEVITATION, 600, 1, false, false));
  }

  public static SodaCanItem ORANGE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, false));
  }

  public static SodaCanItem PINK_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.PINK,
        new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 1, false, false));
  }

  public static SodaCanItem PURPLE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.PURPLE,
        new MobEffectInstance(MobEffects.REGENERATION, 600, 1, false, false));
  }

  public static SodaCanItem RED_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.RED,
        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1, false, false));
  }

  public static SodaCanItem WHITE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.WHITE,
        new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1, false, false));
  }

  public static SodaCanItem YELLOW_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_0,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.LUCK, 600, 1, false, false));
  }

  public static SodaCanItem VITA_AQUA_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.CYAN,
        new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 1, false, false));
  }

  public static SodaCanItem SPEEDY_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.LIGHT_BLUE,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 1, false, false));
  }

  public static SodaCanItem SODA_LIGHT_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.RED,
        new MobEffectInstance(MobEffects.GLOWING, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.LEVITATION, 1200, 1, false, false));
  }

  public static SodaCanItem CATERPILLAR_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.HUNGER, 2400, 1, false, false));
  }

  public static SodaCanItem HASTY_ALE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1, false, false));
  }

  public static SodaCanItem WITHER_ALE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.BLACK,
        new MobEffectInstance(MobEffects.WITHER, 1200, 1, false, false));
  }

  public static SodaCanItem CATS_COKE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.PINK,
        new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.SLOW_FALLING, 1200, 1, false, false));
  }

  public static SodaCanItem FIERY_CITRON_JUICE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 1, false, false));
  }

  public static SodaCanItem POSEIDONS_TONIC_WATER_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.LIGHT_BLUE,
        new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 1, false, false));
  }

  public static SodaCanItem HADES_LEMONADE_SODA(Item.Properties properties) {
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

  public static SodaCanItem GUARDIANS_CAROL_JUICE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_1,
        DyeColor.CYAN,
        new MobEffectInstance(MobEffects.CONDUIT_POWER, 2400, 1, false, false));
  }

  public static SodaCanItem WITCHES_ROOT_BEER_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.JUMP, 1200, 1, false, false),
        new MobEffectInstance(MobEffects.REGENERATION, 1200, 1, false, false));
  }

  public static SodaCanItem ARONS_GRAPE_JUICE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.GRAY,
        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 1, false, false));
  }

  public static SodaCanItem KAWORRUS_FAVOURITE_COKE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.ORANGE,
        new MobEffectInstance(MobEffects.SATURATION, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.HEALTH_BOOST, 2400, 2, false, false));
  }

  public static SodaCanItem VILLAGERS_ALE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIGHT_GRAY,
        new MobEffectInstance(MobEffects.LUCK, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 2400, 1, false, false));
  }

  public static SodaCanItem ILLAGERS_COKE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIGHT_GRAY,
        new MobEffectInstance(MobEffects.UNLUCK, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.BAD_OMEN, 2400, 1, false, false));
  }

  public static SodaCanItem PLUTONIUM_LEMONADE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_2,
        DyeColor.LIME,
        new MobEffectInstance(MobEffects.SATURATION, 2400, 1, false, false),
        new MobEffectInstance(MobEffects.POISON, 24000, 2, false, false));
  }

  public static SodaCanItem WANDERS_ALE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_3,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 1, false, false));
  }

  public static SodaCanItem MINERS_JUICE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_3,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.LUCK, 3600, 1, false, false));
  }

  public static SodaCanItem WARRIORS_LEMONADE_SODA(Item.Properties properties) {
    return new SodaCanItem(
        properties.stacksTo(6),
        SodaCanTier.TIER_3,
        DyeColor.YELLOW,
        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 1, false, false),
        new MobEffectInstance(MobEffects.ABSORPTION, 3600, 1, false, false));
  }

  public static SodaCanItem HOLY_SODA(Item.Properties properties) {
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

  public static SodaCanItem UNHOLY_SODA(Item.Properties properties) {
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
