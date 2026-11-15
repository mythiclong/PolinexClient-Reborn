package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
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
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] d;
   private static String[] e;

   public IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII(
      @NotNull IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var1
   ) {
      short var10001 = -1761;
      short var10002 = 2360;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 205.0F;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 102.5F;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 150.0F;
      this.f();
   }

   private final void f() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
            );
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
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
      float var76 = 0; // PX-FIX
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
      int var10001 = -1764;
      short var10002 = -28785;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      var10002 = -1763;
      short var10003 = -8018;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      var7 = null;
      var6 = var10000;
      var8 = var3 - 4;
      var9 = var2.e() - 185 - 10;
      var10 = String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O());
      var11 = var9 - 125
         - me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var10, false, 2, null);
      var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var11 - 10);
      var61 = ((this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0);
      label205:
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
            float var80;
            var61 = (var80 = var16 - 1.0F) == 0.0F ? 0 : (var80 < 0.0F ? -1 : 1);
            if (var6 == null) {
               break label205;
            }

            if (var61 >= 0) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
            }
         }

         var61 = ((this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) ? 1 : 0);
      }

      label198: {
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
            var76 = 1.0F;
            if (var6 == null) {
               break label198;
            }

            if (var30 >= 1.0F) {
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
            }
         }

         var62 = var9 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         var76 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      float var15;
      float var29;
      int var31;
      label192: {
         label208: {
            var29 = var62 + var76;
            var15 = var9
               - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var31 = var13 + var8 >> 1;
            var61 = ((this.b(var1, var4, var5, var9, var31 - 7.0F, var29, var15)) ? 1 : 0);
            if (var6 != null) {
               if (var61 == 0) {
                  break label208;
               }

               float var81;
               var61 = (var81 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var81 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label192;
            }

            if (var61 > 0) {
               var61 = 1;
               break label192;
            }
         }

         var61 = 0;
      }

      label209: {
         int var33 = var61;
         var61 = var33;
         if (var6 != null) {
            if (var33 == 0) {
               break label209;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var61 = ((this.a(var4, (int)var29, (int)var15)) ? 1 : 0);
         }

         label210: {
            label174:
            if (var6 != null) {
               if (var61 != 0) {
                  var61 = ((this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
                  if (var6 == null) {
                     break label174;
                  }

                  if (!this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                     var7 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
                        @Override
                        public void e() {
                           IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII.this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
                           IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII.this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
                           IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII.this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = System.currentTimeMillis();
                        }
                     };
                     break label209;
                  }
               }

               var65 = this;
               if (var6 == null) {
                  break label210;
               }

               var61 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
            }

            if (var61 != 0) {
               break label209;
            }

            var65 = new llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl() {
               @Override
               public void e() {
                  IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII.this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
                  IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII.this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
                  IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII.this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
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
         false, 16, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()),
         (int)(var9 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl + 15),
         var31 - 8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         .a(
            String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()),
            (int)var29,
            var31 + 12,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         .a(
            String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()),
            (int)var15,
            var31 - 30,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      float var18 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S()
         / (
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
               - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
         );
      var61 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
      if (var6 != null) {
         label149:
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            label156: {
               var61 = GLFW.glfwGetMouseButton(
                  me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .getWindow()
                     .handle(),
                  0
               );
               var10001 = 1;
               if (var6 != null) {
                  if (var61 == 1) {
                     float var82;
                     var61 = (var82 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
                     if (var6 == null) {
                        break label156;
                     }

                     if (var61 > 0) {
                        float var19 = var9 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                        float var20 = var9 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                        int var21 = var4;
                        float var83;
                        var61 = (var83 = var4 - var19) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
                        if (var6 != null) {
                           if (var61 < 0) {
                              var21 = (int)var19;
                           }

                           float var84;
                           var61 = (var84 = var21 - var20) == 0.0F ? 0 : (var84 < 0.0F ? -1 : 1);
                        }

                        if (var6 != null) {
                           if (var61 > 0) {
                              var21 = (int)var20;
                           }

                           float var85;
                           var61 = (var85 = var21 - (var15 - var18)) == 0.0F ? 0 : (var85 < 0.0F ? -1 : 1);
                        }

                        if (var6 != null) {
                           if (var61 > 0) {
                              var21 = (int)(var15 - var18);
                           }

                           this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var21 - var19;
                           var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                              - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O();
                        }

                        int var22 = var61;
                        float var23 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                        float var24 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O() + var22 * var23;
                        if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T() > 0) {
                           float var26 = (var24 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
                              / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
                           int var27 = (int)((float)Math.rint(var26));
                           var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                              + var27 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
                        } else {
                           var61 = (int)var24;
                        }

                        int var25 = RangesKt.coerceIn(
                           var61,
                           this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                           this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
                              - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S()
                        );
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h(var25);
                        if (var6 != null) {
                           break label149;
                        }
                     }
                  }

                  var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P();
                  var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O();
               }

               var61 -= var10001;
            }

            int var34 = var61;
            float var37 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            float var40 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O() + var34 * var37;
            int var43 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
            if (var43 > 0) {
               float var49 = (var40 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()) / var43;
               int var54 = (int)((float)Math.rint(var49));
               var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O() + var54 * var43;
            } else {
               var61 = (int)var40;
            }

            int var46 = var61;
            int var50 = RangesKt.coerceIn(
               var46,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
                  - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S()
            );
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h(var50);
            float var55 = (float)(var50 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()) / var34;
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

      label132: {
         var10001 = 1;
         if (var6 != null) {
            if (var61 == 1) {
               float var86;
               var61 = (var86 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var86 < 0.0F ? -1 : 1);
               if (var6 == null) {
                  break label132;
               }

               if (var61 > 0) {
                  float var35 = var9 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                  float var38 = var9 + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                  int var41 = var4;
                  float var87;
                  var61 = (var87 = var4 - var35) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
                  if (var6 != null) {
                     if (var61 < 0) {
                        var41 = (int)var35;
                     }

                     float var88;
                     var61 = (var88 = var41 - var38) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
                  }

                  if (var6 != null) {
                     if (var61 > 0) {
                        var41 = (int)var38;
                     }

                     float var89;
                     var61 = (var89 = var41 - (var29 + var18)) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
                  }

                  if (var6 != null) {
                     if (var61 < 0) {
                        var41 = (int)(var29 + var18);
                     }

                     this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var41 - var35;
                     var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                        - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O();
                  }

                  int var44 = var61;
                  float var47 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                  float var51 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O() + var44 * var47;
                  if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T() > 0) {
                     float var59 = (var51 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O())
                        / this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
                     int var60 = (int)((float)Math.rint(var59));
                     var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
                        + var60 * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
                  } else {
                     var61 = (int)var51;
                  }

                  int var56 = RangesKt.coerceIn(
                     var61,
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
                        + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S(),
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                  );
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i(var56);
                  if (var6 != null) {
                     return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
                        var13 + 5, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
                     );
                  }
               }
            }

            var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P();
            var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O();
         }

         var61 -= var10001;
      }

      int var36 = var61;
      float var39 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      float var42 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O() + var36 * var39;
      int var45 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.T();
      if (var45 > 0) {
         float var52 = (var42 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()) / var45;
         int var57 = (int)((float)Math.rint(var52));
         var61 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O() + var57 * var45;
      } else {
         var61 = (int)var42;
      }

      int var48 = var61;
      int var53 = RangesKt.coerceIn(
         var48,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S(),
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
      );
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i(var53);
      float var58 = (float)(var53 - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()) / var36;
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
            int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
            var11 = RangesKt.coerceAtLeast(var9, RangesKt.coerceAtMost(var6, var10));
            var12 = RangesKt.coerceAtLeast(var9, RangesKt.coerceAtMost(var7, var10));
            var13 = 10.0F;
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
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "cïjOi¼?éö^\u000bò\u00ad\u009eê\u0088\tÓ\u001b8¨®\u0007&\u008aäøZ)ï";
      int var4 = "cïjOi¼?éö^\u000bò\u00ad\u009eê\u0088\tÓ\u001b8¨®\u0007&\u008aäøZ)ï".length();
      char var1 = '\n';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 18;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 18;
               var10006 = var6;
            } else {
               var13 = 18;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 18;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 90;
                  case 1 -> 19;
                  case 2 -> 82;
                  case 3 -> 38;
                  case 4 -> 79;
                  case 5 -> 54;
                  default -> 62;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            d = var5;
            e = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1763) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 97;
            case 1 -> 166;
            case 2 -> 133;
            case 3 -> 84;
            case 4 -> 172;
            case 5 -> 121;
            case 6 -> 82;
            case 7 -> 99;
            case 8 -> 42;
            case 9 -> 247;
            case 10 -> 49;
            case 11 -> 145;
            case 12 -> 10;
            case 13 -> 236;
            case 14 -> 25;
            case 15 -> 229;
            case 16 -> 207;
            case 17 -> 168;
            case 18 -> 0;
            case 19 -> 169;
            case 20 -> 117;
            case 21 -> 58;
            case 22 -> 6;
            case 23 -> 184;
            case 24 -> 154;
            case 25 -> 26;
            case 26 -> 14;
            case 27 -> 7;
            case 28 -> 32;
            case 29 -> 194;
            case 30 -> 62;
            case 31 -> 2;
            case 32 -> 134;
            case 33 -> 61;
            case 34 -> 228;
            case 35 -> 178;
            case 36 -> 80;
            case 37 -> 115;
            case 38 -> 86;
            case 39 -> 123;
            case 40 -> 47;
            case 41 -> 143;
            case 42 -> 242;
            case 43 -> 85;
            case 44 -> 201;
            case 45 -> 215;
            case 46 -> 226;
            case 47 -> 68;
            case 48 -> 119;
            case 49 -> 24;
            case 50 -> 120;
            case 51 -> 192;
            case 52 -> 111;
            case 53 -> 218;
            case 54 -> 197;
            case 55 -> 191;
            case 56 -> 28;
            case 57 -> 225;
            case 58 -> 36;
            case 59 -> 88;
            case 60 -> 231;
            case 61 -> 75;
            case 62 -> 149;
            case 63 -> 55;
            case 64 -> 243;
            case 65 -> 142;
            case 66 -> 155;
            case 67 -> 140;
            case 68 -> 167;
            case 69 -> 4;
            case 70 -> 29;
            case 71 -> 89;
            case 72 -> 101;
            case 73 -> 33;
            case 74 -> 235;
            case 75 -> 93;
            case 76 -> 16;
            case 77 -> 238;
            case 78 -> 230;
            case 79 -> 214;
            case 80 -> 12;
            case 81 -> 183;
            case 82 -> 219;
            case 83 -> 251;
            case 84 -> 203;
            case 85 -> 158;
            case 86 -> 138;
            case 87 -> 212;
            case 88 -> 46;
            case 89 -> 187;
            case 90 -> 190;
            case 91 -> 209;
            case 92 -> 211;
            case 93 -> 79;
            case 94 -> 132;
            case 95 -> 60;
            case 96 -> 153;
            case 97 -> 202;
            case 98 -> 94;
            case 99 -> 171;
            case 100 -> 41;
            case 101 -> 30;
            case 102 -> 9;
            case 103 -> 23;
            case 104 -> 3;
            case 105 -> 156;
            case 106 -> 110;
            case 107 -> 135;
            case 108 -> 54;
            case 109 -> 204;
            case 110 -> 27;
            case 111 -> 130;
            case 112 -> 66;
            case 113 -> 22;
            case 114 -> 112;
            case 115 -> 34;
            case 116 -> 241;
            case 117 -> 170;
            case 118 -> 208;
            case 119 -> 217;
            case 120 -> 125;
            case 121 -> 116;
            case 122 -> 15;
            case 123 -> 136;
            case 124 -> 70;
            case 125 -> 71;
            case 126 -> 74;
            case 127 -> 45;
            case 128 -> 186;
            case 129 -> 106;
            case 130 -> 103;
            case 131 -> 56;
            case 132 -> 63;
            case 133 -> 11;
            case 134 -> 246;
            case 135 -> 64;
            case 136 -> 127;
            case 137 -> 53;
            case 138 -> 105;
            case 139 -> 35;
            case 140 -> 233;
            case 141 -> 237;
            case 142 -> 18;
            case 143 -> 31;
            case 144 -> 195;
            case 145 -> 81;
            case 146 -> 92;
            case 147 -> 144;
            case 148 -> 108;
            case 149 -> 126;
            case 150 -> 199;
            case 151 -> 44;
            case 152 -> 113;
            case 153 -> 174;
            case 154 -> 109;
            case 155 -> 162;
            case 156 -> 48;
            case 157 -> 128;
            case 158 -> 157;
            case 159 -> 39;
            case 160 -> 175;
            case 161 -> 232;
            case 162 -> 200;
            case 163 -> 176;
            case 164 -> 255;
            case 165 -> 152;
            case 166 -> 249;
            case 167 -> 67;
            case 168 -> 137;
            case 169 -> 163;
            case 170 -> 5;
            case 171 -> 180;
            case 172 -> 52;
            case 173 -> 19;
            case 174 -> 59;
            case 175 -> 182;
            case 176 -> 221;
            case 177 -> 147;
            case 178 -> 216;
            case 179 -> 164;
            case 180 -> 57;
            case 181 -> 244;
            case 182 -> 141;
            case 183 -> 65;
            case 184 -> 21;
            case 185 -> 38;
            case 186 -> 177;
            case 187 -> 83;
            case 188 -> 107;
            case 189 -> 222;
            case 190 -> 104;
            case 191 -> 98;
            case 192 -> 51;
            case 193 -> 245;
            case 194 -> 40;
            case 195 -> 129;
            case 196 -> 131;
            case 197 -> 148;
            case 198 -> 223;
            case 199 -> 72;
            case 200 -> 193;
            case 201 -> 139;
            case 202 -> 160;
            case 203 -> 151;
            case 204 -> 73;
            case 205 -> 240;
            case 206 -> 1;
            case 207 -> 118;
            case 208 -> 189;
            case 209 -> 100;
            case 210 -> 250;
            case 211 -> 102;
            case 212 -> 213;
            case 213 -> 227;
            case 214 -> 239;
            case 215 -> 8;
            case 216 -> 96;
            case 217 -> 37;
            case 218 -> 150;
            case 219 -> 43;
            case 220 -> 248;
            case 221 -> 196;
            case 222 -> 185;
            case 223 -> 76;
            case 224 -> 69;
            case 225 -> 78;
            case 226 -> 77;
            case 227 -> 17;
            case 228 -> 95;
            case 229 -> 205;
            case 230 -> 253;
            case 231 -> 210;
            case 232 -> 50;
            case 233 -> 188;
            case 234 -> 20;
            case 235 -> 224;
            case 236 -> 159;
            case 237 -> 206;
            case 238 -> 91;
            case 239 -> 234;
            case 240 -> 252;
            case 241 -> 124;
            case 242 -> 220;
            case 243 -> 122;
            case 244 -> 254;
            case 245 -> 179;
            case 246 -> 146;
            case 247 -> 165;
            case 248 -> 198;
            case 249 -> 114;
            case 250 -> 181;
            case 251 -> 87;
            case 252 -> 173;
            case 253 -> 90;
            case 254 -> 161;
            default -> 13;
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

   public static final void a(me.octo.client.IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII var1, boolean var2) {
      var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
   }

   public static final void b(me.octo.client.IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII var1, boolean var2) {
      var1.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var2;
   }

   public static final void a(me.octo.client.IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII var1, long var2) {
      var1.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var2;
   }

   public static final void c(me.octo.client.IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII var1, boolean var2) {
      var1.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
   }

   public static final void d(me.octo.client.IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII var1, boolean var2) {
      var1.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var2;
   }

   public static final void b(me.octo.client.IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII var1, long var2) {
      var1.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
   }
}
