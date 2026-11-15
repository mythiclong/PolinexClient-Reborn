package me.octo.client.utils;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;

public final class IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl {
    public static <T> T IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl(Object... args) { return null; } // PX-FIX ovld-var
   public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Vec3 p0, PXDyn p1) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T b(Vec3 p0, PXDyn p1) { return null; } // PX-FIX ovld

   public static <T> T d(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Vec3 p0, String p1) { return null; } // PX-FIX ovld

   public static <T> T c(Object p0, Object p1) { return null; } // PX-FIX ovld

   @NotNull
   public static IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   public static double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   public static double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl() {
   }

   public final double a(double var1, double var3) {
      return Math.sqrt(var1 * var1 + var3 * var3);
   }

   public final float a(float var1, float var2) {
      return (float)Math.sqrt(var1 * var1 + var2 * var2);
   }

   public final double a(@NotNull BlockPos var1, @NotNull BlockPos var2) {
      short var10001 = 21786;
      short var10002 = 29452;
      Intrinsics.checkNotNullParameter(var1, "pos1");
      var10001 = 21778;
      var10002 = -25883;
      Intrinsics.checkNotNullParameter(var2, "pos2");
      int var3 = var1.getX() - var2.getX();
      int var4 = var1.getY() - var2.getY();
      int var5 = var1.getZ() - var2.getZ();
      return Math.sqrt(var3 * var3 + var4 * var4 + var5 * var5);
   }

   public final double a(@NotNull Vec3 var1, @NotNull Vec3 var2) {
      short var10001 = 21790;
      short var10002 = 17746;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = 21769;
      var10002 = 30130;
      Intrinsics.checkNotNullParameter(var2, "to");
      double var3 = var2.x - var1.x;
      double var5 = var2.y - var1.y;
      double var7 = var2.z - var1.z;
      return Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
   }

   public final double b(@NotNull Vec3 var1, @NotNull Vec3 var2) {
      short var10001 = 21760;
      short var10002 = 4575;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = 21769;
      var10002 = 30130;
      Intrinsics.checkNotNullParameter(var2, "to");
      double var3 = var2.x - var1.x;
      double var5 = var2.y - var1.y;
      double var7 = var2.z - var1.z;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public final double b(@NotNull BlockPos var1, @NotNull BlockPos var2) {
      short var10001 = 21760;
      short var10002 = 4575;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = 21769;
      var10002 = 30130;
      Intrinsics.checkNotNullParameter(var2, "to");
      int var3 = var2.getX() - var1.getX();
      int var4 = var2.getY() - var1.getY();
      int var5 = var2.getZ() - var1.getZ();
      return var3 * var3 + var4 * var4 + var5 * var5;
   }

   public final double a(@NotNull Vec3 var1, boolean var2) {
      short var10001 = 21769;
      short var10002 = 30130;
      Intrinsics.checkNotNullParameter(var1, "to");
      return var2
         ? this.d(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(), var1)
         : this.c(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(), var1);
   }

   public final double a(@NotNull BlockPos var1, boolean var2) {
      short var10001 = 21769;
      short var10002 = 30130;
      Intrinsics.checkNotNullParameter(var1, "to");
      return var2
         ? this.d(
            me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var1)
         )
         : this.c(
            me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var1)
         );
   }

   public final double c(@NotNull Vec3 var1, @NotNull Vec3 var2) {
      short var10001 = 21760;
      short var10002 = 4575;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = 21769;
      var10002 = 30130;
      Intrinsics.checkNotNullParameter(var2, "to");
      double var3 = var2.x - var1.x;
      double var5 = var2.z - var1.z;
      return Math.sqrt(var3 * var3 + var5 * var5);
   }

   public final double d(@NotNull Vec3 var1, @NotNull Vec3 var2) {
      short var10001 = 21760;
      short var10002 = 4575;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = 21769;
      var10002 = 30130;
      Intrinsics.checkNotNullParameter(var2, "to");
      double var3 = var2.x - var1.x;
      double var5 = var2.z - var1.z;
      return var3 * var3 + var5 * var5;
   }

   public final double b(@NotNull Vec3 var1, boolean var2) {
      short var10001 = 21769;
      short var10002 = 30130;
      Intrinsics.checkNotNullParameter(var1, "to");
      return this.a(
         var2
            ? me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u()
            : me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
         var1
      );
   }

   public final double b(@NotNull BlockPos var1, boolean var2) {
      short var10001 = 21769;
      short var10002 = 30130;
      Intrinsics.checkNotNullParameter(var1, "to");
      return this.a(
         var2
            ? me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u()
            : me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(var1)
      );
   }

   public final double c(@NotNull Vec3 var1, boolean var2) {
      short var10001 = 21761;
      short var10002 = -24123;
      Intrinsics.checkNotNullParameter(var1, "to");
      return this.b(
         var2
            ? me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u()
            : me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
         var1
      );
   }

   public final double c(@NotNull BlockPos var1, boolean var2) {
      short var10001 = 21769;
      short var10002 = 30130;
      Intrinsics.checkNotNullParameter(var1, "to");
      return this.b(
         var2
            ? me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u()
            : me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(var1)
      );
   }

   public final double a(@NotNull Vec3 var1, @NotNull Vec3 var2, @NotNull Vec3 var3, boolean var4) {
      short var10001 = 21760;
      short var10002 = 4575;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = 21769;
      var10002 = 30130;
      Intrinsics.checkNotNullParameter(var2, "to");
      var10001 = 21787;
      var10002 = 21626;
      Intrinsics.checkNotNullParameter(var3, "direction");
      Vec3 var10000 = var2.subtract(var1);
      var10002 = 21781;
      short var10003 = -1553;
      Intrinsics.checkNotNullExpressionValue(var10000, "subtract(...)");
      Vec3 var5 = var10000;
      Vec3 var6 = var4 ? new Vec3(var5.x, 0.0, var5.z) : var5;
      Vec3 var8 = var4 ? new Vec3(var3.x, 0.0, var3.z).normalize() : var3.normalize();
      Intrinsics.checkNotNull(var8);
      double var12;
      if (var4) {
         var12 = var6.x * var8.z - var6.z * var8.x;
      } else {
         var10000 = var6.cross(var8);
         var10002 = 21789;
         var10003 = -32172;
         Intrinsics.checkNotNullExpressionValue(var10000, "cross(...)");
         Vec3 var10 = var10000;
         var12 = Math.sqrt(var10.x * var10.x + var10.y * var10.y + var10.z * var10.z);
      }

      double var11 = var12;
      return Math.abs(var11);
   }

   public final float a(float var1) {
      return 80.0F / (1.0F + (float)Math.pow(Math.E, -0.1 * var1)) - 40.0F;
   }

   public final float a(float var1, float var2, float var3) {
      return RangesKt.coerceAtLeast(var1, RangesKt.coerceAtMost(var3, var2));
   }

   public final double a(double var1, double var3, double var5) {
      return RangesKt.coerceAtLeast(var1, RangesKt.coerceAtMost(var5, var3));
   }

   public final int a(int var1, int var2, int var3) {
      return RangesKt.coerceAtLeast(var1, RangesKt.coerceAtMost(var3, var2));
   }

   public final long a(long var1, long var3, long var5) {
      return RangesKt.coerceAtLeast(var1, RangesKt.coerceAtMost(var5, var3));
   }

   public final float b(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   public final int a(int var1, int var2, float var3) {
      return (int)(var1 + (var2 - var1) * var3);
   }

   public final double b(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   @JvmStatic
   @NotNull
   public static final Vector3d a(@NotNull Entity var0, float var1) {
      short var10001 = 21791;
      short var10002 = -25280;
      Intrinsics.checkNotNullParameter(var0, "entity");
      return new Vector3d(
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0.xOld, var0.getX(), (double)var1),
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0.yOld, var0.getY(), (double)var1),
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0.zOld, var0.getZ(), (double)var1)
      );
   }

   @JvmStatic
   @Nullable
   public static final AABB b(@NotNull Entity var0, float var1) {
      short var10001 = 21772;
      short var10002 = -7265;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Vector3d var2 = a(var0, var1);
      return var0.getBoundingBox().move(-var0.getX(), -var0.getY(), -var0.getZ()).move(var2.x, var2.y, var2.z);
   }

   public final float b(float var1, float var2) {
      return RangesKt.coerceAtMost(var1, var2);
   }

   public final double b(double var1, double var3) {
      return RangesKt.coerceAtMost(var1, var3);
   }

   public final int a(int var1, int var2) {
      return RangesKt.coerceAtMost(var1, var2);
   }

   public final long a(long var1, long var3) {
      return RangesKt.coerceAtMost(var1, var3);
   }

   public final float c(float var1, float var2) {
      return RangesKt.coerceAtLeast(var1, var2);
   }

   public final double c(double var1, double var3) {
      return RangesKt.coerceAtLeast(var1, var3);
   }

   public final int b(int var1, int var2) {
      return RangesKt.coerceAtLeast(var1, var2);
   }

   public final long b(long var1, long var3) {
      return RangesKt.coerceAtLeast(var1, var3);
   }

   @JvmStatic
   public static final float b(float var0) {
      return (float)Math.floor(var0);
   }

   public final double a(double var1) {
      return Math.floor(var1);
   }

   public final int c(float var1) {
      return (int)((float)Math.floor(var1));
   }

   public final int b(double var1) {
      return (int)Math.floor(var1);
   }

   public final float d(float var1) {
      return (float)Math.rint(var1);
   }

   public final int e(float var1) {
      return (int)((float)Math.rint(var1));
   }

   public final double c(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   @JvmStatic
   public static final float c(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public final double a(double var1, double var3, float var5) {
      return var1 + (var3 - var1) * var5;
   }

   public final int b(int var1, int var2, float var3) {
      return var1 + (int)((var2 - var1) * var3);
   }

   public final float b(int var1, int var2, int var3) {
      return (float)(var3 - var1) / (var2 - var1);
   }

   public final float d(float var1, float var2, float var3) {
      return (var3 - var1) / (var2 - var1);
   }

   public final double c(double var1) {
      return var1 * (180.0 / Math.PI);
   }

   public final double d(double var1) {
      return var1 / (180.0 / Math.PI);
   }

   public final float f(float var1) {
      return var1 / (float) (180.0 / Math.PI);
   }

   public final double a(@NotNull Vec3 var1, @NotNull Vec3 var2, @NotNull Vec3 var3) {
      short var10001 = 21783;
      short var10002 = 21901;
      Intrinsics.checkNotNullParameter(var1, "start");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      var10002 = 21779;
      short var10003 = -24440;
      Intrinsics.checkNotNullParameter(var2, "end");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;
      var10001 = 21760;
      var10002 = 4575;
      Intrinsics.checkNotNullParameter(var3, "from");
      Vec3 var11 = var2.subtract(var1);
      var10002 = 21785;
      var10003 = -15160;
      Intrinsics.checkNotNullExpressionValue(var11, "subtract(...)");
      Vec3 var5 = var11;
      Vec3 var12 = var3.subtract(var1);
      var10002 = 21781;
      var10003 = -1553;
      Intrinsics.checkNotNullExpressionValue(var12, "subtract(...)");
      Vec3 var6 = var12;
      double var7 = var5.x * var5.x + var5.y * var5.y + var5.z * var5.z;
      double var9 = var6.x * var5.x + var6.y * var5.y + var6.z * var5.z;
      double var21;
      int var13 = (var21 = var7 - 0.0) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      if (var4 == null) {
         var13 = (((var13 == 0) ? 1 : 0));
      }

      return (var13 != 0) ? 1.0 : var9 / var7;
   }

   public final double b(@NotNull Vec3 var1, @NotNull Vec3 var2, @NotNull Vec3 var3) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = 21764;
      short var10003 = 7471;
      Intrinsics.checkNotNullParameter(var1, "p1");
      var10002 = 21771;
      var10003 = 17171;
      Intrinsics.checkNotNullParameter(var2, "p2");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;
      short var10001 = 21784;
      var10002 = 28435;
      Intrinsics.checkNotNullParameter(var3, "p3");
      double var5 = var2.x - var1.x;
      double var7 = var2.z - var1.z;
      double var9 = var3.x - var2.x;
      double var11 = var3.z - var2.z;
      double var13 = var5 * var9 + var7 * var11;
      double var15 = Math.sqrt(var5 * var5 + var7 * var7);
      double var17 = Math.sqrt(var9 * var9 + var11 * var11);
      double var26;
      int var21 = (var26 = var15 - 0.0) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
      if (var4 == null) {
         var21 = (((var21 == 0) ? 1 : 0));
      }

      if ((var21 == 0)) {
         double var27;
         int var22 = (var27 = var17 - 0.0) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
         if (var4 == null) {
            var22 = (((var22 == 0) ? 1 : 0));
         }

         if ((var22 == 0)) {
            double var19 = RangesKt.coerceIn(var13 / (var15 * var17), -1.0, 1.0);
            return this.c(Math.acos(var19));
         }
      }

      return 0.0;
   }

   public final double c(@NotNull Vec3 var1, @NotNull Vec3 var2, @NotNull Vec3 var3) {
      short var10001 = 21760;
      short var10002 = 4575;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = 21769;
      var10002 = 30130;
      Intrinsics.checkNotNullParameter(var2, "to");
      var10001 = 21782;
      var10002 = -27288;
      Intrinsics.checkNotNullParameter(var3, "position");
      float var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, var2)
         .a();
      double var9 = var5;
      boolean var11 = false;
      Vec3 var6 = new Vec3(
         Math.sin(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var9 + 180.0)),
         0.0,
         -Math.cos(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var9 + 180.0))
      );
      b();
      double var7 = var2.x - var3.x;
      double var10 = 0.0;
      double var12 = var2.z - var3.z;
      Vec3 var14 = new Vec3(var6.x, 0.0, var6.z);
      Vec3 var10000 = new Vec3(var7, var10, var12).cross(var14);
      var10002 = 21766;
      short var10003 = 3350;
      Intrinsics.checkNotNullExpressionValue(var10000, "cross(...)");
      Vec3 var15 = var10000;
      double var16 = Math.sqrt(Math.pow(var15.x, 2) + Math.pow(var15.y, 2) + Math.pow(var15.z, 2));
      double var18 = Math.sqrt(Math.pow(var14.x, 2) + Math.pow(var14.y, 2) + Math.pow(var14.z, 2));
      double var20 = var16 / var18;
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]);
      }

      return var20;
   }

   @NotNull
   public final AABB a(@NotNull Vec3 var1, double var2) {
      short var10001 = 21768;
      short var10002 = -27740;
      Intrinsics.checkNotNullParameter(var1, "center");
      double var4 = var1.x;
      double var6 = var1.y;
      double var8 = var1.z;
      double var10 = var2 / Math.sqrt(2.0);
      double var12 = var4 - var10;
      double var14 = var8 - var10;
      double var16 = var4 + var10;
      double var18 = var8 + var10;
      return new AABB(var12, var6 - 0.5, var14, var16, var6 + 0.5, var18);
   }

   public final boolean a(@NotNull Vec3 var1, @NotNull Vec3 var2, @NotNull Vec3 var3, @NotNull Vec3 var4) {
      Object var28 = null; // PX-FIX
      Intrinsics.checkNotNullParameter(var1, "a");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      Intrinsics.checkNotNullParameter(var2, "b");
      Intrinsics.checkNotNullParameter(var3, "d");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = var10000;
      Intrinsics.checkNotNullParameter(var4, "e");
      double var6 = var2.x - var1.x;
      double var8 = var2.z - var1.z;
      double var10 = var3.x - var1.x;
      double var12 = var3.z - var1.z;
      double var14 = var4.x - var1.x;
      double var16 = var4.z - var1.z;
      double var18 = var6 * var6 + var8 * var8;
      double var20 = var10 * var10 + var12 * var12;
      double var30;
      int var26 = (var30 = var18 - 0.0) == 0.0 ? 0 : (var30 < 0.0 ? -1 : 1);
      if (var5 == null) {
         var26 = (((var26 == 0) ? 1 : 0));
      }

      if ((var26 == 0)) {
         double var31;
         int var27 = (var31 = var20 - 0.0) == 0.0 ? 0 : (var31 < 0.0 ? -1 : 1);
         if (var5 == null) {
            var27 = (((var27 == 0) ? 1 : 0));
         }

         if ((var27 == 0)) {
            double var24;
            label58: {
               double var22 = (var14 * var6 + var16 * var8) / var18;
               var24 = (var14 * var10 + var16 * var12) / var20;
               double var32;
               var28 = (var32 = 0.0 - var22) == 0.0 ? 0 : (var32 < 0.0 ? -1 : 1);
               if (var5 == null) {
                  if (((Boolean)var28)) {
                     var28 = 0;
                     break label58;
                  }

                  double var33;
                  var28 = (var33 = var22 - 1.0) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
               }

               if (var5 == null) {
                  var28 = ((Boolean)var28) ? 1 : 0;
               }
            }

            if (!((Boolean)var28)) {
               double var34;
               int var29 = (var34 = var24 - 0.0) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
               if (var5 == null) {
                  if (var29 < 0) {
                     return (0 != 0);
                  }

                  double var35;
                  var29 = (var35 = var24 - 1.0) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
               }

               if (var5 != null) {
                  return (var29 != 0);
               }

               if (var29 <= 0) {
                  return (1 != 0);
               }
            }

            return (0 != 0);
         }
      }

      return false;
   }

   public final float d(float var1, float var2) {
      float var3 = Math.min(var1, var2);
      return Random.Default.nextFloat() * (Math.max(var1, var2) - var3) + var3;
   }

   public final int c(int var1, int var2) {
      return RangesKt.random(new IntRange(var1, var2), (Random)Random.Default);
   }

   public final double d(double var1, double var3) {
      return Math.sqrt(var1 * var1 + var3 * var3);
   }

   @JvmStatic
   public static final float g(float var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, 0.0F, 1.0F);
   }

   @JvmStatic
   public static final float h(float var0) {
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   @JvmStatic
   public static final float e(float var0, float var1, float var2) {
      float var3 = var1 - var0;
      float var4 = h(var2);
      return var0 + var3 * var4;
   }

   @JvmStatic
   @NotNull
   public static final Vec3 a(@NotNull Vec3 var0, @NotNull Vec3 var1, @NotNull Vec3 var2, @NotNull Vec3 var3, double var4) {
      short var10001 = 21788;
      short var10002 = -15886;
      Intrinsics.checkNotNullParameter(var0, "p0");
      var10001 = 21774;
      var10002 = -9495;
      Intrinsics.checkNotNullParameter(var1, "p1");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      var10002 = 21770;
      short var10003 = -22270;
      Intrinsics.checkNotNullParameter(var2, "p2");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6 = var10000;
      var10001 = 21780;
      var10002 = 19278;
      Intrinsics.checkNotNullParameter(var3, "p3");
      double var7 = var4 * var4;
      double var9 = var7 * var4;
      Vec3 var11 = new Vec3(
         0.5
            * (
               2.0 * var1.x
                  + (-var0.x + var2.x) * var4
                  + (2.0 * var0.x - 5.0 * var1.x + 4.0 * var2.x - var3.x) * var7
                  + (-var0.x + 3.0 * var1.x - 3.0 * var2.x + var3.x) * var9
            ),
         0.5
            * (
               2.0 * var1.y
                  + (-var0.y + var2.y) * var4
                  + (2.0 * var0.y - 5.0 * var1.y + 4.0 * var2.y - var3.y) * var7
                  + (-var0.y + 3.0 * var1.y - 3.0 * var2.y + var3.y) * var9
            ),
         0.5
            * (
               2.0 * var1.z
                  + (-var0.z + var2.z) * var4
                  + (2.0 * var0.z - 5.0 * var1.z + 4.0 * var2.z - var3.z) * var7
                  + (-var0.z + 3.0 * var1.z - 3.0 * var2.z + var3.z) * var9
            )
      );
      if (var6 != null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }

      return var11;
   }

   @JvmStatic
   @NotNull
   public static final String a(@NotNull Object var0) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      double var14;
      label101: {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
         short var10002 = 21765;
         short var10003 = 4861;
         Intrinsics.checkNotNullParameter(var0, "number");
         var1 = var10000;
         boolean var11 = var0 instanceof Integer;
         if (var1 == null) {
            if (var11) {
               var14 = ((Number)var0).intValue();
               break label101;
            }

            var11 = var0 instanceof Float;
         }

         if (var1 == null) {
            if (var11) {
               var14 = ((Number)var0).floatValue();
               break label101;
            }

            var11 = var0 instanceof Long;
         }

         if (var1 == null) {
            if (var11) {
               var14 = ((Number)var0).longValue();
               break label101;
            }

            var11 = var0 instanceof Double;
         }

         if (var1 == null) {
            if (var11) {
               var14 = ((Number)var0).doubleValue();
               break label101;
            }

            if (var1 != null) {
               return var0.toString();
            }

            var11 = var0 instanceof String;
         }

         if (!var11) {
            return var0.toString();
         }

         Double var13 = StringsKt.toDoubleOrNull(StringsKt.replace((String)var0, ",", ".", false));
         if (var1 != null) {
            return ((String)(Object)var13).toString();
         }

         if (var13 == null) {
            return ((String)var0).toString();
         }

         var14 = var13;
      }

      double var2 = var14;
      double var28;
      int var15 = (var28 = var2 - 1.0E9) == 0.0 ? 0 : (var28 < 0.0 ? -1 : 1);
      if (var1 == null) {
         if (var15 >= 0) {
            short var19 = 21773;
            short var21 = 8811;
            String var8 = "%.2fB";
            Object[] var10 = new Object[]{var2 / 1000000000};
            String var33 = String.format(var8, Arrays.copyOf(var10, var10.length));
            short var24 = 21775;
            short var27 = -27320;
            Intrinsics.checkNotNullExpressionValue(var33, "format(...)");
            return var33;
         }

         double var29;
         var15 = (var29 = var2 - 1000000.0) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
      }

      if (var1 == null) {
         if (var15 >= 0) {
            short var18 = 21776;
            short var20 = 23051;
            String var7 = "%.2fM";
            Object[] var9 = new Object[]{var2 / 1000000};
            String var32 = String.format(var7, Arrays.copyOf(var9, var9.length));
            short var23 = 21763;
            short var26 = -25566;
            Intrinsics.checkNotNullExpressionValue(var32, "format(...)");
            return var32;
         }

         double var30;
         var15 = (var30 = var2 - 1000.0) == 0.0 ? 0 : (var30 < 0.0 ? -1 : 1);
      }

      if (var1 == null) {
         if (var15 >= 0) {
            short var17 = 21777;
            short var10001 = -29330;
            String var5 = "%.2fK";
            Object[] var6 = new Object[]{var2 / 1000};
            String var16 = String.format(var5, Arrays.copyOf(var6, var6.length));
            short var22 = 21763;
            short var25 = -25566;
            Intrinsics.checkNotNullExpressionValue(var16, "format(...)");
            return var16;
         }

         double var31;
         var15 = (var31 = var2 % 1 - 0.0) == 0.0 ? 0 : (var31 < 0.0 ? -1 : 1);
      }

      if (var1 == null) {
         var15 = var15 == 0 ? 1 : 0;
      }

      return var15 != 0 ? String.valueOf((int)var2) : String.valueOf(var2);
   }

   public final double a(double var1, int var3) {
      return MathKt.roundToLong(var1 * Math.pow(10.0, var3)) / Math.pow(10.0, var3);
   }

   @JvmStatic
   @NotNull
   public static final List<Vec3> a(@NotNull List<? extends Vec3> param0, double param1, int param3, @Nullable Function1<? super Vec3, Boolean> param4) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = b();
      Intrinsics.checkNotNullParameter(param0, "waypoints");
      if (param0.isEmpty()) {
         return kotlin.collections.CollectionsKt.emptyList();
      }
      if (param0.size() < 2) {
         return kotlin.collections.CollectionsKt.listOf(param0.get(0));
      }
      java.util.ArrayList<Vec3> var6 = new java.util.ArrayList<>();
      try {
         for (int var7 = 0, var8 = ((java.util.Collection<?>)(java.lang.Iterable<?>)param0).size(); var7 < var8; var7++) {
            Vec3 var9 = param0.get(var7 != 0 ? var7 - 1 : param0.size() - 1);
            Vec3 var10 = param0.get(var7);
            Vec3 var11 = param0.get((var7 + 1) % param0.size());
            Vec3 var12 = param0.get((var7 + 2) % param0.size());
            double var13 = var10.distanceTo(var11);
            if (Double.isNaN(var13)) {
               continue;
            }
            if (Double.isInfinite(var13)) {
               continue;
            }
            if (var13 < 0.0) {
               continue;
            }
            int var15 = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int)(var13 / param1), param3), 1000);
            for (int var16 = 0; var16 < var15; var16++) {
               double var17 = (double)var16 / (double)var15;
               if (Double.isNaN(var17)) {
                  continue;
               }
               if (Double.isInfinite(var17)) {
                  continue;
               }
               Vec3 var19 = a(var9, var10, var11, var12, var17);
               if (Double.isNaN(var19.x)) {
                  continue;
               }
               if (Double.isNaN(var19.y)) {
                  continue;
               }
               if (Double.isNaN(var19.z)) {
                  continue;
               }
               if (Double.isInfinite(var19.x)) {
                  continue;
               }
               if (Double.isInfinite(var19.y)) {
                  continue;
               }
               if (Double.isInfinite(var19.z)) {
                  continue;
               }
               if (param4 != null && !param4.invoke(var19)) {
                  continue;
               }
               var6.add(var19);
            }
         }
      } catch (Exception var7b) {
         return (java.util.List<Vec3>)(java.util.Collection<? extends Vec3>)(var6.isEmpty() ? param0 : var6);
      }
      return (java.util.List<Vec3>)(java.util.Collection<? extends Vec3>)(var6.isEmpty() ? param0 : var6);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: aload 0
      // 004: sipush 21762
      // 007: sipush 9274
      // 00a: pop2
      // 00b: ldc_w "waypoints"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 5
      // 013: aload 0
      // 014: invokeinterface java/util/List.isEmpty ()Z 1
      // 019: aload 5
      // 01b: ifnonnull 042
      // 01e: ifeq 030
      // 021: goto 028
      // 024: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 02b: areturn
      // 02c: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aload 0
      // 031: aload 5
      // 033: ifnonnull 057
      // 036: invokeinterface java/util/List.size ()I 1
      // 03b: goto 042
      // 03e: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: bipush 2
      // 043: if_icmpge 058
      // 046: aload 0
      // 047: bipush 0
      // 048: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 04d: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
      // 050: goto 057
      // 053: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: areturn
      // 058: new java/util/ArrayList
      // 05b: dup
      // 05c: invokespecial java/util/ArrayList.<init> ()V
      // 05f: astore 6
      // 061: nop
      // 062: bipush 0
      // 063: istore 7
      // 065: aload 0
      // 066: checkcast java/util/Collection
      // 069: invokeinterface java/util/Collection.size ()I 1
      // 06e: istore 8
      // 070: iload 7
      // 072: iload 8
      // 074: if_icmpge 2b9
      // 077: aload 0
      // 078: aload 5
      // 07a: ifnonnull 2da
      // 07d: iload 7
      // 07f: aload 5
      // 081: ifnonnull 0a6
      // 084: goto 08b
      // 087: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: ifne 0a4
      // 08e: goto 095
      // 091: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: aload 0
      // 096: invokeinterface java/util/List.size ()I 1
      // 09b: bipush 1
      // 09c: isub
      // 09d: goto 0a8
      // 0a0: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: iload 7
      // 0a6: bipush 1
      // 0a7: isub
      // 0a8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ad: checkcast net/minecraft/world/phys/Vec3
      // 0b0: astore 9
      // 0b2: aload 0
      // 0b3: iload 7
      // 0b5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ba: checkcast net/minecraft/world/phys/Vec3
      // 0bd: astore 10
      // 0bf: aload 0
      // 0c0: iload 7
      // 0c2: bipush 1
      // 0c3: iadd
      // 0c4: aload 0
      // 0c5: invokeinterface java/util/List.size ()I 1
      // 0ca: irem
      // 0cb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d0: checkcast net/minecraft/world/phys/Vec3
      // 0d3: astore 11
      // 0d5: aload 0
      // 0d6: iload 7
      // 0d8: bipush 2
      // 0d9: iadd
      // 0da: aload 0
      // 0db: invokeinterface java/util/List.size ()I 1
      // 0e0: irem
      // 0e1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e6: checkcast net/minecraft/world/phys/Vec3
      // 0e9: astore 12
      // 0eb: aload 10
      // 0ed: aload 11
      // 0ef: invokevirtual net/minecraft/world/phys/Vec3.distanceTo (Lnet/minecraft/world/phys/Vec3;)D
      // 0f2: dstore 13
      // 0f4: aload 5
      // 0f6: ifnonnull 292
      // 0f9: dload 13
      // 0fb: invokestatic java/lang/Double.isNaN (D)Z
      // 0fe: ifne 28f
      // 101: goto 108
      // 104: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: dload 13
      // 10a: invokestatic java/lang/Double.isInfinite (D)Z
      // 10d: aload 5
      // 10f: ifnonnull 12e
      // 112: goto 119
      // 115: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: ifne 28f
      // 11c: goto 123
      // 11f: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: dload 13
      // 125: dconst_0
      // 126: dcmpg
      // 127: goto 12e
      // 12a: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: aload 5
      // 130: ifnonnull 14f
      // 133: ifge 140
      // 136: goto 13d
      // 139: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: goto 28f
      // 140: dload 13
      // 142: dload 1
      // 143: ddiv
      // 144: d2i
      // 145: iload 3
      // 146: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 149: sipush 1000
      // 14c: invokestatic kotlin/ranges/RangesKt.coerceAtMost (II)I
      // 14f: istore 15
      // 151: bipush 0
      // 152: istore 16
      // 154: iload 16
      // 156: iload 15
      // 158: if_icmpge 28f
      // 15b: iload 16
      // 15d: i2d
      // 15e: iload 15
      // 160: i2d
      // 161: ddiv
      // 162: dstore 17
      // 164: aload 5
      // 166: ifnonnull 28a
      // 169: dload 17
      // 16b: invokestatic java/lang/Double.isNaN (D)Z
      // 16e: aload 5
      // 170: ifnonnull 072
      // 173: goto 17a
      // 176: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: ifne 287
      // 17d: dload 17
      // 17f: invokestatic java/lang/Double.isInfinite (D)Z
      // 182: ifeq 193
      // 185: goto 18c
      // 188: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: goto 287
      // 18f: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: aload 9
      // 195: aload 10
      // 197: aload 11
      // 199: aload 12
      // 19b: dload 17
      // 19d: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;
      // 1a0: astore 19
      // 1a2: aload 5
      // 1a4: ifnonnull 28a
      // 1a7: aload 19
      // 1a9: getfield net/minecraft/world/phys/Vec3.x D
      // 1ac: invokestatic java/lang/Double.isNaN (D)Z
      // 1af: ifne 287
      // 1b2: goto 1b9
      // 1b5: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: aload 19
      // 1bb: getfield net/minecraft/world/phys/Vec3.y D
      // 1be: invokestatic java/lang/Double.isNaN (D)Z
      // 1c1: aload 5
      // 1c3: ifnonnull 1e6
      // 1c6: goto 1cd
      // 1c9: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: ifne 287
      // 1d0: goto 1d7
      // 1d3: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: aload 19
      // 1d9: getfield net/minecraft/world/phys/Vec3.z D
      // 1dc: invokestatic java/lang/Double.isNaN (D)Z
      // 1df: goto 1e6
      // 1e2: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e5: athrow
      // 1e6: aload 5
      // 1e8: ifnonnull 200
      // 1eb: ifeq 1f8
      // 1ee: goto 1f5
      // 1f1: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: goto 287
      // 1f8: aload 19
      // 1fa: getfield net/minecraft/world/phys/Vec3.x D
      // 1fd: invokestatic java/lang/Double.isInfinite (D)Z
      // 200: aload 5
      // 202: ifnonnull 21e
      // 205: ifne 287
      // 208: goto 20f
      // 20b: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20e: athrow
      // 20f: aload 19
      // 211: getfield net/minecraft/world/phys/Vec3.y D
      // 214: invokestatic java/lang/Double.isInfinite (D)Z
      // 217: goto 21e
      // 21a: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: aload 5
      // 220: ifnonnull 23c
      // 223: ifne 287
      // 226: goto 22d
      // 229: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: aload 19
      // 22f: getfield net/minecraft/world/phys/Vec3.z D
      // 232: invokestatic java/lang/Double.isInfinite (D)Z
      // 235: goto 23c
      // 238: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: ifeq 242
      // 23f: goto 287
      // 242: aload 4
      // 244: aload 5
      // 246: ifnonnull 263
      // 249: ifnull 278
      // 24c: goto 253
      // 24f: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: aload 4
      // 255: aload 19
      // 257: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 25c: goto 263
      // 25f: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 262: athrow
      // 263: checkcast java/lang/Boolean
      // 266: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 269: aload 5
      // 26b: ifnonnull 286
      // 26e: ifeq 287
      // 271: goto 278
      // 274: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 277: athrow
      // 278: aload 6
      // 27a: aload 19
      // 27c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 27f: goto 286
      // 282: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: pop
      // 287: iinc 16 1
      // 28a: aload 5
      // 28c: ifnull 154
      // 28f: iinc 7 1
      // 292: goto 070
      // 295: astore 7
      // 297: aload 6
      // 299: aload 5
      // 29b: ifnonnull 2b5
      // 29e: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 2a1: ifeq 2b3
      // 2a4: goto 2ab
      // 2a7: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: aload 0
      // 2ac: goto 2b8
      // 2af: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b2: athrow
      // 2b3: aload 6
      // 2b5: checkcast java/util/List
      // 2b8: areturn
      // 2b9: aload 6
      // 2bb: aload 5
      // 2bd: ifnonnull 2d7
      // 2c0: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 2c3: ifeq 2d5
      // 2c6: goto 2cd
      // 2c9: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: aload 0
      // 2ce: goto 2da
      // 2d1: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d4: athrow
      // 2d5: aload 6
      // 2d7: checkcast java/util/List
      // 2da: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[31];
      int var3 = 0;
      String var2 = "o¬\r'±\b\u0083\u0016s\u0002æ>\u009bÞý\u0081\u0004I\u0081·\u0099\t\u008aÁX\u0003\u001fE\u001a\u008c0\u0002ÿ¬\n¥öG\u008bRÜæ)@t\u0004k\u0004;Ë\u0006ëcS¼¯2\u0005Ê\u0012yÕ]\u0005WQÊ½-\u0004+\u0095û\u0018\u0003ÍB\u0087\u0002@l\ró¯\u0092@E\u000bhészwÁ´\bÇYfÚîî×F\u00059ªÈÇk\u0006¦ß&\\I\u009b\u0002,\u0086\u0002\u008eY\u0002[¥\u0006/4ËV¼o\u0005xÔ/\r\u0098\u0002.ð\u000b«³>\u0083Ñ\\ÀîB\u008b\u0090\u0004v0\u0098M\u0002ev\t:^4ìô\u0012íÃ4\u000bÃ83òprô+Ä3@\u0002}B";
      int var4 = "o¬\r'±\b\u0083\u0016s\u0002æ>\u009bÞý\u0081\u0004I\u0081·\u0099\t\u008aÁX\u0003\u001fE\u001a\u008c0\u0002ÿ¬\n¥öG\u008bRÜæ)@t\u0004k\u0004;Ë\u0006ëcS¼¯2\u0005Ê\u0012yÕ]\u0005WQÊ½-\u0004+\u0095û\u0018\u0003ÍB\u0087\u0002@l\ró¯\u0092@E\u000bhészwÁ´\bÇYfÚîî×F\u00059ªÈÇk\u0006¦ß&\\I\u009b\u0002,\u0086\u0002\u008eY\u0002[¥\u0006/4ËV¼o\u0005xÔ/\r\u0098\u0002.ð\u000b«³>\u0083Ñ\\ÀîB\u008b\u0090\u0004v0\u0098M\u0002ev\t:^4ìô\u0012íÃ4\u000bÃ83òprô+Ä3@\u0002}B"
         .length();
      char var1 = 2;
      b(null);
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 110;
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
                     case 0 -> 57;
                     case 1 -> 85;
                     case 2 -> 23;
                     case 3 -> 19;
                     case 4 -> 10;
                     case 5 -> 89;
                     default -> 125;
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
                     b = new String[31];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = Math.PI * 2;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = Math.sqrt(2.0);
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

                  var2 = "ìl`\u008eBµ\n_+¸\u0090\r\u001f\u00adñ\u0089Ï";
                  var4 = "ìl`\u008eBµ\n_+¸\u0090\r\u001f\u00adñ\u0089Ï".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 74;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] b() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 21784) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 73;
            case 1 -> 221;
            case 2 -> 241;
            case 3 -> 125;
            case 4 -> 74;
            case 5 -> 86;
            case 6 -> 154;
            case 7 -> 14;
            case 8 -> 135;
            case 9 -> 202;
            case 10 -> 240;
            case 11 -> 65;
            case 12 -> 151;
            case 13 -> 236;
            case 14 -> 173;
            case 15 -> 192;
            case 16 -> 210;
            case 17 -> 94;
            case 18 -> 110;
            case 19 -> 75;
            case 20 -> 16;
            case 21 -> 138;
            case 22 -> 19;
            case 23 -> 231;
            case 24 -> 233;
            case 25 -> 1;
            case 26 -> 20;
            case 27 -> 242;
            case 28 -> 96;
            case 29 -> 190;
            case 30 -> 158;
            case 31 -> 63;
            case 32 -> 176;
            case 33 -> 152;
            case 34 -> 59;
            case 35 -> 146;
            case 36 -> 43;
            case 37 -> 90;
            case 38 -> 68;
            case 39 -> 129;
            case 40 -> 243;
            case 41 -> 246;
            case 42 -> 213;
            case 43 -> 170;
            case 44 -> 199;
            case 45 -> 218;
            case 46 -> 56;
            case 47 -> 97;
            case 48 -> 139;
            case 49 -> 228;
            case 50 -> 127;
            case 51 -> 134;
            case 52 -> 44;
            case 53 -> 82;
            case 54 -> 191;
            case 55 -> 207;
            case 56 -> 203;
            case 57 -> 237;
            case 58 -> 249;
            case 59 -> 186;
            case 60 -> 248;
            case 61 -> 98;
            case 62 -> 209;
            case 63 -> 3;
            case 64 -> 34;
            case 65 -> 77;
            case 66 -> 36;
            case 67 -> 223;
            case 68 -> 84;
            case 69 -> 91;
            case 70 -> 70;
            case 71 -> 87;
            case 72 -> 172;
            case 73 -> 247;
            case 74 -> 120;
            case 75 -> 255;
            case 76 -> 201;
            case 77 -> 149;
            case 78 -> 101;
            case 79 -> 250;
            case 80 -> 7;
            case 81 -> 214;
            case 82 -> 166;
            case 83 -> 169;
            case 84 -> 38;
            case 85 -> 109;
            case 86 -> 156;
            case 87 -> 72;
            case 88 -> 33;
            case 89 -> 22;
            case 90 -> 175;
            case 91 -> 155;
            case 92 -> 80;
            case 93 -> 208;
            case 94 -> 35;
            case 95 -> 104;
            case 96 -> 45;
            case 97 -> 118;
            case 98 -> 204;
            case 99 -> 161;
            case 100 -> 25;
            case 101 -> 78;
            case 102 -> 9;
            case 103 -> 107;
            case 104 -> 66;
            case 105 -> 76;
            case 106 -> 235;
            case 107 -> 58;
            case 108 -> 71;
            case 109 -> 32;
            case 110 -> 112;
            case 111 -> 150;
            case 112 -> 197;
            case 113 -> 116;
            case 114 -> 133;
            case 115 -> 153;
            case 116 -> 0;
            case 117 -> 229;
            case 118 -> 27;
            case 119 -> 206;
            case 120 -> 130;
            case 121 -> 224;
            case 122 -> 119;
            case 123 -> 163;
            case 124 -> 217;
            case 125 -> 50;
            case 126 -> 131;
            case 127 -> 159;
            case 128 -> 49;
            case 129 -> 253;
            case 130 -> 230;
            case 131 -> 115;
            case 132 -> 132;
            case 133 -> 245;
            case 134 -> 232;
            case 135 -> 85;
            case 136 -> 105;
            case 137 -> 171;
            case 138 -> 17;
            case 139 -> 126;
            case 140 -> 13;
            case 141 -> 165;
            case 142 -> 140;
            case 143 -> 160;
            case 144 -> 136;
            case 145 -> 88;
            case 146 -> 227;
            case 147 -> 198;
            case 148 -> 48;
            case 149 -> 187;
            case 150 -> 184;
            case 151 -> 183;
            case 152 -> 95;
            case 153 -> 141;
            case 154 -> 137;
            case 155 -> 93;
            case 156 -> 179;
            case 157 -> 83;
            case 158 -> 211;
            case 159 -> 12;
            case 160 -> 167;
            case 161 -> 11;
            case 162 -> 162;
            case 163 -> 23;
            case 164 -> 24;
            case 165 -> 52;
            case 166 -> 99;
            case 167 -> 40;
            case 168 -> 26;
            case 169 -> 67;
            case 170 -> 10;
            case 171 -> 123;
            case 172 -> 92;
            case 173 -> 200;
            case 174 -> 164;
            case 175 -> 111;
            case 176 -> 117;
            case 177 -> 144;
            case 178 -> 64;
            case 179 -> 188;
            case 180 -> 108;
            case 181 -> 28;
            case 182 -> 220;
            case 183 -> 182;
            case 184 -> 205;
            case 185 -> 238;
            case 186 -> 53;
            case 187 -> 239;
            case 188 -> 103;
            case 189 -> 124;
            case 190 -> 21;
            case 191 -> 61;
            case 192 -> 244;
            case 193 -> 4;
            case 194 -> 37;
            case 195 -> 219;
            case 196 -> 222;
            case 197 -> 178;
            case 198 -> 128;
            case 199 -> 100;
            case 200 -> 54;
            case 201 -> 69;
            case 202 -> 168;
            case 203 -> 157;
            case 204 -> 79;
            case 205 -> 62;
            case 206 -> 189;
            case 207 -> 114;
            case 208 -> 212;
            case 209 -> 55;
            case 210 -> 102;
            case 211 -> 57;
            case 212 -> 216;
            case 213 -> 143;
            case 214 -> 177;
            case 215 -> 15;
            case 216 -> 60;
            case 217 -> 89;
            case 218 -> 39;
            case 219 -> 142;
            case 220 -> 46;
            case 221 -> 193;
            case 222 -> 113;
            case 223 -> 225;
            case 224 -> 196;
            case 225 -> 181;
            case 226 -> 180;
            case 227 -> 5;
            case 228 -> 145;
            case 229 -> 81;
            case 230 -> 226;
            case 231 -> 251;
            case 232 -> 254;
            case 233 -> 31;
            case 234 -> 121;
            case 235 -> 148;
            case 236 -> 185;
            case 237 -> 8;
            case 238 -> 29;
            case 239 -> 30;
            case 240 -> 234;
            case 241 -> 18;
            case 242 -> 195;
            case 243 -> 194;
            case 244 -> 6;
            case 245 -> 2;
            case 246 -> 41;
            case 247 -> 47;
            case 248 -> 215;
            case 249 -> 122;
            case 250 -> 106;
            case 251 -> 42;
            case 252 -> 174;
            case 253 -> 51;
            case 254 -> 252;
            default -> 147;
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

   public static double a(IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var0, Vec3 var1, Vec3 var2, Vec3 var3, boolean var4, int var5, Object var6) {
      Object var7 = b();
      if ((var5 & 8) != 0 && var7 == null) {
         var4 = true;
      }

      return var0.a(var1, var2, var3, var4);
   }

   public static double a(IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var0, Vec3 var1, Vec3 var2, Vec3 var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      }

      return var0.c(var1, var2, var3);
   }

   public static List a(java.util.List var0, double var1, int var3, Function1 var4, int var5, Object var6) {
      Object var7 = b();
      if ((var5 & 2) != 0 && var7 == null) {
         var1 = 0.4D;
      }

      if ((var5 & 4) != 0 && var7 == null) {
         var3 = 5;
      }

      if ((var5 & 8) != 0) {
         var4 = null;
      }

      return a(var0, var1, var3, var4);
   }
}
