package me.octo.client.utils.player.pathfinder;

import it.unimi.dsi.fastutil.bytes.Byte2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.entity.Entity;
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
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static List a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, Object var1, boolean var2, int var3, Object var4) {
      int var5 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (var5 != 0 || (var3 & 2) != 0) {
         var2 = false;
      }

      return var0.a(var1, var2);
   }

   public static List a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, Object var1, BlockPos var2, boolean var3, int var4, Object var5) {
      int var6 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (var6 != 0 || (var4 & 4) != 0) {
         var3 = false;
      }

      return var0.a(var1, var2, var3);
   }

   @NotNull
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   public static byte IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   public static byte llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   public static byte lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   public static byte lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   public static byte lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   public static byte lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   public static byte IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   public static byte llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   public static byte IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   public static byte IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   public static byte IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   public static byte IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   public static byte llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   public static byte IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   public static byte lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   public static byte llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private static HashSet<Byte> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private static Byte2DoubleOpenHashMap IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private static Long2ByteOpenHashMap IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private static Long2DoubleOpenHashMap llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @NotNull
   private static HashMap<Long, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @NotNull
   private static Long2DoubleOpenHashMap IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @NotNull
   private static Long2DoubleOpenHashMap lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static long lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private static long IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @Nullable
   private static List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @NotNull
   private static MutableBlockPos IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   @Nullable
   private static ChunkAccess IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private static int IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private static int lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   private static boolean lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private static Long2ByteOpenHashMap lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private static me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private static HashMap<Long, List<Long>> llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private static boolean llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private static double IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private static String[] c;
   private static String[] d;

   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
   }

   @NotNull
   public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(
      @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var1
   ) {
      short var10001 = -18154;
      short var10002 = 6835;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   public final double h() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final void a(double var1) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }

   private final ClientLevel i() {
      ClientLevel var10000 = this.a().level;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @Nullable
   public final List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> j() {
      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   public final void a(
      @Nullable List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var1
   ) {
      IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = var1;
   }

   public final boolean k() {
      return lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   }

   public final void a(boolean var1) {
      lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = var1;
   }

   @NotNull
   public final Long2ByteOpenHashMap l() {
      return lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      int mode = PXEvMid.k();
      Intrinsics.checkNotNullParameter(param1, "event");

      var clientRegistry = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl
         .IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      var currentClient = clientRegistry.g();
      var comparisonClient = me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
         .IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean shouldRefresh = currentClient != IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
      if (mode != 0 && shouldRefresh) {
         shouldRefresh = clientRegistry.g() != comparisonClient;
      }

      if (shouldRefresh) {
         if (mode != 0 && !lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI) {
            return;
         }

         IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = clientRegistry.g();
         lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = false;
         lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.clear();
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
            .IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
         me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(() -> n());
      }

      var player = this.a().player;
      if (mode != 0 && player == null) {
         return;
      }

      try {
         boolean hasPath = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
            .IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .n() != null;
         llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = hasPath;
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
            .IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(hasPath);
      } catch (Exception ignored) {
         // The original handler returns after an Exception in this final state update.
      }
   }

   public final void a(@NotNull HashMap<BlockPos, List<BlockPos>> var1) { boolean var25 = false; // PX-FIX hoist
        
      Iterable var28 = null; // PX-FIX
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = -18160;
      short var10003 = -29159;
      Intrinsics.checkNotNullParameter(var1, "nonPackedCache");
      Map var4 = var1;
      boolean var5 = false;
      int var2 = var10000;
      var var7 = new ArrayList(var4.size());
      boolean var8 = false;
      Iterator var9 = var4.entrySet().iterator();

      while (true) {
         if (var9.hasNext()) {
            Entry var10 = (Entry)var9.next();
            boolean var12 = false;
            BlockPos var13 = (BlockPos)var10.getKey();
            List var14 = (List)var10.getValue();
            Long var27 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var13);
            Iterable var15 = var14;
            Long var16 = var27;
            boolean var17 = false;
            var var19 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var15, 10));
            boolean var20 = false;
            var28 = var15;
            if (var2 == 0) {
               break;
            }

            label27: {
               for (Object var22 : var15) {
                  BlockPos var23 = (BlockPos)var22;
                   var25 = false;
                  var19.add(
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var23)
                  );
                  if (var2 == 0) {
                     break label27;
                  }

                  if (var2 == 0) {
                     break;
                  }
               }

               var7.add(TuplesKt.to(var16, var19));
            }

            if (var2 != 0) {
               continue;
            }
         }

         var28 = var7;
         break;
      }

      HashMap var3 = (HashMap)MapsKt.toMap(var28, new HashMap());
      llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var3;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var3);
   }

   private final List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> a(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1
   ) {
      ArrayList var5 = null; // PX-FIX
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      ArrayList var3 = new ArrayList();
      int var2 = var10000;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var4 = var1;

      while (true) {
         if (var4 != null) {
            var5 = var3;
            if (var2 != 0) {
               break;
            }

            var3.add(var4);
            var4 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.get(var4.h());
            if (var2 == 0) {
               continue;
            }
         }

         var5 = ((ArrayList)(Object)(CollectionsKt.reversed(var3)));
         break;
      }

      return (List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll>)var5;
   }

   private final List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> b(
      List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> var1
   ) {
      Object var24 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      ArrayList var3 = new ArrayList();
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      var3.add(
         new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .e(
                  ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)CollectionsKt.first(
                        var1
                     ))
                     .a()
               ),
            c(
               (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)CollectionsKt.first(
                  var1
               )
            ),
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )
      );
      int var4 = 0;
      int var2 = var10000;
      int var5 = CollectionsKt.getLastIndex(var1);

      while (var4 < var5) {
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var7;
         label136: {
            label144: {
               IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var6 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var1.get(
                  var4
               );
               var7 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var1.get(
                  var4 + 1
               );
               BlockPos var8 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .e(
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .b(var7.a(), var6.a())
                  );
               double var9 = var7.d() - var6.d();
               var10000 = Math.abs(var8.getX());
               byte var10001 = 1;
               if (var2 != 0) {
                  if (var10000 > 1) {
                     break label144;
                  }

                  var10000 = Math.abs(var8.getZ());
                  var10001 = 1;
               }

               label145: {
                  if (var2 != 0) {
                     if (var10000 > var10001) {
                        break label144;
                     }

                     var10000 = var8.getY();
                     if (var2 == 0) {
                        break label145;
                     }

                     var10001 = 2;
                  }

                  if (var10000 > var10001) {
                     break label144;
                  }

                  double var31;
                  var10000 = (var31 = var9 - 0.5625) == 0.0 ? 0 : (var31 < 0.0 ? -1 : 1);
               }

               label147: {
                  if (var2 != 0) {
                     if (var10000 <= 0) {
                        break label147;
                     }

                     var10000 = var6.b();
                  }

                  var10001 = 3;
                  if (var2 != 0) {
                     if (var10000 == 3) {
                        break label147;
                     }

                     var10000 = var7.b();
                     var10001 = 3;
                  }

                  if (var10000 != var10001) {
                     var19 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     break label136;
                  }
               }

               var19 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               break label136;
            }

            var19 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var11 =((llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl)( var19));
         var3.add(
            new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .e(var7.a()),
               c(var7),
               var11
            )
         );
         var4++;
         if (var2 == 0) {
            break;
         }
      }

      ArrayList var12 = new ArrayList();
      var12.add(CollectionsKt.first(var3));
      var5 = 0;

      while (true) {
         if (var5 < var3.size() - 1) {
            Object var20 = var3.get(var5);
            short var10002 = -18149;
            short var10003 = -8092;
            Intrinsics.checkNotNullExpressionValue(var20, "get(...)");
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var14 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var20;
            var21 = var14.c();
            if (var2 == 0) {
               break;
            }

            int var15 = var21
                  == IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               ? 1
               : 0;
            int var16 = var5 + 1;
            int var17 = var5 + 1;

            label95: {
               while (var17 < var3.size()) {
                  var10000 = var15;
                  if (var2 == 0 || var2 == 0) {
                     break label95;
                  }

                  if (var15 != 0) {
                     break;
                  }

                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10;
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var28;
                  label91: {
                     label90: {
                        Object var23 = var3.get(var17);
                        var10002 = -18168;
                        var10003 = 16312;
                        Intrinsics.checkNotNullExpressionValue(var23, "get(...)");
                        var10 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var23;
                        if (this.i().isLoaded(var10.a())) {
                           var24 = var10.c();
                           var28 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                           if (var2 == 0) {
                              break label91;
                           }

                           if (var24
                              != IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              )
                            {
                              break label90;
                           }
                        }

                        if (var2 != 0) {
                           break;
                        }
                     }

                     var24 = var10.c();
                     var28 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  }

                  if (var24 != var28) {
                     break;
                  }

                  var10000 = ((this.a(var14.b(), var10.b())) ? 1 : 0);
                  if (var2 != 0) {
                     if (var10000 == 0) {
                        break;
                     }

                     var10000 = var17;
                  }

                  var16 = var10000;
                  var17++;
                  if (var2 == 0) {
                     break;
                  }
               }

               var12.add(var3.get(var16));
               var10000 = var16;
            }

            var5 = var10000;
            if (var2 != 0) {
               continue;
            }
         }

         List var26 = var12;
         if (var2 == 0) {
            return var26;
         }

         var21 = CollectionsKt.last(var26);
         break;
      }

      if (!Intrinsics.areEqual(
         ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var21)
            .a(),
         ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)CollectionsKt.last(
               var3
            ))
            .a()
      )) {
         var12.add(CollectionsKt.last(var3));
      }

      return var12;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> c(
      List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var1
   ) { IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var25 = null; // PX-FIX hoist
        
      int var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (!llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll) {
         return var1;
      } else {
         Iterable var4 = CollectionsKt.withIndex(var1);
         int var5 = 0;
         var var7 = new ArrayList();
         boolean var8 = false;
         Iterator var9 = var4.iterator();

         Object var36;
         label153: {
            label152: {
               while (true) {
                  if (var9.hasNext()) {
                     Object var10 = var9.next();
                     IndexedValue var11 = (IndexedValue)var10;
                     boolean var12 = false;
                     var36 = ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var11.getValue())
                        .c();
                     if (var2 == 0) {
                        break;
                     }

                     boolean var35;
                     if (var36
                        == IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        )
                      {
                        var35 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i()
                           .isLoaded(
                              ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var11.getValue())
                                 .a()
                           );
                        if (var2 != 0) {
                           ;
                        }
                     } else {
                        var35 = false;
                     }

                     if (!var35) {
                        continue;
                     }

                     var7.add(var10);
                     if (var2 != 0) {
                        continue;
                     }
                  }

                  var4 = var7;
                  var5 = (int)((0 != 0) ? 1 : 0);
                  var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
                  var8 = false;
                  var9 = var4.iterator();
                  if (!var9.hasNext()) {
                     break label152;
                  }

                  var36 = var9.next();
                  break;
               }

               while (true) {
                  Object var29 = var36;
                  var36 = var7;
                  IndexedValue var31 = (IndexedValue)var29;
                  if (var2 == 0) {
                     break label153;
                  }

                  boolean var33 = false;
                  var7.add(var31.getIndex());
                  if (var2 == 0 || !var9.hasNext()) {
                     break;
                  }

                  var36 = var9.next();
               }
            }

            var36 = var7;
         }

         List var3 = CollectionsKt.reversed((Iterable)var36);
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var23 = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
            (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)CollectionsKt.first(
               var1
            )
         };
         ArrayList var21 = CollectionsKt.arrayListOf(var23);
         var5 = 0;

         label121:
         while (true) {
            int var37 = var5;
            int var10001 = CollectionsKt.getLastIndex(var1) - 1;

            label118:
            while (var37 < var10001) {
               IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var1.get(
                  var5
               );
                var25 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var1.get(
                  var5 + 1
               );
               var5++;
               boolean var38 = this.i().isLoaded(var25.a());
               if (var2 == 0) {
                  return var21;
               }

               label115: {
                  if (var2 != 0) {
                     if (var38) {
                        break label115;
                     }

                     var21.add(var25);
                  }

                  if (var2 != 0) {
                     continue label121;
                  }
               }

               ArrayList var27 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                  lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  var6.b(),
                  var25.b(),
                  0,
                  4,
                  null
               );
               byte var28 = 0;
               var36 = var27.iterator();
               short var10002 = -18172;
               short var10003 = -19206;
               Intrinsics.checkNotNullExpressionValue(var36, "iterator(...)");
               Iterator var30 = (Iterator)var36;

               label108:
               while (var30.hasNext()) {
                  var36 = var30.next();
                  var10002 = -18145;
                  var10003 = 6457;
                  Intrinsics.checkNotNullExpressionValue(var36, "next(...)");
                  Vec3 var32 = (Vec3)var36;
                  var36 = var32.add(
                     0.0, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B(), 0.0
                  );
                  var10002 = -18151;
                  var10003 = -21579;
                  Intrinsics.checkNotNullExpressionValue(var36, "add(...)");
                  Vec3 var34 = (Vec3)var36;
                  Iterator var13 = var3.iterator();

                  label106:
                  while (true) {
                     var37 = ((var13.hasNext()) ? 1 : 0);

                     while (var37 != 0) {
                        int var14 = ((Number)var13.next()).intValue();
                        var37 = var14;
                        if (var2 != 0) {
                           var10001 = var5;
                           if (var2 == 0) {
                              continue label118;
                           }

                           if (var14 <= var5) {
                              continue label106;
                           }

                           IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var15 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var1.get(
                              var14
                           );
                           if (IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b(var34, var15.b())
                                 > IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                              && var2 != 0) {
                              continue label106;
                           }

                           label100: {
                              label165: {
                                 BlockPos var16 = var15.a();
                                 llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var17 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a(var16, var34);
                                 var36 = var17;
                                 if (var2 != 0) {
                                    if (var17.b()
                                       != llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                       )
                                     {
                                       break label165;
                                    }

                                    var36 = var17;
                                 }

                                 var37 = ((Intrinsics.areEqual(
                                    ((llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid)var36).c(),
                                    var16
                                 )) ? 1 : 0);
                                 if (var2 == 0) {
                                    break label100;
                                 }

                                 if (var37 != 0) {
                                    var36 = BlockPos.containing(var32.x, var32.y - 0.01, var32.z);
                                    var10002 = -18150;
                                    var10003 = -1790;
                                    Intrinsics.checkNotNullExpressionValue(var36, "containing(...)");
                                    BlockPos var18 = (BlockPos)var36;
                                    var21.add(
                                       new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                                          var18,
                                          var32,
                                          IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       )
                                    );
                                    var21.add(var15);
                                    var5 = var14;
                                    var28 = 1;
                                 }
                              }

                              var37 = var28;
                           }

                           if (var2 != 0) {
                              if (var37 == 0) {
                                 continue label106;
                              }
                              break;
                           }
                        }
                     }

                     if (var28 != 0) {
                        break label108;
                     }
                     break;
                  }
               }

               if (var2 != 0) {
                  if (var28 != 0) {
                     continue label121;
                  }

                  var21.add(var25);
               }

               if (var2 != 0) {
                  continue label121;
               }
               break;
            }

            var21.add(CollectionsKt.last(var1));
            return var21;
         }
      }
   }

   private final boolean a(Vec3 var1, Vec3 var2) {
      Object var19 = null; // PX-FIX
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var4 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, var2);
      IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII var10000 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      BlockPos var10001 = BlockPos.containing(var2.x, var2.y - 0.01, var2.z);
      short var10003 = -18158;
      short var10004 = -17488;
      Intrinsics.checkNotNullExpressionValue(var10001, "containing(...)");
      long var5 = var10000.a(var10001);
      int var14 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      int var7 = 0;
      Vec3 var23 = Vec3.ZERO;
      short var10006 = -18123;
      short var10007 = -18255;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var1, var23, var4.a(), var4.b(), true
      );
      int var3 = var14;

      label66:
      while (true) {
         int var15 = var7;

         while (var15 <= 200) {
            var7++;
            me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var3 != 0) {
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var17 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(
                  me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  1.0,
                  0.0,
                  var8,
                  false,
                   0.0,
                   16,
                   null);
               if (var17 == null) {
                  continue label66;
               }

               var8 = var17;
               var16 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var15 = ((var16.k()) ? 1 : 0);
            if (var3 != 0) {
               if (var15 != 0) {
                  return false;
               }

               var15 = ((lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var2, var8.a(), 0.5)) ? 1 : 0);
            }

            if (var3 != 0) {
               if (var15 != 0) {
                  var10000 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  var10001 = BlockPos.containing(var8.a());
                  var10003 = -18150;
                  var10004 = -1790;
                  Intrinsics.checkNotNullExpressionValue(var10001, "containing(...)");
                  long var9 = var10000.a(var10001);
                  int var11 = 0;

                  while (true) {
                     if (-4 < var11) {
                        long var12 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var9, 0, var11, 0);
                        if (var3 != 0) {
                           var19 = this.e(var12);
                           if (var3 == 0) {
                              break;
                           }

                           if (!((Boolean)var19)) {
                              long var25;
                              int var20 = (var25 = var12 - var5) == 0L ? 0 : (var25 < 0L ? -1 : 1);
                              if (var3 != 0) {
                                 var20 = (((var20 == 0) ? 1 : 0));
                              }

                              return (var20 != 0);
                           }

                           var11--;
                        }

                        if (var3 != 0) {
                           continue;
                        }
                     }

                     var19 = 0;
                     break;
                  }

                  return (boolean)var19;
               }
               continue label66;
            }
         }

         return false;
      }
   }

   @Nullable
   public final List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> a(
      @NotNull Object var1, boolean var2
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = -18162;
      short var10003 = -27108;
      Intrinsics.checkNotNullParameter(var1, "target");
      int var3 = var10000;
      if (var3 != 0) {
         BlockPos var5 = this.a(this.a().player);
         if (var5 != null) {
            BlockPos var4 = var5;
            return this.a(var1, var4, var2);
         }
      }

      return null;
   }

   @Nullable
   public final List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> a(
      @NotNull Object var1, @NotNull BlockPos var2, boolean var3
   ) { List var25 = null; // PX-FIX hoist
        
      Object var37 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      Object var31 = null; // PX-FIX
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = -18170;
      short var10003 = 9943;
      Intrinsics.checkNotNullParameter(var1, "target");
      int var4 = var10000;
      short var10001 = -18169;
      var10002 = -31251;
      Intrinsics.checkNotNullParameter(var2, "from");
      if (var4 != 0) {
         if (!lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI) {
            return null;
         }

         IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = System.currentTimeMillis();
      }

      label92: {
         boolean var30 = var1 instanceof BlockPos;
         if (var4 != 0) {
            if (var30) {
               var31 = (BlockPos)var1;
               break label92;
            }

            var30 = var1 instanceof Entity;
         }

         var31 = var30 ? this.a((Entity)var1) : null;
      }

      BlockPos var5 =((BlockPos)( var31));
      BlockPos var32 = var5;
      if (var4 != 0) {
         if (var5 == null) {
            return null;
         }

         var32 = var5;
      }

      BlockPos var9 = var32;
      boolean var10 = false;
      lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var9);
      IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = null;
      IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = Integer.MAX_VALUE;
      lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = Integer.MAX_VALUE;
      IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = Math.pow(
         me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .i(),
         2.0
      );
      this.m();
      long var22 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2);
      byte var7 = this.e(var22);
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var23 = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         var22,
         var7,
         new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            0, 0, 0
         ),
         IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(var7)
      );
      boolean var11 = false;
      var23.b(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var23.a()));
      var23.c(0.0);
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.a(var23);
      ((Map)llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI).put(var22, var23.g());

      while (true) {
         if (lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.d()) {
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var24 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.a();
            IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.put(var24.a(), var24);
            if (var4 != 0) {
               long var39;
               var10000 = (var39 = var24.a() - lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) == 0L
                  ? 0
                  : (var39 < 0L ? -1 : 1);
               if (var4 == 0) {
                  break;
               }

               if ((var10000 == 0)) {
                   var25 = this.a(var24);
                  Iterable var26 = var25;
                  boolean var12 = false;
                  var var14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var26, 10));
                  boolean var15 = false;
                  Iterator var16 = var26.iterator();

                  while (true) {
                     if (var16.hasNext()) {
                        Object var17 = var16.next();
                        var34 = var14;
                        IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var18 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var17;
                        if (var4 == 0) {
                           break;
                        }

                        boolean var19 = false;
                        BlockPos var20 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .e(var18.a());
                        var14.add(
                           new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                              var20,
                              lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .g(var20),
                              IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           )
                        );
                        if (var4 != 0) {
                           continue;
                        }
                     }

                     var34 = var14;
                     break;
                  }

                  label64: {
                     Object var27 = var34;
                     boolean var35 = ((java.util.Collection<?>)var27).isEmpty();
                     if (var4 != 0) {
                        if (!var35) {
                           var37 = var27;
                           break label64;
                        }

                        var35 = false;
                     }

                     var37 = null;
                  }

                  IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = (List<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll>)var37;
                  List var28 = this.b(var25);
                  List var29 = this.c(var28);
                  if (var4 != 0) {
                     if (var3) {
                        this.a(true, var29.size());
                     }

                     this.m();
                  }

                  return var29;
               }

               this.a(var24, null);
            }

            if (var4 != 0) {
               continue;
            }
         }

         var10000 =(( var3) ? 1 : 0);
         break;
      }

      if ((var10000 != 0)) {
         this.a(false, 0);
      }

      return null;
   }

   private final double b(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1
   ) { byte var25 = (byte)0; // PX-FIX hoist
        
      int var30 = 0; // PX-FIX
       var25 = 0; // PX-FIX
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      double var3 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI.get(var1.a());
      int var2 = var10000;
      double var32;
      var10000 = (var32 = var3 - -1.0) == 0.0 ? 0 : (var32 < 0.0 ? -1 : 1);
      if (var2 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         return var3;
      } else {
         double var5;
         long var7;
         var5 = 0.0;
         var7 = var1.a();
         byte var9 = var1.b();
         var25 = var9;
         label239:
         if (var2 != 0) {
            if (var9 != 2) {
               var25 = var9;
               if (var2 == 0) {
                  break label239;
               }

               if (var9 != 3) {
                  var25 = ((byte)((lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.contains(var9)) ? 1 : 0));
                  if (var2 == 0) {
                     break label239;
                  }

                  if (var25 == 0) {
                     var25 = 0;
                     break label239;
                  }
               }
            }

            var25 = 1;
         }

         int var15;
         label228: {
            label245: {
               byte var10 =((Byte)( var25));
               int var26 = var10;
               if (var2 != 0) {
                  if (var10 != 0) {
                     var15 = 0;
                     var5 += 2.0;
                     Iterator var12 = IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.iterator();

                     label223:
                     while (true) {
                        if (!var12.hasNext()) {
                           break label245;
                        }

                        IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var13 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var12.next();
                        byte var14 = this.e(
                           IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var7, var13.a(), 0, var13.c())
                        );

                        do {
                           byte var10001;
                           var26 = var14;
                           var10001 = 2;
                           label208:
                           if (var2 != 0) {
                              label217: {
                                 if (var14 != 2) {
                                    var26 = var14;
                                    var10001 = 3;
                                    if (var2 == 0) {
                                       break label208;
                                    }

                                    if (var14 != 3) {
                                       var26 = var14;
                                       var10001 = 15;
                                       if (var2 == 0) {
                                          break label208;
                                       }

                                       if (var14 != 15) {
                                          var26 = ((lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.contains(var14)) ? 1 : 0);
                                          if (var2 == 0) {
                                             break label217;
                                          }

                                          if (var26 == 0) {
                                             continue label223;
                                          }
                                       }
                                    }
                                 }

                                 var26 = ++var15;
                              }

                              var10001 = 2;
                           }

                           if (var26 != var10001) {
                              continue label223;
                           }

                           var5 -= 2.0;
                        } while (var2 == 0);

                        if (var2 != 0) {
                           break label245;
                        }
                        break;
                     }
                  }

                  var26 = 0;
               }

               var15 = var26;

               for (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var19 : IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
                  if (var2 != 0) {
                     var10000 = this.e(
                        IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var7, var19.a(), 0, var19.c())
                     );
                     if (var2 == 0) {
                        break label228;
                     }

                     if (var10000 != 0) {
                        continue;
                     }

                     var15++;
                  }

                  if (var2 == 0) {
                     break;
                  }
               }

               var5 += 2.0 * var15;
            }

            var15 = var1.c().b();
            var10000 = var15;
         }

         label176: {
            label252: {
               if (var2 != 0) {
                  if (var10000 < -2) {
                     int var18 = -var15;
                     Iterator var21 = IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.iterator();

                     while (true) {
                        var30 = var21.hasNext() ? 1 : 0;

                        do {
                           if (var30 != 0) {
                              break label252;
                           }

                           IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var23 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var21.next();
                           var30 = this.e(
                              IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var7, var23.a(), var18, var23.c())
                           );
                           if (var2 == 0) {
                              break label176;
                           }

                           if (var2 != 0) {
                              if (var30 == 0) {
                                 var5++;
                              }

                              var30 = this.e(
                                 IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var7, var23.a(), var18 - 1, var23.c())
                              );
                           }
                        } while (var2 == 0);

                        if (var30 == 0) {
                           var5++;
                        }
                     }
                  }

                  var10000 = -1;
               }

               int var17 = var10000;

               label158:
               do {
                  var10000 = var17;

                  label155:
                  while (true) {
                     if (var10000 >= 2) {
                        break label158;
                     }

                     var30 = -1;
                     if (var2 == 0) {
                        break label176;
                     }

                     int var20 = -1;

                     while (true) {
                        if (var20 >= 2) {
                           break label155;
                        }

                        var10000 = var17;
                        if (var2 == 0) {
                           break;
                        }

                        label150: {
                           label257: {
                              label148:
                              if (var2 != 0) {
                                 if (var17 == 0) {
                                    var10000 = var20;
                                    if (var2 == 0) {
                                       break label148;
                                    }

                                    if (var20 == 0 && var2 != 0) {
                                       break label257;
                                    }
                                 }

                                 var10000 = this.e(
                                    IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var7, var17, -1, var20)
                                 );
                              }

                              if (var2 != 0) {
                                 if (var10000 == 0) {
                                    var5++;
                                 }

                                 var10000 = this.e(
                                    IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var7, var17, 2, var20)
                                 );
                              }

                              int var22 = var10000;
                              if (var2 == 0) {
                                 break label150;
                              }

                              if (var22 != 0) {
                                 var5 += var22 == 6 ? 1.5 : 1.0;
                              }
                           }

                           var20++;
                        }

                        if (var2 == 0) {
                           break label155;
                        }
                     }
                  }

                  var17++;
               } while (var2 != 0);
            }

            var30 = this.e(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var7, 0, 1, 0)
            );
         }

         byte var31 = 5;
         if (var2 != 0) {
            if (var30 == 5) {
               var5 += 20.0;
            }

            if (var2 == 0) {
               return var5;
            }

            var30 = this.e(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var7, 0, 2, 0)
            );
            var31 = 5;
         }

         if ((var30 != 0) == (var31 == 0)) {
            var5 += 20.0;
         }

         ((Map)lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI).put(var7, var5);
         return var5;
      }
   }

   private final void a(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1,
      Function3<? super IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll, ? super Double, ? super Boolean, Unit> var2
   ) {
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var24 = null; // PX-FIX
      long var4 = var1.a();
      int var6 = 0;
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      int var7 = 0;
      int[] var8 = new int[2];
      int[] var9 = new int[2];
      int var3 = var10000;
      Iterator var10 = IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.iterator();

      label100:
      while (true) {
         if (var10.hasNext()) {
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var11 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var10.next();
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var12 = this.a(
               var4, var11
            );
            var24 = var12;
            if (var3 == 0) {
               break;
            }

            if (var3 != 0) {
               if (var12 == null) {
                  continue;
               }

               var2.invoke(var12, 1.0, false);
               var24 = var12;
            }

            var10000 = ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var24).c()
               .b();
            if (var3 != 0) {
               if (var10000 >= 1) {
                  continue;
               }

               var10000 = var11.a();
            }

            if (var10000 == 0) {
               var9[var7++] = var11.c();
               if (var3 != 0) {
                  continue;
               }
            }

            var8[var6++] = var11.a();
            if (var3 != 0) {
               continue;
            }
         }

         var10000 = var6;
         label81:
         if (var3 != 0) {
            if (var6 > 0) {
               var10000 = var7;
               if (var3 == 0) {
                  break label81;
               }

               if (var7 > 0) {
                  int var17 = 0;
                  int var19 = var6;

                  while (var17 < var19) {
                     int var21 = var8[var17];
                     int var13 = 0;
                     var10000 = var7;
                     if (var3 == 0) {
                        break label81;
                     }

                     int var14 = var7;

                     while (var13 < var14) {
                        int var15 = var9[var13];
                        IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var16 = this.a(
                           var4,
                           new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                              var21, 0, var15
                           )
                        );
                        if (var3 != 0) {
                           var24 = var16;
                           if (var3 == 0) {
                              break label100;
                           }

                           if (var16 != null) {
                              var2.invoke(var16, 1.4, false);
                           }

                           var13++;
                        }

                        if (var3 == 0) {
                           break;
                        }
                     }

                     var17++;
                     if (var3 == 0) {
                        break;
                     }
                  }
               }
            }

            var10000 =(( llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll) ? 1 : 0);
         }

         if (var10000 == 0) {
            return;
         }

         var24 = ((llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)(Object)(llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.get(var4)));
         break;
      }

      List var27 = (List)(Object)var24;
      if ((List)(Object)var24 != null) {
         List var18 = var27;
         Iterator var20 = var18.iterator();

         while (var20.hasNext()) {
            long var22 = ((Number)var20.next()).longValue();
            long var23 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .b(var22, var4);
            var2.invoke(
               new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                  var22,
                  (byte)1,
                  new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .b(var23),
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .c(var23),
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .d(var23)
                  ),
                  1.0
               ),
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               true
            );
            if (var3 == 0) {
               break;
            }
         }
      }
   }

   private final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
      long var1,
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3
   ) {
      long var5 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, var3.a(), 0, var3.c());
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      int var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(var5);
      int var4 = var10000;
      int var8 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(var5);
      var10000 = var7;
      int var10001 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a();
      if (var4 == 0) {
         if (var7 > var10001) {
            return null;
         }

         var10000 = var7;
         var10001 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b();
      }

      if (var4 == 0) {
         if (var10000 < var10001) {
            return null;
         }

         var10000 = var8;
         var10001 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.c();
      }

      label120: {
         if (var4 == 0) {
            if (var10000 > var10001) {
               return null;
            }

            var10000 = var8;
            if (var4 != 0) {
               break label120;
            }

            var10001 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.d();
         }

         if (var10000 < var10001) {
            return null;
         }

         var10000 = 1;
      }

      int var9 = var10000;

      while (-21 < var9) {
         long var10 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var5, 0, var9, 0);
         int var14 = ((IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.containsKey(var10)) ? 1 : 0);
         if (var4 == 0) {
            if (var14 != 0) {
               return null;
            }

            var14 = this.e(var10);
         }

         byte var12;
         label93: {
            var12 = (byte)var14;
            if (var4 == 0) {
               if (var12 != 0) {
                  var14 = var12;
                  if (var4 != 0) {
                     break label93;
                  }

                  if (var12 != 5) {
                     var14 = ((this.c(
                        IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var10, 0, 1, 0)
                     )) ? 1 : 0);
                     break label93;
                  }
               }

               var9--;
            }

            if (var4 == 0) {
               continue;
            }
            break;
         }

         if (var4 == 0) {
            if (var14 == 0) {
               return null;
            }

            var14 = ((this.d(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var10, 0, 2, 0)
            )) ? 1 : 0);
         }

         if (var4 == 0) {
            if (var14 == 0) {
               return null;
            }

            var14 = var9;
         }

         label67:
         if (var4 == 0) {
            if (var14 < 0) {
               var14 = ((this.d(
                  IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var5, 0, 2, 0)
               )) ? 1 : 0);
               if (var4 != 0) {
                  break label67;
               }

               if (var14 == 0) {
                  return null;
               }
            }

            var14 = var9;
         }

         if (var4 == 0) {
            if (var14 != 1) {
               return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                  var10,
                  var12,
                  new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                     var3.a(), var9, var3.c()
                  ),
                  IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(var12)
               );
            }

            var14 = ((this.d(
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var1, 0, 3, 0)
            )) ? 1 : 0);
         }

         if (var14 == 0) {
            return null;
         }

         return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var10,
            var12,
            new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
               var3.a(), var9, var3.c()
            ),
            IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(var12)
         );
      }

      return null;
   }

   private final double b(long var1) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      double var4 = IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.get(var1);
      int var3 = var10000;
      double var13;
      var10000 = (var13 = var4 - -1.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 == 0)) {
         return var4;
      } else {
         int var6 = Math.abs(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .b(var1)
               - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .b(lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI)
         );
         int var7 = Math.abs(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .d(var1)
               - IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .d(lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI)
         );
         int var8 = Math.min(var6, var7);
         int var9 = Math.max(var6, var7);
         double var10 = 1.4 * var8 + (var9 - var8);
         ((Map)IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI).put(var1, var10);
         return var10;
      }
   }

   private final void m() {
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.clear();
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.clear();
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.b();
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.clear();
      IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.clear();
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI.clear();
   }

   private final boolean c(long var1) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      byte var4 = this.e(var1);
      int var3 = var10000;
      byte var5 = var4;
      if (var3 == 0) {
         if (var4 != 0) {
            if (var3 != 0) {
               return (var4 != 0);
            }

            if (var4 != 4) {
               if (var3 != 0) {
                  return (var4 != 0);
               }

               if (var4 != 5) {
                  return (0 != 0);
               }
            }
         }

         var5 = 1;
      }

      return (var5 != 0);
   }

   private final boolean d(long var1) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      byte var4 = this.e(var1);
      int var3 = var10000;
      byte var5 = var4;
      if (var3 == 0) {
         if (var4 != 0) {
            if (var3 != 0) {
               return (var4 != 0);
            }

            if (var4 != 5) {
               return (0 != 0);
            }
         }

         var5 = 1;
      }

      return (var5 != 0);
   }

   private final byte e(long var1) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      byte var4 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.get(var1);
      int var3 = var10000;
      var10000 = var4;
      if (var3 != 0) {
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
            if (var3 != 0) {
               if (var8 == IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII) {
                  if (var3 == 0) {
                     break label42;
                  }

                  if (var9 == lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII) {
                     break label41;
                  }
               }

               IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = this.i().getChunk(var8, var9, ChunkStatus.FULL, false);
               IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var8;
               var10000 = var9;
            }

            lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = var10000;
         }

         boolean var15 = false;
      }

      byte var10;
      label31: {
         label30: {
            ChunkAccess var11 = IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
            ChunkAccess var16 = var11;
            if (var3 != 0) {
               if (var11 == null) {
                  break label30;
               }

               IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.set(var5, var6, var7);
               var16 = var11;
            }

            BlockState var17 = var16.getBlockState(IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI);
            short var10002 = -18173;
            short var10003 = -3614;
            Intrinsics.checkNotNullExpressionValue(var17, "getBlockState(...)");
            BlockState var12 = var17;
            var10 = this.a(var12, IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI);
            if (var3 != 0) {
               break label31;
            }
         }

         var10 = lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.get(var1);
      }

      ((Map)IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll).put(var1, var10);
      return var10;
   }

   private final byte a(BlockState var1, BlockPos var2) {
      Object var5 = null; // PX-FIX
      int var3 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      int var10000 = ((var1.isAir()) ? 1 : 0);
      if (var3 == 0) {
         if ((var10000 != 0)) {
            return 0;
         }

         var10000 = ((var1.getFluidState().isEmpty()) ? 1 : 0);
      }

      label116: {
         if (var3 == 0) {
            if ((var10000 == 0)) {
               return 5;
            }

            var5 = var1;
            if (var3 != 0) {
               break label116;
            }

            var10000 = ((var1.getCollisionShape(this.i(), var2).isEmpty()) ? 1 : 0);
         }

         if ((var10000 != 0)) {
            return 0;
         }

         var5 = var1;
      }

      Block var6 = var1.getBlock();
      short var10002 = -18176;
      short var10003 = -29400;
      Intrinsics.checkNotNullExpressionValue(var6, "getBlock(...)");
      Block var4 = var6;
      var10000 = ((var4 instanceof SlabBlock) ? 1 : 0);
      if (var3 == 0) {
         if (var10000 != 0 && var1.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) {
            return 2;
         }

         var10000 = ((var4 instanceof StairBlock) ? 1 : 0);
      }

      if (var3 == 0) {
         if (var10000 != 0) {
            return (byte)(var1.getValue(StairBlock.HALF) == Half.BOTTOM ? 3 : 1);
         }

         var10000 = ((var4 instanceof CarpetBlock) ? 1 : 0);
      }

      if (var3 == 0) {
         if (var10000 != 0) {
            return 4;
         }

         var10000 = ((var4 instanceof FenceBlock) ? 1 : 0);
      }

      if (var3 == 0) {
         if (var10000 == 0) {
            var10000 = ((var4 instanceof FenceGateBlock) ? 1 : 0);
            if (var3 != 0) {
               return (byte)(var10000);
            }

            label83:
            if (var10000 == 0) {
               var10000 = ((var4 instanceof WallBlock) ? 1 : 0);
               if (var3 == 0) {
                  if (var10000 != 0) {
                     break label83;
                  }

                  var10000 = ((var4 instanceof SnowLayerBlock) ? 1 : 0);
               }

               if (var3 == 0) {
                  if (var10000 != 0) {
                     var10000 = var1.getValue(SnowLayerBlock.LAYERS);
                     if (var3 == 0) {
                        switch (var10000) {
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
                              var10000 = 14;
                        }
                     }

                     return (byte)var10000;
                  }

                  var10000 = ((Intrinsics.areEqual(var4, Blocks.SNOW)) ? 1 : 0);
               }

               if (var3 == 0) {
                  var10000 = var10000 != 0 ? 15 : 1;
               }

               return (byte)var10000;
            }
         }

         var10000 = (byte)6;
      }

      return (byte)(var10000);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   public final BlockPos a(@NotNull BlockPos var1) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -18175;
      short var10003 = 28450;
      Intrinsics.checkNotNullParameter(var1, "from");
      int var2 = var10000;
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.clear();
      ArrayList var3 = new ArrayList();
      int var4 = -2;

      label117:
      while (true) {
         var10000 = var4;

         label115:
         while (true) {
            if (var10000 >= 3) {
               break label117;
            }

            int var5 = -2;

            label112:
            while (true) {
               var10000 = var5;

               label110:
               while (true) {
                  if (var10000 >= 3) {
                     break label112;
                  }

                  var10000 = -2;
                  if (var2 != 0) {
                     continue label115;
                  }

                  int var6 = -2;

                  while (var6 < 3) {
                     BlockPos var26 = var1.offset(var4, var6, var5);
                     var10002 = -18174;
                     var10003 = -29607;
                     Intrinsics.checkNotNullExpressionValue(var26, "offset(...)");
                     BlockPos var7 = var26;
                     long var8 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var7);
                     byte var11 = this.e(var8);
                     if (var2 == 0) {
                        var10000 = var11;
                        if (var2 != 0) {
                           continue label110;
                        }

                        label100:
                        if (var11 != 0) {
                           byte var27 = var11;
                           if (var2 == 0) {
                              if (var11 == 5) {
                                 break label100;
                              }

                              var27 = ((byte)((this.c(
                                 IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var8, 0, 1, 0)
                              )) ? 1 : 0));
                           }

                           if (var2 == 0) {
                              if (var27 == 0) {
                                 break label100;
                              }

                              var27 = ((byte)((this.d(
                                 IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var8, 0, 2, 0)
                              )) ? 1 : 0));
                           }

                           if (var2 == 0 && var27 != 0) {
                              var3.add(var7);
                           }
                        }

                        var6++;
                     }

                     if (var2 != 0) {
                        break;
                     }
                  }

                  var5++;
                  if (var2 != 0) {
                     break label112;
                  }
                  break;
               }
            }

            var4++;
            if (var2 != 0) {
               break label117;
            }
            break;
         }
      }

      Vec3 var15 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(var1);
      Iterable var16 = var3;
      boolean var17 = false;
      Iterator var18 = var16.iterator();
      Object var28 = var18;
      if (var2 == 0) {
         if (!var18.hasNext()) {
            return (BlockPos)null;
         }

         var28 = var18.next();
      }

      Object var19 = var28;
      Object var29 = var18;
      if (var2 == 0) {
         if (!var18.hasNext()) {
            return (BlockPos)var19;
         }

         var29 = var19;
      }

      BlockPos var9 = (BlockPos)var29;
      boolean var21 = false;
      double var20 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            var15,
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(var9)
         );

      while (true) {
         Object var22 = var18.next();
         BlockPos var12 = (BlockPos)var22;
         boolean var14 = false;
         double var23 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               var15,
               lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var12)
            );
         if (Double.compare(var20, var23) > 0) {
            var19 = var22;
            var20 = var23;
         }

         while (!var18.hasNext()) {
            if (var2 == 0) {
               return (BlockPos)var19;
            }

            var20 = var23;
         }
      }
   }

   @Nullable
   public final BlockPos a(@Nullable Entity var1) {
       BlockPos var25 = null; // PX-FIX decl var25
      byte var30 = 0; // PX-FIX
      int var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Entity var10000 = var1;
      if (var2 != 0) {
         if (var1 == null) {
            return null;
         }

         IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.clear();
         var10000 = var1;
      }

      AABB var28 = var10000.getBoundingBox();
      short var10002 = -18153;
      short var10003 = 18913;
      Intrinsics.checkNotNullExpressionValue(var28, "getBoundingBox(...)");
      AABB var3 = var28;
      double var4 = var1.getY() - 0.01;
      BlockPos[] var7 = new BlockPos[]{
         BlockPos.containing(var3.minX, var4, var3.minZ),
         BlockPos.containing(var3.minX, var4, var3.maxZ),
         BlockPos.containing(var3.maxX, var4, var3.minZ),
         BlockPos.containing(var3.maxX, var4, var3.maxZ)
      };
      Iterable var21 = CollectionsKt.distinct(CollectionsKt.listOf(var7));
      boolean var8 = false;
      var var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var21, 10));
      boolean var11 = false;
      Iterator var12 = var21.iterator();

      while (true) {
         if (var12.hasNext()) {
            Object var13 = var12.next();
            BlockPos var14 = (BlockPos)var13;
            boolean var15 = false;
            double var16 = Math.max(0.0, Math.min(var3.maxX, var14.getX() + 1.0) - Math.max(var3.minX, (double)var14.getX()));
            double var18 = Math.max(0.0, Math.min(var3.maxZ, var14.getZ() + 1.0) - Math.max(var3.minZ, (double)var14.getZ()));
            var10.add(TuplesKt.to(var14, var16 * var18));
            if (var2 == 0) {
               break;
            }

            if (var2 != 0) {
               continue;
            }
         }

         var21 = var10;
         var8 = false;
         break;
      }

      List var6 = CollectionsKt.sortedWith(
         var21,
         new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI()
      );
      int var22 = 0;

      while (var22 < 257) {
         label78:
         for (Pair var9 : (List<Pair>) (List<?>) var6) {
            BlockPos var29 = ((BlockPos)var9.getFirst()).offset(0, -var22, 0);
            var10002 = -18164;
            var10003 = -25969;
            Intrinsics.checkNotNullExpressionValue(var29, "offset(...)");

            do {
               var25 = var29;
               long var26 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var25);
               byte var27 = this.e(var26);
               var30 = var27;
               label73:
               if (var2 != 0) {
                  if (var27 != 0) {
                     var30 = var27;
                     if (var2 == 0) {
                        break label73;
                     }

                     if (var27 != 5) {
                        var30 = ((byte)((this.c(
                           IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var26, 0, 1, 0)
                        )) ? 1 : 0));
                        if (var2 == 0) {
                           break label73;
                        }

                        if (var30 != 0) {
                           var30 = ((byte)((this.d(
                              IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var26, 0, 2, 0)
                           )) ? 1 : 0));
                           if (var2 == 0) {
                              break label73;
                           }

                           if (var30 != 0) {
                              return var25;
                           }
                        }
                     }
                  }

                  var30 = (byte)(this.i().getBlockState(var25).is(Blocks.LADDER) ? 1 : 0);
               }

               if (var2 != 0) {
                  if (var30 == 0) {
                     continue label78;
                  }

                  var30 = (byte)(this.i().getBlockState(var25.offset(0, 1, 0)).is(Blocks.LADDER) ? 1 : 0);
               }

               if (var2 != 0) {
                  if (var30 == 0) {
                     continue label78;
                  }

                  var30 = (byte)(this.i().getBlockState(var25.offset(0, 2, 0)).is(Blocks.LADDER) ? 1 : 0);
               }

               if (var30 == 0) {
                  continue label78;
               }

               var29 = var25;
            } while (var2 == 0);

            return var25;
         }

         var22++;
         if (var2 == 0) {
            break;
         }
      }

      return null;
   }

   private final void a(boolean var1, int var2) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      long var10001 = System.currentTimeMillis() - IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
      short var10002 = -18159;
      short var10003 = 12643;
      var10003 = -18152;
      short var10004 = -6457;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "Total calculation time: " + var10001 + " ms"
      );
      int var3 = var10000;
      var10000 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.c();
      short var9 = -18155;
      var10002 = -9072;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Scanned nodes: " + var10000);
      var10000 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.size();
      short var10 = -18163;
      var10002 = 22407;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Processed nodes: " + var10000);
      short var11 = -18166;
      var10002 = 8400;
      String var6 = "Path size: " + var2;
      if (var3 != 0) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var6);
         if (var1) {
            short var7 = -18165;
            short var12 = 19237;
            var6 = "SUCCESS";
         } else {
            short var8 = -18146;
            short var13 = -22380;
            var6 = "FAIL";
         }
      }

      short var14 = -18167;
      var10002 = 13145;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("RESULT: " + var6);
   }

   private static final Unit n() {
      try {
         return polinex$loadPathfinderCacheOriginal();
      } catch (Throwable var1) {
         return polinex$recoverPathfinderLoadFailure(var1);
      }
   }

   public static final boolean polinex$validPathfinderCache(File var0) {
      try {
         if (var0 == null || !var0.isFile()) {
            return false;
         }

         byte[] var1 = Files.readAllBytes(var0.toPath());
         if (var1.length < 4) {
            return false;
         }

         ByteBuffer var2 = ByteBuffer.wrap(var1);
         int var3 = var2.getInt();
         if (var3 < 0 || var3 > var2.remaining() / 12) {
            return false;
         }

         for (int var4 = 0; var4 < var3; ++var4) {
            if (var2.remaining() < 12) {
               return false;
            }

            int var5 = var2.getInt();
            var2.getInt();
            var2.getInt();
            if (var5 < 0 || var5 > var2.remaining() / 5) {
               return false;
            }

            var2.position(var2.position() + var5 * 5);
         }

         return !var2.hasRemaining();
      } catch (Throwable var6) {
         return false;
      }
   }

   private static final Unit polinex$invalidatePathfinderCache(File var0) {
      if (var0 != null) {
         var0.delete();
      }

      lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.clear();
      lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = true;
      System.err.println("Polinex: discarded an invalid pathfinder cache; using live chunks.");
      return Unit.INSTANCE;
   }

   private static final Unit polinex$recoverPathfinderLoadFailure(Throwable var0) {
      lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.clear();
      lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = true;
      System.err.println("Polinex: pathfinder cache load failed; using live chunks.");
      return Unit.INSTANCE;
   }

   private static final Unit polinex$loadPathfinderCacheOriginal() throws Throwable {
      IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = System.currentTimeMillis();
      int var0 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1 = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var28 = null;
      if (var0 != 0) {
         if (var1 == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) {
            var1 = me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
         }
      }

      File var2 = new File(new File(me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), me.octo.client.IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a()), var1.name() + ".dat");
      boolean var29 = var2.exists();
      if (var0 == 0 || !var29) {
         var28 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = var0 == 0 ? var29 : true;
         return Unit.INSTANCE;
      }

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var33 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      HashMap var30 = var0 == 0 ? null : (HashMap)(Object)IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.a().get(var1);
      if (var30 == null) {
         var30 = new HashMap();
      }

      var33.a(var30);
      if (!IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.polinex$validPathfinderCache(var2)) {
         return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.polinex$invalidatePathfinderCache(var2);
      }

      java.io.Closeable var3 = null;
      Throwable var6 = null;
      try {
         var3 = new java.io.RandomAccessFile(var2, "r").getChannel();
         java.nio.channels.FileChannel var5 = (java.nio.channels.FileChannel)var3;
         java.nio.MappedByteBuffer var7 = var5.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, var5.size());
         int var8 = (int)((var5.size() - 4L) / 5L);
         var28 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.ensureCapacity(var8);
         int var9 = var7.getInt();
         int var10 = 0;
         while (var10 < var9) {
            int var13 = var7.getInt();
            int var14 = var7.getInt() << 4;
            int var15 = var7.getInt() << 4;
            long var16 = me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var14, 0, var15);
            if (var0 == 0) {
               break;
            }

            for (int var18 = 0; var18 < var13; ++var18) {
               byte var21 = var7.get();
               int var22 = var7.getInt();
               long var23 = var16 | (long)(var22 & 15) << 38 | (long)(var22 >> 8 & 255) << 26 | (long)(var22 >> 4 & 15);
               var28 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               ((Map)lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI).put(Long.valueOf(var23), Byte.valueOf(var21));
            }

            ++var10;
         }

         Unit var31 = Unit.INSTANCE;
      } catch (Throwable var32) {
         var6 = var32;
         throw var32;
      } finally {
         kotlin.io.CloseableKt.closeFinally(var3, var6);
      }

      var28 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = true;
      var28 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var27 = lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.size();
      long var25 = System.currentTimeMillis() - IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d("Loaded " + var27 + " cached states in " + var25 + "ms.");
      return Unit.INSTANCE;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic java/lang/System.currentTimeMillis ()J
      // 003: putstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl J
      // 006: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k ()I
      // 009: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 00c: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 00f: astore 1
      // 010: istore 0
      // 011: aload 1
      // 012: iload 0
      // 013: ifeq 02d
      // 016: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 019: if_acmpne 02e
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 026: goto 02d
      // 029: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: astore 1
      // 02e: new java/io/File
      // 031: dup
      // 032: new java/io/File
      // 035: dup
      // 036: getstatic me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl;
      // 039: invokevirtual me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.a ()Ljava/lang/String;
      // 03c: getstatic me/octo/client/IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 03f: invokevirtual me/octo/client/IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/lang/String;
      // 042: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 045: aload 1
      // 046: invokevirtual me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.name ()Ljava/lang/String;
      // 049: sipush -18161
      // 04c: sipush 11418
      // 04f: pop2
      // 050: ldc_w ".dat"
      // 053: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 058: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 05b: astore 2
      // 05c: aload 2
      // 05d: invokevirtual java/io/File.exists ()Z
      // 060: iload 0
      // 061: ifeq 07a
      // 064: ifne 081
      // 067: goto 06e
      // 06a: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 071: pop
      // 072: bipush 1
      // 073: goto 07a
      // 076: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: putstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Z
      // 07d: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 080: areturn
      // 081: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 084: iload 0
      // 085: ifeq 0a5
      // 088: invokestatic me/octo/client/utils/player/pathfinder/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.a ()Ljava/util/HashMap;
      // 08b: aload 1
      // 08c: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08f: checkcast java/util/HashMap
      // 092: dup
      // 093: ifnonnull 0ac
      // 096: goto 09d
      // 099: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: pop
      // 09e: goto 0a5
      // 0a1: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: new java/util/HashMap
      // 0a8: dup
      // 0a9: invokespecial java/util/HashMap.<init> ()V
      // 0ac: invokevirtual me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/util/HashMap;)V
      // 0af: aload 2
      // 0b0: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.polinex$validPathfinderCache (Ljava/io/File;)Z
      // 0b3: ifne 0bb
      // 0b6: aload 2
      // 0b7: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.polinex$invalidatePathfinderCache (Ljava/io/File;)Lkotlin/Unit;
      // 0ba: areturn
      // 0bb: new java/io/RandomAccessFile
      // 0be: dup
      // 0bf: aload 2
      // 0c0: ldc_w "r"
      // 0c3: invokespecial java/io/RandomAccessFile.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0c6: invokevirtual java/io/RandomAccessFile.getChannel ()Ljava/nio/channels/FileChannel;
      // 0c9: checkcast java/io/Closeable
      // 0cc: astore 3
      // 0cd: aconst_null
      // 0ce: astore 4
      // 0d0: nop
      // 0d1: aload 3
      // 0d2: checkcast java/nio/channels/FileChannel
      // 0d5: astore 5
      // 0d7: bipush 0
      // 0d8: istore 6
      // 0da: aload 5
      // 0dc: getstatic java/nio/channels/FileChannel$MapMode.READ_ONLY Ljava/nio/channels/FileChannel$MapMode;
      // 0df: lconst_0
      // 0e0: aload 5
      // 0e2: invokevirtual java/nio/channels/FileChannel.size ()J
      // 0e5: invokevirtual java/nio/channels/FileChannel.map (Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
      // 0e8: astore 7
      // 0ea: aload 5
      // 0ec: invokevirtual java/nio/channels/FileChannel.size ()J
      // 0ef: bipush 4
      // 0f0: i2l
      // 0f1: lsub
      // 0f2: bipush 5
      // 0f3: i2l
      // 0f4: ldiv
      // 0f5: l2i
      // 0f6: istore 8
      // 0f8: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0fb: pop
      // 0fc: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI Lit/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap;
      // 0ff: iload 8
      // 101: invokevirtual it/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap.ensureCapacity (I)V
      // 104: aload 7
      // 106: invokevirtual java/nio/MappedByteBuffer.getInt ()I
      // 109: istore 9
      // 10b: bipush 0
      // 10c: istore 10
      // 10e: iload 10
      // 110: iload 9
      // 112: if_icmpge 1bf
      // 115: iload 10
      // 117: istore 11
      // 119: bipush 0
      // 11a: istore 12
      // 11c: aload 7
      // 11e: invokevirtual java/nio/MappedByteBuffer.getInt ()I
      // 121: istore 13
      // 123: aload 7
      // 125: invokevirtual java/nio/MappedByteBuffer.getInt ()I
      // 128: bipush 4
      // 129: ishl
      // 12a: istore 14
      // 12c: aload 7
      // 12e: invokevirtual java/nio/MappedByteBuffer.getInt ()I
      // 131: bipush 4
      // 132: ishl
      // 133: istore 15
      // 135: getstatic me/octo/client/utils/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
      // 138: iload 14
      // 13a: bipush 0
      // 13b: iload 15
      // 13d: invokevirtual me/octo/client/utils/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.a (III)J
      // 140: lstore 16
      // 142: iload 0
      // 143: ifeq 1c0
      // 146: bipush 0
      // 147: istore 18
      // 149: iload 18
      // 14b: iload 13
      // 14d: if_icmpge 1b7
      // 150: iload 18
      // 152: istore 19
      // 154: bipush 0
      // 155: istore 20
      // 157: aload 7
      // 159: invokevirtual java/nio/MappedByteBuffer.get ()B
      // 15c: istore 21
      // 15e: aload 7
      // 160: invokevirtual java/nio/MappedByteBuffer.getInt ()I
      // 163: istore 22
      // 165: lload 16
      // 167: iload 22
      // 169: bipush 15
      // 16b: iand
      // 16c: i2l
      // 16d: bipush 38
      // 16f: lshl
      // 170: lor
      // 171: iload 22
      // 173: bipush 8
      // 175: ishr
      // 176: sipush 255
      // 179: iand
      // 17a: i2l
      // 17b: bipush 26
      // 17d: lshl
      // 17e: lor
      // 17f: iload 22
      // 181: bipush 4
      // 182: ishr
      // 183: bipush 15
      // 185: iand
      // 186: i2l
      // 187: lor
      // 188: lstore 23
      // 18a: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 18d: pop
      // 18e: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI Lit/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap;
      // 191: checkcast java/util/Map
      // 194: lload 23
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: iload 21
      // 19b: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 19e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1a3: pop
      // 1a4: nop
      // 1a5: iinc 18 1
      // 1a8: iload 0
      // 1a9: ifeq 1bb
      // 1ac: iload 0
      // 1ad: ifne 149
      // 1b0: goto 1b7
      // 1b3: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: nop
      // 1b8: iinc 10 1
      // 1bb: iload 0
      // 1bc: ifne 10e
      // 1bf: nop
      // 1c0: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1c3: astore 5
      // 1c5: aload 3
      // 1c6: aload 4
      // 1c8: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 1cb: goto 1e2
      // 1ce: astore 6
      // 1d0: aload 6
      // 1d2: astore 4
      // 1d4: aload 6
      // 1d6: athrow
      // 1d7: astore 6
      // 1d9: aload 3
      // 1da: aload 4
      // 1dc: invokestatic kotlin/io/CloseableKt.closeFinally (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 1df: aload 6
      // 1e1: athrow
      // 1e2: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1e5: pop
      // 1e6: sipush -18156
      // 1e9: bipush 1
      // 1ea: putstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Z
      // 1ed: sipush 27683
      // 1f0: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1f3: pop
      // 1f4: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI Lit/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap;
      // 1f7: invokevirtual it/unimi/dsi/fastutil/longs/Long2ByteOpenHashMap.size ()I
      // 1fa: invokestatic java/lang/System.currentTimeMillis ()J
      // 1fd: getstatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl J
      // 200: lsub
      // 201: lstore 25
      // 203: istore 27
      // 205: pop2
      // 206: ldc_w "Loaded "
      // 209: iload 27
      // 20b: sipush -18157
      // 20e: sipush -3707
      // 211: pop2
      // 212: ldc_w " cached states in "
      // 215: lload 25
      // 217: sipush -18171
      // 21a: sipush 28553
      // 21d: pop2
      // 21e: ldc_w "ms."
      // 221: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 226: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d (Ljava/lang/String;)V
      // 229: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 22c: areturn
   }

   private static final Vec3 c(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0
   ) {
      return new Vec3(
         IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .b(var0.a())
            + 0.5,
         var0.d(),
         IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var0.a())
            + 0.5
      );
   }

   private static final Unit a(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0,
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1,
      double var2,
      boolean var4
   ) { double var25 = 0.0; // PX-FIX hoist
        
       var25 = 0; // PX-FIX
      int var24 = 0; // PX-FIX
      int var21 = 0; // PX-FIX
      Object var17 = null; // PX-FIX
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = -18148;
      short var10003 = -28542;
      Intrinsics.checkNotNullParameter(var1, "node");
      double var6 = var1.d() - var0.d();
      int var5 = var10000;
      double var15 = var6;
      double var10001 = 1.0;
      if (var5 == 0) {
         if (var6 > 1.0 && var4) {
            return Unit.INSTANCE;
         }

         var15 = var2 + var0.g();
         var10001 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var1);
      }

      double var8;
      long var10;
      label157: {
         label161: {
            byte var12;
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var13;
            label162: {
               var8 = var15 + var10001;
               var10 = var1.a();
               var12 = var1.b();
               var13 = var1.c();
               var10000 =(( var4) ? 1 : 0);
               if (var5 == 0) {
                  if (!var4) {
                     var8 += 2.0;
                     if (var5 == 0) {
                        break label161;
                     }
                  }

                  var17 = Math.abs(var6);
                  if (var5 != 0) {
                     break label162;
                  }

                  double var26;
                  var10000 = (var26 = ((Double)var17) - 0.5625) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
               }

               if (var10000 <= 0) {
                  var10000 = var12;
                  label146:
                  if (var5 == 0) {
                     if (var12 == 2) {
                        var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.e(
                           IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var10, var13.a(), -1, var13.c())
                        );
                        if (var5 != 0) {
                           break label146;
                        }

                        if (var10000 == 0) {
                           var8++;
                        }
                     }

                     double var27;
                     var10000 = (var27 = Math.abs(var6) - 0.5625) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
                  }

                  if (var5 != 0) {
                     break label157;
                  }

                  if (var10000 >= 0) {
                     break label161;
                  }

                  var8 += Math.abs(var6);
                  if (var5 == 0) {
                     break label161;
                  }
               }

               var17 = var8;
            }

            label132: {
               label165: {
                  label166: {
                     var21 = var0.b();
                     var24 = 3;
                     label129:
                     if (var5 == 0) {
                        if (var21 == 3) {
                           var21 = var12;
                           var24 = 3;
                           if (var5 != 0) {
                              break label129;
                           }

                           if (var12 == 3) {
                              var10001 = 0.3;
                              break label132;
                           }
                        }

                        var21 = var12;
                        if (var5 != 0) {
                           break label166;
                        }

                        var24 = 3;
                     }

                     if ((var21 != 0) == (var24 == 0)) {
                        var21 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.e(
                           IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var10, var13.a(), var13.b(), var13.c())
                        );
                        if (var5 != 0) {
                           break label166;
                        }

                        if (var21 == 3) {
                           var10001 = 0.3;
                           break label132;
                        }
                     }

                     var10001 = var6;
                     var25 = 0.0;
                     if (var5 != 0) {
                        break label165;
                     }

                     double var28;
                     var21 = (var28 = var6 - 0.0) == 0.0 ? 0 : (var28 < 0.0 ? -1 : 1);
                  }

                  if (var21 != 0) {
                     var10001 = 10.0;
                     break label132;
                  }

                  var10001 = Math.abs(var6);
                  var25 = 2.0;
               }

               var10001 *= var25;
            }

            var8 = ((Double)var17) + var10001;
         }

         var10000 = 0;
      }

      int var14;
      label168: {
         var14 = var10000;
         var10000 = ((lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.b(var10)) ? 1 : 0);
         if (var5 == 0) {
            if (var10000 != 0) {
               double var29;
               var10000 = (var29 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(var10) - var8) == 0.0
                  ? 0
                  : (var29 < 0.0 ? -1 : 1);
               if (var5 == 0) {
                  if (var10000 <= 0) {
                     return Unit.INSTANCE;
                  }

                  var1.b(IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.get(var10));
                  var10000 = 1;
               }

               var14 = var10000;
               if (var5 == 0) {
                  break label168;
               }
            }

            var10000 = ((IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.containsKey(var10)) ? 1 : 0);
         }

         label96: {
            label169: {
               if (var5 == 0) {
                  if (var10000 == 0) {
                     break label96;
                  }

                  if (var5 != 0) {
                     break label169;
                  }

                  double var30;
                  var10000 = (var30 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(var10) - var8) == 0.0
                     ? 0
                     : (var30 < 0.0 ? -1 : 1);
               }

               if (var10000 <= 0) {
                  return Unit.INSTANCE;
               }

               IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.remove(var10);
            }

            var1.b(IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.get(var10));
            if (var5 == 0) {
               break label168;
            }
         }

         var1.b(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var10));
      }

      label83: {
         var1.c(var8);
         var1.a(Long.valueOf(var0.a()));
         ((Map)llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI).put(var10, var8);
         if (var5 == 0) {
            if (var14 == 0) {
               break label83;
            }

            lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.b(var1);
         }

         if (var5 == 0) {
            return Unit.INSTANCE;
         }
      }

      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.a(var1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var29 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[33];
      int var3 = 0;
      String var2 = "mÄ0ÖÛ~õÀZ\u0096£Ë\u008dÃj\u0007¾s¶§\u0000\u001a \u0013EÊ\u0092ý9¢\u0082\røâ\u0013CäSÐQÜÀ§\u0007÷bå\n¦æ+\u0018ëË\u0012µ*¹\u008e\u0094Ðy¡²ì\u008a_¦\u0004Y©\u0004ëGåÄ\u000eL×\u0081\u0007\f»îûÝ0\u001d°ä5\u0012Å\u000f8¢Ü\\Ó\u0084\u0083\u0005#Ð.ÚÊMÖâ\u000f3/Â<dvæ\u0005sFÊ\u00938þ#\u0005/\u008e\u008c(Ò\u0004]\u000f©)\t®àË\u008eØgQÏ\u008a\u0004(\u001e\u0007É\b_i\u0007ÂØ9\u0097\u0003\u0003¾÷E\b\u008e-ëkW\ff¥\u000f±\u0081\u0092énÌ§R[¬ÏÎ\u0098U7\u0003\u00101)\rÕ#^Ã\u009dRØ$ÓSVQj\u0004\u009aÃS\u0006\u0006¬mØ¨¼\u0088\u0004ý¹¿I\r\u0080\u0002*ä-\u009bn|\u0088b=w\u0007\u0012¿©Í\u0091Ñ5ñ©\u0000\u0082w ¤\u009f\u0095\u0092²¿\u000bX'*\u0012tI&\u001b¥cY\u0011÷ \u000etØ\u0090è\u008c\u0006½i\u0002\u0088îlLu\u000b:\u0019fÕý±\u0017\u0004\u0083\u0080\u009d\u0004XED\u001b\u0006;\u0081*5â;\brfÀ[\u0093¢ÄL\b\u0087)Êës\u001câ§\u0007\u0091\u009c\u008d\u0000!\u001aÓ";
      int var4 = "mÄ0ÖÛ~õÀZ\u0096£Ë\u008dÃj\u0007¾s¶§\u0000\u001a \u0013EÊ\u0092ý9¢\u0082\røâ\u0013CäSÐQÜÀ§\u0007÷bå\n¦æ+\u0018ëË\u0012µ*¹\u008e\u0094Ðy¡²ì\u008a_¦\u0004Y©\u0004ëGåÄ\u000eL×\u0081\u0007\f»îûÝ0\u001d°ä5\u0012Å\u000f8¢Ü\\Ó\u0084\u0083\u0005#Ð.ÚÊMÖâ\u000f3/Â<dvæ\u0005sFÊ\u00938þ#\u0005/\u008e\u008c(Ò\u0004]\u000f©)\t®àË\u008eØgQÏ\u008a\u0004(\u001e\u0007É\b_i\u0007ÂØ9\u0097\u0003\u0003¾÷E\b\u008e-ëkW\ff¥\u000f±\u0081\u0092énÌ§R[¬ÏÎ\u0098U7\u0003\u00101)\rÕ#^Ã\u009dRØ$ÓSVQj\u0004\u009aÃS\u0006\u0006¬mØ¨¼\u0088\u0004ý¹¿I\r\u0080\u0002*ä-\u009bn|\u0088b=w\u0007\u0012¿©Í\u0091Ñ5ñ©\u0000\u0082w ¤\u009f\u0095\u0092²¿\u000bX'*\u0012tI&\u001b¥cY\u0011÷ \u000etØ\u0090è\u008c\u0006½i\u0002\u0088îlLu\u000b:\u0019fÕý±\u0017\u0004\u0083\u0080\u009d\u0004XED\u001b\u0006;\u0081*5â;\brfÀ[\u0093¢ÄL\b\u0087)Êës\u001câ§\u0007\u0091\u009c\u008d\u0000!\u001aÓ"
         .length();
      char var1 = 15;
      int var11 = -1;

      label52:
      while (true) {
         byte var10000 = 39;
         String var10001 = var2.substring(++var11, var11 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var33 = var10001.toCharArray();
               int var10004 = var33.length;
               int var6 = 0;
               byte var36 = var10000;
               var29 = var33;
               int var23 = var10004;
               byte var41;
               char[] var45;
               int var10006;
               if (var10004 <= 1) {
                  var45 = var33;
                  var41 = var10000;
                  var10006 = var6;
               } else {
                  var36 = var10000;
                  var23 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var45 = var33;
                  var41 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var45[var10006] = (char)(var45[var10006] ^ var41 ^ switch (var6 % 7) {
                     case 0 -> 32;
                     case 1 -> 5;
                     case 2 -> 2;
                     case 3 -> 76;
                     case 4 -> 125;
                     case 5 -> 40;
                     default -> 37;
                  });
                  var6++;
                  if (var36 == 0) {
                     var10006 = var36;
                     var45 = var29;
                     var41 = var36;
                  } else {
                     if (var23 <= var6) {
                        break;
                     }

                     var45 = var29;
                     var41 = var36;
                     var10006 = var6;
                  }
               }
            }

            String var38 = new String(var29).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var38;
                  if ((var11 += var1) >= var4) {
                     c = var5;
                     d = new String[33];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 8.0;
                     Byte[] var7 = new Byte[]{(byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13, (byte)14};
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = SetsKt.hashSetOf(var7);
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new Byte2DoubleOpenHashMap();
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)0, 1.0);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)1, 1.0);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)2, 0.5);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)3, 1.0);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)4, 0.0625);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)5, 1.0);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)6, 1.1);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)7, 0.0);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)8, 0.125);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)9, 0.25);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)10, 0.375);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)11, 0.5);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)12, 0.625);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)13, 0.75);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)14, 0.875);
                     ((Map)IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll).put((byte)15, 1.0);
                     IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[] var12 = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[]{
                        new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           1, 0, 0
                        ),
                        new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           -1, 0, 0
                        ),
                        new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           0, 0, 1
                        ),
                        new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           0, 0, -1
                        )
                     };
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = CollectionsKt.listOf(var12);
                     Long2ByteOpenHashMap var13 = new Long2ByteOpenHashMap();
                     boolean var9 = false;
                     var13.defaultReturnValue((byte)-1);
                     IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var13;
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new Long2DoubleOpenHashMap();
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new HashMap<>();
                     Long2DoubleOpenHashMap var14 = new Long2DoubleOpenHashMap();
                     var9 = false;
                     var14.defaultReturnValue(-1.0);
                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var14;
                     Long2DoubleOpenHashMap var15 = new Long2DoubleOpenHashMap();
                     var9 = false;
                     var15.defaultReturnValue(-1.0);
                     lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var15;
                     IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new MutableBlockPos();
                     IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = Integer.MAX_VALUE;
                     lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = Integer.MAX_VALUE;
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = true;
                     lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new Long2ByteOpenHashMap();
                     IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new HashMap<>();
                     IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 3600.0;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var11);
                  break;
               default:
                  var5[var3++] = var38;
                  if ((var11 += var1) < var4) {
                     var1 = var2.charAt(var11);
                     continue label52;
                  }

                  var2 = "Ù\u001d¼Åß \u0093ù]\u0099\u0001\u0004½\u0080]ñ";
                  var4 = "Ù\u001d¼Åß \u0093ù]\u0099\u0001\u0004½\u0080]ñ".length();
                  var1 = 11;
                  var11 = -1;
            }

            var10000 = 71;
            var10001 = var2.substring(++var11, var11 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -18155) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 5;
            case 1 -> 107;
            case 2 -> 104;
            case 3 -> 223;
            case 4 -> 48;
            case 5 -> 7;
            case 6 -> 38;
            case 7 -> 140;
            case 8 -> 136;
            case 9 -> 91;
            case 10 -> 245;
            case 11 -> 4;
            case 12 -> 25;
            case 13 -> 28;
            case 14 -> 35;
            case 15 -> 40;
            case 16 -> 20;
            case 17 -> 131;
            case 18 -> 214;
            case 19 -> 119;
            case 20 -> 58;
            case 21 -> 173;
            case 22 -> 71;
            case 23 -> 15;
            case 24 -> 98;
            case 25 -> 37;
            case 26 -> 240;
            case 27 -> 18;
            case 28 -> 129;
            case 29 -> 241;
            case 30 -> 229;
            case 31 -> 109;
            case 32 -> 177;
            case 33 -> 143;
            case 34 -> 247;
            case 35 -> 74;
            case 36 -> 166;
            case 37 -> 128;
            case 38 -> 83;
            case 39 -> 216;
            case 40 -> 228;
            case 41 -> 95;
            case 42 -> 10;
            case 43 -> 84;
            case 44 -> 155;
            case 45 -> 208;
            case 46 -> 161;
            case 47 -> 43;
            case 48 -> 101;
            case 49 -> 68;
            case 50 -> 210;
            case 51 -> 31;
            case 52 -> 89;
            case 53 -> 60;
            case 54 -> 80;
            case 55 -> 108;
            case 56 -> 120;
            case 57 -> 138;
            case 58 -> 233;
            case 59 -> 141;
            case 60 -> 212;
            case 61 -> 61;
            case 62 -> 12;
            case 63 -> 184;
            case 64 -> 197;
            case 65 -> 165;
            case 66 -> 188;
            case 67 -> 193;
            case 68 -> 36;
            case 69 -> 127;
            case 70 -> 55;
            case 71 -> 236;
            case 72 -> 103;
            case 73 -> 211;
            case 74 -> 42;
            case 75 -> 244;
            case 76 -> 202;
            case 77 -> 250;
            case 78 -> 130;
            case 79 -> 90;
            case 80 -> 203;
            case 81 -> 187;
            case 82 -> 56;
            case 83 -> 154;
            case 84 -> 54;
            case 85 -> 22;
            case 86 -> 93;
            case 87 -> 213;
            case 88 -> 124;
            case 89 -> 224;
            case 90 -> 78;
            case 91 -> 185;
            case 92 -> 23;
            case 93 -> 27;
            case 94 -> 239;
            case 95 -> 41;
            case 96 -> 110;
            case 97 -> 11;
            case 98 -> 186;
            case 99 -> 6;
            case 100 -> 139;
            case 101 -> 150;
            case 102 -> 146;
            case 103 -> 243;
            case 104 -> 82;
            case 105 -> 179;
            case 106 -> 87;
            case 107 -> 142;
            case 108 -> 77;
            case 109 -> 145;
            case 110 -> 97;
            case 111 -> 200;
            case 112 -> 181;
            case 113 -> 204;
            case 114 -> 117;
            case 115 -> 17;
            case 116 -> 220;
            case 117 -> 50;
            case 118 -> 19;
            case 119 -> 32;
            case 120 -> 227;
            case 121 -> 153;
            case 122 -> 34;
            case 123 -> 230;
            case 124 -> 100;
            case 125 -> 147;
            case 126 -> 92;
            case 127 -> 135;
            case 128 -> 209;
            case 129 -> 190;
            case 130 -> 222;
            case 131 -> 67;
            case 132 -> 30;
            case 133 -> 85;
            case 134 -> 201;
            case 135 -> 72;
            case 136 -> 105;
            case 137 -> 118;
            case 138 -> 183;
            case 139 -> 182;
            case 140 -> 106;
            case 141 -> 168;
            case 142 -> 225;
            case 143 -> 180;
            case 144 -> 252;
            case 145 -> 158;
            case 146 -> 189;
            case 147 -> 29;
            case 148 -> 57;
            case 149 -> 205;
            case 150 -> 96;
            case 151 -> 152;
            case 152 -> 79;
            case 153 -> 198;
            case 154 -> 9;
            case 155 -> 8;
            case 156 -> 199;
            case 157 -> 242;
            case 158 -> 249;
            case 159 -> 81;
            case 160 -> 218;
            case 161 -> 86;
            case 162 -> 66;
            case 163 -> 235;
            case 164 -> 53;
            case 165 -> 1;
            case 166 -> 24;
            case 167 -> 64;
            case 168 -> 44;
            case 169 -> 114;
            case 170 -> 65;
            case 171 -> 248;
            case 172 -> 39;
            case 173 -> 246;
            case 174 -> 176;
            case 175 -> 160;
            case 176 -> 137;
            case 177 -> 99;
            case 178 -> 62;
            case 179 -> 73;
            case 180 -> 215;
            case 181 -> 238;
            case 182 -> 45;
            case 183 -> 254;
            case 184 -> 3;
            case 185 -> 46;
            case 186 -> 196;
            case 187 -> 178;
            case 188 -> 21;
            case 189 -> 88;
            case 190 -> 226;
            case 191 -> 164;
            case 192 -> 121;
            case 193 -> 253;
            case 194 -> 163;
            case 195 -> 113;
            case 196 -> 122;
            case 197 -> 157;
            case 198 -> 148;
            case 199 -> 111;
            case 200 -> 116;
            case 201 -> 237;
            case 202 -> 102;
            case 203 -> 52;
            case 204 -> 255;
            case 205 -> 2;
            case 206 -> 207;
            case 207 -> 172;
            case 208 -> 174;
            case 209 -> 112;
            case 210 -> 63;
            case 211 -> 132;
            case 212 -> 14;
            case 213 -> 69;
            case 214 -> 26;
            case 215 -> 123;
            case 216 -> 219;
            case 217 -> 169;
            case 218 -> 49;
            case 219 -> 125;
            case 220 -> 0;
            case 221 -> 13;
            case 222 -> 175;
            case 223 -> 191;
            case 224 -> 76;
            case 225 -> 94;
            case 226 -> 251;
            case 227 -> 170;
            case 228 -> 156;
            case 229 -> 133;
            case 230 -> 159;
            case 231 -> 192;
            case 232 -> 149;
            case 233 -> 115;
            case 234 -> 126;
            case 235 -> 151;
            case 236 -> 171;
            case 237 -> 194;
            case 238 -> 16;
            case 239 -> 75;
            case 240 -> 231;
            case 241 -> 33;
            case 242 -> 167;
            case 243 -> 59;
            case 244 -> 221;
            case 245 -> 217;
            case 246 -> 206;
            case 247 -> 232;
            case 248 -> 144;
            case 249 -> 162;
            case 250 -> 134;
            case 251 -> 70;
            case 252 -> 47;
            case 253 -> 195;
            case 254 -> 234;
            default -> 51;
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

   public static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(int var1, int var2, int var3) {
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
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(
         int var1, int var2, int var3
      ) {
         return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -21492;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 30223;
         short var10002 = -21491;
         short var10003 = -8318;
         short var10004 = -21490;
         short var10005 = 6693;
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
         int var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var10000;
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
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "\\°¹ØFl\"\u0087&\u0004¨U7¤\u0004S\u0014K\u008c";
         int var4 = "\\°¹ØFl\"\u0087&\u0004¨U7¤\u0004S\u0014K\u008c".length();
         char var1 = '\t';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 98;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 98;
                  var10006 = var6;
               } else {
                  var13 = 98;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 98;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 76;
                     case 1 -> 16;
                     case 2 -> 85;
                     case 3 -> 59;
                     case 4 -> 58;
                     case 5 -> 87;
                     default -> 98;
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
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -21492) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 34;
               case 1 -> 167;
               case 2 -> 123;
               case 3 -> 182;
               case 4 -> 135;
               case 5 -> 116;
               case 6 -> 217;
               case 7 -> 96;
               case 8 -> 249;
               case 9 -> 199;
               case 10 -> 254;
               case 11 -> 40;
               case 12 -> 186;
               case 13 -> 169;
               case 14 -> 101;
               case 15 -> 228;
               case 16 -> 194;
               case 17 -> 192;
               case 18 -> 241;
               case 19 -> 50;
               case 20 -> 193;
               case 21 -> 73;
               case 22 -> 204;
               case 23 -> 246;
               case 24 -> 165;
               case 25 -> 231;
               case 26 -> 52;
               case 27 -> 0;
               case 28 -> 230;
               case 29 -> 55;
               case 30 -> 121;
               case 31 -> 119;
               case 32 -> 70;
               case 33 -> 176;
               case 34 -> 64;
               case 35 -> 43;
               case 36 -> 137;
               case 37 -> 233;
               case 38 -> 76;
               case 39 -> 190;
               case 40 -> 79;
               case 41 -> 39;
               case 42 -> 26;
               case 43 -> 66;
               case 44 -> 201;
               case 45 -> 240;
               case 46 -> 102;
               case 47 -> 99;
               case 48 -> 174;
               case 49 -> 157;
               case 50 -> 120;
               case 51 -> 138;
               case 52 -> 197;
               case 53 -> 253;
               case 54 -> 14;
               case 55 -> 239;
               case 56 -> 243;
               case 57 -> 47;
               case 58 -> 62;
               case 59 -> 214;
               case 60 -> 244;
               case 61 -> 164;
               case 62 -> 145;
               case 63 -> 10;
               case 64 -> 77;
               case 65 -> 187;
               case 66 -> 227;
               case 67 -> 221;
               case 68 -> 159;
               case 69 -> 111;
               case 70 -> 27;
               case 71 -> 130;
               case 72 -> 42;
               case 73 -> 100;
               case 74 -> 80;
               case 75 -> 220;
               case 76 -> 12;
               case 77 -> 126;
               case 78 -> 53;
               case 79 -> 1;
               case 80 -> 89;
               case 81 -> 153;
               case 82 -> 72;
               case 83 -> 147;
               case 84 -> 234;
               case 85 -> 28;
               case 86 -> 84;
               case 87 -> 75;
               case 88 -> 98;
               case 89 -> 158;
               case 90 -> 161;
               case 91 -> 63;
               case 92 -> 205;
               case 93 -> 196;
               case 94 -> 92;
               case 95 -> 250;
               case 96 -> 2;
               case 97 -> 134;
               case 98 -> 44;
               case 99 -> 226;
               case 100 -> 59;
               case 101 -> 181;
               case 102 -> 85;
               case 103 -> 251;
               case 104 -> 60;
               case 105 -> 91;
               case 106 -> 37;
               case 107 -> 125;
               case 108 -> 31;
               case 109 -> 97;
               case 110 -> 133;
               case 111 -> 4;
               case 112 -> 20;
               case 113 -> 247;
               case 114 -> 210;
               case 115 -> 86;
               case 116 -> 195;
               case 117 -> 189;
               case 118 -> 118;
               case 119 -> 11;
               case 120 -> 105;
               case 121 -> 29;
               case 122 -> 151;
               case 123 -> 155;
               case 124 -> 81;
               case 125 -> 212;
               case 126 -> 168;
               case 127 -> 224;
               case 128 -> 124;
               case 129 -> 144;
               case 130 -> 17;
               case 131 -> 175;
               case 132 -> 206;
               case 133 -> 46;
               case 134 -> 216;
               case 135 -> 213;
               case 136 -> 142;
               case 137 -> 56;
               case 138 -> 185;
               case 139 -> 200;
               case 140 -> 94;
               case 141 -> 7;
               case 142 -> 22;
               case 143 -> 3;
               case 144 -> 69;
               case 145 -> 211;
               case 146 -> 248;
               case 147 -> 45;
               case 148 -> 209;
               case 149 -> 198;
               case 150 -> 203;
               case 151 -> 65;
               case 152 -> 13;
               case 153 -> 236;
               case 154 -> 149;
               case 155 -> 24;
               case 156 -> 178;
               case 157 -> 235;
               case 158 -> 35;
               case 159 -> 238;
               case 160 -> 15;
               case 161 -> 9;
               case 162 -> 170;
               case 163 -> 67;
               case 164 -> 90;
               case 165 -> 252;
               case 166 -> 57;
               case 167 -> 8;
               case 168 -> 68;
               case 169 -> 183;
               case 170 -> 114;
               case 171 -> 208;
               case 172 -> 6;
               case 173 -> 21;
               case 174 -> 71;
               case 175 -> 23;
               case 176 -> 122;
               case 177 -> 215;
               case 178 -> 148;
               case 179 -> 184;
               case 180 -> 188;
               case 181 -> 160;
               case 182 -> 33;
               case 183 -> 223;
               case 184 -> 191;
               case 185 -> 129;
               case 186 -> 242;
               case 187 -> 222;
               case 188 -> 171;
               case 189 -> 51;
               case 190 -> 107;
               case 191 -> 41;
               case 192 -> 87;
               case 193 -> 163;
               case 194 -> 143;
               case 195 -> 93;
               case 196 -> 202;
               case 197 -> 104;
               case 198 -> 108;
               case 199 -> 232;
               case 200 -> 173;
               case 201 -> 54;
               case 202 -> 136;
               case 203 -> 128;
               case 204 -> 103;
               case 205 -> 154;
               case 206 -> 245;
               case 207 -> 179;
               case 208 -> 19;
               case 209 -> 172;
               case 210 -> 255;
               case 211 -> 219;
               case 212 -> 146;
               case 213 -> 16;
               case 214 -> 117;
               case 215 -> 152;
               case 216 -> 207;
               case 217 -> 141;
               case 218 -> 74;
               case 219 -> 38;
               case 220 -> 78;
               case 221 -> 82;
               case 222 -> 49;
               case 223 -> 225;
               case 224 -> 95;
               case 225 -> 109;
               case 226 -> 140;
               case 227 -> 83;
               case 228 -> 156;
               case 229 -> 110;
               case 230 -> 132;
               case 231 -> 112;
               case 232 -> 88;
               case 233 -> 237;
               case 234 -> 30;
               case 235 -> 131;
               case 236 -> 113;
               case 237 -> 115;
               case 238 -> 166;
               case 239 -> 32;
               case 240 -> 162;
               case 241 -> 218;
               case 242 -> 61;
               case 243 -> 58;
               case 244 -> 229;
               case 245 -> 177;
               case 246 -> 36;
               case 247 -> 180;
               case 248 -> 150;
               case 249 -> 25;
               case 250 -> 48;
               case 251 -> 106;
               case 252 -> 5;
               case 253 -> 139;
               case 254 -> 127;
               default -> 18;
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

   public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var5 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var5 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return var1.a(var2, var3, var4);
   }

   }

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull BlockPos var1,
         @NotNull Vec3 var2,
         @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var3
      ) {
         short var10001 = -2395;
         short var10002 = -29223;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -2385;
         var10002 = -15881;
         Intrinsics.checkNotNullParameter(var2, "point");
         var10001 = -2388;
         var10002 = -269;
         Intrinsics.checkNotNullParameter(var3, "type");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final BlockPos d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull BlockPos var1,
         @NotNull Vec3 var2,
         @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var3
      ) {
         short var10001 = -2392;
         short var10002 = -27690;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -2391;
         var10002 = 14798;
         Intrinsics.checkNotNullParameter(var2, "point");
         var10001 = -2389;
         var10002 = -10968;
         Intrinsics.checkNotNullParameter(var3, "type");
         return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -2387;
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Vec3 var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -24164;
         short var10002 = -2386;
         byte var10003 = 123;
         short var10004 = -2390;
         short var10005 = -19994;
         return "ExecutionNode(pos=" + var3 + ", point=" + var2 + ", type=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != 0) {
            if (!var4) {
               return false;
            }

            if (var2 == 0) {
               return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  == var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         return !var4
            ? false
            : this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               == var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "\u0091Á\u0084_\u001bøÎ5~Tp^\u0081\u00146Mõe\u0004\u0001i\u0094m\u0005~[æôÛ\bN·.Îå]\u0093\u008a\u0005¼D¾\u0017Ð\u0003\f¦²\u0004zRû\n";
         int var4 = "\u0091Á\u0084_\u001bøÎ5~Tp^\u0081\u00146Mõe\u0004\u0001i\u0094m\u0005~[æôÛ\bN·.Îå]\u0093\u008a\u0005¼D¾\u0017Ð\u0003\f¦²\u0004zRû\n"
            .length();
         char var1 = 18;
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
                        case 0 -> 55;
                        case 1 -> 71;
                        case 2 -> 60;
                        case 3 -> 127;
                        case 4 -> 84;
                        case 5 -> 99;
                        default -> 113;
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
                        b = new String[9];
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

                     var2 = "\u0012³a\u0098Q\u0088¶\u0003\u0000\u0013ó";
                     var4 = "\u0012³a\u0098Q\u0088¶\u0003\u0000\u0013ó".length();
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

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -2387) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 180;
               case 1 -> 52;
               case 2 -> 34;
               case 3 -> 230;
               case 4 -> 131;
               case 5 -> 189;
               case 6 -> 229;
               case 7 -> 41;
               case 8 -> 234;
               case 9 -> 94;
               case 10 -> 231;
               case 11 -> 87;
               case 12 -> 58;
               case 13 -> 30;
               case 14 -> 203;
               case 15 -> 57;
               case 16 -> 13;
               case 17 -> 175;
               case 18 -> 206;
               case 19 -> 106;
               case 20 -> 136;
               case 21 -> 14;
               case 22 -> 133;
               case 23 -> 114;
               case 24 -> 223;
               case 25 -> 210;
               case 26 -> 82;
               case 27 -> 128;
               case 28 -> 182;
               case 29 -> 205;
               case 30 -> 253;
               case 31 -> 241;
               case 32 -> 80;
               case 33 -> 56;
               case 34 -> 202;
               case 35 -> 159;
               case 36 -> 188;
               case 37 -> 91;
               case 38 -> 148;
               case 39 -> 10;
               case 40 -> 115;
               case 41 -> 42;
               case 42 -> 246;
               case 43 -> 217;
               case 44 -> 162;
               case 45 -> 164;
               case 46 -> 32;
               case 47 -> 73;
               case 48 -> 138;
               case 49 -> 194;
               case 50 -> 168;
               case 51 -> 98;
               case 52 -> 99;
               case 53 -> 8;
               case 54 -> 249;
               case 55 -> 62;
               case 56 -> 191;
               case 57 -> 39;
               case 58 -> 23;
               case 59 -> 176;
               case 60 -> 97;
               case 61 -> 2;
               case 62 -> 27;
               case 63 -> 19;
               case 64 -> 95;
               case 65 -> 166;
               case 66 -> 142;
               case 67 -> 40;
               case 68 -> 108;
               case 69 -> 3;
               case 70 -> 171;
               case 71 -> 239;
               case 72 -> 177;
               case 73 -> 53;
               case 74 -> 78;
               case 75 -> 63;
               case 76 -> 219;
               case 77 -> 132;
               case 78 -> 75;
               case 79 -> 67;
               case 80 -> 211;
               case 81 -> 112;
               case 82 -> 35;
               case 83 -> 120;
               case 84 -> 102;
               case 85 -> 149;
               case 86 -> 85;
               case 87 -> 16;
               case 88 -> 150;
               case 89 -> 25;
               case 90 -> 6;
               case 91 -> 244;
               case 92 -> 122;
               case 93 -> 245;
               case 94 -> 84;
               case 95 -> 81;
               case 96 -> 86;
               case 97 -> 121;
               case 98 -> 243;
               case 99 -> 93;
               case 100 -> 74;
               case 101 -> 59;
               case 102 -> 160;
               case 103 -> 235;
               case 104 -> 161;
               case 105 -> 134;
               case 106 -> 252;
               case 107 -> 83;
               case 108 -> 213;
               case 109 -> 15;
               case 110 -> 214;
               case 111 -> 88;
               case 112 -> 163;
               case 113 -> 20;
               case 114 -> 187;
               case 115 -> 70;
               case 116 -> 178;
               case 117 -> 125;
               case 118 -> 208;
               case 119 -> 1;
               case 120 -> 209;
               case 121 -> 157;
               case 122 -> 61;
               case 123 -> 228;
               case 124 -> 9;
               case 125 -> 28;
               case 126 -> 226;
               case 127 -> 90;
               case 128 -> 127;
               case 129 -> 5;
               case 130 -> 201;
               case 131 -> 55;
               case 132 -> 242;
               case 133 -> 173;
               case 134 -> 4;
               case 135 -> 147;
               case 136 -> 193;
               case 137 -> 89;
               case 138 -> 220;
               case 139 -> 199;
               case 140 -> 169;
               case 141 -> 227;
               case 142 -> 130;
               case 143 -> 29;
               case 144 -> 123;
               case 145 -> 0;
               case 146 -> 184;
               case 147 -> 68;
               case 148 -> 50;
               case 149 -> 104;
               case 150 -> 215;
               case 151 -> 7;
               case 152 -> 190;
               case 153 -> 46;
               case 154 -> 222;
               case 155 -> 153;
               case 156 -> 101;
               case 157 -> 60;
               case 158 -> 69;
               case 159 -> 109;
               case 160 -> 216;
               case 161 -> 65;
               case 162 -> 54;
               case 163 -> 107;
               case 164 -> 156;
               case 165 -> 232;
               case 166 -> 146;
               case 167 -> 117;
               case 168 -> 225;
               case 169 -> 66;
               case 170 -> 207;
               case 171 -> 140;
               case 172 -> 100;
               case 173 -> 92;
               case 174 -> 224;
               case 175 -> 124;
               case 176 -> 192;
               case 177 -> 167;
               case 178 -> 240;
               case 179 -> 198;
               case 180 -> 250;
               case 181 -> 45;
               case 182 -> 195;
               case 183 -> 185;
               case 184 -> 212;
               case 185 -> 76;
               case 186 -> 181;
               case 187 -> 38;
               case 188 -> 247;
               case 189 -> 48;
               case 190 -> 143;
               case 191 -> 174;
               case 192 -> 26;
               case 193 -> 141;
               case 194 -> 236;
               case 195 -> 218;
               case 196 -> 137;
               case 197 -> 139;
               case 198 -> 24;
               case 199 -> 145;
               case 200 -> 17;
               case 201 -> 110;
               case 202 -> 135;
               case 203 -> 221;
               case 204 -> 77;
               case 205 -> 254;
               case 206 -> 197;
               case 207 -> 183;
               case 208 -> 22;
               case 209 -> 79;
               case 210 -> 237;
               case 211 -> 116;
               case 212 -> 152;
               case 213 -> 33;
               case 214 -> 21;
               case 215 -> 49;
               case 216 -> 170;
               case 217 -> 36;
               case 218 -> 11;
               case 219 -> 111;
               case 220 -> 158;
               case 221 -> 196;
               case 222 -> 126;
               case 223 -> 119;
               case 224 -> 18;
               case 225 -> 12;
               case 226 -> 47;
               case 227 -> 165;
               case 228 -> 179;
               case 229 -> 103;
               case 230 -> 151;
               case 231 -> 31;
               case 232 -> 144;
               case 233 -> 113;
               case 234 -> 105;
               case 235 -> 238;
               case 236 -> 118;
               case 237 -> 51;
               case 238 -> 248;
               case 239 -> 44;
               case 240 -> 204;
               case 241 -> 129;
               case 242 -> 172;
               case 243 -> 96;
               case 244 -> 43;
               case 245 -> 186;
               case 246 -> 200;
               case 247 -> 154;
               case 248 -> 233;
               case 249 -> 255;
               case 250 -> 251;
               case 251 -> 37;
               case 252 -> 155;
               case 253 -> 72;
               case 254 -> 71;
               default -> 64;
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

   public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1, net.minecraft.core.BlockPos var2, net.minecraft.world.phys.Vec3 var3, me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var4, int var5, Object var6) {
      if ((var5 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var5 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var5 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return var1.a(var2, var3, var4);
   }

   }

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      private final ArrayList<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
      @NotNull
      private final Long2IntOpenHashMap lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Long2IntOpenHashMap();
      private static String[] a;
      private static String[] b;

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         long var1
      ) {
         Object var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .get(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1));
         short var10002 = 10889;
         short var10003 = -21759;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
         return (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10000;
      }

      public final void a(
         @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1
      ) {
         short var10001 = 10890;
         short var10002 = -10001;
         Intrinsics.checkNotNullParameter(var1, "node");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var1);
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1;
         ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var1.a(), var2);
         this.a(var2);
      }

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a() {
         int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         Object var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(0);
         short var10003 = 10895;
         short var10004 = -5162;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var2 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10001;
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
            short var10002 = 10891;
            var10003 = 29186;
            Intrinsics.checkNotNullExpressionValue(var4, "removeAt(...)");
         }

         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var4;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(0, var3);
         ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var3.a(), 0);
         this.b(0);
         return var2;
      }

      public final void b() {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.clear();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      }

      public final boolean b(long var1) {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var1);
      }

      public final void b(
         @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1
      ) {
         short var10001 = 10888;
         short var10002 = 22266;
         Intrinsics.checkNotNullParameter(var1, "node");
         int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1.a());
         double var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var3).e();
         int var2 = var10000;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var1);
         double var7;
         var10000 = (var7 = var1.e() - var4) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
         if (var2 != 0) {
            if (var10000 < 0) {
               this.a(var3);
               if (var2 != 0) {
                  return;
               }
            }

            double var8;
            var10000 = (var8 = var1.e() - var4) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
         }

         if (var10000 > 0) {
            this.b(var3);
         }
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
      }

      public final boolean d() {
         int var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
         if (var1 != 0) {
            var10000 = !var10000;
         }

         return var10000;
      }

      private final void a(int var1) {
         int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         int var3 = var1;
         int var2 = var10000;
         Object var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10002 = 10895;
         short var10003 = -5162;
         Intrinsics.checkNotNullExpressionValue(var7, "get(...)");
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var4 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var7;

         while (var3 > 0) {
            int var5 = (var3 - 1) / 2;
            Object var8 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var5);
            var10002 = 10895;
            var10003 = -5162;
            Intrinsics.checkNotNullExpressionValue(var8, "get(...)");
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var6 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var8;
            double var12;
            var10000 = (var12 = var6.e() - var4.e()) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
            if (var2 == 0) {
               if (var10000 <= 0 && var2 == 0) {
                  break;
               }

               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var6);
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var5, var4);
               ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var6.a(), var3);
               ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var4.a(), var5);
               var10000 = var5;
            }

            var3 = var10000;
            if (var2 != 0) {
               break;
            }
         }
      }

      private final void b(int var1) {
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var12 = null; // PX-FIX
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
         int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         int var4 = var1;
         int var2 = var10000;
         Object var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10002 = 10895;
         short var10003 = -5162;
         Intrinsics.checkNotNullExpressionValue(var10, "get(...)");
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var5 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10;

         do {
            int var8;
            label53: {
               label52: {
                  label51: {
                     label59: {
                        int var10001;
                        label60: {
                           label48: {
                              int var6 = 2 * var4 + 1;
                              int var7 = 2 * var4 + 2;
                              var8 = -1;
                              if (var6 < var3) {
                                 var8 = var6;
                                 var10000 = var7;
                                 var10001 = var3;
                                 if (var2 == 0 || var2 == 0) {
                                    break label60;
                                 }

                                 if (var7 < var3) {
                                    double var16;
                                    var10000 = (
                                             var16 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var7).e()
                                                - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var6).e()
                                          )
                                          == 0.0
                                       ? 0
                                       : (var16 < 0.0 ? -1 : 1);
                                    if (var2 == 0) {
                                       break label48;
                                    }

                                    if (var10000 < 0) {
                                       var8 = var7;
                                    }
                                 }
                              }

                              var10000 = var8;
                           }

                           if (var2 == 0) {
                              break label59;
                           }

                           var10001 = -1;
                        }

                        if (var10000 == var10001) {
                           break label51;
                        }

                        var12 = var5;
                        if (var2 == 0) {
                           break label53;
                        }

                        double var17;
                        var10000 = (var17 = var5.e() - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8).e())
                              == 0.0
                           ? 0
                           : (var17 < 0.0 ? -1 : 1);
                     }

                     if (var10000 > 0) {
                        break label52;
                     }
                  }

                  if (var2 != 0) {
                     break;
                  }
               }

               Object var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8);
               var10002 = 10895;
               var10003 = -5162;
               Intrinsics.checkNotNullExpressionValue(var13, "get(...)");
               var12 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var13;
            }

            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var9 = var12;
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var4, var9);
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var8, var5);
            ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var9.a(), var4);
            ((Map)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).put(var5.a(), var8);
            var4 = var8;
         } while (var2 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "·=&.M)\u0097ö|\u008b£\u008b½\u0004¿Ä±P\bBÃ6¶-Þ§w";
         int var4 = "·=&.M)\u0097ö|\u008b£\u008b½\u0004¿Ä±P\bBÃ6¶-Þ§w".length();
         char var1 = '\r';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 5;
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
                        case 0 -> 3;
                        case 1 -> 110;
                        case 2 -> 68;
                        case 3 -> 71;
                        case 4 -> 18;
                        case 5 -> 70;
                        default -> 32;
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

                     var2 = "õýÐ_\b±é`ÛÏ[Óï";
                     var4 = "õýÐ_\b±é`ÛÏ[Óï".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 12;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 10891) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 70;
               case 1 -> 250;
               case 2 -> 7;
               case 3 -> 255;
               case 4 -> 8;
               case 5 -> 197;
               case 6 -> 95;
               case 7 -> 219;
               case 8 -> 180;
               case 9 -> 162;
               case 10 -> 179;
               case 11 -> 157;
               case 12 -> 93;
               case 13 -> 239;
               case 14 -> 181;
               case 15 -> 39;
               case 16 -> 29;
               case 17 -> 203;
               case 18 -> 33;
               case 19 -> 61;
               case 20 -> 187;
               case 21 -> 42;
               case 22 -> 40;
               case 23 -> 31;
               case 24 -> 54;
               case 25 -> 122;
               case 26 -> 110;
               case 27 -> 96;
               case 28 -> 32;
               case 29 -> 144;
               case 30 -> 47;
               case 31 -> 58;
               case 32 -> 17;
               case 33 -> 192;
               case 34 -> 172;
               case 35 -> 245;
               case 36 -> 104;
               case 37 -> 78;
               case 38 -> 161;
               case 39 -> 100;
               case 40 -> 226;
               case 41 -> 14;
               case 42 -> 38;
               case 43 -> 50;
               case 44 -> 76;
               case 45 -> 163;
               case 46 -> 188;
               case 47 -> 121;
               case 48 -> 22;
               case 49 -> 99;
               case 50 -> 190;
               case 51 -> 254;
               case 52 -> 35;
               case 53 -> 89;
               case 54 -> 103;
               case 55 -> 43;
               case 56 -> 147;
               case 57 -> 114;
               case 58 -> 45;
               case 59 -> 10;
               case 60 -> 251;
               case 61 -> 113;
               case 62 -> 19;
               case 63 -> 77;
               case 64 -> 0;
               case 65 -> 169;
               case 66 -> 125;
               case 67 -> 83;
               case 68 -> 222;
               case 69 -> 115;
               case 70 -> 210;
               case 71 -> 159;
               case 72 -> 201;
               case 73 -> 135;
               case 74 -> 217;
               case 75 -> 148;
               case 76 -> 140;
               case 77 -> 233;
               case 78 -> 204;
               case 79 -> 246;
               case 80 -> 177;
               case 81 -> 3;
               case 82 -> 165;
               case 83 -> 252;
               case 84 -> 238;
               case 85 -> 12;
               case 86 -> 112;
               case 87 -> 81;
               case 88 -> 25;
               case 89 -> 69;
               case 90 -> 199;
               case 91 -> 106;
               case 92 -> 198;
               case 93 -> 126;
               case 94 -> 215;
               case 95 -> 176;
               case 96 -> 185;
               case 97 -> 51;
               case 98 -> 136;
               case 99 -> 183;
               case 100 -> 92;
               case 101 -> 116;
               case 102 -> 20;
               case 103 -> 18;
               case 104 -> 120;
               case 105 -> 191;
               case 106 -> 171;
               case 107 -> 149;
               case 108 -> 202;
               case 109 -> 71;
               case 110 -> 166;
               case 111 -> 98;
               case 112 -> 131;
               case 113 -> 118;
               case 114 -> 213;
               case 115 -> 193;
               case 116 -> 34;
               case 117 -> 46;
               case 118 -> 68;
               case 119 -> 155;
               case 120 -> 178;
               case 121 -> 158;
               case 122 -> 36;
               case 123 -> 13;
               case 124 -> 249;
               case 125 -> 82;
               case 126 -> 67;
               case 127 -> 26;
               case 128 -> 146;
               case 129 -> 229;
               case 130 -> 145;
               case 131 -> 27;
               case 132 -> 216;
               case 133 -> 209;
               case 134 -> 111;
               case 135 -> 91;
               case 136 -> 85;
               case 137 -> 109;
               case 138 -> 65;
               case 139 -> 214;
               case 140 -> 55;
               case 141 -> 66;
               case 142 -> 189;
               case 143 -> 57;
               case 144 -> 49;
               case 145 -> 75;
               case 146 -> 150;
               case 147 -> 53;
               case 148 -> 72;
               case 149 -> 164;
               case 150 -> 221;
               case 151 -> 235;
               case 152 -> 60;
               case 153 -> 48;
               case 154 -> 167;
               case 155 -> 247;
               case 156 -> 94;
               case 157 -> 107;
               case 158 -> 156;
               case 159 -> 151;
               case 160 -> 41;
               case 161 -> 80;
               case 162 -> 212;
               case 163 -> 184;
               case 164 -> 127;
               case 165 -> 6;
               case 166 -> 73;
               case 167 -> 79;
               case 168 -> 101;
               case 169 -> 220;
               case 170 -> 232;
               case 171 -> 56;
               case 172 -> 240;
               case 173 -> 59;
               case 174 -> 141;
               case 175 -> 200;
               case 176 -> 242;
               case 177 -> 63;
               case 178 -> 62;
               case 179 -> 173;
               case 180 -> 2;
               case 181 -> 138;
               case 182 -> 225;
               case 183 -> 142;
               case 184 -> 90;
               case 185 -> 24;
               case 186 -> 143;
               case 187 -> 132;
               case 188 -> 1;
               case 189 -> 130;
               case 190 -> 253;
               case 191 -> 123;
               case 192 -> 16;
               case 193 -> 52;
               case 194 -> 241;
               case 195 -> 230;
               case 196 -> 134;
               case 197 -> 128;
               case 198 -> 11;
               case 199 -> 194;
               case 200 -> 243;
               case 201 -> 224;
               case 202 -> 119;
               case 203 -> 105;
               case 204 -> 86;
               case 205 -> 64;
               case 206 -> 133;
               case 207 -> 153;
               case 208 -> 205;
               case 209 -> 88;
               case 210 -> 237;
               case 211 -> 207;
               case 212 -> 206;
               case 213 -> 44;
               case 214 -> 231;
               case 215 -> 129;
               case 216 -> 195;
               case 217 -> 228;
               case 218 -> 117;
               case 219 -> 218;
               case 220 -> 227;
               case 221 -> 5;
               case 222 -> 244;
               case 223 -> 124;
               case 224 -> 175;
               case 225 -> 30;
               case 226 -> 211;
               case 227 -> 21;
               case 228 -> 170;
               case 229 -> 236;
               case 230 -> 74;
               case 231 -> 168;
               case 232 -> 154;
               case 233 -> 137;
               case 234 -> 248;
               case 235 -> 15;
               case 236 -> 108;
               case 237 -> 37;
               case 238 -> 84;
               case 239 -> 4;
               case 240 -> 97;
               case 241 -> 160;
               case 242 -> 9;
               case 243 -> 87;
               case 244 -> 139;
               case 245 -> 152;
               case 246 -> 223;
               case 247 -> 186;
               case 248 -> 23;
               case 249 -> 208;
               case 250 -> 102;
               case 251 -> 182;
               case 252 -> 174;
               case 253 -> 196;
               case 254 -> 28;
               default -> 234;
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

   public static enum llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] a() {
         return (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clone();
      }

      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl a(
         String var0
      ) {
         return Enum.valueOf(
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl> b() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI};
      private static final EnumEntries<llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = kotlin.enums.EnumEntriesKt.enumEntries(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);

   private static final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[] c() {
      return new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI};
   }

   }

   public static final class PXEvMid {
      @NotNull
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public PXEvMid(int var1, int var2, int var3, int var4) {
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
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid a(
         int var1, int var2, int var3, int var4
      ) {
         return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid(
            var1, var2, var3, var4
         );
      }

      @NotNull
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid i() {
         return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid a(
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var0, int var1, int var2, int var3, int var4, int var5, @Nullable Object var6
      ) {
         int var7 = k();
         if (var7 != 0) {
            if ((var5 & 1) != 0) {
               var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((var5 & 2) != 0) {
               var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if ((var5 & 4) != 0) {
               var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            if ((var5 & 8) != 0) {
               var4 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
         }

         return var0.a(var1, var2, var3, var4);
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -25302;
         int var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = -30117;
         short var10002 = -25303;
         short var10003 = -25655;
         short var10004 = -25304;
         short var10005 = 6336;
         short var10006 = -25301;
         short var10007 = -22307;
         return "Bounds(upperBoundX=" + var4 + ", lowerBoundX=" + var3 + ", upperBoundZ=" + var2 + ", lowerBoundZ=" + var1 + ")";
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
         int var2 = k();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var3 = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid)var10000;
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
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         b(0);
         String var2 = "®:\u008f:Â\u0017\u009eÿ\u0019q©®>\u0080Ík#\u0007=\u000eèñýä¥ûY\u0081ïj\u0080~i\u001c";
         int var4 = "®:\u008f:Â\u0017\u009eÿ\u0019q©®>\u0080Ík#\u0007=\u000eèñýä¥ûY\u0081ïj\u0080~i\u001c".length();
         char var1 = 19;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 54;
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
                        case 0 -> 46;
                        case 1 -> 64;
                        case 2 -> 16;
                        case 3 -> 105;
                        case 4 -> 126;
                        case 5 -> 93;
                        default -> 57;
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
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                           (kotlin.jvm.internal.DefaultConstructorMarker) null
                        );
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid(
                           Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE
                        );
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

                     var2 = "à*\u000ek\r\u001d@¶'gr4Ü¾\u000eRbA}Ù#=q\u0088\u009f\u0087+`]";
                     var4 = "à*\u000ek\r\u001d@¶'gr4Ü¾\u000eRbA}Ù#=q\u0088\u009f\u0087+`]".length();
                     var1 = 14;
                     var8 = -1;
               }

               var10000 = 24;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      public static void b(int var0) {
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
      }

      public static int j() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public static int k() {
         int var0 = j();
         return var0 == 0 ? 111 : 0;
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -25302) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 93;
               case 1 -> 138;
               case 2 -> 134;
               case 3 -> 67;
               case 4 -> 53;
               case 5 -> 218;
               case 6 -> 88;
               case 7 -> 31;
               case 8 -> 137;
               case 9 -> 87;
               case 10 -> 86;
               case 11 -> 3;
               case 12 -> 97;
               case 13 -> 109;
               case 14 -> 194;
               case 15 -> 136;
               case 16 -> 12;
               case 17 -> 164;
               case 18 -> 154;
               case 19 -> 96;
               case 20 -> 171;
               case 21 -> 14;
               case 22 -> 95;
               case 23 -> 232;
               case 24 -> 168;
               case 25 -> 251;
               case 26 -> 16;
               case 27 -> 57;
               case 28 -> 68;
               case 29 -> 214;
               case 30 -> 48;
               case 31 -> 213;
               case 32 -> 155;
               case 33 -> 241;
               case 34 -> 255;
               case 35 -> 91;
               case 36 -> 139;
               case 37 -> 55;
               case 38 -> 79;
               case 39 -> 211;
               case 40 -> 143;
               case 41 -> 72;
               case 42 -> 182;
               case 43 -> 247;
               case 44 -> 126;
               case 45 -> 209;
               case 46 -> 119;
               case 47 -> 73;
               case 48 -> 64;
               case 49 -> 4;
               case 50 -> 114;
               case 51 -> 144;
               case 52 -> 252;
               case 53 -> 71;
               case 54 -> 250;
               case 55 -> 21;
               case 56 -> 172;
               case 57 -> 98;
               case 58 -> 51;
               case 59 -> 104;
               case 60 -> 54;
               case 61 -> 197;
               case 62 -> 173;
               case 63 -> 167;
               case 64 -> 7;
               case 65 -> 10;
               case 66 -> 113;
               case 67 -> 27;
               case 68 -> 52;
               case 69 -> 90;
               case 70 -> 141;
               case 71 -> 24;
               case 72 -> 83;
               case 73 -> 249;
               case 74 -> 108;
               case 75 -> 41;
               case 76 -> 2;
               case 77 -> 210;
               case 78 -> 78;
               case 79 -> 42;
               case 80 -> 18;
               case 81 -> 110;
               case 82 -> 190;
               case 83 -> 230;
               case 84 -> 65;
               case 85 -> 170;
               case 86 -> 106;
               case 87 -> 148;
               case 88 -> 225;
               case 89 -> 212;
               case 90 -> 30;
               case 91 -> 165;
               case 92 -> 186;
               case 93 -> 45;
               case 94 -> 74;
               case 95 -> 254;
               case 96 -> 244;
               case 97 -> 192;
               case 98 -> 217;
               case 99 -> 220;
               case 100 -> 129;
               case 101 -> 201;
               case 102 -> 222;
               case 103 -> 219;
               case 104 -> 226;
               case 105 -> 84;
               case 106 -> 166;
               case 107 -> 177;
               case 108 -> 6;
               case 109 -> 33;
               case 110 -> 20;
               case 111 -> 133;
               case 112 -> 158;
               case 113 -> 246;
               case 114 -> 183;
               case 115 -> 191;
               case 116 -> 44;
               case 117 -> 85;
               case 118 -> 29;
               case 119 -> 77;
               case 120 -> 117;
               case 121 -> 203;
               case 122 -> 231;
               case 123 -> 32;
               case 124 -> 36;
               case 125 -> 184;
               case 126 -> 81;
               case 127 -> 216;
               case 128 -> 99;
               case 129 -> 92;
               case 130 -> 157;
               case 131 -> 22;
               case 132 -> 100;
               case 133 -> 147;
               case 134 -> 248;
               case 135 -> 66;
               case 136 -> 234;
               case 137 -> 162;
               case 138 -> 25;
               case 139 -> 204;
               case 140 -> 89;
               case 141 -> 233;
               case 142 -> 26;
               case 143 -> 124;
               case 144 -> 236;
               case 145 -> 111;
               case 146 -> 116;
               case 147 -> 146;
               case 148 -> 43;
               case 149 -> 125;
               case 150 -> 8;
               case 151 -> 174;
               case 152 -> 39;
               case 153 -> 122;
               case 154 -> 130;
               case 155 -> 105;
               case 156 -> 163;
               case 157 -> 245;
               case 158 -> 63;
               case 159 -> 70;
               case 160 -> 178;
               case 161 -> 13;
               case 162 -> 62;
               case 163 -> 128;
               case 164 -> 50;
               case 165 -> 215;
               case 166 -> 38;
               case 167 -> 140;
               case 168 -> 120;
               case 169 -> 142;
               case 170 -> 207;
               case 171 -> 235;
               case 172 -> 15;
               case 173 -> 205;
               case 174 -> 46;
               case 175 -> 101;
               case 176 -> 121;
               case 177 -> 69;
               case 178 -> 76;
               case 179 -> 195;
               case 180 -> 23;
               case 181 -> 193;
               case 182 -> 103;
               case 183 -> 118;
               case 184 -> 176;
               case 185 -> 180;
               case 186 -> 156;
               case 187 -> 58;
               case 188 -> 208;
               case 189 -> 253;
               case 190 -> 35;
               case 191 -> 94;
               case 192 -> 40;
               case 193 -> 229;
               case 194 -> 153;
               case 195 -> 5;
               case 196 -> 181;
               case 197 -> 240;
               case 198 -> 199;
               case 199 -> 239;
               case 200 -> 131;
               case 201 -> 75;
               case 202 -> 145;
               case 203 -> 159;
               case 204 -> 152;
               case 205 -> 112;
               case 206 -> 188;
               case 207 -> 0;
               case 208 -> 237;
               case 209 -> 115;
               case 210 -> 47;
               case 211 -> 17;
               case 212 -> 49;
               case 213 -> 200;
               case 214 -> 198;
               case 215 -> 150;
               case 216 -> 19;
               case 217 -> 132;
               case 218 -> 238;
               case 219 -> 185;
               case 220 -> 227;
               case 221 -> 187;
               case 222 -> 9;
               case 223 -> 123;
               case 224 -> 242;
               case 225 -> 196;
               case 226 -> 151;
               case 227 -> 61;
               case 228 -> 56;
               case 229 -> 228;
               case 230 -> 243;
               case 231 -> 169;
               case 232 -> 80;
               case 233 -> 107;
               case 234 -> 223;
               case 235 -> 135;
               case 236 -> 149;
               case 237 -> 189;
               case 238 -> 34;
               case 239 -> 127;
               case 240 -> 1;
               case 241 -> 60;
               case 242 -> 37;
               case 243 -> 102;
               case 244 -> 202;
               case 245 -> 11;
               case 246 -> 224;
               case 247 -> 28;
               case 248 -> 59;
               case 249 -> 161;
               case 250 -> 82;
               case 251 -> 160;
               case 252 -> 206;
               case 253 -> 221;
               case 254 -> 175;
               default -> 179;
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

      public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
        }

         public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(kotlin.jvm.internal.DefaultConstructorMarker var0) {
            this();
         }

         private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
         }

         @NotNull
         public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid a() {
            return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
      }
   }

   public static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      private final long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final byte lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @Nullable
      private Long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private static String a;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         long var1,
         byte var3,
         @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4,
         double var5
      ) {
         Intrinsics.checkNotNullParameter(var4, a);
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
            + var5;
      }

      public final long a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final byte b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void a(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      public final double f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void b(double var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      public final double g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final void c(double var1) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final Long h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final void a(@Nullable Long var1) {
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         char[] var10003 = "p% m=\u0015".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 62;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 62;
            var10006 = var0;
         } else {
            var6 = 62;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 62;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 33;
               case 1 -> 125;
               case 2 -> 120;
               case 3 -> 32;
               case 4 -> 102;
               case 5 -> 95;
               default -> 88;
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
                  a = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
      }
}
   }
}
