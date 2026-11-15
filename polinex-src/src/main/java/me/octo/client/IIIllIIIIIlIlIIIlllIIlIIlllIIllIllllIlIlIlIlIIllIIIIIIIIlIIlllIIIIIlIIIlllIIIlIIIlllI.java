package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.MappableRingBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI(Object... px) {
           this((String)null, 0, (IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   public static IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private MappableRingBuffer IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static ObjectArrayList<MappableRingBuffer> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   @JvmOverloads
   public IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI(
      @NotNull String var1,
      int var2,
      @NotNull IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid var3
   ) {
      short var10001 = 356;
      short var10002 = -17425;
      Intrinsics.checkNotNullParameter(var1, "label");
      var10001 = 362;
      var10002 = 3613;
      Intrinsics.checkNotNullParameter(var3, "growPolicy");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
   }

   @NotNull
   public final String a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final int b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private final void a(int param1) {
      boolean var2 = me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      net.minecraft.client.renderer.MappableRingBuffer var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      if (var3.size() >= param1) { return; }
      int var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(param1, var3 != null ? var3.size() : 0);
      if (var3 != null) { IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.add(var3); }
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new net.minecraft.client.renderer.MappableRingBuffer(com.google.common.base.Suppliers.ofInstance(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII), this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl | 2, var4);
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + " buffer grown to " + var4 + " bytes");
   }

   @NotNull
   public final GpuBufferSlice a(@NotNull ByteBuffer param1) {
      int var3 = param1.remaining();
      if (var3 < 0) {
         throw new IllegalArgumentException("byteCount must be non-negative");
      }
      this.a(var3);
      var var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      if (var4 == null) {
         throw new IllegalStateException("Ring buffer not initialized");
      }
      int var5 = var4.size();
      if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI + var3 > var5) {
         this.d();
         var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var4 == null) {
            throw new IllegalStateException("Required value was null.");
         }
         var5 = var4.size();
      }
      var var6 = var4.currentBuffer();
      long var7 = (long)this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      var var9 = var6.slice(var7, (long)var3);
      try (var var10 = me.octo.client.lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a().createCommandEncoder().mapBuffer(var9, false, true)) {
         org.lwjgl.system.MemoryUtil.memCopy(param1, var10.data());
      }
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI + var3;
      return var9;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush 354
      // 004: sipush 8446
      // 007: pop2
      // 008: ldc "data"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 010: aload 1
      // 011: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 014: istore 3
      // 015: istore 2
      // 016: iload 3
      // 017: iload 2
      // 018: ifne 026
      // 01b: iflt 029
      // 01e: goto 025
      // 021: invokestatic me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: bipush 1
      // 026: goto 02a
      // 029: bipush 0
      // 02a: ifne 048
      // 02d: bipush 0
      // 02e: istore 5
      // 030: sipush 363
      // 033: sipush -26965
      // 036: pop2
      // 037: ldc "byteCount must be non-negative"
      // 039: astore 5
      // 03b: new java/lang/IllegalArgumentException
      // 03e: dup
      // 03f: aload 5
      // 041: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 044: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 047: athrow
      // 048: aload 0
      // 049: iload 3
      // 04a: invokespecial me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.a (I)V
      // 04d: iload 2
      // 04e: ifne 068
      // 051: aload 0
      // 052: getfield me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 055: dup
      // 056: ifnonnull 083
      // 059: goto 060
      // 05c: invokestatic me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: pop
      // 061: goto 068
      // 064: invokestatic me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: bipush 0
      // 069: istore 6
      // 06b: sipush 355
      // 06e: sipush 11017
      // 071: pop2
      // 072: ldc "Ring buffer not initialized"
      // 074: astore 6
      // 076: new java/lang/IllegalStateException
      // 079: dup
      // 07a: aload 6
      // 07c: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 07f: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 082: athrow
      // 083: astore 4
      // 085: aload 4
      // 087: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.size ()I
      // 08a: istore 5
      // 08c: aload 0
      // 08d: iload 2
      // 08e: ifne 0ae
      // 091: getfield me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI I
      // 094: iload 3
      // 095: iadd
      // 096: iload 5
      // 098: if_icmple 0e2
      // 09b: goto 0a2
      // 09e: invokestatic me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: invokevirtual me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.d ()V
      // 0a6: aload 0
      // 0a7: goto 0ae
      // 0aa: invokestatic me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: getfield me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/renderer/MappableRingBuffer;
      // 0b1: iload 2
      // 0b2: ifne 0dd
      // 0b5: dup
      // 0b6: ifnonnull 0d9
      // 0b9: goto 0c0
      // 0bc: invokestatic me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: pop
      // 0c1: sipush 361
      // 0c4: sipush 9794
      // 0c7: pop2
      // 0c8: ldc "Required value was null."
      // 0ca: astore 7
      // 0cc: new java/lang/IllegalStateException
      // 0cf: dup
      // 0d0: aload 7
      // 0d2: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0d5: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 0d8: athrow
      // 0d9: astore 4
      // 0db: aload 4
      // 0dd: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.size ()I
      // 0e0: istore 5
      // 0e2: aload 4
      // 0e4: invokevirtual net/minecraft/client/renderer/MappableRingBuffer.currentBuffer ()Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 0e7: dup
      // 0e8: sipush 360
      // 0eb: sipush -8395
      // 0ee: pop2
      // 0ef: ldc "currentBuffer(...)"
      // 0f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f4: astore 6
      // 0f6: aload 0
      // 0f7: getfield me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI I
      // 0fa: i2l
      // 0fb: lstore 7
      // 0fd: aload 6
      // 0ff: lload 7
      // 101: iload 3
      // 102: i2l
      // 103: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.slice (JJ)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 106: dup
      // 107: sipush 353
      // 10a: sipush -32649
      // 10d: pop2
      // 10e: ldc "slice(...)"
      // 110: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 113: astore 9
      // 115: aload 9
      // 117: astore 10
      // 119: bipush 0
      // 11a: istore 11
      // 11c: bipush 1
      // 11d: istore 12
      // 11f: bipush 0
      // 120: istore 13
      // 122: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 125: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 128: aload 10
      // 12a: iload 11
      // 12c: iload 12
      // 12e: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 131: dup
      // 132: sipush 359
      // 135: sipush -13781
      // 138: pop2
      // 139: ldc "mapBuffer(...)"
      // 13b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 13e: checkcast java/lang/AutoCloseable
      // 141: astore 10
      // 143: aconst_null
      // 144: astore 11
      // 146: nop
      // 147: aload 10
      // 149: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 14c: astore 12
      // 14e: bipush 0
      // 14f: istore 13
      // 151: aload 1
      // 152: aload 12
      // 154: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 159: invokestatic org/lwjgl/system/MemoryUtil.memCopy (Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
      // 15c: nop
      // 15d: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 160: astore 12
      // 162: aload 10
      // 164: aload 11
      // 166: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 169: goto 181
      // 16c: astore 13
      // 16e: aload 13
      // 170: astore 11
      // 172: aload 13
      // 174: athrow
      // 175: astore 13
      // 177: aload 10
      // 179: aload 11
      // 17b: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 17e: aload 13
      // 180: athrow
      // 181: aload 0
      // 182: aload 0
      // 183: getfield me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI I
      // 186: iload 3
      // 187: iadd
      // 188: putfield me/octo/client/IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI I
      // 18b: aload 9
      // 18d: areturn
   }

   public final void d() {
      boolean var1 = me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      if (!var1) {
         net.minecraft.client.renderer.MappableRingBuffer var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var2 != null) {
            var2.rotate();
         }
      }
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0;
   }

   public final void e() {
      boolean var1 = me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var1) {
         net.minecraft.client.renderer.MappableRingBuffer var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var2 != null) {
            var2.close();
         }
      }
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = null;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0;
   }

   @JvmOverloads
   public IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI(@NotNull String var1, int var2) {
      short var10001 = 357;
      short var10002 = -12281;
      Intrinsics.checkNotNullParameter(var1, "label");
      this(var1, var2, null, 4, null);
   }

   @JvmStatic
   public static final void f() {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      ((me.octo.client.PXDyn)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).b();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code

   // PX-FIX W7-6: Kotlin @JvmOverloads ctor bridge (mask 4 = growPolicy defaulted)
   public IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI(
      @NotNull String var1,
      int var2,
      IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid var3,
      int var4,
      kotlin.jvm.internal.DefaultConstructorMarker var5
   ) {
      this(var1, var2, (var4 & 4) != 0 ? IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII : var3);
   }

   // PX-FIX W7-6: jar static accessor (body = getstatic <field>; areturn)
   @NotNull
   public static final ObjectArrayList g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   static {
      char[] var20 = null; // PX-FIX
      IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "Æ\u0010\u0019Îù\u009c\n\friZå #¼\u007fÉ\u0004\u009cÝ\u0093\u0001\u001b´÷|KåL\u0095jÑ\u001etÃ\u0010K~\u0015À~ÜÔÎª/íèu\u0080\u0005A\n7ÿM\u0005d*\u0093ûÙ\u0011_{&±\u00905²äÓV\bh!ÌX\fM\u000e|Ë£à\u0096¼\u0017óä\u0003\u0018\u008a\në\u0012R\b«>ÅY}aþÜô½\u008a.è\u0018DW\u0018éØÈ1ÆC\u0081\u009b\u0007q3\u0013\u0092\u009e\u0002³\u0099\n·þß»\u0092$";
      int var4 = "Æ\u0010\u0019Îù\u009c\n\friZå #¼\u007fÉ\u0004\u009cÝ\u0093\u0001\u001b´÷|KåL\u0095jÑ\u001etÃ\u0010K~\u0015À~ÜÔÎª/íèu\u0080\u0005A\n7ÿM\u0005d*\u0093ûÙ\u0011_{&±\u00905²äÓV\bh!ÌX\fM\u000e|Ë£à\u0096¼\u0017óä\u0003\u0018\u008a\në\u0012R\b«>ÅY}aþÜô½\u008a.è\u0018DW\u0018éØÈ1ÆC\u0081\u009b\u0007q3\u0013\u0092\u009e\u0002³\u0099\n·þß»\u0092$"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 57;
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
                     case 0 -> 127;
                     case 1 -> 101;
                     case 2 -> 109;
                     case 3 -> 36;
                     case 4 -> 90;
                     case 5 -> 86;
                     default -> 45;
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
                     b = new String[12];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new ObjectArrayList();
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

                  var2 = "(4Kmd¡ôBôß\u001e±\u0085Æ#¾8Çv¿çÀrQ¯\u008a\u0085º\u001e/rf|éÈYn.§Ô=";
                  var4 = "(4Kmd¡ôBôß\u001e±\u0085Æ#¾8Çv¿çÀrQ¯\u008a\u0085º\u001e/rf|éÈYn.§Ô=".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 9;
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
      int var2 = (var0 ^ 352) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 186;
            case 1 -> 78;
            case 2 -> 83;
            case 3 -> 142;
            case 4 -> 111;
            case 5 -> 116;
            case 6 -> 42;
            case 7 -> 132;
            case 8 -> 247;
            case 9 -> 156;
            case 10 -> 209;
            case 11 -> 7;
            case 12 -> 237;
            case 13 -> 204;
            case 14 -> 210;
            case 15 -> 234;
            case 16 -> 49;
            case 17 -> 196;
            case 18 -> 4;
            case 19 -> 245;
            case 20 -> 190;
            case 21 -> 192;
            case 22 -> 63;
            case 23 -> 254;
            case 24 -> 131;
            case 25 -> 222;
            case 26 -> 125;
            case 27 -> 79;
            case 28 -> 189;
            case 29 -> 135;
            case 30 -> 36;
            case 31 -> 57;
            case 32 -> 82;
            case 33 -> 95;
            case 34 -> 185;
            case 35 -> 154;
            case 36 -> 21;
            case 37 -> 224;
            case 38 -> 100;
            case 39 -> 170;
            case 40 -> 16;
            case 41 -> 181;
            case 42 -> 161;
            case 43 -> 130;
            case 44 -> 202;
            case 45 -> 197;
            case 46 -> 183;
            case 47 -> 175;
            case 48 -> 13;
            case 49 -> 120;
            case 50 -> 98;
            case 51 -> 81;
            case 52 -> 251;
            case 53 -> 159;
            case 54 -> 17;
            case 55 -> 253;
            case 56 -> 74;
            case 57 -> 10;
            case 58 -> 212;
            case 59 -> 104;
            case 60 -> 195;
            case 61 -> 80;
            case 62 -> 187;
            case 63 -> 141;
            case 64 -> 40;
            case 65 -> 174;
            case 66 -> 150;
            case 67 -> 137;
            case 68 -> 145;
            case 69 -> 106;
            case 70 -> 240;
            case 71 -> 110;
            case 72 -> 146;
            case 73 -> 178;
            case 74 -> 62;
            case 75 -> 33;
            case 76 -> 113;
            case 77 -> 61;
            case 78 -> 129;
            case 79 -> 193;
            case 80 -> 184;
            case 81 -> 90;
            case 82 -> 219;
            case 83 -> 118;
            case 84 -> 128;
            case 85 -> 68;
            case 86 -> 46;
            case 87 -> 227;
            case 88 -> 191;
            case 89 -> 45;
            case 90 -> 3;
            case 91 -> 18;
            case 92 -> 50;
            case 93 -> 37;
            case 94 -> 228;
            case 95 -> 65;
            case 96 -> 107;
            case 97 -> 199;
            case 98 -> 215;
            case 99 -> 216;
            case 100 -> 160;
            case 101 -> 188;
            case 102 -> 241;
            case 103 -> 239;
            case 104 -> 93;
            case 105 -> 214;
            case 106 -> 89;
            case 107 -> 248;
            case 108 -> 20;
            case 109 -> 119;
            case 110 -> 56;
            case 111 -> 124;
            case 112 -> 127;
            case 113 -> 73;
            case 114 -> 194;
            case 115 -> 220;
            case 116 -> 230;
            case 117 -> 52;
            case 118 -> 246;
            case 119 -> 59;
            case 120 -> 76;
            case 121 -> 233;
            case 122 -> 91;
            case 123 -> 15;
            case 124 -> 231;
            case 125 -> 53;
            case 126 -> 39;
            case 127 -> 14;
            case 128 -> 94;
            case 129 -> 169;
            case 130 -> 226;
            case 131 -> 229;
            case 132 -> 48;
            case 133 -> 108;
            case 134 -> 207;
            case 135 -> 223;
            case 136 -> 102;
            case 137 -> 24;
            case 138 -> 148;
            case 139 -> 180;
            case 140 -> 60;
            case 141 -> 85;
            case 142 -> 115;
            case 143 -> 155;
            case 144 -> 138;
            case 145 -> 242;
            case 146 -> 8;
            case 147 -> 244;
            case 148 -> 30;
            case 149 -> 177;
            case 150 -> 38;
            case 151 -> 162;
            case 152 -> 1;
            case 153 -> 31;
            case 154 -> 87;
            case 155 -> 11;
            case 156 -> 179;
            case 157 -> 157;
            case 158 -> 32;
            case 159 -> 70;
            case 160 -> 200;
            case 161 -> 249;
            case 162 -> 5;
            case 163 -> 168;
            case 164 -> 47;
            case 165 -> 41;
            case 166 -> 172;
            case 167 -> 22;
            case 168 -> 112;
            case 169 -> 86;
            case 170 -> 238;
            case 171 -> 23;
            case 172 -> 166;
            case 173 -> 9;
            case 174 -> 171;
            case 175 -> 69;
            case 176 -> 122;
            case 177 -> 44;
            case 178 -> 54;
            case 179 -> 221;
            case 180 -> 96;
            case 181 -> 151;
            case 182 -> 143;
            case 183 -> 71;
            case 184 -> 147;
            case 185 -> 250;
            case 186 -> 217;
            case 187 -> 165;
            case 188 -> 99;
            case 189 -> 198;
            case 190 -> 101;
            case 191 -> 203;
            case 192 -> 225;
            case 193 -> 29;
            case 194 -> 25;
            case 195 -> 75;
            case 196 -> 123;
            case 197 -> 92;
            case 198 -> 27;
            case 199 -> 6;
            case 200 -> 201;
            case 201 -> 0;
            case 202 -> 235;
            case 203 -> 126;
            case 204 -> 205;
            case 205 -> 182;
            case 206 -> 139;
            case 207 -> 173;
            case 208 -> 176;
            case 209 -> 218;
            case 210 -> 19;
            case 211 -> 117;
            case 212 -> 66;
            case 213 -> 144;
            case 214 -> 12;
            case 215 -> 109;
            case 216 -> 67;
            case 217 -> 51;
            case 218 -> 64;
            case 219 -> 136;
            case 220 -> 77;
            case 221 -> 236;
            case 222 -> 211;
            case 223 -> 255;
            case 224 -> 97;
            case 225 -> 84;
            case 226 -> 2;
            case 227 -> 34;
            case 228 -> 208;
            case 229 -> 72;
            case 230 -> 164;
            case 231 -> 43;
            case 232 -> 149;
            case 233 -> 26;
            case 234 -> 35;
            case 235 -> 158;
            case 236 -> 88;
            case 237 -> 140;
            case 238 -> 252;
            case 239 -> 206;
            case 240 -> 163;
            case 241 -> 55;
            case 242 -> 105;
            case 243 -> 213;
            case 244 -> 232;
            case 245 -> 103;
            case 246 -> 152;
            case 247 -> 28;
            case 248 -> 58;
            case 249 -> 134;
            case 250 -> 114;
            case 251 -> 121;
            case 252 -> 133;
            case 253 -> 167;
            case 254 -> 243;
            default -> 153;
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

   public interface PXEvMid {
      @NotNull
      IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @JvmField
      @NotNull
      IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(7, 0);

      int a(int var1, int var2);

      @JvmStatic
      @NotNull
      static IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid b(
         int var0, int var1
      ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
         return ((me.octo.client.PXDyn)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).a(var0, var1);
      }

      public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
         public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX companion
         private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         }

         @JvmStatic
         @NotNull
         public final IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.PXEvMid a(
            int var1, int var2
         ) {
            return null;
         }

         private static final int a(int var0, int var1, int var2, int var3) {
            int var4 = Math.max(var0, Math.max(var2, var3));
            int var5 = 1 << var1;
            return var4 + var5 - 1 & ~(var5 - 1);
         }
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      public final void b() {
         IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .removeIf(
               IIIllIIIIIlIlIIIlllIIlIIlllIIllIllllIlIlIlIlIIllIIIIIIIIlIIlllIIIIIlIIIlllIIIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll::a
            );
      }

      private static final boolean a(MappableRingBuffer var0) {
         var0.close();
         return true;
      }

      private static final boolean a(Function1 var0, Object var1) {
         return (Boolean)var0.invoke(var1);
      }

      private static void a() {
      }

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var0) {
         this();
      }
   }
}
