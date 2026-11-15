package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class lllllIIlIllllIlIIIlllllIllIIlIIlIIIlIllIlllllllIIIIlllIlIIIlIIlIllllIlIIlIIIlllIlllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllllIIlIllllIlIIIlllllIllIIlIIlIIIlIllIlllllllIIIIlllIlIIIlIIlIllllIlIIlIIIlllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lllllIIlIllllIlIIIlllllIllIIlIIlIIIlIllIlllllllIIIIlllIlIIIlIIlIllllIlIIlIIIlllIlllll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private lllllIIlIllllIlIIIlllllIllIIlIIlIIIlIllIlllllllIIIIlllIlIIIlIIlIllllIlIIlIIIlllIlllll() {
      short var10001 = 21747;
      short var10002 = 3281;
      var10002 = 21745;
      short var10003 = -12046;
      short var10004 = 21744;
      short var10005 = 19378;
      super(
         "Status Effects Remover",
         "Hides status effect icons from HUD and inventory.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         "Render"
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0091S\u0017×¥æu\u009a\u0096ÝvîÀ\nLªF\u0000©Ú\t\nN ¤[\u001a\u0092\u0090G°ü»o\u0007VîãÂ!ç¹,¥8äS\u0092×\u0006@#~UÕÅ\u0016w¦¶Æ2¤\u0012ÚDÐÛ\u000f32ªM\u0014@øKWµ";
      int var4 = "\u0091S\u0017×¥æu\u009a\u0096ÝvîÀ\nLªF\u0000©Ú\t\nN ¤[\u001a\u0092\u0090G°ü»o\u0007VîãÂ!ç¹,¥8äS\u0092×\u0006@#~UÕÅ\u0016w¦¶Æ2¤\u0012ÚDÐÛ\u000f32ªM\u0014@øKWµ"
         .length();
      char var1 = '1';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 34;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 34;
               var10006 = var6;
            } else {
               var13 = 34;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 34;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 90;
                  case 1 -> 103;
                  case 2 -> 45;
                  case 3 -> 22;
                  case 4 -> 31;
                  case 5 -> 81;
                  default -> 42;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllllIIlIllllIlIIIlllllIllIIlIIlIIIlIllIlllllllIIIIlllIlIIIlIIlIllllIlIIlIIIlllIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lllllIIlIllllIlIIIlllllIllIIlIIlIIIlIllIlllllllIIIIlllIlIIIlIIlIllllIlIIlIIIlllIlllll();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 21745) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 87;
            case 1 -> 208;
            case 2 -> 134;
            case 3 -> 92;
            case 4 -> 37;
            case 5 -> 70;
            case 6 -> 25;
            case 7 -> 104;
            case 8 -> 216;
            case 9 -> 93;
            case 10 -> 27;
            case 11 -> 139;
            case 12 -> 67;
            case 13 -> 149;
            case 14 -> 89;
            case 15 -> 117;
            case 16 -> 136;
            case 17 -> 254;
            case 18 -> 205;
            case 19 -> 203;
            case 20 -> 162;
            case 21 -> 201;
            case 22 -> 163;
            case 23 -> 137;
            case 24 -> 50;
            case 25 -> 30;
            case 26 -> 122;
            case 27 -> 22;
            case 28 -> 61;
            case 29 -> 179;
            case 30 -> 250;
            case 31 -> 17;
            case 32 -> 164;
            case 33 -> 105;
            case 34 -> 185;
            case 35 -> 29;
            case 36 -> 155;
            case 37 -> 47;
            case 38 -> 76;
            case 39 -> 103;
            case 40 -> 166;
            case 41 -> 127;
            case 42 -> 48;
            case 43 -> 94;
            case 44 -> 39;
            case 45 -> 150;
            case 46 -> 158;
            case 47 -> 227;
            case 48 -> 217;
            case 49 -> 15;
            case 50 -> 234;
            case 51 -> 190;
            case 52 -> 83;
            case 53 -> 146;
            case 54 -> 194;
            case 55 -> 169;
            case 56 -> 72;
            case 57 -> 238;
            case 58 -> 152;
            case 59 -> 239;
            case 60 -> 189;
            case 61 -> 204;
            case 62 -> 175;
            case 63 -> 112;
            case 64 -> 153;
            case 65 -> 195;
            case 66 -> 181;
            case 67 -> 120;
            case 68 -> 209;
            case 69 -> 85;
            case 70 -> 151;
            case 71 -> 98;
            case 72 -> 113;
            case 73 -> 19;
            case 74 -> 219;
            case 75 -> 111;
            case 76 -> 128;
            case 77 -> 215;
            case 78 -> 106;
            case 79 -> 249;
            case 80 -> 225;
            case 81 -> 214;
            case 82 -> 255;
            case 83 -> 60;
            case 84 -> 35;
            case 85 -> 230;
            case 86 -> 126;
            case 87 -> 10;
            case 88 -> 32;
            case 89 -> 141;
            case 90 -> 36;
            case 91 -> 223;
            case 92 -> 45;
            case 93 -> 53;
            case 94 -> 143;
            case 95 -> 20;
            case 96 -> 65;
            case 97 -> 95;
            case 98 -> 88;
            case 99 -> 0;
            case 100 -> 14;
            case 101 -> 251;
            case 102 -> 44;
            case 103 -> 231;
            case 104 -> 133;
            case 105 -> 46;
            case 106 -> 235;
            case 107 -> 110;
            case 108 -> 180;
            case 109 -> 26;
            case 110 -> 129;
            case 111 -> 91;
            case 112 -> 246;
            case 113 -> 99;
            case 114 -> 207;
            case 115 -> 200;
            case 116 -> 12;
            case 117 -> 124;
            case 118 -> 66;
            case 119 -> 75;
            case 120 -> 64;
            case 121 -> 80;
            case 122 -> 161;
            case 123 -> 71;
            case 124 -> 101;
            case 125 -> 4;
            case 126 -> 16;
            case 127 -> 1;
            case 128 -> 3;
            case 129 -> 59;
            case 130 -> 211;
            case 131 -> 187;
            case 132 -> 157;
            case 133 -> 108;
            case 134 -> 69;
            case 135 -> 96;
            case 136 -> 43;
            case 137 -> 243;
            case 138 -> 220;
            case 139 -> 247;
            case 140 -> 174;
            case 141 -> 49;
            case 142 -> 52;
            case 143 -> 233;
            case 144 -> 138;
            case 145 -> 236;
            case 146 -> 224;
            case 147 -> 229;
            case 148 -> 115;
            case 149 -> 147;
            case 150 -> 212;
            case 151 -> 253;
            case 152 -> 183;
            case 153 -> 132;
            case 154 -> 63;
            case 155 -> 51;
            case 156 -> 97;
            case 157 -> 240;
            case 158 -> 102;
            case 159 -> 130;
            case 160 -> 197;
            case 161 -> 206;
            case 162 -> 178;
            case 163 -> 192;
            case 164 -> 11;
            case 165 -> 23;
            case 166 -> 78;
            case 167 -> 218;
            case 168 -> 13;
            case 169 -> 74;
            case 170 -> 90;
            case 171 -> 165;
            case 172 -> 142;
            case 173 -> 167;
            case 174 -> 28;
            case 175 -> 232;
            case 176 -> 154;
            case 177 -> 135;
            case 178 -> 148;
            case 179 -> 237;
            case 180 -> 109;
            case 181 -> 114;
            case 182 -> 58;
            case 183 -> 248;
            case 184 -> 160;
            case 185 -> 228;
            case 186 -> 222;
            case 187 -> 8;
            case 188 -> 186;
            case 189 -> 241;
            case 190 -> 156;
            case 191 -> 42;
            case 192 -> 107;
            case 193 -> 73;
            case 194 -> 33;
            case 195 -> 171;
            case 196 -> 84;
            case 197 -> 116;
            case 198 -> 5;
            case 199 -> 21;
            case 200 -> 193;
            case 201 -> 184;
            case 202 -> 196;
            case 203 -> 210;
            case 204 -> 77;
            case 205 -> 119;
            case 206 -> 86;
            case 207 -> 6;
            case 208 -> 170;
            case 209 -> 125;
            case 210 -> 118;
            case 211 -> 182;
            case 212 -> 144;
            case 213 -> 40;
            case 214 -> 173;
            case 215 -> 54;
            case 216 -> 145;
            case 217 -> 100;
            case 218 -> 245;
            case 219 -> 68;
            case 220 -> 34;
            case 221 -> 188;
            case 222 -> 57;
            case 223 -> 226;
            case 224 -> 252;
            case 225 -> 177;
            case 226 -> 55;
            case 227 -> 82;
            case 228 -> 121;
            case 229 -> 2;
            case 230 -> 140;
            case 231 -> 131;
            case 232 -> 159;
            case 233 -> 81;
            case 234 -> 191;
            case 235 -> 123;
            case 236 -> 198;
            case 237 -> 62;
            case 238 -> 168;
            case 239 -> 18;
            case 240 -> 7;
            case 241 -> 24;
            case 242 -> 31;
            case 243 -> 9;
            case 244 -> 79;
            case 245 -> 242;
            case 246 -> 176;
            case 247 -> 41;
            case 248 -> 56;
            case 249 -> 221;
            case 250 -> 38;
            case 251 -> 199;
            case 252 -> 244;
            case 253 -> 202;
            case 254 -> 213;
            default -> 172;
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
