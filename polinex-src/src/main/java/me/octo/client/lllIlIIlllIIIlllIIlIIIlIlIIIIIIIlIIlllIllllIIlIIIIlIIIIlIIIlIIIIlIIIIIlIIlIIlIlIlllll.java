package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;

public final class lllIlIIlllIIIlllIIlIIIlIlIIIIIIIlIIlllIllllIIlIIIIlIIIIlIIIlIIIIlIIIIIlIIlIIlIlIlllll {
   private static String[] a;
   private static String[] b;

   @Export
   public final void a(double var1, double var3, double var5) {
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(new Vec3(var1, var3, var5));
   }

   @Export
   public final void a(int var1, int var2, int var3) {
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(new BlockPos(var1, var2, var3));
   }

   @Export
   public final void a(double var1, double var3) {
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a((float)var1, (float)var3);
   }

   @Export
   public final boolean a() {
      return me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
   }

   @Export
   public final void b() {
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
   }

   @Export
   public final void a(@NotNull Runnable var1) {
      short var10001 = 23045;
      short var10002 = 900;
      Intrinsics.checkNotNullParameter(var1, "callback");
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
   }

   @Export
   public final void b(double var1, double var3, double var5) {
      me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(new Vec3(var1, var3, var5));
   }

   @Export
   public final void b(int var1, int var2, int var3) {
      me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(
         new Vec3(var1 + 0.5, var2 + 0.5, var3 + 0.5)
      );
   }

   @Export
   public final boolean c() {
      return me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
   }

   @Export
   public final void d() {
      me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
   }

   @Export
   public final boolean e() {
      return me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
   }

   @Export
   public final void c(double var1, double var3, double var5) {
      me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.a(new Vec3(var1, var3, var5));
   }

   @Export
   public final void a(double var1, double var3, boolean var5) {
      me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.a((float)var1, (float)var3, var5);
   }

   @Export
   public final boolean f() {
      return me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
   }

   @Export
   public final void g() {
      me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
   }

   @Export
   public final boolean h() {
      return me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j();
   }

   @Export
   public final double d(double var1, double var3, double var5) {
      return me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(new Vec3(var1, var3, var5));
   }

   @Export
   public final void b(@NotNull Runnable var1) {
      short var10001 = 23044;
      short var10002 = -27761;
      Intrinsics.checkNotNullParameter(var1, "callback");
      me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
   }

   @Export
   public final void e(double var1, double var3, double var5) {
      me.octo.client.utils.player.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(new Vec3(var1, var3, var5));
   }

   @Export
   public final void b(double var1, double var3) {
      me.octo.client.utils.player.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(
         new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI((float)var1, (float)var3)
      );
   }

   @Export
   public final void i() {
      me.octo.client.utils.player.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
   }

