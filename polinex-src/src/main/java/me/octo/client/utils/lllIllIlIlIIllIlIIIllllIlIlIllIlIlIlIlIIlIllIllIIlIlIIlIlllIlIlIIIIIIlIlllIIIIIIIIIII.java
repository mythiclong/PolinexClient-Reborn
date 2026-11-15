package me.octo.client.utils;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import kotlin.collections.CollectionsKt;
import me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII() {
   }

   @NotNull
   public final BigDecimal g() {
      List var2 = CollectionsKt.asReversed(lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h());
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      String var6 = null; // PX-FIX: the only assignment sits on a path that returns
      for (Iterator var4 = var2.iterator(); var4.hasNext(); var1 = var6) {
         String var5 = (String)var4.next();
         String var7 = var5;
         if (var7.contains("Bank:")) {
            var6 = new Regex("\\s").replace((var7).replace("Bank:", ""), "");
            return this.a((new Regex("\\s").replace((var7).replace("Bank:", ""), "")).replace(",", "").toString());
         }
      }
      if (var1 == null) {
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Failed to get bank balance from tablist");
         return BigDecimal.ZERO;
      }
      throw null;
   }

   @NotNull
   public final BigDecimal h() {
      String var1 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.c();
      if (var1 == null) {
         return BigDecimal.ZERO;
      } else if (IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d() == null) {
         return BigDecimal.ZERO;
      } else {
         for (Iterator var5 = ((Iterable)IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d()).iterator(); var5.hasNext(); ) {
            String var7 = (String)var5.next();
            if (var7.contains("Purse:") || var7.contains("Piggy:")) {
               CharSequence var9 = (CharSequence)((var7).replace("Purse:", "")).replace("Piggy:", "");
               String var12 = (new Regex("\\s").replace(new Regex("\\s").replace(((var7).replace("Purse:", "")).replace("Piggy:", ""), ""), "")).replace(",", "");
               BigDecimal var14;
               try {
                  var14 = new BigDecimal(var12);
                  Intrinsics.checkNotNull(var14);
               } catch (NumberFormatException var10) {
                  var14 = this.a(var12);
                  Intrinsics.checkNotNull(var14);
               }
               return var14;
            }
         }
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Failed to get purse balance from scoreboard");
         return BigDecimal.ZERO;
      }
   }

   @NotNull
   public final BigDecimal a(@NotNull String param1) {
      String var2 = param1.replace(",", "").trim();
      if (var2.length() == 0) {
         return BigDecimal.ZERO;
      } else {
         String var6 = String.valueOf(StringsKt.last((CharSequence)var2)).toUpperCase(Locale.ROOT);
         Pair var5;
         switch (var6.hashCode()) {
            case 66:
               if (!var6.equals("B")) {
                  var5 = TuplesKt.to(BigDecimal.ONE, var2);
                  break;
               }
               var5 = TuplesKt.to(new BigDecimal("1000000000"), StringsKt.dropLast(var2, 1));
               break;
            case 75:
               if (!var6.equals("K")) {
                  var5 = TuplesKt.to(BigDecimal.ONE, var2);
                  break;
               }
               var5 = TuplesKt.to(new BigDecimal("1000"), StringsKt.dropLast(var2, 1));
               break;
            case 77:
               if (!var6.equals("M")) {
                  var5 = TuplesKt.to(BigDecimal.ONE, var2);
                  break;
               }
               var5 = TuplesKt.to(new BigDecimal("1000000"), StringsKt.dropLast(var2, 1));
               break;
            case 84:
               if (!var6.equals("T")) {
                  var5 = TuplesKt.to(BigDecimal.ONE, var2);
                  break;
               }
               var5 = TuplesKt.to(new BigDecimal("1000000000000"), StringsKt.dropLast(var2, 1));
               break;
            default:
               var5 = TuplesKt.to(BigDecimal.ONE, var2);
         }
         BigDecimal var6b = (BigDecimal)var5.component1();
         String var7 = (String)var5.component2();
         BigDecimal var8;
         try {
            var8 = new BigDecimal(var7).multiply(var6b);
            Intrinsics.checkNotNull(var8);
         } catch (NumberFormatException var9) {
            var8 = BigDecimal.ZERO;
            Intrinsics.checkNotNull(var8);
         }
         return var8;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "&,ÛÈôU\u008f\r£ñksâ\"Mñ\t\u0000l\u008fÁ+nÉ\u0012Sê¥£\u009b\u0099\u0091\u009dú\u0006¡ùÃ\u000b\u009b±\u0004\u008avµÚrüÂ§D\u0004u\u009a\u0085ªà\u0094ÇMí\u0086¸7\u008d\nßªä\u0018\u0013Os\\Îµ\u0006Û\u0089~Y´Ð\u0005«½)Ú5'T\u001cUé\u0002ò¾q:ÌéQ\u0088Ô:y?Bífï=w\u0010\u008bM\u0014\u0011gA\u0085Á\u008d7>t&$¿\u0010ÏÄn!Ëub\u0097·\u0092\u0095î\u001fÉ\u0095]\u0005\u0086d\u008cá\u0081\u0004óñ\u0005×\u0006þéÏÞ)¶\u0004_%\u0090M\u0006ß¿þ\u009f¤\b\u0002iÒ\nÂ\u001d\"ÄBü\u0099p(}\u000651¶Å\u0006Õ\u0004\u0084*\u008f\b";
      int var4 = "&,ÛÈôU\u008f\r£ñksâ\"Mñ\t\u0000l\u008fÁ+nÉ\u0012Sê¥£\u009b\u0099\u0091\u009dú\u0006¡ùÃ\u000b\u009b±\u0004\u008avµÚrüÂ§D\u0004u\u009a\u0085ªà\u0094ÇMí\u0086¸7\u008d\nßªä\u0018\u0013Os\\Îµ\u0006Û\u0089~Y´Ð\u0005«½)Ú5'T\u001cUé\u0002ò¾q:ÌéQ\u0088Ô:y?Bífï=w\u0010\u008bM\u0014\u0011gA\u0085Á\u008d7>t&$¿\u0010ÏÄn!Ëub\u0097·\u0092\u0095î\u001fÉ\u0095]\u0005\u0086d\u008cá\u0081\u0004óñ\u0005×\u0006þéÏÞ)¶\u0004_%\u0090M\u0006ß¿þ\u009f¤\b\u0002iÒ\nÂ\u001d\"ÄBü\u0099p(}\u000651¶Å\u0006Õ\u0004\u0084*\u008f\b"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 33;
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
                     case 0 -> 82;
                     case 1 -> 104;
                     case 2 -> 119;
                     case 3 -> 67;
                     case 4 -> 98;
                     case 5 -> 39;
                     default -> 94;
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
                     c = var5;
                     d = new String[19];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII();
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

                  var2 = "7ý5\u0091î¾Zäøµ¶HYî{tBH?\u000f«*y§¬ó:\u0005x>®òÇª\t2M R\u0097ª\u0087öí$TÓF`·å\u0005?îöÎ";
                  var4 = "7ý5\u0091î¾Zäøµ¶HYî{tBH?\u000f«*y§¬ó:\u0005x>®òÇª\t2M R\u0097ª\u0087öí$TÓF`·å\u0005?îöÎ".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 112;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30737) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 124;
            case 1 -> 121;
            case 2 -> 37;
            case 3 -> 142;
            case 4 -> 155;
            case 5 -> 241;
            case 6 -> 159;
            case 7 -> 249;
            case 8 -> 126;
            case 9 -> 3;
            case 10 -> 149;
            case 11 -> 254;
            case 12 -> 212;
            case 13 -> 250;
            case 14 -> 61;
            case 15 -> 105;
            case 16 -> 223;
            case 17 -> 40;
            case 18 -> 53;
            case 19 -> 49;
            case 20 -> 93;
            case 21 -> 31;
            case 22 -> 13;
            case 23 -> 219;
            case 24 -> 171;
            case 25 -> 242;
            case 26 -> 133;
            case 27 -> 141;
            case 28 -> 189;
            case 29 -> 193;
            case 30 -> 170;
            case 31 -> 90;
            case 32 -> 29;
            case 33 -> 83;
            case 34 -> 54;
            case 35 -> 184;
            case 36 -> 199;
            case 37 -> 81;
            case 38 -> 213;
            case 39 -> 182;
            case 40 -> 44;
            case 41 -> 92;
            case 42 -> 56;
            case 43 -> 225;
            case 44 -> 194;
            case 45 -> 246;
            case 46 -> 27;
            case 47 -> 139;
            case 48 -> 96;
            case 49 -> 46;
            case 50 -> 34;
            case 51 -> 215;
            case 52 -> 136;
            case 53 -> 128;
            case 54 -> 160;
            case 55 -> 18;
            case 56 -> 195;
            case 57 -> 22;
            case 58 -> 206;
            case 59 -> 165;
            case 60 -> 172;
            case 61 -> 251;
            case 62 -> 120;
            case 63 -> 153;
            case 64 -> 19;
            case 65 -> 210;
            case 66 -> 38;
            case 67 -> 200;
            case 68 -> 198;
            case 69 -> 180;
            case 70 -> 99;
            case 71 -> 240;
            case 72 -> 181;
            case 73 -> 228;
            case 74 -> 152;
            case 75 -> 131;
            case 76 -> 76;
            case 77 -> 130;
            case 78 -> 218;
            case 79 -> 28;
            case 80 -> 5;
            case 81 -> 35;
            case 82 -> 204;
            case 83 -> 17;
            case 84 -> 247;
            case 85 -> 214;
            case 86 -> 87;
            case 87 -> 39;
            case 88 -> 150;
            case 89 -> 145;
            case 90 -> 67;
            case 91 -> 162;
            case 92 -> 79;
            case 93 -> 80;
            case 94 -> 167;
            case 95 -> 55;
            case 96 -> 100;
            case 97 -> 63;
            case 98 -> 112;
            case 99 -> 30;
            case 100 -> 115;
            case 101 -> 202;
            case 102 -> 129;
            case 103 -> 173;
            case 104 -> 107;
            case 105 -> 4;
            case 106 -> 146;
            case 107 -> 187;
            case 108 -> 116;
            case 109 -> 117;
            case 110 -> 177;
            case 111 -> 138;
            case 112 -> 47;
            case 113 -> 111;
            case 114 -> 94;
            case 115 -> 236;
            case 116 -> 14;
            case 117 -> 207;
            case 118 -> 8;
            case 119 -> 123;
            case 120 -> 209;
            case 121 -> 41;
            case 122 -> 89;
            case 123 -> 75;
            case 124 -> 163;
            case 125 -> 203;
            case 126 -> 166;
            case 127 -> 243;
            case 128 -> 238;
            case 129 -> 97;
            case 130 -> 230;
            case 131 -> 156;
            case 132 -> 86;
            case 133 -> 52;
            case 134 -> 224;
            case 135 -> 168;
            case 136 -> 158;
            case 137 -> 134;
            case 138 -> 66;
            case 139 -> 147;
            case 140 -> 32;
            case 141 -> 234;
            case 142 -> 154;
            case 143 -> 186;
            case 144 -> 15;
            case 145 -> 253;
            case 146 -> 82;
            case 147 -> 2;
            case 148 -> 231;
            case 149 -> 9;
            case 150 -> 221;
            case 151 -> 239;
            case 152 -> 197;
            case 153 -> 137;
            case 154 -> 58;
            case 155 -> 229;
            case 156 -> 88;
            case 157 -> 24;
            case 158 -> 109;
            case 159 -> 119;
            case 160 -> 78;
            case 161 -> 91;
            case 162 -> 125;
            case 163 -> 7;
            case 164 -> 101;
            case 165 -> 217;
            case 166 -> 65;
            case 167 -> 232;
            case 168 -> 1;
            case 169 -> 69;
            case 170 -> 185;
            case 171 -> 135;
            case 172 -> 20;
            case 173 -> 72;
            case 174 -> 127;
            case 175 -> 226;
            case 176 -> 143;
            case 177 -> 36;
            case 178 -> 248;
            case 179 -> 85;
            case 180 -> 102;
            case 181 -> 98;
            case 182 -> 43;
            case 183 -> 108;
            case 184 -> 176;
            case 185 -> 161;
            case 186 -> 110;
            case 187 -> 11;
            case 188 -> 48;
            case 189 -> 0;
            case 190 -> 6;
            case 191 -> 73;
            case 192 -> 157;
            case 193 -> 188;
            case 194 -> 191;
            case 195 -> 106;
            case 196 -> 151;
            case 197 -> 148;
            case 198 -> 70;
            case 199 -> 64;
            case 200 -> 235;
            case 201 -> 179;
            case 202 -> 190;
            case 203 -> 255;
            case 204 -> 164;
            case 205 -> 118;
            case 206 -> 245;
            case 207 -> 50;
            case 208 -> 84;
            case 209 -> 233;
            case 210 -> 57;
            case 211 -> 227;
            case 212 -> 59;
            case 213 -> 25;
            case 214 -> 77;
            case 215 -> 62;
            case 216 -> 201;
            case 217 -> 205;
            case 218 -> 244;
            case 219 -> 60;
            case 220 -> 21;
            case 221 -> 51;
            case 222 -> 222;
            case 223 -> 16;
            case 224 -> 103;
            case 225 -> 174;
            case 226 -> 26;
            case 227 -> 252;
            case 228 -> 68;
            case 229 -> 132;
            case 230 -> 192;
            case 231 -> 74;
            case 232 -> 122;
            case 233 -> 71;
            case 234 -> 95;
            case 235 -> 196;
            case 236 -> 211;
            case 237 -> 114;
            case 238 -> 169;
            case 239 -> 178;
            case 240 -> 10;
            case 241 -> 175;
            case 242 -> 33;
            case 243 -> 42;
            case 244 -> 183;
            case 245 -> 237;
            case 246 -> 220;
            case 247 -> 104;
            case 248 -> 23;
            case 249 -> 140;
            case 250 -> 208;
            case 251 -> 144;
            case 252 -> 45;
            case 253 -> 113;
            case 254 -> 12;
            default -> 216;
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
