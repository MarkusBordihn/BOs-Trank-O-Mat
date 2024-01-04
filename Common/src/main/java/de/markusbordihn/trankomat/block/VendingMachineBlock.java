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

package de.markusbordihn.trankomat.block;

import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.data.VendingMachineOffer;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VendingMachineBlock extends Block {

  public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

  public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
  private static final VoxelShape SHAPE_NORTH = Block.box(0, 0, 8, 16, 16, 16);
  private static final VoxelShape SHAPE_EAST = Block.box(0, 0, 0, 8, 16, 16);
  private static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 0, 16, 16, 8);
  private static final VoxelShape SHAPE_WEST = Block.box(8, 0, 0, 16, 16, 16);
  private static final int LIGHT_LEVEL = 7;

  public VendingMachineBlock(BlockBehaviour.Properties properties) {
    super(properties);
    this.registerDefaultState(
        this.stateDefinition
            .any()
            .setValue(FACING, Direction.NORTH)
            .setValue(HALF, DoubleBlockHalf.LOWER));
  }

  public static int getLightLevel(BlockState blockState) {
    return LIGHT_LEVEL;
  }

  @Override
  public VoxelShape getShape(
      BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
    return switch (blockState.getValue(FACING)) {
      case EAST -> SHAPE_EAST;
      case SOUTH -> SHAPE_SOUTH;
      case WEST -> SHAPE_WEST;
      default -> SHAPE_NORTH;
    };
  }

  @Override
  @SuppressWarnings("java:S1874")
  public RenderShape getRenderShape(BlockState blockState) {
    return RenderShape.MODEL;
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockState) {
    blockState.add(FACING, HALF);
  }

  @Override
  @Nullable
  public BlockState getStateForPlacement(BlockPlaceContext context) {
    BlockPos blockPos = context.getClickedPos();
    Level level = context.getLevel();
    if (level.getBlockState(blockPos.below()).isAir()) {
      return null;
    }
    if (blockPos.getY() < level.getMaxBuildHeight() - 1
        && level.getBlockState(blockPos.above()).canBeReplaced(context)) {
      return this.defaultBlockState()
          .setValue(VendingMachineBlock.FACING, context.getHorizontalDirection().getOpposite())
          .setValue(HALF, DoubleBlockHalf.LOWER);
    }
    return null;
  }

  @Override
  public void setPlacedBy(
      Level level,
      BlockPos blockPos,
      BlockState blockState,
      LivingEntity livingEntity,
      ItemStack itemStack) {
    BlockState topBlockState =
        BuiltInRegistries.BLOCK
            .get(new ResourceLocation("trank_o_mat:vending_machine_top"))
            .defaultBlockState();
    level.setBlock(
        blockPos.above(), topBlockState.setValue(FACING, blockState.getValue(FACING)), 3);
  }

  @Override
  public BlockState playerWillDestroy(
      Level level, BlockPos blockPos, BlockState blockState, Player player) {
    blockState = super.playerWillDestroy(level, blockPos, blockState, player);
    BlockPos blockPosAbove = blockPos.above();
    BlockState blockStateAbove = level.getBlockState(blockPosAbove);
    if (blockStateAbove.getBlock() instanceof VendingMachineTopBlock) {
      level.setBlock(blockPosAbove, Blocks.AIR.defaultBlockState(), 35);
      level.levelEvent(player, 2001, blockPosAbove, Block.getId(blockStateAbove));
    }
    return blockState;
  }

  @Override
  public InteractionResult use(
      BlockState blockState,
      Level level,
      BlockPos blockPos,
      Player player,
      InteractionHand hand,
      BlockHitResult hitResult) {

    // Store side for additional server and client side effects.
    if (player.level().isClientSide()) {
      Constants.LOG.debug(
          "Player {} used {} with hand {} at {}.",
          player.getName().getString(),
          blockState.getBlock().getName().getString(),
          hand.name(),
          blockPos);
    }

    // Open trading screen
    if (player instanceof ServerPlayer serverPlayer && hand == InteractionHand.MAIN_HAND) {
      VendingMachineOffer vendingMachineOffer =
          new VendingMachineOffer(this, serverPlayer, blockPos);
      vendingMachineOffer.openVendingMachineOfferScreen();
      return InteractionResult.CONSUME;
    }

    return InteractionResult.sidedSuccess(level.isClientSide());
  }
}
