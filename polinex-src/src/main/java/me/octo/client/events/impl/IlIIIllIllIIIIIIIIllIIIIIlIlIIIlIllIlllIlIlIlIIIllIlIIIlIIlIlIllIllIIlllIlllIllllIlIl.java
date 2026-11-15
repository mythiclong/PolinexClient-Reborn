package me.octo.client.events.impl;

import com.mojang.blaze3d.vertex.PoseStack;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Camera;
import org.jetbrains.annotations.NotNull;

public final class IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Vec3 p0, PXDyn p1) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T b(Vec3 p0, PXDyn p1) { return null; } // PX-FIX ovld

   public static <T> T d(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Vec3 p0, String p1) { return null; } // PX-FIX ovld

   public static <T> T c(Object p0, Object p1) { return null; } // PX-FIX ovld

   @NotNull
   private final PoseStack IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final Camera IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] c;
   private static String[] d;

   public IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl(@NotNull PoseStack var1, @NotNull Camera var2, float var3) {
      short var10001 = 18965;
      short var10002 = -15823;
      Intrinsics.checkNotNullParameter(var1, "matrices");
      var10001 = 18964;
      var10002 = -3326;
      Intrinsics.checkNotNullParameter(var2, "camera");
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
   }

   @NotNull
   public final PoseStack k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final Camera l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final float m() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public static void b(String var0) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var0;
   }

   public static String n() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0091£~eÿñ\b$\u009a\u001eUÒ\u0000IY";
      int var4 = "\u0091£~eÿñ\b$\u009a\u001eUÒ\u0000IY".length();
      b("ZdNg5b");
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 74;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 74;
               var10006 = var6;
            } else {
               var13 = 74;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 74;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 1;
                  case 1 -> 34;
                  case 2 -> 13;
                  case 3 -> 126;
                  case 4 -> 32;
                  case 5 -> 57;
                  default -> 53;
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
            c = var5;
            d = new String[2];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 18964) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 149;
            case 1 -> 137;
            case 2 -> 35;
            case 3 -> 211;
            case 4 -> 122;
            case 5 -> 75;
            case 6 -> 2;
            case 7 -> 101;
            case 8 -> 120;
            case 9 -> 105;
            case 10 -> 66;
            case 11 -> 170;
            case 12 -> 219;
            case 13 -> 70;
            case 14 -> 125;
            case 15 -> 235;
            case 16 -> 59;
            case 17 -> 181;
            case 18 -> 38;
            case 19 -> 96;
            case 20 -> 210;
            case 21 -> 176;
            case 22 -> 23;
            case 23 -> 142;
            case 24 -> 154;
            case 25 -> 126;
            case 26 -> 76;
            case 27 -> 135;
            case 28 -> 33;
            case 29 -> 175;
            case 30 -> 166;
            case 31 -> 202;
            case 32 -> 29;
            case 33 -> 212;
            case 34 -> 184;
            case 35 -> 251;
            case 36 -> 24;
            case 37 -> 119;
            case 38 -> 7;
            case 39 -> 57;
            case 40 -> 108;
            case 41 -> 72;
            case 42 -> 39;
            case 43 -> 58;
            case 44 -> 161;
            case 45 -> 50;
            case 46 -> 110;
            case 47 -> 89;
            case 48 -> 34;
            case 49 -> 133;
            case 50 -> 193;
            case 51 -> 92;
            case 52 -> 192;
            case 53 -> 213;
            case 54 -> 93;
            case 55 -> 32;
            case 56 -> 44;
            case 57 -> 204;
            case 58 -> 254;
            case 59 -> 64;
            case 60 -> 145;
            case 61 -> 41;
            case 62 -> 180;
            case 63 -> 62;
            case 64 -> 239;
            case 65 -> 169;
            case 66 -> 46;
            case 67 -> 1;
            case 68 -> 127;
            case 69 -> 123;
            case 70 -> 223;
            case 71 -> 68;
            case 72 -> 111;
            case 73 -> 255;
            case 74 -> 138;
            case 75 -> 187;
            case 76 -> 153;
            case 77 -> 146;
            case 78 -> 81;
            case 79 -> 217;
            case 80 -> 188;
            case 81 -> 67;
            case 82 -> 26;
            case 83 -> 54;
            case 84 -> 252;
            case 85 -> 84;
            case 86 -> 143;
            case 87 -> 218;
            case 88 -> 236;
            case 89 -> 94;
            case 90 -> 242;
            case 91 -> 167;
            case 92 -> 158;
            case 93 -> 247;
            case 94 -> 156;
            case 95 -> 200;
            case 96 -> 189;
            case 97 -> 9;
            case 98 -> 155;
            case 99 -> 98;
            case 100 -> 147;
            case 101 -> 195;
            case 102 -> 246;
            case 103 -> 11;
            case 104 -> 228;
            case 105 -> 88;
            case 106 -> 40;
            case 107 -> 114;
            case 108 -> 20;
            case 109 -> 16;
            case 110 -> 232;
            case 111 -> 47;
            case 112 -> 56;
            case 113 -> 238;
            case 114 -> 3;
            case 115 -> 173;
            case 116 -> 207;
            case 117 -> 65;
            case 118 -> 130;
            case 119 -> 69;
            case 120 -> 131;
            case 121 -> 243;
            case 122 -> 241;
            case 123 -> 55;
            case 124 -> 97;
            case 125 -> 0;
            case 126 -> 134;
            case 127 -> 106;
            case 128 -> 79;
            case 129 -> 115;
            case 130 -> 30;
            case 131 -> 171;
            case 132 -> 103;
            case 133 -> 199;
            case 134 -> 214;
            case 135 -> 136;
            case 136 -> 234;
            case 137 -> 183;
            case 138 -> 196;
            case 139 -> 43;
            case 140 -> 8;
            case 141 -> 91;
            case 142 -> 90;
            case 143 -> 144;
            case 144 -> 225;
            case 145 -> 78;
            case 146 -> 36;
            case 147 -> 224;
            case 148 -> 17;
            case 149 -> 150;
            case 150 -> 19;
            case 151 -> 99;
            case 152 -> 124;
            case 153 -> 15;
            case 154 -> 162;
            case 155 -> 128;
            case 156 -> 10;
            case 157 -> 22;
            case 158 -> 203;
            case 159 -> 186;
            case 160 -> 71;
            case 161 -> 152;
            case 162 -> 148;
            case 163 -> 237;
            case 164 -> 107;
            case 165 -> 185;
            case 166 -> 226;
            case 167 -> 248;
            case 168 -> 113;
            case 169 -> 102;
            case 170 -> 227;
            case 171 -> 48;
            case 172 -> 95;
            case 173 -> 197;
            case 174 -> 121;
            case 175 -> 77;
            case 176 -> 160;
            case 177 -> 216;
            case 178 -> 14;
            case 179 -> 208;
            case 180 -> 4;
            case 181 -> 245;
            case 182 -> 182;
            case 183 -> 60;
            case 184 -> 117;
            case 185 -> 231;
            case 186 -> 220;
            case 187 -> 221;
            case 188 -> 174;
            case 189 -> 112;
            case 190 -> 80;
            case 191 -> 157;
            case 192 -> 159;
            case 193 -> 37;
            case 194 -> 104;
            case 195 -> 18;
            case 196 -> 249;
            case 197 -> 52;
            case 198 -> 177;
            case 199 -> 198;
            case 200 -> 179;
            case 201 -> 163;
            case 202 -> 209;
            case 203 -> 190;
            case 204 -> 109;
            case 205 -> 42;
            case 206 -> 53;
            case 207 -> 141;
            case 208 -> 151;
            case 209 -> 129;
            case 210 -> 118;
            case 211 -> 229;
            case 212 -> 140;
            case 213 -> 233;
            case 214 -> 83;
            case 215 -> 5;
            case 216 -> 139;
            case 217 -> 63;
            case 218 -> 73;
            case 219 -> 164;
            case 220 -> 222;
            case 221 -> 230;
            case 222 -> 27;
            case 223 -> 172;
            case 224 -> 215;
            case 225 -> 165;
            case 226 -> 194;
            case 227 -> 250;
            case 228 -> 116;
            case 229 -> 12;
            case 230 -> 82;
            case 231 -> 86;
            case 232 -> 244;
            case 233 -> 85;
            case 234 -> 31;
            case 235 -> 13;
            case 236 -> 178;
            case 237 -> 28;
            case 238 -> 206;
            case 239 -> 168;
            case 240 -> 6;
            case 241 -> 21;
            case 242 -> 25;
            case 243 -> 201;
            case 244 -> 205;
            case 245 -> 191;
            case 246 -> 51;
            case 247 -> 49;
            case 248 -> 240;
            case 249 -> 132;
            case 250 -> 45;
            case 251 -> 100;
            case 252 -> 87;
            case 253 -> 74;
            case 254 -> 61;
            default -> 253;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
