package me.octo.client.utils;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public final class IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld

   @NotNull
   public static IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl() {
   }

   public final void a(@NotNull PoseStack var1, @NotNull VertexConsumer var2, @NotNull AABB var3, float var4, float var5, float var6, float var7) {
      short var10001 = -2409;
      short var10002 = 29666;
      Intrinsics.checkNotNullParameter(var1, "matrices");
      var10001 = -2412;
      var10002 = 7596;
      Intrinsics.checkNotNullParameter(var2, "buffer");
      var10001 = -2401;
      var10002 = -15243;
      Intrinsics.checkNotNullParameter(var3, "box");
      this.a(var1, var2, var3.minX, var3.minY, var3.minZ, var3.maxX, var3.maxY, var3.maxZ, var4, var5, var6, var7);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void a(
      @NotNull PoseStack var1,
      @NotNull VertexConsumer var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      float var53 = 0; // PX-FIX
      float var51 = 0; // PX-FIX
      int var10001 = -2409;
      short var10002 = 29666;
      Intrinsics.checkNotNullParameter(var1, "matrices");
      var10001 = (short)-2412;
      var10002 = 7596;
      Intrinsics.checkNotNullParameter(var2, "buffer");
      Pose var10000 = var1.last();
      var10002 = -2405;
      short var10003 = -27951;
      Intrinsics.checkNotNullExpressionValue(var10000, "last(...)");
      Pose var20 = var10000;
      float var21 = (float)var3;
      float var22 = (float)var5;
      float var23 = (float)var7;
      float var24 = (float)var9;
      float var25 = (float)var11;
      float var26 = (float)var13;
      float[] var28 = new float[24];
      var28[0] = var21;
      var28[1] = var22;
      var28[2] = var23;
      var28[3] = var24;
      var28[4] = var22;
      int[] var47 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      var28[5] = var23;
      var28[6] = var24;
      var28[7] = var25;
      var28[8] = var23;
      var28[9] = var21;
      var28[10] = var25;
      var28[11] = var23;
      var28[12] = var21;
      var28[13] = var22;
      var28[14] = var26;
      var28[15] = var24;
      var28[16] = var22;
      var28[17] = var26;
      var28[18] = var24;
      var28[19] = var25;
      var28[20] = var26;
      var28[21] = var21;
      var28[22] = var25;
      var28[23] = var26;
      int[] var19 = var47;
      float[] var27 = var28;
      int var46 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.length + -1;
      byte var29 = 0;
      int var30 = ProgressionUtilKt.getProgressionLastElement(0, var46, 2);
      int var48 = var29;
      var10001 = var30;
      if (var19 == null) {
         if (var29 > var30) {
            return;
         }

         var48 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var29];
         var10001 = 3;
      }

      while (true) {
         int var31 = var48 * var10001;
         int var32 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var29 + 1] * 3;
         float var33 = var27[var31];
         float var34 = var27[var31 + 1];
         float var35 = var27[var31 + 2];
         float var36 = var27[var32];
         float var37 = var27[var32 + 1];
         float var38 = var27[var32 + 2];
         float var39 = var36 - var33;
         float var40 = var37 - var34;
         float var41 = var38 - var35;
         float var42 = (float)Math.sqrt(var39 * var39 + var40 * var40 + var41 * var41);
         float var49;
         if (var42 > 0.0F) {
            var49 = var39 / var42;
            if (var19 == null) {
            }
         } else {
            var49 = 0.0F;
         }

         float var43;
         label44: {
            var43 = var49;
            float var50 = var42;
            float var56 = 0.0F;
            if (var19 == null) {
               if (!(var42 > 0.0F)) {
                  var51 = 0.0F;
                  break label44;
               }

               var50 = var40;
               var56 = var42;
            }

            var51 = var50 / var56;
         }

         float var44;
         label39: {
            var44 = var51;
            float var52 = var42;
            float var57 = 0.0F;
            if (var19 == null) {
               if (!(var42 > 0.0F)) {
                  var53 = 0.0F;
                  break label39;
               }

               var52 = var41;
               var57 = var42;
            }

            var53 = var52 / var57;
         }

         float var45 = var53;
         var2.addVertex((Matrix4fc)var20.pose(), var33, var34, var35)
            .setColor(var15, var16, var17, var18)
            .setNormal(var20, var43, var44, var45)
            .setLineWidth(1.0F);
         var2.addVertex((Matrix4fc)var20.pose(), var36, var37, var38)
            .setColor(var15, var16, var17, var18)
            .setNormal(var20, var43, var44, var45)
            .setLineWidth(1.0F);
         if (var19 == null) {
            if (var29 == var30) {
               break;
            }

            var29 += 2;
         }

         if (var19 != null) {
            break;
         }

         var48 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var29];
         var10001 = 3;
      }
   }

   public final void b(@NotNull PoseStack var1, @NotNull VertexConsumer var2, @NotNull AABB var3, float var4, float var5, float var6, float var7) {
      short var10001 = -2409;
      short var10002 = 29666;
      Intrinsics.checkNotNullParameter(var1, "matrices");
      var10001 = -2412;
      var10002 = 7596;
      Intrinsics.checkNotNullParameter(var2, "buffer");
      var10001 = -2401;
      var10002 = -15243;
      Intrinsics.checkNotNullParameter(var3, "box");
      this.a(var1, var2, (float)var3.minX, (float)var3.minY, (float)var3.minZ, (float)var3.maxX, (float)var3.maxY, (float)var3.maxZ, var4, var5, var6, var7);
   }

   public final void a(
      @NotNull PoseStack var1,
      @NotNull VertexConsumer var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      short var10001 = -2413;
      short var10002 = 15944;
      Intrinsics.checkNotNullParameter(var1, "matrices");
      var10001 = -2412;
      var10002 = 7596;
      Intrinsics.checkNotNullParameter(var2, "buffer");
      Matrix4f var10000 = var1.last().pose();
      var10002 = -2404;
      short var10003 = 26412;
      Intrinsics.checkNotNullExpressionValue(var10000, "pose(...)");
      Matrix4f var13 = var10000;
      a(var2, var13, var9, var10, var11, var12, var3, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var4, var8);
      a(var2, var13, var9, var10, var11, var12, var3, var7, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var7, var8);
      a(var2, var13, var9, var10, var11, var12, var3, var7, var8);
      a(var2, var13, var9, var10, var11, var12, var3, var4, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var4, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var4, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var5);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var5);
      a(var2, var13, var9, var10, var11, var12, var6, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var7, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var6, var4, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var4, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var4, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var4, var8);
      a(var2, var13, var9, var10, var11, var12, var3, var7, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var7, var5);
      a(var2, var13, var9, var10, var11, var12, var3, var7, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var5);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var8);
      a(var2, var13, var9, var10, var11, var12, var6, var7, var8);
   }

   public final void a(@NotNull Pose var1, @NotNull VertexConsumer var2, @NotNull Vector3f var3, @NotNull Vec3 var4, int var5, int var6) {
      int[] var7;
      float var8;
      float var9;
      float var10;
      float var12;
      float var13;
      float var14;
      float var19;
      label36: {
         int[] var10000 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
         short var10002 = -2415;
         short var10003 = 31541;
         Intrinsics.checkNotNullParameter(var1, "entry");
         var10002 = -2406;
         var10003 = 18003;
         Intrinsics.checkNotNullParameter(var2, "buffer");
         var10002 = -2407;
         var10003 = -29294;
         Intrinsics.checkNotNullParameter(var3, "start");
         var10002 = -2402;
         var10003 = 7518;
         Intrinsics.checkNotNullParameter(var4, "direction");
         var8 = var3.x() + (float)var4.x;
         var9 = var3.y() + (float)var4.y;
         var10 = var3.z() + (float)var4.z;
         float var11 = (float)var4.x;
         var12 = (float)var4.y;
         var13 = (float)var4.z;
         var7 = var10000;
         var14 = (float)Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
         var19 = var14;
         float var10001 = 0.0F;
         if (var7 == null) {
            if (!(var14 > 0.0F)) {
               var19 = 0.0F;
               break label36;
            }

            var19 = var11;
            var10001 = var14;
         }

         var19 /= var10001;
      }

      float var15;
      label30: {
         var15 = var19;
         var19 = var14;
         float var24 = 0.0F;
         if (var7 == null) {
            if (!(var14 > 0.0F)) {
               var19 = 0.0F;
               break label30;
            }

            var19 = var12;
            var24 = var14;
         }

         var19 /= var24;
      }

      float var16;
      label24: {
         var16 = var19;
         var19 = var14;
         float var25 = 0.0F;
         if (var7 == null) {
            if (!(var14 > 0.0F)) {
               var19 = 0.0F;
               break label24;
            }

            var19 = var13;
            var25 = var14;
         }

         var19 /= var25;
      }

      float var17 = var19;
      var2.addVertex((Matrix4fc)var1.pose(), var3.x(), var3.y(), var3.z()).setColor(var5).setNormal(var1, var15, var16, var17).setLineWidth(1.0F);
      var2.addVertex((Matrix4fc)var1.pose(), var8, var9, var10).setColor(var6).setNormal(var1, var15, var16, var17).setLineWidth(1.0F);
   }

   public final void a(
      @NotNull PoseStack var1,
      @NotNull BufferSource var2,
      @NotNull RenderType var3,
      @NotNull RenderType var4,
      @NotNull AABB var5,
      float var6,
      float var7,
      float var8,
      float var9
   ) {
      short var10001 = -2409;
      short var10002 = 29666;
      Intrinsics.checkNotNullParameter(var1, "matrices");
      var10001 = -2432;
      var10002 = -1939;
      Intrinsics.checkNotNullParameter(var2, "bufferSource");
      var10001 = -2411;
      var10002 = -11799;
      Intrinsics.checkNotNullParameter(var3, "lineStripLayer");
      var10001 = -2414;
      var10002 = 25509;
      Intrinsics.checkNotNullParameter(var4, "linesLayer");
      var10001 = -2408;
      var10002 = -3505;
      Intrinsics.checkNotNullParameter(var5, "box");
      Pose var10000 = var1.last();
      var10002 = -2403;
      short var10003 = -6954;
      Intrinsics.checkNotNullExpressionValue(var10000, "last(...)");
      Pose var11 = var10000;
      llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      float var12 = (float)var5.minX;
      float var13 = (float)var5.minY;
      float var14 = (float)var5.minZ;
      float var15 = (float)var5.maxX;
      float var16 = (float)var5.maxY;
      float var17 = (float)var5.maxZ;
      VertexConsumer var19 = var2.getBuffer(var3);
      var10002 = -2410;
      var10003 = 26223;
      Intrinsics.checkNotNullExpressionValue(var19, "getBuffer(...)");
      VertexConsumer var18 = var19;
      var18.addVertex((Matrix4fc)var11.pose(), var12, var13, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var12, var13, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var13, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var13, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var12, var13, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var12, var16, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var12, var16, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var16, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var16, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var12, var16, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var12, var16, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var12, var13, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var13, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var16, var17).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var16, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var18.addVertex((Matrix4fc)var11.pose(), var15, var13, var14).setColor(var6, var7, var8, var9).setNormal(var11, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var2.endBatch(var3);
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.b(new int[4]);
      }
   }

   public final void a(
      @NotNull PoseStack var1,
      @NotNull VertexConsumer var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      short var10001 = -2409;
      short var10002 = 29666;
      Intrinsics.checkNotNullParameter(var1, "matrices");
      var10001 = -2412;
      var10002 = 7596;
      Intrinsics.checkNotNullParameter(var2, "buffer");
      Matrix4f var10000 = var1.last().pose();
      var10002 = -2416;
      short var10003 = 4102;
      Intrinsics.checkNotNullExpressionValue(var10000, "pose(...)");
      Matrix4f var18 = var10000;
      var2.addVertex((Matrix4fc)var18, var3, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var4, var8).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var7, var5).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var3, var7, var8).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var3, var7, var8).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var3, var4, var8).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var6, var7, var8).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var6, var4, var8).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var6, var4, var8).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var6, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var6, var7, var8).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var6, var7, var5).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var6, var7, var5).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var6, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var7, var5).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var3, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var6, var4, var5).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var4, var8).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var6, var4, var8).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var6, var4, var8).setColor(var13, var14, var15, var16);
      var2.addVertex((Matrix4fc)var18, var3, var7, var5).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var3, var7, var5).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var3, var7, var8).setColor(var9, var10, var11, var12);
      int[] var19 = llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.c();
      var2.addVertex((Matrix4fc)var18, var6, var7, var5).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var6, var7, var8).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var6, var7, var8).setColor(var9, var10, var11, var12);
      var2.addVertex((Matrix4fc)var18, var6, var7, var8).setColor(var9, var10, var11, var12);
      int[] var17 = var19;
      if (var17 != null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }
   }

   private static final void a(VertexConsumer var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      var0.addVertex((Matrix4fc)var1, var6, var7, var8).setColor(var2, var3, var4, var5);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "H3w#2û'Õå\u0005±jø>u\n\\yw¬×häÞw\u008c\bm9jº7p¥\u001d\u0006AÉ\u0013&Dd\u000eÕÖFYÑî\u0013!í_\u0000¾P\u0091\u000e¼Ë\u001bP\u0005\u001e\u007fcôþ.5x\u0006\b\u0096E\u00155Ø\u0081X#\u0003R\u0094o\u0005\\2\u0084l@\u0006·ÝÍ¤\u009f4\tíÏ\\bWà\u008b¶p\tçQ\u0082o\u008crðä\u001f\tÎ¿8lÛ!\u001a\u008eB\tóÓ\u0097ùDú\u008c¥x";
      int var4 = "H3w#2û'Õå\u0005±jø>u\n\\yw¬×häÞw\u008c\bm9jº7p¥\u001d\u0006AÉ\u0013&Dd\u000eÕÖFYÑî\u0013!í_\u0000¾P\u0091\u000e¼Ë\u001bP\u0005\u001e\u007fcôþ.5x\u0006\b\u0096E\u00155Ø\u0081X#\u0003R\u0094o\u0005\\2\u0084l@\u0006·ÝÍ¤\u009f4\tíÏ\\bWà\u008b¶p\tçQ\u0082o\u008crðä\u001f\tÎ¿8lÛ!\u001a\u008eB\tóÓ\u0097ùDú\u008c¥x"
         .length();
      char var1 = '\t';
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 27;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 114;
                     case 1 -> 28;
                     case 2 -> 69;
                     case 3 -> 89;
                     case 4 -> 57;
                     case 5 -> 43;
                     default -> 61;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[17];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl();
                     int[] var7 = new int[]{0, 1, 1, 5, 5, 4, 4, 0, 3, 2, 2, 6, 6, 7, 7, 3, 0, 3, 1, 2, 5, 6, 4, 7};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var7;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "l¼\u001f\f)¥©\u001c¤\u0094Û\u0019C\u0017Åå";
                  var4 = "l¼\u001f\f)¥©\u001c¤\u0094Û\u0019C\u0017Åå".length();
                  var1 = 3;
                  var9 = -1;
            }

            var10000 = 14;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2416) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 9;
            case 1 -> 39;
            case 2 -> 4;
            case 3 -> 162;
            case 4 -> 223;
            case 5 -> 196;
            case 6 -> 19;
            case 7 -> 84;
            case 8 -> 210;
            case 9 -> 218;
            case 10 -> 10;
            case 11 -> 38;
            case 12 -> 236;
            case 13 -> 82;
            case 14 -> 104;
            case 15 -> 140;
            case 16 -> 3;
            case 17 -> 153;
            case 18 -> 93;
            case 19 -> 68;
            case 20 -> 239;
            case 21 -> 37;
            case 22 -> 198;
            case 23 -> 30;
            case 24 -> 79;
            case 25 -> 159;
            case 26 -> 193;
            case 27 -> 52;
            case 28 -> 55;
            case 29 -> 73;
            case 30 -> 122;
            case 31 -> 205;
            case 32 -> 113;
            case 33 -> 181;
            case 34 -> 27;
            case 35 -> 142;
            case 36 -> 64;
            case 37 -> 165;
            case 38 -> 97;
            case 39 -> 75;
            case 40 -> 98;
            case 41 -> 66;
            case 42 -> 202;
            case 43 -> 121;
            case 44 -> 1;
            case 45 -> 250;
            case 46 -> 217;
            case 47 -> 252;
            case 48 -> 249;
            case 49 -> 200;
            case 50 -> 36;
            case 51 -> 219;
            case 52 -> 248;
            case 53 -> 76;
            case 54 -> 126;
            case 55 -> 125;
            case 56 -> 167;
            case 57 -> 56;
            case 58 -> 69;
            case 59 -> 246;
            case 60 -> 62;
            case 61 -> 143;
            case 62 -> 216;
            case 63 -> 199;
            case 64 -> 132;
            case 65 -> 156;
            case 66 -> 225;
            case 67 -> 16;
            case 68 -> 145;
            case 69 -> 175;
            case 70 -> 22;
            case 71 -> 209;
            case 72 -> 105;
            case 73 -> 59;
            case 74 -> 136;
            case 75 -> 211;
            case 76 -> 234;
            case 77 -> 77;
            case 78 -> 112;
            case 79 -> 197;
            case 80 -> 74;
            case 81 -> 42;
            case 82 -> 60;
            case 83 -> 245;
            case 84 -> 71;
            case 85 -> 54;
            case 86 -> 235;
            case 87 -> 240;
            case 88 -> 178;
            case 89 -> 109;
            case 90 -> 192;
            case 91 -> 92;
            case 92 -> 78;
            case 93 -> 206;
            case 94 -> 127;
            case 95 -> 41;
            case 96 -> 229;
            case 97 -> 23;
            case 98 -> 103;
            case 99 -> 101;
            case 100 -> 232;
            case 101 -> 83;
            case 102 -> 114;
            case 103 -> 213;
            case 104 -> 17;
            case 105 -> 107;
            case 106 -> 171;
            case 107 -> 179;
            case 108 -> 45;
            case 109 -> 47;
            case 110 -> 87;
            case 111 -> 5;
            case 112 -> 163;
            case 113 -> 212;
            case 114 -> 124;
            case 115 -> 86;
            case 116 -> 247;
            case 117 -> 50;
            case 118 -> 161;
            case 119 -> 91;
            case 120 -> 150;
            case 121 -> 241;
            case 122 -> 190;
            case 123 -> 117;
            case 124 -> 204;
            case 125 -> 26;
            case 126 -> 81;
            case 127 -> 203;
            case 128 -> 243;
            case 129 -> 94;
            case 130 -> 31;
            case 131 -> 32;
            case 132 -> 233;
            case 133 -> 157;
            case 134 -> 220;
            case 135 -> 149;
            case 136 -> 130;
            case 137 -> 170;
            case 138 -> 191;
            case 139 -> 129;
            case 140 -> 166;
            case 141 -> 148;
            case 142 -> 46;
            case 143 -> 133;
            case 144 -> 49;
            case 145 -> 208;
            case 146 -> 227;
            case 147 -> 251;
            case 148 -> 152;
            case 149 -> 2;
            case 150 -> 44;
            case 151 -> 146;
            case 152 -> 201;
            case 153 -> 184;
            case 154 -> 96;
            case 155 -> 188;
            case 156 -> 238;
            case 157 -> 13;
            case 158 -> 0;
            case 159 -> 228;
            case 160 -> 164;
            case 161 -> 15;
            case 162 -> 128;
            case 163 -> 58;
            case 164 -> 102;
            case 165 -> 226;
            case 166 -> 35;
            case 167 -> 11;
            case 168 -> 244;
            case 169 -> 20;
            case 170 -> 24;
            case 171 -> 100;
            case 172 -> 108;
            case 173 -> 254;
            case 174 -> 158;
            case 175 -> 255;
            case 176 -> 63;
            case 177 -> 7;
            case 178 -> 186;
            case 179 -> 185;
            case 180 -> 18;
            case 181 -> 34;
            case 182 -> 131;
            case 183 -> 195;
            case 184 -> 12;
            case 185 -> 90;
            case 186 -> 67;
            case 187 -> 221;
            case 188 -> 25;
            case 189 -> 137;
            case 190 -> 182;
            case 191 -> 123;
            case 192 -> 214;
            case 193 -> 8;
            case 194 -> 138;
            case 195 -> 111;
            case 196 -> 230;
            case 197 -> 177;
            case 198 -> 215;
            case 199 -> 40;
            case 200 -> 173;
            case 201 -> 106;
            case 202 -> 85;
            case 203 -> 57;
            case 204 -> 43;
            case 205 -> 119;
            case 206 -> 187;
            case 207 -> 172;
            case 208 -> 139;
            case 209 -> 33;
            case 210 -> 65;
            case 211 -> 194;
            case 212 -> 29;
            case 213 -> 189;
            case 214 -> 28;
            case 215 -> 253;
            case 216 -> 120;
            case 217 -> 144;
            case 218 -> 89;
            case 219 -> 224;
            case 220 -> 61;
            case 221 -> 160;
            case 222 -> 151;
            case 223 -> 72;
            case 224 -> 95;
            case 225 -> 110;
            case 226 -> 222;
            case 227 -> 88;
            case 228 -> 207;
            case 229 -> 176;
            case 230 -> 53;
            case 231 -> 231;
            case 232 -> 169;
            case 233 -> 6;
            case 234 -> 118;
            case 235 -> 116;
            case 236 -> 180;
            case 237 -> 134;
            case 238 -> 147;
            case 239 -> 154;
            case 240 -> 141;
            case 241 -> 242;
            case 242 -> 99;
            case 243 -> 51;
            case 244 -> 48;
            case 245 -> 135;
            case 246 -> 21;
            case 247 -> 70;
            case 248 -> 115;
            case 249 -> 237;
            case 250 -> 183;
            case 251 -> 155;
            case 252 -> 168;
            case 253 -> 174;
            case 254 -> 14;
            default -> 80;
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
