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
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DepositMachineTopBlock extends Block {

  private static final VoxelShape SHAPE_NORTH = Block.box(0, 0, 8, 16, 16, 16);
  private static final VoxelShape SHAPE_EAST = Block.box(0, 0, 0, 8, 16, 16);
  private static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 0, 16, 16, 8);
  private static final VoxelShape SHAPE_WEST = Block.box(8, 0, 0, 16, 16, 16);
  private static final int LIGHT_LEVEL = 7;

  public DepositMachineTopBlock(BlockBehaviour.Properties properties) {
    super(properties);
    this.registerDefaultState(
        this.stateDefinition
            .any()
            .setValue(DepositMachineBlock.FACING, Direction.NORTH)
            .setValue(DepositMachineBlock.HALF, DoubleBlockHalf.UPPER));
  }

  public static int getLightLevel(BlockState blockState) {
    return LIGHT_LEVEL;
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockState) {
    blockState.add(DepositMachineBlock.FACING, DepositMachineBlock.HALF);
  }

  @Override
  public VoxelShape getShape(
      BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
    return switch (blockState.getValue(DepositMachineBlock.FACING)) {
      case EAST -> SHAPE_EAST;
      case SOUTH -> SHAPE_SOUTH;
      case WEST -> SHAPE_WEST;
      default -> SHAPE_NORTH;
    };
  }

  @Override
  public RenderShape getRenderShape(BlockState blockState) {
    return RenderShape.INVISIBLE;
  }

  @Override
  public void playerWillDestroy(
      Level level, BlockPos blockPos, BlockState blockState, Player player) {
    Constants.LOG.info("Player {} destroyed {}.", player.getName().getString(), blockState);
    super.playerWillDestroy(level, blockPos, blockState, player);
    BlockPos blockPosBelow = blockPos.below();
    BlockState blockStateBelow = level.getBlockState(blockPosBelow);
    if (blockStateBelow.getBlock() instanceof DepositMachineBlock) {
      level.setBlockAndUpdate(blockPosBelow, Blocks.AIR.defaultBlockState());
      level.levelEvent(player, 2001, blockPosBelow, Block.getId(blockStateBelow));
    }
  }

  @Override
  @Nullable
  public BlockState getStateForPlacement(BlockPlaceContext context) {
    return this.defaultBlockState()
        .setValue(DepositMachineBlock.FACING, context.getHorizontalDirection().getOpposite())
        .setValue(DepositMachineBlock.HALF, DoubleBlockHalf.UPPER);
  }

  @Override
  public InteractionResult use(
      BlockState blockState,
      Level level,
      BlockPos blockPos,
      Player player,
      InteractionHand hand,
      BlockHitResult hitResult) {
    BlockPos blockPosBelow = blockPos.below();
    BlockState blockStateBelow = level.getBlockState(blockPosBelow);
    if (blockStateBelow.getBlock() instanceof DepositMachineBlock depositMachineBlock) {
      return depositMachineBlock.use(
          blockStateBelow, level, blockPosBelow, player, hand, hitResult);
    }
    return InteractionResult.sidedSuccess(level.isClientSide);
  }

  @Override
  public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
    BlockPos blockPosBelow = blockPos.below();
    BlockState belowBlockState = levelReader.getBlockState(blockPosBelow);
    return belowBlockState.getValue(DepositMachineBlock.HALF) == DoubleBlockHalf.LOWER;
  }
}
