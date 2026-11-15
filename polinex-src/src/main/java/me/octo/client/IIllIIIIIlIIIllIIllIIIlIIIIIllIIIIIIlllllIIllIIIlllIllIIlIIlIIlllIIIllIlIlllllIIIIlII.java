package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII() {
      short var10001 = -7218;
      short var10002 = -7269;
      var10002 = -7220;
      short var10003 = 20290;
      short var10004 = -7219;
      short var10005 = 11650;
      super(
         "Hide Visuals",
         "Hides all Polinex visuals.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         "Render"
      );
   }

   @Override
   public boolean b() {
      return me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÿÐ'c\u0084\u008dje)\u0090Ì¢§9çCÚÙ¡~yb\u0016\u0006¤ô\u0006m*&°ù\u0084\f¸ÜÏâÊË\u0092\n&À+Ý";
      int var4 = "ÿÐ'c\u0084\u008dje)\u0090Ì¢§9çCÚÙ¡~yb\u0016\u0006¤ô\u0006m*&°ù\u0084\f¸ÜÏâÊË\u0092\n&À+Ý".length();
      char var1 = 26;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 71;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 71;
               var10006 = var6;
            } else {
               var13 = 71;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 71;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 27;
                  case 1 -> 6;
                  case 2 -> 49;
                  case 3 -> 55;
                  case 4 -> 114;
                  case 5 -> 65;
                  default -> 103;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIllIIIIIlIIIllIIllIIIlIIIIIllIIIIIIlllllIIllIIIlllIllIIlIIlIIlllIIIllIlIlllllIIIIlII();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -7220) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 170;
            case 1 -> 221;
            case 2 -> 86;
            case 3 -> 205;
            case 4 -> 53;
            case 5 -> 136;
            case 6 -> 155;
            case 7 -> 185;
            case 8 -> 116;
            case 9 -> 132;
            case 10 -> 112;
            case 11 -> 191;
            case 12 -> 25;
            case 13 -> 15;
            case 14 -> 82;
            case 15 -> 138;
            case 16 -> 121;
            case 17 -> 192;
            case 18 -> 69;
            case 19 -> 22;
            case 20 -> 89;
            case 21 -> 233;
            case 22 -> 213;
            case 23 -> 198;
            case 24 -> 1;
            case 25 -> 144;
            case 26 -> 137;
            case 27 -> 100;
            case 28 -> 211;
            case 29 -> 142;
            case 30 -> 66;
            case 31 -> 79;
            case 32 -> 225;
            case 33 -> 24;
            case 34 -> 126;
            case 35 -> 49;
            case 36 -> 206;
            case 37 -> 37;
            case 38 -> 2;
            case 39 -> 115;
            case 40 -> 71;
            case 41 -> 182;
            case 42 -> 186;
            case 43 -> 196;
            case 44 -> 176;
            case 45 -> 150;
            case 46 -> 184;
            case 47 -> 38;
            case 48 -> 80;
            case 49 -> 31;
            case 50 -> 200;
            case 51 -> 232;
            case 52 -> 40;
            case 53 -> 61;
            case 54 -> 193;
            case 55 -> 54;
            case 56 -> 85;
            case 57 -> 234;
            case 58 -> 48;
            case 59 -> 156;
            case 60 -> 28;
            case 61 -> 172;
            case 62 -> 97;
            case 63 -> 91;
            case 64 -> 161;
            case 65 -> 26;
            case 66 -> 177;
            case 67 -> 241;
            case 68 -> 130;
            case 69 -> 73;
            case 70 -> 222;
            case 71 -> 32;
            case 72 -> 147;
            case 73 -> 123;
            case 74 -> 30;
            case 75 -> 152;
            case 76 -> 119;
            case 77 -> 51;
            case 78 -> 113;
            case 79 -> 209;
            case 80 -> 154;
            case 81 -> 195;
            case 82 -> 194;
            case 83 -> 8;
            case 84 -> 111;
            case 85 -> 237;
            case 86 -> 148;
            case 87 -> 9;
            case 88 -> 246;
            case 89 -> 201;
            case 90 -> 189;
            case 91 -> 143;
            case 92 -> 244;
            case 93 -> 114;
            case 94 -> 127;
            case 95 -> 65;
            case 96 -> 23;
            case 97 -> 145;
            case 98 -> 74;
            case 99 -> 81;
            case 100 -> 52;
            case 101 -> 157;
            case 102 -> 223;
            case 103 -> 250;
            case 104 -> 131;
            case 105 -> 33;
            case 106 -> 140;
            case 107 -> 203;
            case 108 -> 124;
            case 109 -> 14;
            case 110 -> 109;
            case 111 -> 108;
            case 112 -> 41;
            case 113 -> 46;
            case 114 -> 134;
            case 115 -> 84;
            case 116 -> 99;
            case 117 -> 164;
            case 118 -> 218;
            case 119 -> 44;
            case 120 -> 68;
            case 121 -> 163;
            case 122 -> 158;
            case 123 -> 122;
            case 124 -> 105;
            case 125 -> 78;
            case 126 -> 252;
            case 127 -> 95;
            case 128 -> 175;
            case 129 -> 57;
            case 130 -> 235;
            case 131 -> 242;
            case 132 -> 166;
            case 133 -> 202;
            case 134 -> 181;
            case 135 -> 247;
            case 136 -> 93;
            case 137 -> 165;
            case 138 -> 16;
            case 139 -> 214;
            case 140 -> 141;
            case 141 -> 0;
            case 142 -> 21;
            case 143 -> 204;
            case 144 -> 5;
            case 145 -> 104;
            case 146 -> 59;
            case 147 -> 207;
            case 148 -> 19;
            case 149 -> 187;
            case 150 -> 210;
            case 151 -> 199;
            case 152 -> 169;
            case 153 -> 128;
            case 154 -> 149;
            case 155 -> 212;
            case 156 -> 62;
            case 157 -> 13;
            case 158 -> 102;
            case 159 -> 197;
            case 160 -> 173;
            case 161 -> 183;
            case 162 -> 118;
            case 163 -> 87;
            case 164 -> 55;
            case 165 -> 43;
            case 166 -> 231;
            case 167 -> 129;
            case 168 -> 72;
            case 169 -> 135;
            case 170 -> 243;
            case 171 -> 56;
            case 172 -> 42;
            case 173 -> 50;
            case 174 -> 162;
            case 175 -> 17;
            case 176 -> 107;
            case 177 -> 6;
            case 178 -> 171;
            case 179 -> 64;
            case 180 -> 245;
            case 181 -> 18;
            case 182 -> 77;
            case 183 -> 12;
            case 184 -> 248;
            case 185 -> 216;
            case 186 -> 215;
            case 187 -> 190;
            case 188 -> 224;
            case 189 -> 70;
            case 190 -> 208;
            case 191 -> 20;
            case 192 -> 240;
            case 193 -> 120;
            case 194 -> 139;
            case 195 -> 106;
            case 196 -> 10;
            case 197 -> 133;
            case 198 -> 178;
            case 199 -> 217;
            case 200 -> 7;
            case 201 -> 179;
            case 202 -> 83;
            case 203 -> 249;
            case 204 -> 47;
            case 205 -> 255;
            case 206 -> 96;
            case 207 -> 67;
            case 208 -> 167;
            case 209 -> 110;
            case 210 -> 103;
            case 211 -> 153;
            case 212 -> 35;
            case 213 -> 39;
            case 214 -> 75;
            case 215 -> 220;
            case 216 -> 168;
            case 217 -> 27;
            case 218 -> 125;
            case 219 -> 251;
            case 220 -> 76;
            case 221 -> 229;
            case 222 -> 4;
            case 223 -> 236;
            case 224 -> 88;
            case 225 -> 60;
            case 226 -> 98;
            case 227 -> 3;
            case 228 -> 239;
            case 229 -> 117;
            case 230 -> 253;
            case 231 -> 45;
            case 232 -> 101;
            case 233 -> 180;
            case 234 -> 90;
            case 235 -> 174;
            case 236 -> 151;
            case 237 -> 63;
            case 238 -> 188;
            case 239 -> 58;
            case 240 -> 219;
            case 241 -> 92;
            case 242 -> 159;
            case 243 -> 34;
            case 244 -> 11;
            case 245 -> 160;
            case 246 -> 228;
            case 247 -> 238;
            case 248 -> 226;
            case 249 -> 36;
            case 250 -> 29;
            case 251 -> 146;
            case 252 -> 230;
            case 253 -> 227;
            case 254 -> 254;
            default -> 94;
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
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
