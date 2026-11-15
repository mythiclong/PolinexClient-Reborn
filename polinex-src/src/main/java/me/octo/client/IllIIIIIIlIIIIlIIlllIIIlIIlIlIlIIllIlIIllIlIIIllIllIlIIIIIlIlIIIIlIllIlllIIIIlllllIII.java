package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public final class IllIIIIIIlIIIIlIIlllIIIlIIlIlIlIIllIlIIllIlIIIllIllIlIIIIIlIlIIIIlIllIlllIIIIlllllIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   private static String[] f;
   private static String[] g;

   public IllIIIIIIlIIIIlIIlllIIIlIIlIlIlIIllIlIIllIlIIIllIllIlIIIIIlIlIIIIlIllIlllIIIIlllllIII() {
      short var10001 = 9203;
      short var10002 = 2033;
      var10002 = 9201;
      short var10003 = -6430;
      short var10004 = 9202;
      short var10005 = 12396;
      super(
         "Tree Indicator",
         "Indicates tree break progress via a bar on the screen",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Render"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      if (var2 == null) {
         if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
            return;
         }

         me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "U\u0001 çÕ×\tÔ\u001a øG\u0096\u0099\u0006'\f#²\u008ag5\u000eutú-Ñ'8\u009c_d\u0095¸\u0012Ô\u0018}ÖÚÓÏ&^d\u000eT\u0084<\u0000KÚºª\u0098\u0080=ÎS\u001b/\u009bVûì\u0082\u009c=\u0082\u0019\u0015¸J.";
      int var4 = "U\u0001 çÕ×\tÔ\u001a øG\u0096\u0099\u0006'\f#²\u008ag5\u000eutú-Ñ'8\u009c_d\u0095¸\u0012Ô\u0018}ÖÚÓÏ&^d\u000eT\u0084<\u0000KÚºª\u0098\u0080=ÎS\u001b/\u009bVûì\u0082\u009c=\u0082\u0019\u0015¸J."
         .length();
      char var1 = 14;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 32;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 32;
               var10006 = var6;
            } else {
               var13 = 32;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 32;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 46;
                  case 1 -> 118;
                  case 2 -> 80;
                  case 3 -> 116;
                  case 4 -> 6;
                  case 5 -> 1;
                  default -> 29;
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
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 9203) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 153;
            case 1 -> 218;
            case 2 -> 47;
            case 3 -> 239;
            case 4 -> 82;
            case 5 -> 217;
            case 6 -> 78;
            case 7 -> 140;
            case 8 -> 144;
            case 9 -> 231;
            case 10 -> 151;
            case 11 -> 206;
            case 12 -> 247;
            case 13 -> 112;
            case 14 -> 129;
            case 15 -> 120;
            case 16 -> 27;
            case 17 -> 114;
            case 18 -> 253;
            case 19 -> 103;
            case 20 -> 234;
            case 21 -> 81;
            case 22 -> 10;
            case 23 -> 71;
            case 24 -> 149;
            case 25 -> 190;
            case 26 -> 13;
            case 27 -> 5;
            case 28 -> 64;
            case 29 -> 31;
            case 30 -> 212;
            case 31 -> 60;
            case 32 -> 116;
            case 33 -> 202;
            case 34 -> 85;
            case 35 -> 196;
            case 36 -> 61;
            case 37 -> 137;
            case 38 -> 191;
            case 39 -> 223;
            case 40 -> 155;
            case 41 -> 241;
            case 42 -> 73;
            case 43 -> 139;
            case 44 -> 97;
            case 45 -> 134;
            case 46 -> 17;
            case 47 -> 227;
            case 48 -> 252;
            case 49 -> 225;
            case 50 -> 96;
            case 51 -> 219;
            case 52 -> 41;
            case 53 -> 6;
            case 54 -> 101;
            case 55 -> 106;
            case 56 -> 43;
            case 57 -> 238;
            case 58 -> 184;
            case 59 -> 113;
            case 60 -> 126;
            case 61 -> 16;
            case 62 -> 133;
            case 63 -> 245;
            case 64 -> 109;
            case 65 -> 67;
            case 66 -> 157;
            case 67 -> 232;
            case 68 -> 98;
            case 69 -> 49;
            case 70 -> 76;
            case 71 -> 146;
            case 72 -> 164;
            case 73 -> 19;
            case 74 -> 59;
            case 75 -> 175;
            case 76 -> 255;
            case 77 -> 199;
            case 78 -> 131;
            case 79 -> 79;
            case 80 -> 68;
            case 81 -> 195;
            case 82 -> 170;
            case 83 -> 100;
            case 84 -> 148;
            case 85 -> 74;
            case 86 -> 161;
            case 87 -> 210;
            case 88 -> 28;
            case 89 -> 235;
            case 90 -> 12;
            case 91 -> 226;
            case 92 -> 40;
            case 93 -> 230;
            case 94 -> 211;
            case 95 -> 123;
            case 96 -> 248;
            case 97 -> 86;
            case 98 -> 15;
            case 99 -> 102;
            case 100 -> 84;
            case 101 -> 55;
            case 102 -> 163;
            case 103 -> 62;
            case 104 -> 23;
            case 105 -> 104;
            case 106 -> 30;
            case 107 -> 220;
            case 108 -> 3;
            case 109 -> 138;
            case 110 -> 159;
            case 111 -> 58;
            case 112 -> 221;
            case 113 -> 88;
            case 114 -> 48;
            case 115 -> 36;
            case 116 -> 50;
            case 117 -> 121;
            case 118 -> 249;
            case 119 -> 208;
            case 120 -> 57;
            case 121 -> 108;
            case 122 -> 87;
            case 123 -> 20;
            case 124 -> 136;
            case 125 -> 194;
            case 126 -> 207;
            case 127 -> 209;
            case 128 -> 117;
            case 129 -> 250;
            case 130 -> 174;
            case 131 -> 200;
            case 132 -> 240;
            case 133 -> 56;
            case 134 -> 229;
            case 135 -> 95;
            case 136 -> 168;
            case 137 -> 145;
            case 138 -> 110;
            case 139 -> 254;
            case 140 -> 52;
            case 141 -> 44;
            case 142 -> 203;
            case 143 -> 39;
            case 144 -> 25;
            case 145 -> 0;
            case 146 -> 183;
            case 147 -> 147;
            case 148 -> 46;
            case 149 -> 45;
            case 150 -> 193;
            case 151 -> 11;
            case 152 -> 38;
            case 153 -> 214;
            case 154 -> 222;
            case 155 -> 213;
            case 156 -> 192;
            case 157 -> 185;
            case 158 -> 53;
            case 159 -> 167;
            case 160 -> 186;
            case 161 -> 2;
            case 162 -> 135;
            case 163 -> 9;
            case 164 -> 188;
            case 165 -> 7;
            case 166 -> 228;
            case 167 -> 197;
            case 168 -> 150;
            case 169 -> 216;
            case 170 -> 65;
            case 171 -> 119;
            case 172 -> 77;
            case 173 -> 4;
            case 174 -> 94;
            case 175 -> 89;
            case 176 -> 236;
            case 177 -> 21;
            case 178 -> 29;
            case 179 -> 115;
            case 180 -> 69;
            case 181 -> 171;
            case 182 -> 162;
            case 183 -> 201;
            case 184 -> 99;
            case 185 -> 176;
            case 186 -> 111;
            case 187 -> 33;
            case 188 -> 177;
            case 189 -> 237;
            case 190 -> 118;
            case 191 -> 246;
            case 192 -> 107;
            case 193 -> 173;
            case 194 -> 66;
            case 195 -> 8;
            case 196 -> 1;
            case 197 -> 35;
            case 198 -> 198;
            case 199 -> 172;
            case 200 -> 26;
            case 201 -> 80;
            case 202 -> 127;
            case 203 -> 187;
            case 204 -> 181;
            case 205 -> 51;
            case 206 -> 125;
            case 207 -> 243;
            case 208 -> 244;
            case 209 -> 37;
            case 210 -> 160;
            case 211 -> 72;
            case 212 -> 91;
            case 213 -> 224;
            case 214 -> 215;
            case 215 -> 42;
            case 216 -> 93;
            case 217 -> 166;
            case 218 -> 180;
            case 219 -> 54;
            case 220 -> 128;
            case 221 -> 169;
            case 222 -> 70;
            case 223 -> 75;
            case 224 -> 156;
            case 225 -> 189;
            case 226 -> 24;
            case 227 -> 178;
            case 228 -> 92;
            case 229 -> 179;
            case 230 -> 204;
            case 231 -> 242;
            case 232 -> 165;
            case 233 -> 18;
            case 234 -> 141;
            case 235 -> 34;
            case 236 -> 32;
            case 237 -> 122;
            case 238 -> 233;
            case 239 -> 130;
            case 240 -> 152;
            case 241 -> 83;
            case 242 -> 124;
            case 243 -> 22;
            case 244 -> 90;
            case 245 -> 182;
            case 246 -> 143;
            case 247 -> 205;
            case 248 -> 142;
            case 249 -> 154;
            case 250 -> 251;
            case 251 -> 63;
            case 252 -> 158;
            case 253 -> 14;
            case 254 -> 132;
            default -> 105;
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
}
