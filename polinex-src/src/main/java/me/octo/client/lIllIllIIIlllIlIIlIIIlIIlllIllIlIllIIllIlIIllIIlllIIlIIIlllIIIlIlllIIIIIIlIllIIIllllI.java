package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class lIllIllIIIlllIlIIlIIIlIIlllIllIlIllIIllIlIIllIIlllIIlIIIlllIIIlIlllIIIIIIlIllIIIllllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIllIllIIIlllIlIIlIIIlIIlllIllIlIllIIllIlIIllIIlllIIlIIIlllIIIlIlllIIIIIIlIllIIIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIllIllIIIlllIlIIlIIIlIIlllIllIlIllIIllIlIIllIIlllIIlIIIlllIIIlIlllIIIIIIlIllIIIllllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private lIllIllIIIlllIlIIlIIIlIIlllIllIlIllIIllIlIIllIIlllIIlIIIlllIIIlIlllIIIIIIlIllIIIllllI() {
      short var10001 = 26883;
      short var10002 = 2242;
      var10002 = 26881;
      short var10003 = 1505;
      short var10004 = 26880;
      short var10005 = -26697;
      super(
         "No Fire Animations",
         "Disables the fire overlay animation completely",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         "Render"
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "©#à\u000eW\u001eS\u0083ûs|Å4å\u0019\u001chÐ\u009f¶æÎ\u0001î÷\u00847(\u0010³M\u008d¹Úï+ED\u0085Nâ \u001bÐ\u009få\u0006\t\u0015=@Ul\u0012\u00955\u007f-\u0096§\u0001:ÐgU\u0016q\u0084Ø}[\u0011";
      int var4 = "©#à\u000eW\u001eS\u0083ûs|Å4å\u0019\u001chÐ\u009f¶æÎ\u0001î÷\u00847(\u0010³M\u008d¹Úï+ED\u0085Nâ \u001bÐ\u009få\u0006\t\u0015=@Ul\u0012\u00955\u007f-\u0096§\u0001:ÐgU\u0016q\u0084Ø}[\u0011"
         .length();
      char var1 = '.';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 70;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 70;
               var10006 = var6;
            } else {
               var13 = 70;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 70;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 95;
                  case 1 -> 20;
                  case 2 -> 15;
                  case 3 -> 67;
                  case 4 -> 91;
                  case 5 -> 24;
                  default -> 23;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIllIllIIIlllIlIIlIIIlIIlllIllIlIllIIllIlIIllIIlllIIlIIIlllIIIlIlllIIIIIIlIllIIIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIllIllIIIlllIlIIlIIIlIIlllIllIlIllIIllIlIIllIIlllIIlIIIlllIIIlIlllIIIIIIlIllIIIllllI();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 26881) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 255;
            case 1 -> 62;
            case 2 -> 254;
            case 3 -> 92;
            case 4 -> 177;
            case 5 -> 251;
            case 6 -> 161;
            case 7 -> 33;
            case 8 -> 222;
            case 9 -> 89;
            case 10 -> 29;
            case 11 -> 199;
            case 12 -> 48;
            case 13 -> 94;
            case 14 -> 202;
            case 15 -> 42;
            case 16 -> 117;
            case 17 -> 24;
            case 18 -> 78;
            case 19 -> 10;
            case 20 -> 226;
            case 21 -> 85;
            case 22 -> 43;
            case 23 -> 93;
            case 24 -> 28;
            case 25 -> 136;
            case 26 -> 88;
            case 27 -> 115;
            case 28 -> 32;
            case 29 -> 18;
            case 30 -> 151;
            case 31 -> 132;
            case 32 -> 184;
            case 33 -> 121;
            case 34 -> 185;
            case 35 -> 109;
            case 36 -> 156;
            case 37 -> 182;
            case 38 -> 13;
            case 39 -> 245;
            case 40 -> 37;
            case 41 -> 40;
            case 42 -> 246;
            case 43 -> 178;
            case 44 -> 180;
            case 45 -> 233;
            case 46 -> 57;
            case 47 -> 239;
            case 48 -> 68;
            case 49 -> 129;
            case 50 -> 130;
            case 51 -> 101;
            case 52 -> 186;
            case 53 -> 167;
            case 54 -> 179;
            case 55 -> 140;
            case 56 -> 219;
            case 57 -> 49;
            case 58 -> 8;
            case 59 -> 31;
            case 60 -> 229;
            case 61 -> 148;
            case 62 -> 158;
            case 63 -> 244;
            case 64 -> 77;
            case 65 -> 143;
            case 66 -> 252;
            case 67 -> 141;
            case 68 -> 56;
            case 69 -> 84;
            case 70 -> 242;
            case 71 -> 165;
            case 72 -> 119;
            case 73 -> 113;
            case 74 -> 197;
            case 75 -> 240;
            case 76 -> 231;
            case 77 -> 128;
            case 78 -> 64;
            case 79 -> 224;
            case 80 -> 59;
            case 81 -> 34;
            case 82 -> 60;
            case 83 -> 123;
            case 84 -> 153;
            case 85 -> 44;
            case 86 -> 215;
            case 87 -> 198;
            case 88 -> 225;
            case 89 -> 47;
            case 90 -> 100;
            case 91 -> 11;
            case 92 -> 201;
            case 93 -> 247;
            case 94 -> 71;
            case 95 -> 249;
            case 96 -> 27;
            case 97 -> 142;
            case 98 -> 4;
            case 99 -> 50;
            case 100 -> 111;
            case 101 -> 9;
            case 102 -> 235;
            case 103 -> 159;
            case 104 -> 39;
            case 105 -> 187;
            case 106 -> 192;
            case 107 -> 155;
            case 108 -> 175;
            case 109 -> 35;
            case 110 -> 73;
            case 111 -> 168;
            case 112 -> 216;
            case 113 -> 2;
            case 114 -> 149;
            case 115 -> 66;
            case 116 -> 188;
            case 117 -> 16;
            case 118 -> 70;
            case 119 -> 108;
            case 120 -> 104;
            case 121 -> 74;
            case 122 -> 212;
            case 123 -> 166;
            case 124 -> 173;
            case 125 -> 238;
            case 126 -> 7;
            case 127 -> 6;
            case 128 -> 230;
            case 129 -> 189;
            case 130 -> 81;
            case 131 -> 131;
            case 132 -> 218;
            case 133 -> 126;
            case 134 -> 120;
            case 135 -> 139;
            case 136 -> 91;
            case 137 -> 17;
            case 138 -> 206;
            case 139 -> 54;
            case 140 -> 0;
            case 141 -> 210;
            case 142 -> 163;
            case 143 -> 228;
            case 144 -> 232;
            case 145 -> 1;
            case 146 -> 152;
            case 147 -> 95;
            case 148 -> 41;
            case 149 -> 171;
            case 150 -> 138;
            case 151 -> 169;
            case 152 -> 227;
            case 153 -> 234;
            case 154 -> 236;
            case 155 -> 250;
            case 156 -> 86;
            case 157 -> 83;
            case 158 -> 55;
            case 159 -> 53;
            case 160 -> 14;
            case 161 -> 25;
            case 162 -> 176;
            case 163 -> 127;
            case 164 -> 133;
            case 165 -> 116;
            case 166 -> 82;
            case 167 -> 58;
            case 168 -> 221;
            case 169 -> 102;
            case 170 -> 21;
            case 171 -> 174;
            case 172 -> 52;
            case 173 -> 214;
            case 174 -> 134;
            case 175 -> 195;
            case 176 -> 237;
            case 177 -> 157;
            case 178 -> 3;
            case 179 -> 196;
            case 180 -> 211;
            case 181 -> 135;
            case 182 -> 208;
            case 183 -> 36;
            case 184 -> 194;
            case 185 -> 61;
            case 186 -> 137;
            case 187 -> 5;
            case 188 -> 205;
            case 189 -> 63;
            case 190 -> 200;
            case 191 -> 106;
            case 192 -> 193;
            case 193 -> 243;
            case 194 -> 15;
            case 195 -> 147;
            case 196 -> 75;
            case 197 -> 223;
            case 198 -> 114;
            case 199 -> 253;
            case 200 -> 98;
            case 201 -> 248;
            case 202 -> 105;
            case 203 -> 22;
            case 204 -> 107;
            case 205 -> 146;
            case 206 -> 122;
            case 207 -> 154;
            case 208 -> 160;
            case 209 -> 76;
            case 210 -> 110;
            case 211 -> 162;
            case 212 -> 203;
            case 213 -> 181;
            case 214 -> 241;
            case 215 -> 112;
            case 216 -> 96;
            case 217 -> 213;
            case 218 -> 150;
            case 219 -> 209;
            case 220 -> 125;
            case 221 -> 69;
            case 222 -> 207;
            case 223 -> 145;
            case 224 -> 67;
            case 225 -> 172;
            case 226 -> 87;
            case 227 -> 79;
            case 228 -> 26;
            case 229 -> 204;
            case 230 -> 118;
            case 231 -> 19;
            case 232 -> 217;
            case 233 -> 65;
            case 234 -> 45;
            case 235 -> 46;
            case 236 -> 170;
            case 237 -> 80;
            case 238 -> 99;
            case 239 -> 20;
            case 240 -> 72;
            case 241 -> 124;
            case 242 -> 97;
            case 243 -> 30;
            case 244 -> 191;
            case 245 -> 90;
            case 246 -> 51;
            case 247 -> 38;
            case 248 -> 164;
            case 249 -> 23;
            case 250 -> 12;
            case 251 -> 183;
            case 252 -> 190;
            case 253 -> 103;
            case 254 -> 220;
            default -> 144;
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
