package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class lIIIllllIlIlllllIlllIlllIlllllIllllIIIIllIllIIlIllIlIIllllIIIllIIIIIIIIIllIllIIIIlIII
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] d;
   private static String[] e;

   public lIIIllllIlIlllllIlllIlllIlllllIllllIIIIllIllIIlIllIlIIllllIIIllIIIIIIIIIllIllIIIIlIII(
      @NotNull llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var1
   ) {
      short var10001 = 26105;
      short var10002 = 27710;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 150.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = Integer.MIN_VALUE;
   }

   private final String f() {
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10001 = 26110;
      short var10002 = 2124;
      return "slider:" + var10000;
   }

   private final String g() {
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10001 = 26106;
      short var10002 = 13296;
      return "sliderrip:" + var10000;
   }

   private final String h() {
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10001 = 26108;
      short var10002 = 23953;
      return "sliderpress:" + var10000;
   }

   private final String i() {
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10001 = 26111;
      short var10002 = -5352;
      return "sliderpulse:" + var10000;
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
      String var55;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var48;
      Object var47 = null; // PX-FIX
      Object var45 = null; // PX-FIX
      String[] var6;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var7;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var44;
      label195: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = 26107;
         short var10003 = 28294;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var6 = var10000;
         short var10001 = 26109;
         var10002 = -273;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var43 = var10;
         if (var6 != null) {
            if (!(var10 instanceof IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)) {
               var44 = null;
               break label195;
            }

            var43 = var10;
         }

         var44 = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)var43;
      }

      float var9;
      float var11;
      int var12;
      float var34;
      boolean var8 = (var44 != null ? var44.ai() : null) instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
      var9 = var2.c() + (var8 ? 34.0F : 14.0F);
      var34 = var2.e() - (var8 ? 19.0F : 14.0F);
      var11 = var34 - var9;
      var12 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var34);
      String var13 = String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.M());
      double var14 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var13, false, 2, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var13, var34 - var14, var3 + 9, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(), false, 16, null);
      var45 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      label188:
      if (var6 != null) {
         if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            var45 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var6 == null) {
               break label188;
            }

            if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
               float var16 = var11
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.L(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.M()
                     );
               if (Math.abs(var16 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) > 0.5F) {
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var16;
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
               }
            }
         }

         var45 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      label178:
      if (var6 != null) {
         if (!(me.octo.client.PxTruth.truth(var45))) {
            float var35 = RangesKt.coerceIn(
               (float)(System.currentTimeMillis() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)
                  / this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               0.0F,
               1.0F
            );
            float var17 = var35 * var35 * (3.0F - 2.0F * var35);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               + (
                     this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  )
                  * var17;
            if (var35 >= 1.0F) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
            }
         }

         var45 = var3;
      }

      float var36 = Math.max((float)var3 + 44.0F, (float)var12);
      float var37 = 4.0F;
      float var18 = 6.0F;
      float var19 = var9 + RangesKt.coerceIn(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, 0.0F, var11);
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var4;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var5;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var36;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var11;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var37;
      int var20 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.M();
      int var46 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      int var54 = Integer.MIN_VALUE;
      if (var6 != null) {
         if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl == Integer.MIN_VALUE) {
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var20;
         }

         var46 = var20;
         var54 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      if (var46 != var54) {
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var20;
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            this.i(),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
               .a(140),
            4.0F,
            0L,
            8,
            null
         );
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               this.g(),
               var19,
               var36 + var37 / 2.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(150),
               14.0F,
               280L
            );
      }

      float var21;
      label168: {
         label198: {
            var21 = RangesKt.coerceAtMost(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               var37 / 2.0F
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var9,
               var36,
               var11,
               var37,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .l(),
               var21
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var9,
               var36,
               var11,
               var37,
               0.5F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .m()
                  .a(0.3F),
               var21
            );
            var47 = var4 >= var9 - 4.0F
               && var4 <= var34 + 4.0F
               && var5 >= var36 - 8.0F
               && var5 <= var36 + var37 + 8.0F
               ? 1
               : 0;
         }
      }

      int var22;
      int var58;
      var22 =((Integer)( var47));
      var48 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var55 = this.f();
      var58 = var22;
      label147:
      if (var6 != null) {
         if (var22 == 0) {
            var58 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            if (var6 == null) {
               break label147;
            }

            if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               var58 = 0;
               break label147;
            }
         }

         var58 = 1;
      }

      float var23 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var48, var55, (var58 != 0), 0.0F, 4, null
      );
      float var24 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ? 1.0F : var23;
      float var25 = var19 - var9;
      float var49 = var25;
      float var56 = 0.0F;
      if (var6 != null) {
         if (var25 > 0.0F) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var9,
                  var36,
                  var25,
                  var37,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .n(),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .o(),
                  me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  var21
               );
         }

         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(this.i(), var9, var36, var11, var37, var21);
         var49 = 1.0F + var24 * 0.18F;
         var56 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(this.h())
            * 0.1F;
      }

      label138: {
         label199: {
            float var26 = var49 - var56;
            float var27 = var18 * var26;
            float var28 = RangesKt.coerceAtMost(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               var27
            );
            float var65;
            int var50 = (var65 = var24 - 0.01F) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
            if (var6 != null) {
               if (var50 > 0) {
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(
                        var19,
                        var36 + var37 / 2.0F,
                        var27,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .ah(),
                        var24,
                        8.0F
                     );
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var19 - var27,
                  var36 + var37 / 2.0F - var27,
                  var27 * 2.0F,
                  var27 * 2.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .k(),
                  var28
               );
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.g(), var19, var36 + var37 / 2.0F, var27 * 2.4F);
               if (var6 == null) {
                  break label199;
               }

               var50 = var22;
            }

            if (var50 == 0) {
               break label138;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
         }

         var7 = this;
      }

      int var51 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      if (var6 != null) {
         if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll((int)(var36 + var37 + 10), var7);
         }

         var51 = GLFW.glfwGetMouseButton(
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .handle(),
            0
         );
      }

      label202: {
         if (var6 != null) {
            if (var51 != 1) {
               break label202;
            }

            var51 = var4;
         }

         float var29 = RangesKt.coerceIn(var51, var9, var34);
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var29 - var9;
         float var30 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var11;
         float var31 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()
            + (
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.L()
                     - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()
               )
               * var30;
         int var32 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.N();
         int var52 = var32;
         if (var6 != null) {
            var52 = var32 > 0
               ? this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()
                  + (int)((float)Math.rint((var31 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()) / var32))
                     * var32
               : (int)var31;
         }

         int var33 = var52;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g(
               RangesKt.coerceIn(
                  var33,
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.L()
               )
            );
         if (var6 != null) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll((int)(var36 + var37 + 10), var7);
         }
      }

      float var38 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var11;
      float var39 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()
         + (
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.L()
                  - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()
            )
            * var38;
      int var40 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.N();
      int var53 = var40;
      if (var6 != null) {
         var53 = var40 > 0
            ? this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()
               + (int)((float)Math.rint((var39 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()) / var40))
                  * var40
            : (int)var39;
      }

      int var41 = var53;
      int var42 = RangesKt.coerceIn(
         var41,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K(),
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.L()
      );
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g(var42);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var11
         * (
            (float)(var42 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K())
               / (
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.L()
                     - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()
               )
         );
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll((int)(var36 + var37 + 10), var7);
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label37: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = 26104;
         short var10003 = -15116;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         var2 = var10000;
         llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var5 = var4;
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
      String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
      float var2 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         + RangesKt.coerceIn(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            0.0F,
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         );
      String[] var1 = var10000;
      float var3 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         + this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll / 2.0F;
      float var6 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var1 != null) {
         var6 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII > 0.0F
            ? this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            : var2;
      }

      float var4 = var6;
      float var7 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (var1 != null) {
         var7 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI > 0.0F
            ? this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            : var3;
      }

      float var5 = var7;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         this.g(),
         var4,
         var5,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(160),
         24.0F,
         0L);
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.h());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "1éê5Mø6\f\u0085L|\u0081\u009fn&[j{Dy\fí½q¿>©\u0012¤åc\u008bz\nøÝè\u0090]!RIc»\nJ\u0099\u0085; 9Ã\u00ad\u0088s\u000bçêÍ\u009b\u0086Aù\u0001E\u001a\u0098";
      int var4 = "1éê5Mø6\f\u0085L|\u0081\u009fn&[j{Dy\fí½q¿>©\u0012¤åc\u008bz\nøÝè\u0090]!RIc»\nJ\u0099\u0085; 9Ã\u00ad\u0088s\u000bçêÍ\u009b\u0086Aù\u0001E\u001a\u0098"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 63;
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
                     case 0 -> 96;
                     case 1 -> 99;
                     case 2 -> 108;
                     case 3 -> 57;
                     case 4 -> 100;
                     case 5 -> 59;
                     default -> 56;
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
                     e = new String[8];
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

                  var2 = "\u001a~»ë8AñJ\u0018Ô\u0007à\u0087ÂÏõ¦þ";
                  var4 = "\u001a~»ë8AñJ\u0018Ô\u0007à\u0087ÂÏõ¦þ".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 92;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 26110) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 85;
            case 1 -> 42;
            case 2 -> 99;
            case 3 -> 94;
            case 4 -> 188;
            case 5 -> 172;
            case 6 -> 126;
            case 7 -> 185;
            case 8 -> 9;
            case 9 -> 68;
            case 10 -> 81;
            case 11 -> 100;
            case 12 -> 15;
            case 13 -> 64;
            case 14 -> 224;
            case 15 -> 3;
            case 16 -> 247;
            case 17 -> 240;
            case 18 -> 83;
            case 19 -> 205;
            case 20 -> 48;
            case 21 -> 138;
            case 22 -> 193;
            case 23 -> 29;
            case 24 -> 238;
            case 25 -> 129;
            case 26 -> 4;
            case 27 -> 152;
            case 28 -> 168;
            case 29 -> 86;
            case 30 -> 46;
            case 31 -> 218;
            case 32 -> 179;
            case 33 -> 177;
            case 34 -> 162;
            case 35 -> 56;
            case 36 -> 118;
            case 37 -> 71;
            case 38 -> 160;
            case 39 -> 234;
            case 40 -> 123;
            case 41 -> 157;
            case 42 -> 206;
            case 43 -> 96;
            case 44 -> 102;
            case 45 -> 37;
            case 46 -> 40;
            case 47 -> 223;
            case 48 -> 28;
            case 49 -> 222;
            case 50 -> 197;
            case 51 -> 215;
            case 52 -> 39;
            case 53 -> 241;
            case 54 -> 147;
            case 55 -> 76;
            case 56 -> 156;
            case 57 -> 32;
            case 58 -> 105;
            case 59 -> 125;
            case 60 -> 82;
            case 61 -> 90;
            case 62 -> 59;
            case 63 -> 110;
            case 64 -> 20;
            case 65 -> 252;
            case 66 -> 57;
            case 67 -> 114;
            case 68 -> 163;
            case 69 -> 148;
            case 70 -> 109;
            case 71 -> 164;
            case 72 -> 210;
            case 73 -> 16;
            case 74 -> 171;
            case 75 -> 212;
            case 76 -> 8;
            case 77 -> 183;
            case 78 -> 67;
            case 79 -> 134;
            case 80 -> 17;
            case 81 -> 245;
            case 82 -> 51;
            case 83 -> 213;
            case 84 -> 158;
            case 85 -> 1;
            case 86 -> 124;
            case 87 -> 69;
            case 88 -> 211;
            case 89 -> 235;
            case 90 -> 23;
            case 91 -> 217;
            case 92 -> 19;
            case 93 -> 198;
            case 94 -> 93;
            case 95 -> 204;
            case 96 -> 92;
            case 97 -> 135;
            case 98 -> 173;
            case 99 -> 195;
            case 100 -> 104;
            case 101 -> 136;
            case 102 -> 199;
            case 103 -> 186;
            case 104 -> 236;
            case 105 -> 149;
            case 106 -> 53;
            case 107 -> 255;
            case 108 -> 161;
            case 109 -> 144;
            case 110 -> 47;
            case 111 -> 108;
            case 112 -> 140;
            case 113 -> 209;
            case 114 -> 251;
            case 115 -> 155;
            case 116 -> 221;
            case 117 -> 74;
            case 118 -> 18;
            case 119 -> 242;
            case 120 -> 27;
            case 121 -> 227;
            case 122 -> 128;
            case 123 -> 194;
            case 124 -> 13;
            case 125 -> 106;
            case 126 -> 145;
            case 127 -> 150;
            case 128 -> 122;
            case 129 -> 84;
            case 130 -> 190;
            case 131 -> 249;
            case 132 -> 38;
            case 133 -> 107;
            case 134 -> 70;
            case 135 -> 187;
            case 136 -> 34;
            case 137 -> 180;
            case 138 -> 5;
            case 139 -> 230;
            case 140 -> 87;
            case 141 -> 103;
            case 142 -> 142;
            case 143 -> 237;
            case 144 -> 11;
            case 145 -> 95;
            case 146 -> 244;
            case 147 -> 174;
            case 148 -> 253;
            case 149 -> 250;
            case 150 -> 201;
            case 151 -> 176;
            case 152 -> 60;
            case 153 -> 117;
            case 154 -> 130;
            case 155 -> 10;
            case 156 -> 24;
            case 157 -> 89;
            case 158 -> 78;
            case 159 -> 91;
            case 160 -> 243;
            case 161 -> 232;
            case 162 -> 189;
            case 163 -> 62;
            case 164 -> 127;
            case 165 -> 72;
            case 166 -> 61;
            case 167 -> 26;
            case 168 -> 80;
            case 169 -> 248;
            case 170 -> 219;
            case 171 -> 30;
            case 172 -> 25;
            case 173 -> 181;
            case 174 -> 233;
            case 175 -> 54;
            case 176 -> 49;
            case 177 -> 239;
            case 178 -> 208;
            case 179 -> 21;
            case 180 -> 220;
            case 181 -> 246;
            case 182 -> 2;
            case 183 -> 116;
            case 184 -> 170;
            case 185 -> 192;
            case 186 -> 63;
            case 187 -> 55;
            case 188 -> 66;
            case 189 -> 75;
            case 190 -> 153;
            case 191 -> 101;
            case 192 -> 36;
            case 193 -> 97;
            case 194 -> 113;
            case 195 -> 203;
            case 196 -> 178;
            case 197 -> 58;
            case 198 -> 73;
            case 199 -> 166;
            case 200 -> 254;
            case 201 -> 31;
            case 202 -> 12;
            case 203 -> 137;
            case 204 -> 169;
            case 205 -> 98;
            case 206 -> 112;
            case 207 -> 231;
            case 208 -> 191;
            case 209 -> 44;
            case 210 -> 175;
            case 211 -> 225;
            case 212 -> 115;
            case 213 -> 41;
            case 214 -> 45;
            case 215 -> 154;
            case 216 -> 207;
            case 217 -> 79;
            case 218 -> 111;
            case 219 -> 196;
            case 220 -> 143;
            case 221 -> 121;
            case 222 -> 151;
            case 223 -> 77;
            case 224 -> 214;
            case 225 -> 133;
            case 226 -> 226;
            case 227 -> 182;
            case 228 -> 43;
            case 229 -> 0;
            case 230 -> 88;
            case 231 -> 146;
            case 232 -> 184;
            case 233 -> 167;
            case 234 -> 33;
            case 235 -> 65;
            case 236 -> 35;
            case 237 -> 131;
            case 238 -> 120;
            case 239 -> 165;
            case 240 -> 119;
            case 241 -> 229;
            case 242 -> 7;
            case 243 -> 52;
            case 244 -> 228;
            case 245 -> 200;
            case 246 -> 50;
            case 247 -> 216;
            case 248 -> 22;
            case 249 -> 159;
            case 250 -> 202;
            case 251 -> 14;
            case 252 -> 132;
            case 253 -> 139;
            case 254 -> 141;
            default -> 6;
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
   // --- Phase A L3: descriptor-exact synthetics restored from .analysis/me-octo-only.jar bytecode (javap -c -s, agent W9-1) ---
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public void a(char var1, int var2) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
   }
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
   }
   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
}
