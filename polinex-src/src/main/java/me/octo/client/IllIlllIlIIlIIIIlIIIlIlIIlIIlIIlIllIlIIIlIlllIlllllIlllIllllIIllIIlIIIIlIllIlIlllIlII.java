package me.octo.client;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public final class IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {
   @NotNull
   private final Pattern IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] c;
   private static String[] d;

   public IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII() {
      short var10001 = 12909;
      short var10002 = -20244;
      super("Museum Scanner");
      var10001 = 12900;
      var10002 = -32128;
      Pattern var2 = Pattern.compile("Milestone:\\s*(\\d+)\\s*/\\s*(\\d+)");
      short var10003 = 12903;
      short var10004 = 30933;
      Intrinsics.checkNotNullExpressionValue(var2, "compile(...)");
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
   }

   @NotNull
   public final Pattern n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final boolean o() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void c(boolean var1) {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public void g() {
   }

   @SubscribeEvent
   public final void c(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIllllIIIIlIIIIlllIIIlllIlIlIIllllllIllIlIllIlIIlIIlIIIIlIllIIlIlIlIIIIIIIlIlllIllIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.p ()I
      // 003: aload 1
      // 004: sipush 12899
      // 007: sipush -22417
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: istore 2
      // 011: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m ()Z
      // 014: iload 2
      // 015: ifne 039
      // 018: ifeq 03c
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: aload 0
      // 023: invokevirtual me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 026: sipush 500
      // 029: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 02c: checkcast java/lang/Number
      // 02f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 032: goto 039
      // 035: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: ifne 03d
      // 03c: return
      // 03d: aload 1
      // 03e: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 041: dup
      // 042: ifnonnull 04b
      // 045: pop
      // 046: return
      // 047: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: astore 3
      // 04c: aload 1
      // 04d: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 050: sipush 12910
      // 053: sipush 16527
      // 056: pop2
      // 057: ldc "Your Museum"
      // 059: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 05c: iload 2
      // 05d: ifne 080
      // 060: ifeq 41e
      // 063: goto 06a
      // 066: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: aload 0
      // 06b: iload 2
      // 06c: ifne 414
      // 06f: goto 076
      // 072: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: getfield me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Z
      // 079: goto 080
      // 07c: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: ifne 3d3
      // 083: aload 3
      // 084: bipush 52
      // 086: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 08b: checkcast net/minecraft/world/inventory/Slot
      // 08e: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 091: dup
      // 092: ifnonnull 0a2
      // 095: goto 09c
      // 098: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: pop
      // 09d: return
      // 09e: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: astore 4
      // 0a4: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 0a7: aload 4
      // 0a9: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 0ac: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0b1: dup
      // 0b2: sipush 12897
      // 0b5: sipush -24042
      // 0b8: pop2
      // 0b9: ldc "getString(...)"
      // 0bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0be: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 0c1: sipush 12898
      // 0c4: sipush -20224
      // 0c7: pop2
      // 0c8: ldc "Museum Rewards"
      // 0ca: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0cd: ifne 0d5
      // 0d0: return
      // 0d1: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0d8: aload 4
      // 0da: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 0dd: checkcast java/lang/Iterable
      // 0e0: astore 5
      // 0e2: nop
      // 0e3: bipush 0
      // 0e4: istore 6
      // 0e6: aload 5
      // 0e8: astore 7
      // 0ea: new java/util/ArrayList
      // 0ed: dup
      // 0ee: aload 5
      // 0f0: bipush 10
      // 0f2: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 0f5: invokespecial java/util/ArrayList.<init> (I)V
      // 0f8: checkcast java/util/Collection
      // 0fb: astore 8
      // 0fd: bipush 0
      // 0fe: istore 9
      // 100: aload 7
      // 102: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 107: astore 10
      // 109: aload 10
      // 10b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 110: ifeq 15c
      // 113: aload 10
      // 115: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11a: astore 11
      // 11c: aload 8
      // 11e: aload 11
      // 120: checkcast net/minecraft/network/chat/Component
      // 123: astore 12
      // 125: astore 19
      // 127: bipush 0
      // 128: istore 13
      // 12a: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 12d: aload 12
      // 12f: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 134: dup
      // 135: sipush 12901
      // 138: sipush 14965
      // 13b: pop2
      // 13c: ldc "getString(...)"
      // 13e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 141: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 144: aload 19
      // 146: swap
      // 147: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 14c: pop
      // 14d: iload 2
      // 14e: ifne 16b
      // 151: iload 2
      // 152: ifeq 109
      // 155: goto 15c
      // 158: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: aload 8
      // 15e: checkcast java/util/List
      // 161: nop
      // 162: checkcast java/lang/Iterable
      // 165: astore 5
      // 167: nop
      // 168: bipush 0
      // 169: istore 6
      // 16b: aload 5
      // 16d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 172: astore 7
      // 174: aload 7
      // 176: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17b: ifeq 1ec
      // 17e: aload 7
      // 180: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 185: astore 8
      // 187: aload 8
      // 189: checkcast java/lang/String
      // 18c: astore 9
      // 18e: bipush 0
      // 18f: istore 10
      // 191: aload 0
      // 192: getfield me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Ljava/util/regex/Pattern;
      // 195: aload 9
      // 197: checkcast java/lang/CharSequence
      // 19a: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 19d: astore 11
      // 19f: iload 2
      // 1a0: ifne 1ed
      // 1a3: iload 2
      // 1a4: ifne 1e8
      // 1a7: goto 1ae
      // 1aa: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: aload 11
      // 1b0: invokevirtual java/util/regex/Matcher.find ()Z
      // 1b3: ifeq 1e6
      // 1b6: goto 1bd
      // 1b9: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: nop
      // 1be: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1c1: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 1c4: aload 11
      // 1c6: bipush 1
      // 1c7: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 1ca: dup
      // 1cb: sipush 12908
      // 1ce: sipush -15135
      // 1d1: pop2
      // 1d2: ldc "group(...)"
      // 1d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1d7: astore 12
      // 1d9: aload 12
      // 1db: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1de: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.a (I)V
      // 1e1: goto 1e6
      // 1e4: astore 12
      // 1e6: nop
      // 1e7: nop
      // 1e8: iload 2
      // 1e9: ifeq 174
      // 1ec: nop
      // 1ed: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1f0: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 1f3: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.c ()Lme/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl;
      // 1f6: invokevirtual me/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl.a ()Ljava/util/List;
      // 1f9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1fe: astore 5
      // 200: aload 5
      // 202: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 207: ifeq 3ca
      // 20a: aload 5
      // 20c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 211: checkcast me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI
      // 214: astore 6
      // 216: iload 2
      // 217: ifne 3cf
      // 21a: iload 2
      // 21b: ifne 242
      // 21e: goto 225
      // 221: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: aload 3
      // 226: aload 6
      // 228: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.b ()I
      // 22b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 230: goto 237
      // 233: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 236: athrow
      // 237: checkcast net/minecraft/world/inventory/Slot
      // 23a: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 23d: dup
      // 23e: ifnonnull 245
      // 241: pop
      // 242: goto 200
      // 245: astore 7
      // 247: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 24a: aload 7
      // 24c: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 24f: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 254: dup
      // 255: sipush 12901
      // 258: sipush 14965
      // 25b: pop2
      // 25c: ldc "getString(...)"
      // 25e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 261: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 264: aload 6
      // 266: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.a ()Ljava/lang/String;
      // 269: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 26c: iload 2
      // 26d: ifne 207
      // 270: ifeq 200
      // 273: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 276: aload 7
      // 278: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 27b: checkcast java/lang/Iterable
      // 27e: astore 8
      // 280: nop
      // 281: bipush 0
      // 282: istore 9
      // 284: aload 8
      // 286: astore 10
      // 288: new java/util/ArrayList
      // 28b: dup
      // 28c: aload 8
      // 28e: bipush 10
      // 290: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 293: invokespecial java/util/ArrayList.<init> (I)V
      // 296: checkcast java/util/Collection
      // 299: astore 11
      // 29b: bipush 0
      // 29c: istore 12
      // 29e: aload 10
      // 2a0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2a5: astore 13
      // 2a7: aload 13
      // 2a9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2ae: ifeq 2fa
      // 2b1: aload 13
      // 2b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b8: astore 14
      // 2ba: aload 11
      // 2bc: aload 14
      // 2be: checkcast net/minecraft/network/chat/Component
      // 2c1: astore 15
      // 2c3: astore 19
      // 2c5: bipush 0
      // 2c6: istore 16
      // 2c8: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 2cb: aload 15
      // 2cd: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 2d2: dup
      // 2d3: sipush 12901
      // 2d6: sipush 14965
      // 2d9: pop2
      // 2da: ldc "getString(...)"
      // 2dc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2df: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 2e2: aload 19
      // 2e4: swap
      // 2e5: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 2ea: pop
      // 2eb: iload 2
      // 2ec: ifne 309
      // 2ef: iload 2
      // 2f0: ifeq 2a7
      // 2f3: goto 2fa
      // 2f6: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f9: athrow
      // 2fa: aload 11
      // 2fc: checkcast java/util/List
      // 2ff: nop
      // 300: checkcast java/lang/Iterable
      // 303: astore 8
      // 305: nop
      // 306: bipush 0
      // 307: istore 9
      // 309: aload 8
      // 30b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 310: astore 10
      // 312: aload 10
      // 314: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 319: ifeq 3c5
      // 31c: aload 10
      // 31e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 323: astore 11
      // 325: aload 11
      // 327: checkcast java/lang/String
      // 32a: astore 12
      // 32c: bipush 0
      // 32d: istore 13
      // 32f: new kotlin/text/Regex
      // 332: dup
      // 333: sipush 12896
      // 336: sipush 18331
      // 339: pop2
      // 33a: ldc "(\\d+)/(\\d+)"
      // 33c: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
      // 33f: aload 12
      // 341: checkcast java/lang/CharSequence
      // 344: bipush 0
      // 345: bipush 2
      // 346: aconst_null
      // 347: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 34a: astore 14
      // 34c: iload 2
      // 34d: ifne 3c1
      // 350: aload 14
      // 352: iload 2
      // 353: ifne 237
      // 356: goto 35d
      // 359: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35c: athrow
      // 35d: ifnull 3bf
      // 360: aload 14
      // 362: invokeinterface kotlin/text/MatchResult.getDestructured ()Lkotlin/text/MatchResult$Destructured; 1
      // 367: astore 15
      // 369: aload 15
      // 36b: invokevirtual kotlin/text/MatchResult$Destructured.getMatch ()Lkotlin/text/MatchResult;
      // 36e: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 373: bipush 1
      // 374: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 379: checkcast java/lang/String
      // 37c: astore 16
      // 37e: aload 15
      // 380: invokevirtual kotlin/text/MatchResult$Destructured.getMatch ()Lkotlin/text/MatchResult;
      // 383: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 388: bipush 2
      // 389: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 38e: checkcast java/lang/String
      // 391: astore 17
      // 393: aload 6
      // 395: aload 16
      // 397: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 39a: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.a (I)V
      // 39d: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3a0: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 3a3: astore 18
      // 3a5: aload 18
      // 3a7: aload 18
      // 3a9: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.b ()I
      // 3ac: aload 6
      // 3ae: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.c ()I
      // 3b1: iadd
      // 3b2: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.b (I)V
      // 3b5: aload 6
      // 3b7: aload 17
      // 3b9: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 3bc: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.b (I)V
      // 3bf: nop
      // 3c0: nop
      // 3c1: iload 2
      // 3c2: ifeq 312
      // 3c5: nop
      // 3c6: iload 2
      // 3c7: ifeq 200
      // 3ca: aload 0
      // 3cb: bipush 1
      // 3cc: putfield me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Z
      // 3cf: iload 2
      // 3d0: ifeq 66e
      // 3d3: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3d6: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 3d9: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.c ()Lme/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl;
      // 3dc: invokevirtual me/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl.d ()V
      // 3df: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 3e2: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3e5: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 3e8: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.c ()Lme/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl;
      // 3eb: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3ee: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 3f1: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.c ()Lme/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl;
      // 3f4: invokevirtual me/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl.c ()Ljava/lang/String;
      // 3f7: dup
      // 3f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 3fb: invokevirtual me/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl.d (Ljava/lang/String;)Ljava/lang/Integer;
      // 3fe: dup
      // 3ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 402: invokevirtual java/lang/Integer.intValue ()I
      // 405: bipush 0
      // 406: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 409: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 40c: aload 0
      // 40d: goto 414
      // 410: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 413: athrow
      // 414: invokevirtual me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 417: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 41a: iload 2
      // 41b: ifeq 66e
      // 41e: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 421: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 424: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.c ()Lme/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl;
      // 427: invokevirtual me/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl.e ()Lme/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI;
      // 42a: astore 4
      // 42c: aload 4
      // 42e: ifnull 66e
      // 431: aload 1
      // 432: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 435: dup
      // 436: iload 2
      // 437: ifne 462
      // 43a: goto 441
      // 43d: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 440: athrow
      // 441: ifnull 483
      // 444: goto 44b
      // 447: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44a: athrow
      // 44b: checkcast java/lang/CharSequence
      // 44e: sipush 12902
      // 451: sipush 20598
      // 454: pop2
      // 455: ldc_w "Museum"
      // 458: checkcast java/lang/CharSequence
      // 45b: goto 462
      // 45e: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 461: athrow
      // 462: bipush 0
      // 463: bipush 2
      // 464: aconst_null
      // 465: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 468: iload 2
      // 469: ifne 480
      // 46c: bipush 1
      // 46d: if_icmpne 47f
      // 470: goto 477
      // 473: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 476: athrow
      // 477: bipush 1
      // 478: goto 485
      // 47b: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47e: athrow
      // 47f: bipush 0
      // 480: goto 485
      // 483: pop
      // 484: bipush 0
      // 485: ifeq 66e
      // 488: aload 1
      // 489: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 48c: checkcast java/lang/CharSequence
      // 48f: aload 4
      // 491: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.a ()Ljava/lang/String;
      // 494: checkcast java/lang/CharSequence
      // 497: bipush 0
      // 498: bipush 2
      // 499: aconst_null
      // 49a: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 49d: iload 2
      // 49e: ifne 4b4
      // 4a1: goto 4a8
      // 4a4: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a7: athrow
      // 4a8: ifeq 66e
      // 4ab: goto 4b2
      // 4ae: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b1: athrow
      // 4b2: bipush 10
      // 4b4: istore 5
      // 4b6: iload 5
      // 4b8: bipush 44
      // 4ba: if_icmpge 5b1
      // 4bd: aload 3
      // 4be: iload 5
      // 4c0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4c5: checkcast net/minecraft/world/inventory/Slot
      // 4c8: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 4cb: dup
      // 4cc: sipush 12911
      // 4cf: sipush 25679
      // 4d2: pop2
      // 4d3: ldc_w "getItem(...)"
      // 4d6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4d9: astore 6
      // 4db: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 4de: aload 6
      // 4e0: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 4e3: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 4e8: dup
      // 4e9: sipush 12901
      // 4ec: sipush 14965
      // 4ef: pop2
      // 4f0: ldc "getString(...)"
      // 4f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4f5: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 4f8: astore 7
      // 4fa: iload 2
      // 4fb: ifne 5ad
      // 4fe: aload 6
      // 500: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 503: getstatic net/minecraft/world/item/Items.AIR Lnet/minecraft/world/item/Item;
      // 506: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 509: iload 2
      // 50a: ifne 5c8
      // 50d: goto 514
      // 510: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: ifne 5aa
      // 517: goto 51e
      // 51a: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51d: athrow
      // 51e: aload 6
      // 520: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 523: getstatic net/minecraft/world/item/Items.GRAY_DYE Lnet/minecraft/world/item/Item;
      // 526: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 529: iload 2
      // 52a: ifne 588
      // 52d: goto 534
      // 530: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 533: athrow
      // 534: ifne 576
      // 537: goto 53e
      // 53a: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53d: athrow
      // 53e: aload 6
      // 540: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 543: getstatic net/minecraft/world/item/Items.BLACK_STAINED_GLASS_PANE Lnet/minecraft/world/item/Item;
      // 546: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 549: iload 2
      // 54a: ifne 588
      // 54d: goto 554
      // 550: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 553: athrow
      // 554: ifne 576
      // 557: goto 55e
      // 55a: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55d: athrow
      // 55e: aload 4
      // 560: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.e ()Ljava/util/List;
      // 563: aload 7
      // 565: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 56a: pop
      // 56b: iload 2
      // 56c: ifeq 5aa
      // 56f: goto 576
      // 572: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 575: athrow
      // 576: aload 6
      // 578: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 57b: getstatic net/minecraft/world/item/Items.GRAY_DYE Lnet/minecraft/world/item/Item;
      // 57e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 581: goto 588
      // 584: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 587: athrow
      // 588: iload 2
      // 589: ifne 5a9
      // 58c: ifeq 5aa
      // 58f: goto 596
      // 592: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 595: athrow
      // 596: aload 4
      // 598: invokevirtual me/octo/client/IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI.f ()Ljava/util/List;
      // 59b: aload 7
      // 59d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5a2: goto 5a9
      // 5a5: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a8: athrow
      // 5a9: pop
      // 5aa: iinc 5 1
      // 5ad: iload 2
      // 5ae: ifeq 4b6
      // 5b1: aload 3
      // 5b2: bipush 53
      // 5b4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5b9: checkcast net/minecraft/world/inventory/Slot
      // 5bc: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 5bf: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 5c2: getstatic net/minecraft/world/item/Items.ARROW Lnet/minecraft/world/item/Item;
      // 5c5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 5c8: iload 2
      // 5c9: ifne 612
      // 5cc: ifeq 5f4
      // 5cf: goto 5d6
      // 5d2: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d5: athrow
      // 5d6: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 5d9: bipush 53
      // 5db: bipush 0
      // 5dc: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 5df: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 5e2: aload 0
      // 5e3: invokevirtual me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 5e6: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 5e9: iload 2
      // 5ea: ifeq 66e
      // 5ed: goto 5f4
      // 5f0: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f3: athrow
      // 5f4: aload 3
      // 5f5: bipush 48
      // 5f7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5fc: checkcast net/minecraft/world/inventory/Slot
      // 5ff: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 602: invokevirtual net/minecraft/world/item/ItemStack.getItem ()Lnet/minecraft/world/item/Item;
      // 605: getstatic net/minecraft/world/item/Items.ARROW Lnet/minecraft/world/item/Item;
      // 608: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 60b: goto 612
      // 60e: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 611: athrow
      // 612: iload 2
      // 613: ifne 651
      // 616: ifeq 66e
      // 619: goto 620
      // 61c: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61f: athrow
      // 620: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 623: bipush 48
      // 625: bipush 0
      // 626: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 629: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 62c: aload 0
      // 62d: invokevirtual me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.d ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 630: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 633: iload 2
      // 634: ifne 667
      // 637: goto 63e
      // 63a: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63d: athrow
      // 63e: getstatic me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 641: invokevirtual me/octo/client/lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Lme/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl;
      // 644: invokevirtual me/octo/client/lIIIIIIIIlIlIlIlIIIlIlIllIIIlIIllIIllIlIlIIlIIIlIlIIIIIIIIllIllIIllllllIlIIlIIllIIlIl.c ()Lme/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl;
      // 647: invokevirtual me/octo/client/IIlIIIIlIIlllIIllIlIIllIllllllIIIIIIllIIIIIllIlllllIIllIIlIlIlllllIIIllIIIIIllIIIllIl.f ()Z
      // 64a: goto 651
      // 64d: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 650: athrow
      // 651: ifeq 66e
      // 654: aload 0
      // 655: bipush 1
      // 656: invokevirtual me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Z)V
      // 659: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 65c: bipush 1
      // 65d: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.e (Z)V
      // 660: goto 667
      // 663: invokestatic me/octo/client/IllIlllIlIIlIIIIlIIIlIlIIlIIlIIlIllIlIIIlIlllIlllllIlllIllllIIllIIlIIIIlIllIlIlllIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 666: athrow
      // 667: getstatic me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl;
      // 66a: bipush 1
      // 66b: invokevirtual me/octo/client/llllllIlllllIlIlIIlIlIIIlIlIIIlIIIlllIIlllIlllIIllIlIIIlIllIlIllllIlIlIlIIlllllllllIl.f (Z)V
      // 66e: return
   }

   public void j() {
      this.d().f();
      super.j();
   }

   public void k() {
      this.d().d();
      super.k();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "J\u007f{\n0¨%Ð\u00899`ä¥øÖ\u009c\u009c\u0096Lù%\\]\u0088\u0092é5%\u000b¯\u000e7û£!7;$dm½Ìy\b¼\u0006]P\u0086puþ\fRð\u0092(6C¶ðû§~û\u000bÒ\u0001©\u001896R\u0001Éf<\u000e\u0018\u0085Fî\u008bÂ³[\u009fZ\u0092\u0085Ã#\u000eÞ\u0086öª{¥Åw3;\nA<6\u0005\u0093ÚdIü\noF³EI\u000f(³\n\u000e\u000ef\u0001áZ\u0099»\u0099µ¾TrdÜ\f";
      int var4 = "J\u007f{\n0¨%Ð\u00899`ä¥øÖ\u009c\u009c\u0096Lù%\\]\u0088\u0092é5%\u000b¯\u000e7û£!7;$dm½Ìy\b¼\u0006]P\u0086puþ\fRð\u0092(6C¶ðû§~û\u000bÒ\u0001©\u001896R\u0001Éf<\u000e\u0018\u0085Fî\u008bÂ³[\u009fZ\u0092\u0085Ã#\u000eÞ\u0086öª{¥Åw3;\nA<6\u0005\u0093ÚdIü\noF³EI\u000f(³\n\u000e\u000ef\u0001áZ\u0099»\u0099µ¾TrdÜ\f"
         .length();
      char var1 = 30;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 53;
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
                     case 0 -> 75;
                     case 1 -> 88;
                     case 2 -> 64;
                     case 3 -> 92;
                     case 4 -> 86;
                     case 5 -> 76;
                     default -> 8;
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
                     c = var5;
                     d = new String[12];
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

                  var2 = "½'ü&_\u0017\u001dÒ!~²\fÙç\u0088N¤n¤\u008bF>?>";
                  var4 = "½'ü&_\u0017\u001dÒ!~²\fÙç\u0088N¤n¤\u008bF>?>".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 104;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 12900) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 87;
            case 1 -> 114;
            case 2 -> 172;
            case 3 -> 248;
            case 4 -> 174;
            case 5 -> 203;
            case 6 -> 222;
            case 7 -> 100;
            case 8 -> 196;
            case 9 -> 215;
            case 10 -> 190;
            case 11 -> 229;
            case 12 -> 135;
            case 13 -> 187;
            case 14 -> 13;
            case 15 -> 65;
            case 16 -> 68;
            case 17 -> 107;
            case 18 -> 78;
            case 19 -> 166;
            case 20 -> 72;
            case 21 -> 246;
            case 22 -> 99;
            case 23 -> 75;
            case 24 -> 151;
            case 25 -> 89;
            case 26 -> 155;
            case 27 -> 49;
            case 28 -> 186;
            case 29 -> 242;
            case 30 -> 93;
            case 31 -> 98;
            case 32 -> 70;
            case 33 -> 153;
            case 34 -> 38;
            case 35 -> 8;
            case 36 -> 33;
            case 37 -> 201;
            case 38 -> 221;
            case 39 -> 251;
            case 40 -> 133;
            case 41 -> 137;
            case 42 -> 50;
            case 43 -> 25;
            case 44 -> 134;
            case 45 -> 16;
            case 46 -> 31;
            case 47 -> 126;
            case 48 -> 184;
            case 49 -> 10;
            case 50 -> 79;
            case 51 -> 163;
            case 52 -> 7;
            case 53 -> 167;
            case 54 -> 208;
            case 55 -> 51;
            case 56 -> 147;
            case 57 -> 144;
            case 58 -> 205;
            case 59 -> 69;
            case 60 -> 1;
            case 61 -> 136;
            case 62 -> 34;
            case 63 -> 131;
            case 64 -> 108;
            case 65 -> 46;
            case 66 -> 42;
            case 67 -> 123;
            case 68 -> 81;
            case 69 -> 86;
            case 70 -> 0;
            case 71 -> 43;
            case 72 -> 168;
            case 73 -> 71;
            case 74 -> 207;
            case 75 -> 213;
            case 76 -> 182;
            case 77 -> 206;
            case 78 -> 240;
            case 79 -> 162;
            case 80 -> 236;
            case 81 -> 27;
            case 82 -> 97;
            case 83 -> 14;
            case 84 -> 41;
            case 85 -> 2;
            case 86 -> 91;
            case 87 -> 234;
            case 88 -> 24;
            case 89 -> 28;
            case 90 -> 171;
            case 91 -> 161;
            case 92 -> 111;
            case 93 -> 32;
            case 94 -> 115;
            case 95 -> 211;
            case 96 -> 244;
            case 97 -> 181;
            case 98 -> 76;
            case 99 -> 52;
            case 100 -> 152;
            case 101 -> 96;
            case 102 -> 21;
            case 103 -> 82;
            case 104 -> 90;
            case 105 -> 112;
            case 106 -> 139;
            case 107 -> 110;
            case 108 -> 5;
            case 109 -> 122;
            case 110 -> 119;
            case 111 -> 77;
            case 112 -> 127;
            case 113 -> 239;
            case 114 -> 227;
            case 115 -> 113;
            case 116 -> 149;
            case 117 -> 109;
            case 118 -> 56;
            case 119 -> 230;
            case 120 -> 22;
            case 121 -> 35;
            case 122 -> 217;
            case 123 -> 102;
            case 124 -> 159;
            case 125 -> 116;
            case 126 -> 180;
            case 127 -> 143;
            case 128 -> 39;
            case 129 -> 245;
            case 130 -> 224;
            case 131 -> 226;
            case 132 -> 233;
            case 133 -> 228;
            case 134 -> 164;
            case 135 -> 202;
            case 136 -> 192;
            case 137 -> 140;
            case 138 -> 188;
            case 139 -> 54;
            case 140 -> 29;
            case 141 -> 30;
            case 142 -> 12;
            case 143 -> 255;
            case 144 -> 57;
            case 145 -> 179;
            case 146 -> 15;
            case 147 -> 73;
            case 148 -> 58;
            case 149 -> 156;
            case 150 -> 210;
            case 151 -> 247;
            case 152 -> 160;
            case 153 -> 175;
            case 154 -> 118;
            case 155 -> 148;
            case 156 -> 194;
            case 157 -> 216;
            case 158 -> 200;
            case 159 -> 223;
            case 160 -> 19;
            case 161 -> 45;
            case 162 -> 177;
            case 163 -> 219;
            case 164 -> 241;
            case 165 -> 105;
            case 166 -> 173;
            case 167 -> 117;
            case 168 -> 80;
            case 169 -> 185;
            case 170 -> 88;
            case 171 -> 218;
            case 172 -> 23;
            case 173 -> 146;
            case 174 -> 125;
            case 175 -> 106;
            case 176 -> 74;
            case 177 -> 3;
            case 178 -> 18;
            case 179 -> 48;
            case 180 -> 63;
            case 181 -> 61;
            case 182 -> 20;
            case 183 -> 59;
            case 184 -> 94;
            case 185 -> 62;
            case 186 -> 189;
            case 187 -> 53;
            case 188 -> 47;
            case 189 -> 60;
            case 190 -> 243;
            case 191 -> 26;
            case 192 -> 157;
            case 193 -> 150;
            case 194 -> 55;
            case 195 -> 252;
            case 196 -> 232;
            case 197 -> 95;
            case 198 -> 254;
            case 199 -> 11;
            case 200 -> 250;
            case 201 -> 209;
            case 202 -> 121;
            case 203 -> 158;
            case 204 -> 176;
            case 205 -> 170;
            case 206 -> 44;
            case 207 -> 145;
            case 208 -> 249;
            case 209 -> 253;
            case 210 -> 9;
            case 211 -> 214;
            case 212 -> 191;
            case 213 -> 195;
            case 214 -> 165;
            case 215 -> 130;
            case 216 -> 66;
            case 217 -> 64;
            case 218 -> 67;
            case 219 -> 141;
            case 220 -> 84;
            case 221 -> 40;
            case 222 -> 6;
            case 223 -> 204;
            case 224 -> 120;
            case 225 -> 154;
            case 226 -> 237;
            case 227 -> 36;
            case 228 -> 193;
            case 229 -> 101;
            case 230 -> 17;
            case 231 -> 197;
            case 232 -> 124;
            case 233 -> 235;
            case 234 -> 198;
            case 235 -> 129;
            case 236 -> 220;
            case 237 -> 231;
            case 238 -> 92;
            case 239 -> 4;
            case 240 -> 132;
            case 241 -> 212;
            case 242 -> 104;
            case 243 -> 183;
            case 244 -> 238;
            case 245 -> 37;
            case 246 -> 103;
            case 247 -> 225;
            case 248 -> 199;
            case 249 -> 138;
            case 250 -> 178;
            case 251 -> 142;
            case 252 -> 83;
            case 253 -> 128;
            case 254 -> 169;
            default -> 85;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
