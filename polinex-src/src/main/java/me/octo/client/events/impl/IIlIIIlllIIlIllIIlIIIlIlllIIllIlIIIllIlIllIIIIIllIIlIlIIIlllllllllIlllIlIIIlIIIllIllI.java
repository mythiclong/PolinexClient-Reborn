package me.octo.client.events.impl;

import com.mojang.blaze3d.platform.Window;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public final class IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   private final Window IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final DeltaTracker IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final Matrix4f IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] c;
   private static String[] d;

   public IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI() {
      Window var10001 = Minecraft.getInstance().getWindow();
      short var10003 = 14258;
      short var10004 = 27902;
      Intrinsics.checkNotNullExpressionValue(var10001, "getWindow(...)");
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10001;
      DeltaTracker var1 = Minecraft.getInstance().getDeltaTracker();
      var10003 = 14259;
      var10004 = 4670;
      Intrinsics.checkNotNullExpressionValue(var1, "getDeltaTracker(...)");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .getGameTimeDeltaPartialTick(false);
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new Matrix4f();
   }

   @NotNull
   public final Window k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final DeltaTracker l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final float m() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final Matrix4f n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "'\u0085lûó t5pîwc·±#\u0087\u00015\u0004\u001b\u000e((\u008d]Ã\u0007ï\u008d2l7o\\\u0098";
      int var4 = "'\u0085lûó t5pîwc·±#\u0087\u00015\u0004\u001b\u000e((\u008d]Ã\u0007ï\u008d2l7o\\\u0098".length();
      char var1 = 20;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 91;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 91;
               var10006 = var6;
            } else {
               var13 = 91;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 91;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 17;
                  case 1 -> 101;
                  case 2 -> 101;
                  case 3 -> 90;
                  case 4 -> 125;
                  case 5 -> 4;
                  default -> 40;
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
      int var2 = (var0 ^ 14259) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 42;
            case 1 -> 41;
            case 2 -> 53;
            case 3 -> 202;
            case 4 -> 154;
            case 5 -> 77;
            case 6 -> 40;
            case 7 -> 76;
            case 8 -> 4;
            case 9 -> 32;
            case 10 -> 192;
            case 11 -> 213;
            case 12 -> 222;
            case 13 -> 221;
            case 14 -> 118;
            case 15 -> 127;
            case 16 -> 182;
            case 17 -> 81;
            case 18 -> 103;
            case 19 -> 74;
            case 20 -> 211;
            case 21 -> 195;
            case 22 -> 134;
            case 23 -> 19;
            case 24 -> 178;
            case 25 -> 236;
            case 26 -> 66;
            case 27 -> 226;
            case 28 -> 157;
            case 29 -> 180;
            case 30 -> 187;
            case 31 -> 139;
            case 32 -> 6;
            case 33 -> 166;
            case 34 -> 214;
            case 35 -> 175;
            case 36 -> 255;
            case 37 -> 91;
            case 38 -> 89;
            case 39 -> 86;
            case 40 -> 161;
            case 41 -> 12;
            case 42 -> 219;
            case 43 -> 248;
            case 44 -> 200;
            case 45 -> 46;
            case 46 -> 176;
            case 47 -> 111;
            case 48 -> 36;
            case 49 -> 186;
            case 50 -> 136;
            case 51 -> 228;
            case 52 -> 114;
            case 53 -> 7;
            case 54 -> 58;
            case 55 -> 190;
            case 56 -> 168;
            case 57 -> 199;
            case 58 -> 194;
            case 59 -> 50;
            case 60 -> 51;
            case 61 -> 181;
            case 62 -> 60;
            case 63 -> 191;
            case 64 -> 124;
            case 65 -> 169;
            case 66 -> 9;
            case 67 -> 243;
            case 68 -> 162;
            case 69 -> 123;
            case 70 -> 112;
            case 71 -> 82;
            case 72 -> 55;
            case 73 -> 75;
            case 74 -> 231;
            case 75 -> 110;
            case 76 -> 47;
            case 77 -> 133;
            case 78 -> 250;
            case 79 -> 146;
            case 80 -> 88;
            case 81 -> 246;
            case 82 -> 125;
            case 83 -> 71;
            case 84 -> 22;
            case 85 -> 69;
            case 86 -> 171;
            case 87 -> 105;
            case 88 -> 242;
            case 89 -> 223;
            case 90 -> 215;
            case 91 -> 144;
            case 92 -> 117;
            case 93 -> 57;
            case 94 -> 16;
            case 95 -> 14;
            case 96 -> 97;
            case 97 -> 196;
            case 98 -> 249;
            case 99 -> 205;
            case 100 -> 174;
            case 101 -> 24;
            case 102 -> 159;
            case 103 -> 39;
            case 104 -> 155;
            case 105 -> 245;
            case 106 -> 63;
            case 107 -> 126;
            case 108 -> 164;
            case 109 -> 52;
            case 110 -> 170;
            case 111 -> 44;
            case 112 -> 29;
            case 113 -> 151;
            case 114 -> 1;
            case 115 -> 204;
            case 116 -> 141;
            case 117 -> 61;
            case 118 -> 107;
            case 119 -> 31;
            case 120 -> 102;
            case 121 -> 173;
            case 122 -> 234;
            case 123 -> 185;
            case 124 -> 237;
            case 125 -> 130;
            case 126 -> 225;
            case 127 -> 23;
            case 128 -> 21;
            case 129 -> 122;
            case 130 -> 18;
            case 131 -> 59;
            case 132 -> 240;
            case 133 -> 15;
            case 134 -> 229;
            case 135 -> 48;
            case 136 -> 149;
            case 137 -> 172;
            case 138 -> 218;
            case 139 -> 26;
            case 140 -> 37;
            case 141 -> 38;
            case 142 -> 233;
            case 143 -> 209;
            case 144 -> 148;
            case 145 -> 43;
            case 146 -> 13;
            case 147 -> 160;
            case 148 -> 119;
            case 149 -> 56;
            case 150 -> 85;
            case 151 -> 27;
            case 152 -> 104;
            case 153 -> 121;
            case 154 -> 201;
            case 155 -> 131;
            case 156 -> 152;
            case 157 -> 54;
            case 158 -> 208;
            case 159 -> 95;
            case 160 -> 179;
            case 161 -> 239;
            case 162 -> 99;
            case 163 -> 184;
            case 164 -> 87;
            case 165 -> 116;
            case 166 -> 67;
            case 167 -> 252;
            case 168 -> 28;
            case 169 -> 210;
            case 170 -> 165;
            case 171 -> 78;
            case 172 -> 145;
            case 173 -> 156;
            case 174 -> 25;
            case 175 -> 65;
            case 176 -> 238;
            case 177 -> 207;
            case 178 -> 70;
            case 179 -> 100;
            case 180 -> 109;
            case 181 -> 45;
            case 182 -> 79;
            case 183 -> 3;
            case 184 -> 197;
            case 185 -> 216;
            case 186 -> 72;
            case 187 -> 34;
            case 188 -> 224;
            case 189 -> 251;
            case 190 -> 235;
            case 191 -> 147;
            case 192 -> 80;
            case 193 -> 30;
            case 194 -> 177;
            case 195 -> 106;
            case 196 -> 92;
            case 197 -> 101;
            case 198 -> 230;
            case 199 -> 183;
            case 200 -> 198;
            case 201 -> 90;
            case 202 -> 120;
            case 203 -> 5;
            case 204 -> 129;
            case 205 -> 217;
            case 206 -> 84;
            case 207 -> 0;
            case 208 -> 98;
            case 209 -> 93;
            case 210 -> 232;
            case 211 -> 142;
            case 212 -> 189;
            case 213 -> 62;
            case 214 -> 193;
            case 215 -> 220;
            case 216 -> 115;
            case 217 -> 247;
            case 218 -> 20;
            case 219 -> 35;
            case 220 -> 158;
            case 221 -> 167;
            case 222 -> 108;
            case 223 -> 10;
            case 224 -> 244;
            case 225 -> 150;
            case 226 -> 73;
            case 227 -> 253;
            case 228 -> 11;
            case 229 -> 153;
            case 230 -> 49;
            case 231 -> 17;
            case 232 -> 203;
            case 233 -> 206;
            case 234 -> 163;
            case 235 -> 94;
            case 236 -> 83;
            case 237 -> 33;
            case 238 -> 254;
            case 239 -> 143;
            case 240 -> 188;
            case 241 -> 113;
            case 242 -> 212;
            case 243 -> 96;
            case 244 -> 8;
            case 245 -> 128;
            case 246 -> 2;
            case 247 -> 227;
            case 248 -> 64;
            case 249 -> 137;
            case 250 -> 132;
            case 251 -> 68;
            case 252 -> 135;
            case 253 -> 241;
            case 254 -> 138;
            default -> 140;
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
