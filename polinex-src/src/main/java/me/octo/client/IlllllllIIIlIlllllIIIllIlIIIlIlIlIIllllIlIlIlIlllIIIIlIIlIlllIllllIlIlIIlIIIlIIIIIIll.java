package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -5788;
      short var10002 = 31120;
      var10002 = -5786;
      short var10003 = -946;
      return var10000.a("parseitems", "Parse items from inventory")
         .a(IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll::a)
         .a();
   }

   private static final Unit a(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = -5787;
      short var10002 = 9712;
      Intrinsics.checkNotNullParameter(var0, "context");
      IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ØãÃBKÂnÜ\u0082õ\u0007óyËÙÕG½\u001a\u009d\u0003O^Ú\bAôÑÝ\u00801\u0095ÊÒÐ,³¥ºÈ$|\u009c\u0007\u0002";
      int var4 = "ØãÃBKÂnÜ\u0082õ\u0007óyËÙÕG½\u001a\u009d\u0003O^Ú\bAôÑÝ\u00801\u0095ÊÒÐ,³¥ºÈ$|\u009c\u0007\u0002".length();
      char var1 = '\n';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 104;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 104;
               var10006 = var6;
            } else {
               var13 = 104;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 104;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 15;
                  case 1 -> 82;
                  case 2 -> 80;
                  case 3 -> 47;
                  case 4 -> 5;
                  case 5 -> 126;
                  default -> 127;
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
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -5788) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 91;
            case 1 -> 133;
            case 2 -> 93;
            case 3 -> 216;
            case 4 -> 153;
            case 5 -> 114;
            case 6 -> 43;
            case 7 -> 92;
            case 8 -> 53;
            case 9 -> 222;
            case 10 -> 176;
            case 11 -> 70;
            case 12 -> 218;
            case 13 -> 113;
            case 14 -> 199;
            case 15 -> 64;
            case 16 -> 212;
            case 17 -> 63;
            case 18 -> 244;
            case 19 -> 255;
            case 20 -> 141;
            case 21 -> 197;
            case 22 -> 32;
            case 23 -> 167;
            case 24 -> 118;
            case 25 -> 21;
            case 26 -> 186;
            case 27 -> 213;
            case 28 -> 234;
            case 29 -> 104;
            case 30 -> 119;
            case 31 -> 68;
            case 32 -> 80;
            case 33 -> 221;
            case 34 -> 79;
            case 35 -> 205;
            case 36 -> 25;
            case 37 -> 192;
            case 38 -> 223;
            case 39 -> 142;
            case 40 -> 184;
            case 41 -> 175;
            case 42 -> 36;
            case 43 -> 39;
            case 44 -> 85;
            case 45 -> 228;
            case 46 -> 185;
            case 47 -> 60;
            case 48 -> 24;
            case 49 -> 0;
            case 50 -> 177;
            case 51 -> 169;
            case 52 -> 67;
            case 53 -> 34;
            case 54 -> 109;
            case 55 -> 103;
            case 56 -> 232;
            case 57 -> 136;
            case 58 -> 56;
            case 59 -> 17;
            case 60 -> 166;
            case 61 -> 204;
            case 62 -> 123;
            case 63 -> 117;
            case 64 -> 191;
            case 65 -> 47;
            case 66 -> 14;
            case 67 -> 51;
            case 68 -> 236;
            case 69 -> 159;
            case 70 -> 45;
            case 71 -> 180;
            case 72 -> 248;
            case 73 -> 235;
            case 74 -> 252;
            case 75 -> 3;
            case 76 -> 202;
            case 77 -> 99;
            case 78 -> 82;
            case 79 -> 37;
            case 80 -> 161;
            case 81 -> 81;
            case 82 -> 6;
            case 83 -> 28;
            case 84 -> 215;
            case 85 -> 58;
            case 86 -> 187;
            case 87 -> 210;
            case 88 -> 241;
            case 89 -> 19;
            case 90 -> 170;
            case 91 -> 139;
            case 92 -> 200;
            case 93 -> 214;
            case 94 -> 217;
            case 95 -> 245;
            case 96 -> 29;
            case 97 -> 178;
            case 98 -> 246;
            case 99 -> 23;
            case 100 -> 150;
            case 101 -> 224;
            case 102 -> 179;
            case 103 -> 207;
            case 104 -> 231;
            case 105 -> 15;
            case 106 -> 2;
            case 107 -> 137;
            case 108 -> 171;
            case 109 -> 88;
            case 110 -> 134;
            case 111 -> 233;
            case 112 -> 140;
            case 113 -> 116;
            case 114 -> 66;
            case 115 -> 174;
            case 116 -> 130;
            case 117 -> 75;
            case 118 -> 72;
            case 119 -> 89;
            case 120 -> 120;
            case 121 -> 129;
            case 122 -> 251;
            case 123 -> 61;
            case 124 -> 57;
            case 125 -> 160;
            case 126 -> 16;
            case 127 -> 121;
            case 128 -> 132;
            case 129 -> 126;
            case 130 -> 40;
            case 131 -> 41;
            case 132 -> 108;
            case 133 -> 198;
            case 134 -> 168;
            case 135 -> 220;
            case 136 -> 74;
            case 137 -> 239;
            case 138 -> 206;
            case 139 -> 11;
            case 140 -> 5;
            case 141 -> 50;
            case 142 -> 247;
            case 143 -> 237;
            case 144 -> 13;
            case 145 -> 143;
            case 146 -> 124;
            case 147 -> 111;
            case 148 -> 249;
            case 149 -> 127;
            case 150 -> 181;
            case 151 -> 145;
            case 152 -> 83;
            case 153 -> 254;
            case 154 -> 242;
            case 155 -> 152;
            case 156 -> 188;
            case 157 -> 227;
            case 158 -> 146;
            case 159 -> 155;
            case 160 -> 201;
            case 161 -> 230;
            case 162 -> 122;
            case 163 -> 76;
            case 164 -> 157;
            case 165 -> 4;
            case 166 -> 183;
            case 167 -> 238;
            case 168 -> 77;
            case 169 -> 105;
            case 170 -> 189;
            case 171 -> 110;
            case 172 -> 48;
            case 173 -> 138;
            case 174 -> 128;
            case 175 -> 106;
            case 176 -> 30;
            case 177 -> 87;
            case 178 -> 135;
            case 179 -> 84;
            case 180 -> 225;
            case 181 -> 78;
            case 182 -> 182;
            case 183 -> 10;
            case 184 -> 33;
            case 185 -> 208;
            case 186 -> 203;
            case 187 -> 112;
            case 188 -> 195;
            case 189 -> 95;
            case 190 -> 59;
            case 191 -> 193;
            case 192 -> 94;
            case 193 -> 35;
            case 194 -> 54;
            case 195 -> 52;
            case 196 -> 165;
            case 197 -> 7;
            case 198 -> 219;
            case 199 -> 71;
            case 200 -> 31;
            case 201 -> 62;
            case 202 -> 154;
            case 203 -> 226;
            case 204 -> 172;
            case 205 -> 250;
            case 206 -> 131;
            case 207 -> 190;
            case 208 -> 97;
            case 209 -> 173;
            case 210 -> 158;
            case 211 -> 125;
            case 212 -> 211;
            case 213 -> 240;
            case 214 -> 209;
            case 215 -> 102;
            case 216 -> 229;
            case 217 -> 49;
            case 218 -> 69;
            case 219 -> 196;
            case 220 -> 20;
            case 221 -> 22;
            case 222 -> 26;
            case 223 -> 149;
            case 224 -> 194;
            case 225 -> 46;
            case 226 -> 42;
            case 227 -> 98;
            case 228 -> 163;
            case 229 -> 18;
            case 230 -> 1;
            case 231 -> 107;
            case 232 -> 27;
            case 233 -> 148;
            case 234 -> 151;
            case 235 -> 86;
            case 236 -> 96;
            case 237 -> 100;
            case 238 -> 55;
            case 239 -> 8;
            case 240 -> 253;
            case 241 -> 101;
            case 242 -> 65;
            case 243 -> 162;
            case 244 -> 12;
            case 245 -> 44;
            case 246 -> 144;
            case 247 -> 38;
            case 248 -> 73;
            case 249 -> 9;
            case 250 -> 164;
            case 251 -> 147;
            case 252 -> 115;
            case 253 -> 156;
            case 254 -> 90;
            default -> 243;
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
