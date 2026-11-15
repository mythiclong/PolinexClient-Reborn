package me.octo.client.utils.dwarven;

import dev.jnic.PdfVaZ.JNICLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class PolinexDwarvenGoblinDirectRecovery {
   private static final String PATHFINDER_CLASS = "me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI";
   private static final String MINECRAFT_CLASS = "net.minecraft.client.Minecraft";
   private static final int GOBLIN_X = 5;
   private static final int GOBLIN_Y = 127;
   private static final int GOBLIN_Z = 151;
   private static final int GLACITE_X = -104;
   private static final int GLACITE_Y = 144;
   private static final int GLACITE_Z = 139;
   private static final double STAGE_REACHED_DISTANCE = 6.5;
   private static final double ROUTE_ENTRY_MAX_DISTANCE = 72.0;
   private static final double LOCAL_TARGET_DISTANCE = 36.0;
   private static final long IDLE_DETOUR_MS = 1650L;
   private static final int MAX_DETOURS_BEFORE_FORGE = 5;
   private static final long RESOLVE_RETRY_MS = 350L;
   private static final long LOG_THROTTLE_MS = 1500L;
   private static final int GOBLIN_DIRECT_STAGE = 5;
   private static final int DIRECT_MAX_EXPANDED = 9000;
   private static final int DIRECT_MAX_RADIUS = 58;
   private static final int DIRECT_FRONTIER_DISTANCE = 42;
   private static final int DIRECT_MAX_VERTICAL = 24;
   private static final int DIRECT_CHECKPOINT_STEPS = 3;
   private static final double DIRECT_CHECKPOINT_REACHED = 2.6;
   private static final long DIRECT_CHECKPOINT_MAX_AGE_MS = 3000L;
   private static final long DIRECT_REPLAN_MIN_INTERVAL_MS = 180L;
   private static final long DIRECT_NO_PATH_FORGE_MS = 8000L;
   private static final double GOBLIN_FALL_Y = 105.0;
   private static PolinexDwarvenGoblinDirectRecovery.RouteDefinition GOBLIN_ROUTE; // PX-FIX: jar 中 final 且从未赋值（native 侧使用），去 final 以通过 javac 定值检查
   private static PolinexDwarvenGoblinDirectRecovery.RouteDefinition GLACITE_ROUTE; // PX-FIX: 同上
   private static PolinexDwarvenGoblinDirectRecovery.State STATE; // PX-FIX: 同上
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
   private static volatile PolinexDwarvenGoblinDirectRecovery.LiveWorldAccess liveWorldAccess;

   private PolinexDwarvenGoblinDirectRecovery() {
   }

   public static native Object resolveMovementTarget(Object var0);

   private static native Object resolveStagedTarget(
      PolinexDwarvenGoblinDirectRecovery.Access var0,
      PolinexDwarvenGoblinDirectRecovery.RouteDefinition var1,
      PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var2,
      Object var3
   ) throws Exception;

   private static native Object resolveGoblinDirect(
      PolinexDwarvenGoblinDirectRecovery.Access var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1, Object var2
   ) throws Exception;

   private static native PolinexDwarvenGoblinDirectRecovery.LivePathPlan planLivePath(
      PolinexDwarvenGoblinDirectRecovery.Access var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1, int var2, int var3, int var4
   ) throws Exception;

   private static native List<PolinexDwarvenGoblinDirectRecovery.PathNode> reconstruct(PolinexDwarvenGoblinDirectRecovery.PathNode var0);

   private static native PolinexDwarvenGoblinDirectRecovery.PathNode findStartFloor(
      PolinexDwarvenGoblinDirectRecovery.PlanContext var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1
   ) throws Exception;

   private static native Object safeHoldPosition(PolinexDwarvenGoblinDirectRecovery.Access var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1) throws Exception;

   private static double directHeuristic(int var0, int var1, int var2, int var3, int var4, int var5) {
      // Fitted to the original: horizontal distance + 1.35 per vertical block, symmetric in both points.
      double var6 = var0 - var3;
      double var8 = var2 - var5;
      double var10 = Math.abs(var1 - var4);
      return Math.sqrt(var6 * var6 + var8 * var8) + 1.35 * var10;
   }

   private static native PolinexDwarvenGoblinDirectRecovery.LiveWorldAccess liveWorld(PolinexDwarvenGoblinDirectRecovery.Access var0) throws Exception;

   private static native Object minecraftInstance() throws Exception;

   private static native void updateStateForRouteAndTeleport(
      PolinexDwarvenGoblinDirectRecovery.RouteDefinition var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1
   );

   private static native double nearestPrefixDistance(
      PolinexDwarvenGoblinDirectRecovery.RouteDefinition var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1, int var2
   );

   private static native int chooseInitialStage(PolinexDwarvenGoblinDirectRecovery.RouteDefinition var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1);

   private static native void updateMovementProgress(PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var0);

   private static native void advanceReachedStages(PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var0);

   private static native Object projectedLocalAnchor(
      PolinexDwarvenGoblinDirectRecovery.Access var0, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1, int[] var2, int var3
   ) throws Exception;

   private static native Object resolveCached(
      PolinexDwarvenGoblinDirectRecovery.Access var0, Object var1, boolean var2, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var3
   ) throws Exception;

   private static native Object searchNearby(
      PolinexDwarvenGoblinDirectRecovery.Access var0, Object var1, boolean var2, PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var3
   ) throws Exception;

   private static native int normalize(int var0, int var1, int var2, boolean var3);

   private static native void logTargetIfChanged(
      PolinexDwarvenGoblinDirectRecovery.RouteDefinition var0,
      PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var1,
      int[] var2,
      Object var3,
      Object var4,
      double var5,
      long var7
   );

   private static native PolinexDwarvenGoblinDirectRecovery.RouteDefinition routeFor(int var0, int var1, int var2);

   private static native PolinexDwarvenGoblinDirectRecovery.Access access(Class<?> var0) throws Exception;

   private static native PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot playerSnapshot() throws Exception;

   private static native Object newBlockPos(PolinexDwarvenGoblinDirectRecovery.Access var0, int var1, int var2, int var3) throws Exception;

   private static int coordinate(Method var0, Object var1) throws Exception {
      if (var0 == null) {
         throw new NullPointerException();
      }

      Object var2 = var0.invoke(var1);
      if (var2 == null) {
         throw new NullPointerException();
      } else if (!(var2 instanceof Number)) {
         throw new ClassCastException("");
      } else {
         return ((Number)var2).intValue();
      }
   }

   private static double number(Object var0) {
      if (var0 == null) {
         throw new NullPointerException();
      } else if (!(var0 instanceof Number)) {
         throw new ClassCastException("");
      } else {
         return ((Number)var0).doubleValue();
      }
   }

   private static boolean sameBlock(PolinexDwarvenGoblinDirectRecovery.Access var0, Object var1, Object var2) throws Exception {
      return coordinate(var0.getX, var1) == coordinate(var0.getX, var2)
         && coordinate(var0.getY, var1) == coordinate(var0.getY, var2)
         && coordinate(var0.getZ, var1) == coordinate(var0.getZ, var2);
   }

   private static double distance(PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var0, int var1, int var2, int var3) {
      return distance(var0, var1 + 0.5, var2, var3 + 0.5);
   }

   private static double distance(PolinexDwarvenGoblinDirectRecovery.PlayerSnapshot var0, double var1, double var3, double var5) {
      double var7 = var1 - var0.x;
      double var9 = var3 - var0.y;
      double var11 = var5 - var0.z;
      return Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
   }

   private static int floor(double var0) {
      return (int)Math.floor(var0);
   }

   private static long pack(int var0, int var1, int var2) {
      // Fitted to 9 original-jar samples: x in bits 38..63 (26-bit mask), z in bits 12..37
      // (26-bit mask), y in bits 0..11 (12-bit mask); the long is formed with 64-bit wraparound.
      return ((long)(var0 & 0x3FFFFFF) << 38) | ((long)(var2 & 0x3FFFFFF) << 12) | (long)(var1 & 0xFFF);
   }

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
      // Probe: deepest cause, rendered as "<SimpleClassName>: <message>"
      Throwable var1 = var0;

      while (var1.getCause() != null && var1.getCause() != var1) {
         var1 = var1.getCause();
      }

      return var1.getClass().getSimpleName() + ": " + var1.getMessage();
   }

   private static final java.util.Set<String> pxLoggedOnce = java.util.concurrent.ConcurrentHashMap.newKeySet();

   private static void logThrottled(String var0) {
      // Probe: identical to log(), but a repeated message is suppressed.
      if (pxLoggedOnce.add(var0)) {
         log(var0);
      }
   }

   private static void log(String var0) {
      // Probe: stdout line with this exact prefix.
      System.out.println("[PNX Dwarven Slayer Direct] " + var0);
   }

   private static Method findNoArgBooleanMethod(Class<?> var0, String var1) {
      if (var0 == null) {
         throw new NullPointerException();
      } else if (var1 == null) {
         return null;
      }

      try {
         Method var2 = var0.getMethod(var1);
         if (var2.getReturnType() == boolean.class
            && var2.getParameterCount() == 0
            && !Modifier.isStatic(var2.getModifiers())) {
            var2.setAccessible(true);
            return var2;
         }
      } catch (NoSuchMethodException var3) {
      }

      return null;
   }

   // PX-FIX: jar 中为 ACC_SYNTHETIC|ACC_NATIVE；planLivePath 的 lambda 体随宿主一并被 JNIC 原生化，Java 侧无调用点
   private static native double lambda$planLivePath$0(PolinexDwarvenGoblinDirectRecovery.PathNode var0);

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

   private static final class LivePathPlan {
      final Object startFloor;
      final Object checkpoint;
      final Object frontier;
      final int pathLength;
      final int expanded;
      final double remainingDistance;

      LivePathPlan(Object var1, Object var2, Object var3, int var4, int var5, double var6) {
         this.startFloor = var1;
         this.checkpoint = var2;
         this.frontier = var3;
         this.pathLength = var4;
         this.expanded = var5;
         this.remainingDistance = var6;
      }
   }

   private static final class LiveWorldAccess {

    // PX-FIX TOP5F: jar public static native void $jnicLoader();
    public static native void $jnicLoader();
      final Object minecraft;
      final Field levelField;
      final Object level;
      final Constructor<?> blockPosConstructor;
      final Method getBlockState;
      final Method hasChunkAt;
      final Method stateBlocksMotion;
      final Method stateIsAir;

      LiveWorldAccess(Object var1, Field var2, Object var3, Constructor<?> var4, Method var5, Method var6, Method var7, Method var8) {
         this.minecraft = var1;
         this.levelField = var2;
         this.level = var3;
         this.blockPosConstructor = var4;
         this.getBlockState = var5;
         this.hasChunkAt = var6;
         this.stateBlocksMotion = var7;
         this.stateIsAir = var8;
      }

      static native PolinexDwarvenGoblinDirectRecovery.LiveWorldAccess create(Object var0, Class<?> var1) throws Exception;

      native Object currentLevel();

      native boolean isStandableFloor(int var1, int var2, int var3, Map<Long, Boolean> var4) throws Exception;

      private native boolean isLoaded(int var1, int var2, int var3) throws Exception;

      private native boolean blocksMotion(int var1, int var2, int var3) throws Exception;

      static {
         JNICLoader.init();
         $jnicLoader();
      }
   }

   private static final class PathNode {
      final int x;
      final int y;
      final int z;
      final PolinexDwarvenGoblinDirectRecovery.PathNode parent;
      double g;
      double f;

      PathNode(int var1, int var2, int var3, PolinexDwarvenGoblinDirectRecovery.PathNode var4) {
         this.x = var1;
         this.y = var2;
         this.z = var3;
         this.parent = var4;
      }
   }

   private static final class PlanContext {

    // PX-FIX TOP5F: jar public static native void $jnicLoader();
    public static native void $jnicLoader();
      final PolinexDwarvenGoblinDirectRecovery.LiveWorldAccess world;
      final Map<Long, Boolean> standable = new HashMap<>();

      PlanContext(PolinexDwarvenGoblinDirectRecovery.LiveWorldAccess var1) {
         this.world = var1;
      }

      native boolean isStandable(int var1, int var2, int var3) throws Exception;

      static {
         JNICLoader.init();
         $jnicLoader();
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
      PolinexDwarvenGoblinDirectRecovery.RouteDefinition route;
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
      Object directCheckpoint;
      Object directLastSafeHold;
      long directCheckpointAt;
      long directLastPlanAt;
      long directNoPathSince;

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
