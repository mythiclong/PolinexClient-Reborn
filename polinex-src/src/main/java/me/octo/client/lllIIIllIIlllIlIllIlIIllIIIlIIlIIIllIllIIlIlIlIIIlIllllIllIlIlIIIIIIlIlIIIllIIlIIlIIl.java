package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Creeper;
import org.jetbrains.annotations.NotNull;

public final class lllIIIllIIlllIlIllIlIIllIIIlIIlIIIllIllIIlIlIlIIIlIllllIllIlIlIIIIIIlIlIIIllIIlIIlIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllIIIllIIlllIlIllIlIIllIIIlIIlIIIllIllIIlIlIlIIIlIllllIllIlIlIIIIIIlIlIIIllIIlIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lllIIIllIIlllIlIllIlIIllIIIlIIlIIIllIllIIlIlIlIIIlIllllIllIlIlIIIIIIlIlIIIllIIlIIlIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private lllIIIllIIlllIlIllIlIIllIIIlIIlIIIllIllIIlIlIlIIIlIllllIllIlIlIIIIIIlIlIIIllIIlIIlIIl() {
      short var10001 = 8996;
      short var10002 = 28535;
      var10002 = 8999;
      short var10003 = -8454;
      short var10004 = 8998;
      short var10005 = 18887;
      super(
         "Show Ghosts",
         "Makes invisible Creepers visible.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         "Ghosts"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = 8997;
      short var10003 = -1551;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 == null) {
         LivingEntity var4 = var1.k();
         if (var4 != null) {
            LivingEntity var3 = var4;
            LivingEntity var5 = var3;
            if (var2 == null) {
               if (!(var3 instanceof Creeper)) {
                  return;
               }

               var5 = var3;
            }

            ((Creeper)var5).setInvisible(false);
            return;
         }
      }
   }

   @Override
   public void aB() {
      this.as();
   }

   @Override
   public void aC() {
      this.at();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u001d\u0095ÌWÃù~G&ÂÂZÝ\u0011Â82\u009c'0/\u00982I\u0097mE\u0014·&>B'\u0006Z¿k,´\u0011";
      int var4 = "\u001d\u0095ÌWÃù~G&ÂÂZÝ\u0011Â82\u009c'0/\u00982I\u0097mE\u0014·&>B'\u0006Z¿k,´\u0011".length();
      char var1 = '!';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 69;
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
                     case 0 -> 17;
                     case 1 -> 89;
                     case 2 -> 47;
                     case 3 -> 11;
                     case 4 -> 39;
                     case 5 -> 118;
                     default -> 123;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllIIIllIIlllIlIllIlIIllIIIlIIlIIIllIllIIlIlIlIIIlIllllIllIlIlIIIIIIlIlIIIllIIlIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lllIIIllIIlllIlIllIlIIllIIIlIIlIIIllIllIIlIlIlIIIlIllllIllIlIlIIIIIIlIlIIIllIIlIIlIIl();
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

                  var2 = "\u0084ÇÍò:\u000bã\u0098ÛÝç\u008eÓ2¦Af";
                  var4 = "\u0084ÇÍò:\u000bã\u0098ÛÝç\u008eÓ2¦Af".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 31;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 8999) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 68;
            case 1 -> 98;
            case 2 -> 109;
            case 3 -> 76;
            case 4 -> 180;
            case 5 -> 145;
            case 6 -> 50;
            case 7 -> 104;
            case 8 -> 125;
            case 9 -> 164;
            case 10 -> 148;
            case 11 -> 97;
            case 12 -> 191;
            case 13 -> 114;
            case 14 -> 126;
            case 15 -> 15;
            case 16 -> 248;
            case 17 -> 44;
            case 18 -> 169;
            case 19 -> 117;
            case 20 -> 124;
            case 21 -> 230;
            case 22 -> 139;
            case 23 -> 142;
            case 24 -> 65;
            case 25 -> 174;
            case 26 -> 181;
            case 27 -> 69;
            case 28 -> 184;
            case 29 -> 166;
            case 30 -> 165;
            case 31 -> 207;
            case 32 -> 36;
            case 33 -> 254;
            case 34 -> 245;
            case 35 -> 53;
            case 36 -> 223;
            case 37 -> 152;
            case 38 -> 121;
            case 39 -> 198;
            case 40 -> 161;
            case 41 -> 141;
            case 42 -> 171;
            case 43 -> 87;
            case 44 -> 193;
            case 45 -> 99;
            case 46 -> 40;
            case 47 -> 54;
            case 48 -> 37;
            case 49 -> 215;
            case 50 -> 0;
            case 51 -> 206;
            case 52 -> 92;
            case 53 -> 116;
            case 54 -> 94;
            case 55 -> 107;
            case 56 -> 200;
            case 57 -> 190;
            case 58 -> 179;
            case 59 -> 232;
            case 60 -> 79;
            case 61 -> 101;
            case 62 -> 194;
            case 63 -> 13;
            case 64 -> 26;
            case 65 -> 149;
            case 66 -> 219;
            case 67 -> 123;
            case 68 -> 66;
            case 69 -> 130;
            case 70 -> 75;
            case 71 -> 167;
            case 72 -> 52;
            case 73 -> 246;
            case 74 -> 187;
            case 75 -> 135;
            case 76 -> 224;
            case 77 -> 8;
            case 78 -> 67;
            case 79 -> 250;
            case 80 -> 203;
            case 81 -> 247;
            case 82 -> 17;
            case 83 -> 233;
            case 84 -> 93;
            case 85 -> 62;
            case 86 -> 217;
            case 87 -> 140;
            case 88 -> 228;
            case 89 -> 61;
            case 90 -> 119;
            case 91 -> 74;
            case 92 -> 46;
            case 93 -> 7;
            case 94 -> 63;
            case 95 -> 251;
            case 96 -> 183;
            case 97 -> 43;
            case 98 -> 212;
            case 99 -> 138;
            case 100 -> 113;
            case 101 -> 237;
            case 102 -> 86;
            case 103 -> 235;
            case 104 -> 5;
            case 105 -> 18;
            case 106 -> 144;
            case 107 -> 156;
            case 108 -> 146;
            case 109 -> 106;
            case 110 -> 31;
            case 111 -> 6;
            case 112 -> 19;
            case 113 -> 21;
            case 114 -> 3;
            case 115 -> 55;
            case 116 -> 175;
            case 117 -> 84;
            case 118 -> 211;
            case 119 -> 100;
            case 120 -> 95;
            case 121 -> 195;
            case 122 -> 189;
            case 123 -> 210;
            case 124 -> 162;
            case 125 -> 182;
            case 126 -> 30;
            case 127 -> 151;
            case 128 -> 56;
            case 129 -> 91;
            case 130 -> 143;
            case 131 -> 154;
            case 132 -> 131;
            case 133 -> 111;
            case 134 -> 35;
            case 135 -> 153;
            case 136 -> 192;
            case 137 -> 81;
            case 138 -> 2;
            case 139 -> 238;
            case 140 -> 177;
            case 141 -> 134;
            case 142 -> 39;
            case 143 -> 244;
            case 144 -> 122;
            case 145 -> 197;
            case 146 -> 157;
            case 147 -> 108;
            case 148 -> 71;
            case 149 -> 78;
            case 150 -> 204;
            case 151 -> 23;
            case 152 -> 227;
            case 153 -> 80;
            case 154 -> 239;
            case 155 -> 28;
            case 156 -> 11;
            case 157 -> 29;
            case 158 -> 208;
            case 159 -> 222;
            case 160 -> 214;
            case 161 -> 201;
            case 162 -> 24;
            case 163 -> 199;
            case 164 -> 45;
            case 165 -> 112;
            case 166 -> 173;
            case 167 -> 38;
            case 168 -> 20;
            case 169 -> 147;
            case 170 -> 255;
            case 171 -> 249;
            case 172 -> 14;
            case 173 -> 51;
            case 174 -> 110;
            case 175 -> 137;
            case 176 -> 213;
            case 177 -> 33;
            case 178 -> 205;
            case 179 -> 22;
            case 180 -> 12;
            case 181 -> 150;
            case 182 -> 196;
            case 183 -> 59;
            case 184 -> 70;
            case 185 -> 158;
            case 186 -> 77;
            case 187 -> 103;
            case 188 -> 64;
            case 189 -> 226;
            case 190 -> 168;
            case 191 -> 102;
            case 192 -> 240;
            case 193 -> 10;
            case 194 -> 89;
            case 195 -> 163;
            case 196 -> 9;
            case 197 -> 129;
            case 198 -> 216;
            case 199 -> 132;
            case 200 -> 96;
            case 201 -> 188;
            case 202 -> 234;
            case 203 -> 34;
            case 204 -> 120;
            case 205 -> 155;
            case 206 -> 32;
            case 207 -> 42;
            case 208 -> 229;
            case 209 -> 1;
            case 210 -> 218;
            case 211 -> 58;
            case 212 -> 172;
            case 213 -> 202;
            case 214 -> 118;
            case 215 -> 136;
            case 216 -> 73;
            case 217 -> 160;
            case 218 -> 82;
            case 219 -> 159;
            case 220 -> 49;
            case 221 -> 241;
            case 222 -> 48;
            case 223 -> 252;
            case 224 -> 221;
            case 225 -> 72;
            case 226 -> 41;
            case 227 -> 133;
            case 228 -> 4;
            case 229 -> 225;
            case 230 -> 176;
            case 231 -> 236;
            case 232 -> 83;
            case 233 -> 105;
            case 234 -> 170;
            case 235 -> 88;
            case 236 -> 186;
            case 237 -> 185;
            case 238 -> 127;
            case 239 -> 16;
            case 240 -> 178;
            case 241 -> 128;
            case 242 -> 253;
            case 243 -> 115;
            case 244 -> 242;
            case 245 -> 231;
            case 246 -> 47;
            case 247 -> 57;
            case 248 -> 209;
            case 249 -> 27;
            case 250 -> 60;
            case 251 -> 85;
            case 252 -> 90;
            case 253 -> 220;
            case 254 -> 25;
            default -> 243;
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
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
}
