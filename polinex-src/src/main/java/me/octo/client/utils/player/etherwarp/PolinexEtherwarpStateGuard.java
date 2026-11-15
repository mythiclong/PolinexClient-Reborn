package me.octo.client.utils.player.etherwarp;

import dev.jnic.PdfVaZ.JNICLoader;
import java.lang.reflect.Field;
import java.util.Map;

public final class PolinexEtherwarpStateGuard {
   private static final long DEBUG_AFTER_MS = 750L;
   private static final long DEBUG_INTERVAL_MS = 1500L;
   private static final long STALL_RECOVERY_MS = 4500L;
   private static final long RECOVERY_COOLDOWN_MS = 3500L;
   private static final String RESET_METHOD = "o";
   private static final String PENDING_TELEPORT_FIELD = "IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI";
   private static final String LAST_PLAYER_POSITION_FIELD = "lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI";
   private static final String CACHED_AIM_FIELD = "IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl";
   private static final String TELEPORT_ORIGIN_FIELD = "IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI";
   private static final String AUXILIARY_AIM_FIELD = "lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII";
   private static final String MOVE_STEP_FIELD = "lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII";
   private static final String SIDE_STEP_FIELD = "IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll";
   private static final String RETRY_FIELD = "IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll";
   private static final String FAILURE_FIELD = "lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl";
   private static Map<Object, PolinexEtherwarpStateGuard.State> STATES;
   private static Map<Class<?>, PolinexEtherwarpStateGuard.Access> ACCESS;

   private PolinexEtherwarpStateGuard() {
   }

   public static native void before(Object var0, Object var1);

   public static native boolean after(Object var0, Object var1, boolean var2);

   public static native void onInternalReset(Object var0);

   private static native void resetHandler(Object var0);

   private static native void releaseSharedInputState();

   private static native void invokeSingletonNoArg(String var0, String var1);

   private static native String snapshot(Object var0);

   private static String compact(Object var0) {
      return String.valueOf(var0);
   }

   private static boolean readBoolean(Object var0, String var1) {
      try {
         Field var2 = field0(var0.getClass(), var1);
         return var2 != null && var2.getType() == boolean.class && var2.getBoolean(var0);
      } catch (Throwable var3) {
         return false;
      }
   }

   private static Field field0(Class<?> var0, String var1) {
      for (Class<?> var2 = var0; var2 != null; var2 = var2.getSuperclass()) {
         try {
            Field var3 = var2.getDeclaredField(var1);
            var3.setAccessible(true);
            return var3;
         } catch (NoSuchFieldException var4) {
         }
      }

      return null;
   }

   private static void writeBoolean(Object var0, String var1, boolean var2) {
      try {
         Field var3 = field0(var0.getClass(), var1);
         if (var3 == null) {
            return;
         }

         if (var3.getType() == boolean.class) {
            var3.setBoolean(var0, var2);
         } else if (var3.getType() == Boolean.class) {
            var3.set(var0, var2);
         }
      } catch (Throwable var4) {
      }
   }

   private static native PolinexEtherwarpStateGuard.Access access(Class<?> var0) throws ReflectiveOperationException;

   private static Field field(Class<?> var0, String var1) throws NoSuchFieldException {
      Field var2 = var0.getDeclaredField(var1);
      var2.setAccessible(true);
      return var2;
   }

   private static void log(String var0) {
      System.out.println("[PNX Etherwarp Debug] " + var0);
   }

   private static PolinexEtherwarpStateGuard.State lambda$before$0(Object var0) {
      return (PolinexEtherwarpStateGuard.State)var0;
   }

   private static PolinexEtherwarpStateGuard.State lambda$after$1(Object var0) {
      return (PolinexEtherwarpStateGuard.State)var0;
   }

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   private record Access(
      Field pendingTeleport,
      Field lastPlayerPosition,
      Field cachedAim,
      Field teleportOrigin,
      Field auxiliaryAim,
      Field moveStep,
      Field sideStep,
      Field retries,
      Field failure
   ) {
      @Override
      public final String toString() { return null; }

      @Override
      public final int hashCode() { return 0; }

      @Override
      public final boolean equals(Object var1) { return false; }

      public Field pendingTeleport() { return null; }

      public Field lastPlayerPosition() { return null; }

      public Field cachedAim() { return null; }

      public Field teleportOrigin() { return null; }

      public Field auxiliaryAim() { return null; }

      public Field moveStep() { return null; }

      public Field sideStep() { return null; }

      public Field retries() { return null; }

      public Field failure() { return null; }

      static {
         JNICLoader.init();
         $jnicLoader();
      }
      // jar: public static native void $jnicLoader(); (jnic-injected; native is illegal in a record)
      public static void $jnicLoader() {
      }
   }

   private static final class State {
      Object target;
      String snapshot;
      long startedAt;
      long lastProgressAt;
      long lastDebugAt;
      long lastRecoveryAt;
      int recoveries;
      boolean completed;
      boolean forceFailure;
      long completedAt;
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
}
