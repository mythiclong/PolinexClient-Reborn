package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.NotNull;

public final class llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII
   implements IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl {
   private static String[] b;
   private static String[] c;

   @Override
   public void a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var5;
      label25: {
         int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
         short var10002 = 3285;
         short var10003 = 32695;
         Intrinsics.checkNotNullParameter(var1, "context");
         int[] var2 = var10000;
         boolean var3 = var1.a();
         boolean var4 = var3;
         if (var2 == null) {
            if (var3) {
               var1.p();
            }

            try {
               var1.a((long)80 + var1.a(0, 100));
            }
            catch (InterruptedException exception) {
               throw new RuntimeException(exception);
            }
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .execute(llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII::c);
            try {
               var1.a((long)300 + var1.a(0, 250));
            }
            catch (InterruptedException exception) {
               throw new RuntimeException(exception);
            }
            var5 = var1;
            if (var2 != null) {
               break label25;
            }

            try {
               var1.a((long)250 + var1.a(0, 150));
            }
            catch (InterruptedException exception) {
               throw new RuntimeException(exception);
            }
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .execute(llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII::d);
            var4 = var3;
         }

         if (!var4) {
            return;
         }

         var5 = var1;
      }

      var5.n();
   }

   @Override
   public boolean a() {
      return true;
   }

   @NotNull
   @Override
   public String b() {
      short var10000 = 3284;
      short var10001 = 17563;
      return "OpenInventory";
   }

   private static final void c() {
      if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
         != null) {
         LocalPlayer var0 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         boolean var1 = false;
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .setScreen(new InventoryScreen(var0));
      }
   }

   private static final void d() {
      if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
         != null) {
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
            .closeContainer();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "²*È\u0091âè-p>îÏ.\u0015\u0007Õ\u00ad\u0086\u0087mew";
      int var4 = "²*È\u0091âè-p>îÏ.\u0015\u0007Õ\u00ad\u0086\u0087mew".length();
      char var1 = '\r';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 67;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 67;
               var10006 = var6;
            } else {
               var13 = 67;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 67;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 43;
                  case 1 -> 39;
                  case 2 -> 19;
                  case 3 -> 11;
                  case 4 -> 50;
                  case 5 -> 93;
                  default -> 10;
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
      int var2 = (var0 ^ 3284) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 243;
            case 1 -> 103;
            case 2 -> 30;
            case 3 -> 42;
            case 4 -> 145;
            case 5 -> 14;
            case 6 -> 57;
            case 7 -> 73;
            case 8 -> 191;
            case 9 -> 251;
            case 10 -> 156;
            case 11 -> 152;
            case 12 -> 2;
            case 13 -> 52;
            case 14 -> 78;
            case 15 -> 171;
            case 16 -> 197;
            case 17 -> 172;
            case 18 -> 134;
            case 19 -> 161;
            case 20 -> 246;
            case 21 -> 69;
            case 22 -> 70;
            case 23 -> 212;
            case 24 -> 211;
            case 25 -> 175;
            case 26 -> 63;
            case 27 -> 241;
            case 28 -> 200;
            case 29 -> 135;
            case 30 -> 38;
            case 31 -> 81;
            case 32 -> 165;
            case 33 -> 142;
            case 34 -> 220;
            case 35 -> 105;
            case 36 -> 205;
            case 37 -> 221;
            case 38 -> 255;
            case 39 -> 54;
            case 40 -> 48;
            case 41 -> 230;
            case 42 -> 67;
            case 43 -> 239;
            case 44 -> 189;
            case 45 -> 219;
            case 46 -> 74;
            case 47 -> 84;
            case 48 -> 151;
            case 49 -> 170;
            case 50 -> 25;
            case 51 -> 62;
            case 52 -> 254;
            case 53 -> 215;
            case 54 -> 131;
            case 55 -> 37;
            case 56 -> 34;
            case 57 -> 92;
            case 58 -> 1;
            case 59 -> 168;
            case 60 -> 136;
            case 61 -> 49;
            case 62 -> 121;
            case 63 -> 76;
            case 64 -> 110;
            case 65 -> 216;
            case 66 -> 202;
            case 67 -> 40;
            case 68 -> 249;
            case 69 -> 132;
            case 70 -> 53;
            case 71 -> 201;
            case 72 -> 51;
            case 73 -> 233;
            case 74 -> 238;
            case 75 -> 166;
            case 76 -> 35;
            case 77 -> 83;
            case 78 -> 11;
            case 79 -> 111;
            case 80 -> 229;
            case 81 -> 210;
            case 82 -> 167;
            case 83 -> 108;
            case 84 -> 9;
            case 85 -> 252;
            case 86 -> 247;
            case 87 -> 179;
            case 88 -> 169;
            case 89 -> 32;
            case 90 -> 213;
            case 91 -> 22;
            case 92 -> 227;
            case 93 -> 91;
            case 94 -> 224;
            case 95 -> 192;
            case 96 -> 126;
            case 97 -> 100;
            case 98 -> 125;
            case 99 -> 119;
            case 100 -> 164;
            case 101 -> 139;
            case 102 -> 235;
            case 103 -> 181;
            case 104 -> 56;
            case 105 -> 20;
            case 106 -> 160;
            case 107 -> 71;
            case 108 -> 116;
            case 109 -> 113;
            case 110 -> 23;
            case 111 -> 13;
            case 112 -> 204;
            case 113 -> 93;
            case 114 -> 184;
            case 115 -> 194;
            case 116 -> 199;
            case 117 -> 232;
            case 118 -> 148;
            case 119 -> 253;
            case 120 -> 122;
            case 121 -> 118;
            case 122 -> 12;
            case 123 -> 27;
            case 124 -> 43;
            case 125 -> 188;
            case 126 -> 19;
            case 127 -> 120;
            case 128 -> 86;
            case 129 -> 18;
            case 130 -> 185;
            case 131 -> 237;
            case 132 -> 33;
            case 133 -> 154;
            case 134 -> 203;
            case 135 -> 214;
            case 136 -> 58;
            case 137 -> 234;
            case 138 -> 117;
            case 139 -> 4;
            case 140 -> 174;
            case 141 -> 10;
            case 142 -> 39;
            case 143 -> 59;
            case 144 -> 115;
            case 145 -> 46;
            case 146 -> 88;
            case 147 -> 94;
            case 148 -> 61;
            case 149 -> 50;
            case 150 -> 231;
            case 151 -> 225;
            case 152 -> 31;
            case 153 -> 41;
            case 154 -> 190;
            case 155 -> 60;
            case 156 -> 248;
            case 157 -> 21;
            case 158 -> 85;
            case 159 -> 99;
            case 160 -> 245;
            case 161 -> 187;
            case 162 -> 98;
            case 163 -> 24;
            case 164 -> 0;
            case 165 -> 97;
            case 166 -> 7;
            case 167 -> 147;
            case 168 -> 8;
            case 169 -> 16;
            case 170 -> 244;
            case 171 -> 176;
            case 172 -> 102;
            case 173 -> 162;
            case 174 -> 242;
            case 175 -> 29;
            case 176 -> 36;
            case 177 -> 207;
            case 178 -> 208;
            case 179 -> 130;
            case 180 -> 80;
            case 181 -> 90;
            case 182 -> 195;
            case 183 -> 44;
            case 184 -> 206;
            case 185 -> 177;
            case 186 -> 155;
            case 187 -> 218;
            case 188 -> 47;
            case 189 -> 217;
            case 190 -> 140;
            case 191 -> 173;
            case 192 -> 107;
            case 193 -> 104;
            case 194 -> 109;
            case 195 -> 138;
            case 196 -> 153;
            case 197 -> 183;
            case 198 -> 198;
            case 199 -> 96;
            case 200 -> 182;
            case 201 -> 250;
            case 202 -> 159;
            case 203 -> 45;
            case 204 -> 124;
            case 205 -> 240;
            case 206 -> 72;
            case 207 -> 193;
            case 208 -> 112;
            case 209 -> 180;
            case 210 -> 82;
            case 211 -> 26;
            case 212 -> 128;
            case 213 -> 75;
            case 214 -> 149;
            case 215 -> 3;
            case 216 -> 89;
            case 217 -> 157;
            case 218 -> 6;
            case 219 -> 236;
            case 220 -> 17;
            case 221 -> 163;
            case 222 -> 158;
            case 223 -> 228;
            case 224 -> 55;
            case 225 -> 137;
            case 226 -> 150;
            case 227 -> 146;
            case 228 -> 5;
            case 229 -> 15;
            case 230 -> 186;
            case 231 -> 79;
            case 232 -> 28;
            case 233 -> 143;
            case 234 -> 222;
            case 235 -> 223;
            case 236 -> 114;
            case 237 -> 127;
            case 238 -> 101;
            case 239 -> 196;
            case 240 -> 209;
            case 241 -> 66;
            case 242 -> 87;
            case 243 -> 178;
            case 244 -> 77;
            case 245 -> 123;
            case 246 -> 133;
            case 247 -> 68;
            case 248 -> 106;
            case 249 -> 65;
            case 250 -> 64;
            case 251 -> 129;
            case 252 -> 141;
            case 253 -> 95;
            case 254 -> 226;
            default -> 144;
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
