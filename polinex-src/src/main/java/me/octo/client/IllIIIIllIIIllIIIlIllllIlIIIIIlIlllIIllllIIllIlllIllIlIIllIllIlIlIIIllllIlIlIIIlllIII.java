package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;

public final class IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII
   implements lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI,
   IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld2
   @NotNull
   public static IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final NVGPaint lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static HashMap<String, IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] d;
   private static String[] e;

   public IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII(
      @NotNull lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl var1
   ) {
      short var10001 = 23592;
      short var10002 = 4603;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 40;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 6;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 10;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 190.0F;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 33.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 40.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 35.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 24.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 140;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 24;
      NVGPaint var2 = NVGPaint.malloc();
      short var10003 = 23597;
      short var10004 = 15489;
      Intrinsics.checkNotNullExpressionValue(var2, "malloc(...)");
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var2;
   }

   private final float k() {
      return IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
   }

   @NotNull
   @Override
   public String f() {
      String var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
      short var10001 = 23598;
      short var10002 = -1672;
      return var10000 + "_theme_dropdown";
   }

   private final float l() {
      Object var13 = null; // PX-FIX
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      String var2 = this.f();
      int[] var1 = var10000;
      if (var1 != null) {
         IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            var2
         );
         if (var11 != null) {
            IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3;
            label45: {
               var3 = var11;
               long var4 = System.currentTimeMillis();
               float var6 = (float)(var4 - var3.b());
               float var7 = var3.a() ? 250.0F : 125.0F;
               float var8 = RangesKt.coerceIn(var6 / var7, 0.0F, 1.0F);
               float var9 = var3.a()
                  ? IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .D(var8)
                  : IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .v(var8);
               IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var12 = var3;
               if (var1 != null) {
                  if (var3.a()) {
                     var13 = var3.c() + (1.0F - var3.c()) * var9;
                     break label45;
                  }

                  var12 = var3;
               }

               var13 = var12.c() - var3.c() * var9;
            }

            float var10 =((Float)( var13));
            int var14 = ((var3.a()) ? 1 : 0);
            if (var1 != null) {
               if (var14 != 0) {
                  return var10;
               }

               if (var1 == null) {
                  return var10;
               }

               float var16;
               var14 = (var16 = var10 - 0.001F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
            }

            if (var14 <= 0) {
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.remove(var2);
               return 0.0F;
            }

            return var10;
         }
      }

      return 0.0F;
   }

   private final void m() {
      int[] var1;
      long var3;
      IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5;
      label24: {
         int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
         String var2 = this.f();
         var1 = var10000;
         var3 = System.currentTimeMillis();
         var5 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(var2);
         if (var1 != null) {
            if (var5 != null) {
               break label24;
            }

            IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(
               var2,
               new IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  true, var3, 0.0F
               )
            );
         }

         if (var1 != null) {
            return;
         }
      }

      float var6 = this.l();
      boolean var10001 = var5.a();
      if (var1 != null) {
         var10001 = !var10001;
      }

      var5.a(var10001);
      var5.a(var3);
      var5.a(var6);
   }

   private final float a(int var1) {
      float var15 = 0; // PX-FIX
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      String var3 = this.f();
      int[] var2 = var10000;
      if (var2 != null) {
         IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            var3
         );
         if (var13 != null) {
            IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4;
            float var7;
            label33: {
               var4 = var13;
               long var5 = System.currentTimeMillis();
               var7 = (float)(var5 - var4.b());
               int var14 = ((var4.a()) ? 1 : 0);
               if (var2 != null) {
                  if (var14 == 0) {
                     var15 = 0.0F;
                     break label33;
                  }

                  var14 = var1;
               }

               var15 = var14 * 15.0F;
            }

            float var8 = var15;
            float var9 = RangesKt.coerceAtLeast(var7 - var8, 0.0F);
            float var10 = var4.a() ? 250.0F : 125.0F;
            float var11 = RangesKt.coerceIn(var9 / var10, 0.0F, 1.0F);
            float var12 = var4.a()
               ? IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .D(var11)
               : IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .v(var11);
            return var4.a() ? var12 : 1.0F - var12;
         }
      }

      return 0.0F;
   }

   private final void a(float var1, float var2, float var3, float var4, float[][] var5, float var6, float var7) {
      Collection var22 = null; // PX-FIX
      int var9 = (int)(var7 * 255);
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      Object[] var11 = (Object[])var5;
      boolean var12 = false;
      Object[] var13 = var11;
      Collection var14 = new ArrayList(var11.length);
      int[] var8 = var10000;
      boolean var15 = false;
      int var16 = 0;
      int var17 = var11.length;

      while (true) {
         if (var16 < var17) {
            Object var18 = var13[var16];
            var22 = var14;
            float[] var19 = (float[])var18;
            if (var8 == null) {
               break;
            }

            boolean var20 = false;
            var14.add(
               new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                  (int)(var19[0] * 255), (int)(var19[1] * 255), (int)(var19[2] * 255), var9
               )
            );
            var16++;
            if (var8 != null) {
               continue;
            }
         }

         var22 = var14;
         break;
      }

      List var10 = (List)var22;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      NanoVG.nvgBeginPath(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
      );
      NanoVG.nvgRoundedRect(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         var1,
         var2,
         var3,
         var4,
         var6
      );
      NanoVG.nvgLinearGradient(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         var1,
         var2,
         var1 + var3,
         var2,
         this.a(
            this.a(
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(0),
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(3),
               0.5F
            )
         ),
         this.a(
            this.a(
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(1),
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(2),
               0.5F
            )
         ),
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      NanoVG.nvgFillPaint(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      NanoVG.nvgFill(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(0.5F);
      NanoVG.nvgBeginPath(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
      );
      NanoVG.nvgRoundedRect(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         var1,
         var2,
         var3,
         var4,
         var6
      );
      NanoVG.nvgLinearGradient(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         var1,
         var2,
         var1,
         var2 + var4,
         this.a(
            this.a(
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(0),
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(1),
               0.5F
            )
         ),
         this.a(
            this.a(
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(3),
               (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)var10.get(2),
               0.5F
            )
         ),
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      NanoVG.nvgFillPaint(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      NanoVG.nvgFill(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   private final NVGColor a(me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      NVGColor var10000 = NVGColor.create();
      short var10002 = 23595;
      short var10003 = 18860;
      Intrinsics.checkNotNullExpressionValue(var10000, "create(...)");
      NVGColor var2 = var10000;
      var2.r(var1.q());
      var2.g(var1.r());
      var2.b(var1.s());
      var2.a(var1.t());
      return var2;
   }

   private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3
   ) {
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         (int)(var1.a() + (var2.a() - var1.a()) * var3),
         (int)(var1.b() + (var2.b() - var1.b()) * var3),
         (int)(var1.c() + (var2.c() - var1.c()) * var3),
         (int)(var1.d() + (var2.d() - var1.d()) * var3)
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
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var70 = null; // PX-FIX
      Object var67 = null; // PX-FIX
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var61 = null; // PX-FIX
      int[] var6;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var7;
      String[] var8;
      int var9;
      String var10;
      float var11;
      byte var58;
      label189: {
         short var10001 = 23594;
         short var10002 = 25087;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
         var10002 = 23599;
         short var10003 = 18164;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.W();
         var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Y();
         var10 = var8[var9];
         var11 = this.l();
         String var12 = this.f();
         var6 = var10000;
         if (var6 != null) {
            IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var57 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
               var12
            );
            if (var57 != null) {
               var58 = ((byte)((var57.a()) ? 1 : 0));
               break label189;
            }
         }

         var58 = 0;
      }

      byte var13 = (byte)var58;
      double var14 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var10, false, 2, null)
         + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      int var16 = RangesKt.coerceAtLeast(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (int)var14 + 50);
      int var17 = (int)(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll * 2
            + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            + 8
      );
      float var74;
      var58 = (byte)((var74 = ((byte)((var11 - 0.01F != 0.0) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var74 < 0.0F ? -1 : 1)) ? 1 : 0);
      label183:
      if (var6 != null) {
         if (var58 <= 0) {
            var58 = var13;
            if (var6 == null) {
               break label183;
            }

            if (var13 == 0) {
               var58 =(byte)( var16);
               break label183;
            }
         }

         var58 =(byte)( (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
            (float)var16, (float)var17, var11
         ));
      }

      int var18;
      int var20;
      int var21;
      int var22;
      int var24;
      float var25;
      int var26;
      int var27;
      int var28;
      label175: {
         label174: {
            var18 = var58;
            int var19 = (int)var2.e() - 50 - 10;
            var20 = var19 - var18;
            var21 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a(var1, (int)var2.c(), var3, var20 - 15);
            var22 = (var21 - var3 >> 1) + var3;
            int var23 = (var8.length + 1) / 2;
            var24 = var23
                  * (
                     this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  )
               + 10;
            var25 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + var24 * var11;
            var26 = var20 - 10;
            var27 = var22 - 20;
            var28 = var18 + 20;
            byte var29 = ((byte)((this.a(var4, var5, var26, var27, var26 + var28, (int)(var27 + var25))) ? 1 : 0));
            var58 = var29;
            if (var6 != null) {
               if (var29 == 0) {
                  break label174;
               }

               float var75;
               var58 = (byte)((var75 = ((byte)((var11 - 0.1F != 0.0) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var75 < 0.0F ? -1 : 1)) ? 1 : 0);
            }

            if (var58 < 0) {
               var61 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .C();
               break label175;
            }
         }

         var61 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .B();
      }

      label166: {
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var30 = var61;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var26, var27, var28, var25, var30, this.k()
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var26,
            var27,
            var28,
            var25,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y(),
            this.k()
         );
         float var31 = var20;
         float var32 = var22 - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2;
         a(
            this,
            var31,
            var32,
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.k(var9),
            3.0F,
            0.0F);
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var10, var31 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI + 10.0, var22 - 8, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(), false, 16, null);
         this.a(
            var1,
            var20 + var18 - 15,
            var22,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .F()
         );
         var58 = ((byte)((this.a(var4, var5, var26, var27, var26 + var28, var22 + 15)) ? 1 : 0));
         if (var6 != null) {
            if (var58 == 0) {
               break label166;
            }

            float var76;
            var58 = (byte)((var76 = ((byte)((((Boolean)(Object)(var5 - (var2.d() + 100)))) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var76 < 0.0F ? -1 : 1)) ? 1 : 0);
         }

         if (var58 > 0) {
            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
               @Override
               public void e() {
                  IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.this.m();
               }
            };
         }
      }

      float var77;
      var58 = (byte)((var77 = ((byte)((var11 - 0.01F != 0.0) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var77 < 0.0F ? -1 : 1)) ? 1 : 0);
      label160:
      if (var6 != null) {
         if (var58 > 0) {
            int var33 = var22 + 20;
            float var34 = var24 * var11;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a((float)(var20 - 8), (float)(var33 - 3), (float)(var18 + 16), var34 + 6.0F);
            int var35 = var33;
            int var36 = (var8.length + 1) / 2;
            int var37 = 0;

            while (var37 < var36) {
               int var38 = var37 * 2;
               int var39 = var37 * 2 + 1;
               var58 = 0;
               if (var6 == null) {
                  break label160;
               }

               int var40 = 0;

               label152: {
                  int var72;
                  while (true) {
                     if (var40 < 2) {
                        var58 =(byte)( var40);
                        if (var6 == null) {
                           break label152;
                        }

                        if (var6 != null) {
                           var58 = (byte)(var40 == (byte)(((0 != 0) ? var38 : var39 != 0)) ? 1 : 0);
                        }

                        final int var41 = var58;
                        var58 =(byte)( var41);
                        var72 = var8.length;
                        if (var6 == null) {
                           break;
                        }

                        if (var41 < var72) {
                           String var42 = var8[var41];
                           float var43 = this.a(var41);
                           label119:
                           if (var6 != null) {
                              if (!(var43 <= 0.02F)) {
                                 float var45;
                                 int var47;
                                 label141: {
                                    var45 = 0.9F + 0.1F * var43;
                                    float var46 = (1.0F - var43) * 8.0F;
                                    var47 = var35 + (int)var46;
                                    var58 =(byte)( var40);
                                    if (var6 != null) {
                                       if (var40 == 0) {
                                          var67 = var20 + 2;
                                          break label141;
                                       }

                                       var58 = (byte)(var20 + 2);
                                    }

                                    var67 = var58
                                       + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                                       + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                 }

                                 float var48;
                                 float var49;
                                 label135: {
                                    label197: {
                                       var48 =((Float)( var67));
                                       var49 = var47
                                          + (
                                                this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                                                   - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                                             )
                                             * 0.5F;
                                       var58 = ((byte)((this.a(
                                          var4,
                                          var5,
                                          (int)var48 - 3,
                                          var47 - 2,
                                          (int)(var48 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 6.0F),
                                          var47 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                                       )) ? 1 : 0));
                                       if (var6 != null) {
                                          if (var58 == 0) {
                                             break label197;
                                          }

                                          float var78;
                                          var58 = (byte)((var78 = ((byte)((var11 - 0.8F != 0.0) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var78 < 0.0F ? -1 : 1)) ? 1 : 0);
                                       }

                                       if (var6 == null) {
                                          break label135;
                                       }

                                       if (var58 > 0) {
                                          var58 = 1;
                                          break label135;
                                       }
                                    }

                                    var58 = 0;
                                 }

                                 int var50;
                                 label124: {
                                    var50 = var58;
                                    me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                                    me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .b(var43);
                                    var58 =(byte)( var41);
                                    if (var6 != null) {
                                       if (var41 == var9) {
                                          var70 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .D();
                                          break label124;
                                       }

                                       var58 =(byte)( var50);
                                    }

                                    var70 = var58 != 0
                                       ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .E()
                                       : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                                          0, 0, 0, 0
                                       );
                                 }

                                 me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var51 = var70;
                                 if (var6 != null) {
                                    if (var51.d() > 0) {
                                       me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                          var48 - 3.0F,
                                          var49 - 3.0F,
                                          this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 6.0F,
                                          this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + 5.0F,
                                          var51,
                                          this.k() * 0.6F
                                       );
                                    }

                                    this.a(
                                       var48,
                                       var49,
                                       this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                                       this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                                       this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.k(var41),
                                       4.0F,
                                       var43
                                    );
                                    me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                                 }

                                 float var52 = var48 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll * 0.5F;
                                 float var53 = var49 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll * 0.5F;
                                 me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b(var52, var53);
                                 me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a(var45, var45);
                                 me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b(-var52, -var53);
                                 double var54 = var49 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll * 0.5F - 8.0;
                                 me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, var42, var48 + 8.0, var54, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                                       .a(0.8F), false, 16, null);
                                 me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, var42, var48 + 7.0, var54, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a()
                                       .b(-8.0F, -8.0F, -8.0F), false, 16, null);
                                 me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                                 me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                                 if (var6 == null) {
                                    break label119;
                                 }

                                 if (var50 != 0 && var5 > var2.d() + 100) {
                                    llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(true);
                                    var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                                       @Override
                                       public void e() {
                                          IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                             .j(var41);
                                          IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.this.m();
                                       }
                                    };
                                 }
                              }

                              var40++;
                           }

                           if (var6 != null) {
                              continue;
                           }
                        }
                     }

                     var58 =(byte)( var35);
                     var72 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     break;
                  }

                  var58 += var72;
               }

               var35 = var58;
               var37++;
               if (var6 == null) {
                  break;
               }
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .i();
         }

         float var79;
         var58 = (byte)((var79 = ((byte)((var11 - 0.0F != 0.0) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var79 < 0.0F ? -1 : 1)) ? 1 : 0);
      }

      if (var6 != null) {
         var58 = (byte)(var58 > (byte)(((0 != 0) ? Math.max((int)(var22 + var25), var21) : var21 != 0)) ? 1 : 0);
      }

      int var56 = var58;
      lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var71 = new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var56, var7
      );
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.b(new int[1]);
      }

      return var71;
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
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

   @Override
   public void i() {
      this.m();
   }

   @Override
   public boolean j() {
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      String var2 = this.f();
      int[] var1 = var10000;
      if (var1 != null) {
         IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            var2
         );
         if (var3 != null) {
            return var3.a();
         }
      }

      return false;
   }

   @Override
   public float h() {
      return this.l();
   }

   @Override
   public void a(
      @Nullable GuiGraphicsExtractor var1,
      float var2,
      float var3,
      @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      short var10001 = 23593;
      short var10002 = -30169;
      Intrinsics.checkNotNullParameter(var4, "color");
      float var5 = this.l();
      float var6 = var5 * 180.0F;
      me.octo.client.utils.IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d(var1, var2 + 6, var3, 16.0F, 8.0F, var6, var4, 2.0F);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "¤ÜÍu¡mTBg¾\u009d\u000b!\u0099\u009eËxdør7ÿè\u0005\u000fâ±\u0002\u0000\u0007Ueð¢(+\u0094\n\u0002ë<hS\u0011M\u0098Ò\n";
      int var4 = "¤ÜÍu¡mTBg¾\u009d\u000b!\u0099\u009eËxdør7ÿè\u0005\u000fâ±\u0002\u0000\u0007Ueð¢(+\u0094\n\u0002ë<hS\u0011M\u0098Ò\n".length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 95;
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
                     case 0 -> 118;
                     case 1 -> 122;
                     case 2 -> 73;
                     case 3 -> 72;
                     case 4 -> 56;
                     case 5 -> 86;
                     default -> 1;
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
                     e = new String[7];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.PXEvMid(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashMap<>();
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

                  var2 = "\u00966)þ\u009c\u008cª i¤ÆÃ6A6\u000b\u0080E\u009b.L¸\u0085*I§L";
                  var4 = "\u00966)þ\u009c\u008cª i¤ÆÃ6A6\u000b\u0080E\u009b.L¸\u0085*I§L".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 36;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 23595) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 25;
            case 1 -> 86;
            case 2 -> 154;
            case 3 -> 7;
            case 4 -> 53;
            case 5 -> 135;
            case 6 -> 69;
            case 7 -> 26;
            case 8 -> 147;
            case 9 -> 131;
            case 10 -> 140;
            case 11 -> 67;
            case 12 -> 213;
            case 13 -> 121;
            case 14 -> 92;
            case 15 -> 224;
            case 16 -> 123;
            case 17 -> 29;
            case 18 -> 24;
            case 19 -> 31;
            case 20 -> 84;
            case 21 -> 139;
            case 22 -> 244;
            case 23 -> 231;
            case 24 -> 13;
            case 25 -> 142;
            case 26 -> 134;
            case 27 -> 181;
            case 28 -> 145;
            case 29 -> 11;
            case 30 -> 71;
            case 31 -> 106;
            case 32 -> 91;
            case 33 -> 104;
            case 34 -> 41;
            case 35 -> 165;
            case 36 -> 252;
            case 37 -> 2;
            case 38 -> 226;
            case 39 -> 216;
            case 40 -> 214;
            case 41 -> 3;
            case 42 -> 81;
            case 43 -> 155;
            case 44 -> 183;
            case 45 -> 159;
            case 46 -> 219;
            case 47 -> 23;
            case 48 -> 8;
            case 49 -> 110;
            case 50 -> 160;
            case 51 -> 149;
            case 52 -> 88;
            case 53 -> 14;
            case 54 -> 80;
            case 55 -> 175;
            case 56 -> 10;
            case 57 -> 75;
            case 58 -> 33;
            case 59 -> 37;
            case 60 -> 200;
            case 61 -> 163;
            case 62 -> 89;
            case 63 -> 141;
            case 64 -> 109;
            case 65 -> 57;
            case 66 -> 150;
            case 67 -> 217;
            case 68 -> 18;
            case 69 -> 218;
            case 70 -> 5;
            case 71 -> 189;
            case 72 -> 9;
            case 73 -> 35;
            case 74 -> 127;
            case 75 -> 56;
            case 76 -> 85;
            case 77 -> 47;
            case 78 -> 177;
            case 79 -> 12;
            case 80 -> 212;
            case 81 -> 28;
            case 82 -> 222;
            case 83 -> 32;
            case 84 -> 248;
            case 85 -> 30;
            case 86 -> 162;
            case 87 -> 225;
            case 88 -> 39;
            case 89 -> 16;
            case 90 -> 195;
            case 91 -> 208;
            case 92 -> 199;
            case 93 -> 242;
            case 94 -> 101;
            case 95 -> 78;
            case 96 -> 232;
            case 97 -> 234;
            case 98 -> 50;
            case 99 -> 152;
            case 100 -> 202;
            case 101 -> 235;
            case 102 -> 204;
            case 103 -> 171;
            case 104 -> 138;
            case 105 -> 143;
            case 106 -> 223;
            case 107 -> 94;
            case 108 -> 151;
            case 109 -> 167;
            case 110 -> 65;
            case 111 -> 22;
            case 112 -> 122;
            case 113 -> 42;
            case 114 -> 90;
            case 115 -> 102;
            case 116 -> 87;
            case 117 -> 40;
            case 118 -> 245;
            case 119 -> 168;
            case 120 -> 187;
            case 121 -> 54;
            case 122 -> 115;
            case 123 -> 60;
            case 124 -> 236;
            case 125 -> 249;
            case 126 -> 185;
            case 127 -> 17;
            case 128 -> 211;
            case 129 -> 215;
            case 130 -> 161;
            case 131 -> 98;
            case 132 -> 191;
            case 133 -> 250;
            case 134 -> 63;
            case 135 -> 62;
            case 136 -> 170;
            case 137 -> 203;
            case 138 -> 77;
            case 139 -> 193;
            case 140 -> 49;
            case 141 -> 190;
            case 142 -> 205;
            case 143 -> 192;
            case 144 -> 118;
            case 145 -> 241;
            case 146 -> 6;
            case 147 -> 176;
            case 148 -> 238;
            case 149 -> 233;
            case 150 -> 166;
            case 151 -> 48;
            case 152 -> 105;
            case 153 -> 45;
            case 154 -> 146;
            case 155 -> 164;
            case 156 -> 61;
            case 157 -> 51;
            case 158 -> 196;
            case 159 -> 246;
            case 160 -> 173;
            case 161 -> 43;
            case 162 -> 144;
            case 163 -> 237;
            case 164 -> 153;
            case 165 -> 34;
            case 166 -> 36;
            case 167 -> 103;
            case 168 -> 46;
            case 169 -> 182;
            case 170 -> 0;
            case 171 -> 107;
            case 172 -> 201;
            case 173 -> 172;
            case 174 -> 126;
            case 175 -> 132;
            case 176 -> 72;
            case 177 -> 240;
            case 178 -> 74;
            case 179 -> 253;
            case 180 -> 124;
            case 181 -> 179;
            case 182 -> 73;
            case 183 -> 198;
            case 184 -> 156;
            case 185 -> 19;
            case 186 -> 116;
            case 187 -> 180;
            case 188 -> 207;
            case 189 -> 93;
            case 190 -> 111;
            case 191 -> 100;
            case 192 -> 206;
            case 193 -> 68;
            case 194 -> 136;
            case 195 -> 228;
            case 196 -> 221;
            case 197 -> 117;
            case 198 -> 130;
            case 199 -> 66;
            case 200 -> 255;
            case 201 -> 148;
            case 202 -> 1;
            case 203 -> 112;
            case 204 -> 58;
            case 205 -> 220;
            case 206 -> 76;
            case 207 -> 184;
            case 208 -> 157;
            case 209 -> 230;
            case 210 -> 194;
            case 211 -> 178;
            case 212 -> 52;
            case 213 -> 95;
            case 214 -> 169;
            case 215 -> 251;
            case 216 -> 229;
            case 217 -> 4;
            case 218 -> 27;
            case 219 -> 209;
            case 220 -> 188;
            case 221 -> 239;
            case 222 -> 97;
            case 223 -> 129;
            case 224 -> 99;
            case 225 -> 21;
            case 226 -> 186;
            case 227 -> 79;
            case 228 -> 243;
            case 229 -> 55;
            case 230 -> 119;
            case 231 -> 82;
            case 232 -> 64;
            case 233 -> 70;
            case 234 -> 120;
            case 235 -> 158;
            case 236 -> 96;
            case 237 -> 210;
            case 238 -> 197;
            case 239 -> 38;
            case 240 -> 114;
            case 241 -> 59;
            case 242 -> 137;
            case 243 -> 254;
            case 244 -> 128;
            case 245 -> 44;
            case 246 -> 247;
            case 247 -> 20;
            case 248 -> 83;
            case 249 -> 15;
            case 250 -> 108;
            case 251 -> 125;
            case 252 -> 133;
            case 253 -> 174;
            case 254 -> 113;
            default -> 227;
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

   public static final class PXEvMid implements me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl {
        public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }

      private PXEvMid() {
         this.this$0 = null;
      }

      // PX-RBPORT rbportB: jar anonymous inner-class body ported member-for-member
      final me.octo.client.IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII this$0;

      public PXEvMid(me.octo.client.IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII var0) {
         this.this$0 = var0;
      }

      public void e() {
         me.octo.client.IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII.a(this.this$0);
      }

      public void a(char var1, int var2) {
         me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.a(var1, var2);
      }

      public void d() {
         me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.d();
      }

      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.super.a(var1, var2, var3, var4, var5, var6);
      }

      private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
         private boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

         public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(boolean var1, long var2, float var4) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         }

         public final boolean a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         public final void a(boolean var1) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         }

         public final long b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         public final void a(long var1) {
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         }

         public final float c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         public final void a(float var1) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
         }
      }
   }

   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, float p4, float p5, float p6, float p7) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1, p2, p3, p4, p5, p6, p7);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1, p2, p3, p4, p5, p6);
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(p1, p2, p3, p4, p5, p6);
   }
   public float a() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public int a(float p1) {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(p1);
   }
   public int a(float p1, int p2) {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(p1, p2);
   }
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p1) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1);
   }
   public int b() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public me.octo.client.lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll g() {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.g();
   }
   public static final me.octo.client.lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl b(me.octo.client.IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII p1) {
      return p1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }
   public static final void a(me.octo.client.IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII p1) {
      p1.m();
   }
   public void a(char p1, int p2) {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p1, p2);
   }
   public void d() {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
   static void a(me.octo.client.IllIIIIllIIIllIIIlIllllIlIIIIIlIlllIIllllIIllIlllIllIlIIllIllIlIlIIIllllIlIlIIIlllIII p1, float p2, float p3, float p4, float p5, float[][] p6, float p7, float p8, int p9, java.lang.Object p10) {
      if ((p9 & 64) != 0) p8 = 1F;
      p1.a(p2, p3, p4, p5, p6, p7, p8);
   }
}
