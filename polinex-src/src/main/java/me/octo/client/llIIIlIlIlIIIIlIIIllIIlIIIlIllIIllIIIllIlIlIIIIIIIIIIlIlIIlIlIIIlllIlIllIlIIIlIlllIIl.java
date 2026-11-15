package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class llIIIlIlIlIIIIlIIIllIIlIIIlIllIIllIIIllIlIlIIIIIIIIIIlIlIIlIlIIIlllIlIllIlIIIlIlllIIl
   extends IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll
   implements lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI {
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] d;
   private static String[] e;

   public llIIIlIlIlIIIIlIIIllIIlIIIlIllIIllIIIllIlIlIIIIIIIIIIlIlIIlIlIIIlllIlIllIlIIIlIlllIIl(
      @NotNull String var1, @NotNull String var2, float var3, float var4, float var5, float var6, float var7, float var8
   ) {
      short var10001 = 4448;
      short var10002 = 5141;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 4455;
      var10002 = -16163;
      Intrinsics.checkNotNullParameter(var2, "description");
      super(var1, var2);
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var4;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Math.max(0.01F, var7);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Math.max(0.01F, var8);
      String[] var9 = var10000;
      if (var9 == null) {
         if (var6 - var5 < this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
            float var10 = (var5 + var6) / 2.0F;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.max(
               var3, var10 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII / 2.0F
            );
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.min(
               var4, var10 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 0.01F) / 2.0F
            );
            if (var9 == null) {
               return;
            }
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
   }

   public llIIIlIlIlIIIIlIIIllIIlIIIlIllIIllIIIllIlIlIIIIIIIIIIlIlIIlIlIIIlllIlIllIlIIIlIlllIIl(
      @NotNull String var1, float var2, float var3, float var4, float var5, float var6, float var7
   ) {
      short var10001 = 4449;
      short var10002 = 8791;
      Intrinsics.checkNotNullParameter(var1, "name");
      super(var1);
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Math.max(0.01F, var6);
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Math.max(0.01F, var7);
      String[] var8 = var10000;
      if (var8 == null) {
         if (var5 - var4 < this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
            float var9 = (var4 + var5) / 2.0F;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.max(
               var2, var9 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII / 2.0F
            );
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.min(
               var3, var9 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 0.01F) / 2.0F
            );
            if (var8 == null) {
               return;
            }
         }

         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      }

      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
   }

   public llIIIlIlIlIIIIlIIIllIIlIIIlIllIIllIIIllIlIlIIIIIIIIIIlIlIIlIlIIIlllIlIllIlIIIlIlllIIl(
      String var1, String var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, kotlin.jvm.internal.DefaultConstructorMarker var10
   ) {
      if ((var9 & 64) != 0) {
         var7 = 0.01F;
      }

      if ((var9 & 128) != 0) {
         var8 = 0.01F;
      }

      this(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public llIIIlIlIlIIIIlIIIllIIlIIIlIllIIllIIIllIlIlIIIIIIIIIIlIlIIlIlIIIlllIlIllIlIIIlIlllIIl(
      String var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, kotlin.jvm.internal.DefaultConstructorMarker var9
   ) {
      if ((var8 & 32) != 0) {
         var6 = 0.01F;
      }

      if ((var8 & 64) != 0) {
         var7 = 0.01F;
      }

      this(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public float q() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @Override
   public float r() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @Override
   public float u() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Override
   public float v() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @Override
   public float s() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @Override
   public float t() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   private final float d(float var1) {
      String[] var2 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      float var10000 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      float var10001 = 0.01F;
      if (var2 == null) {
         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI <= 0.01F) {
            return var1;
         }

         var10000 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         var10001 = Math.round(
               (var1 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll)
                  / this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            )
            * this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      return var10000 + var10001;
   }

   @Override
   public void b(float var1) {
      float var2 = Math.max(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         Math.min(var1, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
      );
      float var3 = this.d(var2);
      float var4 = (int)(var3 * 100) / 100.0F;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.min(
         var4,
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      this.w();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   @Override
   public void c(float var1) {
      float var2 = Math.max(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         Math.min(var1, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
      );
      float var3 = this.d(var2);
      float var4 = (int)(var3 * 100) / 100.0F;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.max(
         var4,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      this.w();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   @Override
   public void a(int var1, int var2, float var3) {
      float var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1, var2, (int)var3)
      );
      this.b(var4);
   }

   @Override
   public void b(int var1, int var2, float var3) {
      float var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
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
      return new IllIlIIlIllIIIIIlllIIIIIIllIIIlIllIlIlIllIIIlIlIllIlIlIlIllIIlIIlllIIllIIlllIIlIIlIlI(this);
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return new llIlllIllllIIlllIlIIIlIIlIlllIlllIlIIIlIIlIIIIIlIIllllIlllIIIlllIIIlllIllIlIIlIlIlIll(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 4451;
      short var10002 = -14300;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = 4452;
      var10002 = -20920;
      var1.a("minValue", Float.valueOf(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII));
      var10001 = 4453;
      var10002 = 3554;
      var1.a("maxValue", Float.valueOf(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI));
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      label15: {
         short var10001 = 4454;
         short var10002 = -27340;
         Intrinsics.checkNotNullParameter(var1, "data");
         String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
         var10002 = 4450;
         short var10003 = 18956;
         float var3 = var1.a("minValue", this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         String[] var2 = var10000;
         var10001 = 4463;
         var10002 = 24323;
         float var4 = var1.a("maxValue", this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         if (var2 == null) {
            if (var4 - var3 < this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
               float var5 = (var3 + var4) / 2.0F;
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.max(
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  var5 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII / 2.0F
               );
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.min(
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  var5 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 0.01F) / 2.0F
               );
               if (var2 == null) {
                  break label15;
               }
            }

            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
         }

         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var4;
      }

      this.w();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "tàcÕ÷{~\u0084ûs6\u0004\u0012Ä¨×\b\u001e\u0089\rIC~\u009c\u0090\bÍ\u0013a\u0013\u001a5·ù\u0004PÉàv\bþ´\u0007çÖ«.*\u0004\u009c®+\u009e";
      int var4 = "tàcÕ÷{~\u0084ûs6\u0004\u0012Ä¨×\b\u001e\u0089\rIC~\u009c\u0090\bÍ\u0013a\u0013\u001a5·ù\u0004PÉàv\bþ´\u0007çÖ«.*\u0004\u009c®+\u009e"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 29;
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
                     case 0 -> 14;
                     case 1 -> 126;
                     case 2 -> 9;
                     case 3 -> 18;
                     case 4 -> 107;
                     case 5 -> 91;
                     default -> 31;
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
                     e = new String[9];
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

                  var2 = "í\u0093\u008d±\bHXOû\u0083 \fÃ";
                  var4 = "í\u0093\u008d±\bHXOû\u0083 \fÃ".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 48;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 4455) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 146;
            case 1 -> 207;
            case 2 -> 141;
            case 3 -> 36;
            case 4 -> 90;
            case 5 -> 132;
            case 6 -> 126;
            case 7 -> 11;
            case 8 -> 159;
            case 9 -> 230;
            case 10 -> 84;
            case 11 -> 200;
            case 12 -> 28;
            case 13 -> 130;
            case 14 -> 226;
            case 15 -> 179;
            case 16 -> 138;
            case 17 -> 167;
            case 18 -> 87;
            case 19 -> 99;
            case 20 -> 184;
            case 21 -> 115;
            case 22 -> 189;
            case 23 -> 190;
            case 24 -> 50;
            case 25 -> 161;
            case 26 -> 143;
            case 27 -> 44;
            case 28 -> 79;
            case 29 -> 175;
            case 30 -> 25;
            case 31 -> 105;
            case 32 -> 250;
            case 33 -> 129;
            case 34 -> 12;
            case 35 -> 245;
            case 36 -> 187;
            case 37 -> 7;
            case 38 -> 30;
            case 39 -> 206;
            case 40 -> 61;
            case 41 -> 111;
            case 42 -> 205;
            case 43 -> 163;
            case 44 -> 211;
            case 45 -> 63;
            case 46 -> 171;
            case 47 -> 166;
            case 48 -> 219;
            case 49 -> 31;
            case 50 -> 158;
            case 51 -> 29;
            case 52 -> 202;
            case 53 -> 174;
            case 54 -> 170;
            case 55 -> 116;
            case 56 -> 208;
            case 57 -> 113;
            case 58 -> 52;
            case 59 -> 93;
            case 60 -> 69;
            case 61 -> 120;
            case 62 -> 112;
            case 63 -> 9;
            case 64 -> 59;
            case 65 -> 246;
            case 66 -> 183;
            case 67 -> 253;
            case 68 -> 147;
            case 69 -> 172;
            case 70 -> 8;
            case 71 -> 214;
            case 72 -> 100;
            case 73 -> 76;
            case 74 -> 197;
            case 75 -> 131;
            case 76 -> 5;
            case 77 -> 178;
            case 78 -> 83;
            case 79 -> 251;
            case 80 -> 242;
            case 81 -> 125;
            case 82 -> 46;
            case 83 -> 235;
            case 84 -> 67;
            case 85 -> 229;
            case 86 -> 239;
            case 87 -> 193;
            case 88 -> 204;
            case 89 -> 134;
            case 90 -> 135;
            case 91 -> 10;
            case 92 -> 41;
            case 93 -> 188;
            case 94 -> 169;
            case 95 -> 137;
            case 96 -> 71;
            case 97 -> 3;
            case 98 -> 199;
            case 99 -> 210;
            case 100 -> 221;
            case 101 -> 160;
            case 102 -> 68;
            case 103 -> 218;
            case 104 -> 249;
            case 105 -> 233;
            case 106 -> 34;
            case 107 -> 237;
            case 108 -> 121;
            case 109 -> 252;
            case 110 -> 248;
            case 111 -> 196;
            case 112 -> 122;
            case 113 -> 241;
            case 114 -> 107;
            case 115 -> 127;
            case 116 -> 220;
            case 117 -> 191;
            case 118 -> 232;
            case 119 -> 180;
            case 120 -> 104;
            case 121 -> 106;
            case 122 -> 26;
            case 123 -> 14;
            case 124 -> 72;
            case 125 -> 162;
            case 126 -> 224;
            case 127 -> 228;
            case 128 -> 254;
            case 129 -> 42;
            case 130 -> 54;
            case 131 -> 198;
            case 132 -> 56;
            case 133 -> 82;
            case 134 -> 53;
            case 135 -> 96;
            case 136 -> 73;
            case 137 -> 47;
            case 138 -> 98;
            case 139 -> 39;
            case 140 -> 18;
            case 141 -> 213;
            case 142 -> 177;
            case 143 -> 118;
            case 144 -> 22;
            case 145 -> 201;
            case 146 -> 165;
            case 147 -> 80;
            case 148 -> 123;
            case 149 -> 142;
            case 150 -> 128;
            case 151 -> 27;
            case 152 -> 139;
            case 153 -> 19;
            case 154 -> 51;
            case 155 -> 23;
            case 156 -> 192;
            case 157 -> 94;
            case 158 -> 236;
            case 159 -> 209;
            case 160 -> 58;
            case 161 -> 66;
            case 162 -> 223;
            case 163 -> 78;
            case 164 -> 17;
            case 165 -> 164;
            case 166 -> 75;
            case 167 -> 151;
            case 168 -> 152;
            case 169 -> 216;
            case 170 -> 145;
            case 171 -> 234;
            case 172 -> 227;
            case 173 -> 110;
            case 174 -> 255;
            case 175 -> 62;
            case 176 -> 4;
            case 177 -> 181;
            case 178 -> 124;
            case 179 -> 0;
            case 180 -> 240;
            case 181 -> 89;
            case 182 -> 217;
            case 183 -> 243;
            case 184 -> 238;
            case 185 -> 225;
            case 186 -> 81;
            case 187 -> 173;
            case 188 -> 40;
            case 189 -> 182;
            case 190 -> 203;
            case 191 -> 95;
            case 192 -> 38;
            case 193 -> 144;
            case 194 -> 57;
            case 195 -> 157;
            case 196 -> 24;
            case 197 -> 244;
            case 198 -> 45;
            case 199 -> 156;
            case 200 -> 185;
            case 201 -> 186;
            case 202 -> 133;
            case 203 -> 103;
            case 204 -> 212;
            case 205 -> 168;
            case 206 -> 74;
            case 207 -> 13;
            case 208 -> 55;
            case 209 -> 247;
            case 210 -> 231;
            case 211 -> 88;
            case 212 -> 32;
            case 213 -> 77;
            case 214 -> 1;
            case 215 -> 150;
            case 216 -> 153;
            case 217 -> 154;
            case 218 -> 6;
            case 219 -> 97;
            case 220 -> 194;
            case 221 -> 222;
            case 222 -> 149;
            case 223 -> 148;
            case 224 -> 48;
            case 225 -> 70;
            case 226 -> 37;
            case 227 -> 85;
            case 228 -> 65;
            case 229 -> 108;
            case 230 -> 35;
            case 231 -> 117;
            case 232 -> 109;
            case 233 -> 91;
            case 234 -> 215;
            case 235 -> 21;
            case 236 -> 49;
            case 237 -> 140;
            case 238 -> 102;
            case 239 -> 15;
            case 240 -> 155;
            case 241 -> 20;
            case 242 -> 16;
            case 243 -> 176;
            case 244 -> 92;
            case 245 -> 64;
            case 246 -> 60;
            case 247 -> 33;
            case 248 -> 136;
            case 249 -> 86;
            case 250 -> 195;
            case 251 -> 2;
            case 252 -> 114;
            case 253 -> 43;
            case 254 -> 101;
            default -> 119;
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
}
