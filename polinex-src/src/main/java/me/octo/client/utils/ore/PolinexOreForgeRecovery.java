package me.octo.client.utils.ore;

import dev.jnic.PdfVaZ.JNICLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Map;

public final class PolinexOreForgeRecovery {
   private static final String PREFIX = "[PNX Ore Debug] ";
   private static final long EMPTY_ROUTE_RETRY_NANOS = 650000000L;
   private static final long STALL_NANOS = 3500000000L;
   private static final long ARM_NANOS = 18000000000L;
   private static final long LOG_NANOS = 1500000000L;
   private static final int MAX_EMPTY_ROUTE_REPAIRS = 4;
   private static final int MAX_RESELECTS = 3;
   private static final String ROUTE_MANAGER_CLASS = "me.octo.client.llIllIIIIIIIlllIIIIlIlllIlllIIIIIIIlIlllIIlIIlIIlIllIIlIllIIllIlIlIllIlIIlIlIIIlIlIll";
   private static final String ROUTE_MANAGER_SINGLETON = "llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI";
   private static final String TRAVEL_ROUTE_FIELD = "lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl";
   private static final String MINE_ROUTE_FIELD = "IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll";
   private static Map<Object, PolinexOreForgeRecovery.State> STATES;

   private PolinexOreForgeRecovery() {
   }

   public static native void onMacroStart(Object var0);

   public static native void onForgeArrival(Object var0);

   public static native void afterTick(Object var0);

   private static boolean samePosition(PolinexOreForgeRecovery.State var0, PolinexOreForgeRecovery.Snapshot var1) {
      if (!var0.havePosition || !var1.havePosition) {
         return false;
      } else {
         return Math.abs(var0.lastX - var1.x) < 0.2
            && Math.abs(var0.lastY - var1.y) < 0.2
            && Math.abs(var0.lastZ - var1.z) < 0.2;
      }
   }

   private static void copySnapshot(PolinexOreForgeRecovery.State var0, PolinexOreForgeRecovery.Snapshot var1) {
      var0.lastIndex = var1.index;
      var0.lastRouteSize = var1.routeSize;
      var0.lastRouteState = var1.routeState;
      var0.lastX = var1.x;
      var0.lastY = var1.y;
      var0.lastZ = var1.z;
      var0.havePosition = var1.havePosition;
   }

   private static native PolinexOreForgeRecovery.Snapshot snapshot(Object var0) throws Exception;

   private static native PolinexOreForgeRecovery.RouteRefresh refreshRouteFields(Object var0) throws Exception;

   private static ArrayList<?> asArrayList(Object var0) {
      if (var0 instanceof ArrayList) {
         return (ArrayList<?>)var0;
      } else {
         return var0 instanceof Collection ? new ArrayList<>((Collection<?>)var0) : new ArrayList<>();
      }
   }

   private static Object invokeNoArg(Object var0, String var1) throws Exception {
      return findMethod(var0.getClass(), var1).invoke(var0);
   }

   private static Method findMethod(Class<?> var0, String var1) throws NoSuchMethodException {
      for (Class<?> k = var0; k != null; k = k.getSuperclass()) {
         try {
            Method m = k.getDeclaredMethod(var1);
            m.setAccessible(true);
            return m;
         } catch (NoSuchMethodException ignored) {
         }
      }
      String n = var0.getName();
      throw new NoSuchMethodException(n.substring(n.lastIndexOf(46) + 1) + "." + var1);
   }

   private static Method findMethod(Class<?> var0, String var1, Class<?>... var2) throws NoSuchMethodException {
      for (Class<?> k = var0; k != null; k = k.getSuperclass()) {
         try {
            Method m = k.getDeclaredMethod(var1, var2);
            m.setAccessible(true);
            return m;
         } catch (NoSuchMethodException ignored) {
         }
      }
      String n = var0.getName();
      throw new NoSuchMethodException(n.substring(n.lastIndexOf(46) + 1) + "." + var1);
   }

   private static Field findField(Class<?> var0, String var1) throws NoSuchFieldException {
      for (Class<?> k = var0; k != null; k = k.getSuperclass()) {
         try {
            Field f = k.getDeclaredField(var1);
            f.setAccessible(true);
            return f;
         } catch (NoSuchFieldException ignored) {
         }
      }
      String n = var0.getName();
      throw new NoSuchFieldException(n.substring(n.lastIndexOf(46) + 1) + "." + var1);
   }

   private static Object readField(Object var0, String var1) throws Exception {
      return findField(var0.getClass(), var1).get(var0);
   }

   private static double number(Object var0) {
      return var0 instanceof Number ? ((Number)var0).doubleValue() : Double.NaN;
   }

   private static boolean safeEquals(Object var0, Object var1) {
      return Objects.equals(var0, var1);
   }

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   private static final class RouteRefresh {
      final int travelSize;
      final int mineSize;

      RouteRefresh(int var1, int var2) {
         this.travelSize = var1;
         this.mineSize = var2;
      }
   }

   private static final class Snapshot {
      int index;
      int routeSize;
      String routeState;
      double x;
      double y;
      double z;
      boolean havePosition;

      native String describe();

      private static native void $jnicLoader();

      static {
         JNICLoader.init();
         $jnicLoader();
      }
   }

   private static final class State {
      long armedAt;
      long lastProgress;
      long lastLog;
      long lastEmptyRouteRepair;
      int lastIndex;
      int lastRouteSize;
      String lastRouteState;
      double lastX;
      double lastY;
      double lastZ;
      boolean havePosition;
      boolean progressLogged;
      int emptyRouteRepairs;
      int reselections;
      int arrivalSignals;
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
}
