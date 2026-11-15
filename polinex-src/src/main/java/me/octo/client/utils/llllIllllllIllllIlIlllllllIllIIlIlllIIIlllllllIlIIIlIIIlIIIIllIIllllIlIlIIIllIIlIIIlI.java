package me.octo.client.utils;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4fc;

public final class llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI {
   @NotNull
   public static llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI() {
   }

   @JvmStatic
   public static final void a(@NotNull Matrix4fc var0, @NotNull Matrix4fc var1) {
      short var10001 = -1689;
      short var10002 = -2202;
      Intrinsics.checkNotNullParameter(var0, "projection");
      var10001 = -1690;
      var10002 = 9833;
      Intrinsics.checkNotNullParameter(var1, "modelView");
   }

   @JvmStatic
   public static final void a() {
   }

   @JvmStatic
   @Nullable
   public static final Frustum b() {
      int[] var0 = c();
      if (var0 == null) {
         net.minecraft.client.Minecraft var1 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         net.minecraft.client.renderer.GameRenderer var2 = var1.gameRenderer;
         if (var2 != null) {
            net.minecraft.client.Camera var3 = var2.getMainCamera();
            if (var3 != null) {
               return var3.getCullFrustum();
            }
         }
      }

      return null;
   }

   @JvmStatic
   public static final boolean a(@NotNull AABB var0) {
      int[] var10000 = c();
      short var10002 = -1691;
      short var10003 = 23387;
      Intrinsics.checkNotNullParameter(var0, "box");
      int[] var1 = var10000;
      if (var1 == null) {
         Frustum var3 = b();
         if (var3 != null) {
            Frustum var2 = var3;
            return var2.isVisible(var0);
         }
      }

      return true;
   }

