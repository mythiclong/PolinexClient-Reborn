package me.octo.client;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll
   implements IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl {
   private static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] b;
   private static String[] c;

   @Override
   public void a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      short var10001 = 26721;
      short var10002 = -15943;
      Intrinsics.checkNotNullParameter(var1, "context");
      int[] var10000 = c();
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

      List var4 = lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      boolean var9 = var4.isEmpty();
      if (var2 == null) {
         var9 = !var9;
      }

      String var10;
      if (var9) {
         var10 = (String)var4.get(var1.a(0, var4.size()));
      } else {
         List var6 = lIlIlIIIlllIlllIIIlIIIlIIlIIIlIllllllllIlIlIIlllIllIIIllllIlllIIIIlIIlIIIIIlllIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
         var10 = (String)var6.get(var1.a(0, var6.size()));
      }

      String var5 = var10;
      int var8 = 80 + var1.a(0, 40);
      int var7 = 300 + var1.a(0, 200) + var8 * var5.length();
      try {
         var1.a((long)var7);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
               .connection
            != null) {
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
            .connection
            .sendChat(var5);
      }

      label38: {
         lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var11 = var1;
         if (var2 == null) {
            try {
               var1.a((long)500 + var1.a(0, 200));
            }
            catch (InterruptedException interruptedException) {
               throw new RuntimeException(interruptedException);
            }
            if (!var3) {
               break label38;
            }

            var11 = var1;
         }

         var11.n();
      }

      if (var2 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
         );
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @NotNull
   @Override
   public String b() {
      short var10000 = 26720;
      short var10001 = -14603;
      return "SendChat";
   }

   public static void b(int[] var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
   }

   public static int[] c() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "¦1\"Ã\u0012\u0013BQ\u0007©ëõÃÎ\u0011.";
      int var4 = "¦1\"Ã\u0012\u0013BQ\u0007©ëõÃÎ\u0011.".length();
      b(null);
      char var1 = '\b';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 92;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 92;
               var10006 = var6;
            } else {
               var13 = 92;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 92;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 58;
                  case 1 -> 108;
                  case 2 -> 49;
                  case 3 -> 18;
                  case 4 -> 71;
                  case 5 -> 126;
                  default -> 117;
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
      int var2 = (var0 ^ 26720) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 180;
            case 1 -> 136;
            case 2 -> 55;
            case 3 -> 158;
            case 4 -> 48;
            case 5 -> 60;
            case 6 -> 219;
            case 7 -> 57;
            case 8 -> 155;
            case 9 -> 6;
            case 10 -> 110;
            case 11 -> 207;
            case 12 -> 233;
            case 13 -> 253;
            case 14 -> 115;
            case 15 -> 89;
            case 16 -> 86;
            case 17 -> 198;
            case 18 -> 10;
            case 19 -> 178;
            case 20 -> 25;
            case 21 -> 249;
            case 22 -> 45;
            case 23 -> 33;
            case 24 -> 82;
            case 25 -> 227;
            case 26 -> 53;
            case 27 -> 123;
            case 28 -> 240;
            case 29 -> 8;
            case 30 -> 223;
            case 31 -> 214;
            case 32 -> 7;
            case 33 -> 84;
            case 34 -> 61;
            case 35 -> 212;
            case 36 -> 250;
            case 37 -> 24;
            case 38 -> 58;
            case 39 -> 95;
            case 40 -> 129;
            case 41 -> 139;
            case 42 -> 19;
            case 43 -> 187;
            case 44 -> 14;
            case 45 -> 108;
            case 46 -> 91;
            case 47 -> 74;
            case 48 -> 186;
            case 49 -> 141;
            case 50 -> 168;
            case 51 -> 133;
            case 52 -> 126;
            case 53 -> 189;
            case 54 -> 17;
            case 55 -> 122;
            case 56 -> 137;
            case 57 -> 70;
            case 58 -> 0;
            case 59 -> 11;
            case 60 -> 56;
            case 61 -> 43;
            case 62 -> 132;
            case 63 -> 145;
            case 64 -> 26;
            case 65 -> 165;
            case 66 -> 208;
            case 67 -> 99;
            case 68 -> 142;
            case 69 -> 66;
            case 70 -> 200;
            case 71 -> 103;
            case 72 -> 252;
            case 73 -> 106;
            case 74 -> 2;
            case 75 -> 146;
            case 76 -> 244;
            case 77 -> 162;
            case 78 -> 65;
            case 79 -> 37;
            case 80 -> 238;
            case 81 -> 215;
            case 82 -> 111;
            case 83 -> 175;
            case 84 -> 94;
            case 85 -> 64;
            case 86 -> 88;
            case 87 -> 128;
            case 88 -> 151;
            case 89 -> 119;
            case 90 -> 51;
            case 91 -> 173;
            case 92 -> 166;
            case 93 -> 161;
            case 94 -> 92;
            case 95 -> 242;
            case 96 -> 147;
            case 97 -> 239;
            case 98 -> 71;
            case 99 -> 39;
            case 100 -> 120;
            case 101 -> 100;
            case 102 -> 152;
            case 103 -> 191;
            case 104 -> 193;
            case 105 -> 202;
            case 106 -> 21;
            case 107 -> 127;
            case 108 -> 79;
            case 109 -> 42;
            case 110 -> 232;
            case 111 -> 182;
            case 112 -> 104;
            case 113 -> 38;
            case 114 -> 52;
            case 115 -> 197;
            case 116 -> 23;
            case 117 -> 4;
            case 118 -> 183;
            case 119 -> 170;
            case 120 -> 211;
            case 121 -> 1;
            case 122 -> 171;
            case 123 -> 117;
            case 124 -> 93;
            case 125 -> 83;
            case 126 -> 116;
            case 127 -> 75;
            case 128 -> 96;
            case 129 -> 135;
            case 130 -> 124;
            case 131 -> 30;
            case 132 -> 85;
            case 133 -> 50;
            case 134 -> 44;
            case 135 -> 114;
            case 136 -> 210;
            case 137 -> 153;
            case 138 -> 149;
            case 139 -> 167;
            case 140 -> 176;
            case 141 -> 31;
            case 142 -> 251;
            case 143 -> 113;
            case 144 -> 73;
            case 145 -> 190;
            case 146 -> 148;
            case 147 -> 195;
            case 148 -> 63;
            case 149 -> 12;
            case 150 -> 118;
            case 151 -> 177;
            case 152 -> 121;
            case 153 -> 107;
            case 154 -> 192;
            case 155 -> 255;
            case 156 -> 248;
            case 157 -> 163;
            case 158 -> 138;
            case 159 -> 221;
            case 160 -> 76;
            case 161 -> 77;
            case 162 -> 140;
            case 163 -> 3;
            case 164 -> 20;
            case 165 -> 27;
            case 166 -> 245;
            case 167 -> 229;
            case 168 -> 46;
            case 169 -> 131;
            case 170 -> 254;
            case 171 -> 29;
            case 172 -> 68;
            case 173 -> 222;
            case 174 -> 16;
            case 175 -> 234;
            case 176 -> 97;
            case 177 -> 150;
            case 178 -> 5;
            case 179 -> 156;
            case 180 -> 87;
            case 181 -> 15;
            case 182 -> 185;
            case 183 -> 125;
            case 184 -> 9;
            case 185 -> 159;
            case 186 -> 105;
            case 187 -> 164;
            case 188 -> 18;
            case 189 -> 59;
            case 190 -> 157;
            case 191 -> 174;
            case 192 -> 98;
            case 193 -> 81;
            case 194 -> 143;
            case 195 -> 225;
            case 196 -> 102;
            case 197 -> 213;
            case 198 -> 90;
            case 199 -> 241;
            case 200 -> 109;
            case 201 -> 184;
            case 202 -> 47;
            case 203 -> 160;
            case 204 -> 237;
            case 205 -> 62;
            case 206 -> 209;
            case 207 -> 13;
            case 208 -> 231;
            case 209 -> 196;
            case 210 -> 54;
            case 211 -> 204;
            case 212 -> 144;
            case 213 -> 201;
            case 214 -> 247;
            case 215 -> 36;
            case 216 -> 236;
            case 217 -> 32;
            case 218 -> 205;
            case 219 -> 78;
            case 220 -> 69;
            case 221 -> 243;
            case 222 -> 188;
            case 223 -> 220;
            case 224 -> 28;
            case 225 -> 134;
            case 226 -> 218;
            case 227 -> 40;
            case 228 -> 112;
            case 229 -> 154;
            case 230 -> 194;
            case 231 -> 80;
            case 232 -> 224;
            case 233 -> 130;
            case 234 -> 226;
            case 235 -> 199;
            case 236 -> 235;
            case 237 -> 230;
            case 238 -> 203;
            case 239 -> 67;
            case 240 -> 72;
            case 241 -> 34;
            case 242 -> 181;
            case 243 -> 216;
            case 244 -> 217;
            case 245 -> 179;
            case 246 -> 35;
            case 247 -> 41;
            case 248 -> 101;
            case 249 -> 228;
            case 250 -> 22;
            case 251 -> 206;
            case 252 -> 169;
            case 253 -> 49;
            case 254 -> 172;
            default -> 246;
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
