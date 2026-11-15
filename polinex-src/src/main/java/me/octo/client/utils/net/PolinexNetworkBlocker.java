package me.octo.client.utils.net;

public final class PolinexNetworkBlocker {
   private static final String DOMAIN = "polinexclient.net";

   private PolinexNetworkBlocker() {
   }

   public static boolean isBlocked(String var0) {
      // Restored from the JNIC payload by black-box probing of the original jar:
      // null -> false; every other input is lower-cased and matched as a SUBSTRING of the domain,
      // e.g. "apolinexclient.net" and "polinexclient.net.evil.com" both return true.
      return var0 != null && var0.toLowerCase(java.util.Locale.ROOT).contains(DOMAIN);
   }
}
