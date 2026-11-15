package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.PoseStack;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl {
   @NotNull
   public static lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static volatile boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static volatile float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static volatile float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static volatile boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private static Lazy IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private static Lazy llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private static Lazy IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static Lazy lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private static Lazy llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static String[] a;
   private static String[] b;

   private lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl() {
   }

   private final GpuBufferSlice a() {
      Lazy var1 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuBufferSlice b() {
      Lazy var1 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuBufferSlice c() {
      Lazy var1 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuBufferSlice d() {
      Lazy var1 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuSampler e() {
      Lazy var1 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      Object var10000 = var1.getValue();
      short var10002 = -12386;
      short var10003 = -4448;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (GpuSampler)var10000;
   }

   @JvmStatic
   public static final void a(float var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Math.max(
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, Math.max(0.0F, var0)
      );
   }

   @JvmStatic
   public static final void b(float var0) {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = Math.max(
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, Math.max(0.0F, var0)
      );
   }

   @JvmStatic
   public static final void c(float var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(0.1F, var0);
   }

   @JvmStatic
   public static final void a(boolean var0) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var0;
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
   }

   @JvmStatic
   public static final void d(float var0) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = true;
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = Math.max(
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, Math.max(0.0F, var0)
      );
   }

   @JvmStatic
   public static final void e(float var0) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = true;
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = Math.max(
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, Math.max(0.0F, var0)
      );
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @JvmStatic
   public static final boolean f() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   @JvmStatic
   public static final boolean g() {
      boolean var0 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      return var0;
   }

   @JvmStatic
   public static final void a(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull AABB var1,
      @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2
   ) {
      short var10001 = -12380;
      short var10002 = -31037;
      Intrinsics.checkNotNullParameter(var0, "env");
      var10001 = -12369;
      var10002 = -29333;
      Intrinsics.checkNotNullParameter(var1, "box");
      var10001 = -12363;
      var10002 = -3735;
      Intrinsics.checkNotNullParameter(var2, "color");
      a(var0.b(), null);
   }

   @JvmStatic
   public static final void b(
      @NotNull IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var0,
      @NotNull AABB var1,
      @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var2
   ) {
      short var10001 = -12375;
      short var10002 = 4324;
      Intrinsics.checkNotNullParameter(var0, "env");
      var10001 = -12383;
      var10002 = -13318;
      Intrinsics.checkNotNullParameter(var1, "box");
      var10001 = -12371;
      var10002 = 9028;
      Intrinsics.checkNotNullParameter(var2, "color");
      b(var0.b(), null);
   }

   @JvmStatic
   public static final void a(
      @NotNull PoseStack param0, @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> param1
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 003: aload 0
      // 004: sipush -12388
      // 007: sipush 797
      // 00a: pop2
      // 00b: ldc "matrices"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: aload 1
      // 011: sipush -12400
      // 014: sipush 21741
      // 017: pop2
      // 018: ldc "action"
      // 01a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01d: istore 2
      // 01e: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 021: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 024: ifnonnull 02c
      // 027: return
      // 028: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 02f: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.h ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 032: dup
      // 033: ifnonnull 03c
      // 036: pop
      // 037: return
      // 038: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: astore 3
      // 03d: bipush 1
      // 03e: putstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Z
      // 041: nop
      // 042: aload 0
      // 043: astore 4
      // 045: aload 3
      // 046: astore 5
      // 048: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 04b: astore 6
      // 04d: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 050: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 053: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 056: dup
      // 057: sipush -12357
      // 05a: sipush 29137
      // 05d: pop2
      // 05e: ldc "getMainCamera(...)"
      // 060: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 063: astore 7
      // 065: bipush 0
      // 066: istore 8
      // 068: sipush 2848
      // 06b: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 06e: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 071: aload 5
      // 073: aload 4
      // 075: aload 7
      // 077: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 07a: astore 9
      // 07c: nop
      // 07d: aload 6
      // 07f: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 082: swap
      // 083: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 086: iaload
      // 087: tableswitch 393 1 2 21 207
      // 09c: aload 9
      // 09e: astore 10
      // 0a0: bipush 0
      // 0a1: istore 11
      // 0a3: aload 10
      // 0a5: astore 12
      // 0a7: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 0aa: astore 13
      // 0ac: bipush 0
      // 0ad: istore 14
      // 0af: aload 12
      // 0b1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 0b4: astore 15
      // 0b6: aload 12
      // 0b8: aload 13
      // 0ba: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 0bd: nop
      // 0be: aload 12
      // 0c0: astore 16
      // 0c2: bipush 0
      // 0c3: istore 17
      // 0c5: aload 16
      // 0c7: astore 18
      // 0c9: bipush 0
      // 0ca: istore 19
      // 0cc: aload 18
      // 0ce: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 0d1: astore 20
      // 0d3: bipush 0
      // 0d4: istore 21
      // 0d6: aload 20
      // 0d8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 0db: nop
      // 0dc: aload 20
      // 0de: astore 22
      // 0e0: bipush 0
      // 0e1: istore 23
      // 0e3: aload 18
      // 0e5: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 0e8: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 0eb: dup
      // 0ec: sipush -12389
      // 0ef: sipush 32648
      // 0f2: pop2
      // 0f3: ldc "position(...)"
      // 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f8: astore 24
      // 0fa: aload 22
      // 0fc: aload 24
      // 0fe: getfield net/minecraft/world/phys/Vec3.x D
      // 101: dneg
      // 102: aload 24
      // 104: getfield net/minecraft/world/phys/Vec3.y D
      // 107: dneg
      // 108: aload 24
      // 10a: getfield net/minecraft/world/phys/Vec3.z D
      // 10d: dneg
      // 10e: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 111: aload 18
      // 113: astore 25
      // 115: bipush 0
      // 116: istore 26
      // 118: aload 1
      // 119: aload 25
      // 11b: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 120: pop
      // 121: nop
      // 122: nop
      // 123: nop
      // 124: aload 20
      // 126: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 129: goto 136
      // 12c: astore 25
      // 12e: aload 20
      // 130: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 133: aload 25
      // 135: athrow
      // 136: nop
      // 137: nop
      // 138: nop
      // 139: nop
      // 13a: aload 12
      // 13c: aload 15
      // 13e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 141: goto 150
      // 144: astore 16
      // 146: aload 12
      // 148: aload 15
      // 14a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 14d: aload 16
      // 14f: athrow
      // 150: nop
      // 151: nop
      // 152: iload 2
      // 153: ifne 21c
      // 156: aload 9
      // 158: astore 10
      // 15a: bipush 0
      // 15b: istore 11
      // 15d: aload 10
      // 15f: astore 12
      // 161: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 164: astore 13
      // 166: bipush 0
      // 167: istore 14
      // 169: aload 12
      // 16b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 16e: astore 15
      // 170: aload 12
      // 172: aload 13
      // 174: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 177: nop
      // 178: aload 12
      // 17a: astore 17
      // 17c: bipush 0
      // 17d: istore 18
      // 17f: aload 17
      // 181: astore 19
      // 183: bipush 0
      // 184: istore 20
      // 186: aload 19
      // 188: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 18b: astore 21
      // 18d: bipush 0
      // 18e: istore 22
      // 190: aload 21
      // 192: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 195: nop
      // 196: aload 21
      // 198: astore 23
      // 19a: bipush 0
      // 19b: istore 24
      // 19d: aload 19
      // 19f: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 1a2: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 1a5: dup
      // 1a6: sipush -12389
      // 1a9: sipush 32648
      // 1ac: pop2
      // 1ad: ldc "position(...)"
      // 1af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1b2: astore 25
      // 1b4: aload 23
      // 1b6: aload 25
      // 1b8: getfield net/minecraft/world/phys/Vec3.x D
      // 1bb: dneg
      // 1bc: aload 25
      // 1be: getfield net/minecraft/world/phys/Vec3.y D
      // 1c1: dneg
      // 1c2: aload 25
      // 1c4: getfield net/minecraft/world/phys/Vec3.z D
      // 1c7: dneg
      // 1c8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 1cb: aload 19
      // 1cd: astore 26
      // 1cf: bipush 0
      // 1d0: istore 27
      // 1d2: aload 1
      // 1d3: aload 26
      // 1d5: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1da: pop
      // 1db: nop
      // 1dc: nop
      // 1dd: nop
      // 1de: aload 21
      // 1e0: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 1e3: goto 1f0
      // 1e6: astore 26
      // 1e8: aload 21
      // 1ea: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 1ed: aload 26
      // 1ef: athrow
      // 1f0: nop
      // 1f1: nop
      // 1f2: nop
      // 1f3: nop
      // 1f4: aload 12
      // 1f6: aload 15
      // 1f8: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1fb: goto 20a
      // 1fe: astore 16
      // 200: aload 12
      // 202: aload 15
      // 204: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 207: aload 16
      // 209: athrow
      // 20a: nop
      // 20b: nop
      // 20c: iload 2
      // 20d: ifne 21c
      // 210: new kotlin/NoWhenBranchMatchedException
      // 213: dup
      // 214: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 217: athrow
      // 218: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21b: athrow
      // 21c: aload 9
      // 21e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 221: sipush 2848
      // 224: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 227: goto 23a
      // 22a: astore 28
      // 22c: aload 9
      // 22e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 231: sipush 2848
      // 234: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 237: aload 28
      // 239: athrow
      // 23a: nop
      // 23b: goto 258
      // 23e: astore 4
      // 240: aload 4
      // 242: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 245: sipush -12368
      // 248: sipush -25155
      // 24b: pop2
      // 24c: ldc_w "[Outline] paintOutlineMask draw failed: "
      // 24f: swap
      // 250: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 255: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 258: return
   }

   @JvmStatic
   public static final void b(
      @NotNull PoseStack param0, @NotNull Function1<? super IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI, Unit> param1
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 003: aload 0
      // 004: sipush -12377
      // 007: sipush 10855
      // 00a: pop2
      // 00b: ldc "matrices"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 2
      // 011: aload 1
      // 012: sipush -12376
      // 015: sipush 30944
      // 018: pop2
      // 019: ldc "action"
      // 01b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01e: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 021: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 024: ifnonnull 02c
      // 027: return
      // 028: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 02f: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.i ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 032: dup
      // 033: ifnonnull 03c
      // 036: pop
      // 037: return
      // 038: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: astore 3
      // 03d: bipush 1
      // 03e: putstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Z
      // 041: nop
      // 042: aload 0
      // 043: astore 4
      // 045: aload 3
      // 046: astore 5
      // 048: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 04b: astore 6
      // 04d: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 050: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 053: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 056: dup
      // 057: sipush -12370
      // 05a: sipush 12138
      // 05d: pop2
      // 05e: ldc "getMainCamera(...)"
      // 060: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 063: astore 7
      // 065: bipush 0
      // 066: istore 8
      // 068: sipush 2848
      // 06b: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 06e: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 071: aload 5
      // 073: aload 4
      // 075: aload 7
      // 077: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 07a: astore 9
      // 07c: nop
      // 07d: aload 6
      // 07f: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 082: swap
      // 083: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 086: iaload
      // 087: tableswitch 393 1 2 21 207
      // 09c: aload 9
      // 09e: astore 10
      // 0a0: bipush 0
      // 0a1: istore 11
      // 0a3: aload 10
      // 0a5: astore 12
      // 0a7: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 0aa: astore 13
      // 0ac: bipush 0
      // 0ad: istore 14
      // 0af: aload 12
      // 0b1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 0b4: astore 15
      // 0b6: aload 12
      // 0b8: aload 13
      // 0ba: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 0bd: nop
      // 0be: aload 12
      // 0c0: astore 16
      // 0c2: bipush 0
      // 0c3: istore 17
      // 0c5: aload 16
      // 0c7: astore 18
      // 0c9: bipush 0
      // 0ca: istore 19
      // 0cc: aload 18
      // 0ce: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 0d1: astore 20
      // 0d3: bipush 0
      // 0d4: istore 21
      // 0d6: aload 20
      // 0d8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 0db: nop
      // 0dc: aload 20
      // 0de: astore 22
      // 0e0: bipush 0
      // 0e1: istore 23
      // 0e3: aload 18
      // 0e5: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 0e8: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 0eb: dup
      // 0ec: sipush -12366
      // 0ef: sipush 32478
      // 0f2: pop2
      // 0f3: ldc "position(...)"
      // 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f8: astore 24
      // 0fa: aload 22
      // 0fc: aload 24
      // 0fe: getfield net/minecraft/world/phys/Vec3.x D
      // 101: dneg
      // 102: aload 24
      // 104: getfield net/minecraft/world/phys/Vec3.y D
      // 107: dneg
      // 108: aload 24
      // 10a: getfield net/minecraft/world/phys/Vec3.z D
      // 10d: dneg
      // 10e: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 111: aload 18
      // 113: astore 25
      // 115: bipush 0
      // 116: istore 26
      // 118: aload 1
      // 119: aload 25
      // 11b: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 120: pop
      // 121: nop
      // 122: nop
      // 123: nop
      // 124: aload 20
      // 126: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 129: goto 136
      // 12c: astore 25
      // 12e: aload 20
      // 130: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 133: aload 25
      // 135: athrow
      // 136: nop
      // 137: nop
      // 138: nop
      // 139: nop
      // 13a: aload 12
      // 13c: aload 15
      // 13e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 141: goto 150
      // 144: astore 16
      // 146: aload 12
      // 148: aload 15
      // 14a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 14d: aload 16
      // 14f: athrow
      // 150: nop
      // 151: nop
      // 152: iload 2
      // 153: ifeq 21c
      // 156: aload 9
      // 158: astore 10
      // 15a: bipush 0
      // 15b: istore 11
      // 15d: aload 10
      // 15f: astore 12
      // 161: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 164: astore 13
      // 166: bipush 0
      // 167: istore 14
      // 169: aload 12
      // 16b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 16e: astore 15
      // 170: aload 12
      // 172: aload 13
      // 174: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 177: nop
      // 178: aload 12
      // 17a: astore 17
      // 17c: bipush 0
      // 17d: istore 18
      // 17f: aload 17
      // 181: astore 19
      // 183: bipush 0
      // 184: istore 20
      // 186: aload 19
      // 188: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 18b: astore 21
      // 18d: bipush 0
      // 18e: istore 22
      // 190: aload 21
      // 192: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 195: nop
      // 196: aload 21
      // 198: astore 23
      // 19a: bipush 0
      // 19b: istore 24
      // 19d: aload 19
      // 19f: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 1a2: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 1a5: dup
      // 1a6: sipush -12389
      // 1a9: sipush 32648
      // 1ac: pop2
      // 1ad: ldc "position(...)"
      // 1af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1b2: astore 25
      // 1b4: aload 23
      // 1b6: aload 25
      // 1b8: getfield net/minecraft/world/phys/Vec3.x D
      // 1bb: dneg
      // 1bc: aload 25
      // 1be: getfield net/minecraft/world/phys/Vec3.y D
      // 1c1: dneg
      // 1c2: aload 25
      // 1c4: getfield net/minecraft/world/phys/Vec3.z D
      // 1c7: dneg
      // 1c8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 1cb: aload 19
      // 1cd: astore 26
      // 1cf: bipush 0
      // 1d0: istore 27
      // 1d2: aload 1
      // 1d3: aload 26
      // 1d5: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1da: pop
      // 1db: nop
      // 1dc: nop
      // 1dd: nop
      // 1de: aload 21
      // 1e0: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 1e3: goto 1f0
      // 1e6: astore 26
      // 1e8: aload 21
      // 1ea: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 1ed: aload 26
      // 1ef: athrow
      // 1f0: nop
      // 1f1: nop
      // 1f2: nop
      // 1f3: nop
      // 1f4: aload 12
      // 1f6: aload 15
      // 1f8: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1fb: goto 20a
      // 1fe: astore 16
      // 200: aload 12
      // 202: aload 15
      // 204: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 207: aload 16
      // 209: athrow
      // 20a: nop
      // 20b: nop
      // 20c: iload 2
      // 20d: ifeq 21c
      // 210: new kotlin/NoWhenBranchMatchedException
      // 213: dup
      // 214: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 217: athrow
      // 218: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21b: athrow
      // 21c: aload 9
      // 21e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 221: sipush 2848
      // 224: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 227: goto 23a
      // 22a: astore 28
      // 22c: aload 9
      // 22e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 231: sipush 2848
      // 234: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 237: aload 28
      // 239: athrow
      // 23a: nop
      // 23b: goto 258
      // 23e: astore 4
      // 240: aload 4
      // 242: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 245: sipush -12373
      // 248: sipush 22767
      // 24b: pop2
      // 24c: ldc_w "[Outline] paintGlowMask draw failed: "
      // 24f: swap
      // 250: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 255: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 258: return
   }

   private final RenderTarget h() {
      Object var6 = null; // PX-FIX
      boolean var1 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();

      RenderTarget var2;
      try {
         RenderTarget var7;
         label28: {
            label27: {
               label26: {
                  try {
                     var6 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                     if (var1) {
                        break label27;
                     }

                     if (!lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
                        break label26;
                     }
                  } catch (Throwable var4) {
                     throw (RuntimeException)a(var4);
                  }

                  var6 = false;
                  break label27;
               }

               var7 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c();
               break label28;
            }

            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll =((Boolean)( var6));
            var7 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d();
         }

         var2 = var7;
      } catch (Throwable var5) {
         String var10000 = var5.getMessage();
         short var10001 = -12396;
         short var10002 = 19967;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Outline] outline mask init failed: " + var10000);
         var2 = null;
      }

      return var2;
   }

   private final RenderTarget i() {
      Object var6 = null; // PX-FIX
      boolean var1 = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();

      RenderTarget var2;
      try {
         RenderTarget var7;
         label28: {
            label27: {
               label26: {
                  try {
                     var6 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                     if (var1) {
                        break label27;
                     }

                     if (!IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
                        break label26;
                     }
                  } catch (Throwable var4) {
                     throw (RuntimeException)a(var4);
                  }

                  var6 = false;
                  break label27;
               }

               var7 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.c();
               break label28;
            }

            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII =((Boolean)( var6));
            var7 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.d();
         }

         var2 = var7;
      } catch (Throwable var5) {
         String var10000 = var5.getMessage();
         short var10001 = -12362;
         short var10002 = 26863;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Outline] glow mask init failed: " + var10000);
         var2 = null;
      }

      return var2;
   }

   @SubscribeEvent(
      priority = EventPriority.LOWEST
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");

      boolean var3 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var4 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
      me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;

      float var5 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      float var6 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      float var7 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      boolean var8 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0.0f;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0.0f;

      if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level == null) {
         return;
      }

      if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player == null) {
         return;
      }

      com.mojang.blaze3d.pipeline.RenderTarget var10 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getMainRenderTarget();
      if (var10 == null) {
         return;
      }

      try {
         if (var4 && var6 > 0.0F) {
            com.mojang.blaze3d.pipeline.RenderTarget var11 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.c();
            com.mojang.blaze3d.textures.GpuTextureView var12 = var11 != null ? var11.getColorTextureView() : null;
            if (var12 != null) {
               this.a(var12, var10, var6, var7, var8, this.a());
            }
         }

         if (var3 && var5 > 0.0F) {
            com.mojang.blaze3d.pipeline.RenderTarget var13 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c();
            com.mojang.blaze3d.textures.GpuTextureView var14 = var13 != null ? var13.getColorTextureView() : null;
            if (var14 != null) {
               this.a(var14, var10, var5, this.c());
            }
         }
      } catch (Throwable var15) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Outline] composite failed:" + var15.getMessage());
      }
   }

   @JvmStatic
   public static final void a(@NotNull RenderTarget param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: sipush -12353
      // 004: sipush -15376
      // 007: pop2
      // 008: ldc_w "entityOutlineTarget"
      // 00b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00e: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 011: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 014: fstore 2
      // 015: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl F
      // 018: fstore 3
      // 019: istore 1
      // 01a: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll F
      // 01d: fstore 4
      // 01f: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Z
      // 022: istore 5
      // 024: bipush 0
      // 025: putstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 028: fconst_0
      // 029: putstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 02c: fconst_0
      // 02d: putstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl F
      // 030: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 033: iload 1
      // 034: ifne 04e
      // 037: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 03a: ifnull 054
      // 03d: goto 044
      // 040: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 047: goto 04e
      // 04a: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 051: ifnonnull 059
      // 054: return
      // 055: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: fload 2
      // 05a: fconst_0
      // 05b: fcmpg
      // 05c: iload 1
      // 05d: ifne 074
      // 060: ifgt 078
      // 063: goto 06a
      // 066: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: fload 3
      // 06b: fconst_0
      // 06c: fcmpg
      // 06d: goto 074
      // 070: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: ifgt 078
      // 077: return
      // 078: aload 0
      // 079: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 07c: dup
      // 07d: ifnonnull 086
      // 080: pop
      // 081: return
      // 082: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: astore 6
      // 088: iload 1
      // 089: ifne 0a5
      // 08c: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 08f: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 092: dup
      // 093: ifnonnull 0a6
      // 096: goto 09d
      // 099: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: pop
      // 09e: goto 0a5
      // 0a1: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: return
      // 0a6: astore 7
      // 0a8: nop
      // 0a9: fload 2
      // 0aa: fconst_0
      // 0ab: fcmpl
      // 0ac: iload 1
      // 0ad: ifne 15d
      // 0b0: ifle 15a
      // 0b3: goto 0ba
      // 0b6: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 0bd: bipush 0
      // 0be: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.a (Z)Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0c1: astore 8
      // 0c3: iload 1
      // 0c4: ifne 0df
      // 0c7: aload 8
      // 0c9: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 0cc: dup
      // 0cd: ifnonnull 0e0
      // 0d0: goto 0d7
      // 0d3: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: pop
      // 0d8: goto 0df
      // 0db: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: return
      // 0e0: astore 9
      // 0e2: iload 1
      // 0e3: ifne 0fe
      // 0e6: aload 8
      // 0e8: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0eb: dup
      // 0ec: ifnonnull 0ff
      // 0ef: goto 0f6
      // 0f2: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: pop
      // 0f7: goto 0fe
      // 0fa: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: return
      // 0ff: astore 10
      // 101: aload 9
      // 103: astore 11
      // 105: aload 6
      // 107: astore 12
      // 109: bipush 0
      // 10a: istore 13
      // 10c: bipush 0
      // 10d: istore 14
      // 10f: bipush 0
      // 110: istore 15
      // 112: bipush 0
      // 113: istore 16
      // 115: bipush 0
      // 116: istore 17
      // 118: aload 12
      // 11a: iload 13
      // 11c: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getWidth (I)I
      // 11f: istore 18
      // 121: aload 12
      // 123: iload 13
      // 125: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getHeight (I)I
      // 128: istore 19
      // 12a: bipush 0
      // 12b: istore 20
      // 12d: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 130: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 133: aload 12
      // 135: aload 11
      // 137: iload 13
      // 139: iload 14
      // 13b: iload 15
      // 13d: iload 16
      // 13f: iload 17
      // 141: iload 18
      // 143: iload 19
      // 145: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.copyTextureToTexture (Lcom/mojang/blaze3d/textures/GpuTexture;Lcom/mojang/blaze3d/textures/GpuTexture;IIIIIII)V
      // 148: nop
      // 149: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 14c: aload 10
      // 14e: aload 7
      // 150: fload 2
      // 151: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 154: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.d ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 157: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/pipeline/RenderTarget;FLcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 15a: fload 3
      // 15b: fconst_0
      // 15c: fcmpl
      // 15d: ifle 204
      // 160: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 163: bipush 0
      // 164: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.a (Z)Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 167: astore 8
      // 169: iload 1
      // 16a: ifne 185
      // 16d: aload 8
      // 16f: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 172: dup
      // 173: ifnonnull 186
      // 176: goto 17d
      // 179: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: pop
      // 17e: goto 185
      // 181: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 184: athrow
      // 185: return
      // 186: astore 9
      // 188: iload 1
      // 189: ifne 1a4
      // 18c: aload 8
      // 18e: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 191: dup
      // 192: ifnonnull 1a5
      // 195: goto 19c
      // 198: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: pop
      // 19d: goto 1a4
      // 1a0: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: return
      // 1a5: astore 10
      // 1a7: aload 9
      // 1a9: astore 11
      // 1ab: aload 6
      // 1ad: astore 12
      // 1af: bipush 0
      // 1b0: istore 13
      // 1b2: bipush 0
      // 1b3: istore 14
      // 1b5: bipush 0
      // 1b6: istore 15
      // 1b8: bipush 0
      // 1b9: istore 16
      // 1bb: bipush 0
      // 1bc: istore 17
      // 1be: aload 12
      // 1c0: iload 13
      // 1c2: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getWidth (I)I
      // 1c5: istore 18
      // 1c7: aload 12
      // 1c9: iload 13
      // 1cb: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getHeight (I)I
      // 1ce: istore 19
      // 1d0: bipush 0
      // 1d1: istore 20
      // 1d3: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 1d6: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 1d9: aload 12
      // 1db: aload 11
      // 1dd: iload 13
      // 1df: iload 14
      // 1e1: iload 15
      // 1e3: iload 16
      // 1e5: iload 17
      // 1e7: iload 18
      // 1e9: iload 19
      // 1eb: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.copyTextureToTexture (Lcom/mojang/blaze3d/textures/GpuTexture;Lcom/mojang/blaze3d/textures/GpuTexture;IIIIIII)V
      // 1ee: nop
      // 1ef: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 1f2: aload 10
      // 1f4: aload 7
      // 1f6: fload 3
      // 1f7: fload 4
      // 1f9: iload 5
      // 1fb: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 1fe: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.b ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 201: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/pipeline/RenderTarget;FFZLcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 204: aload 6
      // 206: astore 8
      // 208: bipush 0
      // 209: istore 9
      // 20b: bipush 0
      // 20c: istore 10
      // 20e: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 211: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 214: aload 8
      // 216: iload 9
      // 218: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.clearColorTexture (Lcom/mojang/blaze3d/textures/GpuTexture;I)V
      // 21b: bipush 1
      // 21c: putstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 21f: goto 23c
      // 222: astore 8
      // 224: aload 8
      // 226: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 229: sipush -12356
      // 22c: sipush 13211
      // 22f: pop2
      // 230: ldc_w "[Outline] vanilla silhouette composite failed: "
      // 233: swap
      // 234: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 239: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 23c: return
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -12378;
      short var10002 = 18994;
      Intrinsics.checkNotNullParameter(var1, "event");
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0.0F;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0.0F;
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.0F;
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;

      try {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.close();
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.close();
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.close();
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.close();
      } catch (Throwable var3) {
         String var10000 = var3.getMessage();
         var10001 = -12379;
         var10002 = 28311;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[Outline] FBO close on world change failed: " + var10000);
      }
   }

   private final void a(GpuTextureView param1, RenderTarget param2, float param3, GpuBufferSlice param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 003: istore 5
      // 005: fload 3
      // 006: fconst_0
      // 007: fcmpg
      // 008: ifgt 010
      // 00b: return
      // 00c: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00f: athrow
      // 010: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 013: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.d ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 016: astore 6
      // 018: iload 5
      // 01a: ifeq 035
      // 01d: aload 6
      // 01f: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 022: dup
      // 023: ifnonnull 036
      // 026: goto 02d
      // 029: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: pop
      // 02e: goto 035
      // 031: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: return
      // 036: astore 7
      // 038: aload 4
      // 03a: astore 8
      // 03c: bipush 0
      // 03d: istore 9
      // 03f: aload 8
      // 041: astore 10
      // 043: bipush 0
      // 044: istore 11
      // 046: bipush 1
      // 047: istore 12
      // 049: bipush 0
      // 04a: istore 13
      // 04c: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 04f: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 052: aload 10
      // 054: iload 11
      // 056: iload 12
      // 058: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 05b: dup
      // 05c: sipush -12384
      // 05f: sipush 15303
      // 062: pop2
      // 063: ldc_w "mapBuffer(...)"
      // 066: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 069: checkcast java/lang/AutoCloseable
      // 06c: astore 10
      // 06e: aconst_null
      // 06f: astore 11
      // 071: nop
      // 072: aload 10
      // 074: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 077: astore 12
      // 079: bipush 0
      // 07a: istore 13
      // 07c: aload 12
      // 07e: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 083: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 086: dup
      // 087: sipush -12395
      // 08a: sipush 15411
      // 08d: pop2
      // 08e: ldc_w "intoBuffer(...)"
      // 091: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 094: astore 14
      // 096: aload 14
      // 098: astore 15
      // 09a: bipush 0
      // 09b: istore 16
      // 09d: aload 15
      // 09f: fconst_0
      // 0a0: fload 3
      // 0a1: fconst_0
      // 0a2: fconst_0
      // 0a3: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 0a6: pop
      // 0a7: nop
      // 0a8: nop
      // 0a9: nop
      // 0aa: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0ad: astore 12
      // 0af: aload 10
      // 0b1: aload 11
      // 0b3: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 0b6: goto 0ce
      // 0b9: astore 13
      // 0bb: aload 13
      // 0bd: astore 11
      // 0bf: aload 13
      // 0c1: athrow
      // 0c2: astore 13
      // 0c4: aload 10
      // 0c6: aload 11
      // 0c8: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 0cb: aload 13
      // 0cd: athrow
      // 0ce: nop
      // 0cf: aload 6
      // 0d1: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.s ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 0d6: aconst_null
      // 0d7: aconst_null
      // 0d8: bipush 0
      // 0d9: bipush 0
      // 0da: bipush 30
      // 0dc: aconst_null
      // 0dd: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 0e0: checkcast java/lang/AutoCloseable
      // 0e3: astore 8
      // 0e5: aconst_null
      // 0e6: astore 9
      // 0e8: nop
      // 0e9: aload 8
      // 0eb: checkcast com/mojang/blaze3d/systems/RenderPass
      // 0ee: astore 10
      // 0f0: bipush 0
      // 0f1: istore 11
      // 0f3: aload 10
      // 0f5: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 0f8: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 0fb: aload 10
      // 0fd: sipush -12381
      // 100: sipush -23778
      // 103: pop2
      // 104: ldc_w "MaskSampler"
      // 107: aload 1
      // 108: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 10b: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.e ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 10e: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 111: aload 10
      // 113: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 116: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 119: aload 4
      // 11b: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 11e: aload 10
      // 120: bipush 0
      // 121: bipush 3
      // 122: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 125: nop
      // 126: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 129: astore 10
      // 12b: aload 8
      // 12d: aload 9
      // 12f: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 132: goto 14a
      // 135: astore 11
      // 137: aload 11
      // 139: astore 9
      // 13b: aload 11
      // 13d: athrow
      // 13e: astore 11
      // 140: aload 8
      // 142: aload 9
      // 144: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 147: aload 11
      // 149: athrow
      // 14a: aload 2
      // 14b: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.t ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 150: aconst_null
      // 151: aconst_null
      // 152: bipush 0
      // 153: bipush 0
      // 154: bipush 30
      // 156: aconst_null
      // 157: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 15a: checkcast java/lang/AutoCloseable
      // 15d: astore 8
      // 15f: aconst_null
      // 160: astore 9
      // 162: nop
      // 163: aload 8
      // 165: checkcast com/mojang/blaze3d/systems/RenderPass
      // 168: astore 10
      // 16a: bipush 0
      // 16b: istore 11
      // 16d: aload 10
      // 16f: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 172: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 175: aload 10
      // 177: sipush -12372
      // 17a: sipush 10060
      // 17d: pop2
      // 17e: ldc_w "MaskSampler"
      // 181: aload 7
      // 183: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 186: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.e ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 189: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 18c: aload 10
      // 18e: sipush -12374
      // 191: sipush -23436
      // 194: pop2
      // 195: ldc_w "OriginalMaskSampler"
      // 198: aload 1
      // 199: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 19c: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.e ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 19f: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 1a2: aload 10
      // 1a4: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 1a7: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 1aa: aload 4
      // 1ac: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 1af: aload 10
      // 1b1: bipush 0
      // 1b2: bipush 3
      // 1b3: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 1b6: nop
      // 1b7: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1ba: astore 10
      // 1bc: aload 8
      // 1be: aload 9
      // 1c0: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 1c3: goto 1db
      // 1c6: astore 11
      // 1c8: aload 11
      // 1ca: astore 9
      // 1cc: aload 11
      // 1ce: athrow
      // 1cf: astore 11
      // 1d1: aload 8
      // 1d3: aload 9
      // 1d5: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 1d8: aload 11
      // 1da: athrow
      // 1db: return
   }

   private final void a(GpuTextureView param1, RenderTarget param2, float param3, float param4, boolean param5, GpuBufferSlice param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 003: istore 7
      // 005: fload 3
      // 006: fconst_0
      // 007: fcmpg
      // 008: ifgt 010
      // 00b: return
      // 00c: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00f: athrow
      // 010: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 013: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.d ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 016: astore 8
      // 018: iload 7
      // 01a: ifeq 035
      // 01d: aload 8
      // 01f: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 022: dup
      // 023: ifnonnull 036
      // 026: goto 02d
      // 029: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: pop
      // 02e: goto 035
      // 031: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: return
      // 036: astore 9
      // 038: aload 6
      // 03a: astore 10
      // 03c: bipush 0
      // 03d: istore 11
      // 03f: aload 10
      // 041: astore 12
      // 043: bipush 0
      // 044: istore 13
      // 046: bipush 1
      // 047: istore 14
      // 049: bipush 0
      // 04a: istore 15
      // 04c: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 04f: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 052: aload 12
      // 054: iload 13
      // 056: iload 14
      // 058: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 05b: dup
      // 05c: sipush -12354
      // 05f: sipush -7705
      // 062: pop2
      // 063: ldc_w "mapBuffer(...)"
      // 066: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 069: checkcast java/lang/AutoCloseable
      // 06c: astore 12
      // 06e: aconst_null
      // 06f: astore 13
      // 071: nop
      // 072: aload 12
      // 074: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 077: astore 14
      // 079: bipush 0
      // 07a: istore 15
      // 07c: aload 14
      // 07e: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 083: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 086: dup
      // 087: sipush -12392
      // 08a: sipush -5736
      // 08d: pop2
      // 08e: ldc_w "intoBuffer(...)"
      // 091: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 094: astore 16
      // 096: aload 16
      // 098: astore 17
      // 09a: bipush 0
      // 09b: istore 18
      // 09d: aload 17
      // 09f: fconst_0
      // 0a0: iload 5
      // 0a2: ifeq 0ad
      // 0a5: fconst_1
      // 0a6: goto 0ae
      // 0a9: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: fconst_0
      // 0ae: fload 3
      // 0af: fload 4
      // 0b1: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 0b4: pop
      // 0b5: nop
      // 0b6: nop
      // 0b7: nop
      // 0b8: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0bb: astore 14
      // 0bd: aload 12
      // 0bf: aload 13
      // 0c1: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 0c4: goto 0dc
      // 0c7: astore 15
      // 0c9: aload 15
      // 0cb: astore 13
      // 0cd: aload 15
      // 0cf: athrow
      // 0d0: astore 15
      // 0d2: aload 12
      // 0d4: aload 13
      // 0d6: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 0d9: aload 15
      // 0db: athrow
      // 0dc: nop
      // 0dd: aload 8
      // 0df: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.u ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 0e4: aconst_null
      // 0e5: aconst_null
      // 0e6: bipush 0
      // 0e7: bipush 0
      // 0e8: bipush 30
      // 0ea: aconst_null
      // 0eb: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 0ee: checkcast java/lang/AutoCloseable
      // 0f1: astore 10
      // 0f3: aconst_null
      // 0f4: astore 11
      // 0f6: nop
      // 0f7: aload 10
      // 0f9: checkcast com/mojang/blaze3d/systems/RenderPass
      // 0fc: astore 12
      // 0fe: bipush 0
      // 0ff: istore 13
      // 101: aload 12
      // 103: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 106: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 109: aload 12
      // 10b: sipush -12372
      // 10e: sipush 10060
      // 111: pop2
      // 112: ldc_w "MaskSampler"
      // 115: aload 1
      // 116: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 119: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.e ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 11c: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 11f: aload 12
      // 121: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 124: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 127: aload 6
      // 129: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 12c: aload 12
      // 12e: bipush 0
      // 12f: bipush 3
      // 130: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 133: nop
      // 134: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 137: astore 12
      // 139: aload 10
      // 13b: aload 11
      // 13d: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 140: goto 158
      // 143: astore 13
      // 145: aload 13
      // 147: astore 11
      // 149: aload 13
      // 14b: athrow
      // 14c: astore 13
      // 14e: aload 10
      // 150: aload 11
      // 152: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 155: aload 13
      // 157: athrow
      // 158: aload 2
      // 159: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.v ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 15e: aconst_null
      // 15f: aconst_null
      // 160: bipush 0
      // 161: bipush 0
      // 162: bipush 30
      // 164: aconst_null
      // 165: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 168: checkcast java/lang/AutoCloseable
      // 16b: astore 10
      // 16d: aconst_null
      // 16e: astore 11
      // 170: nop
      // 171: aload 10
      // 173: checkcast com/mojang/blaze3d/systems/RenderPass
      // 176: astore 12
      // 178: bipush 0
      // 179: istore 13
      // 17b: aload 12
      // 17d: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 180: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 183: aload 12
      // 185: sipush -12372
      // 188: sipush 10060
      // 18b: pop2
      // 18c: ldc_w "MaskSampler"
      // 18f: aload 9
      // 191: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 194: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.e ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 197: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 19a: aload 12
      // 19c: sipush -12391
      // 19f: sipush -4440
      // 1a2: pop2
      // 1a3: ldc_w "OriginalMaskSampler"
      // 1a6: aload 1
      // 1a7: getstatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
      // 1aa: invokespecial me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.e ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 1ad: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 1b0: aload 12
      // 1b2: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 1b5: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 1b8: aload 6
      // 1ba: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 1bd: aload 12
      // 1bf: bipush 0
      // 1c0: bipush 3
      // 1c1: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 1c4: nop
      // 1c5: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1c8: astore 12
      // 1ca: aload 10
      // 1cc: aload 11
      // 1ce: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 1d1: goto 1e9
      // 1d4: astore 13
      // 1d6: aload 13
      // 1d8: astore 11
      // 1da: aload 13
      // 1dc: athrow
      // 1dd: astore 13
      // 1df: aload 10
      // 1e1: aload 11
      // 1e3: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 1e6: aload 13
      // 1e8: athrow
      // 1e9: return
   }

   private static final String j() {
      short var10000 = -12394;
      short var10001 = -18244;
      return "Polinex Painted Glow UBO";
   }

   private static final GpuBufferSlice k() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .a(lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::j);
   }

   private static final String l() {
      short var10000 = -12364;
      short var10001 = -22210;
      return "Polinex Vanilla Glow UBO";
   }

   private static final GpuBufferSlice m() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .a(lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::l);
   }

   private static final String n() {
      short var10000 = -12398;
      short var10001 = -260;
      return "Polinex Painted Outline UBO";
   }

   private static final GpuBufferSlice o() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .a(lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::n);
   }

   private static final String p() {
      short var10000 = -12361;
      short var10001 = -27427;
      return "Polinex Vanilla Outline UBO";
   }

   private static final GpuBufferSlice q() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .a(lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::p);
   }

   private static final GpuSampler r() {
      return RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR);
   }

   private static final Unit a(
      AABB var0,
      llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var2
   ) {
      short var10001 = -12355;
      short var10002 = 12557;
      Intrinsics.checkNotNullParameter(var2, "$this$paintOutlineMask");
      lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a(var2, var0, var1, null, 0, 0, 0.0F);
      return Unit.INSTANCE;
   }

   private static final Unit b(
      AABB var0,
      llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1,
      IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var2
   ) {
      short var10001 = -12358;
      short var10002 = 4893;
      Intrinsics.checkNotNullParameter(var2, "$this$paintGlowMask");
      lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a(var2, var0, var1, null, 0, 0, 0.0F);
      return Unit.INSTANCE;
   }

   private static final String s() {
      short var10000 = -12390;
      short var10001 = -31702;
      return "Polinex Outline H";
   }

   private static final String t() {
      short var10000 = -12359;
      short var10001 = 8234;
      return "Polinex Outline V";
   }

   private static final String u() {
      short var10000 = -12385;
      short var10001 = 7678;
      return "Polinex Glow H";
   }

   private static final String v() {
      short var10000 = -12367;
      short var10001 = 12570;
      return "Polinex Glow V";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[47];
      int var3 = 0;
      String var2 = "\u0013`\u009b ¸(p\"\u0092ìã^éÓ\u0013ÝÆO±§[\u009b åê\u008c\u0012ào\\\u0005èZ\"/a¨ dsO; Ý¤\u0098\u0011\u0095Ü\u0095÷{\u009c\u0091\u008e\u0099\u0015ùû{\u0010\u0082Gb\u0006N\u0001ûß¨ø8w~\u0081Ú)\u0092@\u009eXÛ\u0016ßÎzé\u0099\r\u0084\u0088Ã{ëC¢`\u000bÛ§ùÚÇ\u00166\u0013åÚ=kq]\u0099\u0082`:\u009fc5vØEª\u009c³\u0012¹>\u0081àkÁ\u0094×\u0014õ\tÌÙW°\u00ad\u009aÔ\u001cñø2n1\u000es\bÔ¡¬¿§ß³²Ô\u009c{\u0019\u001a\u008eÄ¹\u001arà\\\u0011\u0000P\u007fB 9\u0015&ÞÜªì\u0096È\u001bÞµ!e\u008f \u0080cÓ9³\u009dÖ\u0081R\u0084\u0006ÚpW\u001e\f®4wïp:RRS\u0083\u000f¼±\u009f\u001bëæ\u0002\u0094\u000fãà}y£~\u0090Pàb\u0099\u0007Áòß\u0017\u009c\u0087YÏ\u008d\u0019\u0018¨\u009fj»\u0002\u0006AÁM4øb\u0080¾xRL¡\u0089òIz\u000b¶\u0005ôå´òÅ\r¡;p/§\u0098»Ñ\u0099þ\u0093Úà\u0014¹\u0018HKF\u0018É\u0002EXÙ|øÚÖ\u009c\n}µÜ(W\u0006æ±«õ w¾NòL\u0019pû¦¹¥@w]'\u0001\u0005\u0014FïpCÃj¶rÃW±\u008fú¡W\u000eBñ7v©¿4öòß=\u00adU \u0012\u007fSYMpt÷ax#\u0084\u0016h\f\u0086Æ\\¹\u0003Õ\u009f¥\u000bÏ«'ðj)Ãð\u0090L\"\u0005YQ\u0001ds\u0013úrÙ¶Öc%Kà (ò\u001bãß\u0005\u001e\u0018\u0090%Ñ\u000b6\u0010±ÁcñÖ\u009eÿV¸3ÏÆ&»\u0092èpbl8L\u0091P£\u008fÏý\u0099^B\u0094S\u001e\u0006 /d Ù~\u0003 ºâ\u0005¿±\u0012C?\b*\u0080¸\u008cD\u009esG\u0003)\u008aÓ,\u001bCo\u0019\u009aà\u0006Õz\u001a\\å\u001aLn\u0085ä\u0081»]\u000b\t\u0087¼\u0018¼½\u0015\u009emÖ`\u0011v>\u008d,½åVÍ\u0095¢>\u0015\u0097û\u008d7þ\u0097Þó¯\u007f\u0096¹ 9©ôZ\u0000Ë6b\u000b\u0090TÌ\u000f\u0017Öl\u000fe³\u009c\u000eK®\u0090yÙ\u0013\\E\u0017\u0000SÃÿ`\u0003:eX\r<\u00151\u009e}sM\u0002\u001eîcØþ\u000e\u0018#|,Àô\u0019\u009fWò\u0089\bÃ\n\bû\u008c\u0082\r\u0003®\u009bA\u0018ST\u0015Âí)¼$ë\u009c\fäBÉ\u0081þý9èQú\u0082}Ø\u0011ÚZ$\u0003Ë\u0011x#s|\u001fø JÍ\u008eq\r°ÃR0ã{3\u00ad\u0088q±+¤\u000fñ$Gë\u0090Ú¤\u000e\u001fP¡Øg\u0004Æ\u0013¸\u009e\u0091+ßÐ\u0004=Än¬+\u008bØÍb\\ôØ\u0018\"t;Æ(©\u00044ã\u008aì²ýJÉäßwû(\u0007!ÂÝ\u0011æÍ£ñ;Ofè¸\u001ctÕ|©*E/$C\u0080daûï*4ÿ&ÅU\u001eÇ¸3\u007fF\u008bÝ\u0018uz\u0088¦üS!\u001e%I&È\u00110\u0002\u000f\u001dHÚf#kÒ8Ñ\u0096x\u0000\\\u001f¡\u001b\u0096Î\u00ad\u0091úC^i¨!\u0085ÇÐäl1cÔ~}\u0086ÈµÓ\u0089ÜÑ";
      int var4 = "\u0013`\u009b ¸(p\"\u0092ìã^éÓ\u0013ÝÆO±§[\u009b åê\u008c\u0012ào\\\u0005èZ\"/a¨ dsO; Ý¤\u0098\u0011\u0095Ü\u0095÷{\u009c\u0091\u008e\u0099\u0015ùû{\u0010\u0082Gb\u0006N\u0001ûß¨ø8w~\u0081Ú)\u0092@\u009eXÛ\u0016ßÎzé\u0099\r\u0084\u0088Ã{ëC¢`\u000bÛ§ùÚÇ\u00166\u0013åÚ=kq]\u0099\u0082`:\u009fc5vØEª\u009c³\u0012¹>\u0081àkÁ\u0094×\u0014õ\tÌÙW°\u00ad\u009aÔ\u001cñø2n1\u000es\bÔ¡¬¿§ß³²Ô\u009c{\u0019\u001a\u008eÄ¹\u001arà\\\u0011\u0000P\u007fB 9\u0015&ÞÜªì\u0096È\u001bÞµ!e\u008f \u0080cÓ9³\u009dÖ\u0081R\u0084\u0006ÚpW\u001e\f®4wïp:RRS\u0083\u000f¼±\u009f\u001bëæ\u0002\u0094\u000fãà}y£~\u0090Pàb\u0099\u0007Áòß\u0017\u009c\u0087YÏ\u008d\u0019\u0018¨\u009fj»\u0002\u0006AÁM4øb\u0080¾xRL¡\u0089òIz\u000b¶\u0005ôå´òÅ\r¡;p/§\u0098»Ñ\u0099þ\u0093Úà\u0014¹\u0018HKF\u0018É\u0002EXÙ|øÚÖ\u009c\n}µÜ(W\u0006æ±«õ w¾NòL\u0019pû¦¹¥@w]'\u0001\u0005\u0014FïpCÃj¶rÃW±\u008fú¡W\u000eBñ7v©¿4öòß=\u00adU \u0012\u007fSYMpt÷ax#\u0084\u0016h\f\u0086Æ\\¹\u0003Õ\u009f¥\u000bÏ«'ðj)Ãð\u0090L\"\u0005YQ\u0001ds\u0013úrÙ¶Öc%Kà (ò\u001bãß\u0005\u001e\u0018\u0090%Ñ\u000b6\u0010±ÁcñÖ\u009eÿV¸3ÏÆ&»\u0092èpbl8L\u0091P£\u008fÏý\u0099^B\u0094S\u001e\u0006 /d Ù~\u0003 ºâ\u0005¿±\u0012C?\b*\u0080¸\u008cD\u009esG\u0003)\u008aÓ,\u001bCo\u0019\u009aà\u0006Õz\u001a\\å\u001aLn\u0085ä\u0081»]\u000b\t\u0087¼\u0018¼½\u0015\u009emÖ`\u0011v>\u008d,½åVÍ\u0095¢>\u0015\u0097û\u008d7þ\u0097Þó¯\u007f\u0096¹ 9©ôZ\u0000Ë6b\u000b\u0090TÌ\u000f\u0017Öl\u000fe³\u009c\u000eK®\u0090yÙ\u0013\\E\u0017\u0000SÃÿ`\u0003:eX\r<\u00151\u009e}sM\u0002\u001eîcØþ\u000e\u0018#|,Àô\u0019\u009fWò\u0089\bÃ\n\bû\u008c\u0082\r\u0003®\u009bA\u0018ST\u0015Âí)¼$ë\u009c\fäBÉ\u0081þý9èQú\u0082}Ø\u0011ÚZ$\u0003Ë\u0011x#s|\u001fø JÍ\u008eq\r°ÃR0ã{3\u00ad\u0088q±+¤\u000fñ$Gë\u0090Ú¤\u000e\u001fP¡Øg\u0004Æ\u0013¸\u009e\u0091+ßÐ\u0004=Än¬+\u008bØÍb\\ôØ\u0018\"t;Æ(©\u00044ã\u008aì²ýJÉäßwû(\u0007!ÂÝ\u0011æÍ£ñ;Ofè¸\u001ctÕ|©*E/$C\u0080daûï*4ÿ&ÅU\u001eÇ¸3\u007fF\u008bÝ\u0018uz\u0088¦üS!\u001e%I&È\u00110\u0002\u000f\u001dHÚf#kÒ8Ñ\u0096x\u0000\\\u001f¡\u001b\u0096Î\u00ad\u0091úC^i¨!\u0085ÇÐäl1cÔ~}\u0086ÈµÓ\u0089ÜÑ"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 109;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = var10000;
               var20 = var28;
               int var14 = var10004;
               byte var40;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var28;
                  var40 = var10000;
                  var10006 = var6;
               } else {
                  var31 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var44 = var28;
                  var40 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var44[var10006] = (char)(var44[var10006] ^ var40 ^ switch (var6 % 7) {
                     case 0 -> 6;
                     case 1 -> 99;
                     case 2 -> 73;
                     case 3 -> 15;
                     case 4 -> 41;
                     case 5 -> 113;
                     default -> 63;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var44 = var20;
                     var40 = var31;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var44 = var20;
                     var40 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[47];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl();
                     var10002 = -12387;
                     short var34 = 30634;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
                        "Polinex Outline Mask FBO", false, 0, 4, null
                     );
                     var10002 = -12382;
                     short var35 = 12611;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
                        "Polinex Glow Mask FBO", false, 0, 4, null
                     );
                     var10002 = -12393;
                     short var36 = 11357;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
                        "Polinex Glow Ping", false, 0, 4, null
                     );
                     var10002 = -12365;
                     short var37 = -27234;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
                        "Polinex Outline Ping", false, 0, 4, null
                     );
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 1.5F;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 1.5F;
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = LazyKt.lazy(
                        lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::k
                     );
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = LazyKt.lazy(
                        lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::m
                     );
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = LazyKt.lazy(
                        lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::o
                     );
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = LazyKt.lazy(
                        lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::q
                     );
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = LazyKt.lazy(
                        lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl::r
                     );
                     llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "£îOvJ\u0006\u0080|¾\u0094\\6";
                  var4 = "£îOvJ\u0006\u0080|¾\u0094\\6".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 57;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12354) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 236;
            case 1 -> 218;
            case 2 -> 51;
            case 3 -> 75;
            case 4 -> 111;
            case 5 -> 62;
            case 6 -> 246;
            case 7 -> 135;
            case 8 -> 234;
            case 9 -> 3;
            case 10 -> 74;
            case 11 -> 90;
            case 12 -> 182;
            case 13 -> 157;
            case 14 -> 154;
            case 15 -> 216;
            case 16 -> 78;
            case 17 -> 39;
            case 18 -> 132;
            case 19 -> 142;
            case 20 -> 247;
            case 21 -> 152;
            case 22 -> 82;
            case 23 -> 101;
            case 24 -> 71;
            case 25 -> 180;
            case 26 -> 228;
            case 27 -> 9;
            case 28 -> 6;
            case 29 -> 81;
            case 30 -> 69;
            case 31 -> 167;
            case 32 -> 122;
            case 33 -> 92;
            case 34 -> 124;
            case 35 -> 35;
            case 36 -> 44;
            case 37 -> 191;
            case 38 -> 118;
            case 39 -> 174;
            case 40 -> 140;
            case 41 -> 161;
            case 42 -> 96;
            case 43 -> 103;
            case 44 -> 17;
            case 45 -> 202;
            case 46 -> 68;
            case 47 -> 85;
            case 48 -> 105;
            case 49 -> 56;
            case 50 -> 243;
            case 51 -> 130;
            case 52 -> 138;
            case 53 -> 0;
            case 54 -> 137;
            case 55 -> 34;
            case 56 -> 66;
            case 57 -> 188;
            case 58 -> 26;
            case 59 -> 53;
            case 60 -> 86;
            case 61 -> 41;
            case 62 -> 153;
            case 63 -> 95;
            case 64 -> 89;
            case 65 -> 59;
            case 66 -> 156;
            case 67 -> 131;
            case 68 -> 23;
            case 69 -> 116;
            case 70 -> 162;
            case 71 -> 134;
            case 72 -> 84;
            case 73 -> 163;
            case 74 -> 217;
            case 75 -> 179;
            case 76 -> 49;
            case 77 -> 192;
            case 78 -> 250;
            case 79 -> 87;
            case 80 -> 252;
            case 81 -> 199;
            case 82 -> 235;
            case 83 -> 166;
            case 84 -> 80;
            case 85 -> 227;
            case 86 -> 52;
            case 87 -> 112;
            case 88 -> 220;
            case 89 -> 77;
            case 90 -> 194;
            case 91 -> 186;
            case 92 -> 233;
            case 93 -> 149;
            case 94 -> 1;
            case 95 -> 10;
            case 96 -> 255;
            case 97 -> 2;
            case 98 -> 22;
            case 99 -> 155;
            case 100 -> 248;
            case 101 -> 231;
            case 102 -> 76;
            case 103 -> 244;
            case 104 -> 60;
            case 105 -> 254;
            case 106 -> 50;
            case 107 -> 239;
            case 108 -> 93;
            case 109 -> 27;
            case 110 -> 72;
            case 111 -> 63;
            case 112 -> 108;
            case 113 -> 123;
            case 114 -> 48;
            case 115 -> 219;
            case 116 -> 187;
            case 117 -> 40;
            case 118 -> 20;
            case 119 -> 245;
            case 120 -> 210;
            case 121 -> 158;
            case 122 -> 207;
            case 123 -> 196;
            case 124 -> 57;
            case 125 -> 100;
            case 126 -> 42;
            case 127 -> 106;
            case 128 -> 13;
            case 129 -> 170;
            case 130 -> 249;
            case 131 -> 11;
            case 132 -> 160;
            case 133 -> 184;
            case 134 -> 173;
            case 135 -> 45;
            case 136 -> 5;
            case 137 -> 33;
            case 138 -> 16;
            case 139 -> 8;
            case 140 -> 141;
            case 141 -> 128;
            case 142 -> 115;
            case 143 -> 178;
            case 144 -> 32;
            case 145 -> 150;
            case 146 -> 83;
            case 147 -> 204;
            case 148 -> 114;
            case 149 -> 127;
            case 150 -> 70;
            case 151 -> 7;
            case 152 -> 65;
            case 153 -> 148;
            case 154 -> 165;
            case 155 -> 98;
            case 156 -> 185;
            case 157 -> 46;
            case 158 -> 211;
            case 159 -> 109;
            case 160 -> 159;
            case 161 -> 47;
            case 162 -> 38;
            case 163 -> 189;
            case 164 -> 99;
            case 165 -> 201;
            case 166 -> 190;
            case 167 -> 206;
            case 168 -> 232;
            case 169 -> 55;
            case 170 -> 30;
            case 171 -> 97;
            case 172 -> 110;
            case 173 -> 172;
            case 174 -> 251;
            case 175 -> 25;
            case 176 -> 215;
            case 177 -> 73;
            case 178 -> 176;
            case 179 -> 146;
            case 180 -> 125;
            case 181 -> 31;
            case 182 -> 29;
            case 183 -> 133;
            case 184 -> 58;
            case 185 -> 113;
            case 186 -> 14;
            case 187 -> 119;
            case 188 -> 208;
            case 189 -> 237;
            case 190 -> 143;
            case 191 -> 15;
            case 192 -> 205;
            case 193 -> 94;
            case 194 -> 24;
            case 195 -> 171;
            case 196 -> 253;
            case 197 -> 195;
            case 198 -> 126;
            case 199 -> 168;
            case 200 -> 193;
            case 201 -> 67;
            case 202 -> 36;
            case 203 -> 54;
            case 204 -> 117;
            case 205 -> 242;
            case 206 -> 200;
            case 207 -> 88;
            case 208 -> 91;
            case 209 -> 121;
            case 210 -> 28;
            case 211 -> 12;
            case 212 -> 129;
            case 213 -> 164;
            case 214 -> 107;
            case 215 -> 21;
            case 216 -> 203;
            case 217 -> 43;
            case 218 -> 224;
            case 219 -> 221;
            case 220 -> 64;
            case 221 -> 223;
            case 222 -> 61;
            case 223 -> 102;
            case 224 -> 145;
            case 225 -> 19;
            case 226 -> 37;
            case 227 -> 181;
            case 228 -> 225;
            case 229 -> 226;
            case 230 -> 222;
            case 231 -> 209;
            case 232 -> 18;
            case 233 -> 183;
            case 234 -> 139;
            case 235 -> 197;
            case 236 -> 238;
            case 237 -> 241;
            case 238 -> 198;
            case 239 -> 175;
            case 240 -> 4;
            case 241 -> 177;
            case 242 -> 230;
            case 243 -> 240;
            case 244 -> 212;
            case 245 -> 136;
            case 246 -> 213;
            case 247 -> 229;
            case 248 -> 120;
            case 249 -> 144;
            case 250 -> 214;
            case 251 -> 104;
            case 252 -> 151;
            case 253 -> 79;
            case 254 -> 147;
            default -> 169;
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
