package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public interface IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl
   extends llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl {
   String[] b = b_arr_init();
   String[] c = new String[3];

   default float a() {
      return 80.0F;
   }

   default int b() {
      return 63;
   }

   @NotNull
   lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   );

   default int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      short var10001 = 17898;
      short var10002 = -26777;
      Intrinsics.checkNotNullParameter(var1, "resolution");
      return 30;
   }

   @NotNull
   IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c();

   default boolean a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      short var10001 = 17896;
      short var10002 = -20688;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      me.octo.client.utils.lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, var2, var3, var6);
      return this.a(var4, var5, var2 - 51, var3 - 5, var2 + 23, var3 + 29);
   }

   default boolean b(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      short var10001 = 17896;
      short var10002 = -20688;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      me.octo.client.utils.lllIIllIIlllIlIIlIlIIIllllllllllllllIIIIIlIlIIIIIIIIIlIlIlIlIIllllllllIllllIIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var1, var2, var3, var6);
      return this.a(var4, var5, var2 - 35, var3 - 2, var2 + 28, var3 + 34);
   }

   default boolean a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      short var10001 = 17899;
      short var10002 = 4828;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      String[] var10000 = lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.d();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c(
         var4,
         var5,
         var6,
         var7,
         1.0F,
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         4.0F
      );
      String[] var8 = var10000;
      float var10;
      int var9 = (var10 = var2 - var4) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      if (var8 != null) {
         if (var9 < 0) {
            return (0 != 0);
         }

         float var11;
         var9 = (var11 = var3 - var5) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      if (var8 != null) {
         if (var9 < 0) {
            return (0 != 0);
         }

         float var12;
         var9 = (var12 = var2 - var6) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
      }

      if (var8 != null) {
         if (var9 >= 0) {
            return (0 != 0);
         }

         float var13;
         var9 = (var13 = var3 - var7) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      }

      if (var8 == null) {
         return (var9 != 0);
      } else {
         return (var9 < 0);
      }
   }

   @Override
   default void a(char var1, int var2) {
   }

   private static String[] b_arr_init() {
      String[] var5 = new String[3];
      var5[0] = "\u0027\u00e0\u00ab\u00ba\u0004\u00a0\u0015\u00a6\u0037\u00fe";
      var5[1] = "\u00cc\u00ac\u0010\u00de\u000c\u002d\u00c4\u0053\u005e\u00e8\u0076";
      var5[2] = "\u00e0\u0071\u0095\u0065\u00bc\u005a\u00d2\u00bd\u009c\u0035\u002e";
      return var5;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 17898) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 209;
            case 1 -> 51;
            case 2 -> 5;
            case 3 -> 173;
            case 4 -> 121;
            case 5 -> 42;
            case 6 -> 62;
            case 7 -> 169;
            case 8 -> 71;
            case 9 -> 224;
            case 10 -> 190;
            case 11 -> 174;
            case 12 -> 75;
            case 13 -> 197;
            case 14 -> 60;
            case 15 -> 221;
            case 16 -> 244;
            case 17 -> 158;
            case 18 -> 41;
            case 19 -> 206;
            case 20 -> 49;
            case 21 -> 112;
            case 22 -> 10;
            case 23 -> 247;
            case 24 -> 8;
            case 25 -> 105;
            case 26 -> 171;
            case 27 -> 80;
            case 28 -> 101;
            case 29 -> 34;
            case 30 -> 58;
            case 31 -> 128;
            case 32 -> 251;
            case 33 -> 102;
            case 34 -> 147;
            case 35 -> 127;
            case 36 -> 233;
            case 37 -> 160;
            case 38 -> 204;
            case 39 -> 18;
            case 40 -> 237;
            case 41 -> 207;
            case 42 -> 50;
            case 43 -> 115;
            case 44 -> 165;
            case 45 -> 210;
            case 46 -> 46;
            case 47 -> 187;
            case 48 -> 44;
            case 49 -> 170;
            case 50 -> 132;
            case 51 -> 234;
            case 52 -> 154;
            case 53 -> 30;
            case 54 -> 39;
            case 55 -> 145;
            case 56 -> 17;
            case 57 -> 144;
            case 58 -> 106;
            case 59 -> 202;
            case 60 -> 83;
            case 61 -> 141;
            case 62 -> 176;
            case 63 -> 94;
            case 64 -> 212;
            case 65 -> 107;
            case 66 -> 4;
            case 67 -> 79;
            case 68 -> 184;
            case 69 -> 65;
            case 70 -> 130;
            case 71 -> 54;
            case 72 -> 194;
            case 73 -> 192;
            case 74 -> 22;
            case 75 -> 73;
            case 76 -> 183;
            case 77 -> 205;
            case 78 -> 104;
            case 79 -> 82;
            case 80 -> 152;
            case 81 -> 241;
            case 82 -> 9;
            case 83 -> 68;
            case 84 -> 193;
            case 85 -> 189;
            case 86 -> 27;
            case 87 -> 125;
            case 88 -> 28;
            case 89 -> 198;
            case 90 -> 232;
            case 91 -> 139;
            case 92 -> 25;
            case 93 -> 215;
            case 94 -> 222;
            case 95 -> 155;
            case 96 -> 239;
            case 97 -> 253;
            case 98 -> 255;
            case 99 -> 156;
            case 100 -> 59;
            case 101 -> 214;
            case 102 -> 24;
            case 103 -> 181;
            case 104 -> 120;
            case 105 -> 235;
            case 106 -> 150;
            case 107 -> 12;
            case 108 -> 89;
            case 109 -> 55;
            case 110 -> 178;
            case 111 -> 142;
            case 112 -> 90;
            case 113 -> 254;
            case 114 -> 164;
            case 115 -> 114;
            case 116 -> 218;
            case 117 -> 131;
            case 118 -> 32;
            case 119 -> 117;
            case 120 -> 188;
            case 121 -> 11;
            case 122 -> 119;
            case 123 -> 249;
            case 124 -> 16;
            case 125 -> 78;
            case 126 -> 200;
            case 127 -> 116;
            case 128 -> 13;
            case 129 -> 63;
            case 130 -> 77;
            case 131 -> 167;
            case 132 -> 0;
            case 133 -> 240;
            case 134 -> 162;
            case 135 -> 153;
            case 136 -> 19;
            case 137 -> 38;
            case 138 -> 201;
            case 139 -> 26;
            case 140 -> 118;
            case 141 -> 95;
            case 142 -> 21;
            case 143 -> 186;
            case 144 -> 185;
            case 145 -> 93;
            case 146 -> 211;
            case 147 -> 7;
            case 148 -> 74;
            case 149 -> 217;
            case 150 -> 161;
            case 151 -> 35;
            case 152 -> 14;
            case 153 -> 72;
            case 154 -> 151;
            case 155 -> 76;
            case 156 -> 109;
            case 157 -> 100;
            case 158 -> 133;
            case 159 -> 69;
            case 160 -> 45;
            case 161 -> 81;
            case 162 -> 15;
            case 163 -> 252;
            case 164 -> 148;
            case 165 -> 1;
            case 166 -> 226;
            case 167 -> 159;
            case 168 -> 70;
            case 169 -> 97;
            case 170 -> 84;
            case 171 -> 57;
            case 172 -> 223;
            case 173 -> 195;
            case 174 -> 98;
            case 175 -> 146;
            case 176 -> 40;
            case 177 -> 53;
            case 178 -> 238;
            case 179 -> 140;
            case 180 -> 136;
            case 181 -> 166;
            case 182 -> 213;
            case 183 -> 37;
            case 184 -> 47;
            case 185 -> 20;
            case 186 -> 122;
            case 187 -> 245;
            case 188 -> 36;
            case 189 -> 231;
            case 190 -> 103;
            case 191 -> 56;
            case 192 -> 138;
            case 193 -> 67;
            case 194 -> 91;
            case 195 -> 124;
            case 196 -> 137;
            case 197 -> 61;
            case 198 -> 177;
            case 199 -> 126;
            case 200 -> 123;
            case 201 -> 220;
            case 202 -> 86;
            case 203 -> 228;
            case 204 -> 52;
            case 205 -> 143;
            case 206 -> 149;
            case 207 -> 85;
            case 208 -> 110;
            case 209 -> 246;
            case 210 -> 23;
            case 211 -> 191;
            case 212 -> 216;
            case 213 -> 43;
            case 214 -> 248;
            case 215 -> 225;
            case 216 -> 168;
            case 217 -> 111;
            case 218 -> 179;
            case 219 -> 92;
            case 220 -> 3;
            case 221 -> 48;
            case 222 -> 208;
            case 223 -> 230;
            case 224 -> 172;
            case 225 -> 157;
            case 226 -> 87;
            case 227 -> 229;
            case 228 -> 129;
            case 229 -> 2;
            case 230 -> 219;
            case 231 -> 196;
            case 232 -> 96;
            case 233 -> 64;
            case 234 -> 29;
            case 235 -> 175;
            case 236 -> 66;
            case 237 -> 6;
            case 238 -> 199;
            case 239 -> 134;
            case 240 -> 99;
            case 241 -> 182;
            case 242 -> 250;
            case 243 -> 180;
            case 244 -> 135;
            case 245 -> 203;
            case 246 -> 88;
            case 247 -> 242;
            case 248 -> 163;
            case 249 -> 108;
            case 250 -> 31;
            case 251 -> 236;
            case 252 -> 243;
            case 253 -> 227;
            case 254 -> 33;
            default -> 113;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static String[] a;
      private static String[] b;

      @Deprecated
      public static float a(@NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0) {
         return var0.a();
      }

      @Deprecated
      public static int b(@NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0) {
         return var0.b();
      }

      @Deprecated
      public static int a(
         @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0,
         @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1
      ) {
         short var10001 = -7766;
         short var10002 = 20254;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         return var0.a(var1);
      }

      @Deprecated
      public static boolean a(
         @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0,
         @NotNull GuiGraphicsExtractor var1,
         int var2,
         int var3,
         int var4,
         int var5,
         float var6
      ) {
         short var10001 = -7765;
         short var10002 = -7920;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         return var0.a(var1, var2, var3, var4, var5, var6);
      }

      @Deprecated
      public static boolean b(
         @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0,
         @NotNull GuiGraphicsExtractor var1,
         int var2,
         int var3,
         int var4,
         int var5,
         float var6
      ) {
         lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.d();
         short var10002 = -7767;
         short var10003 = -18583;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         boolean var10000 = var0.b(var1, var2, var3, var4, var5, var6);
         if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.b(new String[5]);
         }

         return var10000;
      }

      @Deprecated
      public static boolean a(
         @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0,
         @NotNull GuiGraphicsExtractor var1,
         int var2,
         int var3,
         float var4,
         float var5,
         float var6,
         float var7
      ) {
         String[] var10000 = lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.d();
         short var10002 = -7765;
         short var10003 = -7920;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         String[] var8 = var10000;
         boolean var9 = var0.a(var1, var2, var3, var4, var5, var6, var7);
         if (var8 == null) {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
            );
         }

         return var9;
      }

      @Deprecated
      public static void a(@NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0, char var1, int var2) {
         var0.a(var1, var2);
      }

      @Deprecated
      public static void c(@NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0) {
         var0.d();
      }

      @Deprecated
      public static boolean a(
         @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var0,
         int var1,
         int var2,
         int var3,
         int var4,
         int var5,
         int var6
      ) {
         return var0.a(var1, var2, var3, var4, var5, var6);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "ÈÆ\u000fº\u0099\u0003s\u0015@¿\u009c\n\u0090ûÂð_K{X\u0012¾\u000b0Û\u0010\u0019zw\u000f\u009bÏnm";
         int var4 = "ÈÆ\u000fº\u0099\u0003s\u0015@¿\u009c\n\u0090ûÂð_K{X\u0012¾\u000b0Û\u0010\u0019zw\u000f\u009bÏnm".length();
         char var1 = 11;
         int var0 = -1;

         while (true) {
            char[] var10002 = null;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 102;
               var10002 = var10003;
               int var8 = var10004;
               byte var16 = 0;
               char[] var10005 = null;
               int var10006 = 0;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 102;
                  var10006 = var6;
               } else {
                  var13 = 102;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 102;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 1;
                     case 1 -> 78;
                     case 2 -> 21;
                     case 3 -> 74;
                     case 4 -> 126;
                     case 5 -> 65;
                     default -> 96;
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
         int var2 = (var0 ^ -7765) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 45;
               case 1 -> 101;
               case 2 -> 51;
               case 3 -> 93;
               case 4 -> 202;
               case 5 -> 66;
               case 6 -> 165;
               case 7 -> 143;
               case 8 -> 237;
               case 9 -> 236;
               case 10 -> 26;
               case 11 -> 182;
               case 12 -> 213;
               case 13 -> 146;
               case 14 -> 23;
               case 15 -> 29;
               case 16 -> 88;
               case 17 -> 103;
               case 18 -> 127;
               case 19 -> 220;
               case 20 -> 184;
               case 21 -> 39;
               case 22 -> 200;
               case 23 -> 107;
               case 24 -> 189;
               case 25 -> 89;
               case 26 -> 244;
               case 27 -> 132;
               case 28 -> 216;
               case 29 -> 114;
               case 30 -> 246;
               case 31 -> 156;
               case 32 -> 255;
               case 33 -> 77;
               case 34 -> 63;
               case 35 -> 30;
               case 36 -> 217;
               case 37 -> 8;
               case 38 -> 198;
               case 39 -> 85;
               case 40 -> 12;
               case 41 -> 158;
               case 42 -> 214;
               case 43 -> 3;
               case 44 -> 154;
               case 45 -> 106;
               case 46 -> 43;
               case 47 -> 90;
               case 48 -> 62;
               case 49 -> 56;
               case 50 -> 91;
               case 51 -> 168;
               case 52 -> 75;
               case 53 -> 36;
               case 54 -> 48;
               case 55 -> 137;
               case 56 -> 190;
               case 57 -> 223;
               case 58 -> 208;
               case 59 -> 16;
               case 60 -> 225;
               case 61 -> 59;
               case 62 -> 15;
               case 63 -> 251;
               case 64 -> 155;
               case 65 -> 169;
               case 66 -> 32;
               case 67 -> 47;
               case 68 -> 148;
               case 69 -> 206;
               case 70 -> 2;
               case 71 -> 115;
               case 72 -> 219;
               case 73 -> 46;
               case 74 -> 10;
               case 75 -> 108;
               case 76 -> 135;
               case 77 -> 33;
               case 78 -> 247;
               case 79 -> 111;
               case 80 -> 4;
               case 81 -> 52;
               case 82 -> 117;
               case 83 -> 118;
               case 84 -> 203;
               case 85 -> 185;
               case 86 -> 133;
               case 87 -> 54;
               case 88 -> 162;
               case 89 -> 24;
               case 90 -> 68;
               case 91 -> 120;
               case 92 -> 78;
               case 93 -> 136;
               case 94 -> 228;
               case 95 -> 40;
               case 96 -> 11;
               case 97 -> 27;
               case 98 -> 201;
               case 99 -> 80;
               case 100 -> 104;
               case 101 -> 124;
               case 102 -> 171;
               case 103 -> 224;
               case 104 -> 222;
               case 105 -> 79;
               case 106 -> 187;
               case 107 -> 25;
               case 108 -> 71;
               case 109 -> 76;
               case 110 -> 174;
               case 111 -> 81;
               case 112 -> 131;
               case 113 -> 60;
               case 114 -> 7;
               case 115 -> 186;
               case 116 -> 157;
               case 117 -> 231;
               case 118 -> 250;
               case 119 -> 64;
               case 120 -> 119;
               case 121 -> 95;
               case 122 -> 97;
               case 123 -> 179;
               case 124 -> 5;
               case 125 -> 18;
               case 126 -> 73;
               case 127 -> 181;
               case 128 -> 175;
               case 129 -> 9;
               case 130 -> 14;
               case 131 -> 17;
               case 132 -> 116;
               case 133 -> 242;
               case 134 -> 248;
               case 135 -> 99;
               case 136 -> 70;
               case 137 -> 226;
               case 138 -> 61;
               case 139 -> 141;
               case 140 -> 172;
               case 141 -> 240;
               case 142 -> 191;
               case 143 -> 209;
               case 144 -> 210;
               case 145 -> 144;
               case 146 -> 229;
               case 147 -> 49;
               case 148 -> 241;
               case 149 -> 178;
               case 150 -> 125;
               case 151 -> 86;
               case 152 -> 152;
               case 153 -> 235;
               case 154 -> 140;
               case 155 -> 173;
               case 156 -> 65;
               case 157 -> 161;
               case 158 -> 83;
               case 159 -> 164;
               case 160 -> 145;
               case 161 -> 57;
               case 162 -> 149;
               case 163 -> 167;
               case 164 -> 22;
               case 165 -> 121;
               case 166 -> 197;
               case 167 -> 163;
               case 168 -> 211;
               case 169 -> 159;
               case 170 -> 34;
               case 171 -> 238;
               case 172 -> 195;
               case 173 -> 31;
               case 174 -> 128;
               case 175 -> 69;
               case 176 -> 98;
               case 177 -> 188;
               case 178 -> 100;
               case 179 -> 20;
               case 180 -> 139;
               case 181 -> 212;
               case 182 -> 53;
               case 183 -> 130;
               case 184 -> 21;
               case 185 -> 194;
               case 186 -> 215;
               case 187 -> 126;
               case 188 -> 196;
               case 189 -> 232;
               case 190 -> 221;
               case 191 -> 28;
               case 192 -> 150;
               case 193 -> 0;
               case 194 -> 204;
               case 195 -> 230;
               case 196 -> 254;
               case 197 -> 166;
               case 198 -> 58;
               case 199 -> 94;
               case 200 -> 74;
               case 201 -> 102;
               case 202 -> 245;
               case 203 -> 50;
               case 204 -> 151;
               case 205 -> 123;
               case 206 -> 192;
               case 207 -> 176;
               case 208 -> 199;
               case 209 -> 205;
               case 210 -> 110;
               case 211 -> 38;
               case 212 -> 233;
               case 213 -> 243;
               case 214 -> 92;
               case 215 -> 147;
               case 216 -> 170;
               case 217 -> 252;
               case 218 -> 72;
               case 219 -> 134;
               case 220 -> 13;
               case 221 -> 19;
               case 222 -> 42;
               case 223 -> 193;
               case 224 -> 37;
               case 225 -> 183;
               case 226 -> 105;
               case 227 -> 180;
               case 228 -> 67;
               case 229 -> 35;
               case 230 -> 177;
               case 231 -> 96;
               case 232 -> 1;
               case 233 -> 109;
               case 234 -> 142;
               case 235 -> 160;
               case 236 -> 113;
               case 237 -> 227;
               case 238 -> 122;
               case 239 -> 84;
               case 240 -> 234;
               case 241 -> 207;
               case 242 -> 253;
               case 243 -> 138;
               case 244 -> 6;
               case 245 -> 44;
               case 246 -> 112;
               case 247 -> 153;
               case 248 -> 87;
               case 249 -> 129;
               case 250 -> 55;
               case 251 -> 218;
               case 252 -> 249;
               case 253 -> 41;
               case 254 -> 239;
               default -> 82;
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
   public static float a(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self) {
      return self.a();
   }

   public static void a(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self, char p1, int p2) {
      self.a(p1, p2);
   }

   public static boolean a(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self, int p1, int p2, int p3, int p4, int p5, int p6) {
      return self.a(p1, p2, p3, p4, p5, p6);
   }

   public static int a(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p1) {
      return self.a(p1);
   }

   public static boolean a(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self, net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, float p4, float p5, float p6, float p7) {
      return self.a(p1, p2, p3, p4, p5, p6, p7);
   }

   public static boolean a(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self, net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return self.a(p1, p2, p3, p4, p5, p6);
   }

   public static int b(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self) {
      return self.b();
   }

   public static boolean b(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self, net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return self.b(p1, p2, p3, p4, p5, p6);
   }

   public static void c(me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl self) {
      self.d();
   }

}
