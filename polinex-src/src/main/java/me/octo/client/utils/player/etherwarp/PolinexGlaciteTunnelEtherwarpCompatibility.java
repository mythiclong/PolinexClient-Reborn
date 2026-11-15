package me.octo.client.utils.player.etherwarp;

import dev.jnic.PdfVaZ.JNICLoader;
import java.util.Set;
import java.util.stream.Stream;

public final class PolinexGlaciteTunnelEtherwarpCompatibility {
   private static final String GLACITE_COMMISSION = "me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll";
   private static final String TUNNEL_MINER = "me.octo.client.llIIlllIIlIIIIlIIIIllIIIIlIlllIllIlllIIIIlIlllIlIIllIlIIIllllllIIIlIIIIlIIlIlIlIllllI";
   private static final String EXCAVATOR = "me.octo.client.IlIIIIIllIllIIllIIlIllIIIlllIIlIIlIlllIIlIllllIllllIlIlllIlIllIIIIIlIIlllllllIIllIlII";
   private static Set<String> LOGGED_CALLERS;
   private static volatile long activeUntilNanos;
   private static volatile String activeMacro;

   private PolinexGlaciteTunnelEtherwarpCompatibility() {
   }

   private static volatile boolean pxReferenceSemantics;

   public static void markActive(String var0) {
      // Probe: ANY call (including "" and "other") flips the flag permanently within the JVM.
      pxReferenceSemantics = true;
   }

   public static boolean shouldUseReferenceSemantics() {
      return pxReferenceSemantics;
   }

   private static final java.util.Set<String> pxLoggedOnce = java.util.concurrent.ConcurrentHashMap.newKeySet();

   private static void logOnce(String var0) {
      // Probe: "[PNX Glacite Tunnel Compat] Exact reference Etherwarp lifecycle active for <msg>", once per message.
      if (pxLoggedOnce.add(var0)) {
         System.out.println("[PNX Glacite Tunnel Compat] Exact reference Etherwarp lifecycle active for " + var0);
      }
   }

   private static native boolean isGlaciteTunnelMacroFrame(String var0);

   private static boolean matches(String var0, String var1) {
      return java.util.Objects.equals(var0, var1);
   }

   private static String readableName(String var0) {
      // Probe: identity for "", "GLACITE_TUNNEL", "GLACITE_TUNNEL_FRAME", "glacite_tunnel", "glacite-tunnel", "GlaciteTunnel", "a b".
      return var0;
   }

   private static native String lambda$shouldUseReferenceSemantics$0(Stream<String> var0);

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
}
