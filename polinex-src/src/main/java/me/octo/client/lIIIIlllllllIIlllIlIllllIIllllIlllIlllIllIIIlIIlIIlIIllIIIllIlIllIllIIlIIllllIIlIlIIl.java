package me.octo.client;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl() {
      short var10001 = 31097;
      short var10002 = 19079;
      var10002 = 31099;
      short var10003 = 10703;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 31098;
      short var10005 = 31197;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      super("Viewmodel", "Customize how the held item and hand are rendered", var3, "Post", Arrays.copyOf(var1, var1.length));
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1;
   }

   public final int ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public void aB() {
      super.aB();
      this.as();
   }

   public void aC() {
      super.aC();
      this.at();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1;
   }

   @SubscribeEvent
   public final void a(@NotNull IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      int var4;
      label25: {
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         short var10002 = 31096;
         short var10003 = 9614;
         Intrinsics.checkNotNullParameter(var1, "event");
         String var2 = var10000;
         byte var3 = ((byte)((this.ap().options.keyAttack.isDown()) ? 1 : 0));
         var4 = var3;
         if (var2 == null) {
            if (var3 == 0) {
               var4 = -1;
               break label25;
            }

            var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         if (var2 == null) {
            if (var4 < 0) {
               var4 = 0;
               break label25;
            }

            var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         var4 += 1;
      }

      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var4;
   }

   @JvmStatic
   public static final void a(@NotNull PoseStack var0, @NotNull HumanoidArm var1, boolean var2) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var0, var1, var2);
   }

   @JvmStatic
   public static final float a(@NotNull InteractionHand var0, float var1) {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var0, var1);
   }

   @JvmStatic
   @NotNull
   public static final InteractionHand a(@NotNull InteractionHand var0) {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var0);
   }

   @JvmStatic
   public static final boolean ah() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   @JvmStatic
   public static final boolean ai() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
   }

   @JvmStatic
   @Nullable
   public static final Integer aG() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.c();
   }

   @JvmStatic
   public static final boolean aH() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.d();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "Ó\r»z¿#xbÕ\u0005\u009dÉ'\u00075";
      int var4 = "Ó\r»z¿#xbÕ\u0005\u009dÉ'\u00075".length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 2;
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
                     case 0 -> 8;
                     case 1 -> 52;
                     case 2 -> 123;
                     case 3 -> 44;
                     case 4 -> 65;
                     case 5 -> 93;
                     default -> 65;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl();
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = (float)Math.tan(Math.toRadians(35.0));
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "2\u0092vE\u0080õ\u0080µ?Ëþ\u000e\u0007\u0018¼A`Õ\u00911@:Ç®\u0010È_\u008bû5>\u009d{<\u001f\u001fn\u0002#T²J¦\u0015\u0011Ü\u0084ý³\u0004|\u009bÎ=";
                  var4 = "2\u0092vE\u0080õ\u0080µ?Ëþ\u000e\u0007\u0018¼A`Õ\u00911@:Ç®\u0010È_\u008bû5>\u009d{<\u001f\u001fn\u0002#T²J¦\u0015\u0011Ü\u0084ý³\u0004|\u009bÎ="
                     .length();
                  var1 = '1';
                  var8 = -1;
            }

            var10000 = 16;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 31097) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 165;
            case 1 -> 232;
            case 2 -> 236;
            case 3 -> 153;
            case 4 -> 131;
            case 5 -> 151;
            case 6 -> 167;
            case 7 -> 196;
            case 8 -> 134;
            case 9 -> 202;
            case 10 -> 113;
            case 11 -> 77;
            case 12 -> 255;
            case 13 -> 159;
            case 14 -> 193;
            case 15 -> 198;
            case 16 -> 201;
            case 17 -> 174;
            case 18 -> 115;
            case 19 -> 75;
            case 20 -> 224;
            case 21 -> 32;
            case 22 -> 222;
            case 23 -> 229;
            case 24 -> 76;
            case 25 -> 149;
            case 26 -> 107;
            case 27 -> 157;
            case 28 -> 132;
            case 29 -> 225;
            case 30 -> 69;
            case 31 -> 103;
            case 32 -> 117;
            case 33 -> 218;
            case 34 -> 188;
            case 35 -> 11;
            case 36 -> 101;
            case 37 -> 35;
            case 38 -> 211;
            case 39 -> 74;
            case 40 -> 241;
            case 41 -> 62;
            case 42 -> 102;
            case 43 -> 208;
            case 44 -> 144;
            case 45 -> 36;
            case 46 -> 204;
            case 47 -> 53;
            case 48 -> 223;
            case 49 -> 246;
            case 50 -> 126;
            case 51 -> 0;
            case 52 -> 71;
            case 53 -> 81;
            case 54 -> 38;
            case 55 -> 252;
            case 56 -> 54;
            case 57 -> 97;
            case 58 -> 147;
            case 59 -> 111;
            case 60 -> 217;
            case 61 -> 90;
            case 62 -> 17;
            case 63 -> 184;
            case 64 -> 40;
            case 65 -> 129;
            case 66 -> 34;
            case 67 -> 163;
            case 68 -> 78;
            case 69 -> 164;
            case 70 -> 106;
            case 71 -> 61;
            case 72 -> 195;
            case 73 -> 121;
            case 74 -> 239;
            case 75 -> 221;
            case 76 -> 182;
            case 77 -> 20;
            case 78 -> 214;
            case 79 -> 237;
            case 80 -> 46;
            case 81 -> 233;
            case 82 -> 177;
            case 83 -> 118;
            case 84 -> 94;
            case 85 -> 91;
            case 86 -> 33;
            case 87 -> 230;
            case 88 -> 168;
            case 89 -> 127;
            case 90 -> 79;
            case 91 -> 28;
            case 92 -> 148;
            case 93 -> 42;
            case 94 -> 93;
            case 95 -> 145;
            case 96 -> 13;
            case 97 -> 197;
            case 98 -> 44;
            case 99 -> 179;
            case 100 -> 169;
            case 101 -> 254;
            case 102 -> 116;
            case 103 -> 200;
            case 104 -> 194;
            case 105 -> 43;
            case 106 -> 203;
            case 107 -> 92;
            case 108 -> 63;
            case 109 -> 29;
            case 110 -> 10;
            case 111 -> 253;
            case 112 -> 65;
            case 113 -> 68;
            case 114 -> 141;
            case 115 -> 139;
            case 116 -> 72;
            case 117 -> 191;
            case 118 -> 26;
            case 119 -> 138;
            case 120 -> 45;
            case 121 -> 2;
            case 122 -> 3;
            case 123 -> 185;
            case 124 -> 160;
            case 125 -> 37;
            case 126 -> 55;
            case 127 -> 110;
            case 128 -> 212;
            case 129 -> 216;
            case 130 -> 183;
            case 131 -> 133;
            case 132 -> 243;
            case 133 -> 4;
            case 134 -> 21;
            case 135 -> 128;
            case 136 -> 66;
            case 137 -> 31;
            case 138 -> 234;
            case 139 -> 82;
            case 140 -> 162;
            case 141 -> 245;
            case 142 -> 51;
            case 143 -> 14;
            case 144 -> 178;
            case 145 -> 9;
            case 146 -> 64;
            case 147 -> 219;
            case 148 -> 190;
            case 149 -> 150;
            case 150 -> 18;
            case 151 -> 156;
            case 152 -> 95;
            case 153 -> 227;
            case 154 -> 47;
            case 155 -> 83;
            case 156 -> 130;
            case 157 -> 98;
            case 158 -> 100;
            case 159 -> 108;
            case 160 -> 12;
            case 161 -> 180;
            case 162 -> 137;
            case 163 -> 152;
            case 164 -> 249;
            case 165 -> 171;
            case 166 -> 8;
            case 167 -> 25;
            case 168 -> 161;
            case 169 -> 39;
            case 170 -> 187;
            case 171 -> 60;
            case 172 -> 189;
            case 173 -> 50;
            case 174 -> 140;
            case 175 -> 209;
            case 176 -> 73;
            case 177 -> 70;
            case 178 -> 7;
            case 179 -> 120;
            case 180 -> 23;
            case 181 -> 146;
            case 182 -> 250;
            case 183 -> 19;
            case 184 -> 109;
            case 185 -> 244;
            case 186 -> 173;
            case 187 -> 24;
            case 188 -> 166;
            case 189 -> 125;
            case 190 -> 136;
            case 191 -> 6;
            case 192 -> 88;
            case 193 -> 205;
            case 194 -> 123;
            case 195 -> 105;
            case 196 -> 170;
            case 197 -> 231;
            case 198 -> 172;
            case 199 -> 80;
            case 200 -> 49;
            case 201 -> 186;
            case 202 -> 112;
            case 203 -> 22;
            case 204 -> 238;
            case 205 -> 122;
            case 206 -> 155;
            case 207 -> 52;
            case 208 -> 1;
            case 209 -> 104;
            case 210 -> 57;
            case 211 -> 247;
            case 212 -> 175;
            case 213 -> 30;
            case 214 -> 16;
            case 215 -> 84;
            case 216 -> 114;
            case 217 -> 248;
            case 218 -> 86;
            case 219 -> 242;
            case 220 -> 142;
            case 221 -> 154;
            case 222 -> 235;
            case 223 -> 240;
            case 224 -> 56;
            case 225 -> 158;
            case 226 -> 99;
            case 227 -> 251;
            case 228 -> 15;
            case 229 -> 181;
            case 230 -> 41;
            case 231 -> 176;
            case 232 -> 215;
            case 233 -> 96;
            case 234 -> 192;
            case 235 -> 5;
            case 236 -> 213;
            case 237 -> 143;
            case 238 -> 124;
            case 239 -> 228;
            case 240 -> 59;
            case 241 -> 199;
            case 242 -> 206;
            case 243 -> 226;
            case 244 -> 58;
            case 245 -> 89;
            case 246 -> 67;
            case 247 -> 87;
            case 248 -> 207;
            case 249 -> 135;
            case 250 -> 220;
            case 251 -> 48;
            case 252 -> 27;
            case 253 -> 210;
            case 254 -> 85;
            default -> 119;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
       public final void a(@NotNull PoseStack param1, @NotNull HumanoidArm param2, boolean param3) {
          Intrinsics.checkNotNullParameter(param1, "poseStack");
          Intrinsics.checkNotNullParameter(param2, "arm");
          if (!lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.aA()) return;
          if (param3) {
             if (!lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().ae()) return;
          }
          boolean left = (param2 == HumanoidArm.LEFT);
          this.a(param1, left, param3);
          this.b(param1, left, param3);
          this.c(param1, left, param3);
          this.d(param1, left, param3);
       }

      private final void a(PoseStack param1, boolean param2, boolean param3) {
      String var4 = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      float var5 = 0.0F;
      float var6 = 0.0F;
      if (param3) {
         var5 = (float)me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().M();
         var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l().n();
      }
      if (var4 != null) {
         if (me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().ae()) {
            if (param2) {
               var5 = (float)me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().M();
               var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().n();
            } else {
               var5 = (float)me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().M();
               var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().n();
            }
         } else {
            var5 = (float)me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().M();
            var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().n();
         }
      }
      if (var5 < 70.0F) { return; }
      float var7 = (float)Math.tan(Math.toRadians((double)var5 / 2.0D)) / aI();
      org.joml.Matrix4f var8 = new org.joml.Matrix4f().translate(0.0F, 0.0F, -var6).scale(1.0F, 1.0F, var7).translate(0.0F, 0.0F, var6);
      param1.last().pose().mul((org.joml.Matrix4fc)var8);
      }

      private final void b(PoseStack param1, boolean param2, boolean param3) {
      String var4 = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      if (param3) {
         var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().n();
         var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().n();
         var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().n();
      }
      if (me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().ae()) {
         if (param2) {
            var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().n();
            var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().n();
            var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().n();
         } else {
            var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h().n();
            var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i().n();
            var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().n();
         }
      }
      if (var4 != null) {
         var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().n();
         var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().n();
         var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().n();
      }
      if (var5 >= 1.0F && var6 >= 1.0F && var7 >= 1.0F) { return; }
      param1.scale(var5, var6, var7);
      }

      private final void c(PoseStack param1, boolean param2, boolean param3) {
      String var4 = me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      if (param3) {
         var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().n();
         var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().n();
         var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().n();
      }
      if (var4 != null) {
         if (me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().ae()) {
            if (param2) {
               var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().n();
               var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().n();
               var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().n();
            } else {
               var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h().n();
               var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i().n();
               var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().n();
            }
         } else {
            var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().n();
            var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().n();
            var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().n();
         }
      }
      if (var5 <= 0.0F && var6 <= 0.0F && var7 <= 0.0F) {
         return;
      }
      param1.translate(param2 ? -var5 : var5, var6, var7);
      }

      private final void d(PoseStack param1, boolean param2, boolean param3) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      if (param3) {
         var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h().M();
         var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i().M();
         var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().M();
      } else if (me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().ae()) {
         var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h().M();
         var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i().M();
         var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().M();
      } else {
         var5 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().M();
         var6 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().M();
         var7 = me.octo.client.lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().M();
      }

      if (var5 == 0 || var6 == 0 || var7 == 0) {
         return;
      }

      int var8 = param2 ? -1 : 1;
      int var9 = param2 ? -1 : 1;
      param1.mulPose((org.joml.Quaternionfc) com.mojang.math.Axis.XP.rotationDegrees((float) var5));
      param1.mulPose((org.joml.Quaternionfc) com.mojang.math.Axis.YP.rotationDegrees((float) (var6 * var8)));
      param1.mulPose((org.joml.Quaternionfc) com.mojang.math.Axis.ZP.rotationDegrees((float) (var7 * var9)));
      }

      @JvmStatic
      public final float a(@NotNull InteractionHand param1, float param2) {
String var3 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l(); Intrinsics.checkNotNullParameter(param1, "hand"); float var4;
switch (param1.ordinal()) { case 0: var4 = lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().n(); break; case 1: var4 = lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().n(); break; default: throw new NoWhenBranchMatchedException(); }
if (var3 != null || var4 > 0.0F) { return var4; } return param2;
      }

      @JvmStatic
      @NotNull
      public final InteractionHand a(@NotNull InteractionHand param1) {
String var2 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l(); Intrinsics.checkNotNullParameter(param1, "hand");
if (var2 != null) { int var3 = lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().x(); switch (var3) { case 1: return var2 != null ? param1 : (param1 == InteractionHand.MAIN_HAND ? InteractionHand.OFF_HAND : InteractionHand.MAIN_HAND); case 2: return InteractionHand.MAIN_HAND; case 3: return InteractionHand.OFF_HAND; default: return param1; } }
return param1;
      }

      @JvmStatic
      public final boolean a() {
String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l(); boolean var2 = lIIIIlllllllIIlllIlIllllIIllllIlllIlllIllIIIlIIlIIlIIllIIIllIlIllIllIIlIIllllIIlIlIIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.aA();
if (var1 != null) { return var2; }
return var2 ? lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().x() == 4 : false;
      }

      @JvmStatic
      public final boolean b() {
return lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().ae();
      }

      @JvmStatic
      @Nullable
      public final Integer c() {
int var1 = lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().M(); return var1 == 6 ? null : Integer.valueOf(RangesKt.coerceAtLeast(var1, 1));
      }

      @JvmStatic
      public final boolean d() {
return lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().ae();
      }

      private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "0¹\u001cs\t\u0096VÎ@\u0001©+\u0010»";
         int var4 = "0¹\u001cs\t\u0096VÎ@\u0001©+\u0010»".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 32;
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
                        case 0 -> 19;
                        case 1 -> 83;
                        case 2 -> 87;
                        case 3 -> 35;
                        case 4 -> 88;
                        case 5 -> 92;
                        default -> 124;
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
                        b = new String[4];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "æ{½P\u0003@?B";
                     var4 = "æ{½P\u0003@?B".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 113;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -25887) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 217;
               case 1 -> 246;
               case 2 -> 199;
               case 3 -> 118;
               case 4 -> 143;
               case 5 -> 83;
               case 6 -> 103;
               case 7 -> 174;
               case 8 -> 206;
               case 9 -> 166;
               case 10 -> 136;
               case 11 -> 122;
               case 12 -> 7;
               case 13 -> 5;
               case 14 -> 0;
               case 15 -> 249;
               case 16 -> 219;
               case 17 -> 154;
               case 18 -> 72;
               case 19 -> 85;
               case 20 -> 150;
               case 21 -> 33;
               case 22 -> 100;
               case 23 -> 211;
               case 24 -> 13;
               case 25 -> 48;
               case 26 -> 10;
               case 27 -> 229;
               case 28 -> 41;
               case 29 -> 176;
               case 30 -> 127;
               case 31 -> 194;
               case 32 -> 84;
               case 33 -> 35;
               case 34 -> 193;
               case 35 -> 157;
               case 36 -> 124;
               case 37 -> 38;
               case 38 -> 155;
               case 39 -> 46;
               case 40 -> 178;
               case 41 -> 32;
               case 42 -> 238;
               case 43 -> 232;
               case 44 -> 101;
               case 45 -> 111;
               case 46 -> 49;
               case 47 -> 54;
               case 48 -> 233;
               case 49 -> 251;
               case 50 -> 179;
               case 51 -> 77;
               case 52 -> 223;
               case 53 -> 190;
               case 54 -> 160;
               case 55 -> 175;
               case 56 -> 203;
               case 57 -> 75;
               case 58 -> 158;
               case 59 -> 97;
               case 60 -> 195;
               case 61 -> 148;
               case 62 -> 67;
               case 63 -> 28;
               case 64 -> 254;
               case 65 -> 234;
               case 66 -> 173;
               case 67 -> 192;
               case 68 -> 152;
               case 69 -> 55;
               case 70 -> 78;
               case 71 -> 53;
               case 72 -> 185;
               case 73 -> 18;
               case 74 -> 198;
               case 75 -> 21;
               case 76 -> 162;
               case 77 -> 253;
               case 78 -> 123;
               case 79 -> 139;
               case 80 -> 170;
               case 81 -> 182;
               case 82 -> 119;
               case 83 -> 79;
               case 84 -> 184;
               case 85 -> 161;
               case 86 -> 81;
               case 87 -> 59;
               case 88 -> 243;
               case 89 -> 113;
               case 90 -> 242;
               case 91 -> 220;
               case 92 -> 95;
               case 93 -> 63;
               case 94 -> 164;
               case 95 -> 165;
               case 96 -> 167;
               case 97 -> 230;
               case 98 -> 51;
               case 99 -> 213;
               case 100 -> 140;
               case 101 -> 66;
               case 102 -> 146;
               case 103 -> 65;
               case 104 -> 19;
               case 105 -> 68;
               case 106 -> 26;
               case 107 -> 105;
               case 108 -> 207;
               case 109 -> 99;
               case 110 -> 134;
               case 111 -> 82;
               case 112 -> 181;
               case 113 -> 221;
               case 114 -> 204;
               case 115 -> 94;
               case 116 -> 228;
               case 117 -> 89;
               case 118 -> 91;
               case 119 -> 208;
               case 120 -> 245;
               case 121 -> 145;
               case 122 -> 159;
               case 123 -> 222;
               case 124 -> 131;
               case 125 -> 209;
               case 126 -> 8;
               case 127 -> 22;
               case 128 -> 61;
               case 129 -> 171;
               case 130 -> 14;
               case 131 -> 151;
               case 132 -> 244;
               case 133 -> 47;
               case 134 -> 44;
               case 135 -> 34;
               case 136 -> 6;
               case 137 -> 2;
               case 138 -> 202;
               case 139 -> 144;
               case 140 -> 147;
               case 141 -> 191;
               case 142 -> 92;
               case 143 -> 132;
               case 144 -> 250;
               case 145 -> 197;
               case 146 -> 87;
               case 147 -> 135;
               case 148 -> 212;
               case 149 -> 120;
               case 150 -> 30;
               case 151 -> 239;
               case 152 -> 88;
               case 153 -> 16;
               case 154 -> 196;
               case 155 -> 57;
               case 156 -> 210;
               case 157 -> 121;
               case 158 -> 189;
               case 159 -> 235;
               case 160 -> 141;
               case 161 -> 130;
               case 162 -> 177;
               case 163 -> 231;
               case 164 -> 37;
               case 165 -> 108;
               case 166 -> 168;
               case 167 -> 200;
               case 168 -> 15;
               case 169 -> 237;
               case 170 -> 39;
               case 171 -> 29;
               case 172 -> 180;
               case 173 -> 40;
               case 174 -> 43;
               case 175 -> 236;
               case 176 -> 56;
               case 177 -> 1;
               case 178 -> 241;
               case 179 -> 112;
               case 180 -> 142;
               case 181 -> 73;
               case 182 -> 255;
               case 183 -> 27;
               case 184 -> 96;
               case 185 -> 225;
               case 186 -> 115;
               case 187 -> 102;
               case 188 -> 60;
               case 189 -> 62;
               case 190 -> 110;
               case 191 -> 45;
               case 192 -> 186;
               case 193 -> 138;
               case 194 -> 117;
               case 195 -> 149;
               case 196 -> 31;
               case 197 -> 214;
               case 198 -> 172;
               case 199 -> 3;
               case 200 -> 187;
               case 201 -> 224;
               case 202 -> 23;
               case 203 -> 201;
               case 204 -> 24;
               case 205 -> 86;
               case 206 -> 74;
               case 207 -> 107;
               case 208 -> 216;
               case 209 -> 76;
               case 210 -> 17;
               case 211 -> 114;
               case 212 -> 4;
               case 213 -> 69;
               case 214 -> 104;
               case 215 -> 36;
               case 216 -> 128;
               case 217 -> 64;
               case 218 -> 80;
               case 219 -> 137;
               case 220 -> 205;
               case 221 -> 240;
               case 222 -> 156;
               case 223 -> 106;
               case 224 -> 93;
               case 225 -> 133;
               case 226 -> 248;
               case 227 -> 98;
               case 228 -> 11;
               case 229 -> 129;
               case 230 -> 9;
               case 231 -> 25;
               case 232 -> 215;
               case 233 -> 71;
               case 234 -> 169;
               case 235 -> 126;
               case 236 -> 227;
               case 237 -> 42;
               case 238 -> 70;
               case 239 -> 50;
               case 240 -> 183;
               case 241 -> 116;
               case 242 -> 109;
               case 243 -> 226;
               case 244 -> 58;
               case 245 -> 247;
               case 246 -> 188;
               case 247 -> 252;
               case 248 -> 90;
               case 249 -> 218;
               case 250 -> 163;
               case 251 -> 20;
               case 252 -> 12;
               case 253 -> 125;
               case 254 -> 52;
               default -> 153;
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

  // PX-FIX synth restored from jar bytecode
  public static final float aI() { return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI; }
}
