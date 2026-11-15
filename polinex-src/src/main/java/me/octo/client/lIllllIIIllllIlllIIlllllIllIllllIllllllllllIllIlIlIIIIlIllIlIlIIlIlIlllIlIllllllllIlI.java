package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.screens.ChatScreen;
import org.jetbrains.annotations.NotNull;

public final class lIllllIIIllllIlllIIlllllIllIllllIllllllllllIllIlIlIIIIlIllIlIlIIlIlIlllIlIllllllllIlI
   implements IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl {
   private static String[] b;
   private static String[] c;

   @Override
   public void a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      short var10002 = -13276;
      short var10003 = 9847;
      Intrinsics.checkNotNullParameter(var1, "context");
      int[] var2 = var10000;
      byte var3 = ((byte)((var1.a()) ? 1 : 0));
      int var5 = var3;
      if (var2 == null) {
         if (var3 != 0) {
            var1.p();
         }

         try {
            var1.a(60 + var1.a(0L, 120L));
         }
         catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
         }
         float var7;
         var5 = (var7 = var1.h() - 0.4F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      label27: {
         String var4 = var5 < 0 ? "/" : "";
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .execute(null);
         try {
            var1.a(80 + var1.a(0L, 180L));
         }
         catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
         }
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .execute(lIllllIIIllllIlllIIlllllIllIllllIllllllllllIllIlIlIIIIlIllIlIlIIlIlIlllIlIllllllllIlI::c);
         lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var6 = var1;
         if (var2 == null) {
            try {
               var1.a(50 + var1.a(0L, 80L));
            }
            catch (InterruptedException interruptedException) {
               throw new RuntimeException(interruptedException);
            }
            if (var3 == 0) {
               break label27;
            }

            var6 = var1;
         }

         var6.n();
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.b(new int[5]);
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @NotNull
   @Override
   public String b() {
      short var10000 = -13275;
      short var10001 = -16396;
      return "AccidentalChat";
   }

   private static final void a(String var0) {
      me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .setScreen(new ChatScreen(var0, false));
   }

   private static final void c() {
      me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .setScreen(null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "¸ZåÊÿÌ#\u000e\u0005÷9ïÉËÞºÕRÃF%¸";
      int var4 = "¸ZåÊÿÌ#\u000e\u0005÷9ïÉËÞºÕRÃF%¸".length();
      char var1 = 7;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 58;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 58;
               var10006 = var6;
            } else {
               var13 = 58;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 58;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 79;
                  case 1 -> 82;
                  case 2 -> 7;
                  case 3 -> 64;
                  case 4 -> 24;
                  case 5 -> 98;
                  default -> 31;
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
      int var2 = (var0 ^ -13276) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 245;
            case 1 -> 166;
            case 2 -> 216;
            case 3 -> 27;
            case 4 -> 82;
            case 5 -> 141;
            case 6 -> 138;
            case 7 -> 165;
            case 8 -> 4;
            case 9 -> 62;
            case 10 -> 183;
            case 11 -> 65;
            case 12 -> 154;
            case 13 -> 28;
            case 14 -> 156;
            case 15 -> 227;
            case 16 -> 241;
            case 17 -> 124;
            case 18 -> 24;
            case 19 -> 142;
            case 20 -> 85;
            case 21 -> 149;
            case 22 -> 135;
            case 23 -> 199;
            case 24 -> 177;
            case 25 -> 200;
            case 26 -> 184;
            case 27 -> 176;
            case 28 -> 180;
            case 29 -> 204;
            case 30 -> 39;
            case 31 -> 90;
            case 32 -> 211;
            case 33 -> 128;
            case 34 -> 73;
            case 35 -> 0;
            case 36 -> 91;
            case 37 -> 104;
            case 38 -> 244;
            case 39 -> 49;
            case 40 -> 52;
            case 41 -> 7;
            case 42 -> 131;
            case 43 -> 1;
            case 44 -> 158;
            case 45 -> 6;
            case 46 -> 16;
            case 47 -> 102;
            case 48 -> 219;
            case 49 -> 18;
            case 50 -> 222;
            case 51 -> 106;
            case 52 -> 136;
            case 53 -> 26;
            case 54 -> 59;
            case 55 -> 139;
            case 56 -> 122;
            case 57 -> 186;
            case 58 -> 44;
            case 59 -> 2;
            case 60 -> 254;
            case 61 -> 120;
            case 62 -> 208;
            case 63 -> 235;
            case 64 -> 215;
            case 65 -> 60;
            case 66 -> 12;
            case 67 -> 187;
            case 68 -> 103;
            case 69 -> 189;
            case 70 -> 212;
            case 71 -> 210;
            case 72 -> 126;
            case 73 -> 92;
            case 74 -> 21;
            case 75 -> 217;
            case 76 -> 153;
            case 77 -> 146;
            case 78 -> 84;
            case 79 -> 117;
            case 80 -> 169;
            case 81 -> 213;
            case 82 -> 253;
            case 83 -> 185;
            case 84 -> 75;
            case 85 -> 178;
            case 86 -> 221;
            case 87 -> 179;
            case 88 -> 152;
            case 89 -> 144;
            case 90 -> 109;
            case 91 -> 43;
            case 92 -> 23;
            case 93 -> 251;
            case 94 -> 38;
            case 95 -> 29;
            case 96 -> 33;
            case 97 -> 145;
            case 98 -> 196;
            case 99 -> 70;
            case 100 -> 147;
            case 101 -> 247;
            case 102 -> 112;
            case 103 -> 94;
            case 104 -> 46;
            case 105 -> 61;
            case 106 -> 71;
            case 107 -> 140;
            case 108 -> 228;
            case 109 -> 209;
            case 110 -> 164;
            case 111 -> 11;
            case 112 -> 195;
            case 113 -> 20;
            case 114 -> 173;
            case 115 -> 175;
            case 116 -> 234;
            case 117 -> 77;
            case 118 -> 68;
            case 119 -> 42;
            case 120 -> 51;
            case 121 -> 64;
            case 122 -> 32;
            case 123 -> 15;
            case 124 -> 226;
            case 125 -> 224;
            case 126 -> 194;
            case 127 -> 159;
            case 128 -> 74;
            case 129 -> 48;
            case 130 -> 248;
            case 131 -> 249;
            case 132 -> 191;
            case 133 -> 192;
            case 134 -> 57;
            case 135 -> 17;
            case 136 -> 129;
            case 137 -> 101;
            case 138 -> 30;
            case 139 -> 230;
            case 140 -> 40;
            case 141 -> 47;
            case 142 -> 36;
            case 143 -> 233;
            case 144 -> 236;
            case 145 -> 56;
            case 146 -> 110;
            case 147 -> 111;
            case 148 -> 99;
            case 149 -> 76;
            case 150 -> 203;
            case 151 -> 188;
            case 152 -> 125;
            case 153 -> 54;
            case 154 -> 83;
            case 155 -> 167;
            case 156 -> 14;
            case 157 -> 223;
            case 158 -> 127;
            case 159 -> 97;
            case 160 -> 151;
            case 161 -> 232;
            case 162 -> 119;
            case 163 -> 238;
            case 164 -> 134;
            case 165 -> 250;
            case 166 -> 58;
            case 167 -> 45;
            case 168 -> 118;
            case 169 -> 108;
            case 170 -> 5;
            case 171 -> 225;
            case 172 -> 53;
            case 173 -> 80;
            case 174 -> 148;
            case 175 -> 79;
            case 176 -> 34;
            case 177 -> 100;
            case 178 -> 132;
            case 179 -> 89;
            case 180 -> 206;
            case 181 -> 193;
            case 182 -> 197;
            case 183 -> 66;
            case 184 -> 81;
            case 185 -> 9;
            case 186 -> 63;
            case 187 -> 174;
            case 188 -> 218;
            case 189 -> 255;
            case 190 -> 168;
            case 191 -> 172;
            case 192 -> 105;
            case 193 -> 162;
            case 194 -> 116;
            case 195 -> 114;
            case 196 -> 171;
            case 197 -> 246;
            case 198 -> 220;
            case 199 -> 229;
            case 200 -> 88;
            case 201 -> 67;
            case 202 -> 161;
            case 203 -> 190;
            case 204 -> 55;
            case 205 -> 201;
            case 206 -> 163;
            case 207 -> 182;
            case 208 -> 123;
            case 209 -> 25;
            case 210 -> 170;
            case 211 -> 237;
            case 212 -> 69;
            case 213 -> 155;
            case 214 -> 242;
            case 215 -> 157;
            case 216 -> 95;
            case 217 -> 98;
            case 218 -> 137;
            case 219 -> 160;
            case 220 -> 107;
            case 221 -> 78;
            case 222 -> 3;
            case 223 -> 205;
            case 224 -> 252;
            case 225 -> 87;
            case 226 -> 202;
            case 227 -> 130;
            case 228 -> 10;
            case 229 -> 37;
            case 230 -> 214;
            case 231 -> 31;
            case 232 -> 96;
            case 233 -> 207;
            case 234 -> 239;
            case 235 -> 35;
            case 236 -> 243;
            case 237 -> 121;
            case 238 -> 113;
            case 239 -> 143;
            case 240 -> 8;
            case 241 -> 181;
            case 242 -> 50;
            case 243 -> 86;
            case 244 -> 115;
            case 245 -> 22;
            case 246 -> 231;
            case 247 -> 19;
            case 248 -> 150;
            case 249 -> 93;
            case 250 -> 41;
            case 251 -> 198;
            case 252 -> 133;
            case 253 -> 13;
            case 254 -> 72;
            default -> 240;
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
