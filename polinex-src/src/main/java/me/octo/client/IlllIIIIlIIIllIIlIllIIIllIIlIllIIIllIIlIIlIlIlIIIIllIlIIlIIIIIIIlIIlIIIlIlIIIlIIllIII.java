package me.octo.client;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII(Object... px) {
           this((Minecraft)null, 0L); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Map<Integer, Vec3> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private Vec3 IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   public IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII(@NotNull Minecraft var1, long var2) {
      short var10001 = -17958;
      short var10002 = -10266;
      Intrinsics.checkNotNullParameter(var1, "mc");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new LinkedHashMap<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = -1;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Vec3(0.0, 0.0, 0.0);
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @NotNull
   public final Vec3 a(@NotNull LivingEntity var1) {
      int var10000 = c();
      short var10002 = -17961;
      short var10003 = -10463;
      Intrinsics.checkNotNullParameter(var1, "target");
      int var2 = var10000;
      if (var2 == 0) {
         if (var1.getId() == this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            if (var2 != 0) {
               return this.a(var1, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            }

            if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a((Number)Long.valueOf(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII))) {
               return this.a(var1, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            }
         }

         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1.getId();
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f();
      }

      double var3 = (Random.Default.nextDouble() - 0.5) * 0.06;
      double var5 = (Random.Default.nextDouble() - 0.5) * 0.06;
      double var7 = (Random.Default.nextDouble() - 0.5) * 0.06;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Vec3(var3, var5, var7);
      return this.a(var1, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
   }

   @NotNull
   public final Vec3 b(@NotNull LivingEntity var1) {
      short var10001 = -17968;
      short var10002 = -23238;
      Intrinsics.checkNotNullParameter(var1, "target");
      Map var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Integer var4 = var1.getId();
      boolean var5 = false;
      Object var6 = var3.get(var4);
      Object var10000;
      if (var6 == null) {
         boolean var7 = false;
         double var8 = (Random.Default.nextDouble() - 0.5) * 0.06;
         double var10 = (Random.Default.nextDouble() - 0.5) * 0.06;
         double var12 = (Random.Default.nextDouble() - 0.5) * 0.06;
         Vec3 var14 = new Vec3(var8, var10, var12);
         var3.put(var4, var14);
         var10000 = var14;
      } else {
         var10000 = var6;
      }

      Vec3 var2 = (Vec3)var10000;
      return this.a(var1, var2);
   }

   @Nullable
   public final Vec3 c(@NotNull LivingEntity var1) {
      short var10001 = -17968;
      short var10002 = -23238;
      Intrinsics.checkNotNullParameter(var1, "target");
      int var10000 = c();
      Map var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var2 = var10000;
      Integer var5 = var1.getId();
      boolean var6 = false;
      Object var7 = var4.get(var5);
      Object var17;
      if (var7 == null) {
         boolean var8 = false;
         double var9 = (Random.Default.nextDouble() - 0.5) * 0.06;
         double var11 = (Random.Default.nextDouble() - 0.5) * 0.06;
         double var13 = (Random.Default.nextDouble() - 0.5) * 0.06;
         Vec3 var16 = new Vec3(var9, var11, var13);
         var4.put(var5, var16);
         var17 = var16;
      } else {
         var17 = var7;
      }

      Vec3 var3 = (Vec3)var17;
      Vec3 var18 = this.b(var1, var3);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(++var2);
      }

      return var18;
   }

   private final Vec3 d(LivingEntity var1) {
      int var2 = c();
      if (var2 == 0 && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player != null) {
         LocalPlayer var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
         double var4 = var1.getEyePosition().distanceTo(var3.getEyePosition());
         double var6 = RangesKt.coerceIn(2.0 + var4 * 0.6, 2.0, 8.0);
         Vec3 var9 = var1.getDeltaMovement();
         short var10 = -17966;
         short var11 = -16071;
         Intrinsics.checkNotNullExpressionValue(var9, "getDeltaMovement(...)");
         Vec3 var8 = var9;
         return new Vec3(var8.x * var6, var8.y * var6 * 0.5, var8.z * var6);
      } else {
         Vec3 var10000 = Vec3.ZERO;
         short var10002 = -17957;
         short var10003 = 26257;
         Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
         return var10000;
      }
   }

   private final Vec3 a(LivingEntity var1, Vec3 var2) {
      Vec3 var5;
      AABB var6;
      double var15;
      label22: {
         LocalPlayer var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
         int var10000 = c();
         var5 = this.d(var1);
         int var3 = var10000;
         AABB var13 = var1.getBoundingBox();
         short var10002 = -17959;
         short var10003 = 29835;
         Intrinsics.checkNotNullExpressionValue(var13, "getBoundingBox(...)");
         var6 = var13;
         Object var14 = var4;
         if (var3 == 0) {
            if (var4 != null) {
               var15 = var4.getEyePosition().y - 0.25;
               break label22;
            }

            var14 = var1;
         }

         var15 = (Double)((me.octo.client.PXDyn)var14).getY() + var6.getYsize() * 0.5;
      }

      double var7 = var15;
      double var9 = RangesKt.coerceIn(var7, var6.minY + 0.15, var6.maxY - 0.15);
      Vec3 var11 = new Vec3(var1.getX() + var5.x + var2.x, var9 + var2.y, var1.getZ() + var5.z + var2.z);
      me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var12 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var11,
         CollectionsKt.listOf(var1.getClass()),
         null);
      if (var12.b()
         != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )
       {
         return var11;
      } else {
         Vec3 var16 = this.c(var1, new Vec3(var5.x, 0.0, var5.z));
         if (var16 == null) {
            var16 = var11;
         }

         return var16;
      }
   }

   private final Vec3 b(LivingEntity var1, Vec3 var2) {
      int var3;
      Vec3 var5;
      AABB var6;
      double var15;
      label41: {
         int var10000 = b();
         LocalPlayer var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
         var3 = var10000;
         var5 = this.d(var1);
         AABB var13 = var1.getBoundingBox();
         short var10002 = -17965;
         short var10003 = 17047;
         Intrinsics.checkNotNullExpressionValue(var13, "getBoundingBox(...)");
         var6 = var13;
         Object var14 = var4;
         if (var3 != 0) {
            if (var4 != null) {
               var15 = var4.getEyePosition().y - 0.25;
               break label41;
            }

            var14 = var1;
         }

         var15 = (Double)((me.octo.client.PXDyn)var14).getY() + var6.getYsize() * 0.5;
      }

      double var7 = var15;
      double var9 = RangesKt.coerceIn(var7, var6.minY + 0.15, var6.maxY - 0.15);
      Vec3 var11 = new Vec3(var1.getX() + var5.x + var2.x, var9 + var2.y, var1.getZ() + var5.z + var2.z);
      me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var12 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var11,
         CollectionsKt.listOf(var1.getClass()),
         null);
      me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var16 = var12;
      if (var3 != 0) {
         if (var12.b()
            != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            )
          {
            return null;
         }

         var16 = var12;
      }

      Entity var17 = var16.d();
      int var18;
      if (var17 != null) {
         var18 = var17.getId();
         if (var3 != 0) {
            var18 = var18 == var1.getId() ? 1 : 0;
         }
      } else {
         var18 = 0;
      }

      if (var18 != 0) {
         Vec3 var19 = this.c(var1, new Vec3(var5.x, 0.0, var5.z));
         if (var19 == null) {
            var19 = var12.a();
         }

         return var19;
      } else {
         return null;
      }
   }

   private final Vec3 c(LivingEntity var1, Vec3 var2) {
      BlockPos var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      int var10000 = c();
      AABB var10001 = var1.getBoundingBox().deflate(0.2, 0.05, 0.2);
      short var10003 = -17964;
      short var10004 = 30244;
      Intrinsics.checkNotNullExpressionValue(var10001, "deflate(...)");
      AABB var5 = var10001;
      Vec3 var17 = var5.getCenter();
      var10003 = -17963;
      var10004 = -5697;
      Intrinsics.checkNotNullExpressionValue(var17, "getCenter(...)");
      Vec3 var6 = var17;
      int var3 = var10000;
      List var7 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var5,
         0.0,
         0.0,
         null,
         0.0,
         30,
         null
      );
      Object var15 = var7;
      if (var3 == 0) {
         if (var7.size() < 3) {
            return null;
         }

         var15 = var7;
      }

      Object var9 = var15;
      boolean var10 = false;

      label27:
      for (Vec3 var14 : ((java.util.List<Vec3>)(CollectionsKt.take(
         CollectionsKt.sortedWith(
            (Iterable)var9,
            new IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var6
            )
         ),
         12
      )))) {
         Vec3 var16 = var14.add(var2);
         short var10002 = -17967;
         var10003 = 6524;
         Intrinsics.checkNotNullExpressionValue(var16, "add(...)");

         Vec3 var11;
         do {
            var11 = var16;
            me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var12 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var11,
               CollectionsKt.listOf(var1.getClass()),
               null);
            if (var12.b()
               != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
             {
               continue label27;
            }

            var16 = var11;
         } while (var3 != 0);

         return var11;
      }

      return null;
   }

   public IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII() {
      this(null, 0L, 3, null);
   }

   public static void b(int var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static int b() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public static int c() {
      int var0 = b();
      return var0 == 0 ? 107 : 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\rõ\u0016ü\u0012$mn^\u0003!Ä\u0004)\u007fE¤¤\u0013\u0015ñ^\u0089\u008fë\u0095\u0003gî\u0086\u0086rÁ!Ã »\t1 '\bW\u0012\u008bKò®XB\u0006ªí\u0095^®ð\u0006Ì\u008aY²7m\u0010\u0011½\u0095þc\bx(¢c[\u000eH\u0001\u0099Û\u000eí\u0014\nÁ\u009b¹\r¤\u0010=Ùá:=\fÍ[\u007f\u0007a±Ç±&}È(\u0004_\u001aà(";
      int var4 = "\rõ\u0016ü\u0012$mn^\u0003!Ä\u0004)\u007fE¤¤\u0013\u0015ñ^\u0089\u008fë\u0095\u0003gî\u0086\u0086rÁ!Ã »\t1 '\bW\u0012\u008bKò®XB\u0006ªí\u0095^®ð\u0006Ì\u008aY²7m\u0010\u0011½\u0095þc\bx(¢c[\u000eH\u0001\u0099Û\u000eí\u0014\nÁ\u009b¹\r¤\u0010=Ùá:=\fÍ[\u007f\u0007a±Ç±&}È(\u0004_\u001aà("
         .length();
      char var1 = 19;
      b(54);
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 56;
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
                     case 0 -> 104;
                     case 1 -> 77;
                     case 2 -> 122;
                     case 3 -> 95;
                     case 4 -> 53;
                     case 5 -> 16;
                     default -> 90;
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
                     b = new String[11];
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

                  var2 = "Ñ\r\u0013\u0011M\u0017i°\u0014»ê\u0006\u0011¨\u0004·³\u008b\u0094¸\u001c\u0012";
                  var4 = "Ñ\r\u0013\u0011M\u0017i°\u0014»ê\u0006\u0011¨\u0004·³\u008b\u0094¸\u001c\u0012".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -17965) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 226;
            case 1 -> 53;
            case 2 -> 111;
            case 3 -> 28;
            case 4 -> 113;
            case 5 -> 107;
            case 6 -> 219;
            case 7 -> 22;
            case 8 -> 81;
            case 9 -> 177;
            case 10 -> 179;
            case 11 -> 193;
            case 12 -> 119;
            case 13 -> 138;
            case 14 -> 23;
            case 15 -> 60;
            case 16 -> 20;
            case 17 -> 230;
            case 18 -> 86;
            case 19 -> 12;
            case 20 -> 67;
            case 21 -> 61;
            case 22 -> 110;
            case 23 -> 106;
            case 24 -> 208;
            case 25 -> 241;
            case 26 -> 227;
            case 27 -> 108;
            case 28 -> 25;
            case 29 -> 254;
            case 30 -> 21;
            case 31 -> 233;
            case 32 -> 178;
            case 33 -> 183;
            case 34 -> 34;
            case 35 -> 39;
            case 36 -> 168;
            case 37 -> 62;
            case 38 -> 234;
            case 39 -> 71;
            case 40 -> 181;
            case 41 -> 31;
            case 42 -> 68;
            case 43 -> 97;
            case 44 -> 213;
            case 45 -> 198;
            case 46 -> 66;
            case 47 -> 134;
            case 48 -> 11;
            case 49 -> 244;
            case 50 -> 176;
            case 51 -> 101;
            case 52 -> 159;
            case 53 -> 77;
            case 54 -> 174;
            case 55 -> 135;
            case 56 -> 223;
            case 57 -> 180;
            case 58 -> 170;
            case 59 -> 91;
            case 60 -> 54;
            case 61 -> 74;
            case 62 -> 163;
            case 63 -> 252;
            case 64 -> 131;
            case 65 -> 84;
            case 66 -> 55;
            case 67 -> 18;
            case 68 -> 149;
            case 69 -> 250;
            case 70 -> 221;
            case 71 -> 9;
            case 72 -> 98;
            case 73 -> 17;
            case 74 -> 65;
            case 75 -> 153;
            case 76 -> 145;
            case 77 -> 72;
            case 78 -> 196;
            case 79 -> 41;
            case 80 -> 10;
            case 81 -> 161;
            case 82 -> 40;
            case 83 -> 245;
            case 84 -> 203;
            case 85 -> 56;
            case 86 -> 210;
            case 87 -> 1;
            case 88 -> 69;
            case 89 -> 47;
            case 90 -> 212;
            case 91 -> 137;
            case 92 -> 200;
            case 93 -> 93;
            case 94 -> 167;
            case 95 -> 165;
            case 96 -> 228;
            case 97 -> 46;
            case 98 -> 121;
            case 99 -> 207;
            case 100 -> 169;
            case 101 -> 214;
            case 102 -> 114;
            case 103 -> 123;
            case 104 -> 132;
            case 105 -> 151;
            case 106 -> 129;
            case 107 -> 80;
            case 108 -> 156;
            case 109 -> 247;
            case 110 -> 215;
            case 111 -> 242;
            case 112 -> 239;
            case 113 -> 162;
            case 114 -> 48;
            case 115 -> 158;
            case 116 -> 185;
            case 117 -> 19;
            case 118 -> 15;
            case 119 -> 204;
            case 120 -> 218;
            case 121 -> 224;
            case 122 -> 82;
            case 123 -> 188;
            case 124 -> 30;
            case 125 -> 92;
            case 126 -> 146;
            case 127 -> 59;
            case 128 -> 117;
            case 129 -> 38;
            case 130 -> 231;
            case 131 -> 44;
            case 132 -> 166;
            case 133 -> 125;
            case 134 -> 133;
            case 135 -> 58;
            case 136 -> 238;
            case 137 -> 94;
            case 138 -> 37;
            case 139 -> 96;
            case 140 -> 130;
            case 141 -> 249;
            case 142 -> 116;
            case 143 -> 0;
            case 144 -> 24;
            case 145 -> 206;
            case 146 -> 75;
            case 147 -> 157;
            case 148 -> 124;
            case 149 -> 105;
            case 150 -> 160;
            case 151 -> 26;
            case 152 -> 150;
            case 153 -> 182;
            case 154 -> 194;
            case 155 -> 14;
            case 156 -> 57;
            case 157 -> 43;
            case 158 -> 27;
            case 159 -> 164;
            case 160 -> 253;
            case 161 -> 115;
            case 162 -> 120;
            case 163 -> 102;
            case 164 -> 4;
            case 165 -> 52;
            case 166 -> 136;
            case 167 -> 189;
            case 168 -> 173;
            case 169 -> 90;
            case 170 -> 154;
            case 171 -> 76;
            case 172 -> 240;
            case 173 -> 147;
            case 174 -> 29;
            case 175 -> 2;
            case 176 -> 64;
            case 177 -> 127;
            case 178 -> 175;
            case 179 -> 63;
            case 180 -> 217;
            case 181 -> 144;
            case 182 -> 128;
            case 183 -> 87;
            case 184 -> 211;
            case 185 -> 109;
            case 186 -> 3;
            case 187 -> 216;
            case 188 -> 201;
            case 189 -> 229;
            case 190 -> 232;
            case 191 -> 139;
            case 192 -> 246;
            case 193 -> 148;
            case 194 -> 141;
            case 195 -> 16;
            case 196 -> 251;
            case 197 -> 13;
            case 198 -> 122;
            case 199 -> 190;
            case 200 -> 95;
            case 201 -> 225;
            case 202 -> 192;
            case 203 -> 220;
            case 204 -> 126;
            case 205 -> 6;
            case 206 -> 104;
            case 207 -> 89;
            case 208 -> 186;
            case 209 -> 70;
            case 210 -> 85;
            case 211 -> 50;
            case 212 -> 35;
            case 213 -> 202;
            case 214 -> 191;
            case 215 -> 255;
            case 216 -> 236;
            case 217 -> 243;
            case 218 -> 33;
            case 219 -> 152;
            case 220 -> 155;
            case 221 -> 36;
            case 222 -> 7;
            case 223 -> 195;
            case 224 -> 49;
            case 225 -> 45;
            case 226 -> 100;
            case 227 -> 88;
            case 228 -> 8;
            case 229 -> 197;
            case 230 -> 42;
            case 231 -> 199;
            case 232 -> 187;
            case 233 -> 78;
            case 234 -> 83;
            case 235 -> 209;
            case 236 -> 184;
            case 237 -> 112;
            case 238 -> 99;
            case 239 -> 140;
            case 240 -> 248;
            case 241 -> 73;
            case 242 -> 171;
            case 243 -> 103;
            case 244 -> 5;
            case 245 -> 143;
            case 246 -> 235;
            case 247 -> 237;
            case 248 -> 51;
            case 249 -> 79;
            case 250 -> 172;
            case 251 -> 32;
            case 252 -> 222;
            case 253 -> 205;
            case 254 -> 142;
            default -> 118;
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

   public IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII(net.minecraft.client.Minecraft p0, long p1, int p2, kotlin.jvm.internal.DefaultConstructorMarker p3) {
      this(p0, p1);
   }
}
