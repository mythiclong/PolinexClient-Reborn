package me.octo.client;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.PoseStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Camera;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4fc;
import org.joml.Vector3fc;

public final class lIllIIlIIIIIlllIllIlIIIlIIIlIIlIIlIIIIlIllIIIlIIlllIllIIlIlIlllIlIlllIlllIIIIlIIIIlII {
    public static <T> T b(Object... args) { return null; } // PX-FIX ovld-var
   private static String[] a;
   private static String[] b;

   public static final <T> T a(@NotNull Function1<? super PoseStack, ? extends T> var0) {
      short var10001 = -26974;
      short var10002 = -19914;
      Intrinsics.checkNotNullParameter(var0, "block");
      boolean var1 = false;
      PoseStack var2 = me.octo.client.utils.llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a();

      Object var3;
      try {
         var3 = var0.invoke(var2);
      } finally {
         InlineMarker.finallyStart(1);
         me.octo.client.utils.llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(var2);
         InlineMarker.finallyEnd(1);
      }

      return (T)var3;
   }

   public static final void a(@NotNull PoseStack var0, @NotNull Function1<? super PoseStack, Unit> var1) {
      short var10001 = -26971;
      short var10002 = -851;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = -26973;
      var10002 = 766;
      Intrinsics.checkNotNullParameter(var1, "block");
      boolean var2 = false;
      var0.pushPose();

      try {
         var1.invoke(var0);
      } finally {
         InlineMarker.finallyStart(1);
         var0.popPose();
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void a(@NotNull PoseStack var0, @NotNull Vec3i var1) {
      short var10001 = -26969;
      short var10002 = 23000;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = -26970;
      var10002 = 14603;
      Intrinsics.checkNotNullParameter(var1, "vec3i");
      boolean var2 = false;
      var0.translate((float)var1.getX(), (float)var1.getY(), (float)var1.getZ());
   }

   public static final void a(@NotNull PoseStack var0, @NotNull Vec3 var1) {
      short var10001 = -26971;
      short var10002 = -851;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      var10001 = -26972;
      var10002 = -21521;
      Intrinsics.checkNotNullParameter(var1, "vec3");
      boolean var2 = false;
      var0.translate(var1.x, var1.y, var1.z);
   }

   private static final void a(PoseStack var0, PoseStack var1) {
      lIIIllIlllllIIIllIllIlllIIIlIIIIIIIIlllllIIIlIIlllIlIIlIllIlIlIlIIIIIIIIlIIIlllIlIIlI.a(var0);
      var0.mulPose((Matrix4fc)var1.last().pose());
   }

   private static final boolean a(RenderPipeline var0) {
      return var0.getVertexFormatMode().connectedPrimitives;
   }

   private static final Vec3 a(lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var0, Camera var1) {
      return new Vec3(var0.i() - var1.position().x, var0.j() - var1.position().y, var0.k() - var1.position().z);
   }

   private static final Vec3 a(Position var0, Camera var1) {
      return new Vec3(var0.x() - var1.position().x, var0.y() - var1.position().y, var0.z() - var1.position().z);
   }

   private static final Vec3 a(Vec3i var0, Camera var1) {
      return new Vec3(var0.getX() - var1.position().x, var0.getY() - var1.position().y, var0.getZ() - var1.position().z);
   }

   private static final Vec3 a(Vector3fc var0, Camera var1) {
      return new Vec3(var0.x() - var1.position().x, var0.y() - var1.position().y, var0.z() - var1.position().z);
   }


   public static final Vec3 b(lllIlIIIIlllIlIIIIIIIllIIllIllIlllIIlIllIllIllIIlIlIlIIlllIlIIIllIIIlIlIIIIIIllllIIII var0, Camera var1) {
      return a(var0, var1);
   }

   public static final Vec3 b(Position var0, Camera var1) {
      return a(var0, var1);
   }

   public static final Vec3 b(Vec3i var0, Camera var1) {
      return a(var0, var1);
   }

   public static final boolean b(RenderPipeline var0) {
      return a(var0);
   }

   public static final void b(PoseStack var0, PoseStack var1) {
      a(var0, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "O÷\u0001\u0005\u009f\u009a\u0005úH¿\u009b8\u0006§M\u001cR<p\u0004>\u0092'À";
      int var4 = "O÷\u0001\u0005\u009f\u009a\u0005úH¿\u009b8\u0006§M\u001cR<p\u0004>\u0092'À".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 17;
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
                     case 0 -> 99;
                     case 1 -> 16;
                     case 2 -> 100;
                     case 3 -> 89;
                     case 4 -> 22;
                     case 5 -> 88;
                     default -> 59;
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
                     b = new String[6];
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

                  var2 = "»ÂQî6\u0005t\u008d¨\u0007\t";
                  var4 = "»ÂQî6\u0005t\u008d¨\u0007\t".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 42;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26969) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 209;
            case 1 -> 236;
            case 2 -> 174;
            case 3 -> 160;
            case 4 -> 206;
            case 5 -> 108;
            case 6 -> 1;
            case 7 -> 132;
            case 8 -> 185;
            case 9 -> 115;
            case 10 -> 37;
            case 11 -> 32;
            case 12 -> 76;
            case 13 -> 113;
            case 14 -> 173;
            case 15 -> 118;
            case 16 -> 251;
            case 17 -> 187;
            case 18 -> 131;
            case 19 -> 48;
            case 20 -> 248;
            case 21 -> 65;
            case 22 -> 220;
            case 23 -> 38;
            case 24 -> 109;
            case 25 -> 27;
            case 26 -> 98;
            case 27 -> 0;
            case 28 -> 75;
            case 29 -> 200;
            case 30 -> 228;
            case 31 -> 68;
            case 32 -> 233;
            case 33 -> 177;
            case 34 -> 227;
            case 35 -> 237;
            case 36 -> 42;
            case 37 -> 40;
            case 38 -> 49;
            case 39 -> 4;
            case 40 -> 10;
            case 41 -> 190;
            case 42 -> 103;
            case 43 -> 216;
            case 44 -> 254;
            case 45 -> 29;
            case 46 -> 3;
            case 47 -> 89;
            case 48 -> 52;
            case 49 -> 138;
            case 50 -> 85;
            case 51 -> 212;
            case 52 -> 184;
            case 53 -> 230;
            case 54 -> 253;
            case 55 -> 192;
            case 56 -> 145;
            case 57 -> 58;
            case 58 -> 133;
            case 59 -> 33;
            case 60 -> 104;
            case 61 -> 215;
            case 62 -> 12;
            case 63 -> 107;
            case 64 -> 152;
            case 65 -> 197;
            case 66 -> 201;
            case 67 -> 60;
            case 68 -> 139;
            case 69 -> 116;
            case 70 -> 134;
            case 71 -> 56;
            case 72 -> 189;
            case 73 -> 93;
            case 74 -> 242;
            case 75 -> 167;
            case 76 -> 181;
            case 77 -> 154;
            case 78 -> 95;
            case 79 -> 245;
            case 80 -> 54;
            case 81 -> 106;
            case 82 -> 140;
            case 83 -> 84;
            case 84 -> 205;
            case 85 -> 47;
            case 86 -> 50;
            case 87 -> 143;
            case 88 -> 17;
            case 89 -> 208;
            case 90 -> 88;
            case 91 -> 144;
            case 92 -> 165;
            case 93 -> 97;
            case 94 -> 158;
            case 95 -> 164;
            case 96 -> 117;
            case 97 -> 80;
            case 98 -> 34;
            case 99 -> 218;
            case 100 -> 241;
            case 101 -> 15;
            case 102 -> 123;
            case 103 -> 45;
            case 104 -> 86;
            case 105 -> 2;
            case 106 -> 8;
            case 107 -> 11;
            case 108 -> 155;
            case 109 -> 193;
            case 110 -> 188;
            case 111 -> 9;
            case 112 -> 202;
            case 113 -> 92;
            case 114 -> 142;
            case 115 -> 156;
            case 116 -> 199;
            case 117 -> 67;
            case 118 -> 122;
            case 119 -> 130;
            case 120 -> 136;
            case 121 -> 5;
            case 122 -> 210;
            case 123 -> 21;
            case 124 -> 51;
            case 125 -> 191;
            case 126 -> 161;
            case 127 -> 25;
            case 128 -> 82;
            case 129 -> 135;
            case 130 -> 214;
            case 131 -> 222;
            case 132 -> 71;
            case 133 -> 81;
            case 134 -> 96;
            case 135 -> 234;
            case 136 -> 13;
            case 137 -> 157;
            case 138 -> 20;
            case 139 -> 99;
            case 140 -> 26;
            case 141 -> 6;
            case 142 -> 43;
            case 143 -> 77;
            case 144 -> 171;
            case 145 -> 62;
            case 146 -> 168;
            case 147 -> 70;
            case 148 -> 217;
            case 149 -> 207;
            case 150 -> 16;
            case 151 -> 149;
            case 152 -> 225;
            case 153 -> 255;
            case 154 -> 147;
            case 155 -> 31;
            case 156 -> 91;
            case 157 -> 30;
            case 158 -> 112;
            case 159 -> 194;
            case 160 -> 146;
            case 161 -> 102;
            case 162 -> 114;
            case 163 -> 78;
            case 164 -> 44;
            case 165 -> 247;
            case 166 -> 94;
            case 167 -> 195;
            case 168 -> 252;
            case 169 -> 223;
            case 170 -> 59;
            case 171 -> 79;
            case 172 -> 72;
            case 173 -> 90;
            case 174 -> 100;
            case 175 -> 121;
            case 176 -> 243;
            case 177 -> 14;
            case 178 -> 235;
            case 179 -> 23;
            case 180 -> 203;
            case 181 -> 119;
            case 182 -> 162;
            case 183 -> 7;
            case 184 -> 63;
            case 185 -> 19;
            case 186 -> 148;
            case 187 -> 22;
            case 188 -> 28;
            case 189 -> 211;
            case 190 -> 226;
            case 191 -> 153;
            case 192 -> 137;
            case 193 -> 232;
            case 194 -> 238;
            case 195 -> 159;
            case 196 -> 74;
            case 197 -> 169;
            case 198 -> 183;
            case 199 -> 129;
            case 200 -> 127;
            case 201 -> 166;
            case 202 -> 213;
            case 203 -> 182;
            case 204 -> 150;
            case 205 -> 246;
            case 206 -> 64;
            case 207 -> 57;
            case 208 -> 39;
            case 209 -> 239;
            case 210 -> 18;
            case 211 -> 125;
            case 212 -> 224;
            case 213 -> 196;
            case 214 -> 55;
            case 215 -> 24;
            case 216 -> 120;
            case 217 -> 69;
            case 218 -> 151;
            case 219 -> 172;
            case 220 -> 198;
            case 221 -> 101;
            case 222 -> 229;
            case 223 -> 111;
            case 224 -> 124;
            case 225 -> 128;
            case 226 -> 178;
            case 227 -> 73;
            case 228 -> 176;
            case 229 -> 240;
            case 230 -> 46;
            case 231 -> 66;
            case 232 -> 249;
            case 233 -> 141;
            case 234 -> 87;
            case 235 -> 170;
            case 236 -> 231;
            case 237 -> 35;
            case 238 -> 204;
            case 239 -> 61;
            case 240 -> 83;
            case 241 -> 175;
            case 242 -> 110;
            case 243 -> 180;
            case 244 -> 221;
            case 245 -> 41;
            case 246 -> 179;
            case 247 -> 126;
            case 248 -> 219;
            case 249 -> 105;
            case 250 -> 36;
            case 251 -> 186;
            case 252 -> 244;
            case 253 -> 53;
            case 254 -> 250;
            default -> 163;
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
