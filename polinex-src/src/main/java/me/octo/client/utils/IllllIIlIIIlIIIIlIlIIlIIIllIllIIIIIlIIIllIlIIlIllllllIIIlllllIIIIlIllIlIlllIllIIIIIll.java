package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll {
   @NotNull
   private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(@NotNull BlockPos var1, @NotNull Vec3 var2) {
      short var10001 = -19956;
      short var10002 = 24790;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = -19954;
      var10002 = 951;
      Intrinsics.checkNotNullParameter(var2, "lookPos");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final BlockPos a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Vec3 b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final BlockPos c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Vec3 d() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll a(@NotNull BlockPos var1, @NotNull Vec3 var2) {
      short var10001 = -19955;
      short var10002 = -25769;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = -19959;
      var10002 = -23825;
      Intrinsics.checkNotNullParameter(var2, "lookPos");
      return new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = -19960;
      short var10003 = -513;
      var10003 = -19953;
      short var10004 = -25722;
      return "LocalEmissary(pos="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", lookPos="
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      int[] var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll)) {
            return false;
         }

         var10000 = var1;
      }

      IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var3 = (IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll)var10000;
      boolean var4 = Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u009d\u0011V\u0003÷±\u001b\u0007\u0097]\u0094,ÃÓò\ne\u008f\u0081Ô=LÖ\u0011=u";
      int var4 = "\u009d\u0011V\u0003÷±\u001b\u0007\u0097]\u0094,ÃÓò\ne\u008f\u0081Ô=LÖ\u0011=u".length();
      char var1 = 3;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 123;
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
                     case 0 -> 69;
                     case 1 -> 88;
                     case 2 -> 84;
                     case 3 -> 113;
                     case 4 -> 29;
                     case 5 -> 5;
                     default -> 20;
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

                  var2 = "\u000e6¼xD\u000b\u0094'Ü\bºÞo_\tT÷h\u0007\u0084'ÅPÚoâ";
                  var4 = "\u000e6¼xD\u000b\u0094'Ü\bºÞo_\tT÷h\u0007\u0084'ÅPÚoâ".length();
                  var1 = 18;
                  var8 = -1;
            }

            var10000 = 106;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19956) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 28;
            case 1 -> 71;
            case 2 -> 61;
            case 3 -> 145;
            case 4 -> 112;
            case 5 -> 11;
            case 6 -> 68;
            case 7 -> 59;
            case 8 -> 143;
            case 9 -> 86;
            case 10 -> 194;
            case 11 -> 107;
            case 12 -> 217;
            case 13 -> 9;
            case 14 -> 122;
            case 15 -> 44;
            case 16 -> 211;
            case 17 -> 26;
            case 18 -> 63;
            case 19 -> 245;
            case 20 -> 114;
            case 21 -> 108;
            case 22 -> 5;
            case 23 -> 53;
            case 24 -> 113;
            case 25 -> 135;
            case 26 -> 168;
            case 27 -> 76;
            case 28 -> 230;
            case 29 -> 141;
            case 30 -> 25;
            case 31 -> 237;
            case 32 -> 52;
            case 33 -> 146;
            case 34 -> 181;
            case 35 -> 205;
            case 36 -> 2;
            case 37 -> 58;
            case 38 -> 183;
            case 39 -> 229;
            case 40 -> 204;
            case 41 -> 188;
            case 42 -> 222;
            case 43 -> 134;
            case 44 -> 29;
            case 45 -> 233;
            case 46 -> 75;
            case 47 -> 186;
            case 48 -> 95;
            case 49 -> 160;
            case 50 -> 105;
            case 51 -> 255;
            case 52 -> 249;
            case 53 -> 132;
            case 54 -> 101;
            case 55 -> 149;
            case 56 -> 13;
            case 57 -> 226;
            case 58 -> 250;
            case 59 -> 252;
            case 60 -> 137;
            case 61 -> 78;
            case 62 -> 210;
            case 63 -> 142;
            case 64 -> 182;
            case 65 -> 121;
            case 66 -> 164;
            case 67 -> 232;
            case 68 -> 47;
            case 69 -> 246;
            case 70 -> 92;
            case 71 -> 46;
            case 72 -> 23;
            case 73 -> 48;
            case 74 -> 103;
            case 75 -> 35;
            case 76 -> 156;
            case 77 -> 169;
            case 78 -> 115;
            case 79 -> 89;
            case 80 -> 180;
            case 81 -> 16;
            case 82 -> 129;
            case 83 -> 174;
            case 84 -> 126;
            case 85 -> 219;
            case 86 -> 133;
            case 87 -> 234;
            case 88 -> 225;
            case 89 -> 30;
            case 90 -> 215;
            case 91 -> 15;
            case 92 -> 60;
            case 93 -> 91;
            case 94 -> 195;
            case 95 -> 150;
            case 96 -> 96;
            case 97 -> 193;
            case 98 -> 33;
            case 99 -> 136;
            case 100 -> 196;
            case 101 -> 248;
            case 102 -> 67;
            case 103 -> 218;
            case 104 -> 147;
            case 105 -> 172;
            case 106 -> 43;
            case 107 -> 90;
            case 108 -> 161;
            case 109 -> 202;
            case 110 -> 153;
            case 111 -> 206;
            case 112 -> 167;
            case 113 -> 10;
            case 114 -> 41;
            case 115 -> 231;
            case 116 -> 227;
            case 117 -> 178;
            case 118 -> 69;
            case 119 -> 74;
            case 120 -> 151;
            case 121 -> 49;
            case 122 -> 224;
            case 123 -> 106;
            case 124 -> 72;
            case 125 -> 159;
            case 126 -> 184;
            case 127 -> 32;
            case 128 -> 228;
            case 129 -> 80;
            case 130 -> 55;
            case 131 -> 99;
            case 132 -> 65;
            case 133 -> 34;
            case 134 -> 199;
            case 135 -> 77;
            case 136 -> 66;
            case 137 -> 79;
            case 138 -> 176;
            case 139 -> 4;
            case 140 -> 7;
            case 141 -> 81;
            case 142 -> 37;
            case 143 -> 203;
            case 144 -> 93;
            case 145 -> 139;
            case 146 -> 22;
            case 147 -> 140;
            case 148 -> 154;
            case 149 -> 17;
            case 150 -> 18;
            case 151 -> 214;
            case 152 -> 12;
            case 153 -> 175;
            case 154 -> 208;
            case 155 -> 87;
            case 156 -> 31;
            case 157 -> 220;
            case 158 -> 120;
            case 159 -> 163;
            case 160 -> 82;
            case 161 -> 238;
            case 162 -> 247;
            case 163 -> 3;
            case 164 -> 21;
            case 165 -> 38;
            case 166 -> 54;
            case 167 -> 162;
            case 168 -> 85;
            case 169 -> 242;
            case 170 -> 251;
            case 171 -> 40;
            case 172 -> 198;
            case 173 -> 45;
            case 174 -> 254;
            case 175 -> 216;
            case 176 -> 117;
            case 177 -> 209;
            case 178 -> 179;
            case 179 -> 189;
            case 180 -> 20;
            case 181 -> 24;
            case 182 -> 155;
            case 183 -> 27;
            case 184 -> 236;
            case 185 -> 166;
            case 186 -> 104;
            case 187 -> 165;
            case 188 -> 223;
            case 189 -> 62;
            case 190 -> 138;
            case 191 -> 124;
            case 192 -> 173;
            case 193 -> 244;
            case 194 -> 185;
            case 195 -> 14;
            case 196 -> 98;
            case 197 -> 64;
            case 198 -> 200;
            case 199 -> 39;
            case 200 -> 127;
            case 201 -> 158;
            case 202 -> 70;
            case 203 -> 83;
            case 204 -> 152;
            case 205 -> 19;
            case 206 -> 192;
            case 207 -> 144;
            case 208 -> 0;
            case 209 -> 128;
            case 210 -> 191;
            case 211 -> 243;
            case 212 -> 197;
            case 213 -> 240;
            case 214 -> 239;
            case 215 -> 170;
            case 216 -> 51;
            case 217 -> 157;
            case 218 -> 221;
            case 219 -> 50;
            case 220 -> 6;
            case 221 -> 8;
            case 222 -> 57;
            case 223 -> 1;
            case 224 -> 241;
            case 225 -> 148;
            case 226 -> 102;
            case 227 -> 42;
            case 228 -> 97;
            case 229 -> 56;
            case 230 -> 177;
            case 231 -> 201;
            case 232 -> 130;
            case 233 -> 125;
            case 234 -> 190;
            case 235 -> 94;
            case 236 -> 110;
            case 237 -> 213;
            case 238 -> 84;
            case 239 -> 118;
            case 240 -> 187;
            case 241 -> 119;
            case 242 -> 88;
            case 243 -> 131;
            case 244 -> 207;
            case 245 -> 253;
            case 246 -> 109;
            case 247 -> 171;
            case 248 -> 100;
            case 249 -> 123;
            case 250 -> 36;
            case 251 -> 212;
            case 252 -> 73;
            case 253 -> 111;
            case 254 -> 116;
            default -> 235;
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
  public static me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll a(me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll p0, net.minecraft.core.BlockPos p1, net.minecraft.world.phys.Vec3 p2, int p3, java.lang.Object p4) {
      int[] pxmask = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      if ((pxmask != null) || (p3 & 1) != 0) { p1 = (p0).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((p3 & 2) != 0) { p2 = (p0).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return p0.a(p1, p2);
   }
}
