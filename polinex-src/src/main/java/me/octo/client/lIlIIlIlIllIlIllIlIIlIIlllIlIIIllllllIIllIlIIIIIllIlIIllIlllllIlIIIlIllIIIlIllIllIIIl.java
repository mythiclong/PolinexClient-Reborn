package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   private static String[] c;
   private static String[] d;

   public lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl() {
      List var10003 = CollectionsKt.listOf(new AABB(-36.0, 126.0, 129.0, 82.0, 152.0, 192.0));
      List var10004 = CollectionsKt.emptyList();
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var10005 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      List var10006 = CollectionsKt.listOf(RemotePlayer.class);
      String[] var1 = new String[2];
      short var10009 = 20744;
      short var10010 = 25732;
      var1[0] = "Glacite Walker";
      var10009 = 20745;
      var10010 = 1808;
      var1[1] = "Ice Walker";
      List var10007 = CollectionsKt.listOf(var1);
      List var10008 = CollectionsKt.emptyList();
      List var4 = CollectionsKt.emptyList();
      var1 = new String[2];
      short var10012 = 20749;
      short var10013 = -1122;
      var1[0] = "Drill";
      var10012 = 20750;
      var10013 = 24877;
      var1[1] = "Pickaxe";
      super(
         new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
            var10003, var10004, var10005, var10006, var10007, var10008, var4, CollectionsKt.listOf(var1), false, false, 768, null
         )
      );
   }

   @Override
   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      short var10001 = 20751;
      short var10002 = -3847;
      Intrinsics.checkNotNullParameter(var1, "mob");
      int[] var10000 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      var10002 = 20748;
      short var10003 = 30088;
      Intrinsics.checkNotNullParameter(var2, "player");
      LivingEntity var4 = var1.a();
      int[] var3 = var10000;
      double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4), false);
      double var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4))
         * 0.1;
      if (var3 != null) {
         var5 += var6;
         var6 = !var2.hasLineOfSight(var4) ? 10.0 : 0.0;
      }

      return var5 + var6 + Math.abs(var2.getY() - var4.getY());
   }

   @Override
   public int p() {
      int[] var1 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      if (var1 != null) {
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .b(
               me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .j()
            );
         if (var10000 != null) {
            return var10000.b();
         }
      }

      return 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "¦\u001fÈÆW\u0005\u0005OÒO·§\u0007¾\u008dí#µãÈ\u0003\u009eÁr";
      int var4 = "¦\u001fÈÆW\u0005\u0005OÒO·§\u0007¾\u008dí#µãÈ\u0003\u009eÁr".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 65;
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
                     case 0 -> 24;
                     case 1 -> 78;
                     case 2 -> 105;
                     case 3 -> 29;
                     case 4 -> 34;
                     case 5 -> 51;
                     default -> 123;
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

                  var2 = "Ö\u008b9`K 0÷þ\u0096\u009d¼à\u009b\nuð\u0086¢\u0006ÆiÇÏ¡";
                  var4 = "Ö\u008b9`K 0÷þ\u0096\u009d¼à\u009b\nuð\u0086¢\u0006ÆiÇÏ¡".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 35;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 20748) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 166;
            case 1 -> 22;
            case 2 -> 193;
            case 3 -> 40;
            case 4 -> 182;
            case 5 -> 60;
            case 6 -> 217;
            case 7 -> 24;
            case 8 -> 17;
            case 9 -> 232;
            case 10 -> 152;
            case 11 -> 148;
            case 12 -> 52;
            case 13 -> 37;
            case 14 -> 186;
            case 15 -> 91;
            case 16 -> 108;
            case 17 -> 171;
            case 18 -> 56;
            case 19 -> 54;
            case 20 -> 3;
            case 21 -> 36;
            case 22 -> 76;
            case 23 -> 93;
            case 24 -> 35;
            case 25 -> 238;
            case 26 -> 234;
            case 27 -> 216;
            case 28 -> 231;
            case 29 -> 199;
            case 30 -> 200;
            case 31 -> 175;
            case 32 -> 138;
            case 33 -> 208;
            case 34 -> 190;
            case 35 -> 104;
            case 36 -> 160;
            case 37 -> 101;
            case 38 -> 126;
            case 39 -> 103;
            case 40 -> 50;
            case 41 -> 205;
            case 42 -> 225;
            case 43 -> 67;
            case 44 -> 201;
            case 45 -> 84;
            case 46 -> 65;
            case 47 -> 41;
            case 48 -> 179;
            case 49 -> 233;
            case 50 -> 72;
            case 51 -> 157;
            case 52 -> 197;
            case 53 -> 121;
            case 54 -> 161;
            case 55 -> 141;
            case 56 -> 207;
            case 57 -> 248;
            case 58 -> 144;
            case 59 -> 16;
            case 60 -> 184;
            case 61 -> 113;
            case 62 -> 150;
            case 63 -> 203;
            case 64 -> 105;
            case 65 -> 155;
            case 66 -> 33;
            case 67 -> 164;
            case 68 -> 63;
            case 69 -> 75;
            case 70 -> 134;
            case 71 -> 18;
            case 72 -> 87;
            case 73 -> 80;
            case 74 -> 53;
            case 75 -> 245;
            case 76 -> 28;
            case 77 -> 165;
            case 78 -> 9;
            case 79 -> 221;
            case 80 -> 246;
            case 81 -> 73;
            case 82 -> 32;
            case 83 -> 154;
            case 84 -> 106;
            case 85 -> 183;
            case 86 -> 142;
            case 87 -> 58;
            case 88 -> 153;
            case 89 -> 137;
            case 90 -> 69;
            case 91 -> 132;
            case 92 -> 255;
            case 93 -> 99;
            case 94 -> 34;
            case 95 -> 213;
            case 96 -> 139;
            case 97 -> 119;
            case 98 -> 174;
            case 99 -> 49;
            case 100 -> 64;
            case 101 -> 212;
            case 102 -> 230;
            case 103 -> 51;
            case 104 -> 253;
            case 105 -> 158;
            case 106 -> 124;
            case 107 -> 131;
            case 108 -> 59;
            case 109 -> 61;
            case 110 -> 55;
            case 111 -> 176;
            case 112 -> 46;
            case 113 -> 116;
            case 114 -> 180;
            case 115 -> 215;
            case 116 -> 2;
            case 117 -> 128;
            case 118 -> 145;
            case 119 -> 117;
            case 120 -> 38;
            case 121 -> 45;
            case 122 -> 48;
            case 123 -> 167;
            case 124 -> 227;
            case 125 -> 85;
            case 126 -> 224;
            case 127 -> 188;
            case 128 -> 135;
            case 129 -> 162;
            case 130 -> 44;
            case 131 -> 178;
            case 132 -> 220;
            case 133 -> 92;
            case 134 -> 250;
            case 135 -> 202;
            case 136 -> 115;
            case 137 -> 29;
            case 138 -> 95;
            case 139 -> 6;
            case 140 -> 10;
            case 141 -> 123;
            case 142 -> 191;
            case 143 -> 100;
            case 144 -> 4;
            case 145 -> 211;
            case 146 -> 194;
            case 147 -> 189;
            case 148 -> 240;
            case 149 -> 181;
            case 150 -> 98;
            case 151 -> 172;
            case 152 -> 89;
            case 153 -> 235;
            case 154 -> 82;
            case 155 -> 114;
            case 156 -> 229;
            case 157 -> 219;
            case 158 -> 31;
            case 159 -> 77;
            case 160 -> 86;
            case 161 -> 74;
            case 162 -> 83;
            case 163 -> 177;
            case 164 -> 169;
            case 165 -> 112;
            case 166 -> 195;
            case 167 -> 1;
            case 168 -> 12;
            case 169 -> 209;
            case 170 -> 11;
            case 171 -> 0;
            case 172 -> 26;
            case 173 -> 254;
            case 174 -> 94;
            case 175 -> 125;
            case 176 -> 170;
            case 177 -> 159;
            case 178 -> 243;
            case 179 -> 206;
            case 180 -> 19;
            case 181 -> 239;
            case 182 -> 30;
            case 183 -> 146;
            case 184 -> 47;
            case 185 -> 147;
            case 186 -> 42;
            case 187 -> 27;
            case 188 -> 110;
            case 189 -> 247;
            case 190 -> 156;
            case 191 -> 90;
            case 192 -> 214;
            case 193 -> 97;
            case 194 -> 122;
            case 195 -> 168;
            case 196 -> 136;
            case 197 -> 149;
            case 198 -> 81;
            case 199 -> 79;
            case 200 -> 222;
            case 201 -> 88;
            case 202 -> 43;
            case 203 -> 251;
            case 204 -> 241;
            case 205 -> 204;
            case 206 -> 7;
            case 207 -> 163;
            case 208 -> 129;
            case 209 -> 133;
            case 210 -> 8;
            case 211 -> 23;
            case 212 -> 242;
            case 213 -> 198;
            case 214 -> 127;
            case 215 -> 223;
            case 216 -> 5;
            case 217 -> 111;
            case 218 -> 78;
            case 219 -> 192;
            case 220 -> 25;
            case 221 -> 173;
            case 222 -> 140;
            case 223 -> 120;
            case 224 -> 226;
            case 225 -> 109;
            case 226 -> 187;
            case 227 -> 96;
            case 228 -> 252;
            case 229 -> 196;
            case 230 -> 21;
            case 231 -> 118;
            case 232 -> 39;
            case 233 -> 62;
            case 234 -> 57;
            case 235 -> 244;
            case 236 -> 130;
            case 237 -> 218;
            case 238 -> 143;
            case 239 -> 210;
            case 240 -> 228;
            case 241 -> 102;
            case 242 -> 66;
            case 243 -> 68;
            case 244 -> 70;
            case 245 -> 237;
            case 246 -> 185;
            case 247 -> 14;
            case 248 -> 13;
            case 249 -> 236;
            case 250 -> 107;
            case 251 -> 151;
            case 252 -> 15;
            case 253 -> 71;
            case 254 -> 20;
            default -> 249;
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
