package me.octo.client.utils;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl() {
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21489;
      short var10003 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      int[] var4 = var10000;
      short var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      AABB var5 = new AABB(var0);
      boolean var7 = var3;
      if (var4 != null) {
         var7 = !var3;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var5, var1, var2, var7);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull BlockPos var0, int var1, float var2) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, true);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21497;
      short var10003 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      int[] var4 = var10000;
      short var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      boolean var6 = var3;
      if (var4 != null) {
         var6 = !var3;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var0, var1, var2, var6);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0, int var1, float var2) {
      short var10001 = -21499;
      short var10002 = -22803;
      Intrinsics.checkNotNullParameter(var0, "box");
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(
         var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, true
      );
   }

   @JvmStatic
   public static final void a(
      @NotNull List<? extends BlockPos> var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      float var2,
      boolean var3
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21494;
      short var10003 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      int[] var4 = var10000;
      short var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");

      for (BlockPos var6 : var0) {
         a(var6, var1, var2, var3);
         if (var4 == null) {
            break;
         }
      }
   }

   @JvmStatic
   public static final void a(@NotNull List<? extends BlockPos> var0, int var1, float var2) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21494;
      short var10003 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      int[] var3 = var10000;

      for (BlockPos var5 : var0) {
         a(var5, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, true);
         if (var3 == null) {
            break;
         }
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21489;
      short var10003 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10002 = -21501;
      var10003 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      int[] var3 = var10000;
      AABB var4 = new AABB(var0);
      boolean var6 = var2;
      if (var3 != null) {
         var6 = !var2;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var4, var1, var6);
   }

   @JvmStatic
   public static final void a(@NotNull BlockPos var0, int var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), true);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2
   ) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = -21501;
      short var10003 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      int[] var3 = var10000;
      boolean var5 = var2;
      if (var3 != null) {
         var5 = !var2;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var0, var1, var5);
   }

   @JvmStatic
   public static final void a(@NotNull AABB var0, int var1) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(
         var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), true
      );
   }

   @JvmStatic
   public static final void a(
      @NotNull List<? extends BlockPos> var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2
   ) {
      short var10001 = -21494;
      short var10002 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = -21501;
      short var10003 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      Iterator var4 = var0.iterator();
      int[] var3 = var10000;

      while (var4.hasNext()) {
         BlockPos var5 = (BlockPos)var4.next();
         a(var5, var1, var2);
         if (var3 == null) {
            break;
         }
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(new AABB(var0), var1, false);
   }

   @JvmStatic
   public static final void b(@NotNull BlockPos var0, int var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      b(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), true);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      AABB var3 = new AABB(var0);
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var3, var1.a(0.3F), false);
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var3, var1, var2, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(@NotNull BlockPos var0, int var1, float var2) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3,
      boolean var4
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21489;
      short var10003 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      int[] var5 = var10000;
      short var10001 = -21502;
      var10002 = -4171;
      Intrinsics.checkNotNullParameter(var1, "outlineColor");
      var10001 = -21500;
      var10002 = 8860;
      Intrinsics.checkNotNullParameter(var2, "fillColor");
      AABB var6 = new AABB(var0);
      boolean var10 = var4;
      if (var5 != null) {
         var10 = !var4;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var6, var2, var10);
      boolean var11 = var4;
      if (var5 != null) {
         var11 = !var4;
      }

      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var6, var1, var3, var11);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3, int var4
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = -21501;
      short var10003 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      int[] var5 = var10000;
      AABB var6 = new AABB(var0);
      float var7 = var1.t();
      int var8 = 1;
      int var13 = var8;
      if (var5 != null) {
         if (var8 > var2) {
            return;
         }

         var13 = var8;
      }

      while (true) {
         double var9 = var13 * 0.1;
         float var11 = var7 * (1.0F - var8 * 0.5F / (var2 + 1));
         AABB var14 = var6.inflate(var9);
         var10002 = -21490;
         var10003 = 2846;
         Intrinsics.checkNotNullExpressionValue(var14, "inflate(...)");
         AABB var12 = var14;
         IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var12, var1.a(var11), false);
         if (var8 == var2) {
            break;
         }

         var8++;
         if (var5 == null) {
            break;
         }

         var13 = var8;
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull BlockPos var0, int var1, int var2, int var3, int var4) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, var3, var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3, int var4
   ) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = -21501;
      short var10003 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      float var6 = var1.t();
      int var7 = 1;
      int[] var5 = var10000;
      int var12 = var7;
      if (var5 != null) {
         if (var7 > var2) {
            return;
         }

         var12 = var7;
      }

      while (true) {
         double var8 = var12 * 0.1;
         float var10 = var6 * (1.0F - var7 * 0.5F / (var2 + 1));
         AABB var13 = var0.inflate(var8);
         var10002 = -21492;
         var10003 = -18451;
         Intrinsics.checkNotNullExpressionValue(var13, "inflate(...)");
         AABB var11 = var13;
         IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var11, var1.a(var10), false);
         if (var7 == var2) {
            break;
         }

         var7++;
         if (var5 == null) {
            break;
         }

         var12 = var7;
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0, int var1, int var2, int var3, int var4) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, var3, var4);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull List<? extends BlockPos> var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      int var2,
      int var3,
      int var4
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21494;
      short var10003 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      int[] var5 = var10000;
      short var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");

      for (BlockPos var7 : var0) {
         a(var7, var1, var2, var3, var4);
         if (var5 == null) {
            break;
         }
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull List<? extends BlockPos> var0, int var1, int var2, int var3, int var4) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21494;
      short var10003 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      int[] var5 = var10000;

      for (BlockPos var7 : var0) {
         a(var7, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), var2, var3, var4);
         if (var5 == null) {
            break;
         }
      }
   }

   @JvmStatic
   public static final void a(@NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(var0, var1);
   }

   @JvmStatic
   public static final void c(@NotNull BlockPos var0, int var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1));
   }

   @JvmStatic
   public static final void a(@NotNull Vec3[] var0, int var1, float var2) {
      short var10001 = -21503;
      short var10002 = 16622;
      Intrinsics.checkNotNullParameter(var0, "points");
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(
         ArraysKt.toList(var0), new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), false, var2
      );
   }

   @JvmStatic
   public static final void b(@NotNull List<? extends Vec3> var0, int var1, float var2) {
      short var10001 = -21503;
      short var10002 = 16622;
      Intrinsics.checkNotNullParameter(var0, "points");
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(
         var0, new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1), false, var2
      );
   }

   @JvmStatic
   public static final void a(
      @NotNull Vec3[] var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = -21498;
      short var10002 = 26530;
      Intrinsics.checkNotNullParameter(var0, "points");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = -21501;
      short var10003 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      int[] var3 = var10000;
      if (var3 != null) {
         if (IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .aA()) {
            return;
         }

         IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(ArraysKt.toList(var0), var1, false, var2);
      }
   }

   @JvmStatic
   public static final void b(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, true);
   }

   @JvmStatic
   public static final void a(
      @NotNull List<? extends BlockPos> var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21494;
      short var10003 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      int[] var3 = var10000;
      short var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");

      for (BlockPos var5 : var0) {
         a(var5, var1, var2, true);
         if (var3 == null) {
            break;
         }
      }
   }

   @JvmStatic
   public static final void a(
      @NotNull Vec3 var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, double var2
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(
         new AABB(var0.x, var0.y, var0.z, var0.x + 1, var0.y + 1, var0.z + 1), var1.a((float)var2), false
      );
   }

   @JvmStatic
   public static final void a(
      @NotNull List<? extends Vec3> var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, double var2
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -21494;
      short var10003 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      var10002 = -21501;
      var10003 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      int[] var4 = var10000;

      for (Vec3 var6 : var0) {
         a(var6, var1, var2);
         if (var4 == null) {
            break;
         }
      }
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(@NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, 0.0F, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void d(@NotNull BlockPos var0, int var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2
   ) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, 0.0F, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(@NotNull AABB var0, int var1) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(@NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void b(@NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void d(@NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      b(var0, var1, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void e(@NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void e(@NotNull BlockPos var0, int var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      b(var0, var1, 0.0F);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21504;
      var10002 = -30220;
      Intrinsics.checkNotNullParameter(var1, "outlineColor");
      var10001 = -21495;
      var10002 = -19407;
      Intrinsics.checkNotNullParameter(var2, "fillColor");
      a(var0, var1, var2, var3, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21502;
      var10002 = -4171;
      Intrinsics.checkNotNullParameter(var1, "outlineColor");
      var10001 = -21500;
      var10002 = 8860;
      Intrinsics.checkNotNullParameter(var2, "fillColor");
      a(var0, var1, var2, 0.0F, false);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2
   ) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void f(@NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull BlockPos var0, int var1, int var2, int var3) {
      short var10001 = -21496;
      short var10002 = -20602;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull BlockPos var0, int var1, int var2) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void f(@NotNull BlockPos var0, int var1) {
      short var10001 = -21489;
      short var10002 = -18372;
      Intrinsics.checkNotNullParameter(var0, "pos");
      a(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3
   ) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(@NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0, int var1, int var2, int var3) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull AABB var0, int var1, int var2) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void c(@NotNull AABB var0, int var1) {
      short var10001 = -21497;
      short var10002 = -15592;
      Intrinsics.checkNotNullParameter(var0, "box");
      a(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull List<? extends BlockPos> var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      int var2,
      int var3
   ) {
      short var10001 = -21494;
      short var10002 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull List<? extends BlockPos> var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2
   ) {
      short var10001 = -21493;
      short var10002 = 1290;
      Intrinsics.checkNotNullParameter(var0, "positions");
      var10001 = -21491;
      var10002 = -5128;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(
      @NotNull List<? extends BlockPos> var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1
   ) {
      short var10001 = -21494;
      short var10002 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      var10001 = -21501;
      var10002 = 28808;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull List<? extends BlockPos> var0, int var1, int var2, int var3) {
      short var10001 = -21494;
      short var10002 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      a(var0, var1, var2, var3);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull List<? extends BlockPos> var0, int var1, int var2) {
      short var10001 = -21494;
      short var10002 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      a(var0, var1, var2);
   }

   @JvmStatic
   @JvmOverloads
   public static final void a(@NotNull List<? extends BlockPos> var0, int var1) {
      short var10001 = -21494;
      short var10002 = 2206;
      Intrinsics.checkNotNullParameter(var0, "positions");
      a(var0, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "Í)¸§ô>V\u009cê\u0003ª6\u009f\t\u0094îX\u009c#ú~Ã\u008d\t«v¿\u008fß\u0098á\u008f~\u0005ä\u009385Õ\fR÷¯\u009b\u007f¢H0]ÂÄÛ\u0003W¬ \fDÆm½'fC¨<Ñè¹\u0006ìÍMÿØk\fäk\u00adpgÅBî]]ìy\u0005+gÁ«ê\fs\u007f_ò9\u0095\u0089ä$\u001cÃQ\u0003\u0095¹#\tm\u0084¬\u0012v\u0088\u0006Jà";
      int var4 = "Í)¸§ô>V\u009cê\u0003ª6\u009f\t\u0094îX\u009c#ú~Ã\u008d\t«v¿\u008fß\u0098á\u008f~\u0005ä\u009385Õ\fR÷¯\u009b\u007f¢H0]ÂÄÛ\u0003W¬ \fDÆm½'fC¨<Ñè¹\u0006ìÍMÿØk\fäk\u00adpgÅBî]]ìy\u0005+gÁ«ê\fs\u007f_ò9\u0095\u0089ä$\u001cÃQ\u0003\u0095¹#\tm\u0084¬\u0012v\u0088\u0006Jà"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 33;
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
                     case 0 -> 30;
                     case 1 -> 118;
                     case 2 -> 1;
                     case 3 -> 97;
                     case 4 -> 100;
                     case 5 -> 109;
                     default -> 6;
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
                     d = new String[16];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl();
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

                  var2 = "\u00813«\u00065\u0087|¼ô\t";
                  var4 = "\u00813«\u00065\u0087|¼ô\t".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 99;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21495) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 20;
            case 1 -> 19;
            case 2 -> 116;
            case 3 -> 137;
            case 4 -> 96;
            case 5 -> 33;
            case 6 -> 71;
            case 7 -> 16;
            case 8 -> 195;
            case 9 -> 44;
            case 10 -> 224;
            case 11 -> 153;
            case 12 -> 202;
            case 13 -> 182;
            case 14 -> 117;
            case 15 -> 97;
            case 16 -> 77;
            case 17 -> 100;
            case 18 -> 226;
            case 19 -> 9;
            case 20 -> 17;
            case 21 -> 72;
            case 22 -> 115;
            case 23 -> 62;
            case 24 -> 128;
            case 25 -> 200;
            case 26 -> 190;
            case 27 -> 87;
            case 28 -> 170;
            case 29 -> 94;
            case 30 -> 245;
            case 31 -> 187;
            case 32 -> 168;
            case 33 -> 57;
            case 34 -> 197;
            case 35 -> 210;
            case 36 -> 248;
            case 37 -> 92;
            case 38 -> 151;
            case 39 -> 191;
            case 40 -> 181;
            case 41 -> 130;
            case 42 -> 136;
            case 43 -> 158;
            case 44 -> 221;
            case 45 -> 63;
            case 46 -> 139;
            case 47 -> 133;
            case 48 -> 15;
            case 49 -> 66;
            case 50 -> 162;
            case 51 -> 203;
            case 52 -> 60;
            case 53 -> 231;
            case 54 -> 179;
            case 55 -> 7;
            case 56 -> 14;
            case 57 -> 8;
            case 58 -> 38;
            case 59 -> 207;
            case 60 -> 211;
            case 61 -> 108;
            case 62 -> 114;
            case 63 -> 206;
            case 64 -> 35;
            case 65 -> 0;
            case 66 -> 228;
            case 67 -> 46;
            case 68 -> 220;
            case 69 -> 254;
            case 70 -> 246;
            case 71 -> 174;
            case 72 -> 106;
            case 73 -> 159;
            case 74 -> 1;
            case 75 -> 120;
            case 76 -> 146;
            case 77 -> 219;
            case 78 -> 73;
            case 79 -> 25;
            case 80 -> 172;
            case 81 -> 222;
            case 82 -> 104;
            case 83 -> 39;
            case 84 -> 199;
            case 85 -> 175;
            case 86 -> 68;
            case 87 -> 253;
            case 88 -> 43;
            case 89 -> 204;
            case 90 -> 5;
            case 91 -> 119;
            case 92 -> 208;
            case 93 -> 31;
            case 94 -> 61;
            case 95 -> 118;
            case 96 -> 229;
            case 97 -> 194;
            case 98 -> 176;
            case 99 -> 230;
            case 100 -> 76;
            case 101 -> 51;
            case 102 -> 217;
            case 103 -> 113;
            case 104 -> 36;
            case 105 -> 242;
            case 106 -> 238;
            case 107 -> 132;
            case 108 -> 78;
            case 109 -> 233;
            case 110 -> 34;
            case 111 -> 102;
            case 112 -> 125;
            case 113 -> 85;
            case 114 -> 93;
            case 115 -> 101;
            case 116 -> 165;
            case 117 -> 241;
            case 118 -> 212;
            case 119 -> 215;
            case 120 -> 142;
            case 121 -> 149;
            case 122 -> 129;
            case 123 -> 12;
            case 124 -> 32;
            case 125 -> 163;
            case 126 -> 201;
            case 127 -> 13;
            case 128 -> 134;
            case 129 -> 58;
            case 130 -> 88;
            case 131 -> 40;
            case 132 -> 169;
            case 133 -> 79;
            case 134 -> 218;
            case 135 -> 4;
            case 136 -> 110;
            case 137 -> 152;
            case 138 -> 84;
            case 139 -> 234;
            case 140 -> 154;
            case 141 -> 135;
            case 142 -> 30;
            case 143 -> 131;
            case 144 -> 232;
            case 145 -> 178;
            case 146 -> 196;
            case 147 -> 80;
            case 148 -> 186;
            case 149 -> 161;
            case 150 -> 193;
            case 151 -> 140;
            case 152 -> 103;
            case 153 -> 90;
            case 154 -> 22;
            case 155 -> 49;
            case 156 -> 251;
            case 157 -> 74;
            case 158 -> 171;
            case 159 -> 41;
            case 160 -> 239;
            case 161 -> 2;
            case 162 -> 95;
            case 163 -> 70;
            case 164 -> 198;
            case 165 -> 99;
            case 166 -> 167;
            case 167 -> 183;
            case 168 -> 91;
            case 169 -> 216;
            case 170 -> 37;
            case 171 -> 47;
            case 172 -> 127;
            case 173 -> 124;
            case 174 -> 155;
            case 175 -> 240;
            case 176 -> 11;
            case 177 -> 255;
            case 178 -> 141;
            case 179 -> 112;
            case 180 -> 156;
            case 181 -> 54;
            case 182 -> 48;
            case 183 -> 82;
            case 184 -> 65;
            case 185 -> 126;
            case 186 -> 244;
            case 187 -> 173;
            case 188 -> 145;
            case 189 -> 69;
            case 190 -> 147;
            case 191 -> 180;
            case 192 -> 3;
            case 193 -> 189;
            case 194 -> 45;
            case 195 -> 143;
            case 196 -> 52;
            case 197 -> 237;
            case 198 -> 50;
            case 199 -> 205;
            case 200 -> 225;
            case 201 -> 249;
            case 202 -> 192;
            case 203 -> 138;
            case 204 -> 214;
            case 205 -> 185;
            case 206 -> 98;
            case 207 -> 24;
            case 208 -> 209;
            case 209 -> 81;
            case 210 -> 83;
            case 211 -> 75;
            case 212 -> 109;
            case 213 -> 28;
            case 214 -> 148;
            case 215 -> 27;
            case 216 -> 10;
            case 217 -> 18;
            case 218 -> 56;
            case 219 -> 64;
            case 220 -> 111;
            case 221 -> 235;
            case 222 -> 89;
            case 223 -> 188;
            case 224 -> 26;
            case 225 -> 29;
            case 226 -> 86;
            case 227 -> 252;
            case 228 -> 213;
            case 229 -> 144;
            case 230 -> 105;
            case 231 -> 67;
            case 232 -> 21;
            case 233 -> 42;
            case 234 -> 166;
            case 235 -> 164;
            case 236 -> 236;
            case 237 -> 55;
            case 238 -> 223;
            case 239 -> 150;
            case 240 -> 250;
            case 241 -> 160;
            case 242 -> 157;
            case 243 -> 123;
            case 244 -> 23;
            case 245 -> 177;
            case 246 -> 227;
            case 247 -> 243;
            case 248 -> 107;
            case 249 -> 53;
            case 250 -> 184;
            case 251 -> 59;
            case 252 -> 122;
            case 253 -> 247;
            case 254 -> 121;
            default -> 6;
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
   public static void a(net.minecraft.core.BlockPos var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3, int var4, java.lang.Object var5) {
      if ((var4 & 4) != 0) {
         var2 = 3.0f;
      }
      if ((var4 & 8) != 0) {
         var3 = true;
      }
      a(var0, var1, var2, var3);
      return;
   }

   public static void a(net.minecraft.core.BlockPos var0, int var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = 2.0f;
      }
      a(var0, var1, var2);
      return;
   }

   public static void a(net.minecraft.world.phys.AABB var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3, int var4, java.lang.Object var5) {
      if ((var4 & 4) != 0) {
         var2 = 3.0f;
      }
      if ((var4 & 8) != 0) {
         var3 = true;
      }
      a(var0, var1, var2, var3);
      return;
   }

   public static void a(net.minecraft.world.phys.AABB var0, int var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = 2.0f;
      }
      a(var0, var1, var2);
      return;
   }

   public static void a(java.util.List var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3, int var4, java.lang.Object var5) {
      if ((var4 & 4) != 0) {
         var2 = 3.0f;
      }
      if ((var4 & 8) != 0) {
         var3 = true;
      }
      a(var0, var1, var2, var3);
      return;
   }

   public static void a(java.util.List var0, int var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = 2.0f;
      }
      a(var0, var1, var2);
      return;
   }

   public static void a(net.minecraft.core.BlockPos var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = true;
      }
      a(var0, var1, var2);
      return;
   }

   public static void a(net.minecraft.world.phys.AABB var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = true;
      }
      a(var0, var1, var2);
      return;
   }

   public static void a(java.util.List var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = true;
      }
      a(var0, var1, var2);
      return;
   }

   public static void b(net.minecraft.core.BlockPos var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = true;
      }
      b(var0, var1, var2);
      return;
   }

   public static void a(net.minecraft.core.BlockPos var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = 2.0f;
      }
      a(var0, var1, var2);
      return;
   }

   public static void b(net.minecraft.core.BlockPos var0, int var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = 2.0f;
      }
      b(var0, var1, var2);
      return;
   }

   public static void a(net.minecraft.core.BlockPos var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2, float var3, boolean var4, int var5, java.lang.Object var6) {
      if ((var5 & 8) != 0) {
         var3 = 3.0f;
      }
      if ((var5 & 16) != 0) {
         var4 = true;
      }
      a(var0, var1, var2, var3, var4);
      return;
   }

   public static void a(net.minecraft.core.BlockPos var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
      if ((var5 & 4) != 0) {
         var2 = 2;
      }
      if ((var5 & 8) != 0) {
         var3 = 3;
      }
      if ((var5 & 16) != 0) {
         var4 = 5;
      }
      a(var0, var1, var2, var3, var4);
      return;
   }

   public static void a(net.minecraft.core.BlockPos var0, int var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
      if ((var5 & 4) != 0) {
         var2 = 2;
      }
      if ((var5 & 8) != 0) {
         var3 = 3;
      }
      if ((var5 & 16) != 0) {
         var4 = 5;
      }
      a(var0, var1, var2, var3, var4);
      return;
   }

   public static void a(net.minecraft.world.phys.AABB var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
      if ((var5 & 4) != 0) {
         var2 = 2;
      }
      if ((var5 & 8) != 0) {
         var3 = 3;
      }
      if ((var5 & 16) != 0) {
         var4 = 5;
      }
      a(var0, var1, var2, var3, var4);
      return;
   }

   public static void a(net.minecraft.world.phys.AABB var0, int var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
      if ((var5 & 4) != 0) {
         var2 = 2;
      }
      if ((var5 & 8) != 0) {
         var3 = 3;
      }
      if ((var5 & 16) != 0) {
         var4 = 5;
      }
      a(var0, var1, var2, var3, var4);
      return;
   }

   public static void a(java.util.List var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
      if ((var5 & 4) != 0) {
         var2 = 2;
      }
      if ((var5 & 8) != 0) {
         var3 = 3;
      }
      if ((var5 & 16) != 0) {
         var4 = 5;
      }
      a(var0, var1, var2, var3, var4);
      return;
   }

   public static void a(java.util.List var0, int var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
      if ((var5 & 4) != 0) {
         var2 = 2;
      }
      if ((var5 & 8) != 0) {
         var3 = 3;
      }
      if ((var5 & 16) != 0) {
         var4 = 5;
      }
      a(var0, var1, var2, var3, var4);
      return;
   }

   public static void b(net.minecraft.core.BlockPos var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = 2.0f;
      }
      b(var0, var1, var2);
      return;
   }

   public static void a(java.util.List var0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = 2.0f;
      }
      a((java.util.List<net.minecraft.core.BlockPos>)var0, var1, var2);
      return;
   }
}
