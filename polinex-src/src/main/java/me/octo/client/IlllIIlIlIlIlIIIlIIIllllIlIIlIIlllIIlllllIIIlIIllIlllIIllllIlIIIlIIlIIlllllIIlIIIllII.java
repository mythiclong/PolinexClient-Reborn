package me.octo.client;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.PalettedContainer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.core.BlockPos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
import kotlin.ranges.RangesKt;

public final class IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final KeySetView<Long, Boolean> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final KeySetView<Long, Boolean> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final KeySetView<Long, Boolean> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private volatile boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private volatile boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private volatile AABB[] IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private AABB[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @JvmField
   @NotNull
   public static IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] f;
   private static String[] g;

   private IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII() {
      short var10001 = 14009;
      short var10002 = -30594;
      var10002 = 14000;
      short var10003 = -17918;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      short var10004 = 14015;
      short var10005 = 694;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.a(),
         llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.b(),
         llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.c(),
         llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.d(),
         llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.e(),
         llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.f(),
         llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.g()
      };
      super("Titanium ESP", "Highlights titanium blocks.", var3, "ESP", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ConcurrentHashMap.newKeySet();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = ConcurrentHashMap.newKeySet();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = ConcurrentHashMap.newKeySet();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new AABB[0];
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new AABB[256];
   }

   private final void a(int param1) {
      int[] var2 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.length >= param1) {
         return;
      }

      int var3 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.length;
      while (var3 < param1) {
         var3 *= 2;
      }

      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new net.minecraft.world.phys.AABB[var3];
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
      short var10001 = 14010;
      short var10002 = -26641;
      Intrinsics.checkNotNullParameter(var1, "event");
      this.ag();
   }

   private final void ag() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new AABB[0];
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
   }

   private final boolean ah() {
        IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
        IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2;
        block6: {
            int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            try {
                try {
                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                    if (nArray == null) break block6;
                    if (iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 == iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) return true;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a(noWhenBranchMatchedException);
                }
                iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
                iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                throw IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a(noWhenBranchMatchedException);
            }
        }
        try {
            if (iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 != iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) return false;
            return true;
        }
        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
            throw IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a(noWhenBranchMatchedException);
        }
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
      // 000: invokestatic me/octo/client/lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()[I
      // 003: aload 1
      // 004: sipush 14010
      // 007: sipush -26641
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 0
      // 012: aload 2
      // 013: ifnull 066
      // 016: invokespecial me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ah ()Z
      // 019: ifne 065
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 022: athrow
      // 023: aload 0
      // 024: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 027: dup
      // 028: sipush 14002
      // 02b: sipush 10163
      // 02e: pop2
      // 02f: ldc "blocks"
      // 031: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 034: checkcast java/util/Collection
      // 037: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 03c: aload 2
      // 03d: ifnull 052
      // 040: goto 047
      // 043: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 046: athrow
      // 047: ifne 055
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 050: athrow
      // 051: bipush 1
      // 052: goto 056
      // 055: bipush 0
      // 056: ifeq 064
      // 059: aload 0
      // 05a: invokespecial me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ag ()V
      // 05d: goto 064
      // 060: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 063: athrow
      // 064: return
      // 065: aload 0
      // 066: invokevirtual me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 069: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 06c: dup
      // 06d: ifnonnull 076
      // 070: pop
      // 071: return
      // 072: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 075: athrow
      // 076: astore 3
      // 077: aload 2
      // 078: ifnull 095
      // 07b: aload 0
      // 07c: invokevirtual me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 07f: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 082: dup
      // 083: ifnonnull 096
      // 086: goto 08d
      // 089: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08c: athrow
      // 08d: pop
      // 08e: goto 095
      // 091: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 094: athrow
      // 095: return
      // 096: astore 4
      // 098: aload 0
      // 099: aload 4
      // 09b: invokespecial me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lnet/minecraft/client/multiplayer/ClientLevel;)V
      // 09e: aload 0
      // 09f: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 0a2: aload 2
      // 0a3: ifnull 0b7
      // 0a6: ifeq 0b1
      // 0a9: goto 0b0
      // 0ac: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0af: athrow
      // 0b0: return
      // 0b1: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.a ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 0b4: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 0b7: istore 5
      // 0b9: iload 5
      // 0bb: aload 0
      // 0bc: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll I
      // 0bf: aload 2
      // 0c0: ifnull 0f0
      // 0c3: if_icmpeq 0e8
      // 0c6: goto 0cd
      // 0c9: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: iload 5
      // 0d0: putfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll I
      // 0d3: aload 0
      // 0d4: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 0d7: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.clear ()V
      // 0da: aload 0
      // 0db: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 0de: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.clear ()V
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e7: athrow
      // 0e8: aload 3
      // 0e9: invokevirtual net/minecraft/client/player/LocalPlayer.blockPosition ()Lnet/minecraft/core/BlockPos;
      // 0ec: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 0ef: bipush 4
      // 0f0: ishr
      // 0f1: istore 6
      // 0f3: aload 3
      // 0f4: invokevirtual net/minecraft/client/player/LocalPlayer.blockPosition ()Lnet/minecraft/core/BlockPos;
      // 0f7: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 0fa: bipush 4
      // 0fb: ishr
      // 0fc: istore 7
      // 0fe: iload 6
      // 100: iload 5
      // 102: isub
      // 103: istore 8
      // 105: iload 6
      // 107: iload 5
      // 109: iadd
      // 10a: istore 9
      // 10c: iload 7
      // 10e: iload 5
      // 110: isub
      // 111: istore 10
      // 113: iload 7
      // 115: iload 5
      // 117: iadd
      // 118: istore 11
      // 11a: new java/util/ArrayList
      // 11d: dup
      // 11e: invokespecial java/util/ArrayList.<init> ()V
      // 121: astore 12
      // 123: new java/util/HashSet
      // 126: dup
      // 127: invokespecial java/util/HashSet.<init> ()V
      // 12a: astore 13
      // 12c: iload 8
      // 12e: istore 14
      // 130: iload 14
      // 132: aload 2
      // 133: ifnull 218
      // 136: iload 9
      // 138: if_icmpgt 213
      // 13b: goto 142
      // 13e: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 141: athrow
      // 142: iload 10
      // 144: istore 15
      // 146: iload 15
      // 148: iload 11
      // 14a: if_icmpgt 1f3
      // 14d: iload 14
      // 14f: iload 15
      // 151: invokestatic net/minecraft/world/level/ChunkPos.pack (II)J
      // 154: lstore 16
      // 156: aload 13
      // 158: lload 16
      // 15a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15d: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 160: pop
      // 161: aload 0
      // 162: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 165: lload 16
      // 167: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16a: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.contains (Ljava/lang/Object;)Z
      // 16d: aload 2
      // 16e: ifnull 1f5
      // 171: ifeq 1a0
      // 174: aload 0
      // 175: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 178: lload 16
      // 17a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17d: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.contains (Ljava/lang/Object;)Z
      // 180: aload 2
      // 181: ifnull 1b3
      // 184: goto 18b
      // 187: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18a: athrow
      // 18b: aload 2
      // 18c: ifnull 1d5
      // 18f: goto 196
      // 192: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 195: athrow
      // 196: ifeq 1d3
      // 199: goto 1a0
      // 19c: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 19f: athrow
      // 1a0: aload 4
      // 1a2: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getChunkSource ()Lnet/minecraft/client/multiplayer/ClientChunkCache;
      // 1a5: iload 14
      // 1a7: iload 15
      // 1a9: invokevirtual net/minecraft/client/multiplayer/ClientChunkCache.hasChunk (II)Z
      // 1ac: goto 1b3
      // 1af: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b2: athrow
      // 1b3: aload 2
      // 1b4: ifnull 1d5
      // 1b7: ifeq 1d3
      // 1ba: goto 1c1
      // 1bd: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c0: athrow
      // 1c1: aload 12
      // 1c3: lload 16
      // 1c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1cb: pop
      // 1cc: goto 1d3
      // 1cf: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d2: athrow
      // 1d3: iload 15
      // 1d5: iload 11
      // 1d7: aload 2
      // 1d8: ifnull 202
      // 1db: if_icmpeq 1f3
      // 1de: goto 1e5
      // 1e1: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1e4: athrow
      // 1e5: iinc 15 1
      // 1e8: aload 2
      // 1e9: ifnonnull 14d
      // 1ec: goto 1f3
      // 1ef: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f2: athrow
      // 1f3: iload 14
      // 1f5: aload 2
      // 1f6: ifnull 218
      // 1f9: iload 9
      // 1fb: goto 202
      // 1fe: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 201: athrow
      // 202: if_icmpeq 213
      // 205: iinc 14 1
      // 208: aload 2
      // 209: ifnonnull 142
      // 20c: goto 213
      // 20f: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 212: athrow
      // 213: aload 12
      // 215: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 218: aload 2
      // 219: ifnull 2f8
      // 21c: ifeq 2e5
      // 21f: goto 226
      // 222: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 225: athrow
      // 226: aload 0
      // 227: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
      // 22a: dup
      // 22b: sipush 13993
      // 22e: sipush -13894
      // 231: pop2
      // 232: ldc_w "scannedChunks"
      // 235: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 238: checkcast java/lang/Iterable
      // 23b: astore 15
      // 23d: bipush 0
      // 23e: istore 16
      // 240: aload 15
      // 242: astore 17
      // 244: new java/util/ArrayList
      // 247: dup
      // 248: invokespecial java/util/ArrayList.<init> ()V
      // 24b: checkcast java/util/Collection
      // 24e: astore 18
      // 250: bipush 0
      // 251: istore 19
      // 253: aload 17
      // 255: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 25a: astore 20
      // 25c: aload 20
      // 25e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 263: ifeq 2af
      // 266: aload 20
      // 268: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26d: astore 21
      // 26f: aload 21
      // 271: checkcast java/lang/Long
      // 274: astore 22
      // 276: bipush 0
      // 277: istore 23
      // 279: aload 13
      // 27b: aload 2
      // 27c: ifnull 2b1
      // 27f: aload 22
      // 281: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 284: aload 2
      // 285: ifnull 29a
      // 288: goto 28f
      // 28b: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28e: athrow
      // 28f: ifne 29d
      // 292: goto 299
      // 295: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 298: athrow
      // 299: bipush 1
      // 29a: goto 29e
      // 29d: bipush 0
      // 29e: ifeq 25c
      // 2a1: aload 18
      // 2a3: aload 21
      // 2a5: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 2aa: pop
      // 2ab: aload 2
      // 2ac: ifnonnull 25c
      // 2af: aload 18
      // 2b1: checkcast java/util/List
      // 2b4: nop
      // 2b5: astore 14
      // 2b7: aload 14
      // 2b9: checkcast java/util/Collection
      // 2bc: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 2c1: aload 2
      // 2c2: ifnull 2d0
      // 2c5: ifne 2d3
      // 2c8: goto 2cf
      // 2cb: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ce: athrow
      // 2cf: bipush 1
      // 2d0: goto 2d4
      // 2d3: bipush 0
      // 2d4: ifeq 2e4
      // 2d7: aload 0
      // 2d8: aload 14
      // 2da: invokespecial me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Ljava/util/List;)V
      // 2dd: goto 2e4
      // 2e0: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2e3: athrow
      // 2e4: return
      // 2e5: aload 0
      // 2e6: bipush 1
      // 2e7: putfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 2ea: aload 3
      // 2eb: invokevirtual net/minecraft/client/player/LocalPlayer.blockPosition ()Lnet/minecraft/core/BlockPos;
      // 2ee: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 2f1: istore 14
      // 2f3: iload 5
      // 2f5: bipush 16
      // 2f7: imul
      // 2f8: istore 15
      // 2fa: getstatic me/octo/client/utils/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
      // 2fd: iload 14
      // 2ff: iload 15
      // 301: aload 12
      // 303: aload 4
      // 305: aload 0
      // 306: aload 13
      // 308: invokedynamic invoke (IILjava/util/ArrayList;Lnet/minecraft/client/multiplayer/ClientLevel;Lme/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII;Ljava/util/HashSet;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (IILjava/util/ArrayList;Lnet/minecraft/client/multiplayer/ClientLevel;Lme/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII;Ljava/util/HashSet;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 30d: invokevirtual me/octo/client/utils/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.a (Lkotlin/jvm/functions/Function0;)Ljava/util/concurrent/Future;
      // 310: pop
      // 311: return
   }

   private final void a(ClientLevel param1) {
      int[] var2 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.isEmpty()) {
         return;
      }
      boolean var3 = false;
      BlockPos.MutableBlockPos var4 = new BlockPos.MutableBlockPos();
      java.util.Iterator var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.iterator();
      while (var5.hasNext()) {
         Long var6 = (Long)var5.next();
         Intrinsics.checkNotNull(var6);
         var4.set(BlockPos.getX(var6.longValue()), BlockPos.getY(var6.longValue()), BlockPos.getZ(var6.longValue()));
         if (!me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k(param1.getBlockState(var4))) {
            var5.remove();
            var3 = true;
         }
      }
      if (var3) {
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
      }
   }

   private final void a(int param1, int param2) {
      int[] var3 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      int var4 = param1 << 4;
      int var5 = var4 + 15;
      int var6 = param2 << 4;
      int var7 = var6 + 15;
      java.util.Iterator<Long> var8 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.iterator();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var8, "iterator(...)");

      while (var8.hasNext()) {
         Long var9 = var8.next();
         kotlin.jvm.internal.Intrinsics.checkNotNull(var9);
         int var10 = net.minecraft.core.BlockPos.getX(var9.longValue());
         int var11 = net.minecraft.core.BlockPos.getZ(var9.longValue());

         if (var4 <= var10 && var10 <= var5 && var6 <= var11 && var11 <= var7) {
            var8.remove();
         }
      }
   }

   private final void a(List<Long> var1) {
      int[] var10000 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Iterator var3 = var1.iterator();
      int[] var2 = var10000;

      while (var3.hasNext()) {
         long var4 = ((Number)var3.next()).longValue();
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.remove(var4);
         this.a(ChunkPos.getX(var4), ChunkPos.getZ(var4));
         if (var2 == null) {
            break;
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1) {
      var var2 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (var2 != null) {
        var var3 = param1.k();
        if (var2 != null) {
          var var4 = param1.m();
          long var5 = var3.asLong();
          if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k(var4)) {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(java.lang.Long.valueOf(var5));
          } else {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.remove(java.lang.Long.valueOf(var5));
          }
          this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.add(java.lang.Long.valueOf(net.minecraft.world.level.ChunkPos.pack(var3.getX() >> 4, var3.getZ() >> 4)));
          this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
        }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()[I
      // 003: aload 1
      // 004: sipush 14010
      // 007: sipush -26641
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 0
      // 012: invokevirtual me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 015: aload 2
      // 016: ifnull 03c
      // 019: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 01c: ifnull 042
      // 01f: goto 026
      // 022: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 025: athrow
      // 026: aload 0
      // 027: aload 2
      // 028: ifnull 048
      // 02b: goto 032
      // 02e: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 031: athrow
      // 032: invokevirtual me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 035: goto 03c
      // 038: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03b: athrow
      // 03c: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 03f: ifnonnull 047
      // 042: return
      // 043: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 046: athrow
      // 047: aload 0
      // 048: aload 2
      // 049: ifnull 0a4
      // 04c: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Z
      // 04f: ifeq 0a3
      // 052: goto 059
      // 055: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 058: athrow
      // 059: aload 0
      // 05a: aload 2
      // 05b: ifnull 0a4
      // 05e: goto 065
      // 061: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 064: athrow
      // 065: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Z
      // 068: ifne 0a3
      // 06b: goto 072
      // 06e: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 071: athrow
      // 072: invokestatic java/lang/System.currentTimeMillis ()J
      // 075: lstore 3
      // 076: aload 2
      // 077: ifnull 09f
      // 07a: lload 3
      // 07b: aload 0
      // 07c: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl J
      // 07f: lsub
      // 080: ldc2_w 500
      // 083: lcmp
      // 084: ifle 0a3
      // 087: goto 08e
      // 08a: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08d: athrow
      // 08e: aload 0
      // 08f: bipush 0
      // 090: putfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Z
      // 093: aload 0
      // 094: lload 3
      // 095: putfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl J
      // 098: goto 09f
      // 09b: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: invokespecial me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ai ()V
      // 0a3: aload 0
      // 0a4: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl [Lnet/minecraft/world/phys/AABB;
      // 0a7: astore 3
      // 0a8: aload 3
      // 0a9: arraylength
      // 0aa: aload 2
      // 0ab: ifnull 0b9
      // 0ae: ifne 0bc
      // 0b1: goto 0b8
      // 0b4: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b7: athrow
      // 0b8: bipush 1
      // 0b9: goto 0bd
      // 0bc: bipush 0
      // 0bd: ifeq 0c1
      // 0c0: return
      // 0c1: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.b ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 0c4: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.B ()Ljava/lang/String;
      // 0c7: astore 4
      // 0c9: aload 4
      // 0cb: sipush 14004
      // 0ce: sipush 31559
      // 0d1: pop2
      // 0d2: ldc_w "Fill"
      // 0d5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0d8: aload 2
      // 0d9: ifnull 10b
      // 0dc: ifne 10a
      // 0df: goto 0e6
      // 0e2: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e5: athrow
      // 0e6: aload 4
      // 0e8: sipush 13991
      // 0eb: sipush 9078
      // 0ee: pop2
      // 0ef: ldc_w "Fill + Outline"
      // 0f2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0f5: aload 2
      // 0f6: ifnull 10b
      // 0f9: goto 100
      // 0fc: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ff: athrow
      // 100: ifeq 10e
      // 103: goto 10a
      // 106: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 109: athrow
      // 10a: bipush 1
      // 10b: goto 10f
      // 10e: bipush 0
      // 10f: istore 5
      // 111: aload 4
      // 113: sipush 14011
      // 116: sipush -32644
      // 119: pop2
      // 11a: ldc_w "Outline"
      // 11d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 120: aload 2
      // 121: ifnull 153
      // 124: ifne 152
      // 127: goto 12e
      // 12a: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12d: athrow
      // 12e: aload 4
      // 130: sipush 14014
      // 133: sipush 31470
      // 136: pop2
      // 137: ldc_w "Fill + Outline"
      // 13a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 13d: aload 2
      // 13e: ifnull 153
      // 141: goto 148
      // 144: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 147: athrow
      // 148: ifeq 156
      // 14b: goto 152
      // 14e: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 151: athrow
      // 152: bipush 1
      // 153: goto 157
      // 156: bipush 0
      // 157: istore 6
      // 159: aload 4
      // 15b: sipush 14013
      // 15e: sipush -29497
      // 161: pop2
      // 162: ldc_w "Chams"
      // 165: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 168: istore 7
      // 16a: aload 2
      // 16b: ifnull 188
      // 16e: aload 0
      // 16f: invokevirtual me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.ap ()Lnet/minecraft/client/Minecraft;
      // 172: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 175: dup
      // 176: ifnonnull 189
      // 179: goto 180
      // 17c: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17f: athrow
      // 180: pop
      // 181: goto 188
      // 184: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 187: athrow
      // 188: return
      // 189: astore 8
      // 18b: aload 8
      // 18d: invokevirtual net/minecraft/client/player/LocalPlayer.getX ()D
      // 190: dstore 9
      // 192: aload 8
      // 194: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 197: dstore 11
      // 199: aload 8
      // 19b: invokevirtual net/minecraft/client/player/LocalPlayer.getZ ()D
      // 19e: dstore 13
      // 1a0: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.a ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 1a3: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 1a6: i2d
      // 1a7: ldc2_w 16.0
      // 1aa: dmul
      // 1ab: dstore 15
      // 1ad: dload 15
      // 1af: dload 15
      // 1b1: dmul
      // 1b2: dstore 17
      // 1b4: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.c ()Lme/octo/client/llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII;
      // 1b7: invokevirtual me/octo/client/llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII.j ()I
      // 1ba: ldc_w 16777215
      // 1bd: iand
      // 1be: istore 19
      // 1c0: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.d ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1c3: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1c6: ldc_w 255.0
      // 1c9: fmul
      // 1ca: f2i
      // 1cb: bipush 0
      // 1cc: sipush 255
      // 1cf: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 1d2: istore 20
      // 1d4: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.f ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1d7: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1da: ldc_w 255.0
      // 1dd: fmul
      // 1de: f2i
      // 1df: bipush 0
      // 1e0: sipush 255
      // 1e3: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 1e6: istore 21
      // 1e8: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.e ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1eb: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1ee: fstore 22
      // 1f0: invokestatic me/octo/client/llIIIlIIIIIlIllIIIllllllllIllIlllIlIIlIlllIlIIIlIIIIIIlIIlIllIlIIIIlIllIIIIIllIIIIlll.g ()Lme/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII;
      // 1f3: invokevirtual me/octo/client/IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII.n ()F
      // 1f6: ldc_w 255.0
      // 1f9: fmul
      // 1fa: f2i
      // 1fb: bipush 0
      // 1fc: sipush 255
      // 1ff: invokestatic kotlin/ranges/RangesKt.coerceIn (III)I
      // 202: istore 23
      // 204: aload 0
      // 205: aload 3
      // 206: arraylength
      // 207: invokespecial me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (I)V
      // 20a: new kotlin/jvm/internal/Ref$IntRef
      // 20d: dup
      // 20e: invokespecial kotlin/jvm/internal/Ref$IntRef.<init> ()V
      // 211: astore 24
      // 213: aload 0
      // 214: getfield me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI [Lnet/minecraft/world/phys/AABB;
      // 217: astore 25
      // 219: bipush 0
      // 21a: istore 26
      // 21c: aload 3
      // 21d: arraylength
      // 21e: istore 27
      // 220: iload 26
      // 222: iload 27
      // 224: if_icmpge 2d8
      // 227: aload 3
      // 228: iload 26
      // 22a: aaload
      // 22b: astore 28
      // 22d: aload 28
      // 22f: getfield net/minecraft/world/phys/AABB.minX D
      // 232: aload 28
      // 234: getfield net/minecraft/world/phys/AABB.maxX D
      // 237: dadd
      // 238: ldc2_w 0.5
      // 23b: dmul
      // 23c: dload 9
      // 23e: dsub
      // 23f: dstore 29
      // 241: aload 28
      // 243: getfield net/minecraft/world/phys/AABB.minY D
      // 246: aload 28
      // 248: getfield net/minecraft/world/phys/AABB.maxY D
      // 24b: dadd
      // 24c: ldc2_w 0.5
      // 24f: dmul
      // 250: dload 11
      // 252: dsub
      // 253: dstore 31
      // 255: aload 28
      // 257: getfield net/minecraft/world/phys/AABB.minZ D
      // 25a: aload 28
      // 25c: getfield net/minecraft/world/phys/AABB.maxZ D
      // 25f: dadd
      // 260: ldc2_w 0.5
      // 263: dmul
      // 264: dload 13
      // 266: dsub
      // 267: dstore 33
      // 269: aload 2
      // 26a: ifnull 2d4
      // 26d: dload 29
      // 26f: dload 29
      // 271: dmul
      // 272: dload 31
      // 274: dload 31
      // 276: dmul
      // 277: dadd
      // 278: dload 33
      // 27a: dload 33
      // 27c: dmul
      // 27d: dadd
      // 27e: dload 17
      // 280: dcmpl
      // 281: aload 2
      // 282: ifnull 2dd
      // 285: goto 28c
      // 288: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28b: athrow
      // 28c: ifgt 2d1
      // 28f: goto 296
      // 292: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 295: athrow
      // 296: aload 28
      // 298: invokestatic me/octo/client/utils/llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.a (Lnet/minecraft/world/phys/AABB;)Z
      // 29b: aload 2
      // 29c: ifnull 2c6
      // 29f: goto 2a6
      // 2a2: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a5: athrow
      // 2a6: ifeq 2d1
      // 2a9: goto 2b0
      // 2ac: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2af: athrow
      // 2b0: aload 25
      // 2b2: aload 24
      // 2b4: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2b7: aload 28
      // 2b9: aastore
      // 2ba: aload 24
      // 2bc: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2bf: goto 2c6
      // 2c2: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c5: athrow
      // 2c6: istore 35
      // 2c8: aload 24
      // 2ca: iload 35
      // 2cc: bipush 1
      // 2cd: iadd
      // 2ce: putfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2d1: iinc 26 1
      // 2d4: aload 2
      // 2d5: ifnonnull 220
      // 2d8: aload 24
      // 2da: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 2dd: aload 2
      // 2de: ifnull 2ee
      // 2e1: ifne 2ec
      // 2e4: goto 2eb
      // 2e7: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ea: athrow
      // 2eb: return
      // 2ec: iload 5
      // 2ee: aload 2
      // 2ef: ifnull 363
      // 2f2: ifeq 361
      // 2f5: goto 2fc
      // 2f8: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2fb: athrow
      // 2fc: iload 20
      // 2fe: aload 2
      // 2ff: ifnull 363
      // 302: goto 309
      // 305: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 308: athrow
      // 309: ifle 361
      // 30c: goto 313
      // 30f: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 312: athrow
      // 313: iload 20
      // 315: bipush 24
      // 317: ishl
      // 318: iload 19
      // 31a: ior
      // 31b: istore 26
      // 31d: bipush 0
      // 31e: istore 28
      // 320: aload 24
      // 322: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 325: istore 29
      // 327: iload 29
      // 329: newarray 10
      // 32b: astore 30
      // 32d: iload 28
      // 32f: iload 29
      // 331: if_icmpge 351
      // 334: iload 28
      // 336: istore 31
      // 338: aload 30
      // 33a: iload 31
      // 33c: iload 26
      // 33e: iastore
      // 33f: iinc 28 1
      // 342: aload 2
      // 343: ifnull 361
      // 346: aload 2
      // 347: ifnonnull 32d
      // 34a: goto 351
      // 34d: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 350: athrow
      // 351: aload 30
      // 353: astore 27
      // 355: aload 25
      // 357: aload 27
      // 359: aload 24
      // 35b: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 35e: invokestatic me/octo/client/IlIIIIIlllIIIIIIIlIlIIIIIIIIIlIllIllllllIlIlIlIllllllIlIIlIIIIlIllIIllIllIIIIlIIIlIII.a ([Lnet/minecraft/world/phys/AABB;[II)V
      // 361: iload 6
      // 363: aload 2
      // 364: ifnull 3ab
      // 367: ifeq 3a9
      // 36a: goto 371
      // 36d: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 370: athrow
      // 371: iload 21
      // 373: aload 2
      // 374: ifnull 3ab
      // 377: goto 37e
      // 37a: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 37d: athrow
      // 37e: ifle 3a9
      // 381: goto 388
      // 384: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 387: athrow
      // 388: iload 21
      // 38a: bipush 24
      // 38c: ishl
      // 38d: iload 19
      // 38f: ior
      // 390: istore 26
      // 392: fload 22
      // 394: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (F)V
      // 397: aload 1
      // 398: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 39b: aload 24
      // 39d: aload 25
      // 39f: iload 26
      // 3a1: invokedynamic invoke (Lkotlin/jvm/internal/Ref$IntRef;[Lnet/minecraft/world/phys/AABB;I)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/jvm/internal/Ref$IntRef;[Lnet/minecraft/world/phys/AABB;ILme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit;, (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;)Lkotlin/Unit; ]
      // 3a6: invokestatic me/octo/client/lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a (Lcom/mojang/blaze3d/vertex/PoseStack;Lkotlin/jvm/functions/Function1;)V
      // 3a9: iload 7
      // 3ab: aload 2
      // 3ac: ifnull 3bb
      // 3af: ifeq 751
      // 3b2: goto 3b9
      // 3b5: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b8: athrow
      // 3b9: iload 23
      // 3bb: aload 2
      // 3bc: ifnull 3d8
      // 3bf: ifle 751
      // 3c2: goto 3c9
      // 3c5: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3c8: athrow
      // 3c9: iload 23
      // 3cb: bipush 24
      // 3cd: ishl
      // 3ce: iload 19
      // 3d0: ior
      // 3d1: goto 3d8
      // 3d4: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3d7: athrow
      // 3d8: istore 26
      // 3da: aload 1
      // 3db: invokevirtual me/octo/client/events/impl/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.k ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 3de: astore 27
      // 3e0: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 3e3: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 3e6: dup
      // 3e7: sipush 13989
      // 3ea: sipush 10163
      // 3ed: pop2
      // 3ee: ldc_w "getMainRenderTarget(...)"
      // 3f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3f4: astore 28
      // 3f6: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 3f9: astore 29
      // 3fb: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 3fe: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 401: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 404: dup
      // 405: sipush 14005
      // 408: sipush 5307
      // 40b: pop2
      // 40c: ldc_w "getMainCamera(...)"
      // 40f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 412: astore 30
      // 414: bipush 0
      // 415: istore 31
      // 417: sipush 2848
      // 41a: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 41d: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 420: aload 28
      // 422: aload 27
      // 424: aload 30
      // 426: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 429: astore 32
      // 42b: nop
      // 42c: aload 29
      // 42e: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 431: swap
      // 432: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 435: iaload
      // 436: tableswitch 752 1 2 22 387
      // 44c: aload 32
      // 44e: astore 33
      // 450: bipush 0
      // 451: istore 34
      // 453: aload 33
      // 455: astore 35
      // 457: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 45a: astore 36
      // 45c: bipush 0
      // 45d: istore 37
      // 45f: aload 35
      // 461: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 464: astore 38
      // 466: aload 35
      // 468: aload 36
      // 46a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 46d: nop
      // 46e: aload 35
      // 470: astore 39
      // 472: bipush 0
      // 473: istore 40
      // 475: aload 39
      // 477: astore 41
      // 479: bipush 0
      // 47a: istore 42
      // 47c: aload 41
      // 47e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 481: astore 43
      // 483: bipush 0
      // 484: istore 44
      // 486: aload 43
      // 488: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 48b: nop
      // 48c: aload 43
      // 48e: astore 45
      // 490: bipush 0
      // 491: istore 46
      // 493: aload 41
      // 495: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 498: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 49b: dup
      // 49c: sipush 14003
      // 49f: sipush -18891
      // 4a2: pop2
      // 4a3: ldc_w "position(...)"
      // 4a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4a9: astore 47
      // 4ab: aload 45
      // 4ad: aload 47
      // 4af: getfield net/minecraft/world/phys/Vec3.x D
      // 4b2: dneg
      // 4b3: aload 47
      // 4b5: getfield net/minecraft/world/phys/Vec3.y D
      // 4b8: dneg
      // 4b9: aload 47
      // 4bb: getfield net/minecraft/world/phys/Vec3.z D
      // 4be: dneg
      // 4bf: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 4c2: aload 41
      // 4c4: astore 48
      // 4c6: bipush 0
      // 4c7: istore 49
      // 4c9: aload 48
      // 4cb: astore 50
      // 4cd: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 4d0: astore 51
      // 4d2: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 4d5: astore 52
      // 4d7: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 4da: astore 53
      // 4dc: bipush 0
      // 4dd: istore 54
      // 4df: aload 50
      // 4e1: aload 51
      // 4e3: aload 52
      // 4e5: aload 53
      // 4e7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 4ea: astore 55
      // 4ec: nop
      // 4ed: aload 55
      // 4ef: aload 50
      // 4f1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 4f4: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 4f7: dup
      // 4f8: sipush 14007
      // 4fb: sipush -26802
      // 4fe: pop2
      // 4ff: ldc_w "last(...)"
      // 502: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 505: astore 56
      // 507: astore 57
      // 509: bipush 0
      // 50a: istore 58
      // 50c: aload 56
      // 50e: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 511: dup
      // 512: sipush 13988
      // 515: sipush 16364
      // 518: pop2
      // 519: ldc_w "pose(...)"
      // 51c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 51f: astore 59
      // 521: bipush 0
      // 522: istore 60
      // 524: aload 24
      // 526: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 529: istore 61
      // 52b: iload 60
      // 52d: iload 61
      // 52f: if_icmpge 564
      // 532: aload 57
      // 534: aload 59
      // 536: checkcast org/joml/Matrix4fc
      // 539: aload 25
      // 53b: iload 60
      // 53d: aaload
      // 53e: dup
      // 53f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 542: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 545: dup
      // 546: iload 26
      // 548: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 54b: bipush 0
      // 54c: bipush 8
      // 54e: aconst_null
      // 54f: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 552: iinc 60 1
      // 555: aload 2
      // 556: ifnull 570
      // 559: aload 2
      // 55a: ifnonnull 52b
      // 55d: goto 564
      // 560: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 563: athrow
      // 564: nop
      // 565: nop
      // 566: aload 50
      // 568: aload 55
      // 56a: bipush 0
      // 56b: bipush 2
      // 56c: aconst_null
      // 56d: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 570: goto 582
      // 573: astore 62
      // 575: aload 50
      // 577: aload 55
      // 579: bipush 0
      // 57a: bipush 2
      // 57b: aconst_null
      // 57c: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 57f: aload 62
      // 581: athrow
      // 582: nop
      // 583: nop
      // 584: nop
      // 585: nop
      // 586: nop
      // 587: aload 43
      // 589: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 58c: goto 599
      // 58f: astore 63
      // 591: aload 43
      // 593: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 596: aload 63
      // 598: athrow
      // 599: nop
      // 59a: nop
      // 59b: nop
      // 59c: nop
      // 59d: aload 35
      // 59f: aload 38
      // 5a1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 5a4: goto 5b3
      // 5a7: astore 64
      // 5a9: aload 35
      // 5ab: aload 38
      // 5ad: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 5b0: aload 64
      // 5b2: athrow
      // 5b3: nop
      // 5b4: nop
      // 5b5: aload 2
      // 5b6: ifnonnull 732
      // 5b9: aload 32
      // 5bb: astore 33
      // 5bd: bipush 0
      // 5be: istore 34
      // 5c0: aload 33
      // 5c2: astore 35
      // 5c4: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 5c7: astore 36
      // 5c9: bipush 0
      // 5ca: istore 37
      // 5cc: aload 35
      // 5ce: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 5d1: astore 38
      // 5d3: aload 35
      // 5d5: aload 36
      // 5d7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 5da: nop
      // 5db: aload 35
      // 5dd: astore 39
      // 5df: bipush 0
      // 5e0: istore 40
      // 5e2: aload 39
      // 5e4: astore 41
      // 5e6: bipush 0
      // 5e7: istore 42
      // 5e9: aload 41
      // 5eb: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 5ee: astore 43
      // 5f0: bipush 0
      // 5f1: istore 44
      // 5f3: aload 43
      // 5f5: invokevirtual com/mojang/blaze3d/vertex/PoseStack.pushPose ()V
      // 5f8: nop
      // 5f9: aload 43
      // 5fb: astore 45
      // 5fd: bipush 0
      // 5fe: istore 46
      // 600: aload 41
      // 602: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.c ()Lnet/minecraft/client/Camera;
      // 605: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 608: dup
      // 609: sipush 13986
      // 60c: sipush -14662
      // 60f: pop2
      // 610: ldc_w "position(...)"
      // 613: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 616: astore 47
      // 618: aload 45
      // 61a: aload 47
      // 61c: getfield net/minecraft/world/phys/Vec3.x D
      // 61f: dneg
      // 620: aload 47
      // 622: getfield net/minecraft/world/phys/Vec3.y D
      // 625: dneg
      // 626: aload 47
      // 628: getfield net/minecraft/world/phys/Vec3.z D
      // 62b: dneg
      // 62c: invokevirtual com/mojang/blaze3d/vertex/PoseStack.translate (DDD)V
      // 62f: aload 41
      // 631: astore 48
      // 633: bipush 0
      // 634: istore 49
      // 636: aload 48
      // 638: astore 50
      // 63a: getstatic me/octo/client/IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 63d: astore 51
      // 63f: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 642: astore 52
      // 644: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 647: astore 53
      // 649: bipush 0
      // 64a: istore 54
      // 64c: aload 50
      // 64e: aload 51
      // 650: aload 52
      // 652: aload 53
      // 654: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Ljava/util/Map;Ljava/util/Map;)Lcom/mojang/blaze3d/vertex/VertexConsumer;
      // 657: astore 55
      // 659: nop
      // 65a: aload 55
      // 65c: aload 50
      // 65e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.b ()Lcom/mojang/blaze3d/vertex/PoseStack;
      // 661: invokevirtual com/mojang/blaze3d/vertex/PoseStack.last ()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;
      // 664: dup
      // 665: sipush 14006
      // 668: sipush -30361
      // 66b: pop2
      // 66c: ldc_w "last(...)"
      // 66f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 672: astore 56
      // 674: astore 57
      // 676: bipush 0
      // 677: istore 58
      // 679: aload 56
      // 67b: invokevirtual com/mojang/blaze3d/vertex/PoseStack$Pose.pose ()Lorg/joml/Matrix4f;
      // 67e: dup
      // 67f: sipush 14001
      // 682: sipush 11582
      // 685: pop2
      // 686: ldc_w "pose(...)"
      // 689: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 68c: astore 59
      // 68e: bipush 0
      // 68f: istore 60
      // 691: aload 24
      // 693: getfield kotlin/jvm/internal/Ref$IntRef.element I
      // 696: istore 61
      // 698: iload 60
      // 69a: iload 61
      // 69c: if_icmpge 6d1
      // 69f: aload 57
      // 6a1: aload 59
      // 6a3: checkcast org/joml/Matrix4fc
      // 6a6: aload 25
      // 6a8: iload 60
      // 6aa: aaload
      // 6ab: dup
      // 6ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 6af: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 6b2: dup
      // 6b3: iload 26
      // 6b5: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 6b8: bipush 0
      // 6b9: bipush 8
      // 6bb: aconst_null
      // 6bc: invokestatic me/octo/client/lIllIlIIIIIIIIlllIIIIlIIIlIlIlIlIlIIIlIIlIIlllIllIIIIlllIIlIIIIlIlllIIIlIIllllIlllllI.b (Lcom/mojang/blaze3d/vertex/VertexConsumer;Lorg/joml/Matrix4fc;Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;IILjava/lang/Object;)V
      // 6bf: iinc 60 1
      // 6c2: aload 2
      // 6c3: ifnull 6dd
      // 6c6: aload 2
      // 6c7: ifnonnull 698
      // 6ca: goto 6d1
      // 6cd: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6d0: athrow
      // 6d1: nop
      // 6d2: nop
      // 6d3: aload 50
      // 6d5: aload 55
      // 6d7: bipush 0
      // 6d8: bipush 2
      // 6d9: aconst_null
      // 6da: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 6dd: goto 6ef
      // 6e0: astore 62
      // 6e2: aload 50
      // 6e4: aload 55
      // 6e6: bipush 0
      // 6e7: bipush 2
      // 6e8: aconst_null
      // 6e9: invokestatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lcom/mojang/blaze3d/vertex/VertexConsumer;ZILjava/lang/Object;)V
      // 6ec: aload 62
      // 6ee: athrow
      // 6ef: nop
      // 6f0: nop
      // 6f1: nop
      // 6f2: nop
      // 6f3: nop
      // 6f4: aload 43
      // 6f6: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 6f9: goto 706
      // 6fc: astore 63
      // 6fe: aload 43
      // 700: invokevirtual com/mojang/blaze3d/vertex/PoseStack.popPose ()V
      // 703: aload 63
      // 705: athrow
      // 706: nop
      // 707: nop
      // 708: nop
      // 709: nop
      // 70a: aload 35
      // 70c: aload 38
      // 70e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 711: goto 720
      // 714: astore 64
      // 716: aload 35
      // 718: aload 38
      // 71a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 71d: aload 64
      // 71f: athrow
      // 720: nop
      // 721: nop
      // 722: aload 2
      // 723: ifnonnull 732
      // 726: new kotlin/NoWhenBranchMatchedException
      // 729: dup
      // 72a: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 72d: athrow
      // 72e: invokestatic me/octo/client/IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 731: athrow
      // 732: aload 32
      // 734: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 737: sipush 2848
      // 73a: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 73d: goto 750
      // 740: astore 65
      // 742: aload 32
      // 744: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 747: sipush 2848
      // 74a: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 74d: aload 65
      // 74f: athrow
      // 750: nop
      // 751: return
   }

   private final void ai() {
      Object var14 = null; // PX-FIX
      int[] var10000 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      KeySetView var10001 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      short var10003 = 13992;
      short var10004 = -6817;
      Intrinsics.checkNotNullExpressionValue(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, "blocks");
      long[] var2 = CollectionsKt.toLongArray(var10001);
      int[] var1 = var10000;

      label52: {
         label51: {
            try {
               var14 = var2.length;
               if (var1 == null) {
                  break label52;
               }

               if ((me.octo.client.PxTruth.truth(var14))) {
                  break label51;
               }
            } catch (NoWhenBranchMatchedException var13) {
               throw (RuntimeException)a(var13);
            }

            var14 = 0;
            break label52;
         }

         var14 = 1;
      }

      try {
         if (!(me.octo.client.PxTruth.truth(var14))) {
            this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new AABB[0];
            return;
         }
      } catch (NoWhenBranchMatchedException var12) {
         throw (RuntimeException)a(var12);
      }

      AABB[] var3 = new AABB[var2.length];
      int var4 = 0;
      int var5 = var2.length;

      while (true) {
         if (var4 < var5) {
            long var6 = var2[var4];
            int var8 = BlockPos.getX(var6);
            int var9 = BlockPos.getY(var6);
            int var10 = BlockPos.getZ(var6);

            try {
               var3[var4] = new AABB(var8, var9, var10, var8 + 1.0, var9 + 1.0, var10 + 1.0);
               var4++;
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var11) {
               throw (RuntimeException)a(var11);
            }
         }

         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var3;
         break;
      }
   }

   private static final boolean a(BlockState var0) {
      short var10001 = 13997;
      byte var10002 = -122;
      Intrinsics.checkNotNullParameter(var0, "it");
      return IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .k(var0);
   }

   private static final Unit a(
      int param0,
      int param1,
      ArrayList param2,
      ClientLevel param3,
      IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII param4,
      HashSet param5
   ) {
      int var7 = RangesKt.coerceAtLeast(param0 - param1, 31);
      int var8 = RangesKt.coerceAtMost(param0 + param1, 189);
      int var9 = 0;

      try {
         for (Object chunkPosObj : param2) {
            Number chunkPosNum = (Number) chunkPosObj;
            long chunkPos = chunkPosNum.longValue();
            int cx = ChunkPos.getX(chunkPos);
            int cz = ChunkPos.getZ(chunkPos);
            if (!param3.getChunkSource().hasChunk(cx, cz)) {
               continue;
            }

            LevelChunk chunk = param3.getChunk(cx, cz);
            if (param4.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.remove(Long.valueOf(chunkPos))) {
               param4.a(cx, cz);
            }

            int baseX = cx << 4;
            int baseZ = cz << 4;
            LevelChunkSection[] sections = chunk.getSections();
            for (int si = 0; si < sections.length; si++) {
               LevelChunkSection section = sections[si];
               if (section.hasOnlyAir()) {
                  continue;
               }

               int yBase = chunk.getMinY() + si * 16;
               if (yBase + 15 < var7 || yBase > var8) {
                  continue;
               }

               PalettedContainer<BlockState> states = section.getStates();
               if (!states.maybeHas(IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl::k)) {
                  continue;
               }

               for (int sx = 0; sx < 16; sx++) {
                  for (int sz = 0; sz < 16; sz++) {
                     for (int sy = 0; sy < 16; sy++) {
                        int y = yBase + sy;
                        if (y < var7 || y > var8) {
                           continue;
                        }

                        BlockState state = states.get(sx, sy, sz);
                        if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k(state)) {
                           long pos = BlockPos.asLong(baseX + sx, y, baseZ + sz);
                           if (param4.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(Long.valueOf(pos))) {
                              var9 = 1;
                           }
                        }
                     }
                  }
               }
            }

            param4.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(Long.valueOf(chunkPos));
         }

         ArrayList<Long> pending = new ArrayList<>();
         for (Long scanned : param4.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
            if (!param5.contains(scanned)) {
               pending.add(scanned);
            }
         }

         if (!pending.isEmpty()) {
            param4.a(pending);
            var9 = 1;
         }

         if (var9 != 0) {
            param4.ai();
         }
      } finally {
         param4.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      }

      return Unit.INSTANCE;
   }

   private static final Unit a(IntRef var0, AABB[] var1, int var2, IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI var3) {
      short var10001 = 13987;
      short var10002 = 9870;
      Intrinsics.checkNotNullParameter(var3, "$this$paintOutlineMask");
      int var5 = 0;
      int[] var10000 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      int var6 = var0.element;
      int[] var4 = var10000;

      while (var5 < var6) {
         AABB var7 = var1[var5];
         Intrinsics.checkNotNull(var1[var5]);
         lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a(
            var3, var7, new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var2), null, 0, 0, 0.0F);
         var5++;
         if (var4 == null) {
            break;
         }
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[32];
      int var3 = 0;
      String var2 = "Ò\u0099ôs\u0082dýÚa\u001bU\u008f/z+®MjJø4_&ËrñÉO9ÿ+$8¥Iáì\r\u008aWÿ¦¿\u0014Ì;/IAÅ\u0007\u0006±pÔ+Zô\u0012_G·ËD\u0019\u0005·~\u0013@ùM\u0085Y¯M\u0090\u0004]\rê.\tul\u009f\u0013ï[P=Ô\t6Z÷Õâ\u0083ñ&à\fR\u0016C@ÕÁÂ\u0082¿v'Z\t\u0096àª\u0006#ùÉiç\u0007/ª\u0094E(Ê\u008a\u0005Iñ&OP\u0005¶\u0085?\u001fð\u0005\u0088à\u001emW\u0003\u0004¥\u009e\u000eÖ.\u009bJ\u009bnÙ_v\u009aÞé¹²\r\u0095\u00ad0\u009a\u0087ö|Å9\t\u0083Í_\rût#£ßÇ^Û\\ð/òÊ\u0016´\u000fýÕ\u00807Ó´q\u0016¹\u0007U\u009c\u008e\u001cý\u0005xå6\t\r«ãÛ0;Æ\\a=\u0002\u0003¬O\u0018L\u0091Õ\u0011\bB\u008cÍKlcb\u001b\u007f\u00ad_<\u0015Q®PEÓÉ\t\u008b\nß\u0001ç*Q\u0013ô\u000eZ\u009b\nü©¸\u009f\u0085¾ÁÇ\u0082\u009aß\b+¤9ÒÚ´0Ç\rÇ\u0087'6îí´¤\nií´\u0080\u0006O\u0088\u000b4¡\u0017\u0012\t\u008e}ý\u00107.\u009c\u0085BOï,\u0081ñ/X\u0080\b\u0098\u009eO\u0095\u0014\\éÚ\u0002 ù\r-Æ'÷e[ p²¿ò\u001bq";
      int var4 = "Ò\u0099ôs\u0082dýÚa\u001bU\u008f/z+®MjJø4_&ËrñÉO9ÿ+$8¥Iáì\r\u008aWÿ¦¿\u0014Ì;/IAÅ\u0007\u0006±pÔ+Zô\u0012_G·ËD\u0019\u0005·~\u0013@ùM\u0085Y¯M\u0090\u0004]\rê.\tul\u009f\u0013ï[P=Ô\t6Z÷Õâ\u0083ñ&à\fR\u0016C@ÕÁÂ\u0082¿v'Z\t\u0096àª\u0006#ùÉiç\u0007/ª\u0094E(Ê\u008a\u0005Iñ&OP\u0005¶\u0085?\u001fð\u0005\u0088à\u001emW\u0003\u0004¥\u009e\u000eÖ.\u009bJ\u009bnÙ_v\u009aÞé¹²\r\u0095\u00ad0\u009a\u0087ö|Å9\t\u0083Í_\rût#£ßÇ^Û\\ð/òÊ\u0016´\u000fýÕ\u00807Ó´q\u0016¹\u0007U\u009c\u008e\u001cý\u0005xå6\t\r«ãÛ0;Æ\\a=\u0002\u0003¬O\u0018L\u0091Õ\u0011\bB\u008cÍKlcb\u001b\u007f\u00ad_<\u0015Q®PEÓÉ\t\u008b\nß\u0001ç*Q\u0013ô\u000eZ\u009b\nü©¸\u009f\u0085¾ÁÇ\u0082\u009aß\b+¤9ÒÚ´0Ç\rÇ\u0087'6îí´¤\nií´\u0080\u0006O\u0088\u000b4¡\u0017\u0012\t\u008e}ý\u00107.\u009c\u0085BOï,\u0081ñ/X\u0080\b\u0098\u009eO\u0095\u0014\\éÚ\u0002 ù\r-Æ'÷e[ p²¿ò\u001bq"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 43;
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
                     case 0 -> 53;
                     case 1 -> 118;
                     case 2 -> 75;
                     case 3 -> 39;
                     case 4 -> 14;
                     case 5 -> 71;
                     default -> 33;
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
                     f = var5;
                     g = new String[32];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new IlllIIlIlIlIlIIIlIIIllllIlIIlIIlllIIlllllIIIlIIllIlllIIllllIlIIIlIIlIIlllllIIlIIIllII();
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

                  var2 = "\u000bT¤.ªéì\u001f\u00918?´Vc\røåYã¸ÎçYùO\néå";
                  var4 = "\u000bT¤.ªéì\u001f\u00918?´Vc\røåYã¸ÎçYùO\néå".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 92;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 14001) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 183;
            case 1 -> 224;
            case 2 -> 172;
            case 3 -> 10;
            case 4 -> 119;
            case 5 -> 138;
            case 6 -> 170;
            case 7 -> 133;
            case 8 -> 65;
            case 9 -> 237;
            case 10 -> 176;
            case 11 -> 209;
            case 12 -> 157;
            case 13 -> 162;
            case 14 -> 12;
            case 15 -> 147;
            case 16 -> 3;
            case 17 -> 64;
            case 18 -> 59;
            case 19 -> 233;
            case 20 -> 167;
            case 21 -> 238;
            case 22 -> 21;
            case 23 -> 36;
            case 24 -> 33;
            case 25 -> 202;
            case 26 -> 87;
            case 27 -> 210;
            case 28 -> 97;
            case 29 -> 152;
            case 30 -> 235;
            case 31 -> 92;
            case 32 -> 185;
            case 33 -> 24;
            case 34 -> 228;
            case 35 -> 115;
            case 36 -> 18;
            case 37 -> 144;
            case 38 -> 100;
            case 39 -> 143;
            case 40 -> 35;
            case 41 -> 134;
            case 42 -> 45;
            case 43 -> 218;
            case 44 -> 4;
            case 45 -> 163;
            case 46 -> 30;
            case 47 -> 174;
            case 48 -> 106;
            case 49 -> 254;
            case 50 -> 50;
            case 51 -> 141;
            case 52 -> 184;
            case 53 -> 31;
            case 54 -> 178;
            case 55 -> 62;
            case 56 -> 139;
            case 57 -> 8;
            case 58 -> 182;
            case 59 -> 121;
            case 60 -> 122;
            case 61 -> 110;
            case 62 -> 47;
            case 63 -> 76;
            case 64 -> 195;
            case 65 -> 149;
            case 66 -> 19;
            case 67 -> 66;
            case 68 -> 116;
            case 69 -> 54;
            case 70 -> 41;
            case 71 -> 72;
            case 72 -> 140;
            case 73 -> 20;
            case 74 -> 165;
            case 75 -> 255;
            case 76 -> 102;
            case 77 -> 42;
            case 78 -> 175;
            case 79 -> 248;
            case 80 -> 203;
            case 81 -> 44;
            case 82 -> 126;
            case 83 -> 227;
            case 84 -> 22;
            case 85 -> 159;
            case 86 -> 204;
            case 87 -> 189;
            case 88 -> 83;
            case 89 -> 164;
            case 90 -> 219;
            case 91 -> 9;
            case 92 -> 142;
            case 93 -> 86;
            case 94 -> 177;
            case 95 -> 241;
            case 96 -> 39;
            case 97 -> 91;
            case 98 -> 94;
            case 99 -> 253;
            case 100 -> 180;
            case 101 -> 166;
            case 102 -> 49;
            case 103 -> 236;
            case 104 -> 211;
            case 105 -> 206;
            case 106 -> 111;
            case 107 -> 71;
            case 108 -> 137;
            case 109 -> 109;
            case 110 -> 79;
            case 111 -> 67;
            case 112 -> 34;
            case 113 -> 53;
            case 114 -> 95;
            case 115 -> 55;
            case 116 -> 193;
            case 117 -> 37;
            case 118 -> 226;
            case 119 -> 124;
            case 120 -> 197;
            case 121 -> 199;
            case 122 -> 29;
            case 123 -> 118;
            case 124 -> 132;
            case 125 -> 108;
            case 126 -> 127;
            case 127 -> 99;
            case 128 -> 151;
            case 129 -> 104;
            case 130 -> 25;
            case 131 -> 239;
            case 132 -> 194;
            case 133 -> 229;
            case 134 -> 173;
            case 135 -> 158;
            case 136 -> 169;
            case 137 -> 251;
            case 138 -> 40;
            case 139 -> 68;
            case 140 -> 190;
            case 141 -> 252;
            case 142 -> 27;
            case 143 -> 90;
            case 144 -> 244;
            case 145 -> 1;
            case 146 -> 51;
            case 147 -> 181;
            case 148 -> 81;
            case 149 -> 7;
            case 150 -> 168;
            case 151 -> 113;
            case 152 -> 70;
            case 153 -> 154;
            case 154 -> 249;
            case 155 -> 23;
            case 156 -> 232;
            case 157 -> 63;
            case 158 -> 223;
            case 159 -> 243;
            case 160 -> 105;
            case 161 -> 61;
            case 162 -> 136;
            case 163 -> 56;
            case 164 -> 2;
            case 165 -> 221;
            case 166 -> 89;
            case 167 -> 179;
            case 168 -> 220;
            case 169 -> 146;
            case 170 -> 0;
            case 171 -> 74;
            case 172 -> 246;
            case 173 -> 234;
            case 174 -> 85;
            case 175 -> 230;
            case 176 -> 84;
            case 177 -> 77;
            case 178 -> 107;
            case 179 -> 200;
            case 180 -> 198;
            case 181 -> 245;
            case 182 -> 52;
            case 183 -> 103;
            case 184 -> 11;
            case 185 -> 222;
            case 186 -> 117;
            case 187 -> 242;
            case 188 -> 46;
            case 189 -> 225;
            case 190 -> 186;
            case 191 -> 188;
            case 192 -> 155;
            case 193 -> 205;
            case 194 -> 208;
            case 195 -> 125;
            case 196 -> 148;
            case 197 -> 101;
            case 198 -> 17;
            case 199 -> 6;
            case 200 -> 96;
            case 201 -> 15;
            case 202 -> 38;
            case 203 -> 32;
            case 204 -> 130;
            case 205 -> 161;
            case 206 -> 216;
            case 207 -> 215;
            case 208 -> 129;
            case 209 -> 150;
            case 210 -> 171;
            case 211 -> 214;
            case 212 -> 120;
            case 213 -> 57;
            case 214 -> 114;
            case 215 -> 26;
            case 216 -> 240;
            case 217 -> 16;
            case 218 -> 82;
            case 219 -> 43;
            case 220 -> 98;
            case 221 -> 112;
            case 222 -> 14;
            case 223 -> 212;
            case 224 -> 192;
            case 225 -> 217;
            case 226 -> 75;
            case 227 -> 201;
            case 228 -> 207;
            case 229 -> 131;
            case 230 -> 13;
            case 231 -> 5;
            case 232 -> 156;
            case 233 -> 135;
            case 234 -> 78;
            case 235 -> 58;
            case 236 -> 160;
            case 237 -> 88;
            case 238 -> 60;
            case 239 -> 187;
            case 240 -> 247;
            case 241 -> 191;
            case 242 -> 145;
            case 243 -> 128;
            case 244 -> 123;
            case 245 -> 69;
            case 246 -> 153;
            case 247 -> 73;
            case 248 -> 93;
            case 249 -> 250;
            case 250 -> 28;
            case 251 -> 196;
            case 252 -> 48;
            case 253 -> 213;
            case 254 -> 80;
            default -> 231;
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
