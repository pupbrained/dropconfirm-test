package xyz.pupbrained.forge;

import xyz.pupbrained.DropConfirmExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class DropConfirmExpectPlatformImpl {
    /**
     * This is our actual method to {@link DropConfirmExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
