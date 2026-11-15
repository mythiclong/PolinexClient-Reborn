package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld

   @NotNull
   private static Lazy IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static AABB lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static AABB IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public static final boolean a() {
      Lazy var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      return (Boolean)var0.getValue();
   }

   public static final void a(
      @NotNull PoseStack param0,
      @NotNull RenderTarget param1,
      @NotNull IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl param2,
      @NotNull Camera param3,
      @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> param4
   ) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "poseStack");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "renderTarget");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param2, "mode");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param3, "camera");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param4, "draw");
      org.lwjgl.opengl.GL11C.glEnable(2848);
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var7 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1, param0, param3);
      switch (param2) {
         case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII: {
            IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var14 = var7.d();
            var7.a(IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            try {
               param4.invoke(var7);
            } finally {
               var7.a(var14);
            }
            break;
         }
         case IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl: {
            IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl var14 = var7.d();
            var7.a(IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            try {
               param4.invoke(var7);
            } finally {
               var7.a(var14);
            }
            break;
         }
         default:
            throw new kotlin.NoWhenBranchMatchedException();
      }
      var7.f();
      org.lwjgl.opengl.GL11C.glDisable(2848);
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> var1
   ) {
      short var10001 = 29416;
      short var10002 = 26561;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29424;
      var10002 = 953;
      Intrinsics.checkNotNullParameter(var1, "draw");
      boolean var2 = false;
      PoseStack var3 = var0.b();
      boolean var4 = false;
      var3.pushPose();

      try {
         boolean var6 = false;
         Vec3 var10000 = var0.c().position();
         var10002 = 29433;
         short var10003 = -9046;
         Intrinsics.checkNotNullExpressionValue(var10000, "position(...)");
         Vec3 var7 = var10000;
         var3.translate(-var7.x, -var7.y, -var7.z);
         var1.invoke(var0);
      } finally {
         InlineMarker.finallyStart(1);
         var3.popPose();
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull Vec3 var1,
      @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> var2
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29439;
      var10002 = -29004;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = 29397;
      var10002 = 4279;
      Intrinsics.checkNotNullParameter(var2, "draw");
      boolean var3 = false;
      PoseStack var4 = var0.b();
      boolean var5 = false;
      var4.pushPose();

      try {
         boolean var7 = false;
         var4.translate(var0.a(var1));
         var2.invoke(var0);
      } finally {
         InlineMarker.finallyStart(1);
         var4.popPose();
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull Vec3i var1,
      @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> var2
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29391;
      var10002 = -4237;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = 29397;
      var10002 = 4279;
      Intrinsics.checkNotNullParameter(var2, "draw");
      boolean var3 = false;
      PoseStack var4 = var0.b();
      boolean var5 = false;
      var4.pushPose();

      try {
         boolean var7 = false;
         var4.translate(var0.a(var1));
         var2.invoke(var0);
      } finally {
         InlineMarker.finallyStart(1);
         var4.popPose();
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void b(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> param1
   ) {
      Intrinsics.checkNotNullParameter(param0, "<this>");
      Intrinsics.checkNotNullParameter(param1, "draw");
      boolean flag = a();
      if (flag) {
         if (a()) {
            org.lwjgl.opengl.GL11C.glDisable(2848);
         }
      }

      try {
         param1.invoke(param0);
      } finally {
         if (flag && a()) {
            org.lwjgl.opengl.GL11C.glEnable(2848);
         }
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull AbstractTexture var1,
      @NotNull RenderPipeline var2,
      @NotNull Map<String, GpuBufferSlice> var3,
      @NotNull Function2<? super VertexConsumer, ? super Pose, Unit> var4
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29399;
      var10002 = 6239;
      Intrinsics.checkNotNullParameter(var1, "sampler0");
      var10001 = 29419;
      var10002 = 16580;
      Intrinsics.checkNotNullParameter(var2, "pipeline");
      var10001 = 29390;
      var10002 = -15961;
      Intrinsics.checkNotNullParameter(var3, "uniforms");
      var10001 = 29432;
      var10002 = -24705;
      Intrinsics.checkNotNullParameter(var4, "drawer");
      short var10000 = 29431;
      boolean var5 = false;
      var10001 = 23405;
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var6 = var0;
      String var8 = "Sampler0";
      boolean var10 = false;
      Map var15 = MapsKt.mapOf(TuplesKt.to(var8, var1));
      var10 = false;
      VertexConsumer var11 = var0.a(var2, var15, var3);

      try {
         Pose var26 = var6.b().last();
         short var10004 = 29398;
         short var10005 = 26524;
         Intrinsics.checkNotNullExpressionValue(var26, "last(...)");
         var4.invoke(var11, var26);
      } finally {
         InlineMarker.finallyStart(1);
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var11, false);
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull RenderPipeline var1,
      @NotNull Map<String, ? extends AbstractTexture> var2,
      @NotNull Map<String, GpuBufferSlice> var3,
      @NotNull Function2<? super VertexConsumer, ? super Pose, Unit> var4
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29414;
      var10002 = -17539;
      Intrinsics.checkNotNullParameter(var1, "pipeline");
      var10001 = 29376;
      var10002 = 11396;
      Intrinsics.checkNotNullParameter(var2, "textures");
      var10001 = 29430;
      var10002 = -26518;
      Intrinsics.checkNotNullParameter(var3, "uniforms");
      var10001 = 29388;
      var10002 = -30528;
      Intrinsics.checkNotNullParameter(var4, "drawer");
      boolean var5 = false;
      VertexConsumer var6 = var0.a(var1, var2, var3);

      try {
         Pose var18 = var0.b().last();
         short var10004 = 29410;
         short var10005 = -17792;
         Intrinsics.checkNotNullExpressionValue(var18, "last(...)");
         var4.invoke(var6, var18);
      } finally {
         InlineMarker.finallyStart(1);
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var6, false);
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var1,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var2,
      int var3
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29425;
      var10002 = -20059;
      Intrinsics.checkNotNullParameter(var1, "p1");
      var10001 = 29413;
      var10002 = 19067;
      Intrinsics.checkNotNullParameter(var2, "p2");
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var4 = var0;
      RenderPipeline var5 = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Map var6 = MapsKt.emptyMap();
      Map var7 = MapsKt.emptyMap();
      boolean var8 = false;
      VertexConsumer var9 = var0.a(var5, var6, var7);

      try {
         Pose var24 = var4.b().last();
         short var10003 = 29410;
         short var10004 = -17792;
         Intrinsics.checkNotNullExpressionValue(var24, "last(...)");
         Pose var10 = var24;
         boolean var12 = false;
         boolean var16 = false;
         VertexConsumer var10000 = var9.addVertex(var10, var1.i(), var1.j(), var1.k());
         var10002 = 29412;
         var10003 = -21263;
         Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
         var10000.setColor(var3);
         var16 = false;
         var10000 = var9.addVertex(var10, var2.i(), var2.j(), var2.k());
         var10002 = 29412;
         var10003 = -21263;
         Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
         var10000.setColor(var3);
      } finally {
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var9, false);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      @NotNull Vec3 param1,
      @NotNull Vec3 param2,
      int param3,
      float param4,
      boolean param5
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 003: aload 0
      // 004: sipush 29420
      // 007: sipush 23549
      // 00a: pop2
      // 00b: ldc "<this>"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 6
      // 012: aload 1
      // 013: sipush 29383
      // 016: sipush 12243
      // 019: pop2
      // 01a: ldc_w "p1World"
      // 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 020: aload 2
      // 021: iload 6
      // 023: ifeq 049
      // 026: sipush 29386
      // 029: sipush 6421
      // 02c: pop2
      // 02d: ldc_w "p2World"
      // 030: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 033: getstatic me/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII;
      // 036: invokevirtual me/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.aA ()Z
      // 039: ifeq 048
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 042: athrow
      // 043: return
      // 044: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 047: athrow
      // 048: aload 1
      // 049: aconst_null
      // 04a: bipush 2
      // 04b: aconst_null
      // 04c: invokestatic me/octo/client/IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lorg/joml/Vector3f;
      // 04f: dup
      // 050: ifnonnull 059
      // 053: pop
      // 054: return
      // 055: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 058: athrow
      // 059: astore 7
      // 05b: iload 6
      // 05d: ifeq 07a
      // 060: aload 2
      // 061: aconst_null
      // 062: bipush 2
      // 063: aconst_null
      // 064: invokestatic me/octo/client/IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lorg/joml/Vector3f;
      // 067: dup
      // 068: ifnonnull 07b
      // 06b: goto 072
      // 06e: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 071: athrow
      // 072: pop
      // 073: goto 07a
      // 076: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 079: athrow
      // 07a: return
      // 07b: astore 8
      // 07d: aload 8
      // 07f: getfield org/joml/Vector3f.x F
      // 082: aload 7
      // 084: getfield org/joml/Vector3f.x F
      // 087: fsub
      // 088: fstore 9
      // 08a: aload 8
      // 08c: getfield org/joml/Vector3f.y F
      // 08f: aload 7
      // 091: getfield org/joml/Vector3f.y F
      // 094: fsub
      // 095: fstore 10
      // 097: fload 9
      // 099: fload 9
      // 09b: fmul
      // 09c: fload 10
      // 09e: fload 10
      // 0a0: fmul
      // 0a1: fadd
      // 0a2: f2d
      // 0a3: invokestatic java/lang/Math.sqrt (D)D
      // 0a6: d2f
      // 0a7: fstore 11
      // 0a9: fload 11
      // 0ab: ldc_w 1.0E-6
      // 0ae: fcmpg
      // 0af: ifge 0b7
      // 0b2: return
      // 0b3: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b6: athrow
      // 0b7: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0ba: invokevirtual net/minecraft/client/Minecraft.getWindow ()Lcom/mojang/blaze3d/platform/Window;
      // 0bd: dup
      // 0be: sipush 29428
      // 0c1: sipush 31651
      // 0c4: pop2
      // 0c5: ldc_w "getWindow(...)"
      // 0c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0cb: astore 12
      // 0cd: aload 12
      // 0cf: invokevirtual com/mojang/blaze3d/platform/Window.getWidth ()I
      // 0d2: i2f
      // 0d3: fconst_1
      // 0d4: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0d7: fstore 13
      // 0d9: aload 12
      // 0db: invokevirtual com/mojang/blaze3d/platform/Window.getHeight ()I
      // 0de: i2f
      // 0df: fconst_1
      // 0e0: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0e3: fstore 14
      // 0e5: fload 4
      // 0e7: fload 13
      // 0e9: fdiv
      // 0ea: fstore 15
      // 0ec: fload 4
      // 0ee: fload 14
      // 0f0: fdiv
      // 0f1: fstore 16
      // 0f3: fload 10
      // 0f5: fneg
      // 0f6: fload 11
      // 0f8: fdiv
      // 0f9: fstore 17
      // 0fb: fload 9
      // 0fd: fload 11
      // 0ff: fdiv
      // 100: fstore 18
      // 102: fload 17
      // 104: fload 15
      // 106: fmul
      // 107: fstore 19
      // 109: fload 18
      // 10b: fload 16
      // 10d: fmul
      // 10e: fstore 20
      // 110: iload 5
      // 112: ifeq 11f
      // 115: ldc_w 0.5
      // 118: goto 120
      // 11b: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11e: athrow
      // 11f: fconst_0
      // 120: fstore 21
      // 122: iload 5
      // 124: ifeq 131
      // 127: ldc_w 0.5
      // 12a: goto 132
      // 12d: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 130: athrow
      // 131: fconst_1
      // 132: fstore 22
      // 134: aload 0
      // 135: astore 23
      // 137: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 13a: astore 24
      // 13c: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 13f: astore 25
      // 141: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 144: astore 26
      // 146: bipush 0
      // 147: istore 27
      // 149: aload 23
      // 14b: aload 24
      // 14d: aload 25
      // 14f: aload 26
      // 151: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 154: astore 28
      // 156: nop
      // 157: aload 28
      // 159: aload 23
      // 15b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 15e: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 161: dup
      // 162: sipush 29410
      // 165: sipush -17792
      // 168: pop2
      // 169: ldc "last(...)"
      // 16b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 16e: pop
      // 16f: astore 29
      // 171: bipush 0
      // 172: istore 30
      // 174: aload 29
      // 176: aload 7
      // 178: getfield org/joml/Vector3f.x F
      // 17b: fload 19
      // 17d: fadd
      // 17e: aload 7
      // 180: getfield org/joml/Vector3f.y F
      // 183: fload 20
      // 185: fadd
      // 186: aload 7
      // 188: getfield org/joml/Vector3f.z F
      // 18b: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 190: fload 21
      // 192: ldc_w -1.0
      // 195: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 19a: iload 3
      // 19b: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1a0: pop
      // 1a1: aload 29
      // 1a3: aload 7
      // 1a5: getfield org/joml/Vector3f.x F
      // 1a8: fload 19
      // 1aa: fsub
      // 1ab: aload 7
      // 1ad: getfield org/joml/Vector3f.y F
      // 1b0: fload 20
      // 1b2: fsub
      // 1b3: aload 7
      // 1b5: getfield org/joml/Vector3f.z F
      // 1b8: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 1bd: fload 21
      // 1bf: fconst_1
      // 1c0: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 1c5: iload 3
      // 1c6: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1cb: pop
      // 1cc: aload 29
      // 1ce: aload 8
      // 1d0: getfield org/joml/Vector3f.x F
      // 1d3: fload 19
      // 1d5: fsub
      // 1d6: aload 8
      // 1d8: getfield org/joml/Vector3f.y F
      // 1db: fload 20
      // 1dd: fsub
      // 1de: aload 8
      // 1e0: getfield org/joml/Vector3f.z F
      // 1e3: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 1e8: fload 22
      // 1ea: fconst_1
      // 1eb: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 1f0: iload 3
      // 1f1: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1f6: pop
      // 1f7: aload 29
      // 1f9: aload 8
      // 1fb: getfield org/joml/Vector3f.x F
      // 1fe: fload 19
      // 200: fadd
      // 201: aload 8
      // 203: getfield org/joml/Vector3f.y F
      // 206: fload 20
      // 208: fadd
      // 209: aload 8
      // 20b: getfield org/joml/Vector3f.z F
      // 20e: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 213: fload 22
      // 215: ldc_w -1.0
      // 218: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 21d: iload 3
      // 21e: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 223: pop
      // 224: nop
      // 225: nop
      // 226: aload 23
      // 228: aload 28
      // 22a: bipush 0
      // 22b: bipush 2
      // 22c: aconst_null
      // 22d: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 230: goto 242
      // 233: astore 31
      // 235: aload 23
      // 237: aload 28
      // 239: bipush 0
      // 23a: bipush 2
      // 23b: aconst_null
      // 23c: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 23f: aload 31
      // 241: athrow
      // 242: nop
      // 243: return
   }

   public static final void b(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      @NotNull Vec3 param1,
      @NotNull Vec3 param2,
      int param3,
      float param4,
      boolean param5
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 003: aload 0
      // 004: sipush 29420
      // 007: sipush 23549
      // 00a: pop2
      // 00b: ldc "<this>"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 6
      // 012: aload 1
      // 013: sipush 29381
      // 016: sipush 25377
      // 019: pop2
      // 01a: ldc_w "p1World"
      // 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 020: aload 2
      // 021: iload 6
      // 023: ifne 049
      // 026: sipush 29401
      // 029: sipush -25540
      // 02c: pop2
      // 02d: ldc_w "p2World"
      // 030: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 033: getstatic me/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII;
      // 036: invokevirtual me/octo/client/IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.aA ()Z
      // 039: ifeq 048
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 042: athrow
      // 043: return
      // 044: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 047: athrow
      // 048: aload 1
      // 049: aload 2
      // 04a: aconst_null
      // 04b: bipush 4
      // 04c: aconst_null
      // 04d: invokestatic me/octo/client/IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lkotlin/Pair;
      // 050: dup
      // 051: ifnonnull 05a
      // 054: pop
      // 055: return
      // 056: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 059: athrow
      // 05a: astore 7
      // 05c: aload 7
      // 05e: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 061: checkcast org/joml/Vector3f
      // 064: astore 8
      // 066: aload 7
      // 068: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 06b: checkcast org/joml/Vector3f
      // 06e: astore 9
      // 070: aload 9
      // 072: getfield org/joml/Vector3f.x F
      // 075: aload 8
      // 077: getfield org/joml/Vector3f.x F
      // 07a: fsub
      // 07b: fstore 10
      // 07d: aload 9
      // 07f: getfield org/joml/Vector3f.y F
      // 082: aload 8
      // 084: getfield org/joml/Vector3f.y F
      // 087: fsub
      // 088: fstore 11
      // 08a: fload 10
      // 08c: fload 10
      // 08e: fmul
      // 08f: fload 11
      // 091: fload 11
      // 093: fmul
      // 094: fadd
      // 095: f2d
      // 096: invokestatic java/lang/Math.sqrt (D)D
      // 099: d2f
      // 09a: fstore 12
      // 09c: fload 12
      // 09e: ldc_w 1.0E-6
      // 0a1: fcmpg
      // 0a2: ifge 0aa
      // 0a5: return
      // 0a6: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a9: athrow
      // 0aa: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0ad: invokevirtual net/minecraft/client/Minecraft.getWindow ()Lcom/mojang/blaze3d/platform/Window;
      // 0b0: dup
      // 0b1: sipush 29428
      // 0b4: sipush 31651
      // 0b7: pop2
      // 0b8: ldc_w "getWindow(...)"
      // 0bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0be: astore 13
      // 0c0: aload 13
      // 0c2: invokevirtual com/mojang/blaze3d/platform/Window.getWidth ()I
      // 0c5: i2f
      // 0c6: fconst_1
      // 0c7: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0ca: fstore 14
      // 0cc: aload 13
      // 0ce: invokevirtual com/mojang/blaze3d/platform/Window.getHeight ()I
      // 0d1: i2f
      // 0d2: fconst_1
      // 0d3: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0d6: fstore 15
      // 0d8: fload 4
      // 0da: fload 14
      // 0dc: fdiv
      // 0dd: fstore 16
      // 0df: fload 4
      // 0e1: fload 15
      // 0e3: fdiv
      // 0e4: fstore 17
      // 0e6: fload 11
      // 0e8: fneg
      // 0e9: fload 12
      // 0eb: fdiv
      // 0ec: fstore 18
      // 0ee: fload 10
      // 0f0: fload 12
      // 0f2: fdiv
      // 0f3: fstore 19
      // 0f5: fload 18
      // 0f7: fload 16
      // 0f9: fmul
      // 0fa: fstore 20
      // 0fc: fload 19
      // 0fe: fload 17
      // 100: fmul
      // 101: fstore 21
      // 103: iload 5
      // 105: ifeq 112
      // 108: ldc_w 0.5
      // 10b: goto 113
      // 10e: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 111: athrow
      // 112: fconst_0
      // 113: fstore 22
      // 115: iload 5
      // 117: ifeq 124
      // 11a: ldc_w 0.5
      // 11d: goto 125
      // 120: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 123: athrow
      // 124: fconst_1
      // 125: fstore 23
      // 127: aload 0
      // 128: astore 24
      // 12a: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 12d: astore 25
      // 12f: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 132: astore 26
      // 134: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 137: astore 27
      // 139: bipush 0
      // 13a: istore 28
      // 13c: aload 24
      // 13e: aload 25
      // 140: aload 26
      // 142: aload 27
      // 144: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 147: astore 29
      // 149: nop
      // 14a: aload 29
      // 14c: aload 24
      // 14e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 151: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 154: dup
      // 155: sipush 29410
      // 158: sipush -17792
      // 15b: pop2
      // 15c: ldc "last(...)"
      // 15e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 161: pop
      // 162: astore 30
      // 164: bipush 0
      // 165: istore 31
      // 167: aload 30
      // 169: aload 8
      // 16b: getfield org/joml/Vector3f.x F
      // 16e: fload 20
      // 170: fadd
      // 171: aload 8
      // 173: getfield org/joml/Vector3f.y F
      // 176: fload 21
      // 178: fadd
      // 179: aload 8
      // 17b: getfield org/joml/Vector3f.z F
      // 17e: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 183: fload 22
      // 185: ldc_w -1.0
      // 188: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 18d: iload 3
      // 18e: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 193: pop
      // 194: aload 30
      // 196: aload 8
      // 198: getfield org/joml/Vector3f.x F
      // 19b: fload 20
      // 19d: fsub
      // 19e: aload 8
      // 1a0: getfield org/joml/Vector3f.y F
      // 1a3: fload 21
      // 1a5: fsub
      // 1a6: aload 8
      // 1a8: getfield org/joml/Vector3f.z F
      // 1ab: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 1b0: fload 22
      // 1b2: fconst_1
      // 1b3: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 1b8: iload 3
      // 1b9: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1be: pop
      // 1bf: aload 30
      // 1c1: aload 9
      // 1c3: getfield org/joml/Vector3f.x F
      // 1c6: fload 20
      // 1c8: fsub
      // 1c9: aload 9
      // 1cb: getfield org/joml/Vector3f.y F
      // 1ce: fload 21
      // 1d0: fsub
      // 1d1: aload 9
      // 1d3: getfield org/joml/Vector3f.z F
      // 1d6: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 1db: fload 23
      // 1dd: fconst_1
      // 1de: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 1e3: iload 3
      // 1e4: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1e9: pop
      // 1ea: aload 30
      // 1ec: aload 9
      // 1ee: getfield org/joml/Vector3f.x F
      // 1f1: fload 20
      // 1f3: fadd
      // 1f4: aload 9
      // 1f6: getfield org/joml/Vector3f.y F
      // 1f9: fload 21
      // 1fb: fadd
      // 1fc: aload 9
      // 1fe: getfield org/joml/Vector3f.z F
      // 201: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 206: fload 23
      // 208: ldc_w -1.0
      // 20b: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setUv (FF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 3
      // 210: iload 3
      // 211: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 216: pop
      // 217: nop
      // 218: nop
      // 219: aload 24
      // 21b: aload 29
      // 21d: bipush 0
      // 21e: bipush 2
      // 21f: aconst_null
      // 220: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 223: goto 235
      // 226: astore 32
      // 228: aload 24
      // 22a: aload 29
      // 22c: bipush 0
      // 22d: bipush 2
      // 22e: aconst_null
      // 22f: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 232: aload 32
      // 234: athrow
      // 235: nop
      // 236: return
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      float param1,
      float param2,
      float param3,
      @NotNull Vec3 param4,
      int param5,
      float param6
   ) {
            org.joml.Vector3f var8 = me.octo.client.IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl.a(param4, me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameRenderer.getMainCamera().position());
      float var9 = var8.x - param1;
      float var10 = var8.y - param2;
      float var11 = (float) java.lang.Math.sqrt((double) (var9 * var9 + var10 * var10));
      if (var11 < 1.0E-6F) {
         return;
      }
      com.mojang.blaze3d.platform.Window var12 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getWindow();
      float var13 = kotlin.ranges.RangesKt.coerceAtLeast((float) var12.getWidth(), 1.0F);
      float var14 = kotlin.ranges.RangesKt.coerceAtLeast((float) var12.getHeight(), 1.0F);
      float var15 = param6 / var13;
      float var16 = param6 / var14;
      float var17 = -var10 / var11;
      float var18 = var9 / var11;
      float var19 = var17 * var15;
      float var20 = var18 * var16;
      com.mojang.blaze3d.vertex.VertexConsumer var26 = param0.a(me.octo.client.IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap());
      try {
         var26.addVertex(param1 + var19, param2 + var20, param3).setUv(0.0F, -1.0F).setColor(param5);
         var26.addVertex(param1 - var19, param2 - var20, param3).setUv(0.0F, 1.0F).setColor(param5);
         var26.addVertex(var8.x - var19, var8.y - var20, var8.z).setUv(1.0F, 1.0F).setColor(param5);
         var26.addVertex(var8.x + var19, var8.y + var20, var8.z).setUv(1.0F, -1.0F).setColor(param5);
      } finally {
         me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(param0, var26, false, 2, (Object) null);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      @NotNull Vec3 param1,
      @NotNull Vec3 param2,
      int param3,
      float param4
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: sipush 29420
      // 004: sipush 23549
      // 007: pop2
      // 008: ldc "<this>"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 010: aload 1
      // 011: sipush 29381
      // 014: sipush 25377
      // 017: pop2
      // 018: ldc_w "p1World"
      // 01b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01e: istore 5
      // 020: aload 2
      // 021: sipush 29401
      // 024: sipush -25540
      // 027: pop2
      // 028: ldc_w "p2World"
      // 02b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 02e: iload 5
      // 030: ifne 04d
      // 033: aload 1
      // 034: aconst_null
      // 035: bipush 2
      // 036: aconst_null
      // 037: invokestatic me/octo/client/IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lorg/joml/Vector3f;
      // 03a: dup
      // 03b: ifnonnull 04e
      // 03e: goto 045
      // 041: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 044: athrow
      // 045: pop
      // 046: goto 04d
      // 049: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04c: athrow
      // 04d: return
      // 04e: astore 6
      // 050: iload 5
      // 052: ifne 06f
      // 055: aload 2
      // 056: aconst_null
      // 057: bipush 2
      // 058: aconst_null
      // 059: invokestatic me/octo/client/IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lorg/joml/Vector3f;
      // 05c: dup
      // 05d: ifnonnull 070
      // 060: goto 067
      // 063: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 066: athrow
      // 067: pop
      // 068: goto 06f
      // 06b: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06e: athrow
      // 06f: return
      // 070: astore 7
      // 072: aload 7
      // 074: getfield org/joml/Vector3f.x F
      // 077: aload 6
      // 079: getfield org/joml/Vector3f.x F
      // 07c: fsub
      // 07d: fstore 8
      // 07f: aload 7
      // 081: getfield org/joml/Vector3f.y F
      // 084: aload 6
      // 086: getfield org/joml/Vector3f.y F
      // 089: fsub
      // 08a: fstore 9
      // 08c: fload 8
      // 08e: fload 8
      // 090: fmul
      // 091: fload 9
      // 093: fload 9
      // 095: fmul
      // 096: fadd
      // 097: f2d
      // 098: invokestatic java/lang/Math.sqrt (D)D
      // 09b: d2f
      // 09c: fstore 10
      // 09e: fload 10
      // 0a0: ldc_w 1.0E-6
      // 0a3: fcmpg
      // 0a4: ifge 0ac
      // 0a7: return
      // 0a8: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ab: athrow
      // 0ac: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0af: invokevirtual net/minecraft/client/Minecraft.getWindow ()Lcom/mojang/blaze3d/platform/Window;
      // 0b2: dup
      // 0b3: sipush 29428
      // 0b6: sipush 31651
      // 0b9: pop2
      // 0ba: ldc_w "getWindow(...)"
      // 0bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c0: astore 11
      // 0c2: aload 11
      // 0c4: invokevirtual com/mojang/blaze3d/platform/Window.getWidth ()I
      // 0c7: i2f
      // 0c8: fconst_1
      // 0c9: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0cc: fstore 12
      // 0ce: aload 11
      // 0d0: invokevirtual com/mojang/blaze3d/platform/Window.getHeight ()I
      // 0d3: i2f
      // 0d4: fconst_1
      // 0d5: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 0d8: fstore 13
      // 0da: fload 4
      // 0dc: fload 12
      // 0de: fdiv
      // 0df: fstore 14
      // 0e1: fload 4
      // 0e3: fload 13
      // 0e5: fdiv
      // 0e6: fstore 15
      // 0e8: fload 9
      // 0ea: fneg
      // 0eb: fload 10
      // 0ed: fdiv
      // 0ee: fstore 16
      // 0f0: fload 8
      // 0f2: fload 10
      // 0f4: fdiv
      // 0f5: fstore 17
      // 0f7: fload 16
      // 0f9: fload 14
      // 0fb: fmul
      // 0fc: fstore 18
      // 0fe: fload 17
      // 100: fload 15
      // 102: fmul
      // 103: fstore 19
      // 105: aload 0
      // 106: astore 20
      // 108: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 10b: astore 21
      // 10d: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 110: astore 22
      // 112: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 115: astore 23
      // 117: bipush 0
      // 118: istore 24
      // 11a: aload 20
      // 11c: aload 21
      // 11e: aload 22
      // 120: aload 23
      // 122: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 125: astore 25
      // 127: nop
      // 128: aload 25
      // 12a: aload 20
      // 12c: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 12f: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 132: dup
      // 133: sipush 29410
      // 136: sipush -17792
      // 139: pop2
      // 13a: ldc "last(...)"
      // 13c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 13f: pop
      // 140: astore 26
      // 142: bipush 0
      // 143: istore 27
      // 145: aload 26
      // 147: aload 6
      // 149: getfield org/joml/Vector3f.x F
      // 14c: fload 18
      // 14e: fadd
      // 14f: aload 6
      // 151: getfield org/joml/Vector3f.y F
      // 154: fload 19
      // 156: fadd
      // 157: aload 6
      // 159: getfield org/joml/Vector3f.z F
      // 15c: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 161: iload 3
      // 162: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 167: pop
      // 168: aload 26
      // 16a: aload 6
      // 16c: getfield org/joml/Vector3f.x F
      // 16f: fload 18
      // 171: fsub
      // 172: aload 6
      // 174: getfield org/joml/Vector3f.y F
      // 177: fload 19
      // 179: fsub
      // 17a: aload 6
      // 17c: getfield org/joml/Vector3f.z F
      // 17f: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 184: iload 3
      // 185: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 18a: pop
      // 18b: aload 26
      // 18d: aload 7
      // 18f: getfield org/joml/Vector3f.x F
      // 192: fload 18
      // 194: fsub
      // 195: aload 7
      // 197: getfield org/joml/Vector3f.y F
      // 19a: fload 19
      // 19c: fsub
      // 19d: aload 7
      // 19f: getfield org/joml/Vector3f.z F
      // 1a2: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 1a7: iload 3
      // 1a8: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1ad: pop
      // 1ae: aload 26
      // 1b0: aload 7
      // 1b2: getfield org/joml/Vector3f.x F
      // 1b5: fload 18
      // 1b7: fadd
      // 1b8: aload 7
      // 1ba: getfield org/joml/Vector3f.y F
      // 1bd: fload 19
      // 1bf: fadd
      // 1c0: aload 7
      // 1c2: getfield org/joml/Vector3f.z F
      // 1c5: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 4
      // 1ca: iload 3
      // 1cb: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1d0: pop
      // 1d1: nop
      // 1d2: nop
      // 1d3: aload 20
      // 1d5: aload 25
      // 1d7: bipush 0
      // 1d8: bipush 2
      // 1d9: aconst_null
      // 1da: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 1dd: goto 1ef
      // 1e0: astore 28
      // 1e2: aload 20
      // 1e4: aload 25
      // 1e6: bipush 0
      // 1e7: bipush 2
      // 1e8: aconst_null
      // 1e9: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 1ec: aload 28
      // 1ee: athrow
      // 1ef: nop
      // 1f0: return
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      int param1,
      float param2,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII... param3
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 0
      // 001: sipush 29420
      // 004: sipush 23549
      // 007: pop2
      // 008: ldc "<this>"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 010: aload 3
      // 011: sipush 29384
      // 014: sipush 15977
      // 017: pop2
      // 018: ldc_w "positions"
      // 01b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01e: istore 4
      // 020: aload 3
      // 021: arraylength
      // 022: iload 4
      // 024: ifne 032
      // 027: ifne 035
      // 02a: goto 031
      // 02d: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 030: athrow
      // 031: bipush 1
      // 032: goto 036
      // 035: bipush 0
      // 036: ifeq 03a
      // 039: return
      // 03a: aload 3
      // 03b: arraylength
      // 03c: bipush 1
      // 03d: iand
      // 03e: iload 4
      // 040: ifne 04e
      // 043: ifne 051
      // 046: goto 04d
      // 049: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04c: athrow
      // 04d: bipush 1
      // 04e: goto 052
      // 051: bipush 0
      // 052: ifne 06e
      // 055: sipush 29405
      // 058: sipush -30390
      // 05b: pop2
      // 05c: ldc_w "Failed requirement."
      // 05f: astore 6
      // 061: new java/lang/IllegalArgumentException
      // 064: dup
      // 065: aload 6
      // 067: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 06a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 06d: athrow
      // 06e: aload 0
      // 06f: astore 5
      // 071: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 074: astore 6
      // 076: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 079: astore 7
      // 07b: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 07e: astore 8
      // 080: bipush 0
      // 081: istore 9
      // 083: aload 5
      // 085: aload 6
      // 087: aload 7
      // 089: aload 8
      // 08b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 08e: astore 10
      // 090: nop
      // 091: aload 10
      // 093: aload 5
      // 095: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 098: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 09b: dup
      // 09c: sipush 29410
      // 09f: sipush -17792
      // 0a2: pop2
      // 0a3: ldc "last(...)"
      // 0a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0a8: astore 11
      // 0aa: astore 12
      // 0ac: bipush 0
      // 0ad: istore 13
      // 0af: bipush 0
      // 0b0: aload 3
      // 0b1: arraylength
      // 0b2: invokestatic kotlin/ranges/RangesKt.until (II)Lkotlin/ranges/IntRange;
      // 0b5: checkcast kotlin/ranges/IntProgression
      // 0b8: bipush 2
      // 0b9: invokestatic kotlin/ranges/RangesKt.step (Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
      // 0bc: astore 14
      // 0be: aload 14
      // 0c0: invokevirtual kotlin/ranges/IntProgression.getFirst ()I
      // 0c3: istore 15
      // 0c5: aload 14
      // 0c7: invokevirtual kotlin/ranges/IntProgression.getLast ()I
      // 0ca: istore 16
      // 0cc: aload 14
      // 0ce: invokevirtual kotlin/ranges/IntProgression.getStep ()I
      // 0d1: istore 17
      // 0d3: iload 17
      // 0d5: iload 4
      // 0d7: ifne 107
      // 0da: ifle 0fe
      // 0dd: goto 0e4
      // 0e0: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e3: athrow
      // 0e4: iload 15
      // 0e6: iload 4
      // 0e8: ifne 107
      // 0eb: goto 0f2
      // 0ee: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f1: athrow
      // 0f2: iload 16
      // 0f4: if_icmple 11d
      // 0f7: goto 0fe
      // 0fa: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fd: athrow
      // 0fe: iload 17
      // 100: goto 107
      // 103: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 106: athrow
      // 107: iload 4
      // 109: ifne 118
      // 10c: ifge 25f
      // 10f: goto 116
      // 112: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 115: athrow
      // 116: iload 16
      // 118: iload 15
      // 11a: if_icmpgt 25f
      // 11d: aload 3
      // 11e: iload 15
      // 120: aaload
      // 121: astore 18
      // 123: aload 3
      // 124: iload 15
      // 126: bipush 1
      // 127: iadd
      // 128: aaload
      // 129: astore 19
      // 12b: aload 18
      // 12d: aload 19
      // 12f: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.d (Lme/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII;)Lme/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII;
      // 132: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.n ()Lme/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII;
      // 135: astore 20
      // 137: aload 12
      // 139: astore 21
      // 13b: aload 11
      // 13d: astore 22
      // 13f: aload 18
      // 141: astore 23
      // 143: bipush 0
      // 144: istore 24
      // 146: aload 21
      // 148: aload 22
      // 14a: aload 23
      // 14c: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.i ()F
      // 14f: aload 23
      // 151: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.j ()F
      // 154: aload 23
      // 156: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.k ()F
      // 159: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (Lcom/mojang/blaze3d/vertex/PoseStack$Pose;FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 5
      // 15e: dup
      // 15f: sipush 29412
      // 162: sipush -21263
      // 165: pop2
      // 166: ldc_w "addVertex(...)"
      // 169: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 16c: iload 1
      // 16d: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 172: dup
      // 173: sipush 29380
      // 176: sipush 21120
      // 179: pop2
      // 17a: ldc_w "setColor(...)"
      // 17d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 180: astore 25
      // 182: aload 11
      // 184: astore 21
      // 186: aload 20
      // 188: astore 22
      // 18a: bipush 0
      // 18b: istore 23
      // 18d: aload 25
      // 18f: aload 21
      // 191: aload 22
      // 193: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.i ()F
      // 196: aload 22
      // 198: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.j ()F
      // 19b: aload 22
      // 19d: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.k ()F
      // 1a0: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setNormal (Lcom/mojang/blaze3d/vertex/PoseStack$Pose;FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 5
      // 1a5: dup
      // 1a6: sipush 29395
      // 1a9: sipush 17750
      // 1ac: pop2
      // 1ad: ldc_w "setNormal(...)"
      // 1b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1b3: fload 2
      // 1b4: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setLineWidth (F)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1b9: pop
      // 1ba: aload 12
      // 1bc: astore 21
      // 1be: aload 11
      // 1c0: astore 22
      // 1c2: aload 19
      // 1c4: astore 23
      // 1c6: bipush 0
      // 1c7: istore 24
      // 1c9: aload 21
      // 1cb: aload 22
      // 1cd: aload 23
      // 1cf: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.i ()F
      // 1d2: aload 23
      // 1d4: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.j ()F
      // 1d7: aload 23
      // 1d9: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.k ()F
      // 1dc: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.addVertex (Lcom/mojang/blaze3d/vertex/PoseStack$Pose;FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 5
      // 1e1: dup
      // 1e2: sipush 29412
      // 1e5: sipush -21263
      // 1e8: pop2
      // 1e9: ldc_w "addVertex(...)"
      // 1ec: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1ef: iload 1
      // 1f0: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setColor (I)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 1f5: dup
      // 1f6: sipush 29380
      // 1f9: sipush 21120
      // 1fc: pop2
      // 1fd: ldc_w "setColor(...)"
      // 200: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 203: astore 25
      // 205: aload 11
      // 207: astore 21
      // 209: aload 20
      // 20b: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.o ()Lme/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII;
      // 20e: astore 22
      // 210: bipush 0
      // 211: istore 23
      // 213: aload 25
      // 215: aload 21
      // 217: aload 22
      // 219: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.i ()F
      // 21c: aload 22
      // 21e: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.j ()F
      // 221: aload 22
      // 223: invokevirtual me/octo/client/lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII.k ()F
      // 226: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setNormal (Lcom/mojang/blaze3d/vertex/PoseStack$Pose;FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer; 5
      // 22b: dup
      // 22c: sipush 29417
      // 22f: sipush -27473
      // 232: pop2
      // 233: ldc_w "setNormal(...)"
      // 236: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 239: fload 2
      // 23a: invokeinterface com/mojang/blaze3d/vertex/VertexConsumer.setLineWidth (F)Lcom/mojang/blaze3d/vertex/VertexConsumer; 2
      // 23f: pop
      // 240: iload 15
      // 242: iload 16
      // 244: if_icmpeq 25f
      // 247: iload 15
      // 249: iload 17
      // 24b: iadd
      // 24c: istore 15
      // 24e: iload 4
      // 250: ifne 26b
      // 253: iload 4
      // 255: ifeq 11d
      // 258: goto 25f
      // 25b: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 25e: athrow
      // 25f: nop
      // 260: nop
      // 261: aload 5
      // 263: aload 10
      // 265: bipush 0
      // 266: bipush 2
      // 267: aconst_null
      // 268: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 26b: goto 27d
      // 26e: astore 26
      // 270: aload 5
      // 272: aload 10
      // 274: bipush 0
      // 275: bipush 2
      // 276: aconst_null
      // 277: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 27a: aload 26
      // 27c: athrow
      // 27d: nop
      // 27e: return
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      int var1,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII... var2
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c()) ? 1 : 0);
      var10002 = 29384;
      short var10003 = 15977;
      Intrinsics.checkNotNullParameter(var2, "positions");
      boolean var3 = (var10000 != 0);

      label123: {
         label122: {
            try {
               var10000 = var2.length;
               if (var3) {
                  break label123;
               }

               if (var10000 == 0) {
                  break label122;
               }
            } catch (NoWhenBranchMatchedException var29) {
               throw (RuntimeException)a(var29);
            }

            var10000 = 0;
            break label123;
         }

         var10000 = 1;
      }

      if (var10000 == 0) {
         label113: {
            label112: {
               try {
                  var10000 = var2.length & 1;
                  if (var3) {
                     break label113;
                  }

                  if (var10000 == 0) {
                     break label112;
                  }
               } catch (NoWhenBranchMatchedException var28) {
                  throw (RuntimeException)a(var28);
               }

               var10000 = 0;
               break label113;
            }

            var10000 = 1;
         }

         if (var10000 == 0) {
            short var37 = 29437;
            var10001 = 11532;
            String var30 = "Failed requirement.";
            throw new IllegalArgumentException(var30.toString());
         } else {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var4 = var0;
            RenderPipeline var5 = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            Map var6 = MapsKt.emptyMap();
            Map var7 = MapsKt.emptyMap();
            boolean var8 = false;
            VertexConsumer var9 = var0.a(var5, var6, var7);
            boolean var25 = false /* VF: Semaphore variable */;

            try {
               var25 = true;
               Pose var38 = var4.b().last();
               var10003 = 29410;
               short var10004 = -17792;
               Intrinsics.checkNotNullExpressionValue(var38, "last(...)");
               Pose var10 = var38;
               VertexConsumer var11 = var9;
               boolean var12 = false;
               int var13 = 0;
               int var14 = var2.length;

               while (var13 < var14) {
                  lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var15 = var2[var13];
                  VertexConsumer var16 = var11;
                  Pose var17 = var10;
                  lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var18 = var15;
                  boolean var19 = false;

                  try {
                     VertexConsumer var36 = var16.addVertex(var17, var18.i(), var18.j(), var18.k());
                     var10002 = 29412;
                     var10003 = -21263;
                     Intrinsics.checkNotNullExpressionValue(var36, "addVertex(...)");
                     var36.setColor(var1);
                     var13++;
                     if (var3) {
                        var25 = false;
                        return;
                     }

                     if (var3) {
                        break;
                     }
                  } catch (NoWhenBranchMatchedException var26) {
                     throw (RuntimeException)a(var26);
                  }
               }

               var25 = false;
            } finally {
               if (var25) {
                  IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var9, false);
               }
            }

            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var9, false);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static final void b(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      int var1,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII... var2
   ) {
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
      short var10002 = 29420;
      short var10003 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var3 = (var10000 != 0);

      label91: {
         label90: {
            try {
               short var10001 = 29377;
               var10002 = 18282;
               Intrinsics.checkNotNullParameter(var2, "positions");
               var10000 = var2.length;
               if (!var3) {
                  break label91;
               }

               if (var10000 == 0) {
                  break label90;
               }
            } catch (NoWhenBranchMatchedException var27) {
               throw (RuntimeException)a(var27);
            }

            var10000 = 0;
            break label91;
         }

         var10000 = 1;
      }

      if (var10000 == 0) {
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var4 = var0;
         RenderPipeline var5 = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Map var6 = MapsKt.emptyMap();
         Map var7 = MapsKt.emptyMap();
         boolean var8 = false;
         VertexConsumer var9 = var0.a(var5, var6, var7);
         boolean var24 = false /* VF: Semaphore variable */;

         try {
            var24 = true;
            Pose var33 = var4.b().last();
            var10003 = 29410;
            short var10004 = -17792;
            Intrinsics.checkNotNullExpressionValue(var33, "last(...)");
            Pose var10 = var33;
            VertexConsumer var11 = var9;
            boolean var12 = false;
            int var13 = 0;
            int var14 = var2.length;

            while (var13 < var14) {
               lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var15 = var2[var13];
               VertexConsumer var16 = var11;
               Pose var17 = var10;
               lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var18 = var15;
               boolean var19 = false;

               try {
                  VertexConsumer var32 = var16.addVertex(var17, var18.i(), var18.j(), var18.k());
                  var10002 = 29418;
                  var10003 = -21761;
                  Intrinsics.checkNotNullExpressionValue(var32, "addVertex(...)");
                  var32.setColor(var1);
                  var13++;
                  if (!var3) {
                     var24 = false;
                     return;
                  }

                  if (!var3) {
                     break;
                  }
               } catch (NoWhenBranchMatchedException var25) {
                  throw (RuntimeException)a(var25);
               }
            }

            var24 = false;
         } finally {
            if (var24) {
               IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var9, false);
            }
         }

         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var9, false);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var1,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var2,
      @NotNull lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var3,
      int var4
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29421;
      var10002 = 29843;
      Intrinsics.checkNotNullParameter(var1, "p1");
      var10001 = 29404;
      var10002 = 4225;
      Intrinsics.checkNotNullParameter(var2, "p2");
      var10001 = 29385;
      var10002 = -22756;
      Intrinsics.checkNotNullParameter(var3, "p3");
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var5 = var0;
      RenderPipeline var6 = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Map var7 = MapsKt.emptyMap();
      Map var8 = MapsKt.emptyMap();
      boolean var9 = false;
      VertexConsumer var10 = var0.a(var6, var7, var8);

      try {
         Pose var28 = var5.b().last();
         short var10003 = 29410;
         short var10004 = -17792;
         Intrinsics.checkNotNullExpressionValue(var28, "last(...)");
         Pose var11 = var28;
         boolean var13 = false;
         boolean var17 = false;
         VertexConsumer var10000 = var10.addVertex(var11, var1.i(), var1.j(), var1.k());
         var10002 = 29412;
         var10003 = -21263;
         Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
         var10000.setColor(var4);
         var17 = false;
         var10000 = var10.addVertex(var11, var2.i(), var2.j(), var2.k());
         var10002 = 29412;
         var10003 = -21263;
         Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
         var10000.setColor(var4);
         var17 = false;
         var10000 = var10.addVertex(var11, var3.i(), var3.j(), var3.k());
         var10002 = 29412;
         var10003 = -21263;
         Intrinsics.checkNotNullExpressionValue(var10000, "addVertex(...)");
         var10000.setColor(var4);
      } finally {
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var10, false);
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      @NotNull AABB param1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param3,
      int param4,
      int param5
   ) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "<this>");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "box");
      java.lang.String var8 = llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.a();
      com.mojang.blaze3d.buffers.GpuBufferSlice var9 = IIllIllIllIlIIlIIIIlllIIIlIIIIIlllIIIllIlIIIllllIIIllllIIlIlIlIIlIIIllIIllIIllIIIIIIl.d();
      java.util.Map var7 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(var8, var9));
      if (param2 != null && !param2.m()) {
         com.mojang.blaze3d.vertex.VertexConsumer var13 = param0.a(IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.b(true), kotlin.collections.MapsKt.emptyMap(), var7);
         try {
            com.mojang.blaze3d.vertex.PoseStack.Pose var14 = param0.b().last();
            lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b(var13, var14.pose(), param1, param2, param4);
         } finally {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(param0, var13, false, 2, (Object) null);
         }
      }
      if (param3 != null && !param3.m()) {
         com.mojang.blaze3d.vertex.VertexConsumer var13 = param0.a(IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.b(true), kotlin.collections.MapsKt.emptyMap(), var7);
         try {
            com.mojang.blaze3d.vertex.PoseStack.Pose var14 = param0.b().last();
            lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b(var13, var14.pose(), param1, param3, param5);
         } finally {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(param0, var13, false, 2, (Object) null);
         }
      }
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI param0,
      @NotNull AABB param1,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll param3,
      int param4,
      int param5,
      float param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 003: aload 0
      // 004: sipush 29420
      // 007: sipush 23549
      // 00a: pop2
      // 00b: ldc "<this>"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 7
      // 012: aload 1
      // 013: sipush 29389
      // 016: sipush -25773
      // 019: pop2
      // 01a: ldc_w "box"
      // 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 020: aload 2
      // 021: iload 7
      // 023: ifeq 0ca
      // 026: ifnull 0c9
      // 029: goto 030
      // 02c: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02f: athrow
      // 030: aload 2
      // 031: iload 7
      // 033: ifeq 0ca
      // 036: goto 03d
      // 039: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03c: athrow
      // 03d: invokevirtual me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.m ()Z
      // 040: ifne 0c9
      // 043: goto 04a
      // 046: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 049: athrow
      // 04a: aload 0
      // 04b: astore 8
      // 04d: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 050: astore 9
      // 052: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 055: astore 10
      // 057: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 05a: astore 11
      // 05c: bipush 0
      // 05d: istore 12
      // 05f: aload 8
      // 061: aload 9
      // 063: aload 10
      // 065: aload 11
      // 067: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 06a: astore 13
      // 06c: nop
      // 06d: aload 13
      // 06f: aload 8
      // 071: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 074: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 077: dup
      // 078: sipush 29410
      // 07b: sipush -17792
      // 07e: pop2
      // 07f: ldc "last(...)"
      // 081: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 084: astore 14
      // 086: astore 15
      // 088: bipush 0
      // 089: istore 16
      // 08b: aload 15
      // 08d: aload 14
      // 08f: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 092: dup
      // 093: sipush 29423
      // 096: sipush 19461
      // 099: pop2
      // 09a: ldc_w "pose(...)"
      // 09d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0a0: checkcast org/joml/Matrix4fc
      // 0a3: aload 1
      // 0a4: aload 2
      // 0a5: iload 4
      // 0a7: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;I)V
      // 0aa: nop
      // 0ab: nop
      // 0ac: aload 8
      // 0ae: aload 13
      // 0b0: bipush 0
      // 0b1: bipush 2
      // 0b2: aconst_null
      // 0b3: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 0b6: goto 0c8
      // 0b9: astore 17
      // 0bb: aload 8
      // 0bd: aload 13
      // 0bf: bipush 0
      // 0c0: bipush 2
      // 0c1: aconst_null
      // 0c2: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 0c5: aload 17
      // 0c7: athrow
      // 0c8: nop
      // 0c9: aload 3
      // 0ca: iload 7
      // 0cc: ifeq 0da
      // 0cf: ifnull 1eb
      // 0d2: goto 0d9
      // 0d5: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d8: athrow
      // 0d9: aload 3
      // 0da: invokevirtual me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.m ()Z
      // 0dd: iload 7
      // 0df: ifeq 0f9
      // 0e2: ifne 1eb
      // 0e5: goto 0ec
      // 0e8: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0eb: athrow
      // 0ec: fload 6
      // 0ee: ldc_w 1.01
      // 0f1: fcmpl
      // 0f2: goto 0f9
      // 0f5: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f8: athrow
      // 0f9: ifle 16c
      // 0fc: aload 0
      // 0fd: astore 8
      // 0ff: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 102: astore 9
      // 104: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 107: astore 10
      // 109: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 10c: astore 11
      // 10e: bipush 0
      // 10f: istore 12
      // 111: aload 8
      // 113: aload 9
      // 115: aload 10
      // 117: aload 11
      // 119: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 11c: astore 13
      // 11e: nop
      // 11f: aload 13
      // 121: aload 8
      // 123: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 126: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 129: dup
      // 12a: sipush 29410
      // 12d: sipush -17792
      // 130: pop2
      // 131: ldc "last(...)"
      // 133: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 136: astore 14
      // 138: astore 15
      // 13a: bipush 0
      // 13b: istore 16
      // 13d: aload 15
      // 13f: aload 14
      // 141: aload 1
      // 142: aload 3
      // 143: fload 6
      // 145: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.a (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lcom/mojang/blaze3d/vertex/PoseStack$Pose;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;F)V
      // 148: nop
      // 149: nop
      // 14a: aload 8
      // 14c: aload 13
      // 14e: bipush 0
      // 14f: bipush 2
      // 150: aconst_null
      // 151: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 154: goto 166
      // 157: astore 17
      // 159: aload 8
      // 15b: aload 13
      // 15d: bipush 0
      // 15e: bipush 2
      // 15f: aconst_null
      // 160: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 163: aload 17
      // 165: athrow
      // 166: nop
      // 167: iload 7
      // 169: ifne 1eb
      // 16c: aload 0
      // 16d: astore 8
      // 16f: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 172: astore 9
      // 174: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 177: astore 10
      // 179: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 17c: astore 11
      // 17e: bipush 0
      // 17f: istore 12
      // 181: aload 8
      // 183: aload 9
      // 185: aload 10
      // 187: aload 11
      // 189: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 18c: astore 13
      // 18e: nop
      // 18f: aload 13
      // 191: aload 8
      // 193: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 196: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 199: dup
      // 19a: sipush 29410
      // 19d: sipush -17792
      // 1a0: pop2
      // 1a1: ldc "last(...)"
      // 1a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1a6: astore 14
      // 1a8: astore 15
      // 1aa: bipush 0
      // 1ab: istore 16
      // 1ad: aload 15
      // 1af: aload 14
      // 1b1: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 1b4: dup
      // 1b5: sipush 29423
      // 1b8: sipush 19461
      // 1bb: pop2
      // 1bc: ldc_w "pose(...)"
      // 1bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1c2: checkcast org/joml/Matrix4fc
      // 1c5: aload 1
      // 1c6: aload 3
      // 1c7: iload 5
      // 1c9: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.a (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;I)V
      // 1cc: nop
      // 1cd: nop
      // 1ce: aload 8
      // 1d0: aload 13
      // 1d2: bipush 0
      // 1d3: bipush 2
      // 1d4: aconst_null
      // 1d5: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 1d8: goto 1ea
      // 1db: astore 17
      // 1dd: aload 8
      // 1df: aload 13
      // 1e1: bipush 0
      // 1e2: bipush 2
      // 1e3: aconst_null
      // 1e4: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 1e7: aload 17
      // 1e9: athrow
      // 1ea: nop
      // 1eb: return
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull AABB var1,
      @NotNull Direction var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29389;
      var10002 = -25773;
      Intrinsics.checkNotNullParameter(var1, "box");
      var10001 = 29382;
      var10002 = 14188;
      Intrinsics.checkNotNullParameter(var2, "side");
      a(
         var0,
         var1,
         var3,
         var4,
         lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var2),
         lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(var2),
         0.0F);
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull AABB var1,
      @NotNull Iterable<? extends Direction> var2,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      @Nullable llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 29389;
      var10002 = -25773;
      Intrinsics.checkNotNullParameter(var1, "box");
      var10001 = 29379;
      var10002 = -13065;
      Intrinsics.checkNotNullParameter(var2, "sides");
      a(
         var0,
         var1,
         var3,
         var4,
         lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var2),
         lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(var2),
         0.0F);
   }

   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      double var1,
      @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3,
      @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4,
      @NotNull AABB var5
   ) {
      short var10001 = 29420;
      short var10002 = 23549;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      int var10000 = ((IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b()) ? 1 : 0);
      var10002 = 29436;
      short var10003 = 10336;
      Intrinsics.checkNotNullParameter(var3, "baseColor");
      var10002 = 29394;
      var10003 = 29598;
      Intrinsics.checkNotNullParameter(var4, "topColor");
      var10002 = 29393;
      var10003 = 9331;
      Intrinsics.checkNotNullParameter(var5, "box");
      boolean var6 = (var10000 != 0);

      label54: {
         label53: {
            try {
               double var304;
               var10000 = (var304 = var1 - 0.0) == 0.0 ? 0 : (var304 < 0.0 ? -1 : 1);
               if (!var6) {
                  break label54;
               }

               if ((var10000 == 0)) {
                  break label53;
               }
            } catch (NoWhenBranchMatchedException var39) {
               throw (RuntimeException)a(var39);
            }

            var10000 = 0;
            break label54;
         }

         var10000 = 1;
      }

      if ((var10000 == 0)) {
         IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var7 = var0;
         RenderPipeline var8 = IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         Map var9 = MapsKt.emptyMap();
         Map var10 = MapsKt.emptyMap();
         boolean var11 = false;
         VertexConsumer var12 = var0.a(var8, var9, var10);

         try {
            Pose var185 = var7.b().last();
            var10003 = 29410;
            short var10004 = -17792;
            Intrinsics.checkNotNullExpressionValue(var185, "last(...)");
            Pose var13 = var185;
            boolean var15 = false;
            double var18 = var5.minX;
            double var20 = 0.0;
            double var22 = var5.minZ;
            boolean var24 = false;
            Matrix4f var153 = var13.pose();
            var10002 = 29427;
            var10003 = -27279;
            Intrinsics.checkNotNullExpressionValue(var153, "pose(...)");
            Matrix4fc var26 = (Matrix4fc)var153;
            boolean var33 = false;
            VertexConsumer var154 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var154, "addVertex(...)");
            VertexConsumer var16 = var154;
            boolean var34 = false;
            VertexConsumer var186 = var16.setColor(var3.h());
            var10002 = 29409;
            var10003 = -30893;
            Intrinsics.checkNotNullExpressionValue(var186, "setColor(...)");
            var18 = var5.minX;
            var22 = var5.minZ;
            var24 = false;
            Matrix4f var155 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var155, "pose(...)");
            var26 = (Matrix4fc)var155;
            var33 = false;
            VertexConsumer var156 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var156, "addVertex(...)");
            var16 = var156;
            var34 = false;
            VertexConsumer var187 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var187, "setColor(...)");
            var18 = var5.maxX;
            var22 = var5.minZ;
            var24 = false;
            Matrix4f var157 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var157, "pose(...)");
            var26 = (Matrix4fc)var157;
            var33 = false;
            VertexConsumer var158 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var158, "addVertex(...)");
            var16 = var158;
            var34 = false;
            VertexConsumer var188 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var188, "setColor(...)");
            var18 = var5.maxX;
            var20 = 0.0;
            var22 = var5.minZ;
            var24 = false;
            Matrix4f var159 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var159, "pose(...)");
            var26 = (Matrix4fc)var159;
            var33 = false;
            VertexConsumer var160 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var160, "addVertex(...)");
            var16 = var160;
            var34 = false;
            VertexConsumer var189 = var16.setColor(var3.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var189, "setColor(...)");
            var18 = var5.maxX;
            var20 = 0.0;
            var22 = var5.minZ;
            var24 = false;
            Matrix4f var161 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var161, "pose(...)");
            var26 = (Matrix4fc)var161;
            var33 = false;
            VertexConsumer var162 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var162, "addVertex(...)");
            var16 = var162;
            var34 = false;
            VertexConsumer var190 = var16.setColor(var3.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var190, "setColor(...)");
            var18 = var5.maxX;
            var22 = var5.minZ;
            var24 = false;
            Matrix4f var163 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var163, "pose(...)");
            var26 = (Matrix4fc)var163;
            var33 = false;
            VertexConsumer var164 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var164, "addVertex(...)");
            var16 = var164;
            var34 = false;
            VertexConsumer var191 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var191, "setColor(...)");
            var18 = var5.maxX;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var165 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var165, "pose(...)");
            var26 = (Matrix4fc)var165;
            var33 = false;
            VertexConsumer var166 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var166, "addVertex(...)");
            var16 = var166;
            var34 = false;
            VertexConsumer var192 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var192, "setColor(...)");
            var18 = var5.maxX;
            var20 = 0.0;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var167 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var167, "pose(...)");
            var26 = (Matrix4fc)var167;
            var33 = false;
            VertexConsumer var168 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var168, "addVertex(...)");
            var16 = var168;
            var34 = false;
            VertexConsumer var193 = var16.setColor(var3.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var193, "setColor(...)");
            var18 = var5.maxX;
            var20 = 0.0;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var169 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var169, "pose(...)");
            var26 = (Matrix4fc)var169;
            var33 = false;
            VertexConsumer var170 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var170, "addVertex(...)");
            var16 = var170;
            var34 = false;
            VertexConsumer var194 = var16.setColor(var3.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var194, "setColor(...)");
            var18 = var5.maxX;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var171 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var171, "pose(...)");
            var26 = (Matrix4fc)var171;
            var33 = false;
            VertexConsumer var172 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var172, "addVertex(...)");
            var16 = var172;
            var34 = false;
            VertexConsumer var195 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var195, "setColor(...)");
            var18 = var5.minX;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var173 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var173, "pose(...)");
            var26 = (Matrix4fc)var173;
            var33 = false;
            VertexConsumer var174 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var174, "addVertex(...)");
            var16 = var174;
            var34 = false;
            VertexConsumer var196 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var196, "setColor(...)");
            var18 = var5.minX;
            var20 = 0.0;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var175 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var175, "pose(...)");
            var26 = (Matrix4fc)var175;
            var33 = false;
            VertexConsumer var176 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var176, "addVertex(...)");
            var16 = var176;
            var34 = false;
            VertexConsumer var197 = var16.setColor(var3.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var197, "setColor(...)");
            var18 = var5.minX;
            var20 = 0.0;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var177 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var177, "pose(...)");
            var26 = (Matrix4fc)var177;
            var33 = false;
            VertexConsumer var178 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var178, "addVertex(...)");
            var16 = var178;
            var34 = false;
            VertexConsumer var198 = var16.setColor(var3.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var198, "setColor(...)");
            var18 = var5.minX;
            var22 = var5.maxZ;
            var24 = false;
            Matrix4f var179 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var179, "pose(...)");
            var26 = (Matrix4fc)var179;
            var33 = false;
            VertexConsumer var180 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var180, "addVertex(...)");
            var16 = var180;
            var34 = false;
            VertexConsumer var199 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var199, "setColor(...)");
            var18 = var5.minX;
            var22 = var5.minZ;
            var24 = false;
            Matrix4f var181 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var181, "pose(...)");
            var26 = (Matrix4fc)var181;
            var33 = false;
            VertexConsumer var182 = var12.addVertex(var26, (float)var18, (float)var1, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var182, "addVertex(...)");
            var16 = var182;
            var34 = false;
            VertexConsumer var200 = var16.setColor(var4.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var200, "setColor(...)");
            var18 = var5.minX;
            var20 = 0.0;
            var22 = var5.minZ;
            var24 = false;
            Matrix4f var183 = var13.pose();
            var10002 = 29423;
            var10003 = 19461;
            Intrinsics.checkNotNullExpressionValue(var183, "pose(...)");
            var26 = (Matrix4fc)var183;
            var33 = false;
            VertexConsumer var184 = var12.addVertex(var26, (float)var18, (float)var20, (float)var22);
            var10002 = 29412;
            var10003 = -21263;
            Intrinsics.checkNotNullExpressionValue(var184, "addVertex(...)");
            var16 = var184;
            var34 = false;
            VertexConsumer var201 = var16.setColor(var3.h());
            var10002 = 29380;
            var10003 = 21120;
            Intrinsics.checkNotNullExpressionValue(var201, "setColor(...)");
         } finally {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(var0, var12, false);
         }
      }
   }

   private static final boolean b() {
      String var1 = me.octo.client.lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a().getRenderer();
      return var1 != null
         && kotlin.text.StringsKt.startsWith(var1, "AMD Radeon(TM) RX Vega", false)
         && me.octo.client.lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a().getVendor().equals("ATI Technologies Inc.");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[63];
      int var3 = 0;
      String var2 = "#\u001c+·\u0098üñ\rõ\bNú\t=·\b?ö\u0005\u00adá\u008eÂÞ\u0012\"©ùn0gRS²n¡ë»\u001e¬ú\u0012B\u0007ÞÜ°<MN\u0086\rP½!â%<>¬WÅ6é#\u0007\b\u0098j´\u0016_í\u0004ÿÝÄE\u0002\u009aY\t\u008cÁÞ\f&\u008b&ã\u000f\bË`KîQáÎ}\u0007\u0095æÙ\u0018`Ê#\u0003i!9\u0006G¤#\u0000ØÌ\u0003ZÔ\u0004\b\u0084¸`\r³^î<\u0003ë:i\f\u009cB\u0083:\"ú®ºC?î\u008c\u000eh@&PÅØ þ\u0092øB\u0088ª¤\b\u0093èº\u0003Ò\u0000À+\u0004çU7>\tõkñUä0³'j\b¶àäþ¤ãp=\tN³\u0019\u0090\u0082á$A|\u0007]rÀ\u008aC\u0098G\f\u0083\b`s^Ó!\u009f²\u009bÐ\u0018\u0016<\u0098è\b\u0017céü\u0080ze,ë\u0005\u0001Ä\u001e\u007fR\u0089Æ!\b°n\u0000/8Ùãz\u0013]4\u000ext\u00ad\u0010\u0097yýL\u001d\u0007õ\t(Íg \u0002/ó\u0015Úæ9ý\u0087Ù:\"\u001c\f\u0093øÓ\u0083,}.$\u001b \u0099\bµõY\u00958Z\u009e«\r8÷,«\u0084\u0015\n\u0089Ñaæ}9\u0004÷=\u0018\u009f\u0018|È2BIâ}òSj\u0018\u001f¾\t2·.p®Èv¢1Ô\tL\u0006Y&\u008a7%\u009b\\\u0002«·\u000eÔ\u0017ñ\u0083'¹.Ö}y)¸Ç¢\bxËÏ\u001boÌ$n\b1ëj\u0083Ë÷\u0081g\u000e¹\u0089\u001ci\u0082ÿÈ\u001a\u008fdá\u001bÞÖ\u0006èÓ\u008c6\u0013\u009b\bµ%úZÙÌÃ\u0000\u000e»Þ\u001cº\u009a\u009e\u00992\u008bå÷+\u001cÐ\u0002^ý\u0006s\u0094ÿÞ}\u0086\t°\u001bY[\u008a«%\b\\\tÉXv3\u0014ü\u00ad¾©\u0002ï·\u0004\u001cÍH-\t×\u0099µ\u000b\u0017¡\u0096I*\u000e+\u0098ØR\u001c¾Ô£?\u009c\u008f\u0004\u00135\u0006\u0098\u00973\u0005@/\u000e¹î\u008a\u009cVg\u009d\u0098\u0016ûªè·¨\b³\u0092`°4*b\u0004\b_\u001b\u001byÜÐ\u0003í\r+Ï*Í¸³õä.S\u0019;Æ\u0006l\u0017Fvt\u0002\u0006¬\u0006µ7\u0090i\u0004AÏÎÁ\u0013k`Èò¬ü\u000b½\u001a¸ µ\u008aà¸\u008aû3f";
      int var4 = "#\u001c+·\u0098üñ\rõ\bNú\t=·\b?ö\u0005\u00adá\u008eÂÞ\u0012\"©ùn0gRS²n¡ë»\u001e¬ú\u0012B\u0007ÞÜ°<MN\u0086\rP½!â%<>¬WÅ6é#\u0007\b\u0098j´\u0016_í\u0004ÿÝÄE\u0002\u009aY\t\u008cÁÞ\f&\u008b&ã\u000f\bË`KîQáÎ}\u0007\u0095æÙ\u0018`Ê#\u0003i!9\u0006G¤#\u0000ØÌ\u0003ZÔ\u0004\b\u0084¸`\r³^î<\u0003ë:i\f\u009cB\u0083:\"ú®ºC?î\u008c\u000eh@&PÅØ þ\u0092øB\u0088ª¤\b\u0093èº\u0003Ò\u0000À+\u0004çU7>\tõkñUä0³'j\b¶àäþ¤ãp=\tN³\u0019\u0090\u0082á$A|\u0007]rÀ\u008aC\u0098G\f\u0083\b`s^Ó!\u009f²\u009bÐ\u0018\u0016<\u0098è\b\u0017céü\u0080ze,ë\u0005\u0001Ä\u001e\u007fR\u0089Æ!\b°n\u0000/8Ùãz\u0013]4\u000ext\u00ad\u0010\u0097yýL\u001d\u0007õ\t(Íg \u0002/ó\u0015Úæ9ý\u0087Ù:\"\u001c\f\u0093øÓ\u0083,}.$\u001b \u0099\bµõY\u00958Z\u009e«\r8÷,«\u0084\u0015\n\u0089Ñaæ}9\u0004÷=\u0018\u009f\u0018|È2BIâ}òSj\u0018\u001f¾\t2·.p®Èv¢1Ô\tL\u0006Y&\u008a7%\u009b\\\u0002«·\u000eÔ\u0017ñ\u0083'¹.Ö}y)¸Ç¢\bxËÏ\u001boÌ$n\b1ëj\u0083Ë÷\u0081g\u000e¹\u0089\u001ci\u0082ÿÈ\u001a\u008fdá\u001bÞÖ\u0006èÓ\u008c6\u0013\u009b\bµ%úZÙÌÃ\u0000\u000e»Þ\u001cº\u009a\u009e\u00992\u008bå÷+\u001cÐ\u0002^ý\u0006s\u0094ÿÞ}\u0086\t°\u001bY[\u008a«%\b\\\tÉXv3\u0014ü\u00ad¾©\u0002ï·\u0004\u001cÍH-\t×\u0099µ\u000b\u0017¡\u0096I*\u000e+\u0098ØR\u001c¾Ô£?\u009c\u008f\u0004\u00135\u0006\u0098\u00973\u0005@/\u000e¹î\u008a\u009cVg\u009d\u0098\u0016ûªè·¨\b³\u0092`°4*b\u0004\b_\u001b\u001byÜÐ\u0003í\r+Ï*Í¸³õä.S\u0019;Æ\u0006l\u0017Fvt\u0002\u0006¬\u0006µ7\u0090i\u0004AÏÎÁ\u0013k`Èò¬ü\u000b½\u001a¸ µ\u008aà¸\u008aû3f"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 4;
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
                     case 0 -> 61;
                     case 1 -> 48;
                     case 2 -> 97;
                     case 3 -> 93;
                     case 4 -> 60;
                     case 5 -> 8;
                     default -> 116;
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
                     b = new String[63];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = LazyKt.lazy(
                        lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll::b
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new AABB(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new AABB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0011Wµ\u0095ô»&ªå\u0003\f4F";
                  var4 = "\u0011Wµ\u0095ô»&ªå\u0003\f4F".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 41;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 29377) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 228;
            case 1 -> 225;
            case 2 -> 22;
            case 3 -> 26;
            case 4 -> 145;
            case 5 -> 249;
            case 6 -> 25;
            case 7 -> 252;
            case 8 -> 5;
            case 9 -> 117;
            case 10 -> 202;
            case 11 -> 197;
            case 12 -> 151;
            case 13 -> 59;
            case 14 -> 94;
            case 15 -> 95;
            case 16 -> 190;
            case 17 -> 201;
            case 18 -> 72;
            case 19 -> 108;
            case 20 -> 121;
            case 21 -> 165;
            case 22 -> 27;
            case 23 -> 35;
            case 24 -> 76;
            case 25 -> 230;
            case 26 -> 0;
            case 27 -> 173;
            case 28 -> 58;
            case 29 -> 227;
            case 30 -> 210;
            case 31 -> 199;
            case 32 -> 79;
            case 33 -> 54;
            case 34 -> 10;
            case 35 -> 137;
            case 36 -> 157;
            case 37 -> 120;
            case 38 -> 193;
            case 39 -> 131;
            case 40 -> 224;
            case 41 -> 134;
            case 42 -> 191;
            case 43 -> 3;
            case 44 -> 41;
            case 45 -> 105;
            case 46 -> 123;
            case 47 -> 37;
            case 48 -> 180;
            case 49 -> 146;
            case 50 -> 91;
            case 51 -> 75;
            case 52 -> 42;
            case 53 -> 234;
            case 54 -> 114;
            case 55 -> 14;
            case 56 -> 213;
            case 57 -> 81;
            case 58 -> 194;
            case 59 -> 85;
            case 60 -> 240;
            case 61 -> 169;
            case 62 -> 51;
            case 63 -> 209;
            case 64 -> 13;
            case 65 -> 126;
            case 66 -> 63;
            case 67 -> 133;
            case 68 -> 229;
            case 69 -> 160;
            case 70 -> 4;
            case 71 -> 65;
            case 72 -> 150;
            case 73 -> 226;
            case 74 -> 135;
            case 75 -> 115;
            case 76 -> 127;
            case 77 -> 45;
            case 78 -> 6;
            case 79 -> 1;
            case 80 -> 33;
            case 81 -> 52;
            case 82 -> 248;
            case 83 -> 177;
            case 84 -> 9;
            case 85 -> 78;
            case 86 -> 109;
            case 87 -> 203;
            case 88 -> 49;
            case 89 -> 184;
            case 90 -> 162;
            case 91 -> 90;
            case 92 -> 187;
            case 93 -> 242;
            case 94 -> 161;
            case 95 -> 92;
            case 96 -> 220;
            case 97 -> 116;
            case 98 -> 163;
            case 99 -> 96;
            case 100 -> 40;
            case 101 -> 159;
            case 102 -> 87;
            case 103 -> 124;
            case 104 -> 149;
            case 105 -> 102;
            case 106 -> 250;
            case 107 -> 38;
            case 108 -> 24;
            case 109 -> 17;
            case 110 -> 175;
            case 111 -> 86;
            case 112 -> 238;
            case 113 -> 84;
            case 114 -> 128;
            case 115 -> 152;
            case 116 -> 60;
            case 117 -> 103;
            case 118 -> 125;
            case 119 -> 129;
            case 120 -> 2;
            case 121 -> 214;
            case 122 -> 171;
            case 123 -> 189;
            case 124 -> 56;
            case 125 -> 154;
            case 126 -> 166;
            case 127 -> 8;
            case 128 -> 188;
            case 129 -> 198;
            case 130 -> 28;
            case 131 -> 158;
            case 132 -> 61;
            case 133 -> 43;
            case 134 -> 32;
            case 135 -> 47;
            case 136 -> 143;
            case 137 -> 12;
            case 138 -> 148;
            case 139 -> 168;
            case 140 -> 200;
            case 141 -> 245;
            case 142 -> 216;
            case 143 -> 99;
            case 144 -> 112;
            case 145 -> 147;
            case 146 -> 153;
            case 147 -> 15;
            case 148 -> 16;
            case 149 -> 97;
            case 150 -> 140;
            case 151 -> 68;
            case 152 -> 155;
            case 153 -> 30;
            case 154 -> 222;
            case 155 -> 232;
            case 156 -> 231;
            case 157 -> 36;
            case 158 -> 136;
            case 159 -> 185;
            case 160 -> 118;
            case 161 -> 243;
            case 162 -> 172;
            case 163 -> 73;
            case 164 -> 55;
            case 165 -> 62;
            case 166 -> 217;
            case 167 -> 219;
            case 168 -> 74;
            case 169 -> 34;
            case 170 -> 192;
            case 171 -> 196;
            case 172 -> 57;
            case 173 -> 48;
            case 174 -> 113;
            case 175 -> 142;
            case 176 -> 46;
            case 177 -> 176;
            case 178 -> 11;
            case 179 -> 122;
            case 180 -> 204;
            case 181 -> 164;
            case 182 -> 182;
            case 183 -> 235;
            case 184 -> 179;
            case 185 -> 236;
            case 186 -> 98;
            case 187 -> 241;
            case 188 -> 130;
            case 189 -> 223;
            case 190 -> 31;
            case 191 -> 141;
            case 192 -> 93;
            case 193 -> 89;
            case 194 -> 100;
            case 195 -> 208;
            case 196 -> 156;
            case 197 -> 110;
            case 198 -> 183;
            case 199 -> 206;
            case 200 -> 29;
            case 201 -> 21;
            case 202 -> 239;
            case 203 -> 71;
            case 204 -> 80;
            case 205 -> 18;
            case 206 -> 53;
            case 207 -> 70;
            case 208 -> 88;
            case 209 -> 212;
            case 210 -> 195;
            case 211 -> 66;
            case 212 -> 221;
            case 213 -> 233;
            case 214 -> 255;
            case 215 -> 181;
            case 216 -> 244;
            case 217 -> 119;
            case 218 -> 39;
            case 219 -> 144;
            case 220 -> 44;
            case 221 -> 106;
            case 222 -> 253;
            case 223 -> 246;
            case 224 -> 7;
            case 225 -> 19;
            case 226 -> 186;
            case 227 -> 104;
            case 228 -> 132;
            case 229 -> 174;
            case 230 -> 83;
            case 231 -> 138;
            case 232 -> 170;
            case 233 -> 111;
            case 234 -> 205;
            case 235 -> 69;
            case 236 -> 215;
            case 237 -> 101;
            case 238 -> 211;
            case 239 -> 64;
            case 240 -> 23;
            case 241 -> 50;
            case 242 -> 254;
            case 243 -> 247;
            case 244 -> 82;
            case 245 -> 67;
            case 246 -> 139;
            case 247 -> 20;
            case 248 -> 178;
            case 249 -> 207;
            case 250 -> 107;
            case 251 -> 218;
            case 252 -> 77;
            case 253 -> 251;
            case 254 -> 237;
            default -> 167;
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

   // === W9-3 backfill: Kotlin default-argument mask bridges (javap-verified) ===

   public static void a(com.mojang.blaze3d.vertex.PoseStack p0, com.mojang.blaze3d.pipeline.RenderTarget p1, me.octo.client.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl p2, net.minecraft.client.Camera p3, kotlin.jvm.functions.Function1 p4, int p5, java.lang.Object p6) {
      if ((p5 & 2) != 0) {
         p1 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getMainRenderTarget();
      }
      if ((p5 & 4) != 0) {
         p2 = me.octo.client.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((p5 & 8) != 0) {
         p3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameRenderer.getMainCamera();
      }
      a(p0, p1, p2, p3, p4);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, net.minecraft.client.renderer.texture.AbstractTexture p1, com.mojang.blaze3d.pipeline.RenderPipeline p2, java.util.Map p3, kotlin.jvm.functions.Function2 p4, int p5, java.lang.Object p6) {
      if ((p5 & 2) != 0) {
         p2 = me.octo.client.IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      }
      if ((p5 & 4) != 0) {
         p3 = kotlin.collections.MapsKt.emptyMap();
      }
      a(p0, p1, p2, p3, p4);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, com.mojang.blaze3d.pipeline.RenderPipeline p1, java.util.Map p2, java.util.Map p3, kotlin.jvm.functions.Function2 p4, int p5, java.lang.Object p6) {
      if ((p5 & 2) != 0) {
         p2 = kotlin.collections.MapsKt.emptyMap();
      }
      if ((p5 & 4) != 0) {
         p3 = kotlin.collections.MapsKt.emptyMap();
      }
      a(p0, p1, p2, p3, p4);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, net.minecraft.world.phys.Vec3 p1, net.minecraft.world.phys.Vec3 p2, int p3, float p4, boolean p5, int p6, java.lang.Object p7) {
      if ((p6 & 8) != 0) {
         p4 = 6.0f;
      }
      if ((p6 & 16) != 0) {
         p5 = false;
      }
      a(p0, p1, p2, p3, p4, p5);
   }

   public static void b(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, net.minecraft.world.phys.Vec3 p1, net.minecraft.world.phys.Vec3 p2, int p3, float p4, boolean p5, int p6, java.lang.Object p7) {
      if ((p6 & 8) != 0) {
         p4 = 6.0f;
      }
      if ((p6 & 16) != 0) {
         p5 = false;
      }
      b(p0, p1, p2, p3, p4, p5);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, float p1, float p2, float p3, net.minecraft.world.phys.Vec3 p4, int p5, float p6, int p7, java.lang.Object p8) {
      if ((p7 & 32) != 0) {
         p6 = 6.0f;
      }
      a(p0, p1, p2, p3, p4, p5, p6);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, net.minecraft.world.phys.AABB p1, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p2, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p3, int p4, int p5, int p6, java.lang.Object p7) {
      if ((p6 & 2) != 0) {
         p2 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      if ((p6 & 4) != 0) {
         p3 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      if ((p6 & 8) != 0) {
         p4 = -1;
      }
      if ((p6 & 16) != 0) {
         p5 = -1;
      }
      a(p0, p1, p2, p3, p4, p5);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, net.minecraft.world.phys.AABB p1, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p2, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p3, int p4, int p5, float p6, int p7, java.lang.Object p8) {
      if ((p7 & 2) != 0) {
         p2 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      if ((p7 & 4) != 0) {
         p3 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      if ((p7 & 8) != 0) {
         p4 = -1;
      }
      if ((p7 & 16) != 0) {
         p5 = -1;
      }
      if ((p7 & 32) != 0) {
         p6 = 1.0f;
      }
      a(p0, p1, p2, p3, p4, p5, p6);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, net.minecraft.world.phys.AABB p1, net.minecraft.core.Direction p2, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p3, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p4, int p5, java.lang.Object p6) {
      if ((p5 & 4) != 0) {
         p3 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      if ((p5 & 8) != 0) {
         p4 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      a(p0, p1, p2, p3, p4);
   }

   public static void a(me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI p0, net.minecraft.world.phys.AABB p1, java.lang.Iterable p2, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p3, me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll p4, int p5, java.lang.Object p6) {
      if ((p5 & 4) != 0) {
         p3 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      if ((p5 & 8) != 0) {
         p4 = me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
      a(p0, p1, p2, p3, p4);
   }

}
