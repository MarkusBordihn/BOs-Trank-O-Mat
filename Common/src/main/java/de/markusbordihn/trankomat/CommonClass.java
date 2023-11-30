package de.markusbordihn.trankomat;

import de.markusbordihn.trankomat.platform.Services;
import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

public class CommonClass {

  protected CommonClass() {}

  // This method serves as an initialization hook for the mod. The vanilla
  // game has no mechanism to load tooltip listeners so this must be
  // invoked from a mod loader specific project like Forge or Fabric.
  public static void init() {

    Constants.LOG.info(
        "Hello from Common init on {}! we are currently in a {} environment!",
        Services.PLATFORM.getPlatformName(),
        Services.PLATFORM.isDevelopmentEnvironment() ? "development" : "production");
  }

  // This method serves as a hook to modify item tooltips. The vanilla game
  // has no mechanism to load tooltip listeners so this must be registered
  // by a mod loader like Forge or Fabric.
  public static void onItemTooltip(ItemStack stack, TooltipFlag context, List<Component> tooltip) {
    // Placeholder for future implementation.
  }
}
