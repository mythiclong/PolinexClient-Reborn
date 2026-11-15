package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   public IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI() {
      short var10001 = 11126;
      short var10002 = 19349;
      var10002 = 11124;
      short var10003 = -2060;
      short var10004 = 11127;
      short var10005 = -4728;
      super(
         "Auto Filet O Fortune",
         "Automatically eats a Filet O Fortune when there is one in your hotbar.",
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
      String var2 = "^t\u0085pú\u0006¾p\u009cÈ0<ÎËÀï½þ³\u00ad\u0006Õ\u001ac$1kF(KK\u0097nÝÕÍIÏ\u0000HTdë£\u0093\u00008°¯OÒX1\u000e\u0003Ø6\u0091Þ\u0084½\u0015\u008fN\u0018$\u0005ègXi-áø\u0000Ï\fü\u008f¾ñ q\u00186\rO Z(\u001c\u0003¢\"þOO&";
      int var4 = "^t\u0085pú\u0006¾p\u009cÈ0<ÎËÀï½þ³\u00ad\u0006Õ\u001ac$1kF(KK\u0097nÝÕÍIÏ\u0000HTdë£\u0093\u00008°¯OÒX1\u000e\u0003Ø6\u0091Þ\u0084½\u0015\u008fN\u0018$\u0005ègXi-áø\u0000Ï\fü\u008f¾ñ q\u00186\rO Z(\u001c\u0003¢\"þOO&"
         .length();
      char var1 = 20;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 122;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 122;
               var10006 = var6;
            } else {
               var13 = 122;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 122;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 9;
                  case 1 -> 89;
                  case 2 -> 71;
                  case 3 -> 84;
                  case 4 -> 77;
                  case 5 -> 115;
                  default -> 48;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 11126) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 74;
            case 1 -> 197;
            case 2 -> 43;
            case 3 -> 86;
            case 4 -> 121;
            case 5 -> 120;
            case 6 -> 175;
            case 7 -> 164;
            case 8 -> 38;
            case 9 -> 236;
            case 10 -> 7;
            case 11 -> 251;
            case 12 -> 153;
            case 13 -> 80;
            case 14 -> 147;
            case 15 -> 57;
            case 16 -> 87;
            case 17 -> 93;
            case 18 -> 228;
            case 19 -> 206;
            case 20 -> 230;
            case 21 -> 114;
            case 22 -> 223;
            case 23 -> 196;
            case 24 -> 12;
            case 25 -> 17;
            case 26 -> 22;
            case 27 -> 123;
            case 28 -> 156;
            case 29 -> 117;
            case 30 -> 71;
            case 31 -> 76;
            case 32 -> 94;
            case 33 -> 190;
            case 34 -> 149;
            case 35 -> 36;
            case 36 -> 247;
            case 37 -> 2;
            case 38 -> 33;
            case 39 -> 66;
            case 40 -> 211;
            case 41 -> 194;
            case 42 -> 1;
            case 43 -> 216;
            case 44 -> 90;
            case 45 -> 41;
            case 46 -> 193;
            case 47 -> 125;
            case 48 -> 0;
            case 49 -> 24;
            case 50 -> 161;
            case 51 -> 255;
            case 52 -> 207;
            case 53 -> 15;
            case 54 -> 25;
            case 55 -> 20;
            case 56 -> 198;
            case 57 -> 136;
            case 58 -> 170;
            case 59 -> 10;
            case 60 -> 134;
            case 61 -> 68;
            case 62 -> 69;
            case 63 -> 163;
            case 64 -> 199;
            case 65 -> 189;
            case 66 -> 101;
            case 67 -> 65;
            case 68 -> 201;
            case 69 -> 192;
            case 70 -> 75;
            case 71 -> 225;
            case 72 -> 47;
            case 73 -> 210;
            case 74 -> 178;
            case 75 -> 88;
            case 76 -> 4;
            case 77 -> 177;
            case 78 -> 112;
            case 79 -> 137;
            case 80 -> 48;
            case 81 -> 13;
            case 82 -> 160;
            case 83 -> 181;
            case 84 -> 246;
            case 85 -> 183;
            case 86 -> 150;
            case 87 -> 23;
            case 88 -> 29;
            case 89 -> 16;
            case 90 -> 204;
            case 91 -> 218;
            case 92 -> 146;
            case 93 -> 131;
            case 94 -> 91;
            case 95 -> 238;
            case 96 -> 44;
            case 97 -> 49;
            case 98 -> 63;
            case 99 -> 244;
            case 100 -> 100;
            case 101 -> 98;
            case 102 -> 127;
            case 103 -> 19;
            case 104 -> 119;
            case 105 -> 167;
            case 106 -> 104;
            case 107 -> 73;
            case 108 -> 95;
            case 109 -> 188;
            case 110 -> 6;
            case 111 -> 162;
            case 112 -> 180;
            case 113 -> 148;
            case 114 -> 78;
            case 115 -> 9;
            case 116 -> 99;
            case 117 -> 132;
            case 118 -> 187;
            case 119 -> 32;
            case 120 -> 219;
            case 121 -> 237;
            case 122 -> 252;
            case 123 -> 27;
            case 124 -> 55;
            case 125 -> 62;
            case 126 -> 245;
            case 127 -> 18;
            case 128 -> 227;
            case 129 -> 232;
            case 130 -> 37;
            case 131 -> 138;
            case 132 -> 173;
            case 133 -> 124;
            case 134 -> 184;
            case 135 -> 243;
            case 136 -> 215;
            case 137 -> 103;
            case 138 -> 34;
            case 139 -> 158;
            case 140 -> 224;
            case 141 -> 84;
            case 142 -> 231;
            case 143 -> 111;
            case 144 -> 195;
            case 145 -> 56;
            case 146 -> 110;
            case 147 -> 92;
            case 148 -> 242;
            case 149 -> 35;
            case 150 -> 67;
            case 151 -> 185;
            case 152 -> 217;
            case 153 -> 234;
            case 154 -> 202;
            case 155 -> 54;
            case 156 -> 171;
            case 157 -> 191;
            case 158 -> 81;
            case 159 -> 60;
            case 160 -> 254;
            case 161 -> 182;
            case 162 -> 240;
            case 163 -> 45;
            case 164 -> 52;
            case 165 -> 135;
            case 166 -> 157;
            case 167 -> 79;
            case 168 -> 214;
            case 169 -> 129;
            case 170 -> 169;
            case 171 -> 222;
            case 172 -> 59;
            case 173 -> 250;
            case 174 -> 235;
            case 175 -> 8;
            case 176 -> 109;
            case 177 -> 165;
            case 178 -> 154;
            case 179 -> 155;
            case 180 -> 11;
            case 181 -> 166;
            case 182 -> 72;
            case 183 -> 3;
            case 184 -> 58;
            case 185 -> 42;
            case 186 -> 31;
            case 187 -> 77;
            case 188 -> 140;
            case 189 -> 253;
            case 190 -> 46;
            case 191 -> 97;
            case 192 -> 141;
            case 193 -> 168;
            case 194 -> 82;
            case 195 -> 200;
            case 196 -> 40;
            case 197 -> 220;
            case 198 -> 233;
            case 199 -> 5;
            case 200 -> 143;
            case 201 -> 208;
            case 202 -> 70;
            case 203 -> 64;
            case 204 -> 122;
            case 205 -> 115;
            case 206 -> 139;
            case 207 -> 145;
            case 208 -> 248;
            case 209 -> 14;
            case 210 -> 144;
            case 211 -> 179;
            case 212 -> 226;
            case 213 -> 105;
            case 214 -> 39;
            case 215 -> 85;
            case 216 -> 26;
            case 217 -> 83;
            case 218 -> 172;
            case 219 -> 133;
            case 220 -> 118;
            case 221 -> 221;
            case 222 -> 152;
            case 223 -> 28;
            case 224 -> 130;
            case 225 -> 107;
            case 226 -> 229;
            case 227 -> 176;
            case 228 -> 142;
            case 229 -> 50;
            case 230 -> 96;
            case 231 -> 61;
            case 232 -> 212;
            case 233 -> 186;
            case 234 -> 30;
            case 235 -> 205;
            case 236 -> 89;
            case 237 -> 249;
            case 238 -> 209;
            case 239 -> 213;
            case 240 -> 239;
            case 241 -> 116;
            case 242 -> 102;
            case 243 -> 53;
            case 244 -> 51;
            case 245 -> 106;
            case 246 -> 126;
            case 247 -> 151;
            case 248 -> 174;
            case 249 -> 159;
            case 250 -> 108;
            case 251 -> 113;
            case 252 -> 203;
            case 253 -> 21;
            case 254 -> 241;
            default -> 128;
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

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
