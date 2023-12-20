package xyz.pupbrained.fabric;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ClientModInitializer;
import xyz.pupbrained.DropConfirm;
import xyz.pupbrained.config.DropConfirmConfig;

public class DropConfirmFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MidnightConfig.init("drop_confirm", DropConfirmConfig.class);
        DropConfirm.init();
    }
}
