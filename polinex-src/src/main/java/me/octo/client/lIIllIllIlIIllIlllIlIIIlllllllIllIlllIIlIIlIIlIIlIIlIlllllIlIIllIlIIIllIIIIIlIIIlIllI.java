package me.octo.client;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI
   extends IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll
   implements IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII {
   public lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI(String var1, String var2, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, String var4, int var5, int var6, IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var7, int var8, kotlin.jvm.internal.DefaultConstructorMarker var9) {
      this(var1, var2, var3, var4, (var8 & 16) != 0 ? 0 : var5, (var8 & 32) != 0 ? 0 : var6, var7);
   }

   @NotNull
   private final lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] d;
   private static String[] e;

   public lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      int var5,
      int var6,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var7
   ) {
      short var10001 = -907;
      short var10002 = 10783;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -908;
      var10002 = -25974;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -906;
      var10002 = 423;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = -898;
      var10002 = 8805;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = -910;
      var10002 = -4106;
      Intrinsics.checkNotNullParameter(var7, "settings");
      super(var1, var2, var3, var4, var6, Arrays.copyOf(var7, var7.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll(
         this
      );
      if (!lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .contains(this)) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .add(this);
      }

      if (var5 != 0) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d(var5);
      }
   }

   public lIIllIllIlIIllIlllIlIIIlllllllIllIlllIIlIIlIIlIIlIIlIlllllIlIIllIlIIIllIIIIIlIIIlIllI(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var5
   ) {
      short var10001 = -907;
      short var10002 = 10783;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -912;
      var10002 = -9591;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -911;
      var10002 = -11064;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = -909;
      var10002 = -1154;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = -903;
      var10002 = -26890;
      Intrinsics.checkNotNullParameter(var5, "settings");
      super(var1, var2, var3, var4, 0, Arrays.copyOf(var5, var5.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll(
         this
      );
      if (!lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         .contains(this)) {
         lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .add(this);
      }
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new IlIlllIIIllllIllIIIIlIlIllIllIIllIlIllIIIIlIlllIIIIIlIllIIIIIlIIIIlIIIIIIlIIIIIIllIlI(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -905;
      short var10002 = 28063;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = -897;
      var10002 = -24716;
      var1.a("name", this.aj());
      var10001 = -904;
      var10002 = 12241;
      var1.a("keybind", Integer.valueOf(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b()));
      this.c(var1);
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -902;
      short var10002 = 19954;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10002 = -901;
      short var10003 = -11531;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d(var1.a("keybind", 0));
      this.d(var1);
   }

   @NotNull
   @Override
   public lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll f() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   @Override
   public lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll z() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Override
   public boolean A() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c();
   }

   @Override
   public abstract void d(int var1);

   @Override
   public abstract void B();

   @Override
   public abstract void C();

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "{$&c¶?µ.\u000bZ\u0093\u0014\u0090,®íQäó=\u000bÞÊ`©\u0082\u0094\\»cÂ\u001c\bx$Töö¿g\u0015\b6¬\u009dçÏ\u009d@Q\u0004]Ä\u0017î\u000b}.\u00145\f\u0007\u008dÉY\u008c[\u0004ý¿Q\u0085\u0004ç\u001f@\u0095\u0007«Ø*ê\u009bÚ\u0013\u0007Ca7Ý8<g\b{Ï&\u001e¶\u0090µÛ";
      int var4 = "{$&c¶?µ.\u000bZ\u0093\u0014\u0090,®íQäó=\u000bÞÊ`©\u0082\u0094\\»cÂ\u001c\bx$Töö¿g\u0015\b6¬\u009dçÏ\u009d@Q\u0004]Ä\u0017î\u000b}.\u00145\f\u0007\u008dÉY\u008c[\u0004ý¿Q\u0085\u0004ç\u001f@\u0095\u0007«Ø*ê\u009bÚ\u0013\u0007Ca7Ý8<g\b{Ï&\u001e¶\u0090µÛ"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 78;
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
                     case 0 -> 127;
                     case 1 -> 61;
                     case 2 -> 72;
                     case 3 -> 122;
                     case 4 -> 111;
                     case 5 -> 15;
                     default -> 42;
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
                     e = new String[14];
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

                  var2 = "áhYÕ¿<¥9×Äa\u0004Å¥lü";
                  var4 = "áhYÕ¿<¥9×Äa\u0004Å¥lü".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -910) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 11;
            case 1 -> 160;
            case 2 -> 39;
            case 3 -> 17;
            case 4 -> 154;
            case 5 -> 27;
            case 6 -> 214;
            case 7 -> 67;
            case 8 -> 24;
            case 9 -> 237;
            case 10 -> 61;
            case 11 -> 38;
            case 12 -> 133;
            case 13 -> 103;
            case 14 -> 178;
            case 15 -> 51;
            case 16 -> 250;
            case 17 -> 134;
            case 18 -> 12;
            case 19 -> 21;
            case 20 -> 72;
            case 21 -> 223;
            case 22 -> 26;
            case 23 -> 136;
            case 24 -> 122;
            case 25 -> 128;
            case 26 -> 59;
            case 27 -> 202;
            case 28 -> 5;
            case 29 -> 86;
            case 30 -> 82;
            case 31 -> 76;
            case 32 -> 32;
            case 33 -> 106;
            case 34 -> 255;
            case 35 -> 219;
            case 36 -> 140;
            case 37 -> 165;
            case 38 -> 129;
            case 39 -> 53;
            case 40 -> 187;
            case 41 -> 96;
            case 42 -> 56;
            case 43 -> 242;
            case 44 -> 132;
            case 45 -> 58;
            case 46 -> 0;
            case 47 -> 85;
            case 48 -> 196;
            case 49 -> 186;
            case 50 -> 37;
            case 51 -> 9;
            case 52 -> 121;
            case 53 -> 66;
            case 54 -> 138;
            case 55 -> 230;
            case 56 -> 190;
            case 57 -> 212;
            case 58 -> 163;
            case 59 -> 105;
            case 60 -> 168;
            case 61 -> 137;
            case 62 -> 175;
            case 63 -> 48;
            case 64 -> 185;
            case 65 -> 114;
            case 66 -> 253;
            case 67 -> 130;
            case 68 -> 68;
            case 69 -> 74;
            case 70 -> 101;
            case 71 -> 195;
            case 72 -> 41;
            case 73 -> 158;
            case 74 -> 189;
            case 75 -> 215;
            case 76 -> 98;
            case 77 -> 222;
            case 78 -> 30;
            case 79 -> 46;
            case 80 -> 248;
            case 81 -> 183;
            case 82 -> 182;
            case 83 -> 107;
            case 84 -> 232;
            case 85 -> 191;
            case 86 -> 197;
            case 87 -> 227;
            case 88 -> 124;
            case 89 -> 84;
            case 90 -> 174;
            case 91 -> 150;
            case 92 -> 69;
            case 93 -> 110;
            case 94 -> 99;
            case 95 -> 169;
            case 96 -> 173;
            case 97 -> 113;
            case 98 -> 198;
            case 99 -> 181;
            case 100 -> 52;
            case 101 -> 204;
            case 102 -> 109;
            case 103 -> 33;
            case 104 -> 123;
            case 105 -> 55;
            case 106 -> 35;
            case 107 -> 102;
            case 108 -> 151;
            case 109 -> 71;
            case 110 -> 246;
            case 111 -> 245;
            case 112 -> 89;
            case 113 -> 92;
            case 114 -> 184;
            case 115 -> 193;
            case 116 -> 73;
            case 117 -> 234;
            case 118 -> 213;
            case 119 -> 200;
            case 120 -> 87;
            case 121 -> 209;
            case 122 -> 210;
            case 123 -> 120;
            case 124 -> 156;
            case 125 -> 57;
            case 126 -> 81;
            case 127 -> 131;
            case 128 -> 135;
            case 129 -> 164;
            case 130 -> 228;
            case 131 -> 180;
            case 132 -> 247;
            case 133 -> 15;
            case 134 -> 45;
            case 135 -> 157;
            case 136 -> 172;
            case 137 -> 6;
            case 138 -> 31;
            case 139 -> 144;
            case 140 -> 62;
            case 141 -> 14;
            case 142 -> 94;
            case 143 -> 208;
            case 144 -> 192;
            case 145 -> 233;
            case 146 -> 34;
            case 147 -> 142;
            case 148 -> 239;
            case 149 -> 126;
            case 150 -> 206;
            case 151 -> 60;
            case 152 -> 13;
            case 153 -> 231;
            case 154 -> 4;
            case 155 -> 235;
            case 156 -> 167;
            case 157 -> 207;
            case 158 -> 155;
            case 159 -> 10;
            case 160 -> 220;
            case 161 -> 252;
            case 162 -> 149;
            case 163 -> 141;
            case 164 -> 70;
            case 165 -> 95;
            case 166 -> 146;
            case 167 -> 236;
            case 168 -> 50;
            case 169 -> 194;
            case 170 -> 147;
            case 171 -> 238;
            case 172 -> 25;
            case 173 -> 148;
            case 174 -> 104;
            case 175 -> 28;
            case 176 -> 77;
            case 177 -> 78;
            case 178 -> 79;
            case 179 -> 153;
            case 180 -> 108;
            case 181 -> 127;
            case 182 -> 90;
            case 183 -> 221;
            case 184 -> 97;
            case 185 -> 16;
            case 186 -> 111;
            case 187 -> 229;
            case 188 -> 211;
            case 189 -> 54;
            case 190 -> 18;
            case 191 -> 243;
            case 192 -> 224;
            case 193 -> 100;
            case 194 -> 152;
            case 195 -> 47;
            case 196 -> 19;
            case 197 -> 3;
            case 198 -> 118;
            case 199 -> 112;
            case 200 -> 249;
            case 201 -> 171;
            case 202 -> 159;
            case 203 -> 162;
            case 204 -> 125;
            case 205 -> 40;
            case 206 -> 49;
            case 207 -> 216;
            case 208 -> 139;
            case 209 -> 119;
            case 210 -> 1;
            case 211 -> 115;
            case 212 -> 240;
            case 213 -> 145;
            case 214 -> 64;
            case 215 -> 225;
            case 216 -> 177;
            case 217 -> 91;
            case 218 -> 93;
            case 219 -> 205;
            case 220 -> 8;
            case 221 -> 166;
            case 222 -> 63;
            case 223 -> 201;
            case 224 -> 116;
            case 225 -> 217;
            case 226 -> 65;
            case 227 -> 143;
            case 228 -> 170;
            case 229 -> 29;
            case 230 -> 161;
            case 231 -> 188;
            case 232 -> 117;
            case 233 -> 218;
            case 234 -> 42;
            case 235 -> 43;
            case 236 -> 251;
            case 237 -> 241;
            case 238 -> 44;
            case 239 -> 254;
            case 240 -> 75;
            case 241 -> 199;
            case 242 -> 88;
            case 243 -> 22;
            case 244 -> 226;
            case 245 -> 80;
            case 246 -> 176;
            case 247 -> 7;
            case 248 -> 179;
            case 249 -> 23;
            case 250 -> 83;
            case 251 -> 2;
            case 252 -> 36;
            case 253 -> 203;
            case 254 -> 244;
            default -> 20;
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
