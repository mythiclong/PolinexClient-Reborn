package me.octo.client;

import com.mojang.blaze3d.pipeline.RenderTarget;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class lIllIllllIIlIlIlllIllllllIIIIllIlIlIIIlIIlIIlIlIlIlIlIllIIIlllIIIIIllIlIIllIllllllllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIllIllllIIlIlIlllIllllllIIIIllIlIlIIIlIIlIIlIlIlIlIlIllIIIlllIIIIIllIlIIllIllllllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIllIllllIIlIlIlllIllllllIIIIllIlIlIIIlIIlIIlIlIlIlIlIllIIIlllIIIIIllIlIIllIllllllllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private lIllIllllIIlIlIlllIllllllIIIIllIlIlIIIlIIlIIlIlIlIlIlIllIIIlllIIIIIllIlIIllIllllllllI() {
      short var10001 = 13425;
      short var10002 = -3305;
      var10002 = 13426;
      short var10003 = -3930;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = 13427;
      short var10005 = 10873;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIllllIlIIlIlIlIIlIlllIIllIllllIIIIIlIlIlllIllIlllIIlIlIIlIllllllIlIlIIlIIIllllllIllI.a()
      };
      super("Bloom", "Soft glow halo around ClickGUI text and borders.", var3, "Post", true, var1);
   }

   @SubscribeEvent(
      priority = EventPriority.LOWEST
   )
   public final void a(@NotNull me.octo.client.events.impl.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl var1) {
      int var14 = 0; // PX-FIX
      String var2;
      Minecraft var11;
      label63: {
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         short var10002 = 13424;
         short var10003 = 6691;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         boolean var10 = this.ae();
         if (var2 == null) {
            if (!var10) {
               return;
            }

            var11 = this.ap();
            if (var2 != null) {
               break label63;
            }

            var10 = var11.screen instanceof lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll;
         }

         if (!var10) {
            return;
         }

         var11 = this.ap();
      }

      RenderTarget var12 = var11.getMainRenderTarget();
      if (var12 != null) {
         RenderTarget var3 = var12;
         int var13 = var3.width;
         if (var2 == null) {
            if (var3.width <= 0) {
               return;
            }

            var13 = var3.height;
         }

         if (var13 > 0) {
            List var5;
            int var6;
            label45: {
               var5 = IIllllIlIIlIlIlIIlIlllIIllIllllIIIIIlIlIlllIllIlllIIlIlIIlIllllllIlIlIIlIIIllllllIllI.b();
               var6 = IIllllIlIIlIlIlIIlIlllIIllIllllIIIIIlIlIlllIllIlllIIlIlIIlIllllllIlIlIIlIIIllllllIllI.a().z();
               var14 = 0;
               int var10001 = var6;
               if (var2 == null) {
                  if (0 > var6) {
                     var14 = 0;
                     break label45;
                  }

                  var14 = var6;
                  if (var2 != null) {
                     break label45;
                  }

                  var10001 = var5.size();
               }

               var14 = var14 < var10001 ? 1 : 0;
            }

            Object var15;
            if (var14 != 0) {
               var15 = var5.get(var6);
            } else {
               boolean var8 = false;
               var15 = ((java.util.List)(Object)IIllllIlIIlIlIlIIlIlllIIllIllllIIIIIlIlIlllIllIlllIIlIlIIlIllllllIlIlIIlIIIllllllIllI.b()).get(1);
            }

            llIlIlIlIlIIlllIllIIIlllIlIIIIllIIIIIlIIlIlIlIIllIIIlIlllIllIlIIlllIlIIlIIIllIIlIIIll var4 = (llIlIlIlIlIIlllIllIIIlllIlIIIIllIIIIIlIIlIlIlIIllIIIlIlllIllIlIIlllIlIIlIIIllIIlIIIll)var15;
            float var9 = RangesKt.coerceAtLeast(var4.d() * 0.5F, 0.5F);
            me.octo.client.utils.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var4.a(), var4.b(), var9, var4.d(), var4.c(), var4.e());
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "Ñ`\u0084k\u0093\u0005\u000eY¶\u0014\u0087";
      int var4 = "Ñ`\u0084k\u0093\u0005\u000eY¶\u0014\u0087".length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 65;
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
                     case 0 -> 113;
                     case 1 -> 44;
                     case 2 -> 85;
                     case 3 -> 93;
                     case 4 -> 125;
                     case 5 -> 34;
                     default -> 120;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIllIllllIIlIlIlllIllllllIIIIllIlIlIIIlIIlIIlIlIlIlIlIllIIIlllIIIIIllIlIIllIllllllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIllIllllIIlIlIlllIllllllIIIIllIlIlIIIlIIlIIlIlIlIlIlIllIIIlllIIIIIllIlIIllIllllllllI();
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

                  var2 = "Â\u0019/^ë\u008c±\u0013Ðè`Üß=\\4õ/sÓU\u009fq\u0093çt\tB\u0014ÞuDkÐT+a\u0007\u008eç\u00813\nð0\u000f8)\u0004=î¦ ";
                  var4 = "Â\u0019/^ë\u008c±\u0013Ðè`Üß=\\4õ/sÓU\u009fq\u0093çt\tB\u0014ÞuDkÐT+a\u0007\u008eç\u00813\nð0\u000f8)\u0004=î¦ ".length();
                  var1 = '0';
                  var8 = -1;
            }

            var10000 = 88;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 13424) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 152;
            case 1 -> 64;
            case 2 -> 138;
            case 3 -> 2;
            case 4 -> 190;
            case 5 -> 199;
            case 6 -> 83;
            case 7 -> 153;
            case 8 -> 89;
            case 9 -> 228;
            case 10 -> 232;
            case 11 -> 164;
            case 12 -> 163;
            case 13 -> 192;
            case 14 -> 59;
            case 15 -> 23;
            case 16 -> 122;
            case 17 -> 215;
            case 18 -> 96;
            case 19 -> 7;
            case 20 -> 53;
            case 21 -> 202;
            case 22 -> 217;
            case 23 -> 162;
            case 24 -> 157;
            case 25 -> 11;
            case 26 -> 166;
            case 27 -> 150;
            case 28 -> 65;
            case 29 -> 107;
            case 30 -> 142;
            case 31 -> 133;
            case 32 -> 213;
            case 33 -> 222;
            case 34 -> 248;
            case 35 -> 160;
            case 36 -> 197;
            case 37 -> 6;
            case 38 -> 20;
            case 39 -> 55;
            case 40 -> 50;
            case 41 -> 165;
            case 42 -> 211;
            case 43 -> 149;
            case 44 -> 32;
            case 45 -> 137;
            case 46 -> 128;
            case 47 -> 38;
            case 48 -> 181;
            case 49 -> 71;
            case 50 -> 85;
            case 51 -> 4;
            case 52 -> 10;
            case 53 -> 41;
            case 54 -> 82;
            case 55 -> 77;
            case 56 -> 111;
            case 57 -> 12;
            case 58 -> 229;
            case 59 -> 104;
            case 60 -> 135;
            case 61 -> 47;
            case 62 -> 155;
            case 63 -> 203;
            case 64 -> 182;
            case 65 -> 24;
            case 66 -> 246;
            case 67 -> 249;
            case 68 -> 173;
            case 69 -> 31;
            case 70 -> 132;
            case 71 -> 158;
            case 72 -> 250;
            case 73 -> 254;
            case 74 -> 129;
            case 75 -> 62;
            case 76 -> 127;
            case 77 -> 185;
            case 78 -> 79;
            case 79 -> 103;
            case 80 -> 49;
            case 81 -> 33;
            case 82 -> 86;
            case 83 -> 100;
            case 84 -> 80;
            case 85 -> 242;
            case 86 -> 27;
            case 87 -> 54;
            case 88 -> 208;
            case 89 -> 244;
            case 90 -> 57;
            case 91 -> 36;
            case 92 -> 124;
            case 93 -> 201;
            case 94 -> 189;
            case 95 -> 19;
            case 96 -> 37;
            case 97 -> 209;
            case 98 -> 91;
            case 99 -> 84;
            case 100 -> 68;
            case 101 -> 13;
            case 102 -> 114;
            case 103 -> 119;
            case 104 -> 167;
            case 105 -> 28;
            case 106 -> 170;
            case 107 -> 39;
            case 108 -> 251;
            case 109 -> 214;
            case 110 -> 252;
            case 111 -> 73;
            case 112 -> 61;
            case 113 -> 207;
            case 114 -> 94;
            case 115 -> 97;
            case 116 -> 93;
            case 117 -> 191;
            case 118 -> 99;
            case 119 -> 156;
            case 120 -> 76;
            case 121 -> 198;
            case 122 -> 241;
            case 123 -> 219;
            case 124 -> 233;
            case 125 -> 140;
            case 126 -> 43;
            case 127 -> 74;
            case 128 -> 186;
            case 129 -> 226;
            case 130 -> 69;
            case 131 -> 175;
            case 132 -> 116;
            case 133 -> 177;
            case 134 -> 146;
            case 135 -> 52;
            case 136 -> 113;
            case 137 -> 0;
            case 138 -> 29;
            case 139 -> 195;
            case 140 -> 60;
            case 141 -> 212;
            case 142 -> 14;
            case 143 -> 121;
            case 144 -> 247;
            case 145 -> 78;
            case 146 -> 21;
            case 147 -> 243;
            case 148 -> 223;
            case 149 -> 72;
            case 150 -> 221;
            case 151 -> 87;
            case 152 -> 194;
            case 153 -> 180;
            case 154 -> 253;
            case 155 -> 46;
            case 156 -> 118;
            case 157 -> 178;
            case 158 -> 245;
            case 159 -> 136;
            case 160 -> 1;
            case 161 -> 240;
            case 162 -> 101;
            case 163 -> 147;
            case 164 -> 154;
            case 165 -> 109;
            case 166 -> 98;
            case 167 -> 56;
            case 168 -> 44;
            case 169 -> 161;
            case 170 -> 227;
            case 171 -> 106;
            case 172 -> 188;
            case 173 -> 48;
            case 174 -> 15;
            case 175 -> 42;
            case 176 -> 148;
            case 177 -> 130;
            case 178 -> 112;
            case 179 -> 90;
            case 180 -> 75;
            case 181 -> 25;
            case 182 -> 117;
            case 183 -> 210;
            case 184 -> 3;
            case 185 -> 35;
            case 186 -> 45;
            case 187 -> 218;
            case 188 -> 18;
            case 189 -> 235;
            case 190 -> 22;
            case 191 -> 206;
            case 192 -> 187;
            case 193 -> 51;
            case 194 -> 204;
            case 195 -> 108;
            case 196 -> 63;
            case 197 -> 237;
            case 198 -> 179;
            case 199 -> 9;
            case 200 -> 40;
            case 201 -> 66;
            case 202 -> 102;
            case 203 -> 169;
            case 204 -> 234;
            case 205 -> 196;
            case 206 -> 115;
            case 207 -> 176;
            case 208 -> 131;
            case 209 -> 139;
            case 210 -> 205;
            case 211 -> 5;
            case 212 -> 141;
            case 213 -> 168;
            case 214 -> 58;
            case 215 -> 200;
            case 216 -> 110;
            case 217 -> 134;
            case 218 -> 151;
            case 219 -> 17;
            case 220 -> 143;
            case 221 -> 125;
            case 222 -> 230;
            case 223 -> 81;
            case 224 -> 145;
            case 225 -> 159;
            case 226 -> 184;
            case 227 -> 220;
            case 228 -> 172;
            case 229 -> 67;
            case 230 -> 16;
            case 231 -> 92;
            case 232 -> 34;
            case 233 -> 193;
            case 234 -> 120;
            case 235 -> 238;
            case 236 -> 123;
            case 237 -> 126;
            case 238 -> 70;
            case 239 -> 225;
            case 240 -> 8;
            case 241 -> 171;
            case 242 -> 236;
            case 243 -> 255;
            case 244 -> 30;
            case 245 -> 231;
            case 246 -> 216;
            case 247 -> 88;
            case 248 -> 105;
            case 249 -> 183;
            case 250 -> 26;
            case 251 -> 144;
            case 252 -> 239;
            case 253 -> 224;
            case 254 -> 95;
            default -> 174;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
