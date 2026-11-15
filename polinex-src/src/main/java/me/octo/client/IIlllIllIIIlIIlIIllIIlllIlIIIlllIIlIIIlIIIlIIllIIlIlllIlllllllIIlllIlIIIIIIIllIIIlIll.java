package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IIlllIllIIIlIIlIIllIIlllIlIIIlllIIlIIIlIIIlIIllIIlIlllIlllllllIIlllIlIIIIIIIllIIIlIll {
    public static final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b() { return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
   public static final lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      pxClinit: {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "U\u000f\u001f\u0018Xp(`\u000f\u001c\u001eJp?z\u000bR\u0019P7#f\u0003\u0013\u0005\u001929{\t\u001a\u0001W58aN\u0014\u001aKp?`\u001b\u0017U_%'~\f\u0000\u001c^8?<N<\u001c^8?28\u001b\u0006P?%2\u000f\u0002\u0005U9.aN\u0006\u001d\\p;}\u001a\u001b\u001aWp.t\b\u0017\u0016Mp(~\u0007\u0017\u001bM}8{\n\u0017[\f\\\u0007\u0015\u001dMp\u001d{\u001d\u001b\u001aW";
      int var5 = "U\u000f\u001f\u0018Xp(`\u000f\u001c\u001eJp?z\u000bR\u0019P7#f\u0003\u0013\u0005\u001929{\t\u001a\u0001W58aN\u0014\u001aKp?`\u001b\u0017U_%'~\f\u0000\u001c^8?<N<\u001c^8?28\u001b\u0006P?%2\u000f\u0002\u0005U9.aN\u0006\u001d\\p;}\u001a\u001b\u001aWp.t\b\u0017\u0016Mp(~\u0007\u0017\u001bM}8{\n\u0017[\f\\\u0007\u0015\u001dMp\u001d{\u001d\u001b\u001aW"
         .length();
      char var2 = 'm';
      int var9 = -1;

      label53:
while (true) {
         byte var10000 = 99;
         String var10001 = var3.substring(++var9, var9 + var2);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 113;
                     case 1 -> 13;
                     case 2 -> 17;
                     case 3 -> 22;
                     case 4 -> 90;
                     case 5 -> 51;
                     default -> 40;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var31;
                  if ((var9 += var2) >= var5) {
                     String var25 = var0[2];
                     var31 = var0[0];
                     String[] var7 = new String[]{var0[3], var0[1]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
                        var25, var31, 0, var7
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                     break label53;
                  }

                  var2 = var3.charAt(var9);
                  break;
               default:
                  var0[var4++] = var31;
                  if ((var9 += var2) < var5) {
                     var2 = var3.charAt(var9);
                     continue label53;
                  }

                  var3 = "Y\u0007\u0010\u0016\u0005S\t\u0019\u001e^";
                  var5 = "Y\u0007\u0010\u0016\u0005S\t\u0019\u001e^".length();
                  var2 = 4;
                  var9 = -1;
            }

            var10000 = 101;
            var10001 = var3.substring(++var9, var9 + var2);
            var10002 = 0;
      }
         }
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII {
      private static String[] f;
      private static String[] g;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         super("Gamma Level", "How bright Gamma mode goes. 1 = vanilla max, higher = full white.", 1.0F, 15.0F, 10.0F, 0.5F, 0, 64, null);
      }

      @Override
      public boolean b() {
         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var10000x = IIlllIllIIIlIIlIIllIIlllIlIIIlllIIlIIIlIIIlIIllIIlIlllIlllllllIIlllIlIIIIIIIllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001x = -8315;
         short var10002x = -20658;
         return var10000x.c("Gamma");
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "@T \rüÌ#È\u0083ø\u0010¡|\r¥ËJ|\u0001\u0010<ÀâM\u0097[.\u00ad\u0015z\u0096n=³\u008aXU=\u000feú\u0012íèôùÐ\u0006Í$es\u0088iÖ\u0087\u0016\u008c\u001d\"ì\u008fwÚñ\u000598û\u0002Ý\u000b\u009a´\u008f\u0093S©\u0090~j}¼";
         int var4 = "@T \rüÌ#È\u0083ø\u0010¡|\r¥ËJ|\u0001\u0010<ÀâM\u0097[.\u00ad\u0015z\u0096n=³\u008aXU=\u000feú\u0012íèôùÐ\u0006Í$es\u0088iÖ\u0087\u0016\u008c\u001d\"ì\u008fwÚñ\u000598û\u0002Ý\u000b\u009a´\u008f\u0093S©\u0090~j}¼"
            .length();
         char var1 = 'A';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 14;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 14;
                  var10006 = var6;
               } else {
                  var13 = 14;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 14;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 103;
                     case 1 -> 47;
                     case 2 -> 61;
                     case 3 -> 15;
                     case 4 -> 107;
                     case 5 -> 21;
                     default -> 89;
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
               f = var5;
               g = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
         }
      }

      private static String c(int var0x, int var1) {
         int var2x = (var0x ^ -8316) & 65535;
         if (g[var2x] == null) {
            char[] var3 = f[var2x].toCharArray();

            short var4x = switch (var3[0] & 0xFF) {
               case 0 -> 6;
               case 1 -> 197;
               case 2 -> 170;
               case 3 -> 96;
               case 4 -> 137;
               case 5 -> 68;
               case 6 -> 7;
               case 7 -> 200;
               case 8 -> 172;
               case 9 -> 37;
               case 10 -> 107;
               case 11 -> 166;
               case 12 -> 191;
               case 13 -> 112;
               case 14 -> 84;
               case 15 -> 227;
               case 16 -> 116;
               case 17 -> 246;
               case 18 -> 149;
               case 19 -> 193;
               case 20 -> 179;
               case 21 -> 62;
               case 22 -> 14;
               case 23 -> 49;
               case 24 -> 52;
               case 25 -> 86;
               case 26 -> 141;
               case 27 -> 95;
               case 28 -> 53;
               case 29 -> 3;
               case 30 -> 22;
               case 31 -> 97;
               case 32 -> 255;
               case 33 -> 231;
               case 34 -> 232;
               case 35 -> 213;
               case 36 -> 20;
               case 37 -> 140;
               case 38 -> 135;
               case 39 -> 151;
               case 40 -> 196;
               case 41 -> 132;
               case 42 -> 102;
               case 43 -> 105;
               case 44 -> 74;
               case 45 -> 138;
               case 46 -> 10;
               case 47 -> 63;
               case 48 -> 243;
               case 49 -> 133;
               case 50 -> 80;
               case 51 -> 177;
               case 52 -> 183;
               case 53 -> 205;
               case 54 -> 120;
               case 55 -> 253;
               case 56 -> 244;
               case 57 -> 195;
               case 58 -> 254;
               case 59 -> 108;
               case 60 -> 139;
               case 61 -> 216;
               case 62 -> 109;
               case 63 -> 89;
               case 64 -> 186;
               case 65 -> 31;
               case 66 -> 176;
               case 67 -> 5;
               case 68 -> 152;
               case 69 -> 134;
               case 70 -> 121;
               case 71 -> 156;
               case 72 -> 117;
               case 73 -> 248;
               case 74 -> 16;
               case 75 -> 198;
               case 76 -> 78;
               case 77 -> 39;
               case 78 -> 123;
               case 79 -> 146;
               case 80 -> 55;
               case 81 -> 250;
               case 82 -> 110;
               case 83 -> 0;
               case 84 -> 238;
               case 85 -> 46;
               case 86 -> 160;
               case 87 -> 252;
               case 88 -> 76;
               case 89 -> 103;
               case 90 -> 241;
               case 91 -> 92;
               case 92 -> 58;
               case 93 -> 19;
               case 94 -> 9;
               case 95 -> 153;
               case 96 -> 66;
               case 97 -> 91;
               case 98 -> 168;
               case 99 -> 131;
               case 100 -> 190;
               case 101 -> 36;
               case 102 -> 18;
               case 103 -> 189;
               case 104 -> 28;
               case 105 -> 187;
               case 106 -> 94;
               case 107 -> 59;
               case 108 -> 38;
               case 109 -> 235;
               case 110 -> 1;
               case 111 -> 203;
               case 112 -> 65;
               case 113 -> 150;
               case 114 -> 194;
               case 115 -> 206;
               case 116 -> 221;
               case 117 -> 164;
               case 118 -> 175;
               case 119 -> 8;
               case 120 -> 157;
               case 121 -> 145;
               case 122 -> 85;
               case 123 -> 247;
               case 124 -> 25;
               case 125 -> 23;
               case 126 -> 173;
               case 127 -> 43;
               case 128 -> 212;
               case 129 -> 130;
               case 130 -> 83;
               case 131 -> 126;
               case 132 -> 230;
               case 133 -> 202;
               case 134 -> 242;
               case 135 -> 111;
               case 136 -> 72;
               case 137 -> 114;
               case 138 -> 180;
               case 139 -> 56;
               case 140 -> 51;
               case 141 -> 81;
               case 142 -> 240;
               case 143 -> 73;
               case 144 -> 245;
               case 145 -> 169;
               case 146 -> 181;
               case 147 -> 207;
               case 148 -> 127;
               case 149 -> 209;
               case 150 -> 27;
               case 151 -> 118;
               case 152 -> 77;
               case 153 -> 24;
               case 154 -> 67;
               case 155 -> 218;
               case 156 -> 167;
               case 157 -> 226;
               case 158 -> 220;
               case 159 -> 13;
               case 160 -> 57;
               case 161 -> 199;
               case 162 -> 144;
               case 163 -> 188;
               case 164 -> 90;
               case 165 -> 41;
               case 166 -> 2;
               case 167 -> 136;
               case 168 -> 47;
               case 169 -> 70;
               case 170 -> 69;
               case 171 -> 26;
               case 172 -> 228;
               case 173 -> 44;
               case 174 -> 214;
               case 175 -> 33;
               case 176 -> 45;
               case 177 -> 100;
               case 178 -> 225;
               case 179 -> 249;
               case 180 -> 30;
               case 181 -> 29;
               case 182 -> 229;
               case 183 -> 82;
               case 184 -> 64;
               case 185 -> 222;
               case 186 -> 251;
               case 187 -> 40;
               case 188 -> 174;
               case 189 -> 215;
               case 190 -> 158;
               case 191 -> 35;
               case 192 -> 210;
               case 193 -> 15;
               case 194 -> 237;
               case 195 -> 154;
               case 196 -> 223;
               case 197 -> 142;
               case 198 -> 163;
               case 199 -> 211;
               case 200 -> 192;
               case 201 -> 115;
               case 202 -> 178;
               case 203 -> 224;
               case 204 -> 32;
               case 205 -> 34;
               case 206 -> 161;
               case 207 -> 124;
               case 208 -> 162;
               case 209 -> 148;
               case 210 -> 217;
               case 211 -> 75;
               case 212 -> 104;
               case 213 -> 184;
               case 214 -> 233;
               case 215 -> 48;
               case 216 -> 147;
               case 217 -> 21;
               case 218 -> 79;
               case 219 -> 143;
               case 220 -> 99;
               case 221 -> 88;
               case 222 -> 61;
               case 223 -> 101;
               case 224 -> 239;
               case 225 -> 125;
               case 226 -> 60;
               case 227 -> 11;
               case 228 -> 113;
               case 229 -> 106;
               case 230 -> 50;
               case 231 -> 128;
               case 232 -> 4;
               case 233 -> 201;
               case 234 -> 129;
               case 235 -> 155;
               case 236 -> 71;
               case 237 -> 93;
               case 238 -> 185;
               case 239 -> 98;
               case 240 -> 87;
               case 241 -> 236;
               case 242 -> 119;
               case 243 -> 42;
               case 244 -> 165;
               case 245 -> 171;
               case 246 -> 182;
               case 247 -> 54;
               case 248 -> 208;
               case 249 -> 204;
               case 250 -> 12;
               case 251 -> 219;
               case 252 -> 234;
               case 253 -> 122;
               case 254 -> 17;
               default -> 159;
            };
            int var5x = (var1 & 0xFF) - var4x;
            if (var5x < 0) {
               var5x += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4x;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7x = 0; var7x < var3.length; var7x++) {
               int var8 = var7x % 2;
               char var10002x = var3[var7x];
               if (var8 == 0) {
                  var3[var7x] = (char)(var10002x ^ var5x);
                  var5x = ((var5x >>> 3 | var5x << 5) ^ var3[var7x]) & 0xFF;
               } else {
                  var3[var7x] = (char)(var10002x ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7x]) & 0xFF;
               }
            }

            g[var2x] = new String(var3).intern();
         }

         return g[var2x];
      }
   }

}
