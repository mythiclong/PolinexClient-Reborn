package me.octo.client.utils.player;

import java.util.Random;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI
   extends IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI {
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private long IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String b;

   public lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1
   ) {
      Intrinsics.checkNotNullParameter(var1, b);
      super(var1);
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 1.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1.0F;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.g().nextFloat() * 1000.0F;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.g().nextFloat() * 1000.0F;
   }

   private final Random g() {
      return this.a().g();
   }

   @Override
   public void a(float var1, float var2, float var3, float var4) {
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var10000;
      int var5 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      var10000 = this.a();
      label34:
      if (var5 == 0) {
         if (var10000.h()) {
            var10000 = this.a();
            if (var5 != 0) {
               break label34;
            }

            if (!var10000.i()) {
               float var6 = Math.abs(
                  lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c(var1 - this.a().l())
               );
               float var7 = Math.abs(var2 - this.a().m());
               if (var5 != 0) {
                  return;
               }

               if (var6 + var7 < 1.5F) {
                  this.a().c(var1);
                  this.a().d(var2);
                  var10000 = this.a();
                  if (var5 == 0) {
                     if (!var10000.s()) {
                        return;
                     }

                     var10000 = this.a();
                  }

                  var10000.r()[3] = TuplesKt.to(var1, var2);
                  return;
               }
            }
         }

         var10000 = this.a();
      }

      var10000.a(var3, var4, var1, var2, this);
   }

   @Override
   public void c() {
      this.a()
         .e(
            (float)Math.sqrt(
               (float)Math.pow(
                     lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .c(this.a().l() - this.a().j()),
                     2
                  )
                  + (float)Math.pow(this.a().m() - this.a().k(), 2)
            )
         );
      float var1 = this.a().G() * this.a().k(this.a().n());
      this.a().f(this.b(this.a().n(), var1));
      this.c(this.a().n(), var1);
      long var2 = System.currentTimeMillis();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 1.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0L;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0F;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var2;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.0F;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var2;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var2;
      this.a().b(var2);
      this.a().b(false);
      this.a().a(true);
   }

   @Override
   public void b() {
      Object var57 = null; // PX-FIX
      Object var46 = null; // PX-FIX
      Object var44 = null; // PX-FIX
      Object var41 = null; // PX-FIX
      Object var37 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      int var1 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      if (var1 != 0 || this.a().a().player != null) {
         long var2 = System.currentTimeMillis();
         long var4 = var2 - this.a().o();
         float var10000 = (float)var4;
         float var10001 = this.a().p();
         if (var1 == 0) {
            if (var10000 >= var10001) {
               this.a(this.a().l(), this.a().m());
               this.a().y();
               return;
            }

            var10000 = (float)var4 / this.a().p();
            var10001 = 0.0F;
         }

         float var6;
         label378: {
            float var7;
            label384: {
               var6 = RangesKt.coerceIn(var10000, var10001, 1.0F);
               var7 = this.a(var6);
               int var8 = 60 + this.g().nextInt(40);
               long var64;
               int var35 = (var64 = var2 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - var8) == 0L
                  ? 0
                  : (var64 < 0L ? -1 : 1);
               if (var1 == 0) {
                  if (var35 > 0) {
                     this.c(var6);
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
                  }

                  var36 = this;
                  if (var1 != 0) {
                     break label384;
                  }

                  var35 = ((this.a().s()) ? 1 : 0);
               }

               if (var35 != 0) {
                  var37 = this.b(var7);
                  break label378;
               }

               var36 = this;
            }

            var37 = TuplesKt.to(this.a(this.a().j(), this.a().l(), var7), this.a(this.a().k(), this.a().m(), var7));
         }

         Pair var9 =((Pair)( var37));
         float var10 = ((Number)var9.component1()).floatValue();
         float var11 = ((Number)var9.component2()).floatValue();
         long var12 = this.a().n() > 45.0F ? 60L : 85L;
         var10000 = this.a().n();
         if (var1 == 0) {
            var10000 = var10000 > 45.0F ? 0.28F : 0.18F;
         }

         float var15;
         label366: {
            label365: {
               float var14 = var10000;
               var15 = (float)Math.sqrt(
                  (float)Math.pow(
                        lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .c(this.a().l() - var10),
                        2
                     )
                     + (float)Math.pow(this.a().m() - var11, 2)
               );
               long var65;
               int var39 = (var65 = var2 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll - var12) == 0L
                  ? 0
                  : (var65 < 0L ? -1 : 1);
               if (var1 == 0) {
                  if (var39 <= 0) {
                     break label365;
                  }

                  var10000 = var6;
                  var10001 = 0.2F;
                  if (var1 != 0) {
                     break label366;
                  }

                  float var66;
                  var39 = (var66 = var6 - 0.2F) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
               }

               if (var39 > 0) {
                  var10000 = var6;
                  var10001 = 0.85F;
                  if (var1 != 0) {
                     break label366;
                  }

                  if (var6 < 0.85F) {
                     var10000 = var15;
                     var10001 = 1.0F;
                     if (var1 != 0) {
                        break label366;
                     }

                     if (var15 > 1.0F) {
                        var10000 = this.g().nextFloat();
                        var10001 = var14;
                        if (var1 != 0) {
                           break label366;
                        }

                        if (var10000 < var14) {
                           this.h();
                           this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
                        }
                     }
                  }
               }
            }

            var10000 = var10;
            var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               * this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         float var16;
         float var17;
         label347: {
            label346: {
               var16 = var10000 + var10001;
               var17 = var11
                  + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     * this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               if (var1 == 0) {
                  label342:
                  if (!(var6 <= 0.2F)) {
                     float var67;
                     var41 = (var67 = var6 - 0.85F) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
                     if (var1 == 0) {
                        if (((Boolean)var41)) {
                           break label342;
                        }

                        float var68;
                        var41 = (var68 = var15 - 1.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                     }

                     if (var1 != 0) {
                        break label347;
                     }

                     if (((Boolean)var41)) {
                        break label346;
                     }
                  }

                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl *= 0.9F;
               }

               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI *= 0.9F;
            }

            var41 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .r()
               .ae();
         }

         label330: {
            label329: {
               label388: {
                  label327:
                  if (var1 == 0) {
                     if (!((Boolean)var41)) {
                        float var69;
                        var41 = (var69 = var6 - 0.15F) == 0.0F ? 0 : (var69 < 0.0F ? -1 : 1);
                        if (var1 != 0) {
                           break label327;
                        }

                        if (((Boolean)var41)) {
                           float var70;
                           var41 = (var70 = var6 - 0.85F) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
                           if (var1 != 0) {
                              break label327;
                           }

                           if (((Boolean)var41)) {
                              int var18 = 200 + this.g().nextInt(300);
                              long var71;
                              var41 = (var71 = var2 - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll - var18) == 0L
                                 ? 0
                                 : (var71 < 0L ? -1 : 1);
                              if (var1 != 0) {
                                 break label327;
                              }

                              if (((Boolean)var41)) {
                                 float var72;
                                 var41 = (
                                          var72 = this.g().nextFloat()
                                             - lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .t()
                                                .n()
                                       )
                                       == 0.0F
                                    ? 0
                                    : (var72 < 0.0F ? -1 : 1);
                                 if (var1 != 0) {
                                    break label327;
                                 }

                                 if (((Boolean)var41)) {
                                    label315: {
                                       float var73;
                                       int var42 = (var73 = this.a().n() - 20.0F) == 0.0F ? 0 : (var73 < 0.0F ? -1 : 1);
                                       if (var1 == 0) {
                                          if (var42 < 0) {
                                             var10000 = 0.12F;
                                             break label315;
                                          }

                                          var10000 = this.a().n();
                                          if (var1 != 0) {
                                             break label315;
                                          }

                                          float var74;
                                          var42 = (var74 = var10000 - 50.0F) == 0.0F ? 0 : (var74 < 0.0F ? -1 : 1);
                                       }

                                       var10000 = var42 < 0 ? 0.22F : 0.35F;
                                    }

                                    float var19 = var10000
                                       * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .s()
                                          .n();
                                    float var75;
                                    int var60 = (
                                             var75 = this.g().nextFloat()
                                                - lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .u()
                                                   .n()
                                          )
                                          == 0.0F
                                       ? 0
                                       : (var75 < 0.0F ? -1 : 1);
                                    if (var1 == 0) {
                                       var60 = var60 < 0 ? 1 : 0;
                                    }

                                    this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = (var60 != 0);
                                    this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = (this.g().nextFloat() - 0.5F)
                                       * 2.0F
                                       * var19;
                                    this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = (this.g().nextFloat() - 0.5F)
                                       * 2.0F
                                       * var19
                                       * 0.6F;
                                    this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var2;
                                 }
                              }
                           }
                        }
                     }

                     var44 = this;
                     if (var1 != 0) {
                        break label388;
                     }

                     var41 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                  }

                  if (!((Boolean)var41)) {
                     var44 = this;
                     if (var1 != 0) {
                        break label388;
                     }

                     if (Math.abs(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) > 0.05F) {
                        this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI *= 0.5F;
                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl *= 0.5F;
                        var10000 = Math.abs(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
                        var10001 = 0.05F;
                        if (var1 != 0) {
                           break label330;
                        }

                        if (!(var10000 <= 0.05F)) {
                           break label329;
                        }

                        this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
                        if (var1 == 0) {
                           break label329;
                        }
                     }
                  }

                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI *= 0.85F;
                  var44 = this;
               }

               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  * 0.85F;
            }

            var10000 = var16;
            var10001 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         float var24;
         float var25;
         var24 = var10000 + var10001;
         var25 = var17 + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         var46 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .v()
            .ae();
         label286:
         if (var1 == 0) {
            if (!((Boolean)var46)) {
               float var76;
               var46 = (var76 = var6 - 0.3F) == 0.0F ? 0 : (var76 < 0.0F ? -1 : 1);
               if (var1 != 0) {
                  break label286;
               }

               if (((Boolean)var46)) {
                  float var77;
                  var46 = (var77 = var6 - 0.7F) == 0.0F ? 0 : (var77 < 0.0F ? -1 : 1);
                  if (var1 != 0) {
                     break label286;
                  }

                  label280:
                  if (((Boolean)var46)) {
                     int var47 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                     if (var1 == 0) {
                        if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl > 0) {
                           label274: {
                              float var78;
                              int var48 = (var78 = this.a().n() - 20.0F) == 0.0F ? 0 : (var78 < 0.0F ? -1 : 1);
                              if (var1 == 0) {
                                 if (var48 < 0) {
                                    var10000 = 0.35F;
                                    break label274;
                                 }

                                 var10000 = this.a().n();
                                 if (var1 != 0) {
                                    break label274;
                                 }

                                 float var79;
                                 var48 = (var79 = var10000 - 50.0F) == 0.0F ? 0 : (var79 < 0.0F ? -1 : 1);
                              }

                              var10000 = var48 < 0 ? 0.65F : 0.95F;
                           }

                           float var20 = var10000
                              * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .w()
                                 .n();
                           var24 += (this.g().nextFloat() - 0.5F) * 2.0F * var20;
                           var25 += (this.g().nextFloat() - 0.5F) * 2.0F * var20 * 0.6F;
                           int var21 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                           this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var21 + -1;
                           if (var1 == 0) {
                              break label280;
                           }
                        }

                        var47 = 150 + this.g().nextInt(200);
                     }

                     int var26 = var47;
                     long var80;
                     var46 = (var80 = var2 - this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll - var26) == 0L
                        ? 0
                        : (var80 < 0L ? -1 : 1);
                     if (var1 != 0) {
                        break label286;
                     }

                     if (((Boolean)var46)) {
                        float var81;
                        var46 = (
                                 var81 = this.g().nextFloat()
                                    - lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .x()
                                       .n()
                              )
                              == 0.0F
                           ? 0
                           : (var81 < 0.0F ? -1 : 1);
                        if (var1 != 0) {
                           break label286;
                        }

                        if (((Boolean)var46)) {
                           label258: {
                              float var82;
                              int var50 = (var82 = this.a().n() - 20.0F) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
                              if (var1 == 0) {
                                 if (var50 < 0) {
                                    var10000 = 0.3F;
                                    break label258;
                                 }

                                 var10000 = this.a().n();
                                 if (var1 != 0) {
                                    break label258;
                                 }

                                 float var83;
                                 var50 = (var83 = var10000 - 50.0F) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
                              }

                              var10000 = var50 < 0 ? 0.6F : 0.85F;
                           }

                           float var29 = var10000
                              * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .w()
                                 .n();
                           var10000 = this.g().nextFloat();
                           var10001 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .y()
                              .n();
                           if (var1 == 0) {
                              if (var10000 < var10001) {
                                 this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 1 + this.g().nextInt(2);
                              }

                              var24 += (this.g().nextFloat() - 0.5F) * 2.0F * var29;
                              var10000 = var25;
                              var10001 = (this.g().nextFloat() - 0.5F) * 2.0F * var29 * 0.6F;
                           }

                           var25 = var10000 + var10001;
                           this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var2;
                        }
                     }
                  }
               }
            }

            var46 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .z()
               .ae();
         }

         label245: {
            label244: {
               if (var1 == 0) {
                  if (((Boolean)(var46))) {
                     break label244;
                  }

                  var10000 = var6;
                  if (var1 != 0) {
                     break label245;
                  }

                  float var84;
                  var46 = (var84 = var6 - 0.35F) == 0.0F ? 0 : (var84 < 0.0F ? -1 : 1);
               }

               if (((Boolean)var46)) {
                  var10000 = var6;
                  if (var1 != 0) {
                     break label245;
                  }

                  label237:
                  if (var6 < 0.65F) {
                     int var27 = 250 + this.g().nextInt(350);
                     long var85;
                     int var54 = (var85 = var2 - this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI - var27) == 0L
                        ? 0
                        : (var85 < 0L ? -1 : 1);
                     if (var1 == 0) {
                        if (var54 <= 0) {
                           break label237;
                        }

                        var10000 = this.g().nextFloat();
                        if (var1 != 0) {
                           break label245;
                        }

                        float var86;
                        var54 = (
                                 var86 = var10000
                                    - lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .B()
                                       .n()
                              )
                              == 0.0F
                           ? 0
                           : (var86 < 0.0F ? -1 : 1);
                     }

                     if (var54 < 0) {
                        label229: {
                           float var87;
                           int var55 = (var87 = this.a().n() - 20.0F) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
                           if (var1 == 0) {
                              if (var55 < 0) {
                                 var10000 = 0.5F;
                                 break label229;
                              }

                              var10000 = this.a().n();
                              if (var1 != 0) {
                                 break label229;
                              }

                              float var88;
                              var55 = (var88 = var10000 - 50.0F) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
                           }

                           var10000 = var55 < 0 ? 0.9F : 1.3F;
                        }

                        float var30 = var10000
                           * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .A()
                              .n();
                        var24 += (this.g().nextFloat() - 0.5F) * 2.0F * var30;
                        var25 += (this.g().nextFloat() - 0.5F) * 2.0F * var30 * 0.6F;
                        this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var2;
                     }
                  }
               }
            }

            var10000 = Math.abs(
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .c(this.a().l() - var24)
            );
         }

         label215: {
            float var28 = var10000;
            float var31 = Math.abs(this.a().m() - var25);
            if (var1 == 0) {
               label204:
               if (lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .I()
                  .ae()) {
                  float var89;
                  var57 = (var89 = var28 - 1.0F) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
                  label210:
                  if (var1 == 0) {
                     if (((Boolean)var57)) {
                        float var90;
                        var57 = (var90 = var31 - 1.0F) == 0.0F ? 0 : (var90 < 0.0F ? -1 : 1);
                        if (var1 != 0) {
                           break label210;
                        }

                        if (((Boolean)var57)) {
                           break label204;
                        }
                     }

                     var57 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                  }

                  int var22 =((Integer)( var57));
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var22 + 1;
                  var22 = 2 + this.g().nextInt(4);
                  if (var1 == 0) {
                     if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI >= var22) {
                        float var23 = 0.1F
                           * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .J()
                              .n();
                        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = (this.g().nextFloat() - 0.5F) * var23;
                        this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = (this.g().nextFloat() - 0.5F) * var23;
                        this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
                     }

                     var24 += this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                     var25 += this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
                  }

                  if (var1 == 0) {
                     break label215;
                  }
               }

               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
            }

            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.0F;
         }

         label197: {
            var10000 = var6;
            var10001 = 0.85F;
            if (var1 == 0) {
               if (!(var6 > 0.85F)) {
                  break label197;
               }

               var10000 = (var6 - 0.85F) / 0.15F;
               var10001 = 0.0F;
            }

            float var33 = RangesKt.coerceIn(var10000, var10001, 1.0F);
            float var34 = var33 * var33 * (3.0F - 2.0F * var33);
            var24 = this.a(var24, this.a().l(), var34);
            var25 = this.a(var25, this.a().m(), var34);
         }

         this.a(var24, var25);
      }
   }

   @Override
   public void d() {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 1.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0L;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.0F;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0;
   }

   private final float b(float var1, float var2) {
      int var3;
      float var9;
      label113: {
         var3 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
         float var13;
         int var10000 = (var13 = var1 - 5.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 195.0F;
               break label113;
            }

            float var14;
            var10000 = (var14 = var1 - 10.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         }

         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 175.0F;
               break label113;
            }

            float var15;
            var10000 = (var15 = var1 - 20.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
         }

         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 195.0F;
               break label113;
            }

            float var16;
            var10000 = (var16 = var1 - 30.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         }

         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 215.0F;
               break label113;
            }

            float var17;
            var10000 = (var17 = var1 - 45.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
         }

         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 235.0F;
               break label113;
            }

            float var18;
            var10000 = (var18 = var1 - 60.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
         }

         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 250.0F;
               break label113;
            }

            float var19;
            var10000 = (var19 = var1 - 80.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
         }

         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 320.0F;
               break label113;
            }

            float var20;
            var10000 = (var20 = var1 - 100.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
         }

         if (var3 == 0) {
            if (var10000 < 0) {
               var9 = 365.0F;
               break label113;
            }

            var9 = var1;
            if (var3 != 0) {
               break label113;
            }

            float var21;
            var10000 = (var21 = var1 - 120.0F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
         }

         var9 = var10000 < 0 ? 415.0F : 465.0F;
      }

      float var4;
      label67: {
         var4 = var9;
         float var22;
         int var10 = (var22 = var1 - 60.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
         if (var3 == 0) {
            if (var10 > 0) {
               var9 = 0.24F;
               break label67;
            }

            var9 = var1;
            if (var3 != 0) {
               break label67;
            }

            float var23;
            var10 = (var23 = var1 - 45.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
         }

         var9 = var10 > 0 ? 0.34F : 0.3F;
      }

      float var5 = var9;
      float var6 = 1.0F - var5 / 2.0F + this.g().nextFloat() * var5;
      var9 = var1;
      if (var3 == 0) {
         var9 = var1 > 60.0F ? 0.58F : 0.65F;
      }

      float var7 = var9;
      float var8 = (float)Math.pow(RangesKt.coerceAtLeast(var2, 0.1F), var7);
      return RangesKt.coerceIn(var4 * var6 / var8, 60.0F, 850.0F);
   }

   private final float a(float var1) {
      float var5;
      float var8;
      label21: {
         float var3 = var1 * var1 * (3.0F - 2.0F * var1);
         float var4 = 1.0F - var3;
         int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
         var5 = 1.0F - var4 * var4 * var4;
         int var2 = var10000;
         float var9;
         int var7 = (var9 = this.a().n() - 15.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
         if (var2 == 0) {
            if (var7 < 0) {
               var8 = 0.2F;
               break label21;
            }

            var8 = this.a().n();
            if (var2 != 0) {
               break label21;
            }

            float var10;
            var7 = (var10 = var8 - 45.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         }

         var8 = var7 < 0 ? 0.12F : 0.05F;
      }

      float var6 = var8;
      return var5 * (1.0F - var1 * var6) + var1 * var1 * var6;
   }

   private final void c(float var1, float var2) {
      int var3 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      if (var3 != 0) {
         label52:
         if (lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .F()
            .ae()) {
            float var10000 = var1;
            float var10001 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .H()
               .n();
            if (var3 != 0) {
               if (var1 < var10001) {
                  break label52;
               }

               this.a().c(true);
               var10000 = 0.9F;
               var10001 = (var2 - 1.0F) * 0.15F;
            }

            float var4;
            label59: {
               var4 = var10000 + var10001;
               float var18;
               int var16 = (var18 = var1 - 30.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
               if (var3 != 0) {
                  if (var16 < 0) {
                     var10000 = 0.012F;
                     break label59;
                  }

                  float var19;
                  var16 = (var19 = var1 - 60.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
               }

               if (var3 != 0) {
                  if (var16 < 0) {
                     var10000 = 0.02F;
                     break label59;
                  }

                  var10000 = var1;
                  if (var3 == 0) {
                     break label59;
                  }

                  float var20;
                  var16 = (var20 = var1 - 90.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
               }

               var10000 = var16 < 0 ? 0.028F : 0.038F;
            }

            float var5 = var10000
               * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .G()
                  .n()
               * var4;
            float var6 = var5 * (1.0F + this.g().nextFloat() * 0.3F);
            float var7 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c(this.a().l() - this.a().j());
            float var8 = this.a().m() - this.a().k();
            this.a().r()[0] = TuplesKt.to(this.a().j(), this.a().k());
            this.a().r()[3] = TuplesKt.to(this.a().l(), this.a().m());
            float var9 = 0.25F + this.g().nextFloat() * 0.15F;
            float var10 = 0.6F + this.g().nextFloat() * 0.15F;
            float var11 = -var8;
            float var13 = this.g().nextBoolean() ? 1.0F : -1.0F;
            float var14 = var6 * (0.8F + this.g().nextFloat() * 0.4F);
            float var15 = var6 * (0.8F + this.g().nextFloat() * 0.4F);
            this.a().r()[1] = TuplesKt.to(this.a().j() + var7 * var9 + var11 * var14 * var13, this.a().k() + var8 * var9 + var7 * var14 * var13);
            this.a().r()[2] = TuplesKt.to(this.a().j() + var7 * var10 + var11 * var15 * var13, this.a().k() + var8 * var10 + var7 * var15 * var13);
            return;
         }

         this.a().c(false);
      }
   }

   private final Pair<Float, Float> b(float var1) {
      float var2 = 1.0F - var1;
      float var3 = var2 * var2;
      float var4 = var3 * var2;
      float var5 = var1 * var1;
      float var6 = var5 * var1;
      float var7 = var4 * ((Number)this.a().r()[0].getFirst()).floatValue()
         + 3.0F * var3 * var1 * ((Number)this.a().r()[1].getFirst()).floatValue()
         + 3.0F * var2 * var5 * ((Number)this.a().r()[2].getFirst()).floatValue()
         + var6 * ((Number)this.a().r()[3].getFirst()).floatValue();
      float var8 = var4 * ((Number)this.a().r()[0].getSecond()).floatValue()
         + 3.0F * var3 * var1 * ((Number)this.a().r()[1].getSecond()).floatValue()
         + 3.0F * var2 * var5 * ((Number)this.a().r()[2].getSecond()).floatValue()
         + var6 * ((Number)this.a().r()[3].getSecond()).floatValue();
      return TuplesKt.to(var7, var8);
   }

   private final void c(float var1) {
      int var2;
      float var3;
      float var8;
      label69: {
         float var10001;
         label72: {
            int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
            var3 = 0.88F + this.g().nextFloat() * 0.27F;
            var2 = var10000;
            float var12;
            int var6 = (var12 = var1 - 0.15F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            if (var2 != 0) {
               if (var6 < 0) {
                  var8 = 0.92F + var1 / 0.15F * 0.08F;
                  break label69;
               }

               var8 = var1;
               var10001 = 0.85F;
               if (var2 == 0) {
                  break label72;
               }

               float var13;
               var6 = (var13 = var1 - 0.85F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var6 <= 0) {
               var8 = 1.0F;
               break label69;
            }

            var8 = 1.0F;
            var10001 = (var1 - 0.85F) / 0.15F * 0.08F;
         }

         var8 -= var10001;
      }

      float var4 = var8;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3 * var4;
      int var9 = ((lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .C()
         .ae()) ? 1 : 0);
      if (var2 != 0) {
         if (var9 == 0) {
            return;
         }

         long var14;
         var9 = (var14 = System.currentTimeMillis() - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) == 0L
            ? 0
            : (var14 < 0L ? -1 : 1);
      }

      if (var2 != 0) {
         if (var9 < 0) {
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
               * this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            if (var2 != 0) {
               return;
            }
         }

         float var15;
         var9 = (var15 = var1 - 0.2F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var9 <= 0) {
            return;
         }

         float var16;
         var9 = (var16 = var1 - 0.8F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      }

      float var11;
      label75: {
         if (var2 != 0) {
            if (var9 >= 0) {
               return;
            }

            var8 = this.g().nextFloat();
            var11 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .E()
               .n();
            if (var2 == 0) {
               break label75;
            }

            float var17;
            var9 = (var17 = var8 - var11) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
         }

         if (var9 >= 0) {
            return;
         }

         var8 = 1.15F;
         var11 = this.g().nextFloat() * 0.22F;
      }

      float var5 = var8 + var11;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var5
         * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .D()
            .n();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = System.currentTimeMillis() + (40 + this.g().nextInt(60));
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         * this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   private final void h() {
      Object var16 = null; // PX-FIX
      Object var13 = null; // PX-FIX
      float var11 = 0; // PX-FIX
      int var1 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      int var10000 = ((lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .K()
         .ae()) ? 1 : 0);
      if (var1 == 0) {
         if (var10000 == 0) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl *= 0.9F;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI *= 0.9F;
            return;
         }

         float var17;
         var10000 = (var17 = this.a().n() - 15.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      label67: {
         if (var1 == 0) {
            if (var10000 < 0) {
               var11 = 0.6F;
               break label67;
            }

            var11 = this.a().n();
            if (var1 != 0) {
               break label67;
            }

            float var18;
            var10000 = (var18 = var11 - 45.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
         }

         var11 = var10000 < 0 ? 0.9F : 1.3F;
      }

      float var3;
      label59: {
         float var2 = var11;
         var3 = (0.06F + this.g().nextFloat() * 0.08F)
            * var2
            * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .L()
               .n();
         float var12 = this.a().n();
         float var10001 = 45.0F;
         if (var1 == 0) {
            if (var12 > 45.0F) {
               var13 = 0.65F + this.g().nextFloat() * 0.1F;
               break label59;
            }

            var12 = 0.72F;
            var10001 = this.g().nextFloat() * 0.08F;
         }

         var13 = var12 + var10001;
      }

      float var4 =((Float)( var13));
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII += 0.15F;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI += 0.15F;
      float var5 = (float)IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.a(
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, 0.0
      );
      float var6 = (float)IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.a(
         0.0, this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      float var7 = var5 * var3;
      float var8 = var6 * var3 * 0.7F;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            * var4
         + var7 * (1.0F - var4);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            * var4
         + var8 * (1.0F - var4);
      float var14 = this.a().n();
      if (var1 == 0) {
         var14 = var14 > 45.0F ? 0.05F : 0.02F;
      }

      label51: {
         float var9 = var14;
         float var19;
         var10000 = (var19 = this.g().nextFloat() - var9) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
         if (var1 == 0) {
            if (var10000 >= 0) {
               return;
            }

            var16 = this.a().n();
            if (var1 != 0) {
               break label51;
            }

            float var20;
            var10000 = (var20 = ((Float)var16) - 45.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
         }

         var16 = var10000 > 0 ? 0.18F : 0.12F;
      }

      float var10 =((Float)( var16));
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         + (this.g().nextFloat() - 0.5F) * var10;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         + (this.g().nextFloat() - 0.5F) * (var10 * 0.7F);
   }

   private final float a(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "T=\u000e\u0003".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 53;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 53;
         var10006 = var0;
      } else {
         var6 = 53;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 53;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 2;
            case 1 -> 103;
            case 2 -> 73;
            case 3 -> 83;
            case 4 -> 63;
            case 5 -> 29;
            default -> 45;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               break pxClinit; // PX-FIX
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   } // PX-FIX end pxClinit
   }
}
