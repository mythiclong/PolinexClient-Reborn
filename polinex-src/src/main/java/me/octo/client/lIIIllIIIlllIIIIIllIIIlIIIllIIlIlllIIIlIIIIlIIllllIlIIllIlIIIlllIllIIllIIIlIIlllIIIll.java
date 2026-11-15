package me.octo.client;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class lIIIllIIIlllIIIIIllIIIlIIIllIIlIlllIIIlIIIIlIIllllIlIIllIlIIIlllIllIIllIIIlIIlllIIIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIIllIIIlllIIIIIllIIIlIIIllIIlIlllIIIlIIIIlIIllllIlIIllIlIIIlllIllIIllIIIlIIlllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static lIIIllIIIlllIIIIIllIIIlIIIllIIlIlllIIIlIIIIlIIllllIlIIllIlIIIlllIllIIllIIIlIIlllIIIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private lIIIllIIIlllIIIIIllIIIlIIIllIIlIlllIIIlIIIIlIIllllIlIIllIlIIIlllIllIIllIIIlIIlllIIIll() {
      short var10001 = -25565;
      short var10002 = -28820;
      var10002 = -25567;
      short var10003 = -20500;
      short var10004 = -25562;
      short var10005 = 16223;
      super(
         "No Hyperion Explosion",
         "Hides explosion particles only when using a Wither Impact item.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         "Render"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      boolean var14 = false; // PX-FIX
      Object var13 = null; // PX-FIX
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -25568;
      short var10003 = -10776;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof ServerboundUseItemPacket) {
         LocalPlayer var11 = this.ap().player;
         if (var11 != null) {
            ItemStack var12 = var11.getMainHandItem();
            if (var12 != null) {
               label55: {
                  ItemStack var3 = var12;
                  var var5 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .e(var3);
                  boolean var6 = false;
                  var13 = var5;
                  label46:
                  if (var2 == null) {
                     if (var5 instanceof Collection) {
                        var13 = (Collection)var5;
                        if (var2 != null) {
                           break label46;
                        }

                        if (((me.octo.client.PXDyn)var13).isEmpty()) {
                           var14 = false;
                           break label55;
                        }
                     }

                     var13 = var5;
                  }

                  Iterator var7 = ((me.octo.client.PXDyn)var13).iterator();

                  label37:
                  while (true) {
                     if (!var7.hasNext()) {
                        var14 = false;
                        break;
                     }

                     Object var8 = var7.next();
                     String var9 = (String)var8;
                     boolean var10 = false;
                     CharSequence var15 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var9);
                     short var10001 = -25561;
                     var10002 = -10555;
                     var14 = StringsKt.contains(var15, "Wither Impact", true);

                     while (var14) {
                        var14 = true;
                        if (var2 == null) {
                           break label37;
                        }
                     }
                  }
               }

               boolean var4 = var14;
               if (var4) {
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis() + 900L;
               }

               return;
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI var1) {
      short var10001 = -25566;
      short var10002 = -3600;
      Intrinsics.checkNotNullParameter(var1, "event");
      long var2 = System.currentTimeMillis();
      if (var2 <= this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
         ParticleType var10000 = var1.k().getParticle().getType();
         if (var10000 != null) {
            ParticleType var4 = var10000;
            if (Intrinsics.areEqual(var4, ParticleTypes.EXPLOSION)) {
               var1.a(true);
            }
         }
      }
   }

   @Override
   public void aB() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0L;
      this.as();
   }

   @Override
   public void aC() {
      this.at();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u0001X\u0000\u0092r«Ru\\zòÂp+\u009fÈeØh¡\b\u0005\u0082\u008f{tý?ê\u0099ÿAK\t>qÈ²[ëH /\u0010±\u0014\u0015sØû\u0085\u0092q\u0094\u0094÷p\u0092H j0iãM¬HÉâ\u0095º\u0000Ê\u001e¿'Gÿ·\rì\u009eôá«¥a·\"©\u008c\u0005/\u0010Î\u0087K";
      int var4 = "\u0001X\u0000\u0092r«Ru\\zòÂp+\u009fÈeØh¡\b\u0005\u0082\u008f{tý?ê\u0099ÿAK\t>qÈ²[ëH /\u0010±\u0014\u0015sØû\u0085\u0092q\u0094\u0094÷p\u0092H j0iãM¬HÉâ\u0095º\u0000Ê\u001e¿'Gÿ·\rì\u009eôá«¥a·\"©\u008c\u0005/\u0010Î\u0087K"
         .length();
      char var1 = 21;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 84;
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
                     case 0 -> 49;
                     case 1 -> 46;
                     case 2 -> 127;
                     case 3 -> 72;
                     case 4 -> 30;
                     case 5 -> 31;
                     default -> 50;
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
                     g = new String[6];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIIllIIIlllIIIIIllIIIlIIIllIIlIlllIIIlIIIIlIIllllIlIIllIlIIIlllIllIIllIIIlIIlllIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIIllIIIlllIIIIIllIIIlIIIllIIlIlllIIIlIIIIlIIllllIlIIllIlIIIlllIllIIllIIIlIIlllIIIll();
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

                  var2 = "wGGp¿6ÖXÂ{Mº¿\u0006 è\u0012\u0004L5";
                  var4 = "wGGp¿6ÖXÂ{Mº¿\u0006 è\u0012\u0004L5".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 83;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25565) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 106;
            case 1 -> 184;
            case 2 -> 144;
            case 3 -> 51;
            case 4 -> 59;
            case 5 -> 159;
            case 6 -> 199;
            case 7 -> 140;
            case 8 -> 70;
            case 9 -> 49;
            case 10 -> 181;
            case 11 -> 48;
            case 12 -> 228;
            case 13 -> 150;
            case 14 -> 243;
            case 15 -> 119;
            case 16 -> 238;
            case 17 -> 166;
            case 18 -> 235;
            case 19 -> 198;
            case 20 -> 227;
            case 21 -> 131;
            case 22 -> 160;
            case 23 -> 143;
            case 24 -> 28;
            case 25 -> 170;
            case 26 -> 132;
            case 27 -> 188;
            case 28 -> 154;
            case 29 -> 57;
            case 30 -> 152;
            case 31 -> 68;
            case 32 -> 137;
            case 33 -> 22;
            case 34 -> 232;
            case 35 -> 84;
            case 36 -> 163;
            case 37 -> 13;
            case 38 -> 117;
            case 39 -> 242;
            case 40 -> 102;
            case 41 -> 136;
            case 42 -> 55;
            case 43 -> 174;
            case 44 -> 46;
            case 45 -> 108;
            case 46 -> 253;
            case 47 -> 99;
            case 48 -> 12;
            case 49 -> 39;
            case 50 -> 76;
            case 51 -> 122;
            case 52 -> 207;
            case 53 -> 5;
            case 54 -> 200;
            case 55 -> 221;
            case 56 -> 223;
            case 57 -> 250;
            case 58 -> 214;
            case 59 -> 236;
            case 60 -> 18;
            case 61 -> 183;
            case 62 -> 60;
            case 63 -> 74;
            case 64 -> 189;
            case 65 -> 34;
            case 66 -> 79;
            case 67 -> 31;
            case 68 -> 138;
            case 69 -> 11;
            case 70 -> 208;
            case 71 -> 210;
            case 72 -> 44;
            case 73 -> 36;
            case 74 -> 185;
            case 75 -> 215;
            case 76 -> 47;
            case 77 -> 19;
            case 78 -> 3;
            case 79 -> 155;
            case 80 -> 231;
            case 81 -> 52;
            case 82 -> 212;
            case 83 -> 230;
            case 84 -> 30;
            case 85 -> 244;
            case 86 -> 246;
            case 87 -> 85;
            case 88 -> 196;
            case 89 -> 73;
            case 90 -> 168;
            case 91 -> 33;
            case 92 -> 107;
            case 93 -> 197;
            case 94 -> 64;
            case 95 -> 2;
            case 96 -> 151;
            case 97 -> 100;
            case 98 -> 147;
            case 99 -> 158;
            case 100 -> 66;
            case 101 -> 86;
            case 102 -> 237;
            case 103 -> 209;
            case 104 -> 50;
            case 105 -> 190;
            case 106 -> 176;
            case 107 -> 251;
            case 108 -> 128;
            case 109 -> 225;
            case 110 -> 32;
            case 111 -> 192;
            case 112 -> 35;
            case 113 -> 218;
            case 114 -> 216;
            case 115 -> 141;
            case 116 -> 177;
            case 117 -> 254;
            case 118 -> 16;
            case 119 -> 112;
            case 120 -> 75;
            case 121 -> 41;
            case 122 -> 40;
            case 123 -> 43;
            case 124 -> 229;
            case 125 -> 89;
            case 126 -> 77;
            case 127 -> 6;
            case 128 -> 234;
            case 129 -> 148;
            case 130 -> 255;
            case 131 -> 203;
            case 132 -> 115;
            case 133 -> 14;
            case 134 -> 129;
            case 135 -> 133;
            case 136 -> 58;
            case 137 -> 247;
            case 138 -> 204;
            case 139 -> 45;
            case 140 -> 162;
            case 141 -> 211;
            case 142 -> 87;
            case 143 -> 37;
            case 144 -> 95;
            case 145 -> 161;
            case 146 -> 146;
            case 147 -> 53;
            case 148 -> 9;
            case 149 -> 120;
            case 150 -> 205;
            case 151 -> 135;
            case 152 -> 97;
            case 153 -> 123;
            case 154 -> 134;
            case 155 -> 101;
            case 156 -> 111;
            case 157 -> 63;
            case 158 -> 27;
            case 159 -> 219;
            case 160 -> 153;
            case 161 -> 104;
            case 162 -> 169;
            case 163 -> 65;
            case 164 -> 56;
            case 165 -> 23;
            case 166 -> 252;
            case 167 -> 157;
            case 168 -> 25;
            case 169 -> 54;
            case 170 -> 213;
            case 171 -> 226;
            case 172 -> 93;
            case 173 -> 67;
            case 174 -> 96;
            case 175 -> 7;
            case 176 -> 193;
            case 177 -> 24;
            case 178 -> 81;
            case 179 -> 167;
            case 180 -> 220;
            case 181 -> 8;
            case 182 -> 182;
            case 183 -> 92;
            case 184 -> 172;
            case 185 -> 179;
            case 186 -> 118;
            case 187 -> 145;
            case 188 -> 116;
            case 189 -> 191;
            case 190 -> 206;
            case 191 -> 173;
            case 192 -> 139;
            case 193 -> 224;
            case 194 -> 194;
            case 195 -> 72;
            case 196 -> 149;
            case 197 -> 71;
            case 198 -> 61;
            case 199 -> 142;
            case 200 -> 127;
            case 201 -> 249;
            case 202 -> 15;
            case 203 -> 121;
            case 204 -> 88;
            case 205 -> 26;
            case 206 -> 171;
            case 207 -> 21;
            case 208 -> 124;
            case 209 -> 38;
            case 210 -> 4;
            case 211 -> 78;
            case 212 -> 202;
            case 213 -> 239;
            case 214 -> 201;
            case 215 -> 29;
            case 216 -> 17;
            case 217 -> 98;
            case 218 -> 245;
            case 219 -> 240;
            case 220 -> 164;
            case 221 -> 217;
            case 222 -> 1;
            case 223 -> 130;
            case 224 -> 42;
            case 225 -> 0;
            case 226 -> 114;
            case 227 -> 241;
            case 228 -> 156;
            case 229 -> 113;
            case 230 -> 10;
            case 231 -> 110;
            case 232 -> 195;
            case 233 -> 105;
            case 234 -> 175;
            case 235 -> 82;
            case 236 -> 178;
            case 237 -> 62;
            case 238 -> 80;
            case 239 -> 83;
            case 240 -> 90;
            case 241 -> 126;
            case 242 -> 69;
            case 243 -> 233;
            case 244 -> 20;
            case 245 -> 186;
            case 246 -> 91;
            case 247 -> 222;
            case 248 -> 94;
            case 249 -> 165;
            case 250 -> 125;
            case 251 -> 103;
            case 252 -> 187;
            case 253 -> 180;
            case 254 -> 109;
            default -> 248;
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
