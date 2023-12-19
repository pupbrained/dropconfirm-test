package xyz.pupbrained.fabric;

import xyz.pupbrained.DropConfirm;
import net.fabricmc.api.ModInitializer;

public class DropConfirmFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DropConfirm.init();
    }
}
