package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] d;
   private static String[] e;

   public lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll(
      @NotNull IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var1
   ) {
      short var10001 = -12812;
      short var10002 = 24890;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 150.0F;
      this.f();
   }

   private final void f() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0.0F;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0.0F;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0.0F;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0.0F;
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      final int var4,
      int var5
   ) {
      Object var85 = null; // PX-FIX
      Object var84 = null; // PX-FIX
      Object var79 = null; // PX-FIX
      Object var77 = null; // PX-FIX
      Object var75 = null; // PX-FIX
      Object var74 = null; // PX-FIX
      Object var72 = null; // PX-FIX
      Object var70 = null; // PX-FIX
      Object var67 = null; // PX-FIX
      int var66 = 0; // PX-FIX
      Object var58 = null; // PX-FIX
      String[] var6;
      Object var7;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var56;
      label307: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = -12814;
         short var10003 = 17738;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var10002 = -12813;
         var10003 = -4063;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var6 = var10000;
         IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var55 = var10;
         if (var6 != null) {
            if (!(var10 instanceof IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)) {
               var56 = null;
               break label307;
            }

            var55 = var10;
         }

         var56 = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)var55;
      }

      float var9;
      float var11;
      int var12;
      float var32;
      boolean var8 = (var56 != null ? var56.ai() : null) instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
      var9 = var2.c() + (var8 ? 34.0F : 14.0F);
      var32 = var2.e() - (var8 ? 19.0F : 14.0F);
      var11 = var32 - var9;
      var12 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var32);
      int var57 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q();
      int var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R();
      short var87 = -12809;
      short var93 = -11004;
      String var13 = var57 + " - " + var10001;
      double var14 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var13, false, 2, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var13, var32 - var14, var3 + 9, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(), false, 16, null);
      var58 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      label300:
      if (var6 != null) {
         if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            var58 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var6 == null) {
               break label300;
            }

            if (!this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
               float var16 = var11
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
                     );
               float var98;
               var58 = (var98 = Math.abs(var16 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) - 0.5F) == 0.0F
                  ? 0
                  : (var98 < 0.0F ? -1 : 1);
               if (var6 == null) {
                  break label300;
               }

               if (((Boolean)var58)) {
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var16;
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.currentTimeMillis();
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
               }
            }
         }

         var58 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      label290:
      if (var6 != null) {
         if (((Boolean)(var58))) {
            var58 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            if (var6 == null) {
               break label290;
            }

            if (!this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
               float var33 = var11
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
                     );
               float var99;
               var58 = (var99 = Math.abs(var33 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) - 0.5F) == 0.0F
                  ? 0
                  : (var99 < 0.0F ? -1 : 1);
               if (var6 == null) {
                  break label290;
               }

               if (((Boolean)var58)) {
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var33;
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = System.currentTimeMillis();
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
               }
            }
         }

         var58 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      label280:
      if (var6 != null) {
         if (!((Boolean)var58)) {
            float var34 = RangesKt.coerceIn(
               (float)(System.currentTimeMillis() - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)
                  / this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
               0.0F,
               1.0F
            );
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
               + (
                     this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        - this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  )
                  * (var34 * var34 * (3.0F - 2.0F * var34));
            float var100;
            var58 = (var100 = var34 - 1.0F) == 0.0F ? 0 : (var100 < 0.0F ? -1 : 1);
            if (var6 == null) {
               break label280;
            }

            if (((Boolean)var58)) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
            }
         }

         var58 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      label273:
      if (var6 != null) {
         if (!((Boolean)var58)) {
            float var35 = RangesKt.coerceIn(
               (float)(System.currentTimeMillis() - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl)
                  / this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
               0.0F,
               1.0F
            );
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               + (
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                  * (var35 * var35 * (3.0F - 2.0F * var35));
            float var101;
            var58 = (var101 = var35 - 1.0F) == 0.0F ? 0 : (var101 < 0.0F ? -1 : 1);
            if (var6 == null) {
               break label273;
            }

            if (((Boolean)var58)) {
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
            }
         }

         var58 = var3;
      }

      final float var36 = Math.max(((Float)var58) + 44.0F, (float)var12);
      final float var17 = 4.0F;
      float var18 = 6.0F;
      float var19 = var9 + RangesKt.coerceIn(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, 0.0F, var11);
      float var20 = var9 + RangesKt.coerceIn(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, 0.0F, var11);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var36,
         var11,
         var17,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .l(),
         2.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var36,
         var11,
         var17,
         0.5F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .m()
            .a(0.3F),
         2.0F
      );
      float var59 = var20;
      if (var6 != null) {
         if (var20 > var19) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var19,
                  var36,
                  var20 - var19,
                  var17,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .n(),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .o(),
                  me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  2.0F
               );
         }

         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var60 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var80 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
         var87 = -12802;
         var93 = 27425;
         var59 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var60, "rangemin:" + var80, this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 0.0F);
      }

      float var21 = var59;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var61 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var81 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      var87 = -12810;
      var93 = 29985;
      float var22 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var61, "rangemax:" + var81, this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, 0.0F);
      float var23 = var18 * (1.0F + var21 * 0.16F);
      float var24 = var18 * (1.0F + var22 * 0.16F);
      float var102;
      int var62 = (var102 = var21 - 0.01F) == 0.0F ? 0 : (var102 < 0.0F ? -1 : 1);
      if (var6 != null) {
         if (var62 > 0) {
            int var25 = RangesKt.coerceIn((int)(var21 * 85.0F), 0, 255);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var19,
               var36 + var17 / 2.0F,
               var23 * 1.5F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(var25)
            );
         }

         float var103;
         var62 = (var103 = var22 - 0.01F) == 0.0F ? 0 : (var103 < 0.0F ? -1 : 1);
      }

      if (var6 != null) {
         if (var62 > 0) {
            int var37 = RangesKt.coerceIn((int)(var22 * 85.0F), 0, 255);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var20,
               var36 + var17 / 2.0F,
               var24 * 1.5F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(var37)
            );
         }

         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               var19,
               var36 + var17 / 2.0F,
               var23,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .k()
            );
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               var20,
               var36 + var17 / 2.0F,
               var24,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .k()
            );
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var63 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var82 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
         var87 = -12815;
         var93 = -3707;
         var63.a("rangeminrip:" + var82, var19, var36 + var17 / 2.0F, var23 * 2.4F);
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var64 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var83 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
         var87 = -12816;
         var93 = -10594;
         var64.a("rangemaxrip:" + var83, var20, var36 + var17 / 2.0F, var24 * 2.4F);
         float var104;
         var62 = (var104 = var4 - (var9 - 4)) == 0.0F ? 0 : (var104 < 0.0F ? -1 : 1);
      }

      label262: {
         label310: {
            if (var6 != null) {
               if (var62 < 0) {
                  break label310;
               }

               float var105;
               var62 = (var105 = var4 - (var32 + 4)) == 0.0F ? 0 : (var105 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (var62 > 0) {
                  break label310;
               }

               float var106;
               var62 = (var106 = var5 - (var36 - 8)) == 0.0F ? 0 : (var106 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (var62 < 0) {
                  break label310;
               }

               float var107;
               var62 = (var107 = var5 - (var36 + var17 + 8)) == 0.0F ? 0 : (var107 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label262;
            }

            if (var62 <= 0) {
               var62 = 1;
               break label262;
            }
         }

         var62 = 0;
      }

      label311: {
         int var38 = var62;
         int var65 = var38;
         if (var6 != null) {
            if (var38 == 0) {
               break label311;
            }

            float var108;
            var65 = (var108 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var108 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            if (var65 <= 0) {
               break label311;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            float var109;
            var65 = (var109 = Math.abs(var4 - var19) - Math.abs(var4 - var20)) == 0.0F ? 0 : (var109 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var65 = var65 <= 0 ? 1 : 0;
         }

         label312: {
            int var26 = var65;
            var66 = var26;
            label228:
            if (var6 != null) {
               if (var26 != 0) {
                  var66 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
                  if (var6 == null) {
                     break label228;
                  }

                  if (!this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                     var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                        private static String b;

                        @Override
                        public void e() {
                           lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll.this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
                           lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll.this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
                           me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                              me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              b
                                 + lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .Z(),
                              var4,
                              var36 + var17 / 2.0F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .ah()
                                 .a(160),
                              22.0F,
                              0L);
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static {
                           pxClinit: {
                           char[] var10003 = "\u0000x,\u0017i:v\u001ck+\u00006".toCharArray();
                           int var10004 = var10003.length;
                           int var0 = 0;
                           byte var6x = 110;
                           char[] var10002 = var10003;
                           int var1x = var10004;
                           byte var10;
                           char[] var10005;
                           int var10006;
                           if (var10004 <= 1) {
                              var10005 = var10003;
                              var10 = 110;
                              var10006 = var0;
                           } else {
                              var6x = 110;
                              var1x = var10004;
                              if (var10004 <= var0) {
                                 String var9x = new String(var10003).intern();
                                 byte var4x = -1;
                                 b = var9x;
                                 break pxClinit;
                              }

                              var10005 = var10003;
                              var10 = 110;
                              var10006 = var0;
                           }

                           while (true) {
                              var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                                 case 0 -> 28;
                                 case 1 -> 119;
                                 case 2 -> 44;
                                 case 3 -> 30;
                                 case 4 -> 98;
                                 case 5 -> 57;
                                 default -> 113;
                              });
                              var0++;
                              if (var6x == 0) {
                                 var10006 = var6x;
                                 var10005 = var10002;
                                 var10 = var6x;
                              } else {
                                 if (var1x <= var0) {
                                    String var8x = new String(var10002).intern();
                                    byte var3x = -1;
                                    b = var8x;
                                    break pxClinit;
                                 }

                                 var10005 = var10002;
                                 var10 = var6x;
                                 var10006 = var0;
                              }
                           }
                           }
                        }
                     };
                     break label311;
                  }
               }

               var67 = this;
               if (var6 == null) {
                  break label312;
               }

               var66 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
            }

            if (var66 != 0) {
               break label311;
            }

            var67 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
               private static String b;

               @Override
               public void e() {
                  lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll.this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
                  lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll.this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     b
                        + lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .Z(),
                     var4,
                     var36 + var17 / 2.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(160),
                     22.0F,
                     0L);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  char[] var10003 = "\u00011WC&%\"\u000b\"PTy".toCharArray();
                  int var10004 = var10003.length;
                  int var0 = 0;
                  byte var6 = 105;
                  char[] var10002 = var10003;
                  int var1 = var10004;
                  byte var10;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10 = 105;
                     var10006 = var0;
                  } else {
                     var6 = 105;
                     var1 = var10004;
                     if (var10004 <= var0) {
                        String var9 = new String(var10003).intern();
                        byte var4x = -1;
                        b = var9;
                        break pxClinit;
                     }

                     var10005 = var10003;
                     var10 = 105;
                     var10006 = var0;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                        case 0 -> 26;
                        case 1 -> 57;
                        case 2 -> 80;
                        case 3 -> 77;
                        case 4 -> 42;
                        case 5 -> 33;
                        default -> 42;
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
                           break pxClinit;
                        }

                        var10005 = var10002;
                        var10 = var6;
                        var10006 = var0;
                     }
                  }
                  }
               }
            };
         }

         var7 = var67;
      }

      float var39 = var11
         * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S()
         / (
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
               - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
         );
      int var68 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      if (var6 != null) {
         label188:
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            label210: {
               label209: {
                  int var69 = GLFW.glfwGetMouseButton(
                     me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .getWindow()
                        .handle(),
                     0
                  );
                  if (var6 != null) {
                     if (var69 != 1) {
                        break label209;
                     }

                     var70 = var5;
                     var84 = var2.d() + 5;
                     if (var6 == null) {
                        break label210;
                     }

                     float var110;
                     var69 = (var110 = (float)((Double)var70 - (Double)var84)) == 0.0F ? 0 : (var110 < 0.0F ? -1 : 1);
                  }

                  if (var69 > 0) {
                     label202: {
                        float var27 = RangesKt.coerceIn(var4, var9, RangesKt.coerceAtLeast(var20 - var39, var9));
                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var27 - var9;
                        float var28 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var11;
                        float var29 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                           + (
                                 this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                                    - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                              )
                              * var28;
                        int var71 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
                        if (var6 != null) {
                           if (var71 <= 0) {
                              var72 = (int)var29;
                              break label202;
                           }

                           var71 = (int)(
                              (float)Math.rint(
                                 (var29 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
                                    / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T()
                              )
                           );
                        }

                        int var31 = var71;
                        var72 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                           + var31 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
                     }

                     int var30 =((Integer)( var72));
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .h(
                           RangesKt.coerceIn(
                              var30,
                              this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                              this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
                                 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S()
                           )
                        );
                     if (var6 != null) {
                        break label188;
                     }
                  }
               }

               var70 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               var84 = var11;
            }

            label193: {
               float var40 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var11;
               float var43 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                  + (
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                           - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                     )
                     * var40;
               int var73 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
               if (var6 != null) {
                  if (var73 <= 0) {
                     var74 = (int)var43;
                     break label193;
                  }

                  var73 = (int)(
                     (float)Math.rint(
                        (var43 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
                           / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T()
                     )
                  );
               }

               int var49 = var73;
               var74 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                  + var49 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
            }

            int var46 =((Integer)( var74));
            int var50 = RangesKt.coerceIn(
               var46,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
                  - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S()
            );
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h(var50);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var11
               * (
                  (float)(var50 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
                     / (
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                           - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                     )
               );
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.currentTimeMillis();
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
         }

         var68 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      }

      if (var6 != null) {
         if (var68 == 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               (int)(var36 + var17 + 10), (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
            );
         }

         var68 = GLFW.glfwGetMouseButton(
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .handle(),
            0
         );
      }

      label178: {
         label177: {
            if (var6 != null) {
               if (var68 != 1) {
                  break label177;
               }

               var75 = var5;
               var85 = var2.d() + 5;
               if (var6 == null) {
                  break label178;
               }

               float var111;
               var68 = (var111 = (float)((Double)var75 - (Double)var85)) == 0.0F ? 0 : (var111 < 0.0F ? -1 : 1);
            }

            if (var68 > 0) {
               label170: {
                  float var41 = RangesKt.coerceIn(var4, RangesKt.coerceAtMost(var19 + var39, var32), var32);
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var41 - var9;
                  float var44 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / var11;
                  float var47 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                     + (
                           this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                              - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                        )
                        * var44;
                  int var76 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
                  if (var6 != null) {
                     if (var76 <= 0) {
                        var77 = (int)var47;
                        break label170;
                     }

                     var76 = (int)(
                        (float)Math.rint(
                           (var47 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
                              / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T()
                        )
                     );
                  }

                  int var54 = var76;
                  var77 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                     + var54 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
               }

               int var51 =((Integer)( var77));
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .i(
                     RangesKt.coerceIn(
                        var51,
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
                           + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                     )
                  );
               if (var6 != null) {
                  return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
                     (int)(var36 + var17 + 10), (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
                  );
               }
            }
         }

         var75 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var85 = var11;
      }

      label159: {
         float var42 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / var11;
         float var45 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
            + (
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                     - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
               )
               * var42;
         int var78 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
         if (var6 != null) {
            if (var78 <= 0) {
               var79 = (int)var45;
               break label159;
            }

            var78 = (int)(
               (float)Math.rint(
                  (var45 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
                     / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T()
               )
            );
         }

         int var52 = var78;
         var79 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
            + var52 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
      }

      int var48 =((Integer)( var79));
      int var53 = RangesKt.coerceIn(
         var48,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S(),
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
      );
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i(var53);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var11
         * (
            (float)(var53 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
               / (
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                     - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
               )
         );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = System.currentTimeMillis();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         (int)(var36 + var17 + 10), (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
      );
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label37: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = -12811;
         short var10003 = 901;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var2 = var10000;
         IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var5 = var4;
         if (var2 != null) {
            if (!(var4 instanceof IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)) {
               var6 = null;
               break label37;
            }

            var5 = var4;
         }

         var6 = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)var5;
      }

      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var3 = var6;
      var6 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return 58;
         }

         var6 = var3;
      }

      int var8 = var6.ab().length();
      if (var2 != null) {
         var8 = var8 > 0 ? 1 : 0;
      }

      return var8 != 0 ? 68 : 58;
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   public void e() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "Næ yÌX\fTç\u00032Yy\u0007Æ.\u008a÷Üû\u0085\n\u0098\u001agj\u0083+Ø0\u009f\u0017\u000bêìïYíLÅ\u0098oªß\nNy½\u0006Ø¦³\u0081ò!\få9Õ\u0082b'Ù»\u0015Ra*";
      int var4 = "Næ yÌX\fTç\u00032Yy\u0007Æ.\u008a÷Üû\u0085\n\u0098\u001agj\u0083+Ø0\u009f\u0017\u000bêìïYíLÅ\u0098oªß\nNy½\u0006Ø¦³\u0081ò!\få9Õ\u0082b'Ù»\u0015Ra*"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 80;
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
                     case 0 -> 16;
                     case 1 -> 7;
                     case 2 -> 99;
                     case 3 -> 53;
                     case 4 -> 40;
                     case 5 -> 109;
                     default -> 98;
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
                     d = var5;
                     e = new String[9];
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

                  var2 = "\u008b#A\u0098©=ñ·@^\u0092ò\t\u0007UÐV\u009bä·\u008cÀ";
                  var4 = "\u008b#A\u0098©=ñ·@^\u0092ò\t\u0007UÐV\u009bä·\u008cÀ".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 74;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12810) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 181;
            case 1 -> 135;
            case 2 -> 161;
            case 3 -> 238;
            case 4 -> 17;
            case 5 -> 6;
            case 6 -> 186;
            case 7 -> 240;
            case 8 -> 21;
            case 9 -> 221;
            case 10 -> 92;
            case 11 -> 25;
            case 12 -> 5;
            case 13 -> 168;
            case 14 -> 165;
            case 15 -> 67;
            case 16 -> 251;
            case 17 -> 101;
            case 18 -> 7;
            case 19 -> 70;
            case 20 -> 194;
            case 21 -> 206;
            case 22 -> 224;
            case 23 -> 24;
            case 24 -> 40;
            case 25 -> 244;
            case 26 -> 132;
            case 27 -> 8;
            case 28 -> 111;
            case 29 -> 3;
            case 30 -> 163;
            case 31 -> 125;
            case 32 -> 233;
            case 33 -> 14;
            case 34 -> 127;
            case 35 -> 247;
            case 36 -> 121;
            case 37 -> 15;
            case 38 -> 100;
            case 39 -> 249;
            case 40 -> 49;
            case 41 -> 2;
            case 42 -> 146;
            case 43 -> 42;
            case 44 -> 29;
            case 45 -> 145;
            case 46 -> 72;
            case 47 -> 82;
            case 48 -> 200;
            case 49 -> 86;
            case 50 -> 53;
            case 51 -> 68;
            case 52 -> 46;
            case 53 -> 131;
            case 54 -> 204;
            case 55 -> 79;
            case 56 -> 155;
            case 57 -> 84;
            case 58 -> 96;
            case 59 -> 237;
            case 60 -> 162;
            case 61 -> 177;
            case 62 -> 60;
            case 63 -> 245;
            case 64 -> 203;
            case 65 -> 77;
            case 66 -> 143;
            case 67 -> 136;
            case 68 -> 157;
            case 69 -> 28;
            case 70 -> 65;
            case 71 -> 119;
            case 72 -> 118;
            case 73 -> 37;
            case 74 -> 33;
            case 75 -> 169;
            case 76 -> 81;
            case 77 -> 171;
            case 78 -> 174;
            case 79 -> 222;
            case 80 -> 183;
            case 81 -> 190;
            case 82 -> 89;
            case 83 -> 158;
            case 84 -> 160;
            case 85 -> 32;
            case 86 -> 152;
            case 87 -> 253;
            case 88 -> 140;
            case 89 -> 234;
            case 90 -> 110;
            case 91 -> 66;
            case 92 -> 98;
            case 93 -> 242;
            case 94 -> 62;
            case 95 -> 212;
            case 96 -> 231;
            case 97 -> 179;
            case 98 -> 196;
            case 99 -> 229;
            case 100 -> 193;
            case 101 -> 74;
            case 102 -> 114;
            case 103 -> 116;
            case 104 -> 246;
            case 105 -> 88;
            case 106 -> 48;
            case 107 -> 209;
            case 108 -> 83;
            case 109 -> 105;
            case 110 -> 187;
            case 111 -> 248;
            case 112 -> 102;
            case 113 -> 142;
            case 114 -> 178;
            case 115 -> 159;
            case 116 -> 133;
            case 117 -> 47;
            case 118 -> 211;
            case 119 -> 51;
            case 120 -> 95;
            case 121 -> 80;
            case 122 -> 156;
            case 123 -> 150;
            case 124 -> 216;
            case 125 -> 122;
            case 126 -> 35;
            case 127 -> 223;
            case 128 -> 41;
            case 129 -> 197;
            case 130 -> 167;
            case 131 -> 30;
            case 132 -> 45;
            case 133 -> 236;
            case 134 -> 69;
            case 135 -> 153;
            case 136 -> 243;
            case 137 -> 191;
            case 138 -> 255;
            case 139 -> 59;
            case 140 -> 38;
            case 141 -> 112;
            case 142 -> 254;
            case 143 -> 188;
            case 144 -> 232;
            case 145 -> 109;
            case 146 -> 250;
            case 147 -> 239;
            case 148 -> 87;
            case 149 -> 241;
            case 150 -> 91;
            case 151 -> 52;
            case 152 -> 4;
            case 153 -> 107;
            case 154 -> 230;
            case 155 -> 228;
            case 156 -> 201;
            case 157 -> 61;
            case 158 -> 57;
            case 159 -> 50;
            case 160 -> 71;
            case 161 -> 19;
            case 162 -> 144;
            case 163 -> 126;
            case 164 -> 166;
            case 165 -> 199;
            case 166 -> 202;
            case 167 -> 115;
            case 168 -> 34;
            case 169 -> 11;
            case 170 -> 124;
            case 171 -> 128;
            case 172 -> 215;
            case 173 -> 170;
            case 174 -> 31;
            case 175 -> 175;
            case 176 -> 218;
            case 177 -> 44;
            case 178 -> 18;
            case 179 -> 85;
            case 180 -> 54;
            case 181 -> 176;
            case 182 -> 12;
            case 183 -> 141;
            case 184 -> 147;
            case 185 -> 93;
            case 186 -> 113;
            case 187 -> 235;
            case 188 -> 23;
            case 189 -> 217;
            case 190 -> 184;
            case 191 -> 20;
            case 192 -> 0;
            case 193 -> 76;
            case 194 -> 22;
            case 195 -> 134;
            case 196 -> 225;
            case 197 -> 213;
            case 198 -> 129;
            case 199 -> 180;
            case 200 -> 207;
            case 201 -> 198;
            case 202 -> 78;
            case 203 -> 130;
            case 204 -> 139;
            case 205 -> 138;
            case 206 -> 148;
            case 207 -> 117;
            case 208 -> 55;
            case 209 -> 226;
            case 210 -> 172;
            case 211 -> 182;
            case 212 -> 26;
            case 213 -> 227;
            case 214 -> 10;
            case 215 -> 208;
            case 216 -> 219;
            case 217 -> 39;
            case 218 -> 16;
            case 219 -> 189;
            case 220 -> 173;
            case 221 -> 120;
            case 222 -> 164;
            case 223 -> 1;
            case 224 -> 73;
            case 225 -> 214;
            case 226 -> 94;
            case 227 -> 75;
            case 228 -> 220;
            case 229 -> 56;
            case 230 -> 90;
            case 231 -> 13;
            case 232 -> 97;
            case 233 -> 108;
            case 234 -> 192;
            case 235 -> 43;
            case 236 -> 27;
            case 237 -> 58;
            case 238 -> 123;
            case 239 -> 103;
            case 240 -> 185;
            case 241 -> 252;
            case 242 -> 63;
            case 243 -> 210;
            case 244 -> 137;
            case 245 -> 151;
            case 246 -> 154;
            case 247 -> 106;
            case 248 -> 205;
            case 249 -> 149;
            case 250 -> 9;
            case 251 -> 99;
            case 252 -> 195;
            case 253 -> 36;
            case 254 -> 64;
            default -> 104;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
   // --- Phase A L3: descriptor-exact synthetics restored from .analysis/me-octo-only.jar bytecode (javap -v flags); generator .analysis/phaseA/_L3_gen2.py ---
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var0, int var1, int var2, int var3, int var4, float var5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var0, var1, var2, var3, var4, var5);
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor var0, int var1, int var2, int var3, int var4, float var5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var0, var1, var2, var3, var4, var5);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var0, int var1, int var2, float var3, float var4, float var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var0, var1, var2, var3, var4, var5, var6);
   }
   public void a(char var0, int var1) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var0, var1);
   }
   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
   public boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var0, var1, var2, var3, var4, var5);
   }
   public static void a(me.octo.client.lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll var0, boolean var1) {
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }
   public static void b(me.octo.client.lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll var0, boolean var1) {
      var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }
   public static me.octo.client.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl a(me.octo.client.lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll var0) {
      return var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   public static void c(me.octo.client.lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll var0, boolean var1) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }
   public static void d(me.octo.client.lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll var0, boolean var1) {
      var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }
}
