package me.octo.client.utils;

import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

public final class IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll<T>
   implements Comparator<T> {
   private static String[] a;
   private static String[] b;

   public final int compare(T var1, T var2) {
      File var3 = (File)var1;
      boolean var4 = false;
      String var10000 = var3.getName();
      short var10002 = -30992;
      short var10003 = -12825;
      Intrinsics.checkNotNullExpressionValue(var10000, "getName(...)");
      var10000 = var10000.toLowerCase(Locale.ROOT);
      var10002 = -30990;
      var10003 = 11972;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      Comparable var9 = var10000;
      var3 = (File)var2;
      Comparable var5 = var9;
      var4 = false;
      var10000 = var3.getName();
      var10002 = -30991;
      var10003 = -31301;
      Intrinsics.checkNotNullExpressionValue(var10000, "getName(...)");
      var10000 = var10000.toLowerCase(Locale.ROOT);
      var10002 = -30989;
      var10003 = 25243;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return ComparisonsKt.compareValues(var5, var10000);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "L\u00143ÐFpµÃ÷>î¾\f\u009f¿I¥\tÞ\\\u0016Ê\u0084Ié";
      int var4 = "L\u00143ÐFpµÃ÷>î¾\f\u009f¿I¥\tÞ\\\u0016Ê\u0084Ié".length();
      char var1 = '\f';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 37;
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
                     case 0 -> 101;
                     case 1 -> 97;
                     case 2 -> 104;
                     case 3 -> 120;
                     case 4 -> 55;
                     case 5 -> 14;
                     default -> 50;
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
                     a = var5;
                     b = new String[4];
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

                  var2 = "-ýú+ú®MÖþk\u008eO\u001a\u0013\u000fª\u0010\u001e·\u009cb6\u0087ÔóÍÏèÛÖ\u0081\u0096ø";
                  var4 = "-ýú+ú®MÖþk\u008eO\u001a\u0013\u000fª\u0010\u001e·\u009cb6\u0087ÔóÍÏèÛÖ\u0081\u0096ø".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 40;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -30991) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 140;
            case 1 -> 49;
            case 2 -> 131;
            case 3 -> 79;
            case 4 -> 62;
            case 5 -> 255;
            case 6 -> 97;
            case 7 -> 171;
            case 8 -> 88;
            case 9 -> 148;
            case 10 -> 42;
            case 11 -> 2;
            case 12 -> 80;
            case 13 -> 161;
            case 14 -> 254;
            case 15 -> 251;
            case 16 -> 186;
            case 17 -> 126;
            case 18 -> 77;
            case 19 -> 198;
            case 20 -> 16;
            case 21 -> 65;
            case 22 -> 53;
            case 23 -> 156;
            case 24 -> 250;
            case 25 -> 168;
            case 26 -> 34;
            case 27 -> 233;
            case 28 -> 130;
            case 29 -> 253;
            case 30 -> 85;
            case 31 -> 164;
            case 32 -> 200;
            case 33 -> 107;
            case 34 -> 119;
            case 35 -> 81;
            case 36 -> 40;
            case 37 -> 226;
            case 38 -> 63;
            case 39 -> 35;
            case 40 -> 83;
            case 41 -> 239;
            case 42 -> 217;
            case 43 -> 222;
            case 44 -> 144;
            case 45 -> 241;
            case 46 -> 150;
            case 47 -> 98;
            case 48 -> 176;
            case 49 -> 179;
            case 50 -> 185;
            case 51 -> 68;
            case 52 -> 216;
            case 53 -> 205;
            case 54 -> 182;
            case 55 -> 151;
            case 56 -> 166;
            case 57 -> 118;
            case 58 -> 174;
            case 59 -> 134;
            case 60 -> 31;
            case 61 -> 194;
            case 62 -> 115;
            case 63 -> 203;
            case 64 -> 101;
            case 65 -> 240;
            case 66 -> 66;
            case 67 -> 213;
            case 68 -> 12;
            case 69 -> 13;
            case 70 -> 243;
            case 71 -> 177;
            case 72 -> 212;
            case 73 -> 54;
            case 74 -> 188;
            case 75 -> 244;
            case 76 -> 129;
            case 77 -> 0;
            case 78 -> 208;
            case 79 -> 224;
            case 80 -> 114;
            case 81 -> 225;
            case 82 -> 121;
            case 83 -> 157;
            case 84 -> 117;
            case 85 -> 245;
            case 86 -> 169;
            case 87 -> 25;
            case 88 -> 56;
            case 89 -> 1;
            case 90 -> 112;
            case 91 -> 38;
            case 92 -> 76;
            case 93 -> 108;
            case 94 -> 105;
            case 95 -> 69;
            case 96 -> 135;
            case 97 -> 44;
            case 98 -> 41;
            case 99 -> 211;
            case 100 -> 61;
            case 101 -> 45;
            case 102 -> 9;
            case 103 -> 99;
            case 104 -> 24;
            case 105 -> 106;
            case 106 -> 57;
            case 107 -> 102;
            case 108 -> 17;
            case 109 -> 113;
            case 110 -> 146;
            case 111 -> 86;
            case 112 -> 75;
            case 113 -> 60;
            case 114 -> 37;
            case 115 -> 78;
            case 116 -> 163;
            case 117 -> 55;
            case 118 -> 8;
            case 119 -> 160;
            case 120 -> 27;
            case 121 -> 173;
            case 122 -> 36;
            case 123 -> 175;
            case 124 -> 228;
            case 125 -> 138;
            case 126 -> 104;
            case 127 -> 100;
            case 128 -> 141;
            case 129 -> 82;
            case 130 -> 238;
            case 131 -> 201;
            case 132 -> 111;
            case 133 -> 23;
            case 134 -> 178;
            case 135 -> 187;
            case 136 -> 181;
            case 137 -> 153;
            case 138 -> 136;
            case 139 -> 207;
            case 140 -> 192;
            case 141 -> 22;
            case 142 -> 15;
            case 143 -> 242;
            case 144 -> 232;
            case 145 -> 28;
            case 146 -> 92;
            case 147 -> 72;
            case 148 -> 215;
            case 149 -> 124;
            case 150 -> 227;
            case 151 -> 149;
            case 152 -> 183;
            case 153 -> 127;
            case 154 -> 51;
            case 155 -> 48;
            case 156 -> 210;
            case 157 -> 236;
            case 158 -> 235;
            case 159 -> 59;
            case 160 -> 94;
            case 161 -> 230;
            case 162 -> 4;
            case 163 -> 32;
            case 164 -> 202;
            case 165 -> 199;
            case 166 -> 7;
            case 167 -> 122;
            case 168 -> 14;
            case 169 -> 43;
            case 170 -> 3;
            case 171 -> 209;
            case 172 -> 167;
            case 173 -> 87;
            case 174 -> 195;
            case 175 -> 154;
            case 176 -> 137;
            case 177 -> 50;
            case 178 -> 90;
            case 179 -> 206;
            case 180 -> 29;
            case 181 -> 52;
            case 182 -> 196;
            case 183 -> 84;
            case 184 -> 33;
            case 185 -> 162;
            case 186 -> 248;
            case 187 -> 220;
            case 188 -> 10;
            case 189 -> 184;
            case 190 -> 18;
            case 191 -> 95;
            case 192 -> 70;
            case 193 -> 231;
            case 194 -> 214;
            case 195 -> 229;
            case 196 -> 133;
            case 197 -> 103;
            case 198 -> 123;
            case 199 -> 158;
            case 200 -> 125;
            case 201 -> 20;
            case 202 -> 116;
            case 203 -> 128;
            case 204 -> 19;
            case 205 -> 219;
            case 206 -> 110;
            case 207 -> 197;
            case 208 -> 155;
            case 209 -> 172;
            case 210 -> 193;
            case 211 -> 120;
            case 212 -> 96;
            case 213 -> 147;
            case 214 -> 11;
            case 215 -> 152;
            case 216 -> 93;
            case 217 -> 109;
            case 218 -> 89;
            case 219 -> 218;
            case 220 -> 5;
            case 221 -> 180;
            case 222 -> 26;
            case 223 -> 47;
            case 224 -> 58;
            case 225 -> 237;
            case 226 -> 190;
            case 227 -> 91;
            case 228 -> 39;
            case 229 -> 30;
            case 230 -> 132;
            case 231 -> 64;
            case 232 -> 165;
            case 233 -> 191;
            case 234 -> 249;
            case 235 -> 204;
            case 236 -> 170;
            case 237 -> 189;
            case 238 -> 159;
            case 239 -> 221;
            case 240 -> 223;
            case 241 -> 73;
            case 242 -> 6;
            case 243 -> 252;
            case 244 -> 46;
            case 245 -> 139;
            case 246 -> 234;
            case 247 -> 143;
            case 248 -> 247;
            case 249 -> 71;
            case 250 -> 246;
            case 251 -> 21;
            case 252 -> 74;
            case 253 -> 67;
            case 254 -> 145;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}
