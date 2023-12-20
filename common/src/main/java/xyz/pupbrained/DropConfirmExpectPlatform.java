package xyz.pupbrained;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.platform.Platform;

import java.nio.file.Path;

public class DropConfirmExpectPlatform {
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: xyz.pupbrained.DropConfirmExpectPlatform#getConfigDirectory()
     * Actual Fabric: xyz.pupbrained.fabric.DropConfirmExpectPlatformImpl#getConfigDirectory()
     * Actual NeoForge: xyz.pupbrained.neoforge.DropConfirmExpectPlatformImpl#getConfigDirectory()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-achitectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
