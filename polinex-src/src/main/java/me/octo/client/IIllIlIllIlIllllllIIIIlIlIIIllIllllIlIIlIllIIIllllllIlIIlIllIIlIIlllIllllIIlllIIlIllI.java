package me.octo.client;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public final class IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI {
   @NotNull
   public static IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Int2IntOpenHashMap lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI() {
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a(@NotNull Entity var0, int var1) {
      short var10001 = -31931;
      short var10002 = -25649;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var2) {
         int var3 = 0;
         var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var0.getId(), var1);
      }
   }

   @JvmStatic
   public static final void a(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -31931;
      short var10002 = -25649;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = -31926;
      var10002 = -18035;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1.o());
   }

   @JvmStatic
   public static final void a(@NotNull Entity var0, @NotNull llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var1) {
      short var10001 = -31935;
      short var10002 = 21384;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = -31936;
      var10002 = 22346;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1.h());
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a(@NotNull Entity var0) {
      short var10001 = -31931;
      short var10002 = -25649;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Object var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var1) {
         int var2 = 0;
         var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var0.getId());
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @JvmStatic
   public static final void a() {
      Object var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      synchronized (var0) {
         boolean var1 = false;
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         Unit var4 = Unit.INSTANCE;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -31927;
      short var10002 = 29116;
      Intrinsics.checkNotNullParameter(var1, "event");
      a();
   }

   @SubscribeEvent
   public final void a(@NotNull IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 003: aload 1
      // 004: sipush -31930
      // 007: sipush 11879
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 2
      // 011: aload 1
      // 012: invokevirtual me/octo/client/events/impl/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.o ()Lme/octo/client/events/impl/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 015: getstatic me/octo/client/events/impl/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/events/impl/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 018: if_acmpeq 020
      // 01b: return
      // 01c: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01f: athrow
      // 020: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 023: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 026: dup
      // 027: ifnonnull 030
      // 02a: pop
      // 02b: return
      // 02c: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02f: athrow
      // 030: astore 3
      // 031: new kotlin/jvm/internal/Ref$ObjectRef
      // 034: dup
      // 035: invokespecial kotlin/jvm/internal/Ref$ObjectRef.<init> ()V
      // 038: astore 4
      // 03a: getstatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/lang/Object;
      // 03d: astore 6
      // 03f: aload 6
      // 041: monitorenter
      // 042: nop
      // 043: bipush 0
      // 044: istore 7
      // 046: getstatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/ints/Int2IntOpenHashMap;
      // 049: iload 2
      // 04a: ifne 05c
      // 04d: invokevirtual it/unimi/dsi/fastutil/ints/Int2IntOpenHashMap.isEmpty ()Z
      // 050: ifeq 05e
      // 053: goto 05a
      // 056: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 059: athrow
      // 05a: aload 6
      // 05c: monitorexit
      // 05d: return
      // 05e: aload 4
      // 060: getstatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lit/unimi/dsi/fastutil/ints/Int2IntOpenHashMap;
      // 063: invokevirtual it/unimi/dsi/fastutil/ints/Int2IntOpenHashMap.int2IntEntrySet ()Lit/unimi/dsi/fastutil/ints/Int2IntMap$FastEntrySet;
      // 066: dup
      // 067: sipush -31929
      // 06a: sipush -1138
      // 06d: pop2
      // 06e: ldc "int2IntEntrySet(...)"
      // 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 073: checkcast java/lang/Iterable
      // 076: astore 8
      // 078: astore 9
      // 07a: bipush 0
      // 07b: istore 10
      // 07d: aload 8
      // 07f: astore 11
      // 081: new java/util/ArrayList
      // 084: dup
      // 085: invokespecial java/util/ArrayList.<init> ()V
      // 088: checkcast java/util/Collection
      // 08b: astore 12
      // 08d: bipush 0
      // 08e: istore 13
      // 090: aload 11
      // 092: astore 14
      // 094: bipush 0
      // 095: istore 15
      // 097: aload 14
      // 099: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 09e: astore 16
      // 0a0: aload 16
      // 0a2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a7: ifeq 126
      // 0aa: aload 16
      // 0ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b1: astore 17
      // 0b3: aload 17
      // 0b5: astore 18
      // 0b7: bipush 0
      // 0b8: istore 19
      // 0ba: aload 18
      // 0bc: checkcast it/unimi/dsi/fastutil/ints/Int2IntMap$Entry
      // 0bf: astore 20
      // 0c1: bipush 0
      // 0c2: istore 21
      // 0c4: iload 2
      // 0c5: ifne 134
      // 0c8: iload 2
      // 0c9: ifne 0f1
      // 0cc: goto 0d3
      // 0cf: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d2: athrow
      // 0d3: aload 3
      // 0d4: aload 20
      // 0d6: invokeinterface it/unimi/dsi/fastutil/ints/Int2IntMap$Entry.getIntKey ()I 1
      // 0db: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getEntity (I)Lnet/minecraft/world/entity/Entity;
      // 0de: dup
      // 0df: ifnonnull 0f5
      // 0e2: goto 0e9
      // 0e5: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e8: athrow
      // 0e9: pop
      // 0ea: goto 0f1
      // 0ed: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f0: athrow
      // 0f1: aconst_null
      // 0f2: goto 10a
      // 0f5: astore 22
      // 0f7: aload 22
      // 0f9: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 0fc: dup
      // 0fd: aload 20
      // 0ff: invokeinterface it/unimi/dsi/fastutil/ints/Int2IntMap$Entry.getIntValue ()I 1
      // 104: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 107: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 10a: dup
      // 10b: ifnull 120
      // 10e: astore 23
      // 110: bipush 0
      // 111: istore 24
      // 113: aload 12
      // 115: aload 23
      // 117: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 11c: pop
      // 11d: goto 121
      // 120: pop
      // 121: nop
      // 122: iload 2
      // 123: ifeq 0a0
      // 126: nop
      // 127: aload 12
      // 129: checkcast java/util/List
      // 12c: nop
      // 12d: aload 9
      // 12f: swap
      // 130: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 133: nop
      // 134: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 137: astore 7
      // 139: aload 6
      // 13b: monitorexit
      // 13c: goto 147
      // 13f: astore 8
      // 141: aload 6
      // 143: monitorexit
      // 144: aload 8
      // 146: athrow
      // 147: aload 4
      // 149: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 14c: checkcast java/util/List
      // 14f: invokeinterface java/util/List.isEmpty ()Z 1
      // 154: ifeq 15c
      // 157: return
      // 158: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15b: athrow
      // 15c: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 15f: invokevirtual net/minecraft/client/Minecraft.getDeltaTracker ()Lnet/minecraft/client/DeltaTracker;
      // 162: bipush 1
      // 163: invokeinterface net/minecraft/client/DeltaTracker.getGameTimeDeltaPartialTick (Z)F 2
      // 168: fstore 5
      // 16a: aload 1
      // 16b: invokevirtual me/octo/client/events/impl/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.l ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 16e: astore 6
      // 170: aload 1
      // 171: invokevirtual me/octo/client/events/impl/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.k ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 174: astore 7
      // 176: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 179: astore 8
      // 17b: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 17e: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 181: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 184: dup
      // 185: sipush -31925
      // 188: sipush 21633
      // 18b: pop2
      // 18c: ldc "getMainCamera(...)"
      // 18e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 191: astore 9
      // 193: bipush 0
      // 194: istore 10
      // 196: sipush 2848
      // 199: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 19c: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 19f: aload 7
      // 1a1: aload 6
      // 1a3: aload 9
      // 1a5: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 1a8: astore 11
      // 1aa: nop
      // 1ab: aload 8
      // 1ad: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 1b0: swap
      // 1b1: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 1b4: iaload
      // 1b5: tableswitch 669 1 2 23 346
      // 1cc: aload 11
      // 1ce: astore 12
      // 1d0: bipush 0
      // 1d1: istore 13
      // 1d3: aload 12
      // 1d5: astore 14
      // 1d7: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 1da: astore 15
      // 1dc: bipush 0
      // 1dd: istore 16
      // 1df: aload 14
      // 1e1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 1e4: astore 17
      // 1e6: aload 14
      // 1e8: aload 15
      // 1ea: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1ed: nop
      // 1ee: aload 14
      // 1f0: astore 18
      // 1f2: bipush 0
      // 1f3: istore 19
      // 1f5: aload 18
      // 1f7: astore 20
      // 1f9: bipush 0
      // 1fa: istore 21
      // 1fc: aload 20
      // 1fe: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 201: astore 22
      // 203: bipush 0
      // 204: istore 23
      // 206: aload 22
      // 208: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 20b: nop
      // 20c: aload 22
      // 20e: astore 24
      // 210: bipush 0
      // 211: istore 25
      // 213: aload 20
      // 215: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 218: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 21b: dup
      // 21c: sipush -31924
      // 21f: sipush 31814
      // 222: pop2
      // 223: ldc_w "position(...)"
      // 226: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 229: astore 26
      // 22b: aload 24
      // 22d: aload 26
      // 22f: getfield net/minecraft/world/phys/Vec3.x D
      // 232: dneg
      // 233: aload 26
      // 235: getfield net/minecraft/world/phys/Vec3.y D
      // 238: dneg
      // 239: aload 26
      // 23b: getfield net/minecraft/world/phys/Vec3.z D
      // 23e: dneg
      // 23f: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 242: aload 20
      // 244: astore 27
      // 246: bipush 0
      // 247: istore 28
      // 249: aload 4
      // 24b: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 24e: checkcast java/util/List
      // 251: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 256: astore 29
      // 258: aload 29
      // 25a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25f: ifeq 2da
      // 262: aload 29
      // 264: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 269: checkcast kotlin/Pair
      // 26c: astore 30
      // 26e: aload 30
      // 270: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 273: checkcast net/minecraft/world/entity/Entity
      // 276: astore 31
      // 278: aload 30
      // 27a: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 27d: checkcast me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 280: astore 32
      // 282: aload 31
      // 284: fload 5
      // 286: invokevirtual net/minecraft/world/entity/Entity.getPosition (F)Lnet/minecraft/world/phys/Vec3;
      // 289: dup
      // 28a: sipush -31928
      // 28d: sipush -5063
      // 290: pop2
      // 291: ldc_w "getPosition(...)"
      // 294: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 297: astore 33
      // 299: aload 31
      // 29b: invokevirtual net/minecraft/world/entity/Entity.getBoundingBox ()Lnet/minecraft/world/phys/AABB;
      // 29e: aload 33
      // 2a0: aload 31
      // 2a2: invokevirtual net/minecraft/world/entity/Entity.position ()Lnet/minecraft/world/phys/Vec3;
      // 2a5: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 2a8: invokevirtual net/minecraft/world/phys/AABB.move (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;
      // 2ab: dup
      // 2ac: sipush -31933
      // 2af: sipush 1588
      // 2b2: pop2
      // 2b3: ldc_w "move(...)"
      // 2b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2b9: astore 34
      // 2bb: aload 27
      // 2bd: aload 34
      // 2bf: aload 32
      // 2c1: aconst_null
      // 2c2: bipush 0
      // 2c3: bipush 0
      // 2c4: fconst_0
      // 2c5: bipush 56
      // 2c7: aconst_null
      // 2c8: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IIFILjava/lang/Object;)V
      // 2cb: iload 2
      // 2cc: ifne 2e3
      // 2cf: iload 2
      // 2d0: ifeq 258
      // 2d3: goto 2da
      // 2d6: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d9: athrow
      // 2da: nop
      // 2db: nop
      // 2dc: nop
      // 2dd: nop
      // 2de: aload 22
      // 2e0: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 2e3: goto 2f0
      // 2e6: astore 35
      // 2e8: aload 22
      // 2ea: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 2ed: aload 35
      // 2ef: athrow
      // 2f0: nop
      // 2f1: nop
      // 2f2: nop
      // 2f3: nop
      // 2f4: aload 14
      // 2f6: aload 17
      // 2f8: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 2fb: goto 30a
      // 2fe: astore 36
      // 300: aload 14
      // 302: aload 17
      // 304: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 307: aload 36
      // 309: athrow
      // 30a: nop
      // 30b: nop
      // 30c: goto 45a
      // 30f: aload 11
      // 311: astore 12
      // 313: bipush 0
      // 314: istore 13
      // 316: aload 12
      // 318: astore 14
      // 31a: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 31d: astore 15
      // 31f: bipush 0
      // 320: istore 16
      // 322: aload 14
      // 324: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 327: astore 17
      // 329: aload 14
      // 32b: aload 15
      // 32d: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 330: nop
      // 331: aload 14
      // 333: astore 18
      // 335: bipush 0
      // 336: istore 19
      // 338: aload 18
      // 33a: astore 20
      // 33c: bipush 0
      // 33d: istore 21
      // 33f: aload 20
      // 341: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 344: astore 22
      // 346: bipush 0
      // 347: istore 23
      // 349: aload 22
      // 34b: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 34e: nop
      // 34f: aload 22
      // 351: astore 24
      // 353: bipush 0
      // 354: istore 25
      // 356: aload 20
      // 358: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 35b: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 35e: dup
      // 35f: sipush -31923
      // 362: sipush -10117
      // 365: pop2
      // 366: ldc_w "position(...)"
      // 369: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 36c: astore 26
      // 36e: aload 24
      // 370: aload 26
      // 372: getfield net/minecraft/world/phys/Vec3.x D
      // 375: dneg
      // 376: aload 26
      // 378: getfield net/minecraft/world/phys/Vec3.y D
      // 37b: dneg
      // 37c: aload 26
      // 37e: getfield net/minecraft/world/phys/Vec3.z D
      // 381: dneg
      // 382: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 385: aload 20
      // 387: astore 27
      // 389: bipush 0
      // 38a: istore 28
      // 38c: aload 4
      // 38e: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
      // 391: checkcast java/util/List
      // 394: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 399: astore 29
      // 39b: aload 29
      // 39d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a2: ifeq 41d
      // 3a5: aload 29
      // 3a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3ac: checkcast kotlin/Pair
      // 3af: astore 30
      // 3b1: aload 30
      // 3b3: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 3b6: checkcast net/minecraft/world/entity/Entity
      // 3b9: astore 31
      // 3bb: aload 30
      // 3bd: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 3c0: checkcast me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 3c3: astore 32
      // 3c5: aload 31
      // 3c7: fload 5
      // 3c9: invokevirtual net/minecraft/world/entity/Entity.getPosition (F)Lnet/minecraft/world/phys/Vec3;
      // 3cc: dup
      // 3cd: sipush -31934
      // 3d0: sipush -5895
      // 3d3: pop2
      // 3d4: ldc_w "getPosition(...)"
      // 3d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3da: astore 33
      // 3dc: aload 31
      // 3de: invokevirtual net/minecraft/world/entity/Entity.getBoundingBox ()Lnet/minecraft/world/phys/AABB;
      // 3e1: aload 33
      // 3e3: aload 31
      // 3e5: invokevirtual net/minecraft/world/entity/Entity.position ()Lnet/minecraft/world/phys/Vec3;
      // 3e8: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 3eb: invokevirtual net/minecraft/world/phys/AABB.move (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;
      // 3ee: dup
      // 3ef: sipush -31932
      // 3f2: sipush 15734
      // 3f5: pop2
      // 3f6: ldc_w "move(...)"
      // 3f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3fc: astore 34
      // 3fe: aload 27
      // 400: aload 34
      // 402: aload 32
      // 404: aconst_null
      // 405: bipush 0
      // 406: bipush 0
      // 407: fconst_0
      // 408: bipush 56
      // 40a: aconst_null
      // 40b: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IIFILjava/lang/Object;)V
      // 40e: iload 2
      // 40f: ifne 426
      // 412: iload 2
      // 413: ifeq 39b
      // 416: goto 41d
      // 419: invokestatic me/octo/client/IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 41c: athrow
      // 41d: nop
      // 41e: nop
      // 41f: nop
      // 420: nop
      // 421: aload 22
      // 423: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 426: goto 433
      // 429: astore 35
      // 42b: aload 22
      // 42d: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 430: aload 35
      // 432: athrow
      // 433: nop
      // 434: nop
      // 435: nop
      // 436: nop
      // 437: aload 14
      // 439: aload 17
      // 43b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 43e: goto 44d
      // 441: astore 36
      // 443: aload 14
      // 445: aload 17
      // 447: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 44a: aload 36
      // 44c: athrow
      // 44d: nop
      // 44e: nop
      // 44f: goto 45a
      // 452: new kotlin/NoWhenBranchMatchedException
      // 455: dup
      // 456: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 459: athrow
      // 45a: aload 11
      // 45c: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 45f: sipush 2848
      // 462: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 465: goto 478
      // 468: astore 37
      // 46a: aload 11
      // 46c: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 46f: sipush 2848
      // 472: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 475: aload 37
      // 477: athrow
      // 478: nop
      // 479: aload 1
      // 47a: invokevirtual me/octo/client/events/impl/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.q ()V
      // 47d: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var23 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "G.\u001f -\u0006xF&\u008a\u0017k\u0010X3`wÄÀ\u0099Ö\u008cÛ3\u008cìxÿ_\tRZh$Àdñîn\t\u00854\u0092é\u009fÝ\u001aÙ\u0013\u0006æÁõzmu\u0005Éé\u0001cÀ\u0014Û1ß?\u0015ú\\\u001e\u008dÎè\u0007u9DTÈ\u0001\u0081å\u0010¼\u001bürW`ëÂÂYúÜÕrØ\u001e\u0005×ñÂ`¸\u0005ãc\u008b\t¿\u0012µüÝ\u0093}øf¿\u009c%3KÉ\u0097ýcî&";
      int var4 = "G.\u001f -\u0006xF&\u008a\u0017k\u0010X3`wÄÀ\u0099Ö\u008cÛ3\u008cìxÿ_\tRZh$Àdñîn\t\u00854\u0092é\u009fÝ\u001aÙ\u0013\u0006æÁõzmu\u0005Éé\u0001cÀ\u0014Û1ß?\u0015ú\\\u001e\u008dÎè\u0007u9DTÈ\u0001\u0081å\u0010¼\u001bürW`ëÂÂYúÜÕrØ\u001e\u0005×ñÂ`¸\u0005ãc\u008b\t¿\u0012µüÝ\u0093}øf¿\u009c%3KÉ\u0097ýcî&"
         .length();
      char var1 = 5;
      int var11 = -1;

      label52:
      while (true) {
         byte var10000 = 123;
         String var10001 = var2.substring(++var11, var11 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = var10000;
               var23 = var27;
               int var17 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var27;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var30 = var10000;
                  var17 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var27;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 21;
                     case 1 -> 109;
                     case 2 -> 34;
                     case 3 -> 49;
                     case 4 -> 13;
                     case 5 -> 53;
                     default -> 95;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var39 = var23;
                     var35 = var30;
                  } else {
                     if (var17 <= var6) {
                        break;
                     }

                     var39 = var23;
                     var35 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var11 += var1) >= var4) {
                     a = var5;
                     b = new String[14];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIlIllIlIllllllIIIIlIlIIIllIllllIlIIlIllIIIllllllIlIIlIllIIlIIlllIllllIIlllIIlIllI();
                     Int2IntOpenHashMap var7 = new Int2IntOpenHashMap();
                     boolean var9 = false;
                     var7.defaultReturnValue(0);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var7;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Object();
                     llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var11);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var11 += var1) < var4) {
                     var1 = var2.charAt(var11);
                     continue label52;
                  }

                  var2 = "zWF\u0019l\u0099b.äL\u0087\u0081¥\r\u0007ÅéK\u0099ÓÜg3e}¤ú";
                  var4 = "zWF\u0019l\u0099b.äL\u0087\u0081¥\r\u0007ÅéK\u0099ÓÜg3e}¤ú".length();
                  var1 = '\r';
                  var11 = -1;
            }

            var10000 = 4;
            var10001 = var2.substring(++var11, var11 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31936) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 151;
            case 1 -> 93;
            case 2 -> 170;
            case 3 -> 208;
            case 4 -> 118;
            case 5 -> 156;
            case 6 -> 54;
            case 7 -> 18;
            case 8 -> 133;
            case 9 -> 148;
            case 10 -> 89;
            case 11 -> 190;
            case 12 -> 25;
            case 13 -> 52;
            case 14 -> 223;
            case 15 -> 237;
            case 16 -> 206;
            case 17 -> 104;
            case 18 -> 86;
            case 19 -> 220;
            case 20 -> 236;
            case 21 -> 32;
            case 22 -> 21;
            case 23 -> 14;
            case 24 -> 75;
            case 25 -> 130;
            case 26 -> 179;
            case 27 -> 101;
            case 28 -> 137;
            case 29 -> 183;
            case 30 -> 55;
            case 31 -> 74;
            case 32 -> 149;
            case 33 -> 215;
            case 34 -> 35;
            case 35 -> 115;
            case 36 -> 24;
            case 37 -> 65;
            case 38 -> 114;
            case 39 -> 212;
            case 40 -> 10;
            case 41 -> 0;
            case 42 -> 249;
            case 43 -> 9;
            case 44 -> 73;
            case 45 -> 164;
            case 46 -> 185;
            case 47 -> 127;
            case 48 -> 39;
            case 49 -> 56;
            case 50 -> 110;
            case 51 -> 85;
            case 52 -> 139;
            case 53 -> 70;
            case 54 -> 168;
            case 55 -> 175;
            case 56 -> 246;
            case 57 -> 204;
            case 58 -> 61;
            case 59 -> 82;
            case 60 -> 227;
            case 61 -> 209;
            case 62 -> 199;
            case 63 -> 113;
            case 64 -> 253;
            case 65 -> 19;
            case 66 -> 84;
            case 67 -> 145;
            case 68 -> 99;
            case 69 -> 229;
            case 70 -> 123;
            case 71 -> 17;
            case 72 -> 27;
            case 73 -> 111;
            case 74 -> 146;
            case 75 -> 162;
            case 76 -> 36;
            case 77 -> 230;
            case 78 -> 169;
            case 79 -> 218;
            case 80 -> 232;
            case 81 -> 7;
            case 82 -> 251;
            case 83 -> 107;
            case 84 -> 228;
            case 85 -> 142;
            case 86 -> 100;
            case 87 -> 64;
            case 88 -> 219;
            case 89 -> 78;
            case 90 -> 126;
            case 91 -> 157;
            case 92 -> 213;
            case 93 -> 174;
            case 94 -> 112;
            case 95 -> 106;
            case 96 -> 4;
            case 97 -> 94;
            case 98 -> 2;
            case 99 -> 195;
            case 100 -> 8;
            case 101 -> 69;
            case 102 -> 66;
            case 103 -> 161;
            case 104 -> 187;
            case 105 -> 31;
            case 106 -> 202;
            case 107 -> 43;
            case 108 -> 6;
            case 109 -> 45;
            case 110 -> 29;
            case 111 -> 243;
            case 112 -> 250;
            case 113 -> 166;
            case 114 -> 80;
            case 115 -> 136;
            case 116 -> 158;
            case 117 -> 33;
            case 118 -> 131;
            case 119 -> 155;
            case 120 -> 167;
            case 121 -> 210;
            case 122 -> 58;
            case 123 -> 37;
            case 124 -> 248;
            case 125 -> 116;
            case 126 -> 83;
            case 127 -> 79;
            case 128 -> 20;
            case 129 -> 53;
            case 130 -> 15;
            case 131 -> 222;
            case 132 -> 255;
            case 133 -> 62;
            case 134 -> 239;
            case 135 -> 147;
            case 136 -> 226;
            case 137 -> 67;
            case 138 -> 90;
            case 139 -> 40;
            case 140 -> 201;
            case 141 -> 159;
            case 142 -> 207;
            case 143 -> 41;
            case 144 -> 95;
            case 145 -> 44;
            case 146 -> 119;
            case 147 -> 154;
            case 148 -> 77;
            case 149 -> 49;
            case 150 -> 23;
            case 151 -> 235;
            case 152 -> 128;
            case 153 -> 186;
            case 154 -> 92;
            case 155 -> 71;
            case 156 -> 28;
            case 157 -> 141;
            case 158 -> 134;
            case 159 -> 98;
            case 160 -> 252;
            case 161 -> 231;
            case 162 -> 221;
            case 163 -> 12;
            case 164 -> 117;
            case 165 -> 211;
            case 166 -> 247;
            case 167 -> 165;
            case 168 -> 176;
            case 169 -> 121;
            case 170 -> 42;
            case 171 -> 152;
            case 172 -> 234;
            case 173 -> 238;
            case 174 -> 124;
            case 175 -> 140;
            case 176 -> 129;
            case 177 -> 144;
            case 178 -> 191;
            case 179 -> 60;
            case 180 -> 50;
            case 181 -> 178;
            case 182 -> 177;
            case 183 -> 13;
            case 184 -> 87;
            case 185 -> 224;
            case 186 -> 122;
            case 187 -> 193;
            case 188 -> 26;
            case 189 -> 51;
            case 190 -> 233;
            case 191 -> 48;
            case 192 -> 76;
            case 193 -> 105;
            case 194 -> 11;
            case 195 -> 120;
            case 196 -> 3;
            case 197 -> 63;
            case 198 -> 102;
            case 199 -> 172;
            case 200 -> 125;
            case 201 -> 184;
            case 202 -> 88;
            case 203 -> 38;
            case 204 -> 57;
            case 205 -> 97;
            case 206 -> 214;
            case 207 -> 181;
            case 208 -> 189;
            case 209 -> 109;
            case 210 -> 132;
            case 211 -> 171;
            case 212 -> 180;
            case 213 -> 188;
            case 214 -> 47;
            case 215 -> 194;
            case 216 -> 241;
            case 217 -> 153;
            case 218 -> 216;
            case 219 -> 197;
            case 220 -> 205;
            case 221 -> 192;
            case 222 -> 30;
            case 223 -> 242;
            case 224 -> 203;
            case 225 -> 160;
            case 226 -> 103;
            case 227 -> 182;
            case 228 -> 254;
            case 229 -> 225;
            case 230 -> 46;
            case 231 -> 59;
            case 232 -> 1;
            case 233 -> 22;
            case 234 -> 245;
            case 235 -> 240;
            case 236 -> 81;
            case 237 -> 138;
            case 238 -> 34;
            case 239 -> 96;
            case 240 -> 72;
            case 241 -> 135;
            case 242 -> 196;
            case 243 -> 5;
            case 244 -> 91;
            case 245 -> 108;
            case 246 -> 173;
            case 247 -> 200;
            case 248 -> 198;
            case 249 -> 244;
            case 250 -> 143;
            case 251 -> 68;
            case 252 -> 16;
            case 253 -> 217;
            case 254 -> 150;
            default -> 163;
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
