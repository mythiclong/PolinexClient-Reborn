package me.octo.client.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(String p0, Vec3 p1, float p2, boolean p3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIl

   private static int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Identifier IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public static final void a(
      @NotNull Collection<? extends Vec3> var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      boolean var2,
      float var3
   ) {
      short var10001 = -12378;
      short var10002 = 9870;
      Intrinsics.checkNotNullParameter(var0, "points");
      var10001 = -12355;
      var10002 = 5910;
      Intrinsics.checkNotNullParameter(var1, "color");
      a(var0, var1, var1, var2, var3);
   }

   public static final void a(
      @NotNull Collection<? extends Vec3> var0,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      boolean var3,
      float var4
   ) {
      int var10001 = -12358;
      short var10002 = 16732;
      Intrinsics.checkNotNullParameter(var0, "points");
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      var10002 = -12356;
      short var10003 = -20043;
      Intrinsics.checkNotNullParameter(var1, "color1");
      var10002 = -12384;
      var10003 = 11600;
      Intrinsics.checkNotNullParameter(var2, "color2");
      int[] var5 = var10000;
      int var12 = var0.size();
      if (var5 != null) {
         if (var12 < 2) {
            return;
         }

         var12 = var1.o();
      }

      int var6 = var12;
      int var7 = var2.o();
      List var13 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .a();
      var10001 =(( var3) ? 1 : 0);
      if (var5 != null) {
         var10001 = !var3 ? 0 : 1;
      }

      List var8 = (List)var13.get(var10001);
      Iterator var9 = var0.iterator();
      Vec3 var10 = (Vec3)var9.next();

      while (var9.hasNext()) {
         Vec3 var11 = (Vec3)var9.next();
         var8.add(new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI(var10, var11, var6, var7, var4));
         var10 = var11;
         if (var5 == null) {
            break;
         }
      }
   }

   public static final void a(
      @NotNull Vec3 var0,
      @NotNull Vec3 var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      boolean var3,
      float var4,
      double var5,
      double var7
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -12362;
      short var10003 = -13034;
      Intrinsics.checkNotNullParameter(var0, "from");
      int[] var9 = var10000;
      int var10001 = -12360;
      var10002 = 22390;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10001 = (short)-12367;
      var10002 = 27158;
      Intrinsics.checkNotNullParameter(var2, "color");
      double var10 = var1.x - var0.x;
      double var12 = var1.y - var0.y;
      double var14 = var1.z - var0.z;
      double var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
      double var32 = var16;
      double var35 = 0.01;
      if (var9 != null) {
         if (var16 < 0.01) {
            return;
         }

         var32 = var10;
         var35 = var16;
      }

      double var18 = var32 / var35;
      double var20 = var12 / var16;
      double var22 = var14 / var16;
      int var24 = var2.o();
      List var33 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .a();
      var10001 =(( var3) ? 1 : 0);
      if (var9 != null) {
         var10001 = !var3 ? 0 : 1;
      }

      List var25 = (List)var33.get(var10001);
      double var26 = var5 + var7;
      double var28 = 0.0;

      while (var28 < var16) {
         double var30 = RangesKt.coerceAtMost(var28 + var5, var16);
         var25.add(
            new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI(
               new Vec3(var0.x + var18 * var28, var0.y + var20 * var28, var0.z + var22 * var28),
               new Vec3(var0.x + var18 * var30, var0.y + var20 * var30, var0.z + var22 * var30),
               var24,
               var24,
               var4
            )
         );
         var28 += var26;
         if (var9 == null) {
            break;
         }
      }
   }

   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -12383;
      short var10003 = 5937;
      Intrinsics.checkNotNullParameter(var0, "box");
      int[] var4 = var10000;
      int var10001 = -12355;
      var10002 = 5910;
      Intrinsics.checkNotNullParameter(var1, "color");
      List var5 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .c();
      var10001 =(( var3) ? 1 : 0);
      if (var4 != null) {
         var10001 = !var3 ? 0 : 1;
      }

      ((List)var5.get(var10001))
         .add(new IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl(var0, var1.q(), var1.r(), var1.s(), var1.t(), var2));
   }

   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -12359;
      short var10003 = -26453;
      Intrinsics.checkNotNullParameter(var0, "box");
      int[] var3 = var10000;
      int var10001 = -12355;
      var10002 = 5910;
      Intrinsics.checkNotNullParameter(var1, "color");
      List var4 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .b();
      var10001 =(( var2) ? 1 : 0);
      if (var3 != null) {
         var10001 = !var2 ? 0 : 1;
      }

      ((List)var4.get(var10001))
         .add(new IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl(var0, var1.q(), var1.r(), var1.s(), var1.t(), 3.0F));
   }

   public static final void a(
      @NotNull AABB var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, boolean var3
   ) {
      label22: {
         int[] var4;
         label21: {
            short var10001 = -12359;
            short var10002 = -26453;
            Intrinsics.checkNotNullParameter(var0, "box");
            int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
            var10002 = -12355;
            short var10003 = 5910;
            Intrinsics.checkNotNullParameter(var1, "color");
            var4 = var10000;
            if (var4 != null) {
               switch (var2) {
                  case 0:
                     a(var0, var1, var3);
                     break;
                  case 1:
                     break label21;
                  case 2:
                     break label22;
                  default:
                     return;
               }
            }

            if (var4 != null) {
               return;
            }
         }

         a(var0, var1, 0.0F, var3);
         if (var4 != null) {
            return;
         }
      }

      a(var0, var1.a(0.5F), var3);
      a(var0, var1, 0.0F, var3);
   }

   public static final void a(@NotNull BlockPos var0, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -12365;
      short var10003 = -29440;
      Intrinsics.checkNotNullParameter(var0, "position");
      var10002 = -12355;
      var10003 = 5910;
      Intrinsics.checkNotNullParameter(var1, "color");
      int[] var2 = var10000;
      Minecraft var7 = Minecraft.getInstance();
      var10002 = -12382;
      var10003 = 13126;
      Intrinsics.checkNotNullExpressionValue(var7, "getInstance(...)");
      Minecraft var3 = var7;
      boolean var8;
      if (var2 != null && var3.player != null) {
         var8 = var3.player.isScoping();
         if (var2 != null) {
            ;
         }
      } else {
         var8 = false;
      }

      boolean var4 = var8;
      long var5 = var2 != null && var3.level != null ? var3.level.getGameTime() : 0L;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .d()
         .add(new lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll(var0, var1, var4, var5));
   }

   public static final void a(
      @NotNull String var0,
      @NotNull Vec3 var1,
      float var2,
      boolean var3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4,
      @NotNull IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5,
      float var6,
      @Nullable Float var7
   ) {
      Object var21 = null; // PX-FIX
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -12354;
      short var10003 = -3337;
      Intrinsics.checkNotNullParameter(var0, "text");
      var10002 = -12366;
      var10003 = -26057;
      Intrinsics.checkNotNullParameter(var1, "pos");
      int[] var8 = var10000;
      short var10001 = -12355;
      var10002 = 5910;
      Intrinsics.checkNotNullParameter(var4, "color");
      var10001 = -12361;
      var10002 = 30033;
      Intrinsics.checkNotNullParameter(var5, "font");
      float var30;
      int var19 = (var30 = var6 - 0.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
      if (var8 != null) {
         var19 = (((var19 == 0) ? 1 : 0));
      }

      Vec3 var9;
      label36: {
         var9 = ((var19 != 0) ? new Vec3(var1.x, var1.y + var6, var1.z) : var1);
         Float var20 = var7;
         if (var8 != null) {
            if (var7 == null) {
               GameRenderer var22 = Minecraft.getInstance().gameRenderer;
               if (var22 == null) {
                  return;
               }

               Camera var23 = var22.getMainCamera();
               if (var23 == null) {
                  return;
               }

               Vec3 var24 = var23.position();
               if (var24 == null) {
                  return;
               }

               Vec3 var11 = var24;
               double var12 = var9.x - var11.x;
               double var14 = var9.y - var11.y;
               double var16 = var9.z - var11.z;
               float var18 = (float)Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
               var21 = RangesKt.coerceIn(13.0F + (float)Math.log(1.0F + var18) * 0.9F, 14.0F, 18.0F);
               break label36;
            }

            var20 = var7;
         }

         var21 = var20;
      }

      float var10 =((Float)( var21));
      lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.a(var9, var0, var10, var4, var5, false);
   }

   public static final void a(
      @NotNull String var0,
      @NotNull BlockPos var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      boolean var3,
      boolean var4
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -12379;
      short var10003 = -6085;
      Intrinsics.checkNotNullParameter(var0, "title");
      int[] var5 = var10000;
      short var10001 = -12368;
      var10002 = 21910;
      Intrinsics.checkNotNullParameter(var1, "position");
      var10001 = -12355;
      var10002 = 5910;
      Intrinsics.checkNotNullParameter(var2, "color");
      Minecraft var8 = Minecraft.getInstance();
      var10002 = -12380;
      var10003 = -17192;
      Intrinsics.checkNotNullExpressionValue(var8, "getInstance(...)");
      Minecraft var6 = var8;
      if (var5 != null && var6.player != null) {
         BlockPos var9 = var6.player.blockPosition();
         Object var12 = var9;
         if (var5 != null) {
            if (var9 == null) {
               return;
            }

            var12 = var1;
         }

         int var7 = var9.distManhattan((Vec3i)var12);
         a(new AABB(var1), var2, 0.0F, false, 4, null);
         a(var1, var2);
         String var10;
         if (var4) {
            var10002 = -12357;
            var10003 = -1021;
            var10003 = -12377;
            short var10004 = 21447;
            var10 = var0 + " §r§f(§3" + var7 + "m§f)";
         } else {
            var10 = var0;
         }

         Vec3 var13 = var1.getCenter().add(0.0, 1.7, 0.0);
         var10003 = -12363;
         short var22 = 20545;
         Intrinsics.checkNotNullExpressionValue(var13, "add(...)");
         a(var10, var13, var3 ? Math.max(1.0F, var7 * 0.05F) : 2.0F, false, null, null, 0.0F, null, 240, null);
      }
   }

   public static final void a(
      @NotNull Vec3 var0,
      float var1,
      float var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      int var4,
      float var5,
      boolean var6
   ) {
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      short var10002 = -12376;
      short var10003 = 16697;
      Intrinsics.checkNotNullParameter(var0, "center");
      int[] var7 = var10000;
      int var10001 = -12355;
      var10002 = 5910;
      Intrinsics.checkNotNullParameter(var3, "color");
      List var25 = IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .a();
      var10001 =(( var6) ? 1 : 0);
      if (var7 != null) {
         var10001 = !var6 ? 0 : 1;
      }

      List var8 = (List)var25.get(var10001);
      double var9 = (Math.PI * 2) / var4;
      int var11 = var3.o();
      int var12 = 0;

      while (var12 < var4) {
         double var13 = var12 * var9;
         double var15 = (var12 + 1) * var9;
         float var17 = (float)(var1 * Math.cos(var13));
         float var18 = (float)(var1 * Math.sin(var13));
         float var19 = (float)(var1 * Math.cos(var15));
         float var20 = (float)(var1 * Math.sin(var15));
         Vec3 var26 = var0.add(var17, var2, var18);
         var10002 = -12353;
         var10003 = 20178;
         Intrinsics.checkNotNullExpressionValue(var26, "add(...)");
         Vec3 var21 = var26;
         Vec3 var27 = var0.add(var19, var2, var20);
         var10002 = -12353;
         var10003 = 20178;
         Intrinsics.checkNotNullExpressionValue(var27, "add(...)");
         Vec3 var22 = var27;
         Vec3 var28 = var0.add(var17, 0.0, var18);
         var10002 = -12353;
         var10003 = 20178;
         Intrinsics.checkNotNullExpressionValue(var28, "add(...)");
         Vec3 var23 = var28;
         Vec3 var29 = var0.add(var19, 0.0, var20);
         var10002 = -12353;
         var10003 = 20178;
         Intrinsics.checkNotNullExpressionValue(var29, "add(...)");
         Vec3 var24 = var29;
         var8.add(new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI(var21, var22, var11, var11, var5));
         var8.add(new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI(var23, var24, var11, var11, var5));
         var8.add(new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI(var23, var21, var11, var11, var5));
         var12++;
         if (var7 == null) {
            break;
         }
      }
   }
   public static void a(java.util.Collection var0, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2, float var3, int var4, java.lang.Object var5) {
      if ((var4 & 8) != 0) {
         var3 = 3.0F;
      }

      a(var0, var1, var2, var3);
   }

   public static void a(java.util.Collection var0, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2, boolean var3, float var4, int var5, java.lang.Object var6) {
      if ((var5 & 16) != 0) {
         var4 = 3.0F;
      }

      a(var0, var1, var2, var3, var4);
   }

   public static void a(net.minecraft.world.phys.Vec3 var0, net.minecraft.world.phys.Vec3 var1, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2, boolean var3, float var4, double var5, double var6, int var7, java.lang.Object var8) {
      if ((var7 & 16) != 0) {
         var4 = 3.0F;
      }

      if ((var7 & 32) != 0) {
         var5 = 1.0;
      }

      if ((var7 & 64) != 0) {
         var6 = 0.85;
      }

      a(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void a(net.minecraft.world.phys.AABB var0, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, float var2, boolean var3, int var4, java.lang.Object var5) {
      if ((var4 & 4) != 0) {
         var2 = 3.0F;
      }

      if ((var4 & 8) != 0) {
         var3 = false;
      }

      a(var0, var1, var2, var3);
   }

   public static void a(net.minecraft.world.phys.AABB var0, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, boolean var2, int var3, java.lang.Object var4) {
      if ((var3 & 4) != 0) {
         var2 = false;
      }

      a(var0, var1, var2);
   }

   public static void a(net.minecraft.world.phys.AABB var0, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1, int var2, boolean var3, int var4, java.lang.Object var5) {
      if ((var4 & 4) != 0) {
         var2 = 0;
      }

      if ((var4 & 8) != 0) {
         var3 = true;
      }

      a(var0, var1, var2, var3);
   }

   public static void a(java.lang.String var0, net.minecraft.world.phys.Vec3 var1, float var2, boolean var3, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl var5, float var6, java.lang.Float var7, int var8, java.lang.Object var9) {
      if ((var8 & 16) != 0) {
         var4 = llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      if ((var8 & 32) != 0) {
         var5 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      if ((var8 & 64) != 0) {
         var6 = 0.0F;
      }

      if ((var8 & 128) != 0) {
         var7 = null;
      }

      a(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void a(java.lang.String var0, net.minecraft.core.BlockPos var1, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2, boolean var3, boolean var4, int var5, java.lang.Object var6) {
      if ((var5 & 8) != 0) {
         var3 = true;
      }

      if ((var5 & 16) != 0) {
         var4 = true;
      }

      a(var0, var1, var2, var3, var4);
   }

   public static void a(net.minecraft.world.phys.Vec3 var0, float var1, float var2, llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, int var4, float var5, boolean var6, int var7, java.lang.Object var8) {
      if ((var7 & 16) != 0) {
         var4 = 32;
      }

      if ((var7 & 32) != 0) {
         var5 = 5.0F;
      }

      if ((var7 & 64) != 0) {
         var6 = false;
      }

      a(var0, var1, var2, var3, var4, var5, var6);
   }


   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var23 = null; // PX-FIX
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "Ï4a6\u008aFë.\u0005WÈ\u001c¯ß\u0003é²¥\b|Û\u0017ËDù2Ù\u001f),2c\u008bIàª\u0098¸ìeú\r®\u0016t6\u000eÁÌ\u0095&æN\\ÀÇd\u001f\u0000\b=.\u001b^je§¢\u0004|\u0086ßÚ\u0004Í\u009fè^\u0002fµ\u0003(qÆ\u0006b±Î\u0081&M\b\u000f¦\"{Ñ¹\u0018å\u0006%rRø\u0016\u0001\u0005W\u007f\u001cYß\u0004\u0082©GÓ\b¨\u000e©Z<åm²\u0006z´¹ k\u0019\u0003OC*\u0010\u000f\u001d\u008bx*±½\u0086Akµ\u0085ü\u009c\u00963\u0019\u0083ü\bèp°\u008brÌúm?\u009b\"\u0097\u0095Þ\u0095\t7)ÍDé\u0011\u0010\u001d$É_bU´\u001a`ø\u0091÷xÒ\u0006ú\u0005M¢²'\u0006\u0006Î\u001e[t\u0094ó";
      int var4 = "Ï4a6\u008aFë.\u0005WÈ\u001c¯ß\u0003é²¥\b|Û\u0017ËDù2Ù\u001f),2c\u008bIàª\u0098¸ìeú\r®\u0016t6\u000eÁÌ\u0095&æN\\ÀÇd\u001f\u0000\b=.\u001b^je§¢\u0004|\u0086ßÚ\u0004Í\u009fè^\u0002fµ\u0003(qÆ\u0006b±Î\u0081&M\b\u000f¦\"{Ñ¹\u0018å\u0006%rRø\u0016\u0001\u0005W\u007f\u001cYß\u0004\u0082©GÓ\b¨\u000e©Z<åm²\u0006z´¹ k\u0019\u0003OC*\u0010\u000f\u001d\u008bx*±½\u0086Akµ\u0085ü\u009c\u00963\u0019\u0083ü\bèp°\u008brÌúm?\u009b\"\u0097\u0095Þ\u0095\t7)ÍDé\u0011\u0010\u001d$É_bU´\u001a`ø\u0091÷xÒ\u0006ú\u0005M¢²'\u0006\u0006Î\u001e[t\u0094ó"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 111;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = (byte)var10000;
               var23 = var28;
               int var16 = var10004;
               byte var37;
               char[] var41;
               int var10006;
               if (var10004 <= 1) {
                  var41 = var28;
                  var37 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var31 = (byte)var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var41 = var28;
                  var37 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var41[var10006] = (char)(var41[var10006] ^ var37 ^ switch (var6 % 7) {
                     case 0 -> 106;
                     case 1 -> 77;
                     case 2 -> 90;
                     case 3 -> 112;
                     case 4 -> 6;
                     case 5 -> 33;
                     default -> 109;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var41 = var23;
                     var37 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var41 = var23;
                     var37 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[25];
                     var10000 = -12364;
                     short var18 = -12099;
                     Identifier var11 = Identifier.withDefaultNamespace("textures/entity/beacon_beam.png");
                     var10002 = -12381;
                     short var34 = -8680;
                     Intrinsics.checkNotNullExpressionValue(var11, "withDefaultNamespace(...)");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var11;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0085äFx\u0006îÇìÛQ\u009b";
                  var4 = "\u0085äFx\u0006îÇìÛQ\u009b".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 35;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12368) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 215;
            case 1 -> 67;
            case 2 -> 241;
            case 3 -> 142;
            case 4 -> 236;
            case 5 -> 128;
            case 6 -> 126;
            case 7 -> 238;
            case 8 -> 127;
            case 9 -> 137;
            case 10 -> 217;
            case 11 -> 50;
            case 12 -> 65;
            case 13 -> 75;
            case 14 -> 171;
            case 15 -> 111;
            case 16 -> 157;
            case 17 -> 244;
            case 18 -> 96;
            case 19 -> 29;
            case 20 -> 71;
            case 21 -> 74;
            case 22 -> 172;
            case 23 -> 3;
            case 24 -> 89;
            case 25 -> 108;
            case 26 -> 161;
            case 27 -> 189;
            case 28 -> 140;
            case 29 -> 58;
            case 30 -> 210;
            case 31 -> 56;
            case 32 -> 114;
            case 33 -> 144;
            case 34 -> 146;
            case 35 -> 55;
            case 36 -> 160;
            case 37 -> 94;
            case 38 -> 80;
            case 39 -> 10;
            case 40 -> 109;
            case 41 -> 168;
            case 42 -> 222;
            case 43 -> 25;
            case 44 -> 101;
            case 45 -> 92;
            case 46 -> 110;
            case 47 -> 224;
            case 48 -> 30;
            case 49 -> 176;
            case 50 -> 234;
            case 51 -> 43;
            case 52 -> 77;
            case 53 -> 254;
            case 54 -> 252;
            case 55 -> 185;
            case 56 -> 232;
            case 57 -> 40;
            case 58 -> 97;
            case 59 -> 32;
            case 60 -> 76;
            case 61 -> 130;
            case 62 -> 170;
            case 63 -> 174;
            case 64 -> 37;
            case 65 -> 249;
            case 66 -> 115;
            case 67 -> 129;
            case 68 -> 187;
            case 69 -> 60;
            case 70 -> 204;
            case 71 -> 206;
            case 72 -> 255;
            case 73 -> 194;
            case 74 -> 9;
            case 75 -> 248;
            case 76 -> 188;
            case 77 -> 197;
            case 78 -> 45;
            case 79 -> 227;
            case 80 -> 143;
            case 81 -> 235;
            case 82 -> 229;
            case 83 -> 193;
            case 84 -> 243;
            case 85 -> 153;
            case 86 -> 212;
            case 87 -> 253;
            case 88 -> 196;
            case 89 -> 116;
            case 90 -> 5;
            case 91 -> 179;
            case 92 -> 180;
            case 93 -> 173;
            case 94 -> 231;
            case 95 -> 158;
            case 96 -> 14;
            case 97 -> 34;
            case 98 -> 223;
            case 99 -> 95;
            case 100 -> 121;
            case 101 -> 118;
            case 102 -> 159;
            case 103 -> 69;
            case 104 -> 200;
            case 105 -> 195;
            case 106 -> 21;
            case 107 -> 104;
            case 108 -> 15;
            case 109 -> 83;
            case 110 -> 112;
            case 111 -> 134;
            case 112 -> 17;
            case 113 -> 31;
            case 114 -> 22;
            case 115 -> 53;
            case 116 -> 91;
            case 117 -> 68;
            case 118 -> 62;
            case 119 -> 49;
            case 120 -> 226;
            case 121 -> 247;
            case 122 -> 182;
            case 123 -> 2;
            case 124 -> 240;
            case 125 -> 16;
            case 126 -> 218;
            case 127 -> 52;
            case 128 -> 36;
            case 129 -> 64;
            case 130 -> 192;
            case 131 -> 124;
            case 132 -> 149;
            case 133 -> 237;
            case 134 -> 39;
            case 135 -> 4;
            case 136 -> 99;
            case 137 -> 100;
            case 138 -> 70;
            case 139 -> 233;
            case 140 -> 19;
            case 141 -> 154;
            case 142 -> 166;
            case 143 -> 133;
            case 144 -> 84;
            case 145 -> 177;
            case 146 -> 98;
            case 147 -> 90;
            case 148 -> 148;
            case 149 -> 135;
            case 150 -> 72;
            case 151 -> 147;
            case 152 -> 87;
            case 153 -> 230;
            case 154 -> 73;
            case 155 -> 213;
            case 156 -> 12;
            case 157 -> 191;
            case 158 -> 199;
            case 159 -> 250;
            case 160 -> 44;
            case 161 -> 41;
            case 162 -> 203;
            case 163 -> 8;
            case 164 -> 106;
            case 165 -> 201;
            case 166 -> 85;
            case 167 -> 117;
            case 168 -> 119;
            case 169 -> 0;
            case 170 -> 246;
            case 171 -> 169;
            case 172 -> 81;
            case 173 -> 6;
            case 174 -> 184;
            case 175 -> 207;
            case 176 -> 46;
            case 177 -> 219;
            case 178 -> 7;
            case 179 -> 162;
            case 180 -> 141;
            case 181 -> 225;
            case 182 -> 138;
            case 183 -> 28;
            case 184 -> 136;
            case 185 -> 150;
            case 186 -> 190;
            case 187 -> 167;
            case 188 -> 48;
            case 189 -> 242;
            case 190 -> 66;
            case 191 -> 214;
            case 192 -> 93;
            case 193 -> 18;
            case 194 -> 202;
            case 195 -> 123;
            case 196 -> 54;
            case 197 -> 86;
            case 198 -> 209;
            case 199 -> 221;
            case 200 -> 163;
            case 201 -> 42;
            case 202 -> 220;
            case 203 -> 211;
            case 204 -> 38;
            case 205 -> 35;
            case 206 -> 105;
            case 207 -> 145;
            case 208 -> 245;
            case 209 -> 175;
            case 210 -> 23;
            case 211 -> 181;
            case 212 -> 47;
            case 213 -> 1;
            case 214 -> 27;
            case 215 -> 79;
            case 216 -> 228;
            case 217 -> 251;
            case 218 -> 205;
            case 219 -> 61;
            case 220 -> 33;
            case 221 -> 125;
            case 222 -> 59;
            case 223 -> 239;
            case 224 -> 132;
            case 225 -> 131;
            case 226 -> 13;
            case 227 -> 63;
            case 228 -> 24;
            case 229 -> 103;
            case 230 -> 120;
            case 231 -> 183;
            case 232 -> 20;
            case 233 -> 122;
            case 234 -> 216;
            case 235 -> 198;
            case 236 -> 155;
            case 237 -> 57;
            case 238 -> 82;
            case 239 -> 156;
            case 240 -> 113;
            case 241 -> 164;
            case 242 -> 26;
            case 243 -> 151;
            case 244 -> 186;
            case 245 -> 152;
            case 246 -> 11;
            case 247 -> 178;
            case 248 -> 139;
            case 249 -> 107;
            case 250 -> 165;
            case 251 -> 208;
            case 252 -> 51;
            case 253 -> 102;
            case 254 -> 78;
            default -> 88;
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
