package me.octo.client.utils.dwarven;

import dev.jnic.PdfVaZ.JNICLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class PolinexDwarvenSlayerTravelRecovery {
   private static final String PATHFINDER_CLASS = "me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI";
   private static final String MINECRAFT_CLASS = "net.minecraft.client.Minecraft";
   private static final int GOBLIN_X = 5;
   private static final int GOBLIN_Y = 127;
   private static final int GOBLIN_Z = 151;
   private static final int GLACITE_X = -104;
   private static final int GLACITE_Y = 144;
   private static final int GLACITE_Z = 139;
   private static final double STAGE_REACHED_DISTANCE = 6.5;
   private static final double LOCAL_TARGET_DISTANCE = 36.0;
   private static final double ROUTE_ENTRY_MAX_DISTANCE = 72.0;
   private static final long IDLE_DETOUR_MS = 1650L;
   private static final int MAX_DETOURS_BEFORE_FORGE = 5;
   private static final long RESOLVE_RETRY_MS = 350L;
   private static final long LOG_THROTTLE_MS = 1500L;
   private static PolinexDwarvenSlayerTravelRecovery.RouteDefinition GOBLIN_ROUTE; // PX-FIX: jar 中 final 且从未赋值（native 侧使用），去 final 以通过 javac 定值检查
   private static PolinexDwarvenSlayerTravelRecovery.RouteDefinition GLACITE_ROUTE; // PX-FIX: 同上
   private static PolinexDwarvenSlayerTravelRecovery.State STATE; // PX-FIX: 同上
   private static volatile Object pathfinder;
   private static volatile Method pathfinderResolve;
   private static volatile Constructor<?> blockPosConstructor;
   private static volatile Method blockPosGetX;
   private static volatile Method blockPosGetY;
   private static volatile Method blockPosGetZ;
   private static volatile Method blockPosOffset;
   private static volatile Object minecraft;
   private static volatile Field minecraftPlayerField;
   private static volatile Method playerGetX;
   private static volatile Method playerGetY;
   private static volatile Method playerGetZ;

   private PolinexDwarvenSlayerTravelRecovery() {
   }

   public static native Object resolveMovementTarget(Object var0);

   private static native void updateStateForRouteAndTeleport(
      PolinexDwarvenSlayerTravelRecovery.RouteDefinition var0, PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var1
   );

   private static native int chooseInitialStage(PolinexDwarvenSlayerTravelRecovery.RouteDefinition var0, PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var1);

   private static native void updateMovementProgress(PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var0);

   private static native void advanceReachedStages(PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var0);

   private static native Object projectedLocalAnchor(
      PolinexDwarvenSlayerTravelRecovery.Access var0, PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var1, int[] var2, int var3
   ) throws Exception;

   private static native Object resolveCached(
      PolinexDwarvenSlayerTravelRecovery.Access var0, Object var1, boolean var2, PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var3
   ) throws Exception;

   private static native Object searchNearby(
      PolinexDwarvenSlayerTravelRecovery.Access var0, Object var1, boolean var2, PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var3
   ) throws Exception;

   private static native int normalize(int var0, int var1, int var2, boolean var3);

   private static native void logTargetIfChanged(
      PolinexDwarvenSlayerTravelRecovery.RouteDefinition var0,
      PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var1,
      int[] var2,
      Object var3,
      Object var4,
      double var5,
      long var7
   );

   private static native PolinexDwarvenSlayerTravelRecovery.RouteDefinition routeFor(int var0, int var1, int var2);

   private static native PolinexDwarvenSlayerTravelRecovery.Access access(Class<?> var0) throws Exception;

   private static native PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot playerSnapshot() throws Exception;

   private static native Object newBlockPos(PolinexDwarvenSlayerTravelRecovery.Access var0, int var1, int var2, int var3) throws Exception;

   private static native int coordinate(Method var0, Object var1) throws Exception;

   private static native double number(Object var0);

   private static native boolean sameBlock(PolinexDwarvenSlayerTravelRecovery.Access var0, Object var1, Object var2) throws Exception;

   private static native double distance(PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var0, int var1, int var2, int var3);

   private static native double distance(PolinexDwarvenSlayerTravelRecovery.PlayerSnapshot var0, double var1, double var3, double var5);

   private static int clamp(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static String format(int[] var0) {
      StringBuilder var1 = new StringBuilder("(");

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var2 > 0) {
            var1.append(',');
         }

         var1.append(var0[var2]);
      }

      return var1.append(')').toString();
   }

   private static String oneDecimal(double var0) {
      return String.format(java.util.Locale.ROOT, "%.1f", var0);
   }

   private static String rootMessage(Throwable var0) {
      Throwable var1 = var0;

      while (var1.getCause() != null && var1.getCause() != var1) {
         var1 = var1.getCause();
      }

      return var1.getClass().getSimpleName() + ": " + var1.getMessage();
   }

   private static final java.util.Set<String> pxLoggedOnce = java.util.concurrent.ConcurrentHashMap.newKeySet();

   private static void logThrottled(String var0) {
      if (pxLoggedOnce.add(var0)) {
         log(var0);
      }
   }

   private static void log(String var0) {
      System.out.println("[PNX Dwarven Slayer Route] " + var0);
   }

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   private static final class Access {
      final Object pathfinder;
      final Method resolve;
      final Constructor<?> constructor;
      final Method getX;
      final Method getY;
      final Method getZ;
      final Method offset;

      Access(Object var1, Method var2, Constructor<?> var3, Method var4, Method var5, Method var6, Method var7) {
         this.pathfinder = var1;
         this.resolve = var2;
         this.constructor = var3;
         this.getX = var4;
         this.getY = var5;
         this.getZ = var6;
         this.offset = var7;
      }
   }

   private static final class PlayerSnapshot {

    // PX-FIX TOP5F: jar public static native void $jnicLoader();
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

   private static final class RouteDefinition {
      final String name;
      final int[][] points;

      RouteDefinition(String var1, int[][] var2) {
         this.name = var1;
         this.points = var2;
      }
   }

   private static final class State {

    // PX-FIX TOP5F: jar public static native void $jnicLoader();
    public static native void $jnicLoader();
      PolinexDwarvenSlayerTravelRecovery.RouteDefinition route;
      int stageIndex;
      int detourAttempt;
      boolean allowForgeRecovery;
      boolean awaitingForgeEntry;
      boolean hasPlayer;
      double lastX;
      double lastY;
      double lastZ;
      double bestStageDistance = Double.POSITIVE_INFINITY;
      double routeEntryDistance = Double.POSITIVE_INFINITY;
      long lastProgressAt;
      Object cachedAnchor;
      Object cachedResolved;
      long cachedAt;
      String lastLoggedTarget;
      long lastLogAt;
      String lastGenericLog;
      long lastGenericLogAt;

      native void clear();

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
}
