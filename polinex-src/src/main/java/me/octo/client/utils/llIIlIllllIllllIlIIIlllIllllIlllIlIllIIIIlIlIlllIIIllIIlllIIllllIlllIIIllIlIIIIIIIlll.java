package me.octo.client.utils;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll {
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld2
   public static me.octo.client.PXDyn var21 = null; // PX-FIX missing field v2
   
   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIII

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIII

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIII

   public static <T> T b(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   @NotNull
   public static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static AABB[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Object IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Long2ObjectOpenHashMap<AABB[]> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Object IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Long2ByteOpenHashMap lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] a;
   private static String[] b;

   private llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll() {
   }

   @NotNull
   public final Vec3 a() {
      int var1 = c();
      if (var1 != 0) {
         LocalPlayer var10000 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            Vec3 var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2)
               .add(0.0, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.x(), 0.0);
            short var5 = 12095;
            short var6 = -15472;
            Intrinsics.checkNotNullExpressionValue(var4, "add(...)");
            return var4;
         }
      }

      Vec3 var3 = Vec3.ZERO;
      short var10002 = 12088;
      short var10003 = -11207;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return var3;
   }

   private final Vec3 b() {
      return me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.A();
   }

   // $VF: Extended synchronized range to monitorexit
   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 12094;
      short var10002 = 765;
      Intrinsics.checkNotNullParameter(var1, "event");
      Object var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      synchronized (var2) {
         boolean var3 = false;
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
         Unit var8 = Unit.INSTANCE;
      }

      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      synchronized (var2) {
         boolean var9 = false;
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clear();
         Unit var10 = Unit.INSTANCE;
      }
   }

   // $VF: Extended synchronized range to monitorexit
   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var1) {
      int var10000 = d();
      short var10002 = 12082;
      short var10003 = -25630;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      if (var2 == 0) {
         BlockPos var15 = var1.k();
         if (var15 != null) {
            BlockPos var3 = var15;
            long var4 = var3.asLong();
            Object var6 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            synchronized (var6) {
               boolean var7 = false;
               AABB[] var12 = (AABB[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.remove(var4);
            }

            var6 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            synchronized (var6) {
               byte var13 = 0;
               var13 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.remove(var4);
               return;
            }
         }
      }
   }

   // $VF: Extended synchronized range to monitorexit
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final AABB[] a(ClientLevel var1, MutableBlockPos var2, long var3) {
      Object var36 = null; // PX-FIX
      AABB[] var7 = (AABB[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var10000 = c();
      synchronized (var7){} // $VF: monitorenter 
      int var5 = var10000;

      try {
         boolean var8 = false;
         if (var5 != 0) {
            AABB[] var31 = (AABB[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
            if (var31 != null) {
               AABB[] var27 = var31;
               boolean var29 = false;
               return var27;
            }
         }

         Object var24 = null;
      } finally {
         // $VF: monitorexit
      }

      label131: {
         BlockState var32 = var1.getBlockState(var2);
         short var10002 = 12069;
         short var10003 = 16416;
         Intrinsics.checkNotNullExpressionValue(var32, "getBlockState(...)");
         BlockState var6 = var32;
         BlockState var33 = var6;
         if (var5 != 0) {
            if (var6.isAir()) {
               var36 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               break label131;
            }

            var33 = var6;
         }

         List var34 = var33.getShape(var1, var2).toAabbs();
         var10002 = 12081;
         var10003 = -14578;
         Intrinsics.checkNotNullExpressionValue(var34, "toAabbs(...)");
         List var25 = var34;
         var10000 = ((var25.isEmpty()) ? 1 : 0);
         if (var5 != 0) {
            if (var10000 != 0) {
               var36 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               break label131;
            }

            var10000 = var2.getX();
         }

         double var9 = var10000;
         double var11 = var2.getY();
         double var13 = var2.getZ();
         int var15 = 0;
         int var16 = var25.size();
         AABB[] var17 = new AABB[var16];

         while (var15 < var16) {
            var36 = var17;
            if (var5 == 0) {
               break label131;
            }

            var17[var15] = ((AABB)var25.get(var15)).move(var9, var11, var13);
            var15++;
            if (var5 == 0) {
               break;
            }
         }

         var36 = var17;
      }

      var7 = ((AABB[])( var36));
      Object var26 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      synchronized (var26) {
         boolean var10 = false;
         Object var37 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var5 != 0) {
            if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size() >= 100000) {
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
            }

            var37 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var7);
         }

         AABB[] var28 = (AABB[])var37;
         return ((AABB[])(Object)(var7));
      }
   }

   @NotNull
   public final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid a(
      @NotNull Vec3 var1, @NotNull List<? extends Class<? extends Entity>> var2, @NotNull Vec3 var3
   ) {
      int var10000 = c();
      short var10002 = 12074;
      short var10003 = -14422;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10002 = 12071;
      var10003 = 5638;
      Intrinsics.checkNotNullParameter(var2, "entityClasses");
      var10002 = 12067;
      var10003 = 6755;
      Intrinsics.checkNotNullParameter(var3, "from");
      int var4 = var10000;
      if (var4 != 0) {
         ClientLevel var7 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .level;
         if (var7 != null) {
            ClientLevel var5 = var7;
            llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var6 = this.a(
               var5, new AABB(var3, var1), var2
            );
            return this.a(var5, var3, var1, var6);
         }
      }

      return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
   }

   @NotNull
   public final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid a(
      @NotNull Vec3 var1, double var2, @NotNull List<? extends Class<? extends Entity>> var4, @NotNull Vec3 var5
   ) {
      short var10001 = 12074;
      short var10002 = -14422;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10001 = 12078;
      var10002 = -14915;
      Intrinsics.checkNotNullParameter(var4, "entityClasses");
      var10001 = 12067;
      var10002 = 6755;
      Intrinsics.checkNotNullParameter(var5, "from");
      Vec3 var10000 = var1.subtract(var5).normalize();
      var10002 = 12083;
      short var10003 = 9803;
      Intrinsics.checkNotNullExpressionValue(var10000, "normalize(...)");
      Vec3 var6 = var10000;
      Vec3 var9 = var5.add(var6.scale(var2));
      var10003 = 12090;
      short var10004 = 25836;
      Intrinsics.checkNotNullExpressionValue(var9, "add(...)");
      return this.a(var9, var4, var5);
   }

   private final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid a(
      ClientLevel var1,
      Vec3 var2,
      Vec3 var3,
      llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var4
   ) {
      int var10000 = d();
      double var6 = var3.x - var2.x;
      int var5 = var10000;
      double var8 = var3.y - var2.y;
      double var10 = var3.z - var2.z;
      double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
      double var73 = var12;
      double var10001 = 1.0E-7;
      if (var5 == 0) {
         if (var12 < 1.0E-7) {
            Vec3 var90 = Vec3.ZERO;
            short var93 = 12073;
            byte var96 = 43;
            Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
            return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
               var90,
               llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               null,
               null,
               12,
               null
            );
         }

         var73 = var6;
         var10001 = var12;
      }

      double var14 = var73 / var10001;
      double var16 = var8 / var12;
      double var18 = var10 / var12;
      double var97;
      var10000 = (var97 = var14 - 0.0) == 0.0 ? 0 : (var97 < 0.0 ? -1 : 1);
      if (var5 == 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      double var20 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var14 : 1.0E30));
      double var98;
      var10000 = (var98 = var16 - 0.0) == 0.0 ? 0 : (var98 < 0.0 ? -1 : 1);
      if (var5 == 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      double var22 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var16 : 1.0E30));
      double var99;
      var10000 = (var99 = var18 - 0.0) == 0.0 ? 0 : (var99 < 0.0 ? -1 : 1);
      if (var5 == 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      double var24;
      int var26;
      int var27;
      int var28;
      label301: {
         var24 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var18 : 1.0E30));
         var26 = (int)Math.floor(var2.x);
         var27 = (int)Math.floor(var2.y);
         var28 = (int)Math.floor(var2.z);
         double var100;
         var10000 = (var100 = var14 - 0.0) == 0.0 ? 0 : (var100 < 0.0 ? -1 : 1);
         if (var5 == 0) {
            if (var10000 > 0) {
               var10000 = 1;
               break label301;
            }

            double var101;
            var10000 = (var101 = var14 - 0.0) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
         }

         if (var5 == 0) {
            var10000 = var10000 < 0 ? -1 : 0;
         }
      }

      int var29;
      label295: {
         var29 = var10000;
         double var102;
         var10000 = (var102 = var16 - 0.0) == 0.0 ? 0 : (var102 < 0.0 ? -1 : 1);
         if (var5 == 0) {
            if (var10000 > 0) {
               var10000 = 1;
               break label295;
            }

            double var103;
            var10000 = (var103 = var16 - 0.0) == 0.0 ? 0 : (var103 < 0.0 ? -1 : 1);
         }

         if (var5 == 0) {
            var10000 = var10000 < 0 ? -1 : 0;
         }
      }

      int var30;
      label289: {
         var30 = var10000;
         double var104;
         var10000 = (var104 = var18 - 0.0) == 0.0 ? 0 : (var104 < 0.0 ? -1 : 1);
         if (var5 == 0) {
            if (var10000 > 0) {
               var10000 = 1;
               break label289;
            }

            double var105;
            var10000 = (var105 = var18 - 0.0) == 0.0 ? 0 : (var105 < 0.0 ? -1 : 1);
         }

         if (var5 == 0) {
            var10000 = var10000 < 0 ? -1 : 0;
         }
      }

      int var31 = var10000;
      double var32 = var29 != 0 ? Math.abs(var20) : Double.MAX_VALUE;
      double var34 = var30 != 0 ? Math.abs(var22) : Double.MAX_VALUE;
      double var36 = var31 != 0 ? Math.abs(var24) : Double.MAX_VALUE;
      double var38 = this.a(var2.x, var26, var29, var20);
      double var40 = this.a(var2.y, var27, var30, var22);
      double var42 = this.a(var2.z, var28, var31, var24);
      MutableBlockPos var44 = new MutableBlockPos();
      int var45 = (int)(var12 * 3 + 3);
      var10000 = var4.length;
      if (var5 == 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      int var46 = var10000 == 0 ? 1 : 0;
      llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var47 = null;
      double var48 = var12;
      int var50 = 0;

      while (true) {
         label279:
         if (var50 < var45) {
            long var51 = BlockPos.asLong(var26, var27, var28);
            var44.set(var26, var27, var28);
            AABB[] var53 = this.a(var1, var44, var51);
            int var54 = 0;
            if (var5 != 0) {
               break;
            }

            int var55 = var53.length;

            label276: {
               label275:
               while (true) {
                  if (var54 < var55) {
                     AABB var56 = var53[var54];
                     Double var57 = this.a(var2, var20, var22, var24, var56, var48);
                     if (var5 != 0) {
                        break;
                     }

                     if (var5 == 0) {
                        label268:
                        if (var57 != null) {
                           double var81 = var57;
                           if (var5 == 0) {
                              if (!(var81 < var48)) {
                                 break label268;
                              }

                              var81 = var57;
                           }

                           var48 = var81;
                           Vec3 var10002 = var2.add(var14 * var57, var16 * var57, var18 * var57);
                           short var10004 = 12090;
                           short var10005 = 25836;
                           Intrinsics.checkNotNullExpressionValue(var10002, "add(...)");
                           var47 = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                              var10002,
                              llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                              var44.immutable(),
                              null,
                              8,
                              null
                           );
                        }

                        var54++;
                     }

                     if (var5 == 0) {
                        continue;
                     }
                  }

                  var10000 = var46;
                  if (var5 != 0) {
                     break label276;
                  }

                  if (var46 != 0) {
                     double var70 = var26;
                     double var71 = var70 + 1.0;
                     double var72 = var27;
                     double var59 = var72 + 1.0;
                     double var61 = var28;
                     double var63 = var61 + 1.0;
                     int var65 = 0;
                     int var66 = var4.length;

                     while (var65 < var66) {
                        llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var67 = var4[var65];
                        AABB var68 = var67.b();
                        label251:
                        if (var5 == 0) {
                           double var106;
                           var10000 = (var106 = var68.maxX - var70) == 0.0 ? 0 : (var106 < 0.0 ? -1 : 1);
                           if (var5 != 0) {
                              break label276;
                           }

                           label248:
                           if (var10000 > 0) {
                              double var107;
                              var10000 = (var107 = var68.minX - var71) == 0.0 ? 0 : (var107 < 0.0 ? -1 : 1);
                              if (var5 == 0) {
                                 if (var10000 >= 0) {
                                    break label248;
                                 }

                                 double var108;
                                 var10000 = (var108 = var68.maxY - var72) == 0.0 ? 0 : (var108 < 0.0 ? -1 : 1);
                              }

                              if (var5 == 0) {
                                 if (var10000 <= 0) {
                                    break label248;
                                 }

                                 double var109;
                                 var10000 = (var109 = var68.minY - var59) == 0.0 ? 0 : (var109 < 0.0 ? -1 : 1);
                              }

                              if (var5 == 0) {
                                 if (var10000 >= 0) {
                                    break label248;
                                 }

                                 double var110;
                                 var10000 = (var110 = var68.maxZ - var61) == 0.0 ? 0 : (var110 < 0.0 ? -1 : 1);
                              }

                              if (var5 == 0) {
                                 if (var10000 <= 0) {
                                    break label248;
                                 }

                                 double var111;
                                 var10000 = (var111 = var68.minZ - var63) == 0.0 ? 0 : (var111 < 0.0 ? -1 : 1);
                              }

                              if (var10000 < 0) {
                                 Double var69 = this.a(var2, var20, var22, var24, var68, var48);
                                 if (var5 != 0) {
                                    break label251;
                                 }

                                 label225:
                                 if (var69 != null) {
                                    double var84 = var69;
                                    if (var5 == 0) {
                                       if (!(var84 < var48)) {
                                          break label225;
                                       }

                                       var84 = var69;
                                    }

                                    var48 = var84;
                                    Vec3 var88 = var2.add(var14 * var69, var16 * var69, var18 * var69);
                                    short var91 = 12090;
                                    short var94 = 25836;
                                    Intrinsics.checkNotNullExpressionValue(var88, "add(...)");
                                    var47 = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                                       var88,
                                       llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                       null,
                                       var67.a(),
                                       4,
                                       null
                                    );
                                 }
                              }
                           }

                           var65++;
                        }

                        if (var5 != 0) {
                           break label275;
                        }
                     }
                  }
                  break;
               }

               double var112;
               var10000 = (var112 = var38 - var40) == 0.0 ? 0 : (var112 < 0.0 ? -1 : 1);
            }

            label323: {
               label206:
               if (var5 == 0) {
                  if (var10000 <= 0) {
                     double var113;
                     var10000 = (var113 = var38 - var42) == 0.0 ? 0 : (var113 < 0.0 ? -1 : 1);
                     if (var5 != 0) {
                        break label206;
                     }

                     if (var10000 <= 0) {
                        double var114;
                        var10000 = (var114 = var38 - var12) == 0.0 ? 0 : (var114 < 0.0 ? -1 : 1);
                        if (var5 == 0) {
                           if (var10000 > 0) {
                              break label279;
                           }

                           var38 += var32;
                           var10000 = var26 + var29;
                        }

                        var26 = var10000;
                        if (var5 == 0) {
                           break label323;
                        }
                     }
                  }

                  double var115;
                  var10000 = (var115 = var40 - var42) == 0.0 ? 0 : (var115 < 0.0 ? -1 : 1);
               }

               if (var5 == 0) {
                  if (var10000 <= 0) {
                     double var116;
                     var10000 = (var116 = var40 - var12) == 0.0 ? 0 : (var116 < 0.0 ? -1 : 1);
                     if (var5 == 0) {
                        if (var10000 > 0) {
                           break label279;
                        }

                        var40 += var34;
                        var10000 = var27 + var30;
                     }

                     var27 = var10000;
                     if (var5 == 0) {
                        break label323;
                     }
                  }

                  double var117;
                  var10000 = (var117 = var42 - var12) == 0.0 ? 0 : (var117 < 0.0 ? -1 : 1);
               }

               if (var5 == 0) {
                  if (var10000 > 0) {
                     break label279;
                  }

                  var42 += var36;
                  var10000 = var28 + var31;
               }

               var28 = var10000;
            }

            var50++;
            if (var5 == 0) {
               continue;
            }
         }

         if (var47 != null) {
            return var47;
         }
         break;
      }

      Vec3 var89 = Vec3.ZERO;
      short var92 = 12073;
      byte var95 = 43;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
         var89,
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         null,
         null,
         12,
         null
      );
   }

   // $VF: Extended synchronized range to monitorexit
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final boolean b(ClientLevel var1, MutableBlockPos var2, long var3) {
      Object var7 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      int var10000 = c();
      synchronized (var7){} // $VF: monitorenter 
      int var5 = var10000;

      try {
         boolean var8 = false;
         byte var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
         if (var5 != 0 && var9 != 0) {
            var10000 = var9;
            if (var5 != 0) {
               var10000 = var9 == 1 ? 1 : 0;
            }

            return (var10000 != 0);
         }

         Unit var15 = Unit.INSTANCE;
      } finally {
         // $VF: monitorexit
      }

      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var19 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      BlockState var10001 = var1.getBlockState(var2);
      short var10003 = 12075;
      short var10004 = 5882;
      Intrinsics.checkNotNullExpressionValue(var10001, "getBlockState(...)");
      byte var6 = ((byte)((var19.a(var10001)) ? 1 : 0));
      Object var16 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      synchronized (var16) {
         byte var17 = 0;
         Long2ByteOpenHashMap var20 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         if (var5 != 0) {
            if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.size() >= 100000) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clear();
            }

            var20 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         int var10002 = var6;
         if (var5 != 0) {
            var10002 = var6 != 0 ? 1 : 2;
         }

         var17 = var20.put(var3, (byte)var10002);
         return (var6 != 0);
      }
   }

   @NotNull
   public final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid a(
      @NotNull Vec3 var1, @NotNull Vec3 var2
   ) { double var21 = 0.0; // PX-FIX hoist
        
      int var10000 = d();
      short var10002 = 12074;
      short var10003 = -14422;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10002 = 12067;
      var10003 = 6755;
      Intrinsics.checkNotNullParameter(var2, "from");
      int var3 = var10000;
      if (var3 == 0) {
         ClientLevel var49 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .level;
         if (var49 != null) {
            ClientLevel var4 = var49;
            double var5 = var1.x - var2.x;
            double var7 = var1.y - var2.y;
            double var9 = var1.z - var2.z;
            double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
            double var50 = var11;
            double var10001 = 1.0E-7;
            if (var3 == 0) {
               if (var11 < 1.0E-7) {
                  Vec3 var66 = Vec3.ZERO;
                  short var72 = 12073;
                  byte var77 = 43;
                  Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
                  return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                     var66,
                     llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                     null,
                     null,
                     12,
                     null
                  );
               }

               var50 = var5;
               var10001 = var11;
            }

            double var13 = var50 / var10001;
            double var15 = var7 / var11;
            double var17 = var9 / var11;
            double var78;
            var10000 = (var78 = var13 - 0.0) == 0.0 ? 0 : (var78 < 0.0 ? -1 : 1);
            if (var3 == 0) {
               var10000 = (((var10000 == 0) ? 1 : 0));
            }

            double var19 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var13 : 1.0E30));
            double var79;
            var10000 = (var79 = var15 - 0.0) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
            if (var3 == 0) {
               var10000 = (((var10000 == 0) ? 1 : 0));
            }

             var21 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var15 : 1.0E30));
            double var80;
            var10000 = (var80 = var17 - 0.0) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
            if (var3 == 0) {
               var10000 = (((var10000 == 0) ? 1 : 0));
            }

            double var23;
            int var25;
            int var26;
            int var27;
            label188: {
               var23 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var17 : 1.0E30));
               var25 = (int)Math.floor(var2.x);
               var26 = (int)Math.floor(var2.y);
               var27 = (int)Math.floor(var2.z);
               double var81;
               var10000 = (var81 = var13 - 0.0) == 0.0 ? 0 : (var81 < 0.0 ? -1 : 1);
               if (var3 == 0) {
                  if (var10000 > 0) {
                     var10000 = 1;
                     break label188;
                  }

                  double var82;
                  var10000 = (var82 = var13 - 0.0) == 0.0 ? 0 : (var82 < 0.0 ? -1 : 1);
               }

               if (var3 == 0) {
                  var10000 = var10000 < 0 ? -1 : 0;
               }
            }

            int var28;
            label182: {
               var28 = var10000;
               double var83;
               var10000 = (var83 = var15 - 0.0) == 0.0 ? 0 : (var83 < 0.0 ? -1 : 1);
               if (var3 == 0) {
                  if (var10000 > 0) {
                     var10000 = 1;
                     break label182;
                  }

                  double var84;
                  var10000 = (var84 = var15 - 0.0) == 0.0 ? 0 : (var84 < 0.0 ? -1 : 1);
               }

               if (var3 == 0) {
                  var10000 = var10000 < 0 ? -1 : 0;
               }
            }

            int var29;
            label176: {
               var29 = var10000;
               double var85;
               var10000 = (var85 = var17 - 0.0) == 0.0 ? 0 : (var85 < 0.0 ? -1 : 1);
               if (var3 == 0) {
                  if (var10000 > 0) {
                     var10000 = 1;
                     break label176;
                  }

                  double var86;
                  var10000 = (var86 = var17 - 0.0) == 0.0 ? 0 : (var86 < 0.0 ? -1 : 1);
               }

               if (var3 == 0) {
                  var10000 = var10000 < 0 ? -1 : 0;
               }
            }

            int var30 = var10000;
            double var31 = var28 != 0 ? Math.abs(var19) : Double.MAX_VALUE;
            double var33 = var29 != 0 ? Math.abs(var21) : Double.MAX_VALUE;
            double var35 = var30 != 0 ? Math.abs(var23) : Double.MAX_VALUE;
            double var37 = this.a(var2.x, var25, var28, var19);
            double var39 = this.a(var2.y, var26, var29, var21);
            double var41 = this.a(var2.z, var27, var30, var23);
            MutableBlockPos var43 = new MutableBlockPos();
            int var44 = (int)(var11 * 3 + 3);
            int var45 = 0;

            while (var45 < var44) {
               long var46 = BlockPos.asLong(var25, var26, var27);
               var43.set(var25, var26, var27);
               var10000 = ((this.b(var4, var43, var46)) ? 1 : 0);
               if (var3 == 0) {
                  if (var10000 == 0) {
                     Double var48 = this.a(var2, var19, var21, var23, var25, var26, var27, var11);
                     if (var3 == 0 && var48 != null) {
                        Vec3 var64 = var2.add(var13 * var48, var15 * var48, var17 * var48);
                        short var70 = 12090;
                        short var75 = 25836;
                        Intrinsics.checkNotNullExpressionValue(var64, "add(...)");
                        return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                           var64,
                           llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                           var43.immutable(),
                           null,
                           8,
                           null
                        );
                     }
                  }

                  double var87;
                  var10000 = (var87 = var37 - var39) == 0.0 ? 0 : (var87 < 0.0 ? -1 : 1);
               }

               label206: {
                  label157:
                  if (var3 == 0) {
                     if (var10000 <= 0) {
                        double var88;
                        var10000 = (var88 = var37 - var41) == 0.0 ? 0 : (var88 < 0.0 ? -1 : 1);
                        if (var3 != 0) {
                           break label157;
                        }

                        if (var10000 <= 0) {
                           double var89;
                           var10000 = (var89 = var37 - var11) == 0.0 ? 0 : (var89 < 0.0 ? -1 : 1);
                           if (var3 == 0) {
                              if (var10000 > 0) {
                                 Vec3 var61 = Vec3.ZERO;
                                 short var10004 = 12073;
                                 byte var10005 = 43;
                                 Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
                                 return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                                    var61,
                                    llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                                    null,
                                    null,
                                    12,
                                    null
                                 );
                              }

                              var37 += var31;
                              var10000 = var25 + var28;
                           }

                           var25 = var10000;
                           if (var3 == 0) {
                              break label206;
                           }
                        }
                     }

                     double var90;
                     var10000 = (var90 = var39 - var41) == 0.0 ? 0 : (var90 < 0.0 ? -1 : 1);
                  }

                  if (var3 == 0) {
                     if (var10000 <= 0) {
                        double var91;
                        var10000 = (var91 = var39 - var11) == 0.0 ? 0 : (var91 < 0.0 ? -1 : 1);
                        if (var3 == 0) {
                           if (var10000 > 0) {
                              Vec3 var63 = Vec3.ZERO;
                              short var69 = 12073;
                              byte var74 = 43;
                              Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
                              return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                                 var63,
                                 llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                                 null,
                                 null,
                                 12,
                                 null
                              );
                           }

                           var39 += var33;
                           var10000 = var26 + var29;
                        }

                        var26 = var10000;
                        if (var3 == 0) {
                           break label206;
                        }
                     }

                     double var92;
                     var10000 = (var92 = var41 - var11) == 0.0 ? 0 : (var92 < 0.0 ? -1 : 1);
                  }

                  if (var3 == 0) {
                     if (var10000 > 0) {
                        Vec3 var62 = Vec3.ZERO;
                        short var68 = 12073;
                        byte var73 = 43;
                        Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
                        return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                           var62,
                           llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                           null,
                           null,
                           12,
                           null
                        );
                     }

                     var41 += var35;
                     var10000 = var27 + var30;
                  }

                  var27 = var10000;
               }

               var45++;
               if (var3 != 0) {
                  break;
               }
            }

            Vec3 var65 = Vec3.ZERO;
            short var71 = 12073;
            byte var76 = 43;
            Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
            return new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
               var65,
               llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               null,
               null,
               12,
               null
            );
         }
      }

      return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
   }

   @NotNull
   public final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid a(
      @NotNull BlockPos var1, @NotNull Vec3 var2
   ) {
      int var10000 = d();
      short var10002 = 12074;
      short var10003 = -14422;
      Intrinsics.checkNotNullParameter(var1, "to");
      int var3 = var10000;
      short var10001 = 12067;
      var10002 = 6755;
      Intrinsics.checkNotNullParameter(var2, "from");

      label26:
      for (Vec3 var5 : this.a(new AABB(var1), var2)) {
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var6 = this.a(
            var5, var2
         );
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var7 = var6;

         do {
            if (var3 == 0) {
               if (var7.b()
                  != llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                {
                  continue label26;
               }

               var7 = var6;
            }

            if (!Intrinsics.areEqual(var7.c(), var1)) {
               continue label26;
            }

            var7 = var6;
         } while (var3 != 0);

         return var6;
      }

      return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
   }

   @NotNull
   public final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid a(
      @NotNull BlockPos var1, @NotNull List<? extends Class<? extends Entity>> var2, @NotNull Vec3 var3
   ) {
      int var10000 = d();
      short var10002 = 12074;
      short var10003 = -14422;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10002 = 12078;
      var10003 = -14915;
      Intrinsics.checkNotNullParameter(var2, "entityClasses");
      int var4 = var10000;
      short var10001 = 12067;
      var10002 = 6755;
      Intrinsics.checkNotNullParameter(var3, "from");
      if (var4 == 0) {
         ClientLevel var11 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .level;
         if (var11 != null) {
            ClientLevel var5 = var11;
            AABB var6 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .f(var1);
            llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var7 = this.a(
               var5, this.a(var3, var6), var2
            );

            label30:
            for (Vec3 var9 : this.a(var6, var3)) {
               llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var10 = this.a(
                  var5, var3, var9, var7
               );
               llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var12 = var10;

               do {
                  if (var4 == 0) {
                     if (var12.b()
                        != llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        )
                      {
                        continue label30;
                     }

                     var12 = var10;
                  }

                  if (!Intrinsics.areEqual(var12.c(), var1)) {
                     continue label30;
                  }

                  var12 = var10;
               } while (var4 != 0);

               return var10;
            }

            return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
         }
      }

      return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
   }

   private final double a(double var1, int var3, int var4, double var5) {
      int var7 = d();
      int var10000 = var4;
      if (var7 == 0) {
         if (var4 > 0) {
            return (var3 + 1 - var1) * var5;
         }

         var10000 = var4;
      }

      if (var7 == 0) {
         if (var10000 >= 0) {
            return Double.MAX_VALUE;
         }

         var10000 = var3;
      }

      return (var10000 - var1) * var5;
   }

   private final Double a(Vec3 var1, double var2, double var4, double var6, AABB var8, double var9) {
      double var31 = 0; // PX-FIX
      double var12 = (var8.minX - var1.x) * var2;
      double var14 = (var8.maxX - var1.x) * var2;
      int var10000 = c();
      double var16 = (var8.minY - var1.y) * var4;
      int var11 = var10000;
      double var18 = (var8.maxY - var1.y) * var4;
      double var20 = (var8.minZ - var1.z) * var6;
      double var22 = (var8.maxZ - var1.z) * var6;
      double var24 = Math.max(Math.min(var12, var14), Math.max(Math.min(var16, var18), Math.min(var20, var22)));
      double var26 = Math.min(Math.max(var12, var14), Math.min(Math.max(var16, var18), Math.max(var20, var22)));
      double var33;
      var10000 = (var33 = var26 - 0.0) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
      if (var11 != 0) {
         if (var10000 < 0) {
            return null;
         }

         double var34;
         var10000 = (var34 = var24 - var26) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
      }

      label50: {
         if (var11 != 0) {
            if (var10000 > 0) {
               return null;
            }

            var31 = var24;
            if (var11 == 0) {
               break label50;
            }

            double var35;
            var10000 = (var35 = var24 - 0.0) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
         }

         var31 = var10000 < 0 ? var26 : var24;
      }

      double var28 = var31;
      double var36;
      var10000 = (var36 = 0.0 - var28) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
      if (var11 != 0) {
         if (var10000 > 0) {
            return 0 != 0 ? var28 : null;
         }

         double var37;
         var10000 = (var37 = var28 - var9) == 0.0 ? 0 : (var37 < 0.0 ? -1 : 1);
      }

      if (var11 != 0) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return var10000 != 0 ? var28 : null;
   }

   private final Double a(Vec3 var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11) {
      double var33 = 0; // PX-FIX
      double var14 = (var8 - var1.x) * var2;
      double var16 = (var8 + 1 - var1.x) * var2;
      double var18 = (var9 - var1.y) * var4;
      double var20 = (var9 + 1 - var1.y) * var4;
      double var22 = (var10 - var1.z) * var6;
      double var24 = (var10 + 1 - var1.z) * var6;
      double var26 = Math.max(Math.min(var14, var16), Math.max(Math.min(var18, var20), Math.min(var22, var24)));
      int var10000 = d();
      double var28 = Math.min(Math.max(var14, var16), Math.min(Math.max(var18, var20), Math.max(var22, var24)));
      int var13 = var10000;
      double var35;
      var10000 = (var35 = var28 - 0.0) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
      if (var13 == 0) {
         if (var10000 < 0) {
            return null;
         }

         double var36;
         var10000 = (var36 = var26 - var28) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
      }

      label50: {
         if (var13 == 0) {
            if (var10000 > 0) {
               return null;
            }

            var33 = var26;
            if (var13 != 0) {
               break label50;
            }

            double var37;
            var10000 = (var37 = var26 - 0.0) == 0.0 ? 0 : (var37 < 0.0 ? -1 : 1);
         }

         var33 = var10000 < 0 ? var28 : var26;
      }

      double var30 = var33;
      double var38;
      var10000 = (var38 = 0.0 - var30) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
      if (var13 == 0) {
         if (var10000 > 0) {
            return 0 != 0 ? var30 : null;
         }

         double var39;
         var10000 = (var39 = var30 - var11) == 0.0 ? 0 : (var39 < 0.0 ? -1 : 1);
      }

      if (var13 == 0) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return var10000 != 0 ? var30 : null;
   }

   private final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] a(
      ClientLevel var1, AABB var2, List<? extends Class<? extends Entity>> var3
   ) {
      ArrayList var20 = null; // PX-FIX
      Object var17 = null; // PX-FIX
      int var4 = d();
      if (var3.isEmpty()) {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      } else {
         LocalPlayer var10000 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .player;
         int var5 = var10000 != null ? var10000.getId() : -1;
         ArrayList var6 = new ArrayList();
         Iterator var7 = var1.entitiesForRendering().iterator();

         label79:
         while (true) {
            int var15 = ((var7.hasNext()) ? 1 : 0);

            label84: {
               while (true) {
                  if (var15 != 0) {
                     Object var16 = var7.next();
                     short var10002 = 12091;
                     short var10003 = 27231;
                     Intrinsics.checkNotNullExpressionValue(var16, "next(...)");
                     Entity var8 = (Entity)var16;
                     var17 = var8.getId();
                     if (var4 != 0) {
                        break;
                     }

                     if (var4 == 0) {
                        if ((Boolean)var17 == ((var5 == 0))) {
                           continue label79;
                        }

                        var17 = 0;
                     }

                     int var9 =((Integer)( var17));

                     label70:
                     for (Class var11 : var3) {
                        while (var11.isInstance(var8)) {
                           var9 = 1;
                           if (var4 == 0) {
                              break label70;
                           }
                        }
                     }

                     var15 = var9;
                     if (var4 != 0) {
                        continue;
                     }

                     if (var9 == 0) {
                        continue label79;
                     }

                     var16 = var8.getBoundingBox();
                     var10002 = 12092;
                     var10003 = 5576;
                     Intrinsics.checkNotNullExpressionValue(var16, "getBoundingBox(...)");
                     AABB var14 = (AABB)var16;
                     boolean var19 = var14.intersects(var2);
                     if (var4 == 0) {
                        if (!var19) {
                           continue label79;
                        }

                        var6.add(
                           new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                              var8, var14
                           )
                        );
                     }

                     if (var4 == 0) {
                        continue label79;
                     }
                  }

                  var20 = var6;
                  if (var4 != 0) {
                     break label84;
                  }

                  var17 = var6.isEmpty();
                  break;
               }

               if (!((Boolean)var17)) {
                  var21 = ((me.octo.client.PXDyn)(Object)(Object)(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI));
                  break;
               }

               var20 = var6;
            }

            Object var12 = var20;
            boolean var13 = false;
            var21 = ((me.octo.client.PXDyn)var12).toArray(
               new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[0]
            );
            break;
         }

         return ((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])(Object)(var21));
      }
   }

   private final AABB a(Vec3 var1, AABB var2) {
      return new AABB(
         Math.min(var1.x, var2.minX),
         Math.min(var1.y, var2.minY),
         Math.min(var1.z, var2.minZ),
         Math.max(var1.x, var2.maxX),
         Math.max(var1.y, var2.maxY),
         Math.max(var1.z, var2.maxZ)
      );
   }

   @NotNull
   public final BlockHitResult a(float var1, float var2, double var3, boolean var5, float var6) {
      LocalPlayer var10003 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a()
         .player;
      Intrinsics.checkNotNull(var10003);
      Vec3 var7 = var10003.getEyePosition(var6);
      short var10005 = 12077;
      short var10006 = -25098;
      Intrinsics.checkNotNullExpressionValue(var7, "getEyePosition(...)");
      Vec3 var10004 = Vec3.directionFromRotation(var2, var1);
      var10006 = 12079;
      short var10007 = 18109;
      Intrinsics.checkNotNullExpressionValue(var10004, "directionFromRotation(...)");
      return a(this, var3, var5, var7, var10004, null, 16, null);
   }

   private final BlockHitResult a(double var1, boolean var3, Vec3 var4, Vec3 var5, Entity var6) {
      Vec3 var10000 = var4.add(var5.x * var1, var5.y * var1, var5.z * var1);
      short var10002 = 12090;
      short var10003 = 25836;
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      Vec3 var7 = var10000;
      ClientLevel var8 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a()
         .level;
      Intrinsics.checkNotNull(var8);
      BlockHitResult var9 = var8.clip(new ClipContext(var4, var7, Block.OUTLINE, var3 ? Fluid.ANY : Fluid.NONE, var6));
      var10002 = 12070;
      var10003 = -18490;
      Intrinsics.checkNotNullExpressionValue(var9, "clip(...)");
      return var9;
   }

   @NotNull
   public final List<Vec3> a(@NotNull AABB var1, double var2, double var4, @NotNull Vec3 var6, double var7) {
      double var44 = 0; // PX-FIX
      double var42 = 0; // PX-FIX
      int var10000 = c();
      short var10002 = 12089;
      short var10003 = -1073;
      Intrinsics.checkNotNullParameter(var1, "box");
      var10002 = 12067;
      var10003 = 6755;
      Intrinsics.checkNotNullParameter(var6, "from");
      double var10 = var1.minX + var2;
      double var12 = var1.minY + var2;
      double var14 = var1.minZ + var2;
      int var9 = var10000;
      double var16 = var1.maxX - var2;
      double var18 = var1.minY + Math.min(var1.maxY - var1.minY, var7) - var2;
      double var20 = var1.maxZ - var2;
      Vec3 var37 = var1.getCenter();
      var10002 = 12076;
      var10003 = -30783;
      Intrinsics.checkNotNullExpressionValue(var37, "getCenter(...)");
      Vec3 var22 = var37;
      double var51;
      var10000 = (var51 = var6.x - var22.x) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
      if (var9 != 0) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var23 = var10000;
      double var52;
      var10000 = (var52 = var6.y - var22.y) == 0.0 ? 0 : (var52 < 0.0 ? -1 : 1);
      if (var9 != 0) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var24 = var10000;
      double var53;
      var10000 = (var53 = var6.z - var22.z) == 0.0 ? 0 : (var53 < 0.0 ? -1 : 1);
      if (var9 != 0) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var25 = var10000;
      ArrayList var26 = new ArrayList();
      double var27 = var10;

      label145:
      while (true) {
         double var54;
         var10000 = (var54 = var16 - var27 - 1.0E-4) == 0.0 ? 0 : (var54 < 0.0 ? -1 : 1);

         label142:
         while (var10000 >= 0) {
            var42 = var12;
            if (var9 == 0) {
               break label145;
            }

            double var29 = var12;

            while (var18 - var29 >= 1.0E-4) {
               var10000 = var25;
               if (var9 == 0) {
                  continue label142;
               }

               if (var9 != 0) {
                  if (var25 != 0) {
                     var26.add(new Vec3(var27, var29, var1.minZ + var4));
                  } else {
                     var26.add(new Vec3(var27, var29, var1.maxZ - var4));
                  }
               }

               var29 += var2;
               if (var9 == 0) {
                  break;
               }
            }

            var27 += var2;
            if (var9 != 0) {
               continue label145;
            }
            break;
         }

         var42 = var14;
         break;
      }

      double var35 = var42;

      label122:
      while (true) {
         double var55;
         var10000 = (var55 = var20 - var35 - 1.0E-4) == 0.0 ? 0 : (var55 < 0.0 ? -1 : 1);

         label119:
         while (var10000 >= 0) {
            var44 = var12;
            if (var9 == 0) {
               break label122;
            }

            double var31 = var12;

            while (var18 - var31 >= 1.0E-4) {
               var10000 = var23;
               if (var9 == 0) {
                  continue label119;
               }

               if (var9 != 0) {
                  if (var23 != 0) {
                     var26.add(new Vec3(var1.minX + var4, var31, var35));
                  } else {
                     var26.add(new Vec3(var1.maxX - var4, var31, var35));
                  }
               }

               var31 += var2;
               if (var9 == 0) {
                  break;
               }
            }

            var35 += var2;
            if (var9 != 0) {
               continue label122;
            }
            break;
         }

         var44 = var14;
         break;
      }

      var35 = var44;

      label99:
      while (true) {
         double var56;
         var10000 = (var56 = var20 - var35 - 1.0E-4) == 0.0 ? 0 : (var56 < 0.0 ? -1 : 1);

         label97:
         while (true) {
            if (var10000 < 0) {
               break label99;
            }

            var27 = var10;

            while (var16 - var27 >= 1.0E-4) {
               var10000 = var24;
               if (var9 == 0) {
                  continue label97;
               }

               if (var9 != 0) {
                  if (var24 != 0) {
                     var26.add(new Vec3(var27, var1.minY + var4, var35));
                  } else {
                     var26.add(new Vec3(var27, var1.maxY - var4, var35));
                  }
               }

               var27 += var2;
               if (var9 == 0) {
                  break;
               }
            }

            var35 += var2;
            if (var9 == 0) {
               break label99;
            }
            break;
         }
      }

      List var46 = CollectionsKt.toList(var26);
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(++var9);
      }

      return var46;
   }

   @NotNull
   public final List<Vec3> b(@NotNull BlockPos var1, @NotNull Vec3 var2) {
      int var10000 = c();
      short var10002 = 12068;
      short var10003 = 6369;
      Intrinsics.checkNotNullParameter(var1, "to");
      int var3 = var10000;
      short var10001 = 12066;
      var10002 = -5345;
      Intrinsics.checkNotNullParameter(var2, "from");
      ArrayList var4 = new ArrayList();

      for (Vec3 var6 : this.a(new AABB(var1), var2)) {
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var7 = this.a(
            var6, var2
         );
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var8 = var7;
         if (var3 != 0) {
            if (var7.b()
               != llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
             {
               continue;
            }

            var8 = var7;
         }

         boolean var9 = Intrinsics.areEqual(var8.c(), var1);
         if (var3 != 0) {
            if (!var9) {
               continue;
            }

            var4.add(var6);
         }

         if (var3 == 0) {
            break;
         }
      }

      return var4;
   }

   public final boolean a(@NotNull BlockPos var1, double var2, @NotNull List<? extends Class<? extends Entity>> var4, @NotNull Vec3 var5) {
      Object var18 = null; // PX-FIX
      int var6;
      Object var14;
      int var10000 = c();
      short var10002 = 12080;
      short var10003 = -28670;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10002 = 12078;
      var10003 = -14915;
      Intrinsics.checkNotNullParameter(var4, "entityClasses");
      var10002 = 12067;
      var10003 = 6755;
      Intrinsics.checkNotNullParameter(var5, "from");
      var var7 = this.a(new AABB(var1), var5);
      boolean var8 = false;
      var6 = var10000;
      var14 = var7;
      label55:
      if (var6 != 0) {
         if (var7 instanceof Collection) {
            var14 = (Collection)var7;
            if (var6 == 0) {
               break label55;
            }

            if (((me.octo.client.PXDyn)var14).isEmpty()) {
               return false;
            }
         }

         var14 = var7;
      }

      label46:
      for (Object var10 : (Iterable<?>)(var14)) {
         Vec3 var11 = (Vec3)var10;
         boolean var16 = false;

         do {
            label42: {
               label61: {
                  llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var13 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                     var11, var2, var4, var5
                  );
                  var14 = var13;
                  if (var6 != 0) {
                     if (var13.b()
                        != llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        )
                      {
                        break label61;
                     }

                     var14 = var13;
                  }

                  var18 = Intrinsics.areEqual(
                     ((llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid)var14).c(),
                     var1
                  );
                  if (var6 == 0) {
                     break label42;
                  }

                  if (((Boolean)(var18))) {
                     var18 = true;
                     break label42;
                  }
               }

               var18 = false;
            }

            if (!((Boolean)var18)) {
               continue label46;
            }
         } while (var6 == 0);

         return true;
      }

      return false;
   }

   public final boolean b(@NotNull BlockPos var1, @NotNull List<? extends Class<? extends Entity>> var2, @NotNull Vec3 var3) {
      Object var16 = null; // PX-FIX
      short var10001 = 12065;
      short var10002 = 5503;
      Intrinsics.checkNotNullParameter(var1, "pos");
      int var10000 = c();
      var10002 = 12078;
      short var10003 = -14915;
      Intrinsics.checkNotNullParameter(var2, "entityClasses");
      var10002 = 12067;
      var10003 = 6755;
      Intrinsics.checkNotNullParameter(var3, "from");
      int var4 = var10000;
      if (var4 != 0) {
         ClientLevel var15 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .level;
         if (var15 != null) {
            ClientLevel var5;
            llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var7;
            var5 = var15;
            AABB var6 = new AABB(var1);
            var7 = this.a(var5, this.a(var3, var6), var2);
            var var8 = this.a(var6, var3);
            boolean var9 = false;
            var16 = var8;
            label59:
            if (var4 != 0) {
               if (var8 instanceof Collection) {
                  var16 = (Collection)var8;
                  if (var4 == 0) {
                     break label59;
                  }

                  if (((me.octo.client.PXDyn)var16).isEmpty()) {
                     return false;
                  }
               }

               var16 = var8;
            }

            label50:
            for (Object var11 : (Iterable<?>)(var16)) {
               Vec3 var12 = (Vec3)var11;
               boolean var18 = false;

               do {
                  label46: {
                     label69: {
                        llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var14 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                           var5, var3, var12, var7
                        );
                        llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var19 = var14;
                        if (var4 != 0) {
                           if (var14.b()
                              != llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              )
                            {
                              break label69;
                           }

                           var19 = var14;
                        }

                        var18 = Intrinsics.areEqual(var19.c(), var1);
                        if (var4 == 0) {
                           break label46;
                        }

                        if (((Boolean)(var18))) {
                           var18 = true;
                           break label46;
                        }
                     }

                     var18 = false;
                  }

                  if (!var18) {
                     continue label50;
                  }
               } while (var4 == 0);

               return true;
            }

            return false;
         }
      }

      return false;
   }

   @NotNull
   public final List<Vec3> a(
      @NotNull Object var1, @NotNull List<? extends Class<? extends Entity>> var2, @NotNull Vec3 var3, double var4, double var6, double var8
   ) { ClientLevel var21 = null; // PX-FIX hoist
        
      llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var29 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      Object var23 = null; // PX-FIX
      short var10001 = 12093;
      short var10002 = -12499;
      Intrinsics.checkNotNullParameter(var1, "target");
      int var10000 = d();
      var10002 = 12078;
      short var10003 = -14915;
      Intrinsics.checkNotNullParameter(var2, "entityClasses");
      int var10 = var10000;
      var10001 = 12067;
      var10002 = 6755;
      Intrinsics.checkNotNullParameter(var3, "from");
      if (var10 == 0) {
          var21 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .level;
         if (var21 != null) {
            ClientLevel var11;
            BlockPos var12;
            Entity var13;
            label112: {
               var11 = var21;
               var12 = null;
               var13 = null;
               boolean var22 = var1 instanceof Entity;
               if (var10 == 0) {
                  if (var22) {
                     var13 = (Entity)var1;
                     var24 = ((Entity)var1).getBoundingBox();
                     break label112;
                  }

                  var22 = var1 instanceof BlockPos;
               }

               label113: {
                  if (var10 == 0) {
                     if (var22) {
                        var12 = (BlockPos)var1;
                        var24 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .f((BlockPos)var1);
                        break label112;
                     }

                     var23 = var1;
                     if (var10 != 0) {
                        break label113;
                     }

                     var22 = var1 instanceof AABB;
                  }

                  if (!var22) {
                     var24 = null;
                     break label112;
                  }

                  var23 = var1;
               }

               var24 = (AABB)var23;
            }

            if (var24 == null) {
               return CollectionsKt.emptyList();
            }

            AABB var14 =((AABB)( var24));
            List var15 = this.a(var14, var4, var6, var3, var8);
            llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var16 = this.a(
               var11, this.a(var3, var14), var2
            );
            ArrayList var17 = new ArrayList();

            for (Vec3 var19 : (List<Vec3>)var15) {
               label84: {
                  label116: {
                     llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var20 = this.a(
                        var11, var3, var19, var16
                     );
                     llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var25 = var20.b();
                     llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var33 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                     if (var10 == 0) {
                        if (var25
                           == llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           )
                         {
                           boolean var26 = Intrinsics.areEqual(var20.c(), var12);
                           if (var10 != 0) {
                              break label84;
                           }

                           if (var26) {
                              break label116;
                           }
                        }

                        var25 = var20.b();
                        var33 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                     }

                     label117: {
                        if (var10 == 0) {
                           if (var25 == var33) {
                              lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var27 = lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              Vec3 var34 = var14.getCenter();
                              var10003 = 12076;
                              short var10004 = -30783;
                              Intrinsics.checkNotNullExpressionValue(var34, "getCenter(...)");
                              boolean var28 = Intrinsics.areEqual(var27.f(var34), var20.c());
                              if (var10 != 0) {
                                 break label84;
                              }

                              if (var28) {
                                 break label116;
                              }
                           }

                           var29 = var20;
                           if (var10 != 0) {
                              break label117;
                           }

                           var25 = var20.b();
                           var33 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        }

                        if (var25 != var33) {
                           continue;
                        }

                        var29 = var20;
                     }

                     Entity var30 = var29.d();
                     boolean var31 = Intrinsics.areEqual(var30 != null ? var30.getId() : null, var13 != null ? var13.getId() : null);
                     if (var10 != 0) {
                        break label84;
                     }

                     if (!var31) {
                        continue;
                     }
                  }

                  var17.add(var19);
               }

               if (var10 != 0) {
                  break;
               }
            }

            return CollectionsKt.toList(var17);
         }
      }

      return CollectionsKt.emptyList();
   }

   @NotNull
   public final List<Vec3> a(@NotNull AABB var1, @NotNull Vec3 var2) {
      short var10001 = 12064;
      short var10002 = 32377;
      Intrinsics.checkNotNullParameter(var1, "box");
      var10001 = 12067;
      var10002 = 6755;
      Intrinsics.checkNotNullParameter(var2, "from");
      int var10000 = c();
      ArrayList var4 = new ArrayList();
      Vec3 var15 = var1.getCenter();
      short var10003 = 12072;
      short var10004 = 9189;
      Intrinsics.checkNotNullExpressionValue(var15, "getCenter(...)");
      Vec3 var5 = var15;
      int var3 = var10000;
      Vec3 var6 = new Vec3(var1.minX, var1.minY, var1.minZ);
      double var21;
      var10000 = (var21 = var2.x - var5.x) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var7 = var10000;
      double var22;
      var10000 = (var22 = var2.y - var5.y) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var8 = var10000;
      double var23;
      var10000 = (var23 = var2.z - var5.z) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      int var9 = var10000;
      ArrayList var13 = var4;
      Vec3 var16 = var6;
      double var18 = var7 != 0 ? 0.01 : 0.99;
      double var19 = 0.5;
      if (var3 != 0) {
         var4.add(var6.add(var18, 0.5, 0.5));
         var13 = var4;
         var16 = var6;
         var18 = 0.5;
         var19 = var8 != 0 ? 0.01 : 0.99;
      }

      double var20 = 0.5;
      if (var3 != 0) {
         var13.add(var16.add(var18, var19, 0.5));
         var13 = var4;
         var16 = var6;
         var18 = 0.5;
         var19 = 0.5;
         var20 = var9 != 0 ? 0.01 : 0.99;
      }

      var13.add(var16.add(var18, var19, var20));
      return CollectionsKt.toList(var4);
   }

   @NotNull
   public final ArrayList<BlockPos> b(@NotNull Vec3 var1, @NotNull Vec3 var2) {
      int var10000 = c();
      short var10002 = 12067;
      short var10003 = 6755;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10002 = 12074;
      var10003 = -14422;
      Intrinsics.checkNotNullParameter(var2, "to");
      int var3 = var10000;
      ArrayList var4 = new ArrayList();
      int var5 = (int)Math.floor(var1.x);
      int var6 = (int)Math.floor(var1.y);
      int var7 = (int)Math.floor(var1.z);
      double var8 = var2.x - var1.x;
      double var10 = var2.y - var1.y;
      double var12 = var2.z - var1.z;
      double var14 = Math.sqrt(var8 * var8 + var10 * var10 + var12 * var12);
      double var45 = var14;
      double var10001 = 1.0E-7;
      if (var3 != 0) {
         if (var14 < 1.0E-7) {
            var4.add(new BlockPos(var5, var6, var7));
            return var4;
         }

         var45 = var8;
         var10001 = var14;
      }

      double var16 = var45 / var10001;
      double var18 = var10 / var14;
      double var20 = var12 / var14;
      double var57;
      var10000 = (var57 = var16 - 0.0) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      double var22 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var16 : 1.0E30));
      double var58;
      var10000 = (var58 = var18 - 0.0) == 0.0 ? 0 : (var58 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      double var24 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var18 : 1.0E30));
      double var59;
      var10000 = (var59 = var20 - 0.0) == 0.0 ? 0 : (var59 < 0.0 ? -1 : 1);
      if (var3 != 0) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      double var26;
      label165: {
         var26 = ((((var10000 != 0 ? 1 : 0)!= 0) ? 1.0 / var20 : 1.0E30));
         double var60;
         var10000 = (var60 = var16 - 0.0) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1);
         if (var3 != 0) {
            if (var10000 > 0) {
               var10000 = 1;
               break label165;
            }

            double var61;
            var10000 = (var61 = var16 - 0.0) == 0.0 ? 0 : (var61 < 0.0 ? -1 : 1);
         }

         if (var3 != 0) {
            var10000 = var10000 < 0 ? -1 : 0;
         }
      }

      int var28;
      label159: {
         var28 = var10000;
         double var62;
         var10000 = (var62 = var18 - 0.0) == 0.0 ? 0 : (var62 < 0.0 ? -1 : 1);
         if (var3 != 0) {
            if (var10000 > 0) {
               var10000 = 1;
               break label159;
            }

            double var63;
            var10000 = (var63 = var18 - 0.0) == 0.0 ? 0 : (var63 < 0.0 ? -1 : 1);
         }

         if (var3 != 0) {
            var10000 = var10000 < 0 ? -1 : 0;
         }
      }

      int var29;
      label153: {
         var29 = var10000;
         double var64;
         var10000 = (var64 = var20 - 0.0) == 0.0 ? 0 : (var64 < 0.0 ? -1 : 1);
         if (var3 != 0) {
            if (var10000 > 0) {
               var10000 = 1;
               break label153;
            }

            double var65;
            var10000 = (var65 = var20 - 0.0) == 0.0 ? 0 : (var65 < 0.0 ? -1 : 1);
         }

         if (var3 != 0) {
            var10000 = var10000 < 0 ? -1 : 0;
         }
      }

      int var30 = var10000;
      double var31 = var28 != 0 ? Math.abs(var22) : Double.MAX_VALUE;
      double var33 = var29 != 0 ? Math.abs(var24) : Double.MAX_VALUE;
      double var35 = var30 != 0 ? Math.abs(var26) : Double.MAX_VALUE;
      double var37 = this.a(var1.x, var5, var28, var22);
      double var39 = this.a(var1.y, var6, var29, var24);
      double var41 = this.a(var1.z, var7, var30, var26);
      int var43 = (int)(var14 * 3 + 3);
      int var44 = 0;
      var4.add(new BlockPos(var5, var6, var7));

      while (var44 < var43) {
         label179: {
            double var66;
            var10000 = (var66 = var37 - var39) == 0.0 ? 0 : (var66 < 0.0 ? -1 : 1);
            label142:
            if (var3 != 0) {
               if (var10000 <= 0) {
                  double var67;
                  var10000 = (var67 = var37 - var41) == 0.0 ? 0 : (var67 < 0.0 ? -1 : 1);
                  if (var3 == 0) {
                     break label142;
                  }

                  if (var10000 <= 0) {
                     double var68;
                     var10000 = (var68 = var37 - var14) == 0.0 ? 0 : (var68 < 0.0 ? -1 : 1);
                     if (var3 != 0) {
                        if (var10000 > 0) {
                           break;
                        }

                        var37 += var31;
                        var10000 = var5 + var28;
                     }

                     var5 = var10000;
                     if (var3 != 0) {
                        break label179;
                     }
                  }
               }

               double var69;
               var10000 = (var69 = var39 - var41) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
            }

            if (var3 != 0) {
               if (var10000 <= 0) {
                  double var70;
                  var10000 = (var70 = var39 - var14) == 0.0 ? 0 : (var70 < 0.0 ? -1 : 1);
                  if (var3 != 0) {
                     if (var10000 > 0) {
                        break;
                     }

                     var39 += var33;
                     var10000 = var6 + var29;
                  }

                  var6 = var10000;
                  if (var3 != 0) {
                     break label179;
                  }
               }

               double var71;
               var10000 = (var71 = var41 - var14) == 0.0 ? 0 : (var71 < 0.0 ? -1 : 1);
            }

            if (var3 != 0) {
               if (var10000 > 0) {
                  break;
               }

               var41 += var35;
               var10000 = var7 + var30;
            }

            var7 = var10000;
         }

         var4.add(new BlockPos(var5, var6, var7));
         var44++;
         if (var3 == 0) {
            break;
         }
      }

      return var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[28];
      int var3 = 0;
      b(104);
      String var2 = "¤,¥8\n\u007f\u0087Aü\u0007ºÂ¯á\u0004Í©4 \u0002}I\u0012_5Ú\u001aì\u001bdâTàå³©ßº|\\z\u000e\u0082\u0086am\u0092Õ\u0094\u0014\u009e\u00adö\u0097&K\u0013W²ÛíÙ\bFÏeÜò\u0097ö£\u001c}N]*\rô»í\u008a\u0012Q\u0080xÞSÒ3\t\u001ag\u00ad¸£iô0c¨fó\f\u0012*\u0085\u00ad\u009d\f¶)\u0087çù1ÍÅ\u0003l(\u0015\u0003Ç\";\u0004½Ñ¼\\\u0004\u0003âk:\u00027\u0099\u0012*\u0084t,9ÝÞ:\u0003û\u000fÐô³\u0011ñ)Ë\tæ\u0092tôÃó\u0000ÓF\rT#ù\u0099\u00903Ð4ÔÚ\u0093\u0002!\u0004\r#,ñ\u0003Ì±\u0001\b7æ\u0001+Ç[FÁ\t^.ÞO¥\u0000Ì\u00adß\u0013âÿmC\u0019*´\u0092Ø\u001a\u000f\u00838yÅòu¬M\u0006*\u0011\u0003?\u0018%\u0005|Xíê!\b\u009a\u001e´4q¸\u0090½\u0003A ë\fµ¥Ã`R\u001el\u00ad:xµì";
      int var4 = "¤,¥8\n\u007f\u0087Aü\u0007ºÂ¯á\u0004Í©4 \u0002}I\u0012_5Ú\u001aì\u001bdâTàå³©ßº|\\z\u000e\u0082\u0086am\u0092Õ\u0094\u0014\u009e\u00adö\u0097&K\u0013W²ÛíÙ\bFÏeÜò\u0097ö£\u001c}N]*\rô»í\u008a\u0012Q\u0080xÞSÒ3\t\u001ag\u00ad¸£iô0c¨fó\f\u0012*\u0085\u00ad\u009d\f¶)\u0087çù1ÍÅ\u0003l(\u0015\u0003Ç\";\u0004½Ñ¼\\\u0004\u0003âk:\u00027\u0099\u0012*\u0084t,9ÝÞ:\u0003û\u000fÐô³\u0011ñ)Ë\tæ\u0092tôÃó\u0000ÓF\rT#ù\u0099\u00903Ð4ÔÚ\u0093\u0002!\u0004\r#,ñ\u0003Ì±\u0001\b7æ\u0001+Ç[FÁ\t^.ÞO¥\u0000Ì\u00adß\u0013âÿmC\u0019*´\u0092Ø\u001a\u000f\u00838yÅòu¬M\u0006*\u0011\u0003?\u0018%\u0005|Xíê!\b\u009a\u001e´4q¸\u0090½\u0003A ë\fµ¥Ã`R\u001el\u00ad:xµì"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 99;
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
                     case 0 -> 69;
                     case 1 -> 9;
                     case 2 -> 105;
                     case 3 -> 25;
                     case 4 -> 3;
                     case 5 -> 17;
                     default -> 20;
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
                     b = new String[28];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new AABB[0];
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[0];
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Object();
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new Long2ObjectOpenHashMap();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Object();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Long2ByteOpenHashMap();
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

                  var2 = "\u0093\u0013;¨Ð\u000e[m_^¼qãöò&¥Íg+";
                  var4 = "\u0093\u0013;¨Ð\u000e[m_^¼qãöò&¥Íg+".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 32;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(int var0) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var0;
   }

   public static int c() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public static int d() {
      int var0 = c();
      return var0 == 0 ? 62 : 0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 12072) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 18;
            case 1 -> 223;
            case 2 -> 240;
            case 3 -> 145;
            case 4 -> 87;
            case 5 -> 199;
            case 6 -> 82;
            case 7 -> 22;
            case 8 -> 42;
            case 9 -> 203;
            case 10 -> 197;
            case 11 -> 101;
            case 12 -> 181;
            case 13 -> 178;
            case 14 -> 230;
            case 15 -> 191;
            case 16 -> 148;
            case 17 -> 124;
            case 18 -> 10;
            case 19 -> 99;
            case 20 -> 151;
            case 21 -> 128;
            case 22 -> 66;
            case 23 -> 193;
            case 24 -> 50;
            case 25 -> 163;
            case 26 -> 86;
            case 27 -> 213;
            case 28 -> 27;
            case 29 -> 116;
            case 30 -> 172;
            case 31 -> 75;
            case 32 -> 244;
            case 33 -> 54;
            case 34 -> 175;
            case 35 -> 218;
            case 36 -> 53;
            case 37 -> 32;
            case 38 -> 187;
            case 39 -> 225;
            case 40 -> 88;
            case 41 -> 113;
            case 42 -> 137;
            case 43 -> 200;
            case 44 -> 138;
            case 45 -> 15;
            case 46 -> 83;
            case 47 -> 139;
            case 48 -> 36;
            case 49 -> 216;
            case 50 -> 104;
            case 51 -> 120;
            case 52 -> 140;
            case 53 -> 176;
            case 54 -> 205;
            case 55 -> 241;
            case 56 -> 165;
            case 57 -> 89;
            case 58 -> 61;
            case 59 -> 228;
            case 60 -> 233;
            case 61 -> 21;
            case 62 -> 251;
            case 63 -> 33;
            case 64 -> 106;
            case 65 -> 152;
            case 66 -> 184;
            case 67 -> 110;
            case 68 -> 248;
            case 69 -> 136;
            case 70 -> 234;
            case 71 -> 146;
            case 72 -> 57;
            case 73 -> 253;
            case 74 -> 81;
            case 75 -> 245;
            case 76 -> 250;
            case 77 -> 212;
            case 78 -> 74;
            case 79 -> 5;
            case 80 -> 102;
            case 81 -> 115;
            case 82 -> 80;
            case 83 -> 13;
            case 84 -> 177;
            case 85 -> 215;
            case 86 -> 237;
            case 87 -> 164;
            case 88 -> 229;
            case 89 -> 160;
            case 90 -> 190;
            case 91 -> 123;
            case 92 -> 60;
            case 93 -> 92;
            case 94 -> 131;
            case 95 -> 209;
            case 96 -> 117;
            case 97 -> 45;
            case 98 -> 97;
            case 99 -> 202;
            case 100 -> 147;
            case 101 -> 20;
            case 102 -> 114;
            case 103 -> 235;
            case 104 -> 142;
            case 105 -> 155;
            case 106 -> 226;
            case 107 -> 129;
            case 108 -> 180;
            case 109 -> 255;
            case 110 -> 134;
            case 111 -> 133;
            case 112 -> 186;
            case 113 -> 224;
            case 114 -> 239;
            case 115 -> 246;
            case 116 -> 14;
            case 117 -> 26;
            case 118 -> 222;
            case 119 -> 196;
            case 120 -> 73;
            case 121 -> 220;
            case 122 -> 72;
            case 123 -> 121;
            case 124 -> 132;
            case 125 -> 48;
            case 126 -> 44;
            case 127 -> 243;
            case 128 -> 17;
            case 129 -> 107;
            case 130 -> 0;
            case 131 -> 157;
            case 132 -> 198;
            case 133 -> 204;
            case 134 -> 98;
            case 135 -> 249;
            case 136 -> 207;
            case 137 -> 38;
            case 138 -> 211;
            case 139 -> 153;
            case 140 -> 169;
            case 141 -> 46;
            case 142 -> 23;
            case 143 -> 236;
            case 144 -> 156;
            case 145 -> 192;
            case 146 -> 25;
            case 147 -> 39;
            case 148 -> 29;
            case 149 -> 183;
            case 150 -> 90;
            case 151 -> 47;
            case 152 -> 208;
            case 153 -> 70;
            case 154 -> 31;
            case 155 -> 34;
            case 156 -> 68;
            case 157 -> 8;
            case 158 -> 201;
            case 159 -> 232;
            case 160 -> 62;
            case 161 -> 76;
            case 162 -> 127;
            case 163 -> 67;
            case 164 -> 254;
            case 165 -> 194;
            case 166 -> 58;
            case 167 -> 43;
            case 168 -> 19;
            case 169 -> 112;
            case 170 -> 167;
            case 171 -> 126;
            case 172 -> 55;
            case 173 -> 119;
            case 174 -> 214;
            case 175 -> 24;
            case 176 -> 227;
            case 177 -> 28;
            case 178 -> 210;
            case 179 -> 143;
            case 180 -> 51;
            case 181 -> 231;
            case 182 -> 242;
            case 183 -> 52;
            case 184 -> 170;
            case 185 -> 252;
            case 186 -> 161;
            case 187 -> 100;
            case 188 -> 179;
            case 189 -> 118;
            case 190 -> 247;
            case 191 -> 154;
            case 192 -> 35;
            case 193 -> 63;
            case 194 -> 149;
            case 195 -> 96;
            case 196 -> 37;
            case 197 -> 162;
            case 198 -> 40;
            case 199 -> 105;
            case 200 -> 77;
            case 201 -> 7;
            case 202 -> 195;
            case 203 -> 9;
            case 204 -> 130;
            case 205 -> 109;
            case 206 -> 141;
            case 207 -> 189;
            case 208 -> 219;
            case 209 -> 95;
            case 210 -> 6;
            case 211 -> 111;
            case 212 -> 217;
            case 213 -> 135;
            case 214 -> 93;
            case 215 -> 188;
            case 216 -> 174;
            case 217 -> 2;
            case 218 -> 144;
            case 219 -> 221;
            case 220 -> 3;
            case 221 -> 150;
            case 222 -> 171;
            case 223 -> 94;
            case 224 -> 1;
            case 225 -> 238;
            case 226 -> 56;
            case 227 -> 206;
            case 228 -> 85;
            case 229 -> 166;
            case 230 -> 108;
            case 231 -> 84;
            case 232 -> 159;
            case 233 -> 64;
            case 234 -> 71;
            case 235 -> 122;
            case 236 -> 158;
            case 237 -> 173;
            case 238 -> 11;
            case 239 -> 65;
            case 240 -> 16;
            case 241 -> 49;
            case 242 -> 4;
            case 243 -> 185;
            case 244 -> 182;
            case 245 -> 69;
            case 246 -> 79;
            case 247 -> 78;
            case 248 -> 59;
            case 249 -> 103;
            case 250 -> 41;
            case 251 -> 30;
            case 252 -> 168;
            case 253 -> 125;
            case 254 -> 91;
            default -> 12;
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

   public static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      public static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] a() {
         return (llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         String var0
      ) {
         return Enum.valueOf(
            llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);

      // ==== L1-restored: Kotlin enum values-clone helper, body transcribed from jar bytecode (javap -p -c) ====
      private static final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] c() {
         return new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl };
      }
   }

   public static final class PXEvMid {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
           this(null, null, null, null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      @NotNull
      public static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final BlockPos lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private final Entity IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public PXEvMid(
         @NotNull Vec3 var1,
         @NotNull llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
         @Nullable BlockPos var3,
         @Nullable Entity var4
      ) {
         short var10001 = -11924;
         short var10002 = -7554;
         Intrinsics.checkNotNullParameter(var1, "hit");
         var10001 = -11921;
         var10002 = 23057;
         Intrinsics.checkNotNullParameter(var2, "type");
         super();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      }

      @NotNull
      public final Vec3 a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll b() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final BlockPos c() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final Entity d() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { short var21 = (short)0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "ò\u0085°\u0088\u0003Â\u0007ä\u0004Ür¼ç";
         int var4 = "ò\u0085°\u0088\u0003Â\u0007ä\u0004Ür¼ç".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var14 = 72;
               var10002 = var10003;
               int var8 = var10004;
               byte var17;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var17 = 72;
                  var10006 = var6;
               } else {
                  var14 = 72;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var17 = 72;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var17 ^ switch (var6 % 7) {
                     case 0 -> 21;
                     case 1 -> 125;
                     case 2 -> 78;
                     case 3 -> 116;
                     case 4 -> 35;
                     case 5 -> 82;
                     default -> 81;
                  });
                  var6++;
                  if (var14 == 0) {
                     var10006 = var14;
                     var10005 = var10002;
                     var17 = var14;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var17 = var14;
                     var10006 = var6;
                  }
               }
            }

            String var16 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var16;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[3];
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
               Vec3 var13 = Vec3.ZERO;
                var21 = -11923;
               short var25 = -24159;
               Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid(
                  var13,
                  llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  null,
                  null,
                  12,
                  null
               );
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -11923) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 133;
               case 1 -> 68;
               case 2 -> 147;
               case 3 -> 208;
               case 4 -> 18;
               case 5 -> 61;
               case 6 -> 15;
               case 7 -> 200;
               case 8 -> 248;
               case 9 -> 195;
               case 10 -> 127;
               case 11 -> 226;
               case 12 -> 223;
               case 13 -> 158;
               case 14 -> 75;
               case 15 -> 181;
               case 16 -> 99;
               case 17 -> 108;
               case 18 -> 163;
               case 19 -> 104;
               case 20 -> 14;
               case 21 -> 39;
               case 22 -> 125;
               case 23 -> 4;
               case 24 -> 243;
               case 25 -> 82;
               case 26 -> 48;
               case 27 -> 116;
               case 28 -> 21;
               case 29 -> 159;
               case 30 -> 148;
               case 31 -> 112;
               case 32 -> 194;
               case 33 -> 190;
               case 34 -> 197;
               case 35 -> 250;
               case 36 -> 192;
               case 37 -> 62;
               case 38 -> 238;
               case 39 -> 78;
               case 40 -> 91;
               case 41 -> 136;
               case 42 -> 12;
               case 43 -> 25;
               case 44 -> 215;
               case 45 -> 255;
               case 46 -> 141;
               case 47 -> 214;
               case 48 -> 217;
               case 49 -> 96;
               case 50 -> 244;
               case 51 -> 51;
               case 52 -> 98;
               case 53 -> 106;
               case 54 -> 30;
               case 55 -> 59;
               case 56 -> 55;
               case 57 -> 41;
               case 58 -> 156;
               case 59 -> 160;
               case 60 -> 72;
               case 61 -> 239;
               case 62 -> 154;
               case 63 -> 189;
               case 64 -> 1;
               case 65 -> 11;
               case 66 -> 230;
               case 67 -> 220;
               case 68 -> 164;
               case 69 -> 193;
               case 70 -> 132;
               case 71 -> 129;
               case 72 -> 56;
               case 73 -> 176;
               case 74 -> 131;
               case 75 -> 122;
               case 76 -> 139;
               case 77 -> 36;
               case 78 -> 80;
               case 79 -> 203;
               case 80 -> 201;
               case 81 -> 216;
               case 82 -> 236;
               case 83 -> 95;
               case 84 -> 251;
               case 85 -> 142;
               case 86 -> 210;
               case 87 -> 119;
               case 88 -> 22;
               case 89 -> 53;
               case 90 -> 19;
               case 91 -> 60;
               case 92 -> 134;
               case 93 -> 63;
               case 94 -> 249;
               case 95 -> 38;
               case 96 -> 183;
               case 97 -> 0;
               case 98 -> 144;
               case 99 -> 130;
               case 100 -> 45;
               case 101 -> 166;
               case 102 -> 218;
               case 103 -> 213;
               case 104 -> 26;
               case 105 -> 74;
               case 106 -> 228;
               case 107 -> 69;
               case 108 -> 83;
               case 109 -> 88;
               case 110 -> 169;
               case 111 -> 252;
               case 112 -> 42;
               case 113 -> 107;
               case 114 -> 151;
               case 115 -> 224;
               case 116 -> 46;
               case 117 -> 202;
               case 118 -> 94;
               case 119 -> 227;
               case 120 -> 145;
               case 121 -> 3;
               case 122 -> 196;
               case 123 -> 229;
               case 124 -> 123;
               case 125 -> 47;
               case 126 -> 247;
               case 127 -> 27;
               case 128 -> 43;
               case 129 -> 28;
               case 130 -> 103;
               case 131 -> 209;
               case 132 -> 24;
               case 133 -> 117;
               case 134 -> 246;
               case 135 -> 222;
               case 136 -> 152;
               case 137 -> 242;
               case 138 -> 9;
               case 139 -> 241;
               case 140 -> 211;
               case 141 -> 167;
               case 142 -> 155;
               case 143 -> 17;
               case 144 -> 157;
               case 145 -> 149;
               case 146 -> 20;
               case 147 -> 34;
               case 148 -> 225;
               case 149 -> 175;
               case 150 -> 179;
               case 151 -> 92;
               case 152 -> 93;
               case 153 -> 234;
               case 154 -> 66;
               case 155 -> 114;
               case 156 -> 162;
               case 157 -> 65;
               case 158 -> 188;
               case 159 -> 135;
               case 160 -> 54;
               case 161 -> 153;
               case 162 -> 37;
               case 163 -> 100;
               case 164 -> 16;
               case 165 -> 85;
               case 166 -> 219;
               case 167 -> 57;
               case 168 -> 233;
               case 169 -> 221;
               case 170 -> 121;
               case 171 -> 170;
               case 172 -> 168;
               case 173 -> 49;
               case 174 -> 84;
               case 175 -> 172;
               case 176 -> 165;
               case 177 -> 206;
               case 178 -> 10;
               case 179 -> 77;
               case 180 -> 184;
               case 181 -> 32;
               case 182 -> 8;
               case 183 -> 232;
               case 184 -> 182;
               case 185 -> 7;
               case 186 -> 86;
               case 187 -> 146;
               case 188 -> 79;
               case 189 -> 52;
               case 190 -> 204;
               case 191 -> 111;
               case 192 -> 143;
               case 193 -> 50;
               case 194 -> 174;
               case 195 -> 102;
               case 196 -> 245;
               case 197 -> 124;
               case 198 -> 105;
               case 199 -> 177;
               case 200 -> 187;
               case 201 -> 180;
               case 202 -> 118;
               case 203 -> 128;
               case 204 -> 89;
               case 205 -> 76;
               case 206 -> 35;
               case 207 -> 138;
               case 208 -> 171;
               case 209 -> 235;
               case 210 -> 120;
               case 211 -> 110;
               case 212 -> 253;
               case 213 -> 64;
               case 214 -> 67;
               case 215 -> 237;
               case 216 -> 2;
               case 217 -> 81;
               case 218 -> 178;
               case 219 -> 13;
               case 220 -> 73;
               case 221 -> 198;
               case 222 -> 115;
               case 223 -> 199;
               case 224 -> 33;
               case 225 -> 97;
               case 226 -> 205;
               case 227 -> 70;
               case 228 -> 58;
               case 229 -> 161;
               case 230 -> 101;
               case 231 -> 109;
               case 232 -> 137;
               case 233 -> 6;
               case 234 -> 150;
               case 235 -> 254;
               case 236 -> 5;
               case 237 -> 40;
               case 238 -> 173;
               case 239 -> 31;
               case 240 -> 71;
               case 241 -> 44;
               case 242 -> 29;
               case 243 -> 23;
               case 244 -> 207;
               case 245 -> 90;
               case 246 -> 231;
               case 247 -> 212;
               case 248 -> 191;
               case 249 -> 186;
               case 250 -> 113;
               case 251 -> 140;
               case 252 -> 240;
               case 253 -> 185;
               case 254 -> 87;
               default -> 126;
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

      public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

         private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         }

         @NotNull
         public final llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid a() {
            return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
      }

      // ==== L1-restored: Kotlin synthetics, bodies transcribed from jar bytecode (javap -p -c) ====
      public static final PXEvMid e() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public PXEvMid(
@NotNull Vec3 var1,
         @NotNull llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
         @Nullable BlockPos var3,
         @Nullable Entity var4,
         int mask,
         kotlin.jvm.internal.DefaultConstructorMarker marker
      ) {
         if ((mask & 4) != 0) { var3 = null; }
         if ((mask & 8) != 0) { var4 = null; }
         this(var1, var2, var3, var4);
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final Entity IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final AABB lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull Entity var1, @NotNull AABB var2) {
         short var10001 = 29315;
         short var10002 = 14224;
         Intrinsics.checkNotNullParameter(var1, "entity");
         var10001 = 29314;
         var10002 = 16415;
         Intrinsics.checkNotNullParameter(var2, "box");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final Entity a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final AABB b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "?0îÙEÕ\u0003¼/u";
         int var4 = "?0îÙEÕ\u0003¼/u".length();
         char var1 = 6;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 53;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 53;
                  var10006 = var6;
               } else {
                  var13 = 53;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 53;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 1;
                     case 1 -> 126;
                     case 2 -> 7;
                     case 3 -> 73;
                     case 4 -> 101;
                     case 5 -> 105;
                     default -> 50;
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
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 29315) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 120;
               case 1 -> 203;
               case 2 -> 249;
               case 3 -> 229;
               case 4 -> 199;
               case 5 -> 211;
               case 6 -> 231;
               case 7 -> 225;
               case 8 -> 18;
               case 9 -> 116;
               case 10 -> 92;
               case 11 -> 34;
               case 12 -> 10;
               case 13 -> 105;
               case 14 -> 251;
               case 15 -> 45;
               case 16 -> 227;
               case 17 -> 175;
               case 18 -> 195;
               case 19 -> 255;
               case 20 -> 121;
               case 21 -> 151;
               case 22 -> 236;
               case 23 -> 76;
               case 24 -> 12;
               case 25 -> 130;
               case 26 -> 171;
               case 27 -> 248;
               case 28 -> 198;
               case 29 -> 163;
               case 30 -> 242;
               case 31 -> 174;
               case 32 -> 226;
               case 33 -> 36;
               case 34 -> 57;
               case 35 -> 82;
               case 36 -> 139;
               case 37 -> 81;
               case 38 -> 99;
               case 39 -> 189;
               case 40 -> 126;
               case 41 -> 67;
               case 42 -> 97;
               case 43 -> 224;
               case 44 -> 173;
               case 45 -> 9;
               case 46 -> 85;
               case 47 -> 111;
               case 48 -> 72;
               case 49 -> 154;
               case 50 -> 35;
               case 51 -> 101;
               case 52 -> 69;
               case 53 -> 158;
               case 54 -> 140;
               case 55 -> 30;
               case 56 -> 213;
               case 57 -> 209;
               case 58 -> 200;
               case 59 -> 191;
               case 60 -> 22;
               case 61 -> 77;
               case 62 -> 230;
               case 63 -> 232;
               case 64 -> 7;
               case 65 -> 104;
               case 66 -> 83;
               case 67 -> 47;
               case 68 -> 142;
               case 69 -> 14;
               case 70 -> 253;
               case 71 -> 246;
               case 72 -> 131;
               case 73 -> 172;
               case 74 -> 155;
               case 75 -> 178;
               case 76 -> 16;
               case 77 -> 223;
               case 78 -> 219;
               case 79 -> 143;
               case 80 -> 2;
               case 81 -> 21;
               case 82 -> 128;
               case 83 -> 98;
               case 84 -> 222;
               case 85 -> 27;
               case 86 -> 138;
               case 87 -> 210;
               case 88 -> 88;
               case 89 -> 61;
               case 90 -> 181;
               case 91 -> 6;
               case 92 -> 146;
               case 93 -> 169;
               case 94 -> 214;
               case 95 -> 221;
               case 96 -> 29;
               case 97 -> 26;
               case 98 -> 66;
               case 99 -> 220;
               case 100 -> 197;
               case 101 -> 102;
               case 102 -> 162;
               case 103 -> 71;
               case 104 -> 106;
               case 105 -> 52;
               case 106 -> 177;
               case 107 -> 89;
               case 108 -> 168;
               case 109 -> 243;
               case 110 -> 118;
               case 111 -> 237;
               case 112 -> 167;
               case 113 -> 51;
               case 114 -> 183;
               case 115 -> 103;
               case 116 -> 122;
               case 117 -> 84;
               case 118 -> 235;
               case 119 -> 65;
               case 120 -> 73;
               case 121 -> 218;
               case 122 -> 107;
               case 123 -> 188;
               case 124 -> 205;
               case 125 -> 180;
               case 126 -> 192;
               case 127 -> 254;
               case 128 -> 241;
               case 129 -> 161;
               case 130 -> 59;
               case 131 -> 185;
               case 132 -> 135;
               case 133 -> 134;
               case 134 -> 23;
               case 135 -> 90;
               case 136 -> 53;
               case 137 -> 31;
               case 138 -> 8;
               case 139 -> 187;
               case 140 -> 44;
               case 141 -> 208;
               case 142 -> 15;
               case 143 -> 49;
               case 144 -> 119;
               case 145 -> 228;
               case 146 -> 115;
               case 147 -> 170;
               case 148 -> 46;
               case 149 -> 145;
               case 150 -> 127;
               case 151 -> 216;
               case 152 -> 87;
               case 153 -> 245;
               case 154 -> 160;
               case 155 -> 4;
               case 156 -> 91;
               case 157 -> 70;
               case 158 -> 194;
               case 159 -> 182;
               case 160 -> 48;
               case 161 -> 17;
               case 162 -> 39;
               case 163 -> 55;
               case 164 -> 244;
               case 165 -> 165;
               case 166 -> 152;
               case 167 -> 133;
               case 168 -> 93;
               case 169 -> 184;
               case 170 -> 38;
               case 171 -> 109;
               case 172 -> 33;
               case 173 -> 19;
               case 174 -> 80;
               case 175 -> 114;
               case 176 -> 64;
               case 177 -> 113;
               case 178 -> 207;
               case 179 -> 206;
               case 180 -> 136;
               case 181 -> 37;
               case 182 -> 239;
               case 183 -> 58;
               case 184 -> 43;
               case 185 -> 240;
               case 186 -> 186;
               case 187 -> 1;
               case 188 -> 157;
               case 189 -> 42;
               case 190 -> 137;
               case 191 -> 148;
               case 192 -> 50;
               case 193 -> 54;
               case 194 -> 164;
               case 195 -> 238;
               case 196 -> 60;
               case 197 -> 247;
               case 198 -> 179;
               case 199 -> 132;
               case 200 -> 3;
               case 201 -> 78;
               case 202 -> 11;
               case 203 -> 24;
               case 204 -> 75;
               case 205 -> 202;
               case 206 -> 123;
               case 207 -> 153;
               case 208 -> 156;
               case 209 -> 63;
               case 210 -> 250;
               case 211 -> 96;
               case 212 -> 68;
               case 213 -> 100;
               case 214 -> 233;
               case 215 -> 252;
               case 216 -> 110;
               case 217 -> 41;
               case 218 -> 94;
               case 219 -> 108;
               case 220 -> 217;
               case 221 -> 40;
               case 222 -> 56;
               case 223 -> 141;
               case 224 -> 204;
               case 225 -> 25;
               case 226 -> 32;
               case 227 -> 150;
               case 228 -> 5;
               case 229 -> 212;
               case 230 -> 95;
               case 231 -> 86;
               case 232 -> 20;
               case 233 -> 159;
               case 234 -> 124;
               case 235 -> 201;
               case 236 -> 190;
               case 237 -> 79;
               case 238 -> 234;
               case 239 -> 28;
               case 240 -> 125;
               case 241 -> 62;
               case 242 -> 215;
               case 243 -> 129;
               case 244 -> 112;
               case 245 -> 196;
               case 246 -> 147;
               case 247 -> 144;
               case 248 -> 0;
               case 249 -> 176;
               case 250 -> 74;
               case 251 -> 166;
               case 252 -> 117;
               case 253 -> 193;
               case 254 -> 13;
               default -> 149;
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

   // ==== L1-restored: Kotlin synthetic $default bridges (source: cfr-out text of me-octo-only.jar) ====
    public static /* synthetic */ PXEvMid a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, Vec3 vec3, List list, Vec3 vec32, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
        int n3 = n & 2;
        if (n2 == 0) {
            if (n3 != 0) {
                list = CollectionsKt.emptyList();
            }
            n3 = n & 4;
        }
        if (n3 != 0) {
            vec32 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a();
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(vec3, (List<? extends Class<? extends Entity>>)list, vec32);
    }

    public static /* synthetic */ PXEvMid a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, Vec3 vec3, double d, List list, Vec3 vec32, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
        int n3 = n & 4;
        if (n2 == 0) {
            if (n3 != 0) {
                list = CollectionsKt.emptyList();
            }
            n3 = n & 8;
        }
        if (n3 != 0) {
            vec32 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a();
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(vec3, d, (List<? extends Class<? extends Entity>>)list, vec32);
    }

    public static /* synthetic */ PXEvMid a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, Vec3 vec3, Vec3 vec32, int n, Object object) {
        if ((n & 2) != 0) {
            vec32 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.b();
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(vec3, vec32);
    }

    public static /* synthetic */ PXEvMid a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, BlockPos blockPos, Vec3 vec3, int n, Object object) {
        if ((n & 2) != 0) {
            vec3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.b();
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(blockPos, vec3);
    }

    public static /* synthetic */ PXEvMid a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, BlockPos blockPos, List list, Vec3 vec3, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
        int n3 = n & 2;
        if (n2 == 0) {
            if (n3 != 0) {
                list = CollectionsKt.emptyList();
            }
            n3 = n & 4;
        }
        if (n3 != 0) {
            vec3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(blockPos, (List<? extends Class<? extends Entity>>)list, vec3);
    }

    public static /* synthetic */ BlockHitResult a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, float f, float f2, double d, boolean bl, float f3, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
        int n3 = n & 4;
        if (n2 == 0) {
            if (n3 != 0) {
                LocalPlayer localPlayer = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                Intrinsics.checkNotNull((Object)localPlayer);
                double d2 = localPlayer.blockInteractionRange();
                LocalPlayer localPlayer2 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                Intrinsics.checkNotNull((Object)localPlayer2);
                d = Math.max(d2, localPlayer2.entityInteractionRange());
            }
            n3 = n & 8;
        }
        if (n2 == 0) {
            if (n3 != 0) {
                bl = false;
            }
            n3 = n & 0x10;
        }
        if (n3 != 0) {
            f3 = 1.0f;
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(f, f2, d, bl, f3);
    }

    static /* synthetic */ BlockHitResult a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, double d, boolean bl, Vec3 vec3, Vec3 vec32, Entity entity, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
        int n3 = n & 1;
        if (n2 != 0) {
            if (n3 != 0) {
                LocalPlayer localPlayer = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                Intrinsics.checkNotNull((Object)localPlayer);
                double d2 = localPlayer.blockInteractionRange();
                LocalPlayer localPlayer2 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                Intrinsics.checkNotNull((Object)localPlayer2);
                d = Math.max(d2, localPlayer2.entityInteractionRange());
            }
            n3 = n & 2;
        }
        if (n2 != 0) {
            if (n3 != 0) {
                bl = false;
            }
            n3 = n & 0x10;
        }
        if (n3 != 0) {
            Entity entity2 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().getCameraEntity();
            Intrinsics.checkNotNull((Object)entity2);
            entity = entity2;
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(d, bl, vec3, vec32, entity);
    }

    public static /* synthetic */ List a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, AABB aABB, double d, double d2, Vec3 vec3, double d3, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
        int n3 = n & 2;
        if (n2 != 0) {
            if (n3 != 0) {
                d = 0.1;
            }
            n3 = n & 4;
        }
        if (n2 != 0) {
            if (n3 != 0) {
                d2 = 0.01;
            }
            n3 = n & 8;
        }
        if (n2 != 0) {
            if (n3 != 0) {
                vec3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a();
            }
            n3 = n & 0x10;
        }
        if (n3 != 0) {
            d3 = 999.0;
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(aABB, d, d2, vec3, d3);
    }

    public static /* synthetic */ boolean a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, BlockPos blockPos, double d, List list, Vec3 vec3, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.c();
        int n3 = n & 4;
        if (n2 != 0) {
            if (n3 != 0) {
                list = CollectionsKt.emptyList();
            }
            n3 = n & 8;
        }
        if (n2 != 0) {
            if (n3 != 0) {
                vec3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a();
            }
            n3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(blockPos, d, (List<? extends Class<? extends Entity>>)list, vec3) ? 1 : 0;
        }
        return n3 != 0;
    }

    public static /* synthetic */ boolean b(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, BlockPos blockPos, List list, Vec3 vec3, int n, Object object) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
        int n3 = n & 2;
        if (n2 == 0) {
            if (n3 != 0) {
                list = CollectionsKt.emptyList();
            }
            n3 = n & 4;
        }
        if (n2 == 0) {
            if (n3 != 0) {
                vec3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a();
            }
            n3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.b(blockPos, list, vec3) ? 1 : 0;
        }
        return n3 != 0;
    }

    public static /* synthetic */ List a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, Object object, List list, Vec3 vec3, double d, double d2, double d3, int n, Object object2) {
        int n2 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.d();
        int n3 = n & 2;
        if (n2 == 0) {
            if (n3 != 0) {
                list = CollectionsKt.emptyList();
            }
            n3 = n & 4;
        }
        if (n2 == 0) {
            if (n3 != 0) {
                vec3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a();
            }
            n3 = n & 8;
        }
        if (n2 == 0) {
            if (n3 != 0) {
                d = 0.1;
            }
            n3 = n & 0x10;
        }
        if (n2 == 0) {
            if (n3 != 0) {
                d2 = 0.01;
            }
            n3 = n & 0x20;
        }
        if (n3 != 0) {
            d3 = 999.0;
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(object, list, vec3, d, d2, d3);
    }

    public static /* synthetic */ List a(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2, AABB aABB, Vec3 vec3, int n, Object object) {
        if ((n & 2) != 0) {
            vec3 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a();
        }
        return llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll2.a(aABB, vec3);
    }
}
