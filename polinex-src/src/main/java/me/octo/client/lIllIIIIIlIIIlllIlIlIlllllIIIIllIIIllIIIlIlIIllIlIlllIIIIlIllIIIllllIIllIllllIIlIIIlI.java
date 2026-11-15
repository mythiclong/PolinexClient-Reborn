package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.OptionInstanceAccessor;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIIIIIlIIIlllIlIlIlllllIIIIllIIIllIIIlIlIIllIlIlllIIIIlIllIIIllllIIllIllllIIlIIIlI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIllIIIIIlIIIlllIlIlIlllllIIIIllIIIllIIIlIlIIllIlIlllIIIIlIllIIIllllIIllIllllIIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private Double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static lIllIIIIIlIIIlllIlIlIlllllIIIIllIIIllIIIlIlIIllIlIlllIIIIlIllIIIllllIIllIllllIIlIIIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private lIllIIIIIlIIIlllIlIlIlllllIIIIllIIIllIIIlIlIIllIlIlllIIIIlIllIIIllllIIllIllllIIlIIIlI() {
      short var10001 = 1933;
      short var10002 = -28875;
      var10002 = 1935;
      short var10003 = 32423;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 1929;
      short var10005 = 29382;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlllIllIIIlIIlIIllIIlllIlIIIlllIIlIIIlIIIlIIllIIlIlllIlllllllIIlllIlIIIIIIIllIIIlIll.a(),
         IIlllIllIIIlIIlIIllIIlllIlIIIlllIIlIIIlIIIlIIllIIlIlllIlllllllIIlllIlIIIIIIIllIIIlIll.b()
      };
      super("Fullbright", "Lights up your world!", var3, "Render", var1);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      boolean var3 = this.ae();
      if (var2 == null) {
         if (!var3) {
            this.ag();
            return;
         }

         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var4 = IIlllIllIIIlIIlIIllIIlllIlIIIlllIIlIIIlIIIlIIllIIlIlllIlllllllIIlllIlIIIIIIIllIIIlIll.a();
         short var10001 = 1934;
         short var10002 = -26117;
         var3 = var4.c("Gamma");
      }

      if (var3) {
         this.aH();
         this.ah();
         if (var2 == null) {
            return;
         }
      }

      this.ai();
      this.aG();
   }

   @Override
   public void aC() {
      super.aC();
      this.ag();
   }

   private final void ag() {
      this.ai();
      this.aH();
   }

   private final void ah() {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      OptionInstance var10001 = this.ap().options.gamma();
      short var10003 = 1932;
      short var10004 = -7128;
      Intrinsics.checkNotNullExpressionValue(var10001, "gamma(...)");
      OptionInstance var2 = var10001;
      String var1 = var10000;
      var10000 = String.valueOf(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
      if (var1 == null) {
         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = (Double)var2.get();
         }

         var10000 = (String)(Object)var2;
      }

      ((OptionInstanceAccessor)(Object)var10000).setRawValue((double)IIlllIllIIIlIIlIIllIIlllIlIIIlllIIlIIIlIIIlIIllIIlIlllIlllllllIIlllIlIIIIIIIllIIIlIll.b().n());
   }

   private final void ai() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var1 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
         double var2 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         this.ap().options.gamma().set(var2);
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      }
   }

   private final void aG() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      if (var1 == null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            var2.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, false, false, false));
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
            return;
         }
      }
   }

   private final void aH() {
      String var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      lIllIIIIIlIIIlllIlIlIlllllIIIIllIIIllIIIlIlIIllIlIlllIIIIlIllIIIllllIIllIllllIIlIIIlI var10000 = this;
      if (var1 == null) {
         if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
            return;
         }

         var10000 = this;
      }

      LocalPlayer var2 = var10000.ap().player;
      if (var2 != null) {
         var2.removeEffect(MobEffects.NIGHT_VISION);
      }

      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = ")\u009fïïî-=¼F@\n2\u001f\u0088h ¦À\u0095\u0010X\u0015+8ï\u0080\u0092E/\u0082|\u0083#«\u0004\"9ÂD\u0018ö\u0018¹";
      int var4 = ")\u009fïïî-=¼F@\n2\u001f\u0088h ¦À\u0095\u0010X\u0015+8ï\u0080\u0092E/\u0082|\u0083#«\u0004\"9ÂD\u0018ö\u0018¹".length();
      char var1 = '\n';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 94;
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
                     case 0 -> 124;
                     case 1 -> 19;
                     case 2 -> 50;
                     case 3 -> 92;
                     case 4 -> 67;
                     case 5 -> 93;
                     default -> 90;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIllIIIIIlIIIlllIlIlIlllllIIIIllIIIllIIIlIlIIllIlIlllIIIIlIllIIIllllIIllIllllIIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lIllIIIIIlIIIlllIlIlIlllllIIIIllIIIllIIIlIlIIllIlIlllIIIIlIllIIIllllIIllIllllIIlIIIlI();
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

                  var2 = "Ñzº®\f\u0006¶Zâ'`W";
                  var4 = "Ñzº®\f\u0006¶Zâ'`W".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 85;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 1933) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 207;
            case 1 -> 208;
            case 2 -> 63;
            case 3 -> 161;
            case 4 -> 210;
            case 5 -> 29;
            case 6 -> 240;
            case 7 -> 85;
            case 8 -> 226;
            case 9 -> 98;
            case 10 -> 27;
            case 11 -> 232;
            case 12 -> 151;
            case 13 -> 61;
            case 14 -> 54;
            case 15 -> 148;
            case 16 -> 177;
            case 17 -> 39;
            case 18 -> 201;
            case 19 -> 17;
            case 20 -> 94;
            case 21 -> 251;
            case 22 -> 234;
            case 23 -> 137;
            case 24 -> 149;
            case 25 -> 233;
            case 26 -> 221;
            case 27 -> 219;
            case 28 -> 78;
            case 29 -> 96;
            case 30 -> 46;
            case 31 -> 131;
            case 32 -> 253;
            case 33 -> 236;
            case 34 -> 126;
            case 35 -> 48;
            case 36 -> 8;
            case 37 -> 128;
            case 38 -> 76;
            case 39 -> 116;
            case 40 -> 159;
            case 41 -> 254;
            case 42 -> 99;
            case 43 -> 64;
            case 44 -> 26;
            case 45 -> 214;
            case 46 -> 181;
            case 47 -> 55;
            case 48 -> 120;
            case 49 -> 16;
            case 50 -> 164;
            case 51 -> 206;
            case 52 -> 136;
            case 53 -> 6;
            case 54 -> 33;
            case 55 -> 13;
            case 56 -> 101;
            case 57 -> 51;
            case 58 -> 189;
            case 59 -> 152;
            case 60 -> 77;
            case 61 -> 188;
            case 62 -> 231;
            case 63 -> 69;
            case 64 -> 95;
            case 65 -> 18;
            case 66 -> 87;
            case 67 -> 169;
            case 68 -> 216;
            case 69 -> 225;
            case 70 -> 72;
            case 71 -> 56;
            case 72 -> 185;
            case 73 -> 203;
            case 74 -> 86;
            case 75 -> 129;
            case 76 -> 155;
            case 77 -> 150;
            case 78 -> 223;
            case 79 -> 30;
            case 80 -> 15;
            case 81 -> 195;
            case 82 -> 110;
            case 83 -> 160;
            case 84 -> 22;
            case 85 -> 222;
            case 86 -> 31;
            case 87 -> 192;
            case 88 -> 49;
            case 89 -> 135;
            case 90 -> 165;
            case 91 -> 124;
            case 92 -> 83;
            case 93 -> 12;
            case 94 -> 235;
            case 95 -> 211;
            case 96 -> 73;
            case 97 -> 143;
            case 98 -> 133;
            case 99 -> 119;
            case 100 -> 58;
            case 101 -> 187;
            case 102 -> 84;
            case 103 -> 252;
            case 104 -> 167;
            case 105 -> 202;
            case 106 -> 182;
            case 107 -> 19;
            case 108 -> 130;
            case 109 -> 178;
            case 110 -> 157;
            case 111 -> 246;
            case 112 -> 97;
            case 113 -> 123;
            case 114 -> 112;
            case 115 -> 209;
            case 116 -> 71;
            case 117 -> 66;
            case 118 -> 248;
            case 119 -> 237;
            case 120 -> 107;
            case 121 -> 122;
            case 122 -> 35;
            case 123 -> 68;
            case 124 -> 40;
            case 125 -> 215;
            case 126 -> 25;
            case 127 -> 156;
            case 128 -> 28;
            case 129 -> 42;
            case 130 -> 229;
            case 131 -> 91;
            case 132 -> 163;
            case 133 -> 217;
            case 134 -> 7;
            case 135 -> 196;
            case 136 -> 147;
            case 137 -> 140;
            case 138 -> 132;
            case 139 -> 5;
            case 140 -> 113;
            case 141 -> 10;
            case 142 -> 23;
            case 143 -> 250;
            case 144 -> 117;
            case 145 -> 88;
            case 146 -> 36;
            case 147 -> 67;
            case 148 -> 180;
            case 149 -> 171;
            case 150 -> 127;
            case 151 -> 34;
            case 152 -> 220;
            case 153 -> 241;
            case 154 -> 2;
            case 155 -> 41;
            case 156 -> 3;
            case 157 -> 125;
            case 158 -> 244;
            case 159 -> 249;
            case 160 -> 146;
            case 161 -> 158;
            case 162 -> 115;
            case 163 -> 138;
            case 164 -> 191;
            case 165 -> 89;
            case 166 -> 81;
            case 167 -> 144;
            case 168 -> 4;
            case 169 -> 21;
            case 170 -> 168;
            case 171 -> 193;
            case 172 -> 212;
            case 173 -> 139;
            case 174 -> 199;
            case 175 -> 93;
            case 176 -> 0;
            case 177 -> 173;
            case 178 -> 224;
            case 179 -> 141;
            case 180 -> 92;
            case 181 -> 14;
            case 182 -> 100;
            case 183 -> 154;
            case 184 -> 176;
            case 185 -> 204;
            case 186 -> 57;
            case 187 -> 145;
            case 188 -> 238;
            case 189 -> 90;
            case 190 -> 186;
            case 191 -> 104;
            case 192 -> 118;
            case 193 -> 65;
            case 194 -> 20;
            case 195 -> 242;
            case 196 -> 9;
            case 197 -> 79;
            case 198 -> 108;
            case 199 -> 80;
            case 200 -> 109;
            case 201 -> 239;
            case 202 -> 228;
            case 203 -> 114;
            case 204 -> 255;
            case 205 -> 50;
            case 206 -> 179;
            case 207 -> 24;
            case 208 -> 134;
            case 209 -> 205;
            case 210 -> 38;
            case 211 -> 213;
            case 212 -> 121;
            case 213 -> 162;
            case 214 -> 47;
            case 215 -> 197;
            case 216 -> 172;
            case 217 -> 243;
            case 218 -> 183;
            case 219 -> 62;
            case 220 -> 53;
            case 221 -> 194;
            case 222 -> 247;
            case 223 -> 105;
            case 224 -> 82;
            case 225 -> 142;
            case 226 -> 44;
            case 227 -> 245;
            case 228 -> 230;
            case 229 -> 175;
            case 230 -> 166;
            case 231 -> 45;
            case 232 -> 103;
            case 233 -> 11;
            case 234 -> 111;
            case 235 -> 153;
            case 236 -> 170;
            case 237 -> 184;
            case 238 -> 174;
            case 239 -> 37;
            case 240 -> 70;
            case 241 -> 227;
            case 242 -> 200;
            case 243 -> 32;
            case 244 -> 43;
            case 245 -> 1;
            case 246 -> 190;
            case 247 -> 75;
            case 248 -> 60;
            case 249 -> 74;
            case 250 -> 218;
            case 251 -> 59;
            case 252 -> 102;
            case 253 -> 106;
            case 254 -> 52;
            default -> 198;
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
   }
}
