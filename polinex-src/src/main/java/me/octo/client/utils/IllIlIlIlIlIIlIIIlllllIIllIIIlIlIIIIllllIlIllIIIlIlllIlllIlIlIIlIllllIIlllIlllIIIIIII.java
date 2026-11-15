package me.octo.client.utils;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII {
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<BlockPos> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<BlockPos> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private BlockPos IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private BlockPos IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private Vec3 IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   public IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
      @NotNull String var1,
      @NotNull List<? extends BlockPos> var2,
      @NotNull List<? extends BlockPos> var3,
      @NotNull IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var4
   ) {
      short var10001 = 4557;
      short var10002 = -9558;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 4558;
      var10002 = -31983;
      Intrinsics.checkNotNullParameter(var2, "entrancePositions");
      var10001 = 4559;
      var10002 = 30858;
      Intrinsics.checkNotNullParameter(var3, "veins");
      var10001 = 4556;
      var10002 = -16419;
      Intrinsics.checkNotNullParameter(var4, "veinType");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = ((List<BlockPos>)(Object)(var2));
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((List<BlockPos>)(Object)(var3));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final List<BlockPos> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<BlockPos> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Nullable
   public final BlockPos e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void a(@Nullable BlockPos var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   @Nullable
   public final BlockPos f() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void b(@Nullable BlockPos var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   @Nullable
   public final Vec3 g() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void a(@Nullable Vec3 var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = " æik\b8Ôe¢\u0097\u001f#ï";
      int var4 = " æik\b8Ôe¢\u0097\u001f#ï".length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 43;
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
                     case 0 -> 126;
                     case 1 -> 103;
                     case 2 -> 50;
                     case 3 -> 61;
                     case 4 -> 35;
                     case 5 -> 120;
                     default -> 85;
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

                  var2 = "OS\u0095L°\u0011Á!(t«S:\u008d\u0085º\u0018\u0089å}\b\u0018]";
                  var4 = "OS\u0095L°\u0011Á!(t«S:\u008d\u0085º\u0018\u0089å}\b\u0018]".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 4557) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 183;
            case 1 -> 22;
            case 2 -> 186;
            case 3 -> 71;
            case 4 -> 112;
            case 5 -> 20;
            case 6 -> 149;
            case 7 -> 100;
            case 8 -> 253;
            case 9 -> 168;
            case 10 -> 23;
            case 11 -> 225;
            case 12 -> 165;
            case 13 -> 177;
            case 14 -> 127;
            case 15 -> 93;
            case 16 -> 119;
            case 17 -> 4;
            case 18 -> 150;
            case 19 -> 173;
            case 20 -> 32;
            case 21 -> 170;
            case 22 -> 89;
            case 23 -> 56;
            case 24 -> 196;
            case 25 -> 138;
            case 26 -> 151;
            case 27 -> 221;
            case 28 -> 42;
            case 29 -> 190;
            case 30 -> 166;
            case 31 -> 36;
            case 32 -> 244;
            case 33 -> 76;
            case 34 -> 49;
            case 35 -> 53;
            case 36 -> 238;
            case 37 -> 153;
            case 38 -> 201;
            case 39 -> 57;
            case 40 -> 8;
            case 41 -> 26;
            case 42 -> 218;
            case 43 -> 136;
            case 44 -> 1;
            case 45 -> 228;
            case 46 -> 83;
            case 47 -> 254;
            case 48 -> 180;
            case 49 -> 61;
            case 50 -> 226;
            case 51 -> 47;
            case 52 -> 200;
            case 53 -> 41;
            case 54 -> 105;
            case 55 -> 37;
            case 56 -> 77;
            case 57 -> 210;
            case 58 -> 62;
            case 59 -> 129;
            case 60 -> 108;
            case 61 -> 59;
            case 62 -> 202;
            case 63 -> 107;
            case 64 -> 120;
            case 65 -> 103;
            case 66 -> 157;
            case 67 -> 92;
            case 68 -> 39;
            case 69 -> 209;
            case 70 -> 86;
            case 71 -> 78;
            case 72 -> 234;
            case 73 -> 246;
            case 74 -> 163;
            case 75 -> 235;
            case 76 -> 101;
            case 77 -> 0;
            case 78 -> 160;
            case 79 -> 248;
            case 80 -> 117;
            case 81 -> 5;
            case 82 -> 227;
            case 83 -> 243;
            case 84 -> 9;
            case 85 -> 7;
            case 86 -> 44;
            case 87 -> 240;
            case 88 -> 189;
            case 89 -> 174;
            case 90 -> 50;
            case 91 -> 216;
            case 92 -> 249;
            case 93 -> 212;
            case 94 -> 231;
            case 95 -> 87;
            case 96 -> 148;
            case 97 -> 46;
            case 98 -> 29;
            case 99 -> 176;
            case 100 -> 140;
            case 101 -> 58;
            case 102 -> 69;
            case 103 -> 245;
            case 104 -> 199;
            case 105 -> 251;
            case 106 -> 74;
            case 107 -> 81;
            case 108 -> 91;
            case 109 -> 194;
            case 110 -> 146;
            case 111 -> 141;
            case 112 -> 162;
            case 113 -> 155;
            case 114 -> 2;
            case 115 -> 6;
            case 116 -> 94;
            case 117 -> 90;
            case 118 -> 34;
            case 119 -> 145;
            case 120 -> 27;
            case 121 -> 205;
            case 122 -> 72;
            case 123 -> 115;
            case 124 -> 139;
            case 125 -> 125;
            case 126 -> 40;
            case 127 -> 224;
            case 128 -> 152;
            case 129 -> 24;
            case 130 -> 35;
            case 131 -> 60;
            case 132 -> 18;
            case 133 -> 133;
            case 134 -> 110;
            case 135 -> 104;
            case 136 -> 187;
            case 137 -> 242;
            case 138 -> 67;
            case 139 -> 233;
            case 140 -> 124;
            case 141 -> 3;
            case 142 -> 147;
            case 143 -> 161;
            case 144 -> 21;
            case 145 -> 19;
            case 146 -> 197;
            case 147 -> 237;
            case 148 -> 247;
            case 149 -> 68;
            case 150 -> 222;
            case 151 -> 188;
            case 152 -> 13;
            case 153 -> 213;
            case 154 -> 241;
            case 155 -> 159;
            case 156 -> 102;
            case 157 -> 192;
            case 158 -> 95;
            case 159 -> 99;
            case 160 -> 203;
            case 161 -> 96;
            case 162 -> 185;
            case 163 -> 80;
            case 164 -> 52;
            case 165 -> 64;
            case 166 -> 106;
            case 167 -> 45;
            case 168 -> 38;
            case 169 -> 229;
            case 170 -> 14;
            case 171 -> 215;
            case 172 -> 114;
            case 173 -> 73;
            case 174 -> 132;
            case 175 -> 236;
            case 176 -> 239;
            case 177 -> 31;
            case 178 -> 230;
            case 179 -> 30;
            case 180 -> 33;
            case 181 -> 121;
            case 182 -> 111;
            case 183 -> 181;
            case 184 -> 250;
            case 185 -> 126;
            case 186 -> 122;
            case 187 -> 65;
            case 188 -> 220;
            case 189 -> 128;
            case 190 -> 208;
            case 191 -> 232;
            case 192 -> 130;
            case 193 -> 55;
            case 194 -> 167;
            case 195 -> 79;
            case 196 -> 84;
            case 197 -> 184;
            case 198 -> 142;
            case 199 -> 252;
            case 200 -> 206;
            case 201 -> 198;
            case 202 -> 17;
            case 203 -> 137;
            case 204 -> 207;
            case 205 -> 66;
            case 206 -> 54;
            case 207 -> 179;
            case 208 -> 109;
            case 209 -> 191;
            case 210 -> 25;
            case 211 -> 204;
            case 212 -> 70;
            case 213 -> 178;
            case 214 -> 171;
            case 215 -> 113;
            case 216 -> 158;
            case 217 -> 43;
            case 218 -> 63;
            case 219 -> 143;
            case 220 -> 82;
            case 221 -> 131;
            case 222 -> 219;
            case 223 -> 28;
            case 224 -> 10;
            case 225 -> 116;
            case 226 -> 156;
            case 227 -> 211;
            case 228 -> 223;
            case 229 -> 217;
            case 230 -> 154;
            case 231 -> 48;
            case 232 -> 134;
            case 233 -> 164;
            case 234 -> 144;
            case 235 -> 169;
            case 236 -> 193;
            case 237 -> 182;
            case 238 -> 11;
            case 239 -> 135;
            case 240 -> 255;
            case 241 -> 85;
            case 242 -> 88;
            case 243 -> 12;
            case 244 -> 175;
            case 245 -> 15;
            case 246 -> 51;
            case 247 -> 118;
            case 248 -> 16;
            case 249 -> 172;
            case 250 -> 75;
            case 251 -> 97;
            case 252 -> 214;
            case 253 -> 98;
            case 254 -> 195;
            default -> 123;
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
