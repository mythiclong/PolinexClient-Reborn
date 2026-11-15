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

public final class IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll
   implements lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI,
   IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld2
   @NotNull
   public static IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
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
   private static HashMap<String, IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] d;
   private static String[] e;
   public IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll(
      @NotNull lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl var1
   ) {
      short var10001 = 20493;
      short var10002 = -30679;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 34;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 8;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 150.0F;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 26.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 34.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 28.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 20.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 110;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 20;
      NVGPaint var2 = NVGPaint.malloc();
      short var10003 = 20492;
      short var10004 = -21008;
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
      short var10001 = 20486;
      short var10002 = -21425;
      return var10000 + "_theme_dropdown";
   }

   private final float l() {
      Object var10 = null; // PX-FIX
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      String var2 = this.f();
      String[] var1 = var10000;
      if (var1 != null) {
         IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            var2
         );
         if (var8 != null) {
            IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3;
            label36: {
               var3 = var8;
               float var4 = (float)(System.currentTimeMillis() - var3.b());
               float var5 = RangesKt.coerceIn(var4 / 250.0F, 0.0F, 1.0F);
               float var6 = IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m(var5);
               IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = var3;
               if (var1 != null) {
                  if (var3.a()) {
                     var10 = var3.c() + (1.0F - var3.c()) * var6;
                     break label36;
                  }

                  var9 = var3;
               }

               var10 = var9.c() - var3.c() * var6;
            }

            float var7 =((Float)( var10));
            int var11 = ((var3.a()) ? 1 : 0);
            if (var1 != null) {
               if (var11 != 0) {
                  return var7;
               }

               if (var1 == null) {
                  return var7;
               }

               float var13;
               var11 = (var13 = var7 - 0.001F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var11 <= 0) {
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.remove(var2);
               return 0.0F;
            }

            return var7;
         }
      }

      return 0.0F;
   }

   private final void m() {
      String[] var1;
      long var3;
      IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5;
      label24: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
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
               new IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
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
      float var12 = 0; // PX-FIX
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      String var3 = this.f();
      String[] var2 = var10000;
      if (var2 != null) {
         IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            var3
         );
         if (var10 != null) {
            IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4;
            float var5;
            label23: {
               var4 = var10;
               var5 = (float)(System.currentTimeMillis() - var4.b());
               int var11 = ((var4.a()) ? 1 : 0);
               if (var2 != null) {
                  if (var11 == 0) {
                     var12 = 0.0F;
                     break label23;
                  }

                  var11 = var1;
               }

               var12 = var11 * 15.0F;
            }

            float var6 = var12;
            float var7 = RangesKt.coerceAtLeast(var5 - var6, 0.0F);
            float var8 = RangesKt.coerceIn(var7 / 250.0F, 0.0F, 1.0F);
            float var9 = IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m(var8);
            return var4.a() ? var9 : 1.0F - var9;
         }
      }

      return 0.0F;
   }

   private final void a(float var1, float var2, float var3, float var4, float[][] var5, float var6, float var7) {
      Collection var22 = null; // PX-FIX
      int var9 = (int)(var7 * 255);
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      Object[] var11 = (Object[])var5;
      String[] var8 = var10000;
      boolean var12 = false;
      Object[] var13 = var11;
      Collection var14 = new ArrayList(var11.length);
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
      short var10002 = 20481;
      short var10003 = -4995;
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
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var71 = null; // PX-FIX
      float var68 = 0.0F;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var62 = null; // PX-FIX
      String[] var6;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var7;
      String[] var8;
      int var9;
      String var10;
      float var11;
      int var59;
      label194: {
         short var10001 = 20484;
         short var10002 = -4193;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         var10002 = 20485;
         short var10003 = 21973;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var6 = var10000;
         var7 = null;
         var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.W();
         var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Y();
         var10 = var8[var9];
         var11 = this.l();
         String var12 = this.f();
         if (var6 != null) {
            IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var58 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
               var12
            );
            if (var58 != null) {
               var59 = ((var58.a()) ? 1 : 0);
               break label194;
            }
         }

         var59 = 0;
      }

      int var13 = var59;
      double var14 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
            var10,
            false,
            2,
            null)
         + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      int var16 = RangesKt.coerceAtLeast(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, (int)var14 + 40);
      int var17 = (int)(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll * 2
            + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            + 8
      );
      float var81;
      // PX-R957: original keeps local 18 as an int (no i2b anywhere in this method).
      // Byte truncation here made 18 negative and produced an inverted hit rect.
      int var18;
      if (var11 <= 0.01F && var13 == 0) {
         var18 = var16;
      } else {
         var18 = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
            (float)var16, (float)var17, var11
         );
      }
      int var19 = (int)var2.e() - 30;
      int var20 = var19 - var18;
      int var21 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a(var1, (int)var2.c(), var3, var20 - 10);
      int var22 = (var21 - var3 >> 1) + var3;
      int var23 = (var8.length + 1) / 2;
      int var24 = var23
            * (
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )
         + 8;
      float var25 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + var24 * var11;
      final int var26 = var20 - 8;
      final int var27 = var22 - 17;
      final int var28 = var18 + 16;
      int var29 = ((this.a(var4, var5, var26, var27, var26 + var28, (int)(var27 + var25))) ? 1 : 0);
      float var82;
      var59 = (var11 > 0.01F) ? 1 : 0;
      if (var6 != null) {
         if (var59 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               (float)var26,
               (float)var27,
               (float)var28,
               var25,
               this.k(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var11 * 0.55F,
               4.0F);
         }

         var59 = var29;
      }

      label179: {
         label178: {
            if (var6 != null) {
               if (var59 == 0) {
                  break label178;
               }

            }

            // PX-R957: bytecode offset 405-411 compares (var11 < 0.1f) directly (fcmpg/ifge).
            if (var11 < 0.1F) {
               var62 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .C();
               break label179;
            }
         }

         var62 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .B();
      }

      label197: {
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var30 = var62;
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
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var63 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var74 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
         short var78 = 20487;
         short var79 = -25701;
         var63.a("theme:" + var74, var26, var27, var28, var25, this.k());
         a(
            this,
            var20,
            var22 - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2,
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.k(var9),
            3.0F,
            0.0F);
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
            var10,
            var20 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI + 8.0,
            var22 - 7,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            false,
            16,
            null);
         this.a(
            var1,
            var20 + var18 - 12,
            var22,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .F()
         );
         var59 = ((this.a(var4, var5, var26, var27, var26 + var28, var22 + 13)) ? 1 : 0);
         if (var6 != null) {
            if (var59 == 0) {
               break label197;
            }

            var59 = (var5 - (var2.d() + 5) > 0.0F) ? 1 : 0;
         }

         if (var6 != null) {
            if (var59 <= 0) {
               break label197;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var59 = var4;
         }

         final float var31 = var59;
         float var32 = var5;
         var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
            private static String b;

            @Override
            public void e() {
               IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.this.m();
               float var1x = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var28, 26.0F, var31, var32, var26, var27)
                  + 6.0F;
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  b
                     + IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        .Z(),
                  var31,
                  var32,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(140),
                  var1x,
                  0L);
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
               pxClinit: {
               char[] var10003 = "\u0012H? E3".toCharArray();
               int var10004 = var10003.length;
               int var0 = 0;
               byte var6x = 30;
               char[] var10002 = var10003;
               int var1x = var10004;
               byte var10x;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var10x = 30;
                  var10006 = var0;
               } else {
                  var6x = 30;
                  var1x = var10004;
                  if (var10004 <= var0) {
                     String var9x = new String(var10003).intern();
                     byte var4x = -1;
                     b = var9x;
                     break pxClinit;
                  }

                  var10005 = var10003;
                  var10x = 30;
                  var10006 = var0;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                     case 0 -> 120;
                     case 1 -> 62;
                     case 2 -> 68;
                     case 3 -> 83;
                     case 4 -> 62;
                     case 5 -> 23;
                     default -> 77;
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
      }

      float var85;
      var59 = (var11 > 0.01F) ? 1 : 0;
      if (var6 != null) {
         if (var59 <= 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var11 > 0.0F ? Math.max((int)(var22 + var25), var21) : var21, var7
            );
         }

         var59 = var22 + 17;
      }

      int var56 = var59;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((float)(var20 - 6), (float)(var56 - 2), (float)(var18 + 12), var24 * var11 + 4.0F);
      int var57 = var56;
      int var33 = 0;

      while (var33 < var23) {
         if (var6 == null) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var11 > 0.0F ? Math.max((int)(var22 + var25), var21) : var21, var7
            );
         }

         int var34 = 0;

         int var75;
         while (true) {
            if (var34 < 2) {
               int var35 = var33 * 2 + var34;
               var59 = var35;
               var75 = var8.length;
               if (var6 == null || var6 == null) {
                  break;
               }

               if (var35 < var75) {
                  String var36 = var8[var35];
                  float var37 = this.a(var35);
                  label110:
                  if (var6 != null) {
                     if (!(var37 <= 0.02F)) {
                        float var38;
                        int var40;
                        label139: {
                           var38 = 0.9F + 0.1F * var37;
                           float var39 = (1.0F - var37) * 6.0F;
                           var40 = var57 + (int)var39;
                           var59 = var34;
                           if (var6 != null) {
                              if (var34 == 0) {
                                 var68 = var20 + 2;
                                 break label139;
                              }

                              var59 = var20 + 2;
                           }

                           var68 = var20 + 2
                              + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                              + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        }

                        float var41;
                        float var42;
                        label133: {
                           label203: {
                              var41 = var68;
                              var42 = var40
                                 + (
                                       this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                                          - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                                    )
                                    * 0.5F;
                              var59 = ((this.a(
                                 var4,
                                 var5,
                                 (int)var41 - 2,
                                 var40 - 2,
                                 (int)(var41 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 4.0F),
                                 var40 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                              )) ? 1 : 0);
                              if (var6 != null) {
                                 if (var59 == 0) {
                                    break label203;
                                 }

                                 float var86;
                                 var59 = (var11 > 0.8F) ? 1 : 0;
                              }

                              if (var6 == null) {
                                 break label133;
                              }

                              if (var59 > 0) {
                                 var59 = 1;
                                 break label133;
                              }
                           }

                           var59 = 0;
                        }

                        int var43;
                        label122: {
                           var43 = var59;
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(var37);
                           var59 = var35;
                           if (var6 != null) {
                              if (var35 == var9) {
                                 var71 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .D();
                                 break label122;
                              }

                              var59 = var43;
                           }

                           var71 = var59 != 0
                              ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .E()
                              : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 0);
                        }

                        me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var44 = var71;
                        if (var6 != null) {
                           if (var44.d() > 0) {
                              me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                 var41 - 2.0F,
                                 var42 - 2.0F,
                                 this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 4.0F,
                                 this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + 4.0F,
                                 var44,
                                 this.k() * 0.6F
                              );
                           }

                           me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var72 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           String var76 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.Z();
                           short var80 = 20483;
                           short var10004 = 9776;
                           var72.a(
                              "themeitem:" + var76 + ":" + var35,
                              var41 - 2.0F,
                              var42 - 2.0F,
                              this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 4.0F,
                              this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + 4.0F,
                              this.k() * 0.6F
                           );
                           this.a(
                              var41,
                              var42,
                              this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                              this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                              this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.k(var35),
                              3.0F,
                              var37
                           );
                           me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                        }

                        float var45 = var41 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll * 0.5F;
                        float var46 = var42 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll * 0.5F;
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(var45, var46);
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var38, var38);
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(-var45, -var46);
                        double var47 = var42 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll * 0.5F - 6.0;
                        me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var36, var41 + 7.0, var47 + 1, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                              .a(0.8F), false, 16, null);
                        me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var36, var41 + 6.0, var47, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                              .b(-8.0F, -8.0F, -8.0F), false, 16, null);
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                        if (var6 == null) {
                           break label110;
                        }

                        label116:
                        if (var43 != 0) {
                           float var87;
                           var59 = (var5 - (var2.d() + 5) > 0.0F) ? 1 : 0;
                           if (var6 != null) {
                              if (var59 <= 0) {
                                 break label116;
                              }

                              llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a(true);
                              var59 = var4;
                           }

                           final float var49 = var59;
                           final float var50 = var5;
                           final float var52 = var41 - 2.0F;
                           final float var53 = var42 - 2.0F;
                           final float var54 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 4.0F;
                           final float var55 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + 4.0F;
                           var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                              private static String b;

                              @Override
                              public void e() {
                                 IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                    .j(var35);
                                 float var1 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(var54, var55, var49, var50, var52, var53)
                                    + 4.0F;
                                 me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a(
                                       b
                                          + IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                                             .Z()
                                          + ":"
                                          + var35,
                                       var49,
                                       var50,
                                       IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .ah()
                                          .a(170),
                                       var1,
                                       460L
                                    );
                                 IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.this.m();
                              }

                              // $VF: Irreducible bytecode was duplicated to produce valid code
                              static {
                                 pxClinit: {
                                 char[] var10003 = "[t\u00173\"\u0019?JqH".toCharArray();
                                 int var10004 = var10003.length;
                                 int var0 = 0;
                                 byte var6 = 78;
                                 char[] var10002 = var10003;
                                 int var1 = var10004;
                                 byte var10;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var10 = 78;
                                    var10006 = var0;
                                 } else {
                                    var6 = 78;
                                    var1 = var10004;
                                    if (var10004 <= var0) {
                                       String var9 = new String(var10003).intern();
                                       byte var4 = -1;
                                       b = var9;
                                       break pxClinit;
                                    }

                                    var10005 = var10003;
                                    var10 = 78;
                                    var10006 = var0;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                                       case 0 -> 97;
                                       case 1 -> 82;
                                       case 2 -> 60;
                                       case 3 -> 16;
                                       case 4 -> 9;
                                       case 5 -> 62;
                                       default -> 5;
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
                     }

                     var34++;
                  }

                  if (var6 != null) {
                     continue;
                  }
               }
            }

            var59 = var57;
            var75 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            break;
         }

         var57 = var59 + var75;
         var33++;
         if (var6 == null) {
            break;
         }
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var11 > 0.0F ? Math.max((int)(var22 + var25), var21) : var21, var7
      );
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label37: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = 20482;
         short var10003 = -22081;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         var2 = var10000;
         lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl var5 = var4;
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
            return 34;
         }

         var6 = var3;
      }

      int var8 = var6.ab().length();
      if (var2 != null) {
         var8 = var8 > 0 ? 1 : 0;
      }

      return var8 != 0 ? 44 : 34;
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

   @Override
   public void i() {
      this.m();
   }

   @Override
   public boolean j() {
      String[] var1 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      if (var1 != null) {
         IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(
            this.f()
         );
         if (var10000 != null) {
            return var10000.a();
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
      short var10001 = 20480;
      short var10002 = 29508;
      Intrinsics.checkNotNullParameter(var4, "color");
      float var5 = this.l();
      me.octo.client.utils.IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d(var1, var2 + 4, var3, 12.0F, 6.0F, var5 * 180.0F, var4, 1.5F);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "4Có\u009fÔÀAÇY\u0086*\n¸>¤ÝA\u0089#ªF\u0083\u000fÉ\u0010\u0019!\u008fMð-oÞ\u001d\u0099w2+\u0006_R\u0088þ\u0019à\u0005¯\u0083j!z\u000bæ\u0019JÂPµFx|6ñ\nèø®\u0005\u0000\u0092\u000bÉCï\nJ]*\u001fM\u008f\u008aùq0";
      int var4 = "4Có\u009fÔÀAÇY\u0086*\n¸>¤ÝA\u0089#ªF\u0083\u000fÉ\u0010\u0019!\u008fMð-oÞ\u001d\u0099w2+\u0006_R\u0088þ\u0019à\u0005¯\u0083j!z\u000bæ\u0019JÂPµFx|6ñ\nèø®\u0005\u0000\u0092\u000bÉCï\nJ]*\u001fM\u008f\u008aùq0"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 27;
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
                     case 0 -> 86;
                     case 1 -> 71;
                     case 2 -> 78;
                     case 3 -> 44;
                     case 4 -> 21;
                     case 5 -> 56;
                     default -> 68;
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
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.PXEvMid(
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

                  var2 = "T\n=;jÇ\u009e\u0017\u0080<\u0089\u0007²Ô$|T9Ð";
                  var4 = "T\n=;jÇ\u009e\u0017\u0080<\u0089\u0007²Ô$|T9Ð".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 28;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 20484) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 75;
            case 1 -> 109;
            case 2 -> 64;
            case 3 -> 1;
            case 4 -> 84;
            case 5 -> 148;
            case 6 -> 44;
            case 7 -> 189;
            case 8 -> 62;
            case 9 -> 88;
            case 10 -> 160;
            case 11 -> 103;
            case 12 -> 246;
            case 13 -> 133;
            case 14 -> 71;
            case 15 -> 137;
            case 16 -> 60;
            case 17 -> 163;
            case 18 -> 53;
            case 19 -> 63;
            case 20 -> 240;
            case 21 -> 42;
            case 22 -> 41;
            case 23 -> 182;
            case 24 -> 58;
            case 25 -> 234;
            case 26 -> 24;
            case 27 -> 131;
            case 28 -> 233;
            case 29 -> 22;
            case 30 -> 125;
            case 31 -> 50;
            case 32 -> 121;
            case 33 -> 32;
            case 34 -> 149;
            case 35 -> 85;
            case 36 -> 194;
            case 37 -> 152;
            case 38 -> 179;
            case 39 -> 91;
            case 40 -> 151;
            case 41 -> 117;
            case 42 -> 184;
            case 43 -> 248;
            case 44 -> 17;
            case 45 -> 76;
            case 46 -> 102;
            case 47 -> 138;
            case 48 -> 170;
            case 49 -> 122;
            case 50 -> 229;
            case 51 -> 72;
            case 52 -> 73;
            case 53 -> 128;
            case 54 -> 201;
            case 55 -> 183;
            case 56 -> 211;
            case 57 -> 18;
            case 58 -> 223;
            case 59 -> 129;
            case 60 -> 155;
            case 61 -> 25;
            case 62 -> 214;
            case 63 -> 87;
            case 64 -> 220;
            case 65 -> 247;
            case 66 -> 46;
            case 67 -> 68;
            case 68 -> 120;
            case 69 -> 213;
            case 70 -> 227;
            case 71 -> 174;
            case 72 -> 135;
            case 73 -> 134;
            case 74 -> 49;
            case 75 -> 212;
            case 76 -> 45;
            case 77 -> 142;
            case 78 -> 86;
            case 79 -> 123;
            case 80 -> 51;
            case 81 -> 107;
            case 82 -> 175;
            case 83 -> 119;
            case 84 -> 106;
            case 85 -> 29;
            case 86 -> 191;
            case 87 -> 173;
            case 88 -> 245;
            case 89 -> 10;
            case 90 -> 178;
            case 91 -> 249;
            case 92 -> 205;
            case 93 -> 14;
            case 94 -> 113;
            case 95 -> 145;
            case 96 -> 90;
            case 97 -> 89;
            case 98 -> 126;
            case 99 -> 216;
            case 100 -> 61;
            case 101 -> 79;
            case 102 -> 215;
            case 103 -> 101;
            case 104 -> 251;
            case 105 -> 95;
            case 106 -> 33;
            case 107 -> 93;
            case 108 -> 112;
            case 109 -> 4;
            case 110 -> 77;
            case 111 -> 193;
            case 112 -> 69;
            case 113 -> 159;
            case 114 -> 188;
            case 115 -> 224;
            case 116 -> 83;
            case 117 -> 209;
            case 118 -> 139;
            case 119 -> 140;
            case 120 -> 218;
            case 121 -> 130;
            case 122 -> 150;
            case 123 -> 0;
            case 124 -> 157;
            case 125 -> 92;
            case 126 -> 96;
            case 127 -> 180;
            case 128 -> 81;
            case 129 -> 219;
            case 130 -> 165;
            case 131 -> 202;
            case 132 -> 116;
            case 133 -> 244;
            case 134 -> 114;
            case 135 -> 164;
            case 136 -> 98;
            case 137 -> 238;
            case 138 -> 99;
            case 139 -> 206;
            case 140 -> 146;
            case 141 -> 243;
            case 142 -> 47;
            case 143 -> 28;
            case 144 -> 161;
            case 145 -> 190;
            case 146 -> 100;
            case 147 -> 187;
            case 148 -> 9;
            case 149 -> 108;
            case 150 -> 127;
            case 151 -> 228;
            case 152 -> 7;
            case 153 -> 55;
            case 154 -> 56;
            case 155 -> 141;
            case 156 -> 235;
            case 157 -> 23;
            case 158 -> 34;
            case 159 -> 207;
            case 160 -> 225;
            case 161 -> 16;
            case 162 -> 203;
            case 163 -> 162;
            case 164 -> 186;
            case 165 -> 232;
            case 166 -> 74;
            case 167 -> 176;
            case 168 -> 70;
            case 169 -> 27;
            case 170 -> 136;
            case 171 -> 181;
            case 172 -> 153;
            case 173 -> 236;
            case 174 -> 40;
            case 175 -> 8;
            case 176 -> 199;
            case 177 -> 111;
            case 178 -> 241;
            case 179 -> 115;
            case 180 -> 237;
            case 181 -> 154;
            case 182 -> 169;
            case 183 -> 12;
            case 184 -> 66;
            case 185 -> 132;
            case 186 -> 67;
            case 187 -> 143;
            case 188 -> 97;
            case 189 -> 30;
            case 190 -> 21;
            case 191 -> 65;
            case 192 -> 185;
            case 193 -> 43;
            case 194 -> 197;
            case 195 -> 6;
            case 196 -> 171;
            case 197 -> 242;
            case 198 -> 226;
            case 199 -> 2;
            case 200 -> 239;
            case 201 -> 144;
            case 202 -> 167;
            case 203 -> 204;
            case 204 -> 166;
            case 205 -> 54;
            case 206 -> 5;
            case 207 -> 222;
            case 208 -> 38;
            case 209 -> 48;
            case 210 -> 156;
            case 211 -> 59;
            case 212 -> 19;
            case 213 -> 80;
            case 214 -> 36;
            case 215 -> 221;
            case 216 -> 15;
            case 217 -> 168;
            case 218 -> 124;
            case 219 -> 57;
            case 220 -> 252;
            case 221 -> 200;
            case 222 -> 52;
            case 223 -> 230;
            case 224 -> 231;
            case 225 -> 208;
            case 226 -> 195;
            case 227 -> 37;
            case 228 -> 254;
            case 229 -> 250;
            case 230 -> 105;
            case 231 -> 94;
            case 232 -> 196;
            case 233 -> 13;
            case 234 -> 210;
            case 235 -> 253;
            case 236 -> 26;
            case 237 -> 20;
            case 238 -> 118;
            case 239 -> 11;
            case 240 -> 35;
            case 241 -> 217;
            case 242 -> 39;
            case 243 -> 3;
            case 244 -> 177;
            case 245 -> 78;
            case 246 -> 110;
            case 247 -> 198;
            case 248 -> 158;
            case 249 -> 172;
            case 250 -> 255;
            case 251 -> 31;
            case 252 -> 82;
            case 253 -> 147;
            case 254 -> 192;
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


   // ================= PX-RESTORE (L4) =================
   // The jar declares 13 members that the decompiled source lost: 10 ACC_BRIDGE
   // default-method forwarders and 3 ACC_SYNTHETIC Kotlin helpers.  They are
   // re-materialised below from the javap -c bytecode of
   // .analysis/me-octo-only.jar (see .analysis/agents/L4/javap_f1.txt).
   // PX-RESTORE bridge: jar a()F -> invokespecial InterfaceMethod IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a:()F
   public float a() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }

   // PX-RESTORE bridge: jar b()I -> invokespecial InterfaceMethod IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.b:()I
   public int b() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }

   // PX-RESTORE bridge: jar a(F)I -> invokespecial InterfaceMethod lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.a:(F)I
   public int a(float var1) {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(var1);
   }

   // PX-RESTORE bridge: jar a(FI)I -> invokespecial InterfaceMethod lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.a:(FI)I
   public int a(float var1, int var2) {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.a(var1, var2);
   }

   // PX-RESTORE bridge: jar g() -> invokespecial InterfaceMethod lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.g
   public lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll g() {
      return lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.super.g();
   }

   // PX-RESTORE bridge: jar a(Gui,IIIIF)Z -> invokespecial InterfaceMethod IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }

   // PX-RESTORE bridge: jar b(Gui,IIIIF)Z -> invokespecial InterfaceMethod IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.b
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
   }

   // PX-RESTORE bridge: jar a(Gui,IIFFFF)Z -> invokespecial InterfaceMethod IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   // PX-RESTORE bridge: jar a(CI)V -> invokespecial InterfaceMethod IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a:(CI)V
   public void a(char var1, int var2) {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
   }

   // PX-RESTORE bridge: jar d()V -> invokespecial InterfaceMethod IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.d:()V
   public void d() {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }

   // PX-RESTORE synthetic: Kotlin $-default bridge, mask bit 64 restores var7=1.0F
   static void a(IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll var0, float var1, float var2, float var3, float var4, float[][] var5, float var6, float var7, int var8, Object var9) {
      if ((var8 & 64) != 0) {
         var7 = 1.0F;
      }

      var0.a(var1, var2, var3, var4, var5, var6, var7);
   }

   // PX-RESTORE synthetic: package-private accessor over m()V
   public static final void a(IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll var0) {
      var0.m();
   }

   // PX-RESTORE synthetic: package-private field accessor
   public static final lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl b(IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll var0) {
      return var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }
   // =============== /PX-RESTORE (L4) ===============

   public static final class PXEvMid implements me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
         this.this$0 = null;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0.0f;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0.0f;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
        }
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private PXEvMid() {
         this.this$0 = null;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0.0f;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0.0f;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
      }

      // PX-RBPORT rbportB: jar anonymous inner-class body ported member-for-member
      final me.octo.client.IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll this$0;
      final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static java.lang.String b;

      public PXEvMid(me.octo.client.IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll var0, int var1, float var2, float var3, int var4, int var5) {
         this.this$0 = var0;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      public void e() {
         me.octo.client.IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.a(this.this$0);
         float var1 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((float)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, 26.0f, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, (float)this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, (float)this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) + 6.0f;
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, b + me.octo.client.IlllllllIIIIIlllllIIIlIIlIlIlIlllIllIIIllIIlIIlllllllIllIIIlIlllIllIlllIlIIIllIlIlIll.b(this.this$0).Z(), this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(140), var1, 0L, 32, null);
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

      static {
         b = "theme:";
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
}
