package me.octo.client.utils.player;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl;
import me.octo.client.lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
import me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field v2
   
   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

   @NotNull
   public static llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static double llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static me.octo.client.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static double IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @Nullable
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @Nullable
   private static BlockPos lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @Nullable
   private static BlockPos llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static float lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] c;
   private static String[] d;

   private llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll() {
   }

   public final boolean g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(boolean var1) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   @NotNull
   public final lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI h() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(@NotNull lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var1) {
      short var10001 = -14604;
      short var10002 = 8558;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @Nullable
   public final BlockPos i() {
      return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   public final void a(@Nullable BlockPos var1) {
      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var1;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI j() {
      return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/player/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: aload 1
      // 004: sipush -14607
      // 007: sipush -21697
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Z
      // 014: ifne 01c
      // 017: return
      // 018: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01b: athrow
      // 01c: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 01f: dup
      // 020: ifnull 2ed
      // 023: astore 5
      // 025: bipush 0
      // 026: istore 6
      // 028: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 02b: invokevirtual me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Lnet/minecraft/client/Minecraft;
      // 02e: getfield net/minecraft/client/Minecraft.hitResult Lnet/minecraft/world/phys/HitResult;
      // 031: astore 7
      // 033: aload 7
      // 035: aload 2
      // 036: ifnonnull 04f
      // 039: instanceof net/minecraft/world/phys/BlockHitResult
      // 03c: ifeq 055
      // 03f: goto 046
      // 042: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 045: athrow
      // 046: aload 7
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04e: athrow
      // 04f: checkcast net/minecraft/world/phys/BlockHitResult
      // 052: goto 056
      // 055: aconst_null
      // 056: dup
      // 057: ifnull 064
      // 05a: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 05d: goto 066
      // 060: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 063: athrow
      // 064: pop
      // 065: aconst_null
      // 066: astore 8
      // 068: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI I
      // 06b: aload 2
      // 06c: ifnonnull 203
      // 06f: ifle 200
      // 072: goto 079
      // 075: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 078: athrow
      // 079: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lnet/minecraft/core/BlockPos;
      // 07c: aload 2
      // 07d: ifnonnull 093
      // 080: goto 087
      // 083: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 086: athrow
      // 087: ifnull 200
      // 08a: goto 091
      // 08d: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 090: athrow
      // 091: aload 8
      // 093: aload 2
      // 094: ifnonnull 0af
      // 097: ifnull 200
      // 09a: goto 0a1
      // 09d: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a0: athrow
      // 0a1: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 0a4: pop
      // 0a5: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 0a8: goto 0af
      // 0ab: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ae: athrow
      // 0af: aload 2
      // 0b0: ifnonnull 0ca
      // 0b3: ifnull 200
      // 0b6: goto 0bd
      // 0b9: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bc: athrow
      // 0bd: aload 8
      // 0bf: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 0c2: pop
      // 0c3: goto 0ca
      // 0c6: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c9: athrow
      // 0ca: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 0cd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0d0: aload 2
      // 0d1: ifnonnull 203
      // 0d4: ifeq 200
      // 0d7: goto 0de
      // 0da: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0dd: athrow
      // 0de: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lnet/minecraft/core/BlockPos;
      // 0e1: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 0e4: pop
      // 0e5: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 0e8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0eb: aload 2
      // 0ec: ifnonnull 203
      // 0ef: goto 0f6
      // 0f2: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f5: athrow
      // 0f6: ifeq 200
      // 0f9: goto 100
      // 0fc: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ff: athrow
      // 100: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 103: sipush -14608
      // 106: sipush 14596
      // 109: pop2
      // 10a: ldc "attack"
      // 10c: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 10f: aload 2
      // 110: ifnonnull 203
      // 113: goto 11a
      // 116: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 119: athrow
      // 11a: ifeq 200
      // 11d: goto 124
      // 120: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 123: athrow
      // 124: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 127: invokevirtual me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Lnet/minecraft/client/Minecraft;
      // 12a: getfield net/minecraft/client/Minecraft.gameMode Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;
      // 12d: astore 7
      // 12f: aload 7
      // 131: aload 2
      // 132: ifnonnull 14b
      // 135: instanceof me/octo/client/mixin/accessors/MultiPlayerGameModeProgressAccessor
      // 138: ifeq 151
      // 13b: goto 142
      // 13e: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 141: athrow
      // 142: aload 7
      // 144: goto 14b
      // 147: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14a: athrow
      // 14b: checkcast me/octo/client/mixin/accessors/MultiPlayerGameModeProgressAccessor
      // 14e: goto 152
      // 151: aconst_null
      // 152: dup
      // 153: ifnull 162
      // 156: invokeinterface me/octo/client/mixin/accessors/MultiPlayerGameModeProgressAccessor.getDestroyProgress ()F 1
      // 15b: goto 164
      // 15e: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 161: athrow
      // 162: pop
      // 163: fconst_0
      // 164: fconst_0
      // 165: fcmpg
      // 166: aload 2
      // 167: ifnonnull 175
      // 16a: ifne 178
      // 16d: goto 174
      // 170: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 173: athrow
      // 174: bipush 1
      // 175: goto 179
      // 178: bipush 0
      // 179: ifne 1a1
      // 17c: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 17f: invokevirtual me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Lnet/minecraft/client/Minecraft;
      // 182: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 185: dup
      // 186: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 189: getfield net/minecraft/client/player/LocalPlayer.swinging Z
      // 18c: aload 2
      // 18d: ifnonnull 203
      // 190: goto 197
      // 193: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 196: athrow
      // 197: ifne 200
      // 19a: goto 1a1
      // 19d: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a0: athrow
      // 1a1: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI I
      // 1a4: bipush -1
      // 1a5: iadd
      // 1a6: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI I
      // 1a9: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI I
      // 1ac: aload 2
      // 1ad: ifnonnull 1cf
      // 1b0: goto 1b7
      // 1b3: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b6: athrow
      // 1b7: bipush 1
      // 1b8: if_icmpne 1d4
      // 1bb: goto 1c2
      // 1be: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c1: athrow
      // 1c2: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 1c5: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.i ()Z
      // 1c8: goto 1cf
      // 1cb: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ce: athrow
      // 1cf: pop
      // 1d0: aload 2
      // 1d1: ifnull 200
      // 1d4: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 1d7: invokevirtual me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Lnet/minecraft/client/Minecraft;
      // 1da: getfield net/minecraft/client/Minecraft.options Lnet/minecraft/client/Options;
      // 1dd: getfield net/minecraft/client/Options.keyAttack Lnet/minecraft/client/KeyMapping;
      // 1e0: dup
      // 1e1: sipush -14601
      // 1e4: sipush -3592
      // 1e7: pop2
      // 1e8: ldc "null cannot be cast to non-null type me.octo.client.mixin.accessors.KeyMappingAccessor"
      // 1ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 1ed: checkcast me/octo/client/mixin/accessors/KeyMappingAccessor
      // 1f0: invokeinterface me/octo/client/mixin/accessors/KeyMappingAccessor.getKey ()Lcom/mojang/blaze3d/platform/InputConstants$Key; 1
      // 1f5: bipush 1
      // 1f6: invokestatic net/minecraft/client/KeyMapping.set (Lcom/mojang/blaze3d/platform/InputConstants$Key;Z)V
      // 1f9: goto 200
      // 1fc: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ff: athrow
      // 200: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Z
      // 203: aload 2
      // 204: ifnonnull 25b
      // 207: ifeq 234
      // 20a: goto 211
      // 20d: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 210: athrow
      // 211: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 214: aload 2
      // 215: ifnonnull 290
      // 218: goto 21f
      // 21b: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 21e: athrow
      // 21f: bipush 50
      // 221: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 224: checkcast java/lang/Number
      // 227: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 22a: ifne 282
      // 22d: goto 234
      // 230: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 233: athrow
      // 234: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 237: aload 2
      // 238: ifnonnull 2a8
      // 23b: goto 242
      // 23e: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 241: athrow
      // 242: invokevirtual me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Lnet/minecraft/client/Minecraft;
      // 245: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 248: dup
      // 249: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 24c: aload 5
      // 24e: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 251: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 254: goto 25b
      // 257: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 25a: athrow
      // 25b: ifne 282
      // 25e: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 261: aload 2
      // 262: ifnonnull 290
      // 265: goto 26c
      // 268: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 26b: athrow
      // 26c: sipush 500
      // 26f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 272: checkcast java/lang/Number
      // 275: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 278: ifeq 2af
      // 27b: goto 282
      // 27e: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 281: athrow
      // 282: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 285: pop
      // 286: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 289: goto 290
      // 28c: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28f: athrow
      // 290: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 293: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 296: pop
      // 297: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 29a: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lnet/minecraft/core/BlockPos;
      // 29d: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 2a0: pop
      // 2a1: aconst_null
      // 2a2: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 2a5: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 2a8: invokespecial me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.l ()V
      // 2ab: aload 2
      // 2ac: ifnull 2e9
      // 2af: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 2b2: aload 5
      // 2b4: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 2b7: astore 9
      // 2b9: aload 2
      // 2ba: ifnonnull 2e3
      // 2bd: aload 9
      // 2bf: ifnull 2db
      // 2c2: goto 2c9
      // 2c5: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c8: athrow
      // 2c9: getstatic me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;
      // 2cc: aload 9
      // 2ce: bipush 0
      // 2cf: ldc 1.6
      // 2d1: bipush 2
      // 2d2: aconst_null
      // 2d3: invokestatic me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a (Lme/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;Lnet/minecraft/world/phys/Vec3;ZFILjava/lang/Object;)V
      // 2d6: return
      // 2d7: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2da: athrow
      // 2db: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 2de: pop
      // 2df: aconst_null
      // 2e0: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 2e3: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
      // 2e6: invokespecial me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.l ()V
      // 2e9: nop
      // 2ea: goto 2ef
      // 2ed: pop
      // 2ee: nop
      // 2ef: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 2f2: astore 3
      // 2f3: aload 3
      // 2f4: aload 2
      // 2f5: ifnonnull 303
      // 2f8: ifnull 316
      // 2fb: goto 302
      // 2fe: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 301: athrow
      // 302: aload 3
      // 303: astore 5
      // 305: bipush 0
      // 306: istore 6
      // 308: getstatic me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;
      // 30b: aload 5
      // 30d: ldc 1.6
      // 30f: bipush 0
      // 310: bipush 4
      // 311: aconst_null
      // 312: invokestatic me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a (Lme/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;FZILjava/lang/Object;)V
      // 315: return
      // 316: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Z
      // 319: aload 2
      // 31a: ifnonnull 3b1
      // 31d: ifne 388
      // 320: goto 327
      // 323: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 326: athrow
      // 327: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 32a: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 32d: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.b (Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 330: astore 3
      // 331: aload 2
      // 332: ifnonnull 387
      // 335: aload 3
      // 336: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 339: invokestatic java/lang/Math.abs (F)F
      // 33c: aload 3
      // 33d: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 340: invokestatic java/lang/Math.abs (F)F
      // 343: fadd
      // 344: f2d
      // 345: dconst_1
      // 346: dcmpg
      // 347: ifge 372
      // 34a: goto 351
      // 34d: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 350: athrow
      // 351: getstatic me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;
      // 354: invokevirtual me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.h ()V
      // 357: bipush 1
      // 358: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Z
      // 35b: invokestatic java/lang/System.currentTimeMillis ()J
      // 35e: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl J
      // 361: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII D
      // 364: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI D
      // 367: aload 2
      // 368: ifnull 388
      // 36b: goto 372
      // 36e: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 371: athrow
      // 372: getstatic me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;
      // 375: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 378: ldc 1.6
      // 37a: bipush 0
      // 37b: bipush 4
      // 37c: aconst_null
      // 37d: invokestatic me/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a (Lme/octo/client/utils/player/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;FZILjava/lang/Object;)V
      // 380: goto 387
      // 383: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 386: athrow
      // 387: return
      // 388: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 38b: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 38e: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.b (Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 391: astore 3
      // 392: aload 3
      // 393: aload 2
      // 394: ifnonnull 3c4
      // 397: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 39a: invokestatic java/lang/Math.abs (F)F
      // 39d: aload 3
      // 39e: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 3a1: invokestatic java/lang/Math.abs (F)F
      // 3a4: fadd
      // 3a5: f2d
      // 3a6: ldc2_w 5.0
      // 3a9: dcmpl
      // 3aa: goto 3b1
      // 3ad: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b0: athrow
      // 3b1: ifle 3bd
      // 3b4: aload 0
      // 3b5: invokespecial me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.l ()V
      // 3b8: return
      // 3b9: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3bc: athrow
      // 3bd: aload 0
      // 3be: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl;
      // 3c1: invokespecial me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lme/octo/client/IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 3c4: astore 4
      // 3c6: new me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI
      // 3c9: dup
      // 3ca: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 3cd: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.a ()F
      // 3d0: aload 4
      // 3d2: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 3d5: fadd
      // 3d6: aload 4
      // 3d8: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 3db: invokespecial me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.<init> (FF)V
      // 3de: astore 5
      // 3e0: aload 0
      // 3e1: invokevirtual me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Lnet/minecraft/client/Minecraft;
      // 3e4: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 3e7: dup
      // 3e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 3eb: astore 6
      // 3ed: aload 6
      // 3ef: aload 6
      // 3f1: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 3f4: aload 5
      // 3f6: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 3f9: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 3fc: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 3ff: fsub
      // 400: fadd
      // 401: invokevirtual net/minecraft/client/player/LocalPlayer.setYRot (F)V
      // 404: aload 0
      // 405: invokevirtual me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a ()Lnet/minecraft/client/Minecraft;
      // 408: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 40b: dup
      // 40c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 40f: astore 6
      // 411: aload 6
      // 413: aload 6
      // 415: invokevirtual net/minecraft/client/player/LocalPlayer.getXRot ()F
      // 418: aload 5
      // 41a: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 41d: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 420: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 423: fsub
      // 424: fadd
      // 425: invokevirtual net/minecraft/client/player/LocalPlayer.setXRot (F)V
      // 428: aload 5
      // 42a: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 42d: ldc2_w 6.283185307179586
      // 430: dstore 6
      // 432: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI D
      // 435: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 438: ifeq 443
      // 43b: dconst_1
      // 43c: goto 446
      // 43f: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 442: athrow
      // 443: ldc2_w -1.0
      // 446: invokestatic java/lang/System.currentTimeMillis ()J
      // 449: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl J
      // 44c: lsub
      // 44d: l2d
      // 44e: sipush 450
      // 451: i2d
      // 452: ddiv
      // 453: dload 6
      // 455: dmul
      // 456: dmul
      // 457: dadd
      // 458: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII D
      // 45b: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII D
      // 45e: dload 6
      // 460: drem
      // 461: dstore 8
      // 463: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 466: aload 2
      // 467: ifnonnull 492
      // 46a: ifeq 48f
      // 46d: goto 474
      // 470: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 473: athrow
      // 474: dload 8
      // 476: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl D
      // 479: dcmpg
      // 47a: aload 2
      // 47b: ifnonnull 492
      // 47e: goto 485
      // 481: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 484: athrow
      // 485: iflt 4bb
      // 488: goto 48f
      // 48b: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48e: athrow
      // 48f: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 492: aload 2
      // 493: ifnonnull 4b8
      // 496: ifne 4cb
      // 499: goto 4a0
      // 49c: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 49f: athrow
      // 4a0: dload 8
      // 4a2: aload 2
      // 4a3: ifnonnull 4cd
      // 4a6: goto 4ad
      // 4a9: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4ac: athrow
      // 4ad: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl D
      // 4b0: dcmpl
      // 4b1: goto 4b8
      // 4b4: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4b7: athrow
      // 4b8: ifle 4cb
      // 4bb: getstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl;
      // 4be: invokevirtual me/octo/client/IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl.e ()Lme/octo/client/IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl;
      // 4c1: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl;
      // 4c4: goto 4cb
      // 4c7: invokestatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4ca: athrow
      // 4cb: dload 8
      // 4cd: putstatic me/octo/client/utils/player/llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl D
      // 4d0: return
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI param1) {
      me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");

      if (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
         return;
      }

      net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

      if (var3 instanceof net.minecraft.network.protocol.game.ServerboundPlayerActionPacket) {
         net.minecraft.core.BlockPos var4 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;

         if (var4 != null
               && kotlin.jvm.internal.Intrinsics.areEqual(
                     ((net.minecraft.network.protocol.game.ServerboundPlayerActionPacket) var3).getPos(), var4)) {
            lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = true;
            IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.f();
         }
      }
   }

   public final void b(@NotNull BlockPos param1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var2 != null) {
         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = param1;
         this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.f();
         return;
      }
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "pos");
      if (!this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.a((Number)500)) {
         return;
      }
      if (this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == null) {
         this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = 2;
         this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = false;
         this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.f();
      }
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = param1;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.f();
   }

   public final void a(
      float var1, float var2, @NotNull me.octo.client.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var3
   ) {
      Object var7 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = -14605;
      short var10003 = -13293;
      Intrinsics.checkNotNullParameter(var3, "circleSize");
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var3;
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(var1);
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var2;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;

      label37: {
         try {
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            );
            IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = null;
            llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = null;
            lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = false;
            IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.a(var2, var3);
            IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e();
            this.l();
            double var8;
            var7 = (var8 = Random.Default.nextDouble() - 0.5) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
            if (var4 != null) {
               break label37;
            }

            if (((Boolean)var7)) {
               return;
            }
         } catch (NoWhenBranchMatchedException var6) {
            throw (RuntimeException)a(var6);
         }

         var7 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      label29: {
         label28: {
            try {
               if (var4 != null) {
                  break label29;
               }

               if (((Boolean)(var7))) {
                  break label28;
               }
            } catch (NoWhenBranchMatchedException var5) {
               throw (RuntimeException)a(var5);
            }

            var7 = 0;
            break label29;
         }

         var7 = 1;
      }

      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = (boolean)var7;
   }

   public final void k() {
      lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
   }

   private final IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl a(
      float var1, me.octo.client.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var2
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      try {
         switch (llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var2.ordinal()]) {
            case 1:
               return new IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl(10.0, 3.0, 0.0, var1);
            case 2:
               return new IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl(20.0, 6.0, 0.0, var1);
            case 3:
               return new IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl(20.0, 13.0, 0.0, var1);
            default:
               throw new NoWhenBranchMatchedException();
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   private final void l() {
      IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl var10001 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      LocalPlayer var10004 = this.a().player;
      Intrinsics.checkNotNull(var10004);
      Float var2 = var10004.getYRot();
      LocalPlayer var10005 = this.a().player;
      Intrinsics.checkNotNull(var10005);
      Pair var1 = this.b(var10001, new Pair(var2, var10005.getXRot()));
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.a(
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, var1
      );
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
         (float)(lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a() + ((Number)var1.getFirst()).doubleValue()),
         (float)((Number)var1.getSecond()).doubleValue()
      );
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
   }

   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl var1
   ) {
      double var2 = var1.c() + var1.a() * Math.cos(IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
      double var4 = var1.d() + var1.b() * Math.sin(IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI((float)var2, (float)var4);
   }

   private final double a(IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl var1, Pair<Double, Double> var2) {
      double var3 = (((Number)var2.getFirst()).doubleValue() - var1.c()) / var1.a();
      double var5 = (((Number)var2.getSecond()).doubleValue() - var1.d()) / var1.b();
      return Math.atan2(var5, var3);
   }

   private final Pair<Double, Double> b(IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl var1, Pair<Float, Float> var2) {
      double var3 = Math.atan2(((Number)var2.getFirst()).doubleValue() - var1.c(), ((Number)var2.getSecond()).doubleValue() - var1.d());
      double var5 = var1.c() + var1.a() * Math.cos(var3);
      double var7 = var1.d() + var1.b() * Math.sin(var3);
      return new Pair(var5, var7);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "b\u0099\u0082\u0011_\u0006RÌ\u0011ö\t\u009f\n\u0080m\u000f~\u0003Â+ºú\u0014\u0005Ä\u0017VÀÅ\u0003iúB";
      int var4 = "b\u0099\u0082\u0011_\u0006RÌ\u0011ö\t\u009f\n\u0080m\u000f~\u0003Â+ºú\u0014\u0005Ä\u0017VÀÅ\u0003iúB".length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 77;
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
                     case 0 -> 47;
                     case 1 -> 115;
                     case 2 -> 99;
                     case 3 -> 126;
                     case 4 -> 58;
                     case 5 -> 76;
                     default -> 90;
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
                     d = new String[7];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(
                        0.0F
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = me.octo.client.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new IIIIllllIIIllllIlIlIlllIlIIllIlIIlIIlllIlIIlIlllIlIllIIIIllIIlIIlIIIIIIIIIllIIllIllIl(
                        0.0, 0.0, 0.0, 0.0
                     );
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e();
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                        0.0F, 0.0F
                     );
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                        0.0F, 0.0F
                     );
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
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

                  var2 = "®p©S£\bûVÊ\u00824Ó5_Ú\bdoo=ÒßÖM=áì¦*\u001d\u0083í\u000f\u0002é´BE]]LQ:\u009b\u0005uÕ2»÷\u0003\u0082\u0016\u00857q[\u0086Êÿú\u000f@õ\u0093È\u0012¥\u001ey\u0086\u0017¾/\u0012\u0085³\u0007¯x`¯CEA\tÖkäuG-\u0018Ö";
                  var4 = "®p©S£\bûVÊ\u00824Ó5_Ú\bdoo=ÒßÖM=áì¦*\u001d\u0083í\u000f\u0002é´BE]]LQ:\u009b\u0005uÕ2»÷\u0003\u0082\u0016\u00857q[\u0086Êÿú\u000f@õ\u0093È\u0012¥\u001ey\u0086\u0017¾/\u0012\u0085³\u0007¯x`¯CEA\tÖkäuG-\u0018Ö"
                     .length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 32;
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
      int var2 = (var0 ^ -14607) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 218;
            case 1 -> 33;
            case 2 -> 117;
            case 3 -> 239;
            case 4 -> 177;
            case 5 -> 15;
            case 6 -> 75;
            case 7 -> 178;
            case 8 -> 65;
            case 9 -> 254;
            case 10 -> 102;
            case 11 -> 114;
            case 12 -> 202;
            case 13 -> 152;
            case 14 -> 72;
            case 15 -> 44;
            case 16 -> 147;
            case 17 -> 166;
            case 18 -> 163;
            case 19 -> 173;
            case 20 -> 249;
            case 21 -> 200;
            case 22 -> 25;
            case 23 -> 251;
            case 24 -> 127;
            case 25 -> 100;
            case 26 -> 226;
            case 27 -> 132;
            case 28 -> 66;
            case 29 -> 113;
            case 30 -> 6;
            case 31 -> 118;
            case 32 -> 39;
            case 33 -> 12;
            case 34 -> 108;
            case 35 -> 197;
            case 36 -> 70;
            case 37 -> 43;
            case 38 -> 144;
            case 39 -> 236;
            case 40 -> 175;
            case 41 -> 165;
            case 42 -> 131;
            case 43 -> 188;
            case 44 -> 112;
            case 45 -> 32;
            case 46 -> 216;
            case 47 -> 172;
            case 48 -> 179;
            case 49 -> 119;
            case 50 -> 156;
            case 51 -> 140;
            case 52 -> 16;
            case 53 -> 93;
            case 54 -> 157;
            case 55 -> 187;
            case 56 -> 8;
            case 57 -> 71;
            case 58 -> 40;
            case 59 -> 235;
            case 60 -> 161;
            case 61 -> 151;
            case 62 -> 193;
            case 63 -> 98;
            case 64 -> 34;
            case 65 -> 248;
            case 66 -> 134;
            case 67 -> 88;
            case 68 -> 128;
            case 69 -> 29;
            case 70 -> 52;
            case 71 -> 185;
            case 72 -> 201;
            case 73 -> 103;
            case 74 -> 129;
            case 75 -> 28;
            case 76 -> 67;
            case 77 -> 107;
            case 78 -> 208;
            case 79 -> 246;
            case 80 -> 135;
            case 81 -> 153;
            case 82 -> 241;
            case 83 -> 90;
            case 84 -> 54;
            case 85 -> 150;
            case 86 -> 180;
            case 87 -> 104;
            case 88 -> 174;
            case 89 -> 38;
            case 90 -> 154;
            case 91 -> 148;
            case 92 -> 210;
            case 93 -> 189;
            case 94 -> 84;
            case 95 -> 94;
            case 96 -> 81;
            case 97 -> 86;
            case 98 -> 223;
            case 99 -> 229;
            case 100 -> 168;
            case 101 -> 26;
            case 102 -> 19;
            case 103 -> 245;
            case 104 -> 228;
            case 105 -> 99;
            case 106 -> 87;
            case 107 -> 106;
            case 108 -> 253;
            case 109 -> 76;
            case 110 -> 211;
            case 111 -> 46;
            case 112 -> 109;
            case 113 -> 64;
            case 114 -> 49;
            case 115 -> 89;
            case 116 -> 2;
            case 117 -> 41;
            case 118 -> 130;
            case 119 -> 83;
            case 120 -> 116;
            case 121 -> 126;
            case 122 -> 207;
            case 123 -> 184;
            case 124 -> 155;
            case 125 -> 63;
            case 126 -> 145;
            case 127 -> 4;
            case 128 -> 92;
            case 129 -> 186;
            case 130 -> 225;
            case 131 -> 53;
            case 132 -> 11;
            case 133 -> 57;
            case 134 -> 138;
            case 135 -> 192;
            case 136 -> 69;
            case 137 -> 1;
            case 138 -> 213;
            case 139 -> 80;
            case 140 -> 206;
            case 141 -> 27;
            case 142 -> 240;
            case 143 -> 167;
            case 144 -> 142;
            case 145 -> 5;
            case 146 -> 199;
            case 147 -> 73;
            case 148 -> 133;
            case 149 -> 51;
            case 150 -> 0;
            case 151 -> 244;
            case 152 -> 62;
            case 153 -> 45;
            case 154 -> 22;
            case 155 -> 24;
            case 156 -> 125;
            case 157 -> 219;
            case 158 -> 85;
            case 159 -> 68;
            case 160 -> 203;
            case 161 -> 209;
            case 162 -> 212;
            case 163 -> 139;
            case 164 -> 220;
            case 165 -> 91;
            case 166 -> 164;
            case 167 -> 37;
            case 168 -> 23;
            case 169 -> 196;
            case 170 -> 56;
            case 171 -> 214;
            case 172 -> 30;
            case 173 -> 183;
            case 174 -> 159;
            case 175 -> 97;
            case 176 -> 79;
            case 177 -> 250;
            case 178 -> 224;
            case 179 -> 217;
            case 180 -> 105;
            case 181 -> 149;
            case 182 -> 31;
            case 183 -> 137;
            case 184 -> 233;
            case 185 -> 195;
            case 186 -> 234;
            case 187 -> 61;
            case 188 -> 215;
            case 189 -> 59;
            case 190 -> 242;
            case 191 -> 20;
            case 192 -> 122;
            case 193 -> 58;
            case 194 -> 182;
            case 195 -> 162;
            case 196 -> 7;
            case 197 -> 77;
            case 198 -> 237;
            case 199 -> 48;
            case 200 -> 14;
            case 201 -> 136;
            case 202 -> 160;
            case 203 -> 13;
            case 204 -> 227;
            case 205 -> 143;
            case 206 -> 190;
            case 207 -> 121;
            case 208 -> 96;
            case 209 -> 158;
            case 210 -> 171;
            case 211 -> 141;
            case 212 -> 198;
            case 213 -> 18;
            case 214 -> 231;
            case 215 -> 17;
            case 216 -> 230;
            case 217 -> 181;
            case 218 -> 238;
            case 219 -> 169;
            case 220 -> 221;
            case 221 -> 243;
            case 222 -> 9;
            case 223 -> 115;
            case 224 -> 111;
            case 225 -> 82;
            case 226 -> 146;
            case 227 -> 36;
            case 228 -> 255;
            case 229 -> 120;
            case 230 -> 110;
            case 231 -> 176;
            case 232 -> 50;
            case 233 -> 123;
            case 234 -> 78;
            case 235 -> 60;
            case 236 -> 222;
            case 237 -> 3;
            case 238 -> 101;
            case 239 -> 21;
            case 240 -> 10;
            case 241 -> 247;
            case 242 -> 124;
            case 243 -> 205;
            case 244 -> 232;
            case 245 -> 191;
            case 246 -> 252;
            case 247 -> 35;
            case 248 -> 74;
            case 249 -> 42;
            case 250 -> 204;
            case 251 -> 47;
            case 252 -> 194;
            case 253 -> 170;
            case 254 -> 95;
            default -> 55;
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
