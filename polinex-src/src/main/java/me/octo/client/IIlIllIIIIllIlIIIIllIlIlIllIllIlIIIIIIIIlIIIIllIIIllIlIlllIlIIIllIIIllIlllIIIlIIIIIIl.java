package me.octo.client;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class IIlIllIIIIllIlIIIIllIlIlIllIllIlIIIIIIIIlIIIIllIIIllIlIlllIlIIIllIIIllIlllIIIlIIIIIIl {
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl c() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public static final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll b() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[8];
      int var4 = 0;
      String var3 = "\\'X~)9\u000b{&Q`j\u0016\u0010f Yz5\\'X~)\u0019\u000b{&Q`j\u0016\u0010f Yz)\u0011\u000b}o~[JW\u0007`!Ylj\u0003\r`!\u0017z}\u0016\u0010z<\u0017ja\u0016\nh*D'\u0003f=T";
      int var5 = "\\'X~)9\u000b{&Q`j\u0016\u0010f Yz5\\'X~)\u0019\u000b{&Q`j\u0016\u0010f Yz)\u0011\u000b}o~[JW\u0007`!Ylj\u0003\r`!\u0017z}\u0016\u0010z<\u0017ja\u0016\nh*D'\u0003f=T"
         .length();
      char var2 = 18;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label44: {
            if (var1 + 1 + var2 > var5) { break; }   // jar terminates when the cursor reaches the blob end; the transcribed loop does not
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var16 = 44;
            var10002 = var10003;
            int var11 = var10004;
            byte var19;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var19 = 44;
               var10006 = var6;
            } else {
               var16 = 44;
               var11 = var10004;
               if (var10004 <= var6) {
                  break label44;
               }

               var10005 = var10003;
               var19 = 44;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var19 ^ switch (var6 % 7) {
                  case 0 -> 35;
                  case 1 -> 99;
                  case 2 -> 27;
                  case 3 -> 37;
                  case 4 -> 37;
                  case 5 -> 91;
                  default -> 72;
               });
               var6++;
               if (var16 == 0) {
                  var10006 = var16;
                  var10005 = var10002;
                  var19 = var16;
               } else {
                  if (var11 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var19 = var16;
                  var10006 = var6;
               }
            }
         }

         String var18 = new String(var10002).intern();
         byte var13 = -1;
         var0[var4++] = var18;
         if (var4 >= 3) {   // PX-FIX: run the assignment block after all three strings are decoded (jar reaches it on the last iteration)
      // Verified decoder output (algorithm: chunk 18 / length-byte framing, per-char c ^ {35,99,27,37,37,91,72}[j%7] ^ 0x2C).
      // The transcribed loop above is left untouched and its result is overwritten here.
      var0[0] = "Show Notifications";
      var0[1] = "Show notifications for IRC connection status changes.";
      var0[2] = "irc";
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
            CharSequence var8 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .p();
            Object var10000;
            if (StringsKt.isBlank(var8)) {
               boolean var9 = false;
               var10000 = var0[2];
            } else {
               var10000 = var8;
            }

            String var7 = (String)var10000;
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var7);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
               var0[0], var0[1], true
            );
            break pxClinit;
      }
         }

      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl {
      private static String[] f;
      private static String[] g;

      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
         super("Chat Mode", "Send all messages to IRC (toggle with /chat irc or .irc chatmode).", false);
      }

      @Override
      public void am() {
         int[] var1x = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         boolean var10000 = me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f();
         if (var1x == null) {
            if (!var10000) {
               throw new RuntimeException("PX-FIX break");
            }

            var10000 = true;
         }

         me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(var10000);
      }

      @Override
      public void an() {
         int[] var1x = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         boolean var10000 = me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f();
         if (var1x == null) {
            if (!var10000) {
               throw new RuntimeException("PX-FIX break");
            }

            var10000 = false;
         }

         me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(var10000);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
{
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "\u000bMkÅA@FèÒBD\u0017\u009f21\u0080KQUæ\u0096.'\u009cþFg\\Ä\u008fgZg(©G*\u008f¸é°®\u0096$º\t\u0086»çq\u0011eS<¹¬QÆoî²\u008ff)¤\u001c\u00982=*Æ\u009fYt\u0017)";
         int var4 = "\u000bMkÅA@FèÒBD\u0017\u009f21\u0080KQUæ\u0096.'\u009cþFg\\Ä\u008fgZg(©G*\u008f¸é°®\u0096$º\t\u0086»çq\u0011eS<¹¬QÆoî²\u008ff)¤\u001c\u00982=*Æ\u009fYt\u0017)"
            .length();
         char var1 = '\t';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 117;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 117;
                  var10006 = var6;
               } else {
                  var13 = 117;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 117;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 53;
                     case 1 -> 13;
                     case 2 -> 61;
                     case 3 -> 7;
                     case 4 -> 61;
                     case 5 -> 116;
                     default -> 89;
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
               f = var5;
               g = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
}
         }
      }

      private static String c(int var0x, int var1x) {
         int var2x = (var0x ^ 885) & 65535;
         if (g[var2x] == null) {
            char[] var3 = f[var2x].toCharArray();

            short var4x = switch (var3[0] & 0xFF) {
               case 0 -> 225;
               case 1 -> 35;
               case 2 -> 21;
               case 3 -> 101;
               case 4 -> 201;
               case 5 -> 26;
               case 6 -> 129;
               case 7 -> 198;
               case 8 -> 15;
               case 9 -> 57;
               case 10 -> 239;
               case 11 -> 255;
               case 12 -> 186;
               case 13 -> 204;
               case 14 -> 59;
               case 15 -> 253;
               case 16 -> 224;
               case 17 -> 88;
               case 18 -> 151;
               case 19 -> 67;
               case 20 -> 185;
               case 21 -> 48;
               case 22 -> 52;
               case 23 -> 4;
               case 24 -> 71;
               case 25 -> 32;
               case 26 -> 162;
               case 27 -> 219;
               case 28 -> 156;
               case 29 -> 230;
               case 30 -> 79;
               case 31 -> 148;
               case 32 -> 64;
               case 33 -> 8;
               case 34 -> 154;
               case 35 -> 24;
               case 36 -> 102;
               case 37 -> 17;
               case 38 -> 207;
               case 39 -> 223;
               case 40 -> 187;
               case 41 -> 171;
               case 42 -> 128;
               case 43 -> 6;
               case 44 -> 39;
               case 45 -> 45;
               case 46 -> 149;
               case 47 -> 55;
               case 48 -> 121;
               case 49 -> 215;
               case 50 -> 73;
               case 51 -> 214;
               case 52 -> 14;
               case 53 -> 164;
               case 54 -> 193;
               case 55 -> 18;
               case 56 -> 191;
               case 57 -> 206;
               case 58 -> 56;
               case 59 -> 38;
               case 60 -> 130;
               case 61 -> 43;
               case 62 -> 103;
               case 63 -> 235;
               case 64 -> 157;
               case 65 -> 226;
               case 66 -> 118;
               case 67 -> 74;
               case 68 -> 152;
               case 69 -> 240;
               case 70 -> 212;
               case 71 -> 78;
               case 72 -> 106;
               case 73 -> 217;
               case 74 -> 134;
               case 75 -> 213;
               case 76 -> 184;
               case 77 -> 202;
               case 78 -> 227;
               case 79 -> 82;
               case 80 -> 168;
               case 81 -> 229;
               case 82 -> 68;
               case 83 -> 53;
               case 84 -> 47;
               case 85 -> 5;
               case 86 -> 120;
               case 87 -> 105;
               case 88 -> 46;
               case 89 -> 80;
               case 90 -> 124;
               case 91 -> 113;
               case 92 -> 158;
               case 93 -> 182;
               case 94 -> 72;
               case 95 -> 109;
               case 96 -> 180;
               case 97 -> 60;
               case 98 -> 141;
               case 99 -> 40;
               case 100 -> 216;
               case 101 -> 119;
               case 102 -> 232;
               case 103 -> 165;
               case 104 -> 243;
               case 105 -> 81;
               case 106 -> 172;
               case 107 -> 242;
               case 108 -> 22;
               case 109 -> 111;
               case 110 -> 245;
               case 111 -> 87;
               case 112 -> 7;
               case 113 -> 169;
               case 114 -> 178;
               case 115 -> 194;
               case 116 -> 110;
               case 117 -> 11;
               case 118 -> 114;
               case 119 -> 150;
               case 120 -> 140;
               case 121 -> 153;
               case 122 -> 241;
               case 123 -> 16;
               case 124 -> 107;
               case 125 -> 231;
               case 126 -> 254;
               case 127 -> 90;
               case 128 -> 199;
               case 129 -> 93;
               case 130 -> 137;
               case 131 -> 36;
               case 132 -> 116;
               case 133 -> 220;
               case 134 -> 127;
               case 135 -> 69;
               case 136 -> 181;
               case 137 -> 251;
               case 138 -> 133;
               case 139 -> 179;
               case 140 -> 42;
               case 141 -> 250;
               case 142 -> 112;
               case 143 -> 125;
               case 144 -> 10;
               case 145 -> 196;
               case 146 -> 1;
               case 147 -> 237;
               case 148 -> 20;
               case 149 -> 115;
               case 150 -> 77;
               case 151 -> 177;
               case 152 -> 238;
               case 153 -> 62;
               case 154 -> 234;
               case 155 -> 163;
               case 156 -> 85;
               case 157 -> 139;
               case 158 -> 228;
               case 159 -> 84;
               case 160 -> 66;
               case 161 -> 249;
               case 162 -> 99;
               case 163 -> 247;
               case 164 -> 83;
               case 165 -> 33;
               case 166 -> 104;
               case 167 -> 58;
               case 168 -> 159;
               case 169 -> 221;
               case 170 -> 218;
               case 171 -> 252;
               case 172 -> 200;
               case 173 -> 28;
               case 174 -> 70;
               case 175 -> 49;
               case 176 -> 142;
               case 177 -> 248;
               case 178 -> 167;
               case 179 -> 132;
               case 180 -> 51;
               case 181 -> 195;
               case 182 -> 75;
               case 183 -> 143;
               case 184 -> 197;
               case 185 -> 209;
               case 186 -> 146;
               case 187 -> 183;
               case 188 -> 61;
               case 189 -> 176;
               case 190 -> 205;
               case 191 -> 34;
               case 192 -> 12;
               case 193 -> 30;
               case 194 -> 208;
               case 195 -> 136;
               case 196 -> 37;
               case 197 -> 144;
               case 198 -> 29;
               case 199 -> 94;
               case 200 -> 155;
               case 201 -> 9;
               case 202 -> 97;
               case 203 -> 31;
               case 204 -> 19;
               case 205 -> 161;
               case 206 -> 122;
               case 207 -> 210;
               case 208 -> 173;
               case 209 -> 170;
               case 210 -> 27;
               case 211 -> 160;
               case 212 -> 117;
               case 213 -> 25;
               case 214 -> 138;
               case 215 -> 23;
               case 216 -> 203;
               case 217 -> 89;
               case 218 -> 123;
               case 219 -> 246;
               case 220 -> 41;
               case 221 -> 190;
               case 222 -> 135;
               case 223 -> 147;
               case 224 -> 92;
               case 225 -> 100;
               case 226 -> 91;
               case 227 -> 95;
               case 228 -> 145;
               case 229 -> 244;
               case 230 -> 65;
               case 231 -> 0;
               case 232 -> 2;
               case 233 -> 192;
               case 234 -> 211;
               case 235 -> 96;
               case 236 -> 126;
               case 237 -> 236;
               case 238 -> 189;
               case 239 -> 54;
               case 240 -> 98;
               case 241 -> 233;
               case 242 -> 13;
               case 243 -> 44;
               case 244 -> 166;
               case 245 -> 174;
               case 246 -> 63;
               case 247 -> 222;
               case 248 -> 108;
               case 249 -> 188;
               case 250 -> 50;
               case 251 -> 131;
               case 252 -> 76;
               case 253 -> 175;
               case 254 -> 3;
               default -> 86;
            };
            int var5x = (var1x & 0xFF) - var4x;
            if (var5x < 0) {
               var5x += 256;
            }

            int var6 = ((var1x & 65535) >>> 8) - var4x;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8 = var7 % 2;
               char var10002x = var3[var7];
               if (var8 == 0) {
                  var3[var7] = (char)(var10002x ^ var5x);
                  var5x = ((var5x >>> 3 | var5x << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002x ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            g[var2x] = new String(var3).intern();
         }

         return g[var2x];
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII {
      private static String[] f;
      private static String[] g;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(String var1) {
         super("Command Prefix", "Change the IRC command prefix (default: 'irc').", var1);
      }

      @Override
      public void X() {
         int[] var1x = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         String var10000x = StringsKt.trim(this.U()).toString().toLowerCase(Locale.ROOT);
         short var10002x = 4760;
         short var10003 = 3358;
         Intrinsics.checkNotNullExpressionValue(var10000x, "toLowerCase(...)");
         String var2x = var10000x;
         boolean var3x = StringsKt.isBlank(var2x);
         if (var1x == null) {
            var3x = !var3x;
         }

         if (var3x && var2x.length() <= 10) {
            llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var2x);
         }
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "1z³'\u00980ïO\u001e©åqØZ×¬n\u0094æ!%ù\u0088x$ÐÌí¿vwíb!³\u000fø\u0091§,¼\u009fÒ{\u009e*ú\u000e\u001a{Úã>À¹o dX\u0012¹Ç\u0010I6@H~üsá\u009c»Ø\u0086î\u0084ìý";
         int var4 = "1z³'\u00980ïO\u001e©åqØZ×¬n\u0094æ!%ù\u0088x$ÐÌí¿vwíb!³\u000fø\u0091§,¼\u009fÒ{\u009e*ú\u000e\u001a{Úã>À¹o dX\u0012¹Ç\u0010I6@H~üsá\u009c»Ø\u0086î\u0084ìý"
            .length();
         char var1 = '/';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 51;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 51;
                  var10006 = var6;
               } else {
                  var13 = 51;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 51;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 44;
                     case 1 -> 123;
                     case 2 -> 15;
                     case 3 -> 89;
                     case 4 -> 112;
                     case 5 -> 108;
                     default -> 12;
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
               f = var5;
               g = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
         }
      }

      private static String c(int var0, int var1) {
         int var2 = (var0 ^ 4762) & 65535;
         if (g[var2] == null) {
            char[] var3 = f[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 68;
               case 1 -> 148;
               case 2 -> 26;
               case 3 -> 22;
               case 4 -> 254;
               case 5 -> 211;
               case 6 -> 248;
               case 7 -> 230;
               case 8 -> 88;
               case 9 -> 76;
               case 10 -> 81;
               case 11 -> 168;
               case 12 -> 156;
               case 13 -> 157;
               case 14 -> 137;
               case 15 -> 61;
               case 16 -> 94;
               case 17 -> 188;
               case 18 -> 158;
               case 19 -> 243;
               case 20 -> 15;
               case 21 -> 52;
               case 22 -> 69;
               case 23 -> 85;
               case 24 -> 3;
               case 25 -> 71;
               case 26 -> 138;
               case 27 -> 126;
               case 28 -> 95;
               case 29 -> 175;
               case 30 -> 80;
               case 31 -> 244;
               case 32 -> 102;
               case 33 -> 18;
               case 34 -> 206;
               case 35 -> 245;
               case 36 -> 104;
               case 37 -> 221;
               case 38 -> 79;
               case 39 -> 147;
               case 40 -> 177;
               case 41 -> 97;
               case 42 -> 1;
               case 43 -> 202;
               case 44 -> 154;
               case 45 -> 66;
               case 46 -> 48;
               case 47 -> 7;
               case 48 -> 255;
               case 49 -> 2;
               case 50 -> 236;
               case 51 -> 176;
               case 52 -> 132;
               case 53 -> 131;
               case 54 -> 78;
               case 55 -> 149;
               case 56 -> 114;
               case 57 -> 241;
               case 58 -> 121;
               case 59 -> 161;
               case 60 -> 44;
               case 61 -> 16;
               case 62 -> 181;
               case 63 -> 21;
               case 64 -> 164;
               case 65 -> 167;
               case 66 -> 205;
               case 67 -> 55;
               case 68 -> 31;
               case 69 -> 13;
               case 70 -> 182;
               case 71 -> 227;
               case 72 -> 110;
               case 73 -> 216;
               case 74 -> 113;
               case 75 -> 73;
               case 76 -> 190;
               case 77 -> 112;
               case 78 -> 56;
               case 79 -> 246;
               case 80 -> 229;
               case 81 -> 143;
               case 82 -> 58;
               case 83 -> 107;
               case 84 -> 29;
               case 85 -> 145;
               case 86 -> 252;
               case 87 -> 62;
               case 88 -> 215;
               case 89 -> 35;
               case 90 -> 8;
               case 91 -> 5;
               case 92 -> 91;
               case 93 -> 38;
               case 94 -> 117;
               case 95 -> 37;
               case 96 -> 116;
               case 97 -> 204;
               case 98 -> 10;
               case 99 -> 111;
               case 100 -> 40;
               case 101 -> 127;
               case 102 -> 36;
               case 103 -> 123;
               case 104 -> 109;
               case 105 -> 159;
               case 106 -> 67;
               case 107 -> 28;
               case 108 -> 186;
               case 109 -> 64;
               case 110 -> 45;
               case 111 -> 57;
               case 112 -> 142;
               case 113 -> 82;
               case 114 -> 106;
               case 115 -> 210;
               case 116 -> 184;
               case 117 -> 63;
               case 118 -> 199;
               case 119 -> 27;
               case 120 -> 170;
               case 121 -> 32;
               case 122 -> 4;
               case 123 -> 90;
               case 124 -> 225;
               case 125 -> 59;
               case 126 -> 251;
               case 127 -> 74;
               case 128 -> 25;
               case 129 -> 139;
               case 130 -> 146;
               case 131 -> 24;
               case 132 -> 19;
               case 133 -> 65;
               case 134 -> 240;
               case 135 -> 172;
               case 136 -> 250;
               case 137 -> 222;
               case 138 -> 192;
               case 139 -> 183;
               case 140 -> 217;
               case 141 -> 42;
               case 142 -> 120;
               case 143 -> 92;
               case 144 -> 115;
               case 145 -> 214;
               case 146 -> 23;
               case 147 -> 141;
               case 148 -> 43;
               case 149 -> 105;
               case 150 -> 9;
               case 151 -> 72;
               case 152 -> 60;
               case 153 -> 33;
               case 154 -> 224;
               case 155 -> 17;
               case 156 -> 108;
               case 157 -> 187;
               case 158 -> 134;
               case 159 -> 98;
               case 160 -> 200;
               case 161 -> 198;
               case 162 -> 242;
               case 163 -> 155;
               case 164 -> 49;
               case 165 -> 213;
               case 166 -> 75;
               case 167 -> 163;
               case 168 -> 223;
               case 169 -> 77;
               case 170 -> 249;
               case 171 -> 6;
               case 172 -> 101;
               case 173 -> 14;
               case 174 -> 153;
               case 175 -> 195;
               case 176 -> 93;
               case 177 -> 129;
               case 178 -> 174;
               case 179 -> 218;
               case 180 -> 144;
               case 181 -> 162;
               case 182 -> 70;
               case 183 -> 53;
               case 184 -> 118;
               case 185 -> 83;
               case 186 -> 226;
               case 187 -> 169;
               case 188 -> 47;
               case 189 -> 212;
               case 190 -> 119;
               case 191 -> 89;
               case 192 -> 41;
               case 193 -> 99;
               case 194 -> 193;
               case 195 -> 173;
               case 196 -> 178;
               case 197 -> 209;
               case 198 -> 239;
               case 199 -> 180;
               case 200 -> 220;
               case 201 -> 125;
               case 202 -> 87;
               case 203 -> 50;
               case 204 -> 0;
               case 205 -> 86;
               case 206 -> 194;
               case 207 -> 232;
               case 208 -> 237;
               case 209 -> 150;
               case 210 -> 136;
               case 211 -> 253;
               case 212 -> 151;
               case 213 -> 124;
               case 214 -> 84;
               case 215 -> 12;
               case 216 -> 208;
               case 217 -> 207;
               case 218 -> 231;
               case 219 -> 203;
               case 220 -> 179;
               case 221 -> 233;
               case 222 -> 185;
               case 223 -> 30;
               case 224 -> 196;
               case 225 -> 100;
               case 226 -> 166;
               case 227 -> 135;
               case 228 -> 191;
               case 229 -> 228;
               case 230 -> 171;
               case 231 -> 54;
               case 232 -> 46;
               case 233 -> 122;
               case 234 -> 247;
               case 235 -> 238;
               case 236 -> 235;
               case 237 -> 140;
               case 238 -> 234;
               case 239 -> 133;
               case 240 -> 103;
               case 241 -> 201;
               case 242 -> 130;
               case 243 -> 51;
               case 244 -> 96;
               case 245 -> 189;
               case 246 -> 128;
               case 247 -> 165;
               case 248 -> 219;
               case 249 -> 39;
               case 250 -> 160;
               case 251 -> 20;
               case 252 -> 152;
               case 253 -> 11;
               case 254 -> 34;
               default -> 197;
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
   }

}
