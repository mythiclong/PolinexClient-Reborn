package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public final class llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final Lazy lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final Lazy IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll() {
      short var10001 = -27260;
      short var10002 = 8129;
      var10002 = -27264;
      short var10003 = 13729;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -27261;
      short var10005 = 5274;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIIIIIIlIlIllIIIIlIlIIIllIllIIIlllIlllIlIIIlIIllIlIlIlIllIIIllIIIlIlIlllIIIIIIIIIIIl.a(),
         IlIIIIIIlIlIllIIIIlIlIIIllIllIIIlllIlllIlIIIlIIllIlIlIlIllIIIllIIIlIlIlllIIIIIIIIIIIl.b(),
         IlIIIIIIlIlIllIIIIlIlIIIllIllIIIlllIlllIlIIIlIIllIlIlIlIllIIIllIIIlIlIlllIIIIIIIIIIIl.c()
      };
      super("Antialiasing", "FXAA edge smoothing post-process.", var3, "Post", var1);
      var10003 = -27253;
      var10004 = -13926;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
         "Polinex FXAA Temp", false, 0, 4, null
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = LazyKt.lazy(
         llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll::aG
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = LazyKt.lazy(
         llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll::aH
      );
   }

   private final GpuBufferSlice ag() {
      Lazy var1 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuSampler ah() {
      Lazy var1 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      Object var10000 = var1.getValue();
      short var10002 = -27250;
      short var10003 = -23498;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (GpuSampler)var10000;
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
      // 004: sipush -27252
      // 007: sipush 1946
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 0
      // 012: aload 2
      // 013: ifnonnull 029
      // 016: invokevirtual me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.ae ()Z
      // 019: ifne 028
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: return
      // 024: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 0
      // 029: invokevirtual me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.ap ()Lnet/minecraft/client/Minecraft;
      // 02c: aload 2
      // 02d: ifnonnull 046
      // 030: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 033: ifnonnull 042
      // 036: goto 03d
      // 039: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: return
      // 03e: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 0
      // 043: invokevirtual me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.ap ()Lnet/minecraft/client/Minecraft;
      // 046: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 049: dup
      // 04a: ifnonnull 053
      // 04d: pop
      // 04e: return
      // 04f: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: astore 3
      // 054: aload 2
      // 055: ifnonnull 06f
      // 058: aload 3
      // 059: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 05c: dup
      // 05d: ifnonnull 070
      // 060: goto 067
      // 063: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: pop
      // 068: goto 06f
      // 06b: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: return
      // 070: astore 4
      // 072: nop
      // 073: aload 0
      // 074: getfield me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 077: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.d ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 07a: astore 5
      // 07c: aload 2
      // 07d: ifnonnull 098
      // 080: aload 5
      // 082: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 085: dup
      // 086: ifnonnull 099
      // 089: goto 090
      // 08c: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: pop
      // 091: goto 098
      // 094: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: return
      // 099: astore 6
      // 09b: invokestatic me/octo/client/IlIIIIIIlIlIllIIIIlIlIIIllIllIIIlllIlllIlIIIlIIllIlIlIlIllIIIllIIIlIlIlllIIIIIIIIIIIl.a ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 09e: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.B ()Ljava/lang/String;
      // 0a1: astore 8
      // 0a3: aload 8
      // 0a5: sipush -27263
      // 0a8: sipush 8117
      // 0ab: pop2
      // 0ac: ldc "Fast"
      // 0ae: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0b1: aload 2
      // 0b2: ifnonnull 0d5
      // 0b5: ifeq 0c7
      // 0b8: goto 0bf
      // 0bb: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: fconst_0
      // 0c0: goto 0e1
      // 0c3: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: aload 8
      // 0c9: sipush -27257
      // 0cc: sipush -29287
      // 0cf: pop2
      // 0d0: ldc "Quality"
      // 0d2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0d5: ifeq 0e0
      // 0d8: fconst_2
      // 0d9: goto 0e1
      // 0dc: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: fconst_1
      // 0e1: fstore 7
      // 0e3: aload 0
      // 0e4: invokespecial me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.ag ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 0e7: astore 8
      // 0e9: bipush 0
      // 0ea: istore 9
      // 0ec: aload 8
      // 0ee: astore 10
      // 0f0: bipush 0
      // 0f1: istore 11
      // 0f3: bipush 1
      // 0f4: istore 12
      // 0f6: bipush 0
      // 0f7: istore 13
      // 0f9: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 0fc: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 0ff: aload 10
      // 101: iload 11
      // 103: iload 12
      // 105: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 108: dup
      // 109: sipush -27256
      // 10c: sipush -16561
      // 10f: pop2
      // 110: ldc "mapBuffer(...)"
      // 112: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 115: checkcast java/lang/AutoCloseable
      // 118: astore 10
      // 11a: aconst_null
      // 11b: astore 11
      // 11d: nop
      // 11e: aload 10
      // 120: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 123: astore 12
      // 125: bipush 0
      // 126: istore 13
      // 128: aload 12
      // 12a: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 12f: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 132: dup
      // 133: sipush -27254
      // 136: sipush 10037
      // 139: pop2
      // 13a: ldc "intoBuffer(...)"
      // 13c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 13f: astore 14
      // 141: aload 14
      // 143: astore 15
      // 145: bipush 0
      // 146: istore 16
      // 148: aload 15
      // 14a: invokestatic me/octo/client/IlIIIIIIlIlIllIIIIlIlIIIllIllIIIlllIlllIlIIIlIIllIlIlIlIllIIIllIIIlIlIlllIIIIIIIIIIIl.b ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 14d: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 150: fconst_0
      // 151: fload 7
      // 153: fconst_0
      // 154: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 157: pop
      // 158: nop
      // 159: nop
      // 15a: nop
      // 15b: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 15e: astore 12
      // 160: aload 10
      // 162: aload 11
      // 164: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 167: goto 17f
      // 16a: astore 13
      // 16c: aload 13
      // 16e: astore 11
      // 170: aload 13
      // 172: athrow
      // 173: astore 13
      // 175: aload 10
      // 177: aload 11
      // 179: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 17c: aload 13
      // 17e: athrow
      // 17f: nop
      // 180: invokestatic me/octo/client/IlIIIIIIlIlIllIIIIlIlIIIllIllIIIlllIlllIlIIIlIIllIlIlIlIllIIIllIIIlIlIlllIIIIIIIIIIIl.c ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 183: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 186: bipush 1
      // 187: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 18a: istore 8
      // 18c: bipush 0
      // 18d: istore 9
      // 18f: iload 9
      // 191: iload 8
      // 193: if_icmpge 28e
      // 196: aload 5
      // 198: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTexture ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 19b: dup
      // 19c: ifnull 1ef
      // 19f: goto 1a6
      // 1a2: invokestatic me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: astore 11
      // 1a8: aload 4
      // 1aa: astore 12
      // 1ac: bipush 0
      // 1ad: istore 13
      // 1af: bipush 0
      // 1b0: istore 14
      // 1b2: bipush 0
      // 1b3: istore 15
      // 1b5: bipush 0
      // 1b6: istore 16
      // 1b8: bipush 0
      // 1b9: istore 17
      // 1bb: aload 12
      // 1bd: iload 13
      // 1bf: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getWidth (I)I
      // 1c2: istore 18
      // 1c4: aload 12
      // 1c6: iload 13
      // 1c8: invokevirtual com/mojang/blaze3d/textures/GpuTexture.getHeight (I)I
      // 1cb: istore 19
      // 1cd: bipush 0
      // 1ce: istore 20
      // 1d0: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 1d3: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 1d6: aload 12
      // 1d8: aload 11
      // 1da: iload 13
      // 1dc: iload 14
      // 1de: iload 15
      // 1e0: iload 16
      // 1e2: iload 17
      // 1e4: iload 18
      // 1e6: iload 19
      // 1e8: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.copyTextureToTexture (Lcom/mojang/blaze3d/textures/GpuTexture;Lcom/mojang/blaze3d/textures/GpuTexture;IIIIIII)V
      // 1eb: nop
      // 1ec: goto 1f1
      // 1ef: pop
      // 1f0: nop
      // 1f1: aload 3
      // 1f2: iload 9
      // 1f4: invokedynamic get (I)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.a (I)Ljava/lang/String;, ()Ljava/lang/String; ]
      // 1f9: aconst_null
      // 1fa: aconst_null
      // 1fb: bipush 0
      // 1fc: bipush 0
      // 1fd: bipush 30
      // 1ff: aconst_null
      // 200: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 203: checkcast java/lang/AutoCloseable
      // 206: astore 10
      // 208: aconst_null
      // 209: astore 11
      // 20b: nop
      // 20c: aload 10
      // 20e: checkcast com/mojang/blaze3d/systems/RenderPass
      // 211: astore 12
      // 213: bipush 0
      // 214: istore 13
      // 216: aload 12
      // 218: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 21b: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 21e: aload 12
      // 220: sipush -27251
      // 223: sipush 19596
      // 226: pop2
      // 227: ldc_w "InSampler"
      // 22a: aload 6
      // 22c: aload 0
      // 22d: invokespecial me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.ah ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 230: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 233: aload 12
      // 235: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 238: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 23b: aload 0
      // 23c: invokespecial me/octo/client/llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.ag ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 23f: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 242: aload 12
      // 244: bipush 0
      // 245: bipush 3
      // 246: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 249: nop
      // 24a: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 24d: astore 12
      // 24f: aload 10
      // 251: aload 11
      // 253: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 256: goto 26e
      // 259: astore 13
      // 25b: aload 13
      // 25d: astore 11
      // 25f: aload 13
      // 261: athrow
      // 262: astore 13
      // 264: aload 10
      // 266: aload 11
      // 268: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 26b: aload 13
      // 26d: athrow
      // 26e: iinc 9 1
      // 271: goto 18f
      // 274: astore 5
      // 276: aload 5
      // 278: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 27b: sipush -27258
      // 27e: sipush 31899
      // 281: pop2
      // 282: ldc_w "[FXAA] post failed: "
      // 285: swap
      // 286: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 28b: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 28e: return
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -27255;
      short var10002 = 9534;
      Intrinsics.checkNotNullParameter(var1, "event");

      try {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.close();
      } catch (Throwable var3) {
      }
   }

   private static final String ai() {
      short var10000 = -27259;
      short var10001 = -4016;
      return "Polinex FXAA UBO";
   }

   private static final GpuBufferSlice aG() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .a(llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll::ai);
   }

   private static final GpuSampler aH() {
      return RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR);
   }

   private static final String a(int var0) {
      short var10001 = -27249;
      short var10002 = 31603;
      return "Polinex FXAA pass " + var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "f~\u00ad\u0099\u00ad)\u008fT±\u0005ër\u0083\f\u0081\u0012\u000bs\u0005\u0011c$!\u0007ÆÎ\u0083\u0087\u001e\u007fì1ñ\u008f\r3ÜË\u0090®Å{VO\u007f~f*\u0005\u0000Eþê.\u000e±RÔÑÝq\u0090\u008b\u0019Â¥\u0017V¶\u0011\r\u001cÅü{\u0099\"°¦8\u008fY\u009f\u0080Øpð\u000fE3Ê>\u00ad\u0017O5õ,ËÛ](\u0003\u0010¹\u0019S\\©\u008dx2íhæS²ÀZ{\f²\\\u0019Õôµ,\\aýËÐ\u0007r\u001d\u0006\u0080¨¢¾\u0014\u000e\u0083û+!vû\"ç\u001b\u009e\u0012h\u0091¤Àç\tCÎ\u0004^\u0098d¾";
      int var4 = "f~\u00ad\u0099\u00ad)\u008fT±\u0005ër\u0083\f\u0081\u0012\u000bs\u0005\u0011c$!\u0007ÆÎ\u0083\u0087\u001e\u007fì1ñ\u008f\r3ÜË\u0090®Å{VO\u007f~f*\u0005\u0000Eþê.\u000e±RÔÑÝq\u0090\u008b\u0019Â¥\u0017V¶\u0011\r\u001cÅü{\u0099\"°¦8\u008fY\u009f\u0080Øpð\u000fE3Ê>\u00ad\u0017O5õ,ËÛ](\u0003\u0010¹\u0019S\\©\u008dx2íhæS²ÀZ{\f²\\\u0019Õôµ,\\aýËÐ\u0007r\u001d\u0006\u0080¨¢¾\u0014\u000e\u0083û+!vû\"ç\u001b\u009e\u0012h\u0091¤Àç\tCÎ\u0004^\u0098d¾"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 122;
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
                     case 0 -> 56;
                     case 1 -> 71;
                     case 2 -> 96;
                     case 3 -> 73;
                     case 4 -> 117;
                     case 5 -> 59;
                     default -> 13;
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
                     g = new String[15];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new llIlIIIlIIlllllIIIIlIIIIIllIIIllIlIIllIllIIIIllIlIlIlIlIlIlIIlIllllllIlllIlIIIlIIllll();
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

                  var2 = "ÿ2«\t¹Ã(u\u0092\u009eµ\u001f*\u0013\u0010\u0092\n\u0004çíXU\u001cÇî÷É°Åë_\u009a]\u0004ß\u0015I\t";
                  var4 = "ÿ2«\t¹Ã(u\u0092\u009eµ\u001f*\u0013\u0010\u0092\n\u0004çíXU\u001cÇî÷É°Åë_\u009a]\u0004ß\u0015I\t".length();
                  var1 = '!';
                  var8 = -1;
            }

            var10000 = 31;
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
      int var2 = (var0 ^ -27251) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 153;
            case 1 -> 200;
            case 2 -> 147;
            case 3 -> 161;
            case 4 -> 239;
            case 5 -> 25;
            case 6 -> 127;
            case 7 -> 199;
            case 8 -> 86;
            case 9 -> 80;
            case 10 -> 44;
            case 11 -> 7;
            case 12 -> 250;
            case 13 -> 203;
            case 14 -> 190;
            case 15 -> 117;
            case 16 -> 4;
            case 17 -> 215;
            case 18 -> 144;
            case 19 -> 252;
            case 20 -> 148;
            case 21 -> 58;
            case 22 -> 98;
            case 23 -> 172;
            case 24 -> 119;
            case 25 -> 249;
            case 26 -> 110;
            case 27 -> 63;
            case 28 -> 91;
            case 29 -> 237;
            case 30 -> 116;
            case 31 -> 142;
            case 32 -> 13;
            case 33 -> 221;
            case 34 -> 225;
            case 35 -> 223;
            case 36 -> 31;
            case 37 -> 151;
            case 38 -> 102;
            case 39 -> 218;
            case 40 -> 183;
            case 41 -> 35;
            case 42 -> 52;
            case 43 -> 247;
            case 44 -> 193;
            case 45 -> 194;
            case 46 -> 30;
            case 47 -> 95;
            case 48 -> 56;
            case 49 -> 93;
            case 50 -> 65;
            case 51 -> 60;
            case 52 -> 186;
            case 53 -> 133;
            case 54 -> 137;
            case 55 -> 222;
            case 56 -> 129;
            case 57 -> 217;
            case 58 -> 231;
            case 59 -> 67;
            case 60 -> 184;
            case 61 -> 188;
            case 62 -> 152;
            case 63 -> 220;
            case 64 -> 181;
            case 65 -> 245;
            case 66 -> 23;
            case 67 -> 212;
            case 68 -> 187;
            case 69 -> 48;
            case 70 -> 120;
            case 71 -> 76;
            case 72 -> 180;
            case 73 -> 90;
            case 74 -> 59;
            case 75 -> 167;
            case 76 -> 132;
            case 77 -> 143;
            case 78 -> 173;
            case 79 -> 123;
            case 80 -> 150;
            case 81 -> 41;
            case 82 -> 11;
            case 83 -> 57;
            case 84 -> 198;
            case 85 -> 210;
            case 86 -> 204;
            case 87 -> 154;
            case 88 -> 246;
            case 89 -> 73;
            case 90 -> 50;
            case 91 -> 29;
            case 92 -> 182;
            case 93 -> 134;
            case 94 -> 83;
            case 95 -> 105;
            case 96 -> 159;
            case 97 -> 236;
            case 98 -> 20;
            case 99 -> 85;
            case 100 -> 103;
            case 101 -> 84;
            case 102 -> 174;
            case 103 -> 64;
            case 104 -> 36;
            case 105 -> 75;
            case 106 -> 160;
            case 107 -> 156;
            case 108 -> 27;
            case 109 -> 12;
            case 110 -> 74;
            case 111 -> 72;
            case 112 -> 170;
            case 113 -> 32;
            case 114 -> 96;
            case 115 -> 88;
            case 116 -> 47;
            case 117 -> 19;
            case 118 -> 226;
            case 119 -> 168;
            case 120 -> 10;
            case 121 -> 89;
            case 122 -> 244;
            case 123 -> 248;
            case 124 -> 205;
            case 125 -> 8;
            case 126 -> 185;
            case 127 -> 136;
            case 128 -> 202;
            case 129 -> 109;
            case 130 -> 169;
            case 131 -> 66;
            case 132 -> 78;
            case 133 -> 15;
            case 134 -> 108;
            case 135 -> 38;
            case 136 -> 209;
            case 137 -> 21;
            case 138 -> 139;
            case 139 -> 195;
            case 140 -> 111;
            case 141 -> 234;
            case 142 -> 18;
            case 143 -> 14;
            case 144 -> 49;
            case 145 -> 227;
            case 146 -> 70;
            case 147 -> 224;
            case 148 -> 107;
            case 149 -> 207;
            case 150 -> 135;
            case 151 -> 131;
            case 152 -> 140;
            case 153 -> 17;
            case 154 -> 145;
            case 155 -> 112;
            case 156 -> 6;
            case 157 -> 33;
            case 158 -> 39;
            case 159 -> 189;
            case 160 -> 253;
            case 161 -> 54;
            case 162 -> 235;
            case 163 -> 214;
            case 164 -> 46;
            case 165 -> 100;
            case 166 -> 71;
            case 167 -> 179;
            case 168 -> 37;
            case 169 -> 206;
            case 170 -> 149;
            case 171 -> 106;
            case 172 -> 5;
            case 173 -> 241;
            case 174 -> 192;
            case 175 -> 40;
            case 176 -> 104;
            case 177 -> 114;
            case 178 -> 164;
            case 179 -> 22;
            case 180 -> 118;
            case 181 -> 178;
            case 182 -> 219;
            case 183 -> 81;
            case 184 -> 230;
            case 185 -> 254;
            case 186 -> 201;
            case 187 -> 175;
            case 188 -> 238;
            case 189 -> 197;
            case 190 -> 228;
            case 191 -> 121;
            case 192 -> 1;
            case 193 -> 62;
            case 194 -> 240;
            case 195 -> 26;
            case 196 -> 51;
            case 197 -> 208;
            case 198 -> 34;
            case 199 -> 113;
            case 200 -> 176;
            case 201 -> 196;
            case 202 -> 126;
            case 203 -> 157;
            case 204 -> 162;
            case 205 -> 42;
            case 206 -> 141;
            case 207 -> 68;
            case 208 -> 82;
            case 209 -> 69;
            case 210 -> 28;
            case 211 -> 43;
            case 212 -> 191;
            case 213 -> 101;
            case 214 -> 158;
            case 215 -> 92;
            case 216 -> 3;
            case 217 -> 97;
            case 218 -> 163;
            case 219 -> 229;
            case 220 -> 2;
            case 221 -> 213;
            case 222 -> 87;
            case 223 -> 130;
            case 224 -> 45;
            case 225 -> 243;
            case 226 -> 99;
            case 227 -> 61;
            case 228 -> 216;
            case 229 -> 255;
            case 230 -> 53;
            case 231 -> 94;
            case 232 -> 233;
            case 233 -> 125;
            case 234 -> 128;
            case 235 -> 155;
            case 236 -> 211;
            case 237 -> 232;
            case 238 -> 55;
            case 239 -> 0;
            case 240 -> 16;
            case 241 -> 24;
            case 242 -> 115;
            case 243 -> 177;
            case 244 -> 79;
            case 245 -> 124;
            case 246 -> 251;
            case 247 -> 138;
            case 248 -> 242;
            case 249 -> 166;
            case 250 -> 146;
            case 251 -> 165;
            case 252 -> 171;
            case 253 -> 9;
            case 254 -> 122;
            default -> 77;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
}
