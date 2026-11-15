package me.octo.client.events.impl;

import com.mojang.blaze3d.vertex.PoseStack;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@me.octo.client.events.impl.base.annotations.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
public final class IlllIIIIllllIIllIlllIllIIIllIIIlIllIIllIlIIIlllIllllllIllIlIIIIIllIIlIlIllIIllIIlIIII
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   private final AbstractClientPlayer IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final InteractionHand IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private ItemStack lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final PoseStack lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final MultiBufferSource lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private final boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] c;
   private static String[] d;

   public IlllIIIIllllIIllIlllIllIIIllIIIlIllIIllIlIIIlllIllllllIllIlIIIIIllIIlIlIllIIllIIlIIII(
      @NotNull AbstractClientPlayer var1,
      float var2,
      float var3,
      @NotNull InteractionHand var4,
      float var5,
      @NotNull ItemStack var6,
      float var7,
      @NotNull PoseStack var8,
      @NotNull MultiBufferSource var9,
      int var10,
      boolean var11
   ) {
      short var10001 = 19527;
      short var10002 = -28178;
      Intrinsics.checkNotNullParameter(var1, "player");
      var10001 = 19526;
      var10002 = 11474;
      Intrinsics.checkNotNullParameter(var4, "hand");
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.n();
      var10002 = 19524;
      short var10003 = -16179;
      Intrinsics.checkNotNullParameter(var6, "itemStack");
      String var12 = var10000;
      var10001 = 19522;
      var10002 = -3977;
      Intrinsics.checkNotNullParameter(var8, "matrixStack");
      var10001 = 19525;
      var10002 = -21798;
      Intrinsics.checkNotNullParameter(var9, "vertexConsumerProvider");
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var4;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var5;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var6;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var7;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var8;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var9;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var10;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var11;
      if (var12 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }
   }

   @NotNull
   public final AbstractClientPlayer k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final float l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final float m() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final InteractionHand n() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final float o() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void a(float var1) {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   @NotNull
   public final ItemStack p() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void a(@NotNull ItemStack var1) {
      short var10001 = 19523;
      short var10002 = 23542;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final float q() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void b(float var1) {
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   @NotNull
   public final PoseStack r() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @NotNull
   public final MultiBufferSource s() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final int t() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final boolean u() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "'ã;é[h\u0004\u009f·8Ò\u0016§\u001bþÓ\u0092\u0089ñs\u0011_ù\u008fðjÝiNj6àÎÜ\tÛ\u0084\u009a\nÝ\u0084ÊS\u0015";
      int var4 = "'ã;é[h\u0004\u009f·8Ò\u0016§\u001bþÓ\u0092\u0089ñs\u0011_ù\u008fðjÝiNj6àÎÜ\tÛ\u0084\u009a\nÝ\u0084ÊS\u0015".length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 93;
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
                     case 0 -> 8;
                     case 1 -> 119;
                     case 2 -> 55;
                     case 3 -> 21;
                     case 4 -> 4;
                     case 5 -> 37;
                     default -> 95;
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
                     d = new String[6];
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

                  var2 = "\u008fÀézËýà\u000b\u0011\u009bPG\u008bÛI$\u001dÛ\u008e";
                  var4 = "\u008fÀézËýà\u000b\u0011\u009bPG\u008bÛI$\u001dÛ\u008e".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 54;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 19527) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 244;
            case 1 -> 32;
            case 2 -> 68;
            case 3 -> 176;
            case 4 -> 122;
            case 5 -> 152;
            case 6 -> 192;
            case 7 -> 223;
            case 8 -> 18;
            case 9 -> 217;
            case 10 -> 171;
            case 11 -> 150;
            case 12 -> 166;
            case 13 -> 124;
            case 14 -> 203;
            case 15 -> 146;
            case 16 -> 1;
            case 17 -> 111;
            case 18 -> 81;
            case 19 -> 112;
            case 20 -> 205;
            case 21 -> 116;
            case 22 -> 229;
            case 23 -> 255;
            case 24 -> 147;
            case 25 -> 128;
            case 26 -> 103;
            case 27 -> 119;
            case 28 -> 82;
            case 29 -> 96;
            case 30 -> 104;
            case 31 -> 45;
            case 32 -> 148;
            case 33 -> 195;
            case 34 -> 10;
            case 35 -> 189;
            case 36 -> 107;
            case 37 -> 158;
            case 38 -> 153;
            case 39 -> 30;
            case 40 -> 22;
            case 41 -> 88;
            case 42 -> 61;
            case 43 -> 95;
            case 44 -> 28;
            case 45 -> 63;
            case 46 -> 69;
            case 47 -> 53;
            case 48 -> 170;
            case 49 -> 4;
            case 50 -> 62;
            case 51 -> 125;
            case 52 -> 142;
            case 53 -> 52;
            case 54 -> 19;
            case 55 -> 14;
            case 56 -> 227;
            case 57 -> 251;
            case 58 -> 129;
            case 59 -> 237;
            case 60 -> 145;
            case 61 -> 38;
            case 62 -> 242;
            case 63 -> 235;
            case 64 -> 252;
            case 65 -> 121;
            case 66 -> 201;
            case 67 -> 94;
            case 68 -> 58;
            case 69 -> 23;
            case 70 -> 49;
            case 71 -> 138;
            case 72 -> 118;
            case 73 -> 47;
            case 74 -> 174;
            case 75 -> 55;
            case 76 -> 17;
            case 77 -> 253;
            case 78 -> 216;
            case 79 -> 117;
            case 80 -> 7;
            case 81 -> 232;
            case 82 -> 102;
            case 83 -> 185;
            case 84 -> 100;
            case 85 -> 24;
            case 86 -> 190;
            case 87 -> 34;
            case 88 -> 87;
            case 89 -> 225;
            case 90 -> 188;
            case 91 -> 213;
            case 92 -> 156;
            case 93 -> 231;
            case 94 -> 243;
            case 95 -> 92;
            case 96 -> 250;
            case 97 -> 210;
            case 98 -> 50;
            case 99 -> 40;
            case 100 -> 224;
            case 101 -> 151;
            case 102 -> 172;
            case 103 -> 175;
            case 104 -> 11;
            case 105 -> 20;
            case 106 -> 140;
            case 107 -> 238;
            case 108 -> 77;
            case 109 -> 31;
            case 110 -> 70;
            case 111 -> 114;
            case 112 -> 8;
            case 113 -> 0;
            case 114 -> 236;
            case 115 -> 76;
            case 116 -> 80;
            case 117 -> 113;
            case 118 -> 218;
            case 119 -> 173;
            case 120 -> 211;
            case 121 -> 60;
            case 122 -> 65;
            case 123 -> 144;
            case 124 -> 134;
            case 125 -> 214;
            case 126 -> 215;
            case 127 -> 41;
            case 128 -> 43;
            case 129 -> 135;
            case 130 -> 163;
            case 131 -> 21;
            case 132 -> 74;
            case 133 -> 177;
            case 134 -> 123;
            case 135 -> 254;
            case 136 -> 2;
            case 137 -> 33;
            case 138 -> 199;
            case 139 -> 186;
            case 140 -> 56;
            case 141 -> 42;
            case 142 -> 230;
            case 143 -> 79;
            case 144 -> 36;
            case 145 -> 101;
            case 146 -> 226;
            case 147 -> 15;
            case 148 -> 159;
            case 149 -> 162;
            case 150 -> 181;
            case 151 -> 239;
            case 152 -> 219;
            case 153 -> 26;
            case 154 -> 64;
            case 155 -> 167;
            case 156 -> 208;
            case 157 -> 25;
            case 158 -> 51;
            case 159 -> 164;
            case 160 -> 247;
            case 161 -> 154;
            case 162 -> 196;
            case 163 -> 182;
            case 164 -> 89;
            case 165 -> 169;
            case 166 -> 120;
            case 167 -> 221;
            case 168 -> 143;
            case 169 -> 209;
            case 170 -> 126;
            case 171 -> 222;
            case 172 -> 139;
            case 173 -> 67;
            case 174 -> 137;
            case 175 -> 141;
            case 176 -> 5;
            case 177 -> 105;
            case 178 -> 136;
            case 179 -> 149;
            case 180 -> 73;
            case 181 -> 46;
            case 182 -> 44;
            case 183 -> 108;
            case 184 -> 206;
            case 185 -> 194;
            case 186 -> 12;
            case 187 -> 39;
            case 188 -> 220;
            case 189 -> 212;
            case 190 -> 90;
            case 191 -> 9;
            case 192 -> 197;
            case 193 -> 54;
            case 194 -> 3;
            case 195 -> 83;
            case 196 -> 75;
            case 197 -> 85;
            case 198 -> 93;
            case 199 -> 130;
            case 200 -> 193;
            case 201 -> 16;
            case 202 -> 48;
            case 203 -> 78;
            case 204 -> 37;
            case 205 -> 132;
            case 206 -> 207;
            case 207 -> 180;
            case 208 -> 97;
            case 209 -> 233;
            case 210 -> 179;
            case 211 -> 245;
            case 212 -> 35;
            case 213 -> 234;
            case 214 -> 241;
            case 215 -> 178;
            case 216 -> 161;
            case 217 -> 155;
            case 218 -> 160;
            case 219 -> 168;
            case 220 -> 84;
            case 221 -> 204;
            case 222 -> 71;
            case 223 -> 99;
            case 224 -> 29;
            case 225 -> 6;
            case 226 -> 72;
            case 227 -> 106;
            case 228 -> 246;
            case 229 -> 27;
            case 230 -> 228;
            case 231 -> 198;
            case 232 -> 248;
            case 233 -> 133;
            case 234 -> 109;
            case 235 -> 157;
            case 236 -> 127;
            case 237 -> 91;
            case 238 -> 13;
            case 239 -> 183;
            case 240 -> 184;
            case 241 -> 59;
            case 242 -> 86;
            case 243 -> 187;
            case 244 -> 202;
            case 245 -> 110;
            case 246 -> 200;
            case 247 -> 66;
            case 248 -> 249;
            case 249 -> 191;
            case 250 -> 98;
            case 251 -> 131;
            case 252 -> 240;
            case 253 -> 165;
            case 254 -> 115;
            default -> 57;
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
