package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIllIllllllIIlIlIIIlIIIIIIIIIIlIllIIIIlIlIIIllllIIIlIIllIIIllIlIlIIIlllllIllIllIlI {
   @NotNull
   public static lIIIIllIllllllIIlIlIIIlIIIIIIIIIIlIllIIIIlIlIIIllllIIIlIIllIIIllIlIlIIIlllllIllIllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 1.0F;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final float[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new float[1024];
   private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] a;
   private static String[] b;

   public final void a(
      @NotNull List<Pair<Long, Float>> var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      boolean var7,
      long var8,
      long var10,
      @Nullable Float var12
   ) {
      int var54 = 0; // PX-FIX
      Object var53 = null; // PX-FIX
      Object var51 = null; // PX-FIX
      float var47 = 0; // PX-FIX
      Object var46 = null; // PX-FIX
      String var10000 = llIIlIIIlIIlllIlllllIIIIlIIIllIIIIIIllIIIlIIlllIlllllllIlIIlllIIllIIIIIIllIIllIIIlIIl.E();
      short var10002 = -23396;
      short var10003 = 28600;
      Intrinsics.checkNotNullParameter(var1, "series");
      var10002 = -23395;
      var10003 = 26805;
      Intrinsics.checkNotNullParameter(var6, "accent");
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var2,
         var3,
         var4,
         var5,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j()
            .a(0.5F),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var2,
         var3,
         var4,
         var5,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.4F),
         6.0F
      );
      float var14 = var2 + 5.0F;
      String var13 = var10000;
      float var15 = var3 + 20.0F;
      float var16 = var4 - 10.0F;
      float var17 = var5 - 20.0F - 6.0F;
      float var59;
      int var45 = (var59 = var16 - 1.0F) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
      if (var13 == null) {
         if (var45 <= 0) {
            return;
         }

         float var60;
         var45 = (var60 = var17 - 1.0F) == 0.0F ? 0 : (var60 < 0.0F ? -1 : 1);
      }

      if (var45 > 0) {
         long var18 = var10 - var8;
         float var20 = Float.POSITIVE_INFINITY;
         float var21 = Float.NEGATIVE_INFINITY;
         Iterator var22 = var1.iterator();

         while (true) {
            if (var22.hasNext()) {
               Pair var23 = (Pair)var22.next();
               long var24 = ((Number)var23.component1()).longValue();
               float var26 = ((Number)var23.component2()).floatValue();
               long var61;
               var46 = (var61 = var24 - var18) == 0L ? 0 : (var61 < 0L ? -1 : 1);
               if (var13 != null) {
                  break;
               }

               if (var13 == null) {
                  if (((Boolean)var46)) {
                     continue;
                  }

                  long var62;
                  var46 = (var62 = var24 - var10) == 0L ? 0 : (var62 < 0L ? -1 : 1);
               }

               if (var13 == null) {
                  if (((Boolean)var46)) {
                     continue;
                  }

                  float var63;
                  var46 = (var63 = var26 - var20) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
               }

               label237: {
                  if (var13 == null) {
                     if (((Boolean)var46)) {
                        var20 = var26;
                     }

                     var47 = var26;
                     if (var13 != null) {
                        break label237;
                     }

                     float var64;
                     var46 = (var64 = var26 - var21) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
                  }

                  if (((Boolean)var46)) {
                     continue;
                  }

                  var47 = var26;
               }

               var21 = var47;
               if (var13 == null) {
                  continue;
               }
            }

            label239: {
               Float var48 = var12;
               if (var13 == null) {
                  if (var12 == null) {
                     break label239;
                  }

                  var48 = var12;
               }

               float var65;
               var46 = (var65 = var48 - var20) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
               if (var13 == null) {
                  if (((Boolean)var46)) {
                     var20 = var12;
                  }

                  float var66;
                  var46 = (var66 = var12 - var21) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
               }

               if (var13 != null) {
                  break;
               }

               if (((Boolean)var46)) {
                  var21 = var12;
               }
            }

            float var67;
            var46 = (var67 = var20 - (Float.POSITIVE_INFINITY)) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
            break;
         }

         if (var13 == null) {
            var46 =((Boolean)(Object)( (Boolean)var46 ? 1 : 0));
         }

         if (!((Boolean)var46)) {
            this.a(var14, var15, var16, var17);
         } else {
            if (var7) {
               var20 = Math.min(var20, 0.0F);
            }

            float var27;
            long var28;
            float var41;
            label249: {
               float var38 = (var20 + var21) * 0.5F;
               float var39 = Math.max(Math.abs(var38) * 0.04F, 1.0F);
               float var40 = Math.max(var21 - var20, var39);
               float var25 = var40 * 0.12F;
               var41 = var7 ? 0.0F : var20 - var25;
               var27 = var21 + var25;
               var28 = System.nanoTime();
               lIIIIllIllllllIIlIlIIIlIIIIIIIIIIlIllIIIIlIlIIIllllIIIlIIllIIIllIlIlIIIlllllIllIllIlI var49 = this;
               if (var13 == null) {
                  label179:
                  if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
                     long var50 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     long var10001 = 0L;
                     if (var13 == null) {
                        if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == 0L) {
                           break label179;
                        }

                        var50 = var28;
                        var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     }

                     var51 = RangesKt.coerceIn((float)(var50 - var10001) / 1.0E9F, 0.001F, 0.25F);
                     break label249;
                  }

                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var41;
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var27;
                  var49 = this;
               }

               var49.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
               var51 = 0.016F;
            }

            float var30 =((Float)( var51));
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var28;
            float var68;
            int var10005 = (var68 = var41 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) == 0.0F
               ? 0
               : (var68 < 0.0F ? -1 : 1);
            if (var13 == null) {
               var10005 = var10005 < 0 ? 1 : 0;
            }

            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.a(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var41, var30, ((((((Boolean)(Object)((boolean)(Object)var10005
              ? 1 : 0))) ? 1 : 0)!= 0)));
            float var69;
            var10005 = (var69 = var27 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) == 0.0F
               ? 0
               : (var69 < 0.0F ? -1 : 1);
            if (var13 == null) {
               var10005 = var10005 > 0 ? 1 : 0;
            }

            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.a(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var27, var30, ((((((Boolean)(Object)((boolean)(Object)var10005
              ? 1 : 0))) ? 1 : 0)!= 0)));
            float var31 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            float var70;
            int var52 = (var70 = var31 - 1.0E-4F) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
            if (var13 == null) {
               if (var52 < 0) {
                  var31 = 1.0E-4F;
               }

               var52 = 0;
            }

            int var32 = var52;
            int var33 = -1;
            int var34 = 0;
            int var35 = var1.size();

            while (true) {
               label165:
               if (var34 < var35) {
                  long var36 = ((Number)((Pair)var1.get(var34)).getFirst()).longValue();
                  long var71;
                  var53 = (var71 = var36 - var18) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                  if (var13 != null) {
                     break;
                  }

                  label243: {
                     if (var13 == null) {
                        if (((Boolean)var53)) {
                           var33 = var34;
                           if (var13 == null) {
                              break label243;
                           }
                        }

                        long var72;
                        var53 = (var72 = var36 - var10) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                     }

                     if (var13 != null) {
                        break;
                     }

                     if (((Boolean)var53)) {
                        break label165;
                     }

                     var53 = var32;
                     if (var13 != null) {
                        break;
                     }

                     if (var32 >= 512) {
                        break label165;
                     }

                     this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var32 * 2] = var14
                        + (float)(var36 - var18) / (float)var8 * var16;
                     this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var32 * 2 + 1] = var15
                        + var17
                        - RangesKt.coerceIn(
                              (
                                    ((Number)((Pair)var1.get(var34)).getSecond()).floatValue()
                                       - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                 )
                                 / var31,
                              0.0F,
                              1.0F
                           )
                           * var17;
                     var32++;
                  }

                  var34++;
                  if (var13 == null) {
                     continue;
                  }
               }

               var53 = var33;
               break;
            }

            label143: {
               if (var13 == null) {
                  if (((Boolean)var53)) {
                     break label143;
                  }

                  var53 = var32;
               }

               if ((((((Boolean)(Object)((Boolean)var53 ? 1 : 0)))) ? 1 : 0)  < 512) {
                  System.arraycopy(
                     this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     0,
                     this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     2,
                     var32 * 2
                  );
                  Pair var42 = (Pair)var1.get(var33);
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[0] = var14
                     + (float)(((Number)var42.getFirst()).longValue() - var18) / (float)var8 * var16;
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[1] = var15
                     + var17
                     - RangesKt.coerceIn(
                           (
                                 ((Number)var42.getSecond()).floatValue()
                                    - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              )
                              / var31,
                           0.0F,
                           1.0F
                        )
                        * var17;
                  var32++;
               }
            }

            short var55;
            label137: {
               if (var12 != null) {
                  var54 = var32;
                  var55 = 512;
                  if (var13 != null) {
                     break label137;
                  }

                  if (var32 < 512) {
                     this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var32 * 2] = var14 + var16;
                     this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var32 * 2 + 1] = var15
                        + var17
                        - RangesKt.coerceIn(
                              (var12 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) / var31, 0.0F, 1.0F
                           )
                           * var17;
                     var32++;
                  }
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var14, var15, var16, var17);
               this.a(var14, var15, var16, var17);
               var54 = var32;
               var55 = 2;
            }

            if (var13 == null) {
               if (var54 >= var55) {
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        var32,
                        var15,
                        var15 + var17,
                        var6.a(0.2F),
                        var6.a(0.0F)
                     );
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var32, 1.6F, var6.a(0.95F));
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .i();
               var54 = var32;
               var55 = 1;
            }

            if (var54 >= var55) {
               float var43 = RangesKt.coerceIn(
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[(var32 - 1) * 2], var14, var14 + var16
               );
               float var44 = RangesKt.coerceIn(
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[(var32 - 1) * 2 + 1], var15, var15 + var17
               );
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var43, var44, 5.5F, var6.a(0.14F));
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var43, var44, 3.3F, var6.a(0.3F));
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var43, var44, 2.1F, var6.a(1.0F));
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var43,
                  var44,
                  0.9F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .a(0.85F)
               );
            }

            if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
               llIIlIIIlIIlllIlllllIIIIlIIIllIIIIIIllIIIlIIlllIlllllllIlIIlllIIllIIIIIIllIIllIIIlIIl.b("CgunJc");
            }
         }
      }
   }

   private final void a(float var1, float var2, float var3, float var4) {
      String var10000 = llIIlIIIlIIlllIlllllIIIIlIIIllIIIIIIllIIIlIIlllIlllllllIlIIlllIIllIIIIIIllIIllIIIlIIl.E();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .a(0.06F);
      String var5 = var10000;
      int var7 = 1;

      while (true) {
         if (var7 < 4) {
            float var8 = var2 + var4 * (var7 / 4.0F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var1, var8, var1 + var3, var8, 1.0F, var6);
            var7++;
            if (var5 != null) {
               break;
            }

            if (var5 == null) {
               continue;
            }
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               var1,
               var2 + var4,
               var1 + var3,
               var2 + var4,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .a(0.12F)
            );
         break;
      }
   }

   private final float a(float var1, float var2, float var3, boolean var4) {
      String var5 = llIIlIIIlIIlllIlllllIIIIlIIIllIIIIIIllIIIlIIlllIlllllllIlIIlllIIllIIIIIIllIIllIIIlIIl.E();
      float var6 = var4 ? 0.14F : 1.2F;
      float var7 = 1.0F - (float)Math.exp(-var3 / var6);
      float var8 = var1 + (var2 - var1) * var7;
      float var10000 = Math.abs(var8 - var2);
      if (var5 == null) {
         var10000 = var10000 < 1.0E-4F ? var2 : var8;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "0À^\u001e\u0092X\u0006ÏQàæ}Í";
      int var4 = "0À^\u001e\u0092X\u0006ÏQàæ}Í".length();
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 34;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 34;
               var10006 = var6;
            } else {
               var13 = 34;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 34;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 72;
                  case 1 -> 103;
                  case 2 -> 88;
                  case 3 -> 44;
                  case 4 -> 109;
                  case 5 -> 79;
                  default -> 127;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[2];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIllIllllllIIlIlIIIlIIIIIIIIIIlIllIIIIlIlIIIllllIIIlIIllIIIllIlIlIIIlllllIllIllIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -23396) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 108;
            case 1 -> 60;
            case 2 -> 48;
            case 3 -> 75;
            case 4 -> 62;
            case 5 -> 104;
            case 6 -> 169;
            case 7 -> 46;
            case 8 -> 15;
            case 9 -> 255;
            case 10 -> 49;
            case 11 -> 127;
            case 12 -> 160;
            case 13 -> 0;
            case 14 -> 130;
            case 15 -> 149;
            case 16 -> 59;
            case 17 -> 18;
            case 18 -> 80;
            case 19 -> 39;
            case 20 -> 97;
            case 21 -> 12;
            case 22 -> 98;
            case 23 -> 208;
            case 24 -> 152;
            case 25 -> 89;
            case 26 -> 76;
            case 27 -> 138;
            case 28 -> 195;
            case 29 -> 221;
            case 30 -> 204;
            case 31 -> 140;
            case 32 -> 219;
            case 33 -> 105;
            case 34 -> 31;
            case 35 -> 215;
            case 36 -> 95;
            case 37 -> 70;
            case 38 -> 237;
            case 39 -> 247;
            case 40 -> 54;
            case 41 -> 61;
            case 42 -> 57;
            case 43 -> 206;
            case 44 -> 52;
            case 45 -> 222;
            case 46 -> 126;
            case 47 -> 3;
            case 48 -> 245;
            case 49 -> 13;
            case 50 -> 72;
            case 51 -> 20;
            case 52 -> 216;
            case 53 -> 74;
            case 54 -> 203;
            case 55 -> 43;
            case 56 -> 56;
            case 57 -> 167;
            case 58 -> 254;
            case 59 -> 78;
            case 60 -> 191;
            case 61 -> 177;
            case 62 -> 129;
            case 63 -> 27;
            case 64 -> 178;
            case 65 -> 92;
            case 66 -> 170;
            case 67 -> 69;
            case 68 -> 179;
            case 69 -> 87;
            case 70 -> 199;
            case 71 -> 21;
            case 72 -> 8;
            case 73 -> 251;
            case 74 -> 124;
            case 75 -> 187;
            case 76 -> 217;
            case 77 -> 36;
            case 78 -> 110;
            case 79 -> 132;
            case 80 -> 102;
            case 81 -> 85;
            case 82 -> 201;
            case 83 -> 166;
            case 84 -> 176;
            case 85 -> 4;
            case 86 -> 64;
            case 87 -> 205;
            case 88 -> 172;
            case 89 -> 119;
            case 90 -> 143;
            case 91 -> 68;
            case 92 -> 26;
            case 93 -> 210;
            case 94 -> 90;
            case 95 -> 37;
            case 96 -> 58;
            case 97 -> 186;
            case 98 -> 136;
            case 99 -> 213;
            case 100 -> 2;
            case 101 -> 86;
            case 102 -> 193;
            case 103 -> 218;
            case 104 -> 100;
            case 105 -> 24;
            case 106 -> 211;
            case 107 -> 235;
            case 108 -> 207;
            case 109 -> 131;
            case 110 -> 229;
            case 111 -> 240;
            case 112 -> 159;
            case 113 -> 79;
            case 114 -> 51;
            case 115 -> 42;
            case 116 -> 153;
            case 117 -> 212;
            case 118 -> 224;
            case 119 -> 5;
            case 120 -> 148;
            case 121 -> 189;
            case 122 -> 182;
            case 123 -> 17;
            case 124 -> 214;
            case 125 -> 93;
            case 126 -> 9;
            case 127 -> 202;
            case 128 -> 155;
            case 129 -> 33;
            case 130 -> 96;
            case 131 -> 226;
            case 132 -> 122;
            case 133 -> 23;
            case 134 -> 238;
            case 135 -> 113;
            case 136 -> 16;
            case 137 -> 243;
            case 138 -> 109;
            case 139 -> 107;
            case 140 -> 30;
            case 141 -> 184;
            case 142 -> 145;
            case 143 -> 200;
            case 144 -> 165;
            case 145 -> 142;
            case 146 -> 34;
            case 147 -> 146;
            case 148 -> 249;
            case 149 -> 180;
            case 150 -> 227;
            case 151 -> 28;
            case 152 -> 141;
            case 153 -> 183;
            case 154 -> 44;
            case 155 -> 29;
            case 156 -> 192;
            case 157 -> 106;
            case 158 -> 190;
            case 159 -> 161;
            case 160 -> 150;
            case 161 -> 45;
            case 162 -> 115;
            case 163 -> 154;
            case 164 -> 84;
            case 165 -> 241;
            case 166 -> 47;
            case 167 -> 117;
            case 168 -> 223;
            case 169 -> 99;
            case 170 -> 209;
            case 171 -> 147;
            case 172 -> 175;
            case 173 -> 139;
            case 174 -> 196;
            case 175 -> 164;
            case 176 -> 220;
            case 177 -> 197;
            case 178 -> 14;
            case 179 -> 118;
            case 180 -> 120;
            case 181 -> 225;
            case 182 -> 232;
            case 183 -> 67;
            case 184 -> 25;
            case 185 -> 94;
            case 186 -> 65;
            case 187 -> 144;
            case 188 -> 55;
            case 189 -> 111;
            case 190 -> 242;
            case 191 -> 174;
            case 192 -> 236;
            case 193 -> 88;
            case 194 -> 163;
            case 195 -> 32;
            case 196 -> 198;
            case 197 -> 185;
            case 198 -> 19;
            case 199 -> 81;
            case 200 -> 41;
            case 201 -> 244;
            case 202 -> 171;
            case 203 -> 82;
            case 204 -> 101;
            case 205 -> 40;
            case 206 -> 22;
            case 207 -> 123;
            case 208 -> 50;
            case 209 -> 71;
            case 210 -> 128;
            case 211 -> 11;
            case 212 -> 253;
            case 213 -> 234;
            case 214 -> 151;
            case 215 -> 134;
            case 216 -> 250;
            case 217 -> 228;
            case 218 -> 231;
            case 219 -> 35;
            case 220 -> 125;
            case 221 -> 173;
            case 222 -> 91;
            case 223 -> 103;
            case 224 -> 121;
            case 225 -> 63;
            case 226 -> 168;
            case 227 -> 114;
            case 228 -> 53;
            case 229 -> 133;
            case 230 -> 73;
            case 231 -> 246;
            case 232 -> 156;
            case 233 -> 188;
            case 234 -> 252;
            case 235 -> 194;
            case 236 -> 1;
            case 237 -> 233;
            case 238 -> 10;
            case 239 -> 157;
            case 240 -> 38;
            case 241 -> 162;
            case 242 -> 248;
            case 243 -> 230;
            case 244 -> 158;
            case 245 -> 135;
            case 246 -> 239;
            case 247 -> 7;
            case 248 -> 137;
            case 249 -> 112;
            case 250 -> 77;
            case 251 -> 6;
            case 252 -> 83;
            case 253 -> 116;
            case 254 -> 66;
            default -> 181;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final List<Pair<Long, Float>> a(long var1) {
      ArrayList var12 = null; // PX-FIX
         ArrayList var4 = new ArrayList(140);
         String var10000 = llIIlIIIlIIlllIlllllIIIIlIIIllIIIIIIllIIIlIIlllIlllllllIlIIlllIIllIIIIIIllIIllIIIlIIl.E();
         int var5 = 0;
         String var3 = var10000;

         while (true) {
            if (var5 < 140) {
               long var6 = var1 - (139 - var5) * 250L;
               double var8 = var6 / 1000.0;
               double var10 = 420000.0 + 150000.0 * Math.sin(var8 / 8.0) + 70000.0 * Math.sin(var8 / 2.3) + 30000.0 * Math.sin(var8 / 0.9);
               var12 = var4;
               if (var3 != null) {
                  break;
               }

               var4.add(TuplesKt.to(var6, RangesKt.coerceAtLeast((float)var10, 0.0F)));
               var5++;
               if (var3 == null) {
                  continue;
               }
            }

            var12 = var4;
            break;
         }

         return (List<Pair<Long, Float>>)var12;
      }

      @NotNull
      public final List<Pair<Long, Float>> b(long var1) {
      ArrayList var12 = null; // PX-FIX
         String var10000 = llIIlIIIlIIlllIlllllIIIIlIIIllIIIIIIllIIIlIIlllIlllllllIlIIlllIIllIIIIIIllIIllIIIlIIl.E();
         ArrayList var4 = new ArrayList(150);
         int var5 = 0;
         String var3 = var10000;

         while (true) {
            if (var5 < 150) {
               long var6 = var1 - (149 - var5) * 1200L;
               double var8 = var5 / 149.0;
               double var10 = 6500000.0 + 560000.0 * var8 + 18000.0 * Math.sin(var6 / 4000.0);
               var12 = var4;
               if (var3 != null) {
                  break;
               }

               var4.add(TuplesKt.to(var6, (float)var10));
               var5++;
               if (var3 == null) {
                  continue;
               }
            }

            var12 = var4;
            break;
         }

         return (List<Pair<Long, Float>>)var12;
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static void a(me.octo.client.lIIIIllIllllllIIlIlIIIlIIIIIIIIIIlIllIIIIlIlIIIllllIIIlIIllIIIllIlIlIIIlllllIllIllIlI p0, java.util.List p1, float p2, float p3, float p4, float p5, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p6, boolean p7, long p8, long p9, java.lang.Float p10, int p11, java.lang.Object p12) {
    if ((p11 & 512) != 0) { p10 = null; }
    p0.a(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
  }
}
