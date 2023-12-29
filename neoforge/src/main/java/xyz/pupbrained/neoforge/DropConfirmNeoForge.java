package xyz.pupbrained.neoforge;

import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.ConfigScreenHandler;
import xyz.pupbrained.DropConfirm;
import xyz.pupbrained.config.DropConfirmConfig;

@Mod(DropConfirm.MOD_ID)
public class DropConfirmNeoForge {
  public DropConfirmNeoForge() {
    ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () ->
      new ConfigScreenHandler.ConfigScreenFactory((client, parent) -> DropConfirmConfig.createScreen(parent)));
    DropConfirm.init();
  }
}
