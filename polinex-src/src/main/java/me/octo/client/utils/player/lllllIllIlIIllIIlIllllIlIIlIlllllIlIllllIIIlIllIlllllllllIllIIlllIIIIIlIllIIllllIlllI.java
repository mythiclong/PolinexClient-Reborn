package me.octo.client.utils.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI {
   private float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(float var1, float var2) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   public final float a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final void a(float var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final float b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void b(float var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final Vec3 c() {
      Vec3 var10000 = Vec3.directionFromRotation(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      short var10002 = 14326;
      short var10003 = 23983;
      Intrinsics.checkNotNullExpressionValue(var10000, "directionFromRotation(...)");
      return var10000;
   }

   @NotNull
   public final Vec3 d() {
      Vec3 var10000 = Vec3.directionFromRotation(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + 90.0F
      );
      short var10002 = 14327;
      short var10003 = -13656;
      Intrinsics.checkNotNullExpressionValue(var10000, "directionFromRotation(...)");
      return var10000;
   }

   @NotNull
   public final Vec3 e() {
      Vec3 var10000 = Vec3.directionFromRotation(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl - 90.0F
      );
      short var10002 = 14326;
      short var10003 = 23983;
      Intrinsics.checkNotNullExpressionValue(var10000, "directionFromRotation(...)");
      return var10000;
   }

   public final float f() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final float g() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(float var1, float var2) {
      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = 14324;
      short var10003 = 21757;
      var10003 = 14325;
      short var10004 = -22468;
      return "Rotation(yaw="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", pitch="
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      return var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = h();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI)) {
            return false;
         }

         var10000 = var1;
      }

      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var3 = (lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI)var10000;
      int var4 = Float.compare(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      if (var2 != null) {
         if (var4 != 0) {
            return false;
         }

         var4 = Float.compare(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      if (var2 != null) {
         if (var4 != 0) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   public static void b(String var0) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0;
   }

   public static String h() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      b("iKJDbc");
      String var2 = "F\u0018\u0098\u007fî±Ã¦\rÓa\u009fþ\u008a\u0082HØ¥HÉß0";
      int var4 = "F\u0018\u0098\u007fî±Ã¦\rÓa\u009fþ\u008a\u0082HØ¥HÉß0".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 114;
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
                     case 0 -> 30;
                     case 1 -> 56;
                     case 2 -> 118;
                     case 3 -> 10;
                     case 4 -> 5;
                     case 5 -> 4;
                     default -> 16;
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
                     b = new String[4];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "- 4\u0096¬\u0094ý'\u0011+@ñ¢àÛô\u0093£#\u001a@É\u00011V\u0091\u001a*·Ôd°Ê~ìaRNÞc\u0005ãH\u00944Ãè\\\u0097\u0082ú&è";
                  var4 = "- 4\u0096¬\u0094ý'\u0011+@ñ¢àÛô\u0093£#\u001a@É\u00011V\u0091\u001a*·Ôd°Ê~ìaRNÞc\u0005ãH\u00944Ãè\\\u0097\u0082ú&è".length();
                  var1 = 26;
                  var8 = -1;
            }

            var10000 = 29;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14325) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 69;
            case 1 -> 171;
            case 2 -> 203;
            case 3 -> 146;
            case 4 -> 74;
            case 5 -> 28;
            case 6 -> 242;
            case 7 -> 138;
            case 8 -> 100;
            case 9 -> 12;
            case 10 -> 109;
            case 11 -> 190;
            case 12 -> 124;
            case 13 -> 105;
            case 14 -> 23;
            case 15 -> 243;
            case 16 -> 36;
            case 17 -> 8;
            case 18 -> 163;
            case 19 -> 7;
            case 20 -> 232;
            case 21 -> 164;
            case 22 -> 245;
            case 23 -> 31;
            case 24 -> 215;
            case 25 -> 33;
            case 26 -> 114;
            case 27 -> 192;
            case 28 -> 224;
            case 29 -> 130;
            case 30 -> 99;
            case 31 -> 157;
            case 32 -> 218;
            case 33 -> 101;
            case 34 -> 134;
            case 35 -> 62;
            case 36 -> 104;
            case 37 -> 45;
            case 38 -> 237;
            case 39 -> 91;
            case 40 -> 127;
            case 41 -> 98;
            case 42 -> 54;
            case 43 -> 64;
            case 44 -> 174;
            case 45 -> 231;
            case 46 -> 94;
            case 47 -> 175;
            case 48 -> 230;
            case 49 -> 61;
            case 50 -> 78;
            case 51 -> 83;
            case 52 -> 68;
            case 53 -> 47;
            case 54 -> 137;
            case 55 -> 11;
            case 56 -> 228;
            case 57 -> 156;
            case 58 -> 70;
            case 59 -> 229;
            case 60 -> 252;
            case 61 -> 248;
            case 62 -> 179;
            case 63 -> 216;
            case 64 -> 0;
            case 65 -> 88;
            case 66 -> 236;
            case 67 -> 199;
            case 68 -> 219;
            case 69 -> 20;
            case 70 -> 208;
            case 71 -> 186;
            case 72 -> 73;
            case 73 -> 144;
            case 74 -> 212;
            case 75 -> 220;
            case 76 -> 5;
            case 77 -> 96;
            case 78 -> 214;
            case 79 -> 241;
            case 80 -> 249;
            case 81 -> 150;
            case 82 -> 120;
            case 83 -> 60;
            case 84 -> 38;
            case 85 -> 254;
            case 86 -> 107;
            case 87 -> 125;
            case 88 -> 225;
            case 89 -> 251;
            case 90 -> 151;
            case 91 -> 240;
            case 92 -> 108;
            case 93 -> 211;
            case 94 -> 238;
            case 95 -> 227;
            case 96 -> 153;
            case 97 -> 25;
            case 98 -> 86;
            case 99 -> 3;
            case 100 -> 143;
            case 101 -> 166;
            case 102 -> 158;
            case 103 -> 193;
            case 104 -> 51;
            case 105 -> 209;
            case 106 -> 187;
            case 107 -> 30;
            case 108 -> 32;
            case 109 -> 198;
            case 110 -> 111;
            case 111 -> 80;
            case 112 -> 46;
            case 113 -> 246;
            case 114 -> 35;
            case 115 -> 29;
            case 116 -> 102;
            case 117 -> 76;
            case 118 -> 118;
            case 119 -> 195;
            case 120 -> 52;
            case 121 -> 121;
            case 122 -> 206;
            case 123 -> 196;
            case 124 -> 126;
            case 125 -> 128;
            case 126 -> 103;
            case 127 -> 122;
            case 128 -> 213;
            case 129 -> 184;
            case 130 -> 205;
            case 131 -> 116;
            case 132 -> 189;
            case 133 -> 168;
            case 134 -> 90;
            case 135 -> 49;
            case 136 -> 37;
            case 137 -> 44;
            case 138 -> 79;
            case 139 -> 50;
            case 140 -> 161;
            case 141 -> 4;
            case 142 -> 17;
            case 143 -> 221;
            case 144 -> 177;
            case 145 -> 139;
            case 146 -> 188;
            case 147 -> 149;
            case 148 -> 182;
            case 149 -> 159;
            case 150 -> 77;
            case 151 -> 72;
            case 152 -> 223;
            case 153 -> 253;
            case 154 -> 53;
            case 155 -> 180;
            case 156 -> 135;
            case 157 -> 41;
            case 158 -> 239;
            case 159 -> 84;
            case 160 -> 131;
            case 161 -> 57;
            case 162 -> 15;
            case 163 -> 132;
            case 164 -> 85;
            case 165 -> 65;
            case 166 -> 10;
            case 167 -> 247;
            case 168 -> 133;
            case 169 -> 129;
            case 170 -> 24;
            case 171 -> 89;
            case 172 -> 82;
            case 173 -> 19;
            case 174 -> 250;
            case 175 -> 234;
            case 176 -> 217;
            case 177 -> 185;
            case 178 -> 176;
            case 179 -> 14;
            case 180 -> 63;
            case 181 -> 81;
            case 182 -> 87;
            case 183 -> 136;
            case 184 -> 6;
            case 185 -> 106;
            case 186 -> 162;
            case 187 -> 75;
            case 188 -> 233;
            case 189 -> 2;
            case 190 -> 210;
            case 191 -> 16;
            case 192 -> 66;
            case 193 -> 43;
            case 194 -> 255;
            case 195 -> 152;
            case 196 -> 160;
            case 197 -> 56;
            case 198 -> 200;
            case 199 -> 22;
            case 200 -> 197;
            case 201 -> 95;
            case 202 -> 173;
            case 203 -> 27;
            case 204 -> 207;
            case 205 -> 39;
            case 206 -> 18;
            case 207 -> 141;
            case 208 -> 202;
            case 209 -> 55;
            case 210 -> 181;
            case 211 -> 148;
            case 212 -> 67;
            case 213 -> 117;
            case 214 -> 142;
            case 215 -> 170;
            case 216 -> 92;
            case 217 -> 226;
            case 218 -> 123;
            case 219 -> 140;
            case 220 -> 167;
            case 221 -> 115;
            case 222 -> 154;
            case 223 -> 204;
            case 224 -> 194;
            case 225 -> 235;
            case 226 -> 42;
            case 227 -> 1;
            case 228 -> 97;
            case 229 -> 9;
            case 230 -> 155;
            case 231 -> 165;
            case 232 -> 112;
            case 233 -> 21;
            case 234 -> 13;
            case 235 -> 145;
            case 236 -> 178;
            case 237 -> 244;
            case 238 -> 59;
            case 239 -> 34;
            case 240 -> 222;
            case 241 -> 172;
            case 242 -> 110;
            case 243 -> 71;
            case 244 -> 48;
            case 245 -> 113;
            case 246 -> 169;
            case 247 -> 201;
            case 248 -> 58;
            case 249 -> 191;
            case 250 -> 93;
            case 251 -> 147;
            case 252 -> 183;
            case 253 -> 26;
            case 254 -> 40;
            default -> 119;
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
  public static me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI p0, float p1, float p2, int p3, java.lang.Object p4) {
      java.lang.String pxmask = h();
      if ((pxmask != null) || (p3 & 1) != 0) { p1 = (p0).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((p3 & 2) != 0) { p2 = (p0).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return p0.a(p1, p2);
   }
}
