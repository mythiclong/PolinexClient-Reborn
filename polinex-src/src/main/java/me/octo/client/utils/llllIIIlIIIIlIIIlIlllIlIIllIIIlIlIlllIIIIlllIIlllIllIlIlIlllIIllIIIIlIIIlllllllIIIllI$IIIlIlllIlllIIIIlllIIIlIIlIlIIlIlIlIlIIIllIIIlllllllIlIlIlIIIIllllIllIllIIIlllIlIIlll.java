package me.octo.client.utils;

final class llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
   extends kotlin.jvm.internal.FunctionReferenceImpl
   implements kotlin.jvm.functions.Function1 {
   private static String[] a;
   private static String[] b;

   {
      short var10004 = 17212;
      short var10005 = -25810;
      var10005 = 17213;
      short var10006 = -22519;
   }

   llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object var1) {
      super(1, var1, me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.class, "easeOutQuart", "easeOutQuart(F)F", 0);
   }

   public final Float a(float var1) {
      return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver).p(var1);
   }

   public Object invoke(Object var1) {
      return this.a(((Number)var1).floatValue());
   }

               static {
   pxClinit: { // PX-FIX
                  String[] var5x = new String[2];
                  int var3x = 0;
                  String var2 = "·+ü\u0083þÂÚ§\\^ìÁ\u0087S\u0081*\fè¸\u0017ñ\u0083\u008cun©gRæ";
                  int var4x = "·+ü\u0083þÂÚ§\\^ìÁ\u0087S\u0081*\fè¸\u0017ñ\u0083\u008cun©gRæ".length();
                  char var1x = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 26;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 26;
                           var10006 = var6;
                        } else {
                           var13 = 26;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 26;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 6;
                              case 1 -> 61;
                              case 2 -> 41;
                              case 3 -> 48;
                              case 4 -> 79;
                              case 5 -> 81;
                              default -> 103;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002x;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002x;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002x).intern();
                     byte var10 = -1;
                     var5x[var3x++] = var15;
                     if ((var0 += var1x) >= var4x) {
                        a = var5x;
                        b = new String[2];
                        break pxClinit; // PX-FIX
                     }

                     var1x = var2.charAt(var0);
                  }
   } // PX-FIX end pxClinit
               }

   private static String a(int var0, int var1x) {
      int var2 = (var0 ^ 17213) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4x = switch (var3[0] & 0xFF) {
            case 0 -> 22;
            case 1 -> 137;
            case 2 -> 93;
            case 3 -> 70;
            case 4 -> 3;
            case 5 -> 200;
            case 6 -> 202;
            case 7 -> 181;
            case 8 -> 143;
            case 9 -> 131;
            case 10 -> 76;
            case 11 -> 23;
            case 12 -> 16;
            case 13 -> 126;
            case 14 -> 189;
            case 15 -> 63;
            case 16 -> 136;
            case 17 -> 33;
            case 18 -> 79;
            case 19 -> 116;
            case 20 -> 90;
            case 21 -> 158;
            case 22 -> 11;
            case 23 -> 230;
            case 24 -> 232;
            case 25 -> 57;
            case 26 -> 115;
            case 27 -> 7;
            case 28 -> 164;
            case 29 -> 221;
            case 30 -> 204;
            case 31 -> 207;
            case 32 -> 192;
            case 33 -> 132;
            case 34 -> 18;
            case 35 -> 216;
            case 36 -> 55;
            case 37 -> 183;
            case 38 -> 173;
            case 39 -> 238;
            case 40 -> 91;
            case 41 -> 100;
            case 42 -> 248;
            case 43 -> 133;
            case 44 -> 174;
            case 45 -> 73;
            case 46 -> 129;
            case 47 -> 224;
            case 48 -> 152;
            case 49 -> 37;
            case 50 -> 163;
            case 51 -> 160;
            case 52 -> 104;
            case 53 -> 219;
            case 54 -> 109;
            case 55 -> 39;
            case 56 -> 0;
            case 57 -> 101;
            case 58 -> 45;
            case 59 -> 26;
            case 60 -> 153;
            case 61 -> 147;
            case 62 -> 229;
            case 63 -> 49;
            case 64 -> 242;
            case 65 -> 64;
            case 66 -> 32;
            case 67 -> 19;
            case 68 -> 51;
            case 69 -> 156;
            case 70 -> 208;
            case 71 -> 20;
            case 72 -> 197;
            case 73 -> 127;
            case 74 -> 168;
            case 75 -> 62;
            case 76 -> 50;
            case 77 -> 186;
            case 78 -> 235;
            case 79 -> 87;
            case 80 -> 165;
            case 81 -> 178;
            case 82 -> 205;
            case 83 -> 213;
            case 84 -> 206;
            case 85 -> 71;
            case 86 -> 220;
            case 87 -> 110;
            case 88 -> 250;
            case 89 -> 252;
            case 90 -> 240;
            case 91 -> 209;
            case 92 -> 98;
            case 93 -> 48;
            case 94 -> 108;
            case 95 -> 150;
            case 96 -> 159;
            case 97 -> 121;
            case 98 -> 40;
            case 99 -> 86;
            case 100 -> 112;
            case 101 -> 14;
            case 102 -> 13;
            case 103 -> 88;
            case 104 -> 29;
            case 105 -> 54;
            case 106 -> 17;
            case 107 -> 24;
            case 108 -> 218;
            case 109 -> 68;
            case 110 -> 42;
            case 111 -> 120;
            case 112 -> 46;
            case 113 -> 169;
            case 114 -> 244;
            case 115 -> 146;
            case 116 -> 96;
            case 117 -> 125;
            case 118 -> 83;
            case 119 -> 6;
            case 120 -> 198;
            case 121 -> 190;
            case 122 -> 4;
            case 123 -> 179;
            case 124 -> 243;
            case 125 -> 38;
            case 126 -> 246;
            case 127 -> 58;
            case 128 -> 74;
            case 129 -> 170;
            case 130 -> 8;
            case 131 -> 77;
            case 132 -> 177;
            case 133 -> 124;
            case 134 -> 223;
            case 135 -> 15;
            case 136 -> 134;
            case 137 -> 249;
            case 138 -> 25;
            case 139 -> 84;
            case 140 -> 239;
            case 141 -> 35;
            case 142 -> 144;
            case 143 -> 237;
            case 144 -> 119;
            case 145 -> 65;
            case 146 -> 187;
            case 147 -> 118;
            case 148 -> 89;
            case 149 -> 142;
            case 150 -> 130;
            case 151 -> 241;
            case 152 -> 151;
            case 153 -> 166;
            case 154 -> 135;
            case 155 -> 139;
            case 156 -> 196;
            case 157 -> 31;
            case 158 -> 254;
            case 159 -> 222;
            case 160 -> 82;
            case 161 -> 41;
            case 162 -> 201;
            case 163 -> 154;
            case 164 -> 211;
            case 165 -> 52;
            case 166 -> 210;
            case 167 -> 176;
            case 168 -> 47;
            case 169 -> 105;
            case 170 -> 247;
            case 171 -> 59;
            case 172 -> 175;
            case 173 -> 106;
            case 174 -> 203;
            case 175 -> 233;
            case 176 -> 167;
            case 177 -> 184;
            case 178 -> 103;
            case 179 -> 123;
            case 180 -> 180;
            case 181 -> 61;
            case 182 -> 2;
            case 183 -> 27;
            case 184 -> 188;
            case 185 -> 128;
            case 186 -> 78;
            case 187 -> 85;
            case 188 -> 226;
            case 189 -> 56;
            case 190 -> 214;
            case 191 -> 217;
            case 192 -> 138;
            case 193 -> 34;
            case 194 -> 194;
            case 195 -> 95;
            case 196 -> 99;
            case 197 -> 185;
            case 198 -> 149;
            case 199 -> 1;
            case 200 -> 60;
            case 201 -> 72;
            case 202 -> 9;
            case 203 -> 225;
            case 204 -> 172;
            case 205 -> 36;
            case 206 -> 80;
            case 207 -> 44;
            case 208 -> 212;
            case 209 -> 255;
            case 210 -> 102;
            case 211 -> 28;
            case 212 -> 182;
            case 213 -> 215;
            case 214 -> 111;
            case 215 -> 195;
            case 216 -> 155;
            case 217 -> 199;
            case 218 -> 251;
            case 219 -> 30;
            case 220 -> 145;
            case 221 -> 228;
            case 222 -> 21;
            case 223 -> 114;
            case 224 -> 141;
            case 225 -> 140;
            case 226 -> 234;
            case 227 -> 10;
            case 228 -> 12;
            case 229 -> 253;
            case 230 -> 92;
            case 231 -> 97;
            case 232 -> 193;
            case 233 -> 162;
            case 234 -> 122;
            case 235 -> 236;
            case 236 -> 75;
            case 237 -> 113;
            case 238 -> 227;
            case 239 -> 107;
            case 240 -> 81;
            case 241 -> 69;
            case 242 -> 67;
            case 243 -> 245;
            case 244 -> 157;
            case 245 -> 5;
            case 246 -> 191;
            case 247 -> 231;
            case 248 -> 94;
            case 249 -> 161;
            case 250 -> 53;
            case 251 -> 43;
            case 252 -> 171;
            case 253 -> 66;
            case 254 -> 117;
            default -> 148;
         };
         int var5x = (var1x & 0xFF) - var4x;
         if (var5x < 0) {
            var5x += 256;
         }

         int var6 = ((var1x & 65535) >>> 8) - var4x;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002x = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002x ^ var5x);
               var5x = ((var5x >>> 3 | var5x << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002x ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

}
