package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII
   extends IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll {
   @NotNull
   public static IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   @NotNull
   private IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   private int lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = 6;
   private boolean IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   @NotNull
   private List<? extends Vec3> lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = CollectionsKt.emptyList();
   @NotNull
   private List<? extends BlockPos> llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = CollectionsKt.emptyList();
   @NotNull
   private final ArrayList<BlockPos> llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = new ArrayList<>();
   @NotNull
   private Vec3 IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = new Vec3(0.0, 0.0, 0.0);
   private boolean IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   @NotNull
   private Vec3 lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   @Nullable
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   private double lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   @NotNull
   private final HashMap<BlockPos, Long> IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   @Nullable
   private BlockPos llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   @Nullable
   private Vec3 IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private boolean IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   private long IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   @Nullable
   private ArrayList<Vec3> IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
   private int lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll;
   @Nullable
   private List<? extends Vec3> IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
   @NotNull
   private Vec3 IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI;
   @Nullable
   private volatile HashMap<BlockPos, ArrayList<Vec3>> IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
   @NotNull
   private final AtomicBoolean lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
   private boolean IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl;
   private long lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl;
   @NotNull
   private static List<Class<RemotePlayer>> lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl;
   private static String[] c;
   private static String[] d;

   public IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII() {
      super(false, 1, null);
      Vec3 var10001 = Vec3.ZERO;
      short var10003 = 23048;
      short var10004 = 27394;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = var10001;
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = 4.3;
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = new HashMap<>();
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      var10001 = Vec3.ZERO;
      var10003 = 23051;
      var10004 = 12122;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = var10001;
      this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = new AtomicBoolean(false);
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
   }

   @NotNull
   public final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid V() {
      return this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   }

   public final void a(
      @NotNull IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid var1
   ) {
      short var10001 = 23053;
      short var10002 = 28551;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = var1;
   }

   public final boolean W() {
      return this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   }

   public final void k(boolean var1) {
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = var1;
   }

   public final int X() {
      return this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   }

   public final void a(int var1) {
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = var1;
   }

   public final boolean Y() {
      return this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   }

   public final void l(boolean var1) {
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = var1;
   }

   @NotNull
   @Override
   protected List<Vec3> v() {
      return ((List<Vec3>)(Object)(this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII));
   }

   @Override
   protected boolean w() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var10000 = this.b();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
      }

      return var1 == null ? var10000 : !var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI g(
      @NotNull Vec3 var1
   ) {
      short var10001 = 23060;
      short var10002 = -16405;
      Intrinsics.checkNotNullParameter(var1, "destination");
      Vec3 var10000 = var1.add(0.0, 0.3500000000000001, 0.0);
      var10002 = 23055;
      short var10003 = 15097;
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      Vec3 var3 = var10000;
      Iterable var4 = this.Z();
      boolean var5 = false;
      String var27 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      var var7 = new ArrayList();
      String var2 = var27;
      boolean var8 = false;
      Iterator var10 = var4.iterator();

      label112: {
         label111: {
            Object var11;
            while (true) {
               label108:
               if (var10.hasNext()) {
                  var11 = var10.next();
                  IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var11;
                  boolean var14 = false;
                  me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var15 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var13.c(), 4.5, lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl, var3);
                  me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var28 = var15;
                  if (var2 != null) {
                     me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10000b = var15.b();
                     if (var2 == null) {
                        break;
                     }

                     if (var10000b
                        != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        )
                      {
                        if (true) {
                           continue;
                        }

                        var7.add(var11);
                        if (var2 != null) {
                           continue;
                        }
                        break label108;
                     }

                     var28 = var15;
                  }

                  boolean var30 = Intrinsics.areEqual(var28.c(), var13.a());
                  if (var2 != null) {
                     ;
                  }

                  if (!var30) {
                     continue;
                  }

                  var7.add(var11);
                  if (var2 != null) {
                     continue;
                  }
               }

               var4 = (Iterable & List)var7;
               var5 = false;
               var7 = new ArrayList();
               var8 = false;
               var10 = var4.iterator();
               if (!var10.hasNext()) {
                  break label111;
               }

               var11 = var10.next();
               var10000 = (Vec3)var11;
               break;
            }

            while (true) {
               IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var11;
               boolean var26 = false;
               boolean var31 = this.c(var24.a(), var3);
               if (var2 == null) {
                  break label112;
               }

               label81: {
                  if (var2 != null) {
                     if (!var31) {
                        break label81;
                     }

                     var7.add(var11);
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               if (!var10.hasNext()) {
                  break;
               }

               var11 = var10.next();
               var10000 = (Vec3)var11;
            }
         }

         var4 = (Iterable & List)var7;
         boolean var32 = false;
      }

      Iterator var6;
      label122: {
         var6 = var4.iterator();
         boolean var33 = var6.hasNext();
         if (var2 != null) {
            if (!var33) {
               return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null;
            }

            var7 = ((ArrayList)(var6.next()));
            var10000 = ((Vec3)(Object)(var6));
            if (var2 == null) {
               break label122;
            }

            var33 = var6.hasNext();
         }

         if (!var33) {
            return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var7;
         }

         var10000 = (Vec3)(Object)var7;
      }

      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var18 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var7;
      boolean var20 = false;
      double var19 = this.b(var18);

      while (true) {
         Object var21 = var6.next();
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var22 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var21;
         boolean var25 = false;
         double var23 = this.b(var22);
         if (Double.compare(var19, var23) > 0) {
            var7 =((ArrayList)( var21));
            var19 = var23;
         }

         while (!var6.hasNext()) {
            if (var2 != null) {
               return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var7;
            }

            var19 = var23;
         }
      }
   }

   @Override
   public int h(@NotNull Vec3 var1) {
      Object var14 = null; // PX-FIX
      String var2;
      Iterable var3;
      byte var11;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 23061;
      short var10003 = 18776;
      Intrinsics.checkNotNullParameter(var1, "eyePos");
      var3 = this.Z();
      boolean var4 = false;
      var2 = var10000;
      var11 = ((byte)((var3 instanceof Collection) ? 1 : 0));
      label62:
      if (var2 != null) {
         if (var11 != 0) {
            var11 = (byte)(((Collection)var3).isEmpty() ? 1 : 0);
            if (var2 == null) {
               break label62;
            }

            if (var11 != 0) {
               return 0;
            }
         }

         var11 = 0;
      }

      int var5 = var11;

      for (Object var7 : var3) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var7;
         if (var2 == null) {
            return 0;
         }

         label49: {
            label67: {
               boolean var9 = false;
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var10 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var8.c(), 4.4, lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl, var1);
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var13 = var10;
               if (var2 != null) {
                  if (var10.b()
                     != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     )
                   {
                     break label67;
                  }

                  var13 = var10;
               }

               var14 = Intrinsics.areEqual(var13.c(), var8.a());
               if (var2 == null) {
                  break label49;
               }

               if (((Boolean)(var14))) {
                  var14 = true;
                  break label49;
               }
            }

            var14 = false;
         }

         if (((Boolean)(var14))) {
            var5++;
            if (var2 != null) {
               if (var5 >= 0) {
                  continue;
               }

               CollectionsKt.throwCountOverflow();
            }

            if (var2 == null) {
               break;
            }
         }
      }

      return var5;
   }

   private final double b(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      double var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var1.c(), true);
      var3 += me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(var1.c())
         * 0.2;
      String var2 = var10000;
      double var7 = var3 + this.l(var1.c());
      if (var2 != null) {
         var3 = var7;
         if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k(var1.b())
            && this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII) {
            var3 -= 100.0;
         }

         var7 = var3;
      }

      return var7;
   }

   @Override
   public void u() {
      Object var59 = null; // PX-FIX
      Object var56 = null; // PX-FIX
      Object var47 = null; // PX-FIX
      Object var43 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      Vec3 var37 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      Vec3 var32 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j()) ? 1 : 0);
      if (var1 != null) {
         if ((var10000 != 0)) {
            this.i(false);
            return;
         }

         var10000 = ((this.m()) ? 1 : 0);
      }

      if ((var10000 == 0)) {
         Vec3 var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = this.k();
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var28 = var3;
         if (var1 != null) {
            if (var3 == null) {
               label258: {
                  label257: {
                     Vec3 var20 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .d(this.h());
                     double var79;
                     var10000 = (
                              var79 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a(var20, false)
                                 - 1.0
                           )
                           == 0.0
                        ? 0
                        : (var79 < 0.0 ? -1 : 1);
                     if (var1 != null) {
                        if (var10000 <= 0) {
                           break label257;
                        }

                        var10000 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                           me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                           me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
                           var20,
                           null,
                           0,
                           false,
                           0.0,
                           true,
                           false,
                           0.0);
                     }

                     if (var10000 != 0) {
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                           var2,
                           var20,
                           false,
                           0.0);
                        if (var1 != null) {
                           break label258;
                        }
                     }
                  }

                  this.i(false);
               }

               int var75;
               label248: {
                  label492: {
                     var59 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     short var66 = 23050;
                     short var74 = -16489;
                     var75 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .P()) ? 1 : 0);
                     if (var1 != null) {
                        if (var75 == 0) {
                           break label492;
                        }

                        double var80;
                        var75 = (var80 = Math.abs(var2.y - (this.h().getY() + 0.5)) - 1.0) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
                     }

                     if (var1 == null) {
                        break label248;
                     }

                     if (var75 < 0) {
                        var75 = 1;
                        break label248;
                     }
                  }

                  var75 = 0;
               }

               ((me.octo.client.PXDyn)var59).a("sneak", (var75 != 0));
               this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
               this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
               return;
            }

            var28 = var3;
         }

         BlockPos var4 = var28.a();
         IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var29 = this;
         if (var1 != null) {
            if (!this.d(var4)) {
               long var5;
               label494: {
                  label479: {
                     var5 = System.currentTimeMillis();
                     IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var30 = this;
                     if (var1 != null) {
                        if (Intrinsics.areEqual(this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII, var4)) {
                           break label479;
                        }

                        this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = var4;
                        this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = var5;
                        this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
                        this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = false;
                        var30 = this;
                     }

                     var30.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl.f();
                     if (var1 != null) {
                        break label494;
                     }
                  }

                  long var7 = var5 - this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
                  if (var1 == null) {
                     return;
                  }

                  if (var7 > 7500L) {
                     this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll.put(var4, var5 + 30000L);
                     short var65 = 23047;
                     short var72 = 12515;
                     var72 = 23070;
                     short var78 = 6330;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        "§cBlacklisted block at " + var4 + " (timeout)"
                     );
                     this.a((kotlin.jvm.functions.Function1)null);
                     this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
                     this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
                     return;
                  }
               }

               Vec3 var21;
               label466: {
                  var21 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
                  if (var1 != null) {
                     Vec3 var31 = this.l();
                     if (var31 != null) {
                        Vec3 var10 = var31;
                        boolean var12 = false;
                        var32 = var21;
                        if (var1 != null) {
                           var32 = a(var21, var4, var10) ? var10 : null;
                        }
                        break label466;
                     }
                  }

                  var32 = null;
               }

               Vec3 var8;
               var8 = var32;
               var33 = this.l();
               label460:
               if (var1 != null) {
                  if (var33 != null) {
                     var33 = var8;
                     if (var1 == null) {
                        break label460;
                     }

                     if (var8 == null) {
                        this.a((kotlin.jvm.functions.Function1)null);
                     }
                  }

                  var33 = this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
               }

               Vec3 var34;
               if (var33 != null) {
                  Vec3 var11 =((Vec3)( var33));
                  boolean var13 = false;
                  var34 = var21;
                  if (var1 != null) {
                     var34 = a(var21, var4, var11) ? var11 : null;
                  }
               } else {
                  var34 = null;
               }

               Vec3 var9;
               label452: {
                  Vec3 var10001;
                  label451: {
                     label495: {
                        label496: {
                           var9 = var34;
                           Vec3 var35 = var9;
                           if (var1 != null) {
                              if (var9 == null) {
                                 label444: {
                                    Vec3 var36 = var3.d();
                                    if (var36 != null) {
                                       Vec3 var24 = var36;
                                       boolean var14 = false;
                                       var37 = var21;
                                       if (var1 != null) {
                                          var37 = a(var21, var4, var24) ? var24 : null;
                                       }

                                       if (var37 != null) {
                                          break label444;
                                       }
                                    }

                                    var37 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(
                                       this, var4, null, null, false);
                                 }

                                 var9 = var37;
                                 if (var1 != null) {
                                    IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var38 = this.k();
                                    if (var38 != null) {
                                       var38.a(var9);
                                    }
                                 }
                              }

                              var39 = this;
                              var10001 = var9;
                              if (var1 == null) {
                                 break label496;
                              }

                              this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = var9;
                              var35 = var8;
                           }

                           if (var35 != null) {
                              IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(this, null, var8);
                              if (var1 != null) {
                                 break label452;
                              }
                           }

                           var39 = this;
                           if (var1 == null) {
                              break label495;
                           }

                           var10001 = var9;
                        }

                        if (var10001 != null) {
                           break label451;
                        }
                     }

                     var10001 = var3.c();
                  }

                  IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(
                     (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll)var39, var10001, null);
               }

               Vec3 var40 = var9;
               if (var9 == null) {
                  var40 = var3.c();
               }

               Vec3 var22 = var40;
               double var81;
               var10000 = (
                        var81 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .d(var22)
                           - 0.1
                     )
                     == 0.0
                  ? 0
                  : (var81 < 0.0 ? -1 : 1);
               if (var1 != null) {
                  var10000 = var10000 <= 0 ? 1 : 0;
               }

               int var23;
               label420: {
                  var23 = var10000;
                  if (var1 != null) {
                     BlockHitResult var42 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .I();
                     if (var42 != null) {
                        var43 = var42.getBlockPos();
                        break label420;
                     }
                  }

                  var43 = null;
               }

               BlockPos var25 =((BlockPos)( var43));
               Vec3 var44 = var9;
               if (var1 != null) {
                  label411:
                  if (var9 != null && var23 != 0) {
                     BlockPos var45 = var25;
                     if (var1 != null) {
                        if (var25 == null) {
                           break label411;
                        }

                        var45 = var25;
                     }

                     if (!Intrinsics.areEqual(var45, var4)) {
                        IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var46 = this.k();
                        if (var46 != null) {
                           var46.a(
                              IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(this, var4, var9, null, false)
                           );
                        }

                        this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
                     }
                  }

                  var44 = var9;
               }

               label402: {
                  Vec3 var60 = var44;
                  if (var1 != null) {
                     if (var44 == null) {
                        var47 = Double.MAX_VALUE;
                        break label402;
                     }

                     var60 = var44;
                     var44 = var21;
                  }

                  var47 = var44.distanceTo(var60);
               }

               double var26 =((Double)( var47));
               var10000 = ((Intrinsics.areEqual(var25, var4)) ? 1 : 0);
               label396:
               if (var1 != null) {
                  if (var10000 == 0) {
                     double var82;
                     var10000 = (var82 = var26 - this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI) == 0.0
                        ? 0
                        : (var82 < 0.0 ? -1 : 1);
                     if (var1 == null) {
                        break label396;
                     }

                     if (var10000 > 0) {
                        var10000 = 0;
                        break label396;
                     }
                  }

                  var10000 = 1;
               }

               int var15 = var10000;
               var10000 = var15;
               if (var1 != null) {
                  if (var15 != 0) {
                     this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = true;
                  }

                  double var83;
                  var10000 = (
                           var83 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a(this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI, false)
                              - 0.3
                        )
                        == 0.0
                     ? 0
                     : (var83 < 0.0 ? -1 : 1);
               }

               if (var1 != null) {
                  var10000 = var10000 < 0 ? 1 : 0;
               }

               int var16;
               label385: {
                  var16 = var10000;
                  label384:
                  if (var8 == null) {
                     var10000 = ((this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll) ? 1 : 0);
                     label382:
                     if (var1 != null) {
                        if (!this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll) {
                           var10000 = ((this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII) ? 1 : 0);
                           if (var1 == null) {
                              break label382;
                           }

                           if (!this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII) {
                              var10000 = var16;
                              if (var1 == null) {
                                 break label382;
                              }

                              if (var16 == 0) {
                                 break label384;
                              }
                           }
                        }

                        var10000 = ((Intrinsics.areEqual(var25, var4)) ? 1 : 0);
                     }

                     if (var1 == null) {
                        break label385;
                     }

                     if (var10000 == 0) {
                        var10000 = 1;
                        break label385;
                     }
                  }

                  var10000 = 0;
               }

               label366: {
                  label501: {
                     int var17 = var10000;
                     var10000 = var17;
                     if (var1 != null) {
                        if (var17 == 0) {
                           this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl.f();
                           break label501;
                        }

                        var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl.a(750); return 0; })).get();
                     }

                     if (var1 == null) {
                        break label366;
                     }

                     if (var10000 != 0) {
                        this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll.put(var4, var5 + 30000L);
                        short var61 = 23040;
                        short var10002 = 6512;
                        var10002 = 23071;
                        short var10003 = -28665;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                           "§cBlacklisted block at " + var4 + " (no line of sight)"
                        );
                        this.a((kotlin.jvm.functions.Function1)null);
                        this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
                        this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
                        return;
                     }
                  }

                  var10000 = ((this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll) ? 1 : 0);
               }

               label502: {
                  label355: {
                     label354: {
                        label503: {
                           if (var1 != null) {
                              if (var10000 != 0) {
                                 break label503;
                              }

                              var10000 = ((this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII) ? 1 : 0);
                           }

                           if (var1 != null) {
                              if (var10000 != 0) {
                                 break label503;
                              }

                              var10000 = var16;
                           }

                           if (var10000 == 0) {
                              label504: {
                                 ArrayList var18 = this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
                                 ArrayList var52 = var18;
                                 if (var1 != null) {
                                    label344:
                                    if (var18 != null) {
                                       Object var53 = this;
                                       if (var1 != null) {
                                          if (this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll
                                             > CollectionsKt.getLastIndex(var18)) {
                                             break label344;
                                          }

                                          var53 = var18.get(this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll);
                                          short var68 = 23062;
                                          short var76 = 20582;
                                          Intrinsics.checkNotNullExpressionValue(var53, "get(...)");
                                       }

                                       Vec3 var19 = (Vec3)var53;
                                       if (var1 != null) {
                                          if (me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .a(
                                                var19,
                                                me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
                                                0.15
                                             )) {
                                             this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll++;
                                             me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .g(true);
                                          }

                                          me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var54 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                          Object var62 = var18.get(
                                             this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll - 1
                                          );
                                          short var77 = 23069;
                                          short var10004 = -6376;
                                          Intrinsics.checkNotNullExpressionValue(var62, "get(...)");
                                          me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                                             var54, (Vec3)var62, var19, true, 0.0);
                                       }

                                       if (var1 != null) {
                                          break label504;
                                       }
                                    }

                                    var52 = var18;
                                 }

                                 if (var52 != null) {
                                    label332: {
                                       IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var55 = this;
                                       if (var1 != null) {
                                          if (this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll != var18.size()) {
                                             break label332;
                                          }

                                          me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .g(true);
                                          var55 = this;
                                       }

                                       var55.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll
                                          + 1;
                                    }

                                    me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                                       me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                       me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
                                       this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI,
                                       true,
                                       0.0);
                                    if (var1 != null) {
                                       break label504;
                                    }
                                 }

                                 if (var1 == null) {
                                    break label502;
                                 }

                                 if (!(Boolean)me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                                    me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                    me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
                                    this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI,
                                    null,
                                    0,
                                    false,
                                    0.0,
                                    true,
                                    false,
                                    0.0)) {
                                    break label354;
                                 }

                                 me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                                    me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                    me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
                                    this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI,
                                    true,
                                    0.0);
                                 if (var1 == null) {
                                    break label354;
                                 }
                              }

                              this.p().f();
                              if (var1 != null) {
                                 break label355;
                              }
                           }
                        }

                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .p();
                        break label355;
                     }

                     this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll.put(var4, var5 + 30000L);
                     break label502;
                  }

                  var56 = ((java.util.function.Supplier<Object>)(() -> { this.p().a(5000); return null; })).get();
                  label306:
                  if (var1 != null) {
                     label297:
                     if (!((Boolean)var56)) {
                        label507: {
                           short var63 = 23043;
                           short var69 = 16597;
                           var56 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("sneak");
                           if (var1 != null) {
                              if (((Boolean)(var56))) {
                                 break label507;
                              }

                              var56 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var3.a());
                           }

                           if (var1 == null) {
                              break label306;
                           }

                           if (!((Boolean)var56)) {
                              break label297;
                           }
                        }

                        var56 = 0;
                        break label306;
                     }

                     var56 = 1;
                  }

                  byte var27;
                  label508: {
                     var27 =((Byte)( var56));
                     byte var57 = var27;
                     if (var1 != null) {
                        if (var27 == 0) {
                           this.q().f();
                           if (var1 != null) {
                              break label508;
                           }
                        }

                        var57 = ((java.util.function.Supplier<Byte>)(() -> { this.q().a(200); return 0; })).get();
                     }

                     if (var1 != null) {
                        if (var57 != 0) {
                           break label508;
                        }

                        var57 = 0;
                     }

                     var27 = var57;
                  }

                  int var71;
                  short var64 = 23043;
                  short var70 = 16597;
                  var71 = var27;
                  label278:
                  if (var1 != null) {
                     label269:
                     if (var27 == 0) {
                        label510: {
                           var71 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .P()) ? 1 : 0);
                           if (var1 != null) {
                              if (var71 == 0) {
                                 break label510;
                              }

                              double var84;
                              var71 = (var84 = Math.abs(var2.y - (this.h().getY() + 0.5)) - 1.0) == 0.0 ? 0 : (var84 < 0.0 ? -1 : 1);
                           }

                           if (var1 == null) {
                              break label278;
                           }

                           if (var71 < 0) {
                              break label269;
                           }
                        }

                        var71 = 0;
                        break label278;
                     }

                     var71 = 1;
                  }

                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sneak", (var71 != 0));
                  return;
               }

               this.a((kotlin.jvm.functions.Function1)null);
               this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
               this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
               return;
            }

            this.a((kotlin.jvm.functions.Function1)null);
            this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
            var29 = this;
         }

         var29.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
      }
   }

   private final boolean e(BlockPos var1) {
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         Long var10000 = this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll.get(var1);
         if (var10000 != null) {
            long var3 = var10000;
            long var6;
            int var5 = (var6 = System.currentTimeMillis() - var3) == 0L ? 0 : (var6 < 0L ? -1 : 1);
            if (var2 != null) {
               if (var5 >= 0) {
                  this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll.remove(var1);
                  return false;
               }

               var5 = 1;
            }

            return (var5 != 0);
         }
      }

      return false;
   }

   private final List<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> Z() {
      Object var21 = null; // PX-FIX
      Object var20 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            Iterable var3 = this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
            boolean var4 = false;
            Iterable var5 = var3;
            var var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
            boolean var7 = false;
            Iterator var8 = var3.iterator();

            while (true) {
               if (var8.hasNext()) {
                  Object var9 = var8.next();
                  BlockPos var10 = (BlockPos)var9;
                  boolean var11 = false;
                  BlockState var10003 = var2.getBlockState(var10);
                  short var10005 = 23064;
                  short var10006 = -29021;
                  Intrinsics.checkNotNullExpressionValue(var10003, "getBlockState(...)");
                  var6.add(
                     new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        var10, var10003
                     )
                  );
                  if (var1 == null) {
                     break;
                  }

                  if (var1 != null) {
                     continue;
                  }
               }

               var3 = var6;
               var4 = false;
               var5 = var3;
               var6 = new ArrayList();
               var7 = false;
               break;
            }

            var8 = var5.iterator();

            while (true) {
               if (var8.hasNext()) {
                  Object var17 = var8.next();
                  IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var18 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var17;
                  boolean var19 = false;
                  var20 = this.i();
                  if (var1 == null) {
                     break;
                  }

                  label57: {
                     label56: {
                        label80: {
                           var21 = ((me.octo.client.PXDyn)var20).contains(var18.a());
                           if (var1 != null) {
                              if (((Boolean)(var21))) {
                                 break label80;
                              }

                              var21 = this.e(var18.a());
                           }

                           if (var1 != null) {
                              if (((Boolean)(var21))) {
                                 break label80;
                              }

                              var21 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .p(var18.b());
                           }

                           if (var1 == null) {
                              break label57;
                           }

                           if (((Boolean)(var21))) {
                              break label56;
                           }

                           var21 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .k(var18.b());
                           if (var1 == null) {
                              break label57;
                           }

                           if (((Boolean)(var21))) {
                              break label56;
                           }
                        }

                        var21 = false;
                        break label57;
                     }

                     var21 = true;
                  }

                  if (!((Boolean)var21)) {
                     continue;
                  }

                  var6.add(var17);
                  if (var1 != null) {
                     continue;
                  }
               }

               var20 = var6;
               break;
            }

            return (List<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>)var20;
         }
      }

      return CollectionsKt.emptyList();
   }

   public final boolean aa() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var10000 = this;
      if (var1 != null) {
         if (this.k() != null) {
            return false;
         }

         var10000 = this;
      }

      boolean var2 = var10000.n();
      if (var1 != null) {
         if (var2) {
            return false;
         }

         var2 = this.m();
      }

      return var1 == null ? var2 : !var2;
   }

   private final List<Vec3> j(Vec3 var1) {
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      List var10000 = this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
      if (var2 != null) {
         if (this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll != null
            && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var1, this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI)
               < 0.3) {
            var10000 = this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
            Intrinsics.checkNotNull(this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll);
            return var10000;
         }

         this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = var1;
         var10000 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
      }

      Collection var4 = var10000;
      boolean var5 = false;
      var var7 = new ArrayList();
      boolean var8 = false;

      for (Object var10 : var4) {
         Vec3 var11 = (Vec3)var10;
         boolean var12 = false;
         boolean var14 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
            me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var1,
            var11,
            null,
            10,
            true,
            0.0,
            true,
            false,
            0.0);
         if (var2 != null) {
            if (!var14) {
               continue;
            }

            var7.add(var10);
         }

         if (var2 == null) {
            break;
         }
      }

      label30: {
         var4 = var7;
         boolean var15 = var4.isEmpty();
         if (var2 != null) {
            if (!var15) {
               var10000 = ((List)(Object)(var4));
               break label30;
            }

            boolean var16 = false;
         }

         var10000 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
      }

      List var3 = var10000;
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = var3;
      return var3;
   }

   private final boolean a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      Vec3 var2,
      Set<? extends BlockPos> var3
   ) {
      Object var16 = null; // PX-FIX
      String var4 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      double var21;
      int var10000 = (var21 = var2.distanceToSqr(var1.c()) - 16.81) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      if (var4 != null) {
         if (var10000 <= 0) {
            label101: {
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var5 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var1.c(), 4.1, lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl, var2);
               BlockPos var14 = var5.c();
               if (var4 != null) {
                  if (var14 == null) {
                     break label101;
                  }

                  var14 = var5.c();
               }

               boolean var15 = Intrinsics.areEqual(var14, var1.a());
               if (var4 != null) {
                  if (!var15) {
                     break label101;
                  }

                  var15 = this.a(var2, var1.c(), var1.a(), var3);
               }

               if (var4 == null) {
                  return var15;
               }

               if (!var15) {
                  return true;
               }
            }

            AABB var6 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var1.a(), var1.b());
            var var7 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var6, var2);
            boolean var8 = false;
            var16 = var7;
            label77:
            if (var4 != null) {
               if (var7 instanceof Collection) {
                  var16 = (Collection)var7;
                  if (var4 == null) {
                     break label77;
                  }

                  if (((me.octo.client.PXDyn)var16).isEmpty()) {
                     return false;
                  }
               }

               var16 = var7;
            }

            label68:
            for (Object var10 : (Iterable<?>)(var16)) {
               Vec3 var11 = (Vec3)var10;
               boolean var18 = false;

               do {
                  label64: {
                     label105: {
                        me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var13 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var11, 4.1, lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl, var2);
                        BlockPos var19 = var13.c();
                        if (var4 != null) {
                           if (var19 == null) {
                              break label105;
                           }

                           var19 = var13.c();
                        }

                        var18 = Intrinsics.areEqual(var19, var1.a());
                        if (var4 != null) {
                           if (!var18) {
                              break label105;
                           }

                           var18 = this.a(var2, var11, var1.a(), var3);
                        }

                        if (var4 == null) {
                           break label64;
                        }

                        if (!var18) {
                           var18 = true;
                           break label64;
                        }
                     }

                     var18 = false;
                  }

                  if (!var18) {
                     continue label68;
                  }
               } while (var4 == null);

               return true;
            }

            return false;
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   private final boolean a(Vec3 var1, Vec3 var2, BlockPos var3, Set<? extends BlockPos> var4) {
      String var5 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Object var10000 = var4;
      if (var5 != null) {
         if (var4.isEmpty()) {
            return false;
         }

         var10000 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1, var2);
      }

      Object var6 = var10000;
      boolean var7 = false;
      var10000 = var6;
      label62:
      if (var5 != null) {
         if (var6 instanceof Collection) {
            var10000 = (Collection)var6;
            if (var5 == null) {
               break label62;
            }

            if (((me.octo.client.PXDyn)var10000).isEmpty()) {
               return false;
            }
         }

         var10000 = var6;
      }

      label53:
      for (Object var9 : (Iterable<?>)(var10000)) {
         BlockPos var10 = (BlockPos)var9;
         boolean var11 = false;
         boolean var13 = Intrinsics.areEqual(var10, var3);

         do {
            label49: {
               label70: {
                  if (var5 != null) {
                     if (var13) {
                        break label70;
                     }

                     var13 = var4.contains(var10);
                  }

                  if (var5 == null) {
                     break label49;
                  }

                  if (var13) {
                     var13 = true;
                     break label49;
                  }
               }

               var13 = false;
            }

            if (!var13) {
               continue label53;
            }

            var13 = true;
         } while (var5 == null);

         return true;
      }

      return false;
   }

   private final HashMap<BlockPos, ArrayList<Vec3>> a(
      List<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var1,
      List<? extends Vec3> var2,
      Set<? extends BlockPos> var3
   ) {
      Object var11 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      HashMap var5 = new HashMap();
      String var4 = var10000;

      for (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 : var1) {
         ArrayList var8 = new ArrayList();
         Iterator var9 = var2.iterator();

         while (true) {
            if (var9.hasNext()) {
               Vec3 var10 = (Vec3)var9.next();
               var11 = this.a(var7, var10, var3);
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  if (!((Boolean)var11)) {
                     continue;
                  }

                  var8.add(var10);
               }

               if (var4 != null) {
                  continue;
               }
            }

            var11 = var8.isEmpty();
            break;
         }

         if (var4 != null) {
            var11 = !((Boolean)var11);
         }

         if (((Boolean)(var11))) {
            var5.put(var7.a(), var8);
            if (var4 == null) {
               break;
            }
         }
      }

      return var5;
   }

   public final void ab() {
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
   }

   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI E() {
      ClientLevel var52 = null; // PX-FIX
      int var139 = 0; // PX-FIX
      Object var138 = null; // PX-FIX
      int var130 = 0; // PX-FIX
      Object var129 = null; // PX-FIX
      boolean var127 = false; // PX-FIX
      int var126 = 0; // PX-FIX
      Object var125 = null; // PX-FIX
      Object var122 = null; // PX-FIX
      Object var117 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            if (var1 != null) {
               LocalPlayer var116 = this.a().player;
               if (var116 != null) {
                  Vec3 var4;
                  List var5;
                  List var6;
                  HashSet var7;
                  label442: {
                     label453: {
                        LocalPlayer var3 = var116;
                        var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);
                        var5 = this.Z();
                        var6 = this.j(var4);
                        var7 = new HashSet<>(this.i());
                        long var8 = System.currentTimeMillis();
                        var117 = this;
                        if (var1 != null) {
                           if (this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI == null) {
                              this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = this.a(var5, var6, var7);
                              this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = false;
                              this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = var8;
                              if (var1 != null) {
                                 break label453;
                              }
                           }

                           var117 = this;
                        }

                        if (var1 == null) {
                           break label442;
                        }

                        label434:
                        if (!(Boolean)this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.get()) {
                           IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var118 = this;
                           if (var1 != null) {
                              if (!this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl
                                 && var8 - this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl <= 750L) {
                                 break label434;
                              }

                              this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = false;
                              this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = var8;
                              var118 = this;
                           }

                           var118.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.set(true);
                           me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(null);
                        }
                     }

                     var117 = this;
                  }

                  HashMap var119 = ((HashMap)(Object)(((me.octo.client.PXDyn)var117).IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI));
                  Intrinsics.checkNotNull(((me.octo.client.PXDyn)var117).IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI);
                  HashMap var10 = var119;
                  Set var120 = var10.keySet();
                  short var10002 = 23063;
                  short var10003 = 12749;
                  Intrinsics.checkNotNullExpressionValue(var120, "<get-keys>(...)");
                  Iterable var12 = var120;
                  boolean var13 = false;
                  var var15 = new ArrayList();
                  boolean var16 = false;

                  for (Object var18 : var12) {
                     BlockPos var19 = (BlockPos)var18;
                     boolean var20 = false;
                     BlockState var121 = var2.getBlockState(var19);
                     var10002 = 23068;
                     var10003 = 31569;
                     Intrinsics.checkNotNullExpressionValue(var121, "getBlockState(...)");
                     BlockState var21 = var121;
                     var122 = var21.isAir();
                     label420:
                     if (var1 != null) {
                        if (!((Boolean)var122)) {
                           var122 = var21.is(Blocks.BEDROCK);
                           if (var1 == null) {
                              break label420;
                           }

                           if (!((Boolean)var122)) {
                              var122 = false;
                              break label420;
                           }
                        }

                        var122 = true;
                     }

                     if (((Boolean)(var122))) {
                        var15.add(var18);
                        if (var1 == null) {
                           break;
                        }
                     }
                  }

                  List var11 = var15;
                  var12 = var11;
                  var13 = false;

                  for (Object var50 : var12) {
                     BlockPos var54 = (BlockPos)var50;
                     boolean var59 = false;
                     var10.remove(var54);
                     if (var1 != null && var1 != null) {
                        continue;
                     }
                     break;
                  }

                  List var45 = this.K();
                  Iterable var48 = var5;
                  boolean var51 = false;
                  var var60 = new ArrayList();
                  boolean var67 = false;

                  for (Object var76 : var48) {
                     label394: {
                        label456: {
                           IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var80 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var76;
                           boolean var22 = false;
                           boolean var123 = var10.containsKey(var80.a());
                           if (var1 != null) {
                              if (!var123) {
                                 break label456;
                              }

                              var10000 = (ClientLevel)var10.get(var80.a());
                              Intrinsics.checkNotNull(var10000);
                              var123 = ((Collection)var10000).isEmpty();
                           }

                           if (var1 != null) {
                              var123 = !var123;
                           }

                           if (var123 && !this.d(var80.a())) {
                              label457: {
                                 var var23 = var45;
                                 boolean var24 = false;
                                 var125 = var23;
                                 label383:
                                 if (var1 != null) {
                                    if (var23 instanceof Collection) {
                                       var125 = (Collection)var23;
                                       if (var1 == null) {
                                          break label383;
                                       }

                                       if (((me.octo.client.PXDyn)var125).isEmpty()) {
                                          var126 = 1;
                                          break label457;
                                       }
                                    }

                                    var125 = var23;
                                 }

                                 Iterator var25 = ((me.octo.client.PXDyn)var125).iterator();

                                 label376:
                                 while (true) {
                                    if (!var25.hasNext()) {
                                       var126 = 1;
                                       break;
                                    }

                                    Object var26 = var25.next();
                                    RemotePlayer var27 = (RemotePlayer)var26;
                                    boolean var28 = false;
                                    double var145;
                                    var126 = (
                                             var145 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .c(
                                                      var80.c(),
                                                      me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                                         (net.minecraft.world.entity.Entity)var27
                                                      )
                                                   )
                                                - 2.0
                                          )
                                          == 0.0
                                       ? 0
                                       : (var145 < 0.0 ? -1 : 1);

                                    while (true) {
                                       if (var1 != null) {
                                          var126 = var126 < 0 ? 1 : 0;
                                       }

                                       if (var126 == 0) {
                                          break;
                                       }

                                       var126 = 0;
                                       if (var1 != null) {
                                          break label376;
                                       }
                                    }
                                 }
                              }

                              if (var126 != 0) {
                                 var127 = true;
                                 break label394;
                              }
                           }
                        }

                        var127 = false;
                     }

                     if (var127) {
                        var60.add(var76);
                        if (var1 == null) {
                           break;
                        }
                     }
                  }

                  List var47 = var60;
                  this.b(var6);
                  var10000 = ((ClientLevel)(Object)(var47));
                  if (var1 != null) {
                     if (var47.isEmpty()) {
                        this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
                        return null;
                     }

                     var10000 = ((ClientLevel)(Object)(var5));
                  }

                  label460: {
                     var52 = var10000;
                     var16 = false;
                     var129 = var52 instanceof Collection;
                     label354:
                     if (var1 != null) {
                        if (!((Boolean)var129)) {
                           var129 = ((Collection)var52).isEmpty();
                           if (var1 == null) {
                              break label354;
                           }

                           if (!((Boolean)var129)) {
                              var130 = 0;
                              break label460;
                           }
                        }

                        var129 = 0;
                     }

                     int var61 =((Integer)( var129));

                     for (Object var74 : (Iterable<?>)(var52)) {
                        IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var77 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var74;
                        boolean var81 = false;
                        var130 = ((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .k(var77.b())) ? 1 : 0);
                        if (var1 == null) {
                           break label460;
                        }

                        label462: {
                           if (var1 != null) {
                              if (var130 == 0) {
                                 continue;
                              }

                              var61++;
                              if (var1 == null) {
                                 break label462;
                              }

                              var130 = var61;
                           }

                           if (var130 >= 0) {
                              continue;
                           }

                           CollectionsKt.throwCountOverflow();
                        }

                        if (var1 == null) {
                           break;
                        }
                     }

                     var130 = var61;
                  }

                  int var49 = var130;
                  List var133;
                  if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII) {
                     Iterable var62 = var47;
                     var67 = false;
                     var var78 = new ArrayList();
                     boolean var82 = false;

                     for (Object var86 : var62) {
                        IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var89 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var86;
                        boolean var93 = false;
                        boolean var131 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .k(var89.b());
                        if (var1 != null) {
                           if (!var131) {
                              continue;
                           }

                           var78.add(var86);
                        }

                        if (var1 == null) {
                           break;
                        }
                     }

                     List var56 = var78;
                     boolean var132 = var56.isEmpty();
                     if (var1 != null) {
                        var132 = !var132;
                     }

                     if (var132) {
                        Iterable var63 = var56;
                        var67 = false;
                        var133 = CollectionsKt.sortedWith(
                           var63,
                           new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                              this
                           )
                        );
                     } else {
                        Iterable var64 = var47;
                        var67 = false;
                        var133 = CollectionsKt.sortedWith(
                           var64,
                           new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                              this, var49
                           )
                        );
                     }
                  } else {
                     Iterable var57 = var47;
                     boolean var65 = false;
                     var133 = CollectionsKt.sortedWith(
                        var57,
                        new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                           this, var49
                        )
                     );
                  }

                  List var53 = var133;
                  HashMap var58 = new HashMap();
                  HashMap var66 = new HashMap();
                  List var72 = this.K();
                  Iterator var75 = var53.iterator();

                  label310:
                  while (true) {
                     boolean var134 = var75.hasNext();

                     label308:
                     while (var134) {
                        IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var79 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var75.next();
                        if (var1 == null) {
                           return null;
                        }

                        if (var1 == null) {
                           continue label310;
                        }

                        ArrayList var135 = (ArrayList)var10.get(var79.a());
                        ArrayList var10001 = var135;

                        label306:
                        while (var10001 != null) {
                           ArrayList var83 = var135;
                           Iterable var87 = var83;
                           boolean var90 = false;
                           var var96 = new ArrayList();
                           boolean var98 = false;

                           for (Object var29 : var87) {
                              Vec3 var30 = (Vec3)var29;
                              boolean var31 = false;
                              var134 = this.a(var79, var30, var7);
                              if (var1 == null) {
                                 continue label308;
                              }

                              if (var1 != null) {
                                 if (!var134) {
                                    continue;
                                 }

                                 var96.add(var29);
                              }

                              if (var1 == null) {
                                 break;
                              }
                           }

                           List var85 = var96;
                           var10000 = ((ClientLevel)(Object)(var85));
                           if (var1 != null) {
                              if (var85.isEmpty()) {
                                 var10.remove(var79.a());
                                 this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
                                 if (var1 != null) {
                                    continue label310;
                                 }
                              }

                              var10.put(var79.a(), new ArrayList(var85));
                              var10000 = ((ClientLevel)(Object)(var85));
                           }

                           Object var91 = var10000;
                           boolean var94 = false;
                           var var99 = new ArrayList();
                           boolean var101 = false;

                           for (Object var106 : (Iterable<?>)(var91)) {
                              Vec3 var111 = (Vec3)var106;
                              boolean var32 = false;
                              var134 = this.b(var79.c(), var111);
                              if (var1 == null) {
                                 continue label308;
                              }

                              if (var1 != null) {
                                 var134 = !var134;
                              }

                              if (var134) {
                                 var99.add(var106);
                                 if (var1 == null) {
                                    break;
                                 }
                              }
                           }

                           List var88 = var99;
                           var134 = var88.isEmpty();
                           if (var1 == null) {
                              continue label308;
                           }

                           if (var134) {
                              continue label310;
                           }

                           label256: {
                              Vec3 var92 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a();
                              Vec3 var95 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(
                                 this, var79.a(), null, null, false);
                              double var97 = 4.15 + Random.Default.nextDouble() * 0.3;
                              Vec3 var137 = var95;
                              if (var1 != null) {
                                 if (var95 == null) {
                                    break label256;
                                 }

                                 var137 = var92;
                              }

                              if (var137.distanceToSqr(var95) <= var97 * var97) {
                                 var79.a(var95);
                                 this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = var4;
                                 this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = null;
                                 this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = 1;
                                 this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = var97;
                                 this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = true;
                                 return var79;
                              }
                           }

                           Iterable var104 = var88;
                           boolean var107 = false;
                           var var114 = new ArrayList();
                           boolean var33 = false;

                           for (Object var35 : var104) {
                              label471: {
                                 Vec3 var36;
                                 var36 = (Vec3)var35;
                                 boolean var37 = false;
                                 var var38 = var72;
                                 boolean var39 = false;
                                 var138 = var38;
                                 label281:
                                 if (var1 != null) {
                                    var134 = var38 instanceof Collection;
                                    if (var1 == null) {
                                       continue label308;
                                    }

                                    if (var134) {
                                       var138 = (Collection)var38;
                                       if (var1 == null) {
                                          break label281;
                                       }

                                       if (((me.octo.client.PXDyn)var138).isEmpty()) {
                                          var139 = 1;
                                          break label471;
                                       }
                                    }

                                    var138 = var38;
                                 }

                                 Iterator var40 = ((me.octo.client.PXDyn)var138).iterator();

                                 label273:
                                 while (true) {
                                    if (!var40.hasNext()) {
                                       var139 = 1;
                                       break;
                                    }

                                    Object var41 = var40.next();
                                    RemotePlayer var42 = (RemotePlayer)var41;
                                    boolean var43 = false;
                                    double var146;
                                    var139 = (
                                             var146 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .c(
                                                      var36,
                                                      me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                                         (net.minecraft.world.entity.Entity)var42
                                                      )
                                                   )
                                                - 1.0
                                          )
                                          == 0.0
                                       ? 0
                                       : (var146 < 0.0 ? -1 : 1);

                                    while (true) {
                                       if (var1 != null) {
                                          var139 = var139 < 0 ? 1 : 0;
                                       }

                                       if (var139 == 0) {
                                          break;
                                       }

                                       var139 = 0;
                                       if (var1 != null) {
                                          break label273;
                                       }
                                    }
                                 }
                              }

                              if (var1 != null) {
                                 if (var139 == 0) {
                                    continue;
                                 }

                                 var114.add(var35);
                              }

                              if (var1 == null) {
                                 break;
                              }
                           }

                           label296: {
                              List var102 = var114;
                              Collection var108 = var102;
                              boolean var140 = var108.isEmpty();
                              if (var1 != null) {
                                 if (!var140) {
                                    var10000 = ((ClientLevel)(Object)(var108));
                                    break label296;
                                 }

                                 boolean var141 = false;
                              }

                              var10000 = ((ClientLevel)(Object)(var88));
                           }

                           Iterable var109 = (Iterable)var10000;
                           boolean var112 = false;
                           List var105 = CollectionsKt.sortedWith(
                              var109,
                              new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                                 var79, var72, this, var4, var66, var58, var2
                              )
                           );

                           for (Vec3 var113 : (Iterable<Vec3>)(Object)(CollectionsKt.take(var105, 6))) {
                              if (var1 != null) {
                                 var135 = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(
                                    me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                    this.k(var113),
                                    null,
                                    2,
                                    null
                                 );
                                 var10001 = var135;
                                 if (var1 == null) {
                                    continue label306;
                                 }

                                 if (var135 != null) {
                                    var114 = var135;
                                    this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = var113;
                                    this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = var114;
                                    this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = 1;
                                    this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = 4.15
                                       + Random.Default.nextDouble() * 0.2;
                                    this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = true;
                                    return var79;
                                 }
                              }
                           }
                           break;
                        }
                        continue label310;
                     }

                     this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
                     return null;
                  }
               }
            }

            return null;
         }
      }

      return null;
   }

   private final BlockPos k(Vec3 var1) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      BlockPos var10001 = BlockPos.containing(var1);
      short var10003 = 23042;
      short var10004 = 25299;
      Intrinsics.checkNotNullExpressionValue(var10001, "containing(...)");
      BlockPos var3 = var10001;
      String var2 = var10000;
      int var4 = 0;

      while (var4 < 4) {
         ClientLevel var5 = this.a().level;
         Intrinsics.checkNotNull(var5);
         if (!var5.getBlockState(var3).isAir() && var2 != null) {
            break;
         }

         BlockPos var6 = var3.below();
         short var10002 = 23041;
         var10003 = -1015;
         Intrinsics.checkNotNullExpressionValue(var6, "below(...)");
         var3 = var6;
         var4++;
         if (var2 == null) {
            break;
         }
      }

      return var3;
   }

   private final double a(Vec3 var1, Vec3 var2, Vec3 var3) {
      double var5;
      double var7;
      double var22;
      label14: {
         var5 = var2.x - var1.x;
         String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         var7 = var2.z - var1.z;
         String var4 = var10000;
         double var9 = var5 * var5 + var7 * var7;
         var22 = var9;
         double var10001 = 1.0E-9;
         if (var4 != null) {
            if (var9 < 1.0E-9) {
               var22 = 0.0;
               break label14;
            }

            var22 = ((var3.x - var1.x) * var5 + (var3.z - var1.z) * var7) / var9;
            var10001 = 0.0;
         }

         var22 = RangesKt.coerceIn(var22, var10001, 1.0);
      }

      double var11 = var22;
      double var13 = var1.x + var11 * var5;
      double var15 = var1.z + var11 * var7;
      double var17 = var3.x - var13;
      double var19 = var3.z - var15;
      return Math.sqrt(var17 * var17 + var19 * var19);
   }

   private final double c(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            Vec3 var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
            AABB var5 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var1.a(), var1.b());
            double var6 = (var5.minX + var5.maxX) / 2.0;
            double var8 = (var5.minY + var5.maxY) / 2.0;
            double var10 = (var5.minZ + var5.maxZ) / 2.0;
            BlockPos var12 = var1.a();
            Triple[] var14 = new Triple[]{
               new Triple(new Vec3(0.0, 1.0, 0.0), new Vec3(var6, var5.maxY, var10), var12.above()),
               new Triple(new Vec3(0.0, -1.0, 0.0), new Vec3(var6, var5.minY, var10), var12.below()),
               new Triple(new Vec3(0.0, 0.0, -1.0), new Vec3(var6, var8, var5.minZ), var12.offset(0, 0, -1)),
               new Triple(new Vec3(0.0, 0.0, 1.0), new Vec3(var6, var8, var5.maxZ), var12.offset(0, 0, 1)),
               new Triple(new Vec3(-1.0, 0.0, 0.0), new Vec3(var5.minX, var8, var10), var12.offset(-1, 0, 0)),
               new Triple(new Vec3(1.0, 0.0, 0.0), new Vec3(var5.maxX, var8, var10), var12.offset(1, 0, 0))
            };
            List var13 = CollectionsKt.listOf(var14);
            double var26 = 0.0;
            Iterator var16 = var13.iterator();

            while (true) {
               boolean var27 = var16.hasNext();

               Vec3 var18;
               Vec3 var19;
               do {
                  if (!var27) {
                     return var26;
                  }

                  Triple var17 = (Triple)var16.next();
                  var18 = (Vec3)var17.component1();
                  var19 = (Vec3)var17.component2();
                  var10000 = (ClientLevel)var17.component3();
                  short var10002 = 23044;
                  short var10003 = 771;
                  Intrinsics.checkNotNullExpressionValue(var10000, "component3(...)");
                  BlockPos var20 = (BlockPos)(Object)var10000;
                  var27 = var3.getBlockState(var20).isAir();
               } while (var2 == null);

               if (var27) {
                  Vec3 var29 = var19.subtract(var4);
                  short var32 = 23065;
                  short var33 = 25114;
                  Intrinsics.checkNotNullExpressionValue(var29, "subtract(...)");
                  Vec3 var21 = var29;
                  double var22 = var21.lengthSqr();
                  double var30 = var22;
                  double var10001 = 1.0E-6;
                  if (var2 != null) {
                     if (var22 < 1.0E-6) {
                        continue;
                     }

                     var30 = Math.abs(var21.normalize().dot(var18));
                     var10001 = var22;
                  }

                  double var24 = var30 / var10001;
                  double var31 = var24;
                  if (var2 != null) {
                     if (!(var24 > var26)) {
                        continue;
                     }

                     var31 = var24;
                  }

                  var26 = var31;
                  if (var2 == null) {
                     return var26;
                  }
               }
            }
         }
      }

      return 0.0;
   }

   private final double a(double var1) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      double var4 = RangesKt.coerceIn(var1 / 0.05, 0.0, 1.0);
      String var3 = var10000;
      double var6 = var4;
      double var10001 = 0.75;
      if (var3 != null) {
         if (var4 >= 0.75) {
            return 0.0;
         }

         var6 = 75.0;
         var10001 = (0.75 - var4) / 0.75;
      }

      return var6 * var10001;
   }

   private final double d(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      return this.a(this.c(var1));
   }

   private final double l(Vec3 var1) {
      double var2 = Math.abs(
            me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c(var1)
               .a()
         )
         / 90.0;
      return var2 * var2 * 4.5;
   }

   private final double a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      int var2
   ) {
      Object var61 = null; // PX-FIX
      int var60 = 0; // PX-FIX
      int var58 = 0; // PX-FIX
      Object var57 = null; // PX-FIX
      Object var54 = null; // PX-FIX
      Object var53 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      byte var49 = 0; // PX-FIX
      Object var46 = null; // PX-FIX
      byte var45 = 0; // PX-FIX
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            Vec3 var42 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10000);
            if (var42 != null) {
               Vec3 var4 = var42;
               if (var3 != null) {
                  ClientLevel var43 = this.a().level;
                  if (var43 != null) {
                     ClientLevel var5 = var43;
                     if (var3 != null) {
                        me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var44 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .g();
                        if (var44 != null) {
                           me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6;
                           BlockState var7;
                           Vec3 var8;
                           byte var10;
                           double var11;
                           label372: {
                              byte var9;
                              var6 = var44;
                              var7 = var1.b();
                              var8 = var1.c();
                              var9 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .h(var7)) ? 1 : 0));
                              var10 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .k(var7)) ? 1 : 0));
                              var11 = 20.0;
                              var45 = var10;
                              label329:
                              if (var3 != null) {
                                 if (var10 != 0) {
                                    var45 = ((byte)((this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII) ? 1 : 0));
                                    if (var3 == null) {
                                       break label329;
                                    }

                                    if (!this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII) {
                                       var45 =(byte)( var2);
                                       if (var3 == null) {
                                          break label329;
                                       }

                                       if (var2 < 10) {
                                          var46 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
                                                == IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                                             ? var11 * 5.0
                                             : var11;
                                          break label372;
                                       }
                                    }
                                 }

                                 var45 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .j(var7)) ? 1 : 0));
                              }

                              if (var3 != null) {
                                 label314:
                                 if (var45 != 0) {
                                    IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid var47 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                                    IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid var10001 = IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                                    if (var3 != null) {
                                       if (this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
                                          == IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                                          )
                                        {
                                          break label314;
                                       }

                                       var47 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                                       var10001 = IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                                    }

                                    if (var47 != var10001) {
                                       var46 = var11;
                                       break label372;
                                    }
                                 }

                                 var45 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .i(var7)) ? 1 : 0));
                              }

                              if (var3 != null) {
                                 label302:
                                 if (var45 != 0) {
                                    IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid var48 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                                    IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid var62 = IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                                    if (var3 != null) {
                                       if (this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
                                          == IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                                          )
                                        {
                                          break label302;
                                       }

                                       var48 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                                       var62 = IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                                    }

                                    if (var48 != var62) {
                                       var46 = var11;
                                       break label372;
                                    }
                                 }

                                 var45 = var9;
                              }

                              if (var45 != 0
                                 && this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
                                    != IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 )
                               {
                                 var46 = var11;
                              } else {
                                 label377: {
                                    BlockPos var15 = var1.a();
                                    var49 = var10;
                                    label275:
                                    if (var3 != null) {
                                       if (var10 == 0) {
                                          var49 = ((byte)((this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.contains(var15)) ? 1 : 0));
                                          if (var3 == null) {
                                             break label275;
                                          }

                                          if ((var49 != 0)) {
                                             label283: {
                                                label282: {
                                                   IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var50 = this;
                                                   if (var3 != null) {
                                                      if (!this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.isEmpty()
                                                         )
                                                       {
                                                         break label282;
                                                      }

                                                      var50 = this;
                                                   }

                                                   var50.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = var8;
                                                   if (var3 != null) {
                                                      break label283;
                                                   }
                                                }

                                                double var16 = 1.0
                                                   / (this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.size() + 1);
                                                Vec3 var63 = this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll
                                                   .add(
                                                      var16
                                                         * (
                                                            var8.x
                                                               - this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.x
                                                         ),
                                                      var16
                                                         * (
                                                            var8.y
                                                               - this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.y
                                                         ),
                                                      var16
                                                         * (
                                                            var8.z
                                                               - this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.z
                                                         )
                                                   );
                                                short var10003 = 23049;
                                                short var10004 = -30319;
                                                Intrinsics.checkNotNullExpressionValue(var63, "add(...)");
                                                this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = var63;
                                             }

                                             this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.add(var15);
                                          }
                                       }

                                       var49 = var10;
                                    }

                                    if (var3 != null) {
                                       if ((var49 != 0)) {
                                          var46 = -100.0;
                                          break label377;
                                       }

                                       var49 = ((byte)((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .j(var7)) ? 1 : 0));
                                    }

                                    var46 = (var49 != 0 ? -5.0 : 0.0);
                                 }
                              }
                           }

                           double var13;
                           label266: {
                              label350: {
                                 var13 =((Double)( var46));
                                 IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid var51 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                                 IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid var64 = IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                 if (var3 != null) {
                                    if (this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
                                          == IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       && me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .j(var7)) {
                                       var13 += 16.0;
                                    }

                                    var52 = this;
                                    if (var3 == null) {
                                       break label350;
                                    }

                                    var51 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                                    var64 = IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                 }

                                 if (var51 == var64) {
                                    var53 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .i(var7);
                                    if (var3 == null) {
                                       break label266;
                                    }

                                    if (!((Boolean)var53)) {
                                       var13 += 10.0;
                                    }
                                 }

                                 var52 = this;
                              }

                              var53 = this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
                           }

                           label352: {
                              label252:
                              if (var3 != null) {
                                 if (!((Boolean)var53)) {
                                    var53 = var10;
                                    if (var3 == null) {
                                       break label252;
                                    }

                                    if (var10 != 0) {
                                       var13 -= 1000;
                                    }
                                 }

                                 var54 = var1;
                                 if (var3 == null) {
                                    break label352;
                                 }

                                 double var66;
                                 var53 = (var66 = var1.a().getY() - var4.y - 5.0) == 0.0 ? 0 : (var66 < 0.0 ? -1 : 1);
                              }

                              if ((((((Boolean)(Object)((Boolean)var53 ? 1 : 0)))) ? 1 : 0)  >= 0
                                 && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var8, var4, 0.5)) {
                                 var13 += var11 * 0.8;
                              }

                              var54 = this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
                           }

                           IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var33 = ((me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)(((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)( var54))));
                           int var55 = var6.k();
                           if (var3 != null) {
                              if (var55 > 100 && var33 != null) {
                                 double var56 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b(var33.c(), var8);
                                 if (var3 != null) {
                                    if (var56 < 3.0) {
                                       var13++;
                                    }

                                    var56 = var13;
                                 }

                                 double var27;
                                 label355: {
                                    Iterable var34;
                                    var34 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var1.a(), 1, 1, 1);
                                    var27 = var56;
                                    boolean var17 = false;
                                    var57 = var34 instanceof Collection;
                                    label237:
                                    if (var3 != null) {
                                       if (!((Boolean)var57)) {
                                          var57 = ((Collection)var34).isEmpty();
                                          if (var3 == null) {
                                             break label237;
                                          }

                                          if (!((Boolean)var57)) {
                                             var58 = 0;
                                             break label355;
                                          }
                                       }

                                       var57 = 0;
                                    }

                                    int var18 =((Integer)( var57));

                                    for (Object var20 : var34) {
                                       BlockPos var21 = (BlockPos)var20;
                                       boolean var22 = false;
                                       var58 = ((var5.getBlockState(var21).is(Blocks.BEDROCK)) ? 1 : 0);
                                       if (var3 == null) {
                                          break label355;
                                       }

                                       label357: {
                                          if (var3 != null) {
                                             if (var58 == 0) {
                                                continue;
                                             }

                                             var18++;
                                             if (var3 == null) {
                                                break label357;
                                             }

                                             var58 = var18;
                                          }

                                          if (var58 >= 0) {
                                             continue;
                                          }

                                          CollectionsKt.throwCountOverflow();
                                       }

                                       if (var3 == null) {
                                          break;
                                       }
                                    }

                                    var58 = var18;
                                 }

                                 int var29 = var58;
                                 var13 = var27 + var29 * 0.5;
                              }

                              var55 = ((this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl) ? 1 : 0);
                           }

                           label359: {
                              if (var3 != null) {
                                 if (var55 == 0) {
                                    break label359;
                                 }

                                 var55 = ((this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.isEmpty()) ? 1 : 0);
                              }

                              if (var3 != null) {
                                 var55 = var55 == 0 ? 1 : 0;
                              }

                              if (var55 != 0) {
                                 lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var35 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll);
                                 lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var36 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var8);
                                 lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var37 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .b(var36);
                                 lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var38 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                                    me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .c(var35.a() - 67.5F),
                                    0.0F
                                 );
                                 lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var39 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                                    me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .c(var35.a() + 67.5F),
                                    0.0F
                                 );
                                 float var67;
                                 int var59 = (var67 = var37.a() - 0.0F) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
                                 if (var3 != null) {
                                    var59 = var59 < 0 ? 1 : 0;
                                 }

                                 int var40 = var59;
                                 float var41 = var37.a();
                                 float var23 = 0.0F;

                                 while (true) {
                                    label362: {
                                       label181: {
                                          if (var23 < var41) {
                                             var60 = var40;
                                             if (var3 == null || var3 == null) {
                                                break label181;
                                             }

                                             if (var40 == 0) {
                                                break label362;
                                             }
                                          }

                                          float var68;
                                          var60 = (var68 = var23 - var41) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                                       }

                                       if (var3 != null) {
                                          if (var60 <= 0) {
                                             break;
                                          }

                                          var60 = var40;
                                       }

                                       if (var60 == 0) {
                                          break;
                                       }
                                    }

                                    me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var10002 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                    LocalPlayer var65 = this.a().player;
                                    Intrinsics.checkNotNull(var65);
                                    lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var24 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                                       var10002.c(var65.getYRot() + var23), 0.0F
                                    );
                                    lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var25 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var24, var38);
                                    lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var26 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var24, var39);
                                    float var69;
                                    var61 = (var69 = var25.a() - 0.0F) == 0.0F ? 0 : (var69 < 0.0F ? -1 : 1);
                                    label192:
                                    if (var3 != null) {
                                       if (((Boolean)var61)) {
                                          float var70;
                                          var61 = (var70 = var26.a() - 0.0F) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
                                          if (var3 == null) {
                                             break label192;
                                          }

                                          if (((Boolean)var61)) {
                                             var13 += 50.0;
                                             if (var3 != null) {
                                                break;
                                             }
                                          }
                                       }

                                       var61 = var40;
                                    }

                                    if (!((Boolean)var61)) {
                                       var23 -= 3.0F;
                                       if (var3 != null) {
                                          continue;
                                       }
                                    }

                                    var23 += 3.0F;
                                    if (var3 == null) {
                                       break;
                                    }
                                 }
                              }
                           }

                           var13 += me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(var8, true);
                           var13 += me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .d(var8)
                              * 0.2;
                           var13 += this.l(var8);
                           return var13 + this.d(var1);
                        }
                     }

                     return Double.MAX_VALUE;
                  }
               }

               return Double.POSITIVE_INFINITY;
            }
         }
      }

      return Double.POSITIVE_INFINITY;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final List<BlockPos> e(List<? extends BlockPos> var1) {
      int var15 = 0; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      HashSet var3 = new HashSet();
      String var2 = var10000;

      label105:
      for (BlockPos var5 : var1) {
         int var6 = -this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
         int var7 = this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;

         while (true) {
            int var14 = var6;
            if (var2 != null) {
               if (var6 > var7) {
                  break;
               }

               var14 = -this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
            }

            while (true) {
               int var10001;
               label115: {
                  int var8 = var14;
                  int var9 = this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
                  if (var8 <= var9) {
                     do {
                        int var10 = -this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
                        int var11 = this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
                        var15 = var10;
                        var10001 = var11;
                        if (var2 == null) {
                           break label115;
                        }

                        label116: {
                           if (var10 <= (((var11 != 0) ? 1 : 0))) {
                              do {
                                 BlockPos var16 = var5.offset(var8, var6, var10);
                                 short var10002 = 23067;
                                 short var10003 = 1309;
                                 Intrinsics.checkNotNullExpressionValue(var16, "offset(...)");
                                 BlockPos var12 = var16;
                                 var15 = ((var3.contains(var12)) ? 1 : 0);
                                 if (var2 == null) {
                                    var10001 = var9;
                                    break label116;
                                 }

                                 if ((var15 != 0)) {
                                    ClientLevel var17 = this.a().level;
                                    Intrinsics.checkNotNull(var17);
                                    BlockState var18 = var17.getBlockState(var12);
                                    var10002 = 23068;
                                    var10003 = 31569;
                                    Intrinsics.checkNotNullExpressionValue(var18, "getBlockState(...)");
                                    BlockState var13 = var18;
                                    var15 = ((me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .p(var13)) ? 1 : 0);
                                    label88:
                                    if (var2 != null) {
                                       label86:
                                       if (var2 != null) {
                                          if ((var15 != 0)) {
                                             boolean var19 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .k(var13);
                                             if (var2 == null) {
                                                break label86;
                                             }

                                             if (!var19) {
                                                var15 = ((var13.is(Blocks.BEDROCK)) ? 1 : 0);
                                                if (var2 == null) {
                                                   break label88;
                                                }

                                                if ((var15 != 0)) {
                                                   var15 = var10;
                                                   break label88;
                                                }
                                             }
                                          }

                                          var3.add(var12);
                                       }

                                       var15 = var10;
                                    }
                                 } else {
                                    var15 = var10;
                                 }

                                 var10001 =((Integer)( var11));
                                 if (var2 == null) {
                                    break label116;
                                 }

                                 if (var15 == var11) {
                                    break;
                                 }

                                 var10++;
                              } while (var2 != null);
                           }

                           var15 = var8;
                           var10001 = var9;
                        }

                        if (var2 == null) {
                           break label115;
                        }

                        if (var15 == var10001) {
                           break;
                        }

                        var8++;
                     } while (var2 != null);
                  }

                  var15 = var6;
                  var10001 = var7;
               }

               if (var15 == var10001) {
                  continue label105;
               }

               var6++;
               if (var2 == null) {
                  break;
               }

               if (var2 == null) {
                  return CollectionsKt.toList(var3);
               }

               var14 = -this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
            }
         }
      }

      return CollectionsKt.toList(var3);
   }

   @Override
   public void c(@NotNull BlockPos var1) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 23054;
      short var10003 = 22164;
      Intrinsics.checkNotNullParameter(var1, "pos");
      List var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            0.5,
            3.0,
            me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(var1),
            var1
         );
      String var2 = var10000;
      IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var15 = this;
      List var10001;
      if (!this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll) {
         Iterable var4 = var3;
         boolean var5 = false;
         var var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
         boolean var8 = false;

         for (Object var10 : var4) {
            BlockPos var11 = (BlockPos)var10;
            boolean var12 = false;
            var7.add(new Vec3(var11).add(0.5, 1.0, 0.5).add(this.g()));
            if (var2 == null) {
               return;
            }

            if (var2 == null) {
               break;
            }
         }

         var10001 = var7;
         var15 = this;
      } else {
         var10001 = CollectionsKt.listOf(
            me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w().add(this.g())
         );
      }

      var15.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = var10001;
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = this.e(var3);
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = null;
      Vec3 var16 = Vec3.ZERO;
      var10003 = 23051;
      short var10004 = 12122;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = var16;
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.clear();
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = false;
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll.clear();
      this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = null;
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = false;
      this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = 0L;
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = null;
      Vec3 var17 = Vec3.ZERO;
      var10003 = 23051;
      var10004 = 12122;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = var17;
      this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = null;
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = true;
      this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = 0L;
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl.f();
      super.c(var1);
   }

   private static final boolean a(Vec3 var0, BlockPos var1, Vec3 var2) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var4 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var2,
         var0.distanceTo(var2) + 0.5,
         null,
         null);
      String var3 = var10000;
      me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var5 = var4;
      if (var3 != null) {
         if (var4.b()
            != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )
          {
            return false;
         }

         var5 = var4;
      }

      boolean var6 = Intrinsics.areEqual(var5.c(), var1);
      return var3 == null ? var6 : var6;
   }

   private static final Boolean a(ClientLevel var0, BlockPos var1, BlockPos var2) {
      short var10001 = 23066;
      short var10002 = 22438;
      Intrinsics.checkNotNullParameter(var2, "it");
      return var0.getBlockState(var1).isAir();
   }

   private static final Boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Integer a(BlockPos var0, HashMap var1, ClientLevel var2, BlockPos var3) {
      short var10001 = 23052;
      short var10002 = 13285;
      Intrinsics.checkNotNullParameter(var3, "it");
      int var5 = 0;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var6 = -1;
      String var4 = var10000;

      label42:
      while (true) {
         int var9 = var6;

         label39:
         while (var9 < 2) {
            if (var4 == null) {
               return -1;
            }

            int var7 = -1;

            while (var7 < 2) {
               BlockPos var11 = var0.offset(var6, 0, var7);
               var10002 = 23045;
               short var10003 = 11839;
               Intrinsics.checkNotNullExpressionValue(var11, "offset(...)");
               BlockPos var8 = var11;
               if (var4 != null) {
                  var9 = ((Integer)(var1.computeIfAbsent(var8, null)));
                  if (var4 == null) {
                     continue label39;
                  }

                  if (var9 == 0) {
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
               continue label42;
            }
            break;
         }

         return var5;
      }
   }

   private static final Integer b(Function1 var0, Object var1) {
      return (Integer)var0.invoke(var1);
   }

   private static final Unit a(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var0, List var1, List var2, HashSet var3) {
      try {
         var0.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = var0.a(var1, var2, var3);
      } catch (Throwable var7) {
      } finally {
         var0.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.set(false);
      }

      return Unit.INSTANCE;
   }

   public static final double a(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var0, IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1) {
      return var0.d(var1);
   }

   public static final double a(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var0, IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, int var2) {
      return var0.a(var1, var2);
   }

   public static final double a(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var0, Vec3 var1) {
      return var0.l(var1);
   }

   public static final double a(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var0, Vec3 var1, Vec3 var2, Vec3 var3) {
      return var0.a(var1, var2, var3);
   }

   public static final int b(HashMap var0, HashMap var1, ClientLevel var2, BlockPos var3) {
      return a(var0, var1, var2, var3);
   }

   private static final int a(HashMap<BlockPos, Integer> var0, HashMap<BlockPos, Boolean> var1, ClientLevel var2, BlockPos var3) {
      Object var10000 = var0.computeIfAbsent(var3, null);
      short var10002 = 23046;
      short var10003 = 19584;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return ((Number)var10000).intValue();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[28];
      int var3 = 0;
      String var2 = "IXb\bðxq6\u0094s\r~\u0002ÚY\u0007 \u000b\u009cñ\u000bM\u008d\u0005ìU£\u0091ª\u0004EK\u00ad2\u0004\u0019Ó&!\b\u0096×½Ã\rÍ>©\u0014\"^`ÀÅ¤\\õ\u001fÙÒ]§\u0082\u009bàáæ\u0085¨\u0017ì)Ê¿NÃµÉâí\u0095¹\u009a\u0084\u000bãf\u0007Yy\u0016\u00ad\u0094\u000f>~ãÄ¯>HØ\u008fÍÚ¾îHÍ\u000b\u0086,r¥ýk\u0004k¸î,\u000fl_ªäë¹\u0004Èv|¼V\"UT\u0005\u001b']ßu\u0017Z{\u001cõ\u0094\u008aîà\u0089Èø\u001d7\u0010¾qÐU\u008f3ÌäÏ\nx\u0006\u000b\u009f\u008bï\u009c,m\u0001\nð\u001a\bþêH¨gØX\u0013ÿ2óý\u0081ç'¡þñ\u0080\u0000\u0004\u0083\u001f1\u0089 \u0001\u0012ü\\&ù.ì\u001d¦Äà9î¹U\u0002\u0092Ãi\b\u00adÒ\fB)ýº¯\u0002Ö6\u000b_bIl\u009aRèL%\n\u009f\u0012ì\u008d$Ãn«\u0015NÅý\u0019M½!\u0082\u001cÓ¸\r;9^që\u0003x\u008b\u0013ã\u0098Åg\b\u0097#K|Á:§W\u000f6\u0085^¶SñÝ\u0093:\\\u008b Ä\u009b\u0088";
      int var4 = "IXb\bðxq6\u0094s\r~\u0002ÚY\u0007 \u000b\u009cñ\u000bM\u008d\u0005ìU£\u0091ª\u0004EK\u00ad2\u0004\u0019Ó&!\b\u0096×½Ã\rÍ>©\u0014\"^`ÀÅ¤\\õ\u001fÙÒ]§\u0082\u009bàáæ\u0085¨\u0017ì)Ê¿NÃµÉâí\u0095¹\u009a\u0084\u000bãf\u0007Yy\u0016\u00ad\u0094\u000f>~ãÄ¯>HØ\u008fÍÚ¾îHÍ\u000b\u0086,r¥ýk\u0004k¸î,\u000fl_ªäë¹\u0004Èv|¼V\"UT\u0005\u001b']ßu\u0017Z{\u001cõ\u0094\u008aîà\u0089Èø\u001d7\u0010¾qÐU\u008f3ÌäÏ\nx\u0006\u000b\u009f\u008bï\u009c,m\u0001\nð\u001a\bþêH¨gØX\u0013ÿ2óý\u0081ç'¡þñ\u0080\u0000\u0004\u0083\u001f1\u0089 \u0001\u0012ü\\&ù.ì\u001d¦Äà9î¹U\u0002\u0092Ãi\b\u00adÒ\fB)ýº¯\u0002Ö6\u000b_bIl\u009aRèL%\n\u009f\u0012ì\u008d$Ãn«\u0015NÅý\u0019M½!\u0082\u001cÓ¸\r;9^që\u0003x\u008b\u0013ã\u0098Åg\b\u0097#K|Á:§W\u000f6\u0085^¶SñÝ\u0093:\\\u008b Ä\u009b\u0088"
         .length();
      char var1 = 3;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 37;
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
                     case 0 -> 92;
                     case 1 -> 16;
                     case 2 -> 76;
                     case 3 -> 122;
                     case 4 -> 116;
                     case 5 -> 120;
                     default -> 85;
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
                     d = new String[28];
                     IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = new IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = CollectionsKt.listOf(RemotePlayer.class);
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

                  var2 = "\u000b\u009aÈce:§6\u009faT\u0006H)\u0097®\\>";
                  var4 = "\u000b\u009aÈce:§6\u009faT\u0006H)\u0097®\\>".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 23;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 23054) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 155;
            case 1 -> 166;
            case 2 -> 2;
            case 3 -> 242;
            case 4 -> 219;
            case 5 -> 45;
            case 6 -> 76;
            case 7 -> 57;
            case 8 -> 235;
            case 9 -> 167;
            case 10 -> 250;
            case 11 -> 32;
            case 12 -> 134;
            case 13 -> 105;
            case 14 -> 64;
            case 15 -> 107;
            case 16 -> 172;
            case 17 -> 226;
            case 18 -> 207;
            case 19 -> 231;
            case 20 -> 102;
            case 21 -> 93;
            case 22 -> 106;
            case 23 -> 190;
            case 24 -> 10;
            case 25 -> 73;
            case 26 -> 49;
            case 27 -> 58;
            case 28 -> 68;
            case 29 -> 198;
            case 30 -> 147;
            case 31 -> 176;
            case 32 -> 159;
            case 33 -> 29;
            case 34 -> 96;
            case 35 -> 236;
            case 36 -> 238;
            case 37 -> 9;
            case 38 -> 212;
            case 39 -> 56;
            case 40 -> 118;
            case 41 -> 152;
            case 42 -> 16;
            case 43 -> 0;
            case 44 -> 251;
            case 45 -> 195;
            case 46 -> 41;
            case 47 -> 120;
            case 48 -> 84;
            case 49 -> 25;
            case 50 -> 132;
            case 51 -> 103;
            case 52 -> 187;
            case 53 -> 38;
            case 54 -> 123;
            case 55 -> 47;
            case 56 -> 18;
            case 57 -> 75;
            case 58 -> 23;
            case 59 -> 104;
            case 60 -> 244;
            case 61 -> 252;
            case 62 -> 156;
            case 63 -> 121;
            case 64 -> 199;
            case 65 -> 183;
            case 66 -> 233;
            case 67 -> 7;
            case 68 -> 192;
            case 69 -> 130;
            case 70 -> 157;
            case 71 -> 223;
            case 72 -> 158;
            case 73 -> 142;
            case 74 -> 116;
            case 75 -> 80;
            case 76 -> 33;
            case 77 -> 28;
            case 78 -> 161;
            case 79 -> 90;
            case 80 -> 171;
            case 81 -> 148;
            case 82 -> 71;
            case 83 -> 83;
            case 84 -> 237;
            case 85 -> 112;
            case 86 -> 247;
            case 87 -> 144;
            case 88 -> 217;
            case 89 -> 34;
            case 90 -> 129;
            case 91 -> 72;
            case 92 -> 229;
            case 93 -> 135;
            case 94 -> 240;
            case 95 -> 5;
            case 96 -> 200;
            case 97 -> 202;
            case 98 -> 196;
            case 99 -> 21;
            case 100 -> 79;
            case 101 -> 86;
            case 102 -> 88;
            case 103 -> 191;
            case 104 -> 234;
            case 105 -> 184;
            case 106 -> 114;
            case 107 -> 253;
            case 108 -> 70;
            case 109 -> 4;
            case 110 -> 30;
            case 111 -> 82;
            case 112 -> 239;
            case 113 -> 69;
            case 114 -> 145;
            case 115 -> 169;
            case 116 -> 113;
            case 117 -> 182;
            case 118 -> 205;
            case 119 -> 208;
            case 120 -> 189;
            case 121 -> 43;
            case 122 -> 13;
            case 123 -> 35;
            case 124 -> 50;
            case 125 -> 216;
            case 126 -> 12;
            case 127 -> 66;
            case 128 -> 213;
            case 129 -> 48;
            case 130 -> 153;
            case 131 -> 188;
            case 132 -> 61;
            case 133 -> 111;
            case 134 -> 97;
            case 135 -> 245;
            case 136 -> 40;
            case 137 -> 17;
            case 138 -> 109;
            case 139 -> 218;
            case 140 -> 81;
            case 141 -> 220;
            case 142 -> 24;
            case 143 -> 178;
            case 144 -> 94;
            case 145 -> 31;
            case 146 -> 141;
            case 147 -> 255;
            case 148 -> 36;
            case 149 -> 177;
            case 150 -> 186;
            case 151 -> 20;
            case 152 -> 180;
            case 153 -> 181;
            case 154 -> 254;
            case 155 -> 162;
            case 156 -> 52;
            case 157 -> 126;
            case 158 -> 139;
            case 159 -> 8;
            case 160 -> 78;
            case 161 -> 173;
            case 162 -> 201;
            case 163 -> 27;
            case 164 -> 197;
            case 165 -> 154;
            case 166 -> 128;
            case 167 -> 99;
            case 168 -> 91;
            case 169 -> 46;
            case 170 -> 133;
            case 171 -> 149;
            case 172 -> 55;
            case 173 -> 110;
            case 174 -> 136;
            case 175 -> 224;
            case 176 -> 6;
            case 177 -> 204;
            case 178 -> 246;
            case 179 -> 211;
            case 180 -> 85;
            case 181 -> 215;
            case 182 -> 53;
            case 183 -> 232;
            case 184 -> 164;
            case 185 -> 174;
            case 186 -> 39;
            case 187 -> 15;
            case 188 -> 165;
            case 189 -> 115;
            case 190 -> 122;
            case 191 -> 230;
            case 192 -> 22;
            case 193 -> 146;
            case 194 -> 137;
            case 195 -> 227;
            case 196 -> 203;
            case 197 -> 193;
            case 198 -> 95;
            case 199 -> 98;
            case 200 -> 108;
            case 201 -> 125;
            case 202 -> 168;
            case 203 -> 26;
            case 204 -> 77;
            case 205 -> 44;
            case 206 -> 124;
            case 207 -> 210;
            case 208 -> 117;
            case 209 -> 160;
            case 210 -> 143;
            case 211 -> 100;
            case 212 -> 101;
            case 213 -> 151;
            case 214 -> 225;
            case 215 -> 127;
            case 216 -> 170;
            case 217 -> 228;
            case 218 -> 194;
            case 219 -> 163;
            case 220 -> 11;
            case 221 -> 214;
            case 222 -> 1;
            case 223 -> 65;
            case 224 -> 241;
            case 225 -> 138;
            case 226 -> 14;
            case 227 -> 42;
            case 228 -> 222;
            case 229 -> 119;
            case 230 -> 54;
            case 231 -> 185;
            case 232 -> 51;
            case 233 -> 209;
            case 234 -> 89;
            case 235 -> 19;
            case 236 -> 60;
            case 237 -> 63;
            case 238 -> 221;
            case 239 -> 3;
            case 240 -> 67;
            case 241 -> 74;
            case 242 -> 62;
            case 243 -> 249;
            case 244 -> 179;
            case 245 -> 206;
            case 246 -> 37;
            case 247 -> 59;
            case 248 -> 92;
            case 249 -> 87;
            case 250 -> 248;
            case 251 -> 131;
            case 252 -> 150;
            case 253 -> 140;
            case 254 -> 243;
            default -> 175;
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

   public static enum PXEvMid {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl("NONE"),
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI("GRAY"),
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII("GREEN"),
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI("BLUE"),
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll("GRAY_GREEN");
      private static IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = { IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll };

      @NotNull
      public static IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      private PXEvMid(String var3) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      }

      @NotNull
      public final String a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public static IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid[] b() {
         return (IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clone();
      }

      public static IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid[] d() {
         return new IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid[]{
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         };
      }

      public static IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid a(
         String var0
      ) {
         return Enum.valueOf(
            IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid> c() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<PXEvMid> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = kotlin.enums.EnumEntriesKt.enumEntries(lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);

      public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
         private static String[] a;
         private static String[] b;

         public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var0) {
            this();
         }

         private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         }

         @NotNull
         public final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid a(
            @NotNull String var1
         ) {
            String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
            short var10002 = 12077;
            short var10003 = 18853;
            Intrinsics.checkNotNullParameter(var1, "value");
            String var2 = var10000;
            int var4 = var1.hashCode();
            if (var2 != null) {
               switch (var4) {
                  case -1465113081:
                     short var9 = 12079;
                     var10002 = -3440;
                     if (var1.equals("GRAY_GREEN")) {
                        return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                     }

                     return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  case 2041946:
                     short var8 = 12073;
                     var10002 = 4753;
                     if (var1.equals("BLUE")) {
                        return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     }

                     return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  case 2196067:
                     short var7 = 12078;
                     var10002 = 29174;
                     var4 = ((var1.equals("GRAY")) ? 1 : 0);
                     break;
                  case 2402104:
                     short var6 = 12072;
                     var10002 = -1447;
                     if (var1.equals("NONE")) {
                        return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     }

                     return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  case 68081379:
                     short var10001 = 12076;
                     var10002 = 28272;
                     if (var1.equals("GREEN")) {
                        return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     }

                     return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  default:
                     return IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               }
            }

            return var4 != 0
               ? IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               : IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
      char[] var20 = null; // PX-FIX
            String[] var5 = new String[6];
            int var3 = 0;
            String var2 = "\u0085´\u0095ð[\u0005ø\u00ad\u0004¶N\u0004Íy\u0098U\nÏ^Ø±gZ4#Ö\b";
            int var4 = "\u0085´\u0095ð[\u0005ø\u00ad\u0004¶N\u0004Íy\u0098U\nÏ^Ø±gZ4#Ö\b".length();
            char var1 = 5;
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 27;
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
                           case 0 -> 127;
                           case 1 -> 89;
                           case 2 -> 88;
                           case 3 -> 104;
                           case 4 -> 57;
                           case 5 -> 44;
                           default -> 97;
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
                           b = new String[6];
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

                        var2 = "è`ä+\u0004\u0087.\u009f\u0081";
                        var4 = "è`ä+\u0004\u0087.\u009f\u0081".length();
                        var1 = 4;
                        var8 = -1;
                  }

                  var10000 = 78;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }

         private static String a(int var0, int var1) {
            int var2 = (var0 ^ 12076) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 36;
                  case 1 -> 129;
                  case 2 -> 188;
                  case 3 -> 250;
                  case 4 -> 139;
                  case 5 -> 106;
                  case 6 -> 171;
                  case 7 -> 238;
                  case 8 -> 253;
                  case 9 -> 81;
                  case 10 -> 144;
                  case 11 -> 160;
                  case 12 -> 91;
                  case 13 -> 166;
                  case 14 -> 103;
                  case 15 -> 146;
                  case 16 -> 90;
                  case 17 -> 196;
                  case 18 -> 12;
                  case 19 -> 142;
                  case 20 -> 132;
                  case 21 -> 114;
                  case 22 -> 122;
                  case 23 -> 92;
                  case 24 -> 59;
                  case 25 -> 149;
                  case 26 -> 23;
                  case 27 -> 152;
                  case 28 -> 199;
                  case 29 -> 209;
                  case 30 -> 67;
                  case 31 -> 4;
                  case 32 -> 6;
                  case 33 -> 112;
                  case 34 -> 19;
                  case 35 -> 184;
                  case 36 -> 109;
                  case 37 -> 148;
                  case 38 -> 62;
                  case 39 -> 140;
                  case 40 -> 151;
                  case 41 -> 75;
                  case 42 -> 15;
                  case 43 -> 179;
                  case 44 -> 64;
                  case 45 -> 93;
                  case 46 -> 100;
                  case 47 -> 206;
                  case 48 -> 30;
                  case 49 -> 213;
                  case 50 -> 39;
                  case 51 -> 124;
                  case 52 -> 99;
                  case 53 -> 218;
                  case 54 -> 255;
                  case 55 -> 47;
                  case 56 -> 16;
                  case 57 -> 227;
                  case 58 -> 176;
                  case 59 -> 65;
                  case 60 -> 246;
                  case 61 -> 60;
                  case 62 -> 145;
                  case 63 -> 159;
                  case 64 -> 34;
                  case 65 -> 126;
                  case 66 -> 230;
                  case 67 -> 215;
                  case 68 -> 3;
                  case 69 -> 235;
                  case 70 -> 178;
                  case 71 -> 155;
                  case 72 -> 170;
                  case 73 -> 241;
                  case 74 -> 200;
                  case 75 -> 83;
                  case 76 -> 13;
                  case 77 -> 128;
                  case 78 -> 228;
                  case 79 -> 33;
                  case 80 -> 77;
                  case 81 -> 63;
                  case 82 -> 97;
                  case 83 -> 9;
                  case 84 -> 82;
                  case 85 -> 207;
                  case 86 -> 167;
                  case 87 -> 135;
                  case 88 -> 226;
                  case 89 -> 7;
                  case 90 -> 95;
                  case 91 -> 221;
                  case 92 -> 18;
                  case 93 -> 117;
                  case 94 -> 169;
                  case 95 -> 130;
                  case 96 -> 214;
                  case 97 -> 42;
                  case 98 -> 141;
                  case 99 -> 55;
                  case 100 -> 138;
                  case 101 -> 52;
                  case 102 -> 87;
                  case 103 -> 125;
                  case 104 -> 45;
                  case 105 -> 231;
                  case 106 -> 210;
                  case 107 -> 79;
                  case 108 -> 37;
                  case 109 -> 243;
                  case 110 -> 80;
                  case 111 -> 181;
                  case 112 -> 225;
                  case 113 -> 119;
                  case 114 -> 70;
                  case 115 -> 118;
                  case 116 -> 239;
                  case 117 -> 156;
                  case 118 -> 121;
                  case 119 -> 69;
                  case 120 -> 224;
                  case 121 -> 58;
                  case 122 -> 110;
                  case 123 -> 177;
                  case 124 -> 185;
                  case 125 -> 217;
                  case 126 -> 205;
                  case 127 -> 53;
                  case 128 -> 203;
                  case 129 -> 89;
                  case 130 -> 10;
                  case 131 -> 116;
                  case 132 -> 85;
                  case 133 -> 49;
                  case 134 -> 249;
                  case 135 -> 173;
                  case 136 -> 198;
                  case 137 -> 201;
                  case 138 -> 25;
                  case 139 -> 38;
                  case 140 -> 40;
                  case 141 -> 31;
                  case 142 -> 104;
                  case 143 -> 94;
                  case 144 -> 237;
                  case 145 -> 113;
                  case 146 -> 193;
                  case 147 -> 72;
                  case 148 -> 211;
                  case 149 -> 240;
                  case 150 -> 115;
                  case 151 -> 147;
                  case 152 -> 222;
                  case 153 -> 28;
                  case 154 -> 35;
                  case 155 -> 182;
                  case 156 -> 187;
                  case 157 -> 43;
                  case 158 -> 233;
                  case 159 -> 251;
                  case 160 -> 189;
                  case 161 -> 32;
                  case 162 -> 111;
                  case 163 -> 20;
                  case 164 -> 216;
                  case 165 -> 102;
                  case 166 -> 5;
                  case 167 -> 54;
                  case 168 -> 161;
                  case 169 -> 8;
                  case 170 -> 27;
                  case 171 -> 164;
                  case 172 -> 186;
                  case 173 -> 11;
                  case 174 -> 41;
                  case 175 -> 120;
                  case 176 -> 108;
                  case 177 -> 73;
                  case 178 -> 88;
                  case 179 -> 76;
                  case 180 -> 86;
                  case 181 -> 24;
                  case 182 -> 157;
                  case 183 -> 223;
                  case 184 -> 98;
                  case 185 -> 22;
                  case 186 -> 2;
                  case 187 -> 254;
                  case 188 -> 131;
                  case 189 -> 105;
                  case 190 -> 14;
                  case 191 -> 208;
                  case 192 -> 137;
                  case 193 -> 123;
                  case 194 -> 134;
                  case 195 -> 180;
                  case 196 -> 190;
                  case 197 -> 127;
                  case 198 -> 26;
                  case 199 -> 232;
                  case 200 -> 66;
                  case 201 -> 153;
                  case 202 -> 1;
                  case 203 -> 195;
                  case 204 -> 107;
                  case 205 -> 71;
                  case 206 -> 174;
                  case 207 -> 101;
                  case 208 -> 183;
                  case 209 -> 234;
                  case 210 -> 74;
                  case 211 -> 163;
                  case 212 -> 68;
                  case 213 -> 96;
                  case 214 -> 44;
                  case 215 -> 51;
                  case 216 -> 191;
                  case 217 -> 194;
                  case 218 -> 136;
                  case 219 -> 212;
                  case 220 -> 48;
                  case 221 -> 165;
                  case 222 -> 204;
                  case 223 -> 57;
                  case 224 -> 192;
                  case 225 -> 202;
                  case 226 -> 247;
                  case 227 -> 252;
                  case 228 -> 158;
                  case 229 -> 46;
                  case 230 -> 0;
                  case 231 -> 245;
                  case 232 -> 154;
                  case 233 -> 61;
                  case 234 -> 50;
                  case 235 -> 229;
                  case 236 -> 143;
                  case 237 -> 29;
                  case 238 -> 172;
                  case 239 -> 248;
                  case 240 -> 168;
                  case 241 -> 56;
                  case 242 -> 219;
                  case 243 -> 21;
                  case 244 -> 236;
                  case 245 -> 78;
                  case 246 -> 17;
                  case 247 -> 133;
                  case 248 -> 175;
                  case 249 -> 197;
                  case 250 -> 162;
                  case 251 -> 84;
                  case 252 -> 242;
                  case 253 -> 244;
                  case 254 -> 150;
                  default -> 220;
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

      static {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(null);
      }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   
      // PX-FIX-ok: Kotlin synthetic default-ctor bridge (jar: <init>(DefaultConstructorMarker)V)
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) {
      }
}

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll<T> implements Comparator<T> {
      final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII this$0;
      final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var1, int var2) {
         this.this$0 = var1;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var2;
      }

      @Override
      public final int compare(T var1, T var2) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         Comparable var10000 = this.this$0.a(var3, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var2;
         Comparable var5 = var10000;
         return ComparisonsKt.compareValues(var5, this.this$0.a(var3, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
      }
   }

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<T> implements Comparator<T> {
      final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII this$0;
      final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var1, int var2) {
         this.this$0 = var1;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var2;
      }

      @Override
      public final int compare(T var1, T var2) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         Comparable var10000 = this.this$0.a(var3, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var2;
         Comparable var5 = var10000;
         return ComparisonsKt.compareValues(var5, this.this$0.a(var3, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI<T> implements Comparator<T> {
      final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII this$0;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var1) {
         this.this$0 = var1;
      }

      @Override
      public final int compare(T var1, T var2) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1;
         Comparable var10000 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var3.c(), true)
            + me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var3.c()) * 0.2
            + this.this$0.d(var3)
            + this.this$0.l(var3.c());
         var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var2;
         Comparable var5 = var10000;
         return ComparisonsKt.compareValues(
            var5,
            me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var3.c(), true)
               + me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var3.c()) * 0.2
               + this.this$0.d(var3)
               + this.this$0.l(var3.c())
         );
      }
   }

   public static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<T> implements Comparator<T> {
      final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      final List lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII this$0;
      final Vec3 IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      final HashMap lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      final HashMap IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      final ClientLevel IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         List var2,
         IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII var3,
         Vec3 var4,
         HashMap var5,
         HashMap var6,
         ClientLevel var7
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.this$0 = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var6;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
      }

      @Override
      public final int compare(T var1, T var2) {
         String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Vec3 var4 = (Vec3)var1;
         String var3 = var10000;
         double var24 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var4, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c());
         HashMap var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         HashMap var10002 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         ClientLevel var10003 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         BlockPos var10004 = BlockPos.containing((Position)var4);
         Intrinsics.checkNotNullExpressionValue(var10004, "containing(...)");
         double var6 = var24 + IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.a(var10001, var10002, var10003, var10004) * 2.0;
         Iterator var8 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.iterator();
         double var25 = 0.0;

         while (true) {
            if (var8.hasNext()) {
               RemotePlayer var9 = (RemotePlayer)var8.next();
               Vec3 var10 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((Entity)var9);
               double var11 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var4, var10);
               var25 = var11;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  if (var11 < 2.5) {
                     var6 += (2.5 - var11) * 50.0;
                  }

                  var25 = this.this$0.a(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var4, var10);
               }

               double var13 = var25;
               double var26 = var13;
               double var32 = 1.25;
               if (var3 != null) {
                  if (!(var13 < 1.25)) {
                     continue;
                  }

                  var26 = var6;
                  var32 = (1.25 - var13) * 200.0;
               }

               var6 = var26 + var32;
               if (var3 != null) {
                  continue;
               }
            }

            var25 = var6;
            break;
         }

         Comparable var27 = var25;
         var4 = (Vec3)var2;
         Comparable var15 = var27;
         double var28 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var4, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c());
         var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         var10002 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         var10003 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var10004 = BlockPos.containing((Position)var4);
         Intrinsics.checkNotNullExpressionValue(var10004, "containing(...)");
         var6 = var28 + IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.a(var10001, var10002, var10003, var10004) * 2.0;
         var8 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.iterator();
         int var30 = 0;

         while (true) {
            if (var8.hasNext()) {
               RemotePlayer var20 = (RemotePlayer)var8.next();
               Vec3 var21 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((Entity)var20);
               double var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var4, var21);
               double var29 = var22;
               if (var3 != null) {
                  double var40;
                  var30 = (var40 = var22 - 2.5) == 0.0 ? 0 : (var40 < 0.0 ? -1 : 1);
                  if (var3 == null) {
                     break;
                  }

                  if (var30 < 0) {
                     var6 += (2.5 - var22) * 50.0;
                  }

                  var29 = this.this$0.a(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var4, var21);
               }

               double var23 = var29;
               double var31 = var23;
               double var34 = 1.25;
               if (var3 != null) {
                  if (!(var23 < 1.25)) {
                     continue;
                  }

                  var31 = var6;
                  var34 = (1.25 - var23) * 200.0;
               }

               var6 = var31 + var34;
               if (var3 != null) {
                  continue;
               }
            }

            var30 = ComparisonsKt.compareValues(var15, var6);
            break;
         }

         return var30;
      }
     static {
        pxClinit: {
        String[] var5 = new String[2];
        int var3 = 0;
        String var2 = "\032\u00bb\u00c6\004<T=\u00d3\017\u00bd\u00ef4\u00b9\u00da\u0081\017\012\u00b2\u00c4%|p5W\016-\u00cf&\u00bd\u0098\001";
        int var4 = "\032\u00bb\u00c6\004<T=\u00d3\017\u00bd\u00ef4\u00b9\u00da\u0081\017\012\u00b2\u00c4%|p5W\016-\u00cf&\u00bd\u0098\001".length();
        char var1 = 15;
        int var0 = -1;

        while (true) {
           char[] var10002;
           label38: {
              char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
              int var10004 = var10003.length;
              int var6 = 0;
              byte var13 = 9;
              var10002 = var10003;
              int var8 = var10004;
              byte var16;
              char[] var10005;
              int var10006;
              if (var10004 <= 1) {
                 var10005 = var10003;
                 var16 = 9;
                 var10006 = var6;
              } else {
                 var13 = 9;
                 var8 = var10004;
                 if (var10004 <= var6) {
                    break label38;
                 }

                 var10005 = var10003;
                 var16 = 9;
                 var10006 = var6;
              }

              while (true) {
                 var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                    case 0 -> 52;
                    case 1 -> 102;
                    case 2 -> 74;
                    case 3 -> 97;
                    case 4 -> 71;
                    case 5 -> 67;
                    default -> 89;
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
        int var2 = (var0 ^ -21318) & 65535;
        if (b[var2] == null) {
           char[] var3 = a[var2].toCharArray();

           short var4 = switch (var3[0] & 0xFF) {
              case 0 -> 105;
              case 1 -> 192;
              case 2 -> 254;
              case 3 -> 80;
              case 4 -> 125;
              case 5 -> 197;
              case 6 -> 188;
              case 7 -> 70;
              case 8 -> 111;
              case 9 -> 48;
              case 10 -> 81;
              case 11 -> 22;
              case 12 -> 9;
              case 13 -> 215;
              case 14 -> 35;
              case 15 -> 226;
              case 16 -> 66;
              case 17 -> 27;
              case 18 -> 172;
              case 19 -> 178;
              case 20 -> 234;
              case 21 -> 251;
              case 22 -> 174;
              case 23 -> 248;
              case 24 -> 77;
              case 25 -> 173;
              case 26 -> 196;
              case 27 -> 101;
              case 28 -> 206;
              case 29 -> 194;
              case 30 -> 203;
              case 31 -> 209;
              case 32 -> 224;
              case 33 -> 32;
              case 34 -> 117;
              case 35 -> 156;
              case 36 -> 189;
              case 37 -> 20;
              case 38 -> 115;
              case 39 -> 75;
              case 40 -> 42;
              case 41 -> 116;
              case 42 -> 142;
              case 43 -> 157;
              case 44 -> 3;
              case 45 -> 71;
              case 46 -> 36;
              case 47 -> 149;
              case 48 -> 52;
              case 49 -> 122;
              case 50 -> 130;
              case 51 -> 121;
              case 52 -> 97;
              case 53 -> 6;
              case 54 -> 158;
              case 55 -> 243;
              case 56 -> 94;
              case 57 -> 113;
              case 58 -> 87;
              case 59 -> 112;
              case 60 -> 109;
              case 61 -> 19;
              case 62 -> 200;
              case 63 -> 47;
              case 64 -> 193;
              case 65 -> 54;
              case 66 -> 134;
              case 67 -> 90;
              case 68 -> 219;
              case 69 -> 150;
              case 70 -> 175;
              case 71 -> 15;
              case 72 -> 239;
              case 73 -> 147;
              case 74 -> 91;
              case 75 -> 180;
              case 76 -> 250;
              case 77 -> 14;
              case 78 -> 76;
              case 79 -> 46;
              case 80 -> 217;
              case 81 -> 95;
              case 82 -> 72;
              case 83 -> 84;
              case 84 -> 168;
              case 85 -> 231;
              case 86 -> 88;
              case 87 -> 69;
              case 88 -> 179;
              case 89 -> 11;
              case 90 -> 1;
              case 91 -> 246;
              case 92 -> 18;
              case 93 -> 5;
              case 94 -> 61;
              case 95 -> 79;
              case 96 -> 124;
              case 97 -> 214;
              case 98 -> 40;
              case 99 -> 62;
              case 100 -> 137;
              case 101 -> 68;
              case 102 -> 136;
              case 103 -> 228;
              case 104 -> 143;
              case 105 -> 16;
              case 106 -> 39;
              case 107 -> 85;
              case 108 -> 99;
              case 109 -> 37;
              case 110 -> 65;
              case 111 -> 218;
              case 112 -> 138;
              case 113 -> 73;
              case 114 -> 182;
              case 115 -> 148;
              case 116 -> 183;
              case 117 -> 128;
              case 118 -> 102;
              case 119 -> 152;
              case 120 -> 21;
              case 121 -> 169;
              case 122 -> 96;
              case 123 -> 160;
              case 124 -> 155;
              case 125 -> 133;
              case 126 -> 0;
              case 127 -> 151;
              case 128 -> 2;
              case 129 -> 201;
              case 130 -> 222;
              case 131 -> 232;
              case 132 -> 235;
              case 133 -> 186;
              case 134 -> 103;
              case 135 -> 255;
              case 136 -> 198;
              case 137 -> 25;
              case 138 -> 24;
              case 139 -> 163;
              case 140 -> 127;
              case 141 -> 28;
              case 142 -> 92;
              case 143 -> 43;
              case 144 -> 162;
              case 145 -> 59;
              case 146 -> 204;
              case 147 -> 213;
              case 148 -> 220;
              case 149 -> 144;
              case 150 -> 56;
              case 151 -> 45;
              case 152 -> 51;
              case 153 -> 98;
              case 154 -> 132;
              case 155 -> 202;
              case 156 -> 170;
              case 157 -> 49;
              case 158 -> 167;
              case 159 -> 64;
              case 160 -> 104;
              case 161 -> 244;
              case 162 -> 199;
              case 163 -> 50;
              case 164 -> 181;
              case 165 -> 210;
              case 166 -> 30;
              case 167 -> 177;
              case 168 -> 190;
              case 169 -> 195;
              case 170 -> 145;
              case 171 -> 60;
              case 172 -> 229;
              case 173 -> 114;
              case 174 -> 53;
              case 175 -> 23;
              case 176 -> 140;
              case 177 -> 12;
              case 178 -> 165;
              case 179 -> 238;
              case 180 -> 129;
              case 181 -> 63;
              case 182 -> 249;
              case 183 -> 13;
              case 184 -> 212;
              case 185 -> 17;
              case 186 -> 223;
              case 187 -> 252;
              case 188 -> 106;
              case 189 -> 245;
              case 190 -> 184;
              case 191 -> 82;
              case 192 -> 191;
              case 193 -> 146;
              case 194 -> 166;
              case 195 -> 236;
              case 196 -> 86;
              case 197 -> 83;
              case 198 -> 8;
              case 199 -> 176;
              case 200 -> 221;
              case 201 -> 159;
              case 202 -> 131;
              case 203 -> 33;
              case 204 -> 74;
              case 205 -> 110;
              case 206 -> 230;
              case 207 -> 211;
              case 208 -> 154;
              case 209 -> 93;
              case 210 -> 208;
              case 211 -> 241;
              case 212 -> 225;
              case 213 -> 233;
              case 214 -> 55;
              case 215 -> 237;
              case 216 -> 44;
              case 217 -> 205;
              case 218 -> 38;
              case 219 -> 240;
              case 220 -> 78;
              case 221 -> 41;
              case 222 -> 67;
              case 223 -> 123;
              case 224 -> 118;
              case 225 -> 135;
              case 226 -> 153;
              case 227 -> 7;
              case 228 -> 26;
              case 229 -> 4;
              case 230 -> 34;
              case 231 -> 242;
              case 232 -> 120;
              case 233 -> 31;
              case 234 -> 126;
              case 235 -> 100;
              case 236 -> 89;
              case 237 -> 187;
              case 238 -> 57;
              case 239 -> 247;
              case 240 -> 139;
              case 241 -> 119;
              case 242 -> 227;
              case 243 -> 58;
              case 244 -> 29;
              case 245 -> 10;
              case 246 -> 185;
              case 247 -> 171;
              case 248 -> 108;
              case 249 -> 141;
              case 250 -> 253;
              case 251 -> 161;
              case 252 -> 107;
              case 253 -> 216;
              case 254 -> 164;
              default -> 207;
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
