package me.octo.client;

import java.awt.Color;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll
   implements lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI,
   IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private Pair<Float, Float> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] d;
   private static String[] e;

   public IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll(
      @NotNull IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII var1
   ) {
      short var10001 = -463;
      short var10002 = -6590;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 150.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 110.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 12.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 12.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 10.0F;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 12.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         + this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll * 2.0F;
      int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j();
      float[] var3 = Color.RGBtoHSB(var2 >> 16 & 0xFF, var2 >> 8 & 0xFF, var2 & 0xFF, new float[3]);
      float var4 = var3[0];
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var4;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((double)var4);
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Pair(
         var3[1] * this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         (1 - var3[2]) * this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) {
      Object var57 = null; // PX-FIX
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var48 = null; // PX-FIX
      String[] var6;
      Object var7;
      int var8;
      int var9;
      int var10;
      float var11;
      final float var12;
      final float var13;
      final float var14;
      final float var15;
      float var16;
      float var17;
      float var61;
      label252: {
         short var10001 = -464;
         short var10002 = -19476;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         short var59 = -462;
         var10002 = -22025;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         var8 = (int)var2.e() - (int)this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl - 14;
         var9 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var1, (int)var2.c(), var3, var8 - 10);
         var10 = (var9 - var3 >> 1) + var3 - 4;
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         var11 = this.h();
         var6 = var10000;
         var12 = var8 - 8;
         var13 = var10 - 12;
         var14 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 12.0F;
         var15 = 24.0F;
         var16 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         var17 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll var60 = this;
         if (var6 != null) {
            if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k()) {
               var61 = 0.0F;
               break label252;
            }

            var60 = this;
         }

         var61 = var60.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      float var18 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         + var61
         + this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll * 2.0F;
      float var19 = var18 * var11;
      float var20 = var15 + var19;
      byte var21 = ((byte)((this.a(var4, var5, (int)var12, (int)var13, (int)(var12 + var14), (int)(var13 + var15))) ? 1 : 0));
      float var65;
      int var47 = (var65 = var11 - 0.01F) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
      if (var6 != null) {
         if (var47 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var12,
               var13,
               var14,
               var20,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var11 * 0.55F,
               4.0F);
         }

         var47 = var21;
      }

      label245: {
         label244: {
            if (var6 != null) {
               if (var47 == 0) {
                  break label244;
               }

               float var66;
               var47 = (var66 = var11 - 0.1F) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
            }

            if (var47 < 0) {
               var48 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g();
               break label245;
            }
         }

         var48 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j();
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var22 = var48;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var12,
         var13,
         var14,
         var20,
         var22,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var12,
         var13,
         var14,
         var20,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.4F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var49 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var62 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.Z();
      short var64 = -458;
      short var10003 = -22346;
      var49.a(
         "colormain:" + var62,
         var12,
         var13,
         var14,
         var20,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var8 + 5.0F,
         var10,
         6.0F,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j()
         )
      );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
         me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j()),
         var8 + 16.0F,
         var10 - 5.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      float var23 = var11 * 180.0F;
      me.octo.client.utils.IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d(
            var1,
            var8 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl - 12,
            var10,
            12.0F,
            6.0F,
            var23,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .F(),
            1.5F
         );
      float var67;
      var47 = (var67 = var11 - 0.0F) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
      if (var6 != null) {
         var47 = (((var47 == 0) ? 1 : 0));
      }

      if ((var47 != 0)) {
         var47 = ((this.a(
            var4,
            var5,
            var8 - 6,
            var10 - 13,
            var8 + (int)this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 6,
            var10 + 13
         )) ? 1 : 0);
         if (var6 != null) {
            if (var47 == 0) {
               return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
                  var9, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
               );
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var47 = var4;
         }

         final float var42 = var47;
         final float var43 = var5;
         var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
            private static String b;

            @Override
            public void e() {
               IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll.this.i();
               float var1x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var14, var15, var42, var43, var12, var13)
                  + 6.0F;
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  b
                     + IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll.this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .Z(),
                  var42,
                  var43,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(140),
                  var1x,
                  0L);
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
               pxClinit: {
               char[] var10003x = "\u0005^X\u0010!-]\u000f_\u000e".toCharArray();
               int var10004 = var10003x.length;
               int var0 = 0;
               byte var6x = 98;
               char[] var10002 = var10003x;
               int var1x = var10004;
               byte var10x;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003x;
                  var10x = 98;
                  var10006 = var0;
               } else {
                  var6x = 98;
                  var1x = var10004;
                  if (var10004 <= var0) {
                     String var9x = new String(var10003x).intern();
                     byte var4x = -1;
                     b = var9x;
                     break pxClinit;
                  }

                  var10005 = var10003x;
                  var10x = 98;
                  var10006 = var0;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                     case 0 -> 4;
                     case 1 -> 83;
                     case 2 -> 86;
                     case 3 -> 29;
                     case 4 -> 49;
                     case 5 -> 34;
                     default -> 94;
                  });
                  var0++;
                  if (var6x == 0) {
                     var10006 = var6x;
                     var10005 = var10002;
                     var10x = var6x;
                  } else {
                     if (var1x <= var0) {
                        String var8x = new String(var10002).intern();
                        byte var3x = -1;
                        b = var8x;
                        break pxClinit;
                     }

                     var10005 = var10002;
                     var10x = var6x;
                     var10006 = var0;
                  }
               }
               }
            }
         };
         return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
            var9, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
         );
      } else {
         label235: {
            Object var51 = this;
            if (var6 != null) {
               if (!this.a(
                  var4,
                  var5,
                  var8 - 6,
                  var10 - 13,
                  var8 + (int)this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 6,
                  var10 + 13
               )) {
                  break label235;
               }

               llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(true);
               var51 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                  @Override
                  public void e() {
                     IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll.this.i();
                  }
               };
            }

            var7 = var51;
         }

         int var24 = var10 + 18;
         int var25 = (int)(var18 * var11);
         float var68;
         var47 = (var68 = var11 - 0.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
         if (var6 != null) {
            var47 = var47 > 0 ? 1 : 0;
         }

         int var26;
         label228: {
            label255: {
               var26 = var47;
               float var69;
               var47 = (var69 = var11 - 0.0F) == 0.0F ? 0 : (var69 < 0.0F ? -1 : 1);
               if (var6 != null) {
                  if (var47 <= 0) {
                     break label255;
                  }

                  float var70;
                  var47 = (var70 = var11 - 1.0F) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
               }

               if (var6 == null) {
                  break label228;
               }

               if (var47 < 0) {
                  var47 = 1;
                  break label228;
               }
            }

            var47 = 0;
         }

         int var27 = var47;
         float var28 = var8 + this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         int var29 = (int)(var24 + this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
         float var31 = var29;
         float var32 = var28
            + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         float var35 = var31 + var17;
         var47 = var27;
         if (var6 != null) {
            if (var27 != 0) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var8 - 30.0F,
                     var24 - 200.0F,
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 60.0F,
                     var25 + 200.0F
                  );
            }

            var47 = var26;
         }

         label216:
         if (var6 != null) {
            if (var47 != 0) {
               lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var8 - 6, var24 - 4, (int)this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 12, var25);
               me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                     var28,
                     var31,
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                     6.0F
                  );
               me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(
                     var32,
                     var31,
                     this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  );
               me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var28 + ((Number)this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.getFirst()).floatValue(),
                     var31 + ((Number)this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.getSecond()).floatValue(),
                     5.0F,
                     1.5F,
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  );
               float var37 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2.0F + 2.0F;
               float var38 = RangesKt.coerceIn(
                  var31
                     + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        * this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  var31 + var37,
                  var31 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - var37
               );
               me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var32 + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2.0F,
                     var38,
                     var37,
                     1.5F,
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  );
               var47 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k()) ? 1 : 0);
               if (var6 == null) {
                  break label216;
               }

               if (var47 != 0) {
                  me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        var28,
                        var35,
                        var16,
                        this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j() | 0xFF000000
                     );
                  float var39 = RangesKt.coerceIn(
                     (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j() >> 24 & 0xFF) / 255.0F, 0.0F, 1.0F
                  );
                  float var40 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI / 2.0F + 2.0F;
                  float var41 = RangesKt.coerceIn(var28 + var39 * var16, var28 + var40, var28 + var16 - var40);
                  me.octo.client.utils.IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        var41,
                        var35 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI / 2.0F,
                        var40,
                        1.5F,
                        me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                     );
               }
            }

            var47 = var27;
         }

         if (var6 != null) {
            if (var47 != 0) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .i();
            }

            var47 = ((this.a(
               var4,
               var5,
               (int)var28,
               (int)var31,
               (int)(var28 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII),
               (int)(var31 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)
            )) ? 1 : 0);
         }

         label208: {
            label256: {
               if (var6 != null) {
                  if (var47 != 0) {
                     llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(true);
                     var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                        @Override
                        public void e() {
                           IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll.this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
                        }
                     };
                     if (var6 != null) {
                        break label256;
                     }
                  }

                  var47 = ((this.a(
                     var4,
                     var5,
                     (int)(var32 - 2),
                     (int)(var31 - 2),
                     (int)(var32 + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + 2),
                     (int)(var31 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI + 2)
                  )) ? 1 : 0);
               }

               if (var6 != null) {
                  if (var47 != 0) {
                     llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(true);
                     var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                        @Override
                        public void e() {
                           IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
                        }
                     };
                     if (var6 != null) {
                        break label256;
                     }
                  }

                  var47 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k()) ? 1 : 0);
               }

               if (var6 == null) {
                  break label208;
               }

               if (var47 != 0) {
                  var47 = ((this.a(
                     var4,
                     var5,
                     (int)(var28 - 2),
                     (int)(var35 - 4),
                     (int)(var28 + var16 + 2),
                     (int)(var35 + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI + 4)
                  )) ? 1 : 0);
                  if (var6 == null) {
                     break label208;
                  }

                  if (var47 != 0) {
                     llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(true);
                     var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                        @Override
                        public void e() {
                           IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll.this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
                        }
                     };
                  }
               }
            }

            var47 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         if (var6 != null) {
            label179:
            if (var47 != 0) {
               label184: {
                  var47 = GLFW.glfwGetMouseButton(
                     me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .getWindow()
                        .handle(),
                     0
                  );
                  if (var6 != null) {
                     if (var47 != 1) {
                        break label184;
                     }

                     float var71;
                     var47 = (var71 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
                  }

                  if (var47 > 0) {
                     this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Pair(
                        me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var4 - var28, 0.0F, this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII),
                        me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var5 - var31, 0.0F, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)
                     );
                     this.k();
                     if (var6 != null) {
                        break label179;
                     }
                  }
               }

               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
            }

            var47 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         }

         if (var6 != null) {
            label159:
            if (var47 != 0) {
               label170: {
                  label259: {
                     var47 = GLFW.glfwGetMouseButton(
                        me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           .getWindow()
                           .handle(),
                        0
                     );
                     if (var6 != null) {
                        if (var47 != 1) {
                           break label170;
                        }

                        var57 = var5;
                        if (var6 == null) {
                           break label259;
                        }

                        float var72;
                        var47 = (var72 = ((Float)var57) - (var2.d() + 5)) == 0.0F ? 0 : (var72 < 0.0F ? -1 : 1);
                     }

                     if (var47 <= 0) {
                        break label170;
                     }

                     var57 = me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a((float)var5, var31, var31 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
                  }

                  float var44 =((Float)( var57));
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = RangesKt.coerceIn(
                     (var44 - var31) / this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, 0.0F, 0.9999F
                  );
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a((double)this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
                  this.k();
                  if (var6 != null) {
                     break label159;
                  }
               }

               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
            }

            var47 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var6 != null) {
            if (var47 == 0) {
               return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
                  (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c((float)var9, (float)(var24 + var25 + 6)),
                  (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
               );
            }

            var47 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k()) ? 1 : 0);
         }

         if (var6 != null) {
            if (var47 == 0) {
               return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
                  (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c((float)var9, (float)(var24 + var25 + 6)),
                  (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
               );
            }

            var47 = GLFW.glfwGetMouseButton(
               me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .getWindow()
                  .handle(),
               0
            );
         }

         label262: {
            if (var6 != null) {
               if (var47 != 1) {
                  break label262;
               }

               float var73;
               var47 = (var73 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var73 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (var47 <= 0) {
                  break label262;
               }

               var47 = var4;
            }

            float var45 = RangesKt.coerceIn(var47, var28, var28 + var16);
            float var46 = RangesKt.coerceIn((var45 - var28) / var16, 0.01F, 1.0F);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(
                  me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j(), var46)
               );
            if (var6 != null) {
               return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
                  (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c((float)var9, (float)(var24 + var25 + 6)),
                  (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
               );
            }
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
         return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
            (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c((float)var9, (float)(var24 + var25 + 6)),
            (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
         );
      }
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label37: {
         short var10001 = -461;
         short var10002 = -19976;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var2 = var10000;
         IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII var5 = var4;
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
            return 28;
         }

         var6 = var3;
      }

      int var8 = var6.ab().length();
      if (var2 != null) {
         var8 = var8 > 0 ? 1 : 0;
      }

      return var8 != 0 ? 38 : 28;
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   private final void k() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(
            me.octo.client.utils.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  ((Number)this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.getFirst()).floatValue()
                     / this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                  1
                     - ((Number)this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.getSecond()).floatValue()
                        / this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j() & 0xFF000000
               )
         );
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      int var10000 = var1;
      int var10001 = var3;
      if (var7 != null) {
         if (var1 < var3) {
            return (0 != 0);
         }

         var10000 = var2;
         var10001 = var4;
      }

      if (var7 != null) {
         if (var10000 < var10001) {
            return (0 != 0);
         }

         var10000 = var1;
         var10001 = var5;
      }

      if (var7 != null) {
         if (var10000 >= var10001) {
            return (0 != 0);
         }

         var10000 = var2;
         if (var7 == null) {
            return (var2 != 0);
         }

         var10001 = var6;
      }

      return (var10000 < var10001);
   }

   @NotNull
   @Override
   public String f() {
      String var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.Z();
      short var10001 = -457;
      byte var10002 = -23;
      return var10000 + "_dropdown";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u0086µª¥\u0094\u001aÈ;Óx\nuÓÔi[\u00831\bì\u001e\u000b¹\u0090\u008bìÏ2sz÷øö\u0007r¶\u0012Þa\u0016À";
      int var4 = "\u0086µª¥\u0094\u001aÈ;Óx\nuÓÔi[\u00831\bì\u001e\u000b¹\u0090\u008bìÏ2sz÷øö\u0007r¶\u0012Þa\u0016À".length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 107;
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
                     case 0 -> 99;
                     case 1 -> 21;
                     case 2 -> 95;
                     case 3 -> 17;
                     case 4 -> 93;
                     case 5 -> 125;
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
                     e = new String[6];
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

                  var2 = "øðp\u007f\u0014`)V`¸\t/\b/\n Çã\u0094ö";
                  var4 = "øðp\u007f\u0014`)V`¸\t/\b/\n Çã\u0094ö".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 56;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -462) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 206;
            case 1 -> 4;
            case 2 -> 67;
            case 3 -> 216;
            case 4 -> 213;
            case 5 -> 125;
            case 6 -> 79;
            case 7 -> 187;
            case 8 -> 186;
            case 9 -> 165;
            case 10 -> 0;
            case 11 -> 252;
            case 12 -> 107;
            case 13 -> 55;
            case 14 -> 75;
            case 15 -> 60;
            case 16 -> 89;
            case 17 -> 143;
            case 18 -> 64;
            case 19 -> 27;
            case 20 -> 82;
            case 21 -> 132;
            case 22 -> 91;
            case 23 -> 108;
            case 24 -> 25;
            case 25 -> 137;
            case 26 -> 156;
            case 27 -> 172;
            case 28 -> 77;
            case 29 -> 41;
            case 30 -> 248;
            case 31 -> 194;
            case 32 -> 96;
            case 33 -> 163;
            case 34 -> 179;
            case 35 -> 70;
            case 36 -> 104;
            case 37 -> 86;
            case 38 -> 120;
            case 39 -> 38;
            case 40 -> 119;
            case 41 -> 149;
            case 42 -> 74;
            case 43 -> 237;
            case 44 -> 42;
            case 45 -> 232;
            case 46 -> 158;
            case 47 -> 50;
            case 48 -> 73;
            case 49 -> 63;
            case 50 -> 242;
            case 51 -> 56;
            case 52 -> 245;
            case 53 -> 85;
            case 54 -> 34;
            case 55 -> 200;
            case 56 -> 166;
            case 57 -> 175;
            case 58 -> 225;
            case 59 -> 24;
            case 60 -> 219;
            case 61 -> 105;
            case 62 -> 141;
            case 63 -> 7;
            case 64 -> 126;
            case 65 -> 129;
            case 66 -> 222;
            case 67 -> 17;
            case 68 -> 160;
            case 69 -> 40;
            case 70 -> 16;
            case 71 -> 150;
            case 72 -> 130;
            case 73 -> 169;
            case 74 -> 37;
            case 75 -> 185;
            case 76 -> 193;
            case 77 -> 14;
            case 78 -> 78;
            case 79 -> 45;
            case 80 -> 217;
            case 81 -> 87;
            case 82 -> 72;
            case 83 -> 9;
            case 84 -> 12;
            case 85 -> 52;
            case 86 -> 229;
            case 87 -> 209;
            case 88 -> 118;
            case 89 -> 111;
            case 90 -> 131;
            case 91 -> 101;
            case 92 -> 90;
            case 93 -> 127;
            case 94 -> 196;
            case 95 -> 154;
            case 96 -> 255;
            case 97 -> 62;
            case 98 -> 97;
            case 99 -> 22;
            case 100 -> 148;
            case 101 -> 83;
            case 102 -> 188;
            case 103 -> 46;
            case 104 -> 133;
            case 105 -> 174;
            case 106 -> 44;
            case 107 -> 250;
            case 108 -> 10;
            case 109 -> 180;
            case 110 -> 92;
            case 111 -> 138;
            case 112 -> 201;
            case 113 -> 136;
            case 114 -> 31;
            case 115 -> 243;
            case 116 -> 190;
            case 117 -> 54;
            case 118 -> 202;
            case 119 -> 210;
            case 120 -> 144;
            case 121 -> 178;
            case 122 -> 57;
            case 123 -> 183;
            case 124 -> 28;
            case 125 -> 233;
            case 126 -> 145;
            case 127 -> 135;
            case 128 -> 152;
            case 129 -> 218;
            case 130 -> 5;
            case 131 -> 123;
            case 132 -> 84;
            case 133 -> 147;
            case 134 -> 68;
            case 135 -> 20;
            case 136 -> 11;
            case 137 -> 139;
            case 138 -> 58;
            case 139 -> 33;
            case 140 -> 227;
            case 141 -> 244;
            case 142 -> 251;
            case 143 -> 76;
            case 144 -> 43;
            case 145 -> 173;
            case 146 -> 170;
            case 147 -> 146;
            case 148 -> 115;
            case 149 -> 164;
            case 150 -> 224;
            case 151 -> 161;
            case 152 -> 112;
            case 153 -> 21;
            case 154 -> 234;
            case 155 -> 182;
            case 156 -> 231;
            case 157 -> 106;
            case 158 -> 195;
            case 159 -> 241;
            case 160 -> 3;
            case 161 -> 230;
            case 162 -> 15;
            case 163 -> 246;
            case 164 -> 177;
            case 165 -> 26;
            case 166 -> 99;
            case 167 -> 153;
            case 168 -> 19;
            case 169 -> 226;
            case 170 -> 159;
            case 171 -> 122;
            case 172 -> 176;
            case 173 -> 53;
            case 174 -> 6;
            case 175 -> 110;
            case 176 -> 253;
            case 177 -> 23;
            case 178 -> 39;
            case 179 -> 140;
            case 180 -> 98;
            case 181 -> 49;
            case 182 -> 204;
            case 183 -> 157;
            case 184 -> 93;
            case 185 -> 81;
            case 186 -> 212;
            case 187 -> 236;
            case 188 -> 109;
            case 189 -> 95;
            case 190 -> 211;
            case 191 -> 29;
            case 192 -> 171;
            case 193 -> 162;
            case 194 -> 117;
            case 195 -> 254;
            case 196 -> 48;
            case 197 -> 88;
            case 198 -> 59;
            case 199 -> 1;
            case 200 -> 199;
            case 201 -> 167;
            case 202 -> 94;
            case 203 -> 36;
            case 204 -> 116;
            case 205 -> 214;
            case 206 -> 238;
            case 207 -> 235;
            case 208 -> 208;
            case 209 -> 121;
            case 210 -> 35;
            case 211 -> 189;
            case 212 -> 2;
            case 213 -> 18;
            case 214 -> 220;
            case 215 -> 47;
            case 216 -> 155;
            case 217 -> 71;
            case 218 -> 30;
            case 219 -> 240;
            case 220 -> 215;
            case 221 -> 113;
            case 222 -> 203;
            case 223 -> 192;
            case 224 -> 124;
            case 225 -> 181;
            case 226 -> 168;
            case 227 -> 128;
            case 228 -> 65;
            case 229 -> 114;
            case 230 -> 102;
            case 231 -> 191;
            case 232 -> 134;
            case 233 -> 100;
            case 234 -> 142;
            case 235 -> 197;
            case 236 -> 198;
            case 237 -> 69;
            case 238 -> 207;
            case 239 -> 223;
            case 240 -> 205;
            case 241 -> 66;
            case 242 -> 103;
            case 243 -> 249;
            case 244 -> 184;
            case 245 -> 221;
            case 246 -> 51;
            case 247 -> 8;
            case 248 -> 239;
            case 249 -> 80;
            case 250 -> 13;
            case 251 -> 228;
            case 252 -> 61;
            case 253 -> 151;
            case 254 -> 32;
            default -> 247;
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

   public int a(float arg0) { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(arg0); }
   public int a(float arg0, int arg1) { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(arg0, arg1); }
   public float a() { return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(); }
   public void a(char arg0, int arg1) { me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(arg0, arg1); }
   public int b() { return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(); }
   public void d() { me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d(); }
   public float h() { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.h(); }
   public void i() { me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.i(); }
   public boolean j() { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.j(); }

   public me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll g() { return me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.g(); }
   public void a(net.minecraft.client.gui.GuiGraphicsExtractor arg0, float arg1, float arg2, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll arg3) { me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(arg0, arg1, arg2, arg3); }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor arg0, int arg1, int arg2, int arg3, int arg4, float arg5) { return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(arg0, arg1, arg2, arg3, arg4, arg5); }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor arg0, int arg1, int arg2, int arg3, int arg4, float arg5) { return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(arg0, arg1, arg2, arg3, arg4, arg5); }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor arg0, int arg1, int arg2, float arg3, float arg4, float arg5, float arg6) { return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(arg0, arg1, arg2, arg3, arg4, arg5, arg6); }
   public static final me.octo.client.IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII a(me.octo.client.IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll arg0) { return arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
   public static final void a(me.octo.client.IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll arg0, boolean arg1) { arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = arg1; }
   public static final void b(me.octo.client.IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll arg0, boolean arg1) { arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = arg1; }
   public static final void c(me.octo.client.IllIlllIIIlllIlIIlIIIIlIIIlIIllIIlllIIlIIlIIIIlllIllIlllllIIIIIlIIlIIIIllllllllIllIll arg0, boolean arg1) { arg0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = arg1; }
}
