package me.octo.client;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII
   extends IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll
   implements lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI {
   public lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII(String var1, String var2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, String var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var12, int var13, kotlin.jvm.internal.DefaultConstructorMarker var14) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, (var13 & 256) != 0 ? 0.01f : var9, (var13 & 512) != 0 ? 0.01f : var10, (var13 & 1024) != 0 ? 0 : var11, var12);
   }

   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] d;
   private static String[] e;

   public lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var12
   ) {
      short var10001 = -29754;
      short var10002 = -32260;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -29749;
      var10002 = -17501;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -29760;
      var10002 = 29480;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = -29755;
      var10002 = -24595;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = -29757;
      var10002 = 16342;
      Intrinsics.checkNotNullParameter(var12, "settings");
      super(var1, var2, var3, var4, var11, Arrays.copyOf(var12, var12.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var5;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var6;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = Math.max(0.01F, var9);
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(0.01F, var10);
      if (var8 - var7 < this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
         float var13 = (var7 + var8) / 2.0F;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Math.max(
            var5, var13 - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2.0F
         );
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = Math.min(
            var6, var13 + (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + 0.01F) / 2.0F
         );
      } else {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var7;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var8;
      }
   }

   public lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var11
   ) {
         super(var1, var2, var3, var4, 0, Arrays.copyOf(var11, var11.length));
      label19: {
         String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
         short var10002 = -29750;
         short var10003 = -5586;
         Intrinsics.checkNotNullParameter(var1, "name");
         String[] var12 = var10000;
         short var10001 = -29746;
         var10002 = -17622;
         Intrinsics.checkNotNullParameter(var2, "description");
         var10001 = -29758;
         var10002 = 5133;
         Intrinsics.checkNotNullParameter(var3, "category");
         var10001 = -29747;
         var10002 = -8833;
         Intrinsics.checkNotNullParameter(var4, "subcategory");
         var10001 = -29756;
         var10002 = 3766;
         Intrinsics.checkNotNullParameter(var11, "settings");
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var5;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var6;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = Math.max(0.01F, var9);
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(0.01F, var10);
         if (var12 == null) {
            if (var8 - var7 < this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
               float var13 = (var7 + var8) / 2.0F;
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Math.max(
                  var5, var13 - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2.0F
               );
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = Math.min(
                  var6, var13 + (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + 0.01F) / 2.0F
               );
               if (var12 == null) {
                  break label19;
               }
            }

            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var7;
         }

         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var8;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.b(new String[4]);
      }
   }

   @Override
   public float q() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Override
   public float r() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @Override
   public float u() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @Override
   public float v() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @Override
   public float s() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @Override
   public float t() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   private final float d(float var1) {
      String[] var2 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
      float var10000 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      float var10001 = 0.01F;
      if (var2 == null) {
         if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI <= 0.01F) {
            return var1;
         }

         var10000 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         var10001 = Math.round(
               (var1 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII)
                  / this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            )
            * this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      return var10000 + var10001;
   }

   @Override
   public void b(float var1) {
      float var2 = Math.max(
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         Math.min(var1, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)
      );
      float var3 = this.d(var2);
      float var4 = (int)(var3 * 100) / 100.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Math.min(
         var4,
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
      );
      this.w();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   @Override
   public void c(float var1) {
      float var2 = Math.max(
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         Math.min(var1, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)
      );
      float var3 = this.d(var2);
      float var4 = (int)(var3 * 100) / 100.0F;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = Math.max(
         var4,
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
      );
      this.w();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   @Override
   public void a(int var1, int var2, float var3) {
      float var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1, var2, (int)var3)
      );
      this.b(var4);
   }

   @Override
   public void b(int var1, int var2, float var3) {
      float var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1, var2, (int)var3)
      );
      this.c(var4);
   }

   public void w() {
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new IlIIIIlIIllIIllIllIlIllIIlIIlIlIIIllIIlIIIlIlIlllIlIIlllllIllIIIlIIIlIIlIIIlIlllIIllI(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -29753;
      short var10002 = -4449;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = -29750;
      var10002 = -5586;
      var1.a("name", this.aj());
      var10001 = -29745;
      var10002 = -22023;
      var1.a("minValue", Float.valueOf(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl));
      var10001 = -29752;
      var10002 = -16928;
      var1.a("maxValue", Float.valueOf(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll));
      this.c(var1);
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      label15: {
         String[] var10000 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
         short var10002 = -29759;
         short var10003 = 11181;
         Intrinsics.checkNotNullParameter(var1, "data");
         String[] var2 = var10000;
         short var10001 = -29748;
         var10002 = 19955;
         float var3 = var1.a("minValue", this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         var10001 = -29751;
         var10002 = -24524;
         float var4 = var1.a("maxValue", this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
         if (var2 == null) {
            if (var4 - var3 < this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
               float var5 = (var3 + var4) / 2.0F;
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Math.max(
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                  var5 - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl / 2.0F
               );
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = Math.min(
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  var5 + (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl + 0.01F) / 2.0F
               );
               if (var2 == null) {
                  break label15;
               }
            }

            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3;
         }

         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var4;
      }

      this.w();
      this.d(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "½ç\u0015¾¡¶3þ\bÎøiÈ JÙJ\bñç\u009c¾\u0090¶\u0015þ\u0004\u0017Ë§?\u0004D©\u009fw\u0004Àé]{\b=Ü\u0017LïÚ X\u000bÑZ\u009c\u0099B\u008f\u009e¿6×W\u0004\u0086\u0092Ç\u0010\u000bY/i%Ü\u0005)Cq$n\b!_E\u009a dÂÛ\b¾Y¶Z^|\rØ\u000b1ødß}Z\u001d¨÷Y¾\b£¨\u0003m<\u009aA\u0004";
      int var4 = "½ç\u0015¾¡¶3þ\bÎøiÈ JÙJ\bñç\u009c¾\u0090¶\u0015þ\u0004\u0017Ë§?\u0004D©\u009fw\u0004Àé]{\b=Ü\u0017LïÚ X\u000bÑZ\u009c\u0099B\u008f\u009e¿6×W\u0004\u0086\u0092Ç\u0010\u000bY/i%Ü\u0005)Cq$n\b!_E\u009a dÂÛ\b¾Y¶Z^|\rØ\u000b1ødß}Z\u001d¨÷Y¾\b£¨\u0003m<\u009aA\u0004"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 85;
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
                     case 0 -> 99;
                     case 1 -> 60;
                     case 2 -> 74;
                     case 3 -> 18;
                     case 4 -> 40;
                     case 5 -> 122;
                     default -> 4;
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
                     d = var5;
                     e = new String[16];
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

                  var2 = "X¹\u00ad\u009e85\u0010 \u000bÖ)\u00ad&µ©±ª\u0002¤\u0000";
                  var4 = "X¹\u00ad\u009e85\u0010 \u000bÖ)\u00ad&µ©±ª\u0002¤\u0000".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 98;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -29758) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 110;
            case 1 -> 165;
            case 2 -> 87;
            case 3 -> 21;
            case 4 -> 214;
            case 5 -> 187;
            case 6 -> 32;
            case 7 -> 199;
            case 8 -> 167;
            case 9 -> 156;
            case 10 -> 48;
            case 11 -> 62;
            case 12 -> 196;
            case 13 -> 213;
            case 14 -> 95;
            case 15 -> 54;
            case 16 -> 106;
            case 17 -> 58;
            case 18 -> 188;
            case 19 -> 63;
            case 20 -> 231;
            case 21 -> 6;
            case 22 -> 144;
            case 23 -> 102;
            case 24 -> 172;
            case 25 -> 174;
            case 26 -> 9;
            case 27 -> 242;
            case 28 -> 65;
            case 29 -> 35;
            case 30 -> 206;
            case 31 -> 0;
            case 32 -> 158;
            case 33 -> 104;
            case 34 -> 64;
            case 35 -> 189;
            case 36 -> 8;
            case 37 -> 11;
            case 38 -> 38;
            case 39 -> 55;
            case 40 -> 19;
            case 41 -> 115;
            case 42 -> 248;
            case 43 -> 222;
            case 44 -> 118;
            case 45 -> 232;
            case 46 -> 137;
            case 47 -> 147;
            case 48 -> 184;
            case 49 -> 128;
            case 50 -> 127;
            case 51 -> 251;
            case 52 -> 197;
            case 53 -> 43;
            case 54 -> 192;
            case 55 -> 31;
            case 56 -> 92;
            case 57 -> 200;
            case 58 -> 143;
            case 59 -> 129;
            case 60 -> 93;
            case 61 -> 207;
            case 62 -> 163;
            case 63 -> 18;
            case 64 -> 22;
            case 65 -> 230;
            case 66 -> 15;
            case 67 -> 139;
            case 68 -> 82;
            case 69 -> 210;
            case 70 -> 100;
            case 71 -> 81;
            case 72 -> 225;
            case 73 -> 133;
            case 74 -> 26;
            case 75 -> 96;
            case 76 -> 105;
            case 77 -> 120;
            case 78 -> 46;
            case 79 -> 4;
            case 80 -> 67;
            case 81 -> 112;
            case 82 -> 203;
            case 83 -> 138;
            case 84 -> 140;
            case 85 -> 211;
            case 86 -> 84;
            case 87 -> 131;
            case 88 -> 59;
            case 89 -> 191;
            case 90 -> 149;
            case 91 -> 244;
            case 92 -> 16;
            case 93 -> 28;
            case 94 -> 223;
            case 95 -> 51;
            case 96 -> 73;
            case 97 -> 237;
            case 98 -> 40;
            case 99 -> 74;
            case 100 -> 24;
            case 101 -> 190;
            case 102 -> 30;
            case 103 -> 164;
            case 104 -> 91;
            case 105 -> 245;
            case 106 -> 49;
            case 107 -> 23;
            case 108 -> 194;
            case 109 -> 125;
            case 110 -> 134;
            case 111 -> 152;
            case 112 -> 42;
            case 113 -> 186;
            case 114 -> 224;
            case 115 -> 47;
            case 116 -> 193;
            case 117 -> 198;
            case 118 -> 204;
            case 119 -> 57;
            case 120 -> 34;
            case 121 -> 142;
            case 122 -> 53;
            case 123 -> 153;
            case 124 -> 145;
            case 125 -> 228;
            case 126 -> 69;
            case 127 -> 111;
            case 128 -> 181;
            case 129 -> 76;
            case 130 -> 94;
            case 131 -> 99;
            case 132 -> 61;
            case 133 -> 226;
            case 134 -> 159;
            case 135 -> 220;
            case 136 -> 79;
            case 137 -> 161;
            case 138 -> 150;
            case 139 -> 37;
            case 140 -> 241;
            case 141 -> 29;
            case 142 -> 20;
            case 143 -> 108;
            case 144 -> 135;
            case 145 -> 185;
            case 146 -> 123;
            case 147 -> 39;
            case 148 -> 77;
            case 149 -> 1;
            case 150 -> 50;
            case 151 -> 215;
            case 152 -> 209;
            case 153 -> 236;
            case 154 -> 136;
            case 155 -> 157;
            case 156 -> 113;
            case 157 -> 249;
            case 158 -> 78;
            case 159 -> 234;
            case 160 -> 126;
            case 161 -> 72;
            case 162 -> 205;
            case 163 -> 141;
            case 164 -> 117;
            case 165 -> 122;
            case 166 -> 70;
            case 167 -> 180;
            case 168 -> 240;
            case 169 -> 216;
            case 170 -> 176;
            case 171 -> 130;
            case 172 -> 41;
            case 173 -> 85;
            case 174 -> 177;
            case 175 -> 121;
            case 176 -> 80;
            case 177 -> 155;
            case 178 -> 17;
            case 179 -> 124;
            case 180 -> 217;
            case 181 -> 107;
            case 182 -> 171;
            case 183 -> 239;
            case 184 -> 175;
            case 185 -> 86;
            case 186 -> 88;
            case 187 -> 148;
            case 188 -> 233;
            case 189 -> 98;
            case 190 -> 170;
            case 191 -> 97;
            case 192 -> 218;
            case 193 -> 178;
            case 194 -> 71;
            case 195 -> 83;
            case 196 -> 2;
            case 197 -> 3;
            case 198 -> 169;
            case 199 -> 132;
            case 200 -> 195;
            case 201 -> 27;
            case 202 -> 247;
            case 203 -> 173;
            case 204 -> 221;
            case 205 -> 246;
            case 206 -> 36;
            case 207 -> 33;
            case 208 -> 202;
            case 209 -> 179;
            case 210 -> 168;
            case 211 -> 68;
            case 212 -> 109;
            case 213 -> 12;
            case 214 -> 160;
            case 215 -> 219;
            case 216 -> 114;
            case 217 -> 151;
            case 218 -> 254;
            case 219 -> 44;
            case 220 -> 90;
            case 221 -> 243;
            case 222 -> 66;
            case 223 -> 52;
            case 224 -> 116;
            case 225 -> 146;
            case 226 -> 14;
            case 227 -> 208;
            case 228 -> 229;
            case 229 -> 5;
            case 230 -> 45;
            case 231 -> 89;
            case 232 -> 162;
            case 233 -> 183;
            case 234 -> 56;
            case 235 -> 103;
            case 236 -> 238;
            case 237 -> 166;
            case 238 -> 227;
            case 239 -> 154;
            case 240 -> 253;
            case 241 -> 119;
            case 242 -> 25;
            case 243 -> 212;
            case 244 -> 255;
            case 245 -> 10;
            case 246 -> 13;
            case 247 -> 250;
            case 248 -> 75;
            case 249 -> 60;
            case 250 -> 7;
            case 251 -> 252;
            case 252 -> 101;
            case 253 -> 182;
            case 254 -> 201;
            default -> 235;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
      public lIIIllIlIlIIllIIlIlIlIlIlIlIlIlIIlIlIlIIlIllIIllIlIIllIIlIllllllllllIIlIIlIIIllllIlII(java.lang.String p0, java.lang.String p1, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p2, java.lang.String p3, float p4, float p5, float p6, float p7, float p8, float p9, me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] p10, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this(p0, p1, p2, p3, p4, p5, p6, p7, (mask & 256) != 0 ? 0.01f : p8, (mask & 512) != 0 ? 0.01f : p9, p10);
      }
}
