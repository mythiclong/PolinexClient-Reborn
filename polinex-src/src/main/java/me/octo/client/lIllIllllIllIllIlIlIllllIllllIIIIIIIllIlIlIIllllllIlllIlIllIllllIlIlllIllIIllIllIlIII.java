package me.octo.client;

import me.octo.client.events.impl.base.annotations.SubscribeEvent;

public class lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   private final me.octo.client.utils.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.utils.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI();
   private static String[] a;
   private static String[] d;

   public lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var1) {
      int[] var10000 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      short var10001 = -14471;
      short var10002 = 21320;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f("Closed Trade GUI with a player");
      int[] var2 = var10000;

      while (true) {
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .screen
            != null) {
            me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .screen
               .onClose();
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(3000L, true)) {
            short var3 = -14472;
            var10001 = -32405;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.n("TradeGUIFailsafe");
         }
         break;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Êª¬8zúp§dú+\u007f)·\u0010,lmÈÄã\u0006DuJîÒ\u00936j\u0010\u0096ðÜ¹»\u001c=!\"\u0094\\»8!80";
      int var4 = "Êª¬8zúp§dú+\u007f)·\u0010,lmÈÄã\u0006DuJîÒ\u00936j\u0010\u0096ðÜ¹»\u001c=!\"\u0094\\»8!80".length();
      char var1 = 30;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 38;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 38;
               var10006 = var6;
            } else {
               var13 = 38;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 38;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 34;
                  case 1 -> 120;
                  case 2 -> 23;
                  case 3 -> 18;
                  case 4 -> 8;
                  case 5 -> 36;
                  default -> 53;
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
            d = new String[2];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -14471) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 40;
            case 1 -> 195;
            case 2 -> 141;
            case 3 -> 52;
            case 4 -> 146;
            case 5 -> 73;
            case 6 -> 53;
            case 7 -> 154;
            case 8 -> 7;
            case 9 -> 103;
            case 10 -> 12;
            case 11 -> 193;
            case 12 -> 109;
            case 13 -> 75;
            case 14 -> 139;
            case 15 -> 47;
            case 16 -> 13;
            case 17 -> 107;
            case 18 -> 72;
            case 19 -> 70;
            case 20 -> 147;
            case 21 -> 153;
            case 22 -> 5;
            case 23 -> 155;
            case 24 -> 83;
            case 25 -> 9;
            case 26 -> 163;
            case 27 -> 186;
            case 28 -> 37;
            case 29 -> 224;
            case 30 -> 241;
            case 31 -> 80;
            case 32 -> 26;
            case 33 -> 148;
            case 34 -> 220;
            case 35 -> 79;
            case 36 -> 133;
            case 37 -> 71;
            case 38 -> 180;
            case 39 -> 115;
            case 40 -> 27;
            case 41 -> 55;
            case 42 -> 222;
            case 43 -> 228;
            case 44 -> 176;
            case 45 -> 214;
            case 46 -> 229;
            case 47 -> 59;
            case 48 -> 131;
            case 49 -> 28;
            case 50 -> 6;
            case 51 -> 78;
            case 52 -> 135;
            case 53 -> 54;
            case 54 -> 96;
            case 55 -> 204;
            case 56 -> 2;
            case 57 -> 202;
            case 58 -> 219;
            case 59 -> 174;
            case 60 -> 126;
            case 61 -> 243;
            case 62 -> 50;
            case 63 -> 42;
            case 64 -> 162;
            case 65 -> 134;
            case 66 -> 25;
            case 67 -> 16;
            case 68 -> 217;
            case 69 -> 45;
            case 70 -> 173;
            case 71 -> 62;
            case 72 -> 211;
            case 73 -> 232;
            case 74 -> 43;
            case 75 -> 198;
            case 76 -> 152;
            case 77 -> 121;
            case 78 -> 60;
            case 79 -> 170;
            case 80 -> 90;
            case 81 -> 177;
            case 82 -> 122;
            case 83 -> 124;
            case 84 -> 77;
            case 85 -> 132;
            case 86 -> 140;
            case 87 -> 208;
            case 88 -> 218;
            case 89 -> 151;
            case 90 -> 242;
            case 91 -> 199;
            case 92 -> 192;
            case 93 -> 239;
            case 94 -> 129;
            case 95 -> 111;
            case 96 -> 104;
            case 97 -> 112;
            case 98 -> 244;
            case 99 -> 22;
            case 100 -> 110;
            case 101 -> 183;
            case 102 -> 24;
            case 103 -> 167;
            case 104 -> 191;
            case 105 -> 247;
            case 106 -> 234;
            case 107 -> 74;
            case 108 -> 116;
            case 109 -> 215;
            case 110 -> 123;
            case 111 -> 97;
            case 112 -> 223;
            case 113 -> 178;
            case 114 -> 91;
            case 115 -> 236;
            case 116 -> 164;
            case 117 -> 225;
            case 118 -> 29;
            case 119 -> 189;
            case 120 -> 38;
            case 121 -> 57;
            case 122 -> 233;
            case 123 -> 184;
            case 124 -> 11;
            case 125 -> 158;
            case 126 -> 169;
            case 127 -> 64;
            case 128 -> 246;
            case 129 -> 197;
            case 130 -> 207;
            case 131 -> 250;
            case 132 -> 190;
            case 133 -> 65;
            case 134 -> 92;
            case 135 -> 88;
            case 136 -> 102;
            case 137 -> 8;
            case 138 -> 14;
            case 139 -> 240;
            case 140 -> 108;
            case 141 -> 238;
            case 142 -> 1;
            case 143 -> 46;
            case 144 -> 210;
            case 145 -> 20;
            case 146 -> 165;
            case 147 -> 34;
            case 148 -> 161;
            case 149 -> 105;
            case 150 -> 100;
            case 151 -> 248;
            case 152 -> 58;
            case 153 -> 4;
            case 154 -> 93;
            case 155 -> 157;
            case 156 -> 166;
            case 157 -> 35;
            case 158 -> 32;
            case 159 -> 67;
            case 160 -> 86;
            case 161 -> 48;
            case 162 -> 230;
            case 163 -> 181;
            case 164 -> 127;
            case 165 -> 61;
            case 166 -> 200;
            case 167 -> 99;
            case 168 -> 175;
            case 169 -> 95;
            case 170 -> 172;
            case 171 -> 23;
            case 172 -> 56;
            case 173 -> 130;
            case 174 -> 41;
            case 175 -> 245;
            case 176 -> 82;
            case 177 -> 119;
            case 178 -> 81;
            case 179 -> 76;
            case 180 -> 226;
            case 181 -> 160;
            case 182 -> 235;
            case 183 -> 87;
            case 184 -> 0;
            case 185 -> 106;
            case 186 -> 138;
            case 187 -> 15;
            case 188 -> 201;
            case 189 -> 206;
            case 190 -> 19;
            case 191 -> 51;
            case 192 -> 125;
            case 193 -> 69;
            case 194 -> 10;
            case 195 -> 44;
            case 196 -> 94;
            case 197 -> 113;
            case 198 -> 84;
            case 199 -> 3;
            case 200 -> 63;
            case 201 -> 136;
            case 202 -> 185;
            case 203 -> 253;
            case 204 -> 168;
            case 205 -> 101;
            case 206 -> 187;
            case 207 -> 30;
            case 208 -> 39;
            case 209 -> 150;
            case 210 -> 66;
            case 211 -> 194;
            case 212 -> 221;
            case 213 -> 120;
            case 214 -> 17;
            case 215 -> 31;
            case 216 -> 205;
            case 217 -> 85;
            case 218 -> 213;
            case 219 -> 118;
            case 220 -> 216;
            case 221 -> 143;
            case 222 -> 227;
            case 223 -> 171;
            case 224 -> 21;
            case 225 -> 159;
            case 226 -> 249;
            case 227 -> 33;
            case 228 -> 36;
            case 229 -> 252;
            case 230 -> 156;
            case 231 -> 68;
            case 232 -> 114;
            case 233 -> 49;
            case 234 -> 145;
            case 235 -> 196;
            case 236 -> 128;
            case 237 -> 188;
            case 238 -> 144;
            case 239 -> 137;
            case 240 -> 98;
            case 241 -> 142;
            case 242 -> 237;
            case 243 -> 182;
            case 244 -> 209;
            case 245 -> 255;
            case 246 -> 212;
            case 247 -> 254;
            case 248 -> 251;
            case 249 -> 117;
            case 250 -> 179;
            case 251 -> 89;
            case 252 -> 149;
            case 253 -> 18;
            case 254 -> 203;
            default -> 231;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
}
