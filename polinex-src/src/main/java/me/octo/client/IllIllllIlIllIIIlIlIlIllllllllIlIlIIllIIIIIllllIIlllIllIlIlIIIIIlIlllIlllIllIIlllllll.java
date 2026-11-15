package me.octo.client;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll {
   public static <T> T a(Object p0, Object p1, Object p2, boolean p3) { return null; } // PX-FIX ovld-shim
   private double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 12.0;
   @NotNull
   private final List<boolean[]> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private Vec3 IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final Minecraft lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static int[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String[] a;
   private static String[] b;

   public IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll() {
      boolean[][] var1 = new boolean[8][];
      boolean[] var2 = new boolean[]{true, false, false, false};
      var1[0] = var2;
      var2 = new boolean[]{false, true, false, false};
      var1[1] = var2;
      var2 = new boolean[]{false, false, true, false};
      var1[2] = var2;
      var2 = new boolean[]{false, false, false, true};
      var1[3] = var2;
      var2 = new boolean[]{true, false, true, false};
      var1[4] = var2;
      var2 = new boolean[]{true, false, false, true};
      var1[5] = var2;
      var2 = new boolean[]{false, true, true, false};
      var1[6] = var2;
      var2 = new boolean[]{false, true, false, true};
      var1[7] = var2;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = CollectionsKt.listOf(var1);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -28433;
      short var10004 = -26999;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var10001;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   public final double a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final void a(double var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   private final int b() {
      return 7;
   }

   private final double c() {
      return 0.5;
   }

   public final boolean d() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(boolean var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean e() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void b(boolean var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   public final boolean f() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void c(boolean var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   @Nullable
   public final Vec3 g() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void a(@Nullable Vec3 var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 003: aload 1
      // 004: sipush -28429
      // 007: sipush -28340
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 0
      // 012: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 015: aload 2
      // 016: ifnull 026
      // 019: ifne 029
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 022: athrow
      // 023: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m ()Z
      // 026: ifne 02a
      // 029: return
      // 02a: aload 0
      // 02b: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/client/Minecraft;
      // 02e: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 031: dup
      // 032: ifnonnull 03b
      // 035: pop
      // 036: return
      // 037: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03a: athrow
      // 03b: astore 3
      // 03c: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 03f: sipush -28419
      // 042: sipush -22046
      // 045: pop2
      // 046: ldc "sprint"
      // 048: bipush 1
      // 049: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 04c: aload 0
      // 04d: aload 2
      // 04e: ifnull 088
      // 051: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 054: aload 0
      // 055: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl I
      // 058: if_icmplt 078
      // 05b: goto 062
      // 05e: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 061: athrow
      // 062: aload 0
      // 063: aload 0
      // 064: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 067: dup
      // 068: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 06b: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 06e: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lnet/minecraft/core/BlockPos;)V
      // 071: goto 078
      // 074: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 077: athrow
      // 078: aload 0
      // 079: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.i ()V
      // 07c: aload 2
      // 07d: ifnull 0a6
      // 080: aload 0
      // 081: goto 088
      // 084: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 087: athrow
      // 088: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/util/List;
      // 08b: dup
      // 08c: ifnull 0a5
      // 08f: astore 7
      // 091: bipush 0
      // 092: istore 8
      // 094: aload 7
      // 096: aload 0
      // 097: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 09a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 09f: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 0a2: goto 0a7
      // 0a5: pop
      // 0a6: aconst_null
      // 0a7: astore 4
      // 0a9: aload 4
      // 0ab: aload 2
      // 0ac: ifnull 0bb
      // 0af: ifnull 1ba
      // 0b2: goto 0b9
      // 0b5: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c ()Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0be: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0c1: aload 2
      // 0c2: ifnull 128
      // 0c5: if_acmpne 119
      // 0c8: goto 0cf
      // 0cb: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: aload 2
      // 0d1: ifnull 1ac
      // 0d4: goto 0db
      // 0d7: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0da: athrow
      // 0db: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0de: sipush 1000
      // 0e1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e4: checkcast java/lang/Number
      // 0e7: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0ea: ifne 1ab
      // 0ed: goto 0f4
      // 0f0: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: aload 2
      // 0f6: ifnull 1ac
      // 0f9: goto 100
      // 0fc: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ff: athrow
      // 100: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 103: sipush 2000
      // 106: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 109: checkcast java/lang/Number
      // 10c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 10f: ifne 1ab
      // 112: goto 119
      // 115: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 118: athrow
      // 119: aload 4
      // 11b: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c ()Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 11e: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 121: goto 128
      // 124: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 127: athrow
      // 128: if_acmpeq 1ba
      // 12b: aload 0
      // 12c: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 12f: sipush 600
      // 132: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 135: checkcast java/lang/Number
      // 138: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 13b: aload 2
      // 13c: ifnull 18f
      // 13f: goto 146
      // 142: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 145: athrow
      // 146: ifne 175
      // 149: goto 150
      // 14c: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14f: athrow
      // 150: aload 0
      // 151: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 154: sipush 1500
      // 157: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15a: checkcast java/lang/Number
      // 15d: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 160: aload 2
      // 161: ifnull 1bd
      // 164: goto 16b
      // 167: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16a: athrow
      // 16b: ifeq 1ba
      // 16e: goto 175
      // 171: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 174: athrow
      // 175: aload 0
      // 176: aload 2
      // 177: ifnull 1ac
      // 17a: goto 181
      // 17d: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 180: athrow
      // 181: bipush 2
      // 182: bipush 0
      // 183: bipush 2
      // 184: aconst_null
      // 185: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;IZILjava/lang/Object;)Z
      // 188: goto 18f
      // 18b: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18e: athrow
      // 18f: ifne 1ab
      // 192: aload 3
      // 193: getfield net/minecraft/client/player/LocalPlayer.horizontalCollision Z
      // 196: aload 2
      // 197: ifnull 1bd
      // 19a: goto 1a1
      // 19d: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a0: athrow
      // 1a1: ifeq 1ba
      // 1a4: goto 1ab
      // 1a7: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: aload 0
      // 1ad: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1b0: dup
      // 1b1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1b4: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 1b7: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lnet/minecraft/core/BlockPos;)V
      // 1ba: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n ()Z
      // 1bd: ifeq 1c9
      // 1c0: aload 0
      // 1c1: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.j ()V
      // 1c4: return
      // 1c5: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/util/List;
      // 1cd: dup
      // 1ce: ifnonnull 1d7
      // 1d1: pop
      // 1d2: return
      // 1d3: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d6: athrow
      // 1d7: astore 5
      // 1d9: aload 5
      // 1db: aload 0
      // 1dc: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 1df: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1e4: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 1e7: astore 6
      // 1e9: aload 6
      // 1eb: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c ()Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1ee: astore 7
      // 1f0: aload 6
      // 1f2: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Lnet/minecraft/world/phys/Vec3;
      // 1f5: astore 8
      // 1f7: aload 0
      // 1f8: aload 6
      // 1fa: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 1fd: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;Lnet/minecraft/world/phys/Vec3;)Z
      // 200: ifeq 27d
      // 203: aload 0
      // 204: aload 0
      // 205: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 208: bipush 1
      // 209: iadd
      // 20a: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 20d: aload 0
      // 20e: aload 2
      // 20f: ifnull 245
      // 212: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 215: aload 2
      // 216: ifnull 2a3
      // 219: goto 220
      // 21c: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 21f: athrow
      // 220: aload 5
      // 222: invokeinterface java/util/List.size ()I 1
      // 227: if_icmpne 23a
      // 22a: goto 231
      // 22d: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 230: athrow
      // 231: aload 0
      // 232: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 235: return
      // 236: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 239: athrow
      // 23a: aload 5
      // 23c: aload 0
      // 23d: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 240: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 245: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 248: astore 6
      // 24a: aload 6
      // 24c: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c ()Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 24f: astore 7
      // 251: aload 6
      // 253: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Lnet/minecraft/world/phys/Vec3;
      // 256: astore 8
      // 258: aload 2
      // 259: ifnull 279
      // 25c: aload 7
      // 25e: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 261: if_acmpne 1f7
      // 264: goto 26b
      // 267: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 26a: athrow
      // 26b: aload 0
      // 26c: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 26f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 272: aload 0
      // 273: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 276: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 279: aload 2
      // 27a: ifnonnull 1f7
      // 27d: aload 7
      // 27f: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 282: if_acmpne 2a8
      // 285: getstatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 288: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()V
      // 28b: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 28e: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl;
      // 291: aload 6
      // 293: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Lnet/minecraft/core/BlockPos;
      // 296: aconst_null
      // 297: bipush 2
      // 298: aconst_null
      // 299: invokestatic me/octo/client/llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl.a (Lme/octo/client/llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl;Lnet/minecraft/core/BlockPos;Ljava/lang/Integer;ILjava/lang/Object;)Z
      // 29c: goto 2a3
      // 29f: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a2: athrow
      // 2a3: pop
      // 2a4: aload 2
      // 2a5: ifnonnull 46d
      // 2a8: aload 0
      // 2a9: aload 6
      // 2ab: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)[Z
      // 2ae: dup
      // 2af: ifnonnull 2bf
      // 2b2: goto 2b9
      // 2b5: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b8: athrow
      // 2b9: pop
      // 2ba: return
      // 2bb: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2be: athrow
      // 2bf: astore 9
      // 2c1: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 2c4: sipush -28422
      // 2c7: sipush -13432
      // 2ca: pop2
      // 2cb: ldc_w "forward"
      // 2ce: aload 9
      // 2d0: bipush 0
      // 2d1: baload
      // 2d2: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 2d5: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 2d8: sipush -28428
      // 2db: sipush 29713
      // 2de: pop2
      // 2df: ldc_w "backward"
      // 2e2: aload 9
      // 2e4: bipush 1
      // 2e5: baload
      // 2e6: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 2e9: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 2ec: sipush -28423
      // 2ef: sipush -25209
      // 2f2: pop2
      // 2f3: ldc_w "left"
      // 2f6: aload 9
      // 2f8: bipush 2
      // 2f9: baload
      // 2fa: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 2fd: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 300: sipush -28443
      // 303: sipush 10902
      // 306: pop2
      // 307: ldc_w "right"
      // 30a: aload 9
      // 30c: bipush 3
      // 30d: baload
      // 30e: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 311: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 314: sipush -28440
      // 317: sipush -18459
      // 31a: pop2
      // 31b: ldc_w "jump"
      // 31e: aload 0
      // 31f: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.h ()Z
      // 322: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 325: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 328: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 32b: astore 10
      // 32d: aload 10
      // 32f: sipush 1000
      // 332: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 335: checkcast java/lang/Number
      // 338: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 33b: aload 2
      // 33c: ifnull 3ad
      // 33f: ifne 3a9
      // 342: goto 349
      // 345: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 348: athrow
      // 349: aload 10
      // 34b: sipush 250
      // 34e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 351: checkcast java/lang/Number
      // 354: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 357: aload 2
      // 358: ifnull 3ad
      // 35b: goto 362
      // 35e: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 361: athrow
      // 362: ifeq 3a9
      // 365: goto 36c
      // 368: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 36b: athrow
      // 36c: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 36f: sipush -28431
      // 372: sipush 11735
      // 375: pop2
      // 376: ldc_w "sneak"
      // 379: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 37c: aload 2
      // 37d: ifnull 3ad
      // 380: goto 387
      // 383: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 386: athrow
      // 387: ifeq 3a9
      // 38a: goto 391
      // 38d: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 390: athrow
      // 391: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 394: sipush -28427
      // 397: sipush -7028
      // 39a: pop2
      // 39b: ldc_w "sneak"
      // 39e: bipush 0
      // 39f: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 3a2: goto 3a9
      // 3a5: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3a8: athrow
      // 3a9: aload 0
      // 3aa: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 3ad: aload 2
      // 3ae: ifnull 3e7
      // 3b1: ifeq 3d8
      // 3b4: goto 3bb
      // 3b7: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3ba: athrow
      // 3bb: aload 0
      // 3bc: bipush 0
      // 3bd: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 3c0: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 3c3: sipush -28427
      // 3c6: sipush -7028
      // 3c9: pop2
      // 3ca: ldc_w "sneak"
      // 3cd: bipush 0
      // 3ce: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 3d1: goto 3d8
      // 3d4: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3d7: athrow
      // 3d8: aload 0
      // 3d9: aload 2
      // 3da: ifnull 3eb
      // 3dd: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Z
      // 3e0: goto 3e7
      // 3e3: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e6: athrow
      // 3e7: ifeq 460
      // 3ea: aload 0
      // 3eb: aload 8
      // 3ed: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.b (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 3f0: astore 11
      // 3f2: getstatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3f5: fconst_1
      // 3f6: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (F)V
      // 3f9: aload 2
      // 3fa: ifnull 45c
      // 3fd: aload 0
      // 3fe: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 401: aload 5
      // 403: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 406: if_icmpne 44d
      // 409: goto 410
      // 40c: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 40f: athrow
      // 410: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 413: aload 3
      // 414: checkcast net/minecraft/world/entity/Entity
      // 417: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 41a: aload 5
      // 41c: aload 0
      // 41d: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 420: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 425: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 428: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Lnet/minecraft/world/phys/Vec3;
      // 42b: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 42e: ldc2_w 2.0
      // 431: dcmpg
      // 432: ifge 44d
      // 435: goto 43c
      // 438: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 43b: athrow
      // 43c: getstatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 43f: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()V
      // 442: aload 2
      // 443: ifnonnull 46d
      // 446: goto 44d
      // 449: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 44c: athrow
      // 44d: getstatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 450: aload 11
      // 452: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lnet/minecraft/world/phys/Vec3;)V
      // 455: goto 45c
      // 458: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 45b: athrow
      // 45c: aload 2
      // 45d: ifnonnull 46d
      // 460: getstatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 463: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()V
      // 466: goto 46d
      // 469: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 46c: athrow
      // 46d: return
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 003: aload 1
      // 004: sipush -28435
      // 007: sipush -6024
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 2
      // 012: ifnull 02c
      // 015: aload 0
      // 016: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/util/List;
      // 019: dup
      // 01a: ifnonnull 02d
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 023: athrow
      // 024: pop
      // 025: goto 02c
      // 028: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02b: athrow
      // 02c: return
      // 02d: astore 3
      // 02e: new me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
      // 031: dup
      // 032: bipush 35
      // 034: bipush 110
      // 036: sipush 145
      // 039: invokespecial me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.<init> (III)V
      // 03c: astore 4
      // 03e: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 041: dup
      // 042: aload 4
      // 044: ldc_w 0.3
      // 047: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 04a: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 04d: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 050: astore 5
      // 052: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 055: dup
      // 056: aload 4
      // 058: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 05b: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 05e: astore 6
      // 060: aload 3
      // 061: checkcast java/lang/Iterable
      // 064: astore 7
      // 066: bipush 0
      // 067: istore 8
      // 069: aload 7
      // 06b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 070: astore 9
      // 072: aload 9
      // 074: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 079: ifeq 0b8
      // 07c: aload 9
      // 07e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 083: astore 10
      // 085: aload 10
      // 087: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 08a: astore 11
      // 08c: bipush 0
      // 08d: istore 12
      // 08f: aload 11
      // 091: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Lnet/minecraft/core/BlockPos;
      // 094: aload 5
      // 096: aload 6
      // 098: ldc_w 1.5
      // 09b: aconst_null
      // 09c: aconst_null
      // 09d: fconst_0
      // 09e: bipush 0
      // 09f: fconst_0
      // 0a0: sipush 496
      // 0a3: aconst_null
      // 0a4: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/core/BlockPos;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 0a7: nop
      // 0a8: nop
      // 0a9: aload 2
      // 0aa: ifnull 0b9
      // 0ad: aload 2
      // 0ae: ifnonnull 072
      // 0b1: goto 0b8
      // 0b4: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b7: athrow
      // 0b8: nop
      // 0b9: aload 4
      // 0bb: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 0be: istore 7
      // 0c0: aload 1
      // 0c1: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 0c4: astore 8
      // 0c6: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0c9: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 0cc: dup
      // 0cd: sipush -28442
      // 0d0: sipush 16333
      // 0d3: pop2
      // 0d4: ldc_w "getMainRenderTarget(...)"
      // 0d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0da: astore 9
      // 0dc: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 0df: astore 10
      // 0e1: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0e4: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 0e7: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 0ea: dup
      // 0eb: sipush -28434
      // 0ee: sipush -32566
      // 0f1: pop2
      // 0f2: ldc_w "getMainCamera(...)"
      // 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f8: astore 11
      // 0fa: bipush 0
      // 0fb: istore 12
      // 0fd: sipush 2848
      // 100: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 103: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 106: aload 9
      // 108: aload 8
      // 10a: aload 11
      // 10c: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 10f: astore 13
      // 111: nop
      // 112: aload 10
      // 114: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 117: swap
      // 118: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 11b: iaload
      // 11c: tableswitch 316 1 2 24 170
      // 134: aload 13
      // 136: astore 14
      // 138: bipush 0
      // 139: istore 15
      // 13b: aload 14
      // 13d: astore 16
      // 13f: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 142: astore 17
      // 144: bipush 0
      // 145: istore 18
      // 147: aload 16
      // 149: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 14c: astore 19
      // 14e: aload 16
      // 150: aload 17
      // 152: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 155: nop
      // 156: aload 16
      // 158: astore 20
      // 15a: bipush 0
      // 15b: istore 21
      // 15d: bipush 0
      // 15e: istore 22
      // 160: aload 3
      // 161: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 164: istore 23
      // 166: iload 22
      // 168: iload 23
      // 16a: if_icmpge 1a8
      // 16d: aload 20
      // 16f: aload 3
      // 170: iload 22
      // 172: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 177: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 17a: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Lnet/minecraft/world/phys/Vec3;
      // 17d: aload 3
      // 17e: iload 22
      // 180: bipush 1
      // 181: iadd
      // 182: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 187: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 18a: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Lnet/minecraft/world/phys/Vec3;
      // 18d: iload 7
      // 18f: ldc_w 5.0
      // 192: bipush 1
      // 193: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.b (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IFZ)V
      // 196: iinc 22 1
      // 199: aload 2
      // 19a: ifnull 1b1
      // 19d: aload 2
      // 19e: ifnonnull 166
      // 1a1: goto 1a8
      // 1a4: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a7: athrow
      // 1a8: nop
      // 1a9: nop
      // 1aa: aload 16
      // 1ac: aload 19
      // 1ae: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1b1: goto 1c0
      // 1b4: astore 24
      // 1b6: aload 16
      // 1b8: aload 19
      // 1ba: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1bd: aload 24
      // 1bf: athrow
      // 1c0: nop
      // 1c1: nop
      // 1c2: aload 2
      // 1c3: ifnonnull 264
      // 1c6: aload 13
      // 1c8: astore 14
      // 1ca: bipush 0
      // 1cb: istore 15
      // 1cd: aload 14
      // 1cf: astore 16
      // 1d1: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 1d4: astore 17
      // 1d6: bipush 0
      // 1d7: istore 18
      // 1d9: aload 16
      // 1db: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 1de: astore 19
      // 1e0: aload 16
      // 1e2: aload 17
      // 1e4: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1e7: nop
      // 1e8: aload 16
      // 1ea: astore 20
      // 1ec: bipush 0
      // 1ed: istore 21
      // 1ef: bipush 0
      // 1f0: istore 22
      // 1f2: aload 3
      // 1f3: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 1f6: istore 23
      // 1f8: iload 22
      // 1fa: iload 23
      // 1fc: if_icmpge 23a
      // 1ff: aload 20
      // 201: aload 3
      // 202: iload 22
      // 204: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 209: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 20c: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Lnet/minecraft/world/phys/Vec3;
      // 20f: aload 3
      // 210: iload 22
      // 212: bipush 1
      // 213: iadd
      // 214: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 219: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 21c: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()Lnet/minecraft/world/phys/Vec3;
      // 21f: iload 7
      // 221: ldc_w 5.0
      // 224: bipush 1
      // 225: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.b (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IFZ)V
      // 228: iinc 22 1
      // 22b: aload 2
      // 22c: ifnull 243
      // 22f: aload 2
      // 230: ifnonnull 1f8
      // 233: goto 23a
      // 236: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 239: athrow
      // 23a: nop
      // 23b: nop
      // 23c: aload 16
      // 23e: aload 19
      // 240: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 243: goto 252
      // 246: astore 24
      // 248: aload 16
      // 24a: aload 19
      // 24c: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 24f: aload 24
      // 251: athrow
      // 252: nop
      // 253: nop
      // 254: aload 2
      // 255: ifnonnull 264
      // 258: new kotlin/NoWhenBranchMatchedException
      // 25b: dup
      // 25c: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 25f: athrow
      // 260: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 263: athrow
      // 264: aload 13
      // 266: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 269: sipush 2848
      // 26c: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 26f: goto 282
      // 272: astore 25
      // 274: aload 13
      // 276: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 279: sipush 2848
      // 27c: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 27f: aload 25
      // 281: athrow
      // 282: nop
      // 283: return
   }

   private final boolean a(
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1,
      Vec3 param2
   ) {
      int[] guard = l();
      net.minecraft.client.player.LocalPlayer player = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.player;
      if (guard == null && player == null) {
         return false;
      }

      java.util.List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> list = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (guard == null && list == null) {
         return false;
      }

      int n4 = Math.max(0, this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl - 1);
      int n3 = Math.min(kotlin.collections.CollectionsKt.getLastIndex(list), this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + 1);
      Vec3 v33 = param1.b();
      Vec3 delta = player.getDeltaMovement();
      boolean bl5 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
         me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         param2, v33, delta, 0, false, 0.0, false, false, 0.0, 504, null
      );
      Vec3 v35 = list.get(n3).b();
      Vec3 delta2 = player.getDeltaMovement();
      boolean bl4 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
         me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         param2, v35, delta2, 0, false, 0.0, false, false, 0.0, 504, null
      );

      if (
         param1.c() == me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      ) {
         return me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.b(), param2, 1.5)
            && Math.abs(param1.b().y - param2.y) <= 0.51;
      }

      if (
         n3 != kotlin.collections.CollectionsKt.getLastIndex(list)
            && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               param1.b(), param2, null, 0, false, 0.0, false, false, 0.0, 508, null
            )
            && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               list.get(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl).b(), param2, null, 0, false, 0.0, false, false, 0.0, 508, null
            )
            && bl5
            && bl4
      ) {
         return true;
      }

      if (
         n3 != kotlin.collections.CollectionsKt.getLastIndex(list)
            && bl5
            && bl4
            && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.b(), param2, 0.8)
      ) {
         return true;
      }

      boolean v10 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != kotlin.collections.CollectionsKt.getLastIndex(list)
         || player.onGround() && Math.abs(player.getY() - param1.b().y) < 0.5;

      if (
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != 0
            && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(list.get(n4).b(), param1.b(), param2) >= 1.0
            && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.b(), param2, 2.0)
            && v10
      ) {
         return true;
      }

      if (
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
            && this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != kotlin.collections.CollectionsKt.getLastIndex(list)
            && param1.c() == me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.b(), param2, 0.7)
            && v10
      ) {
         return true;
      }

      boolean v11 = this.a(param1.b(), list.get(n4).b());
      boolean v12 = this.a(param1.a(), list.get(n4).a(), list.get(n3).a());
      me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll rot = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(player.getYRot());
      Vec3 side = rot.c().normalize().scale(3.0);
      Vec3 up = rot.e().normalize().scale(3.0);
      double dy = param1.b().y - param2.y;
      boolean x3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         param2, param2.subtract(side), param2.add(side), param2.subtract(side).subtract(up)
      );
      if (x3 && (dy > 0.5 || dy < -6.0) && this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl >= 2 && !player.onGround() && !v12) {
         return true;
      }

      Vec3 waypoint = param1.b();
      double radius = this.c();
      boolean v21 = param2.x >= waypoint.x - radius && param2.x <= waypoint.x + radius
         && param2.z >= waypoint.z - radius && param2.z <= waypoint.z + radius;
      boolean v24 = param2.x >= waypoint.x - 1.0 && param2.x <= waypoint.x + 1.0
         && param2.z >= waypoint.z - 1.0 && param2.z <= waypoint.z + 1.0;

      if (v24 && v11 && !v12) {
         return true;
      }

      if (v21 && v11 && v12 && !player.onGround() && this.a(4, 4, 2.0)) {
         return true;
      }

      return false;
   }
   private final boolean a(BlockPos param1, BlockPos param2, BlockPos param3) {
      net.minecraft.client.multiplayer.ClientLevel var5 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.level;
      if (var5 == null) {
         return false;
      }
      Vec3 var6 = param2.getCenter();
      int var7 = param2.getY();
      java.util.ArrayList var8 = new java.util.ArrayList();
      for (int var9 = -1; var9 < 2; var9++) {
         for (int var10 = -1; var10 < 2; var10++) {
            var8.add(new BlockPos(param1.getX() + var9, var7, param1.getZ() + var10));
         }
      }
      java.util.List var12 = CollectionsKt.sortedWith((Iterable) var8, new me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var6));
      java.util.ArrayList var13 = new java.util.ArrayList();
      for (Object var16 : var12) {
         BlockPos var17 = (BlockPos) var16;
         net.minecraft.world.level.block.state.BlockState var19 = var5.getBlockState(var17);
         if (!var19.isAir() && var19.getFluidState().isEmpty()) {
            var13.add(var16);
         }
      }
      boolean var10b = var13.size() > 3;
      double var11 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var6, param1.getCenter(), param3.getCenter());
      return Math.abs(var11) > 90.0 || var10b;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 003: astore 4
      // 005: aload 4
      // 007: ifnull 024
      // 00a: aload 0
      // 00b: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/client/Minecraft;
      // 00e: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 011: dup
      // 012: ifnonnull 026
      // 015: goto 01c
      // 018: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01b: athrow
      // 01c: pop
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: astore 5
      // 028: aload 2
      // 029: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 02c: dup
      // 02d: sipush -28447
      // 030: sipush 13011
      // 033: pop2
      // 034: ldc_w "getCenter(...)"
      // 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 03a: astore 6
      // 03c: aload 2
      // 03d: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 040: istore 7
      // 042: new java/util/ArrayList
      // 045: dup
      // 046: invokespecial java/util/ArrayList.<init> ()V
      // 049: astore 8
      // 04b: bipush -1
      // 04c: istore 9
      // 04e: iload 9
      // 050: bipush 2
      // 051: if_icmpge 096
      // 054: bipush -1
      // 055: istore 10
      // 057: iload 10
      // 059: bipush 2
      // 05a: if_icmpge 08e
      // 05d: aload 8
      // 05f: new net/minecraft/core/BlockPos
      // 062: dup
      // 063: aload 1
      // 064: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 067: iload 9
      // 069: iadd
      // 06a: iload 7
      // 06c: aload 1
      // 06d: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 070: iload 10
      // 072: iadd
      // 073: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 076: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 079: pop
      // 07a: iinc 10 1
      // 07d: aload 4
      // 07f: ifnull 091
      // 082: aload 4
      // 084: ifnonnull 057
      // 087: goto 08e
      // 08a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08d: athrow
      // 08e: iinc 9 1
      // 091: aload 4
      // 093: ifnonnull 04e
      // 096: aload 8
      // 098: checkcast java/lang/Iterable
      // 09b: astore 10
      // 09d: nop
      // 09e: bipush 0
      // 09f: istore 11
      // 0a1: aload 10
      // 0a3: new me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 0a6: dup
      // 0a7: aload 6
      // 0a9: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Lnet/minecraft/world/phys/Vec3;)V
      // 0ac: checkcast java/util/Comparator
      // 0af: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
      // 0b2: checkcast java/lang/Iterable
      // 0b5: astore 10
      // 0b7: nop
      // 0b8: bipush 0
      // 0b9: istore 11
      // 0bb: aload 10
      // 0bd: astore 12
      // 0bf: new java/util/ArrayList
      // 0c2: dup
      // 0c3: invokespecial java/util/ArrayList.<init> ()V
      // 0c6: checkcast java/util/Collection
      // 0c9: astore 13
      // 0cb: bipush 0
      // 0cc: istore 14
      // 0ce: aload 12
      // 0d0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0d5: astore 15
      // 0d7: aload 15
      // 0d9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0de: ifeq 154
      // 0e1: aload 15
      // 0e3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e8: astore 16
      // 0ea: aload 16
      // 0ec: checkcast net/minecraft/core/BlockPos
      // 0ef: astore 17
      // 0f1: bipush 0
      // 0f2: istore 18
      // 0f4: aload 5
      // 0f6: aload 17
      // 0f8: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0fb: dup
      // 0fc: sipush -28438
      // 0ff: sipush 6675
      // 102: pop2
      // 103: ldc_w "getBlockState(...)"
      // 106: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 109: astore 19
      // 10b: aload 19
      // 10d: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 110: aload 4
      // 112: ifnull 12e
      // 115: ifne 141
      // 118: goto 11f
      // 11b: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11e: athrow
      // 11f: aload 19
      // 121: invokevirtual net/minecraft/world/level/block/state/BlockState.getFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 124: invokevirtual net/minecraft/world/level/material/FluidState.isEmpty ()Z
      // 127: goto 12e
      // 12a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12d: athrow
      // 12e: aload 4
      // 130: ifnull 13e
      // 133: ifeq 141
      // 136: goto 13d
      // 139: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13c: athrow
      // 13d: bipush 1
      // 13e: goto 142
      // 141: bipush 0
      // 142: ifeq 0d7
      // 145: aload 13
      // 147: aload 16
      // 149: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 14e: pop
      // 14f: aload 4
      // 151: ifnonnull 0d7
      // 154: aload 13
      // 156: checkcast java/util/List
      // 159: nop
      // 15a: astore 9
      // 15c: aload 9
      // 15e: invokeinterface java/util/List.size ()I 1
      // 163: aload 4
      // 165: ifnull 17b
      // 168: bipush 3
      // 169: if_icmple 17e
      // 16c: goto 173
      // 16f: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 172: athrow
      // 173: bipush 1
      // 174: goto 17b
      // 177: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17a: athrow
      // 17b: goto 17f
      // 17e: bipush 0
      // 17f: istore 10
      // 181: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 184: aload 6
      // 186: aload 1
      // 187: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 18a: dup
      // 18b: sipush -28439
      // 18e: sipush -5495
      // 191: pop2
      // 192: ldc_w "getCenter(...)"
      // 195: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 198: aload 3
      // 199: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 19c: dup
      // 19d: sipush -28439
      // 1a0: sipush -5495
      // 1a3: pop2
      // 1a4: ldc_w "getCenter(...)"
      // 1a7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1aa: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 1ad: dstore 11
      // 1af: dload 11
      // 1b1: invokestatic java/lang/Math.abs (D)D
      // 1b4: ldc2_w 90.0
      // 1b7: dcmpl
      // 1b8: aload 4
      // 1ba: ifnull 1e0
      // 1bd: ifgt 1df
      // 1c0: goto 1c7
      // 1c3: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c6: athrow
      // 1c7: iload 10
      // 1c9: aload 4
      // 1cb: ifnull 1e0
      // 1ce: goto 1d5
      // 1d1: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d4: athrow
      // 1d5: ifeq 1e3
      // 1d8: goto 1df
      // 1db: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1de: athrow
      // 1df: bipush 1
      // 1e0: goto 1e4
      // 1e3: bipush 0
      // 1e4: ireturn
   }

   private final boolean a(Vec3 param1, Vec3 param2) {
         var var3 = this.l();
         return me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2, 2.0d) && (param1.y - param2.y < -2.0d);
   }

   private final boolean a(int param1, boolean param2) {
      int[] var3 = l();
      var var4 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.l();
      if (var4 == null) { return false; }
      for (int var5 = 0; var5 < param1; var5++) {
         var var6 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 1.0, 0.0, var4, param2, 0.0, 16, null);
         if (var6 != null) {
            var4 = var6;
            if (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) { return true; }
         }
      }
      return false;
   }

   private final boolean a(int param1, int param2, double param3) {
      // Decoy: `l()` returns this class's static pad int[] (local 5); it is only tested by
      // `aload 5; ifnull/ifnonnull` folds at 8-10, 66-68, 88-90, 119-121, 142-144, 184-186 and 209-211 - those
      // branches and the dead stores `var10 = var9` (61-63) / `var11 = false` (65-71) are padding.
      int[] var5 = l();
      var var6 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.l();
      if (var6 == null) {
         return false;
      }
      Vec3 var7 = var6.a();
      int var8 = 0;
      for (int var9 = 0; var9 < param1; var9++) {
         var var10 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 1.0, 0.0, var6, false, 0.0, 24, (Object)null);
         if (var10 != null) {
            var6 = var10;
            if (!var6.e()) {
               var8++;
            }
            if (var8 == param2) {
               return Math.abs(var7.y - var6.a().y) >= param3;
            }
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
      // 00: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 03: aconst_null
      // 04: astore 6
      // 06: astore 5
      // 08: aload 5
      // 0a: ifnull 26
      // 0d: getstatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 10: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 13: dup
      // 14: ifnonnull 28
      // 17: goto 1e
      // 1a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d: athrow
      // 1e: pop
      // 1f: goto 26
      // 22: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
      // 28: astore 6
      // 2a: aload 6
      // 2c: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/world/phys/Vec3;
      // 2f: astore 7
      // 31: bipush 0
      // 32: istore 8
      // 34: bipush 0
      // 35: istore 9
      // 37: iload 9
      // 39: iload 1
      // 3a: if_icmpge d6
      // 3d: iload 9
      // 3f: istore 10
      // 41: bipush 0
      // 42: aload 5
      // 44: ifnull d7
      // 47: istore 11
      // 49: getstatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 4c: dconst_1
      // 4d: dconst_0
      // 4e: aload 6
      // 50: bipush 0
      // 51: dconst_0
      // 52: bipush 24
      // 54: aconst_null
      // 55: invokestatic me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;DDLme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;ZDILjava/lang/Object;)Lme/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 58: aload 5
      // 5a: ifnull 74
      // 5d: dup
      // 5e: ifnonnull 70
      // 61: goto 68
      // 64: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 67: athrow
      // 68: pop
      // 69: goto ce
      // 6c: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6f: athrow
      // 70: astore 6
      // 72: aload 6
      // 74: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.e ()Z
      // 77: aload 5
      // 79: ifnull 8e
      // 7c: ifne 8c
      // 7f: goto 86
      // 82: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 85: athrow
      // 86: iload 8
      // 88: bipush 1
      // 89: iadd
      // 8a: istore 8
      // 8c: iload 8
      // 8e: aload 5
      // 90: ifnull b8
      // 93: iload 2
      // 94: if_icmpne cd
      // 97: goto 9e
      // 9a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 9d: athrow
      // 9e: aload 7
      // a0: getfield net/minecraft/world/phys/Vec3.y D
      // a3: aload 6
      // a5: invokevirtual me/octo/client/utils/player/pathfinder/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/world/phys/Vec3;
      // a8: getfield net/minecraft/world/phys/Vec3.y D
      // ab: dsub
      // ac: invokestatic java/lang/Math.abs (D)D
      // af: dload 3
      // b0: dcmpl
      // b1: goto b8
      // b4: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b7: athrow
      // b8: aload 5
      // ba: ifnull c8
      // bd: iflt cb
      // c0: goto c7
      // c3: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // c6: athrow
      // c7: bipush 1
      // c8: goto cc
      // cb: bipush 0
      // cc: ireturn
      // cd: nop
      // ce: iinc 9 1
      // d1: aload 5
      // d3: ifnonnull 37
      // d6: bipush 0
      // d7: ireturn
   }

   private final void a(BlockPos param1) {
      int[] var2 = l();
      net.minecraft.client.player.LocalPlayer var3 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.player;
      if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         return;
      }
      if (var3 == null || var2 == null) {
         return;
      }

      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
      net.minecraft.world.phys.Vec3 var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity) var3);
      int var5 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      new Thread(new Runnable() {
         public void run() {
            IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(param1, IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.this, var5, var4);
         }
      }).start();
   }

   private final void a(String var1) {
      try {
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(var1);
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }
   }

   private final void j() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j();
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
   }

   public final boolean a(@Nullable Object param1, @Nullable Vec3 param2, boolean param3) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(this);
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = param3;
      BlockPos var6;
      if (param1 instanceof net.minecraft.world.entity.Entity) {
         var6 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((net.minecraft.world.entity.Entity)param1);
      } else if (param1 instanceof BlockPos) {
         var6 = (BlockPos)param1;
      } else if (param1 instanceof Vec3) {
         var6 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f((Vec3)param1);
      } else {
         var6 = null;
      }
      if (var6 == null) {
         this.a("Invalid pathfind target");
         this.k();
         return false;
      }
      if (!me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var6, param3)) {
         this.a("Target not reachable");
         this.k();
         return false;
      }
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = param2;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll++;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var6, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(), null, null);
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().a(java.lang.Integer.valueOf(300)) && me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak");
      this.a(var6);
      return true;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 005: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 008: aload 0
      // 009: bipush 0
      // 00a: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Z
      // 00d: getstatic me/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 010: getfield me/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/events/impl/base/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 013: aload 0
      // 014: invokevirtual me/octo/client/events/impl/base/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Object;)V
      // 017: astore 4
      // 019: aload 0
      // 01a: iload 3
      // 01b: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Z
      // 01e: aload 1
      // 01f: astore 6
      // 021: aload 6
      // 023: instanceof net/minecraft/world/entity/Entity
      // 026: aload 4
      // 028: ifnull 04b
      // 02b: ifeq 046
      // 02e: goto 035
      // 031: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 034: athrow
      // 035: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 038: aload 1
      // 039: checkcast net/minecraft/world/entity/Entity
      // 03c: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/core/BlockPos;
      // 03f: goto 07f
      // 042: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 045: athrow
      // 046: aload 6
      // 048: instanceof net/minecraft/core/BlockPos
      // 04b: aload 4
      // 04d: ifnull 06a
      // 050: ifeq 065
      // 053: goto 05a
      // 056: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 059: athrow
      // 05a: aload 1
      // 05b: checkcast net/minecraft/core/BlockPos
      // 05e: goto 07f
      // 061: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 064: athrow
      // 065: aload 6
      // 067: instanceof net/minecraft/world/phys/Vec3
      // 06a: ifeq 07e
      // 06d: getstatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
      // 070: aload 1
      // 071: checkcast net/minecraft/world/phys/Vec3
      // 074: invokevirtual me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.f (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/BlockPos;
      // 077: goto 07f
      // 07a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07d: athrow
      // 07e: aconst_null
      // 07f: astore 5
      // 081: aload 4
      // 083: ifnull 0ab
      // 086: aload 5
      // 088: ifnonnull 0ad
      // 08b: goto 092
      // 08e: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 091: athrow
      // 092: aload 0
      // 093: sipush -28424
      // 096: sipush 5987
      // 099: pop2
      // 09a: ldc_w "Invalid pathfind target"
      // 09d: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Ljava/lang/String;)V
      // 0a0: aload 0
      // 0a1: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 0a4: goto 0ab
      // 0a7: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0aa: athrow
      // 0ab: bipush 0
      // 0ac: ireturn
      // 0ad: getstatic me/octo/client/utils/player/pathfinder/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0b0: aload 5
      // 0b2: iload 3
      // 0b3: invokevirtual me/octo/client/utils/player/pathfinder/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a (Lnet/minecraft/core/BlockPos;Z)Z
      // 0b6: istore 6
      // 0b8: iload 6
      // 0ba: aload 4
      // 0bc: ifnull 0ea
      // 0bf: ifne 0e1
      // 0c2: goto 0c9
      // 0c5: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: sipush -28425
      // 0cd: sipush 17502
      // 0d0: pop2
      // 0d1: ldc_w "Target not reachable"
      // 0d4: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Ljava/lang/String;)V
      // 0d7: aload 0
      // 0d8: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 0db: bipush 0
      // 0dc: ireturn
      // 0dd: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: aload 2
      // 0e3: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lnet/minecraft/world/phys/Vec3;
      // 0e6: aload 0
      // 0e7: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll I
      // 0ea: istore 7
      // 0ec: aload 0
      // 0ed: iload 7
      // 0ef: bipush 1
      // 0f0: iadd
      // 0f1: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll I
      // 0f4: aload 0
      // 0f5: new me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 0f8: dup
      // 0f9: aload 5
      // 0fb: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 0fe: aconst_null
      // 0ff: aconst_null
      // 100: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;Ljava/lang/Integer;Ljava/lang/Integer;)V
      // 103: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 106: aload 0
      // 107: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 10a: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 10d: sipush 300
      // 110: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 113: checkcast java/lang/Number
      // 116: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 119: aload 4
      // 11b: ifnull 13f
      // 11e: ifeq 152
      // 121: goto 128
      // 124: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 127: athrow
      // 128: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 12b: sipush -28427
      // 12e: sipush -7028
      // 131: pop2
      // 132: ldc_w "sneak"
      // 135: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 138: goto 13f
      // 13b: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13e: athrow
      // 13f: aload 4
      // 141: ifnull 14f
      // 144: ifeq 152
      // 147: goto 14e
      // 14a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14d: athrow
      // 14e: bipush 1
      // 14f: goto 153
      // 152: bipush 0
      // 153: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 156: aload 0
      // 157: aload 5
      // 159: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lnet/minecraft/core/BlockPos;)V
      // 15c: bipush 1
      // 15d: ireturn
   }

   public final void k() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = null;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      this.j();
   }

   private static final void a(
      BlockPos param0, IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll param1, int param2, Vec3 param3
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 003: astore 4
      // 005: aload 4
      // 007: ifnull 03a
      // 00a: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 00d: aload 0
      // 00e: aload 1
      // 00f: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Z
      // 012: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Object;Z)Ljava/util/List;
      // 015: dup
      // 016: ifnull 032
      // 019: goto 020
      // 01c: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01f: athrow
      // 020: checkcast java/util/Collection
      // 023: invokestatic kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
      // 026: aload 4
      // 028: ifnonnull 03b
      // 02b: goto 032
      // 02e: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 031: athrow
      // 032: pop
      // 033: goto 03a
      // 036: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 039: athrow
      // 03a: aconst_null
      // 03b: astore 5
      // 03d: aload 4
      // 03f: ifnull 062
      // 042: iload 2
      // 043: aload 1
      // 044: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll I
      // 047: if_icmpeq 063
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 050: athrow
      // 051: aload 1
      // 052: bipush 0
      // 053: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 056: aload 1
      // 057: bipush 0
      // 058: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Z
      // 05b: goto 062
      // 05e: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 061: athrow
      // 062: return
      // 063: aload 5
      // 065: ifnonnull 086
      // 068: aload 1
      // 069: aload 0
      // 06a: sipush -28430
      // 06d: sipush 16543
      // 070: pop2
      // 071: ldc_w "No path was found to "
      // 074: swap
      // 075: invokedynamic makeConcatWithConstants (Ljava/lang/String;Lnet/minecraft/core/BlockPos;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 07a: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Ljava/lang/String;)V
      // 07d: aload 1
      // 07e: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 081: return
      // 082: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 085: athrow
      // 086: aload 1
      // 087: aload 5
      // 089: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/util/List;
      // 08c: aload 1
      // 08d: bipush 0
      // 08e: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 091: aload 1
      // 092: bipush 0
      // 093: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI I
      // 096: aload 1
      // 097: bipush 0
      // 098: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 09b: aload 1
      // 09c: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 09f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0a2: aload 1
      // 0a3: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0a6: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0a9: aload 1
      // 0aa: ldc_w 2147483647
      // 0ad: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl I
      // 0b0: bipush 0
      // 0b1: istore 6
      // 0b3: aload 5
      // 0b5: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 0b8: istore 7
      // 0ba: iload 6
      // 0bc: aload 4
      // 0be: ifnull 16e
      // 0c1: iload 7
      // 0c3: if_icmpgt 15e
      // 0c6: goto 0cd
      // 0c9: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cc: athrow
      // 0cd: aload 1
      // 0ce: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/client/Minecraft;
      // 0d1: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 0d4: dup
      // 0d5: ifnull 118
      // 0d8: goto 0df
      // 0db: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0de: athrow
      // 0df: aload 5
      // 0e1: iload 6
      // 0e3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e8: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 0eb: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()Lnet/minecraft/core/BlockPos;
      // 0ee: invokevirtual net/minecraft/client/multiplayer/ClientLevel.isLoaded (Lnet/minecraft/core/BlockPos;)Z
      // 0f1: aload 4
      // 0f3: ifnull 11a
      // 0f6: aload 4
      // 0f8: ifnull 115
      // 0fb: goto 102
      // 0fe: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 101: athrow
      // 102: ifne 114
      // 105: goto 10c
      // 108: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10b: athrow
      // 10c: bipush 1
      // 10d: goto 11a
      // 110: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 113: athrow
      // 114: bipush 0
      // 115: goto 11a
      // 118: pop
      // 119: bipush 0
      // 11a: ifeq 135
      // 11d: aload 1
      // 11e: bipush 0
      // 11f: iload 6
      // 121: bipush 1
      // 122: isub
      // 123: invokestatic java/lang/Math.max (II)I
      // 126: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl I
      // 129: aload 4
      // 12b: ifnonnull 15e
      // 12e: goto 135
      // 131: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 134: athrow
      // 135: iload 6
      // 137: aload 4
      // 139: ifnull 16e
      // 13c: goto 143
      // 13f: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 142: athrow
      // 143: iload 7
      // 145: if_icmpeq 15e
      // 148: goto 14f
      // 14b: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14e: athrow
      // 14f: iinc 6 1
      // 152: aload 4
      // 154: ifnonnull 0cd
      // 157: goto 15e
      // 15a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15d: athrow
      // 15e: aload 1
      // 15f: aload 4
      // 161: ifnull 231
      // 164: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 167: goto 16e
      // 16a: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16d: athrow
      // 16e: ifeq 22b
      // 171: aload 1
      // 172: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/client/Minecraft;
      // 175: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 178: astore 6
      // 17a: aload 4
      // 17c: ifnull 235
      // 17f: aload 6
      // 181: ifnull 22b
      // 184: goto 18b
      // 187: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18a: athrow
      // 18b: getstatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
      // 18e: aload 3
      // 18f: aload 6
      // 191: checkcast net/minecraft/world/entity/Entity
      // 194: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 197: dconst_0
      // 198: dconst_0
      // 199: bipush 12
      // 19b: aconst_null
      // 19c: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;DDILjava/lang/Object;)Ljava/util/ArrayList;
      // 19f: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 1a2: dup
      // 1a3: sipush -28417
      // 1a6: sipush 22148
      // 1a9: pop2
      // 1aa: ldc_w "iterator(...)"
      // 1ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1b0: astore 7
      // 1b2: aload 7
      // 1b4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b9: ifeq 22b
      // 1bc: aload 7
      // 1be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c3: dup
      // 1c4: sipush -28418
      // 1c7: sipush -3969
      // 1ca: pop2
      // 1cb: ldc_w "next(...)"
      // 1ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1d1: checkcast net/minecraft/world/phys/Vec3
      // 1d4: astore 8
      // 1d6: aload 1
      // 1d7: aload 5
      // 1d9: aload 1
      // 1da: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 1dd: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1e2: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 1e5: aload 8
      // 1e7: invokespecial me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a (Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;Lnet/minecraft/world/phys/Vec3;)Z
      // 1ea: ifeq 1b2
      // 1ed: aload 5
      // 1ef: aload 1
      // 1f0: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 1f3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1f8: checkcast me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 1fb: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c ()Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1fe: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 201: if_acmpeq 1b2
      // 204: aload 1
      // 205: aload 1
      // 206: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 209: bipush 1
      // 20a: iadd
      // 20b: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 20e: aload 1
      // 20f: getfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl I
      // 212: aload 4
      // 214: ifnull 1ea
      // 217: aload 5
      // 219: invokeinterface java/util/List.size ()I 1
      // 21e: if_icmpne 1d6
      // 221: aload 1
      // 222: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 225: aload 4
      // 227: ifnull 1b2
      // 22a: return
      // 22b: aload 1
      // 22c: bipush 1
      // 22d: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 230: aload 1
      // 231: bipush 0
      // 232: putfield me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Z
      // 235: return
   }

   public static void b(int[] var0) {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var0;
   }

   public static int[] l() {
      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[30];
      int[] var10000 = new int[2];
      int var3 = 0;
      b(var10000);
      String var2 = "X¶\u009dfÔÅ\u0015Ûð}4\u0005\u001fª[ð°+Ä\u0089\u0083§ß\u0086\u0088æí©\r\u000e\u0003\u0019O¾\u0098B£ð\u009fº\u0003¬\t½e\u0095¶Ø;¯\u009a%\u0004\u0084Uî°\u0017Í\u001cVæ+ÁWd`0¡\u0016\u0091yÎ\u001d£\u0098\u0004¢\u001d5N\u0015Õ|¼¥=-\u00ad\u001d\u0010x7Ý\n ×»\u0088\u0004'|\u0091\u0007\u009exò]6yX\u0005Ê\u00adØÐ\u008c\br.úD\u0012Ö\u001eË\u0014aLy\u0004CF6d\u009f¢öé¦×FÍ_\u0019ÿQ\rD\u008b\u000ey¨\u008dý°\u008a;õ\u0097E\u0005ÓFû\u00adè\rå,:\u008d.\u0013-c\u0090A¶Ø-\u0005÷\u0099«Bý\u0015\u008f-¯ð\u0085-\"GDTÅÒú¦¸*Qa\u0083^\u001d\u0005\u0004¥ÕÅ2\nB{Í«¤\u0085Ä\u008bOJ\u0010ðÍ\u0018\u009e¢ù4{\u0000¸a\u0005ò\u0014£R\u0012\u0083év\u001e`w\u0098ÑÃ\u0085÷7oE¶¹êR\u000eð±\u0018\u001b©\u001f?\u001d}»\u001aA¿]\u0004´Û%w\u0007<ý¦í¼o\t\u0012#:bkï1È÷Wu\u0015\u0015³Ç©é\tX\u0005\u007fòMÕc\b\u0003Á°_åÑÎÀ\n^ZN\u008fÔ\u0001Ê\u001b\u008eX\u0018YË-Z\u000bÿõÑjµGEK\u0082\fîR#\u0080¼s¬¹®";
      int var4 = "X¶\u009dfÔÅ\u0015Ûð}4\u0005\u001fª[ð°+Ä\u0089\u0083§ß\u0086\u0088æí©\r\u000e\u0003\u0019O¾\u0098B£ð\u009fº\u0003¬\t½e\u0095¶Ø;¯\u009a%\u0004\u0084Uî°\u0017Í\u001cVæ+ÁWd`0¡\u0016\u0091yÎ\u001d£\u0098\u0004¢\u001d5N\u0015Õ|¼¥=-\u00ad\u001d\u0010x7Ý\n ×»\u0088\u0004'|\u0091\u0007\u009exò]6yX\u0005Ê\u00adØÐ\u008c\br.úD\u0012Ö\u001eË\u0014aLy\u0004CF6d\u009f¢öé¦×FÍ_\u0019ÿQ\rD\u008b\u000ey¨\u008dý°\u008a;õ\u0097E\u0005ÓFû\u00adè\rå,:\u008d.\u0013-c\u0090A¶Ø-\u0005÷\u0099«Bý\u0015\u008f-¯ð\u0085-\"GDTÅÒú¦¸*Qa\u0083^\u001d\u0005\u0004¥ÕÅ2\nB{Í«¤\u0085Ä\u008bOJ\u0010ðÍ\u0018\u009e¢ù4{\u0000¸a\u0005ò\u0014£R\u0012\u0083év\u001e`w\u0098ÑÃ\u0085÷7oE¶¹êR\u000eð±\u0018\u001b©\u001f?\u001d}»\u001aA¿]\u0004´Û%w\u0007<ý¦í¼o\t\u0012#:bkï1È÷Wu\u0015\u0015³Ç©é\tX\u0005\u007fòMÕc\b\u0003Á°_åÑÎÀ\n^ZN\u008fÔ\u0001Ê\u001b\u008eX\u0018YË-Z\u000bÿõÑjµGEK\u0082\fîR#\u0080¼s¬¹®"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var9 = 111;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 112;
                     case 1 -> 82;
                     case 2 -> 117;
                     case 3 -> 111;
                     case 4 -> 25;
                     case 5 -> 86;
                     default -> 22;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[30];
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

                  var2 = "R\u00adk¿à¬1L\u009b¶áÇçª\bå%Kä½\u0081âí";
                  var4 = "R\u00adk¿à¬1L\u009b¶áÇçª\bå%Kä½\u0081âí".length();
                  var1 = 14;
                  var8 = -1;
            }

            var9 = 5;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -28419) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 117;
            case 1 -> 240;
            case 2 -> 5;
            case 3 -> 10;
            case 4 -> 123;
            case 5 -> 70;
            case 6 -> 138;
            case 7 -> 162;
            case 8 -> 73;
            case 9 -> 103;
            case 10 -> 223;
            case 11 -> 80;
            case 12 -> 45;
            case 13 -> 34;
            case 14 -> 131;
            case 15 -> 69;
            case 16 -> 115;
            case 17 -> 12;
            case 18 -> 245;
            case 19 -> 217;
            case 20 -> 124;
            case 21 -> 159;
            case 22 -> 248;
            case 23 -> 72;
            case 24 -> 208;
            case 25 -> 65;
            case 26 -> 253;
            case 27 -> 250;
            case 28 -> 168;
            case 29 -> 212;
            case 30 -> 163;
            case 31 -> 190;
            case 32 -> 205;
            case 33 -> 81;
            case 34 -> 173;
            case 35 -> 49;
            case 36 -> 62;
            case 37 -> 244;
            case 38 -> 188;
            case 39 -> 147;
            case 40 -> 57;
            case 41 -> 148;
            case 42 -> 133;
            case 43 -> 195;
            case 44 -> 246;
            case 45 -> 216;
            case 46 -> 247;
            case 47 -> 233;
            case 48 -> 214;
            case 49 -> 50;
            case 50 -> 82;
            case 51 -> 114;
            case 52 -> 39;
            case 53 -> 182;
            case 54 -> 204;
            case 55 -> 141;
            case 56 -> 15;
            case 57 -> 169;
            case 58 -> 186;
            case 59 -> 94;
            case 60 -> 184;
            case 61 -> 7;
            case 62 -> 58;
            case 63 -> 171;
            case 64 -> 125;
            case 65 -> 97;
            case 66 -> 33;
            case 67 -> 71;
            case 68 -> 122;
            case 69 -> 38;
            case 70 -> 172;
            case 71 -> 174;
            case 72 -> 64;
            case 73 -> 85;
            case 74 -> 43;
            case 75 -> 236;
            case 76 -> 17;
            case 77 -> 105;
            case 78 -> 13;
            case 79 -> 79;
            case 80 -> 136;
            case 81 -> 48;
            case 82 -> 251;
            case 83 -> 196;
            case 84 -> 83;
            case 85 -> 56;
            case 86 -> 108;
            case 87 -> 164;
            case 88 -> 29;
            case 89 -> 158;
            case 90 -> 201;
            case 91 -> 112;
            case 92 -> 210;
            case 93 -> 30;
            case 94 -> 37;
            case 95 -> 60;
            case 96 -> 132;
            case 97 -> 63;
            case 98 -> 255;
            case 99 -> 76;
            case 100 -> 151;
            case 101 -> 28;
            case 102 -> 92;
            case 103 -> 14;
            case 104 -> 166;
            case 105 -> 3;
            case 106 -> 78;
            case 107 -> 134;
            case 108 -> 221;
            case 109 -> 2;
            case 110 -> 21;
            case 111 -> 176;
            case 112 -> 109;
            case 113 -> 142;
            case 114 -> 96;
            case 115 -> 22;
            case 116 -> 155;
            case 117 -> 181;
            case 118 -> 234;
            case 119 -> 241;
            case 120 -> 228;
            case 121 -> 119;
            case 122 -> 209;
            case 123 -> 215;
            case 124 -> 157;
            case 125 -> 86;
            case 126 -> 52;
            case 127 -> 101;
            case 128 -> 121;
            case 129 -> 161;
            case 130 -> 100;
            case 131 -> 87;
            case 132 -> 126;
            case 133 -> 135;
            case 134 -> 197;
            case 135 -> 31;
            case 136 -> 140;
            case 137 -> 183;
            case 138 -> 213;
            case 139 -> 68;
            case 140 -> 156;
            case 141 -> 20;
            case 142 -> 206;
            case 143 -> 51;
            case 144 -> 193;
            case 145 -> 152;
            case 146 -> 53;
            case 147 -> 192;
            case 148 -> 187;
            case 149 -> 0;
            case 150 -> 18;
            case 151 -> 128;
            case 152 -> 194;
            case 153 -> 107;
            case 154 -> 167;
            case 155 -> 144;
            case 156 -> 207;
            case 157 -> 102;
            case 158 -> 129;
            case 159 -> 98;
            case 160 -> 231;
            case 161 -> 27;
            case 162 -> 179;
            case 163 -> 8;
            case 164 -> 189;
            case 165 -> 89;
            case 166 -> 46;
            case 167 -> 150;
            case 168 -> 113;
            case 169 -> 203;
            case 170 -> 42;
            case 171 -> 36;
            case 172 -> 146;
            case 173 -> 40;
            case 174 -> 104;
            case 175 -> 110;
            case 176 -> 111;
            case 177 -> 90;
            case 178 -> 220;
            case 179 -> 165;
            case 180 -> 88;
            case 181 -> 41;
            case 182 -> 145;
            case 183 -> 26;
            case 184 -> 59;
            case 185 -> 154;
            case 186 -> 249;
            case 187 -> 252;
            case 188 -> 202;
            case 189 -> 219;
            case 190 -> 198;
            case 191 -> 75;
            case 192 -> 254;
            case 193 -> 55;
            case 194 -> 23;
            case 195 -> 143;
            case 196 -> 239;
            case 197 -> 137;
            case 198 -> 16;
            case 199 -> 226;
            case 200 -> 35;
            case 201 -> 118;
            case 202 -> 170;
            case 203 -> 127;
            case 204 -> 24;
            case 205 -> 139;
            case 206 -> 229;
            case 207 -> 25;
            case 208 -> 11;
            case 209 -> 91;
            case 210 -> 200;
            case 211 -> 74;
            case 212 -> 95;
            case 213 -> 230;
            case 214 -> 44;
            case 215 -> 225;
            case 216 -> 185;
            case 217 -> 130;
            case 218 -> 222;
            case 219 -> 177;
            case 220 -> 19;
            case 221 -> 54;
            case 222 -> 6;
            case 223 -> 224;
            case 224 -> 180;
            case 225 -> 4;
            case 226 -> 99;
            case 227 -> 149;
            case 228 -> 77;
            case 229 -> 160;
            case 230 -> 199;
            case 231 -> 227;
            case 232 -> 191;
            case 233 -> 93;
            case 234 -> 238;
            case 235 -> 32;
            case 236 -> 47;
            case 237 -> 218;
            case 238 -> 242;
            case 239 -> 1;
            case 240 -> 116;
            case 241 -> 237;
            case 242 -> 61;
            case 243 -> 232;
            case 244 -> 66;
            case 245 -> 106;
            case 246 -> 243;
            case 247 -> 67;
            case 248 -> 9;
            case 249 -> 175;
            case 250 -> 235;
            case 251 -> 211;
            case 252 -> 153;
            case 253 -> 84;
            case 254 -> 178;
            default -> 120;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Integer lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private Vec3 IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private Vec3 IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull BlockPos var1, @NotNull Vec3 var2, @Nullable Integer var3, @Nullable Integer var4
      ) {
         short var10001 = -6423;
         short var10002 = -12542;
         Intrinsics.checkNotNullParameter(var1, "goal");
         var10001 = -6424;
         var10002 = 11276;
         Intrinsics.checkNotNullParameter(var2, "startPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Integer d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Vec3 e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void a(@NotNull Vec3 var1) {
         short var10001 = -6420;
         short var10002 = 32566;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      @NotNull
      public final Vec3 f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void b(@NotNull Vec3 var1) {
         short var10001 = -6417;
         short var10002 = -30171;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      @NotNull
      public final BlockPos g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Integer j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull BlockPos var1, @NotNull Vec3 var2, @Nullable Integer var3, @Nullable Integer var4
      ) {
         short var10001 = -6421;
         short var10002 = 23037;
         Intrinsics.checkNotNullParameter(var1, "goal");
         var10001 = -6432;
         var10002 = -29401;
         Intrinsics.checkNotNullParameter(var2, "startPos");
         return new IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -6431;
         Integer var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Integer var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Vec3 var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -5263;
         short var10002 = -6418;
         short var10003 = -17000;
         short var10004 = -6422;
         short var10005 = 12744;
         short var10006 = -6419;
         short var10007 = 12781;
         return "WalkerInfo(goal=" + var4 + ", startPos=" + var3 + ", etherwarpSlot=" + var2 + ", aoteSlot=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int[] var1;
         int var5;
         int var7;
         label25: {
            int[] var10000 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
            int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var1 = var10000;
            var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            var5 = var2 * 31;
            Integer var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var7 = 0;
                  break label25;
               }

               var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var7 = var10001.hashCode();
         }

         int var4 = var5 + var7;
         var5 = var4 * 31;
         Integer var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               return var5 + 0;
            }

            var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return var5 + var8.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[10];
         int var3 = 0;
         String var2 = "íÕ!3\u008dÑÉá\u0004%G®\u0007\u0010Õm\u0096üãÛ\u00867¢íhBÄóÿî\u0004Qj ¢\u0007\"{z\u0007;þ<\u000b×HÒCóT:Ý>Îy\u000b«£O%\u0005÷t`4Å8\u0007=²\u0099>GÙ³";
         int var4 = "íÕ!3\u008dÑÉá\u0004%G®\u0007\u0010Õm\u0096üãÛ\u00867¢íhBÄóÿî\u0004Qj ¢\u0007\"{z\u0007;þ<\u000b×HÒCóT:Ý>Îy\u000b«£O%\u0005÷t`4Å8\u0007=²\u0099>GÙ³"
            .length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 40;
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
                        case 0 -> 20;
                        case 1 -> 75;
                        case 2 -> 79;
                        case 3 -> 69;
                        case 4 -> 84;
                        case 5 -> 94;
                        default -> 74;
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
                        b = new String[10];
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

                     var2 = "+\u0019r!l\u0018~S\u0010\u0097pH¢\u0096p4%$\u0003\u008c\u009e\u0083_ç?";
                     var4 = "+\u0019r!l\u0018~S\u0010\u0097pH¢\u0096p4%$\u0003\u008c\u009e\u0083_ç?".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 79;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -6424) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 246;
               case 1 -> 232;
               case 2 -> 101;
               case 3 -> 104;
               case 4 -> 244;
               case 5 -> 249;
               case 6 -> 22;
               case 7 -> 190;
               case 8 -> 202;
               case 9 -> 63;
               case 10 -> 84;
               case 11 -> 175;
               case 12 -> 179;
               case 13 -> 26;
               case 14 -> 50;
               case 15 -> 134;
               case 16 -> 192;
               case 17 -> 120;
               case 18 -> 180;
               case 19 -> 216;
               case 20 -> 115;
               case 21 -> 153;
               case 22 -> 51;
               case 23 -> 227;
               case 24 -> 70;
               case 25 -> 132;
               case 26 -> 28;
               case 27 -> 10;
               case 28 -> 8;
               case 29 -> 187;
               case 30 -> 20;
               case 31 -> 182;
               case 32 -> 95;
               case 33 -> 97;
               case 34 -> 157;
               case 35 -> 163;
               case 36 -> 37;
               case 37 -> 86;
               case 38 -> 181;
               case 39 -> 217;
               case 40 -> 195;
               case 41 -> 92;
               case 42 -> 184;
               case 43 -> 241;
               case 44 -> 67;
               case 45 -> 93;
               case 46 -> 33;
               case 47 -> 215;
               case 48 -> 52;
               case 49 -> 124;
               case 50 -> 44;
               case 51 -> 77;
               case 52 -> 148;
               case 53 -> 0;
               case 54 -> 177;
               case 55 -> 111;
               case 56 -> 208;
               case 57 -> 7;
               case 58 -> 55;
               case 59 -> 58;
               case 60 -> 172;
               case 61 -> 29;
               case 62 -> 16;
               case 63 -> 18;
               case 64 -> 209;
               case 65 -> 138;
               case 66 -> 206;
               case 67 -> 151;
               case 68 -> 89;
               case 69 -> 212;
               case 70 -> 198;
               case 71 -> 32;
               case 72 -> 183;
               case 73 -> 96;
               case 74 -> 25;
               case 75 -> 200;
               case 76 -> 17;
               case 77 -> 155;
               case 78 -> 158;
               case 79 -> 34;
               case 80 -> 235;
               case 81 -> 189;
               case 82 -> 225;
               case 83 -> 135;
               case 84 -> 160;
               case 85 -> 75;
               case 86 -> 228;
               case 87 -> 165;
               case 88 -> 94;
               case 89 -> 91;
               case 90 -> 162;
               case 91 -> 193;
               case 92 -> 127;
               case 93 -> 194;
               case 94 -> 226;
               case 95 -> 5;
               case 96 -> 112;
               case 97 -> 87;
               case 98 -> 83;
               case 99 -> 145;
               case 100 -> 19;
               case 101 -> 57;
               case 102 -> 253;
               case 103 -> 133;
               case 104 -> 12;
               case 105 -> 65;
               case 106 -> 167;
               case 107 -> 24;
               case 108 -> 1;
               case 109 -> 243;
               case 110 -> 30;
               case 111 -> 13;
               case 112 -> 36;
               case 113 -> 251;
               case 114 -> 42;
               case 115 -> 46;
               case 116 -> 9;
               case 117 -> 164;
               case 118 -> 66;
               case 119 -> 105;
               case 120 -> 199;
               case 121 -> 125;
               case 122 -> 237;
               case 123 -> 39;
               case 124 -> 156;
               case 125 -> 176;
               case 126 -> 231;
               case 127 -> 152;
               case 128 -> 21;
               case 129 -> 254;
               case 130 -> 224;
               case 131 -> 234;
               case 132 -> 238;
               case 133 -> 173;
               case 134 -> 247;
               case 135 -> 185;
               case 136 -> 15;
               case 137 -> 71;
               case 138 -> 74;
               case 139 -> 49;
               case 140 -> 48;
               case 141 -> 41;
               case 142 -> 197;
               case 143 -> 166;
               case 144 -> 186;
               case 145 -> 174;
               case 146 -> 107;
               case 147 -> 196;
               case 148 -> 201;
               case 149 -> 4;
               case 150 -> 126;
               case 151 -> 221;
               case 152 -> 130;
               case 153 -> 72;
               case 154 -> 6;
               case 155 -> 81;
               case 156 -> 68;
               case 157 -> 143;
               case 158 -> 27;
               case 159 -> 229;
               case 160 -> 108;
               case 161 -> 59;
               case 162 -> 103;
               case 163 -> 123;
               case 164 -> 2;
               case 165 -> 61;
               case 166 -> 144;
               case 167 -> 79;
               case 168 -> 54;
               case 169 -> 78;
               case 170 -> 121;
               case 171 -> 204;
               case 172 -> 149;
               case 173 -> 159;
               case 174 -> 171;
               case 175 -> 53;
               case 176 -> 139;
               case 177 -> 118;
               case 178 -> 109;
               case 179 -> 100;
               case 180 -> 220;
               case 181 -> 60;
               case 182 -> 113;
               case 183 -> 188;
               case 184 -> 255;
               case 185 -> 56;
               case 186 -> 213;
               case 187 -> 170;
               case 188 -> 64;
               case 189 -> 178;
               case 190 -> 76;
               case 191 -> 14;
               case 192 -> 207;
               case 193 -> 80;
               case 194 -> 31;
               case 195 -> 218;
               case 196 -> 250;
               case 197 -> 102;
               case 198 -> 88;
               case 199 -> 136;
               case 200 -> 142;
               case 201 -> 137;
               case 202 -> 110;
               case 203 -> 154;
               case 204 -> 214;
               case 205 -> 140;
               case 206 -> 116;
               case 207 -> 131;
               case 208 -> 117;
               case 209 -> 106;
               case 210 -> 69;
               case 211 -> 150;
               case 212 -> 122;
               case 213 -> 248;
               case 214 -> 11;
               case 215 -> 240;
               case 216 -> 23;
               case 217 -> 47;
               case 218 -> 236;
               case 219 -> 242;
               case 220 -> 146;
               case 221 -> 147;
               case 222 -> 230;
               case 223 -> 168;
               case 224 -> 191;
               case 225 -> 205;
               case 226 -> 141;
               case 227 -> 210;
               case 228 -> 252;
               case 229 -> 128;
               case 230 -> 82;
               case 231 -> 222;
               case 232 -> 43;
               case 233 -> 3;
               case 234 -> 219;
               case 235 -> 38;
               case 236 -> 245;
               case 237 -> 73;
               case 238 -> 98;
               case 239 -> 62;
               case 240 -> 129;
               case 241 -> 119;
               case 242 -> 239;
               case 243 -> 233;
               case 244 -> 40;
               case 245 -> 203;
               case 246 -> 90;
               case 247 -> 169;
               case 248 -> 223;
               case 249 -> 99;
               case 250 -> 35;
               case 251 -> 114;
               case 252 -> 211;
               case 253 -> 161;
               case 254 -> 85;
               default -> 45;
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

   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, net.minecraft.core.BlockPos var2, net.minecraft.world.phys.Vec3 var3, Integer var4, Integer var5, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var6 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var6 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var6 & 8) != 0) {
         var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      return var1.a(var2, var3, var4, var5);
   }

   }
   static boolean a(IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var0, int var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return var0.a(var1, var2);
   }

   public static boolean a(IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var0, Object var1, Vec3 var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return var0.a(var1, var2, var3);
   }

}
