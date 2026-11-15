package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   @NotNull
   private final Vec3 lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private static int[] IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static String[] c;
   private static String[] d;

   public llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll() {
      List var10003 = CollectionsKt.listOf(new AABB(-171.0, 133.0, 92.0, -55.0, 166.0, 186.0));
      List var10004 = CollectionsKt.listOf(new AABB(-165.0, 138.0, 158.0, -150.0, 148.0, 200.0));
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var10005 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      List var10006 = CollectionsKt.listOf(RemotePlayer.class);
      String[] var1 = new String[2];
      short var10009 = -31149;
      short var10010 = -22858;
      var1[0] = "Goblin";
      var10009 = -31152;
      var10010 = 30140;
      var1[1] = "Weakling";
      super(
         new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
            var10003,
            var10004,
            var10005,
            var10006,
            CollectionsKt.listOf(var1),
            CollectionsKt.emptyList(),
            CollectionsKt.emptyList(),
            CollectionsKt.emptyList(),
            false,
            false,
            768,
            null
         )
      );
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new Vec3(-137.5, 145.5, 138.5);
   }

   @Override
   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      short var10001 = -31150;
      short var10002 = 17014;
      Intrinsics.checkNotNullParameter(var1, "mob");
      int[] var10000 = s();
      var10002 = -31151;
      short var10003 = 19615;
      Intrinsics.checkNotNullParameter(var2, "player");
      int[] var3 = var10000;
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
         + Math.abs(var2.getY() - var4.getY())
         + me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4),
                  this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI
               )
            * 0.4
         + Math.abs(this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI.y - var4.getY());
   }

   public static void a(int[] var0) {
      IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var0;
   }

   public static int[] s() {
      return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[4];
      int[] var10000 = new int[3];
      int var3 = 0;
      String var2 = "²Ü¡ì\u0018.\u0003Ø¸\u0083";
      int var4 = "²Ü¡ì\u0018.\u0003Ø¸\u0083".length();
      a(var10000);
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var9 = 124;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 55;
                     case 1 -> 97;
                     case 2 -> 47;
                     case 3 -> 70;
                     case 4 -> 125;
                     case 5 -> 7;
                     default -> 78;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     c = var5;
                     d = new String[4];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "k\u009erè7?\bÓî¦Ü¤ò3c";
                  var4 = "k\u009erè7?\bÓî¦Ü¤ò3c".length();
                  var1 = 6;
                  var8 = -1;
            }

            var9 = 101;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -31149) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 183;
            case 1 -> 241;
            case 2 -> 203;
            case 3 -> 171;
            case 4 -> 35;
            case 5 -> 130;
            case 6 -> 240;
            case 7 -> 4;
            case 8 -> 167;
            case 9 -> 98;
            case 10 -> 159;
            case 11 -> 252;
            case 12 -> 145;
            case 13 -> 90;
            case 14 -> 26;
            case 15 -> 220;
            case 16 -> 36;
            case 17 -> 242;
            case 18 -> 95;
            case 19 -> 79;
            case 20 -> 146;
            case 21 -> 60;
            case 22 -> 200;
            case 23 -> 46;
            case 24 -> 224;
            case 25 -> 119;
            case 26 -> 50;
            case 27 -> 222;
            case 28 -> 47;
            case 29 -> 181;
            case 30 -> 141;
            case 31 -> 88;
            case 32 -> 61;
            case 33 -> 58;
            case 34 -> 23;
            case 35 -> 77;
            case 36 -> 134;
            case 37 -> 207;
            case 38 -> 11;
            case 39 -> 149;
            case 40 -> 70;
            case 41 -> 73;
            case 42 -> 25;
            case 43 -> 13;
            case 44 -> 108;
            case 45 -> 31;
            case 46 -> 48;
            case 47 -> 85;
            case 48 -> 133;
            case 49 -> 154;
            case 50 -> 179;
            case 51 -> 87;
            case 52 -> 0;
            case 53 -> 178;
            case 54 -> 176;
            case 55 -> 194;
            case 56 -> 68;
            case 57 -> 86;
            case 58 -> 66;
            case 59 -> 239;
            case 60 -> 166;
            case 61 -> 3;
            case 62 -> 253;
            case 63 -> 22;
            case 64 -> 234;
            case 65 -> 12;
            case 66 -> 135;
            case 67 -> 249;
            case 68 -> 255;
            case 69 -> 188;
            case 70 -> 102;
            case 71 -> 91;
            case 72 -> 244;
            case 73 -> 180;
            case 74 -> 182;
            case 75 -> 170;
            case 76 -> 174;
            case 77 -> 163;
            case 78 -> 151;
            case 79 -> 104;
            case 80 -> 106;
            case 81 -> 127;
            case 82 -> 254;
            case 83 -> 216;
            case 84 -> 33;
            case 85 -> 64;
            case 86 -> 101;
            case 87 -> 103;
            case 88 -> 107;
            case 89 -> 136;
            case 90 -> 162;
            case 91 -> 14;
            case 92 -> 157;
            case 93 -> 206;
            case 94 -> 1;
            case 95 -> 214;
            case 96 -> 55;
            case 97 -> 247;
            case 98 -> 173;
            case 99 -> 7;
            case 100 -> 129;
            case 101 -> 193;
            case 102 -> 84;
            case 103 -> 38;
            case 104 -> 205;
            case 105 -> 153;
            case 106 -> 81;
            case 107 -> 161;
            case 108 -> 74;
            case 109 -> 223;
            case 110 -> 123;
            case 111 -> 9;
            case 112 -> 126;
            case 113 -> 189;
            case 114 -> 78;
            case 115 -> 187;
            case 116 -> 204;
            case 117 -> 231;
            case 118 -> 169;
            case 119 -> 208;
            case 120 -> 59;
            case 121 -> 245;
            case 122 -> 27;
            case 123 -> 195;
            case 124 -> 41;
            case 125 -> 17;
            case 126 -> 113;
            case 127 -> 49;
            case 128 -> 117;
            case 129 -> 230;
            case 130 -> 156;
            case 131 -> 140;
            case 132 -> 184;
            case 133 -> 229;
            case 134 -> 168;
            case 135 -> 21;
            case 136 -> 15;
            case 137 -> 185;
            case 138 -> 172;
            case 139 -> 96;
            case 140 -> 51;
            case 141 -> 251;
            case 142 -> 192;
            case 143 -> 115;
            case 144 -> 228;
            case 145 -> 69;
            case 146 -> 155;
            case 147 -> 120;
            case 148 -> 209;
            case 149 -> 165;
            case 150 -> 93;
            case 151 -> 65;
            case 152 -> 105;
            case 153 -> 6;
            case 154 -> 63;
            case 155 -> 150;
            case 156 -> 147;
            case 157 -> 210;
            case 158 -> 232;
            case 159 -> 227;
            case 160 -> 52;
            case 161 -> 89;
            case 162 -> 235;
            case 163 -> 121;
            case 164 -> 152;
            case 165 -> 40;
            case 166 -> 37;
            case 167 -> 142;
            case 168 -> 215;
            case 169 -> 199;
            case 170 -> 177;
            case 171 -> 116;
            case 172 -> 175;
            case 173 -> 83;
            case 174 -> 8;
            case 175 -> 114;
            case 176 -> 29;
            case 177 -> 97;
            case 178 -> 221;
            case 179 -> 76;
            case 180 -> 100;
            case 181 -> 125;
            case 182 -> 20;
            case 183 -> 118;
            case 184 -> 71;
            case 185 -> 190;
            case 186 -> 144;
            case 187 -> 44;
            case 188 -> 5;
            case 189 -> 164;
            case 190 -> 16;
            case 191 -> 28;
            case 192 -> 160;
            case 193 -> 10;
            case 194 -> 236;
            case 195 -> 218;
            case 196 -> 212;
            case 197 -> 138;
            case 198 -> 148;
            case 199 -> 110;
            case 200 -> 128;
            case 201 -> 92;
            case 202 -> 158;
            case 203 -> 99;
            case 204 -> 211;
            case 205 -> 34;
            case 206 -> 143;
            case 207 -> 45;
            case 208 -> 250;
            case 209 -> 72;
            case 210 -> 109;
            case 211 -> 32;
            case 212 -> 225;
            case 213 -> 24;
            case 214 -> 191;
            case 215 -> 202;
            case 216 -> 246;
            case 217 -> 94;
            case 218 -> 67;
            case 219 -> 2;
            case 220 -> 18;
            case 221 -> 53;
            case 222 -> 43;
            case 223 -> 80;
            case 224 -> 197;
            case 225 -> 54;
            case 226 -> 198;
            case 227 -> 75;
            case 228 -> 237;
            case 229 -> 219;
            case 230 -> 42;
            case 231 -> 139;
            case 232 -> 57;
            case 233 -> 132;
            case 234 -> 82;
            case 235 -> 122;
            case 236 -> 131;
            case 237 -> 124;
            case 238 -> 62;
            case 239 -> 56;
            case 240 -> 39;
            case 241 -> 201;
            case 242 -> 226;
            case 243 -> 30;
            case 244 -> 217;
            case 245 -> 112;
            case 246 -> 137;
            case 247 -> 233;
            case 248 -> 19;
            case 249 -> 248;
            case 250 -> 243;
            case 251 -> 111;
            case 252 -> 213;
            case 253 -> 238;
            case 254 -> 186;
            default -> 196;
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