   @Export
   public final boolean j() {
      return me.octo.client.utils.player.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u009fU\u0096Ï1bþ\u001a\bÔ\u0083ÿ\u0015\u001c9[q";
      int var4 = "\u009fU\u0096Ï1bþ\u001a\bÔ\u0083ÿ\u0015\u001c9[q".length();
      char var1 = '\b';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 8;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            } else {
               var13 = 8;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 51;
                  case 1 -> 122;
                  case 2 -> 105;
                  case 3 -> 2;
                  case 4 -> 68;
                  case 5 -> 82;
                  default -> 20;
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
            b = new String[2];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 23045) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 218;
            case 1 -> 140;
            case 2 -> 59;
            case 3 -> 244;
            case 4 -> 235;
            case 5 -> 220;
            case 6 -> 225;
            case 7 -> 11;
            case 8 -> 104;
            case 9 -> 92;
            case 10 -> 177;
            case 11 -> 9;
            case 12 -> 158;
            case 13 -> 231;
            case 14 -> 45;
            case 15 -> 191;
            case 16 -> 24;
            case 17 -> 103;
            case 18 -> 176;
            case 19 -> 51;
            case 20 -> 214;
            case 21 -> 35;
            case 22 -> 53;
            case 23 -> 147;
            case 24 -> 4;
            case 25 -> 137;
            case 26 -> 213;
            case 27 -> 203;
            case 28 -> 229;
            case 29 -> 88;
            case 30 -> 219;
            case 31 -> 75;
            case 32 -> 209;
            case 33 -> 15;
            case 34 -> 243;
            case 35 -> 121;
            case 36 -> 237;
            case 37 -> 91;
            case 38 -> 234;
            case 39 -> 42;
            case 40 -> 46;
            case 41 -> 251;
            case 42 -> 173;
            case 43 -> 110;
            case 44 -> 90;
            case 45 -> 70;
            case 46 -> 87;
            case 47 -> 139;
            case 48 -> 16;
            case 49 -> 183;
            case 50 -> 127;
            case 51 -> 153;
            case 52 -> 144;
            case 53 -> 217;
            case 54 -> 187;
            case 55 -> 85;
            case 56 -> 151;
            case 57 -> 248;
            case 58 -> 61;
            case 59 -> 95;
            case 60 -> 63;
            case 61 -> 164;
            case 62 -> 255;
            case 63 -> 76;
            case 64 -> 178;
            case 65 -> 134;
            case 66 -> 163;
            case 67 -> 108;
            case 68 -> 226;
            case 69 -> 114;
            case 70 -> 196;
            case 71 -> 184;
            case 72 -> 122;
            case 73 -> 167;
            case 74 -> 230;
            case 75 -> 111;
            case 76 -> 150;
            case 77 -> 8;
            case 78 -> 17;
            case 79 -> 249;
            case 80 -> 156;
            case 81 -> 84;
            case 82 -> 131;
            case 83 -> 31;
            case 84 -> 2;
            case 85 -> 224;
            case 86 -> 222;
            case 87 -> 29;
            case 88 -> 210;
            case 89 -> 98;
            case 90 -> 254;
            case 91 -> 188;
            case 92 -> 200;
            case 93 -> 43;
            case 94 -> 166;
            case 95 -> 72;
            case 96 -> 102;
            case 97 -> 168;
            case 98 -> 201;
            case 99 -> 165;
            case 100 -> 212;
            case 101 -> 130;
            case 102 -> 14;
            case 103 -> 79;
            case 104 -> 149;
            case 105 -> 0;
            case 106 -> 216;
            case 107 -> 223;
            case 108 -> 240;
            case 109 -> 118;
            case 110 -> 54;
            case 111 -> 195;
            case 112 -> 39;
            case 113 -> 71;
            case 114 -> 202;
            case 115 -> 175;
            case 116 -> 115;
            case 117 -> 186;
            case 118 -> 57;
            case 119 -> 242;
            case 120 -> 101;
            case 121 -> 64;
            case 122 -> 94;
            case 123 -> 65;
            case 124 -> 26;
            case 125 -> 236;
            case 126 -> 174;
            case 127 -> 232;
            case 128 -> 135;
            case 129 -> 86;
            case 130 -> 44;
            case 131 -> 155;
            case 132 -> 159;
            case 133 -> 80;
            case 134 -> 28;
            case 135 -> 208;
            case 136 -> 37;
            case 137 -> 193;
            case 138 -> 7;
            case 139 -> 27;
            case 140 -> 190;
            case 141 -> 5;
            case 142 -> 198;
            case 143 -> 239;
            case 144 -> 172;
            case 145 -> 120;
            case 146 -> 250;
            case 147 -> 199;
            case 148 -> 169;
            case 149 -> 116;
            case 150 -> 73;
            case 151 -> 171;
            case 152 -> 206;
            case 153 -> 215;
            case 154 -> 181;
            case 155 -> 69;
            case 156 -> 20;
            case 157 -> 33;
            case 158 -> 141;
            case 159 -> 227;
            case 160 -> 82;
            case 161 -> 22;
            case 162 -> 161;
            case 163 -> 1;
            case 164 -> 189;
            case 165 -> 112;
            case 166 -> 148;
            case 167 -> 160;
            case 168 -> 245;
            case 169 -> 25;
            case 170 -> 40;
            case 171 -> 99;
            case 172 -> 78;
            case 173 -> 83;
            case 174 -> 117;
            case 175 -> 124;
            case 176 -> 197;
            case 177 -> 81;
            case 178 -> 10;
            case 179 -> 60;
            case 180 -> 180;
            case 181 -> 154;
            case 182 -> 50;
            case 183 -> 194;
            case 184 -> 89;
            case 185 -> 143;
            case 186 -> 68;
            case 187 -> 128;
            case 188 -> 246;
            case 189 -> 74;
            case 190 -> 77;
            case 191 -> 221;
            case 192 -> 129;
            case 193 -> 233;
            case 194 -> 38;
            case 195 -> 119;
            case 196 -> 58;
            case 197 -> 211;
            case 198 -> 100;
            case 199 -> 56;
            case 200 -> 133;
            case 201 -> 228;
            case 202 -> 12;
            case 203 -> 47;
            case 204 -> 205;
            case 205 -> 13;
            case 206 -> 145;
            case 207 -> 125;
            case 208 -> 170;
            case 209 -> 136;
            case 210 -> 113;
            case 211 -> 146;
            case 212 -> 253;
            case 213 -> 62;
            case 214 -> 238;
            case 215 -> 106;
            case 216 -> 179;
            case 217 -> 182;
            case 218 -> 105;
            case 219 -> 19;
            case 220 -> 41;
            case 221 -> 185;
            case 222 -> 96;
            case 223 -> 123;
            case 224 -> 241;
            case 225 -> 66;
            case 226 -> 32;
            case 227 -> 97;
            case 228 -> 52;
            case 229 -> 49;
            case 230 -> 204;
            case 231 -> 21;
            case 232 -> 152;
            case 233 -> 132;
            case 234 -> 36;
            case 235 -> 157;
            case 236 -> 34;
            case 237 -> 252;
            case 238 -> 138;
            case 239 -> 3;
            case 240 -> 18;
            case 241 -> 192;
            case 242 -> 207;
            case 243 -> 247;
            case 244 -> 142;
            case 245 -> 48;
            case 246 -> 55;
            case 247 -> 126;
            case 248 -> 93;
            case 249 -> 162;
            case 250 -> 30;
            case 251 -> 109;
            case 252 -> 6;
            case 253 -> 67;
            case 254 -> 23;
            default -> 107;
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
