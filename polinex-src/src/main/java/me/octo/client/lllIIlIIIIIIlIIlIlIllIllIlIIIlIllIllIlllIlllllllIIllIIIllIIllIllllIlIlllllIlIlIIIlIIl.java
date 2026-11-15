package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl
   extends IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI {
   @NotNull
   private String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] d;
   private static String[] e;

   @NotNull
   protected final String an() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   protected final void b(@NotNull String var1) {
      short var10001 = 21685;
      short var10002 = -7488;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   @NotNull
   @Override
   public String ad() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @Override
   public void ai() {
      ao();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
      this.a(false);
      this.ag().b();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]);
      }
   }

   @Override
   public void al() {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = "";
   }

   @Override
   public void a(@NotNull String var1) {
      short var10001 = 21686;
      short var10002 = -10534;
      Intrinsics.checkNotNullParameter(var1, "value");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         + var1;
   }

   @Override
   public void am() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = ao();
      String var10002 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .substring(0, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length() - 1);
      short var10004 = 21687;
      short var10005 = -10496;
      Intrinsics.checkNotNullExpressionValue(var10002, "substring(...)");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var10002;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      if (var1 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
         );
      }
   }

   @NotNull
   @Override
   public String Z() {
      int var10000 = this.hashCode();
      short var10001 = 21684;
      short var10002 = -9871;
      return "text-bar-" + var10000;
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] ao() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "îíW\u008aÂé³\t]\u008e}29£\u0093&\u0017";
      int var4 = "îíW\u008aÂé³\t]\u008e}29£\u0093&\u0017".length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 90;
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
                     case 1 -> 121;
                     case 2 -> 39;
                     case 3 -> 96;
                     case 4 -> 57;
                     case 5 -> 96;
                     default -> 107;
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
                     e = new String[4];
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

                  var2 = "\"§Øµ:\u0013>\u0089VY\u0086SßB\u0005+ªR\u0084µ";
                  var4 = "\"§Øµ:\u0013>\u0089VY\u0086SßB\u0005+ªR\u0084µ".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 79;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 21685) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 34;
            case 1 -> 171;
            case 2 -> 148;
            case 3 -> 54;
            case 4 -> 112;
            case 5 -> 228;
            case 6 -> 129;
            case 7 -> 94;
            case 8 -> 25;
            case 9 -> 15;
            case 10 -> 146;
            case 11 -> 141;
            case 12 -> 115;
            case 13 -> 98;
            case 14 -> 238;
            case 15 -> 69;
            case 16 -> 61;
            case 17 -> 127;
            case 18 -> 233;
            case 19 -> 28;
            case 20 -> 17;
            case 21 -> 134;
            case 22 -> 114;
            case 23 -> 253;
            case 24 -> 63;
            case 25 -> 96;
            case 26 -> 184;
            case 27 -> 13;
            case 28 -> 57;
            case 29 -> 0;
            case 30 -> 20;
            case 31 -> 199;
            case 32 -> 177;
            case 33 -> 248;
            case 34 -> 4;
            case 35 -> 241;
            case 36 -> 56;
            case 37 -> 88;
            case 38 -> 9;
            case 39 -> 229;
            case 40 -> 111;
            case 41 -> 116;
            case 42 -> 208;
            case 43 -> 29;
            case 44 -> 186;
            case 45 -> 126;
            case 46 -> 90;
            case 47 -> 49;
            case 48 -> 79;
            case 49 -> 188;
            case 50 -> 197;
            case 51 -> 55;
            case 52 -> 85;
            case 53 -> 170;
            case 54 -> 95;
            case 55 -> 203;
            case 56 -> 47;
            case 57 -> 81;
            case 58 -> 44;
            case 59 -> 196;
            case 60 -> 7;
            case 61 -> 21;
            case 62 -> 166;
            case 63 -> 5;
            case 64 -> 255;
            case 65 -> 198;
            case 66 -> 16;
            case 67 -> 205;
            case 68 -> 252;
            case 69 -> 43;
            case 70 -> 209;
            case 71 -> 97;
            case 72 -> 220;
            case 73 -> 104;
            case 74 -> 237;
            case 75 -> 14;
            case 76 -> 82;
            case 77 -> 195;
            case 78 -> 194;
            case 79 -> 168;
            case 80 -> 254;
            case 81 -> 80;
            case 82 -> 36;
            case 83 -> 156;
            case 84 -> 218;
            case 85 -> 53;
            case 86 -> 182;
            case 87 -> 139;
            case 88 -> 93;
            case 89 -> 109;
            case 90 -> 216;
            case 91 -> 149;
            case 92 -> 18;
            case 93 -> 67;
            case 94 -> 35;
            case 95 -> 172;
            case 96 -> 183;
            case 97 -> 27;
            case 98 -> 215;
            case 99 -> 59;
            case 100 -> 48;
            case 101 -> 234;
            case 102 -> 169;
            case 103 -> 107;
            case 104 -> 247;
            case 105 -> 143;
            case 106 -> 235;
            case 107 -> 128;
            case 108 -> 52;
            case 109 -> 2;
            case 110 -> 122;
            case 111 -> 135;
            case 112 -> 136;
            case 113 -> 26;
            case 114 -> 65;
            case 115 -> 11;
            case 116 -> 102;
            case 117 -> 142;
            case 118 -> 132;
            case 119 -> 217;
            case 120 -> 224;
            case 121 -> 74;
            case 122 -> 147;
            case 123 -> 83;
            case 124 -> 75;
            case 125 -> 250;
            case 126 -> 243;
            case 127 -> 191;
            case 128 -> 133;
            case 129 -> 84;
            case 130 -> 163;
            case 131 -> 200;
            case 132 -> 158;
            case 133 -> 185;
            case 134 -> 244;
            case 135 -> 193;
            case 136 -> 123;
            case 137 -> 19;
            case 138 -> 152;
            case 139 -> 173;
            case 140 -> 124;
            case 141 -> 230;
            case 142 -> 131;
            case 143 -> 10;
            case 144 -> 151;
            case 145 -> 100;
            case 146 -> 130;
            case 147 -> 91;
            case 148 -> 231;
            case 149 -> 165;
            case 150 -> 164;
            case 151 -> 179;
            case 152 -> 24;
            case 153 -> 64;
            case 154 -> 160;
            case 155 -> 118;
            case 156 -> 239;
            case 157 -> 225;
            case 158 -> 32;
            case 159 -> 31;
            case 160 -> 76;
            case 161 -> 45;
            case 162 -> 23;
            case 163 -> 223;
            case 164 -> 161;
            case 165 -> 155;
            case 166 -> 221;
            case 167 -> 37;
            case 168 -> 201;
            case 169 -> 99;
            case 170 -> 219;
            case 171 -> 144;
            case 172 -> 176;
            case 173 -> 189;
            case 174 -> 77;
            case 175 -> 86;
            case 176 -> 72;
            case 177 -> 117;
            case 178 -> 125;
            case 179 -> 106;
            case 180 -> 138;
            case 181 -> 190;
            case 182 -> 157;
            case 183 -> 110;
            case 184 -> 150;
            case 185 -> 227;
            case 186 -> 222;
            case 187 -> 212;
            case 188 -> 249;
            case 189 -> 119;
            case 190 -> 108;
            case 191 -> 213;
            case 192 -> 62;
            case 193 -> 46;
            case 194 -> 121;
            case 195 -> 159;
            case 196 -> 33;
            case 197 -> 140;
            case 198 -> 211;
            case 199 -> 207;
            case 200 -> 40;
            case 201 -> 30;
            case 202 -> 204;
            case 203 -> 236;
            case 204 -> 187;
            case 205 -> 1;
            case 206 -> 60;
            case 207 -> 87;
            case 208 -> 38;
            case 209 -> 71;
            case 210 -> 240;
            case 211 -> 22;
            case 212 -> 153;
            case 213 -> 3;
            case 214 -> 251;
            case 215 -> 174;
            case 216 -> 68;
            case 217 -> 6;
            case 218 -> 103;
            case 219 -> 101;
            case 220 -> 167;
            case 221 -> 92;
            case 222 -> 246;
            case 223 -> 245;
            case 224 -> 210;
            case 225 -> 175;
            case 226 -> 41;
            case 227 -> 202;
            case 228 -> 12;
            case 229 -> 51;
            case 230 -> 8;
            case 231 -> 89;
            case 232 -> 154;
            case 233 -> 39;
            case 234 -> 120;
            case 235 -> 42;
            case 236 -> 232;
            case 237 -> 181;
            case 238 -> 70;
            case 239 -> 105;
            case 240 -> 206;
            case 241 -> 78;
            case 242 -> 162;
            case 243 -> 242;
            case 244 -> 214;
            case 245 -> 58;
            case 246 -> 192;
            case 247 -> 178;
            case 248 -> 180;
            case 249 -> 66;
            case 250 -> 145;
            case 251 -> 226;
            case 252 -> 73;
            case 253 -> 113;
            case 254 -> 137;
            default -> 50;
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
}
