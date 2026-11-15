package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII {
   @NotNull
   private String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] a;
   private static String[] b;

   public IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII(
      @NotNull String var1, @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
   ) {
      int var10001 = 12653;
      short var10002 = -5577;
      Intrinsics.checkNotNullParameter(var1, "buttonText");
      var10001 = (short)12649;
      var10002 = 23786;
      Intrinsics.checkNotNullParameter(var2, "textColor");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      var10001 = System.identityHashCode(this);
      var10002 = 12655;
      short var10003 = 13940;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "rb:" + var10001;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 4.0F;
   }

   public IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII(
      @NotNull String var1,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      int var3,
      kotlin.jvm.internal.DefaultConstructorMarker var4
   ) {
      if ((var3 & 2) != 0) {
         var2 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      this(var1, var2);
   }

   public final void a(
      @NotNull String var1, @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
   ) {
      short var10001 = 12654;
      short var10002 = 31541;
      Intrinsics.checkNotNullParameter(var1, "buttonText");
      var10001 = 12652;
      var10002 = 12048;
      Intrinsics.checkNotNullParameter(var2, "textColor");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   public final void a(@NotNull String var1) {
      short var10001 = 12653;
      short var10002 = -5577;
      Intrinsics.checkNotNullParameter(var1, "buttonText");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final void a(@NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 12649;
      short var10002 = 23786;
      Intrinsics.checkNotNullParameter(var1, "textColor");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final boolean a() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5) {
      short var10001 = 12645;
      short var10002 = -27057;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      this.a(var1, var2, var3, var4, var5, 120.0F, 20.0F, 4);
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7, int var8) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var25 = null; // PX-FIX
      int var9;
      int var23;
      label79: {
         label82: {
            var23 = llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl.aj();
            short var10002 = 12651;
            short var10003 = 29473;
            Intrinsics.checkNotNullParameter(var1, "drawContext");
            var9 = var23;
            float var31;
            var23 = (var31 = var2 - var4) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
            if (var9 != 0) {
               if (var23 < 0) {
                  break label82;
               }

               float var32;
               var23 = (var32 = var3 - (var5 - var7)) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
            }

            if (var9 != 0) {
               if (var23 < 0) {
                  break label82;
               }

               float var33;
               var23 = (var33 = var2 - (var4 + var6)) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
            }

            if (var9 != 0) {
               if (var23 >= 0) {
                  break label82;
               }

               float var34;
               var23 = (var34 = var3 - (var5 + var7)) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
            }

            if (var9 == 0) {
               break label79;
            }

            if (var23 < 0) {
               var23 = 1;
               break label79;
            }
         }

         var23 = 0;
      }

      label58: {
         int var10 = var23;
         if (var9 != 0) {
           if ((var10 != 0) == this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               break label58;
            }

            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (var10 != 0);
         }

         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = System.currentTimeMillis();
      }

      label52: {
         long var11 = System.currentTimeMillis() - this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         float var13 = 100.0F;
         float var14 = RangesKt.coerceAtMost((float)var11 / var13, 1.0F);
         IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII var24 = this;
         if (var9 != 0) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               var25 = this.a(
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .G(),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .H(),
                  var14
               );
               break label52;
            }

            var24 = this;
         }

         var25 = var24.a(
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .H(),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .G(),
            var14
         );
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 = var25;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var4;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var5;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var6;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var7;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var8;
      short var27 = 12644;
      short var29 = -8136;
      float var16 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + ":hover",
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         0.0F,
         4,
         null);
      float var26 = var16;
      if (var9 != 0) {
         if (var16 > 0.01F) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var4,
               var5,
               var6,
               var7,
               (float)var8,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var16 * 0.55F,
               3.0F);
         }

         var26 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, 0.04F);
      }

      float var17 = var26;
      float var18 = var6 * var17;
      float var19 = var7 * var17;
      float var20 = var4 + (var6 - var18) * 0.5F;
      float var21 = var5 + (var7 - var19) * 0.5F;
      float var22 = var8 * var17;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var20, var21, var18, var19, var15, var22);
      if (var9 != 0) {
         if (var16 > 0.01F) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var20,
               var21,
               var18,
               var19,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(RangesKt.coerceIn(var16 * 0.85F, 0.0F, 1.0F)),
               var22
            );
         }

         var27 = 12650;
         var29 = 25234;
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + ":ripple", var20, var21, var18, var19, var22);
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.e(
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var20 + var18 / 2,
            var21 + var19 / 2,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            false, 16, null);
      }

      if (var9 == 0) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
         );
      }
   }

   public final void b() {
      int var1;
      float var7;
      label29: {
         int var10000 = llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl.ak();
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1 = var10000;
         var7 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         float var10001 = 0.0F;
         if (var1 == 0) {
            if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI > 0.0F) {
               var7 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               break label29;
            }

            var7 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            var10001 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI / 2.0F;
         }

         var7 += var10001;
      }

      float var2;
      label23: {
         var2 = var7;
         var7 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         float var10 = 0.0F;
         if (var1 == 0) {
            if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll > 0.0F) {
               var7 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               break label23;
            }

            var7 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            var10 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2.0F;
         }

         var7 += var10;
      }

      float var3 = var7;
      float var4 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               var2,
               var3,
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            )
         + 4.0F;
      short var10002 = 12648;
      short var10003 = 31327;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + ":ripple",
         var2,
         var3,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(160),
         var4,
         0L);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl.b(++var1);
      }
   }

   private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3
   ) {
      int var4 = (int)(var1.a() + (var2.a() - var1.a()) * var3);
      int var5 = (int)(var1.b() + (var2.b() - var1.b()) * var3);
      int var6 = (int)(var1.c() + (var2.c() - var1.c()) * var3);
      int var7 = (int)(var1.d() + (var2.d() - var1.d()) * var3);
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var4, var5, var6, var7);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "\"\n\u0081V'æ\u009dF¹ê\t_[önhàå\u00ad\u0083\u0003R\u000eÓ\nçø9\b0-\u007f?åÅ\t\u0015ø¿\u001aAnÀ|'\u0007Ô\u0013\u0011\u0096\u0094x&\u000bëýkLáÇÖR°W\u0013\u0007¡K¿\u009dA\u0019\u009c";
      int var4 = "\"\n\u0081V'æ\u009dF¹ê\t_[önhàå\u00ad\u0083\u0003R\u000eÓ\nçø9\b0-\u007f?åÅ\t\u0015ø¿\u001aAnÀ|'\u0007Ô\u0013\u0011\u0096\u0094x&\u000bëýkLáÇÖR°W\u0013\u0007¡K¿\u009dA\u0019\u009c"
         .length();
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 88;
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
                     case 0 -> 71;
                     case 1 -> 53;
                     case 2 -> 36;
                     case 3 -> 77;
                     case 4 -> 85;
                     case 5 -> 66;
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
                     a = var5;
                     b = new String[10];
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

                  var2 = "ñÎ(*\u0089\u000bÛË\u0011d'\u0006;ÃêÓ8\b";
                  var4 = "ñÎ(*\u0089\u000bÛË\u0011d'\u0006;ÃêÓ8\b".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 88;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 12653) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 112;
            case 1 -> 92;
            case 2 -> 233;
            case 3 -> 15;
            case 4 -> 23;
            case 5 -> 69;
            case 6 -> 106;
            case 7 -> 173;
            case 8 -> 79;
            case 9 -> 128;
            case 10 -> 108;
            case 11 -> 249;
            case 12 -> 178;
            case 13 -> 35;
            case 14 -> 81;
            case 15 -> 195;
            case 16 -> 240;
            case 17 -> 9;
            case 18 -> 45;
            case 19 -> 219;
            case 20 -> 252;
            case 21 -> 201;
            case 22 -> 80;
            case 23 -> 83;
            case 24 -> 43;
            case 25 -> 143;
            case 26 -> 63;
            case 27 -> 187;
            case 28 -> 205;
            case 29 -> 232;
            case 30 -> 154;
            case 31 -> 84;
            case 32 -> 182;
            case 33 -> 105;
            case 34 -> 0;
            case 35 -> 211;
            case 36 -> 26;
            case 37 -> 172;
            case 38 -> 7;
            case 39 -> 75;
            case 40 -> 188;
            case 41 -> 230;
            case 42 -> 144;
            case 43 -> 20;
            case 44 -> 99;
            case 45 -> 255;
            case 46 -> 103;
            case 47 -> 85;
            case 48 -> 157;
            case 49 -> 89;
            case 50 -> 73;
            case 51 -> 131;
            case 52 -> 1;
            case 53 -> 31;
            case 54 -> 38;
            case 55 -> 18;
            case 56 -> 196;
            case 57 -> 101;
            case 58 -> 231;
            case 59 -> 47;
            case 60 -> 254;
            case 61 -> 216;
            case 62 -> 168;
            case 63 -> 241;
            case 64 -> 220;
            case 65 -> 21;
            case 66 -> 194;
            case 67 -> 242;
            case 68 -> 214;
            case 69 -> 167;
            case 70 -> 193;
            case 71 -> 251;
            case 72 -> 60;
            case 73 -> 198;
            case 74 -> 239;
            case 75 -> 226;
            case 76 -> 39;
            case 77 -> 53;
            case 78 -> 142;
            case 79 -> 59;
            case 80 -> 136;
            case 81 -> 76;
            case 82 -> 209;
            case 83 -> 218;
            case 84 -> 11;
            case 85 -> 50;
            case 86 -> 37;
            case 87 -> 126;
            case 88 -> 247;
            case 89 -> 93;
            case 90 -> 134;
            case 91 -> 33;
            case 92 -> 8;
            case 93 -> 234;
            case 94 -> 169;
            case 95 -> 78;
            case 96 -> 86;
            case 97 -> 210;
            case 98 -> 30;
            case 99 -> 2;
            case 100 -> 98;
            case 101 -> 132;
            case 102 -> 161;
            case 103 -> 159;
            case 104 -> 184;
            case 105 -> 137;
            case 106 -> 123;
            case 107 -> 200;
            case 108 -> 235;
            case 109 -> 156;
            case 110 -> 62;
            case 111 -> 248;
            case 112 -> 34;
            case 113 -> 6;
            case 114 -> 212;
            case 115 -> 5;
            case 116 -> 165;
            case 117 -> 102;
            case 118 -> 28;
            case 119 -> 223;
            case 120 -> 203;
            case 121 -> 64;
            case 122 -> 186;
            case 123 -> 181;
            case 124 -> 48;
            case 125 -> 215;
            case 126 -> 114;
            case 127 -> 36;
            case 128 -> 141;
            case 129 -> 125;
            case 130 -> 65;
            case 131 -> 40;
            case 132 -> 17;
            case 133 -> 225;
            case 134 -> 245;
            case 135 -> 12;
            case 136 -> 243;
            case 137 -> 139;
            case 138 -> 95;
            case 139 -> 4;
            case 140 -> 91;
            case 141 -> 49;
            case 142 -> 58;
            case 143 -> 213;
            case 144 -> 164;
            case 145 -> 217;
            case 146 -> 177;
            case 147 -> 253;
            case 148 -> 109;
            case 149 -> 189;
            case 150 -> 237;
            case 151 -> 29;
            case 152 -> 68;
            case 153 -> 148;
            case 154 -> 183;
            case 155 -> 52;
            case 156 -> 115;
            case 157 -> 236;
            case 158 -> 199;
            case 159 -> 179;
            case 160 -> 104;
            case 161 -> 54;
            case 162 -> 88;
            case 163 -> 57;
            case 164 -> 111;
            case 165 -> 175;
            case 166 -> 222;
            case 167 -> 135;
            case 168 -> 27;
            case 169 -> 191;
            case 170 -> 130;
            case 171 -> 176;
            case 172 -> 94;
            case 173 -> 150;
            case 174 -> 190;
            case 175 -> 133;
            case 176 -> 185;
            case 177 -> 246;
            case 178 -> 250;
            case 179 -> 151;
            case 180 -> 152;
            case 181 -> 107;
            case 182 -> 129;
            case 183 -> 87;
            case 184 -> 25;
            case 185 -> 127;
            case 186 -> 244;
            case 187 -> 153;
            case 188 -> 120;
            case 189 -> 117;
            case 190 -> 14;
            case 191 -> 171;
            case 192 -> 192;
            case 193 -> 122;
            case 194 -> 140;
            case 195 -> 174;
            case 196 -> 13;
            case 197 -> 180;
            case 198 -> 227;
            case 199 -> 41;
            case 200 -> 163;
            case 201 -> 66;
            case 202 -> 67;
            case 203 -> 110;
            case 204 -> 204;
            case 205 -> 71;
            case 206 -> 118;
            case 207 -> 56;
            case 208 -> 42;
            case 209 -> 22;
            case 210 -> 147;
            case 211 -> 44;
            case 212 -> 70;
            case 213 -> 124;
            case 214 -> 100;
            case 215 -> 149;
            case 216 -> 82;
            case 217 -> 162;
            case 218 -> 138;
            case 219 -> 24;
            case 220 -> 72;
            case 221 -> 46;
            case 222 -> 119;
            case 223 -> 74;
            case 224 -> 158;
            case 225 -> 160;
            case 226 -> 10;
            case 227 -> 90;
            case 228 -> 121;
            case 229 -> 55;
            case 230 -> 166;
            case 231 -> 3;
            case 232 -> 16;
            case 233 -> 206;
            case 234 -> 77;
            case 235 -> 51;
            case 236 -> 229;
            case 237 -> 19;
            case 238 -> 197;
            case 239 -> 32;
            case 240 -> 238;
            case 241 -> 96;
            case 242 -> 228;
            case 243 -> 61;
            case 244 -> 145;
            case 245 -> 207;
            case 246 -> 97;
            case 247 -> 221;
            case 248 -> 155;
            case 249 -> 224;
            case 250 -> 170;
            case 251 -> 146;
            case 252 -> 202;
            case 253 -> 116;
            case 254 -> 208;
            default -> 113;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}
