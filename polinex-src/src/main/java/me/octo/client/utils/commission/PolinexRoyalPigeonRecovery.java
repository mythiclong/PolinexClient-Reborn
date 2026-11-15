package me.octo.client.utils.commission;

import dev.jnic.PdfVaZ.JNICLoader;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.lang.reflect.Method;

public final class PolinexRoyalPigeonRecovery {
   private static long lastLogNanos;
   private static String lastLog;
   private static volatile long nextMoveAllowedNanos;

   private PolinexRoyalPigeonRecovery() {
   }

   public static native boolean ensureRoyalPigeonHotbar();

   public static native boolean hasRoyalPigeonAnywhere();

   private static native Method findInventoryClick(Class<?> var0, Class<?> var1, Class<?> var2);

   private static Method findIntMethod(Class<?> var0, String var1) {
      try {
         Method var2 = var0.getMethod(var1, int.class);
         var2.setAccessible(true);
         return var2;
      } catch (NoSuchMethodException var3) {
         return null;
      }
   }

   private static native boolean isRoyalPigeon(Object var0);

   private static boolean isEmpty(Object var0) {
      if (var0 == null) {
         return true;
      } else if (var0 instanceof CharSequence) {
         return ((CharSequence)var0).length() == 0;
      } else if (var0 instanceof Collection) {
         return ((Collection<?>)var0).isEmpty();
      } else {
         return var0 instanceof Map ? ((Map<?, ?>)var0).isEmpty() : true;
      }
   }

   private static String stripFormatting(String var0) {
      // Probe: drops every §+char pair ("§aHello §lWorld" -> "Hello World"), keeps &-codes untouched.
      StringBuilder var1 = new StringBuilder();
      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 == '\u00a7') {
            var2++;
         } else {
            var1.append(var3);
         }
      }
      return var1.toString();
   }

   private static Object invokeNoArgs(Object var0, String var1) throws Exception {
      Method var2 = findNoArgMethod(var0.getClass(), var1);
      return var2 == null ? null : var2.invoke(var0);
   }

   private static Method findNoArgMethod(Class<?> var0, String var1) {
      for (Class<?> var3 = var0; var3 != null; var3 = var3.getSuperclass()) {
         try {
            Method var4 = var3.getDeclaredMethod(var1);
            var4.setAccessible(true);
            return var4;
         } catch (NoSuchMethodException var5) {
         }
      }

      return null;
   }

   private static Object getField(Object var0, String var1) throws Exception {
      for (Class<?> var3 = var0.getClass(); var3 != null; var3 = var3.getSuperclass()) {
         try {
            Field var4 = var3.getDeclaredField(var1);
            var4.setAccessible(true);
            return var4.get(var0);
         } catch (NoSuchFieldException var5) {
         }
      }

      return null;
   }

   private static int getIntField(Object var0, String var1, int var2) {
      try {
         Object var3 = getField(var0, var1);
         return var3 instanceof Number ? ((Number)var3).intValue() : var2;
      } catch (Exception var4) {
         return var2;
      }
   }

   private static void log(String var0) {
      System.out.println("[PNX Royal Pigeon] " + var0);
   }

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
