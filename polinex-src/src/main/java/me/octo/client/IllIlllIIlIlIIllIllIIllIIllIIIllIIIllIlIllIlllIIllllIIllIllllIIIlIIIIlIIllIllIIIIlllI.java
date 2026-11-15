package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public final class IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   public static IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private static IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] d;
   private static String[] e;

   public IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI(
      @NotNull IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var1
   ) {
      short var10001 = -24600;
      short var10002 = 28893;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 530L;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII();
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) { String var7 = null; // PX-FIX hoist
        
      Object var40 = null; // PX-FIX
      short var10001 = -24593;
      short var10002 = -28801;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = -24594;
      var10002 = -28493;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
       var7 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U();
      int[] var6 = var10000;
      int var8 = (int)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var7, false, 2, null);
      float var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var8 + 30, 150, 350);
      int var10 = var3 - 8;
      float var11 = var2.e() - 60 - 10;
      int var12 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(var1, (int)var2.c(), var3, (int)(var11 - var9 - 15));
      int var13 = var12 + var10 >> 1;
      float var14 = var11 - var9;
      float var15 = var13 - 14.0F;
      float var17 = var13 + 14.0F;
      long var18 = System.currentTimeMillis();
      long var48;
      int var37 = (
               var48 = var18
                  - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )
            == 0L
         ? 0
         : (var48 < 0L ? -1 : 1);
      if (var6 != null) {
         if (var37 > 0) {
            boolean var43 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var6 != null) {
               var43 = !this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var43;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var18;
         }

         var37 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var20 = var37 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var21 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y();
      int var38 = var7.length();
      if (var6 != null) {
         var38 = var38 == 0 ? 1 : 0;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var22 = var38 != 0
            && !this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var14,
         var15 + 1.0F,
         var9,
         28.0F,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 20),
         5.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var14, var15, var9, 28.0F, var20, 5.0F);
      if (var6 != null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var14 - 1.0F, var15 - 1.0F, var9 + 2.0F, 30.0F, 1.0F, var21.a(0.3F), 6.0F
            );
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var14, var15, var9, 28.0F, 1.0F, var21, 5.0F
         );
      }

      float var23 = var14 + 10.0F;
      int var24 = var13 - 7;
      int var39 = var7.length();
      if (var6 != null) {
         var39 = var39 > 0 ? 1 : 0;
      }

      label188: {
         label202: {
            if (var39 != 0) {
               float var25 = var9 - 20.0F;
               double var26 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var7, false, 2, null);
               double var49;
               var40 = (var49 = var26 - var25) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
               if (var6 != null) {
                  if ((me.octo.client.PxTruth.truth(var40))) {
                     String var31;
                     double var28 = var26 - var25;
                     int var30 = this.a(var7, (float)var28 + 10.0F);
                     String var41 = var7.substring(var30);
                     var10002 = -24596;
                     short var10003 = -271;
                     Intrinsics.checkNotNullExpressionValue(var41, "substring(...)");
                     var31 = var41;
                     var40 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     label179:
                     if (var6 != null) {
                        if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                           var40 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a();
                           if (var6 == null) {
                              break label179;
                           }

                           if (!(me.octo.client.PxTruth.truth(var40))) {
                              this.a(
                                 var23,
                                 var15,
                                 28.0F,
                                 (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var31, false, 2, null)
                              );
                           }
                        }

                        me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var31, var23, var24, var22, false, 16, null);
                        var40 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     }

                     if (var6 == null) {
                        break label188;
                     }

                     if ((me.octo.client.PxTruth.truth(var40))) {
                        break label202;
                     }

                     var40 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     if (var6 == null) {
                        break label188;
                     }

                     if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                        break label202;
                     }

                     double var32 = var23
                        + me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var31, false, 2, null);
                     this.a((float)var32, var15, 28.0F);
                     if (var6 != null) {
                        break label202;
                     }
                  }

                  var40 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               }

               label170:
               if (var6 != null) {
                  if (!(me.octo.client.PxTruth.truth(var40))) {
                     var40 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a();
                     if (var6 == null) {
                        break label170;
                     }

                     if (!(me.octo.client.PxTruth.truth(var40))) {
                        this.a(var23, var15, 28.0F, (float)var26);
                     }
                  }

                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var7, var23, var24, var22, false, 16, null);
                  var40 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               }

               if (var6 == null) {
                  break label188;
               }

               if ((me.octo.client.PxTruth.truth(var40))) {
                  break label202;
               }

               var40 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               if (var6 == null) {
                  break label188;
               }

               if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                  break label202;
               }

               double var36 = var23 + var26;
               this.a((float)var36, var15, 28.0F);
               if (var6 != null) {
                  break label202;
               }
            }

            var40 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var6 != null) {
               if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  var10001 = -24595;
                  var10002 = -15782;
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     "Enter text...",
                     var23,
                     var24,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .a(0.6F),
                     false, 16, null);
                  if (var6 != null) {
                     break label202;
                  }
               }

               var40 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            if (var6 == null) {
               break label188;
            }

            if (!(me.octo.client.PxTruth.truth(var40))) {
               this.a(var23, var15, 28.0F);
            }
         }

         float var50;
         var40 = (var50 = var4 - var14) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
      }

      label135: {
         label207: {
            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var40))) {
                  break label207;
               }

               float var51;
               var40 = (var51 = var4 - var11) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var40))) {
                  break label207;
               }

               float var52;
               var40 = (var52 = var5 - var15) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var40))) {
                  break label207;
               }

               float var53;
               var40 = (var53 = var5 - var17) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if ((me.octo.client.PxTruth.truth(var40))) {
                  break label207;
               }

               float var54;
               var40 = (var54 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label135;
            }

            if ((me.octo.client.PxTruth.truth(var40))) {
               var40 = 1;
               break label135;
            }
         }

         var40 = 0;
      }

      int var34 =((Integer)( var40));
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var35 = null;
      if (var34 != 0) {
         var35 = this;
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
      }

      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var12, var35);
   }

   private final void a(float var1, float var2, float var3) {
      float var4 = var3 * 0.6F;
      float var5 = var2 + (var3 - var4) / 2.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var5,
         1.5F,
         var4,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         0.0F
      );
   }

   private final void a(float var1, float var2, float var3, float var4) {
      float var5 = var3 * 0.6F;
      float var6 = var2 + (var3 - var5) / 2.0F;
      lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, var6, var4, var5);
   }

   private final int a(String var1, float var2) {
       int var7 = 0; // PX-FIX decl var7
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      float var4 = 0.0F;
      int var5 = 0;
      int[] var3 = var10000;
      int var6 = var1.length();

      while (true) {
         if (var5 < var6) {
            var4 += (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               String.valueOf(var1.charAt(var5)),
               false, 2, null);
            if (var3 != null) {
               float var8;
               var7 = (var8 = var4 - var2) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
               if (var3 == null) {
                  break;
               }

               if (var7 >= 0) {
                  return var5;
               }

               var5++;
            }

            if (var3 != null) {
               continue;
            }
         }

         var7 = 0;
         break;
      }

      return var7;
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Override
   public void e() {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
      this.d();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
   }

   public final void f() {
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      int[] var1 = var10000;
      IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI var2 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var1 != null) {
         if (Intrinsics.areEqual(IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, this)) {
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
         var2 = this;
      }

      var2.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
   }

   public final boolean a(int var1, int var2) {
      int[] var3 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      int var10000 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
      if (var3 != null) {
         if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return false;
         }

         var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            .a(
               var1,
               null,
               null
            ) ? 1 : 0;
      }

      if (var3 != null) {
         if (var10000 != 0) {
            this.g();
            return true;
         }

         var10000 = var1;
      }

      if (var3 != null) {
         label101: {
            label77:
            switch (var10000) {
               case 86:
                  if (var3 == null) {
                     return (var2 != 0);
                  }

                  if (var2 == 1) {
                     boolean var5 = this.h();
                     if (var3 == null) {
                        return var5;
                     }

                     if (var5) {
                        this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           .b(null);
                        this.i();
                        return true;
                     }
                  }
                  break label101;
               case 256:
               case 257:
                  this.f();
                  return false;
               case 259:
                  var10000 = var2;
                  if (var3 == null) {
                     break;
                  }

                  switch (var2) {
                     case 1:
                     case 2:
                        var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           .a(String.valueOf((kotlin.jvm.functions.Function1)null)); return 0; })).get();
                        break label77;
                     default:
                        if (var3 != null) {
                           break label101;
                        }
                  }
               case 261:
                  if (var3 == null) {
                     return (var2 != 0);
                  }

                  if (var2 == 1) {
                     this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
                     this.j();
                     return true;
                  }
               default:
                  break label101;
            }

            if (var3 != null) {
               if (var10000 != 0) {
                  this.g();
                  if (var3 != null) {
                     return true;
                  }
               }

               var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U().length();
            }

            if (var3 != null) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.V();
               this.g();
            }

            return true;
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   public final void a(char var1) {
      int[] var2 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      char var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ? (char)1 : (char)0;
      if (var2 != null) {
         if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return;
         }

         var10000 = var1;
      }

      label29: {
         short var10001;
         var10001 = 32;
         label28:
         if (var2 != null) {
            if (var10000 >= ' ') {
               var10000 = var1;
               var10001 = 126;
               if (var2 == null) {
                  break label28;
               }

               if (var1 <= '~') {
                  break label29;
               }
            }

            var10000 = var1;
            var10001 = 167;
         }

         if (var10000 != var10001) {
            return;
         }
      }

      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         .b(null);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d(String.valueOf(var1));
      this.g();
   }

   private final void g() {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
   }

   private final boolean h() {
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      long var2 = Minecraft.getInstance().getWindow().handle();
      int[] var1 = var10000;
      int var4 = GLFW.glfwGetKey(var2, 341);
      if (var1 != null) {
         if (var4 != 1) {
            int var5 = GLFW.glfwGetKey(var2, 345);
            if (var1 == null) {
               return (var5 != 0);
            }

            if (var5 != 1) {
               return (0 != 0);
            }
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   private final void i() { String var7 = null; // PX-FIX hoist
        
      char var8 = 0; // PX-FIX
      int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      String var2 = GLFW.glfwGetClipboardString(Minecraft.getInstance().getWindow().handle());
      int[] var1 = var10000;
       var7 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return;
         }

         var7 = var2;
      }

      String var3 = var7;
      int var4 = 0;
      int var5 = var3.length();

      while (var4 < var5) {
         char var6 = var3.charAt(var4);
         if (var1 == null) {
            return;
         }

         label37: {
            label36: {
               short var10001;
               var8 = var6;
               var10001 = 32;
               label35:
               if (var1 != null) {
                  if (var6 >= ' ') {
                     var8 = var6;
                     var10001 = 126;
                     if (var1 == null) {
                        break label35;
                     }

                     if (var6 <= '~') {
                        break label36;
                     }
                  }

                  var8 = var6;
                  var10001 = 167;
               }

               if (var8 != var10001) {
                  break label37;
               }
            }

            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d(String.valueOf(var6));
         }

         var4++;
         if (var1 == null) {
            break;
         }
      }

      this.g();
   }

   private final void j() {
      int[] var1 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();

      do {
         boolean var10000;
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U().length() > 0) {
            var10000 = true;
            if (var1 != null) {
            }
         } else {
            var10000 = false;
         }

         if (!var10000) {
            break;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.V();
      } while (var1 != null);

      this.g();
   }

   private static final String a(IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI var0) {
      return var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.U();
   }

   private static final Unit b(IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   private static final Unit c(IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   private static final Unit d(IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   private static final Unit e(IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI var0) {
      var0.j();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "ûÒ\u0090Y\u001cR£\u0004\u0011\u009b,$Võ\r»2~+\u0013\u009a\u0099\u000e÷ì\f\u001dR\n´DI\u0085\fQ§\u0084'*";
      int var4 = "ûÒ\u0090Y\u001cR£\u0004\u0011\u009b,$Võ\r»2~+\u0013\u009a\u0099\u000e÷ì\f\u001dR\n´DI\u0085\fQ§\u0084'*".length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 45;
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
                     case 0 -> 123;
                     case 1 -> 97;
                     case 2 -> 119;
                     case 3 -> 15;
                     case 4 -> 50;
                     case 5 -> 127;
                     default -> 125;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
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

                  var2 = ";ÇÏ©\u0012d\u0005×\u0091Y\u0095\u0007§Ø¼¼á¤\u001d";
                  var4 = ";ÇÏ©\u0012d\u0005×\u0091Y\u0095\u0007§Ø¼¼á¤\u001d".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 83;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String c(int var0, int var1) { int var7 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ -24596) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 194;
            case 1 -> 108;
            case 2 -> 186;
            case 3 -> 83;
            case 4 -> 23;
            case 5 -> 216;
            case 6 -> 6;
            case 7 -> 13;
            case 8 -> 170;
            case 9 -> 254;
            case 10 -> 38;
            case 11 -> 69;
            case 12 -> 54;
            case 13 -> 104;
            case 14 -> 5;
            case 15 -> 119;
            case 16 -> 51;
            case 17 -> 200;
            case 18 -> 180;
            case 19 -> 8;
            case 20 -> 28;
            case 21 -> 127;
            case 22 -> 85;
            case 23 -> 71;
            case 24 -> 191;
            case 25 -> 132;
            case 26 -> 42;
            case 27 -> 248;
            case 28 -> 174;
            case 29 -> 215;
            case 30 -> 75;
            case 31 -> 33;
            case 32 -> 204;
            case 33 -> 10;
            case 34 -> 65;
            case 35 -> 196;
            case 36 -> 44;
            case 37 -> 123;
            case 38 -> 112;
            case 39 -> 151;
            case 40 -> 86;
            case 41 -> 81;
            case 42 -> 253;
            case 43 -> 114;
            case 44 -> 4;
            case 45 -> 121;
            case 46 -> 80;
            case 47 -> 68;
            case 48 -> 43;
            case 49 -> 234;
            case 50 -> 255;
            case 51 -> 182;
            case 52 -> 230;
            case 53 -> 12;
            case 54 -> 179;
            case 55 -> 76;
            case 56 -> 219;
            case 57 -> 62;
            case 58 -> 126;
            case 59 -> 242;
            case 60 -> 11;
            case 61 -> 3;
            case 62 -> 58;
            case 63 -> 184;
            case 64 -> 199;
            case 65 -> 172;
            case 66 -> 209;
            case 67 -> 130;
            case 68 -> 226;
            case 69 -> 117;
            case 70 -> 148;
            case 71 -> 15;
            case 72 -> 164;
            case 73 -> 171;
            case 74 -> 220;
            case 75 -> 195;
            case 76 -> 140;
            case 77 -> 135;
            case 78 -> 240;
            case 79 -> 211;
            case 80 -> 157;
            case 81 -> 50;
            case 82 -> 189;
            case 83 -> 47;
            case 84 -> 168;
            case 85 -> 74;
            case 86 -> 166;
            case 87 -> 118;
            case 88 -> 97;
            case 89 -> 84;
            case 90 -> 95;
            case 91 -> 55;
            case 92 -> 203;
            case 93 -> 183;
            case 94 -> 212;
            case 95 -> 99;
            case 96 -> 159;
            case 97 -> 239;
            case 98 -> 125;
            case 99 -> 116;
            case 100 -> 193;
            case 101 -> 110;
            case 102 -> 90;
            case 103 -> 251;
            case 104 -> 146;
            case 105 -> 89;
            case 106 -> 113;
            case 107 -> 136;
            case 108 -> 250;
            case 109 -> 94;
            case 110 -> 32;
            case 111 -> 252;
            case 112 -> 64;
            case 113 -> 181;
            case 114 -> 29;
            case 115 -> 244;
            case 116 -> 167;
            case 117 -> 207;
            case 118 -> 237;
            case 119 -> 236;
            case 120 -> 122;
            case 121 -> 92;
            case 122 -> 131;
            case 123 -> 59;
            case 124 -> 91;
            case 125 -> 145;
            case 126 -> 77;
            case 127 -> 20;
            case 128 -> 7;
            case 129 -> 235;
            case 130 -> 22;
            case 131 -> 137;
            case 132 -> 52;
            case 133 -> 246;
            case 134 -> 61;
            case 135 -> 133;
            case 136 -> 231;
            case 137 -> 201;
            case 138 -> 217;
            case 139 -> 138;
            case 140 -> 49;
            case 141 -> 98;
            case 142 -> 87;
            case 143 -> 225;
            case 144 -> 109;
            case 145 -> 93;
            case 146 -> 27;
            case 147 -> 154;
            case 148 -> 31;
            case 149 -> 128;
            case 150 -> 161;
            case 151 -> 206;
            case 152 -> 100;
            case 153 -> 210;
            case 154 -> 232;
            case 155 -> 149;
            case 156 -> 150;
            case 157 -> 115;
            case 158 -> 14;
            case 159 -> 101;
            case 160 -> 139;
            case 161 -> 247;
            case 162 -> 243;
            case 163 -> 228;
            case 164 -> 245;
            case 165 -> 185;
            case 166 -> 78;
            case 167 -> 214;
            case 168 -> 129;
            case 169 -> 9;
            case 170 -> 63;
            case 171 -> 187;
            case 172 -> 162;
            case 173 -> 19;
            case 174 -> 218;
            case 175 -> 0;
            case 176 -> 102;
            case 177 -> 70;
            case 178 -> 175;
            case 179 -> 1;
            case 180 -> 103;
            case 181 -> 88;
            case 182 -> 17;
            case 183 -> 67;
            case 184 -> 34;
            case 185 -> 111;
            case 186 -> 134;
            case 187 -> 107;
            case 188 -> 48;
            case 189 -> 160;
            case 190 -> 202;
            case 191 -> 176;
            case 192 -> 238;
            case 193 -> 241;
            case 194 -> 106;
            case 195 -> 66;
            case 196 -> 222;
            case 197 -> 41;
            case 198 -> 198;
            case 199 -> 141;
            case 200 -> 223;
            case 201 -> 105;
            case 202 -> 197;
            case 203 -> 36;
            case 204 -> 45;
            case 205 -> 16;
            case 206 -> 72;
            case 207 -> 169;
            case 208 -> 165;
            case 209 -> 18;
            case 210 -> 2;
            case 211 -> 155;
            case 212 -> 53;
            case 213 -> 46;
            case 214 -> 153;
            case 215 -> 96;
            case 216 -> 224;
            case 217 -> 233;
            case 218 -> 73;
            case 219 -> 30;
            case 220 -> 142;
            case 221 -> 205;
            case 222 -> 57;
            case 223 -> 152;
            case 224 -> 143;
            case 225 -> 147;
            case 226 -> 35;
            case 227 -> 144;
            case 228 -> 82;
            case 229 -> 213;
            case 230 -> 124;
            case 231 -> 208;
            case 232 -> 37;
            case 233 -> 221;
            case 234 -> 173;
            case 235 -> 188;
            case 236 -> 229;
            case 237 -> 178;
            case 238 -> 192;
            case 239 -> 163;
            case 240 -> 249;
            case 241 -> 21;
            case 242 -> 40;
            case 243 -> 60;
            case 244 -> 25;
            case 245 -> 120;
            case 246 -> 24;
            case 247 -> 158;
            case 248 -> 79;
            case 249 -> 156;
            case 250 -> 190;
            case 251 -> 56;
            case 252 -> 39;
            case 253 -> 227;
            case 254 -> 177;
            default -> 26;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for ( var7 = 0; var7 < var3.length; var7++) {
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @Nullable
      public final IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI a() {
         return IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final void b() {
         IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = null;
      }

   // >>> SYN6-BACKFILL-BEGIN (from .analysis/me-octo-only.jar; do not edit by hand)
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
   // >>> SYN6-BACKFILL-END
   }

   // >>> SYN6-BACKFILL-BEGIN (from .analysis/me-octo-only.jar; do not edit by hand)
   public float a() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public int b() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p0) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(p0, p1, p2, p3, p4, p5);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, float p3, float p4, float p5, float p6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5, p6);
   }
   public void a(char p0, int p1) {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1);
   }
   public void d() {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
   public boolean a(int p0, int p1, int p2, int p3, int p4, int p5) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }
   public static final me.octo.client.IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI k() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }
   public static final void f(me.octo.client.IllIlllIIlIlIIllIllIIllIIllIIIllIIIllIlIllIlllIIllllIIllIllllIIIlIIIIlIIllIllIIIIlllI p0) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = p0;
   }
   // >>> SYN6-BACKFILL-END
}
