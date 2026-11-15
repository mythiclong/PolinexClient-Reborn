package me.octo.client.utils;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public final class IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll {
   public static void a(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll p0, GuiGraphicsExtractor p1, float p2, float p3, float p4, float p5, float p6, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p7, float p8, int p9, Object p10) {
      if ((p9 & 128) != 0) {
         p8 = 1.0F;
      }
      p0.a(p1, p2, p3, p4, p5, p6, p7, p8);
   }

   public static void a(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll p0, GuiGraphicsExtractor p1, float p2, float p3, float p4, float p5, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p6, float p7, int p8, Object p9) {
      if ((p8 & 64) != 0) {
         p7 = 1.0F;
      }
      p0.a(p1, p2, p3, p4, p5, p6, p7);
   }

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIl
   public static void a(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll p0, GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p7, float p8, int p9, Object p10) {
      if ((p9 & 128) != 0) {
         p8 = 1.0F;
      }
      p0.a(p1, p2, p3, p4, p5, p6, p7, p8);
   }

   public static void b(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll p0, GuiGraphicsExtractor p1, float p2, float p3, float p4, float p5, float p6, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p7, float p8, int p9, Object p10) {
      if ((p9 & 128) != 0) {
         p8 = 1.0F;
      }
      p0.b(p1, p2, p3, p4, p5, p6, p7, p8);
   }

// PX-DEDUP removed duplicate ovld: public static <T> T b(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIl
   public static void b(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll p0, GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p7, float p8, int p9, Object p10) {
      if ((p9 & 128) != 0) {
         p8 = 1.0F;
      }
      p0.b(p1, p2, p3, p4, p5, p6, p7, p8);
   }

   public static void c(IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll p0, GuiGraphicsExtractor p1, float p2, float p3, float p4, float p5, float p6, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p7, float p8, int p9, Object p10) {
      if ((p9 & 128) != 0) {
         p8 = 1.0F;
      }
      p0.c(p1, p2, p3, p4, p5, p6, p7, p8);
   }

   @NotNull
   public static IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private static Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Minecraft IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll() {
   }

   @Nullable
   public final Vec3 a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(@Nullable Vec3 var1) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final Minecraft b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void c() {
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      Vector3f var2 = new Vector3f(0.0F, 0.0F, 1.0F);
      String var1 = var10000;
      if (var1 != null) {
         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.options.bobView().get()) {
            PoseStack var3 = new PoseStack();
            this.a(var3);
            var2.mulPosition((Matrix4fc)var3.last().pose().invert());
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Vec3(var2.x, -var2.y, var2.z)
            .xRot(
               -(
                  (float)Math.toRadians(
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.gameRenderer.getMainCamera().xRot()
                  )
               )
            )
            .yRot(
               -(
                  (float)Math.toRadians(
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.gameRenderer.getMainCamera().yRot()
                  )
               )
            )
            .add(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.gameRenderer.getMainCamera().position());
      }
   }

   private final void a(PoseStack var1) {
      Entity var2 = Minecraft.getInstance().getCameraEntity();
      if (var2 instanceof AbstractClientPlayer) {
         float var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         double var4 = (((AbstractClientPlayer)var2).tickCount + var3) * 0.5;
         double var6 = 0.0;
         var1.translate(Math.sin(var4 * Math.PI) * var6 * 0.5, -Math.abs(Math.cos(var4 * Math.PI) * var6), 0.0);
         var1.mulPose((Quaternionfc)Axis.ZP.rotationDegrees((float)(Math.sin(var4 * Math.PI) * var6 * 3.0)));
         var1.mulPose((Quaternionfc)Axis.XP.rotationDegrees((float)(Math.abs(Math.cos(var4 * Math.PI - 0.2) * var6) * 5.0)));
      }
   }

   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var2, var3, var4, var5, var7.o(), var6);
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = 28393;
      short var10002 = -20492;
      Intrinsics.checkNotNullParameter(var6, "color");
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var4, var6.o(), var5);
   }

   private final void a(
      VertexConsumer var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8
   ) {
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      int var10 = Math.max(16, (int)(var5 * 1.5F));
      float var11 = var7 / var10;
      int var12 = var8.o();
      String var9 = var10000;
      int var13 = 0;

      while (var13 < var10) {
         double var14 = Math.toRadians(var6 + var13 * var11);
         double var16 = Math.toRadians(var6 + (var13 + 1) * var11);
         float var18 = (float)(Math.cos(var14) * var5);
         float var19 = (float)(Math.sin(var14) * var5);
         float var20 = (float)(Math.cos(var16) * var5);
         float var21 = (float)(Math.sin(var16) * var5);
         var1.addVertex((Matrix4fc)var2, var3, var4, 0.0F).setColor(var12);
         var1.addVertex((Matrix4fc)var2, var3 + var18, var4 + var19, 0.0F).setColor(var12);
         var1.addVertex((Matrix4fc)var2, var3 + var20, var4 + var21, 0.0F).setColor(var12);
         var13++;
         if (var9 == null) {
            break;
         }
      }
   }

   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var5, "color");
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var2, var3, var4, var5.o());
   }

   public final void b(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      short var10002 = 28392;
      short var10003 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10002 = 28393;
      var10003 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      String var8 = var10000;
      int var9 = 0;

      while (true) {
         if (var9 < 5) {
            float var10 = var7.q();
            float var11 = var7.r();
            float var12 = var7.s();
            float var13 = var7.d() * (1.0F / (var9 + 1));
            llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var14 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
               var10, var11, var12, var13
            );
            this.a(var1, var2 - var9, var3 - var9, var4 + 2 * var9, var5 + 2 * var9, var6 + var9, var14);
            var9++;
            if (var8 == null) {
               break;
            }

            if (var8 != null) {
               continue;
            }
         }

         this.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      }
   }

   @JvmOverloads
   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(var2, var3, var4, var5, var8, var7.o(), var6);
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, @NotNull ItemStack var2, float var3, float var4) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28396;
      var10002 = -19647;
      Intrinsics.checkNotNullParameter(var2, "stack");
      var1.item(var2, (int)var3, (int)var4);
   }

   private final void b(
      VertexConsumer var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8
   ) {
      int var10 = Math.max(16, (int)(var5 * 1.5F));
      float var11 = var7 / var10;
      int var12 = var8.o();
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      int var13 = 0;
      String var9 = var10000;

      while (var13 < var10) {
         double var14 = Math.toRadians(var6 + var13 * var11);
         double var16 = Math.toRadians(var6 + (var13 + 1) * var11);
         float var18 = (float)(Math.cos(var14) * var5);
         float var19 = (float)(Math.sin(var14) * var5);
         float var20 = (float)(Math.cos(var16) * var5);
         float var21 = (float)(Math.sin(var16) * var5);
         var1.addVertex((Matrix4fc)var2, var3, var4, 0.0F).setColor(var12);
         var1.addVertex((Matrix4fc)var2, var3 + var18, var4 + var19, 0.0F).setColor(var12);
         var1.addVertex((Matrix4fc)var2, var3 + var20, var4 + var21, 0.0F).setColor(var12);
         var13++;
         if (var9 == null) {
            break;
         }
      }

      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var29 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var8.q(), var8.r(), var8.s(), 0.0F
      );
      int var30 = var29.o();
      float var15 = 1.5F;
      int var31 = 0;

      while (var31 < var10) {
         double var17 = Math.toRadians(var6 + var31 * var11);
         double var32 = Math.toRadians(var6 + (var31 + 1) * var11);
         float var33 = var3 + (float)(Math.cos(var17) * var5);
         float var22 = var4 + (float)(Math.sin(var17) * var5);
         float var23 = var3 + (float)(Math.cos(var32) * var5);
         float var24 = var4 + (float)(Math.sin(var32) * var5);
         float var25 = var3 + (float)(Math.cos(var17) * (var5 + var15));
         float var26 = var4 + (float)(Math.sin(var17) * (var5 + var15));
         float var27 = var3 + (float)(Math.cos(var32) * (var5 + var15));
         float var28 = var4 + (float)(Math.sin(var32) * (var5 + var15));
         var1.addVertex((Matrix4fc)var2, var33, var22, 0.0F).setColor(var12);
         var1.addVertex((Matrix4fc)var2, var25, var26, 0.0F).setColor(var30);
         var1.addVertex((Matrix4fc)var2, var23, var24, 0.0F).setColor(var12);
         var1.addVertex((Matrix4fc)var2, var23, var24, 0.0F).setColor(var12);
         var1.addVertex((Matrix4fc)var2, var25, var26, 0.0F).setColor(var30);
         var1.addVertex((Matrix4fc)var2, var27, var28, 0.0F).setColor(var30);
         var31++;
         if (var9 == null) {
            break;
         }
      }
   }

   private final void a(
      VertexConsumer var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8,
      float var9
   ) {
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      int var11 = Math.max(16, (int)(var5 * 1.5F));
      String var10 = var10000;
      float var12 = var7 / var11;
      int var13 = var8.o();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var14 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var8.q(), var8.r(), var8.s(), 0.0F
      );
      int var15 = var14.o();
      float var16 = var9 / 2;
      float var17 = 1.5F;
      int var18 = 0;

      while (var18 < var11) {
         double var19 = Math.toRadians(var6 + var18 * var12);
         double var21 = Math.toRadians(var6 + (var18 + 1) * var12);
         float var23 = (float)Math.cos(var19);
         float var24 = (float)Math.sin(var19);
         float var25 = (float)Math.cos(var21);
         float var26 = (float)Math.sin(var21);
         float var27 = var3 + var23 * (var5 - var16);
         float var28 = var4 + var24 * (var5 - var16);
         float var29 = var3 + var25 * (var5 - var16);
         float var30 = var4 + var26 * (var5 - var16);
         float var31 = var3 + var23 * (var5 + var16);
         float var32 = var4 + var24 * (var5 + var16);
         float var33 = var3 + var25 * (var5 + var16);
         float var34 = var4 + var26 * (var5 + var16);
         var1.addVertex((Matrix4fc)var2, var27, var28, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var31, var32, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var29, var30, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var29, var30, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var31, var32, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var33, var34, 0.0F).setColor(var13);
         float var35 = var3 + var23 * (var5 - var16 - var17);
         float var36 = var4 + var24 * (var5 - var16 - var17);
         float var37 = var3 + var25 * (var5 - var16 - var17);
         float var38 = var4 + var26 * (var5 - var16 - var17);
         float var39 = var3 + var23 * (var5 + var16 + var17);
         float var40 = var4 + var24 * (var5 + var16 + var17);
         float var41 = var3 + var25 * (var5 + var16 + var17);
         float var42 = var4 + var26 * (var5 + var16 + var17);
         var1.addVertex((Matrix4fc)var2, var35, var36, 0.0F).setColor(var15);
         var1.addVertex((Matrix4fc)var2, var27, var28, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var37, var38, 0.0F).setColor(var15);
         var1.addVertex((Matrix4fc)var2, var37, var38, 0.0F).setColor(var15);
         var1.addVertex((Matrix4fc)var2, var27, var28, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var29, var30, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var31, var32, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var39, var40, 0.0F).setColor(var15);
         var1.addVertex((Matrix4fc)var2, var33, var34, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var33, var34, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var39, var40, 0.0F).setColor(var15);
         var1.addVertex((Matrix4fc)var2, var41, var42, 0.0F).setColor(var15);
         var18++;
         if (var10 == null) {
            break;
         }
      }
   }

   private final void a(
      VertexConsumer var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8,
      boolean var9
   ) {
      int var11 = var7.o();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var12 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var7.q(), var7.r(), var7.s(), 0.0F
      );
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      int var13 = var12.o();
      float var14 = var8 / 2;
      String var10 = var10000;
      float var15 = 1.5F;
      if (var10 != null) {
         if (var9) {
            var1.addVertex((Matrix4fc)var2, var3, var4 - var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var5, var6 - var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var5, var6 + var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var3, var4 - var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var5, var6 + var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var3, var4 + var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var3, var4 - var14 - var15, 0.0F).setColor(var13);
            var1.addVertex((Matrix4fc)var2, var5, var6 - var14 - var15, 0.0F).setColor(var13);
            var1.addVertex((Matrix4fc)var2, var5, var6 - var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var3, var4 - var14 - var15, 0.0F).setColor(var13);
            var1.addVertex((Matrix4fc)var2, var5, var6 - var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var3, var4 - var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var3, var4 + var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var5, var6 + var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var5, var6 + var14 + var15, 0.0F).setColor(var13);
            var1.addVertex((Matrix4fc)var2, var3, var4 + var14, 0.0F).setColor(var11);
            var1.addVertex((Matrix4fc)var2, var5, var6 + var14 + var15, 0.0F).setColor(var13);
            var1.addVertex((Matrix4fc)var2, var3, var4 + var14 + var15, 0.0F).setColor(var13);
            return;
         }

         var1.addVertex((Matrix4fc)var2, var3 - var14, var4, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var3 + var14, var4, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var5 + var14, var6, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var3 - var14, var4, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var5 + var14, var6, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var5 - var14, var6, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var3 - var14 - var15, var4, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var3 - var14, var4, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var5 - var14, var6, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var3 - var14 - var15, var4, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var5 - var14, var6, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var5 - var14 - var15, var6, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var3 + var14, var4, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var3 + var14 + var15, var4, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var5 + var14 + var15, var6, 0.0F).setColor(var13);
         var1.addVertex((Matrix4fc)var2, var3 + var14, var4, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var5 + var14 + var15, var6, 0.0F).setColor(var13);
      }

      var1.addVertex((Matrix4fc)var2, var5 + var14, var6, 0.0F).setColor(var11);
   }

   private final void c(
      VertexConsumer var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8
   ) {
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      float var10 = var7 / var5;
      int var11 = var8.o();
      int var12 = 0;
      int var13 = (int)var5;
      String var9 = var10000;

      while (var12 < var13) {
         double var14 = Math.toRadians(var6 + var12 * var10);
         double var16 = Math.toRadians(var6 + (var12 + 1) * var10);
         float var18 = (float)(Math.cos(var14) * var5);
         float var19 = (float)(Math.sin(var14) * var5);
         float var20 = (float)(Math.cos(var16) * var5);
         float var21 = (float)(Math.sin(var16) * var5);
         var1.addVertex((Matrix4fc)var2, var3, var4, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var3 + var18, var4 + var19, 0.0F).setColor(var11);
         var1.addVertex((Matrix4fc)var2, var3 + var20, var4 + var21, 0.0F).setColor(var11);
         var12++;
         if (var9 == null) {
            break;
         }
      }
   }

   private final void d(
      VertexConsumer var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8
   ) {
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      float var10 = var7 / var5;
      String var9 = var10000;
      int var11 = var8.o();
      int var12 = 0;
      int var13 = (int)var5;

      while (var12 < var13) {
         double var14 = Math.toRadians(var6 + var12 * var10);
         float var16 = (float)(Math.cos(var14) * var5);
         float var17 = (float)(Math.sin(var14) * var5);
         var1.addVertex((Matrix4fc)var2, var3 + var16, var4 + var17, 0.0F).setColor(var11);
         var12++;
         if (var9 == null) {
            break;
         }
      }
   }

   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28397;
      var10002 = -23352;
      Intrinsics.checkNotNullParameter(var8, "outlineColor");
      float var9 = var4 - var2;
      float var10 = var5 - var3;
      this.a(var1, var2, var3, var9, var10, var6, var8, var7);
   }

   @JvmOverloads
   public final void b(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = var7.a(var8);
      this.a(var1, var2, var3, var4, var5, var6, var9);
   }

   public final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      float var7
   ) {
      short var10001 = 28399;
      short var10002 = 24140;
      Intrinsics.checkNotNullParameter(var6, "color");
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = var6.a(var7);
      this.a(var1, var2, var3, var4, var5, var8);
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, int var7, float var8) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var7
      );
      this.b(var1, var2, var3, var4, var5, var6, var9, var8);
   }

   public final void a(float var1, float var2, float var3, float var4, float var5, int var6, float var7) {
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var6
      );
      this.a(var1, var2, var3, var4, var5, var8, var7);
   }

   @JvmOverloads
   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      this.b(var1, (float)var2, (float)var3, (float)var4, (float)var5, var6, var7, var8);
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var7
      );
      this.b(var1, var2, var3, var4, var5, var6, var8, 1.0F);
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var7, var8, var9, var10
      );
      this.b(var1, var2, var3, var4, var5, var6, var11, 1.0F);
   }

   public final void a(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var7, var8, var9, (int)(255 * var10)
      );
      this.b(var1, var2, var3, var4, var5, var6, var11, 1.0F);
   }

   @JvmOverloads
   public final void c(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8
   ) {
      short var10001 = 28398;
      short var10002 = -30911;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      this.a(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var6, "color");
      this.a(var1, var2, var3, var4, var5, 4.0F, var6, 1.0F);
   }

   @JvmOverloads
   public final void b(
      @NotNull GuiGraphicsExtractor var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      this.a(var1, (float)var2, (float)var3, (float)var4, (float)var5, var6, var7, var8);
   }

   public final void a(@NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         var8
      );
      this.a(var1, var2, var3, var4, var5, var6, var9, var7);
   }

   @JvmOverloads
   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6,
      float var7
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var6, "color");
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c(var2, var3, var4, var4, var5, var6.o(), var7);
   }

   public final void d(
      @Nullable GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7,
      float var8
   ) {
      short var10001 = 28393;
      short var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c(var2, var3, var4, var5, var6, var7.o(), var8);
   }

   @JvmOverloads
   public final void c(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      a(this, var1, var2, var3, var4, var5, var6, var7, 0.0F, 128, null);
   }

   @JvmOverloads
   public final void d(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      b(this, var1, var2, var3, var4, var5, var6, var7, 0.0F, 128, null);
   }

   @JvmOverloads
   public final void a(
      @NotNull GuiGraphicsExtractor var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      a(this, var1, var2, var3, var4, var5, var6, var7, 0.0F, 128, null);
   }

   @JvmOverloads
   public final void e(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      c(this, var1, var2, var3, var4, var5, var6, var7, 0.0F, 128, null);
   }

   @JvmOverloads
   public final void b(
      @NotNull GuiGraphicsExtractor var1,
      int var2,
      int var3,
      int var4,
      int var5,
      float var6,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var7, "color");
      b(this, var1, var2, var3, var4, var5, var6, var7, 0.0F, 128, null);
   }

   @JvmOverloads
   public final void b(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6
   ) {
      short var10001 = 28392;
      short var10002 = -17087;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 28393;
      var10002 = -20492;
      Intrinsics.checkNotNullParameter(var6, "color");
      a(this, var1, var2, var3, var4, var5, var6, 0.0F, 64, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "j!©t¼~/0èS\u0017ã\u0005æ&²ºj\u0005Æ\r©«¼\u000bÖ/AI< [ý\u0006/\u009a\u0005¼BæBU";
      int var4 = "j!©t¼~/0èS\u0017ã\u0005æ&²ºj\u0005Æ\r©«¼\u000bÖ/AI< [ý\u0006/\u009a\u0005¼BæBU".length();
      char var1 = '\f';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 113;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 40;
                     case 1 -> 29;
                     case 2 -> 72;
                     case 3 -> 27;
                     case 4 -> 76;
                     case 5 -> 67;
                     default -> 79;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[7];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = 28395;
                     short var32 = 6096;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var10;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ùVn¬\u0013Ötù)eµ\u0010-¥\u0082\u0019\u0014\u0085\u0006\u00195ÕMMûùo\u009c";
                  var4 = "ùVn¬\u0013Ötù)eµ\u0010-¥\u0082\u0019\u0014\u0085\u0006\u00195ÕMMûùo\u009c".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 94;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28397) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 37;
            case 1 -> 197;
            case 2 -> 66;
            case 3 -> 245;
            case 4 -> 152;
            case 5 -> 51;
            case 6 -> 10;
            case 7 -> 5;
            case 8 -> 35;
            case 9 -> 107;
            case 10 -> 184;
            case 11 -> 109;
            case 12 -> 41;
            case 13 -> 181;
            case 14 -> 160;
            case 15 -> 182;
            case 16 -> 105;
            case 17 -> 59;
            case 18 -> 91;
            case 19 -> 176;
            case 20 -> 17;
            case 21 -> 40;
            case 22 -> 222;
            case 23 -> 94;
            case 24 -> 133;
            case 25 -> 13;
            case 26 -> 153;
            case 27 -> 252;
            case 28 -> 116;
            case 29 -> 163;
            case 30 -> 166;
            case 31 -> 180;
            case 32 -> 203;
            case 33 -> 2;
            case 34 -> 202;
            case 35 -> 52;
            case 36 -> 250;
            case 37 -> 15;
            case 38 -> 131;
            case 39 -> 204;
            case 40 -> 79;
            case 41 -> 122;
            case 42 -> 89;
            case 43 -> 43;
            case 44 -> 130;
            case 45 -> 226;
            case 46 -> 134;
            case 47 -> 115;
            case 48 -> 7;
            case 49 -> 11;
            case 50 -> 85;
            case 51 -> 108;
            case 52 -> 14;
            case 53 -> 33;
            case 54 -> 8;
            case 55 -> 96;
            case 56 -> 242;
            case 57 -> 88;
            case 58 -> 243;
            case 59 -> 125;
            case 60 -> 126;
            case 61 -> 20;
            case 62 -> 239;
            case 63 -> 185;
            case 64 -> 139;
            case 65 -> 42;
            case 66 -> 90;
            case 67 -> 73;
            case 68 -> 30;
            case 69 -> 200;
            case 70 -> 72;
            case 71 -> 19;
            case 72 -> 244;
            case 73 -> 27;
            case 74 -> 16;
            case 75 -> 69;
            case 76 -> 149;
            case 77 -> 54;
            case 78 -> 169;
            case 79 -> 140;
            case 80 -> 240;
            case 81 -> 136;
            case 82 -> 70;
            case 83 -> 58;
            case 84 -> 221;
            case 85 -> 155;
            case 86 -> 230;
            case 87 -> 111;
            case 88 -> 53;
            case 89 -> 113;
            case 90 -> 213;
            case 91 -> 148;
            case 92 -> 114;
            case 93 -> 28;
            case 94 -> 215;
            case 95 -> 198;
            case 96 -> 26;
            case 97 -> 4;
            case 98 -> 141;
            case 99 -> 156;
            case 100 -> 190;
            case 101 -> 172;
            case 102 -> 34;
            case 103 -> 175;
            case 104 -> 32;
            case 105 -> 138;
            case 106 -> 101;
            case 107 -> 68;
            case 108 -> 143;
            case 109 -> 9;
            case 110 -> 228;
            case 111 -> 46;
            case 112 -> 56;
            case 113 -> 168;
            case 114 -> 18;
            case 115 -> 201;
            case 116 -> 45;
            case 117 -> 194;
            case 118 -> 192;
            case 119 -> 82;
            case 120 -> 216;
            case 121 -> 112;
            case 122 -> 233;
            case 123 -> 24;
            case 124 -> 106;
            case 125 -> 57;
            case 126 -> 23;
            case 127 -> 207;
            case 128 -> 121;
            case 129 -> 36;
            case 130 -> 173;
            case 131 -> 246;
            case 132 -> 104;
            case 133 -> 61;
            case 134 -> 102;
            case 135 -> 205;
            case 136 -> 191;
            case 137 -> 251;
            case 138 -> 236;
            case 139 -> 47;
            case 140 -> 195;
            case 141 -> 0;
            case 142 -> 81;
            case 143 -> 86;
            case 144 -> 3;
            case 145 -> 170;
            case 146 -> 64;
            case 147 -> 124;
            case 148 -> 206;
            case 149 -> 142;
            case 150 -> 247;
            case 151 -> 12;
            case 152 -> 67;
            case 153 -> 186;
            case 154 -> 229;
            case 155 -> 248;
            case 156 -> 63;
            case 157 -> 21;
            case 158 -> 87;
            case 159 -> 80;
            case 160 -> 220;
            case 161 -> 145;
            case 162 -> 144;
            case 163 -> 127;
            case 164 -> 123;
            case 165 -> 129;
            case 166 -> 128;
            case 167 -> 147;
            case 168 -> 93;
            case 169 -> 62;
            case 170 -> 199;
            case 171 -> 189;
            case 172 -> 76;
            case 173 -> 31;
            case 174 -> 255;
            case 175 -> 71;
            case 176 -> 49;
            case 177 -> 225;
            case 178 -> 98;
            case 179 -> 135;
            case 180 -> 38;
            case 181 -> 171;
            case 182 -> 231;
            case 183 -> 217;
            case 184 -> 159;
            case 185 -> 120;
            case 186 -> 84;
            case 187 -> 50;
            case 188 -> 249;
            case 189 -> 161;
            case 190 -> 167;
            case 191 -> 117;
            case 192 -> 224;
            case 193 -> 151;
            case 194 -> 183;
            case 195 -> 219;
            case 196 -> 211;
            case 197 -> 179;
            case 198 -> 97;
            case 199 -> 214;
            case 200 -> 60;
            case 201 -> 95;
            case 202 -> 237;
            case 203 -> 165;
            case 204 -> 150;
            case 205 -> 132;
            case 206 -> 99;
            case 207 -> 137;
            case 208 -> 44;
            case 209 -> 6;
            case 210 -> 48;
            case 211 -> 77;
            case 212 -> 55;
            case 213 -> 158;
            case 214 -> 212;
            case 215 -> 162;
            case 216 -> 227;
            case 217 -> 25;
            case 218 -> 218;
            case 219 -> 92;
            case 220 -> 178;
            case 221 -> 157;
            case 222 -> 74;
            case 223 -> 253;
            case 224 -> 65;
            case 225 -> 235;
            case 226 -> 232;
            case 227 -> 83;
            case 228 -> 188;
            case 229 -> 110;
            case 230 -> 241;
            case 231 -> 146;
            case 232 -> 187;
            case 233 -> 209;
            case 234 -> 29;
            case 235 -> 103;
            case 236 -> 174;
            case 237 -> 154;
            case 238 -> 39;
            case 239 -> 100;
            case 240 -> 254;
            case 241 -> 78;
            case 242 -> 118;
            case 243 -> 238;
            case 244 -> 196;
            case 245 -> 119;
            case 246 -> 177;
            case 247 -> 223;
            case 248 -> 193;
            case 249 -> 208;
            case 250 -> 234;
            case 251 -> 22;
            case 252 -> 75;
            case 253 -> 210;
            case 254 -> 1;
            default -> 164;
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
