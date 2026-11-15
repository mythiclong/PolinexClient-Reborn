package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI {
   @NotNull
   public static lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   private lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI() {
   }

   @NotNull
   public final lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl c() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
      char[] var20 = null; // PX-FIX
      pxClinit: {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u0000h6bJ\u001d\n0u>m\u00199\u000e!\u000f\u0001{%i\u0004,\u0005'>\u001bc\u0018?\u0004!";
      int var5 = "\u0000h6bJ\u001d\n0u>m\u00199\u000e!\u000f\u0001{%i\u0004,\u0005'>\u001bc\u0018?\u0004!".length();
      char var2 = 15;
      int var10 = -1;

      byte var10000 = 17; // PX-FIX hoisted (jar 22 bipush / 36 iconst_m1 segment 1)
      byte var10002 = -1; // PX-FIX hoisted (jar 95 iconst_0 segment 2)

      label53:
while (true) {
         String var10001 = var3.substring(++var10, var10 + var2);

         while (true) {
            label48: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var22 = var26;
               int var16 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 66;
                     case 1 -> 15;
                     case 2 -> 66;
                     case 3 -> 29;
                     case 4 -> 123;
                     case 5 -> 92;
                     default -> 122;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var31;
                  var10 += var2;
                  if (var10 >= var5) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI();
                     String[] var8 = new String[]{var0[1], var0[0]};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
                        var8
                     ) {
                        private static String[] f;
                        private static String[] g;

                        {
                           short var10001x = 5923;
                           short var10002x = 19951;
                           var10002x = 5920;
                           short var10003 = -12314;
                        }

                        @Override
                        public void C() {
                           String var10000x = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
                           String var2x = this.y();
                           String var1 = var10000x;
                           short var10001x = 5921;
                           short var10002x = 26404;
                           boolean var3x = Intrinsics.areEqual(var2x, "Revenant Horror");
                           if (var1 != null) {
                              if (var3x) {
                                 lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b()
                                    .j(5);
                                 if (var1 != null) {
                                    throw new RuntimeException("PX-FIX break");
                                 }
                              }

                              var10001x = 5922;
                              var10002x = -13035;
                              var3x = Intrinsics.areEqual(var2x, "Sven Packmaster");
                           }

                           if (var3x) {
                              lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b()
                                 .j(4);
                              lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b()
                                 .h(
                                    Math.min(
                                       lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .b()
                                          .O(),
                                       4
                                    )
                                 );
                           }
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static {
      char[] var20 = null; // PX-FIX
                           pxClinit: {
                           String[] var5 = new String[4];
                           int var3 = 0;
                           String var2 = "4«çì\u0001\u0095\u00916ú\u0099w\u0094,\u001e°\u0006!\u0002A\u0097\u0014-";
                           int var4 = "4«çì\u0001\u0095\u00916ú\u0099w\u0094,\u001e°\u0006!\u0002A\u0097\u0014-".length();
                           char var1 = 15;
                           int var8 = -1;

                           label52:
                           while (true) {
                              byte var10000 = 76;
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
                                          case 0 -> 55;
                                          case 1 -> 69;
                                          case 2 -> 30;
                                          case 3 -> 34;
                                          case 4 -> 18;
                                          case 5 -> 122;
                                          default -> 115;
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
                                          f = var5;
                                          g = new String[4];
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

                                       var2 = "\u00961\bpíì¶C\u0004\u0015f§\u009etó\u00ad^ª,¡õ:\u0010\u0092]\u0085I¢\u0089\u0097ücj¡{<F®§\u0005{,i\u000fLö\u0086aN#¬¼¤DÌóÎ\u0085v";
                                       var4 = "\u00961\bpíì¶C\u0004\u0015f§\u009etó\u00ad^ª,¡õ:\u0010\u0092]\u0085I¢\u0089\u0097ücj¡{<F®§\u0005{,i\u000fLö\u0086aN#¬¼¤DÌóÎ\u0085v"
                                          .length();
                                       var1 = '+';
                                       var8 = -1;
                                 }

                                 var10000 = 119;
                                 var10001 = var2.substring(++var8, var8 + var1);
                                 var10002 = 0;
                              }
                           }
                           }
                        }

                        private static String c(int var0x, int var1) {
                           int var2x = (var0x ^ 5922) & 65535;
                           if (g[var2x] == null) {
                              char[] var3 = f[var2x].toCharArray();

                              short var4x = switch (var3[0] & 0xFF) {
                                 case 0 -> 122;
                                 case 1 -> 225;
                                 case 2 -> 172;
                                 case 3 -> 59;
                                 case 4 -> 47;
                                 case 5 -> 128;
                                 case 6 -> 235;
                                 case 7 -> 236;
                                 case 8 -> 255;
                                 case 9 -> 248;
                                 case 10 -> 75;
                                 case 11 -> 243;
                                 case 12 -> 198;
                                 case 13 -> 181;
                                 case 14 -> 175;
                                 case 15 -> 170;
                                 case 16 -> 222;
                                 case 17 -> 37;
                                 case 18 -> 193;
                                 case 19 -> 176;
                                 case 20 -> 40;
                                 case 21 -> 9;
                                 case 22 -> 208;
                                 case 23 -> 61;
                                 case 24 -> 64;
                                 case 25 -> 187;
                                 case 26 -> 189;
                                 case 27 -> 16;
                                 case 28 -> 201;
                                 case 29 -> 44;
                                 case 30 -> 164;
                                 case 31 -> 18;
                                 case 32 -> 178;
                                 case 33 -> 96;
                                 case 34 -> 197;
                                 case 35 -> 116;
                                 case 36 -> 247;
                                 case 37 -> 41;
                                 case 38 -> 144;
                                 case 39 -> 190;
                                 case 40 -> 149;
                                 case 41 -> 199;
                                 case 42 -> 43;
                                 case 43 -> 159;
                                 case 44 -> 205;
                                 case 45 -> 70;
                                 case 46 -> 86;
                                 case 47 -> 57;
                                 case 48 -> 15;
                                 case 49 -> 46;
                                 case 50 -> 163;
                                 case 51 -> 250;
                                 case 52 -> 158;
                                 case 53 -> 224;
                                 case 54 -> 168;
                                 case 55 -> 105;
                                 case 56 -> 131;
                                 case 57 -> 88;
                                 case 58 -> 31;
                                 case 59 -> 110;
                                 case 60 -> 104;
                                 case 61 -> 156;
                                 case 62 -> 174;
                                 case 63 -> 203;
                                 case 64 -> 166;
                                 case 65 -> 240;
                                 case 66 -> 20;
                                 case 67 -> 218;
                                 case 68 -> 50;
                                 case 69 -> 29;
                                 case 70 -> 90;
                                 case 71 -> 183;
                                 case 72 -> 71;
                                 case 73 -> 42;
                                 case 74 -> 121;
                                 case 75 -> 107;
                                 case 76 -> 27;
                                 case 77 -> 152;
                                 case 78 -> 141;
                                 case 79 -> 249;
                                 case 80 -> 215;
                                 case 81 -> 157;
                                 case 82 -> 123;
                                 case 83 -> 99;
                                 case 84 -> 241;
                                 case 85 -> 67;
                                 case 86 -> 160;
                                 case 87 -> 34;
                                 case 88 -> 91;
                                 case 89 -> 231;
                                 case 90 -> 230;
                                 case 91 -> 68;
                                 case 92 -> 109;
                                 case 93 -> 211;
                                 case 94 -> 130;
                                 case 95 -> 23;
                                 case 96 -> 108;
                                 case 97 -> 112;
                                 case 98 -> 137;
                                 case 99 -> 216;
                                 case 100 -> 220;
                                 case 101 -> 89;
                                 case 102 -> 69;
                                 case 103 -> 246;
                                 case 104 -> 84;
                                 case 105 -> 28;
                                 case 106 -> 134;
                                 case 107 -> 226;
                                 case 108 -> 127;
                                 case 109 -> 219;
                                 case 110 -> 154;
                                 case 111 -> 133;
                                 case 112 -> 19;
                                 case 113 -> 11;
                                 case 114 -> 212;
                                 case 115 -> 48;
                                 case 116 -> 161;
                                 case 117 -> 234;
                                 case 118 -> 98;
                                 case 119 -> 254;
                                 case 120 -> 73;
                                 case 121 -> 49;
                                 case 122 -> 145;
                                 case 123 -> 251;
                                 case 124 -> 118;
                                 case 125 -> 95;
                                 case 126 -> 3;
                                 case 127 -> 54;
                                 case 128 -> 36;
                                 case 129 -> 186;
                                 case 130 -> 94;
                                 case 131 -> 242;
                                 case 132 -> 114;
                                 case 133 -> 92;
                                 case 134 -> 171;
                                 case 135 -> 119;
                                 case 136 -> 196;
                                 case 137 -> 206;
                                 case 138 -> 14;
                                 case 139 -> 65;
                                 case 140 -> 223;
                                 case 141 -> 58;
                                 case 142 -> 142;
                                 case 143 -> 214;
                                 case 144 -> 0;
                                 case 145 -> 195;
                                 case 146 -> 30;
                                 case 147 -> 245;
                                 case 148 -> 80;
                                 case 149 -> 209;
                                 case 150 -> 56;
                                 case 151 -> 82;
                                 case 152 -> 204;
                                 case 153 -> 62;
                                 case 154 -> 8;
                                 case 155 -> 101;
                                 case 156 -> 191;
                                 case 157 -> 81;
                                 case 158 -> 13;
                                 case 159 -> 140;
                                 case 160 -> 32;
                                 case 161 -> 24;
                                 case 162 -> 180;
                                 case 163 -> 217;
                                 case 164 -> 76;
                                 case 165 -> 173;
                                 case 166 -> 10;
                                 case 167 -> 147;
                                 case 168 -> 38;
                                 case 169 -> 45;
                                 case 170 -> 79;
                                 case 171 -> 35;
                                 case 172 -> 55;
                                 case 173 -> 253;
                                 case 174 -> 146;
                                 case 175 -> 106;
                                 case 176 -> 165;
                                 case 177 -> 97;
                                 case 178 -> 244;
                                 case 179 -> 72;
                                 case 180 -> 25;
                                 case 181 -> 185;
                                 case 182 -> 77;
                                 case 183 -> 238;
                                 case 184 -> 60;
                                 case 185 -> 229;
                                 case 186 -> 21;
                                 case 187 -> 125;
                                 case 188 -> 7;
                                 case 189 -> 87;
                                 case 190 -> 63;
                                 case 191 -> 184;
                                 case 192 -> 188;
                                 case 193 -> 85;
                                 case 194 -> 177;
                                 case 195 -> 221;
                                 case 196 -> 66;
                                 case 197 -> 33;
                                 case 198 -> 5;
                                 case 199 -> 227;
                                 case 200 -> 103;
                                 case 201 -> 207;
                                 case 202 -> 17;
                                 case 203 -> 2;
                                 case 204 -> 120;
                                 case 205 -> 115;
                                 case 206 -> 213;
                                 case 207 -> 132;
                                 case 208 -> 74;
                                 case 209 -> 111;
                                 case 210 -> 210;
                                 case 211 -> 53;
                                 case 212 -> 78;
                                 case 213 -> 1;
                                 case 214 -> 100;
                                 case 215 -> 22;
                                 case 216 -> 200;
                                 case 217 -> 136;
                                 case 218 -> 228;
                                 case 219 -> 179;
                                 case 220 -> 252;
                                 case 221 -> 162;
                                 case 222 -> 169;
                                 case 223 -> 232;
                                 case 224 -> 117;
                                 case 225 -> 194;
                                 case 226 -> 233;
                                 case 227 -> 150;
                                 case 228 -> 139;
                                 case 229 -> 135;
                                 case 230 -> 83;
                                 case 231 -> 182;
                                 case 232 -> 113;
                                 case 233 -> 237;
                                 case 234 -> 239;
                                 case 235 -> 124;
                                 case 236 -> 12;
                                 case 237 -> 155;
                                 case 238 -> 4;
                                 case 239 -> 51;
                                 case 240 -> 148;
                                 case 241 -> 129;
                                 case 242 -> 26;
                                 case 243 -> 202;
                                 case 244 -> 143;
                                 case 245 -> 102;
                                 case 246 -> 192;
                                 case 247 -> 6;
                                 case 248 -> 52;
                                 case 249 -> 93;
                                 case 250 -> 151;
                                 case 251 -> 153;
                                 case 252 -> 167;
                                 case 253 -> 138;
                                 case 254 -> 39;
                                 default -> 126;
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
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
                        var0[3], var0[2], 1, 5, 4, 1
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl("Use crypt scroll", false) { // PX-FIX jar <host>$IllllIIlllIII…<init>:(String,Z)V ldc #14 / iconst_0
                        private static String[] f;
                        private static String[] g;

                        {
                           short var10001x = -9143;
                           short var10002x = -10310;
                        }

                        @Override
                        public boolean b() {
                           String var10000x = lIIIIIlIIIIllllllllIIIlIIlIIIIIIlIlIlIlllIlllIlllIllIIIIIlllllIIIIlIIlIlIlIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                              .y();
                           short var10001x = -9144;
                           short var10002x = 16959;
                           return Intrinsics.areEqual(var10000x, "Revenant Horror");
                        }

                        // $VF: Irreducible bytecode was duplicated to produce valid code
                        static {
                           pxClinit: {
                           String[] var5 = new String[2];
                           int var3 = 0;
                           String var2 = "âÆ\u0093\u001dÏ{\t\u000eDÒª\u0002Õ.¬\u0010MV\u0092\u009e\u0093õ9ªãª\u009cy\u008cr\u0099F";
                           int var4 = "âÆ\u0093\u001dÏ{\t\u000eDÒª\u0002Õ.¬\u0010MV\u0092\u009e\u0093õ9ªãª\u009cy\u008cr\u0099F".length();
                           char var1 = 15;
                           int var0 = -1;

                           while (true) {
                              char[] var10002;
                              label38: {
                                 char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                                 int var10004 = var10003.length;
                                 int var6 = 0;
                                 byte var13 = 91;
                                 var10002 = var10003;
                                 int var8 = var10004;
                                 byte var16;
                                 char[] var10005;
                                 int var10006;
                                 if (var10004 <= 1) {
                                    var10005 = var10003;
                                    var16 = 91;
                                    var10006 = var6;
                                 } else {
                                    var13 = 91;
                                    var8 = var10004;
                                    if (var10004 <= var6) {
                                       break label38;
                                    }

                                    var10005 = var10003;
                                    var16 = 91;
                                    var10006 = var6;
                                 }

                                 while (true) {
                                    var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                       case 0 -> 12;
                                       case 1 -> 18;
                                       case 2 -> 16;
                                       case 3 -> 27;
                                       case 4 -> 89;
                                       case 5 -> 35;
                                       default -> 38;
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

                        private static String c(int var0, int var1) {
                           int var2 = (var0 ^ -9144) & 65535;
                           if (g[var2] == null) {
                              char[] var3 = f[var2].toCharArray();

                              short var4 = switch (var3[0] & 0xFF) {
                                 case 0 -> 81;
                                 case 1 -> 132;
                                 case 2 -> 247;
                                 case 3 -> 134;
                                 case 4 -> 10;
                                 case 5 -> 248;
                                 case 6 -> 50;
                                 case 7 -> 175;
                                 case 8 -> 129;
                                 case 9 -> 118;
                                 case 10 -> 113;
                                 case 11 -> 123;
                                 case 12 -> 181;
                                 case 13 -> 178;
                                 case 14 -> 234;
                                 case 15 -> 16;
                                 case 16 -> 7;
                                 case 17 -> 252;
                                 case 18 -> 158;
                                 case 19 -> 89;
                                 case 20 -> 240;
                                 case 21 -> 57;
                                 case 22 -> 183;
                                 case 23 -> 115;
                                 case 24 -> 199;
                                 case 25 -> 204;
                                 case 26 -> 107;
                                 case 27 -> 100;
                                 case 28 -> 70;
                                 case 29 -> 102;
                                 case 30 -> 1;
                                 case 31 -> 83;
                                 case 32 -> 77;
                                 case 33 -> 245;
                                 case 34 -> 246;
                                 case 35 -> 217;
                                 case 36 -> 101;
                                 case 37 -> 59;
                                 case 38 -> 90;
                                 case 39 -> 97;
                                 case 40 -> 214;
                                 case 41 -> 92;
                                 case 42 -> 87;
                                 case 43 -> 94;
                                 case 44 -> 54;
                                 case 45 -> 49;
                                 case 46 -> 160;
                                 case 47 -> 232;
                                 case 48 -> 38;
                                 case 49 -> 190;
                                 case 50 -> 125;
                                 case 51 -> 98;
                                 case 52 -> 187;
                                 case 53 -> 157;
                                 case 54 -> 46;
                                 case 55 -> 93;
                                 case 56 -> 17;
                                 case 57 -> 13;
                                 case 58 -> 200;
                                 case 59 -> 71;
                                 case 60 -> 6;
                                 case 61 -> 9;
                                 case 62 -> 165;
                                 case 63 -> 85;
                                 case 64 -> 130;
                                 case 65 -> 5;
                                 case 66 -> 184;
                                 case 67 -> 237;
                                 case 68 -> 11;
                                 case 69 -> 122;
                                 case 70 -> 25;
                                 case 71 -> 159;
                                 case 72 -> 143;
                                 case 73 -> 105;
                                 case 74 -> 121;
                                 case 75 -> 96;
                                 case 76 -> 3;
                                 case 77 -> 108;
                                 case 78 -> 213;
                                 case 79 -> 219;
                                 case 80 -> 174;
                                 case 81 -> 238;
                                 case 82 -> 195;
                                 case 83 -> 255;
                                 case 84 -> 156;
                                 case 85 -> 14;
                                 case 86 -> 228;
                                 case 87 -> 133;
                                 case 88 -> 167;
                                 case 89 -> 12;
                                 case 90 -> 51;
                                 case 91 -> 136;
                                 case 92 -> 74;
                                 case 93 -> 148;
                                 case 94 -> 202;
                                 case 95 -> 127;
                                 case 96 -> 163;
                                 case 97 -> 191;
                                 case 98 -> 91;
                                 case 99 -> 224;
                                 case 100 -> 251;
                                 case 101 -> 103;
                                 case 102 -> 24;
                                 case 103 -> 242;
                                 case 104 -> 52;
                                 case 105 -> 78;
                                 case 106 -> 116;
                                 case 107 -> 31;
                                 case 108 -> 111;
                                 case 109 -> 42;
                                 case 110 -> 220;
                                 case 111 -> 145;
                                 case 112 -> 198;
                                 case 113 -> 2;
                                 case 114 -> 66;
                                 case 115 -> 110;
                                 case 116 -> 41;
                                 case 117 -> 23;
                                 case 118 -> 186;
                                 case 119 -> 192;
                                 case 120 -> 65;
                                 case 121 -> 229;
                                 case 122 -> 171;
                                 case 123 -> 221;
                                 case 124 -> 147;
                                 case 125 -> 26;
                                 case 126 -> 30;
                                 case 127 -> 168;
                                 case 128 -> 207;
                                 case 129 -> 29;
                                 case 130 -> 226;
                                 case 131 -> 154;
                                 case 132 -> 227;
                                 case 133 -> 182;
                                 case 134 -> 209;
                                 case 135 -> 141;
                                 case 136 -> 218;
                                 case 137 -> 177;
                                 case 138 -> 76;
                                 case 139 -> 241;
                                 case 140 -> 40;
                                 case 141 -> 149;
                                 case 142 -> 243;
                                 case 143 -> 135;
                                 case 144 -> 205;
                                 case 145 -> 131;
                                 case 146 -> 211;
                                 case 147 -> 4;
                                 case 148 -> 153;
                                 case 149 -> 172;
                                 case 150 -> 250;
                                 case 151 -> 32;
                                 case 152 -> 27;
                                 case 153 -> 188;
                                 case 154 -> 19;
                                 case 155 -> 150;
                                 case 156 -> 164;
                                 case 157 -> 196;
                                 case 158 -> 55;
                                 case 159 -> 161;
                                 case 160 -> 169;
                                 case 161 -> 39;
                                 case 162 -> 128;
                                 case 163 -> 139;
                                 case 164 -> 223;
                                 case 165 -> 208;
                                 case 166 -> 45;
                                 case 167 -> 63;
                                 case 168 -> 239;
                                 case 169 -> 144;
                                 case 170 -> 225;
                                 case 171 -> 179;
                                 case 172 -> 69;
                                 case 173 -> 244;
                                 case 174 -> 137;
                                 case 175 -> 231;
                                 case 176 -> 185;
                                 case 177 -> 95;
                                 case 178 -> 48;
                                 case 179 -> 33;
                                 case 180 -> 140;
                                 case 181 -> 88;
                                 case 182 -> 28;
                                 case 183 -> 47;
                                 case 184 -> 215;
                                 case 185 -> 82;
                                 case 186 -> 189;
                                 case 187 -> 35;
                                 case 188 -> 112;
                                 case 189 -> 120;
                                 case 190 -> 72;
                                 case 191 -> 152;
                                 case 192 -> 138;
                                 case 193 -> 21;
                                 case 194 -> 60;
                                 case 195 -> 99;
                                 case 196 -> 58;
                                 case 197 -> 20;
                                 case 198 -> 79;
                                 case 199 -> 254;
                                 case 200 -> 233;
                                 case 201 -> 180;
                                 case 202 -> 117;
                                 case 203 -> 8;
                                 case 204 -> 80;
                                 case 205 -> 176;
                                 case 206 -> 236;
                                 case 207 -> 22;
                                 case 208 -> 210;
                                 case 209 -> 56;
                                 case 210 -> 44;
                                 case 211 -> 222;
                                 case 212 -> 75;
                                 case 213 -> 114;
                                 case 214 -> 68;
                                 case 215 -> 146;
                                 case 216 -> 62;
                                 case 217 -> 119;
                                 case 218 -> 230;
                                 case 219 -> 235;
                                 case 220 -> 67;
                                 case 221 -> 53;
                                 case 222 -> 193;
                                 case 223 -> 166;
                                 case 224 -> 155;
                                 case 225 -> 162;
                                 case 226 -> 151;
                                 case 227 -> 86;
                                 case 228 -> 43;
                                 case 229 -> 109;
                                 case 230 -> 73;
                                 case 231 -> 15;
                                 case 232 -> 104;
                                 case 233 -> 203;
                                 case 234 -> 253;
                                 case 235 -> 84;
                                 case 236 -> 0;
                                 case 237 -> 106;
                                 case 238 -> 18;
                                 case 239 -> 142;
                                 case 240 -> 64;
                                 case 241 -> 173;
                                 case 242 -> 212;
                                 case 243 -> 37;
                                 case 244 -> 197;
                                 case 245 -> 170;
                                 case 246 -> 34;
                                 case 247 -> 249;
                                 case 248 -> 216;
                                 case 249 -> 206;
                                 case 250 -> 124;
                                 case 251 -> 36;
                                 case 252 -> 201;
                                 case 253 -> 126;
                                 case 254 -> 61;
                                 default -> 194;
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

                              g[var2] = new String(var3).intern();
                           }

                           return g[var2];
                        }
                     };
                     break label53;
                  }

                  var2 = var3.charAt(var10);
                  continue label53; // PX-FIX jar 124 goto 82: re-enter the head so ++var10 runs (was break;)
               default:
                  var0[var4++] = var31;
                  var10 += var2;
                  if (var10 < var5) {
                     var2 = var3.charAt(var10);
                     continue label53;
                  }

                  var3 = "D5uoEk^u10 O.\\x80<LbMs)u+\t}Dq$u=\u0007\fC1q6L|\b\\8f*E";
                  var5 = "D5uoEk^u10 O.\\x80<LbMs)u+\t}Dq$u=\u0007\fC1q6L|\b\\8f*E".length();
                  var2 = '!';
                  var10 = -1;
                  var10002 = 0;   // PX-FIX jar 95 iconst_0: second segment must run the case 0 arm
                  continue label53; // PX-FIX jar 22/24/27: after installing literal 2 the loop re-enters the head, it does not fall through into the append block
            }

      }
         }
      }
   }
}