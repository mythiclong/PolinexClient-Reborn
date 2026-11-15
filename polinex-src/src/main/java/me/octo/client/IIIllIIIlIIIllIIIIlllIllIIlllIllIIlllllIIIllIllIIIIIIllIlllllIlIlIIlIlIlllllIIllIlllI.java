package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI {
   @NotNull
   public static IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI() {
   }

   @NotNull
   public final IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI a() {
      List var10002 = CollectionsKt.listOf(Zombie.class);
      short var10003 = 10961;
      short var10004 = -10356;
      List var1 = CollectionsKt.listOf("Zombie");
      List var2 = CollectionsKt.listOf(new AABB(-160.0, 38.0, -149.0, -42.0, 61.0, -72.0));
      List var10005 = CollectionsKt.emptyList();
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 10965;
      short var10009 = 4610;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI(
         var10002,
         var1,
         var2,
         var10005,
         var10006,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         CollectionsKt.listOf(
            new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
               new BlockPos(-154, 58, -100),
               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )
         ),
         null,
         512,
         null
      );
   }

   @NotNull
   public final IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI b() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.d();
      List var10002 = CollectionsKt.listOf(Wolf.class);
      short var10003 = 10962;
      short var10004 = -14589;
      List var3 = CollectionsKt.listOf("Wolf");
      List var4 = CollectionsKt.listOf(new AABB(-296.0, 86.0, 36.0, -196.0, 120.0, 111.0));
      AABB[] var2 = new AABB[]{
         new AABB(-268.0, 98.0, 57.0, -262.0, 119.0, 86.0),
         me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(new BlockPos(-259, 93, 79), new BlockPos(-261, 95, 82))
      };
      List var10005 = CollectionsKt.listOf(var2);
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 10963;
      short var10009 = 4481;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI var10000 = new IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI(
         var10002,
         var3,
         var4,
         var10005,
         var10006,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         CollectionsKt.listOf(
            new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
               new BlockPos(-217, 90, 57),
               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )
         ),
         null,
         512,
         null
      );
      if (var1 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }

      return var10000;
   }

   @NotNull
   public final IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI c() {
      List var10002 = CollectionsKt.listOf(EnderMan.class);
      short var10003 = 10960;
      short var10004 = 353;
      List var2 = CollectionsKt.listOf("Enderman");
      List var3 = CollectionsKt.listOf(new AABB(-619.0, 6.0, -372.0, -527.0, 53.0, -287.0));
      AABB[] var1 = new AABB[]{new AABB(-571.0, 4.0, -329.0, -518.0, 20.0, -288.0), new AABB(-600.0, 8.0, -320.0, -570.0, 14.0, -288.0)};
      List var10005 = CollectionsKt.listOf(var1);
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 10963;
      short var10009 = 4481;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI(
         var10002,
         var2,
         var3,
         var10005,
         var10006,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
         lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         CollectionsKt.emptyList(),
         null,
         512,
         null
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "ÜÛÏM£u\b÷\u001b_s\u0082]|¢\u0004£k\u001f\u0019";
      int var4 = "ÜÛÏM£u\b÷\u001b_s\u0082]|¢\u0004£k\u001f\u0019".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 106;
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
                     case 0 -> 67;
                     case 1 -> 36;
                     case 2 -> 103;
                     case 3 -> 117;
                     case 4 -> 56;
                     case 5 -> 30;
                     default -> 81;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIllIIIlIIIllIIIIlllIllIIlllIllIIlllllIIIllIllIIIIIIllIlllllIlIlIIlIlIlllllIIllIlllI();
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

                  var2 = "ÇTÙ`\u0004\u0081é\u0083\u0091";
                  var4 = "ÇTÙ`\u0004\u0081é\u0083\u0091".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 85;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 10961) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 146;
            case 1 -> 157;
            case 2 -> 8;
            case 3 -> 127;
            case 4 -> 16;
            case 5 -> 204;
            case 6 -> 28;
            case 7 -> 105;
            case 8 -> 91;
            case 9 -> 48;
            case 10 -> 72;
            case 11 -> 185;
            case 12 -> 34;
            case 13 -> 116;
            case 14 -> 210;
            case 15 -> 33;
            case 16 -> 49;
            case 17 -> 222;
            case 18 -> 64;
            case 19 -> 121;
            case 20 -> 89;
            case 21 -> 153;
            case 22 -> 70;
            case 23 -> 39;
            case 24 -> 208;
            case 25 -> 190;
            case 26 -> 5;
            case 27 -> 202;
            case 28 -> 100;
            case 29 -> 156;
            case 30 -> 180;
            case 31 -> 101;
            case 32 -> 136;
            case 33 -> 3;
            case 34 -> 163;
            case 35 -> 249;
            case 36 -> 10;
            case 37 -> 126;
            case 38 -> 174;
            case 39 -> 71;
            case 40 -> 22;
            case 41 -> 216;
            case 42 -> 62;
            case 43 -> 242;
            case 44 -> 9;
            case 45 -> 7;
            case 46 -> 253;
            case 47 -> 167;
            case 48 -> 236;
            case 49 -> 219;
            case 50 -> 75;
            case 51 -> 231;
            case 52 -> 161;
            case 53 -> 138;
            case 54 -> 15;
            case 55 -> 73;
            case 56 -> 12;
            case 57 -> 2;
            case 58 -> 144;
            case 59 -> 42;
            case 60 -> 18;
            case 61 -> 20;
            case 62 -> 201;
            case 63 -> 45;
            case 64 -> 37;
            case 65 -> 96;
            case 66 -> 166;
            case 67 -> 99;
            case 68 -> 55;
            case 69 -> 106;
            case 70 -> 241;
            case 71 -> 38;
            case 72 -> 128;
            case 73 -> 214;
            case 74 -> 182;
            case 75 -> 218;
            case 76 -> 123;
            case 77 -> 74;
            case 78 -> 21;
            case 79 -> 51;
            case 80 -> 60;
            case 81 -> 197;
            case 82 -> 154;
            case 83 -> 226;
            case 84 -> 134;
            case 85 -> 162;
            case 86 -> 43;
            case 87 -> 173;
            case 88 -> 69;
            case 89 -> 111;
            case 90 -> 225;
            case 91 -> 59;
            case 92 -> 142;
            case 93 -> 184;
            case 94 -> 171;
            case 95 -> 27;
            case 96 -> 192;
            case 97 -> 129;
            case 98 -> 212;
            case 99 -> 11;
            case 100 -> 215;
            case 101 -> 176;
            case 102 -> 193;
            case 103 -> 151;
            case 104 -> 235;
            case 105 -> 118;
            case 106 -> 239;
            case 107 -> 32;
            case 108 -> 209;
            case 109 -> 200;
            case 110 -> 81;
            case 111 -> 78;
            case 112 -> 57;
            case 113 -> 98;
            case 114 -> 189;
            case 115 -> 243;
            case 116 -> 25;
            case 117 -> 30;
            case 118 -> 255;
            case 119 -> 92;
            case 120 -> 56;
            case 121 -> 240;
            case 122 -> 46;
            case 123 -> 223;
            case 124 -> 58;
            case 125 -> 135;
            case 126 -> 104;
            case 127 -> 230;
            case 128 -> 109;
            case 129 -> 65;
            case 130 -> 206;
            case 131 -> 224;
            case 132 -> 229;
            case 133 -> 115;
            case 134 -> 247;
            case 135 -> 40;
            case 136 -> 145;
            case 137 -> 227;
            case 138 -> 177;
            case 139 -> 159;
            case 140 -> 160;
            case 141 -> 179;
            case 142 -> 17;
            case 143 -> 124;
            case 144 -> 83;
            case 145 -> 97;
            case 146 -> 113;
            case 147 -> 188;
            case 148 -> 14;
            case 149 -> 238;
            case 150 -> 93;
            case 151 -> 53;
            case 152 -> 122;
            case 153 -> 77;
            case 154 -> 85;
            case 155 -> 132;
            case 156 -> 149;
            case 157 -> 250;
            case 158 -> 0;
            case 159 -> 86;
            case 160 -> 213;
            case 161 -> 80;
            case 162 -> 114;
            case 163 -> 252;
            case 164 -> 141;
            case 165 -> 130;
            case 166 -> 148;
            case 167 -> 84;
            case 168 -> 87;
            case 169 -> 103;
            case 170 -> 119;
            case 171 -> 246;
            case 172 -> 147;
            case 173 -> 150;
            case 174 -> 254;
            case 175 -> 233;
            case 176 -> 102;
            case 177 -> 211;
            case 178 -> 139;
            case 179 -> 181;
            case 180 -> 205;
            case 181 -> 187;
            case 182 -> 191;
            case 183 -> 29;
            case 184 -> 90;
            case 185 -> 50;
            case 186 -> 35;
            case 187 -> 164;
            case 188 -> 54;
            case 189 -> 158;
            case 190 -> 183;
            case 191 -> 245;
            case 192 -> 169;
            case 193 -> 140;
            case 194 -> 1;
            case 195 -> 131;
            case 196 -> 195;
            case 197 -> 82;
            case 198 -> 110;
            case 199 -> 168;
            case 200 -> 244;
            case 201 -> 66;
            case 202 -> 44;
            case 203 -> 76;
            case 204 -> 79;
            case 205 -> 220;
            case 206 -> 63;
            case 207 -> 133;
            case 208 -> 165;
            case 209 -> 125;
            case 210 -> 120;
            case 211 -> 152;
            case 212 -> 108;
            case 213 -> 31;
            case 214 -> 172;
            case 215 -> 107;
            case 216 -> 232;
            case 217 -> 251;
            case 218 -> 178;
            case 219 -> 19;
            case 220 -> 68;
            case 221 -> 199;
            case 222 -> 198;
            case 223 -> 237;
            case 224 -> 186;
            case 225 -> 207;
            case 226 -> 117;
            case 227 -> 228;
            case 228 -> 112;
            case 229 -> 41;
            case 230 -> 234;
            case 231 -> 23;
            case 232 -> 95;
            case 233 -> 88;
            case 234 -> 4;
            case 235 -> 24;
            case 236 -> 61;
            case 237 -> 196;
            case 238 -> 52;
            case 239 -> 155;
            case 240 -> 203;
            case 241 -> 143;
            case 242 -> 47;
            case 243 -> 170;
            case 244 -> 36;
            case 245 -> 221;
            case 246 -> 248;
            case 247 -> 217;
            case 248 -> 26;
            case 249 -> 137;
            case 250 -> 6;
            case 251 -> 94;
            case 252 -> 194;
            case 253 -> 67;
            case 254 -> 13;
            default -> 175;
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
