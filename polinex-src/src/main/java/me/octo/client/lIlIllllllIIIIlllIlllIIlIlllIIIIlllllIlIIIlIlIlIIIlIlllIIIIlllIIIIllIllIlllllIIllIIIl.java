package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIlIllllllIIIIlllIlllIIlIlllIIIIlllllIlIIIlIlIlIIIlIlllIIIIlllIIIIllIllIlllllIIllIIIl {
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   @NotNull
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public static final IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII c() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      pxClinit: {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "V?bON\u0012<_<yJ\u00176\fT&fZX\f<g:aM_";
      int var5 = "V?bON\u0012<_<yJ\u00176\fT&fZX\f<g:aM_".length();
      char var2 = '\r';
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 26;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
            label48: {
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
                     break label48;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 13;
                     case 1 -> 73;
                     case 2 -> 15;
                     case 3 -> 52;
                     case 4 -> 45;
                     case 5 -> 123;
                     default -> 6;
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
                  var0[var4++] = var29;
                  if ((var8 += var2) >= var5) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        var0[0], var0[2], false
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        var0[3], var0[1], false
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII() {
                        private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        private static String[] f;
                        private static String[] g;

                        {
                           short var10001x = -29024;
                           short var10002x = -32058;
                           var10002x = -29023;
                           short var10003 = -23001;
                        }

                        @Override
                        public boolean b() {
                           return lIlIllllllIIIIlllIlllIIlIlllIIIIlllllIlIIIlIlIlIIIlIlllIIIIlllIIIIllIllIlllllIIllIIIl.b().ae();
                        }

                        public static void b(boolean var0x) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var0x;
                        }

                        public static boolean t() {
                           return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        }

                        public static boolean u() {
                           boolean var0x = t();
                           return !var0x;
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static {
                           pxClinit: {
                           String[] var5 = new String[2];
                           int var3 = 0;
                           String var2 = "?ðºÎ\u0090\u0013Ê:DHÐ.h¬ \u0011)Ù\u0012üvÂ\u001e\u009f\t+Yx\u0000W'\u0098\u00ad¾\u0015êY";
                           int var4 = "?ðºÎ\u0090\u0013Ê:DHÐ.h¬ \u0011)Ù\u0012üvÂ\u001e\u009f\t+Yx\u0000W'\u0098\u00ad¾\u0015êY".length();
                           char var1 = 18;
                           b(false);
                           int var0 = -1;

                           while (true) {
                              char[] var10002;
                              label38: {
                                 char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                                 int var10004 = var10003.length;
                                 int var6 = 0;
                                 byte var13 = 63;
                                 var10002 = var10003;
                                 int var8 = var10004;
                                 byte var16;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var16 = 63;
                                    var10006 = var6;
                                 } else {
                                    var13 = 63;
                                    var8 = var10004;
                                    if (var10004 <= var6) {
                                       break label38;
                                    }

                                    var10005 = var10003;
                                    var16 = 63;
                                    var10006 = var6;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                       case 0 -> 60;
                                       case 1 -> 68;
                                       case 2 -> 90;
                                       case 3 -> 47;
                                       case 4 -> 38;
                                       case 5 -> 96;
                                       default -> 102;
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
                                 g = new String[2];
                                 break pxClinit;
                              }

                              var1 = var2.charAt(var0);
                           }
                           }
                        }

                        private static String c(int var0x, int var1) {
                           int var2x = (var0x ^ -29023) & 65535;
                           if (g[var2x] == null) {
                              char[] var3 = f[var2x].toCharArray();

                              short var4x = switch (var3[0] & 0xFF) {
                                 case 0 -> 33;
                                 case 1 -> 217;
                                 case 2 -> 244;
                                 case 3 -> 25;
                                 case 4 -> 195;
                                 case 5 -> 100;
                                 case 6 -> 158;
                                 case 7 -> 223;
                                 case 8 -> 118;
                                 case 9 -> 4;
                                 case 10 -> 78;
                                 case 11 -> 31;
                                 case 12 -> 16;
                                 case 13 -> 165;
                                 case 14 -> 19;
                                 case 15 -> 111;
                                 case 16 -> 9;
                                 case 17 -> 146;
                                 case 18 -> 155;
                                 case 19 -> 18;
                                 case 20 -> 110;
                                 case 21 -> 241;
                                 case 22 -> 170;
                                 case 23 -> 95;
                                 case 24 -> 210;
                                 case 25 -> 255;
                                 case 26 -> 36;
                                 case 27 -> 187;
                                 case 28 -> 135;
                                 case 29 -> 197;
                                 case 30 -> 81;
                                 case 31 -> 56;
                                 case 32 -> 96;
                                 case 33 -> 139;
                                 case 34 -> 164;
                                 case 35 -> 91;
                                 case 36 -> 30;
                                 case 37 -> 89;
                                 case 38 -> 224;
                                 case 39 -> 176;
                                 case 40 -> 76;
                                 case 41 -> 214;
                                 case 42 -> 84;
                                 case 43 -> 121;
                                 case 44 -> 196;
                                 case 45 -> 128;
                                 case 46 -> 44;
                                 case 47 -> 225;
                                 case 48 -> 215;
                                 case 49 -> 112;
                                 case 50 -> 181;
                                 case 51 -> 160;
                                 case 52 -> 233;
                                 case 53 -> 140;
                                 case 54 -> 242;
                                 case 55 -> 29;
                                 case 56 -> 62;
                                 case 57 -> 71;
                                 case 58 -> 72;
                                 case 59 -> 129;
                                 case 60 -> 168;
                                 case 61 -> 138;
                                 case 62 -> 229;
                                 case 63 -> 98;
                                 case 64 -> 34;
                                 case 65 -> 240;
                                 case 66 -> 87;
                                 case 67 -> 106;
                                 case 68 -> 156;
                                 case 69 -> 83;
                                 case 70 -> 136;
                                 case 71 -> 230;
                                 case 72 -> 82;
                                 case 73 -> 188;
                                 case 74 -> 93;
                                 case 75 -> 252;
                                 case 76 -> 39;
                                 case 77 -> 116;
                                 case 78 -> 147;
                                 case 79 -> 117;
                                 case 80 -> 27;
                                 case 81 -> 186;
                                 case 82 -> 253;
                                 case 83 -> 2;
                                 case 84 -> 52;
                                 case 85 -> 107;
                                 case 86 -> 142;
                                 case 87 -> 28;
                                 case 88 -> 90;
                                 case 89 -> 46;
                                 case 90 -> 194;
                                 case 91 -> 228;
                                 case 92 -> 7;
                                 case 93 -> 64;
                                 case 94 -> 249;
                                 case 95 -> 55;
                                 case 96 -> 151;
                                 case 97 -> 202;
                                 case 98 -> 180;
                                 case 99 -> 227;
                                 case 100 -> 5;
                                 case 101 -> 88;
                                 case 102 -> 53;
                                 case 103 -> 221;
                                 case 104 -> 86;
                                 case 105 -> 1;
                                 case 106 -> 226;
                                 case 107 -> 85;
                                 case 108 -> 114;
                                 case 109 -> 108;
                                 case 110 -> 80;
                                 case 111 -> 12;
                                 case 112 -> 141;
                                 case 113 -> 45;
                                 case 114 -> 49;
                                 case 115 -> 250;
                                 case 116 -> 166;
                                 case 117 -> 65;
                                 case 118 -> 57;
                                 case 119 -> 161;
                                 case 120 -> 182;
                                 case 121 -> 105;
                                 case 122 -> 219;
                                 case 123 -> 68;
                                 case 124 -> 47;
                                 case 125 -> 198;
                                 case 126 -> 123;
                                 case 127 -> 0;
                                 case 128 -> 247;
                                 case 129 -> 8;
                                 case 130 -> 3;
                                 case 131 -> 208;
                                 case 132 -> 130;
                                 case 133 -> 125;
                                 case 134 -> 126;
                                 case 135 -> 218;
                                 case 136 -> 50;
                                 case 137 -> 20;
                                 case 138 -> 235;
                                 case 139 -> 150;
                                 case 140 -> 41;
                                 case 141 -> 159;
                                 case 142 -> 74;
                                 case 143 -> 120;
                                 case 144 -> 79;
                                 case 145 -> 15;
                                 case 146 -> 243;
                                 case 147 -> 236;
                                 case 148 -> 6;
                                 case 149 -> 115;
                                 case 150 -> 124;
                                 case 151 -> 200;
                                 case 152 -> 248;
                                 case 153 -> 157;
                                 case 154 -> 32;
                                 case 155 -> 254;
                                 case 156 -> 67;
                                 case 157 -> 205;
                                 case 158 -> 177;
                                 case 159 -> 14;
                                 case 160 -> 60;
                                 case 161 -> 232;
                                 case 162 -> 201;
                                 case 163 -> 104;
                                 case 164 -> 149;
                                 case 165 -> 191;
                                 case 166 -> 213;
                                 case 167 -> 102;
                                 case 168 -> 17;
                                 case 169 -> 131;
                                 case 170 -> 179;
                                 case 171 -> 66;
                                 case 172 -> 167;
                                 case 173 -> 92;
                                 case 174 -> 185;
                                 case 175 -> 143;
                                 case 176 -> 239;
                                 case 177 -> 54;
                                 case 178 -> 11;
                                 case 179 -> 97;
                                 case 180 -> 119;
                                 case 181 -> 43;
                                 case 182 -> 212;
                                 case 183 -> 101;
                                 case 184 -> 77;
                                 case 185 -> 35;
                                 case 186 -> 133;
                                 case 187 -> 231;
                                 case 188 -> 13;
                                 case 189 -> 63;
                                 case 190 -> 154;
                                 case 191 -> 190;
                                 case 192 -> 38;
                                 case 193 -> 199;
                                 case 194 -> 169;
                                 case 195 -> 48;
                                 case 196 -> 245;
                                 case 197 -> 69;
                                 case 198 -> 59;
                                 case 199 -> 21;
                                 case 200 -> 22;
                                 case 201 -> 162;
                                 case 202 -> 122;
                                 case 203 -> 175;
                                 case 204 -> 109;
                                 case 205 -> 237;
                                 case 206 -> 144;
                                 case 207 -> 204;
                                 case 208 -> 58;
                                 case 209 -> 203;
                                 case 210 -> 234;
                                 case 211 -> 222;
                                 case 212 -> 61;
                                 case 213 -> 216;
                                 case 214 -> 103;
                                 case 215 -> 193;
                                 case 216 -> 163;
                                 case 217 -> 183;
                                 case 218 -> 172;
                                 case 219 -> 40;
                                 case 220 -> 178;
                                 case 221 -> 24;
                                 case 222 -> 192;
                                 case 223 -> 209;
                                 case 224 -> 220;
                                 case 225 -> 113;
                                 case 226 -> 70;
                                 case 227 -> 152;
                                 case 228 -> 37;
                                 case 229 -> 238;
                                 case 230 -> 134;
                                 case 231 -> 42;
                                 case 232 -> 246;
                                 case 233 -> 148;
                                 case 234 -> 94;
                                 case 235 -> 23;
                                 case 236 -> 153;
                                 case 237 -> 145;
                                 case 238 -> 207;
                                 case 239 -> 127;
                                 case 240 -> 75;
                                 case 241 -> 206;
                                 case 242 -> 26;
                                 case 243 -> 73;
                                 case 244 -> 189;
                                 case 245 -> 251;
                                 case 246 -> 51;
                                 case 247 -> 99;
                                 case 248 -> 137;
                                 case 249 -> 132;
                                 case 250 -> 173;
                                 case 251 -> 171;
                                 case 252 -> 211;
                                 case 253 -> 174;
                                 case 254 -> 184;
                                 default -> 10;
                              };
                              int var5x = (var1 & 0xFF) - var4x;
                              if (var5x < 0) {
                                 var5x += 256;
                              }

                              int var6 = ((var1 & 65535) >>> 8) - var4x;
                              if (var6 < 0) {
                                 var6 += 256;
                              }

                              for (int var7 = 0; var7 < var3.length; var7++) {
                                 int var8x = var7 % 2;
                                 char var10002x = var3[var7];
                                 if (var8x == 0) {
                                    var3[var7] = (char)(var10002x ^ var5x);
                                    var5x = ((var5x >>> 3 | var5x << 5) ^ var3[var7]) & 0xFF;
                                 } else {
                                    var3[var7] = (char)(var10002x ^ var6);
                                    var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                                 }
                              }

                              g[var2x] = new String(var3).intern();
                           }

                           return g[var2x];
                        }
                     };
                     break label53;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var29;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label53;
                  }

                  var3 = "\u0002k6\u001b\u001aFh+h-\u001e\u0010\u0015\u001fcl$\u0003\f\u0000r2\u000e\fXh\u0013n5\u0019\u000b";
                  var5 = "\u0002k6\u001b\u001aFh+h-\u001e\u0010\u0015\u001fcl$\u0003\f\u0000r2\u000e\fXh\u0013n5\u0019\u000b".length();
                  var2 = 18;
                  var8 = -1;
            }

            var10000 = 78;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
      }
         }
      }
   }
}
