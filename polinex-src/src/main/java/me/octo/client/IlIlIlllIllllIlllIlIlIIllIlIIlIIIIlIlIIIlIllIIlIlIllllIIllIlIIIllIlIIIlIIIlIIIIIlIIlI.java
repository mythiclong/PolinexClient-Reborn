package me.octo.client;

import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.mixin.accessors.RenderPipelineBuilderInvoker;
import org.jetbrains.annotations.NotNull;

public final class IlIlIlllIllllIlllIlIlIIllIlIIlIIIIlIlIIIlIllIIlIlIllllIIllIlIIIllIlIIIlIIIlIIIIIlIIlI {
   private static String[] a;
   private static String[] b;

   @NotNull
   public static final Builder a() {
      Builder var10000 = RenderPipelineBuilderInvoker.polinex$create();
      short var10002 = -12890;
      short var10003 = -6041;
      Intrinsics.checkNotNullExpressionValue(var10000, "polinex$create(...)");
      return var10000;
   }

   @NotNull
   public static final Builder a(@NotNull Builder var0, @NotNull Snippet var1) {
      short var10001 = -12889;
      short var10002 = 26202;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = -12891;
      var10002 = 10691;
      Intrinsics.checkNotNullParameter(var1, "snippet");
      boolean var4 = false;
      ((RenderPipelineBuilderInvoker)var0).polinex$invokeWithSnippet(var1);
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0097\u0094\u008a+4\u008a\u00130\u0091¿ó\u000bÊ\n \u009b}3\u0081N¨\u008f<Yh\u009a\u0007a=ó^9E\u009d";
      int var4 = "\u0097\u0094\u008a+4\u008a\u00130\u0091¿ó\u000bÊ\n \u009b}3\u0081N¨\u008f<Yh\u009a\u0007a=ó^9E\u009d".length();
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 90;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 90;
               var10006 = var6;
            } else {
               var13 = 90;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 90;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 68;
                  case 1 -> 123;
                  case 2 -> 50;
                  case 3 -> 84;
                  case 4 -> 36;
                  case 5 -> 14;
                  default -> 37;
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
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12889) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 226;
            case 1 -> 77;
            case 2 -> 171;
            case 3 -> 152;
            case 4 -> 70;
            case 5 -> 205;
            case 6 -> 140;
            case 7 -> 112;
            case 8 -> 88;
            case 9 -> 237;
            case 10 -> 243;
            case 11 -> 192;
            case 12 -> 74;
            case 13 -> 62;
            case 14 -> 210;
            case 15 -> 18;
            case 16 -> 83;
            case 17 -> 120;
            case 18 -> 190;
            case 19 -> 118;
            case 20 -> 107;
            case 21 -> 133;
            case 22 -> 194;
            case 23 -> 142;
            case 24 -> 78;
            case 25 -> 61;
            case 26 -> 117;
            case 27 -> 1;
            case 28 -> 244;
            case 29 -> 76;
            case 30 -> 65;
            case 31 -> 126;
            case 32 -> 109;
            case 33 -> 145;
            case 34 -> 223;
            case 35 -> 36;
            case 36 -> 178;
            case 37 -> 40;
            case 38 -> 185;
            case 39 -> 115;
            case 40 -> 53;
            case 41 -> 73;
            case 42 -> 225;
            case 43 -> 84;
            case 44 -> 13;
            case 45 -> 92;
            case 46 -> 9;
            case 47 -> 95;
            case 48 -> 247;
            case 49 -> 197;
            case 50 -> 130;
            case 51 -> 71;
            case 52 -> 186;
            case 53 -> 193;
            case 54 -> 141;
            case 55 -> 104;
            case 56 -> 24;
            case 57 -> 108;
            case 58 -> 202;
            case 59 -> 175;
            case 60 -> 218;
            case 61 -> 251;
            case 62 -> 177;
            case 63 -> 79;
            case 64 -> 38;
            case 65 -> 198;
            case 66 -> 4;
            case 67 -> 19;
            case 68 -> 166;
            case 69 -> 91;
            case 70 -> 246;
            case 71 -> 129;
            case 72 -> 230;
            case 73 -> 105;
            case 74 -> 5;
            case 75 -> 228;
            case 76 -> 168;
            case 77 -> 163;
            case 78 -> 103;
            case 79 -> 131;
            case 80 -> 51;
            case 81 -> 134;
            case 82 -> 213;
            case 83 -> 180;
            case 84 -> 242;
            case 85 -> 245;
            case 86 -> 34;
            case 87 -> 169;
            case 88 -> 30;
            case 89 -> 124;
            case 90 -> 43;
            case 91 -> 57;
            case 92 -> 207;
            case 93 -> 195;
            case 94 -> 184;
            case 95 -> 56;
            case 96 -> 252;
            case 97 -> 86;
            case 98 -> 101;
            case 99 -> 67;
            case 100 -> 75;
            case 101 -> 46;
            case 102 -> 93;
            case 103 -> 196;
            case 104 -> 26;
            case 105 -> 179;
            case 106 -> 204;
            case 107 -> 12;
            case 108 -> 233;
            case 109 -> 60;
            case 110 -> 208;
            case 111 -> 47;
            case 112 -> 16;
            case 113 -> 143;
            case 114 -> 189;
            case 115 -> 111;
            case 116 -> 96;
            case 117 -> 154;
            case 118 -> 22;
            case 119 -> 87;
            case 120 -> 181;
            case 121 -> 31;
            case 122 -> 200;
            case 123 -> 33;
            case 124 -> 59;
            case 125 -> 2;
            case 126 -> 158;
            case 127 -> 183;
            case 128 -> 100;
            case 129 -> 35;
            case 130 -> 28;
            case 131 -> 114;
            case 132 -> 3;
            case 133 -> 182;
            case 134 -> 240;
            case 135 -> 15;
            case 136 -> 191;
            case 137 -> 165;
            case 138 -> 98;
            case 139 -> 214;
            case 140 -> 255;
            case 141 -> 157;
            case 142 -> 221;
            case 143 -> 174;
            case 144 -> 82;
            case 145 -> 153;
            case 146 -> 162;
            case 147 -> 203;
            case 148 -> 148;
            case 149 -> 27;
            case 150 -> 55;
            case 151 -> 229;
            case 152 -> 63;
            case 153 -> 66;
            case 154 -> 99;
            case 155 -> 23;
            case 156 -> 39;
            case 157 -> 123;
            case 158 -> 215;
            case 159 -> 125;
            case 160 -> 135;
            case 161 -> 211;
            case 162 -> 52;
            case 163 -> 49;
            case 164 -> 90;
            case 165 -> 161;
            case 166 -> 172;
            case 167 -> 6;
            case 168 -> 50;
            case 169 -> 8;
            case 170 -> 54;
            case 171 -> 72;
            case 172 -> 173;
            case 173 -> 139;
            case 174 -> 127;
            case 175 -> 42;
            case 176 -> 236;
            case 177 -> 7;
            case 178 -> 239;
            case 179 -> 155;
            case 180 -> 58;
            case 181 -> 48;
            case 182 -> 151;
            case 183 -> 167;
            case 184 -> 116;
            case 185 -> 150;
            case 186 -> 232;
            case 187 -> 44;
            case 188 -> 201;
            case 189 -> 106;
            case 190 -> 253;
            case 191 -> 234;
            case 192 -> 227;
            case 193 -> 0;
            case 194 -> 45;
            case 195 -> 216;
            case 196 -> 188;
            case 197 -> 21;
            case 198 -> 187;
            case 199 -> 32;
            case 200 -> 224;
            case 201 -> 97;
            case 202 -> 160;
            case 203 -> 89;
            case 204 -> 176;
            case 205 -> 235;
            case 206 -> 113;
            case 207 -> 249;
            case 208 -> 137;
            case 209 -> 25;
            case 210 -> 254;
            case 211 -> 206;
            case 212 -> 250;
            case 213 -> 156;
            case 214 -> 209;
            case 215 -> 138;
            case 216 -> 119;
            case 217 -> 81;
            case 218 -> 147;
            case 219 -> 14;
            case 220 -> 146;
            case 221 -> 94;
            case 222 -> 212;
            case 223 -> 29;
            case 224 -> 149;
            case 225 -> 85;
            case 226 -> 17;
            case 227 -> 231;
            case 228 -> 122;
            case 229 -> 10;
            case 230 -> 144;
            case 231 -> 222;
            case 232 -> 217;
            case 233 -> 102;
            case 234 -> 199;
            case 235 -> 159;
            case 236 -> 136;
            case 237 -> 20;
            case 238 -> 132;
            case 239 -> 241;
            case 240 -> 128;
            case 241 -> 238;
            case 242 -> 41;
            case 243 -> 110;
            case 244 -> 64;
            case 245 -> 170;
            case 246 -> 219;
            case 247 -> 11;
            case 248 -> 220;
            case 249 -> 164;
            case 250 -> 68;
            case 251 -> 69;
            case 252 -> 37;
            case 253 -> 80;
            case 254 -> 121;
            default -> 248;
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
