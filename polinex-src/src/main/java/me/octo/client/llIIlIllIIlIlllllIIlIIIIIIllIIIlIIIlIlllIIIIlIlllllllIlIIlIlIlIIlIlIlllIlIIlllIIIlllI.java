package me.octo.client;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI {
   @NotNull
   private final ArrayList<Vec3> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final ArrayList<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private final BlockPos IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   public llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI(
      @NotNull ArrayList<Vec3> var1,
      @NotNull ArrayList<String> var2,
      boolean var3,
      boolean var4,
      @Nullable BlockPos var5,
      @NotNull lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var6
   ) {
      short var10001 = -31665;
      short var10002 = 4158;
      Intrinsics.checkNotNullParameter(var1, "points");
      var10001 = -31666;
      var10002 = 26334;
      Intrinsics.checkNotNullParameter(var2, "keys");
      var10001 = -31667;
      var10002 = 16205;
      Intrinsics.checkNotNullParameter(var6, "correction");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
   }

   @NotNull
   public final ArrayList<Vec3> a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final ArrayList<String> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final boolean c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final boolean d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Nullable
   public final BlockPos e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll f() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u007f>¢Ößä\u0004\u0091k\u0017*\n»íP°è§\tDjø";
      int var4 = "\u007f>¢Ößä\u0004\u0091k\u0017*\n»íP°è§\tDjø".length();
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 126;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 126;
               var10006 = var6;
            } else {
               var13 = 126;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 126;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 13;
                  case 1 -> 97;
                  case 2 -> 74;
                  case 3 -> 96;
                  case 4 -> 67;
                  case 5 -> 83;
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
            b = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31665) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 7;
            case 1 -> 150;
            case 2 -> 117;
            case 3 -> 169;
            case 4 -> 76;
            case 5 -> 133;
            case 6 -> 155;
            case 7 -> 48;
            case 8 -> 114;
            case 9 -> 20;
            case 10 -> 234;
            case 11 -> 246;
            case 12 -> 194;
            case 13 -> 5;
            case 14 -> 179;
            case 15 -> 29;
            case 16 -> 95;
            case 17 -> 128;
            case 18 -> 132;
            case 19 -> 102;
            case 20 -> 124;
            case 21 -> 131;
            case 22 -> 148;
            case 23 -> 68;
            case 24 -> 154;
            case 25 -> 60;
            case 26 -> 17;
            case 27 -> 121;
            case 28 -> 224;
            case 29 -> 212;
            case 30 -> 134;
            case 31 -> 129;
            case 32 -> 31;
            case 33 -> 170;
            case 34 -> 30;
            case 35 -> 113;
            case 36 -> 49;
            case 37 -> 225;
            case 38 -> 217;
            case 39 -> 72;
            case 40 -> 105;
            case 41 -> 74;
            case 42 -> 250;
            case 43 -> 98;
            case 44 -> 241;
            case 45 -> 173;
            case 46 -> 185;
            case 47 -> 64;
            case 48 -> 172;
            case 49 -> 190;
            case 50 -> 181;
            case 51 -> 15;
            case 52 -> 109;
            case 53 -> 10;
            case 54 -> 254;
            case 55 -> 136;
            case 56 -> 37;
            case 57 -> 142;
            case 58 -> 152;
            case 59 -> 4;
            case 60 -> 3;
            case 61 -> 226;
            case 62 -> 39;
            case 63 -> 84;
            case 64 -> 204;
            case 65 -> 43;
            case 66 -> 53;
            case 67 -> 198;
            case 68 -> 228;
            case 69 -> 252;
            case 70 -> 175;
            case 71 -> 158;
            case 72 -> 97;
            case 73 -> 120;
            case 74 -> 122;
            case 75 -> 183;
            case 76 -> 208;
            case 77 -> 115;
            case 78 -> 151;
            case 79 -> 232;
            case 80 -> 199;
            case 81 -> 25;
            case 82 -> 243;
            case 83 -> 214;
            case 84 -> 145;
            case 85 -> 240;
            case 86 -> 44;
            case 87 -> 8;
            case 88 -> 182;
            case 89 -> 144;
            case 90 -> 222;
            case 91 -> 32;
            case 92 -> 220;
            case 93 -> 216;
            case 94 -> 12;
            case 95 -> 70;
            case 96 -> 255;
            case 97 -> 123;
            case 98 -> 52;
            case 99 -> 11;
            case 100 -> 28;
            case 101 -> 235;
            case 102 -> 116;
            case 103 -> 160;
            case 104 -> 63;
            case 105 -> 230;
            case 106 -> 99;
            case 107 -> 253;
            case 108 -> 40;
            case 109 -> 233;
            case 110 -> 80;
            case 111 -> 161;
            case 112 -> 223;
            case 113 -> 180;
            case 114 -> 9;
            case 115 -> 191;
            case 116 -> 188;
            case 117 -> 186;
            case 118 -> 6;
            case 119 -> 75;
            case 120 -> 202;
            case 121 -> 139;
            case 122 -> 38;
            case 123 -> 156;
            case 124 -> 153;
            case 125 -> 227;
            case 126 -> 106;
            case 127 -> 42;
            case 128 -> 248;
            case 129 -> 96;
            case 130 -> 22;
            case 131 -> 213;
            case 132 -> 81;
            case 133 -> 16;
            case 134 -> 62;
            case 135 -> 56;
            case 136 -> 215;
            case 137 -> 164;
            case 138 -> 189;
            case 139 -> 218;
            case 140 -> 51;
            case 141 -> 187;
            case 142 -> 238;
            case 143 -> 193;
            case 144 -> 27;
            case 145 -> 61;
            case 146 -> 21;
            case 147 -> 171;
            case 148 -> 87;
            case 149 -> 192;
            case 150 -> 219;
            case 151 -> 36;
            case 152 -> 177;
            case 153 -> 157;
            case 154 -> 107;
            case 155 -> 130;
            case 156 -> 178;
            case 157 -> 135;
            case 158 -> 23;
            case 159 -> 251;
            case 160 -> 69;
            case 161 -> 112;
            case 162 -> 138;
            case 163 -> 24;
            case 164 -> 210;
            case 165 -> 19;
            case 166 -> 203;
            case 167 -> 127;
            case 168 -> 79;
            case 169 -> 92;
            case 170 -> 159;
            case 171 -> 0;
            case 172 -> 231;
            case 173 -> 77;
            case 174 -> 110;
            case 175 -> 46;
            case 176 -> 221;
            case 177 -> 58;
            case 178 -> 57;
            case 179 -> 1;
            case 180 -> 147;
            case 181 -> 41;
            case 182 -> 206;
            case 183 -> 168;
            case 184 -> 137;
            case 185 -> 104;
            case 186 -> 78;
            case 187 -> 237;
            case 188 -> 82;
            case 189 -> 211;
            case 190 -> 229;
            case 191 -> 35;
            case 192 -> 88;
            case 193 -> 244;
            case 194 -> 71;
            case 195 -> 141;
            case 196 -> 207;
            case 197 -> 67;
            case 198 -> 33;
            case 199 -> 18;
            case 200 -> 162;
            case 201 -> 143;
            case 202 -> 103;
            case 203 -> 146;
            case 204 -> 54;
            case 205 -> 209;
            case 206 -> 118;
            case 207 -> 34;
            case 208 -> 83;
            case 209 -> 119;
            case 210 -> 205;
            case 211 -> 100;
            case 212 -> 47;
            case 213 -> 50;
            case 214 -> 165;
            case 215 -> 93;
            case 216 -> 174;
            case 217 -> 149;
            case 218 -> 239;
            case 219 -> 184;
            case 220 -> 94;
            case 221 -> 55;
            case 222 -> 197;
            case 223 -> 167;
            case 224 -> 247;
            case 225 -> 13;
            case 226 -> 85;
            case 227 -> 26;
            case 228 -> 65;
            case 229 -> 163;
            case 230 -> 86;
            case 231 -> 2;
            case 232 -> 245;
            case 233 -> 176;
            case 234 -> 236;
            case 235 -> 196;
            case 236 -> 89;
            case 237 -> 101;
            case 238 -> 166;
            case 239 -> 90;
            case 240 -> 91;
            case 241 -> 66;
            case 242 -> 59;
            case 243 -> 201;
            case 244 -> 126;
            case 245 -> 195;
            case 246 -> 242;
            case 247 -> 45;
            case 248 -> 111;
            case 249 -> 125;
            case 250 -> 140;
            case 251 -> 108;
            case 252 -> 14;
            case 253 -> 200;
            case 254 -> 73;
            default -> 249;
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
