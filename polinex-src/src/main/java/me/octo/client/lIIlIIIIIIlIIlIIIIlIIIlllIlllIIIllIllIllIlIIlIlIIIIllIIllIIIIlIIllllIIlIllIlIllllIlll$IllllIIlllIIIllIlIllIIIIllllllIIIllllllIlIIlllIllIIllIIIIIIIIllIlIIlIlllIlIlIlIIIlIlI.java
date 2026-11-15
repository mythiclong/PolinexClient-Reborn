package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

public final class lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      String var3;
      lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var4;
      Object var11;
      label53: {
         var11 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
         var4 = (lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)var1;
         var3 = (String)var11;
         boolean var5 = false;
         if (var3 != null) {
            var11 = var4.c();
            if (var11 != null) {
               break label53;
            }
         }

         var11 = Long.MAX_VALUE;
      }

      Object var6;
      int var7;
      label47: {
         var6 = var11;
         var7 = var4.d();
         int var12 = ((Intrinsics.areEqual(var6, Double.MAX_VALUE)) ? 1 : 0);
         if (var3 != null) {
            if (var12 != 0) {
               var11 = Double.MAX_VALUE;
               break label47;
            }

            var12 = var7;
         }

         var11 = var12 == 0 ? Double.MAX_VALUE : ((Number)var6).doubleValue() / var7;
      }

      var4 = (lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)var2;
      Comparable var8 = (Comparable)var11;
      boolean var10 = false;
      var11 = var4.c();
      Object var10001 = var11;
      if (var3 != null) {
         if (var11 == null) {
            var11 = Long.MAX_VALUE;
         }

         var6 = var11;
         var7 = var4.d();
         var11 = var6;
         var10001 = Double.MAX_VALUE;
      }

      label40: {
         int var15 = ((Intrinsics.areEqual(var11, var10001)) ? 1 : 0);
         if (var3 != null) {
            if (var15 != 0) {
               var11 = Double.MAX_VALUE;
               break label40;
            }

            var15 = var7;
         }

         var11 = var15 == 0 ? Double.MAX_VALUE : ((Number)var6).doubleValue() / var7;
      }

      int var17 = ComparisonsKt.compareValues(var8, (Comparable)var11);
      if (var3 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var17;
   }
}
