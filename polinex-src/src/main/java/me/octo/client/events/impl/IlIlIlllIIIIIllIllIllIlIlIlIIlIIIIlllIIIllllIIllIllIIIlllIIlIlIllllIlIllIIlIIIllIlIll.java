package me.octo.client.events.impl;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.vertex.PoseStack;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import org.jetbrains.annotations.NotNull;

public final class IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   private final RenderTarget IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final PoseStack IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final CameraRenderState lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] c;
   private static String[] d;

   public IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll(
      @NotNull RenderTarget var1,
      @NotNull PoseStack var2,
      @NotNull CameraRenderState var3,
      float var4,
      @NotNull IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5
   ) {
      short var10001 = 23387;
      short var10002 = -8387;
      Intrinsics.checkNotNullParameter(var1, "renderTarget");
      var10001 = 23385;
      var10002 = -2672;
      Intrinsics.checkNotNullParameter(var2, "matrices");
      var10001 = 23384;
      var10002 = -28534;
      Intrinsics.checkNotNullParameter(var3, "cameraState");
      var10001 = 23386;
      var10002 = -17963;
      Intrinsics.checkNotNullParameter(var5, "type");
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var4;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var5;
   }

   @NotNull
   public final RenderTarget k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final PoseStack l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final CameraRenderState m() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final float n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll o() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final boolean p() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void q() {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "üÇÐy\u008bÚz>\u000b\u00adï,k5oãÍ\u0012ÌÔ";
      int var4 = "üÇÐy\u008bÚz>\u000b\u00adï,k5oãÍ\u0012ÌÔ".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 68;
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
                     case 0 -> 89;
                     case 1 -> 19;
                     case 2 -> 28;
                     case 3 -> 16;
                     case 4 -> 77;
                     case 5 -> 100;
                     default -> 79;
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
                     c = var5;
                     d = new String[4];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "`Û?ò¹ô\u001a@CC\u0015\u000f\u0004\tRÊ]";
                  var4 = "`Û?ò¹ô\u001a@CC\u0015\u000f\u0004\tRÊ]".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 121;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 23385) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 88;
            case 1 -> 38;
            case 2 -> 225;
            case 3 -> 217;
            case 4 -> 246;
            case 5 -> 99;
            case 6 -> 72;
            case 7 -> 254;
            case 8 -> 253;
            case 9 -> 22;
            case 10 -> 50;
            case 11 -> 66;
            case 12 -> 175;
            case 13 -> 123;
            case 14 -> 49;
            case 15 -> 159;
            case 16 -> 124;
            case 17 -> 102;
            case 18 -> 64;
            case 19 -> 127;
            case 20 -> 188;
            case 21 -> 98;
            case 22 -> 13;
            case 23 -> 76;
            case 24 -> 131;
            case 25 -> 230;
            case 26 -> 191;
            case 27 -> 214;
            case 28 -> 223;
            case 29 -> 247;
            case 30 -> 115;
            case 31 -> 151;
            case 32 -> 195;
            case 33 -> 117;
            case 34 -> 203;
            case 35 -> 105;
            case 36 -> 81;
            case 37 -> 53;
            case 38 -> 100;
            case 39 -> 242;
            case 40 -> 28;
            case 41 -> 120;
            case 42 -> 216;
            case 43 -> 26;
            case 44 -> 10;
            case 45 -> 60;
            case 46 -> 233;
            case 47 -> 39;
            case 48 -> 162;
            case 49 -> 206;
            case 50 -> 226;
            case 51 -> 29;
            case 52 -> 136;
            case 53 -> 5;
            case 54 -> 56;
            case 55 -> 249;
            case 56 -> 182;
            case 57 -> 63;
            case 58 -> 213;
            case 59 -> 1;
            case 60 -> 148;
            case 61 -> 234;
            case 62 -> 142;
            case 63 -> 228;
            case 64 -> 11;
            case 65 -> 141;
            case 66 -> 83;
            case 67 -> 164;
            case 68 -> 156;
            case 69 -> 73;
            case 70 -> 177;
            case 71 -> 140;
            case 72 -> 153;
            case 73 -> 128;
            case 74 -> 237;
            case 75 -> 89;
            case 76 -> 61;
            case 77 -> 79;
            case 78 -> 75;
            case 79 -> 34;
            case 80 -> 101;
            case 81 -> 3;
            case 82 -> 85;
            case 83 -> 238;
            case 84 -> 129;
            case 85 -> 37;
            case 86 -> 44;
            case 87 -> 232;
            case 88 -> 239;
            case 89 -> 25;
            case 90 -> 116;
            case 91 -> 251;
            case 92 -> 255;
            case 93 -> 198;
            case 94 -> 107;
            case 95 -> 137;
            case 96 -> 96;
            case 97 -> 19;
            case 98 -> 27;
            case 99 -> 67;
            case 100 -> 74;
            case 101 -> 69;
            case 102 -> 179;
            case 103 -> 32;
            case 104 -> 20;
            case 105 -> 209;
            case 106 -> 187;
            case 107 -> 211;
            case 108 -> 47;
            case 109 -> 109;
            case 110 -> 93;
            case 111 -> 180;
            case 112 -> 165;
            case 113 -> 52;
            case 114 -> 174;
            case 115 -> 207;
            case 116 -> 176;
            case 117 -> 130;
            case 118 -> 77;
            case 119 -> 243;
            case 120 -> 80;
            case 121 -> 161;
            case 122 -> 200;
            case 123 -> 202;
            case 124 -> 97;
            case 125 -> 106;
            case 126 -> 15;
            case 127 -> 240;
            case 128 -> 33;
            case 129 -> 12;
            case 130 -> 7;
            case 131 -> 54;
            case 132 -> 45;
            case 133 -> 181;
            case 134 -> 84;
            case 135 -> 121;
            case 136 -> 149;
            case 137 -> 2;
            case 138 -> 111;
            case 139 -> 212;
            case 140 -> 138;
            case 141 -> 222;
            case 142 -> 42;
            case 143 -> 250;
            case 144 -> 166;
            case 145 -> 205;
            case 146 -> 143;
            case 147 -> 221;
            case 148 -> 91;
            case 149 -> 16;
            case 150 -> 31;
            case 151 -> 171;
            case 152 -> 194;
            case 153 -> 82;
            case 154 -> 157;
            case 155 -> 235;
            case 156 -> 43;
            case 157 -> 241;
            case 158 -> 229;
            case 159 -> 204;
            case 160 -> 46;
            case 161 -> 30;
            case 162 -> 201;
            case 163 -> 110;
            case 164 -> 160;
            case 165 -> 24;
            case 166 -> 104;
            case 167 -> 14;
            case 168 -> 154;
            case 169 -> 59;
            case 170 -> 192;
            case 171 -> 236;
            case 172 -> 58;
            case 173 -> 189;
            case 174 -> 48;
            case 175 -> 112;
            case 176 -> 183;
            case 177 -> 51;
            case 178 -> 197;
            case 179 -> 40;
            case 180 -> 193;
            case 181 -> 132;
            case 182 -> 158;
            case 183 -> 71;
            case 184 -> 219;
            case 185 -> 68;
            case 186 -> 87;
            case 187 -> 244;
            case 188 -> 103;
            case 189 -> 248;
            case 190 -> 119;
            case 191 -> 114;
            case 192 -> 9;
            case 193 -> 78;
            case 194 -> 196;
            case 195 -> 218;
            case 196 -> 21;
            case 197 -> 215;
            case 198 -> 86;
            case 199 -> 95;
            case 200 -> 8;
            case 201 -> 252;
            case 202 -> 118;
            case 203 -> 18;
            case 204 -> 168;
            case 205 -> 186;
            case 206 -> 169;
            case 207 -> 144;
            case 208 -> 94;
            case 209 -> 65;
            case 210 -> 224;
            case 211 -> 227;
            case 212 -> 57;
            case 213 -> 167;
            case 214 -> 55;
            case 215 -> 190;
            case 216 -> 173;
            case 217 -> 145;
            case 218 -> 90;
            case 219 -> 147;
            case 220 -> 0;
            case 221 -> 208;
            case 222 -> 220;
            case 223 -> 152;
            case 224 -> 108;
            case 225 -> 4;
            case 226 -> 92;
            case 227 -> 170;
            case 228 -> 62;
            case 229 -> 125;
            case 230 -> 35;
            case 231 -> 210;
            case 232 -> 155;
            case 233 -> 139;
            case 234 -> 184;
            case 235 -> 113;
            case 236 -> 178;
            case 237 -> 185;
            case 238 -> 146;
            case 239 -> 245;
            case 240 -> 70;
            case 241 -> 199;
            case 242 -> 122;
            case 243 -> 172;
            case 244 -> 36;
            case 245 -> 231;
            case 246 -> 41;
            case 247 -> 17;
            case 248 -> 6;
            case 249 -> 163;
            case 250 -> 135;
            case 251 -> 134;
            case 252 -> 126;
            case 253 -> 23;
            case 254 -> 133;
            default -> 150;
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

   public static enum llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public static IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] a() {
         return (IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         String var0
      ) {
         return Enum.valueOf(
            IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] c() {
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var0 = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[2];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return var0;
      }
   }
}
