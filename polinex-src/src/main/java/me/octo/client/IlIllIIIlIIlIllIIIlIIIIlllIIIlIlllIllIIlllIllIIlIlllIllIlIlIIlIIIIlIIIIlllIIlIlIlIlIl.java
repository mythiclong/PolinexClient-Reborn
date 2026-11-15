package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl {
    public static <T> T a(Object p0) { return null; } // PX-FIX mr3
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private ArrayList<BlockPos> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private HashSet<BlockPos> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private Set<Integer> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final double lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private List<? extends Vec3> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private Vec3 lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private BlockPos IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final HashMap<BlockPos, Long> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @Nullable
   private Vec3 llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @Nullable
   private Vec3 lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final ArrayList<Vec3> llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private long lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private final double IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private final double IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private final double llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static int[] lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] a;
   private static String[] b;

   public IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -11227;
      short var10004 = 28843;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new ArrayList<>();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashSet<>();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new LinkedHashSet<>();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 15.0;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.emptyList();
      Vec3 var1 = Vec3.ZERO;
      var10003 = -11207;
      var10004 = -17524;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
      BlockPos var2 = BlockPos.ZERO;
      var10003 = -11219;
      var10004 = 2793;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var2;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new HashMap<>();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new ArrayList<>();
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = 1.62;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = 1.27;
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = 4.5;
   }

   public final boolean a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(boolean var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final boolean b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void b(boolean var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   @NotNull
   public final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll c() {
      Integer var2;
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      label18: {
         int[] var1 = g();
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
            ArrayList var10004 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.b();
            if (var10004 != null) {
               var2 = var10004.size();
               if (var1 != null) {
                  break label18;
               }
            }
         }

         var2 = null;
      }

      var10000 = new IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         var2,
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null
            ? this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b()
            : null,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.size(),
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.size(),
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.size(),
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
         this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
         this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll,
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.size(),
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.size()
      );
      return var10000;
   }

   private final boolean a(BlockPos var1) { boolean var4 = false; // PX-FIX hoist
        
      int[] var2 = g();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         BlockState var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level.getBlockState(var1);
         if (var10000 != null) {
            BlockState var3 = var10000;
             var4 = var3.is(Blocks.STRIPPED_SPRUCE_WOOD);
            if (var2 != null) {
               if (!var4) {
                  boolean var5 = var3.is(Blocks.STRIPPED_MANGROVE_WOOD);
                  if (var2 == null) {
                     return var5;
                  }

                  if (!var5) {
                     return false;
                  }
               }

               var4 = true;
            }

            return var4;
         }
      }

      return false;
   }

   private final boolean b(BlockPos var1) {
      int[] var2 = g();
      boolean var10000 = this.a(var1);
      if (var2 != null) {
         if (!var10000) {
            var10000 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.contains(var1);
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.containsKey(var1);
               if (var2 == null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final boolean a(BlockPos var1, Vec3 var2) { AABB var4 = null; // PX-FIX hoist
        
      boolean var13;
      int[] var3;
      Collection var12;
      int[] var10000 = g();
       var4 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .f(var1);
      var3 = var10000;
      var var5 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var4, var2);
      boolean var6 = false;
      var12 = var5;
      label79:
      if (var3 != null) {
         if (var5 instanceof Collection) {
            var12 = (Collection)var5;
            if (var3 == null) {
               break label79;
            }

            if (var12.isEmpty()) {
               return false;
            }
         }

         var12 = var5;
      }

      Iterator var7 = var12.iterator();

      label70:
      while (true) {
         if (!var7.hasNext()) {
            var13 = false;
            break;
         }

         Object var8 = var7.next();
         Vec3 var9 = (Vec3)var8;
         boolean var10 = false;
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var11 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
            me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var9,
            this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
            null,
            var2);
         BlockPos var14 = var11.c();
         if (var3 != null) {
            var13 = Intrinsics.areEqual(var14, var1);
         } else {
            boolean var15;
            if (var14 != null) {
               var15 = this.b(var11.c());
               if (var3 != null) {
                  ;
               }
            } else {
               var15 = false;
            }

            if (!var15) {
               continue;
            }

            var13 = true;
            if (var3 != null) {
               break;
            }
         }

         do {
            while (!var13) {
               boolean var16;
               if (var11.c() != null) {
                  var16 = this.b(var11.c());
                  if (var3 != null) {
                     ;
                  }
               } else {
                  var16 = false;
               }

               if (!var16) {
                  continue label70;
               }

               var13 = true;
               if (var3 != null) {
                  return true;
               }
            }

            if (false) {
               continue label70;
            }

            var13 = true;
         } while (var3 == null);

         return true;
      }

      return var13;
   }

   private final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var1, Vec3 var2
   ) { AABB var4 = null; // PX-FIX hoist
        
      boolean var19;
       var4 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .f(var1.b());
      List var5 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var4, var2);
      int[] var10000 = g();
      double var6 = Double.MAX_VALUE;
      int[] var3 = var10000;
      boolean var8 = false;
      Vec3 var9 = null;
      Iterator var10 = var5.iterator();

      while (true) {
         if (var10.hasNext()) {
            Vec3 var11 = (Vec3)var10.next();
            me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var12 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var11,
               this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
               null,
               var2);
            var19 = Intrinsics.areEqual(var12.c(), var1.b());
            if (var3 == null) {
               break;
            }

            label41:
            if (var3 != null) {
               label48:
               if (!var19) {
                  if (var12.c() != null) {
                     var19 = this.b(var12.c());
                     if (var3 == null) {
                        break label41;
                     }

                     if (var19) {
                        break label48;
                     }
                  }

                  var19 = false;
                  break label41;
               }

               var19 = true;
            }

            boolean var13 = var19;
            boolean var20 = var13;
            if (var3 != null) {
               if (!var13) {
                  continue;
               }

               var20 = true;
            }

            var8 = var20;
            double var14 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var2, var11);
            double var21 = var14;
            if (var3 != null) {
               if (!(var14 < var6)) {
                  continue;
               }

               var21 = var14;
            }

            var6 = var21;
            var9 = var11;
            if (var3 != null) {
               continue;
            }
         }

         var19 = var8;
         break;
      }

      if (!var19) {
         double var16 = RangesKt.coerceIn(var2.x, var4.minX, var4.maxX);
         double var17 = RangesKt.coerceIn(var2.y, var4.minY, var4.maxY);
         double var18 = RangesKt.coerceIn(var2.z, var4.minZ, var4.maxZ);
         var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var2, new Vec3(var16, var17, var18));
      }

      return new IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var8, var6, var9
      );
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) { ClientLevel var4 = null; // PX-FIX hoist
        
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var47;
      me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var49;
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var50;
      BlockPos var55;
      byte var56;
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var59;
      int var61;
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var62;
      int[] var10000 = g();
      short var10002 = -11222;
      short var10003 = -5983;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var38 = this;
      if (var2 != null) {
         if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return;
         }

         var38 = this;
      }

      if (var38.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player != null) {
         LocalPlayer var3 = var38.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
         if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
             var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
            if (var2 != null) {
               if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
                  Vec3 var5 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);

                  label328:
                  for (Object var40 : var4.entitiesForRendering()) {
                     var10002 = -11203;
                     var10003 = 4397;
                     Intrinsics.checkNotNullExpressionValue(var40, "next(...)");
                     Entity var7 = (Entity)var40;

                     while (true) {
                        int var41 = ((var7 instanceof ArmorStand) ? 1 : 0);
                        if (var2 != null) {
                           if (var41 == 0) {
                              break;
                           }

                           double var74;
                           var41 = (
                                    var74 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                             var7
                                          )
                                          .distanceTo(var5)
                                       - 3.0
                                 )
                                 == 0.0
                              ? 0
                              : (var74 < 0.0 ? -1 : 1);
                        }

                        if (var2 != null) {
                           if (var41 > 0) {
                              break;
                           }

                           var41 = ((ArmorStand)var7).getId();
                        }

                        int var8 = var41;
                        int var42 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.contains(var8) ? 1 : 0;
                        if (var2 != null) {
                           if (var42 != 0) {
                              break;
                           }

                           var42 = var7.tickCount;
                        }

                        if (var42 != 0) {
                           break;
                        }

                        this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
                        this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.add(var8);
                        if (var2 != null) {
                           break label328;
                        }
                     }
                  }
               }

               CollectionsKt.removeAll(
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  (t) -> a((BlockPos)t)
               );
            }

            long var19 = System.currentTimeMillis();
            Set var43 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.entrySet();
            var10002 = -11206;
            var10003 = -27325;
            Intrinsics.checkNotNullExpressionValue(var43, "<get-entries>(...)");
            CollectionsKt.removeAll(var43, (kotlin.jvm.functions.Function1)(IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl::a));
            IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var44 = this;
            if (var2 != null) {
               if (((java.util.function.Supplier<Boolean>)(() -> { this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.a(1500); return false; })).get()) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.e(
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  );
                  this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.clear();
                  this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.f();
               }

               var44 = this;
            }

            label366: {
               label277:
               if (var44.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
                  me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var9 = var44.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  boolean var10 = false;
                  boolean var46 = var4.getBlockState(var9.b()).isAir();
                  if (var2 != null) {
                     if (var46) {
                        this.c(var9.b());
                        List var11 = CollectionsKt.toList(
                           llIIlllIIllIIIIllIlIlIllllIlIIIIllIIllllIlIlIlIIIlIlIIlIlIlIlIIIIllIIIlIlIlIllIIlIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                              .a()
                              .ah()
                        );
                        long var12 = System.currentTimeMillis() + 1000L;
                        Iterator var14 = var11.iterator();

                        while (true) {
                           if (var14.hasNext()) {
                              BlockPos var15 = (BlockPos)var14.next();
                              if (var2 == null) {
                                 break;
                              }

                              if (var2 != null) {
                                 if (Intrinsics.areEqual(var15, var9.b())) {
                                    continue;
                                 }

                                 this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.put(var15, var12);
                              }

                              if (var2 != null) {
                                 continue;
                              }
                           }

                           this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
                           this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
                           this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
                           this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
                           this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
                           break;
                        }

                        if (var2 != null) {
                           break label277;
                        }
                     }

                     var47 = this;
                     if (var2 == null) {
                        break label366;
                     }

                     var46 = ((java.util.function.Supplier<Boolean>)(() -> { this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a(1500); return false; })).get();
                  }

                  if (var46) {
                     var47 = this;
                     break label366;
                  }
               }

               label350: {
                  label360: {
                     IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var48 = this;
                     if (var2 != null) {
                        var49 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
                           break label360;
                        }

                        var48 = this;
                     }

                     IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var23 = var48;
                     boolean var25 = false;
                     var50 = var23;
                     if (var2 == null) {
                        break label350;
                     }

                     me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var51 = var23.e();
                     if (var51 != null) {
                        me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var27 = var51;
                        boolean var31 = false;
                        var23.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var27;
                        var23.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
                        var23.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
                        var49 = var27;
                        if (var2 == null) {
                           break label360;
                        }

                        if (var27 != null) {
                           break label360;
                        }
                     }

                     var50 = var23;
                     break label350;
                  }

                  me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var20 = var49;
                  if (var2 != null && this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var21 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     int var52 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .K();
                     if (var2 != null) {
                        if (var52 != var21.b()) {
                           me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .b(var21.b());
                           return;
                        }

                        me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var53 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        Vec3 var10001 = Vec3.atCenterOf(var20.b());
                        var10003 = -11214;
                        short var10004 = -10329;
                        Intrinsics.checkNotNullExpressionValue(var10001, "atCenterOf(...)");
                        double var75;
                        var52 = (var75 = var53.b(var10001, true) - this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)
                              == 0.0
                           ? 0
                           : (var75 < 0.0 ? -1 : 1);
                     }

                     if (var52 > 0) {
                        this.d();
                        return;
                     }

                     Vec3 var22 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
                     Vec3 var24 = new Vec3(
                        var22.x, var22.y + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, var22.z
                     );
                     Vec3 var26 = new Vec3(
                        var22.x,
                        var22.y
                           + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
                           + me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .o(),
                        var22.z
                     );
                     me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var28 = this.c(var20);
                     if (var2 != null) {
                        if (var28 != null) {
                           me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var60 = var28;
                           if (var2 != null) {
                              if (!Intrinsics.areEqual(var28.b(), var20.b())) {
                                 this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var28;
                                 this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
                                 this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
                                 this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
                              }

                              var60 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           }

                           if (var60 == null) {
                              return;
                           }

                           byte var16;
                           byte var17;
                           me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var30;
                           IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var34;
                           IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var37;
                           var30 = var60;
                           var34 = this.a(var30, var24);
                           var37 = this.a(var30, var26);
                           var16 = (byte)(var34.d() ? 1 : 0);
                           var17 = (byte)(var37.d() ? 1 : 0);
                           var61 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ? 1 : 0;
                           label207:
                           if (var2 != null) {
                              if (this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
                                 long var76;
                                 var61 = (var76 = var19 - this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll - 450L)
                                       == 0L
                                    ? 0
                                    : (var76 < 0L ? -1 : 1);
                                 if (var2 == null) {
                                    break label207;
                                 }

                                 if (var61 > 0) {
                                    this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
                                 }
                              }

                              var61 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ? 1 : 0;
                           }

                           label200:
                           if (var2 != null) {
                              if (var61 == 0) {
                                 var61 = var16;
                                 if (var2 == null) {
                                    break label200;
                                 }

                                 if (var16 == 0) {
                                    var61 = var17;
                                    if (var2 == null) {
                                       break label200;
                                    }

                                    if (var17 != 0) {
                                       long var77;
                                       var61 = (
                                                var77 = var19
                                                   - this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll
                                                   - 550L
                                             )
                                             == 0L
                                          ? 0
                                          : (var77 < 0L ? -1 : 1);
                                       if (var2 == null) {
                                          break label200;
                                       }

                                       if (var61 > 0) {
                                          this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = true;
                                          this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var19;
                                       }
                                    }
                                 }
                              }

                              var61 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ? 1 : 0;
                           }

                           label354: {
                              label186:
                              if (var2 != null) {
                                 if (var61 != 0) {
                                    var61 = var17;
                                    if (var2 == null) {
                                       break label186;
                                    }

                                    if (var17 != 0) {
                                       var62 = var37;
                                       break label354;
                                    }
                                 }

                                 var61 = var16;
                              }

                              if (var2 != null) {
                                 if (var61 != 0) {
                                    var62 = var34;
                                    break label354;
                                 }

                                 var61 = var17;
                              }

                              if (var61 != 0) {
                                 var62 = var37;
                              } else {
                                 Vec3 var68 = var3.getEyePosition();
                                 short var72 = -11220;
                                 short var10005 = -3494;
                                 Intrinsics.checkNotNullExpressionValue(var68, "getEyePosition(...)");
                                 var62 = this.a(var30, var68);
                              }
                           }

                           IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var18;
                           byte var73;
                           label172: {
                              label355: {
                                 var18 = var62;
                                 var73 = (byte)(this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ? 1 : 0);
                                 if (var2 != null) {
                                    if (!this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
                                       break label355;
                                    }

                                    var73 = var17;
                                 }

                                 if (var2 == null) {
                                    break label172;
                                 }

                                 if (var73 != 0) {
                                    var73 = 1;
                                    break label172;
                                 }
                              }

                              var73 = 0;
                           }

                           this.a(var30, var18, true, var73 != 0);
                           this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
                           this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
                           this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
                           return;
                        }

                        this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
                     }

                     label244: {
                        if (var2 != null) {
                           BlockHitResult var54 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .I();
                           if (var54 != null) {
                              var55 = var54.getBlockPos();
                              break label244;
                           }
                        }

                        var55 = null;
                     }

                     label238: {
                        BlockPos var29 = var55;
                        if (var29 != null) {
                           var56 = (byte)(this.a(var29) ? 1 : 0);
                           if (var2 == null) {
                              break label238;
                           }

                           if (var56 != 0) {
                              var56 = 1;
                              break label238;
                           }
                        }

                        var56 = 0;
                     }

                     byte var33 = var56;
                     int var57 = var33;
                     if (var2 != null) {
                        if (var33 != 0) {
                           short var63 = -11201;
                           var10002 = 6506;
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("attack", true);
                           this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
                           this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
                           if (var2 != null) {
                              return;
                           }
                        }

                        var57 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                     }

                     me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var64;
                     label357: {
                        int var35 = var57;
                        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var35 + 1;
                        int var58 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                        if (var2 != null) {
                           if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl > 40) {
                              this.d();
                              return;
                           }

                           var59 = this;
                           var64 = var20;
                           if (var2 == null) {
                              break label357;
                           }

                           byte var36 = ((byte)((this.a(var20)) ? 1 : 0));
                           var58 = var36;
                        }

                        if (var58 != 0) {
                           return;
                        }

                        var59 = this;
                        var64 = var20;
                     }

                     var59.d(var64.b());
                     return;
                  }

                  return;
               }

               IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var13 = var50;
               boolean var32 = false;
               var13.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
               return;
            }

            var47.d();
         }
      }
   }

   private final void c(BlockPos var1) {
      int[] var10000 = g();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.add(var1);
      int[] var2 = var10000;

      while (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.size() > 50) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.remove(0);
         if (var2 == null) {
            break;
         }
      }
   }

   private final void a(
      me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var1,
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2,
      boolean var3,
      boolean var4
   ) {
      Vec3 var20;
      boolean var21;
      boolean var23;
      Vec3 var24;
      int[] var5;
      short var29;
      int[] var10000 = g();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      var5 = var10000;
      boolean var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .P();
      short var10001 = -11202;
      var29 = 11550;
      var29 =((short)(( var3) ? 1 : 0));
      label114:
      if (var5 != null) {
         if (!var3) {
            var29 =((short)(( var6) ? 1 : 0));
            if (var5 == null) {
               break label114;
            }

            if (!var6) {
               var29 = 0;
               break label114;
            }
         }

         var29 = 1;
      }

      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", var29 != 0);
      var10001 = -11218;
      var29 = -31707;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("jump", var4);
      if (var5 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player != null) {
         Vec3 var19 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player.getEyePosition();
         if (var19 != null) {
            Vec3 var7;
            label101: {
               var7 = var19;
               var20 = var2.c();
               Vec3 var26 = var20;
               if (var5 != null) {
                  if (var20 != null) {
                     break label101;
                  }

                  var20 = Vec3.atCenterOf(var1.b());
                  var26 = var20;
               }

               var29 = -11214;
               short var10003 = -10329;
               Intrinsics.checkNotNullExpressionValue(var26, "atCenterOf(...)");
            }

            Vec3 var8;
            label95: {
               var8 = var20;
               if (var2.c() != null) {
                  me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var9 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                     me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     var2.c(),
                     this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
                     null,
                     var7);
                  var21 = Intrinsics.areEqual(var9.c(), var1.b());
                  if (var5 == null) {
                     break label95;
                  }

                  label92:
                  if (!var21) {
                     if (var9.c() != null) {
                        var21 = this.a(var9.c());
                        if (var5 == null) {
                           break label95;
                        }

                        if (var21) {
                           break label92;
                        }
                     }

                     AABB var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .f(var1.b());
                     Iterable var12 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var10, var7);
                     boolean var13 = false;
                     Iterator var14 = var12.iterator();

                     label84:
                     while (true) {
                        if (!var14.hasNext()) {
                           var10000 = null;
                           break;
                        }

                        Object var15 = var14.next();
                        var10000 = (int[])var15;

                        while (true) {
                           Vec3 var16 = (Vec3)(Object)var10000;
                           boolean var17 = false;
                           me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var18 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                              me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                              var16,
                              this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
                              null,
                              var7);
                           var23 = Intrinsics.areEqual(var18.c(), var1.b());
                           label70:
                           if (var5 != null) {
                              label77:
                              if (!var23) {
                                 if (var18.c() != null) {
                                    var23 = this.a(var18.c());
                                    if (var5 == null) {
                                       break label70;
                                    }

                                    if (var23) {
                                       break label77;
                                    }
                                 }

                                 var23 = false;
                                 break label70;
                              }

                              var23 = true;
                           }

                           if (!var23) {
                              break;
                           }

                           var10000 = (int[])var15;
                           if (var5 != null) {
                              break label84;
                           }
                        }
                     }

                     label59: {
                        Vec3 var11 = (Vec3)(Object)var10000;
                        var24 = var11;
                        Vec3 var27 = var11;
                        if (var5 != null) {
                           if (var11 != null) {
                              break label59;
                           }

                           var24 = Vec3.atCenterOf(var1.b());
                           var27 = var24;
                        }

                        var29 = -11214;
                        short var34 = -10329;
                        Intrinsics.checkNotNullExpressionValue(var27, "atCenterOf(...)");
                     }

                     var8 = var24;
                  }
               }

               var21 = me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .i();
            }

            if (!var21) {
               me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.a(var8);
            }

            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hitResult = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
               var1.b()
            );
            var10001 = -11226;
            var29 = 26062;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("attack", true);
            return;
         }
      }
   }

   private final boolean a(me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var1) { Vec3 var4 = null; // PX-FIX hoist
        
      Vec3 var13;
      BlockPos var15;
      int[] var10000 = g();
      Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      int[] var2 = var10000;
      if (var2 != null) {
         Vec3 var11 = this.b(var1);
         if (var11 != null) {
             var4 = var11;
            double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var3, var4);
            double var29;
            int var12 = (var29 = var5 - 0.3) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
            if (var2 != null) {
               if (var12 > 0) {
                  label53: {
                     Vec3 var7 = new Vec3(var4.x, var4.y + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, var4.z);
                     IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = this.a(
                        var1, var7
                     );
                     var13 = var8.c();
                     Vec3 var18 = var13;
                     if (var2 != null) {
                        if (var13 != null) {
                           break label53;
                        }

                        var13 = Vec3.atCenterOf(var1.b());
                        var18 = var13;
                     }

                     short var24 = -11214;
                     short var10003 = -10329;
                     Intrinsics.checkNotNullExpressionValue(var18, "atCenterOf(...)");
                  }

                  Vec3 var9 = var13;
                  if (var2 != null) {
                     if (!me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .i()) {
                        me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.a(var9);
                     }

                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        var3,
                        var4,
                        true,
                        0.0);
                     short var19 = -11217;
                     short var25 = 11348;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("sneak", true);
                     var19 = -11205;
                     var25 = 18973;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("jump", false);
                  }

                  label46: {
                     if (var2 != null) {
                        BlockHitResult var14 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .I();
                        if (var14 != null) {
                           var15 = var14.getBlockPos();
                           break label46;
                        }
                     }

                     var15 = null;
                  }

                  short var28;
                  label40: {
                     BlockPos var10 = var15;
                     short var21 = -11201;
                     var28 = 6506;
                     if (var10 != null) {
                        var28 = ((short)((this.a(var10)) ? 1 : 0));
                        if (var2 == null) {
                           break label40;
                        }

                        if ((var28 != 0)) {
                           var28 = 1;
                           break label40;
                        }
                     }

                     var28 = 0;
                  }

                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("attack", var28 != 0);
                  this.a(var3, var4);
                  return true;
               }

               this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               short var10001 = -11217;
               short var10002 = 11348;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sneak", true);
               var10001 = -11205;
               var10002 = 18973;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("jump", false);
               var10001 = -11201;
               var10002 = 6506;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("attack", false);
               var12 = 1;
            }

            return var12 != 0;
         }
      }

      return false;
   }

   private final Vec3 b(me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var1) { Vec3 var4 = null; // PX-FIX hoist
        
      IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var6;
      int[] var10000 = g();
      Vec3 var3 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      int[] var2 = var10000;
      Vec3 var5 = var3;
      if (var2 != null) {
         label29: {
            if (var3 != null) {
               var6 = this;
               if (var2 == null) {
                  break label29;
               }

               if (!((java.util.function.Supplier<Boolean>)(() -> { this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a(200); return false; })).get()) {
                  return var3;
               }
            }

            var6 = this;
         }

         var5 = var6.d(var1);
      }

       var4 = var5;
      Vec3 var7 = var4;
      if (var2 != null) {
         if (var4 != null) {
            this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var4;
            this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.f();
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
            this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
         }

         var7 = var4;
      }

      if (var7 == null) {
         var7 = var3;
      }

      return var7;
   }

   private final void a(Vec3 var1, Vec3 var2) { Vec3 var4 = null; // PX-FIX hoist
        
      int[] var3;
      int var5;
      label47: {
         label46: {
            int[] var10000 = g();
             var4 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            var3 = var10000;
            if (var3 != null) {
               if (var4 != null) {
                  double var6;
                  var5 = (
                           var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a(var1, var4)
                              - 0.15
                        )
                        == 0.0
                     ? 0
                     : (var6 < 0.0 ? -1 : 1);
                  if (var3 == null) {
                     break label47;
                  }

                  if (var5 <= 0) {
                     break label46;
                  }
               }

               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var1;
            }

            this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
         }

         var5 = ((java.util.function.Supplier<Integer>)(() -> { this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(800); return 0; })).get();
      }

      if (var3 != null) {
         if (var5 == 0) {
            return;
         }

         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.add(var2);
      }

      label29: {
         while (this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.size() > 10) {
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.remove(0);
            if (var3 == null) {
               break label29;
            }

            if (var3 == null) {
               break;
            }
         }

         this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
      }

      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
   }

   private final void d() {
      int[] var1 = g();
      if (var1 != null && this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
         me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var3 = false;
         this.c(var2.b());
      }

      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.clear();
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
   }

   private final double a(BlockPos var1, boolean var2, Vec3 var3, Vec3 var4) {
      int[] var5;
      Vec3 var6;
      double var7;
      double var9;
      double var19;
      label59: {
         int[] var10000 = g();
         Vec3 var10001 = Vec3.atCenterOf(var1);
         short var10003 = -11214;
         short var10004 = -10329;
         Intrinsics.checkNotNullExpressionValue(var10001, "atCenterOf(...)");
         var6 = var10001;
         var7 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var3, var6);
         var5 = var10000;
         var9 = var6.y - var4.y;
         double var20;
         int var17 = (var20 = var9 - 0.0) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
         if (var5 != null) {
            if (var17 <= 0) {
               var19 = -2.0;
               break label59;
            }

            double var21;
            var17 = (var21 = var9 - 2.0) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
         }

         double var10002;
         label60: {
            if (var5 != null) {
               if (var17 <= 0) {
                  var19 = var9 * 1.5;
                  break label59;
               }

               var19 = var9;
               var10002 = 4.0;
               if (var5 == null) {
                  break label60;
               }

               double var22;
               var17 = (var22 = var9 - 4.0) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
            }

            if (var17 <= 0) {
               var19 = var9 * 4.0;
               break label59;
            }

            var19 = var9;
            var10002 = 8.0;
         }

         var19 *= var10002;
      }

      int var16;
      var7 += var19;
      double var11 = Math.abs(var6.x - var4.x);
      double var13 = Math.abs(var6.z - var4.z);
      double var23;
      var16 = (var23 = var11 - 1.5) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
      label39:
      if (var5 != null) {
         if (var16 <= 0) {
            double var24;
            var16 = (var24 = var13 - 1.5) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
            if (var5 == null) {
               break label39;
            }

            if (var16 <= 0) {
               double var25;
               var16 = (var25 = var9 - 2.0) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
               if (var5 == null) {
                  break label39;
               }

               if (var16 > 0) {
                  var7 += 30.0 + (var9 - 2.0) * 5.0;
               }
            }
         }

         var16 =(( var2) ? 1 : 0);
      }

      if (var16 != 0) {
         var7 += 8.0;
      }

      return var7;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII c(
      me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var1
   ) { ClientLevel var4 = null; // PX-FIX hoist
        
      Pair var64;
      int[] var2 = g();
      if (var2 != null && this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
         me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
             var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
            Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            Vec3 var6 = new Vec3(var5.x, var5.y + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, var5.z);
            Vec3 var7 = new Vec3(
               var5.x,
               var5.y
                  + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
                  + me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .o(),
               var5.z
            );
            List var9 = var3.b();
            boolean var10 = false;
            Iterable var11 = var9;
            var var12 = new ArrayList();
            boolean var13 = false;
            Iterator var14 = var9.iterator();

            while (true) {
               if (var14.hasNext()) {
                  Object var15 = var14.next();
                  me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var16 = (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var15;
                  boolean var18 = false;
                  boolean var10000 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.contains(var16.b());
                  if (var2 == null) {
                     break;
                  }

                  label206: {
                     label224: {
                        if (var2 != null) {
                           if (var10000) {
                              break label224;
                           }

                           var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.contains(var16.b());
                        }

                        if (var2 != null) {
                           if (var10000) {
                              break label224;
                           }

                           var10000 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.containsKey(var16.b());
                        }

                        if (var2 != null) {
                           if (var10000) {
                              break label224;
                           }

                           var10000 = var4.getBlockState(var16.b()).isAir();
                        }

                        if (var2 == null) {
                           break label206;
                        }

                        if (!var10000) {
                           var10000 = true;
                           break label206;
                        }
                     }

                     var10000 = false;
                  }

                  if (!var10000) {
                     continue;
                  }

                  var12.add(var15);
                  if (var2 != null) {
                     continue;
                  }
               }

               var9 = var12;
               var10 = false;
               var11 = var9;
               var12 = new ArrayList();
               boolean var61 = false;
               break;
            }

            boolean var43 = false;

            for (Object var51 : var11) {
               boolean var21 = false;
               me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var22 = (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var51;
               boolean var23 = false;
               boolean var24 = this.a(var22, var6).d();
               if (var2 != null) {
                  boolean var62 = var24;
                  if (var2 != null) {
                     var62 = !var24 ? this.a(var22, var7).d() : false;
                  }

                  label226: {
                     label173: {
                        boolean var25 = var62;
                        var62 = var24;
                        if (var2 != null) {
                           if (var24) {
                              break label173;
                           }

                           var62 = var25;
                        }

                        if (!var62) {
                           var64 = null;
                           break label226;
                        }
                     }

                     var64 = new Pair(var22, !var24);
                  }

                  if (var64 != null) {
                     Pair var26 = var64;
                     boolean var27 = false;
                     var12.add(var26);
                  }

                  if (var2 != null) {
                     continue;
                  }
               }
               break;
            }

            List var8 = var12;
            Object var65 = var8;
            if (var2 != null) {
               if (var8.isEmpty()) {
                  return null;
               }

               var65 = var8;
            }

            Object var32 = var65;
            boolean var34 = false;
            Collection var37 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)var32, 10));
            boolean var40 = false;
            Object var44 = ((me.octo.client.PXDyn)var32).iterator();

            while (true) {
               if (((me.octo.client.PXDyn)var44).hasNext()) {
                  Object var47 = ((me.octo.client.PXDyn)var44).next();
                  var65 = var37;
                  Pair var52 = (Pair)var47;
                  if (var2 == null) {
                     break;
                  }

                  boolean var19 = false;
                  me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var58 = (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var52.component1();
                  boolean var60 = (Boolean)var52.component2();
                  var37.add(new Triple(var58, var60, this.a(var58.b(), var60, var6, var5)));
                  if (var2 != null) {
                     continue;
                  }
               }

               var65 = var37;
               break;
            }

            label227: {
               label228: {
                  var9 = (List)var65;
                  Iterable var36 = var9;
                  var13 = false;
                  var14 = var36.iterator();
                  boolean var67 = var14.hasNext();
                  if (var2 != null) {
                     if (!var67) {
                        var65 = null;
                        break label227;
                     }

                     var44 = var14.next();
                     var65 = var14;
                     if (var2 == null) {
                        break label228;
                     }

                     var67 = var14.hasNext();
                  }

                  if (!var67) {
                     var65 = var44;
                     break label227;
                  }

                  var65 = var44;
               }

               Triple var48 = (Triple)var65;
               boolean var53 = false;
               double var49 = ((Number)var48.getThird()).doubleValue();

               label138:
               while (true) {
                  Object var54 = var14.next();
                  Triple var56 = (Triple)var54;
                  boolean var59 = false;
                  double var57 = ((Number)var56.getThird()).doubleValue();
                  if (Double.compare(var49, var57) > 0) {
                     var44 = var54;
                     var49 = var57;
                  }

                  while (!var14.hasNext()) {
                     if (var2 != null) {
                        var65 = var44;
                        break label138;
                     }

                     var49 = var57;
                  }
               }
            }

            var65 = (Triple)var65;
            if ((Triple)var65 == null) {
               return null;
            } else {
               Triple var33 = (Triple)var65;
               Iterable var39 = var9;
               var14 = var39.iterator();

               label124:
               while (true) {
                  if (var14.hasNext()) {
                     Object var45 = var14.next();
                     Triple var50 = (Triple)var45;
                     boolean var55 = false;
                     var65 = var50.getFirst();

                     while (true) {
                        if (!Intrinsics.areEqual(
                           ((me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var65).b(), var1.b()
                        )) {
                           continue label124;
                        }

                        var65 = var45;
                        if (var2 != null) {
                           break label124;
                        }
                     }
                  }

                  var65 = null;
                  break;
               }

               Triple var35 = (Triple)var65;
               var65 = var35;
               if (var2 != null) {
                  if (var35 != null) {
                     var65 = (Number)var35.getThird();
                     if (var2 == null) {
                        return (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var65;
                     }

                     if ((Double)((me.octo.client.PXDyn)var65).doubleValue() - ((Number)var33.getThird()).doubleValue() < 4.0) {
                        return (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var35.getFirst();
                     }
                  }

                  var65 = var33.getFirst();
               }

               return (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var65;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private final void d(BlockPos var1) { boolean var4 = false; // PX-FIX hoist
        
      boolean var6;
      int[] var10000 = g();
      Vec3 var10001 = Vec3.atCenterOf(var1);
      short var10003 = -11214;
      short var10004 = -10329;
      Intrinsics.checkNotNullExpressionValue(var10001, "atCenterOf(...)");
      Vec3 var3 = var10001;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      int[] var2 = var10000;
      short var7 = -11217;
      short var10002 = 11348;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", true);
      short var8 = -11205;
      var10002 = 18973;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("jump", false);
      short var9 = -11201;
      var10002 = 6506;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      int var5 = ((me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i()) ? 1 : 0);
      if (var2 != null) {
         if (var5 == 0) {
            me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.a(var3);
         }

         double var12;
         var5 = (
                  var12 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .d(var3)
                     - 1.0
               )
               == 0.0
            ? 0
            : (var12 < 0.0 ? -1 : 1);
      }

      if (var2 != null) {
         if (var5 >= 0) {
            return;
         }

         var5 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.contains(var1)) ? 1 : 0);
      }

      if (var2 != null) {
         if (var5 != 0) {
            var6 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            label46:
            if (var2 != null) {
               if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
                  var6 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a((Number)600);
                  if (var2 == null) {
                     break label46;
                  }

                  if (!var6) {
                     var6 = false;
                     break label46;
                  }
               }

               var6 = true;
            }

             var4 = var6;
            if (var2 != null) {
               if (!var4) {
                  return;
               }

               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
            }

            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
            return;
         }

         var5 = ((java.util.function.Supplier<Integer>)(() -> { this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(500); return 0; })).get();
      }

      if (var2 != null) {
         if (var5 == 0) {
            return;
         }

         me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j();
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.add(var1);
      }

      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
   }

   private final Vec3 d(me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var1) { ClientLevel var4 = null; // PX-FIX hoist
        
      boolean var41;
      Collection var44;
      int var45;
      int var47;
      double var50;
      int[] var2 = g();
      if (var2 != null && this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
         me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
             var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
            Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            Iterable var7 = var3.b();
            boolean var8 = false;
            var var10 = new ArrayList();
            boolean var11 = false;
            Iterator var12 = var7.iterator();

            Object var10000;
            while (true) {
               if (var12.hasNext()) {
                  Object var13 = var12.next();
                  me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var14 = (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var13;
                  boolean var15 = false;
                  var10000 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  if (var2 == null) {
                     break;
                  }

                  label202: {
                     label220: {
                        var41 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.contains(var14.b());
                        if (var2 != null) {
                           if (var41) {
                              break label220;
                           }

                           var41 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.contains(var14.b());
                        }

                        if (var2 != null) {
                           if (var41) {
                              break label220;
                           }

                           var41 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.containsKey(var14.b());
                        }

                        if (var2 != null) {
                           if (var41) {
                              break label220;
                           }

                           var41 = var4.getBlockState(var14.b()).isAir();
                        }

                        if (var2 == null) {
                           break label202;
                        }

                        if (!var41) {
                           var41 = true;
                           break label202;
                        }
                     }

                     var41 = false;
                  }

                  if (!var41) {
                     continue;
                  }

                  var10.add(var13);
                  if (var2 != null) {
                     continue;
                  }
               }

               var10000 = var10;
               break;
            }

            Object var6 = var10000;
            if (((me.octo.client.PXDyn)var6).isEmpty()) {
               return null;
            } else {
               Vec3 var27 = null;
               double var28 = Double.MAX_VALUE;
               Iterator var29 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.iterator();

               while (true) {
                  if (var29.hasNext()) {
                     Vec3 var30 = (Vec3)var29.next();
                     var10000 = new Vec3(var30.x, var30.y - 1.27, var30.z);
                     if (var2 == null) {
                        break;
                     }

                     Vec3 var31 =((Vec3)( var10000));
                     double var32 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c(var5, var31);
                     double var51;
                     int var43 = (var51 = var32 - 4.0) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
                     if (var2 != null) {
                        if (var43 > 0) {
                           continue;
                        }

                        double var52;
                        var43 = (var52 = var32 - 0.3) == 0.0 ? 0 : (var52 < 0.0 ? -1 : 1);
                     }

                     if (var43 < 0) {
                        continue;
                     }

                     label222: {
                        var var33 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
                        boolean var16 = false;
                        var44 = var33;
                        label166:
                        if (var2 != null) {
                           if (var33 instanceof Collection) {
                              var44 = var33;
                              if (var2 == null) {
                                 break label166;
                              }

                              if (var44.isEmpty()) {
                                 var45 = 0;
                                 break label222;
                              }
                           }

                           var44 = var33;
                        }

                        Iterator var17 = var44.iterator();

                        label159:
                        while (true) {
                           if (!var17.hasNext()) {
                              var45 = 0;
                              break;
                           }

                           Object var18 = var17.next();
                           Vec3 var19 = (Vec3)var18;
                           boolean var20 = false;
                           double var53;
                           var45 = (
                                    var53 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .a(var19, var31)
                                       - 0.4
                                 )
                                 == 0.0
                              ? 0
                              : (var53 < 0.0 ? -1 : 1);

                           while (true) {
                              if (var2 != null) {
                                 var45 = var45 < 0 ? 1 : 0;
                              }

                              if (var45 == 0) {
                                 break;
                              }

                              var45 = 1;
                              if (var2 != null) {
                                 break label159;
                              }
                           }
                        }
                     }

                     if (var45 != 0) {
                        continue;
                     }

                     Vec3 var34 = new Vec3(
                        var30.x, var31.y + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, var30.z
                     );
                     Vec3 var35 = new Vec3(
                        var30.x, var31.y + this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, var30.z
                     );
                     int var36 = 0;
                     byte var37 = 0;

                     label145: {
                        for (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var40 : (Iterable<me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII>)(var6)) {
                           var10000 = Vec3.atCenterOf(var40.b());
                           short var10002 = -11214;
                           short var10003 = -10329;
                           Intrinsics.checkNotNullExpressionValue(var10000, "atCenterOf(...)");
                           Vec3 var21 =((Vec3)( var10000));
                           double var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var34, var21);
                           double var24 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var35, var21);
                           double var54;
                           var47 = (var54 = var22 - this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) == 0.0
                              ? 0
                              : (var54 < 0.0 ? -1 : 1);
                           if (var2 == null) {
                              break label145;
                           }

                           label141:
                           if (var2 != null) {
                              if (var47 > 0) {
                                 double var55;
                                 var47 = (var55 = var24 - this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) == 0.0
                                    ? 0
                                    : (var55 < 0.0 ? -1 : 1);
                                 if (var2 == null) {
                                    break label141;
                                 }

                                 if (var47 > 0) {
                                    continue;
                                 }
                              }

                              double var56;
                              var47 = (var56 = var24 - var22) == 0.0 ? 0 : (var56 < 0.0 ? -1 : 1);
                           }

                           Vec3 var26 = var47 < 0 ? var35 : var34;
                           byte var48 = ((byte)((this.a(var40.b(), var26)) ? 1 : 0));
                           if (var2 != null) {
                              if (var48 == 0) {
                                 continue;
                              }

                              var36++;
                              var48 = ((byte)((Intrinsics.areEqual(var40.b(), var1.b())) ? 1 : 0));
                           }

                           if (var2 != null) {
                              if (var48 == 0) {
                                 continue;
                              }

                              var48 = 1;
                           }

                           var37 = var48;
                           if (var2 == null) {
                              break;
                           }
                        }

                        var47 = var36;
                     }

                     if (var2 != null) {
                        if (var47 == 0) {
                           continue;
                        }

                        var47 = -var36;
                     }

                     label226: {
                        double var39 = var47 * 10.0 + var32;
                        int var49 = var37;
                        if (var2 != null) {
                           if (var37 != 0) {
                              var39 -= 5.0;
                           }

                           var50 = var39;
                           if (var2 == null) {
                              break label226;
                           }

                           double var57;
                           var49 = (var57 = var39 - var28) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
                        }

                        if (var49 >= 0) {
                           continue;
                        }

                        var50 = var39;
                     }

                     var28 = var50;
                     var27 = var31;
                     if (var2 != null) {
                        continue;
                     }
                  }

                  var10000 = var27;
                  break;
               }

               return (Vec3)var10000;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private final me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII e() { LocalPlayer var4 = null; // PX-FIX hoist
        
      boolean var67;
      Collection var72;
      int var73;
      int var74;
      double var76;
      Triple var77;
      int[] var1 = g();
      if (var1 != null && this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
         me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
            ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
            if (var1 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player != null) {
                var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
               Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
               Object var1000x = null; // PX-FIX var-split (Vec3/Iterable 双用途)
               Vec3 var10000 = var4.getEyePosition();
               short var10002 = -11208;
               short var10003 = -4596;
               Intrinsics.checkNotNullExpressionValue(var10000, "getEyePosition(...)");
               Vec3 var6 = var10000;
               Iterable var8 = var2.b();
               boolean var9 = false;
               var var11 = new ArrayList();
               boolean var12 = false;
               Iterator var13 = var8.iterator();

               while (true) {
                  if (var13.hasNext()) {
                     Object var14 = var13.next();
                     me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var15 = (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var14;
                     boolean var16 = false;
                     BlockState var65 = var3.getBlockState(var15.b());
                     var10002 = -11213;
                     var10003 = 23993;
                     Intrinsics.checkNotNullExpressionValue(var65, "getBlockState(...)");
                     BlockState var17 = var65;
                     var10000 = ((Vec3)(Object)(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll));
                     if (var1 == null) {
                        break;
                     }

                     label272: {
                        label294: {
                           var67 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.contains(var15.b());
                           if (var1 != null) {
                              if (var67) {
                                 break label294;
                              }

                              var67 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.contains(var15.b());
                           }

                           if (var1 != null) {
                              if (var67) {
                                 break label294;
                              }

                              var67 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.containsKey(var15.b());
                           }

                           if (var1 != null) {
                              if (var67) {
                                 break label294;
                              }

                              var67 = var17.isAir();
                           }

                           if (var1 == null) {
                              break label272;
                           }

                           if (!var67) {
                              var67 = true;
                              break label272;
                           }
                        }

                        var67 = false;
                     }

                     if (!var67) {
                        continue;
                     }

                     var11.add(var14);
                     if (var1 != null) {
                        continue;
                     }
                  }

                  var1000x = ((Vec3)(Object)(var11));
                  break;
               }

               Object var7 = var1000x;
               var1000x = (Vec3)var7;
               if (var1 != null) {
                  if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.isEmpty()) {
                     return null;
                  }

                  var1000x = (Iterable)var7;
               }

               Object var49 = var1000x;
               boolean var10 = false;
               var var53 = new ArrayList();
               boolean var54 = false;
               boolean var57 = false;
               Iterator var59 = ((me.octo.client.PXDyn)var49).iterator();

               while (true) {
                  if (var59.hasNext()) {
                     label296: {
                        Object var61 = var59.next();
                        boolean var19 = false;
                        me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var20 = (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var61;
                        boolean var21 = false;
                        var10000 = Vec3.atCenterOf(var20.b());
                        var10002 = -11212;
                        var10003 = -1844;
                        Intrinsics.checkNotNullExpressionValue(var10000, "atCenterOf(...)");
                        Vec3 var22 = var10000;
                        double var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(var22, true);
                        double var70 = var23;
                        if (var1 != null) {
                           double var91;
                           int var71 = (var91 = var23 - this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) == 0.0
                              ? 0
                              : (var91 < 0.0 ? -1 : 1);
                           if (var1 == null) {
                              break;
                           }

                           if (var71 > 0) {
                              var77 = null;
                              break label296;
                           }

                           var70 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .d(var22);
                        }

                        double var25;
                        byte var27;
                        var25 = var70;
                        var27 = ((byte)((this.a(var20.b(), var6)) ? 1 : 0));
                        label239:
                        if (var27 == 0) {
                           var var28 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                           boolean var29 = false;
                           var72 = var28;
                           label237:
                           if (var1 != null) {
                              if (var28 instanceof Collection) {
                                 var72 = (Collection)var28;
                                 if (var1 == null) {
                                    break label237;
                                 }

                                 if (var72.isEmpty()) {
                                    var73 = 0;
                                    break label239;
                                 }
                              }

                              var72 = var28;
                           }

                           Iterator var30 = var72.iterator();

                           label228:
                           while (true) {
                              if (!var30.hasNext()) {
                                 var73 = 0;
                                 break;
                              }

                              Object var31 = var30.next();
                              Vec3 var32 = (Vec3)var31;
                              boolean var33 = false;
                              Vec3 var34 = new Vec3(
                                 var32.x, var32.y - 1.27 + this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, var32.z
                              );
                              double var92;
                              var73 = (
                                       var92 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a(var34, var22)
                                          - this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                                    )
                                    == 0.0
                                 ? 0
                                 : (var92 < 0.0 ? -1 : 1);

                              while (true) {
                                 label224: {
                                    label301: {
                                       if (var1 != null) {
                                          if (var73 > 0) {
                                             break label301;
                                          }

                                          var73 = ((this.a(var20.b(), var34)) ? 1 : 0);
                                       }

                                       if (var1 == null) {
                                          break label224;
                                       }

                                       if (var73 != 0) {
                                          var73 = 1;
                                          break label224;
                                       }
                                    }

                                    var73 = 0;
                                 }

                                 if (var73 == 0) {
                                    break;
                                 }

                                 var73 = 1;
                                 if (var1 != null) {
                                    break label228;
                                 }
                              }
                           }
                        } else {
                           var73 = 0;
                        }

                        int var35 = var73;
                        var74 = var27;
                        label206:
                        if (var1 != null) {
                           if (var27 == 0) {
                              var74 = var35;
                              if (var1 == null) {
                                 break label206;
                              }

                              if (var35 == 0) {
                                 var74 = 0;
                                 break label206;
                              }
                           }

                           var74 = 1;
                        }

                        double var38;
                        double var40;
                        int var63;
                        double var84;
                        label302: {
                           var63 = var74;
                           double var36 = var23 + var25 * 0.5;
                           var38 = var63 != 0 ? var36 : var36 * 2.5;
                           var40 = var22.y - var5.y;
                           double var93;
                           int var10001 = (var93 = var40 - 0.0) == 0.0 ? 0 : (var93 < 0.0 ? -1 : 1);
                           if (var1 != null) {
                              if (var10001 <= 0) {
                                 var84 = -4.0;
                                 break label302;
                              }

                              double var94;
                              var10001 = (var94 = var40 - 2.0) == 0.0 ? 0 : (var94 < 0.0 ? -1 : 1);
                           }

                           double var88;
                           label303: {
                              if (var1 != null) {
                                 if (var10001 <= 0) {
                                    var84 = var40 * 2.0;
                                    break label302;
                                 }

                                 var84 = var40;
                                 var88 = 4.0;
                                 if (var1 == null) {
                                    break label303;
                                 }

                                 double var95;
                                 var10001 = (var95 = var40 - 4.0) == 0.0 ? 0 : (var95 < 0.0 ? -1 : 1);
                              }

                              if (var10001 <= 0) {
                                 var84 = var40 * 5.0;
                                 break label302;
                              }

                              var84 = var40;
                              var88 = 9.0;
                           }

                           var84 *= var88;
                        }

                        label305: {
                           var38 += var84;
                           double var42 = Math.abs(var22.x - var5.x);
                           double var44 = Math.abs(var22.z - var5.z);
                           double var96;
                           int var75 = (var96 = var42 - 1.5) == 0.0 ? 0 : (var96 < 0.0 ? -1 : 1);
                           if (var1 != null) {
                              if (var75 > 0) {
                                 break label305;
                              }

                              double var97;
                              var75 = (var97 = var44 - 1.5) == 0.0 ? 0 : (var97 < 0.0 ? -1 : 1);
                           }

                           label306: {
                              if (var1 != null) {
                                 if (var75 > 0) {
                                    break label305;
                                 }

                                 var76 = var40;
                                 var84 = 2.0;
                                 if (var1 == null) {
                                    break label306;
                                 }

                                 double var98;
                                 var75 = (var98 = var40 - 2.0) == 0.0 ? 0 : (var98 < 0.0 ? -1 : 1);
                              }

                              if (var75 <= 0) {
                                 break label305;
                              }

                              var76 = var38;
                              var84 = 40.0 + (var40 - 2.0) * 6.0;
                           }

                           var38 = var76 + var84;
                        }

                        var77 = new Triple(var20, var38, Boolean.valueOf(var63 != 0));
                     }

                     if (var77 != null) {
                        Triple var46 = var77;
                        boolean var47 = false;
                        var53.add(var46);
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  var49 = var53;
                  boolean var78 = false;
                  break;
               }

               List var48 = CollectionsKt.sortedWith(
                  (Iterable)var49,
                  new IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll()
               );
               Iterable var51 = var48;
               boolean var52 = false;
               var var55 = new ArrayList();
               boolean var56 = false;

               for (Object var60 : var51) {
                  Triple var62 = (Triple)var60;
                  boolean var18 = false;
                  boolean var79 = (Boolean)var62.getThird();
                  if (var1 != null) {
                     if (!var79) {
                        continue;
                     }

                     var55.add(var60);
                  }

                  if (var1 == null) {
                     break;
                  }
               }

               List var50 = var55;
               boolean var80 = var50.isEmpty();
               if (var1 != null) {
                  var80 = !var80;
               }

               if (var80) {
                  return (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)((Triple)CollectionsKt.first(
                        var50
                     ))
                     .getFirst();
               } else {
                  Object var81 = (Triple)CollectionsKt.firstOrNull(var48);
                  if (var1 != null) {
                     if (var81 == null) {
                        return null;
                     }

                     var81 = ((me.octo.client.PXDyn)var81).getFirst();
                  }

                  return (me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII)var81;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public final void a(@NotNull BlockPos var1, @NotNull BlockPos var2) { me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = null; // PX-FIX hoist
        
      int[] var10000 = g();
      short var10002 = -11215;
      short var10003 = -13819;
      Intrinsics.checkNotNullParameter(var1, "pos");
      int[] var3 = var10000;
      short var10001 = -11223;
      var10002 = -29917;
      Intrinsics.checkNotNullParameter(var2, "movementBoundaryCenter");
       var4 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      if (var3 != null) {
         if (var4 != null) {
            BlockPos var5 = this.f(var1);
            if (var3 != null) {
               if (var5 == null) {
                  short var8 = -11209;
                  var10001 = 25313;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNo tree found!");
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
                  return;
               }

               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clear();
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clear();
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.clear();
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.clear();
               this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = null;
               this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.clear();
               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
               this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
               this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.f();
               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.f();
               this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
               this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = 0L;
               Vec3 var10 = Vec3.atBottomCenterOf(var2);
               var10003 = -11204;
               short var10004 = -5771;
               Intrinsics.checkNotNullExpressionValue(var10, "atBottomCenterOf(...)");
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10;
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var2;
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.e(var2);
            }

            me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll var6 = this.g(var5);
            if (var3 != null) {
               if (var6 == null) {
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
                  return;
               }

               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
               me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .a(this);
            }

            return;
         }

         short var7 = -11211;
         var10001 = -12855;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNo axe found!");
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      }
   }

   private final List<Vec3> e(BlockPos var1) { ArrayList var4 = null; // PX-FIX hoist
        
      int[] var2 = g();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
          var4 = new ArrayList();
         int var5 = var1.getY();
         int var6 = -3;

         label75:
         while (true) {
            int var10000 = var6;

            label73:
            while (var10000 < 4) {
               int var7 = -3;

               label70:
               while (true) {
                  var10000 = var7;

                  label68:
                  while (true) {
                     if (var10000 >= 4) {
                        break label70;
                     }

                     var10000 = -1;
                     if (var2 == null) {
                        continue label73;
                     }

                     int var8 = -1;

                     while (var8 < 2) {
                        BlockPos var9 = new BlockPos(var1.getX() + var6, var5 + var8, var1.getZ() + var7);
                        BlockState var14 = var3.getBlockState(var9);
                        short var10002 = -11216;
                        short var10003 = 16092;
                        Intrinsics.checkNotNullExpressionValue(var14, "getBlockState(...)");
                        BlockState var10 = var14;
                        BlockState var15 = var3.getBlockState(var9.above());
                        var10002 = -11213;
                        var10003 = 23993;
                        Intrinsics.checkNotNullExpressionValue(var15, "getBlockState(...)");
                        BlockState var11 = var15;
                        BlockState var16 = var3.getBlockState(var9.above(2));
                        var10002 = -11213;
                        var10003 = 23993;
                        Intrinsics.checkNotNullExpressionValue(var16, "getBlockState(...)");
                        BlockState var12 = var16;
                        if (var2 != null) {
                           var10000 = ((var10.isAir()) ? 1 : 0);
                           if (var2 == null) {
                              continue label68;
                           }

                           label58:
                           if (var10000 == 0) {
                              boolean var17 = var11.isAir();
                              if (var2 != null) {
                                 if (!var17) {
                                    break label58;
                                 }

                                 var17 = var12.isAir();
                              }

                              if (var2 != null && var17) {
                                 var4.add(new Vec3(var9.getX() + 0.5, var9.getY() + 1.0 + 1.27, var9.getZ() + 0.5));
                              }
                           }

                           var8++;
                        }

                        if (var2 == null) {
                           break;
                        }
                     }

                     var7++;
                     if (var2 == null) {
                        break label70;
                     }
                     break;
                  }
               }

               var6++;
               if (var2 == null) {
                  return var4;
               }
               continue label75;
            }

            return var4;
         }
      } else {
         return CollectionsKt.emptyList();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final BlockPos f(BlockPos var1) {
      int var14;
      int[] var10000 = g();
      me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var3 = me.octo.client.utils.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(var1);
      int[] var2 = var10000;
      if (var2 != null && var3 != null) {
         return var3.b();
      } else {
         Integer[] var5 = new Integer[]{1, 2};

         label92:
         for (Object var12 : CollectionsKt.listOf(var5)) {
            label90:
            while (true) {
               int var11 = ((Number)var12).intValue();
               int var6 = -var11;

               while (true) {
                  int var13 = var6;
                  if (var2 != null) {
                     if (var6 > var11) {
                        continue label92;
                     }

                     var13 = -var11;
                  }

                  while (true) {
                     int var10001;
                     label100: {
                        int var7 = var13;
                        if (var7 <= var11) {
                           do {
                              int var8 = -var11;
                              var14 = var8;
                              var10001 = var11;
                              if (var2 == null) {
                                 break label100;
                              }

                              label101: {
                                 if (var8 <= var11) {
                                    do {
                                       BlockPos var9 = new BlockPos(var1.getX() + var6, var1.getY() + var7, var1.getZ() + var8);
                                       me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var10 = me.octo.client.utils.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .c(var9);
                                       var12 = var10;
                                       if (var2 == null) {
                                          continue label90;
                                       }

                                       if (var10 != null) {
                                          var12 = var10.b();
                                          if (var2 != null) {
                                             return (BlockPos)var12;
                                          }
                                          continue label90;
                                       }

                                       var14 = var8;
                                       var10001 = var11;
                                       if (var2 == null) {
                                          break label101;
                                       }

                                       if (var8 == var11) {
                                          break;
                                       }

                                       var8++;
                                    } while (var2 != null);
                                 }

                                 var14 = var7;
                                 var10001 = var11;
                              }

                              if (var2 == null) {
                                 break label100;
                              }

                              if (var14 == var10001) {
                                 break;
                              }

                              var7++;
                           } while (var2 != null);
                        }

                        var14 = var6;
                        var10001 = var11;
                     }

                     if (var14 == var10001) {
                        continue label92;
                     }

                     var6++;
                     if (var2 == null) {
                        break;
                     }

                     if (var2 == null) {
                        return null;
                     }

                     var13 = -var11;
                  }
               }
            }
         }

         return null;
      }
   }

   private final me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll g(BlockPos var1) { ArrayList var4 = null; // PX-FIX hoist
        
      int[] var2 = g();
      if (var2 != null) {
         me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var10000 = me.octo.client.utils.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(var1);
         if (var10000 != null) {
            me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var3 = var10000;
             var4 = new ArrayList();
            Set var5 = new LinkedHashSet();
            ArrayDeque var6 = new ArrayDeque();
            var6.add(var1);
            var5.add(var1);
            int var7 = var1.getX();
            int var8 = var1.getY();
            int var9 = var1.getZ();
            int var10 = var1.getX();
            int var11 = var1.getY();
            int var12 = var1.getZ();

            label116:
            while (true) {
               int var22 = ((Collection)var6).isEmpty() ? 1 : 0;

               label114:
               while (true) {
                  var22 = var22 == 0 ? 1 : 0;

                  label112:
                  while (true) {
                     if (var22 == 0) {
                        break label116;
                     }

                     BlockPos var13 = (BlockPos)var6.removeFirst();
                     me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var14 = me.octo.client.utils.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .c(var13);
                     if (var2 != null) {
                        if (var14 == null) {
                           continue label116;
                        }

                        var4.add(var14);
                        var7 = Math.min(var7, var13.getX());
                        var8 = Math.min(var8, var13.getY());
                        var9 = Math.min(var9, var13.getZ());
                        var10 = Math.max(var10, var13.getX());
                        var11 = Math.max(var11, var13.getY());
                        var12 = Math.max(var12, var13.getZ());
                     }

                     int var15 = -1;

                     while (true) {
                        int var23 = var15;

                        label107:
                        while (true) {
                           if (var23 >= 2) {
                              continue label116;
                           }

                           var22 = -1;
                           if (var2 == null) {
                              continue label112;
                           }

                           if (var2 == null) {
                              continue label114;
                           }

                           int var16 = -1;

                           while (true) {
                              int var24 = var16;

                              label102:
                              while (true) {
                                 if (var24 >= 2) {
                                    break label107;
                                 }

                                 var23 = -1;
                                 if (var2 == null) {
                                    continue label107;
                                 }

                                 int var17 = -1;

                                 while (true) {
                                    if (var17 >= 2) {
                                       break label102;
                                    }

                                    var24 = var15;
                                    if (var2 == null) {
                                       break;
                                    }

                                    label97: {
                                       label130: {
                                          label131: {
                                             if (var2 != null) {
                                                if (var15 != 0) {
                                                   break label131;
                                                }

                                                var24 = var16;
                                             }

                                             if (var2 != null) {
                                                if (var24 != 0) {
                                                   break label131;
                                                }

                                                var24 = var17;
                                             }

                                             if (var24 == 0) {
                                                break label130;
                                             }
                                          }

                                          BlockPos var25 = var13.offset(var15, var16, var17);
                                          short var10002 = -11228;
                                          short var10003 = -14820;
                                          Intrinsics.checkNotNullExpressionValue(var25, "offset(...)");
                                          BlockPos var18 = var25;
                                          if (var2 == null) {
                                             break label97;
                                          }

                                          if (!var5.contains(var18)) {
                                             var5.add(var18);
                                             var6.add(var18);
                                          }
                                       }

                                       var17++;
                                    }

                                    if (var2 == null) {
                                       break label102;
                                    }
                                 }
                              }

                              var16++;
                              if (var2 == null) {
                                 break label107;
                              }
                           }
                        }

                        var15++;
                        if (var2 == null) {
                           break label116;
                        }
                     }
                  }
               }
            }

            if (var4.size() < 4) {
               return null;
            }

            Pair var19 = TuplesKt.to(new BlockPos(var7, var8, var9), new BlockPos(var10, var11, var12));
            AABB var20 = new AABB(var7, var8, var9, var10 + 1.0, var11 + 1.0, var12 + 1.0);
            BlockPos var21 = new BlockPos((var7 + var10) / 2, (var8 + var11) / 2, (var9 + var12) / 2);
            return new me.octo.client.utils.IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll(
               var3.a(), var4, var19, var20, var21, var4.size()
            );
         }
      }

      return null;
   }

   public final void f() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = -11217;
      short var10002 = 11348;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", false);
      var10001 = -11201;
      var10002 = 6506;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
   }

   private static final boolean a(ClientLevel var0, IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var1, BlockPos var2) { boolean var4 = false; // PX-FIX hoist
        
      int[] var10000 = g();
      short var10002 = -11224;
      short var10003 = 11049;
      Intrinsics.checkNotNullParameter(var2, "pos");
       var4 = var0.getBlockState(var2).isAir();
      int[] var3 = var10000;
      boolean var6 = false;
      boolean var7 = var4;
      if (var3 != null) {
         if (var4) {
            var1.c(var2);
         }

         var7 = var4;
      }

      return var7;
   }

   private static final boolean a(long var0, Entry var2) { Long var4 = null; // PX-FIX hoist
        
      int[] var10000 = g();
      short var10002 = -11221;
      short var10003 = 6479;
      Intrinsics.checkNotNullParameter(var2, "<destruct>");
      int[] var3 = var10000;
      var10000 = (int[])var2.getValue();
      var10002 = -11210;
      var10003 = 11486;
      Intrinsics.checkNotNullExpressionValue(var10000, "component2(...)");
       var4 = (Long)(Object)var10000;
      long var9;
      int var6 = (var9 = var0 - var4) == 0L ? 0 : (var9 < 0L ? -1 : 1);
      if (var3 != null) {
         var6 = var6 >= 0 ? 1 : 0;
      }

      return var6 != 0;
   }

   public static void b(int[] var0) {
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var0;
   }

   public static int[] g() {
      return lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { int var4 = 0; // PX-FIX hoist
        
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[27];
      int[] var10000 = new int[1];
      int var3 = 0;
      b(var10000);
      String var2 = "|Âèi\u0095\u001a?ÙWö\u000b\u0095f\"Go\u000eÍ4½\\\t\u0010@±\u0011\u009f7è.®\u0005]d»ê#\u0006u\u0080ÿ/\u0090\u0002\u0013ùâ¨t`Ç\u0012S\u001aé\u008eæ\u0085î\u0017!\u0089E\u0005\u0004ðë5{\u0012Uë\u001c&\u0091\u009aÌã9\u0087Ú1m\u000bw\u0013C\u0004\u0004y\u0002\rO\u000fNX¯0Fz\u0016Ê5k\u008c\u001fS>¥\u000f°?c#=FãíZz¤f¹k¸\u000f\u009bny\u009bv¢1\u0094êk+Á§å;\u0010\u0002r5\u008a÷f°^>JÌô\u0087jB¾\u0012S\u0004ý¯ßQaÎ\u0001ÃÜ\u0000rÊ¤+9\u0003\u0003B¯-\u000fW%\u008c\u009f\"\u008f\u009at¤¼¾å\u0015am\u0012ÃJïf\u009dh)é\b'ý\u009cVY Y©M\u0013\u007f²x~z\u0086Q{rì\u0083F$ú#£\u000f\u0015Õ\u00046?íá\u0004\u0015Ü\u0080\u0094\u0005¸Ê\u0007?´\u0003\u0088¢t\u00165¨xV,§3Döu\u0005´ÞLLÌ\u009e\u000e`½Ò2\u0005Ù²ÿ$´\nòËèFVf]\u009eu\u008a\u000b÷#r\u0019w\u008b\u0017¨\u0090¸t";
       var4 = "|Âèi\u0095\u001a?ÙWö\u000b\u0095f\"Go\u000eÍ4½\\\t\u0010@±\u0011\u009f7è.®\u0005]d»ê#\u0006u\u0080ÿ/\u0090\u0002\u0013ùâ¨t`Ç\u0012S\u001aé\u008eæ\u0085î\u0017!\u0089E\u0005\u0004ðë5{\u0012Uë\u001c&\u0091\u009aÌã9\u0087Ú1m\u000bw\u0013C\u0004\u0004y\u0002\rO\u000fNX¯0Fz\u0016Ê5k\u008c\u001fS>¥\u000f°?c#=FãíZz¤f¹k¸\u000f\u009bny\u009bv¢1\u0094êk+Á§å;\u0010\u0002r5\u008a÷f°^>JÌô\u0087jB¾\u0012S\u0004ý¯ßQaÎ\u0001ÃÜ\u0000rÊ¤+9\u0003\u0003B¯-\u000fW%\u008c\u009f\"\u008f\u009at¤¼¾å\u0015am\u0012ÃJïf\u009dh)é\b'ý\u009cVY Y©M\u0013\u007f²x~z\u0086Q{rì\u0083F$ú#£\u000f\u0015Õ\u00046?íá\u0004\u0015Ü\u0080\u0094\u0005¸Ê\u0007?´\u0003\u0088¢t\u00165¨xV,§3Döu\u0005´ÞLLÌ\u009e\u000e`½Ò2\u0005Ù²ÿ$´\nòËèFVf]\u009eu\u008a\u000b÷#r\u0019w\u008b\u0017¨\u0090¸t"
         .length();
      char var1 = 21;
      int var8 = -1;

      label52:
while (true) {
         byte var9 = 34;
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
                     case 0 -> 10;
                     case 1 -> 61;
                     case 2 -> 79;
                     case 3 -> 101;
                     case 4 -> 121;
                     case 5 -> 11;
                     default -> 81;
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
                     b = new String[27];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "i\u0019\u000b¶²µ(vQ9ùG¨BlJ\u0006øsÿà!J";
                  var4 = "i\u0019\u000b¶²µ(vQ9ùG¨BlJ\u0006øsÿà!J".length();
                  var1 = 16;
                  var8 = -1;
            }

            var9 = 92;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) { short var4 = (short)0; // PX-FIX hoist
        
      int var2 = (var0 ^ -11204) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

          var4 = switch (var3[0] & 0xFF) {
            case 0 -> 74;
            case 1 -> 122;
            case 2 -> 225;
            case 3 -> 167;
            case 4 -> 175;
            case 5 -> 177;
            case 6 -> 4;
            case 7 -> 111;
            case 8 -> 50;
            case 9 -> 242;
            case 10 -> 109;
            case 11 -> 174;
            case 12 -> 186;
            case 13 -> 23;
            case 14 -> 198;
            case 15 -> 27;
            case 16 -> 199;
            case 17 -> 107;
            case 18 -> 249;
            case 19 -> 7;
            case 20 -> 41;
            case 21 -> 60;
            case 22 -> 163;
            case 23 -> 66;
            case 24 -> 232;
            case 25 -> 245;
            case 26 -> 246;
            case 27 -> 114;
            case 28 -> 1;
            case 29 -> 179;
            case 30 -> 165;
            case 31 -> 126;
            case 32 -> 55;
            case 33 -> 134;
            case 34 -> 26;
            case 35 -> 97;
            case 36 -> 49;
            case 37 -> 127;
            case 38 -> 58;
            case 39 -> 75;
            case 40 -> 36;
            case 41 -> 65;
            case 42 -> 84;
            case 43 -> 184;
            case 44 -> 196;
            case 45 -> 200;
            case 46 -> 120;
            case 47 -> 102;
            case 48 -> 87;
            case 49 -> 217;
            case 50 -> 118;
            case 51 -> 25;
            case 52 -> 201;
            case 53 -> 31;
            case 54 -> 94;
            case 55 -> 95;
            case 56 -> 215;
            case 57 -> 98;
            case 58 -> 117;
            case 59 -> 139;
            case 60 -> 210;
            case 61 -> 206;
            case 62 -> 69;
            case 63 -> 83;
            case 64 -> 151;
            case 65 -> 5;
            case 66 -> 21;
            case 67 -> 104;
            case 68 -> 47;
            case 69 -> 236;
            case 70 -> 202;
            case 71 -> 63;
            case 72 -> 112;
            case 73 -> 103;
            case 74 -> 148;
            case 75 -> 62;
            case 76 -> 228;
            case 77 -> 59;
            case 78 -> 237;
            case 79 -> 0;
            case 80 -> 166;
            case 81 -> 226;
            case 82 -> 79;
            case 83 -> 72;
            case 84 -> 64;
            case 85 -> 28;
            case 86 -> 157;
            case 87 -> 42;
            case 88 -> 144;
            case 89 -> 219;
            case 90 -> 20;
            case 91 -> 193;
            case 92 -> 110;
            case 93 -> 46;
            case 94 -> 182;
            case 95 -> 154;
            case 96 -> 18;
            case 97 -> 230;
            case 98 -> 187;
            case 99 -> 173;
            case 100 -> 229;
            case 101 -> 48;
            case 102 -> 197;
            case 103 -> 153;
            case 104 -> 248;
            case 105 -> 222;
            case 106 -> 235;
            case 107 -> 239;
            case 108 -> 169;
            case 109 -> 218;
            case 110 -> 131;
            case 111 -> 90;
            case 112 -> 8;
            case 113 -> 147;
            case 114 -> 254;
            case 115 -> 54;
            case 116 -> 243;
            case 117 -> 24;
            case 118 -> 220;
            case 119 -> 34;
            case 120 -> 231;
            case 121 -> 189;
            case 122 -> 101;
            case 123 -> 192;
            case 124 -> 160;
            case 125 -> 2;
            case 126 -> 247;
            case 127 -> 137;
            case 128 -> 76;
            case 129 -> 209;
            case 130 -> 180;
            case 131 -> 96;
            case 132 -> 149;
            case 133 -> 9;
            case 134 -> 159;
            case 135 -> 61;
            case 136 -> 135;
            case 137 -> 3;
            case 138 -> 17;
            case 139 -> 121;
            case 140 -> 6;
            case 141 -> 68;
            case 142 -> 191;
            case 143 -> 141;
            case 144 -> 113;
            case 145 -> 251;
            case 146 -> 145;
            case 147 -> 244;
            case 148 -> 51;
            case 149 -> 146;
            case 150 -> 208;
            case 151 -> 123;
            case 152 -> 138;
            case 153 -> 133;
            case 154 -> 170;
            case 155 -> 253;
            case 156 -> 224;
            case 157 -> 136;
            case 158 -> 77;
            case 159 -> 130;
            case 160 -> 89;
            case 161 -> 29;
            case 162 -> 70;
            case 163 -> 223;
            case 164 -> 155;
            case 165 -> 176;
            case 166 -> 38;
            case 167 -> 19;
            case 168 -> 221;
            case 169 -> 195;
            case 170 -> 128;
            case 171 -> 190;
            case 172 -> 129;
            case 173 -> 71;
            case 174 -> 255;
            case 175 -> 150;
            case 176 -> 33;
            case 177 -> 106;
            case 178 -> 241;
            case 179 -> 14;
            case 180 -> 156;
            case 181 -> 57;
            case 182 -> 92;
            case 183 -> 227;
            case 184 -> 214;
            case 185 -> 183;
            case 186 -> 203;
            case 187 -> 234;
            case 188 -> 143;
            case 189 -> 81;
            case 190 -> 132;
            case 191 -> 73;
            case 192 -> 171;
            case 193 -> 124;
            case 194 -> 172;
            case 195 -> 80;
            case 196 -> 15;
            case 197 -> 240;
            case 198 -> 205;
            case 199 -> 99;
            case 200 -> 67;
            case 201 -> 116;
            case 202 -> 43;
            case 203 -> 125;
            case 204 -> 82;
            case 205 -> 11;
            case 206 -> 161;
            case 207 -> 178;
            case 208 -> 168;
            case 209 -> 86;
            case 210 -> 85;
            case 211 -> 233;
            case 212 -> 207;
            case 213 -> 22;
            case 214 -> 56;
            case 215 -> 164;
            case 216 -> 10;
            case 217 -> 188;
            case 218 -> 105;
            case 219 -> 40;
            case 220 -> 185;
            case 221 -> 140;
            case 222 -> 30;
            case 223 -> 108;
            case 224 -> 194;
            case 225 -> 162;
            case 226 -> 93;
            case 227 -> 158;
            case 228 -> 16;
            case 229 -> 212;
            case 230 -> 213;
            case 231 -> 181;
            case 232 -> 250;
            case 233 -> 35;
            case 234 -> 53;
            case 235 -> 45;
            case 236 -> 142;
            case 237 -> 37;
            case 238 -> 119;
            case 239 -> 100;
            case 240 -> 12;
            case 241 -> 13;
            case 242 -> 78;
            case 243 -> 32;
            case 244 -> 52;
            case 245 -> 252;
            case 246 -> 216;
            case 247 -> 44;
            case 248 -> 39;
            case 249 -> 152;
            case 250 -> 115;
            case 251 -> 238;
            case 252 -> 211;
            case 253 -> 88;
            case 254 -> 204;
            default -> 91;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Vec3 IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(boolean var1, double var2, @Nullable Vec3 var4) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Vec3 c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         int[] var1 = IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.g();
         int var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ? 1 : 0;
         if (var1 != null) {
            if (!this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            double var2;
            var10000 = (var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - 4.5) == 0.0
               ? 0
               : (var2 < 0.0 ? -1 : 1);
         }

         if (var1 == null) {
            return var10000 != 0;
         } else {
            return var10000 > 0;
         }
      }

      public final boolean e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Vec3 g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         boolean var1, double var2, @Nullable Vec3 var4
      ) {
         return new IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var4
         );
      }

      @NotNull
      @Override
      public String toString() { boolean var4 = false; // PX-FIX hoist
        
         short var10000 = 13027;
         Vec3 var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         double var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
          var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -18073;
         short var10002 = 13024;
         short var10003 = -512;
         short var10004 = 13025;
         short var10005 = -26719;
         return "StanceInfo(canSee=" + var4 + ", distanceToBlock=" + var2 + ", point=" + var1 + ")";
      }

      @Override
      public int hashCode() { int var4 = 0; // PX-FIX hoist
        
         int[] var10000 = IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.g();
         int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         int[] var1 = var10000;
         var2 = var2 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
          var4 = var2 * 31;
         Vec3 var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var1 != null) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
               return var4 + 0;
            }

            var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return var4 + var10001.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) { int var4 = 0; // PX-FIX hoist
        
         int[] var2 = IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.g();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
          var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ? 1 : 0;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            ) ? 1 : 0;
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return var4 != 0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { int var4 = 0; // PX-FIX hoist
        
         pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = " õ\u0082\u009açn>\u0083\u0012F\u0017JÀrùÀ{àæ(ÚHG¼¼1Ê\u0012\u0091\u0087%\u000b*vñ¹î´0×\u009bi½=¤<";
          var4 = " õ\u0082\u009açn>\u0083\u0012F\u0017JÀrùÀ{àæ(ÚHG¼¼1Ê\u0012\u0091\u0087%\u000b*vñ¹î´0×\u009bi½=¤<".length();
         char var1 = '\b';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 11;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 11;
                  var10006 = var6;
               } else {
                  var13 = 11;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 11;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 80;
                     case 1 -> 19;
                     case 2 -> 47;
                     case 3 -> 103;
                     case 4 -> 47;
                     case 5 -> 87;
                     default -> 125;
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

      private static String a(int var0, int var1) { short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ 13025) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 236;
               case 1 -> 112;
               case 2 -> 239;
               case 3 -> 102;
               case 4 -> 173;
               case 5 -> 216;
               case 6 -> 22;
               case 7 -> 162;
               case 8 -> 49;
               case 9 -> 95;
               case 10 -> 21;
               case 11 -> 129;
               case 12 -> 168;
               case 13 -> 88;
               case 14 -> 32;
               case 15 -> 209;
               case 16 -> 7;
               case 17 -> 183;
               case 18 -> 71;
               case 19 -> 34;
               case 20 -> 177;
               case 21 -> 185;
               case 22 -> 253;
               case 23 -> 99;
               case 24 -> 197;
               case 25 -> 227;
               case 26 -> 72;
               case 27 -> 116;
               case 28 -> 255;
               case 29 -> 207;
               case 30 -> 210;
               case 31 -> 154;
               case 32 -> 30;
               case 33 -> 161;
               case 34 -> 252;
               case 35 -> 153;
               case 36 -> 167;
               case 37 -> 35;
               case 38 -> 67;
               case 39 -> 195;
               case 40 -> 98;
               case 41 -> 225;
               case 42 -> 96;
               case 43 -> 119;
               case 44 -> 133;
               case 45 -> 54;
               case 46 -> 31;
               case 47 -> 26;
               case 48 -> 106;
               case 49 -> 159;
               case 50 -> 187;
               case 51 -> 149;
               case 52 -> 198;
               case 53 -> 203;
               case 54 -> 87;
               case 55 -> 223;
               case 56 -> 85;
               case 57 -> 190;
               case 58 -> 38;
               case 59 -> 132;
               case 60 -> 62;
               case 61 -> 48;
               case 62 -> 74;
               case 63 -> 128;
               case 64 -> 243;
               case 65 -> 196;
               case 66 -> 204;
               case 67 -> 228;
               case 68 -> 199;
               case 69 -> 97;
               case 70 -> 176;
               case 71 -> 191;
               case 72 -> 152;
               case 73 -> 118;
               case 74 -> 115;
               case 75 -> 219;
               case 76 -> 157;
               case 77 -> 155;
               case 78 -> 16;
               case 79 -> 221;
               case 80 -> 249;
               case 81 -> 251;
               case 82 -> 127;
               case 83 -> 171;
               case 84 -> 141;
               case 85 -> 75;
               case 86 -> 39;
               case 87 -> 175;
               case 88 -> 20;
               case 89 -> 241;
               case 90 -> 25;
               case 91 -> 79;
               case 92 -> 80;
               case 93 -> 147;
               case 94 -> 6;
               case 95 -> 5;
               case 96 -> 208;
               case 97 -> 250;
               case 98 -> 156;
               case 99 -> 55;
               case 100 -> 77;
               case 101 -> 12;
               case 102 -> 89;
               case 103 -> 232;
               case 104 -> 211;
               case 105 -> 254;
               case 106 -> 18;
               case 107 -> 117;
               case 108 -> 244;
               case 109 -> 93;
               case 110 -> 110;
               case 111 -> 56;
               case 112 -> 9;
               case 113 -> 220;
               case 114 -> 94;
               case 115 -> 84;
               case 116 -> 29;
               case 117 -> 245;
               case 118 -> 36;
               case 119 -> 146;
               case 120 -> 90;
               case 121 -> 40;
               case 122 -> 101;
               case 123 -> 213;
               case 124 -> 247;
               case 125 -> 142;
               case 126 -> 60;
               case 127 -> 164;
               case 128 -> 68;
               case 129 -> 86;
               case 130 -> 78;
               case 131 -> 111;
               case 132 -> 73;
               case 133 -> 212;
               case 134 -> 184;
               case 135 -> 215;
               case 136 -> 15;
               case 137 -> 126;
               case 138 -> 158;
               case 139 -> 135;
               case 140 -> 192;
               case 141 -> 2;
               case 142 -> 51;
               case 143 -> 246;
               case 144 -> 19;
               case 145 -> 136;
               case 146 -> 113;
               case 147 -> 240;
               case 148 -> 65;
               case 149 -> 3;
               case 150 -> 46;
               case 151 -> 234;
               case 152 -> 180;
               case 153 -> 0;
               case 154 -> 63;
               case 155 -> 13;
               case 156 -> 217;
               case 157 -> 122;
               case 158 -> 144;
               case 159 -> 140;
               case 160 -> 151;
               case 161 -> 137;
               case 162 -> 145;
               case 163 -> 143;
               case 164 -> 205;
               case 165 -> 222;
               case 166 -> 23;
               case 167 -> 17;
               case 168 -> 125;
               case 169 -> 186;
               case 170 -> 41;
               case 171 -> 242;
               case 172 -> 165;
               case 173 -> 121;
               case 174 -> 105;
               case 175 -> 69;
               case 176 -> 131;
               case 177 -> 1;
               case 178 -> 37;
               case 179 -> 107;
               case 180 -> 130;
               case 181 -> 52;
               case 182 -> 81;
               case 183 -> 178;
               case 184 -> 238;
               case 185 -> 103;
               case 186 -> 53;
               case 187 -> 24;
               case 188 -> 64;
               case 189 -> 134;
               case 190 -> 169;
               case 191 -> 226;
               case 192 -> 76;
               case 193 -> 237;
               case 194 -> 139;
               case 195 -> 50;
               case 196 -> 224;
               case 197 -> 59;
               case 198 -> 214;
               case 199 -> 14;
               case 200 -> 172;
               case 201 -> 92;
               case 202 -> 206;
               case 203 -> 166;
               case 204 -> 4;
               case 205 -> 83;
               case 206 -> 182;
               case 207 -> 114;
               case 208 -> 43;
               case 209 -> 235;
               case 210 -> 188;
               case 211 -> 138;
               case 212 -> 47;
               case 213 -> 189;
               case 214 -> 57;
               case 215 -> 248;
               case 216 -> 44;
               case 217 -> 229;
               case 218 -> 11;
               case 219 -> 123;
               case 220 -> 109;
               case 221 -> 45;
               case 222 -> 148;
               case 223 -> 201;
               case 224 -> 120;
               case 225 -> 66;
               case 226 -> 231;
               case 227 -> 163;
               case 228 -> 42;
               case 229 -> 82;
               case 230 -> 181;
               case 231 -> 10;
               case 232 -> 150;
               case 233 -> 124;
               case 234 -> 179;
               case 235 -> 193;
               case 236 -> 58;
               case 237 -> 170;
               case 238 -> 174;
               case 239 -> 70;
               case 240 -> 33;
               case 241 -> 28;
               case 242 -> 218;
               case 243 -> 233;
               case 244 -> 27;
               case 245 -> 200;
               case 246 -> 160;
               case 247 -> 194;
               case 248 -> 104;
               case 249 -> 100;
               case 250 -> 108;
               case 251 -> 202;
               case 252 -> 61;
               case 253 -> 230;
               case 254 -> 8;
               default -> 91;
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
      public static IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
         boolean var1, double var2, @Nullable Vec3 var4, int var5, Object var6
      ) {
         int[] var7 = IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.g();
         if (var7 != null) {
            if ((var5 & 1) != 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            if ((var5 & 2) != 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((var5 & 4) != 0) {
               var4 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }

         return var0.a(var1, var2, var4);
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static int var4 = 0; // PX-FIX (retyped int) missing field v2
   
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final BlockPos lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private final int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @Nullable
      private final Vec3 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private final int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      private final int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         boolean var1,
         boolean var2,
         @Nullable Integer var3,
         @Nullable BlockPos var4,
         int var5,
         int var6,
         boolean var7,
         int var8,
         int var9,
         @Nullable Vec3 var10,
         boolean var11,
         int var12,
         int var13
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var10;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var12;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var13;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockPos d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final int h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final int i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @Nullable
      public final Vec3 j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final boolean k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int l() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final int m() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final boolean n() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean o() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer p() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockPos q() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int r() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int s() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean t() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final int u() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final int v() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @Nullable
      public final Vec3 w() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final boolean x() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int y() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final int z() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public static me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
         boolean var1,
         boolean var2,
         Integer var3,
         BlockPos var4,
         int var5,
         int var6,
         boolean var7,
         int var8,
         int var9,
         Vec3 var10,
         boolean var11,
         int var12,
         int var13,
         int var14,
         Object var15
      ) {
         int[] var16 = me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.g();
         if (var16 != null) {
            if ((var14 & 1) != 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            if ((var14 & 2) != 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((var14 & 4) != 0) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if ((var14 & 8) != 0) {
               var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            if ((var14 & 16) != 0) {
               var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            if ((var14 & 32) != 0) {
               var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            if ((var14 & 64) != 0) {
               var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }

            if ((var14 & 128) != 0) {
               var8 = var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            }

            if ((var14 & 256) != 0) {
               var9 = var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            }

            if ((var14 & 512) != 0) {
               var10 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            if ((var14 & 1024) != 0) {
               var11 = var0.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            }

            if ((var14 & 2048) != 0) {
               var12 = var0.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            }

            if ((var14 & 4096) != 0) {
               var13 = var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            }

         }

         me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var17 = var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.b(new int[3]);
         }

         return var17;
      }

      @NotNull
      public final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         boolean var1,
         boolean var2,
         @Nullable Integer var3,
         @Nullable BlockPos var4,
         int var5,
         int var6,
         boolean var7,
         int var8,
         int var9,
         @Nullable Vec3 var10,
         boolean var11,
         int var12,
         int var13
      ) {
         return new IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13
         );
      }

      @NotNull
      @Override
      public String toString() { Vec3 var4 = null; // PX-FIX hoist
        
         short var10000 = 25220;
         int var1 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         int var2 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         boolean var3 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
          var4 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         int var5 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         int var6 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         boolean var7 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         int var8 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         int var9 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         BlockPos var10 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Integer var11 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var12 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -24337;
         short var10002 = 25223;
         short var10003 = 11210;
         short var10004 = 25224;
         short var10005 = -25532;
         short var10006 = 25222;
         short var10007 = 2254;
         short var10008 = 25219;
         short var10009 = 6880;
         short var10010 = 25225;
         short var10011 = -30309;
         short var10012 = 25226;
         short var10013 = 31794;
         short var10014 = 25217;
         short var10015 = -28981;
         short var10016 = 25216;
         short var10017 = 28223;
         short var10018 = 25218;
         short var10019 = -5176;
         short var10020 = 25221;
         short var10021 = 8940;
         short var10022 = 25227;
         short var10023 = -3997;
         short var10024 = 25231;
         short var10025 = 17302;
         return "ProgressSnapshot(enabled="
            + var13
            + ", finished="
            + var12
            + ", treeBlockCount="
            + var11
            + ", target="
            + var10
            + ", previousTargetCount="
            + var9
            + ", thrownAtBlockCount="
            + var8
            + ", waitingForAxeSpawn="
            + var7
            + ", trackedArmorStandCount="
            + var6
            + ", failedAttempts="
            + var5
            + ", committedStrafePos="
            + var4
            + ", jumping="
            + var3
            + ", walkPlatformSize="
            + var2
            + ", predictedSweepBlockCount="
            + var1
            + ")";
      }

      @Override
      public int hashCode() { int var4 = 0; // PX-FIX hoist
        
         int[] var1;
         int var15;
         int var18;
         label40: {
            int[] var10000 = IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.g();
            int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var1 = var10000;
            var15 = var2 * 31;
            Integer var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var18 = 0;
                  break label40;
               }

               var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var18 = var10001.hashCode();
         }

         label34: {
             var4 = var15 + var18;
            var15 = var4 * 31;
            BlockPos var19 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var18 = 0;
                  break label34;
               }

               var19 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var18 = var19.hashCode();
         }

         label28: {
            int var5 = var15 + var18;
            var5 = var5 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            var5 = var5 * 31 + Integer.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
            var5 = var5 * 31 + Boolean.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
            var5 = var5 * 31 + Integer.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
            var5 = var5 * 31 + Integer.hashCode(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
            var15 = var5 * 31;
            Vec3 var21 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            if (var1 != null) {
               if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == null) {
                  var18 = 0;
                  break label28;
               }

               var21 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            var18 = var21.hashCode();
         }

         int var11 = var15 + var18;
         var11 = var11 * 31 + Boolean.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         var11 = var11 * 31 + Integer.hashCode(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
         var11 = var11 * 31 + Integer.hashCode(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         if (var1 == null) {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }

         return var11;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.g();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3;
         label132: {
            var3 = (IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            int var4;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ? 1 : 0;
            byte var10001 = (byte)(var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ? 1 : 0);
            if (var2 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ? 1 : 0;
               if (var2 == null) {
                  break label132;
               }

               var10001 = (byte)(var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ? 1 : 0);
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            ) ? 1 : 0;
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            ) ? 1 : 0;
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         int var5 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var2 != null) {
            if (var4 != var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
               return false;
            }

            var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var5 = var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         if (var2 != null) {
            if (var4 != var5) {
               return false;
            }

            var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ? 1 : 0;
            var5 = var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ? 1 : 0;
         }

         if (var2 != null) {
            if (var4 != var5) {
               return false;
            }

            var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            var5 = var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         label134: {
            if (var2 != null) {
               if (var4 != var5) {
                  return false;
               }

               var4 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               if (var2 == null) {
                  break label134;
               }

               var5 = var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            }

            if (var4 != var5) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            ) ? 1 : 0;
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ? 1 : 0;
         }

         var5 = var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ? 1 : 0;
         if (var2 != null) {
            if (var4 != (var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ? 1 : 0)) {
               return false;
            }

            var4 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            var5 = var3.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         if (var2 != null) {
            if (var4 != var5) {
               return false;
            }

            var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 == null) {
               return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != 0;
            }

            var5 = var3.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         return var4 == var5;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { int var4 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[13];
         int var3 = 0;
         String var2 = "Ç~Ó{¨3owÌíô\b$ñ\u001bÑ\u001bMôSë2\u0015bútö%'×\u0096Ú¿'¤n\u0005\u0090êÈEv\u0097«\u0019\u001e®ìaÏe\u0005\u0000Òz\"\u0082\u000187_L\u009diEp0ò[\"\u0011géÑ\u009a0dýÏ'\u0097\u001b¤â÷.ãð\u000b\u0086\u0098í¼°¬\u001c\u007fë\u001ck\t\rH\u008e®\u0090é\u0091\u0004Ö\nwÂßëxÀ|Î¼µ\u0019¹[ðÒ'¢q(p\u0084´\u008a¾\u009dc²4+\fÛ\u009a\u009c\bä\u0017\u0013[\u0097GUÔ\u009añÿ\u0015\u0098kO£ÜÝ\"\n\u0087\u0080\u0015dÁ \u009f-ÜRÉy.)ðð\u0080Ô$Ñ>úò!\u0015j'bJ\rU0\u0080Î5\u0010ùqg\u0001°»ªRì\u000e";
          var4 = "Ç~Ó{¨3owÌíô\b$ñ\u001bÑ\u001bMôSë2\u0015bútö%'×\u0096Ú¿'¤n\u0005\u0090êÈEv\u0097«\u0019\u001e®ìaÏe\u0005\u0000Òz\"\u0082\u000187_L\u009diEp0ò[\"\u0011géÑ\u009a0dýÏ'\u0097\u001b¤â÷.ãð\u000b\u0086\u0098í¼°¬\u001c\u007fë\u001ck\t\rH\u008e®\u0090é\u0091\u0004Ö\nwÂßëxÀ|Î¼µ\u0019¹[ðÒ'¢q(p\u0084´\u008a¾\u009dc²4+\fÛ\u009a\u009c\bä\u0017\u0013[\u0097GUÔ\u009añÿ\u0015\u0098kO£ÜÝ\"\n\u0087\u0080\u0015dÁ \u009f-ÜRÉy.)ðð\u0080Ô$Ñ>úò!\u0015j'bJ\rU0\u0080Î5\u0010ùqg\u0001°»ªRì\u000e"
            .length();
         char var1 = 22;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 82;
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
                        case 0 -> 118;
                        case 1 -> 5;
                        case 2 -> 36;
                        case 3 -> 90;
                        case 4 -> 85;
                        case 5 -> 69;
                        default -> 104;
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
                        b = new String[13];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "¾\u0099¨×\u0013åc\u008fIÑrïa)VÊö\u001b=±ÜÒ\u0019D\t\u0095Qz\u0006L\u0019_I\u0012\u0000âü\u0098üÉ¶Å\u0088\u008eÉ";
                     var4 = "¾\u0099¨×\u0013åc\u008fIÑrïa)VÊö\u001b=±ÜÒ\u0019D\t\u0095Qz\u0006L\u0019_I\u0012\u0000âü\u0098üÉ¶Å\u0088\u008eÉ".length();
                     var1 = 17;
                     var8 = -1;
               }

               var10000 = 64;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) { short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ 25219) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 248;
               case 1 -> 122;
               case 2 -> 210;
               case 3 -> 98;
               case 4 -> 118;
               case 5 -> 137;
               case 6 -> 142;
               case 7 -> 225;
               case 8 -> 162;
               case 9 -> 97;
               case 10 -> 185;
               case 11 -> 111;
               case 12 -> 188;
               case 13 -> 133;
               case 14 -> 36;
               case 15 -> 13;
               case 16 -> 186;
               case 17 -> 228;
               case 18 -> 233;
               case 19 -> 63;
               case 20 -> 245;
               case 21 -> 202;
               case 22 -> 180;
               case 23 -> 214;
               case 24 -> 170;
               case 25 -> 62;
               case 26 -> 77;
               case 27 -> 236;
               case 28 -> 12;
               case 29 -> 138;
               case 30 -> 192;
               case 31 -> 68;
               case 32 -> 8;
               case 33 -> 116;
               case 34 -> 102;
               case 35 -> 43;
               case 36 -> 104;
               case 37 -> 215;
               case 38 -> 66;
               case 39 -> 145;
               case 40 -> 55;
               case 41 -> 201;
               case 42 -> 189;
               case 43 -> 45;
               case 44 -> 222;
               case 45 -> 95;
               case 46 -> 2;
               case 47 -> 171;
               case 48 -> 195;
               case 49 -> 96;
               case 50 -> 101;
               case 51 -> 114;
               case 52 -> 240;
               case 53 -> 100;
               case 54 -> 149;
               case 55 -> 166;
               case 56 -> 226;
               case 57 -> 139;
               case 58 -> 181;
               case 59 -> 54;
               case 60 -> 108;
               case 61 -> 67;
               case 62 -> 71;
               case 63 -> 144;
               case 64 -> 198;
               case 65 -> 229;
               case 66 -> 216;
               case 67 -> 208;
               case 68 -> 163;
               case 69 -> 227;
               case 70 -> 94;
               case 71 -> 3;
               case 72 -> 91;
               case 73 -> 106;
               case 74 -> 105;
               case 75 -> 193;
               case 76 -> 81;
               case 77 -> 85;
               case 78 -> 57;
               case 79 -> 197;
               case 80 -> 213;
               case 81 -> 24;
               case 82 -> 190;
               case 83 -> 109;
               case 84 -> 120;
               case 85 -> 79;
               case 86 -> 178;
               case 87 -> 25;
               case 88 -> 151;
               case 89 -> 172;
               case 90 -> 23;
               case 91 -> 219;
               case 92 -> 169;
               case 93 -> 134;
               case 94 -> 241;
               case 95 -> 126;
               case 96 -> 82;
               case 97 -> 212;
               case 98 -> 115;
               case 99 -> 200;
               case 100 -> 6;
               case 101 -> 204;
               case 102 -> 243;
               case 103 -> 250;
               case 104 -> 117;
               case 105 -> 221;
               case 106 -> 182;
               case 107 -> 19;
               case 108 -> 7;
               case 109 -> 132;
               case 110 -> 217;
               case 111 -> 15;
               case 112 -> 119;
               case 113 -> 22;
               case 114 -> 135;
               case 115 -> 64;
               case 116 -> 10;
               case 117 -> 32;
               case 118 -> 146;
               case 119 -> 218;
               case 120 -> 50;
               case 121 -> 121;
               case 122 -> 87;
               case 123 -> 199;
               case 124 -> 129;
               case 125 -> 230;
               case 126 -> 159;
               case 127 -> 16;
               case 128 -> 211;
               case 129 -> 37;
               case 130 -> 179;
               case 131 -> 5;
               case 132 -> 220;
               case 133 -> 59;
               case 134 -> 29;
               case 135 -> 69;
               case 136 -> 160;
               case 137 -> 156;
               case 138 -> 165;
               case 139 -> 175;
               case 140 -> 153;
               case 141 -> 48;
               case 142 -> 244;
               case 143 -> 141;
               case 144 -> 223;
               case 145 -> 14;
               case 146 -> 18;
               case 147 -> 232;
               case 148 -> 167;
               case 149 -> 124;
               case 150 -> 38;
               case 151 -> 238;
               case 152 -> 41;
               case 153 -> 113;
               case 154 -> 1;
               case 155 -> 155;
               case 156 -> 53;
               case 157 -> 34;
               case 158 -> 52;
               case 159 -> 103;
               case 160 -> 9;
               case 161 -> 61;
               case 162 -> 60;
               case 163 -> 152;
               case 164 -> 49;
               case 165 -> 239;
               case 166 -> 58;
               case 167 -> 112;
               case 168 -> 72;
               case 169 -> 46;
               case 170 -> 147;
               case 171 -> 21;
               case 172 -> 90;
               case 173 -> 174;
               case 174 -> 196;
               case 175 -> 20;
               case 176 -> 205;
               case 177 -> 246;
               case 178 -> 130;
               case 179 -> 65;
               case 180 -> 224;
               case 181 -> 249;
               case 182 -> 242;
               case 183 -> 51;
               case 184 -> 177;
               case 185 -> 161;
               case 186 -> 150;
               case 187 -> 39;
               case 188 -> 86;
               case 189 -> 78;
               case 190 -> 157;
               case 191 -> 203;
               case 192 -> 89;
               case 193 -> 42;
               case 194 -> 187;
               case 195 -> 27;
               case 196 -> 148;
               case 197 -> 56;
               case 198 -> 237;
               case 199 -> 88;
               case 200 -> 207;
               case 201 -> 136;
               case 202 -> 107;
               case 203 -> 33;
               case 204 -> 209;
               case 205 -> 154;
               case 206 -> 251;
               case 207 -> 26;
               case 208 -> 110;
               case 209 -> 140;
               case 210 -> 123;
               case 211 -> 191;
               case 212 -> 4;
               case 213 -> 173;
               case 214 -> 127;
               case 215 -> 99;
               case 216 -> 125;
               case 217 -> 75;
               case 218 -> 206;
               case 219 -> 84;
               case 220 -> 92;
               case 221 -> 76;
               case 222 -> 70;
               case 223 -> 40;
               case 224 -> 28;
               case 225 -> 194;
               case 226 -> 253;
               case 227 -> 17;
               case 228 -> 183;
               case 229 -> 235;
               case 230 -> 234;
               case 231 -> 11;
               case 232 -> 47;
               case 233 -> 247;
               case 234 -> 44;
               case 235 -> 184;
               case 236 -> 30;
               case 237 -> 128;
               case 238 -> 231;
               case 239 -> 31;
               case 240 -> 131;
               case 241 -> 93;
               case 242 -> 80;
               case 243 -> 158;
               case 244 -> 252;
               case 245 -> 143;
               case 246 -> 83;
               case 247 -> 74;
               case 248 -> 0;
               case 249 -> 255;
               case 250 -> 164;
               case 251 -> 168;
               case 252 -> 35;
               case 253 -> 254;
               case 254 -> 73;
               default -> 176;
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
