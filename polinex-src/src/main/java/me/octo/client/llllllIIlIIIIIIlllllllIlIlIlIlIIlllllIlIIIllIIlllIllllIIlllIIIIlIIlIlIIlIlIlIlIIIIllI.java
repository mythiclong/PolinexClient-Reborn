package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private Vec3 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private BlockPos lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI() {
      short var10001 = -2110;
      short var10002 = 13040;
      var10002 = -2111;
      short var10003 = 24790;
      short var10004 = -2109;
      short var10005 = -14919;
      super(
         "Jump Pred Test",
         "This better not be in main",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "Dev"
      );
   }

   @Nullable
   public final Vec3 ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(@Nullable Vec3 var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @Nullable
   public final BlockPos ah() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void a(@Nullable BlockPos var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      String var10000 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.r();
      short var10002 = -2112;
      short var10003 = 32081;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 == null) {
         LocalPlayer var6 = this.ap().player;
         if (var6 != null) {
            label22: {
               LocalPlayer var3 = var6;
               if (var2 == null) {
                  if (!var3.onGround()) {
                     break label22;
                  }

                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, false, 1, null);
               }

               me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var10001 = me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               Vec3 var7 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               Intrinsics.checkNotNull(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10001.f(var7);
            }

            if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
               Vec3 var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               boolean var5 = false;
               IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                  new AABB(var4.x - 0.1, var4.y - 0.1, var4.z - 0.1, var4.x + 0.1, var4.y + 0.1, var4.z + 0.1),
                  null,
                  new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
                        .o()
                  ),
                  1.5F,
                  null,
                  null,
                  0.0F,
                  false,
                  0.0F);
            }

            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0098\u009b\"¦öBna;\u009a¥@¡S\u0003â\u008d¹";
      int var4 = "\u0098\u009b\"¦öBna;\u009a¥@¡S\u0003â\u008d¹".length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 13;
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
                     case 0 -> 116;
                     case 1 -> 14;
                     case 2 -> 125;
                     case 3 -> 19;
                     case 4 -> 81;
                     case 5 -> 118;
                     default -> 96;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "VÓD¯\u001a\u001a®\u0012@WCP²;8Ú\u008c\u009d\u0006c|\u001d5á\u0087Y!$9ã\u008dp";
                  var4 = "VÓD¯\u001a\u001a®\u0012@WCP²;8Ú\u008c\u009d\u0006c|\u001d5á\u0087Y!$9ã\u008dp".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 55;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2110) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 210;
            case 1 -> 255;
            case 2 -> 164;
            case 3 -> 251;
            case 4 -> 2;
            case 5 -> 248;
            case 6 -> 37;
            case 7 -> 199;
            case 8 -> 132;
            case 9 -> 62;
            case 10 -> 214;
            case 11 -> 147;
            case 12 -> 200;
            case 13 -> 250;
            case 14 -> 66;
            case 15 -> 122;
            case 16 -> 167;
            case 17 -> 23;
            case 18 -> 169;
            case 19 -> 205;
            case 20 -> 239;
            case 21 -> 225;
            case 22 -> 221;
            case 23 -> 83;
            case 24 -> 220;
            case 25 -> 216;
            case 26 -> 131;
            case 27 -> 162;
            case 28 -> 109;
            case 29 -> 189;
            case 30 -> 79;
            case 31 -> 245;
            case 32 -> 85;
            case 33 -> 174;
            case 34 -> 253;
            case 35 -> 172;
            case 36 -> 14;
            case 37 -> 89;
            case 38 -> 1;
            case 39 -> 68;
            case 40 -> 143;
            case 41 -> 151;
            case 42 -> 201;
            case 43 -> 102;
            case 44 -> 152;
            case 45 -> 254;
            case 46 -> 222;
            case 47 -> 75;
            case 48 -> 31;
            case 49 -> 213;
            case 50 -> 209;
            case 51 -> 170;
            case 52 -> 246;
            case 53 -> 163;
            case 54 -> 77;
            case 55 -> 56;
            case 56 -> 34;
            case 57 -> 244;
            case 58 -> 40;
            case 59 -> 181;
            case 60 -> 33;
            case 61 -> 173;
            case 62 -> 235;
            case 63 -> 196;
            case 64 -> 48;
            case 65 -> 149;
            case 66 -> 59;
            case 67 -> 150;
            case 68 -> 155;
            case 69 -> 243;
            case 70 -> 106;
            case 71 -> 63;
            case 72 -> 95;
            case 73 -> 92;
            case 74 -> 208;
            case 75 -> 177;
            case 76 -> 192;
            case 77 -> 240;
            case 78 -> 249;
            case 79 -> 60;
            case 80 -> 39;
            case 81 -> 10;
            case 82 -> 232;
            case 83 -> 20;
            case 84 -> 137;
            case 85 -> 226;
            case 86 -> 81;
            case 87 -> 111;
            case 88 -> 54;
            case 89 -> 144;
            case 90 -> 45;
            case 91 -> 165;
            case 92 -> 118;
            case 93 -> 11;
            case 94 -> 229;
            case 95 -> 84;
            case 96 -> 215;
            case 97 -> 198;
            case 98 -> 6;
            case 99 -> 76;
            case 100 -> 96;
            case 101 -> 52;
            case 102 -> 44;
            case 103 -> 51;
            case 104 -> 49;
            case 105 -> 194;
            case 106 -> 86;
            case 107 -> 38;
            case 108 -> 148;
            case 109 -> 73;
            case 110 -> 21;
            case 111 -> 13;
            case 112 -> 61;
            case 113 -> 129;
            case 114 -> 179;
            case 115 -> 183;
            case 116 -> 217;
            case 117 -> 202;
            case 118 -> 247;
            case 119 -> 234;
            case 120 -> 212;
            case 121 -> 191;
            case 122 -> 141;
            case 123 -> 114;
            case 124 -> 193;
            case 125 -> 224;
            case 126 -> 136;
            case 127 -> 78;
            case 128 -> 64;
            case 129 -> 107;
            case 130 -> 53;
            case 131 -> 153;
            case 132 -> 236;
            case 133 -> 18;
            case 134 -> 223;
            case 135 -> 90;
            case 136 -> 188;
            case 137 -> 175;
            case 138 -> 187;
            case 139 -> 157;
            case 140 -> 184;
            case 141 -> 104;
            case 142 -> 9;
            case 143 -> 161;
            case 144 -> 237;
            case 145 -> 242;
            case 146 -> 207;
            case 147 -> 135;
            case 148 -> 26;
            case 149 -> 55;
            case 150 -> 101;
            case 151 -> 98;
            case 152 -> 15;
            case 153 -> 203;
            case 154 -> 182;
            case 155 -> 218;
            case 156 -> 138;
            case 157 -> 57;
            case 158 -> 74;
            case 159 -> 125;
            case 160 -> 142;
            case 161 -> 7;
            case 162 -> 103;
            case 163 -> 30;
            case 164 -> 19;
            case 165 -> 0;
            case 166 -> 22;
            case 167 -> 241;
            case 168 -> 27;
            case 169 -> 176;
            case 170 -> 145;
            case 171 -> 87;
            case 172 -> 230;
            case 173 -> 195;
            case 174 -> 211;
            case 175 -> 121;
            case 176 -> 3;
            case 177 -> 80;
            case 178 -> 190;
            case 179 -> 123;
            case 180 -> 28;
            case 181 -> 88;
            case 182 -> 25;
            case 183 -> 158;
            case 184 -> 4;
            case 185 -> 72;
            case 186 -> 70;
            case 187 -> 204;
            case 188 -> 112;
            case 189 -> 17;
            case 190 -> 130;
            case 191 -> 126;
            case 192 -> 139;
            case 193 -> 43;
            case 194 -> 238;
            case 195 -> 32;
            case 196 -> 50;
            case 197 -> 252;
            case 198 -> 206;
            case 199 -> 171;
            case 200 -> 8;
            case 201 -> 180;
            case 202 -> 124;
            case 203 -> 128;
            case 204 -> 47;
            case 205 -> 41;
            case 206 -> 178;
            case 207 -> 35;
            case 208 -> 133;
            case 209 -> 110;
            case 210 -> 197;
            case 211 -> 219;
            case 212 -> 67;
            case 213 -> 36;
            case 214 -> 119;
            case 215 -> 12;
            case 216 -> 154;
            case 217 -> 160;
            case 218 -> 134;
            case 219 -> 100;
            case 220 -> 156;
            case 221 -> 16;
            case 222 -> 159;
            case 223 -> 65;
            case 224 -> 120;
            case 225 -> 69;
            case 226 -> 99;
            case 227 -> 117;
            case 228 -> 82;
            case 229 -> 227;
            case 230 -> 93;
            case 231 -> 146;
            case 232 -> 5;
            case 233 -> 231;
            case 234 -> 91;
            case 235 -> 94;
            case 236 -> 186;
            case 237 -> 29;
            case 238 -> 116;
            case 239 -> 233;
            case 240 -> 97;
            case 241 -> 113;
            case 242 -> 127;
            case 243 -> 166;
            case 244 -> 24;
            case 245 -> 71;
            case 246 -> 168;
            case 247 -> 185;
            case 248 -> 46;
            case 249 -> 140;
            case 250 -> 228;
            case 251 -> 108;
            case 252 -> 115;
            case 253 -> 105;
            case 254 -> 58;
            default -> 42;
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

      @NotNull
      public final llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI a() {
         return llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
   public static llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI ai() { return null; }
}
