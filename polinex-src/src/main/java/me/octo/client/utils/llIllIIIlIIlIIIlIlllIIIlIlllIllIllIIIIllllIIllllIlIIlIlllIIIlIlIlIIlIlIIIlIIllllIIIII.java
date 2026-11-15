package me.octo.client.utils;

import kotlin.text.StringsKt;

public final class llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   private static String[] a;
   private static String[] b;

   private static final String a(String var0) {
      short var10002 = -8273;
      short var10003 = -25944;
      String var10000 = StringsKt.replace(var0, "\\", "\\\\", false);
      var10002 = -8274;
      var10003 = -31818;
      return StringsKt.replace(var10000, "\"", "\\\"", false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\"Y\u0002Þ\u0098";
      int var4 = "\"Y\u0002Þ\u0098".length();
      char var1 = 2;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 53;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            } else {
               var13 = 53;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 1;
                  case 1 -> 12;
                  case 2 -> 4;
                  case 3 -> 1;
                  case 4 -> 87;
                  case 5 -> 47;
                  default -> 21;
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
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -8273) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 168;
            case 1 -> 62;
            case 2 -> 179;
            case 3 -> 237;
            case 4 -> 132;
            case 5 -> 206;
            case 6 -> 231;
            case 7 -> 45;
            case 8 -> 178;
            case 9 -> 6;
            case 10 -> 203;
            case 11 -> 39;
            case 12 -> 208;
            case 13 -> 77;
            case 14 -> 142;
            case 15 -> 10;
            case 16 -> 70;
            case 17 -> 195;
            case 18 -> 104;
            case 19 -> 202;
            case 20 -> 233;
            case 21 -> 160;
            case 22 -> 94;
            case 23 -> 122;
            case 24 -> 60;
            case 25 -> 105;
            case 26 -> 197;
            case 27 -> 151;
            case 28 -> 146;
            case 29 -> 82;
            case 30 -> 103;
            case 31 -> 165;
            case 32 -> 163;
            case 33 -> 250;
            case 34 -> 11;
            case 35 -> 96;
            case 36 -> 13;
            case 37 -> 27;
            case 38 -> 167;
            case 39 -> 225;
            case 40 -> 235;
            case 41 -> 148;
            case 42 -> 79;
            case 43 -> 149;
            case 44 -> 106;
            case 45 -> 43;
            case 46 -> 59;
            case 47 -> 211;
            case 48 -> 85;
            case 49 -> 4;
            case 50 -> 252;
            case 51 -> 123;
            case 52 -> 145;
            case 53 -> 139;
            case 54 -> 166;
            case 55 -> 207;
            case 56 -> 133;
            case 57 -> 230;
            case 58 -> 249;
            case 59 -> 7;
            case 60 -> 115;
            case 61 -> 91;
            case 62 -> 23;
            case 63 -> 138;
            case 64 -> 159;
            case 65 -> 242;
            case 66 -> 99;
            case 67 -> 199;
            case 68 -> 49;
            case 69 -> 121;
            case 70 -> 187;
            case 71 -> 89;
            case 72 -> 86;
            case 73 -> 241;
            case 74 -> 154;
            case 75 -> 212;
            case 76 -> 125;
            case 77 -> 238;
            case 78 -> 155;
            case 79 -> 204;
            case 80 -> 162;
            case 81 -> 114;
            case 82 -> 214;
            case 83 -> 172;
            case 84 -> 108;
            case 85 -> 12;
            case 86 -> 42;
            case 87 -> 66;
            case 88 -> 135;
            case 89 -> 16;
            case 90 -> 196;
            case 91 -> 200;
            case 92 -> 173;
            case 93 -> 158;
            case 94 -> 116;
            case 95 -> 169;
            case 96 -> 51;
            case 97 -> 37;
            case 98 -> 28;
            case 99 -> 35;
            case 100 -> 136;
            case 101 -> 34;
            case 102 -> 64;
            case 103 -> 215;
            case 104 -> 67;
            case 105 -> 143;
            case 106 -> 112;
            case 107 -> 98;
            case 108 -> 171;
            case 109 -> 113;
            case 110 -> 220;
            case 111 -> 236;
            case 112 -> 182;
            case 113 -> 240;
            case 114 -> 102;
            case 115 -> 181;
            case 116 -> 22;
            case 117 -> 65;
            case 118 -> 117;
            case 119 -> 192;
            case 120 -> 185;
            case 121 -> 101;
            case 122 -> 129;
            case 123 -> 47;
            case 124 -> 141;
            case 125 -> 130;
            case 126 -> 218;
            case 127 -> 126;
            case 128 -> 58;
            case 129 -> 100;
            case 130 -> 222;
            case 131 -> 127;
            case 132 -> 32;
            case 133 -> 201;
            case 134 -> 68;
            case 135 -> 253;
            case 136 -> 25;
            case 137 -> 247;
            case 138 -> 15;
            case 139 -> 120;
            case 140 -> 84;
            case 141 -> 31;
            case 142 -> 8;
            case 143 -> 188;
            case 144 -> 17;
            case 145 -> 41;
            case 146 -> 137;
            case 147 -> 191;
            case 148 -> 210;
            case 149 -> 244;
            case 150 -> 92;
            case 151 -> 19;
            case 152 -> 48;
            case 153 -> 186;
            case 154 -> 177;
            case 155 -> 223;
            case 156 -> 234;
            case 157 -> 40;
            case 158 -> 254;
            case 159 -> 119;
            case 160 -> 193;
            case 161 -> 131;
            case 162 -> 80;
            case 163 -> 190;
            case 164 -> 243;
            case 165 -> 78;
            case 166 -> 248;
            case 167 -> 61;
            case 168 -> 3;
            case 169 -> 26;
            case 170 -> 9;
            case 171 -> 157;
            case 172 -> 219;
            case 173 -> 50;
            case 174 -> 81;
            case 175 -> 176;
            case 176 -> 36;
            case 177 -> 164;
            case 178 -> 83;
            case 179 -> 88;
            case 180 -> 97;
            case 181 -> 87;
            case 182 -> 124;
            case 183 -> 1;
            case 184 -> 52;
            case 185 -> 46;
            case 186 -> 74;
            case 187 -> 147;
            case 188 -> 246;
            case 189 -> 109;
            case 190 -> 228;
            case 191 -> 189;
            case 192 -> 209;
            case 193 -> 175;
            case 194 -> 128;
            case 195 -> 71;
            case 196 -> 53;
            case 197 -> 140;
            case 198 -> 111;
            case 199 -> 174;
            case 200 -> 180;
            case 201 -> 69;
            case 202 -> 161;
            case 203 -> 63;
            case 204 -> 170;
            case 205 -> 56;
            case 206 -> 221;
            case 207 -> 134;
            case 208 -> 29;
            case 209 -> 75;
            case 210 -> 227;
            case 211 -> 2;
            case 212 -> 198;
            case 213 -> 216;
            case 214 -> 73;
            case 215 -> 255;
            case 216 -> 239;
            case 217 -> 90;
            case 218 -> 107;
            case 219 -> 44;
            case 220 -> 30;
            case 221 -> 76;
            case 222 -> 226;
            case 223 -> 110;
            case 224 -> 213;
            case 225 -> 72;
            case 226 -> 150;
            case 227 -> 217;
            case 228 -> 194;
            case 229 -> 93;
            case 230 -> 152;
            case 231 -> 33;
            case 232 -> 156;
            case 233 -> 55;
            case 234 -> 0;
            case 235 -> 57;
            case 236 -> 232;
            case 237 -> 183;
            case 238 -> 54;
            case 239 -> 20;
            case 240 -> 153;
            case 241 -> 18;
            case 242 -> 118;
            case 243 -> 38;
            case 244 -> 14;
            case 245 -> 95;
            case 246 -> 21;
            case 247 -> 144;
            case 248 -> 224;
            case 249 -> 184;
            case 250 -> 251;
            case 251 -> 245;
            case 252 -> 24;
            case 253 -> 229;
            case 254 -> 205;
            default -> 5;
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

   // PX-FIX synth restored from jar bytecode
  public static java.lang.String b(java.lang.String p0) { return a(p0); }
}
