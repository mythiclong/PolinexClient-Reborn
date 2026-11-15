package me.octo.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.PalettedContainer;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import net.minecraft.core.BlockPos;
import java.util.Collection;
import java.util.HashMap;
import me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
import me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
import java.util.Map;
import kotlin.ranges.RangesKt;

public final class llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final ConcurrentHashMap<Long, Integer> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final KeySetView<Long, Boolean> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final KeySetView<Long, Boolean> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private volatile boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private volatile boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private long IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private volatile AABB[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private volatile int[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private AABB[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private int[] llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @JvmField
   @NotNull
   public static llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private static int[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static String[] f;
   private static String[] g;

   private llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII() {
      short var10001 = -1660;
      short var10002 = -18679;
      var10002 = -1612;
      short var10003 = 17191;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = -1640;
      short var10005 = -13828;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.a(),
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.b(),
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.c(),
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.d(),
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.e(),
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.f(),
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.g(),
         IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h()
      };
      super("Gemstone ESP", "Scans and highlights gemstone blocks", var3, "Visuals", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ConcurrentHashMap<>();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = ConcurrentHashMap.newKeySet();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = ConcurrentHashMap.newKeySet();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new AABB[0];
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new int[0];
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new AABB[256];
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new int[256];
   }

   private final void a(int param1) {
      String var2 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var2 == null && param1 >= this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.length) {
         return;
      }
      int var3 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.length;
      while (var3 < param1) {
         var3 *= 2;
         if (var2 != null) {
            return;
         }
      }
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new net.minecraft.world.phys.AABB[var3];
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new int[var3];
   }

   public void aB() {
      super.aB();
      this.ag();
   }

   public void aC() {
      super.aC();
      this.ag();
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -1635;
      short var10002 = 26652;
      Intrinsics.checkNotNullParameter(var1, "event");
      this.ag();
   }

   private final void ag() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new AABB[0];
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new int[0];
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -1639
      // 007: sipush -21767
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 2
      // 012: ifnonnull 02f
      // 015: aload 0
      // 016: invokevirtual me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 019: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 01c: dup
      // 01d: ifnonnull 030
      // 020: goto 027
      // 023: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 026: athrow
      // 027: pop
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02e: athrow
      // 02f: return
      // 030: astore 3
      // 031: aload 2
      // 032: ifnonnull 04f
      // 035: aload 0
      // 036: invokevirtual me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 039: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 03c: dup
      // 03d: ifnonnull 050
      // 040: goto 047
      // 043: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 046: athrow
      // 047: pop
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04e: athrow
      // 04f: return
      // 050: astore 4
      // 052: aload 0
      // 053: aload 4
      // 055: invokespecial me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lnet/minecraft/client/multiplayer/ClientLevel;)V
      // 058: aload 0
      // 059: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Z
      // 05c: aload 2
      // 05d: ifnonnull 071
      // 060: ifeq 06b
      // 063: goto 06a
      // 066: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 069: athrow
      // 06a: return
      // 06b: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.a ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 06e: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 071: istore 5
      // 073: iload 5
      // 075: aload 0
      // 076: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 079: aload 2
      // 07a: ifnonnull 0aa
      // 07d: if_icmpeq 0a2
      // 080: goto 087
      // 083: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 086: athrow
      // 087: aload 0
      // 088: iload 5
      // 08a: putfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl I
      // 08d: aload 0
      // 08e: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 091: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.clear ()V
      // 094: aload 0
      // 095: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 098: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.clear ()V
      // 09b: goto 0a2
      // 09e: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a1: athrow
      // 0a2: aload 3
      // 0a3: invokevirtual net/minecraft/client/player/LocalPlayer.blockPosition ()Lnet/minecraft/core/BlockPos;
      // 0a6: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 0a9: bipush 4
      // 0aa: ishr
      // 0ab: istore 6
      // 0ad: aload 3
      // 0ae: invokevirtual net/minecraft/client/player/LocalPlayer.blockPosition ()Lnet/minecraft/core/BlockPos;
      // 0b1: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 0b4: bipush 4
      // 0b5: ishr
      // 0b6: istore 7
      // 0b8: iload 6
      // 0ba: iload 5
      // 0bc: isub
      // 0bd: istore 8
      // 0bf: iload 6
      // 0c1: iload 5
      // 0c3: iadd
      // 0c4: istore 9
      // 0c6: iload 7
      // 0c8: iload 5
      // 0ca: isub
      // 0cb: istore 10
      // 0cd: iload 7
      // 0cf: iload 5
      // 0d1: iadd
      // 0d2: istore 11
      // 0d4: new java/util/ArrayList
      // 0d7: dup
      // 0d8: invokespecial java/util/ArrayList.<init> ()V
      // 0db: astore 12
      // 0dd: new java/util/HashSet
      // 0e0: dup
      // 0e1: invokespecial java/util/HashSet.<init> ()V
      // 0e4: astore 13
      // 0e6: iload 8
      // 0e8: istore 14
      // 0ea: iload 14
      // 0ec: aload 2
      // 0ed: ifnonnull 1d2
      // 0f0: iload 9
      // 0f2: if_icmpgt 1cd
      // 0f5: goto 0fc
      // 0f8: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fb: athrow
      // 0fc: iload 10
      // 0fe: istore 15
      // 100: iload 15
      // 102: iload 11
      // 104: if_icmpgt 1ad
      // 107: iload 14
      // 109: iload 15
      // 10b: invokestatic net/minecraft/world/level/ChunkPos.pack (II)J
      // 10e: lstore 16
      // 110: aload 13
      // 112: lload 16
      // 114: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 117: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 11a: pop
      // 11b: aload 0
      // 11c: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 11f: lload 16
      // 121: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 124: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.contains (Ljava/lang/Object;)Z
      // 127: aload 2
      // 128: ifnonnull 1af
      // 12b: ifeq 15a
      // 12e: aload 0
      // 12f: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 132: lload 16
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.contains (Ljava/lang/Object;)Z
      // 13a: aload 2
      // 13b: ifnonnull 16d
      // 13e: goto 145
      // 141: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 144: athrow
      // 145: aload 2
      // 146: ifnonnull 18f
      // 149: goto 150
      // 14c: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14f: athrow
      // 150: ifeq 18d
      // 153: goto 15a
      // 156: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 159: athrow
      // 15a: aload 4
      // 15c: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getChunkSource ()Lnet/minecraft/client/multiplayer/ClientChunkCache;
      // 15f: iload 14
      // 161: iload 15
      // 163: invokevirtual net/minecraft/client/multiplayer/ClientChunkCache.hasChunk (II)Z
      // 166: goto 16d
      // 169: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16c: athrow
      // 16d: aload 2
      // 16e: ifnonnull 18f
      // 171: ifeq 18d
      // 174: goto 17b
      // 177: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17a: athrow
      // 17b: aload 12
      // 17d: lload 16
      // 17f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 182: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 185: pop
      // 186: goto 18d
      // 189: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18c: athrow
      // 18d: iload 15
      // 18f: iload 11
      // 191: aload 2
      // 192: ifnonnull 1bc
      // 195: if_icmpeq 1ad
      // 198: goto 19f
      // 19b: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 19e: athrow
      // 19f: iinc 15 1
      // 1a2: aload 2
      // 1a3: ifnull 107
      // 1a6: goto 1ad
      // 1a9: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ac: athrow
      // 1ad: iload 14
      // 1af: aload 2
      // 1b0: ifnonnull 1d2
      // 1b3: iload 9
      // 1b5: goto 1bc
      // 1b8: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1bb: athrow
      // 1bc: if_icmpeq 1cd
      // 1bf: iinc 14 1
      // 1c2: aload 2
      // 1c3: ifnull 0fc
      // 1c6: goto 1cd
      // 1c9: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1cc: athrow
      // 1cd: aload 12
      // 1cf: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 1d2: aload 2
      // 1d3: ifnonnull 2b3
      // 1d6: ifeq 29f
      // 1d9: goto 1e0
      // 1dc: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 1e4: dup
      // 1e5: sipush -1610
      // 1e8: sipush -11882
      // 1eb: pop2
      // 1ec: ldc_w "scannedChunks"
      // 1ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1f2: checkcast java/lang/Iterable
      // 1f5: astore 15
      // 1f7: bipush 0
      // 1f8: istore 16
      // 1fa: aload 15
      // 1fc: astore 17
      // 1fe: new java/util/ArrayList
      // 201: dup
      // 202: invokespecial java/util/ArrayList.<init> ()V
      // 205: checkcast java/util/Collection
      // 208: astore 18
      // 20a: bipush 0
      // 20b: istore 19
      // 20d: aload 17
      // 20f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 214: astore 20
      // 216: aload 20
      // 218: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21d: ifeq 269
      // 220: aload 20
      // 222: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 227: astore 21
      // 229: aload 21
      // 22b: checkcast java/lang/Long
      // 22e: astore 22
      // 230: bipush 0
      // 231: istore 23
      // 233: aload 13
      // 235: aload 2
      // 236: ifnonnull 26b
      // 239: aload 22
      // 23b: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 23e: aload 2
      // 23f: ifnonnull 254
      // 242: goto 249
      // 245: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 248: athrow
      // 249: ifne 257
      // 24c: goto 253
      // 24f: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 252: athrow
      // 253: bipush 1
      // 254: goto 258
      // 257: bipush 0
      // 258: ifeq 216
      // 25b: aload 18
      // 25d: aload 21
      // 25f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 264: pop
      // 265: aload 2
      // 266: ifnull 216
      // 269: aload 18
      // 26b: checkcast java/util/List
      // 26e: nop
      // 26f: astore 14
      // 271: aload 14
      // 273: checkcast java/util/Collection
      // 276: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 27b: aload 2
      // 27c: ifnonnull 28a
      // 27f: ifne 28d
      // 282: goto 289
      // 285: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 288: athrow
      // 289: bipush 1
      // 28a: goto 28e
      // 28d: bipush 0
      // 28e: ifeq 29e
      // 291: aload 0
      // 292: aload 14
      // 294: invokespecial me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Ljava/util/List;)V
      // 297: goto 29e
      // 29a: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 29d: athrow
      // 29e: return
      // 29f: aload 0
      // 2a0: bipush 1
      // 2a1: putfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Z
      // 2a4: aload 3
      // 2a5: invokevirtual net/minecraft/client/player/LocalPlayer.blockPosition ()Lnet/minecraft/core/BlockPos;
      // 2a8: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 2ab: istore 14
      // 2ad: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.b ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 2b0: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 2b3: istore 15
      // 2b5: iload 5
      // 2b7: bipush 16
      // 2b9: imul
      // 2ba: istore 16
      // 2bc: getstatic me/octo/client/utils/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
      // 2bf: iload 14
      // 2c1: iload 16
      // 2c3: aload 12
      // 2c5: aload 4
      // 2c7: aload 0
      // 2c8: iload 15
      // 2ca: aload 13
      // 2cc: invokedynamic invoke (IILjava/util/ArrayList;Lnet/minecraft/client/multiplayer/ClientLevel;Lme/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII;ZLjava/util/HashSet;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (IILjava/util/ArrayList;Lnet/minecraft/client/multiplayer/ClientLevel;Lme/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII;ZLjava/util/HashSet;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 2d1: invokevirtual me/octo/client/utils/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.a (Lkotlin/jvm/functions/Function0;)Ljava/util/concurrent/Future;
      // 2d4: pop
      // 2d5: return
   }

   private final void a(ClientLevel param1) {
      if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.isEmpty()) {
         return;
      }

      boolean var3 = me.octo.client.IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.b().ae();
      boolean var4 = false;
      net.minecraft.core.BlockPos.MutableBlockPos var5 = new net.minecraft.core.BlockPos.MutableBlockPos();
      java.util.Iterator var6 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.entrySet().iterator();
      while (var6.hasNext()) {
         java.util.Map.Entry var7 = (java.util.Map.Entry) var6.next();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var7, "next(...)");
         long var8 = ((Number) var7.getKey()).longValue();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var7.getKey(), "<get-key>(...)");
         var5.set(net.minecraft.core.BlockPos.getX(var8), net.minecraft.core.BlockPos.getY(var8), net.minecraft.core.BlockPos.getZ(var8));
         net.minecraft.world.level.block.state.BlockState var10 = param1.getBlockState((net.minecraft.core.BlockPos) var5);
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10, "getBlockState(...)");
         int var11 = this.b(var10, var3);
         if (var11 < 0) {
            var6.remove();
            var4 = true;
         } else if (var11 != ((Integer) var7.getValue()).intValue()) {
            var7.setValue(Integer.valueOf(var11));
            var4 = true;
         }
      }

      if (var4) {
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = true;
      }
   }

   private final void a(int param1, int param2) {
      int var4 = param1 << 4;
      int var5 = var4 + 15;
      int var6 = param2 << 4;
      int var7 = var6 + 15;
      java.util.Iterator var8 = ((java.util.concurrent.ConcurrentHashMap.KeySetView) this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.keySet()).iterator();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var8, "iterator(...)");
      while (var8.hasNext()) {
         Long var9 = (Long) var8.next();
         kotlin.jvm.internal.Intrinsics.checkNotNull(var9);
         int var10 = net.minecraft.core.BlockPos.getX(var9.longValue());
         int var11 = net.minecraft.core.BlockPos.getZ(var9.longValue());
         if (var4 <= var10 && var10 <= var5 && var6 <= var11 && var11 <= var7) {
            var8.remove();
         }
      }
   }

   private final void a(List<Long> var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Iterator var3 = var1.iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         long var4 = ((Number)var3.next()).longValue();
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.remove(var4);
         this.a(ChunkPos.getX(var4), ChunkPos.getZ(var4));
         if (var2 != null) {
            break;
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      net.minecraft.core.BlockPos var3 = param1.k();
      net.minecraft.world.level.block.state.BlockState var4 = param1.m();
      boolean var5 = me.octo.client.IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.b().ae();
      long var6 = var3.asLong();
      int var8 = this.b(var4, var5);
      if (var8 >= 0) {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var6, var8);
      } else {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.remove(var6);
      }

      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.add(net.minecraft.world.level.ChunkPos.pack(var3.getX() >> 4, var3.getZ() >> 4));
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = true;
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -1639
      // 007: sipush -21767
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 0
      // 012: invokevirtual me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 015: aload 2
      // 016: ifnonnull 03c
      // 019: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 01c: ifnull 042
      // 01f: goto 026
      // 022: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 025: athrow
      // 026: aload 0
      // 027: aload 2
      // 028: ifnonnull 048
      // 02b: goto 032
      // 02e: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 031: athrow
      // 032: invokevirtual me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 035: goto 03c
      // 038: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03b: athrow
      // 03c: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 03f: ifnonnull 047
      // 042: return
      // 043: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 046: athrow
      // 047: aload 0
      // 048: aload 2
      // 049: ifnonnull 0a4
      // 04c: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Z
      // 04f: ifeq 0a3
      // 052: goto 059
      // 055: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 058: athrow
      // 059: aload 0
      // 05a: aload 2
      // 05b: ifnonnull 0a4
      // 05e: goto 065
      // 061: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 064: athrow
      // 065: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Z
      // 068: ifne 0a3
      // 06b: goto 072
      // 06e: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 071: athrow
      // 072: invokestatic java/lang/System.currentTimeMillis ()J
      // 075: lstore 3
      // 076: aload 2
      // 077: ifnonnull 09f
      // 07a: lload 3
      // 07b: aload 0
      // 07c: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll J
      // 07f: lsub
      // 080: ldc2_w 500
      // 083: lcmp
      // 084: ifle 0a3
      // 087: goto 08e
      // 08a: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08d: athrow
      // 08e: aload 0
      // 08f: bipush 0
      // 090: putfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Z
      // 093: aload 0
      // 094: lload 3
      // 095: putfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll J
      // 098: goto 09f
      // 09b: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: invokespecial me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.ah ()V
      // 0a3: aload 0
      // 0a4: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI [Lnet/minecraft/world/phys/AABB;
      // 0a7: astore 3
      // 0a8: aload 0
      // 0a9: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll [I
      // 0ac: astore 4
      // 0ae: aload 3
      // 0af: arraylength
      // 0b0: aload 2
      // 0b1: ifnonnull 0bf
      // 0b4: ifne 0c2
      // 0b7: goto 0be
      // 0ba: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bd: athrow
      // 0be: bipush 1
      // 0bf: goto 0c3
      // 0c2: bipush 0
      // 0c3: ifeq 0c7
      // 0c6: return
      // 0c7: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.c ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 0ca: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.B ()Ljava/lang/String;
      // 0cd: astore 5
      // 0cf: aload 5
      // 0d1: sipush -1653
      // 0d4: sipush 3099
      // 0d7: pop2
      // 0d8: ldc_w "Fill"
      // 0db: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0de: aload 2
      // 0df: ifnonnull 111
      // 0e2: ifne 110
      // 0e5: goto 0ec
      // 0e8: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0eb: athrow
      // 0ec: aload 5
      // 0ee: sipush -1656
      // 0f1: sipush -31935
      // 0f4: pop2
      // 0f5: ldc_w "Fill + Outline"
      // 0f8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0fb: aload 2
      // 0fc: ifnonnull 111
      // 0ff: goto 106
      // 102: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 105: athrow
      // 106: ifeq 114
      // 109: goto 110
      // 10c: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 115
      // 114: bipush 0
      // 115: istore 6
      // 117: aload 5
      // 119: sipush -1649
      // 11c: sipush 20685
      // 11f: pop2
      // 120: ldc_w "Outline"
      // 123: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 126: aload 2
      // 127: ifnonnull 159
      // 12a: ifne 158
      // 12d: goto 134
      // 130: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 133: athrow
      // 134: aload 5
      // 136: sipush -1636
      // 139: sipush 30822
      // 13c: pop2
      // 13d: ldc_w "Fill + Outline"
      // 140: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 143: aload 2
      // 144: ifnonnull 159
      // 147: goto 14e
      // 14a: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14d: athrow
      // 14e: ifeq 15c
      // 151: goto 158
      // 154: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 157: athrow
      // 158: bipush 1
      // 159: goto 15d
      // 15c: bipush 0
      // 15d: istore 7
      // 15f: aload 5
      // 161: sipush -1608
      // 164: sipush 14589
      // 167: pop2
      // 168: ldc_w "Chams"
      // 16b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 16e: istore 8
      // 170: aload 2
      // 171: ifnonnull 18e
      // 174: aload 0
      // 175: invokevirtual me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 178: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 17b: dup
      // 17c: ifnonnull 18f
      // 17f: goto 186
      // 182: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 185: athrow
      // 186: pop
      // 187: goto 18e
      // 18a: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18d: athrow
      // 18e: return
      // 18f: astore 9
      // 191: aload 9
      // 193: invokevirtual net/minecraft/client/player/LocalPlayer.getX ()D
      // 196: dstore 10
      // 198: aload 9
      // 19a: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 19d: dstore 12
      // 19f: aload 9
      // 1a1: invokevirtual net/minecraft/client/player/LocalPlayer.getZ ()D
      // 1a4: dstore 14
      // 1a6: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.a ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 1a9: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 1ac: i2d
      // 1ad: ldc2_w 16.0
      // 1b0: dmul
      // 1b1: dstore 16
      // 1b3: dload 16
      // 1b5: dload 16
      // 1b7: dmul
      // 1b8: dstore 18
      // 1ba: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.d ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1bd: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1c0: ldc_w 255.0
      // 1c3: fmul
      // 1c4: f2i
      // 1c5: bipush 0
      // 1c6: sipush 255
      // 1c9: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 1cc: istore 20
      // 1ce: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.f ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1d1: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1d4: ldc_w 255.0
      // 1d7: fmul
      // 1d8: f2i
      // 1d9: bipush 0
      // 1da: sipush 255
      // 1dd: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 1e0: istore 21
      // 1e2: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.e ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1e5: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1e8: fstore 22
      // 1ea: invokestatic me/octo/client/IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.g ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1ed: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1f0: ldc_w 255.0
      // 1f3: fmul
      // 1f4: f2i
      // 1f5: bipush 0
      // 1f6: sipush 255
      // 1f9: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 1fc: istore 23
      // 1fe: aload 0
      // 1ff: aload 3
      // 200: arraylength
      // 201: invokespecial me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (I)V
      // 204: new kotlin/jvm/internal/Ref$IntRef
      // 207: dup
      // 208: invokespecial kotlin/jvm/internal/Ref$IntRef.<init> ()V
      // 20b: astore 24
      // 20d: aload 0
      // 20e: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll [Lnet/minecraft/world/phys/AABB;
      // 211: astore 25
      // 213: aload 0
      // 214: getfield me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl [I
      // 217: astore 26
      // 219: bipush 0
      // 21a: istore 27
      // 21c: aload 3
      // 21d: arraylength
      // 21e: istore 28
      // 220: iload 27
      // 222: iload 28
      // 224: if_icmpge 2e5
      // 227: aload 3
      // 228: iload 27
      // 22a: aaload
      // 22b: astore 29
      // 22d: aload 29
      // 22f: getfield net/minecraft/world/phys/AABB.minX D
      // 232: aload 29
      // 234: getfield net/minecraft/world/phys/AABB.maxX D
      // 237: dadd
      // 238: ldc2_w 0.5
      // 23b: dmul
      // 23c: dload 10
      // 23e: dsub
      // 23f: dstore 30
      // 241: aload 29
      // 243: getfield net/minecraft/world/phys/AABB.minY D
      // 246: aload 29
      // 248: getfield net/minecraft/world/phys/AABB.maxY D
      // 24b: dadd
      // 24c: ldc2_w 0.5
      // 24f: dmul
      // 250: dload 12
      // 252: dsub
      // 253: dstore 32
      // 255: aload 29
      // 257: getfield net/minecraft/world/phys/AABB.minZ D
      // 25a: aload 29
      // 25c: getfield net/minecraft/world/phys/AABB.maxZ D
      // 25f: dadd
      // 260: ldc2_w 0.5
      // 263: dmul
      // 264: dload 14
      // 266: dsub
      // 267: dstore 34
      // 269: aload 2
      // 26a: ifnonnull 2e1
      // 26d: dload 30
      // 26f: dload 30
      // 271: dmul
      // 272: dload 32
      // 274: dload 32
      // 276: dmul
      // 277: dadd
      // 278: dload 34
      // 27a: dload 34
      // 27c: dmul
      // 27d: dadd
      // 27e: dload 18
      // 280: dcmpl
      // 281: aload 2
      // 282: ifnonnull 2ea
      // 285: goto 28c
      // 288: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28b: athrow
      // 28c: ifgt 2de
      // 28f: goto 296
      // 292: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 295: athrow
      // 296: aload 29
      // 298: invokestatic me/octo/client/utils/llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.a (Lnet/minecraft/world/phys/AABB;)Z
      // 29b: aload 2
      // 29c: ifnonnull 2d3
      // 29f: goto 2a6
      // 2a2: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a5: athrow
      // 2a6: ifeq 2de
      // 2a9: goto 2b0
      // 2ac: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2af: athrow
      // 2b0: aload 25
      // 2b2: aload 24
      // 2b4: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2b7: aload 29
      // 2b9: aastore
      // 2ba: aload 26
      // 2bc: aload 24
      // 2be: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2c1: aload 4
      // 2c3: iload 27
      // 2c5: iaload
      // 2c6: iastore
      // 2c7: aload 24
      // 2c9: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2cc: goto 2d3
      // 2cf: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d2: athrow
      // 2d3: istore 36
      // 2d5: aload 24
      // 2d7: iload 36
      // 2d9: bipush 1
      // 2da: iadd
      // 2db: putfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2de: iinc 27 1
      // 2e1: aload 2
      // 2e2: ifnull 220
      // 2e5: aload 24
      // 2e7: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2ea: aload 2
      // 2eb: ifnonnull 2fb
      // 2ee: ifne 2f9
      // 2f1: goto 2f8
      // 2f4: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f7: athrow
      // 2f8: return
      // 2f9: iload 6
      // 2fb: aload 2
      // 2fc: ifnonnull 36f
      // 2ff: ifeq 36d
      // 302: goto 309
      // 305: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 308: athrow
      // 309: iload 20
      // 30b: aload 2
      // 30c: ifnonnull 36f
      // 30f: goto 316
      // 312: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 315: athrow
      // 316: ifle 36d
      // 319: goto 320
      // 31c: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 31f: athrow
      // 320: bipush 0
      // 321: istore 28
      // 323: aload 24
      // 325: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 328: istore 29
      // 32a: iload 29
      // 32c: newarray 10
      // 32e: astore 30
      // 330: iload 28
      // 332: iload 29
      // 334: if_icmpge 35d
      // 337: iload 28
      // 339: istore 31
      // 33b: aload 30
      // 33d: iload 31
      // 33f: iload 20
      // 341: bipush 24
      // 343: ishl
      // 344: aload 26
      // 346: iload 31
      // 348: iaload
      // 349: ior
      // 34a: iastore
      // 34b: iinc 28 1
      // 34e: aload 2
      // 34f: ifnonnull 36d
      // 352: aload 2
      // 353: ifnull 330
      // 356: goto 35d
      // 359: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 35c: athrow
      // 35d: aload 30
      // 35f: astore 27
      // 361: aload 25
      // 363: aload 27
      // 365: aload 24
      // 367: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 36a: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a ([Lnet/minecraft/world/phys/AABB;[II)V
      // 36d: iload 7
      // 36f: aload 2
      // 370: ifnonnull 3b6
      // 373: ifeq 3b4
      // 376: goto 37d
      // 379: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 37c: athrow
      // 37d: iload 21
      // 37f: aload 2
      // 380: ifnonnull 3b6
      // 383: goto 38a
      // 386: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 389: athrow
      // 38a: ifle 3b4
      // 38d: goto 394
      // 390: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 393: athrow
      // 394: fload 22
      // 396: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (F)V
      // 399: aload 1
      // 39a: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 39d: aload 24
      // 39f: aload 25
      // 3a1: iload 21
      // 3a3: aload 26
      // 3a5: invokedynamic invoke (Lkotlin/jvm/internal/Ref$IntRef;[Lnet/minecraft/world/phys/AABB;I[I)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/jvm/internal/Ref$IntRef;[Lnet/minecraft/world/phys/AABB;I[ILme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit;, (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit; ]
      // 3aa: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Lcom/mojang/blaze3d/vertex/PoseStack;Lkotlin/jvm/functions/Function1;)V
      // 3ad: goto 3b4
      // 3b0: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b3: athrow
      // 3b4: iload 8
      // 3b6: aload 2
      // 3b7: ifnonnull 3c6
      // 3ba: ifeq 753
      // 3bd: goto 3c4
      // 3c0: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3c3: athrow
      // 3c4: iload 23
      // 3c6: ifle 753
      // 3c9: aload 1
      // 3ca: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 3cd: astore 27
      // 3cf: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 3d2: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 3d5: dup
      // 3d6: sipush -1657
      // 3d9: sipush 3639
      // 3dc: pop2
      // 3dd: ldc_w "getMainRenderTarget(...)"
      // 3e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3e3: astore 28
      // 3e5: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 3e8: astore 29
      // 3ea: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 3ed: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 3f0: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 3f3: dup
      // 3f4: sipush -1606
      // 3f7: sipush -24875
      // 3fa: pop2
      // 3fb: ldc_w "getMainCamera(...)"
      // 3fe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 401: astore 30
      // 403: bipush 0
      // 404: istore 31
      // 406: sipush 2848
      // 409: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 40c: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 40f: aload 28
      // 411: aload 27
      // 413: aload 30
      // 415: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 418: astore 32
      // 41a: nop
      // 41b: aload 29
      // 41d: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 420: swap
      // 421: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 424: iaload
      // 425: tableswitch 771 1 2 23 397
      // 43c: aload 32
      // 43e: astore 33
      // 440: bipush 0
      // 441: istore 34
      // 443: aload 33
      // 445: astore 35
      // 447: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 44a: astore 36
      // 44c: bipush 0
      // 44d: istore 37
      // 44f: aload 35
      // 451: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 454: astore 38
      // 456: aload 35
      // 458: aload 36
      // 45a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 45d: nop
      // 45e: aload 35
      // 460: astore 39
      // 462: bipush 0
      // 463: istore 40
      // 465: aload 39
      // 467: astore 41
      // 469: bipush 0
      // 46a: istore 42
      // 46c: aload 41
      // 46e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 471: astore 43
      // 473: bipush 0
      // 474: istore 44
      // 476: aload 43
      // 478: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 47b: nop
      // 47c: aload 43
      // 47e: astore 45
      // 480: bipush 0
      // 481: istore 46
      // 483: aload 41
      // 485: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 488: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 48b: dup
      // 48c: sipush -1601
      // 48f: sipush -8476
      // 492: pop2
      // 493: ldc_w "position(...)"
      // 496: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 499: astore 47
      // 49b: aload 45
      // 49d: aload 47
      // 49f: getfield net/minecraft/world/phys/Vec3.x D
      // 4a2: dneg
      // 4a3: aload 47
      // 4a5: getfield net/minecraft/world/phys/Vec3.y D
      // 4a8: dneg
      // 4a9: aload 47
      // 4ab: getfield net/minecraft/world/phys/Vec3.z D
      // 4ae: dneg
      // 4af: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 4b2: aload 41
      // 4b4: astore 48
      // 4b6: bipush 0
      // 4b7: istore 49
      // 4b9: aload 48
      // 4bb: astore 50
      // 4bd: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 4c0: astore 51
      // 4c2: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 4c5: astore 52
      // 4c7: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 4ca: astore 53
      // 4cc: bipush 0
      // 4cd: istore 54
      // 4cf: aload 50
      // 4d1: aload 51
      // 4d3: aload 52
      // 4d5: aload 53
      // 4d7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 4da: astore 55
      // 4dc: nop
      // 4dd: aload 55
      // 4df: aload 50
      // 4e1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 4e4: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 4e7: dup
      // 4e8: sipush -1603
      // 4eb: sipush 20110
      // 4ee: pop2
      // 4ef: ldc_w "last(...)"
      // 4f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4f5: astore 56
      // 4f7: astore 57
      // 4f9: bipush 0
      // 4fa: istore 58
      // 4fc: aload 56
      // 4fe: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 501: dup
      // 502: sipush -1655
      // 505: sipush -22593
      // 508: pop2
      // 509: ldc_w "pose(...)"
      // 50c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 50f: astore 59
      // 511: bipush 0
      // 512: istore 60
      // 514: aload 24
      // 516: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 519: istore 61
      // 51b: iload 60
      // 51d: iload 61
      // 51f: if_icmpge 55d
      // 522: aload 57
      // 524: aload 59
      // 526: checkcast org/joml/Matrix4fc
      // 529: aload 25
      // 52b: iload 60
      // 52d: aaload
      // 52e: dup
      // 52f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 532: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 535: dup
      // 536: iload 23
      // 538: bipush 24
      // 53a: ishl
      // 53b: aload 26
      // 53d: iload 60
      // 53f: iaload
      // 540: ior
      // 541: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 544: bipush 0
      // 545: bipush 8
      // 547: aconst_null
      // 548: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 54b: iinc 60 1
      // 54e: aload 2
      // 54f: ifnonnull 569
      // 552: aload 2
      // 553: ifnull 51b
      // 556: goto 55d
      // 559: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 55c: athrow
      // 55d: nop
      // 55e: nop
      // 55f: aload 50
      // 561: aload 55
      // 563: bipush 0
      // 564: bipush 2
      // 565: aconst_null
      // 566: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 569: goto 57b
      // 56c: astore 62
      // 56e: aload 50
      // 570: aload 55
      // 572: bipush 0
      // 573: bipush 2
      // 574: aconst_null
      // 575: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 578: aload 62
      // 57a: athrow
      // 57b: nop
      // 57c: nop
      // 57d: nop
      // 57e: nop
      // 57f: nop
      // 580: aload 43
      // 582: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 585: goto 592
      // 588: astore 63
      // 58a: aload 43
      // 58c: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 58f: aload 63
      // 591: athrow
      // 592: nop
      // 593: nop
      // 594: nop
      // 595: nop
      // 596: aload 35
      // 598: aload 38
      // 59a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 59d: goto 5ac
      // 5a0: astore 64
      // 5a2: aload 35
      // 5a4: aload 38
      // 5a6: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 5a9: aload 64
      // 5ab: athrow
      // 5ac: nop
      // 5ad: nop
      // 5ae: aload 2
      // 5af: ifnull 734
      // 5b2: aload 32
      // 5b4: astore 33
      // 5b6: bipush 0
      // 5b7: istore 34
      // 5b9: aload 33
      // 5bb: astore 35
      // 5bd: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 5c0: astore 36
      // 5c2: bipush 0
      // 5c3: istore 37
      // 5c5: aload 35
      // 5c7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 5ca: astore 38
      // 5cc: aload 35
      // 5ce: aload 36
      // 5d0: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 5d3: nop
      // 5d4: aload 35
      // 5d6: astore 39
      // 5d8: bipush 0
      // 5d9: istore 40
      // 5db: aload 39
      // 5dd: astore 41
      // 5df: bipush 0
      // 5e0: istore 42
      // 5e2: aload 41
      // 5e4: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 5e7: astore 43
      // 5e9: bipush 0
      // 5ea: istore 44
      // 5ec: aload 43
      // 5ee: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 5f1: nop
      // 5f2: aload 43
      // 5f4: astore 45
      // 5f6: bipush 0
      // 5f7: istore 46
      // 5f9: aload 41
      // 5fb: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 5fe: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 601: dup
      // 602: sipush -1602
      // 605: sipush 12453
      // 608: pop2
      // 609: ldc_w "position(...)"
      // 60c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 60f: astore 47
      // 611: aload 45
      // 613: aload 47
      // 615: getfield net/minecraft/world/phys/Vec3.x D
      // 618: dneg
      // 619: aload 47
      // 61b: getfield net/minecraft/world/phys/Vec3.y D
      // 61e: dneg
      // 61f: aload 47
      // 621: getfield net/minecraft/world/phys/Vec3.z D
      // 624: dneg
      // 625: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 628: aload 41
      // 62a: astore 48
      // 62c: bipush 0
      // 62d: istore 49
      // 62f: aload 48
      // 631: astore 50
      // 633: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 636: astore 51
      // 638: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 63b: astore 52
      // 63d: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 640: astore 53
      // 642: bipush 0
      // 643: istore 54
      // 645: aload 50
      // 647: aload 51
      // 649: aload 52
      // 64b: aload 53
      // 64d: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 650: astore 55
      // 652: nop
      // 653: aload 55
      // 655: aload 50
      // 657: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 65a: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 65d: dup
      // 65e: sipush -1641
      // 661: sipush -27155
      // 664: pop2
      // 665: ldc_w "last(...)"
      // 668: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 66b: astore 56
      // 66d: astore 57
      // 66f: bipush 0
      // 670: istore 58
      // 672: aload 56
      // 674: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 677: dup
      // 678: sipush -1638
      // 67b: sipush 28257
      // 67e: pop2
      // 67f: ldc_w "pose(...)"
      // 682: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 685: astore 59
      // 687: bipush 0
      // 688: istore 60
      // 68a: aload 24
      // 68c: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 68f: istore 61
      // 691: iload 60
      // 693: iload 61
      // 695: if_icmpge 6d3
      // 698: aload 57
      // 69a: aload 59
      // 69c: checkcast org/joml/Matrix4fc
      // 69f: aload 25
      // 6a1: iload 60
      // 6a3: aaload
      // 6a4: dup
      // 6a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 6a8: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 6ab: dup
      // 6ac: iload 23
      // 6ae: bipush 24
      // 6b0: ishl
      // 6b1: aload 26
      // 6b3: iload 60
      // 6b5: iaload
      // 6b6: ior
      // 6b7: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 6ba: bipush 0
      // 6bb: bipush 8
      // 6bd: aconst_null
      // 6be: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 6c1: iinc 60 1
      // 6c4: aload 2
      // 6c5: ifnonnull 6df
      // 6c8: aload 2
      // 6c9: ifnull 691
      // 6cc: goto 6d3
      // 6cf: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6d2: athrow
      // 6d3: nop
      // 6d4: nop
      // 6d5: aload 50
      // 6d7: aload 55
      // 6d9: bipush 0
      // 6da: bipush 2
      // 6db: aconst_null
      // 6dc: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 6df: goto 6f1
      // 6e2: astore 62
      // 6e4: aload 50
      // 6e6: aload 55
      // 6e8: bipush 0
      // 6e9: bipush 2
      // 6ea: aconst_null
      // 6eb: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 6ee: aload 62
      // 6f0: athrow
      // 6f1: nop
      // 6f2: nop
      // 6f3: nop
      // 6f4: nop
      // 6f5: nop
      // 6f6: aload 43
      // 6f8: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 6fb: goto 708
      // 6fe: astore 63
      // 700: aload 43
      // 702: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 705: aload 63
      // 707: athrow
      // 708: nop
      // 709: nop
      // 70a: nop
      // 70b: nop
      // 70c: aload 35
      // 70e: aload 38
      // 710: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 713: goto 722
      // 716: astore 64
      // 718: aload 35
      // 71a: aload 38
      // 71c: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 71f: aload 64
      // 721: athrow
      // 722: nop
      // 723: nop
      // 724: aload 2
      // 725: ifnull 734
      // 728: new kotlin/NoWhenBranchMatchedException
      // 72b: dup
      // 72c: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 72f: athrow
      // 730: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 733: athrow
      // 734: aload 32
      // 736: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 739: sipush 2848
      // 73c: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 73f: goto 752
      // 742: astore 65
      // 744: aload 32
      // 746: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 749: sipush 2848
      // 74c: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 74f: aload 65
      // 751: athrow
      // 752: nop
      // 753: return
   }

   private final void ah() {
   java.util.HashMap var2 = new java.util.HashMap((java.util.Map)this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
   if (var2.isEmpty()) {
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new net.minecraft.world.phys.AABB[0];
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new int[0];
      return;
   }

   int var3 = var2.size();
   net.minecraft.world.phys.AABB[] var4 = new net.minecraft.world.phys.AABB[var3];
   int[] var5 = new int[var3];
   int var6 = 0;

   for (Object var7o : ((java.util.Map) var2).entrySet()) {
         java.util.Map.Entry var8 = (java.util.Map.Entry) var7o;
      Long var9 = (Long) var8.getKey();
      Integer var10 = (Integer) var8.getValue();
      int var11 = net.minecraft.core.BlockPos.getX(var9.longValue());
      int var12 = net.minecraft.core.BlockPos.getY(var9.longValue());
      int var13 = net.minecraft.core.BlockPos.getZ(var9.longValue());
      var4[var6] = new net.minecraft.world.phys.AABB((double)var11, (double)var12, (double)var13, (double)var11 + 1.0, (double)var12 + 1.0, (double)var13 + 1.0);
      var5[var6] = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var10.intValue()];
      var6++;
   }

   this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var4;
   this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var5;
   }

   private final boolean a(BlockState param1, boolean param2) {
      if (!param2 && param1.getBlock() instanceof net.minecraft.world.level.block.StainedGlassPaneBlock) {
         return false;
      }
      return IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.B(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.w(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.x(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.z(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.A(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y(param1)
            || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(param1);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
      // 003: astore 3
      // 004: iload 2
      // 005: aload 3
      // 006: ifnonnull 03c
      // 009: ifne 035
      // 00c: goto 013
      // 00f: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 012: athrow
      // 013: aload 1
      // 014: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 017: instanceof net/minecraft/world/level/block/StainedGlassPaneBlock
      // 01a: aload 3
      // 01b: ifnonnull 03c
      // 01e: goto 025
      // 021: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 024: athrow
      // 025: ifeq 035
      // 028: goto 02f
      // 02b: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02e: athrow
      // 02f: bipush 0
      // 030: ireturn
      // 031: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 034: athrow
      // 035: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 038: aload 1
      // 039: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.B (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 03c: aload 3
      // 03d: ifnonnull 17f
      // 040: ifne 17e
      // 043: goto 04a
      // 046: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 049: athrow
      // 04a: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 04d: aload 1
      // 04e: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.s (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 051: aload 3
      // 052: ifnonnull 17f
      // 055: goto 05c
      // 058: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05b: athrow
      // 05c: ifne 17e
      // 05f: goto 066
      // 062: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 065: athrow
      // 066: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 069: aload 1
      // 06a: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.t (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 06d: aload 3
      // 06e: ifnonnull 17f
      // 071: goto 078
      // 074: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 077: athrow
      // 078: ifne 17e
      // 07b: goto 082
      // 07e: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 081: athrow
      // 082: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 085: aload 1
      // 086: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.u (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 089: aload 3
      // 08a: ifnonnull 17f
      // 08d: goto 094
      // 090: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 093: athrow
      // 094: ifne 17e
      // 097: goto 09e
      // 09a: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09d: athrow
      // 09e: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0a1: aload 1
      // 0a2: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.v (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0a5: aload 3
      // 0a6: ifnonnull 17f
      // 0a9: goto 0b0
      // 0ac: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0af: athrow
      // 0b0: ifne 17e
      // 0b3: goto 0ba
      // 0b6: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b9: athrow
      // 0ba: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0bd: aload 1
      // 0be: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.r (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0c1: aload 3
      // 0c2: ifnonnull 17f
      // 0c5: goto 0cc
      // 0c8: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cb: athrow
      // 0cc: ifne 17e
      // 0cf: goto 0d6
      // 0d2: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d5: athrow
      // 0d6: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0d9: aload 1
      // 0da: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.w (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0dd: aload 3
      // 0de: ifnonnull 17f
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e7: athrow
      // 0e8: ifne 17e
      // 0eb: goto 0f2
      // 0ee: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f1: athrow
      // 0f2: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0f5: aload 1
      // 0f6: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.x (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0f9: aload 3
      // 0fa: ifnonnull 17f
      // 0fd: goto 104
      // 100: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 103: athrow
      // 104: ifne 17e
      // 107: goto 10e
      // 10a: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10d: athrow
      // 10e: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 111: aload 1
      // 112: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.z (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 115: aload 3
      // 116: ifnonnull 17f
      // 119: goto 120
      // 11c: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11f: athrow
      // 120: ifne 17e
      // 123: goto 12a
      // 126: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 129: athrow
      // 12a: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 12d: aload 1
      // 12e: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.A (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 131: aload 3
      // 132: ifnonnull 17f
      // 135: goto 13c
      // 138: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13b: athrow
      // 13c: ifne 17e
      // 13f: goto 146
      // 142: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 145: athrow
      // 146: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 149: aload 1
      // 14a: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.y (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 14d: aload 3
      // 14e: ifnonnull 17f
      // 151: goto 158
      // 154: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 157: athrow
      // 158: ifne 17e
      // 15b: goto 162
      // 15e: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 161: athrow
      // 162: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 165: aload 1
      // 166: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.q (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 169: aload 3
      // 16a: ifnonnull 17f
      // 16d: goto 174
      // 170: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 173: athrow
      // 174: ifeq 182
      // 177: goto 17e
      // 17a: invokestatic me/octo/client/llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17d: athrow
      // 17e: bipush 1
      // 17f: goto 183
      // 182: bipush 0
      // 183: ireturn
   }

   private final int b(BlockState param1, boolean param2) {
      if (!param2 && param1.getBlock() instanceof net.minecraft.world.level.block.StainedGlassPaneBlock) {
         return -1;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.B(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Ruby")) {
         return 0;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Amber")) {
         return 1;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Sapphire")) {
         return 2;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Jade")) {
         return 3;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Amethyst")) {
         return 4;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Topaz")) {
         return 5;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.w(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Jasper")) {
         if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = true;
            this.ap().execute(llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII::ai);
         }
         return 6;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.x(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Aquamarine")) {
         return 7;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.z(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Peridot")) {
         return 8;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.A(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Onyx")) {
         return 9;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Citrine")) {
         return 10;
      }
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(param1)
            && IIIIlIlIIIIIllIlllllIlIllIIIlllllIIlIllIlllllIlIlIllIllIlIlllllllllllllIllIlIIlIIlIlI.h().b("Opal")) {
         return 11;
      }
      return -1;
   }

   private static final boolean a(llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII var0, boolean var1, BlockState var2) {
      short var10001 = -1642;
      short var10002 = -26731;
      Intrinsics.checkNotNullParameter(var2, "it");
      return var0.a(var2, var1);
   }

   private static final Unit a(
      int param0,
      int param1,
      ArrayList param2,
      ClientLevel param3,
      llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII param4,
      boolean param5,
      HashSet param6
   ) {
      String guard = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      int minY = Math.max(param0 - param1, 31);
      int maxY = Math.min(param0 + param1, 189);
      boolean changed = false;

      for (Object chunkObj : param2) {
         long chunk = ((Number)chunkObj).longValue();
         int cx = ChunkPos.getX(chunk);
         int cz = ChunkPos.getZ(chunk);
         if (guard == null && !param3.getChunkSource().hasChunk(cx, cz)) {
            continue;
         }

         LevelChunk levelChunk = param3.getChunk(cx, cz);
         if (levelChunk == null) {
            continue;
         }

         param4.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.remove(Long.valueOf(chunk));
         if (guard == null) {
            param4.a(cx, cz);
         }

         int baseX = cx << 4;
         int baseZ = cz << 4;
         LevelChunkSection[] sections = levelChunk.getSections();
         for (int sectionIndex = 0; sectionIndex < sections.length; sectionIndex++) {
            LevelChunkSection section = sections[sectionIndex];
            if (section == null || section.hasOnlyAir()) {
               continue;
            }

            int yBase = levelChunk.getMinY() + sectionIndex * 16;
            if (yBase + 15 < minY || yBase > maxY) {
               continue;
            }

            PalettedContainer<BlockState> states = section.getStates();
            if (!states.maybeHas(state -> param4.a(state, param5))) {
               continue;
            }

            for (int sx = 0; sx < 16; sx++) {
               for (int sz = 0; sz < 16; sz++) {
                  for (int sy = 0; sy < 16; sy++) {
                     int y = yBase + sy;
                     if (y < minY || y > maxY) {
                        continue;
                     }

                     BlockState state = states.get(sx, sy, sz);
                     int cost = param4.b(state, param5);
                     if (cost < 0) {
                        continue;
                     }

                     param4.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(
                        BlockPos.asLong(baseX + sx, y, baseZ + sz),
                        Integer.valueOf(cost)
                     );
                     changed = true;
                  }
               }
            }
         }

         param4.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(Long.valueOf(chunk));
      }

      ArrayList<Long> pending = new ArrayList<>();
      for (Long scanned : param4.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
         if (!param6.contains(scanned)) {
            pending.add(scanned);
         }
      }

      if (!pending.isEmpty()) {
         param4.a(pending);
         changed = true;
      }

      if (changed) {
         param4.ah();
      }

      param4.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      return Unit.INSTANCE;
   }

   private static final Unit a(
      IntRef var0, AABB[] var1, int var2, int[] var3, IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var4
   ) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -1645;
      short var10003 = -2295;
      Intrinsics.checkNotNullParameter(var4, "$this$paintOutlineMask");
      String var5 = var10000;
      int var6 = 0;
      int var7 = var0.element;

      while (var6 < var7) {
         AABB var10001 = var1[var6];
         Intrinsics.checkNotNull(var1[var6]);
         lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a(
            var4,
            var10001,
            new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var2 << 24 | var3[var6]),
            null,
            0,
            0,
            0.0F);
         var6++;
         if (var5 != null) {
            break;
         }
      }

      return Unit.INSTANCE;
   }

   private static final void ai() {
      short var10000 = -1658;
      short var10001 = -23754;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Found a Jasper Gemstone!");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[43];
      int var3 = 0;
      String var2 = "µóQ©K»\u001dÆÖ\u000f\u0092Ò\u0099\u000b\u00058\u0000®)È\n\u0089¢(\u0095\u0013Ú ÏbÝ\r'VÀ½\u0010»PO\u0084þlº\u000b\u0007\u0099*Ù\u008bç\u0082²\u0005°o¿Äê\tZÇCàý¿Ì\u0082\u007f\u0004MHÖT\u000eg9\u0016BìTc\u0012Á¦ôw\u001f\\\u0005=ú\fC%\u0002ÿ\u0093\tº`ÀÊ\u008dÉÂL¾\u0007þ)\u0085ì\u0083\u008b!\b¤\u0002\u009d\u000b²¦0F\rßOß\u009eóß,Ã\u000bo\u009d\u00885\u0016\u0087º=;\u0011C?\u0019Ô\u0005Uìa?+PïÔ³v\u0091X\u0004\u0090±pá\u00042$\u009c \tH\u009c×Ñ\u0005ªÓ \u009c\u0007E\u0087\u007f¸ÜÜÊ\u000e¸¶ð\u0001\u007f®\u009bd\u0006[\u0088XÚZ\t]%£¼á4Oó\u000f\t{Å±úÉÏJ\u008c¯\u0004\u008cÍvn\f /Ó n\")\u0013\u0082ëØ`\u0007»QZu³Á\u009a\u0018\rÈ_\nô\u0086gdÏÌv\u0004òü\u0007À¤%\u008eTÓ®¹R\u0018\u00926¨½.~\u0096i0^T\u00adTXg\u0083ÃÖ'\u007f@\\éL\u0006\u0014O÷+&-\b\u0005\u0096ZÌ?ÞR©\bÅ¾ô\u0015(ñb¯\u0004:D\u0085e\u0005\u0098¾\u001d\u008d_\tn\\ZMÞ9¨Ró\r\u001b\u0086kÄ¤ñq¤ \u001cèæ\u009b\rø\u0092\u0017F+¡\u0080®\u009e]/Îc\u0005\u0019\u0002l·\u0013\u0012/é\u001fIÕ\bHXq|\u0089¡]\u0096üõ_\u0083\u0012\u008eÈ+b^\u0085\u0098\u0007õ£ifÁ¨ë2½{\rª«,ë\u0006ÿwÅJã½l#$°\u0083Kî÷\u001aò¹S±\u0015Ûä'ËÌúJ\u0000\u001bª©0ÖCÎ^=\u009c\u0000=·F0QÊ";
      int var4 = "µóQ©K»\u001dÆÖ\u000f\u0092Ò\u0099\u000b\u00058\u0000®)È\n\u0089¢(\u0095\u0013Ú ÏbÝ\r'VÀ½\u0010»PO\u0084þlº\u000b\u0007\u0099*Ù\u008bç\u0082²\u0005°o¿Äê\tZÇCàý¿Ì\u0082\u007f\u0004MHÖT\u000eg9\u0016BìTc\u0012Á¦ôw\u001f\\\u0005=ú\fC%\u0002ÿ\u0093\tº`ÀÊ\u008dÉÂL¾\u0007þ)\u0085ì\u0083\u008b!\b¤\u0002\u009d\u000b²¦0F\rßOß\u009eóß,Ã\u000bo\u009d\u00885\u0016\u0087º=;\u0011C?\u0019Ô\u0005Uìa?+PïÔ³v\u0091X\u0004\u0090±pá\u00042$\u009c \tH\u009c×Ñ\u0005ªÓ \u009c\u0007E\u0087\u007f¸ÜÜÊ\u000e¸¶ð\u0001\u007f®\u009bd\u0006[\u0088XÚZ\t]%£¼á4Oó\u000f\t{Å±úÉÏJ\u008c¯\u0004\u008cÍvn\f /Ó n\")\u0013\u0082ëØ`\u0007»QZu³Á\u009a\u0018\rÈ_\nô\u0086gdÏÌv\u0004òü\u0007À¤%\u008eTÓ®¹R\u0018\u00926¨½.~\u0096i0^T\u00adTXg\u0083ÃÖ'\u007f@\\éL\u0006\u0014O÷+&-\b\u0005\u0096ZÌ?ÞR©\bÅ¾ô\u0015(ñb¯\u0004:D\u0085e\u0005\u0098¾\u001d\u008d_\tn\\ZMÞ9¨Ró\r\u001b\u0086kÄ¤ñq¤ \u001cèæ\u009b\rø\u0092\u0017F+¡\u0080®\u009e]/Îc\u0005\u0019\u0002l·\u0013\u0012/é\u001fIÕ\bHXq|\u0089¡]\u0096üõ_\u0083\u0012\u008eÈ+b^\u0085\u0098\u0007õ£ifÁ¨ë2½{\rª«,ë\u0006ÿwÅJã½l#$°\u0083Kî÷\u001aò¹S±\u0015Ûä'ËÌúJ\u0000\u001bª©0ÖCÎ^=\u009c\u0000=·F0QÊ"
         .length();
      char var1 = 14;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 35;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 115;
                     case 1 -> 12;
                     case 2 -> 44;
                     case 3 -> 57;
                     case 4 -> 98;
                     case 5 -> 36;
                     default -> 123;
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
                  if ((var9 += var1) >= var4) {
                     f = var5;
                     g = new String[43];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new llIIIIllIlIlIIlIllllIIIIIlIIllIIIlIlIIIlIIllIIIIlIIIIllIlIIlIlllIlllIIIlllllIIIIIllII();
                     int[] var7 = new int[]{13111085, 16739840, 6730495, 10551087, 7868364, 16765440, 16384250, 3301375, 2643744, 1315860, 8416266, 14474460};
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var7;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u0098õå\u0093Õ\u008a\n³¿ ò\u008aòÎ\r\u0006,\u00946<i\u001d:*1\u009c\u001b*";
                  var4 = "\u0098õå\u0093Õ\u008a\n³¿ ò\u008aòÎ\r\u0006,\u00946<i\u001d:*1\u009c\u001b*".length();
                  var1 = 14;
                  var9 = -1;
            }

            var10000 = 11;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ -1636) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 192;
            case 1 -> 252;
            case 2 -> 217;
            case 3 -> 62;
            case 4 -> 38;
            case 5 -> 110;
            case 6 -> 3;
            case 7 -> 64;
            case 8 -> 214;
            case 9 -> 35;
            case 10 -> 231;
            case 11 -> 246;
            case 12 -> 128;
            case 13 -> 66;
            case 14 -> 163;
            case 15 -> 131;
            case 16 -> 177;
            case 17 -> 112;
            case 18 -> 158;
            case 19 -> 45;
            case 20 -> 67;
            case 21 -> 115;
            case 22 -> 239;
            case 23 -> 5;
            case 24 -> 6;
            case 25 -> 30;
            case 26 -> 49;
            case 27 -> 139;
            case 28 -> 76;
            case 29 -> 203;
            case 30 -> 70;
            case 31 -> 201;
            case 32 -> 223;
            case 33 -> 233;
            case 34 -> 55;
            case 35 -> 174;
            case 36 -> 37;
            case 37 -> 32;
            case 38 -> 29;
            case 39 -> 122;
            case 40 -> 25;
            case 41 -> 114;
            case 42 -> 80;
            case 43 -> 241;
            case 44 -> 96;
            case 45 -> 88;
            case 46 -> 167;
            case 47 -> 1;
            case 48 -> 249;
            case 49 -> 196;
            case 50 -> 219;
            case 51 -> 175;
            case 52 -> 73;
            case 53 -> 54;
            case 54 -> 95;
            case 55 -> 105;
            case 56 -> 248;
            case 57 -> 56;
            case 58 -> 194;
            case 59 -> 187;
            case 60 -> 208;
            case 61 -> 41;
            case 62 -> 60;
            case 63 -> 52;
            case 64 -> 204;
            case 65 -> 151;
            case 66 -> 235;
            case 67 -> 232;
            case 68 -> 218;
            case 69 -> 254;
            case 70 -> 89;
            case 71 -> 59;
            case 72 -> 44;
            case 73 -> 243;
            case 74 -> 185;
            case 75 -> 106;
            case 76 -> 134;
            case 77 -> 173;
            case 78 -> 109;
            case 79 -> 221;
            case 80 -> 156;
            case 81 -> 124;
            case 82 -> 211;
            case 83 -> 189;
            case 84 -> 69;
            case 85 -> 78;
            case 86 -> 108;
            case 87 -> 161;
            case 88 -> 53;
            case 89 -> 160;
            case 90 -> 68;
            case 91 -> 24;
            case 92 -> 216;
            case 93 -> 27;
            case 94 -> 11;
            case 95 -> 164;
            case 96 -> 74;
            case 97 -> 148;
            case 98 -> 40;
            case 99 -> 107;
            case 100 -> 98;
            case 101 -> 236;
            case 102 -> 162;
            case 103 -> 140;
            case 104 -> 15;
            case 105 -> 8;
            case 106 -> 10;
            case 107 -> 159;
            case 108 -> 244;
            case 109 -> 118;
            case 110 -> 136;
            case 111 -> 57;
            case 112 -> 9;
            case 113 -> 83;
            case 114 -> 182;
            case 115 -> 170;
            case 116 -> 171;
            case 117 -> 165;
            case 118 -> 172;
            case 119 -> 206;
            case 120 -> 141;
            case 121 -> 176;
            case 122 -> 17;
            case 123 -> 86;
            case 124 -> 87;
            case 125 -> 240;
            case 126 -> 137;
            case 127 -> 200;
            case 128 -> 145;
            case 129 -> 178;
            case 130 -> 179;
            case 131 -> 23;
            case 132 -> 101;
            case 133 -> 234;
            case 134 -> 245;
            case 135 -> 242;
            case 136 -> 58;
            case 137 -> 104;
            case 138 -> 46;
            case 139 -> 0;
            case 140 -> 65;
            case 141 -> 143;
            case 142 -> 157;
            case 143 -> 19;
            case 144 -> 190;
            case 145 -> 209;
            case 146 -> 227;
            case 147 -> 71;
            case 148 -> 127;
            case 149 -> 220;
            case 150 -> 36;
            case 151 -> 225;
            case 152 -> 81;
            case 153 -> 31;
            case 154 -> 184;
            case 155 -> 186;
            case 156 -> 91;
            case 157 -> 144;
            case 158 -> 215;
            case 159 -> 18;
            case 160 -> 238;
            case 161 -> 191;
            case 162 -> 130;
            case 163 -> 213;
            case 164 -> 224;
            case 165 -> 119;
            case 166 -> 210;
            case 167 -> 180;
            case 168 -> 12;
            case 169 -> 247;
            case 170 -> 4;
            case 171 -> 94;
            case 172 -> 197;
            case 173 -> 202;
            case 174 -> 34;
            case 175 -> 207;
            case 176 -> 47;
            case 177 -> 75;
            case 178 -> 142;
            case 179 -> 250;
            case 180 -> 20;
            case 181 -> 237;
            case 182 -> 50;
            case 183 -> 123;
            case 184 -> 205;
            case 185 -> 13;
            case 186 -> 133;
            case 187 -> 48;
            case 188 -> 100;
            case 189 -> 51;
            case 190 -> 188;
            case 191 -> 113;
            case 192 -> 7;
            case 193 -> 125;
            case 194 -> 146;
            case 195 -> 72;
            case 196 -> 121;
            case 197 -> 155;
            case 198 -> 63;
            case 199 -> 150;
            case 200 -> 39;
            case 201 -> 93;
            case 202 -> 229;
            case 203 -> 16;
            case 204 -> 222;
            case 205 -> 79;
            case 206 -> 230;
            case 207 -> 226;
            case 208 -> 43;
            case 209 -> 111;
            case 210 -> 199;
            case 211 -> 212;
            case 212 -> 84;
            case 213 -> 255;
            case 214 -> 166;
            case 215 -> 22;
            case 216 -> 152;
            case 217 -> 2;
            case 218 -> 85;
            case 219 -> 138;
            case 220 -> 129;
            case 221 -> 92;
            case 222 -> 28;
            case 223 -> 126;
            case 224 -> 116;
            case 225 -> 181;
            case 226 -> 153;
            case 227 -> 193;
            case 228 -> 99;
            case 229 -> 195;
            case 230 -> 77;
            case 231 -> 117;
            case 232 -> 147;
            case 233 -> 135;
            case 234 -> 103;
            case 235 -> 198;
            case 236 -> 154;
            case 237 -> 168;
            case 238 -> 149;
            case 239 -> 169;
            case 240 -> 82;
            case 241 -> 14;
            case 242 -> 251;
            case 243 -> 132;
            case 244 -> 61;
            case 245 -> 183;
            case 246 -> 228;
            case 247 -> 42;
            case 248 -> 120;
            case 249 -> 21;
            case 250 -> 33;
            case 251 -> 253;
            case 252 -> 97;
            case 253 -> 102;
            case 254 -> 26;
            default -> 90;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
