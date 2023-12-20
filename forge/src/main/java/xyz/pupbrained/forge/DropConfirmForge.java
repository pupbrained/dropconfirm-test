package xyz.pupbrained.forge;

import dev.architectury.platform.forge.EventBuses;
import eu.midnightdust.lib.config.MidnightConfig;
import net.minecraftforge.client.ConfigScreenHandler;
import xyz.pupbrained.DropConfirm;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.pupbrained.config.DropConfirmConfig;

@Mod(DropConfirm.MOD_ID)
public class DropConfirmForge {
    public DropConfirmForge() {
        MidnightConfig.init(DropConfirm.MOD_ID, DropConfirmConfig.class);
        MidnightConfig.write(DropConfirm.MOD_ID);
        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () ->
          new ConfigScreenHandler.ConfigScreenFactory((client, parent) -> MidnightConfig.getScreen(parent, DropConfirm.MOD_ID)));
        EventBuses.registerModEventBus(DropConfirm.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        DropConfirm.init();
    }
}
