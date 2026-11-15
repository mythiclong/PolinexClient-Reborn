package me.octo.client;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl {
   @NotNull
   public static lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl() {
   }

   public final boolean a(float var1, float var2, double var3) {
      String var5 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var5 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var6 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         if (var5 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            ClientLevel var7 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level;
            Vec3 var8 = new Vec3(var6.getX(), var6.getY() + var6.getEyeHeight(), var6.getZ());
            double var9 = Math.toRadians(var1);
            double var11 = Math.toRadians(var2);
            double var13 = -Math.sin(var9) * Math.cos(var11);
            double var15 = -Math.sin(var11);
            double var17 = Math.cos(var9) * Math.cos(var11);
            Vec3 var19 = new Vec3(var8.x + var13 * var3, var8.y + var15 * var3, var8.z + var17 * var3);
            BlockHitResult var10000 = var7.clip(new ClipContext(var8, var19, Block.OUTLINE, Fluid.NONE, var6));
            short var10002 = 32304;
            short var10003 = -8869;
            Intrinsics.checkNotNullExpressionValue(var10000, "clip(...)");
            BlockHitResult var20 = var10000;
            return var20.getType() == Type.MISS;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   // PX-FIX TOP3d2: Kotlin default-args bridge for the instance a(float,float,double)Z (jar access 4105).
   // Jar body: <guard>.r() -> slot7; if ((mask & 4) != 0) { if (slot7 != null) { d = 8.0d; } }
   //   return param.d.  The guard call and its null test are preserved; the default 8.0d is the literal from the bytecode (ldc2_w 8.0d).
   public static boolean a(
      lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl var0, float var1, float var2, double var3, int var4, @Nullable Object var5) {
      String var7 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if ((var4 & 4) != 0 && var7 != null) {
         var3 = 8.0d;
      }

      return var0.a(var1, var2, var3);
   }

   // PX-FIX TOP3d2: Kotlin default-args bridge for the instance a(float,float,int)LPair; (jar access 4105).
   // Jar body: <guard>.r() -> slot6; if ((mask & 4) != 0) { if (slot6 != null) { i = 5; } }
   //   then the instance a(float,float,int) is invoked and its Pair returned (ireturn).
   @NotNull
   public static Pair<Float, Float> a(
      lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl var0, float var1, float var2, int var3, int var4, @Nullable Object var5) {
      String var6 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if ((var4 & 4) != 0 && var6 != null) {
         var3 = 5;
      }

      return var0.a(var1, var2, var3);
   }

   public final Pair<Float, Float> a(float var1, float var2, int var3) {
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      Double[] var6 = new Double[5];
      String var4 = var10000;
      var6[0] = 8.0;
      var6[1] = 7.0;
      var6[2] = 6.0;
      var6[3] = 5.0;
      var6[4] = 4.0;

      label49:
      for (Object var18 : CollectionsKt.listOf(var6)) {
         do {
            double var14 = ((Number)var18).doubleValue();
            if (!this.a(var1, var2, var14)) {
               continue label49;
            }

            var18 = TuplesKt.to(var1, var2);
         } while (var4 == null);

         return (Pair<Float, Float>)var18;
      }

      Float[] var15 = new Float[]{0.0F, 5.0F, -5.0F, 10.0F, -10.0F, 15.0F, -15.0F, 20.0F, -20.0F};
      List var13 = CollectionsKt.listOf(var15);
      Float[] var7 = new Float[]{0.0F, 10.0F, -10.0F, 20.0F, -20.0F, 30.0F, -30.0F, 40.0F, -40.0F};
      List var16 = CollectionsKt.listOf(var7);
      Iterator var17 = var13.iterator();

      label40:
      while (var17.hasNext()) {
         float var8 = ((Number)var17.next()).floatValue();
         float var9 = RangesKt.coerceIn(var2 + var8, -90.0F, 90.0F);
         Iterator var10 = var16.iterator();

         label38:
         while (true) {
            boolean var19 = var10.hasNext();

            label36:
            while (true) {
               if (!var19) {
                  continue label40;
               }

               Object var20 = var10.next();

               do {
                  float var11 = ((Number)var20).floatValue();
                  float var12 = var1 + var11;
                  var19 = this.a(var12, var9, 6.0);
                  if (var4 == null) {
                     continue label36;
                  }

                  if (!var19) {
                     continue label38;
                  }

                  var20 = TuplesKt.to(var12, var9);
               } while (var4 == null);

               return (Pair<Float, Float>)var20;
            }
         }
      }

      return null;
   }

   public final double a() {
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var1 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         if (var1 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            ClientLevel var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level;
            Vec3 var4 = new Vec3(var2.getX(), var2.getY() + var2.getEyeHeight(), var2.getZ());
            float var5 = var2.getYRot();
            float var6 = var2.getXRot();
            double var7 = Math.toRadians(var5);
            double var9 = Math.toRadians(var6);
            double var11 = -Math.sin(var7) * Math.cos(var9);
            double var13 = -Math.sin(var9);
            double var15 = Math.cos(var7) * Math.cos(var9);
            Vec3 var17 = new Vec3(var4.x + var11 * 10.0, var4.y + var13 * 10.0, var4.z + var15 * 10.0);
            BlockHitResult var10000 = var3.clip(new ClipContext(var4, var17, Block.OUTLINE, Fluid.NONE, var2));
            short var10002 = 32305;
            short var10003 = -31046;
            Intrinsics.checkNotNullExpressionValue(var10000, "clip(...)");
            BlockHitResult var18 = var10000;
            return var18.getType() == Type.MISS ? 10.0 : var4.distanceTo(var18.getLocation());
         } else {
            return 0.0;
         }
      } else {
         return 0.0;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "iädaQÅ\u0098\u008cI\tu.ç8!î\u0096é\u0088";
      int var4 = "iädaQÅ\u0098\u008cI\tu.ç8!î\u0096é\u0088".length();
      char var1 = '\t';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 76;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 76;
               var10006 = var6;
            } else {
               var13 = 76;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 76;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 22;
                  case 1 -> 22;
                  case 2 -> 40;
                  case 3 -> 107;
                  case 4 -> 113;
                  case 5 -> 17;
                  default -> 90;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 32304) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 179;
            case 1 -> 185;
            case 2 -> 157;
            case 3 -> 131;
            case 4 -> 43;
            case 5 -> 201;
            case 6 -> 73;
            case 7 -> 54;
            case 8 -> 199;
            case 9 -> 165;
            case 10 -> 197;
            case 11 -> 230;
            case 12 -> 104;
            case 13 -> 167;
            case 14 -> 166;
            case 15 -> 243;
            case 16 -> 52;
            case 17 -> 209;
            case 18 -> 172;
            case 19 -> 93;
            case 20 -> 116;
            case 21 -> 6;
            case 22 -> 246;
            case 23 -> 0;
            case 24 -> 213;
            case 25 -> 242;
            case 26 -> 109;
            case 27 -> 187;
            case 28 -> 228;
            case 29 -> 204;
            case 30 -> 121;
            case 31 -> 220;
            case 32 -> 192;
            case 33 -> 178;
            case 34 -> 114;
            case 35 -> 10;
            case 36 -> 64;
            case 37 -> 8;
            case 38 -> 233;
            case 39 -> 247;
            case 40 -> 138;
            case 41 -> 57;
            case 42 -> 158;
            case 43 -> 95;
            case 44 -> 180;
            case 45 -> 122;
            case 46 -> 128;
            case 47 -> 110;
            case 48 -> 252;
            case 49 -> 3;
            case 50 -> 207;
            case 51 -> 11;
            case 52 -> 236;
            case 53 -> 66;
            case 54 -> 94;
            case 55 -> 150;
            case 56 -> 143;
            case 57 -> 216;
            case 58 -> 126;
            case 59 -> 169;
            case 60 -> 155;
            case 61 -> 72;
            case 62 -> 23;
            case 63 -> 164;
            case 64 -> 130;
            case 65 -> 194;
            case 66 -> 61;
            case 67 -> 123;
            case 68 -> 22;
            case 69 -> 145;
            case 70 -> 68;
            case 71 -> 210;
            case 72 -> 9;
            case 73 -> 112;
            case 74 -> 184;
            case 75 -> 227;
            case 76 -> 71;
            case 77 -> 45;
            case 78 -> 18;
            case 79 -> 30;
            case 80 -> 47;
            case 81 -> 208;
            case 82 -> 239;
            case 83 -> 226;
            case 84 -> 19;
            case 85 -> 148;
            case 86 -> 90;
            case 87 -> 102;
            case 88 -> 135;
            case 89 -> 98;
            case 90 -> 175;
            case 91 -> 129;
            case 92 -> 40;
            case 93 -> 44;
            case 94 -> 235;
            case 95 -> 36;
            case 96 -> 156;
            case 97 -> 212;
            case 98 -> 251;
            case 99 -> 80;
            case 100 -> 198;
            case 101 -> 81;
            case 102 -> 232;
            case 103 -> 193;
            case 104 -> 63;
            case 105 -> 101;
            case 106 -> 4;
            case 107 -> 37;
            case 108 -> 7;
            case 109 -> 82;
            case 110 -> 183;
            case 111 -> 34;
            case 112 -> 133;
            case 113 -> 91;
            case 114 -> 140;
            case 115 -> 188;
            case 116 -> 46;
            case 117 -> 211;
            case 118 -> 222;
            case 119 -> 83;
            case 120 -> 39;
            case 121 -> 88;
            case 122 -> 119;
            case 123 -> 59;
            case 124 -> 41;
            case 125 -> 152;
            case 126 -> 219;
            case 127 -> 62;
            case 128 -> 1;
            case 129 -> 202;
            case 130 -> 35;
            case 131 -> 70;
            case 132 -> 255;
            case 133 -> 159;
            case 134 -> 21;
            case 135 -> 163;
            case 136 -> 77;
            case 137 -> 124;
            case 138 -> 12;
            case 139 -> 32;
            case 140 -> 137;
            case 141 -> 89;
            case 142 -> 214;
            case 143 -> 79;
            case 144 -> 151;
            case 145 -> 97;
            case 146 -> 217;
            case 147 -> 221;
            case 148 -> 141;
            case 149 -> 134;
            case 150 -> 244;
            case 151 -> 67;
            case 152 -> 75;
            case 153 -> 76;
            case 154 -> 103;
            case 155 -> 87;
            case 156 -> 189;
            case 157 -> 177;
            case 158 -> 231;
            case 159 -> 15;
            case 160 -> 229;
            case 161 -> 218;
            case 162 -> 17;
            case 163 -> 182;
            case 164 -> 69;
            case 165 -> 2;
            case 166 -> 162;
            case 167 -> 113;
            case 168 -> 203;
            case 169 -> 147;
            case 170 -> 85;
            case 171 -> 160;
            case 172 -> 139;
            case 173 -> 60;
            case 174 -> 118;
            case 175 -> 173;
            case 176 -> 234;
            case 177 -> 249;
            case 178 -> 254;
            case 179 -> 191;
            case 180 -> 51;
            case 181 -> 56;
            case 182 -> 240;
            case 183 -> 24;
            case 184 -> 92;
            case 185 -> 42;
            case 186 -> 174;
            case 187 -> 27;
            case 188 -> 29;
            case 189 -> 144;
            case 190 -> 154;
            case 191 -> 196;
            case 192 -> 195;
            case 193 -> 55;
            case 194 -> 253;
            case 195 -> 105;
            case 196 -> 96;
            case 197 -> 106;
            case 198 -> 225;
            case 199 -> 245;
            case 200 -> 78;
            case 201 -> 149;
            case 202 -> 223;
            case 203 -> 13;
            case 204 -> 111;
            case 205 -> 200;
            case 206 -> 25;
            case 207 -> 190;
            case 208 -> 14;
            case 209 -> 53;
            case 210 -> 142;
            case 211 -> 117;
            case 212 -> 28;
            case 213 -> 170;
            case 214 -> 153;
            case 215 -> 248;
            case 216 -> 146;
            case 217 -> 58;
            case 218 -> 161;
            case 219 -> 176;
            case 220 -> 84;
            case 221 -> 26;
            case 222 -> 108;
            case 223 -> 237;
            case 224 -> 120;
            case 225 -> 65;
            case 226 -> 107;
            case 227 -> 38;
            case 228 -> 224;
            case 229 -> 206;
            case 230 -> 86;
            case 231 -> 205;
            case 232 -> 168;
            case 233 -> 181;
            case 234 -> 127;
            case 235 -> 100;
            case 236 -> 99;
            case 237 -> 186;
            case 238 -> 241;
            case 239 -> 16;
            case 240 -> 171;
            case 241 -> 48;
            case 242 -> 31;
            case 243 -> 125;
            case 244 -> 49;
            case 245 -> 20;
            case 246 -> 238;
            case 247 -> 250;
            case 248 -> 132;
            case 249 -> 136;
            case 250 -> 5;
            case 251 -> 33;
            case 252 -> 74;
            case 253 -> 50;
            case 254 -> 215;
            default -> 115;
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
