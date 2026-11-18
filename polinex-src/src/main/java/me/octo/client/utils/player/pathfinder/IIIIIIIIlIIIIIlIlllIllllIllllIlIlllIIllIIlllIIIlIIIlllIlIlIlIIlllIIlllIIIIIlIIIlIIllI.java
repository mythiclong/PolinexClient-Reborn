package me.octo.client.utils.player.pathfinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.level.block.state.BlockState;
import java.lang.invoke.LambdaMetafactory;
import java.util.Map;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   public static byte lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
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
   @NotNull
   private static HashMap<Byte, Double> llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private static List<IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private static HashMap<BlockPos, Byte> IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static HashMap<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private static HashSet<BlockPos> IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private static HashMap<BlockPos, Double> llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static HashMap<BlockPos, Double> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @NotNull
   private static HashMap<BlockPos, BlockPos> IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @NotNull
   private static BlockPos IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @Nullable
   private static BlockPos lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static String[] c;
   private static String[] d;

   private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI() {
   }

   private final ClientLevel g() {
      ClientLevel var10000 = this.a().level;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @Nullable
   public final ArrayList<Vec3> a(@NotNull BlockPos var1, @Nullable BlockPos var2) {
      short var10001 = -10007;
      short var10002 = -13058;
      Intrinsics.checkNotNullParameter(var1, "target");
      return this.a(var1, var2, false);
   }

   @Nullable
   public final ArrayList<Vec3> a(@NotNull BlockPos var1, boolean var2) {
      short var10001 = -10013;
      short var10002 = -31697;
      Intrinsics.checkNotNullParameter(var1, "target");
      return this.a(var1, null, var2);
   }

   @Nullable
   public final ArrayList<Vec3> a(@NotNull BlockPos param1, @Nullable BlockPos param2, boolean param3) {
      int var4 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Intrinsics.checkNotNullParameter(param1, "target");
      IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = param1;
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = param2;
      int var5 = 40;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid(
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getX() + var5,
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getX() - var5,
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getZ() + var5,
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getZ() - var5
         );
      this.h();
      if (var4 == 0) {
         return null;
      }

      BlockPos var6 = this.a(this.a().player);
      if (var6 == null) {
         return null;
      }

      Object var7o = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(var6);
      Intrinsics.checkNotNull(var7o);
      byte var7 = ((Number)var7o).byteValue();
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var6,
         var7,
         new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(0, 0, 0),
         lookupPathNodeCost(var7)
      );
      var8.b(this.c(var8.a()));
      var8.c(0.0);
      ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put(var6, var8);

      while (!((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).isEmpty()) {
         Iterable<Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> var11 = ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).entrySet();
         Iterator<Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> var12 = var11.iterator();
         if (!var12.hasNext()) {
            throw new NoSuchElementException();
         }

         Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var13 = var12.next();
         if (var12.hasNext()) {
            Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var14 = var13;
            double var15 = var14.getValue().e();

            do {
               Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var16 = var12.next();
               double var17 = var16.getValue().e();
               if (Double.compare(var15, var17) > 0) {
                  var13 = var16;
                  var15 = var17;
               }
            } while (var12.hasNext());
         }

         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = var13.getValue();
         BlockPos var10 = var9.a();
         IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.remove(var10);
         IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.add(var10);
         if (var4 == 0) {
            break;
         }

         if (Intrinsics.areEqual(var10, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI)) {
            List<Vec3> var18 = this.b(var10);
            this.h();
            return this.a(var18, param3);
         }

         this.a(var9, (n, d) -> a(var9, var10, n, d));
      }

      this.h();
      return null;
   }

   private final double a(BlockPos blockPos) {
      int mode = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Double cachedCost = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(blockPos);
      if (mode == 0 || cachedCost != null) {
         return cachedCost.doubleValue();
      }

      double openNeighborCount = 0.0;
      for (var direction : lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll) {
         BlockPos neighborPos = blockPos.offset(direction.a(), direction.b(), direction.c());
         var blockState = this.g().getBlockState(neighborPos);
         var shape = blockState.getShape((net.minecraft.world.level.BlockGetter)this.g(), neighborPos);

         if (mode != 0 && !blockState.isAir()) {
            if (shape.isEmpty()) {
               continue;
            }
            if (shape.bounds().maxY == 1.0) {
               continue;
            }
         }

         openNeighborCount += 1.0;
      }

      if (mode == 0) {
         lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(blockPos, openNeighborCount);
      }
      return openNeighborCount;
   }
   private final ArrayList<Vec3> a(List<? extends Vec3> param1, boolean param2) {
      int var3 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (param1.size() < 2) {
         return new ArrayList<Vec3>(param1);
      }

      ArrayList<Vec3> var4 = new ArrayList<Vec3>();
      if (var3 == 0 && param2) {
         var4.addAll(param1);
      } else {
         if (var3 == 0) {
            int var5 = 0;
            int var6 = param1.size() - 1;
            while (var5 < var6) {
               Vec3 var7 = var5 > 0 ? param1.get(var5 - 1) : param1.get(var5);
               Vec3 var8 = param1.get(var5);
               Vec3 var9 = param1.get(var5 + 1);
               Vec3 var10 = var5 + 2 < param1.size() ? param1.get(var5 + 2) : param1.get(var5 + 1);
               double var11 = var8.distanceTo(var9);
               int var13 = (int)(var11 / 0.1);
               for (int var14 = 0; var14 <= var13; var14++) {
                  double var15 = (double)var14 / (double)kotlin.ranges.RangesKt.coerceAtLeast(var13, 1);
                  var4.add(this.a(var7, var8, var9, var10, var15));
               }
               var5++;
            }
         }
         var4.add(kotlin.collections.CollectionsKt.last(param1));
      }

      ArrayList<Vec3> var16 = new ArrayList<Vec3>();
      var16.add(kotlin.collections.CollectionsKt.first(var4));
      BlockPos var17 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
      Vec3 var18;
      if (var3 == 0 && var17 != null) {
         var18 = var17.getCenter();
      } else {
         var18 = Vec3.ZERO;
         Intrinsics.checkNotNullExpressionValue(var18, "ZERO");
      }

      int var19 = 0;
      while (var19 < kotlin.collections.CollectionsKt.getLastIndex(var4)) {
         Vec3 var20 = (Vec3)var4.get(var19);
         Intrinsics.checkNotNullExpressionValue(var20, "get(...)");
         int var21 = var19 + 1;
         int var22 = var19 + 1;
         while (var22 < var4.size()) {
            Vec3 var23 = (Vec3)var4.get(var22);
            Intrinsics.checkNotNullExpressionValue(var23, "get(...)");
            boolean var24;
            if (param2) {
               var24 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var20, var23, (Vec3)null, 0, false, 0.0, false, false, 0.2, 252, (Object)null)
                  && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var20, var23, (Vec3)null, 0, false, 0.0, false, false, -0.299, 252, (Object)null);
            } else {
               var24 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var20, var23, (Vec3)null, 0, false, 0.0, false, false, 0.0, 508, (Object)null);
            }

            if (var22 == kotlin.collections.CollectionsKt.getLastIndex(var4)) {
               if (var24) {
                  if (var17 == null) {
                     var21 = var22;
                  } else {
                     Vec3 var25 = (Vec3)var4.get(var22);
                     Intrinsics.checkNotNullExpressionValue(var25, "get(...)");
                     var var26 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var20, var25);
                     Vec3 var27 = Vec3.ZERO;
                     Intrinsics.checkNotNullExpressionValue(var27, "ZERO");
                     var var28 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var20, var27, var26.a(), var26.b(), true);
                     for (int var30 = 0; var30 <= 100; var30++) {
                        var28 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(
                              me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                              1.0, 0.0, var28, false, 0.0, 24, (Object)null);
                        if (var28 == null) {
                           continue;
                        }

                        Vec3 var31 = var28.a().add(0.0, 1.26, 0.0);
                        Intrinsics.checkNotNullExpressionValue(var31, "add(...)");
                        var var32 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                              var17, kotlin.collections.CollectionsKt.listOf(net.minecraft.client.player.RemotePlayer.class), var31);
                        if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var31, var18) < 16.0
                              && var32.b() == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              && Intrinsics.areEqual(var32.c(), lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI)) {
                           var16.add(var28.a());
                           return var16;
                        }
                     }
                  }
               }
               break;
            }

            if (!var24) {
               break;
            }

            var21 = var22;
            var22++;
         }

         var16.add(var4.get(var21));
         var19 = var21;
      }

      return var16;
   }
   private final Vec3 a(Vec3 var1, Vec3 var2, Vec3 var3, Vec3 var4, double var5) {
      double var7 = var5 * var5;
      double var9 = var7 * var5;
      double var11 = 0.5
         * (
            2.0 * var2.x
               + (-var1.x + var3.x) * var5
               + (2.0 * var1.x - 5.0 * var2.x + 4.0 * var3.x - var4.x) * var7
               + (-var1.x + 3.0 * var2.x - 3.0 * var3.x + var4.x) * var9
         );
      double var13 = 0.5
         * (
            2.0 * var2.y
               + (-var1.y + var3.y) * var5
               + (2.0 * var1.y - 5.0 * var2.y + 4.0 * var3.y - var4.y) * var7
               + (-var1.y + 3.0 * var2.y - 3.0 * var3.y + var4.y) * var9
         );
      double var15 = 0.5
         * (
            2.0 * var2.z
               + (-var1.z + var3.z) * var5
               + (2.0 * var1.z - 5.0 * var2.z + 4.0 * var3.z - var4.z) * var7
               + (-var1.z + 3.0 * var2.z - 3.0 * var3.z + var4.z) * var9
         );
      return new Vec3(var11, var13, var15);
   }

   private final List<Vec3> b(BlockPos param1) {
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      ArrayList<Vec3> var3 = new ArrayList<>();
      BlockPos var4 = param1;
      HashSet<BlockPos> var5 = new HashSet<>();

      while (true) {
         if (var4 == null) {
            break;
         }

         if (var2 == 0) {
            return CollectionsKt.reversed((Iterable)var5);
         }

         if (!var5.add(var4)) {
            break;
         }

         Byte var6 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(var4);
         if (var6 == null) {
            break;
         }

         double var7 = ((Number)llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var6)).doubleValue();
         double var9 = (double)var4.getY() + var7;
         var3.add(new Vec3((double)var4.getX() + 0.5, var9, (double)var4.getZ() + 0.5));
         var4 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.get(var4);
      }

      return CollectionsKt.reversed((Iterable)var3);
   }

   private final void a(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      Function2<? super IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, ? super Double, Unit> var2
   ) {
      BlockPos var4 = var1.a();
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Iterator var5 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = (IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var5.next();
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.a(
            var4, var6
         );

         label25: {
            try {
               if (var3 == 0) {
                  break label25;
               }

               if (var7 == null) {
                  continue;
               }
            } catch (NoSuchElementException var8) {
               throw (RuntimeException)a(var8);
            }

            var2.invoke(var7, 1.0);
         }

         if (var3 == 0) {
            break;
         }
      }
   }

   private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      BlockPos param1,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param2
   ) {
      int guard = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      BlockPos var4 = param1.offset(param2.a(), 0, param2.c());
      Intrinsics.checkNotNullExpressionValue(var4, "offset(...)");
      int x = var4.getX();

      if (guard == 0) {
         if (x < IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a()) {
            return null;
         }

         BlockPos candidate = var4.offset(0, 1, 0);
         Intrinsics.checkNotNullExpressionValue(candidate, "offset(...)");
         IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.contains(candidate);
         return null;
      }

      if (x > IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a() || var4.getX() < IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b() || var4.getZ() > IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.c() || var4.getZ() < IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.d()) {
         return null;
      }

      for (int var5 = 1; var5 > -2; var5--) {
         BlockPos var6 = var4.offset(0, var5, 0);
         Intrinsics.checkNotNullExpressionValue(var6, "offset(...)");
         if (IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.contains(var6)) {
            return null;
         }

         byte var7 = this.f(var6);
         if (var7 != 0) {
            BlockPos above = var6.offset(0, 1, 0);
            Intrinsics.checkNotNullExpressionValue(above, "offset(...)");
            if (!this.d(above)) {
               return null;
            }

            BlockPos twoAbove = var6.offset(0, 2, 0);
            Intrinsics.checkNotNullExpressionValue(twoAbove, "offset(...)");
            if (!this.e(twoAbove)) {
               return null;
            }

            if (var5 == 1) {
               BlockPos threeAbove = param1.offset(0, 3, 0);
               Intrinsics.checkNotNullExpressionValue(threeAbove, "offset(...)");
               if (!this.e(threeAbove)) {
                  return null;
               }
            }

            return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var6,
               var7,
               new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(param2.a(), var5, param2.c()),
               lookupPathNodeCost(var7)
            );
         }
      }

      return null;
   }

   private static double lookupPathNodeCost(byte blockCode) {
      Object rawCost = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(Byte.valueOf(blockCode));
      Intrinsics.checkNotNull(rawCost);
      return ((Number)rawCost).doubleValue();
   }

   private static final Unit a(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param0,
      BlockPos param1,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2,
      double param3
   ) {
      int guard = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      Intrinsics.checkNotNullParameter(param2, "node");
      BlockPos pos = param2.a();
      if (IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.contains(pos)) {
         return Unit.INSTANCE;
      }

      double diff = param2.d() - param0.d();
      double gNew;
      if (guard == 0) {
         if (diff > 1.0) {
            return Unit.INSTANCE;
         }

         gNew = param3 + param0.g();
         if (param0.b() == 5) {
            BlockPos above = param1.above();
            Intrinsics.checkNotNullExpressionValue(above, "above(...)");
            if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f(above) == 5) {
               gNew += 2.0;
            }
         }
      } else {
         gNew = param3 + param0.g();
         double absoluteDifference = Math.abs(diff);
         if (param0.b() >= 0) {
            gNew = absoluteDifference + 40.0;
         } else {
            gNew = absoluteDifference + absoluteDifference * 2.0;
         }
      }

      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI existing = IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get(pos);
      if (guard == 0 && existing != null && existing.g() <= gNew) {
         return Unit.INSTANCE;
      }

      Double heuristic = guard == 0
         ? llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(pos)
         : null;
      double heuristicValue = heuristic != null ? heuristic : IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(pos);
      param2.b(heuristicValue);
      param2.c(gNew);
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.put(pos, param1);
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.put(pos, param2);
      return Unit.INSTANCE;
   }
   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -10001) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 232;
            case 1 -> 183;
            case 2 -> 196;
            case 3 -> 111;
            case 4 -> 184;
            case 5 -> 68;
            case 6 -> 55;
            case 7 -> 223;
            case 8 -> 97;
            case 9 -> 47;
            case 10 -> 191;
            case 11 -> 142;
            case 12 -> 168;
            case 13 -> 147;
            case 14 -> 21;
            case 15 -> 62;
            case 16 -> 216;
            case 17 -> 207;
            case 18 -> 3;
            case 19 -> 164;
            case 20 -> 149;
            case 21 -> 255;
            case 22 -> 59;
            case 23 -> 76;
            case 24 -> 75;
            case 25 -> 101;
            case 26 -> 253;
            case 27 -> 229;
            case 28 -> 1;
            case 29 -> 144;
            case 30 -> 112;
            case 31 -> 219;
            case 32 -> 82;
            case 33 -> 85;
            case 34 -> 188;
            case 35 -> 91;
            case 36 -> 148;
            case 37 -> 49;
            case 38 -> 238;
            case 39 -> 155;
            case 40 -> 134;
            case 41 -> 89;
            case 42 -> 145;
            case 43 -> 39;
            case 44 -> 17;
            case 45 -> 57;
            case 46 -> 215;
            case 47 -> 132;
            case 48 -> 38;
            case 49 -> 86;
            case 50 -> 209;
            case 51 -> 36;
            case 52 -> 65;
            case 53 -> 217;
            case 54 -> 167;
            case 55 -> 94;
            case 56 -> 6;
            case 57 -> 37;
            case 58 -> 228;
            case 59 -> 161;
            case 60 -> 203;
            case 61 -> 193;
            case 62 -> 189;
            case 63 -> 105;
            case 64 -> 246;
            case 65 -> 16;
            case 66 -> 143;
            case 67 -> 42;
            case 68 -> 245;
            case 69 -> 139;
            case 70 -> 13;
            case 71 -> 187;
            case 72 -> 185;
            case 73 -> 186;
            case 74 -> 165;
            case 75 -> 33;
            case 76 -> 92;
            case 77 -> 154;
            case 78 -> 116;
            case 79 -> 200;
            case 80 -> 51;
            case 81 -> 159;
            case 82 -> 9;
            case 83 -> 0;
            case 84 -> 174;
            case 85 -> 214;
            case 86 -> 23;
            case 87 -> 80;
            case 88 -> 242;
            case 89 -> 131;
            case 90 -> 170;
            case 91 -> 230;
            case 92 -> 201;
            case 93 -> 195;
            case 94 -> 79;
            case 95 -> 7;
            case 96 -> 103;
            case 97 -> 208;
            case 98 -> 121;
            case 99 -> 34;
            case 100 -> 156;
            case 101 -> 237;
            case 102 -> 179;
            case 103 -> 218;
            case 104 -> 127;
            case 105 -> 30;
            case 106 -> 136;
            case 107 -> 90;
            case 108 -> 114;
            case 109 -> 192;
            case 110 -> 83;
            case 111 -> 26;
            case 112 -> 25;
            case 113 -> 77;
            case 114 -> 226;
            case 115 -> 28;
            case 116 -> 140;
            case 117 -> 113;
            case 118 -> 4;
            case 119 -> 173;
            case 120 -> 72;
            case 121 -> 40;
            case 122 -> 14;
            case 123 -> 99;
            case 124 -> 125;
            case 125 -> 117;
            case 126 -> 240;
            case 127 -> 175;
            case 128 -> 202;
            case 129 -> 120;
            case 130 -> 109;
            case 131 -> 50;
            case 132 -> 254;
            case 133 -> 58;
            case 134 -> 130;
            case 135 -> 224;
            case 136 -> 19;
            case 137 -> 60;
            case 138 -> 235;
            case 139 -> 84;
            case 140 -> 52;
            case 141 -> 22;
            case 142 -> 20;
            case 143 -> 126;
            case 144 -> 133;
            case 145 -> 241;
            case 146 -> 67;
            case 147 -> 135;
            case 148 -> 118;
            case 149 -> 87;
            case 150 -> 178;
            case 151 -> 12;
            case 152 -> 197;
            case 153 -> 8;
            case 154 -> 74;
            case 155 -> 108;
            case 156 -> 71;
            case 157 -> 41;
            case 158 -> 110;
            case 159 -> 233;
            case 160 -> 252;
            case 161 -> 95;
            case 162 -> 194;
            case 163 -> 212;
            case 164 -> 152;
            case 165 -> 169;
            case 166 -> 115;
            case 167 -> 213;
            case 168 -> 107;
            case 169 -> 177;
            case 170 -> 157;
            case 171 -> 96;
            case 172 -> 137;
            case 173 -> 32;
            case 174 -> 10;
            case 175 -> 100;
            case 176 -> 163;
            case 177 -> 239;
            case 178 -> 81;
            case 179 -> 198;
            case 180 -> 160;
            case 181 -> 24;
            case 182 -> 93;
            case 183 -> 250;
            case 184 -> 153;
            case 185 -> 48;
            case 186 -> 15;
            case 187 -> 102;
            case 188 -> 182;
            case 189 -> 181;
            case 190 -> 44;
            case 191 -> 64;
            case 192 -> 11;
            case 193 -> 104;
            case 194 -> 5;
            case 195 -> 141;
            case 196 -> 172;
            case 197 -> 63;
            case 198 -> 27;
            case 199 -> 220;
            case 200 -> 210;
            case 201 -> 88;
            case 202 -> 176;
            case 203 -> 43;
            case 204 -> 70;
            case 205 -> 78;
            case 206 -> 29;
            case 207 -> 248;
            case 208 -> 180;
            case 209 -> 251;
            case 210 -> 236;
            case 211 -> 98;
            case 212 -> 54;
            case 213 -> 225;
            case 214 -> 243;
            case 215 -> 138;
            case 216 -> 199;
            case 217 -> 227;
            case 218 -> 146;
            case 219 -> 66;
            case 220 -> 244;
            case 221 -> 151;
            case 222 -> 206;
            case 223 -> 18;
            case 224 -> 231;
            case 225 -> 122;
            case 226 -> 69;
            case 227 -> 128;
            case 228 -> 190;
            case 229 -> 234;
            case 230 -> 204;
            case 231 -> 46;
            case 232 -> 171;
            case 233 -> 166;
            case 234 -> 106;
            case 235 -> 119;
            case 236 -> 222;
            case 237 -> 45;
            case 238 -> 31;
            case 239 -> 150;
            case 240 -> 61;
            case 241 -> 129;
            case 242 -> 35;
            case 243 -> 73;
            case 244 -> 56;
            case 245 -> 249;
            case 246 -> 205;
            case 247 -> 211;
            case 248 -> 2;
            case 249 -> 123;
            case 250 -> 158;
            case 251 -> 53;
            case 252 -> 221;
            case 253 -> 124;
            case 254 -> 162;
            default -> 247;
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
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int var1, int var2, int var3) {
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
      public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, int var2, int var3
      ) {
         return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -8502;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -10736;
         short var10002 = -8503;
         short var10003 = -9081;
         short var10004 = -8501;
         short var10005 = -19055;
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
               var10000 instanceof IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var2 == 0) {
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
         String var2 = "~M:´\tB¾®\n¸ð-\u000eÕ\u0004Eå^¡";
         int var4 = "~M:´\tB¾®\n¸ð-\u000eÕ\u0004Eå^¡".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 23;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 23;
                  var10006 = var6;
               } else {
                  var13 = 23;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 23;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 15;
                     case 1 -> 20;
                     case 2 -> 50;
                     case 3 -> 115;
                     case 4 -> 17;
                     case 5 -> 67;
                     default -> 12;
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
         int var2 = (var0 ^ -8501) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 240;
               case 1 -> 232;
               case 2 -> 104;
               case 3 -> 43;
               case 4 -> 11;
               case 5 -> 86;
               case 6 -> 50;
               case 7 -> 70;
               case 8 -> 51;
               case 9 -> 145;
               case 10 -> 139;
               case 11 -> 59;
               case 12 -> 80;
               case 13 -> 122;
               case 14 -> 157;
               case 15 -> 121;
               case 16 -> 91;
               case 17 -> 94;
               case 18 -> 214;
               case 19 -> 255;
               case 20 -> 203;
               case 21 -> 33;
               case 22 -> 85;
               case 23 -> 130;
               case 24 -> 106;
               case 25 -> 133;
               case 26 -> 114;
               case 27 -> 142;
               case 28 -> 146;
               case 29 -> 108;
               case 30 -> 115;
               case 31 -> 103;
               case 32 -> 213;
               case 33 -> 162;
               case 34 -> 227;
               case 35 -> 93;
               case 36 -> 220;
               case 37 -> 129;
               case 38 -> 216;
               case 39 -> 84;
               case 40 -> 141;
               case 41 -> 23;
               case 42 -> 137;
               case 43 -> 74;
               case 44 -> 169;
               case 45 -> 109;
               case 46 -> 112;
               case 47 -> 15;
               case 48 -> 61;
               case 49 -> 90;
               case 50 -> 163;
               case 51 -> 233;
               case 52 -> 175;
               case 53 -> 76;
               case 54 -> 192;
               case 55 -> 230;
               case 56 -> 38;
               case 57 -> 110;
               case 58 -> 185;
               case 59 -> 81;
               case 60 -> 5;
               case 61 -> 224;
               case 62 -> 168;
               case 63 -> 44;
               case 64 -> 19;
               case 65 -> 134;
               case 66 -> 72;
               case 67 -> 204;
               case 68 -> 102;
               case 69 -> 124;
               case 70 -> 42;
               case 71 -> 170;
               case 72 -> 36;
               case 73 -> 116;
               case 74 -> 147;
               case 75 -> 97;
               case 76 -> 17;
               case 77 -> 173;
               case 78 -> 156;
               case 79 -> 27;
               case 80 -> 183;
               case 81 -> 228;
               case 82 -> 155;
               case 83 -> 41;
               case 84 -> 180;
               case 85 -> 218;
               case 86 -> 9;
               case 87 -> 2;
               case 88 -> 226;
               case 89 -> 13;
               case 90 -> 251;
               case 91 -> 191;
               case 92 -> 248;
               case 93 -> 22;
               case 94 -> 150;
               case 95 -> 53;
               case 96 -> 140;
               case 97 -> 37;
               case 98 -> 212;
               case 99 -> 32;
               case 100 -> 46;
               case 101 -> 238;
               case 102 -> 71;
               case 103 -> 6;
               case 104 -> 31;
               case 105 -> 135;
               case 106 -> 111;
               case 107 -> 18;
               case 108 -> 132;
               case 109 -> 195;
               case 110 -> 149;
               case 111 -> 125;
               case 112 -> 48;
               case 113 -> 161;
               case 114 -> 128;
               case 115 -> 219;
               case 116 -> 243;
               case 117 -> 138;
               case 118 -> 209;
               case 119 -> 98;
               case 120 -> 177;
               case 121 -> 235;
               case 122 -> 3;
               case 123 -> 215;
               case 124 -> 1;
               case 125 -> 199;
               case 126 -> 10;
               case 127 -> 49;
               case 128 -> 164;
               case 129 -> 184;
               case 130 -> 14;
               case 131 -> 40;
               case 132 -> 117;
               case 133 -> 231;
               case 134 -> 25;
               case 135 -> 249;
               case 136 -> 73;
               case 137 -> 12;
               case 138 -> 174;
               case 139 -> 39;
               case 140 -> 62;
               case 141 -> 225;
               case 142 -> 223;
               case 143 -> 208;
               case 144 -> 246;
               case 145 -> 189;
               case 146 -> 58;
               case 147 -> 158;
               case 148 -> 52;
               case 149 -> 55;
               case 150 -> 166;
               case 151 -> 78;
               case 152 -> 196;
               case 153 -> 60;
               case 154 -> 118;
               case 155 -> 247;
               case 156 -> 35;
               case 157 -> 206;
               case 158 -> 69;
               case 159 -> 34;
               case 160 -> 221;
               case 161 -> 21;
               case 162 -> 200;
               case 163 -> 210;
               case 164 -> 190;
               case 165 -> 105;
               case 166 -> 250;
               case 167 -> 202;
               case 168 -> 193;
               case 169 -> 222;
               case 170 -> 242;
               case 171 -> 75;
               case 172 -> 187;
               case 173 -> 237;
               case 174 -> 245;
               case 175 -> 131;
               case 176 -> 7;
               case 177 -> 154;
               case 178 -> 159;
               case 179 -> 186;
               case 180 -> 160;
               case 181 -> 87;
               case 182 -> 198;
               case 183 -> 229;
               case 184 -> 54;
               case 185 -> 89;
               case 186 -> 127;
               case 187 -> 4;
               case 188 -> 205;
               case 189 -> 8;
               case 190 -> 67;
               case 191 -> 28;
               case 192 -> 45;
               case 193 -> 136;
               case 194 -> 92;
               case 195 -> 20;
               case 196 -> 239;
               case 197 -> 167;
               case 198 -> 119;
               case 199 -> 83;
               case 200 -> 181;
               case 201 -> 252;
               case 202 -> 211;
               case 203 -> 64;
               case 204 -> 77;
               case 205 -> 100;
               case 206 -> 95;
               case 207 -> 171;
               case 208 -> 26;
               case 209 -> 63;
               case 210 -> 0;
               case 211 -> 88;
               case 212 -> 126;
               case 213 -> 241;
               case 214 -> 172;
               case 215 -> 65;
               case 216 -> 30;
               case 217 -> 207;
               case 218 -> 152;
               case 219 -> 194;
               case 220 -> 188;
               case 221 -> 113;
               case 222 -> 234;
               case 223 -> 68;
               case 224 -> 29;
               case 225 -> 253;
               case 226 -> 57;
               case 227 -> 151;
               case 228 -> 79;
               case 229 -> 123;
               case 230 -> 16;
               case 231 -> 107;
               case 232 -> 254;
               case 233 -> 144;
               case 234 -> 120;
               case 235 -> 201;
               case 236 -> 236;
               case 237 -> 217;
               case 238 -> 176;
               case 239 -> 66;
               case 240 -> 179;
               case 241 -> 153;
               case 242 -> 182;
               case 243 -> 165;
               case 244 -> 47;
               case 245 -> 244;
               case 246 -> 143;
               case 247 -> 99;
               case 248 -> 24;
               case 249 -> 101;
               case 250 -> 96;
               case 251 -> 148;
               case 252 -> 82;
               case 253 -> 178;
               case 254 -> 197;
               default -> 56;
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
      public static final me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, int var1, int var2, int var3, int var4, java.lang.Object var5) {
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
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final byte lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull BlockPos var1,
         byte var2,
         @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
         double var4
      ) {
         short var10001 = -12711;
         short var10002 = -21647;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -12712;
         var10002 = 20701;
         Intrinsics.checkNotNullParameter(var3, "offset");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .getY()
            + var4;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final byte b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll c() {
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

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "*·D@\u0088\u009d\u0003\u0097A\u001a";
         int var4 = "*·D@\u0088\u009d\u0003\u0097A\u001a".length();
         char var1 = 6;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 99;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 99;
                  var10006 = var6;
               } else {
                  var13 = 99;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 99;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 126;
                     case 1 -> 121;
                     case 2 -> 37;
                     case 3 -> 79;
                     case 4 -> 100;
                     case 5 -> 26;
                     default -> 110;
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
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -12712) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 201;
               case 1 -> 185;
               case 2 -> 1;
               case 3 -> 0;
               case 4 -> 191;
               case 5 -> 72;
               case 6 -> 135;
               case 7 -> 143;
               case 8 -> 51;
               case 9 -> 173;
               case 10 -> 56;
               case 11 -> 59;
               case 12 -> 109;
               case 13 -> 86;
               case 14 -> 111;
               case 15 -> 157;
               case 16 -> 252;
               case 17 -> 54;
               case 18 -> 255;
               case 19 -> 250;
               case 20 -> 139;
               case 21 -> 42;
               case 22 -> 241;
               case 23 -> 225;
               case 24 -> 145;
               case 25 -> 147;
               case 26 -> 73;
               case 27 -> 36;
               case 28 -> 146;
               case 29 -> 167;
               case 30 -> 239;
               case 31 -> 88;
               case 32 -> 227;
               case 33 -> 40;
               case 34 -> 177;
               case 35 -> 19;
               case 36 -> 55;
               case 37 -> 35;
               case 38 -> 134;
               case 39 -> 69;
               case 40 -> 205;
               case 41 -> 27;
               case 42 -> 113;
               case 43 -> 66;
               case 44 -> 52;
               case 45 -> 126;
               case 46 -> 10;
               case 47 -> 165;
               case 48 -> 208;
               case 49 -> 144;
               case 50 -> 39;
               case 51 -> 240;
               case 52 -> 7;
               case 53 -> 84;
               case 54 -> 108;
               case 55 -> 133;
               case 56 -> 94;
               case 57 -> 198;
               case 58 -> 97;
               case 59 -> 85;
               case 60 -> 70;
               case 61 -> 181;
               case 62 -> 91;
               case 63 -> 17;
               case 64 -> 9;
               case 65 -> 89;
               case 66 -> 193;
               case 67 -> 215;
               case 68 -> 218;
               case 69 -> 232;
               case 70 -> 247;
               case 71 -> 213;
               case 72 -> 216;
               case 73 -> 81;
               case 74 -> 44;
               case 75 -> 159;
               case 76 -> 31;
               case 77 -> 26;
               case 78 -> 102;
               case 79 -> 182;
               case 80 -> 2;
               case 81 -> 47;
               case 82 -> 230;
               case 83 -> 174;
               case 84 -> 169;
               case 85 -> 90;
               case 86 -> 140;
               case 87 -> 192;
               case 88 -> 61;
               case 89 -> 123;
               case 90 -> 172;
               case 91 -> 106;
               case 92 -> 23;
               case 93 -> 64;
               case 94 -> 163;
               case 95 -> 13;
               case 96 -> 158;
               case 97 -> 203;
               case 98 -> 3;
               case 99 -> 22;
               case 100 -> 156;
               case 101 -> 6;
               case 102 -> 15;
               case 103 -> 237;
               case 104 -> 62;
               case 105 -> 249;
               case 106 -> 114;
               case 107 -> 50;
               case 108 -> 71;
               case 109 -> 5;
               case 110 -> 238;
               case 111 -> 162;
               case 112 -> 32;
               case 113 -> 189;
               case 114 -> 168;
               case 115 -> 235;
               case 116 -> 115;
               case 117 -> 170;
               case 118 -> 226;
               case 119 -> 30;
               case 120 -> 219;
               case 121 -> 41;
               case 122 -> 118;
               case 123 -> 16;
               case 124 -> 160;
               case 125 -> 180;
               case 126 -> 166;
               case 127 -> 129;
               case 128 -> 124;
               case 129 -> 29;
               case 130 -> 20;
               case 131 -> 155;
               case 132 -> 24;
               case 133 -> 76;
               case 134 -> 18;
               case 135 -> 221;
               case 136 -> 202;
               case 137 -> 117;
               case 138 -> 119;
               case 139 -> 96;
               case 140 -> 150;
               case 141 -> 63;
               case 142 -> 245;
               case 143 -> 224;
               case 144 -> 11;
               case 145 -> 125;
               case 146 -> 65;
               case 147 -> 152;
               case 148 -> 228;
               case 149 -> 103;
               case 150 -> 236;
               case 151 -> 151;
               case 152 -> 142;
               case 153 -> 95;
               case 154 -> 234;
               case 155 -> 68;
               case 156 -> 43;
               case 157 -> 38;
               case 158 -> 207;
               case 159 -> 229;
               case 160 -> 161;
               case 161 -> 57;
               case 162 -> 149;
               case 163 -> 206;
               case 164 -> 188;
               case 165 -> 244;
               case 166 -> 4;
               case 167 -> 25;
               case 168 -> 28;
               case 169 -> 60;
               case 170 -> 254;
               case 171 -> 233;
               case 172 -> 243;
               case 173 -> 248;
               case 174 -> 176;
               case 175 -> 78;
               case 176 -> 154;
               case 177 -> 217;
               case 178 -> 53;
               case 179 -> 87;
               case 180 -> 184;
               case 181 -> 199;
               case 182 -> 116;
               case 183 -> 82;
               case 184 -> 121;
               case 185 -> 83;
               case 186 -> 175;
               case 187 -> 138;
               case 188 -> 98;
               case 189 -> 223;
               case 190 -> 34;
               case 191 -> 67;
               case 192 -> 211;
               case 193 -> 75;
               case 194 -> 122;
               case 195 -> 187;
               case 196 -> 210;
               case 197 -> 186;
               case 198 -> 214;
               case 199 -> 100;
               case 200 -> 164;
               case 201 -> 242;
               case 202 -> 137;
               case 203 -> 128;
               case 204 -> 120;
               case 205 -> 21;
               case 206 -> 49;
               case 207 -> 194;
               case 208 -> 80;
               case 209 -> 209;
               case 210 -> 171;
               case 211 -> 77;
               case 212 -> 197;
               case 213 -> 148;
               case 214 -> 130;
               case 215 -> 93;
               case 216 -> 178;
               case 217 -> 101;
               case 218 -> 58;
               case 219 -> 79;
               case 220 -> 212;
               case 221 -> 204;
               case 222 -> 190;
               case 223 -> 104;
               case 224 -> 196;
               case 225 -> 131;
               case 226 -> 92;
               case 227 -> 141;
               case 228 -> 253;
               case 229 -> 183;
               case 230 -> 200;
               case 231 -> 179;
               case 232 -> 46;
               case 233 -> 231;
               case 234 -> 107;
               case 235 -> 153;
               case 236 -> 220;
               case 237 -> 195;
               case 238 -> 12;
               case 239 -> 14;
               case 240 -> 8;
               case 241 -> 132;
               case 242 -> 112;
               case 243 -> 74;
               case 244 -> 33;
               case 245 -> 246;
               case 246 -> 105;
               case 247 -> 136;
               case 248 -> 127;
               case 249 -> 99;
               case 250 -> 222;
               case 251 -> 48;
               case 252 -> 45;
               case 253 -> 37;
               case 254 -> 251;
               default -> 110;
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

   public static final class PXEvMid {
      @NotNull
      public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
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
      public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid a(
         int var1, int var2, int var3, int var4
      ) {
         return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 11696;
         int var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = -23489;
         short var10002 = 11698;
         short var10003 = 3014;
         short var10004 = 11697;
         short var10005 = -31950;
         short var10006 = 11699;
         short var10007 = 17647;
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
               var10000 instanceof IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid var3 = (IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid)var10000;
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
         String var2 = "Äé\u0085óÇöh'µZÀ(rL\u0013\u0017Í\\ÏèºAM\u009eÃR¨RÚG\\\u0096êÛ";
         int var4 = "Äé\u0085óÇöh'µZÀ(rL\u0013\u0017Í\\ÏèºAM\u009eÃR¨RÚG\\\u0096êÛ".length();
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 51;
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
                        case 0 -> 79;
                        case 1 -> 31;
                        case 2 -> 125;
                        case 3 -> 44;
                        case 4 -> 38;
                        case 5 -> 67;
                        default -> 13;
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
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI((kotlin.jvm.internal.DefaultConstructorMarker) null);
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid(
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

                     var2 = "µ4Ñ4\u0013\u0091v¨\u0015È·\u0019ÿ\t\u000e8¿`E%¿°mÍp¬\u000e\u009eë";
                     var4 = "µ4Ñ4\u0013\u0091v¨\u0015È·\u0019ÿ\t\u000e8¿`E%¿°mÍp¬\u000e\u009eë".length();
                     var1 = 14;
                     var8 = -1;
               }

               var10000 = 48;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 11697) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 245;
               case 1 -> 71;
               case 2 -> 3;
               case 3 -> 252;
               case 4 -> 8;
               case 5 -> 5;
               case 6 -> 185;
               case 7 -> 109;
               case 8 -> 184;
               case 9 -> 202;
               case 10 -> 237;
               case 11 -> 200;
               case 12 -> 104;
               case 13 -> 137;
               case 14 -> 143;
               case 15 -> 0;
               case 16 -> 89;
               case 17 -> 187;
               case 18 -> 164;
               case 19 -> 26;
               case 20 -> 18;
               case 21 -> 118;
               case 22 -> 90;
               case 23 -> 170;
               case 24 -> 234;
               case 25 -> 97;
               case 26 -> 173;
               case 27 -> 128;
               case 28 -> 232;
               case 29 -> 46;
               case 30 -> 52;
               case 31 -> 254;
               case 32 -> 178;
               case 33 -> 190;
               case 34 -> 208;
               case 35 -> 253;
               case 36 -> 134;
               case 37 -> 219;
               case 38 -> 250;
               case 39 -> 103;
               case 40 -> 10;
               case 41 -> 238;
               case 42 -> 157;
               case 43 -> 144;
               case 44 -> 140;
               case 45 -> 147;
               case 46 -> 126;
               case 47 -> 151;
               case 48 -> 11;
               case 49 -> 56;
               case 50 -> 233;
               case 51 -> 228;
               case 52 -> 20;
               case 53 -> 95;
               case 54 -> 100;
               case 55 -> 80;
               case 56 -> 85;
               case 57 -> 204;
               case 58 -> 35;
               case 59 -> 141;
               case 60 -> 42;
               case 61 -> 127;
               case 62 -> 30;
               case 63 -> 244;
               case 64 -> 16;
               case 65 -> 165;
               case 66 -> 58;
               case 67 -> 31;
               case 68 -> 114;
               case 69 -> 156;
               case 70 -> 41;
               case 71 -> 91;
               case 72 -> 153;
               case 73 -> 6;
               case 74 -> 236;
               case 75 -> 7;
               case 76 -> 36;
               case 77 -> 34;
               case 78 -> 33;
               case 79 -> 210;
               case 80 -> 240;
               case 81 -> 44;
               case 82 -> 21;
               case 83 -> 55;
               case 84 -> 1;
               case 85 -> 4;
               case 86 -> 111;
               case 87 -> 32;
               case 88 -> 243;
               case 89 -> 177;
               case 90 -> 180;
               case 91 -> 28;
               case 92 -> 99;
               case 93 -> 76;
               case 94 -> 136;
               case 95 -> 160;
               case 96 -> 130;
               case 97 -> 131;
               case 98 -> 239;
               case 99 -> 193;
               case 100 -> 225;
               case 101 -> 75;
               case 102 -> 203;
               case 103 -> 148;
               case 104 -> 101;
               case 105 -> 38;
               case 106 -> 115;
               case 107 -> 22;
               case 108 -> 207;
               case 109 -> 121;
               case 110 -> 84;
               case 111 -> 223;
               case 112 -> 82;
               case 113 -> 197;
               case 114 -> 227;
               case 115 -> 25;
               case 116 -> 59;
               case 117 -> 48;
               case 118 -> 13;
               case 119 -> 224;
               case 120 -> 181;
               case 121 -> 37;
               case 122 -> 77;
               case 123 -> 27;
               case 124 -> 246;
               case 125 -> 199;
               case 126 -> 133;
               case 127 -> 211;
               case 128 -> 15;
               case 129 -> 98;
               case 130 -> 230;
               case 131 -> 206;
               case 132 -> 68;
               case 133 -> 66;
               case 134 -> 171;
               case 135 -> 107;
               case 136 -> 150;
               case 137 -> 142;
               case 138 -> 192;
               case 139 -> 73;
               case 140 -> 161;
               case 141 -> 63;
               case 142 -> 122;
               case 143 -> 43;
               case 144 -> 112;
               case 145 -> 251;
               case 146 -> 226;
               case 147 -> 132;
               case 148 -> 45;
               case 149 -> 242;
               case 150 -> 169;
               case 151 -> 196;
               case 152 -> 93;
               case 153 -> 221;
               case 154 -> 78;
               case 155 -> 235;
               case 156 -> 2;
               case 157 -> 86;
               case 158 -> 195;
               case 159 -> 92;
               case 160 -> 116;
               case 161 -> 67;
               case 162 -> 57;
               case 163 -> 218;
               case 164 -> 212;
               case 165 -> 105;
               case 166 -> 53;
               case 167 -> 155;
               case 168 -> 54;
               case 169 -> 152;
               case 170 -> 186;
               case 171 -> 231;
               case 172 -> 172;
               case 173 -> 248;
               case 174 -> 124;
               case 175 -> 79;
               case 176 -> 182;
               case 177 -> 83;
               case 178 -> 163;
               case 179 -> 216;
               case 180 -> 94;
               case 181 -> 129;
               case 182 -> 135;
               case 183 -> 222;
               case 184 -> 158;
               case 185 -> 255;
               case 186 -> 123;
               case 187 -> 12;
               case 188 -> 214;
               case 189 -> 117;
               case 190 -> 191;
               case 191 -> 29;
               case 192 -> 229;
               case 193 -> 49;
               case 194 -> 14;
               case 195 -> 119;
               case 196 -> 47;
               case 197 -> 23;
               case 198 -> 113;
               case 199 -> 138;
               case 200 -> 167;
               case 201 -> 39;
               case 202 -> 9;
               case 203 -> 106;
               case 204 -> 50;
               case 205 -> 145;
               case 206 -> 205;
               case 207 -> 70;
               case 208 -> 179;
               case 209 -> 241;
               case 210 -> 168;
               case 211 -> 159;
               case 212 -> 175;
               case 213 -> 51;
               case 214 -> 188;
               case 215 -> 198;
               case 216 -> 139;
               case 217 -> 154;
               case 218 -> 102;
               case 219 -> 176;
               case 220 -> 74;
               case 221 -> 64;
               case 222 -> 88;
               case 223 -> 69;
               case 224 -> 146;
               case 225 -> 81;
               case 226 -> 209;
               case 227 -> 166;
               case 228 -> 62;
               case 229 -> 40;
               case 230 -> 213;
               case 231 -> 72;
               case 232 -> 96;
               case 233 -> 87;
               case 234 -> 247;
               case 235 -> 65;
               case 236 -> 61;
               case 237 -> 215;
               case 238 -> 217;
               case 239 -> 108;
               case 240 -> 194;
               case 241 -> 220;
               case 242 -> 183;
               case 243 -> 249;
               case 244 -> 17;
               case 245 -> 162;
               case 246 -> 125;
               case 247 -> 201;
               case 248 -> 120;
               case 249 -> 19;
               case 250 -> 149;
               case 251 -> 174;
               case 252 -> 24;
               case 253 -> 189;
               case 254 -> 60;
               default -> 110;
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

      public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

         private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
         }

         @NotNull
         public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid a() {
            return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
      }
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid a(me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid var0, int var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
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

      // PX-FIX-ok: synthetic accessor (jar: getstatic/areturn)
      public static final me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid i() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }
}

   // ===== PX-RESTORED T3c: methods present in the jar, absent from this file =====
   // PX-RESTORED Kotlin $default bridge (javap -c: masks bit 1 -> default the nullable second BlockPos).
   public static ArrayList a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var0, BlockPos var1, BlockPos var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      return var0.a(var1, var2);
   }

   // PX-RESTORED a(Entity)BlockPos (javap -c; decompilers failed): scans y=-1..1, x=-1..1, z=-6..(<6 if
   // the entity is in liquid, else 1) around the entity for a standable column and returns the nearest
   // candidate to the entity position (null when none).
   public final BlockPos a(Entity param1) {
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (param1 == null) {
         return null;
      } else {
         ArrayList<BlockPos> var3 = new ArrayList<>();
         BlockPos var4 = new BlockPos((int)Math.floor(param1.getX()), (int)Math.floor(param1.getY()), (int)Math.floor(param1.getZ()));
         int var5 = param1.isInLiquid() ? 6 : 1;

         for (int var6 = -1; var6 < 2; var6++) {
            for (int var7 = -1; var7 < 2; var7++) {
               for (int var8 = -6; var8 <= var5; var8++) {
                  BlockPos var9 = var4.offset(var6, var8, var7);
                  if (this.f(var9) != 0 && this.d(var9.offset(0, 1, 0)) && this.e(var9.offset(0, 2, 0))) {
                     var3.add(var9);
                  }
               }
            }
         }

         Iterator<BlockPos> var8x = var3.iterator();
         if (!var8x.hasNext()) {
            return null;
         } else {
            BlockPos var9x = var8x.next();
            if (var8x.hasNext()) {
               double var10 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(param1).distanceToSqr(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var9x));
               do {
                  BlockPos var12 = var8x.next();
                  double var13 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(param1).distanceToSqr(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var12));
                  if (var10 > var13) {
                     var9x = var12;
                     var10 = var13;
                  }
               } while (var8x.hasNext());
            }

            return var9x;
         }
      }
   }

   private final double c(BlockPos var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Double var3 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(var1);
      int var2 = var10000;

      label30: {
         try {
            if (var2 == 0) {
               return var3;
            }

            if (var3 == null) {
               break label30;
            }
         } catch (NoSuchElementException var10) {
            throw a(var10);
         }

         return var3;
      }

      int var4 = Math.abs(var1.getX() - IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getX());
      int var5 = Math.abs(var1.getZ() - IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getZ());
      int var6 = Math.min(var4, var5);
      int var7 = Math.max(var4, var5);
      double var8 = 1.4 * var6 + (var7 - var6);
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.put(var1, var8);
      return var8;
   }

    // PX-RESTORED d(BlockPos)Z: k()==0 converts the block code to boolean by testing nonzero;
    // k()!=0 accepts only block codes 0 and 4.
   private final boolean d(BlockPos param1) {
       int mode = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
       byte blockCode = this.f(param1);
       if (mode == 0) {
          return blockCode != 0;
       }

       return blockCode == 0 || blockCode == 4;
   }

   // PX-RESTORED e(BlockPos)Z (Vineflower body; the decompiler's `(boolean)` pseudo-casts on the
   // watermark-selected arms are not legal Java, so each arm is written as the equivalent boolean
   // expression it compiles to: ireturn of the raw byte for the (var2 != 0) arm, a constant otherwise.
   // Live arm at runtime = watermark.j() == 0 (the default), i.e. "block code 0".
   private final boolean e(BlockPos param1) {
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();

      try {
         byte var3 = this.f(param1);
         if (var2 != 0) {
            return var3 != 0;
         }

         if (var3 == 0) {
            return true;
         }
      } catch (NoSuchElementException var4) {
         throw a(var4);
      }

      return false;
   }

   // PX-RESTORED f(BlockPos)B (javap -c; Vineflower/CFR both failed on this method): traversal-cost
   // code of the block, cached in IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll. Live branch = watermark.j() == 0 (the default).
   private final byte f(BlockPos param1) {
      int mode = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      net.minecraft.client.multiplayer.ClientLevel level = this.g();
      if (mode != 0) {
         return ((Byte)(Object)level).byteValue();
      }

      if (!level.isLoaded(param1)) {
         return 0;
      } else {
         Byte var3 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(param1);
         if (var3 != null) {
            return var3;
         } else {
            BlockState var4 = this.g().getBlockState(param1);
            net.minecraft.world.level.block.Block var5 = var4.getBlock();
            byte var6;
            if (var4.isAir() || var4.getCollisionShape(this.g(), param1).isEmpty()) {
               var6 = 0;
            } else if (var5 instanceof net.minecraft.world.level.block.SlabBlock && var4.getValue(net.minecraft.world.level.block.SlabBlock.TYPE) == net.minecraft.world.level.block.state.properties.SlabType.BOTTOM) {
               var6 = 2;
            } else if (var5 instanceof net.minecraft.world.level.block.StairBlock && var4.getValue(net.minecraft.world.level.block.StairBlock.HALF) == net.minecraft.world.level.block.state.properties.Half.BOTTOM) {
               var6 = 3;
            } else if (var5 instanceof net.minecraft.world.level.block.StairBlock) {
               var6 = 1;
            } else if (var5 instanceof net.minecraft.world.level.block.CarpetBlock) {
               var6 = 4;
            } else if (var5 instanceof net.minecraft.world.level.block.FenceBlock || var5 instanceof net.minecraft.world.level.block.FenceGateBlock || var5 instanceof net.minecraft.world.level.block.WallBlock) {
               var6 = 6;
            } else if (!var4.getFluidState().isEmpty()) {
               var6 = 5;
            } else if (var5 instanceof net.minecraft.world.level.block.SnowLayerBlock) {
               switch ((Integer)var4.getValue(net.minecraft.world.level.block.SnowLayerBlock.LAYERS)) {
                  case 1:
                     var6 = 7;
                     break;
                  case 2:
                     var6 = 8;
                     break;
                  case 3:
                     var6 = 9;
                     break;
                  case 4:
                     var6 = 10;
                     break;
                  case 5:
                     var6 = 11;
                     break;
                  case 6:
                     var6 = 12;
                     break;
                  case 7:
                     var6 = 13;
                     break;
                  default:
                     var6 = 14;
               }
            } else if (Intrinsics.areEqual(var5, net.minecraft.world.level.block.Blocks.SNOW)) {
               var6 = 15;
            } else {
               var6 = 1;
            }

            IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.put(param1, var6);
            return var6;
         }
      }
   }

   private final void h() {
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.clear();
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.clear();
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.clear();
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.clear();
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.clear();
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.clear();
   }
}
