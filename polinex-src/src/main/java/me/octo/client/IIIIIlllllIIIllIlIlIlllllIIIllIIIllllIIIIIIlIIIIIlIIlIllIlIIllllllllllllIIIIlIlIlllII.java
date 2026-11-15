package me.octo.client;

import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;

public class IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII {
   private static String[] a;
   private static String[] b;

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void a(lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      boolean var2 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.c();
      if (!var1.c()) {
         Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (!var2) {
            if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
               == null) {
               return;
            }

            var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var10000.level != null) {
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.a();
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.b();
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.c();
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.d();
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.e();
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.f();
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void a(me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var5 = null; // PX-FIX
      boolean var2 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.c();
      int var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0);
      if (!var2) {
         if ((var10000 == 0)) {
            return;
         }

         var10000 = ((lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0);
      }

      if ((var10000 != 0)) {
         String var3 = var1.k();
         if (!var2) {
            if (var3 == null) {
               return;
            }

            var3 = var1.k();
         }

         label78: {
            short var10001 = 25109;
            short var10002 = 15450;
            var10000 = ((var3.endsWith("'s Profile")) ? 1 : 0);
            if (!var2) {
               if ((var10000 != 0)) {
                  llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .a(
                        (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new me.octo.client.events.impl.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI())
                     );
               }

               var5 = var1;
               if (var2) {
                  break label78;
               }

               String var6 = var1.k();
               var10001 = 25108;
               var10002 = -12606;
               var10000 = ((var6.startsWith("You")) ? 1 : 0);
            }

            if ((var10000 == 0)) {
               return;
            }

            var5 = var1;
         }

         if (!var2) {
            if (((me.octo.client.PXDyn)var5).l() == null) {
               return;
            }

            var5 = var1;
         }

         if (!var2) {
            if (((me.octo.client.PXDyn)var5).m() == null) {
               return;
            }

            var5 = var1;
         }

         var10000 = ((me.octo.client.PXDyn)var5).l();
         if (!var2) {
            if (var10000 != 81) {
               return;
            }

            var10000 = ((var1.m().getFirst().hasItem()) ? 1 : 0);
         }

         if (!var2 && var10000 == 0) {
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(
                  (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new me.octo.client.events.impl.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI())
               );
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "R ü\r\u0095,ZK°\u001d\u0003\u0080\u0082B";
      int var4 = "R ü\r\u0095,ZK°\u001d\u0003\u0080\u0082B".length();
      char var1 = '\n';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 64;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            } else {
               var13 = 64;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 106;
                  case 1 -> 82;
                  case 2 -> 80;
                  case 3 -> 70;
                  case 4 -> 30;
                  case 5 -> 56;
                  default -> 57;
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
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25109) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 4;
            case 1 -> 230;
            case 2 -> 234;
            case 3 -> 109;
            case 4 -> 160;
            case 5 -> 166;
            case 6 -> 255;
            case 7 -> 209;
            case 8 -> 101;
            case 9 -> 104;
            case 10 -> 21;
            case 11 -> 44;
            case 12 -> 186;
            case 13 -> 225;
            case 14 -> 179;
            case 15 -> 218;
            case 16 -> 188;
            case 17 -> 97;
            case 18 -> 249;
            case 19 -> 184;
            case 20 -> 114;
            case 21 -> 142;
            case 22 -> 154;
            case 23 -> 79;
            case 24 -> 27;
            case 25 -> 91;
            case 26 -> 12;
            case 27 -> 134;
            case 28 -> 113;
            case 29 -> 205;
            case 30 -> 19;
            case 31 -> 0;
            case 32 -> 138;
            case 33 -> 105;
            case 34 -> 216;
            case 35 -> 136;
            case 36 -> 83;
            case 37 -> 246;
            case 38 -> 165;
            case 39 -> 77;
            case 40 -> 57;
            case 41 -> 211;
            case 42 -> 18;
            case 43 -> 226;
            case 44 -> 64;
            case 45 -> 54;
            case 46 -> 56;
            case 47 -> 126;
            case 48 -> 203;
            case 49 -> 183;
            case 50 -> 171;
            case 51 -> 28;
            case 52 -> 195;
            case 53 -> 47;
            case 54 -> 58;
            case 55 -> 35;
            case 56 -> 133;
            case 57 -> 238;
            case 58 -> 250;
            case 59 -> 63;
            case 60 -> 16;
            case 61 -> 34;
            case 62 -> 33;
            case 63 -> 65;
            case 64 -> 9;
            case 65 -> 173;
            case 66 -> 123;
            case 67 -> 217;
            case 68 -> 78;
            case 69 -> 220;
            case 70 -> 254;
            case 71 -> 52;
            case 72 -> 1;
            case 73 -> 13;
            case 74 -> 147;
            case 75 -> 228;
            case 76 -> 200;
            case 77 -> 187;
            case 78 -> 6;
            case 79 -> 31;
            case 80 -> 92;
            case 81 -> 106;
            case 82 -> 76;
            case 83 -> 213;
            case 84 -> 242;
            case 85 -> 71;
            case 86 -> 53;
            case 87 -> 144;
            case 88 -> 129;
            case 89 -> 128;
            case 90 -> 60;
            case 91 -> 152;
            case 92 -> 175;
            case 93 -> 159;
            case 94 -> 210;
            case 95 -> 66;
            case 96 -> 204;
            case 97 -> 172;
            case 98 -> 86;
            case 99 -> 46;
            case 100 -> 181;
            case 101 -> 244;
            case 102 -> 102;
            case 103 -> 116;
            case 104 -> 36;
            case 105 -> 212;
            case 106 -> 72;
            case 107 -> 177;
            case 108 -> 110;
            case 109 -> 185;
            case 110 -> 51;
            case 111 -> 232;
            case 112 -> 5;
            case 113 -> 103;
            case 114 -> 139;
            case 115 -> 75;
            case 116 -> 132;
            case 117 -> 153;
            case 118 -> 235;
            case 119 -> 62;
            case 120 -> 251;
            case 121 -> 117;
            case 122 -> 111;
            case 123 -> 59;
            case 124 -> 151;
            case 125 -> 198;
            case 126 -> 163;
            case 127 -> 37;
            case 128 -> 122;
            case 129 -> 141;
            case 130 -> 202;
            case 131 -> 223;
            case 132 -> 239;
            case 133 -> 32;
            case 134 -> 192;
            case 135 -> 99;
            case 136 -> 190;
            case 137 -> 215;
            case 138 -> 95;
            case 139 -> 161;
            case 140 -> 120;
            case 141 -> 221;
            case 142 -> 74;
            case 143 -> 124;
            case 144 -> 157;
            case 145 -> 224;
            case 146 -> 30;
            case 147 -> 149;
            case 148 -> 89;
            case 149 -> 189;
            case 150 -> 158;
            case 151 -> 67;
            case 152 -> 125;
            case 153 -> 61;
            case 154 -> 20;
            case 155 -> 191;
            case 156 -> 180;
            case 157 -> 96;
            case 158 -> 137;
            case 159 -> 201;
            case 160 -> 194;
            case 161 -> 140;
            case 162 -> 121;
            case 163 -> 231;
            case 164 -> 127;
            case 165 -> 214;
            case 166 -> 247;
            case 167 -> 73;
            case 168 -> 168;
            case 169 -> 119;
            case 170 -> 207;
            case 171 -> 108;
            case 172 -> 100;
            case 173 -> 24;
            case 174 -> 240;
            case 175 -> 17;
            case 176 -> 148;
            case 177 -> 252;
            case 178 -> 15;
            case 179 -> 39;
            case 180 -> 55;
            case 181 -> 48;
            case 182 -> 93;
            case 183 -> 70;
            case 184 -> 155;
            case 185 -> 174;
            case 186 -> 193;
            case 187 -> 167;
            case 188 -> 98;
            case 189 -> 90;
            case 190 -> 135;
            case 191 -> 69;
            case 192 -> 3;
            case 193 -> 85;
            case 194 -> 241;
            case 195 -> 222;
            case 196 -> 236;
            case 197 -> 8;
            case 198 -> 199;
            case 199 -> 170;
            case 200 -> 41;
            case 201 -> 2;
            case 202 -> 248;
            case 203 -> 253;
            case 204 -> 29;
            case 205 -> 14;
            case 206 -> 88;
            case 207 -> 80;
            case 208 -> 11;
            case 209 -> 94;
            case 210 -> 40;
            case 211 -> 145;
            case 212 -> 237;
            case 213 -> 10;
            case 214 -> 112;
            case 215 -> 26;
            case 216 -> 68;
            case 217 -> 243;
            case 218 -> 25;
            case 219 -> 115;
            case 220 -> 245;
            case 221 -> 156;
            case 222 -> 208;
            case 223 -> 81;
            case 224 -> 196;
            case 225 -> 23;
            case 226 -> 197;
            case 227 -> 169;
            case 228 -> 164;
            case 229 -> 38;
            case 230 -> 49;
            case 231 -> 182;
            case 232 -> 150;
            case 233 -> 143;
            case 234 -> 146;
            case 235 -> 229;
            case 236 -> 87;
            case 237 -> 131;
            case 238 -> 82;
            case 239 -> 45;
            case 240 -> 43;
            case 241 -> 22;
            case 242 -> 50;
            case 243 -> 227;
            case 244 -> 233;
            case 245 -> 118;
            case 246 -> 178;
            case 247 -> 219;
            case 248 -> 84;
            case 249 -> 42;
            case 250 -> 206;
            case 251 -> 162;
            case 252 -> 107;
            case 253 -> 176;
            case 254 -> 130;
            default -> 7;
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
