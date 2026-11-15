package me.octo.client.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   @NotNull
   public static IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static ThreadLocal<Boolean> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
   }

   public final void a(@NotNull Function0<Unit> var1) {
      short var10001 = 19166;
      short var10002 = 7403;
      Intrinsics.checkNotNullParameter(var1, "block");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.set(true);

      try {
         var1.invoke();
      } finally {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.set(false);
      }
   }

   public final boolean a() {
      Object var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get();
      short var10002 = 19167;
      short var10003 = 2868;
      Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      return (Boolean)var10000;
   }

   private static final Boolean b() {
      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u001f\u00102A;ÈÇÙ\u0005R¿%×ä";
      int var4 = "\u001f\u00102A;ÈÇÙ\u0005R¿%×ä".length();
      char var1 = '\b';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 45;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 45;
               var10006 = var6;
            } else {
               var13 = 45;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 45;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 102;
                  case 1 -> 82;
                  case 2 -> 106;
                  case 3 -> 96;
                  case 4 -> 108;
                  case 5 -> 103;
                  default -> 96;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = ThreadLocal.withInitial(
               IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII::b
            );
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 19167) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 231;
            case 1 -> 186;
            case 2 -> 170;
            case 3 -> 223;
            case 4 -> 242;
            case 5 -> 220;
            case 6 -> 73;
            case 7 -> 71;
            case 8 -> 24;
            case 9 -> 48;
            case 10 -> 148;
            case 11 -> 126;
            case 12 -> 179;
            case 13 -> 245;
            case 14 -> 187;
            case 15 -> 119;
            case 16 -> 162;
            case 17 -> 197;
            case 18 -> 96;
            case 19 -> 25;
            case 20 -> 150;
            case 21 -> 93;
            case 22 -> 43;
            case 23 -> 209;
            case 24 -> 176;
            case 25 -> 112;
            case 26 -> 151;
            case 27 -> 163;
            case 28 -> 218;
            case 29 -> 219;
            case 30 -> 208;
            case 31 -> 192;
            case 32 -> 64;
            case 33 -> 67;
            case 34 -> 147;
            case 35 -> 97;
            case 36 -> 39;
            case 37 -> 241;
            case 38 -> 225;
            case 39 -> 184;
            case 40 -> 83;
            case 41 -> 38;
            case 42 -> 246;
            case 43 -> 0;
            case 44 -> 20;
            case 45 -> 32;
            case 46 -> 229;
            case 47 -> 175;
            case 48 -> 76;
            case 49 -> 142;
            case 50 -> 79;
            case 51 -> 137;
            case 52 -> 188;
            case 53 -> 115;
            case 54 -> 11;
            case 55 -> 212;
            case 56 -> 202;
            case 57 -> 122;
            case 58 -> 85;
            case 59 -> 94;
            case 60 -> 18;
            case 61 -> 190;
            case 62 -> 40;
            case 63 -> 255;
            case 64 -> 63;
            case 65 -> 14;
            case 66 -> 90;
            case 67 -> 116;
            case 68 -> 92;
            case 69 -> 141;
            case 70 -> 62;
            case 71 -> 34;
            case 72 -> 110;
            case 73 -> 181;
            case 74 -> 143;
            case 75 -> 111;
            case 76 -> 130;
            case 77 -> 127;
            case 78 -> 183;
            case 79 -> 55;
            case 80 -> 124;
            case 81 -> 69;
            case 82 -> 41;
            case 83 -> 22;
            case 84 -> 1;
            case 85 -> 98;
            case 86 -> 171;
            case 87 -> 113;
            case 88 -> 82;
            case 89 -> 239;
            case 90 -> 250;
            case 91 -> 206;
            case 92 -> 236;
            case 93 -> 54;
            case 94 -> 30;
            case 95 -> 145;
            case 96 -> 60;
            case 97 -> 158;
            case 98 -> 216;
            case 99 -> 140;
            case 100 -> 173;
            case 101 -> 15;
            case 102 -> 74;
            case 103 -> 135;
            case 104 -> 168;
            case 105 -> 103;
            case 106 -> 91;
            case 107 -> 114;
            case 108 -> 70;
            case 109 -> 49;
            case 110 -> 133;
            case 111 -> 230;
            case 112 -> 104;
            case 113 -> 226;
            case 114 -> 166;
            case 115 -> 121;
            case 116 -> 19;
            case 117 -> 35;
            case 118 -> 106;
            case 119 -> 214;
            case 120 -> 21;
            case 121 -> 3;
            case 122 -> 57;
            case 123 -> 251;
            case 124 -> 182;
            case 125 -> 144;
            case 126 -> 81;
            case 127 -> 65;
            case 128 -> 56;
            case 129 -> 189;
            case 130 -> 5;
            case 131 -> 100;
            case 132 -> 105;
            case 133 -> 37;
            case 134 -> 28;
            case 135 -> 31;
            case 136 -> 46;
            case 137 -> 107;
            case 138 -> 169;
            case 139 -> 198;
            case 140 -> 66;
            case 141 -> 157;
            case 142 -> 118;
            case 143 -> 161;
            case 144 -> 101;
            case 145 -> 109;
            case 146 -> 36;
            case 147 -> 204;
            case 148 -> 120;
            case 149 -> 152;
            case 150 -> 117;
            case 151 -> 222;
            case 152 -> 53;
            case 153 -> 134;
            case 154 -> 254;
            case 155 -> 108;
            case 156 -> 252;
            case 157 -> 6;
            case 158 -> 160;
            case 159 -> 203;
            case 160 -> 80;
            case 161 -> 191;
            case 162 -> 224;
            case 163 -> 12;
            case 164 -> 129;
            case 165 -> 2;
            case 166 -> 253;
            case 167 -> 23;
            case 168 -> 154;
            case 169 -> 153;
            case 170 -> 139;
            case 171 -> 84;
            case 172 -> 155;
            case 173 -> 240;
            case 174 -> 238;
            case 175 -> 77;
            case 176 -> 177;
            case 177 -> 131;
            case 178 -> 72;
            case 179 -> 146;
            case 180 -> 45;
            case 181 -> 196;
            case 182 -> 207;
            case 183 -> 211;
            case 184 -> 68;
            case 185 -> 164;
            case 186 -> 13;
            case 187 -> 167;
            case 188 -> 87;
            case 189 -> 228;
            case 190 -> 58;
            case 191 -> 136;
            case 192 -> 165;
            case 193 -> 102;
            case 194 -> 244;
            case 195 -> 213;
            case 196 -> 156;
            case 197 -> 50;
            case 198 -> 8;
            case 199 -> 17;
            case 200 -> 44;
            case 201 -> 193;
            case 202 -> 233;
            case 203 -> 99;
            case 204 -> 88;
            case 205 -> 61;
            case 206 -> 132;
            case 207 -> 217;
            case 208 -> 215;
            case 209 -> 243;
            case 210 -> 247;
            case 211 -> 78;
            case 212 -> 89;
            case 213 -> 125;
            case 214 -> 232;
            case 215 -> 200;
            case 216 -> 149;
            case 217 -> 75;
            case 218 -> 42;
            case 219 -> 199;
            case 220 -> 7;
            case 221 -> 180;
            case 222 -> 185;
            case 223 -> 201;
            case 224 -> 172;
            case 225 -> 249;
            case 226 -> 237;
            case 227 -> 210;
            case 228 -> 195;
            case 229 -> 51;
            case 230 -> 174;
            case 231 -> 235;
            case 232 -> 9;
            case 233 -> 59;
            case 234 -> 159;
            case 235 -> 26;
            case 236 -> 4;
            case 237 -> 10;
            case 238 -> 205;
            case 239 -> 29;
            case 240 -> 47;
            case 241 -> 95;
            case 242 -> 138;
            case 243 -> 227;
            case 244 -> 248;
            case 245 -> 16;
            case 246 -> 234;
            case 247 -> 221;
            case 248 -> 86;
            case 249 -> 123;
            case 250 -> 194;
            case 251 -> 178;
            case 252 -> 52;
            case 253 -> 33;
            case 254 -> 128;
            default -> 27;
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
