package me.octo.client;

import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class lIIIllllllIIllIIllIlIIIlIlllIIlllIlIIlIIlIlIIIllIllIIIllllIlIIllIIlllIlIllIIlllIIIllI
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final IlllIIlIIlIllIIIIIIllIIllIlIllllIIIIlIIlIlIlIIlllIlIIIlIIIIIlIlIIllllIlllIlllIllIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final DecimalFormat lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] d;
   private static String[] e;

   public lIIIllllllIIllIIllIlIIIlIlllIIlllIlIIlIIlIlIIIllIllIIIllllIlIIllIIlllIlIllIIlllIIIllI(
      @NotNull IlllIIlIIlIllIIIIIIllIIllIlIllllIIIIlIIlIlIlIIlllIlIIIlIIIIIlIlIIllllIlllIlllIllIlIIl var1
   ) {
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      short var10002 = -9011;
      short var10003 = 26848;
      Intrinsics.checkNotNullParameter(var1, "setting");
      int[] var2 = var10000;
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 205.0F;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 102.5F;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n()
            );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 150.0F;
      int var3 = RangesKt.coerceAtMost(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p(), 2);
      var10002 = -9010;
      var10003 = -4893;
      StringBuilder var4 = new StringBuilder("#.");
      int var5 = 0;

      while (true) {
         if (var5 < var3) {
            boolean var7 = false;
            var4.append("#");
            var5++;
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         break;
      }

      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new DecimalFormat(var4.toString());
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
      float var55 = 0; // PX-FIX
      float var52 = 0; // PX-FIX
      float var49 = 0; // PX-FIX
      float var47 = 0; // PX-FIX
      int var45 = 0; // PX-FIX
      float var39 = 0; // PX-FIX
      int[] var6;
      Object var7;
      int var8;
      float var9;
      String var10;
      double var11;
      int var13;
      int var38;
      short var10001 = -9012;
      short var10002 = -30093;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = -9014;
      var10002 = 12100;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      var7 = null;
      var8 = var3 - 22;
      var9 = var2.e() - 185 - 10;
      var10 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l());
      double var51 = var9 - 125;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var59 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Intrinsics.checkNotNull(var10);
      var11 = var51
         - me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(var59, var10, false, 2, null);
      var6 = var10000;
      var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var11 - 10);
      var38 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      label100:
      if (var6 != null) {
         if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            var38 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
            if (var6 == null) {
               break label100;
            }

            if (!this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
               float var14 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n()
                     );
               float var62;
               var38 = (var62 = Math.abs(var14 - this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) - 1.0F) == 0.0F
                  ? 0
                  : (var62 < 0.0F ? -1 : 1);
               if (var6 == null) {
                  break label100;
               }

               if (var38 > 0) {
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var14;
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
               }
            }
         }

         var38 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
      }

      label90: {
         if (var38 != 0) {
            long var25 = System.currentTimeMillis() - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            float var16 = RangesKt.coerceIn(
               (float)var25 / this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, 0.0F, 1.0F
            );
            float var17 = var16 * var16 * (3.0F - 2.0F * var16);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               + (
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  )
                  * var17;
            var39 = var16;
            var52 = 1.0F;
            if (var6 == null) {
               break label90;
            }

            if (var16 >= 1.0F) {
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
            }
         }

         var39 = var9 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var52 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      int var15;
      float var26;
      label84: {
         var26 = var39 + var52;
         var15 = var13 + var8 >> 1;
         Object var40 = this;
         if (var6 != null) {
            if (!this.a(var1, var4, var5, var9, var15 - 7.0F, var26)) {
               break label84;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var40 = this;
         }

         var7 = var40;
      }

      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         var10,
         (int)var11,
         var15 - 8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var41 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      String var53 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m());
      short var10003 = -9013;
      short var10004 = -18208;
      Intrinsics.checkNotNullExpressionValue(var53, "format(...)");
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(String.valueOf(
         var41),
         var53,
         (int)(var9 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl + 15),
         var15 - 8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var42 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      String var54 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .format(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n());
      var10003 = -9009;
      var10004 = 20797;
      Intrinsics.checkNotNullExpressionValue(var54, "format(...)");
      var42.b(
         var54,
         (int)var26,
         var15 + 20,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      );
      var38 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      if (var6 != null) {
         if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var13, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
            );
         }

         var38 = GLFW.glfwGetMouseButton(
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .handle(),
            0
         );
      }

      if (var38 == 1) {
         label105: {
            float var27 = var9 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            float var29 = var9 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            int var18 = var4;
            float var63;
            var38 = (var63 = var4 - var27) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
            if (var6 != null) {
               if (var38 < 0) {
                  var18 = (int)var27;
               }

               var45 = var18;
               var55 = var29;
               if (var6 == null) {
                  break label105;
               }

               float var64;
               var38 = (var64 = var45 - var29) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
            }

            if (var38 > 0) {
               var18 = (int)var29;
            }

            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var18 - var27;
            var45 = (int)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m();
            var55 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l();
         }

         label63: {
            float var19 = var45 - var55;
            float var20 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               / this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            float var21 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l() + var19 * var20;
            float var46 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o();
            float var56 = 0.0F;
            if (var6 != null) {
               if (!(var46 > 0.0F)) {
                  var47 = var21;
                  break label63;
               }

               var46 = var21 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l();
               var56 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o();
            }

            float var23 = var46 / var56;
            int var24 = (int)((float)Math.rint(var23));
            var47 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l()
               + var24 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o();
         }

         float var22 = RangesKt.coerceIn(
            var47,
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(),
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m()
         );
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var22);
         if (var6 != null) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var13, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
            );
         }
      }

      float var28;
      label55: {
         var28 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m()
            - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l();
         float var30 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            / this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var31 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l() + var28 * var30;
         float var32 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o();
         float var48 = var32;
         float var57 = 0.0F;
         if (var6 != null) {
            if (!(var32 > 0.0F)) {
               var49 = var31;
               break label55;
            }

            var48 = var31 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l();
            var57 = var32;
         }

         float var34 = var48 / var57;
         int var36 = (int)((float)Math.rint(var34));
         var49 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l() + var36 * var32;
      }

      float var33 = var49;
      float var35 = RangesKt.coerceIn(
         var33,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(),
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m()
      );
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var35);
      float var37 = (var35 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l()) / var28;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         * var37;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var13, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
      );
   }

   private final boolean a(GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6) {
      Object var26 = null; // PX-FIX
      int[] var7;
      float var8;
      float var10;
      float var11;
      float var12;
      float var13;
      int var24;
      label76: {
         label79: {
            int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
            var8 = var4 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var7 = var10000;
            float var9 = var4 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10 = RangesKt.coerceAtLeast(var8, RangesKt.coerceAtMost(var6, var9));
            var11 = 10.0F;
            var12 = 9.5F;
            var13 = RangesKt.coerceAtMost(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               var11 / 2.0F
            );
            float var29;
            var24 = (var29 = var2 - (var4 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl - 5)) == 0.0F
               ? 0
               : (var29 < 0.0F ? -1 : 1);
            if (var7 != null) {
               if (var24 < 0) {
                  break label79;
               }

               float var30;
               var24 = (var30 = var3 - (var5 - 6)) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var24 < 0) {
                  break label79;
               }

               float var31;
               var24 = (var31 = var2 - (var4 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl + 5)) == 0.0F
                  ? 0
                  : (var31 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var24 >= 0) {
                  break label79;
               }

               float var32;
               var24 = (var32 = var3 - (var5 + var11 + 12)) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
            }

            if (var7 == null) {
               break label76;
            }

            if (var24 < 0) {
               var24 = 1;
               break label76;
            }
         }

         var24 = 0;
      }

      int var14;
      label55: {
         var14 = var24;
         var24 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
         if (var7 != null) {
            if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               long var16 = System.currentTimeMillis() - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               float var18 = RangesKt.coerceIn((float)var16 / 150.0F, 0.0F, 1.0F);
               float var19 = var18 * var18 * (3.0F - 2.0F * var18);
               var26 = var12 * (1.0F + var19 * 0.3F);
               break label55;
            }

            var24 = var14;
         }

         var26 = var24 != 0 ? var12 * 1.15F : var12;
      }

      float var15 =((Float)( var26));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var8,
         var5 + 1.0F,
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var11,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 30),
         var13
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var8,
         var5,
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var11,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .l(),
         var13
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var8,
         var5,
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var11,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .m(),
         var13
      );
      float var20 = (var10 - var8) / this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      float var33;
      var24 = (var33 = var20 - 0.0F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
      if (var7 != null) {
         if (var24 > 0) {
            float var17 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * var20;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var8,
                  var5,
                  var17,
                  var11,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .n(),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .o(),
                  me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  var13
               );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var8 + 1.0F,
               var5 + 1.0F,
               var17 - 2.0F,
               var11 - 2.0F,
               1.0F,
               new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, 40),
               var13 - 1.0F
            );
         }

         var24 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      }

      if (var7 != null) {
         var24 = var24 != 0 ? 60 : 30;
      }

      int var21 = var24;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var10,
         var5 + var11 / 2.0F + 2.0F,
         var15,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, var21)
      );
      IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var10,
            var5 + var11 / 2.0F,
            var15,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
         );
      float var22 = var15 - 3.0F;
      var24 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      if (var7 != null) {
         var24 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ? 150 : 120;
      }

      int var23 = var24;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var10 - 2.0F,
         var5 + var11 / 2.0F - 2.0F,
         var22,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, var23)
      );
      return (var14 != 0);
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   public void e() {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = System.currentTimeMillis();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "ê¤x·½'Ä\u0007\u0094Ø\u009c\u0002Ç@\u0007ç\u001ah2q·\u001b\u000b%iÐªûÆ,\u0019L\\ø";
      int var4 = "ê¤x·½'Ä\u0007\u0094Ø\u009c\u0002Ç@\u0007ç\u001ah2q·\u001b\u000b%iÐªûÆ,\u0019L\\ø".length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 49;
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
                     case 0 -> 47;
                     case 1 -> 92;
                     case 2 -> 15;
                     case 3 -> 80;
                     case 4 -> 25;
                     case 5 -> 120;
                     default -> 34;
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

                  var2 = "tv]\u001bïDx\u009dõ}F\n\u0098ÁW¤\u0082ð%mÈ\u008c";
                  var4 = "tv]\u001bïDx\u009dõ}F\n\u0098ÁW¤\u0082ð%mÈ\u008c".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 108;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -9009) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 203;
            case 1 -> 230;
            case 2 -> 58;
            case 3 -> 166;
            case 4 -> 109;
            case 5 -> 172;
            case 6 -> 116;
            case 7 -> 198;
            case 8 -> 191;
            case 9 -> 141;
            case 10 -> 208;
            case 11 -> 114;
            case 12 -> 61;
            case 13 -> 57;
            case 14 -> 73;
            case 15 -> 100;
            case 16 -> 189;
            case 17 -> 247;
            case 18 -> 99;
            case 19 -> 32;
            case 20 -> 33;
            case 21 -> 237;
            case 22 -> 93;
            case 23 -> 250;
            case 24 -> 194;
            case 25 -> 59;
            case 26 -> 218;
            case 27 -> 180;
            case 28 -> 181;
            case 29 -> 76;
            case 30 -> 131;
            case 31 -> 49;
            case 32 -> 205;
            case 33 -> 164;
            case 34 -> 129;
            case 35 -> 235;
            case 36 -> 22;
            case 37 -> 173;
            case 38 -> 25;
            case 39 -> 84;
            case 40 -> 249;
            case 41 -> 30;
            case 42 -> 182;
            case 43 -> 188;
            case 44 -> 234;
            case 45 -> 81;
            case 46 -> 211;
            case 47 -> 9;
            case 48 -> 161;
            case 49 -> 119;
            case 50 -> 176;
            case 51 -> 65;
            case 52 -> 163;
            case 53 -> 85;
            case 54 -> 4;
            case 55 -> 143;
            case 56 -> 132;
            case 57 -> 162;
            case 58 -> 201;
            case 59 -> 20;
            case 60 -> 136;
            case 61 -> 67;
            case 62 -> 35;
            case 63 -> 169;
            case 64 -> 79;
            case 65 -> 200;
            case 66 -> 168;
            case 67 -> 206;
            case 68 -> 34;
            case 69 -> 154;
            case 70 -> 54;
            case 71 -> 8;
            case 72 -> 112;
            case 73 -> 243;
            case 74 -> 179;
            case 75 -> 140;
            case 76 -> 115;
            case 77 -> 125;
            case 78 -> 246;
            case 79 -> 209;
            case 80 -> 232;
            case 81 -> 253;
            case 82 -> 128;
            case 83 -> 185;
            case 84 -> 199;
            case 85 -> 126;
            case 86 -> 55;
            case 87 -> 92;
            case 88 -> 151;
            case 89 -> 106;
            case 90 -> 101;
            case 91 -> 134;
            case 92 -> 71;
            case 93 -> 239;
            case 94 -> 248;
            case 95 -> 137;
            case 96 -> 38;
            case 97 -> 196;
            case 98 -> 69;
            case 99 -> 214;
            case 100 -> 244;
            case 101 -> 133;
            case 102 -> 195;
            case 103 -> 77;
            case 104 -> 120;
            case 105 -> 197;
            case 106 -> 74;
            case 107 -> 7;
            case 108 -> 91;
            case 109 -> 47;
            case 110 -> 26;
            case 111 -> 97;
            case 112 -> 238;
            case 113 -> 216;
            case 114 -> 68;
            case 115 -> 83;
            case 116 -> 17;
            case 117 -> 124;
            case 118 -> 2;
            case 119 -> 107;
            case 120 -> 202;
            case 121 -> 210;
            case 122 -> 236;
            case 123 -> 72;
            case 124 -> 113;
            case 125 -> 51;
            case 126 -> 229;
            case 127 -> 183;
            case 128 -> 117;
            case 129 -> 66;
            case 130 -> 144;
            case 131 -> 245;
            case 132 -> 87;
            case 133 -> 37;
            case 134 -> 147;
            case 135 -> 1;
            case 136 -> 221;
            case 137 -> 226;
            case 138 -> 220;
            case 139 -> 190;
            case 140 -> 50;
            case 141 -> 251;
            case 142 -> 174;
            case 143 -> 6;
            case 144 -> 110;
            case 145 -> 70;
            case 146 -> 156;
            case 147 -> 3;
            case 148 -> 13;
            case 149 -> 43;
            case 150 -> 23;
            case 151 -> 212;
            case 152 -> 135;
            case 153 -> 63;
            case 154 -> 157;
            case 155 -> 139;
            case 156 -> 94;
            case 157 -> 31;
            case 158 -> 242;
            case 159 -> 64;
            case 160 -> 223;
            case 161 -> 158;
            case 162 -> 45;
            case 163 -> 149;
            case 164 -> 0;
            case 165 -> 16;
            case 166 -> 192;
            case 167 -> 175;
            case 168 -> 29;
            case 169 -> 75;
            case 170 -> 104;
            case 171 -> 228;
            case 172 -> 152;
            case 173 -> 159;
            case 174 -> 145;
            case 175 -> 90;
            case 176 -> 60;
            case 177 -> 177;
            case 178 -> 222;
            case 179 -> 207;
            case 180 -> 56;
            case 181 -> 146;
            case 182 -> 178;
            case 183 -> 130;
            case 184 -> 150;
            case 185 -> 98;
            case 186 -> 39;
            case 187 -> 121;
            case 188 -> 224;
            case 189 -> 88;
            case 190 -> 102;
            case 191 -> 127;
            case 192 -> 122;
            case 193 -> 19;
            case 194 -> 213;
            case 195 -> 21;
            case 196 -> 28;
            case 197 -> 89;
            case 198 -> 227;
            case 199 -> 82;
            case 200 -> 160;
            case 201 -> 96;
            case 202 -> 62;
            case 203 -> 18;
            case 204 -> 5;
            case 205 -> 165;
            case 206 -> 252;
            case 207 -> 52;
            case 208 -> 241;
            case 209 -> 105;
            case 210 -> 231;
            case 211 -> 46;
            case 212 -> 95;
            case 213 -> 24;
            case 214 -> 42;
            case 215 -> 44;
            case 216 -> 53;
            case 217 -> 233;
            case 218 -> 215;
            case 219 -> 155;
            case 220 -> 103;
            case 221 -> 10;
            case 222 -> 12;
            case 223 -> 219;
            case 224 -> 48;
            case 225 -> 27;
            case 226 -> 142;
            case 227 -> 14;
            case 228 -> 193;
            case 229 -> 186;
            case 230 -> 111;
            case 231 -> 11;
            case 232 -> 78;
            case 233 -> 15;
            case 234 -> 123;
            case 235 -> 118;
            case 236 -> 170;
            case 237 -> 41;
            case 238 -> 40;
            case 239 -> 167;
            case 240 -> 240;
            case 241 -> 138;
            case 242 -> 217;
            case 243 -> 148;
            case 244 -> 171;
            case 245 -> 204;
            case 246 -> 254;
            case 247 -> 255;
            case 248 -> 184;
            case 249 -> 86;
            case 250 -> 108;
            case 251 -> 80;
            case 252 -> 225;
            case 253 -> 36;
            case 254 -> 153;
            default -> 187;
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
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }

   public void a(char p0, int p1) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1);
   }

   public boolean a(int p0, int p1, int p2, int p3, int p4, int p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p0) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0);
   }

   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, float p3, float p4, float p5, float p6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5, p6);
   }

   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }

   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(p0, p1, p2, p3, p4, p5);
   }

   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }

}
