package xyz.pupbrained.fabric;

import xyz.pupbrained.DropConfirmExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class DropConfirmExpectPlatformImpl {
    /**
     * This is our actual method to {@link DropConfirmExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
