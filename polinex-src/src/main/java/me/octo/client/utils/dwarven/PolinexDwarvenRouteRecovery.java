package me.octo.client.utils.dwarven;

import dev.jnic.PdfVaZ.JNICLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

public final class PolinexDwarvenRouteRecovery {
   private static final String PATHFINDER_CLASS = "me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI";
   private static final String DISTANCE_CLASS = "me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl";
   private static final double DISTANT_ANCHOR_THRESHOLD = 64.0;
   private static final String MINECRAFT_CLASS = "net.minecraft.client.Minecraft";
   private static final String COMMAND_SENDER_CLASS = "me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI";
   private static final double FORGE_X = 0.5;
   private static final double FORGE_Y = 149.0;
   private static final double FORGE_Z = -68.5;
   private static final double FORGE_ARRIVAL_RADIUS = 18.0;
   private static final long FORGE_WARP_RETRY_MS = 4500L;
   private static final long FORGE_WARP_TIMEOUT_MS = 15000L;
   private static final long POST_FORGE_NAVIGATION_MAX_MS = 120000L;
   private static final int RETRY_EVERY_TICKS = 10;
   private static final int REBUILD_EVERY_TICKS = 40;
   private static final int RESELECT_AFTER_TICKS = 160;
   private static Map<Object, PolinexDwarvenRouteRecovery.State> STATES; // PX-FIX: jar 中 final 且从未赋值（native 侧使用），去 final 以通过 javac 定值检查
   private static Map<Object, Long> LAST_RESOLVER_LOG; // PX-FIX: 同上
   private static volatile Object pathfinder;
   private static volatile Method pathfinderResolve;
   private static volatile Object distanceHelper;
   private static volatile Method distanceToBlock;
   private static PolinexDwarvenRouteRecovery.ForgeWarpState FORGE_WARP_STATE; // PX-FIX: 同上
   private static volatile Object minecraft;
   private static volatile Field minecraftPlayerField;
   private static volatile Method playerGetX;
   private static volatile Method playerGetY;
   private static volatile Method playerGetZ;
   private static volatile Method sendCommandMethod;

   private PolinexDwarvenRouteRecovery() {
   }

   public static native void onMissing(Object var0, ArrayList var1);

   public static native void onResolved(Object var0);

   public static native Object resolveNearby(Object var0, Object var1);

   private static native boolean consumePostForgeRestart(Object var0, ArrayList var1, Object var2, PolinexDwarvenRouteRecovery.State var3);

   private static native Object handleDistantAnchor(Object var0, double var1);

   private static native boolean sendForgeWarp();

   private static native PolinexDwarvenRouteRecovery.PlayerSnapshot playerSnapshot();

   private static native boolean isAtForge(PolinexDwarvenRouteRecovery.PlayerSnapshot var0);

   private static double number(Object var0) {
      return var0 instanceof Number ? ((Number)var0).doubleValue() : Double.NaN;
   }

   private static void logThrottled(Object var0, String var1) {
      // Probe: two calls with the SAME key printed twice, so the key does not deduplicate; behaves as log(msg).
      log(var1);
   }

   private static native double distanceFromPlayer(Object var0);

   private static String formatDistance(double var0) {
      return String.format(java.util.Locale.ROOT, "%.1f", var0);
   }

   private static native PolinexDwarvenRouteRecovery.Access pathfinderAccess(Class<?> var0) throws Exception;

   private static native Object invokeNoArg(Object var0, String var1);

   private static Object invokeNoArgStrict(Object var0, String var1) throws Exception {
      try {
         return var0.getClass().getMethod(var1).invoke(var0);
      } catch (NoSuchMethodException var2) {
         String var3 = var0.getClass().getName();
         throw new NoSuchMethodException(var3.substring(var3.lastIndexOf(46) + 1) + "." + var1 + "()");
      }
   }

   private static String rootMessage(Throwable var0) {
      Throwable var1 = var0;

      while (var1.getCause() != null && var1.getCause() != var1) {
         var1 = var1.getCause();
      }

      return var1.getClass().getSimpleName() + ": " + var1.getMessage();
   }

   private static void log(String var0) {
      System.out.println("[PNX Dwarven Debug] " + var0);
   }

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   private record Access(Object pathfinder, Method resolve, Method offset) {
      // PX-FIX JNIC: native in jar; JLS 8.10.3 forbids native methods in a record, body unavailable (Phase 2)
      public static void $jnicLoader() { JNICLoader.init(); }
      @Override
      public final String toString() { return null; }

      @Override
      public final int hashCode() { return 0; }

      @Override
      public final boolean equals(Object var1) { return false; }

      public Object pathfinder() { return null; }

      public Method resolve() { return null; }

      public Method offset() { return null; }

      static {
         JNICLoader.init();
         $jnicLoader();
      }
   }

   private static final class ForgeWarpState {
      public static native void $jnicLoader();
      String targetKey;
      boolean awaitingForgeArrival;
      boolean restartRoutePending;
      boolean postForgeNavigation;
      int attempts;
      long firstWarpAt;
      long lastWarpAt;
      long arrivedAt;
      long postForgeStartedAt;

      native void reset(String var1);

      static {
         JNICLoader.init();
         $jnicLoader();
      }
   }

   private static final class PlayerSnapshot {
      public static native void $jnicLoader();
      final double x;
      final double y;
      final double z;

      PlayerSnapshot(double var1, double var3, double var5) {
         this.x = var1;
         this.y = var3;
         this.z = var5;
      }

      @Override
      public native String toString();

      static {
         JNICLoader.init();
         $jnicLoader();
      }
   }

   private static final class State {
      public static native void $jnicLoader();
      Object target;
      int missingTicks;
      int retries;
      int lastLogTick;

      native void reset(Object var1);

      static {
         JNICLoader.init();
         $jnicLoader();
      }
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
    private static native me.octo.client.utils.dwarven.PolinexDwarvenRouteRecovery.State lambda$onMissing$0(java.lang.Object var0);
}
