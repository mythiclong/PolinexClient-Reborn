package me.octo.client.utils.player.pathfinder;

import it.unimi.dsi.fastutil.bytes.Byte2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static boolean a(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0, BlockPos var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return var0.a(var1, var2);
   }

   public static boolean a(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0, BlockPos var1, BlockPos var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return var0.a(var1, var2, var3);
   }

   public static List<BlockPos> b(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0, BlockPos var1, boolean var2, int var3, Object var4) {
      int var5 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (var5 == 0) {
         var2 = (var3 & 2) != 0;
      } else if ((var3 & 2) != 0) {
         var2 = false;
      }

      return var0.b(var1, var2);
   }

   public static List<BlockPos> b(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0, BlockPos var1, BlockPos var2, boolean var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      return var0.b(var1, var2, var3);
   }


   @NotNull
   public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static byte lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static byte lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static byte lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static byte lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static byte IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static byte llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static byte IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static byte IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static byte IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static byte IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static byte llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static byte IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static byte lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static byte llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static byte lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static byte IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static Byte2DoubleOpenHashMap IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private static MutableBlockPos llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @Nullable
   private static ChunkAccess lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static int IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static int IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @NotNull
   private static Long2ByteOpenHashMap lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   @NotNull
   private static Long2ByteOpenHashMap lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private static HashMap<Long, List<Long>> IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static boolean IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @NotNull
   private static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   @NotNull
   private static LongOpenHashSet IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   @NotNull
   private static Long2DoubleOpenHashMap IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   @NotNull
   private static Long2LongOpenHashMap lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   private static String[] c;
   private static String[] d;

   private IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI() {
   }

   @NotNull
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(
      @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      short var10001 = -5606;
      short var10002 = -27109;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   private final ClientLevel h() {
      ClientLevel var10000 = this.a().level;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @NotNull
   public final Long2ByteOpenHashMap i() {
      return lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   }

   public final void a(@NotNull Long2ByteOpenHashMap var1) {
      short var10001 = -5605;
      short var10002 = -10237;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = var1;
   }

   @NotNull
   public final HashMap<Long, List<Long>> j() {
      return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   }

   public final void a(@NotNull HashMap<Long, List<Long>> var1) {
      short var10001 = -5606;
      short var10002 = -27109;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var1;
   }

   public final boolean k() {
      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   public final void a(boolean var1) {
      IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = var1;
   }

   public final boolean a(@NotNull BlockPos var1, boolean var2) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -5608;
      short var10003 = 29630;
      Intrinsics.checkNotNullParameter(var1, "goal");
      int var3 = var10000;
      if (var3 == 0) {
         BlockPos var5 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(this.a().player);
         if (var5 != null) {
            BlockPos var4 = var5;
            return this.a(var4, var1, var2);
         }
      }

      return false;
   }

   public final boolean a(@NotNull BlockPos var1, @NotNull BlockPos var2, boolean var3) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -5607;
      short var10003 = -18981;
      Intrinsics.checkNotNullParameter(var1, "start");
      int var4 = var10000;
      short var10001 = -5608;
      var10002 = 29630;
      Intrinsics.checkNotNullParameter(var2, "goal");
      int var14 = ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .k()) ? 1 : 0);
      if (var4 == 0) {
         if ((var14 == 0)) {
            return false;
         }

         var14 = ((Intrinsics.areEqual(var1, var2)) ? 1 : 0);
      }

      if (var4 == 0) {
         if ((var14 == 0)) {
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.nanoTime();
            long var5 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var1);
            long var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var2);
            IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.b();
            IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.clear();
            IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.clear();
            lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI.clear();
            lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = null;
            IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = Integer.MAX_VALUE;
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = Integer.MAX_VALUE;
            byte var9 = this.d(var5);
            double var10 = this.b(var5, var7);
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var12 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               var5, var9, 0.0, var10
            );
            var12.b(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c(var5)
                  + IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get(var9)
            );
            IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.a(var12);
            ((Map)IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII).put(var5, 0.0);

            while (true) {
               if (IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.c()) {
                  IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.a();
                  long var19;
                  var14 = (var19 = var13.a() - var7) == 0L ? 0 : (var19 < 0L ? -1 : 1);
                  if (var4 != 0) {
                     break;
                  }

                  if (var4 == 0) {
                     if (var14 == 0) {
                        byte var17 =((byte)(( var3) ? 1 : 0));
                        if (var4 == 0) {
                           if (!var3) {
                              this.b(true);
                           }

                           var17 = 1;
                        }

                        return (var17 != 0);
                     }

                     var14 = IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.size();
                  }

                  if (var4 == 0) {
                     if (var14 > 20000) {
                        byte var16 =((byte)(( var3) ? 1 : 0));
                        if (var4 == 0) {
                           if (!var3) {
                              this.b(false);
                           }

                           var16 = 0;
                        }

                        return (var16 != 0);
                     }

                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.add(var13.a());
                  }

                  this.a(var13, var7, false);
                  if (var4 == 0) {
                     continue;
                  }
               }

               var14 =(( var3) ? 1 : 0);
               break;
            }

            if (var4 == 0) {
               if (var14 != 0) {
                  this.b(false);
               }

               var14 = 0;
            }

            return (var14 != 0);
         }

         var14 = 1;
      }

      return (var14 != 0);
   }

   @Nullable
   public final List<BlockPos> b(@NotNull BlockPos var1, boolean var2) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -5609;
      short var10003 = 25192;
      Intrinsics.checkNotNullParameter(var1, "goal");
      int var3 = var10000;
      if (var3 == 0) {
         BlockPos var5 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(this.a().player);
         if (var5 != null) {
            BlockPos var4 = var5;
            return this.b(var4, var1, var2);
         }
      }

      return null;
   }

   @Nullable
   public final List<BlockPos> b(@NotNull BlockPos var1, @NotNull BlockPos var2, boolean var3) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = -5612;
      short var10003 = -17857;
      Intrinsics.checkNotNullParameter(var1, "start");
      int var4 = var10000;
      short var10001 = -5608;
      var10002 = 29630;
      Intrinsics.checkNotNullParameter(var2, "goal");
      int var14 = ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .k()) ? 1 : 0);
      if (var4 != 0) {
         if ((var14 == 0)) {
            return null;
         }

         if (var4 == 0) {
            return CollectionsKt.listOf(var1);
         }

         var14 = ((Intrinsics.areEqual(var1, var2)) ? 1 : 0);
      }

      if ((var14 == 0)) {
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.nanoTime();
         long var5 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var1);
         long var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var2);
         IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.b();
         IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.clear();
         IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.clear();
         lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI.clear();
         lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII.clear();
         lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = null;
         IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = Integer.MAX_VALUE;
         IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = Integer.MAX_VALUE;
         byte var9 = this.d(var5);
         double var10 = this.b(var5, var7);
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var12 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var5, var9, 0.0, var10
         );
         var12.b(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .c(var5)
               + IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get(var9)
         );
         IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.a(var12);
         ((Map)IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII).put(var5, 0.0);

         while (true) {
            if (IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.c()) {
               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.a();
               long var18;
               var14 = (var18 = var13.a() - var7) == 0L ? 0 : (var18 < 0L ? -1 : 1);
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  if (var14 == 0) {
                     if (!var3) {
                        this.b(true);
                     }

                     return this.a(var5, var7);
                  }

                  var14 = IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.size();
               }

               if (var4 != 0) {
                  if (var14 > 20000) {
                     if (!var3) {
                        this.b(false);
                     }

                     return null;
                  }

                  IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.add(var13.a());
               }

               this.a(var13, var7, true);
               if (var4 != 0) {
                  continue;
               }
            }

            var14 =(( var3) ? 1 : 0);
            break;
         }

         if (var14 != 0) {
            this.b(false);
         }

         return null;
      } else {
         return CollectionsKt.listOf(var1);
      }
   }

   private final List<BlockPos> a(long var1, long var3) {
      Collection var23 = null; // PX-FIX
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      List var6 = new ArrayList();
      long var7 = var3;
      int var5 = var10000;

      while (true) {
         label38:
         if (var7 != var1) {
            var6.add(var7);
            long var9 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII.get(var7);
            long var21 = var9;
            if (var5 != 0) {
               long var24;
               var10000 = (var24 = var9 - -1L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
               if (var5 == 0) {
                  break;
               }

               if (((var10000 != 0) && ((var5 != 0 ? 1 : 0)== 0))) {
                  break label38;
               }

               var21 = var9;
            }

            var7 = var21;
            if (var5 != 0) {
               continue;
            }
         }

         var6.add(var1);
         break;
      }

      CollectionsKt.reverse(var6);
      Iterable var20 = var6;
      boolean var10 = false;
      Collection var12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var20, 10));
      boolean var13 = false;
      Iterator var14 = var20.iterator();

      while (true) {
         if (var14.hasNext()) {
            Object var15 = var14.next();
            var23 = var12;
            long var16 = ((Number)var15).longValue();
            if (var5 == 0) {
               break;
            }

            boolean var18 = false;
            var12.add(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .e(var16)
            );
            if (var5 != 0) {
               continue;
            }
         }

         var23 = var12;
         break;
      }

      return (List<BlockPos>)var23;
   }

   private final void a(
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
      long var2,
      boolean var4
   ) {
      double var42 = 0; // PX-FIX
      Object var39 = null; // PX-FIX
      long var35; // PX-FIX: original local is long
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      long var6 = var1.a();
      double var8 = var1.c();
      double var10 = var1.e();
      int var5 = var10000;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] var12 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
      int var13 = 0;
      int var14 = var12.length;

      label220:
      while (true) {
         var10000 = var13;

         label217:
         while (var10000 < var14) {
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var15 = var12[var13];
            long var16 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var6, var15.a(), 0, var15.c());
            if (var5 != 0) {
               var39 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var16);
               if (var5 == 0) {
                  break label220;
               }

               if (((Boolean)(var39))) {
                  int var18 = 1;

                  while (-21 < var18) {
                     long var19 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var16, 0, var18, 0);
                     byte var21 = this.d(var19);
                     if (var5 != 0) {
                        var10000 = var21;
                        if (var5 == 0) {
                           continue label217;
                        }

                        if (var21 != 0) {
                           double var22 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .c(var19)
                              + IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get(var21);
                           double var24 = var22 - var10;
                           double var49;
                           var10000 = (var49 = var24 - 1.0) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
                           if (var5 != 0) {
                              if (var10000 > 0 && var5 != 0) {
                                 break;
                              }

                              var10000 = ((this.b(
                                 IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var19, 0, 1, 0)
                              )) ? 1 : 0);
                           }

                           label202: {
                              label201: {
                                 label231: {
                                    if (var5 != 0) {
                                       if (var10000 == 0) {
                                          break label231;
                                       }

                                       var10000 = ((this.c(
                                          IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .a(var19, 0, 2, 0)
                                       )) ? 1 : 0);
                                    }

                                    if (var5 == 0) {
                                       break label202;
                                    }

                                    if (var10000 != 0) {
                                       break label201;
                                    }
                                 }

                                 if (var5 != 0) {
                                    break;
                                 }
                              }

                              var10000 = var18;
                           }

                           label189:
                           if (var5 != 0) {
                              if (var10000 < 0) {
                                 var10000 = ((this.c(
                                    IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var16, 0, 2, 0)
                                 )) ? 1 : 0);
                                 if (var5 == 0) {
                                    break label189;
                                 }

                                 if (var10000 == 0 && var5 != 0) {
                                    break;
                                 }
                              }

                              var10000 = var18;
                           }

                           label182:
                           if (var5 != 0) {
                              if (var10000 == 1) {
                                 var10000 = ((this.c(
                                    IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var6, 0, 3, 0)
                                 )) ? 1 : 0);
                                 if (var5 == 0) {
                                    break label182;
                                 }

                                 if (var10000 == 0 && var5 != 0) {
                                    break;
                                 }
                              }

                              var10000 = ((IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.contains(var19)) ? 1 : 0);
                           }

                           if (var10000 != 0) {
                              break;
                           }

                           double var10001;
                           label232: {
                              double var26 = 1.0;
                              double var50;
                              var10000 = (var50 = var24 - 0.5625) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
                              if (var5 != 0) {
                                 if (var10000 > 0) {
                                    var26 += 0.5;
                                 }

                                 var42 = var24;
                                 var10001 = 0.0;
                                 if (var5 == 0) {
                                    break label232;
                                 }

                                 double var51;
                                 var10000 = (var51 = var24 - 0.0) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
                              }

                              if (var10000 < 0) {
                                 var26 += 0.1;
                              }

                              var42 = var8;
                              var10001 = var26;
                           }

                           label240: {
                              double var28;
                              label235: {
                                 var28 = var42 + var10001;
                                 double var52;
                                 var10000 = (var52 = var28 - IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.get(var19))
                                       == 0.0
                                    ? 0
                                    : (var52 < 0.0 ? -1 : 1);
                                 if (var5 != 0) {
                                    if (var10000 >= 0) {
                                       break label240;
                                    }

                                    ((Map)IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII).put(var19, var28);
                                    if (var5 == 0) {
                                       break label235;
                                    }

                                    var10000 =(( var4) ? 1 : 0);
                                 }

                                 if (var10000 != 0) {
                                    ((Map)lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII).put(var19, var6);
                                 }
                              }

                              double var30 = this.b(var19, var2);
                              IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var32 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                                 var19, var21, var28, var30
                              );
                              var32.b(var22);
                              IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var44 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
                              if (var5 != 0) {
                                 if (IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.a(var19)) {
                                    IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.b(var32);
                                    if (var5 != 0) {
                                       break label240;
                                    }
                                 }

                                 var44 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
                              }

                              var44.a(var32);
                           }

                           if (var5 != 0) {
                              break;
                           }
                        }

                        var18--;
                     }

                     if (var5 == 0) {
                        break;
                     }
                  }
               }

               var13++;
            }

            if (var5 != 0) {
               continue label220;
            }
            break;
         }

         var39 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
         break;
      }

      if (((Boolean)(var39))) {
         List var45 = IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.get(var6);
         if (var45 != null) {
            List var33 = var45;
            Iterator var34 = var33.iterator();

            while (true) {
               int var46 = ((var34.hasNext()) ? 1 : 0);

               do {
                  if ((var46 == 0)) {
                     return;
                  }

                  var35 = ((Number)var34.next()).longValue();
                  var46 = ((IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.contains(var35)) ? 1 : 0);
               } while (var5 == 0);

               if ((var46 == 0)) {
                  double var36;
                  label238: {
                     var36 = var8 + 5.0;
                     double var53;
                     var46 = (var53 = var36 - IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.get(var35)) == 0.0
                        ? 0
                        : (var53 < 0.0 ? -1 : 1);
                     if (var5 != 0) {
                        if (var46 >= 0) {
                           continue;
                        }

                        ((Map)IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII).put(var35, var36);
                        if (var5 == 0) {
                           break label238;
                        }

                        var46 =(( var4) ? 1 : 0);
                     }

                     if (var46 != 0) {
                        ((Map)lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII).put(var35, var6);
                     }
                  }

                  double var37 = this.b(var35, var2);
                  IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var20 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                     var35, (byte)1, var36, var37
                  );
                  var20.b(
                     ((Long)(((Long)(Object)(IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .c(var35)
                        + IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get((byte)1)
                  )))));
                  IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var48 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
                  if (var5 != 0) {
                     if (IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.a((var35))) {
                        IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.b(var20);
                        if (var5 != 0) {
                           continue;
                        }
                     }

                     var48 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
                  }

                  var48.a(var20);
                  if (var5 == 0) {
                     return;
                  }
               }
            }
         }
      }
   }

   private final boolean b(long var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      byte var4 = this.d(var1);
      int var3 = var10000;
      byte var5 = var4;
      if (var3 == 0) {
         if (var4 != 0) {
            if (var3 != 0) {
               return (var4 != 0);
            }

            if (var4 != 4) {
               return (0 != 0);
            }
         }

         var5 = 1;
      }

      return (var5 != 0);
   }

   private final boolean c(long var1) {
      int var3 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      int var10000 = this.d(var1);
      if (var3 != 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   private final double b(long var1, long var3) {
      int var5 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .b(var1)
         - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .b(var3);
      int var6 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(var1)
         - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(var3);
      int var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(var1)
         - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(var3);
      return var5 * var5 + var6 * var6 + var7 * var7;
   }

   private final byte d(long var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      byte var4 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI.get(var1);
      int var3 = var10000;
      var10000 = var4;
      if (var3 == 0) {
         if (var4 != -1) {
            return var4;
         }

         var10000 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .b(var1);
      }

      int var5;
      int var6;
      int var7;
      label42: {
         label41: {
            var5 = var10000;
            var6 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c(var1);
            var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var1);
            int var8 = var5 >> 4;
            int var9 = var7 >> 4;
            var10000 = var8;
            if (var3 == 0) {
               if (var8 == IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) {
                  if (var3 != 0) {
                     break label42;
                  }

                  if (var9 == IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI) {
                     break label41;
                  }
               }

               lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = this.h().getChunk(var8, var9, ChunkStatus.FULL, false);
               IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var8;
               var10000 = var9;
            }

            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var10000;
         }

         boolean var15 = false;
      }

      byte var10;
      label31: {
         label30: {
            ChunkAccess var11 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
            ChunkAccess var16 = var11;
            if (var3 == 0) {
               if (var11 == null) {
                  break label30;
               }

               llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.set(var5, var6, var7);
               var16 = var11;
            }

            BlockState var17 = var16.getBlockState(llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI);
            short var10002 = -5603;
            short var10003 = 23927;
            Intrinsics.checkNotNullExpressionValue(var17, "getBlockState(...)");
            BlockState var12 = var17;
            var10 = this.a(var12, llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI);
            if (var3 == 0) {
               break label31;
            }
         }

         var10 = lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI.get(var1);
      }

      ((Map)lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI).put(var1, var10);
      return var10;
   }

   private final byte a(BlockState var1, BlockPos var2) {
      int var3;
      BlockState var5;
      label117: {
         var3 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         boolean var10000 = var1.isAir();
         if (var3 == 0) {
            if (var10000) {
               return 0;
            }

            var5 = var1;
            if (var3 != 0) {
               break label117;
            }

            var10000 = var1.getCollisionShape(this.h(), var2).isEmpty();
         }

         if (var10000) {
            return 0;
         }

         var5 = var1;
      }

      Block var6 = var5.getBlock();
      short var10002 = -5602;
      short var10003 = 11221;
      Intrinsics.checkNotNullExpressionValue(var6, "getBlock(...)");
      Block var4 = var6;
      byte var7 = ((byte)((var4 instanceof SlabBlock) ? 1 : 0));
      if (var3 == 0) {
         if (var7 != 0 && var1.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) {
            return 2;
         }

         var7 = ((byte)((var4 instanceof StairBlock) ? 1 : 0));
      }

      if (var3 == 0) {
         if (var7 != 0) {
            return (byte)(var1.getValue(StairBlock.HALF) == Half.BOTTOM ? 3 : 1);
         }

         var7 = ((byte)((var4 instanceof CarpetBlock) ? 1 : 0));
      }

      if (var3 == 0) {
         if (var7 != 0) {
            return 4;
         }

         var7 = ((byte)((var4 instanceof FenceBlock) ? 1 : 0));
      }

      if (var3 == 0) {
         if (var7 == 0) {
            byte var8 = ((byte)((var4 instanceof FenceGateBlock) ? 1 : 0));
            if (var3 != 0) {
               return var8;
            }

            label85:
            if (var8 == 0) {
               int var9 = ((var4 instanceof WallBlock) ? 1 : 0);
               if (var3 == 0) {
                  if (var9 != 0) {
                     break label85;
                  }

                  var9 = ((var1.getFluidState().isEmpty()) ? 1 : 0);
               }

               if (var3 == 0) {
                  if (var9 == 0) {
                     return 5;
                  }

                  var9 = ((var4 instanceof SnowLayerBlock) ? 1 : 0);
               }

               if (var3 == 0) {
                  if (var9 != 0) {
                     int var10 = var1.getValue(SnowLayerBlock.LAYERS);
                     if (var3 == 0) {
                        switch (var10) {
                           case 1:
                              return 7;
                           case 2:
                              return 8;
                           case 3:
                              return 9;
                           case 4:
                              return 10;
                           case 5:
                              return 11;
                           case 6:
                              return 12;
                           case 7:
                              return 13;
                           default:
                              var10 = 14;
                        }
                     }

                     return (byte)var10;
                  }

                  var9 = ((Intrinsics.areEqual(var4, Blocks.SNOW)) ? 1 : 0);
               }

               if (var3 == 0) {
                  var9 = var9 != 0 ? 15 : 1;
               }

               return (byte)var9;
            }
         }

         var7 = 6;
      }

      return var7;
   }

   private final void b(boolean var1) {
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      double var10000 = (System.nanoTime() - llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) / 1000000.0;
      short var10001 = -5610;
      short var10002 = 21645;
      String var3 = "Total calculation time: " + var10000;
      if (var2 != 0) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var3);
         if (var1) {
            short var4 = -5601;
            var10001 = -23506;
            var3 = "SUCCESS";
         } else {
            short var5 = -5604;
            var10001 = 3068;
            var3 = "FAIL";
         }
      }

      var10001 = -5611;
      var10002 = 16273;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("RESULT: " + var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var28 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "Ch\u0018x¬Øo\u00877\r@\u0016\u0092hÀ\u0088R-\u0004y\\gP\u0007\u008c\u000fd£Û¾½\r\u0004[ð\u001e±\u0014Ì\u001e8dúp/\u0005í\u0083N\u0006É\u0004b\u0012)R\u0007kÀ<\u008fZ\u0086\u0085\u00070ÓWí7Ê(\bbô\u0088Ø]\u0002,Ë\u0005\u001a«°\u0003\u0016";
      int var4 = "Ch\u0018x¬Øo\u00877\r@\u0016\u0092hÀ\u0088R-\u0004y\\gP\u0007\u008c\u000fd£Û¾½\r\u0004[ð\u001e±\u0014Ì\u001e8dúp/\u0005í\u0083N\u0006É\u0004b\u0012)R\u0007kÀ<\u008fZ\u0086\u0085\u00070ÓWí7Ê(\bbô\u0088Ø]\u0002,Ë\u0005\u001a«°\u0003\u0016"
         .length();
      char var1 = 18;
      int var11 = -1;

      label52:
      while (true) {
         byte var10000 = 69;
         String var10001 = var2.substring(++var11, var11 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var32 = var10001.toCharArray();
               int var10004 = var32.length;
               int var6 = 0;
               byte var35 = var10000;
               var28 = var32;
               int var22 = var10004;
               byte var40;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var32;
                  var40 = var10000;
                  var10006 = var6;
               } else {
                  var35 = var10000;
                  var22 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var44 = var32;
                  var40 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var44[var10006] = (char)(var44[var10006] ^ var40 ^ switch (var6 % 7) {
                     case 0 -> 59;
                     case 1 -> 8;
                     case 2 -> 5;
                     case 3 -> 18;
                     case 4 -> 116;
                     case 5 -> 29;
                     default -> 27;
                  });
                  var6++;
                  if (var35 == 0) {
                     var10006 = var35;
                     var44 = var28;
                     var40 = var35;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var44 = var28;
                     var40 = var35;
                     var10006 = var6;
                  }
               }
            }

            String var37 = new String(var28).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var37;
                  if ((var11 += var1) >= var4) {
                     c = var5;
                     d = new String[12];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new Byte2DoubleOpenHashMap();
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)0, 1.0);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)1, 1.0);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)2, 0.5);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)3, 1.0);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)4, 0.0625);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)5, 1.0);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)6, 1.1);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)7, 0.0);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)8, 0.125);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)9, 0.25);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)10, 0.375);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)11, 0.5);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)12, 0.625);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)13, 0.75);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)14, 0.875);
                     ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put((byte)15, 1.0);
                     IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] var7 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{
                        new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                           1, 0, 0
                        ),
                        new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                           -1, 0, 0
                        ),
                        new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                           0, 0, 1
                        ),
                        new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                           0, 0, -1
                        )
                     };
                     IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var7;
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new MutableBlockPos();
                     IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = Integer.MAX_VALUE;
                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = Integer.MAX_VALUE;
                     Long2ByteOpenHashMap var12 = new Long2ByteOpenHashMap();
                     boolean var9 = false;
                     var12.defaultReturnValue((byte)-1);
                     lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var12;
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new Long2ByteOpenHashMap();
                     IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new HashMap<>();
                     IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = new LongOpenHashSet();
                     Long2DoubleOpenHashMap var13 = new Long2DoubleOpenHashMap();
                     var9 = false;
                     var13.defaultReturnValue(Double.POSITIVE_INFINITY);
                     IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var13;
                     Long2LongOpenHashMap var14 = new Long2LongOpenHashMap();
                     var9 = false;
                     var14.defaultReturnValue(-1L);
                     lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = var14;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var11);
                  break;
               default:
                  var5[var3++] = var37;
                  if ((var11 += var1) < var4) {
                     var1 = var2.charAt(var11);
                     continue label52;
                  }

                  var2 = "\u0089¬2ã\u0018\u0086U\u0093Ñ»\u0083ë&þ\u0003Ó\\\u0014\u0000µuu\u0094&\u000bMS³j";
                  var4 = "\u0089¬2ã\u0018\u0086U\u0093Ñ»\u0083ë&þ\u0003Ó\\\u0014\u0000µuu\u0094&\u000bMS³j".length();
                  var1 = 4;
                  var11 = -1;
            }

            var10000 = 103;
            var10001 = var2.substring(++var11, var11 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -5603) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 177;
            case 1 -> 68;
            case 2 -> 124;
            case 3 -> 89;
            case 4 -> 130;
            case 5 -> 170;
            case 6 -> 155;
            case 7 -> 187;
            case 8 -> 249;
            case 9 -> 25;
            case 10 -> 217;
            case 11 -> 142;
            case 12 -> 20;
            case 13 -> 87;
            case 14 -> 52;
            case 15 -> 173;
            case 16 -> 174;
            case 17 -> 143;
            case 18 -> 236;
            case 19 -> 31;
            case 20 -> 85;
            case 21 -> 218;
            case 22 -> 33;
            case 23 -> 115;
            case 24 -> 58;
            case 25 -> 46;
            case 26 -> 237;
            case 27 -> 24;
            case 28 -> 67;
            case 29 -> 88;
            case 30 -> 192;
            case 31 -> 13;
            case 32 -> 104;
            case 33 -> 189;
            case 34 -> 110;
            case 35 -> 215;
            case 36 -> 125;
            case 37 -> 148;
            case 38 -> 41;
            case 39 -> 123;
            case 40 -> 129;
            case 41 -> 195;
            case 42 -> 162;
            case 43 -> 6;
            case 44 -> 19;
            case 45 -> 252;
            case 46 -> 238;
            case 47 -> 43;
            case 48 -> 98;
            case 49 -> 199;
            case 50 -> 138;
            case 51 -> 233;
            case 52 -> 17;
            case 53 -> 102;
            case 54 -> 111;
            case 55 -> 193;
            case 56 -> 140;
            case 57 -> 18;
            case 58 -> 61;
            case 59 -> 221;
            case 60 -> 194;
            case 61 -> 29;
            case 62 -> 213;
            case 63 -> 145;
            case 64 -> 106;
            case 65 -> 44;
            case 66 -> 212;
            case 67 -> 116;
            case 68 -> 11;
            case 69 -> 158;
            case 70 -> 190;
            case 71 -> 65;
            case 72 -> 83;
            case 73 -> 101;
            case 74 -> 23;
            case 75 -> 109;
            case 76 -> 241;
            case 77 -> 185;
            case 78 -> 169;
            case 79 -> 154;
            case 80 -> 78;
            case 81 -> 245;
            case 82 -> 26;
            case 83 -> 91;
            case 84 -> 70;
            case 85 -> 157;
            case 86 -> 132;
            case 87 -> 165;
            case 88 -> 150;
            case 89 -> 63;
            case 90 -> 54;
            case 91 -> 72;
            case 92 -> 94;
            case 93 -> 131;
            case 94 -> 146;
            case 95 -> 90;
            case 96 -> 163;
            case 97 -> 0;
            case 98 -> 232;
            case 99 -> 118;
            case 100 -> 40;
            case 101 -> 120;
            case 102 -> 228;
            case 103 -> 36;
            case 104 -> 167;
            case 105 -> 34;
            case 106 -> 50;
            case 107 -> 175;
            case 108 -> 47;
            case 109 -> 107;
            case 110 -> 71;
            case 111 -> 10;
            case 112 -> 1;
            case 113 -> 211;
            case 114 -> 84;
            case 115 -> 235;
            case 116 -> 239;
            case 117 -> 45;
            case 118 -> 81;
            case 119 -> 247;
            case 120 -> 76;
            case 121 -> 243;
            case 122 -> 184;
            case 123 -> 216;
            case 124 -> 2;
            case 125 -> 227;
            case 126 -> 21;
            case 127 -> 128;
            case 128 -> 206;
            case 129 -> 93;
            case 130 -> 51;
            case 131 -> 56;
            case 132 -> 137;
            case 133 -> 222;
            case 134 -> 100;
            case 135 -> 38;
            case 136 -> 37;
            case 137 -> 35;
            case 138 -> 105;
            case 139 -> 176;
            case 140 -> 113;
            case 141 -> 200;
            case 142 -> 203;
            case 143 -> 12;
            case 144 -> 254;
            case 145 -> 127;
            case 146 -> 39;
            case 147 -> 251;
            case 148 -> 144;
            case 149 -> 240;
            case 150 -> 214;
            case 151 -> 4;
            case 152 -> 152;
            case 153 -> 210;
            case 154 -> 234;
            case 155 -> 207;
            case 156 -> 3;
            case 157 -> 204;
            case 158 -> 242;
            case 159 -> 99;
            case 160 -> 122;
            case 161 -> 229;
            case 162 -> 108;
            case 163 -> 117;
            case 164 -> 223;
            case 165 -> 126;
            case 166 -> 244;
            case 167 -> 30;
            case 168 -> 179;
            case 169 -> 225;
            case 170 -> 197;
            case 171 -> 5;
            case 172 -> 226;
            case 173 -> 224;
            case 174 -> 153;
            case 175 -> 119;
            case 176 -> 172;
            case 177 -> 147;
            case 178 -> 75;
            case 179 -> 79;
            case 180 -> 191;
            case 181 -> 230;
            case 182 -> 121;
            case 183 -> 22;
            case 184 -> 97;
            case 185 -> 133;
            case 186 -> 151;
            case 187 -> 64;
            case 188 -> 134;
            case 189 -> 86;
            case 190 -> 186;
            case 191 -> 166;
            case 192 -> 28;
            case 193 -> 112;
            case 194 -> 202;
            case 195 -> 198;
            case 196 -> 159;
            case 197 -> 160;
            case 198 -> 55;
            case 199 -> 188;
            case 200 -> 60;
            case 201 -> 139;
            case 202 -> 183;
            case 203 -> 48;
            case 204 -> 96;
            case 205 -> 42;
            case 206 -> 178;
            case 207 -> 208;
            case 208 -> 62;
            case 209 -> 248;
            case 210 -> 246;
            case 211 -> 27;
            case 212 -> 135;
            case 213 -> 182;
            case 214 -> 220;
            case 215 -> 181;
            case 216 -> 201;
            case 217 -> 8;
            case 218 -> 255;
            case 219 -> 161;
            case 220 -> 219;
            case 221 -> 32;
            case 222 -> 14;
            case 223 -> 180;
            case 224 -> 205;
            case 225 -> 57;
            case 226 -> 7;
            case 227 -> 49;
            case 228 -> 74;
            case 229 -> 77;
            case 230 -> 196;
            case 231 -> 253;
            case 232 -> 114;
            case 233 -> 156;
            case 234 -> 69;
            case 235 -> 209;
            case 236 -> 66;
            case 237 -> 168;
            case 238 -> 136;
            case 239 -> 53;
            case 240 -> 231;
            case 241 -> 73;
            case 242 -> 141;
            case 243 -> 164;
            case 244 -> 80;
            case 245 -> 250;
            case 246 -> 9;
            case 247 -> 103;
            case 248 -> 149;
            case 249 -> 92;
            case 250 -> 16;
            case 251 -> 171;
            case 252 -> 15;
            case 253 -> 82;
            case 254 -> 59;
            default -> 95;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final byte lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(long var1, byte var3, double var4, double var6) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
      }

      public final long a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final byte b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void a(double var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      public final double d() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void b(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }
   }

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(int var1, int var2, int var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         int var1, int var2, int var3
      ) {
         return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 29328;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 13248;
         short var10002 = 29331;
         short var10003 = -23319;
         short var10004 = 29329;
         short var10005 = -23132;
         return "Offset(x=" + var3 + ", y=" + var2 + ", z=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 == 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var2 != 0) {
               return (boolean)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != 0);
            }

            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "Ù ÁÆ\t\u0016¸+\u0005Îu¦;î\u0004¼\tnó";
         int var4 = "Ù ÁÆ\t\u0016¸+\u0005Îu¦;î\u0004¼\tnó".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 105;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 105;
                  var10006 = var6;
               } else {
                  var13 = 105;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 105;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 112;
                     case 1 -> 4;
                     case 2 -> 99;
                     case 3 -> 15;
                     case 4 -> 76;
                     case 5 -> 25;
                     default -> 83;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[3];
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 29329) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 115;
               case 1 -> 151;
               case 2 -> 209;
               case 3 -> 215;
               case 4 -> 216;
               case 5 -> 135;
               case 6 -> 50;
               case 7 -> 71;
               case 8 -> 49;
               case 9 -> 185;
               case 10 -> 29;
               case 11 -> 233;
               case 12 -> 82;
               case 13 -> 56;
               case 14 -> 214;
               case 15 -> 128;
               case 16 -> 231;
               case 17 -> 62;
               case 18 -> 48;
               case 19 -> 79;
               case 20 -> 136;
               case 21 -> 85;
               case 22 -> 97;
               case 23 -> 192;
               case 24 -> 113;
               case 25 -> 250;
               case 26 -> 43;
               case 27 -> 53;
               case 28 -> 226;
               case 29 -> 139;
               case 30 -> 106;
               case 31 -> 95;
               case 32 -> 189;
               case 33 -> 146;
               case 34 -> 168;
               case 35 -> 249;
               case 36 -> 174;
               case 37 -> 246;
               case 38 -> 253;
               case 39 -> 223;
               case 40 -> 130;
               case 41 -> 255;
               case 42 -> 176;
               case 43 -> 11;
               case 44 -> 110;
               case 45 -> 183;
               case 46 -> 200;
               case 47 -> 123;
               case 48 -> 105;
               case 49 -> 170;
               case 50 -> 193;
               case 51 -> 154;
               case 52 -> 59;
               case 53 -> 47;
               case 54 -> 178;
               case 55 -> 237;
               case 56 -> 221;
               case 57 -> 142;
               case 58 -> 212;
               case 59 -> 60;
               case 60 -> 182;
               case 61 -> 45;
               case 62 -> 18;
               case 63 -> 243;
               case 64 -> 37;
               case 65 -> 112;
               case 66 -> 17;
               case 67 -> 101;
               case 68 -> 31;
               case 69 -> 99;
               case 70 -> 104;
               case 71 -> 54;
               case 72 -> 205;
               case 73 -> 247;
               case 74 -> 225;
               case 75 -> 116;
               case 76 -> 89;
               case 77 -> 156;
               case 78 -> 33;
               case 79 -> 80;
               case 80 -> 228;
               case 81 -> 242;
               case 82 -> 7;
               case 83 -> 150;
               case 84 -> 44;
               case 85 -> 248;
               case 86 -> 94;
               case 87 -> 0;
               case 88 -> 16;
               case 89 -> 251;
               case 90 -> 73;
               case 91 -> 92;
               case 92 -> 210;
               case 93 -> 8;
               case 94 -> 90;
               case 95 -> 58;
               case 96 -> 134;
               case 97 -> 218;
               case 98 -> 46;
               case 99 -> 232;
               case 100 -> 42;
               case 101 -> 145;
               case 102 -> 32;
               case 103 -> 201;
               case 104 -> 3;
               case 105 -> 81;
               case 106 -> 165;
               case 107 -> 224;
               case 108 -> 127;
               case 109 -> 66;
               case 110 -> 39;
               case 111 -> 132;
               case 112 -> 40;
               case 113 -> 203;
               case 114 -> 70;
               case 115 -> 77;
               case 116 -> 144;
               case 117 -> 194;
               case 118 -> 202;
               case 119 -> 229;
               case 120 -> 72;
               case 121 -> 15;
               case 122 -> 152;
               case 123 -> 153;
               case 124 -> 211;
               case 125 -> 147;
               case 126 -> 254;
               case 127 -> 179;
               case 128 -> 87;
               case 129 -> 235;
               case 130 -> 103;
               case 131 -> 199;
               case 132 -> 9;
               case 133 -> 197;
               case 134 -> 65;
               case 135 -> 140;
               case 136 -> 167;
               case 137 -> 227;
               case 138 -> 4;
               case 139 -> 137;
               case 140 -> 149;
               case 141 -> 111;
               case 142 -> 57;
               case 143 -> 67;
               case 144 -> 160;
               case 145 -> 195;
               case 146 -> 125;
               case 147 -> 102;
               case 148 -> 198;
               case 149 -> 143;
               case 150 -> 5;
               case 151 -> 190;
               case 152 -> 88;
               case 153 -> 118;
               case 154 -> 166;
               case 155 -> 12;
               case 156 -> 241;
               case 157 -> 239;
               case 158 -> 25;
               case 159 -> 100;
               case 160 -> 187;
               case 161 -> 19;
               case 162 -> 38;
               case 163 -> 63;
               case 164 -> 157;
               case 165 -> 96;
               case 166 -> 20;
               case 167 -> 30;
               case 168 -> 141;
               case 169 -> 220;
               case 170 -> 252;
               case 171 -> 22;
               case 172 -> 108;
               case 173 -> 34;
               case 174 -> 244;
               case 175 -> 10;
               case 176 -> 52;
               case 177 -> 107;
               case 178 -> 181;
               case 179 -> 36;
               case 180 -> 163;
               case 181 -> 75;
               case 182 -> 222;
               case 183 -> 122;
               case 184 -> 120;
               case 185 -> 64;
               case 186 -> 98;
               case 187 -> 171;
               case 188 -> 245;
               case 189 -> 24;
               case 190 -> 191;
               case 191 -> 69;
               case 192 -> 184;
               case 193 -> 138;
               case 194 -> 208;
               case 195 -> 41;
               case 196 -> 219;
               case 197 -> 240;
               case 198 -> 204;
               case 199 -> 162;
               case 200 -> 114;
               case 201 -> 76;
               case 202 -> 155;
               case 203 -> 35;
               case 204 -> 1;
               case 205 -> 169;
               case 206 -> 55;
               case 207 -> 196;
               case 208 -> 133;
               case 209 -> 159;
               case 210 -> 186;
               case 211 -> 74;
               case 212 -> 236;
               case 213 -> 93;
               case 214 -> 6;
               case 215 -> 188;
               case 216 -> 177;
               case 217 -> 119;
               case 218 -> 213;
               case 219 -> 124;
               case 220 -> 78;
               case 221 -> 238;
               case 222 -> 84;
               case 223 -> 175;
               case 224 -> 91;
               case 225 -> 180;
               case 226 -> 117;
               case 227 -> 2;
               case 228 -> 121;
               case 229 -> 158;
               case 230 -> 172;
               case 231 -> 68;
               case 232 -> 207;
               case 233 -> 86;
               case 234 -> 234;
               case 235 -> 28;
               case 236 -> 126;
               case 237 -> 109;
               case 238 -> 129;
               case 239 -> 26;
               case 240 -> 23;
               case 241 -> 230;
               case 242 -> 131;
               case 243 -> 161;
               case 244 -> 217;
               case 245 -> 61;
               case 246 -> 206;
               case 247 -> 13;
               case 248 -> 21;
               case 249 -> 51;
               case 250 -> 164;
               case 251 -> 173;
               case 252 -> 27;
               case 253 -> 83;
               case 254 -> 148;
               default -> 14;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0, int var1, int var2, int var3, int var4, java.lang.Object var5) {
         int var6 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         if ((var4 & 1) != 0) {
            if (var6 != 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var4 & 2) != 0) {
            if (var6 != 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var4 & 4) != 0) {
            if (var6 != 0) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         return var0.a(var1, var2, var3);
      }
}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final ArrayList<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
      @NotNull
      private final Long2IntOpenHashMap lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Long2IntOpenHashMap();
      private static String[] a;
      private static String[] b;

      public final void a(
         @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
      ) {
         short var10001 = -19612;
         short var10002 = 726;
         Intrinsics.checkNotNullParameter(var1, "node");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var1);
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1;
         ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var1.a(), var2);
         this.a(var2);
      }

      @NotNull
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a() {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         Object var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(0);
         short var10003 = -19609;
         short var10004 = -1179;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10001;
         int var1 = var10000;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var2.a());
         Object var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() == 1) {
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.remove(0);
               return var2;
            }

            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .remove(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1);
            short var10002 = -19610;
            var10003 = 16952;
            Intrinsics.checkNotNullExpressionValue(var4, "removeAt(...)");
         }

         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var4;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(0, var3);
         ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var3.a(), 0);
         this.b(0);
         return var2;
      }

      public final void b() {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.clear();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      }

      public final boolean a(long var1) {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var1);
      }

      public final boolean c() {
         int var1 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
         if (var1 == 0) {
            var10000 = !var10000;
         }

         return var10000;
      }

      public final void b(
         @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
      ) {
         short var10001 = -19614;
         short var10002 = -20449;
         Intrinsics.checkNotNullParameter(var1, "node");
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1.a());
         double var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var3).d();
         int var2 = var10000;
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = this;
         if (var2 != 0) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var1);
            if (var1.d() < var4) {
               this.a(var3);
               if (var2 != 0) {
                  return;
               }
            }

            var6 = this;
         }

         var6.b(var3);
      }

      private final void a(int var1) {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         int var3 = var1;
         int var2 = var10000;
         Object var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10002 = -19611;
         short var10003 = -7424;
         Intrinsics.checkNotNullExpressionValue(var7, "get(...)");
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var7;

         while (var3 > 0) {
            int var5 = (var3 - 1) / 2;
            Object var8 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var5);
            var10002 = -19609;
            var10003 = -1179;
            Intrinsics.checkNotNullExpressionValue(var8, "get(...)");
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var8;
            double var12;
            var10000 = (var12 = var6.d() - var4.d()) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
            if (var2 != 0) {
               if (var10000 <= 0) {
                  break;
               }

               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var6);
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var5, var4);
               ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var6.a(), var3);
               ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var4.a(), var5);
               var10000 = var5;
            }

            var3 = var10000;
            if (var2 == 0) {
               break;
            }
         }
      }

      private final void b(int var1) {
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var12 = null; // PX-FIX
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         int var3 = var1;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
         int var2 = var10000;
         Object var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10002 = -19609;
         short var10003 = -1179;
         Intrinsics.checkNotNullExpressionValue(var10, "get(...)");
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10;

         do {
            int var8;
            label55: {
               label56: {
                  int var10001;
                  label57: {
                     label46: {
                        int var6 = 2 * var3 + 1;
                        int var7 = 2 * var3 + 2;
                        var8 = -1;
                        if (var6 < var4) {
                           var8 = var6;
                           var10000 = var7;
                           var10001 = var4;
                           if (var2 == 0 || var2 == 0) {
                              break label57;
                           }

                           if (var7 < var4) {
                              double var16;
                              var10000 = (
                                       var16 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var7).d()
                                          - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var6).d()
                                    )
                                    == 0.0
                                 ? 0
                                 : (var16 < 0.0 ? -1 : 1);
                              if (var2 == 0) {
                                 break label46;
                              }

                              if (var10000 < 0) {
                                 var8 = var7;
                              }
                           }
                        }

                        var10000 = var8;
                     }

                     if (var2 == 0) {
                        break label56;
                     }

                     var10001 = -1;
                  }

                  if (var10000 == var10001) {
                     break;
                  }

                  var12 = var5;
                  if (var2 == 0) {
                     break label55;
                  }

                  double var17;
                  var10000 = (var17 = var5.d() - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8).d())
                        == 0.0
                     ? 0
                     : (var17 < 0.0 ? -1 : 1);
               }

               if (var10000 <= 0) {
                  break;
               }

               Object var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8);
               var10002 = -19609;
               var10003 = -1179;
               Intrinsics.checkNotNullExpressionValue(var13, "get(...)");
               var12 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var13;
            }

            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var9 = var12;
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var9);
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var8, var5);
            ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var9.a(), var3);
            ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var5.a(), var8);
            var3 = var8;
         } while (var2 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "2u\u0003;ülÕ\u009d\u0002sp\u0081 \bî 6Ö85qÉ\u0004¦\u0081\u0007ä";
         int var4 = "2u\u0003;ülÕ\u009d\u0002sp\u0081 \bî 6Ö85qÉ\u0004¦\u0081\u0007ä".length();
         char var1 = '\r';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 32;
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
                        case 0 -> 65;
                        case 1 -> 27;
                        case 2 -> 24;
                        case 3 -> 116;
                        case 4 -> 13;
                        case 5 -> 70;
                        default -> 54;
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
                        b = new String[5];
                        break pxClinit; // PX-FIX
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "hÏ\u008aGÃkbn\u0004 T«2";
                     var4 = "hÏ\u008aGÃkbn\u0004 T«2".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 64;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -19610) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 176;
               case 1 -> 170;
               case 2 -> 204;
               case 3 -> 20;
               case 4 -> 19;
               case 5 -> 234;
               case 6 -> 92;
               case 7 -> 225;
               case 8 -> 26;
               case 9 -> 57;
               case 10 -> 181;
               case 11 -> 210;
               case 12 -> 246;
               case 13 -> 38;
               case 14 -> 116;
               case 15 -> 153;
               case 16 -> 52;
               case 17 -> 49;
               case 18 -> 46;
               case 19 -> 251;
               case 20 -> 122;
               case 21 -> 34;
               case 22 -> 7;
               case 23 -> 233;
               case 24 -> 37;
               case 25 -> 220;
               case 26 -> 221;
               case 27 -> 136;
               case 28 -> 240;
               case 29 -> 115;
               case 30 -> 61;
               case 31 -> 88;
               case 32 -> 238;
               case 33 -> 40;
               case 34 -> 141;
               case 35 -> 9;
               case 36 -> 99;
               case 37 -> 66;
               case 38 -> 63;
               case 39 -> 150;
               case 40 -> 254;
               case 41 -> 134;
               case 42 -> 124;
               case 43 -> 56;
               case 44 -> 2;
               case 45 -> 135;
               case 46 -> 69;
               case 47 -> 216;
               case 48 -> 193;
               case 49 -> 219;
               case 50 -> 110;
               case 51 -> 36;
               case 52 -> 211;
               case 53 -> 98;
               case 54 -> 151;
               case 55 -> 230;
               case 56 -> 70;
               case 57 -> 237;
               case 58 -> 152;
               case 59 -> 140;
               case 60 -> 205;
               case 61 -> 213;
               case 62 -> 29;
               case 63 -> 118;
               case 64 -> 214;
               case 65 -> 253;
               case 66 -> 245;
               case 67 -> 31;
               case 68 -> 77;
               case 69 -> 160;
               case 70 -> 79;
               case 71 -> 113;
               case 72 -> 117;
               case 73 -> 10;
               case 74 -> 228;
               case 75 -> 35;
               case 76 -> 33;
               case 77 -> 182;
               case 78 -> 102;
               case 79 -> 101;
               case 80 -> 39;
               case 81 -> 215;
               case 82 -> 5;
               case 83 -> 23;
               case 84 -> 188;
               case 85 -> 47;
               case 86 -> 184;
               case 87 -> 239;
               case 88 -> 95;
               case 89 -> 197;
               case 90 -> 195;
               case 91 -> 27;
               case 92 -> 18;
               case 93 -> 121;
               case 94 -> 60;
               case 95 -> 64;
               case 96 -> 241;
               case 97 -> 138;
               case 98 -> 112;
               case 99 -> 48;
               case 100 -> 252;
               case 101 -> 164;
               case 102 -> 74;
               case 103 -> 232;
               case 104 -> 235;
               case 105 -> 242;
               case 106 -> 22;
               case 107 -> 11;
               case 108 -> 123;
               case 109 -> 53;
               case 110 -> 4;
               case 111 -> 8;
               case 112 -> 236;
               case 113 -> 198;
               case 114 -> 144;
               case 115 -> 131;
               case 116 -> 175;
               case 117 -> 196;
               case 118 -> 132;
               case 119 -> 156;
               case 120 -> 75;
               case 121 -> 147;
               case 122 -> 187;
               case 123 -> 133;
               case 124 -> 17;
               case 125 -> 174;
               case 126 -> 96;
               case 127 -> 207;
               case 128 -> 25;
               case 129 -> 137;
               case 130 -> 105;
               case 131 -> 146;
               case 132 -> 55;
               case 133 -> 157;
               case 134 -> 93;
               case 135 -> 90;
               case 136 -> 50;
               case 137 -> 86;
               case 138 -> 226;
               case 139 -> 172;
               case 140 -> 173;
               case 141 -> 229;
               case 142 -> 130;
               case 143 -> 125;
               case 144 -> 186;
               case 145 -> 44;
               case 146 -> 168;
               case 147 -> 106;
               case 148 -> 142;
               case 149 -> 16;
               case 150 -> 42;
               case 151 -> 243;
               case 152 -> 103;
               case 153 -> 127;
               case 154 -> 171;
               case 155 -> 120;
               case 156 -> 189;
               case 157 -> 180;
               case 158 -> 129;
               case 159 -> 119;
               case 160 -> 68;
               case 161 -> 80;
               case 162 -> 73;
               case 163 -> 67;
               case 164 -> 1;
               case 165 -> 190;
               case 166 -> 162;
               case 167 -> 169;
               case 168 -> 81;
               case 169 -> 126;
               case 170 -> 155;
               case 171 -> 128;
               case 172 -> 139;
               case 173 -> 185;
               case 174 -> 109;
               case 175 -> 158;
               case 176 -> 159;
               case 177 -> 154;
               case 178 -> 222;
               case 179 -> 12;
               case 180 -> 54;
               case 181 -> 0;
               case 182 -> 91;
               case 183 -> 108;
               case 184 -> 202;
               case 185 -> 58;
               case 186 -> 51;
               case 187 -> 200;
               case 188 -> 3;
               case 189 -> 167;
               case 190 -> 208;
               case 191 -> 179;
               case 192 -> 71;
               case 193 -> 43;
               case 194 -> 78;
               case 195 -> 218;
               case 196 -> 28;
               case 197 -> 14;
               case 198 -> 244;
               case 199 -> 45;
               case 200 -> 76;
               case 201 -> 166;
               case 202 -> 199;
               case 203 -> 255;
               case 204 -> 59;
               case 205 -> 104;
               case 206 -> 206;
               case 207 -> 21;
               case 208 -> 13;
               case 209 -> 62;
               case 210 -> 15;
               case 211 -> 178;
               case 212 -> 143;
               case 213 -> 100;
               case 214 -> 192;
               case 215 -> 227;
               case 216 -> 83;
               case 217 -> 6;
               case 218 -> 194;
               case 219 -> 247;
               case 220 -> 248;
               case 221 -> 107;
               case 222 -> 87;
               case 223 -> 30;
               case 224 -> 72;
               case 225 -> 24;
               case 226 -> 94;
               case 227 -> 65;
               case 228 -> 201;
               case 229 -> 84;
               case 230 -> 209;
               case 231 -> 145;
               case 232 -> 82;
               case 233 -> 161;
               case 234 -> 231;
               case 235 -> 148;
               case 236 -> 111;
               case 237 -> 163;
               case 238 -> 223;
               case 239 -> 149;
               case 240 -> 89;
               case 241 -> 224;
               case 242 -> 203;
               case 243 -> 97;
               case 244 -> 32;
               case 245 -> 212;
               case 246 -> 41;
               case 247 -> 191;
               case 248 -> 114;
               case 249 -> 85;
               case 250 -> 165;
               case 251 -> 183;
               case 252 -> 217;
               case 253 -> 250;
               case 254 -> 249;
               default -> 177;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvBase IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, int var2, int var3, int var4) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      }

      public final int a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int b() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int c() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int d() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean a(long var1) {
         int var3;
         int var10;
         label48: {
            var10 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
            int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var3 = var10;
            int var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            int var6 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .b(var1);
            var10 = var4;
            int var10001 = var6;
            if (var3 != 0) {
               if (var4 > var6) {
                  var10 = 0;
                  break label48;
               }

               var10 = var6;
               if (var3 == 0) {
                  break label48;
               }

               var10001 = var5;
            }

            var10 = var10 <= var10001 ? 1 : 0;
         }

         if (var10 != 0) {
            label37: {
               int var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               int var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               int var9 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .d(var1);
               var10 = var7;
               int var13 = var9;
               if (var3 != 0) {
                  if (var7 > var9) {
                     var10 = 0;
                     break label37;
                  }

                  var10 = var9;
                  if (var3 == 0) {
                     break label37;
                  }

                  var13 = var8;
               }

               var10 = var10 <= var13 ? 1 : 0;
            }

            if (var10 != 0) {
               return true;
            }
         }

         return false;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int g() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int h() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2, int var3, int var4
      ) {
         return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 4619;
         int var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = 15635;
         short var10002 = 4618;
         short var10003 = -8994;
         short var10004 = 4616;
         short var10005 = 9530;
         short var10006 = 4617;
         short var10007 = -249;
         return "Bounds(minX=" + var4 + ", maxX=" + var3 + ", minZ=" + var2 + ", maxZ=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var1 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 != 0) {
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var2 == 0) {
               return (boolean)(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != 0);
            }

            var10001 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "b\u007fBõJVT\u0007\u0001+.wÑ\u000fó";
         int var4 = "b\u007fBõJVT\u0007\u0001+.wÑ\u000fó".length();
         char var1 = 7;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 68;
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
                        case 0 -> 96;
                        case 1 -> 78;
                        case 2 -> 10;
                        case 3 -> 82;
                        case 4 -> 33;
                        case 5 -> 112;
                        default -> 107;
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
                        b = new String[4];
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.PXEvBase(
            (kotlin.jvm.internal.DefaultConstructorMarker)null
                        );
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE
                        );
                        break pxClinit; // PX-FIX
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "º\u009e\u0093\u000b¬H\u0096\fÖ\u0083¥\u0001mÌ$\u0081å\u009e=+";
                     var4 = "º\u009e\u0093\u000b¬H\u0096\fÖ\u0083¥\u0001mÌ$\u0081å\u009e=+".length();
                     var1 = 7;
                     var8 = -1;
               }

               var10000 = 107;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 4616) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 86;
               case 1 -> 202;
               case 2 -> 191;
               case 3 -> 81;
               case 4 -> 227;
               case 5 -> 8;
               case 6 -> 16;
               case 7 -> 163;
               case 8 -> 243;
               case 9 -> 42;
               case 10 -> 9;
               case 11 -> 72;
               case 12 -> 204;
               case 13 -> 119;
               case 14 -> 94;
               case 15 -> 24;
               case 16 -> 213;
               case 17 -> 178;
               case 18 -> 49;
               case 19 -> 121;
               case 20 -> 146;
               case 21 -> 196;
               case 22 -> 41;
               case 23 -> 237;
               case 24 -> 102;
               case 25 -> 187;
               case 26 -> 206;
               case 27 -> 117;
               case 28 -> 5;
               case 29 -> 55;
               case 30 -> 247;
               case 31 -> 125;
               case 32 -> 85;
               case 33 -> 111;
               case 34 -> 244;
               case 35 -> 233;
               case 36 -> 221;
               case 37 -> 254;
               case 38 -> 162;
               case 39 -> 43;
               case 40 -> 179;
               case 41 -> 73;
               case 42 -> 20;
               case 43 -> 103;
               case 44 -> 167;
               case 45 -> 199;
               case 46 -> 108;
               case 47 -> 165;
               case 48 -> 140;
               case 49 -> 136;
               case 50 -> 53;
               case 51 -> 133;
               case 52 -> 183;
               case 53 -> 219;
               case 54 -> 251;
               case 55 -> 59;
               case 56 -> 12;
               case 57 -> 109;
               case 58 -> 249;
               case 59 -> 47;
               case 60 -> 76;
               case 61 -> 245;
               case 62 -> 186;
               case 63 -> 210;
               case 64 -> 159;
               case 65 -> 253;
               case 66 -> 141;
               case 67 -> 177;
               case 68 -> 240;
               case 69 -> 84;
               case 70 -> 208;
               case 71 -> 171;
               case 72 -> 143;
               case 73 -> 98;
               case 74 -> 105;
               case 75 -> 214;
               case 76 -> 123;
               case 77 -> 36;
               case 78 -> 44;
               case 79 -> 217;
               case 80 -> 197;
               case 81 -> 69;
               case 82 -> 239;
               case 83 -> 238;
               case 84 -> 11;
               case 85 -> 32;
               case 86 -> 78;
               case 87 -> 215;
               case 88 -> 80;
               case 89 -> 220;
               case 90 -> 142;
               case 91 -> 131;
               case 92 -> 114;
               case 93 -> 33;
               case 94 -> 6;
               case 95 -> 75;
               case 96 -> 22;
               case 97 -> 209;
               case 98 -> 112;
               case 99 -> 39;
               case 100 -> 91;
               case 101 -> 154;
               case 102 -> 166;
               case 103 -> 25;
               case 104 -> 157;
               case 105 -> 175;
               case 106 -> 135;
               case 107 -> 31;
               case 108 -> 26;
               case 109 -> 152;
               case 110 -> 138;
               case 111 -> 246;
               case 112 -> 168;
               case 113 -> 101;
               case 114 -> 60;
               case 115 -> 7;
               case 116 -> 37;
               case 117 -> 216;
               case 118 -> 137;
               case 119 -> 21;
               case 120 -> 95;
               case 121 -> 129;
               case 122 -> 97;
               case 123 -> 10;
               case 124 -> 195;
               case 125 -> 2;
               case 126 -> 92;
               case 127 -> 211;
               case 128 -> 67;
               case 129 -> 88;
               case 130 -> 200;
               case 131 -> 0;
               case 132 -> 115;
               case 133 -> 161;
               case 134 -> 93;
               case 135 -> 194;
               case 136 -> 192;
               case 137 -> 145;
               case 138 -> 106;
               case 139 -> 77;
               case 140 -> 181;
               case 141 -> 54;
               case 142 -> 48;
               case 143 -> 225;
               case 144 -> 149;
               case 145 -> 15;
               case 146 -> 201;
               case 147 -> 30;
               case 148 -> 164;
               case 149 -> 46;
               case 150 -> 185;
               case 151 -> 222;
               case 152 -> 83;
               case 153 -> 28;
               case 154 -> 52;
               case 155 -> 56;
               case 156 -> 230;
               case 157 -> 234;
               case 158 -> 203;
               case 159 -> 19;
               case 160 -> 63;
               case 161 -> 89;
               case 162 -> 104;
               case 163 -> 100;
               case 164 -> 172;
               case 165 -> 153;
               case 166 -> 148;
               case 167 -> 62;
               case 168 -> 127;
               case 169 -> 169;
               case 170 -> 236;
               case 171 -> 66;
               case 172 -> 113;
               case 173 -> 14;
               case 174 -> 252;
               case 175 -> 205;
               case 176 -> 139;
               case 177 -> 65;
               case 178 -> 99;
               case 179 -> 120;
               case 180 -> 212;
               case 181 -> 242;
               case 182 -> 45;
               case 183 -> 82;
               case 184 -> 13;
               case 185 -> 122;
               case 186 -> 126;
               case 187 -> 231;
               case 188 -> 158;
               case 189 -> 118;
               case 190 -> 235;
               case 191 -> 130;
               case 192 -> 3;
               case 193 -> 144;
               case 194 -> 57;
               case 195 -> 71;
               case 196 -> 124;
               case 197 -> 51;
               case 198 -> 74;
               case 199 -> 198;
               case 200 -> 224;
               case 201 -> 190;
               case 202 -> 160;
               case 203 -> 40;
               case 204 -> 23;
               case 205 -> 229;
               case 206 -> 68;
               case 207 -> 156;
               case 208 -> 174;
               case 209 -> 226;
               case 210 -> 96;
               case 211 -> 38;
               case 212 -> 184;
               case 213 -> 232;
               case 214 -> 189;
               case 215 -> 193;
               case 216 -> 241;
               case 217 -> 151;
               case 218 -> 27;
               case 219 -> 173;
               case 220 -> 255;
               case 221 -> 116;
               case 222 -> 17;
               case 223 -> 180;
               case 224 -> 34;
               case 225 -> 134;
               case 226 -> 50;
               case 227 -> 207;
               case 228 -> 248;
               case 229 -> 188;
               case 230 -> 223;
               case 231 -> 64;
               case 232 -> 110;
               case 233 -> 61;
               case 234 -> 1;
               case 235 -> 218;
               case 236 -> 18;
               case 237 -> 250;
               case 238 -> 107;
               case 239 -> 228;
               case 240 -> 170;
               case 241 -> 182;
               case 242 -> 79;
               case 243 -> 150;
               case 244 -> 70;
               case 245 -> 87;
               case 246 -> 147;
               case 247 -> 132;
               case 248 -> 4;
               case 249 -> 128;
               case 250 -> 176;
               case 251 -> 90;
               case 252 -> 155;
               case 253 -> 58;
               case 254 -> 29;
               default -> 35;
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

      public static final class PXEvBase {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvBase(Object... px) {
        }

         private PXEvBase() {
         }

         @NotNull
         public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a() {
            return IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
      
      // PX-FIX-ok: Kotlin synthetic default-ctor bridge (jar: <init>(DefaultConstructorMarker)V -> this())
      public PXEvBase(kotlin.jvm.internal.DefaultConstructorMarker var1) {
         this();
      }
}
   
      // PX-FIX-ok: synthetic accessor (jar: getstatic/areturn)
      public static final me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll i() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, int var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
         int var7 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         if ((var5 & 1) != 0) {
            if (var7 != 0) {
               var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var5 & 2) != 0) {
            if (var7 != 0) {
               var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         if ((var5 & 4) != 0) {
            if (var7 != 0) {
               var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }
         }
         if ((var5 & 8) != 0) {
            if (var7 != 0) {
               var4 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
         }
         return var0.a(var1, var2, var3, var4);
      }
}
}
