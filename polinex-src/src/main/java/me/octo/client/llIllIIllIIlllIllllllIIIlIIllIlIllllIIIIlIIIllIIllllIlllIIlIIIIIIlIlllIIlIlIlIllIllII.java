package me.octo.client;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class llIllIIllIIlllIllllllIIIlIIllIlIllllIIIIlIIIllIIllllIlllIIlIIIIIIlIlllIIlIlIlIllIllII {
   @NotNull
   public static llIllIIllIIlllIllllllIIIlIIllIlIllllIIIIlIIIllIIllllIlllIIlIIIIIIlIlllIIlIlIlIllIllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Lazy lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private llIllIIllIIlllIllllllIIIlIIllIlIllllIIIIlIIIllIIllllIlllIIlIIIIIIlIlllIIlIlIlIllIllII() {
   }

   @NotNull
   public final lIIIlIllIllIIIllIIIlIlllllllIlIlllIIlIIllIIIIlIIlIllllllllllIllIlIlIIlllIlIIIIIllIlII a() {
      Lazy var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return (lIIIlIllIllIIIllIIIlIlllllllIlIlllIIlIIllIIIIlIIlIllllllllllIllIlIlIIlllIlIIIIIllIlII)var1.getValue();
   }

   @NotNull
   public final String b() {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      lIIIlIllIllIIIllIIIlIlllllllIlIlllIIlIIllIIIIlIIlIllllllllllIllIlIlIIlllIlIIIIIllIlII var2 = this.a();
      String var1 = var10000;
      boolean var3 = var2 instanceof lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI;
      if (var1 != null) {
         if (var3) {
            short var8 = -32214;
            short var11 = -6011;
            return "Windows SMTC";
         }

         var3 = var2 instanceof lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII;
      }

      if (var1 != null) {
         if (var3) {
            short var7 = -32212;
            short var10 = 14479;
            return "Spotify (macOS)";
         }

         var3 = var2 instanceof lIIlllllIlllllIllIlllllIIlIIIIlllIIIllIllIIIIllIlIlIlllllIllIIllIlIlIlllllIlIIlIllllI;
      }

      if (var3) {
         short var4 = -32213;
         short var10001 = 4114;
         var10000 = "playerctl (MPRIS)";
      } else {
         short var6 = -32209;
         short var9 = -4281;
         var10000 = "Unknown";
      }

      return var10000;
   }

   private static final lIIIlIllIllIIIllIIIlIlllllllIlIlllIIlIIllIIIIlIIlIllllllllllIllIlIlIIlllIlIIIIIllIlII c() {
      String var10000 = llIIIIlllIIIlIIIIIlIlIIllIlIlllIIlIIIIIIIIIlIlllIlIIIIlllIllIllIIIlllIllIIIIIlIlllIll.u();
      short var10001 = -32216;
      short var10002 = 17839;
      String var7 = System.getProperty("os.name");
      short var10003 = -32224;
      short var10004 = 1839;
      Intrinsics.checkNotNullExpressionValue(var7, "getProperty(...)");
      String var8 = var7.toLowerCase(Locale.ROOT);
      var10003 = -32223;
      var10004 = -6485;
      Intrinsics.checkNotNullExpressionValue(var8, "toLowerCase(...)");
      String var1 = var8;
      String var0 = var10000;
      CharSequence var2 = var1;
      var10001 = -32210;
      var10002 = -29751;
      boolean var3 = StringsKt.contains(var2, "win", false);
      if (var0 != null) {
         if (var3) {
            return lIIIIlIIllIIIllllllIlIlIllllllllllllIlllIIlIllIIllIIlllIlIIIIIlllIlIIllIlIIlIIlllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         CharSequence var4 = var1;
         var10001 = -32215;
         var10002 = 10985;
         var3 = StringsKt.contains(var4, "mac", false);
      }

      if (var0 != null) {
         if (var3) {
            return lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         CharSequence var5 = var1;
         var10001 = -32211;
         var10002 = -2465;
         var3 = StringsKt.contains(var5, "darwin", false);
      }

      return !var3
         ? lIIlllllIlllllIllIlllllIIlIIIIlllIIIllIllIIIIllIlIlIlllllIllIIllIlIlIlllllIlIIlIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         : lIllIllIlIlIIllIIllIIIIlIllllIlIllIIllIlIIIlIIllIIIIIIlIlIlIIIlIIlIIIIIIlIIlIlIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "J\u0081äÒ-D#\u0003\"Òæ\f\u0092\u000e\u0080pçA£Å\u0014Ð~\u0086\u0011ÎéÇ4ëryRb\u0091\u0014`/\u0014¢ç\u001c\u000fÄcÏ÷)²¶\u0088\u0086Y\r³s\u0084µ\u0006õf%gÊË\u0003H©ÿ\u0007Lâ\u001c\u0000Ñ\u0004x";
      int var4 = "J\u0081äÒ-D#\u0003\"Òæ\f\u0092\u000e\u0080pçA£Å\u0014Ð~\u0086\u0011ÎéÇ4ëryRb\u0091\u0014`/\u0014¢ç\u001c\u000fÄcÏ÷)²¶\u0088\u0086Y\r³s\u0084µ\u0006õf%gÊË\u0003H©ÿ\u0007Lâ\u001c\u0000Ñ\u0004x"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 55;
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
                     case 0 -> 44;
                     case 1 -> 17;
                     case 2 -> 85;
                     case 3 -> 98;
                     case 4 -> 64;
                     case 5 -> 77;
                     default -> 119;
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
                     b = new String[10];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIllIIllIIlllIllllllIIIlIIllIlIllllIIIIlIIIllIIllllIlllIIlIIIIIIlIlllIIlIlIlIllIllII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = LazyKt.lazy(
                        llIllIIllIIlllIllllllIIIlIIllIlIllllIIIIlIIIllIIllllIlllIIlIIIIIIlIlllIIlIlIlIllIllII::c
                     );
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Û\u008cdxÞ\u000bØ3Ø;.o\u008c¡á9\u0010¶Õ\u0080'x2«yç\u0097¤\u001dBï8ð";
                  var4 = "Û\u008cdxÞ\u000bØ3Ø;.o\u008c¡á9\u0010¶Õ\u0080'x2«yç\u0097¤\u001dBï8ð".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32216) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 124;
            case 1 -> 107;
            case 2 -> 41;
            case 3 -> 32;
            case 4 -> 15;
            case 5 -> 183;
            case 6 -> 244;
            case 7 -> 175;
            case 8 -> 4;
            case 9 -> 128;
            case 10 -> 159;
            case 11 -> 196;
            case 12 -> 25;
            case 13 -> 20;
            case 14 -> 26;
            case 15 -> 207;
            case 16 -> 143;
            case 17 -> 139;
            case 18 -> 120;
            case 19 -> 247;
            case 20 -> 162;
            case 21 -> 136;
            case 22 -> 13;
            case 23 -> 177;
            case 24 -> 235;
            case 25 -> 110;
            case 26 -> 75;
            case 27 -> 229;
            case 28 -> 126;
            case 29 -> 111;
            case 30 -> 123;
            case 31 -> 174;
            case 32 -> 240;
            case 33 -> 224;
            case 34 -> 217;
            case 35 -> 6;
            case 36 -> 251;
            case 37 -> 208;
            case 38 -> 103;
            case 39 -> 104;
            case 40 -> 255;
            case 41 -> 169;
            case 42 -> 182;
            case 43 -> 2;
            case 44 -> 191;
            case 45 -> 184;
            case 46 -> 33;
            case 47 -> 201;
            case 48 -> 92;
            case 49 -> 16;
            case 50 -> 242;
            case 51 -> 65;
            case 52 -> 114;
            case 53 -> 172;
            case 54 -> 161;
            case 55 -> 76;
            case 56 -> 219;
            case 57 -> 149;
            case 58 -> 57;
            case 59 -> 227;
            case 60 -> 0;
            case 61 -> 94;
            case 62 -> 49;
            case 63 -> 153;
            case 64 -> 96;
            case 65 -> 198;
            case 66 -> 249;
            case 67 -> 253;
            case 68 -> 115;
            case 69 -> 187;
            case 70 -> 254;
            case 71 -> 1;
            case 72 -> 71;
            case 73 -> 59;
            case 74 -> 147;
            case 75 -> 22;
            case 76 -> 80;
            case 77 -> 176;
            case 78 -> 205;
            case 79 -> 245;
            case 80 -> 209;
            case 81 -> 113;
            case 82 -> 70;
            case 83 -> 165;
            case 84 -> 130;
            case 85 -> 51;
            case 86 -> 14;
            case 87 -> 69;
            case 88 -> 211;
            case 89 -> 241;
            case 90 -> 231;
            case 91 -> 146;
            case 92 -> 160;
            case 93 -> 78;
            case 94 -> 132;
            case 95 -> 116;
            case 96 -> 68;
            case 97 -> 8;
            case 98 -> 173;
            case 99 -> 106;
            case 100 -> 83;
            case 101 -> 121;
            case 102 -> 127;
            case 103 -> 135;
            case 104 -> 218;
            case 105 -> 170;
            case 106 -> 50;
            case 107 -> 48;
            case 108 -> 53;
            case 109 -> 90;
            case 110 -> 179;
            case 111 -> 189;
            case 112 -> 17;
            case 113 -> 60;
            case 114 -> 168;
            case 115 -> 220;
            case 116 -> 156;
            case 117 -> 12;
            case 118 -> 98;
            case 119 -> 233;
            case 120 -> 180;
            case 121 -> 40;
            case 122 -> 154;
            case 123 -> 24;
            case 124 -> 141;
            case 125 -> 137;
            case 126 -> 47;
            case 127 -> 197;
            case 128 -> 188;
            case 129 -> 134;
            case 130 -> 99;
            case 131 -> 119;
            case 132 -> 226;
            case 133 -> 228;
            case 134 -> 11;
            case 135 -> 93;
            case 136 -> 89;
            case 137 -> 167;
            case 138 -> 155;
            case 139 -> 144;
            case 140 -> 248;
            case 141 -> 222;
            case 142 -> 79;
            case 143 -> 186;
            case 144 -> 105;
            case 145 -> 5;
            case 146 -> 152;
            case 147 -> 194;
            case 148 -> 204;
            case 149 -> 84;
            case 150 -> 164;
            case 151 -> 237;
            case 152 -> 43;
            case 153 -> 101;
            case 154 -> 62;
            case 155 -> 131;
            case 156 -> 56;
            case 157 -> 178;
            case 158 -> 64;
            case 159 -> 125;
            case 160 -> 118;
            case 161 -> 145;
            case 162 -> 97;
            case 163 -> 151;
            case 164 -> 10;
            case 165 -> 74;
            case 166 -> 72;
            case 167 -> 133;
            case 168 -> 232;
            case 169 -> 44;
            case 170 -> 214;
            case 171 -> 158;
            case 172 -> 100;
            case 173 -> 87;
            case 174 -> 23;
            case 175 -> 225;
            case 176 -> 181;
            case 177 -> 58;
            case 178 -> 195;
            case 179 -> 215;
            case 180 -> 27;
            case 181 -> 7;
            case 182 -> 55;
            case 183 -> 82;
            case 184 -> 250;
            case 185 -> 112;
            case 186 -> 9;
            case 187 -> 234;
            case 188 -> 29;
            case 189 -> 81;
            case 190 -> 142;
            case 191 -> 216;
            case 192 -> 85;
            case 193 -> 246;
            case 194 -> 31;
            case 195 -> 52;
            case 196 -> 67;
            case 197 -> 30;
            case 198 -> 122;
            case 199 -> 148;
            case 200 -> 212;
            case 201 -> 236;
            case 202 -> 206;
            case 203 -> 243;
            case 204 -> 190;
            case 205 -> 37;
            case 206 -> 163;
            case 207 -> 77;
            case 208 -> 117;
            case 209 -> 193;
            case 210 -> 230;
            case 211 -> 35;
            case 212 -> 86;
            case 213 -> 109;
            case 214 -> 46;
            case 215 -> 199;
            case 216 -> 252;
            case 217 -> 28;
            case 218 -> 108;
            case 219 -> 138;
            case 220 -> 36;
            case 221 -> 185;
            case 222 -> 42;
            case 223 -> 3;
            case 224 -> 102;
            case 225 -> 221;
            case 226 -> 19;
            case 227 -> 150;
            case 228 -> 38;
            case 229 -> 129;
            case 230 -> 202;
            case 231 -> 210;
            case 232 -> 166;
            case 233 -> 63;
            case 234 -> 238;
            case 235 -> 239;
            case 236 -> 39;
            case 237 -> 192;
            case 238 -> 213;
            case 239 -> 200;
            case 240 -> 45;
            case 241 -> 61;
            case 242 -> 203;
            case 243 -> 54;
            case 244 -> 140;
            case 245 -> 73;
            case 246 -> 157;
            case 247 -> 91;
            case 248 -> 18;
            case 249 -> 66;
            case 250 -> 88;
            case 251 -> 223;
            case 252 -> 95;
            case 253 -> 34;
            case 254 -> 171;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}
