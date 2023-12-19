package xyz.pupbrained.forge;

import dev.architectury.platform.forge.EventBuses;
import xyz.pupbrained.DropConfirm;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DropConfirm.MOD_ID)
public class DropConfirmForge {
    public DropConfirmForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(DropConfirm.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        DropConfirm.init();
    }
}
