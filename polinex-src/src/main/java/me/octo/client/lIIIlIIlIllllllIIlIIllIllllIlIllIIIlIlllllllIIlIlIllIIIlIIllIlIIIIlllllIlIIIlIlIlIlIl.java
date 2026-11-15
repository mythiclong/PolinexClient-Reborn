package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class lIIIlIIlIllllllIIlIIllIllllIlIllIIIlIlllllllIIlIlIllIIIlIIllIlIIIIlllllIlIIIlIlIlIlIl
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] d;
   private static String[] e;

   public lIIIlIIlIllllllIIlIIllIllllIlIllIIIlIlllllllIIlIlIllIIIlIIllIlIIIIlllllIlIIIlIlIlIlIl(
      @NotNull lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll var1
   ) {
      short var10001 = 18106;
      short var10002 = -21811;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) {
      int[] var6;
      float var24;
      label62: {
         short var10001 = 18105;
         short var10002 = -27760;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         int[] var10000 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
         var10002 = 18104;
         short var10003 = -11033;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         var6 = var10000;
         long var7 = System.currentTimeMillis() - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var23 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ae()) ? 1 : 0);
         if (var6 != null) {
            if (var23 != 0) {
               long var25 = var7;
               if (var6 != null) {
                  if (var7 >= 250L) {
                     var24 = 1.0F;
                     break label62;
                  }

                  var25 = var7;
               }

               var24 = IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m((float)var25 / 250.0F);
               break label62;
            }

            long var28;
            var23 = (var28 = var7 - 250L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
         }

         var24 = var23 >= 0 ? 0.0F : 1.0F - IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m((float)var7 / 250.0F);
      }

      float var9 = var24;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var10 = null;
      float var11 = var2.e() - 65;
      int var12 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)var11 - 50);
      int var13 = (var12 + var3) / 2;
      float var14 = 48.0F;
      float var15 = 24.0F;
      float var16 = 12.0F;
      float var17 = var11 - var14 + 5.0F;
      float var18 = var13 - var15 / 2.0F;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = this.a(
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .q(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .r(),
         var9
      );
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var20 = this.a(
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .s(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .t(),
         var9
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var17, var18, var14, var15, var19, var16);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var17,
         var18,
         var14,
         var15,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .u(),
         var16
      );
      float var21 = 9.0F;
      float var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         var17 + var21 + 3.0F, var17 + var14 - var21 - 3.0F, var9
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var22, var18 + var15 / 2.0F, var21, var20);
      float var29;
      int var26 = (var29 = var4 - (var17 - 3)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
      if (var6 != null) {
         if (var26 < 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var12, var10);
         }

         float var30;
         var26 = (var30 = var4 - (var17 + var14 + 3)) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
      }

      if (var6 != null) {
         if (var26 > 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var12, var10);
         }

         float var31;
         var26 = (var31 = var5 - (var18 - 3)) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
      }

      if (var6 != null) {
         if (var26 < 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var12, var10);
         }

         float var32;
         var26 = (var32 = var5 - (var18 + var15 + 3)) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
      }

      if (var6 != null) {
         if (var26 > 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var12, var10);
         }

         float var33;
         var26 = (var33 = var5 - (var2.d() + 100)) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
      }

      if (var26 > 0) {
         var10 = this;
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
      }

      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var12, var10);
   }

   private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3
   ) {
      float var4 = RangesKt.coerceIn(var3, 0.0F, 1.0F);
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         (int)(var1.a() + (var2.a() - var1.a()) * var4),
         (int)(var1.b() + (var2.b() - var1.b()) * var4),
         (int)(var1.c() + (var2.c() - var1.c()) * var4),
         (int)(var1.d() + (var2.d() - var1.d()) * var4)
      );
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   public void e() {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.af();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = System.currentTimeMillis();
   }
   @Override
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }

   @Override
   public void a(char p0, int p1) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1);
   }

   @Override
   public boolean a(int p0, int p1, int p2, int p3, int p4, int p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public int a(llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p0) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0);
   }

   @Override
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, float p3, float p4, float p5, float p6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5, p6);
   }

   @Override
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }

   @Override
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }


   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0082è(\u0087Wb\u0087\u0085ô\u00ad\u000bêÿã\u0088Q\u0082\u0097Ý¥\u000e5\u0007¯\u009c«\u0012Å³c";
      int var4 = "\u0082è(\u0087Wb\u0087\u0085ô\u00ad\u000bêÿã\u0088Q\u0082\u0097Ý¥\u000e5\u0007¯\u009c«\u0012Å³c".length();
      char var1 = '\n';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 1;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 1;
               var10006 = var6;
            } else {
               var13 = 1;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 1;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 59;
                  case 1 -> 59;
                  case 2 -> 113;
                  case 3 -> 122;
                  case 4 -> 44;
                  case 5 -> 11;
                  default -> 92;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            d = var5;
            e = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 18104) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 236;
            case 1 -> 172;
            case 2 -> 125;
            case 3 -> 90;
            case 4 -> 211;
            case 5 -> 188;
            case 6 -> 39;
            case 7 -> 212;
            case 8 -> 34;
            case 9 -> 114;
            case 10 -> 254;
            case 11 -> 177;
            case 12 -> 110;
            case 13 -> 166;
            case 14 -> 248;
            case 15 -> 245;
            case 16 -> 187;
            case 17 -> 104;
            case 18 -> 210;
            case 19 -> 181;
            case 20 -> 106;
            case 21 -> 206;
            case 22 -> 192;
            case 23 -> 233;
            case 24 -> 145;
            case 25 -> 200;
            case 26 -> 61;
            case 27 -> 87;
            case 28 -> 3;
            case 29 -> 139;
            case 30 -> 203;
            case 31 -> 217;
            case 32 -> 115;
            case 33 -> 170;
            case 34 -> 24;
            case 35 -> 45;
            case 36 -> 57;
            case 37 -> 142;
            case 38 -> 147;
            case 39 -> 199;
            case 40 -> 169;
            case 41 -> 71;
            case 42 -> 159;
            case 43 -> 171;
            case 44 -> 122;
            case 45 -> 50;
            case 46 -> 79;
            case 47 -> 164;
            case 48 -> 224;
            case 49 -> 227;
            case 50 -> 160;
            case 51 -> 55;
            case 52 -> 176;
            case 53 -> 10;
            case 54 -> 68;
            case 55 -> 153;
            case 56 -> 180;
            case 57 -> 22;
            case 58 -> 20;
            case 59 -> 196;
            case 60 -> 243;
            case 61 -> 28;
            case 62 -> 41;
            case 63 -> 223;
            case 64 -> 42;
            case 65 -> 167;
            case 66 -> 84;
            case 67 -> 241;
            case 68 -> 36;
            case 69 -> 132;
            case 70 -> 138;
            case 71 -> 195;
            case 72 -> 184;
            case 73 -> 190;
            case 74 -> 103;
            case 75 -> 237;
            case 76 -> 19;
            case 77 -> 162;
            case 78 -> 194;
            case 79 -> 40;
            case 80 -> 140;
            case 81 -> 234;
            case 82 -> 129;
            case 83 -> 77;
            case 84 -> 17;
            case 85 -> 49;
            case 86 -> 186;
            case 87 -> 240;
            case 88 -> 75;
            case 89 -> 128;
            case 90 -> 47;
            case 91 -> 98;
            case 92 -> 54;
            case 93 -> 112;
            case 94 -> 155;
            case 95 -> 4;
            case 96 -> 78;
            case 97 -> 173;
            case 98 -> 182;
            case 99 -> 65;
            case 100 -> 93;
            case 101 -> 168;
            case 102 -> 127;
            case 103 -> 59;
            case 104 -> 185;
            case 105 -> 13;
            case 106 -> 218;
            case 107 -> 238;
            case 108 -> 31;
            case 109 -> 136;
            case 110 -> 179;
            case 111 -> 2;
            case 112 -> 215;
            case 113 -> 244;
            case 114 -> 246;
            case 115 -> 21;
            case 116 -> 141;
            case 117 -> 221;
            case 118 -> 44;
            case 119 -> 109;
            case 120 -> 35;
            case 121 -> 116;
            case 122 -> 67;
            case 123 -> 62;
            case 124 -> 12;
            case 125 -> 156;
            case 126 -> 222;
            case 127 -> 247;
            case 128 -> 99;
            case 129 -> 26;
            case 130 -> 161;
            case 131 -> 91;
            case 132 -> 7;
            case 133 -> 18;
            case 134 -> 37;
            case 135 -> 225;
            case 136 -> 101;
            case 137 -> 144;
            case 138 -> 85;
            case 139 -> 131;
            case 140 -> 123;
            case 141 -> 27;
            case 142 -> 97;
            case 143 -> 43;
            case 144 -> 70;
            case 145 -> 204;
            case 146 -> 14;
            case 147 -> 53;
            case 148 -> 0;
            case 149 -> 231;
            case 150 -> 92;
            case 151 -> 86;
            case 152 -> 58;
            case 153 -> 16;
            case 154 -> 157;
            case 155 -> 148;
            case 156 -> 1;
            case 157 -> 113;
            case 158 -> 205;
            case 159 -> 83;
            case 160 -> 102;
            case 161 -> 89;
            case 162 -> 165;
            case 163 -> 228;
            case 164 -> 230;
            case 165 -> 249;
            case 166 -> 143;
            case 167 -> 118;
            case 168 -> 119;
            case 169 -> 251;
            case 170 -> 255;
            case 171 -> 213;
            case 172 -> 48;
            case 173 -> 208;
            case 174 -> 239;
            case 175 -> 134;
            case 176 -> 64;
            case 177 -> 193;
            case 178 -> 23;
            case 179 -> 88;
            case 180 -> 33;
            case 181 -> 100;
            case 182 -> 126;
            case 183 -> 81;
            case 184 -> 29;
            case 185 -> 158;
            case 186 -> 105;
            case 187 -> 120;
            case 188 -> 46;
            case 189 -> 74;
            case 190 -> 150;
            case 191 -> 189;
            case 192 -> 207;
            case 193 -> 51;
            case 194 -> 214;
            case 195 -> 232;
            case 196 -> 56;
            case 197 -> 117;
            case 198 -> 229;
            case 199 -> 63;
            case 200 -> 152;
            case 201 -> 111;
            case 202 -> 94;
            case 203 -> 191;
            case 204 -> 124;
            case 205 -> 66;
            case 206 -> 209;
            case 207 -> 250;
            case 208 -> 220;
            case 209 -> 235;
            case 210 -> 72;
            case 211 -> 253;
            case 212 -> 198;
            case 213 -> 108;
            case 214 -> 38;
            case 215 -> 11;
            case 216 -> 9;
            case 217 -> 146;
            case 218 -> 163;
            case 219 -> 149;
            case 220 -> 5;
            case 221 -> 183;
            case 222 -> 60;
            case 223 -> 30;
            case 224 -> 96;
            case 225 -> 73;
            case 226 -> 154;
            case 227 -> 252;
            case 228 -> 15;
            case 229 -> 178;
            case 230 -> 197;
            case 231 -> 121;
            case 232 -> 130;
            case 233 -> 8;
            case 234 -> 69;
            case 235 -> 201;
            case 236 -> 151;
            case 237 -> 107;
            case 238 -> 82;
            case 239 -> 242;
            case 240 -> 133;
            case 241 -> 202;
            case 242 -> 219;
            case 243 -> 52;
            case 244 -> 6;
            case 245 -> 174;
            case 246 -> 32;
            case 247 -> 175;
            case 248 -> 25;
            case 249 -> 80;
            case 250 -> 137;
            case 251 -> 135;
            case 252 -> 95;
            case 253 -> 76;
            case 254 -> 216;
            default -> 226;
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
