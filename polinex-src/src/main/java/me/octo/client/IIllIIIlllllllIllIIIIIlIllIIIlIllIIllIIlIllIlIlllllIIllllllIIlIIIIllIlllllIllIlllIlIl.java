package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl() {
      short var10001 = 12956;
      short var10002 = 544;
      var10002 = 12957;
      short var10003 = -4169;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      short var10004 = 12959;
      short var10005 = -15437;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
      };
      super(
         "Failsafe Sound",
         "Plays an alert sound when a failsafe triggers. We highly recommend keeping this on. With it off, you won't hear staff checks!",
         var3,
         "Failsafes",
         true,
         var1
      );
   }

   @Override
   public void aC() {
      String[] var10000 = llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII.g();
      super.aC();
      String[] var1 = var10000;
      if (var1 != null) {
         if (this.ap().player == null) {
            return;
         }

         short var2 = 12958;
         short var10001 = 21462;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§c§lWARNING§r §cFailsafe Sound is OFF — you will NOT hear failsafe alerts. Keep it on to stay safe."
         );
         short var3 = 12952;
         var10001 = 26023;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§c§lWARNING§r §cFailsafe Sound is OFF — you will NOT hear failsafe alerts. Keep it on to stay safe."
         );
         short var4 = 12952;
         var10001 = 26023;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§c§lWARNING§r §cFailsafe Sound is OFF — you will NOT hear failsafe alerts. Keep it on to stay safe."
         );
         short var5 = 12952;
         var10001 = 26023;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§c§lWARNING§r §cFailsafe Sound is OFF — you will NOT hear failsafe alerts. Keep it on to stay safe."
         );
      }

      short var6 = 12952;
      short var10 = 26023;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§c§lWARNING§r §cFailsafe Sound is OFF — you will NOT hear failsafe alerts. Keep it on to stay safe."
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0081À¹ÌþñZ\\å\u007f\u0002]Dê}Ü¬Îø\u0019\u0081¡0}ª\u0012\u008393qË\u000bäsË\u0013¬\n\u0007¿÷Ý\u0004Úáöè\u0017ugÌBJë$ÎY}ö{9¬s*¹À\u0014ïPòèÕ\u001d\u0095\tê«L\u009a\u0003\u0090\u0016okp\u009e\u008a\u00ad\u0087Èç«%G®oa©QÃCß±ßÒUt\u001b¢r,,«\u0084r\\\u0017>ý\u009c\"T¸>í\u0094.\u0097±à_É\u0089\u000e7\u008f\u008e¦S\u001bc°õ\u008c(kM|Äú?\u008d9\u0084ªA6S]sb§\u0086«\u0096\n¶âdú\u0017²\u0096ÿ^Sã®¼₺mP\u0018c\u0085®\bÞÁäÝÓ\u0006\t\u0088\u0088ëà4(68\u000fÎ+\u0086#¯2U\u0090s\u008bOP*BúEÂ/ºKÛ\u0002{ÆÖfþÕq\u008c\u0089\u0092áé¯ë;";
      int var4 = "\u0081À¹ÌþñZ\\å\u007f\u0002]Dê}Ü¬Îø\u0019\u0081¡0}ª\u0012\u008393qË\u000bäsË\u0013¬\n\u0007¿÷Ý\u0004Úáöè\u0017ugÌBJë$ÎY}ö{9¬s*¹À\u0014ïPòèÕ\u001d\u0095\tê«L\u009a\u0003\u0090\u0016okp\u009e\u008a\u00ad\u0087Èç«%G®oa©QÃCß±ßÒUt\u001b¢r,,«\u0084r\\\u0017>ý\u009c\"T¸>í\u0094.\u0097±à_É\u0089\u000e7\u008f\u008e¦S\u001bc°õ\u008c(kM|Äú?\u008d9\u0084ªA6S]sb§\u0086«\u0096\n¶âdú\u0017²\u0096ÿ^Sã®¼₺mP\u0018c\u0085®\bÞÁäÝÓ\u0006\t\u0088\u0088ëà4(68\u000fÎ+\u0086#¯2U\u0090s\u008bOP*BúEÂ/ºKÛ\u0002{ÆÖfþÕq\u008c\u0089\u0092áé¯ë;"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 126;
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
                     case 0 -> 125;
                     case 1 -> 121;
                     case 2 -> 112;
                     case 3 -> 107;
                     case 4 -> 65;
                     case 5 -> 52;
                     default -> 103;
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
                     g = new String[5];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIllIIIlllllllIllIIIIIlIllIIIlIllIIllIIlIllIlIlllllIIllllllIIlIIIIllIlllllIllIlllIlIl();
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

                  var2 = ";(\u000f0É\u008f]r·c\u0090\u001ei´6?6kR+yZû'Ofs¶\u0096þúôá9¢¢\u0016\u0007\u0085\u009a¼Æßµ¶\u007fóÎ⃰Âø\f\u0097æÑ\u0085Ð\u0091Ä66\u009aTúÂDH ÜUG\u0082À{¦ÈJ®\bâ9$çDÞ!\u0085ÈÌ\u007f\u009a >\u009e&´\u009cÉVÁ\u0085ïö\u001fï¹\u008f\u0000Þ";
                  var4 = ";(\u000f0É\u008f]r·c\u0090\u001ei´6?6kR+yZû'Ofs¶\u0096þúôá9¢¢\u0016\u0007\u0085\u009a¼Æßµ¶\u007fóÎ⃰Âø\f\u0097æÑ\u0085Ð\u0091Ä66\u009aTúÂDH ÜUG\u0082À{¦ÈJ®\bâ9$çDÞ!\u0085ÈÌ\u007f\u009a >\u009e&´\u009cÉVÁ\u0085ïö\u001fï¹\u008f\u0000Þ"
                     .length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 12956) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 108;
            case 1 -> 163;
            case 2 -> 84;
            case 3 -> 43;
            case 4 -> 8;
            case 5 -> 220;
            case 6 -> 45;
            case 7 -> 131;
            case 8 -> 223;
            case 9 -> 73;
            case 10 -> 98;
            case 11 -> 61;
            case 12 -> 246;
            case 13 -> 2;
            case 14 -> 226;
            case 15 -> 189;
            case 16 -> 210;
            case 17 -> 221;
            case 18 -> 4;
            case 19 -> 114;
            case 20 -> 242;
            case 21 -> 77;
            case 22 -> 157;
            case 23 -> 179;
            case 24 -> 133;
            case 25 -> 252;
            case 26 -> 199;
            case 27 -> 96;
            case 28 -> 164;
            case 29 -> 41;
            case 30 -> 178;
            case 31 -> 80;
            case 32 -> 34;
            case 33 -> 52;
            case 34 -> 66;
            case 35 -> 53;
            case 36 -> 35;
            case 37 -> 202;
            case 38 -> 60;
            case 39 -> 158;
            case 40 -> 106;
            case 41 -> 183;
            case 42 -> 233;
            case 43 -> 57;
            case 44 -> 198;
            case 45 -> 224;
            case 46 -> 209;
            case 47 -> 174;
            case 48 -> 74;
            case 49 -> 36;
            case 50 -> 1;
            case 51 -> 170;
            case 52 -> 180;
            case 53 -> 67;
            case 54 -> 120;
            case 55 -> 251;
            case 56 -> 59;
            case 57 -> 211;
            case 58 -> 191;
            case 59 -> 18;
            case 60 -> 82;
            case 61 -> 127;
            case 62 -> 142;
            case 63 -> 105;
            case 64 -> 83;
            case 65 -> 122;
            case 66 -> 121;
            case 67 -> 173;
            case 68 -> 231;
            case 69 -> 75;
            case 70 -> 134;
            case 71 -> 175;
            case 72 -> 93;
            case 73 -> 85;
            case 74 -> 165;
            case 75 -> 26;
            case 76 -> 167;
            case 77 -> 153;
            case 78 -> 25;
            case 79 -> 227;
            case 80 -> 250;
            case 81 -> 24;
            case 82 -> 76;
            case 83 -> 62;
            case 84 -> 161;
            case 85 -> 32;
            case 86 -> 228;
            case 87 -> 214;
            case 88 -> 88;
            case 89 -> 27;
            case 90 -> 54;
            case 91 -> 188;
            case 92 -> 236;
            case 93 -> 253;
            case 94 -> 22;
            case 95 -> 213;
            case 96 -> 249;
            case 97 -> 111;
            case 98 -> 28;
            case 99 -> 192;
            case 100 -> 72;
            case 101 -> 241;
            case 102 -> 124;
            case 103 -> 230;
            case 104 -> 33;
            case 105 -> 229;
            case 106 -> 104;
            case 107 -> 56;
            case 108 -> 138;
            case 109 -> 146;
            case 110 -> 48;
            case 111 -> 20;
            case 112 -> 148;
            case 113 -> 166;
            case 114 -> 116;
            case 115 -> 151;
            case 116 -> 197;
            case 117 -> 102;
            case 118 -> 47;
            case 119 -> 129;
            case 120 -> 100;
            case 121 -> 184;
            case 122 -> 16;
            case 123 -> 118;
            case 124 -> 185;
            case 125 -> 112;
            case 126 -> 109;
            case 127 -> 152;
            case 128 -> 119;
            case 129 -> 137;
            case 130 -> 92;
            case 131 -> 23;
            case 132 -> 237;
            case 133 -> 149;
            case 134 -> 176;
            case 135 -> 50;
            case 136 -> 145;
            case 137 -> 39;
            case 138 -> 11;
            case 139 -> 200;
            case 140 -> 187;
            case 141 -> 21;
            case 142 -> 5;
            case 143 -> 123;
            case 144 -> 87;
            case 145 -> 70;
            case 146 -> 91;
            case 147 -> 69;
            case 148 -> 212;
            case 149 -> 217;
            case 150 -> 232;
            case 151 -> 130;
            case 152 -> 86;
            case 153 -> 218;
            case 154 -> 219;
            case 155 -> 156;
            case 156 -> 190;
            case 157 -> 81;
            case 158 -> 49;
            case 159 -> 255;
            case 160 -> 147;
            case 161 -> 117;
            case 162 -> 205;
            case 163 -> 78;
            case 164 -> 195;
            case 165 -> 181;
            case 166 -> 203;
            case 167 -> 90;
            case 168 -> 136;
            case 169 -> 168;
            case 170 -> 94;
            case 171 -> 0;
            case 172 -> 10;
            case 173 -> 19;
            case 174 -> 201;
            case 175 -> 107;
            case 176 -> 68;
            case 177 -> 44;
            case 178 -> 71;
            case 179 -> 194;
            case 180 -> 31;
            case 181 -> 235;
            case 182 -> 206;
            case 183 -> 30;
            case 184 -> 216;
            case 185 -> 196;
            case 186 -> 182;
            case 187 -> 143;
            case 188 -> 141;
            case 189 -> 42;
            case 190 -> 154;
            case 191 -> 55;
            case 192 -> 160;
            case 193 -> 193;
            case 194 -> 150;
            case 195 -> 12;
            case 196 -> 186;
            case 197 -> 97;
            case 198 -> 144;
            case 199 -> 58;
            case 200 -> 177;
            case 201 -> 110;
            case 202 -> 140;
            case 203 -> 9;
            case 204 -> 115;
            case 205 -> 113;
            case 206 -> 139;
            case 207 -> 240;
            case 208 -> 208;
            case 209 -> 89;
            case 210 -> 125;
            case 211 -> 101;
            case 212 -> 204;
            case 213 -> 159;
            case 214 -> 222;
            case 215 -> 238;
            case 216 -> 15;
            case 217 -> 38;
            case 218 -> 99;
            case 219 -> 95;
            case 220 -> 239;
            case 221 -> 17;
            case 222 -> 51;
            case 223 -> 40;
            case 224 -> 103;
            case 225 -> 225;
            case 226 -> 46;
            case 227 -> 14;
            case 228 -> 128;
            case 229 -> 37;
            case 230 -> 7;
            case 231 -> 126;
            case 232 -> 207;
            case 233 -> 244;
            case 234 -> 13;
            case 235 -> 245;
            case 236 -> 6;
            case 237 -> 155;
            case 238 -> 254;
            case 239 -> 234;
            case 240 -> 132;
            case 241 -> 162;
            case 242 -> 247;
            case 243 -> 243;
            case 244 -> 172;
            case 245 -> 3;
            case 246 -> 169;
            case 247 -> 64;
            case 248 -> 63;
            case 249 -> 29;
            case 250 -> 248;
            case 251 -> 65;
            case 252 -> 135;
            case 253 -> 171;
            case 254 -> 215;
            default -> 79;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) {
      this();
   }
}
}
