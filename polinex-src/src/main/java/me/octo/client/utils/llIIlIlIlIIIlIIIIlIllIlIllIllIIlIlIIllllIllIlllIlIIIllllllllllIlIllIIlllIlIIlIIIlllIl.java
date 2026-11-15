package me.octo.client.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl
   extends lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll {
   public Object invoke(Float p0) { return null; } // PX-FIX abs




   public Object receiver; // PX-FIX kotlin lambda receiver

   private static String[] e;
   private static String[] f;

   public llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl(
      long var1,
      @NotNull String var3,
      @NotNull String var4,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5
   ) {
      Object receiver = null; // PX-FIX
      short var10001 = -2289;
      short var10002 = 17524;
      Intrinsics.checkNotNullParameter(var3, "title");
      var10001 = -2292;
      var10002 = 10886;
      Intrinsics.checkNotNullParameter(var4, "body");
      var10001 = -2290;
      var10002 = -29789;
      Intrinsics.checkNotNullParameter(var5, "style");
      super(
         var1,
         var3,
         var4,
         var5,
         (Function1)(
            new Function1<Float, Float>(

) {
   public Float invoke(Float p0) { return null; } // PX-FIX abs2
      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 4427;
                  short var10005 = -17013;
                  var10005 = 4426;
                  short var10006 = -4834;
               }

               public final Float a() {
      Object receiver = null; // PX-FIX
                  return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver)
                     .p(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: { // PX-FIX
                  String[] var5 = new String[2];
                  int var3 = 0;
                  String var2 = " ´\u001fq\u0005zÁ¶`}j\"±KAv\f]D oò¹?Î¿r\u0091Ã";
                  int var4 = " ´\u001fq\u0005zÁ¶`}j\"±KAv\f]D oò¹?Î¿r\u0091Ã".length();
                  char var1 = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 40;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 40;
                           var10006 = var6;
                        } else {
                           var13 = 40;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 40;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 87;
                              case 1 -> 116;
                              case 2 -> 118;
                              case 3 -> 108;
                              case 4 -> 87;
                              case 5 -> 72;
                              default -> 116;
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
                  int var2 = (var0 ^ 4426) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 198;
                        case 1 -> 9;
                        case 2 -> 32;
                        case 3 -> 217;
                        case 4 -> 95;
                        case 5 -> 181;
                        case 6 -> 91;
                        case 7 -> 35;
                        case 8 -> 216;
                        case 9 -> 147;
                        case 10 -> 145;
                        case 11 -> 231;
                        case 12 -> 103;
                        case 13 -> 113;
                        case 14 -> 220;
                        case 15 -> 124;
                        case 16 -> 19;
                        case 17 -> 85;
                        case 18 -> 172;
                        case 19 -> 245;
                        case 20 -> 167;
                        case 21 -> 202;
                        case 22 -> 1;
                        case 23 -> 232;
                        case 24 -> 203;
                        case 25 -> 23;
                        case 26 -> 244;
                        case 27 -> 20;
                        case 28 -> 196;
                        case 29 -> 142;
                        case 30 -> 122;
                        case 31 -> 119;
                        case 32 -> 14;
                        case 33 -> 166;
                        case 34 -> 68;
                        case 35 -> 134;
                        case 36 -> 212;
                        case 37 -> 237;
                        case 38 -> 235;
                        case 39 -> 93;
                        case 40 -> 33;
                        case 41 -> 138;
                        case 42 -> 143;
                        case 43 -> 183;
                        case 44 -> 53;
                        case 45 -> 108;
                        case 46 -> 26;
                        case 47 -> 8;
                        case 48 -> 48;
                        case 49 -> 86;
                        case 50 -> 169;
                        case 51 -> 101;
                        case 52 -> 168;
                        case 53 -> 30;
                        case 54 -> 130;
                        case 55 -> 211;
                        case 56 -> 248;
                        case 57 -> 18;
                        case 58 -> 84;
                        case 59 -> 114;
                        case 60 -> 224;
                        case 61 -> 16;
                        case 62 -> 37;
                        case 63 -> 60;
                        case 64 -> 73;
                        case 65 -> 83;
                        case 66 -> 209;
                        case 67 -> 120;
                        case 68 -> 141;
                        case 69 -> 96;
                        case 70 -> 213;
                        case 71 -> 151;
                        case 72 -> 132;
                        case 73 -> 153;
                        case 74 -> 105;
                        case 75 -> 194;
                        case 76 -> 44;
                        case 77 -> 174;
                        case 78 -> 43;
                        case 79 -> 99;
                        case 80 -> 40;
                        case 81 -> 154;
                        case 82 -> 206;
                        case 83 -> 111;
                        case 84 -> 195;
                        case 85 -> 246;
                        case 86 -> 149;
                        case 87 -> 226;
                        case 88 -> 65;
                        case 89 -> 56;
                        case 90 -> 249;
                        case 91 -> 239;
                        case 92 -> 5;
                        case 93 -> 57;
                        case 94 -> 52;
                        case 95 -> 2;
                        case 96 -> 191;
                        case 97 -> 230;
                        case 98 -> 78;
                        case 99 -> 118;
                        case 100 -> 182;
                        case 101 -> 79;
                        case 102 -> 27;
                        case 103 -> 66;
                        case 104 -> 51;
                        case 105 -> 177;
                        case 106 -> 190;
                        case 107 -> 184;
                        case 108 -> 161;
                        case 109 -> 3;
                        case 110 -> 126;
                        case 111 -> 80;
                        case 112 -> 144;
                        case 113 -> 236;
                        case 114 -> 250;
                        case 115 -> 97;
                        case 116 -> 228;
                        case 117 -> 185;
                        case 118 -> 238;
                        case 119 -> 252;
                        case 120 -> 187;
                        case 121 -> 159;
                        case 122 -> 98;
                        case 123 -> 243;
                        case 124 -> 59;
                        case 125 -> 219;
                        case 126 -> 112;
                        case 127 -> 157;
                        case 128 -> 94;
                        case 129 -> 204;
                        case 130 -> 17;
                        case 131 -> 88;
                        case 132 -> 7;
                        case 133 -> 34;
                        case 134 -> 69;
                        case 135 -> 115;
                        case 136 -> 29;
                        case 137 -> 208;
                        case 138 -> 241;
                        case 139 -> 121;
                        case 140 -> 205;
                        case 141 -> 77;
                        case 142 -> 131;
                        case 143 -> 42;
                        case 144 -> 31;
                        case 145 -> 74;
                        case 146 -> 253;
                        case 147 -> 146;
                        case 148 -> 81;
                        case 149 -> 229;
                        case 150 -> 221;
                        case 151 -> 207;
                        case 152 -> 38;
                        case 153 -> 28;
                        case 154 -> 22;
                        case 155 -> 164;
                        case 156 -> 127;
                        case 157 -> 225;
                        case 158 -> 4;
                        case 159 -> 116;
                        case 160 -> 11;
                        case 161 -> 158;
                        case 162 -> 176;
                        case 163 -> 222;
                        case 164 -> 12;
                        case 165 -> 82;
                        case 166 -> 188;
                        case 167 -> 21;
                        case 168 -> 49;
                        case 169 -> 41;
                        case 170 -> 223;
                        case 171 -> 192;
                        case 172 -> 92;
                        case 173 -> 90;
                        case 174 -> 47;
                        case 175 -> 39;
                        case 176 -> 210;
                        case 177 -> 215;
                        case 178 -> 156;
                        case 179 -> 15;
                        case 180 -> 61;
                        case 181 -> 163;
                        case 182 -> 25;
                        case 183 -> 179;
                        case 184 -> 189;
                        case 185 -> 218;
                        case 186 -> 152;
                        case 187 -> 62;
                        case 188 -> 197;
                        case 189 -> 87;
                        case 190 -> 0;
                        case 191 -> 233;
                        case 192 -> 175;
                        case 193 -> 46;
                        case 194 -> 72;
                        case 195 -> 136;
                        case 196 -> 75;
                        case 197 -> 150;
                        case 198 -> 170;
                        case 199 -> 251;
                        case 200 -> 117;
                        case 201 -> 129;
                        case 202 -> 135;
                        case 203 -> 162;
                        case 204 -> 55;
                        case 205 -> 63;
                        case 206 -> 107;
                        case 207 -> 201;
                        case 208 -> 76;
                        case 209 -> 199;
                        case 210 -> 6;
                        case 211 -> 137;
                        case 212 -> 102;
                        case 213 -> 109;
                        case 214 -> 13;
                        case 215 -> 45;
                        case 216 -> 214;
                        case 217 -> 186;
                        case 218 -> 234;
                        case 219 -> 67;
                        case 220 -> 106;
                        case 221 -> 171;
                        case 222 -> 70;
                        case 223 -> 100;
                        case 224 -> 155;
                        case 225 -> 128;
                        case 226 -> 10;
                        case 227 -> 193;
                        case 228 -> 227;
                        case 229 -> 139;
                        case 230 -> 173;
                        case 231 -> 242;
                        case 232 -> 180;
                        case 233 -> 255;
                        case 234 -> 165;
                        case 235 -> 178;
                        case 236 -> 24;
                        case 237 -> 133;
                        case 238 -> 125;
                        case 239 -> 104;
                        case 240 -> 200;
                        case 241 -> 54;
                        case 242 -> 50;
                        case 243 -> 58;
                        case 244 -> 110;
                        case 245 -> 247;
                        case 246 -> 160;
                        case 247 -> 123;
                        case 248 -> 254;
                        case 249 -> 89;
                        case 250 -> 148;
                        case 251 -> 36;
                        case 252 -> 140;
                        case 253 -> 64;
                        case 254 -> 71;
                        default -> 240;
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
         ),
         (Function1)(
            new Function1<Float, Float>(

) {
   public Float invoke(Float p0) { return null; } // PX-FIX abs2
               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 32566;
                  short var10005 = -27294;
                  var10005 = 32567;
                  short var10006 = 10873;
               }

               public final Float a() {
                  return me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: { // PX-FIX
                  String[] var5 = new String[2];
                  int var3 = 0;
                  String var2 = ".\u0011/Ìa&|=Å¾ÌLöB»E\f %þJ[ö;'-ýÑ$";
                  int var4 = ".\u0011/Ìa&|=Å¾ÌLöB»E\f %þJ[ö;'-ýÑ$".length();
                  char var1 = 16;
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
                              case 0 -> 29;
                              case 1 -> 81;
                              case 2 -> 96;
                              case 3 -> 127;
                              case 4 -> 73;
                              case 5 -> 127;
                              default -> 56;
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
                  int var2 = (var0 ^ 32567) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 165;
                        case 1 -> 30;
                        case 2 -> 228;
                        case 3 -> 227;
                        case 4 -> 123;
                        case 5 -> 170;
                        case 6 -> 22;
                        case 7 -> 49;
                        case 8 -> 152;
                        case 9 -> 180;
                        case 10 -> 206;
                        case 11 -> 3;
                        case 12 -> 224;
                        case 13 -> 61;
                        case 14 -> 150;
                        case 15 -> 122;
                        case 16 -> 96;
                        case 17 -> 148;
                        case 18 -> 238;
                        case 19 -> 34;
                        case 20 -> 136;
                        case 21 -> 66;
                        case 22 -> 36;
                        case 23 -> 79;
                        case 24 -> 236;
                        case 25 -> 4;
                        case 26 -> 203;
                        case 27 -> 197;
                        case 28 -> 161;
                        case 29 -> 92;
                        case 30 -> 8;
                        case 31 -> 32;
                        case 32 -> 142;
                        case 33 -> 204;
                        case 34 -> 128;
                        case 35 -> 246;
                        case 36 -> 230;
                        case 37 -> 171;
                        case 38 -> 234;
                        case 39 -> 239;
                        case 40 -> 129;
                        case 41 -> 107;
                        case 42 -> 176;
                        case 43 -> 181;
                        case 44 -> 174;
                        case 45 -> 186;
                        case 46 -> 155;
                        case 47 -> 213;
                        case 48 -> 84;
                        case 49 -> 17;
                        case 50 -> 16;
                        case 51 -> 7;
                        case 52 -> 172;
                        case 53 -> 114;
                        case 54 -> 217;
                        case 55 -> 159;
                        case 56 -> 41;
                        case 57 -> 43;
                        case 58 -> 45;
                        case 59 -> 47;
                        case 60 -> 178;
                        case 61 -> 87;
                        case 62 -> 0;
                        case 63 -> 133;
                        case 64 -> 121;
                        case 65 -> 98;
                        case 66 -> 187;
                        case 67 -> 218;
                        case 68 -> 60;
                        case 69 -> 102;
                        case 70 -> 241;
                        case 71 -> 182;
                        case 72 -> 156;
                        case 73 -> 113;
                        case 74 -> 240;
                        case 75 -> 138;
                        case 76 -> 97;
                        case 77 -> 189;
                        case 78 -> 81;
                        case 79 -> 64;
                        case 80 -> 10;
                        case 81 -> 88;
                        case 82 -> 82;
                        case 83 -> 126;
                        case 84 -> 208;
                        case 85 -> 18;
                        case 86 -> 158;
                        case 87 -> 131;
                        case 88 -> 157;
                        case 89 -> 243;
                        case 90 -> 132;
                        case 91 -> 222;
                        case 92 -> 52;
                        case 93 -> 245;
                        case 94 -> 242;
                        case 95 -> 209;
                        case 96 -> 215;
                        case 97 -> 25;
                        case 98 -> 89;
                        case 99 -> 249;
                        case 100 -> 200;
                        case 101 -> 86;
                        case 102 -> 44;
                        case 103 -> 72;
                        case 104 -> 50;
                        case 105 -> 179;
                        case 106 -> 104;
                        case 107 -> 6;
                        case 108 -> 90;
                        case 109 -> 2;
                        case 110 -> 225;
                        case 111 -> 69;
                        case 112 -> 229;
                        case 113 -> 118;
                        case 114 -> 24;
                        case 115 -> 160;
                        case 116 -> 74;
                        case 117 -> 93;
                        case 118 -> 254;
                        case 119 -> 62;
                        case 120 -> 235;
                        case 121 -> 205;
                        case 122 -> 35;
                        case 123 -> 54;
                        case 124 -> 139;
                        case 125 -> 214;
                        case 126 -> 168;
                        case 127 -> 111;
                        case 128 -> 112;
                        case 129 -> 101;
                        case 130 -> 71;
                        case 131 -> 110;
                        case 132 -> 56;
                        case 133 -> 13;
                        case 134 -> 233;
                        case 135 -> 166;
                        case 136 -> 117;
                        case 137 -> 253;
                        case 138 -> 63;
                        case 139 -> 85;
                        case 140 -> 116;
                        case 141 -> 190;
                        case 142 -> 135;
                        case 143 -> 164;
                        case 144 -> 191;
                        case 145 -> 70;
                        case 146 -> 211;
                        case 147 -> 194;
                        case 148 -> 151;
                        case 149 -> 247;
                        case 150 -> 27;
                        case 151 -> 119;
                        case 152 -> 223;
                        case 153 -> 1;
                        case 154 -> 251;
                        case 155 -> 108;
                        case 156 -> 57;
                        case 157 -> 38;
                        case 158 -> 134;
                        case 159 -> 140;
                        case 160 -> 95;
                        case 161 -> 145;
                        case 162 -> 51;
                        case 163 -> 115;
                        case 164 -> 141;
                        case 165 -> 42;
                        case 166 -> 196;
                        case 167 -> 185;
                        case 168 -> 15;
                        case 169 -> 169;
                        case 170 -> 105;
                        case 171 -> 28;
                        case 172 -> 83;
                        case 173 -> 65;
                        case 174 -> 188;
                        case 175 -> 207;
                        case 176 -> 29;
                        case 177 -> 184;
                        case 178 -> 91;
                        case 179 -> 244;
                        case 180 -> 12;
                        case 181 -> 248;
                        case 182 -> 94;
                        case 183 -> 226;
                        case 184 -> 149;
                        case 185 -> 212;
                        case 186 -> 40;
                        case 187 -> 11;
                        case 188 -> 177;
                        case 189 -> 216;
                        case 190 -> 76;
                        case 191 -> 33;
                        case 192 -> 46;
                        case 193 -> 195;
                        case 194 -> 193;
                        case 195 -> 154;
                        case 196 -> 220;
                        case 197 -> 130;
                        case 198 -> 144;
                        case 199 -> 103;
                        case 200 -> 250;
                        case 201 -> 255;
                        case 202 -> 106;
                        case 203 -> 5;
                        case 204 -> 143;
                        case 205 -> 137;
                        case 206 -> 175;
                        case 207 -> 20;
                        case 208 -> 23;
                        case 209 -> 14;
                        case 210 -> 252;
                        case 211 -> 124;
                        case 212 -> 100;
                        case 213 -> 55;
                        case 214 -> 219;
                        case 215 -> 162;
                        case 216 -> 192;
                        case 217 -> 146;
                        case 218 -> 67;
                        case 219 -> 39;
                        case 220 -> 153;
                        case 221 -> 210;
                        case 222 -> 201;
                        case 223 -> 75;
                        case 224 -> 167;
                        case 225 -> 237;
                        case 226 -> 68;
                        case 227 -> 125;
                        case 228 -> 99;
                        case 229 -> 120;
                        case 230 -> 59;
                        case 231 -> 80;
                        case 232 -> 53;
                        case 233 -> 78;
                        case 234 -> 73;
                        case 235 -> 199;
                        case 236 -> 9;
                        case 237 -> 232;
                        case 238 -> 109;
                        case 239 -> 77;
                        case 240 -> 58;
                        case 241 -> 147;
                        case 242 -> 127;
                        case 243 -> 231;
                        case 244 -> 21;
                        case 245 -> 48;
                        case 246 -> 37;
                        case 247 -> 163;
                        case 248 -> 31;
                        case 249 -> 19;
                        case 250 -> 221;
                        case 251 -> 26;
                        case 252 -> 198;
                        case 253 -> 202;
                        case 254 -> 173;
                        default -> 183;
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
         ),
         (Function1)(
            new Function1<Float, Float>(

) {
   public Float invoke(Float p0) { return null; } // PX-FIX abs2
      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -3928;
                  short var10005 = -11203;
                  var10005 = -3927;
                  short var10006 = -6557;
               }

               public final Float a() {
      Object receiver = null; // PX-FIX
                  return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver)
                     .p(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: { // PX-FIX
                  String[] var5x = new String[2];
                  int var3x = 0;
                  String var2 = "Ù\u0015?<Õ\u000búÈ½½¨î1ó\u0001Û\fpV\nTs\u0006.i'\u0089ûh";
                  int var4x = "Ù\u0015?<Õ\u000búÈ½½¨î1ó\u0001Û\fpV\nTs\u0006.i'\u0089ûh".length();
                  char var1x = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 57;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 57;
                           var10006 = var6;
                        } else {
                           var13 = 57;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 57;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 85;
                              case 1 -> 30;
                              case 2 -> 10;
                              case 3 -> 107;
                              case 4 -> 63;
                              case 5 -> 67;
                              default -> 107;
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
                  int var2 = (var0 ^ -3927) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4x = switch (var3[0] & 0xFF) {
                        case 0 -> 222;
                        case 1 -> 245;
                        case 2 -> 160;
                        case 3 -> 128;
                        case 4 -> 29;
                        case 5 -> 24;
                        case 6 -> 34;
                        case 7 -> 254;
                        case 8 -> 200;
                        case 9 -> 130;
                        case 10 -> 99;
                        case 11 -> 214;
                        case 12 -> 192;
                        case 13 -> 191;
                        case 14 -> 149;
                        case 15 -> 40;
                        case 16 -> 103;
                        case 17 -> 232;
                        case 18 -> 217;
                        case 19 -> 49;
                        case 20 -> 64;
                        case 21 -> 25;
                        case 22 -> 38;
                        case 23 -> 238;
                        case 24 -> 42;
                        case 25 -> 15;
                        case 26 -> 68;
                        case 27 -> 7;
                        case 28 -> 196;
                        case 29 -> 22;
                        case 30 -> 247;
                        case 31 -> 204;
                        case 32 -> 136;
                        case 33 -> 133;
                        case 34 -> 48;
                        case 35 -> 161;
                        case 36 -> 120;
                        case 37 -> 175;
                        case 38 -> 168;
                        case 39 -> 159;
                        case 40 -> 205;
                        case 41 -> 145;
                        case 42 -> 56;
                        case 43 -> 189;
                        case 44 -> 244;
                        case 45 -> 76;
                        case 46 -> 16;
                        case 47 -> 31;
                        case 48 -> 150;
                        case 49 -> 69;
                        case 50 -> 10;
                        case 51 -> 59;
                        case 52 -> 249;
                        case 53 -> 219;
                        case 54 -> 106;
                        case 55 -> 119;
                        case 56 -> 41;
                        case 57 -> 227;
                        case 58 -> 67;
                        case 59 -> 61;
                        case 60 -> 202;
                        case 61 -> 186;
                        case 62 -> 241;
                        case 63 -> 9;
                        case 64 -> 126;
                        case 65 -> 251;
                        case 66 -> 220;
                        case 67 -> 210;
                        case 68 -> 194;
                        case 69 -> 114;
                        case 70 -> 12;
                        case 71 -> 110;
                        case 72 -> 166;
                        case 73 -> 74;
                        case 74 -> 190;
                        case 75 -> 37;
                        case 76 -> 105;
                        case 77 -> 125;
                        case 78 -> 201;
                        case 79 -> 97;
                        case 80 -> 243;
                        case 81 -> 90;
                        case 82 -> 79;
                        case 83 -> 248;
                        case 84 -> 44;
                        case 85 -> 207;
                        case 86 -> 98;
                        case 87 -> 225;
                        case 88 -> 164;
                        case 89 -> 176;
                        case 90 -> 215;
                        case 91 -> 135;
                        case 92 -> 143;
                        case 93 -> 107;
                        case 94 -> 246;
                        case 95 -> 144;
                        case 96 -> 5;
                        case 97 -> 30;
                        case 98 -> 92;
                        case 99 -> 134;
                        case 100 -> 32;
                        case 101 -> 206;
                        case 102 -> 39;
                        case 103 -> 234;
                        case 104 -> 71;
                        case 105 -> 153;
                        case 106 -> 46;
                        case 107 -> 171;
                        case 108 -> 17;
                        case 109 -> 116;
                        case 110 -> 152;
                        case 111 -> 111;
                        case 112 -> 73;
                        case 113 -> 237;
                        case 114 -> 158;
                        case 115 -> 255;
                        case 116 -> 8;
                        case 117 -> 218;
                        case 118 -> 209;
                        case 119 -> 122;
                        case 120 -> 182;
                        case 121 -> 27;
                        case 122 -> 60;
                        case 123 -> 47;
                        case 124 -> 62;
                        case 125 -> 101;
                        case 126 -> 250;
                        case 127 -> 88;
                        case 128 -> 53;
                        case 129 -> 221;
                        case 130 -> 142;
                        case 131 -> 253;
                        case 132 -> 109;
                        case 133 -> 72;
                        case 134 -> 123;
                        case 135 -> 156;
                        case 136 -> 131;
                        case 137 -> 95;
                        case 138 -> 18;
                        case 139 -> 83;
                        case 140 -> 4;
                        case 141 -> 240;
                        case 142 -> 1;
                        case 143 -> 104;
                        case 144 -> 224;
                        case 145 -> 113;
                        case 146 -> 66;
                        case 147 -> 124;
                        case 148 -> 230;
                        case 149 -> 102;
                        case 150 -> 179;
                        case 151 -> 212;
                        case 152 -> 117;
                        case 153 -> 80;
                        case 154 -> 226;
                        case 155 -> 86;
                        case 156 -> 216;
                        case 157 -> 84;
                        case 158 -> 93;
                        case 159 -> 236;
                        case 160 -> 235;
                        case 161 -> 19;
                        case 162 -> 172;
                        case 163 -> 181;
                        case 164 -> 77;
                        case 165 -> 81;
                        case 166 -> 170;
                        case 167 -> 33;
                        case 168 -> 2;
                        case 169 -> 151;
                        case 170 -> 199;
                        case 171 -> 197;
                        case 172 -> 55;
                        case 173 -> 65;
                        case 174 -> 21;
                        case 175 -> 169;
                        case 176 -> 167;
                        case 177 -> 54;
                        case 178 -> 242;
                        case 179 -> 140;
                        case 180 -> 185;
                        case 181 -> 147;
                        case 182 -> 129;
                        case 183 -> 23;
                        case 184 -> 75;
                        case 185 -> 228;
                        case 186 -> 50;
                        case 187 -> 58;
                        case 188 -> 3;
                        case 189 -> 208;
                        case 190 -> 82;
                        case 191 -> 45;
                        case 192 -> 184;
                        case 193 -> 63;
                        case 194 -> 203;
                        case 195 -> 157;
                        case 196 -> 138;
                        case 197 -> 87;
                        case 198 -> 70;
                        case 199 -> 20;
                        case 200 -> 252;
                        case 201 -> 213;
                        case 202 -> 187;
                        case 203 -> 174;
                        case 204 -> 13;
                        case 205 -> 137;
                        case 206 -> 183;
                        case 207 -> 162;
                        case 208 -> 173;
                        case 209 -> 91;
                        case 210 -> 35;
                        case 211 -> 26;
                        case 212 -> 96;
                        case 213 -> 139;
                        case 214 -> 231;
                        case 215 -> 43;
                        case 216 -> 178;
                        case 217 -> 211;
                        case 218 -> 180;
                        case 219 -> 195;
                        case 220 -> 57;
                        case 221 -> 233;
                        case 222 -> 239;
                        case 223 -> 146;
                        case 224 -> 141;
                        case 225 -> 78;
                        case 226 -> 229;
                        case 227 -> 36;
                        case 228 -> 198;
                        case 229 -> 52;
                        case 230 -> 118;
                        case 231 -> 188;
                        case 232 -> 28;
                        case 233 -> 94;
                        case 234 -> 89;
                        case 235 -> 51;
                        case 236 -> 108;
                        case 237 -> 14;
                        case 238 -> 223;
                        case 239 -> 115;
                        case 240 -> 85;
                        case 241 -> 0;
                        case 242 -> 155;
                        case 243 -> 112;
                        case 244 -> 193;
                        case 245 -> 132;
                        case 246 -> 121;
                        case 247 -> 148;
                        case 248 -> 127;
                        case 249 -> 163;
                        case 250 -> 154;
                        case 251 -> 11;
                        case 252 -> 6;
                        case 253 -> 100;
                        case 254 -> 177;
                        default -> 165;
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
         ),
         350L,
         300L,
         250L,
         false,
         1024,
         null
      );
   }

   @Override
   public void s() {
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      float var1 = this.j() + this.l() / 2.0F;
      float var2 = this.k() + this.d() / 2.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var1, var2);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.u(), this.u());
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(-var1, -var2);
      float var3 = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ar();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.t().a()
      );
      float var5 = 1.0F - this.m();
      float var6 = RangesKt.coerceIn(var5, 0.0F, 1.0F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var6);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.j(), this.k(), this.l(), this.d(), 10.0F, 1.0F, var3);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.j(),
         this.k(),
         this.l(),
         this.d(),
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.92F),
         var3
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.j(),
         this.k(),
         this.l(),
         this.d(),
         1.0F,
         var4.a(
               me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y(),
               0.5F
            )
            .a(0.5F),
         var3
      );
      float var7 = this.j() + 14.0F;
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         this.b(),
         var7,
         this.k() + 14.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.c(),
         var7,
         this.k() + 36.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         false, 16, null);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(1.0F);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "4\u0011\u0083ÕÅ\u0005®Ù:r^\u0004®õþ$";
      int var4 = "4\u0011\u0083ÕÅ\u0005®Ù:r^\u0004®õþ$".length();
      char var1 = 5;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 19;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 19;
               var10006 = var6;
            } else {
               var13 = 19;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 19;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 42;
                  case 1 -> 16;
                  case 2 -> 85;
                  case 3 -> 18;
                  case 4 -> 93;
                  case 5 -> 23;
                  default -> 91;
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
            e = var5;
            f = new String[3];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ -2290) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 143;
            case 1 -> 250;
            case 2 -> 48;
            case 3 -> 93;
            case 4 -> 253;
            case 5 -> 58;
            case 6 -> 217;
            case 7 -> 173;
            case 8 -> 2;
            case 9 -> 175;
            case 10 -> 137;
            case 11 -> 119;
            case 12 -> 62;
            case 13 -> 37;
            case 14 -> 195;
            case 15 -> 248;
            case 16 -> 34;
            case 17 -> 228;
            case 18 -> 215;
            case 19 -> 225;
            case 20 -> 25;
            case 21 -> 141;
            case 22 -> 223;
            case 23 -> 131;
            case 24 -> 16;
            case 25 -> 84;
            case 26 -> 130;
            case 27 -> 98;
            case 28 -> 138;
            case 29 -> 151;
            case 30 -> 59;
            case 31 -> 142;
            case 32 -> 232;
            case 33 -> 198;
            case 34 -> 111;
            case 35 -> 41;
            case 36 -> 239;
            case 37 -> 69;
            case 38 -> 234;
            case 39 -> 212;
            case 40 -> 102;
            case 41 -> 150;
            case 42 -> 65;
            case 43 -> 201;
            case 44 -> 200;
            case 45 -> 27;
            case 46 -> 184;
            case 47 -> 162;
            case 48 -> 107;
            case 49 -> 109;
            case 50 -> 214;
            case 51 -> 72;
            case 52 -> 63;
            case 53 -> 60;
            case 54 -> 80;
            case 55 -> 122;
            case 56 -> 233;
            case 57 -> 231;
            case 58 -> 166;
            case 59 -> 56;
            case 60 -> 245;
            case 61 -> 87;
            case 62 -> 123;
            case 63 -> 13;
            case 64 -> 81;
            case 65 -> 146;
            case 66 -> 236;
            case 67 -> 222;
            case 68 -> 135;
            case 69 -> 246;
            case 70 -> 159;
            case 71 -> 193;
            case 72 -> 170;
            case 73 -> 94;
            case 74 -> 182;
            case 75 -> 97;
            case 76 -> 35;
            case 77 -> 71;
            case 78 -> 3;
            case 79 -> 0;
            case 80 -> 167;
            case 81 -> 12;
            case 82 -> 152;
            case 83 -> 24;
            case 84 -> 55;
            case 85 -> 210;
            case 86 -> 52;
            case 87 -> 226;
            case 88 -> 121;
            case 89 -> 50;
            case 90 -> 14;
            case 91 -> 251;
            case 92 -> 178;
            case 93 -> 235;
            case 94 -> 169;
            case 95 -> 95;
            case 96 -> 47;
            case 97 -> 115;
            case 98 -> 5;
            case 99 -> 108;
            case 100 -> 26;
            case 101 -> 39;
            case 102 -> 177;
            case 103 -> 187;
            case 104 -> 230;
            case 105 -> 9;
            case 106 -> 10;
            case 107 -> 91;
            case 108 -> 188;
            case 109 -> 205;
            case 110 -> 33;
            case 111 -> 75;
            case 112 -> 238;
            case 113 -> 139;
            case 114 -> 203;
            case 115 -> 116;
            case 116 -> 64;
            case 117 -> 124;
            case 118 -> 224;
            case 119 -> 243;
            case 120 -> 54;
            case 121 -> 118;
            case 122 -> 186;
            case 123 -> 183;
            case 124 -> 7;
            case 125 -> 70;
            case 126 -> 45;
            case 127 -> 202;
            case 128 -> 66;
            case 129 -> 126;
            case 130 -> 90;
            case 131 -> 208;
            case 132 -> 112;
            case 133 -> 144;
            case 134 -> 155;
            case 135 -> 6;
            case 136 -> 132;
            case 137 -> 113;
            case 138 -> 179;
            case 139 -> 221;
            case 140 -> 74;
            case 141 -> 11;
            case 142 -> 189;
            case 143 -> 218;
            case 144 -> 163;
            case 145 -> 219;
            case 146 -> 247;
            case 147 -> 73;
            case 148 -> 36;
            case 149 -> 105;
            case 150 -> 213;
            case 151 -> 145;
            case 152 -> 129;
            case 153 -> 61;
            case 154 -> 148;
            case 155 -> 133;
            case 156 -> 154;
            case 157 -> 8;
            case 158 -> 88;
            case 159 -> 192;
            case 160 -> 30;
            case 161 -> 161;
            case 162 -> 153;
            case 163 -> 160;
            case 164 -> 136;
            case 165 -> 120;
            case 166 -> 106;
            case 167 -> 125;
            case 168 -> 15;
            case 169 -> 77;
            case 170 -> 191;
            case 171 -> 128;
            case 172 -> 254;
            case 173 -> 216;
            case 174 -> 117;
            case 175 -> 23;
            case 176 -> 204;
            case 177 -> 181;
            case 178 -> 241;
            case 179 -> 17;
            case 180 -> 85;
            case 181 -> 114;
            case 182 -> 89;
            case 183 -> 68;
            case 184 -> 21;
            case 185 -> 249;
            case 186 -> 229;
            case 187 -> 96;
            case 188 -> 49;
            case 189 -> 127;
            case 190 -> 158;
            case 191 -> 42;
            case 192 -> 4;
            case 193 -> 67;
            case 194 -> 242;
            case 195 -> 165;
            case 196 -> 164;
            case 197 -> 255;
            case 198 -> 32;
            case 199 -> 194;
            case 200 -> 211;
            case 201 -> 185;
            case 202 -> 176;
            case 203 -> 140;
            case 204 -> 172;
            case 205 -> 157;
            case 206 -> 83;
            case 207 -> 51;
            case 208 -> 99;
            case 209 -> 18;
            case 210 -> 103;
            case 211 -> 237;
            case 212 -> 38;
            case 213 -> 207;
            case 214 -> 180;
            case 215 -> 227;
            case 216 -> 53;
            case 217 -> 240;
            case 218 -> 40;
            case 219 -> 199;
            case 220 -> 92;
            case 221 -> 100;
            case 222 -> 244;
            case 223 -> 197;
            case 224 -> 209;
            case 225 -> 76;
            case 226 -> 196;
            case 227 -> 110;
            case 228 -> 46;
            case 229 -> 1;
            case 230 -> 101;
            case 231 -> 174;
            case 232 -> 20;
            case 233 -> 44;
            case 234 -> 29;
            case 235 -> 134;
            case 236 -> 147;
            case 237 -> 104;
            case 238 -> 156;
            case 239 -> 252;
            case 240 -> 31;
            case 241 -> 78;
            case 242 -> 19;
            case 243 -> 43;
            case 244 -> 168;
            case 245 -> 22;
            case 246 -> 79;
            case 247 -> 220;
            case 248 -> 206;
            case 249 -> 171;
            case 250 -> 190;
            case 251 -> 149;
            case 252 -> 28;
            case 253 -> 82;
            case 254 -> 57;
            default -> 86;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }
}
