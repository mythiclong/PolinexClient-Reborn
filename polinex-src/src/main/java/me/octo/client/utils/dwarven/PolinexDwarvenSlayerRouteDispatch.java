package me.octo.client.utils.dwarven;

import dev.jnic.PdfVaZ.JNICLoader;
import java.lang.reflect.Method;

public final class PolinexDwarvenSlayerRouteDispatch {
   private static volatile Class<?> blockPosClass;
   private static volatile Method getX;
   private static volatile Method getY;
   private static volatile Method getZ;

   private PolinexDwarvenSlayerRouteDispatch() {
   }

   public static native boolean isGoblinTarget(Object var0);

   private static native void ensureAccess(Class<?> var0) throws Exception;

   private static Method findNoArg(Class<?> var0, String var1) {
      for (Class<?> var2 = var0; var2 != null; var2 = var2.getSuperclass()) {
         try {
            return var2.getDeclaredMethod(var1);
         } catch (NoSuchMethodException var3) {
         }
      }

      return null;
   }

   static {
      JNICLoader.init();
      $jnicLoader();
   }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
}
