package me.octo.client.utils;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI
   extends lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll {
   public Object invoke(Float p0) { return null; } // PX-FIX abs




   public Object receiver; // PX-FIX kotlin lambda receiver

   private static String[] e;
   private static String[] f;

   public IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI(
      long var1,
      @NotNull String var3,
      @NotNull String var4,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5
   ) {
      Object receiver = null; // PX-FIX
      short var10001 = 5514;
      short var10002 = -30398;
      Intrinsics.checkNotNullParameter(var3, "title");
      var10001 = 5519;
      var10002 = -31275;
      Intrinsics.checkNotNullParameter(var4, "body");
      var10001 = 5516;
      var10002 = 27110;
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
                  short var10004 = -17203;
                  short var10005 = -3775;
                  var10005 = -17204;
                  short var10006 = 18817;
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
                  String var2 = "\u001biãñïqr§íÔàb\u00101+¦¹Gxg\u0086Oð´æq=)C";
                  int var4 = "\u001biãñïqr§íÔàb\u00101+¦¹Gxg\u0086Oð´æq=)C".length();
                  char var1 = '\f';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 65;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 65;
                           var10006 = var6;
                        } else {
                           var13 = 65;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 65;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 104;
                              case 1 -> 78;
                              case 2 -> 94;
                              case 3 -> 84;
                              case 4 -> 99;
                              case 5 -> 16;
                              default -> 88;
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
                  int var2 = (var0 ^ -17203) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 96;
                        case 1 -> 123;
                        case 2 -> 191;
                        case 3 -> 251;
                        case 4 -> 189;
                        case 5 -> 220;
                        case 6 -> 233;
                        case 7 -> 6;
                        case 8 -> 187;
                        case 9 -> 139;
                        case 10 -> 166;
                        case 11 -> 94;
                        case 12 -> 56;
                        case 13 -> 128;
                        case 14 -> 85;
                        case 15 -> 216;
                        case 16 -> 15;
                        case 17 -> 22;
                        case 18 -> 42;
                        case 19 -> 141;
                        case 20 -> 122;
                        case 21 -> 188;
                        case 22 -> 131;
                        case 23 -> 201;
                        case 24 -> 4;
                        case 25 -> 226;
                        case 26 -> 213;
                        case 27 -> 227;
                        case 28 -> 113;
                        case 29 -> 203;
                        case 30 -> 246;
                        case 31 -> 95;
                        case 32 -> 48;
                        case 33 -> 65;
                        case 34 -> 155;
                        case 35 -> 12;
                        case 36 -> 244;
                        case 37 -> 161;
                        case 38 -> 16;
                        case 39 -> 13;
                        case 40 -> 185;
                        case 41 -> 50;
                        case 42 -> 19;
                        case 43 -> 62;
                        case 44 -> 46;
                        case 45 -> 68;
                        case 46 -> 107;
                        case 47 -> 217;
                        case 48 -> 215;
                        case 49 -> 116;
                        case 50 -> 234;
                        case 51 -> 87;
                        case 52 -> 9;
                        case 53 -> 35;
                        case 54 -> 43;
                        case 55 -> 55;
                        case 56 -> 253;
                        case 57 -> 77;
                        case 58 -> 110;
                        case 59 -> 181;
                        case 60 -> 168;
                        case 61 -> 170;
                        case 62 -> 209;
                        case 63 -> 37;
                        case 64 -> 69;
                        case 65 -> 80;
                        case 66 -> 153;
                        case 67 -> 54;
                        case 68 -> 23;
                        case 69 -> 197;
                        case 70 -> 241;
                        case 71 -> 86;
                        case 72 -> 235;
                        case 73 -> 74;
                        case 74 -> 105;
                        case 75 -> 47;
                        case 76 -> 150;
                        case 77 -> 89;
                        case 78 -> 175;
                        case 79 -> 81;
                        case 80 -> 121;
                        case 81 -> 67;
                        case 82 -> 206;
                        case 83 -> 66;
                        case 84 -> 143;
                        case 85 -> 243;
                        case 86 -> 179;
                        case 87 -> 173;
                        case 88 -> 135;
                        case 89 -> 210;
                        case 90 -> 109;
                        case 91 -> 72;
                        case 92 -> 30;
                        case 93 -> 100;
                        case 94 -> 222;
                        case 95 -> 28;
                        case 96 -> 154;
                        case 97 -> 167;
                        case 98 -> 236;
                        case 99 -> 137;
                        case 100 -> 106;
                        case 101 -> 34;
                        case 102 -> 199;
                        case 103 -> 138;
                        case 104 -> 114;
                        case 105 -> 193;
                        case 106 -> 29;
                        case 107 -> 40;
                        case 108 -> 202;
                        case 109 -> 82;
                        case 110 -> 75;
                        case 111 -> 255;
                        case 112 -> 126;
                        case 113 -> 242;
                        case 114 -> 24;
                        case 115 -> 178;
                        case 116 -> 200;
                        case 117 -> 73;
                        case 118 -> 112;
                        case 119 -> 132;
                        case 120 -> 134;
                        case 121 -> 212;
                        case 122 -> 83;
                        case 123 -> 108;
                        case 124 -> 252;
                        case 125 -> 93;
                        case 126 -> 211;
                        case 127 -> 125;
                        case 128 -> 147;
                        case 129 -> 127;
                        case 130 -> 99;
                        case 131 -> 219;
                        case 132 -> 163;
                        case 133 -> 231;
                        case 134 -> 171;
                        case 135 -> 224;
                        case 136 -> 218;
                        case 137 -> 0;
                        case 138 -> 2;
                        case 139 -> 36;
                        case 140 -> 70;
                        case 141 -> 208;
                        case 142 -> 88;
                        case 143 -> 169;
                        case 144 -> 8;
                        case 145 -> 129;
                        case 146 -> 221;
                        case 147 -> 25;
                        case 148 -> 164;
                        case 149 -> 5;
                        case 150 -> 144;
                        case 151 -> 41;
                        case 152 -> 84;
                        case 153 -> 118;
                        case 154 -> 31;
                        case 155 -> 104;
                        case 156 -> 183;
                        case 157 -> 51;
                        case 158 -> 11;
                        case 159 -> 39;
                        case 160 -> 194;
                        case 161 -> 130;
                        case 162 -> 142;
                        case 163 -> 230;
                        case 164 -> 237;
                        case 165 -> 92;
                        case 166 -> 250;
                        case 167 -> 205;
                        case 168 -> 18;
                        case 169 -> 111;
                        case 170 -> 228;
                        case 171 -> 49;
                        case 172 -> 10;
                        case 173 -> 14;
                        case 174 -> 238;
                        case 175 -> 90;
                        case 176 -> 136;
                        case 177 -> 33;
                        case 178 -> 225;
                        case 179 -> 229;
                        case 180 -> 151;
                        case 181 -> 223;
                        case 182 -> 17;
                        case 183 -> 26;
                        case 184 -> 248;
                        case 185 -> 102;
                        case 186 -> 214;
                        case 187 -> 115;
                        case 188 -> 120;
                        case 189 -> 27;
                        case 190 -> 52;
                        case 191 -> 195;
                        case 192 -> 71;
                        case 193 -> 157;
                        case 194 -> 64;
                        case 195 -> 146;
                        case 196 -> 119;
                        case 197 -> 232;
                        case 198 -> 207;
                        case 199 -> 174;
                        case 200 -> 63;
                        case 201 -> 103;
                        case 202 -> 152;
                        case 203 -> 53;
                        case 204 -> 160;
                        case 205 -> 58;
                        case 206 -> 133;
                        case 207 -> 21;
                        case 208 -> 156;
                        case 209 -> 57;
                        case 210 -> 177;
                        case 211 -> 145;
                        case 212 -> 32;
                        case 213 -> 245;
                        case 214 -> 117;
                        case 215 -> 148;
                        case 216 -> 240;
                        case 217 -> 254;
                        case 218 -> 190;
                        case 219 -> 182;
                        case 220 -> 204;
                        case 221 -> 7;
                        case 222 -> 172;
                        case 223 -> 3;
                        case 224 -> 98;
                        case 225 -> 44;
                        case 226 -> 192;
                        case 227 -> 180;
                        case 228 -> 78;
                        case 229 -> 79;
                        case 230 -> 20;
                        case 231 -> 176;
                        case 232 -> 162;
                        case 233 -> 97;
                        case 234 -> 239;
                        case 235 -> 159;
                        case 236 -> 38;
                        case 237 -> 186;
                        case 238 -> 196;
                        case 239 -> 158;
                        case 240 -> 140;
                        case 241 -> 45;
                        case 242 -> 249;
                        case 243 -> 165;
                        case 244 -> 198;
                        case 245 -> 184;
                        case 246 -> 61;
                        case 247 -> 1;
                        case 248 -> 59;
                        case 249 -> 76;
                        case 250 -> 60;
                        case 251 -> 149;
                        case 252 -> 247;
                        case 253 -> 91;
                        case 254 -> 101;
                        default -> 124;
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
                  short var10004 = -31386;
                  short var10005 = -19286;
                  var10005 = -31385;
                  short var10006 = -28349;
               }

               public final Float a() {
                  return me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: { // PX-FIX
                  String[] var5 = new String[2];
                  int var3 = 0;
                  String var2 = "\u009bË<ìa\u0081æ\rª\u001dZZ\u0010sß!nÂÑ\u0092\u0007$\\\u008br½\u001f\u0016Ò";
                  int var4 = "\u009bË<ìa\u0081æ\rª\u001dZZ\u0010sß!nÂÑ\u0092\u0007$\\\u008br½\u001f\u0016Ò".length();
                  char var1 = '\f';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 42;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 42;
                           var10006 = var6;
                        } else {
                           var13 = 42;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 42;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 102;
                              case 1 -> 60;
                              case 2 -> 86;
                              case 3 -> 85;
                              case 4 -> 17;
                              case 5 -> 101;
                              default -> 85;
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
                  int var2 = (var0 ^ -31386) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 38;
                        case 1 -> 8;
                        case 2 -> 194;
                        case 3 -> 231;
                        case 4 -> 31;
                        case 5 -> 15;
                        case 6 -> 97;
                        case 7 -> 119;
                        case 8 -> 220;
                        case 9 -> 26;
                        case 10 -> 101;
                        case 11 -> 214;
                        case 12 -> 66;
                        case 13 -> 51;
                        case 14 -> 219;
                        case 15 -> 126;
                        case 16 -> 34;
                        case 17 -> 98;
                        case 18 -> 149;
                        case 19 -> 89;
                        case 20 -> 230;
                        case 21 -> 134;
                        case 22 -> 203;
                        case 23 -> 145;
                        case 24 -> 9;
                        case 25 -> 223;
                        case 26 -> 56;
                        case 27 -> 5;
                        case 28 -> 182;
                        case 29 -> 156;
                        case 30 -> 179;
                        case 31 -> 217;
                        case 32 -> 80;
                        case 33 -> 140;
                        case 34 -> 14;
                        case 35 -> 107;
                        case 36 -> 227;
                        case 37 -> 11;
                        case 38 -> 199;
                        case 39 -> 42;
                        case 40 -> 94;
                        case 41 -> 68;
                        case 42 -> 160;
                        case 43 -> 238;
                        case 44 -> 53;
                        case 45 -> 50;
                        case 46 -> 146;
                        case 47 -> 10;
                        case 48 -> 22;
                        case 49 -> 12;
                        case 50 -> 241;
                        case 51 -> 65;
                        case 52 -> 110;
                        case 53 -> 96;
                        case 54 -> 125;
                        case 55 -> 109;
                        case 56 -> 41;
                        case 57 -> 144;
                        case 58 -> 183;
                        case 59 -> 132;
                        case 60 -> 25;
                        case 61 -> 100;
                        case 62 -> 237;
                        case 63 -> 233;
                        case 64 -> 253;
                        case 65 -> 74;
                        case 66 -> 86;
                        case 67 -> 197;
                        case 68 -> 224;
                        case 69 -> 73;
                        case 70 -> 79;
                        case 71 -> 116;
                        case 72 -> 153;
                        case 73 -> 239;
                        case 74 -> 180;
                        case 75 -> 40;
                        case 76 -> 166;
                        case 77 -> 173;
                        case 78 -> 76;
                        case 79 -> 75;
                        case 80 -> 249;
                        case 81 -> 150;
                        case 82 -> 46;
                        case 83 -> 243;
                        case 84 -> 189;
                        case 85 -> 24;
                        case 86 -> 127;
                        case 87 -> 54;
                        case 88 -> 32;
                        case 89 -> 212;
                        case 90 -> 77;
                        case 91 -> 90;
                        case 92 -> 84;
                        case 93 -> 252;
                        case 94 -> 105;
                        case 95 -> 181;
                        case 96 -> 49;
                        case 97 -> 250;
                        case 98 -> 218;
                        case 99 -> 111;
                        case 100 -> 211;
                        case 101 -> 235;
                        case 102 -> 83;
                        case 103 -> 47;
                        case 104 -> 21;
                        case 105 -> 185;
                        case 106 -> 192;
                        case 107 -> 6;
                        case 108 -> 206;
                        case 109 -> 170;
                        case 110 -> 255;
                        case 111 -> 3;
                        case 112 -> 136;
                        case 113 -> 61;
                        case 114 -> 157;
                        case 115 -> 202;
                        case 116 -> 0;
                        case 117 -> 48;
                        case 118 -> 103;
                        case 119 -> 177;
                        case 120 -> 196;
                        case 121 -> 187;
                        case 122 -> 18;
                        case 123 -> 35;
                        case 124 -> 64;
                        case 125 -> 251;
                        case 126 -> 85;
                        case 127 -> 69;
                        case 128 -> 245;
                        case 129 -> 191;
                        case 130 -> 174;
                        case 131 -> 7;
                        case 132 -> 133;
                        case 133 -> 163;
                        case 134 -> 45;
                        case 135 -> 207;
                        case 136 -> 148;
                        case 137 -> 208;
                        case 138 -> 229;
                        case 139 -> 72;
                        case 140 -> 168;
                        case 141 -> 130;
                        case 142 -> 78;
                        case 143 -> 52;
                        case 144 -> 129;
                        case 145 -> 142;
                        case 146 -> 55;
                        case 147 -> 213;
                        case 148 -> 195;
                        case 149 -> 226;
                        case 150 -> 137;
                        case 151 -> 28;
                        case 152 -> 200;
                        case 153 -> 112;
                        case 154 -> 169;
                        case 155 -> 57;
                        case 156 -> 139;
                        case 157 -> 99;
                        case 158 -> 242;
                        case 159 -> 254;
                        case 160 -> 178;
                        case 161 -> 244;
                        case 162 -> 27;
                        case 163 -> 91;
                        case 164 -> 210;
                        case 165 -> 16;
                        case 166 -> 128;
                        case 167 -> 172;
                        case 168 -> 161;
                        case 169 -> 138;
                        case 170 -> 23;
                        case 171 -> 143;
                        case 172 -> 13;
                        case 173 -> 122;
                        case 174 -> 147;
                        case 175 -> 19;
                        case 176 -> 167;
                        case 177 -> 176;
                        case 178 -> 62;
                        case 179 -> 29;
                        case 180 -> 82;
                        case 181 -> 71;
                        case 182 -> 70;
                        case 183 -> 39;
                        case 184 -> 60;
                        case 185 -> 37;
                        case 186 -> 44;
                        case 187 -> 215;
                        case 188 -> 81;
                        case 189 -> 17;
                        case 190 -> 2;
                        case 191 -> 135;
                        case 192 -> 158;
                        case 193 -> 154;
                        case 194 -> 113;
                        case 195 -> 124;
                        case 196 -> 236;
                        case 197 -> 209;
                        case 198 -> 108;
                        case 199 -> 117;
                        case 200 -> 201;
                        case 201 -> 123;
                        case 202 -> 59;
                        case 203 -> 240;
                        case 204 -> 216;
                        case 205 -> 106;
                        case 206 -> 92;
                        case 207 -> 87;
                        case 208 -> 171;
                        case 209 -> 228;
                        case 210 -> 188;
                        case 211 -> 184;
                        case 212 -> 225;
                        case 213 -> 104;
                        case 214 -> 30;
                        case 215 -> 248;
                        case 216 -> 155;
                        case 217 -> 4;
                        case 218 -> 222;
                        case 219 -> 205;
                        case 220 -> 33;
                        case 221 -> 88;
                        case 222 -> 93;
                        case 223 -> 115;
                        case 224 -> 114;
                        case 225 -> 198;
                        case 226 -> 63;
                        case 227 -> 186;
                        case 228 -> 159;
                        case 229 -> 20;
                        case 230 -> 36;
                        case 231 -> 102;
                        case 232 -> 221;
                        case 233 -> 204;
                        case 234 -> 151;
                        case 235 -> 95;
                        case 236 -> 131;
                        case 237 -> 175;
                        case 238 -> 162;
                        case 239 -> 247;
                        case 240 -> 58;
                        case 241 -> 43;
                        case 242 -> 193;
                        case 243 -> 67;
                        case 244 -> 232;
                        case 245 -> 190;
                        case 246 -> 120;
                        case 247 -> 152;
                        case 248 -> 164;
                        case 249 -> 118;
                        case 250 -> 1;
                        case 251 -> 234;
                        case 252 -> 165;
                        case 253 -> 246;
                        case 254 -> 121;
                        default -> 141;
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
                  short var10004 = 19207;
                  short var10005 = 29361;
                  var10005 = 19206;
                  short var10006 = -357;
               }

               public final Float a() {
      Object receiver = null; // PX-FIX
                  return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver)
                     .e(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: { // PX-FIX
                  String[] var5x = new String[2];
                  int var3x = 0;
                  String var2 = "û\b\u008fk´\u008b:Z\u009b\u0013\u0084EAj\u008dÖ\f\u0093N\u0082£\u0015\u0092\u000ey\u001dwTÉ";
                  int var4x = "û\b\u008fk´\u008b:Z\u009b\u0013\u0084EAj\u008dÖ\f\u0093N\u0082£\u0015\u0092\u000ey\u001dwTÉ".length();
                  char var1x = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 60;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 60;
                           var10006 = var6;
                        } else {
                           var13 = 60;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 60;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 119;
                              case 1 -> 109;
                              case 2 -> 31;
                              case 3 -> 84;
                              case 4 -> 79;
                              case 5 -> 107;
                              default -> 44;
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
                  int var2 = (var0 ^ 19206) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4x = switch (var3[0] & 0xFF) {
                        case 0 -> 210;
                        case 1 -> 216;
                        case 2 -> 138;
                        case 3 -> 4;
                        case 4 -> 33;
                        case 5 -> 103;
                        case 6 -> 53;
                        case 7 -> 56;
                        case 8 -> 28;
                        case 9 -> 78;
                        case 10 -> 27;
                        case 11 -> 154;
                        case 12 -> 7;
                        case 13 -> 134;
                        case 14 -> 61;
                        case 15 -> 114;
                        case 16 -> 80;
                        case 17 -> 200;
                        case 18 -> 122;
                        case 19 -> 12;
                        case 20 -> 151;
                        case 21 -> 102;
                        case 22 -> 62;
                        case 23 -> 150;
                        case 24 -> 60;
                        case 25 -> 211;
                        case 26 -> 59;
                        case 27 -> 118;
                        case 28 -> 9;
                        case 29 -> 51;
                        case 30 -> 66;
                        case 31 -> 207;
                        case 32 -> 54;
                        case 33 -> 126;
                        case 34 -> 157;
                        case 35 -> 50;
                        case 36 -> 175;
                        case 37 -> 23;
                        case 38 -> 233;
                        case 39 -> 184;
                        case 40 -> 218;
                        case 41 -> 247;
                        case 42 -> 212;
                        case 43 -> 194;
                        case 44 -> 178;
                        case 45 -> 0;
                        case 46 -> 16;
                        case 47 -> 52;
                        case 48 -> 215;
                        case 49 -> 226;
                        case 50 -> 217;
                        case 51 -> 90;
                        case 52 -> 105;
                        case 53 -> 209;
                        case 54 -> 65;
                        case 55 -> 21;
                        case 56 -> 104;
                        case 57 -> 174;
                        case 58 -> 101;
                        case 59 -> 132;
                        case 60 -> 117;
                        case 61 -> 17;
                        case 62 -> 128;
                        case 63 -> 96;
                        case 64 -> 36;
                        case 65 -> 67;
                        case 66 -> 196;
                        case 67 -> 14;
                        case 68 -> 239;
                        case 69 -> 24;
                        case 70 -> 197;
                        case 71 -> 45;
                        case 72 -> 106;
                        case 73 -> 208;
                        case 74 -> 92;
                        case 75 -> 69;
                        case 76 -> 79;
                        case 77 -> 229;
                        case 78 -> 249;
                        case 79 -> 131;
                        case 80 -> 255;
                        case 81 -> 135;
                        case 82 -> 155;
                        case 83 -> 144;
                        case 84 -> 166;
                        case 85 -> 241;
                        case 86 -> 133;
                        case 87 -> 219;
                        case 88 -> 165;
                        case 89 -> 180;
                        case 90 -> 74;
                        case 91 -> 19;
                        case 92 -> 124;
                        case 93 -> 30;
                        case 94 -> 254;
                        case 95 -> 93;
                        case 96 -> 55;
                        case 97 -> 13;
                        case 98 -> 26;
                        case 99 -> 172;
                        case 100 -> 83;
                        case 101 -> 94;
                        case 102 -> 191;
                        case 103 -> 71;
                        case 104 -> 130;
                        case 105 -> 199;
                        case 106 -> 253;
                        case 107 -> 91;
                        case 108 -> 18;
                        case 109 -> 136;
                        case 110 -> 182;
                        case 111 -> 57;
                        case 112 -> 235;
                        case 113 -> 87;
                        case 114 -> 31;
                        case 115 -> 234;
                        case 116 -> 231;
                        case 117 -> 82;
                        case 118 -> 214;
                        case 119 -> 3;
                        case 120 -> 119;
                        case 121 -> 250;
                        case 122 -> 77;
                        case 123 -> 6;
                        case 124 -> 1;
                        case 125 -> 120;
                        case 126 -> 185;
                        case 127 -> 206;
                        case 128 -> 43;
                        case 129 -> 29;
                        case 130 -> 41;
                        case 131 -> 5;
                        case 132 -> 100;
                        case 133 -> 183;
                        case 134 -> 161;
                        case 135 -> 2;
                        case 136 -> 44;
                        case 137 -> 15;
                        case 138 -> 243;
                        case 139 -> 168;
                        case 140 -> 110;
                        case 141 -> 195;
                        case 142 -> 63;
                        case 143 -> 205;
                        case 144 -> 99;
                        case 145 -> 169;
                        case 146 -> 145;
                        case 147 -> 221;
                        case 148 -> 34;
                        case 149 -> 248;
                        case 150 -> 237;
                        case 151 -> 109;
                        case 152 -> 108;
                        case 153 -> 147;
                        case 154 -> 40;
                        case 155 -> 38;
                        case 156 -> 98;
                        case 157 -> 192;
                        case 158 -> 156;
                        case 159 -> 47;
                        case 160 -> 88;
                        case 161 -> 236;
                        case 162 -> 64;
                        case 163 -> 213;
                        case 164 -> 149;
                        case 165 -> 190;
                        case 166 -> 39;
                        case 167 -> 58;
                        case 168 -> 162;
                        case 169 -> 70;
                        case 170 -> 97;
                        case 171 -> 32;
                        case 172 -> 37;
                        case 173 -> 143;
                        case 174 -> 164;
                        case 175 -> 68;
                        case 176 -> 198;
                        case 177 -> 113;
                        case 178 -> 95;
                        case 179 -> 142;
                        case 180 -> 181;
                        case 181 -> 46;
                        case 182 -> 230;
                        case 183 -> 115;
                        case 184 -> 220;
                        case 185 -> 177;
                        case 186 -> 224;
                        case 187 -> 148;
                        case 188 -> 140;
                        case 189 -> 84;
                        case 190 -> 11;
                        case 191 -> 228;
                        case 192 -> 125;
                        case 193 -> 193;
                        case 194 -> 201;
                        case 195 -> 222;
                        case 196 -> 8;
                        case 197 -> 242;
                        case 198 -> 173;
                        case 199 -> 225;
                        case 200 -> 48;
                        case 201 -> 232;
                        case 202 -> 141;
                        case 203 -> 163;
                        case 204 -> 202;
                        case 205 -> 89;
                        case 206 -> 81;
                        case 207 -> 146;
                        case 208 -> 204;
                        case 209 -> 159;
                        case 210 -> 72;
                        case 211 -> 240;
                        case 212 -> 123;
                        case 213 -> 25;
                        case 214 -> 116;
                        case 215 -> 42;
                        case 216 -> 244;
                        case 217 -> 137;
                        case 218 -> 245;
                        case 219 -> 75;
                        case 220 -> 223;
                        case 221 -> 112;
                        case 222 -> 171;
                        case 223 -> 227;
                        case 224 -> 10;
                        case 225 -> 189;
                        case 226 -> 186;
                        case 227 -> 49;
                        case 228 -> 111;
                        case 229 -> 76;
                        case 230 -> 139;
                        case 231 -> 203;
                        case 232 -> 187;
                        case 233 -> 121;
                        case 234 -> 246;
                        case 235 -> 20;
                        case 236 -> 170;
                        case 237 -> 238;
                        case 238 -> 129;
                        case 239 -> 152;
                        case 240 -> 85;
                        case 241 -> 167;
                        case 242 -> 153;
                        case 243 -> 86;
                        case 244 -> 179;
                        case 245 -> 22;
                        case 246 -> 176;
                        case 247 -> 73;
                        case 248 -> 158;
                        case 249 -> 251;
                        case 250 -> 252;
                        case 251 -> 107;
                        case 252 -> 160;
                        case 253 -> 127;
                        case 254 -> 188;
                        default -> 35;
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
         0L,
         0L,
         0L,
         false,
         1920,
         null
      );
   }

   @Override
   public void s() {
      short var10000 = 5518;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      short var10001 = 728;
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
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.4F),
         var3
      );
      float var6 = this.l() * var5;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(this.j(), this.k(), var6, this.d(), var4.a(0.1F * var5), var3);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         this.b(),
         this.j() + 15.0F,
         this.k() + 14.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.c(),
         this.j() + 15.0F,
         this.k() + 36.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         false);
      long var7 = this.a() - (System.currentTimeMillis() - this.h());
      String var10 = "%.1fs";
      Object[] var11 = new Object[]{(float)var7 / 1000.0F};
      String var13 = String.format(var10, Arrays.copyOf(var11, var11.length));
      short var10002 = 5517;
      short var10003 = 21650;
      Intrinsics.checkNotNullExpressionValue(var13, "format(...)");
      String var9 = var13;
      float var12 = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var9, false, 2, null);
      ((lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll)null).b(
         String.valueOf(lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII),
         Double.parseDouble(var9),
         this.j() + this.l() - var12 - 15.0F,
         this.k() + this.d() - 16.0F,
         me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         false);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "f¢(Wa\u0004³ëh\b\u0005\u001d¼\u0093\u008fA";
      int var4 = "f¢(Wa\u0004³ëh\b\u0005\u001d¼\u0093\u008fA".length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 32;
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
                     case 0 -> 18;
                     case 1 -> 55;
                     case 2 -> 50;
                     case 3 -> 76;
                     case 4 -> 98;
                     case 5 -> 86;
                     default -> 61;
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

                  var2 = "Þ°XxYO\u0014Î:G\u0004\u0005\tnôd\u000e";
                  var4 = "Þ°XxYO\u0014Î:G\u0004\u0005\tnôd\u000e".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 67;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 5518) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 129;
            case 1 -> 218;
            case 2 -> 146;
            case 3 -> 244;
            case 4 -> 180;
            case 5 -> 111;
            case 6 -> 2;
            case 7 -> 35;
            case 8 -> 90;
            case 9 -> 88;
            case 10 -> 84;
            case 11 -> 113;
            case 12 -> 36;
            case 13 -> 255;
            case 14 -> 243;
            case 15 -> 78;
            case 16 -> 50;
            case 17 -> 151;
            case 18 -> 219;
            case 19 -> 150;
            case 20 -> 239;
            case 21 -> 29;
            case 22 -> 34;
            case 23 -> 222;
            case 24 -> 60;
            case 25 -> 77;
            case 26 -> 115;
            case 27 -> 189;
            case 28 -> 122;
            case 29 -> 172;
            case 30 -> 15;
            case 31 -> 221;
            case 32 -> 69;
            case 33 -> 223;
            case 34 -> 252;
            case 35 -> 137;
            case 36 -> 130;
            case 37 -> 114;
            case 38 -> 106;
            case 39 -> 131;
            case 40 -> 135;
            case 41 -> 144;
            case 42 -> 24;
            case 43 -> 163;
            case 44 -> 167;
            case 45 -> 73;
            case 46 -> 89;
            case 47 -> 138;
            case 48 -> 87;
            case 49 -> 154;
            case 50 -> 190;
            case 51 -> 85;
            case 52 -> 76;
            case 53 -> 25;
            case 54 -> 91;
            case 55 -> 199;
            case 56 -> 93;
            case 57 -> 142;
            case 58 -> 98;
            case 59 -> 211;
            case 60 -> 14;
            case 61 -> 177;
            case 62 -> 3;
            case 63 -> 128;
            case 64 -> 86;
            case 65 -> 147;
            case 66 -> 227;
            case 67 -> 209;
            case 68 -> 70;
            case 69 -> 170;
            case 70 -> 173;
            case 71 -> 39;
            case 72 -> 188;
            case 73 -> 53;
            case 74 -> 197;
            case 75 -> 204;
            case 76 -> 66;
            case 77 -> 194;
            case 78 -> 61;
            case 79 -> 139;
            case 80 -> 21;
            case 81 -> 102;
            case 82 -> 18;
            case 83 -> 145;
            case 84 -> 103;
            case 85 -> 99;
            case 86 -> 159;
            case 87 -> 44;
            case 88 -> 22;
            case 89 -> 132;
            case 90 -> 4;
            case 91 -> 40;
            case 92 -> 254;
            case 93 -> 118;
            case 94 -> 192;
            case 95 -> 174;
            case 96 -> 214;
            case 97 -> 231;
            case 98 -> 49;
            case 99 -> 133;
            case 100 -> 82;
            case 101 -> 64;
            case 102 -> 94;
            case 103 -> 220;
            case 104 -> 200;
            case 105 -> 20;
            case 106 -> 193;
            case 107 -> 196;
            case 108 -> 37;
            case 109 -> 65;
            case 110 -> 176;
            case 111 -> 250;
            case 112 -> 241;
            case 113 -> 30;
            case 114 -> 7;
            case 115 -> 249;
            case 116 -> 81;
            case 117 -> 27;
            case 118 -> 161;
            case 119 -> 232;
            case 120 -> 182;
            case 121 -> 32;
            case 122 -> 164;
            case 123 -> 123;
            case 124 -> 83;
            case 125 -> 67;
            case 126 -> 26;
            case 127 -> 47;
            case 128 -> 178;
            case 129 -> 242;
            case 130 -> 229;
            case 131 -> 253;
            case 132 -> 6;
            case 133 -> 107;
            case 134 -> 100;
            case 135 -> 248;
            case 136 -> 216;
            case 137 -> 236;
            case 138 -> 171;
            case 139 -> 191;
            case 140 -> 54;
            case 141 -> 136;
            case 142 -> 206;
            case 143 -> 169;
            case 144 -> 109;
            case 145 -> 119;
            case 146 -> 38;
            case 147 -> 46;
            case 148 -> 10;
            case 149 -> 246;
            case 150 -> 156;
            case 151 -> 19;
            case 152 -> 11;
            case 153 -> 5;
            case 154 -> 63;
            case 155 -> 148;
            case 156 -> 215;
            case 157 -> 198;
            case 158 -> 57;
            case 159 -> 68;
            case 160 -> 43;
            case 161 -> 201;
            case 162 -> 127;
            case 163 -> 224;
            case 164 -> 105;
            case 165 -> 208;
            case 166 -> 155;
            case 167 -> 226;
            case 168 -> 12;
            case 169 -> 41;
            case 170 -> 240;
            case 171 -> 251;
            case 172 -> 42;
            case 173 -> 79;
            case 174 -> 238;
            case 175 -> 153;
            case 176 -> 234;
            case 177 -> 72;
            case 178 -> 125;
            case 179 -> 45;
            case 180 -> 152;
            case 181 -> 213;
            case 182 -> 140;
            case 183 -> 141;
            case 184 -> 56;
            case 185 -> 237;
            case 186 -> 96;
            case 187 -> 158;
            case 188 -> 17;
            case 189 -> 28;
            case 190 -> 228;
            case 191 -> 230;
            case 192 -> 203;
            case 193 -> 58;
            case 194 -> 181;
            case 195 -> 74;
            case 196 -> 1;
            case 197 -> 117;
            case 198 -> 59;
            case 199 -> 160;
            case 200 -> 179;
            case 201 -> 134;
            case 202 -> 217;
            case 203 -> 48;
            case 204 -> 80;
            case 205 -> 207;
            case 206 -> 51;
            case 207 -> 162;
            case 208 -> 166;
            case 209 -> 31;
            case 210 -> 245;
            case 211 -> 143;
            case 212 -> 247;
            case 213 -> 202;
            case 214 -> 13;
            case 215 -> 126;
            case 216 -> 183;
            case 217 -> 233;
            case 218 -> 168;
            case 219 -> 187;
            case 220 -> 62;
            case 221 -> 71;
            case 222 -> 101;
            case 223 -> 9;
            case 224 -> 175;
            case 225 -> 55;
            case 226 -> 8;
            case 227 -> 157;
            case 228 -> 75;
            case 229 -> 120;
            case 230 -> 195;
            case 231 -> 97;
            case 232 -> 16;
            case 233 -> 116;
            case 234 -> 225;
            case 235 -> 110;
            case 236 -> 184;
            case 237 -> 185;
            case 238 -> 0;
            case 239 -> 165;
            case 240 -> 23;
            case 241 -> 112;
            case 242 -> 210;
            case 243 -> 104;
            case 244 -> 186;
            case 245 -> 33;
            case 246 -> 235;
            case 247 -> 108;
            case 248 -> 149;
            case 249 -> 121;
            case 250 -> 95;
            case 251 -> 212;
            case 252 -> 205;
            case 253 -> 124;
            case 254 -> 52;
            default -> 92;
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
