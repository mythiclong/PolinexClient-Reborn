package me.octo.client;

import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
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
   @NotNull
   private final DecimalFormat IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] d;
   private static String[] e;

   public IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI(
      @NotNull lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI var1
   ) {
      short var10001 = -24397;
      short var10002 = -582;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 150.0F;
      short var10003 = -24386;
      short var10004 = -31047;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new DecimalFormat("#.##");
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
      Object var87 = null; // PX-FIX
      Object var86 = null; // PX-FIX
      float var79 = 0; // PX-FIX
      float var77 = 0; // PX-FIX
      Object var75 = null; // PX-FIX
      float var74 = 0; // PX-FIX
      float var72 = 0; // PX-FIX
      Object var70 = null; // PX-FIX
      Object var67 = null; // PX-FIX
      int var66 = 0; // PX-FIX
      Object var58 = null; // PX-FIX
      String[] var6;
      Object var7;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var56;
      label311: {
         short var10001 = -24389;
         short var10002 = -23888;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         var10002 = -24387;
         short var10003 = 18565;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         var6 = var10000;
         lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI var55 = var10;
         if (var6 != null) {
            if (!(var10 instanceof IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)) {
               var56 = null;
               break label311;
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
      String var57 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s());
      String var81 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t());
      short var89 = -24398;
      short var94 = 10112;
      String var13 = var57 + " - " + var81;
      double var14 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var13, false, 2, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var13, var32 - var14, var3 + 9, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(), false, 16, null);
      var58 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      label304:
      if (var6 != null) {
         if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            var58 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var6 == null) {
               break label304;
            }

            if (!this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
               float var16 = var11
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
                     );
               float var99;
               var58 = (var99 = Math.abs(var16 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) - 0.5F) == 0.0F
                  ? 0
                  : (var99 < 0.0F ? -1 : 1);
               if (var6 == null) {
                  break label304;
               }

               if ((me.octo.client.PxTruth.truth(var58))) {
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var16;
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.currentTimeMillis();
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
               }
            }
         }

         var58 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      label294:
      if (var6 != null) {
         if ((me.octo.client.PxTruth.truth(var58))) {
            var58 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            if (var6 == null) {
               break label294;
            }

            if (!this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
               float var33 = var11
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
                     );
               float var100;
               var58 = (var100 = Math.abs(var33 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) - 0.5F) == 0.0F
                  ? 0
                  : (var100 < 0.0F ? -1 : 1);
               if (var6 == null) {
                  break label294;
               }

               if ((me.octo.client.PxTruth.truth(var58))) {
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var33;
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = System.currentTimeMillis();
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
               }
            }
         }

         var58 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      label284:
      if (var6 != null) {
         if (!(me.octo.client.PxTruth.truth(var58))) {
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
            float var101;
            var58 = (var101 = var34 - 1.0F) == 0.0F ? 0 : (var101 < 0.0F ? -1 : 1);
            if (var6 == null) {
               break label284;
            }

            if ((me.octo.client.PxTruth.truth(var58))) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
            }
         }

         var58 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      label277:
      if (var6 != null) {
         if (!(me.octo.client.PxTruth.truth(var58))) {
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
            float var102;
            var58 = (var102 = var35 - 1.0F) == 0.0F ? 0 : (var102 < 0.0F ? -1 : 1);
            if (var6 == null) {
               break label277;
            }

            if ((me.octo.client.PxTruth.truth(var58))) {
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
         var81 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
         var89 = -24385;
         var94 = -20321;
         var59 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var60, "drangemin:" + var81, this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 0.0F);
      }

      float var21 = var59;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var61 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var81 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      var89 = -24391;
      var94 = 14177;
      float var22 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var61, "drangemax:" + var81, this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, 0.0F);
      float var23 = var18 * (1.0F + var21 * 0.16F);
      float var24 = var18 * (1.0F + var22 * 0.16F);
      float var103;
      int var62 = (var103 = var21 - 0.01F) == 0.0F ? 0 : (var103 < 0.0F ? -1 : 1);
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

         float var104;
         var62 = (var104 = var22 - 0.01F) == 0.0F ? 0 : (var104 < 0.0F ? -1 : 1);
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
         var81 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
         var89 = -24392;
         var94 = -21055;
         var63.a("drangeminrip:" + var81, var19, var36 + var17 / 2.0F, var23 * 2.4F);
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var64 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var81 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
         var89 = -24388;
         var94 = -11100;
         var64.a("drangemaxrip:" + var81, var20, var36 + var17 / 2.0F, var24 * 2.4F);
         float var105;
         var62 = (var105 = var4 - (var9 - 4)) == 0.0F ? 0 : (var105 < 0.0F ? -1 : 1);
      }

      label266: {
         label314: {
            if (var6 != null) {
               if (var62 < 0) {
                  break label314;
               }

               float var106;
               var62 = (var106 = var4 - (var32 + 4)) == 0.0F ? 0 : (var106 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (var62 > 0) {
                  break label314;
               }

               float var107;
               var62 = (var107 = var5 - (var36 - 8)) == 0.0F ? 0 : (var107 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (var62 < 0) {
                  break label314;
               }

               float var108;
               var62 = (var108 = var5 - (var36 + var17 + 8)) == 0.0F ? 0 : (var108 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label266;
            }

            if (var62 <= 0) {
               var62 = 1;
               break label266;
            }
         }

         var62 = 0;
      }

      label315: {
         int var38 = var62;
         int var65 = var38;
         if (var6 != null) {
            if (var38 == 0) {
               break label315;
            }

            float var109;
            var65 = (var109 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var109 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            if (var65 <= 0) {
               break label315;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            float var110;
            var65 = (var110 = Math.abs(var4 - var19) - Math.abs(var4 - var20)) == 0.0F ? 0 : (var110 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            var65 = var65 <= 0 ? 1 : 0;
         }

         label316: {
            int var26 = var65;
            var66 = var26;
            label232:
            if (var6 != null) {
               if (var26 != 0) {
                  var66 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
                  if (var6 == null) {
                     break label232;
                  }

                  if (!this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                     var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                        private static String b;

                        @Override
                        public void e() {
                           IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI.this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
                           IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI.this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
                           me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                              me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              b
                                 + IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
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
                           char[] var10003 = "2^l\u0003;H=?B\u007f\u0004,\u0017".toCharArray();
                           int var10004 = var10003.length;
                           int var0 = 0;
                           byte var6x = 105;
                           char[] var10002 = var10003;
                           int var1x = var10004;
                           byte var10;
                           char[] var10005;
                           int var10006;
                           if (var10004 <= 1) {
                              var10005 = var10003;
                              var10 = 105;
                              var10006 = var0;
                           } else {
                              var6x = 105;
                              var1x = var10004;
                              if (var10004 <= var0) {
                                 String var9x = new String(var10003).intern();
                                 byte var4x = -1;
                                 b = var9x;
                                 break pxClinit;
                              }

                              var10005 = var10003;
                              var10 = 105;
                              var10006 = var0;
                           }

                           while (true) {
                              var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                                 case 0 -> 63;
                                 case 1 -> 69;
                                 case 2 -> 100;
                                 case 3 -> 4;
                                 case 4 -> 53;
                                 case 5 -> 68;
                                 default -> 57;
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
                     break label315;
                  }
               }

               var67 = this;
               if (var6 == null) {
                  break label316;
               }

               var66 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
            }

            if (var66 != 0) {
               break label315;
            }

            var67 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
               private static String b;

               @Override
               public void e() {
                  IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI.this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
                  IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI.this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     b
                        + IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
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
                  char[] var10003 = "+\u0002)RAdH.\b:UV;".toCharArray();
                  int var10004 = var10003.length;
                  int var0 = 0;
                  byte var6 = 73;
                  char[] var10002 = var10003;
                  int var1 = var10004;
                  byte var10;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10 = 73;
                     var10006 = var0;
                  } else {
                     var6 = 73;
                     var1 = var10004;
                     if (var10004 <= var0) {
                        String var9 = new String(var10003).intern();
                        byte var4x = -1;
                        b = var9;
                        break pxClinit;
                     }

                     var10005 = var10003;
                     var10 = 73;
                     var10006 = var0;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                        case 0 -> 6;
                        case 1 -> 57;
                        case 2 -> 1;
                        case 3 -> 117;
                        case 4 -> 111;
                        case 5 -> 72;
                        default -> 108;
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
         * (
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u()
               / (
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                     - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
               )
         );
      int var68 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      if (var6 != null) {
         label192:
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            label214: {
               label213: {
                  int var69 = GLFW.glfwGetMouseButton(
                     me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .getWindow()
                        .handle(),
                     0
                  );
                  if (var6 != null) {
                     if (var69 != 1) {
                        break label213;
                     }

                     var70 = var5;
                     var86 = var2.d() + 5;
                     if (var6 == null) {
                        break label214;
                     }

                     float var111;
                     var69 = (var111 = (float)((Double)var70 - (Double)var86)) == 0.0F ? 0 : (var111 < 0.0F ? -1 : 1);
                  }

                  if (var69 > 0) {
                     label206: {
                        float var27 = RangesKt.coerceIn(var4, var9, RangesKt.coerceAtLeast(var20 - var39, var9));
                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var27 - var9;
                        float var28 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var11;
                        float var29 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                           + (
                                 this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                                    - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                              )
                              * var28;
                        float var112;
                        int var71 = (var112 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v() - 0.0F) == 0.0F
                           ? 0
                           : (var112 < 0.0F ? -1 : 1);
                        if (var6 != null) {
                           if (var71 <= 0) {
                              var72 = var29;
                              break label206;
                           }

                           var71 = (int)(
                              (float)Math.rint(
                                 (var29 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q())
                                    / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v()
                              )
                           );
                        }

                        int var31 = var71;
                        var72 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                           + var31 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
                     }

                     float var30 = var72;
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(
                           RangesKt.coerceIn(
                              var30,
                              this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                              this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
                                 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u()
                           )
                        );
                     if (var6 != null) {
                        break label192;
                     }
                  }
               }

               var70 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               var86 = var11;
            }

            label197: {
               float var40 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var11;
               float var43 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                  + (
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                           - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                     )
                     * var40;
               float var113;
               int var73 = (var113 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v() - 0.0F) == 0.0F
                  ? 0
                  : (var113 < 0.0F ? -1 : 1);
               if (var6 != null) {
                  if (var73 <= 0) {
                     var74 = var43;
                     break label197;
                  }

                  var73 = (int)(
                     (float)Math.rint(
                        (var43 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q())
                           / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v()
                     )
                  );
               }

               int var49 = var73;
               var74 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                  + var49 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
            }

            float var46 = var74;
            float var50 = RangesKt.coerceIn(
               var46,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
                  - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u()
            );
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var50);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var11
               * (
                  (var50 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q())
                     / (
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                           - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                     )
               );
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.currentTimeMillis();
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
         }

         var68 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      }

      label320: {
         if (var6 != null) {
            if (var68 == 0) {
               break label320;
            }

            var68 = GLFW.glfwGetMouseButton(
               me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .getWindow()
                  .handle(),
               0
            );
         }

         label182: {
            label181: {
               if (var6 != null) {
                  if (var68 != 1) {
                     break label181;
                  }

                  var75 = var5;
                  var87 = var2.d() + 5;
                  if (var6 == null) {
                     break label182;
                  }

                  float var114;
                  var68 = (var114 = (float)((Double)var75 - (Double)var87)) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
               }

               if (var68 > 0) {
                  label174: {
                     float var41 = RangesKt.coerceIn(var4, RangesKt.coerceAtMost(var19 + var39, var32), var32);
                     this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var41 - var9;
                     float var44 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / var11;
                     float var47 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                        + (
                              this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                                 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                           )
                           * var44;
                     float var115;
                     int var76 = (var115 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v() - 0.0F) == 0.0F
                        ? 0
                        : (var115 < 0.0F ? -1 : 1);
                     if (var6 != null) {
                        if (var76 <= 0) {
                           var77 = var47;
                           break label174;
                        }

                        var76 = (int)(
                           (float)Math.rint(
                              (var47 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q())
                                 / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v()
                           )
                        );
                     }

                     int var54 = var76;
                     var77 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                        + var54 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
                  }

                  float var51 = var77;
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(
                        RangesKt.coerceIn(
                           var51,
                           this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
                              + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u(),
                           this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                        )
                     );
                  if (var6 != null) {
                     break label320;
                  }
               }
            }

            var75 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var87 = var11;
         }

         label163: {
            float var42 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / var11;
            float var45 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
               + (
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                        - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                  )
                  * var42;
            float var116;
            int var78 = (var116 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v() - 0.0F) == 0.0F
               ? 0
               : (var116 < 0.0F ? -1 : 1);
            if (var6 != null) {
               if (var78 <= 0) {
                  var79 = var45;
                  break label163;
               }

               var78 = (int)(
                  (float)Math.rint(
                     (var45 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q())
                        / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v()
                  )
               );
            }

            int var52 = var78;
            var79 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
               + var52 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
         }

         float var48 = var79;
         float var53 = RangesKt.coerceIn(
            var48,
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
               + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u(),
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
         );
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var53);
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var11
            * (
               (var53 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q())
                  / (
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                        - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                  )
            );
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = System.currentTimeMillis();
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      }

      lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var80 = new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         (int)(var36 + var17 + 10), (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
      );
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b(
            new String[4]
         );
      }

      return var80;
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label37: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = -24390;
         short var10003 = -17913;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         var2 = var10000;
         lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI var5 = var4;
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
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "\u0016\tM&¼éÕ\u001b\u0011çÓ\nÏ\u001e°)|\t\u001dC[D\n\u000f\u0014n\u009cü\u008e~©\u001aD\r¼ý\u0018¡2)§U7\u009a`\u0004©\n\u0098ä\u009c\u0082¢MµÙuC\u0004ê¯?q\ncÊ%³ÎZK)\u0091\t\r´)\u0019;\u0012z£7¡ßf¬i";
      int var4 = "\u0016\tM&¼éÕ\u001b\u0011çÓ\nÏ\u001e°)|\t\u001dC[D\n\u000f\u0014n\u009cü\u008e~©\u001aD\r¼ý\u0018¡2)§U7\u009a`\u0004©\n\u0098ä\u009c\u0082¢MµÙuC\u0004ê¯?q\ncÊ%³ÎZK)\u0091\t\r´)\u0019;\u0012z£7¡ßf¬i"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 55;
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
                     case 0 -> 13;
                     case 1 -> 118;
                     case 2 -> 118;
                     case 3 -> 83;
                     case 4 -> 4;
                     case 5 -> 96;
                     default -> 86;
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
                     e = new String[10];
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

                  var2 = "¹\u000b¡iE\u009bu\u0003\t\u0086Ú";
                  var4 = "¹\u000b¡iE\u009bu\u0003\t\u0086Ú".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 9;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -24389) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 102;
            case 1 -> 241;
            case 2 -> 89;
            case 3 -> 91;
            case 4 -> 141;
            case 5 -> 190;
            case 6 -> 76;
            case 7 -> 189;
            case 8 -> 176;
            case 9 -> 94;
            case 10 -> 53;
            case 11 -> 98;
            case 12 -> 88;
            case 13 -> 83;
            case 14 -> 69;
            case 15 -> 175;
            case 16 -> 195;
            case 17 -> 93;
            case 18 -> 138;
            case 19 -> 209;
            case 20 -> 49;
            case 21 -> 48;
            case 22 -> 0;
            case 23 -> 103;
            case 24 -> 57;
            case 25 -> 178;
            case 26 -> 121;
            case 27 -> 13;
            case 28 -> 154;
            case 29 -> 174;
            case 30 -> 157;
            case 31 -> 153;
            case 32 -> 33;
            case 33 -> 29;
            case 34 -> 212;
            case 35 -> 151;
            case 36 -> 166;
            case 37 -> 96;
            case 38 -> 192;
            case 39 -> 181;
            case 40 -> 158;
            case 41 -> 197;
            case 42 -> 123;
            case 43 -> 188;
            case 44 -> 104;
            case 45 -> 220;
            case 46 -> 254;
            case 47 -> 143;
            case 48 -> 107;
            case 49 -> 164;
            case 50 -> 20;
            case 51 -> 38;
            case 52 -> 2;
            case 53 -> 16;
            case 54 -> 111;
            case 55 -> 229;
            case 56 -> 211;
            case 57 -> 50;
            case 58 -> 21;
            case 59 -> 51;
            case 60 -> 7;
            case 61 -> 24;
            case 62 -> 117;
            case 63 -> 37;
            case 64 -> 147;
            case 65 -> 15;
            case 66 -> 187;
            case 67 -> 218;
            case 68 -> 12;
            case 69 -> 207;
            case 70 -> 28;
            case 71 -> 60;
            case 72 -> 142;
            case 73 -> 210;
            case 74 -> 163;
            case 75 -> 95;
            case 76 -> 79;
            case 77 -> 225;
            case 78 -> 115;
            case 79 -> 97;
            case 80 -> 47;
            case 81 -> 191;
            case 82 -> 132;
            case 83 -> 170;
            case 84 -> 40;
            case 85 -> 208;
            case 86 -> 184;
            case 87 -> 126;
            case 88 -> 167;
            case 89 -> 90;
            case 90 -> 250;
            case 91 -> 92;
            case 92 -> 206;
            case 93 -> 78;
            case 94 -> 80;
            case 95 -> 168;
            case 96 -> 31;
            case 97 -> 162;
            case 98 -> 182;
            case 99 -> 86;
            case 100 -> 152;
            case 101 -> 228;
            case 102 -> 109;
            case 103 -> 55;
            case 104 -> 3;
            case 105 -> 6;
            case 106 -> 171;
            case 107 -> 144;
            case 108 -> 41;
            case 109 -> 213;
            case 110 -> 234;
            case 111 -> 255;
            case 112 -> 10;
            case 113 -> 52;
            case 114 -> 75;
            case 115 -> 59;
            case 116 -> 66;
            case 117 -> 131;
            case 118 -> 25;
            case 119 -> 43;
            case 120 -> 39;
            case 121 -> 161;
            case 122 -> 18;
            case 123 -> 199;
            case 124 -> 247;
            case 125 -> 68;
            case 126 -> 72;
            case 127 -> 108;
            case 128 -> 27;
            case 129 -> 160;
            case 130 -> 253;
            case 131 -> 233;
            case 132 -> 54;
            case 133 -> 145;
            case 134 -> 223;
            case 135 -> 17;
            case 136 -> 42;
            case 137 -> 74;
            case 138 -> 127;
            case 139 -> 124;
            case 140 -> 183;
            case 141 -> 173;
            case 142 -> 186;
            case 143 -> 159;
            case 144 -> 56;
            case 145 -> 65;
            case 146 -> 116;
            case 147 -> 122;
            case 148 -> 232;
            case 149 -> 23;
            case 150 -> 243;
            case 151 -> 180;
            case 152 -> 81;
            case 153 -> 200;
            case 154 -> 64;
            case 155 -> 130;
            case 156 -> 110;
            case 157 -> 216;
            case 158 -> 201;
            case 159 -> 235;
            case 160 -> 146;
            case 161 -> 148;
            case 162 -> 217;
            case 163 -> 44;
            case 164 -> 156;
            case 165 -> 172;
            case 166 -> 5;
            case 167 -> 85;
            case 168 -> 14;
            case 169 -> 125;
            case 170 -> 26;
            case 171 -> 238;
            case 172 -> 105;
            case 173 -> 22;
            case 174 -> 82;
            case 175 -> 106;
            case 176 -> 61;
            case 177 -> 185;
            case 178 -> 87;
            case 179 -> 214;
            case 180 -> 226;
            case 181 -> 165;
            case 182 -> 19;
            case 183 -> 246;
            case 184 -> 239;
            case 185 -> 221;
            case 186 -> 196;
            case 187 -> 73;
            case 188 -> 231;
            case 189 -> 236;
            case 190 -> 252;
            case 191 -> 77;
            case 192 -> 244;
            case 193 -> 230;
            case 194 -> 227;
            case 195 -> 114;
            case 196 -> 113;
            case 197 -> 155;
            case 198 -> 202;
            case 199 -> 30;
            case 200 -> 193;
            case 201 -> 150;
            case 202 -> 84;
            case 203 -> 242;
            case 204 -> 137;
            case 205 -> 1;
            case 206 -> 101;
            case 207 -> 71;
            case 208 -> 198;
            case 209 -> 129;
            case 210 -> 140;
            case 211 -> 222;
            case 212 -> 194;
            case 213 -> 32;
            case 214 -> 169;
            case 215 -> 133;
            case 216 -> 179;
            case 217 -> 63;
            case 218 -> 70;
            case 219 -> 67;
            case 220 -> 219;
            case 221 -> 35;
            case 222 -> 119;
            case 223 -> 204;
            case 224 -> 45;
            case 225 -> 36;
            case 226 -> 215;
            case 227 -> 139;
            case 228 -> 248;
            case 229 -> 120;
            case 230 -> 177;
            case 231 -> 224;
            case 232 -> 237;
            case 233 -> 135;
            case 234 -> 203;
            case 235 -> 205;
            case 236 -> 136;
            case 237 -> 4;
            case 238 -> 240;
            case 239 -> 251;
            case 240 -> 46;
            case 241 -> 149;
            case 242 -> 245;
            case 243 -> 11;
            case 244 -> 118;
            case 245 -> 128;
            case 246 -> 58;
            case 247 -> 9;
            case 248 -> 62;
            case 249 -> 249;
            case 250 -> 34;
            case 251 -> 100;
            case 252 -> 112;
            case 253 -> 99;
            case 254 -> 134;
            default -> 8;
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
   public static void a(me.octo.client.IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI var0, boolean var1) {
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }
   public static void b(me.octo.client.IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI var0, boolean var1) {
      var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }
   public static me.octo.client.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI a(me.octo.client.IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI var0) {
      return var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   public static void c(me.octo.client.IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI var0, boolean var1) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }
   public static void d(me.octo.client.IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI var0, boolean var1) {
      var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }
}
