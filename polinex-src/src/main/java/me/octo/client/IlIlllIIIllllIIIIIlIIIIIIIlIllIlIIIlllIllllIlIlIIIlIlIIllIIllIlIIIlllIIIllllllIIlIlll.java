package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll {
   @NotNull
   private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
      @NotNull BlockPos var1, @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2
   ) {
      short var10001 = -2494;
      short var10002 = 4250;
      Intrinsics.checkNotNullParameter(var1, "pos");
      var10001 = -2493;
      var10002 = 27733;
      Intrinsics.checkNotNullParameter(var2, "type");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final BlockPos a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Vec3 c() {
      return me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }

   @NotNull
   public final Vec3 d() {
      return me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0096`¢\u0004¡\"Ã\u0094";
      int var4 = "\u0096`¢\u0004¡\"Ã\u0094".length();
      char var1 = 3;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 14;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 14;
               var10006 = var6;
            } else {
               var13 = 14;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 14;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 36;
                  case 1 -> 67;
                  case 2 -> 54;
                  case 3 -> 68;
                  case 4 -> 30;
                  case 5 -> 55;
                  default -> 112;
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
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2494) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 52;
            case 1 -> 196;
            case 2 -> 28;
            case 3 -> 68;
            case 4 -> 135;
            case 5 -> 85;
            case 6 -> 226;
            case 7 -> 173;
            case 8 -> 136;
            case 9 -> 220;
            case 10 -> 203;
            case 11 -> 33;
            case 12 -> 201;
            case 13 -> 157;
            case 14 -> 171;
            case 15 -> 217;
            case 16 -> 249;
            case 17 -> 165;
            case 18 -> 189;
            case 19 -> 213;
            case 20 -> 236;
            case 21 -> 51;
            case 22 -> 109;
            case 23 -> 154;
            case 24 -> 138;
            case 25 -> 40;
            case 26 -> 38;
            case 27 -> 22;
            case 28 -> 139;
            case 29 -> 151;
            case 30 -> 192;
            case 31 -> 57;
            case 32 -> 187;
            case 33 -> 3;
            case 34 -> 188;
            case 35 -> 254;
            case 36 -> 35;
            case 37 -> 216;
            case 38 -> 122;
            case 39 -> 72;
            case 40 -> 233;
            case 41 -> 202;
            case 42 -> 70;
            case 43 -> 119;
            case 44 -> 98;
            case 45 -> 126;
            case 46 -> 235;
            case 47 -> 5;
            case 48 -> 48;
            case 49 -> 44;
            case 50 -> 228;
            case 51 -> 30;
            case 52 -> 74;
            case 53 -> 186;
            case 54 -> 238;
            case 55 -> 41;
            case 56 -> 128;
            case 57 -> 147;
            case 58 -> 6;
            case 59 -> 12;
            case 60 -> 156;
            case 61 -> 153;
            case 62 -> 150;
            case 63 -> 251;
            case 64 -> 13;
            case 65 -> 29;
            case 66 -> 69;
            case 67 -> 63;
            case 68 -> 27;
            case 69 -> 163;
            case 70 -> 96;
            case 71 -> 112;
            case 72 -> 244;
            case 73 -> 231;
            case 74 -> 178;
            case 75 -> 56;
            case 76 -> 14;
            case 77 -> 24;
            case 78 -> 207;
            case 79 -> 177;
            case 80 -> 64;
            case 81 -> 247;
            case 82 -> 31;
            case 83 -> 255;
            case 84 -> 209;
            case 85 -> 134;
            case 86 -> 131;
            case 87 -> 175;
            case 88 -> 20;
            case 89 -> 15;
            case 90 -> 116;
            case 91 -> 78;
            case 92 -> 211;
            case 93 -> 190;
            case 94 -> 53;
            case 95 -> 83;
            case 96 -> 73;
            case 97 -> 21;
            case 98 -> 92;
            case 99 -> 155;
            case 100 -> 123;
            case 101 -> 191;
            case 102 -> 80;
            case 103 -> 11;
            case 104 -> 1;
            case 105 -> 143;
            case 106 -> 170;
            case 107 -> 225;
            case 108 -> 234;
            case 109 -> 117;
            case 110 -> 95;
            case 111 -> 61;
            case 112 -> 183;
            case 113 -> 90;
            case 114 -> 127;
            case 115 -> 149;
            case 116 -> 230;
            case 117 -> 101;
            case 118 -> 222;
            case 119 -> 120;
            case 120 -> 195;
            case 121 -> 144;
            case 122 -> 16;
            case 123 -> 208;
            case 124 -> 176;
            case 125 -> 46;
            case 126 -> 79;
            case 127 -> 218;
            case 128 -> 17;
            case 129 -> 50;
            case 130 -> 166;
            case 131 -> 180;
            case 132 -> 58;
            case 133 -> 142;
            case 134 -> 227;
            case 135 -> 10;
            case 136 -> 54;
            case 137 -> 100;
            case 138 -> 239;
            case 139 -> 86;
            case 140 -> 129;
            case 141 -> 219;
            case 142 -> 133;
            case 143 -> 97;
            case 144 -> 2;
            case 145 -> 199;
            case 146 -> 47;
            case 147 -> 37;
            case 148 -> 106;
            case 149 -> 89;
            case 150 -> 140;
            case 151 -> 26;
            case 152 -> 125;
            case 153 -> 65;
            case 154 -> 43;
            case 155 -> 221;
            case 156 -> 110;
            case 157 -> 23;
            case 158 -> 194;
            case 159 -> 62;
            case 160 -> 88;
            case 161 -> 179;
            case 162 -> 25;
            case 163 -> 103;
            case 164 -> 42;
            case 165 -> 49;
            case 166 -> 252;
            case 167 -> 159;
            case 168 -> 184;
            case 169 -> 124;
            case 170 -> 215;
            case 171 -> 36;
            case 172 -> 45;
            case 173 -> 161;
            case 174 -> 197;
            case 175 -> 130;
            case 176 -> 0;
            case 177 -> 55;
            case 178 -> 137;
            case 179 -> 182;
            case 180 -> 108;
            case 181 -> 66;
            case 182 -> 253;
            case 183 -> 81;
            case 184 -> 93;
            case 185 -> 82;
            case 186 -> 18;
            case 187 -> 185;
            case 188 -> 206;
            case 189 -> 94;
            case 190 -> 141;
            case 191 -> 76;
            case 192 -> 39;
            case 193 -> 169;
            case 194 -> 204;
            case 195 -> 146;
            case 196 -> 164;
            case 197 -> 160;
            case 198 -> 9;
            case 199 -> 102;
            case 200 -> 248;
            case 201 -> 223;
            case 202 -> 104;
            case 203 -> 113;
            case 204 -> 162;
            case 205 -> 240;
            case 206 -> 115;
            case 207 -> 114;
            case 208 -> 205;
            case 209 -> 224;
            case 210 -> 59;
            case 211 -> 243;
            case 212 -> 60;
            case 213 -> 232;
            case 214 -> 158;
            case 215 -> 84;
            case 216 -> 167;
            case 217 -> 7;
            case 218 -> 4;
            case 219 -> 174;
            case 220 -> 229;
            case 221 -> 34;
            case 222 -> 172;
            case 223 -> 214;
            case 224 -> 145;
            case 225 -> 111;
            case 226 -> 107;
            case 227 -> 245;
            case 228 -> 200;
            case 229 -> 193;
            case 230 -> 32;
            case 231 -> 198;
            case 232 -> 210;
            case 233 -> 118;
            case 234 -> 8;
            case 235 -> 121;
            case 236 -> 105;
            case 237 -> 75;
            case 238 -> 132;
            case 239 -> 212;
            case 240 -> 168;
            case 241 -> 242;
            case 242 -> 237;
            case 243 -> 99;
            case 244 -> 246;
            case 245 -> 71;
            case 246 -> 148;
            case 247 -> 250;
            case 248 -> 67;
            case 249 -> 91;
            case 250 -> 19;
            case 251 -> 241;
            case 252 -> 181;
            case 253 -> 77;
            case 254 -> 87;
            default -> 152;
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
