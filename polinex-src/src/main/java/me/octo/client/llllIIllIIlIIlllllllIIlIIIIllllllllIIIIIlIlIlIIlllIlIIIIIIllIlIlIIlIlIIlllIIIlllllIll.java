package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class llllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll
   extends llIllIIlllIIIlIIIIlIIIIIllIllIIIlIIIlllIlIllIlIIIllIllllIIlIllIIllIIllIIIlIIIIlIlllll {
   @NotNull
   private final Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] c;
   private static String[] d;

   public llllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll() {
      MutableComponent var10001 = Component.empty();
      short var10003 = -28285;
      short var10004 = 4946;
      Intrinsics.checkNotNullExpressionValue(var10001, "empty(...)");
      super(var10001);
      Minecraft var1 = Minecraft.getInstance();
      var10003 = -28288;
      var10004 = -827;
      Intrinsics.checkNotNullExpressionValue(var1, "getInstance(...)");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   protected final Minecraft a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public boolean isPauseScreen() {
      return false;
   }

   public void onClose() {
      me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      super.onClose();

      if (me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.execute(new Runnable() {
            @Override
            public void run() {
               c();
            }
         });
      }
   }

   public void extractRenderState(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      short var10001 = -28287;
      short var10002 = -22238;
      Intrinsics.checkNotNullParameter(var1, "context");
      super.extractRenderState(var1, var2, var3, var4);
   }

   public boolean a(double var1, double var3, int var5) {
      return super.a(var1, var3, var5);
   }

   public boolean b(double var1, double var3, int var5) {
      return super.b(var1, var3, var5);
   }

   public boolean a(int param1, int param2, int param3) {
      int[] var4 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var4 != null) {
         return param1 != 0;
      }
      if (param1 == 256) {
         this.onClose();
         return true;
      }
      return super.a(param1, param2, param3);
   }

   public final void a(@Nullable GuiGraphicsExtractor param1, float param2, float param3, float param4, @NotNull Function0<Unit> param5) {
      var var6 = me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param5, "drawCode");
      float var8 = (param4 - 0.6f) / 0.4f;
      float var9 = this.a(var8) * 0.4f + 0.6f;
      float var10 = (1.0f - (float)java.lang.Math.pow((double)var8, 2.0)) * 15.0f;
      float var11 = var8 < 0.4f ? var8 / 0.4f : 1.0f;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param2, param3 + var10);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var9, var9);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(-param2, -param3);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var11);
      param5.invoke();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   public final float a(float param1) {
      float var3 = 1.70158F;
      float var4 = var3 + 1.0F;
      if (!(param1 < 1.0F)) {
         return 1.0F;
      }
      return 1.0F + var4 * (float)java.lang.Math.pow((double)(param1 - 1.0F), 3.0)
         + var3 * (float)java.lang.Math.pow((double)(param1 - 1.0F), 2.0);
   }

   public abstract void a(int var1, int var2);

   private static final void c() {
      lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .a();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u0094 äN!\u0005D_\u0003æ\bö\u0082\u0098å§T£\u0091\u0007\u009a|ý\u0087ÃlÝ\u0010úBo6ÃË·ù,Þ½FNÓðö";
      int var4 = "\u0094 äN!\u0005D_\u0003æ\bö\u0082\u0098å§T£\u0091\u0007\u009a|ý\u0087ÃlÝ\u0010úBo6ÃË·ù,Þ½FNÓðö".length();
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 71;
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
                     case 1 -> 98;
                     case 2 -> 66;
                     case 3 -> 29;
                     case 4 -> 93;
                     case 5 -> 18;
                     default -> 28;
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
                     c = var5;
                     d = new String[6];
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

                  var2 = "ÆC®Ø\u0093\u001cÅÊeG0c\u0082É±«Ózq/n6RV\u0085\u001b\b¡Dl\t-Ö\u009bè\fèi±î\u0089X\u0096¤ál/ýä2h\u001dÔ¥çJ\u0094\u009eèU}\u001d¸Js¹1¹p\bd*\u0099óú\u0089á´É¥Àþ8\u0012¿ÔV\u0018\u0004eä\f\u008c\u0003\b<A1mbµë]";
                  var4 = "ÆC®Ø\u0093\u001cÅÊeG0c\u0082É±«Ózq/n6RV\u0085\u001b\b¡Dl\t-Ö\u009bè\fèi±î\u0089X\u0096¤ál/ýä2h\u001dÔ¥çJ\u0094\u009eèU}\u001d¸Js¹1¹p\bd*\u0099óú\u0089á´É¥Àþ8\u0012¿ÔV\u0018\u0004eä\f\u008c\u0003\b<A1mbµë]"
                     .length();
                  var1 = '^';
                  var8 = -1;
            }

            var10000 = 113;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String f(int var0, int var1) {
      int var2 = (var0 ^ -28285) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 226;
            case 1 -> 29;
            case 2 -> 241;
            case 3 -> 9;
            case 4 -> 132;
            case 5 -> 39;
            case 6 -> 13;
            case 7 -> 53;
            case 8 -> 246;
            case 9 -> 79;
            case 10 -> 154;
            case 11 -> 245;
            case 12 -> 30;
            case 13 -> 146;
            case 14 -> 40;
            case 15 -> 147;
            case 16 -> 114;
            case 17 -> 28;
            case 18 -> 195;
            case 19 -> 131;
            case 20 -> 224;
            case 21 -> 66;
            case 22 -> 168;
            case 23 -> 214;
            case 24 -> 233;
            case 25 -> 36;
            case 26 -> 108;
            case 27 -> 247;
            case 28 -> 160;
            case 29 -> 12;
            case 30 -> 237;
            case 31 -> 183;
            case 32 -> 123;
            case 33 -> 110;
            case 34 -> 213;
            case 35 -> 38;
            case 36 -> 140;
            case 37 -> 99;
            case 38 -> 101;
            case 39 -> 112;
            case 40 -> 139;
            case 41 -> 23;
            case 42 -> 196;
            case 43 -> 187;
            case 44 -> 119;
            case 45 -> 87;
            case 46 -> 174;
            case 47 -> 56;
            case 48 -> 230;
            case 49 -> 1;
            case 50 -> 34;
            case 51 -> 177;
            case 52 -> 130;
            case 53 -> 225;
            case 54 -> 150;
            case 55 -> 176;
            case 56 -> 219;
            case 57 -> 144;
            case 58 -> 165;
            case 59 -> 136;
            case 60 -> 120;
            case 61 -> 116;
            case 62 -> 104;
            case 63 -> 186;
            case 64 -> 5;
            case 65 -> 254;
            case 66 -> 137;
            case 67 -> 162;
            case 68 -> 49;
            case 69 -> 229;
            case 70 -> 128;
            case 71 -> 10;
            case 72 -> 191;
            case 73 -> 166;
            case 74 -> 221;
            case 75 -> 253;
            case 76 -> 81;
            case 77 -> 248;
            case 78 -> 228;
            case 79 -> 63;
            case 80 -> 188;
            case 81 -> 211;
            case 82 -> 61;
            case 83 -> 91;
            case 84 -> 24;
            case 85 -> 47;
            case 86 -> 44;
            case 87 -> 31;
            case 88 -> 72;
            case 89 -> 48;
            case 90 -> 184;
            case 91 -> 170;
            case 92 -> 62;
            case 93 -> 209;
            case 94 -> 7;
            case 95 -> 113;
            case 96 -> 148;
            case 97 -> 175;
            case 98 -> 76;
            case 99 -> 105;
            case 100 -> 125;
            case 101 -> 68;
            case 102 -> 200;
            case 103 -> 222;
            case 104 -> 41;
            case 105 -> 199;
            case 106 -> 135;
            case 107 -> 179;
            case 108 -> 220;
            case 109 -> 85;
            case 110 -> 55;
            case 111 -> 126;
            case 112 -> 158;
            case 113 -> 109;
            case 114 -> 122;
            case 115 -> 33;
            case 116 -> 89;
            case 117 -> 156;
            case 118 -> 243;
            case 119 -> 6;
            case 120 -> 17;
            case 121 -> 238;
            case 122 -> 111;
            case 123 -> 100;
            case 124 -> 57;
            case 125 -> 234;
            case 126 -> 78;
            case 127 -> 32;
            case 128 -> 216;
            case 129 -> 65;
            case 130 -> 42;
            case 131 -> 215;
            case 132 -> 249;
            case 133 -> 142;
            case 134 -> 252;
            case 135 -> 227;
            case 136 -> 93;
            case 137 -> 107;
            case 138 -> 201;
            case 139 -> 96;
            case 140 -> 73;
            case 141 -> 208;
            case 142 -> 82;
            case 143 -> 50;
            case 144 -> 4;
            case 145 -> 26;
            case 146 -> 185;
            case 147 -> 16;
            case 148 -> 75;
            case 149 -> 25;
            case 150 -> 192;
            case 151 -> 207;
            case 152 -> 210;
            case 153 -> 173;
            case 154 -> 164;
            case 155 -> 189;
            case 156 -> 151;
            case 157 -> 152;
            case 158 -> 58;
            case 159 -> 90;
            case 160 -> 161;
            case 161 -> 149;
            case 162 -> 97;
            case 163 -> 217;
            case 164 -> 14;
            case 165 -> 157;
            case 166 -> 121;
            case 167 -> 19;
            case 168 -> 80;
            case 169 -> 45;
            case 170 -> 54;
            case 171 -> 172;
            case 172 -> 250;
            case 173 -> 205;
            case 174 -> 178;
            case 175 -> 206;
            case 176 -> 153;
            case 177 -> 244;
            case 178 -> 84;
            case 179 -> 231;
            case 180 -> 180;
            case 181 -> 69;
            case 182 -> 242;
            case 183 -> 251;
            case 184 -> 102;
            case 185 -> 70;
            case 186 -> 64;
            case 187 -> 77;
            case 188 -> 83;
            case 189 -> 145;
            case 190 -> 43;
            case 191 -> 167;
            case 192 -> 143;
            case 193 -> 155;
            case 194 -> 171;
            case 195 -> 3;
            case 196 -> 194;
            case 197 -> 11;
            case 198 -> 232;
            case 199 -> 94;
            case 200 -> 218;
            case 201 -> 212;
            case 202 -> 138;
            case 203 -> 106;
            case 204 -> 115;
            case 205 -> 88;
            case 206 -> 2;
            case 207 -> 22;
            case 208 -> 37;
            case 209 -> 236;
            case 210 -> 223;
            case 211 -> 27;
            case 212 -> 0;
            case 213 -> 46;
            case 214 -> 182;
            case 215 -> 8;
            case 216 -> 92;
            case 217 -> 98;
            case 218 -> 15;
            case 219 -> 21;
            case 220 -> 204;
            case 221 -> 197;
            case 222 -> 18;
            case 223 -> 190;
            case 224 -> 20;
            case 225 -> 203;
            case 226 -> 240;
            case 227 -> 133;
            case 228 -> 193;
            case 229 -> 129;
            case 230 -> 169;
            case 231 -> 235;
            case 232 -> 239;
            case 233 -> 255;
            case 234 -> 71;
            case 235 -> 181;
            case 236 -> 52;
            case 237 -> 35;
            case 238 -> 60;
            case 239 -> 159;
            case 240 -> 103;
            case 241 -> 59;
            case 242 -> 124;
            case 243 -> 86;
            case 244 -> 198;
            case 245 -> 117;
            case 246 -> 51;
            case 247 -> 118;
            case 248 -> 163;
            case 249 -> 202;
            case 250 -> 134;
            case 251 -> 74;
            case 252 -> 95;
            case 253 -> 141;
            case 254 -> 127;
            default -> 67;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }
   // PX-FIX PhaseA-RESe: Kotlin default-args bridge transcribed from the jar (javap).
   //   descriptor (LllllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll;Lnet/minecraft/client/gui/GuiGraphicsExtractor;FFFLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
   //   Deviation: the jar inlines the instance-method body; this bridge delegates to it.
   public static void a(llllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll var0, GuiGraphicsExtractor var1, float var2, float var3, float var4,
         Function0<Unit> var5, int var6, Object var7) {
      if (var7 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawAnimatedElement");
      } else {
         if ((var6 & 1) != 0) {
            var1 = null;
         }

         var0.a(var1, var2, var3, var4, var5);
      }
   }
}
