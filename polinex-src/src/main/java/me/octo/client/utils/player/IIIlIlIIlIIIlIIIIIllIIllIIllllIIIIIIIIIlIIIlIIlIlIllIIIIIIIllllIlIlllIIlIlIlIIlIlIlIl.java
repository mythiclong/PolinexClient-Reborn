package me.octo.client.utils.player;

import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl
   extends IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI {
   @NotNull
   private IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final float[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final float[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private float llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private float IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private float lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private float llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private long lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private long IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private float IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private float IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private float llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private final float[] lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @NotNull
   private final float[] IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private int IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static String b;

   public IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1
   ) {
      Intrinsics.checkNotNullParameter(var1, b);
      super(var1);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new float[4];
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new float[4];
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 1.0F;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 5000.0F;
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new float[4];
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new float[4];
   }

   private final Random g() {
      return this.a().g();
   }

   @Override
   public void a(float param1, float param2, float param3, float param4) {
      int var5 = me.octo.client.utils.player.IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();

      if (this.a().h() && !this.a().i()) {
         float var6 = Math.abs(me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(param1 - this.a().l()));
         float var7 = Math.abs(param2 - this.a().m());

         if (var6 + var7 < 1.5F) {
            float var8 = param1 - this.a().l();
            float var9 = param2 - this.a().m();
            this.a().c(param1);
            this.a().d(param2);
            float[] var10 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10[3] = var10[3] + var8;
            float[] var11 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            var11[3] = var11[3] + var9;
            return;
         }
      }

      this.a().a(param3, param4, param1, param2, (me.octo.client.utils.player.IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI)this);
   }

   @Override
   public void c() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 004: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.n ()F
      // 007: fstore 2
      // 008: aload 0
      // 009: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 00c: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.G ()F
      // 00f: aload 0
      // 010: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 013: fload 2
      // 014: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k (F)F
      // 017: fmul
      // 018: ldc 0.1
      // 01a: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 01d: fstore 3
      // 01e: invokestatic me/octo/client/utils/player/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e ()I
      // 021: nop
      // 022: istore 1
      // 023: fload 2
      // 024: ldc 5.0
      // 026: fcmpg
      // 027: iload 1
      // 028: ifeq 042
      // 02b: ifge 03e
      // 02e: goto 035
      // 031: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 034: athrow
      // 035: ldc 145.0
      // 037: goto 0f9
      // 03a: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03d: athrow
      // 03e: fload 2
      // 03f: ldc 10.0
      // 041: fcmpg
      // 042: iload 1
      // 043: ifeq 05d
      // 046: ifge 059
      // 049: goto 050
      // 04c: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04f: athrow
      // 050: ldc 160.0
      // 052: goto 0f9
      // 055: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 058: athrow
      // 059: fload 2
      // 05a: ldc 20.0
      // 05c: fcmpg
      // 05d: iload 1
      // 05e: ifeq 078
      // 061: ifge 074
      // 064: goto 06b
      // 067: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06a: athrow
      // 06b: ldc 190.0
      // 06d: goto 0f9
      // 070: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 073: athrow
      // 074: fload 2
      // 075: ldc 30.0
      // 077: fcmpg
      // 078: iload 1
      // 079: ifeq 093
      // 07c: ifge 08f
      // 07f: goto 086
      // 082: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 085: athrow
      // 086: ldc 220.0
      // 088: goto 0f9
      // 08b: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08e: athrow
      // 08f: fload 2
      // 090: ldc 45.0
      // 092: fcmpg
      // 093: iload 1
      // 094: ifeq 0ae
      // 097: ifge 0aa
      // 09a: goto 0a1
      // 09d: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a0: athrow
      // 0a1: ldc 255.0
      // 0a3: goto 0f9
      // 0a6: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a9: athrow
      // 0aa: fload 2
      // 0ab: ldc 60.0
      // 0ad: fcmpg
      // 0ae: iload 1
      // 0af: ifeq 0c9
      // 0b2: ifge 0c5
      // 0b5: goto 0bc
      // 0b8: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bb: athrow
      // 0bc: ldc 285.0
      // 0be: goto 0f9
      // 0c1: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c4: athrow
      // 0c5: fload 2
      // 0c6: ldc 85.0
      // 0c8: fcmpg
      // 0c9: iload 1
      // 0ca: ifeq 0ef
      // 0cd: ifge 0e0
      // 0d0: goto 0d7
      // 0d3: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d6: athrow
      // 0d7: ldc 320.0
      // 0d9: goto 0f9
      // 0dc: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0df: athrow
      // 0e0: fload 2
      // 0e1: iload 1
      // 0e2: ifeq 0f4
      // 0e5: ldc 110.0
      // 0e7: fcmpg
      // 0e8: goto 0ef
      // 0eb: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ee: athrow
      // 0ef: ifge 0f7
      // 0f2: ldc 360.0
      // 0f4: goto 0f9
      // 0f7: ldc 410.0
      // 0f9: fstore 4
      // 0fb: fload 4
      // 0fd: ldc 1.15
      // 0ff: fmul
      // 100: ldc 1000.0
      // 102: fdiv
      // 103: fload 3
      // 104: fdiv
      // 105: ldc 0.1
      // 107: ldc 0.85
      // 109: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 10c: fstore 5
      // 10e: ldc 0.72
      // 110: aload 0
      // 111: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 114: invokevirtual java/util/Random.nextFloat ()F
      // 117: ldc 0.12
      // 119: fmul
      // 11a: fadd
      // 11b: fstore 6
      // 11d: ldc 4.3
      // 11f: fload 5
      // 121: fdiv
      // 122: fstore 7
      // 124: aload 0
      // 125: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 128: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.X ()F
      // 12b: fstore 8
      // 12d: aload 0
      // 12e: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 131: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.Y ()F
      // 134: fstore 9
      // 136: fload 7
      // 138: fload 8
      // 13a: fmul
      // 13b: fstore 10
      // 13d: fload 7
      // 13f: fload 9
      // 141: fmul
      // 142: fstore 11
      // 144: aload 0
      // 145: fload 7
      // 147: fload 7
      // 149: fmul
      // 14a: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl F
      // 14d: aload 0
      // 14e: fload 10
      // 150: fload 10
      // 152: fmul
      // 153: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll F
      // 156: aload 0
      // 157: fload 11
      // 159: fload 11
      // 15b: fmul
      // 15c: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl F
      // 15f: aload 0
      // 160: fconst_2
      // 161: fload 6
      // 163: fmul
      // 164: fload 7
      // 166: fmul
      // 167: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 16a: aload 0
      // 16b: fconst_2
      // 16c: fload 6
      // 16e: fmul
      // 16f: fload 10
      // 171: fmul
      // 172: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 175: aload 0
      // 176: fconst_2
      // 177: fload 6
      // 179: fmul
      // 17a: fload 11
      // 17c: fmul
      // 17d: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl F
      // 180: aload 0
      // 181: fconst_1
      // 182: aload 0
      // 183: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 186: invokevirtual java/util/Random.nextFloat ()F
      // 189: ldc 0.1
      // 18b: fmul
      // 18c: fadd
      // 18d: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll F
      // 190: aload 0
      // 191: aload 0
      // 192: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 195: invokevirtual java/util/Random.nextFloat ()F
      // 198: ldc 0.5
      // 19a: fsub
      // 19b: ldc 0.14
      // 19d: fmul
      // 19e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 1a1: aload 0
      // 1a2: ldc 3.2
      // 1a4: fload 2
      // 1a5: fmul
      // 1a6: fload 5
      // 1a8: fdiv
      // 1a9: ldc 0.95
      // 1ab: aload 0
      // 1ac: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 1af: invokevirtual java/util/Random.nextFloat ()F
      // 1b2: ldc 0.1
      // 1b4: fmul
      // 1b5: fadd
      // 1b6: fmul
      // 1b7: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll F
      // 1ba: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 1bd: aload 0
      // 1be: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 1c1: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 1c4: aload 0
      // 1c5: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 1c8: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 1cb: fsub
      // 1cc: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 1cf: fstore 12
      // 1d1: aload 0
      // 1d2: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 1d5: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 1d8: aload 0
      // 1d9: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 1dc: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 1df: fsub
      // 1e0: fstore 13
      // 1e2: fload 13
      // 1e4: fneg
      // 1e5: fstore 14
      // 1e7: fload 12
      // 1e9: fstore 15
      // 1eb: aload 0
      // 1ec: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 1ef: invokevirtual java/util/Random.nextBoolean ()Z
      // 1f2: ifeq 1fd
      // 1f5: fconst_1
      // 1f6: goto 1ff
      // 1f9: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1fc: athrow
      // 1fd: ldc -1.0
      // 1ff: fstore 16
      // 201: aload 0
      // 202: aload 0
      // 203: fload 2
      // 204: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (F)Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 207: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 20a: aload 0
      // 20b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 20e: bipush 0
      // 20f: aload 0
      // 210: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 213: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 216: fastore
      // 217: aload 0
      // 218: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 21b: bipush 0
      // 21c: aload 0
      // 21d: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 220: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 223: fastore
      // 224: aload 0
      // 225: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 228: bipush 3
      // 229: aload 0
      // 22a: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 22d: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 230: fastore
      // 231: aload 0
      // 232: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 235: bipush 3
      // 236: aload 0
      // 237: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 23a: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 23d: fastore
      // 23e: aload 0
      // 23f: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 242: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 245: swap
      // 246: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ordinal ()I
      // 249: iaload
      // 24a: tableswitch 722 1 5 34 182 316 453 587
      // 26c: ldc 0.02
      // 26e: aload 0
      // 26f: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 272: invokevirtual java/util/Random.nextFloat ()F
      // 275: ldc 0.02
      // 277: fmul
      // 278: fadd
      // 279: fload 16
      // 27b: fmul
      // 27c: fstore 19
      // 27e: aload 0
      // 27f: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 282: bipush 1
      // 283: aload 0
      // 284: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 287: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 28a: fload 12
      // 28c: ldc 0.3
      // 28e: fmul
      // 28f: fadd
      // 290: fload 14
      // 292: fload 19
      // 294: fmul
      // 295: fadd
      // 296: fastore
      // 297: aload 0
      // 298: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 29b: bipush 1
      // 29c: aload 0
      // 29d: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 2a0: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 2a3: fload 13
      // 2a5: ldc 0.3
      // 2a7: fmul
      // 2a8: fadd
      // 2a9: fload 15
      // 2ab: fload 19
      // 2ad: fmul
      // 2ae: fadd
      // 2af: fastore
      // 2b0: aload 0
      // 2b1: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 2b4: bipush 2
      // 2b5: aload 0
      // 2b6: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 2b9: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 2bc: fload 12
      // 2be: ldc 0.7
      // 2c0: fmul
      // 2c1: fadd
      // 2c2: fload 14
      // 2c4: fload 19
      // 2c6: fmul
      // 2c7: ldc 0.5
      // 2c9: fmul
      // 2ca: fadd
      // 2cb: fastore
      // 2cc: aload 0
      // 2cd: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 2d0: bipush 2
      // 2d1: aload 0
      // 2d2: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 2d5: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 2d8: fload 13
      // 2da: ldc 0.7
      // 2dc: fmul
      // 2dd: fadd
      // 2de: fload 15
      // 2e0: fload 19
      // 2e2: fmul
      // 2e3: ldc 0.5
      // 2e5: fmul
      // 2e6: fadd
      // 2e7: fastore
      // 2e8: aload 0
      // 2e9: ldc 0.325
      // 2eb: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI F
      // 2ee: iload 1
      // 2ef: ifne 528
      // 2f2: bipush 5
      // 2f3: anewarray 239
      // 2f6: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b ([Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;)V
      // 2f9: goto 300
      // 2fc: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ff: athrow
      // 300: ldc 0.09
      // 302: aload 0
      // 303: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 306: invokevirtual java/util/Random.nextFloat ()F
      // 309: ldc 0.045
      // 30b: fmul
      // 30c: fadd
      // 30d: fload 16
      // 30f: fmul
      // 310: fstore 19
      // 312: aload 0
      // 313: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 316: bipush 1
      // 317: aload 0
      // 318: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 31b: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 31e: fload 12
      // 320: ldc 0.3
      // 322: fmul
      // 323: fadd
      // 324: fload 14
      // 326: fload 19
      // 328: fmul
      // 329: fadd
      // 32a: fastore
      // 32b: aload 0
      // 32c: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 32f: bipush 1
      // 330: aload 0
      // 331: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 334: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 337: fload 13
      // 339: ldc 0.3
      // 33b: fmul
      // 33c: fadd
      // 33d: fload 15
      // 33f: fload 19
      // 341: fmul
      // 342: fadd
      // 343: fastore
      // 344: aload 0
      // 345: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 348: bipush 2
      // 349: aload 0
      // 34a: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 34d: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 350: fload 12
      // 352: ldc 0.7
      // 354: fmul
      // 355: fadd
      // 356: fload 14
      // 358: fload 19
      // 35a: fmul
      // 35b: ldc 1.05
      // 35d: fmul
      // 35e: fadd
      // 35f: fastore
      // 360: aload 0
      // 361: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 364: bipush 2
      // 365: aload 0
      // 366: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 369: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 36c: fload 13
      // 36e: ldc 0.7
      // 370: fmul
      // 371: fadd
      // 372: fload 15
      // 374: fload 19
      // 376: fmul
      // 377: ldc 1.05
      // 379: fmul
      // 37a: fadd
      // 37b: fastore
      // 37c: aload 0
      // 37d: ldc 0.55
      // 37f: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI F
      // 382: iload 1
      // 383: ifne 528
      // 386: ldc 0.075
      // 388: aload 0
      // 389: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 38c: invokevirtual java/util/Random.nextFloat ()F
      // 38f: ldc 0.04
      // 391: fmul
      // 392: fadd
      // 393: fstore 19
      // 395: aload 0
      // 396: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 399: bipush 1
      // 39a: aload 0
      // 39b: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 39e: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 3a1: fload 12
      // 3a3: ldc 0.28
      // 3a5: fmul
      // 3a6: fadd
      // 3a7: fload 14
      // 3a9: fload 19
      // 3ab: fmul
      // 3ac: fload 16
      // 3ae: fmul
      // 3af: fadd
      // 3b0: fastore
      // 3b1: aload 0
      // 3b2: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 3b5: bipush 1
      // 3b6: aload 0
      // 3b7: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 3ba: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 3bd: fload 13
      // 3bf: ldc 0.28
      // 3c1: fmul
      // 3c2: fadd
      // 3c3: fload 15
      // 3c5: fload 19
      // 3c7: fmul
      // 3c8: fload 16
      // 3ca: fmul
      // 3cb: fadd
      // 3cc: fastore
      // 3cd: aload 0
      // 3ce: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 3d1: bipush 2
      // 3d2: aload 0
      // 3d3: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 3d6: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 3d9: fload 12
      // 3db: ldc 0.72
      // 3dd: fmul
      // 3de: fadd
      // 3df: fload 14
      // 3e1: fload 19
      // 3e3: fmul
      // 3e4: fload 16
      // 3e6: fmul
      // 3e7: fsub
      // 3e8: fastore
      // 3e9: aload 0
      // 3ea: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 3ed: bipush 2
      // 3ee: aload 0
      // 3ef: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 3f2: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 3f5: fload 13
      // 3f7: ldc 0.72
      // 3f9: fmul
      // 3fa: fadd
      // 3fb: fload 15
      // 3fd: fload 19
      // 3ff: fmul
      // 400: fload 16
      // 402: fmul
      // 403: fsub
      // 404: fastore
      // 405: aload 0
      // 406: ldc 0.6
      // 408: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI F
      // 40b: iload 1
      // 40c: ifne 528
      // 40f: ldc 0.115
      // 411: aload 0
      // 412: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 415: invokevirtual java/util/Random.nextFloat ()F
      // 418: ldc 0.055
      // 41a: fmul
      // 41b: fadd
      // 41c: fload 16
      // 41e: fmul
      // 41f: fstore 19
      // 421: aload 0
      // 422: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 425: bipush 1
      // 426: aload 0
      // 427: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 42a: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 42d: fload 12
      // 42f: ldc 0.55
      // 431: fmul
      // 432: fadd
      // 433: fload 14
      // 435: fload 19
      // 437: fmul
      // 438: fadd
      // 439: fastore
      // 43a: aload 0
      // 43b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 43e: bipush 1
      // 43f: aload 0
      // 440: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 443: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 446: fload 13
      // 448: ldc 0.55
      // 44a: fmul
      // 44b: fadd
      // 44c: fload 15
      // 44e: fload 19
      // 450: fmul
      // 451: fadd
      // 452: fastore
      // 453: aload 0
      // 454: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 457: bipush 2
      // 458: aload 0
      // 459: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 45c: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 45f: fload 12
      // 461: ldc 0.85
      // 463: fmul
      // 464: fadd
      // 465: fload 14
      // 467: fload 19
      // 469: fmul
      // 46a: ldc 0.4
      // 46c: fmul
      // 46d: fadd
      // 46e: fastore
      // 46f: aload 0
      // 470: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 473: bipush 2
      // 474: aload 0
      // 475: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 478: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 47b: fload 13
      // 47d: ldc 0.85
      // 47f: fmul
      // 480: fadd
      // 481: fload 15
      // 483: fload 19
      // 485: fmul
      // 486: ldc 0.4
      // 488: fmul
      // 489: fadd
      // 48a: fastore
      // 48b: aload 0
      // 48c: ldc 0.65
      // 48e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI F
      // 491: iload 1
      // 492: ifne 528
      // 495: ldc 0.135
      // 497: aload 0
      // 498: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 49b: invokevirtual java/util/Random.nextFloat ()F
      // 49e: ldc_w 0.06
      // 4a1: fmul
      // 4a2: fadd
      // 4a3: fload 16
      // 4a5: fmul
      // 4a6: fstore 19
      // 4a8: aload 0
      // 4a9: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 4ac: bipush 1
      // 4ad: aload 0
      // 4ae: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 4b1: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 4b4: fload 12
      // 4b6: ldc 0.5
      // 4b8: fmul
      // 4b9: fadd
      // 4ba: fload 14
      // 4bc: fload 19
      // 4be: fmul
      // 4bf: ldc 0.4
      // 4c1: fmul
      // 4c2: fadd
      // 4c3: fastore
      // 4c4: aload 0
      // 4c5: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 4c8: bipush 1
      // 4c9: aload 0
      // 4ca: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 4cd: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 4d0: fload 13
      // 4d2: ldc 0.5
      // 4d4: fmul
      // 4d5: fadd
      // 4d6: fload 15
      // 4d8: fload 19
      // 4da: fmul
      // 4db: ldc 0.4
      // 4dd: fmul
      // 4de: fadd
      // 4df: fastore
      // 4e0: aload 0
      // 4e1: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 4e4: bipush 2
      // 4e5: aload 0
      // 4e6: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 4e9: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 4ec: fload 12
      // 4ee: ldc 0.5
      // 4f0: fmul
      // 4f1: fadd
      // 4f2: fload 14
      // 4f4: fload 19
      // 4f6: fmul
      // 4f7: fadd
      // 4f8: fastore
      // 4f9: aload 0
      // 4fa: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 4fd: bipush 2
      // 4fe: aload 0
      // 4ff: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 502: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 505: fload 13
      // 507: ldc 0.5
      // 509: fmul
      // 50a: fadd
      // 50b: fload 15
      // 50d: fload 19
      // 50f: fmul
      // 510: fadd
      // 511: fastore
      // 512: aload 0
      // 513: ldc 0.72
      // 515: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI F
      // 518: iload 1
      // 519: ifne 528
      // 51c: new kotlin/NoWhenBranchMatchedException
      // 51f: dup
      // 520: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 523: athrow
      // 524: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 527: athrow
      // 528: aload 0
      // 529: ldc 0.3
      // 52b: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII F
      // 52e: fload 2
      // 52f: ldc_w 25.0
      // 532: fdiv
      // 533: ldc_w 0.25
      // 536: fconst_1
      // 537: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 53a: fstore 17
      // 53c: aload 0
      // 53d: ldc_w 8.0
      // 540: fload 17
      // 542: fmul
      // 543: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll F
      // 546: aload 0
      // 547: ldc_w 18.0
      // 54a: fload 17
      // 54c: fmul
      // 54d: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI F
      // 550: bipush 0
      // 551: istore 18
      // 553: aload 0
      // 554: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII [F
      // 557: arraylength
      // 558: istore 19
      // 55a: iload 18
      // 55c: iload 19
      // 55e: if_icmpge 583
      // 561: aload 0
      // 562: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII [F
      // 565: iload 18
      // 567: fconst_0
      // 568: fastore
      // 569: aload 0
      // 56a: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll [F
      // 56d: iload 18
      // 56f: fconst_0
      // 570: fastore
      // 571: iinc 18 1
      // 574: iload 1
      // 575: ifeq 5ac
      // 578: iload 1
      // 579: ifne 55a
      // 57c: goto 583
      // 57f: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 582: athrow
      // 583: aload 0
      // 584: ldc2_w 180
      // 587: aload 0
      // 588: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 58b: sipush 220
      // 58e: invokevirtual java/util/Random.nextInt (I)I
      // 591: i2l
      // 592: ladd
      // 593: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll J
      // 596: aload 0
      // 597: aload 0
      // 598: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 59b: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 59e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 5a1: aload 0
      // 5a2: aload 0
      // 5a3: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 5a6: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 5a9: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 5ac: iload 1
      // 5ad: ifeq 5f5
      // 5b0: fload 2
      // 5b1: ldc 0.5
      // 5b3: fcmpl
      // 5b4: ifle 5f0
      // 5b7: goto 5be
      // 5ba: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5bd: athrow
      // 5be: ldc 0.3
      // 5c0: aload 0
      // 5c1: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 5c4: invokevirtual java/util/Random.nextFloat ()F
      // 5c7: ldc 0.1
      // 5c9: fmul
      // 5ca: fadd
      // 5cb: fstore 18
      // 5cd: aload 0
      // 5ce: fload 12
      // 5d0: fload 2
      // 5d1: fdiv
      // 5d2: aload 0
      // 5d3: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll F
      // 5d6: fmul
      // 5d7: fload 18
      // 5d9: fmul
      // 5da: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 5dd: aload 0
      // 5de: fload 13
      // 5e0: fload 2
      // 5e1: fdiv
      // 5e2: aload 0
      // 5e3: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll F
      // 5e6: fmul
      // 5e7: fload 18
      // 5e9: fmul
      // 5ea: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 5ed: goto 5fa
      // 5f0: aload 0
      // 5f1: fconst_0
      // 5f2: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 5f5: aload 0
      // 5f6: fconst_0
      // 5f7: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 5fa: aload 0
      // 5fb: invokestatic java/lang/System.currentTimeMillis ()J
      // 5fe: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 601: aload 0
      // 602: aload 0
      // 603: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 606: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll J
      // 609: aload 0
      // 60a: aload 0
      // 60b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 60e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll J
      // 611: aload 0
      // 612: bipush 0
      // 613: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI I
      // 616: aload 0
      // 617: aload 0
      // 618: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 61b: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 61e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll F
      // 621: aload 0
      // 622: aload 0
      // 623: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 626: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 629: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl F
      // 62c: aload 0
      // 62d: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 630: aload 0
      // 631: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 634: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.b (J)V
      // 637: aload 0
      // 638: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 63b: fload 5
      // 63d: ldc_w 4.0
      // 640: fmul
      // 641: ldc 1000.0
      // 643: fmul
      // 644: ldc_w 400.0
      // 647: ldc_w 2200.0
      // 64a: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 64d: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.f (F)V
      // 650: aload 0
      // 651: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 654: bipush 0
      // 655: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.b (Z)V
      // 658: aload 0
      // 659: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 65c: bipush 1
      // 65d: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.a (Z)V
      // 660: return
   }

   @Override
   public void b() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/player/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f ()I
      // 003: istore 1
      // 004: iload 1
      // 005: ifne 024
      // 008: aload 0
      // 009: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 00c: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.a ()Lnet/minecraft/client/Minecraft;
      // 00f: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 012: dup
      // 013: ifnonnull 023
      // 016: goto 01d
      // 019: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01c: athrow
      // 01d: pop
      // 01e: return
      // 01f: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 022: athrow
      // 023: pop
      // 024: invokestatic java/lang/System.currentTimeMillis ()J
      // 027: lstore 2
      // 028: lload 2
      // 029: aload 0
      // 02a: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll J
      // 02d: lsub
      // 02e: lconst_1
      // 02f: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (JJ)J
      // 032: l2f
      // 033: ldc 1000.0
      // 035: fdiv
      // 036: fstore 4
      // 038: aload 0
      // 039: lload 2
      // 03a: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll J
      // 03d: aload 0
      // 03e: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 041: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.T ()F
      // 044: fstore 5
      // 046: aload 0
      // 047: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 04a: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.t ()Lnet/minecraft/world/phys/Vec3;
      // 04d: astore 6
      // 04f: aload 6
      // 051: ifnull 0b0
      // 054: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 057: aload 6
      // 059: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 05c: astore 7
      // 05e: aload 0
      // 05f: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 062: aload 0
      // 063: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 066: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 069: aload 7
      // 06b: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 06e: aload 0
      // 06f: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 072: fsub
      // 073: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 076: fadd
      // 077: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.c (F)V
      // 07a: aload 0
      // 07b: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 07e: aload 0
      // 07f: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 082: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 085: aload 7
      // 087: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 08a: aload 0
      // 08b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 08e: fsub
      // 08f: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 092: fadd
      // 093: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.d (F)V
      // 096: aload 0
      // 097: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI [F
      // 09a: bipush 3
      // 09b: aload 0
      // 09c: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 09f: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 0a2: fastore
      // 0a3: aload 0
      // 0a4: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII [F
      // 0a7: bipush 3
      // 0a8: aload 0
      // 0a9: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 0ac: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 0af: fastore
      // 0b0: fconst_1
      // 0b1: ldc_w -10.0
      // 0b4: fload 4
      // 0b6: fmul
      // 0b7: f2d
      // 0b8: invokestatic java/lang/Math.exp (D)D
      // 0bb: d2f
      // 0bc: fsub
      // 0bd: fstore 7
      // 0bf: aload 0
      // 0c0: aload 0
      // 0c1: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll F
      // 0c4: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 0c7: aload 0
      // 0c8: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 0cb: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 0ce: aload 0
      // 0cf: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll F
      // 0d2: fsub
      // 0d3: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 0d6: fload 7
      // 0d8: fmul
      // 0d9: fadd
      // 0da: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll F
      // 0dd: aload 0
      // 0de: aload 0
      // 0df: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl F
      // 0e2: aload 0
      // 0e3: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 0e6: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 0e9: aload 0
      // 0ea: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl F
      // 0ed: fsub
      // 0ee: fload 7
      // 0f0: fmul
      // 0f1: fadd
      // 0f2: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl F
      // 0f5: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 0f8: aload 0
      // 0f9: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll F
      // 0fc: aload 0
      // 0fd: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 100: fsub
      // 101: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 104: fstore 8
      // 106: aload 0
      // 107: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl F
      // 10a: aload 0
      // 10b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 10e: fsub
      // 10f: fstore 9
      // 111: fload 8
      // 113: fload 8
      // 115: fmul
      // 116: fload 9
      // 118: fload 9
      // 11a: fmul
      // 11b: fadd
      // 11c: f2d
      // 11d: invokestatic java/lang/Math.sqrt (D)D
      // 120: d2f
      // 121: fstore 10
      // 123: aload 0
      // 124: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 127: aload 0
      // 128: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 12b: fmul
      // 12c: aload 0
      // 12d: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 130: aload 0
      // 131: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 134: fmul
      // 135: fadd
      // 136: f2d
      // 137: invokestatic java/lang/Math.sqrt (D)D
      // 13a: d2f
      // 13b: fstore 11
      // 13d: fload 10
      // 13f: ldc_w 0.45
      // 142: fcmpg
      // 143: iload 1
      // 144: ifne 15e
      // 147: ifge 1cc
      // 14a: goto 151
      // 14d: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 150: athrow
      // 151: fload 11
      // 153: ldc_w 18.0
      // 156: fcmpg
      // 157: goto 15e
      // 15a: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15d: athrow
      // 15e: iload 1
      // 15f: ifne 177
      // 162: ifge 1cc
      // 165: goto 16c
      // 168: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI I
      // 170: goto 177
      // 173: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 176: athrow
      // 177: istore 12
      // 179: aload 0
      // 17a: iload 12
      // 17c: bipush 1
      // 17d: iadd
      // 17e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI I
      // 181: aload 0
      // 182: iload 1
      // 183: ifne 1d2
      // 186: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI I
      // 189: bipush 2
      // 18a: if_icmplt 1d1
      // 18d: goto 194
      // 190: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 193: athrow
      // 194: aload 0
      // 195: aload 0
      // 196: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 199: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 19c: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 19f: aload 0
      // 1a0: aload 0
      // 1a1: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 1a4: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 1a7: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 1aa: aload 0
      // 1ab: fconst_0
      // 1ac: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 1af: aload 0
      // 1b0: fconst_0
      // 1b1: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 1b4: aload 0
      // 1b5: aload 0
      // 1b6: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 1b9: aload 0
      // 1ba: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 1bd: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (FF)V
      // 1c0: aload 0
      // 1c1: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 1c4: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.y ()V
      // 1c7: return
      // 1c8: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: bipush 0
      // 1ce: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI I
      // 1d1: aload 0
      // 1d2: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll F
      // 1d5: fload 8
      // 1d7: fmul
      // 1d8: aload 0
      // 1d9: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 1dc: aload 0
      // 1dd: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 1e0: fmul
      // 1e1: fsub
      // 1e2: aload 0
      // 1e3: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll F
      // 1e6: fdiv
      // 1e7: fstore 12
      // 1e9: aload 0
      // 1ea: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl F
      // 1ed: fload 9
      // 1ef: fmul
      // 1f0: aload 0
      // 1f1: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl F
      // 1f4: aload 0
      // 1f5: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 1f8: fmul
      // 1f9: fsub
      // 1fa: aload 0
      // 1fb: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll F
      // 1fe: fdiv
      // 1ff: fstore 13
      // 201: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 204: aload 0
      // 205: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 208: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 20b: aload 0
      // 20c: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 20f: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 212: fsub
      // 213: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 216: fstore 14
      // 218: aload 0
      // 219: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 21c: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 21f: aload 0
      // 220: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 223: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 226: fsub
      // 227: fstore 15
      // 229: fload 14
      // 22b: fload 14
      // 22d: fmul
      // 22e: fload 15
      // 230: fload 15
      // 232: fmul
      // 233: fadd
      // 234: fstore 16
      // 236: fload 16
      // 238: iload 1
      // 239: ifne 334
      // 23c: ldc_w 0.01
      // 23f: fcmpl
      // 240: ifle 32b
      // 243: goto 24a
      // 246: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 249: athrow
      // 24a: aload 0
      // 24b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI F
      // 24e: iload 1
      // 24f: ifne 334
      // 252: goto 259
      // 255: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 258: athrow
      // 259: fconst_0
      // 25a: fcmpl
      // 25b: ifle 32b
      // 25e: goto 265
      // 261: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 264: athrow
      // 265: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 268: aload 0
      // 269: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 26c: aload 0
      // 26d: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 270: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.j ()F
      // 273: fsub
      // 274: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 277: fstore 17
      // 279: aload 0
      // 27a: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 27d: aload 0
      // 27e: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 281: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.k ()F
      // 284: fsub
      // 285: fstore 18
      // 287: fload 17
      // 289: fload 14
      // 28b: fmul
      // 28c: fload 18
      // 28e: fload 15
      // 290: fmul
      // 291: fadd
      // 292: fload 16
      // 294: fdiv
      // 295: fconst_0
      // 296: fconst_1
      // 297: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 29a: fstore 19
      // 29c: ldc_w 4.0
      // 29f: fload 19
      // 2a1: fmul
      // 2a2: fconst_1
      // 2a3: fload 19
      // 2a5: fsub
      // 2a6: fmul
      // 2a7: fconst_0
      // 2a8: fconst_1
      // 2a9: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 2ac: fstore 20
      // 2ae: fload 20
      // 2b0: ldc_w 0.001
      // 2b3: iload 1
      // 2b4: ifne 36d
      // 2b7: fcmpl
      // 2b8: ifle 32b
      // 2bb: goto 2c2
      // 2be: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c1: athrow
      // 2c2: aload 0
      // 2c3: fload 19
      // 2c5: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.b (F)Lkotlin/Pair;
      // 2c8: astore 21
      // 2ca: aload 21
      // 2cc: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 2cf: checkcast java/lang/Number
      // 2d2: invokevirtual java/lang/Number.floatValue ()F
      // 2d5: fstore 22
      // 2d7: aload 21
      // 2d9: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 2dc: checkcast java/lang/Number
      // 2df: invokevirtual java/lang/Number.floatValue ()F
      // 2e2: fstore 23
      // 2e4: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 2e7: fload 22
      // 2e9: aload 0
      // 2ea: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 2ed: fsub
      // 2ee: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (F)F
      // 2f1: fstore 24
      // 2f3: fload 23
      // 2f5: aload 0
      // 2f6: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 2f9: fsub
      // 2fa: fstore 25
      // 2fc: aload 0
      // 2fd: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl F
      // 300: aload 0
      // 301: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI F
      // 304: fmul
      // 305: fstore 26
      // 307: fload 12
      // 309: fload 24
      // 30b: fload 26
      // 30d: fmul
      // 30e: fload 20
      // 310: fmul
      // 311: aload 0
      // 312: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll F
      // 315: fdiv
      // 316: fadd
      // 317: fstore 12
      // 319: fload 13
      // 31b: fload 25
      // 31d: fload 26
      // 31f: fmul
      // 320: fload 20
      // 322: fmul
      // 323: aload 0
      // 324: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll F
      // 327: fdiv
      // 328: fadd
      // 329: fstore 13
      // 32b: aload 0
      // 32c: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 32f: f2d
      // 330: invokestatic java/lang/Math.cos (D)D
      // 333: d2f
      // 334: fstore 17
      // 336: aload 0
      // 337: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl F
      // 33a: f2d
      // 33b: invokestatic java/lang/Math.sin (D)D
      // 33e: d2f
      // 33f: fstore 18
      // 341: fload 12
      // 343: fload 17
      // 345: fmul
      // 346: fload 13
      // 348: fload 18
      // 34a: fmul
      // 34b: fsub
      // 34c: fstore 19
      // 34e: fload 12
      // 350: fload 18
      // 352: fmul
      // 353: fload 13
      // 355: fload 17
      // 357: fmul
      // 358: fadd
      // 359: fstore 20
      // 35b: fload 19
      // 35d: fstore 12
      // 35f: fload 20
      // 361: fstore 13
      // 363: fload 12
      // 365: fload 12
      // 367: fmul
      // 368: fload 13
      // 36a: fload 13
      // 36c: fmul
      // 36d: fadd
      // 36e: f2d
      // 36f: invokestatic java/lang/Math.sqrt (D)D
      // 372: d2f
      // 373: fstore 21
      // 375: fload 21
      // 377: aload 0
      // 378: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI F
      // 37b: fcmpl
      // 37c: iload 1
      // 37d: ifne 3b0
      // 380: ifle 3a1
      // 383: goto 38a
      // 386: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 389: athrow
      // 38a: aload 0
      // 38b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI F
      // 38e: fload 21
      // 390: fdiv
      // 391: fstore 22
      // 393: fload 12
      // 395: fload 22
      // 397: fmul
      // 398: fstore 12
      // 39a: fload 13
      // 39c: fload 22
      // 39e: fmul
      // 39f: fstore 13
      // 3a1: fload 5
      // 3a3: fconst_0
      // 3a4: iload 1
      // 3a5: ifne 4c1
      // 3a8: fcmpl
      // 3a9: goto 3b0
      // 3ac: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3af: athrow
      // 3b0: ifle 493
      // 3b3: fload 10
      // 3b5: ldc_w 3.0
      // 3b8: iload 1
      // 3b9: ifne 4c1
      // 3bc: goto 3c3
      // 3bf: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3c2: athrow
      // 3c3: fcmpl
      // 3c4: ifle 493
      // 3c7: goto 3ce
      // 3ca: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3cd: athrow
      // 3ce: lload 2
      // 3cf: aload 0
      // 3d0: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll J
      // 3d3: lsub
      // 3d4: aload 0
      // 3d5: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll J
      // 3d8: lcmp
      // 3d9: iload 1
      // 3da: ifne 40c
      // 3dd: goto 3e4
      // 3e0: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e3: athrow
      // 3e4: ifle 493
      // 3e7: goto 3ee
      // 3ea: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3ed: athrow
      // 3ee: aload 0
      // 3ef: iload 1
      // 3f0: ifne 481
      // 3f3: goto 3fa
      // 3f6: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f9: athrow
      // 3fa: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 3fd: invokevirtual java/util/Random.nextFloat ()F
      // 400: aload 0
      // 401: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII F
      // 404: fcmpg
      // 405: goto 40c
      // 408: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 40b: athrow
      // 40c: ifge 47b
      // 40f: fload 11
      // 411: fconst_1
      // 412: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
      // 415: fstore 22
      // 417: aload 0
      // 418: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 41b: fneg
      // 41c: fload 22
      // 41e: fdiv
      // 41f: fstore 23
      // 421: aload 0
      // 422: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 425: fload 22
      // 427: fdiv
      // 428: fstore 24
      // 42a: aload 0
      // 42b: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 42e: invokevirtual java/util/Random.nextBoolean ()Z
      // 431: ifeq 43c
      // 434: fconst_1
      // 435: goto 43e
      // 438: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 43b: athrow
      // 43c: ldc -1.0
      // 43e: fstore 25
      // 440: aload 0
      // 441: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll F
      // 444: aload 0
      // 445: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 448: invokevirtual java/util/Random.nextFloat ()F
      // 44b: aload 0
      // 44c: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI F
      // 44f: fmul
      // 450: fadd
      // 451: fload 5
      // 453: fmul
      // 454: fstore 26
      // 456: aload 0
      // 457: aload 0
      // 458: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 45b: fload 23
      // 45d: fload 26
      // 45f: fmul
      // 460: fload 25
      // 462: fmul
      // 463: fadd
      // 464: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 467: aload 0
      // 468: aload 0
      // 469: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 46c: fload 24
      // 46e: fload 26
      // 470: fmul
      // 471: fload 25
      // 473: fmul
      // 474: ldc 0.7
      // 476: fmul
      // 477: fadd
      // 478: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 47b: aload 0
      // 47c: lload 2
      // 47d: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll J
      // 480: aload 0
      // 481: ldc2_w 180
      // 484: aload 0
      // 485: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 488: sipush 220
      // 48b: invokevirtual java/util/Random.nextInt (I)I
      // 48e: i2l
      // 48f: ladd
      // 490: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll J
      // 493: aload 0
      // 494: aload 0
      // 495: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 498: fload 12
      // 49a: fload 4
      // 49c: fmul
      // 49d: fadd
      // 49e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 4a1: aload 0
      // 4a2: aload 0
      // 4a3: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 4a6: fload 13
      // 4a8: fload 4
      // 4aa: fmul
      // 4ab: fadd
      // 4ac: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 4af: aload 0
      // 4b0: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 4b3: aload 0
      // 4b4: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 4b7: fmul
      // 4b8: aload 0
      // 4b9: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 4bc: aload 0
      // 4bd: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 4c0: fmul
      // 4c1: fadd
      // 4c2: f2d
      // 4c3: invokestatic java/lang/Math.sqrt (D)D
      // 4c6: d2f
      // 4c7: fstore 22
      // 4c9: fload 22
      // 4cb: aload 0
      // 4cc: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll F
      // 4cf: iload 1
      // 4d0: ifne 50f
      // 4d3: fcmpl
      // 4d4: ifle 4fd
      // 4d7: goto 4de
      // 4da: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4dd: athrow
      // 4de: aload 0
      // 4df: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll F
      // 4e2: fload 22
      // 4e4: fdiv
      // 4e5: fstore 23
      // 4e7: aload 0
      // 4e8: aload 0
      // 4e9: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 4ec: fload 23
      // 4ee: fmul
      // 4ef: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 4f2: aload 0
      // 4f3: aload 0
      // 4f4: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 4f7: fload 23
      // 4f9: fmul
      // 4fa: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 4fd: ldc_w 6.0
      // 500: fload 5
      // 502: fmul
      // 503: fload 11
      // 505: ldc_w 200.0
      // 508: fdiv
      // 509: fconst_0
      // 50a: ldc 1.5
      // 50c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 50f: fmul
      // 510: fstore 23
      // 512: aload 0
      // 513: aload 0
      // 514: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 517: aload 0
      // 518: aload 0
      // 519: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII [F
      // 51c: fload 4
      // 51e: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ([FF)F
      // 521: fload 23
      // 523: fmul
      // 524: fadd
      // 525: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 528: aload 0
      // 529: aload 0
      // 52a: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 52d: aload 0
      // 52e: aload 0
      // 52f: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll [F
      // 532: fload 4
      // 534: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ([FF)F
      // 537: fload 23
      // 539: fmul
      // 53a: ldc 0.6
      // 53c: fmul
      // 53d: fadd
      // 53e: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 541: ldc_w 8.0E-4
      // 544: fload 11
      // 546: fmul
      // 547: fstore 24
      // 549: aload 0
      // 54a: aload 0
      // 54b: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 54e: aload 0
      // 54f: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 552: fload 24
      // 554: fmul
      // 555: fload 4
      // 557: fmul
      // 558: fsub
      // 559: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 55c: aload 0
      // 55d: aload 0
      // 55e: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 561: aload 0
      // 562: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 565: fload 24
      // 567: fmul
      // 568: fload 4
      // 56a: fmul
      // 56b: fsub
      // 56c: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 56f: aload 0
      // 570: aload 0
      // 571: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 574: aload 0
      // 575: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 578: fload 4
      // 57a: fmul
      // 57b: fadd
      // 57c: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 57f: aload 0
      // 580: aload 0
      // 581: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 584: aload 0
      // 585: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 588: fload 4
      // 58a: fmul
      // 58b: fadd
      // 58c: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 58f: aload 0
      // 590: aload 0
      // 591: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 594: aload 0
      // 595: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 598: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (FF)V
      // 59b: lload 2
      // 59c: aload 0
      // 59d: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 5a0: lsub
      // 5a1: l2f
      // 5a2: fstore 25
      // 5a4: iload 1
      // 5a5: ifne 5ef
      // 5a8: fload 25
      // 5aa: aload 0
      // 5ab: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 5ae: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.p ()F
      // 5b1: fcmpl
      // 5b2: ifle 5f6
      // 5b5: goto 5bc
      // 5b8: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5bb: athrow
      // 5bc: aload 0
      // 5bd: aload 0
      // 5be: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 5c1: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.l ()F
      // 5c4: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 5c7: aload 0
      // 5c8: aload 0
      // 5c9: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 5cc: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.m ()F
      // 5cf: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 5d2: aload 0
      // 5d3: fconst_0
      // 5d4: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl F
      // 5d7: aload 0
      // 5d8: fconst_0
      // 5d9: putfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI F
      // 5dc: aload 0
      // 5dd: aload 0
      // 5de: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII F
      // 5e1: aload 0
      // 5e2: getfield me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI F
      // 5e5: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (FF)V
      // 5e8: goto 5ef
      // 5eb: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5ee: athrow
      // 5ef: aload 0
      // 5f0: invokevirtual me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a ()Lme/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
      // 5f3: invokevirtual me/octo/client/utils/player/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.y ()V
      // 5f6: return
   }

   private final IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      float param1
   ) {
      // PX-FIX round-12: restored from jar bytecode (dump in the comment block below).
      java.util.Random var2 = this.g();
      float var3 = var2.nextFloat();
      if (param1 < 12.0F) {
         return var3 < 0.85F
            ? llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            : llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if (param1 < 35.0F) {
         if (var3 < 0.4F) {
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }
         if (var3 < 0.7F) {
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }
         if (var3 < 0.85F) {
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }
         if (var3 < 0.95F) {
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }
         return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      if (var3 < 0.25F) {
         return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if (var3 < 0.55F) {
         return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if (var3 < 0.78F) {
         return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if (var3 < 0.92F) {
         return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/player/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e ()I
      // 003: aload 0
      // 004: invokespecial me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()Ljava/util/Random;
      // 007: invokevirtual java/util/Random.nextFloat ()F
      // 00a: fstore 3
      // 00b: nop
      // 00c: istore 2
      // 00d: fload 1
      // 00e: ldc_w 12.0
      // 011: fcmpg
      // 012: iload 2
      // 013: ifeq 043
      // 016: ifge 03e
      // 019: goto 020
      // 01c: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01f: athrow
      // 020: fload 3
      // 021: ldc 0.85
      // 023: fcmpg
      // 024: ifge 038
      // 027: goto 02e
      // 02a: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02d: athrow
      // 02e: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 031: goto 12f
      // 034: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 037: athrow
      // 038: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 03b: goto 12f
      // 03e: fload 1
      // 03f: ldc_w 35.0
      // 042: fcmpg
      // 043: iload 2
      // 044: ifeq 0c9
      // 047: ifge 0c3
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 050: athrow
      // 051: fload 3
      // 052: ldc 0.4
      // 054: fcmpg
      // 055: iload 2
      // 056: ifeq 078
      // 059: goto 060
      // 05c: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05f: athrow
      // 060: ifge 074
      // 063: goto 06a
      // 066: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 069: athrow
      // 06a: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 06d: goto 12f
      // 070: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 073: athrow
      // 074: fload 3
      // 075: ldc 0.7
      // 077: fcmpg
      // 078: iload 2
      // 079: ifeq 094
      // 07c: ifge 090
      // 07f: goto 086
      // 082: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 085: athrow
      // 086: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 089: goto 12f
      // 08c: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08f: athrow
      // 090: fload 3
      // 091: ldc 0.85
      // 093: fcmpg
      // 094: iload 2
      // 095: ifeq 0b0
      // 098: ifge 0ac
      // 09b: goto 0a2
      // 09e: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a1: athrow
      // 0a2: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0a5: goto 12f
      // 0a8: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ab: athrow
      // 0ac: fload 3
      // 0ad: ldc 0.95
      // 0af: fcmpg
      // 0b0: ifge 0bd
      // 0b3: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0b6: goto 12f
      // 0b9: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bc: athrow
      // 0bd: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0c0: goto 12f
      // 0c3: nop
      // 0c4: fload 3
      // 0c5: ldc_w 0.25
      // 0c8: fcmpg
      // 0c9: iload 2
      // 0ca: ifeq 0e5
      // 0cd: ifge 0e1
      // 0d0: goto 0d7
      // 0d3: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d6: athrow
      // 0d7: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0da: goto 12f
      // 0dd: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e0: athrow
      // 0e1: fload 3
      // 0e2: ldc 0.55
      // 0e4: fcmpg
      // 0e5: iload 2
      // 0e6: ifeq 102
      // 0e9: ifge 0fd
      // 0ec: goto 0f3
      // 0ef: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f2: athrow
      // 0f3: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0f6: goto 12f
      // 0f9: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fc: athrow
      // 0fd: fload 3
      // 0fe: ldc_w 0.78
      // 101: fcmpg
      // 102: iload 2
      // 103: ifeq 11f
      // 106: ifge 11a
      // 109: goto 110
      // 10c: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10f: athrow
      // 110: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 113: goto 12f
      // 116: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 119: athrow
      // 11a: fload 3
      // 11b: ldc_w 0.92
      // 11e: fcmpg
      // 11f: ifge 12c
      // 122: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 125: goto 12f
      // 128: invokestatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12b: athrow
      // 12c: getstatic me/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/player/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 12f: areturn
   }

   private final Pair<Float, Float> b(float var1) {
      float var2 = 1.0F - var1;
      float var3 = var2 * var2;
      float var4 = var3 * var2;
      float var5 = var1 * var1;
      float var6 = var5 * var1;
      float var7 = var4 * this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[0]
         + 3.0F * var3 * var1 * this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[1]
         + 3.0F * var2 * var5 * this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[2]
         + var6 * this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[3];
      float var8 = var4 * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[0]
         + 3.0F * var3 * var1 * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[1]
         + 3.0F * var2 * var5 * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[2]
         + var6 * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[3];
      return TuplesKt.to(var7, var8);
   }

   private final float a(float[] var1, float var2) {
       float var11 = 0.0F; // PX-FIX decl var11
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      float[] var5 = new float[4];
      int var3 = var10000;
      var5[0] = 0.005F;
      var5[1] = 0.02F;
      var5[2] = 0.08F;
      var5[3] = 0.32F;
      float[] var4 = var5;
      float[] var6 = new float[]{0.4F, 0.6F, 0.8F, 1.0F};
      var5 = var6;
      float var10 = 0.0F;
      int var7 = 0;

      while (true) {
         if (var7 < 4) {
            float var8 = (float)Math.exp(-var2 / var4[var7]);
            var1[var7] = var1[var7] * var8 + (float)this.g().nextGaussian() * (float)Math.sqrt(var2) * var5[var7];
            var11 = var10 + var1[var7];
            if (var3 != 0) {
               break;
            }

            var10 = var11;
            var7++;
            if (var3 == 0) {
               continue;
            }
         }

         var11 = var10 / 4.0F;
         break;
      }

      return var11;
   }

   @Override
   public void d() {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0.0F;
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0F;
      int var2 = 0;
      int var3 = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.length;
      int var1 = var10000;

      while (true) {
         if (var2 < var3) {
            try {
               this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII[var2] = 0.0F;
               this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll[var2] = 0.0F;
               var2++;
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var4) {
               throw (RuntimeException)a(var4);
            }
         }

         this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = 0;
         break;
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      char[] var10003 = " #{\f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 48;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 48;
         var10006 = var0;
      } else {
         var6 = 48;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            break pxClinit;
         }

         var10005 = var10003;
         var10 = 48;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 115;
            case 1 -> 124;
            case 2 -> 57;
            case 3 -> 89;
            case 4 -> 38;
            case 5 -> 51;
            default -> 61;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               break pxClinit;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}

   private static enum llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII };

      public static IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] a() {
         return (IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clone();
      }

      public static IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         String var0
      ) {
         return Enum.valueOf(
            IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      // PX-FIX synth restored from jar bytecode
      // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
      private static me.octo.client.utils.player.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] c() {
         me.octo.client.utils.player.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var0 = new me.octo.client.utils.player.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[5];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var0[2] = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var0[3] = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         var0[4] = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         return var0;
      }
   }
}
