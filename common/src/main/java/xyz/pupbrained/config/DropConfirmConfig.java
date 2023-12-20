package xyz.pupbrained.config;

import com.google.common.collect.Lists;
import eu.midnightdust.lib.config.MidnightConfig;
import net.minecraft.item.Item;

import java.util.List;

public class DropConfirmConfig extends MidnightConfig {
  @Entry
  public static boolean enabled = true;

  @Entry
  public static boolean playSounds = true;

  @Entry
  public static boolean treatAsWhitelist = false;

  @Entry
  public static double confirmationResetDelay = 1.0;

  @Entry
  public static List<Item> blacklistedItems = Lists.newArrayList();
}
