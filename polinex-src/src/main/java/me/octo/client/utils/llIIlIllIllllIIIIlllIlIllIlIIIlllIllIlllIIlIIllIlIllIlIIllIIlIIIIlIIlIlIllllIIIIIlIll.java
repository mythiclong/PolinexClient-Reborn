package me.octo.client.utils;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

   @NotNull
   public static llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll() {
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      float var2,
      boolean var3,
      float var4
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = 16042;
      short var10003 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      Vec3 var9 = var0.getPosition(var4);
      var10003 = 16034;
      short var10004 = 11258;
      Intrinsics.checkNotNullExpressionValue(var9, "getPosition(...)");
      Vec3 var6 = var9;
      int[] var5 = var10000;
      AABB var8 = var0.getBoundingBox().move(var6.x - var0.getX(), var6.y - var0.getY(), var6.z - var0.getZ());
      var10002 = 16046;
      var10003 = 19065;
      Intrinsics.checkNotNullExpressionValue(var8, "move(...)");
      AABB var7 = var8;
      boolean var14 = var3;
      if (var5 != null) {
         var14 = !var3;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var7, var1, var2, var14);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Entity var0, int var1, float var2) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, true, 0.0F, 16, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = 16044;
      short var10003 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      int[] var3 = var10000;
      short var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      AABB var5 = var0.getBoundingBox();
      var10002 = 16038;
      var10003 = -21723;
      Intrinsics.checkNotNullExpressionValue(var5, "getBoundingBox(...)");
      AABB var4 = var5;
      boolean var8 = var2;
      if (var3 != null) {
         var8 = !var2;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var4, var1, var8);
   }

   @JvmStatic
   public static final void a(@NotNull Entity var0, int var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), true);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      AABB var10000 = var0.getBoundingBox();
      var10002 = 16038;
      short var10003 = -21723;
      Intrinsics.checkNotNullExpressionValue(var10000, "getBoundingBox(...)");
      AABB var3 = var10000;
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var3, var1, false);
   }

   @JvmStatic
   public static final void b(@NotNull Entity var0, int var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      b(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), true);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, float var3
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      Vec3 var10000 = var0.getPosition(var3);
      var10002 = 16036;
      short var10003 = 16993;
      Intrinsics.checkNotNullExpressionValue(var10000, "getPosition(...)");
      Vec3 var4 = var10000;
      AABB var6 = var0.getBoundingBox().move(var4.x - var0.getX(), var4.y - var0.getY(), var4.z - var0.getZ());
      var10002 = 16045;
      var10003 = -30728;
      Intrinsics.checkNotNullExpressionValue(var6, "move(...)");
      AABB var5 = var6;
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var5, var1.a(0.3F), false);
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var5, var1, var2, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(@NotNull Entity var0, int var1, float var2) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, 0.0F, 8, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3,
      boolean var4
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = 16044;
      short var10003 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10002 = 16047;
      var10003 = -17597;
      Intrinsics.checkNotNullParameter(var1, "outlineColor");
      var10002 = 16041;
      var10003 = -2133;
      Intrinsics.checkNotNullParameter(var2, "fillColor");
      int[] var5 = var10000;
      AABB var7 = var0.getBoundingBox();
      var10002 = 16038;
      var10003 = -21723;
      Intrinsics.checkNotNullExpressionValue(var7, "getBoundingBox(...)");
      AABB var6 = var7;
      boolean var11 = var4;
      if (var5 != null) {
         var11 = !var4;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var6, var2, var11);
      boolean var15 = var4;
      if (var5 != null) {
         var15 = !var4;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var6, var1, var3, var15);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3, int var4
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      AABB var10000 = var0.getBoundingBox();
      var10002 = 16033;
      short var10003 = -14932;
      Intrinsics.checkNotNullExpressionValue(var10000, "getBoundingBox(...)");
      AABB var6 = var10000;
      int[] var13 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      float var7 = var1.t();
      int var8 = 1;
      int[] var5 = var13;
      int var14 = var8;
      if (var5 != null) {
         if (var8 > var2) {
            return;
         }

         var14 = var8;
      }

      while (true) {
         double var9 = var14 * 0.1;
         float var11 = var7 * (1.0F - (float)var8 / (var2 + 1));
         var10000 = var6.inflate(var9);
         var10002 = 16043;
         var10003 = 10860;
         Intrinsics.checkNotNullExpressionValue(var10000, "inflate(...)");
         AABB var12 = var10000;
         IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var12, var1.a(var11), false);
         if (var8 == var2) {
            break;
         }

         var8++;
         if (var5 == null) {
            break;
         }

         var14 = var8;
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Entity var0, int var1, int var2, int var3, int var4) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, var3, var4);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var1.a(0.3F), var2, true);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = 16042;
      short var10003 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      int[] var3 = var10000;
      if (var3 != null && IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player != null) {
         Vec3 var8 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().gameRenderer.getMainCamera().position();
         var10002 = 16032;
         var10003 = -31602;
         Intrinsics.checkNotNullExpressionValue(var8, "position(...)");
         Vec3 var5 = var8;
         Vec3 var9 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var0)
            .add(0.0, var0.getBbHeight() / 2.0, 0.0);
         var10002 = 16037;
         var10003 = 4734;
         Intrinsics.checkNotNullExpressionValue(var9, "add(...)");
         Vec3 var6 = var9;
         Vec3[] var7 = new Vec3[]{var5, var6};
         IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(CollectionsKt.listOf(var7), var1, false, var2);
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, var3, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, 0.0F, false, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(@NotNull Entity var0, int var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      b(var0, var1, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void d(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void d(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 16039;
      short var10002 = 27053;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16051;
      var10002 = -1892;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, 0.0F, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void d(@NotNull Entity var0, int var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      b(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16035;
      var10002 = -16866;
      Intrinsics.checkNotNullParameter(var1, "outlineColor");
      var10001 = 16040;
      var10002 = -10307;
      Intrinsics.checkNotNullParameter(var2, "fillColor");
      a(var0, var1, var2, var3, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16047;
      var10002 = -17597;
      Intrinsics.checkNotNullParameter(var1, "outlineColor");
      var10001 = 16041;
      var10002 = -2133;
      Intrinsics.checkNotNullParameter(var2, "fillColor");
      a(var0, var1, var2, 0.0F, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2
   ) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void e(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Entity var0, int var1, int var2, int var3) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull Entity var0, int var1, int var2) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void e(@NotNull Entity var0, int var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      a(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void f(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void g(@NotNull Entity var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = 16044;
      short var10002 = 31008;
      Intrinsics.checkNotNullParameter(var0, "entity");
      var10001 = 16042;
      var10002 = 27365;
      Intrinsics.checkNotNullParameter(var1, "color");
      b(var0, var1, 0.0F);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "\u009f\u0003\u0014b\nå\"\u0012Æ\u0014\u0080\n\u0010*q«\u0002ûOÖÎÓ]å\u001a\u0017\u0002i¦\u0013DËfGB±æÇ2oÐ\u0017ØÒÿ'í\u0094d\rÕ¦¦\u008a¦Z\u0003/îykñ\u0089\u0006cJÀ6\u008dÝ\u0013Ë%\u0097\u009a|\n!°Ê\u0081ÏÊ;i\u0083Pbz\u0095\b{¬Wà79a«\u0010\u008fÊ\u001fum¡\u0004\u0013\u0089æ®m~ìD{\fAb\u001b6³u\u001c2@TxS\u0005'Ð\u0096BZ\tBÿ\u009fbJäL?>\t]Î|D6 Ã§Ï\fU±M4!/GKj?\u0015o\t.\u0099baÇí¹6Ñ\tMº\u000e\u0005Ja\b§ç";
      int var4 = "\u009f\u0003\u0014b\nå\"\u0012Æ\u0014\u0080\n\u0010*q«\u0002ûOÖÎÓ]å\u001a\u0017\u0002i¦\u0013DËfGB±æÇ2oÐ\u0017ØÒÿ'í\u0094d\rÕ¦¦\u008a¦Z\u0003/îykñ\u0089\u0006cJÀ6\u008dÝ\u0013Ë%\u0097\u009a|\n!°Ê\u0081ÏÊ;i\u0083Pbz\u0095\b{¬Wà79a«\u0010\u008fÊ\u001fum¡\u0004\u0013\u0089æ®m~ìD{\fAb\u001b6³u\u001c2@TxS\u0005'Ð\u0096BZ\tBÿ\u009fbJäL?>\t]Î|D6 Ã§Ï\fU±M4!/GKj?\u0015o\t.\u0099baÇí¹6Ñ\tMº\u000e\u0005Ja\b§ç"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 31;
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
                     case 0 -> 85;
                     case 1 -> 51;
                     case 2 -> 71;
                     case 3 -> 47;
                     case 4 -> 15;
                     case 5 -> 63;
                     default -> 95;
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
                     d = new String[17];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
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

                  var2 = "á%ö½-Ê\u0005WÙþ\u00051";
                  var4 = "á%ö½-Ê\u0005WÙþ\u00051".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 61;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 16035) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 117;
            case 1 -> 57;
            case 2 -> 230;
            case 3 -> 193;
            case 4 -> 95;
            case 5 -> 172;
            case 6 -> 135;
            case 7 -> 142;
            case 8 -> 61;
            case 9 -> 14;
            case 10 -> 148;
            case 11 -> 10;
            case 12 -> 35;
            case 13 -> 118;
            case 14 -> 67;
            case 15 -> 207;
            case 16 -> 110;
            case 17 -> 124;
            case 18 -> 186;
            case 19 -> 176;
            case 20 -> 20;
            case 21 -> 213;
            case 22 -> 72;
            case 23 -> 76;
            case 24 -> 187;
            case 25 -> 66;
            case 26 -> 201;
            case 27 -> 154;
            case 28 -> 188;
            case 29 -> 183;
            case 30 -> 217;
            case 31 -> 211;
            case 32 -> 34;
            case 33 -> 125;
            case 34 -> 9;
            case 35 -> 131;
            case 36 -> 235;
            case 37 -> 28;
            case 38 -> 255;
            case 39 -> 192;
            case 40 -> 105;
            case 41 -> 97;
            case 42 -> 251;
            case 43 -> 153;
            case 44 -> 74;
            case 45 -> 39;
            case 46 -> 22;
            case 47 -> 158;
            case 48 -> 250;
            case 49 -> 46;
            case 50 -> 247;
            case 51 -> 240;
            case 52 -> 75;
            case 53 -> 165;
            case 54 -> 50;
            case 55 -> 93;
            case 56 -> 109;
            case 57 -> 254;
            case 58 -> 90;
            case 59 -> 219;
            case 60 -> 17;
            case 61 -> 166;
            case 62 -> 200;
            case 63 -> 64;
            case 64 -> 99;
            case 65 -> 134;
            case 66 -> 29;
            case 67 -> 116;
            case 68 -> 23;
            case 69 -> 129;
            case 70 -> 85;
            case 71 -> 69;
            case 72 -> 96;
            case 73 -> 253;
            case 74 -> 222;
            case 75 -> 232;
            case 76 -> 106;
            case 77 -> 198;
            case 78 -> 139;
            case 79 -> 19;
            case 80 -> 13;
            case 81 -> 163;
            case 82 -> 157;
            case 83 -> 152;
            case 84 -> 231;
            case 85 -> 212;
            case 86 -> 71;
            case 87 -> 8;
            case 88 -> 249;
            case 89 -> 41;
            case 90 -> 155;
            case 91 -> 228;
            case 92 -> 167;
            case 93 -> 31;
            case 94 -> 161;
            case 95 -> 70;
            case 96 -> 243;
            case 97 -> 5;
            case 98 -> 138;
            case 99 -> 77;
            case 100 -> 112;
            case 101 -> 221;
            case 102 -> 132;
            case 103 -> 171;
            case 104 -> 102;
            case 105 -> 199;
            case 106 -> 115;
            case 107 -> 103;
            case 108 -> 24;
            case 109 -> 215;
            case 110 -> 36;
            case 111 -> 26;
            case 112 -> 81;
            case 113 -> 88;
            case 114 -> 151;
            case 115 -> 18;
            case 116 -> 136;
            case 117 -> 147;
            case 118 -> 227;
            case 119 -> 218;
            case 120 -> 119;
            case 121 -> 229;
            case 122 -> 174;
            case 123 -> 223;
            case 124 -> 225;
            case 125 -> 3;
            case 126 -> 241;
            case 127 -> 128;
            case 128 -> 58;
            case 129 -> 63;
            case 130 -> 224;
            case 131 -> 6;
            case 132 -> 68;
            case 133 -> 208;
            case 134 -> 37;
            case 135 -> 44;
            case 136 -> 33;
            case 137 -> 52;
            case 138 -> 16;
            case 139 -> 62;
            case 140 -> 245;
            case 141 -> 236;
            case 142 -> 123;
            case 143 -> 196;
            case 144 -> 84;
            case 145 -> 113;
            case 146 -> 79;
            case 147 -> 104;
            case 148 -> 175;
            case 149 -> 144;
            case 150 -> 248;
            case 151 -> 169;
            case 152 -> 108;
            case 153 -> 197;
            case 154 -> 237;
            case 155 -> 53;
            case 156 -> 51;
            case 157 -> 12;
            case 158 -> 25;
            case 159 -> 159;
            case 160 -> 202;
            case 161 -> 220;
            case 162 -> 80;
            case 163 -> 160;
            case 164 -> 143;
            case 165 -> 190;
            case 166 -> 60;
            case 167 -> 170;
            case 168 -> 78;
            case 169 -> 59;
            case 170 -> 126;
            case 171 -> 180;
            case 172 -> 141;
            case 173 -> 15;
            case 174 -> 146;
            case 175 -> 205;
            case 176 -> 178;
            case 177 -> 27;
            case 178 -> 42;
            case 179 -> 252;
            case 180 -> 121;
            case 181 -> 2;
            case 182 -> 122;
            case 183 -> 226;
            case 184 -> 89;
            case 185 -> 101;
            case 186 -> 49;
            case 187 -> 7;
            case 188 -> 87;
            case 189 -> 239;
            case 190 -> 54;
            case 191 -> 65;
            case 192 -> 244;
            case 193 -> 98;
            case 194 -> 48;
            case 195 -> 4;
            case 196 -> 182;
            case 197 -> 191;
            case 198 -> 40;
            case 199 -> 55;
            case 200 -> 120;
            case 201 -> 0;
            case 202 -> 149;
            case 203 -> 86;
            case 204 -> 194;
            case 205 -> 242;
            case 206 -> 145;
            case 207 -> 127;
            case 208 -> 137;
            case 209 -> 184;
            case 210 -> 168;
            case 211 -> 11;
            case 212 -> 234;
            case 213 -> 100;
            case 214 -> 173;
            case 215 -> 133;
            case 216 -> 82;
            case 217 -> 181;
            case 218 -> 210;
            case 219 -> 150;
            case 220 -> 21;
            case 221 -> 238;
            case 222 -> 177;
            case 223 -> 91;
            case 224 -> 32;
            case 225 -> 233;
            case 226 -> 94;
            case 227 -> 1;
            case 228 -> 156;
            case 229 -> 107;
            case 230 -> 47;
            case 231 -> 73;
            case 232 -> 246;
            case 233 -> 45;
            case 234 -> 130;
            case 235 -> 204;
            case 236 -> 189;
            case 237 -> 179;
            case 238 -> 38;
            case 239 -> 185;
            case 240 -> 162;
            case 241 -> 206;
            case 242 -> 140;
            case 243 -> 214;
            case 244 -> 92;
            case 245 -> 195;
            case 246 -> 209;
            case 247 -> 56;
            case 248 -> 114;
            case 249 -> 164;
            case 250 -> 43;
            case 251 -> 111;
            case 252 -> 83;
            case 253 -> 203;
            case 254 -> 30;
            default -> 216;
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
   public static void a(net.minecraft.world.entity.Entity p0, int p1, float p2, int p3, java.lang.Object p4) {
      if ((p3 & 4) != 0) p2 = 2.0f;
      a(p0, p1, p2);
   }

   public static void a(net.minecraft.world.entity.Entity p0, int p1, int p2, int p3, int p4, int p5, java.lang.Object p6) {
      if ((p5 & 4) != 0) p2 = 2;
      if ((p5 & 8) != 0) p3 = 3;
      if ((p5 & 16) != 0) p4 = 5;
      a(p0, p1, p2, p3, p4);
   }

   public static void a(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, float p2, float p3, int p4, java.lang.Object p5) {
      if ((p4 & 4) != 0) p2 = 2.0f;
      if ((p4 & 8) != 0) p3 = 1.0f;
      a(p0, p1, p2, p3);
   }

   public static void a(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, float p2, int p3, java.lang.Object p4) {
      if ((p3 & 4) != 0) p2 = 2.0f;
      a(p0, p1, p2);
   }

   public static void a(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, float p2, boolean p3, float p4, int p5, java.lang.Object p6) {
      if ((p5 & 4) != 0) p2 = 3.0f;
      if ((p5 & 8) != 0) p3 = true;
      if ((p5 & 16) != 0) p4 = 1.0f;
      a(p0, p1, p2, p3, p4);
   }

   public static void a(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, int p2, int p3, int p4, int p5, java.lang.Object p6) {
      if ((p5 & 4) != 0) p2 = 2;
      if ((p5 & 8) != 0) p3 = 3;
      if ((p5 & 16) != 0) p4 = 5;
      a(p0, p1, p2, p3, p4);
   }

   public static void a(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p2, float p3, boolean p4, int p5, java.lang.Object p6) {
      if ((p5 & 8) != 0) p3 = 3.0f;
      if ((p5 & 16) != 0) p4 = true;
      a(p0, p1, p2, p3, p4);
   }

   public static void a(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, boolean p2, int p3, java.lang.Object p4) {
      if ((p3 & 4) != 0) p2 = true;
      a(p0, p1, p2);
   }

   public static void b(net.minecraft.world.entity.Entity p0, int p1, float p2, int p3, java.lang.Object p4) {
      if ((p3 & 4) != 0) p2 = 2.0f;
      b(p0, p1, p2);
   }

   public static void b(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, float p2, int p3, java.lang.Object p4) {
      if ((p3 & 4) != 0) p2 = 2.0f;
      b(p0, p1, p2);
   }

   public static void b(net.minecraft.world.entity.Entity p0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll p1, boolean p2, int p3, java.lang.Object p4) {
      if ((p3 & 4) != 0) p2 = true;
      b(p0, p1, p2);
   }

}
