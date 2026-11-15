package me.octo.client.utils;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Optional;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;

public final class lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll {
   private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   public static InputStream a(String var0) {
      short var10000 = -19261;
      short var10001 = -26665;
      return a("polinex", var0);
   }

   public static InputStream a(String var0, String var1) {
      try {
         Identifier var2 = Identifier.fromNamespaceAndPath(var0, var1);
         Optional var3 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .getResourceManager()
            .getResource(var2);
         if (var3.isPresent()) {
            try {
               return ((Resource)var3.get()).open();
            }
            catch (java.io.IOException iOException) {
               throw new RuntimeException(iOException);
            }
         } else {
            short var10003 = -19264;
            short var10004 = -29627;
            InputStream var4 = lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.class
               .getResourceAsStream("/assets/" + var0 + "/" + var1);
            if (var4 != null) {
               return var4;
            } else {
               String var10002 = String.valueOf(var2);
               var10003 = -19262;
               var10004 = -18843;
               try {
                  throw new FileNotFoundException("Resource not found: " + var10002);
               }
               catch (java.io.FileNotFoundException fileNotFoundException) {
                  throw new RuntimeException(fileNotFoundException);
               }
            }
         }
      } catch (Throwable var5) {
         throw var5;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "´\u0019¬Ñ\u009f¢\u0080_l\u001d\u0092\u0016\u0098\u0095\n>ü,d%\u0007^¨\u0088ªü\u001c\u008f";
      int var4 = "´\u0019¬Ñ\u009f¢\u0080_l\u001d\u0092\u0016\u0098\u0095\n>ü,d%\u0007^¨\u0088ªü\u001c\u008f".length();
      char var1 = 20;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 42;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 57;
                     case 1 -> 16;
                     case 2 -> 25;
                     case 3 -> 57;
                     case 4 -> 46;
                     case 5 -> 32;
                     default -> 97;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[4];
                     var10000 = -19263;
                     short var17 = -31119;
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "polinex";
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ª\u008aVÐ;ðýr\u0007\u0087¤XÀ\rºZ";
                  var4 = "ª\u008aVÐ;ðýr\u0007\u0087¤XÀ\rºZ".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 4;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19262) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 245;
            case 1 -> 174;
            case 2 -> 236;
            case 3 -> 96;
            case 4 -> 71;
            case 5 -> 138;
            case 6 -> 187;
            case 7 -> 19;
            case 8 -> 139;
            case 9 -> 6;
            case 10 -> 51;
            case 11 -> 204;
            case 12 -> 221;
            case 13 -> 15;
            case 14 -> 103;
            case 15 -> 152;
            case 16 -> 211;
            case 17 -> 180;
            case 18 -> 16;
            case 19 -> 4;
            case 20 -> 74;
            case 21 -> 85;
            case 22 -> 9;
            case 23 -> 140;
            case 24 -> 235;
            case 25 -> 173;
            case 26 -> 163;
            case 27 -> 133;
            case 28 -> 57;
            case 29 -> 255;
            case 30 -> 115;
            case 31 -> 231;
            case 32 -> 242;
            case 33 -> 34;
            case 34 -> 31;
            case 35 -> 92;
            case 36 -> 110;
            case 37 -> 62;
            case 38 -> 146;
            case 39 -> 250;
            case 40 -> 202;
            case 41 -> 93;
            case 42 -> 168;
            case 43 -> 53;
            case 44 -> 89;
            case 45 -> 67;
            case 46 -> 80;
            case 47 -> 131;
            case 48 -> 175;
            case 49 -> 232;
            case 50 -> 164;
            case 51 -> 2;
            case 52 -> 157;
            case 53 -> 188;
            case 54 -> 104;
            case 55 -> 111;
            case 56 -> 189;
            case 57 -> 54;
            case 58 -> 5;
            case 59 -> 142;
            case 60 -> 84;
            case 61 -> 29;
            case 62 -> 244;
            case 63 -> 166;
            case 64 -> 44;
            case 65 -> 209;
            case 66 -> 220;
            case 67 -> 119;
            case 68 -> 14;
            case 69 -> 107;
            case 70 -> 199;
            case 71 -> 143;
            case 72 -> 160;
            case 73 -> 229;
            case 74 -> 246;
            case 75 -> 39;
            case 76 -> 7;
            case 77 -> 154;
            case 78 -> 36;
            case 79 -> 33;
            case 80 -> 203;
            case 81 -> 10;
            case 82 -> 156;
            case 83 -> 55;
            case 84 -> 83;
            case 85 -> 134;
            case 86 -> 26;
            case 87 -> 222;
            case 88 -> 216;
            case 89 -> 233;
            case 90 -> 253;
            case 91 -> 128;
            case 92 -> 197;
            case 93 -> 12;
            case 94 -> 148;
            case 95 -> 125;
            case 96 -> 52;
            case 97 -> 132;
            case 98 -> 230;
            case 99 -> 251;
            case 100 -> 100;
            case 101 -> 64;
            case 102 -> 46;
            case 103 -> 184;
            case 104 -> 252;
            case 105 -> 195;
            case 106 -> 237;
            case 107 -> 97;
            case 108 -> 13;
            case 109 -> 124;
            case 110 -> 120;
            case 111 -> 87;
            case 112 -> 185;
            case 113 -> 150;
            case 114 -> 88;
            case 115 -> 151;
            case 116 -> 144;
            case 117 -> 79;
            case 118 -> 40;
            case 119 -> 240;
            case 120 -> 178;
            case 121 -> 215;
            case 122 -> 206;
            case 123 -> 17;
            case 124 -> 214;
            case 125 -> 114;
            case 126 -> 219;
            case 127 -> 224;
            case 128 -> 179;
            case 129 -> 208;
            case 130 -> 225;
            case 131 -> 130;
            case 132 -> 161;
            case 133 -> 136;
            case 134 -> 81;
            case 135 -> 182;
            case 136 -> 61;
            case 137 -> 94;
            case 138 -> 105;
            case 139 -> 77;
            case 140 -> 227;
            case 141 -> 43;
            case 142 -> 68;
            case 143 -> 228;
            case 144 -> 126;
            case 145 -> 47;
            case 146 -> 75;
            case 147 -> 73;
            case 148 -> 3;
            case 149 -> 38;
            case 150 -> 116;
            case 151 -> 141;
            case 152 -> 66;
            case 153 -> 239;
            case 154 -> 217;
            case 155 -> 254;
            case 156 -> 118;
            case 157 -> 32;
            case 158 -> 122;
            case 159 -> 213;
            case 160 -> 20;
            case 161 -> 42;
            case 162 -> 86;
            case 163 -> 50;
            case 164 -> 186;
            case 165 -> 170;
            case 166 -> 147;
            case 167 -> 112;
            case 168 -> 198;
            case 169 -> 243;
            case 170 -> 171;
            case 171 -> 27;
            case 172 -> 102;
            case 173 -> 169;
            case 174 -> 45;
            case 175 -> 60;
            case 176 -> 70;
            case 177 -> 98;
            case 178 -> 82;
            case 179 -> 205;
            case 180 -> 123;
            case 181 -> 241;
            case 182 -> 121;
            case 183 -> 91;
            case 184 -> 109;
            case 185 -> 101;
            case 186 -> 167;
            case 187 -> 153;
            case 188 -> 129;
            case 189 -> 155;
            case 190 -> 238;
            case 191 -> 149;
            case 192 -> 191;
            case 193 -> 127;
            case 194 -> 65;
            case 195 -> 90;
            case 196 -> 137;
            case 197 -> 210;
            case 198 -> 69;
            case 199 -> 11;
            case 200 -> 177;
            case 201 -> 22;
            case 202 -> 23;
            case 203 -> 190;
            case 204 -> 212;
            case 205 -> 106;
            case 206 -> 21;
            case 207 -> 145;
            case 208 -> 28;
            case 209 -> 200;
            case 210 -> 159;
            case 211 -> 35;
            case 212 -> 218;
            case 213 -> 37;
            case 214 -> 192;
            case 215 -> 30;
            case 216 -> 41;
            case 217 -> 247;
            case 218 -> 165;
            case 219 -> 58;
            case 220 -> 162;
            case 221 -> 183;
            case 222 -> 99;
            case 223 -> 223;
            case 224 -> 201;
            case 225 -> 158;
            case 226 -> 108;
            case 227 -> 194;
            case 228 -> 176;
            case 229 -> 8;
            case 230 -> 24;
            case 231 -> 59;
            case 232 -> 135;
            case 233 -> 196;
            case 234 -> 76;
            case 235 -> 95;
            case 236 -> 78;
            case 237 -> 18;
            case 238 -> 193;
            case 239 -> 48;
            case 240 -> 56;
            case 241 -> 226;
            case 242 -> 249;
            case 243 -> 248;
            case 244 -> 234;
            case 245 -> 63;
            case 246 -> 0;
            case 247 -> 181;
            case 248 -> 172;
            case 249 -> 25;
            case 250 -> 117;
            case 251 -> 113;
            case 252 -> 1;
            case 253 -> 72;
            case 254 -> 49;
            default -> 207;
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
