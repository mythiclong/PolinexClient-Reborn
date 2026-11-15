package me.octo.client.utils.player;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static double llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] c;
   private static String[] d;

   private lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII() {
   }

   public static final float g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public static final void a(float var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static final float i() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public static final void b(float var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   public final void k() {
      String var1 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      if (var1 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            boolean var3 = false;
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2.getYRot();
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var2.getXRot();
         }
      }
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI l() {
      String var1 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      if (var1 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var2.getYRot(), var2.getXRot());
         }
      }

      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(0.0F, 0.0F);
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(@NotNull Vec3 var1) {
      short var10001 = -14768;
      short var10002 = -16278;
      Intrinsics.checkNotNullParameter(var1, "vec");
      Vec3 var2 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
      return this.a(var2, var1);
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI b(@NotNull Vec3 var1) {
      short var10001 = -14758;
      short var10002 = -16046;
      Intrinsics.checkNotNullParameter(var1, "vec");
      Vec3 var2 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.v();
      return this.a(var2, var1);
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(@NotNull BlockPos var1) {
      short var10001 = -14756;
      short var10002 = 12290;
      Intrinsics.checkNotNullParameter(var1, "bp");
      Vec3 var2 = new Vec3(var1.getX() + 0.5, var1.getY() + 0.5, var1.getZ() + 0.5);
      return this.a(var2);
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(@NotNull Vec3 var1, @NotNull Vec3 var2) {
      short var10001 = -14757;
      short var10002 = 4663;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = -14764;
      var10002 = -9334;
      Intrinsics.checkNotNullParameter(var2, "to");
      double var3 = var2.x - var1.x;
      double var5 = var2.y - var1.y;
      double var7 = var2.z - var1.z;
      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
         Mth.wrapDegrees((float)(this.a(Math.atan2(var7, var3)) - 90.0)), -this.a(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7)))
      );
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      @NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1,
      @NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var2
   ) {
      short var10001 = -14767;
      short var10002 = 22676;
      Intrinsics.checkNotNullParameter(var1, "startRot");
      var10001 = -14765;
      var10002 = 5635;
      Intrinsics.checkNotNullParameter(var2, "endRot");
      float var3 = this.c(Mth.wrapDegrees(var2.a()) - Mth.wrapDegrees(var1.a()));
      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var3, var2.b() - var1.b());
   }

   public final float a(float var1, float var2) {
      return this.c(Mth.wrapDegrees(var1) - Mth.wrapDegrees(var2));
   }

   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1
   ) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      if (var2 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var3 = var10000;
            return this.a(new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var3.getYRot(), var3.getXRot()), var1);
         }
      }

      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(0.0F, 0.0F);
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI c(@NotNull Vec3 var1) {
      short var10001 = -14768;
      short var10002 = -16278;
      Intrinsics.checkNotNullParameter(var1, "vec");
      return this.a(this.a(IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u(), var1));
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI b(@NotNull BlockPos var1) {
      short var10001 = -14763;
      short var10002 = -9886;
      Intrinsics.checkNotNullParameter(var1, "pos");
      return this.a(
         this.a(
            IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u(),
            me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .d(var1)
         )
      );
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(@NotNull Entity var1) {
      short var10001 = -14760;
      short var10002 = 28672;
      Intrinsics.checkNotNullParameter(var1, "entity");
      Vec3 var2 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
      Vec3 var10003 = var1.getEyePosition();
      short var10005 = -14759;
      short var10006 = 4445;
      Intrinsics.checkNotNullExpressionValue(var10003, "getEyePosition(...)");
      return this.a(this.a(var2, var10003));
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI b(
      @NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1
   ) {
      short var10001 = -14762;
      short var10002 = 7070;
      Intrinsics.checkNotNullParameter(var1, "rot");
      return this.a(var1);
   }

   private final double c(lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1) {
      return (float)Math.sqrt(var1.a() * var1.a() + var1.b() * var1.b());
   }

   public final double d(@NotNull Vec3 var1) {
      short var10001 = -14768;
      short var10002 = -16278;
      Intrinsics.checkNotNullParameter(var1, "vec");
      return this.c(this.c(var1));
   }

   public final double c(@NotNull BlockPos var1) {
      short var10001 = -14761;
      short var10002 = 30248;
      Intrinsics.checkNotNullParameter(var1, "pos");
      return this.c(this.b(var1));
   }

   public final double b(@NotNull Entity var1) {
      short var10001 = -14753;
      short var10002 = -3674;
      Intrinsics.checkNotNullParameter(var1, "entity");
      return this.c(this.a(var1));
   }

   public final double d(@NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1) {
      short var10001 = -14776;
      short var10002 = -15164;
      Intrinsics.checkNotNullParameter(var1, "rot");
      return this.c(this.b(var1));
   }

   private final float a(double var1) {
      return (float)(var1 * 180 / Math.PI);
   }

   private final double m() {
      String var10000 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      Object var10001 = this.a().options.sensitivity().get();
      short var10003 = -14773;
      short var10004 = 4652;
      Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
      double var2 = ((Number)var10001).doubleValue();
      String var1 = var10000;
      double var7;
      int var6 = (var7 = var2 - IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
      if (var1 != null) {
         var6 = (((var6 == 0) ? 1 : 0));
      }

      if ((var6 == 0)) {
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
         double var4 = 1.0
            + me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .nextFloat()
               / 1.0E7;
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Math.pow(var2 * var4 * 0.6 + 0.2, 3.0) * 8 * 0.15;
      }

      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI b(float var1, float var2) {
      String var3 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      if (var3 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var4 = var10000;
            double var5 = this.m();
            if (var5 <= 1.0E-9) {
               return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var1, Mth.clamp(var2, -90.0F, 90.0F));
            }

            float var7 = var4.getYRot();
            float var8 = var4.getXRot();
            float var9 = (float)(var7 + Math.rint((var1 - var7) / var5) * var5);
            float var10 = (float)(var8 + Math.rint((var2 - var8) / var5) * var5);
            return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var9, Mth.clamp(var10, -90.0F, 90.0F));
         }
      }

      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var1, Mth.clamp(var2, -90.0F, 90.0F));
   }

   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14
   ) {
      double var15 = var7 - var1;
      double var17 = var9 - var3;
      double var19 = var11 - var5;
      double var21 = Mth.sqrt((float)(var15 * var15 + var19 * var19));
      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
         (float)Mth.wrapDegrees(
            IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(Math.atan2(var19, var15))
               - 90.0
               - var13
         ),
         (float)Mth.wrapDegrees(
            -IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(Math.atan2(var17, var21))
               - var14
         )
      );
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(@NotNull Vec3 var1, float var2, float var3) {
      String var10000 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      short var10002 = -14774;
      short var10003 = -149;
      Intrinsics.checkNotNullParameter(var1, "target");
      String var4 = var10000;
      if (var4 != null) {
         LocalPlayer var6 = this.a().player;
         if (var6 != null) {
            LocalPlayer var5 = var6;
            return this.a(
               var5.getX(),
               var5.getY() + IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.x(),
               var5.getZ(),
               var1.x,
               var1.y,
               var1.z,
               var2,
               var3
            );
         }
      }

      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(0.0F, 0.0F);
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      @NotNull Vec3 var1, @NotNull Vec3 var2, float var3, float var4
   ) {
      short var10001 = -14761;
      short var10002 = 30248;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = -14755;
      var10002 = -18296;
      Intrinsics.checkNotNullParameter(var2, "target");
      return this.a(var1.x, var1.y, var1.z, var2.x, var2.y, var2.z, var3, var4);
   }

   public final float c(float var1) {
      String var10000 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var3 = var1;
      String var2 = var10000;

      while (var3 > 180.0F) {
         var3 -= 360.0F;
         if (var2 == null) {
            return var3;
         }

         if (var2 == null) {
            break;
         }
      }

      while (var3 < -180.0F) {
         float var4 = var3 + 360.0F;
         if (var2 == null) {
            return var4;
         }

         var3 = var4;
         if (var2 == null) {
            return var3;
         }
      }

      return var3;
   }

   @NotNull
   public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b(
      @NotNull Vec3 var1, @NotNull Vec3 var2
   ) {
      short var10001 = -14754;
      short var10002 = 26405;
      Intrinsics.checkNotNullParameter(var1, "from");
      var10001 = -14766;
      var10002 = -8055;
      Intrinsics.checkNotNullParameter(var2, "to");
      return new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this.a(var1, var2).a()
      );
   }

   @NotNull
   public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll d(
      float var1
   ) {
      return new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var1
      );
   }

   public final float n() {
      String var10000 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      LocalPlayer var10001 = this.a().player;
      Intrinsics.checkNotNull(var10001);
      float var2 = var10001.getYRot();
      float var3 = var2 % 90.0F;
      String var1 = var10000;
      float var10;
      int var4 = (var10 = var2 - 0.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      if (var1 != null) {
         if (var4 > 0) {
            float var7 = var3;
            float var9 = 45.0F;
            if (var1 != null) {
               if (var3 > 45.0F) {
                  return var2 + (90.0F - var3);
               }

               var7 = var2;
               var9 = var3;
            }

            return var7 - var9;
         }

         if (var1 == null) {
            return var3 - -45.0F;
         }

         float var11;
         var4 = (var11 = var3 - -45.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      return var4 < 0 ? var2 - (90.0F + var3) : var2 - var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "\u009emÿ\u0004:\u0012uþ\u0006ó{4H t\u0013\u008b.y¤\u0084\\[.÷Ùz>\u009a ú<«¯\u009f\u0004\u0086OâU\u0006ë¨72@;\u0002\u0097D\u0006í»Â°)©\u0002\tè\u0006\u0097¼¨\u008bº]\u0003w-Â\b ø\u009fzâa\u0004C\u0003\u007fòP\u0003\u0082xª\u0002=\u009a\u0003\u0098\u001fé\u0006ã\u0011\u0003å\u0011\u0003";
      int var4 = "\u009emÿ\u0004:\u0012uþ\u0006ó{4H t\u0013\u008b.y¤\u0084\\[.÷Ùz>\u009a ú<«¯\u009f\u0004\u0086OâU\u0006ë¨72@;\u0002\u0097D\u0006í»Â°)©\u0002\tè\u0006\u0097¼¨\u008bº]\u0003w-Â\b ø\u009fzâa\u0004C\u0003\u007fòP\u0003\u0082xª\u0002=\u009a\u0003\u0098\u001fé\u0006ã\u0011\u0003å\u0011\u0003"
         .length();
      char var1 = 3;
      b("qfr3Gc");
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 77;
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
                     case 0 -> 107;
                     case 1 -> 120;
                     case 2 -> 126;
                     case 3 -> 6;
                     case 4 -> 3;
                     case 5 -> 100;
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
                     d = new String[19];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Double.NaN;
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

                  var2 = "=Êt\u008e©Iæ3\u0003q\u007fJ";
                  var4 = "=Êt\u008e©Iæ3\u0003q\u007fJ".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 56;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(String var0) {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var0;
   }

   public static String o() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -14758) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 79;
            case 1 -> 202;
            case 2 -> 106;
            case 3 -> 60;
            case 4 -> 172;
            case 5 -> 3;
            case 6 -> 56;
            case 7 -> 111;
            case 8 -> 225;
            case 9 -> 135;
            case 10 -> 231;
            case 11 -> 88;
            case 12 -> 237;
            case 13 -> 2;
            case 14 -> 234;
            case 15 -> 220;
            case 16 -> 107;
            case 17 -> 133;
            case 18 -> 81;
            case 19 -> 61;
            case 20 -> 92;
            case 21 -> 223;
            case 22 -> 194;
            case 23 -> 227;
            case 24 -> 180;
            case 25 -> 68;
            case 26 -> 99;
            case 27 -> 27;
            case 28 -> 189;
            case 29 -> 31;
            case 30 -> 58;
            case 31 -> 54;
            case 32 -> 40;
            case 33 -> 207;
            case 34 -> 116;
            case 35 -> 130;
            case 36 -> 203;
            case 37 -> 149;
            case 38 -> 136;
            case 39 -> 141;
            case 40 -> 69;
            case 41 -> 85;
            case 42 -> 86;
            case 43 -> 1;
            case 44 -> 98;
            case 45 -> 22;
            case 46 -> 38;
            case 47 -> 46;
            case 48 -> 14;
            case 49 -> 122;
            case 50 -> 64;
            case 51 -> 20;
            case 52 -> 12;
            case 53 -> 235;
            case 54 -> 41;
            case 55 -> 155;
            case 56 -> 126;
            case 57 -> 170;
            case 58 -> 144;
            case 59 -> 65;
            case 60 -> 66;
            case 61 -> 90;
            case 62 -> 18;
            case 63 -> 44;
            case 64 -> 6;
            case 65 -> 91;
            case 66 -> 94;
            case 67 -> 199;
            case 68 -> 175;
            case 69 -> 25;
            case 70 -> 78;
            case 71 -> 160;
            case 72 -> 197;
            case 73 -> 242;
            case 74 -> 245;
            case 75 -> 32;
            case 76 -> 213;
            case 77 -> 246;
            case 78 -> 0;
            case 79 -> 195;
            case 80 -> 206;
            case 81 -> 67;
            case 82 -> 224;
            case 83 -> 233;
            case 84 -> 73;
            case 85 -> 93;
            case 86 -> 70;
            case 87 -> 198;
            case 88 -> 51;
            case 89 -> 115;
            case 90 -> 176;
            case 91 -> 45;
            case 92 -> 240;
            case 93 -> 24;
            case 94 -> 128;
            case 95 -> 212;
            case 96 -> 190;
            case 97 -> 8;
            case 98 -> 188;
            case 99 -> 120;
            case 100 -> 37;
            case 101 -> 117;
            case 102 -> 205;
            case 103 -> 143;
            case 104 -> 238;
            case 105 -> 247;
            case 106 -> 200;
            case 107 -> 211;
            case 108 -> 97;
            case 109 -> 244;
            case 110 -> 35;
            case 111 -> 72;
            case 112 -> 166;
            case 113 -> 164;
            case 114 -> 204;
            case 115 -> 57;
            case 116 -> 146;
            case 117 -> 15;
            case 118 -> 215;
            case 119 -> 222;
            case 120 -> 184;
            case 121 -> 87;
            case 122 -> 153;
            case 123 -> 252;
            case 124 -> 26;
            case 125 -> 226;
            case 126 -> 154;
            case 127 -> 179;
            case 128 -> 127;
            case 129 -> 101;
            case 130 -> 36;
            case 131 -> 16;
            case 132 -> 7;
            case 133 -> 125;
            case 134 -> 159;
            case 135 -> 219;
            case 136 -> 76;
            case 137 -> 129;
            case 138 -> 185;
            case 139 -> 43;
            case 140 -> 236;
            case 141 -> 169;
            case 142 -> 157;
            case 143 -> 103;
            case 144 -> 193;
            case 145 -> 192;
            case 146 -> 48;
            case 147 -> 49;
            case 148 -> 113;
            case 149 -> 230;
            case 150 -> 9;
            case 151 -> 118;
            case 152 -> 183;
            case 153 -> 77;
            case 154 -> 218;
            case 155 -> 30;
            case 156 -> 150;
            case 157 -> 152;
            case 158 -> 181;
            case 159 -> 196;
            case 160 -> 95;
            case 161 -> 96;
            case 162 -> 249;
            case 163 -> 168;
            case 164 -> 84;
            case 165 -> 100;
            case 166 -> 59;
            case 167 -> 182;
            case 168 -> 171;
            case 169 -> 124;
            case 170 -> 83;
            case 171 -> 11;
            case 172 -> 104;
            case 173 -> 147;
            case 174 -> 156;
            case 175 -> 138;
            case 176 -> 28;
            case 177 -> 47;
            case 178 -> 62;
            case 179 -> 232;
            case 180 -> 50;
            case 181 -> 187;
            case 182 -> 114;
            case 183 -> 52;
            case 184 -> 132;
            case 185 -> 243;
            case 186 -> 248;
            case 187 -> 158;
            case 188 -> 167;
            case 189 -> 10;
            case 190 -> 148;
            case 191 -> 177;
            case 192 -> 71;
            case 193 -> 210;
            case 194 -> 102;
            case 195 -> 208;
            case 196 -> 214;
            case 197 -> 186;
            case 198 -> 251;
            case 199 -> 145;
            case 200 -> 119;
            case 201 -> 131;
            case 202 -> 174;
            case 203 -> 201;
            case 204 -> 123;
            case 205 -> 254;
            case 206 -> 89;
            case 207 -> 39;
            case 208 -> 161;
            case 209 -> 173;
            case 210 -> 105;
            case 211 -> 112;
            case 212 -> 19;
            case 213 -> 80;
            case 214 -> 137;
            case 215 -> 21;
            case 216 -> 134;
            case 217 -> 110;
            case 218 -> 53;
            case 219 -> 13;
            case 220 -> 241;
            case 221 -> 17;
            case 222 -> 250;
            case 223 -> 253;
            case 224 -> 33;
            case 225 -> 221;
            case 226 -> 255;
            case 227 -> 139;
            case 228 -> 4;
            case 229 -> 55;
            case 230 -> 75;
            case 231 -> 74;
            case 232 -> 5;
            case 233 -> 109;
            case 234 -> 191;
            case 235 -> 228;
            case 236 -> 209;
            case 237 -> 121;
            case 238 -> 151;
            case 239 -> 165;
            case 240 -> 217;
            case 241 -> 178;
            case 242 -> 216;
            case 243 -> 82;
            case 244 -> 108;
            case 245 -> 229;
            case 246 -> 162;
            case 247 -> 163;
            case 248 -> 42;
            case 249 -> 63;
            case 250 -> 140;
            case 251 -> 239;
            case 252 -> 34;
            case 253 -> 23;
            case 254 -> 29;
            default -> 142;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Vec3 IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Vec3 lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final Vec3 IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(float var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Vec3(
            Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
            ),
            0.0,
            -Math.cos(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
            )
         );
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Vec3(
            Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl - 90.0)
            ),
            0.0,
            -Math.cos(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl - 90.0)
            )
         );
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new Vec3(
            Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + 90.0)
            ),
            0.0,
            -Math.cos(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + 90.0)
            )
         );
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Vec3(
            Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + 180.0)
            ),
            0.0,
            -Math.cos(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + 180.0)
            )
         );
      }

      public final double a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Vec3 c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Vec3 d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Vec3 e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
   }

   // PX-FIX synth restored from jar bytecode
  public static void h() { }
  public static void j() { }
}
