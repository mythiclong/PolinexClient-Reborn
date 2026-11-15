package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   public static boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   public static boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII() {
      short var10001 = 32107;
      short var10002 = -24003;
      var10002 = 32104;
      short var10003 = -3122;
      short var10004 = 32105;
      short var10005 = -24919;
      super(
         "Ignore Entities",
         "Lets you hit blocks through entities.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Misc"
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0018HH/%\u0098û~Ä\u0091\\\u009fj¼\"ÛÑ¿D}$ñlÆ\u000bWï\u008f+¹\u0004$ÍF\u001e©\b?\u008c\u009edÙ\u000f·S$\u008fÑ¶À\u0098¿V<À\na´";
      int var4 = "\u0018HH/%\u0098û~Ä\u0091\\\u009fj¼\"ÛÑ¿D}$ñlÆ\u000bWï\u008f+¹\u0004$ÍF\u001e©\b?\u008c\u009edÙ\u000f·S$\u008fÑ¶À\u0098¿V<À\na´".length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 46;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 46;
               var10006 = var6;
            } else {
               var13 = 46;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 46;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 104;
                  case 1 -> 7;
                  case 2 -> 58;
                  case 3 -> 10;
                  case 4 -> 40;
                  case 5 -> 10;
                  default -> 8;
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
            f = var5;
            g = new String[3];
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIlIllllIllIIlIIIIIIlIIIlllllIIIIllIIIIIIllllIIIIIIlllIlIllIIIIIIIIllllIIlllllIllIlII();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 32105) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 33;
            case 1 -> 10;
            case 2 -> 126;
            case 3 -> 252;
            case 4 -> 206;
            case 5 -> 218;
            case 6 -> 253;
            case 7 -> 104;
            case 8 -> 145;
            case 9 -> 131;
            case 10 -> 226;
            case 11 -> 228;
            case 12 -> 185;
            case 13 -> 162;
            case 14 -> 5;
            case 15 -> 191;
            case 16 -> 4;
            case 17 -> 111;
            case 18 -> 158;
            case 19 -> 208;
            case 20 -> 29;
            case 21 -> 121;
            case 22 -> 168;
            case 23 -> 74;
            case 24 -> 177;
            case 25 -> 159;
            case 26 -> 139;
            case 27 -> 6;
            case 28 -> 247;
            case 29 -> 32;
            case 30 -> 64;
            case 31 -> 195;
            case 32 -> 151;
            case 33 -> 241;
            case 34 -> 164;
            case 35 -> 26;
            case 36 -> 100;
            case 37 -> 37;
            case 38 -> 73;
            case 39 -> 18;
            case 40 -> 62;
            case 41 -> 141;
            case 42 -> 155;
            case 43 -> 71;
            case 44 -> 130;
            case 45 -> 122;
            case 46 -> 214;
            case 47 -> 15;
            case 48 -> 160;
            case 49 -> 242;
            case 50 -> 43;
            case 51 -> 167;
            case 52 -> 166;
            case 53 -> 194;
            case 54 -> 21;
            case 55 -> 67;
            case 56 -> 175;
            case 57 -> 239;
            case 58 -> 41;
            case 59 -> 105;
            case 60 -> 234;
            case 61 -> 199;
            case 62 -> 137;
            case 63 -> 197;
            case 64 -> 96;
            case 65 -> 86;
            case 66 -> 144;
            case 67 -> 9;
            case 68 -> 201;
            case 69 -> 123;
            case 70 -> 198;
            case 71 -> 83;
            case 72 -> 31;
            case 73 -> 245;
            case 74 -> 192;
            case 75 -> 77;
            case 76 -> 30;
            case 77 -> 87;
            case 78 -> 174;
            case 79 -> 136;
            case 80 -> 200;
            case 81 -> 63;
            case 82 -> 224;
            case 83 -> 138;
            case 84 -> 1;
            case 85 -> 172;
            case 86 -> 14;
            case 87 -> 78;
            case 88 -> 46;
            case 89 -> 186;
            case 90 -> 8;
            case 91 -> 222;
            case 92 -> 207;
            case 93 -> 92;
            case 94 -> 150;
            case 95 -> 143;
            case 96 -> 238;
            case 97 -> 35;
            case 98 -> 244;
            case 99 -> 51;
            case 100 -> 82;
            case 101 -> 204;
            case 102 -> 65;
            case 103 -> 11;
            case 104 -> 97;
            case 105 -> 57;
            case 106 -> 28;
            case 107 -> 127;
            case 108 -> 212;
            case 109 -> 113;
            case 110 -> 231;
            case 111 -> 182;
            case 112 -> 170;
            case 113 -> 157;
            case 114 -> 24;
            case 115 -> 45;
            case 116 -> 140;
            case 117 -> 99;
            case 118 -> 125;
            case 119 -> 223;
            case 120 -> 95;
            case 121 -> 101;
            case 122 -> 229;
            case 123 -> 36;
            case 124 -> 227;
            case 125 -> 196;
            case 126 -> 56;
            case 127 -> 232;
            case 128 -> 236;
            case 129 -> 7;
            case 130 -> 75;
            case 131 -> 179;
            case 132 -> 39;
            case 133 -> 81;
            case 134 -> 55;
            case 135 -> 117;
            case 136 -> 216;
            case 137 -> 16;
            case 138 -> 176;
            case 139 -> 85;
            case 140 -> 107;
            case 141 -> 203;
            case 142 -> 110;
            case 143 -> 102;
            case 144 -> 153;
            case 145 -> 116;
            case 146 -> 146;
            case 147 -> 128;
            case 148 -> 52;
            case 149 -> 215;
            case 150 -> 187;
            case 151 -> 42;
            case 152 -> 59;
            case 153 -> 22;
            case 154 -> 225;
            case 155 -> 84;
            case 156 -> 237;
            case 157 -> 230;
            case 158 -> 240;
            case 159 -> 217;
            case 160 -> 27;
            case 161 -> 61;
            case 162 -> 0;
            case 163 -> 154;
            case 164 -> 49;
            case 165 -> 180;
            case 166 -> 66;
            case 167 -> 118;
            case 168 -> 213;
            case 169 -> 219;
            case 170 -> 184;
            case 171 -> 94;
            case 172 -> 47;
            case 173 -> 173;
            case 174 -> 246;
            case 175 -> 129;
            case 176 -> 181;
            case 177 -> 235;
            case 178 -> 135;
            case 179 -> 79;
            case 180 -> 80;
            case 181 -> 112;
            case 182 -> 3;
            case 183 -> 124;
            case 184 -> 250;
            case 185 -> 249;
            case 186 -> 193;
            case 187 -> 53;
            case 188 -> 115;
            case 189 -> 134;
            case 190 -> 40;
            case 191 -> 58;
            case 192 -> 12;
            case 193 -> 169;
            case 194 -> 17;
            case 195 -> 210;
            case 196 -> 152;
            case 197 -> 23;
            case 198 -> 149;
            case 199 -> 156;
            case 200 -> 178;
            case 201 -> 2;
            case 202 -> 25;
            case 203 -> 90;
            case 204 -> 98;
            case 205 -> 243;
            case 206 -> 188;
            case 207 -> 165;
            case 208 -> 54;
            case 209 -> 205;
            case 210 -> 50;
            case 211 -> 190;
            case 212 -> 163;
            case 213 -> 76;
            case 214 -> 20;
            case 215 -> 209;
            case 216 -> 171;
            case 217 -> 89;
            case 218 -> 34;
            case 219 -> 251;
            case 220 -> 254;
            case 221 -> 109;
            case 222 -> 60;
            case 223 -> 211;
            case 224 -> 103;
            case 225 -> 38;
            case 226 -> 44;
            case 227 -> 220;
            case 228 -> 183;
            case 229 -> 106;
            case 230 -> 142;
            case 231 -> 202;
            case 232 -> 72;
            case 233 -> 119;
            case 234 -> 70;
            case 235 -> 91;
            case 236 -> 221;
            case 237 -> 69;
            case 238 -> 189;
            case 239 -> 19;
            case 240 -> 147;
            case 241 -> 133;
            case 242 -> 93;
            case 243 -> 233;
            case 244 -> 108;
            case 245 -> 132;
            case 246 -> 48;
            case 247 -> 13;
            case 248 -> 161;
            case 249 -> 255;
            case 250 -> 120;
            case 251 -> 114;
            case 252 -> 148;
            case 253 -> 88;
            case 254 -> 248;
            default -> 68;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
}
}
