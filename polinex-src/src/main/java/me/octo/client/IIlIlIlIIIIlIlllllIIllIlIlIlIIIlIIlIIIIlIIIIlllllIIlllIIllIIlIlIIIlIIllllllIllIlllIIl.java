package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final Lazy lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final Lazy IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final Lazy llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final Matrix4f IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final Matrix4f IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private double IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private double IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private double llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private Matrix4f lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final Matrix4f llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private final Matrix4f lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private final Matrix4f IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private final Matrix4f IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private long IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private float llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private int IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @JvmField
   @NotNull
   public static IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static String[] f;
   private static String[] g;

   private IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl() {
      short var10001 = -8911;
      short var10002 = 8630;
      var10002 = -8912;
      short var10003 = -23483;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -8908;
      short var10005 = 30919;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIIlIlIlIllIllllIllIlIIIIIIlllIIlIIlIlIIlIlllllIIlIIlIllIIlIIIIIlIIIIllIlIlIllIllII.a(),
         lIIIIlIlIlIllIllllIllIlIIIIIIlllIIlIIlIlIIlIlllllIIlIIlIllIIlIIIIIlIIIIllIlIlIllIllII.b(),
         lIIIIlIlIlIllIllllIllIlIIIIIIlllIIlIIlIlIIlIlllllIIlIIlIllIIlIIIIIlIIIIllIlIlIllIllII.c()
      };
      super("Motion Blur", "Reprojection motion blur with jittered samples.", var3, "Post", var1);
      var10003 = -8919;
      var10004 = 26338;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
         "Polinex MotionBlur Temp", false, 0, 4, null
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = LazyKt.lazy(
         IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl::aJ
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = LazyKt.lazy(
         IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl::aK
      );
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = LazyKt.lazy(
         IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl::aL
      );
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new Matrix4f();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new Matrix4f();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new Matrix4f();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new Matrix4f();
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new Matrix4f();
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new Matrix4f();
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new Matrix4f();
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = 60.0F;
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = 12;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = -1;
   }

   private final GpuBufferSlice ag() {
      Lazy var1 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuSampler ah() {
      Lazy var1 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      Object var10000 = var1.getValue();
      short var10002 = -8920;
      short var10003 = -7537;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (GpuSampler)var10000;
   }

   private final GpuSampler ai() {
      Lazy var1 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      Object var10000 = var1.getValue();
      short var10002 = -8904;
      short var10003 = 27537;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (GpuSampler)var10000;
   }

   public void aB() {
      super.aB();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = System.nanoTime();
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = -1;
   }

   public void aC() {
      super.aC();

      try {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.close();
      } catch (Throwable var2) {
      }

      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
   }

   @SubscribeEvent(
      priority = EventPriority.LOWEST
   )
   public final void a(@NotNull me.octo.client.events.impl.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -8905
      // 007: sipush -20335
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 0
      // 012: aload 2
      // 013: ifnonnull 029
      // 016: invokevirtual me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.ae ()Z
      // 019: ifne 028
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: return
      // 024: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 0
      // 029: invokevirtual me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 02c: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 02f: ifnonnull 037
      // 032: return
      // 033: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: invokestatic me/octo/client/lIIIIlIlIlIllIllllIllIlIIIIIIlllIIlIIlIlIIlIlllllIIlIIlIllIIlIIIIIlIIIIllIlIlIllIllII.a ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 03a: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 03d: fstore 3
      // 03e: fload 3
      // 03f: fconst_0
      // 040: fcmpg
      // 041: aload 2
      // 042: ifnonnull 056
      // 045: ifgt 050
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: return
      // 050: getstatic me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl;
      // 053: invokevirtual me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.a ()Z
      // 056: ifne 05a
      // 059: return
      // 05a: invokestatic java/lang/System.nanoTime ()J
      // 05d: lstore 4
      // 05f: lload 4
      // 061: aload 0
      // 062: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll J
      // 065: lsub
      // 066: l2f
      // 067: ldc 1.0E9
      // 069: fdiv
      // 06a: fstore 6
      // 06c: aload 0
      // 06d: lload 4
      // 06f: putfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll J
      // 072: ldc 1.0E-4
      // 074: fload 6
      // 076: fcmpg
      // 077: aload 2
      // 078: ifnonnull 090
      // 07b: ifgt 0aa
      // 07e: goto 085
      // 081: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: fload 6
      // 087: fconst_1
      // 088: fcmpg
      // 089: goto 090
      // 08c: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 2
      // 091: ifnonnull 0a7
      // 094: ifgt 0a6
      // 097: goto 09e
      // 09a: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: bipush 1
      // 09f: goto 0ab
      // 0a2: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: bipush 0
      // 0a7: goto 0ab
      // 0aa: bipush 0
      // 0ab: ifeq 0bd
      // 0ae: aload 0
      // 0af: fconst_1
      // 0b0: fload 6
      // 0b2: fdiv
      // 0b3: putfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI F
      // 0b6: goto 0bd
      // 0b9: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aload 2
      // 0bf: ifnonnull 0de
      // 0c2: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Z
      // 0c5: ifne 0dd
      // 0c8: goto 0cf
      // 0cb: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: invokespecial me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.aG ()V
      // 0d3: aload 0
      // 0d4: bipush 1
      // 0d5: putfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Z
      // 0d8: return
      // 0d9: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: invokevirtual me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0e1: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0e4: dup
      // 0e5: ifnonnull 0ee
      // 0e8: pop
      // 0e9: return
      // 0ea: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: astore 7
      // 0f0: aload 2
      // 0f1: ifnonnull 10c
      // 0f4: aload 7
      // 0f6: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 0f9: dup
      // 0fa: ifnonnull 10d
      // 0fd: goto 104
      // 100: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: pop
      // 105: goto 10c
      // 108: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: return
      // 10d: astore 8
      // 10f: aload 2
      // 110: ifnonnull 12b
      // 113: aload 7
      // 115: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getDepthTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 118: dup
      // 119: ifnonnull 12c
      // 11c: goto 123
      // 11f: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: pop
      // 124: goto 12b
      // 127: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: return
      // 12c: astore 9
      // 12e: nop
      // 12f: aload 0
      // 130: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 133: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.d ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 136: astore 10
      // 138: aload 2
      // 139: ifnonnull 154
      // 13c: aload 10
      // 13e: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 141: dup
      // 142: ifnonnull 155
      // 145: goto 14c
      // 148: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: pop
      // 14d: goto 154
      // 150: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: return
      // 155: astore 11
      // 157: invokestatic me/octo/client/lIIIIlIlIlIllIllllIllIlIIIIIIlllIIlIIlIlIIlIlllllIIlIIlIllIIlIIIIIlIIIIllIlIlIllIllII.c ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 15a: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 15d: i2f
      // 15e: ldc_w 100.0
      // 161: fdiv
      // 162: fstore 12
      // 164: aload 0
      // 165: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Lorg/joml/Matrix4f;
      // 168: getstatic me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lorg/joml/Matrix4f;
      // 16b: checkcast org/joml/Matrix4fc
      // 16e: invokevirtual org/joml/Matrix4f.set (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 171: aload 0
      // 172: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lorg/joml/Matrix4f;
      // 175: checkcast org/joml/Matrix4fc
      // 178: fload 12
      // 17a: invokevirtual org/joml/Matrix4f.lerp (Lorg/joml/Matrix4fc;F)Lorg/joml/Matrix4f;
      // 17d: pop
      // 17e: getstatic me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI D
      // 181: aload 0
      // 182: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll D
      // 185: dsub
      // 186: d2f
      // 187: fstore 13
      // 189: getstatic me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII D
      // 18c: aload 0
      // 18d: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl D
      // 190: dsub
      // 191: d2f
      // 192: fstore 14
      // 194: getstatic me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI D
      // 197: aload 0
      // 198: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI D
      // 19b: dsub
      // 19c: d2f
      // 19d: fstore 15
      // 19f: aload 0
      // 1a0: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Lorg/joml/Matrix4f;
      // 1a3: invokevirtual org/joml/Matrix4f.identity ()Lorg/joml/Matrix4f;
      // 1a6: fload 13
      // 1a8: fload 14
      // 1aa: fload 15
      // 1ac: invokevirtual org/joml/Matrix4f.translate (FFF)Lorg/joml/Matrix4f;
      // 1af: pop
      // 1b0: aload 0
      // 1b1: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lorg/joml/Matrix4f;
      // 1b4: getstatic me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lorg/joml/Matrix4f;
      // 1b7: checkcast org/joml/Matrix4fc
      // 1ba: invokevirtual org/joml/Matrix4f.set (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 1bd: invokevirtual org/joml/Matrix4f.invert ()Lorg/joml/Matrix4f;
      // 1c0: pop
      // 1c1: aload 0
      // 1c2: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lorg/joml/Matrix4f;
      // 1c5: getstatic me/octo/client/IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lorg/joml/Matrix4f;
      // 1c8: checkcast org/joml/Matrix4fc
      // 1cb: invokevirtual org/joml/Matrix4f.set (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 1ce: invokevirtual org/joml/Matrix4f.invert ()Lorg/joml/Matrix4f;
      // 1d1: pop
      // 1d2: aload 0
      // 1d3: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lorg/joml/Matrix4f;
      // 1d6: aload 0
      // 1d7: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lorg/joml/Matrix4f;
      // 1da: checkcast org/joml/Matrix4fc
      // 1dd: invokevirtual org/joml/Matrix4f.set (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 1e0: aload 0
      // 1e1: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Lorg/joml/Matrix4f;
      // 1e4: checkcast org/joml/Matrix4fc
      // 1e7: invokevirtual org/joml/Matrix4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 1ea: aload 0
      // 1eb: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Lorg/joml/Matrix4f;
      // 1ee: checkcast org/joml/Matrix4fc
      // 1f1: invokevirtual org/joml/Matrix4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 1f4: aload 0
      // 1f5: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lorg/joml/Matrix4f;
      // 1f8: checkcast org/joml/Matrix4fc
      // 1fb: invokevirtual org/joml/Matrix4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 1fe: aload 0
      // 1ff: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lorg/joml/Matrix4f;
      // 202: checkcast org/joml/Matrix4fc
      // 205: invokevirtual org/joml/Matrix4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 208: pop
      // 209: aload 0
      // 20a: invokespecial me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.aH ()I
      // 20d: istore 16
      // 20f: iload 16
      // 211: bipush 2
      // 212: idiv
      // 213: istore 17
      // 215: getstatic me/octo/client/utils/IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI;
      // 218: invokevirtual me/octo/client/utils/IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI.b ()V
      // 21b: getstatic me/octo/client/utils/IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI;
      // 21e: invokevirtual me/octo/client/utils/IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI.a ()I
      // 221: istore 18
      // 223: iload 18
      // 225: ifle 23b
      // 228: aload 0
      // 229: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI F
      // 22c: iload 18
      // 22e: i2f
      // 22f: fdiv
      // 230: fconst_1
      // 231: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 234: goto 23c
      // 237: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: fconst_1
      // 23c: fstore 19
      // 23e: fload 3
      // 23f: fload 19
      // 241: fmul
      // 242: fstore 20
      // 244: aload 0
      // 245: invokespecial me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.ag ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 248: astore 21
      // 24a: bipush 0
      // 24b: istore 22
      // 24d: aload 21
      // 24f: astore 23
      // 251: bipush 0
      // 252: istore 24
      // 254: bipush 1
      // 255: istore 25
      // 257: bipush 0
      // 258: istore 26
      // 25a: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 25d: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 260: aload 23
      // 262: iload 24
      // 264: iload 25
      // 266: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 269: dup
      // 26a: sipush -8899
      // 26d: sipush 8553
      // 270: pop2
      // 271: ldc_w "mapBuffer(...)"
      // 274: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 277: checkcast java/lang/AutoCloseable
      // 27a: astore 23
      // 27c: aconst_null
      // 27d: astore 24
      // 27f: nop
      // 280: aload 23
      // 282: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 285: astore 25
      // 287: bipush 0
      // 288: istore 26
      // 28a: aload 25
      // 28c: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 291: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 294: dup
      // 295: sipush -8902
      // 298: sipush 29260
      // 29b: pop2
      // 29c: ldc_w "intoBuffer(...)"
      // 29f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2a2: astore 27
      // 2a4: aload 27
      // 2a6: astore 28
      // 2a8: bipush 0
      // 2a9: istore 29
      // 2ab: aload 28
      // 2ad: aload 0
      // 2ae: getfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lorg/joml/Matrix4f;
      // 2b1: checkcast org/joml/Matrix4fc
      // 2b4: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putMat4f (Lorg/joml/Matrix4fc;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 2b7: pop
      // 2b8: aload 28
      // 2ba: iload 16
      // 2bc: i2f
      // 2bd: iload 17
      // 2bf: i2f
      // 2c0: fload 20
      // 2c2: ldc_w 0.56
      // 2c5: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 2c8: pop
      // 2c9: nop
      // 2ca: nop
      // 2cb: nop
      // 2cc: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 2cf: astore 25
      // 2d1: aload 23
      // 2d3: aload 24
      // 2d5: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 2d8: goto 2f0
      // 2db: astore 26
      // 2dd: aload 26
      // 2df: astore 24
      // 2e1: aload 26
      // 2e3: athrow
      // 2e4: astore 26
      // 2e6: aload 23
      // 2e8: aload 24
      // 2ea: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 2ed: aload 26
      // 2ef: athrow
      // 2f0: nop
      // 2f1: aload 2
      // 2f2: ifnonnull 34f
      // 2f5: aload 10
      // 2f7: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 2fa: dup
      // 2fb: ifnull 34e
      // 2fe: goto 305
      // 301: invokestatic me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 304: athrow
      // 305: astore 22
      // 307: aload 8
      // 309: astore 23
      // 30b: bipush 0
      // 30c: istore 24
      // 30e: bipush 0
      // 30f: istore 25
      // 311: bipush 0
      // 312: istore 26
      // 314: bipush 0
      // 315: istore 27
      // 317: bipush 0
      // 318: istore 28
      // 31a: aload 23
      // 31c: iload 24
      // 31e: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getWidth (I)I
      // 321: istore 29
      // 323: aload 23
      // 325: iload 24
      // 327: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getHeight (I)I
      // 32a: istore 30
      // 32c: bipush 0
      // 32d: istore 31
      // 32f: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 332: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 335: aload 23
      // 337: aload 22
      // 339: iload 24
      // 33b: iload 25
      // 33d: iload 26
      // 33f: iload 27
      // 341: iload 28
      // 343: iload 29
      // 345: iload 30
      // 347: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.copyTextureToTexture (Lcom/mojang/blaze3d/textures/GpuTexture;Lcom/mojang/blaze3d/textures/GpuTexture;IIIIIII)V
      // 34a: nop
      // 34b: goto 350
      // 34e: pop
      // 34f: nop
      // 350: aload 7
      // 352: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.aM ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 357: aconst_null
      // 358: aconst_null
      // 359: bipush 0
      // 35a: bipush 0
      // 35b: bipush 22
      // 35d: aconst_null
      // 35e: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 361: checkcast java/lang/AutoCloseable
      // 364: astore 21
      // 366: aconst_null
      // 367: astore 22
      // 369: nop
      // 36a: aload 21
      // 36c: checkcast com/mojang/blaze3d/systems/RenderPass
      // 36f: astore 23
      // 371: bipush 0
      // 372: istore 24
      // 374: aload 23
      // 376: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 379: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 37c: aload 23
      // 37e: sipush -8907
      // 381: sipush 24085
      // 384: pop2
      // 385: ldc_w "InSampler"
      // 388: aload 11
      // 38a: aload 0
      // 38b: invokespecial me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.ah ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 38e: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 391: aload 23
      // 393: sipush -8910
      // 396: sipush 28363
      // 399: pop2
      // 39a: ldc_w "DepthSampler"
      // 39d: aload 9
      // 39f: aload 0
      // 3a0: invokespecial me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.ai ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 3a3: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 3a6: aload 23
      // 3a8: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 3ab: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 3ae: aload 0
      // 3af: invokespecial me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.ag ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 3b2: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 3b5: aload 23
      // 3b7: bipush 0
      // 3b8: bipush 3
      // 3b9: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 3bc: nop
      // 3bd: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 3c0: astore 23
      // 3c2: aload 21
      // 3c4: aload 22
      // 3c6: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 3c9: goto 3e1
      // 3cc: astore 24
      // 3ce: aload 24
      // 3d0: astore 22
      // 3d2: aload 24
      // 3d4: athrow
      // 3d5: astore 24
      // 3d7: aload 21
      // 3d9: aload 22
      // 3db: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 3de: aload 24
      // 3e0: athrow
      // 3e1: aload 0
      // 3e2: invokespecial me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.aG ()V
      // 3e5: goto 407
      // 3e8: astore 10
      // 3ea: aload 10
      // 3ec: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 3ef: sipush -8901
      // 3f2: sipush 6496
      // 3f5: pop2
      // 3f6: ldc_w "[MotionBlur] pass failed: "
      // 3f9: swap
      // 3fa: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 3ff: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 402: aload 0
      // 403: bipush 0
      // 404: putfield me/octo/client/IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Z
      // 407: return
   }

   private final void aG() {
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .set(
            (Matrix4fc)IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
         .set(
            (Matrix4fc)IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   private final int aH() {
      String var1;
      int var5;
      label83: {
         label86: {
            String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
            String var3 = ((me.octo.client.PXDyn)(Object)(lIIIIlIlIlIllIllllIllIlIIIIIIlllIIlIIlIlIIlIlllllIIlIIlIllIIlIIIIIlIIIIllIlIlIllIllII.b())).B();
            var1 = var10000;
            var5 = var3.hashCode();
            if (var1 == null) {
               switch (var5) {
                  case 76596:
                     short var8 = -8898;
                     short var11 = 21936;
                     var5 = ((var3.equals("Low")) ? 1 : 0);
                     if (var1 != null) {
                        break label83;
                     }

                     if (var5 != 0) {
                        var5 = 8;
                        break label83;
                     }
                     break label86;
                  case 2249154:
                     short var7 = -8906;
                     short var10 = -12600;
                     var5 = ((var3.equals("High")) ? 1 : 0);
                     break;
                  case 81831820:
                     short var10001 = -8909;
                     short var10002 = -26522;
                     var5 = ((var3.equals("Ultra")) ? 1 : 0);
                     if (var1 != null) {
                        break label83;
                     }

                     if (var5 != 0) {
                        var5 = 24;
                        break label83;
                     }
                  default:
                     break label86;
               }
            }

            if (var1 != null) {
               break label83;
            }

            if (var5 != 0) {
               var5 = 16;
               break label83;
            }
         }

         var5 = 12;
      }

      int var2;
      label87: {
         var2 = var5;
         float var12;
         var5 = (var12 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI - 30.0F) == 0.0F
            ? 0
            : (var12 < 0.0F ? -1 : 1);
         if (var1 == null) {
            if (var5 < 0) {
               var5 = 0;
               break label87;
            }

            float var13;
            var5 = (var13 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI - 60.0F) == 0.0F
               ? 0
               : (var13 < 0.0F ? -1 : 1);
         }

         if (var1 == null) {
            if (var5 < 0) {
               var5 = 1;
               break label87;
            }

            float var14;
            var5 = (var14 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI - 144.0F) == 0.0F
               ? 0
               : (var14 < 0.0F ? -1 : 1);
         }

         if (var1 == null) {
            var5 = var5 > 0 ? 3 : 2;
         }
      }

      int var4 = var5;
      if (var1 == null) {
         if (var4 == this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) {
            return this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
         }

         this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var4;
      }

      int var9 = var4;
      if (var1 == null) {
         switch (var4) {
            case 0:
               var9 = RangesKt.coerceAtLeast(var2 / 2, 6);
               break;
            case 1:
               var9 = RangesKt.coerceAtLeast(var2 * 3 / 4, 8);
               break;
            case 2:
            default:
               var9 = var2;
               break;
            case 3:
               var9 = var2 * 5 / 4;
         }
      }

      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var9;
      return this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -8903;
      short var10002 = -29844;
      Intrinsics.checkNotNullParameter(var1, "event");

      try {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.close();
      } catch (Throwable var3) {
      }

      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = -1;
   }

   private static final String aI() {
      short var10000 = -8897;
      short var10001 = -3796;
      return "Polinex MotionBlur UBO";
   }

   private static final GpuBufferSlice aJ() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl::aI);
   }

   private static final GpuSampler aK() {
      return RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR);
   }

   private static final GpuSampler aL() {
      return RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST);
   }

   private static final String aM() {
      short var10000 = -8900;
      short var10001 = 17893;
      return "Polinex MotionBlur pass";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = ",\u001e\u0010b\u009d\rà\bÚéâh\u009dïÁ#L\u0083î\u001a\u00949ôÀW(9£i2Éâ\u0080#3èaWu\n\u0094\u00062|Âe\u000f·\u009eÿhe_90iç»ÌÑ¥\u009e\u000e\u001a^Ê³p¿J^\u0010\u0013gC\u008cS\u0017>¡È¨´\u0091´½-ÅBqxý©ñsÚ·²J=ö\u0016\\®\u0084I=\u00ad\u0085:\u000b5\u0086oà>º\u0089\u0011Õûvà\u0018\u0003÷3u\u000bµ8\u001f\u009bTüÑ\u0018óE\u009a/»-&i÷Þàù `æ\u0004Û·VÃ\u0018\u009a\u000bTY¤ñ>²®¾Á\u009dc\u0085VÁ_^\u0005æÁB\u0081¨¹N\u001aë¦¸\u0005\u0094\u009b \u0097½\fÄB\u001d\u0082\u0097\\\u000f¹]¢Çå\tø`\u0015¹Ô¯Ï\u0088ë\u0004TÚ\u009aÚ\u0005íÝ(\u001a\u009a\u0004.\u0011Úy";
      int var4 = ",\u001e\u0010b\u009d\rà\bÚéâh\u009dïÁ#L\u0083î\u001a\u00949ôÀW(9£i2Éâ\u0080#3èaWu\n\u0094\u00062|Âe\u000f·\u009eÿhe_90iç»ÌÑ¥\u009e\u000e\u001a^Ê³p¿J^\u0010\u0013gC\u008cS\u0017>¡È¨´\u0091´½-ÅBqxý©ñsÚ·²J=ö\u0016\\®\u0084I=\u00ad\u0085:\u000b5\u0086oà>º\u0089\u0011Õûvà\u0018\u0003÷3u\u000bµ8\u001f\u009bTüÑ\u0018óE\u009a/»-&i÷Þàù `æ\u0004Û·VÃ\u0018\u009a\u000bTY¤ñ>²®¾Á\u009dc\u0085VÁ_^\u0005æÁB\u0081¨¹N\u001aë¦¸\u0005\u0094\u009b \u0097½\fÄB\u001d\u0082\u0097\\\u000f¹]¢Çå\tø`\u0015¹Ô¯Ï\u0088ë\u0004TÚ\u009aÚ\u0005íÝ(\u001a\u009a\u0004.\u0011Úy"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 5;
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
                     case 0 -> 15;
                     case 1 -> 15;
                     case 2 -> 125;
                     case 3 -> 51;
                     case 4 -> 40;
                     case 5 -> 102;
                     default -> 89;
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
                     f = var5;
                     g = new String[18];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = new IIlIlIlIIIIlIlllllIIllIlIlIlIIIlIIlIIIIlIIIIlllllIIlllIIllIIlIlIIIlIIllllllIllIlllIIl();
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

                  var2 = "]æ|\u0098úO¥¾×}Å¾PÜt\r\u0010\u009d\u0003¦\u0000Ùà\rÒ\u0083D@é\u0085$\u008a.WiÕ\u0092";
                  var4 = "]æ|\u0098úO¥¾×}Å¾PÜt\r\u0010\u009d\u0003¦\u0000Ùà\rÒ\u0083D@é\u0085$\u008a.WiÕ\u0092".length();
                  var1 = 23;
                  var8 = -1;
            }

            var10000 = 58;
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
      int var2 = (var0 ^ -8903) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 46;
            case 1 -> 187;
            case 2 -> 184;
            case 3 -> 210;
            case 4 -> 47;
            case 5 -> 209;
            case 6 -> 220;
            case 7 -> 114;
            case 8 -> 137;
            case 9 -> 100;
            case 10 -> 158;
            case 11 -> 157;
            case 12 -> 194;
            case 13 -> 44;
            case 14 -> 73;
            case 15 -> 148;
            case 16 -> 236;
            case 17 -> 54;
            case 18 -> 11;
            case 19 -> 14;
            case 20 -> 64;
            case 21 -> 172;
            case 22 -> 188;
            case 23 -> 132;
            case 24 -> 32;
            case 25 -> 106;
            case 26 -> 20;
            case 27 -> 221;
            case 28 -> 205;
            case 29 -> 189;
            case 30 -> 179;
            case 31 -> 169;
            case 32 -> 227;
            case 33 -> 235;
            case 34 -> 206;
            case 35 -> 59;
            case 36 -> 92;
            case 37 -> 63;
            case 38 -> 41;
            case 39 -> 88;
            case 40 -> 136;
            case 41 -> 213;
            case 42 -> 36;
            case 43 -> 77;
            case 44 -> 156;
            case 45 -> 102;
            case 46 -> 60;
            case 47 -> 203;
            case 48 -> 207;
            case 49 -> 166;
            case 50 -> 165;
            case 51 -> 43;
            case 52 -> 129;
            case 53 -> 160;
            case 54 -> 237;
            case 55 -> 87;
            case 56 -> 49;
            case 57 -> 13;
            case 58 -> 76;
            case 59 -> 42;
            case 60 -> 91;
            case 61 -> 231;
            case 62 -> 162;
            case 63 -> 147;
            case 64 -> 222;
            case 65 -> 28;
            case 66 -> 218;
            case 67 -> 105;
            case 68 -> 246;
            case 69 -> 232;
            case 70 -> 131;
            case 71 -> 204;
            case 72 -> 78;
            case 73 -> 9;
            case 74 -> 202;
            case 75 -> 109;
            case 76 -> 37;
            case 77 -> 239;
            case 78 -> 182;
            case 79 -> 16;
            case 80 -> 3;
            case 81 -> 228;
            case 82 -> 130;
            case 83 -> 5;
            case 84 -> 164;
            case 85 -> 151;
            case 86 -> 38;
            case 87 -> 192;
            case 88 -> 25;
            case 89 -> 175;
            case 90 -> 119;
            case 91 -> 66;
            case 92 -> 111;
            case 93 -> 82;
            case 94 -> 185;
            case 95 -> 251;
            case 96 -> 174;
            case 97 -> 6;
            case 98 -> 214;
            case 99 -> 125;
            case 100 -> 223;
            case 101 -> 138;
            case 102 -> 58;
            case 103 -> 139;
            case 104 -> 170;
            case 105 -> 39;
            case 106 -> 144;
            case 107 -> 173;
            case 108 -> 24;
            case 109 -> 135;
            case 110 -> 123;
            case 111 -> 159;
            case 112 -> 7;
            case 113 -> 26;
            case 114 -> 103;
            case 115 -> 249;
            case 116 -> 107;
            case 117 -> 201;
            case 118 -> 191;
            case 119 -> 217;
            case 120 -> 186;
            case 121 -> 219;
            case 122 -> 128;
            case 123 -> 12;
            case 124 -> 57;
            case 125 -> 199;
            case 126 -> 254;
            case 127 -> 23;
            case 128 -> 153;
            case 129 -> 224;
            case 130 -> 198;
            case 131 -> 247;
            case 132 -> 33;
            case 133 -> 248;
            case 134 -> 83;
            case 135 -> 30;
            case 136 -> 72;
            case 137 -> 181;
            case 138 -> 68;
            case 139 -> 101;
            case 140 -> 75;
            case 141 -> 168;
            case 142 -> 117;
            case 143 -> 18;
            case 144 -> 1;
            case 145 -> 177;
            case 146 -> 116;
            case 147 -> 99;
            case 148 -> 86;
            case 149 -> 127;
            case 150 -> 230;
            case 151 -> 10;
            case 152 -> 8;
            case 153 -> 48;
            case 154 -> 85;
            case 155 -> 19;
            case 156 -> 121;
            case 157 -> 70;
            case 158 -> 155;
            case 159 -> 104;
            case 160 -> 79;
            case 161 -> 183;
            case 162 -> 118;
            case 163 -> 197;
            case 164 -> 0;
            case 165 -> 40;
            case 166 -> 242;
            case 167 -> 81;
            case 168 -> 108;
            case 169 -> 97;
            case 170 -> 62;
            case 171 -> 126;
            case 172 -> 51;
            case 173 -> 141;
            case 174 -> 61;
            case 175 -> 74;
            case 176 -> 245;
            case 177 -> 98;
            case 178 -> 96;
            case 179 -> 89;
            case 180 -> 252;
            case 181 -> 95;
            case 182 -> 133;
            case 183 -> 240;
            case 184 -> 45;
            case 185 -> 27;
            case 186 -> 212;
            case 187 -> 140;
            case 188 -> 176;
            case 189 -> 120;
            case 190 -> 250;
            case 191 -> 196;
            case 192 -> 93;
            case 193 -> 146;
            case 194 -> 56;
            case 195 -> 234;
            case 196 -> 154;
            case 197 -> 229;
            case 198 -> 2;
            case 199 -> 195;
            case 200 -> 71;
            case 201 -> 208;
            case 202 -> 180;
            case 203 -> 31;
            case 204 -> 50;
            case 205 -> 233;
            case 206 -> 65;
            case 207 -> 115;
            case 208 -> 134;
            case 209 -> 69;
            case 210 -> 152;
            case 211 -> 161;
            case 212 -> 52;
            case 213 -> 163;
            case 214 -> 178;
            case 215 -> 124;
            case 216 -> 171;
            case 217 -> 145;
            case 218 -> 200;
            case 219 -> 226;
            case 220 -> 143;
            case 221 -> 211;
            case 222 -> 215;
            case 223 -> 80;
            case 224 -> 190;
            case 225 -> 225;
            case 226 -> 112;
            case 227 -> 53;
            case 228 -> 67;
            case 229 -> 216;
            case 230 -> 244;
            case 231 -> 15;
            case 232 -> 149;
            case 233 -> 35;
            case 234 -> 4;
            case 235 -> 22;
            case 236 -> 150;
            case 237 -> 122;
            case 238 -> 55;
            case 239 -> 142;
            case 240 -> 94;
            case 241 -> 17;
            case 242 -> 90;
            case 243 -> 253;
            case 244 -> 238;
            case 245 -> 110;
            case 246 -> 113;
            case 247 -> 241;
            case 248 -> 84;
            case 249 -> 21;
            case 250 -> 243;
            case 251 -> 167;
            case 252 -> 34;
            case 253 -> 255;
            case 254 -> 193;
            default -> 29;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
