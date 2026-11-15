package me.octo.client.utils.player;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.AxisDirection;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;
import net.minecraft.core.registries.BuiltInRegistries;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import net.minecraft.world.entity.Entity;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import net.minecraft.world.item.ItemStack;
import java.util.Iterator;
import net.minecraft.client.player.LocalPlayer;
import java.util.Map;
import kotlin.ranges.RangesKt;
import net.minecraft.core.SectionPos;
import net.minecraft.core.Vec3i;
import me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static me.octo.client.PXDyn IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field v2
   
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   public static me.octo.client.PXDyn IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = null; // PX-FIX missing field

   public static final Pair<Float, Float>[] m() { return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI; }

   @NotNull
   public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static HashMap<Pair<BlockPos, Vec3>, llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static BlockPos llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static double lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static double lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static Pair<Float, Float>[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static Pair<Float, Float>[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static BitSet IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static BitSet IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] c;
   private static String[] d;

   private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll() {
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI g() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final BlockPos h() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void a(@NotNull BlockPos var1) {
      short var10001 = -4907;
      short var10002 = -3247;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final double i() {
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
if (var1 == null) { return 0.0; }
IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.n();
if (var2 == null) { return 0.0; }
ItemStack var3 = var2.a();
if (var3 == null) { return 0.0; }
net.minecraft.nbt.CompoundTag var4 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3);
int var5 = var4.getIntOr("ethermerge", 0);
boolean var6 = var5 == 1 || Intrinsics.areEqual(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4), "ETHERWARP_CONDUIT");
if (!var6) { return 0.0; }
return 57.0 + (double)var4.getIntOr("tuned_transmission", 0);
   }

   private final Vec3 j() {
      return IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.A();
   }

   @NotNull
   public final Vec3 k() {
        LocalPlayer localPlayer;
        block5: {
            block4: {
                lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
                try {
                    try {
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block4;
                        localPlayer = this.a().player;
                        if (localPlayer != null) break block5;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                    }
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                }
            }
            Vec3 vec3 = Vec3.ZERO;
            Intrinsics.checkNotNullExpressionValue((Object)vec3, (String)"ZERO");
            return vec3;
        }
        LocalPlayer localPlayer2 = localPlayer;
        Vec3 vec3 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((Entity)localPlayer2).add(0.0, IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B(), 0.0);
        Intrinsics.checkNotNullExpressionValue((Object)vec3, (String)"add(...)");
        return vec3;
   }

   @Nullable
   public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a(
      @NotNull BlockPos param1, @NotNull Vec3 param2
   ) {
me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
if (var3 != null) { Intrinsics.checkNotNullParameter(param1, "pos"); Intrinsics.checkNotNullParameter(param2, "from"); if (System.currentTimeMillis() - lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll > 500L) { IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clear(); lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = System.currentTimeMillis(); } }
Pair<BlockPos, Vec3> var4 = TuplesKt.to(param1, param2);
if (var3 == null) { return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var4); }
if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.containsKey(var4)) { return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var4); }
List var5 = this.a(param1, param2, llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(this, param1, param2, 0.0, 4, (Object)null));
ArrayList var10 = new ArrayList();
for (Object var13 : var5) { llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var14 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)var13; if (var14.e() >= 5 && IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var14.d(), param1) >= 0.17) { var10.add(var13); } }
List var6 = var10;
List var7 = var6.isEmpty() ? var5 : var6;
if (var7.isEmpty()) { IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var4, null); return null; }
llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var8 = this.a(var7, param1);
IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var4, var8);
return var8;
   }

   @Nullable
   public final boolean a(@NotNull BlockPos pos, @NotNull Vec3 playerPos, double var3, double var5) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Intrinsics.checkNotNullParameter(playerPos, "playerPos");
      double var8 = playerPos.x - ((double)pos.getX() + 0.5);
      double var10 = playerPos.z - ((double)pos.getZ() + 0.5);
      if (var8 * var8 + var10 * var10 > var3 * var3) {
         return false;
      }
      return Math.abs(this.c(pos) - playerPos.y) <= var5;
   }

   public final Vec3 b(@NotNull BlockPos param1, @NotNull Vec3 param2) {
        Vec3 vec32;
        block11: {
            double d;
            Vec3 vec33;
            BlockPos blockPos2;
            llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2;
            block10: {
                Vec3 vec34;
                block8: {
                    lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
                    block9: {
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
                        Intrinsics.checkNotNullParameter((Object)param1, (String)"pos");
                        Intrinsics.checkNotNullParameter((Object)param2, (String)"from");
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2;
                        try {
                            try {
                                vec32 = param2;
                                vec34 = Vec3.ZERO;
                                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block8;
                                if (!Intrinsics.areEqual((Object)vec32, (Object)vec34)) break block9;
                            }
                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                            }
                            return null;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                        }
                    }
                    try {
                        llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2 = this;
                        blockPos2 = param1;
                        vec33 = param2;
                        d = 0.0667;
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block10;
                        Vec3 vec35 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2.a(blockPos2, vec33, d);
                        vec34 = vec35;
                        vec32 = vec35;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                    }
                }
                try {
                    if (vec34 != null) break block11;
                    llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2 = this;
                    blockPos2 = param1;
                    vec33 = param2;
                    d = 0.025;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                }
            }
            vec32 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2.a(blockPos2, vec33, d);
        }
        return vec32;
   }

   public final boolean a(@NotNull BlockPos param1, @NotNull Vec3 param2, @Nullable int[] param3) {
me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
Intrinsics.checkNotNullParameter(param1, "pos");
Intrinsics.checkNotNullParameter(param2, "from");
if (Intrinsics.areEqual(param2, net.minecraft.world.phys.Vec3.ZERO)) { return false; }
List var5 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(this, param1, param2, 0.0, 4, (Object)null);
for (Object var6o : var5) { net.minecraft.world.phys.Vec3 var6 = (net.minecraft.world.phys.Vec3)var6o; if (param3 != null) { if (param3[0] <= 0) { return false; } param3[0] = param3[0] - 1; } llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var7 = this.a(param2, var6); if (var7.a() && Intrinsics.areEqual(var7.b(), param1)) { return true; } }
return false;
   }

   private final Vec3 a(BlockPos param1, Vec3 param2, double param3) {
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
double var6 = this.i();
ArrayList var8 = new ArrayList();
ArrayList var9 = new ArrayList();
List var7 = this.b(param1, param2, param3);
Iterator var10 = var7.iterator();
while (var10.hasNext()) { Vec3 var11 = (Vec3)var10.next(); llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var12 = this.a(param2, var11); if (var12.a() && Intrinsics.areEqual(var12.b(), param1)) { var12.a(var11); if (var6 > 0.0) { me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var13 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param2, var11); me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var14 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var13.a(), var13.b()); if (this.a(param2, var6, param1, var14.a(), var14.b())) { int var15 = 0; Pair<Float, Float>[] var16 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; for (int var17 = 0; var17 < var16.length; var17++) { Pair<Float, Float> var19 = var16[var17]; float var20 = ((Number)var19.component1()).floatValue(); float var21 = ((Number)var19.component2()).floatValue(); if (this.a(param2, var6, param1, var14.a() + var20, var14.b() + var21)) { var15++; } } var12.a(var15); var8.add(var12); } else { var9.add(var12); } } else { var9.add(var12); } } }
if (!var8.isEmpty()) { llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var22 = this.a((List)var8, param1); return var22 == null ? null : var22.d(); }
if (var9.isEmpty()) { return null; }
Iterator var23 = var9.iterator();
while (var23.hasNext()) { llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var24 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)var23.next(); Vec3 var25 = var24.d(); var24.a(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(param1, param2, var25)); }
llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var26 = this.a((List)var9, param1);
return var26 == null ? null : var26.d();
   }

   private final ArrayList<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid> a(
      BlockPos var1, Vec3 var2, List<? extends Vec3> var3
   ) {
      Object var11 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      ArrayList var5 = new ArrayList();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;

      for (Vec3 var7 : var3) {
         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var8 = this.a(
            var2, var7
         );

         label38: {
            try {
               var11 = var8.a();
               if (var4 == null) {
                  break label38;
               }

               if (!((Boolean)var11)) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var10) {
               throw (RuntimeException)a(var10);
            }

            var11 = Intrinsics.areEqual(var8.b(), var1);
         }

         label32: {
            try {
               if (var4 == null) {
                  break label32;
               }

               if (!((Boolean)var11)) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var9) {
               throw (RuntimeException)a(var9);
            }

            var8.a(var7);
            var8.a(this.b(var1, var2, var7));
            var5.add(var8);
         }

         if (var4 == null) {
            break;
         }
      }

      return var5;
   }

   private final List<Vec3> b(BlockPos var1, Vec3 var2, double var3) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      ArrayList var6 = new ArrayList();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Vec3 var10001 = Vec3.atCenterOf(var1);
      short var10003 = -4912;
      short var10004 = 17069;
      Intrinsics.checkNotNullExpressionValue(var10001, "atCenterOf(...)");
      Vec3 var7 = var10001;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = var10000;
      var6.add(var7);

      label83:
      for (Direction var9 : (net.minecraft.core.Direction[])(Object)( // PX-FIX switchmap-conflict
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)) {
         double var10 = var2.subtract(var7).dot(new Vec3(var9.getStepX(), var9.getStepY(), var9.getStepZ()));
         double var24 = var10;

         while (true) {
            double var26 = 0.0;
            if (var5 != null) {
               if (var24 <= 0.0) {
                  break;
               }

               var24 = var3;
               var26 = 2;
            }

            double var12 = var24 / var26;

            while (true) {
               if (!(var12 < 1.0)) {
                  continue label83;
               }

               var24 = var3 / 2;
               if (var5 == null || var5 == null) {
                  break;
               }

               double var14 = var24;

               label76: {
                  while (var14 < 1.0) {
                     var6.add(this.a(var1, var9, var12, var14, 0.05));
                     var14 += var3;

                     try {
                        if (var5 == null) {
                           break label76;
                        }

                        if (var5 == null) {
                           break;
                        }
                     } catch (NoWhenBranchMatchedException var17) {
                        throw (RuntimeException)a(var17);
                     }
                  }

                  var12 += var3;
               }

               if (var5 == null) {
                  break label83;
               }
            }
         }
      }

      Iterable var18 = var6;
      boolean var19 = false;
      HashSet var20 = new HashSet();
      ArrayList var11 = new ArrayList();

      for (Object var13 : var18) {
         Vec3 var22 = (Vec3)var13;
         boolean var15 = false;
         Triple var23 = new Triple(MathKt.roundToInt(var22.x * 1000.0), MathKt.roundToInt(var22.y * 1000.0), MathKt.roundToInt(var22.z * 1000.0));

         label45: {
            try {
               boolean var25 = var20.add(var23);
               if (var5 == null) {
                  break label45;
               }

               if (!var25) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var16) {
               throw (RuntimeException)a(var16);
            }

            var11.add(var13);
         }

         if (var5 == null) {
            break;
         }
      }

      return var11;
   }

   private final Vec3 a(BlockPos var1, Direction var2, double var3, double var5, double var7) {
      Vec3 var14 = null; // PX-FIX
      Object IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = null; // PX-FIX
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      double var10000;
      label39: {
         try {
            if (var2.getAxisDirection() == AxisDirection.POSITIVE) {
               var10000 = 1.0 - var7;
               break label39;
            }
         } catch (NoWhenBranchMatchedException var13) {
            throw (RuntimeException)a(var13);
         }

         var10000 = var7;
      }

      double var9 = var10000;

      label30: {
         label29: {
            try {
               switch (((int[])llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var2.getAxis()
                  .ordinal()]) {
                  case 1:
                     var14 = new Vec3(var9, var3, var5);
                     break label30;
                  case 2:
                     break label29;
                  case 3:
                     break;
                  default:
                     throw new NoWhenBranchMatchedException();
               }
            } catch (NoWhenBranchMatchedException var12) {
               throw (RuntimeException)a(var12);
            }

            var14 = new Vec3(var3, var5, var9);
            break label30;
         }

         var14 = new Vec3(var3, var9, var5);
      }

      Vec3 var11 = var14;
      Vec3 var15 = var11.add(var1.getX(), var1.getY(), var1.getZ());
      short var10002 = -4875;
      short var10003 = -10469;
      Intrinsics.checkNotNullExpressionValue(var15, "add(...)");
      return var15;
   }

   private final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a(
      List<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid> param1,
      BlockPos param2
   ) {
me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
if (var3 != null && param1.isEmpty()) { return null; }
List var4 = CollectionsKt.sortedWith(param1, (java.util.Comparator)new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(param2));
return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)CollectionsKt.firstOrNull(var4);
   }

   private final double a(Vec3 var1, BlockPos var2) {
      double var3 = var1.x - var2.getX();
      double var5 = var1.y - var2.getY();
      double var7 = var1.z - var2.getZ();
      double[] var9 = new double[]{var5, var7, 1.0 - var3, 1.0 - var5, 1.0 - var7};
      return ComparisonsKt.minOf(var3, var9);
   }

   private final int b(BlockPos param1, Vec3 param2, Vec3 param3) {
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param2, param3);
double var6 = Math.max(this.i(), me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param2, param3) + 2.0);
int var8 = 0;
Pair<Float, Float>[] var9 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
for (int var10 = 0; var10 < var9.length; var10++) { Pair<Float, Float> var12 = var9[var10]; float var13 = ((Number)var12.component1()).floatValue(); float var14 = ((Number)var12.component2()).floatValue(); net.minecraft.world.phys.Vec3 var15 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5.a() + var13, var5.b() + var14).normalize().scale(var6).add(param2); llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var16 = this.a(param2, var15); if (var16.a() && Intrinsics.areEqual(var16.b(), param1)) { var8++; } }
return var8;
   }

   @NotNull
   public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a(
      float param1, float param2, double param3, boolean param5
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
Vec3 var7 = this.j();
if (Intrinsics.areEqual(var7, Vec3.ZERO)) { return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(); }
Vec3 var8 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2).normalize().scale(param3).add(var7);
PXEvMid var9 = this.a(var7, var8);
if ((!Intrinsics.areEqual(var9, PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()) || !param5) && var9 != null) { return var9; }
return new PXEvMid(true, me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f(var8), (BlockState)null);
   }

   @NotNull
   public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a(
      double param1
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
if (var3 == null) { return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(); }
LocalPlayer var4 = this.a().player;
if (var4 == null) { return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(); }
return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4.getYRot(), var4.getXRot(), param1, false, 8, (Object)null);
   }

   @NotNull
   public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a(
      @NotNull Vec3 param1, float param2, float param3, double param4
   ) {
Intrinsics.checkNotNullParameter(param1, "from");
if (Intrinsics.areEqual(param1, Vec3.ZERO)) { return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(); }
Vec3 var7 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param2, param3).normalize().scale(param4).add(param1);
return this.a(param1, var7);
   }

   private final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a(
      Vec3 param1, Vec3 param2
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var1 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      double var4 = var1.a(param1);
      double var6 = var1.b(param1);
      double var8 = var1.c(param1);
      double var10 = var1.a(param2);
      double var12 = var1.b(param2);
      double var14 = var1.c(param2);
      Vec3 var16 = var1.e(param1);
      double var56 = var1.a(var16);
      double var58 = var1.b(var16);
      double var60 = var1.c(var16);
      Vec3 var17 = var1.e(param2);
      double var18 = var1.a(var17);
      double var20 = var1.b(var17);
      double var22 = var1.c(var17);
      double var24 = var10 - var4;
      double var26 = var12 - var6;
      double var28 = var14 - var8;
      int var30 = RangesKt.coerceAtMost((int)(me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, param2) * 3.0), 200);
      int var31 = (int)Math.signum(var24);
      int var32 = (int)Math.signum(var26);
      int var33 = (int)Math.signum(var28);
      double var34 = var24 == 0.0 ? Double.MAX_VALUE : 1.0 / var24;
      double var36 = var26 == 0.0 ? Double.MAX_VALUE : 1.0 / var26;
      double var38 = var28 == 0.0 ? Double.MAX_VALUE : 1.0 / var28;
      double var40 = Math.abs(var34 * (double)var31);
      double var42 = Math.abs(var36 * (double)var32);
      double var44 = Math.abs(var38 * (double)var33);
      double var62 = Math.abs((var56 + (double)Math.max(var31, 0) - var4) * var34);
      double var64 = Math.abs((var58 + (double)Math.max(var32, 0) - var6) * var36);
      double var66 = Math.abs((var60 + (double)Math.max(var33, 0) - var8) * var38);
      for (int var48 = 0; var48 < var30; var48++) {
         BlockPos var51 = new BlockPos((int)var56, (int)var58, (int)var60);
         if (var3 != null) {
            net.minecraft.client.Minecraft var52 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a();
            net.minecraft.client.multiplayer.ClientLevel var53 = var52.level;
            if (var53 == null) { return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(); }
            net.minecraft.world.level.chunk.LevelChunk var54 = var53.getChunk(SectionPos.blockToSectionCoord(var51.getX()), SectionPos.blockToSectionCoord(var51.getZ()));
            if (var54 == null) { return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(); }
            BlockState var55 = var54.getBlockState(var51);
            if (!var55.isAir() && !this.a(var55)) {
               BlockState var57 = var54.getBlockState(var51.above());
               if (!this.b(var57)) { return new PXEvMid(false, var51, var55); }
               BlockState var59 = var54.getBlockState(var51.above(2));
               if (!this.b(var59)) { return new PXEvMid(false, var51, var55); }
               return new PXEvMid(true, var51, var55); } }
         if (var56 > var18 && var58 > var20 && var60 > var22) { return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(); }
         if (var62 <= var64 && var62 <= var66) { var62 += var40; var56 += (double)var31; }
         else if (var64 <= var66) { var64 += var42; var58 += (double)var32; }
         else { var66 += var44; var60 += (double)var33; } }
      return PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
   }

   public final boolean a(@NotNull BlockState var1) {
      short var10001 = -4902;
      short var10002 = 7896;
      Intrinsics.checkNotNullParameter(var1, "state");
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(Block.getId(var1));
   }

   public final boolean b(@NotNull BlockState param1) {
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
Intrinsics.checkNotNullParameter(param1, "state");
int var3 = Block.getId(param1);
return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(var3) && IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.get(var3);
   }

   @NotNull
   public final Vec3 b(@NotNull BlockPos var1) {
      short var10001 = -4927;
      short var10002 = 27770;
      Intrinsics.checkNotNullParameter(var1, "pos");
      return new Vec3(var1.getX() + 0.5, this.c(var1) + 0.05, var1.getZ() + 0.5);
   }

   private final double c(BlockPos param1) {
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
BlockState var3 = null;
if (var2 != null) { net.minecraft.client.Minecraft var4 = this.a(); net.minecraft.client.multiplayer.ClientLevel var5 = var4.level; if (var5 != null) { var3 = var5.getBlockState(param1); } }
if (var3 != null && (var3.getBlock() instanceof net.minecraft.world.level.block.SnowLayerBlock || var3.getBlock() instanceof net.minecraft.world.level.block.CarpetBlock)) { return (double)param1.getY() + 1.0; }
return lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(param1).y;
   }

   @NotNull
   public final BitSet l() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   @NotNull
   public final List<BlockPos> b(int param1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var2 == null) { return CollectionsKt.emptyList(); }
      net.minecraft.client.player.LocalPlayer var3 = this.a().player;
      if (var3 == null) { return CollectionsKt.emptyList(); }
      net.minecraft.client.multiplayer.ClientLevel var4 = this.a().level;
      if (var4 == null) { return CollectionsKt.emptyList(); }
      List<BlockPos> var5 = new ArrayList<>();
      List<BlockPos> var6 = new ArrayList<>();
      BlockPos var7 = BlockPos.containing(var3.getX(), var3.getY(), var3.getZ());
      Vec3 var8 = this.j();
      for (int var9 = -param1; var9 <= param1; var9++) {
         for (int var10 = -param1 / 4; var10 <= param1 / 4; var10++) {
            for (int var12 = -param1; var12 <= param1; var12++) {
               BlockPos var13 = var7.offset(var9, var10, var12);
               BlockState var14 = var4.getBlockState(var13);
               if (!var14.isAir()) {
                  BlockState var15 = var4.getBlockState(var13.above());
                  BlockState var16 = var4.getBlockState(var13.above(2));
                  if (this.b(var15) && this.b(var16) && Math.sqrt(var13.distToLowCornerSqr((double)var7.getX(), (double)var7.getY(), (double)var7.getZ())) <= (double)param1) {
                     PXEvMid var19 = this.a(var13, var8);
                     if (var19 != null && var19.d() != null) {
                        var5.add(var13);
                        if (var13.getY() == var7.getY()) { var6.add(var13); } } } } } } }
      return var6.isEmpty() ? var5 : var6;
   }

   private static final boolean a(Vec3 param0, double param1, BlockPos param3, float param4, float param5) {
lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var7 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param0, param4, RangesKt.coerceIn(param5, -90.0f, 90.0f), param1);
return var7.a() && Intrinsics.areEqual(var7.b(), param3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var57 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[37];
      int var3 = 0;
      String var2 = "\fÜM÷xQ\u000b&¨)b\u0007eÖZ\u0006±Ãe\bbZ4\u0083*ã\u0095Ý\u0003o\u009dÈ\u000fÁý\u001e\u0095\u0098É0iJ_rq\u008b\u000ek\nJOÀÃ\u0011\u001a\u009e)·T\u0005M\u0013ÂYð\tbòç\u0019ªú(¯ë\u0004©{Ø\u008b\u00121ËñG¶K±X QùºÑ`\u0005ÅMÏ\u0011uÎ#÷i\u0082\u0091gÁ\u0083\u0094\u00951µ,ù\u0006\u0013ðëÉD¤Æw¦\r\u0017}Ñüõíù\u0096O\u000e\u0004^¶&2\t¥:Ñ6\u0005\u0092¾ªT\u0005wàº'a\u0012î\u008d\n\u008fÉR^{]5F6&ñû÷\u0092\u0089\u000biÈÝCø\u001a\u009fO:\u00040\u0012æi`&Õ\u0094Ã\u008c)ë®\u00adgã\u0003Â:Ç\u0005ì[ÉP\u000f\bî\u0095¸Ì|tO\u009b\tú*:;OÙuF\u0014\u0003ú\u00adz\bn4ÌóA»\bm\t\u009c4¤«¢\u0097(yæ\u0016B¾\u009fûx\u0090\u001b¾Ö×$Vÿw©\f\u0094Õ¿\u007f×õ\u000fìè»7,\u009d¦ã\u0098\u000e([ÀK\u0002\u0005ªåjåc\u0004 3\u008f^\u000fp)Gf4\u0099@Æ\u000fÓßÁ>\u0018Ý\t¨=æ¯\u009dçUá¢\tàL+¤Sv\u0016E!\u0007UÏI9\u0018Á¯\r3\u0010o?[i¬}õ\u0095\bi\u0005\b´+\u0097\u0010*Çeâ\n}\u0096Æ:c\u0089\u0011açð";
      int var4 = "\fÜM÷xQ\u000b&¨)b\u0007eÖZ\u0006±Ãe\bbZ4\u0083*ã\u0095Ý\u0003o\u009dÈ\u000fÁý\u001e\u0095\u0098É0iJ_rq\u008b\u000ek\nJOÀÃ\u0011\u001a\u009e)·T\u0005M\u0013ÂYð\tbòç\u0019ªú(¯ë\u0004©{Ø\u008b\u00121ËñG¶K±X QùºÑ`\u0005ÅMÏ\u0011uÎ#÷i\u0082\u0091gÁ\u0083\u0094\u00951µ,ù\u0006\u0013ðëÉD¤Æw¦\r\u0017}Ñüõíù\u0096O\u000e\u0004^¶&2\t¥:Ñ6\u0005\u0092¾ªT\u0005wàº'a\u0012î\u008d\n\u008fÉR^{]5F6&ñû÷\u0092\u0089\u000biÈÝCø\u001a\u009fO:\u00040\u0012æi`&Õ\u0094Ã\u008c)ë®\u00adgã\u0003Â:Ç\u0005ì[ÉP\u000f\bî\u0095¸Ì|tO\u009b\tú*:;OÙuF\u0014\u0003ú\u00adz\bn4ÌóA»\bm\t\u009c4¤«¢\u0097(yæ\u0016B¾\u009fûx\u0090\u001b¾Ö×$Vÿw©\f\u0094Õ¿\u007f×õ\u000fìè»7,\u009d¦ã\u0098\u000e([ÀK\u0002\u0005ªåjåc\u0004 3\u008f^\u000fp)Gf4\u0099@Æ\u000fÓßÁ>\u0018Ý\t¨=æ¯\u009dçUá¢\tàL+¤Sv\u0016E!\u0007UÏI9\u0018Á¯\r3\u0010o?[i¬}õ\u0095\bi\u0005\b´+\u0097\u0010*Çeâ\n}\u0096Æ:c\u0089\u0011açð"
         .length();
      char var1 = 11;
      int var24 = -1;

      label85:
      while (true) {
         byte var10000 = 117;
         String var10001 = var2.substring(++var24, var24 + var1);
         short var10002 = -1;

         while (true) {
            label80: {
               char[] var63 = var10001.toCharArray();
               int var10004 = var63.length;
               int var6 = 0;
               byte var66 = var10000;
               var57 = var63;
               int var51 = var10004;
               byte var73;
               char[] var77;
               int var10006;
               if (var10004 <= 1) {
                  var77 = var63;
                  var73 = var10000;
                  var10006 = var6;
               } else {
                  var66 = var10000;
                  var51 = var10004;
                  if (var10004 <= var6) {
                     break label80;
                  }

                  var77 = var63;
                  var73 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var77[var10006] = (char)(var77[var10006] ^ var73 ^ switch (var6 % 7) {
                     case 0 -> 36;
                     case 1 -> 122;
                     case 2 -> 119;
                     case 3 -> 33;
                     case 4 -> 43;
                     case 5 -> 57;
                     default -> 91;
                  });
                  var6++;
                  if (var66 == 0) {
                     var10006 = var66;
                     var77 = var57;
                     var73 = var66;
                  } else {
                     if (var51 <= var6) {
                        break;
                     }

                     var77 = var57;
                     var73 = var66;
                     var10006 = var6;
                  }
               }
            }

            String var68 = new String(var57).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var68;
                  if ((var24 += var1) >= var4) {
                     c = var5;
                     d = new String[37];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap<>();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = System.currentTimeMillis();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new BlockPos(0, 0, 0);
                     Pair[] var7 = new Pair[]{
                        TuplesKt.to(0.0F, 0.0F),
                        TuplesKt.to(0.08F, 0.0F),
                        TuplesKt.to(-0.08F, 0.0F),
                        TuplesKt.to(0.0F, 0.08F),
                        TuplesKt.to(0.0F, -0.08F),
                        TuplesKt.to(0.12F, 0.08F),
                        TuplesKt.to(0.12F, -0.08F),
                        TuplesKt.to(-0.12F, 0.08F),
                        TuplesKt.to(-0.12F, -0.08F)
                     };
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var7;
                     var7 = new Pair[]{
                        TuplesKt.to(0.5F, 0.0F),
                        TuplesKt.to(-0.5F, 0.0F),
                        TuplesKt.to(0.0F, 0.5F),
                        TuplesKt.to(0.0F, -0.5F),
                        TuplesKt.to(0.35F, 0.35F),
                        TuplesKt.to(0.35F, -0.35F),
                        TuplesKt.to(-0.35F, 0.35F),
                        TuplesKt.to(-0.35F, -0.35F)
                     };
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var7;
                     BitSet var26 = new BitSet(65536);
                     BitSet var8 = var26;
                     boolean var9 = false;
                     Block[] var10 = new Block[]{
                        Blocks.AIR,
                        Blocks.CAVE_AIR,
                        Blocks.VOID_AIR,
                        Blocks.FIRE,
                        Blocks.SOUL_FIRE,
                        Blocks.SKELETON_SKULL,
                        Blocks.WITHER_SKELETON_SKULL,
                        Blocks.PLAYER_HEAD,
                        Blocks.ZOMBIE_HEAD,
                        Blocks.CREEPER_HEAD,
                        Blocks.DRAGON_HEAD,
                        Blocks.PIGLIN_HEAD,
                        Blocks.LEVER,
                        Blocks.STONE_BUTTON,
                        Blocks.OAK_BUTTON,
                        Blocks.SPRUCE_BUTTON,
                        Blocks.BIRCH_BUTTON,
                        Blocks.JUNGLE_BUTTON,
                        Blocks.ACACIA_BUTTON,
                        Blocks.DARK_OAK_BUTTON,
                        Blocks.MANGROVE_BUTTON,
                        Blocks.CRIMSON_BUTTON,
                        Blocks.WARPED_BUTTON,
                        Blocks.POLISHED_BLACKSTONE_BUTTON,
                        Blocks.TORCH,
                        Blocks.WALL_TORCH,
                        Blocks.SOUL_TORCH,
                        Blocks.SOUL_WALL_TORCH,
                        Blocks.REDSTONE_TORCH,
                        Blocks.REDSTONE_WALL_TORCH,
                        Blocks.TRIPWIRE_HOOK,
                        Blocks.TRIPWIRE,
                        Blocks.RAIL,
                        Blocks.POWERED_RAIL,
                        Blocks.DETECTOR_RAIL,
                        Blocks.ACTIVATOR_RAIL,
                        Blocks.CARROTS,
                        Blocks.WHEAT,
                        Blocks.POTATOES,
                        Blocks.BEETROOTS,
                        Blocks.NETHER_WART,
                        Blocks.SWEET_BERRY_BUSH,
                        Blocks.PUMPKIN_STEM,
                        Blocks.ATTACHED_PUMPKIN_STEM,
                        Blocks.MELON_STEM,
                        Blocks.ATTACHED_MELON_STEM,
                        Blocks.REDSTONE_WIRE,
                        Blocks.POPPY,
                        Blocks.DANDELION,
                        Blocks.BLUE_ORCHID,
                        Blocks.ALLIUM,
                        Blocks.AZURE_BLUET,
                        Blocks.RED_TULIP,
                        Blocks.ORANGE_TULIP,
                        Blocks.WHITE_TULIP,
                        Blocks.PINK_TULIP,
                        Blocks.OXEYE_DAISY,
                        Blocks.CORNFLOWER,
                        Blocks.LILY_OF_THE_VALLEY,
                        Blocks.WITHER_ROSE,
                        Blocks.SUNFLOWER,
                        Blocks.LILAC,
                        Blocks.ROSE_BUSH,
                        Blocks.PEONY,
                        Blocks.TALL_GRASS,
                        Blocks.LARGE_FERN,
                        Blocks.SHORT_GRASS,
                        Blocks.FERN,
                        Blocks.OAK_SAPLING,
                        Blocks.SPRUCE_SAPLING,
                        Blocks.BIRCH_SAPLING,
                        Blocks.JUNGLE_SAPLING,
                        Blocks.ACACIA_SAPLING,
                        Blocks.DARK_OAK_SAPLING,
                        Blocks.MANGROVE_PROPAGULE,
                        Blocks.AZALEA,
                        Blocks.FLOWERING_AZALEA,
                        Blocks.FLOWER_POT,
                        Blocks.DEAD_BUSH,
                        Blocks.LADDER,
                        Blocks.VINE,
                        Blocks.GLOW_LICHEN,
                        Blocks.SCULK_VEIN,
                        Blocks.REPEATER,
                        Blocks.COMPARATOR,
                        Blocks.COBWEB,
                        Blocks.LILY_PAD,
                        Blocks.SMALL_DRIPLEAF,
                        Blocks.BIG_DRIPLEAF,
                        Blocks.BIG_DRIPLEAF_STEM,
                        Blocks.WATER,
                        Blocks.LAVA,
                        Blocks.BROWN_MUSHROOM,
                        Blocks.RED_MUSHROOM,
                        Blocks.PISTON_HEAD,
                        Blocks.MOVING_PISTON,
                        Blocks.WARPED_ROOTS,
                        Blocks.CRIMSON_ROOTS,
                        Blocks.NETHER_SPROUTS,
                        Blocks.HANGING_ROOTS,
                        Blocks.SMALL_AMETHYST_BUD,
                        Blocks.MEDIUM_AMETHYST_BUD,
                        Blocks.LARGE_AMETHYST_BUD,
                        Blocks.AMETHYST_CLUSTER,
                        Blocks.SCAFFOLDING,
                        Blocks.POINTED_DRIPSTONE
                     };
                     var10 = var10;
                     boolean var11 = false;
                     int var12 = 0;

                     for (int var13 = var10.length; var12 < var13; var12++) {
                        Block var14 = var10[var12];
                        boolean var16 = false;
                        ImmutableList var45 = var14.getStateDefinition().getPossibleStates();
                        var10002 = -4873;
                        short var69 = 30802;
                        Intrinsics.checkNotNullExpressionValue(var45, "getPossibleStates(...)");
                        Iterable var17 = (Iterable)var45;
                        boolean var18 = false;

                        for (Object var20 : var17) {
                           BlockState var21 = (BlockState)var20;
                           boolean var22 = false;
                           var8.set(Block.getId(var21));
                        }
                     }

                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var26;
                     BitSet var27 = new BitSet(65536);
                     var8 = var27;
                     var9 = false;
                     var10 = new Block[]{
                        Blocks.SKELETON_SKULL,
                        Blocks.WITHER_SKELETON_SKULL,
                        Blocks.PLAYER_HEAD,
                        Blocks.ZOMBIE_HEAD,
                        Blocks.CREEPER_HEAD,
                        Blocks.DRAGON_HEAD,
                        Blocks.PIGLIN_HEAD,
                        Blocks.FLOWER_POT,
                        Blocks.LADDER,
                        Blocks.VINE
                     };
                     var10 = var10;
                     var11 = false;
                     var12 = 0;

                     for (int var35 = var10.length; var12 < var35; var12++) {
                        Block var36 = var10[var12];
                        boolean var37 = false;
                        ImmutableList var46 = var36.getStateDefinition().getPossibleStates();
                        var10002 = -4916;
                        short var70 = -5237;
                        Intrinsics.checkNotNullExpressionValue(var46, "getPossibleStates(...)");
                        Iterable var38 = (Iterable)var46;
                        boolean var39 = false;

                        for (Object var41 : var38) {
                           BlockState var42 = (BlockState)var41;
                           boolean var43 = false;
                           var8.set(Block.getId(var42));
                        }
                     }

                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var27;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var24);
                  break;
               default:
                  var5[var3++] = var68;
                  if ((var24 += var1) < var4) {
                     var1 = var2.charAt(var24);
                     continue label85;
                  }

                  var2 = "ÖÔÚa\u0007\u0014#ù\u0006èéf\u0091¦³á\u0000¿úå¨q\u0004fõp~";
                  var4 = "ÖÔÚa\u0007\u0014#ù\u0006èéf\u0091¦³á\u0000¿úå¨q\u0004fõp~".length();
                  var1 = 22;
                  var24 = -1;
            }

            var10000 = 41;
            var10001 = var2.substring(++var24, var24 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4908) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 64;
            case 1 -> 90;
            case 2 -> 101;
            case 3 -> 77;
            case 4 -> 117;
            case 5 -> 36;
            case 6 -> 144;
            case 7 -> 183;
            case 8 -> 10;
            case 9 -> 149;
            case 10 -> 187;
            case 11 -> 170;
            case 12 -> 206;
            case 13 -> 69;
            case 14 -> 39;
            case 15 -> 14;
            case 16 -> 202;
            case 17 -> 193;
            case 18 -> 234;
            case 19 -> 23;
            case 20 -> 168;
            case 21 -> 208;
            case 22 -> 171;
            case 23 -> 218;
            case 24 -> 186;
            case 25 -> 62;
            case 26 -> 106;
            case 27 -> 184;
            case 28 -> 74;
            case 29 -> 7;
            case 30 -> 127;
            case 31 -> 191;
            case 32 -> 86;
            case 33 -> 228;
            case 34 -> 30;
            case 35 -> 137;
            case 36 -> 123;
            case 37 -> 80;
            case 38 -> 131;
            case 39 -> 250;
            case 40 -> 220;
            case 41 -> 99;
            case 42 -> 136;
            case 43 -> 192;
            case 44 -> 194;
            case 45 -> 229;
            case 46 -> 103;
            case 47 -> 108;
            case 48 -> 1;
            case 49 -> 210;
            case 50 -> 49;
            case 51 -> 112;
            case 52 -> 73;
            case 53 -> 122;
            case 54 -> 120;
            case 55 -> 200;
            case 56 -> 44;
            case 57 -> 129;
            case 58 -> 109;
            case 59 -> 125;
            case 60 -> 52;
            case 61 -> 209;
            case 62 -> 237;
            case 63 -> 197;
            case 64 -> 16;
            case 65 -> 253;
            case 66 -> 35;
            case 67 -> 46;
            case 68 -> 9;
            case 69 -> 93;
            case 70 -> 190;
            case 71 -> 203;
            case 72 -> 201;
            case 73 -> 240;
            case 74 -> 29;
            case 75 -> 212;
            case 76 -> 51;
            case 77 -> 124;
            case 78 -> 50;
            case 79 -> 174;
            case 80 -> 247;
            case 81 -> 221;
            case 82 -> 155;
            case 83 -> 227;
            case 84 -> 85;
            case 85 -> 178;
            case 86 -> 156;
            case 87 -> 98;
            case 88 -> 4;
            case 89 -> 60;
            case 90 -> 55;
            case 91 -> 158;
            case 92 -> 68;
            case 93 -> 5;
            case 94 -> 0;
            case 95 -> 245;
            case 96 -> 148;
            case 97 -> 28;
            case 98 -> 138;
            case 99 -> 217;
            case 100 -> 94;
            case 101 -> 104;
            case 102 -> 134;
            case 103 -> 145;
            case 104 -> 143;
            case 105 -> 255;
            case 106 -> 54;
            case 107 -> 107;
            case 108 -> 172;
            case 109 -> 92;
            case 110 -> 147;
            case 111 -> 164;
            case 112 -> 13;
            case 113 -> 67;
            case 114 -> 81;
            case 115 -> 207;
            case 116 -> 119;
            case 117 -> 113;
            case 118 -> 246;
            case 119 -> 153;
            case 120 -> 79;
            case 121 -> 244;
            case 122 -> 84;
            case 123 -> 6;
            case 124 -> 12;
            case 125 -> 238;
            case 126 -> 96;
            case 127 -> 48;
            case 128 -> 135;
            case 129 -> 97;
            case 130 -> 233;
            case 131 -> 236;
            case 132 -> 87;
            case 133 -> 216;
            case 134 -> 177;
            case 135 -> 169;
            case 136 -> 11;
            case 137 -> 139;
            case 138 -> 17;
            case 139 -> 185;
            case 140 -> 43;
            case 141 -> 66;
            case 142 -> 72;
            case 143 -> 162;
            case 144 -> 188;
            case 145 -> 2;
            case 146 -> 254;
            case 147 -> 3;
            case 148 -> 196;
            case 149 -> 45;
            case 150 -> 26;
            case 151 -> 252;
            case 152 -> 71;
            case 153 -> 222;
            case 154 -> 56;
            case 155 -> 116;
            case 156 -> 53;
            case 157 -> 8;
            case 158 -> 146;
            case 159 -> 58;
            case 160 -> 100;
            case 161 -> 152;
            case 162 -> 223;
            case 163 -> 121;
            case 164 -> 126;
            case 165 -> 59;
            case 166 -> 37;
            case 167 -> 176;
            case 168 -> 57;
            case 169 -> 179;
            case 170 -> 211;
            case 171 -> 159;
            case 172 -> 195;
            case 173 -> 20;
            case 174 -> 248;
            case 175 -> 142;
            case 176 -> 22;
            case 177 -> 235;
            case 178 -> 226;
            case 179 -> 239;
            case 180 -> 157;
            case 181 -> 21;
            case 182 -> 141;
            case 183 -> 88;
            case 184 -> 89;
            case 185 -> 65;
            case 186 -> 160;
            case 187 -> 161;
            case 188 -> 230;
            case 189 -> 167;
            case 190 -> 18;
            case 191 -> 241;
            case 192 -> 181;
            case 193 -> 27;
            case 194 -> 110;
            case 195 -> 224;
            case 196 -> 75;
            case 197 -> 219;
            case 198 -> 133;
            case 199 -> 213;
            case 200 -> 25;
            case 201 -> 165;
            case 202 -> 63;
            case 203 -> 199;
            case 204 -> 132;
            case 205 -> 111;
            case 206 -> 225;
            case 207 -> 114;
            case 208 -> 214;
            case 209 -> 189;
            case 210 -> 33;
            case 211 -> 242;
            case 212 -> 38;
            case 213 -> 215;
            case 214 -> 41;
            case 215 -> 102;
            case 216 -> 231;
            case 217 -> 47;
            case 218 -> 180;
            case 219 -> 150;
            case 220 -> 76;
            case 221 -> 78;
            case 222 -> 205;
            case 223 -> 40;
            case 224 -> 130;
            case 225 -> 118;
            case 226 -> 82;
            case 227 -> 198;
            case 228 -> 249;
            case 229 -> 151;
            case 230 -> 32;
            case 231 -> 70;
            case 232 -> 95;
            case 233 -> 91;
            case 234 -> 173;
            case 235 -> 204;
            case 236 -> 243;
            case 237 -> 128;
            case 238 -> 115;
            case 239 -> 163;
            case 240 -> 61;
            case 241 -> 251;
            case 242 -> 31;
            case 243 -> 24;
            case 244 -> 182;
            case 245 -> 175;
            case 246 -> 105;
            case 247 -> 83;
            case 248 -> 19;
            case 249 -> 140;
            case 250 -> 166;
            case 251 -> 154;
            case 252 -> 34;
            case 253 -> 15;
            case 254 -> 42;
            default -> 232;
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

   /* ===== PhaseA RET2: jar-exact members restored from bytecode ===== */

    public final String c(@NotNull BlockPos blockPos, @NotNull Vec3 vec3) {
        String string;
        String string2;
        int n;
        int n2;
        int n3;
        int n4;
        PXEvMid illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
        block9: {
            block8: {
                BlockPos blockPos2;
                LocalPlayer localPlayer;
                lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
                block7: {
                    block6: {
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
                        Intrinsics.checkNotNullParameter((Object)blockPos, (String)"pos");
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2;
                        try {
                            try {
                                Intrinsics.checkNotNullParameter((Object)vec3, (String)"from");
                                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block6;
                                localPlayer = this.a().player;
                                if (localPlayer != null) break block7;
                            }
                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                            }
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                        }
                    }
                    return "no player";
                }
                LocalPlayer localPlayer2 = localPlayer;
                Vec3 vec32 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((Entity)localPlayer2);
                Vec3 vec33 = localPlayer2.getEyePosition();
                Intrinsics.checkNotNullExpressionValue((Object)vec33, (String)"getEyePosition(...)");
                Vec3 vec34 = vec33;
                Vec3 vec35 = Vec3.atCenterOf((Vec3i)((Vec3i)blockPos));
                Intrinsics.checkNotNullExpressionValue((Object)vec35, (String)"atCenterOf(...)");
                illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = this.a(vec34, vec35);
                Vec3 vec36 = vec32.add(0.0, 1.27, 0.0);
                Intrinsics.checkNotNullExpressionValue((Object)vec36, (String)"add(...)");
                Vec3 vec37 = vec36;
                n4 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(blockPos, vec37, 0.0, 4, null);
                n3 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d(blockPos, vec37, 0.025);
                Vec3 vec38 = vec32.add(0.0, 1.62, 0.0);
                Intrinsics.checkNotNullExpressionValue((Object)vec38, (String)"add(...)");
                n2 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(blockPos, vec38, 0.0, 4, null);
                n = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(blockPos, vec34, 0.0, 4, null);
                String string3 = "%.2f";
                Object[] objectArray = new Object[]{vec34.y};
                try {
                    String string4 = String.format(string3, Arrays.copyOf(objectArray, objectArray.length));
                    string2 = string4;
                    Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"format(...)");
                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null || (blockPos2 = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b()) == null) break block8;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                }
                BlockPos blockPos3 = blockPos2;
                String string5 = string2;
                int n5 = n;
                int n6 = n2;
                int n7 = n3;
                int n8 = n4;
                boolean bl = false;
                String string6 = blockPos3.getX() + "," + blockPos3.getY() + "," + blockPos3.getZ();
                n4 = n8;
                n3 = n7;
                n2 = n6;
                n = n5;
                string2 = string5;
                string = string6;
                break block9;
            }
            string = null;
        }
        int n9 = blockPos.getZ();
        int n10 = blockPos.getY();
        int n11 = blockPos.getX();
        String string7 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.c(illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c());
        String string8 = string;
        String string9 = string2;
        int n12 = n;
        int n13 = n2;
        int n14 = n3;
        int n15 = n4;
        return "vis127=" + n15 + " fine127=" + n14 + " vis162=" + n13 + " visReal=" + n12 + " realEyeY=" + string9 + " ctrHit=" + string8 + "/" + string7 + " tgt=" + n11 + "," + n10 + "," + n9;
    }

    private static final int d(BlockPos blockPos, Vec3 vec3, double d) {
        int n;
        block6: {
            int n2 = 0;
            Iterator<Vec3> iterator = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(blockPos, vec3, d).iterator();
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
            block4: while (true) {
                boolean bl = iterator.hasNext();
                while (bl) {
                    block7: {
                        Vec3 vec32 = iterator.next();
                        PXEvMid illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(vec3, vec32);
                        try {
                            try {
                                n = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a() ? 1 : 0;
                                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block6;
                                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block7;
                            }
                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                            }
                            if (n == 0) continue block4;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(noWhenBranchMatchedException);
                        }
                        bl = Intrinsics.areEqual((Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(), (Object)blockPos);
                    }
                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) continue;
                    if (!bl) continue block4;
                    ++n2;
                    if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray == null) break block4;
                    continue block4;
                }
                break;
            }
            n = n2;
        }
        return n;
    }

   public static PXEvMid a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, @NotNull BlockPos blockPos, @NotNull Vec3 vec3, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         vec3 = var0.j();
      }
      return var0.a(blockPos, vec3);
   }

   public static boolean a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, @NotNull BlockPos blockPos, @NotNull Vec3 vec3, int[] var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }
      return var0.a(blockPos, vec3, var3);
   }

   public final boolean a(@NotNull BlockPos pos, @NotNull Vec3 from, @NotNull Vec3 point) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      Intrinsics.checkNotNullParameter(from, "from");
      Intrinsics.checkNotNullParameter(point, "point");
      double var4 = this.i();
      if (var4 <= 0.0) {
         return false;
      } else if (Intrinsics.areEqual(from, Vec3.ZERO)) {
         return false;
      } else {
         PXEvMid var5 = this.a(from, point);
         if (!var5.a() || !Intrinsics.areEqual(var5.b(), pos)) {
            return false;
         } else {
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(from, point);
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var7 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var6.a(), var6.b());
            PXEvMid var8 = this.a(from, var7.a(), var7.b(), var4);
            return var8.a() && Intrinsics.areEqual(var8.b(), pos);
         }
      }
   }

   static List a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, @NotNull BlockPos blockPos, @NotNull Vec3 vec3, double var3, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = 0.0667;
      }
      return var0.b(blockPos, vec3, var3);
   }

   public static PXEvMid a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, float var1, float var2, double var3, boolean var5, int var6, Object var7) {
      if ((var6 & 8) != 0) {
         var5 = false;
      }
      return var0.a(var1, var2, var3, var5);
   }

   public static boolean b(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, @NotNull BlockPos blockPos, @NotNull Vec3 vec3, double var3, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = 0.3;
      }
      return var0.c(blockPos, vec3, var3);
   }

   public static List a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, int var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = 6;
      }
      return var0.b(var1);
   }

   static int a(@NotNull BlockPos blockPos, @NotNull Vec3 vec3, double var2, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var2 = 0.0667;
      }
      return d(blockPos, vec3, var2);
   }

   private static final String c(@NotNull BlockState blockState) {
      Block var1 = null;
      if (blockState != null) {
         var1 = blockState.getBlock();
      }
      String var2 = null;
      if (var1 != null) {
         var2 = BuiltInRegistries.BLOCK.getKey(var1).getPath();
      }
      return var2 != null ? var2 : "?";
   }

   public static final double a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, @NotNull Vec3 vec3, @NotNull BlockPos blockPos) {
      return var0.a(vec3, blockPos);
   }

   public final boolean c(@NotNull BlockPos blockPos, @NotNull Vec3 playerPos, double var3) {
      Intrinsics.checkNotNullParameter(blockPos, "pos");
      Intrinsics.checkNotNullParameter(playerPos, "playerPos");
      double var5 = (double)blockPos.getX() + 0.5;
      double var7 = (double)blockPos.getZ() + 0.5;
      if (playerPos.x < var5 - var3) {
         return false;
      } else if (playerPos.x >= var5 + var3) {
         return false;
      } else if (playerPos.z < var7 - var3) {
         return false;
      } else if (playerPos.z >= var7 + var3) {
         return false;
      } else if (Intrinsics.areEqual(BlockPos.containing(playerPos.x, playerPos.y - 0.01, playerPos.z), blockPos)) {
         return true;
      } else if (Intrinsics.areEqual(BlockPos.containing(playerPos.x, playerPos.y - 0.51, playerPos.z), blockPos)) {
         return true;
      } else {
         return Math.abs(this.c(blockPos) - playerPos.y) <= 0.65;
      }
   }

   /* ===== end PhaseA RET2 insert ===== */
   public static final class PXEvMid {
      @NotNull
      public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final BlockPos IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final BlockState lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private Vec3 IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public PXEvMid(
         boolean var1, @Nullable BlockPos var2, @Nullable BlockState var3
      ) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      }

      public final boolean a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos b() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockState c() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final Vec3 d() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void a(@Nullable Vec3 var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      public final int e() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void a(int var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      public final boolean f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockState h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a(
         boolean var1, @Nullable BlockPos var2, @Nullable BlockState var3
      ) {
         return new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 29953;
         BlockState var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         BlockPos var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = -12747;
         short var10002 = 29952;
         short var10003 = 30301;
         short var10004 = 29955;
         short var10005 = -1393;
         return "EtherPos(succeeded=" + var3 + ", pos=" + var2 + ", state=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
         int var4;
         int var6;
         label25: {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
            int var2 = Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var1 = var10000;
            var4 = var2 * 31;
            BlockPos var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var6 = 0;
                  break label25;
               }

               var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var6 = var10001.hashCode();
         }

         int var3 = var4 + var6;
         var4 = var3 * 31;
         BlockState var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               return var4 + 0;
            }

            var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return var4 + var7.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid
            )) {
               return false;
            }

            var10000 = var1;
         }

         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var3 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)var10000;
         boolean var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 != null) {
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
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
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "-»ÛîÏÔ#ü\u0018\n]\u009c\u0083pUuý$è\u0006Doª û;\b\u0087@Ñ^åÕ\u001d2";
         int var4 = "-»ÛîÏÔ#ü\u0018\n]\u009c\u0083pUuý$è\u0006Doª û;\b\u0087@Ñ^åÕ\u001d2".length();
         char var1 = 19;
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
                     case 0 -> 15;
                     case 1 -> 49;
                     case 2 -> 21;
                     case 3 -> 47;
                     case 4 -> 14;
                     case 5 -> 122;
                     default -> 71;
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
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid(
                  false, null, null
               );
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 29953) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 32;
               case 1 -> 73;
               case 2 -> 248;
               case 3 -> 156;
               case 4 -> 235;
               case 5 -> 36;
               case 6 -> 86;
               case 7 -> 180;
               case 8 -> 247;
               case 9 -> 238;
               case 10 -> 190;
               case 11 -> 209;
               case 12 -> 208;
               case 13 -> 249;
               case 14 -> 50;
               case 15 -> 13;
               case 16 -> 125;
               case 17 -> 56;
               case 18 -> 152;
               case 19 -> 104;
               case 20 -> 140;
               case 21 -> 26;
               case 22 -> 202;
               case 23 -> 177;
               case 24 -> 161;
               case 25 -> 226;
               case 26 -> 217;
               case 27 -> 44;
               case 28 -> 136;
               case 29 -> 43;
               case 30 -> 126;
               case 31 -> 24;
               case 32 -> 216;
               case 33 -> 66;
               case 34 -> 150;
               case 35 -> 149;
               case 36 -> 147;
               case 37 -> 100;
               case 38 -> 27;
               case 39 -> 39;
               case 40 -> 89;
               case 41 -> 164;
               case 42 -> 2;
               case 43 -> 178;
               case 44 -> 107;
               case 45 -> 135;
               case 46 -> 21;
               case 47 -> 241;
               case 48 -> 229;
               case 49 -> 243;
               case 50 -> 153;
               case 51 -> 108;
               case 52 -> 84;
               case 53 -> 155;
               case 54 -> 223;
               case 55 -> 37;
               case 56 -> 20;
               case 57 -> 174;
               case 58 -> 151;
               case 59 -> 144;
               case 60 -> 148;
               case 61 -> 181;
               case 62 -> 130;
               case 63 -> 145;
               case 64 -> 61;
               case 65 -> 49;
               case 66 -> 213;
               case 67 -> 163;
               case 68 -> 109;
               case 69 -> 40;
               case 70 -> 188;
               case 71 -> 224;
               case 72 -> 179;
               case 73 -> 154;
               case 74 -> 4;
               case 75 -> 69;
               case 76 -> 47;
               case 77 -> 239;
               case 78 -> 33;
               case 79 -> 30;
               case 80 -> 182;
               case 81 -> 141;
               case 82 -> 19;
               case 83 -> 95;
               case 84 -> 206;
               case 85 -> 53;
               case 86 -> 29;
               case 87 -> 129;
               case 88 -> 110;
               case 89 -> 159;
               case 90 -> 72;
               case 91 -> 79;
               case 92 -> 255;
               case 93 -> 48;
               case 94 -> 251;
               case 95 -> 185;
               case 96 -> 42;
               case 97 -> 121;
               case 98 -> 214;
               case 99 -> 63;
               case 100 -> 38;
               case 101 -> 189;
               case 102 -> 222;
               case 103 -> 254;
               case 104 -> 196;
               case 105 -> 186;
               case 106 -> 81;
               case 107 -> 160;
               case 108 -> 15;
               case 109 -> 231;
               case 110 -> 14;
               case 111 -> 71;
               case 112 -> 87;
               case 113 -> 245;
               case 114 -> 192;
               case 115 -> 168;
               case 116 -> 220;
               case 117 -> 96;
               case 118 -> 237;
               case 119 -> 195;
               case 120 -> 124;
               case 121 -> 54;
               case 122 -> 82;
               case 123 -> 64;
               case 124 -> 211;
               case 125 -> 99;
               case 126 -> 88;
               case 127 -> 0;
               case 128 -> 22;
               case 129 -> 80;
               case 130 -> 1;
               case 131 -> 28;
               case 132 -> 250;
               case 133 -> 133;
               case 134 -> 92;
               case 135 -> 201;
               case 136 -> 10;
               case 137 -> 157;
               case 138 -> 219;
               case 139 -> 183;
               case 140 -> 23;
               case 141 -> 103;
               case 142 -> 113;
               case 143 -> 173;
               case 144 -> 68;
               case 145 -> 215;
               case 146 -> 240;
               case 147 -> 122;
               case 148 -> 234;
               case 149 -> 191;
               case 150 -> 232;
               case 151 -> 199;
               case 152 -> 128;
               case 153 -> 78;
               case 154 -> 253;
               case 155 -> 6;
               case 156 -> 58;
               case 157 -> 70;
               case 158 -> 175;
               case 159 -> 41;
               case 160 -> 16;
               case 161 -> 123;
               case 162 -> 3;
               case 163 -> 165;
               case 164 -> 194;
               case 165 -> 52;
               case 166 -> 205;
               case 167 -> 228;
               case 168 -> 62;
               case 169 -> 119;
               case 170 -> 115;
               case 171 -> 116;
               case 172 -> 112;
               case 173 -> 167;
               case 174 -> 212;
               case 175 -> 85;
               case 176 -> 170;
               case 177 -> 244;
               case 178 -> 75;
               case 179 -> 138;
               case 180 -> 18;
               case 181 -> 142;
               case 182 -> 65;
               case 183 -> 93;
               case 184 -> 233;
               case 185 -> 98;
               case 186 -> 197;
               case 187 -> 11;
               case 188 -> 246;
               case 189 -> 46;
               case 190 -> 12;
               case 191 -> 91;
               case 192 -> 77;
               case 193 -> 117;
               case 194 -> 7;
               case 195 -> 94;
               case 196 -> 158;
               case 197 -> 207;
               case 198 -> 227;
               case 199 -> 74;
               case 200 -> 139;
               case 201 -> 132;
               case 202 -> 60;
               case 203 -> 166;
               case 204 -> 137;
               case 205 -> 59;
               case 206 -> 218;
               case 207 -> 198;
               case 208 -> 146;
               case 209 -> 169;
               case 210 -> 34;
               case 211 -> 97;
               case 212 -> 67;
               case 213 -> 57;
               case 214 -> 230;
               case 215 -> 17;
               case 216 -> 221;
               case 217 -> 106;
               case 218 -> 184;
               case 219 -> 127;
               case 220 -> 5;
               case 221 -> 171;
               case 222 -> 25;
               case 223 -> 225;
               case 224 -> 83;
               case 225 -> 187;
               case 226 -> 252;
               case 227 -> 45;
               case 228 -> 102;
               case 229 -> 203;
               case 230 -> 143;
               case 231 -> 31;
               case 232 -> 90;
               case 233 -> 131;
               case 234 -> 105;
               case 235 -> 200;
               case 236 -> 114;
               case 237 -> 118;
               case 238 -> 236;
               case 239 -> 55;
               case 240 -> 51;
               case 241 -> 176;
               case 242 -> 172;
               case 243 -> 134;
               case 244 -> 9;
               case 245 -> 242;
               case 246 -> 162;
               case 247 -> 204;
               case 248 -> 35;
               case 249 -> 193;
               case 250 -> 101;
               case 251 -> 120;
               case 252 -> 8;
               case 253 -> 111;
               case 254 -> 76;
               default -> 210;
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

      public static final PXEvMid i() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public static PXEvMid a(PXEvMid var0, boolean var1, BlockPos var2, BlockState var3, int var4, Object var5) {
         // PX-FIX default-bridge prologue simplified: the jar also null-checks the obfuscator's
         // static array (arr = <sibling>.h()) before each mask assignment; that array is built in
         // <clinit> and is never null, so the three mask tests below are the observable behaviour.
         if ((var4 & 1) != 0) {
            var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }
         if ((var4 & 2) != 0) {
            var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }
         if ((var4 & 4) != 0) {
            var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }
         return var0.a(var1, var2, var3);
      }

      public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
         public static net.minecraft.core.Direction[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

         private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         }

         @NotNull
         public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid a() {
            return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }
      }
   }
}
