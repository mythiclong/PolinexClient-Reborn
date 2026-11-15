package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI() {
      short var10001 = 25783;
      short var10002 = -6770;
      var10002 = 25780;
      short var10003 = 2968;
      short var10004 = 25781;
      short var10005 = 27549;
      super(
         "test module",
         "test pathfinder",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         "Movement"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      int var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      short var10002 = 25782;
      short var10003 = 28130;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      if (var2 == 0) {
         if (var1.c()) {
            return;
         }

         LocalPlayer var3 = this.ap().player;
         Intrinsics.checkNotNull(var3);
         Vec3 var4 = var3.getDeltaMovement();
         short var10001 = 25778;
         var10002 = -23869;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("motion: " + var4);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0014®UV\u0097\u000b(²÷¾Cü-A,×n\u000f²\u001c¤k)[n\u001b\u0096\u0084\u008bÔíR]";
      int var4 = "\u0014®UV\u0097\u000b(²÷¾Cü-A,×n\u000f²\u001c¤k)[n\u001b\u0096\u0084\u008bÔíR]".length();
      char var1 = 5;
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
                     case 0 -> 114;
                     case 1 -> 80;
                     case 2 -> 30;
                     case 3 -> 116;
                     case 4 -> 104;
                     case 5 -> 25;
                     default -> 40;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI();
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

                  var2 = "\u0083Ñ\u0082\u0093\u001eyxó\b,#QÁ$µ)T";
                  var4 = "\u0083Ñ\u0082\u0093\u001eyxó\b,#QÁ$µ)T".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25782) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 228;
            case 1 -> 63;
            case 2 -> 240;
            case 3 -> 253;
            case 4 -> 131;
            case 5 -> 91;
            case 6 -> 78;
            case 7 -> 52;
            case 8 -> 145;
            case 9 -> 216;
            case 10 -> 202;
            case 11 -> 64;
            case 12 -> 32;
            case 13 -> 146;
            case 14 -> 169;
            case 15 -> 168;
            case 16 -> 199;
            case 17 -> 10;
            case 18 -> 194;
            case 19 -> 17;
            case 20 -> 55;
            case 21 -> 143;
            case 22 -> 197;
            case 23 -> 212;
            case 24 -> 135;
            case 25 -> 33;
            case 26 -> 74;
            case 27 -> 111;
            case 28 -> 8;
            case 29 -> 104;
            case 30 -> 133;
            case 31 -> 241;
            case 32 -> 125;
            case 33 -> 172;
            case 34 -> 137;
            case 35 -> 20;
            case 36 -> 246;
            case 37 -> 162;
            case 38 -> 254;
            case 39 -> 226;
            case 40 -> 67;
            case 41 -> 22;
            case 42 -> 251;
            case 43 -> 156;
            case 44 -> 233;
            case 45 -> 244;
            case 46 -> 117;
            case 47 -> 96;
            case 48 -> 204;
            case 49 -> 232;
            case 50 -> 219;
            case 51 -> 176;
            case 52 -> 88;
            case 53 -> 255;
            case 54 -> 128;
            case 55 -> 54;
            case 56 -> 46;
            case 57 -> 118;
            case 58 -> 93;
            case 59 -> 227;
            case 60 -> 5;
            case 61 -> 196;
            case 62 -> 113;
            case 63 -> 193;
            case 64 -> 58;
            case 65 -> 187;
            case 66 -> 206;
            case 67 -> 211;
            case 68 -> 123;
            case 69 -> 144;
            case 70 -> 224;
            case 71 -> 115;
            case 72 -> 179;
            case 73 -> 198;
            case 74 -> 205;
            case 75 -> 185;
            case 76 -> 83;
            case 77 -> 214;
            case 78 -> 4;
            case 79 -> 23;
            case 80 -> 101;
            case 81 -> 12;
            case 82 -> 28;
            case 83 -> 42;
            case 84 -> 26;
            case 85 -> 152;
            case 86 -> 234;
            case 87 -> 34;
            case 88 -> 57;
            case 89 -> 116;
            case 90 -> 229;
            case 91 -> 38;
            case 92 -> 153;
            case 93 -> 0;
            case 94 -> 171;
            case 95 -> 1;
            case 96 -> 121;
            case 97 -> 9;
            case 98 -> 13;
            case 99 -> 85;
            case 100 -> 35;
            case 101 -> 39;
            case 102 -> 208;
            case 103 -> 110;
            case 104 -> 37;
            case 105 -> 107;
            case 106 -> 3;
            case 107 -> 45;
            case 108 -> 174;
            case 109 -> 225;
            case 110 -> 245;
            case 111 -> 98;
            case 112 -> 149;
            case 113 -> 70;
            case 114 -> 51;
            case 115 -> 170;
            case 116 -> 2;
            case 117 -> 134;
            case 118 -> 163;
            case 119 -> 237;
            case 120 -> 76;
            case 121 -> 175;
            case 122 -> 173;
            case 123 -> 49;
            case 124 -> 139;
            case 125 -> 106;
            case 126 -> 114;
            case 127 -> 252;
            case 128 -> 100;
            case 129 -> 30;
            case 130 -> 151;
            case 131 -> 161;
            case 132 -> 25;
            case 133 -> 19;
            case 134 -> 62;
            case 135 -> 89;
            case 136 -> 36;
            case 137 -> 129;
            case 138 -> 140;
            case 139 -> 159;
            case 140 -> 92;
            case 141 -> 235;
            case 142 -> 132;
            case 143 -> 190;
            case 144 -> 223;
            case 145 -> 73;
            case 146 -> 158;
            case 147 -> 150;
            case 148 -> 148;
            case 149 -> 53;
            case 150 -> 180;
            case 151 -> 192;
            case 152 -> 6;
            case 153 -> 97;
            case 154 -> 95;
            case 155 -> 183;
            case 156 -> 68;
            case 157 -> 48;
            case 158 -> 164;
            case 159 -> 102;
            case 160 -> 90;
            case 161 -> 71;
            case 162 -> 186;
            case 163 -> 80;
            case 164 -> 201;
            case 165 -> 16;
            case 166 -> 40;
            case 167 -> 44;
            case 168 -> 243;
            case 169 -> 215;
            case 170 -> 182;
            case 171 -> 47;
            case 172 -> 124;
            case 173 -> 177;
            case 174 -> 60;
            case 175 -> 87;
            case 176 -> 77;
            case 177 -> 105;
            case 178 -> 15;
            case 179 -> 43;
            case 180 -> 41;
            case 181 -> 84;
            case 182 -> 120;
            case 183 -> 126;
            case 184 -> 108;
            case 185 -> 160;
            case 186 -> 27;
            case 187 -> 122;
            case 188 -> 188;
            case 189 -> 21;
            case 190 -> 56;
            case 191 -> 138;
            case 192 -> 218;
            case 193 -> 147;
            case 194 -> 59;
            case 195 -> 195;
            case 196 -> 213;
            case 197 -> 165;
            case 198 -> 81;
            case 199 -> 66;
            case 200 -> 69;
            case 201 -> 167;
            case 202 -> 109;
            case 203 -> 136;
            case 204 -> 65;
            case 205 -> 181;
            case 206 -> 221;
            case 207 -> 166;
            case 208 -> 29;
            case 209 -> 242;
            case 210 -> 210;
            case 211 -> 7;
            case 212 -> 119;
            case 213 -> 203;
            case 214 -> 209;
            case 215 -> 154;
            case 216 -> 18;
            case 217 -> 79;
            case 218 -> 178;
            case 219 -> 11;
            case 220 -> 50;
            case 221 -> 75;
            case 222 -> 184;
            case 223 -> 200;
            case 224 -> 222;
            case 225 -> 191;
            case 226 -> 99;
            case 227 -> 31;
            case 228 -> 239;
            case 229 -> 142;
            case 230 -> 14;
            case 231 -> 236;
            case 232 -> 127;
            case 233 -> 94;
            case 234 -> 238;
            case 235 -> 103;
            case 236 -> 112;
            case 237 -> 141;
            case 238 -> 82;
            case 239 -> 130;
            case 240 -> 24;
            case 241 -> 217;
            case 242 -> 231;
            case 243 -> 249;
            case 244 -> 230;
            case 245 -> 72;
            case 246 -> 247;
            case 247 -> 157;
            case 248 -> 155;
            case 249 -> 220;
            case 250 -> 250;
            case 251 -> 207;
            case 252 -> 189;
            case 253 -> 248;
            case 254 -> 86;
            default -> 61;
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
      public final lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI a() {
         return lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
   }
      public static final me.octo.client.lIIIIllllIIIIIIlllIIlIIIIlIIllIlIllIlllllllllIIIIlIllIlIIlIlIIIIlIlIIlIIlIlllIIlIIllI ag() {
         return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
}
