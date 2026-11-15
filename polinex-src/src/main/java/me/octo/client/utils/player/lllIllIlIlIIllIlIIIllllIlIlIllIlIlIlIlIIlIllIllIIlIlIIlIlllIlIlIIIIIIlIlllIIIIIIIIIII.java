package me.octo.client.utils.player;

import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl;
import me.octo.client.IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI;
import me.octo.client.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll;
import me.octo.client.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
import me.octo.client.utils.IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl;
import me.octo.client.utils.llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

public final class lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII {
   @NotNull
   public static lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII() {
   }

   public final void a(@NotNull String var1, boolean var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = -23357;
      short var10003 = 10699;
      Intrinsics.checkNotNullParameter(var1, "message");
      var10002 = -23356;
      var10003 = -29713;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f("CHAT MENTION FAILSAFE: " + var1);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      short var10001 = -23359;
      var10002 = 25622;
      Component var10 = var3 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
               != null
         ? me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
            .getName()
         : null;
      var10003 = -23354;
      short var10004 = 12689;
      var10004 = -23355;
      short var10005 = 15354;
      IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a("Staff Check", "Please return to the game on: " + var10 + " account.");
      boolean var4 = IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .ae();
      if (var3 != null) {
         if (var4) {
            llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI.a(
               lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
                  .al()
            );
         }

         short var5 = -23353;
         var10001 = 28038;
         var10001 = -23360;
         var10002 = 14009;
         var10003 = -23358;
         var10004 = -3213;
         me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
            "failsafe_triggered", MapsKt.mapOf(TuplesKt.to("reason", "Mentioned in Chat: " + var1)), true, true
         );
         var4 = var2;
      }

      if (var3 != null) {
         if (var4) {
            IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               );
         }

