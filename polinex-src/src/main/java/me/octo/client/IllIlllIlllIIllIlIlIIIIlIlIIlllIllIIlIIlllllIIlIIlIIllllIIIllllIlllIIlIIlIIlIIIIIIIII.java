package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Endermite;
import org.jetbrains.annotations.NotNull;

public final class IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII() {
      short var10001 = 22491;
      short var10002 = 5903;
      var10002 = 22489;
      short var10003 = -1884;
      short var10004 = 22490;
      short var10005 = -29359;
      super(
         "Thyst Hider",
         "Hides thysts.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Crystal Hollows"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = 22488;
      short var10003 = -21338;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 != null) {
         LivingEntity var4 = var1.k();
         if (var4 != null) {
            LivingEntity var3 = var4;
            if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               )
             {
               LivingEntity var5 = var3;
               if (var2 != null) {
                  if (!(var3 instanceof Endermite)) {
                     return;
                  }

                  var5 = var3;
               }

               ((Endermite)var5).setInvisible(true);
            }

            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "½ï\u008cî¡\u0086ó#´Ù\t\u000fZù\u0085u\u0080´óE8\u007f/\u0013\r\u0081î";
      int var4 = "½ï\u008cî¡\u0086ó#´Ù\t\u000fZù\u0085u\u0080´óE8\u007f/\u0013\r\u0081î".length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 109;
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
                     case 0 -> 27;
                     case 1 -> 77;
                     case 2 -> 63;
                     case 3 -> 108;
                     case 4 -> 53;
                     case 5 -> 43;
                     default -> 19;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IllIlllIlllIIllIlIlIIIIlIlIIlllIllIIlIIlllllIIlIIlIIllllIIIllllIlllIIlIIlIIlIIIIIIIII();
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

                  var2 = "Ývà\bwl\u0010\u009d\u008cÛTåÚ\u0005Ä\u0087JÁ\u0004";
                  var4 = "Ývà\bwl\u0010\u009d\u008cÛTåÚ\u0005Ä\u0087JÁ\u0004".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 75;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 22491) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 159;
            case 1 -> 86;
            case 2 -> 79;
            case 3 -> 56;
            case 4 -> 144;
            case 5 -> 235;
            case 6 -> 107;
            case 7 -> 45;
            case 8 -> 167;
            case 9 -> 209;
            case 10 -> 183;
            case 11 -> 249;
            case 12 -> 24;
            case 13 -> 47;
            case 14 -> 164;
            case 15 -> 120;
            case 16 -> 77;
            case 17 -> 26;
            case 18 -> 90;
            case 19 -> 37;
            case 20 -> 240;
            case 21 -> 212;
            case 22 -> 168;
            case 23 -> 13;
            case 24 -> 191;
            case 25 -> 193;
            case 26 -> 238;
            case 27 -> 53;
            case 28 -> 43;
            case 29 -> 177;
            case 30 -> 127;
            case 31 -> 92;
            case 32 -> 133;
            case 33 -> 116;
            case 34 -> 57;
            case 35 -> 202;
            case 36 -> 232;
            case 37 -> 51;
            case 38 -> 23;
            case 39 -> 161;
            case 40 -> 173;
            case 41 -> 208;
            case 42 -> 38;
            case 43 -> 8;
            case 44 -> 226;
            case 45 -> 44;
            case 46 -> 199;
            case 47 -> 115;
            case 48 -> 88;
            case 49 -> 131;
            case 50 -> 62;
            case 51 -> 251;
            case 52 -> 28;
            case 53 -> 248;
            case 54 -> 50;
            case 55 -> 163;
            case 56 -> 136;
            case 57 -> 171;
            case 58 -> 100;
            case 59 -> 52;
            case 60 -> 75;
            case 61 -> 220;
            case 62 -> 64;
            case 63 -> 48;
            case 64 -> 97;
            case 65 -> 252;
            case 66 -> 211;
            case 67 -> 82;
            case 68 -> 237;
            case 69 -> 91;
            case 70 -> 138;
            case 71 -> 152;
            case 72 -> 170;
            case 73 -> 11;
            case 74 -> 190;
            case 75 -> 214;
            case 76 -> 27;
            case 77 -> 227;
            case 78 -> 207;
            case 79 -> 243;
            case 80 -> 72;
            case 81 -> 121;
            case 82 -> 166;
            case 83 -> 68;
            case 84 -> 143;
            case 85 -> 36;
            case 86 -> 244;
            case 87 -> 194;
            case 88 -> 73;
            case 89 -> 176;
            case 90 -> 102;
            case 91 -> 109;
            case 92 -> 241;
            case 93 -> 247;
            case 94 -> 142;
            case 95 -> 150;
            case 96 -> 254;
            case 97 -> 22;
            case 98 -> 17;
            case 99 -> 3;
            case 100 -> 5;
            case 101 -> 84;
            case 102 -> 98;
            case 103 -> 201;
            case 104 -> 175;
            case 105 -> 255;
            case 106 -> 218;
            case 107 -> 184;
            case 108 -> 49;
            case 109 -> 196;
            case 110 -> 19;
            case 111 -> 148;
            case 112 -> 224;
            case 113 -> 29;
            case 114 -> 18;
            case 115 -> 95;
            case 116 -> 155;
            case 117 -> 12;
            case 118 -> 105;
            case 119 -> 182;
            case 120 -> 96;
            case 121 -> 231;
            case 122 -> 141;
            case 123 -> 151;
            case 124 -> 41;
            case 125 -> 110;
            case 126 -> 137;
            case 127 -> 216;
            case 128 -> 186;
            case 129 -> 124;
            case 130 -> 114;
            case 131 -> 197;
            case 132 -> 239;
            case 133 -> 225;
            case 134 -> 174;
            case 135 -> 111;
            case 136 -> 236;
            case 137 -> 123;
            case 138 -> 139;
            case 139 -> 15;
            case 140 -> 21;
            case 141 -> 223;
            case 142 -> 206;
            case 143 -> 1;
            case 144 -> 230;
            case 145 -> 25;
            case 146 -> 219;
            case 147 -> 122;
            case 148 -> 181;
            case 149 -> 162;
            case 150 -> 108;
            case 151 -> 60;
            case 152 -> 65;
            case 153 -> 85;
            case 154 -> 42;
            case 155 -> 101;
            case 156 -> 215;
            case 157 -> 132;
            case 158 -> 153;
            case 159 -> 117;
            case 160 -> 160;
            case 161 -> 178;
            case 162 -> 63;
            case 163 -> 33;
            case 164 -> 76;
            case 165 -> 118;
            case 166 -> 78;
            case 167 -> 104;
            case 168 -> 204;
            case 169 -> 94;
            case 170 -> 145;
            case 171 -> 35;
            case 172 -> 87;
            case 173 -> 46;
            case 174 -> 195;
            case 175 -> 67;
            case 176 -> 129;
            case 177 -> 130;
            case 178 -> 74;
            case 179 -> 61;
            case 180 -> 165;
            case 181 -> 146;
            case 182 -> 2;
            case 183 -> 217;
            case 184 -> 103;
            case 185 -> 179;
            case 186 -> 7;
            case 187 -> 31;
            case 188 -> 172;
            case 189 -> 16;
            case 190 -> 222;
            case 191 -> 71;
            case 192 -> 198;
            case 193 -> 70;
            case 194 -> 80;
            case 195 -> 134;
            case 196 -> 154;
            case 197 -> 9;
            case 198 -> 192;
            case 199 -> 32;
            case 200 -> 69;
            case 201 -> 39;
            case 202 -> 253;
            case 203 -> 112;
            case 204 -> 205;
            case 205 -> 242;
            case 206 -> 59;
            case 207 -> 157;
            case 208 -> 135;
            case 209 -> 180;
            case 210 -> 234;
            case 211 -> 0;
            case 212 -> 14;
            case 213 -> 93;
            case 214 -> 119;
            case 215 -> 83;
            case 216 -> 233;
            case 217 -> 228;
            case 218 -> 147;
            case 219 -> 125;
            case 220 -> 213;
            case 221 -> 20;
            case 222 -> 203;
            case 223 -> 245;
            case 224 -> 55;
            case 225 -> 34;
            case 226 -> 30;
            case 227 -> 106;
            case 228 -> 58;
            case 229 -> 250;
            case 230 -> 126;
            case 231 -> 10;
            case 232 -> 189;
            case 233 -> 113;
            case 234 -> 40;
            case 235 -> 128;
            case 236 -> 158;
            case 237 -> 246;
            case 238 -> 140;
            case 239 -> 187;
            case 240 -> 66;
            case 241 -> 156;
            case 242 -> 149;
            case 243 -> 210;
            case 244 -> 185;
            case 245 -> 6;
            case 246 -> 221;
            case 247 -> 89;
            case 248 -> 200;
            case 249 -> 99;
            case 250 -> 54;
            case 251 -> 188;
            case 252 -> 81;
            case 253 -> 229;
            case 254 -> 169;
            default -> 4;
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
   }
}