   @JvmStatic
   public static final boolean a(double var0, double var2, double var4, double var6, double var8, double var10) {
      int[] var12 = c();
      if (var12 == null) {
         Frustum var10000 = b();
         if (var10000 != null) {
            Frustum var13 = var10000;
            return var13.isVisible(new AABB(var0, var2, var4, var6, var8, var10));
         }
      }

      return true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "{©\u007f_jýÀ©\u0096\u001e\t«\u000fÐ:ü\u008a'ØÌ\u00031_q";
      int var4 = "{©\u007f_jýÀ©\u0096\u001e\t«\u000fÐ:ü\u008a'ØÌ\u00031_q".length();
      char var1 = '\n';
      int var0 = -1;
      b(null);

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 115;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 115;
               var10006 = var6;
            } else {
               var13 = 115;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 115;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 33;
                  case 1 -> 66;
                  case 2 -> 56;
                  case 3 -> 105;
                  case 4 -> 120;
                  case 5 -> 98;
                  default -> 34;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
   }
}

   public static void b(int[] var0) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
   }

   public static int[] c() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1689) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 207;
            case 1 -> 1;
            case 2 -> 19;
            case 3 -> 176;
            case 4 -> 227;
            case 5 -> 119;
            case 6 -> 53;
            case 7 -> 101;
            case 8 -> 194;
            case 9 -> 140;
            case 10 -> 255;
            case 11 -> 52;
            case 12 -> 200;
            case 13 -> 230;
            case 14 -> 247;
            case 15 -> 166;
            case 16 -> 8;
            case 17 -> 112;
            case 18 -> 146;
            case 19 -> 123;
            case 20 -> 163;
            case 21 -> 70;
            case 22 -> 236;
            case 23 -> 86;
            case 24 -> 234;
            case 25 -> 191;
            case 26 -> 75;
            case 27 -> 226;
            case 28 -> 239;
            case 29 -> 212;
            case 30 -> 129;
            case 31 -> 142;
            case 32 -> 79;
            case 33 -> 74;
            case 34 -> 133;
            case 35 -> 248;
            case 36 -> 218;
            case 37 -> 204;
            case 38 -> 135;
            case 39 -> 28;
            case 40 -> 60;
            case 41 -> 13;
            case 42 -> 24;
            case 43 -> 185;
            case 44 -> 130;
            case 45 -> 11;
            case 46 -> 249;
            case 47 -> 168;
            case 48 -> 241;
            case 49 -> 85;
            case 50 -> 210;
            case 51 -> 178;
            case 52 -> 184;
            case 53 -> 25;
            case 54 -> 115;
            case 55 -> 46;
            case 56 -> 12;
            case 57 -> 164;
            case 58 -> 14;
            case 59 -> 126;
            case 60 -> 56;
            case 61 -> 237;
            case 62 -> 145;
            case 63 -> 205;
            case 64 -> 157;
            case 65 -> 80;
            case 66 -> 99;
            case 67 -> 186;
            case 68 -> 117;
            case 69 -> 246;
            case 70 -> 228;
            case 71 -> 216;
            case 72 -> 132;
            case 73 -> 208;
            case 74 -> 151;
            case 75 -> 250;
            case 76 -> 49;
            case 77 -> 97;
            case 78 -> 203;
            case 79 -> 34;
            case 80 -> 107;
            case 81 -> 78;
            case 82 -> 3;
            case 83 -> 177;
            case 84 -> 171;
            case 85 -> 121;
            case 86 -> 224;
            case 87 -> 93;
            case 88 -> 89;
            case 89 -> 155;
            case 90 -> 47;
            case 91 -> 242;
            case 92 -> 54;
            case 93 -> 104;
            case 94 -> 198;
            case 95 -> 148;
            case 96 -> 50;
            case 97 -> 32;
            case 98 -> 209;
            case 99 -> 90;
            case 100 -> 31;
            case 101 -> 174;
            case 102 -> 162;
            case 103 -> 18;
            case 104 -> 43;
            case 105 -> 173;
            case 106 -> 220;
            case 107 -> 0;
            case 108 -> 219;
            case 109 -> 188;
            case 110 -> 110;
            case 111 -> 144;
            case 112 -> 48;
            case 113 -> 72;
            case 114 -> 20;
            case 115 -> 17;
            case 116 -> 225;
            case 117 -> 254;
            case 118 -> 33;
            case 119 -> 189;
            case 120 -> 81;
            case 121 -> 182;
            case 122 -> 183;
            case 123 -> 231;
            case 124 -> 244;
            case 125 -> 223;
            case 126 -> 58;
            case 127 -> 136;
            case 128 -> 181;
            case 129 -> 202;
            case 130 -> 23;
            case 131 -> 147;
            case 132 -> 195;
            case 133 -> 100;
            case 134 -> 91;
            case 135 -> 67;
            case 136 -> 160;
            case 137 -> 150;
            case 138 -> 253;
            case 139 -> 73;
            case 140 -> 68;
            case 141 -> 44;
            case 142 -> 36;
            case 143 -> 153;
            case 144 -> 30;
            case 145 -> 240;
            case 146 -> 159;
            case 147 -> 102;
            case 148 -> 21;
            case 149 -> 245;
            case 150 -> 105;
            case 151 -> 222;
            case 152 -> 124;
            case 153 -> 192;
            case 154 -> 98;
            case 155 -> 187;
            case 156 -> 51;
            case 157 -> 215;
            case 158 -> 172;
            case 159 -> 83;
            case 160 -> 57;
            case 161 -> 65;
            case 162 -> 161;
            case 163 -> 170;
            case 164 -> 69;
            case 165 -> 243;
            case 166 -> 125;
            case 167 -> 88;
            case 168 -> 76;
            case 169 -> 197;
            case 170 -> 214;
            case 171 -> 10;
            case 172 -> 113;
            case 173 -> 62;
            case 174 -> 27;
            case 175 -> 4;
            case 176 -> 41;
            case 177 -> 38;
            case 178 -> 63;
            case 179 -> 138;
            case 180 -> 45;
            case 181 -> 235;
            case 182 -> 175;
            case 183 -> 238;
            case 184 -> 190;
            case 185 -> 71;
            case 186 -> 29;
            case 187 -> 141;
            case 188 -> 16;
            case 189 -> 206;
            case 190 -> 26;
            case 191 -> 111;
            case 192 -> 122;
            case 193 -> 22;
            case 194 -> 252;
            case 195 -> 103;
            case 196 -> 158;
            case 197 -> 61;
            case 198 -> 84;
            case 199 -> 42;
            case 200 -> 118;
            case 201 -> 134;
            case 202 -> 217;
            case 203 -> 87;
            case 204 -> 152;
            case 205 -> 94;
            case 206 -> 35;
            case 207 -> 251;
            case 208 -> 96;
            case 209 -> 193;
            case 210 -> 108;
            case 211 -> 95;
            case 212 -> 229;
            case 213 -> 114;
            case 214 -> 127;
            case 215 -> 82;
            case 216 -> 154;
            case 217 -> 9;
            case 218 -> 116;
            case 219 -> 139;
            case 220 -> 64;
            case 221 -> 55;
            case 222 -> 196;
            case 223 -> 149;
            case 224 -> 232;
            case 225 -> 128;
            case 226 -> 66;
            case 227 -> 120;
            case 228 -> 169;
            case 229 -> 165;
            case 230 -> 221;
            case 231 -> 2;
            case 232 -> 180;
            case 233 -> 15;
            case 234 -> 39;
            case 235 -> 92;
            case 236 -> 143;
            case 237 -> 167;
            case 238 -> 201;
            case 239 -> 179;
            case 240 -> 131;
            case 241 -> 77;
            case 242 -> 59;
            case 243 -> 6;
            case 244 -> 106;
            case 245 -> 40;
            case 246 -> 233;
            case 247 -> 5;
            case 248 -> 109;
            case 249 -> 213;
            case 250 -> 37;
            case 251 -> 211;
            case 252 -> 137;
            case 253 -> 7;
            case 254 -> 156;
            default -> 199;
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
