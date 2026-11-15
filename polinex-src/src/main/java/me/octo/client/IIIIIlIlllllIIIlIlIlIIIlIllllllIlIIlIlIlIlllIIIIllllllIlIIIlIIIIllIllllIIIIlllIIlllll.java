package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public final class IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll() {
      short var10001 = -32072;
      short var10002 = -27852;
      var10002 = -32071;
      short var10003 = 8220;
      short var10004 = -32069;
      short var10005 = -11514;
      super(
         "No Cursor Reset",
         "Prevents the cursor from resetting to the center of the screen.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         "GUI"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      label20: {
         int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         short var10002 = -32070;
         short var10003 = -16774;
         Intrinsics.checkNotNullParameter(var1, "event");
         int[] var2 = var10000;
         if (var2 == null) {
            if (this.ap().screen == null) {
               break label20;
            }

            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
         }

         if (var2 == null) {
            return;
         }
      }

      if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll && this.ap().screen == null) {
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
      }
   }

   @JvmStatic
   public static final boolean ag() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @JvmStatic
   public static final long ah() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "?÷\u0001siø\"#f\u0087î©y>)?¿Ë\u0089\u007f\u0085öªaÂ\u0004X\u0007\u0081í\u000e\u008d(®r¸³.þÕ1\u0010¨êÖy&ðHò-Î£BÎ\u001c\u0089aô ¾õ\tùo\u0003â\u0083Î$\u0089fäÆ²þ\u0017·¢";
      int var4 = "?÷\u0001siø\"#f\u0087î©y>)?¿Ë\u0089\u007f\u0085öªaÂ\u0004X\u0007\u0081í\u000e\u008d(®r¸³.þÕ1\u0010¨êÖy&ðHò-Î£BÎ\u001c\u0089aô ¾õ\tùo\u0003â\u0083Î$\u0089fäÆ²þ\u0017·¢"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 67;
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
                     case 0 -> 64;
                     case 1 -> 10;
                     case 2 -> 98;
                     case 3 -> 38;
                     case 4 -> 127;
                     case 5 -> 32;
                     default -> 99;
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
                     g = new String[4];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll();
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

                  var2 = "\u0083¦¨{\u0085\u0003|i\u001d";
                  var4 = "\u0083¦¨{\u0085\u0003|i\u001d".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 57;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32072) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 247;
            case 1 -> 71;
            case 2 -> 53;
            case 3 -> 43;
            case 4 -> 31;
            case 5 -> 196;
            case 6 -> 237;
            case 7 -> 153;
            case 8 -> 218;
            case 9 -> 165;
            case 10 -> 77;
            case 11 -> 39;
            case 12 -> 23;
            case 13 -> 0;
            case 14 -> 102;
            case 15 -> 127;
            case 16 -> 121;
            case 17 -> 158;
            case 18 -> 28;
            case 19 -> 8;
            case 20 -> 63;
            case 21 -> 155;
            case 22 -> 78;
            case 23 -> 255;
            case 24 -> 248;
            case 25 -> 50;
            case 26 -> 42;
            case 27 -> 4;
            case 28 -> 246;
            case 29 -> 140;
            case 30 -> 13;
            case 31 -> 7;
            case 32 -> 233;
            case 33 -> 201;
            case 34 -> 245;
            case 35 -> 12;
            case 36 -> 157;
            case 37 -> 161;
            case 38 -> 250;
            case 39 -> 169;
            case 40 -> 60;
            case 41 -> 115;
            case 42 -> 230;
            case 43 -> 239;
            case 44 -> 232;
            case 45 -> 123;
            case 46 -> 131;
            case 47 -> 91;
            case 48 -> 49;
            case 49 -> 113;
            case 50 -> 210;
            case 51 -> 211;
            case 52 -> 62;
            case 53 -> 242;
            case 54 -> 104;
            case 55 -> 126;
            case 56 -> 186;
            case 57 -> 249;
            case 58 -> 179;
            case 59 -> 118;
            case 60 -> 194;
            case 61 -> 29;
            case 62 -> 244;
            case 63 -> 189;
            case 64 -> 198;
            case 65 -> 76;
            case 66 -> 34;
            case 67 -> 80;
            case 68 -> 213;
            case 69 -> 116;
            case 70 -> 182;
            case 71 -> 202;
            case 72 -> 135;
            case 73 -> 132;
            case 74 -> 180;
            case 75 -> 45;
            case 76 -> 160;
            case 77 -> 136;
            case 78 -> 97;
            case 79 -> 101;
            case 80 -> 172;
            case 81 -> 243;
            case 82 -> 65;
            case 83 -> 17;
            case 84 -> 47;
            case 85 -> 226;
            case 86 -> 176;
            case 87 -> 207;
            case 88 -> 73;
            case 89 -> 72;
            case 90 -> 209;
            case 91 -> 193;
            case 92 -> 204;
            case 93 -> 190;
            case 94 -> 74;
            case 95 -> 27;
            case 96 -> 93;
            case 97 -> 10;
            case 98 -> 32;
            case 99 -> 22;
            case 100 -> 238;
            case 101 -> 98;
            case 102 -> 188;
            case 103 -> 122;
            case 104 -> 81;
            case 105 -> 163;
            case 106 -> 100;
            case 107 -> 241;
            case 108 -> 94;
            case 109 -> 225;
            case 110 -> 164;
            case 111 -> 175;
            case 112 -> 154;
            case 113 -> 221;
            case 114 -> 137;
            case 115 -> 133;
            case 116 -> 96;
            case 117 -> 110;
            case 118 -> 200;
            case 119 -> 5;
            case 120 -> 229;
            case 121 -> 125;
            case 122 -> 1;
            case 123 -> 138;
            case 124 -> 170;
            case 125 -> 84;
            case 126 -> 114;
            case 127 -> 178;
            case 128 -> 86;
            case 129 -> 144;
            case 130 -> 46;
            case 131 -> 128;
            case 132 -> 79;
            case 133 -> 35;
            case 134 -> 82;
            case 135 -> 106;
            case 136 -> 38;
            case 137 -> 151;
            case 138 -> 33;
            case 139 -> 105;
            case 140 -> 254;
            case 141 -> 143;
            case 142 -> 20;
            case 143 -> 251;
            case 144 -> 203;
            case 145 -> 191;
            case 146 -> 15;
            case 147 -> 40;
            case 148 -> 89;
            case 149 -> 112;
            case 150 -> 152;
            case 151 -> 88;
            case 152 -> 75;
            case 153 -> 206;
            case 154 -> 227;
            case 155 -> 142;
            case 156 -> 68;
            case 157 -> 253;
            case 158 -> 120;
            case 159 -> 216;
            case 160 -> 109;
            case 161 -> 111;
            case 162 -> 58;
            case 163 -> 52;
            case 164 -> 95;
            case 165 -> 167;
            case 166 -> 156;
            case 167 -> 25;
            case 168 -> 117;
            case 169 -> 26;
            case 170 -> 235;
            case 171 -> 70;
            case 172 -> 240;
            case 173 -> 150;
            case 174 -> 212;
            case 175 -> 21;
            case 176 -> 181;
            case 177 -> 87;
            case 178 -> 162;
            case 179 -> 236;
            case 180 -> 145;
            case 181 -> 85;
            case 182 -> 217;
            case 183 -> 222;
            case 184 -> 44;
            case 185 -> 208;
            case 186 -> 187;
            case 187 -> 2;
            case 188 -> 48;
            case 189 -> 36;
            case 190 -> 90;
            case 191 -> 168;
            case 192 -> 19;
            case 193 -> 92;
            case 194 -> 51;
            case 195 -> 11;
            case 196 -> 103;
            case 197 -> 64;
            case 198 -> 108;
            case 199 -> 18;
            case 200 -> 148;
            case 201 -> 129;
            case 202 -> 57;
            case 203 -> 223;
            case 204 -> 146;
            case 205 -> 56;
            case 206 -> 37;
            case 207 -> 134;
            case 208 -> 171;
            case 209 -> 141;
            case 210 -> 54;
            case 211 -> 119;
            case 212 -> 61;
            case 213 -> 228;
            case 214 -> 41;
            case 215 -> 124;
            case 216 -> 197;
            case 217 -> 67;
            case 218 -> 224;
            case 219 -> 159;
            case 220 -> 199;
            case 221 -> 24;
            case 222 -> 192;
            case 223 -> 149;
            case 224 -> 6;
            case 225 -> 234;
            case 226 -> 174;
            case 227 -> 173;
            case 228 -> 147;
            case 229 -> 66;
            case 230 -> 195;
            case 231 -> 30;
            case 232 -> 220;
            case 233 -> 166;
            case 234 -> 3;
            case 235 -> 59;
            case 236 -> 231;
            case 237 -> 55;
            case 238 -> 14;
            case 239 -> 69;
            case 240 -> 9;
            case 241 -> 185;
            case 242 -> 215;
            case 243 -> 183;
            case 244 -> 130;
            case 245 -> 205;
            case 246 -> 107;
            case 247 -> 16;
            case 248 -> 99;
            case 249 -> 83;
            case 250 -> 219;
            case 251 -> 139;
            case 252 -> 184;
            case 253 -> 252;
            case 254 -> 177;
            default -> 214;
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
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      public final boolean a() {
         int[] var1 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         long var2;
         int var10000 = (
                  var2 = System.currentTimeMillis()
                     - IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                     - 150L
               )
               == 0L
            ? 0
            : (var2 < 0L ? -1 : 1);
         if (var1 == null) {
            if (var10000 >= 0) {
               return (0 != 0);
            }

            var10000 = ((IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               .ae()) ? 1 : 0);
         }

         if (var1 != null) {
            return (var10000 != 0);
         } else {
            return (var10000 != 0);
         }
      }
   }
}
