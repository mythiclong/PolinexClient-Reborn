package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl {
   public static me.octo.client.PXDyn var58 = null; // PX-FIX missing field v2
   
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld


   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Function1<Integer, Unit> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Function0<Unit> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] a;
   private static String[] b;

   // PX-RESTORE: Kotlin default-args synthetic ctor (mask & 2 -> int param = 0)
   public lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl(
      @NotNull String var1,
      int var2,
      @NotNull Function1<? super Integer, Unit> var3,
      @NotNull Function0<Unit> var4,
      int var5,
      kotlin.jvm.internal.DefaultConstructorMarker var6
   ) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }
      this(var1, var2, var3, var4);
   }

   public lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl(
      @NotNull String var1, int var2, @NotNull Function1<? super Integer, Unit> var3, @NotNull Function0<Unit> var4
   ) {
      short var10001 = 24670;
      short var10002 = 21771;
      Intrinsics.checkNotNullParameter(var1, "routeName");
      var10001 = 24653;
      var10002 = -13717;
      Intrinsics.checkNotNullParameter(var3, "onSubmit");
      var10001 = 24659;
      var10002 = -11693;
      Intrinsics.checkNotNullParameter(var4, "onClose");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = ((Function1<Integer,Unit>)(Object)(var3));
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = RangesKt.coerceIn(var2, 0, 5);
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.identityHashCode(this);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Function1<Integer, Unit> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Function0<Unit> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6, float var7
   ) {
      Object var57 = null; // PX-FIX
      int var49 = 0; // PX-FIX
      Object var48 = null; // PX-FIX
      Object var47 = null; // PX-FIX
      Object var45 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      float var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var16;
      int var10001;
      label281: {
         label284: {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e()
                  .a(0.75F * var7),
               0.0F
            );
            var9 = 460.0F;
            var10 = 214.0F;
            var11 = var1 + (var3 - var9) / 2.0F;
            var12 = var2 + (var4 - var10) / 2.0F - 20.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var11,
               var12,
               var9,
               var10,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e(),
               14.0F
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var11,
               var12,
               var9,
               var10,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.6F),
               14.0F
            );
            var13 = 22.0F;
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            short var10002 = 24664;
            short var10003 = -5589;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               "Rate this route",
               var11 + var13,
               var12 + 18.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               false, 16, null);
            var8 = var10000;
            var14 = 24.0F;
            var15 = var11 + var9 - var13 - var14;
            var16 = var12 + 16.0F;
            float var85;
            var10001 = (var85 = var5 - var15) == 0.0F ? 0 : (var85 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var10001 < 0) {
                  break label284;
               }

               float var86;
               var10001 = (var86 = var5 - (var15 + var14)) == 0.0F ? 0 : (var86 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10001 > 0) {
                  break label284;
               }

               float var87;
               var10001 = (var87 = var6 - var16) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10001 < 0) {
                  break label284;
               }

               float var88;
               var10001 = (var88 = var6 - (var16 + var14)) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label281;
            }

            if (var10001 <= 0) {
               var10001 = 1;
               break label281;
            }
         }

         var10001 = 0;
      }

      String var43;
      label259: {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (var10001 != 0);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var15,
            var16,
            var14,
            var14,
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j(),
            6.0F
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var15,
            var16,
            var14,
            var14,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.5F),
            6.0F
         );
         short var59 = 24661;
         short var65 = -6990;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
               var15 + 6.0F,
               var16 + 6.0F,
               12.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               1.0F
            );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var11 + var13,
            var12 + 48.0F,
            var9 - var13 * 2.0F,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.4F),
            0.5F
         );
         lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl var42 = this;
         if (var8 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.length() > 30) {
               var43 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.substring(0, 29);
               var65 = 24656;
               short var71 = 25830;
               Intrinsics.checkNotNullExpressionValue(var43, "substring(...)");
               var43 = var43 + "…";
               break label259;
            }

            var42 = this;
         }

         var43 = var42.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      String var17 = var43;
      short var67 = 24662;
      short var72 = -29526;
      var72 = 24650;
      short var10004 = -18816;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         "How good is '" + var17 + "'?",
         var11 + var13,
         var12 + 66.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         false, 16, null);
      float var18 = 34.0F;
      float var19 = 14.0F;
      float var20 = var18 * 5.0F + var19 * 4.0F;
      float var21 = var11 + (var9 - var20) / 2.0F;
      float var22 = var12 + 94.0F;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
      int var23 = 1;

      label252: {
         label285: {
            while (true) {
               if (var23 < 6) {
                  float var24 = var21 + (var23 - 1) * (var18 + var19);
                  if (var8 != null) {
                     float var89;
                     var45 = (var89 = var5 - var24) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
                     if (var8 == null) {
                        break;
                     }

                     label244:
                     if (((Boolean)var45)) {
                        float var90;
                        int var46 = (var90 = var5 - (var24 + var18)) == 0.0F ? 0 : (var90 < 0.0F ? -1 : 1);
                        if (var8 != null) {
                           if (var46 > 0) {
                              break label244;
                           }

                           float var91;
                           var46 = (var91 = var6 - var22) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
                        }

                        if (var8 != null) {
                           if (var46 < 0) {
                              break label244;
                           }

                           float var92;
                           var46 = (var92 = var6 - (var22 + var18)) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
                        }

                        if (var46 <= 0) {
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var23;
                        }
                     }

                     var23++;
                  }

                  if (var8 != null) {
                     continue;
                  }
               }

               var47 = this;
               if (var8 == null) {
                  break label285;
               }

               var45 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               break;
            }

            if (((Boolean)var45)) {
               var48 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               break label252;
            }

            var47 = this;
         }

         var48 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      var23 =((Integer)( var48));
      int var33 = 1;

      while (true) {
         if (var33 < 6) {
            float var25 = var21 + (var33 - 1) * (var18 + var19);
            var49 = var33;
            if (var8 == null) {
               break;
            }

            if (var8 != null) {
               var49 = var33 <= var23 ? 1 : 0;
            }

            int var26 = var49;
            var72 = 24667;
            var10004 = 16943;
            float var27 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a("rate:on:" + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + ":" + var33, (var26 != 0), 18.0F);
            float var50 = 1.0F + 0.16F * var27;
            var10004 = 24648;
            short var10005 = 7973;
            float var28 = var50
               * me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a("rate:press:" + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + ":" + var33, 0.2F);
            float var29 = var18 * var28;
            float var30 = var25 + (var18 - var29) / 2.0F;
            float var31 = var22 + (var18 - var29) / 2.0F;
            short var60 = 24666;
            var67 = -26277;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polygon points=\"12,2 15.09,8.26 22,9.27 17,14.14 18.18,21.02 12,17.77 5.82,21.02 7,14.14 2,9.27 8.91,8.26 12,2\"/>\n        </svg>\n    ",
                  var30,
                  var31,
                  var29,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .a(RangesKt.coerceIn(1.0F - var27, 0.18F, 1.0F)),
                  1.0F
               );
            if (var8 != null) {
               if (var27 > 0.01F) {
                  var60 = 24649;
                  var67 = -10249;
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     "\n        <svg viewBox=\"0 0 24 24\" fill=\"currentColor\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polygon points=\"12,2 15.09,8.26 22,9.27 17,14.14 18.18,21.02 12,17.77 5.82,21.02 7,14.14 2,9.27 8.91,8.26 12,2\"/>\n        </svg>\n    ",
                     var30,
                     var31,
                     var29,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(),
                     var27,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah(),
                     var27 * 0.7F,
                     0.0F);
               }

               var72 = 24669;
               var10004 = 6018;
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     "rate:rip:" + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + ":" + var33,
                     var25,
                     var22,
                     var18,
                     var18,
                     var18 / 2.0F
                  );
               var33++;
            }

            if (var8 != null) {
               continue;
            }
         }

         var49 = var23;
         break;
      }

      if (var49 > 0) {
         var43 = this.a(var23);
         var67 = 24671;
         var72 = -9541;
         var72 = 24665;
         var10004 = 22268;
         var43 = var43 + " · " + var23 + "/5";
      } else {
         short var53 = 24663;
         short var62 = -14412;
         var43 = "Pick 1–5 stars";
      }

      String var34 = var43;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .a(
            var34,
            var11 + var9 / 2.0F,
            var22 + var18 + 16.0F,
            var23 > 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
         );
      float var35 = 32.0F;
      float var36 = var12 + var10 - 16.0F - var35;
      float var37 = 140.0F;
      float var38 = 96.0F;
      float var39 = var11 + var9 - var13 - var37;
      int var54 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var8 != null) {
         var54 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI > 0 ? 1 : 0;
      }

      int var40;
      label207: {
         label290: {
            var40 = var54;
            var10001 = var40;
            if (var8 != null) {
               if (var40 == 0) {
                  break label290;
               }

               float var93;
               var10001 = (var93 = var5 - var39) == 0.0F ? 0 : (var93 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10001 < 0) {
                  break label290;
               }

               float var94;
               var10001 = (var94 = var5 - (var39 + var37)) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10001 > 0) {
                  break label290;
               }

               float var95;
               var10001 = (var95 = var6 - var36) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10001 < 0) {
                  break label290;
               }

               float var96;
               var10001 = (var96 = var6 - (var36 + var35)) == 0.0F ? 0 : (var96 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label207;
            }

            if (var10001 <= 0) {
               var10001 = 1;
               break label207;
            }
         }

         var10001 = 0;
      }

      float var41;
      label181: {
         label291: {
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (var10001 != 0);
            short var82 = 24654;
            short var10006 = -23323;
            this.a(
               var39,
               var36,
               var37,
               var35,
               "Submit",
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               true,
               ((((((Boolean)(Object)((boolean)(Object)var40
              ? 1 : 0))) ? 1 : 0)!= 0)));
            var41 = var39 - var38 - 10.0F;
            float var97;
            var10001 = (var97 = var5 - var41) == 0.0F ? 0 : (var97 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var10001 < 0) {
                  break label291;
               }

               float var98;
               var10001 = (var98 = var5 - (var41 + var38)) == 0.0F ? 0 : (var98 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10001 > 0) {
                  break label291;
               }

               float var99;
               var10001 = (var99 = var6 - var36) == 0.0F ? 0 : (var99 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10001 < 0) {
                  break label291;
               }

               float var100;
               var10001 = (var100 = var6 - (var36 + var35)) == 0.0F ? 0 : (var100 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label181;
            }

            if (var10001 <= 0) {
               var10001 = 1;
               break label181;
            }
         }

         var10001 = 0;
      }

      label302: {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (var10001 != 0);
         short var83 = 24658;
         short var84 = 6334;
         this.a(var41, var36, var38, var35, "Cancel", this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, false, true);
         lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl var55 = this;
         if (var8 != null) {
            label156:
            if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               int var56 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
               if (var8 != null) {
                  if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                     break label156;
                  }

                  var56 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
               }

               label294: {
                  if (var8 != null) {
                     if (var56 != 0) {
                        var58 = this.a((kotlin.jvm.functions.Function1)null);
                        break label302;
                     }

                     var57 = this;
                     if (var8 == null) {
                        break label294;
                     }

                     var56 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                  }

                  if (var56 > 0) {
                     var58 = this.a((kotlin.jvm.functions.Function1)null);
                     break label302;
                  }

                  var57 = this;
               }

               var58 = ((PXDyn)(Object)(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI));
               break label302;
            }

            var55 = this;
         }

         var58 = var55.a((kotlin.jvm.functions.Function1)null);
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }

      return ((IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)(Object)(var58));
   }

   private final String a(int var1) {
      String var2;
      switch (var1) {
         case 1:
            short var6 = 24668;
            short var10 = 5778;
            var2 = "Rough";
            break;
         case 2:
            short var5 = 24660;
            short var9 = 9326;
            var2 = "Meh";
            break;
         case 3:
            short var4 = 24651;
            short var8 = 411;
            var2 = "Solid";
            break;
         case 4:
            short var3 = 24646;
            short var7 = -10785;
            var2 = "Great";
            break;
         default:
            short var10000 = 24655;
            short var10001 = -8748;
            var2 = "Goated";
      }

      return var2;
   }

   private final void a(float var1, float var2, float var3, float var4, String var5, boolean var6, boolean var7, boolean var8) {
      Object var12 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11;
      label92: {
         var9 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         boolean var10000 = var8;
         if (var9 != null) {
            if (!var8) {
               var11 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j()
                  .a(0.5F);
               break label92;
            }

            var10000 = var7;
         }

         label83:
         if (var9 != null) {
            if (var10000) {
               var10000 = var6;
               if (var9 == null) {
                  break label83;
               }

               if (var6) {
                  var11 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .g()
                     .b(6.0F, 6.0F, 6.0F);
                  break label92;
               }
            }

            var10000 = var7;
         }

         if (var9 != null) {
            if (var10000) {
               var11 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h();
               break label92;
            }

            var10000 = var6;
         }

         var11 = var10000
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j();
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var14;
      label93: {
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = var11;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var1,
            var2,
            var3,
            var4,
            var10,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
         boolean var10005 = var8;
         if (var9 != null) {
            if (!var8) {
               var14 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.25F);
               break label93;
            }

            var10005 = var7;
         }

         label63: {
            if (var9 != null) {
               if (var10005) {
                  break label63;
               }

               var10005 = var6;
            }

            if (!var10005) {
               var14 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.45F);
               break label93;
            }
         }

         var14 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z()
            .a(0.7F);
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var13;
      float var10002;
      float var10003;
      label94: {
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var4, 1.5F, var14, 7.0F);
         var12 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         var10002 = var1 + var3 / 2.0F;
         var10003 = var2 + var4 / 2.0F;
         boolean var10004 = var8;
         if (var9 != null) {
            if (!var8) {
               var13 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c();
               break label94;
            }

            var10004 = var7;
         }

         label49: {
            if (var9 != null) {
               if (var10004) {
                  break label49;
               }

               var10004 = var6;
            }

            if (!var10004) {
               var13 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b();
               break label94;
            }
         }

         var13 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

      ((me.octo.client.PXDyn)var12).a(var5, var10002, var10003, var13);
   }

   public final boolean a(char var1, int var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      int var10000 = var2;
      if (var3 != null) {
         switch (var2) {
            case 256:
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.invoke();
               return true;
            case 257:
            case 335:
               var10000 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               if (var3 != null) {
                  if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI > 0) {
                     this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .invoke(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
                     this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.invoke();
                  }

                  var10000 = 1;
               }

               return (var10000 != 0);
            default:
               var10000 = 49;
         }
      }

      label40: {
         char var10001 = var1;
         if (var3 != null) {
            if (var10000 > var1) {
               var10000 = 0;
               break label40;
            }

            var10000 = var1;
            if (var3 == null) {
               break label40;
            }

            var10001 = '6';
         }

         var10000 = var10000 < var10001 ? 1 : 0;
      }

      if (var10000 != 0) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1 - '0';
      }

      return true;
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(final Function0<Unit> var1) {
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         @Override
         public void e() {
            var1.invoke();
         }

         @Override
         public void a(char var1x, int var2) {
         }
      };
   }

   private static final Unit a(lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl var0) {
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.invoke();
      return Unit.INSTANCE;
   }

   private static final Unit b(lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl var0) {
      var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .invoke(var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.invoke();
      return Unit.INSTANCE;
   }

   private static final Unit a(
      lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl var0, float var1, float var2, float var3, float var4
   ) {
      var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      short var10003 = 24652;
      short var10004 = -18180;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            "rate:press:"
               + var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               + ":"
               + var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
      float var5 = var1 + (var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII - 1) * (var2 + var3);
      var10003 = 24657;
      var10004 = 32487;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "rate:rip:"
            + var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            + ":"
            + var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         var5 + var2 / 2.0F,
         var4 + var2 / 2.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(0.5F),
         var2 * 0.7F,
         0L);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "\u0011BÓY\u008bEÑìj\u0003\u001c|?\u0005ê³\u0088tí\t\u000bï\u00912½'«\u0006sè\u0015åq_e5 \fh!½¦\u0017D±½Sc®@¯\u0019Ø1ºo\u0089á\u008f\u0010Éõ ö\f=?7ÜjµLÕ\u0016\u0083Ì*\u0013\"Ykt±*\u0015^q\u001aÏö\u000bäüu\n\u0085\u0006ã\u000f$ ië-\u0019ÁÊk\u0011U\u0002¢2\u0018¢\u00175ní\u0013±ÈJ¥ªÿ\u008bóÇR\u0094¿&«õ>d¬ Í2\u00818\u008f\u0080½\u000bV/íØ\u0014Ån°ß\u009e\u0004fº×Oä\u001f©Üþ\bQé\u0097~ªµ#ï³d\u008d(oDä»?\u0097\u000526\u008a\u008bé2À?nÛ\u0019$¿6»P¾Dáª£k-ô¥ÐQ\u009bNã$ô\"«{¾üY~\u008f±\u0093ã\u0012!GWÄ\u0093i\u0006±CÃH\u00007$8\u0088\u00adm\tNv\u0018\u000e\u0011Ã\u001c\u001e\u0015r®ä\b~f?\u0003h\u001c\u0016\u0095\u000f\u001eú\u0017\u0090wuª\u0093;®ïÑnÄÝ\u0002\u009d9\r =\u008aâàÍðñÄ\u0007(Ëå\u000eú4ÞN»$⁈\b Y³\u0018$5\u0003«aAÍ\"â\u0097¿¹);\u008f\u001bQÓ¨Ú\u0085\b\u0085ddH s\u0005C²É\u001fçïBÑpÍ\u0017ñêÝã+GéÆ<»\u0018N\r\u0093+\u0015^\u008d\u0094m6\u008eÝ\u0002j¡øÆ%EM=\u0082à\u0003Ó8»ê\u0098]wÏ\u0007ª¨m5¥Ôø~\u000b®í\u009ecßÆ\u0087d\u0013Ç¼ô!®N½§îMf\u009bA?9\b0°kÅ¿[i³\u009d\u0018A²ËÈ¡¨ZÆú<ÛºÅwÀÐ<Ä\u008b2\rúB\u0014\u0096\u008ex±ÿ\u0003?\u009bllà\u007fÎ\fGYYFø\u001aüÝG\u000b\u0086\u0093a\u0096¨ï¤\u009a:ß^\u008a\u009dÊÛ¹\\¡:8í{\u0001\u008ckSn\f\tC@¦\u000b·Ë\u008a\u0006P\u008c÷Xw²\u0007\u0010\u0088{9doc\u000eÊR\u009e\u0005Æ\u0015C^3ø$S\u009b \tàPìÅ\u0012Ù^ÙÍ\u0006ß®\u0018\u0084\u000bþ\u0006pOxøh[\u000bç°\fÙ\u000eXÆ¾ïÕ=\b\u007f\u0081\u0086\u0001ÄL×\u0093\u0002Ó\u0085\u0005§%\u0019¨é\u000bz{¿ xw\b[6i\u0006";
      int var4 = "\u0011BÓY\u008bEÑìj\u0003\u001c|?\u0005ê³\u0088tí\t\u000bï\u00912½'«\u0006sè\u0015åq_e5 \fh!½¦\u0017D±½Sc®@¯\u0019Ø1ºo\u0089á\u008f\u0010Éõ ö\f=?7ÜjµLÕ\u0016\u0083Ì*\u0013\"Ykt±*\u0015^q\u001aÏö\u000bäüu\n\u0085\u0006ã\u000f$ ië-\u0019ÁÊk\u0011U\u0002¢2\u0018¢\u00175ní\u0013±ÈJ¥ªÿ\u008bóÇR\u0094¿&«õ>d¬ Í2\u00818\u008f\u0080½\u000bV/íØ\u0014Ån°ß\u009e\u0004fº×Oä\u001f©Üþ\bQé\u0097~ªµ#ï³d\u008d(oDä»?\u0097\u000526\u008a\u008bé2À?nÛ\u0019$¿6»P¾Dáª£k-ô¥ÐQ\u009bNã$ô\"«{¾üY~\u008f±\u0093ã\u0012!GWÄ\u0093i\u0006±CÃH\u00007$8\u0088\u00adm\tNv\u0018\u000e\u0011Ã\u001c\u001e\u0015r®ä\b~f?\u0003h\u001c\u0016\u0095\u000f\u001eú\u0017\u0090wuª\u0093;®ïÑnÄÝ\u0002\u009d9\r =\u008aâàÍðñÄ\u0007(Ëå\u000eú4ÞN»$⁈\b Y³\u0018$5\u0003«aAÍ\"â\u0097¿¹);\u008f\u001bQÓ¨Ú\u0085\b\u0085ddH s\u0005C²É\u001fçïBÑpÍ\u0017ñêÝã+GéÆ<»\u0018N\r\u0093+\u0015^\u008d\u0094m6\u008eÝ\u0002j¡øÆ%EM=\u0082à\u0003Ó8»ê\u0098]wÏ\u0007ª¨m5¥Ôø~\u000b®í\u009ecßÆ\u0087d\u0013Ç¼ô!®N½§îMf\u009bA?9\b0°kÅ¿[i³\u009d\u0018A²ËÈ¡¨ZÆú<ÛºÅwÀÐ<Ä\u008b2\rúB\u0014\u0096\u008ex±ÿ\u0003?\u009bllà\u007fÎ\fGYYFø\u001aüÝG\u000b\u0086\u0093a\u0096¨ï¤\u009a:ß^\u008a\u009dÊÛ¹\\¡:8í{\u0001\u008ckSn\f\tC@¦\u000b·Ë\u008a\u0006P\u008c÷Xw²\u0007\u0010\u0088{9doc\u000eÊR\u009e\u0005Æ\u0015C^3ø$S\u009b \tàPìÅ\u0012Ù^ÙÍ\u0006ß®\u0018\u0084\u000bþ\u0006pOxøh[\u000bç°\fÙ\u000eXÆ¾ïÕ=\b\u007f\u0081\u0086\u0001ÄL×\u0093\u0002Ó\u0085\u0005§%\u0019¨é\u000bz{¿ xw\b[6i\u0006"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 1;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 69;
                     case 1 -> 93;
                     case 2 -> 49;
                     case 3 -> 109;
                     case 4 -> 72;
                     case 5 -> 86;
                     default -> 32;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[25];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "_Mû\u0089÷,1ì\u0099þ@\u009ek\u0080ýæ\u0019Ë$\u0096=\u0000IÑK°tÙóÔ\u0085®j^\u0086ë\u00ad.M\u008aI\u00899#\u0005\u0012\u0091»l]ÛCÿøó\u0084|¾£\u0014ÃpJp\u008fÜ\u008cE5\u0083^\u008c]&\u0087Á.\u0005\u0011NQ¢\u0018!\u008fbºè\u001cCàAí?@\u0000\u0015ÏËF\u0006èH\u0000Æi{\u0002\u009fÞ\u0011\u0096v\u008c\u0017f%Â\u0083\u0005\u001b\u001cx¤Bdc¾Râÿææ«A\u0089\u0001`m\u0005ÖCìË=¼8\u001a¯\u00031q\u0006fr@¶0c\u0011tt8my\u0006ï\u001dÕ\u000eú M4\u00847Úyu\bnÙæ\u0018ý\u0000ê\u000fÕ\u0084áv!ÁâÄ±+\u0000Æ \u001d\u008b'À\u0099æ\u008dêý=Ù\u0088Þ\u008bùüÙ\u007f\u0018\u000bV\u0013\u0005\u000b\u001f\u001eÃKy©\u008a2Pä\u0007\\@â·\u0005\u0081\u0092\u0081+\u0001";
                  var4 = "_Mû\u0089÷,1ì\u0099þ@\u009ek\u0080ýæ\u0019Ë$\u0096=\u0000IÑK°tÙóÔ\u0085®j^\u0086ë\u00ad.M\u008aI\u00899#\u0005\u0012\u0091»l]ÛCÿøó\u0084|¾£\u0014ÃpJp\u008fÜ\u008cE5\u0083^\u008c]&\u0087Á.\u0005\u0011NQ¢\u0018!\u008fbºè\u001cCàAí?@\u0000\u0015ÏËF\u0006èH\u0000Æi{\u0002\u009fÞ\u0011\u0096v\u008c\u0017f%Â\u0083\u0005\u001b\u001cx¤Bdc¾Râÿææ«A\u0089\u0001`m\u0005ÖCìË=¼8\u001a¯\u00031q\u0006fr@¶0c\u0011tt8my\u0006ï\u001dÕ\u000eú M4\u00847Úyu\bnÙæ\u0018ý\u0000ê\u000fÕ\u0084áv!ÁâÄ±+\u0000Æ \u001d\u008b'À\u0099æ\u008dêý=Ù\u0088Þ\u008bùüÙ\u007f\u0018\u000bV\u0013\u0005\u000b\u001f\u001eÃKy©\u008a2Pä\u0007\\@â·\u0005\u0081\u0092\u0081+\u0001"
                     .length();
                  var1 = 240;
                  var8 = -1;
            }

            var10000 = 38;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 24670) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 26;
            case 1 -> 164;
            case 2 -> 65;
            case 3 -> 2;
            case 4 -> 101;
            case 5 -> 243;
            case 6 -> 93;
            case 7 -> 178;
            case 8 -> 40;
            case 9 -> 8;
            case 10 -> 1;
            case 11 -> 125;
            case 12 -> 180;
            case 13 -> 33;
            case 14 -> 165;
            case 15 -> 121;
            case 16 -> 247;
            case 17 -> 84;
            case 18 -> 120;
            case 19 -> 145;
            case 20 -> 103;
            case 21 -> 211;
            case 22 -> 34;
            case 23 -> 248;
            case 24 -> 107;
            case 25 -> 115;
            case 26 -> 47;
            case 27 -> 82;
            case 28 -> 250;
            case 29 -> 183;
            case 30 -> 210;
            case 31 -> 130;
            case 32 -> 124;
            case 33 -> 59;
            case 34 -> 219;
            case 35 -> 116;
            case 36 -> 18;
            case 37 -> 25;
            case 38 -> 27;
            case 39 -> 156;
            case 40 -> 68;
            case 41 -> 15;
            case 42 -> 90;
            case 43 -> 111;
            case 44 -> 151;
            case 45 -> 66;
            case 46 -> 187;
            case 47 -> 240;
            case 48 -> 127;
            case 49 -> 218;
            case 50 -> 78;
            case 51 -> 132;
            case 52 -> 97;
            case 53 -> 10;
            case 54 -> 112;
            case 55 -> 134;
            case 56 -> 143;
            case 57 -> 169;
            case 58 -> 231;
            case 59 -> 23;
            case 60 -> 193;
            case 61 -> 60;
            case 62 -> 217;
            case 63 -> 118;
            case 64 -> 175;
            case 65 -> 158;
            case 66 -> 161;
            case 67 -> 50;
            case 68 -> 167;
            case 69 -> 72;
            case 70 -> 38;
            case 71 -> 48;
            case 72 -> 32;
            case 73 -> 7;
            case 74 -> 91;
            case 75 -> 182;
            case 76 -> 55;
            case 77 -> 197;
            case 78 -> 46;
            case 79 -> 69;
            case 80 -> 144;
            case 81 -> 0;
            case 82 -> 41;
            case 83 -> 189;
            case 84 -> 24;
            case 85 -> 228;
            case 86 -> 244;
            case 87 -> 4;
            case 88 -> 67;
            case 89 -> 181;
            case 90 -> 35;
            case 91 -> 192;
            case 92 -> 242;
            case 93 -> 214;
            case 94 -> 253;
            case 95 -> 5;
            case 96 -> 131;
            case 97 -> 137;
            case 98 -> 239;
            case 99 -> 252;
            case 100 -> 126;
            case 101 -> 87;
            case 102 -> 70;
            case 103 -> 215;
            case 104 -> 9;
            case 105 -> 173;
            case 106 -> 255;
            case 107 -> 226;
            case 108 -> 11;
            case 109 -> 153;
            case 110 -> 128;
            case 111 -> 96;
            case 112 -> 99;
            case 113 -> 163;
            case 114 -> 179;
            case 115 -> 212;
            case 116 -> 13;
            case 117 -> 122;
            case 118 -> 64;
            case 119 -> 73;
            case 120 -> 203;
            case 121 -> 185;
            case 122 -> 80;
            case 123 -> 206;
            case 124 -> 57;
            case 125 -> 21;
            case 126 -> 159;
            case 127 -> 129;
            case 128 -> 148;
            case 129 -> 209;
            case 130 -> 190;
            case 131 -> 224;
            case 132 -> 149;
            case 133 -> 220;
            case 134 -> 92;
            case 135 -> 222;
            case 136 -> 249;
            case 137 -> 77;
            case 138 -> 232;
            case 139 -> 109;
            case 140 -> 227;
            case 141 -> 234;
            case 142 -> 233;
            case 143 -> 44;
            case 144 -> 62;
            case 145 -> 136;
            case 146 -> 237;
            case 147 -> 251;
            case 148 -> 79;
            case 149 -> 45;
            case 150 -> 133;
            case 151 -> 208;
            case 152 -> 37;
            case 153 -> 154;
            case 154 -> 76;
            case 155 -> 29;
            case 156 -> 230;
            case 157 -> 14;
            case 158 -> 196;
            case 159 -> 195;
            case 160 -> 102;
            case 161 -> 152;
            case 162 -> 3;
            case 163 -> 43;
            case 164 -> 17;
            case 165 -> 53;
            case 166 -> 205;
            case 167 -> 117;
            case 168 -> 113;
            case 169 -> 75;
            case 170 -> 188;
            case 171 -> 74;
            case 172 -> 119;
            case 173 -> 31;
            case 174 -> 150;
            case 175 -> 110;
            case 176 -> 30;
            case 177 -> 245;
            case 178 -> 81;
            case 179 -> 61;
            case 180 -> 147;
            case 181 -> 36;
            case 182 -> 94;
            case 183 -> 100;
            case 184 -> 254;
            case 185 -> 83;
            case 186 -> 246;
            case 187 -> 238;
            case 188 -> 12;
            case 189 -> 221;
            case 190 -> 198;
            case 191 -> 155;
            case 192 -> 229;
            case 193 -> 51;
            case 194 -> 123;
            case 195 -> 105;
            case 196 -> 141;
            case 197 -> 22;
            case 198 -> 140;
            case 199 -> 98;
            case 200 -> 138;
            case 201 -> 85;
            case 202 -> 207;
            case 203 -> 194;
            case 204 -> 168;
            case 205 -> 146;
            case 206 -> 162;
            case 207 -> 104;
            case 208 -> 39;
            case 209 -> 71;
            case 210 -> 114;
            case 211 -> 223;
            case 212 -> 86;
            case 213 -> 241;
            case 214 -> 89;
            case 215 -> 42;
            case 216 -> 177;
            case 217 -> 6;
            case 218 -> 52;
            case 219 -> 95;
            case 220 -> 171;
            case 221 -> 157;
            case 222 -> 49;
            case 223 -> 201;
            case 224 -> 88;
            case 225 -> 106;
            case 226 -> 58;
            case 227 -> 235;
            case 228 -> 236;
            case 229 -> 225;
            case 230 -> 56;
            case 231 -> 200;
            case 232 -> 166;
            case 233 -> 139;
            case 234 -> 213;
            case 235 -> 184;
            case 236 -> 28;
            case 237 -> 191;
            case 238 -> 199;
            case 239 -> 204;
            case 240 -> 172;
            case 241 -> 176;
            case 242 -> 170;
            case 243 -> 135;
            case 244 -> 186;
            case 245 -> 142;
            case 246 -> 54;
            case 247 -> 108;
            case 248 -> 16;
            case 249 -> 174;
            case 250 -> 202;
            case 251 -> 19;
            case 252 -> 160;
            case 253 -> 20;
            case 254 -> 216;
            default -> 63;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}
