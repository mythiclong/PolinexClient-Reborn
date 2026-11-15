package me.octo.client;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ClientboundDisconnectPacket;
import org.jetbrains.annotations.NotNull;

public final class lIllllIIllIlllIlIlIlIlIIlllllllllIllIIlllIllIlIIIIlllIIIllIllIllllIlIIIIIIIlIIlllIlII {
   @NotNull
   public static lIllllIIllIlllIlIlIlIlIIlllllllllIllIIlllIllIlIIIIlllIIIllIllIllllIlIIIIIIIlIIlllIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private lIllllIIllIlllIlIlIlIlIIlllllllllIllIIlllIllIlIIIIlllIIIllIllIllllIlIIIIIIIlIIlllIlII() {
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = llIIlIIIlllIIIIlllIIIlIllIlIlIIlIIIllIlllllIlIIIlllIllIlllIlIlIlllIIIllllIllIllllIIIl.b();
      short var10002 = -1714;
      short var10003 = 25880;
      Intrinsics.checkNotNullParameter(var1, "event");
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      Packet var6 = var3;
      if (var2 == null) {
         if (!(var3 instanceof ClientboundDisconnectPacket)) {
            return;
         }

         var6 = var3;
      }

      String var7 = ((ClientboundDisconnectPacket)var6).reason().getString();
      var10002 = -1718;
      var10003 = -4923;
      Intrinsics.checkNotNullExpressionValue(var7, "getString(...)");
      String var4 = var7;
      short var10001 = -1717;
      var10002 = 18283;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
         "Disconnect packet received. Reason: " + var4
      );
      short var8 = -1719;
      var10001 = 25102;
      Pair[] var5 = new Pair[2];
      var10003 = -1720;
      short var10004 = 7590;
      var10004 = -1716;
      short var10005 = 30550;
      var5[0] = TuplesKt.to("title", "Disconnected from Server");
      var10003 = -1713;
      var10004 = 30999;
      var5[1] = TuplesKt.to("description", var4);
      me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("disconnect", MapsKt.mapOf(var5), true, true);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "ð\u0093\u0019T\b\u0099ú²ä%\u0085\u0002-ê$\u0003\u001a'Ø3\"âQ\u0004o\u0013Â\u007f-\u001aWÉ¿\u0014îµ¢H\u0013\u0094\u001b-ÃÏ¡x2\u0088mÁý\u0005÷{\u0088û+\nÔ\u008dù*è|\u0099\u009ak\u0016\u0005T\u0018ÞiÃ";
      int var4 = "ð\u0093\u0019T\b\u0099ú²ä%\u0085\u0002-ê$\u0003\u001a'Ø3\"âQ\u0004o\u0013Â\u007f-\u001aWÉ¿\u0014îµ¢H\u0013\u0094\u001b-ÃÏ¡x2\u0088mÁý\u0005÷{\u0088û+\nÔ\u008dù*è|\u0099\u009ak\u0016\u0005T\u0018ÞiÃ"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 3;
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
                     case 0 -> 55;
                     case 1 -> 63;
                     case 2 -> 125;
                     case 3 -> 56;
                     case 4 -> 105;
                     case 5 -> 60;
                     default -> 38;
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
                     b = new String[7];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllllIIllIlllIlIlIlIlIIlllllllllIllIIlllIllIlIIIIlllIIIllIllIllllIlIIIIIIIlIIlllIlII();
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0000k½¥£T\u008e·\u0080EX\u0018Ë\u0011àg\u0015\u000bøª\u0099Î;<\b¿Zt<No\u000e\u0010s\u001d\u0082";
                  var4 = "\u0000k½¥£T\u008e·\u0080EX\u0018Ë\u0011àg\u0015\u000bøª\u0099Î;<\b¿Zt<No\u000e\u0010s\u001d\u0082".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 87;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1718) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 44;
            case 1 -> 61;
            case 2 -> 33;
            case 3 -> 176;
            case 4 -> 31;
            case 5 -> 161;
            case 6 -> 185;
            case 7 -> 15;
            case 8 -> 190;
            case 9 -> 39;
            case 10 -> 58;
            case 11 -> 209;
            case 12 -> 143;
            case 13 -> 220;
            case 14 -> 83;
            case 15 -> 222;
            case 16 -> 35;
            case 17 -> 234;
            case 18 -> 164;
            case 19 -> 20;
            case 20 -> 238;
            case 21 -> 63;
            case 22 -> 160;
            case 23 -> 69;
            case 24 -> 36;
            case 25 -> 249;
            case 26 -> 199;
            case 27 -> 14;
            case 28 -> 5;
            case 29 -> 101;
            case 30 -> 245;
            case 31 -> 78;
            case 32 -> 112;
            case 33 -> 21;
            case 34 -> 168;
            case 35 -> 148;
            case 36 -> 86;
            case 37 -> 87;
            case 38 -> 105;
            case 39 -> 111;
            case 40 -> 122;
            case 41 -> 106;
            case 42 -> 166;
            case 43 -> 51;
            case 44 -> 243;
            case 45 -> 213;
            case 46 -> 150;
            case 47 -> 189;
            case 48 -> 156;
            case 49 -> 134;
            case 50 -> 11;
            case 51 -> 149;
            case 52 -> 130;
            case 53 -> 204;
            case 54 -> 60;
            case 55 -> 248;
            case 56 -> 211;
            case 57 -> 81;
            case 58 -> 109;
            case 59 -> 76;
            case 60 -> 173;
            case 61 -> 218;
            case 62 -> 203;
            case 63 -> 198;
            case 64 -> 118;
            case 65 -> 10;
            case 66 -> 41;
            case 67 -> 48;
            case 68 -> 62;
            case 69 -> 235;
            case 70 -> 152;
            case 71 -> 253;
            case 72 -> 124;
            case 73 -> 131;
            case 74 -> 129;
            case 75 -> 108;
            case 76 -> 114;
            case 77 -> 237;
            case 78 -> 219;
            case 79 -> 77;
            case 80 -> 200;
            case 81 -> 80;
            case 82 -> 158;
            case 83 -> 88;
            case 84 -> 7;
            case 85 -> 194;
            case 86 -> 37;
            case 87 -> 212;
            case 88 -> 254;
            case 89 -> 178;
            case 90 -> 75;
            case 91 -> 99;
            case 92 -> 1;
            case 93 -> 170;
            case 94 -> 113;
            case 95 -> 54;
            case 96 -> 19;
            case 97 -> 210;
            case 98 -> 117;
            case 99 -> 91;
            case 100 -> 50;
            case 101 -> 68;
            case 102 -> 159;
            case 103 -> 252;
            case 104 -> 45;
            case 105 -> 64;
            case 106 -> 157;
            case 107 -> 224;
            case 108 -> 120;
            case 109 -> 32;
            case 110 -> 196;
            case 111 -> 17;
            case 112 -> 24;
            case 113 -> 9;
            case 114 -> 102;
            case 115 -> 236;
            case 116 -> 4;
            case 117 -> 3;
            case 118 -> 184;
            case 119 -> 43;
            case 120 -> 187;
            case 121 -> 42;
            case 122 -> 47;
            case 123 -> 30;
            case 124 -> 125;
            case 125 -> 169;
            case 126 -> 136;
            case 127 -> 183;
            case 128 -> 232;
            case 129 -> 246;
            case 130 -> 26;
            case 131 -> 95;
            case 132 -> 127;
            case 133 -> 67;
            case 134 -> 119;
            case 135 -> 123;
            case 136 -> 172;
            case 137 -> 115;
            case 138 -> 216;
            case 139 -> 71;
            case 140 -> 98;
            case 141 -> 197;
            case 142 -> 13;
            case 143 -> 250;
            case 144 -> 28;
            case 145 -> 242;
            case 146 -> 181;
            case 147 -> 140;
            case 148 -> 214;
            case 149 -> 70;
            case 150 -> 155;
            case 151 -> 25;
            case 152 -> 96;
            case 153 -> 66;
            case 154 -> 55;
            case 155 -> 167;
            case 156 -> 89;
            case 157 -> 110;
            case 158 -> 73;
            case 159 -> 90;
            case 160 -> 56;
            case 161 -> 97;
            case 162 -> 142;
            case 163 -> 84;
            case 164 -> 6;
            case 165 -> 241;
            case 166 -> 8;
            case 167 -> 18;
            case 168 -> 251;
            case 169 -> 162;
            case 170 -> 85;
            case 171 -> 103;
            case 172 -> 23;
            case 173 -> 121;
            case 174 -> 144;
            case 175 -> 53;
            case 176 -> 228;
            case 177 -> 107;
            case 178 -> 182;
            case 179 -> 244;
            case 180 -> 188;
            case 181 -> 38;
            case 182 -> 179;
            case 183 -> 191;
            case 184 -> 132;
            case 185 -> 207;
            case 186 -> 229;
            case 187 -> 186;
            case 188 -> 137;
            case 189 -> 177;
            case 190 -> 72;
            case 191 -> 206;
            case 192 -> 65;
            case 193 -> 92;
            case 194 -> 40;
            case 195 -> 239;
            case 196 -> 34;
            case 197 -> 135;
            case 198 -> 46;
            case 199 -> 93;
            case 200 -> 0;
            case 201 -> 175;
            case 202 -> 202;
            case 203 -> 193;
            case 204 -> 151;
            case 205 -> 226;
            case 206 -> 171;
            case 207 -> 49;
            case 208 -> 141;
            case 209 -> 16;
            case 210 -> 230;
            case 211 -> 104;
            case 212 -> 215;
            case 213 -> 165;
            case 214 -> 59;
            case 215 -> 27;
            case 216 -> 153;
            case 217 -> 174;
            case 218 -> 223;
            case 219 -> 94;
            case 220 -> 231;
            case 221 -> 240;
            case 222 -> 195;
            case 223 -> 52;
            case 224 -> 138;
            case 225 -> 29;
            case 226 -> 126;
            case 227 -> 2;
            case 228 -> 221;
            case 229 -> 201;
            case 230 -> 255;
            case 231 -> 22;
            case 232 -> 147;
            case 233 -> 163;
            case 234 -> 208;
            case 235 -> 79;
            case 236 -> 217;
            case 237 -> 133;
            case 238 -> 116;
            case 239 -> 154;
            case 240 -> 233;
            case 241 -> 205;
            case 242 -> 139;
            case 243 -> 82;
            case 244 -> 74;
            case 245 -> 100;
            case 246 -> 247;
            case 247 -> 227;
            case 248 -> 225;
            case 249 -> 192;
            case 250 -> 12;
            case 251 -> 146;
            case 252 -> 57;
            case 253 -> 145;
            case 254 -> 180;
            default -> 128;
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
