package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.level.BlockGetter;
import java.util.Collection;
import net.minecraft.world.level.EmptyBlockGetter;
import me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.phys.shapes.VoxelShape;
import me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import java.util.HashSet;

public final class lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; } // PX-FIX ovld

   @NotNull
   public static lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] c;
   private static String[] d;

   private lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI() {
   }

   public final boolean a(
      @NotNull Vec3 param1,
      @NotNull Vec3 param2,
      @NotNull Vec3 param3,
      int param4,
      boolean param5,
      double param6,
      boolean param8,
      boolean param9,
      double param10
   ) {
      // Reconstructed from the original descriptor; the guard controls whether
      // simulation advances and whether a collision uses the vertical checks.
      Intrinsics.checkNotNullParameter(param1, "from");
      Intrinsics.checkNotNullParameter(param2, "to");
      int guard = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
      Intrinsics.checkNotNullParameter(param3, "velocity");

      me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI movement =
         me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2);
      int stepIndex = 0;
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI state =
         new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            param1, param3, movement.a(), movement.b(), true);

      while (stepIndex <= param4) {
         stepIndex++;
         if (guard != 0) {
            state = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(1.0D, 0.0D, state, param9, param10);
            if (state == null) {
               continue;
            }
         }

         if (guard != 0 && !param5
            && me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
            return false;
         }

         boolean collided = this.a(param2, state.a(), 0.5D);
         if (guard == 0) {
            return collided;
         }
         if (collided && (Math.abs(state.a().y - param2.y) < param6 || param8)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   public final Vec3 a(@NotNull Vec3 param1, @NotNull Vec3 param2, @NotNull Vec3 param3, int param4, int param5, boolean param6, boolean param7) {
      Intrinsics.checkNotNullParameter(param1, "from");
      Intrinsics.checkNotNullParameter(param2, "to");
      Intrinsics.checkNotNullParameter(param3, "velocity");
      me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var9 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2);
      int var10 = 0;
      int var11 = 0;
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var12 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(param1, param3, var9.a(), var9.b(), true);
      while (var10 <= param4) {
         var10++;
         var12 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(1.0D, 0.0D, var12, param7, 0.0D);
         if (var12 == null) {
            continue;
         }
         if (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
            var11++;
         }
         if (var11 == param5) {
            return var12.a();
         }
         if (this.a(param2, var12.a(), 0.5D)) {
            if (Math.abs(var12.a().y - param2.y) < 1.0D) {
               return null;
            }
            if (param6) {
               return null;
            }
         }
      }
      return null;
   }

   @Nullable
   public final ArrayList<Vec3> b(@NotNull Vec3 param1, @NotNull Vec3 param2, @NotNull Vec3 param3, int param4, int param5, boolean param6, boolean param7) {
      Intrinsics.checkNotNullParameter(param1, "from");
      Intrinsics.checkNotNullParameter(param2, "to");
      Intrinsics.checkNotNullParameter(param3, "velocity");
      me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var9 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2);
      ArrayList<Vec3> var10 = new ArrayList<Vec3>();
      int var11 = 0;
      int var12 = 0;
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(param1, param3, var9.a(), var9.b(), true);
      while (var11 <= param4) {
         var11++;
         var13 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(1.0D, 0.0D, var13, param7, 0.0D);
         if (var13 == null) {
            continue;
         }
         if (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
            var12++;
            var10.add(var13.a());
         }
         if (var12 == param5) {
            return var10;
         }
         if (this.a(param2, var13.a(), 0.5D)) {
            if (Math.abs(var13.a().y - param2.y) < 1.0D) {
               return null;
            }
            if (param6) {
               return null;
            }
         }
      }
      return null;
   }

   @NotNull
   public final ArrayList<Vec3> a(@NotNull Vec3 param1, @NotNull Vec3 param2, int param3) {
      Intrinsics.checkNotNullParameter(param1, "from");
      Intrinsics.checkNotNullParameter(param2, "to");
      ArrayList<Vec3> var5 = new ArrayList<Vec3>();
      me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2);
      int var7 = 0;
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(param1, Vec3.ZERO, var6.a(), var6.b(), true);
      while (var7 <= 100) {
         var7++;
         var8 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(1.0D, 0.0D, var8, false, 0.0D);
         if (var8 == null) {
            continue;
         }
         if (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
            return var5;
         }
         if (this.a(param2, var8.a(), 0.5D) && Math.abs(var8.a().y - param2.y) < 1.0D) {
            return var5;
         }
         if (var7 % param3 == 0) {
            var5.add(var8.a());
         }
      }
      return var5;
   }

   public final boolean a(@NotNull Vec3 param1, @NotNull Vec3 param2, double param3) {
      Intrinsics.checkNotNullParameter(param1, "point");
      Intrinsics.checkNotNullParameter(param2, "playerPos");
      return param2.x >= param1.x - param3 && param2.x < param1.x + param3 && param2.z >= param1.z - param3 && param2.z < param1.z + param3;
   }

   @NotNull
   public final List<BlockPos> a(double param1, double param3) {
      LocalPlayer var5 = this.a().player;
      if (var5 == null) {
         return CollectionsKt.emptyList();
      } else {
         Vec3 var6 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var5);
         BlockPos var7 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((net.minecraft.world.entity.Entity)var5);
         if (var7 == null) {
            var7 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s();
         }
         return this.a(param1, param3, var6, var7);
      }
   }

   @NotNull
   public final List<BlockPos> a(double param1, double param3, @NotNull Vec3 param5, @NotNull BlockPos param6) {
      Intrinsics.checkNotNullParameter(param5, "playerPos");
      Intrinsics.checkNotNullParameter(param6, "from");
      ClientLevel var8 = this.a().level;
      if (var8 == null) {
         return CollectionsKt.emptyList();
      } else {
         LocalPlayer var9 = this.a().player;
         if (var9 == null) {
            return CollectionsKt.emptyList();
         } else {
            double var10 = param3 * param3;
            double var12 = 0.001D;
            BlockPos[] var13 = new BlockPos[]{new BlockPos(1, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 1), new BlockPos(0, 0, -1)};
            List<BlockPos> var14 = CollectionsKt.listOf(var13);
            HashSet var15 = new HashSet();
            HashSet var16 = new HashSet();
            ArrayList var17 = new ArrayList();
            var15.add(new Pair(param6, this.g(param6)));
            while (!var15.isEmpty()) {
               ArrayList var18 = (ArrayList)CollectionsKt.toCollection((Iterable)var15, (Collection)(new ArrayList()));
               var15.clear();
               Iterator var19 = var18.iterator();
               while (var19.hasNext()) {
                  Pair var20 = (Pair)var19.next();
                  var16.add(var20.getFirst());
                  var17.add(var20.getFirst());
                  Iterator var21 = a((List)var14, param5, var10, var8, var9, param1, var12, (Pair)var20).iterator();
                  while (var21.hasNext()) {
                     Pair var22 = (Pair)var21.next();
                     if (!var16.contains(var22.getFirst())) {
                        var15.add(var22);
                     }
                  }
               }
            }

            return CollectionsKt.toList((Iterable)var17);
         }
      }
   }

   @NotNull
   public final List<BlockPos> a(@NotNull BlockPos param1, int param2, int param3, int param4) {
      Intrinsics.checkNotNullParameter(param1, "pos");
      ArrayList<BlockPos> var6 = new ArrayList<BlockPos>();

      for (int var7 = -param2; var7 <= param2; var7++) {
         for (int var8 = -param4; var8 <= param4; var8++) {
            for (int var9 = -param3; var9 <= param3; var9++) {
               if (var7 != 0 || var8 != 0 || var9 != 0) {
                  var6.add(param1.offset(var7, var8, var9));
               }
            }
         }
      }

      return var6;
   }

   @NotNull
   public final BlockPos a(@NotNull BlockPos param1, @NotNull Direction param2) {
      Intrinsics.checkNotNullParameter(param1, "pos");
      Intrinsics.checkNotNullParameter(param2, "face");
      switch (param2) {
         case NORTH:
            return param1.north();
         case SOUTH:
            return param1.east();
         case WEST:
            return param1.west();
         case EAST:
            return param1.east();
         case UP:
            return param1.above();
         case DOWN:
            return param1.below();
         default:
            throw new NoWhenBranchMatchedException();
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d ()I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 71
      // 09: sipush -27380
      // 0c: sipush 23523
      // 0f: pop2
      // 10: ldc_w "pos"
      // 13: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 16: aload 2
      // 17: sipush -27376
      // 1a: sipush 11918
      // 1d: pop2
      // 1e: ldc_w "face"
      // 21: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 24: aload 2
      // 25: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 28: swap
      // 29: invokevirtual net/minecraft/core/Direction.ordinal ()I
      // 2c: iaload
      // 2d: tableswitch 176 1 6 43 71 92 113 134 155
      // 54: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 57: athrow
      // 58: aload 1
      // 59: invokevirtual net/minecraft/core/BlockPos.north ()Lnet/minecraft/core/BlockPos;
      // 5c: dup
      // 5d: sipush -27333
      // 60: sipush -12616
      // 63: pop2
      // 64: ldc_w "north(...)"
      // 67: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 6a: goto 71
      // 6d: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 70: athrow
      // 71: goto e5
      // 74: aload 1
      // 75: invokevirtual net/minecraft/core/BlockPos.east ()Lnet/minecraft/core/BlockPos;
      // 78: dup
      // 79: sipush -27362
      // 7c: sipush 21122
      // 7f: pop2
      // 80: ldc_w "east(...)"
      // 83: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 86: goto e5
      // 89: aload 1
      // 8a: invokevirtual net/minecraft/core/BlockPos.west ()Lnet/minecraft/core/BlockPos;
      // 8d: dup
      // 8e: sipush -27337
      // 91: sipush -8490
      // 94: pop2
      // 95: ldc_w "west(...)"
      // 98: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 9b: goto e5
      // 9e: aload 1
      // 9f: invokevirtual net/minecraft/core/BlockPos.east ()Lnet/minecraft/core/BlockPos;
      // a2: dup
      // a3: sipush -27334
      // a6: sipush -28931
      // a9: pop2
      // aa: ldc_w "east(...)"
      // ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // b0: goto e5
      // b3: aload 1
      // b4: invokevirtual net/minecraft/core/BlockPos.above ()Lnet/minecraft/core/BlockPos;
      // b7: dup
      // b8: sipush -27331
      // bb: sipush 21925
      // be: pop2
      // bf: ldc_w "above(...)"
      // c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // c5: goto e5
      // c8: aload 1
      // c9: invokevirtual net/minecraft/core/BlockPos.below ()Lnet/minecraft/core/BlockPos;
      // cc: dup
      // cd: sipush -27370
      // d0: sipush 13741
      // d3: pop2
      // d4: ldc_w "below(...)"
      // d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // da: goto e5
      // dd: new kotlin/NoWhenBranchMatchedException
      // e0: dup
      // e1: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // e4: athrow
      // e5: areturn
   }

   @NotNull
   public final BlockPos a(@NotNull BlockPos param1) {
      Intrinsics.checkNotNullParameter(param1, "pos");
      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return param1;
      } else {
         BlockPos var3 = param1;

         for (int var4 = 0; var4 < 61; var4++) {
            BlockPos var5 = var3.below();
            if (!var2.getBlockState(var5).isAir()) {
               return var3;
            }

            var3 = var5;
         }

         return param1;
      }
   }

   @NotNull
   public final Vec3 c(@NotNull BlockPos pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      return new Vec3((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
   }

   @NotNull
   public final Vec3 d(@NotNull BlockPos pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Vec3 var10000 = new Vec3(pos).add(0.5, 0.5, 0.5);
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   @NotNull
   public final Vec3 e(@NotNull BlockPos pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Vec3 var10000 = new Vec3(pos).add(0.5, 0.0, 0.5);
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   public final double h(@NotNull BlockPos pos) {
      int guard = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
      Intrinsics.checkNotNullParameter(pos, "pos");
      if (guard == 0) {
         return 1.0;
      }

      ClientLevel level = this.a().level;
      if (level == null) {
         return 1.0;
      }

      BlockState state = level.getBlockState(pos);
      Intrinsics.checkNotNullExpressionValue(state, "getBlockState(...)");
      VoxelShape shape = state.getShape(level, pos);
      Intrinsics.checkNotNullExpressionValue(shape, "getShape(...)");
      if (state.getBlock() instanceof SnowLayerBlock) {
         return (double)(((Number)state.getValue(SnowLayerBlock.LAYERS)).intValue() - 1) * 0.125;
      }

      return shape.isEmpty() ? 1.0 : shape.bounds().maxY;
   }

   @Nullable
   public final Block j(@NotNull BlockPos pos) {
      int guard = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
      Intrinsics.checkNotNullParameter(pos, "pos");
      if (guard != 0) {
         return null;
      }

      ClientLevel level = this.a().level;
      if (level == null) {
         return null;
      }

      return level.getBlockState(pos).getBlock();
   }


   // PX-FIX PhaseA: i() 从 CFR 迁移（去混淆异常捕获交错结构，Phase B 美化）
 public final boolean i(@NotNull BlockPos blockPos) {
     boolean bl;
     blockX39: {
         blockX33: {
             blockX40: {
                 BlockState blockState;
                 int n;
                 blockX38: {
                     int n2 = 0;
                     BlockState blockState2;
                     blockX35: {
                         blockX36: {
                             blockX34: {
                                 double d;
                                 blockX32: {
                                     ClientLevel clientLevel;
                                     blockX31: {
                                         blockX30: {
                                             int n3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
                                             Intrinsics.checkNotNullParameter((Object)blockPos, (String)"pos");
                                             n = n3;
                                             try {
                                                 try {
                                                     if (n == 0) break blockX30;
                                                     clientLevel = this.a().level;
                                                     if (clientLevel != null) break blockX31;
                                                 }
                                                 catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                     throw a(noWhenBranchMatchedException);
                                                 }
                                             }
                                             catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                 throw a(noWhenBranchMatchedException);
                                             }
                                         }
                                         return false;
                                     }
                                     ClientLevel clientLevel2 = clientLevel;
                                     BlockState blockState3 = clientLevel2.getBlockState(blockPos);
                                     Intrinsics.checkNotNullExpressionValue((Object)blockState3, (String)"getBlockState(...)");
                                     BlockState blockState4 = blockState3;
                                     double d2 = this.h(blockPos);
                                     BlockState blockState5 = clientLevel2.getBlockState(blockPos.offset(0, 1, 0));
                                     Intrinsics.checkNotNullExpressionValue((Object)blockState5, (String)"getBlockState(...)");
                                     blockState2 = blockState5;
                                     BlockPos blockPos2 = blockPos.offset(0, 1, 0);
                                     Intrinsics.checkNotNullExpressionValue((Object)blockPos2, (String)"offset(...)");
                                     d = this.h(blockPos2);
                                     BlockState blockState6 = clientLevel2.getBlockState(blockPos.offset(0, 2, 0));
                                     Intrinsics.checkNotNullExpressionValue((Object)blockState6, (String)"getBlockState(...)");
                                     blockState = blockState6;
                                     try {
                                         try {
                                             boolean blAir = blockState4.isAir();
                                             if (n == 0) break blockX32;
                                             if (blAir) break blockX33;
                                         }
                                         catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                             throw a(noWhenBranchMatchedException);
                                         }
                                         double d3 = d2 - 0.0;
                                         n2 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                     }
                                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                         throw a(noWhenBranchMatchedException);
                                     }
                                 }
                                 try {
                                     try {
                                         if (n == 0) break blockX34;
                                         if (n2 <= 0) break blockX33;
                                     }
                                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                         throw a(noWhenBranchMatchedException);
                                     }
                                     double d4 = d - 0.0;
                                     n2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                                 }
                                 catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                     throw a(noWhenBranchMatchedException);
                                 }
                             }
                             try {
                                 if (n == 0) break blockX35;
                                 if (n2 != 0) break blockX36;
                             }
                             catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                 throw a(noWhenBranchMatchedException);
                             }
                             n2 = 1;
                             break blockX35;
                         }
                         n2 = 0;
                     }
                     try {
                         blockX37: {
                             try {
                                 try {
                                     try {
                                         try {
                                             if (n2 != 0) break blockX37;
                                             bl = blockState2.getFluidState().isEmpty();
                                             if (n == 0) break blockX38;
                                         }
                                         catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                             throw a(noWhenBranchMatchedException);
                                         }
                                         if (!bl) break blockX37;
                                     }
                                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                         throw a(noWhenBranchMatchedException);
                                     }
                                     bl = blockState2.isAir();
                                     if (n == 0) break blockX38;
                                 }
                                 catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                     throw a(noWhenBranchMatchedException);
                                 }
                                 if (!bl) break blockX33;
                             }
                             catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                 throw a(noWhenBranchMatchedException);
                             }
                         }
                         bl = blockState.isAir();
                     }
                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                         throw a(noWhenBranchMatchedException);
                     }
                 }
                 try {
                     try {
                         try {
                             if (n == 0) break blockX39;
                             if (bl) break blockX40;
                         }
                         catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                             throw a(noWhenBranchMatchedException);
                         }
                         bl = blockState.getFluidState().isEmpty();
                         if (n == 0) break blockX39;
                     }
                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                         throw a(noWhenBranchMatchedException);
                     }
                     if (bl) break blockX33;
                 }
                 catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                     throw a(noWhenBranchMatchedException);
                 }
             }
             bl = true;
             break blockX39;
         }
         bl = false;
     }
     return bl;
 }

   @NotNull
   public final AABB f(@NotNull BlockPos param1) {
      Intrinsics.checkNotNullParameter(param1, "pos");
      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return new AABB(param1);
      } else {
         return this.a(param1, (BlockState)var2.getBlockState(param1));
      }
   }

   @NotNull
   public final AABB a(@NotNull BlockPos pos1, @NotNull BlockPos pos2) {
      Intrinsics.checkNotNullParameter(pos1, "pos1");
      Intrinsics.checkNotNullParameter(pos2, "pos2");
      return this.a((double)pos1.getX(), (double)pos1.getY(), (double)pos1.getZ(), (double)pos2.getX(), (double)pos2.getY(), (double)pos2.getZ());
   }

   private final AABB a(double var1, double var3, double var5, double var7, double var9, double var11) {
      return new AABB(Math.min(var1, var7), Math.min(var3, var9), Math.min(var5, var11), Math.max(var1, var7), Math.max(var3, var9), Math.max(var5, var11));
   }

   @NotNull
   public final Vec3 g(@NotNull BlockPos param1) {
      int var7 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
      Intrinsics.checkNotNullParameter(param1, "pos");
      if (var7 != 0) {
         return new Vec3((double)param1.getX() + 0.5D, (double)param1.getY() + 1.0D, (double)param1.getZ() + 0.5D);
      }

      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return new Vec3((double)param1.getX() + 0.5D, (double)param1.getY() + 1.0D, (double)param1.getZ() + 0.5D);
      } else {
         BlockState var3 = (BlockState)var2.getBlockState(param1);
         VoxelShape var4 = var3.getShape((BlockGetter)var2, param1);
         double var5;
         if (var3.getBlock() instanceof SnowLayerBlock && (Integer)var3.getValue((Property)SnowLayerBlock.LAYERS) - 1 > 0) {
            var5 = (double)((Integer)var3.getValue((Property)SnowLayerBlock.LAYERS) - 1) * 0.125D;
         } else if (var4.isEmpty()) {
            var5 = 1.0D;
         } else {
            var5 = var4.bounds().maxY;
         }

         return new Vec3((double)param1.getX() + 0.5D, (double)param1.getY() + var5, (double)param1.getZ() + 0.5D);
      }
   }

   @NotNull
   public final BlockPos a(@NotNull BlockPos pos, @NotNull BlockPos dir, int n) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Intrinsics.checkNotNullParameter(dir, "direction");
      BlockPos var3 = pos;
      int var4 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
      for (int var5 = 0; var5 < n; var5++) {
         var3 = var3.offset(dir);
         if (var4 == 0) {
            return var3;
         }
      }
      return var3;
   }

   @NotNull
   public final ArrayList<Pair<BlockPos, Block>> a(@NotNull Vec3 vec1, @NotNull Vec3 vec2) {
      Intrinsics.checkNotNullParameter(vec1, "vec1");
      Intrinsics.checkNotNullParameter(vec2, "vec2");
      int var3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
      ArrayList<BlockPos> var4 = this.b(vec1, vec2);
      ArrayList<Pair<BlockPos, Block>> var5 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(var4, 10));
      for (BlockPos var6 : var4) {
         if (var3 != 0) {
            return var5;
         }
         var5.add(TuplesKt.to(var6, lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j(var6)));
      }
      return var5;
   }

   @NotNull
   public final ArrayList<BlockPos> b(@NotNull Vec3 start, @NotNull Vec3 end) {
      Intrinsics.checkNotNullParameter(start, "start");
      Intrinsics.checkNotNullParameter(end, "end");
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(start, end);
      ArrayList<BlockPos> var3 = new ArrayList<>();
      for (int var4 = 0; var4 < 1001; var4++) {
         var3.add(var2.a());
         if (var2.c()) {
            break;
         }
         var2.b();
      }
      return var3;
   }

   private static final boolean a(@NotNull ClientLevel level, @NotNull BlockPos pos) {
      BlockState var2 = level.getBlockState(pos);
      if (var2.isAir()) {
         return true;
      }
      return !var2.getFluidState().isEmpty();
   }

   @NotNull
   public final BlockPos a(@NotNull Vec3 vec3d) {
      Intrinsics.checkNotNullParameter(vec3d, "vec3d");
      return new BlockPos((int)Math.floor(vec3d.x), (int)Math.floor(vec3d.y), (int)Math.floor(vec3d.z));
   }

   @NotNull
   public final Vec3 a(@NotNull Vec3 eye, @NotNull AABB box) {
      Intrinsics.checkNotNullParameter(eye, "eye");
      Intrinsics.checkNotNullParameter(box, "box");
      return new Vec3(
         IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(box.minX, box.maxX, eye.x),
         IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(box.minY, box.maxY, eye.y),
         IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(box.minZ, box.maxZ, eye.z)
      );
   }

   @NotNull
   public final AABB a(@NotNull BlockPos pos, @NotNull BlockState state) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Intrinsics.checkNotNullParameter(state, "state");
      int var3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
      ClientLevel var4 = this.a().level;
      VoxelShape var5;
      if (var3 != 0 && var4 != null) {
         var5 = state.getShape(var4, pos);
      } else {
         var5 = state.getShape(EmptyBlockGetter.INSTANCE, pos);
      }
      Intrinsics.checkNotNull(var5);
      boolean var6 = var5.isEmpty();
      double var7 = !var6 ? var5.bounds().minX : 0.0;
      double var9 = !var6 ? var5.bounds().minY : 0.0;
      double var11 = !var6 ? var5.bounds().minZ : 0.0;
      double var13 = !var6 ? var5.bounds().maxX : 1.0;
      double var15 = !var6 ? var5.bounds().maxY : 1.0;
      double var17 = !var6 ? var5.bounds().maxZ : 1.0;
      return new AABB(
         (double)pos.getX() + var7, (double)pos.getY() + var9, (double)pos.getZ() + var11,
         (double)pos.getX() + var13, (double)pos.getY() + var15, (double)pos.getZ() + var17
      );
   }

   @Nullable
   public final Direction b(@NotNull BlockPos pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      LocalPlayer var2 = this.a().player;
      if (var2 == null) {
         return null;
      }
      return Direction.getApproximateNearest(pos.getCenter().subtract(var2.getEyePosition()));
   }

   public static boolean a(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var0, Vec3 var1, Vec3 var2, Vec3 var3, int var4, boolean var5, double var6, boolean var8, boolean var9, double var10, int var11, Object var12) {
      if ((var11 & 4) != 0) {
         var3 = Vec3.ZERO;
      }
      if ((var11 & 8) != 0) {
         var4 = 100;
      }
      if ((var11 & 16) != 0) {
         var5 = false;
      }
      if ((var11 & 32) != 0) {
         var6 = 1.0;
      }
      if ((var11 & 64) != 0) {
         var8 = false;
      }
      if ((var11 & 128) != 0) {
         var9 = false;
      }
      if ((var11 & 256) != 0) {
         var10 = 0.0;
      }
      return var0.a(var1, var2, var3, var4, var5, var6, var8, var9, var10);
   }

   public static Vec3 a(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var0, Vec3 var1, Vec3 var2, Vec3 var3, int var4, int var5, boolean var6, boolean var7, int var8, Object var9) {
      if ((var8 & 4) != 0) {
         var3 = Vec3.ZERO;
      }
      if ((var8 & 8) != 0) {
         var4 = 100;
      }
      if ((var8 & 16) != 0) {
         var5 = 1;
      }
      if ((var8 & 32) != 0) {
         var6 = true;
      }
      if ((var8 & 64) != 0) {
         var7 = false;
      }
      return var0.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public static ArrayList b(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var0, Vec3 var1, Vec3 var2, Vec3 var3, int var4, int var5, boolean var6, boolean var7, int var8, Object var9) {
      if ((var8 & 4) != 0) {
         var3 = Vec3.ZERO;
      }
      if ((var8 & 8) != 0) {
         var4 = 100;
      }
      if ((var8 & 16) != 0) {
         var5 = 1;
      }
      if ((var8 & 32) != 0) {
         var6 = true;
      }
      if ((var8 & 64) != 0) {
         var7 = false;
      }
      return var0.b(var1, var2, var3, var4, var5, var6, var7);
   }

   public static ArrayList a(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var0, Vec3 var1, Vec3 var2, int var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = 5;
      }
      return var0.a(var1, var2, var3);
   }

   private static final ArrayList<Pair<BlockPos, Vec3>> a(
      List<? extends BlockPos> param0,
      Vec3 param1,
      double param2,
      ClientLevel param4,
      LocalPlayer param5,
      double param6,
      double param8,
      Pair<? extends BlockPos, ? extends Vec3> param10
   ) {
      ArrayList<Pair<BlockPos, Vec3>> var12 = new ArrayList<Pair<BlockPos, Vec3>>();
      BlockPos var13 = (BlockPos)param10.getFirst();
      Vec3 var14 = (Vec3)param10.getSecond();
      Iterator var15 = param0.iterator();
      while (var15.hasNext()) {
         BlockPos var16 = (BlockPos)var15.next();
         BlockPos var17 = var13.offset(var16);
         if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(param1, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var17)) > param2) {
            continue;
         }
         BlockState var18 = param4.getBlockState(var17);
         Vec3 var19 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var17);
         double var20 = var19.y - var14.y;
         if (var18.isAir()) {
            continue;
         }
         if (Math.abs(var20) > (double)param5.maxUpStep()) {
            continue;
         }
         if (Math.abs(var19.y - param1.y) > param6) {
            continue;
         }
         if (!a(param4, var17.offset(0, 1, 0))) {
            continue;
         }
         if (!a(param4, var17.offset(0, 2, 0))) {
            continue;
         }
         if (var20 > param8 && !a(param4, var13.offset(0, 3, 0))) {
            continue;
         }
         if (var20 < -param8 && !a(param4, var17.offset(0, 3, 0))) {
            continue;
         }
         var12.add(new Pair(var17, var19));
      }
      return var12;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[44];
      int var3 = 0;
      String var2 = "õq\u0085¾Ç¶W7M\t\u0002\u0010\u001a\u0016^£d\u0095+\rÐ)\u0005\u0092\u001a¿úûlx£â\u0003\t\u0006Å?\rç0Équ\u0004m\u00ad@+\u00031>Ë\u0004\u000beZz\u0002L\u0013\b; ®é;\u008b\u000e\u0097\nv¿l|3\u0090}5\u000f\u0084\t1d\u001d\u001cÔâ5½\u0001\u0003-3è\u0002DÅ\u000b]Ä¯l\u0012Q\u000fÚ\u0087~\u001f\tP©õ\u0080¾\u0081âG\u0010\u0004&Çíý\t\u009fU\u0089¦FÜ\u0002*\u000f\u0005tø\u0012ºS\u0004Ù*ÖØ\u0003õÔS\u0004\u001a³x£\u0004|¢ª(\u0004\u001f\u001d@,\u0005·B\u0001\u00898\u0003<&1\b\u0005{i\u0082Ãæ\u0011:\rö\u0083ÁÇ\u0082\u0015é®\u000eÒï·\u008a\u0005\u009f«È¢Z\u0012|È\u0090¿¬'»)N·¼P\nt\u0082èuò\u0004-r\u00802\u0004\u0086vsA\n\u0093ÝÐ0¤\u0019\u008f\u0004Q¢\u0003\u000bø-\u0005bóÐÝ\u001a\n#Ö¦¯\u001bÐ(=¥\u0085\u000bÅ²¼¢p\u0088Cá\u000e\u0019.\nÜåªg)\u008bÂVøè\t\u0012#\u0018p\u001eol\f*\u0012Î\u000eÆgf<âJeÛÙÝ¦Å\u0017ÞÇ4\r+(¤ \u0014é\f\u0091NÀçõ\u008b\t\u0087ÛúëB\u001cçb[\bÊím6\u0007\u00987\n";
      int var4 = "õq\u0085¾Ç¶W7M\t\u0002\u0010\u001a\u0016^£d\u0095+\rÐ)\u0005\u0092\u001a¿úûlx£â\u0003\t\u0006Å?\rç0Équ\u0004m\u00ad@+\u00031>Ë\u0004\u000beZz\u0002L\u0013\b; ®é;\u008b\u000e\u0097\nv¿l|3\u0090}5\u000f\u0084\t1d\u001d\u001cÔâ5½\u0001\u0003-3è\u0002DÅ\u000b]Ä¯l\u0012Q\u000fÚ\u0087~\u001f\tP©õ\u0080¾\u0081âG\u0010\u0004&Çíý\t\u009fU\u0089¦FÜ\u0002*\u000f\u0005tø\u0012ºS\u0004Ù*ÖØ\u0003õÔS\u0004\u001a³x£\u0004|¢ª(\u0004\u001f\u001d@,\u0005·B\u0001\u00898\u0003<&1\b\u0005{i\u0082Ãæ\u0011:\rö\u0083ÁÇ\u0082\u0015é®\u000eÒï·\u008a\u0005\u009f«È¢Z\u0012|È\u0090¿¬'»)N·¼P\nt\u0082èuò\u0004-r\u00802\u0004\u0086vsA\n\u0093ÝÐ0¤\u0019\u008f\u0004Q¢\u0003\u000bø-\u0005bóÐÝ\u001a\n#Ö¦¯\u001bÐ(=¥\u0085\u000bÅ²¼¢p\u0088Cá\u000e\u0019.\nÜåªg)\u008bÂVøè\t\u0012#\u0018p\u001eol\f*\u0012Î\u000eÆgf<âJeÛÙÝ¦Å\u0017ÞÇ4\r+(¤ \u0014é\f\u0091NÀçõ\u008b\t\u0087ÛúëB\u001cçb[\bÊím6\u0007\u00987\n"
         .length();
      char var1 = '\t';
      int var8 = -1;
      a((lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])null);

      label52:
      while (true) {
         byte var10000 = 71;
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
                     case 1 -> 7;
                     case 2 -> 103;
                     case 3 -> 98;
                     case 4 -> 107;
                     case 5 -> 86;
                     default -> 110;
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
                     d = new String[44];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI();
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

                  var2 = "\u0098¶w\r\u0014¯\u0005¼\r\u0096[C\u009e¸~É3¦Äª%r";
                  var4 = "\u0098¶w\r\u0014¯\u0005¼\r\u0096[C\u009e¸~É3¦Äª%r".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 85;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void a(lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -27361) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 211;
            case 1 -> 51;
            case 2 -> 63;
            case 3 -> 190;
            case 4 -> 33;
            case 5 -> 41;
            case 6 -> 70;
            case 7 -> 217;
            case 8 -> 152;
            case 9 -> 17;
            case 10 -> 220;
            case 11 -> 86;
            case 12 -> 135;
            case 13 -> 198;
            case 14 -> 203;
            case 15 -> 99;
            case 16 -> 148;
            case 17 -> 67;
            case 18 -> 147;
            case 19 -> 218;
            case 20 -> 140;
            case 21 -> 123;
            case 22 -> 196;
            case 23 -> 100;
            case 24 -> 88;
            case 25 -> 212;
            case 26 -> 129;
            case 27 -> 236;
            case 28 -> 186;
            case 29 -> 42;
            case 30 -> 153;
            case 31 -> 127;
            case 32 -> 72;
            case 33 -> 68;
            case 34 -> 69;
            case 35 -> 199;
            case 36 -> 175;
            case 37 -> 97;
            case 38 -> 124;
            case 39 -> 3;
            case 40 -> 162;
            case 41 -> 145;
            case 42 -> 165;
            case 43 -> 71;
            case 44 -> 111;
            case 45 -> 137;
            case 46 -> 23;
            case 47 -> 231;
            case 48 -> 176;
            case 49 -> 241;
            case 50 -> 89;
            case 51 -> 161;
            case 52 -> 32;
            case 53 -> 200;
            case 54 -> 167;
            case 55 -> 195;
            case 56 -> 160;
            case 57 -> 60;
            case 58 -> 59;
            case 59 -> 50;
            case 60 -> 79;
            case 61 -> 119;
            case 62 -> 5;
            case 63 -> 61;
            case 64 -> 117;
            case 65 -> 201;
            case 66 -> 183;
            case 67 -> 20;
            case 68 -> 134;
            case 69 -> 248;
            case 70 -> 234;
            case 71 -> 249;
            case 72 -> 49;
            case 73 -> 121;
            case 74 -> 192;
            case 75 -> 252;
            case 76 -> 239;
            case 77 -> 53;
            case 78 -> 40;
            case 79 -> 221;
            case 80 -> 210;
            case 81 -> 141;
            case 82 -> 109;
            case 83 -> 73;
            case 84 -> 253;
            case 85 -> 36;
            case 86 -> 39;
            case 87 -> 150;
            case 88 -> 204;
            case 89 -> 228;
            case 90 -> 163;
            case 91 -> 34;
            case 92 -> 168;
            case 93 -> 35;
            case 94 -> 92;
            case 95 -> 21;
            case 96 -> 112;
            case 97 -> 202;
            case 98 -> 62;
            case 99 -> 57;
            case 100 -> 6;
            case 101 -> 29;
            case 102 -> 206;
            case 103 -> 25;
            case 104 -> 159;
            case 105 -> 188;
            case 106 -> 31;
            case 107 -> 38;
            case 108 -> 116;
            case 109 -> 74;
            case 110 -> 110;
            case 111 -> 157;
            case 112 -> 155;
            case 113 -> 125;
            case 114 -> 194;
            case 115 -> 144;
            case 116 -> 178;
            case 117 -> 205;
            case 118 -> 37;
            case 119 -> 104;
            case 120 -> 52;
            case 121 -> 1;
            case 122 -> 246;
            case 123 -> 184;
            case 124 -> 8;
            case 125 -> 187;
            case 126 -> 233;
            case 127 -> 154;
            case 128 -> 81;
            case 129 -> 224;
            case 130 -> 142;
            case 131 -> 179;
            case 132 -> 12;
            case 133 -> 101;
            case 134 -> 77;
            case 135 -> 122;
            case 136 -> 174;
            case 137 -> 118;
            case 138 -> 132;
            case 139 -> 85;
            case 140 -> 209;
            case 141 -> 83;
            case 142 -> 58;
            case 143 -> 66;
            case 144 -> 138;
            case 145 -> 171;
            case 146 -> 115;
            case 147 -> 56;
            case 148 -> 95;
            case 149 -> 84;
            case 150 -> 128;
            case 151 -> 243;
            case 152 -> 93;
            case 153 -> 227;
            case 154 -> 180;
            case 155 -> 247;
            case 156 -> 235;
            case 157 -> 106;
            case 158 -> 232;
            case 159 -> 226;
            case 160 -> 143;
            case 161 -> 130;
            case 162 -> 9;
            case 163 -> 207;
            case 164 -> 105;
            case 165 -> 30;
            case 166 -> 215;
            case 167 -> 78;
            case 168 -> 173;
            case 169 -> 13;
            case 170 -> 250;
            case 171 -> 10;
            case 172 -> 182;
            case 173 -> 166;
            case 174 -> 75;
            case 175 -> 87;
            case 176 -> 108;
            case 177 -> 230;
            case 178 -> 185;
            case 179 -> 54;
            case 180 -> 24;
            case 181 -> 131;
            case 182 -> 103;
            case 183 -> 149;
            case 184 -> 170;
            case 185 -> 229;
            case 186 -> 80;
            case 187 -> 48;
            case 188 -> 172;
            case 189 -> 19;
            case 190 -> 2;
            case 191 -> 16;
            case 192 -> 139;
            case 193 -> 91;
            case 194 -> 240;
            case 195 -> 254;
            case 196 -> 244;
            case 197 -> 191;
            case 198 -> 26;
            case 199 -> 76;
            case 200 -> 177;
            case 201 -> 237;
            case 202 -> 164;
            case 203 -> 7;
            case 204 -> 181;
            case 205 -> 22;
            case 206 -> 107;
            case 207 -> 90;
            case 208 -> 245;
            case 209 -> 0;
            case 210 -> 14;
            case 211 -> 193;
            case 212 -> 213;
            case 213 -> 169;
            case 214 -> 120;
            case 215 -> 94;
            case 216 -> 11;
            case 217 -> 238;
            case 218 -> 4;
            case 219 -> 102;
            case 220 -> 225;
            case 221 -> 44;
            case 222 -> 65;
            case 223 -> 136;
            case 224 -> 242;
            case 225 -> 64;
            case 226 -> 189;
            case 227 -> 208;
            case 228 -> 223;
            case 229 -> 82;
            case 230 -> 146;
            case 231 -> 18;
            case 232 -> 222;
            case 233 -> 251;
            case 234 -> 114;
            case 235 -> 126;
            case 236 -> 45;
            case 237 -> 216;
            case 238 -> 133;
            case 239 -> 255;
            case 240 -> 158;
            case 241 -> 15;
            case 242 -> 98;
            case 243 -> 96;
            case 244 -> 113;
            case 245 -> 43;
            case 246 -> 219;
            case 247 -> 27;
            case 248 -> 197;
            case 249 -> 28;
            case 250 -> 55;
            case 251 -> 214;
            case 252 -> 151;
            case 253 -> 156;
            case 254 -> 47;
            default -> 46;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private final double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @NotNull
      private final ArrayList<BlockPos> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final double lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @NotNull
      private Vec3 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      private double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      private double lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      private double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      private final double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      private final double IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      private final double IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      private final int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      private final int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      private final int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      private final double IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      private final double lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      private final double llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      private final double lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
      private final double IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      private final double IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      private double IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
      private double llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
      private double lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull Vec3 var1, @NotNull Vec3 var2) {
         short var10001 = 1128;
         short var10002 = -23186;
         Intrinsics.checkNotNullParameter(var1, "start");
         int var10000 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
         var10002 = 1129;
         short var10003 = 8608;
         Intrinsics.checkNotNullParameter(var2, "end");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (int)Math.floor(var1.x);
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (int)Math.floor(var1.y);
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)Math.floor(var1.z);
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (int)Math.floor(var2.x);
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (int)Math.floor(var2.y);
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (int)Math.floor(var2.z);
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2.x - var1.x;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var2.y - var1.y;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2.z - var1.z;
         int var3 = var10000;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new ArrayList<>();
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = (
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var1, var2)
                  + 1.0
            )
            * 5.0;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1.x;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1.y;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1.z;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            / this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            / this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            / this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = (int)Math.signum(
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         );
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = (int)Math.signum(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         );
         this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = (int)Math.signum(
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         );
         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 1.0
            / this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 1.0
            / this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = 1.0
            / this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = Math.min(
            this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
               * this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
            1.0
         );
         this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = Math.min(
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
               * this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
            1.0
         );
         this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = Math.min(
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
               * this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
            1.0
         );
         this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = Math.abs(
            (
                  (double)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     + Math.max(this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, 0)
                     - var1.x
               )
               * this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
         );
         this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = Math.abs(
            (
                  (double)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     + Math.max(this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, 0)
                     - var1.y
               )
               * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
         );
         this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = Math.abs(
            (
                  (double)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     + Math.max(this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI, 0)
                     - var1.z
               )
               * this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
         );
         if (var3 != 0) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }
      }

      @NotNull
      public final BlockPos a() {
         return new BlockPos(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      public final void b() {
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3;
         label37: {
            int var1 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
            double var4;
            int var10000 = (
                     var4 = this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
                        - this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                  )
                  == 0.0
               ? 0
               : (var4 < 0.0 ? -1 : 1);
            if (var1 != 0) {
               if (var10000 < 0) {
                  var3 = this;
                  if (var1 != 0) {
                     if (this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
                        < this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII) {
                        this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
                           + this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           + this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
                        if (var1 != 0) {
                           return;
                        }
                     }

                     this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII
                        + this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
                     var3 = this;
                  }

                  var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     + this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
                  if (var1 != 0) {
                     return;
                  }
               }

               var3 = this;
               if (var1 == 0) {
                  break label37;
               }

               double var5;
               var10000 = (
                        var5 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                           - this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII
                     )
                     == 0.0
                  ? 0
                  : (var5 < 0.0 ? -1 : 1);
            }

            if (var10000 < 0) {
               this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                  + this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  + this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
               if (var1 != 0) {
                  return;
               }
            }

            this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII
               + this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
            var3 = this;
         }

         var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            + this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      }

      public final boolean c() {
         int var1 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
         int var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return (0 != 0);
            }

            var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var1 != 0) {
            if (var10000 != var10001) {
               return (0 != 0);
            }

            var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 == 0) {
               return (boolean)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != 0);
            }

            var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         return (var10000 == var10001);
      }

      @NotNull
      public final Vec3 d() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final void e() {
         int var10000 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
         BlockPos var2 = new BlockPos(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
         int var1 = var10000;

         while (true) {
            if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.contains(var2)) {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  + this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  + this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
               var2 = new BlockPos(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            }

            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new Vec3(
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            );
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.add(var2);
            break;
         }
      }

      public final boolean f() {
         int var1 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
         int var10000 = (int)this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         int var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != 0) {
            if (var10000 != this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return (0 != 0);
            }

            var10000 = (int)this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var1 != 0) {
            if (var10000 != var10001) {
               return (0 != 0);
            }

            var10000 = (int)this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            if (var1 == 0) {
               return (var10000 != 0);
            }

            var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         return (var10000 == var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { byte var10 = (byte)0; // PX-FIX hoist
        
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\u001d\u0092¸\u0005®ù\u001f§C";
         int var4 = "\u001d\u0092¸\u0005®ù\u001f§C".length();
         char var1 = 3;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 13;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 13;
                  var10006 = var6;
               } else {
                  var13 = 13;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 13;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 72;
                     case 1 -> 79;
                     case 2 -> 19;
                     case 3 -> 85;
                     case 4 -> 87;
                     case 5 -> 109;
                     default -> 47;
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
             var10 = -1;
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
         int var2 = (var0 ^ 1129) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 209;
               case 1 -> 71;
               case 2 -> 64;
               case 3 -> 255;
               case 4 -> 199;
               case 5 -> 202;
               case 6 -> 139;
               case 7 -> 190;
               case 8 -> 27;
               case 9 -> 25;
               case 10 -> 213;
               case 11 -> 101;
               case 12 -> 60;
               case 13 -> 19;
               case 14 -> 187;
               case 15 -> 44;
               case 16 -> 144;
               case 17 -> 16;
               case 18 -> 17;
               case 19 -> 118;
               case 20 -> 62;
               case 21 -> 38;
               case 22 -> 173;
               case 23 -> 100;
               case 24 -> 49;
               case 25 -> 250;
               case 26 -> 147;
               case 27 -> 95;
               case 28 -> 58;
               case 29 -> 203;
               case 30 -> 143;
               case 31 -> 165;
               case 32 -> 46;
               case 33 -> 201;
               case 34 -> 189;
               case 35 -> 97;
               case 36 -> 96;
               case 37 -> 241;
               case 38 -> 127;
               case 39 -> 212;
               case 40 -> 238;
               case 41 -> 210;
               case 42 -> 235;
               case 43 -> 73;
               case 44 -> 158;
               case 45 -> 174;
               case 46 -> 10;
               case 47 -> 227;
               case 48 -> 53;
               case 49 -> 55;
               case 50 -> 236;
               case 51 -> 37;
               case 52 -> 131;
               case 53 -> 51;
               case 54 -> 198;
               case 55 -> 181;
               case 56 -> 78;
               case 57 -> 82;
               case 58 -> 111;
               case 59 -> 249;
               case 60 -> 79;
               case 61 -> 184;
               case 62 -> 29;
               case 63 -> 135;
               case 64 -> 225;
               case 65 -> 50;
               case 66 -> 185;
               case 67 -> 134;
               case 68 -> 8;
               case 69 -> 66;
               case 70 -> 170;
               case 71 -> 254;
               case 72 -> 94;
               case 73 -> 105;
               case 74 -> 109;
               case 75 -> 204;
               case 76 -> 48;
               case 77 -> 69;
               case 78 -> 114;
               case 79 -> 228;
               case 80 -> 253;
               case 81 -> 121;
               case 82 -> 80;
               case 83 -> 166;
               case 84 -> 216;
               case 85 -> 93;
               case 86 -> 104;
               case 87 -> 115;
               case 88 -> 99;
               case 89 -> 152;
               case 90 -> 243;
               case 91 -> 5;
               case 92 -> 107;
               case 93 -> 162;
               case 94 -> 76;
               case 95 -> 117;
               case 96 -> 246;
               case 97 -> 108;
               case 98 -> 145;
               case 99 -> 196;
               case 100 -> 126;
               case 101 -> 30;
               case 102 -> 168;
               case 103 -> 247;
               case 104 -> 15;
               case 105 -> 132;
               case 106 -> 142;
               case 107 -> 180;
               case 108 -> 220;
               case 109 -> 133;
               case 110 -> 41;
               case 111 -> 12;
               case 112 -> 125;
               case 113 -> 36;
               case 114 -> 87;
               case 115 -> 98;
               case 116 -> 75;
               case 117 -> 13;
               case 118 -> 35;
               case 119 -> 18;
               case 120 -> 153;
               case 121 -> 188;
               case 122 -> 218;
               case 123 -> 102;
               case 124 -> 6;
               case 125 -> 244;
               case 126 -> 90;
               case 127 -> 211;
               case 128 -> 206;
               case 129 -> 2;
               case 130 -> 14;
               case 131 -> 20;
               case 132 -> 83;
               case 133 -> 137;
               case 134 -> 3;
               case 135 -> 217;
               case 136 -> 56;
               case 137 -> 112;
               case 138 -> 40;
               case 139 -> 39;
               case 140 -> 11;
               case 141 -> 175;
               case 142 -> 193;
               case 143 -> 88;
               case 144 -> 119;
               case 145 -> 161;
               case 146 -> 155;
               case 147 -> 200;
               case 148 -> 0;
               case 149 -> 84;
               case 150 -> 208;
               case 151 -> 172;
               case 152 -> 160;
               case 153 -> 164;
               case 154 -> 63;
               case 155 -> 31;
               case 156 -> 234;
               case 157 -> 232;
               case 158 -> 219;
               case 159 -> 68;
               case 160 -> 148;
               case 161 -> 169;
               case 162 -> 86;
               case 163 -> 120;
               case 164 -> 140;
               case 165 -> 197;
               case 166 -> 239;
               case 167 -> 182;
               case 168 -> 130;
               case 169 -> 156;
               case 170 -> 207;
               case 171 -> 205;
               case 172 -> 178;
               case 173 -> 149;
               case 174 -> 128;
               case 175 -> 159;
               case 176 -> 245;
               case 177 -> 110;
               case 178 -> 194;
               case 179 -> 224;
               case 180 -> 240;
               case 181 -> 138;
               case 182 -> 251;
               case 183 -> 70;
               case 184 -> 103;
               case 185 -> 67;
               case 186 -> 52;
               case 187 -> 9;
               case 188 -> 136;
               case 189 -> 42;
               case 190 -> 54;
               case 191 -> 233;
               case 192 -> 72;
               case 193 -> 57;
               case 194 -> 157;
               case 195 -> 226;
               case 196 -> 81;
               case 197 -> 192;
               case 198 -> 28;
               case 199 -> 116;
               case 200 -> 237;
               case 201 -> 21;
               case 202 -> 183;
               case 203 -> 113;
               case 204 -> 1;
               case 205 -> 26;
               case 206 -> 74;
               case 207 -> 146;
               case 208 -> 85;
               case 209 -> 59;
               case 210 -> 22;
               case 211 -> 195;
               case 212 -> 77;
               case 213 -> 32;
               case 214 -> 229;
               case 215 -> 221;
               case 216 -> 223;
               case 217 -> 24;
               case 218 -> 141;
               case 219 -> 61;
               case 220 -> 47;
               case 221 -> 45;
               case 222 -> 222;
               case 223 -> 33;
               case 224 -> 215;
               case 225 -> 7;
               case 226 -> 191;
               case 227 -> 122;
               case 228 -> 167;
               case 229 -> 129;
               case 230 -> 91;
               case 231 -> 65;
               case 232 -> 154;
               case 233 -> 23;
               case 234 -> 150;
               case 235 -> 214;
               case 236 -> 248;
               case 237 -> 176;
               case 238 -> 34;
               case 239 -> 186;
               case 240 -> 4;
               case 241 -> 163;
               case 242 -> 179;
               case 243 -> 230;
               case 244 -> 171;
               case 245 -> 92;
               case 246 -> 43;
               case 247 -> 231;
               case 248 -> 177;
               case 249 -> 123;
               case 250 -> 124;
               case 251 -> 252;
               case 252 -> 89;
               case 253 -> 106;
               case 254 -> 242;
               default -> 151;
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
}
