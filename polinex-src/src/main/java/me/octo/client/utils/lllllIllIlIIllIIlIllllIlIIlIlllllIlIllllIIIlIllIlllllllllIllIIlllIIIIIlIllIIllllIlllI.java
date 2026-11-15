package me.octo.client.utils;

import org.jetbrains.annotations.NotNull;

public final class lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] c;
   private static String[] d;

   private lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI() {
   }

   private final void g() {
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var1 != null) {
         if (System.currentTimeMillis() - IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            < llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            return;
         }

         new Thread(lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI::j).start();
      }
   }

   @NotNull
   public final String h() {
      this.g();
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final String i() {
      this.g();
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   private static final void j() {
      String var0 = me.octo.client.utils.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      try {
         String var1 = me.octo.client.utils.IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.n("https://api.hypixel.net/v2/resources/skyblock/election");
         CharSequence var2 = (CharSequence)var1;
         if (var2.length() == 0) { return; }
         com.google.gson.JsonObject var3 = com.google.gson.JsonParser.parseString(var1).getAsJsonObject();
         com.google.gson.JsonObject var4 = var3.getAsJsonObject("mayor");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (var4 != null && var4.get("name") != null) ? var4.get("name").getAsString() : "";
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (var4 != null && var4.getAsJsonObject("minister") != null && var4.getAsJsonObject("minister").get("name") != null) ? var4.getAsJsonObject("minister").get("name").getAsString() : "";
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = System.currentTimeMillis();
      } catch (Exception var5) {
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "ñ)Ð\u0014µ\u00041¥¿\u008f\b\u001aéº\u0003\fÚµJ";
      int var4 = "ñ)Ð\u0014µ\u00041¥¿\u008f\b\u001aéº\u0003\fÚµJ".length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 124;
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
                     case 0 -> 100;
                     case 1 -> 69;
                     case 2 -> 40;
                     case 3 -> 72;
                     case 4 -> 125;
                     case 5 -> 112;
                     default -> 16;
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
                     c = var5;
                     d = new String[5];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = "";
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = "";
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 300000L;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "|\u007fz¸6\nÂk\u00ad\u0003\u0017rE=)ü\u0092UàJût!r%áß3&\u0095ÛÃ]\"<Ù\u0090,Lü\u0000¡Uê)ß?O½;èã]ðÜ{Æ\u0085\u0015";
                  var4 = "|\u007fz¸6\nÂk\u00ad\u0003\u0017rE=)ü\u0092UàJût!r%áß3&\u0095ÛÃ]\"<Ù\u0090,Lü\u0000¡Uê)ß?O½;èã]ðÜ{Æ\u0085\u0015".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 28;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -556) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 155;
            case 1 -> 99;
            case 2 -> 234;
            case 3 -> 232;
            case 4 -> 249;
            case 5 -> 250;
            case 6 -> 185;
            case 7 -> 143;
            case 8 -> 156;
            case 9 -> 75;
            case 10 -> 108;
            case 11 -> 224;
            case 12 -> 4;
            case 13 -> 41;
            case 14 -> 241;
            case 15 -> 231;
            case 16 -> 2;
            case 17 -> 235;
            case 18 -> 102;
            case 19 -> 1;
            case 20 -> 109;
            case 21 -> 255;
            case 22 -> 166;
            case 23 -> 243;
            case 24 -> 57;
            case 25 -> 175;
            case 26 -> 10;
            case 27 -> 135;
            case 28 -> 139;
            case 29 -> 21;
            case 30 -> 0;
            case 31 -> 206;
            case 32 -> 204;
            case 33 -> 146;
            case 34 -> 34;
            case 35 -> 64;
            case 36 -> 35;
            case 37 -> 63;
            case 38 -> 169;
            case 39 -> 78;
            case 40 -> 33;
            case 41 -> 95;
            case 42 -> 201;
            case 43 -> 94;
            case 44 -> 141;
            case 45 -> 219;
            case 46 -> 200;
            case 47 -> 86;
            case 48 -> 32;
            case 49 -> 28;
            case 50 -> 15;
            case 51 -> 244;
            case 52 -> 11;
            case 53 -> 22;
            case 54 -> 163;
            case 55 -> 71;
            case 56 -> 116;
            case 57 -> 172;
            case 58 -> 127;
            case 59 -> 248;
            case 60 -> 85;
            case 61 -> 209;
            case 62 -> 207;
            case 63 -> 107;
            case 64 -> 132;
            case 65 -> 229;
            case 66 -> 128;
            case 67 -> 165;
            case 68 -> 18;
            case 69 -> 253;
            case 70 -> 53;
            case 71 -> 80;
            case 72 -> 217;
            case 73 -> 157;
            case 74 -> 90;
            case 75 -> 228;
            case 76 -> 189;
            case 77 -> 60;
            case 78 -> 221;
            case 79 -> 23;
            case 80 -> 133;
            case 81 -> 164;
            case 82 -> 190;
            case 83 -> 167;
            case 84 -> 48;
            case 85 -> 230;
            case 86 -> 120;
            case 87 -> 212;
            case 88 -> 198;
            case 89 -> 215;
            case 90 -> 27;
            case 91 -> 153;
            case 92 -> 125;
            case 93 -> 46;
            case 94 -> 82;
            case 95 -> 171;
            case 96 -> 117;
            case 97 -> 140;
            case 98 -> 77;
            case 99 -> 93;
            case 100 -> 236;
            case 101 -> 188;
            case 102 -> 180;
            case 103 -> 103;
            case 104 -> 20;
            case 105 -> 39;
            case 106 -> 187;
            case 107 -> 197;
            case 108 -> 151;
            case 109 -> 246;
            case 110 -> 98;
            case 111 -> 174;
            case 112 -> 9;
            case 113 -> 101;
            case 114 -> 225;
            case 115 -> 79;
            case 116 -> 110;
            case 117 -> 81;
            case 118 -> 129;
            case 119 -> 216;
            case 120 -> 96;
            case 121 -> 5;
            case 122 -> 186;
            case 123 -> 14;
            case 124 -> 182;
            case 125 -> 8;
            case 126 -> 222;
            case 127 -> 181;
            case 128 -> 76;
            case 129 -> 68;
            case 130 -> 24;
            case 131 -> 148;
            case 132 -> 43;
            case 133 -> 237;
            case 134 -> 150;
            case 135 -> 49;
            case 136 -> 226;
            case 137 -> 195;
            case 138 -> 223;
            case 139 -> 126;
            case 140 -> 119;
            case 141 -> 154;
            case 142 -> 177;
            case 143 -> 193;
            case 144 -> 70;
            case 145 -> 65;
            case 146 -> 83;
            case 147 -> 214;
            case 148 -> 251;
            case 149 -> 240;
            case 150 -> 227;
            case 151 -> 61;
            case 152 -> 6;
            case 153 -> 115;
            case 154 -> 123;
            case 155 -> 199;
            case 156 -> 218;
            case 157 -> 239;
            case 158 -> 159;
            case 159 -> 149;
            case 160 -> 3;
            case 161 -> 42;
            case 162 -> 62;
            case 163 -> 91;
            case 164 -> 247;
            case 165 -> 147;
            case 166 -> 196;
            case 167 -> 122;
            case 168 -> 29;
            case 169 -> 210;
            case 170 -> 179;
            case 171 -> 12;
            case 172 -> 19;
            case 173 -> 213;
            case 174 -> 192;
            case 175 -> 145;
            case 176 -> 51;
            case 177 -> 36;
            case 178 -> 168;
            case 179 -> 67;
            case 180 -> 37;
            case 181 -> 173;
            case 182 -> 144;
            case 183 -> 252;
            case 184 -> 178;
            case 185 -> 238;
            case 186 -> 26;
            case 187 -> 69;
            case 188 -> 59;
            case 189 -> 74;
            case 190 -> 191;
            case 191 -> 112;
            case 192 -> 152;
            case 193 -> 88;
            case 194 -> 100;
            case 195 -> 38;
            case 196 -> 162;
            case 197 -> 245;
            case 198 -> 113;
            case 199 -> 31;
            case 200 -> 118;
            case 201 -> 87;
            case 202 -> 242;
            case 203 -> 7;
            case 204 -> 124;
            case 205 -> 89;
            case 206 -> 233;
            case 207 -> 30;
            case 208 -> 121;
            case 209 -> 44;
            case 210 -> 134;
            case 211 -> 54;
            case 212 -> 50;
            case 213 -> 97;
            case 214 -> 158;
            case 215 -> 84;
            case 216 -> 137;
            case 217 -> 254;
            case 218 -> 104;
            case 219 -> 25;
            case 220 -> 184;
            case 221 -> 136;
            case 222 -> 131;
            case 223 -> 114;
            case 224 -> 130;
            case 225 -> 220;
            case 226 -> 58;
            case 227 -> 16;
            case 228 -> 45;
            case 229 -> 40;
            case 230 -> 205;
            case 231 -> 111;
            case 232 -> 211;
            case 233 -> 170;
            case 234 -> 66;
            case 235 -> 56;
            case 236 -> 142;
            case 237 -> 176;
            case 238 -> 72;
            case 239 -> 161;
            case 240 -> 13;
            case 241 -> 202;
            case 242 -> 73;
            case 243 -> 17;
            case 244 -> 203;
            case 245 -> 208;
            case 246 -> 138;
            case 247 -> 105;
            case 248 -> 194;
            case 249 -> 52;
            case 250 -> 183;
            case 251 -> 160;
            case 252 -> 55;
            case 253 -> 106;
            case 254 -> 92;
            default -> 47;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
