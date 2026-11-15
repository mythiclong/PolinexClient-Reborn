package me.octo.client;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

public final class lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static Set<Character> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll() {
      short var10001 = -8143;
      short var10002 = -11556;
      var10002 = -8159;
      short var10003 = 6668;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -8158;
      short var10005 = -23044;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.d(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.e(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.f(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.g(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.h(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.i(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.j(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.k(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.l(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.m(),
         IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.n()
      };
      super("PlayerESP", "Highlights players with ESP effects.", var3, "Player", var1);
   }

   public void aC() {
      super.aC();
      IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.a();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -8156
      // 007: sipush 4382
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 2
      // 012: ifnonnull 02f
      // 015: aload 0
      // 016: invokevirtual me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.ap ()Lnet/minecraft/client/Minecraft;
      // 019: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 01c: dup
      // 01d: ifnonnull 030
      // 020: goto 027
      // 023: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 026: athrow
      // 027: pop
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02e: athrow
      // 02f: return
      // 030: astore 3
      // 031: aload 2
      // 032: ifnonnull 04f
      // 035: aload 0
      // 036: invokevirtual me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.ap ()Lnet/minecraft/client/Minecraft;
      // 039: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 03c: dup
      // 03d: ifnonnull 050
      // 040: goto 047
      // 043: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 046: athrow
      // 047: pop
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04e: athrow
      // 04f: return
      // 050: astore 4
      // 052: aload 1
      // 053: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.m ()F
      // 056: fstore 5
      // 058: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.e ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 05b: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.B ()Ljava/lang/String;
      // 05e: astore 6
      // 060: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.d ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 063: sipush -8135
      // 066: sipush -15863
      // 069: pop2
      // 06a: ldc "Box"
      // 06c: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.c (Ljava/lang/String;)Z
      // 06f: istore 7
      // 071: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.f ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 074: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 077: istore 8
      // 079: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.g ()Lme/octo/client/llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII;
      // 07c: invokevirtual me/octo/client/llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII.j ()I
      // 07f: ldc 16777215
      // 081: iand
      // 082: istore 9
      // 084: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 087: dup
      // 088: ldc -16777216
      // 08a: iload 9
      // 08c: ior
      // 08d: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 090: astore 10
      // 092: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.h ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 095: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 098: fstore 11
      // 09a: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.i ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 09d: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 0a0: fstore 12
      // 0a2: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.j ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 0a5: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 0a8: fstore 13
      // 0aa: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.k ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 0ad: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 0b0: ldc 255.0
      // 0b2: fmul
      // 0b3: f2i
      // 0b4: bipush 0
      // 0b5: sipush 255
      // 0b8: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 0bb: istore 14
      // 0bd: iload 14
      // 0bf: ifle 0d8
      // 0c2: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 0c5: dup
      // 0c6: iload 14
      // 0c8: bipush 24
      // 0ca: ishl
      // 0cb: iload 9
      // 0cd: ior
      // 0ce: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 0d1: goto 0d9
      // 0d4: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d7: athrow
      // 0d8: aconst_null
      // 0d9: astore 15
      // 0db: aload 3
      // 0dc: invokevirtual net/minecraft/client/multiplayer/ClientLevel.players ()Ljava/util/List;
      // 0df: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e4: astore 16
      // 0e6: aload 16
      // 0e8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ed: ifeq 6d9
      // 0f0: aload 16
      // 0f2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f7: dup
      // 0f8: sipush -8142
      // 0fb: sipush -31926
      // 0fe: pop2
      // 0ff: ldc "next(...)"
      // 101: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 104: checkcast net/minecraft/client/player/AbstractClientPlayer
      // 107: astore 17
      // 109: aload 17
      // 10b: aload 4
      // 10d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 110: aload 2
      // 111: ifnonnull 123
      // 114: ifne 0e6
      // 117: goto 11e
      // 11a: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11d: athrow
      // 11e: aload 17
      // 120: invokevirtual net/minecraft/client/player/AbstractClientPlayer.isAlive ()Z
      // 123: aload 2
      // 124: ifnonnull 13a
      // 127: ifne 134
      // 12a: goto 131
      // 12d: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 130: athrow
      // 131: goto 0e6
      // 134: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.n ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 137: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 13a: aload 2
      // 13b: ifnonnull 170
      // 13e: ifeq 166
      // 141: goto 148
      // 144: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 147: athrow
      // 148: aload 0
      // 149: aload 17
      // 14b: checkcast net/minecraft/world/entity/player/Player
      // 14e: invokespecial me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lnet/minecraft/world/entity/player/Player;)Z
      // 151: aload 2
      // 152: ifnonnull 170
      // 155: goto 15c
      // 158: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15b: athrow
      // 15c: ifne 0e6
      // 15f: goto 166
      // 162: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 165: athrow
      // 166: aload 17
      // 168: checkcast net/minecraft/world/entity/Entity
      // 16b: invokestatic me/octo/client/IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.a (Lnet/minecraft/world/entity/Entity;)V
      // 16e: iload 7
      // 170: aload 2
      // 171: ifnonnull 1b5
      // 174: ifeq 1b3
      // 177: goto 17e
      // 17a: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17d: athrow
      // 17e: iload 8
      // 180: aload 2
      // 181: ifnonnull 1b5
      // 184: goto 18b
      // 187: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18a: athrow
      // 18b: ifeq 1b3
      // 18e: goto 195
      // 191: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 194: athrow
      // 195: aload 17
      // 197: checkcast net/minecraft/world/entity/Entity
      // 19a: aconst_null
      // 19b: fconst_0
      // 19c: aconst_null
      // 19d: fconst_0
      // 19e: fconst_0
      // 19f: bipush 0
      // 1a0: aconst_null
      // 1a1: fconst_0
      // 1a2: fconst_0
      // 1a3: bipush 0
      // 1a4: bipush 1
      // 1a5: sipush 2046
      // 1a8: aconst_null
      // 1a9: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 1ac: goto 1b3
      // 1af: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b2: athrow
      // 1b3: iload 7
      // 1b5: ifeq 381
      // 1b8: aload 17
      // 1ba: fload 5
      // 1bc: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getPosition (F)Lnet/minecraft/world/phys/Vec3;
      // 1bf: dup
      // 1c0: sipush -8140
      // 1c3: sipush -30919
      // 1c6: pop2
      // 1c7: ldc "getPosition(...)"
      // 1c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1cc: astore 18
      // 1ce: aload 17
      // 1d0: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getBoundingBox ()Lnet/minecraft/world/phys/AABB;
      // 1d3: aload 18
      // 1d5: getfield net/minecraft/world/phys/Vec3.x D
      // 1d8: aload 17
      // 1da: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getX ()D
      // 1dd: dsub
      // 1de: aload 18
      // 1e0: getfield net/minecraft/world/phys/Vec3.y D
      // 1e3: aload 17
      // 1e5: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getY ()D
      // 1e8: dsub
      // 1e9: aload 18
      // 1eb: getfield net/minecraft/world/phys/Vec3.z D
      // 1ee: aload 17
      // 1f0: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getZ ()D
      // 1f3: dsub
      // 1f4: invokevirtual net/minecraft/world/phys/AABB.move (DDD)Lnet/minecraft/world/phys/AABB;
      // 1f7: dup
      // 1f8: sipush -8130
      // 1fb: sipush 24519
      // 1fe: pop2
      // 1ff: ldc_w "move(...)"
      // 202: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 205: astore 19
      // 207: aload 6
      // 209: astore 20
      // 20b: aload 2
      // 20c: ifnonnull 37d
      // 20f: aload 20
      // 211: invokevirtual java/lang/String.hashCode ()I
      // 214: lookupswitch 335 5 -405395281 56 2222509 113 558407714 88 843064335 163 2104334722 138
      // 248: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 24b: athrow
      // 24c: aload 20
      // 24e: sipush -8133
      // 251: sipush 26751
      // 254: pop2
      // 255: ldc_w "Glow Outline"
      // 258: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25b: ifne 306
      // 25e: goto 265
      // 261: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 264: athrow
      // 265: goto 363
      // 268: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 26b: athrow
      // 26c: aload 20
      // 26e: sipush -8131
      // 271: sipush 20947
      // 274: pop2
      // 275: ldc_w "Outline"
      // 278: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27b: ifne 2d0
      // 27e: goto 363
      // 281: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 284: athrow
      // 285: aload 20
      // 287: sipush -8157
      // 28a: sipush 25086
      // 28d: pop2
      // 28e: ldc_w "Glow"
      // 291: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 294: ifne 2e7
      // 297: goto 363
      // 29a: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 29d: athrow
      // 29e: aload 20
      // 2a0: sipush -8138
      // 2a3: sipush -23087
      // 2a6: pop2
      // 2a7: ldc_w "Filled"
      // 2aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2ad: ifne 327
      // 2b0: goto 363
      // 2b3: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b6: athrow
      // 2b7: aload 20
      // 2b9: sipush -8154
      // 2bc: sipush -5888
      // 2bf: pop2
      // 2c0: ldc_w "Filled + Outline"
      // 2c3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c6: ifne 344
      // 2c9: goto 363
      // 2cc: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2cf: athrow
      // 2d0: aload 19
      // 2d2: aconst_null
      // 2d3: aload 10
      // 2d5: fload 11
      // 2d7: aconst_null
      // 2d8: aconst_null
      // 2d9: fconst_0
      // 2da: bipush 0
      // 2db: fconst_0
      // 2dc: sipush 498
      // 2df: aconst_null
      // 2e0: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 2e3: aload 2
      // 2e4: ifnull 535
      // 2e7: aload 19
      // 2e9: aconst_null
      // 2ea: aconst_null
      // 2eb: fconst_0
      // 2ec: aconst_null
      // 2ed: aload 10
      // 2ef: fload 12
      // 2f1: bipush 0
      // 2f2: fload 13
      // 2f4: sipush 158
      // 2f7: aconst_null
      // 2f8: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 2fb: aload 2
      // 2fc: ifnull 535
      // 2ff: goto 306
      // 302: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 305: athrow
      // 306: aload 19
      // 308: aconst_null
      // 309: aload 10
      // 30b: fload 11
      // 30d: aconst_null
      // 30e: aload 10
      // 310: fload 12
      // 312: bipush 0
      // 313: fload 13
      // 315: sipush 146
      // 318: aconst_null
      // 319: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 31c: aload 2
      // 31d: ifnull 535
      // 320: goto 327
      // 323: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 326: athrow
      // 327: aload 19
      // 329: aload 15
      // 32b: aconst_null
      // 32c: fconst_0
      // 32d: aconst_null
      // 32e: aconst_null
      // 32f: fconst_0
      // 330: bipush 0
      // 331: fconst_0
      // 332: sipush 508
      // 335: aconst_null
      // 336: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 339: aload 2
      // 33a: ifnull 535
      // 33d: goto 344
      // 340: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 343: athrow
      // 344: aload 19
      // 346: aload 15
      // 348: aload 10
      // 34a: fload 11
      // 34c: aconst_null
      // 34d: aconst_null
      // 34e: fconst_0
      // 34f: bipush 0
      // 350: fconst_0
      // 351: sipush 496
      // 354: aconst_null
      // 355: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 358: aload 2
      // 359: ifnull 535
      // 35c: goto 363
      // 35f: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 362: athrow
      // 363: aload 19
      // 365: aconst_null
      // 366: aload 10
      // 368: fload 11
      // 36a: aconst_null
      // 36b: aconst_null
      // 36c: fconst_0
      // 36d: bipush 0
      // 36e: fconst_0
      // 36f: sipush 498
      // 372: aconst_null
      // 373: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 376: goto 37d
      // 379: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 37c: athrow
      // 37d: aload 2
      // 37e: ifnull 535
      // 381: aload 15
      // 383: dup
      // 384: ifnonnull 398
      // 387: goto 38e
      // 38a: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 38d: athrow
      // 38e: pop
      // 38f: aload 10
      // 391: goto 398
      // 394: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 397: athrow
      // 398: astore 18
      // 39a: aload 6
      // 39c: astore 19
      // 39e: aload 19
      // 3a0: invokevirtual java/lang/String.hashCode ()I
      // 3a3: aload 2
      // 3a4: ifnonnull 3f2
      // 3a7: lookupswitch 367 5 -405395281 53 2222509 106 558407714 81 843064335 156 2104334722 131
      // 3d8: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3db: athrow
      // 3dc: aload 19
      // 3de: sipush -8132
      // 3e1: sipush -24439
      // 3e4: pop2
      // 3e5: ldc_w "Glow Outline"
      // 3e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3eb: goto 3f2
      // 3ee: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f1: athrow
      // 3f2: ifne 4a0
      // 3f5: goto 516
      // 3f8: aload 19
      // 3fa: sipush -8153
      // 3fd: sipush -20132
      // 400: pop2
      // 401: ldc_w "Outline"
      // 404: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 407: ifne 45c
      // 40a: goto 516
      // 40d: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 410: athrow
      // 411: aload 19
      // 413: sipush -8160
      // 416: sipush -12356
      // 419: pop2
      // 41a: ldc_w "Glow"
      // 41d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 420: ifne 47a
      // 423: goto 516
      // 426: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 429: athrow
      // 42a: aload 19
      // 42c: sipush -8129
      // 42f: sipush 2699
      // 432: pop2
      // 433: ldc_w "Filled"
      // 436: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 439: ifne 4c8
      // 43c: goto 516
      // 43f: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 442: athrow
      // 443: aload 19
      // 445: sipush -8137
      // 448: sipush 25929
      // 44b: pop2
      // 44c: ldc_w "Filled + Outline"
      // 44f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 452: ifne 4ee
      // 455: goto 516
      // 458: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 45b: athrow
      // 45c: aload 17
      // 45e: checkcast net/minecraft/world/entity/Entity
      // 461: aload 10
      // 463: fload 11
      // 465: aconst_null
      // 466: fconst_0
      // 467: fconst_0
      // 468: bipush 0
      // 469: aconst_null
      // 46a: fconst_0
      // 46b: fconst_0
      // 46c: bipush 0
      // 46d: iload 8
      // 46f: sipush 2040
      // 472: aconst_null
      // 473: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 476: aload 2
      // 477: ifnull 535
      // 47a: aload 17
      // 47c: checkcast net/minecraft/world/entity/Entity
      // 47f: aconst_null
      // 480: fconst_0
      // 481: aload 10
      // 483: fload 12
      // 485: fload 13
      // 487: bipush 0
      // 488: aconst_null
      // 489: fconst_0
      // 48a: fconst_0
      // 48b: bipush 0
      // 48c: iload 8
      // 48e: sipush 1990
      // 491: aconst_null
      // 492: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 495: aload 2
      // 496: ifnull 535
      // 499: goto 4a0
      // 49c: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 49f: athrow
      // 4a0: aload 17
      // 4a2: checkcast net/minecraft/world/entity/Entity
      // 4a5: aload 10
      // 4a7: fload 11
      // 4a9: aload 10
      // 4ab: fload 12
      // 4ad: fload 13
      // 4af: bipush 0
      // 4b0: aconst_null
      // 4b1: fconst_0
      // 4b2: fconst_0
      // 4b3: bipush 0
      // 4b4: iload 8
      // 4b6: sipush 1984
      // 4b9: aconst_null
      // 4ba: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 4bd: aload 2
      // 4be: ifnull 535
      // 4c1: goto 4c8
      // 4c4: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4c7: athrow
      // 4c8: aload 17
      // 4ca: checkcast net/minecraft/world/entity/Entity
      // 4cd: aconst_null
      // 4ce: fconst_0
      // 4cf: aload 18
      // 4d1: fload 12
      // 4d3: fload 13
      // 4d5: bipush 0
      // 4d6: aconst_null
      // 4d7: fconst_0
      // 4d8: fconst_0
      // 4d9: bipush 0
      // 4da: iload 8
      // 4dc: sipush 1926
      // 4df: aconst_null
      // 4e0: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 4e3: aload 2
      // 4e4: ifnull 535
      // 4e7: goto 4ee
      // 4ea: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4ed: athrow
      // 4ee: aload 17
      // 4f0: checkcast net/minecraft/world/entity/Entity
      // 4f3: aload 10
      // 4f5: fload 11
      // 4f7: aload 18
      // 4f9: fload 12
      // 4fb: fload 13
      // 4fd: bipush 0
      // 4fe: aconst_null
      // 4ff: fconst_0
      // 500: fconst_0
      // 501: bipush 0
      // 502: iload 8
      // 504: sipush 1920
      // 507: aconst_null
      // 508: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 50b: aload 2
      // 50c: ifnull 535
      // 50f: goto 516
      // 512: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 515: athrow
      // 516: aload 17
      // 518: checkcast net/minecraft/world/entity/Entity
      // 51b: aconst_null
      // 51c: fconst_0
      // 51d: aconst_null
      // 51e: fconst_0
      // 51f: fconst_0
      // 520: bipush 0
      // 521: aconst_null
      // 522: fconst_0
      // 523: fconst_0
      // 524: bipush 0
      // 525: iload 8
      // 527: sipush 2046
      // 52a: aconst_null
      // 52b: invokestatic me/octo/client/IIIIIlIlIIlIIllllllIlllllIlIlIIIIIIIIlIlllllIlIIlIlIIlIIIIIIIlllIIIlllIIIlllllIlIIlII.a (Lnet/minecraft/world/entity/Entity;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FFZZILjava/lang/Object;)V
      // 52e: goto 535
      // 531: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 534: athrow
      // 535: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.l ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 538: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 53b: aload 2
      // 53c: ifnonnull 0ed
      // 53f: ifeq 0e6
      // 542: aload 17
      // 544: fload 5
      // 546: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getPosition (F)Lnet/minecraft/world/phys/Vec3;
      // 549: dup
      // 54a: sipush -8134
      // 54d: sipush -28359
      // 550: pop2
      // 551: ldc "getPosition(...)"
      // 553: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 556: astore 18
      // 558: new net/minecraft/world/phys/Vec3
      // 55b: dup
      // 55c: aload 18
      // 55e: getfield net/minecraft/world/phys/Vec3.x D
      // 561: aload 18
      // 563: getfield net/minecraft/world/phys/Vec3.y D
      // 566: aload 17
      // 568: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getBbHeight ()F
      // 56b: f2d
      // 56c: ldc2_w 0.5
      // 56f: dmul
      // 570: dadd
      // 571: aload 18
      // 573: getfield net/minecraft/world/phys/Vec3.z D
      // 576: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 579: astore 19
      // 57b: ldc -16777216
      // 57d: iload 9
      // 57f: ior
      // 580: istore 20
      // 582: invokestatic me/octo/client/IIllllllIlllIIlIlllIIlllIlIllIIIIIIlIIllIlIlIlIllIIllIIllllllIlIIIlIIIIIlIlIlIllllIll.m ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 585: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 588: fstore 21
      // 58a: aload 1
      // 58b: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 58e: astore 22
      // 590: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 593: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 596: dup
      // 597: sipush -8136
      // 59a: sipush 8920
      // 59d: pop2
      // 59e: ldc_w "getMainRenderTarget(...)"
      // 5a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 5a4: astore 23
      // 5a6: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 5a9: astore 24
      // 5ab: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 5ae: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 5b1: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 5b4: dup
      // 5b5: sipush -8144
      // 5b8: sipush 13252
      // 5bb: pop2
      // 5bc: ldc_w "getMainCamera(...)"
      // 5bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 5c2: astore 25
      // 5c4: bipush 0
      // 5c5: istore 26
      // 5c7: sipush 2848
      // 5ca: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 5cd: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 5d0: aload 23
      // 5d2: aload 22
      // 5d4: aload 25
      // 5d6: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 5d9: astore 27
      // 5db: nop
      // 5dc: aload 24
      // 5de: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 5e1: swap
      // 5e2: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 5e5: iaload
      // 5e6: tableswitch 196 1 2 22 109
      // 5fc: aload 27
      // 5fe: astore 28
      // 600: bipush 0
      // 601: istore 29
      // 603: aload 28
      // 605: astore 30
      // 607: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 60a: astore 31
      // 60c: bipush 0
      // 60d: istore 32
      // 60f: aload 30
      // 611: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 614: astore 33
      // 616: aload 30
      // 618: aload 31
      // 61a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 61d: nop
      // 61e: aload 30
      // 620: astore 34
      // 622: bipush 0
      // 623: istore 35
      // 625: aload 34
      // 627: fconst_0
      // 628: fconst_0
      // 629: ldc_w 0.9
      // 62c: aload 19
      // 62e: iload 20
      // 630: fload 21
      // 632: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;FFFLnet/minecraft/world/phys/Vec3;IF)V
      // 635: nop
      // 636: nop
      // 637: aload 30
      // 639: aload 33
      // 63b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 63e: goto 64d
      // 641: astore 36
      // 643: aload 30
      // 645: aload 33
      // 647: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 64a: aload 36
      // 64c: athrow
      // 64d: nop
      // 64e: nop
      // 64f: aload 2
      // 650: ifnull 6b6
      // 653: aload 27
      // 655: astore 28
      // 657: bipush 0
      // 658: istore 29
      // 65a: aload 28
      // 65c: astore 30
      // 65e: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 661: astore 31
      // 663: bipush 0
      // 664: istore 32
      // 666: aload 30
      // 668: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 66b: astore 33
      // 66d: aload 30
      // 66f: aload 31
      // 671: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 674: nop
      // 675: aload 30
      // 677: astore 34
      // 679: bipush 0
      // 67a: istore 35
      // 67c: aload 34
      // 67e: fconst_0
      // 67f: fconst_0
      // 680: ldc_w 0.9
      // 683: aload 19
      // 685: iload 20
      // 687: fload 21
      // 689: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;FFFLnet/minecraft/world/phys/Vec3;IF)V
      // 68c: nop
      // 68d: nop
      // 68e: aload 30
      // 690: aload 33
      // 692: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 695: goto 6a4
      // 698: astore 36
      // 69a: aload 30
      // 69c: aload 33
      // 69e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 6a1: aload 36
      // 6a3: athrow
      // 6a4: nop
      // 6a5: nop
      // 6a6: aload 2
      // 6a7: ifnull 6b6
      // 6aa: new kotlin/NoWhenBranchMatchedException
      // 6ad: dup
      // 6ae: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 6b1: athrow
      // 6b2: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6b5: athrow
      // 6b6: aload 27
      // 6b8: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 6bb: sipush 2848
      // 6be: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 6c1: goto 6d4
      // 6c4: astore 37
      // 6c6: aload 27
      // 6c8: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 6cb: sipush 2848
      // 6ce: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 6d1: aload 37
      // 6d3: athrow
      // 6d4: nop
      // 6d5: aload 2
      // 6d6: ifnull 0e6
      // 6d9: return
   }

   private final boolean a(Player param1) {
      // decoy String getter and its `aload_2; ifnull/ifnonnull` folds dropped (COMMON decoy family).
      if (param1.isDeadOrDying() || param1.isSpectator()) {
         return true;
      }
      if (param1.tickCount < 20) {
         return true;
      }
      java.util.UUID var3 = param1.getUUID();
      if (var3.version() != 4) {
         return true;
      }
      net.minecraft.client.multiplayer.ClientPacketListener var4 = this.ap().getConnection();
      if (var4 == null || var4.getPlayerInfo(var3) == null) {
         return true;
      }
      String var5 = param1.getName().getString();
      if (var5.length() > 16 || var5.isEmpty()) {
         return true;
      }
      for (int var7 = 0; var7 < var5.length(); var7++) {
         char var8 = var5.charAt(var7);
         if (!lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.contains(var8)) {
            return true;
         }
      }
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: invokevirtual net/minecraft/world/entity/player/Player.isDeadOrDying ()Z
      // 008: aload 2
      // 009: ifnonnull 030
      // 00c: ifne 02f
      // 00f: goto 016
      // 012: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 015: athrow
      // 016: aload 1
      // 017: invokevirtual net/minecraft/world/entity/player/Player.isSpectator ()Z
      // 01a: aload 2
      // 01b: ifnonnull 040
      // 01e: goto 025
      // 021: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 024: athrow
      // 025: ifeq 031
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02e: athrow
      // 02f: bipush 1
      // 030: ireturn
      // 031: aload 1
      // 032: aload 2
      // 033: ifnonnull 04c
      // 036: getfield net/minecraft/world/entity/player/Player.tickCount I
      // 039: goto 040
      // 03c: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03f: athrow
      // 040: bipush 20
      // 042: if_icmpge 04b
      // 045: bipush 1
      // 046: ireturn
      // 047: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04a: athrow
      // 04b: aload 1
      // 04c: invokevirtual net/minecraft/world/entity/player/Player.getUUID ()Ljava/util/UUID;
      // 04f: dup
      // 050: sipush -8155
      // 053: sipush -6638
      // 056: pop2
      // 057: ldc_w "getUUID(...)"
      // 05a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05d: astore 3
      // 05e: aload 3
      // 05f: invokevirtual java/util/UUID.version ()I
      // 062: aload 2
      // 063: ifnonnull 079
      // 066: bipush 4
      // 067: if_icmpeq 07a
      // 06a: goto 071
      // 06d: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 070: athrow
      // 071: bipush 1
      // 072: goto 079
      // 075: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 078: athrow
      // 079: ireturn
      // 07a: aload 0
      // 07b: invokevirtual me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.ap ()Lnet/minecraft/client/Minecraft;
      // 07e: invokevirtual net/minecraft/client/Minecraft.getConnection ()Lnet/minecraft/client/multiplayer/ClientPacketListener;
      // 081: dup
      // 082: ifnull 090
      // 085: aload 3
      // 086: invokevirtual net/minecraft/client/multiplayer/ClientPacketListener.getPlayerInfo (Ljava/util/UUID;)Lnet/minecraft/client/multiplayer/PlayerInfo;
      // 089: goto 092
      // 08c: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08f: athrow
      // 090: pop
      // 091: aconst_null
      // 092: ifnonnull 09b
      // 095: bipush 1
      // 096: ireturn
      // 097: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09a: athrow
      // 09b: aload 1
      // 09c: invokevirtual net/minecraft/world/entity/player/Player.getName ()Lnet/minecraft/network/chat/Component;
      // 09f: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0a4: dup
      // 0a5: sipush -8139
      // 0a8: sipush -5525
      // 0ab: pop2
      // 0ac: ldc_w "getString(...)"
      // 0af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b2: astore 4
      // 0b4: aload 4
      // 0b6: invokevirtual java/lang/String.length ()I
      // 0b9: aload 2
      // 0ba: ifnonnull 0f1
      // 0bd: bipush 16
      // 0bf: if_icmpgt 0f0
      // 0c2: goto 0c9
      // 0c5: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c8: athrow
      // 0c9: aload 4
      // 0cb: checkcast java/lang/CharSequence
      // 0ce: invokeinterface java/lang/CharSequence.length ()I 1
      // 0d3: aload 2
      // 0d4: ifnonnull 0e9
      // 0d7: goto 0de
      // 0da: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0dd: athrow
      // 0de: ifne 0ec
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e7: athrow
      // 0e8: bipush 1
      // 0e9: goto 0ed
      // 0ec: bipush 0
      // 0ed: ifeq 0f2
      // 0f0: bipush 1
      // 0f1: ireturn
      // 0f2: aload 4
      // 0f4: checkcast java/lang/CharSequence
      // 0f7: astore 5
      // 0f9: bipush 0
      // 0fa: istore 6
      // 0fc: bipush 0
      // 0fd: istore 7
      // 0ff: iload 7
      // 101: aload 5
      // 103: invokeinterface java/lang/CharSequence.length ()I 1
      // 108: if_icmpge 15a
      // 10b: aload 5
      // 10d: iload 7
      // 10f: invokeinterface java/lang/CharSequence.charAt (I)C 2
      // 114: istore 8
      // 116: iload 8
      // 118: istore 9
      // 11a: bipush 0
      // 11b: istore 10
      // 11d: getstatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/Set;
      // 120: iload 9
      // 122: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 125: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 12a: aload 2
      // 12b: ifnonnull 15b
      // 12e: aload 2
      // 12f: ifnonnull 144
      // 132: goto 139
      // 135: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 138: athrow
      // 139: ifne 147
      // 13c: goto 143
      // 13f: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 142: athrow
      // 143: bipush 1
      // 144: goto 148
      // 147: bipush 0
      // 148: ifeq 153
      // 14b: bipush 1
      // 14c: goto 15b
      // 14f: invokestatic me/octo/client/lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 152: athrow
      // 153: iinc 7 1
      // 156: aload 2
      // 157: ifnull 0ff
      // 15a: bipush 0
      // 15b: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[24];
      int var3 = 0;
      String var2 = "Øæ2öýÍ\u0018º\u009d\u009dà^=\u0016èy\u0006>\u0000î*fV\u000e÷IÊ±èëÀï¡½\u0093\u008b!ý\u0010·zÂÔò%û\rÈÿ1j=\u0000¢X?-\u008aD\u001dÙ¿ßñ\u0087þÙ¯Â03KZc\\¶©\u009e\u0007Ü\u0006\u00adE\u0088FÁi´¼Â;\u0097Òr3þ_BØÞü\u0091È(û\u0005\u0005fÅô\n\u0090á\fSK½ð¸\t¬¡\u0085\u008bÐ3Wc²\tvA>²ÐäØ3<\u0012üT«\fÑ\u009aW\u0094²\u001f|n±\u0097\u0095k¼\u00ad\u0006\f\u009f¨Ù®(\tsä\u0013yÍ^ôÎÆ\u0007\u0018\u0081\u001a\u0085ï©\u0092\f\u00101\t²¼\u0016\u0088Ð<B\nV\fÌ#\u0092ðÏ^æÙñc³r\u0010OØÝ\u0080\u0011¯\u0087\\GÕÀ/\u0003¨eM\u0003Ê\u001dà\u0018\u0081t\u0004\b$\u001aé\u0095a\u000f\u0083\u0018|Ð\u0012,£Þ´¬\fVÞÃ\u0007\tÙ8\u008e«È\u001a\u0010\u0002\u007fiÅ\u0096«uv0\u0004Um\u008bp>µ\f\u0001j\u0014Ó\u0012Z·Ã\u008e°\u0016ë\u0005QjM\u0099+\u0004A2#Ò\u0006k³\u009dì¤/";
      int var4 = "Øæ2öýÍ\u0018º\u009d\u009dà^=\u0016èy\u0006>\u0000î*fV\u000e÷IÊ±èëÀï¡½\u0093\u008b!ý\u0010·zÂÔò%û\rÈÿ1j=\u0000¢X?-\u008aD\u001dÙ¿ßñ\u0087þÙ¯Â03KZc\\¶©\u009e\u0007Ü\u0006\u00adE\u0088FÁi´¼Â;\u0097Òr3þ_BØÞü\u0091È(û\u0005\u0005fÅô\n\u0090á\fSK½ð¸\t¬¡\u0085\u008bÐ3Wc²\tvA>²ÐäØ3<\u0012üT«\fÑ\u009aW\u0094²\u001f|n±\u0097\u0095k¼\u00ad\u0006\f\u009f¨Ù®(\tsä\u0013yÍ^ôÎÆ\u0007\u0018\u0081\u001a\u0085ï©\u0092\f\u00101\t²¼\u0016\u0088Ð<B\nV\fÌ#\u0092ðÏ^æÙñc³r\u0010OØÝ\u0080\u0011¯\u0087\\GÕÀ/\u0003¨eM\u0003Ê\u001dà\u0018\u0081t\u0004\b$\u001aé\u0095a\u000f\u0083\u0018|Ð\u0012,£Þ´¬\fVÞÃ\u0007\tÙ8\u008e«È\u001a\u0010\u0002\u007fiÅ\u0096«uv0\u0004Um\u008bp>µ\f\u0001j\u0014Ó\u0012Z·Ã\u008e°\u0016ë\u0005QjM\u0099+\u0004A2#Ò\u0006k³\u009dì¤/"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 14;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 9;
                     case 1 -> 52;
                     case 2 -> 37;
                     case 3 -> 75;
                     case 4 -> 84;
                     case 5 -> 48;
                     default -> 11;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[24];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     var10000 = -8141;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIIIIIIIIlIIIlIllIlIllIllIIIllIllllIIlllIIIIlIllIlllIllIIlIllIlIllIlIllllIIlIIIIIIll();
                     short var17 = 24279;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = StringsKt.toSet(
                        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890_"
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

                  var2 = "(&\u0081\u0083\u0081\u0083\u0091õ>\nvzyw\u001e5Ewâ{6+\u0019\u001dh\u0082On\u007f|â+Ã'#\u0099\u0004·Þ\u0094&";
                  var4 = "(&\u0081\u0083\u0081\u0083\u0091õ>\nvzyw\u001e5Ewâ{6+\u0019\u001dh\u0082On\u007f|â+Ã'#\u0099\u0004·Þ\u0094&".length();
                  var1 = '$';
                  var8 = -1;
            }

            var10000 = 79;
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
      int var2 = (var0 ^ -8137) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 14;
            case 1 -> 208;
            case 2 -> 250;
            case 3 -> 179;
            case 4 -> 167;
            case 5 -> 189;
            case 6 -> 177;
            case 7 -> 252;
            case 8 -> 1;
            case 9 -> 49;
            case 10 -> 72;
            case 11 -> 62;
            case 12 -> 47;
            case 13 -> 206;
            case 14 -> 27;
            case 15 -> 67;
            case 16 -> 156;
            case 17 -> 184;
            case 18 -> 124;
            case 19 -> 71;
            case 20 -> 2;
            case 21 -> 198;
            case 22 -> 13;
            case 23 -> 57;
            case 24 -> 9;
            case 25 -> 249;
            case 26 -> 114;
            case 27 -> 45;
            case 28 -> 58;
            case 29 -> 157;
            case 30 -> 8;
            case 31 -> 131;
            case 32 -> 81;
            case 33 -> 149;
            case 34 -> 91;
            case 35 -> 203;
            case 36 -> 201;
            case 37 -> 160;
            case 38 -> 239;
            case 39 -> 151;
            case 40 -> 89;
            case 41 -> 83;
            case 42 -> 108;
            case 43 -> 166;
            case 44 -> 69;
            case 45 -> 59;
            case 46 -> 150;
            case 47 -> 170;
            case 48 -> 76;
            case 49 -> 120;
            case 50 -> 224;
            case 51 -> 29;
            case 52 -> 12;
            case 53 -> 104;
            case 54 -> 85;
            case 55 -> 80;
            case 56 -> 90;
            case 57 -> 82;
            case 58 -> 26;
            case 59 -> 65;
            case 60 -> 116;
            case 61 -> 105;
            case 62 -> 24;
            case 63 -> 210;
            case 64 -> 255;
            case 65 -> 51;
            case 66 -> 195;
            case 67 -> 199;
            case 68 -> 142;
            case 69 -> 202;
            case 70 -> 253;
            case 71 -> 237;
            case 72 -> 10;
            case 73 -> 159;
            case 74 -> 148;
            case 75 -> 164;
            case 76 -> 20;
            case 77 -> 5;
            case 78 -> 209;
            case 79 -> 53;
            case 80 -> 191;
            case 81 -> 130;
            case 82 -> 222;
            case 83 -> 188;
            case 84 -> 158;
            case 85 -> 46;
            case 86 -> 235;
            case 87 -> 41;
            case 88 -> 21;
            case 89 -> 64;
            case 90 -> 139;
            case 91 -> 228;
            case 92 -> 153;
            case 93 -> 28;
            case 94 -> 78;
            case 95 -> 194;
            case 96 -> 44;
            case 97 -> 48;
            case 98 -> 146;
            case 99 -> 134;
            case 100 -> 125;
            case 101 -> 79;
            case 102 -> 234;
            case 103 -> 141;
            case 104 -> 225;
            case 105 -> 94;
            case 106 -> 182;
            case 107 -> 155;
            case 108 -> 192;
            case 109 -> 4;
            case 110 -> 230;
            case 111 -> 204;
            case 112 -> 107;
            case 113 -> 187;
            case 114 -> 180;
            case 115 -> 126;
            case 116 -> 174;
            case 117 -> 144;
            case 118 -> 31;
            case 119 -> 36;
            case 120 -> 152;
            case 121 -> 74;
            case 122 -> 101;
            case 123 -> 197;
            case 124 -> 77;
            case 125 -> 214;
            case 126 -> 216;
            case 127 -> 54;
            case 128 -> 109;
            case 129 -> 88;
            case 130 -> 118;
            case 131 -> 0;
            case 132 -> 117;
            case 133 -> 132;
            case 134 -> 247;
            case 135 -> 42;
            case 136 -> 226;
            case 137 -> 231;
            case 138 -> 200;
            case 139 -> 227;
            case 140 -> 136;
            case 141 -> 84;
            case 142 -> 169;
            case 143 -> 3;
            case 144 -> 190;
            case 145 -> 93;
            case 146 -> 34;
            case 147 -> 178;
            case 148 -> 19;
            case 149 -> 25;
            case 150 -> 75;
            case 151 -> 60;
            case 152 -> 56;
            case 153 -> 112;
            case 154 -> 70;
            case 155 -> 127;
            case 156 -> 99;
            case 157 -> 32;
            case 158 -> 11;
            case 159 -> 30;
            case 160 -> 115;
            case 161 -> 95;
            case 162 -> 196;
            case 163 -> 137;
            case 164 -> 113;
            case 165 -> 217;
            case 166 -> 244;
            case 167 -> 229;
            case 168 -> 161;
            case 169 -> 172;
            case 170 -> 223;
            case 171 -> 133;
            case 172 -> 96;
            case 173 -> 162;
            case 174 -> 232;
            case 175 -> 110;
            case 176 -> 98;
            case 177 -> 111;
            case 178 -> 254;
            case 179 -> 38;
            case 180 -> 171;
            case 181 -> 61;
            case 182 -> 52;
            case 183 -> 17;
            case 184 -> 18;
            case 185 -> 135;
            case 186 -> 15;
            case 187 -> 218;
            case 188 -> 22;
            case 189 -> 63;
            case 190 -> 245;
            case 191 -> 92;
            case 192 -> 181;
            case 193 -> 123;
            case 194 -> 7;
            case 195 -> 241;
            case 196 -> 183;
            case 197 -> 147;
            case 198 -> 154;
            case 199 -> 251;
            case 200 -> 129;
            case 201 -> 219;
            case 202 -> 145;
            case 203 -> 243;
            case 204 -> 168;
            case 205 -> 122;
            case 206 -> 138;
            case 207 -> 240;
            case 208 -> 55;
            case 209 -> 205;
            case 210 -> 106;
            case 211 -> 165;
            case 212 -> 220;
            case 213 -> 236;
            case 214 -> 100;
            case 215 -> 73;
            case 216 -> 103;
            case 217 -> 37;
            case 218 -> 119;
            case 219 -> 68;
            case 220 -> 207;
            case 221 -> 242;
            case 222 -> 86;
            case 223 -> 176;
            case 224 -> 186;
            case 225 -> 233;
            case 226 -> 50;
            case 227 -> 193;
            case 228 -> 23;
            case 229 -> 185;
            case 230 -> 140;
            case 231 -> 211;
            case 232 -> 102;
            case 233 -> 39;
            case 234 -> 128;
            case 235 -> 16;
            case 236 -> 238;
            case 237 -> 213;
            case 238 -> 173;
            case 239 -> 33;
            case 240 -> 212;
            case 241 -> 6;
            case 242 -> 35;
            case 243 -> 221;
            case 244 -> 43;
            case 245 -> 175;
            case 246 -> 215;
            case 247 -> 87;
            case 248 -> 246;
            case 249 -> 248;
            case 250 -> 97;
            case 251 -> 40;
            case 252 -> 121;
            case 253 -> 143;
            case 254 -> 66;
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
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
}
}
