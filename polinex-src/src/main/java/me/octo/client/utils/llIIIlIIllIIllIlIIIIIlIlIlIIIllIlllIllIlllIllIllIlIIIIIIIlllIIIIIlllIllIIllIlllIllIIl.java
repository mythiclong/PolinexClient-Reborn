package me.octo.client.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;

public final class llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl
   extends lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll {
   public Object invoke(Float p0) { return null; } // PX-FIX abs




   public Object receiver; // PX-FIX kotlin lambda receiver

   private static String lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static String[] e;
   private static String[] f;

   public llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl(
      long var1,
      @NotNull String var3,
      @NotNull String var4,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5
   ) {
      Object receiver = null; // PX-FIX
      short var10001 = 2726;
      short var10002 = -24629;
      Intrinsics.checkNotNullParameter(var3, "title");
      var10001 = 2724;
      var10002 = 10999;
      Intrinsics.checkNotNullParameter(var4, "body");
      var10001 = 2720;
      var10002 = 27696;
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
                  short var10004 = 21380;
                  short var10005 = -21381;
                  var10005 = 21381;
                  short var10006 = 30107;
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
                  String var2 = "7±ðßfþ»ù¥\u0089Ü\"\u0010Sþ|6÷Ã\u0089^ã}\u0014¼/\u008eMD";
                  int var4 = "7±ðßfþ»ù¥\u0089Ü\"\u0010Sþ|6÷Ã\u0089^ã}\u0014¼/\u008eMD".length();
                  char var1 = '\f';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 44;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 44;
                           var10006 = var6;
                        } else {
                           var13 = 44;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 44;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 10;
                              case 1 -> 89;
                              case 2 -> 68;
                              case 3 -> 67;
                              case 4 -> 11;
                              case 5 -> 120;
                              default -> 109;
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
                  int var2 = (var0 ^ 21380) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 111;
                        case 1 -> 154;
                        case 2 -> 73;
                        case 3 -> 101;
                        case 4 -> 254;
                        case 5 -> 237;
                        case 6 -> 15;
                        case 7 -> 94;
                        case 8 -> 133;
                        case 9 -> 182;
                        case 10 -> 5;
                        case 11 -> 87;
                        case 12 -> 90;
                        case 13 -> 63;
                        case 14 -> 29;
                        case 15 -> 68;
                        case 16 -> 250;
                        case 17 -> 7;
                        case 18 -> 30;
                        case 19 -> 95;
                        case 20 -> 176;
                        case 21 -> 197;
                        case 22 -> 144;
                        case 23 -> 151;
                        case 24 -> 246;
                        case 25 -> 164;
                        case 26 -> 4;
                        case 27 -> 238;
                        case 28 -> 10;
                        case 29 -> 172;
                        case 30 -> 9;
                        case 31 -> 3;
                        case 32 -> 193;
                        case 33 -> 185;
                        case 34 -> 124;
                        case 35 -> 147;
                        case 36 -> 248;
                        case 37 -> 52;
                        case 38 -> 21;
                        case 39 -> 153;
                        case 40 -> 183;
                        case 41 -> 230;
                        case 42 -> 120;
                        case 43 -> 35;
                        case 44 -> 44;
                        case 45 -> 247;
                        case 46 -> 216;
                        case 47 -> 219;
                        case 48 -> 121;
                        case 49 -> 49;
                        case 50 -> 11;
                        case 51 -> 209;
                        case 52 -> 232;
                        case 53 -> 214;
                        case 54 -> 60;
                        case 55 -> 16;
                        case 56 -> 27;
                        case 57 -> 231;
                        case 58 -> 165;
                        case 59 -> 51;
                        case 60 -> 89;
                        case 61 -> 109;
                        case 62 -> 78;
                        case 63 -> 116;
                        case 64 -> 207;
                        case 65 -> 37;
                        case 66 -> 79;
                        case 67 -> 204;
                        case 68 -> 38;
                        case 69 -> 203;
                        case 70 -> 149;
                        case 71 -> 218;
                        case 72 -> 22;
                        case 73 -> 162;
                        case 74 -> 107;
                        case 75 -> 14;
                        case 76 -> 17;
                        case 77 -> 103;
                        case 78 -> 67;
                        case 79 -> 211;
                        case 80 -> 118;
                        case 81 -> 141;
                        case 82 -> 228;
                        case 83 -> 131;
                        case 84 -> 235;
                        case 85 -> 23;
                        case 86 -> 157;
                        case 87 -> 2;
                        case 88 -> 13;
                        case 89 -> 222;
                        case 90 -> 62;
                        case 91 -> 146;
                        case 92 -> 122;
                        case 93 -> 169;
                        case 94 -> 114;
                        case 95 -> 187;
                        case 96 -> 102;
                        case 97 -> 244;
                        case 98 -> 19;
                        case 99 -> 75;
                        case 100 -> 33;
                        case 101 -> 215;
                        case 102 -> 202;
                        case 103 -> 239;
                        case 104 -> 160;
                        case 105 -> 167;
                        case 106 -> 136;
                        case 107 -> 47;
                        case 108 -> 88;
                        case 109 -> 190;
                        case 110 -> 50;
                        case 111 -> 226;
                        case 112 -> 135;
                        case 113 -> 92;
                        case 114 -> 112;
                        case 115 -> 252;
                        case 116 -> 234;
                        case 117 -> 139;
                        case 118 -> 198;
                        case 119 -> 242;
                        case 120 -> 69;
                        case 121 -> 54;
                        case 122 -> 96;
                        case 123 -> 12;
                        case 124 -> 31;
                        case 125 -> 132;
                        case 126 -> 205;
                        case 127 -> 59;
                        case 128 -> 221;
                        case 129 -> 217;
                        case 130 -> 80;
                        case 131 -> 200;
                        case 132 -> 138;
                        case 133 -> 58;
                        case 134 -> 119;
                        case 135 -> 255;
                        case 136 -> 163;
                        case 137 -> 72;
                        case 138 -> 184;
                        case 139 -> 134;
                        case 140 -> 206;
                        case 141 -> 18;
                        case 142 -> 56;
                        case 143 -> 194;
                        case 144 -> 93;
                        case 145 -> 210;
                        case 146 -> 158;
                        case 147 -> 155;
                        case 148 -> 186;
                        case 149 -> 115;
                        case 150 -> 199;
                        case 151 -> 20;
                        case 152 -> 48;
                        case 153 -> 201;
                        case 154 -> 85;
                        case 155 -> 241;
                        case 156 -> 0;
                        case 157 -> 142;
                        case 158 -> 229;
                        case 159 -> 236;
                        case 160 -> 25;
                        case 161 -> 145;
                        case 162 -> 191;
                        case 163 -> 32;
                        case 164 -> 249;
                        case 165 -> 24;
                        case 166 -> 128;
                        case 167 -> 74;
                        case 168 -> 180;
                        case 169 -> 81;
                        case 170 -> 227;
                        case 171 -> 223;
                        case 172 -> 34;
                        case 173 -> 174;
                        case 174 -> 104;
                        case 175 -> 66;
                        case 176 -> 233;
                        case 177 -> 99;
                        case 178 -> 39;
                        case 179 -> 57;
                        case 180 -> 188;
                        case 181 -> 6;
                        case 182 -> 70;
                        case 183 -> 110;
                        case 184 -> 126;
                        case 185 -> 196;
                        case 186 -> 251;
                        case 187 -> 61;
                        case 188 -> 189;
                        case 189 -> 123;
                        case 190 -> 8;
                        case 191 -> 178;
                        case 192 -> 152;
                        case 193 -> 106;
                        case 194 -> 53;
                        case 195 -> 43;
                        case 196 -> 177;
                        case 197 -> 140;
                        case 198 -> 168;
                        case 199 -> 86;
                        case 200 -> 26;
                        case 201 -> 71;
                        case 202 -> 36;
                        case 203 -> 156;
                        case 204 -> 65;
                        case 205 -> 82;
                        case 206 -> 220;
                        case 207 -> 1;
                        case 208 -> 91;
                        case 209 -> 105;
                        case 210 -> 28;
                        case 211 -> 129;
                        case 212 -> 175;
                        case 213 -> 143;
                        case 214 -> 117;
                        case 215 -> 42;
                        case 216 -> 195;
                        case 217 -> 98;
                        case 218 -> 161;
                        case 219 -> 243;
                        case 220 -> 137;
                        case 221 -> 76;
                        case 222 -> 97;
                        case 223 -> 212;
                        case 224 -> 55;
                        case 225 -> 41;
                        case 226 -> 113;
                        case 227 -> 100;
                        case 228 -> 64;
                        case 229 -> 170;
                        case 230 -> 46;
                        case 231 -> 208;
                        case 232 -> 192;
                        case 233 -> 159;
                        case 234 -> 150;
                        case 235 -> 179;
                        case 236 -> 225;
                        case 237 -> 148;
                        case 238 -> 45;
                        case 239 -> 253;
                        case 240 -> 77;
                        case 241 -> 83;
                        case 242 -> 173;
                        case 243 -> 171;
                        case 244 -> 125;
                        case 245 -> 130;
                        case 246 -> 127;
                        case 247 -> 108;
                        case 248 -> 240;
                        case 249 -> 84;
                        case 250 -> 245;
                        case 251 -> 213;
                        case 252 -> 181;
                        case 253 -> 40;
                        case 254 -> 224;
                        default -> 166;
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
                  short var10004 = -20379;
                  short var10005 = 5612;
                  var10005 = -20380;
                  short var10006 = -15046;
               }

               public final Float a() {
                  return me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: { // PX-FIX
                  String[] var5 = new String[2];
                  int var3 = 0;
                  String var2 = "¹ïé^îÄ\"\u0010Y/\u0012)\u0010\u0019íý\u001elÌr\u0011S\u000fS-µÁ¢b";
                  int var4 = "¹ïé^îÄ\"\u0010Y/\u0012)\u0010\u0019íý\u001elÌr\u0011S\u000fS-µÁ¢b".length();
                  char var1 = '\f';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 68;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 68;
                           var10006 = var6;
                        } else {
                           var13 = 68;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 68;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 23;
                              case 1 -> 114;
                              case 2 -> 74;
                              case 3 -> 9;
                              case 4 -> 4;
                              case 5 -> 94;
                              default -> 97;
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
                  int var2 = (var0 ^ -20379) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 208;
                        case 1 -> 43;
                        case 2 -> 191;
                        case 3 -> 99;
                        case 4 -> 175;
                        case 5 -> 16;
                        case 6 -> 240;
                        case 7 -> 48;
                        case 8 -> 91;
                        case 9 -> 110;
                        case 10 -> 63;
                        case 11 -> 59;
                        case 12 -> 126;
                        case 13 -> 198;
                        case 14 -> 76;
                        case 15 -> 15;
                        case 16 -> 119;
                        case 17 -> 116;
                        case 18 -> 206;
                        case 19 -> 209;
                        case 20 -> 60;
                        case 21 -> 127;
                        case 22 -> 120;
                        case 23 -> 7;
                        case 24 -> 233;
                        case 25 -> 100;
                        case 26 -> 18;
                        case 27 -> 197;
                        case 28 -> 121;
                        case 29 -> 178;
                        case 30 -> 203;
                        case 31 -> 156;
                        case 32 -> 245;
                        case 33 -> 101;
                        case 34 -> 235;
                        case 35 -> 223;
                        case 36 -> 188;
                        case 37 -> 204;
                        case 38 -> 69;
                        case 39 -> 50;
                        case 40 -> 57;
                        case 41 -> 106;
                        case 42 -> 10;
                        case 43 -> 169;
                        case 44 -> 176;
                        case 45 -> 213;
                        case 46 -> 248;
                        case 47 -> 230;
                        case 48 -> 12;
                        case 49 -> 64;
                        case 50 -> 148;
                        case 51 -> 143;
                        case 52 -> 152;
                        case 53 -> 163;
                        case 54 -> 108;
                        case 55 -> 153;
                        case 56 -> 229;
                        case 57 -> 53;
                        case 58 -> 4;
                        case 59 -> 79;
                        case 60 -> 46;
                        case 61 -> 154;
                        case 62 -> 128;
                        case 63 -> 81;
                        case 64 -> 58;
                        case 65 -> 123;
                        case 66 -> 184;
                        case 67 -> 13;
                        case 68 -> 80;
                        case 69 -> 144;
                        case 70 -> 17;
                        case 71 -> 30;
                        case 72 -> 94;
                        case 73 -> 104;
                        case 74 -> 11;
                        case 75 -> 202;
                        case 76 -> 114;
                        case 77 -> 54;
                        case 78 -> 254;
                        case 79 -> 51;
                        case 80 -> 243;
                        case 81 -> 109;
                        case 82 -> 129;
                        case 83 -> 228;
                        case 84 -> 195;
                        case 85 -> 138;
                        case 86 -> 47;
                        case 87 -> 19;
                        case 88 -> 239;
                        case 89 -> 216;
                        case 90 -> 218;
                        case 91 -> 26;
                        case 92 -> 247;
                        case 93 -> 34;
                        case 94 -> 159;
                        case 95 -> 201;
                        case 96 -> 73;
                        case 97 -> 75;
                        case 98 -> 253;
                        case 99 -> 241;
                        case 100 -> 90;
                        case 101 -> 177;
                        case 102 -> 224;
                        case 103 -> 1;
                        case 104 -> 37;
                        case 105 -> 196;
                        case 106 -> 237;
                        case 107 -> 168;
                        case 108 -> 44;
                        case 109 -> 131;
                        case 110 -> 166;
                        case 111 -> 6;
                        case 112 -> 132;
                        case 113 -> 68;
                        case 114 -> 227;
                        case 115 -> 95;
                        case 116 -> 2;
                        case 117 -> 3;
                        case 118 -> 238;
                        case 119 -> 135;
                        case 120 -> 20;
                        case 121 -> 107;
                        case 122 -> 211;
                        case 123 -> 185;
                        case 124 -> 225;
                        case 125 -> 52;
                        case 126 -> 183;
                        case 127 -> 86;
                        case 128 -> 222;
                        case 129 -> 8;
                        case 130 -> 181;
                        case 131 -> 150;
                        case 132 -> 35;
                        case 133 -> 246;
                        case 134 -> 83;
                        case 135 -> 200;
                        case 136 -> 113;
                        case 137 -> 24;
                        case 138 -> 155;
                        case 139 -> 92;
                        case 140 -> 199;
                        case 141 -> 130;
                        case 142 -> 45;
                        case 143 -> 142;
                        case 144 -> 56;
                        case 145 -> 172;
                        case 146 -> 65;
                        case 147 -> 89;
                        case 148 -> 180;
                        case 149 -> 242;
                        case 150 -> 232;
                        case 151 -> 61;
                        case 152 -> 212;
                        case 153 -> 49;
                        case 154 -> 205;
                        case 155 -> 187;
                        case 156 -> 5;
                        case 157 -> 244;
                        case 158 -> 136;
                        case 159 -> 162;
                        case 160 -> 112;
                        case 161 -> 124;
                        case 162 -> 102;
                        case 163 -> 87;
                        case 164 -> 255;
                        case 165 -> 42;
                        case 166 -> 96;
                        case 167 -> 219;
                        case 168 -> 21;
                        case 169 -> 214;
                        case 170 -> 84;
                        case 171 -> 41;
                        case 172 -> 33;
                        case 173 -> 137;
                        case 174 -> 105;
                        case 175 -> 146;
                        case 176 -> 210;
                        case 177 -> 149;
                        case 178 -> 85;
                        case 179 -> 220;
                        case 180 -> 55;
                        case 181 -> 14;
                        case 182 -> 98;
                        case 183 -> 145;
                        case 184 -> 250;
                        case 185 -> 134;
                        case 186 -> 88;
                        case 187 -> 221;
                        case 188 -> 167;
                        case 189 -> 182;
                        case 190 -> 28;
                        case 191 -> 226;
                        case 192 -> 179;
                        case 193 -> 71;
                        case 194 -> 158;
                        case 195 -> 22;
                        case 196 -> 171;
                        case 197 -> 82;
                        case 198 -> 140;
                        case 199 -> 23;
                        case 200 -> 231;
                        case 201 -> 115;
                        case 202 -> 118;
                        case 203 -> 141;
                        case 204 -> 186;
                        case 205 -> 251;
                        case 206 -> 164;
                        case 207 -> 217;
                        case 208 -> 139;
                        case 209 -> 189;
                        case 210 -> 74;
                        case 211 -> 161;
                        case 212 -> 122;
                        case 213 -> 174;
                        case 214 -> 32;
                        case 215 -> 78;
                        case 216 -> 0;
                        case 217 -> 147;
                        case 218 -> 194;
                        case 219 -> 133;
                        case 220 -> 193;
                        case 221 -> 36;
                        case 222 -> 40;
                        case 223 -> 62;
                        case 224 -> 249;
                        case 225 -> 165;
                        case 226 -> 38;
                        case 227 -> 31;
                        case 228 -> 151;
                        case 229 -> 160;
                        case 230 -> 207;
                        case 231 -> 67;
                        case 232 -> 170;
                        case 233 -> 236;
                        case 234 -> 93;
                        case 235 -> 252;
                        case 236 -> 9;
                        case 237 -> 192;
                        case 238 -> 72;
                        case 239 -> 77;
                        case 240 -> 66;
                        case 241 -> 39;
                        case 242 -> 111;
                        case 243 -> 25;
                        case 244 -> 215;
                        case 245 -> 29;
                        case 246 -> 157;
                        case 247 -> 173;
                        case 248 -> 125;
                        case 249 -> 70;
                        case 250 -> 97;
                        case 251 -> 117;
                        case 252 -> 27;
                        case 253 -> 190;
                        case 254 -> 234;
                        default -> 103;
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
                  short var10004 = -20576;
                  short var10005 = 10835;
                  var10005 = -20575;
                  short var10006 = 9596;
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
                  String var2 = "Að«é¤éÇÉ\u008a\u001a'ù\u0010½\u008e4&W\u0010¹öEýÞ\u0005§\u009d\u008e\u0086";
                  int var4x = "Að«é¤éÇÉ\u008a\u001a'ù\u0010½\u008e4&W\u0010¹öEýÞ\u0005§\u009d\u008e\u0086".length();
                  char var1x = '\f';
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 70;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 70;
                           var10006 = var6;
                        } else {
                           var13 = 70;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 70;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 116;
                              case 1 -> 58;
                              case 2 -> 57;
                              case 3 -> 22;
                              case 4 -> 42;
                              case 5 -> 36;
                              default -> 74;
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
                  int var2 = (var0 ^ -20576) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4x = switch (var3[0] & 0xFF) {
                        case 0 -> 162;
                        case 1 -> 102;
                        case 2 -> 137;
                        case 3 -> 93;
                        case 4 -> 84;
                        case 5 -> 126;
                        case 6 -> 74;
                        case 7 -> 174;
                        case 8 -> 194;
                        case 9 -> 9;
                        case 10 -> 22;
                        case 11 -> 85;
                        case 12 -> 67;
                        case 13 -> 134;
                        case 14 -> 120;
                        case 15 -> 204;
                        case 16 -> 215;
                        case 17 -> 66;
                        case 18 -> 235;
                        case 19 -> 118;
                        case 20 -> 214;
                        case 21 -> 136;
                        case 22 -> 7;
                        case 23 -> 44;
                        case 24 -> 221;
                        case 25 -> 236;
                        case 26 -> 3;
                        case 27 -> 53;
                        case 28 -> 220;
                        case 29 -> 167;
                        case 30 -> 97;
                        case 31 -> 209;
                        case 32 -> 180;
                        case 33 -> 98;
                        case 34 -> 111;
                        case 35 -> 4;
                        case 36 -> 154;
                        case 37 -> 45;
                        case 38 -> 106;
                        case 39 -> 100;
                        case 40 -> 58;
                        case 41 -> 21;
                        case 42 -> 42;
                        case 43 -> 59;
                        case 44 -> 232;
                        case 45 -> 195;
                        case 46 -> 211;
                        case 47 -> 239;
                        case 48 -> 2;
                        case 49 -> 228;
                        case 50 -> 37;
                        case 51 -> 199;
                        case 52 -> 144;
                        case 53 -> 107;
                        case 54 -> 31;
                        case 55 -> 253;
                        case 56 -> 208;
                        case 57 -> 200;
                        case 58 -> 91;
                        case 59 -> 139;
                        case 60 -> 247;
                        case 61 -> 149;
                        case 62 -> 238;
                        case 63 -> 95;
                        case 64 -> 32;
                        case 65 -> 12;
                        case 66 -> 78;
                        case 67 -> 248;
                        case 68 -> 38;
                        case 69 -> 79;
                        case 70 -> 227;
                        case 71 -> 16;
                        case 72 -> 64;
                        case 73 -> 213;
                        case 74 -> 60;
                        case 75 -> 39;
                        case 76 -> 14;
                        case 77 -> 113;
                        case 78 -> 172;
                        case 79 -> 246;
                        case 80 -> 151;
                        case 81 -> 13;
                        case 82 -> 62;
                        case 83 -> 216;
                        case 84 -> 75;
                        case 85 -> 81;
                        case 86 -> 250;
                        case 87 -> 105;
                        case 88 -> 217;
                        case 89 -> 109;
                        case 90 -> 114;
                        case 91 -> 176;
                        case 92 -> 52;
                        case 93 -> 224;
                        case 94 -> 255;
                        case 95 -> 26;
                        case 96 -> 243;
                        case 97 -> 73;
                        case 98 -> 83;
                        case 99 -> 148;
                        case 100 -> 142;
                        case 101 -> 179;
                        case 102 -> 171;
                        case 103 -> 129;
                        case 104 -> 11;
                        case 105 -> 202;
                        case 106 -> 121;
                        case 107 -> 5;
                        case 108 -> 15;
                        case 109 -> 207;
                        case 110 -> 159;
                        case 111 -> 197;
                        case 112 -> 34;
                        case 113 -> 237;
                        case 114 -> 184;
                        case 115 -> 61;
                        case 116 -> 41;
                        case 117 -> 96;
                        case 118 -> 191;
                        case 119 -> 104;
                        case 120 -> 240;
                        case 121 -> 152;
                        case 122 -> 110;
                        case 123 -> 166;
                        case 124 -> 10;
                        case 125 -> 20;
                        case 126 -> 141;
                        case 127 -> 92;
                        case 128 -> 251;
                        case 129 -> 30;
                        case 130 -> 229;
                        case 131 -> 117;
                        case 132 -> 122;
                        case 133 -> 86;
                        case 134 -> 160;
                        case 135 -> 168;
                        case 136 -> 112;
                        case 137 -> 206;
                        case 138 -> 6;
                        case 139 -> 56;
                        case 140 -> 40;
                        case 141 -> 94;
                        case 142 -> 203;
                        case 143 -> 146;
                        case 144 -> 19;
                        case 145 -> 123;
                        case 146 -> 153;
                        case 147 -> 150;
                        case 148 -> 77;
                        case 149 -> 210;
                        case 150 -> 182;
                        case 151 -> 155;
                        case 152 -> 244;
                        case 153 -> 185;
                        case 154 -> 234;
                        case 155 -> 187;
                        case 156 -> 230;
                        case 157 -> 196;
                        case 158 -> 90;
                        case 159 -> 50;
                        case 160 -> 17;
                        case 161 -> 161;
                        case 162 -> 33;
                        case 163 -> 183;
                        case 164 -> 43;
                        case 165 -> 205;
                        case 166 -> 63;
                        case 167 -> 212;
                        case 168 -> 51;
                        case 169 -> 138;
                        case 170 -> 241;
                        case 171 -> 157;
                        case 172 -> 158;
                        case 173 -> 88;
                        case 174 -> 219;
                        case 175 -> 115;
                        case 176 -> 133;
                        case 177 -> 223;
                        case 178 -> 226;
                        case 179 -> 82;
                        case 180 -> 101;
                        case 181 -> 119;
                        case 182 -> 18;
                        case 183 -> 132;
                        case 184 -> 69;
                        case 185 -> 99;
                        case 186 -> 24;
                        case 187 -> 193;
                        case 188 -> 147;
                        case 189 -> 80;
                        case 190 -> 103;
                        case 191 -> 231;
                        case 192 -> 128;
                        case 193 -> 0;
                        case 194 -> 140;
                        case 195 -> 116;
                        case 196 -> 173;
                        case 197 -> 108;
                        case 198 -> 47;
                        case 199 -> 71;
                        case 200 -> 57;
                        case 201 -> 165;
                        case 202 -> 1;
                        case 203 -> 124;
                        case 204 -> 76;
                        case 205 -> 29;
                        case 206 -> 192;
                        case 207 -> 54;
                        case 208 -> 127;
                        case 209 -> 135;
                        case 210 -> 89;
                        case 211 -> 218;
                        case 212 -> 164;
                        case 213 -> 190;
                        case 214 -> 130;
                        case 215 -> 169;
                        case 216 -> 145;
                        case 217 -> 36;
                        case 218 -> 65;
                        case 219 -> 163;
                        case 220 -> 170;
                        case 221 -> 28;
                        case 222 -> 35;
                        case 223 -> 49;
                        case 224 -> 188;
                        case 225 -> 186;
                        case 226 -> 252;
                        case 227 -> 178;
                        case 228 -> 125;
                        case 229 -> 233;
                        case 230 -> 55;
                        case 231 -> 177;
                        case 232 -> 46;
                        case 233 -> 23;
                        case 234 -> 225;
                        case 235 -> 222;
                        case 236 -> 25;
                        case 237 -> 156;
                        case 238 -> 254;
                        case 239 -> 143;
                        case 240 -> 27;
                        case 241 -> 242;
                        case 242 -> 201;
                        case 243 -> 249;
                        case 244 -> 87;
                        case 245 -> 181;
                        case 246 -> 68;
                        case 247 -> 245;
                        case 248 -> 72;
                        case 249 -> 48;
                        case 250 -> 131;
                        case 251 -> 175;
                        case 252 -> 189;
                        case 253 -> 198;
                        case 254 -> 8;
                        default -> 70;
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
         400L,
         300L,
         300L,
         false,
         1024,
         null
      );
   }

   @Override
   protected float a(@NotNull String var1, @NotNull String var2) {
      short var10001 = 2725;
      short var10002 = 10460;
      Intrinsics.checkNotNullParameter(var1, "title");
      var10001 = 2727;
      var10002 = 8182;
      Intrinsics.checkNotNullParameter(var2, "body");
      float var3 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var1, false, 2, null);
      float var4 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var2, false, 2, null);
      return Math.max(var3, var4) + 40.0F;
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
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.j(), this.k(), this.l(), this.d(), 8.0F, 1.0F, var3);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.j(),
         this.k(),
         this.l(),
         this.d(),
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.88F),
         var3
      );
      this.a(this.j(), this.k(), this.l(), this.d(), var3, var5, var4);
      float var6 = this.j() + 14.0F;
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         this.b(),
         var6,
         this.k() + 14.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.c(),
         var6,
         this.k() + 36.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         false, 16, null);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   private final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7
   ) {
      float var99 = 0; // PX-FIX
      float var98 = 0; // PX-FIX
      float var120 = 0; // PX-FIX
      float var119 = 0; // PX-FIX
      float var117 = 0; // PX-FIX
      float var114 = 0; // PX-FIX
      float var113 = 0; // PX-FIX
      float var111 = 0; // PX-FIX
      float var108 = 0; // PX-FIX
      float var107 = 0; // PX-FIX
      float var105 = 0; // PX-FIX
      float var102 = 0; // PX-FIX
      float var101 = 0; // PX-FIX
      long var9 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      String var10000 = w();
      float var11 = (float) (Math.PI / 2);
      float var12 = var11 * var5;
      float var13 = var4 / 2.0F - var5;
      float var14 = var3 - 2.0F * var5;
      float var15 = var4 - 2.0F * var5;
      String var8 = var10000;
      float var16 = var3 - 2.0F * var5;
      float var17 = var4 / 2.0F - var5;
      float var18 = var13 + var12 + var14 + var12 + var15 + var12 + var16 + var12 + var17;
      float var19 = var18 * var6;
      float var96 = var19;
      float var10001 = 0.0F;
      if (var8 == null) {
         if (var19 <= 0.0F) {
            return;
         }

         var96 = var18;
         var10001 = var19;
      }

      BooleanRef var21;
      label288: {
         float var20 = var96 - var10001;
         var21 = new BooleanRef();
         boolean var27 = false;
         float var131;
         int var97 = (var131 = var13 - 0.0F) == 0.0F ? 0 : (var131 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var97 <= 0) {
               var99 = var20;
               break label288;
            }

            float var132;
            var97 = (var132 = var20 - var13) == 0.0F ? 0 : (var132 < 0.0F ? -1 : 1);
         }

         label289: {
            if (var8 == null) {
               if (var97 >= 0) {
                  var99 = var20 - var13;
                  break label288;
               }

               var98 = var20;
               var10001 = 0.0F;
               if (var8 != null) {
                  break label289;
               }

               float var133;
               var97 = (var133 = var20 - 0.0F) == 0.0F ? 0 : (var133 < 0.0F ? -1 : 1);
            }

            if (var97 > 0) {
               float var28 = var20 / var13;
               boolean var30 = false;
               a(var21, var9, var1 + var3, var2 + var4 / 2.0F + var13 * var28);
               float var65 = var13 - var20;
               boolean var31 = false;
               NanoVG.nvgLineTo(var9, var1 + var3, var2 + var4 / 2.0F + var13 * var28 + var65);
               var99 = 0.0F;
               break label288;
            }

            var98 = 0.0F;
            var10001 = var13;
         }

         float var66 = var10001;
         float var29 = var98;
         boolean var79 = false;
         NanoVG.nvgLineTo(var9, var1 + var3, var2 + var4 / 2.0F + var13 * var29 + var66);
         var99 = 0.0F;
      }

      float var61;
      float var67;
      label291: {
         float var37 = var99;
         float var45 = var1 + var3 - var5;
         float var53 = var2 + var4 - var5;
         var61 = var5;
         var67 = 0.0F;
         boolean var32 = false;
         float var134;
         int var100 = (var134 = var12 - 0.0F) == 0.0F ? 0 : (var134 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var100 <= 0) {
               var102 = var37;
               break label291;
            }

            float var135;
            var100 = (var135 = var37 - var12) == 0.0F ? 0 : (var135 < 0.0F ? -1 : 1);
         }

         label292: {
            if (var8 == null) {
               if (var100 >= 0) {
                  var102 = var37 - var12;
                  break label291;
               }

               var101 = var37;
               var10001 = 0.0F;
               if (var8 != null) {
                  break label292;
               }

               float var136;
               var100 = (var136 = var37 - 0.0F) == 0.0F ? 0 : (var136 < 0.0F ? -1 : 1);
            }

            if (var100 <= 0) {
               NanoVG.nvgArc(var9, var45, var53, var5, var67, var67 + var11, 2);
               var102 = 0.0F;
               break label291;
            }

            var101 = var37;
            var10001 = var12;
         }

         float var33 = var101 / var10001;
         boolean var35 = false;
         a(var21, var9, var1 + var3 - var5 + var5 * (float)Math.cos(var33 * var11), var2 + var4 - var5 + var5 * (float)Math.sin(var33 * var11));
         float var36 = var67 + var11 * var33;
         NanoVG.nvgArc(var9, var45, var53, var5, var36, var67 + var11, 2);
         var102 = 0.0F;
      }

      label294: {
         float var38 = var102;
         boolean var46 = false;
         float var137;
         int var103 = (var137 = var14 - 0.0F) == 0.0F ? 0 : (var137 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var103 <= 0) {
               var105 = var38;
               break label294;
            }

            float var138;
            var103 = (var138 = var38 - var14) == 0.0F ? 0 : (var138 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var103 >= 0) {
               var105 = var38 - var14;
               break label294;
            }

            float var139;
            var103 = (var139 = var38 - 0.0F) == 0.0F ? 0 : (var139 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var103 > 0) {
               float var54 = var38 / var14;
               boolean var68 = false;
               a(var21, var9, var1 + var3 - var5 - var14 * var54, var2 + var4);
               var67 = var14 - var38;
               boolean var80 = false;
               NanoVG.nvgLineTo(var9, var1 + var3 - var5 - var14 * var54 - var67, var2 + var4);
               var105 = 0.0F;
               break label294;
            }

            var67 = var14;
            var61 = 0.0F;
            boolean var104 = false;
         }

         NanoVG.nvgLineTo(var9, var1 + var3 - var5 - var14 * var61 - var67, var2 + var4);
         var105 = 0.0F;
      }

      label295: {
         float var39 = var105;
         float var47 = var1 + var5;
         float var55 = var2 + var4 - var5;
         var61 = var5;
         var67 = var11;
         boolean var84 = false;
         float var140;
         int var106 = (var140 = var12 - 0.0F) == 0.0F ? 0 : (var140 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var106 <= 0) {
               var108 = var39;
               break label295;
            }

            float var141;
            var106 = (var141 = var39 - var12) == 0.0F ? 0 : (var141 < 0.0F ? -1 : 1);
         }

         label296: {
            if (var8 == null) {
               if (var106 >= 0) {
                  var108 = var39 - var12;
                  break label295;
               }

               var107 = var39;
               var10001 = 0.0F;
               if (var8 != null) {
                  break label296;
               }

               float var142;
               var106 = (var142 = var39 - 0.0F) == 0.0F ? 0 : (var142 < 0.0F ? -1 : 1);
            }

            if (var106 <= 0) {
               NanoVG.nvgArc(var9, var47, var55, var5, var11, var11 + var11, 2);
               var108 = 0.0F;
               break label295;
            }

            var107 = var39;
            var10001 = var12;
         }

         float var87 = var107 / var10001;
         boolean var90 = false;
         a(var21, var9, var1 + var5 + var5 * (float)Math.cos(var11 + var87 * var11), var2 + var4 - var5 + var5 * (float)Math.sin(var11 + var87 * var11));
         float var93 = var11 + var11 * var87;
         NanoVG.nvgArc(var9, var47, var55, var5, var93, var11 + var11, 2);
         var108 = 0.0F;
      }

      label298: {
         float var40 = var108;
         boolean var48 = false;
         float var143;
         int var109 = (var143 = var15 - 0.0F) == 0.0F ? 0 : (var143 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var109 <= 0) {
               var111 = var40;
               break label298;
            }

            float var144;
            var109 = (var144 = var40 - var15) == 0.0F ? 0 : (var144 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var109 >= 0) {
               var111 = var40 - var15;
               break label298;
            }

            float var145;
            var109 = (var145 = var40 - 0.0F) == 0.0F ? 0 : (var145 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var109 > 0) {
               float var56 = var40 / var15;
               boolean var71 = false;
               a(var21, var9, var1, var2 + var4 - var5 - var15 * var56);
               var67 = var15 - var40;
               boolean var81 = false;
               NanoVG.nvgLineTo(var9, var1, var2 + var4 - var5 - var15 * var56 - var67);
               var111 = 0.0F;
               break label298;
            }

            var67 = var15;
            var61 = 0.0F;
            boolean var110 = false;
         }

         NanoVG.nvgLineTo(var9, var1, var2 + var4 - var5 - var15 * var61 - var67);
         var111 = 0.0F;
      }

      label299: {
         float var41 = var111;
         float var49 = var1 + var5;
         float var57 = var2 + var5;
         var61 = var5;
         var67 = (float) Math.PI;
         boolean var85 = false;
         float var146;
         int var112 = (var146 = var12 - 0.0F) == 0.0F ? 0 : (var146 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var112 <= 0) {
               var114 = var41;
               break label299;
            }

            float var147;
            var112 = (var147 = var41 - var12) == 0.0F ? 0 : (var147 < 0.0F ? -1 : 1);
         }

         label300: {
            if (var8 == null) {
               if (var112 >= 0) {
                  var114 = var41 - var12;
                  break label299;
               }

               var113 = var41;
               var10001 = 0.0F;
               if (var8 != null) {
                  break label300;
               }

               float var148;
               var112 = (var148 = var41 - 0.0F) == 0.0F ? 0 : (var148 < 0.0F ? -1 : 1);
            }

            if (var112 <= 0) {
               NanoVG.nvgArc(var9, var49, var57, var5, var67, var67 + var11, 2);
               var114 = 0.0F;
               break label299;
            }

            var113 = var41;
            var10001 = var12;
         }

         float var88 = var113 / var10001;
         boolean var91 = false;
         a(
            var21,
            var9,
            var1 + var5 + var5 * (float)Math.cos((float) Math.PI + var88 * var11),
            var2 + var5 + var5 * (float)Math.sin((float) Math.PI + var88 * var11)
         );
         float var94 = var67 + var11 * var88;
         NanoVG.nvgArc(var9, var49, var57, var5, var94, var67 + var11, 2);
         var114 = 0.0F;
      }

      label302: {
         float var42 = var114;
         boolean var50 = false;
         float var149;
         int var115 = (var149 = var16 - 0.0F) == 0.0F ? 0 : (var149 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var115 <= 0) {
               var117 = var42;
               break label302;
            }

            float var150;
            var115 = (var150 = var42 - var16) == 0.0F ? 0 : (var150 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var115 >= 0) {
               var117 = var42 - var16;
               break label302;
            }

            float var151;
            var115 = (var151 = var42 - 0.0F) == 0.0F ? 0 : (var151 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var115 > 0) {
               float var58 = var42 / var16;
               boolean var74 = false;
               a(var21, var9, var1 + var5 + var16 * var58, var2);
               var67 = var16 - var42;
               boolean var82 = false;
               NanoVG.nvgLineTo(var9, var1 + var5 + var16 * var58 + var67, var2);
               var117 = 0.0F;
               break label302;
            }

            var67 = var16;
            var61 = 0.0F;
            boolean var116 = false;
         }

         NanoVG.nvgLineTo(var9, var1 + var5 + var16 * var61 + var67, var2);
         var117 = 0.0F;
      }

      label303: {
         float var43 = var117;
         float var51 = var1 + var3 - var5;
         float var59 = var2 + var5;
         var61 = var5;
         var67 = -var11;
         boolean var86 = false;
         float var152;
         int var118 = (var152 = var12 - 0.0F) == 0.0F ? 0 : (var152 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var118 <= 0) {
               var120 = var43;
               break label303;
            }

            float var153;
            var118 = (var153 = var43 - var12) == 0.0F ? 0 : (var153 < 0.0F ? -1 : 1);
         }

         label304: {
            if (var8 == null) {
               if (var118 >= 0) {
                  var120 = var43 - var12;
                  break label303;
               }

               var119 = var43;
               var10001 = 0.0F;
               if (var8 != null) {
                  break label304;
               }

               float var154;
               var118 = (var154 = var43 - 0.0F) == 0.0F ? 0 : (var154 < 0.0F ? -1 : 1);
            }

            if (var118 <= 0) {
               NanoVG.nvgArc(var9, var51, var59, var5, var67, var67 + var11, 2);
               var120 = 0.0F;
               break label303;
            }

            var119 = var43;
            var10001 = var12;
         }

         float var89 = var119 / var10001;
         boolean var92 = false;
         a(var21, var9, var1 + var3 - var5 + var5 * (float)Math.cos(-var11 + var89 * var11), var2 + var5 + var5 * (float)Math.sin(-var11 + var89 * var11));
         float var95 = var67 + var11 * var89;
         NanoVG.nvgArc(var9, var51, var59, var5, var95, var67 + var11, 2);
         var120 = 0.0F;
      }

      label306: {
         float var44 = var120;
         boolean var52 = false;
         float var155;
         int var121 = (var155 = var17 - 0.0F) == 0.0F ? 0 : (var155 < 0.0F ? -1 : 1);
         if (var8 == null) {
            if (var121 <= 0) {
               break label306;
            }

            float var156;
            var121 = (var156 = var44 - var17) == 0.0F ? 0 : (var156 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var121 >= 0) {
               float var125 = var44 - var17;
               break label306;
            }

            float var157;
            var121 = (var157 = var44 - 0.0F) == 0.0F ? 0 : (var157 < 0.0F ? -1 : 1);
         }

         if (var8 == null) {
            if (var121 > 0) {
               float var60 = var44 / var17;
               boolean var77 = false;
               a(var21, var9, var1 + var3, var2 + var5 + var17 * var60);
               var67 = var17 - var44;
               boolean var83 = false;
               NanoVG.nvgLineTo(var9, var1 + var3, var2 + var5 + var17 * var60 + var67);
               float var124 = 0.0F;
               break label306;
            }

            var67 = var17;
            var61 = 0.0F;
            boolean var122 = false;
         }

         NanoVG.nvgLineTo(var9, var1 + var3, var2 + var5 + var17 * var61 + var67);
         float var123 = 0.0F;
      }

      if (var8 == null) {
         if (!var21.element) {
            return;
         }

         NanoVG.nvgStrokeWidth(var9, 1.5F);
         NanoVG.nvgLineCap(var9, 1);
      }

      NVGColor var22 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      NanoVG.nvgRGBAf(var7.a() / 255.0F, var7.b() / 255.0F, var7.c() / 255.0F, 0.5F + 0.4F * var6, var22);
      NanoVG.nvgStrokeColor(var9, var22);
      NanoVG.nvgStroke(var9);
   }

   private final float a(long var1, float var3, float var4, Function1<? super Float, Unit> var5, Function2<? super Float, ? super Float, Unit> var6) {
      String var10000 = w();
      boolean var8 = false;
      String var7 = var10000;
      float var12;
      int var10 = (var12 = var4 - 0.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
      if (var7 == null) {
         if (var10 <= 0) {
            return var3;
         }

         float var13;
         var10 = (var13 = var3 - var4) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      }

      if (var7 == null) {
         if (var10 >= 0) {
            return var3 - var4;
         }

         if (var7 != null) {
            return var3;
         }

         float var14;
         var10 = (var14 = var3 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      }

      if (var10 > 0) {
         float var9 = var3 / var4;
         var5.invoke(var9);
         var6.invoke(var9, var4 - var3);
         return 0.0F;
      } else {
         var6.invoke(0.0F, var4);
         return 0.0F;
      }
   }

   private final float a(long var1, float var3, float var4, float var5, float var6, float var7, float var8, float var9, Function1<? super Float, Unit> var10) {
      String var10000 = w();
      boolean var12 = false;
      String var11 = var10000;
      float var17;
      int var15 = (var17 = var4 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      if (var11 == null) {
         if (var15 <= 0) {
            return var3;
         }

         float var18;
         var15 = (var18 = var3 - var4) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
      }

      if (var11 == null) {
         if (var15 >= 0) {
            return var3 - var4;
         }

         if (var11 != null) {
            return var3;
         }

         float var19;
         var15 = (var19 = var3 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      }

      if (var15 > 0) {
         float var13 = var3 / var4;
         var10.invoke(var13);
         float var14 = var8 + var9 * var13;
         NanoVG.nvgArc(var1, var5, var6, var7, var14, var8 + var9, 2);
         return 0.0F;
      } else {
         NanoVG.nvgArc(var1, var5, var6, var7, var8, var8 + var9, 2);
         return 0.0F;
      }
   }

   private static final void a(BooleanRef var0, long var1, float var3, float var4) {
      String var5 = w();
      BooleanRef var10000 = var0;
      if (var5 == null) {
         if (var0.element) {
            return;
         }

         NanoVG.nvgBeginPath(var1);
         NanoVG.nvgMoveTo(var1, var3, var4);
         var10000 = var0;
      }

      var10000.element = true;
   }

   public static void b(String var0) {
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var0;
   }

   public static String w() {
      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      b(null);
      String var2 = "då¤\u007f\u0005ÄDt\u0098z\u0005P æ\u0014(";
      int var4 = "då¤\u007f\u0005ÄDt\u0098z\u0005P æ\u0014(".length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 97;
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
                     case 0 -> 48;
                     case 1 -> 97;
                     case 2 -> 41;
                     case 3 -> 89;
                     case 4 -> 3;
                     case 5 -> 28;
                     default -> 4;
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
                     e = var5;
                     f = new String[5];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ü\u0089\tL\u0005ä~$ßb";
                  var4 = "ü\u0089\tL\u0005ä~$ßb".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 124;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 2724) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 58;
            case 1 -> 86;
            case 2 -> 162;
            case 3 -> 207;
            case 4 -> 65;
            case 5 -> 92;
            case 6 -> 9;
            case 7 -> 97;
            case 8 -> 194;
            case 9 -> 73;
            case 10 -> 255;
            case 11 -> 108;
            case 12 -> 148;
            case 13 -> 16;
            case 14 -> 98;
            case 15 -> 17;
            case 16 -> 142;
            case 17 -> 169;
            case 18 -> 96;
            case 19 -> 2;
            case 20 -> 164;
            case 21 -> 12;
            case 22 -> 153;
            case 23 -> 34;
            case 24 -> 217;
            case 25 -> 191;
            case 26 -> 185;
            case 27 -> 206;
            case 28 -> 218;
            case 29 -> 10;
            case 30 -> 133;
            case 31 -> 121;
            case 32 -> 170;
            case 33 -> 72;
            case 34 -> 76;
            case 35 -> 143;
            case 36 -> 15;
            case 37 -> 0;
            case 38 -> 236;
            case 39 -> 41;
            case 40 -> 37;
            case 41 -> 155;
            case 42 -> 3;
            case 43 -> 200;
            case 44 -> 19;
            case 45 -> 90;
            case 46 -> 134;
            case 47 -> 163;
            case 48 -> 43;
            case 49 -> 238;
            case 50 -> 176;
            case 51 -> 161;
            case 52 -> 122;
            case 53 -> 160;
            case 54 -> 1;
            case 55 -> 230;
            case 56 -> 130;
            case 57 -> 225;
            case 58 -> 8;
            case 59 -> 109;
            case 60 -> 156;
            case 61 -> 250;
            case 62 -> 101;
            case 63 -> 168;
            case 64 -> 219;
            case 65 -> 26;
            case 66 -> 35;
            case 67 -> 110;
            case 68 -> 166;
            case 69 -> 192;
            case 70 -> 4;
            case 71 -> 167;
            case 72 -> 215;
            case 73 -> 89;
            case 74 -> 127;
            case 75 -> 222;
            case 76 -> 56;
            case 77 -> 49;
            case 78 -> 6;
            case 79 -> 80;
            case 80 -> 198;
            case 81 -> 179;
            case 82 -> 129;
            case 83 -> 87;
            case 84 -> 104;
            case 85 -> 157;
            case 86 -> 241;
            case 87 -> 150;
            case 88 -> 216;
            case 89 -> 79;
            case 90 -> 228;
            case 91 -> 223;
            case 92 -> 126;
            case 93 -> 165;
            case 94 -> 14;
            case 95 -> 152;
            case 96 -> 209;
            case 97 -> 138;
            case 98 -> 62;
            case 99 -> 199;
            case 100 -> 147;
            case 101 -> 211;
            case 102 -> 55;
            case 103 -> 102;
            case 104 -> 63;
            case 105 -> 151;
            case 106 -> 59;
            case 107 -> 74;
            case 108 -> 233;
            case 109 -> 117;
            case 110 -> 135;
            case 111 -> 201;
            case 112 -> 136;
            case 113 -> 190;
            case 114 -> 115;
            case 115 -> 53;
            case 116 -> 47;
            case 117 -> 22;
            case 118 -> 244;
            case 119 -> 197;
            case 120 -> 188;
            case 121 -> 32;
            case 122 -> 107;
            case 123 -> 177;
            case 124 -> 139;
            case 125 -> 159;
            case 126 -> 27;
            case 127 -> 20;
            case 128 -> 220;
            case 129 -> 112;
            case 130 -> 247;
            case 131 -> 57;
            case 132 -> 84;
            case 133 -> 24;
            case 134 -> 154;
            case 135 -> 240;
            case 136 -> 172;
            case 137 -> 239;
            case 138 -> 253;
            case 139 -> 149;
            case 140 -> 106;
            case 141 -> 195;
            case 142 -> 18;
            case 143 -> 132;
            case 144 -> 186;
            case 145 -> 105;
            case 146 -> 119;
            case 147 -> 140;
            case 148 -> 40;
            case 149 -> 251;
            case 150 -> 46;
            case 151 -> 213;
            case 152 -> 246;
            case 153 -> 196;
            case 154 -> 7;
            case 155 -> 203;
            case 156 -> 60;
            case 157 -> 30;
            case 158 -> 44;
            case 159 -> 29;
            case 160 -> 118;
            case 161 -> 67;
            case 162 -> 78;
            case 163 -> 235;
            case 164 -> 175;
            case 165 -> 231;
            case 166 -> 234;
            case 167 -> 100;
            case 168 -> 85;
            case 169 -> 182;
            case 170 -> 75;
            case 171 -> 180;
            case 172 -> 173;
            case 173 -> 128;
            case 174 -> 229;
            case 175 -> 125;
            case 176 -> 36;
            case 177 -> 214;
            case 178 -> 11;
            case 179 -> 95;
            case 180 -> 83;
            case 181 -> 174;
            case 182 -> 137;
            case 183 -> 45;
            case 184 -> 202;
            case 185 -> 210;
            case 186 -> 144;
            case 187 -> 184;
            case 188 -> 61;
            case 189 -> 237;
            case 190 -> 13;
            case 191 -> 248;
            case 192 -> 50;
            case 193 -> 224;
            case 194 -> 249;
            case 195 -> 5;
            case 196 -> 120;
            case 197 -> 245;
            case 198 -> 123;
            case 199 -> 131;
            case 200 -> 158;
            case 201 -> 64;
            case 202 -> 66;
            case 203 -> 254;
            case 204 -> 52;
            case 205 -> 181;
            case 206 -> 187;
            case 207 -> 208;
            case 208 -> 193;
            case 209 -> 31;
            case 210 -> 71;
            case 211 -> 77;
            case 212 -> 93;
            case 213 -> 226;
            case 214 -> 69;
            case 215 -> 42;
            case 216 -> 242;
            case 217 -> 145;
            case 218 -> 205;
            case 219 -> 91;
            case 220 -> 111;
            case 221 -> 243;
            case 222 -> 204;
            case 223 -> 33;
            case 224 -> 116;
            case 225 -> 28;
            case 226 -> 88;
            case 227 -> 99;
            case 228 -> 70;
            case 229 -> 183;
            case 230 -> 221;
            case 231 -> 178;
            case 232 -> 25;
            case 233 -> 23;
            case 234 -> 171;
            case 235 -> 227;
            case 236 -> 54;
            case 237 -> 51;
            case 238 -> 252;
            case 239 -> 103;
            case 240 -> 212;
            case 241 -> 232;
            case 242 -> 94;
            case 243 -> 82;
            case 244 -> 141;
            case 245 -> 48;
            case 246 -> 189;
            case 247 -> 114;
            case 248 -> 113;
            case 249 -> 146;
            case 250 -> 39;
            case 251 -> 81;
            case 252 -> 38;
            case 253 -> 68;
            case 254 -> 124;
            default -> 21;
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
