package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   @NotNull
   public static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll() {
      short var10001 = -5359;
      short var10002 = -31128;
      var10002 = -5360;
      short var10003 = -29141;
      short var10004 = -5358;
      short var10005 = -2362;
      super(
         "Tab In on Check",
         "Focuses the game window when a failsafe triggers, so you tab back in.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         "Failsafes",
         true,
         0
      , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = " \u009düôÙ2{§Ö\u00adõÊ\u00022®¾ ÙsÞ`\u001fCT6ü(ºäE\u008d3Î·ÖÉ\u008aWÉZ\u00963Ií\u001fã Ô:¯M«$´Ý\u009b\u0011\fr©\u0019kH(ÿ? \u0097|\u000fï\u0083T\u00ad×í\u0094y\b\u0098Qev\u0084d\tÁáÊ\u00adT'ßÄò";
      int var4 = " \u009düôÙ2{§Ö\u00adõÊ\u00022®¾ ÙsÞ`\u001fCT6ü(ºäE\u008d3Î·ÖÉ\u008aWÉZ\u00963Ií\u001fã Ô:¯M«$´Ý\u009b\u0011\fr©\u0019kH(ÿ? \u0097|\u000fï\u0083T\u00ad×í\u0094y\b\u0098Qev\u0084d\tÁáÊ\u00adT'ßÄò"
         .length();
      char var1 = 'E';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 15;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 15;
               var10006 = var6;
            } else {
               var13 = 15;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 15;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 45;
                  case 1 -> 90;
                  case 2 -> 94;
                  case 3 -> 21;
                  case 4 -> 31;
                  case 5 -> 94;
                  default -> 35;
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
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -5360) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 193;
            case 1 -> 191;
            case 2 -> 231;
            case 3 -> 239;
            case 4 -> 157;
            case 5 -> 248;
            case 6 -> 6;
            case 7 -> 110;
            case 8 -> 52;
            case 9 -> 80;
            case 10 -> 138;
            case 11 -> 184;
            case 12 -> 103;
            case 13 -> 220;
            case 14 -> 131;
            case 15 -> 54;
            case 16 -> 63;
            case 17 -> 209;
            case 18 -> 252;
            case 19 -> 147;
            case 20 -> 3;
            case 21 -> 64;
            case 22 -> 195;
            case 23 -> 255;
            case 24 -> 127;
            case 25 -> 27;
            case 26 -> 218;
            case 27 -> 246;
            case 28 -> 238;
            case 29 -> 45;
            case 30 -> 240;
            case 31 -> 156;
            case 32 -> 221;
            case 33 -> 203;
            case 34 -> 194;
            case 35 -> 91;
            case 36 -> 42;
            case 37 -> 85;
            case 38 -> 249;
            case 39 -> 251;
            case 40 -> 135;
            case 41 -> 34;
            case 42 -> 142;
            case 43 -> 213;
            case 44 -> 152;
            case 45 -> 115;
            case 46 -> 124;
            case 47 -> 159;
            case 48 -> 117;
            case 49 -> 199;
            case 50 -> 217;
            case 51 -> 190;
            case 52 -> 32;
            case 53 -> 50;
            case 54 -> 243;
            case 55 -> 72;
            case 56 -> 73;
            case 57 -> 70;
            case 58 -> 10;
            case 59 -> 17;
            case 60 -> 59;
            case 61 -> 4;
            case 62 -> 206;
            case 63 -> 44;
            case 64 -> 222;
            case 65 -> 153;
            case 66 -> 116;
            case 67 -> 141;
            case 68 -> 13;
            case 69 -> 143;
            case 70 -> 174;
            case 71 -> 86;
            case 72 -> 16;
            case 73 -> 114;
            case 74 -> 90;
            case 75 -> 205;
            case 76 -> 181;
            case 77 -> 9;
            case 78 -> 228;
            case 79 -> 177;
            case 80 -> 14;
            case 81 -> 254;
            case 82 -> 166;
            case 83 -> 20;
            case 84 -> 151;
            case 85 -> 126;
            case 86 -> 176;
            case 87 -> 49;
            case 88 -> 107;
            case 89 -> 175;
            case 90 -> 188;
            case 91 -> 106;
            case 92 -> 125;
            case 93 -> 56;
            case 94 -> 145;
            case 95 -> 192;
            case 96 -> 172;
            case 97 -> 61;
            case 98 -> 128;
            case 99 -> 94;
            case 100 -> 215;
            case 101 -> 210;
            case 102 -> 139;
            case 103 -> 11;
            case 104 -> 169;
            case 105 -> 79;
            case 106 -> 211;
            case 107 -> 28;
            case 108 -> 158;
            case 109 -> 183;
            case 110 -> 214;
            case 111 -> 204;
            case 112 -> 37;
            case 113 -> 30;
            case 114 -> 89;
            case 115 -> 19;
            case 116 -> 109;
            case 117 -> 163;
            case 118 -> 144;
            case 119 -> 179;
            case 120 -> 233;
            case 121 -> 121;
            case 122 -> 43;
            case 123 -> 99;
            case 124 -> 77;
            case 125 -> 161;
            case 126 -> 104;
            case 127 -> 67;
            case 128 -> 253;
            case 129 -> 134;
            case 130 -> 198;
            case 131 -> 241;
            case 132 -> 66;
            case 133 -> 149;
            case 134 -> 148;
            case 135 -> 65;
            case 136 -> 75;
            case 137 -> 164;
            case 138 -> 12;
            case 139 -> 250;
            case 140 -> 155;
            case 141 -> 122;
            case 142 -> 185;
            case 143 -> 229;
            case 144 -> 171;
            case 145 -> 165;
            case 146 -> 47;
            case 147 -> 5;
            case 148 -> 178;
            case 149 -> 208;
            case 150 -> 112;
            case 151 -> 1;
            case 152 -> 111;
            case 153 -> 31;
            case 154 -> 133;
            case 155 -> 21;
            case 156 -> 140;
            case 157 -> 38;
            case 158 -> 25;
            case 159 -> 230;
            case 160 -> 160;
            case 161 -> 92;
            case 162 -> 18;
            case 163 -> 93;
            case 164 -> 244;
            case 165 -> 26;
            case 166 -> 226;
            case 167 -> 8;
            case 168 -> 242;
            case 169 -> 81;
            case 170 -> 57;
            case 171 -> 15;
            case 172 -> 88;
            case 173 -> 227;
            case 174 -> 97;
            case 175 -> 223;
            case 176 -> 170;
            case 177 -> 202;
            case 178 -> 247;
            case 179 -> 196;
            case 180 -> 76;
            case 181 -> 55;
            case 182 -> 102;
            case 183 -> 41;
            case 184 -> 95;
            case 185 -> 7;
            case 186 -> 216;
            case 187 -> 224;
            case 188 -> 123;
            case 189 -> 46;
            case 190 -> 234;
            case 191 -> 35;
            case 192 -> 146;
            case 193 -> 24;
            case 194 -> 130;
            case 195 -> 53;
            case 196 -> 129;
            case 197 -> 29;
            case 198 -> 197;
            case 199 -> 48;
            case 200 -> 212;
            case 201 -> 98;
            case 202 -> 82;
            case 203 -> 62;
            case 204 -> 60;
            case 205 -> 207;
            case 206 -> 83;
            case 207 -> 74;
            case 208 -> 236;
            case 209 -> 187;
            case 210 -> 189;
            case 211 -> 154;
            case 212 -> 225;
            case 213 -> 137;
            case 214 -> 235;
            case 215 -> 186;
            case 216 -> 36;
            case 217 -> 78;
            case 218 -> 162;
            case 219 -> 22;
            case 220 -> 200;
            case 221 -> 51;
            case 222 -> 87;
            case 223 -> 118;
            case 224 -> 173;
            case 225 -> 120;
            case 226 -> 132;
            case 227 -> 33;
            case 228 -> 180;
            case 229 -> 39;
            case 230 -> 119;
            case 231 -> 96;
            case 232 -> 237;
            case 233 -> 101;
            case 234 -> 100;
            case 235 -> 23;
            case 236 -> 113;
            case 237 -> 219;
            case 238 -> 2;
            case 239 -> 69;
            case 240 -> 167;
            case 241 -> 0;
            case 242 -> 201;
            case 243 -> 150;
            case 244 -> 136;
            case 245 -> 58;
            case 246 -> 68;
            case 247 -> 108;
            case 248 -> 232;
            case 249 -> 245;
            case 250 -> 40;
            case 251 -> 182;
            case 252 -> 105;
            case 253 -> 71;
            case 254 -> 168;
            default -> 84;
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

      public final void a() {
         IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .ap()
            .execute(
               llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll::b
            );
      }

      private static final void b() {
         String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
         long var1 = IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .ap()
            .getWindow()
            .handle();
         String[] var0 = var10000;
         int var4 = GLFW.glfwGetWindowAttrib(var1, 131074);
         if (var0 != null) {
            var4 = var4 == 1 ? 1 : 0;
         }

         int var3 = var4;
         if (var0 != null) {
            if (var3 != 0) {
               GLFW.glfwRestoreWindow(var1);
            }

            GLFW.glfwShowWindow(var1);
            GLFW.glfwRequestWindowAttention(var1);
            GLFW.glfwFocusWindow(var1);
         }
      }
   }
}
