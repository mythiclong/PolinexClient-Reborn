package me.octo.client.utils;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.mixin.accessors.BeaconBlockEntityRendererInvoker;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderEvents;
import net.fabricmc.fabric.api.event.Event;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.Font.DisplayMode;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.ARGB;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.profiling.Profiler;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public final class llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll {

   @NotNull
   public static llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Identifier lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Minecraft lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static ByteBufferBuilder IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static float[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   private llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll() {
   }

   public final void a() {
      short var10000 = 1453;
      LevelRenderEvents.END_MAIN.addPhaseOrdering(Event.DEFAULT_PHASE, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      short var10001 = -222;
      LevelRenderEvents.END_MAIN
         .register(
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll::b
         );
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e("RenderHelper initialized successfully");
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull float[] var3, float var4, boolean var5) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1445;
      var10002 = -27192;
      Intrinsics.checkNotNullParameter(var3, "colorComponents");
      this.b(var1, var2, var3, var4, var5);
      this.a(var1, var2, var3);
   }

   public final void b(@NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull float[] var3, float var4, boolean var5) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1445;
      var10002 = -27192;
      Intrinsics.checkNotNullParameter(var3, "colorComponents");
      this.a(var1, var2.getX(), var2.getY(), var2.getZ(), var2.getX() + 1.0, var2.getY() + 1.0, var2.getZ() + 1.0, var3, var4, var5);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull Vec3 var2, @NotNull Vec3 var3, @NotNull float[] var4, float var5, boolean var6) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1420;
      var10002 = 20342;
      Intrinsics.checkNotNullParameter(var3, "dimensions");
      var10001 = 1445;
      var10002 = -27192;
      Intrinsics.checkNotNullParameter(var4, "colorComponents");
      this.a(var1, var2.x, var2.y, var2.z, var2.x + var3.x, var2.y + var3.y, var2.z + var3.z, var4, var5, var6);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull AABB var2, @NotNull float[] var3, float var4, boolean var5) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1466;
      var10002 = 31843;
      Intrinsics.checkNotNullParameter(var2, "box");
      var10001 = 1459;
      var10002 = -676;
      Intrinsics.checkNotNullParameter(var3, "colorComponents");
      this.a(var1, var2.minX, var2.minY, var2.minZ, var2.maxX, var2.maxY, var2.maxZ, var3, var4, var5);
   }

   public final void a(
      @NotNull LevelRenderContext param1,
      double param2,
      double param4,
      double param6,
      double param8,
      double param10,
      double param12,
      @NotNull float[] param14,
      float param15,
      boolean param16
   ) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param14, "colorComponents");
      if (param16) {
         if (llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.a(param2, param4, param6, param8, param10, param12)) {
            this.b(param1, param2, param4, param6, param8, param10, param12, param14, param15, true);
         }
      } else {
         IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll var17 = IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
         Intrinsics.checkNotNull(var17);
         if (var17.a(param2, param4, param6, param8, param10, param12)) {
            this.b(param1, param2, param4, param6, param8, param10, param12, param14, param15, false);
         }
      }
   }

   private final void b(
      LevelRenderContext param1,
      double param2,
      double param4,
      double param6,
      double param8,
      double param10,
      double param12,
      float[] param14,
      float param15,
      boolean param16
   ) {
      PoseStack var17 = param1.poseStack();
      if (var17 == null) {
         return;
      }
      Vec3 var18 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera().position();
      Intrinsics.checkNotNullExpressionValue(var18, "position(...)");
      double var19 = (param2 + param8) / 2.0;
      double var21 = (param4 + param10) / 2.0;
      double var23 = (param6 + param12) / 2.0;
      double var25 = var19 - var18.x;
      double var27 = var21 - var18.y;
      double var29 = var23 - var18.z;
      double var31 = Math.sqrt(var25 * var25 + var27 * var27 + var29 * var29);
      float var33 = RangesKt.coerceIn((float)((double)param15 / (1.0 + var31 * 0.008)), 0.05F, param15);
      var17.pushPose();
      var17.translate(-var18.x, -var18.y, -var18.z);
      MultiBufferSource.BufferSource var34 = param1.bufferSource();
      if (var34 == null) {
         return;
      }
      RenderType var35 = param16 ? lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b() : lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
      VertexConsumer var36 = var34.getBuffer(var35);
      Intrinsics.checkNotNullExpressionValue(var36, "getBuffer(...)");
      IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var17, var36, (float)param2, (float)param4, (float)param6, (float)param8, (float)param10, (float)param12, param14[0], param14[1], param14[2], var33);
      var17.popPose();
   }

   public final void a(@NotNull LevelRenderContext param1, @NotNull BlockPos param2, @NotNull float[] param3) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param2, "pos");
      Intrinsics.checkNotNullParameter(param3, "colorComponents");
      if (!llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.a(param2.getX(), param2.getY(), param2.getZ(), (double)param2.getX() + 1.0, 319.0, (double)param2.getZ() + 1.0)) {
         return;
      }
      PoseStack var4 = param1.poseStack();
      if (var4 == null) {
         return;
      }
      Vec3 var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera().position();
      Intrinsics.checkNotNullExpressionValue(var5, "position(...)");
      MultiBufferSource.BufferSource var6 = param1.bufferSource();
      if (var6 == null) {
         return;
      }
      var4.pushPose();
      var4.translate((double)param2.getX() - var5.x, (double)param2.getY() - var5.y, (double)param2.getZ() - var5.z);
      float var7 = (float)var5.subtract(param2.getCenter()).horizontalDistance();
      LocalPlayer var12 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player;
      boolean var8 = var12 != null && var12.isScoping();
      float var9 = var8 ? 1.0F : Math.max(1.0F, var7 / 96.0F);
      float var10 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.getDeltaTracker().getGameTimeDeltaPartialTick(true);
      ClientLevel var13 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.level;
      long var11 = var13 != null ? var13.getGameTime() : 0L;
      BeaconBlockEntityRendererInvoker.renderBeam(var4, var6, var10, var9, var11, 0, 319, ARGB.colorFromFloat(1.0F, param3[0], param3[1], param3[2]));
      var4.popPose();
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull float[] var3, double var4, boolean var6) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1445;
      var10002 = -27192;
      Intrinsics.checkNotNullParameter(var3, "colorComponents");
      this.a(var1, var2.getX(), var2.getY(), var2.getZ(), var2.getX() + 1.0, var2.getY() + 1.0, var2.getZ() + 1.0, var3, 1.0F, var4, var6);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull Vec3 var2, @NotNull Vec3 var3, @NotNull float[] var4, double var5, boolean var7) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1420;
      var10002 = 20342;
      Intrinsics.checkNotNullParameter(var3, "dimensions");
      var10001 = 1445;
      var10002 = -27192;
      Intrinsics.checkNotNullParameter(var4, "colorComponents");
      this.a(var1, var2.x, var2.y, var2.z, var2.x + var3.x, var2.y + var3.y, var2.z + var3.z, var4, 1.0F, var5, var7);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull AABB var2, @NotNull float[] var3, double var4, boolean var6) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1458;
      var10002 = -31488;
      Intrinsics.checkNotNullParameter(var2, "box");
      var10001 = 1445;
      var10002 = -27192;
      Intrinsics.checkNotNullParameter(var3, "colorComponents");
      this.a(var1, var2, var3, 1.0F, var4, var6);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull AABB var2, @NotNull float[] var3, float var4, double var5, boolean var7) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1458;
      var10002 = -31488;
      Intrinsics.checkNotNullParameter(var2, "box");
      var10001 = 1445;
      var10002 = -27192;
      Intrinsics.checkNotNullParameter(var3, "colorComponents");
      this.a(var1, var2.minX, var2.minY, var2.minZ, var2.maxX, var2.maxY, var2.maxZ, var3, var4, var5, var7);
   }

   public final void a(
      @NotNull LevelRenderContext param1,
      double param2,
      double param4,
      double param6,
      double param8,
      double param10,
      double param12,
      @NotNull float[] param14,
      float param15,
      double param16,
      boolean param18
   ) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param14, "colorComponents");
      if (!llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.a(param2, param4, param6, param8, param10, param12)) {
         return;
      }
      PoseStack var19 = param1.poseStack();
      if (var19 == null) {
         return;
      }
      Vec3 var20 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera().position();
      Intrinsics.checkNotNullExpressionValue(var20, "position(...)");
      double var21 = (param2 + param8) / 2.0;
      double var23 = (param4 + param10) / 2.0;
      double var25 = (param6 + param12) / 2.0;
      double var27 = var21 - var20.x;
      double var29 = var23 - var20.y;
      double var31 = var25 - var20.z;
      double var33 = Math.sqrt(var27 * var27 + var29 * var29 + var31 * var31);
      double var35 = RangesKt.coerceIn(param16 / (var33 * 0.025 + 1.0), 0.5, 5.0);
      var19.pushPose();
      var19.translate(-var20.x, -var20.y, -var20.z);
      MultiBufferSource.BufferSource var37 = param1.bufferSource();
      if (var37 == null) {
         return;
      }
      RenderType var38 = param18 ? lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var35) : lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var35);
      VertexConsumer var39 = var37.getBuffer(var38);
      Intrinsics.checkNotNullExpressionValue(var39, "getBuffer(...)");
      IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var19, var39, param2, param4, param6, param8, param10, param12, param14[0], param14[1], param14[2], param15);
      var37.endBatch(var38);
      var19.popPose();
   }

   public final void a(@NotNull LevelRenderContext param1, @NotNull Vec3[] param2, @NotNull float[] param3, float param4, double param5, boolean param7) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param2, "points");
      Intrinsics.checkNotNullParameter(param3, "colorComponents");
      Vec3 var8 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera().position();
      Intrinsics.checkNotNullExpressionValue(var8, "position(...)");
      PoseStack var9 = param1.poseStack();
      if (var9 == null) {
         return;
      }
      double var10 = 0.0;
      for (int var12 = 0; var12 < param2.length; var12++) {
         Vec3 var13 = param2[var12];
         double var14 = var13.x - var8.x;
         double var16 = var13.y - var8.y;
         double var18 = var13.z - var8.z;
         double var20 = Math.sqrt(var14 * var14 + var16 * var16 + var18 * var18);
         var10 += var20;
      }
      double var21 = var10 / (double)param2.length;
      double var23 = RangesKt.coerceIn(param5 / (var21 * 0.025 + 1.0), 0.5, 5.0);
      var9.pushPose();
      var9.translate(-var8.x, -var8.y, -var8.z);
      PoseStack.Pose var25 = var9.last();
      Intrinsics.checkNotNullExpressionValue(var25, "last(...)");
      MultiBufferSource.BufferSource var26 = param1.bufferSource();
      if (var26 == null) {
         return;
      }
      RenderType var27 = param7 ? lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var23) : lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var23);
      VertexConsumer var28 = var26.getBuffer(var27);
      Intrinsics.checkNotNullExpressionValue(var28, "getBuffer(...)");
      for (int var29 = 0; var29 < param2.length; var29++) {
         int var30 = var29 + 1 == param2.length ? var29 - 1 : var29 + 1;
         Vector3f var31 = param2[var30].toVector3f().sub((float)param2[var29].x, (float)param2[var29].y, (float)param2[var29].z).normalize();
         if (var29 + 1 == param2.length) {
            var31.negate();
         }
         var28.addVertex(var25, (float)param2[var29].x, (float)param2[var29].y, (float)param2[var29].z).setColor(param3[0], param3[1], param3[2], param4).setNormal(var25, var31).setLineWidth(1.0F);
      }
      var26.endBatch(var27);
      var9.popPose();
   }

   public final void a(@NotNull LevelRenderContext param1, @NotNull Vec3 param2, @NotNull float[] param3, float param4, double param5) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param2, "point");
      Intrinsics.checkNotNullParameter(param3, "colorComponents");
      Camera var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera();
      Intrinsics.checkNotNullExpressionValue(var7, "getMainCamera(...)");
      Vec3 var8 = var7.position();
      Intrinsics.checkNotNullExpressionValue(var8, "position(...)");
      PoseStack var9 = param1.poseStack();
      if (var9 == null) {
         return;
      }
      double var10 = param2.x - var8.x;
      double var12 = param2.y - var8.y;
      double var14 = param2.z - var8.z;
      double var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
      double var18 = RangesKt.coerceIn(param5 / (var16 * 0.025 + 1.0), 0.5, 5.0);
      var9.pushPose();
      var9.translate(-var8.x, -var8.y, -var8.z);
      PoseStack.Pose var20 = var9.last();
      Intrinsics.checkNotNullExpressionValue(var20, "last(...)");
      MultiBufferSource.BufferSource var21 = param1.bufferSource();
      if (var21 == null) {
         return;
      }
      RenderType var22 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var18);
      VertexConsumer var23 = var21.getBuffer(var22);
      Intrinsics.checkNotNullExpressionValue(var23, "getBuffer(...)");
      Vec3 var24 = var8.add(Vec3.directionFromRotation(var7.xRot(), var7.yRot()));
      Intrinsics.checkNotNullExpressionValue(var24, "add(...)");
      Vector3f var25 = param2.toVector3f().sub((float)var24.x, (float)var24.y, (float)var24.z).normalize();
      var23.addVertex(var20, (float)var24.x, (float)var24.y, (float)var24.z).setColor(param3[0], param3[1], param3[2], param4).setNormal(var20, var25).setLineWidth(1.0F);
      var23.addVertex(var20, (float)param2.x, (float)param2.y, (float)param2.z).setColor(param3[0], param3[1], param3[2], param4).setNormal(var20, var25).setLineWidth(1.0F);
      var21.endBatch(var22);
      var9.popPose();
   }

   public final void a(@NotNull LevelRenderContext param1, @NotNull Vec3[] param2, @NotNull float[] param3, float param4, boolean param5) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param2, "points");
      Intrinsics.checkNotNullParameter(param3, "colorComponents");
      Matrix4f var6 = new Matrix4f();
      Vec3 var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera().position();
      Intrinsics.checkNotNullExpressionValue(var7, "position(...)");
      double var8 = 0.0;
      for (Vec3 var10 : param2) {
         var8 += var10.x;
      }
      double var11 = var8 / (double)param2.length;
      double var13 = 0.0;
      for (Vec3 var15 : param2) {
         var13 += var15.y;
      }
      double var16 = var13 / (double)param2.length;
      double var18 = 0.0;
      for (Vec3 var20 : param2) {
         var18 += var20.z;
      }
      double var21 = var18 / (double)param2.length;
      double var23 = var11 - var7.x;
      double var25 = var16 - var7.y;
      double var27 = var21 - var7.z;
      double var29 = Math.sqrt(var23 * var23 + var25 * var25 + var27 * var27);
      float var31 = RangesKt.coerceIn((float)((double)param4 / (1.0 + var29 * 0.008)), 0.05F, param4);
      var6.translate(-(float)var7.x, -(float)var7.y, -(float)var7.z);
      MultiBufferSource.BufferSource var32 = param1.bufferSource();
      if (var32 == null) {
         return;
      }
      RenderType var33 = param5 ? lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d() : lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
      VertexConsumer var34 = var32.getBuffer(var33);
      Intrinsics.checkNotNullExpressionValue(var34, "getBuffer(...)");
      for (int var35 = 0; var35 < 4; var35++) {
         var34.addVertex((Matrix4fc)var6, (float)param2[var35].x, (float)param2[var35].y, (float)param2[var35].z).setColor(param3[0], param3[1], param3[2], var31);
      }
      var32.endBatch(var33);
   }

   public final void a(
      @NotNull LevelRenderContext param1,
      @NotNull Vec3 param2,
      float param3,
      float param4,
      float param5,
      float param6,
      @NotNull Vec3 param7,
      @NotNull Identifier param8,
      @NotNull float[] param9,
      float param10,
      boolean param11
   ) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param2, "pos");
      Intrinsics.checkNotNullParameter(param7, "renderOffset");
      Intrinsics.checkNotNullParameter(param8, "texture");
      Intrinsics.checkNotNullParameter(param9, "shaderColor");
      Matrix4f var12 = new Matrix4f();
      Camera var13 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera();
      Intrinsics.checkNotNullExpressionValue(var13, "getMainCamera(...)");
      Vec3 var14 = var13.position();
      Intrinsics.checkNotNullExpressionValue(var14, "position(...)");
      var12.translate((float)(param2.x - var14.x), (float)(param2.y - var14.y), (float)(param2.z - var14.z)).rotate((Quaternionfc)var13.rotation());
      MultiBufferSource.BufferSource var15 = param1.bufferSource();
      if (var15 == null) {
         return;
      }
      RenderType var16 = param11 ? lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param8) : lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param8);
      VertexConsumer var17 = var15.getBuffer(var16);
      Intrinsics.checkNotNullExpressionValue(var17, "getBuffer(...)");
      int var18 = ARGB.colorFromFloat(param10, param9[0], param9[1], param9[2]);
      var17.addVertex((Matrix4fc)var12, (float)param7.x, (float)param7.y, (float)param7.z).setUv(1.0F, 1.0F - param6).setColor(var18);
      var17.addVertex((Matrix4fc)var12, (float)param7.x, (float)(param7.y + (double)param4), (float)param7.z).setUv(1.0F, 1.0F).setColor(var18);
      var17.addVertex((Matrix4fc)var12, (float)(param7.x + (double)param3), (float)(param7.y + (double)param4), (float)param7.z).setUv(1.0F - param5, 1.0F).setColor(var18);
      var17.addVertex((Matrix4fc)var12, (float)(param7.x + (double)param3), (float)param7.y, (float)param7.z).setUv(1.0F - param5, 1.0F - param6).setColor(var18);
      var15.endBatch(var16);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull Component var2, @NotNull Vec3 var3, boolean var4) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1411;
      var10002 = -22417;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var3, "pos");
      this.a(var1, var2, var3, 1.0F, var4);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull Component var2, @NotNull Vec3 var3, float var4, boolean var5) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1411;
      var10002 = -22417;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var3, "pos");
      this.a(var1, var2, var3, var4, 0.0F, var5);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull Component var2, @NotNull Vec3 var3, float var4, float var5, boolean var6) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1446;
      var10002 = 29295;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var3, "pos");
      FormattedCharSequence var11 = var2.getVisualOrderText();
      short var10004 = 1467;
      short var10005 = 19135;
      Intrinsics.checkNotNullExpressionValue(var11, "getVisualOrderText(...)");
      this.a(var1, var11, var3, var4, var5, var6);
   }

   public final void a(@NotNull LevelRenderContext var1, @NotNull FormattedCharSequence var2, @NotNull Vec3 var3, float var4, float var5, boolean var6) {
      float var32 = 0.0F; // PX-FIX
      float var28 = 0; // PX-FIX
      Object var21 = null; // PX-FIX
      Font var18 = null; // PX-FIX
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1411;
      var10002 = -22417;
      Intrinsics.checkNotNullParameter(var2, "text");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var3, "pos");
      Matrix4f var7 = new Matrix4f();
      Camera var10000 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera();
      var10002 = 1410;
      short var10003 = 32683;
      Intrinsics.checkNotNullExpressionValue(var10000, "getMainCamera(...)");
      Camera var8 = var10000;
      Vec3 var15 = var8.position();
      var10002 = 1421;
      var10003 = -23422;
      Intrinsics.checkNotNullExpressionValue(var15, "position(...)");
      Vec3 var9 = var15;
      Font var16 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.font;
      var10002 = 1454;
      var10003 = -16438;
      Intrinsics.checkNotNullExpressionValue(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.font, "font");
      Font var10 = var16;
      float var11 = var4 * 0.025F;
      var7.translate((float)(var3.x - var9.x), (float)(var3.y - var9.y), (float)(var3.z - var9.z))
         .rotate((Quaternionfc)var8.rotation())
         .scale(var11, -var11, var11);
      float var12 = -var10.width(var2) / 2.0F;
      BufferSource var17 = MultiBufferSource.immediate(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      var10002 = 1456;
      var10003 = -16264;
      Intrinsics.checkNotNullExpressionValue(var17, "immediate(...)");
      BufferSource var13 = var17;

      byte var10004;
      boolean var10005;
      Matrix4fc var10006;
      MultiBufferSource var10007;
      DisplayMode var10008;
      label17: {
         try {
            var18 = var10;
            var21 = var2;
            var28 = var12;
            var32 = var5;
            var10004 = -1;
            var10005 = false;
            var10006 = (Matrix4fc)var7;
            var10007 = var13;
            if (var6) {
               var10008 = DisplayMode.SEE_THROUGH;
               break label17;
            }
         } catch (UnsupportedOperationException var14) {
            throw (RuntimeException)a(var14);
         }

         var10008 = DisplayMode.NORMAL;
      }

      var18.drawInBatch(String.valueOf(var21), var28, var32, var10004, var10005, var10006, var10007, var10008, 0, 15728880);
      var13.endBatch();
   }

   public final void a(@NotNull LevelRenderContext param1, @NotNull Vec3 param2, float param3, float param4, int param5, int param6) {
      Intrinsics.checkNotNullParameter(param1, "context");
      Intrinsics.checkNotNullParameter(param2, "centre");
      PoseStack var7 = param1.poseStack();
      if (var7 == null) {
         return;
      }
      Vec3 var8 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera().position();
      Intrinsics.checkNotNullExpressionValue(var8, "position(...)");
      double var9 = param2.x - var8.x;
      double var11 = param2.y - var8.y;
      double var13 = param2.z - var8.z;
      double var15 = Math.sqrt(var9 * var9 + var11 * var11 + var13 * var13);
      double var17 = RangesKt.coerceIn(1.0 / (1.0 + var15 * 0.01), 0.3, 1.0);
      float var19 = (float)(param6 >> 16 & 255) / 255.0F;
      float var20 = (float)(param6 >> 8 & 255) / 255.0F;
      float var21 = (float)(param6 & 255) / 255.0F;
      float var22 = (float)((float)(param6 >> 24 & 255) / 255.0F * var17);
      int var23 = ARGB.colorFromFloat(var22, var19, var20, var21);
      var7.pushPose();
      var7.translate(-var8.x, -var8.y, -var8.z);
      MultiBufferSource.BufferSource var24 = param1.bufferSource();
      if (var24 == null) {
         return;
      }
      VertexConsumer var25 = var24.getBuffer(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e());
      Intrinsics.checkNotNullExpressionValue(var25, "getBuffer(...)");
      Matrix4f var26 = var7.last().pose();
      Intrinsics.checkNotNullExpressionValue(var26, "pose(...)");
      float var27 = param4 / 2.0F;
      for (int var28 = 0; var28 <= param5; var28++) {
         double var29 = (Math.PI * 2) * (double)var28 / (double)param5;
         float var30 = (float)(Math.cos(var29) * (double)param3);
         float var31 = (float)(Math.sin(var29) * (double)param3);
         var25.addVertex(var26, (float)param2.x + var30, (float)param2.y + var27, (float)param2.z + var31).setColor(var23);
         var25.addVertex(var26, (float)param2.x + var30, (float)param2.y - var27, (float)param2.z + var31).setColor(var23);
      }
      var7.popPose();
   }

   private final void a(LevelRenderContext param1) {
      ProfilerFiller var2 = Profiler.get();
      Intrinsics.checkNotNullExpressionValue(var2, "get(...)");
      var2.push("skyblockerTranslucentDraw");
      MultiBufferSource.BufferSource var3 = param1.bufferSource();
      if (var3 == null) {
         return;
      } else {
         var3.endBatch();
         var2.pop();
      }
   }

   public final void a(@NotNull Runnable param1) {
      Intrinsics.checkNotNullParameter(param1, "runnable");
      if (RenderSystem.isOnRenderThread()) {
         param1.run();
      } else {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.execute(param1);
      }
   }

   @NotNull
   public final AABB a(@NotNull ClientLevel var1, @NotNull BlockPos var2) {
      short var10001 = 1414;
      short var10002 = -3167;
      Intrinsics.checkNotNullParameter(var1, "world");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      BlockState var5 = var1.getBlockState(var2);
      short var10004 = 1468;
      short var10005 = -16233;
      Intrinsics.checkNotNullExpressionValue(var5, "getBlockState(...)");
      return this.a(var1, var5, var2);
   }

   @NotNull
   public final AABB a(@NotNull ClientLevel var1, @NotNull BlockState var2, @NotNull BlockPos var3) {
      short var10001 = 1423;
      short var10002 = 10938;
      Intrinsics.checkNotNullParameter(var1, "world");
      var10001 = 1441;
      var10002 = 30334;
      Intrinsics.checkNotNullParameter(var2, "state");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var3, "pos");

      AABB var4;
      try {
         var4 = var2.getShape(var1, var3).singleEncompassing().bounds().move(var3);
         Intrinsics.checkNotNull(var4);
         var4 = var4;
      } catch (UnsupportedOperationException var6) {
         var4 = new AABB(var3);
      }

      return var4;
   }

   private final void b() {
      LocalPlayer var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player;
      if (var1 != null) {
         var1.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 100.0F, 0.1F);
      }
   }

   public final boolean a(double param1, double param3, double param5, double param7, double param9, double param11) {
      return param1 >= param5 && param1 <= param9 && param3 >= param7 && param3 <= param11;
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull BlockPos var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      boolean var4
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var5 = new float[]{var3.q(), var3.r(), var3.s()};
      this.b(var1, var2, var5, var3.t(), var4);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Vec3 var2,
      @NotNull Vec3 var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      boolean var5
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1420;
      var10002 = 20342;
      Intrinsics.checkNotNullParameter(var3, "dimensions");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var4, "color");
      float[] var6 = new float[]{var4.q(), var4.r(), var4.s()};
      this.a(var1, var2, var3, var6, var4.t(), var5);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull AABB var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      boolean var4
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1458;
      var10002 = -31488;
      Intrinsics.checkNotNullParameter(var2, "box");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var5 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var5, var3.t(), var4);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var14,
      boolean var15
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var14, "color");
      float[] var16 = new float[]{var14.q(), var14.r(), var14.s()};
      this.a(var1, var2, var4, var6, var8, var10, var12, var16, var14.t(), var15);
   }

   public final void b(
      @NotNull LevelRenderContext var1,
      @NotNull BlockPos var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      boolean var4
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var5 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var5, var3.t(), var4);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull BlockPos var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3
   ) {
      short var10001 = 1452;
      short var10002 = 19203;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1464;
      var10002 = 9341;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1418;
      var10002 = -22117;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var4 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var4);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull BlockPos var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      double var4,
      boolean var6
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var7 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var7, var4, var6);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Vec3 var2,
      @NotNull Vec3 var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      double var5,
      boolean var7
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1449;
      var10002 = 23145;
      Intrinsics.checkNotNullParameter(var3, "dimensions");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var4, "color");
      float[] var8 = new float[]{var4.q(), var4.r(), var4.s()};
      this.a(var1, var2, var3, var8, var5, var7);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull AABB var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      double var4,
      boolean var6
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1458;
      var10002 = -31488;
      Intrinsics.checkNotNullParameter(var2, "box");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var7 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var7, var3.t(), var4, var6);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var14,
      double var15,
      boolean var17
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var14, "color");
      float[] var18 = new float[]{var14.q(), var14.r(), var14.s()};
      this.a(var1, var2, var4, var6, var8, var10, var12, var18, var14.t(), var15, var17);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Vec3[] var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      double var4,
      boolean var6
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1416;
      var10002 = 27971;
      Intrinsics.checkNotNullParameter(var2, "points");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var7 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var7, var3.t(), var4, var6);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Vec3 var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      double var4
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1471;
      var10002 = -8452;
      Intrinsics.checkNotNullParameter(var2, "point");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var6 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var6, var3.t(), var4);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Vec3[] var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      boolean var4
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1416;
      var10002 = 27971;
      Intrinsics.checkNotNullParameter(var2, "points");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var3, "color");
      float[] var5 = new float[]{var3.q(), var3.r(), var3.s()};
      this.a(var1, var2, var5, var3.d(), var4);
   }

   public final void a(
      @NotNull LevelRenderContext var1,
      @NotNull Vec3 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      @NotNull Vec3 var7,
      @NotNull Identifier var8,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9,
      boolean var10
   ) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 1444;
      var10002 = -7392;
      Intrinsics.checkNotNullParameter(var2, "pos");
      var10001 = 1409;
      var10002 = -5697;
      Intrinsics.checkNotNullParameter(var7, "renderOffset");
      var10001 = 1451;
      var10002 = 15082;
      Intrinsics.checkNotNullParameter(var8, "texture");
      var10001 = 1463;
      var10002 = 2999;
      Intrinsics.checkNotNullParameter(var9, "color");
      float[] var11 = new float[]{var9.q(), var9.r(), var9.s()};
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var11, var9.t(), var10);
   }

   private static final void b(LevelRenderContext var0) {
      short var10001 = 1457;
      short var10002 = -2480;
      Intrinsics.checkNotNullParameter(var0, "context");
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var25 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[49];
      int var3 = 0;
      String var2 = "\u009b\u0018\nË\n\u0005\tm3\u00075\r^¼¨X\u0007£|z\u0086¬÷+¹\u0010-&4`i\u009aó\u000bI!Ëx\u001b\u0005\u0082Á\u0003=\nÄ\u000f¯\u009fø:÷\u0003¤\u0002Å\u0081\u008c¬Ù!Ï\u0004¡ØØ\u0082\tûÛ\u0083f>\u009dÍRØ\f{\u008eSX×\u0014uüÍ(R\u0017\n»Ì\u009c\u009cF¬\u000bÃèç\u0012Ú`Ê¬¹\u009d\u001d\u0090Â:T\u008e§Ì³9ÝÁ\u0007\u0006\u008c,\bü\f(\u0007ÒýUm\u0017ªV%oÖõS\u0003uèÓ\u0093\u00adÒÂ6\u0004¨\u000e¬Èu´\u0083)ò\u001a\u0093£¦\u0003H©\u001b«c\u0098£\u0080O\u0004ó\u008cÔC\u0010&l1ûc5\r\u0000¼\u000f\u000efÚ\u0003ö\u0088\u000e+\u008c\"\u0010\u009b'óðõ¢},ïN\u0007¬±\u009aäî\u009bi\u0003K¨Q\u000f\u0018Þ\u000e\u0012)\u0006\u007f¢¾\u0095ã.4qr\b\u0013{^þr\u009bf\u001c\u0006\u0097i\u008bå:é\u000e\u0007KqÆÚ1ïÍ\u00866æ¾\u009c\u001c\u0005\u009a\t^è#\u0003@\u009dk\u000bÚ:IbzSÌ\u001d} \u0018\u0003\u0001~\u0018\u0017º¨Æ®0¿>¯Ó\u0099Í\u008aeÂ\u0015¢jÍiè'ü\u0085\u0012-»4Økûæ²#J\u0018¼®L\u0016)iÃ\u0006øÍ\u0010 ¨\u001e\t³º\u0015\u0094ìð\u0097ÿ\u0093\u0005³á\u000fôª\u0007~ô#\u0007\u001dí\u0014\f^\u0018÷\u008aCNç·\u009fA\u0018:\u00123f÷l\u001e\u0085é\u0093\\Z\u0087\u0082ÝMü\t4Ç\u0004¡\u0002ØÙ\b\u000e:P\u0082¥Öx<\u000e\u0099\u009f¢\\ b §o{Û\u0017;)\u0005°\u001d\u0093iQ\u0019í\u000b\u0016\u0014u¦MØ¹Ìoÿ@¸\u008b¹ì\u009aÈóÂ\u0011ø\u0089ù\u0006gE\u0095`ùY\b\u00910uâ\u0013Ú®½\u0005 U\tcÉ\u0019\u0088\u0096\u001b\u0092\"\u0096Ï\u001f0ù¿\nÍ\u001a£/rC\u008b\u008cÅR\u0093\u0089\u001d\n®ç>ù\u0012\u0000\u0081V¹U\r÷í\u009dr¡æ¨Ò\u001c¹¤\u0089Ó\t{s\u0093s<?\u008d\u0006Ð";
      int var4 = "\u009b\u0018\nË\n\u0005\tm3\u00075\r^¼¨X\u0007£|z\u0086¬÷+¹\u0010-&4`i\u009aó\u000bI!Ëx\u001b\u0005\u0082Á\u0003=\nÄ\u000f¯\u009fø:÷\u0003¤\u0002Å\u0081\u008c¬Ù!Ï\u0004¡ØØ\u0082\tûÛ\u0083f>\u009dÍRØ\f{\u008eSX×\u0014uüÍ(R\u0017\n»Ì\u009c\u009cF¬\u000bÃèç\u0012Ú`Ê¬¹\u009d\u001d\u0090Â:T\u008e§Ì³9ÝÁ\u0007\u0006\u008c,\bü\f(\u0007ÒýUm\u0017ªV%oÖõS\u0003uèÓ\u0093\u00adÒÂ6\u0004¨\u000e¬Èu´\u0083)ò\u001a\u0093£¦\u0003H©\u001b«c\u0098£\u0080O\u0004ó\u008cÔC\u0010&l1ûc5\r\u0000¼\u000f\u000efÚ\u0003ö\u0088\u000e+\u008c\"\u0010\u009b'óðõ¢},ïN\u0007¬±\u009aäî\u009bi\u0003K¨Q\u000f\u0018Þ\u000e\u0012)\u0006\u007f¢¾\u0095ã.4qr\b\u0013{^þr\u009bf\u001c\u0006\u0097i\u008bå:é\u000e\u0007KqÆÚ1ïÍ\u00866æ¾\u009c\u001c\u0005\u009a\t^è#\u0003@\u009dk\u000bÚ:IbzSÌ\u001d} \u0018\u0003\u0001~\u0018\u0017º¨Æ®0¿>¯Ó\u0099Í\u008aeÂ\u0015¢jÍiè'ü\u0085\u0012-»4Økûæ²#J\u0018¼®L\u0016)iÃ\u0006øÍ\u0010 ¨\u001e\t³º\u0015\u0094ìð\u0097ÿ\u0093\u0005³á\u000fôª\u0007~ô#\u0007\u001dí\u0014\f^\u0018÷\u008aCNç·\u009fA\u0018:\u00123f÷l\u001e\u0085é\u0093\\Z\u0087\u0082ÝMü\t4Ç\u0004¡\u0002ØÙ\b\u000e:P\u0082¥Öx<\u000e\u0099\u009f¢\\ b §o{Û\u0017;)\u0005°\u001d\u0093iQ\u0019í\u000b\u0016\u0014u¦MØ¹Ìoÿ@¸\u008b¹ì\u009aÈóÂ\u0011ø\u0089ù\u0006gE\u0095`ùY\b\u00910uâ\u0013Ú®½\u0005 U\tcÉ\u0019\u0088\u0096\u001b\u0092\"\u0096Ï\u001f0ù¿\nÍ\u001a£/rC\u008b\u008cÅR\u0093\u0089\u001d\n®ç>ù\u0012\u0000\u0081V¹U\r÷í\u009dr¡æ¨Ò\u001c¹¤\u0089Ó\t{s\u0093s<?\u008d\u0006Ð"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 83;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var32 = var10001.toCharArray();
               int var10004 = var32.length;
               int var6 = 0;
               byte var35 = (byte)var10000;
               var25 = var32;
               int var17 = var10004;
               byte var42;
               char[] var46;
               int var10006;
               if (var10004 <= 1) {
                  var46 = var32;
                  var42 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var35 = (byte)var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var46 = var32;
                  var42 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var46[var10006] = (char)(var46[var10006] ^ var42 ^ switch (var6 % 7) {
                     case 0 -> 114;
                     case 1 -> 25;
                     case 2 -> 25;
                     case 3 -> 62;
                     case 4 -> 97;
                     case 5 -> 123;
                     default -> 28;
                  });
                  var6++;
                  if (var35 == 0) {
                     var10006 = var35;
                     var46 = var25;
                     var42 = var35;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var46 = var25;
                     var42 = var35;
                     var10006 = var6;
                  }
               }
            }

            String var37 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var37;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[49];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll();
                     var10000 = 1424;
                     short var19 = 26123;
                     short var20 = 1455;
                     var10002 = -13077;
                     Identifier var11 = Identifier.fromNamespaceAndPath("polinex", "translucent_draw");
                     var10002 = 1415;
                     short var38 = -19156;
                     Intrinsics.checkNotNullExpressionValue(var11, "fromNamespaceAndPath(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var11;
                     Minecraft var12 = Minecraft.getInstance();
                     var10002 = 1443;
                     short var39 = 13719;
                     Intrinsics.checkNotNullExpressionValue(var12, "getInstance(...)");
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var12;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new ByteBufferBuilder(1536);
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new float[3];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var37;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "wtgHÃ\u0007¾-§f\fd_";
                  var4 = "wtgHÃ\u0007¾-§f\fd_".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 122;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   // PX-FIX SYN5: Kotlin default-arg mask bridges (jar ACC_SYNTHETIC; (name,descriptor) exact).
   // The jar opaque predicate (static int[] null check + dead UnsupportedOperationException throw)
   // was dropped; mask test, default assignment and delegation to the real instance method are kept.
   // Mask bits and default literals were read from the class bytes (javap -c): each bridge
   // loads its int mask parameter and tests (mask & 1<<slot) per defaulted slot.

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, BlockPos var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, boolean var4, int var5, Object var6) {
      if ((var5 & 8) != 0) {
         var4 = false;
      }
      var0.a(var1, var2, var3, var4);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, Vec3 var2, Vec3 var3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, boolean var5, int var6, Object var7) {
      if ((var6 & 16) != 0) {
         var5 = false;
      }
      var0.a(var1, var2, var3, var4, var5);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, AABB var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, boolean var4, int var5, Object var6) {
      if ((var5 & 8) != 0) {
         var4 = false;
      }
      var0.a(var1, var2, var3, var4);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, double var2, double var3, double var4, double var5, double var6, double var7, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8, boolean var9, int var10, Object var11) {
      if ((var10 & 256) != 0) {
         var9 = false;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void b(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, BlockPos var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, boolean var4, int var5, Object var6) {
      if ((var5 & 8) != 0) {
         var4 = false;
      }
      var0.b(var1, var2, var3, var4);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, BlockPos var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, double var4, boolean var5, int var6, Object var7) {
      if ((var6 & 8) != 0) {
         var4 = 1.0D;
      }
      if ((var6 & 16) != 0) {
         var5 = false;
      }
      var0.a(var1, var2, var3, var4, var5);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, Vec3 var2, Vec3 var3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, double var5, boolean var6, int var7, Object var8) {
      if ((var7 & 16) != 0) {
         var5 = 1.0D;
      }
      if ((var7 & 32) != 0) {
         var6 = false;
      }
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, AABB var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, double var4, boolean var5, int var6, Object var7) {
      if ((var6 & 8) != 0) {
         var4 = 1.0D;
      }
      if ((var6 & 16) != 0) {
         var5 = false;
      }
      var0.a(var1, var2, var3, var4, var5);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, double var2, double var3, double var4, double var5, double var6, double var7, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8, double var9, boolean var10, int var11, Object var12) {
      if ((var11 & 256) != 0) {
         var9 = 1.0D;
      }
      if ((var11 & 512) != 0) {
         var10 = false;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, Vec3[] var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, double var4, boolean var5, int var6, Object var7) {
      if ((var6 & 8) != 0) {
         var4 = 1.0D;
      }
      if ((var6 & 16) != 0) {
         var5 = false;
      }
      var0.a(var1, var2, var3, var4, var5);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, Vec3 var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, double var4, int var5, Object var6) {
      if ((var5 & 8) != 0) {
         var4 = 1.0D;
      }
      var0.a(var1, var2, var3, var4);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, Vec3[] var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, boolean var4, int var5, Object var6) {
      if ((var5 & 8) != 0) {
         var4 = false;
      }
      var0.a(var1, var2, var3, var4);
   }

   public static void a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var0, @NotNull LevelRenderContext var1, Vec3 var2, float var3, float var4, float var5, float var6, Vec3 var7, Identifier var8, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9, boolean var10, int var11, Object var12) {
      if ((var11 & 512) != 0) {
         var10 = false;
      }
      var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }
   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 1440) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 66;
            case 1 -> 57;
            case 2 -> 240;
            case 3 -> 150;
            case 4 -> 253;
            case 5 -> 15;
            case 6 -> 212;
            case 7 -> 120;
            case 8 -> 226;
            case 9 -> 74;
            case 10 -> 21;
            case 11 -> 141;
            case 12 -> 44;
            case 13 -> 193;
            case 14 -> 211;
            case 15 -> 100;
            case 16 -> 40;
            case 17 -> 157;
            case 18 -> 54;
            case 19 -> 166;
            case 20 -> 241;
            case 21 -> 10;
            case 22 -> 175;
            case 23 -> 133;
            case 24 -> 45;
            case 25 -> 243;
            case 26 -> 101;
            case 27 -> 128;
            case 28 -> 180;
            case 29 -> 48;
            case 30 -> 244;
            case 31 -> 167;
            case 32 -> 33;
            case 33 -> 9;
            case 34 -> 105;
            case 35 -> 132;
            case 36 -> 68;
            case 37 -> 227;
            case 38 -> 217;
            case 39 -> 151;
            case 40 -> 35;
            case 41 -> 225;
            case 42 -> 163;
            case 43 -> 170;
            case 44 -> 122;
            case 45 -> 255;
            case 46 -> 174;
            case 47 -> 147;
            case 48 -> 204;
            case 49 -> 62;
            case 50 -> 233;
            case 51 -> 221;
            case 52 -> 64;
            case 53 -> 61;
            case 54 -> 102;
            case 55 -> 0;
            case 56 -> 201;
            case 57 -> 2;
            case 58 -> 73;
            case 59 -> 118;
            case 60 -> 111;
            case 61 -> 245;
            case 62 -> 224;
            case 63 -> 67;
            case 64 -> 95;
            case 65 -> 249;
            case 66 -> 208;
            case 67 -> 50;
            case 68 -> 154;
            case 69 -> 65;
            case 70 -> 13;
            case 71 -> 42;
            case 72 -> 173;
            case 73 -> 113;
            case 74 -> 143;
            case 75 -> 60;
            case 76 -> 161;
            case 77 -> 39;
            case 78 -> 6;
            case 79 -> 192;
            case 80 -> 92;
            case 81 -> 205;
            case 82 -> 77;
            case 83 -> 16;
            case 84 -> 12;
            case 85 -> 106;
            case 86 -> 137;
            case 87 -> 28;
            case 88 -> 7;
            case 89 -> 184;
            case 90 -> 8;
            case 91 -> 131;
            case 92 -> 160;
            case 93 -> 140;
            case 94 -> 25;
            case 95 -> 112;
            case 96 -> 96;
            case 97 -> 108;
            case 98 -> 238;
            case 99 -> 24;
            case 100 -> 149;
            case 101 -> 126;
            case 102 -> 164;
            case 103 -> 4;
            case 104 -> 213;
            case 105 -> 86;
            case 106 -> 248;
            case 107 -> 247;
            case 108 -> 97;
            case 109 -> 37;
            case 110 -> 239;
            case 111 -> 186;
            case 112 -> 182;
            case 113 -> 155;
            case 114 -> 63;
            case 115 -> 29;
            case 116 -> 121;
            case 117 -> 136;
            case 118 -> 194;
            case 119 -> 203;
            case 120 -> 214;
            case 121 -> 230;
            case 122 -> 127;
            case 123 -> 197;
            case 124 -> 148;
            case 125 -> 20;
            case 126 -> 109;
            case 127 -> 178;
            case 128 -> 123;
            case 129 -> 216;
            case 130 -> 231;
            case 131 -> 168;
            case 132 -> 190;
            case 133 -> 110;
            case 134 -> 138;
            case 135 -> 99;
            case 136 -> 83;
            case 137 -> 5;
            case 138 -> 119;
            case 139 -> 53;
            case 140 -> 235;
            case 141 -> 98;
            case 142 -> 219;
            case 143 -> 139;
            case 144 -> 71;
            case 145 -> 187;
            case 146 -> 26;
            case 147 -> 144;
            case 148 -> 146;
            case 149 -> 159;
            case 150 -> 215;
            case 151 -> 171;
            case 152 -> 59;
            case 153 -> 32;
            case 154 -> 107;
            case 155 -> 195;
            case 156 -> 229;
            case 157 -> 206;
            case 158 -> 52;
            case 159 -> 27;
            case 160 -> 75;
            case 161 -> 242;
            case 162 -> 162;
            case 163 -> 80;
            case 164 -> 56;
            case 165 -> 34;
            case 166 -> 199;
            case 167 -> 1;
            case 168 -> 91;
            case 169 -> 181;
            case 170 -> 87;
            case 171 -> 70;
            case 172 -> 41;
            case 173 -> 176;
            case 174 -> 104;
            case 175 -> 251;
            case 176 -> 191;
            case 177 -> 3;
            case 178 -> 152;
            case 179 -> 142;
            case 180 -> 129;
            case 181 -> 89;
            case 182 -> 69;
            case 183 -> 88;
            case 184 -> 134;
            case 185 -> 236;
            case 186 -> 156;
            case 187 -> 223;
            case 188 -> 117;
            case 189 -> 228;
            case 190 -> 124;
            case 191 -> 49;
            case 192 -> 116;
            case 193 -> 90;
            case 194 -> 93;
            case 195 -> 30;
            case 196 -> 94;
            case 197 -> 19;
            case 198 -> 81;
            case 199 -> 196;
            case 200 -> 55;
            case 201 -> 85;
            case 202 -> 158;
            case 203 -> 177;
            case 204 -> 130;
            case 205 -> 103;
            case 206 -> 43;
            case 207 -> 188;
            case 208 -> 207;
            case 209 -> 11;
            case 210 -> 22;
            case 211 -> 82;
            case 212 -> 135;
            case 213 -> 47;
            case 214 -> 220;
            case 215 -> 36;
            case 216 -> 72;
            case 217 -> 114;
            case 218 -> 84;
            case 219 -> 51;
            case 220 -> 14;
            case 221 -> 38;
            case 222 -> 189;
            case 223 -> 18;
            case 224 -> 218;
            case 225 -> 125;
            case 226 -> 232;
            case 227 -> 31;
            case 228 -> 78;
            case 229 -> 145;
            case 230 -> 210;
            case 231 -> 79;
            case 232 -> 252;
            case 233 -> 58;
            case 234 -> 185;
            case 235 -> 198;
            case 236 -> 76;
            case 237 -> 153;
            case 238 -> 234;
            case 239 -> 254;
            case 240 -> 209;
            case 241 -> 246;
            case 242 -> 46;
            case 243 -> 115;
            case 244 -> 179;
            case 245 -> 237;
            case 246 -> 250;
            case 247 -> 17;
            case 248 -> 202;
            case 249 -> 169;
            case 250 -> 183;
            case 251 -> 172;
            case 252 -> 23;
            case 253 -> 222;
            case 254 -> 165;
            default -> 200;
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
