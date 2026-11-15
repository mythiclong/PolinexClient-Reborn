package me.octo.client;

import com.mojang.blaze3d.platform.Window;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl() {
      short var10001 = 16128;
      short var10002 = 13860;
      var10002 = 16131;
      short var10003 = 20548;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 16130;
      short var10005 = -7687;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIllIIIIIlIllllllIllIlIllllllIIlllIIlIIIIllIlllIllIIIIIllIIlIIIIIlIIIlIlIlllIlIlIIIII.a(),
         lIllIIIIIlIllllllIllIlIllllllIIlllIIlIIIIllIlllIllIIIIIllIIlIIIIIlIIIlIlIlllIlIlIIIII.b()
      };
      super("Stretched Res", "Stretches the world projection horizontally.", var3, "Render", var1);
   }

   public final float ag() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl var10000 = this;
      if (var1 == null) {
         if (!this.aA()) {
            return 1.0F;
         }

         var10000 = this;
      }

      Window var8 = var10000.ap().getWindow();
      short var10002 = 16129;
      short var10003 = 25945;
      Intrinsics.checkNotNullExpressionValue(var8, "getWindow(...)");
      Window var2 = var8;
      int var3 = var2.getWidth();
      int var4 = var2.getHeight();
      int var9 = var3;
      if (var1 == null) {
         if (var3 <= 0) {
            return 1.0F;
         }

         var9 = var4;
      }

      if (var1 == null) {
         if (var9 <= 0) {
            return 1.0F;
         }

         var9 = var3;
      }

      float var5 = (float)var9 / var4;
      float var6 = lIllIIIIIlIllllllIllIlIllllllIIlllIIlIIIIllIlllIllIIIIIllIIlIIIIIlIIIlIlIlllIlIlIIIII.b().q();
      float var7 = var5 / var6;
      float var12;
      int var10 = (var12 = Math.abs(var7) - (Float.MAX_VALUE)) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
      if (var1 == null) {
         var10 = var10 <= 0 ? 1 : 0;
      }

      if (var10 != 0) {
         float var11 = var7;
         if (var1 == null) {
            if (var7 <= 0.0F) {
               return 1.0F;
            }

            var11 = var7;
         }

         return var11;
      } else {
         return 1.0F;
      }
   }

   @JvmStatic
   public static final boolean ah() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0082ÿe\rÉH,ÀÉ\u0010ùéæ\t1%\u008c\u0092~¾,îÜu*U÷\u0094/\u0091ð\u008aù\u009fÿáÇÝlSé'üÝ\u0087\u0012\u0091§µëk";
      int var4 = "\u0082ÿe\rÉH,ÀÉ\u0010ùéæ\t1%\u008c\u0092~¾,îÜu*U÷\u0094/\u0091ð\u008aù\u009fÿáÇÝlSé'üÝ\u0087\u0012\u0091§µëk".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 30;
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
                     case 1 -> 101;
                     case 2 -> 120;
                     case 3 -> 46;
                     case 4 -> 113;
                     case 5 -> 107;
                     default -> 85;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl();
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

                  var2 = "\u0095Ö\b¨X~\u008d\u0090\u0010\nU\u0011\u0000\u000e Ì\u001aêÁO\f\u0010¾Y\u008d9µñ";
                  var4 = "\u0095Ö\b¨X~\u008d\u0090\u0010\nU\u0011\u0000\u000e Ì\u001aêÁO\f\u0010¾Y\u008d9µñ".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 42;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 16130) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 115;
            case 1 -> 39;
            case 2 -> 145;
            case 3 -> 64;
            case 4 -> 68;
            case 5 -> 227;
            case 6 -> 14;
            case 7 -> 190;
            case 8 -> 119;
            case 9 -> 81;
            case 10 -> 199;
            case 11 -> 31;
            case 12 -> 209;
            case 13 -> 248;
            case 14 -> 59;
            case 15 -> 208;
            case 16 -> 54;
            case 17 -> 220;
            case 18 -> 123;
            case 19 -> 104;
            case 20 -> 232;
            case 21 -> 253;
            case 22 -> 148;
            case 23 -> 198;
            case 24 -> 6;
            case 25 -> 211;
            case 26 -> 77;
            case 27 -> 191;
            case 28 -> 186;
            case 29 -> 161;
            case 30 -> 37;
            case 31 -> 210;
            case 32 -> 20;
            case 33 -> 13;
            case 34 -> 249;
            case 35 -> 129;
            case 36 -> 35;
            case 37 -> 178;
            case 38 -> 175;
            case 39 -> 36;
            case 40 -> 18;
            case 41 -> 189;
            case 42 -> 153;
            case 43 -> 155;
            case 44 -> 131;
            case 45 -> 50;
            case 46 -> 87;
            case 47 -> 180;
            case 48 -> 29;
            case 49 -> 174;
            case 50 -> 15;
            case 51 -> 96;
            case 52 -> 110;
            case 53 -> 166;
            case 54 -> 207;
            case 55 -> 194;
            case 56 -> 24;
            case 57 -> 118;
            case 58 -> 246;
            case 59 -> 22;
            case 60 -> 106;
            case 61 -> 10;
            case 62 -> 170;
            case 63 -> 159;
            case 64 -> 1;
            case 65 -> 158;
            case 66 -> 105;
            case 67 -> 125;
            case 68 -> 71;
            case 69 -> 33;
            case 70 -> 11;
            case 71 -> 100;
            case 72 -> 149;
            case 73 -> 34;
            case 74 -> 236;
            case 75 -> 42;
            case 76 -> 142;
            case 77 -> 69;
            case 78 -> 177;
            case 79 -> 150;
            case 80 -> 45;
            case 81 -> 206;
            case 82 -> 85;
            case 83 -> 99;
            case 84 -> 82;
            case 85 -> 152;
            case 86 -> 102;
            case 87 -> 66;
            case 88 -> 238;
            case 89 -> 163;
            case 90 -> 235;
            case 91 -> 79;
            case 92 -> 74;
            case 93 -> 181;
            case 94 -> 126;
            case 95 -> 215;
            case 96 -> 58;
            case 97 -> 109;
            case 98 -> 144;
            case 99 -> 176;
            case 100 -> 135;
            case 101 -> 184;
            case 102 -> 195;
            case 103 -> 171;
            case 104 -> 223;
            case 105 -> 231;
            case 106 -> 26;
            case 107 -> 202;
            case 108 -> 107;
            case 109 -> 8;
            case 110 -> 38;
            case 111 -> 130;
            case 112 -> 254;
            case 113 -> 251;
            case 114 -> 16;
            case 115 -> 113;
            case 116 -> 169;
            case 117 -> 55;
            case 118 -> 23;
            case 119 -> 101;
            case 120 -> 95;
            case 121 -> 108;
            case 122 -> 56;
            case 123 -> 46;
            case 124 -> 80;
            case 125 -> 242;
            case 126 -> 27;
            case 127 -> 241;
            case 128 -> 230;
            case 129 -> 47;
            case 130 -> 196;
            case 131 -> 19;
            case 132 -> 229;
            case 133 -> 72;
            case 134 -> 41;
            case 135 -> 124;
            case 136 -> 73;
            case 137 -> 76;
            case 138 -> 32;
            case 139 -> 128;
            case 140 -> 116;
            case 141 -> 239;
            case 142 -> 84;
            case 143 -> 21;
            case 144 -> 139;
            case 145 -> 203;
            case 146 -> 157;
            case 147 -> 146;
            case 148 -> 51;
            case 149 -> 122;
            case 150 -> 193;
            case 151 -> 240;
            case 152 -> 167;
            case 153 -> 156;
            case 154 -> 65;
            case 155 -> 3;
            case 156 -> 114;
            case 157 -> 136;
            case 158 -> 234;
            case 159 -> 44;
            case 160 -> 48;
            case 161 -> 187;
            case 162 -> 179;
            case 163 -> 182;
            case 164 -> 134;
            case 165 -> 214;
            case 166 -> 188;
            case 167 -> 162;
            case 168 -> 60;
            case 169 -> 132;
            case 170 -> 255;
            case 171 -> 0;
            case 172 -> 143;
            case 173 -> 147;
            case 174 -> 94;
            case 175 -> 103;
            case 176 -> 30;
            case 177 -> 28;
            case 178 -> 17;
            case 179 -> 168;
            case 180 -> 53;
            case 181 -> 164;
            case 182 -> 213;
            case 183 -> 243;
            case 184 -> 67;
            case 185 -> 160;
            case 186 -> 91;
            case 187 -> 25;
            case 188 -> 173;
            case 189 -> 127;
            case 190 -> 75;
            case 191 -> 216;
            case 192 -> 61;
            case 193 -> 49;
            case 194 -> 120;
            case 195 -> 112;
            case 196 -> 7;
            case 197 -> 185;
            case 198 -> 165;
            case 199 -> 218;
            case 200 -> 224;
            case 201 -> 172;
            case 202 -> 43;
            case 203 -> 12;
            case 204 -> 9;
            case 205 -> 205;
            case 206 -> 140;
            case 207 -> 245;
            case 208 -> 88;
            case 209 -> 228;
            case 210 -> 219;
            case 211 -> 4;
            case 212 -> 154;
            case 213 -> 62;
            case 214 -> 204;
            case 215 -> 89;
            case 216 -> 192;
            case 217 -> 111;
            case 218 -> 83;
            case 219 -> 70;
            case 220 -> 137;
            case 221 -> 98;
            case 222 -> 221;
            case 223 -> 90;
            case 224 -> 40;
            case 225 -> 200;
            case 226 -> 117;
            case 227 -> 63;
            case 228 -> 201;
            case 229 -> 151;
            case 230 -> 252;
            case 231 -> 133;
            case 232 -> 237;
            case 233 -> 138;
            case 234 -> 121;
            case 235 -> 197;
            case 236 -> 212;
            case 237 -> 225;
            case 238 -> 52;
            case 239 -> 97;
            case 240 -> 247;
            case 241 -> 57;
            case 242 -> 222;
            case 243 -> 2;
            case 244 -> 5;
            case 245 -> 217;
            case 246 -> 141;
            case 247 -> 183;
            case 248 -> 226;
            case 249 -> 250;
            case 250 -> 86;
            case 251 -> 78;
            case 252 -> 244;
            case 253 -> 233;
            case 254 -> 92;
            default -> 93;
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

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      public final boolean a() {
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl var2 = IIIlIllIlIIIIllIlllIIIIIIlllllllIlllllllllllllIIIIlIllIIlIIIlIIllIlIllIlIIlIIIIIIlIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         String var1 = var10000;
         int var3 = ((var2.aA()) ? 1 : 0);
         if (var1 == null) {
            if (var3 == 0) {
               return (0 != 0);
            }

            float var4;
            var3 = (var4 = Math.abs(var2.ag() - 1.0F) - 0.001F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         }

         if (var1 != null) {
            return (var3 != 0);
         } else {
            return (var3 > 0);
         }
      }
   }
}
