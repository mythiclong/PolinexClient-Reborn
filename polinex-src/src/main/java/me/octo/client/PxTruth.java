package me.octo.client;

/**
 * PX-FIX r40: the decompiler rendered Kotlin/JVM int comparison results (0 / +-1) as boxed
 * Boolean casts, which throw ClassCastException: Integer cannot be cast to Boolean.
 * Restores the original truth test without guessing the value:
 * Boolean -> itself, Number -> (value != 0).
 */
public final class PxTruth {
   private PxTruth() {
   }

   public static boolean truth(Object var0) {
      Object var1 = var0;
      if (var1 instanceof Boolean) {
         return ((Boolean)var1).booleanValue();
      }
      return var1 instanceof Number && ((Number)var1).doubleValue() != 0.0D;
   }
}
