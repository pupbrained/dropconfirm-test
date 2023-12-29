package xyz.pupbrained.fabric;

import net.fabricmc.api.ClientModInitializer;
import xyz.pupbrained.DropConfirm;

public class DropConfirmFabric implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    DropConfirm.init();
  }
}
