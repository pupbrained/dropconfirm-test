package xyz.pupbrained.neoforge;

import net.neoforged.fml.loading.FMLPaths;
import xyz.pupbrained.DropConfirmExpectPlatform;

import java.nio.file.Path;

public class DropConfirmExpectPlatformImpl {
    /**
     * This is our actual method to {@link DropConfirmExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
