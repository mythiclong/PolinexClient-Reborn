package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII {
   @NotNull
   private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII(
      @NotNull Vec3 var1, @NotNull IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var2
   ) {
      short var10001 = 21404;
      short var10002 = 31756;
      Intrinsics.checkNotNullParameter(var1, "point");
      var10001 = 21400;
      var10002 = -10957;
      Intrinsics.checkNotNullParameter(var2, "block");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final Vec3 a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Vec3 c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII d() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII a(
      @NotNull Vec3 var1, @NotNull IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII var2
   ) {
      short var10001 = 21406;
      short var10002 = -11902;
      Intrinsics.checkNotNullParameter(var1, "point");
      var10001 = 21407;
      var10002 = -20780;
      Intrinsics.checkNotNullParameter(var2, "block");
      return new llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = 21401;
      short var10003 = -6259;
      var10003 = 21405;
      short var10004 = -19564;
      return "ForagingTarget(point="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", block="
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
      int[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII)) {
            return false;
         }

         var10000 = var1;
      }

      llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII var3 = (llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII)var10000;
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
      String var2 = "»Ò h¤ÝÇ\u0096\u0005@©\u0083£¡\u0005F4\u0015~ª\u0005~VD\\Y";
      int var4 = "»Ò h¤ÝÇ\u0096\u0005@©\u0083£¡\u0005F4\u0015~ª\u0005~VD\\Y".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 6;
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
                     case 0 -> 19;
                     case 1 -> 85;
                     case 2 -> 56;
                     case 3 -> 22;
                     case 4 -> 32;
                     case 5 -> 86;
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

                  var2 = "j¿l/vÒÐ'0Ó\u0091ðx\u001a°\u0014\u0089®}öÊ\u0005$Ê\u0018àJ";
                  var4 = "j¿l/vÒÐ'0Ó\u0091ðx\u001a°\u0014\u0089®}öÊ\u0005$Ê\u0018àJ".length();
                  var1 = 21;
                  var8 = -1;
            }

            var10000 = 78;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 21405) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 243;
            case 1 -> 191;
            case 2 -> 117;
            case 3 -> 212;
            case 4 -> 112;
            case 5 -> 133;
            case 6 -> 84;
            case 7 -> 121;
            case 8 -> 188;
            case 9 -> 208;
            case 10 -> 75;
            case 11 -> 213;
            case 12 -> 146;
            case 13 -> 225;
            case 14 -> 154;
            case 15 -> 19;
            case 16 -> 254;
            case 17 -> 203;
            case 18 -> 48;
            case 19 -> 69;
            case 20 -> 89;
            case 21 -> 252;
            case 22 -> 78;
            case 23 -> 3;
            case 24 -> 180;
            case 25 -> 66;
            case 26 -> 128;
            case 27 -> 29;
            case 28 -> 99;
            case 29 -> 21;
            case 30 -> 35;
            case 31 -> 168;
            case 32 -> 108;
            case 33 -> 195;
            case 34 -> 193;
            case 35 -> 207;
            case 36 -> 39;
            case 37 -> 92;
            case 38 -> 76;
            case 39 -> 83;
            case 40 -> 233;
            case 41 -> 184;
            case 42 -> 85;
            case 43 -> 240;
            case 44 -> 140;
            case 45 -> 32;
            case 46 -> 185;
            case 47 -> 42;
            case 48 -> 223;
            case 49 -> 25;
            case 50 -> 210;
            case 51 -> 201;
            case 52 -> 158;
            case 53 -> 229;
            case 54 -> 1;
            case 55 -> 28;
            case 56 -> 72;
            case 57 -> 220;
            case 58 -> 95;
            case 59 -> 56;
            case 60 -> 238;
            case 61 -> 164;
            case 62 -> 68;
            case 63 -> 228;
            case 64 -> 176;
            case 65 -> 171;
            case 66 -> 46;
            case 67 -> 26;
            case 68 -> 67;
            case 69 -> 173;
            case 70 -> 118;
            case 71 -> 175;
            case 72 -> 65;
            case 73 -> 87;
            case 74 -> 248;
            case 75 -> 125;
            case 76 -> 54;
            case 77 -> 162;
            case 78 -> 247;
            case 79 -> 59;
            case 80 -> 126;
            case 81 -> 74;
            case 82 -> 144;
            case 83 -> 163;
            case 84 -> 155;
            case 85 -> 231;
            case 86 -> 4;
            case 87 -> 251;
            case 88 -> 77;
            case 89 -> 5;
            case 90 -> 16;
            case 91 -> 241;
            case 92 -> 187;
            case 93 -> 116;
            case 94 -> 236;
            case 95 -> 122;
            case 96 -> 181;
            case 97 -> 134;
            case 98 -> 129;
            case 99 -> 235;
            case 100 -> 157;
            case 101 -> 15;
            case 102 -> 64;
            case 103 -> 224;
            case 104 -> 192;
            case 105 -> 120;
            case 106 -> 90;
            case 107 -> 103;
            case 108 -> 93;
            case 109 -> 234;
            case 110 -> 27;
            case 111 -> 8;
            case 112 -> 151;
            case 113 -> 226;
            case 114 -> 137;
            case 115 -> 102;
            case 116 -> 131;
            case 117 -> 86;
            case 118 -> 150;
            case 119 -> 53;
            case 120 -> 12;
            case 121 -> 24;
            case 122 -> 205;
            case 123 -> 41;
            case 124 -> 199;
            case 125 -> 40;
            case 126 -> 107;
            case 127 -> 33;
            case 128 -> 31;
            case 129 -> 11;
            case 130 -> 115;
            case 131 -> 189;
            case 132 -> 178;
            case 133 -> 152;
            case 134 -> 9;
            case 135 -> 110;
            case 136 -> 30;
            case 137 -> 44;
            case 138 -> 148;
            case 139 -> 119;
            case 140 -> 232;
            case 141 -> 190;
            case 142 -> 81;
            case 143 -> 250;
            case 144 -> 73;
            case 145 -> 100;
            case 146 -> 6;
            case 147 -> 49;
            case 148 -> 127;
            case 149 -> 97;
            case 150 -> 141;
            case 151 -> 219;
            case 152 -> 34;
            case 153 -> 217;
            case 154 -> 79;
            case 155 -> 196;
            case 156 -> 135;
            case 157 -> 17;
            case 158 -> 214;
            case 159 -> 166;
            case 160 -> 138;
            case 161 -> 186;
            case 162 -> 2;
            case 163 -> 170;
            case 164 -> 70;
            case 165 -> 183;
            case 166 -> 105;
            case 167 -> 55;
            case 168 -> 202;
            case 169 -> 124;
            case 170 -> 165;
            case 171 -> 22;
            case 172 -> 63;
            case 173 -> 62;
            case 174 -> 18;
            case 175 -> 139;
            case 176 -> 172;
            case 177 -> 113;
            case 178 -> 149;
            case 179 -> 230;
            case 180 -> 106;
            case 181 -> 98;
            case 182 -> 101;
            case 183 -> 249;
            case 184 -> 237;
            case 185 -> 209;
            case 186 -> 159;
            case 187 -> 50;
            case 188 -> 23;
            case 189 -> 52;
            case 190 -> 177;
            case 191 -> 239;
            case 192 -> 167;
            case 193 -> 161;
            case 194 -> 169;
            case 195 -> 145;
            case 196 -> 143;
            case 197 -> 245;
            case 198 -> 156;
            case 199 -> 96;
            case 200 -> 38;
            case 201 -> 109;
            case 202 -> 111;
            case 203 -> 222;
            case 204 -> 71;
            case 205 -> 244;
            case 206 -> 123;
            case 207 -> 58;
            case 208 -> 174;
            case 209 -> 227;
            case 210 -> 13;
            case 211 -> 61;
            case 212 -> 37;
            case 213 -> 206;
            case 214 -> 0;
            case 215 -> 197;
            case 216 -> 194;
            case 217 -> 198;
            case 218 -> 130;
            case 219 -> 160;
            case 220 -> 104;
            case 221 -> 132;
            case 222 -> 80;
            case 223 -> 218;
            case 224 -> 91;
            case 225 -> 153;
            case 226 -> 242;
            case 227 -> 47;
            case 228 -> 36;
            case 229 -> 179;
            case 230 -> 221;
            case 231 -> 88;
            case 232 -> 142;
            case 233 -> 246;
            case 234 -> 7;
            case 235 -> 253;
            case 236 -> 60;
            case 237 -> 216;
            case 238 -> 10;
            case 239 -> 20;
            case 240 -> 255;
            case 241 -> 211;
            case 242 -> 14;
            case 243 -> 215;
            case 244 -> 204;
            case 245 -> 43;
            case 246 -> 200;
            case 247 -> 136;
            case 248 -> 51;
            case 249 -> 182;
            case 250 -> 57;
            case 251 -> 147;
            case 252 -> 114;
            case 253 -> 82;
            case 254 -> 94;
            default -> 45;
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
  public static me.octo.client.utils.llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII a(me.octo.client.utils.llIIlllllIllIIIlIlIlIlIllllIlIIIllIIIIlIIIllIllIIllIIIlIIlIlIIllllllllIIIIIIllllIlIII p0, net.minecraft.world.phys.Vec3 p1, me.octo.client.utils.IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII p2, int p3, java.lang.Object p4) {
      int[] pxmask = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d();
      if ((pxmask != null) || (p3 & 1) != 0) { p1 = (p0).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((p3 & 2) != 0) { p2 = (p0).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return p0.a(p1, p2);
   }
}
