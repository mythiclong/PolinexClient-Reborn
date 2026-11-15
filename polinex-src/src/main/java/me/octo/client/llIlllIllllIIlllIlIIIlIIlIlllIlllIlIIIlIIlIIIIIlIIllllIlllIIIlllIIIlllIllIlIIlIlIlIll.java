package me.octo.client;

import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private long lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private final float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private final float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private final float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final DecimalFormat IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] d;
   private static String[] e;

   public llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll(
      @NotNull lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI var1
   ) {
      short var10001 = 7331;
      short var10002 = -4152;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 205.0F;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 102.5F;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 150.0F;
      short var10003 = 7328;
      short var10004 = -24996;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new DecimalFormat("#.##");
      this.f();
   }

   private final void f() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
            );
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
            );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
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
      Object var96 = null; // PX-FIX
      Object var95 = null; // PX-FIX
      Object var92 = null; // PX-FIX
      Object var91 = null; // PX-FIX
      float var87 = 0; // PX-FIX
      float var84 = 0; // PX-FIX
      float var82 = 0; // PX-FIX
      float var80 = 0; // PX-FIX
      Object var78 = null; // PX-FIX
      float var77 = 0; // PX-FIX
      float var75 = 0; // PX-FIX
      float var73 = 0; // PX-FIX
      Object var71 = null; // PX-FIX
      Object var65 = null; // PX-FIX
      float var62 = 0; // PX-FIX
      int[] var6;
      Object var7;
      int var8;
      float var9;
      String var10;
      double var11;
      int var13;
      int var61;
      short var10001 = 7333;
      short var10002 = -11577;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 7329;
      var10002 = -23310;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      var7 = null;
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      var8 = var3 - 4;
      var9 = var2.e() - 185 - 10;
      var10 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q());
      double var86 = var9 - 125;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var100 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Intrinsics.checkNotNull(var10);
      var11 = var86
         - me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(var100, var10, false, 2, null);
      var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var11 - 10);
      var6 = var10000;
      var61 = ((this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
      label237:
      if (var6 != null) {
         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            long var14 = System.currentTimeMillis() - this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            float var16 = RangesKt.coerceIn(
               (float)var14 / this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, 0.0F, 1.0F
            );
            float var17 = var16 * var16 * (3.0F - 2.0F * var16);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               + (
                     this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  )
                  * var17;
            float var105;
            var61 = (var105 = var16 - 1.0F) == 0.0F ? 0 : (var105 < 0.0F ? -1 : 1);
            if (var6 == null) {
               break label237;
            }

            if (var61 >= 0) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
            }
         }

         var61 = ((this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) ? 1 : 0);
      }

      label230: {
         if (var61 != 0) {
            long var28 = System.currentTimeMillis() - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            float var30 = RangesKt.coerceIn(
               (float)var28 / this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, 0.0F, 1.0F
            );
            float var32 = var30 * var30 * (3.0F - 2.0F * var30);
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               + (
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        - this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  )
                  * var32;
            var62 = var30;
            var87 = 1.0F;
            if (var6 == null) {
               break label230;
            }

            if (var30 >= 1.0F) {
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
            }
         }

         var62 = var9 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         var87 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      float var15;
      float var29;
      int var31;
      label224: {
         label240: {
            var29 = var62 + var87;
            var15 = var9
               - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var31 = var13 + var8 >> 1;
            var61 = ((this.b(var1, var4, var5, var9, var31 - 7.0F, var29, var15)) ? 1 : 0);
            if (var6 != null) {
               if (var61 == 0) {
                  break label240;
               }

               float var106;
               var61 = (var106 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var106 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label224;
            }

            if (var61 > 0) {
               var61 = 1;
               break label224;
            }
         }

         var61 = 0;
      }

      label241: {
         int var33 = var61;
         var61 = var33;
         if (var6 != null) {
            if (var33 == 0) {
               break label241;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var61 = ((this.a(var4, (int)var29, (int)var15)) ? 1 : 0);
         }

         label242: {
            label206:
            if (var6 != null) {
               if (var61 != 0) {
                  var61 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
                  if (var6 == null) {
                     break label206;
                  }

                  if (!this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                     var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                        @Override
                        public void e() {
                           llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll.this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
                           llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll.this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
                           llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll.this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = System.currentTimeMillis();
                        }
                     };
                     break label241;
                  }
               }

               var65 = this;
               if (var6 == null) {
                  break label242;
               }

               var61 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
            }

            if (var61 != 0) {
               break label241;
            }

            var65 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
               @Override
               public void e() {
                  llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll.this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
                  llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll.this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
                  llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll.this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
               }
            };
         }

         var7 = var65;
      }

      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         var10,
         (int)var11,
         var31 - 8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var66 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      String var88 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r());
      short var10003 = 7332;
      short var10004 = 12597;
      Intrinsics.checkNotNullExpressionValue(var88, "format(...)");
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(String.valueOf(
         var66),
         var88,
         (int)(var9 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl + 15),
         var31 - 8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var67 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      String var89 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s());
      var10003 = 7330;
      var10004 = 25625;
      Intrinsics.checkNotNullExpressionValue(var89, "format(...)");
      var67.a(
         var89,
         (int)var29,
         var31 + 12,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var68 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      String var90 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t());
      var10003 = 7330;
      var10004 = 25625;
      Intrinsics.checkNotNullExpressionValue(var90, "format(...)");
      var68.a(
         var90,
         (int)var15,
         var31 - 30,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      );
      float var18 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u()
         / (
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
               - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
         );
      var61 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      if (var6 != null) {
         label158:
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            label188: {
               label187: {
                  var61 = GLFW.glfwGetMouseButton(
                     me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .getWindow()
                        .handle(),
                     0
                  );
                  if (var6 != null) {
                     if (var61 != 1) {
                        break label187;
                     }

                     var71 = var5;
                     var91 = var2.d() + 100;
                     if (var6 == null) {
                        break label188;
                     }

                     float var107;
                     var61 = (var107 = (float)((Double)var71 - (Double)var91)) == 0.0F ? 0 : (var107 < 0.0F ? -1 : 1);
                  }

                  if (var61 > 0) {
                     float var19 = var9 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                     float var20 = var9 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                     int var21 = var4;
                     float var108;
                     var61 = (var108 = var4 - var19) == 0.0F ? 0 : (var108 < 0.0F ? -1 : 1);
                     if (var6 != null) {
                        if (var61 < 0) {
                           var21 = (int)var19;
                        }

                        float var109;
                        var61 = (var109 = var21 - var20) == 0.0F ? 0 : (var109 < 0.0F ? -1 : 1);
                     }

                     label247: {
                        if (var6 != null) {
                           if (var61 > 0) {
                              var21 = (int)var20;
                           }

                           var73 = var21;
                           var92 = var15 - var18;
                           if (var6 == null) {
                              break label247;
                           }

                           float var110;
                           var61 = (var110 = var73 - ((Integer)var92)) == 0.0F ? 0 : (var110 < 0.0F ? -1 : 1);
                        }

                        if (var61 > 0) {
                           var21 = (int)(var15 - var18);
                        }

                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var21 - var19;
                        var73 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r();
                        var92 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
                     }

                     label172: {
                        float var22 = var73 - ((Integer)var92);
                        float var23 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                        float var24 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q() + var22 * var23;
                        float var74 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
                        float var93 = 0.0F;
                        if (var6 != null) {
                           if (!(var74 > 0.0F)) {
                              var75 = var24;
                              break label172;
                           }

                           var74 = var24 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
                           var93 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
                        }

                        float var26 = var74 / var93;
                        int var27 = (int)((float)Math.rint(var26));
                        var75 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                           + var27 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
                     }

                     float var25 = RangesKt.coerceIn(
                        var75,
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
                           - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u()
                     );
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var25);
                     if (var6 != null) {
                        break label158;
                     }
                  }
               }

               var71 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r();
               var91 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
            }

            float var34;
            label163: {
               var34 = (float)((Double)var71 - (Double)var91);
               float var37 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               float var40 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q() + var34 * var37;
               float var43 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
               float var76 = var43;
               float var94 = 0.0F;
               if (var6 != null) {
                  if (!(var43 > 0.0F)) {
                     var77 = var40;
                     break label163;
                  }

                  var76 = var40 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
                  var94 = var43;
               }

               float var49 = var76 / var94;
               int var54 = (int)((float)Math.rint(var49));
               var77 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q() + var54 * var43;
            }

            float var46 = var77;
            float var50 = RangesKt.coerceIn(
               var46,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
                  - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u()
            );
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var50);
            float var55 = (var50 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()) / var34;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
               * var55;
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = System.currentTimeMillis();
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
         }

         var61 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      }

      if (var6 != null) {
         if (var61 == 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var13 + 5, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
            );
         }

         var61 = GLFW.glfwGetMouseButton(
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .handle(),
            0
         );
      }

      label148: {
         label147: {
            if (var6 != null) {
               if (var61 != 1) {
                  break label147;
               }

               var78 = var5;
               var95 = var2.d() + 100;
               if (var6 == null) {
                  break label148;
               }

               float var111;
               var61 = (var111 = (float)((Double)var78 - (Double)var95)) == 0.0F ? 0 : (var111 < 0.0F ? -1 : 1);
            }

            if (var61 > 0) {
               float var35 = var9 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
               float var38 = var9 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
               int var41 = var4;
               float var112;
               var61 = (var112 = var4 - var35) == 0.0F ? 0 : (var112 < 0.0F ? -1 : 1);
               if (var6 != null) {
                  if (var61 < 0) {
                     var41 = (int)var35;
                  }

                  float var113;
                  var61 = (var113 = var41 - var38) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
               }

               label252: {
                  if (var6 != null) {
                     if (var61 > 0) {
                        var41 = (int)var38;
                     }

                     var80 = var41;
                     var96 = var29 + var18;
                     if (var6 == null) {
                        break label252;
                     }

                     float var114;
                     var61 = (var114 = var80 - ((Integer)var96)) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
                  }

                  if (var61 < 0) {
                     var41 = (int)(var29 + var18);
                  }

                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var41 - var35;
                  var80 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r();
                  var96 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
               }

               label132: {
                  float var44 = var80 - ((Integer)var96);
                  float var47 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                  float var51 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q() + var44 * var47;
                  float var81 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
                  float var97 = 0.0F;
                  if (var6 != null) {
                     if (!(var81 > 0.0F)) {
                        var82 = var51;
                        break label132;
                     }

                     var81 = var51 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
                     var97 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
                  }

                  float var59 = var81 / var97;
                  int var60 = (int)((float)Math.rint(var59));
                  var82 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
                     + var60 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
               }

               float var56 = RangesKt.coerceIn(
                  var82,
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
                     + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
               );
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var56);
               if (var6 != null) {
                  return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
                     var13 + 5, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
                  );
               }
            }
         }

         var78 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r();
         var95 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
      }

      float var36;
      label121: {
         var36 = (float)((Double)var78 - (Double)var95);
         float var39 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         float var42 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q() + var36 * var39;
         float var45 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v();
         float var83 = var45;
         float var98 = 0.0F;
         if (var6 != null) {
            if (!(var45 > 0.0F)) {
               var84 = var42;
               break label121;
            }

            var83 = var42 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q();
            var98 = var45;
         }

         float var52 = var83 / var98;
         int var57 = (int)((float)Math.rint(var52));
         var84 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q() + var57 * var45;
      }

      float var48 = var84;
      float var53 = RangesKt.coerceIn(
         var48,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u(),
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
      );
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var53);
      float var58 = (var53 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()) / var36;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         * var58;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var13 + 5, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
      );
   }

   private final boolean b(GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      Object var40 = null; // PX-FIX
      Object var38 = null; // PX-FIX
      int[] var8;
      float var9;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      int var34;
      label144: {
         label147: {
            var9 = var4 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            float var10 = var4 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            var11 = RangesKt.coerceAtLeast(var9, RangesKt.coerceAtMost(var6, var10));
            var12 = RangesKt.coerceAtLeast(var9, RangesKt.coerceAtMost(var7, var10));
            var13 = 10.0F;
            int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
            var14 = 9.5F;
            var8 = var10000;
            var15 = RangesKt.coerceAtMost(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               var13 / 2.0F
            );
            float var45;
            var34 = (var45 = var2 - (var4 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl - 5)) == 0.0F
               ? 0
               : (var45 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var34 < 0) {
                  break label147;
               }

               float var46;
               var34 = (var46 = var3 - (var5 - 6)) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var34 < 0) {
                  break label147;
               }

               float var47;
               var34 = (var47 = var2 - (var4 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl + 5)) == 0.0F
                  ? 0
                  : (var47 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var34 >= 0) {
                  break label147;
               }

               float var48;
               var34 = (var48 = var3 - (var5 + var13 + 12)) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label144;
            }

            if (var34 < 0) {
               var34 = 1;
               break label144;
            }
         }

         var34 = 0;
      }

      int var16;
      label123: {
         label148: {
            var16 = var34;
            var34 = var16;
            if (var8 != null) {
               if (var16 == 0) {
                  break label148;
               }

               var34 = ((this.a(var2, (int)var6, (int)var7)) ? 1 : 0);
            }

            if (var8 == null) {
               break label123;
            }

            if (var34 != 0) {
               var34 = 1;
               break label123;
            }
         }

         var34 = 0;
      }

      int var17;
      label112: {
         label149: {
            var17 = var34;
            var34 = var16;
            if (var8 != null) {
               if (var16 == 0) {
                  break label149;
               }

               var34 = var17;
            }

            if (var8 == null) {
               break label112;
            }

            if (var34 == 0) {
               var34 = 1;
               break label112;
            }
         }

         var34 = 0;
      }

      int var18;
      label101: {
         var18 = var34;
         var34 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
         if (var8 != null) {
            if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               long var20 = System.currentTimeMillis() - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               float var22 = RangesKt.coerceIn((float)var20 / 150.0F, 0.0F, 1.0F);
               float var23 = var22 * var22 * (3.0F - 2.0F * var22);
               var38 = var14 * (1.0F + var23 * 0.3F);
               break label101;
            }

            var34 = var17;
         }

         var38 = var34 != 0 ? var14 * 1.15F : var14;
      }

      float var19;
      label95: {
         var19 =((Float)( var38));
         var34 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
         if (var8 != null) {
            if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               long var21 = System.currentTimeMillis() - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               float var31 = RangesKt.coerceIn((float)var21 / 150.0F, 0.0F, 1.0F);
               float var24 = var31 * var31 * (3.0F - 2.0F * var31);
               var40 = var14 * (1.0F + var24 * 0.3F);
               break label95;
            }

            var34 = var18;
         }

         var40 = var34 != 0 ? var14 * 1.15F : var14;
      }

      float var27 =((Float)( var40));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var5 + 1.0F,
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         var13,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 30),
         var15
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var5,
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         var13,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .l(),
         var15
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var5,
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         var13,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .m(),
         var15
      );
      float var49;
      var34 = (var49 = var12 - var11) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
      if (var8 != null) {
         if (var34 > 0) {
            float var28 = var12 - var11;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var11,
                  var5,
                  var28,
                  var13,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .n(),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .o(),
                  me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  var15
               );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var11 + 1.0F,
               var5 + 1.0F,
               var28 - 2.0F,
               var13 - 2.0F,
               1.0F,
               new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, 40),
               var15 - 1.0F
            );
         }

         var34 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      }

      if (var8 != null) {
         var34 = var34 != 0 ? 60 : 30;
      }

      int var29 = var34;
      var34 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var8 != null) {
         var34 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ? 60 : 30;
      }

      int var30 = var34;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11,
         var5 + var13 / 2.0F + 2.0F,
         var19,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, var29)
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var12,
         var5 + var13 / 2.0F + 2.0F,
         var27,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, var30)
      );
      IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var11,
            var5 + var13 / 2.0F,
            var19,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
         );
      IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var12,
            var5 + var13 / 2.0F,
            var27,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
         );
      float var32 = var19 - 3.0F;
      float var33 = var27 - 3.0F;
      var34 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      if (var8 != null) {
         var34 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ? 150 : 120;
      }

      int var25 = var34;
      var34 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var8 != null) {
         var34 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ? 150 : 120;
      }

      int var26 = var34;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11 - 2.0F,
         var5 + var13 / 2.0F - 2.0F,
         var32,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, var25)
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var12 - 2.0F,
         var5 + var13 / 2.0F - 2.0F,
         var33,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, var26)
      );
      return (var16 != 0);
   }

   private final boolean a(int var1, int var2, int var3) {
      int[] var4 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      int var10000 = Math.abs(var1 - var2);
      if (var4 != null) {
         var10000 = var10000 < Math.abs(var1 - var3) ? 1 : 0;
      }

      return (var10000 != 0);
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
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = " c\u0099\u001dÖm\\©ÿÝ\u0004\u0007ÒFE\u0007g\u0092G8ïªÍ\u000b\u009bÃi@ä\u0085êÒ¿]â";
      int var4 = " c\u0099\u001dÖm\\©ÿÝ\u0004\u0007ÒFE\u0007g\u0092G8ïªÍ\u000b\u009bÃi@ä\u0085êÒ¿]â".length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 54;
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
                     case 0 -> 75;
                     case 1 -> 81;
                     case 2 -> 91;
                     case 3 -> 13;
                     case 4 -> 15;
                     case 5 -> 104;
                     default -> 2;
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

                  var2 = "ãà>\u0089T÷Õ·\u0094¿ñ\u000b3\u001cu²nÒ²1½(«";
                  var4 = "ãà>\u0089T÷Õ·\u0094¿ñ\u000b3\u001cu²nÒ²1½(«".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 62;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 7329) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 113;
            case 1 -> 227;
            case 2 -> 114;
            case 3 -> 187;
            case 4 -> 128;
            case 5 -> 229;
            case 6 -> 65;
            case 7 -> 47;
            case 8 -> 184;
            case 9 -> 45;
            case 10 -> 174;
            case 11 -> 85;
            case 12 -> 38;
            case 13 -> 29;
            case 14 -> 183;
            case 15 -> 126;
            case 16 -> 24;
            case 17 -> 188;
            case 18 -> 59;
            case 19 -> 204;
            case 20 -> 170;
            case 21 -> 254;
            case 22 -> 234;
            case 23 -> 15;
            case 24 -> 176;
            case 25 -> 243;
            case 26 -> 95;
            case 27 -> 116;
            case 28 -> 54;
            case 29 -> 70;
            case 30 -> 19;
            case 31 -> 97;
            case 32 -> 49;
            case 33 -> 130;
            case 34 -> 107;
            case 35 -> 224;
            case 36 -> 240;
            case 37 -> 86;
            case 38 -> 251;
            case 39 -> 91;
            case 40 -> 192;
            case 41 -> 144;
            case 42 -> 245;
            case 43 -> 112;
            case 44 -> 20;
            case 45 -> 193;
            case 46 -> 7;
            case 47 -> 163;
            case 48 -> 44;
            case 49 -> 17;
            case 50 -> 9;
            case 51 -> 228;
            case 52 -> 83;
            case 53 -> 14;
            case 54 -> 98;
            case 55 -> 122;
            case 56 -> 239;
            case 57 -> 22;
            case 58 -> 185;
            case 59 -> 68;
            case 60 -> 249;
            case 61 -> 63;
            case 62 -> 99;
            case 63 -> 18;
            case 64 -> 171;
            case 65 -> 238;
            case 66 -> 236;
            case 67 -> 140;
            case 68 -> 147;
            case 69 -> 89;
            case 70 -> 21;
            case 71 -> 117;
            case 72 -> 206;
            case 73 -> 162;
            case 74 -> 195;
            case 75 -> 62;
            case 76 -> 237;
            case 77 -> 73;
            case 78 -> 53;
            case 79 -> 160;
            case 80 -> 36;
            case 81 -> 135;
            case 82 -> 143;
            case 83 -> 25;
            case 84 -> 150;
            case 85 -> 201;
            case 86 -> 179;
            case 87 -> 78;
            case 88 -> 110;
            case 89 -> 77;
            case 90 -> 118;
            case 91 -> 123;
            case 92 -> 134;
            case 93 -> 11;
            case 94 -> 241;
            case 95 -> 231;
            case 96 -> 71;
            case 97 -> 226;
            case 98 -> 190;
            case 99 -> 225;
            case 100 -> 191;
            case 101 -> 154;
            case 102 -> 93;
            case 103 -> 119;
            case 104 -> 175;
            case 105 -> 35;
            case 106 -> 87;
            case 107 -> 178;
            case 108 -> 232;
            case 109 -> 156;
            case 110 -> 26;
            case 111 -> 103;
            case 112 -> 164;
            case 113 -> 5;
            case 114 -> 166;
            case 115 -> 218;
            case 116 -> 252;
            case 117 -> 169;
            case 118 -> 212;
            case 119 -> 23;
            case 120 -> 82;
            case 121 -> 151;
            case 122 -> 3;
            case 123 -> 244;
            case 124 -> 167;
            case 125 -> 34;
            case 126 -> 141;
            case 127 -> 208;
            case 128 -> 106;
            case 129 -> 223;
            case 130 -> 75;
            case 131 -> 90;
            case 132 -> 115;
            case 133 -> 33;
            case 134 -> 101;
            case 135 -> 181;
            case 136 -> 109;
            case 137 -> 136;
            case 138 -> 210;
            case 139 -> 205;
            case 140 -> 4;
            case 141 -> 96;
            case 142 -> 247;
            case 143 -> 6;
            case 144 -> 88;
            case 145 -> 0;
            case 146 -> 81;
            case 147 -> 138;
            case 148 -> 220;
            case 149 -> 158;
            case 150 -> 213;
            case 151 -> 121;
            case 152 -> 58;
            case 153 -> 13;
            case 154 -> 92;
            case 155 -> 120;
            case 156 -> 56;
            case 157 -> 124;
            case 158 -> 253;
            case 159 -> 177;
            case 160 -> 172;
            case 161 -> 41;
            case 162 -> 200;
            case 163 -> 219;
            case 164 -> 250;
            case 165 -> 139;
            case 166 -> 146;
            case 167 -> 55;
            case 168 -> 2;
            case 169 -> 242;
            case 170 -> 52;
            case 171 -> 131;
            case 172 -> 100;
            case 173 -> 217;
            case 174 -> 69;
            case 175 -> 248;
            case 176 -> 50;
            case 177 -> 215;
            case 178 -> 152;
            case 179 -> 222;
            case 180 -> 235;
            case 181 -> 30;
            case 182 -> 137;
            case 183 -> 189;
            case 184 -> 127;
            case 185 -> 74;
            case 186 -> 10;
            case 187 -> 145;
            case 188 -> 203;
            case 189 -> 12;
            case 190 -> 197;
            case 191 -> 1;
            case 192 -> 209;
            case 193 -> 102;
            case 194 -> 39;
            case 195 -> 202;
            case 196 -> 31;
            case 197 -> 186;
            case 198 -> 207;
            case 199 -> 159;
            case 200 -> 94;
            case 201 -> 66;
            case 202 -> 79;
            case 203 -> 57;
            case 204 -> 28;
            case 205 -> 76;
            case 206 -> 255;
            case 207 -> 211;
            case 208 -> 233;
            case 209 -> 108;
            case 210 -> 16;
            case 211 -> 129;
            case 212 -> 198;
            case 213 -> 168;
            case 214 -> 196;
            case 215 -> 43;
            case 216 -> 148;
            case 217 -> 216;
            case 218 -> 199;
            case 219 -> 51;
            case 220 -> 46;
            case 221 -> 67;
            case 222 -> 61;
            case 223 -> 155;
            case 224 -> 149;
            case 225 -> 64;
            case 226 -> 111;
            case 227 -> 32;
            case 228 -> 173;
            case 229 -> 27;
            case 230 -> 153;
            case 231 -> 104;
            case 232 -> 84;
            case 233 -> 80;
            case 234 -> 161;
            case 235 -> 72;
            case 236 -> 230;
            case 237 -> 37;
            case 238 -> 42;
            case 239 -> 142;
            case 240 -> 105;
            case 241 -> 182;
            case 242 -> 194;
            case 243 -> 132;
            case 244 -> 133;
            case 245 -> 214;
            case 246 -> 246;
            case 247 -> 60;
            case 248 -> 40;
            case 249 -> 8;
            case 250 -> 165;
            case 251 -> 180;
            case 252 -> 125;
            case 253 -> 48;
            case 254 -> 221;
            default -> 157;
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

   // SYN1 Phase A: compiler-synthesised members backfilled from .analysis/me-octo-only.jar bytecode

   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }

   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }

   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1);
   }

   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
   }

   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a(char var1, int var2) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
      return;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }

   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
      return;
   }

   public static final void a(me.octo.client.llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll var1, boolean var2) {
      var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
   }

   public static final void b(me.octo.client.llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll var1, boolean var2) {
      var1.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var2;
   }

   public static final void a(me.octo.client.llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll var1, long var2) {
      var1.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var2;
   }

   public static final void c(me.octo.client.llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll var1, boolean var2) {
      var1.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
   }

   public static final void d(me.octo.client.llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll var1, boolean var2) {
      var1.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var2;
   }

   public static final void b(me.octo.client.llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll var1, long var2) {
      var1.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
   }
}
