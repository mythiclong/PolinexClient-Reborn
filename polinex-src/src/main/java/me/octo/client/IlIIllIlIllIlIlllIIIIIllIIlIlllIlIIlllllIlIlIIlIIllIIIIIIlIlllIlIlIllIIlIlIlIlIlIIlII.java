package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.level.block.Blocks;
import kotlin.comparisons.ComparisonsKt;
import me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
import me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.text.Regex;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII
   extends IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll {
   @NotNull
   private ArrayList<IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = new ArrayList<>();
   private boolean lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = true;
   @NotNull
   private IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   private boolean IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   private final double lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = 4.5;
   @NotNull
   private final List<Vec3> llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   @NotNull
   private final List<Vec3> llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   private final int IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   @NotNull
   private ArrayList<BlockPos> IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   @NotNull
   private List<? extends BlockPos> lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   @NotNull
   private HashMap<BlockPos, ArrayList<Pair<BlockPos, Vec3>>> IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   @Nullable
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   @NotNull
   private Pair<? extends BlockPos, ? extends Vec3> IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   @Nullable
   private List<? extends Vec3> llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private int IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private double IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   @NotNull
   private final HashSet<BlockPos> IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   @Nullable
   private BlockPos IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   @Nullable
   private Vec3 IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
   private long lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll;
   @NotNull
   private List<? extends Vec3> IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
   @NotNull
   private List<? extends Vec3> IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI;
   @NotNull
   private HashMap<BlockPos, Boolean> IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
   @NotNull
   private HashMap<BlockPos, Pair<BlockPos, Vec3>> lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
   private boolean IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl;
   private static String[] c;
   private static String[] d;

   public IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII() {
      super(false, 1, null);
      Vec3[] var1 = new Vec3[]{new Vec3(0.9, 0.0, 0.0), new Vec3(-0.9, 0.0, 0.0), new Vec3(0.0, 0.0, 0.9), new Vec3(0.0, 0.0, -0.9)};
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = CollectionsKt.listOf(var1);
      var1 = new Vec3[]{new Vec3(0.5, 0.0, 0.0), new Vec3(-0.5, 0.0, 0.0), new Vec3(0.0, 0.0, 0.5), new Vec3(0.0, 0.0, -0.5)};
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = CollectionsKt.listOf(var1);
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = 3;
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = new ArrayList<>();
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = CollectionsKt.emptyList();
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = new HashMap<>();
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = new Pair(BlockPos.ZERO, Vec3.ZERO);
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 4.3;
      this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = new HashSet<>();
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = CollectionsKt.emptyList();
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = CollectionsKt.emptyList();
      this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = new HashMap<>();
      this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = new HashMap<>();
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
   }

   @NotNull
   public void c(@NotNull BlockPos pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = false;
      this.a(this.g(pos), pos);
   }

   private final void a(ArrayList<BlockPos> arrayList, BlockPos blockPos) {
        this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = arrayList;
        this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = this.i((List<? extends BlockPos>)this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl);
        this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.clear();
        this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = null;
        this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = false;
        this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = null;
        this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = 0L;
        this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = null;
        this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI.clear();
        this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.clear();
        this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
        super.c(blockPos);
   }

   @NotNull
   public final List<BlockPos> i(@NotNull List<? extends BlockPos> vein) {
      Intrinsics.checkNotNullParameter(vein, "vein");
      if (vein.isEmpty()) {
         return CollectionsKt.emptyList();
      }
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.clear();
      ArrayList var2 = (ArrayList)a(this, vein, false, 0, 6, null);
      HashSet<BlockPos> var3 = new HashSet<>();
      for (BlockPos var4 : vein) {
         ArrayList<Pair<BlockPos, Vec3>> var5 = new ArrayList<>();
         Vec3 var6 = var4.getCenter();
         Intrinsics.checkNotNullExpressionValue(var6, "getCenter(...)");
         for (Object var7o : var2) {
            Pair var7 = (Pair)var7o;
            Vec3 var8 = (Vec3)var7.getSecond();
            if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var8, var6) - 17.64 > 0.0) {
               continue;
            }
            BlockPos var10 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var6, 4.2, CollectionsKt.listOf(RemotePlayer.class), var8).c();
            if (var10 == null || !Intrinsics.areEqual(var10, var4)) {
               continue;
            }
            BlockPos var11 = (BlockPos)var7.getFirst();
            if (!var3.contains(var11)) {
               var3.add(var11);
            }
            var5.add((Pair<BlockPos, Vec3>)var7);
         }
         if (!var5.isEmpty()) {
            this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.put(var4, var5);
         }
      }
      return CollectionsKt.toList(var3);
   }

   static ArrayList a(IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII var0, List var1, boolean var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = false;
      }
      if ((var4 & 4) != 0) {
         var3 = 3;
      }
      return var0.a(var1, var2, var3);
   }

   public final void e(@NotNull List<? extends BlockPos> positions) {
      Intrinsics.checkNotNullParameter(positions, "positions");
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = false;
      if (positions.size() <= 1) {
         BlockPos var2 = CollectionsKt.firstOrNull(positions);
         BlockPos var3 = var2 != null ? var2 : BlockPos.ZERO;
         Intrinsics.checkNotNullExpressionValue(var3, "ZERO");
         this.c(var3);
         return;
      }
      ArrayList<BlockPos> var4 = this.g(CollectionsKt.first(positions));
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var5 = this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
      LinkedHashSet<BlockPos> var6 = new LinkedHashSet<>(var4);
      for (int var7 = 1; var7 < positions.size(); var7++) {
         ArrayList<BlockPos> var8 = this.g(positions.get(var7));
         var6.addAll(var8);
      }
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = var5;
      if (var6.isEmpty()) {
         this.c(CollectionsKt.first(positions));
         return;
      }
      this.a(new ArrayList<>(var6), CollectionsKt.first(positions));
   }

   @Nullable
   public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll f(@NotNull BlockPos startPos) {
      Intrinsics.checkNotNullParameter(startPos, "startPos");
      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return null;
      }
      for (int var3 = -2; var3 < 3; var3++) {
         for (int var4 = -2; var4 < 5; var4++) {
            for (int var5 = -2; var5 < 3; var5++) {
               BlockState var6 = var2.getBlockState(startPos.offset(var3, var4, var5));
               llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var7;
               if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var6)) {
                  var7 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               } else if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var6)) {
                  var7 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               } else if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C(var6)) {
                  var7 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               } else if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var6)) {
                  var7 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               } else {
                  var7 = null;
               }
               if (var7 != null) {
                  return var7;
               }
            }
         }
      }
      return null;
   }

   @NotNull
   public final ArrayList<BlockPos> g(@NotNull BlockPos startPos) {
      Intrinsics.checkNotNullParameter(startPos, "startPos");
      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return new ArrayList<>();
      }
      BlockPos var3 = startPos;
      label200: {
         for (int var4 = -2; var4 < 3; var4++) {
            for (int var5 = -2; var5 < 5; var5++) {
               for (int var6 = -2; var6 < 3; var6++) {
                  BlockPos var7 = startPos.offset(var4, var5, var6);
                  BlockState var8 = var2.getBlockState(var7);
                  llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var9;
                  if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var8)) {
                     var9 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  } else if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var8)) {
                     var9 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  } else if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C(var8)) {
                     var9 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  } else if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var8)) {
                     var9 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                  } else {
                     var9 = null;
                  }
                  if (var9 != null) {
                     this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = var9;
                     var3 = var7;
                     break label200;
                  }
               }
            }
         }
      }
      HashMap<BlockPos, Boolean> var10 = new HashMap<>();
      HashMap<BlockPos, Boolean> var11 = new HashMap<>();
      HashSet<BlockPos> var12 = new HashSet<>();
      ArrayDeque<BlockPos> var13 = new ArrayDeque<>();
      ArrayList<BlockPos> var14 = new ArrayList<>();
      if (!a(var10, var2, var11, this, var3)) {
         return new ArrayList<>();
      }
      var13.add(var3);
      int var15 = 10;
      int var16 = 0;
      while (!var13.isEmpty()) {
         BlockPos var17 = var13.removeFirst();
         if (!var12.add(var17)) {
            continue;
         }
         var14.add(var17);
         for (int var18 = -1; var18 < 2; var18++) {
            for (int var19 = -1; var19 < 2; var19++) {
               for (int var20 = -1; var20 < 2; var20++) {
                  BlockPos var21 = var17.offset(var18, var19, var20);
                  if (!var12.contains(var21) && a(var10, var2, var11, this, var21)) {
                     if (var16 <= var15 || Intrinsics.areEqual(var11.get(var21), Boolean.FALSE)) {
                        var13.add(var21);
                     }
                     if (Intrinsics.areEqual(var11.get(var21), Boolean.TRUE)) {
                        var16++;
                     }
                  }
               }
            }
         }
      }
      return var14.size() >= this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll ? var14 : new ArrayList<>();
   }

   public final ArrayList<IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> V() {
      return this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   }

   public final void b(
      @NotNull ArrayList<IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> var1
   ) {
      short var10001 = -17555;
      short var10002 = 13948;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = var1;
   }

   public final boolean W() {
      return this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   }

   public final void k(boolean var1) {
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = var1;
   }

   @NotNull
   public final List<BlockPos> X() {
      return ((List<BlockPos>)(Object)(this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI));
   }

   @NotNull
   @Override
   protected List<Vec3> v() {
      Collection var12 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Iterable var2 = this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
      boolean var3 = false;
      String var1 = var10000;
      Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      boolean var6 = false;
      Iterator var7 = var2.iterator();

      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var12 = var5;
            BlockPos var9 = (BlockPos)var8;
            if (var1 == null) {
               break;
            }

            boolean var10 = false;
            var5.add(new Vec3(var9.getX() + 0.5, var9.getY() + 1.0, var9.getZ() + 0.5));
            if (var1 != null) {
               continue;
            }
         }

         var12 = var5;
         break;
      }

      return (List<Vec3>)var12;
   }

   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI g(
      @NotNull Vec3 param1
   ) {
      Intrinsics.checkNotNullParameter(param1, "destination");
      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return null;
      }
      Vec3 var3 = param1.add(0.0, 0.3500000000000001, 0.0);
      Intrinsics.checkNotNullExpressionValue(var3, "add(...)");
      ArrayList<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var4 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl, 10));
      for (BlockPos var6 : this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl) {
         BlockState var5 = var2.getBlockState(var6);
         Intrinsics.checkNotNullExpressionValue(var5, "getBlockState(...)");
         var4.add(new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var6, var5));
      }
      ArrayList<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var7 = new ArrayList<>();
      for (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 : var4) {
         BlockState var9 = var8.b();
         if (!this.i().contains(var8.a())
            && (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var9) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var9) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C(var9) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var9))) {
            var7.add(var8);
         }
      }
      ArrayList<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var10 = new ArrayList<>();
      for (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 : var7) {
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var12 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var11.c(), 4.5, CollectionsKt.listOf(RemotePlayer.class), var3);
         if (var12.b() == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && Intrinsics.areEqual(var12.c(), var11.a())) {
            var10.add(var11);
         }
      }
      ArrayList<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var13 = new ArrayList<>();
      for (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var14 : var10) {
         if (this.c(var14.a(), var3)) {
            var13.add(var14);
         }
      }
      Iterator<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var15 = var13.iterator();
      if (!var15.hasNext()) {
         return null;
      }
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var16 = var15.next();
      if (!var15.hasNext()) {
         return var16;
      }
      double var17 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1, var16.c());
      while (var15.hasNext()) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var18 = var15.next();
         double var19 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1, var18.c());
         if (Double.compare(var17, var19) > 0) {
            var16 = var18;
            var17 = var19;
         }
      }
      return var16;
   }

   @Override
   public int h(@NotNull Vec3 param1) {
      Intrinsics.checkNotNullParameter(param1, "eyePos");
      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return 0;
      }
      ArrayList<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var3 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl, 10));
      for (BlockPos var5 : this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl) {
         BlockState var4 = var2.getBlockState(var5);
         Intrinsics.checkNotNullExpressionValue(var4, "getBlockState(...)");
         var3.add(new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var5, var4));
      }
      ArrayList<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var6 = new ArrayList<>();
      for (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 : var3) {
         BlockState var8 = var7.b();
         if (!this.i().contains(var7.a())
            && (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var8) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var8) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C(var8) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var8))) {
            var6.add(var7);
         }
      }
      if (var6.isEmpty()) {
         return 0;
      }
      int var9 = 0;
      for (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10 : var6) {
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var11 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var10.c(), 4.5, CollectionsKt.listOf(RemotePlayer.class), param1);
         if (var11.b() == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && Intrinsics.areEqual(var11.c(), var10.a())) {
            var9++;
         }
      }
      return var9;
   }

   @Override
   public void u() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 1
      // 005: ifnull 024
      // 008: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 00b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.j ()Z
      // 00e: ifeq 025
      // 011: goto 018
      // 014: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 017: athrow
      // 018: aload 0
      // 019: bipush 0
      // 01a: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.i (Z)V
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 023: athrow
      // 024: return
      // 025: aload 0
      // 026: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.k ()Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 029: astore 2
      // 02a: aload 2
      // 02b: ifnonnull 09c
      // 02e: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 031: aload 0
      // 032: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.h ()Lnet/minecraft/core/BlockPos;
      // 035: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 038: astore 3
      // 039: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 03c: aload 3
      // 03d: bipush 0
      // 03e: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 041: dconst_1
      // 042: dcmpl
      // 043: aload 1
      // 044: ifnull 06d
      // 047: ifle 085
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 050: athrow
      // 051: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 054: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 057: aload 3
      // 058: aconst_null
      // 059: bipush 0
      // 05a: bipush 0
      // 05b: dconst_0
      // 05c: bipush 1
      // 05d: bipush 0
      // 05e: dconst_0
      // 05f: sipush 444
      // 062: aconst_null
      // 063: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IZDZZDILjava/lang/Object;)Z
      // 066: goto 06d
      // 069: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06c: athrow
      // 06d: ifeq 085
      // 070: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 073: aload 3
      // 074: bipush 0
      // 075: bipush 2
      // 076: aconst_null
      // 077: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)V
      // 07a: aload 1
      // 07b: ifnonnull 091
      // 07e: goto 085
      // 081: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 084: athrow
      // 085: aload 0
      // 086: bipush 1
      // 087: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.i (Z)V
      // 08a: goto 091
      // 08d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 090: athrow
      // 091: aload 0
      // 092: aconst_null
      // 093: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl Lnet/minecraft/core/BlockPos;
      // 096: aload 0
      // 097: aconst_null
      // 098: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 09b: return
      // 09c: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 09f: astore 3
      // 0a0: aload 2
      // 0a1: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 0a4: astore 4
      // 0a6: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a9: lstore 5
      // 0ab: aload 0
      // 0ac: aload 1
      // 0ad: ifnull 0eb
      // 0b0: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl Lnet/minecraft/core/BlockPos;
      // 0b3: aload 4
      // 0b5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0b8: ifne 0e3
      // 0bb: goto 0c2
      // 0be: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: aload 4
      // 0c5: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl Lnet/minecraft/core/BlockPos;
      // 0c8: aload 0
      // 0c9: lload 5
      // 0cb: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll J
      // 0ce: aload 0
      // 0cf: bipush 0
      // 0d0: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll Z
      // 0d3: aload 0
      // 0d4: aconst_null
      // 0d5: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 0d8: aload 1
      // 0d9: ifnonnull 16d
      // 0dc: goto 0e3
      // 0df: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: goto 0eb
      // 0e7: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ea: athrow
      // 0eb: aload 1
      // 0ec: ifnull 107
      // 0ef: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 0f2: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 0f5: ifnull 110
      // 0f8: goto 0ff
      // 0fb: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: goto 107
      // 103: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 106: athrow
      // 107: lload 5
      // 109: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll J
      // 10c: aload 1
      // 10d: ifnonnull 16d
      // 110: lload 5
      // 112: aload 0
      // 113: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll J
      // 116: lsub
      // 117: lstore 7
      // 119: lload 7
      // 11b: ldc2_w 7500
      // 11e: lcmp
      // 11f: aload 1
      // 120: ifnull 13d
      // 123: ifle 16d
      // 126: goto 12d
      // 129: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12c: athrow
      // 12d: aload 0
      // 12e: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl Ljava/util/HashSet;
      // 131: aload 4
      // 133: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 136: goto 13d
      // 139: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13c: athrow
      // 13d: pop
      // 13e: aload 4
      // 140: sipush -17553
      // 143: sipush 14830
      // 146: pop2
      // 147: ldc_w "§cBlacklisted block at "
      // 14a: swap
      // 14b: sipush -17556
      // 14e: sipush -4191
      // 151: pop2
      // 152: ldc_w " (timeout)"
      // 155: invokedynamic makeConcatWithConstants (Ljava/lang/String;Lnet/minecraft/core/BlockPos;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 15a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 15d: aload 0
      // 15e: aconst_null
      // 15f: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 162: aload 0
      // 163: aconst_null
      // 164: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl Lnet/minecraft/core/BlockPos;
      // 167: aload 0
      // 168: aconst_null
      // 169: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 16c: return
      // 16d: aload 0
      // 16e: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.l ()Lnet/minecraft/world/phys/Vec3;
      // 171: astore 7
      // 173: aload 0
      // 174: aload 1
      // 175: ifnull 18d
      // 178: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl Z
      // 17b: ifeq 217
      // 17e: goto 185
      // 181: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 184: athrow
      // 185: aload 0
      // 186: goto 18d
      // 189: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18c: athrow
      // 18d: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 190: astore 8
      // 192: aload 8
      // 194: ifnull 1b4
      // 197: aload 0
      // 198: aload 1
      // 199: ifnull 256
      // 19c: goto 1a3
      // 19f: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a2: athrow
      // 1a3: aload 8
      // 1a5: aload 4
      // 1a7: invokespecial me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/BlockPos;)Z
      // 1aa: ifne 255
      // 1ad: goto 1b4
      // 1b0: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: aload 1
      // 1b6: ifnull 201
      // 1b9: goto 1c0
      // 1bc: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1bf: athrow
      // 1c0: aload 2
      // 1c1: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 1c4: dup
      // 1c5: ifnull 1f9
      // 1c8: goto 1cf
      // 1cb: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ce: athrow
      // 1cf: astore 11
      // 1d1: aload 11
      // 1d3: astore 12
      // 1d5: astore 18
      // 1d7: bipush 0
      // 1d8: istore 13
      // 1da: aload 0
      // 1db: aload 12
      // 1dd: aload 4
      // 1df: invokespecial me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/BlockPos;)Z
      // 1e2: istore 19
      // 1e4: aload 18
      // 1e6: iload 19
      // 1e8: ifeq 1f4
      // 1eb: aload 11
      // 1ed: goto 1f5
      // 1f0: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f3: athrow
      // 1f4: aconst_null
      // 1f5: dup
      // 1f6: ifnonnull 210
      // 1f9: pop
      // 1fa: goto 201
      // 1fd: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 200: athrow
      // 201: aload 0
      // 202: checkcast me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll
      // 205: aload 4
      // 207: aconst_null
      // 208: aconst_null
      // 209: bipush 0
      // 20a: bipush 14
      // 20c: aconst_null
      // 20d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Lnet/minecraft/world/phys/Vec3;
      // 210: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 213: aload 1
      // 214: ifnonnull 255
      // 217: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 21a: aload 2
      // 21b: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 21e: bipush 1
      // 21f: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 222: dstore 8
      // 224: aload 0
      // 225: aload 1
      // 226: ifnull 24e
      // 229: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 22c: ifnull 246
      // 22f: goto 236
      // 232: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 235: athrow
      // 236: dload 8
      // 238: ldc2_w 4.5
      // 23b: dcmpg
      // 23c: ifge 255
      // 23f: goto 246
      // 242: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 245: athrow
      // 246: aload 0
      // 247: goto 24e
      // 24a: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 24d: athrow
      // 24e: aload 2
      // 24f: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 252: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 255: aload 0
      // 256: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 259: astore 8
      // 25b: aload 1
      // 25c: ifnull 27e
      // 25f: aload 7
      // 261: ifnull 282
      // 264: goto 26b
      // 267: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 26a: athrow
      // 26b: aload 0
      // 26c: checkcast me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll
      // 26f: aconst_null
      // 270: aload 7
      // 272: bipush 1
      // 273: aconst_null
      // 274: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)V
      // 277: goto 27e
      // 27a: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 27d: athrow
      // 27e: aload 1
      // 27f: ifnonnull 2b0
      // 282: aload 0
      // 283: checkcast me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll
      // 286: aload 1
      // 287: ifnull 2a6
      // 28a: goto 291
      // 28d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 290: athrow
      // 291: aload 8
      // 293: dup
      // 294: ifnonnull 2aa
      // 297: goto 29e
      // 29a: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 29d: athrow
      // 29e: pop
      // 29f: goto 2a6
      // 2a2: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a5: athrow
      // 2a6: aload 2
      // 2a7: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 2aa: aconst_null
      // 2ab: bipush 2
      // 2ac: aconst_null
      // 2ad: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)V
      // 2b0: aload 0
      // 2b1: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl Z
      // 2b4: ifne 32d
      // 2b7: aload 8
      // 2b9: ifnull 32d
      // 2bc: goto 2c3
      // 2bf: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c2: athrow
      // 2c3: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 2c6: aload 8
      // 2c8: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d (Lnet/minecraft/world/phys/Vec3;)D
      // 2cb: ldc2_w 0.1
      // 2ce: dcmpg
      // 2cf: ifgt 32d
      // 2d2: goto 2d9
      // 2d5: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d8: athrow
      // 2d9: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 2dc: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 2df: astore 9
      // 2e1: aload 9
      // 2e3: aload 1
      // 2e4: ifnull 2f3
      // 2e7: ifnull 32d
      // 2ea: goto 2f1
      // 2ed: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f0: athrow
      // 2f1: aload 9
      // 2f3: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 2f6: aload 4
      // 2f8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 2fb: ifne 32d
      // 2fe: aload 0
      // 2ff: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.k ()Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 302: dup
      // 303: ifnull 327
      // 306: goto 30d
      // 309: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 30c: athrow
      // 30d: aload 0
      // 30e: checkcast me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll
      // 311: aload 4
      // 313: aload 8
      // 315: aconst_null
      // 316: bipush 0
      // 317: bipush 12
      // 319: aconst_null
      // 31a: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Lnet/minecraft/world/phys/Vec3;
      // 31d: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lnet/minecraft/world/phys/Vec3;)V
      // 320: goto 328
      // 323: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 326: athrow
      // 327: pop
      // 328: aload 0
      // 329: aconst_null
      // 32a: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI Lnet/minecraft/world/phys/Vec3;
      // 32d: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 330: aload 1
      // 331: ifnull 349
      // 334: aload 8
      // 336: dup
      // 337: ifnonnull 34d
      // 33a: goto 341
      // 33d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 340: athrow
      // 341: pop
      // 342: goto 349
      // 345: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 348: athrow
      // 349: aload 2
      // 34a: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 34d: bipush 1
      // 34e: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 351: dstore 9
      // 353: aload 0
      // 354: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl Z
      // 357: aload 1
      // 358: ifnull 392
      // 35b: ifeq 370
      // 35e: goto 365
      // 361: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 364: athrow
      // 365: aload 0
      // 366: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII D
      // 369: goto 3a3
      // 36c: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 36f: athrow
      // 370: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 373: aload 0
      // 374: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll Lkotlin/Pair;
      // 377: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 37a: dup
      // 37b: sipush -17545
      // 37e: sipush 5654
      // 381: pop2
      // 382: ldc_w "<get-second>(...)"
      // 385: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 388: checkcast net/minecraft/world/phys/Vec3
      // 38b: aload 3
      // 38c: ldc2_w 0.3
      // 38f: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 392: ifeq 39f
      // 395: ldc2_w 4.5
      // 398: goto 3a3
      // 39b: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 39e: athrow
      // 39f: aload 0
      // 3a0: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII D
      // 3a3: dstore 11
      // 3a5: aload 0
      // 3a6: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl Z
      // 3a9: aload 1
      // 3aa: ifnull 4a6
      // 3ad: ifeq 4a1
      // 3b0: goto 3b7
      // 3b3: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b6: athrow
      // 3b7: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u ()Lnet/minecraft/world/phys/Vec3;
      // 3ba: astore 14
      // 3bc: aload 0
      // 3bd: aload 4
      // 3bf: aload 14
      // 3c1: invokespecial me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.d (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Z
      // 3c4: istore 15
      // 3c6: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 3c9: aload 0
      // 3ca: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll Lkotlin/Pair;
      // 3cd: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 3d0: dup
      // 3d1: sipush -17589
      // 3d4: sipush 22726
      // 3d7: pop2
      // 3d8: ldc_w "<get-second>(...)"
      // 3db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3de: checkcast net/minecraft/world/phys/Vec3
      // 3e1: aload 3
      // 3e2: ldc2_w 0.3
      // 3e5: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 3e8: istore 16
      // 3ea: aload 1
      // 3eb: ifnull 40a
      // 3ee: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 3f1: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 3f4: dup
      // 3f5: ifnull 409
      // 3f8: goto 3ff
      // 3fb: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3fe: athrow
      // 3ff: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 402: goto 40b
      // 405: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 408: athrow
      // 409: pop
      // 40a: aconst_null
      // 40b: astore 17
      // 40d: iload 15
      // 40f: aload 1
      // 410: ifnull 459
      // 413: ifeq 455
      // 416: goto 41d
      // 419: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 41c: athrow
      // 41d: aload 17
      // 41f: aload 4
      // 421: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 424: aload 1
      // 425: ifnull 43b
      // 428: goto 42f
      // 42b: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 42e: athrow
      // 42f: ifne 449
      // 432: goto 439
      // 435: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 438: athrow
      // 439: iload 16
      // 43b: aload 1
      // 43c: ifnull 459
      // 43f: ifeq 455
      // 442: goto 449
      // 445: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 448: athrow
      // 449: aload 0
      // 44a: bipush 1
      // 44b: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll Z
      // 44e: goto 455
      // 451: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 454: athrow
      // 455: aload 0
      // 456: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll Z
      // 459: aload 1
      // 45a: ifnull 49e
      // 45d: ifne 49d
      // 460: goto 467
      // 463: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 466: athrow
      // 467: iload 15
      // 469: aload 1
      // 46a: ifnull 49e
      // 46d: goto 474
      // 470: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 473: athrow
      // 474: ifne 49d
      // 477: goto 47e
      // 47a: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 47d: athrow
      // 47e: iload 16
      // 480: aload 1
      // 481: ifnull 49e
      // 484: goto 48b
      // 487: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48a: athrow
      // 48b: ifne 49d
      // 48e: goto 495
      // 491: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 494: athrow
      // 495: bipush 1
      // 496: goto 4cc
      // 499: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 49c: athrow
      // 49d: bipush 0
      // 49e: goto 4cc
      // 4a1: dload 9
      // 4a3: dload 11
      // 4a5: dcmpl
      // 4a6: aload 1
      // 4a7: ifnull 4c8
      // 4aa: ifgt 4c0
      // 4ad: goto 4b4
      // 4b0: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4b3: athrow
      // 4b4: aload 8
      // 4b6: ifnonnull 4cb
      // 4b9: goto 4c0
      // 4bc: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4bf: athrow
      // 4c0: bipush 1
      // 4c1: goto 4c8
      // 4c4: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4c7: athrow
      // 4c8: goto 4cc
      // 4cb: bipush 0
      // 4cc: istore 13
      // 4ce: aload 0
      // 4cf: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.p ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 4d2: sipush 5000
      // 4d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4d8: checkcast java/lang/Number
      // 4db: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 4de: aload 1
      // 4df: ifnull 53c
      // 4e2: ifeq 52f
      // 4e5: goto 4ec
      // 4e8: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4eb: athrow
      // 4ec: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 4ef: sipush -17557
      // 4f2: sipush 28423
      // 4f5: pop2
      // 4f6: ldc_w "sneak"
      // 4f9: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 4fc: aload 1
      // 4fd: ifnull 521
      // 500: goto 507
      // 503: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 506: athrow
      // 507: ifeq 566
      // 50a: goto 511
      // 50d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 510: athrow
      // 511: dload 9
      // 513: dload 11
      // 515: ldc2_w 0.5
      // 518: dadd
      // 519: dcmpg
      // 51a: goto 521
      // 51d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 520: athrow
      // 521: aload 1
      // 522: ifnull 53c
      // 525: ifge 566
      // 528: goto 52f
      // 52b: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 52e: athrow
      // 52f: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 532: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.P ()Z
      // 535: goto 53c
      // 538: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 53b: athrow
      // 53c: aload 1
      // 53d: ifnull 563
      // 540: ifeq 55b
      // 543: goto 54a
      // 546: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 549: athrow
      // 54a: aload 0
      // 54b: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII Lme/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 54e: getstatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 551: if_acmpne 566
      // 554: goto 55b
      // 557: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 55a: athrow
      // 55b: bipush 1
      // 55c: goto 563
      // 55f: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 562: athrow
      // 563: goto 567
      // 566: bipush 0
      // 567: istore 14
      // 569: iload 13
      // 56b: aload 1
      // 56c: ifnull 68c
      // 56f: ifeq 67b
      // 572: goto 579
      // 575: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 578: athrow
      // 579: aload 0
      // 57a: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll Lkotlin/Pair;
      // 57d: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 580: dup
      // 581: sipush -17589
      // 584: sipush 22726
      // 587: pop2
      // 588: ldc_w "<get-second>(...)"
      // 58b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 58e: checkcast net/minecraft/world/phys/Vec3
      // 591: astore 15
      // 593: aload 0
      // 594: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII Ljava/util/List;
      // 597: astore 16
      // 599: aload 16
      // 59b: ifnull 625
      // 59e: aload 0
      // 59f: aload 1
      // 5a0: ifnull 5ce
      // 5a3: goto 5aa
      // 5a6: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5a9: athrow
      // 5aa: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII I
      // 5ad: aload 16
      // 5af: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 5b2: if_icmpgt 625
      // 5b5: goto 5bc
      // 5b8: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5bb: athrow
      // 5bc: aload 16
      // 5be: aload 0
      // 5bf: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII I
      // 5c2: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5c7: goto 5ce
      // 5ca: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5cd: athrow
      // 5ce: checkcast net/minecraft/world/phys/Vec3
      // 5d1: astore 17
      // 5d3: aload 1
      // 5d4: ifnull 621
      // 5d7: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 5da: aload 17
      // 5dc: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 5df: ldc2_w 0.2
      // 5e2: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 5e5: ifeq 600
      // 5e8: goto 5ef
      // 5eb: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5ee: athrow
      // 5ef: aload 0
      // 5f0: aload 0
      // 5f1: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII I
      // 5f4: bipush 1
      // 5f5: iadd
      // 5f6: putfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII I
      // 5f9: goto 600
      // 5fc: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5ff: athrow
      // 600: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 603: aload 16
      // 605: aload 0
      // 606: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII I
      // 609: bipush 1
      // 60a: isub
      // 60b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 610: checkcast net/minecraft/world/phys/Vec3
      // 613: aload 17
      // 615: bipush 0
      // 616: dconst_0
      // 617: bipush 8
      // 619: aconst_null
      // 61a: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 61d: aload 17
      // 61f: astore 15
      // 621: aload 1
      // 622: ifnonnull 652
      // 625: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 628: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 62b: aload 0
      // 62c: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll Lkotlin/Pair;
      // 62f: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 632: dup
      // 633: sipush -17589
      // 636: sipush 22726
      // 639: pop2
      // 63a: ldc_w "<get-second>(...)"
      // 63d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 640: checkcast net/minecraft/world/phys/Vec3
      // 643: bipush 0
      // 644: dconst_0
      // 645: bipush 8
      // 647: aconst_null
      // 648: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 64b: goto 652
      // 64e: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 651: athrow
      // 652: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 655: aload 3
      // 656: aload 15
      // 658: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 65b: ldc2_w 3.0
      // 65e: dcmpl
      // 65f: aload 1
      // 660: ifnull 66e
      // 663: ifle 670
      // 666: goto 66d
      // 669: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 66c: athrow
      // 66d: bipush 0
      // 66e: istore 14
      // 670: aload 0
      // 671: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.p ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 674: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 677: aload 1
      // 678: ifnonnull 6cd
      // 67b: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 67e: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 681: aload 0
      // 682: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl Z
      // 685: goto 68c
      // 688: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 68b: athrow
      // 68c: aload 1
      // 68d: ifnull 6cf
      // 690: ifne 6cd
      // 693: goto 69a
      // 696: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 699: athrow
      // 69a: dload 9
      // 69c: ldc2_w 1.5
      // 69f: dcmpg
      // 6a0: aload 1
      // 6a1: ifnull 6cf
      // 6a4: goto 6ab
      // 6a7: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6aa: athrow
      // 6ab: ifge 6cd
      // 6ae: goto 6b5
      // 6b1: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6b4: athrow
      // 6b5: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 6b8: sipush -17568
      // 6bb: sipush 7806
      // 6be: pop2
      // 6bf: ldc_w "backward"
      // 6c2: bipush 1
      // 6c3: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 6c6: goto 6cd
      // 6c9: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6cc: athrow
      // 6cd: iload 14
      // 6cf: aload 1
      // 6d0: ifnull 706
      // 6d3: ifne 6ef
      // 6d6: goto 6dd
      // 6d9: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6dc: athrow
      // 6dd: aload 0
      // 6de: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.q ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 6e1: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 6e4: aload 1
      // 6e5: ifnonnull 717
      // 6e8: goto 6ef
      // 6eb: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6ee: athrow
      // 6ef: aload 0
      // 6f0: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.q ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 6f3: sipush 300
      // 6f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6f9: checkcast java/lang/Number
      // 6fc: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 6ff: goto 706
      // 702: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 705: athrow
      // 706: aload 1
      // 707: ifnull 715
      // 70a: ifne 717
      // 70d: goto 714
      // 710: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 713: athrow
      // 714: bipush 0
      // 715: istore 14
      // 717: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 71a: sipush -17588
      // 71d: sipush 22894
      // 720: pop2
      // 721: ldc_w "sneak"
      // 724: iload 14
      // 726: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 729: return
   }

   @Override
   public void A() {
String var1 = me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
if (var1 == null) {
   return;
}
if (!me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.a().G()) {
   super.A();
   return;
}
if (!me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) {
   super.A();
   return;
}
me.octo.client.utils.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var2 = me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.a().bq();
if (var2 == null) {
   super.A();
   return;
}
Regex var3 = new Regex("(\\d{1,2}(?:\\.\\d)?|99\\.9)%");
List var4 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h();
for (Object var7 : var4) {
   String var8 = (String)var7;
   if (!StringsKt.endsWith(var8, "%", false)) {
      continue;
   }
   Map var10 = (Map)me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.a().bp();
   boolean var11 = false;
   if (!var10.isEmpty()) {
      Iterator var12 = var10.entrySet().iterator();
      while (var12.hasNext()) {
         Map.Entry var13 = (Map.Entry)var12.next();
         Map.Entry var14 = var13;
         if (StringsKt.contains((CharSequence)var8, (CharSequence)var14.getKey(), false)) {
            var11 = true;
            break;
         }
      }
   }
   if (!var11) {
      continue;
   }
   kotlin.text.MatchResult var18 = var3.find((CharSequence)var8, 0);
   if (var18 == null) {
      continue;
   }
   kotlin.text.MatchGroupCollection var19 = var18.getGroups();
   if (var19 == null) {
      continue;
   }
   kotlin.text.MatchGroup var20 = var19.get(0);
   if (var20 == null) {
      continue;
   }
   String var22 = var20.getValue();
   if (var22 == null) {
      continue;
   }
   String var23 = StringsKt.removeSuffix(var22, "%");
   if (var23 == null) {
      continue;
   }
   double var16 = Double.parseDouble(var23);
   if (var16 > 70.0) {
      return;
   }
}
super.A();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void b(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      short var10001 = -17599;
      short var10002 = -14169;
      Intrinsics.checkNotNullParameter(var1, "event");
      llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
         llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
            .o()
      );
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      double var4 = 0.2;
      Iterable var6 = this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
      boolean var7 = false;
      Iterator var8 = var6.iterator();
      String var2 = var10000;

      while (var8.hasNext()) {
         Object var9 = var8.next();
         Vec3 var10 = (Vec3)var9;
         boolean var11 = false;

         try {
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               new AABB(var10.x - var4, var10.y - var4, var10.z - var4, var10.x + var4, var10.y + var4, var10.z + var4),
               null,
               var3,
               1.5F,
               null,
               null,
               0.0F,
               false,
               0.0F);
            if (var2 != null && var2 != null) {
               continue;
            }
            break;
         } catch (NoWhenBranchMatchedException var12) {
            throw (RuntimeException)a(var12);
         }
      }
   }

   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI E() {
      ClientLevel var1 = this.a().level;
      if (var1 == null) {
         return null;
      }
      try {
         if (this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl) {
            return this.a(var1);
         }
         switch (((int[])IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.ordinal()]) {
            case 1:
            case 2:
               return this.c(var1);
            case 3:
            case 4:
               return this.b(var1);
            default:
               throw new NoWhenBranchMatchedException();
         }
      } catch (NoWhenBranchMatchedException var12) {
         throw (RuntimeException)a(var12);
      }
   }

   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI b(
      ClientLevel param1
   ) {
      String var2 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Vec3 var3 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      Vec3 var4 = var3.add(0.0, 1.27, 0.0);
      Intrinsics.checkNotNullExpressionValue(var4, "add(...)");
      ArrayList var5 = new ArrayList(this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.size());
      Iterator var6 = this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.iterator();
      Intrinsics.checkNotNullExpressionValue(var6, "iterator(...)");
      while (var6.hasNext()) {
         BlockPos var7 = (BlockPos)var6.next();
         Intrinsics.checkNotNullExpressionValue(var7, "next(...)");
         if (!this.i().contains(var7) && !this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.contains(var7)) {
            BlockState var8 = param1.getBlockState(var7);
            Intrinsics.checkNotNullExpressionValue(var8, "getBlockState(...)");
            if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               if (!me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C(var8)) {
                  continue;
               }
            } else if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               if (!me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var8)) {
                  continue;
               }
            }
            var5.add(new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var7, var8));
         }
      }
      List var6b = CollectionsKt.listOf(RemotePlayer.class);
      if (this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl) {
         ArrayList var7b = new ArrayList(128);
         List var8b = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(1.0, 3.0);
         Vec3 var9 = new Vec3(0.0, 1.27, 0.0);
         Iterator var10 = var8b.iterator();
         while (var10.hasNext()) {
            BlockPos var11 = (BlockPos)var10.next();
            Vec3 var12 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var11);
            var7b.add(TuplesKt.to(var11, var12.add(var9)));
            if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               Iterator var13 = this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl.iterator();
               while (var13.hasNext()) {
                  Vec3 var14 = (Vec3)var13.next();
                  Vec3 var15 = var12.add(var14);
                  Intrinsics.checkNotNullExpressionValue(var15, "add(...)");
                  BlockPos var16 = BlockPos.containing(var15);
                  Intrinsics.checkNotNullExpressionValue(var16, "containing(...)");
                  if (param1.getBlockState(var16).isAir() && param1.getBlockState(var16.offset(0, -1, 0)).isAir()) {
                     var7b.add(TuplesKt.to(var11, var15.add(var9)));
                  }
               }
            }
         }
         this.a((List)var5, (List)var7b, (List)var6b);
      }
      Iterable var8c = this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI.keySet();
      Intrinsics.checkNotNullExpressionValue(var8c, "<get-keys>(...)");
      ArrayList var11c = new ArrayList();
      Iterator var13c = var8c.iterator();
      while (var13c.hasNext()) {
         Object var14c = var13c.next();
         BlockPos var15c = (BlockPos)var14c;
         BlockState var17c = param1.getBlockState(var15c);
         Intrinsics.checkNotNullExpressionValue(var17c, "getBlockState(...)");
         if (var17c.isAir() || var17c.is(Blocks.BEDROCK)) {
            var11c.add(var14c);
         }
      }
      List var7c = (List)var11c;
      for (Object var11c2 : var7c) {
         BlockPos var12c = (BlockPos)var11c2;
         this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI.remove(var12c);
         this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.remove(var12c);
      }
      HashMap var8d = new HashMap(var5.size());
      double var26 = 5.0;
      while (var26 <= 10.0) {
         ArrayList var14d = new ArrayList();
         Iterator var16d = var5.iterator();
         while (var16d.hasNext()) {
            Object var17d = var16d.next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var18d = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var17d;
            double var20 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4, var18d.c());
            if (var20 < var26 && Intrinsics.areEqual(this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI.get(var18d.a()), (Object)Boolean.valueOf(true)) && this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.get(var18d.a()) != null && !this.d(var18d.a())) {
               var14d.add(var17d);
            }
         }
         List var10d = (List)var14d;
         if (var10d.isEmpty()) {
            var26 += 1.0;
         } else {
            List var11d = CollectionsKt.sortedWith((Iterable)var10d, (java.util.Comparator)new IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(var8d, this));
            Iterator var12d = var11d.iterator();
            while (var12d.hasNext()) {
               IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13d = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var12d.next();
               Pair var14e = this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.get(var13d.a());
               if (var14e == null) {
                  continue;
               }
               if (this.b(var13d.c(), (Vec3)var14e.getSecond())) {
                  continue;
               }
               this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = var14e;
               List var16e = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (Object)var14e.getFirst(), false, 2, (Object)null);
               List var15 = null;
               if (var16e != null) {
                  ArrayList var18e = new ArrayList();
                  Iterator var21e = ((Iterable)var16e).iterator();
                  while (var21e.hasNext()) {
                     Object var22 = var21e.next();
                     me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var23 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var22;
                     var18e.add(var23.b());
                  }
                  Vec3 var21f = (Vec3)var14e.getSecond();
                  int var22f = CollectionsKt.getLastIndex((List)var18e);
                  if (var22f > 0 && this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
                     if (var21f.x % 1.0 - 0.5 < 1.0E-4) {
                        var18e.set(var22f, var21f);
                     } else if (var21f.z % 1.0 - 0.5 < 1.0E-4) {
                        var18e.set(var22f, var21f);
                     } else if (lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (Vec3)var18e.get(var22f - 1), var21f, (Vec3)null, 0, false, 0.0, false, false, 0.0, 508, (Object)null)) {
                        var18e.set(var22f, var21f);
                     }
                  }
                  var15 = var18e;
               }
               this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = var15;
               this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = 1;
               if (var15 != null) {
                  this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = var15;
               }
               this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 4.3 + Random.Default.nextDouble() * 0.1;
               return var13d;
            }
            var26 += 1.0;
         }
      }
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
      return null;
   }

   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI c(
      ClientLevel param1
   ) {
      String var2 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      ArrayList var27 = new ArrayList();
      for (BlockPos var12a : this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl) {
         if (!this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.containsKey(var12a)) {
            var27.add(var12a);
         }
      }
      List var28 = new ArrayList();
      for (Object var11a : var27) {
         BlockPos var12b = (BlockPos)var11a;
         BlockState var30 = param1.getBlockState(var12b);
         Intrinsics.checkNotNullExpressionValue(var30, "getBlockState(...)");
         var28.add(new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var12b, var30));
      }
      List var4 = new ArrayList();
      for (Object var13a : var28) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13b = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var13a;
         BlockState var14a = var13b.b();
         if (!this.i().contains(var13b.a()) && !this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.contains(var13b.a())) {
            boolean var15a;
            if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               var15a = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var14a);
            } else if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               var15a = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var14a);
            } else {
               var15a = false;
            }
            if (var15a) {
               var4.add(var13a);
            }
         }
      }
      List var5 = new ArrayList();
      for (Object var5a : var4) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5b = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var5a;
         if (this.c(var5b)) {
            var5.add(var5b);
         }
      }
      int var6 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII ? var5.size() : ((List)var4).size();
      int var7 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII ? 0 : 5;
      if (var6 <= var7) {
         return null;
      }
      Collection var10 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII ? (Collection)var5 : (Collection)var4;
      Iterable var10a = var10.isEmpty() ? (Iterable)var4 : (Iterable)var10;
      List var10b = new ArrayList();
      for (Object var19a : var10a) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var19b = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var19a;
         if (this.d(var19b.a())) {
            var10b.add(var19b);
         }
      }
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = null;
      Iterator var20a = var10b.iterator();
      if (var20a.hasNext()) {
         var8 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var20a.next();
         double var8a = this.b(var8);
         while (var20a.hasNext()) {
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var20b = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var20a.next();
            double var20c = this.b(var20b);
            if (Double.compare(var8a, var20c) > 0) {
               var8 = var20b;
               var8a = var20c;
            }
         }
      }
      if (var8 == null) {
         return null;
      }
      ArrayList var9 = (ArrayList)this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.get(var8.a());
      if (var9 == null) {
         return null;
      }
      List var14 = new ArrayList();
      for (Object var21a : var9) {
         Pair var21b = (Pair)var21a;
         if (!this.b(var8.c(), (Vec3)var21b.getSecond())) {
            var14.add(var21b);
         }
      }
      Pair var11 = null;
      Iterator var22a = var14.iterator();
      if (var22a.hasNext()) {
         var11 = (Pair)var22a.next();
         double var11a = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((Vec3)var11.getSecond(), var8.c()) + me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((Vec3)var11.getSecond(), var3);
         while (var22a.hasNext()) {
            Pair var22b = (Pair)var22a.next();
            double var22c = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((Vec3)var22b.getSecond(), var8.c()) + me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((Vec3)var22b.getSecond(), var3);
            if (Double.compare(var11a, var22c) > 0) {
               var11 = var22b;
               var11a = var22c;
            }
         }
      }
      if (var11 == null) {
         return null;
      }
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = var11;
      List var9a = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (Object)var11.getFirst(), false, 2, (Object)null);
      List var15 = null;
      if (var9a != null) {
         ArrayList var23a = new ArrayList();
         for (Object var23b : var9a) {
            me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var23c = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var23b;
            var23a.add(var23c.b());
         }
         ArrayList var13c = (ArrayList)CollectionsKt.toCollection((Iterable)var23a, (Collection)new ArrayList());
         if (var13c != null) {
            Vec3 var16a = (Vec3)var11.getSecond();
            if (CollectionsKt.getLastIndex((List)var13c) > 0 && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (Vec3)var13c.get(CollectionsKt.getLastIndex((List)var13c) - 1), var16a, (Vec3)null, 0, false, 0.0, false, false, 0.0, 508, (Object)null)) {
               var13c.set(CollectionsKt.getLastIndex((List)var13c), var16a);
            }
            Vec3 var17 = (Vec3)var13c.get(CollectionsKt.getLastIndex((List)var13c));
            Vec3 var19c = var8.c();
            me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var20d = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var17, var19c);
            Vec3 var30a = Vec3.ZERO;
            Intrinsics.checkNotNullExpressionValue(var30a, "ZERO");
            me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var22d = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var17, var30a, var20d.a(), var20d.b(), true);
            for (int var23d = 1; var23d < 101; var23d++) {
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 1.0, 0.0, var22d, false, 0.0, 24, (Object)null);
               if (var24 == null) {
                  continue;
               }
               var22d = var24;
               if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var24.a().add(0.0, 1.27, 0.0), var19c) < 16.0 || me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
                  var13c.add(var24.a());
               }
            }
            var15 = var13c;
         }
      }
      this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = var15;
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = 1;
      if (this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII != null) {
         this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
      }
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 4.3 + Random.Default.nextDouble() * 0.1;
      return var8;
   }

   private final double b(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1
   ) {
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 == null) {
         return Double.MAX_VALUE;
      }
      me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      if (var3 == null) {
         return Double.MAX_VALUE;
      }
      Vec3 var4 = param1.c();
      double var5 = 15.0;
      boolean var6 = false;
      me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
      if (var2 != null && var3.k() <= 100 && var7 != null && this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII != IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var7.c(), var4) < 3.0) {
            var5 += 1.5;
         }
         List var8 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.a(), 1, 1, 1);
         int var9 = 0;
         for (BlockPos var10 : (Iterable<BlockPos>)var8) {
            if (this.a().level.getBlockState(var10).is(Blocks.BEDROCK)) {
               var9++;
            }
         }
         var5 += (double)var9 * 0.5;
      }
      var5 += me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var4, true) * 1.3;
      var5 += me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var4) * 0.2;
      return var5;
   }

   public final void f(@NotNull List<? extends BlockPos> param1) {
      String var2 = me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "positions");
      net.minecraft.client.multiplayer.ClientLevel var3;
      if (this.a().level == null) {
         net.minecraft.core.BlockPos var10 = (net.minecraft.core.BlockPos) kotlin.collections.CollectionsKt.firstOrNull(param1);
         this.c(var10 != null ? var10 : net.minecraft.core.BlockPos.ZERO);
         return;
      }
      var3 = this.a().level;
      java.util.LinkedHashSet var4 = new java.util.LinkedHashSet();
      for (net.minecraft.core.BlockPos var6 : param1) {
         net.minecraft.core.BlockPos var8 = this.e(var6);
         if (var8 == null) {
            continue;
         }
         var4.add(var8);
      }
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = true;
      net.minecraft.core.BlockPos var5a = (net.minecraft.core.BlockPos) kotlin.collections.CollectionsKt.firstOrNull((Iterable) var4);
      net.minecraft.core.BlockPos var5;
      if (var5a != null) {
         var5 = var5a;
      } else {
         net.minecraft.core.BlockPos var5b = (net.minecraft.core.BlockPos) kotlin.collections.CollectionsKt.firstOrNull(param1);
         var5 = var5b != null ? var5b : net.minecraft.core.BlockPos.ZERO;
      }
      if (!var4.isEmpty()) {
         this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = this.a(var3.getBlockState((net.minecraft.core.BlockPos) kotlin.collections.CollectionsKt.first((Iterable) var4)));
      }
      this.a(new java.util.ArrayList<net.minecraft.core.BlockPos>(var4), var5);
   }

   private final BlockPos e(BlockPos param1) {
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 == null || this.a().level == null) {
         return null;
      }
      ClientLevel var3 = this.a().level;
      BlockState var4 = var3.getBlockState(param1);
      Intrinsics.checkNotNullExpressionValue(var4, "getBlockState(...)");
      return this.a(var4) != null ? param1 : null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 22
      // 08: aload 0
      // 09: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 0c: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 0f: dup
      // 10: ifnonnull 24
      // 13: goto 1a
      // 16: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 19: athrow
      // 1a: pop
      // 1b: goto 22
      // 1e: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 21: athrow
      // 22: aconst_null
      // 23: areturn
      // 24: astore 3
      // 25: aload 0
      // 26: aload 3
      // 27: aload 1
      // 28: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 2b: dup
      // 2c: sipush -17585
      // 2f: sipush -25795
      // 32: pop2
      // 33: ldc_w "getBlockState(...)"
      // 36: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 39: invokespecial me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lnet/minecraft/world/level/block/state/BlockState;)Lme/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 3c: ifnull 47
      // 3f: aload 1
      // 40: goto 48
      // 43: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 46: athrow
      // 47: aconst_null
      // 48: areturn
   }

   private final boolean a(Vec3 var1, BlockPos var2) {
      Vec3 var3 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
      return Intrinsics.areEqual(
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1, var3.distanceTo(var1) + 0.5, CollectionsKt.listOf(RemotePlayer.class), var3)
            .c(),
         var2
      );
   }

   private final boolean d(BlockPos param1, Vec3 param2) {
      String var3 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 == null) {
         return false;
      }
      ClientLevel var4 = this.a().level;
      if (var4 == null) {
         return false;
      }
      BlockState var5 = var4.getBlockState(param1);
      Intrinsics.checkNotNullExpressionValue(var5, "getBlockState(...)");
      AABB var6 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, var5);
      if (param2.distanceToSqr(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param2, var6)) - this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII * this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII > 0.0) {
         return false;
      }
      List var7 = CollectionsKt.listOf(RemotePlayer.class);
      if (Intrinsics.areEqual(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param2, var6), this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII, var7, param2).c(), param1)) {
         return true;
      }
      Iterable var8 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var6, param2);
      if (var8 instanceof Collection && ((Collection)var8).isEmpty()) {
         return false;
      }
      for (Vec3 var10 : (Iterable<Vec3>)var8) {
         if (param2.distanceToSqr(var10) - this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII * this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII <= 0.0 && Intrinsics.areEqual(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var10, this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII, var7, param2).c(), param1)) {
            return true;
         }
      }
      return false;
   }

   private final Pair<BlockPos, Vec3> e(BlockPos param1, Vec3 param2) {
Vec3 var4 = param1.getCenter();
Intrinsics.checkNotNullExpressionValue(var4, "getCenter(...)");
ArrayList var5 = a(this, CollectionsKt.listOf(param1), false, 6, 2, null);
ArrayList var6 = new ArrayList();
for (Object var7 : (Iterable)var5) { Pair var8 = (Pair)var7; if (this.d(param1, (Vec3)var8.getSecond()) && !this.b(var4, (Vec3)var8.getSecond())) { var6.add(var7); } }
Iterable var9 = CollectionsKt.sortedWith((Iterable)var6, (java.util.Comparator)new IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var4, param2));
for (Object var10 : var9) { Pair var11 = (Pair)var10; if (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (Object)var11.getFirst(), false, 2, (Object)null) != null) { return (Pair<BlockPos, Vec3>)var11; } }
return null;
   }

   private final IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
      BlockState param1
   ) {
if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(param1)) { return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(param1)) { return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C(param1)) { return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
if (this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.contains(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(param1)) { return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
return null;
   }

   @Nullable
   public final BlockPos g(@NotNull List<? extends BlockPos> param1) {
      String var2 = me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      ClientLevel var3 = this.a().level;
      var var4 = this.a().player;
      if (var3 == null || var4 == null || param1.isEmpty()) {
         return null;
      }
      HashMap<BlockPos, Boolean> var5 = new HashMap<>();
      Map<Pair<Integer, Integer>, BlockPos> var6 = new java.util.LinkedHashMap<>();
      for (BlockPos var15 : param1) {
         var6.put(new Pair<Integer, Integer>(var15.getX(), var15.getZ()), var15);
      }
      kotlin.ranges.IntRange var7 = new kotlin.ranges.IntRange(-2, 2);
      kotlin.ranges.IntRange var8 = new kotlin.ranges.IntRange(-2, 2);
      int var9 = var7.getLast() - var7.getFirst() + var8.getLast() - var8.getFirst();
      BlockPos var10 = null;
      int var11 = Integer.MAX_VALUE;
      for (BlockPos var16 : param1) {
         int var18 = 0;
         int var19 = 0;
         for (int var20 = var7.getFirst(); var20 <= var7.getLast(); var20++) {
            for (int var22 = var8.getFirst(); var22 <= var8.getLast(); var22++) {
               BlockPos var24 = var16.offset(var20, 2, var22);
               boolean var25 = (Boolean)var5.computeIfAbsent(var24, k -> Boolean.valueOf(!var3.getBlockState(var24).isAir()));
               if (var25) {
                  ++var18;
               }
               if (var6.containsKey(new Pair<Integer, Integer>(var24.getX(), var24.getZ()))) {
                  ++var19;
               }
            }
         }
         int var26 = var18 + var19 + var9;
         if (!((double)(var18 + var19) >= Math.ceil((double)var9 / 2.0) + 5.0)) {
            var26 -= var9;
         }
         if (var10 == null || var26 < var11) {
            var10 = var16;
            var11 = var26;
         }
      }
      return var10;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -17600
      // 007: sipush -17432
      // 00a: pop2
      // 00b: ldc_w "positions"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: aload 0
      // 012: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 015: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 018: astore 3
      // 019: astore 2
      // 01a: aload 0
      // 01b: invokevirtual me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 01e: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 021: astore 4
      // 023: aload 3
      // 024: ifnull 043
      // 027: aload 4
      // 029: ifnull 043
      // 02c: goto 033
      // 02f: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 032: athrow
      // 033: aload 1
      // 034: invokeinterface java/util/List.isEmpty ()Z 1
      // 039: ifeq 049
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 042: athrow
      // 043: aconst_null
      // 044: areturn
      // 045: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 048: athrow
      // 049: new java/util/HashMap
      // 04c: dup
      // 04d: invokespecial java/util/HashMap.<init> ()V
      // 050: astore 5
      // 052: aload 1
      // 053: checkcast java/lang/Iterable
      // 056: astore 7
      // 058: bipush 0
      // 059: istore 8
      // 05b: aload 7
      // 05d: bipush 10
      // 05f: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 062: invokestatic kotlin/collections/MapsKt.mapCapacity (I)I
      // 065: bipush 16
      // 067: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 06a: istore 9
      // 06c: aload 7
      // 06e: astore 10
      // 070: new java/util/LinkedHashMap
      // 073: dup
      // 074: iload 9
      // 076: invokespecial java/util/LinkedHashMap.<init> (I)V
      // 079: checkcast java/util/Map
      // 07c: astore 11
      // 07e: bipush 0
      // 07f: istore 12
      // 081: aload 10
      // 083: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 088: astore 13
      // 08a: aload 13
      // 08c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 091: ifeq 0d5
      // 094: aload 13
      // 096: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09b: astore 14
      // 09d: aload 11
      // 09f: aload 14
      // 0a1: checkcast net/minecraft/core/BlockPos
      // 0a4: astore 15
      // 0a6: aload 2
      // 0a7: ifnull 0d8
      // 0aa: astore 26
      // 0ac: bipush 0
      // 0ad: istore 16
      // 0af: new kotlin/Pair
      // 0b2: dup
      // 0b3: aload 15
      // 0b5: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 0b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bb: aload 15
      // 0bd: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 0c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c3: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0c6: aload 26
      // 0c8: swap
      // 0c9: aload 14
      // 0cb: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d0: pop
      // 0d1: aload 2
      // 0d2: ifnonnull 08a
      // 0d5: aload 11
      // 0d7: nop
      // 0d8: astore 6
      // 0da: new kotlin/ranges/IntRange
      // 0dd: dup
      // 0de: bipush -2
      // 0e0: bipush 2
      // 0e1: invokespecial kotlin/ranges/IntRange.<init> (II)V
      // 0e4: astore 7
      // 0e6: new kotlin/ranges/IntRange
      // 0e9: dup
      // 0ea: bipush -2
      // 0ec: bipush 2
      // 0ed: invokespecial kotlin/ranges/IntRange.<init> (II)V
      // 0f0: astore 8
      // 0f2: aload 7
      // 0f4: invokevirtual kotlin/ranges/IntRange.getLast ()I
      // 0f7: aload 7
      // 0f9: invokevirtual kotlin/ranges/IntRange.getFirst ()I
      // 0fc: isub
      // 0fd: aload 8
      // 0ff: invokevirtual kotlin/ranges/IntRange.getLast ()I
      // 102: aload 8
      // 104: invokevirtual kotlin/ranges/IntRange.getFirst ()I
      // 107: isub
      // 108: iadd
      // 109: istore 9
      // 10b: aconst_null
      // 10c: astore 10
      // 10e: bipush 0
      // 10f: istore 11
      // 111: ldc_w 2147483647
      // 114: istore 11
      // 116: aload 1
      // 117: checkcast java/lang/Iterable
      // 11a: astore 12
      // 11c: bipush 0
      // 11d: istore 13
      // 11f: aload 12
      // 121: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 126: astore 14
      // 128: aload 14
      // 12a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12f: ifeq 2c2
      // 132: aload 14
      // 134: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 139: astore 15
      // 13b: aload 15
      // 13d: checkcast net/minecraft/core/BlockPos
      // 140: astore 16
      // 142: bipush 0
      // 143: istore 17
      // 145: bipush 0
      // 146: istore 18
      // 148: bipush 0
      // 149: istore 19
      // 14b: aload 7
      // 14d: invokevirtual kotlin/ranges/IntRange.getFirst ()I
      // 150: istore 20
      // 152: aload 7
      // 154: invokevirtual kotlin/ranges/IntRange.getLast ()I
      // 157: istore 21
      // 159: aload 2
      // 15a: ifnull 2c3
      // 15d: iload 20
      // 15f: iload 21
      // 161: aload 2
      // 162: ifnull 258
      // 165: goto 16c
      // 168: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16b: athrow
      // 16c: if_icmpgt 24a
      // 16f: goto 176
      // 172: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 175: athrow
      // 176: aload 8
      // 178: invokevirtual kotlin/ranges/IntRange.getFirst ()I
      // 17b: istore 22
      // 17d: aload 8
      // 17f: invokevirtual kotlin/ranges/IntRange.getLast ()I
      // 182: istore 23
      // 184: iload 22
      // 186: iload 23
      // 188: if_icmpgt 22a
      // 18b: aload 16
      // 18d: iload 20
      // 18f: bipush 2
      // 190: iload 22
      // 192: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 195: dup
      // 196: sipush -17542
      // 199: sipush -30755
      // 19c: pop2
      // 19d: ldc_w "offset(...)"
      // 1a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1a3: astore 24
      // 1a5: aload 5
      // 1a7: aload 24
      // 1a9: aload 3
      // 1aa: aload 24
      // 1ac: invokedynamic invoke (Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.b (Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/lang/Boolean;, (Lnet/minecraft/core/BlockPos;)Ljava/lang/Boolean; ]
      // 1b1: invokedynamic apply (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.c (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;, (Ljava/lang/Object;)Ljava/lang/Boolean; ]
      // 1b6: invokevirtual java/util/HashMap.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
      // 1b9: dup
      // 1ba: sipush -17552
      // 1bd: sipush -2589
      // 1c0: pop2
      // 1c1: ldc_w "computeIfAbsent(...)"
      // 1c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1c7: checkcast java/lang/Boolean
      // 1ca: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1cd: istore 25
      // 1cf: iload 25
      // 1d1: aload 2
      // 1d2: ifnull 22c
      // 1d5: ifeq 1db
      // 1d8: iinc 18 1
      // 1db: aload 6
      // 1dd: new kotlin/Pair
      // 1e0: dup
      // 1e1: aload 24
      // 1e3: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 1e6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e9: aload 24
      // 1eb: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 1ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f1: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 1f4: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1f9: aload 2
      // 1fa: ifnull 20c
      // 1fd: ifeq 20a
      // 200: goto 207
      // 203: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 206: athrow
      // 207: iinc 19 1
      // 20a: iload 22
      // 20c: iload 23
      // 20e: aload 2
      // 20f: ifnull 22e
      // 212: if_icmpeq 22a
      // 215: goto 21c
      // 218: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 21b: athrow
      // 21c: iinc 22 1
      // 21f: aload 2
      // 220: ifnonnull 18b
      // 223: goto 22a
      // 226: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 229: athrow
      // 22a: iload 20
      // 22c: iload 21
      // 22e: aload 2
      // 22f: ifnull 258
      // 232: if_icmpeq 24a
      // 235: goto 23c
      // 238: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 23b: athrow
      // 23c: iinc 20 1
      // 23f: aload 2
      // 240: ifnonnull 176
      // 243: goto 24a
      // 246: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 249: athrow
      // 24a: iload 18
      // 24c: iload 19
      // 24e: iadd
      // 24f: iload 9
      // 251: iadd
      // 252: istore 20
      // 254: iload 18
      // 256: iload 19
      // 258: iadd
      // 259: i2d
      // 25a: iload 9
      // 25c: i2d
      // 25d: ldc2_w 2.0
      // 260: ddiv
      // 261: invokestatic java/lang/Math.ceil (D)D
      // 264: bipush 5
      // 265: i2d
      // 266: dadd
      // 267: dcmpg
      // 268: aload 2
      // 269: ifnull 282
      // 26c: ifge 284
      // 26f: goto 276
      // 272: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 275: athrow
      // 276: iload 20
      // 278: iload 9
      // 27a: isub
      // 27b: goto 282
      // 27e: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 281: athrow
      // 282: istore 20
      // 284: aload 10
      // 286: aload 2
      // 287: ifnull 2b6
      // 28a: ifnull 2ad
      // 28d: goto 294
      // 290: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 293: athrow
      // 294: iload 20
      // 296: aload 2
      // 297: ifnull 2ba
      // 29a: goto 2a1
      // 29d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a0: athrow
      // 2a1: iload 11
      // 2a3: if_icmpge 2bc
      // 2a6: goto 2ad
      // 2a9: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ac: athrow
      // 2ad: aload 16
      // 2af: goto 2b6
      // 2b2: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b5: athrow
      // 2b6: astore 10
      // 2b8: iload 20
      // 2ba: istore 11
      // 2bc: nop
      // 2bd: nop
      // 2be: aload 2
      // 2bf: ifnonnull 128
      // 2c2: nop
      // 2c3: aload 10
      // 2c5: areturn
   }

   @NotNull
   public final ArrayList<BlockPos> h(@NotNull List<? extends BlockPos> param1) {
      String var2 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      List<Vec3> var3 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(param1, 10));
      for (BlockPos var11 : param1) {
         var3.add(var11.getCenter());
      }
      ArrayList<Pair<BlockPos, Vec3>> var4 = (ArrayList<Pair<BlockPos, Vec3>>)(ArrayList)a(this, param1, true, 0, 4, null);
      ArrayList<Pair<BlockPos, Vec3>> var5 = new ArrayList<>();
      for (Pair<BlockPos, Vec3> var10 : var4) {
         boolean var12 = false;
         for (Vec3 var17 : var3) {
            Intrinsics.checkNotNull(var17);
            if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var17, var10.getSecond()) < 4.5) {
               var12 = true;
               break;
            }
         }
         if (var12) {
            var5.add(var10);
         }
      }
      List<BlockPos> var6 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(var5, 10));
      for (Pair<BlockPos, Vec3> var13 : var5) {
         var6.add(var13.getFirst());
      }
      return (ArrayList<BlockPos>)CollectionsKt.toCollection(var6, new ArrayList<BlockPos>());
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush -17591
      // 004: sipush 28029
      // 007: pop2
      // 008: ldc_w "vein"
      // 00b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00e: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 011: aload 1
      // 012: checkcast java/lang/Iterable
      // 015: astore 4
      // 017: astore 2
      // 018: bipush 0
      // 019: istore 5
      // 01b: aload 4
      // 01d: astore 6
      // 01f: new java/util/ArrayList
      // 022: dup
      // 023: aload 4
      // 025: bipush 10
      // 027: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 02a: invokespecial java/util/ArrayList.<init> (I)V
      // 02d: checkcast java/util/Collection
      // 030: astore 7
      // 032: bipush 0
      // 033: istore 8
      // 035: aload 6
      // 037: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 03c: astore 9
      // 03e: aload 9
      // 040: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 045: ifeq 075
      // 048: aload 9
      // 04a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04f: astore 10
      // 051: aload 7
      // 053: aload 10
      // 055: checkcast net/minecraft/core/BlockPos
      // 058: astore 11
      // 05a: aload 2
      // 05b: ifnull 077
      // 05e: astore 19
      // 060: bipush 0
      // 061: istore 12
      // 063: aload 11
      // 065: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 068: aload 19
      // 06a: swap
      // 06b: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 070: pop
      // 071: aload 2
      // 072: ifnonnull 03e
      // 075: aload 7
      // 077: checkcast java/util/List
      // 07a: nop
      // 07b: astore 3
      // 07c: aload 0
      // 07d: aload 1
      // 07e: bipush 1
      // 07f: bipush 0
      // 080: bipush 4
      // 081: aconst_null
      // 082: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lme/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII;Ljava/util/List;ZIILjava/lang/Object;)Ljava/util/ArrayList;
      // 085: checkcast java/lang/Iterable
      // 088: astore 4
      // 08a: nop
      // 08b: bipush 0
      // 08c: istore 5
      // 08e: aload 4
      // 090: astore 6
      // 092: new java/util/ArrayList
      // 095: dup
      // 096: invokespecial java/util/ArrayList.<init> ()V
      // 099: checkcast java/util/Collection
      // 09c: astore 7
      // 09e: bipush 0
      // 09f: istore 8
      // 0a1: aload 6
      // 0a3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0a8: astore 9
      // 0aa: aload 9
      // 0ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b1: ifeq 189
      // 0b4: aload 9
      // 0b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bb: astore 10
      // 0bd: aload 10
      // 0bf: checkcast kotlin/Pair
      // 0c2: astore 11
      // 0c4: bipush 0
      // 0c5: istore 12
      // 0c7: aload 3
      // 0c8: checkcast java/lang/Iterable
      // 0cb: astore 13
      // 0cd: bipush 0
      // 0ce: istore 14
      // 0d0: aload 13
      // 0d2: aload 2
      // 0d3: ifnull 117
      // 0d6: instanceof java/util/Collection
      // 0d9: aload 2
      // 0da: ifnull 1b0
      // 0dd: goto 0e4
      // 0e0: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e3: athrow
      // 0e4: ifeq 115
      // 0e7: goto 0ee
      // 0ea: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ed: athrow
      // 0ee: aload 13
      // 0f0: checkcast java/util/Collection
      // 0f3: aload 2
      // 0f4: ifnull 117
      // 0f7: goto 0fe
      // 0fa: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fd: athrow
      // 0fe: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 103: ifeq 115
      // 106: goto 10d
      // 109: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10c: athrow
      // 10d: bipush 0
      // 10e: goto 16c
      // 111: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 114: athrow
      // 115: aload 13
      // 117: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 11c: astore 15
      // 11e: aload 15
      // 120: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 125: ifeq 16b
      // 128: aload 15
      // 12a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12f: astore 16
      // 131: aload 16
      // 133: checkcast net/minecraft/world/phys/Vec3
      // 136: astore 17
      // 138: bipush 0
      // 139: istore 18
      // 13b: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 13e: aload 17
      // 140: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 143: aload 17
      // 145: aload 11
      // 147: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 14a: checkcast net/minecraft/world/phys/Vec3
      // 14d: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 150: ldc2_w 4.5
      // 153: dcmpg
      // 154: aload 2
      // 155: ifnull 15c
      // 158: ifge 15f
      // 15b: bipush 1
      // 15c: goto 160
      // 15f: bipush 0
      // 160: ifeq 11e
      // 163: bipush 1
      // 164: aload 2
      // 165: ifnull 154
      // 168: goto 16c
      // 16b: bipush 0
      // 16c: nop
      // 16d: aload 2
      // 16e: ifnull 184
      // 171: ifeq 0aa
      // 174: goto 17b
      // 177: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17a: athrow
      // 17b: aload 7
      // 17d: aload 10
      // 17f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 184: pop
      // 185: aload 2
      // 186: ifnonnull 0aa
      // 189: aload 7
      // 18b: checkcast java/util/List
      // 18e: nop
      // 18f: checkcast java/lang/Iterable
      // 192: astore 4
      // 194: nop
      // 195: bipush 0
      // 196: istore 5
      // 198: aload 4
      // 19a: astore 6
      // 19c: new java/util/ArrayList
      // 19f: dup
      // 1a0: aload 4
      // 1a2: bipush 10
      // 1a4: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 1a7: invokespecial java/util/ArrayList.<init> (I)V
      // 1aa: checkcast java/util/Collection
      // 1ad: astore 7
      // 1af: bipush 0
      // 1b0: istore 8
      // 1b2: aload 6
      // 1b4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1b9: astore 9
      // 1bb: aload 9
      // 1bd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c2: ifeq 1f5
      // 1c5: aload 9
      // 1c7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1cc: astore 10
      // 1ce: aload 7
      // 1d0: aload 10
      // 1d2: checkcast kotlin/Pair
      // 1d5: astore 11
      // 1d7: aload 2
      // 1d8: ifnull 20b
      // 1db: astore 19
      // 1dd: bipush 0
      // 1de: istore 12
      // 1e0: aload 11
      // 1e2: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 1e5: checkcast net/minecraft/core/BlockPos
      // 1e8: aload 19
      // 1ea: swap
      // 1eb: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 1f0: pop
      // 1f1: aload 2
      // 1f2: ifnonnull 1bb
      // 1f5: aload 7
      // 1f7: checkcast java/util/List
      // 1fa: nop
      // 1fb: checkcast java/lang/Iterable
      // 1fe: new java/util/ArrayList
      // 201: dup
      // 202: invokespecial java/util/ArrayList.<init> ()V
      // 205: checkcast java/util/Collection
      // 208: invokestatic kotlin/collections/CollectionsKt.toCollection (Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;
      // 20b: checkcast java/util/ArrayList
      // 20e: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 211: ifnonnull 221
      // 214: ldc_w "HND1zb"
      // 217: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.b (Ljava/lang/String;)V
      // 21a: goto 221
      // 21d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 220: athrow
      // 221: areturn
   }

   private final ArrayList<Pair<BlockPos, Vec3>> a(List<? extends BlockPos> param1, boolean param2, int param3) {
      String var4 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      ClientLevel var5 = this.a().level;
      if (var5 == null || param1.isEmpty()) {
         return new ArrayList<>();
      }
      ArrayList<BlockPos> var6 = new ArrayList<>();
      HashSet<Pair<Integer, Integer>> var7 = new HashSet<>();
      for (BlockPos var12 : param1) {
         var6.addAll(a(param3, var7, var5, var12));
      }
      ArrayList<Pair<BlockPos, Vec3>> var8 = new ArrayList<>();
      for (BlockPos var13 : var6) {
         Vec3 var15 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var13).add(0.0, 1.27, 0.0);
         Intrinsics.checkNotNullExpressionValue(var15, "add(...)");
         if (param2) {
            var8.add(TuplesKt.to(var13, var15));
         } else {
            ArrayList<Pair<BlockPos, Vec3>> var17 = CollectionsKt.arrayListOf(TuplesKt.to(var13, var15));
            for (Vec3 var18 : this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI) {
               var17.add(TuplesKt.to(var13, var15.add(var18)));
            }
            var8.addAll(var17);
         }
      }
      return var8;
   }

   private final boolean c(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1
   ) {
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 == null) {
         return this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
      }
      if (!this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII) {
         return false;
      }
      BlockState var3 = param1.b();
      return var3.is(Blocks.SMOOTH_RED_SANDSTONE) || var3.is(Blocks.CLAY);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII Z
      // 08: aload 2
      // 09: ifnull 17
      // 0c: ifne 18
      // 0f: goto 16
      // 12: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: aload 1
      // 19: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Lnet/minecraft/world/level/block/state/BlockState;
      // 1c: astore 3
      // 1d: aload 3
      // 1e: getstatic net/minecraft/world/level/block/Blocks.SMOOTH_RED_SANDSTONE Lnet/minecraft/world/level/block/Block;
      // 21: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 24: aload 2
      // 25: ifnull 4f
      // 28: ifne 4e
      // 2b: goto 32
      // 2e: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 31: athrow
      // 32: aload 3
      // 33: getstatic net/minecraft/world/level/block/Blocks.CLAY Lnet/minecraft/world/level/block/Block;
      // 36: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 39: aload 2
      // 3a: ifnull 4f
      // 3d: goto 44
      // 40: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 43: athrow
      // 44: ifeq 52
      // 47: goto 4e
      // 4a: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   private static final Boolean a(ClientLevel var0, BlockPos var1, BlockPos var2) {
      short var10001 = -17560;
      short var10002 = 26248;
      Intrinsics.checkNotNullParameter(var2, "it");
      return var0.getBlockState(var1).isAir();
   }

   private static final Boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Integer a(BlockPos var0, HashMap var1, ClientLevel var2, BlockPos var3) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = -17560;
      short var10003 = 26248;
      Intrinsics.checkNotNullParameter(var3, "it");
      String var4 = var10000;
      int var5 = 0;
      int var6 = -1;

      label51:
      while (true) {
         int var10 = var6;

         label48:
         while (var10 < 2) {
            if (var4 == null) {
               return -1;
            }

            int var7 = -1;

            while (var7 < 2) {
               BlockPos var12 = var0.offset(var6, 2, var7);
               var10002 = -17542;
               var10003 = -30755;
               Intrinsics.checkNotNullExpressionValue(var12, "offset(...)");
               BlockPos var8 = var12;

               label58: {
                  try {
                     if (var4 == null) {
                        break label58;
                     }

                     var10 = ((Integer)(var1.computeIfAbsent(var8, null)));
                     if (var4 == null) {
                        continue label48;
                     }
                  } catch (NoWhenBranchMatchedException var9) {
                     throw (RuntimeException)a(var9);
                  }

                  if (var10 == 0) {
                     var5++;
                  }

                  var7++;
               }

               if (var4 == null) {
                  break;
               }
            }

            var6++;
            if (var4 != null) {
               continue label51;
            }
            break;
         }

         return var5;
      }
   }

   private static final Integer b(Function1 var0, Object var1) {
      return (Integer)var0.invoke(var1);
   }

   private static final int a(HashMap<BlockPos, Integer> var0, HashMap<BlockPos, Boolean> var1, ClientLevel var2, BlockPos var3) {
      Object var10000 = var0.computeIfAbsent(var3, null);
      short var10002 = -17537;
      short var10003 = 28290;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return ((Number)var10000).intValue();
   }

   private static final Pair a(Vec3 var0, HashMap var1, HashMap var2, ClientLevel var3, Pair var4) {
      short var10001 = -17560;
      short var10002 = 26248;
      Intrinsics.checkNotNullParameter(var4, "it");
      return TuplesKt.to(
         var4,
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var0, (Vec3)var4.getSecond())
            + a(var1, var2, var3, (BlockPos)var4.getFirst())
      );
   }

   private static final Boolean b(ClientLevel var0, BlockPos var1, BlockPos var2) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = -17544;
      short var10003 = 5789;
      Intrinsics.checkNotNullParameter(var2, "it");
      String var3 = var10000;

      try {
         boolean var5 = var0.getBlockState(var1).isAir();
         if (var3 == null) {
            return var5;
         }

         if (!var5) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw (RuntimeException)a(var4);
      }

      return false;
   }

   private static final Boolean c(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean a(ClientLevel param0, BlockPos param1) {
      for (int var3 = -1; var3 < 2; ++var3) {
         for (int var4 = -1; var4 < 2; ++var4) {
            for (int var5 = -1; var5 < 2; ++var5) {
               BlockState var6 = param0.getBlockState(param1.offset(var3, var5, var4));
               Intrinsics.checkNotNullExpressionValue(var6, "getBlockState(...)");
               if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var6) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var6) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.D(var6) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var6) || var6.is(Blocks.BEDROCK)) {
                  return true;
               }
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
      // 00: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 03: bipush -1
      // 04: istore 3
      // 05: astore 2
      // 06: iload 3
      // 07: bipush 2
      // 08: if_icmpge e7
      // 0b: bipush -1
      // 0c: aload 2
      // 0d: ifnull e8
      // 10: istore 4
      // 12: iload 4
      // 14: bipush 2
      // 15: if_icmpge e0
      // 18: bipush -1
      // 19: aload 2
      // 1a: ifnull 07
      // 1d: istore 5
      // 1f: iload 5
      // 21: bipush 2
      // 22: if_icmpge d9
      // 25: aload 0
      // 26: aload 1
      // 27: iload 3
      // 28: iload 5
      // 2a: iload 4
      // 2c: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 2f: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 32: dup
      // 33: sipush -17585
      // 36: sipush -25795
      // 39: pop2
      // 3a: ldc_w "getBlockState(...)"
      // 3d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 40: astore 6
      // 42: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 45: aload 6
      // 47: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.l (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 4a: aload 2
      // 4b: ifnull 14
      // 4e: aload 2
      // 4f: ifnull d1
      // 52: ifne d0
      // 55: goto 5c
      // 58: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5b: athrow
      // 5c: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 5f: aload 6
      // 61: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.m (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 64: aload 2
      // 65: ifnull d1
      // 68: goto 6f
      // 6b: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6e: athrow
      // 6f: ifne d0
      // 72: goto 79
      // 75: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 78: athrow
      // 79: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 7c: aload 6
      // 7e: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.D (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 81: aload 2
      // 82: ifnull d1
      // 85: goto 8c
      // 88: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 8b: athrow
      // 8c: ifne d0
      // 8f: goto 96
      // 92: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 95: athrow
      // 96: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 99: aload 6
      // 9b: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.n (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 9e: aload 2
      // 9f: ifnull d1
      // a2: goto a9
      // a5: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // a8: athrow
      // a9: ifne d0
      // ac: goto b3
      // af: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b2: athrow
      // b3: aload 6
      // b5: getstatic net/minecraft/world/level/block/Blocks.BEDROCK Lnet/minecraft/world/level/block/Block;
      // b8: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // bb: aload 2
      // bc: ifnull d1
      // bf: goto c6
      // c2: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // c5: athrow
      // c6: ifeq d2
      // c9: goto d0
      // cc: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // cf: athrow
      // d0: bipush 1
      // d1: ireturn
      // d2: iinc 5 1
      // d5: aload 2
      // d6: ifnonnull 1f
      // d9: iinc 4 1
      // dc: aload 2
      // dd: ifnonnull 12
      // e0: iinc 3 1
      // e3: aload 2
      // e4: ifnonnull 06
      // e7: bipush 0
      // e8: ireturn
   }

   private static final boolean b(ClientLevel param0, BlockPos param1) {
      BlockState var3 = param0.getBlockState(param1);
      Intrinsics.checkNotNullExpressionValue(var3, "getBlockState(...)");
      if (IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var3) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var3) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.D(var3) || IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var3) || var3.is(Blocks.BEDROCK) || var3.is(Blocks.INFESTED_STONE)) {
         return false;
      } else {
         return lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i(param1);
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 08: dup
      // 09: sipush -17585
      // 0c: sipush -25795
      // 0f: pop2
      // 10: ldc_w "getBlockState(...)"
      // 13: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 16: astore 3
      // 17: astore 2
      // 18: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 1b: aload 3
      // 1c: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.l (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 1f: aload 2
      // 20: ifnull 3b
      // 23: ifne d9
      // 26: goto 2d
      // 29: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c: athrow
      // 2d: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 30: aload 3
      // 31: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.m (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 34: goto 3b
      // 37: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3a: athrow
      // 3b: aload 2
      // 3c: ifnull 57
      // 3f: ifne d9
      // 42: goto 49
      // 45: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48: athrow
      // 49: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 4c: aload 3
      // 4d: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.D (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 50: goto 57
      // 53: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 56: athrow
      // 57: aload 2
      // 58: ifnull 73
      // 5b: ifne d9
      // 5e: goto 65
      // 61: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 64: athrow
      // 65: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 68: aload 3
      // 69: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.n (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 6c: goto 73
      // 6f: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 72: athrow
      // 73: aload 2
      // 74: ifnull 8f
      // 77: ifne d9
      // 7a: goto 81
      // 7d: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 80: athrow
      // 81: aload 3
      // 82: getstatic net/minecraft/world/level/block/Blocks.BEDROCK Lnet/minecraft/world/level/block/Block;
      // 85: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 88: goto 8f
      // 8b: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 8e: athrow
      // 8f: aload 2
      // 90: ifnull ab
      // 93: ifne d9
      // 96: goto 9d
      // 99: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 9c: athrow
      // 9d: aload 3
      // 9e: getstatic net/minecraft/world/level/block/Blocks.INFESTED_STONE Lnet/minecraft/world/level/block/Block;
      // a1: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // a4: goto ab
      // a7: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // aa: athrow
      // ab: aload 2
      // ac: ifnull c7
      // af: ifne d9
      // b2: goto b9
      // b5: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b8: athrow
      // b9: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // bc: aload 1
      // bd: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.i (Lnet/minecraft/core/BlockPos;)Z
      // c0: goto c7
      // c3: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // c6: athrow
      // c7: aload 2
      // c8: ifnull d6
      // cb: ifeq d9
      // ce: goto d5
      // d1: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // d4: athrow
      // d5: bipush 1
      // d6: goto da
      // d9: bipush 0
      // da: ireturn
   }

   private static final ArrayList<BlockPos> a(int param0, HashSet<Pair<Integer, Integer>> param1, ClientLevel param2, BlockPos param3) {
      String var4 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      ArrayList<BlockPos> var5 = new ArrayList<>();
      for (int var6 = -param0; var6 <= param0; var6++) {
         for (int var7 = -param0; var7 <= param0; var7++) {
            BlockPos var8 = param3.offset(var6, 0, var7);
            Intrinsics.checkNotNullExpressionValue(var8, "offset(...)");
            if (!param1.contains(new Pair<Integer, Integer>(var8.getX(), var8.getZ()))) {
               param1.add(new Pair<Integer, Integer>(var8.getX(), var8.getZ()));
               for (int var9 = 0; var9 > -6; var9--) {
                  BlockPos var10 = var8.offset(0, var9, 0);
                  Intrinsics.checkNotNullExpressionValue(var10, "offset(...)");
                  if (b(param2, var10) && !a(param2, var10)) {
                     var5.add(var10);
                  }
               }
            }
         }
      }
      return var5;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d ()Ljava/lang/String;
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 5
      // 00c: astore 4
      // 00e: iload 0
      // 00f: ineg
      // 010: istore 6
      // 012: iload 6
      // 014: aload 4
      // 016: ifnull 02d
      // 019: iload 0
      // 01a: if_icmpgt 142
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 023: athrow
      // 024: iload 0
      // 025: ineg
      // 026: goto 02d
      // 029: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02c: athrow
      // 02d: istore 7
      // 02f: iload 7
      // 031: iload 0
      // 032: if_icmpgt 12d
      // 035: aload 3
      // 036: iload 6
      // 038: bipush 0
      // 039: iload 7
      // 03b: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 03e: dup
      // 03f: sipush -17542
      // 042: sipush -30755
      // 045: pop2
      // 046: ldc_w "offset(...)"
      // 049: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 04c: astore 8
      // 04e: aload 1
      // 04f: new kotlin/Pair
      // 052: dup
      // 053: aload 8
      // 055: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 058: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05b: aload 8
      // 05d: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 060: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 063: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 066: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 069: aload 4
      // 06b: ifnull 12f
      // 06e: ifne 10c
      // 071: aload 1
      // 072: new kotlin/Pair
      // 075: dup
      // 076: aload 8
      // 078: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 07b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07e: aload 8
      // 080: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 083: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 086: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 089: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 08c: pop
      // 08d: bipush 0
      // 08e: aload 4
      // 090: ifnull 10e
      // 093: goto 09a
      // 096: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 099: athrow
      // 09a: istore 9
      // 09c: bipush -6
      // 09e: iload 9
      // 0a0: if_icmpge 10c
      // 0a3: aload 8
      // 0a5: bipush 0
      // 0a6: iload 9
      // 0a8: bipush 0
      // 0a9: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 0ac: dup
      // 0ad: sipush -17542
      // 0b0: sipush -30755
      // 0b3: pop2
      // 0b4: ldc_w "offset(...)"
      // 0b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ba: astore 10
      // 0bc: aload 4
      // 0be: ifnull 107
      // 0c1: aload 2
      // 0c2: aload 10
      // 0c4: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.b (Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;)Z
      // 0c7: aload 4
      // 0c9: ifnull 10e
      // 0cc: goto 0d3
      // 0cf: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d2: athrow
      // 0d3: ifeq 104
      // 0d6: goto 0dd
      // 0d9: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0dc: athrow
      // 0dd: aload 2
      // 0de: aload 10
      // 0e0: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;)Z
      // 0e3: aload 4
      // 0e5: ifnull 103
      // 0e8: goto 0ef
      // 0eb: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ee: athrow
      // 0ef: ifeq 0fc
      // 0f2: goto 0f9
      // 0f5: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f8: athrow
      // 0f9: goto 104
      // 0fc: aload 5
      // 0fe: aload 10
      // 100: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 103: pop
      // 104: iinc 9 -1
      // 107: aload 4
      // 109: ifnonnull 09c
      // 10c: iload 7
      // 10e: iload 0
      // 10f: aload 4
      // 111: ifnull 130
      // 114: if_icmpeq 12d
      // 117: goto 11e
      // 11a: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11d: athrow
      // 11e: iinc 7 1
      // 121: aload 4
      // 123: ifnonnull 035
      // 126: goto 12d
      // 129: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12c: athrow
      // 12d: iload 6
      // 12f: iload 0
      // 130: if_icmpeq 142
      // 133: iinc 6 1
      // 136: aload 4
      // 138: ifnonnull 024
      // 13b: goto 142
      // 13e: invokestatic me/octo/client/IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 141: athrow
      // 142: aload 5
      // 144: areturn
   }

   private static final boolean a(
      HashMap<BlockPos, Boolean> param0,
      ClientLevel param1,
      HashMap<BlockPos, Boolean> param2,
      IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII param3,
      BlockPos param4
   ) {
      String var5 = me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Boolean var6 = param0.get(param4);
      if (var6 != null) {
         return var6;
      }
      net.minecraft.world.level.block.state.BlockState var9 = param1.getBlockState(param4);
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var9, "getBlockState(...)");
      boolean var7 = var9.is(net.minecraft.world.level.block.Blocks.BEDROCK);
      ((java.util.Map)param2).put(param4, var7);
      boolean var8;
      if (param3.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var9)) {
         var8 = true;
      } else if (param3.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var9)) {
         var8 = true;
      } else if (param3.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.C(var9)) {
         var8 = true;
      } else if (param3.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI && IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var9)) {
         var8 = true;
      } else {
         var8 = var7;
      }
      ((java.util.Map)param0).put(param4, var8);
      return var8;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[42];
      int var3 = 0;
      String var2 = "òî\u000f\u0085¥iÔ¢Ê\b=ÈÈ³¥´ÀO\bBR3]4\u0006¢ò\u0005læò\u0081\u0097\n\u008aS\u0006±<Ö\u0099}¶Z\u0007§\u008d-G*ìB\u0004]«ïH\u0017.zÓ³z5ØÞ\u0007NOÚ¶\u0003G[®vW <O\u0099\bà¬V,Ù#aV\b_\fÅÞ\u0015\u0019Öú\u00129Yß?\u0006Có\u009aQ&í!TGv\u0098\fN\u000eD\u001cp\u0096úVS\u0017\u0091\u0004¿èón\bún§³K´\u001dO\râ©z\"\u008cÍ\u0002*\u0099P¯¤ö\tÖ\u0086\u0006òôK,·4\u0004ö\u0002\u009a}\u0002\u0088#\bÜ\u0098à\u0004N-í\u0097\u000b\u009d\u0011Pd®$\u0085KÀ«E\u000f\u0088ÍwÐGHz?ñÃ*¶\u0087¢)\u000b!ZÇ\r\\\tÛî\u000b\u001f<\u0003\"xN\u00109íþÝPæZ\u001f\u000f¬],½7iW\u0014òý;Ò¹\u00918\u009aÛu,ß\u000f9Gß;gÉï\u0014Ñà_q5å©\u0014é¤jåÇ~^7\u0018z\u00adL\u0019Ïµ·\u0085DI\u001cæ¬6\u001d)1\u001f²n\u0086\"ZO¸Â\u008a\u009dõ\tú\u0005\u0083\u0082DE:vö\t}}¥Û¶\u0097òÃÜ\u0006Nabµ\u0081^\bëLSÖÇ\u0018\u008cÚ\u000efÒ4OrmBp³èûu{Ý\u0011f\u0012\u0015\"-\fùäêú$©\u0085S¨ÜÐ\u000bõÐ\"8[Rÿ\u0086¨B \u0004\u0082N\u0086ñ\rEf\u008eÛ\u0012òÑÍã¬à;\u001f\u0011\u0098RÊ*Ö\r\u0086Ä\u0005þÙ):C_Þ.\u0005:\u00178¿Î\b\u0013ä\u009aâì\u009eé\n\u0004S\u001b¼[\u0012N\u00811$Û Hö&«\u0003\u0090\u0089qÍ^{\u0096";
      int var4 = "òî\u000f\u0085¥iÔ¢Ê\b=ÈÈ³¥´ÀO\bBR3]4\u0006¢ò\u0005læò\u0081\u0097\n\u008aS\u0006±<Ö\u0099}¶Z\u0007§\u008d-G*ìB\u0004]«ïH\u0017.zÓ³z5ØÞ\u0007NOÚ¶\u0003G[®vW <O\u0099\bà¬V,Ù#aV\b_\fÅÞ\u0015\u0019Öú\u00129Yß?\u0006Có\u009aQ&í!TGv\u0098\fN\u000eD\u001cp\u0096úVS\u0017\u0091\u0004¿èón\bún§³K´\u001dO\râ©z\"\u008cÍ\u0002*\u0099P¯¤ö\tÖ\u0086\u0006òôK,·4\u0004ö\u0002\u009a}\u0002\u0088#\bÜ\u0098à\u0004N-í\u0097\u000b\u009d\u0011Pd®$\u0085KÀ«E\u000f\u0088ÍwÐGHz?ñÃ*¶\u0087¢)\u000b!ZÇ\r\\\tÛî\u000b\u001f<\u0003\"xN\u00109íþÝPæZ\u001f\u000f¬],½7iW\u0014òý;Ò¹\u00918\u009aÛu,ß\u000f9Gß;gÉï\u0014Ñà_q5å©\u0014é¤jåÇ~^7\u0018z\u00adL\u0019Ïµ·\u0085DI\u001cæ¬6\u001d)1\u001f²n\u0086\"ZO¸Â\u008a\u009dõ\tú\u0005\u0083\u0082DE:vö\t}}¥Û¶\u0097òÃÜ\u0006Nabµ\u0081^\bëLSÖÇ\u0018\u008cÚ\u000efÒ4OrmBp³èûu{Ý\u0011f\u0012\u0015\"-\fùäêú$©\u0085S¨ÜÐ\u000bõÐ\"8[Rÿ\u0086¨B \u0004\u0082N\u0086ñ\rEf\u008eÛ\u0012òÑÍã¬à;\u001f\u0011\u0098RÊ*Ö\r\u0086Ä\u0005þÙ):C_Þ.\u0005:\u00178¿Î\b\u0013ä\u009aâì\u009eé\n\u0004S\u001b¼[\u0012N\u00811$Û Hö&«\u0003\u0090\u0089qÍ^{\u0096"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 48;
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
                     case 0 -> 67;
                     case 1 -> 108;
                     case 2 -> 89;
                     case 3 -> 36;
                     case 4 -> 118;
                     case 5 -> 115;
                     default -> 73;
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
                     d = new String[42];
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

                  var2 = "v©ÂG\\\u0002©w±\u0005þåró\u009e";
                  var4 = "v©ÂG\\\u0002©w±\u0005þåró\u009e".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -17560) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 105;
            case 1 -> 5;
            case 2 -> 147;
            case 3 -> 167;
            case 4 -> 173;
            case 5 -> 254;
            case 6 -> 158;
            case 7 -> 222;
            case 8 -> 251;
            case 9 -> 196;
            case 10 -> 102;
            case 11 -> 72;
            case 12 -> 97;
            case 13 -> 138;
            case 14 -> 17;
            case 15 -> 140;
            case 16 -> 10;
            case 17 -> 50;
            case 18 -> 218;
            case 19 -> 64;
            case 20 -> 178;
            case 21 -> 237;
            case 22 -> 37;
            case 23 -> 187;
            case 24 -> 172;
            case 25 -> 224;
            case 26 -> 233;
            case 27 -> 205;
            case 28 -> 28;
            case 29 -> 225;
            case 30 -> 206;
            case 31 -> 155;
            case 32 -> 220;
            case 33 -> 195;
            case 34 -> 130;
            case 35 -> 120;
            case 36 -> 48;
            case 37 -> 69;
            case 38 -> 122;
            case 39 -> 109;
            case 40 -> 114;
            case 41 -> 181;
            case 42 -> 209;
            case 43 -> 19;
            case 44 -> 145;
            case 45 -> 219;
            case 46 -> 123;
            case 47 -> 54;
            case 48 -> 150;
            case 49 -> 131;
            case 50 -> 106;
            case 51 -> 4;
            case 52 -> 226;
            case 53 -> 15;
            case 54 -> 26;
            case 55 -> 55;
            case 56 -> 14;
            case 57 -> 30;
            case 58 -> 103;
            case 59 -> 253;
            case 60 -> 6;
            case 61 -> 227;
            case 62 -> 94;
            case 63 -> 89;
            case 64 -> 236;
            case 65 -> 152;
            case 66 -> 223;
            case 67 -> 57;
            case 68 -> 229;
            case 69 -> 121;
            case 70 -> 234;
            case 71 -> 83;
            case 72 -> 87;
            case 73 -> 52;
            case 74 -> 249;
            case 75 -> 23;
            case 76 -> 157;
            case 77 -> 192;
            case 78 -> 156;
            case 79 -> 207;
            case 80 -> 166;
            case 81 -> 56;
            case 82 -> 8;
            case 83 -> 118;
            case 84 -> 18;
            case 85 -> 115;
            case 86 -> 213;
            case 87 -> 99;
            case 88 -> 112;
            case 89 -> 70;
            case 90 -> 29;
            case 91 -> 201;
            case 92 -> 204;
            case 93 -> 244;
            case 94 -> 243;
            case 95 -> 47;
            case 96 -> 242;
            case 97 -> 186;
            case 98 -> 162;
            case 99 -> 46;
            case 100 -> 125;
            case 101 -> 63;
            case 102 -> 134;
            case 103 -> 231;
            case 104 -> 216;
            case 105 -> 159;
            case 106 -> 7;
            case 107 -> 128;
            case 108 -> 108;
            case 109 -> 245;
            case 110 -> 202;
            case 111 -> 199;
            case 112 -> 183;
            case 113 -> 101;
            case 114 -> 136;
            case 115 -> 194;
            case 116 -> 151;
            case 117 -> 247;
            case 118 -> 22;
            case 119 -> 117;
            case 120 -> 208;
            case 121 -> 163;
            case 122 -> 116;
            case 123 -> 76;
            case 124 -> 153;
            case 125 -> 1;
            case 126 -> 53;
            case 127 -> 16;
            case 128 -> 88;
            case 129 -> 160;
            case 130 -> 68;
            case 131 -> 143;
            case 132 -> 217;
            case 133 -> 139;
            case 134 -> 171;
            case 135 -> 44;
            case 136 -> 250;
            case 137 -> 175;
            case 138 -> 45;
            case 139 -> 252;
            case 140 -> 164;
            case 141 -> 127;
            case 142 -> 221;
            case 143 -> 90;
            case 144 -> 177;
            case 145 -> 214;
            case 146 -> 32;
            case 147 -> 141;
            case 148 -> 96;
            case 149 -> 184;
            case 150 -> 0;
            case 151 -> 95;
            case 152 -> 203;
            case 153 -> 232;
            case 154 -> 38;
            case 155 -> 31;
            case 156 -> 165;
            case 157 -> 212;
            case 158 -> 248;
            case 159 -> 230;
            case 160 -> 135;
            case 161 -> 104;
            case 162 -> 34;
            case 163 -> 180;
            case 164 -> 111;
            case 165 -> 51;
            case 166 -> 124;
            case 167 -> 21;
            case 168 -> 12;
            case 169 -> 78;
            case 170 -> 66;
            case 171 -> 59;
            case 172 -> 215;
            case 173 -> 71;
            case 174 -> 110;
            case 175 -> 58;
            case 176 -> 170;
            case 177 -> 144;
            case 178 -> 241;
            case 179 -> 60;
            case 180 -> 84;
            case 181 -> 113;
            case 182 -> 198;
            case 183 -> 210;
            case 184 -> 49;
            case 185 -> 98;
            case 186 -> 133;
            case 187 -> 126;
            case 188 -> 85;
            case 189 -> 119;
            case 190 -> 161;
            case 191 -> 132;
            case 192 -> 154;
            case 193 -> 142;
            case 194 -> 189;
            case 195 -> 73;
            case 196 -> 149;
            case 197 -> 82;
            case 198 -> 100;
            case 199 -> 77;
            case 200 -> 75;
            case 201 -> 74;
            case 202 -> 185;
            case 203 -> 191;
            case 204 -> 61;
            case 205 -> 238;
            case 206 -> 42;
            case 207 -> 43;
            case 208 -> 91;
            case 209 -> 80;
            case 210 -> 65;
            case 211 -> 129;
            case 212 -> 148;
            case 213 -> 193;
            case 214 -> 79;
            case 215 -> 86;
            case 216 -> 40;
            case 217 -> 146;
            case 218 -> 168;
            case 219 -> 41;
            case 220 -> 169;
            case 221 -> 27;
            case 222 -> 190;
            case 223 -> 137;
            case 224 -> 13;
            case 225 -> 235;
            case 226 -> 197;
            case 227 -> 62;
            case 228 -> 228;
            case 229 -> 81;
            case 230 -> 36;
            case 231 -> 188;
            case 232 -> 39;
            case 233 -> 255;
            case 234 -> 25;
            case 235 -> 239;
            case 236 -> 176;
            case 237 -> 2;
            case 238 -> 92;
            case 239 -> 179;
            case 240 -> 67;
            case 241 -> 246;
            case 242 -> 93;
            case 243 -> 9;
            case 244 -> 20;
            case 245 -> 24;
            case 246 -> 240;
            case 247 -> 107;
            case 248 -> 3;
            case 249 -> 200;
            case 250 -> 33;
            case 251 -> 11;
            case 252 -> 35;
            case 253 -> 182;
            case 254 -> 174;
            default -> 211;
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

   public static enum llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI };

      private static String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

      public static IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] a() {
         return (IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clone();
      }

      public static IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         String var0
      ) {
         return Enum.valueOf(
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> b() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = kotlin.enums.EnumEntriesKt.enumEntries(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);

      public static void b(String var0) {
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
      }

      public static String d() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] c() { return new me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI }; }
}
   // ===== PX-FIX PhaseA backfill (B3): 4 methods present in the jar but missing from the source ====
   // Authoritative bytecode:
   //   javap -p -c -classpath .analysis/me-octo-only.jar IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII
   // b(BlockState) and the static bridge a(...) are restored per bytecode;
   // a(ClientLevel) and a(List,List,List) restore the signature only, with the full bytecode inlined below
   // (same PX-FIX convention as b(ClientLevel)/c(ClientLevel)/E() in this class).

   private final boolean b(
      BlockState param1
   ) {
      return this.a(param1) != null;
   }

   public static final double a(
      IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII param0,
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1
   ) {
      return param0.b(param1);
   }

   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      ClientLevel param1
   ) {
      java.lang.String var2 = me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      net.minecraft.world.phys.Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      java.util.Iterator var4 = this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.iterator();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var4, "iterator(...)");
      while (var4.hasNext()) {
         net.minecraft.core.BlockPos var5 = (net.minecraft.core.BlockPos)var4.next();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var5, "next(...)");
         if (this.i().contains(var5)) {
            continue;
         }
         if (this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.contains(var5)) {
            continue;
         }
         net.minecraft.world.level.block.state.BlockState var9 = param1.getBlockState(var5);
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var9, "getBlockState(...)");
         if (!this.b(var9)) {
            continue;
         }
         if (this.d(var5)) {
            continue;
         }
         kotlin.Pair var6 = this.e(var5, var3);
         if (var6 == null) {
            continue;
         }
         net.minecraft.world.level.block.state.BlockState var10 = param1.getBlockState(var5);
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10, "getBlockState(...)");
         me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = new me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var5, var10);
         this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = var6;
         this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = var7;
         var7.a(me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(this, var5, (net.minecraft.world.phys.Vec3)null, (net.minecraft.world.phys.Vec3)null, false, 14, (java.lang.Object)null));
         java.util.List var11 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var6.getFirst(), false, 2, (java.lang.Object)null);
         if (var11 != null) {
            java.util.Collection var12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(var11, 10));
            java.lang.Iterable var14 = var11;
            for (java.lang.Object var13 : var14) {
               var12.add(((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var13).b());
            }
            var11 = (java.util.List)kotlin.collections.CollectionsKt.toCollection((java.lang.Iterable)((java.util.List)var12), (java.util.Collection)new java.util.ArrayList());
         }
         this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = var11;
         this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = 1;
         this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 4.3 + kotlin.random.Random.Default.nextDouble() * 0.1;
         return var7;
      }
      return null;
   }

   private final void a(
      List<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> param1,
      List<? extends Pair<? extends BlockPos, ? extends Vec3>> param2,
      List<? extends Class<? extends Entity>> param3
   ) {
      this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI.clear();
      this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.clear();
      String var4 = me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      java.util.HashMap var5 = new java.util.HashMap();
      java.util.HashMap var6 = new java.util.HashMap();
      if (var4 == null) {
         return;
      }
      net.minecraft.client.multiplayer.ClientLevel var7 = this.a().level;
      if (var7 == null) {
         return;
      }
      java.util.Iterator var8 = param1.iterator();
      while (var8.hasNext()) {
         me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = (me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var8.next();
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var10 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var9.c(), param3, (net.minecraft.world.phys.Vec3)null, 4, (java.lang.Object)null);
         boolean var11 = var10.b() == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && kotlin.jvm.internal.Intrinsics.areEqual(var10.c(), var9.a());
         ((java.util.Map)this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI).put(var9.a(), var11);
         if (!var11) {
            continue;
         }
         net.minecraft.world.phys.Vec3 var12 = var9.c();
         kotlin.sequences.Sequence var14 = kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence((java.lang.Iterable)param2), new kotlin.jvm.functions.Function1<kotlin.Pair, kotlin.Pair>() {
            public kotlin.Pair invoke(kotlin.Pair var1) {
               return me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.a(var12, var6, var5, var7, var1);
            }
         });
         var14 = kotlin.sequences.SequencesKt.take(kotlin.sequences.SequencesKt.sortedWith(var14, (java.util.Comparator)new me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()), 10);
         java.util.Iterator var16 = var14.iterator();
         kotlin.Pair var13 = null;
         while (var16.hasNext()) {
            java.lang.Object var17 = var16.next();
            kotlin.Pair var18 = (kotlin.Pair)var17;
            kotlin.Pair var20 = (kotlin.Pair)var18.component1();
            me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var21 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var9.c(), 4.2, param3, (net.minecraft.world.phys.Vec3)var20.getSecond());
            if (var21.b() == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && kotlin.jvm.internal.Intrinsics.areEqual(var21.c(), var9.a())) {
               var13 = var18;
               break;
            }
         }
         ((java.util.Map)this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI).put(var9.a(), var13 == null ? null : (kotlin.Pair)var13.getFirst());
      }
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = false;
   }

}
