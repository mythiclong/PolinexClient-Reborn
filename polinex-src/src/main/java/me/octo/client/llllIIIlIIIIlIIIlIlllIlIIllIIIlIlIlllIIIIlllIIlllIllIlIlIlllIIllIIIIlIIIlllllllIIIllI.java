package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI
   extends lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl
   implements IllIIlllIIIllIIIlIllIllIIIlIlIIIIIIlllIlIlIllIIllIlllIlIIlllIIllIIlIIIlIllIIllIIIlllI {
   private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 200;
   private final int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 350;
   private int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 200;
   private final float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 55.0F;
   private final float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 42.5F;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private final float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 45.0F;
   private static String[] f;
   private static String[] g;

   @Override
   public boolean a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4
   ) {
      short var10001 = 18673;
      short var10002 = -12971;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 18676;
      var10002 = 2322;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      return this.a(var1, var2, var3, var4, 1.0F);
   }

   public final boolean a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      float var5
   ) {
      Object var52 = null; // PX-FIX
      float var48 = 0; // PX-FIX
      Object var42 = null; // PX-FIX
      int var37 = 0; // PX-FIX
      Object var35 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      short var10002 = 18675;
      short var10003 = 27239;
      Intrinsics.checkNotNullParameter(var1, "context");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = var10000;
      int var10001 = 18679;
      var10002 = -25080;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      float var63;
      int var34 = (
               var63 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  - this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
            )
            == 0.0F
         ? 0
         : (var63 < 0.0F ? -1 : 1);
      if (var6 != null) {
         var34 = (((var34 == 0) ? 1 : 0));
      }

      float var7;
      label295: {
         if ((var34 == 0)) {
            var7 = 0.15F;
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
                  this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
                  var7
               );
            var35 = Math.abs(
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  - this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
            );
            var48 = 0.5F;
            if (var6 == null) {
               break label295;
            }

            if ((((Boolean)var35) ? 1 : 0) < 0.5F) {
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            }
         }

         var7 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         var35 = var2.e();
         var48 = 40.0F;
      }

      float var8 = ((Float)var35) - var48;
      float var9 = var2.d() + 17.5F;
      int var36 = this.an().length();
      if (var6 != null) {
         var36 = var36 > 0 ? 1 : 0;
      }

      int var10;
      label286: {
         var10 = var36 != 0
            ? (int)(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     this.an(),
                     false, 2, null)
                  + 20
            )
            : 0;
         var37 = var10;
         var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         if (var6 != null) {
            if (var10 < this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               var37 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               break label286;
            }

            var37 = var10;
            if (var6 == null) {
               break label286;
            }

            var10001 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         var37 = var37 > var10001 ? this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll : var10;
      }

      int var11 = var37;
      int var38 = var10;
      if (var6 != null) {
         var38 = var10 > 0 ? var11 : this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      label300: {
         int var12 = var38;
         int var39 = ((this.ae()) ? 1 : 0);
         if (var6 != null) {
            if (var39 !=( (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0)) {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.ae();
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = System.currentTimeMillis();
               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
               var10001 = ((this.ae()) ? 1 : 0);
               if (var6 != null) {
                  var10001 = var10001 != 0 ? var12 : 0;
               }

               label272: {
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10001;
                  llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI var51 = this;
                  if (var6 != null) {
                     if (this.ae()) {
                        var52 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                        break label272;
                     }

                     var51 = this;
                  }

                  var52 = var51.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
               }

               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl =((Float)( var52));
               if (var6 != null) {
                  break label300;
               }
            }

            var39 = ((this.ae()) ? 1 : 0);
         }

         if (var6 != null) {
            if (var39 == 0) {
               break label300;
            }

            var39 = var10;
         }

         label256: {
            var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var6 != null) {
               if (var39 < this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                  var39 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  break label256;
               }

               var39 = var10;
               if (var6 == null) {
                  break label256;
               }

               var10001 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            }

            var39 = var39 > var10001 ? this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll : var10;
         }

         int var13 = var39;
         llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI var40 = this;
         if (var6 != null) {
            if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == var13) {
               break label300;
            }

            var40 = this;
         }

         var40.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var13;
      }

      label243: {
         float var27 = 1.0F;
         llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI var41 = this;
         if (var6 != null) {
            if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
               long var14 = System.currentTimeMillis();
               long var16 = var14 - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
               var27 = RangesKt.coerceIn((float)var16 / this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, 0.0F, 1.0F);
               if (var6 != null) {
                  if (var27 >= 1.0F) {
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
                     this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                     if (var6 != null) {
                        break label243;
                     }
                  }

                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                        this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                        var27
                     );
               }

               if (var6 != null) {
                  break label243;
               }
            }

            var41 = this;
         }

         var41.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      label303: {
         var42 = this.ae();
         if (var6 != null) {
            if (!((Boolean)var42)) {
               float var29 = var8 - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - var7 / 2;
               float var17 = var9 + var7 / 2;
               float var64;
               var42 = (var64 = var3 - var29) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
               if (var6 != null) {
                  if (((Boolean)var42)) {
                     float var65;
                     var42 = (var65 = var3 - (var8 + var7 / 2)) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
                     if (var6 == null) {
                        break label303;
                     }

                     if (((Boolean)var42)) {
                        float var66;
                        var42 = (var66 = var4 - (var17 - this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll / 2))
                              == 0.0F
                           ? 0
                           : (var66 < 0.0F ? -1 : 1);
                        if (var6 == null) {
                           break label303;
                        }

                        if (((Boolean)var42)) {
                           float var67;
                           var42 = (var67 = var4 - (var17 + this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll / 2))
                                 == 0.0F
                              ? 0
                              : (var67 < 0.0F ? -1 : 1);
                           if (var6 == null) {
                              break label303;
                           }

                           if (((Boolean)var42)) {
                              var42 = 1;
                              break label303;
                           }
                        }
                     }
                  }

                  var42 = 0;
               }
               break label303;
            }

            float var68;
            var42 = (var68 = var3 - (var8 - var7 / 2)) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
         }

         label304: {
            if (var6 != null) {
               if (((Boolean)var42)) {
                  break label304;
               }

               float var69;
               var42 = (var69 = var3 - (var8 + var7 / 2)) == 0.0F ? 0 : (var69 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (((Boolean)var42)) {
                  break label304;
               }

               float var70;
               var42 = (var70 = var4 - (var9 - 5)) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (((Boolean)var42)) {
                  break label304;
               }

               float var71;
               var42 = (var71 = var4 - (var9 + var7 + 5)) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label303;
            }

            if (((Boolean)var42)) {
               var42 = 1;
               break label303;
            }
         }

         var42 = 0;
      }

      int var15 =((Integer)( var42));
      short var54 = 18672;
      var10002 = -7541;
      float var30 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "routesearch:hover",
         (var15 != 0),
         0.0F,
         4,
         null
      );
      var54 = 18674;
      var10002 = 15981;
      float var31 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a("routesearch:focus", this.ae(), 14.0F);
      float var18 = Math.max(var30 * 0.55F, var31 * 0.7F);
      float var72;
      int var43 = (var72 = var18 - 0.01F) == 0.0F ? 0 : (var72 < 0.0F ? -1 : 1);
      if (var6 != null) {
         label189:
         if (var43 > 0) {
            if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI > 0) {
               float var19 = var8 - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - var7 / 2;
               float var20 = var9 + var7 / 2;
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  var19,
                  var20 - this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll / 2,
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI + var7,
                  this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
                  6.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah(),
                  var18,
                  4.0F);
               if (var6 != null) {
                  break label189;
               }
            }

            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var8 - var7 / 2 - 5,
               var9,
               var7,
               var7,
               12.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var18,
               4.0F);
         }

         var43 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      label183:
      if (var6 != null) {
         if (var43 > 0) {
            float var32 = var8 - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - var7 / 2;
            float var33 = var9 + var7 / 2;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var32,
               var33 - this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll / 2,
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI + var7,
               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j()
                  .a(var5 * 0.9F),
               6.0F
            );
            float var73;
            var43 = (var73 = var5 - 0.0F) == 0.0F ? 0 : (var73 < 0.0F ? -1 : 1);
            if (var6 == null) {
               break label183;
            }

            if (var43 > 0) {
               int var21 = (int)var33 - 9;
               int var22 = (int)var32 + 10;
               float var23 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - 20.0F;
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a((float)var22, (float)var21, var23, 20.0F);
               int var44 = this.an().length();
               if (var6 != null) {
                  var44 = var44 > 0 ? 1 : 0;
               }

               label176: {
                  if (var44 != 0) {
                     float var24 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                        this.an(),
                        false, 2, null);
                     float var25 = var24 - var23;
                     float var74;
                     int var45 = (var74 = var25 - 0.0F) == 0.0F ? 0 : (var74 < 0.0F ? -1 : 1);
                     if (var6 != null) {
                        var45 = var45 > 0 ? var22 - (int)var25 : var22;
                     }

                     int var26 = var45;
                     llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI var46 = this;
                     if (var6 != null) {
                        if (this.ag().a()) {
                           lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var26, var21, Math.min(var24, var23), 16.0F);
                        }

                        var46 = this;
                     }

                     var46.a(var1, this.an(), var26, var21);
                     if (var6 != null) {
                        break label176;
                     }
                  }

                  var54 = 18677;
                  var10002 = 26664;
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     "Search routes...",
                     var22,
                     var21,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .a(var5 * 0.7F),
                     false, 16, null);
                  this.a(var22, var21);
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .i();
            }
         }

         var43 = ((this.ae()) ? 1 : 0);
      }

      if (var6 != null) {
         if (var43 == 0) {
            int var47 = this.an().length();
            if (var6 != null) {
               var47 = var47 == 0 ? 1 : 0;
            }

            if (var47 != 0) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var8 - var7 / 2 - 5,
                  var9,
                  var7,
                  var7,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .j()
                     .a(var5 * 0.7F),
                  12.0F
               );
            }
         }

         var54 = 18678;
         var10002 = -5021;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            "\n        <svg viewBox=\"0 0 2048 2048\" fill=\"currentColor\">\n            <path d=\"m884 253h71l34 3 41 5 28 5 30 7 32 9 38 13 22 9 33 15 32 16 24 14 12 8 16 11 15 11 12 9 11 9 14 12 10 9 11 10 2 1v2l4 2 36 36 7 8 10 11 7 8 13 16 14 19 13 18 10 15 13 21 12 21 14 27 12 25 11 27 10 27 10 31 9 35 6 30 6 40 3 29 1 14v70l-3 41-5 39-4 23-7 33-7 28-9 28-12 35-17 40-16 32-16 28-8 12-16 23-8 11-9 12-11 14-11 13-7 8-15 16-43 43-11 9-9 8-10 8-16 13-15 12-15 10-26 16-22 13-23 13-31 15-25 10-35 13-53 15-29 7-33 6-35 5-46 4h-41l-37-3-63-9-29-6-36-10-43-15-21-8-26-12-28-14-23-13-23-14-16-10-14-10-14-11-13-10-16-13-13-11-15-14-9-9-8-7-19-19-7-8-10-10-7-8-11-13-13-17-10-14-20-30-13-21-12-23-10-19-14-30-11-27-14-41-8-29-13-62-6-37-3-29v-96l4-44 7-42 8-36 9-32 11-33 8-21 13-30 12-26 10-19 14-25 14-22 8-12 9-12 13-18 12-15 18-22 7-7 7-8 30-30 8-7 13-12 8-7 18-14 17-12 20-14 17-11 28-17 25-14 16-8 19-9 27-11 36-12 36-10 21-5 41-7 49-6zm16 189-34 3-39 6-26 6-29 9-31 11-21 9-22 11-18 10-16 10-23 16-11 8-13 10-16 15-20 18-7 8-3 3v2h-2l-7 8-9 10-8 10-11 14-10 12-11 15-13 22-14 27-12 25-12 29-9 25-6 21-5 25-4 28-4 36-1 34 2 38 4 33 5 26 8 30 10 30 11 28 12 26 10 19 9 16 18 27 10 14 11 13 7 8 9 10 11 12 6 7 8 7 12 12 8 7 12 11 17 13 21 14 17 11 27 15 29 14 36 15 20 6 36 9 38 6 31 3 13 1h28l5-1 38-1 33-5 36-9 29-9 29-11 23-11 16-7 16-9 24-14 16-10 16-12 13-11 11-9 15-13 33-33 8-10 14-17 13-18 12-19 12-21 16-32 12-29 9-25 8-29 8-34 4-22 3-35v-52l-1-28-3-24-7-34-8-28-14-41-14-33-16-32-13-23-18-27-11-14-13-16-14-15-11-12-13-13-8-7-13-12-13-10-19-13-16-11-15-9-18-10-25-12-34-14-37-12-28-7-35-7-32-4-16-1z\"/>\n            <path d=\"m1547 1336h7l10 4 16 10 13 10 20 18 44 44 7 8 15 16 97 97v2h2v2h2l7 8 9 10 8 10 11 14 10 15 7 15 5 15 2 13v20l-3 21-4 15-8 18-9 16-8 11-8 10-14 14-19 14-17 9-21 8-22 5-5 1h-20l-24-5-15-5-11-6-9-7-10-9-26-26-12-11-15-15-8-7-18-18-3-2v-2l-4-2-8-8v-2l-4-2-76-76v-2l-4-2-34-34-8-7-14-14-5-10-1-4v-10l5-14 6-16 12-21 12-15 9-11 6-7h2l2-4 48-48 8-7 10-9 14-11 13-10 13-8z\"/>\n            <path d=\"m748 557 19 1 18 5 16 8 13 12 9 13 6 13 3 11v19l-5 15-13 23-12 16-7 8-10 8-17 13-8 6-14 11-13 13-8 7-19 19-7 8-10 11-8 11-12 15-12 17-8 16-7 13-9 12-5 4-11 4-9 2h-13l-13-2-12-4-12-7-11-9-8-9-8-13-3-9-2-11v-11l2-17 6-25 7-16 8-16 12-20 12-17 9-12 9-10 10-13 11-12 5-6 7-6 7-8 39-39 8-7 9-8 16-11 16-8 22-7z\"/>\n            <path d=\"m1178 1010 20 1 14 4 14 7 10 8 9 10 7 11 5 11 2 9v19l-3 17-6 20-8 19-7 11-8 12-9 12-9 11-12 12-7 8-13 12-4 5-8 7-10 8-16 9-18 8-20 6-6 1h-20l-10-3-13-7-12-11-6-7-8-13-5-15-3-17v-8l5-22 5-17 8-16 8-14 10-15 8-11 9-11 10-11 7-8 7-7 11-9 8-7 14-10 18-10 11-5 11-3z\"/>\n        </svg>\n    ",
            var8 - var7 / 2 - 4,
            var9,
            var7,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .a(var5),
            0.0F);
         var43 = var15;
      }

      return (var43 != 0);
   }

   @Override
   public void e() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      boolean var10001 = this.ae();
      if (var1 != null) {
         var10001 = !var10001;
      }

      this.a(var10001);
      llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI var10000 = this;
      if (var1 != null) {
         if (this.ae()) {
            return;
         }

         var10000 = this;
      }

      var10000.ag().b();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "\u0094\u0014\u009a¢\u001bº\u001aÃ\u0014aïôÎ/i<\n½×¨Ç\u0002µ\u0083\u0087ù\u008a\n§xë2j\u000b\u008ePXpੀ c/ó\u0087À¢\u009fL»EÜhUsûã×\u0091¶\u0016ê\u008b§¬\u0094+ÀòD\u0000\u0081k\u009e{^ã\u0084ç»\u0080\tOþ@W\u0013ùmî\fm\u008f\u008c¦T÷\u0094ÂÐU¤ø\u0013\u00076\u007f¤QÆ\u00adÜ±ÚZÄÇ\u001aýÙÓ\u00038=\u009b;2»Û¯yË\u0017ü\fx?8q\u0089\\®Ls\u008bçi\f¢\u0092ï\u0000\u009c\n¶\u0097´eÜZ\u0089\f\u009d\u0080\u001f\u0012-ZØÇ\b&FptH`*¤$Õ\u0088¾\t¡¬á\u0000\u0017\u001c}ë\u0007\u001c¢\u008a3ì\u0011\u0010Ö\u0094ñä³Í\u0081ë\u009ctô;üòÙê¤\u001b8@©i¹5H(X\u0099I\u00871¤ø \u0080\u0096Ó\u000fª~tg\u00ad¬»°+t6ÜK\u0093\u000eî²P \u008dñå«Íø\u008b\u008eZ@ÀY!`\u0090?UK¨Ïtt\u0086éLJ\u0004½\u0014\u009cµ\u001d\u0084?ÐS@/Ç¥RÕIµ-ÍÕ4ª\u0014\u001dp-_:®\u0090)V\u0089¨\u0098\u0017pêiÃ^·³qGo\u0006.~PXc[óÉÐý\u009c§¤r¦Û\u0086ÞÜê\u0085³·;§ÓÅôA\u0006ÖãÛTÊDcÉ¶G.\u0091´ð¢5«ê·=äÝ\u0003þ>þ\u0096\"\u0095¿\f\u0018-\u0080\u000bÙå\u0099Ûk\u000b¯rÈe\u008b+NØ7\u0096ì¸CÏåm(è8.oj\u0081à\u0084c\u001d0\\é?\u0007§A\u0011+CÀcr\u0095\u0080áO±HQ0^\u0086Yè¥,8|Ù`\u008f>¨{Ûó$ó \u0019\u0091L\u0086adñË\u009f{ô\u000e¿Ë\u009d§hyù¸\u0019C\u0006Z»\u000fÎ?3(E¨Äñ?:\u00186\u0083öJ·?|»\u0094\u009cE-ì\u0004þ\u0087üÑ\u0094Pi×$È\u0016?3ÍT*Õ$\u001d¡[[\u0012\u0080´ªÏi!\u0005¶oUì\u0088%\u0091 \u000e`s2kGæ\u0007e\u009c\u0086¬Bf\bn)\u0097ûr+væúú\u0003D\u008fRÂ¿Î/:r~hÙ&\u0004pj·Ñ\u001dø¡\u001eX'¬íjgÍ9\u0084\u0001\u0001\u0003|Ýe\u00023¨Çtþâßù\u0091\u0082ïÐÏ!ßsÞ2 «\u00ad\r^\u0000É\u0003UÅ\u000bÒX\u0080\u008bÍW\u0082\u001fí \u000f÷\u0082S:Þ\u0090[mMX\\\u009eUSûQY{\u0015à½D\u008d®Çõ¤`yµWYK\u00adkÙé\u009bWh4îÕæÞ\u008bû-¢J\u008es;ÏGøçøXu\u0097yrVqìÿ¾ájÓôCqª¨Syo\u008a\"å\u0087\u000b\u0017»Ñ\u009c\u009b\u0096sY¯\u0092fvÒ\u0096©6\u0098\u0094»us\u008a)\u0081ó\u0017\u008aÝ\u000eÝgy;@ÑàÌÉÀ\u008fÄ>\u008bQW^ÊØ\u008eD_-ï\u0018\u008c\u0083¡K]>&\u009b8\u009bÐ®^tª\u00854\u001c\u008aéJæ§(g#<Eµ^éF\u009b¯¥\u009a!¿\u0090®Ut¨\u0084t\u001d\u0084ÉNâD¨\u00173¿GÅ\u0011çGH^\u009bDaÒ»>\"äW(µ\u008e\u0002aÌpGâ\\\fÒ\u0012\u0094\u0018Øº\t»\u008d\u0092\u0018>`akñ\u001fÝ²\u0084}C'4¾ic\u0014 @l\rìÁ\u00901+üèJ\u008co\tÞI|E+\u001c\u0019\u000b\u001c;lÓµ8U ªu\u0091 \u001aN\u009dDá\u001ey±\u001c÷,7&RqÌ×\u000b^\u007fÓIÖ\u008e|©\u001e\u0004/n\u0002~pýgÇ~\\Ë\u0089<$\u0015®\u0090HM§\fÑ<I\u0007ZÚ\u0003%òî^ß\ròËã¯ñ\u00ad©\u0093bW\u001d\u0091á\u008b$\u009aKQÁFzm(\u0019j\u0097 Fl\u008c,ð\u0081\u007frâ$fZ\"\u001aÛe#\u009fë@'#\u009ef/z\u0006N§\u008cr¢Áçh×>¾f¿Þ¯LÓÞX\u008a\u0097\u0017K}\u0081\u0003QÌF_m\u008c\u0010æ\u0082(h.:Hxöåj \u000eÆGØ\u0089Þ<Ò¾\u0086ZÀÕ]Í\u0098ó¸q1\u009a´Ý©#ËFtÁ²öl\u0094W\u0085\u0012ª6\u0097QÙ\u0012{¬\u0089+ úm\u00042gëÏ\u009eá\"µvÄ\u009c\u0017\u009bÇï\u008ap\u0002\u0099)d«Ýêñ\u008a,\u0017)Â\u008dZóC\u0019ôX\u0013zå|þ#xÂnÖÂÞ#©éd®§\u0006z\u0091ÓsÎ\u0010\u008dpÓ²(ú\r8=t*þÐô\b\u0001 \u009e«TaÞW«gfyç3c\bÒ·ÏÝì5Ì:Üóg9@&§ÆQÔM\u0082ÜÝ--\u008eÐY(qB\u009aõ\u001eq\u008a\u00840\u0092\bw[\u0099æÄKÐ9\u0085\u0082\u0018sIvTI\u0099\u009aa\u0013%G\u001b\u008a½\u0010\u0003z|ñ´\u009cÊÜçcC\u0016ª\u009a~k\u0088\u008e\u0017Ã\u0014éæ¤ïÞZÔï.\u0081C\u000fý\u000e\u000bø&ÝÆ¸¹²9<{I5m\u001fx\u001b¸\u0015ôw¡Åç1 ]ú\u001fD¡)\u0093%\u0013bi&Ò\u001b×\u0013lDó»7Ü\u008aºö0#w¦Þì² Ä|\u009aî×Ñ\u0090\"ËÉÏ\u00adß\u0081Ða®llÔl6Äjô\u0088;\u0015ÚÖÛOB\u0080]\u009d÷O\u0019>\u0018\u009e´\bxü\u0085\u008eQ\u001ejp\u00171\u008bðãø|\u001dK¶_ð®\u001a\u000ez\"F\u000f\u000b~\u0087\u0015àWà0ÿÕÙD×k\u0016r\u0099}vñéb\u0001£<Nkh\u008a\f\u007ffM¦ñ\bü\u0012§dÃ¬GK\u000eÐÐõØ8\u0018k¦Í¾¡\n´s«Hä.Àüó&À-¹å7Ð ½nH\u0010\u00899\u00173\u0017\u001d?#Õ]\u009c¾³\u008b¨\u009f¬èt¼Ç\u0096\u009450Ì\\F\u000b¸_1\u0011\u0018k\t\u0001¬\u0084ÿ\u000f$\u0002py(8\"\u0019}É\u0016¤-w#î\b\u0018\u00ad\n&\u0082\u009c»hÏø\u0080ÃÒn|Raë\u008b5\u0012?\u0006w\u0082ãî.ZÝ\u001f$\u0081:bÀH\u001cHï\u0096qP+\u0090\t#n\u0011ê¬í\u0019ÿú\u0094\u001b\u0087Óº+ï7ýèØGie|8¤3\u001b7Ý¤l\u008fÁ]U\u0001n%Áf&®\u0097\u0087\u007fý\u0088\u0086e]3;Dß\u0000õY8î\bËJYú>\u001d2÷Û\u009cîÑi(y\u0090]\u009fúetÚ\u0005\n\u0099\u0003\u0087{±ÃôÆ(J.¿Z3à\u0007>øÒ\u0093]¯un©O\u0006èo\u0012MözT\u0013\u009b\u009cþ\u0093µïxhK´½n\"¾Ä®³Ç2Y'-\u0085¥¼Þ\u008f\f|ø\u001c9P\u0003[24é#9ÐH\u00adåbá\u0015\u0001l8\u0097¾¹?´\u009aÿ¹%¬Q¬ñ\u0015Î\u0084gyMh¶\u0092ðgë\u0097£r-h\u0095ãpØ\n\u0014\u0003$\nZ\u009eË£GR\u001al\u001f\u009c\u0010\u0018»³\\*?£^d>p_í7Ú£ÞJ=V½ì¬3\u001c\u008aÝ^írmp\u0088\n»\u0005ÕWü\u0006ÁÏn@\u001d6\u0082À~\u001aokü®-&Æd²\u0094\u008c\u0012@d¶dwíñÈC\u009a±p+·ÿ×_\u009dôÜås\b³G×Èù\u001b\u009ai9óüócô_wG©[¤\bkX°¡ìÊ\u0098YÜ»M_øa\u000bÔ\u001aèÃDS»*Ö Ùu\u009e¥¹Kéäl\b«<\u001cü#\u0091'÷ßa\u0099\u0092aÕ4î\u0019¿\u009d¹dñÖ\u0080f«\u0083<\u009b\u0086\u001c_«·çN\u001f²\u0098ÛjüwÓB\u0016ö6Oíq\"Fé©Ú?<1å³ýÂÀ\fBðÅ.?½¢M\u0014\u0092¯â=¤\u009eãS\u0088R:}Ë\u0090§þ@\u0086Jqè<¢\rFIdA?pÛ%Ë(%ÒZÐ^\u008bì ¤G-ÒNöËs\u0015\u0080\u0016HP\u008f\u0001\u0090\u008c\u0013ûÐ±Ii¤\u0089ó\u00ad\r5Ø\u008d\tô\u0080Þ\u0010ºÄZòr\u0082ÃCèN¤úü÷óºÊçÕ lê!WN0\u0007\u001b¿cR\u000bò\u000eo?B·A9õæ\u0090\u008fµ\u009bJ°¶úo\u0003\u0018xß\u008fî×!\u0013\u0085*¯5Ó¼\u008f*2ñ«\u0087\u000f\u0005\u0016cT\u009fLV¸køn2k\u0096xö^\u0083\u009413\"Y+q\u008d\u009ae\n9\u0099ª¤À²\u000euó\u0013>Û\u009e\u0094\u007f\u001c\\ú²tK\u001c \u0081e´¤ü\bB\u008cz\u0007i\u0096\f\u0083z/iQº¸Ö\u0005K*\u009c½\u0004ÌBâz594I\u0094\u0097\u0018Èû\u008c\u000b\u0011ö\u0018õu7ò\u0094 \u001c\u001e\u008a\u001bÅ*ô\u009eBZ¸)©w²ö\u0002A\"\u0096\u0016I\u008a£À7x±\u0095à\u0015Ð5\u0080ßbé\b\u0080a\u009d~$\u0087Óo:G&íÜn\u0010\u009c=ÁÄ0ÿ\u0093\u009dÎáu4É\u001c[Ù(\u008f;¥^ÇF\u008bO ë°\u009a×6«rAÆt\u0085pñ\u00067U(\u001eNzü·ä\u0085\u001cÉ¨+SÄA\u008aQÄ\f\u0085²ùùS\u009aÌ4GöhË&\u008c\u009d\u0004n\rÿ4Ù\u0096\b3²\u009b}gö\u0097\u0000\u007fXe\u0019B\u008fçB\u0085{\u009b8ál>\u008fDä\u001e¯d\u0003à´¸Þ\u0097mðÁ\u0098\u0081'\u0010¸Úä8:m\u0099r³9Püÿí<\tj\u00981æ\u001f\u0007c\u0016Jº¦\u00adN\u008f{x¿þÖí!â\u0005ÿÇ\u008d\u0097\u0005\u001a\u0014\u0097Ûg¡aá»\u001a eU½õ:\u001b ÖkO\u0082]jïì\u009c\u009eòpK·Z\u0098ø£4\u0088Ã°0\u0004v\nÚ¹ A\u0084ý«\u0094\"\u0015\u0018\u0016ív¦\u008bu5¼R\u0001lTä\u009b<}Äj£Ò\u0016ä\u0090\u001b\n+ÑË<U\u00827Ù\u0016Y|\u0007\u0016ôóóÞF0\u0011\\\u009e\u0092¾\u008aä«cÒ\u0012\u0095\u0011\u0005f07\u009c";
      int var4 = "\u0094\u0014\u009a¢\u001bº\u001aÃ\u0014aïôÎ/i<\n½×¨Ç\u0002µ\u0083\u0087ù\u008a\n§xë2j\u000b\u008ePXpੀ c/ó\u0087À¢\u009fL»EÜhUsûã×\u0091¶\u0016ê\u008b§¬\u0094+ÀòD\u0000\u0081k\u009e{^ã\u0084ç»\u0080\tOþ@W\u0013ùmî\fm\u008f\u008c¦T÷\u0094ÂÐU¤ø\u0013\u00076\u007f¤QÆ\u00adÜ±ÚZÄÇ\u001aýÙÓ\u00038=\u009b;2»Û¯yË\u0017ü\fx?8q\u0089\\®Ls\u008bçi\f¢\u0092ï\u0000\u009c\n¶\u0097´eÜZ\u0089\f\u009d\u0080\u001f\u0012-ZØÇ\b&FptH`*¤$Õ\u0088¾\t¡¬á\u0000\u0017\u001c}ë\u0007\u001c¢\u008a3ì\u0011\u0010Ö\u0094ñä³Í\u0081ë\u009ctô;üòÙê¤\u001b8@©i¹5H(X\u0099I\u00871¤ø \u0080\u0096Ó\u000fª~tg\u00ad¬»°+t6ÜK\u0093\u000eî²P \u008dñå«Íø\u008b\u008eZ@ÀY!`\u0090?UK¨Ïtt\u0086éLJ\u0004½\u0014\u009cµ\u001d\u0084?ÐS@/Ç¥RÕIµ-ÍÕ4ª\u0014\u001dp-_:®\u0090)V\u0089¨\u0098\u0017pêiÃ^·³qGo\u0006.~PXc[óÉÐý\u009c§¤r¦Û\u0086ÞÜê\u0085³·;§ÓÅôA\u0006ÖãÛTÊDcÉ¶G.\u0091´ð¢5«ê·=äÝ\u0003þ>þ\u0096\"\u0095¿\f\u0018-\u0080\u000bÙå\u0099Ûk\u000b¯rÈe\u008b+NØ7\u0096ì¸CÏåm(è8.oj\u0081à\u0084c\u001d0\\é?\u0007§A\u0011+CÀcr\u0095\u0080áO±HQ0^\u0086Yè¥,8|Ù`\u008f>¨{Ûó$ó \u0019\u0091L\u0086adñË\u009f{ô\u000e¿Ë\u009d§hyù¸\u0019C\u0006Z»\u000fÎ?3(E¨Äñ?:\u00186\u0083öJ·?|»\u0094\u009cE-ì\u0004þ\u0087üÑ\u0094Pi×$È\u0016?3ÍT*Õ$\u001d¡[[\u0012\u0080´ªÏi!\u0005¶oUì\u0088%\u0091 \u000e`s2kGæ\u0007e\u009c\u0086¬Bf\bn)\u0097ûr+væúú\u0003D\u008fRÂ¿Î/:r~hÙ&\u0004pj·Ñ\u001dø¡\u001eX'¬íjgÍ9\u0084\u0001\u0001\u0003|Ýe\u00023¨Çtþâßù\u0091\u0082ïÐÏ!ßsÞ2 «\u00ad\r^\u0000É\u0003UÅ\u000bÒX\u0080\u008bÍW\u0082\u001fí \u000f÷\u0082S:Þ\u0090[mMX\\\u009eUSûQY{\u0015à½D\u008d®Çõ¤`yµWYK\u00adkÙé\u009bWh4îÕæÞ\u008bû-¢J\u008es;ÏGøçøXu\u0097yrVqìÿ¾ájÓôCqª¨Syo\u008a\"å\u0087\u000b\u0017»Ñ\u009c\u009b\u0096sY¯\u0092fvÒ\u0096©6\u0098\u0094»us\u008a)\u0081ó\u0017\u008aÝ\u000eÝgy;@ÑàÌÉÀ\u008fÄ>\u008bQW^ÊØ\u008eD_-ï\u0018\u008c\u0083¡K]>&\u009b8\u009bÐ®^tª\u00854\u001c\u008aéJæ§(g#<Eµ^éF\u009b¯¥\u009a!¿\u0090®Ut¨\u0084t\u001d\u0084ÉNâD¨\u00173¿GÅ\u0011çGH^\u009bDaÒ»>\"äW(µ\u008e\u0002aÌpGâ\\\fÒ\u0012\u0094\u0018Øº\t»\u008d\u0092\u0018>`akñ\u001fÝ²\u0084}C'4¾ic\u0014 @l\rìÁ\u00901+üèJ\u008co\tÞI|E+\u001c\u0019\u000b\u001c;lÓµ8U ªu\u0091 \u001aN\u009dDá\u001ey±\u001c÷,7&RqÌ×\u000b^\u007fÓIÖ\u008e|©\u001e\u0004/n\u0002~pýgÇ~\\Ë\u0089<$\u0015®\u0090HM§\fÑ<I\u0007ZÚ\u0003%òî^ß\ròËã¯ñ\u00ad©\u0093bW\u001d\u0091á\u008b$\u009aKQÁFzm(\u0019j\u0097 Fl\u008c,ð\u0081\u007frâ$fZ\"\u001aÛe#\u009fë@'#\u009ef/z\u0006N§\u008cr¢Áçh×>¾f¿Þ¯LÓÞX\u008a\u0097\u0017K}\u0081\u0003QÌF_m\u008c\u0010æ\u0082(h.:Hxöåj \u000eÆGØ\u0089Þ<Ò¾\u0086ZÀÕ]Í\u0098ó¸q1\u009a´Ý©#ËFtÁ²öl\u0094W\u0085\u0012ª6\u0097QÙ\u0012{¬\u0089+ úm\u00042gëÏ\u009eá\"µvÄ\u009c\u0017\u009bÇï\u008ap\u0002\u0099)d«Ýêñ\u008a,\u0017)Â\u008dZóC\u0019ôX\u0013zå|þ#xÂnÖÂÞ#©éd®§\u0006z\u0091ÓsÎ\u0010\u008dpÓ²(ú\r8=t*þÐô\b\u0001 \u009e«TaÞW«gfyç3c\bÒ·ÏÝì5Ì:Üóg9@&§ÆQÔM\u0082ÜÝ--\u008eÐY(qB\u009aõ\u001eq\u008a\u00840\u0092\bw[\u0099æÄKÐ9\u0085\u0082\u0018sIvTI\u0099\u009aa\u0013%G\u001b\u008a½\u0010\u0003z|ñ´\u009cÊÜçcC\u0016ª\u009a~k\u0088\u008e\u0017Ã\u0014éæ¤ïÞZÔï.\u0081C\u000fý\u000e\u000bø&ÝÆ¸¹²9<{I5m\u001fx\u001b¸\u0015ôw¡Åç1 ]ú\u001fD¡)\u0093%\u0013bi&Ò\u001b×\u0013lDó»7Ü\u008aºö0#w¦Þì² Ä|\u009aî×Ñ\u0090\"ËÉÏ\u00adß\u0081Ða®llÔl6Äjô\u0088;\u0015ÚÖÛOB\u0080]\u009d÷O\u0019>\u0018\u009e´\bxü\u0085\u008eQ\u001ejp\u00171\u008bðãø|\u001dK¶_ð®\u001a\u000ez\"F\u000f\u000b~\u0087\u0015àWà0ÿÕÙD×k\u0016r\u0099}vñéb\u0001£<Nkh\u008a\f\u007ffM¦ñ\bü\u0012§dÃ¬GK\u000eÐÐõØ8\u0018k¦Í¾¡\n´s«Hä.Àüó&À-¹å7Ð ½nH\u0010\u00899\u00173\u0017\u001d?#Õ]\u009c¾³\u008b¨\u009f¬èt¼Ç\u0096\u009450Ì\\F\u000b¸_1\u0011\u0018k\t\u0001¬\u0084ÿ\u000f$\u0002py(8\"\u0019}É\u0016¤-w#î\b\u0018\u00ad\n&\u0082\u009c»hÏø\u0080ÃÒn|Raë\u008b5\u0012?\u0006w\u0082ãî.ZÝ\u001f$\u0081:bÀH\u001cHï\u0096qP+\u0090\t#n\u0011ê¬í\u0019ÿú\u0094\u001b\u0087Óº+ï7ýèØGie|8¤3\u001b7Ý¤l\u008fÁ]U\u0001n%Áf&®\u0097\u0087\u007fý\u0088\u0086e]3;Dß\u0000õY8î\bËJYú>\u001d2÷Û\u009cîÑi(y\u0090]\u009fúetÚ\u0005\n\u0099\u0003\u0087{±ÃôÆ(J.¿Z3à\u0007>øÒ\u0093]¯un©O\u0006èo\u0012MözT\u0013\u009b\u009cþ\u0093µïxhK´½n\"¾Ä®³Ç2Y'-\u0085¥¼Þ\u008f\f|ø\u001c9P\u0003[24é#9ÐH\u00adåbá\u0015\u0001l8\u0097¾¹?´\u009aÿ¹%¬Q¬ñ\u0015Î\u0084gyMh¶\u0092ðgë\u0097£r-h\u0095ãpØ\n\u0014\u0003$\nZ\u009eË£GR\u001al\u001f\u009c\u0010\u0018»³\\*?£^d>p_í7Ú£ÞJ=V½ì¬3\u001c\u008aÝ^írmp\u0088\n»\u0005ÕWü\u0006ÁÏn@\u001d6\u0082À~\u001aokü®-&Æd²\u0094\u008c\u0012@d¶dwíñÈC\u009a±p+·ÿ×_\u009dôÜås\b³G×Èù\u001b\u009ai9óüócô_wG©[¤\bkX°¡ìÊ\u0098YÜ»M_øa\u000bÔ\u001aèÃDS»*Ö Ùu\u009e¥¹Kéäl\b«<\u001cü#\u0091'÷ßa\u0099\u0092aÕ4î\u0019¿\u009d¹dñÖ\u0080f«\u0083<\u009b\u0086\u001c_«·çN\u001f²\u0098ÛjüwÓB\u0016ö6Oíq\"Fé©Ú?<1å³ýÂÀ\fBðÅ.?½¢M\u0014\u0092¯â=¤\u009eãS\u0088R:}Ë\u0090§þ@\u0086Jqè<¢\rFIdA?pÛ%Ë(%ÒZÐ^\u008bì ¤G-ÒNöËs\u0015\u0080\u0016HP\u008f\u0001\u0090\u008c\u0013ûÐ±Ii¤\u0089ó\u00ad\r5Ø\u008d\tô\u0080Þ\u0010ºÄZòr\u0082ÃCèN¤úü÷óºÊçÕ lê!WN0\u0007\u001b¿cR\u000bò\u000eo?B·A9õæ\u0090\u008fµ\u009bJ°¶úo\u0003\u0018xß\u008fî×!\u0013\u0085*¯5Ó¼\u008f*2ñ«\u0087\u000f\u0005\u0016cT\u009fLV¸køn2k\u0096xö^\u0083\u009413\"Y+q\u008d\u009ae\n9\u0099ª¤À²\u000euó\u0013>Û\u009e\u0094\u007f\u001c\\ú²tK\u001c \u0081e´¤ü\bB\u008cz\u0007i\u0096\f\u0083z/iQº¸Ö\u0005K*\u009c½\u0004ÌBâz594I\u0094\u0097\u0018Èû\u008c\u000b\u0011ö\u0018õu7ò\u0094 \u001c\u001e\u008a\u001bÅ*ô\u009eBZ¸)©w²ö\u0002A\"\u0096\u0016I\u008a£À7x±\u0095à\u0015Ð5\u0080ßbé\b\u0080a\u009d~$\u0087Óo:G&íÜn\u0010\u009c=ÁÄ0ÿ\u0093\u009dÎáu4É\u001c[Ù(\u008f;¥^ÇF\u008bO ë°\u009a×6«rAÆt\u0085pñ\u00067U(\u001eNzü·ä\u0085\u001cÉ¨+SÄA\u008aQÄ\f\u0085²ùùS\u009aÌ4GöhË&\u008c\u009d\u0004n\rÿ4Ù\u0096\b3²\u009b}gö\u0097\u0000\u007fXe\u0019B\u008fçB\u0085{\u009b8ál>\u008fDä\u001e¯d\u0003à´¸Þ\u0097mðÁ\u0098\u0081'\u0010¸Úä8:m\u0099r³9Püÿí<\tj\u00981æ\u001f\u0007c\u0016Jº¦\u00adN\u008f{x¿þÖí!â\u0005ÿÇ\u008d\u0097\u0005\u001a\u0014\u0097Ûg¡aá»\u001a eU½õ:\u001b ÖkO\u0082]jïì\u009c\u009eòpK·Z\u0098ø£4\u0088Ã°0\u0004v\nÚ¹ A\u0084ý«\u0094\"\u0015\u0018\u0016ív¦\u008bu5¼R\u0001lTä\u009b<}Äj£Ò\u0016ä\u0090\u001b\n+ÑË<U\u00827Ù\u0016Y|\u0007\u0016ôóóÞF0\u0011\\\u009e\u0092¾\u008aä«cÒ\u0012\u0095\u0011\u0005f07\u009c"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 52;
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
                     case 0 -> 53;
                     case 1 -> 67;
                     case 2 -> 68;
                     case 3 -> 65;
                     case 4 -> 92;
                     case 5 -> 32;
                     default -> 111;
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
                     f = var5;
                     g = new String[8];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0017nºÉ\u009ehQ\u0011\u0080Ú`_½±$ J\u0003ïZ-f\u0086N\u0095";
                  var4 = "\u0017nºÉ\u009ehQ\u0011\u0080Ú`_½±$ J\u0003ïZ-f\u0086N\u0095".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 117;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 18677) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 91;
            case 1 -> 7;
            case 2 -> 19;
            case 3 -> 157;
            case 4 -> 53;
            case 5 -> 195;
            case 6 -> 213;
            case 7 -> 25;
            case 8 -> 241;
            case 9 -> 149;
            case 10 -> 32;
            case 11 -> 109;
            case 12 -> 228;
            case 13 -> 46;
            case 14 -> 8;
            case 15 -> 34;
            case 16 -> 37;
            case 17 -> 198;
            case 18 -> 203;
            case 19 -> 183;
            case 20 -> 179;
            case 21 -> 27;
            case 22 -> 137;
            case 23 -> 225;
            case 24 -> 132;
            case 25 -> 102;
            case 26 -> 145;
            case 27 -> 170;
            case 28 -> 21;
            case 29 -> 206;
            case 30 -> 160;
            case 31 -> 172;
            case 32 -> 194;
            case 33 -> 47;
            case 34 -> 4;
            case 35 -> 126;
            case 36 -> 130;
            case 37 -> 31;
            case 38 -> 239;
            case 39 -> 74;
            case 40 -> 118;
            case 41 -> 60;
            case 42 -> 11;
            case 43 -> 117;
            case 44 -> 153;
            case 45 -> 56;
            case 46 -> 3;
            case 47 -> 210;
            case 48 -> 214;
            case 49 -> 9;
            case 50 -> 169;
            case 51 -> 150;
            case 52 -> 165;
            case 53 -> 253;
            case 54 -> 221;
            case 55 -> 121;
            case 56 -> 156;
            case 57 -> 75;
            case 58 -> 201;
            case 59 -> 0;
            case 60 -> 119;
            case 61 -> 251;
            case 62 -> 250;
            case 63 -> 224;
            case 64 -> 232;
            case 65 -> 77;
            case 66 -> 64;
            case 67 -> 200;
            case 68 -> 227;
            case 69 -> 236;
            case 70 -> 107;
            case 71 -> 101;
            case 72 -> 148;
            case 73 -> 238;
            case 74 -> 243;
            case 75 -> 106;
            case 76 -> 196;
            case 77 -> 6;
            case 78 -> 59;
            case 79 -> 18;
            case 80 -> 124;
            case 81 -> 168;
            case 82 -> 110;
            case 83 -> 246;
            case 84 -> 154;
            case 85 -> 104;
            case 86 -> 55;
            case 87 -> 51;
            case 88 -> 220;
            case 89 -> 69;
            case 90 -> 208;
            case 91 -> 125;
            case 92 -> 254;
            case 93 -> 92;
            case 94 -> 48;
            case 95 -> 76;
            case 96 -> 13;
            case 97 -> 78;
            case 98 -> 93;
            case 99 -> 211;
            case 100 -> 10;
            case 101 -> 2;
            case 102 -> 123;
            case 103 -> 252;
            case 104 -> 136;
            case 105 -> 237;
            case 106 -> 90;
            case 107 -> 161;
            case 108 -> 36;
            case 109 -> 95;
            case 110 -> 81;
            case 111 -> 205;
            case 112 -> 244;
            case 113 -> 1;
            case 114 -> 138;
            case 115 -> 204;
            case 116 -> 112;
            case 117 -> 67;
            case 118 -> 193;
            case 119 -> 26;
            case 120 -> 162;
            case 121 -> 223;
            case 122 -> 122;
            case 123 -> 135;
            case 124 -> 255;
            case 125 -> 22;
            case 126 -> 63;
            case 127 -> 14;
            case 128 -> 189;
            case 129 -> 175;
            case 130 -> 152;
            case 131 -> 240;
            case 132 -> 217;
            case 133 -> 129;
            case 134 -> 87;
            case 135 -> 100;
            case 136 -> 248;
            case 137 -> 24;
            case 138 -> 85;
            case 139 -> 72;
            case 140 -> 155;
            case 141 -> 29;
            case 142 -> 199;
            case 143 -> 38;
            case 144 -> 222;
            case 145 -> 17;
            case 146 -> 230;
            case 147 -> 41;
            case 148 -> 147;
            case 149 -> 98;
            case 150 -> 20;
            case 151 -> 140;
            case 152 -> 35;
            case 153 -> 219;
            case 154 -> 97;
            case 155 -> 139;
            case 156 -> 120;
            case 157 -> 186;
            case 158 -> 146;
            case 159 -> 247;
            case 160 -> 177;
            case 161 -> 184;
            case 162 -> 181;
            case 163 -> 142;
            case 164 -> 207;
            case 165 -> 178;
            case 166 -> 52;
            case 167 -> 131;
            case 168 -> 182;
            case 169 -> 50;
            case 170 -> 215;
            case 171 -> 79;
            case 172 -> 61;
            case 173 -> 173;
            case 174 -> 209;
            case 175 -> 188;
            case 176 -> 167;
            case 177 -> 94;
            case 178 -> 229;
            case 179 -> 114;
            case 180 -> 234;
            case 181 -> 174;
            case 182 -> 33;
            case 183 -> 141;
            case 184 -> 71;
            case 185 -> 43;
            case 186 -> 249;
            case 187 -> 15;
            case 188 -> 68;
            case 189 -> 80;
            case 190 -> 226;
            case 191 -> 133;
            case 192 -> 187;
            case 193 -> 235;
            case 194 -> 202;
            case 195 -> 88;
            case 196 -> 89;
            case 197 -> 44;
            case 198 -> 12;
            case 199 -> 103;
            case 200 -> 218;
            case 201 -> 70;
            case 202 -> 151;
            case 203 -> 134;
            case 204 -> 216;
            case 205 -> 158;
            case 206 -> 16;
            case 207 -> 143;
            case 208 -> 86;
            case 209 -> 62;
            case 210 -> 116;
            case 211 -> 83;
            case 212 -> 115;
            case 213 -> 84;
            case 214 -> 40;
            case 215 -> 159;
            case 216 -> 176;
            case 217 -> 127;
            case 218 -> 231;
            case 219 -> 82;
            case 220 -> 192;
            case 221 -> 45;
            case 222 -> 42;
            case 223 -> 49;
            case 224 -> 66;
            case 225 -> 111;
            case 226 -> 212;
            case 227 -> 164;
            case 228 -> 190;
            case 229 -> 5;
            case 230 -> 197;
            case 231 -> 171;
            case 232 -> 113;
            case 233 -> 30;
            case 234 -> 58;
            case 235 -> 54;
            case 236 -> 57;
            case 237 -> 191;
            case 238 -> 185;
            case 239 -> 245;
            case 240 -> 166;
            case 241 -> 96;
            case 242 -> 242;
            case 243 -> 163;
            case 244 -> 23;
            case 245 -> 144;
            case 246 -> 28;
            case 247 -> 180;
            case 248 -> 39;
            case 249 -> 99;
            case 250 -> 105;
            case 251 -> 108;
            case 252 -> 73;
            case 253 -> 65;
            case 254 -> 233;
            default -> 128;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   @Override
   public void a(char var1, int var2) {
      me.octo.client.IllIIlllIIIllIIIlIllIllIIIlIlIIIIIIlllIlIlIllIIllIlllIlIIlllIIllIIlIIIlIllIIllIIIlllI.super.a(var1, var2);
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return me.octo.client.IllIIlllIIIllIIIlIllIllIIIlIlIIIIIIlllIlIlIllIIllIlllIlIIlllIIllIIlIIIlIllIIllIIIlllI.super.a(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void d() {
      me.octo.client.IllIIlllIIIllIIIlIllIllIIIlIlIIIIIIlllIlIlIllIIllIlllIlIIlllIIllIIlIIIlIllIIllIIIlllI.super.d();
   }
}
