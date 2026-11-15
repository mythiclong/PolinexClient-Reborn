package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class llIllIIlIlllIIllIIlllIIIIllIllllIIllllIlIIIlIlIIllIlllllIlIlIlIIIllIllllllllIllIlIIll
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] d;
   private static String[] e;

   public llIllIIlIlllIIllIIlllIIIIllIllllIIllllIlIIIlIlIIllIlllllIlIlIlIIIllIllllllllIllIlIIll(
      @NotNull IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll var1
   ) {
      short var10001 = -15226;
      short var10002 = 22332;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) {
      String[] var6;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var7;
      float var8;
      String var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      int var15;
      int var18;
      label60: {
         label63: {
            short var10001 = -15228;
            short var10002 = 19862;
            Intrinsics.checkNotNullParameter(var1, "drawContext");
            var10001 = -15227;
            var10002 = 9261;
            Intrinsics.checkNotNullParameter(var2, "resolution");
            var7 = null;
            var8 = 22.0F;
            String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
            var9 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
            var10 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var9, false, 2, null);
            var6 = var10000;
            var11 = RangesKt.coerceAtLeast(var10 + 24.0F, 64.0F);
            var12 = var2.e() - 14.0F - var11;
            var13 = var3 + 18.0F;
            var14 = var13 - var8 / 2.0F;
            var15 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)(var12 - 8));
            float var22;
            var18 = (var22 = var4 - var12) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
            if (var6 != null) {
               if (var18 < 0) {
                  break label63;
               }

               float var23;
               var18 = (var23 = var4 - (var12 + var11)) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (var18 > 0) {
                  break label63;
               }

               float var24;
               var18 = (var24 = var5 - var14) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            }

            if (var6 != null) {
               if (var18 < 0) {
                  break label63;
               }

               float var25;
               var18 = (var25 = var5 - (var14 + var8)) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
            }

            if (var6 == null) {
               break label60;
            }

            if (var18 <= 0) {
               var18 = 1;
               break label60;
            }
         }

         var18 = 0;
      }

      int var16 = var18;
      float var17 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .aq();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var12,
         var14,
         var11,
         var8,
         var16 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .h(),
         var17
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var12,
         var14,
         var11,
         var8,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(var16 != 0 ? 0.7F : 0.35F),
         var17
      );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         var9,
         var12 + var11 / 2.0F - var10 / 2.0F,
         var13,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         false, 16, null);
      var18 = var16;
      if (var6 != null) {
         if (var16 == 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(Math.max(var15, (int)(var14 + var8 + 6.0F)), var7);
         }

         float var26;
         var18 = (var26 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
      }

      if (var18 > 0) {
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         var7 = this;
      }

      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(Math.max(var15, (int)(var14 + var8 + 6.0F)), var7);
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   public void e() {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().invoke();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "n¢\u0016É%tÌñYî@\nÒ\u0013G\u0012p\u000e¶úE'\u0007\u00ad}\u008eÄ«·{";
      int var4 = "n¢\u0016É%tÌñYî@\nÒ\u0013G\u0012p\u000e¶úE'\u0007\u00ad}\u008eÄ«·{".length();
      char var1 = 11;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 109;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 109;
               var10006 = var6;
            } else {
               var13 = 109;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 109;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 79;
                  case 1 -> 98;
                  case 2 -> 123;
                  case 3 -> 90;
                  case 4 -> 70;
                  case 5 -> 48;
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
            d = var5;
            e = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -15228) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 7;
            case 1 -> 105;
            case 2 -> 89;
            case 3 -> 249;
            case 4 -> 178;
            case 5 -> 134;
            case 6 -> 123;
            case 7 -> 200;
            case 8 -> 88;
            case 9 -> 119;
            case 10 -> 182;
            case 11 -> 222;
            case 12 -> 22;
            case 13 -> 245;
            case 14 -> 196;
            case 15 -> 115;
            case 16 -> 66;
            case 17 -> 174;
            case 18 -> 65;
            case 19 -> 113;
            case 20 -> 202;
            case 21 -> 45;
            case 22 -> 111;
            case 23 -> 47;
            case 24 -> 72;
            case 25 -> 37;
            case 26 -> 142;
            case 27 -> 219;
            case 28 -> 102;
            case 29 -> 247;
            case 30 -> 62;
            case 31 -> 180;
            case 32 -> 231;
            case 33 -> 112;
            case 34 -> 197;
            case 35 -> 42;
            case 36 -> 176;
            case 37 -> 104;
            case 38 -> 135;
            case 39 -> 56;
            case 40 -> 4;
            case 41 -> 149;
            case 42 -> 152;
            case 43 -> 217;
            case 44 -> 172;
            case 45 -> 186;
            case 46 -> 201;
            case 47 -> 198;
            case 48 -> 23;
            case 49 -> 191;
            case 50 -> 28;
            case 51 -> 39;
            case 52 -> 161;
            case 53 -> 139;
            case 54 -> 208;
            case 55 -> 84;
            case 56 -> 93;
            case 57 -> 49;
            case 58 -> 103;
            case 59 -> 188;
            case 60 -> 82;
            case 61 -> 185;
            case 62 -> 241;
            case 63 -> 154;
            case 64 -> 41;
            case 65 -> 6;
            case 66 -> 30;
            case 67 -> 26;
            case 68 -> 155;
            case 69 -> 252;
            case 70 -> 223;
            case 71 -> 17;
            case 72 -> 57;
            case 73 -> 69;
            case 74 -> 36;
            case 75 -> 232;
            case 76 -> 110;
            case 77 -> 13;
            case 78 -> 228;
            case 79 -> 75;
            case 80 -> 177;
            case 81 -> 50;
            case 82 -> 246;
            case 83 -> 147;
            case 84 -> 16;
            case 85 -> 244;
            case 86 -> 165;
            case 87 -> 138;
            case 88 -> 250;
            case 89 -> 9;
            case 90 -> 169;
            case 91 -> 20;
            case 92 -> 46;
            case 93 -> 190;
            case 94 -> 18;
            case 95 -> 163;
            case 96 -> 91;
            case 97 -> 67;
            case 98 -> 148;
            case 99 -> 124;
            case 100 -> 233;
            case 101 -> 206;
            case 102 -> 118;
            case 103 -> 107;
            case 104 -> 32;
            case 105 -> 133;
            case 106 -> 204;
            case 107 -> 117;
            case 108 -> 130;
            case 109 -> 74;
            case 110 -> 193;
            case 111 -> 132;
            case 112 -> 85;
            case 113 -> 35;
            case 114 -> 156;
            case 115 -> 114;
            case 116 -> 173;
            case 117 -> 48;
            case 118 -> 125;
            case 119 -> 207;
            case 120 -> 199;
            case 121 -> 187;
            case 122 -> 214;
            case 123 -> 162;
            case 124 -> 99;
            case 125 -> 10;
            case 126 -> 61;
            case 127 -> 131;
            case 128 -> 167;
            case 129 -> 230;
            case 130 -> 122;
            case 131 -> 253;
            case 132 -> 221;
            case 133 -> 38;
            case 134 -> 27;
            case 135 -> 76;
            case 136 -> 210;
            case 137 -> 108;
            case 138 -> 136;
            case 139 -> 146;
            case 140 -> 77;
            case 141 -> 44;
            case 142 -> 101;
            case 143 -> 64;
            case 144 -> 55;
            case 145 -> 40;
            case 146 -> 220;
            case 147 -> 141;
            case 148 -> 83;
            case 149 -> 31;
            case 150 -> 218;
            case 151 -> 53;
            case 152 -> 24;
            case 153 -> 242;
            case 154 -> 153;
            case 155 -> 14;
            case 156 -> 34;
            case 157 -> 97;
            case 158 -> 98;
            case 159 -> 51;
            case 160 -> 95;
            case 161 -> 211;
            case 162 -> 209;
            case 163 -> 251;
            case 164 -> 127;
            case 165 -> 12;
            case 166 -> 11;
            case 167 -> 71;
            case 168 -> 229;
            case 169 -> 160;
            case 170 -> 81;
            case 171 -> 60;
            case 172 -> 33;
            case 173 -> 70;
            case 174 -> 194;
            case 175 -> 15;
            case 176 -> 92;
            case 177 -> 19;
            case 178 -> 128;
            case 179 -> 243;
            case 180 -> 145;
            case 181 -> 68;
            case 182 -> 1;
            case 183 -> 183;
            case 184 -> 240;
            case 185 -> 181;
            case 186 -> 175;
            case 187 -> 166;
            case 188 -> 227;
            case 189 -> 144;
            case 190 -> 29;
            case 191 -> 254;
            case 192 -> 248;
            case 193 -> 121;
            case 194 -> 212;
            case 195 -> 90;
            case 196 -> 213;
            case 197 -> 224;
            case 198 -> 184;
            case 199 -> 86;
            case 200 -> 21;
            case 201 -> 189;
            case 202 -> 25;
            case 203 -> 151;
            case 204 -> 150;
            case 205 -> 94;
            case 206 -> 205;
            case 207 -> 159;
            case 208 -> 0;
            case 209 -> 52;
            case 210 -> 234;
            case 211 -> 168;
            case 212 -> 3;
            case 213 -> 120;
            case 214 -> 137;
            case 215 -> 100;
            case 216 -> 164;
            case 217 -> 129;
            case 218 -> 239;
            case 219 -> 63;
            case 220 -> 215;
            case 221 -> 226;
            case 222 -> 43;
            case 223 -> 87;
            case 224 -> 140;
            case 225 -> 58;
            case 226 -> 59;
            case 227 -> 236;
            case 228 -> 116;
            case 229 -> 80;
            case 230 -> 192;
            case 231 -> 126;
            case 232 -> 216;
            case 233 -> 203;
            case 234 -> 79;
            case 235 -> 238;
            case 236 -> 158;
            case 237 -> 179;
            case 238 -> 78;
            case 239 -> 143;
            case 240 -> 171;
            case 241 -> 73;
            case 242 -> 195;
            case 243 -> 109;
            case 244 -> 8;
            case 245 -> 255;
            case 246 -> 2;
            case 247 -> 106;
            case 248 -> 237;
            case 249 -> 96;
            case 250 -> 235;
            case 251 -> 170;
            case 252 -> 157;
            case 253 -> 5;
            case 254 -> 54;
            default -> 225;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
   // --- Phase A L3: descriptor-exact synthetics restored from .analysis/me-octo-only.jar bytecode (javap -c -s, agent W9-1) ---
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public void a(char var1, int var2) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
   }
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
   }
   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
}
