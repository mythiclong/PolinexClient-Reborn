package me.octo.client.utils.player;

import java.util.Random;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll
   extends IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI {
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private float llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private float IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final float[][] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private boolean llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static String b;

   public IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1
   ) {
      Intrinsics.checkNotNullParameter(var1, b);
      super(var1);
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.016F;
      int var2 = 0;

      float[][] var3;
      for (var3 = new float[4][]; var2 < 4; var2++) {
         var3[var2] = new float[2];
      }

      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var3;
   }

   private final Random g() {
      return this.a().g();
   }

   @Override
   public void a(float var1, float var2, float var3, float var4) {
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var10000;
      int var5 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      var10000 = this.a();
      label25:
      if (var5 != 0) {
         if (var10000.h()) {
            var10000 = this.a();
            if (var5 == 0) {
               break label25;
            }

            if (!var10000.i()) {
               float var6 = Math.abs(
                  lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c(var1 - this.a().l())
               );
               float var7 = Math.abs(var2 - this.a().m());
               float var10 = var6 + var7;
               if (var5 != 0) {
                  if (var10 < 1.5F) {
                     this.b(var1, var2);
                     return;
                  }

                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
                  this.a().a(var3);
                  this.a().b(var4);
                  this.a().c(var1);
                  this.a().d(var2);
                  var10 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c(this.a().l() - this.a().j());
               }

               float var8 = var10;
               float var9 = this.a().m() - this.a().k();
               this.a().e((float)Math.sqrt(var8 * var8 + var9 * var9));
               this.c();
               return;
            }
         }

         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0.0F;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0.0F;
         var10000 = this.a();
      }

      var10000.a(var3, var4, var1, var2, this);
   }

   private final void b(float var1, float var2) {
      Object var9 = null; // PX-FIX
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      float var4 = var1 - this.a().l();
      int var3 = var10000;
      float var5 = var2 - this.a().m();
      boolean var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      if (var3 != 0) {
         if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl += var4;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI += var5;
         }

         this.a().c(var1);
         this.a().d(var2);
         var8 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      }

      label33: {
         if (var3 != 0) {
            if (!var8) {
               return;
            }

            var9 = this;
            if (var3 == 0) {
               break label33;
            }

            var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var8) {
            return;
         }

         var9 = this;
      }

      float[] var6 = (float[])((Object[])this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll)[3];
      var6[0] += var4;
      var6 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3];
      var6[1] += var5;
   }

   @Override
   public void c() {
      int var1;
      float var2;
      float var3;
      float var4;
      float var10;
      float var10001;
      label68: {
         int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
         var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(this.a().l() - this.a().j());
         var3 = this.a().m() - this.a().k();
         var4 = RangesKt.coerceAtLeast(this.a().G() * this.a().k(this.a().n()), 0.1F);
         var1 = var10000;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.a().f(this.a().n(), var4);
         var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         float var11;
         int var10002 = (var11 = this.a().n() - 60.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
         if (var1 == 0) {
            if (var10002 < 0) {
               var10 = 1.0F;
               break label68;
            }

            float var12;
            var10002 = (var12 = this.a().n() - 80.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         }

         if (var1 == 0) {
            if (var10002 < 0) {
               var10 = 1.14F;
               break label68;
            }

            float var13;
            var10002 = (var13 = this.a().n() - 100.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
         }

         if (var1 == 0) {
            if (var10002 < 0) {
               var10 = 1.22F;
               break label68;
            }

            var10 = this.a().n();
            if (var1 != 0) {
               break label68;
            }

            float var14;
            var10002 = (var14 = var10 - 120.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         }

         var10 = var10002 < 0 ? 1.3F : 1.38F;
      }

      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var9;
      label70: {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var10001 * var10;
         boolean var8 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         if (var1 == 0) {
            if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll *= 0.85F;
            }

            this.a().f(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
            var9 = this;
            if (var1 != 0) {
               break label70;
            }

            var8 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         if (var8) {
            float var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll * 0.75F / 1000.0F;
            if (var1 != 0) {
               return;
            }

            if (var5 > 0.001F) {
               float var6 = 2.0F * Math.abs(var2) / var5;
               float var7 = 2.0F * Math.abs(var3) / var5;
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = RangesKt.coerceIn(
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, -var6, var6
               );
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = RangesKt.coerceIn(
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, -var7, var7
               );
            }
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.a().l();
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.a().m();
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0.0F;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0F;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0F;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = this.a().j();
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.a().k();
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.016F;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.g().nextFloat() * (float) (Math.PI * 2);
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = System.currentTimeMillis();
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         this.a().b(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         this.a().c(false);
         this.a().g(this.a().n(), var4);
         this.c(var2, var3);
         this.a().b(false);
         var9 = this;
      }

      var9.a().a(true);
   }

   private final void c(float var1, float var2) {
      Object var17 = null; // PX-FIX
      float var16 = 0; // PX-FIX
      Object var14 = null; // PX-FIX
      float var4 = this.a().n();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][0] = this.a().j();
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][1] = this.a().k();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][0] = this.a().l();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][1] = this.a().m();
      int var3 = var10000;
      if (var3 != 0) {
         label76: {
            label70: {
               if (!(var4 < 8.0F)) {
                  var14 = this;
                  if (var3 == 0) {
                     break label76;
                  }

                  if (!(this.a().T() <= 0.0F)) {
                     float var19;
                     var10000 = (var19 = this.g().nextFloat() - 0.55F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
                     if (var3 == 0) {
                        break label70;
                     }

                     if (var10000 <= 0) {
                        this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = true;
                        float var20;
                        var10000 = (var20 = var4 - 20.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
                        break label70;
                     }
                  }
               }

               var14 = this;
               break label76;
            }

            label77: {
               if (var3 != 0) {
                  if (var10000 < 0) {
                     var17 = 0.05F + this.g().nextFloat() * 0.025F;
                     break label77;
                  }

                  float var21;
                  var10000 = (var21 = var4 - 40.0F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
               }

               float var10001;
               label78: {
                  if (var3 != 0) {
                     if (var10000 < 0) {
                        var17 = 0.085F + this.g().nextFloat() * 0.03F;
                        break label77;
                     }

                     var16 = var4;
                     var10001 = 80.0F;
                     if (var3 == 0) {
                        break label78;
                     }

                     float var22;
                     var10000 = (var22 = var4 - 80.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     var17 = 0.11F + this.g().nextFloat() * 0.03F;
                     break label77;
                  }

                  var16 = 0.115F;
                  var10001 = this.g().nextFloat() * 0.03F;
               }

               var17 = var16 + var10001;
            }

            float var5 = RangesKt.coerceIn(((Float)(var17)).floatValue(), 0.02F, 0.16F);
            float var6 = 0.28F + this.g().nextFloat() * 0.1F;
            float var7 = 0.62F + this.g().nextFloat() * 0.1F;
            float var8 = this.g().nextBoolean() ? 1.0F : -1.0F;
            float var18 = this.g().nextFloat();
            if (var3 != 0) {
               var18 = var18 < 0.15F ? -var8 : var8;
            }

            float var9 = var18;
            float var10 = -var2;
            float var12 = var5 * (0.9F + this.g().nextFloat() * 0.2F);
            float var13 = var5 * (0.9F + this.g().nextFloat() * 0.2F);
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][0] = this.a().j()
               + var1 * var6
               + var10 * var12 * var8;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][1] = this.a().k() + var2 * var6 + var1 * var12 * var8;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][0] = this.a().j()
               + var1 * var7
               + var10 * var13 * var9;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][1] = this.a().k() + var2 * var7 + var1 * var13 * var9;
            return;
         }

         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
      }
   }

   private final Pair<Float, Float> a(float var1) {
      float var10;
      float var10001;
      label23: {
         int var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
         float var11;
         int var10000 = (var11 = var1 - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
         if (var2 == 0) {
            if (var10000 <= 0) {
               return TuplesKt.to(
                  this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][0],
                  this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][1]
               );
            }

            var10 = var1;
            var10001 = 1.0F;
            if (var2 != 0) {
               break label23;
            }

            float var12;
            var10000 = (var12 = var1 - 1.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         }

         if (var10000 >= 0) {
            return TuplesKt.to(
               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][0],
               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][1]
            );
         }

         var10 = 1.0F;
         var10001 = var1;
      }

      float var3 = var10 - var10001;
      float var4 = var3 * var3;
      float var5 = var4 * var3;
      float var6 = var1 * var1;
      float var7 = var6 * var1;
      float var8 = var5 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][0]
         + 3.0F * var4 * var1 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][0]
         + 3.0F * var3 * var6 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][0]
         + var7 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][0];
      float var9 = var5 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][1]
         + 3.0F * var4 * var1 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][1]
         + 3.0F * var3 * var6 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][1]
         + var7 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][1];
      return TuplesKt.to(var8, var9);
   }

   @Override
   public void b() {
      Object var43 = null; // PX-FIX
      Object var42 = null; // PX-FIX
      float var41 = 0; // PX-FIX
      int var1 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      if (var1 != 0) {
         LocalPlayer var10000 = this.a().a().player;
         if (var10000 != null) {
            LocalPlayer var2;
            float var5;
            float var6;
            label61: {
               var2 = var10000;
               long var3 = System.currentTimeMillis();
               var5 = (float)RangesKt.coerceAtLeast(var3 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, 1L)
                  / 1000.0F;
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var3;
               var6 = (float)(var3 - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
               float var40 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               float var10001 = 0.0F;
               if (var1 != 0) {
                  if (!(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll > 0.0F)) {
                     var41 = 0.0F;
                     break label61;
                  }

                  var40 = var6 / this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  var10001 = 0.0F;
               }

               var41 = RangesKt.coerceIn(var40, var10001, 1.0F);
            }

            label55: {
               float var7 = var41;
               Vec3 var8 = this.a().t();
               if (var8 != null) {
                  float var46;
                  var42 = (var46 = var7 - 0.7F) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
                  if (var1 == 0) {
                     break label55;
                  }

                  if (((Boolean)var42)) {
                     float var12;
                     float var13;
                     label50: {
                        lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var9 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var8);
                        float var10 = var2.getYRot();
                        float var11 = var2.getXRot();
                        var12 = var10
                           + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .c(var9.a() - var10);
                        var13 = var11
                           + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .c(var9.b() - var11);
                        float var14 = Math.abs(
                              lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .c(var12 - this.a().l())
                           )
                           + Math.abs(var13 - this.a().m());
                        float var47;
                        var43 = (var47 = 0.02F - var14) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
                        if (var1 != 0) {
                           if (((Boolean)var43)) {
                              var43 = 0;
                              break label50;
                           }

                           float var48;
                           var43 = (var48 = var14 - 1.5F) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
                        }

                        if (var1 != 0) {
                           var43 = ((Boolean)var43) ? 1 : 0;
                        }
                     }

                     if (!((Boolean)var43)) {
                        this.b(var12, var13);
                     }
                  }
               }

               float var49;
               var42 = (var49 = var6 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) == 0.0F
                  ? 0
                  : (var49 < 0.0F ? -1 : 1);
            }

            if (((Boolean)var42)) {
               this.a(this.a().l(), this.a().m());
               this.a().y();
               return;
            }

            Pair var31 = this.b(var6);
            float var32 = ((Number)var31.component1()).floatValue();
            float var33 = ((Number)var31.component2()).floatValue();
            float var34 = RangesKt.coerceIn(var6 / this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, 0.0F, 1.0F);
            float var35 = this.a().T();
            float var36 = this.c(var34);
            float var15 = RangesKt.coerceIn(this.a().n() / 40.0F, 0.0F, 1.0F);
            float var16 = var36 * var15;
            float var17 = this.a().Q() * var35 * (float)Math.pow(1.0F - var34, 0.6F);
            float var18 = (float)Math.exp(-var5 / 0.12F);
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  * var18
               + (float)this.g().nextGaussian() * var17 * (float)Math.sqrt(var5);
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  * var18
               + (float)this.g().nextGaussian() * var17 * (float)Math.sqrt(var5) * 0.6F;
            float var19 = var34 * (1.0F - var34);
            float var20 = 16.0F * var19 * var19;
            float var21 = this.a().R() * var35 * var20;
            float var22 = (float)Math.sin(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + var34 * 4.5F) * var21;
            float var23 = (float)Math.cos(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + var34 * 4.5F)
               * var21
               * 0.5F;
            float var24 = var32 + (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll + var22) * var16;
            float var25 = var33 + (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + var23) * var16;
            float var26 = RangesKt.coerceAtLeast(var5, 0.001F);
            float var27 = (float)Math.sqrt(
               (float)Math.pow((var24 - this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) / var26, 2)
                  + (float)Math.pow((var25 - this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) / var26, 2)
            );
            float var28 = this.a().S() * var35 * RangesKt.coerceIn(var27 / 200.0F, 0.0F, 1.5F);
            float var29 = (float)Math.exp(-var5 / 0.05F);
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                  * var29
               + (float)this.g().nextGaussian() * var28;
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  * var29
               + (float)this.g().nextGaussian() * var28 * 0.7F;
            var24 += this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI * var16;
            var25 += this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl * var16;
            float var44 = var34;
            float var45 = 0.85F;
            if (var1 != 0) {
               if (var34 > 0.85F) {
                  float var30 = (float)Math.pow(RangesKt.coerceIn((var34 - 0.85F) / 0.15F, 0.0F, 1.0F), 1.5F);
                  var24 = this.a(var24, this.a().l(), var30);
                  var25 = this.a(var25, this.a().m(), var30);
               }

               var44 = var5;
               var45 = 0.001F;
            }

            float var39 = RangesKt.coerceAtLeast(var44, var45);
            this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = (
                  var24 - this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
               )
               / var39;
            this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = (
                  var25 - this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
               )
               / var39;
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var24;
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var25;
            this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var5;
            this.a(var24, var25);
            return;
         }
      }
   }

   private final Pair<Float, Float> b(float var1) {
      int var2;
      float var15;
      float var10001;
      label65: {
         label64: {
            var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
            int var10000 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
            if (var2 != 0) {
               if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                  break label64;
               }

               var15 = var1;
               var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               if (var2 == 0) {
                  break label65;
               }

               float var22;
               var10000 = (var22 = var1 - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) == 0.0F
                  ? 0
                  : (var22 < 0.0F ? -1 : 1);
            }

            if (var10000 >= 0) {
               float var3 = RangesKt.coerceIn(
                  (var1 - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)
                     / (
                        this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                           - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     ),
                  0.0F,
                  1.0F
               );
               float var4 = this.a().j(var3);
               return TuplesKt.to(
                  this.a(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, this.a().l(), var4),
                  this.a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, this.a().m(), var4)
               );
            }
         }

         var15 = var1 / this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var10001 = 0.0F;
      }

      float var12;
      label55: {
         var12 = RangesKt.coerceIn(var15, var10001, 1.0F);
         IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var16 = this;
         if (var2 != 0) {
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
               var15 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               break label55;
            }

            var16 = this;
         }

         var15 = var16.a().l();
      }

      float var13;
      label49: {
         var13 = var15;
         IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var18 = this;
         if (var2 != 0) {
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
               var15 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               break label49;
            }

            var18 = this;
         }

         var15 = var18.a().m();
      }

      float var5 = var15;
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var20 = this;
      if (var2 != 0) {
         if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
            float var14 = var12 * var12;
            float var7 = var14 * var12;
            float var8 = 2.0F * var7 - 3.0F * var14 + 1.0F;
            float var9 = var7 - 2.0F * var14 + var12;
            float var10 = -2.0F * var7 + 3.0F * var14;
            float var11 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI / 1000.0F;
            return TuplesKt.to(
               var8 * this.a().j() + var9 * this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI * var11 + var10 * var13,
               var8 * this.a().k() + var9 * this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl * var11 + var10 * var5
            );
         }

         var20 = this;
      }

      float var6 = var20.a().j(var12);
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var21 = this;
      if (var2 != 0) {
         if (this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
            if (var2 == 0) {
               return TuplesKt.to(this.a(this.a().j(), var13, var6), this.a(this.a().k(), var5, var6));
            }

            if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
               return this.a(var6);
            }
         }

         var21 = this;
      }

      return TuplesKt.to(var21.a(this.a().j(), var13, var6), this.a(this.a().k(), var5, var6));
   }

   @Override
   public void d() {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0F;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0F;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0.0F;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 0.0F;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 0.0F;
   }

   private final float a(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   private final float c(float var1) {
      int var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      float var5;
      int var10000 = (var5 = var1 - 0.5F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (var2 != 0) {
         if (var10000 < 0) {
            return 1.0F - var1 / 0.5F * 0.2F;
         }

         float var6;
         var10000 = (var6 = var1 - 0.7F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.8F - (var1 - 0.5F) / 0.2F * 0.4F;
         }

         float var7;
         var10000 = (var7 = var1 - 0.8F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.4F - (var1 - 0.7F) / 0.1F * 0.2F;
         }

         float var8;
         var10000 = (var8 = var1 - 0.9F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.2F - (var1 - 0.8F) / 0.1F * 0.15F;
         }

         if (var2 == 0) {
            return var1 - 0.95F;
         }

         float var9;
         var10000 = (var9 = var1 - 0.95F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      }

      return var10000 >= 0 ? 0.0F : 0.05F - (var1 - 0.9F) / 0.05F * 0.05F;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "e7\u001d\u001f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 31;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 31;
         var10006 = var0;
      } else {
         var6 = 31;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 31;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 25;
            case 1 -> 71;
            case 2 -> 112;
            case 3 -> 101;
            case 4 -> 67;
            case 5 -> 33;
            default -> 39;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               break pxClinit; // PX-FIX
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   } // PX-FIX end pxClinit
   }
}