         var4 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .ae();
      }

      if (var4) {
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .a();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "ty,\r\u0002\t\u008a\u0004x\u0017\u0012°Í\u000f\u0017 ¥4©\u00ad¨|AhÇn8òdó\u0086@¹\u0012+ØC6¸\u0094J0\u0018^É¿°òr\u0003\u00074\u001e},u\tóÛeJIä\u0099óTD×gÅ\u0016\u0013\u008f\u0001ÕÁ¹\u001c0÷jÌj\u000bP¨·\u0085:è\u0088Ûû\u0098Ñ\u0006¼+/Ó Û";
      int var4 = "ty,\r\u0002\t\u008a\u0004x\u0017\u0012°Í\u000f\u0017 ¥4©\u00ad¨|AhÇn8òdó\u0086@¹\u0012+ØC6¸\u0094J0\u0018^É¿°òr\u0003\u00074\u001e},u\tóÛeJIä\u0099óTD×gÅ\u0016\u0013\u008f\u0001ÕÁ¹\u001c0÷jÌj\u000bP¨·\u0085:è\u0088Ûû\u0098Ñ\u0006¼+/Ó Û"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 93;
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
                     case 0 -> 25;
                     case 1 -> 20;
                     case 2 -> 48;
                     case 3 -> 120;
                     case 4 -> 23;
                     case 5 -> 43;
                     default -> 50;
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
                     a = var5;
                     b = new String[8];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "C\u0098uî~>\u008a\u0013pÕ*@#\u0004#¦L\u0093O\u0094\u0014\u001f\u000fF^ø½";
                  var4 = "C\u0098uî~>\u008a\u0013pÕ*@#\u0004#¦L\u0093O\u0094\u0014\u001f\u000fF^ø½".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -23355) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 76;
            case 1 -> 216;
            case 2 -> 49;
            case 3 -> 18;
            case 4 -> 57;
            case 5 -> 13;
            case 6 -> 192;
            case 7 -> 124;
            case 8 -> 186;
            case 9 -> 148;
            case 10 -> 9;
            case 11 -> 215;
            case 12 -> 155;
            case 13 -> 107;
            case 14 -> 149;
            case 15 -> 44;
            case 16 -> 99;
            case 17 -> 163;
            case 18 -> 130;
            case 19 -> 224;
            case 20 -> 207;
            case 21 -> 180;
            case 22 -> 200;
            case 23 -> 238;
            case 24 -> 209;
            case 25 -> 226;
            case 26 -> 212;
            case 27 -> 129;
            case 28 -> 179;
            case 29 -> 127;
            case 30 -> 225;
            case 31 -> 254;
            case 32 -> 86;
            case 33 -> 206;
            case 34 -> 12;
            case 35 -> 170;
            case 36 -> 132;
            case 37 -> 221;
            case 38 -> 41;
            case 39 -> 252;
            case 40 -> 151;
            case 41 -> 88;
            case 42 -> 43;
            case 43 -> 122;
            case 44 -> 242;
            case 45 -> 237;
            case 46 -> 30;
            case 47 -> 141;
            case 48 -> 234;
            case 49 -> 220;
            case 50 -> 106;
            case 51 -> 134;
            case 52 -> 33;
            case 53 -> 120;
            case 54 -> 32;
            case 55 -> 131;
            case 56 -> 77;
            case 57 -> 40;
            case 58 -> 55;
            case 59 -> 152;
            case 60 -> 71;
            case 61 -> 42;
            case 62 -> 0;
            case 63 -> 243;
            case 64 -> 187;
            case 65 -> 19;
            case 66 -> 80;
            case 67 -> 138;
            case 68 -> 219;
            case 69 -> 157;
            case 70 -> 190;
            case 71 -> 82;
            case 72 -> 58;
            case 73 -> 27;
            case 74 -> 250;
            case 75 -> 133;
            case 76 -> 241;
            case 77 -> 143;
            case 78 -> 95;
            case 79 -> 4;
            case 80 -> 194;
            case 81 -> 185;
            case 82 -> 222;
            case 83 -> 191;
            case 84 -> 228;
            case 85 -> 177;
            case 86 -> 218;
            case 87 -> 54;
            case 88 -> 93;
            case 89 -> 116;
            case 90 -> 211;
            case 91 -> 101;
            case 92 -> 111;
            case 93 -> 159;
            case 94 -> 11;
            case 95 -> 23;
            case 96 -> 16;
            case 97 -> 214;
            case 98 -> 173;
            case 99 -> 78;
            case 100 -> 25;
            case 101 -> 66;
            case 102 -> 246;
            case 103 -> 147;
            case 104 -> 37;
            case 105 -> 96;
            case 106 -> 21;
            case 107 -> 202;
            case 108 -> 72;
            case 109 -> 61;
            case 110 -> 123;
            case 111 -> 125;
            case 112 -> 94;
            case 113 -> 68;
            case 114 -> 83;
            case 115 -> 119;
            case 116 -> 112;
            case 117 -> 75;
            case 118 -> 176;
            case 119 -> 100;
            case 120 -> 81;
            case 121 -> 59;
            case 122 -> 195;
            case 123 -> 45;
            case 124 -> 247;
            case 125 -> 239;
            case 126 -> 8;
            case 127 -> 28;
            case 128 -> 118;
            case 129 -> 121;
            case 130 -> 146;
            case 131 -> 10;
            case 132 -> 184;
            case 133 -> 198;
            case 134 -> 140;
            case 135 -> 193;
            case 136 -> 15;
            case 137 -> 189;
            case 138 -> 70;
            case 139 -> 20;
            case 140 -> 166;
            case 141 -> 230;
            case 142 -> 60;
            case 143 -> 65;
            case 144 -> 97;
            case 145 -> 161;
            case 146 -> 114;
            case 147 -> 144;
            case 148 -> 167;
            case 149 -> 160;
            case 150 -> 74;
            case 151 -> 79;
            case 152 -> 145;
            case 153 -> 210;
            case 154 -> 110;
            case 155 -> 84;
            case 156 -> 137;
            case 157 -> 168;
            case 158 -> 244;
            case 159 -> 251;
            case 160 -> 181;
            case 161 -> 7;
            case 162 -> 56;
            case 163 -> 196;
            case 164 -> 231;
            case 165 -> 178;
            case 166 -> 199;
            case 167 -> 174;
            case 168 -> 85;
            case 169 -> 50;
            case 170 -> 104;
            case 171 -> 3;
            case 172 -> 150;
            case 173 -> 98;
            case 174 -> 89;
            case 175 -> 208;
            case 176 -> 36;
            case 177 -> 171;
            case 178 -> 172;
            case 179 -> 14;
            case 180 -> 236;
            case 181 -> 90;
            case 182 -> 69;
            case 183 -> 63;
            case 184 -> 139;
            case 185 -> 135;
            case 186 -> 46;
            case 187 -> 115;
            case 188 -> 136;
            case 189 -> 229;
            case 190 -> 108;
            case 191 -> 51;
            case 192 -> 240;
            case 193 -> 2;
            case 194 -> 105;
            case 195 -> 34;
            case 196 -> 175;
            case 197 -> 62;
            case 198 -> 48;
            case 199 -> 203;
            case 200 -> 91;
            case 201 -> 223;
            case 202 -> 249;
            case 203 -> 248;
            case 204 -> 162;
            case 205 -> 245;
            case 206 -> 126;
            case 207 -> 92;
            case 208 -> 204;
            case 209 -> 39;
            case 210 -> 188;
            case 211 -> 164;
            case 212 -> 67;
            case 213 -> 87;
            case 214 -> 165;
            case 215 -> 232;
            case 216 -> 217;
            case 217 -> 35;
            case 218 -> 6;
            case 219 -> 158;
            case 220 -> 253;
            case 221 -> 22;
            case 222 -> 24;
            case 223 -> 73;
            case 224 -> 227;
            case 225 -> 183;
            case 226 -> 64;
            case 227 -> 26;
            case 228 -> 205;
            case 229 -> 53;
            case 230 -> 52;
            case 231 -> 153;
            case 232 -> 17;
            case 233 -> 235;
            case 234 -> 154;
            case 235 -> 103;
            case 236 -> 38;
            case 237 -> 128;
            case 238 -> 5;
            case 239 -> 169;
            case 240 -> 156;
            case 241 -> 182;
            case 242 -> 29;
            case 243 -> 1;
            case 244 -> 233;
            case 245 -> 31;
            case 246 -> 117;
            case 247 -> 197;
            case 248 -> 47;
            case 249 -> 142;
            case 250 -> 255;
            case 251 -> 213;
            case 252 -> 102;
            case 253 -> 109;
            case 254 -> 201;
            default -> 113;
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
