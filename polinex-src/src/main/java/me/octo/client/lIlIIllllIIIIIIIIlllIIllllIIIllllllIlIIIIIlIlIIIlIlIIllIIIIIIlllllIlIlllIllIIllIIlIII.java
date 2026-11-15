package me.octo.client;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII {
   @NotNull
   private final ArrayList<Vec3> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII(
      @NotNull ArrayList<Vec3> var1,
      @NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var2,
      @NotNull IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var3
   ) {
      short var10001 = -19223;
      short var10002 = -1077;
      Intrinsics.checkNotNullParameter(var1, "points");
      var10001 = -19221;
      var10002 = 1775;
      Intrinsics.checkNotNullParameter(var2, "moveProcedure");
      var10001 = -19222;
      var10002 = 15010;
      Intrinsics.checkNotNullParameter(var3, "obstruction");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
   }

   @NotNull
   public final ArrayList<Vec3> a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "N\u0000èé·Á H\bõ³f\u008f\u000bp@h\\ C8è\u009a\u001fw\u0006&<Deú;";
      int var4 = "N\u0000èé·Á H\bõ³f\u008f\u000bp@h\\ C8è\u009a\u001fw\u0006&<Deú;".length();
      char var1 = '\r';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 106;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 106;
               var10006 = var6;
            } else {
               var13 = 106;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 106;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 12;
                  case 1 -> 89;
                  case 2 -> 49;
                  case 3 -> 2;
                  case 4 -> 67;
                  case 5 -> 32;
                  default -> 44;
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
            b = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19221) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 248;
            case 1 -> 143;
            case 2 -> 36;
            case 3 -> 55;
            case 4 -> 100;
            case 5 -> 120;
            case 6 -> 29;
            case 7 -> 30;
            case 8 -> 71;
            case 9 -> 182;
            case 10 -> 134;
            case 11 -> 135;
            case 12 -> 111;
            case 13 -> 0;
            case 14 -> 149;
            case 15 -> 66;
            case 16 -> 145;
            case 17 -> 14;
            case 18 -> 84;
            case 19 -> 169;
            case 20 -> 228;
            case 21 -> 27;
            case 22 -> 41;
            case 23 -> 109;
            case 24 -> 78;
            case 25 -> 70;
            case 26 -> 23;
            case 27 -> 216;
            case 28 -> 217;
            case 29 -> 39;
            case 30 -> 174;
            case 31 -> 126;
            case 32 -> 200;
            case 33 -> 4;
            case 34 -> 220;
            case 35 -> 141;
            case 36 -> 98;
            case 37 -> 133;
            case 38 -> 203;
            case 39 -> 38;
            case 40 -> 170;
            case 41 -> 18;
            case 42 -> 233;
            case 43 -> 22;
            case 44 -> 54;
            case 45 -> 195;
            case 46 -> 72;
            case 47 -> 108;
            case 48 -> 97;
            case 49 -> 129;
            case 50 -> 104;
            case 51 -> 181;
            case 52 -> 226;
            case 53 -> 33;
            case 54 -> 246;
            case 55 -> 64;
            case 56 -> 19;
            case 57 -> 1;
            case 58 -> 241;
            case 59 -> 56;
            case 60 -> 75;
            case 61 -> 20;
            case 62 -> 157;
            case 63 -> 63;
            case 64 -> 155;
            case 65 -> 175;
            case 66 -> 137;
            case 67 -> 230;
            case 68 -> 116;
            case 69 -> 173;
            case 70 -> 209;
            case 71 -> 102;
            case 72 -> 250;
            case 73 -> 171;
            case 74 -> 46;
            case 75 -> 187;
            case 76 -> 11;
            case 77 -> 197;
            case 78 -> 45;
            case 79 -> 10;
            case 80 -> 77;
            case 81 -> 245;
            case 82 -> 164;
            case 83 -> 144;
            case 84 -> 122;
            case 85 -> 61;
            case 86 -> 131;
            case 87 -> 239;
            case 88 -> 81;
            case 89 -> 247;
            case 90 -> 163;
            case 91 -> 185;
            case 92 -> 223;
            case 93 -> 167;
            case 94 -> 62;
            case 95 -> 224;
            case 96 -> 40;
            case 97 -> 96;
            case 98 -> 232;
            case 99 -> 190;
            case 100 -> 113;
            case 101 -> 152;
            case 102 -> 252;
            case 103 -> 44;
            case 104 -> 255;
            case 105 -> 249;
            case 106 -> 130;
            case 107 -> 199;
            case 108 -> 52;
            case 109 -> 162;
            case 110 -> 139;
            case 111 -> 240;
            case 112 -> 6;
            case 113 -> 115;
            case 114 -> 142;
            case 115 -> 128;
            case 116 -> 229;
            case 117 -> 112;
            case 118 -> 234;
            case 119 -> 86;
            case 120 -> 238;
            case 121 -> 211;
            case 122 -> 243;
            case 123 -> 227;
            case 124 -> 60;
            case 125 -> 189;
            case 126 -> 118;
            case 127 -> 67;
            case 128 -> 73;
            case 129 -> 53;
            case 130 -> 125;
            case 131 -> 207;
            case 132 -> 26;
            case 133 -> 188;
            case 134 -> 192;
            case 135 -> 127;
            case 136 -> 31;
            case 137 -> 159;
            case 138 -> 244;
            case 139 -> 42;
            case 140 -> 34;
            case 141 -> 191;
            case 142 -> 103;
            case 143 -> 32;
            case 144 -> 47;
            case 145 -> 146;
            case 146 -> 221;
            case 147 -> 68;
            case 148 -> 88;
            case 149 -> 114;
            case 150 -> 219;
            case 151 -> 177;
            case 152 -> 28;
            case 153 -> 158;
            case 154 -> 8;
            case 155 -> 148;
            case 156 -> 76;
            case 157 -> 156;
            case 158 -> 254;
            case 159 -> 184;
            case 160 -> 136;
            case 161 -> 121;
            case 162 -> 140;
            case 163 -> 202;
            case 164 -> 235;
            case 165 -> 160;
            case 166 -> 16;
            case 167 -> 93;
            case 168 -> 119;
            case 169 -> 57;
            case 170 -> 80;
            case 171 -> 213;
            case 172 -> 48;
            case 173 -> 59;
            case 174 -> 99;
            case 175 -> 236;
            case 176 -> 25;
            case 177 -> 82;
            case 178 -> 43;
            case 179 -> 178;
            case 180 -> 110;
            case 181 -> 204;
            case 182 -> 15;
            case 183 -> 12;
            case 184 -> 186;
            case 185 -> 151;
            case 186 -> 251;
            case 187 -> 124;
            case 188 -> 165;
            case 189 -> 74;
            case 190 -> 94;
            case 191 -> 58;
            case 192 -> 172;
            case 193 -> 35;
            case 194 -> 105;
            case 195 -> 218;
            case 196 -> 153;
            case 197 -> 138;
            case 198 -> 166;
            case 199 -> 17;
            case 200 -> 90;
            case 201 -> 132;
            case 202 -> 206;
            case 203 -> 9;
            case 204 -> 65;
            case 205 -> 150;
            case 206 -> 117;
            case 207 -> 21;
            case 208 -> 107;
            case 209 -> 51;
            case 210 -> 2;
            case 211 -> 106;
            case 212 -> 147;
            case 213 -> 24;
            case 214 -> 85;
            case 215 -> 50;
            case 216 -> 168;
            case 217 -> 215;
            case 218 -> 193;
            case 219 -> 198;
            case 220 -> 69;
            case 221 -> 123;
            case 222 -> 214;
            case 223 -> 208;
            case 224 -> 95;
            case 225 -> 242;
            case 226 -> 161;
            case 227 -> 231;
            case 228 -> 92;
            case 229 -> 183;
            case 230 -> 237;
            case 231 -> 210;
            case 232 -> 13;
            case 233 -> 89;
            case 234 -> 37;
            case 235 -> 7;
            case 236 -> 3;
            case 237 -> 253;
            case 238 -> 212;
            case 239 -> 225;
            case 240 -> 205;
            case 241 -> 201;
            case 242 -> 222;
            case 243 -> 179;
            case 244 -> 83;
            case 245 -> 176;
            case 246 -> 5;
            case 247 -> 154;
            case 248 -> 87;
            case 249 -> 194;
            case 250 -> 180;
            case 251 -> 91;
            case 252 -> 196;
            case 253 -> 49;
            case 254 -> 79;
            default -> 101;
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
