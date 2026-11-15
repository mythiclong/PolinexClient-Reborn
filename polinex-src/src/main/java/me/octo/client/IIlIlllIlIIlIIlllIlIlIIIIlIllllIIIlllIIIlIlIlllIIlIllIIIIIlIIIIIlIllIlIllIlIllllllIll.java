package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class IIlIlllIlIIlIIlllIlIlIIIIlIllllIIIlllIIIlIlIlllIIlIllIIIIIlIIIIIlIllIlIllIlIllllllIll
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   private static String[] c;
   private static String[] d;

   public IIlIlllIlIIlIIlllIlIlIIIIlIllllIIIlllIIIlIlIlllIIlIllIIIIIlIIIIIlIllIlIllIlIllllllIll() {
      int[] var1 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      List var10003 = CollectionsKt.listOf(new AABB(-190.0, 38.0, -149.0, -42.0, 64.0, -72.0));
      List var10004 = CollectionsKt.emptyList();
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var10005 = new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid(
         -42, -190, -72, -149
      );
      List var10006 = CollectionsKt.listOf(Zombie.class);
      short var10007 = -19668;
      short var10008 = -9524;
      List var4 = CollectionsKt.listOf("Zombie");
      String[] var2 = new String[5];
      short var10010 = -19677;
      short var10011 = 22920;
      var2[0] = "Revenant Sycophant";
      var10010 = -19676;
      var10011 = -22668;
      var2[1] = "Revenant Champion";
      var10010 = -19680;
      var10011 = -10625;
      var2[2] = "Deformed Revenant";
      var10010 = -19667;
      var10011 = 28015;
      var2[3] = "Atoned Champion";
      var10010 = -19673;
      var10011 = -6523;
      var2[4] = "Atoned Revenant";
      List var5 = CollectionsKt.listOf(var2);
      List var10009 = CollectionsKt.emptyList();
      var2 = new String[3];
      short var10012 = -19675;
      short var10013 = 15015;
      var2[0] = "Reaper Scythe";
      var10012 = -19679;
      var10013 = 32744;
      var2[1] = "Halberd of";
      var10012 = -19674;
      var10013 = 14810;
      var2[2] = "Falchion";
      super(
         new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
            var10003, var10004, var10005, var10006, var4, var5, var10009, CollectionsKt.listOf(var2), false, false, 768, null
         )
      );
      if (var1 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }
   }

   @Override
   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      int[] var10000 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      short var10002 = -19678;
      short var10003 = -6427;
      Intrinsics.checkNotNullParameter(var1, "mob");
      var10002 = -19666;
      var10003 = -24385;
      Intrinsics.checkNotNullParameter(var2, "player");
      int[] var3 = var10000;
      LivingEntity var4 = var1.a();
      double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4), false);
      double var10001 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4))
         * 0.1;
      if (var3 != null) {
         var5 += var10001;
         var10001 = !var2.hasLineOfSight(var4) ? 10.0 : 0.0;
      }

      return var5 + var10001 + Math.abs(var2.getY() - var4.getY());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\u0081¦\u0007>Vï\u008f\u0082ò°T<\u00022¯×\u0086\r\u0004Ý D\\\u0004ê©\u009a,nÛÒ\bs´ÕþS9èK\u000f»n(\u001f\u0082¤1hç:\u0016ñê{\"\u0011³~\u0085/\b\u008aÐ³s\u0095i¼\u0001ÉÎt¹\n;¦\u0013½\u0086kõ7¹ý\u0003\u0086Æ+\u0012\r\u0088\u0096ûdWÉ\u0095:B\\r2¹ê¨\u000fj\u0006ênxkÆ¦";
      int var4 = "\u0081¦\u0007>Vï\u008f\u0082ò°T<\u00022¯×\u0086\r\u0004Ý D\\\u0004ê©\u009a,nÛÒ\bs´ÕþS9èK\u000f»n(\u001f\u0082¤1hç:\u0016ñê{\"\u0011³~\u0085/\b\u008aÐ³s\u0095i¼\u0001ÉÎt¹\n;¦\u0013½\u0086kõ7¹ý\u0003\u0086Æ+\u0012\r\u0088\u0096ûdWÉ\u0095:B\\r2¹ê¨\u000fj\u0006ênxkÆ¦"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 118;
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
                     case 0 -> 61;
                     case 1 -> 126;
                     case 2 -> 70;
                     case 3 -> 49;
                     case 4 -> 16;
                     case 5 -> 30;
                     default -> 50;
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
                     d = new String[11];
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

                  var2 = "ô\u0084µ6Eõ½'\u000f\u0083ÛY&ÆÜ\u0006û\u0085M\u001a\u0095\u0093";
                  var4 = "ô\u0084µ6Eõ½'\u000f\u0083ÛY&ÆÜ\u0006û\u0085M\u001a\u0095\u0093".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 68;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -19676) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 91;
            case 1 -> 44;
            case 2 -> 94;
            case 3 -> 169;
            case 4 -> 170;
            case 5 -> 76;
            case 6 -> 159;
            case 7 -> 132;
            case 8 -> 192;
            case 9 -> 241;
            case 10 -> 80;
            case 11 -> 171;
            case 12 -> 213;
            case 13 -> 182;
            case 14 -> 72;
            case 15 -> 8;
            case 16 -> 111;
            case 17 -> 254;
            case 18 -> 131;
            case 19 -> 148;
            case 20 -> 158;
            case 21 -> 136;
            case 22 -> 23;
            case 23 -> 0;
            case 24 -> 191;
            case 25 -> 249;
            case 26 -> 188;
            case 27 -> 1;
            case 28 -> 7;
            case 29 -> 22;
            case 30 -> 222;
            case 31 -> 240;
            case 32 -> 150;
            case 33 -> 124;
            case 34 -> 27;
            case 35 -> 233;
            case 36 -> 64;
            case 37 -> 162;
            case 38 -> 83;
            case 39 -> 221;
            case 40 -> 234;
            case 41 -> 114;
            case 42 -> 215;
            case 43 -> 226;
            case 44 -> 253;
            case 45 -> 245;
            case 46 -> 151;
            case 47 -> 73;
            case 48 -> 197;
            case 49 -> 55;
            case 50 -> 142;
            case 51 -> 48;
            case 52 -> 201;
            case 53 -> 36;
            case 54 -> 129;
            case 55 -> 155;
            case 56 -> 92;
            case 57 -> 174;
            case 58 -> 147;
            case 59 -> 243;
            case 60 -> 161;
            case 61 -> 140;
            case 62 -> 193;
            case 63 -> 93;
            case 64 -> 216;
            case 65 -> 125;
            case 66 -> 10;
            case 67 -> 236;
            case 68 -> 255;
            case 69 -> 29;
            case 70 -> 116;
            case 71 -> 244;
            case 72 -> 121;
            case 73 -> 200;
            case 74 -> 18;
            case 75 -> 128;
            case 76 -> 228;
            case 77 -> 37;
            case 78 -> 4;
            case 79 -> 138;
            case 80 -> 248;
            case 81 -> 90;
            case 82 -> 46;
            case 83 -> 99;
            case 84 -> 225;
            case 85 -> 108;
            case 86 -> 86;
            case 87 -> 217;
            case 88 -> 218;
            case 89 -> 120;
            case 90 -> 137;
            case 91 -> 152;
            case 92 -> 60;
            case 93 -> 246;
            case 94 -> 82;
            case 95 -> 154;
            case 96 -> 54;
            case 97 -> 100;
            case 98 -> 134;
            case 99 -> 117;
            case 100 -> 84;
            case 101 -> 33;
            case 102 -> 13;
            case 103 -> 186;
            case 104 -> 65;
            case 105 -> 179;
            case 106 -> 126;
            case 107 -> 164;
            case 108 -> 5;
            case 109 -> 130;
            case 110 -> 252;
            case 111 -> 203;
            case 112 -> 176;
            case 113 -> 79;
            case 114 -> 198;
            case 115 -> 184;
            case 116 -> 15;
            case 117 -> 139;
            case 118 -> 50;
            case 119 -> 172;
            case 120 -> 211;
            case 121 -> 40;
            case 122 -> 104;
            case 123 -> 208;
            case 124 -> 166;
            case 125 -> 63;
            case 126 -> 141;
            case 127 -> 45;
            case 128 -> 231;
            case 129 -> 113;
            case 130 -> 205;
            case 131 -> 38;
            case 132 -> 235;
            case 133 -> 43;
            case 134 -> 181;
            case 135 -> 74;
            case 136 -> 123;
            case 137 -> 106;
            case 138 -> 26;
            case 139 -> 187;
            case 140 -> 224;
            case 141 -> 163;
            case 142 -> 75;
            case 143 -> 230;
            case 144 -> 157;
            case 145 -> 118;
            case 146 -> 9;
            case 147 -> 227;
            case 148 -> 58;
            case 149 -> 143;
            case 150 -> 210;
            case 151 -> 223;
            case 152 -> 105;
            case 153 -> 102;
            case 154 -> 109;
            case 155 -> 144;
            case 156 -> 12;
            case 157 -> 237;
            case 158 -> 17;
            case 159 -> 6;
            case 160 -> 98;
            case 161 -> 209;
            case 162 -> 194;
            case 163 -> 115;
            case 164 -> 3;
            case 165 -> 112;
            case 166 -> 77;
            case 167 -> 145;
            case 168 -> 16;
            case 169 -> 88;
            case 170 -> 156;
            case 171 -> 177;
            case 172 -> 167;
            case 173 -> 135;
            case 174 -> 67;
            case 175 -> 25;
            case 176 -> 21;
            case 177 -> 199;
            case 178 -> 51;
            case 179 -> 71;
            case 180 -> 89;
            case 181 -> 189;
            case 182 -> 165;
            case 183 -> 39;
            case 184 -> 96;
            case 185 -> 31;
            case 186 -> 204;
            case 187 -> 232;
            case 188 -> 175;
            case 189 -> 78;
            case 190 -> 81;
            case 191 -> 56;
            case 192 -> 62;
            case 193 -> 229;
            case 194 -> 20;
            case 195 -> 107;
            case 196 -> 57;
            case 197 -> 41;
            case 198 -> 24;
            case 199 -> 19;
            case 200 -> 68;
            case 201 -> 103;
            case 202 -> 220;
            case 203 -> 28;
            case 204 -> 250;
            case 205 -> 69;
            case 206 -> 97;
            case 207 -> 119;
            case 208 -> 214;
            case 209 -> 59;
            case 210 -> 206;
            case 211 -> 2;
            case 212 -> 70;
            case 213 -> 127;
            case 214 -> 202;
            case 215 -> 180;
            case 216 -> 219;
            case 217 -> 32;
            case 218 -> 251;
            case 219 -> 238;
            case 220 -> 133;
            case 221 -> 168;
            case 222 -> 242;
            case 223 -> 49;
            case 224 -> 110;
            case 225 -> 42;
            case 226 -> 153;
            case 227 -> 178;
            case 228 -> 239;
            case 229 -> 34;
            case 230 -> 66;
            case 231 -> 190;
            case 232 -> 87;
            case 233 -> 160;
            case 234 -> 146;
            case 235 -> 47;
            case 236 -> 247;
            case 237 -> 185;
            case 238 -> 35;
            case 239 -> 122;
            case 240 -> 212;
            case 241 -> 101;
            case 242 -> 196;
            case 243 -> 11;
            case 244 -> 52;
            case 245 -> 61;
            case 246 -> 53;
            case 247 -> 149;
            case 248 -> 195;
            case 249 -> 95;
            case 250 -> 183;
            case 251 -> 207;
            case 252 -> 14;
            case 253 -> 85;
            case 254 -> 173;
            default -> 30;
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
