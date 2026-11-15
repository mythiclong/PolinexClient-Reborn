package me.octo.client.utils.player;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld2
   @NotNull
   public static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private static Vec3 lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] c;
   private static String[] d;

   private lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII() {
   }

   @JvmStatic
   public static final void a(@NotNull Vec3 var0) {
      short var10001 = 18634;
      short var10002 = 22579;
      Intrinsics.checkNotNullParameter(var0, "target");
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
   }

   @JvmStatic
   public static final void a(@NotNull Vec3 var0, boolean var1) {
      short var10001 = 18635;
      short var10002 = 24458;
      Intrinsics.checkNotNullParameter(var0, "target");
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 3.0F;
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
   }

   @JvmStatic
   public static final void a(@NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var0) {
      short var10001 = 18633;
      short var10002 = 31950;
      Intrinsics.checkNotNullParameter(var0, "rotation");
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var0);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1) {
      short var10001 = 18632;
      short var10002 = -9767;
      Intrinsics.checkNotNullParameter(var1, "event");
      if (!var1.c()) {
         if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null
            && IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.E()) {
            this.g();
         }
      }
   }

   private final void g() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      if (var1 == null && lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
         Vec3 var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var3 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var2);
         float var4 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            ? llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            : IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(-35.0F, 40.0F, var3.b());
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var3.a(), var4);
      }
   }

   public final void h() {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.C();
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
   }

   public final boolean i() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.E();
   }

   public final boolean j() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.D();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0005ò\fÔºm\u008a+\u0005ïÈµ¦¾";
      int var4 = "\u0005ò\fÔºm\u008a+\u0005ïÈµ¦¾".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 118;
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
                     case 0 -> 56;
                     case 1 -> 12;
                     case 2 -> 91;
                     case 3 -> 80;
                     case 4 -> 102;
                     case 5 -> 97;
                     default -> 60;
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
                     d = new String[4];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 3.0F;
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

                  var2 = "u\tÎn9í\u0006M±ÉyÙ\u000f";
                  var4 = "u\tÎn9í\u0006M±ÉyÙ\u000f".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 95;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 18633) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 211;
            case 1 -> 242;
            case 2 -> 63;
            case 3 -> 84;
            case 4 -> 95;
            case 5 -> 205;
            case 6 -> 97;
            case 7 -> 161;
            case 8 -> 42;
            case 9 -> 202;
            case 10 -> 70;
            case 11 -> 125;
            case 12 -> 135;
            case 13 -> 207;
            case 14 -> 31;
            case 15 -> 251;
            case 16 -> 132;
            case 17 -> 23;
            case 18 -> 36;
            case 19 -> 35;
            case 20 -> 98;
            case 21 -> 244;
            case 22 -> 199;
            case 23 -> 156;
            case 24 -> 0;
            case 25 -> 39;
            case 26 -> 255;
            case 27 -> 78;
            case 28 -> 203;
            case 29 -> 2;
            case 30 -> 221;
            case 31 -> 26;
            case 32 -> 140;
            case 33 -> 230;
            case 34 -> 216;
            case 35 -> 1;
            case 36 -> 112;
            case 37 -> 121;
            case 38 -> 9;
            case 39 -> 245;
            case 40 -> 76;
            case 41 -> 214;
            case 42 -> 213;
            case 43 -> 236;
            case 44 -> 220;
            case 45 -> 196;
            case 46 -> 124;
            case 47 -> 113;
            case 48 -> 201;
            case 49 -> 212;
            case 50 -> 131;
            case 51 -> 249;
            case 52 -> 16;
            case 53 -> 226;
            case 54 -> 29;
            case 55 -> 82;
            case 56 -> 148;
            case 57 -> 80;
            case 58 -> 15;
            case 59 -> 58;
            case 60 -> 162;
            case 61 -> 237;
            case 62 -> 13;
            case 63 -> 144;
            case 64 -> 66;
            case 65 -> 170;
            case 66 -> 114;
            case 67 -> 192;
            case 68 -> 107;
            case 69 -> 67;
            case 70 -> 206;
            case 71 -> 139;
            case 72 -> 171;
            case 73 -> 65;
            case 74 -> 175;
            case 75 -> 149;
            case 76 -> 152;
            case 77 -> 182;
            case 78 -> 6;
            case 79 -> 12;
            case 80 -> 142;
            case 81 -> 127;
            case 82 -> 136;
            case 83 -> 126;
            case 84 -> 57;
            case 85 -> 188;
            case 86 -> 11;
            case 87 -> 180;
            case 88 -> 79;
            case 89 -> 160;
            case 90 -> 204;
            case 91 -> 241;
            case 92 -> 158;
            case 93 -> 8;
            case 94 -> 106;
            case 95 -> 102;
            case 96 -> 85;
            case 97 -> 77;
            case 98 -> 232;
            case 99 -> 60;
            case 100 -> 122;
            case 101 -> 37;
            case 102 -> 253;
            case 103 -> 194;
            case 104 -> 240;
            case 105 -> 239;
            case 106 -> 88;
            case 107 -> 7;
            case 108 -> 10;
            case 109 -> 193;
            case 110 -> 103;
            case 111 -> 47;
            case 112 -> 120;
            case 113 -> 100;
            case 114 -> 20;
            case 115 -> 45;
            case 116 -> 215;
            case 117 -> 89;
            case 118 -> 147;
            case 119 -> 225;
            case 120 -> 33;
            case 121 -> 28;
            case 122 -> 3;
            case 123 -> 69;
            case 124 -> 52;
            case 125 -> 110;
            case 126 -> 46;
            case 127 -> 150;
            case 128 -> 5;
            case 129 -> 134;
            case 130 -> 198;
            case 131 -> 233;
            case 132 -> 210;
            case 133 -> 166;
            case 134 -> 105;
            case 135 -> 30;
            case 136 -> 189;
            case 137 -> 74;
            case 138 -> 145;
            case 139 -> 200;
            case 140 -> 34;
            case 141 -> 234;
            case 142 -> 4;
            case 143 -> 111;
            case 144 -> 143;
            case 145 -> 62;
            case 146 -> 75;
            case 147 -> 184;
            case 148 -> 86;
            case 149 -> 218;
            case 150 -> 96;
            case 151 -> 227;
            case 152 -> 219;
            case 153 -> 25;
            case 154 -> 173;
            case 155 -> 222;
            case 156 -> 174;
            case 157 -> 217;
            case 158 -> 235;
            case 159 -> 61;
            case 160 -> 51;
            case 161 -> 21;
            case 162 -> 54;
            case 163 -> 73;
            case 164 -> 130;
            case 165 -> 55;
            case 166 -> 183;
            case 167 -> 18;
            case 168 -> 176;
            case 169 -> 83;
            case 170 -> 117;
            case 171 -> 93;
            case 172 -> 248;
            case 173 -> 224;
            case 174 -> 190;
            case 175 -> 101;
            case 176 -> 252;
            case 177 -> 38;
            case 178 -> 179;
            case 179 -> 119;
            case 180 -> 123;
            case 181 -> 153;
            case 182 -> 137;
            case 183 -> 168;
            case 184 -> 22;
            case 185 -> 72;
            case 186 -> 197;
            case 187 -> 19;
            case 188 -> 90;
            case 189 -> 254;
            case 190 -> 246;
            case 191 -> 50;
            case 192 -> 32;
            case 193 -> 48;
            case 194 -> 99;
            case 195 -> 17;
            case 196 -> 229;
            case 197 -> 164;
            case 198 -> 163;
            case 199 -> 108;
            case 200 -> 53;
            case 201 -> 223;
            case 202 -> 167;
            case 203 -> 191;
            case 204 -> 87;
            case 205 -> 49;
            case 206 -> 154;
            case 207 -> 133;
            case 208 -> 195;
            case 209 -> 109;
            case 210 -> 157;
            case 211 -> 14;
            case 212 -> 178;
            case 213 -> 247;
            case 214 -> 129;
            case 215 -> 159;
            case 216 -> 186;
            case 217 -> 94;
            case 218 -> 27;
            case 219 -> 250;
            case 220 -> 185;
            case 221 -> 116;
            case 222 -> 177;
            case 223 -> 91;
            case 224 -> 155;
            case 225 -> 172;
            case 226 -> 81;
            case 227 -> 68;
            case 228 -> 141;
            case 229 -> 40;
            case 230 -> 238;
            case 231 -> 187;
            case 232 -> 64;
            case 233 -> 43;
            case 234 -> 44;
            case 235 -> 243;
            case 236 -> 115;
            case 237 -> 209;
            case 238 -> 181;
            case 239 -> 165;
            case 240 -> 56;
            case 241 -> 151;
            case 242 -> 24;
            case 243 -> 138;
            case 244 -> 128;
            case 245 -> 59;
            case 246 -> 231;
            case 247 -> 104;
            case 248 -> 169;
            case 249 -> 118;
            case 250 -> 208;
            case 251 -> 92;
            case 252 -> 228;
            case 253 -> 71;
            case 254 -> 41;
            default -> 146;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      extends llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII {
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @Override
      public float G() {
         return IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(
               lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e()
                  .s(),
               lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e()
                  .t()
            );
      }

      @Override
      public float f(float var1, float var2) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3;
         float var9;
         label69: {
            var3 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
            float var12;
            int var10000 = (var12 = var1 - 10.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            if (var3 == null) {
               if (var10000 < 0) {
                  var9 = 215.0F;
                  break label69;
               }

               float var13;
               var10000 = (var13 = var1 - 30.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var3 == null) {
               if (var10000 < 0) {
                  var9 = 235.0F;
                  break label69;
               }

               float var14;
               var10000 = (var14 = var1 - 60.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var3 == null) {
               if (var10000 < 0) {
                  var9 = 255.0F;
                  break label69;
               }

               var9 = var1;
               if (var3 != null) {
                  break label69;
               }

               float var15;
               var10000 = (var15 = var1 - 90.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            }

            var9 = var10000 < 0 ? 280.0F : 305.0F;
         }

         float var4;
         label71: {
            var4 = var9;
            float var16;
            int var10 = (var16 = var1 - 90.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
            if (var3 == null) {
               if (var10 > 0) {
                  var9 = 1.55F;
                  break label71;
               }

               float var17;
               var10 = (var17 = var1 - 60.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            }

            if (var3 == null) {
               if (var10 > 0) {
                  var9 = 1.32F;
                  break label71;
               }

               var9 = var1;
               if (var3 != null) {
                  break label71;
               }

               float var18;
               var10 = (var18 = var1 - 40.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
            }

            var9 = var10 > 0 ? 1.15F : 1.0F;
         }

         float var5 = var9;
         float var6 = 0.18F;
         float var7 = 1.0F - var6 / 2.0F + Random.Default.nextFloat() * var6;
         float var8 = (float)Math.pow(var2, 0.65F);
         return RangesKt.coerceIn(var4 * var5 * var7 / var8, 160.0F, 800.0F);
      }

      @Override
      public void g(float var1, float var2) {
      float var19 = 0; // PX-FIX
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = this;
         if (var3 == null) {
            label55:
            if (this.U()) {
               float var21;
               int var18 = (var21 = var1 - this.V()) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
               if (var3 == null) {
                  if (var18 < 0) {
                     break label55;
                  }

                  this.c(true);
                  float var22;
                  var18 = (var22 = var1 - 20.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
               }

               label62: {
                  if (var3 == null) {
                     if (var18 < 0) {
                        var19 = 0.01F;
                        break label62;
                     }

                     float var23;
                     var18 = (var23 = var1 - 40.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
                  }

                  if (var3 == null) {
                     if (var18 < 0) {
                        var19 = 0.02F;
                        break label62;
                     }

                     var19 = var1;
                     if (var3 != null) {
                        break label62;
                     }

                     float var24;
                     var18 = (var24 = var1 - 70.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
                  }

                  var19 = var18 < 0 ? 0.035F : 0.05F;
               }

               float var4 = var19
                  * lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .G()
                     .n();
               float var5 = var4 * (0.9F + Random.Default.nextFloat() * 0.2F);
               float var6 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .c(this.l() - this.j());
               float var7 = this.m() - this.k();
               this.r()[0] = TuplesKt.to(this.j(), this.k());
               this.r()[3] = TuplesKt.to(this.l(), this.m());
               long var8 = (int)(this.l() * 1000 + this.m() * 100);
               Random var10 = RandomKt.Random(var8);
               float var11 = 0.3F + var10.nextFloat() * 0.15F;
               float var12 = 0.65F + var10.nextFloat() * 0.15F;
               Pair var13 = TuplesKt.to(this.j() + var6 * var11, this.k() + var7 * var11);
               Pair var14 = TuplesKt.to(this.j() + var6 * var12, this.k() + var7 * var12);
               float var15 = -var7 * var5;
               float var16 = var6 * var5;
               float var20 = var10.nextFloat();
               if (var3 == null) {
                  var20 = var20 < 0.5F ? 1.0F : -1.0F;
               }

               float var17 = var20;
               this.r()[1] = TuplesKt.to(((Number)var13.getFirst()).floatValue() + var15 * var17, ((Number)var13.getSecond()).floatValue() + var16 * var17);
               this.r()[2] = TuplesKt.to(
                  ((Number)var14.getFirst()).floatValue() + var15 * var17 * 0.5F, ((Number)var14.getSecond()).floatValue() + var16 * var17 * 0.5F
               );
               return;
            }

            var10000 = this;
         }

         var10000.c(false);
      }
   }
}
