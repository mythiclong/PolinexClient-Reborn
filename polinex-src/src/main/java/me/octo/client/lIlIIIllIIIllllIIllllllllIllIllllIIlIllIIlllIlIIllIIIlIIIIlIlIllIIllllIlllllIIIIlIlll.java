package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIlIIIllIIIllllIIllllllllIllIllllIIlIllIIlllIlIIllIIIlIIIIlIlIllIIllllIlllllIIIIlIlll {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private Vec3 IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public lIlIIIllIIIllllIIllllllllIllIllllIIlIllIIlllIlIIllIIIlIIIIlIlIllIIllllIlllllIIIIlIlll() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = 28629;
      short var10004 = 10560;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Vec3(0.0, 0.0, 0.0);
   }

   public final boolean a(@NotNull Vec3 var1, boolean var2, double var3) {
      int[] var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      int var10002 = 28625;
      short var10003 = 4462;
      Intrinsics.checkNotNullParameter(var1, "to");
      int[] var5 = var10000;
      me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var9 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var5 != null) {
         if (((java.util.function.Supplier<Boolean>)(() -> { this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(100); return false; })).get()) {
            this.a();
         }

         var9 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      double var6;
      label53: {
         label57: {
            var9.f();
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.b(
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var1,
               true,
               0.0);
            short var10001 = 28630;
            short var15 = 3450;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sprint", true);
            me.octo.client.utils.player.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var10 = me.octo.client.utils.player.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            Vec3 var13 = var1.add(
               0.0, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.x(), 0.0
            );
            var10003 = 28628;
            short var10004 = -27699;
            Intrinsics.checkNotNullExpressionValue(var13, "add(...)");
            me.octo.client.utils.player.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(
               var10, var13, true, 0.0F);
            var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var1, false);
            var10001 = 28631;
            var15 = -13611;
            var10002 =(( var2) ? 1 : 0);
            if (var5 != null) {
               if (var2) {
                  break label57;
               }

               double var19;
               var10002 = (var19 = var6 - 4.0) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
            }

            if (var5 != null) {
               if (var10002 >= 0) {
                  break label57;
               }

               var10002 = ((me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .x()) ? 1 : 0);
            }

            if (var5 == null) {
               break label53;
            }

            if (var10002 == 0) {
               var10002 = 1;
               break label53;
            }
         }

         var10002 = 0;
      }

      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", (var10002 != 0));
      double var20;
      int var11 = (var20 = var6 - var3) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
      if (var5 != null) {
         var11 = var11 < 0 ? 1 : 0;
      }

      int var8 = var11;
      int var12 = var8;
      if (var5 != null) {
         if (var8 != 0) {
            this.a();
            return true;
         }

         var12 = 0;
      }

      return (var12 != 0);
   }

   private final void a() {
      LocalPlayer var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
      Intrinsics.checkNotNull(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
         var10001
      );
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "rk\u0094?\u0091s\u009däÿ\u0097ëB\u001d3\u0090|\bóÜr\u0089\u001fµ^\u0082\u0005/S¸z\"";
      int var4 = "rk\u0094?\u0091s\u009däÿ\u0097ëB\u001d3\u0090|\bóÜr\u0089\u001fµ^\u0082\u0005/S¸z\"".length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 58;
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
                     case 0 -> 104;
                     case 1 -> 4;
                     case 2 -> 85;
                     case 3 -> 47;
                     case 4 -> 64;
                     case 5 -> 31;
                     default -> 13;
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
                     b = new String[5];
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

                  var2 = "ÙE0,\u0082s\u0002ö\"";
                  var4 = "ÙE0,\u0082s\u0002ö\"".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 114;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28629) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 142;
            case 1 -> 186;
            case 2 -> 254;
            case 3 -> 71;
            case 4 -> 161;
            case 5 -> 244;
            case 6 -> 127;
            case 7 -> 184;
            case 8 -> 93;
            case 9 -> 171;
            case 10 -> 1;
            case 11 -> 55;
            case 12 -> 88;
            case 13 -> 45;
            case 14 -> 233;
            case 15 -> 50;
            case 16 -> 140;
            case 17 -> 194;
            case 18 -> 235;
            case 19 -> 114;
            case 20 -> 58;
            case 21 -> 30;
            case 22 -> 54;
            case 23 -> 159;
            case 24 -> 76;
            case 25 -> 111;
            case 26 -> 77;
            case 27 -> 180;
            case 28 -> 234;
            case 29 -> 166;
            case 30 -> 4;
            case 31 -> 48;
            case 32 -> 249;
            case 33 -> 78;
            case 34 -> 19;
            case 35 -> 168;
            case 36 -> 27;
            case 37 -> 128;
            case 38 -> 187;
            case 39 -> 64;
            case 40 -> 248;
            case 41 -> 175;
            case 42 -> 6;
            case 43 -> 37;
            case 44 -> 32;
            case 45 -> 147;
            case 46 -> 149;
            case 47 -> 241;
            case 48 -> 212;
            case 49 -> 26;
            case 50 -> 191;
            case 51 -> 120;
            case 52 -> 117;
            case 53 -> 11;
            case 54 -> 185;
            case 55 -> 116;
            case 56 -> 215;
            case 57 -> 12;
            case 58 -> 151;
            case 59 -> 132;
            case 60 -> 148;
            case 61 -> 82;
            case 62 -> 57;
            case 63 -> 51;
            case 64 -> 197;
            case 65 -> 245;
            case 66 -> 28;
            case 67 -> 3;
            case 68 -> 240;
            case 69 -> 104;
            case 70 -> 134;
            case 71 -> 107;
            case 72 -> 100;
            case 73 -> 72;
            case 74 -> 230;
            case 75 -> 42;
            case 76 -> 218;
            case 77 -> 14;
            case 78 -> 110;
            case 79 -> 81;
            case 80 -> 216;
            case 81 -> 79;
            case 82 -> 115;
            case 83 -> 83;
            case 84 -> 61;
            case 85 -> 141;
            case 86 -> 65;
            case 87 -> 174;
            case 88 -> 209;
            case 89 -> 97;
            case 90 -> 86;
            case 91 -> 41;
            case 92 -> 217;
            case 93 -> 251;
            case 94 -> 123;
            case 95 -> 122;
            case 96 -> 85;
            case 97 -> 16;
            case 98 -> 178;
            case 99 -> 23;
            case 100 -> 7;
            case 101 -> 172;
            case 102 -> 90;
            case 103 -> 18;
            case 104 -> 208;
            case 105 -> 91;
            case 106 -> 84;
            case 107 -> 96;
            case 108 -> 17;
            case 109 -> 99;
            case 110 -> 177;
            case 111 -> 213;
            case 112 -> 75;
            case 113 -> 170;
            case 114 -> 8;
            case 115 -> 169;
            case 116 -> 5;
            case 117 -> 154;
            case 118 -> 67;
            case 119 -> 153;
            case 120 -> 125;
            case 121 -> 56;
            case 122 -> 44;
            case 123 -> 24;
            case 124 -> 25;
            case 125 -> 199;
            case 126 -> 146;
            case 127 -> 73;
            case 128 -> 43;
            case 129 -> 253;
            case 130 -> 207;
            case 131 -> 203;
            case 132 -> 109;
            case 133 -> 176;
            case 134 -> 219;
            case 135 -> 33;
            case 136 -> 189;
            case 137 -> 188;
            case 138 -> 193;
            case 139 -> 200;
            case 140 -> 160;
            case 141 -> 94;
            case 142 -> 255;
            case 143 -> 46;
            case 144 -> 252;
            case 145 -> 59;
            case 146 -> 195;
            case 147 -> 173;
            case 148 -> 155;
            case 149 -> 112;
            case 150 -> 95;
            case 151 -> 38;
            case 152 -> 247;
            case 153 -> 181;
            case 154 -> 36;
            case 155 -> 69;
            case 156 -> 31;
            case 157 -> 182;
            case 158 -> 226;
            case 159 -> 105;
            case 160 -> 157;
            case 161 -> 13;
            case 162 -> 60;
            case 163 -> 47;
            case 164 -> 139;
            case 165 -> 35;
            case 166 -> 10;
            case 167 -> 133;
            case 168 -> 183;
            case 169 -> 87;
            case 170 -> 9;
            case 171 -> 52;
            case 172 -> 239;
            case 173 -> 232;
            case 174 -> 138;
            case 175 -> 40;
            case 176 -> 150;
            case 177 -> 20;
            case 178 -> 243;
            case 179 -> 238;
            case 180 -> 74;
            case 181 -> 221;
            case 182 -> 70;
            case 183 -> 39;
            case 184 -> 190;
            case 185 -> 98;
            case 186 -> 102;
            case 187 -> 164;
            case 188 -> 101;
            case 189 -> 152;
            case 190 -> 106;
            case 191 -> 196;
            case 192 -> 121;
            case 193 -> 237;
            case 194 -> 143;
            case 195 -> 202;
            case 196 -> 131;
            case 197 -> 144;
            case 198 -> 242;
            case 199 -> 21;
            case 200 -> 206;
            case 201 -> 220;
            case 202 -> 228;
            case 203 -> 53;
            case 204 -> 135;
            case 205 -> 129;
            case 206 -> 250;
            case 207 -> 246;
            case 208 -> 136;
            case 209 -> 145;
            case 210 -> 113;
            case 211 -> 167;
            case 212 -> 205;
            case 213 -> 162;
            case 214 -> 63;
            case 215 -> 15;
            case 216 -> 211;
            case 217 -> 124;
            case 218 -> 29;
            case 219 -> 62;
            case 220 -> 49;
            case 221 -> 34;
            case 222 -> 68;
            case 223 -> 222;
            case 224 -> 231;
            case 225 -> 210;
            case 226 -> 80;
            case 227 -> 192;
            case 228 -> 198;
            case 229 -> 163;
            case 230 -> 229;
            case 231 -> 204;
            case 232 -> 66;
            case 233 -> 223;
            case 234 -> 165;
            case 235 -> 22;
            case 236 -> 214;
            case 237 -> 126;
            case 238 -> 224;
            case 239 -> 158;
            case 240 -> 0;
            case 241 -> 225;
            case 242 -> 108;
            case 243 -> 179;
            case 244 -> 92;
            case 245 -> 89;
            case 246 -> 236;
            case 247 -> 137;
            case 248 -> 2;
            case 249 -> 119;
            case 250 -> 130;
            case 251 -> 156;
            case 252 -> 103;
            case 253 -> 118;
            case 254 -> 201;
            default -> 227;
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

  // PX-FIX synth restored from jar bytecode
  public static boolean a(me.octo.client.lIlIIIllIIIllllIIllllllllIllIllllIIlIllIIlllIlIIllIIIlIIIIlIlIllIIllllIlllllIIIIlIlll p0, net.minecraft.world.phys.Vec3 p1, boolean p2, double p3, int p4, java.lang.Object p5) {
    if ((p4 & 2) != 0) { p2 = false; }
    if ((p4 & 4) != 0) { p3 = 2.0; }
    return p0.a(p1, p2, p3);
  }
}
