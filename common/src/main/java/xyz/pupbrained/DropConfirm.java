package xyz.pupbrained;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DropConfirm {
    public static final String MOD_ID = "drop_confirm";
    public static final Logger LOGGER = LogManager.getLogger("DropConfirm");

    public static void init() {
        System.out.println(DropConfirmExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
