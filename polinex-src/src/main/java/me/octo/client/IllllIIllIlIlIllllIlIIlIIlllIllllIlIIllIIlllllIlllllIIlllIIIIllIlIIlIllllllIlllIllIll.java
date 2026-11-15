package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll
   implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   @NotNull
   private final llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] b;
   private static String[] c;

   public IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll(
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1
   ) {
      short var10001 = 22974;
      short var10002 = 8628;
      Intrinsics.checkNotNullParameter(var1, "resolution");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 8.0F;
   }

   @Override
   public void d() {
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
   }

   @Override
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      @NotNull me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll var5
   ) {
      label21: {
         short var10001 = 22975;
         short var10002 = 31831;
         Intrinsics.checkNotNullParameter(var5, "animation");
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
         int[] var6 = var10000;
         if (var6 == null) {
            if (var4 < 0.0F) {
               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var3 + Math.abs(var4);
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3;
               if (var6 == null) {
                  break label21;
               }
            }

            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var3;
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3;
         }

         if (var6 == null) {
            if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(0.0F);
            }
         }
      }

      this.a();
   }

   private final void a() {
      float var9;
      label19: {
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         float var2 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            / this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = RangesKt.coerceAtMost(
            Math.max(40.0F, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * var2),
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         int[] var1 = var10000;
         float var3 = Math.abs(
            var1 == null && this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null
               ? this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.e()
               : 0.0F
         );
         float var4 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         var9 = var4;
         float var10001 = 0.0F;
         if (var1 == null) {
            if (!(var4 > 0.0F)) {
               var9 = 0.0F;
               break label19;
            }

            var9 = var3;
            var10001 = var4;
         }

         var9 /= var10001;
      }

      float var5 = var9;
      float var6 = RangesKt.coerceAtLeast(
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         0.0F
      );
      float var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl + var6 * var5;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = RangesKt.coerceIn(
         var7,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
      );
   }

   public final boolean a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      Object var19 = null; // PX-FIX
      Object var18 = null; // PX-FIX
      Object var13 = null; // PX-FIX
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      int var10002 = 22973;
      short var10003 = -28209;
      Intrinsics.checkNotNullParameter(var1, "context");
      int[] var5 = var10000;
      float var21;
      int var12 = (
               var21 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
            == 0.0F
         ? 0
         : (var21 < 0.0F ? -1 : 1);
      if (var5 == null) {
         var12 = var12 > 0 ? 1 : 0;
      }

      int var6;
      label74: {
         label78: {
            var6 = var12;
            this.a();
            var13 = this.c(var2, var3);
            if (var5 == null) {
               if ((me.octo.client.PxTruth.truth(var13))) {
                  break label78;
               }

               var13 = var6;
            }

            if (var5 != null) {
               break label74;
            }

            if (!(me.octo.client.PxTruth.truth(var13))) {
               var13 = 1;
               break label74;
            }
         }

         var13 = 0;
      }

      int var7;
      float var8;
      var7 =((Integer)( var13));
      var8 = var6 != 0 ? 1.0F : 0.3F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .v()
            .a(var4 * 0.6F * var8),
         6.0F * var4
      );
      short var10001 = 22972;
      short var16 = 1024;
      var10002 = var7;
      label62:
      if (var5 == null) {
         if (var7 == 0) {
            var10002 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
            if (var5 != null) {
               break label62;
            }

            if (!this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               var10002 = 0;
               break label62;
            }
         }

         var10002 = 1;
      }

      float var9 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "scrollthumb",
         (var10002 != 0),
         0.0F,
         4,
         null
      );
      float var14 = var9;
      float var15 = 0.01F;
      if (var5 == null) {
         if (var9 > 0.01F && var6 != 0) {
            float var10 = var9 * 2.5F;
            int var11 = RangesKt.coerceIn((int)(var9 * 110.0F), 0, 255);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - var10 * 0.5F,
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - var10,
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI + var10,
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + var10 * 2.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(RangesKt.coerceIn((int)(var11 * var4), 0, 255)),
               6.0F * var4 + var10
            );
         }

         var14 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var15 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var20;
      label53: {
         label52: {
            var18 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var19 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            int var10004 = var7;
            if (var5 == null) {
               if (var7 != 0) {
                  break label52;
               }

               var10004 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
            }

            if (var10004 == 0) {
               var20 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .w()
                  .a(var4 * 0.7F * var8);
               break label53;
            }
         }

         var20 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .x()
            .a(var4 * 0.9F * var8);
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var14, var15, var18, var19, var20, 6.0F * var4
      );
      return (var7 != 0);
   }

   public final void a(int var1, int var2, int var3) {
      int[] var4 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var10000 = this;
      if (var4 == null) {
         if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            <= this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         var10000 = this;
      }

      if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
         int var7 = var3;
         if (var4 == null) {
            if (var3 == 0) {
               return;
            }

            var7 = var3;
         }

         if (var4 == null) {
            var7 = var7 > 0 ? 1 : -1;
         }

         int var5 = var7;
         float var6 = var5 * 70.0F;
         me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Intrinsics.checkNotNull(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         this.a(var10001.h() + var6);
      }
   }

   public final void a(int var1, int var2) {
      int[] var3 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var10000 = this;
      if (var3 == null) {
         if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            <= this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }

         var10000 = this;
      }

      if (var3 == null) {
         if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
            return;
         }

         var10000 = this;
      }

      int var7 = ((var10000.c(var1, var2)) ? 1 : 0);
      if (var3 == null) {
         if (var7 != 0) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var2;
            me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            Intrinsics.checkNotNull(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10001.h();
            if (var3 == null) {
               return;
            }
         }

         var7 = ((this.d(var1, var2)) ? 1 : 0);
      }

      if (var3 == null) {
         if (var7 == 0) {
            return;
         }

         var7 = var2;
      }

      float var4 = (var7 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)
         / this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      float var5 = -(
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      float var6 = var5 * var4;
      this.a(var6);
   }

   public final void b(int var1, int var2) {
      IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var7;
      label26: {
         int[] var3 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         int var10000 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
         if (var3 == null) {
            if (!this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               return;
            }

            var7 = this;
            if (var3 != null) {
               break label26;
            }

            float var8;
            var10000 = (
                     var8 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                        - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                  == 0.0F
               ? 0
               : (var8 < 0.0F ? -1 : 1);
         }

         if (var10000 <= 0) {
            return;
         }

         var7 = this;
      }

      if (var7.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
         int var4 = var2 - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         float var5 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            / this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         float var6 = var4 * var5;
         this.a(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - var6);
      }
   }

   public final void b() {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
   }

   private final void a(float var1) {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var3 = -(
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      float var4 = RangesKt.coerceIn(var1, var3, 0.0F);
      int[] var2 = var10000;
      if (var2 == null) {
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4);
         }
      }
   }

   private final boolean c(int var1, int var2) {
      int[] var3 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var4;
      int var10000 = (var4 = var1 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) == 0.0F
         ? 0
         : (var4 < 0.0F ? -1 : 1);
      if (var3 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var5;
         var10000 = (
                  var5 = var1
                     - (
                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     )
               )
               == 0.0F
            ? 0
            : (var5 < 0.0F ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 > 0) {
            return (0 != 0);
         }

         float var6;
         var10000 = (var6 = var2 - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) == 0.0F
            ? 0
            : (var6 < 0.0F ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var7;
         var10000 = (
                  var7 = var2
                     - (
                        this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                           + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                     )
               )
               == 0.0F
            ? 0
            : (var7 < 0.0F ? -1 : 1);
      }

      if (var3 != null) {
         return (var10000 != 0);
      } else {
         return (var10000 <= 0);
      }
   }

   private final boolean d(int var1, int var2) {
      int[] var3 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var4;
      int var10000 = (var4 = var1 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) == 0.0F
         ? 0
         : (var4 < 0.0F ? -1 : 1);
      if (var3 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var5;
         var10000 = (
                  var5 = var1
                     - (
                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     )
               )
               == 0.0F
            ? 0
            : (var5 < 0.0F ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 > 0) {
            return (0 != 0);
         }

         float var6;
         var10000 = (var6 = var2 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) == 0.0F
            ? 0
            : (var6 < 0.0F ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var7;
         var10000 = (
                  var7 = var2
                     - (
                        this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                           + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                     )
               )
               == 0.0F
            ? 0
            : (var7 < 0.0F ? -1 : 1);
      }

      if (var3 != null) {
         return (var10000 != 0);
      } else {
         return (var10000 <= 0);
      }
   }

   @Override
   public void e() {
   }

   @Override
   public void a(char var1, int var2) {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "e$ÿaJ\u0006\u0006óâJ`\u0007ÿp¢}wé\u0089";
      int var4 = "e$ÿaJ\u0006\u0006óâJ`\u0007ÿp¢}wé\u0089".length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 106;
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
                     case 0 -> 121;
                     case 1 -> 36;
                     case 2 -> 52;
                     case 3 -> 38;
                     case 4 -> 68;
                     case 5 -> 39;
                     default -> 117;
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
                     b = var5;
                     c = new String[4];
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

                  var2 = "\u009ddù\u0096\u0092Ø$*\u0085j\tPå+Î\u009c\u0090T\u00044";
                  var4 = "\u009ddù\u0096\u0092Ø$*\u0085j\tPå+Î\u009c\u0090T\u00044".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 57;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 22972) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 78;
            case 1 -> 101;
            case 2 -> 149;
            case 3 -> 8;
            case 4 -> 23;
            case 5 -> 22;
            case 6 -> 173;
            case 7 -> 140;
            case 8 -> 49;
            case 9 -> 237;
            case 10 -> 166;
            case 11 -> 220;
            case 12 -> 207;
            case 13 -> 7;
            case 14 -> 193;
            case 15 -> 200;
            case 16 -> 230;
            case 17 -> 65;
            case 18 -> 222;
            case 19 -> 115;
            case 20 -> 119;
            case 21 -> 189;
            case 22 -> 114;
            case 23 -> 46;
            case 24 -> 155;
            case 25 -> 98;
            case 26 -> 224;
            case 27 -> 118;
            case 28 -> 175;
            case 29 -> 150;
            case 30 -> 57;
            case 31 -> 192;
            case 32 -> 36;
            case 33 -> 240;
            case 34 -> 206;
            case 35 -> 84;
            case 36 -> 86;
            case 37 -> 71;
            case 38 -> 178;
            case 39 -> 76;
            case 40 -> 52;
            case 41 -> 245;
            case 42 -> 67;
            case 43 -> 31;
            case 44 -> 112;
            case 45 -> 21;
            case 46 -> 177;
            case 47 -> 47;
            case 48 -> 227;
            case 49 -> 142;
            case 50 -> 168;
            case 51 -> 171;
            case 52 -> 116;
            case 53 -> 162;
            case 54 -> 17;
            case 55 -> 246;
            case 56 -> 97;
            case 57 -> 204;
            case 58 -> 70;
            case 59 -> 27;
            case 60 -> 151;
            case 61 -> 160;
            case 62 -> 37;
            case 63 -> 159;
            case 64 -> 167;
            case 65 -> 145;
            case 66 -> 248;
            case 67 -> 255;
            case 68 -> 29;
            case 69 -> 80;
            case 70 -> 30;
            case 71 -> 94;
            case 72 -> 186;
            case 73 -> 152;
            case 74 -> 123;
            case 75 -> 53;
            case 76 -> 45;
            case 77 -> 158;
            case 78 -> 214;
            case 79 -> 146;
            case 80 -> 42;
            case 81 -> 179;
            case 82 -> 208;
            case 83 -> 104;
            case 84 -> 135;
            case 85 -> 195;
            case 86 -> 233;
            case 87 -> 199;
            case 88 -> 28;
            case 89 -> 128;
            case 90 -> 190;
            case 91 -> 215;
            case 92 -> 38;
            case 93 -> 191;
            case 94 -> 247;
            case 95 -> 153;
            case 96 -> 134;
            case 97 -> 156;
            case 98 -> 236;
            case 99 -> 219;
            case 100 -> 88;
            case 101 -> 108;
            case 102 -> 48;
            case 103 -> 132;
            case 104 -> 212;
            case 105 -> 127;
            case 106 -> 39;
            case 107 -> 58;
            case 108 -> 202;
            case 109 -> 90;
            case 110 -> 181;
            case 111 -> 16;
            case 112 -> 61;
            case 113 -> 228;
            case 114 -> 243;
            case 115 -> 66;
            case 116 -> 12;
            case 117 -> 77;
            case 118 -> 251;
            case 119 -> 33;
            case 120 -> 73;
            case 121 -> 41;
            case 122 -> 105;
            case 123 -> 139;
            case 124 -> 92;
            case 125 -> 59;
            case 126 -> 137;
            case 127 -> 13;
            case 128 -> 241;
            case 129 -> 170;
            case 130 -> 182;
            case 131 -> 63;
            case 132 -> 75;
            case 133 -> 72;
            case 134 -> 209;
            case 135 -> 174;
            case 136 -> 32;
            case 137 -> 157;
            case 138 -> 121;
            case 139 -> 74;
            case 140 -> 3;
            case 141 -> 60;
            case 142 -> 82;
            case 143 -> 223;
            case 144 -> 40;
            case 145 -> 55;
            case 146 -> 120;
            case 147 -> 180;
            case 148 -> 211;
            case 149 -> 203;
            case 150 -> 125;
            case 151 -> 34;
            case 152 -> 242;
            case 153 -> 62;
            case 154 -> 83;
            case 155 -> 122;
            case 156 -> 87;
            case 157 -> 161;
            case 158 -> 188;
            case 159 -> 111;
            case 160 -> 11;
            case 161 -> 10;
            case 162 -> 201;
            case 163 -> 93;
            case 164 -> 99;
            case 165 -> 100;
            case 166 -> 197;
            case 167 -> 244;
            case 168 -> 144;
            case 169 -> 20;
            case 170 -> 138;
            case 171 -> 85;
            case 172 -> 218;
            case 173 -> 44;
            case 174 -> 81;
            case 175 -> 213;
            case 176 -> 96;
            case 177 -> 4;
            case 178 -> 35;
            case 179 -> 51;
            case 180 -> 110;
            case 181 -> 154;
            case 182 -> 198;
            case 183 -> 164;
            case 184 -> 231;
            case 185 -> 68;
            case 186 -> 176;
            case 187 -> 19;
            case 188 -> 1;
            case 189 -> 165;
            case 190 -> 6;
            case 191 -> 169;
            case 192 -> 249;
            case 193 -> 133;
            case 194 -> 239;
            case 195 -> 43;
            case 196 -> 69;
            case 197 -> 136;
            case 198 -> 184;
            case 199 -> 183;
            case 200 -> 117;
            case 201 -> 56;
            case 202 -> 126;
            case 203 -> 54;
            case 204 -> 229;
            case 205 -> 106;
            case 206 -> 89;
            case 207 -> 148;
            case 208 -> 113;
            case 209 -> 147;
            case 210 -> 9;
            case 211 -> 141;
            case 212 -> 91;
            case 213 -> 205;
            case 214 -> 143;
            case 215 -> 25;
            case 216 -> 226;
            case 217 -> 2;
            case 218 -> 217;
            case 219 -> 235;
            case 220 -> 196;
            case 221 -> 5;
            case 222 -> 14;
            case 223 -> 185;
            case 224 -> 109;
            case 225 -> 102;
            case 226 -> 225;
            case 227 -> 103;
            case 228 -> 163;
            case 229 -> 250;
            case 230 -> 238;
            case 231 -> 172;
            case 232 -> 210;
            case 233 -> 95;
            case 234 -> 253;
            case 235 -> 232;
            case 236 -> 64;
            case 237 -> 124;
            case 238 -> 50;
            case 239 -> 187;
            case 240 -> 79;
            case 241 -> 254;
            case 242 -> 194;
            case 243 -> 216;
            case 244 -> 234;
            case 245 -> 18;
            case 246 -> 252;
            case 247 -> 107;
            case 248 -> 130;
            case 249 -> 129;
            case 250 -> 24;
            case 251 -> 221;
            case 252 -> 26;
            case 253 -> 15;
            case 254 -> 0;
            default -> 131;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }
}
