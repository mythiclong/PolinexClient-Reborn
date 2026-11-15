package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll {
   @NotNull
   public static IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll() {
   }

   public final boolean a() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      boolean var10000 = IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      if (var1 == null) {
         if (!var10000) {
            StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
            int var3 = 2;
            int var4 = Math.min(var2.length, 6);

            while (true) {
               if (var3 < var4) {
                  StackTraceElement var5 = var2[var3];
                  String var6 = var5.getClassName();
                  Intrinsics.checkNotNull(var6);
                  short var10001 = 15491;
                  short var10002 = -4091;
                  var10000 = StringsKt.startsWith(var6, "java.lang.reflect.", false);
                  if (var1 != null) {
                     return var10000;
                  }

                  if (var1 != null) {
                     return var10000;
                  }

                  if (var10000) {
                     break;
                  }

                  var10001 = 15490;
                  var10002 = 15308;
                  var10000 = StringsKt.startsWith(var6, "sun.reflect.", false);
                  if (var1 != null) {
                     return var10000;
                  }

                  if (var10000) {
                     break;
                  }

                  var3++;
                  if (var1 == null) {
                     continue;
                  }
               }

               return false;
            }

            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\f\u0013èÙÐN$\u0016EwÆ;ÖvE§-B\fÓy1M¬s{\u009bKÉCC";
      int var4 = "\f\u0013èÙÐN$\u0016EwÆ;ÖvE§-B\fÓy1M¬s{\u009bKÉCC".length();
      char var1 = 18;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 127;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 127;
               var10006 = var6;
            } else {
               var13 = 127;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 127;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 109;
                  case 1 -> 82;
                  case 2 -> 5;
                  case 3 -> 77;
                  case 4 -> 107;
                  case 5 -> 109;
                  default -> 73;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15491) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 47;
            case 1 -> 244;
            case 2 -> 60;
            case 3 -> 85;
            case 4 -> 168;
            case 5 -> 50;
            case 6 -> 198;
            case 7 -> 250;
            case 8 -> 106;
            case 9 -> 183;
            case 10 -> 115;
            case 11 -> 3;
            case 12 -> 186;
            case 13 -> 226;
            case 14 -> 83;
            case 15 -> 181;
            case 16 -> 21;
            case 17 -> 123;
            case 18 -> 236;
            case 19 -> 48;
            case 20 -> 144;
            case 21 -> 41;
            case 22 -> 217;
            case 23 -> 138;
            case 24 -> 129;
            case 25 -> 104;
            case 26 -> 243;
            case 27 -> 86;
            case 28 -> 67;
            case 29 -> 7;
            case 30 -> 145;
            case 31 -> 126;
            case 32 -> 8;
            case 33 -> 81;
            case 34 -> 241;
            case 35 -> 156;
            case 36 -> 210;
            case 37 -> 233;
            case 38 -> 157;
            case 39 -> 130;
            case 40 -> 66;
            case 41 -> 176;
            case 42 -> 208;
            case 43 -> 231;
            case 44 -> 57;
            case 45 -> 132;
            case 46 -> 159;
            case 47 -> 114;
            case 48 -> 105;
            case 49 -> 202;
            case 50 -> 101;
            case 51 -> 72;
            case 52 -> 18;
            case 53 -> 92;
            case 54 -> 22;
            case 55 -> 20;
            case 56 -> 1;
            case 57 -> 53;
            case 58 -> 175;
            case 59 -> 165;
            case 60 -> 245;
            case 61 -> 93;
            case 62 -> 218;
            case 63 -> 69;
            case 64 -> 216;
            case 65 -> 43;
            case 66 -> 12;
            case 67 -> 204;
            case 68 -> 90;
            case 69 -> 10;
            case 70 -> 137;
            case 71 -> 102;
            case 72 -> 110;
            case 73 -> 213;
            case 74 -> 237;
            case 75 -> 15;
            case 76 -> 169;
            case 77 -> 206;
            case 78 -> 134;
            case 79 -> 29;
            case 80 -> 173;
            case 81 -> 9;
            case 82 -> 155;
            case 83 -> 160;
            case 84 -> 239;
            case 85 -> 196;
            case 86 -> 232;
            case 87 -> 150;
            case 88 -> 52;
            case 89 -> 91;
            case 90 -> 70;
            case 91 -> 118;
            case 92 -> 34;
            case 93 -> 77;
            case 94 -> 71;
            case 95 -> 249;
            case 96 -> 224;
            case 97 -> 147;
            case 98 -> 215;
            case 99 -> 120;
            case 100 -> 247;
            case 101 -> 199;
            case 102 -> 248;
            case 103 -> 35;
            case 104 -> 189;
            case 105 -> 74;
            case 106 -> 229;
            case 107 -> 221;
            case 108 -> 149;
            case 109 -> 230;
            case 110 -> 205;
            case 111 -> 131;
            case 112 -> 141;
            case 113 -> 45;
            case 114 -> 11;
            case 115 -> 100;
            case 116 -> 227;
            case 117 -> 68;
            case 118 -> 166;
            case 119 -> 65;
            case 120 -> 25;
            case 121 -> 0;
            case 122 -> 94;
            case 123 -> 30;
            case 124 -> 200;
            case 125 -> 122;
            case 126 -> 89;
            case 127 -> 56;
            case 128 -> 40;
            case 129 -> 182;
            case 130 -> 197;
            case 131 -> 31;
            case 132 -> 61;
            case 133 -> 222;
            case 134 -> 142;
            case 135 -> 28;
            case 136 -> 174;
            case 137 -> 219;
            case 138 -> 171;
            case 139 -> 136;
            case 140 -> 63;
            case 141 -> 80;
            case 142 -> 82;
            case 143 -> 235;
            case 144 -> 139;
            case 145 -> 73;
            case 146 -> 153;
            case 147 -> 117;
            case 148 -> 146;
            case 149 -> 194;
            case 150 -> 62;
            case 151 -> 152;
            case 152 -> 37;
            case 153 -> 158;
            case 154 -> 49;
            case 155 -> 16;
            case 156 -> 5;
            case 157 -> 112;
            case 158 -> 119;
            case 159 -> 17;
            case 160 -> 98;
            case 161 -> 209;
            case 162 -> 238;
            case 163 -> 242;
            case 164 -> 143;
            case 165 -> 177;
            case 166 -> 124;
            case 167 -> 32;
            case 168 -> 111;
            case 169 -> 76;
            case 170 -> 140;
            case 171 -> 2;
            case 172 -> 211;
            case 173 -> 44;
            case 174 -> 99;
            case 175 -> 190;
            case 176 -> 103;
            case 177 -> 58;
            case 178 -> 161;
            case 179 -> 42;
            case 180 -> 207;
            case 181 -> 113;
            case 182 -> 6;
            case 183 -> 24;
            case 184 -> 64;
            case 185 -> 33;
            case 186 -> 55;
            case 187 -> 188;
            case 188 -> 240;
            case 189 -> 79;
            case 190 -> 184;
            case 191 -> 228;
            case 192 -> 180;
            case 193 -> 26;
            case 194 -> 154;
            case 195 -> 178;
            case 196 -> 84;
            case 197 -> 125;
            case 198 -> 212;
            case 199 -> 255;
            case 200 -> 167;
            case 201 -> 225;
            case 202 -> 151;
            case 203 -> 192;
            case 204 -> 253;
            case 205 -> 96;
            case 206 -> 220;
            case 207 -> 234;
            case 208 -> 179;
            case 209 -> 187;
            case 210 -> 88;
            case 211 -> 170;
            case 212 -> 163;
            case 213 -> 97;
            case 214 -> 135;
            case 215 -> 195;
            case 216 -> 252;
            case 217 -> 223;
            case 218 -> 116;
            case 219 -> 51;
            case 220 -> 201;
            case 221 -> 164;
            case 222 -> 13;
            case 223 -> 39;
            case 224 -> 172;
            case 225 -> 108;
            case 226 -> 121;
            case 227 -> 203;
            case 228 -> 193;
            case 229 -> 75;
            case 230 -> 4;
            case 231 -> 254;
            case 232 -> 191;
            case 233 -> 78;
            case 234 -> 27;
            case 235 -> 109;
            case 236 -> 95;
            case 237 -> 14;
            case 238 -> 38;
            case 239 -> 36;
            case 240 -> 54;
            case 241 -> 46;
            case 242 -> 59;
            case 243 -> 107;
            case 244 -> 246;
            case 245 -> 133;
            case 246 -> 185;
            case 247 -> 214;
            case 248 -> 162;
            case 249 -> 87;
            case 250 -> 148;
            case 251 -> 127;
            case 252 -> 19;
            case 253 -> 251;
            case 254 -> 128;
            default -> 23;
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
