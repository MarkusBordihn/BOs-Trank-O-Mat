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

package de.markusbordihn.trankomat.sounds;

import de.markusbordihn.trankomat.Constants;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {

  public static final DeferredRegister<SoundEvent> SOUNDS =
      DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Constants.MOD_ID);

  public static final RegistryObject<SoundEvent> SODA_CAN_CRASH =
      SOUNDS.register(
          "crash_soda_can",
          () -> new SoundEvent(new ResourceLocation(Constants.MOD_ID, "crash_soda_can")));
  public static final RegistryObject<SoundEvent> SODA_CAN_OPEN =
      SOUNDS.register(
          "open_soda_can",
          () -> new SoundEvent(new ResourceLocation(Constants.MOD_ID, "open_soda_can")));
  public static final RegistryObject<SoundEvent> DROP_SODA_CAN =
      SOUNDS.register(
          "drop_soda_can",
          () -> new SoundEvent(new ResourceLocation(Constants.MOD_ID, "drop_soda_can")));

  protected ModSoundEvents() {}
}
