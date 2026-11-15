package me.octo.client.utils.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII {
   private static String[] a;
   private static String[] b;

   @NotNull
   public static final Vec3 a(@NotNull Entity var0) {
      short var10001 = -23221;
      short var10002 = -12918;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      return new Vec3(var0.getX(), var0.getY(), var0.getZ());
   }

   public static final void a(@NotNull Entity var0, @NotNull Vec3 var1) {
      short var10001 = -23224;
      short var10002 = 21010;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = -23223;
      var10002 = -28449;
      Intrinsics.checkNotNullParameter(var1, "vec");
      var0.setPosRaw(var1.x, var1.y, var1.z);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "(\u001f<\u0006\u0006{ñ¹þÎ\u0006È2(\u0090Åë";
      int var4 = "(\u001f<\u0006\u0006{ñ¹þÎ\u0006È2(\u0090Åë".length();
      char var1 = 3;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 64;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            } else {
               var13 = 64;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 102;
                  case 1 -> 19;
                  case 2 -> 102;
                  case 3 -> 111;
                  case 4 -> 82;
                  case 5 -> 38;
                  default -> 61;
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
            a = var5;
            b = new String[3];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -23223) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 10;
            case 1 -> 60;
            case 2 -> 159;
            case 3 -> 140;
            case 4 -> 1;
            case 5 -> 248;
            case 6 -> 89;
            case 7 -> 29;
            case 8 -> 40;
            case 9 -> 178;
            case 10 -> 70;
            case 11 -> 35;
            case 12 -> 201;
            case 13 -> 142;
            case 14 -> 103;
            case 15 -> 73;
            case 16 -> 224;
            case 17 -> 127;
            case 18 -> 165;
            case 19 -> 222;
            case 20 -> 43;
            case 21 -> 51;
            case 22 -> 81;
            case 23 -> 141;
            case 24 -> 18;
            case 25 -> 209;
            case 26 -> 170;
            case 27 -> 101;
            case 28 -> 214;
            case 29 -> 244;
            case 30 -> 46;
            case 31 -> 239;
            case 32 -> 246;
            case 33 -> 45;
            case 34 -> 168;
            case 35 -> 112;
            case 36 -> 120;
            case 37 -> 57;
            case 38 -> 117;
            case 39 -> 199;
            case 40 -> 123;
            case 41 -> 223;
            case 42 -> 149;
            case 43 -> 227;
            case 44 -> 242;
            case 45 -> 130;
            case 46 -> 88;
            case 47 -> 99;
            case 48 -> 249;
            case 49 -> 6;
            case 50 -> 71;
            case 51 -> 175;
            case 52 -> 225;
            case 53 -> 160;
            case 54 -> 202;
            case 55 -> 219;
            case 56 -> 0;
            case 57 -> 203;
            case 58 -> 180;
            case 59 -> 109;
            case 60 -> 86;
            case 61 -> 241;
            case 62 -> 100;
            case 63 -> 174;
            case 64 -> 157;
            case 65 -> 134;
            case 66 -> 238;
            case 67 -> 97;
            case 68 -> 173;
            case 69 -> 169;
            case 70 -> 78;
            case 71 -> 243;
            case 72 -> 8;
            case 73 -> 152;
            case 74 -> 5;
            case 75 -> 206;
            case 76 -> 94;
            case 77 -> 44;
            case 78 -> 72;
            case 79 -> 90;
            case 80 -> 254;
            case 81 -> 65;
            case 82 -> 207;
            case 83 -> 155;
            case 84 -> 66;
            case 85 -> 145;
            case 86 -> 185;
            case 87 -> 231;
            case 88 -> 107;
            case 89 -> 69;
            case 90 -> 172;
            case 91 -> 54;
            case 92 -> 148;
            case 93 -> 28;
            case 94 -> 232;
            case 95 -> 179;
            case 96 -> 250;
            case 97 -> 92;
            case 98 -> 3;
            case 99 -> 116;
            case 100 -> 87;
            case 101 -> 129;
            case 102 -> 67;
            case 103 -> 115;
            case 104 -> 53;
            case 105 -> 77;
            case 106 -> 228;
            case 107 -> 68;
            case 108 -> 234;
            case 109 -> 27;
            case 110 -> 230;
            case 111 -> 61;
            case 112 -> 96;
            case 113 -> 197;
            case 114 -> 33;
            case 115 -> 193;
            case 116 -> 121;
            case 117 -> 136;
            case 118 -> 114;
            case 119 -> 188;
            case 120 -> 187;
            case 121 -> 76;
            case 122 -> 37;
            case 123 -> 156;
            case 124 -> 158;
            case 125 -> 13;
            case 126 -> 34;
            case 127 -> 55;
            case 128 -> 15;
            case 129 -> 48;
            case 130 -> 36;
            case 131 -> 153;
            case 132 -> 64;
            case 133 -> 56;
            case 134 -> 126;
            case 135 -> 235;
            case 136 -> 253;
            case 137 -> 91;
            case 138 -> 247;
            case 139 -> 186;
            case 140 -> 216;
            case 141 -> 208;
            case 142 -> 39;
            case 143 -> 125;
            case 144 -> 118;
            case 145 -> 189;
            case 146 -> 119;
            case 147 -> 163;
            case 148 -> 139;
            case 149 -> 98;
            case 150 -> 135;
            case 151 -> 146;
            case 152 -> 26;
            case 153 -> 79;
            case 154 -> 106;
            case 155 -> 164;
            case 156 -> 144;
            case 157 -> 226;
            case 158 -> 12;
            case 159 -> 111;
            case 160 -> 31;
            case 161 -> 104;
            case 162 -> 7;
            case 163 -> 133;
            case 164 -> 205;
            case 165 -> 30;
            case 166 -> 212;
            case 167 -> 183;
            case 168 -> 200;
            case 169 -> 124;
            case 170 -> 80;
            case 171 -> 220;
            case 172 -> 255;
            case 173 -> 74;
            case 174 -> 147;
            case 175 -> 171;
            case 176 -> 122;
            case 177 -> 11;
            case 178 -> 128;
            case 179 -> 52;
            case 180 -> 23;
            case 181 -> 251;
            case 182 -> 150;
            case 183 -> 177;
            case 184 -> 151;
            case 185 -> 62;
            case 186 -> 176;
            case 187 -> 24;
            case 188 -> 20;
            case 189 -> 143;
            case 190 -> 41;
            case 191 -> 182;
            case 192 -> 137;
            case 193 -> 14;
            case 194 -> 9;
            case 195 -> 211;
            case 196 -> 110;
            case 197 -> 233;
            case 198 -> 218;
            case 199 -> 138;
            case 200 -> 213;
            case 201 -> 132;
            case 202 -> 49;
            case 203 -> 190;
            case 204 -> 240;
            case 205 -> 59;
            case 206 -> 191;
            case 207 -> 38;
            case 208 -> 236;
            case 209 -> 210;
            case 210 -> 215;
            case 211 -> 21;
            case 212 -> 95;
            case 213 -> 2;
            case 214 -> 198;
            case 215 -> 83;
            case 216 -> 105;
            case 217 -> 42;
            case 218 -> 237;
            case 219 -> 161;
            case 220 -> 93;
            case 221 -> 82;
            case 222 -> 16;
            case 223 -> 192;
            case 224 -> 181;
            case 225 -> 221;
            case 226 -> 131;
            case 227 -> 195;
            case 228 -> 245;
            case 229 -> 154;
            case 230 -> 84;
            case 231 -> 85;
            case 232 -> 63;
            case 233 -> 102;
            case 234 -> 58;
            case 235 -> 75;
            case 236 -> 113;
            case 237 -> 17;
            case 238 -> 184;
            case 239 -> 252;
            case 240 -> 25;
            case 241 -> 4;
            case 242 -> 196;
            case 243 -> 32;
            case 244 -> 47;
            case 245 -> 167;
            case 246 -> 229;
            case 247 -> 194;
            case 248 -> 166;
            case 249 -> 217;
            case 250 -> 204;
            case 251 -> 162;
            case 252 -> 19;
            case 253 -> 22;
            case 254 -> 50;
            default -> 108;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}
