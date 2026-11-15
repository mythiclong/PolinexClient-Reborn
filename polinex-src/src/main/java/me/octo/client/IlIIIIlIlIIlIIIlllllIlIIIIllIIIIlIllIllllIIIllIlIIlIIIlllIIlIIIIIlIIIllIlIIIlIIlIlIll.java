package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll
   extends IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll {
   @NotNull
   private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final Function0<Unit> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] d;
   private static String[] e;

   public IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll(
      @NotNull String var1, @Nullable String var2, @NotNull String var3, @NotNull Function0<Unit> var4
   ) {
      short var10001 = -27105;
      short var10002 = -14353;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -27107;
      var10002 = 7761;
      Intrinsics.checkNotNullParameter(var3, "buttonText");
      var10001 = -27111;
      var10002 = 927;
      Intrinsics.checkNotNullParameter(var4, "onClick");
      super(var1, var2);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var4;
   }

   @NotNull
   public final String i() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final Function0<Unit> j() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new llIllIIlIlllIIllIIlllIIIIllIllllIIllllIlIIIlIlIIllIlllllIlIlIlIIIllIllllllllIllIlIIll(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -27106;
      short var10002 = 4240;
      Intrinsics.checkNotNullParameter(var1, "data");
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -27108;
      short var10002 = 9347;
      Intrinsics.checkNotNullParameter(var1, "data");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u001bBé\u0001o\u001a\tírÐ\u0004Î_\u0095!\u0004)5;h";
      int var4 = "\u001bBé\u0001o\u001a\tírÐ\u0004Î_\u0095!\u0004)5;h".length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 115;
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
                     case 0 -> 94;
                     case 1 -> 101;
                     case 2 -> 6;
                     case 3 -> 87;
                     case 4 -> 26;
                     case 5 -> 89;
                     default -> 108;
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
                     d = var5;
                     e = new String[5];
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

                  var2 = "\u00ad\u0013Y\b\u0007\t\u008f\u0090x7\u0083[";
                  var4 = "\u00ad\u0013Y\b\u0007\t\u008f\u0090x7\u0083[".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -27107) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 48;
            case 1 -> 6;
            case 2 -> 240;
            case 3 -> 239;
            case 4 -> 133;
            case 5 -> 216;
            case 6 -> 113;
            case 7 -> 233;
            case 8 -> 97;
            case 9 -> 98;
            case 10 -> 227;
            case 11 -> 16;
            case 12 -> 153;
            case 13 -> 123;
            case 14 -> 167;
            case 15 -> 79;
            case 16 -> 145;
            case 17 -> 50;
            case 18 -> 68;
            case 19 -> 19;
            case 20 -> 88;
            case 21 -> 91;
            case 22 -> 75;
            case 23 -> 144;
            case 24 -> 64;
            case 25 -> 172;
            case 26 -> 178;
            case 27 -> 220;
            case 28 -> 4;
            case 29 -> 92;
            case 30 -> 176;
            case 31 -> 117;
            case 32 -> 5;
            case 33 -> 33;
            case 34 -> 119;
            case 35 -> 81;
            case 36 -> 250;
            case 37 -> 218;
            case 38 -> 159;
            case 39 -> 86;
            case 40 -> 110;
            case 41 -> 83;
            case 42 -> 219;
            case 43 -> 1;
            case 44 -> 107;
            case 45 -> 76;
            case 46 -> 231;
            case 47 -> 212;
            case 48 -> 47;
            case 49 -> 130;
            case 50 -> 211;
            case 51 -> 101;
            case 52 -> 102;
            case 53 -> 247;
            case 54 -> 253;
            case 55 -> 200;
            case 56 -> 46;
            case 57 -> 8;
            case 58 -> 17;
            case 59 -> 44;
            case 60 -> 34;
            case 61 -> 249;
            case 62 -> 59;
            case 63 -> 163;
            case 64 -> 150;
            case 65 -> 93;
            case 66 -> 207;
            case 67 -> 143;
            case 68 -> 14;
            case 69 -> 241;
            case 70 -> 9;
            case 71 -> 226;
            case 72 -> 181;
            case 73 -> 104;
            case 74 -> 26;
            case 75 -> 96;
            case 76 -> 126;
            case 77 -> 140;
            case 78 -> 57;
            case 79 -> 2;
            case 80 -> 204;
            case 81 -> 21;
            case 82 -> 52;
            case 83 -> 166;
            case 84 -> 66;
            case 85 -> 228;
            case 86 -> 45;
            case 87 -> 156;
            case 88 -> 209;
            case 89 -> 246;
            case 90 -> 74;
            case 91 -> 32;
            case 92 -> 71;
            case 93 -> 224;
            case 94 -> 53;
            case 95 -> 242;
            case 96 -> 203;
            case 97 -> 148;
            case 98 -> 60;
            case 99 -> 248;
            case 100 -> 31;
            case 101 -> 184;
            case 102 -> 174;
            case 103 -> 122;
            case 104 -> 41;
            case 105 -> 118;
            case 106 -> 114;
            case 107 -> 161;
            case 108 -> 131;
            case 109 -> 230;
            case 110 -> 162;
            case 111 -> 157;
            case 112 -> 27;
            case 113 -> 183;
            case 114 -> 191;
            case 115 -> 132;
            case 116 -> 254;
            case 117 -> 151;
            case 118 -> 61;
            case 119 -> 180;
            case 120 -> 12;
            case 121 -> 187;
            case 122 -> 177;
            case 123 -> 87;
            case 124 -> 25;
            case 125 -> 225;
            case 126 -> 194;
            case 127 -> 38;
            case 128 -> 206;
            case 129 -> 23;
            case 130 -> 189;
            case 131 -> 127;
            case 132 -> 182;
            case 133 -> 85;
            case 134 -> 170;
            case 135 -> 35;
            case 136 -> 188;
            case 137 -> 69;
            case 138 -> 49;
            case 139 -> 237;
            case 140 -> 42;
            case 141 -> 78;
            case 142 -> 205;
            case 143 -> 65;
            case 144 -> 112;
            case 145 -> 36;
            case 146 -> 234;
            case 147 -> 54;
            case 148 -> 222;
            case 149 -> 179;
            case 150 -> 158;
            case 151 -> 84;
            case 152 -> 72;
            case 153 -> 100;
            case 154 -> 10;
            case 155 -> 202;
            case 156 -> 124;
            case 157 -> 116;
            case 158 -> 90;
            case 159 -> 152;
            case 160 -> 137;
            case 161 -> 29;
            case 162 -> 175;
            case 163 -> 255;
            case 164 -> 208;
            case 165 -> 73;
            case 166 -> 20;
            case 167 -> 171;
            case 168 -> 106;
            case 169 -> 15;
            case 170 -> 138;
            case 171 -> 70;
            case 172 -> 154;
            case 173 -> 121;
            case 174 -> 115;
            case 175 -> 160;
            case 176 -> 197;
            case 177 -> 232;
            case 178 -> 3;
            case 179 -> 235;
            case 180 -> 51;
            case 181 -> 82;
            case 182 -> 142;
            case 183 -> 164;
            case 184 -> 95;
            case 185 -> 229;
            case 186 -> 94;
            case 187 -> 147;
            case 188 -> 149;
            case 189 -> 139;
            case 190 -> 89;
            case 191 -> 165;
            case 192 -> 243;
            case 193 -> 129;
            case 194 -> 217;
            case 195 -> 7;
            case 196 -> 236;
            case 197 -> 134;
            case 198 -> 120;
            case 199 -> 141;
            case 200 -> 198;
            case 201 -> 195;
            case 202 -> 99;
            case 203 -> 40;
            case 204 -> 190;
            case 205 -> 173;
            case 206 -> 111;
            case 207 -> 0;
            case 208 -> 192;
            case 209 -> 201;
            case 210 -> 245;
            case 211 -> 37;
            case 212 -> 251;
            case 213 -> 221;
            case 214 -> 214;
            case 215 -> 55;
            case 216 -> 18;
            case 217 -> 39;
            case 218 -> 210;
            case 219 -> 223;
            case 220 -> 135;
            case 221 -> 128;
            case 222 -> 109;
            case 223 -> 136;
            case 224 -> 196;
            case 225 -> 244;
            case 226 -> 30;
            case 227 -> 252;
            case 228 -> 199;
            case 229 -> 56;
            case 230 -> 146;
            case 231 -> 43;
            case 232 -> 185;
            case 233 -> 155;
            case 234 -> 238;
            case 235 -> 168;
            case 236 -> 186;
            case 237 -> 11;
            case 238 -> 103;
            case 239 -> 169;
            case 240 -> 24;
            case 241 -> 213;
            case 242 -> 62;
            case 243 -> 22;
            case 244 -> 215;
            case 245 -> 77;
            case 246 -> 13;
            case 247 -> 80;
            case 248 -> 108;
            case 249 -> 105;
            case 250 -> 193;
            case 251 -> 63;
            case 252 -> 125;
            case 253 -> 28;
            case 254 -> 67;
            default -> 58;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
      public IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll(java.lang.String p0, java.lang.String p1, java.lang.String p2, kotlin.jvm.functions.Function0 p3, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this(p0, p1, p2, p3);
      }
}
