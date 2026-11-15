package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl {
   @NotNull
   public static IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl() {
   }

   @NotNull
   public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3
   ) {
      String[] var10000 = llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.v();
      short var10002 = -26646;
      short var10003 = -31954;
      Intrinsics.checkNotNullParameter(var1, "color1");
      var10002 = -26645;
      var10003 = -9280;
      Intrinsics.checkNotNullParameter(var2, "color2");
      String[] var4 = var10000;
      float var5 = RangesKt.coerceAtLeast(0.0F, RangesKt.coerceAtMost(1.0F, var3));
      float var15;
      int var11 = (var15 = var5 - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
      if (var4 == null) {
         var11 = (((var11 == 0) ? 1 : 0));
      }

      if ((var11 != 0)) {
         return var1;
      } else {
         float var16;
         int var12 = (var16 = var5 - 1.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         if (var4 == null) {
            var12 = (((var12 == 0) ? 1 : 0));
         }

         if ((var12 != 0)) {
            return var2;
         } else {
            float var6 = 1.0F - var5;
            int var7 = (int)(var6 * var1.q() + var5 * var2.q());
            int var8 = (int)(var6 * var1.r() + var5 * var2.r());
            int var9 = (int)(var6 * var1.s() + var5 * var2.s());
            int var10 = (int)(var6 * var1.d() + var5 * var2.d());
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var7, var8, var9, var10);
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "]*oô·6\u0006&¹\u0000\u0086Z{";
      int var4 = "]*oô·6\u0006&¹\u0000\u0086Z{".length();
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 56;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 56;
               var10006 = var6;
            } else {
               var13 = 56;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 56;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 39;
                  case 1 -> 65;
                  case 2 -> 124;
                  case 3 -> 75;
                  case 4 -> 121;
                  case 5 -> 78;
                  default -> 87;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26645) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 222;
            case 1 -> 174;
            case 2 -> 32;
            case 3 -> 220;
            case 4 -> 204;
            case 5 -> 129;
            case 6 -> 215;
            case 7 -> 195;
            case 8 -> 28;
            case 9 -> 209;
            case 10 -> 101;
            case 11 -> 181;
            case 12 -> 237;
            case 13 -> 94;
            case 14 -> 24;
            case 15 -> 249;
            case 16 -> 154;
            case 17 -> 113;
            case 18 -> 196;
            case 19 -> 87;
            case 20 -> 214;
            case 21 -> 133;
            case 22 -> 82;
            case 23 -> 109;
            case 24 -> 163;
            case 25 -> 201;
            case 26 -> 10;
            case 27 -> 206;
            case 28 -> 248;
            case 29 -> 239;
            case 30 -> 39;
            case 31 -> 118;
            case 32 -> 5;
            case 33 -> 183;
            case 34 -> 135;
            case 35 -> 203;
            case 36 -> 89;
            case 37 -> 15;
            case 38 -> 187;
            case 39 -> 192;
            case 40 -> 116;
            case 41 -> 205;
            case 42 -> 193;
            case 43 -> 6;
            case 44 -> 172;
            case 45 -> 73;
            case 46 -> 2;
            case 47 -> 131;
            case 48 -> 227;
            case 49 -> 225;
            case 50 -> 255;
            case 51 -> 68;
            case 52 -> 13;
            case 53 -> 234;
            case 54 -> 8;
            case 55 -> 211;
            case 56 -> 111;
            case 57 -> 212;
            case 58 -> 231;
            case 59 -> 33;
            case 60 -> 124;
            case 61 -> 119;
            case 62 -> 189;
            case 63 -> 185;
            case 64 -> 11;
            case 65 -> 216;
            case 66 -> 159;
            case 67 -> 202;
            case 68 -> 104;
            case 69 -> 238;
            case 70 -> 45;
            case 71 -> 49;
            case 72 -> 253;
            case 73 -> 199;
            case 74 -> 197;
            case 75 -> 86;
            case 76 -> 59;
            case 77 -> 42;
            case 78 -> 66;
            case 79 -> 207;
            case 80 -> 41;
            case 81 -> 79;
            case 82 -> 80;
            case 83 -> 26;
            case 84 -> 61;
            case 85 -> 219;
            case 86 -> 30;
            case 87 -> 246;
            case 88 -> 233;
            case 89 -> 198;
            case 90 -> 63;
            case 91 -> 78;
            case 92 -> 112;
            case 93 -> 232;
            case 94 -> 132;
            case 95 -> 168;
            case 96 -> 108;
            case 97 -> 158;
            case 98 -> 244;
            case 99 -> 245;
            case 100 -> 99;
            case 101 -> 83;
            case 102 -> 176;
            case 103 -> 71;
            case 104 -> 208;
            case 105 -> 125;
            case 106 -> 43;
            case 107 -> 171;
            case 108 -> 84;
            case 109 -> 162;
            case 110 -> 157;
            case 111 -> 70;
            case 112 -> 12;
            case 113 -> 110;
            case 114 -> 106;
            case 115 -> 175;
            case 116 -> 56;
            case 117 -> 53;
            case 118 -> 65;
            case 119 -> 144;
            case 120 -> 240;
            case 121 -> 93;
            case 122 -> 88;
            case 123 -> 4;
            case 124 -> 1;
            case 125 -> 57;
            case 126 -> 74;
            case 127 -> 3;
            case 128 -> 69;
            case 129 -> 190;
            case 130 -> 155;
            case 131 -> 145;
            case 132 -> 21;
            case 133 -> 98;
            case 134 -> 235;
            case 135 -> 117;
            case 136 -> 46;
            case 137 -> 130;
            case 138 -> 120;
            case 139 -> 127;
            case 140 -> 161;
            case 141 -> 7;
            case 142 -> 62;
            case 143 -> 102;
            case 144 -> 77;
            case 145 -> 103;
            case 146 -> 148;
            case 147 -> 100;
            case 148 -> 115;
            case 149 -> 38;
            case 150 -> 90;
            case 151 -> 177;
            case 152 -> 121;
            case 153 -> 0;
            case 154 -> 188;
            case 155 -> 150;
            case 156 -> 76;
            case 157 -> 169;
            case 158 -> 122;
            case 159 -> 47;
            case 160 -> 72;
            case 161 -> 35;
            case 162 -> 200;
            case 163 -> 147;
            case 164 -> 19;
            case 165 -> 22;
            case 166 -> 247;
            case 167 -> 40;
            case 168 -> 164;
            case 169 -> 50;
            case 170 -> 242;
            case 171 -> 17;
            case 172 -> 52;
            case 173 -> 236;
            case 174 -> 20;
            case 175 -> 96;
            case 176 -> 191;
            case 177 -> 54;
            case 178 -> 213;
            case 179 -> 229;
            case 180 -> 136;
            case 181 -> 91;
            case 182 -> 75;
            case 183 -> 167;
            case 184 -> 141;
            case 185 -> 37;
            case 186 -> 186;
            case 187 -> 156;
            case 188 -> 128;
            case 189 -> 221;
            case 190 -> 114;
            case 191 -> 166;
            case 192 -> 55;
            case 193 -> 210;
            case 194 -> 149;
            case 195 -> 67;
            case 196 -> 9;
            case 197 -> 142;
            case 198 -> 140;
            case 199 -> 224;
            case 200 -> 143;
            case 201 -> 151;
            case 202 -> 179;
            case 203 -> 254;
            case 204 -> 230;
            case 205 -> 123;
            case 206 -> 126;
            case 207 -> 251;
            case 208 -> 223;
            case 209 -> 97;
            case 210 -> 85;
            case 211 -> 105;
            case 212 -> 170;
            case 213 -> 160;
            case 214 -> 241;
            case 215 -> 48;
            case 216 -> 14;
            case 217 -> 146;
            case 218 -> 178;
            case 219 -> 95;
            case 220 -> 226;
            case 221 -> 27;
            case 222 -> 180;
            case 223 -> 153;
            case 224 -> 134;
            case 225 -> 107;
            case 226 -> 228;
            case 227 -> 31;
            case 228 -> 44;
            case 229 -> 58;
            case 230 -> 60;
            case 231 -> 16;
            case 232 -> 36;
            case 233 -> 243;
            case 234 -> 194;
            case 235 -> 18;
            case 236 -> 81;
            case 237 -> 137;
            case 238 -> 139;
            case 239 -> 217;
            case 240 -> 184;
            case 241 -> 252;
            case 242 -> 218;
            case 243 -> 138;
            case 244 -> 23;
            case 245 -> 51;
            case 246 -> 182;
            case 247 -> 250;
            case 248 -> 25;
            case 249 -> 29;
            case 250 -> 173;
            case 251 -> 92;
            case 252 -> 152;
            case 253 -> 165;
            case 254 -> 34;
            default -> 64;
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
