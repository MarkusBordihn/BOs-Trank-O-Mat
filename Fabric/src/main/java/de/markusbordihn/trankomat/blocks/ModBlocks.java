package de.markusbordihn.trankomat.blocks;

import de.markusbordihn.trankomat.Constants;
import de.markusbordihn.trankomat.block.SodaDepositMachineBlocks;
import de.markusbordihn.trankomat.block.SodaVendingMachineBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class ModBlocks {

  public static final Block DEPOSIT_MACHINE_TOP = SodaDepositMachineBlocks.DEPOSIT_MACHINE_TOP;
  public static final Block SODA_DEPOSIT_MACHINE_01 =
      SodaDepositMachineBlocks.SODA_DEPOSIT_MACHINE_01;
  public static final Block VENDING_MACHINE = SodaVendingMachineBlocks.VENDING_MACHINE;
  public static final Block VENDING_MACHINE_TOP = SodaVendingMachineBlocks.VENDING_MACHINE_TOP;
  public static final Block SODA_VENDING_MACHINE_01 =
      SodaVendingMachineBlocks.SODA_VENDING_MACHINE_01;
  public static final Block SODA_VENDING_MACHINE_02 =
      SodaVendingMachineBlocks.SODA_VENDING_MACHINE_02;

  protected ModBlocks() {}

  public static void registerModBlocks() {

    Constants.LOG.info("{} Deposit Machine Blocks ...", Constants.LOG_REGISTER_PREFIX);
    Registry.register(
        BuiltInRegistries.BLOCK,
        Constants.MOD_ID_PREFIX + "deposit_machine_top",
        DEPOSIT_MACHINE_TOP);
    Registry.register(
        BuiltInRegistries.BLOCK,
        Constants.MOD_ID_PREFIX + "soda_deposit_machine_01",
        SODA_DEPOSIT_MACHINE_01);

    Constants.LOG.info("{} Vending Machine Blocks ...", Constants.LOG_REGISTER_PREFIX);
    Registry.register(
        BuiltInRegistries.BLOCK, Constants.MOD_ID_PREFIX + "vending_machine", VENDING_MACHINE);
    Registry.register(
        BuiltInRegistries.BLOCK,
        Constants.MOD_ID_PREFIX + "vending_machine_top",
        VENDING_MACHINE_TOP);
    Registry.register(
        BuiltInRegistries.BLOCK,
        Constants.MOD_ID_PREFIX + "soda_vending_machine_01",
        SODA_VENDING_MACHINE_01);
    Registry.register(
        BuiltInRegistries.BLOCK,
        Constants.MOD_ID_PREFIX + "soda_vending_machine_02",
        SODA_VENDING_MACHINE_02);
  }
}
