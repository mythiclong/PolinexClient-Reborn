package me.octo.client.events.impl;

import com.mojang.blaze3d.platform.Window;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Vector2f;

public final class lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   private final Vector2f IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final Window IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final DeltaTracker lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final Matrix4f llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] c;
   private static String[] d;

   public lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl(@NotNull Vector2f var1) {
      short var10001 = 20014;
      short var10002 = -30122;
      Intrinsics.checkNotNullParameter(var1, "scaledSize");
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      Window var2 = Minecraft.getInstance().getWindow();
      short var10003 = 20013;
      short var10004 = -9504;
      Intrinsics.checkNotNullExpressionValue(var2, "getWindow(...)");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      DeltaTracker var3 = Minecraft.getInstance().getDeltaTracker();
      var10003 = 20015;
      var10004 = 18184;
      Intrinsics.checkNotNullExpressionValue(var3, "getDeltaTracker(...)");
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         .getGameTimeDeltaPartialTick(false);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Matrix4f();
   }

   @NotNull
   public final Vector2f k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final Window l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final DeltaTracker m() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final float n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final Matrix4f o() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ø^\u000e\u001b\u0016\r\u0087rc\u009f\u008eä9\u000e\u0000\u001düý\u0012³\nÔu\b\u0090aYNù·ð\u000e£Úe\u0098w\u000e6^d\u008ffºÇm";
      int var4 = "ø^\u000e\u001b\u0016\r\u0087rc\u009f\u008eä9\u000e\u0000\u001düý\u0012³\nÔu\b\u0090aYNù·ð\u000e£Úe\u0098w\u000e6^d\u008ffºÇm".length();
      char var1 = 20;
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
                  case 0 -> 127;
                  case 1 -> 26;
                  case 2 -> 41;
                  case 3 -> 54;
                  case 4 -> 69;
                  case 5 -> 32;
                  default -> 120;
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
            d = new String[3];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 20015) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 115;
            case 1 -> 99;
            case 2 -> 213;
            case 3 -> 176;
            case 4 -> 214;
            case 5 -> 135;
            case 6 -> 107;
            case 7 -> 245;
            case 8 -> 108;
            case 9 -> 162;
            case 10 -> 211;
            case 11 -> 129;
            case 12 -> 139;
            case 13 -> 100;
            case 14 -> 52;
            case 15 -> 131;
            case 16 -> 167;
            case 17 -> 178;
            case 18 -> 233;
            case 19 -> 252;
            case 20 -> 239;
            case 21 -> 109;
            case 22 -> 58;
            case 23 -> 232;
            case 24 -> 200;
            case 25 -> 63;
            case 26 -> 48;
            case 27 -> 118;
            case 28 -> 173;
            case 29 -> 219;
            case 30 -> 197;
            case 31 -> 154;
            case 32 -> 51;
            case 33 -> 248;
            case 34 -> 224;
            case 35 -> 212;
            case 36 -> 196;
            case 37 -> 209;
            case 38 -> 177;
            case 39 -> 43;
            case 40 -> 72;
            case 41 -> 134;
            case 42 -> 188;
            case 43 -> 77;
            case 44 -> 240;
            case 45 -> 207;
            case 46 -> 169;
            case 47 -> 238;
            case 48 -> 110;
            case 49 -> 126;
            case 50 -> 243;
            case 51 -> 21;
            case 52 -> 60;
            case 53 -> 17;
            case 54 -> 26;
            case 55 -> 227;
            case 56 -> 97;
            case 57 -> 221;
            case 58 -> 174;
            case 59 -> 123;
            case 60 -> 172;
            case 61 -> 92;
            case 62 -> 190;
            case 63 -> 182;
            case 64 -> 184;
            case 65 -> 76;
            case 66 -> 11;
            case 67 -> 78;
            case 68 -> 194;
            case 69 -> 216;
            case 70 -> 32;
            case 71 -> 226;
            case 72 -> 111;
            case 73 -> 23;
            case 74 -> 87;
            case 75 -> 50;
            case 76 -> 13;
            case 77 -> 6;
            case 78 -> 117;
            case 79 -> 157;
            case 80 -> 183;
            case 81 -> 175;
            case 82 -> 163;
            case 83 -> 140;
            case 84 -> 137;
            case 85 -> 36;
            case 86 -> 28;
            case 87 -> 85;
            case 88 -> 220;
            case 89 -> 156;
            case 90 -> 144;
            case 91 -> 208;
            case 92 -> 189;
            case 93 -> 185;
            case 94 -> 35;
            case 95 -> 61;
            case 96 -> 136;
            case 97 -> 101;
            case 98 -> 168;
            case 99 -> 106;
            case 100 -> 161;
            case 101 -> 132;
            case 102 -> 86;
            case 103 -> 12;
            case 104 -> 231;
            case 105 -> 45;
            case 106 -> 40;
            case 107 -> 39;
            case 108 -> 204;
            case 109 -> 158;
            case 110 -> 242;
            case 111 -> 247;
            case 112 -> 38;
            case 113 -> 65;
            case 114 -> 225;
            case 115 -> 22;
            case 116 -> 95;
            case 117 -> 152;
            case 118 -> 81;
            case 119 -> 33;
            case 120 -> 105;
            case 121 -> 210;
            case 122 -> 119;
            case 123 -> 120;
            case 124 -> 235;
            case 125 -> 153;
            case 126 -> 34;
            case 127 -> 27;
            case 128 -> 234;
            case 129 -> 0;
            case 130 -> 251;
            case 131 -> 59;
            case 132 -> 138;
            case 133 -> 53;
            case 134 -> 18;
            case 135 -> 41;
            case 136 -> 217;
            case 137 -> 121;
            case 138 -> 193;
            case 139 -> 67;
            case 140 -> 143;
            case 141 -> 90;
            case 142 -> 31;
            case 143 -> 3;
            case 144 -> 165;
            case 145 -> 255;
            case 146 -> 47;
            case 147 -> 141;
            case 148 -> 96;
            case 149 -> 166;
            case 150 -> 192;
            case 151 -> 73;
            case 152 -> 125;
            case 153 -> 104;
            case 154 -> 55;
            case 155 -> 202;
            case 156 -> 236;
            case 157 -> 4;
            case 158 -> 69;
            case 159 -> 80;
            case 160 -> 222;
            case 161 -> 195;
            case 162 -> 133;
            case 163 -> 218;
            case 164 -> 93;
            case 165 -> 128;
            case 166 -> 71;
            case 167 -> 145;
            case 168 -> 24;
            case 169 -> 1;
            case 170 -> 229;
            case 171 -> 223;
            case 172 -> 127;
            case 173 -> 164;
            case 174 -> 155;
            case 175 -> 64;
            case 176 -> 180;
            case 177 -> 122;
            case 178 -> 75;
            case 179 -> 2;
            case 180 -> 150;
            case 181 -> 94;
            case 182 -> 91;
            case 183 -> 215;
            case 184 -> 49;
            case 185 -> 37;
            case 186 -> 254;
            case 187 -> 9;
            case 188 -> 30;
            case 189 -> 84;
            case 190 -> 62;
            case 191 -> 70;
            case 192 -> 124;
            case 193 -> 171;
            case 194 -> 250;
            case 195 -> 44;
            case 196 -> 88;
            case 197 -> 205;
            case 198 -> 142;
            case 199 -> 114;
            case 200 -> 151;
            case 201 -> 186;
            case 202 -> 83;
            case 203 -> 15;
            case 204 -> 146;
            case 205 -> 98;
            case 206 -> 149;
            case 207 -> 181;
            case 208 -> 116;
            case 209 -> 56;
            case 210 -> 246;
            case 211 -> 57;
            case 212 -> 147;
            case 213 -> 46;
            case 214 -> 198;
            case 215 -> 230;
            case 216 -> 68;
            case 217 -> 179;
            case 218 -> 237;
            case 219 -> 203;
            case 220 -> 130;
            case 221 -> 113;
            case 222 -> 241;
            case 223 -> 206;
            case 224 -> 89;
            case 225 -> 42;
            case 226 -> 112;
            case 227 -> 159;
            case 228 -> 148;
            case 229 -> 103;
            case 230 -> 244;
            case 231 -> 14;
            case 232 -> 79;
            case 233 -> 5;
            case 234 -> 249;
            case 235 -> 102;
            case 236 -> 199;
            case 237 -> 10;
            case 238 -> 160;
            case 239 -> 187;
            case 240 -> 7;
            case 241 -> 74;
            case 242 -> 54;
            case 243 -> 228;
            case 244 -> 29;
            case 245 -> 82;
            case 246 -> 201;
            case 247 -> 25;
            case 248 -> 20;
            case 249 -> 16;
            case 250 -> 19;
            case 251 -> 170;
            case 252 -> 8;
            case 253 -> 66;
            case 254 -> 191;
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
