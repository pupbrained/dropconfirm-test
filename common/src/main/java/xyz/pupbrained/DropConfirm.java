package xyz.pupbrained;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import xyz.pupbrained.config.DropConfirmConfig;

import java.util.Objects;

public class DropConfirm {
  public static final String MOD_ID = "drop_confirm";
  public static final Logger LOGGER = LogManager.getLogger("DropConfirm");
  public static final KeyBinding TOGGLE_KEY = new KeyBinding(
    "key.drop_confirm.toggle",
    InputUtil.Type.KEYSYM,
    GLFW.GLFW_KEY_UNKNOWN,
    "category.drop_confirm.keybinds"
  );

  public static void init() {
    DropConfirmConfig.GSON.load();

    KeyMappingRegistry.register(TOGGLE_KEY);

    ClientTickEvent.CLIENT_POST.register(client -> {
      while (TOGGLE_KEY.wasPressed()) {
        var mc = MinecraftClient.getInstance();
        var config = DropConfirmConfig.GSON.instance();
        var player = Objects.requireNonNull(mc.player);

        config.enabled = !config.enabled;

        DropConfirmConfig.GSON.save();

        if (config.playSounds)
          player.playSound(SoundEvents.ENTITY_ITEM_PICKUP, 1.0f, config.enabled ? 1.0f : 0.5f);

        mc.inGameHud.setOverlayMessage(
          Text
            .literal("DropConfirm: ")
            .append(
              Text
                .translatable(config.enabled ? "drop_confirm.toggle.on" : "drop_confirm.toggle.off")
                .formatted(config.enabled ? Formatting.GREEN : Formatting.RED)
            ),
          false
        );
      }
    });
  }
}
