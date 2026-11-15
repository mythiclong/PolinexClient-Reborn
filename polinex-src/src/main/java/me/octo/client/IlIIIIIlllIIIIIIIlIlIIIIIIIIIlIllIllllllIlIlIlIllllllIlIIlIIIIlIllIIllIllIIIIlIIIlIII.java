package me.octo.client;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII {
   @NotNull
   public static IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ObjectArrayList<AABB> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IntArrayList IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Object lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Lazy IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Lazy IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] a;
   private static String[] b;

   private IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII() {
   }

   private final GpuBufferSlice a() {
      Lazy var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuSampler b() {
      Lazy var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Object var10000 = var1.getValue();
      short var10002 = 15297;
      short var10003 = -27836;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (GpuSampler)var10000;
   }

   @JvmStatic
   public static final void a(@NotNull AABB param0, int param1) {
      boolean var2 = me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.c();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param0, "box");

      if ((param1 >>> 24) == 0) {
         return;
      }

      synchronized (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
         if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size() < 32768) {
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(param0);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(param1);
         }
      }
   }

   @JvmStatic
   public static final void a(@NotNull AABB[] param0, @NotNull int[] param1, int param2) {
      Intrinsics.checkNotNullParameter(param0, "boxArr");
      Intrinsics.checkNotNullParameter(param1, "argbArr");
      if (param2 <= 0) {
         return;
      }
      int var4 = Math.min(param2, Math.min(param0.length, param1.length));
      synchronized (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
         int var7 = 32768 - lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
         if (var7 <= 0) {
            return;
         }
         int var8 = Math.min(var4, var7);
         for (int var9 = 0; var9 < var8; var9++) {
            if ((param1[var9] >>> 24) != 0) {
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(param0[var9]);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(param1[var9]);
            }
         }
      }
   }

   @JvmStatic
   public static final void a(@NotNull AABB var0, @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1) {
      short var10001 = 15319;
      short var10002 = -16386;
      Intrinsics.checkNotNullParameter(var0, "box");
      var10001 = 15305;
      var10002 = 3956;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1.h());
   }

   @JvmStatic
   public static final void a(@NotNull BlockPos var0, int var1) {
      short var10001 = 15310;
      short var10002 = 10411;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(new AABB(var0.getX(), var0.getY(), var0.getZ(), var0.getX() + 1.0, var0.getY() + 1.0, var0.getZ() + 1.0), var1);
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void c() {
      Object var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      synchronized (var0) {
         boolean var1 = false;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
         Unit var4 = Unit.INSTANCE;
      }
   }

   @SubscribeEvent(
      priority = EventPriority.LOW
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
      // 003: aload 1
      // 004: sipush 15317
      // 007: sipush -14363
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 2
      // 011: iload 2
      // 012: ifeq 02f
      // 015: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 018: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 01b: ifnonnull 030
      // 01e: goto 025
      // 021: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.c ()V
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: return
      // 030: aconst_null
      // 031: astore 3
      // 032: aconst_null
      // 033: astore 4
      // 035: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Ljava/lang/Object;
      // 038: astore 6
      // 03a: aload 6
      // 03c: monitorenter
      // 03d: nop
      // 03e: bipush 0
      // 03f: istore 7
      // 041: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 044: iload 2
      // 045: ifeq 05c
      // 048: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.isEmpty ()Z
      // 04b: ifeq 059
      // 04e: goto 055
      // 051: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 6
      // 057: monitorexit
      // 058: return
      // 059: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 05c: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 05f: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.size ()I
      // 062: anewarray 81
      // 065: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 068: astore 3
      // 069: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 06c: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.toIntArray ()[I
      // 06f: dup
      // 070: sipush 15320
      // 073: sipush 23554
      // 076: pop2
      // 077: ldc "toIntArray(...)"
      // 079: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 07c: astore 4
      // 07e: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 081: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.clear ()V
      // 084: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lit/unimi/dsi/fastutil/ints/IntArrayList;
      // 087: invokevirtual it/unimi/dsi/fastutil/ints/IntArrayList.clear ()V
      // 08a: nop
      // 08b: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 08e: astore 7
      // 090: aload 6
      // 092: monitorexit
      // 093: aload 7
      // 095: goto 0a0
      // 098: astore 8
      // 09a: aload 6
      // 09c: monitorexit
      // 09d: aload 8
      // 09f: athrow
      // 0a0: pop
      // 0a1: iload 2
      // 0a2: ifeq 0be
      // 0a5: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0a8: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0ab: dup
      // 0ac: ifnonnull 0bf
      // 0af: goto 0b6
      // 0b2: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: pop
      // 0b7: goto 0be
      // 0ba: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: return
      // 0bf: astore 5
      // 0c1: nop
      // 0c2: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl;
      // 0c5: invokevirtual me/octo/client/lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.d ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0c8: astore 7
      // 0ca: goto 0e7
      // 0cd: astore 8
      // 0cf: aload 8
      // 0d1: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 0d4: sipush 15316
      // 0d7: sipush -3809
      // 0da: pop2
      // 0db: ldc "[BlockFill] mask init failed: "
      // 0dd: swap
      // 0de: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0e3: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 0e6: return
      // 0e7: aload 7
      // 0e9: astore 6
      // 0eb: iload 2
      // 0ec: ifeq 107
      // 0ef: aload 6
      // 0f1: invokevirtual com/mojang/blaze3d/pipeline/RenderTarget.getColorTextureView ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0f4: dup
      // 0f5: ifnonnull 108
      // 0f8: goto 0ff
      // 0fb: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: pop
      // 100: goto 107
      // 103: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: return
      // 108: astore 7
      // 10a: nop
      // 10b: aload 1
      // 10c: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 10f: astore 8
      // 111: aload 6
      // 113: astore 9
      // 115: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 118: astore 10
      // 11a: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 11d: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 120: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 123: dup
      // 124: sipush 15327
      // 127: sipush -25420
      // 12a: pop2
      // 12b: ldc_w "getMainCamera(...)"
      // 12e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 131: astore 11
      // 133: bipush 0
      // 134: istore 12
      // 136: sipush 2848
      // 139: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 13c: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 13f: aload 9
      // 141: aload 8
      // 143: aload 11
      // 145: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 148: astore 13
      // 14a: nop
      // 14b: aload 10
      // 14d: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 150: swap
      // 151: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 154: iaload
      // 155: tableswitch 753 1 2 23 388
      // 16c: aload 13
      // 16e: astore 14
      // 170: bipush 0
      // 171: istore 15
      // 173: aload 14
      // 175: astore 16
      // 177: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 17a: astore 17
      // 17c: bipush 0
      // 17d: istore 18
      // 17f: aload 16
      // 181: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 184: astore 19
      // 186: aload 16
      // 188: aload 17
      // 18a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 18d: nop
      // 18e: aload 16
      // 190: astore 20
      // 192: bipush 0
      // 193: istore 21
      // 195: aload 20
      // 197: astore 22
      // 199: bipush 0
      // 19a: istore 23
      // 19c: aload 22
      // 19e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 1a1: astore 24
      // 1a3: bipush 0
      // 1a4: istore 25
      // 1a6: aload 24
      // 1a8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 1ab: nop
      // 1ac: aload 24
      // 1ae: astore 26
      // 1b0: bipush 0
      // 1b1: istore 27
      // 1b3: aload 22
      // 1b5: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 1b8: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 1bb: dup
      // 1bc: sipush 15313
      // 1bf: sipush 17889
      // 1c2: pop2
      // 1c3: ldc_w "position(...)"
      // 1c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1c9: astore 28
      // 1cb: aload 26
      // 1cd: aload 28
      // 1cf: getfield net/minecraft/world/phys/Vec3.x D
      // 1d2: dneg
      // 1d3: aload 28
      // 1d5: getfield net/minecraft/world/phys/Vec3.y D
      // 1d8: dneg
      // 1d9: aload 28
      // 1db: getfield net/minecraft/world/phys/Vec3.z D
      // 1de: dneg
      // 1df: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 1e2: aload 22
      // 1e4: astore 29
      // 1e6: bipush 0
      // 1e7: istore 30
      // 1e9: aload 29
      // 1eb: astore 31
      // 1ed: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 1f0: astore 32
      // 1f2: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 1f5: astore 33
      // 1f7: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 1fa: astore 34
      // 1fc: bipush 0
      // 1fd: istore 35
      // 1ff: aload 31
      // 201: aload 32
      // 203: aload 33
      // 205: aload 34
      // 207: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 20a: astore 36
      // 20c: nop
      // 20d: aload 36
      // 20f: aload 31
      // 211: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 214: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 217: dup
      // 218: sipush 15326
      // 21b: sipush -9894
      // 21e: pop2
      // 21f: ldc_w "last(...)"
      // 222: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 225: astore 37
      // 227: astore 38
      // 229: bipush 0
      // 22a: istore 39
      // 22c: aload 37
      // 22e: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 231: dup
      // 232: sipush 15324
      // 235: sipush -16627
      // 238: pop2
      // 239: ldc_w "pose(...)"
      // 23c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 23f: astore 40
      // 241: bipush 0
      // 242: istore 41
      // 244: aload 3
      // 245: arraylength
      // 246: istore 42
      // 248: iload 41
      // 24a: iload 42
      // 24c: if_icmpge 282
      // 24f: aload 38
      // 251: aload 40
      // 253: checkcast org/joml/Matrix4fc
      // 256: aload 3
      // 257: checkcast [Lnet/minecraft/world/phys/AABB;
      // 25a: iload 41
      // 25c: aaload
      // 25d: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 260: dup
      // 261: aload 4
      // 263: iload 41
      // 265: iaload
      // 266: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 269: bipush 0
      // 26a: bipush 8
      // 26c: aconst_null
      // 26d: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 270: iinc 41 1
      // 273: iload 2
      // 274: ifeq 28e
      // 277: iload 2
      // 278: ifne 248
      // 27b: goto 282
      // 27e: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 281: athrow
      // 282: nop
      // 283: nop
      // 284: aload 31
      // 286: aload 36
      // 288: bipush 0
      // 289: bipush 2
      // 28a: aconst_null
      // 28b: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 28e: goto 2a0
      // 291: astore 43
      // 293: aload 31
      // 295: aload 36
      // 297: bipush 0
      // 298: bipush 2
      // 299: aconst_null
      // 29a: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 29d: aload 43
      // 29f: athrow
      // 2a0: nop
      // 2a1: nop
      // 2a2: nop
      // 2a3: nop
      // 2a4: nop
      // 2a5: aload 24
      // 2a7: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 2aa: goto 2b7
      // 2ad: astore 44
      // 2af: aload 24
      // 2b1: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 2b4: aload 44
      // 2b6: athrow
      // 2b7: nop
      // 2b8: nop
      // 2b9: nop
      // 2ba: nop
      // 2bb: aload 16
      // 2bd: aload 19
      // 2bf: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 2c2: goto 2d1
      // 2c5: astore 45
      // 2c7: aload 16
      // 2c9: aload 19
      // 2cb: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 2ce: aload 45
      // 2d0: athrow
      // 2d1: nop
      // 2d2: nop
      // 2d3: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 2d6: goto 44e
      // 2d9: aload 13
      // 2db: astore 14
      // 2dd: bipush 0
      // 2de: istore 15
      // 2e0: aload 14
      // 2e2: astore 16
      // 2e4: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 2e7: astore 17
      // 2e9: bipush 0
      // 2ea: istore 18
      // 2ec: aload 16
      // 2ee: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 2f1: astore 19
      // 2f3: aload 16
      // 2f5: aload 17
      // 2f7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 2fa: nop
      // 2fb: aload 16
      // 2fd: astore 20
      // 2ff: bipush 0
      // 300: istore 21
      // 302: aload 20
      // 304: astore 22
      // 306: bipush 0
      // 307: istore 23
      // 309: aload 22
      // 30b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 30e: astore 24
      // 310: bipush 0
      // 311: istore 25
      // 313: aload 24
      // 315: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 318: nop
      // 319: aload 24
      // 31b: astore 26
      // 31d: bipush 0
      // 31e: istore 27
      // 320: aload 22
      // 322: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 325: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 328: dup
      // 329: sipush 15322
      // 32c: sipush 7303
      // 32f: pop2
      // 330: ldc_w "position(...)"
      // 333: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 336: astore 28
      // 338: aload 26
      // 33a: aload 28
      // 33c: getfield net/minecraft/world/phys/Vec3.x D
      // 33f: dneg
      // 340: aload 28
      // 342: getfield net/minecraft/world/phys/Vec3.y D
      // 345: dneg
      // 346: aload 28
      // 348: getfield net/minecraft/world/phys/Vec3.z D
      // 34b: dneg
      // 34c: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 34f: aload 22
      // 351: astore 29
      // 353: bipush 0
      // 354: istore 30
      // 356: aload 29
      // 358: astore 31
      // 35a: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 35d: astore 32
      // 35f: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 362: astore 33
      // 364: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 367: astore 34
      // 369: bipush 0
      // 36a: istore 35
      // 36c: aload 31
      // 36e: aload 32
      // 370: aload 33
      // 372: aload 34
      // 374: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 377: astore 36
      // 379: nop
      // 37a: aload 36
      // 37c: aload 31
      // 37e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 381: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 384: dup
      // 385: sipush 15314
      // 388: sipush -30318
      // 38b: pop2
      // 38c: ldc_w "last(...)"
      // 38f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 392: astore 37
      // 394: astore 38
      // 396: bipush 0
      // 397: istore 39
      // 399: aload 37
      // 39b: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 39e: dup
      // 39f: sipush 15318
      // 3a2: sipush -20281
      // 3a5: pop2
      // 3a6: ldc_w "pose(...)"
      // 3a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3ac: astore 40
      // 3ae: bipush 0
      // 3af: istore 41
      // 3b1: aload 3
      // 3b2: arraylength
      // 3b3: istore 42
      // 3b5: iload 41
      // 3b7: iload 42
      // 3b9: if_icmpge 3ef
      // 3bc: aload 38
      // 3be: aload 40
      // 3c0: checkcast org/joml/Matrix4fc
      // 3c3: aload 3
      // 3c4: checkcast [Lnet/minecraft/world/phys/AABB;
      // 3c7: iload 41
      // 3c9: aaload
      // 3ca: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 3cd: dup
      // 3ce: aload 4
      // 3d0: iload 41
      // 3d2: iaload
      // 3d3: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 3d6: bipush 0
      // 3d7: bipush 8
      // 3d9: aconst_null
      // 3da: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 3dd: iinc 41 1
      // 3e0: iload 2
      // 3e1: ifeq 3fb
      // 3e4: iload 2
      // 3e5: ifne 3b5
      // 3e8: goto 3ef
      // 3eb: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ee: athrow
      // 3ef: nop
      // 3f0: nop
      // 3f1: aload 31
      // 3f3: aload 36
      // 3f5: bipush 0
      // 3f6: bipush 2
      // 3f7: aconst_null
      // 3f8: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 3fb: goto 40d
      // 3fe: astore 43
      // 400: aload 31
      // 402: aload 36
      // 404: bipush 0
      // 405: bipush 2
      // 406: aconst_null
      // 407: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 40a: aload 43
      // 40c: athrow
      // 40d: nop
      // 40e: nop
      // 40f: nop
      // 410: nop
      // 411: nop
      // 412: aload 24
      // 414: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 417: goto 424
      // 41a: astore 44
      // 41c: aload 24
      // 41e: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 421: aload 44
      // 423: athrow
      // 424: nop
      // 425: nop
      // 426: nop
      // 427: nop
      // 428: aload 16
      // 42a: aload 19
      // 42c: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 42f: goto 43e
      // 432: astore 45
      // 434: aload 16
      // 436: aload 19
      // 438: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 43b: aload 45
      // 43d: athrow
      // 43e: nop
      // 43f: nop
      // 440: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 443: goto 44e
      // 446: new kotlin/NoWhenBranchMatchedException
      // 449: dup
      // 44a: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 44d: athrow
      // 44e: pop
      // 44f: aload 13
      // 451: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 454: sipush 2848
      // 457: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 45a: goto 46d
      // 45d: astore 46
      // 45f: aload 13
      // 461: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 464: sipush 2848
      // 467: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 46a: aload 46
      // 46c: athrow
      // 46d: nop
      // 46e: aload 0
      // 46f: invokespecial me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 472: astore 8
      // 474: bipush 0
      // 475: istore 9
      // 477: aload 8
      // 479: astore 10
      // 47b: bipush 0
      // 47c: istore 11
      // 47e: bipush 1
      // 47f: istore 12
      // 481: bipush 0
      // 482: istore 13
      // 484: invokestatic me/octo/client/lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 487: invokevirtual com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder;
      // 48a: aload 10
      // 48c: iload 11
      // 48e: iload 12
      // 490: invokevirtual com/mojang/blaze3d/systems/CommandEncoder.mapBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;
      // 493: dup
      // 494: sipush 15296
      // 497: sipush -1999
      // 49a: pop2
      // 49b: ldc_w "mapBuffer(...)"
      // 49e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4a1: checkcast java/lang/AutoCloseable
      // 4a4: astore 10
      // 4a6: aconst_null
      // 4a7: astore 11
      // 4a9: nop
      // 4aa: aload 10
      // 4ac: checkcast com/mojang/blaze3d/buffers/GpuBuffer$MappedView
      // 4af: astore 12
      // 4b1: bipush 0
      // 4b2: istore 13
      // 4b4: aload 12
      // 4b6: invokeinterface com/mojang/blaze3d/buffers/GpuBuffer$MappedView.data ()Ljava/nio/ByteBuffer; 1
      // 4bb: invokestatic com/mojang/blaze3d/buffers/Std140Builder.intoBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 4be: dup
      // 4bf: sipush 15315
      // 4c2: sipush -25781
      // 4c5: pop2
      // 4c6: ldc_w "intoBuffer(...)"
      // 4c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4cc: astore 14
      // 4ce: aload 14
      // 4d0: astore 15
      // 4d2: bipush 0
      // 4d3: istore 16
      // 4d5: aload 15
      // 4d7: fconst_1
      // 4d8: fconst_0
      // 4d9: fconst_0
      // 4da: fconst_0
      // 4db: invokevirtual com/mojang/blaze3d/buffers/Std140Builder.putVec4 (FFFF)Lcom/mojang/blaze3d/buffers/Std140Builder;
      // 4de: pop
      // 4df: nop
      // 4e0: nop
      // 4e1: nop
      // 4e2: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 4e5: astore 12
      // 4e7: aload 10
      // 4e9: aload 11
      // 4eb: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 4ee: aload 12
      // 4f0: goto 508
      // 4f3: astore 13
      // 4f5: aload 13
      // 4f7: astore 11
      // 4f9: aload 13
      // 4fb: athrow
      // 4fc: astore 13
      // 4fe: aload 10
      // 500: aload 11
      // 502: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 505: aload 13
      // 507: athrow
      // 508: pop
      // 509: nop
      // 50a: aload 5
      // 50c: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.g ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 511: aconst_null
      // 512: aconst_null
      // 513: bipush 0
      // 514: bipush 0
      // 515: bipush 30
      // 517: aconst_null
      // 518: invokestatic me/octo/client/lIIIIIlllIlllllIlIllIlIlIIIlIlIlllIllllllIIlIlIIlIIlllIlIllIllllllIllIIIIIllllIIIlIIl.a (Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Supplier;Ljava/util/OptionalInt;Ljava/util/OptionalDouble;ZZILjava/lang/Object;)Lcom/mojang/blaze3d/systems/RenderPass;
      // 51b: checkcast java/lang/AutoCloseable
      // 51e: astore 8
      // 520: aconst_null
      // 521: astore 9
      // 523: nop
      // 524: aload 8
      // 526: checkcast com/mojang/blaze3d/systems/RenderPass
      // 529: astore 10
      // 52b: bipush 0
      // 52c: istore 11
      // 52e: aload 10
      // 530: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 533: invokevirtual com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
      // 536: aload 10
      // 538: sipush 15306
      // 53b: sipush -20345
      // 53e: pop2
      // 53f: ldc_w "MaskSampler"
      // 542: aload 7
      // 544: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII;
      // 547: invokespecial me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.b ()Lcom/mojang/blaze3d/textures/GpuSampler;
      // 54a: invokevirtual com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)V
      // 54d: aload 10
      // 54f: getstatic me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 552: invokevirtual me/octo/client/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Ljava/lang/String;
      // 555: getstatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII;
      // 558: invokespecial me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 55b: invokevirtual com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V
      // 55e: aload 10
      // 560: bipush 0
      // 561: bipush 3
      // 562: invokevirtual com/mojang/blaze3d/systems/RenderPass.draw (II)V
      // 565: nop
      // 566: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 569: astore 10
      // 56b: aload 8
      // 56d: aload 9
      // 56f: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 572: aload 10
      // 574: goto 58c
      // 577: astore 11
      // 579: aload 11
      // 57b: astore 9
      // 57d: aload 11
      // 57f: athrow
      // 580: astore 11
      // 582: aload 8
      // 584: aload 9
      // 586: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
      // 589: aload 11
      // 58b: athrow
      // 58c: pop
      // 58d: goto 5aa
      // 590: astore 8
      // 592: aload 8
      // 594: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 597: sipush 15312
      // 59a: sipush 20668
      // 59d: pop2
      // 59e: ldc_w "[BlockFill] render failed: "
      // 5a1: swap
      // 5a2: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 5a7: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c (Ljava/lang/String;)V
      // 5aa: return
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 15307;
      short var10002 = -12756;
      Intrinsics.checkNotNullParameter(var1, "event");
      c();

      try {
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.close();
      } catch (Throwable var3) {
         String var10000 = var3.getMessage();
         var10001 = 15309;
         var10002 = 22979;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c("[BlockFill] close failed: " + var10000);
      }
   }

   private static final String d() {
      short var10000 = 15325;
      short var10001 = -28375;
      return "Polinex Block Fill UBO";
   }

   private static final GpuBufferSlice e() {
      return llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .a(IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII::d);
   }

   private static final GpuSampler f() {
      return RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR);
   }

   private static final String g() {
      short var10000 = 15323;
      short var10001 = 17644;
      return "Polinex Block Fill Blit";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "\u001aÐêQU[\u009c\u000fNýùFé\u0007\u0098oÔ+êßs\u00138\u0017É`\u008còÜRm7\u0002-0åÂ¾\u008c\u0000ð=\u001d)ÆÒ×\r¨d\u009brØN£wDà\u009e\u001b<\u0016ép\u0088ð\\\u0012}?\u0000,pÅÊº\u008d\u0080Ð-\u0019<h£\t\u009f\u0018}ñXô%Ïü\u0012ÝùÇ®¡u:=\u001fbÞ<^¾<NÁ\u001e\t\u000eÎÐõíG\u0093¹*\r^ëE\u0083\u0003pØ°+\u0018s\u0004\u0081\u001bz\u0081\u0090@RÌ.b½ç\u001eÿj\u0093\u008bE4'\u00ad\u0093Ý%\u0000\u0006\u0090ñ÷\u000fÃzË\u0096\u0003\b!(q^Ú\u001bu\u008bø\tj\"\\h|ô¡Ïl\u0005\u009b \\Çô\u001e\u009bþ¬¯Õ1ÞÝ£\u0010Ý\u0001\rH\u0086µnÌE\u0099RÃL¾_4ç.\u009b\u0097\u0003\u0016\u0094\u0017\t0x\u0088ýæuòÿ\u0006\u00055\u0098Fë\u0099\u0006\u001f 6Ò\u0001l\u0005\u0089v\u001e\r¼\u000b\u009a\u0087GÃd2õï\u0088e\u0097\u001a\u0006Ç\u001f\u0088£Õ\u0010Az\u0083æsd\u000bxik\u0005\u0000Èî¬f\u0093*x\u0017i£\u0098\u008a^]=Ö\b\u0011qbêN\u0089\u001ePþ\t^IÈ\u0095\u0003WÀ?\u0003{©á";
      int var4 = "\u001aÐêQU[\u009c\u000fNýùFé\u0007\u0098oÔ+êßs\u00138\u0017É`\u008còÜRm7\u0002-0åÂ¾\u008c\u0000ð=\u001d)ÆÒ×\r¨d\u009brØN£wDà\u009e\u001b<\u0016ép\u0088ð\\\u0012}?\u0000,pÅÊº\u008d\u0080Ð-\u0019<h£\t\u009f\u0018}ñXô%Ïü\u0012ÝùÇ®¡u:=\u001fbÞ<^¾<NÁ\u001e\t\u000eÎÐõíG\u0093¹*\r^ëE\u0083\u0003pØ°+\u0018s\u0004\u0081\u001bz\u0081\u0090@RÌ.b½ç\u001eÿj\u0093\u008bE4'\u00ad\u0093Ý%\u0000\u0006\u0090ñ÷\u000fÃzË\u0096\u0003\b!(q^Ú\u001bu\u008bø\tj\"\\h|ô¡Ïl\u0005\u009b \\Çô\u001e\u009bþ¬¯Õ1ÞÝ£\u0010Ý\u0001\rH\u0086µnÌE\u0099RÃL¾_4ç.\u009b\u0097\u0003\u0016\u0094\u0017\t0x\u0088ýæuòÿ\u0006\u00055\u0098Fë\u0099\u0006\u001f 6Ò\u0001l\u0005\u0089v\u001e\r¼\u000b\u009a\u0087GÃd2õï\u0088e\u0097\u001a\u0006Ç\u001f\u0088£Õ\u0010Az\u0083æsd\u000bxik\u0005\u0000Èî¬f\u0093*x\u0017i£\u0098\u008a^]=Ö\b\u0011qbêN\u0089\u001ePþ\t^IÈ\u0095\u0003WÀ?\u0003{©á"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 8;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var20 = var25;
               int var14 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var25;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 116;
                     case 1 -> 58;
                     case 2 -> 4;
                     case 3 -> 91;
                     case 4 -> 75;
                     case 5 -> 79;
                     default -> 77;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var38 = var20;
                     var34 = var28;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var38 = var20;
                     var34 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[26];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ObjectArrayList();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IntArrayList();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new Object();
                     var10002 = 15308;
                     short var31 = -3270;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl(
                        "Polinex Block Fill Mask", false, 0, 4, null
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = LazyKt.lazy(
                        IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII::e
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = LazyKt.lazy(
                        IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII::f
                     );
                     llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Üã\u0095\u0084\u0099?T\u0085\u0091¦V¡W\u000efÿ\u008d\u0097\nÁ£\u0011D2ýõ%#";
                  var4 = "Üã\u0095\u0084\u0099?T\u0085\u0091¦V¡W\u000efÿ\u008d\u0097\nÁ£\u0011D2ýõ%#".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 81;
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
      int var2 = (var0 ^ 15321) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 44;
            case 1 -> 197;
            case 2 -> 108;
            case 3 -> 206;
            case 4 -> 232;
            case 5 -> 248;
            case 6 -> 95;
            case 7 -> 52;
            case 8 -> 43;
            case 9 -> 179;
            case 10 -> 101;
            case 11 -> 244;
            case 12 -> 67;
            case 13 -> 37;
            case 14 -> 193;
            case 15 -> 173;
            case 16 -> 204;
            case 17 -> 109;
            case 18 -> 58;
            case 19 -> 13;
            case 20 -> 97;
            case 21 -> 245;
            case 22 -> 24;
            case 23 -> 2;
            case 24 -> 175;
            case 25 -> 170;
            case 26 -> 178;
            case 27 -> 230;
            case 28 -> 6;
            case 29 -> 196;
            case 30 -> 53;
            case 31 -> 235;
            case 32 -> 51;
            case 33 -> 251;
            case 34 -> 143;
            case 35 -> 39;
            case 36 -> 22;
            case 37 -> 216;
            case 38 -> 255;
            case 39 -> 205;
            case 40 -> 202;
            case 41 -> 167;
            case 42 -> 102;
            case 43 -> 125;
            case 44 -> 242;
            case 45 -> 240;
            case 46 -> 131;
            case 47 -> 212;
            case 48 -> 177;
            case 49 -> 10;
            case 50 -> 188;
            case 51 -> 29;
            case 52 -> 121;
            case 53 -> 112;
            case 54 -> 94;
            case 55 -> 207;
            case 56 -> 41;
            case 57 -> 128;
            case 58 -> 26;
            case 59 -> 116;
            case 60 -> 63;
            case 61 -> 12;
            case 62 -> 0;
            case 63 -> 236;
            case 64 -> 77;
            case 65 -> 49;
            case 66 -> 174;
            case 67 -> 3;
            case 68 -> 103;
            case 69 -> 90;
            case 70 -> 161;
            case 71 -> 80;
            case 72 -> 234;
            case 73 -> 74;
            case 74 -> 61;
            case 75 -> 120;
            case 76 -> 139;
            case 77 -> 187;
            case 78 -> 115;
            case 79 -> 107;
            case 80 -> 76;
            case 81 -> 192;
            case 82 -> 147;
            case 83 -> 4;
            case 84 -> 21;
            case 85 -> 135;
            case 86 -> 19;
            case 87 -> 73;
            case 88 -> 153;
            case 89 -> 208;
            case 90 -> 30;
            case 91 -> 111;
            case 92 -> 221;
            case 93 -> 50;
            case 94 -> 164;
            case 95 -> 180;
            case 96 -> 79;
            case 97 -> 209;
            case 98 -> 201;
            case 99 -> 28;
            case 100 -> 171;
            case 101 -> 213;
            case 102 -> 219;
            case 103 -> 110;
            case 104 -> 113;
            case 105 -> 1;
            case 106 -> 246;
            case 107 -> 38;
            case 108 -> 149;
            case 109 -> 159;
            case 110 -> 5;
            case 111 -> 152;
            case 112 -> 132;
            case 113 -> 172;
            case 114 -> 60;
            case 115 -> 253;
            case 116 -> 233;
            case 117 -> 27;
            case 118 -> 96;
            case 119 -> 144;
            case 120 -> 136;
            case 121 -> 89;
            case 122 -> 162;
            case 123 -> 185;
            case 124 -> 118;
            case 125 -> 214;
            case 126 -> 33;
            case 127 -> 241;
            case 128 -> 183;
            case 129 -> 88;
            case 130 -> 114;
            case 131 -> 181;
            case 132 -> 165;
            case 133 -> 36;
            case 134 -> 42;
            case 135 -> 23;
            case 136 -> 190;
            case 137 -> 106;
            case 138 -> 150;
            case 139 -> 83;
            case 140 -> 59;
            case 141 -> 168;
            case 142 -> 222;
            case 143 -> 47;
            case 144 -> 9;
            case 145 -> 215;
            case 146 -> 223;
            case 147 -> 68;
            case 148 -> 126;
            case 149 -> 100;
            case 150 -> 123;
            case 151 -> 210;
            case 152 -> 158;
            case 153 -> 71;
            case 154 -> 138;
            case 155 -> 92;
            case 156 -> 239;
            case 157 -> 124;
            case 158 -> 247;
            case 159 -> 93;
            case 160 -> 151;
            case 161 -> 238;
            case 162 -> 142;
            case 163 -> 17;
            case 164 -> 134;
            case 165 -> 217;
            case 166 -> 56;
            case 167 -> 54;
            case 168 -> 11;
            case 169 -> 98;
            case 170 -> 35;
            case 171 -> 104;
            case 172 -> 157;
            case 173 -> 199;
            case 174 -> 145;
            case 175 -> 15;
            case 176 -> 78;
            case 177 -> 154;
            case 178 -> 8;
            case 179 -> 46;
            case 180 -> 228;
            case 181 -> 7;
            case 182 -> 32;
            case 183 -> 249;
            case 184 -> 243;
            case 185 -> 40;
            case 186 -> 127;
            case 187 -> 252;
            case 188 -> 163;
            case 189 -> 69;
            case 190 -> 237;
            case 191 -> 117;
            case 192 -> 160;
            case 193 -> 34;
            case 194 -> 105;
            case 195 -> 148;
            case 196 -> 129;
            case 197 -> 48;
            case 198 -> 55;
            case 199 -> 195;
            case 200 -> 226;
            case 201 -> 84;
            case 202 -> 198;
            case 203 -> 70;
            case 204 -> 146;
            case 205 -> 119;
            case 206 -> 86;
            case 207 -> 133;
            case 208 -> 25;
            case 209 -> 82;
            case 210 -> 203;
            case 211 -> 18;
            case 212 -> 227;
            case 213 -> 169;
            case 214 -> 182;
            case 215 -> 64;
            case 216 -> 194;
            case 217 -> 141;
            case 218 -> 231;
            case 219 -> 66;
            case 220 -> 176;
            case 221 -> 45;
            case 222 -> 211;
            case 223 -> 184;
            case 224 -> 224;
            case 225 -> 140;
            case 226 -> 85;
            case 227 -> 122;
            case 228 -> 62;
            case 229 -> 155;
            case 230 -> 220;
            case 231 -> 99;
            case 232 -> 20;
            case 233 -> 65;
            case 234 -> 91;
            case 235 -> 31;
            case 236 -> 200;
            case 237 -> 191;
            case 238 -> 75;
            case 239 -> 225;
            case 240 -> 130;
            case 241 -> 218;
            case 242 -> 189;
            case 243 -> 16;
            case 244 -> 250;
            case 245 -> 156;
            case 246 -> 137;
            case 247 -> 87;
            case 248 -> 186;
            case 249 -> 166;
            case 250 -> 81;
            case 251 -> 57;
            case 252 -> 14;
            case 253 -> 254;
            case 254 -> 229;
            default -> 72;
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
