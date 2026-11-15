package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll
   extends IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll
   implements IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll(Object... px) {
           this((String)null, (String)null, 0, 0, 0, 0, 0, 0); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   public lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll(
      String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
      kotlin.jvm.internal.DefaultConstructorMarker var9
   ) {
      if ((var8 & 32) != 0) {
         var6 = 1;
      }
      if ((var8 & 64) != 0) {
         var7 = 1;
      }
      this(var1, var2, var3, var4, var5, var6, var7);
   }

   public lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll(
      String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9,
      kotlin.jvm.internal.DefaultConstructorMarker var10
   ) {
      if ((var9 & 64) != 0) {
         var7 = 1;
      }
      if ((var9 & 128) != 0) {
         var8 = 1;
      }
      this(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] d;
   private static String[] e;

   public lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll(
      @NotNull String var1, @NotNull String var2, int var3, int var4, int var5, int var6, int var7, int var8
   ) {
      short var10001 = -16049;
      short var10002 = -20140;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -16054;
      var10002 = 21800;
      Intrinsics.checkNotNullParameter(var2, "description");
      super(var1, var2);
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var4;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Math.max(1, var7);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Math.max(1, var8);
      if (var6 - var5 < this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
         int var9 = (var5 + var6) / 2;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.max(
            var3, var9 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII / 2
         );
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.min(
            var4, var9 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 1) / 2
         );
      } else {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      }
   }

   public lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll(
      @NotNull String var1, int var2, int var3, int var4, int var5, int var6, int var7
   ) {
      short var10001 = -16053;
      short var10002 = -29419;
      Intrinsics.checkNotNullParameter(var1, "name");
      super(var1);
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = Math.max(1, var6);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Math.max(1, var7);
      if (var5 - var4 < this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
         int var8 = (var4 + var5) / 2;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.max(
            var2, var8 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII / 2
         );
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.min(
            var3, var8 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 1) / 2
         );
      } else {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
      }
   }

   @Override
   public int O() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @Override
   public int P() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @Override
   public int S() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Override
   public int T() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @Override
   public int Q() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @Override
   public int R() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @Override
   public void h(int var1) {
      int var2 = Math.max(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         Math.min(var1, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
      );
      int var3 = this.j(var2);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.min(
         var3,
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      this.U();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   @Override
   public void i(int var1) {
      int var2 = Math.max(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         Math.min(var1, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
      );
      int var3 = this.j(var2);
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.max(
         var3,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      this.U();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   @Override
   public void c(int var1, int var2, int var3) {
      int var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var1, var2, var3)
         );
      this.h(var4);
   }

   @Override
   public void d(int var1, int var2, int var3) {
      int var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var1, var2, var3)
         );
      this.i(var4);
   }

   private final int j(int var1) {
      String[] var2 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var10000 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      int var10001 = 1;
      if (var2 == null) {
         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI <= 1) {
            return var1;
         }

         var10000 = var1 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         var10001 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      int var3 = var10000 % var10001;
      var10000 = var3;
      if (var2 == null) {
         if (var3 == 0) {
            return var1;
         }

         var10000 = var3;
      }

      var10001 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI / 2;
      if (var2 == null) {
         if (var10000 > var10001) {
            return var1 + (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI - var3);
         }

         var10000 = var1;
         var10001 = var3;
      }

      return var10000 - var10001;
   }

   public void U() {
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new lllIllIIIIllIllllIIlIllIlllllIlIlIllllIIIllllIIlIlIlIIIIIllIIlIlIlllIIlIllIllllIllIll(this);
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return new IIlIIIIIllIIlIIlIlIlllllllIllIIIlIllllIlIIIIIlllIIlllIIlIIllIlIIllllIlIIIllIIIIIIlIII(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -16052;
      short var10002 = -17052;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = -16058;
      var10002 = -29889;
      var1.a("minValue", Integer.valueOf(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII));
      var10001 = -16050;
      var10002 = 17247;
      var1.a("maxValue", Integer.valueOf(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI));
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      label15: {
         String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
         short var10002 = -16056;
         short var10003 = -16623;
         Intrinsics.checkNotNullParameter(var1, "data");
         var10002 = -16055;
         var10003 = -31600;
         int var3 = var1.a("minValue", this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var10002 = -16051;
         var10003 = -5623;
         int var4 = var1.a("maxValue", this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         String[] var2 = var10000;
         if (var2 == null) {
            if (var4 - var3 < this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
               int var5 = (var3 + var4) / 2;
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Math.max(
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  var5 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII / 2
               );
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = Math.min(
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  var5 + (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII + 1) / 2
               );
               if (var2 == null) {
                  break label15;
               }
            }

            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
         }

         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var4;
      }

      this.U();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = ":\u0010}¨Ú\u0086\u001dÂ\u0004³\u001d::\u0004\rí¿ \b^3ñÌK\n/S\u000b\u000e\u0098Ø\b\u0017\u0004Ð&;Óü\u0004°uZ7\u0004p\u0085\u0010-";
      int var4 = ":\u0010}¨Ú\u0086\u001dÂ\u0004³\u001d::\u0004\rí¿ \b^3ñÌK\n/S\u000b\u000e\u0098Ø\b\u0017\u0004Ð&;Óü\u0004°uZ7\u0004p\u0085\u0010-".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 122;
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
                     case 0 -> 108;
                     case 1 -> 46;
                     case 2 -> 58;
                     case 3 -> 65;
                     case 4 -> 17;
                     case 5 -> 126;
                     default -> 105;
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

                  var2 = "ý·£eå\u000fÊÃ\b\u000b\u0011}±>\u0095±\u0090";
                  var4 = "ý·£eå\u000fÊÃ\b\u000b\u0011}±>\u0095±\u0090".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 33;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -16050) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 131;
            case 1 -> 66;
            case 2 -> 206;
            case 3 -> 176;
            case 4 -> 251;
            case 5 -> 201;
            case 6 -> 127;
            case 7 -> 213;
            case 8 -> 197;
            case 9 -> 49;
            case 10 -> 163;
            case 11 -> 215;
            case 12 -> 161;
            case 13 -> 224;
            case 14 -> 130;
            case 15 -> 217;
            case 16 -> 220;
            case 17 -> 24;
            case 18 -> 45;
            case 19 -> 249;
            case 20 -> 103;
            case 21 -> 29;
            case 22 -> 195;
            case 23 -> 174;
            case 24 -> 172;
            case 25 -> 153;
            case 26 -> 231;
            case 27 -> 229;
            case 28 -> 40;
            case 29 -> 148;
            case 30 -> 94;
            case 31 -> 210;
            case 32 -> 253;
            case 33 -> 143;
            case 34 -> 104;
            case 35 -> 117;
            case 36 -> 155;
            case 37 -> 243;
            case 38 -> 181;
            case 39 -> 146;
            case 40 -> 192;
            case 41 -> 218;
            case 42 -> 233;
            case 43 -> 132;
            case 44 -> 30;
            case 45 -> 198;
            case 46 -> 202;
            case 47 -> 166;
            case 48 -> 123;
            case 49 -> 101;
            case 50 -> 119;
            case 51 -> 222;
            case 52 -> 250;
            case 53 -> 28;
            case 54 -> 6;
            case 55 -> 214;
            case 56 -> 162;
            case 57 -> 225;
            case 58 -> 86;
            case 59 -> 48;
            case 60 -> 41;
            case 61 -> 145;
            case 62 -> 248;
            case 63 -> 46;
            case 64 -> 57;
            case 65 -> 10;
            case 66 -> 65;
            case 67 -> 141;
            case 68 -> 34;
            case 69 -> 42;
            case 70 -> 20;
            case 71 -> 2;
            case 72 -> 228;
            case 73 -> 105;
            case 74 -> 136;
            case 75 -> 51;
            case 76 -> 223;
            case 77 -> 239;
            case 78 -> 175;
            case 79 -> 25;
            case 80 -> 196;
            case 81 -> 56;
            case 82 -> 124;
            case 83 -> 60;
            case 84 -> 113;
            case 85 -> 95;
            case 86 -> 120;
            case 87 -> 16;
            case 88 -> 189;
            case 89 -> 19;
            case 90 -> 3;
            case 91 -> 240;
            case 92 -> 112;
            case 93 -> 190;
            case 94 -> 68;
            case 95 -> 44;
            case 96 -> 151;
            case 97 -> 26;
            case 98 -> 12;
            case 99 -> 158;
            case 100 -> 122;
            case 101 -> 0;
            case 102 -> 15;
            case 103 -> 183;
            case 104 -> 157;
            case 105 -> 144;
            case 106 -> 139;
            case 107 -> 90;
            case 108 -> 80;
            case 109 -> 125;
            case 110 -> 52;
            case 111 -> 61;
            case 112 -> 152;
            case 113 -> 21;
            case 114 -> 79;
            case 115 -> 13;
            case 116 -> 83;
            case 117 -> 200;
            case 118 -> 211;
            case 119 -> 93;
            case 120 -> 186;
            case 121 -> 167;
            case 122 -> 53;
            case 123 -> 208;
            case 124 -> 84;
            case 125 -> 185;
            case 126 -> 111;
            case 127 -> 107;
            case 128 -> 147;
            case 129 -> 106;
            case 130 -> 199;
            case 131 -> 169;
            case 132 -> 238;
            case 133 -> 72;
            case 134 -> 177;
            case 135 -> 100;
            case 136 -> 27;
            case 137 -> 227;
            case 138 -> 85;
            case 139 -> 5;
            case 140 -> 168;
            case 141 -> 205;
            case 142 -> 22;
            case 143 -> 219;
            case 144 -> 35;
            case 145 -> 4;
            case 146 -> 133;
            case 147 -> 140;
            case 148 -> 47;
            case 149 -> 165;
            case 150 -> 180;
            case 151 -> 138;
            case 152 -> 32;
            case 153 -> 81;
            case 154 -> 244;
            case 155 -> 191;
            case 156 -> 188;
            case 157 -> 255;
            case 158 -> 209;
            case 159 -> 142;
            case 160 -> 236;
            case 161 -> 67;
            case 162 -> 246;
            case 163 -> 170;
            case 164 -> 154;
            case 165 -> 137;
            case 166 -> 77;
            case 167 -> 116;
            case 168 -> 182;
            case 169 -> 91;
            case 170 -> 7;
            case 171 -> 54;
            case 172 -> 74;
            case 173 -> 129;
            case 174 -> 221;
            case 175 -> 237;
            case 176 -> 179;
            case 177 -> 171;
            case 178 -> 156;
            case 179 -> 96;
            case 180 -> 8;
            case 181 -> 109;
            case 182 -> 73;
            case 183 -> 88;
            case 184 -> 226;
            case 185 -> 232;
            case 186 -> 33;
            case 187 -> 31;
            case 188 -> 62;
            case 189 -> 187;
            case 190 -> 194;
            case 191 -> 110;
            case 192 -> 115;
            case 193 -> 121;
            case 194 -> 234;
            case 195 -> 114;
            case 196 -> 9;
            case 197 -> 245;
            case 198 -> 216;
            case 199 -> 59;
            case 200 -> 36;
            case 201 -> 128;
            case 202 -> 76;
            case 203 -> 241;
            case 204 -> 118;
            case 205 -> 164;
            case 206 -> 14;
            case 207 -> 252;
            case 208 -> 82;
            case 209 -> 102;
            case 210 -> 150;
            case 211 -> 1;
            case 212 -> 23;
            case 213 -> 160;
            case 214 -> 70;
            case 215 -> 38;
            case 216 -> 75;
            case 217 -> 159;
            case 218 -> 43;
            case 219 -> 193;
            case 220 -> 108;
            case 221 -> 98;
            case 222 -> 58;
            case 223 -> 149;
            case 224 -> 134;
            case 225 -> 247;
            case 226 -> 87;
            case 227 -> 254;
            case 228 -> 11;
            case 229 -> 71;
            case 230 -> 135;
            case 231 -> 97;
            case 232 -> 55;
            case 233 -> 207;
            case 234 -> 242;
            case 235 -> 184;
            case 236 -> 69;
            case 237 -> 37;
            case 238 -> 50;
            case 239 -> 92;
            case 240 -> 64;
            case 241 -> 39;
            case 242 -> 63;
            case 243 -> 235;
            case 244 -> 203;
            case 245 -> 178;
            case 246 -> 173;
            case 247 -> 17;
            case 248 -> 212;
            case 249 -> 230;
            case 250 -> 89;
            case 251 -> 78;
            case 252 -> 99;
            case 253 -> 204;
            case 254 -> 18;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
}
