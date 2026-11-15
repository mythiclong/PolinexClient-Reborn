package me.octo.client.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;

public final class llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI
   extends lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll {
   public Object invoke(Float p0) { return null; } // PX-FIX abs




   public Object receiver; // PX-FIX kotlin lambda receiver

   private static String[] e;
   private static String[] f;

   public llllIIIlIIIIlIIIlIlllIlIIllIIIlIlIlllIIIIlllIIlllIllIlIlIlllIIllIIIIlIIIlllllllIIIllI(
      long var1,
      @NotNull String var3,
      @NotNull String var4,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5
   ) {
      Object receiver = null; // PX-FIX
      short var10001 = -28134;
      short var10002 = -22320;
      Intrinsics.checkNotNullParameter(var3, "title");
      var10001 = -28135;
      var10002 = 30524;
      Intrinsics.checkNotNullParameter(var4, "body");
      var10001 = -28133;
      var10002 = 2245;
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
                  short var10004 = -14606;
                  short var10005 = -27493;
                  var10005 = -14605;
                  short var10006 = 13141;
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
                  String var2 = "m<&°Ûc\u0002p³%ÀÐ\u0010ñÝµ\u008c©äL\u0080z;ù\u0013âuÎ\u001a";
                  int var4 = "m<&°Ûc\u0002p³%ÀÐ\u0010ñÝµ\u008c©äL\u0080z;ù\u0013âuÎ\u001a".length();
                  char var1 = '\f';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 12;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 12;
                           var10006 = var6;
                        } else {
                           var13 = 12;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 12;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 87;
                              case 1 -> 29;
                              case 2 -> 86;
                              case 3 -> 49;
                              case 4 -> 10;
                              case 5 -> 98;
                              default -> 103;
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
                  int var2 = (var0 ^ -14606) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 82;
                        case 1 -> 133;
                        case 2 -> 22;
                        case 3 -> 120;
                        case 4 -> 68;
                        case 5 -> 10;
                        case 6 -> 141;
                        case 7 -> 38;
                        case 8 -> 250;
                        case 9 -> 31;
                        case 10 -> 15;
                        case 11 -> 47;
                        case 12 -> 188;
                        case 13 -> 2;
                        case 14 -> 217;
                        case 15 -> 37;
                        case 16 -> 202;
                        case 17 -> 0;
                        case 18 -> 195;
                        case 19 -> 14;
                        case 20 -> 203;
                        case 21 -> 175;
                        case 22 -> 107;
                        case 23 -> 83;
                        case 24 -> 33;
                        case 25 -> 106;
                        case 26 -> 65;
                        case 27 -> 196;
                        case 28 -> 126;
                        case 29 -> 238;
                        case 30 -> 75;
                        case 31 -> 199;
                        case 32 -> 207;
                        case 33 -> 4;
                        case 34 -> 36;
                        case 35 -> 193;
                        case 36 -> 8;
                        case 37 -> 112;
                        case 38 -> 71;
                        case 39 -> 211;
                        case 40 -> 7;
                        case 41 -> 147;
                        case 42 -> 24;
                        case 43 -> 34;
                        case 44 -> 64;
                        case 45 -> 40;
                        case 46 -> 205;
                        case 47 -> 139;
                        case 48 -> 50;
                        case 49 -> 183;
                        case 50 -> 148;
                        case 51 -> 209;
                        case 52 -> 224;
                        case 53 -> 186;
                        case 54 -> 72;
                        case 55 -> 114;
                        case 56 -> 200;
                        case 57 -> 201;
                        case 58 -> 110;
                        case 59 -> 190;
                        case 60 -> 58;
                        case 61 -> 122;
                        case 62 -> 30;
                        case 63 -> 52;
                        case 64 -> 25;
                        case 65 -> 251;
                        case 66 -> 28;
                        case 67 -> 76;
                        case 68 -> 167;
                        case 69 -> 204;
                        case 70 -> 91;
                        case 71 -> 182;
                        case 72 -> 13;
                        case 73 -> 63;
                        case 74 -> 69;
                        case 75 -> 254;
                        case 76 -> 223;
                        case 77 -> 166;
                        case 78 -> 150;
                        case 79 -> 146;
                        case 80 -> 232;
                        case 81 -> 54;
                        case 82 -> 109;
                        case 83 -> 119;
                        case 84 -> 161;
                        case 85 -> 237;
                        case 86 -> 168;
                        case 87 -> 46;
                        case 88 -> 140;
                        case 89 -> 11;
                        case 90 -> 3;
                        case 91 -> 206;
                        case 92 -> 180;
                        case 93 -> 89;
                        case 94 -> 96;
                        case 95 -> 85;
                        case 96 -> 152;
                        case 97 -> 43;
                        case 98 -> 57;
                        case 99 -> 225;
                        case 100 -> 87;
                        case 101 -> 127;
                        case 102 -> 62;
                        case 103 -> 118;
                        case 104 -> 136;
                        case 105 -> 142;
                        case 106 -> 255;
                        case 107 -> 229;
                        case 108 -> 194;
                        case 109 -> 165;
                        case 110 -> 216;
                        case 111 -> 39;
                        case 112 -> 164;
                        case 113 -> 226;
                        case 114 -> 45;
                        case 115 -> 151;
                        case 116 -> 111;
                        case 117 -> 97;
                        case 118 -> 90;
                        case 119 -> 49;
                        case 120 -> 102;
                        case 121 -> 154;
                        case 122 -> 44;
                        case 123 -> 214;
                        case 124 -> 80;
                        case 125 -> 16;
                        case 126 -> 6;
                        case 127 -> 48;
                        case 128 -> 117;
                        case 129 -> 19;
                        case 130 -> 121;
                        case 131 -> 143;
                        case 132 -> 222;
                        case 133 -> 95;
                        case 134 -> 78;
                        case 135 -> 177;
                        case 136 -> 132;
                        case 137 -> 77;
                        case 138 -> 187;
                        case 139 -> 245;
                        case 140 -> 234;
                        case 141 -> 55;
                        case 142 -> 243;
                        case 143 -> 178;
                        case 144 -> 160;
                        case 145 -> 231;
                        case 146 -> 241;
                        case 147 -> 169;
                        case 148 -> 218;
                        case 149 -> 59;
                        case 150 -> 236;
                        case 151 -> 215;
                        case 152 -> 221;
                        case 153 -> 247;
                        case 154 -> 210;
                        case 155 -> 181;
                        case 156 -> 191;
                        case 157 -> 113;
                        case 158 -> 131;
                        case 159 -> 88;
                        case 160 -> 20;
                        case 161 -> 144;
                        case 162 -> 18;
                        case 163 -> 189;
                        case 164 -> 101;
                        case 165 -> 230;
                        case 166 -> 123;
                        case 167 -> 42;
                        case 168 -> 124;
                        case 169 -> 137;
                        case 170 -> 134;
                        case 171 -> 149;
                        case 172 -> 21;
                        case 173 -> 29;
                        case 174 -> 208;
                        case 175 -> 174;
                        case 176 -> 67;
                        case 177 -> 60;
                        case 178 -> 66;
                        case 179 -> 228;
                        case 180 -> 35;
                        case 181 -> 156;
                        case 182 -> 135;
                        case 183 -> 220;
                        case 184 -> 108;
                        case 185 -> 176;
                        case 186 -> 235;
                        case 187 -> 73;
                        case 188 -> 197;
                        case 189 -> 157;
                        case 190 -> 128;
                        case 191 -> 185;
                        case 192 -> 26;
                        case 193 -> 233;
                        case 194 -> 115;
                        case 195 -> 53;
                        case 196 -> 138;
                        case 197 -> 5;
                        case 198 -> 32;
                        case 199 -> 248;
                        case 200 -> 246;
                        case 201 -> 99;
                        case 202 -> 17;
                        case 203 -> 239;
                        case 204 -> 212;
                        case 205 -> 81;
                        case 206 -> 159;
                        case 207 -> 104;
                        case 208 -> 242;
                        case 209 -> 70;
                        case 210 -> 253;
                        case 211 -> 145;
                        case 212 -> 155;
                        case 213 -> 84;
                        case 214 -> 158;
                        case 215 -> 61;
                        case 216 -> 213;
                        case 217 -> 171;
                        case 218 -> 129;
                        case 219 -> 41;
                        case 220 -> 219;
                        case 221 -> 103;
                        case 222 -> 173;
                        case 223 -> 163;
                        case 224 -> 1;
                        case 225 -> 172;
                        case 226 -> 74;
                        case 227 -> 79;
                        case 228 -> 244;
                        case 229 -> 130;
                        case 230 -> 9;
                        case 231 -> 93;
                        case 232 -> 56;
                        case 233 -> 170;
                        case 234 -> 27;
                        case 235 -> 179;
                        case 236 -> 227;
                        case 237 -> 249;
                        case 238 -> 240;
                        case 239 -> 252;
                        case 240 -> 198;
                        case 241 -> 105;
                        case 242 -> 125;
                        case 243 -> 86;
                        case 244 -> 51;
                        case 245 -> 153;
                        case 246 -> 12;
                        case 247 -> 184;
                        case 248 -> 92;
                        case 249 -> 23;
                        case 250 -> 98;
                        case 251 -> 162;
                        case 252 -> 116;
                        case 253 -> 192;
                        case 254 -> 94;
                        default -> 100;
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
                  short var10004 = -8461;
                  short var10005 = 1625;
                  var10005 = -8462;
                  short var10006 = -12071;
               }

               public final Float a() {
                  return me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: { // PX-FIX
                  String[] var5 = new String[2];
                  int var3 = 0;
                  String var2 = "\u0014\u00928Âî£ò\u0099\u001bzi¹\u0006\u0083±r\f¤\b.\u0091,ÉªÔ\u0010Ó\b\u008c";
                  int var4 = "\u0014\u00928Âî£ò\u0099\u001bzi¹\u0006\u0083±r\f¤\b.\u0091,ÉªÔ\u0010Ó\b\u008c".length();
                  char var1 = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 3;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 3;
                           var10006 = var6;
                        } else {
                           var13 = 3;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 3;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 122;
                              case 1 -> 15;
                              case 2 -> 44;
                              case 3 -> 58;
                              case 4 -> 93;
                              case 5 -> 99;
                              default -> 53;
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
                  int var2 = (var0 ^ -8462) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 201;
                        case 1 -> 229;
                        case 2 -> 207;
                        case 3 -> 244;
                        case 4 -> 88;
                        case 5 -> 176;
                        case 6 -> 213;
                        case 7 -> 194;
                        case 8 -> 18;
                        case 9 -> 40;
                        case 10 -> 129;
                        case 11 -> 1;
                        case 12 -> 16;
                        case 13 -> 143;
                        case 14 -> 246;
                        case 15 -> 202;
                        case 16 -> 109;
                        case 17 -> 48;
                        case 18 -> 203;
                        case 19 -> 192;
                        case 20 -> 133;
                        case 21 -> 5;
                        case 22 -> 132;
                        case 23 -> 252;
                        case 24 -> 255;
                        case 25 -> 22;
                        case 26 -> 188;
                        case 27 -> 130;
                        case 28 -> 187;
                        case 29 -> 122;
                        case 30 -> 205;
                        case 31 -> 216;
                        case 32 -> 9;
                        case 33 -> 156;
                        case 34 -> 144;
                        case 35 -> 24;
                        case 36 -> 97;
                        case 37 -> 181;
                        case 38 -> 30;
                        case 39 -> 35;
                        case 40 -> 81;
                        case 41 -> 240;
                        case 42 -> 14;
                        case 43 -> 237;
                        case 44 -> 128;
                        case 45 -> 121;
                        case 46 -> 208;
                        case 47 -> 250;
                        case 48 -> 110;
                        case 49 -> 200;
                        case 50 -> 239;
                        case 51 -> 204;
                        case 52 -> 43;
                        case 53 -> 214;
                        case 54 -> 185;
                        case 55 -> 57;
                        case 56 -> 153;
                        case 57 -> 126;
                        case 58 -> 172;
                        case 59 -> 186;
                        case 60 -> 195;
                        case 61 -> 162;
                        case 62 -> 37;
                        case 63 -> 116;
                        case 64 -> 102;
                        case 65 -> 148;
                        case 66 -> 86;
                        case 67 -> 29;
                        case 68 -> 23;
                        case 69 -> 227;
                        case 70 -> 215;
                        case 71 -> 165;
                        case 72 -> 219;
                        case 73 -> 117;
                        case 74 -> 145;
                        case 75 -> 33;
                        case 76 -> 226;
                        case 77 -> 249;
                        case 78 -> 64;
                        case 79 -> 131;
                        case 80 -> 217;
                        case 81 -> 147;
                        case 82 -> 95;
                        case 83 -> 138;
                        case 84 -> 76;
                        case 85 -> 123;
                        case 86 -> 25;
                        case 87 -> 190;
                        case 88 -> 178;
                        case 89 -> 158;
                        case 90 -> 54;
                        case 91 -> 224;
                        case 92 -> 42;
                        case 93 -> 242;
                        case 94 -> 253;
                        case 95 -> 62;
                        case 96 -> 85;
                        case 97 -> 66;
                        case 98 -> 56;
                        case 99 -> 47;
                        case 100 -> 125;
                        case 101 -> 94;
                        case 102 -> 164;
                        case 103 -> 235;
                        case 104 -> 234;
                        case 105 -> 169;
                        case 106 -> 236;
                        case 107 -> 36;
                        case 108 -> 3;
                        case 109 -> 209;
                        case 110 -> 218;
                        case 111 -> 241;
                        case 112 -> 212;
                        case 113 -> 92;
                        case 114 -> 51;
                        case 115 -> 167;
                        case 116 -> 248;
                        case 117 -> 189;
                        case 118 -> 28;
                        case 119 -> 63;
                        case 120 -> 171;
                        case 121 -> 141;
                        case 122 -> 75;
                        case 123 -> 199;
                        case 124 -> 82;
                        case 125 -> 44;
                        case 126 -> 243;
                        case 127 -> 10;
                        case 128 -> 71;
                        case 129 -> 17;
                        case 130 -> 20;
                        case 131 -> 59;
                        case 132 -> 13;
                        case 133 -> 152;
                        case 134 -> 67;
                        case 135 -> 163;
                        case 136 -> 111;
                        case 137 -> 4;
                        case 138 -> 222;
                        case 139 -> 27;
                        case 140 -> 225;
                        case 141 -> 233;
                        case 142 -> 174;
                        case 143 -> 72;
                        case 144 -> 113;
                        case 145 -> 46;
                        case 146 -> 155;
                        case 147 -> 175;
                        case 148 -> 11;
                        case 149 -> 157;
                        case 150 -> 245;
                        case 151 -> 73;
                        case 152 -> 135;
                        case 153 -> 78;
                        case 154 -> 105;
                        case 155 -> 107;
                        case 156 -> 166;
                        case 157 -> 170;
                        case 158 -> 53;
                        case 159 -> 118;
                        case 160 -> 210;
                        case 161 -> 251;
                        case 162 -> 183;
                        case 163 -> 247;
                        case 164 -> 39;
                        case 165 -> 198;
                        case 166 -> 119;
                        case 167 -> 19;
                        case 168 -> 0;
                        case 169 -> 84;
                        case 170 -> 232;
                        case 171 -> 101;
                        case 172 -> 74;
                        case 173 -> 15;
                        case 174 -> 21;
                        case 175 -> 68;
                        case 176 -> 50;
                        case 177 -> 206;
                        case 178 -> 159;
                        case 179 -> 26;
                        case 180 -> 41;
                        case 181 -> 184;
                        case 182 -> 193;
                        case 183 -> 179;
                        case 184 -> 114;
                        case 185 -> 106;
                        case 186 -> 168;
                        case 187 -> 83;
                        case 188 -> 61;
                        case 189 -> 8;
                        case 190 -> 154;
                        case 191 -> 223;
                        case 192 -> 31;
                        case 193 -> 58;
                        case 194 -> 112;
                        case 195 -> 6;
                        case 196 -> 55;
                        case 197 -> 120;
                        case 198 -> 180;
                        case 199 -> 231;
                        case 200 -> 93;
                        case 201 -> 142;
                        case 202 -> 177;
                        case 203 -> 197;
                        case 204 -> 79;
                        case 205 -> 108;
                        case 206 -> 191;
                        case 207 -> 254;
                        case 208 -> 7;
                        case 209 -> 196;
                        case 210 -> 87;
                        case 211 -> 228;
                        case 212 -> 52;
                        case 213 -> 32;
                        case 214 -> 149;
                        case 215 -> 89;
                        case 216 -> 80;
                        case 217 -> 146;
                        case 218 -> 150;
                        case 219 -> 49;
                        case 220 -> 103;
                        case 221 -> 161;
                        case 222 -> 77;
                        case 223 -> 70;
                        case 224 -> 124;
                        case 225 -> 100;
                        case 226 -> 60;
                        case 227 -> 91;
                        case 228 -> 127;
                        case 229 -> 115;
                        case 230 -> 98;
                        case 231 -> 140;
                        case 232 -> 96;
                        case 233 -> 104;
                        case 234 -> 151;
                        case 235 -> 90;
                        case 236 -> 173;
                        case 237 -> 238;
                        case 238 -> 220;
                        case 239 -> 182;
                        case 240 -> 69;
                        case 241 -> 134;
                        case 242 -> 34;
                        case 243 -> 139;
                        case 244 -> 137;
                        case 245 -> 45;
                        case 246 -> 221;
                        case 247 -> 230;
                        case 248 -> 99;
                        case 249 -> 160;
                        case 250 -> 211;
                        case 251 -> 136;
                        case 252 -> 12;
                        case 253 -> 65;
                        case 254 -> 2;
                        default -> 38;
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
                  short var10004 = 17212;
                  short var10005 = -25810;
                  var10005 = 17213;
                  short var10006 = -22519;
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
         ),
         350L,
         250L,
         250L,
         false,
         1024,
         null
      );
   }

   @Override
   protected float a(@NotNull String var1, @NotNull String var2) {
      short var10001 = -28131;
      short var10002 = -13188;
      Intrinsics.checkNotNullParameter(var1, "title");
      var10001 = -28136;
      var10002 = -11118;
      Intrinsics.checkNotNullParameter(var2, "body");
      float var3 = 40.0F;
      float var4 = 16.0F;
      float var5 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var1, false, 2, null);
      float var6 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var2, false, 2, null);
      return var3 + Math.max(var5, var6) + var4;
   }

   @Override
   public void s() {
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      float var2 = this.j() + this.l() / 2.0F;
      float var3 = this.k() + this.d() / 2.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var2, var3);
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.w();
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.u(), this.u());
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(-var2, -var3);
      float var4 = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5 = new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         this.t().a()
      );
      float var6 = 1.0F - this.m();
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.j(), this.k(), this.l(), this.d(), 8.0F, 1.0F, var4);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.j(),
         this.k(),
         this.l(),
         this.d(),
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.92F),
         var4
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.j(),
         this.k(),
         this.l(),
         this.d(),
         1.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.35F),
         var4
      );
      float var7 = this.j() + 20.0F;
      float var8 = this.k() + this.d() / 2.0F;
      float var9 = 9.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         var7,
         var8,
         var9,
         2.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .a(0.6F)
      );
      long var10 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      float var12 = (float) (-Math.PI / 2);
      float var13 = (float) (Math.PI * 2) * var6;
      NanoVG.nvgBeginPath(var10);
      NanoVG.nvgArc(var10, var7, var8, var9, var12, var12 + var13, 2);
      NanoVG.nvgStrokeWidth(var10, 2.0F);
      NVGColor var14 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      NanoVG.nvgRGBAf(var5.a() / 255.0F, var5.b() / 255.0F, var5.c() / 255.0F, 0.6F + 0.3F * var6, var14);
      NanoVG.nvgStrokeColor(var10, var14);
      NanoVG.nvgStroke(var10);
      float var15 = this.j() + 40.0F;
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         this.b(),
         var15,
         this.k() + 14.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.c(),
         var15,
         this.k() + 36.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         false, 16, null);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.b("Bo5voc");
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0092@8Í\u0004Ë\u0096\u0013\u0017\u0005.ø\u0081·Q";
      int var4 = "\u0092@8Í\u0004Ë\u0096\u0013\u0017\u0005.ø\u0081·Q".length();
      char var1 = 4;
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
                     case 0 -> 69;
                     case 1 -> 87;
                     case 2 -> 77;
                     case 3 -> 17;
                     case 4 -> 62;
                     case 5 -> 50;
                     default -> 73;
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

                  var2 = "mZo1L\u0005¿à5f\u0007";
                  var4 = "mZo1L\u0005¿à5f\u0007".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 44;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ -28135) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 87;
            case 1 -> 142;
            case 2 -> 76;
            case 3 -> 12;
            case 4 -> 96;
            case 5 -> 65;
            case 6 -> 115;
            case 7 -> 187;
            case 8 -> 171;
            case 9 -> 33;
            case 10 -> 2;
            case 11 -> 20;
            case 12 -> 179;
            case 13 -> 74;
            case 14 -> 150;
            case 15 -> 233;
            case 16 -> 141;
            case 17 -> 60;
            case 18 -> 69;
            case 19 -> 157;
            case 20 -> 193;
            case 21 -> 80;
            case 22 -> 247;
            case 23 -> 102;
            case 24 -> 231;
            case 25 -> 173;
            case 26 -> 116;
            case 27 -> 192;
            case 28 -> 246;
            case 29 -> 30;
            case 30 -> 221;
            case 31 -> 186;
            case 32 -> 107;
            case 33 -> 220;
            case 34 -> 58;
            case 35 -> 147;
            case 36 -> 155;
            case 37 -> 23;
            case 38 -> 47;
            case 39 -> 113;
            case 40 -> 104;
            case 41 -> 199;
            case 42 -> 4;
            case 43 -> 177;
            case 44 -> 88;
            case 45 -> 36;
            case 46 -> 241;
            case 47 -> 227;
            case 48 -> 205;
            case 49 -> 243;
            case 50 -> 237;
            case 51 -> 230;
            case 52 -> 84;
            case 53 -> 225;
            case 54 -> 29;
            case 55 -> 209;
            case 56 -> 254;
            case 57 -> 183;
            case 58 -> 166;
            case 59 -> 100;
            case 60 -> 245;
            case 61 -> 145;
            case 62 -> 165;
            case 63 -> 53;
            case 64 -> 236;
            case 65 -> 198;
            case 66 -> 1;
            case 67 -> 140;
            case 68 -> 176;
            case 69 -> 103;
            case 70 -> 172;
            case 71 -> 16;
            case 72 -> 122;
            case 73 -> 188;
            case 74 -> 38;
            case 75 -> 6;
            case 76 -> 206;
            case 77 -> 229;
            case 78 -> 200;
            case 79 -> 37;
            case 80 -> 123;
            case 81 -> 132;
            case 82 -> 239;
            case 83 -> 111;
            case 84 -> 253;
            case 85 -> 248;
            case 86 -> 197;
            case 87 -> 159;
            case 88 -> 40;
            case 89 -> 163;
            case 90 -> 45;
            case 91 -> 90;
            case 92 -> 127;
            case 93 -> 106;
            case 94 -> 18;
            case 95 -> 131;
            case 96 -> 207;
            case 97 -> 32;
            case 98 -> 31;
            case 99 -> 125;
            case 100 -> 216;
            case 101 -> 194;
            case 102 -> 25;
            case 103 -> 17;
            case 104 -> 244;
            case 105 -> 21;
            case 106 -> 54;
            case 107 -> 255;
            case 108 -> 222;
            case 109 -> 217;
            case 110 -> 11;
            case 111 -> 55;
            case 112 -> 201;
            case 113 -> 214;
            case 114 -> 10;
            case 115 -> 89;
            case 116 -> 49;
            case 117 -> 9;
            case 118 -> 238;
            case 119 -> 135;
            case 120 -> 5;
            case 121 -> 91;
            case 122 -> 3;
            case 123 -> 59;
            case 124 -> 92;
            case 125 -> 162;
            case 126 -> 213;
            case 127 -> 7;
            case 128 -> 48;
            case 129 -> 251;
            case 130 -> 35;
            case 131 -> 185;
            case 132 -> 126;
            case 133 -> 44;
            case 134 -> 160;
            case 135 -> 250;
            case 136 -> 26;
            case 137 -> 72;
            case 138 -> 110;
            case 139 -> 170;
            case 140 -> 128;
            case 141 -> 61;
            case 142 -> 28;
            case 143 -> 149;
            case 144 -> 211;
            case 145 -> 8;
            case 146 -> 97;
            case 147 -> 95;
            case 148 -> 62;
            case 149 -> 139;
            case 150 -> 108;
            case 151 -> 101;
            case 152 -> 109;
            case 153 -> 249;
            case 154 -> 13;
            case 155 -> 67;
            case 156 -> 22;
            case 157 -> 134;
            case 158 -> 146;
            case 159 -> 228;
            case 160 -> 235;
            case 161 -> 86;
            case 162 -> 234;
            case 163 -> 114;
            case 164 -> 137;
            case 165 -> 63;
            case 166 -> 79;
            case 167 -> 240;
            case 168 -> 164;
            case 169 -> 99;
            case 170 -> 64;
            case 171 -> 252;
            case 172 -> 158;
            case 173 -> 153;
            case 174 -> 133;
            case 175 -> 112;
            case 176 -> 94;
            case 177 -> 181;
            case 178 -> 57;
            case 179 -> 52;
            case 180 -> 168;
            case 181 -> 210;
            case 182 -> 195;
            case 183 -> 75;
            case 184 -> 78;
            case 185 -> 144;
            case 186 -> 202;
            case 187 -> 27;
            case 188 -> 156;
            case 189 -> 124;
            case 190 -> 175;
            case 191 -> 223;
            case 192 -> 71;
            case 193 -> 190;
            case 194 -> 242;
            case 195 -> 46;
            case 196 -> 215;
            case 197 -> 224;
            case 198 -> 56;
            case 199 -> 203;
            case 200 -> 120;
            case 201 -> 82;
            case 202 -> 39;
            case 203 -> 169;
            case 204 -> 148;
            case 205 -> 117;
            case 206 -> 204;
            case 207 -> 14;
            case 208 -> 93;
            case 209 -> 219;
            case 210 -> 81;
            case 211 -> 34;
            case 212 -> 42;
            case 213 -> 178;
            case 214 -> 218;
            case 215 -> 50;
            case 216 -> 182;
            case 217 -> 73;
            case 218 -> 83;
            case 219 -> 70;
            case 220 -> 121;
            case 221 -> 161;
            case 222 -> 98;
            case 223 -> 143;
            case 224 -> 191;
            case 225 -> 68;
            case 226 -> 129;
            case 227 -> 138;
            case 228 -> 0;
            case 229 -> 85;
            case 230 -> 154;
            case 231 -> 189;
            case 232 -> 43;
            case 233 -> 136;
            case 234 -> 130;
            case 235 -> 51;
            case 236 -> 151;
            case 237 -> 212;
            case 238 -> 24;
            case 239 -> 66;
            case 240 -> 15;
            case 241 -> 196;
            case 242 -> 152;
            case 243 -> 232;
            case 244 -> 184;
            case 245 -> 105;
            case 246 -> 118;
            case 247 -> 19;
            case 248 -> 77;
            case 249 -> 167;
            case 250 -> 226;
            case 251 -> 41;
            case 252 -> 174;
            case 253 -> 119;
            case 254 -> 208;
            default -> 180;
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
