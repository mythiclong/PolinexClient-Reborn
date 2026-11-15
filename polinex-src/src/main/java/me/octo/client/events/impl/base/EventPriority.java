package me.octo.client.events.impl.base;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

public enum EventPriority {
   HIGHEST,
   HIGH,
   NORMAL,
   LOW,
   LOWEST;
   public static EnumEntries<EventPriority> $ENTRIES = null; // PX-FIX missing field


   @NotNull
   public static EnumEntries<EventPriority> getEntries() {
      return $ENTRIES;
   }
}
