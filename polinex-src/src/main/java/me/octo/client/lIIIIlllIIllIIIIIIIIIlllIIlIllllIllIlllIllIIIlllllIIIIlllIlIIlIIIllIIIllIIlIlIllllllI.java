package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class lIIIIlllIIllIIIIIIIIIlllIIlIllllIllIlllIllIIIlllllIIIIlllIlIIlIIIllIIIllIIlIlIllllllI
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] d;
   private static String[] e;

   public lIIIIlllIIllIIIIIIIIIlllIIlIllllIllIlllIllIIIlllllIIIIlllIlIIlIIIllIIIllIIlIlIllllllI(
      @NotNull lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl var1
   ) {
      short var10001 = 26944;
      short var10002 = -7590;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
      );
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
      short var10001 = 26946;
      short var10002 = -6088;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 26945;
      var10002 = -5529;
      Intrinsics.checkNotNullParameter(var2, "resolution");
      String[] var10000 = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
      float var7 = 100.0F;
      float var8 = 28.0F;
      float var9 = var2.e() - 16.0F;
      float var10 = var9 - var7;
      String[] var6 = var10000;
      int var11 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)(var10 - 6.0F));
      float var12 = var3 + (var11 - var3) / 2.0F;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(var1, var4, var5, var10, var12 - var8 / 2.0F, var7, var8, 6);
      int var13 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a()) ? 1 : 0);
      if (var6 != null) {
         if (var13 == 0) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
               var11, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() ? this : null
            );
         }

         float var16;
         var13 = (var16 = var5 - (var2.d() + 5)) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      }

      if (var13 > 0) {
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
      }

      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var11, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() ? this : null
      );
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   public void e() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¾4æµ¬1ì\n\u009a\u001eDë\u001a\u0099\u008c\u008c4ã\u000bZ\b\u009aÄ¾}ÈTïPÎ";
      int var4 = "¾4æµ¬1ì\n\u009a\u001eDë\u001a\u0099\u008c\u008c4ã\u000bZ\b\u009aÄ¾}ÈTïPÎ".length();
      char var1 = 7;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 43;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 43;
               var10006 = var6;
            } else {
               var13 = 43;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 43;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 65;
                  case 1 -> 85;
                  case 2 -> 62;
                  case 3 -> 106;
                  case 4 -> 106;
                  case 5 -> 16;
                  default -> 89;
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
      int var2 = (var0 ^ 26944) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 199;
            case 1 -> 65;
            case 2 -> 161;
            case 3 -> 106;
            case 4 -> 85;
            case 5 -> 162;
            case 6 -> 39;
            case 7 -> 201;
            case 8 -> 246;
            case 9 -> 24;
            case 10 -> 60;
            case 11 -> 49;
            case 12 -> 182;
            case 13 -> 171;
            case 14 -> 241;
            case 15 -> 29;
            case 16 -> 200;
            case 17 -> 239;
            case 18 -> 84;
            case 19 -> 218;
            case 20 -> 196;
            case 21 -> 72;
            case 22 -> 203;
            case 23 -> 193;
            case 24 -> 202;
            case 25 -> 52;
            case 26 -> 149;
            case 27 -> 188;
            case 28 -> 66;
            case 29 -> 17;
            case 30 -> 98;
            case 31 -> 117;
            case 32 -> 20;
            case 33 -> 50;
            case 34 -> 175;
            case 35 -> 181;
            case 36 -> 232;
            case 37 -> 180;
            case 38 -> 137;
            case 39 -> 178;
            case 40 -> 96;
            case 41 -> 12;
            case 42 -> 231;
            case 43 -> 189;
            case 44 -> 58;
            case 45 -> 54;
            case 46 -> 129;
            case 47 -> 252;
            case 48 -> 228;
            case 49 -> 156;
            case 50 -> 22;
            case 51 -> 23;
            case 52 -> 217;
            case 53 -> 138;
            case 54 -> 77;
            case 55 -> 212;
            case 56 -> 128;
            case 57 -> 81;
            case 58 -> 75;
            case 59 -> 47;
            case 60 -> 153;
            case 61 -> 177;
            case 62 -> 27;
            case 63 -> 235;
            case 64 -> 216;
            case 65 -> 155;
            case 66 -> 195;
            case 67 -> 100;
            case 68 -> 150;
            case 69 -> 151;
            case 70 -> 2;
            case 71 -> 57;
            case 72 -> 160;
            case 73 -> 222;
            case 74 -> 69;
            case 75 -> 7;
            case 76 -> 170;
            case 77 -> 114;
            case 78 -> 142;
            case 79 -> 121;
            case 80 -> 4;
            case 81 -> 30;
            case 82 -> 113;
            case 83 -> 94;
            case 84 -> 56;
            case 85 -> 206;
            case 86 -> 115;
            case 87 -> 90;
            case 88 -> 123;
            case 89 -> 93;
            case 90 -> 146;
            case 91 -> 227;
            case 92 -> 1;
            case 93 -> 168;
            case 94 -> 172;
            case 95 -> 223;
            case 96 -> 25;
            case 97 -> 174;
            case 98 -> 64;
            case 99 -> 59;
            case 100 -> 111;
            case 101 -> 26;
            case 102 -> 76;
            case 103 -> 92;
            case 104 -> 13;
            case 105 -> 109;
            case 106 -> 204;
            case 107 -> 224;
            case 108 -> 166;
            case 109 -> 221;
            case 110 -> 53;
            case 111 -> 213;
            case 112 -> 126;
            case 113 -> 118;
            case 114 -> 143;
            case 115 -> 185;
            case 116 -> 140;
            case 117 -> 169;
            case 118 -> 164;
            case 119 -> 133;
            case 120 -> 154;
            case 121 -> 14;
            case 122 -> 80;
            case 123 -> 63;
            case 124 -> 48;
            case 125 -> 186;
            case 126 -> 122;
            case 127 -> 46;
            case 128 -> 38;
            case 129 -> 240;
            case 130 -> 112;
            case 131 -> 116;
            case 132 -> 233;
            case 133 -> 11;
            case 134 -> 159;
            case 135 -> 35;
            case 136 -> 250;
            case 137 -> 37;
            case 138 -> 255;
            case 139 -> 18;
            case 140 -> 68;
            case 141 -> 205;
            case 142 -> 15;
            case 143 -> 36;
            case 144 -> 148;
            case 145 -> 99;
            case 146 -> 219;
            case 147 -> 184;
            case 148 -> 225;
            case 149 -> 70;
            case 150 -> 82;
            case 151 -> 242;
            case 152 -> 97;
            case 153 -> 254;
            case 154 -> 248;
            case 155 -> 0;
            case 156 -> 8;
            case 157 -> 120;
            case 158 -> 136;
            case 159 -> 105;
            case 160 -> 108;
            case 161 -> 134;
            case 162 -> 34;
            case 163 -> 31;
            case 164 -> 89;
            case 165 -> 74;
            case 166 -> 167;
            case 167 -> 194;
            case 168 -> 104;
            case 169 -> 125;
            case 170 -> 21;
            case 171 -> 152;
            case 172 -> 208;
            case 173 -> 110;
            case 174 -> 28;
            case 175 -> 211;
            case 176 -> 5;
            case 177 -> 253;
            case 178 -> 9;
            case 179 -> 131;
            case 180 -> 163;
            case 181 -> 165;
            case 182 -> 243;
            case 183 -> 87;
            case 184 -> 226;
            case 185 -> 236;
            case 186 -> 32;
            case 187 -> 127;
            case 188 -> 249;
            case 189 -> 251;
            case 190 -> 79;
            case 191 -> 145;
            case 192 -> 91;
            case 193 -> 215;
            case 194 -> 78;
            case 195 -> 103;
            case 196 -> 207;
            case 197 -> 61;
            case 198 -> 187;
            case 199 -> 16;
            case 200 -> 141;
            case 201 -> 44;
            case 202 -> 88;
            case 203 -> 62;
            case 204 -> 139;
            case 205 -> 83;
            case 206 -> 107;
            case 207 -> 237;
            case 208 -> 51;
            case 209 -> 183;
            case 210 -> 130;
            case 211 -> 214;
            case 212 -> 179;
            case 213 -> 73;
            case 214 -> 19;
            case 215 -> 119;
            case 216 -> 43;
            case 217 -> 176;
            case 218 -> 41;
            case 219 -> 42;
            case 220 -> 132;
            case 221 -> 71;
            case 222 -> 157;
            case 223 -> 67;
            case 224 -> 33;
            case 225 -> 230;
            case 226 -> 95;
            case 227 -> 234;
            case 228 -> 238;
            case 229 -> 101;
            case 230 -> 209;
            case 231 -> 3;
            case 232 -> 124;
            case 233 -> 6;
            case 234 -> 55;
            case 235 -> 10;
            case 236 -> 210;
            case 237 -> 144;
            case 238 -> 245;
            case 239 -> 45;
            case 240 -> 229;
            case 241 -> 173;
            case 242 -> 192;
            case 243 -> 247;
            case 244 -> 191;
            case 245 -> 40;
            case 246 -> 220;
            case 247 -> 198;
            case 248 -> 102;
            case 249 -> 135;
            case 250 -> 190;
            case 251 -> 197;
            case 252 -> 158;
            case 253 -> 244;
            case 254 -> 147;
            default -> 86;
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
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public void a(char var1, int var2) {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
   }
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public int b() {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
   }
   public void d() {
      IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
}
