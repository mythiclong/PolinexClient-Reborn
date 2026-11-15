package me.octo.client.utils;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
import net.minecraft.client.renderer.MappableRingBuffer;
import org.jetbrains.annotations.NotNull;

public final class IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   @NotNull
   public static IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Lazy lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Lazy IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   private IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll() {
   }

   private final MappableRingBuffer a() {
      Lazy var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      return (MappableRingBuffer)var1.getValue();
   }

   private final GpuSampler b() {
      Lazy var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Object var10000 = var1.getValue();
      short var10002 = 7887;
      short var10003 = 32389;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (GpuSampler)var10000;
   }

   public final void a(float param1, float param2, float param3, int param4, float param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: astore 7
      // 005: aload 7
      // 007: ifnonnull 023
      // 00a: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 00d: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 010: dup
      // 011: ifnonnull 024
      // 014: goto 01b
      // 017: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: pop
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: return
      // 024: astore 8
      // 026: aload 7
      // 028: ifnonnull 043
      // 02b: aload 8
      // 02d: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 030: dup
      // 031: ifnonnull 044
      // 034: goto 03b
      // 037: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: pop
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: return
      // 044: astore 9
      // 046: aload 8
      // 048: getfield com/mojang/blaze3d/pipeline/RenderTarget.width I
      // 04b: i2f
      // 04c: fstore 10
      // 04e: aload 8
      // 050: getfield com/mojang/blaze3d/pipeline/RenderTarget.height I
      // 053: i2f
      // 054: fstore 11
      // 056: fload 10
      // 058: fconst_1
      // 059: fcmpg
      // 05a: aload 7
      // 05c: ifnonnull 074
      // 05f: iflt 083
      // 062: goto 069
      // 065: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: fload 11
      // 06b: fconst_1
      // 06c: fcmpg
      // 06d: goto 074
      // 070: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: aload 7
      // 076: ifnonnull 08a
      // 079: ifge 084
      // 07c: goto 083
      // 07f: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: return
      // 084: iload 6
      // 086: bipush 1
      // 087: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 08a: istore 12
      // 08c: iload 4
      // 08e: bipush 1
      // 08f: bipush 32
      // 091: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 094: i2f
      // 095: fstore 13
      // 097: fload 3
      // 098: ldc 0.001
      // 09a: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 09d: fstore 14
      // 09f: nop
      // 0a0: getstatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 0a3: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.d ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0a6: astore 15
      // 0a8: getstatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 0ab: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.d ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0ae: astore 16
      // 0b0: aload 7
      // 0b2: ifnonnull 0cd
      // 0b5: aload 15
      // 0b7: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0ba: dup
      // 0bb: ifnonnull 0ce
      // 0be: goto 0c5
      // 0c1: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: pop
      // 0c6: goto 0cd
      // 0c9: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: return
      // 0ce: astore 17
      // 0d0: aload 7
      // 0d2: ifnonnull 0ed
      // 0d5: aload 16
      // 0d7: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0da: dup
      // 0db: ifnonnull 0ee
      // 0de: goto 0e5
      // 0e1: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: pop
      // 0e6: goto 0ed
      // 0e9: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: return
      // 0ee: astore 18
      // 0f0: aload 0
      // 0f1: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 0f4: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.currentBuffer ()Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 0f7: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.slice ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 0fa: dup
      // 0fb: sipush 7888
      // 0fe: sipush 9711
      // 101: pop2
      // 102: ldc "slice(...)"
      // 104: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 107: astore 19
      // 109: aload 19
      // 10b: astore 20
      // 10d: bipush 0
      // 10e: istore 21
      // 110: aload 20
      // 112: astore 22
      // 114: bipush 0
      // 115: istore 23
      // 117: bipush 1
      // 118: istore 24
      // 11a: bipush 0
      // 11b: istore 25
      // 11d: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 120: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 123: aload 22
      // 125: iload 23
      // 127: iload 24
      // 129: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 12c: dup
      // 12d: sipush 7898
      // 130: sipush -17557
      // 133: pop2
      // 134: ldc "mapBuffer(...)"
      // 136: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 139: checkcast java/lang/AutoCloseable
      // 13c: astore 22
      // 13e: aconst_null
      // 13f: astore 23
      // 141: nop
      // 142: aload 22
      // 144: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 147: astore 24
      // 149: bipush 0
      // 14a: istore 25
      // 14c: aload 24
      // 14e: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 153: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 156: dup
      // 157: sipush 7896
      // 15a: sipush 9497
      // 15d: pop2
      // 15e: ldc "intoBuffer(...)"
      // 160: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 163: astore 26
      // 165: aload 26
      // 167: astore 27
      // 169: bipush 0
      // 16a: istore 28
      // 16c: aload 27
      // 16e: fload 1
      // 16f: fload 2
      // 170: ldc 0.001
      // 172: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 175: fconst_0
      // 176: fconst_0
      // 177: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 17a: pop
      // 17b: nop
      // 17c: nop
      // 17d: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 180: astore 24
      // 182: aload 22
      // 184: aload 23
      // 186: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 189: goto 1a1
      // 18c: astore 25
      // 18e: aload 25
      // 190: astore 23
      // 192: aload 25
      // 194: athrow
      // 195: astore 25
      // 197: aload 22
      // 199: aload 23
      // 19b: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 19e: aload 25
      // 1a0: athrow
      // 1a1: nop
      // 1a2: aload 15
      // 1a4: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.g ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 1a9: aconst_null
      // 1aa: aconst_null
      // 1ab: bipush 0
      // 1ac: bipush 0
      // 1ad: bipush 22
      // 1af: aconst_null
      // 1b0: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 1b3: checkcast java/lang/AutoCloseable
      // 1b6: astore 20
      // 1b8: aconst_null
      // 1b9: astore 21
      // 1bb: nop
      // 1bc: aload 20
      // 1be: checkcast com/mojang/blaze3d/systems/RenderPass
      // 1c1: astore 22
      // 1c3: bipush 0
      // 1c4: istore 23
      // 1c6: aload 22
      // 1c8: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 1cb: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 1ce: aload 22
      // 1d0: sipush 7895
      // 1d3: sipush 25666
      // 1d6: pop2
      // 1d7: ldc "InSampler"
      // 1d9: aload 9
      // 1db: getstatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll;
      // 1de: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.b ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 1e1: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 1e4: aload 22
      // 1e6: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 1e9: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 1ec: aload 19
      // 1ee: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 1f1: aload 22
      // 1f3: bipush 0
      // 1f4: bipush 3
      // 1f5: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 1f8: nop
      // 1f9: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1fc: astore 22
      // 1fe: aload 20
      // 200: aload 21
      // 202: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 205: goto 21d
      // 208: astore 23
      // 20a: aload 23
      // 20c: astore 21
      // 20e: aload 23
      // 210: athrow
      // 211: astore 23
      // 213: aload 20
      // 215: aload 21
      // 217: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 21a: aload 23
      // 21c: athrow
      // 21d: aload 0
      // 21e: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 221: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.rotate ()V
      // 224: bipush 0
      // 225: istore 20
      // 227: iload 20
      // 229: iload 12
      // 22b: if_icmpge 4a5
      // 22e: aload 0
      // 22f: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 232: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.currentBuffer ()Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 235: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.slice ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 238: dup
      // 239: sipush 7899
      // 23c: sipush 10569
      // 23f: pop2
      // 240: ldc "slice(...)"
      // 242: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 245: astore 21
      // 247: aload 21
      // 249: astore 22
      // 24b: bipush 0
      // 24c: istore 23
      // 24e: aload 22
      // 250: astore 24
      // 252: bipush 0
      // 253: istore 25
      // 255: bipush 1
      // 256: istore 26
      // 258: bipush 0
      // 259: istore 27
      // 25b: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 25e: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 261: aload 24
      // 263: iload 25
      // 265: iload 26
      // 267: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 26a: dup
      // 26b: sipush 7901
      // 26e: sipush -23232
      // 271: pop2
      // 272: ldc "mapBuffer(...)"
      // 274: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 277: checkcast java/lang/AutoCloseable
      // 27a: astore 24
      // 27c: aconst_null
      // 27d: astore 25
      // 27f: nop
      // 280: aload 24
      // 282: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 285: astore 26
      // 287: bipush 0
      // 288: istore 27
      // 28a: aload 26
      // 28c: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 291: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 294: dup
      // 295: sipush 7889
      // 298: sipush 10973
      // 29b: pop2
      // 29c: ldc "intoBuffer(...)"
      // 29e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2a1: astore 28
      // 2a3: aload 28
      // 2a5: astore 29
      // 2a7: bipush 0
      // 2a8: istore 30
      // 2aa: aload 29
      // 2ac: fconst_1
      // 2ad: fload 10
      // 2af: fdiv
      // 2b0: fconst_0
      // 2b1: fload 14
      // 2b3: fload 13
      // 2b5: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 2b8: pop
      // 2b9: nop
      // 2ba: nop
      // 2bb: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 2be: astore 26
      // 2c0: aload 24
      // 2c2: aload 25
      // 2c4: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 2c7: aload 7
      // 2c9: ifnonnull 5f2
      // 2cc: goto 2e8
      // 2cf: invokestatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d2: athrow
      // 2d3: astore 27
      // 2d5: aload 27
      // 2d7: astore 25
      // 2d9: aload 27
      // 2db: athrow
      // 2dc: astore 27
      // 2de: aload 24
      // 2e0: aload 25
      // 2e2: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 2e5: aload 27
      // 2e7: athrow
      // 2e8: nop
      // 2e9: aload 16
      // 2eb: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.h ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 2f0: aconst_null
      // 2f1: aconst_null
      // 2f2: bipush 0
      // 2f3: bipush 0
      // 2f4: bipush 22
      // 2f6: aconst_null
      // 2f7: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 2fa: checkcast java/lang/AutoCloseable
      // 2fd: astore 22
      // 2ff: aconst_null
      // 300: astore 23
      // 302: nop
      // 303: aload 22
      // 305: checkcast com/mojang/blaze3d/systems/RenderPass
      // 308: astore 24
      // 30a: bipush 0
      // 30b: istore 25
      // 30d: aload 24
      // 30f: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 312: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 315: aload 24
      // 317: sipush 7892
      // 31a: sipush 21161
      // 31d: pop2
      // 31e: ldc "InSampler"
      // 320: aload 17
      // 322: getstatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll;
      // 325: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.b ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 328: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 32b: aload 24
      // 32d: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 330: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 333: aload 21
      // 335: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 338: aload 24
      // 33a: bipush 0
      // 33b: bipush 3
      // 33c: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 33f: nop
      // 340: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 343: astore 24
      // 345: aload 22
      // 347: aload 23
      // 349: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 34c: goto 364
      // 34f: astore 25
      // 351: aload 25
      // 353: astore 23
      // 355: aload 25
      // 357: athrow
      // 358: astore 25
      // 35a: aload 22
      // 35c: aload 23
      // 35e: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 361: aload 25
      // 363: athrow
      // 364: aload 0
      // 365: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 368: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.rotate ()V
      // 36b: aload 0
      // 36c: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 36f: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.currentBuffer ()Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 372: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.slice ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 375: dup
      // 376: sipush 7899
      // 379: sipush 10569
      // 37c: pop2
      // 37d: ldc "slice(...)"
      // 37f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 382: astore 22
      // 384: aload 22
      // 386: astore 23
      // 388: bipush 0
      // 389: istore 24
      // 38b: aload 23
      // 38d: astore 25
      // 38f: bipush 0
      // 390: istore 26
      // 392: bipush 1
      // 393: istore 27
      // 395: bipush 0
      // 396: istore 28
      // 398: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 39b: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 39e: aload 25
      // 3a0: iload 26
      // 3a2: iload 27
      // 3a4: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 3a7: dup
      // 3a8: sipush 7901
      // 3ab: sipush -23232
      // 3ae: pop2
      // 3af: ldc "mapBuffer(...)"
      // 3b1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3b4: checkcast java/lang/AutoCloseable
      // 3b7: astore 25
      // 3b9: aconst_null
      // 3ba: astore 26
      // 3bc: nop
      // 3bd: aload 25
      // 3bf: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 3c2: astore 27
      // 3c4: bipush 0
      // 3c5: istore 28
      // 3c7: aload 27
      // 3c9: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 3ce: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 3d1: dup
      // 3d2: sipush 7889
      // 3d5: sipush 10973
      // 3d8: pop2
      // 3d9: ldc "intoBuffer(...)"
      // 3db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3de: astore 29
      // 3e0: aload 29
      // 3e2: astore 30
      // 3e4: bipush 0
      // 3e5: istore 31
      // 3e7: aload 30
      // 3e9: fconst_0
      // 3ea: fconst_1
      // 3eb: fload 11
      // 3ed: fdiv
      // 3ee: fload 14
      // 3f0: fload 13
      // 3f2: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 3f5: pop
      // 3f6: nop
      // 3f7: nop
      // 3f8: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 3fb: astore 27
      // 3fd: aload 25
      // 3ff: aload 26
      // 401: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 404: goto 41c
      // 407: astore 28
      // 409: aload 28
      // 40b: astore 26
      // 40d: aload 28
      // 40f: athrow
      // 410: astore 28
      // 412: aload 25
      // 414: aload 26
      // 416: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 419: aload 28
      // 41b: athrow
      // 41c: nop
      // 41d: aload 15
      // 41f: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.i ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 424: aconst_null
      // 425: aconst_null
      // 426: bipush 0
      // 427: bipush 0
      // 428: bipush 22
      // 42a: aconst_null
      // 42b: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 42e: checkcast java/lang/AutoCloseable
      // 431: astore 23
      // 433: aconst_null
      // 434: astore 24
      // 436: nop
      // 437: aload 23
      // 439: checkcast com/mojang/blaze3d/systems/RenderPass
      // 43c: astore 25
      // 43e: bipush 0
      // 43f: istore 26
      // 441: aload 25
      // 443: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 446: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 449: aload 25
      // 44b: sipush 7892
      // 44e: sipush 21161
      // 451: pop2
      // 452: ldc "InSampler"
      // 454: aload 18
      // 456: getstatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll;
      // 459: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.b ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 45c: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 45f: aload 25
      // 461: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 464: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 467: aload 22
      // 469: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 46c: aload 25
      // 46e: bipush 0
      // 46f: bipush 3
      // 470: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 473: nop
      // 474: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 477: astore 25
      // 479: aload 23
      // 47b: aload 24
      // 47d: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 480: goto 498
      // 483: astore 26
      // 485: aload 26
      // 487: astore 24
      // 489: aload 26
      // 48b: athrow
      // 48c: astore 26
      // 48e: aload 23
      // 490: aload 24
      // 492: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 495: aload 26
      // 497: athrow
      // 498: aload 0
      // 499: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 49c: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.rotate ()V
      // 49f: iinc 20 1
      // 4a2: goto 227
      // 4a5: aload 0
      // 4a6: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 4a9: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.currentBuffer ()Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 4ac: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.slice ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 4af: dup
      // 4b0: sipush 7899
      // 4b3: sipush 10569
      // 4b6: pop2
      // 4b7: ldc "slice(...)"
      // 4b9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4bc: astore 20
      // 4be: aload 20
      // 4c0: astore 21
      // 4c2: bipush 0
      // 4c3: istore 22
      // 4c5: aload 21
      // 4c7: astore 23
      // 4c9: bipush 0
      // 4ca: istore 24
      // 4cc: bipush 1
      // 4cd: istore 25
      // 4cf: bipush 0
      // 4d0: istore 26
      // 4d2: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 4d5: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 4d8: aload 23
      // 4da: iload 24
      // 4dc: iload 25
      // 4de: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 4e1: dup
      // 4e2: sipush 7901
      // 4e5: sipush -23232
      // 4e8: pop2
      // 4e9: ldc "mapBuffer(...)"
      // 4eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4ee: checkcast java/lang/AutoCloseable
      // 4f1: astore 23
      // 4f3: aconst_null
      // 4f4: astore 24
      // 4f6: nop
      // 4f7: aload 23
      // 4f9: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 4fc: astore 25
      // 4fe: bipush 0
      // 4ff: istore 26
      // 501: aload 25
      // 503: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 508: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 50b: dup
      // 50c: sipush 7889
      // 50f: sipush 10973
      // 512: pop2
      // 513: ldc "intoBuffer(...)"
      // 515: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 518: astore 27
      // 51a: aload 27
      // 51c: astore 28
      // 51e: bipush 0
      // 51f: istore 29
      // 521: aload 28
      // 523: fload 5
      // 525: fconst_0
      // 526: fconst_0
      // 527: fconst_0
      // 528: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 52b: pop
      // 52c: nop
      // 52d: nop
      // 52e: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 531: astore 25
      // 533: aload 23
      // 535: aload 24
      // 537: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 53a: goto 552
      // 53d: astore 26
      // 53f: aload 26
      // 541: astore 24
      // 543: aload 26
      // 545: athrow
      // 546: astore 26
      // 548: aload 23
      // 54a: aload 24
      // 54c: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 54f: aload 26
      // 551: athrow
      // 552: nop
      // 553: aload 8
      // 555: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.j ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 55a: aconst_null
      // 55b: aconst_null
      // 55c: bipush 0
      // 55d: bipush 0
      // 55e: bipush 22
      // 560: aconst_null
      // 561: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 564: checkcast java/lang/AutoCloseable
      // 567: astore 21
      // 569: aconst_null
      // 56a: astore 22
      // 56c: nop
      // 56d: aload 21
      // 56f: checkcast com/mojang/blaze3d/systems/RenderPass
      // 572: astore 23
      // 574: bipush 0
      // 575: istore 24
      // 577: aload 23
      // 579: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 57c: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 57f: aload 23
      // 581: sipush 7892
      // 584: sipush 21161
      // 587: pop2
      // 588: ldc "InSampler"
      // 58a: aload 17
      // 58c: getstatic me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll;
      // 58f: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.b ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 592: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 595: aload 23
      // 597: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 59a: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 59d: aload 20
      // 59f: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 5a2: aload 23
      // 5a4: bipush 0
      // 5a5: bipush 3
      // 5a6: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 5a9: nop
      // 5aa: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 5ad: astore 23
      // 5af: aload 21
      // 5b1: aload 22
      // 5b3: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 5b6: goto 5ce
      // 5b9: astore 24
      // 5bb: aload 24
      // 5bd: astore 22
      // 5bf: aload 24
      // 5c1: athrow
      // 5c2: astore 24
      // 5c4: aload 21
      // 5c6: aload 22
      // 5c8: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 5cb: aload 24
      // 5cd: athrow
      // 5ce: aload 0
      // 5cf: invokespecial me/octo/client/utils/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.a ()Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 5d2: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.rotate ()V
      // 5d5: goto 5f2
      // 5d8: astore 15
      // 5da: aload 15
      // 5dc: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 5df: sipush 7894
      // 5e2: sipush 11499
      // 5e5: pop2
      // 5e6: ldc_w "[GuiBloom] pass failed: "
      // 5e9: swap
      // 5ea: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 5ef: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 5f2: return
   }

   public final void c() {
      try {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.close();
      } catch (Throwable var3) {
      }

      try {
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.close();
      } catch (Throwable var2) {
      }
   }

   private static final String d() {
      short var10000 = 7897;
      short var10001 = -4079;
      return "Polinex Bloom UBO Ring";
   }

   private static final MappableRingBuffer e() {
      return me.octo.client.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .b(IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll::d);
   }

   private static final GpuSampler f() {
      return RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR);
   }

   private static final String g() {
      short var10000 = 7903;
      short var10001 = -9590;
      return "Polinex Bloom Bright";
   }

   private static final String h() {
      short var10000 = 7893;
      short var10001 = 28357;
      return "Polinex Bloom Blur H";
   }

   private static final String i() {
      short var10000 = 7902;
      short var10001 = -22335;
      return "Polinex Bloom Blur V";
   }

   private static final String j() {
      short var10000 = 7891;
      short var10001 = -27418;
      return "Polinex Bloom Composite";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "*6àÙlÛÃ\u008d«jä<²°Ë¦\u0089{âQ\u0014k^ÈÔizc¹¿ìfìâªÁûÔ\u0018\u009e¨\u000e³iUÖ^wã>Bµ®JÑ\u001e\u000f\u0014o'ò\u0094¾Ü!Hÿ\u0098\u008e=æ9\nu9IQ÷Ì\u008c\u0085²á\u000eÆIûÒ\u008b÷Y.\u0015·D\n\u008c\u0016\u0016hG¨÷e\u001eâ5\u008f}`Þ\"ìÎ\u001dú}T#iX\u000f®Övâ\u0089jÈï0¶\u0013; 7É\t~\bo7F\u001añGK\u0018\u0086®\u0006ç¦\u0015$3\u008d*¥<0\u001f'8\f¶½6\u0003\\uÐ\u0014ó\u0014Û\u009d\u000bS/\u009c6HWxÄ8\u0005©LR\u008dÿ\tj\u0095í\u0084\u0016lû\u0089\n\u0017\u0087%U»Ú\u0097\u0015\u0004q[¿\u001aÙt§#!bt\u0080ðfÙ\u000f4I#6\u0014&Ì2J\u009dØÂ5o;\u000f\u0087\u008eSé-\u000b\\Ã¢3A\u008bê!\u0080";
      int var4 = "*6àÙlÛÃ\u008d«jä<²°Ë¦\u0089{âQ\u0014k^ÈÔizc¹¿ìfìâªÁûÔ\u0018\u009e¨\u000e³iUÖ^wã>Bµ®JÑ\u001e\u000f\u0014o'ò\u0094¾Ü!Hÿ\u0098\u008e=æ9\nu9IQ÷Ì\u008c\u0085²á\u000eÆIûÒ\u008b÷Y.\u0015·D\n\u008c\u0016\u0016hG¨÷e\u001eâ5\u008f}`Þ\"ìÎ\u001dú}T#iX\u000f®Övâ\u0089jÈï0¶\u0013; 7É\t~\bo7F\u001añGK\u0018\u0086®\u0006ç¦\u0015$3\u008d*¥<0\u001f'8\f¶½6\u0003\\uÐ\u0014ó\u0014Û\u009d\u000bS/\u009c6HWxÄ8\u0005©LR\u008dÿ\tj\u0095í\u0084\u0016lû\u0089\n\u0017\u0087%U»Ú\u0097\u0015\u0004q[¿\u001aÙt§#!bt\u0080ðfÙ\u000f4I#6\u0014&Ì2J\u009dØÂ5o;\u000f\u0087\u008eSé-\u000b\\Ã¢3A\u008bê!\u0080"
         .length();
      char var1 = 20;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 28;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var20 = var26;
               int var14 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var26;
                  var36 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var26;
                  var36 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 106;
                     case 1 -> 25;
                     case 2 -> 65;
                     case 3 -> 72;
                     case 4 -> 72;
                     case 5 -> 87;
                     default -> 3;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var40 = var20;
                     var36 = var29;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var40 = var20;
                     var36 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[17];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll();
                     var10002 = 7900;
                     short var32 = 13409;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
                        "Polinex Bloom A", false, 0, 4, null
                     );
                     var10002 = 7890;
                     short var33 = 10263;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
                        "Polinex Bloom B", false, 0, 4, null
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = LazyKt.lazy(
                        IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll::e
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = LazyKt.lazy(
                        IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll::f
                     );
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Æ`\u0093Ö\u0000\u0090Þ¢T©\r/A%ïl`\u008c;(¿^ad";
                  var4 = "Æ`\u0093Ö\u0000\u0090Þ¢T©\r/A%ïl`\u008c;(¿^ad".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 17;
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
      int var2 = (var0 ^ 7903) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 35;
            case 1 -> 49;
            case 2 -> 41;
            case 3 -> 217;
            case 4 -> 202;
            case 5 -> 245;
            case 6 -> 254;
            case 7 -> 146;
            case 8 -> 1;
            case 9 -> 80;
            case 10 -> 124;
            case 11 -> 194;
            case 12 -> 23;
            case 13 -> 39;
            case 14 -> 193;
            case 15 -> 14;
            case 16 -> 125;
            case 17 -> 197;
            case 18 -> 85;
            case 19 -> 184;
            case 20 -> 77;
            case 21 -> 28;
            case 22 -> 149;
            case 23 -> 156;
            case 24 -> 92;
            case 25 -> 244;
            case 26 -> 98;
            case 27 -> 87;
            case 28 -> 84;
            case 29 -> 116;
            case 30 -> 195;
            case 31 -> 30;
            case 32 -> 168;
            case 33 -> 190;
            case 34 -> 63;
            case 35 -> 235;
            case 36 -> 118;
            case 37 -> 241;
            case 38 -> 215;
            case 39 -> 21;
            case 40 -> 7;
            case 41 -> 232;
            case 42 -> 176;
            case 43 -> 62;
            case 44 -> 109;
            case 45 -> 12;
            case 46 -> 228;
            case 47 -> 112;
            case 48 -> 128;
            case 49 -> 170;
            case 50 -> 250;
            case 51 -> 199;
            case 52 -> 172;
            case 53 -> 158;
            case 54 -> 145;
            case 55 -> 135;
            case 56 -> 99;
            case 57 -> 58;
            case 58 -> 25;
            case 59 -> 191;
            case 60 -> 177;
            case 61 -> 207;
            case 62 -> 68;
            case 63 -> 196;
            case 64 -> 161;
            case 65 -> 105;
            case 66 -> 5;
            case 67 -> 22;
            case 68 -> 211;
            case 69 -> 238;
            case 70 -> 74;
            case 71 -> 162;
            case 72 -> 17;
            case 73 -> 192;
            case 74 -> 115;
            case 75 -> 251;
            case 76 -> 65;
            case 77 -> 130;
            case 78 -> 229;
            case 79 -> 71;
            case 80 -> 60;
            case 81 -> 234;
            case 82 -> 107;
            case 83 -> 248;
            case 84 -> 82;
            case 85 -> 76;
            case 86 -> 122;
            case 87 -> 119;
            case 88 -> 27;
            case 89 -> 127;
            case 90 -> 153;
            case 91 -> 24;
            case 92 -> 126;
            case 93 -> 249;
            case 94 -> 174;
            case 95 -> 43;
            case 96 -> 73;
            case 97 -> 133;
            case 98 -> 47;
            case 99 -> 206;
            case 100 -> 29;
            case 101 -> 59;
            case 102 -> 220;
            case 103 -> 18;
            case 104 -> 38;
            case 105 -> 201;
            case 106 -> 181;
            case 107 -> 50;
            case 108 -> 200;
            case 109 -> 88;
            case 110 -> 101;
            case 111 -> 208;
            case 112 -> 111;
            case 113 -> 163;
            case 114 -> 186;
            case 115 -> 227;
            case 116 -> 42;
            case 117 -> 106;
            case 118 -> 94;
            case 119 -> 159;
            case 120 -> 11;
            case 121 -> 204;
            case 122 -> 4;
            case 123 -> 230;
            case 124 -> 205;
            case 125 -> 253;
            case 126 -> 166;
            case 127 -> 221;
            case 128 -> 165;
            case 129 -> 233;
            case 130 -> 169;
            case 131 -> 8;
            case 132 -> 10;
            case 133 -> 240;
            case 134 -> 52;
            case 135 -> 148;
            case 136 -> 243;
            case 137 -> 108;
            case 138 -> 78;
            case 139 -> 137;
            case 140 -> 231;
            case 141 -> 140;
            case 142 -> 171;
            case 143 -> 188;
            case 144 -> 96;
            case 145 -> 154;
            case 146 -> 34;
            case 147 -> 198;
            case 148 -> 185;
            case 149 -> 138;
            case 150 -> 67;
            case 151 -> 164;
            case 152 -> 91;
            case 153 -> 218;
            case 154 -> 223;
            case 155 -> 252;
            case 156 -> 246;
            case 157 -> 16;
            case 158 -> 136;
            case 159 -> 86;
            case 160 -> 9;
            case 161 -> 139;
            case 162 -> 155;
            case 163 -> 6;
            case 164 -> 224;
            case 165 -> 48;
            case 166 -> 167;
            case 167 -> 134;
            case 168 -> 15;
            case 169 -> 90;
            case 170 -> 100;
            case 171 -> 44;
            case 172 -> 157;
            case 173 -> 93;
            case 174 -> 214;
            case 175 -> 83;
            case 176 -> 142;
            case 177 -> 226;
            case 178 -> 0;
            case 179 -> 175;
            case 180 -> 179;
            case 181 -> 216;
            case 182 -> 151;
            case 183 -> 213;
            case 184 -> 114;
            case 185 -> 54;
            case 186 -> 13;
            case 187 -> 19;
            case 188 -> 129;
            case 189 -> 33;
            case 190 -> 209;
            case 191 -> 36;
            case 192 -> 55;
            case 193 -> 144;
            case 194 -> 81;
            case 195 -> 70;
            case 196 -> 180;
            case 197 -> 152;
            case 198 -> 32;
            case 199 -> 203;
            case 200 -> 57;
            case 201 -> 110;
            case 202 -> 61;
            case 203 -> 131;
            case 204 -> 210;
            case 205 -> 236;
            case 206 -> 219;
            case 207 -> 117;
            case 208 -> 173;
            case 209 -> 79;
            case 210 -> 120;
            case 211 -> 150;
            case 212 -> 182;
            case 213 -> 3;
            case 214 -> 75;
            case 215 -> 242;
            case 216 -> 104;
            case 217 -> 147;
            case 218 -> 143;
            case 219 -> 123;
            case 220 -> 113;
            case 221 -> 56;
            case 222 -> 53;
            case 223 -> 225;
            case 224 -> 45;
            case 225 -> 212;
            case 226 -> 255;
            case 227 -> 31;
            case 228 -> 2;
            case 229 -> 141;
            case 230 -> 132;
            case 231 -> 237;
            case 232 -> 121;
            case 233 -> 187;
            case 234 -> 189;
            case 235 -> 72;
            case 236 -> 97;
            case 237 -> 160;
            case 238 -> 89;
            case 239 -> 247;
            case 240 -> 64;
            case 241 -> 69;
            case 242 -> 183;
            case 243 -> 66;
            case 244 -> 26;
            case 245 -> 102;
            case 246 -> 95;
            case 247 -> 40;
            case 248 -> 222;
            case 249 -> 37;
            case 250 -> 178;
            case 251 -> 46;
            case 252 -> 20;
            case 253 -> 51;
            case 254 -> 239;
            default -> 103;
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
