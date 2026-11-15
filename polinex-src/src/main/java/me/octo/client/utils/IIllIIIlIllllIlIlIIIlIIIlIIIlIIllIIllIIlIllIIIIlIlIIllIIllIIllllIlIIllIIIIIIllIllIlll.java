package me.octo.client.utils;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Pattern IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Regex lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static Regex IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static Regex llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] c;
   private static String[] d;

   private IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll() {
   }

   @NotNull
   public final String a(@NotNull String var1) {
      short var10001 = -16957;
      short var10002 = -10330;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      String var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.matcher(var1).replaceAll("");
      var10002 = -16960;
      short var10003 = 28014;
      Intrinsics.checkNotNullExpressionValue(var10000, "replaceAll(...)");
      return var10000;
   }

   public final int b(@NotNull String var1) {
      String var2;
      int var10;
      label79: {
         String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         short var10002 = -16956;
         short var10003 = -22449;
         Intrinsics.checkNotNullParameter(var1, "input");
         var2 = var10000;
         if (var2 == null) {
            MatchResult var6 = (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll).find( var1, 0);
            label75:
            if (var6 != null) {
               Object var7 = var6.getGroupValues();
               if (var2 == null) {
                  if (var7 == null) {
                     break label75;
                  }

                  var7 = ((me.octo.client.PXDyn)var7).get(1);
               }

               String var8 = (String)var7;
               if ((String)var7 != null) {
                  Integer var9 = StringsKt.toIntOrNull(var8);
                  if (var9 != null) {
                     var10 = var9;
                     break label79;
                  }
               }
            }
         }

         var10 = 0;
      }

      int var3;
      label65: {
         var3 = var10;
         if (var2 == null) {
            MatchResult var11 = (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII).find( var1, 0);
            label61:
            if (var11 != null) {
               Object var12 = var11.getGroupValues();
               if (var2 == null) {
                  if (var12 == null) {
                     break label61;
                  }

                  var12 = ((me.octo.client.PXDyn)var12).get(1);
               }

               String var13 = (String)var12;
               if ((String)var12 != null) {
                  Integer var14 = StringsKt.toIntOrNull(var13);
                  if (var14 != null) {
                     var10 = var14;
                     break label65;
                  }
               }
            }
         }

         var10 = 0;
      }

      int var4;
      label51: {
         var4 = var10;
         if (var2 == null) {
            MatchResult var16 = (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI).find( var1, 0);
            label47:
            if (var16 != null) {
               Object var17 = var16.getGroupValues();
               if (var2 == null) {
                  if (var17 == null) {
                     break label47;
                  }

                  var17 = ((me.octo.client.PXDyn)var17).get(1);
               }

               String var18 = (String)var17;
               if ((String)var17 != null) {
                  Integer var19 = StringsKt.toIntOrNull(var18);
                  if (var19 != null) {
                     var10 = var19;
                     break label51;
                  }
               }
            }
         }

         var10 = 0;
      }

      int var5 = var10;
      var10 = var3 * 3600 + var4 * 60 + var5;
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b(
            "WBb6K"
         );
      }

      return var10;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "Ê§ò\u007fÍQ\u001cè\u0097\u008e4zñ¸\u00966$\u0006ÙI¼D\u000fQ\u000f\u0084\u0093\u0088)\u0080\u0004\u0092Ù\u0086jç\f\\î^\u0011 W¿ad\u0092)\u00901\u0081à\u009bk\u0084Û±P\u0011\u0002Äë\u0013îÜxY\u001b¸¥¼Ã`Õ-é";
      int var4 = "Ê§ò\u007fÍQ\u001cè\u0097\u008e4zñ¸\u00966$\u0006ÙI¼D\u000fQ\u000f\u0084\u0093\u0088)\u0080\u0004\u0092Ù\u0086jç\f\\î^\u0011 W¿ad\u0092)\u00901\u0081à\u009bk\u0084Û±P\u0011\u0002Äë\u0013îÜxY\u001b¸¥¼Ã`Õ-é"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 93;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var29 = var10001.toCharArray();
               int var10004 = var29.length;
               int var6 = 0;
               byte var32 = (byte)var10000;
               var22 = var29;
               int var15 = var10004;
               byte var40;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var29;
                  var40 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var32 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var44 = var29;
                  var40 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var44[var10006] = (char)(var44[var10006] ^ var40 ^ switch (var6 % 7) {
                     case 0 -> 79;
                     case 1 -> 72;
                     case 2 -> 75;
                     case 3 -> 1;
                     case 4 -> 17;
                     case 5 -> 117;
                     default -> 126;
                  });
                  var6++;
                  if (var32 == 0) {
                     var10006 = var32;
                     var44 = var22;
                     var40 = var32;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var44 = var22;
                     var40 = var32;
                     var10006 = var6;
                  }
               }
            }

            String var34 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var34;
                  if ((var8 += var1) >= var4) {
                     c = var5;
                     d = new String[7];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll();
                     var10000 = -16953;
                     short var17 = -19322;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = Pattern.compile("(?i)§[0-9A-FK-OR]");
                     var10002 = -16954;
                     short var35 = -2417;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Regex("\\b([0-9]{1,2})h\\b");
                     var10002 = -16958;
                     short var36 = -30403;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new Regex("\\b([0-9]{1,2})m\\b");
                     var10002 = -16959;
                     short var37 = -1850;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Regex("\\b([0-9]{1,2})s\\b");
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var34;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "L\u008e½úþ\u008f2ß\u001cBjÍ\t\u0094\u007f\u001dd\u0005ôSÚfû";
                  var4 = "L\u008e½úþ\u008f2ß\u001cBjÍ\t\u0094\u007f\u001dd\u0005ôSÚfû".length();
                  var1 = 17;
                  var8 = -1;
            }

            var10000 = 125;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -16958) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 132;
            case 1 -> 241;
            case 2 -> 11;
            case 3 -> 39;
            case 4 -> 244;
            case 5 -> 133;
            case 6 -> 167;
            case 7 -> 20;
            case 8 -> 77;
            case 9 -> 190;
            case 10 -> 32;
            case 11 -> 82;
            case 12 -> 27;
            case 13 -> 26;
            case 14 -> 239;
            case 15 -> 113;
            case 16 -> 67;
            case 17 -> 41;
            case 18 -> 224;
            case 19 -> 74;
            case 20 -> 194;
            case 21 -> 23;
            case 22 -> 40;
            case 23 -> 83;
            case 24 -> 109;
            case 25 -> 242;
            case 26 -> 94;
            case 27 -> 156;
            case 28 -> 221;
            case 29 -> 181;
            case 30 -> 178;
            case 31 -> 248;
            case 32 -> 243;
            case 33 -> 153;
            case 34 -> 227;
            case 35 -> 25;
            case 36 -> 200;
            case 37 -> 162;
            case 38 -> 46;
            case 39 -> 136;
            case 40 -> 225;
            case 41 -> 102;
            case 42 -> 90;
            case 43 -> 0;
            case 44 -> 33;
            case 45 -> 253;
            case 46 -> 125;
            case 47 -> 191;
            case 48 -> 183;
            case 49 -> 174;
            case 50 -> 235;
            case 51 -> 144;
            case 52 -> 105;
            case 53 -> 188;
            case 54 -> 170;
            case 55 -> 35;
            case 56 -> 146;
            case 57 -> 177;
            case 58 -> 114;
            case 59 -> 130;
            case 60 -> 255;
            case 61 -> 196;
            case 62 -> 139;
            case 63 -> 149;
            case 64 -> 173;
            case 65 -> 220;
            case 66 -> 186;
            case 67 -> 50;
            case 68 -> 53;
            case 69 -> 143;
            case 70 -> 232;
            case 71 -> 14;
            case 72 -> 158;
            case 73 -> 15;
            case 74 -> 249;
            case 75 -> 29;
            case 76 -> 233;
            case 77 -> 131;
            case 78 -> 37;
            case 79 -> 201;
            case 80 -> 199;
            case 81 -> 222;
            case 82 -> 42;
            case 83 -> 55;
            case 84 -> 189;
            case 85 -> 123;
            case 86 -> 88;
            case 87 -> 205;
            case 88 -> 137;
            case 89 -> 56;
            case 90 -> 240;
            case 91 -> 126;
            case 92 -> 13;
            case 93 -> 166;
            case 94 -> 68;
            case 95 -> 99;
            case 96 -> 164;
            case 97 -> 59;
            case 98 -> 87;
            case 99 -> 1;
            case 100 -> 151;
            case 101 -> 198;
            case 102 -> 84;
            case 103 -> 250;
            case 104 -> 66;
            case 105 -> 187;
            case 106 -> 118;
            case 107 -> 12;
            case 108 -> 86;
            case 109 -> 171;
            case 110 -> 231;
            case 111 -> 202;
            case 112 -> 61;
            case 113 -> 184;
            case 114 -> 161;
            case 115 -> 76;
            case 116 -> 64;
            case 117 -> 145;
            case 118 -> 141;
            case 119 -> 95;
            case 120 -> 112;
            case 121 -> 6;
            case 122 -> 237;
            case 123 -> 110;
            case 124 -> 154;
            case 125 -> 127;
            case 126 -> 48;
            case 127 -> 78;
            case 128 -> 117;
            case 129 -> 57;
            case 130 -> 36;
            case 131 -> 157;
            case 132 -> 210;
            case 133 -> 10;
            case 134 -> 207;
            case 135 -> 111;
            case 136 -> 148;
            case 137 -> 251;
            case 138 -> 234;
            case 139 -> 98;
            case 140 -> 18;
            case 141 -> 9;
            case 142 -> 28;
            case 143 -> 120;
            case 144 -> 129;
            case 145 -> 49;
            case 146 -> 5;
            case 147 -> 179;
            case 148 -> 8;
            case 149 -> 52;
            case 150 -> 138;
            case 151 -> 215;
            case 152 -> 209;
            case 153 -> 107;
            case 154 -> 96;
            case 155 -> 89;
            case 156 -> 47;
            case 157 -> 62;
            case 158 -> 226;
            case 159 -> 72;
            case 160 -> 60;
            case 161 -> 169;
            case 162 -> 180;
            case 163 -> 218;
            case 164 -> 254;
            case 165 -> 30;
            case 166 -> 236;
            case 167 -> 101;
            case 168 -> 38;
            case 169 -> 223;
            case 170 -> 104;
            case 171 -> 122;
            case 172 -> 172;
            case 173 -> 92;
            case 174 -> 245;
            case 175 -> 51;
            case 176 -> 128;
            case 177 -> 212;
            case 178 -> 216;
            case 179 -> 21;
            case 180 -> 16;
            case 181 -> 213;
            case 182 -> 75;
            case 183 -> 93;
            case 184 -> 44;
            case 185 -> 163;
            case 186 -> 34;
            case 187 -> 63;
            case 188 -> 182;
            case 189 -> 80;
            case 190 -> 252;
            case 191 -> 85;
            case 192 -> 73;
            case 193 -> 230;
            case 194 -> 97;
            case 195 -> 147;
            case 196 -> 238;
            case 197 -> 103;
            case 198 -> 160;
            case 199 -> 134;
            case 200 -> 22;
            case 201 -> 214;
            case 202 -> 91;
            case 203 -> 175;
            case 204 -> 195;
            case 205 -> 79;
            case 206 -> 155;
            case 207 -> 152;
            case 208 -> 115;
            case 209 -> 70;
            case 210 -> 116;
            case 211 -> 81;
            case 212 -> 204;
            case 213 -> 17;
            case 214 -> 168;
            case 215 -> 54;
            case 216 -> 185;
            case 217 -> 106;
            case 218 -> 19;
            case 219 -> 31;
            case 220 -> 192;
            case 221 -> 124;
            case 222 -> 4;
            case 223 -> 176;
            case 224 -> 65;
            case 225 -> 246;
            case 226 -> 71;
            case 227 -> 217;
            case 228 -> 247;
            case 229 -> 211;
            case 230 -> 121;
            case 231 -> 119;
            case 232 -> 159;
            case 233 -> 229;
            case 234 -> 228;
            case 235 -> 100;
            case 236 -> 197;
            case 237 -> 206;
            case 238 -> 2;
            case 239 -> 142;
            case 240 -> 108;
            case 241 -> 7;
            case 242 -> 208;
            case 243 -> 193;
            case 244 -> 58;
            case 245 -> 69;
            case 246 -> 140;
            case 247 -> 203;
            case 248 -> 24;
            case 249 -> 135;
            case 250 -> 150;
            case 251 -> 43;
            case 252 -> 45;
            case 253 -> 219;
            case 254 -> 3;
            default -> 165;
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
