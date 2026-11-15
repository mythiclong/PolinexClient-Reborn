package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII {
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII(@NotNull String var1, @NotNull String var2) {
      short var10001 = -25210;
      short var10002 = 2199;
      Intrinsics.checkNotNullParameter(var1, "chatName");
      var10001 = -25213;
      var10002 = -21503;
      Intrinsics.checkNotNullParameter(var2, "id");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String d() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII a(@NotNull String var1, @NotNull String var2) {
      short var10001 = -25211;
      short var10002 = 30160;
      Intrinsics.checkNotNullParameter(var1, "chatName");
      var10001 = -25214;
      var10002 = -13508;
      Intrinsics.checkNotNullParameter(var2, "id");
      return new llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = -25209;
      short var10003 = 2125;
      var10003 = -25212;
      short var10004 = -27133;
      return "RareDrop(chatName="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", id="
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
      int[] var2 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII)) {
            return false;
         }

         var10000 = var1;
      }

      llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII var3 = (llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII)var10000;
      boolean var4 = Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "+\u008f¹U'R\u0015¬q>çÁ®iä¾\u0002¦\bî\u0004\u0005\u001dË{Áí\b\u0091\u0015ê?6?~e\u0005\u001dîÕ\u0011«";
      int var4 = "+\u008f¹U'R\u0015¬q>çÁ®iä¾\u0002¦\bî\u0004\u0005\u001dË{Áí\b\u0091\u0015ê?6?~e\u0005\u001dîÕ\u0011«".length();
      char var1 = 18;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 36;
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
                     case 0 -> 75;
                     case 1 -> 27;
                     case 2 -> 127;
                     case 3 -> 79;
                     case 4 -> 39;
                     case 5 -> 10;
                     default -> 22;
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

                  var2 = "t\u0084\u0002¡k";
                  var4 = "t\u0084\u0002¡k".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 7;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25209) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 69;
            case 1 -> 101;
            case 2 -> 34;
            case 3 -> 154;
            case 4 -> 153;
            case 5 -> 20;
            case 6 -> 39;
            case 7 -> 98;
            case 8 -> 246;
            case 9 -> 209;
            case 10 -> 24;
            case 11 -> 186;
            case 12 -> 126;
            case 13 -> 156;
            case 14 -> 127;
            case 15 -> 87;
            case 16 -> 68;
            case 17 -> 88;
            case 18 -> 80;
            case 19 -> 41;
            case 20 -> 174;
            case 21 -> 100;
            case 22 -> 56;
            case 23 -> 145;
            case 24 -> 248;
            case 25 -> 105;
            case 26 -> 166;
            case 27 -> 28;
            case 28 -> 193;
            case 29 -> 198;
            case 30 -> 214;
            case 31 -> 117;
            case 32 -> 220;
            case 33 -> 200;
            case 34 -> 47;
            case 35 -> 103;
            case 36 -> 155;
            case 37 -> 179;
            case 38 -> 225;
            case 39 -> 172;
            case 40 -> 228;
            case 41 -> 194;
            case 42 -> 25;
            case 43 -> 11;
            case 44 -> 35;
            case 45 -> 32;
            case 46 -> 204;
            case 47 -> 213;
            case 48 -> 63;
            case 49 -> 16;
            case 50 -> 36;
            case 51 -> 72;
            case 52 -> 167;
            case 53 -> 70;
            case 54 -> 14;
            case 55 -> 6;
            case 56 -> 176;
            case 57 -> 230;
            case 58 -> 53;
            case 59 -> 169;
            case 60 -> 137;
            case 61 -> 96;
            case 62 -> 249;
            case 63 -> 3;
            case 64 -> 78;
            case 65 -> 109;
            case 66 -> 0;
            case 67 -> 236;
            case 68 -> 55;
            case 69 -> 237;
            case 70 -> 234;
            case 71 -> 119;
            case 72 -> 21;
            case 73 -> 108;
            case 74 -> 77;
            case 75 -> 129;
            case 76 -> 139;
            case 77 -> 19;
            case 78 -> 152;
            case 79 -> 222;
            case 80 -> 75;
            case 81 -> 95;
            case 82 -> 82;
            case 83 -> 106;
            case 84 -> 171;
            case 85 -> 57;
            case 86 -> 252;
            case 87 -> 215;
            case 88 -> 37;
            case 89 -> 58;
            case 90 -> 189;
            case 91 -> 227;
            case 92 -> 146;
            case 93 -> 203;
            case 94 -> 197;
            case 95 -> 66;
            case 96 -> 121;
            case 97 -> 196;
            case 98 -> 99;
            case 99 -> 54;
            case 100 -> 244;
            case 101 -> 30;
            case 102 -> 45;
            case 103 -> 7;
            case 104 -> 59;
            case 105 -> 158;
            case 106 -> 90;
            case 107 -> 140;
            case 108 -> 132;
            case 109 -> 208;
            case 110 -> 107;
            case 111 -> 9;
            case 112 -> 18;
            case 113 -> 131;
            case 114 -> 165;
            case 115 -> 10;
            case 116 -> 52;
            case 117 -> 33;
            case 118 -> 5;
            case 119 -> 160;
            case 120 -> 149;
            case 121 -> 250;
            case 122 -> 183;
            case 123 -> 27;
            case 124 -> 245;
            case 125 -> 177;
            case 126 -> 233;
            case 127 -> 60;
            case 128 -> 31;
            case 129 -> 181;
            case 130 -> 206;
            case 131 -> 232;
            case 132 -> 42;
            case 133 -> 12;
            case 134 -> 210;
            case 135 -> 178;
            case 136 -> 243;
            case 137 -> 123;
            case 138 -> 40;
            case 139 -> 49;
            case 140 -> 71;
            case 141 -> 170;
            case 142 -> 218;
            case 143 -> 133;
            case 144 -> 212;
            case 145 -> 219;
            case 146 -> 147;
            case 147 -> 255;
            case 148 -> 116;
            case 149 -> 150;
            case 150 -> 102;
            case 151 -> 221;
            case 152 -> 144;
            case 153 -> 241;
            case 154 -> 113;
            case 155 -> 111;
            case 156 -> 97;
            case 157 -> 216;
            case 158 -> 81;
            case 159 -> 199;
            case 160 -> 168;
            case 161 -> 134;
            case 162 -> 242;
            case 163 -> 84;
            case 164 -> 112;
            case 165 -> 120;
            case 166 -> 182;
            case 167 -> 46;
            case 168 -> 211;
            case 169 -> 187;
            case 170 -> 86;
            case 171 -> 61;
            case 172 -> 151;
            case 173 -> 164;
            case 174 -> 190;
            case 175 -> 79;
            case 176 -> 141;
            case 177 -> 175;
            case 178 -> 48;
            case 179 -> 207;
            case 180 -> 92;
            case 181 -> 217;
            case 182 -> 104;
            case 183 -> 110;
            case 184 -> 238;
            case 185 -> 65;
            case 186 -> 26;
            case 187 -> 2;
            case 188 -> 83;
            case 189 -> 125;
            case 190 -> 229;
            case 191 -> 223;
            case 192 -> 76;
            case 193 -> 191;
            case 194 -> 235;
            case 195 -> 240;
            case 196 -> 118;
            case 197 -> 148;
            case 198 -> 157;
            case 199 -> 44;
            case 200 -> 247;
            case 201 -> 85;
            case 202 -> 93;
            case 203 -> 163;
            case 204 -> 128;
            case 205 -> 253;
            case 206 -> 180;
            case 207 -> 202;
            case 208 -> 50;
            case 209 -> 162;
            case 210 -> 130;
            case 211 -> 114;
            case 212 -> 138;
            case 213 -> 254;
            case 214 -> 161;
            case 215 -> 38;
            case 216 -> 43;
            case 217 -> 239;
            case 218 -> 17;
            case 219 -> 74;
            case 220 -> 226;
            case 221 -> 23;
            case 222 -> 94;
            case 223 -> 29;
            case 224 -> 15;
            case 225 -> 22;
            case 226 -> 142;
            case 227 -> 4;
            case 228 -> 188;
            case 229 -> 64;
            case 230 -> 251;
            case 231 -> 201;
            case 232 -> 173;
            case 233 -> 122;
            case 234 -> 192;
            case 235 -> 143;
            case 236 -> 115;
            case 237 -> 184;
            case 238 -> 159;
            case 239 -> 136;
            case 240 -> 13;
            case 241 -> 73;
            case 242 -> 67;
            case 243 -> 8;
            case 244 -> 62;
            case 245 -> 89;
            case 246 -> 231;
            case 247 -> 91;
            case 248 -> 124;
            case 249 -> 1;
            case 250 -> 185;
            case 251 -> 195;
            case 252 -> 135;
            case 253 -> 205;
            case 254 -> 51;
            default -> 224;
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
  public static me.octo.client.llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII a(me.octo.client.llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.Object p4) {
    if ((p3 & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
    if ((p3 & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
    return p0.a(p1, p2);
  }
}
