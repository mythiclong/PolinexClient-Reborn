package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.phys.Vec3;

public final class lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<T>
   implements Comparator<T> {
   final net.minecraft.world.phys.Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; // FIELDAu r9: jar = "final net.minecraft.world.phys.Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;" (was "PX-FIX missing field v2" placeholder)
   
   private static String[] a;
   private static String[] b;

   public lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
      Vec3 var1
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.b();
      lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var4 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var1;
      boolean var5 = false;
      me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var10001 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var10002 = var4.a().getCenter();
      short var10004 = -29104;
      short var10005 = 3236;
      Intrinsics.checkNotNullExpressionValue(var10002, "getCenter(...)");
      Comparable var10 = var10001.a(var10002, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      var4 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var2;
      Comparable var6 = var10;
      var5 = false;
      me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var10000 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var11 = var4.a().getCenter();
      short var10003 = -29103;
      var10004 = 3842;
      Intrinsics.checkNotNullExpressionValue(var11, "getCenter(...)");
      int var9 = ComparisonsKt.compareValues(
         var6, var10000.a(var11, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
      );
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.b("tsA4Rb");
      }

      return var9;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = ".\u0084Î\u0084\u0000\u008c\u0004¹;\"ë\u0001á[\u000eßúðKÇuü\u0086$Å\bý\u009dÄ";
      int var4 = ".\u0084Î\u0084\u0000\u008c\u0004¹;\"ë\u0001á[\u000eßúðKÇuü\u0086$Å\bý\u009dÄ".length();
      char var1 = 14;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 24;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 24;
               var10006 = var6;
            } else {
               var13 = 24;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 24;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 61;
                  case 1 -> 45;
                  case 2 -> 72;
                  case 3 -> 32;
                  case 4 -> 84;
                  case 5 -> 70;
                  default -> 40;
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
      int var2 = (var0 ^ -29104) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 20;
            case 1 -> 243;
            case 2 -> 238;
            case 3 -> 122;
            case 4 -> 114;
            case 5 -> 133;
            case 6 -> 36;
            case 7 -> 87;
            case 8 -> 72;
            case 9 -> 61;
            case 10 -> 202;
            case 11 -> 56;
            case 12 -> 142;
            case 13 -> 66;
            case 14 -> 34;
            case 15 -> 40;
            case 16 -> 9;
            case 17 -> 17;
            case 18 -> 166;
            case 19 -> 174;
            case 20 -> 11;
            case 21 -> 43;
            case 22 -> 150;
            case 23 -> 10;
            case 24 -> 51;
            case 25 -> 103;
            case 26 -> 109;
            case 27 -> 123;
            case 28 -> 50;
            case 29 -> 198;
            case 30 -> 68;
            case 31 -> 184;
            case 32 -> 137;
            case 33 -> 178;
            case 34 -> 5;
            case 35 -> 57;
            case 36 -> 93;
            case 37 -> 162;
            case 38 -> 173;
            case 39 -> 45;
            case 40 -> 128;
            case 41 -> 193;
            case 42 -> 251;
            case 43 -> 136;
            case 44 -> 239;
            case 45 -> 35;
            case 46 -> 157;
            case 47 -> 16;
            case 48 -> 85;
            case 49 -> 0;
            case 50 -> 70;
            case 51 -> 246;
            case 52 -> 169;
            case 53 -> 24;
            case 54 -> 1;
            case 55 -> 151;
            case 56 -> 39;
            case 57 -> 94;
            case 58 -> 225;
            case 59 -> 159;
            case 60 -> 191;
            case 61 -> 116;
            case 62 -> 98;
            case 63 -> 41;
            case 64 -> 176;
            case 65 -> 2;
            case 66 -> 28;
            case 67 -> 227;
            case 68 -> 218;
            case 69 -> 156;
            case 70 -> 224;
            case 71 -> 141;
            case 72 -> 234;
            case 73 -> 215;
            case 74 -> 100;
            case 75 -> 74;
            case 76 -> 19;
            case 77 -> 33;
            case 78 -> 245;
            case 79 -> 55;
            case 80 -> 32;
            case 81 -> 76;
            case 82 -> 226;
            case 83 -> 44;
            case 84 -> 165;
            case 85 -> 135;
            case 86 -> 31;
            case 87 -> 192;
            case 88 -> 26;
            case 89 -> 90;
            case 90 -> 3;
            case 91 -> 172;
            case 92 -> 47;
            case 93 -> 144;
            case 94 -> 222;
            case 95 -> 194;
            case 96 -> 160;
            case 97 -> 62;
            case 98 -> 195;
            case 99 -> 206;
            case 100 -> 106;
            case 101 -> 15;
            case 102 -> 248;
            case 103 -> 190;
            case 104 -> 253;
            case 105 -> 4;
            case 106 -> 170;
            case 107 -> 89;
            case 108 -> 185;
            case 109 -> 23;
            case 110 -> 231;
            case 111 -> 146;
            case 112 -> 102;
            case 113 -> 212;
            case 114 -> 110;
            case 115 -> 255;
            case 116 -> 91;
            case 117 -> 8;
            case 118 -> 117;
            case 119 -> 83;
            case 120 -> 86;
            case 121 -> 42;
            case 122 -> 217;
            case 123 -> 131;
            case 124 -> 97;
            case 125 -> 138;
            case 126 -> 242;
            case 127 -> 99;
            case 128 -> 64;
            case 129 -> 78;
            case 130 -> 204;
            case 131 -> 125;
            case 132 -> 230;
            case 133 -> 113;
            case 134 -> 223;
            case 135 -> 168;
            case 136 -> 67;
            case 137 -> 152;
            case 138 -> 73;
            case 139 -> 200;
            case 140 -> 229;
            case 141 -> 210;
            case 142 -> 127;
            case 143 -> 177;
            case 144 -> 249;
            case 145 -> 112;
            case 146 -> 221;
            case 147 -> 154;
            case 148 -> 179;
            case 149 -> 107;
            case 150 -> 140;
            case 151 -> 158;
            case 152 -> 119;
            case 153 -> 167;
            case 154 -> 161;
            case 155 -> 130;
            case 156 -> 134;
            case 157 -> 197;
            case 158 -> 124;
            case 159 -> 53;
            case 160 -> 241;
            case 161 -> 189;
            case 162 -> 201;
            case 163 -> 216;
            case 164 -> 59;
            case 165 -> 213;
            case 166 -> 111;
            case 167 -> 148;
            case 168 -> 205;
            case 169 -> 105;
            case 170 -> 164;
            case 171 -> 121;
            case 172 -> 237;
            case 173 -> 82;
            case 174 -> 252;
            case 175 -> 49;
            case 176 -> 25;
            case 177 -> 196;
            case 178 -> 69;
            case 179 -> 211;
            case 180 -> 79;
            case 181 -> 153;
            case 182 -> 129;
            case 183 -> 254;
            case 184 -> 54;
            case 185 -> 63;
            case 186 -> 104;
            case 187 -> 188;
            case 188 -> 155;
            case 189 -> 96;
            case 190 -> 92;
            case 191 -> 209;
            case 192 -> 46;
            case 193 -> 108;
            case 194 -> 6;
            case 195 -> 235;
            case 196 -> 88;
            case 197 -> 95;
            case 198 -> 65;
            case 199 -> 75;
            case 200 -> 181;
            case 201 -> 132;
            case 202 -> 14;
            case 203 -> 183;
            case 204 -> 180;
            case 205 -> 118;
            case 206 -> 77;
            case 207 -> 175;
            case 208 -> 232;
            case 209 -> 126;
            case 210 -> 214;
            case 211 -> 7;
            case 212 -> 84;
            case 213 -> 145;
            case 214 -> 21;
            case 215 -> 139;
            case 216 -> 233;
            case 217 -> 147;
            case 218 -> 149;
            case 219 -> 186;
            case 220 -> 29;
            case 221 -> 207;
            case 222 -> 115;
            case 223 -> 18;
            case 224 -> 60;
            case 225 -> 250;
            case 226 -> 199;
            case 227 -> 219;
            case 228 -> 240;
            case 229 -> 244;
            case 230 -> 228;
            case 231 -> 171;
            case 232 -> 52;
            case 233 -> 80;
            case 234 -> 187;
            case 235 -> 27;
            case 236 -> 22;
            case 237 -> 143;
            case 238 -> 220;
            case 239 -> 182;
            case 240 -> 247;
            case 241 -> 12;
            case 242 -> 13;
            case 243 -> 38;
            case 244 -> 208;
            case 245 -> 163;
            case 246 -> 58;
            case 247 -> 236;
            case 248 -> 203;
            case 249 -> 30;
            case 250 -> 101;
            case 251 -> 48;
            case 252 -> 120;
            case 253 -> 37;
            case 254 -> 71;
            default -> 81;
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
