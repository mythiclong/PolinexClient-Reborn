package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class llIIIIIlllIIIllIlIlllIIIIIIlllllIllllIIlIIllllIllIlllIllllIlIIlIlIIlllIlIIIIIlIlIIIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIIIIIlllIIIllIlIlllIIIIIIlllllIllllIIlIIllllIllIlllIllllIlIIlIlIIlllIlIIIIIlIlIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static llIIIIIlllIIIllIlIlllIIIIIIlllllIllllIIlIIllllIllIlllIllllIlIIlIlIIlllIlIIIIIlIlIIIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private llIIIIIlllIIIllIlIlllIIIIIIlllllIllllIIlIIllllIllIlllIllllIlIIlIlIIlllIlIIIIIlIlIIIIl() {
      short var10001 = -7099;
      short var10002 = -7367;
      var10002 = -7097;
      short var10003 = 14790;
      short var10004 = -7100;
      short var10005 = 10963;
      super(
         "No Armor Render",
         "Doesn't render the armor you have equipped",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         "Player"
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ã\rQ¶á3ò6I\"¼¯Û®\u0003\u0006\u0007óQ2\u009f\u0083*\u0087`Ó)@þBÞu\u0010(2\"AOÕ/ñ=wl,k½\u001boÉSylàJ©0\u0004±\u0089\u008aNø3\u0098";
      int var4 = "ã\rQ¶á3ò6I\"¼¯Û®\u0003\u0006\u0007óQ2\u009f\u0083*\u0087`Ó)@þBÞu\u0010(2\"AOÕ/ñ=wl,k½\u001boÉSylàJ©0\u0004±\u0089\u008aNø3\u0098".length();
      char var1 = 15;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 7;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 7;
               var10006 = var6;
            } else {
               var13 = 7;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 7;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 33;
                  case 1 -> 80;
                  case 2 -> 73;
                  case 3 -> 57;
                  case 4 -> 83;
                  case 5 -> 33;
                  default -> 16;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIIIIlllIIIllIlIlllIIIIIIlllllIllllIIlIIllllIllIlllIllllIlIIlIlIIlllIlIIIIIlIlIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llIIIIIlllIIIllIlIlllIIIIIIlllllIllllIIlIIllllIllIlllIllllIlIIlIlIIlllIlIIIIIlIlIIIIl();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -7099) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 102;
            case 1 -> 191;
            case 2 -> 119;
            case 3 -> 160;
            case 4 -> 255;
            case 5 -> 104;
            case 6 -> 148;
            case 7 -> 57;
            case 8 -> 47;
            case 9 -> 213;
            case 10 -> 247;
            case 11 -> 188;
            case 12 -> 24;
            case 13 -> 128;
            case 14 -> 42;
            case 15 -> 173;
            case 16 -> 194;
            case 17 -> 118;
            case 18 -> 58;
            case 19 -> 172;
            case 20 -> 242;
            case 21 -> 251;
            case 22 -> 34;
            case 23 -> 43;
            case 24 -> 21;
            case 25 -> 105;
            case 26 -> 79;
            case 27 -> 180;
            case 28 -> 215;
            case 29 -> 122;
            case 30 -> 37;
            case 31 -> 204;
            case 32 -> 28;
            case 33 -> 98;
            case 34 -> 61;
            case 35 -> 100;
            case 36 -> 31;
            case 37 -> 51;
            case 38 -> 93;
            case 39 -> 125;
            case 40 -> 26;
            case 41 -> 16;
            case 42 -> 80;
            case 43 -> 8;
            case 44 -> 22;
            case 45 -> 33;
            case 46 -> 86;
            case 47 -> 82;
            case 48 -> 207;
            case 49 -> 186;
            case 50 -> 19;
            case 51 -> 254;
            case 52 -> 32;
            case 53 -> 139;
            case 54 -> 110;
            case 55 -> 240;
            case 56 -> 114;
            case 57 -> 200;
            case 58 -> 107;
            case 59 -> 41;
            case 60 -> 179;
            case 61 -> 202;
            case 62 -> 241;
            case 63 -> 138;
            case 64 -> 201;
            case 65 -> 210;
            case 66 -> 121;
            case 67 -> 229;
            case 68 -> 39;
            case 69 -> 10;
            case 70 -> 20;
            case 71 -> 85;
            case 72 -> 181;
            case 73 -> 1;
            case 74 -> 112;
            case 75 -> 253;
            case 76 -> 6;
            case 77 -> 212;
            case 78 -> 27;
            case 79 -> 60;
            case 80 -> 246;
            case 81 -> 152;
            case 82 -> 169;
            case 83 -> 92;
            case 84 -> 14;
            case 85 -> 178;
            case 86 -> 84;
            case 87 -> 103;
            case 88 -> 211;
            case 89 -> 145;
            case 90 -> 187;
            case 91 -> 235;
            case 92 -> 146;
            case 93 -> 155;
            case 94 -> 67;
            case 95 -> 76;
            case 96 -> 53;
            case 97 -> 120;
            case 98 -> 214;
            case 99 -> 218;
            case 100 -> 171;
            case 101 -> 130;
            case 102 -> 18;
            case 103 -> 222;
            case 104 -> 249;
            case 105 -> 25;
            case 106 -> 13;
            case 107 -> 216;
            case 108 -> 208;
            case 109 -> 239;
            case 110 -> 77;
            case 111 -> 129;
            case 112 -> 75;
            case 113 -> 205;
            case 114 -> 156;
            case 115 -> 73;
            case 116 -> 227;
            case 117 -> 38;
            case 118 -> 142;
            case 119 -> 164;
            case 120 -> 74;
            case 121 -> 62;
            case 122 -> 134;
            case 123 -> 3;
            case 124 -> 209;
            case 125 -> 199;
            case 126 -> 7;
            case 127 -> 50;
            case 128 -> 143;
            case 129 -> 190;
            case 130 -> 183;
            case 131 -> 70;
            case 132 -> 5;
            case 133 -> 166;
            case 134 -> 65;
            case 135 -> 63;
            case 136 -> 0;
            case 137 -> 154;
            case 138 -> 149;
            case 139 -> 91;
            case 140 -> 147;
            case 141 -> 131;
            case 142 -> 44;
            case 143 -> 150;
            case 144 -> 40;
            case 145 -> 245;
            case 146 -> 4;
            case 147 -> 124;
            case 148 -> 162;
            case 149 -> 83;
            case 150 -> 135;
            case 151 -> 94;
            case 152 -> 55;
            case 153 -> 193;
            case 154 -> 170;
            case 155 -> 234;
            case 156 -> 45;
            case 157 -> 29;
            case 158 -> 221;
            case 159 -> 81;
            case 160 -> 189;
            case 161 -> 225;
            case 162 -> 64;
            case 163 -> 167;
            case 164 -> 233;
            case 165 -> 52;
            case 166 -> 219;
            case 167 -> 177;
            case 168 -> 126;
            case 169 -> 161;
            case 170 -> 158;
            case 171 -> 88;
            case 172 -> 109;
            case 173 -> 141;
            case 174 -> 71;
            case 175 -> 96;
            case 176 -> 46;
            case 177 -> 206;
            case 178 -> 59;
            case 179 -> 192;
            case 180 -> 2;
            case 181 -> 17;
            case 182 -> 123;
            case 183 -> 185;
            case 184 -> 9;
            case 185 -> 217;
            case 186 -> 12;
            case 187 -> 68;
            case 188 -> 23;
            case 189 -> 132;
            case 190 -> 137;
            case 191 -> 243;
            case 192 -> 54;
            case 193 -> 90;
            case 194 -> 250;
            case 195 -> 238;
            case 196 -> 116;
            case 197 -> 174;
            case 198 -> 48;
            case 199 -> 226;
            case 200 -> 117;
            case 201 -> 196;
            case 202 -> 159;
            case 203 -> 36;
            case 204 -> 66;
            case 205 -> 11;
            case 206 -> 220;
            case 207 -> 165;
            case 208 -> 184;
            case 209 -> 30;
            case 210 -> 97;
            case 211 -> 237;
            case 212 -> 168;
            case 213 -> 224;
            case 214 -> 35;
            case 215 -> 108;
            case 216 -> 78;
            case 217 -> 230;
            case 218 -> 15;
            case 219 -> 195;
            case 220 -> 144;
            case 221 -> 56;
            case 222 -> 133;
            case 223 -> 153;
            case 224 -> 69;
            case 225 -> 151;
            case 226 -> 236;
            case 227 -> 49;
            case 228 -> 175;
            case 229 -> 140;
            case 230 -> 106;
            case 231 -> 232;
            case 232 -> 244;
            case 233 -> 89;
            case 234 -> 197;
            case 235 -> 127;
            case 236 -> 99;
            case 237 -> 223;
            case 238 -> 228;
            case 239 -> 157;
            case 240 -> 113;
            case 241 -> 72;
            case 242 -> 203;
            case 243 -> 136;
            case 244 -> 95;
            case 245 -> 231;
            case 246 -> 163;
            case 247 -> 87;
            case 248 -> 115;
            case 249 -> 248;
            case 250 -> 182;
            case 251 -> 111;
            case 252 -> 176;
            case 253 -> 198;
            case 254 -> 252;
            default -> 101;
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
