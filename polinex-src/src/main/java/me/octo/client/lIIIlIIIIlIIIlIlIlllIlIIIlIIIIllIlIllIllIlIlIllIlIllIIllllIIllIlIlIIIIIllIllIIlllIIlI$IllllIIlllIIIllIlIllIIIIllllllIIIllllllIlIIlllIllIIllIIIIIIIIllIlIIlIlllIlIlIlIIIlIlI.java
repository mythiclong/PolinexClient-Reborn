package me.octo.client;

import java.util.Comparator;
import java.util.Locale;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

public final class lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI<T>
   implements Comparator<T> {
   public static java.util.Comparator IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field v2
   
   private static String[] a;
   private static String[] b;

   public lIIIlIIIIlIIIlIlIlllIlIIIlIIIIllIlIllIllIlIlIllIlIllIIllllIIllIlIlIIIIIllIllIIlllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
      Comparator var1
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      int[] var10000 = IlIlllIIIllIIlllIIlIIlIIlIIlIllIllIIIIIIIIIIIlllIlIlIlIIllIlIllIlIIlIIllllIllllllIlll.g();
      int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.compare(var1, var2);
      int[] var3 = var10000;
      int var10 = var4;
      if (var3 == null) {
         if (var4 != 0) {
            var10 = var4;
         } else {
            me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = (me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1;
            boolean var6 = false;
            String var11 = "".toLowerCase(Locale.ROOT);
            short var10002 = -16703;
            short var10003 = 3520;
            Intrinsics.checkNotNullExpressionValue(var11, "toLowerCase(...)");
            Comparable var12 = var11;
            var5 = (me.octo.client.utils.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var2;
            Comparable var7 = var12;
            var6 = false;
            String var13 = "".toLowerCase(Locale.ROOT);
            var10002 = -16704;
            var10003 = 11372;
            Intrinsics.checkNotNullExpressionValue(var13, "toLowerCase(...)");
            var10 = ComparisonsKt.compareValues(var7, var13);
         }
      }

      return var10;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\tùàö\u0088óAmä\u0082\u0090C?Ð»I\u0010@§É=\u00ad\u008aåBpg\u0002ÿmGñ»";
      int var4 = "\tùàö\u0088óAmä\u0082\u0090C?Ð»I\u0010@§É=\u00ad\u008aåBpg\u0002ÿmGñ»".length();
      char var1 = 16;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 38;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 38;
               var10006 = var6;
            } else {
               var13 = 38;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 38;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 95;
                  case 1 -> 116;
                  case 2 -> 126;
                  case 3 -> 72;
                  case 4 -> 11;
                  case 5 -> 33;
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
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -16704) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 113;
            case 1 -> 215;
            case 2 -> 45;
            case 3 -> 198;
            case 4 -> 117;
            case 5 -> 206;
            case 6 -> 108;
            case 7 -> 140;
            case 8 -> 202;
            case 9 -> 208;
            case 10 -> 201;
            case 11 -> 52;
            case 12 -> 70;
            case 13 -> 203;
            case 14 -> 221;
            case 15 -> 255;
            case 16 -> 20;
            case 17 -> 36;
            case 18 -> 227;
            case 19 -> 9;
            case 20 -> 35;
            case 21 -> 137;
            case 22 -> 27;
            case 23 -> 184;
            case 24 -> 190;
            case 25 -> 100;
            case 26 -> 243;
            case 27 -> 64;
            case 28 -> 214;
            case 29 -> 82;
            case 30 -> 183;
            case 31 -> 179;
            case 32 -> 89;
            case 33 -> 62;
            case 34 -> 167;
            case 35 -> 222;
            case 36 -> 238;
            case 37 -> 32;
            case 38 -> 66;
            case 39 -> 237;
            case 40 -> 74;
            case 41 -> 207;
            case 42 -> 164;
            case 43 -> 120;
            case 44 -> 162;
            case 45 -> 21;
            case 46 -> 139;
            case 47 -> 239;
            case 48 -> 248;
            case 49 -> 146;
            case 50 -> 90;
            case 51 -> 126;
            case 52 -> 92;
            case 53 -> 61;
            case 54 -> 6;
            case 55 -> 57;
            case 56 -> 142;
            case 57 -> 115;
            case 58 -> 191;
            case 59 -> 232;
            case 60 -> 43;
            case 61 -> 111;
            case 62 -> 119;
            case 63 -> 50;
            case 64 -> 81;
            case 65 -> 210;
            case 66 -> 213;
            case 67 -> 30;
            case 68 -> 138;
            case 69 -> 204;
            case 70 -> 11;
            case 71 -> 169;
            case 72 -> 152;
            case 73 -> 230;
            case 74 -> 180;
            case 75 -> 91;
            case 76 -> 123;
            case 77 -> 17;
            case 78 -> 72;
            case 79 -> 144;
            case 80 -> 171;
            case 81 -> 65;
            case 82 -> 79;
            case 83 -> 228;
            case 84 -> 174;
            case 85 -> 205;
            case 86 -> 14;
            case 87 -> 161;
            case 88 -> 168;
            case 89 -> 121;
            case 90 -> 23;
            case 91 -> 55;
            case 92 -> 246;
            case 93 -> 93;
            case 94 -> 233;
            case 95 -> 160;
            case 96 -> 187;
            case 97 -> 192;
            case 98 -> 189;
            case 99 -> 95;
            case 100 -> 2;
            case 101 -> 153;
            case 102 -> 44;
            case 103 -> 165;
            case 104 -> 24;
            case 105 -> 166;
            case 106 -> 178;
            case 107 -> 149;
            case 108 -> 7;
            case 109 -> 105;
            case 110 -> 1;
            case 111 -> 163;
            case 112 -> 104;
            case 113 -> 217;
            case 114 -> 86;
            case 115 -> 154;
            case 116 -> 218;
            case 117 -> 51;
            case 118 -> 83;
            case 119 -> 98;
            case 120 -> 132;
            case 121 -> 49;
            case 122 -> 226;
            case 123 -> 250;
            case 124 -> 31;
            case 125 -> 234;
            case 126 -> 97;
            case 127 -> 193;
            case 128 -> 195;
            case 129 -> 99;
            case 130 -> 181;
            case 131 -> 78;
            case 132 -> 59;
            case 133 -> 225;
            case 134 -> 47;
            case 135 -> 200;
            case 136 -> 199;
            case 137 -> 229;
            case 138 -> 147;
            case 139 -> 60;
            case 140 -> 130;
            case 141 -> 173;
            case 142 -> 223;
            case 143 -> 254;
            case 144 -> 244;
            case 145 -> 29;
            case 146 -> 75;
            case 147 -> 125;
            case 148 -> 150;
            case 149 -> 103;
            case 150 -> 80;
            case 151 -> 251;
            case 152 -> 129;
            case 153 -> 73;
            case 154 -> 67;
            case 155 -> 219;
            case 156 -> 197;
            case 157 -> 38;
            case 158 -> 54;
            case 159 -> 77;
            case 160 -> 37;
            case 161 -> 41;
            case 162 -> 42;
            case 163 -> 209;
            case 164 -> 106;
            case 165 -> 135;
            case 166 -> 28;
            case 167 -> 170;
            case 168 -> 87;
            case 169 -> 172;
            case 170 -> 235;
            case 171 -> 22;
            case 172 -> 231;
            case 173 -> 253;
            case 174 -> 124;
            case 175 -> 102;
            case 176 -> 151;
            case 177 -> 185;
            case 178 -> 40;
            case 179 -> 188;
            case 180 -> 127;
            case 181 -> 101;
            case 182 -> 63;
            case 183 -> 159;
            case 184 -> 112;
            case 185 -> 5;
            case 186 -> 155;
            case 187 -> 19;
            case 188 -> 12;
            case 189 -> 241;
            case 190 -> 10;
            case 191 -> 122;
            case 192 -> 133;
            case 193 -> 110;
            case 194 -> 134;
            case 195 -> 109;
            case 196 -> 39;
            case 197 -> 4;
            case 198 -> 88;
            case 199 -> 186;
            case 200 -> 33;
            case 201 -> 68;
            case 202 -> 220;
            case 203 -> 25;
            case 204 -> 84;
            case 205 -> 15;
            case 206 -> 236;
            case 207 -> 18;
            case 208 -> 249;
            case 209 -> 34;
            case 210 -> 240;
            case 211 -> 13;
            case 212 -> 107;
            case 213 -> 176;
            case 214 -> 242;
            case 215 -> 224;
            case 216 -> 58;
            case 217 -> 69;
            case 218 -> 71;
            case 219 -> 245;
            case 220 -> 211;
            case 221 -> 0;
            case 222 -> 141;
            case 223 -> 247;
            case 224 -> 85;
            case 225 -> 136;
            case 226 -> 3;
            case 227 -> 8;
            case 228 -> 118;
            case 229 -> 131;
            case 230 -> 196;
            case 231 -> 157;
            case 232 -> 216;
            case 233 -> 114;
            case 234 -> 177;
            case 235 -> 145;
            case 236 -> 56;
            case 237 -> 194;
            case 238 -> 252;
            case 239 -> 116;
            case 240 -> 156;
            case 241 -> 158;
            case 242 -> 53;
            case 243 -> 96;
            case 244 -> 128;
            case 245 -> 175;
            case 246 -> 94;
            case 247 -> 16;
            case 248 -> 26;
            case 249 -> 76;
            case 250 -> 143;
            case 251 -> 148;
            case 252 -> 182;
            case 253 -> 46;
            case 254 -> 48;
            default -> 212;
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
