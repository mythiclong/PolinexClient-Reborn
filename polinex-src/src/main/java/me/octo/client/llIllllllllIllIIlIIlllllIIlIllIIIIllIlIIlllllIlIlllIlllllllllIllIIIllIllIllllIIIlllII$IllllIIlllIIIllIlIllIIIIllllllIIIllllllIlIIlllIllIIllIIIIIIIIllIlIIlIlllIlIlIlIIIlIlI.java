package me.octo.client;

import java.util.Comparator;
import java.util.Locale;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

public final class llIllllllllIllIIlIIlllllIIlIllIIIIllIlIIlllllIlIlllIlllllllllIllIIIllIllIllllIIIlllII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI<T>
   implements Comparator<T> {
   private static String[] a;
   private static String[] b;

   public final int compare(T var1, T var2) {
      String var3 = (String)var1;
      boolean var4 = false;
      String var10000 = var3.toLowerCase(Locale.ROOT);
      short var10002 = -32376;
      short var10003 = -13693;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      Comparable var8 = var10000;
      var3 = (String)var2;
      Comparable var5 = var8;
      var4 = false;
      var10000 = var3.toLowerCase(Locale.ROOT);
      var10002 = -32375;
      var10003 = -5552;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return ComparisonsKt.compareValues(var5, var10000);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u008aG\u0005XßåGe\u0088\u0016d:b\u0013Ú\u009d\u0010\u001b\u00857\u0000\u0099î\u008f\u0004\u0091:G¿\u0006£V\u008b";
      int var4 = "\u008aG\u0005XßåGe\u0088\u0016d:b\u0013Ú\u009d\u0010\u001b\u00857\u0000\u0099î\u008f\u0004\u0091:G¿\u0006£V\u008b".length();
      char var1 = 16;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 22;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 22;
               var10006 = var6;
            } else {
               var13 = 22;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 22;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 40;
                  case 1 -> 100;
                  case 2 -> 51;
                  case 3 -> 5;
                  case 4 -> 127;
                  case 5 -> 125;
                  default -> 108;
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
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32375) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 137;
            case 1 -> 232;
            case 2 -> 204;
            case 3 -> 249;
            case 4 -> 130;
            case 5 -> 4;
            case 6 -> 175;
            case 7 -> 92;
            case 8 -> 48;
            case 9 -> 231;
            case 10 -> 1;
            case 11 -> 125;
            case 12 -> 241;
            case 13 -> 172;
            case 14 -> 169;
            case 15 -> 158;
            case 16 -> 52;
            case 17 -> 161;
            case 18 -> 181;
            case 19 -> 150;
            case 20 -> 108;
            case 21 -> 16;
            case 22 -> 154;
            case 23 -> 44;
            case 24 -> 145;
            case 25 -> 179;
            case 26 -> 87;
            case 27 -> 80;
            case 28 -> 250;
            case 29 -> 37;
            case 30 -> 22;
            case 31 -> 194;
            case 32 -> 86;
            case 33 -> 187;
            case 34 -> 61;
            case 35 -> 81;
            case 36 -> 65;
            case 37 -> 50;
            case 38 -> 251;
            case 39 -> 233;
            case 40 -> 198;
            case 41 -> 223;
            case 42 -> 42;
            case 43 -> 146;
            case 44 -> 202;
            case 45 -> 114;
            case 46 -> 128;
            case 47 -> 236;
            case 48 -> 101;
            case 49 -> 222;
            case 50 -> 91;
            case 51 -> 103;
            case 52 -> 170;
            case 53 -> 70;
            case 54 -> 7;
            case 55 -> 63;
            case 56 -> 140;
            case 57 -> 126;
            case 58 -> 26;
            case 59 -> 74;
            case 60 -> 177;
            case 61 -> 97;
            case 62 -> 118;
            case 63 -> 242;
            case 64 -> 106;
            case 65 -> 240;
            case 66 -> 68;
            case 67 -> 77;
            case 68 -> 216;
            case 69 -> 12;
            case 70 -> 99;
            case 71 -> 41;
            case 72 -> 245;
            case 73 -> 173;
            case 74 -> 32;
            case 75 -> 168;
            case 76 -> 11;
            case 77 -> 2;
            case 78 -> 212;
            case 79 -> 186;
            case 80 -> 208;
            case 81 -> 56;
            case 82 -> 18;
            case 83 -> 43;
            case 84 -> 197;
            case 85 -> 115;
            case 86 -> 19;
            case 87 -> 147;
            case 88 -> 21;
            case 89 -> 134;
            case 90 -> 185;
            case 91 -> 132;
            case 92 -> 14;
            case 93 -> 207;
            case 94 -> 237;
            case 95 -> 8;
            case 96 -> 29;
            case 97 -> 162;
            case 98 -> 133;
            case 99 -> 206;
            case 100 -> 49;
            case 101 -> 111;
            case 102 -> 46;
            case 103 -> 55;
            case 104 -> 94;
            case 105 -> 34;
            case 106 -> 160;
            case 107 -> 129;
            case 108 -> 205;
            case 109 -> 78;
            case 110 -> 122;
            case 111 -> 72;
            case 112 -> 165;
            case 113 -> 47;
            case 114 -> 255;
            case 115 -> 142;
            case 116 -> 188;
            case 117 -> 220;
            case 118 -> 211;
            case 119 -> 85;
            case 120 -> 100;
            case 121 -> 119;
            case 122 -> 66;
            case 123 -> 53;
            case 124 -> 219;
            case 125 -> 226;
            case 126 -> 230;
            case 127 -> 176;
            case 128 -> 201;
            case 129 -> 25;
            case 130 -> 98;
            case 131 -> 84;
            case 132 -> 57;
            case 133 -> 166;
            case 134 -> 238;
            case 135 -> 109;
            case 136 -> 163;
            case 137 -> 89;
            case 138 -> 193;
            case 139 -> 116;
            case 140 -> 234;
            case 141 -> 38;
            case 142 -> 210;
            case 143 -> 190;
            case 144 -> 254;
            case 145 -> 0;
            case 146 -> 182;
            case 147 -> 203;
            case 148 -> 35;
            case 149 -> 153;
            case 150 -> 199;
            case 151 -> 248;
            case 152 -> 104;
            case 153 -> 183;
            case 154 -> 40;
            case 155 -> 246;
            case 156 -> 95;
            case 157 -> 243;
            case 158 -> 107;
            case 159 -> 143;
            case 160 -> 253;
            case 161 -> 20;
            case 162 -> 227;
            case 163 -> 252;
            case 164 -> 192;
            case 165 -> 209;
            case 166 -> 23;
            case 167 -> 228;
            case 168 -> 191;
            case 169 -> 102;
            case 170 -> 75;
            case 171 -> 123;
            case 172 -> 30;
            case 173 -> 105;
            case 174 -> 171;
            case 175 -> 60;
            case 176 -> 138;
            case 177 -> 27;
            case 178 -> 135;
            case 179 -> 229;
            case 180 -> 144;
            case 181 -> 5;
            case 182 -> 28;
            case 183 -> 24;
            case 184 -> 155;
            case 185 -> 148;
            case 186 -> 58;
            case 187 -> 45;
            case 188 -> 124;
            case 189 -> 54;
            case 190 -> 3;
            case 191 -> 83;
            case 192 -> 218;
            case 193 -> 157;
            case 194 -> 113;
            case 195 -> 112;
            case 196 -> 131;
            case 197 -> 141;
            case 198 -> 180;
            case 199 -> 139;
            case 200 -> 184;
            case 201 -> 244;
            case 202 -> 51;
            case 203 -> 69;
            case 204 -> 239;
            case 205 -> 136;
            case 206 -> 110;
            case 207 -> 195;
            case 208 -> 96;
            case 209 -> 149;
            case 210 -> 15;
            case 211 -> 151;
            case 212 -> 9;
            case 213 -> 156;
            case 214 -> 67;
            case 215 -> 62;
            case 216 -> 214;
            case 217 -> 189;
            case 218 -> 221;
            case 219 -> 17;
            case 220 -> 93;
            case 221 -> 117;
            case 222 -> 164;
            case 223 -> 225;
            case 224 -> 13;
            case 225 -> 10;
            case 226 -> 213;
            case 227 -> 215;
            case 228 -> 127;
            case 229 -> 33;
            case 230 -> 90;
            case 231 -> 79;
            case 232 -> 71;
            case 233 -> 36;
            case 234 -> 152;
            case 235 -> 6;
            case 236 -> 64;
            case 237 -> 76;
            case 238 -> 247;
            case 239 -> 200;
            case 240 -> 59;
            case 241 -> 159;
            case 242 -> 31;
            case 243 -> 82;
            case 244 -> 73;
            case 245 -> 120;
            case 246 -> 174;
            case 247 -> 121;
            case 248 -> 39;
            case 249 -> 217;
            case 250 -> 224;
            case 251 -> 167;
            case 252 -> 235;
            case 253 -> 178;
            case 254 -> 88;
            default -> 196;
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
