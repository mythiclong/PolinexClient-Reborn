package me.octo.client.utils;

import kotlin.ranges.RangesKt;

final class llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll {

   // PX-FIX TOP5F: Kotlin default-args synthetic ctor (mask bit 1 -> 0.4d)
   public llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll(double pxP0, int pxMask, kotlin.jvm.internal.DefaultConstructorMarker pxM) {
      if ((pxMask & 1) != 0) {
         pxP0 = 0.4d;
      }
      this(pxP0);
   }
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll(Object... px) {
           this(0.0); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   private final double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   public llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll(double var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = Double.NaN;
   }

   public final double a(double var1) {
      int[] var3 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      double var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var3 != null) {
         if (!Double.isNaN(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)) {
            long var4 = System.nanoTime();
            double var6 = RangesKt.coerceIn(
               (var4 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) / 1.0E9, 5.0E-4, 0.25
            );
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               + (var1 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)
                  * (1.0 - Math.exp(-var6 / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
            var10000 = Math.abs(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - var1);
            if (var3 != null) {
               if (var10000 < 0.5) {
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
               }

               var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            return var10000;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = System.nanoTime();
         var10000 = var1;
      }

      return var10000;
   }

   public llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll() {
      this(0.0, 1, null);
   }
}
