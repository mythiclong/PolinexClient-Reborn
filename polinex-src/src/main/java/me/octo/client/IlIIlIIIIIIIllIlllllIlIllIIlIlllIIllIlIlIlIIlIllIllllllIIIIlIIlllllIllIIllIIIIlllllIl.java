package me.octo.client;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.jetbrains.annotations.NotNull;

public final class IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final Map<String, String> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final Pattern lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl() {
      short var10001 = -25679;
      short var10002 = 26389;
      var10002 = -25668;
      short var10003 = -22287;
      short var10004 = -25666;
      short var10005 = -5556;
      super(
         "Escrow Fix",
         "Reopens AH and BZ automatically when escrow fails",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         "Fixes"
      );
      Pair[] var1 = new Pair[4];
      var10003 = -25675;
      var10004 = -7036;
      var10004 = -25665;
      var10005 = 9189;
      var1[0] = TuplesKt.to("There was an error with the auction house! (AUCTION_EXPIRED_OR_NOT_FOUND)", "ah");
      var10003 = -25676;
      var10004 = -29143;
      var10004 = -25678;
      var10005 = -20283;
      var1[1] = TuplesKt.to("There was an error with the auction house! (INVALID_BID)", "ah");
      var10003 = -25673;
      var10004 = -23392;
      var10004 = -25678;
      var10005 = -20283;
      var1[2] = TuplesKt.to("Claiming BIN auction...", "ah");
      var10003 = -25667;
      var10004 = -29491;
      var10004 = -25678;
      var10005 = -20283;
      var1[3] = TuplesKt.to("Visit the Auction House to collect your item!", "ah");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = MapsKt.mapOf(var1);
      var10001 = -25677;
      var10002 = 5957;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = Pattern.compile(
         "Escrow refunded (\\d+) coins for Bazaar Instant Buy Submit!"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      int var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      short var10002 = -25680;
      short var10003 = 22920;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Packet var9 = var3;
      if (var2 != 0) {
         if (!(var3 instanceof ClientboundSystemChatPacket)) {
            return;
         }

         var9 = var3;
      }

      String var10 = ((ClientboundSystemChatPacket)var9).content().tryCollapseToString();
      if (var10 != null) {
         String var4 = var10;
         String var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var4);
         String var11 = var5;
         if (var2 != 0) {
            if (var5 == null) {
               Matcher var6 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.matcher(var4);
               if (var6.matches()) {
                  short var12 = -25674;
                  short var10001 = 30472;
                  var5 = "bz";
               }
            }

            var11 = var5;
         }

         if (var11 != null) {
            String var7 = var11;
            boolean var8 = false;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/" + var7);
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "Yú\u0017Pi\u009cN\u001fÛ\u008adG\u0099nÛ²Z;ð\u0014\u0093»g\u001c]Ó8\u008aÙ6ÇÆÛ¡\u0002KñþØ\u008d\u001aÛmô\b\u0090u\u0098\u007fªé¯ÝU9>ã58l\u00ad`+Rò±\u0003·\u009b#ËÕñ Ç\u0013äv\u007f«¾\u0004YIJ\u009c.oÅÎÁ G¥\u007fR½KÝG4M\u0088Ý\u009bjÊK£\u0089Ô³\u000e²3\u0012¬èx\u0083QçÑ¡»Ï¢Aí»;ãÂÑã\u001fU£(©1\u0085¦éûäAöFÑÚ\u000e\u009fÝ'\u0095\u0096\u0002o\u0007:¬®ÇQ4^ã\u001c¨\u0005BÈÈ\u0018©\u007f)|ÀL\u001eÛ9ìªÝ]ÿì!\u0099má×\u008bê°¾\u0090\u000eg\u0015\u0007K¨»:ðÑQTó0\u0089\u008f±yÆ\u0005¹qG\u0013ù\n*¤\u0017\u0010.v -Ì\u008f\u0005e&\u0086\u000ex\u00021p";
      int var4 = "Yú\u0017Pi\u009cN\u001fÛ\u008adG\u0099nÛ²Z;ð\u0014\u0093»g\u001c]Ó8\u008aÙ6ÇÆÛ¡\u0002KñþØ\u008d\u001aÛmô\b\u0090u\u0098\u007fªé¯ÝU9>ã58l\u00ad`+Rò±\u0003·\u009b#ËÕñ Ç\u0013äv\u007f«¾\u0004YIJ\u009c.oÅÎÁ G¥\u007fR½KÝG4M\u0088Ý\u009bjÊK£\u0089Ô³\u000e²3\u0012¬èx\u0083QçÑ¡»Ï¢Aí»;ãÂÑã\u001fU£(©1\u0085¦éûäAöFÑÚ\u000e\u009fÝ'\u0095\u0096\u0002o\u0007:¬®ÇQ4^ã\u001c¨\u0005BÈÈ\u0018©\u007f)|ÀL\u001eÛ9ìªÝ]ÿì!\u0099má×\u008bê°¾\u0090\u000eg\u0015\u0007K¨»:ðÑQTó0\u0089\u008f±yÆ\u0005¹qG\u0013ù\n*¤\u0017\u0010.v -Ì\u008f\u0005e&\u0086\u000ex\u00021p"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 11;
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
                     case 0 -> 85;
                     case 1 -> 95;
                     case 2 -> 28;
                     case 3 -> 106;
                     case 4 -> 69;
                     case 5 -> 24;
                     default -> 5;
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
                     f = var5;
                     g = new String[12];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl();
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

                  var2 = "~\u0098\u008c©2òÓ\t[y!K¹o`:FnüK\u0089\tÛöÌ¾×ÝMç\u0005>Å\\kTùxkáÕs%±opjøU-\u0099íè\u00930Á§ \u0016eI¹ô·,\u001e\u009bbÜÐ\u0080?ÓîÄÒ\u0095\u0094-\u008c\u007f\u0016)¨%B\u0092_¡T¶õ#T¸";
                  var4 = "~\u0098\u008c©2òÓ\t[y!K¹o`:FnüK\u0089\tÛöÌ¾×ÝMç\u0005>Å\\kTùxkáÕs%±opjøU-\u0099íè\u00930Á§ \u0016eI¹ô·,\u001e\u009bbÜÐ\u0080?ÓîÄÒ\u0095\u0094-\u008c\u007f\u0016)¨%B\u0092_¡T¶õ#T¸"
                     .length();
                  var1 = '1';
                  var8 = -1;
            }

            var10000 = 111;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25674) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 82;
            case 1 -> 19;
            case 2 -> 217;
            case 3 -> 243;
            case 4 -> 186;
            case 5 -> 187;
            case 6 -> 145;
            case 7 -> 163;
            case 8 -> 200;
            case 9 -> 18;
            case 10 -> 160;
            case 11 -> 54;
            case 12 -> 116;
            case 13 -> 153;
            case 14 -> 83;
            case 15 -> 149;
            case 16 -> 236;
            case 17 -> 134;
            case 18 -> 239;
            case 19 -> 61;
            case 20 -> 68;
            case 21 -> 91;
            case 22 -> 16;
            case 23 -> 225;
            case 24 -> 72;
            case 25 -> 249;
            case 26 -> 143;
            case 27 -> 193;
            case 28 -> 223;
            case 29 -> 252;
            case 30 -> 181;
            case 31 -> 132;
            case 32 -> 241;
            case 33 -> 201;
            case 34 -> 129;
            case 35 -> 222;
            case 36 -> 139;
            case 37 -> 158;
            case 38 -> 172;
            case 39 -> 212;
            case 40 -> 63;
            case 41 -> 115;
            case 42 -> 183;
            case 43 -> 12;
            case 44 -> 123;
            case 45 -> 113;
            case 46 -> 94;
            case 47 -> 44;
            case 48 -> 110;
            case 49 -> 117;
            case 50 -> 11;
            case 51 -> 204;
            case 52 -> 179;
            case 53 -> 167;
            case 54 -> 17;
            case 55 -> 7;
            case 56 -> 224;
            case 57 -> 15;
            case 58 -> 55;
            case 59 -> 207;
            case 60 -> 211;
            case 61 -> 251;
            case 62 -> 57;
            case 63 -> 237;
            case 64 -> 157;
            case 65 -> 64;
            case 66 -> 180;
            case 67 -> 90;
            case 68 -> 219;
            case 69 -> 4;
            case 70 -> 164;
            case 71 -> 1;
            case 72 -> 40;
            case 73 -> 79;
            case 74 -> 248;
            case 75 -> 208;
            case 76 -> 148;
            case 77 -> 127;
            case 78 -> 92;
            case 79 -> 235;
            case 80 -> 240;
            case 81 -> 161;
            case 82 -> 174;
            case 83 -> 126;
            case 84 -> 214;
            case 85 -> 124;
            case 86 -> 51;
            case 87 -> 95;
            case 88 -> 135;
            case 89 -> 85;
            case 90 -> 182;
            case 91 -> 104;
            case 92 -> 234;
            case 93 -> 247;
            case 94 -> 177;
            case 95 -> 65;
            case 96 -> 122;
            case 97 -> 38;
            case 98 -> 34;
            case 99 -> 185;
            case 100 -> 250;
            case 101 -> 175;
            case 102 -> 191;
            case 103 -> 84;
            case 104 -> 189;
            case 105 -> 147;
            case 106 -> 59;
            case 107 -> 112;
            case 108 -> 140;
            case 109 -> 205;
            case 110 -> 109;
            case 111 -> 215;
            case 112 -> 107;
            case 113 -> 220;
            case 114 -> 42;
            case 115 -> 159;
            case 116 -> 228;
            case 117 -> 165;
            case 118 -> 5;
            case 119 -> 53;
            case 120 -> 162;
            case 121 -> 98;
            case 122 -> 246;
            case 123 -> 213;
            case 124 -> 194;
            case 125 -> 154;
            case 126 -> 231;
            case 127 -> 253;
            case 128 -> 2;
            case 129 -> 188;
            case 130 -> 22;
            case 131 -> 233;
            case 132 -> 254;
            case 133 -> 86;
            case 134 -> 21;
            case 135 -> 146;
            case 136 -> 137;
            case 137 -> 190;
            case 138 -> 99;
            case 139 -> 33;
            case 140 -> 27;
            case 141 -> 23;
            case 142 -> 171;
            case 143 -> 80;
            case 144 -> 221;
            case 145 -> 71;
            case 146 -> 125;
            case 147 -> 106;
            case 148 -> 136;
            case 149 -> 238;
            case 150 -> 229;
            case 151 -> 62;
            case 152 -> 93;
            case 153 -> 118;
            case 154 -> 210;
            case 155 -> 8;
            case 156 -> 130;
            case 157 -> 108;
            case 158 -> 75;
            case 159 -> 28;
            case 160 -> 242;
            case 161 -> 105;
            case 162 -> 196;
            case 163 -> 216;
            case 164 -> 197;
            case 165 -> 166;
            case 166 -> 66;
            case 167 -> 76;
            case 168 -> 39;
            case 169 -> 13;
            case 170 -> 245;
            case 171 -> 121;
            case 172 -> 25;
            case 173 -> 120;
            case 174 -> 20;
            case 175 -> 141;
            case 176 -> 45;
            case 177 -> 9;
            case 178 -> 96;
            case 179 -> 74;
            case 180 -> 198;
            case 181 -> 77;
            case 182 -> 151;
            case 183 -> 14;
            case 184 -> 26;
            case 185 -> 29;
            case 186 -> 60;
            case 187 -> 184;
            case 188 -> 41;
            case 189 -> 111;
            case 190 -> 58;
            case 191 -> 176;
            case 192 -> 206;
            case 193 -> 255;
            case 194 -> 202;
            case 195 -> 119;
            case 196 -> 67;
            case 197 -> 226;
            case 198 -> 32;
            case 199 -> 218;
            case 200 -> 50;
            case 201 -> 170;
            case 202 -> 30;
            case 203 -> 36;
            case 204 -> 150;
            case 205 -> 152;
            case 206 -> 128;
            case 207 -> 31;
            case 208 -> 35;
            case 209 -> 52;
            case 210 -> 89;
            case 211 -> 102;
            case 212 -> 169;
            case 213 -> 97;
            case 214 -> 144;
            case 215 -> 178;
            case 216 -> 0;
            case 217 -> 69;
            case 218 -> 227;
            case 219 -> 10;
            case 220 -> 155;
            case 221 -> 73;
            case 222 -> 43;
            case 223 -> 203;
            case 224 -> 46;
            case 225 -> 3;
            case 226 -> 103;
            case 227 -> 56;
            case 228 -> 156;
            case 229 -> 232;
            case 230 -> 195;
            case 231 -> 6;
            case 232 -> 133;
            case 233 -> 209;
            case 234 -> 244;
            case 235 -> 87;
            case 236 -> 168;
            case 237 -> 100;
            case 238 -> 48;
            case 239 -> 81;
            case 240 -> 101;
            case 241 -> 78;
            case 242 -> 142;
            case 243 -> 70;
            case 244 -> 199;
            case 245 -> 88;
            case 246 -> 131;
            case 247 -> 37;
            case 248 -> 114;
            case 249 -> 230;
            case 250 -> 192;
            case 251 -> 138;
            case 252 -> 47;
            case 253 -> 173;
            case 254 -> 24;
            default -> 49;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl a() {
         return IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }
   }
      public static final me.octo.client.IlIIlIIIIIIIllIlllllIlIllIIlIlllIIllIlIlIlIIlIllIllllllIIIIlIIlllllIllIIllIIIIlllllIl ag() {
         return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }
}
