package me.octo.client.utils;

import java.awt.Color;
import java.util.Arrays;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII {
   @NotNull
   public static llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static float[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII() {
   }

   public final int a(double var1) {
      String[] var3;
      float var7;
      Triple var13;
      label51: {
         String[] var10000 = llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.v();
         float var4 = (float)(var1 * 6);
         var3 = var10000;
         float var5 = 1.0F;
         float var6 = var5 * (1 - Math.abs(var4 % 2 - 1));
         var7 = 0.0F;
         float var15;
         int var12 = (var15 = var4 - 1.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
         if (var3 == null) {
            if (var12 < 0) {
               var13 = new Triple(var5, var6, 0.0F);
               break label51;
            }

            float var16;
            var12 = (var16 = var4 - 2.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         }

         if (var3 == null) {
            if (var12 < 0) {
               var13 = new Triple(var6, var5, 0.0F);
               break label51;
            }

            float var17;
            var12 = (var17 = var4 - 3.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
         }

         if (var3 == null) {
            if (var12 < 0) {
               var13 = new Triple(0.0F, var5, var6);
               break label51;
            }

            float var18;
            var12 = (var18 = var4 - 4.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
         }

         if (var3 == null) {
            if (var12 < 0) {
               var13 = new Triple(0.0F, var6, var5);
               break label51;
            }

            float var19;
            var12 = (var19 = var4 - 5.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
         }

         var13 = var12 < 0 ? new Triple(var6, 0.0F, var5) : new Triple(var5, 0.0F, var6);
      }

      Triple var8 = var13;
      float var9 = ((Number)var8.component1()).floatValue();
      float var10 = ((Number)var8.component2()).floatValue();
      float var11 = ((Number)var8.component3()).floatValue();
      int var14 = new Color((int)((var9 + var7) * 255), (int)((var10 + var7) * 255), (int)((var11 + var7) * 255)).getRGB();
      if (var3 != null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }

      return var14;
   }

   public final int a(int var1, float var2, float var3, int var4) {
      Color var5 = new Color(var1);
      Color.RGBtoHSB(var5.getRed(), var5.getGreen(), var5.getBlue(), lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[1] = RangesKt.coerceIn(var2, 0.0F, 1.0F);
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[2] = RangesKt.coerceIn(var3, 0.0F, 1.0F);
      int var6 = Color.HSBtoRGB(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[0],
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[1],
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[2]
      );
      return var4 & 0xFF000000 | var6 & 16777215;
   }

   public final int a(int var1, float var2) {
      int var3 = RangesKt.coerceIn((int)(var2 * 255), 0, 255);
      return var1 & 16777215 | var3 << 24;
   }

   @NotNull
   public final String a(int var1) {
      short var10000 = -14687;
      short var10001 = -4703;
      String var2 = "#%06X";
      Object[] var3 = new Object[]{var1 & 16777215};
      String var4 = String.format(var2, Arrays.copyOf(var3, var3.length));
      short var10002 = -14688;
      short var10003 = 3275;
      Intrinsics.checkNotNullExpressionValue(var4, "format(...)");
      return var4;
   }

   public final float a(float var1) {
      return RangesKt.coerceIn((int)(var1 * 100) / 100.0F, 0.01F, 100.0F);
   }

   public final float a(float var1, float var2, float var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   public final int a(int var1, int var2, int var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   public final float b(float var1, float var2, float var3) {
      return (var3 - var1) / (var2 - var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ú\u008a\u0018\u0080Ð¿(;A=Ô\u0005\u0094àz\u0095¯";
      int var4 = "ú\u008a\u0018\u0080Ð¿(;A=Ô\u0005\u0094àz\u0095¯".length();
      char var1 = 11;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 64;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            } else {
               var13 = 64;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 87;
                  case 1 -> 105;
                  case 2 -> 61;
                  case 3 -> 91;
                  case 4 -> 97;
                  case 5 -> 56;
                  default -> 51;
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
            a = var5;
            b = new String[2];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new float[3];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -14688) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 215;
            case 1 -> 170;
            case 2 -> 111;
            case 3 -> 127;
            case 4 -> 137;
            case 5 -> 194;
            case 6 -> 123;
            case 7 -> 101;
            case 8 -> 44;
            case 9 -> 47;
            case 10 -> 184;
            case 11 -> 230;
            case 12 -> 198;
            case 13 -> 25;
            case 14 -> 26;
            case 15 -> 18;
            case 16 -> 189;
            case 17 -> 29;
            case 18 -> 195;
            case 19 -> 154;
            case 20 -> 208;
            case 21 -> 3;
            case 22 -> 181;
            case 23 -> 163;
            case 24 -> 23;
            case 25 -> 132;
            case 26 -> 32;
            case 27 -> 102;
            case 28 -> 122;
            case 29 -> 81;
            case 30 -> 77;
            case 31 -> 9;
            case 32 -> 103;
            case 33 -> 65;
            case 34 -> 251;
            case 35 -> 43;
            case 36 -> 211;
            case 37 -> 0;
            case 38 -> 171;
            case 39 -> 107;
            case 40 -> 54;
            case 41 -> 144;
            case 42 -> 56;
            case 43 -> 106;
            case 44 -> 41;
            case 45 -> 94;
            case 46 -> 17;
            case 47 -> 55;
            case 48 -> 232;
            case 49 -> 11;
            case 50 -> 51;
            case 51 -> 229;
            case 52 -> 69;
            case 53 -> 138;
            case 54 -> 89;
            case 55 -> 178;
            case 56 -> 79;
            case 57 -> 87;
            case 58 -> 124;
            case 59 -> 14;
            case 60 -> 150;
            case 61 -> 70;
            case 62 -> 121;
            case 63 -> 237;
            case 64 -> 248;
            case 65 -> 188;
            case 66 -> 39;
            case 67 -> 153;
            case 68 -> 143;
            case 69 -> 159;
            case 70 -> 228;
            case 71 -> 34;
            case 72 -> 100;
            case 73 -> 112;
            case 74 -> 204;
            case 75 -> 162;
            case 76 -> 58;
            case 77 -> 114;
            case 78 -> 35;
            case 79 -> 90;
            case 80 -> 145;
            case 81 -> 53;
            case 82 -> 84;
            case 83 -> 214;
            case 84 -> 246;
            case 85 -> 92;
            case 86 -> 180;
            case 87 -> 175;
            case 88 -> 210;
            case 89 -> 40;
            case 90 -> 4;
            case 91 -> 212;
            case 92 -> 238;
            case 93 -> 192;
            case 94 -> 52;
            case 95 -> 166;
            case 96 -> 12;
            case 97 -> 140;
            case 98 -> 37;
            case 99 -> 220;
            case 100 -> 49;
            case 101 -> 176;
            case 102 -> 253;
            case 103 -> 149;
            case 104 -> 119;
            case 105 -> 36;
            case 106 -> 227;
            case 107 -> 148;
            case 108 -> 243;
            case 109 -> 85;
            case 110 -> 129;
            case 111 -> 234;
            case 112 -> 174;
            case 113 -> 199;
            case 114 -> 82;
            case 115 -> 78;
            case 116 -> 59;
            case 117 -> 207;
            case 118 -> 117;
            case 119 -> 240;
            case 120 -> 135;
            case 121 -> 73;
            case 122 -> 239;
            case 123 -> 157;
            case 124 -> 244;
            case 125 -> 205;
            case 126 -> 83;
            case 127 -> 15;
            case 128 -> 13;
            case 129 -> 57;
            case 130 -> 165;
            case 131 -> 1;
            case 132 -> 131;
            case 133 -> 60;
            case 134 -> 147;
            case 135 -> 19;
            case 136 -> 115;
            case 137 -> 125;
            case 138 -> 108;
            case 139 -> 104;
            case 140 -> 6;
            case 141 -> 196;
            case 142 -> 222;
            case 143 -> 75;
            case 144 -> 110;
            case 145 -> 191;
            case 146 -> 93;
            case 147 -> 62;
            case 148 -> 249;
            case 149 -> 95;
            case 150 -> 16;
            case 151 -> 28;
            case 152 -> 235;
            case 153 -> 91;
            case 154 -> 242;
            case 155 -> 42;
            case 156 -> 231;
            case 157 -> 33;
            case 158 -> 20;
            case 159 -> 120;
            case 160 -> 2;
            case 161 -> 183;
            case 162 -> 223;
            case 163 -> 5;
            case 164 -> 80;
            case 165 -> 61;
            case 166 -> 21;
            case 167 -> 118;
            case 168 -> 201;
            case 169 -> 142;
            case 170 -> 158;
            case 171 -> 219;
            case 172 -> 226;
            case 173 -> 255;
            case 174 -> 241;
            case 175 -> 218;
            case 176 -> 45;
            case 177 -> 22;
            case 178 -> 216;
            case 179 -> 141;
            case 180 -> 130;
            case 181 -> 179;
            case 182 -> 109;
            case 183 -> 24;
            case 184 -> 146;
            case 185 -> 134;
            case 186 -> 169;
            case 187 -> 245;
            case 188 -> 50;
            case 189 -> 236;
            case 190 -> 168;
            case 191 -> 27;
            case 192 -> 160;
            case 193 -> 139;
            case 194 -> 151;
            case 195 -> 213;
            case 196 -> 156;
            case 197 -> 209;
            case 198 -> 252;
            case 199 -> 254;
            case 200 -> 206;
            case 201 -> 224;
            case 202 -> 161;
            case 203 -> 30;
            case 204 -> 233;
            case 205 -> 185;
            case 206 -> 86;
            case 207 -> 67;
            case 208 -> 128;
            case 209 -> 164;
            case 210 -> 182;
            case 211 -> 97;
            case 212 -> 250;
            case 213 -> 71;
            case 214 -> 72;
            case 215 -> 172;
            case 216 -> 177;
            case 217 -> 190;
            case 218 -> 68;
            case 219 -> 7;
            case 220 -> 167;
            case 221 -> 48;
            case 222 -> 173;
            case 223 -> 96;
            case 224 -> 155;
            case 225 -> 76;
            case 226 -> 136;
            case 227 -> 133;
            case 228 -> 203;
            case 229 -> 152;
            case 230 -> 221;
            case 231 -> 66;
            case 232 -> 113;
            case 233 -> 225;
            case 234 -> 8;
            case 235 -> 116;
            case 236 -> 38;
            case 237 -> 64;
            case 238 -> 46;
            case 239 -> 217;
            case 240 -> 202;
            case 241 -> 186;
            case 242 -> 99;
            case 243 -> 105;
            case 244 -> 197;
            case 245 -> 193;
            case 246 -> 74;
            case 247 -> 247;
            case 248 -> 88;
            case 249 -> 98;
            case 250 -> 126;
            case 251 -> 31;
            case 252 -> 200;
            case 253 -> 187;
            case 254 -> 63;
            default -> 10;
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
