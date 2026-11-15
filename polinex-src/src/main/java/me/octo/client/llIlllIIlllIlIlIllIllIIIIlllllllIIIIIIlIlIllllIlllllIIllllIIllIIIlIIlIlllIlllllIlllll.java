package me.octo.client;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll
   implements IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl {
   private static String[] b;
   private static String[] c;

   @Override
   public void a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      Object var9 = null; // PX-FIX
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      short var10002 = 6672;
      short var10003 = -5472;
      Intrinsics.checkNotNullParameter(var1, "context");
      boolean var3 = var1.a();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3) {
            var1.p();
         }

         try {
            var1.a((long)100 + var1.a(0, 80));
         }
         catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
         }
      }

      List var4 = IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      int var5 = 80 + var1.a(0, 40);
      Iterator var6 = var4.iterator();

      label50: {
         while (true) {
            if (var6.hasNext()) {
               String var7 = (String)var6.next();
               int var8 = 300 + var1.a(0, 200) + var5 * var7.length();
               try {
                  var1.a((long)var8);
               }
               catch (InterruptedException interruptedException) {
                  throw new RuntimeException(interruptedException);
               }
               if (var2 != null) {
                  break;
               }

               if (var2 == null
                  && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                     != null
                  && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                        .connection
                     != null) {
                  me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                     .connection
                     .sendChat(var7);
                  continue;
               }

               if (var2 == null) {
                  continue;
               }
            }

            var9 = var1;
            if (var2 != null) {
               break label50;
            }

            try {
               var1.a((long)500 + var1.a(0, 200));
            }
            catch (InterruptedException interruptedException) {
               throw new RuntimeException(interruptedException);
            }
            break;
         }

         if (!var3) {
            return;
         }

         var9 = var1;
      }

      ((me.octo.client.PXDyn)var9).n();
   }

   @Override
   public boolean a() {
      return true;
   }

   @NotNull
   @Override
   public String b() {
      short var10000 = 6673;
      short var10001 = 19690;
      return "SendChatComplex";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0005\u0011[ÇGÌ¡\u000ffä\u0001\"*rû!}+ú}E@O";
      int var4 = "\u0005\u0011[ÇGÌ¡\u000ffä\u0001\"*rû!}+ú}E@O".length();
      char var1 = 7;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 100;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 100;
               var10006 = var6;
            } else {
               var13 = 100;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 100;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 17;
                  case 1 -> 71;
                  case 2 -> 80;
                  case 3 -> 19;
                  case 4 -> 8;
                  case 5 -> 60;
                  default -> 29;
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
            b = var5;
            c = new String[2];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 6672) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 112;
            case 1 -> 17;
            case 2 -> 16;
            case 3 -> 212;
            case 4 -> 85;
            case 5 -> 210;
            case 6 -> 10;
            case 7 -> 34;
            case 8 -> 242;
            case 9 -> 39;
            case 10 -> 128;
            case 11 -> 22;
            case 12 -> 191;
            case 13 -> 167;
            case 14 -> 47;
            case 15 -> 236;
            case 16 -> 123;
            case 17 -> 169;
            case 18 -> 165;
            case 19 -> 170;
            case 20 -> 222;
            case 21 -> 198;
            case 22 -> 19;
            case 23 -> 137;
            case 24 -> 53;
            case 25 -> 196;
            case 26 -> 215;
            case 27 -> 36;
            case 28 -> 55;
            case 29 -> 46;
            case 30 -> 223;
            case 31 -> 235;
            case 32 -> 151;
            case 33 -> 0;
            case 34 -> 52;
            case 35 -> 237;
            case 36 -> 83;
            case 37 -> 163;
            case 38 -> 40;
            case 39 -> 214;
            case 40 -> 125;
            case 41 -> 211;
            case 42 -> 84;
            case 43 -> 250;
            case 44 -> 136;
            case 45 -> 56;
            case 46 -> 122;
            case 47 -> 37;
            case 48 -> 244;
            case 49 -> 209;
            case 50 -> 149;
            case 51 -> 185;
            case 52 -> 68;
            case 53 -> 248;
            case 54 -> 35;
            case 55 -> 155;
            case 56 -> 243;
            case 57 -> 78;
            case 58 -> 67;
            case 59 -> 59;
            case 60 -> 238;
            case 61 -> 91;
            case 62 -> 120;
            case 63 -> 118;
            case 64 -> 144;
            case 65 -> 116;
            case 66 -> 126;
            case 67 -> 48;
            case 68 -> 98;
            case 69 -> 156;
            case 70 -> 115;
            case 71 -> 181;
            case 72 -> 166;
            case 73 -> 5;
            case 74 -> 81;
            case 75 -> 158;
            case 76 -> 132;
            case 77 -> 197;
            case 78 -> 206;
            case 79 -> 172;
            case 80 -> 140;
            case 81 -> 96;
            case 82 -> 51;
            case 83 -> 216;
            case 84 -> 183;
            case 85 -> 246;
            case 86 -> 44;
            case 87 -> 60;
            case 88 -> 3;
            case 89 -> 180;
            case 90 -> 146;
            case 91 -> 103;
            case 92 -> 142;
            case 93 -> 154;
            case 94 -> 202;
            case 95 -> 171;
            case 96 -> 203;
            case 97 -> 229;
            case 98 -> 153;
            case 99 -> 50;
            case 100 -> 213;
            case 101 -> 13;
            case 102 -> 28;
            case 103 -> 133;
            case 104 -> 175;
            case 105 -> 21;
            case 106 -> 26;
            case 107 -> 33;
            case 108 -> 104;
            case 109 -> 225;
            case 110 -> 119;
            case 111 -> 240;
            case 112 -> 141;
            case 113 -> 97;
            case 114 -> 95;
            case 115 -> 80;
            case 116 -> 178;
            case 117 -> 114;
            case 118 -> 38;
            case 119 -> 54;
            case 120 -> 188;
            case 121 -> 221;
            case 122 -> 148;
            case 123 -> 64;
            case 124 -> 93;
            case 125 -> 143;
            case 126 -> 157;
            case 127 -> 145;
            case 128 -> 239;
            case 129 -> 135;
            case 130 -> 177;
            case 131 -> 87;
            case 132 -> 25;
            case 133 -> 193;
            case 134 -> 109;
            case 135 -> 205;
            case 136 -> 241;
            case 137 -> 252;
            case 138 -> 249;
            case 139 -> 184;
            case 140 -> 15;
            case 141 -> 9;
            case 142 -> 121;
            case 143 -> 102;
            case 144 -> 20;
            case 145 -> 72;
            case 146 -> 189;
            case 147 -> 8;
            case 148 -> 127;
            case 149 -> 41;
            case 150 -> 207;
            case 151 -> 82;
            case 152 -> 42;
            case 153 -> 219;
            case 154 -> 247;
            case 155 -> 100;
            case 156 -> 45;
            case 157 -> 69;
            case 158 -> 138;
            case 159 -> 134;
            case 160 -> 200;
            case 161 -> 159;
            case 162 -> 199;
            case 163 -> 150;
            case 164 -> 131;
            case 165 -> 110;
            case 166 -> 23;
            case 167 -> 71;
            case 168 -> 227;
            case 169 -> 2;
            case 170 -> 245;
            case 171 -> 24;
            case 172 -> 251;
            case 173 -> 139;
            case 174 -> 113;
            case 175 -> 58;
            case 176 -> 130;
            case 177 -> 204;
            case 178 -> 254;
            case 179 -> 57;
            case 180 -> 168;
            case 181 -> 106;
            case 182 -> 255;
            case 183 -> 61;
            case 184 -> 86;
            case 185 -> 233;
            case 186 -> 173;
            case 187 -> 224;
            case 188 -> 117;
            case 189 -> 31;
            case 190 -> 179;
            case 191 -> 29;
            case 192 -> 147;
            case 193 -> 129;
            case 194 -> 74;
            case 195 -> 43;
            case 196 -> 186;
            case 197 -> 70;
            case 198 -> 99;
            case 199 -> 162;
            case 200 -> 192;
            case 201 -> 226;
            case 202 -> 161;
            case 203 -> 253;
            case 204 -> 4;
            case 205 -> 101;
            case 206 -> 11;
            case 207 -> 208;
            case 208 -> 187;
            case 209 -> 14;
            case 210 -> 231;
            case 211 -> 65;
            case 212 -> 176;
            case 213 -> 63;
            case 214 -> 124;
            case 215 -> 6;
            case 216 -> 190;
            case 217 -> 217;
            case 218 -> 89;
            case 219 -> 107;
            case 220 -> 27;
            case 221 -> 49;
            case 222 -> 111;
            case 223 -> 232;
            case 224 -> 164;
            case 225 -> 230;
            case 226 -> 220;
            case 227 -> 105;
            case 228 -> 77;
            case 229 -> 75;
            case 230 -> 201;
            case 231 -> 152;
            case 232 -> 234;
            case 233 -> 90;
            case 234 -> 32;
            case 235 -> 12;
            case 236 -> 108;
            case 237 -> 66;
            case 238 -> 88;
            case 239 -> 160;
            case 240 -> 76;
            case 241 -> 228;
            case 242 -> 92;
            case 243 -> 94;
            case 244 -> 73;
            case 245 -> 62;
            case 246 -> 1;
            case 247 -> 195;
            case 248 -> 182;
            case 249 -> 218;
            case 250 -> 79;
            case 251 -> 174;
            case 252 -> 30;
            case 253 -> 7;
            case 254 -> 194;
            default -> 18;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }
}
