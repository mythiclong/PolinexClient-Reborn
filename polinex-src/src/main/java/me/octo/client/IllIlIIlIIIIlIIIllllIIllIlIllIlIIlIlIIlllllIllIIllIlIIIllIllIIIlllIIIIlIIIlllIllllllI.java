package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class IllIlIIlIIIIlIIIllllIIllIlIllIlIIlIlIIlllllIllIIllIlIIIllIllIIIlllIIIIlIIIlllIllllllI
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   private static String[] c;
   private static String[] d;

   public IllIlIIlIIIIlIIIllllIIllIlIllIlIIlIlIIlllllIllIIllIlIIIllIllIIIlllIIIIlIIIlllIllllllI() {
      List var10003 = CollectionsKt.listOf(new AABB(-283.0, 79.0, 38.0, -198.0, 120.0, 129.0));
      AABB[] var1 = new AABB[]{
         new AABB(-237.0, 93.0, 116.0, -263.0, 87.0, 130.0),
         new AABB(-237.0, 120.0, 108.0, -202.0, 75.0, 128.0),
         new AABB(-224.0, 114.0, 116.0, -188.0, 85.0, 104.0)
      };
      List var10004 = CollectionsKt.listOf(var1);
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var10005 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      List var10006 = CollectionsKt.listOf(Wolf.class);
      short var10007 = 30619;
      short var10008 = -18090;
      super(
         new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
            var10003,
            var10004,
            var10005,
            var10006,
            CollectionsKt.listOf("Wolf"),
            CollectionsKt.emptyList(),
            CollectionsKt.emptyList(),
            CollectionsKt.emptyList(),
            false,
            false,
            768,
            null
         )
      );
   }

   @Override
   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      int[] var10000 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      short var10002 = 30617;
      short var10003 = 6742;
      Intrinsics.checkNotNullParameter(var1, "mob");
      int[] var3 = var10000;
      short var10001 = 30618;
      var10002 = -704;
      Intrinsics.checkNotNullParameter(var2, "player");
      LivingEntity var4 = var1.a();
      double var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4));
      double var6 = 0.4;
      if (var3 != null) {
         var5 *= 0.4;
         var6 = !var2.hasLineOfSight(var4) ? 10.0 : 0.0;
      }

      return var5
         + var6
         + me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4),
               me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2)
            )
         + Math.abs(var2.getY() - var4.getY()) * 0.3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "F\u008aõn\u0006\u001f\u0019\u0010`\tò\u0003\u0083\u009c>";
      int var4 = "F\u008aõn\u0006\u001f\u0019\u0010`\tò\u0003\u0083\u009c>".length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 44;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 44;
               var10006 = var6;
            } else {
               var13 = 44;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 44;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 8;
                  case 1 -> 81;
                  case 2 -> 68;
                  case 3 -> 88;
                  case 4 -> 2;
                  case 5 -> 120;
                  default -> 100;
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
            c = var5;
            d = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 30619) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 212;
            case 1 -> 70;
            case 2 -> 211;
            case 3 -> 141;
            case 4 -> 103;
            case 5 -> 207;
            case 6 -> 27;
            case 7 -> 226;
            case 8 -> 67;
            case 9 -> 210;
            case 10 -> 28;
            case 11 -> 110;
            case 12 -> 138;
            case 13 -> 121;
            case 14 -> 99;
            case 15 -> 213;
            case 16 -> 233;
            case 17 -> 152;
            case 18 -> 85;
            case 19 -> 37;
            case 20 -> 118;
            case 21 -> 113;
            case 22 -> 149;
            case 23 -> 60;
            case 24 -> 208;
            case 25 -> 187;
            case 26 -> 179;
            case 27 -> 159;
            case 28 -> 190;
            case 29 -> 164;
            case 30 -> 53;
            case 31 -> 48;
            case 32 -> 40;
            case 33 -> 225;
            case 34 -> 170;
            case 35 -> 112;
            case 36 -> 240;
            case 37 -> 1;
            case 38 -> 4;
            case 39 -> 169;
            case 40 -> 73;
            case 41 -> 239;
            case 42 -> 115;
            case 43 -> 237;
            case 44 -> 182;
            case 45 -> 16;
            case 46 -> 109;
            case 47 -> 195;
            case 48 -> 188;
            case 49 -> 84;
            case 50 -> 92;
            case 51 -> 178;
            case 52 -> 135;
            case 53 -> 44;
            case 54 -> 111;
            case 55 -> 94;
            case 56 -> 167;
            case 57 -> 51;
            case 58 -> 194;
            case 59 -> 245;
            case 60 -> 153;
            case 61 -> 243;
            case 62 -> 76;
            case 63 -> 17;
            case 64 -> 199;
            case 65 -> 171;
            case 66 -> 157;
            case 67 -> 189;
            case 68 -> 148;
            case 69 -> 68;
            case 70 -> 228;
            case 71 -> 39;
            case 72 -> 5;
            case 73 -> 62;
            case 74 -> 58;
            case 75 -> 88;
            case 76 -> 161;
            case 77 -> 129;
            case 78 -> 36;
            case 79 -> 218;
            case 80 -> 253;
            case 81 -> 200;
            case 82 -> 25;
            case 83 -> 246;
            case 84 -> 55;
            case 85 -> 215;
            case 86 -> 192;
            case 87 -> 7;
            case 88 -> 3;
            case 89 -> 93;
            case 90 -> 250;
            case 91 -> 35;
            case 92 -> 242;
            case 93 -> 0;
            case 94 -> 18;
            case 95 -> 47;
            case 96 -> 147;
            case 97 -> 20;
            case 98 -> 33;
            case 99 -> 2;
            case 100 -> 165;
            case 101 -> 12;
            case 102 -> 125;
            case 103 -> 202;
            case 104 -> 193;
            case 105 -> 175;
            case 106 -> 87;
            case 107 -> 156;
            case 108 -> 166;
            case 109 -> 180;
            case 110 -> 241;
            case 111 -> 176;
            case 112 -> 29;
            case 113 -> 145;
            case 114 -> 198;
            case 115 -> 158;
            case 116 -> 227;
            case 117 -> 124;
            case 118 -> 247;
            case 119 -> 57;
            case 120 -> 139;
            case 121 -> 9;
            case 122 -> 89;
            case 123 -> 8;
            case 124 -> 97;
            case 125 -> 197;
            case 126 -> 86;
            case 127 -> 203;
            case 128 -> 59;
            case 129 -> 98;
            case 130 -> 209;
            case 131 -> 119;
            case 132 -> 155;
            case 133 -> 154;
            case 134 -> 81;
            case 135 -> 30;
            case 136 -> 41;
            case 137 -> 137;
            case 138 -> 114;
            case 139 -> 238;
            case 140 -> 101;
            case 141 -> 79;
            case 142 -> 24;
            case 143 -> 95;
            case 144 -> 83;
            case 145 -> 21;
            case 146 -> 206;
            case 147 -> 14;
            case 148 -> 66;
            case 149 -> 220;
            case 150 -> 252;
            case 151 -> 191;
            case 152 -> 71;
            case 153 -> 219;
            case 154 -> 6;
            case 155 -> 130;
            case 156 -> 196;
            case 157 -> 22;
            case 158 -> 162;
            case 159 -> 23;
            case 160 -> 128;
            case 161 -> 185;
            case 162 -> 184;
            case 163 -> 80;
            case 164 -> 251;
            case 165 -> 223;
            case 166 -> 19;
            case 167 -> 140;
            case 168 -> 232;
            case 169 -> 82;
            case 170 -> 229;
            case 171 -> 96;
            case 172 -> 231;
            case 173 -> 15;
            case 174 -> 230;
            case 175 -> 254;
            case 176 -> 235;
            case 177 -> 127;
            case 178 -> 201;
            case 179 -> 102;
            case 180 -> 61;
            case 181 -> 117;
            case 182 -> 133;
            case 183 -> 31;
            case 184 -> 43;
            case 185 -> 150;
            case 186 -> 234;
            case 187 -> 107;
            case 188 -> 72;
            case 189 -> 183;
            case 190 -> 52;
            case 191 -> 32;
            case 192 -> 204;
            case 193 -> 120;
            case 194 -> 249;
            case 195 -> 46;
            case 196 -> 244;
            case 197 -> 38;
            case 198 -> 122;
            case 199 -> 181;
            case 200 -> 131;
            case 201 -> 172;
            case 202 -> 222;
            case 203 -> 54;
            case 204 -> 75;
            case 205 -> 143;
            case 206 -> 106;
            case 207 -> 214;
            case 208 -> 144;
            case 209 -> 146;
            case 210 -> 49;
            case 211 -> 64;
            case 212 -> 174;
            case 213 -> 77;
            case 214 -> 221;
            case 215 -> 173;
            case 216 -> 136;
            case 217 -> 100;
            case 218 -> 142;
            case 219 -> 160;
            case 220 -> 42;
            case 221 -> 255;
            case 222 -> 11;
            case 223 -> 132;
            case 224 -> 13;
            case 225 -> 65;
            case 226 -> 10;
            case 227 -> 123;
            case 228 -> 126;
            case 229 -> 168;
            case 230 -> 216;
            case 231 -> 177;
            case 232 -> 248;
            case 233 -> 108;
            case 234 -> 63;
            case 235 -> 74;
            case 236 -> 104;
            case 237 -> 34;
            case 238 -> 186;
            case 239 -> 78;
            case 240 -> 236;
            case 241 -> 163;
            case 242 -> 105;
            case 243 -> 69;
            case 244 -> 134;
            case 245 -> 90;
            case 246 -> 56;
            case 247 -> 151;
            case 248 -> 217;
            case 249 -> 91;
            case 250 -> 224;
            case 251 -> 45;
            case 252 -> 116;
            case 253 -> 50;
            case 254 -> 26;
            default -> 205;
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
