package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllIlIIlIlIIIlIlIlllIIIIIIlIIIllIllIlIlIlIIIIlIlIllllllllIllIIlIllIIIIIllllIIIIIIllI
   extends lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   private static String[] c;
   private static String[] d;

   public llllIlIIlIlIIIlIlIlllIIIIIIlIIIllIllIlIlIlIIIIlIlIllllllllIllIIlIllIIIIIllllIIIIIIllI() {
      List var10003 = CollectionsKt.listOf(new AABB(-750.0, 5.0, -355.0, -600.0, 17.0, -200.0));
      List var10004 = CollectionsKt.emptyList();
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var10005 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      List var10006 = CollectionsKt.listOf(EnderMan.class);
      short var10007 = 31997;
      short var10008 = -6265;
      super(
         new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
            var10003,
            var10004,
            var10005,
            var10006,
            CollectionsKt.listOf("Enderman"),
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
      short var10001 = 31996;
      short var10002 = 13167;
      Intrinsics.checkNotNullParameter(var1, "mob");
      int[] var10000 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      var10002 = 31999;
      short var10003 = -579;
      Intrinsics.checkNotNullParameter(var2, "player");
      int[] var3 = var10000;
      LivingEntity var4 = var1.a();
      double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4),
            me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2)
         );
      double var7 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4));
      double var9 = var2.hasLineOfSight(var4) ? 0.0 : 15.0;
      double var11 = var5 + var7 * 0.3 + var9;
      LivingEntity var14 = var4;
      if (var3 != null) {
         if (!(var4 instanceof EnderMan)) {
            return var11;
         }

         var14 = var4;
      }

      BlockState var13 = ((EnderMan)var14).getCarriedBlock();
      BlockState var15 = var13;
      if (var3 != null) {
         if (var13 == null) {
            return var11;
         }

         var15 = var13;
      }

      if (Intrinsics.areEqual(var15.getBlock(), Blocks.END_PORTAL_FRAME)) {
         var11 /= 3.0;
      }

      return var11;
   }

   @Override
   public boolean a(@NotNull Entity var1, @Nullable ArmorStand var2) {
      int[] var10000 = llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.s();
      short var10002 = 31998;
      short var10003 = 30932;
      Intrinsics.checkNotNullParameter(var1, "entity");
      int[] var3 = var10000;
      Entity var5 = var1;
      if (var3 != null) {
         if (!(var1 instanceof EnderMan)) {
            return false;
         }

         var5 = var1;
      }

      BlockState var4 = ((EnderMan)var5).getCarriedBlock();
      BlockState var6 = var4;
      if (var3 != null) {
         if (var4 == null) {
            return false;
         }

         var6 = var4;
      }

      boolean var7 = Intrinsics.areEqual(var6.getBlock(), Blocks.END_PORTAL_FRAME);
      return var3 == null ? var7 : var7;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "F°\u0011tB\u0093\u0006)ì^\u00ad\r±";
      int var4 = "F°\u0011tB\u0093\u0006)ì^\u00ad\r±".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 15;
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
                     case 1 -> 66;
                     case 2 -> 37;
                     case 3 -> 92;
                     case 4 -> 2;
                     case 5 -> 92;
                     default -> 120;
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

                  var2 = "\u0017¶\bOvÑà<\u0003\u0017û#";
                  var4 = "\u0017¶\bOvÑà<\u0003\u0017û#".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 10;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 31999) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 173;
            case 1 -> 160;
            case 2 -> 195;
            case 3 -> 46;
            case 4 -> 154;
            case 5 -> 112;
            case 6 -> 101;
            case 7 -> 146;
            case 8 -> 153;
            case 9 -> 99;
            case 10 -> 114;
            case 11 -> 74;
            case 12 -> 3;
            case 13 -> 45;
            case 14 -> 244;
            case 15 -> 197;
            case 16 -> 226;
            case 17 -> 232;
            case 18 -> 229;
            case 19 -> 127;
            case 20 -> 165;
            case 21 -> 9;
            case 22 -> 33;
            case 23 -> 115;
            case 24 -> 174;
            case 25 -> 151;
            case 26 -> 224;
            case 27 -> 125;
            case 28 -> 32;
            case 29 -> 19;
            case 30 -> 243;
            case 31 -> 95;
            case 32 -> 58;
            case 33 -> 108;
            case 34 -> 219;
            case 35 -> 116;
            case 36 -> 236;
            case 37 -> 94;
            case 38 -> 218;
            case 39 -> 15;
            case 40 -> 137;
            case 41 -> 155;
            case 42 -> 248;
            case 43 -> 131;
            case 44 -> 126;
            case 45 -> 239;
            case 46 -> 12;
            case 47 -> 85;
            case 48 -> 241;
            case 49 -> 90;
            case 50 -> 10;
            case 51 -> 135;
            case 52 -> 140;
            case 53 -> 52;
            case 54 -> 78;
            case 55 -> 59;
            case 56 -> 27;
            case 57 -> 220;
            case 58 -> 60;
            case 59 -> 25;
            case 60 -> 186;
            case 61 -> 80;
            case 62 -> 156;
            case 63 -> 191;
            case 64 -> 214;
            case 65 -> 29;
            case 66 -> 172;
            case 67 -> 158;
            case 68 -> 118;
            case 69 -> 147;
            case 70 -> 234;
            case 71 -> 230;
            case 72 -> 246;
            case 73 -> 103;
            case 74 -> 43;
            case 75 -> 14;
            case 76 -> 134;
            case 77 -> 194;
            case 78 -> 169;
            case 79 -> 161;
            case 80 -> 208;
            case 81 -> 7;
            case 82 -> 152;
            case 83 -> 231;
            case 84 -> 16;
            case 85 -> 97;
            case 86 -> 63;
            case 87 -> 217;
            case 88 -> 92;
            case 89 -> 20;
            case 90 -> 36;
            case 91 -> 159;
            case 92 -> 105;
            case 93 -> 6;
            case 94 -> 83;
            case 95 -> 107;
            case 96 -> 193;
            case 97 -> 196;
            case 98 -> 171;
            case 99 -> 70;
            case 100 -> 139;
            case 101 -> 67;
            case 102 -> 148;
            case 103 -> 93;
            case 104 -> 213;
            case 105 -> 168;
            case 106 -> 71;
            case 107 -> 141;
            case 108 -> 157;
            case 109 -> 81;
            case 110 -> 34;
            case 111 -> 130;
            case 112 -> 253;
            case 113 -> 242;
            case 114 -> 245;
            case 115 -> 206;
            case 116 -> 142;
            case 117 -> 87;
            case 118 -> 100;
            case 119 -> 163;
            case 120 -> 69;
            case 121 -> 48;
            case 122 -> 221;
            case 123 -> 30;
            case 124 -> 56;
            case 125 -> 109;
            case 126 -> 51;
            case 127 -> 225;
            case 128 -> 17;
            case 129 -> 149;
            case 130 -> 216;
            case 131 -> 123;
            case 132 -> 5;
            case 133 -> 200;
            case 134 -> 205;
            case 135 -> 170;
            case 136 -> 82;
            case 137 -> 181;
            case 138 -> 24;
            case 139 -> 209;
            case 140 -> 57;
            case 141 -> 185;
            case 142 -> 1;
            case 143 -> 215;
            case 144 -> 31;
            case 145 -> 64;
            case 146 -> 38;
            case 147 -> 145;
            case 148 -> 37;
            case 149 -> 183;
            case 150 -> 18;
            case 151 -> 176;
            case 152 -> 26;
            case 153 -> 233;
            case 154 -> 11;
            case 155 -> 61;
            case 156 -> 13;
            case 157 -> 104;
            case 158 -> 53;
            case 159 -> 254;
            case 160 -> 88;
            case 161 -> 222;
            case 162 -> 23;
            case 163 -> 132;
            case 164 -> 240;
            case 165 -> 28;
            case 166 -> 235;
            case 167 -> 76;
            case 168 -> 144;
            case 169 -> 102;
            case 170 -> 119;
            case 171 -> 44;
            case 172 -> 162;
            case 173 -> 189;
            case 174 -> 98;
            case 175 -> 2;
            case 176 -> 86;
            case 177 -> 41;
            case 178 -> 228;
            case 179 -> 106;
            case 180 -> 121;
            case 181 -> 0;
            case 182 -> 207;
            case 183 -> 35;
            case 184 -> 39;
            case 185 -> 84;
            case 186 -> 91;
            case 187 -> 117;
            case 188 -> 4;
            case 189 -> 247;
            case 190 -> 42;
            case 191 -> 249;
            case 192 -> 238;
            case 193 -> 113;
            case 194 -> 175;
            case 195 -> 55;
            case 196 -> 122;
            case 197 -> 192;
            case 198 -> 79;
            case 199 -> 22;
            case 200 -> 212;
            case 201 -> 89;
            case 202 -> 177;
            case 203 -> 65;
            case 204 -> 21;
            case 205 -> 237;
            case 206 -> 250;
            case 207 -> 133;
            case 208 -> 110;
            case 209 -> 120;
            case 210 -> 128;
            case 211 -> 201;
            case 212 -> 73;
            case 213 -> 180;
            case 214 -> 49;
            case 215 -> 50;
            case 216 -> 223;
            case 217 -> 227;
            case 218 -> 72;
            case 219 -> 150;
            case 220 -> 111;
            case 221 -> 75;
            case 222 -> 179;
            case 223 -> 40;
            case 224 -> 47;
            case 225 -> 210;
            case 226 -> 96;
            case 227 -> 124;
            case 228 -> 166;
            case 229 -> 184;
            case 230 -> 255;
            case 231 -> 167;
            case 232 -> 77;
            case 233 -> 62;
            case 234 -> 204;
            case 235 -> 202;
            case 236 -> 182;
            case 237 -> 138;
            case 238 -> 188;
            case 239 -> 136;
            case 240 -> 68;
            case 241 -> 164;
            case 242 -> 203;
            case 243 -> 8;
            case 244 -> 190;
            case 245 -> 199;
            case 246 -> 198;
            case 247 -> 66;
            case 248 -> 252;
            case 249 -> 251;
            case 250 -> 211;
            case 251 -> 129;
            case 252 -> 187;
            case 253 -> 54;
            case 254 -> 143;
            default -> 178;
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
