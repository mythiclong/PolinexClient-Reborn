package me.octo.client;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

public class IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII
   extends IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll
   implements IlllIIlIIlIllIIIIIIllIIllIlIllllIIIIlIIlIlIlIIlllIlIIIlIIIIIlIlIIllllIlllIlllIllIlIIl {
   public IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII(String var1, String var2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, String var4, float var5, float var6, float var7, float var8, int var9, int var10, IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var11, int var12, kotlin.jvm.internal.DefaultConstructorMarker var13) {
      this(var1, var2, var3, var4, var5, var6, var7, (var12 & 128) != 0 ? 0.01f : var8, (var12 & 256) != 0 ? 2 : var9, (var12 & 512) != 0 ? 0 : var10, var11);
   }

   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] d;
   private static String[] e;

   public IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var11
   ) {
      short var10001 = 5577;
      short var10002 = 13395;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 5583;
      var10002 = 1631;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 5579;
      var10002 = -1558;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 5571;
      var10002 = -28094;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 5581;
      var10002 = 22897;
      Intrinsics.checkNotNullParameter(var11, "settings");
      super(var1, var2, var3, var4, var10, Arrays.copyOf(var11, var11.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var5;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var6;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var8;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var7;
   }

   public IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var10
   ) {
      short var10001 = 5570;
      short var10002 = -16067;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 5578;
      var10002 = 20716;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 5569;
      var10002 = -4911;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 5576;
      var10002 = 12639;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 5580;
      var10002 = 27830;
      Intrinsics.checkNotNullParameter(var10, "settings");
      super(var1, var2, var3, var4, 0, Arrays.copyOf(var10, var10.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var5;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var6;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var8;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var7;
   }

   @Override
   public float l() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Override
   public float m() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @Override
   public float n() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @Override
   public float o() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @Override
   public int p() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @Override
   public void a(int var1, int var2, int var3) {
      float var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1, var2, var3)
      );
      this.a(this.c(this.b(var4)));
   }

   private final float b(float var1) {
      String[] var2 = IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.V();
      float var4;
      int var10000 = (var4 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl - 1.0E-4F) == 0.0F
         ? 0
         : (var4 < 0.0F ? -1 : 1);
      if (var2 == null) {
         if (var10000 <= 0) {
            return var1;
         }

         var10000 = MathKt.roundToInt(
            (var1 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII)
               / this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         );
      }

      int var3 = var10000;
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         + var3 * this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   private final float c(float var1) {
      float var2 = (float)Math.pow(10.0, this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      return MathKt.roundToInt(var1 * var2) / var2;
   }

   @Override
   public void a(float var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
      this.q();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public void q() {
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new IIlIllIllIlllllIIlllllllIIllllIIIIllIIIlIIllIIlIIIIllIIllllllIIlIlIIIlIlIIllIlIlllIlI(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 5575;
      short var10002 = -29729;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = 5577;
      var10002 = 13395;
      var1.a("name", this.aj());
      var10001 = 5582;
      var10002 = -1320;
      var1.a("number", Float.valueOf(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl));
      this.c(var1);
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 5568;
      short var10002 = -5121;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10002 = 5574;
      short var10003 = -9925;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1.a(
         "number", this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      this.q();
      this.d(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "F\u009cOÛ2\u009f\u0010F AÜ\bq=Im\u0000\u0089ãO\u000bÍ\u009aÚ\t Ø&\u0003×\u0085ã\u0004ëú¯\u0095\u0006\u008d\u008fcª}\u008b\u000b´c\u0011$ù`i¹\u008f¾9\báÒI\u0005\u000e¶ø\u0083\b:«2*aS\u0015?\u0004ø\u0004ÍJ\u000bkâ\u000e\u0006:9u?½\u0002®\u0004\u000eHAÇ\bý¥Ø~2ë¥\u0003";
      int var4 = "F\u009cOÛ2\u009f\u0010F AÜ\bq=Im\u0000\u0089ãO\u000bÍ\u009aÚ\t Ø&\u0003×\u0085ã\u0004ëú¯\u0095\u0006\u008d\u008fcª}\u008b\u000b´c\u0011$ù`i¹\u008f¾9\báÒI\u0005\u000e¶ø\u0083\b:«2*aS\u0015?\u0004ø\u0004ÍJ\u000bkâ\u000e\u0006:9u?½\u0002®\u0004\u000eHAÇ\bý¥Ø~2ë¥\u0003"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 127;
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
                     case 0 -> 62;
                     case 1 -> 65;
                     case 2 -> 75;
                     case 3 -> 90;
                     case 4 -> 77;
                     case 5 -> 89;
                     default -> 35;
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
                     e = new String[14];
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

                  var2 = "#å¼í\u008ci\u0004\u0003\rêe";
                  var4 = "#å¼í\u008ci\u0004\u0003\rêe".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 61;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 5578) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 123;
            case 1 -> 115;
            case 2 -> 81;
            case 3 -> 63;
            case 4 -> 239;
            case 5 -> 142;
            case 6 -> 160;
            case 7 -> 137;
            case 8 -> 162;
            case 9 -> 72;
            case 10 -> 122;
            case 11 -> 127;
            case 12 -> 167;
            case 13 -> 112;
            case 14 -> 136;
            case 15 -> 195;
            case 16 -> 28;
            case 17 -> 47;
            case 18 -> 68;
            case 19 -> 109;
            case 20 -> 170;
            case 21 -> 48;
            case 22 -> 182;
            case 23 -> 107;
            case 24 -> 103;
            case 25 -> 120;
            case 26 -> 118;
            case 27 -> 135;
            case 28 -> 79;
            case 29 -> 57;
            case 30 -> 204;
            case 31 -> 90;
            case 32 -> 237;
            case 33 -> 65;
            case 34 -> 85;
            case 35 -> 149;
            case 36 -> 168;
            case 37 -> 33;
            case 38 -> 94;
            case 39 -> 236;
            case 40 -> 164;
            case 41 -> 14;
            case 42 -> 233;
            case 43 -> 248;
            case 44 -> 87;
            case 45 -> 101;
            case 46 -> 38;
            case 47 -> 124;
            case 48 -> 151;
            case 49 -> 172;
            case 50 -> 78;
            case 51 -> 189;
            case 52 -> 5;
            case 53 -> 223;
            case 54 -> 181;
            case 55 -> 240;
            case 56 -> 153;
            case 57 -> 231;
            case 58 -> 121;
            case 59 -> 219;
            case 60 -> 165;
            case 61 -> 130;
            case 62 -> 51;
            case 63 -> 21;
            case 64 -> 73;
            case 65 -> 190;
            case 66 -> 250;
            case 67 -> 95;
            case 68 -> 34;
            case 69 -> 249;
            case 70 -> 108;
            case 71 -> 74;
            case 72 -> 46;
            case 73 -> 207;
            case 74 -> 24;
            case 75 -> 139;
            case 76 -> 201;
            case 77 -> 180;
            case 78 -> 84;
            case 79 -> 212;
            case 80 -> 222;
            case 81 -> 208;
            case 82 -> 76;
            case 83 -> 129;
            case 84 -> 226;
            case 85 -> 22;
            case 86 -> 60;
            case 87 -> 155;
            case 88 -> 29;
            case 89 -> 185;
            case 90 -> 6;
            case 91 -> 147;
            case 92 -> 83;
            case 93 -> 31;
            case 94 -> 49;
            case 95 -> 211;
            case 96 -> 134;
            case 97 -> 191;
            case 98 -> 70;
            case 99 -> 148;
            case 100 -> 97;
            case 101 -> 9;
            case 102 -> 243;
            case 103 -> 50;
            case 104 -> 39;
            case 105 -> 62;
            case 106 -> 245;
            case 107 -> 69;
            case 108 -> 36;
            case 109 -> 114;
            case 110 -> 140;
            case 111 -> 117;
            case 112 -> 125;
            case 113 -> 234;
            case 114 -> 66;
            case 115 -> 15;
            case 116 -> 205;
            case 117 -> 116;
            case 118 -> 255;
            case 119 -> 202;
            case 120 -> 2;
            case 121 -> 193;
            case 122 -> 64;
            case 123 -> 105;
            case 124 -> 131;
            case 125 -> 198;
            case 126 -> 52;
            case 127 -> 254;
            case 128 -> 56;
            case 129 -> 158;
            case 130 -> 138;
            case 131 -> 186;
            case 132 -> 197;
            case 133 -> 213;
            case 134 -> 171;
            case 135 -> 100;
            case 136 -> 41;
            case 137 -> 244;
            case 138 -> 128;
            case 139 -> 246;
            case 140 -> 96;
            case 141 -> 235;
            case 142 -> 98;
            case 143 -> 42;
            case 144 -> 194;
            case 145 -> 225;
            case 146 -> 32;
            case 147 -> 224;
            case 148 -> 3;
            case 149 -> 146;
            case 150 -> 179;
            case 151 -> 26;
            case 152 -> 150;
            case 153 -> 4;
            case 154 -> 174;
            case 155 -> 157;
            case 156 -> 67;
            case 157 -> 23;
            case 158 -> 37;
            case 159 -> 113;
            case 160 -> 227;
            case 161 -> 152;
            case 162 -> 17;
            case 163 -> 187;
            case 164 -> 188;
            case 165 -> 161;
            case 166 -> 200;
            case 167 -> 86;
            case 168 -> 30;
            case 169 -> 53;
            case 170 -> 143;
            case 171 -> 16;
            case 172 -> 159;
            case 173 -> 27;
            case 174 -> 43;
            case 175 -> 91;
            case 176 -> 55;
            case 177 -> 144;
            case 178 -> 196;
            case 179 -> 173;
            case 180 -> 82;
            case 181 -> 176;
            case 182 -> 89;
            case 183 -> 8;
            case 184 -> 252;
            case 185 -> 102;
            case 186 -> 145;
            case 187 -> 40;
            case 188 -> 242;
            case 189 -> 1;
            case 190 -> 0;
            case 191 -> 25;
            case 192 -> 61;
            case 193 -> 215;
            case 194 -> 58;
            case 195 -> 184;
            case 196 -> 119;
            case 197 -> 141;
            case 198 -> 132;
            case 199 -> 209;
            case 200 -> 75;
            case 201 -> 228;
            case 202 -> 216;
            case 203 -> 156;
            case 204 -> 54;
            case 205 -> 13;
            case 206 -> 18;
            case 207 -> 169;
            case 208 -> 178;
            case 209 -> 93;
            case 210 -> 99;
            case 211 -> 59;
            case 212 -> 221;
            case 213 -> 220;
            case 214 -> 163;
            case 215 -> 217;
            case 216 -> 110;
            case 217 -> 241;
            case 218 -> 10;
            case 219 -> 45;
            case 220 -> 183;
            case 221 -> 192;
            case 222 -> 218;
            case 223 -> 104;
            case 224 -> 126;
            case 225 -> 44;
            case 226 -> 177;
            case 227 -> 166;
            case 228 -> 19;
            case 229 -> 88;
            case 230 -> 230;
            case 231 -> 77;
            case 232 -> 175;
            case 233 -> 7;
            case 234 -> 12;
            case 235 -> 251;
            case 236 -> 111;
            case 237 -> 238;
            case 238 -> 92;
            case 239 -> 106;
            case 240 -> 80;
            case 241 -> 229;
            case 242 -> 214;
            case 243 -> 203;
            case 244 -> 11;
            case 245 -> 206;
            case 246 -> 133;
            case 247 -> 154;
            case 248 -> 232;
            case 249 -> 35;
            case 250 -> 71;
            case 251 -> 210;
            case 252 -> 199;
            case 253 -> 247;
            case 254 -> 253;
            default -> 20;
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

   // PX-FIX-ok: Kotlin $default constructor (jar body translated 1:1)
   public IlIlIlllIlllIIlIllIIIlIIIIlIIIIIIllIlIIlIlIIlIllIlIIIllIIIlIlIlIllllllIIIllIIlIllllII(java.lang.String var1, java.lang.String var2, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, java.lang.String var4, float var5, float var6, float var7, float var8, int var9, me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var10, int var11, kotlin.jvm.internal.DefaultConstructorMarker var12) {
      if ((var11 & 128) != 0) {
         var8 = 0.01F;
      }

      if ((var11 & 256) != 0) {
         var9 = 2;
      }

      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

}
