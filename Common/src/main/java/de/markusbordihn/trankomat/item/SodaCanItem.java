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

import com.google.common.collect.ImmutableList;
import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.data.SodaCanTier;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class SodaCanItem extends Item {

  private static final String OPEN_SODA_CAN_TAG = "open_soda_can";
  private final ImmutableList<MobEffectInstance> effects;
  private SodaCanTier tier = SodaCanTier.TIER_0;
  private DyeColor color = DyeColor.GRAY;

  public SodaCanItem(Item.Properties properties, MobEffectInstance... effects) {
    super(properties);
    this.effects = ImmutableList.copyOf(effects);
  }

  public SodaCanItem(
      Item.Properties properties, SodaCanTier tier, DyeColor color, MobEffectInstance... effects) {
    this(properties, effects);
    this.tier = tier;
    this.color = color;
  }

  public SodaCanTier getTier() {
    return this.tier;
  }

  public DyeColor getColor() {
    return this.color;
  }

  public Item getEmptySodaCanItem() {
    // Try to find empty soda can for the given color from registry
    Item registryItem =
        BuiltInRegistries.ITEM
            .getOptional(
                new ResourceLocation(
                    Constants.MOD_ID, "soda_can_empty_" + this.getColor().getName().toLowerCase()))
            .orElse(null);

    // Fallback to gray empty soda can or glass bottle
    if (registryItem == null) {
      return BuiltInRegistries.ITEM
          .getOptional(new ResourceLocation(Constants.MOD_ID, "soda_can_empty_gray"))
          .orElse(Items.GLASS_BOTTLE);
    }
    return registryItem;
  }

  public void startUsingItem(Level level, Player player, InteractionHand interactionHand) {
    if (!level.isClientSide) {
      return;
    }

    // Verify that the player is holding a soda can.
    ItemStack itemStack = player.getItemInHand(interactionHand);
    if (itemStack.isEmpty() || !(itemStack.getItem() instanceof SodaCanItem)) {
      return;
    }

    // Verify that the soda can is not already open.
    if (itemStack.getTag() != null && itemStack.getTag().getBoolean(OPEN_SODA_CAN_TAG)) {
      return;
    }

    // Play open soda can sound.
    BuiltInRegistries.SOUND_EVENT
        .getOptional(new ResourceLocation("trank_o_mat:open_soda_can"))
        .ifPresent(
            soundEvent ->
                player.playSound(soundEvent, 0.5F, level.random.nextFloat() * 0.1F + 0.9F));

    // Set open soda can tag.
    itemStack.getOrCreateTag().putBoolean(OPEN_SODA_CAN_TAG, true);
  }

  @Override
  public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
    // We only want to apply effects to players and not to other entities
    if (!(livingEntity instanceof Player)) {
      return itemStack;
    }

    // Start drinking animation
    if (livingEntity instanceof ServerPlayer serverPlayer) {
      CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, itemStack);
    }

    // Apply effects
    if (!level.isClientSide) {
      for (MobEffectInstance effect : this.effects) {
        if (effect.getEffect().isInstantenous()) {
          effect
              .getEffect()
              .applyInstantenousEffect(
                  livingEntity, livingEntity, livingEntity, effect.getAmplifier(), 1.0D);
        } else {
          livingEntity.addEffect(new MobEffectInstance(effect));
        }
      }
    }

    // Award advancement
    if (livingEntity instanceof ServerPlayer serverPlayer) {
      serverPlayer.awardStat(Stats.ITEM_USED.get(this));
      if (!serverPlayer.getAbilities().instabuild) {
        itemStack.shrink(1);
      }
    }

    // Add or drop empty soda can
    if (livingEntity instanceof ServerPlayer serverPlayer
        && !serverPlayer.getAbilities().instabuild) {
      ItemStack emptySodaCan = new ItemStack(this.getEmptySodaCanItem());
      if (!serverPlayer.getInventory().add(emptySodaCan)) {
        serverPlayer.drop(emptySodaCan, false);
      }
    }

    // Reset open soda can tag.
    if (level.isClientSide() && !itemStack.isEmpty()) {
      itemStack.getOrCreateTag().remove(OPEN_SODA_CAN_TAG);
    }

    // Finish drinking animation
    livingEntity.gameEvent(GameEvent.DRINK);

    return itemStack;
  }

  @Override
  public InteractionResultHolder<ItemStack> use(
      Level level, Player player, InteractionHand interactionHand) {
    this.startUsingItem(level, player, interactionHand);
    return ItemUtils.startUsingInstantly(level, player, interactionHand);
  }

  @Override
  public int getUseDuration(ItemStack itemStack) {
    return 64;
  }

  @Override
  public UseAnim getUseAnimation(ItemStack itemStack) {
    return UseAnim.DRINK;
  }

  @Override
  public void appendHoverText(
      ItemStack itemStack,
      @Nullable Level level,
      List<Component> componentList,
      TooltipFlag tooltipFlag) {
    super.appendHoverText(itemStack, level, componentList, tooltipFlag);
    switch (this.getTier()) {
      case TIER_0:
        componentList.add(
            Component.translatable(
                    Constants.TEXT_PREFIX + "soda_can_tier", getTier().getTierLevel())
                .withStyle(ChatFormatting.GREEN));
        break;
      case TIER_1:
        componentList.add(
            Component.translatable(
                    Constants.TEXT_PREFIX + "soda_can_tier", getTier().getTierLevel())
                .withStyle(ChatFormatting.YELLOW));
        break;
      case TIER_2:
        componentList.add(
            Component.translatable(
                    Constants.TEXT_PREFIX + "soda_can_tier", getTier().getTierLevel())
                .withStyle(ChatFormatting.GOLD));
        break;
      case TIER_3:
        componentList.add(
            Component.translatable(
                    Constants.TEXT_PREFIX + "soda_can_tier", getTier().getTierLevel())
                .withStyle(ChatFormatting.RED));
        break;
      case TIER_4:
        componentList.add(
            Component.translatable(
                    Constants.TEXT_PREFIX + "soda_can_tier", getTier().getTierLevel())
                .withStyle(ChatFormatting.DARK_PURPLE));
        break;
      default:
        break;
    }
    componentList.add(
        Component.translatable(getDescriptionId() + ".description")
            .withStyle(net.minecraft.ChatFormatting.GRAY));
  }
}
