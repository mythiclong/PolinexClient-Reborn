package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class lllIIllIlllIlIlllIIIlIlIllIIlIlIllIIIllllIIlllIllIlllllIlIllllIIIlIIllIlllllIlIlIIlll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllIIllIlllIlIlllIIIlIlIllIIlIlIllIIIllllIIlllIllIlllllIlIllllIIIlIIllIlllllIlIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lllIIllIlllIlIlllIIIlIlIllIIlIlIllIIIllllIIlllIllIlllllIlIllllIIIlIIllIlllllIlIlIIlll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private lllIIllIlllIlIlllIIIlIlIllIIlIlIllIIIllllIIlllIllIlllllIlIllllIIIlIIllIlllllIlIlIIlll() {
      short var10001 = -8921;
      short var10002 = 17010;
      var10002 = -8924;
      short var10003 = 21731;
      short var10004 = -8922;
      short var10005 = 30842;
      super(
         "Keep Focus",
         "Keeps the game running when the window is unfocused.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Misc"
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0083æ÷ï\npMY\u0004C½\u0000C©\u00044ùeh\u00016{\u008c:P\u0012°\u0086õÛG\u009e©\u0095\u0001}Î\u0095\u0004^Ø¶\u0015\u001cl\u0091\u0002c\u007f$;½õ8\bvS\u0089\u001b%Î|\u0091}m\b\u008aö";
      int var4 = "\u0083æ÷ï\npMY\u0004C½\u0000C©\u00044ùeh\u00016{\u008c:P\u0012°\u0086õÛG\u009e©\u0095\u0001}Î\u0095\u0004^Ø¶\u0015\u001cl\u0091\u0002c\u007f$;½õ8\bvS\u0089\u001b%Î|\u0091}m\b\u008aö"
         .length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 9;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 9;
               var10006 = var6;
            } else {
               var13 = 9;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 9;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 121;
                  case 1 -> 58;
                  case 2 -> 23;
                  case 3 -> 123;
                  case 4 -> 75;
                  case 5 -> 66;
                  default -> 98;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllIIllIlllIlIlllIIIlIlIllIIlIlIllIIIllllIIlllIllIlllllIlIllllIIIlIIllIlllllIlIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lllIIllIlllIlIlllIIIlIlIllIIlIlIllIIIllllIIlllIllIlllllIlIllllIIIlIIllIlllllIlIlIIlll();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -8922) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 39;
            case 1 -> 135;
            case 2 -> 185;
            case 3 -> 173;
            case 4 -> 206;
            case 5 -> 95;
            case 6 -> 94;
            case 7 -> 22;
            case 8 -> 63;
            case 9 -> 226;
            case 10 -> 40;
            case 11 -> 106;
            case 12 -> 129;
            case 13 -> 152;
            case 14 -> 84;
            case 15 -> 5;
            case 16 -> 176;
            case 17 -> 36;
            case 18 -> 225;
            case 19 -> 196;
            case 20 -> 207;
            case 21 -> 224;
            case 22 -> 160;
            case 23 -> 38;
            case 24 -> 73;
            case 25 -> 74;
            case 26 -> 253;
            case 27 -> 186;
            case 28 -> 141;
            case 29 -> 215;
            case 30 -> 53;
            case 31 -> 140;
            case 32 -> 230;
            case 33 -> 254;
            case 34 -> 240;
            case 35 -> 20;
            case 36 -> 7;
            case 37 -> 248;
            case 38 -> 3;
            case 39 -> 218;
            case 40 -> 45;
            case 41 -> 48;
            case 42 -> 174;
            case 43 -> 4;
            case 44 -> 237;
            case 45 -> 168;
            case 46 -> 213;
            case 47 -> 156;
            case 48 -> 17;
            case 49 -> 62;
            case 50 -> 112;
            case 51 -> 148;
            case 52 -> 194;
            case 53 -> 252;
            case 54 -> 44;
            case 55 -> 164;
            case 56 -> 133;
            case 57 -> 249;
            case 58 -> 27;
            case 59 -> 122;
            case 60 -> 29;
            case 61 -> 34;
            case 62 -> 181;
            case 63 -> 161;
            case 64 -> 65;
            case 65 -> 64;
            case 66 -> 35;
            case 67 -> 26;
            case 68 -> 107;
            case 69 -> 90;
            case 70 -> 78;
            case 71 -> 10;
            case 72 -> 187;
            case 73 -> 183;
            case 74 -> 98;
            case 75 -> 89;
            case 76 -> 59;
            case 77 -> 142;
            case 78 -> 25;
            case 79 -> 77;
            case 80 -> 139;
            case 81 -> 2;
            case 82 -> 103;
            case 83 -> 171;
            case 84 -> 69;
            case 85 -> 31;
            case 86 -> 6;
            case 87 -> 126;
            case 88 -> 9;
            case 89 -> 16;
            case 90 -> 193;
            case 91 -> 250;
            case 92 -> 76;
            case 93 -> 216;
            case 94 -> 145;
            case 95 -> 8;
            case 96 -> 49;
            case 97 -> 132;
            case 98 -> 238;
            case 99 -> 211;
            case 100 -> 150;
            case 101 -> 236;
            case 102 -> 232;
            case 103 -> 114;
            case 104 -> 119;
            case 105 -> 52;
            case 106 -> 87;
            case 107 -> 67;
            case 108 -> 247;
            case 109 -> 184;
            case 110 -> 234;
            case 111 -> 127;
            case 112 -> 72;
            case 113 -> 203;
            case 114 -> 214;
            case 115 -> 86;
            case 116 -> 134;
            case 117 -> 91;
            case 118 -> 169;
            case 119 -> 37;
            case 120 -> 166;
            case 121 -> 175;
            case 122 -> 110;
            case 123 -> 136;
            case 124 -> 149;
            case 125 -> 47;
            case 126 -> 11;
            case 127 -> 242;
            case 128 -> 147;
            case 129 -> 199;
            case 130 -> 118;
            case 131 -> 41;
            case 132 -> 111;
            case 133 -> 96;
            case 134 -> 105;
            case 135 -> 12;
            case 136 -> 208;
            case 137 -> 33;
            case 138 -> 243;
            case 139 -> 231;
            case 140 -> 202;
            case 141 -> 81;
            case 142 -> 172;
            case 143 -> 115;
            case 144 -> 146;
            case 145 -> 18;
            case 146 -> 93;
            case 147 -> 191;
            case 148 -> 246;
            case 149 -> 155;
            case 150 -> 116;
            case 151 -> 43;
            case 152 -> 229;
            case 153 -> 143;
            case 154 -> 61;
            case 155 -> 130;
            case 156 -> 15;
            case 157 -> 60;
            case 158 -> 235;
            case 159 -> 101;
            case 160 -> 163;
            case 161 -> 24;
            case 162 -> 157;
            case 163 -> 192;
            case 164 -> 159;
            case 165 -> 144;
            case 166 -> 178;
            case 167 -> 200;
            case 168 -> 28;
            case 169 -> 100;
            case 170 -> 124;
            case 171 -> 85;
            case 172 -> 104;
            case 173 -> 158;
            case 174 -> 42;
            case 175 -> 222;
            case 176 -> 128;
            case 177 -> 68;
            case 178 -> 70;
            case 179 -> 58;
            case 180 -> 195;
            case 181 -> 153;
            case 182 -> 244;
            case 183 -> 120;
            case 184 -> 123;
            case 185 -> 32;
            case 186 -> 54;
            case 187 -> 19;
            case 188 -> 21;
            case 189 -> 88;
            case 190 -> 217;
            case 191 -> 180;
            case 192 -> 251;
            case 193 -> 117;
            case 194 -> 165;
            case 195 -> 125;
            case 196 -> 209;
            case 197 -> 102;
            case 198 -> 138;
            case 199 -> 92;
            case 200 -> 137;
            case 201 -> 198;
            case 202 -> 0;
            case 203 -> 23;
            case 204 -> 75;
            case 205 -> 46;
            case 206 -> 220;
            case 207 -> 182;
            case 208 -> 167;
            case 209 -> 170;
            case 210 -> 204;
            case 211 -> 227;
            case 212 -> 154;
            case 213 -> 121;
            case 214 -> 66;
            case 215 -> 79;
            case 216 -> 205;
            case 217 -> 201;
            case 218 -> 239;
            case 219 -> 97;
            case 220 -> 151;
            case 221 -> 55;
            case 222 -> 82;
            case 223 -> 1;
            case 224 -> 190;
            case 225 -> 108;
            case 226 -> 83;
            case 227 -> 241;
            case 228 -> 210;
            case 229 -> 233;
            case 230 -> 179;
            case 231 -> 109;
            case 232 -> 14;
            case 233 -> 162;
            case 234 -> 245;
            case 235 -> 221;
            case 236 -> 189;
            case 237 -> 113;
            case 238 -> 56;
            case 239 -> 30;
            case 240 -> 223;
            case 241 -> 255;
            case 242 -> 71;
            case 243 -> 188;
            case 244 -> 99;
            case 245 -> 131;
            case 246 -> 212;
            case 247 -> 177;
            case 248 -> 50;
            case 249 -> 228;
            case 250 -> 80;
            case 251 -> 13;
            case 252 -> 197;
            case 253 -> 57;
            case 254 -> 219;
            default -> 51;
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
