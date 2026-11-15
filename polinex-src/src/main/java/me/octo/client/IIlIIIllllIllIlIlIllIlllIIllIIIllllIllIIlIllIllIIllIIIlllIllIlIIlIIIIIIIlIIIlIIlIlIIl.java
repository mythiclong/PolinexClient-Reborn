package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
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

   public IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl(
      @NotNull IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var1
   ) {
      short var10001 = -26652;
      short var10002 = -25827;
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
               .b(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
               )
      );
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b(
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
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
      Object var37 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var30 = null; // PX-FIX
      String[] var6;
      Object var7;
      int var8;
      float var11;
      String var12;
      double var13;
      int var15;
      label205: {
         short var10001 = -26649;
         short var10002 = -22042;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var10001 = -26656;
         var10002 = 26240;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var7 = null;
         String[] var10000 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
         var8 = var3 + 5;
         String var9 = String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P());
         float var10 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var9, false, 2, null);
         var11 = var2.e() - 17.0F - var10 - 6.0F - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         var12 = String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O());
         var13 = var11 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII - 6
            - me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, var12, false, 2, null);
         var15 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var13 - 10);
         var6 = var10000;
         int var29 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         if (var6 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               break label205;
            }

            var29 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         }

         if (var6 != null) {
            if (var29 != 0) {
               break label205;
            }

            var29 = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b(
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()
                     )
            );
         }

         int var17;
         int var16 = var29;
         var17 = (int)me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
               * me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O(),
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P(),
                     this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()
                  )
         );
         var30 = this;
         label191:
         if (var6 != null) {
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == var16) {
               var30 = this;
               if (var6 == null) {
                  break label191;
               }

               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == var17) {
                  break label205;
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
      label182: {
         label206: {
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
                  break label206;
               }

               float var43;
               var31 = (var43 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label182;
            }

            if (var31 > 0) {
               var31 = 1;
               break label182;
            }
         }

         var31 = 0;
      }

      label207: {
         int var19 = var31;
         var31 = var19;
         if (var6 != null) {
            if (var19 == 0) {
               break label207;
            }

            llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(true);
            var31 = ((this.a(var4, (int)var24, (int)var25)) ? 1 : 0);
         }

         label208: {
            label164:
            if (var6 != null) {
               if (var31 != 0) {
                  var31 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
                  if (var6 == null) {
                     break label164;
                  }

                  if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                     var7 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                        private static String b;

                        @Override
                        public void e() {
                           IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl.this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
                           IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl.this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
                           me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                              me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              b
                                 + IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
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
                           char[] var10003 = "g\u001b\u0002_\u0003YGeL".toCharArray();
                           int var10004 = var10003.length;
                           int var0 = 0;
                           byte var6x = 72;
                           char[] var10002x = var10003;
                           int var1x = var10004;
                           byte var10x;
                           char[] var10005;
                           int var10006;
                           if (var10004 <= 1) {
                              var10005 = var10003;
                              var10x = 72;
                              var10006 = var0;
                           } else {
                              var6x = 72;
                              var1x = var10004;
                              if (var10004 <= var0) {
                                 String var9x = new String(var10003).intern();
                                 byte var4x = -1;
                                 b = var9x;
                                 break pxClinit;
                              }

                              var10005 = var10003;
                              var10x = 72;
                              var10006 = var0;
                           }

                           while (true) {
                              var10005[var10006] = (char)(var10005[var10006] ^ var10x ^ switch (var0 % 7) {
                                 case 0 -> 93;
                                 case 1 -> 62;
                                 case 2 -> 39;
                                 case 3 -> 126;
                                 case 4 -> 37;
                                 case 5 -> 99;
                                 default -> 102;
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
                     break label207;
                  }
               }

               var33 = this;
               if (var6 == null) {
                  break label208;
               }

               var31 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            }

            if (var31 != 0) {
               break label207;
            }

            var33 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
               private static String b;

               @Override
               public void e() {
                  IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl.this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
                  IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl.this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = System.currentTimeMillis();
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                     me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     b
                        + IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
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
                  char[] var10003 = ")_,i$a|+\b".toCharArray();
                  int var10004 = var10003.length;
                  int var0 = 0;
                  byte var6 = 125;
                  char[] var10002 = var10003;
                  int var1 = var10004;
                  byte var10;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10 = 125;
                     var10006 = var0;
                  } else {
                     var6 = 125;
                     var1 = var10004;
                     if (var10004 <= var0) {
                        String var9 = new String(var10003).intern();
                        byte var4x = -1;
                        b = var9;
                        break pxClinit;
                     }

                     var10005 = var10003;
                     var10 = 125;
                     var10006 = var0;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                        case 0 -> 38;
                        case 1 -> 79;
                        case 2 -> 60;
                        case 3 -> 117;
                        case 4 -> 33;
                        case 5 -> 110;
                        default -> 104;
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
         String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()),
         (int)(var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 6),
         var18 - 7,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
         .a(
            String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q()),
            (int)var24,
            var18 + 8,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
         .a(
            String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R()),
            (int)var25,
            var18 - 26,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      int var20 = (int)(
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S()
            / (
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P()
                  - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.O()
            )
      );
      var31 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      if (var6 != null) {
         label123:
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            label211: {
               var31 = GLFW.glfwGetMouseButton(
                  me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .getWindow()
                     .handle(),
                  0
               );
               if (var6 != null) {
                  if (var31 != 1) {
                     break label211;
                  }

                  float var44;
                  var31 = (var44 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
               }

               if (var6 != null) {
                  if (var31 <= 0) {
                     break label211;
                  }

                  var31 = (int)var11 - (int)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               }

               int var21;
               int var22;
               int var23;
               label212: {
                  var21 = var31;
                  var22 = (int)var11 + (int)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                  var23 = var4;
                  var31 = var4;
                  int var40 = var21;
                  if (var6 != null) {
                     if (var4 < var21) {
                        var23 = var21;
                     }

                     var31 = var23;
                     if (var6 == null) {
                        break label212;
                     }

                     var40 = var22;
                  }

                  if (var31 > var40) {
                     var23 = var22;
                  }

                  float var45;
                  var31 = (var45 = var23 - (var25 - var20)) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
               }

               label128: {
                  if (var6 != null) {
                     if (var31 <= 0) {
                        break label128;
                     }

                     var31 = (int)(var25 - var20);
                  }

                  var23 = var31;
               }

               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (int)(
                  var23 - var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               );
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var21, var22, var23);
               if (var6 != null) {
                  break label123;
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

      label215: {
         float var41;
         label216: {
            if (var6 != null) {
               if (var31 != 1) {
                  break label215;
               }

               var37 = var5;
               var41 = var2.d() + 5;
               if (var6 == null) {
                  break label216;
               }

               float var46;
               var31 = (var46 = ((Float)var37) - var41) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
            }

            if (var31 <= 0) {
               break label215;
            }

            var37 = var11;
            var41 = (int)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         }

         float var26 = ((Float)var37) - var41;
         float var27 = var11 + (int)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         int var28 = var4;
         float var47;
         var31 = (var47 = var4 - var26) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
         if (var6 != null) {
            if (var31 < 0) {
               var28 = (int)var26;
            }

            float var48;
            var31 = (var48 = var28 - var27) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
         }

         if (var6 != null) {
            if (var31 > 0) {
               var28 = (int)var27;
            }

            float var49;
            var31 = (var49 = var28 - (var24 + var20)) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
         }

         label98: {
            if (var6 != null) {
               if (var31 >= 0) {
                  break label98;
               }

               var31 = (int)(var24 + var20);
            }

            var28 = var31;
         }

         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)(
            var28 - var11 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         );
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d((int)var26, (int)var27, var28);
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
      short var10002 = -26651;
      short var10003 = 24140;
      var42.a("rmminrip:" + var10001, var11, var5 + var13 / 2.0F, var19 * 2.4F);
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var43 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      var10002 = -26650;
      var10003 = 24842;
      var43.a("rmmaxrip:" + var10001, var12, var5 + var13 / 2.0F, var25 * 2.4F);
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
      String var2 = "[©X§\u0019ëk\t2UM,\u00868qã\u001a\tzØD\u0095±\u0006C$\\";
      int var4 = "[©X§\u0019ëk\t2UM,\u00868qã\u001a\tzØD\u0095±\u0006C$\\".length();
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 6;
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
                     case 0 -> 102;
                     case 1 -> 12;
                     case 2 -> 80;
                     case 3 -> 104;
                     case 4 -> 77;
                     case 5 -> 64;
                     default -> 4;
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

                  var2 = "\u0001¸\n\u008a7Õ1\u001dS\u0082\u0001\nÉ\u009aÕ#³áqß\br";
                  var4 = "\u0001¸\n\u008a7Õ1\u001dS\u0082\u0001\nÉ\u009aÕ#³áqß\br".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 56;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26652) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 139;
            case 1 -> 121;
            case 2 -> 242;
            case 3 -> 230;
            case 4 -> 51;
            case 5 -> 166;
            case 6 -> 174;
            case 7 -> 76;
            case 8 -> 210;
            case 9 -> 151;
            case 10 -> 163;
            case 11 -> 12;
            case 12 -> 236;
            case 13 -> 32;
            case 14 -> 187;
            case 15 -> 86;
            case 16 -> 154;
            case 17 -> 102;
            case 18 -> 17;
            case 19 -> 241;
            case 20 -> 138;
            case 21 -> 251;
            case 22 -> 192;
            case 23 -> 197;
            case 24 -> 238;
            case 25 -> 5;
            case 26 -> 162;
            case 27 -> 226;
            case 28 -> 30;
            case 29 -> 88;
            case 30 -> 84;
            case 31 -> 79;
            case 32 -> 64;
            case 33 -> 2;
            case 34 -> 112;
            case 35 -> 42;
            case 36 -> 8;
            case 37 -> 224;
            case 38 -> 184;
            case 39 -> 228;
            case 40 -> 15;
            case 41 -> 98;
            case 42 -> 62;
            case 43 -> 1;
            case 44 -> 104;
            case 45 -> 204;
            case 46 -> 54;
            case 47 -> 72;
            case 48 -> 57;
            case 49 -> 93;
            case 50 -> 172;
            case 51 -> 61;
            case 52 -> 215;
            case 53 -> 153;
            case 54 -> 7;
            case 55 -> 28;
            case 56 -> 119;
            case 57 -> 124;
            case 58 -> 248;
            case 59 -> 213;
            case 60 -> 4;
            case 61 -> 123;
            case 62 -> 252;
            case 63 -> 80;
            case 64 -> 95;
            case 65 -> 221;
            case 66 -> 73;
            case 67 -> 55;
            case 68 -> 148;
            case 69 -> 114;
            case 70 -> 253;
            case 71 -> 26;
            case 72 -> 101;
            case 73 -> 34;
            case 74 -> 0;
            case 75 -> 113;
            case 76 -> 222;
            case 77 -> 91;
            case 78 -> 126;
            case 79 -> 87;
            case 80 -> 141;
            case 81 -> 58;
            case 82 -> 44;
            case 83 -> 68;
            case 84 -> 156;
            case 85 -> 223;
            case 86 -> 218;
            case 87 -> 193;
            case 88 -> 70;
            case 89 -> 199;
            case 90 -> 19;
            case 91 -> 116;
            case 92 -> 159;
            case 93 -> 244;
            case 94 -> 209;
            case 95 -> 171;
            case 96 -> 212;
            case 97 -> 48;
            case 98 -> 33;
            case 99 -> 11;
            case 100 -> 189;
            case 101 -> 231;
            case 102 -> 75;
            case 103 -> 77;
            case 104 -> 83;
            case 105 -> 235;
            case 106 -> 142;
            case 107 -> 167;
            case 108 -> 110;
            case 109 -> 117;
            case 110 -> 85;
            case 111 -> 100;
            case 112 -> 165;
            case 113 -> 164;
            case 114 -> 254;
            case 115 -> 217;
            case 116 -> 131;
            case 117 -> 37;
            case 118 -> 49;
            case 119 -> 25;
            case 120 -> 180;
            case 121 -> 185;
            case 122 -> 178;
            case 123 -> 168;
            case 124 -> 177;
            case 125 -> 214;
            case 126 -> 108;
            case 127 -> 106;
            case 128 -> 35;
            case 129 -> 52;
            case 130 -> 78;
            case 131 -> 132;
            case 132 -> 237;
            case 133 -> 146;
            case 134 -> 195;
            case 135 -> 247;
            case 136 -> 103;
            case 137 -> 120;
            case 138 -> 202;
            case 139 -> 63;
            case 140 -> 135;
            case 141 -> 111;
            case 142 -> 198;
            case 143 -> 92;
            case 144 -> 60;
            case 145 -> 234;
            case 146 -> 94;
            case 147 -> 82;
            case 148 -> 9;
            case 149 -> 133;
            case 150 -> 161;
            case 151 -> 155;
            case 152 -> 10;
            case 153 -> 41;
            case 154 -> 6;
            case 155 -> 250;
            case 156 -> 125;
            case 157 -> 150;
            case 158 -> 31;
            case 159 -> 205;
            case 160 -> 22;
            case 161 -> 176;
            case 162 -> 186;
            case 163 -> 143;
            case 164 -> 216;
            case 165 -> 196;
            case 166 -> 96;
            case 167 -> 69;
            case 168 -> 27;
            case 169 -> 43;
            case 170 -> 129;
            case 171 -> 220;
            case 172 -> 134;
            case 173 -> 229;
            case 174 -> 90;
            case 175 -> 240;
            case 176 -> 140;
            case 177 -> 53;
            case 178 -> 200;
            case 179 -> 66;
            case 180 -> 45;
            case 181 -> 188;
            case 182 -> 118;
            case 183 -> 169;
            case 184 -> 24;
            case 185 -> 56;
            case 186 -> 128;
            case 187 -> 67;
            case 188 -> 36;
            case 189 -> 203;
            case 190 -> 183;
            case 191 -> 144;
            case 192 -> 227;
            case 193 -> 194;
            case 194 -> 136;
            case 195 -> 105;
            case 196 -> 147;
            case 197 -> 149;
            case 198 -> 245;
            case 199 -> 152;
            case 200 -> 145;
            case 201 -> 47;
            case 202 -> 107;
            case 203 -> 191;
            case 204 -> 89;
            case 205 -> 206;
            case 206 -> 182;
            case 207 -> 179;
            case 208 -> 160;
            case 209 -> 21;
            case 210 -> 190;
            case 211 -> 175;
            case 212 -> 211;
            case 213 -> 59;
            case 214 -> 16;
            case 215 -> 13;
            case 216 -> 81;
            case 217 -> 208;
            case 218 -> 50;
            case 219 -> 255;
            case 220 -> 38;
            case 221 -> 97;
            case 222 -> 207;
            case 223 -> 173;
            case 224 -> 14;
            case 225 -> 239;
            case 226 -> 65;
            case 227 -> 40;
            case 228 -> 39;
            case 229 -> 137;
            case 230 -> 243;
            case 231 -> 232;
            case 232 -> 201;
            case 233 -> 225;
            case 234 -> 130;
            case 235 -> 46;
            case 236 -> 246;
            case 237 -> 3;
            case 238 -> 181;
            case 239 -> 20;
            case 240 -> 122;
            case 241 -> 74;
            case 242 -> 109;
            case 243 -> 219;
            case 244 -> 18;
            case 245 -> 115;
            case 246 -> 127;
            case 247 -> 158;
            case 248 -> 99;
            case 249 -> 29;
            case 250 -> 157;
            case 251 -> 170;
            case 252 -> 23;
            case 253 -> 249;
            case 254 -> 233;
            default -> 71;
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
   public static void a(me.octo.client.IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl var0, boolean var1) {
      var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }
   public static void a(me.octo.client.IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl var0, long var1) {
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }
   public static me.octo.client.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl a(me.octo.client.IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl var0) {
      return var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   public static void b(me.octo.client.IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl var0, boolean var1) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }
   public static void b(me.octo.client.IIlIIIllllIllIlIlIllIlllIIllIIIllllIllIIlIllIllIIllIIIlllIllIlIIlIIIIIIIlIIIlIIlIlIIl var0, long var1) {
      var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }
}
