package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] d;
   private static String[] e;

   public IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI(
      @NotNull lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI var1
   ) {
      short var10001 = -1531;
      short var10002 = 22885;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 180.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 90.0F;
      this.f();
   }

   private final void f() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b(
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
               )
      );
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b(
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
               )
      );
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
      Object var38 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var30 = null; // PX-FIX
      String[] var6;
      Object var7;
      int var8;
      float var11;
      String var12;
      double var13;
      int var15;
      label204: {
         short var10001 = -1535;
         short var10002 = -3778;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var10001 = -1536;
         var10002 = -20568;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         var8 = var3 + 5;
         String[] var10000 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
         String var9 = String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r());
         var6 = var10000;
         float var10 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var9, false, 2, null);
         var11 = var2.e() - 17.0F - var10 - 6.0F - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         var12 = String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q());
         var13 = var11 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - 8
            - me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var12, false, 2, null);
         var15 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var13 - 10);
         int var29 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         if (var6 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               break label204;
            }

            var29 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var6 != null) {
            if (var29 != 0) {
               break label204;
            }

            var29 = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b(
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()
                     )
            );
         }

         int var17;
         int var16 = var29;
         var17 = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
               * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(),
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(),
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()
                  )
         );
         var30 = this;
         label190:
         if (var6 != null) {
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == var16) {
               var30 = this;
               if (var6 == null) {
                  break label190;
               }

               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == var17) {
                  break label204;
               }
            }

            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var16;
            var30 = this;
         }

         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var17;
      }

      final int var18;
      float var24;
      float var25;
      int var31;
      label181: {
         label205: {
            var24 = var11
               - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var25 = var11
               - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var18 = var15 + var8 >> 1;
            var31 = ((this.b(var1, var4, var5, var11, var18 - 7.0F, var24, var25)) ? 1 : 0);
            if (var6 != null) {
               if (var31 == 0) {
                  break label205;
               }

               float var44;
               var31 = (var44 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label181;
            }

            if (var31 > 0) {
               var31 = 1;
               break label181;
            }
         }

         var31 = 0;
      }

      label206: {
         int var19 = var31;
         var31 = var19;
         if (var6 != null) {
            if (var19 == 0) {
               break label206;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var31 = ((this.a(var4, (int)var24, (int)var25)) ? 1 : 0);
         }

         label207: {
            label163:
            if (var6 != null) {
               if (var31 != 0) {
                  var31 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
                  if (var6 == null) {
                     break label163;
                  }

                  if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                     var7 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                        private static String b;

                        @Override
                        public void e() {
                           IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI.this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
                           IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI.this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
                           me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                              me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              b
                                 + IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .Z(),
                              var4,
                              var18 - 7.0F,
                              IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .ah()
                                 .a(160),
                              28.0F,
                              0L);
                        }

                        @Override
                        public void a(char var1, int var2x) {
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static {
                           pxClinit: {
                           char[] var10003 = "\"#\r_Ez2/!Z".toCharArray();
                           int var10004 = var10003.length;
                           int var0 = 0;
                           byte var6x = 115;
                           char[] var10002x = var10003;
                           int var1x = var10004;
                           byte var10x;
                           char[] var10005;
                           int var10006;
                           if (var10004 <= 1) {
                              var10005 = var10003;
                              var10x = 115;
                              var10006 = var0;
                           } else {
                              var6x = 115;
                              var1x = var10004;
                              if (var10004 <= var0) {
                                 String var9x = new String(var10003).intern();
                                 byte var4x = -1;
                                 b = var9x;
                                 break pxClinit;
                              }

                              var10005 = var10003;
                              var10x = 115;
                              var10006 = var0;
                           }

                           while (true) {
                              var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                                 case 0 -> 53;
                                 case 1 -> 34;
                                 case 2 -> 19;
                                 case 3 -> 65;
                                 case 4 -> 95;
                                 case 5 -> 103;
                                 default -> 51;
                              });
                              var0++;
                              if (var6x == 0) {
                                 var10006 = var6x;
                                 var10005 = var10002x;
                                 var10x = var6x;
                              } else {
                                 if (var1x <= var0) {
                                    String var8x = new String(var10002x).intern();
                                    byte var3x = -1;
                                    b = var8x;
                                    break pxClinit;
                                 }

                                 var10005 = var10002x;
                                 var10x = var6x;
                                 var10006 = var0;
                              }
                           }
                           }
                        }
                     };
                     break label206;
                  }
               }

               var33 = this;
               if (var6 == null) {
                  break label207;
               }

               var31 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            }

            if (var31 != 0) {
               break label206;
            }

            var33 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
               private static String b;

               @Override
               public void e() {
                  IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI.this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
                  IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI.this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = System.currentTimeMillis();
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     b
                        + IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .Z(),
                     var4,
                     var18 - 7.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(160),
                     28.0F,
                     0L);
               }

               @Override
               public void a(char var1, int var2) {
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  char[] var10003 = "ApPG\t=lLr\u0007".toCharArray();
                  int var10004 = var10003.length;
                  int var0 = 0;
                  byte var6 = 15;
                  char[] var10002 = var10003;
                  int var1 = var10004;
                  byte var10;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10 = 15;
                     var10006 = var0;
                  } else {
                     var6 = 15;
                     var1 = var10004;
                     if (var10004 <= var0) {
                        String var9 = new String(var10003).intern();
                        byte var4x = -1;
                        b = var9;
                        break pxClinit;
                     }

                     var10005 = var10003;
                     var10 = 15;
                     var10006 = var0;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                        case 0 -> 42;
                        case 1 -> 13;
                        case 2 -> 50;
                        case 3 -> 37;
                        case 4 -> 103;
                        case 5 -> 74;
                        default -> 17;
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

         var7 = var33;
      }

      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
         var12,
         (int)var13,
         var18 - 7,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
         String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()),
         (int)(var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 6),
         var18 - 7,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
         .a(
            String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s()),
            (int)var24,
            var18 + 8,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
         .a(
            String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t()),
            (int)var25,
            var18 - 26,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      int var20 = (int)(
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u()
            / (
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r()
                  - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q()
            )
      );
      var31 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      if (var6 != null) {
         label125:
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            label210: {
               float var41;
               label211: {
                  var31 = GLFW.glfwGetMouseButton(
                     me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .getWindow()
                        .handle(),
                     0
                  );
                  if (var6 != null) {
                     if (var31 != 1) {
                        break label210;
                     }

                     var36 = var5;
                     var41 = var2.d() + 5;
                     if (var6 == null) {
                        break label211;
                     }

                     float var45;
                     var31 = (var45 = ((Float)var36) - var41) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
                  }

                  if (var31 <= 0) {
                     break label210;
                  }

                  var36 = var11;
                  var41 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               }

               float var21 = ((Float)var36) - var41;
               float var22 = var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               int var23 = var4;
               float var46;
               var31 = (var46 = var4 - var21) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
               if (var6 != null) {
                  if (var31 < 0) {
                     var23 = (int)var21;
                  }

                  float var47;
                  var31 = (var47 = var23 - var22) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
               }

               if (var6 != null) {
                  if (var31 > 0) {
                     var23 = (int)var22;
                  }

                  float var48;
                  var31 = (var48 = var23 - (var25 - var20)) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
               }

               label130: {
                  if (var6 != null) {
                     if (var31 <= 0) {
                        break label130;
                     }

                     var31 = (int)(var25 - var20);
                  }

                  var23 = var31;
               }

               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (int)(
                  var23 - var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               );
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((int)var21, (int)var22, var23);
               if (var6 != null) {
                  break label125;
               }
            }

            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
         }

         var31 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
      }

      if (var6 != null) {
         if (var31 == 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var15 + 5, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
            );
         }

         var31 = GLFW.glfwGetMouseButton(
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .handle(),
            0
         );
      }

      label214: {
         float var42;
         label215: {
            if (var6 != null) {
               if (var31 != 1) {
                  break label214;
               }

               var38 = var5;
               var42 = var2.d() + 5;
               if (var6 == null) {
                  break label215;
               }

               float var49;
               var31 = (var49 = ((Float)var38) - var42) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
            }

            if (var31 <= 0) {
               break label214;
            }

            var38 = var11;
            var42 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         }

         float var26 = ((Float)var38) - var42;
         float var27 = var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         int var28 = var4;
         float var50;
         var31 = (var50 = var4 - var26) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (var31 < 0) {
               var28 = (int)var26;
            }

            float var51;
            var31 = (var51 = var28 - var27) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            if (var31 > 0) {
               var28 = (int)var27;
            }

            float var52;
            var31 = (var52 = var28 - (var24 + var20)) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1);
         }

         label100: {
            if (var6 != null) {
               if (var31 >= 0) {
                  break label100;
               }

               var31 = (int)(var24 + var20);
            }

            var28 = var31;
         }

         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)(
            var28 - var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         );
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((int)var26, (int)var27, var28);
         if (var6 != null) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var15 + 5, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
            );
         }
      }

      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var15 + 5, (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var7
      );
   }

   private final boolean b(GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      Object var36 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      String[] var8;
      float var9;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      int var30;
      label183: {
         label186: {
            var9 = var4 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            String[] var10000 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
            float var10 = var4 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            var11 = RangesKt.coerceAtLeast(var9, RangesKt.coerceAtMost(var6, var10));
            var12 = RangesKt.coerceAtLeast(var9, RangesKt.coerceAtMost(var7, var10));
            var13 = 8.0F;
            var14 = 8.0F;
            var15 = RangesKt.coerceAtMost(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               var13 / 2.0F
            );
            var8 = var10000;
            float var47;
            var30 = (var47 = var2 - (var4 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - 5)) == 0.0F
               ? 0
               : (var47 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var30 < 0) {
                  break label186;
               }

               float var48;
               var30 = (var48 = var3 - (var5 - 6)) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var30 < 0) {
                  break label186;
               }

               float var49;
               var30 = (var49 = var2 - (var4 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 5)) == 0.0F
                  ? 0
                  : (var49 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var30 >= 0) {
                  break label186;
               }

               float var50;
               var30 = (var50 = var3 - (var5 + var13 + 12)) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label183;
            }

            if (var30 < 0) {
               var30 = 1;
               break label183;
            }
         }

         var30 = 0;
      }

      int var16;
      label162: {
         label187: {
            var16 = var30;
            var30 = var16;
            if (var8 != null) {
               if (var16 == 0) {
                  break label187;
               }

               var30 = ((this.a(var2, (int)var6, (int)var7)) ? 1 : 0);
            }

            if (var8 == null) {
               break label162;
            }

            if (var30 != 0) {
               var30 = 1;
               break label162;
            }
         }

         var30 = 0;
      }

      int var17;
      label151: {
         label188: {
            var17 = var30;
            var30 = var16;
            if (var8 != null) {
               if (var16 == 0) {
                  break label188;
               }

               var30 = var17;
            }

            if (var8 == null) {
               break label151;
            }

            if (var30 == 0) {
               var30 = 1;
               break label151;
            }
         }

         var30 = 0;
      }

      int var18;
      label140: {
         var18 = var30;
         var30 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         if (var8 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               long var20 = System.currentTimeMillis() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               float var22 = RangesKt.coerceIn((float)var20 / 150.0F, 0.0F, 1.0F);
               float var23 = var22 * var22 * (3.0F - 2.0F * var22);
               var34 = var14 * (1.0F + var23 * 0.3F);
               break label140;
            }

            var30 = var17;
         }

         var34 = var30 != 0 ? var14 * 1.15F : var14;
      }

      float var19;
      label134: {
         var19 =((Float)( var34));
         var30 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         if (var8 != null) {
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
               long var21 = System.currentTimeMillis() - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               float var29 = RangesKt.coerceIn((float)var21 / 150.0F, 0.0F, 1.0F);
               float var24 = var29 * var29 * (3.0F - 2.0F * var29);
               var36 = var14 * (1.0F + var24 * 0.3F);
               break label134;
            }

            var30 = var18;
         }

         var36 = var30 != 0 ? var14 * 1.15F : var14;
      }

      float var25;
      var25 =((Float)( var36));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var5 + 1.0F,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         var13,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 30),
         var15
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var5,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         var13,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .l(),
         var15
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var5,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         var13,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .m(),
         var15
      );
      label128:
      if (var8 != null) {
         if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            if (var8 == null) {
               break label128;
            }

            if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
               if (var8 == null) {
                  break label128;
               }

               if (var17 == 0) {
                  if (var8 == null) {
                     break label128;
                  }

                  if (var18 == 0) {
                     boolean var38 = false;
                     break label128;
                  }
               }
            }
         }

         boolean var37 = true;
      }

      float var51;
      var30 = (var51 = var12 - var11) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
      if (var8 != null) {
         if (var30 > 0) {
            float var26 = var12 - var11;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  var11,
                  var5,
                  var26,
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
               var26 - 2.0F,
               var13 - 2.0F,
               1.0F,
               new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, 40),
               var15 - 1.0F
            );
         }

         var30 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      }

      label113: {
         label189: {
            if (var8 != null) {
               if (var30 == 0) {
                  var30 = var17;
                  if (var8 == null) {
                     break label113;
                  }

                  if (var17 == 0) {
                     break label189;
                  }
               }

               var30 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            }

            int var27 = RangesKt.coerceIn((int)(var30 != 0 ? 95.0F : 70.0F), 0, 255);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var11,
               var5 + var13 / 2.0F,
               var19 * 1.45F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(var27)
            );
         }

         var30 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
      }

      label190: {
         if (var8 != null) {
            if (var30 == 0) {
               if (var8 == null) {
                  return (var18 != 0);
               }

               if (var18 == 0) {
                  break label190;
               }
            }

            var30 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         int var28 = RangesKt.coerceIn((int)(var30 != 0 ? 95.0F : 70.0F), 0, 255);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var12,
            var5 + var13 / 2.0F,
            var25 * 1.45F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
               .a(var28)
         );
      }

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
            var25,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
         );
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var42 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10002 = -1533;
      short var10003 = -2212;
      var42.a("drmminrip:" + var10001, var11, var5 + var13 / 2.0F, var19 * 2.4F);
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var43 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      var10002 = -1534;
      var10003 = -28203;
      var43.a("drmmaxrip:" + var10001, var12, var5 + var13 / 2.0F, var25 * 2.4F);
      return (var16 != 0);
   }

   private final boolean a(int var1, int var2, int var3) {
      String[] var4 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
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
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "2æ\u0095\u000eæo\u000e\u0018ûÛ[\n\u0014\u0015\u0097\u009dÙ\u001c92N6\nT UÌYo\u008a$á ";
      int var4 = "2æ\u0095\u000eæo\u000e\u0018ûÛ[\n\u0014\u0015\u0097\u009dÙ\u001c92N6\nT UÌYo\u008a$á ".length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 13;
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
                     case 0 -> 76;
                     case 1 -> 83;
                     case 2 -> 127;
                     case 3 -> 95;
                     case 4 -> 25;
                     case 5 -> 31;
                     default -> 24;
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
                     e = new String[5];
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

                  var2 = "£v^óÅkå\u0085ùa\u0007ilë\\A²i";
                  var4 = "£v^óÅkå\u0085ùa\u0007ilë\\A²i".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 26;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1535) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 59;
            case 1 -> 90;
            case 2 -> 33;
            case 3 -> 245;
            case 4 -> 184;
            case 5 -> 196;
            case 6 -> 43;
            case 7 -> 242;
            case 8 -> 85;
            case 9 -> 214;
            case 10 -> 197;
            case 11 -> 154;
            case 12 -> 255;
            case 13 -> 188;
            case 14 -> 178;
            case 15 -> 46;
            case 16 -> 198;
            case 17 -> 15;
            case 18 -> 150;
            case 19 -> 157;
            case 20 -> 221;
            case 21 -> 235;
            case 22 -> 181;
            case 23 -> 176;
            case 24 -> 96;
            case 25 -> 29;
            case 26 -> 161;
            case 27 -> 210;
            case 28 -> 44;
            case 29 -> 77;
            case 30 -> 27;
            case 31 -> 47;
            case 32 -> 236;
            case 33 -> 130;
            case 34 -> 143;
            case 35 -> 190;
            case 36 -> 99;
            case 37 -> 105;
            case 38 -> 205;
            case 39 -> 103;
            case 40 -> 34;
            case 41 -> 23;
            case 42 -> 201;
            case 43 -> 251;
            case 44 -> 10;
            case 45 -> 204;
            case 46 -> 64;
            case 47 -> 162;
            case 48 -> 70;
            case 49 -> 170;
            case 50 -> 174;
            case 51 -> 207;
            case 52 -> 232;
            case 53 -> 32;
            case 54 -> 36;
            case 55 -> 53;
            case 56 -> 81;
            case 57 -> 125;
            case 58 -> 158;
            case 59 -> 239;
            case 60 -> 38;
            case 61 -> 76;
            case 62 -> 177;
            case 63 -> 25;
            case 64 -> 92;
            case 65 -> 156;
            case 66 -> 67;
            case 67 -> 50;
            case 68 -> 69;
            case 69 -> 179;
            case 70 -> 6;
            case 71 -> 117;
            case 72 -> 60;
            case 73 -> 238;
            case 74 -> 135;
            case 75 -> 58;
            case 76 -> 22;
            case 77 -> 19;
            case 78 -> 240;
            case 79 -> 26;
            case 80 -> 219;
            case 81 -> 217;
            case 82 -> 75;
            case 83 -> 79;
            case 84 -> 51;
            case 85 -> 129;
            case 86 -> 165;
            case 87 -> 173;
            case 88 -> 192;
            case 89 -> 139;
            case 90 -> 121;
            case 91 -> 233;
            case 92 -> 141;
            case 93 -> 183;
            case 94 -> 18;
            case 95 -> 108;
            case 96 -> 252;
            case 97 -> 194;
            case 98 -> 123;
            case 99 -> 62;
            case 100 -> 21;
            case 101 -> 199;
            case 102 -> 247;
            case 103 -> 163;
            case 104 -> 5;
            case 105 -> 180;
            case 106 -> 195;
            case 107 -> 151;
            case 108 -> 30;
            case 109 -> 160;
            case 110 -> 83;
            case 111 -> 13;
            case 112 -> 1;
            case 113 -> 54;
            case 114 -> 246;
            case 115 -> 39;
            case 116 -> 11;
            case 117 -> 254;
            case 118 -> 220;
            case 119 -> 185;
            case 120 -> 102;
            case 121 -> 146;
            case 122 -> 107;
            case 123 -> 110;
            case 124 -> 134;
            case 125 -> 124;
            case 126 -> 112;
            case 127 -> 4;
            case 128 -> 114;
            case 129 -> 230;
            case 130 -> 71;
            case 131 -> 8;
            case 132 -> 3;
            case 133 -> 228;
            case 134 -> 73;
            case 135 -> 74;
            case 136 -> 140;
            case 137 -> 171;
            case 138 -> 152;
            case 139 -> 72;
            case 140 -> 35;
            case 141 -> 187;
            case 142 -> 100;
            case 143 -> 224;
            case 144 -> 212;
            case 145 -> 17;
            case 146 -> 229;
            case 147 -> 42;
            case 148 -> 159;
            case 149 -> 227;
            case 150 -> 169;
            case 151 -> 144;
            case 152 -> 16;
            case 153 -> 95;
            case 154 -> 88;
            case 155 -> 109;
            case 156 -> 202;
            case 157 -> 249;
            case 158 -> 31;
            case 159 -> 231;
            case 160 -> 120;
            case 161 -> 241;
            case 162 -> 7;
            case 163 -> 206;
            case 164 -> 94;
            case 165 -> 40;
            case 166 -> 111;
            case 167 -> 2;
            case 168 -> 145;
            case 169 -> 45;
            case 170 -> 106;
            case 171 -> 55;
            case 172 -> 218;
            case 173 -> 182;
            case 174 -> 122;
            case 175 -> 93;
            case 176 -> 126;
            case 177 -> 136;
            case 178 -> 149;
            case 179 -> 193;
            case 180 -> 98;
            case 181 -> 65;
            case 182 -> 142;
            case 183 -> 82;
            case 184 -> 127;
            case 185 -> 63;
            case 186 -> 9;
            case 187 -> 61;
            case 188 -> 213;
            case 189 -> 97;
            case 190 -> 84;
            case 191 -> 225;
            case 192 -> 250;
            case 193 -> 186;
            case 194 -> 66;
            case 195 -> 24;
            case 196 -> 147;
            case 197 -> 200;
            case 198 -> 89;
            case 199 -> 113;
            case 200 -> 191;
            case 201 -> 148;
            case 202 -> 243;
            case 203 -> 101;
            case 204 -> 119;
            case 205 -> 166;
            case 206 -> 211;
            case 207 -> 137;
            case 208 -> 215;
            case 209 -> 208;
            case 210 -> 138;
            case 211 -> 164;
            case 212 -> 91;
            case 213 -> 87;
            case 214 -> 52;
            case 215 -> 209;
            case 216 -> 253;
            case 217 -> 133;
            case 218 -> 0;
            case 219 -> 216;
            case 220 -> 128;
            case 221 -> 153;
            case 222 -> 131;
            case 223 -> 248;
            case 224 -> 48;
            case 225 -> 226;
            case 226 -> 203;
            case 227 -> 168;
            case 228 -> 167;
            case 229 -> 189;
            case 230 -> 78;
            case 231 -> 172;
            case 232 -> 57;
            case 233 -> 116;
            case 234 -> 49;
            case 235 -> 175;
            case 236 -> 12;
            case 237 -> 104;
            case 238 -> 56;
            case 239 -> 80;
            case 240 -> 132;
            case 241 -> 234;
            case 242 -> 155;
            case 243 -> 222;
            case 244 -> 223;
            case 245 -> 68;
            case 246 -> 86;
            case 247 -> 20;
            case 248 -> 237;
            case 249 -> 28;
            case 250 -> 118;
            case 251 -> 37;
            case 252 -> 244;
            case 253 -> 41;
            case 254 -> 14;
            default -> 115;
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
   // --- Phase A SYN2: descriptor-exact synthetics restored from .analysis/me-octo-only.jar bytecode (javap -c -p -s); generator .analysis/agents/SYN2/syn2_gen.py ---
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var0);
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
   public static void a(me.octo.client.IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI var0, boolean var1) {
      var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }
   public static void a(me.octo.client.IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI var0, long var1) {
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }
   public static me.octo.client.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI a(me.octo.client.IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI var0) {
      return var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   public static void b(me.octo.client.IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI var0, boolean var1) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }
   public static void b(me.octo.client.IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI var0, long var1) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }
}
