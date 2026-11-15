package me.octo.client.events.impl;

import com.mojang.blaze3d.platform.Window;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public final class llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI
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

   public llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI() {
      Window var10001 = Minecraft.getInstance().getWindow();
      short var10003 = -11348;
      short var10004 = 11011;
      Intrinsics.checkNotNullExpressionValue(var10001, "getWindow(...)");
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10001;
      DeltaTracker var1 = Minecraft.getInstance().getDeltaTracker();
      var10003 = -11347;
      var10004 = 29803;
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
      String var2 = "\u001b5M8\u0001áÚ\u0080ík\nU±²\u0014[\u0012EÏ\flæ}[AÔL\u008995ïeþR(";
      int var4 = "\u001b5M8\u0001áÚ\u0080ík\nU±²\u0014[\u0012EÏ\flæ}[AÔL\u008995ïeþR(".length();
      char var1 = 14;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 123;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 123;
               var10006 = var6;
            } else {
               var13 = 123;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 123;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 44;
                  case 1 -> 120;
                  case 2 -> 64;
                  case 3 -> 27;
                  case 4 -> 39;
                  case 5 -> 66;
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
            c = var5;
            d = new String[2];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -11348) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 44;
            case 1 -> 183;
            case 2 -> 81;
            case 3 -> 209;
            case 4 -> 157;
            case 5 -> 76;
            case 6 -> 189;
            case 7 -> 83;
            case 8 -> 220;
            case 9 -> 33;
            case 10 -> 200;
            case 11 -> 34;
            case 12 -> 0;
            case 13 -> 18;
            case 14 -> 82;
            case 15 -> 114;
            case 16 -> 15;
            case 17 -> 135;
            case 18 -> 16;
            case 19 -> 252;
            case 20 -> 106;
            case 21 -> 171;
            case 22 -> 196;
            case 23 -> 39;
            case 24 -> 248;
            case 25 -> 92;
            case 26 -> 225;
            case 27 -> 176;
            case 28 -> 143;
            case 29 -> 179;
            case 30 -> 212;
            case 31 -> 181;
            case 32 -> 87;
            case 33 -> 150;
            case 34 -> 110;
            case 35 -> 228;
            case 36 -> 232;
            case 37 -> 32;
            case 38 -> 138;
            case 39 -> 43;
            case 40 -> 206;
            case 41 -> 231;
            case 42 -> 127;
            case 43 -> 145;
            case 44 -> 219;
            case 45 -> 141;
            case 46 -> 120;
            case 47 -> 194;
            case 48 -> 162;
            case 49 -> 175;
            case 50 -> 132;
            case 51 -> 147;
            case 52 -> 170;
            case 53 -> 2;
            case 54 -> 105;
            case 55 -> 125;
            case 56 -> 90;
            case 57 -> 236;
            case 58 -> 35;
            case 59 -> 199;
            case 60 -> 7;
            case 61 -> 9;
            case 62 -> 27;
            case 63 -> 149;
            case 64 -> 249;
            case 65 -> 124;
            case 66 -> 253;
            case 67 -> 195;
            case 68 -> 243;
            case 69 -> 131;
            case 70 -> 84;
            case 71 -> 94;
            case 72 -> 140;
            case 73 -> 210;
            case 74 -> 60;
            case 75 -> 75;
            case 76 -> 216;
            case 77 -> 230;
            case 78 -> 172;
            case 79 -> 126;
            case 80 -> 144;
            case 81 -> 79;
            case 82 -> 165;
            case 83 -> 184;
            case 84 -> 28;
            case 85 -> 190;
            case 86 -> 177;
            case 87 -> 129;
            case 88 -> 66;
            case 89 -> 11;
            case 90 -> 17;
            case 91 -> 128;
            case 92 -> 161;
            case 93 -> 14;
            case 94 -> 255;
            case 95 -> 185;
            case 96 -> 109;
            case 97 -> 197;
            case 98 -> 65;
            case 99 -> 19;
            case 100 -> 23;
            case 101 -> 217;
            case 102 -> 130;
            case 103 -> 237;
            case 104 -> 227;
            case 105 -> 159;
            case 106 -> 168;
            case 107 -> 97;
            case 108 -> 164;
            case 109 -> 68;
            case 110 -> 137;
            case 111 -> 53;
            case 112 -> 241;
            case 113 -> 214;
            case 114 -> 117;
            case 115 -> 146;
            case 116 -> 113;
            case 117 -> 193;
            case 118 -> 73;
            case 119 -> 153;
            case 120 -> 37;
            case 121 -> 95;
            case 122 -> 201;
            case 123 -> 102;
            case 124 -> 99;
            case 125 -> 103;
            case 126 -> 64;
            case 127 -> 25;
            case 128 -> 119;
            case 129 -> 224;
            case 130 -> 104;
            case 131 -> 251;
            case 132 -> 52;
            case 133 -> 100;
            case 134 -> 173;
            case 135 -> 187;
            case 136 -> 91;
            case 137 -> 221;
            case 138 -> 29;
            case 139 -> 234;
            case 140 -> 107;
            case 141 -> 57;
            case 142 -> 21;
            case 143 -> 198;
            case 144 -> 112;
            case 145 -> 8;
            case 146 -> 59;
            case 147 -> 36;
            case 148 -> 191;
            case 149 -> 50;
            case 150 -> 205;
            case 151 -> 178;
            case 152 -> 58;
            case 153 -> 133;
            case 154 -> 151;
            case 155 -> 88;
            case 156 -> 180;
            case 157 -> 211;
            case 158 -> 3;
            case 159 -> 123;
            case 160 -> 63;
            case 161 -> 182;
            case 162 -> 4;
            case 163 -> 45;
            case 164 -> 215;
            case 165 -> 222;
            case 166 -> 254;
            case 167 -> 167;
            case 168 -> 239;
            case 169 -> 139;
            case 170 -> 71;
            case 171 -> 86;
            case 172 -> 41;
            case 173 -> 250;
            case 174 -> 108;
            case 175 -> 31;
            case 176 -> 24;
            case 177 -> 80;
            case 178 -> 93;
            case 179 -> 10;
            case 180 -> 54;
            case 181 -> 69;
            case 182 -> 70;
            case 183 -> 136;
            case 184 -> 42;
            case 185 -> 155;
            case 186 -> 115;
            case 187 -> 111;
            case 188 -> 49;
            case 189 -> 30;
            case 190 -> 85;
            case 191 -> 188;
            case 192 -> 169;
            case 193 -> 192;
            case 194 -> 186;
            case 195 -> 213;
            case 196 -> 152;
            case 197 -> 47;
            case 198 -> 218;
            case 199 -> 223;
            case 200 -> 160;
            case 201 -> 163;
            case 202 -> 67;
            case 203 -> 62;
            case 204 -> 40;
            case 205 -> 26;
            case 206 -> 12;
            case 207 -> 116;
            case 208 -> 101;
            case 209 -> 158;
            case 210 -> 1;
            case 211 -> 22;
            case 212 -> 118;
            case 213 -> 6;
            case 214 -> 229;
            case 215 -> 20;
            case 216 -> 78;
            case 217 -> 61;
            case 218 -> 202;
            case 219 -> 46;
            case 220 -> 233;
            case 221 -> 121;
            case 222 -> 154;
            case 223 -> 204;
            case 224 -> 5;
            case 225 -> 98;
            case 226 -> 55;
            case 227 -> 13;
            case 228 -> 166;
            case 229 -> 247;
            case 230 -> 246;
            case 231 -> 48;
            case 232 -> 122;
            case 233 -> 207;
            case 234 -> 174;
            case 235 -> 226;
            case 236 -> 134;
            case 237 -> 96;
            case 238 -> 203;
            case 239 -> 148;
            case 240 -> 38;
            case 241 -> 244;
            case 242 -> 77;
            case 243 -> 74;
            case 244 -> 72;
            case 245 -> 238;
            case 246 -> 156;
            case 247 -> 235;
            case 248 -> 240;
            case 249 -> 89;
            case 250 -> 142;
            case 251 -> 245;
            case 252 -> 56;
            case 253 -> 208;
            case 254 -> 51;
            default -> 242;
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
