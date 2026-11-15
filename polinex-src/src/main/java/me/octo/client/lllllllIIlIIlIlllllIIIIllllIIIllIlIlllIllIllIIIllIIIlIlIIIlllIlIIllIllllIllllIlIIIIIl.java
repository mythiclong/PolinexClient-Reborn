package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   public lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl() {
      short var10001 = -12420;
      short var10002 = 4584;
      var10002 = -12417;
      short var10003 = 13338;
      short var10004 = -12419;
      short var10005 = 7965;
      super(
         "Auto Powder Pumpkin",
         "Automatically eats a Powder Pumpkin when there is one in your hotbar.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         "Mining",
         true
      , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "îï|\"\u0016½\u0013ã\u001bJ%Ç¬-A\u0015ÿÊBï\u00873\ræDàEm\u0098\u009bU°\u0093<¯Hû\u0098\nQ\u001eàÐ\u008aÖß|ak1k2Å\u0006ÏUþ¶\u0086)\u001dÓ>ø \u0011K\u0011 \u0097ÍÎç\u0091\u0086ûM[È~Îµ\r+-\u0005t\u0004¯JG\u000e#¨l¬";
      int var4 = "îï|\"\u0016½\u0013ã\u001bJ%Ç¬-A\u0015ÿÊBï\u00873\ræDàEm\u0098\u009bU°\u0093<¯Hû\u0098\nQ\u001eàÐ\u008aÖß|ak1k2Å\u0006ÏUþ¶\u0086)\u001dÓ>ø \u0011K\u0011 \u0097ÍÎç\u0091\u0086ûM[È~Îµ\r+-\u0005t\u0004¯JG\u000e#¨l¬"
         .length();
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 29;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 29;
               var10006 = var6;
            } else {
               var13 = 29;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 29;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 78;
                  case 1 -> 105;
                  case 2 -> 92;
                  case 3 -> 97;
                  case 4 -> 97;
                  case 5 -> 72;
                  default -> 12;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12419) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 51;
            case 1 -> 234;
            case 2 -> 182;
            case 3 -> 231;
            case 4 -> 80;
            case 5 -> 229;
            case 6 -> 208;
            case 7 -> 150;
            case 8 -> 177;
            case 9 -> 187;
            case 10 -> 217;
            case 11 -> 35;
            case 12 -> 154;
            case 13 -> 127;
            case 14 -> 29;
            case 15 -> 46;
            case 16 -> 47;
            case 17 -> 167;
            case 18 -> 156;
            case 19 -> 160;
            case 20 -> 222;
            case 21 -> 21;
            case 22 -> 169;
            case 23 -> 18;
            case 24 -> 176;
            case 25 -> 0;
            case 26 -> 246;
            case 27 -> 59;
            case 28 -> 5;
            case 29 -> 196;
            case 30 -> 210;
            case 31 -> 240;
            case 32 -> 64;
            case 33 -> 98;
            case 34 -> 99;
            case 35 -> 57;
            case 36 -> 139;
            case 37 -> 153;
            case 38 -> 39;
            case 39 -> 6;
            case 40 -> 193;
            case 41 -> 165;
            case 42 -> 255;
            case 43 -> 93;
            case 44 -> 19;
            case 45 -> 56;
            case 46 -> 90;
            case 47 -> 53;
            case 48 -> 179;
            case 49 -> 228;
            case 50 -> 242;
            case 51 -> 123;
            case 52 -> 163;
            case 53 -> 101;
            case 54 -> 62;
            case 55 -> 31;
            case 56 -> 16;
            case 57 -> 192;
            case 58 -> 8;
            case 59 -> 198;
            case 60 -> 138;
            case 61 -> 195;
            case 62 -> 155;
            case 63 -> 166;
            case 64 -> 241;
            case 65 -> 243;
            case 66 -> 37;
            case 67 -> 78;
            case 68 -> 65;
            case 69 -> 151;
            case 70 -> 7;
            case 71 -> 202;
            case 72 -> 239;
            case 73 -> 4;
            case 74 -> 38;
            case 75 -> 220;
            case 76 -> 235;
            case 77 -> 30;
            case 78 -> 36;
            case 79 -> 50;
            case 80 -> 157;
            case 81 -> 108;
            case 82 -> 22;
            case 83 -> 20;
            case 84 -> 162;
            case 85 -> 118;
            case 86 -> 113;
            case 87 -> 40;
            case 88 -> 87;
            case 89 -> 227;
            case 90 -> 230;
            case 91 -> 32;
            case 92 -> 28;
            case 93 -> 204;
            case 94 -> 248;
            case 95 -> 224;
            case 96 -> 11;
            case 97 -> 1;
            case 98 -> 244;
            case 99 -> 120;
            case 100 -> 26;
            case 101 -> 223;
            case 102 -> 114;
            case 103 -> 200;
            case 104 -> 252;
            case 105 -> 178;
            case 106 -> 85;
            case 107 -> 25;
            case 108 -> 121;
            case 109 -> 141;
            case 110 -> 69;
            case 111 -> 212;
            case 112 -> 43;
            case 113 -> 33;
            case 114 -> 102;
            case 115 -> 221;
            case 116 -> 34;
            case 117 -> 103;
            case 118 -> 236;
            case 119 -> 14;
            case 120 -> 126;
            case 121 -> 13;
            case 122 -> 218;
            case 123 -> 44;
            case 124 -> 55;
            case 125 -> 134;
            case 126 -> 199;
            case 127 -> 10;
            case 128 -> 147;
            case 129 -> 24;
            case 130 -> 250;
            case 131 -> 189;
            case 132 -> 159;
            case 133 -> 149;
            case 134 -> 58;
            case 135 -> 97;
            case 136 -> 201;
            case 137 -> 194;
            case 138 -> 254;
            case 139 -> 213;
            case 140 -> 116;
            case 141 -> 66;
            case 142 -> 119;
            case 143 -> 104;
            case 144 -> 211;
            case 145 -> 173;
            case 146 -> 188;
            case 147 -> 144;
            case 148 -> 170;
            case 149 -> 245;
            case 150 -> 135;
            case 151 -> 100;
            case 152 -> 106;
            case 153 -> 133;
            case 154 -> 124;
            case 155 -> 112;
            case 156 -> 209;
            case 157 -> 27;
            case 158 -> 215;
            case 159 -> 92;
            case 160 -> 88;
            case 161 -> 89;
            case 162 -> 94;
            case 163 -> 174;
            case 164 -> 205;
            case 165 -> 125;
            case 166 -> 52;
            case 167 -> 70;
            case 168 -> 23;
            case 169 -> 81;
            case 170 -> 137;
            case 171 -> 207;
            case 172 -> 161;
            case 173 -> 219;
            case 174 -> 148;
            case 175 -> 105;
            case 176 -> 247;
            case 177 -> 191;
            case 178 -> 67;
            case 179 -> 61;
            case 180 -> 180;
            case 181 -> 17;
            case 182 -> 15;
            case 183 -> 136;
            case 184 -> 251;
            case 185 -> 175;
            case 186 -> 130;
            case 187 -> 132;
            case 188 -> 232;
            case 189 -> 45;
            case 190 -> 186;
            case 191 -> 140;
            case 192 -> 71;
            case 193 -> 72;
            case 194 -> 128;
            case 195 -> 152;
            case 196 -> 214;
            case 197 -> 131;
            case 198 -> 203;
            case 199 -> 73;
            case 200 -> 197;
            case 201 -> 2;
            case 202 -> 143;
            case 203 -> 109;
            case 204 -> 238;
            case 205 -> 253;
            case 206 -> 86;
            case 207 -> 79;
            case 208 -> 115;
            case 209 -> 185;
            case 210 -> 216;
            case 211 -> 75;
            case 212 -> 249;
            case 213 -> 48;
            case 214 -> 158;
            case 215 -> 42;
            case 216 -> 129;
            case 217 -> 77;
            case 218 -> 91;
            case 219 -> 146;
            case 220 -> 9;
            case 221 -> 111;
            case 222 -> 84;
            case 223 -> 164;
            case 224 -> 145;
            case 225 -> 168;
            case 226 -> 117;
            case 227 -> 233;
            case 228 -> 122;
            case 229 -> 96;
            case 230 -> 225;
            case 231 -> 110;
            case 232 -> 226;
            case 233 -> 54;
            case 234 -> 190;
            case 235 -> 95;
            case 236 -> 171;
            case 237 -> 142;
            case 238 -> 63;
            case 239 -> 206;
            case 240 -> 107;
            case 241 -> 181;
            case 242 -> 76;
            case 243 -> 237;
            case 244 -> 172;
            case 245 -> 3;
            case 246 -> 12;
            case 247 -> 41;
            case 248 -> 74;
            case 249 -> 83;
            case 250 -> 183;
            case 251 -> 184;
            case 252 -> 60;
            case 253 -> 49;
            case 254 -> 82;
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
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
}
