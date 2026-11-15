package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class llllllIlllllIllIlllIIIIlllIlIlIlIIlllIllIlIllIIIlIIIIlIIIIIIIIllIIlIIlllllIlllIllllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llllllIlllllIllIlllIIIIlllIlIlIlIIlllIllIlIllIIIlIIIIlIIIIIIIIllIIlIIlllllIlllIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static llllllIlllllIllIlllIIIIlllIlIlIlIIlllIllIlIllIIIlIIIIlIIIIIIIIllIIlIIlllllIlllIllllll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private llllllIlllllIllIlllIIIIlllIlIlIlIIlllIllIlIllIIIlIIIIlIIIIIIIIllIIlIIlllllIlllIllllll() {
      short var10001 = 7160;
      short var10002 = 23913;
      var10002 = 7163;
      short var10003 = -14550;
      short var10004 = 7162;
      short var10005 = -23813;
      super(
         "Legacy Sneak",
         "Changes the sneak height back to 1.8.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "Misc"
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "#å¤\u008b%\u0018\u0085\u001e«âo\u000f t\u000f\u0001¯F\u0014\u0014¼wê\u008bÀÖ\u0012\nê\u0014Î\u001b?á4\u0019ÝòÔÿ\u0011Æ\f5SSÒ\u0089²µ÷\u0000õÒ\u0017";
      int var4 = "#å¤\u008b%\u0018\u0085\u001e«âo\u000f t\u000f\u0001¯F\u0014\u0014¼wê\u008bÀÖ\u0012\nê\u0014Î\u001b?á4\u0019ÝòÔÿ\u0011Æ\f5SSÒ\u0089²µ÷\u0000õÒ\u0017"
         .length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 98;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 98;
               var10006 = var6;
            } else {
               var13 = 98;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 98;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 1;
                  case 1 -> 90;
                  case 2 -> 89;
                  case 3 -> 117;
                  case 4 -> 14;
                  case 5 -> 92;
                  default -> 68;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llllllIlllllIllIlllIIIIlllIlIlIlIIlllIllIlIllIIIlIIIIlIIIIIIIIllIIlIIlllllIlllIllllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llllllIlllllIllIlllIIIIlllIlIlIlIIlllIllIlIllIIIlIIIIlIIIIIIIIllIIlIIlllllIlllIllllll();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 7162) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 139;
            case 1 -> 244;
            case 2 -> 32;
            case 3 -> 212;
            case 4 -> 103;
            case 5 -> 231;
            case 6 -> 164;
            case 7 -> 126;
            case 8 -> 46;
            case 9 -> 148;
            case 10 -> 58;
            case 11 -> 17;
            case 12 -> 208;
            case 13 -> 243;
            case 14 -> 69;
            case 15 -> 137;
            case 16 -> 56;
            case 17 -> 153;
            case 18 -> 217;
            case 19 -> 181;
            case 20 -> 80;
            case 21 -> 216;
            case 22 -> 142;
            case 23 -> 125;
            case 24 -> 65;
            case 25 -> 234;
            case 26 -> 1;
            case 27 -> 105;
            case 28 -> 74;
            case 29 -> 239;
            case 30 -> 131;
            case 31 -> 248;
            case 32 -> 204;
            case 33 -> 92;
            case 34 -> 195;
            case 35 -> 20;
            case 36 -> 206;
            case 37 -> 255;
            case 38 -> 129;
            case 39 -> 144;
            case 40 -> 15;
            case 41 -> 228;
            case 42 -> 63;
            case 43 -> 42;
            case 44 -> 110;
            case 45 -> 93;
            case 46 -> 220;
            case 47 -> 198;
            case 48 -> 183;
            case 49 -> 250;
            case 50 -> 81;
            case 51 -> 186;
            case 52 -> 224;
            case 53 -> 165;
            case 54 -> 194;
            case 55 -> 150;
            case 56 -> 176;
            case 57 -> 6;
            case 58 -> 134;
            case 59 -> 233;
            case 60 -> 128;
            case 61 -> 53;
            case 62 -> 112;
            case 63 -> 118;
            case 64 -> 238;
            case 65 -> 102;
            case 66 -> 47;
            case 67 -> 199;
            case 68 -> 113;
            case 69 -> 101;
            case 70 -> 138;
            case 71 -> 175;
            case 72 -> 14;
            case 73 -> 4;
            case 74 -> 178;
            case 75 -> 193;
            case 76 -> 124;
            case 77 -> 22;
            case 78 -> 108;
            case 79 -> 54;
            case 80 -> 162;
            case 81 -> 100;
            case 82 -> 187;
            case 83 -> 114;
            case 84 -> 232;
            case 85 -> 68;
            case 86 -> 79;
            case 87 -> 57;
            case 88 -> 48;
            case 89 -> 203;
            case 90 -> 70;
            case 91 -> 117;
            case 92 -> 10;
            case 93 -> 78;
            case 94 -> 168;
            case 95 -> 28;
            case 96 -> 230;
            case 97 -> 133;
            case 98 -> 241;
            case 99 -> 132;
            case 100 -> 215;
            case 101 -> 210;
            case 102 -> 254;
            case 103 -> 104;
            case 104 -> 226;
            case 105 -> 94;
            case 106 -> 75;
            case 107 -> 157;
            case 108 -> 31;
            case 109 -> 5;
            case 110 -> 52;
            case 111 -> 119;
            case 112 -> 229;
            case 113 -> 184;
            case 114 -> 77;
            case 115 -> 155;
            case 116 -> 218;
            case 117 -> 59;
            case 118 -> 90;
            case 119 -> 190;
            case 120 -> 8;
            case 121 -> 211;
            case 122 -> 247;
            case 123 -> 242;
            case 124 -> 27;
            case 125 -> 64;
            case 126 -> 166;
            case 127 -> 39;
            case 128 -> 154;
            case 129 -> 25;
            case 130 -> 44;
            case 131 -> 60;
            case 132 -> 209;
            case 133 -> 219;
            case 134 -> 189;
            case 135 -> 73;
            case 136 -> 172;
            case 137 -> 227;
            case 138 -> 163;
            case 139 -> 86;
            case 140 -> 19;
            case 141 -> 91;
            case 142 -> 115;
            case 143 -> 51;
            case 144 -> 40;
            case 145 -> 98;
            case 146 -> 26;
            case 147 -> 107;
            case 148 -> 185;
            case 149 -> 12;
            case 150 -> 30;
            case 151 -> 246;
            case 152 -> 72;
            case 153 -> 173;
            case 154 -> 13;
            case 155 -> 3;
            case 156 -> 213;
            case 157 -> 221;
            case 158 -> 62;
            case 159 -> 160;
            case 160 -> 182;
            case 161 -> 159;
            case 162 -> 151;
            case 163 -> 169;
            case 164 -> 252;
            case 165 -> 97;
            case 166 -> 202;
            case 167 -> 21;
            case 168 -> 161;
            case 169 -> 167;
            case 170 -> 24;
            case 171 -> 111;
            case 172 -> 200;
            case 173 -> 43;
            case 174 -> 141;
            case 175 -> 34;
            case 176 -> 253;
            case 177 -> 87;
            case 178 -> 225;
            case 179 -> 109;
            case 180 -> 50;
            case 181 -> 127;
            case 182 -> 251;
            case 183 -> 171;
            case 184 -> 214;
            case 185 -> 16;
            case 186 -> 33;
            case 187 -> 99;
            case 188 -> 18;
            case 189 -> 122;
            case 190 -> 116;
            case 191 -> 83;
            case 192 -> 145;
            case 193 -> 36;
            case 194 -> 156;
            case 195 -> 177;
            case 196 -> 179;
            case 197 -> 2;
            case 198 -> 236;
            case 199 -> 120;
            case 200 -> 222;
            case 201 -> 235;
            case 202 -> 197;
            case 203 -> 140;
            case 204 -> 85;
            case 205 -> 76;
            case 206 -> 82;
            case 207 -> 84;
            case 208 -> 240;
            case 209 -> 38;
            case 210 -> 55;
            case 211 -> 49;
            case 212 -> 147;
            case 213 -> 135;
            case 214 -> 37;
            case 215 -> 89;
            case 216 -> 29;
            case 217 -> 192;
            case 218 -> 201;
            case 219 -> 0;
            case 220 -> 106;
            case 221 -> 45;
            case 222 -> 67;
            case 223 -> 245;
            case 224 -> 205;
            case 225 -> 191;
            case 226 -> 158;
            case 227 -> 237;
            case 228 -> 35;
            case 229 -> 223;
            case 230 -> 23;
            case 231 -> 152;
            case 232 -> 180;
            case 233 -> 9;
            case 234 -> 41;
            case 235 -> 7;
            case 236 -> 11;
            case 237 -> 66;
            case 238 -> 95;
            case 239 -> 146;
            case 240 -> 61;
            case 241 -> 170;
            case 242 -> 88;
            case 243 -> 196;
            case 244 -> 71;
            case 245 -> 188;
            case 246 -> 249;
            case 247 -> 121;
            case 248 -> 136;
            case 249 -> 174;
            case 250 -> 96;
            case 251 -> 143;
            case 252 -> 207;
            case 253 -> 123;
            case 254 -> 149;
            default -> 130;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {  }
   }
}
