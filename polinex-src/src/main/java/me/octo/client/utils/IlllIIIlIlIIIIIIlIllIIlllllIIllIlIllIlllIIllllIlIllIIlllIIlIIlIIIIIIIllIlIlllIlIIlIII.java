package me.octo.client.utils;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII {
   private static String[] a;
   private static String[] b;

   /** @deprecated */
   @Deprecated(
      message = "this is illegal for anything polinex related"
   )
   @NotNull
   public static final InputStream a(@NotNull String var0, int var1, boolean var2) {
      short var10001 = -11631;
      short var10002 = 25053;
      Intrinsics.checkNotNullParameter(var0, "url");
      URLConnection var10000;
      try {
         var10000 = new URI(var0).toURL().openConnection();
      }
      catch (java.net.URISyntaxException | java.io.IOException exception) { // MalformedURLException extends IOException
         throw new RuntimeException(exception);
      }
      var10002 = -11628;
      short var10003 = 31057;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.net.HttpURLConnection");
      HttpURLConnection var3 = (HttpURLConnection)var10000;
      var10001 = -11632;
      var10002 = 22220;
      try {
         var3.setRequestMethod("GET");
      }
      catch (java.net.ProtocolException exception) {
         throw new RuntimeException(exception);
      }
      var3.setUseCaches(var2);
      var10001 = -11625;
      var10002 = 3721;
      var10002 = -11626;
      var10003 = -1241;
      var3.addRequestProperty("User-Agent", "Polinex");
      var3.setReadTimeout(var1);
      var3.setConnectTimeout(var1);
      var3.setDoOutput(true);
      InputStream var4;
      try {
         var4 = var3.getInputStream();
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }
      var10002 = -11627;
      var10003 = 31607;
      Intrinsics.checkNotNullExpressionValue(var4, "getInputStream(...)");
      return var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u0092û\f\u0092P|\u0013ÓuU\u0088pre}Ý\r\u0013&?Ëç\u0017&fxF8tj4ª Û\\NoØ\u0091\u0018s\u001e+\u008eCYù)\u0094u\u0084\u0002@#M\u0001h\"%P¶S£{\u0002å·\u001d\f\u007f±bèR\u0089À\u008bA\u0010ø!´Á\nÎ\nâCý+\u009f?\u0089û\u0007\u0001=·!<;\u0093";
      int var4 = "\u0092û\f\u0092P|\u0013ÓuU\u0088pre}Ý\r\u0013&?Ëç\u0017&fxF8tj4ª Û\\NoØ\u0091\u0018s\u001e+\u008eCYù)\u0094u\u0084\u0002@#M\u0001h\"%P¶S£{\u0002å·\u001d\f\u007f±bèR\u0089À\u008bA\u0010ø!´Á\nÎ\nâCý+\u009f?\u0089û\u0007\u0001=·!<;\u0093"
         .length();
      char var1 = 19;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 42;
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
                     case 1 -> 88;
                     case 2 -> 40;
                     case 3 -> 9;
                     case 4 -> 47;
                     case 5 -> 112;
                     default -> 69;
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
                     a = var5;
                     b = new String[6];
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

                  var2 = "k\u008f \u0003\u0004÷\u0001";
                  var4 = "k\u008f \u0003\u0004÷\u0001".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 95;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -11627) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 122;
            case 1 -> 159;
            case 2 -> 144;
            case 3 -> 103;
            case 4 -> 204;
            case 5 -> 223;
            case 6 -> 163;
            case 7 -> 140;
            case 8 -> 27;
            case 9 -> 108;
            case 10 -> 243;
            case 11 -> 54;
            case 12 -> 39;
            case 13 -> 165;
            case 14 -> 254;
            case 15 -> 250;
            case 16 -> 111;
            case 17 -> 172;
            case 18 -> 44;
            case 19 -> 130;
            case 20 -> 75;
            case 21 -> 133;
            case 22 -> 19;
            case 23 -> 224;
            case 24 -> 127;
            case 25 -> 30;
            case 26 -> 195;
            case 27 -> 57;
            case 28 -> 219;
            case 29 -> 151;
            case 30 -> 67;
            case 31 -> 35;
            case 32 -> 8;
            case 33 -> 94;
            case 34 -> 236;
            case 35 -> 120;
            case 36 -> 175;
            case 37 -> 102;
            case 38 -> 125;
            case 39 -> 139;
            case 40 -> 40;
            case 41 -> 255;
            case 42 -> 6;
            case 43 -> 79;
            case 44 -> 211;
            case 45 -> 200;
            case 46 -> 72;
            case 47 -> 117;
            case 48 -> 218;
            case 49 -> 84;
            case 50 -> 59;
            case 51 -> 237;
            case 52 -> 12;
            case 53 -> 174;
            case 54 -> 233;
            case 55 -> 137;
            case 56 -> 80;
            case 57 -> 7;
            case 58 -> 126;
            case 59 -> 214;
            case 60 -> 62;
            case 61 -> 230;
            case 62 -> 74;
            case 63 -> 60;
            case 64 -> 36;
            case 65 -> 83;
            case 66 -> 187;
            case 67 -> 225;
            case 68 -> 88;
            case 69 -> 0;
            case 70 -> 198;
            case 71 -> 55;
            case 72 -> 17;
            case 73 -> 71;
            case 74 -> 173;
            case 75 -> 229;
            case 76 -> 106;
            case 77 -> 217;
            case 78 -> 50;
            case 79 -> 154;
            case 80 -> 82;
            case 81 -> 248;
            case 82 -> 14;
            case 83 -> 252;
            case 84 -> 53;
            case 85 -> 123;
            case 86 -> 190;
            case 87 -> 37;
            case 88 -> 28;
            case 89 -> 93;
            case 90 -> 18;
            case 91 -> 98;
            case 92 -> 147;
            case 93 -> 112;
            case 94 -> 92;
            case 95 -> 48;
            case 96 -> 253;
            case 97 -> 104;
            case 98 -> 228;
            case 99 -> 150;
            case 100 -> 11;
            case 101 -> 132;
            case 102 -> 202;
            case 103 -> 213;
            case 104 -> 206;
            case 105 -> 121;
            case 106 -> 207;
            case 107 -> 155;
            case 108 -> 161;
            case 109 -> 29;
            case 110 -> 193;
            case 111 -> 131;
            case 112 -> 239;
            case 113 -> 180;
            case 114 -> 118;
            case 115 -> 68;
            case 116 -> 183;
            case 117 -> 162;
            case 118 -> 65;
            case 119 -> 220;
            case 120 -> 176;
            case 121 -> 201;
            case 122 -> 4;
            case 123 -> 231;
            case 124 -> 192;
            case 125 -> 25;
            case 126 -> 32;
            case 127 -> 76;
            case 128 -> 16;
            case 129 -> 114;
            case 130 -> 134;
            case 131 -> 41;
            case 132 -> 235;
            case 133 -> 164;
            case 134 -> 91;
            case 135 -> 208;
            case 136 -> 31;
            case 137 -> 196;
            case 138 -> 89;
            case 139 -> 73;
            case 140 -> 38;
            case 141 -> 26;
            case 142 -> 81;
            case 143 -> 143;
            case 144 -> 56;
            case 145 -> 168;
            case 146 -> 10;
            case 147 -> 128;
            case 148 -> 9;
            case 149 -> 85;
            case 150 -> 47;
            case 151 -> 245;
            case 152 -> 101;
            case 153 -> 157;
            case 154 -> 1;
            case 155 -> 205;
            case 156 -> 142;
            case 157 -> 51;
            case 158 -> 182;
            case 159 -> 69;
            case 160 -> 242;
            case 161 -> 227;
            case 162 -> 99;
            case 163 -> 20;
            case 164 -> 34;
            case 165 -> 240;
            case 166 -> 238;
            case 167 -> 22;
            case 168 -> 199;
            case 169 -> 141;
            case 170 -> 158;
            case 171 -> 96;
            case 172 -> 216;
            case 173 -> 191;
            case 174 -> 246;
            case 175 -> 234;
            case 176 -> 171;
            case 177 -> 166;
            case 178 -> 189;
            case 179 -> 45;
            case 180 -> 116;
            case 181 -> 185;
            case 182 -> 247;
            case 183 -> 148;
            case 184 -> 43;
            case 185 -> 107;
            case 186 -> 209;
            case 187 -> 152;
            case 188 -> 109;
            case 189 -> 24;
            case 190 -> 15;
            case 191 -> 90;
            case 192 -> 66;
            case 193 -> 124;
            case 194 -> 145;
            case 195 -> 49;
            case 196 -> 70;
            case 197 -> 160;
            case 198 -> 61;
            case 199 -> 63;
            case 200 -> 87;
            case 201 -> 100;
            case 202 -> 156;
            case 203 -> 179;
            case 204 -> 23;
            case 205 -> 46;
            case 206 -> 2;
            case 207 -> 42;
            case 208 -> 52;
            case 209 -> 146;
            case 210 -> 249;
            case 211 -> 3;
            case 212 -> 210;
            case 213 -> 203;
            case 214 -> 153;
            case 215 -> 113;
            case 216 -> 33;
            case 217 -> 149;
            case 218 -> 86;
            case 219 -> 251;
            case 220 -> 186;
            case 221 -> 232;
            case 222 -> 169;
            case 223 -> 170;
            case 224 -> 138;
            case 225 -> 136;
            case 226 -> 58;
            case 227 -> 215;
            case 228 -> 5;
            case 229 -> 13;
            case 230 -> 197;
            case 231 -> 129;
            case 232 -> 222;
            case 233 -> 77;
            case 234 -> 194;
            case 235 -> 241;
            case 236 -> 105;
            case 237 -> 110;
            case 238 -> 21;
            case 239 -> 244;
            case 240 -> 181;
            case 241 -> 178;
            case 242 -> 221;
            case 243 -> 115;
            case 244 -> 212;
            case 245 -> 177;
            case 246 -> 95;
            case 247 -> 119;
            case 248 -> 184;
            case 249 -> 188;
            case 250 -> 64;
            case 251 -> 97;
            case 252 -> 78;
            case 253 -> 226;
            case 254 -> 167;
            default -> 135;
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

   // PX-FIX synth restored from jar bytecode
  public static java.io.InputStream a(java.lang.String p0, int p1, boolean p2, int p3, java.lang.Object p4) {
      boolean pxguard = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      if (!pxguard) { p1 = 5000; }
      if (!pxguard) { p2 = true; }
      return a(p0, p1, p2);
   }
}
