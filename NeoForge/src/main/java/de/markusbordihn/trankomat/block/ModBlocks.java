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
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;

public class ModBlocks {

  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

  public static final RegistryObject<Block> DEPOSIT_MACHINE_TOP =
      BLOCKS.register("deposit_machine_top", () -> SodaDepositMachineBlocks.DEPOSIT_MACHINE_TOP);

  public static final RegistryObject<Block> SODA_DEPOSIT_MACHINE_01 =
      BLOCKS.register(
          "soda_deposit_machine_01", () -> SodaDepositMachineBlocks.SODA_DEPOSIT_MACHINE_01);

  public static final RegistryObject<Block> VENDING_MACHINE =
      BLOCKS.register("vending_machine", () -> SodaVendingMachineBlocks.VENDING_MACHINE);
  public static final RegistryObject<Block> VENDING_MACHINE_TOP =
      BLOCKS.register("vending_machine_top", () -> SodaVendingMachineBlocks.VENDING_MACHINE_TOP);

  public static final RegistryObject<Block> SODA_VENDING_MACHINE_01 =
      BLOCKS.register(
          "soda_vending_machine_01", () -> SodaVendingMachineBlocks.SODA_VENDING_MACHINE_01);
  public static final RegistryObject<Block> SODA_VENDING_MACHINE_02 =
      BLOCKS.register(
          "soda_vending_machine_02", () -> SodaVendingMachineBlocks.SODA_VENDING_MACHINE_02);

  protected ModBlocks() {}
}
