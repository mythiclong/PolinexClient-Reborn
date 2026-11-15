package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;

public final class IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI<T>
   implements Comparator<T> {
   net.minecraft.world.phys.Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   
   private static String[] a;
   private static String[] b;

   public IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
      Vec3 var1
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      BlockPos var3 = (BlockPos)var1;
      boolean var4 = false;
      me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var10000 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var10001 = ((Vec3)(Object)(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
      Vec3 var10002 = var3.getCenter();
      short var10004 = 21898;
      short var10005 = -16126;
      Intrinsics.checkNotNullExpressionValue(var10002, "getCenter(...)");
      Comparable var8 = var10000.d(var10001, var10002);
      var3 = (BlockPos)var2;
      Comparable var5 = var8;
      var4 = false;
      var10000 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10001 = ((Vec3)(Object)(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
      var10002 = var3.getCenter();
      var10004 = 21899;
      var10005 = -13230;
      Intrinsics.checkNotNullExpressionValue(var10002, "getCenter(...)");
      return ComparisonsKt.compareValues(var5, var10000.d(var10001, var10002));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "T\u0089 \u009bK6]\u001d+\u0097W1/m\u000etì¤7Ë£M¯)Á\u0017û'4";
      int var4 = "T\u0089 \u009bK6]\u001d+\u0097W1/m\u000etì¤7Ë£M¯)Á\u0017û'4".length();
      char var1 = 14;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 92;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 92;
               var10006 = var6;
            } else {
               var13 = 92;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 92;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 65;
                  case 1 -> 93;
                  case 2 -> 42;
                  case 3 -> 92;
                  case 4 -> 82;
                  case 5 -> 92;
                  default -> 20;
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
      int var2 = (var0 ^ 21898) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 239;
            case 1 -> 26;
            case 2 -> 224;
            case 3 -> 47;
            case 4 -> 17;
            case 5 -> 182;
            case 6 -> 209;
            case 7 -> 123;
            case 8 -> 23;
            case 9 -> 46;
            case 10 -> 177;
            case 11 -> 206;
            case 12 -> 142;
            case 13 -> 196;
            case 14 -> 58;
            case 15 -> 175;
            case 16 -> 21;
            case 17 -> 39;
            case 18 -> 105;
            case 19 -> 1;
            case 20 -> 37;
            case 21 -> 83;
            case 22 -> 148;
            case 23 -> 225;
            case 24 -> 103;
            case 25 -> 184;
            case 26 -> 125;
            case 27 -> 176;
            case 28 -> 255;
            case 29 -> 40;
            case 30 -> 42;
            case 31 -> 227;
            case 32 -> 119;
            case 33 -> 20;
            case 34 -> 101;
            case 35 -> 171;
            case 36 -> 49;
            case 37 -> 167;
            case 38 -> 45;
            case 39 -> 67;
            case 40 -> 190;
            case 41 -> 174;
            case 42 -> 164;
            case 43 -> 13;
            case 44 -> 222;
            case 45 -> 38;
            case 46 -> 173;
            case 47 -> 75;
            case 48 -> 192;
            case 49 -> 165;
            case 50 -> 51;
            case 51 -> 223;
            case 52 -> 121;
            case 53 -> 193;
            case 54 -> 150;
            case 55 -> 80;
            case 56 -> 70;
            case 57 -> 48;
            case 58 -> 191;
            case 59 -> 198;
            case 60 -> 86;
            case 61 -> 251;
            case 62 -> 76;
            case 63 -> 0;
            case 64 -> 100;
            case 65 -> 136;
            case 66 -> 114;
            case 67 -> 113;
            case 68 -> 52;
            case 69 -> 124;
            case 70 -> 9;
            case 71 -> 180;
            case 72 -> 71;
            case 73 -> 212;
            case 74 -> 127;
            case 75 -> 143;
            case 76 -> 208;
            case 77 -> 219;
            case 78 -> 122;
            case 79 -> 217;
            case 80 -> 241;
            case 81 -> 152;
            case 82 -> 2;
            case 83 -> 201;
            case 84 -> 160;
            case 85 -> 203;
            case 86 -> 131;
            case 87 -> 11;
            case 88 -> 238;
            case 89 -> 169;
            case 90 -> 248;
            case 91 -> 81;
            case 92 -> 41;
            case 93 -> 90;
            case 94 -> 197;
            case 95 -> 24;
            case 96 -> 118;
            case 97 -> 55;
            case 98 -> 18;
            case 99 -> 77;
            case 100 -> 129;
            case 101 -> 28;
            case 102 -> 132;
            case 103 -> 116;
            case 104 -> 61;
            case 105 -> 68;
            case 106 -> 185;
            case 107 -> 35;
            case 108 -> 189;
            case 109 -> 102;
            case 110 -> 5;
            case 111 -> 79;
            case 112 -> 117;
            case 113 -> 183;
            case 114 -> 157;
            case 115 -> 64;
            case 116 -> 29;
            case 117 -> 242;
            case 118 -> 207;
            case 119 -> 247;
            case 120 -> 244;
            case 121 -> 22;
            case 122 -> 202;
            case 123 -> 96;
            case 124 -> 220;
            case 125 -> 233;
            case 126 -> 32;
            case 127 -> 3;
            case 128 -> 89;
            case 129 -> 65;
            case 130 -> 33;
            case 131 -> 91;
            case 132 -> 154;
            case 133 -> 188;
            case 134 -> 146;
            case 135 -> 213;
            case 136 -> 34;
            case 137 -> 186;
            case 138 -> 243;
            case 139 -> 195;
            case 140 -> 74;
            case 141 -> 109;
            case 142 -> 133;
            case 143 -> 155;
            case 144 -> 6;
            case 145 -> 19;
            case 146 -> 135;
            case 147 -> 98;
            case 148 -> 63;
            case 149 -> 130;
            case 150 -> 153;
            case 151 -> 126;
            case 152 -> 218;
            case 153 -> 250;
            case 154 -> 120;
            case 155 -> 56;
            case 156 -> 149;
            case 157 -> 228;
            case 158 -> 232;
            case 159 -> 108;
            case 160 -> 205;
            case 161 -> 252;
            case 162 -> 62;
            case 163 -> 163;
            case 164 -> 78;
            case 165 -> 50;
            case 166 -> 44;
            case 167 -> 166;
            case 168 -> 4;
            case 169 -> 229;
            case 170 -> 231;
            case 171 -> 57;
            case 172 -> 73;
            case 173 -> 60;
            case 174 -> 99;
            case 175 -> 15;
            case 176 -> 104;
            case 177 -> 147;
            case 178 -> 245;
            case 179 -> 161;
            case 180 -> 221;
            case 181 -> 27;
            case 182 -> 84;
            case 183 -> 204;
            case 184 -> 187;
            case 185 -> 138;
            case 186 -> 87;
            case 187 -> 93;
            case 188 -> 92;
            case 189 -> 230;
            case 190 -> 170;
            case 191 -> 72;
            case 192 -> 111;
            case 193 -> 54;
            case 194 -> 235;
            case 195 -> 10;
            case 196 -> 156;
            case 197 -> 194;
            case 198 -> 216;
            case 199 -> 88;
            case 200 -> 66;
            case 201 -> 69;
            case 202 -> 128;
            case 203 -> 43;
            case 204 -> 95;
            case 205 -> 94;
            case 206 -> 107;
            case 207 -> 179;
            case 208 -> 7;
            case 209 -> 112;
            case 210 -> 211;
            case 211 -> 31;
            case 212 -> 172;
            case 213 -> 12;
            case 214 -> 14;
            case 215 -> 215;
            case 216 -> 141;
            case 217 -> 145;
            case 218 -> 240;
            case 219 -> 85;
            case 220 -> 200;
            case 221 -> 158;
            case 222 -> 59;
            case 223 -> 226;
            case 224 -> 254;
            case 225 -> 106;
            case 226 -> 237;
            case 227 -> 115;
            case 228 -> 16;
            case 229 -> 144;
            case 230 -> 253;
            case 231 -> 234;
            case 232 -> 162;
            case 233 -> 25;
            case 234 -> 249;
            case 235 -> 236;
            case 236 -> 134;
            case 237 -> 168;
            case 238 -> 139;
            case 239 -> 8;
            case 240 -> 151;
            case 241 -> 140;
            case 242 -> 181;
            case 243 -> 36;
            case 244 -> 53;
            case 245 -> 178;
            case 246 -> 30;
            case 247 -> 159;
            case 248 -> 110;
            case 249 -> 210;
            case 250 -> 82;
            case 251 -> 214;
            case 252 -> 246;
            case 253 -> 97;
            case 254 -> 137;
            default -> 199;
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
