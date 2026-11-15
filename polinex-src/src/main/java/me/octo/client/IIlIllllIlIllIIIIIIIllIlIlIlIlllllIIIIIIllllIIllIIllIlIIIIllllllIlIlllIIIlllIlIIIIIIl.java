package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class IIlIllllIlIllIIIIIIIllIlIlIlIlllllIIIIIIllllIIllIIllIlIIIIllllllIlIlllIIIlllIlIIIIIIl {
   private static String[] a;
   private static String[] b;

   public static final void a(@NotNull AABB var0, @NotNull Function4<? super Integer, ? super Double, ? super Double, ? super Double, Unit> var1) {
      short var10001 = 12162;
      short var10002 = 8797;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 12161;
      var10002 = 18687;
      Intrinsics.checkNotNullParameter(var1, "fn");
      boolean var2 = false;
      int var3 = 0;
      var1.invoke(var3++, var0.minX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.minZ);
   }

   public static final void b(@NotNull AABB var0, @NotNull Function4<? super Integer, ? super Double, ? super Double, ? super Double, Unit> var1) {
      short var10001 = 12163;
      short var10002 = -11468;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = 12160;
      var10002 = -17562;
      Intrinsics.checkNotNullParameter(var1, "fn");
      boolean var2 = false;
      int var3 = 0;
      var1.invoke(var3++, var0.minX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.minY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.minZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.maxX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.maxZ);
      var1.invoke(var3++, var0.minX, var0.maxY, var0.minZ);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0006ò\u0002º\"";
      int var4 = "\u0006ò\u0002º\"".length();
      char var1 = 2;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 45;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 62;
                     case 1 -> 121;
                     case 2 -> 62;
                     case 3 -> 103;
                     case 4 -> 115;
                     case 5 -> 38;
                     default -> 113;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[4];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0098Ú\u00881\u0002'\u0006\u000ebZ&XÅ";
                  var4 = "\u0098Ú\u00881\u0002'\u0006\u000ebZ&XÅ".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 12160) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 129;
            case 1 -> 234;
            case 2 -> 35;
            case 3 -> 91;
            case 4 -> 223;
            case 5 -> 1;
            case 6 -> 33;
            case 7 -> 180;
            case 8 -> 200;
            case 9 -> 224;
            case 10 -> 114;
            case 11 -> 250;
            case 12 -> 71;
            case 13 -> 56;
            case 14 -> 110;
            case 15 -> 209;
            case 16 -> 104;
            case 17 -> 107;
            case 18 -> 82;
            case 19 -> 156;
            case 20 -> 39;
            case 21 -> 243;
            case 22 -> 158;
            case 23 -> 84;
            case 24 -> 111;
            case 25 -> 212;
            case 26 -> 135;
            case 27 -> 188;
            case 28 -> 187;
            case 29 -> 37;
            case 30 -> 120;
            case 31 -> 43;
            case 32 -> 65;
            case 33 -> 179;
            case 34 -> 123;
            case 35 -> 90;
            case 36 -> 16;
            case 37 -> 59;
            case 38 -> 138;
            case 39 -> 159;
            case 40 -> 254;
            case 41 -> 15;
            case 42 -> 86;
            case 43 -> 10;
            case 44 -> 87;
            case 45 -> 51;
            case 46 -> 144;
            case 47 -> 171;
            case 48 -> 211;
            case 49 -> 202;
            case 50 -> 207;
            case 51 -> 13;
            case 52 -> 240;
            case 53 -> 99;
            case 54 -> 36;
            case 55 -> 25;
            case 56 -> 14;
            case 57 -> 153;
            case 58 -> 53;
            case 59 -> 45;
            case 60 -> 42;
            case 61 -> 230;
            case 62 -> 239;
            case 63 -> 227;
            case 64 -> 29;
            case 65 -> 164;
            case 66 -> 241;
            case 67 -> 228;
            case 68 -> 40;
            case 69 -> 149;
            case 70 -> 216;
            case 71 -> 46;
            case 72 -> 165;
            case 73 -> 206;
            case 74 -> 108;
            case 75 -> 225;
            case 76 -> 237;
            case 77 -> 116;
            case 78 -> 194;
            case 79 -> 190;
            case 80 -> 32;
            case 81 -> 58;
            case 82 -> 101;
            case 83 -> 193;
            case 84 -> 204;
            case 85 -> 96;
            case 86 -> 85;
            case 87 -> 231;
            case 88 -> 150;
            case 89 -> 60;
            case 90 -> 185;
            case 91 -> 76;
            case 92 -> 172;
            case 93 -> 5;
            case 94 -> 238;
            case 95 -> 64;
            case 96 -> 163;
            case 97 -> 175;
            case 98 -> 132;
            case 99 -> 9;
            case 100 -> 146;
            case 101 -> 24;
            case 102 -> 148;
            case 103 -> 213;
            case 104 -> 102;
            case 105 -> 142;
            case 106 -> 205;
            case 107 -> 73;
            case 108 -> 203;
            case 109 -> 219;
            case 110 -> 152;
            case 111 -> 23;
            case 112 -> 72;
            case 113 -> 249;
            case 114 -> 26;
            case 115 -> 126;
            case 116 -> 177;
            case 117 -> 192;
            case 118 -> 155;
            case 119 -> 196;
            case 120 -> 12;
            case 121 -> 176;
            case 122 -> 220;
            case 123 -> 181;
            case 124 -> 55;
            case 125 -> 197;
            case 126 -> 201;
            case 127 -> 157;
            case 128 -> 27;
            case 129 -> 20;
            case 130 -> 244;
            case 131 -> 214;
            case 132 -> 88;
            case 133 -> 198;
            case 134 -> 182;
            case 135 -> 137;
            case 136 -> 103;
            case 137 -> 92;
            case 138 -> 154;
            case 139 -> 106;
            case 140 -> 80;
            case 141 -> 162;
            case 142 -> 170;
            case 143 -> 93;
            case 144 -> 118;
            case 145 -> 17;
            case 146 -> 145;
            case 147 -> 166;
            case 148 -> 245;
            case 149 -> 41;
            case 150 -> 75;
            case 151 -> 124;
            case 152 -> 11;
            case 153 -> 246;
            case 154 -> 89;
            case 155 -> 226;
            case 156 -> 66;
            case 157 -> 61;
            case 158 -> 208;
            case 159 -> 161;
            case 160 -> 130;
            case 161 -> 199;
            case 162 -> 69;
            case 163 -> 83;
            case 164 -> 0;
            case 165 -> 47;
            case 166 -> 247;
            case 167 -> 255;
            case 168 -> 217;
            case 169 -> 48;
            case 170 -> 242;
            case 171 -> 169;
            case 172 -> 167;
            case 173 -> 186;
            case 174 -> 4;
            case 175 -> 105;
            case 176 -> 22;
            case 177 -> 95;
            case 178 -> 125;
            case 179 -> 18;
            case 180 -> 133;
            case 181 -> 229;
            case 182 -> 67;
            case 183 -> 34;
            case 184 -> 52;
            case 185 -> 143;
            case 186 -> 98;
            case 187 -> 70;
            case 188 -> 8;
            case 189 -> 236;
            case 190 -> 68;
            case 191 -> 19;
            case 192 -> 81;
            case 193 -> 141;
            case 194 -> 178;
            case 195 -> 62;
            case 196 -> 49;
            case 197 -> 3;
            case 198 -> 128;
            case 199 -> 94;
            case 200 -> 21;
            case 201 -> 78;
            case 202 -> 6;
            case 203 -> 7;
            case 204 -> 151;
            case 205 -> 77;
            case 206 -> 31;
            case 207 -> 54;
            case 208 -> 191;
            case 209 -> 168;
            case 210 -> 140;
            case 211 -> 160;
            case 212 -> 97;
            case 213 -> 235;
            case 214 -> 127;
            case 215 -> 50;
            case 216 -> 121;
            case 217 -> 131;
            case 218 -> 117;
            case 219 -> 253;
            case 220 -> 109;
            case 221 -> 28;
            case 222 -> 174;
            case 223 -> 252;
            case 224 -> 183;
            case 225 -> 100;
            case 226 -> 136;
            case 227 -> 232;
            case 228 -> 233;
            case 229 -> 195;
            case 230 -> 30;
            case 231 -> 134;
            case 232 -> 251;
            case 233 -> 210;
            case 234 -> 112;
            case 235 -> 122;
            case 236 -> 2;
            case 237 -> 113;
            case 238 -> 222;
            case 239 -> 57;
            case 240 -> 218;
            case 241 -> 221;
            case 242 -> 147;
            case 243 -> 79;
            case 244 -> 139;
            case 245 -> 115;
            case 246 -> 74;
            case 247 -> 173;
            case 248 -> 248;
            case 249 -> 63;
            case 250 -> 184;
            case 251 -> 215;
            case 252 -> 119;
            case 253 -> 38;
            case 254 -> 189;
            default -> 44;
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
