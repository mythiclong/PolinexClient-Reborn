package me.octo.client;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl() {
      short var10001 = -21164;
      short var10002 = 27292;
      var10002 = -21162;
      short var10003 = 2746;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -21163;
      short var10005 = -15910;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.a(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.b(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.c(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.d(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.e(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.f(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.g(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.h(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.i(),
         llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.j()
      };
      super("Route Rendering", "Master switch and styling for every macro route shown in the world.", var3, "Routes", true, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0012Y\u00adÊÑ§sïàÒÍ\u001a=ÃÞ\u0006å{S\u008e\u000e|CâúIq\u008b\u0082JEâ^¦6b;\u0012Õé.|±9úàR(\u0013Ìû\u001b%¸áaÒN\u001c\nDõmúcõßu\u001aÊ½1¡¬¤n÷#fZã\u0085ô/\u0004|1\u0099üë";
      int var4 = "\u0012Y\u00adÊÑ§sïàÒÍ\u001a=ÃÞ\u0006å{S\u008e\u000e|CâúIq\u008b\u0082JEâ^¦6b;\u0012Õé.|±9úàR(\u0013Ìû\u001b%¸áaÒN\u001c\nDõmúcõßu\u001aÊ½1¡¬¤n÷#fZã\u0085ô/\u0004|1\u0099üë"
         .length();
      char var1 = 15;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 46;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 46;
               var10006 = var6;
            } else {
               var13 = 46;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 46;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 17;
                  case 1 -> 85;
                  case 2 -> 75;
                  case 3 -> 86;
                  case 4 -> 88;
                  case 5 -> 5;
                  default -> 50;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            f = var5;
            g = new String[3];
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (Object[]) null
            );
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21164) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 220;
            case 1 -> 55;
            case 2 -> 166;
            case 3 -> 186;
            case 4 -> 179;
            case 5 -> 232;
            case 6 -> 24;
            case 7 -> 230;
            case 8 -> 71;
            case 9 -> 106;
            case 10 -> 20;
            case 11 -> 151;
            case 12 -> 237;
            case 13 -> 68;
            case 14 -> 133;
            case 15 -> 146;
            case 16 -> 9;
            case 17 -> 191;
            case 18 -> 140;
            case 19 -> 124;
            case 20 -> 193;
            case 21 -> 85;
            case 22 -> 53;
            case 23 -> 198;
            case 24 -> 14;
            case 25 -> 117;
            case 26 -> 43;
            case 27 -> 241;
            case 28 -> 40;
            case 29 -> 17;
            case 30 -> 233;
            case 31 -> 46;
            case 32 -> 32;
            case 33 -> 7;
            case 34 -> 181;
            case 35 -> 252;
            case 36 -> 69;
            case 37 -> 105;
            case 38 -> 97;
            case 39 -> 161;
            case 40 -> 205;
            case 41 -> 227;
            case 42 -> 165;
            case 43 -> 21;
            case 44 -> 44;
            case 45 -> 29;
            case 46 -> 174;
            case 47 -> 2;
            case 48 -> 255;
            case 49 -> 6;
            case 50 -> 110;
            case 51 -> 51;
            case 52 -> 207;
            case 53 -> 142;
            case 54 -> 132;
            case 55 -> 188;
            case 56 -> 196;
            case 57 -> 127;
            case 58 -> 149;
            case 59 -> 114;
            case 60 -> 129;
            case 61 -> 15;
            case 62 -> 88;
            case 63 -> 41;
            case 64 -> 121;
            case 65 -> 98;
            case 66 -> 200;
            case 67 -> 38;
            case 68 -> 94;
            case 69 -> 199;
            case 70 -> 236;
            case 71 -> 223;
            case 72 -> 206;
            case 73 -> 102;
            case 74 -> 60;
            case 75 -> 202;
            case 76 -> 138;
            case 77 -> 248;
            case 78 -> 35;
            case 79 -> 167;
            case 80 -> 231;
            case 81 -> 116;
            case 82 -> 104;
            case 83 -> 47;
            case 84 -> 215;
            case 85 -> 249;
            case 86 -> 58;
            case 87 -> 96;
            case 88 -> 78;
            case 89 -> 155;
            case 90 -> 54;
            case 91 -> 72;
            case 92 -> 130;
            case 93 -> 219;
            case 94 -> 1;
            case 95 -> 240;
            case 96 -> 172;
            case 97 -> 187;
            case 98 -> 92;
            case 99 -> 37;
            case 100 -> 57;
            case 101 -> 45;
            case 102 -> 16;
            case 103 -> 173;
            case 104 -> 152;
            case 105 -> 23;
            case 106 -> 137;
            case 107 -> 73;
            case 108 -> 189;
            case 109 -> 31;
            case 110 -> 213;
            case 111 -> 12;
            case 112 -> 5;
            case 113 -> 148;
            case 114 -> 144;
            case 115 -> 10;
            case 116 -> 83;
            case 117 -> 210;
            case 118 -> 30;
            case 119 -> 169;
            case 120 -> 128;
            case 121 -> 107;
            case 122 -> 118;
            case 123 -> 89;
            case 124 -> 253;
            case 125 -> 228;
            case 126 -> 11;
            case 127 -> 50;
            case 128 -> 195;
            case 129 -> 239;
            case 130 -> 112;
            case 131 -> 48;
            case 132 -> 150;
            case 133 -> 13;
            case 134 -> 33;
            case 135 -> 194;
            case 136 -> 175;
            case 137 -> 56;
            case 138 -> 136;
            case 139 -> 154;
            case 140 -> 147;
            case 141 -> 49;
            case 142 -> 34;
            case 143 -> 226;
            case 144 -> 168;
            case 145 -> 235;
            case 146 -> 25;
            case 147 -> 64;
            case 148 -> 27;
            case 149 -> 234;
            case 150 -> 108;
            case 151 -> 134;
            case 152 -> 214;
            case 153 -> 218;
            case 154 -> 111;
            case 155 -> 158;
            case 156 -> 123;
            case 157 -> 222;
            case 158 -> 81;
            case 159 -> 74;
            case 160 -> 84;
            case 161 -> 80;
            case 162 -> 185;
            case 163 -> 67;
            case 164 -> 18;
            case 165 -> 178;
            case 166 -> 139;
            case 167 -> 201;
            case 168 -> 120;
            case 169 -> 36;
            case 170 -> 229;
            case 171 -> 177;
            case 172 -> 162;
            case 173 -> 160;
            case 174 -> 59;
            case 175 -> 79;
            case 176 -> 153;
            case 177 -> 70;
            case 178 -> 19;
            case 179 -> 77;
            case 180 -> 126;
            case 181 -> 76;
            case 182 -> 244;
            case 183 -> 245;
            case 184 -> 113;
            case 185 -> 251;
            case 186 -> 52;
            case 187 -> 224;
            case 188 -> 212;
            case 189 -> 247;
            case 190 -> 65;
            case 191 -> 143;
            case 192 -> 246;
            case 193 -> 135;
            case 194 -> 8;
            case 195 -> 159;
            case 196 -> 109;
            case 197 -> 103;
            case 198 -> 99;
            case 199 -> 95;
            case 200 -> 170;
            case 201 -> 100;
            case 202 -> 184;
            case 203 -> 182;
            case 204 -> 125;
            case 205 -> 28;
            case 206 -> 87;
            case 207 -> 145;
            case 208 -> 62;
            case 209 -> 225;
            case 210 -> 243;
            case 211 -> 180;
            case 212 -> 209;
            case 213 -> 164;
            case 214 -> 157;
            case 215 -> 119;
            case 216 -> 115;
            case 217 -> 90;
            case 218 -> 82;
            case 219 -> 238;
            case 220 -> 63;
            case 221 -> 42;
            case 222 -> 61;
            case 223 -> 208;
            case 224 -> 3;
            case 225 -> 0;
            case 226 -> 183;
            case 227 -> 22;
            case 228 -> 101;
            case 229 -> 75;
            case 230 -> 26;
            case 231 -> 250;
            case 232 -> 190;
            case 233 -> 211;
            case 234 -> 197;
            case 235 -> 122;
            case 236 -> 39;
            case 237 -> 66;
            case 238 -> 171;
            case 239 -> 163;
            case 240 -> 242;
            case 241 -> 93;
            case 242 -> 156;
            case 243 -> 4;
            case 244 -> 131;
            case 245 -> 216;
            case 246 -> 91;
            case 247 -> 141;
            case 248 -> 176;
            case 249 -> 203;
            case 250 -> 204;
            case 251 -> 221;
            case 252 -> 254;
            case 253 -> 217;
            case 254 -> 86;
            default -> 192;
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
   public static void a(me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, java.util.List p1, int p2, me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI p3, int p4, Object p5) {
      if ((p4 & 4) != 0) {
         p3 = null;
      }
      p0.a(p1, p2, p3);
   }
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
      this();
   }

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public final boolean a() {
         return lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .aA();
      }

      public final boolean a(boolean var1) {
         String var2 = l();

         boolean var10000;
         label33: {
            try {
               var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  .aA();
               if (var2 != null) {
                  break label33;
               }

               if (!var10000) {
                  return false;
               }
            } catch (NoWhenBranchMatchedException var4) {
               throw (RuntimeException)a(var4);
            }

            var10000 = var1;
         }

         try {
            if (var2 != null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         } catch (NoWhenBranchMatchedException var3) {
            throw (RuntimeException)a(var3);
         }

         return false;
      }

      public final boolean b() {
         String var1 = l();

         boolean var10000;
         label33: {
            try {
               var10000 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.aA();
               if (var1 != null) {
                  break label33;
               }

               if (!var10000) {
                  return false;
               }
            } catch (NoWhenBranchMatchedException var4) {
               throw (RuntimeException)a(var4);
            }

            try {
               var10000 = ((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.c())).al();
            } catch (NoWhenBranchMatchedException var5) {
               throw (RuntimeException)a(var5);
            }
         }

         try {
            if (var1 != null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         } catch (NoWhenBranchMatchedException var3) {
            throw (RuntimeException)a(var3);
         }

         return false;
      }

      public final boolean c() {
         return ((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.e())).al();
      }

      private final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll d() {
         return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
            llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.a().j(), false
         );
      }

      private final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll e() {
         return this.d().j();
      }

      public final int f() {
         return this.d().a(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.b().q()).o();
      }

      public final int g() {
         return this.d().o();
      }

      public final int h() {
         return this.e().a(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.b().q()).o();
      }

      public final int i() {
         return this.d().a(((String)((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.d())).q())).o();
      }

      public final int j() {
         return this.e().a(((String)((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.d())).q())).o();
      }

      @NotNull
      public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll k() {
         return this.d().e().a(((String)((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.f())).q()));
      }

      public final float a(double var1) {
         float var3 = RangesKt.coerceAtLeast((float)var1, 1.0F);

         try {
            switch (((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.g())).<Integer>z()) {
               case 0:
                  return RangesKt.coerceIn(((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.h())).<Float>q() * 16.0F, 4.0F, 120.0F);
               case 1:
                  return RangesKt.coerceIn(
                     12.0F + var3 * (Float)0.6F * ((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.i())).<Float>q(), 10.0F, 140.0F
                  );
            }
         } catch (NoWhenBranchMatchedException var4) {
            throw (RuntimeException)a(var4);
         }

         return RangesKt.coerceIn(((me.octo.client.PXDyn)(Object)(llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.j())).<Float>q() * 260.0F / var3, 3.0F, 140.0F);
      }

      public final void a(@NotNull PoseStack param1, @NotNull List<? extends Vec3> param2, int param3) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         //
         // Bytecode:
         // 000: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
         // 003: aload 1
         // 004: sipush 7472
         // 007: sipush -32552
         // 00a: pop2
         // 00b: ldc "matrices"
         // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 010: astore 4
         // 012: aload 2
         // 013: sipush 7474
         // 016: sipush -29827
         // 019: pop2
         // 01a: ldc "path"
         // 01c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 01f: aload 0
         // 020: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Z
         // 023: aload 4
         // 025: ifnonnull 03f
         // 028: ifeq 04f
         // 02b: goto 032
         // 02e: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 031: athrow
         // 032: aload 2
         // 033: invokeinterface java/util/List.size ()I 1
         // 038: goto 03f
         // 03b: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 03e: athrow
         // 03f: aload 4
         // 041: ifnonnull 058
         // 044: bipush 2
         // 045: if_icmpge 054
         // 048: goto 04f
         // 04b: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 04e: athrow
         // 04f: return
         // 050: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 053: athrow
         // 054: aload 0
         // 055: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.i ()I
         // 058: istore 5
         // 05a: aload 0
         // 05b: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()I
         // 05e: istore 6
         // 060: aload 1
         // 061: astore 7
         // 063: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
         // 066: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
         // 069: dup
         // 06a: sipush 7473
         // 06d: sipush 4829
         // 070: pop2
         // 071: ldc "getMainRenderTarget(...)"
         // 073: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 076: astore 8
         // 078: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
         // 07b: astore 9
         // 07d: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
         // 080: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
         // 083: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
         // 086: dup
         // 087: sipush 7475
         // 08a: sipush 18769
         // 08d: pop2
         // 08e: ldc "getMainCamera(...)"
         // 090: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 093: astore 10
         // 095: bipush 0
         // 096: istore 11
         // 098: sipush 2848
         // 09b: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
         // 09e: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
         // 0a1: aload 8
         // 0a3: aload 7
         // 0a5: aload 10
         // 0a7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
         // 0aa: astore 12
         // 0ac: nop
         // 0ad: aload 9
         // 0af: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
         // 0b2: swap
         // 0b3: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
         // 0b6: iaload
         // 0b7: tableswitch 565 1 2 21 293
         // 0cc: aload 12
         // 0ce: astore 13
         // 0d0: bipush 0
         // 0d1: istore 14
         // 0d3: aload 13
         // 0d5: astore 15
         // 0d7: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
         // 0da: astore 16
         // 0dc: bipush 0
         // 0dd: istore 17
         // 0df: aload 15
         // 0e1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
         // 0e4: astore 18
         // 0e6: aload 15
         // 0e8: aload 16
         // 0ea: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
         // 0ed: nop
         // 0ee: aload 15
         // 0f0: astore 19
         // 0f2: bipush 0
         // 0f3: istore 20
         // 0f5: aload 2
         // 0f6: invokeinterface java/util/List.size ()I 1
         // 0fb: sipush 10000
         // 0fe: invokestatic kotlin/ranges/RangesKt.coerceAtMost (II)I
         // 101: istore 21
         // 103: bipush 0
         // 104: istore 22
         // 106: iload 21
         // 108: bipush 1
         // 109: isub
         // 10a: istore 23
         // 10c: iload 22
         // 10e: iload 23
         // 110: if_icmpge 1bd
         // 113: aload 4
         // 115: ifnonnull 1c6
         // 118: aload 2
         // 119: iload 22
         // 11b: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
         // 11e: checkcast net/minecraft/world/phys/Vec3
         // 121: dup
         // 122: ifnonnull 134
         // 125: goto 12c
         // 128: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 12b: athrow
         // 12c: pop
         // 12d: goto 1b5
         // 130: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 133: athrow
         // 134: astore 24
         // 136: aload 4
         // 138: ifnonnull 159
         // 13b: aload 2
         // 13c: iload 22
         // 13e: bipush 1
         // 13f: iadd
         // 140: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
         // 143: checkcast net/minecraft/world/phys/Vec3
         // 146: dup
         // 147: ifnonnull 15c
         // 14a: goto 151
         // 14d: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 150: athrow
         // 151: pop
         // 152: goto 159
         // 155: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 158: athrow
         // 159: goto 1b5
         // 15c: astore 25
         // 15e: aload 4
         // 160: ifnonnull 1b8
         // 163: aload 24
         // 165: invokestatic me/octo/client/llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.b (Lnet/minecraft/world/phys/Vec3;)Z
         // 168: ifeq 1b5
         // 16b: goto 172
         // 16e: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 171: athrow
         // 172: aload 25
         // 174: invokestatic me/octo/client/llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.b (Lnet/minecraft/world/phys/Vec3;)Z
         // 177: ifne 188
         // 17a: goto 181
         // 17d: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 180: athrow
         // 181: goto 1b5
         // 184: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 187: athrow
         // 188: aload 19
         // 18a: aload 24
         // 18c: aload 25
         // 18e: iload 22
         // 190: aload 4
         // 192: ifnonnull 1a9
         // 195: iload 3
         // 196: if_icmpne 1ac
         // 199: goto 1a0
         // 19c: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 19f: athrow
         // 1a0: iload 6
         // 1a2: goto 1a9
         // 1a5: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 1a8: athrow
         // 1a9: goto 1ae
         // 1ac: iload 5
         // 1ae: ldc_w 5.0
         // 1b1: bipush 1
         // 1b2: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IFZ)V
         // 1b5: iinc 22 1
         // 1b8: aload 4
         // 1ba: ifnull 10c
         // 1bd: nop
         // 1be: nop
         // 1bf: aload 15
         // 1c1: aload 18
         // 1c3: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
         // 1c6: goto 1d5
         // 1c9: astore 26
         // 1cb: aload 15
         // 1cd: aload 18
         // 1cf: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
         // 1d2: aload 26
         // 1d4: athrow
         // 1d5: nop
         // 1d6: nop
         // 1d7: aload 4
         // 1d9: ifnull 2f8
         // 1dc: aload 12
         // 1de: astore 13
         // 1e0: bipush 0
         // 1e1: istore 14
         // 1e3: aload 13
         // 1e5: astore 15
         // 1e7: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
         // 1ea: astore 16
         // 1ec: bipush 0
         // 1ed: istore 17
         // 1ef: aload 15
         // 1f1: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
         // 1f4: astore 18
         // 1f6: aload 15
         // 1f8: aload 16
         // 1fa: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
         // 1fd: nop
         // 1fe: aload 15
         // 200: astore 19
         // 202: bipush 0
         // 203: istore 20
         // 205: aload 2
         // 206: invokeinterface java/util/List.size ()I 1
         // 20b: sipush 10000
         // 20e: invokestatic kotlin/ranges/RangesKt.coerceAtMost (II)I
         // 211: istore 21
         // 213: bipush 0
         // 214: istore 22
         // 216: iload 21
         // 218: bipush 1
         // 219: isub
         // 21a: istore 23
         // 21c: iload 22
         // 21e: iload 23
         // 220: if_icmpge 2cd
         // 223: aload 4
         // 225: ifnonnull 2d6
         // 228: aload 2
         // 229: iload 22
         // 22b: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
         // 22e: checkcast net/minecraft/world/phys/Vec3
         // 231: dup
         // 232: ifnonnull 244
         // 235: goto 23c
         // 238: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 23b: athrow
         // 23c: pop
         // 23d: goto 2c5
         // 240: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 243: athrow
         // 244: astore 24
         // 246: aload 4
         // 248: ifnonnull 269
         // 24b: aload 2
         // 24c: iload 22
         // 24e: bipush 1
         // 24f: iadd
         // 250: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
         // 253: checkcast net/minecraft/world/phys/Vec3
         // 256: dup
         // 257: ifnonnull 26c
         // 25a: goto 261
         // 25d: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 260: athrow
         // 261: pop
         // 262: goto 269
         // 265: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 268: athrow
         // 269: goto 2c5
         // 26c: astore 25
         // 26e: aload 4
         // 270: ifnonnull 2c8
         // 273: aload 24
         // 275: invokestatic me/octo/client/llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.b (Lnet/minecraft/world/phys/Vec3;)Z
         // 278: ifeq 2c5
         // 27b: goto 282
         // 27e: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 281: athrow
         // 282: aload 25
         // 284: invokestatic me/octo/client/llllllIIlllIlIIIlIIIlIIIIlllIllIlIllIlIIIIllIllIlIllIlIlIllllIllIIllIlIlIllllIlIIIllI.b (Lnet/minecraft/world/phys/Vec3;)Z
         // 287: ifne 298
         // 28a: goto 291
         // 28d: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 290: athrow
         // 291: goto 2c5
         // 294: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 297: athrow
         // 298: aload 19
         // 29a: aload 24
         // 29c: aload 25
         // 29e: iload 22
         // 2a0: aload 4
         // 2a2: ifnonnull 2b9
         // 2a5: iload 3
         // 2a6: if_icmpne 2bc
         // 2a9: goto 2b0
         // 2ac: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 2af: athrow
         // 2b0: iload 6
         // 2b2: goto 2b9
         // 2b5: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 2b8: athrow
         // 2b9: goto 2be
         // 2bc: iload 5
         // 2be: ldc_w 5.0
         // 2c1: bipush 1
         // 2c2: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.a (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IFZ)V
         // 2c5: iinc 22 1
         // 2c8: aload 4
         // 2ca: ifnull 21c
         // 2cd: nop
         // 2ce: nop
         // 2cf: aload 15
         // 2d1: aload 18
         // 2d3: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
         // 2d6: goto 2e5
         // 2d9: astore 26
         // 2db: aload 15
         // 2dd: aload 18
         // 2df: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
         // 2e2: aload 26
         // 2e4: athrow
         // 2e5: nop
         // 2e6: nop
         // 2e7: aload 4
         // 2e9: ifnull 2f8
         // 2ec: new kotlin/NoWhenBranchMatchedException
         // 2ef: dup
         // 2f0: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
         // 2f3: athrow
         // 2f4: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 2f7: athrow
         // 2f8: aload 12
         // 2fa: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
         // 2fd: sipush 2848
         // 300: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
         // 303: goto 316
         // 306: astore 27
         // 308: aload 12
         // 30a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
         // 30d: sipush 2848
         // 310: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
         // 313: aload 27
         // 315: athrow
         // 316: nop
         // 317: return
      }

      public final void a(
         @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> param1,
         int param2,
         @Nullable IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI param3
      ) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
         //
         // Bytecode:
         // 00: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l ()Ljava/lang/String;
         // 03: aload 1
         // 04: sipush 7478
         // 07: sipush 15993
         // 0a: pop2
         // 0b: ldc_w "waypoints"
         // 0e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 11: astore 4
         // 13: getstatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl;
         // 16: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.aA ()Z
         // 19: ifne 21
         // 1c: return
         // 1d: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 20: athrow
         // 21: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
         // 24: dup
         // 25: aload 0
         // 26: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()I
         // 29: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
         // 2c: astore 5
         // 2e: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
         // 31: dup
         // 32: aload 0
         // 33: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()I
         // 36: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
         // 39: astore 6
         // 3b: aload 1
         // 3c: checkcast java/lang/Iterable
         // 3f: astore 7
         // 41: bipush 0
         // 42: istore 8
         // 44: bipush 0
         // 45: istore 9
         // 47: aload 7
         // 49: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
         // 4e: astore 10
         // 50: aload 10
         // 52: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 57: ifeq f6
         // 5a: aload 10
         // 5c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 61: astore 11
         // 63: iload 9
         // 65: iinc 9 1
         // 68: istore 12
         // 6a: aload 4
         // 6c: ifnonnull f7
         // 6f: iload 12
         // 71: aload 4
         // 73: ifnonnull 8c
         // 76: goto 7d
         // 79: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 7c: athrow
         // 7d: ifge 8a
         // 80: goto 87
         // 83: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // 86: athrow
         // 87: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
         // 8a: iload 12
         // 8c: aload 11
         // 8e: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
         // 91: astore 13
         // 93: istore 14
         // 95: bipush 0
         // 96: istore 15
         // 98: aload 3
         // 99: aload 4
         // 9b: ifnonnull c0
         // 9e: ifnull c4
         // a1: goto a8
         // a4: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // a7: athrow
         // a8: aload 13
         // aa: aload 4
         // ac: ifnonnull cd
         // af: goto b6
         // b2: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // b5: athrow
         // b6: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.b ()Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
         // b9: goto c0
         // bc: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // bf: athrow
         // c0: aload 3
         // c1: if_acmpne f0
         // c4: aload 13
         // c6: goto cd
         // c9: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // cc: athrow
         // cd: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.a ()Lnet/minecraft/core/BlockPos;
         // d0: iload 14
         // d2: iload 2
         // d3: if_icmpne df
         // d6: aload 6
         // d8: goto e1
         // db: invokestatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
         // de: athrow
         // df: aload 5
         // e1: aconst_null
         // e2: fconst_0
         // e3: aconst_null
         // e4: aconst_null
         // e5: fconst_0
         // e6: bipush 0
         // e7: fconst_0
         // e8: sipush 508
         // eb: aconst_null
         // ec: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/core/BlockPos;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
         // ef: nop
         // f0: nop
         // f1: aload 4
         // f3: ifnull 50
         // f6: nop
         // f7: return
      }

      public static void b(String var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static String l() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = " ²/ä\u0012ßØ5\bÏñ\u0092çå\u008b\u00031µz\u000b9\u0095r\bB\u009bÍÛØYr\u0089";
         int var4 = " ²/ä\u0012ßØ5\bÏñ\u0092çå\u008b\u00031µz\u000b9\u0095r\bB\u009bÍÛØYr\u0089".length();
         char var1 = 4;
         int var8 = -1;
         b(null);

         label52:
         while (true) {
            byte var10000 = 104;
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
                        case 0 -> 89;
                        case 1 -> 84;
                        case 2 -> 127;
                        case 3 -> 120;
                        case 4 -> 120;
                        case 5 -> 23;
                        default -> 34;
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
                        b = new String[5];
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

                     var2 = "\u0014F¶!E.9÷nC\r¦¼ûî\\<¿p\u0091h\u0015G«\tÕ\u0085\u0091à\u0003\u008c>\u0085\u0098";
                     var4 = "\u0014F¶!E.9÷nC\r¦¼ûî\\<¿p\u0091h\u0015G«\tÕ\u0085\u0091à\u0003\u008c>\u0085\u0098".length();
                     var1 = 24;
                     var8 = -1;
               }

               var10000 = 28;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 7474) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 11;
               case 1 -> 174;
               case 2 -> 205;
               case 3 -> 47;
               case 4 -> 91;
               case 5 -> 187;
               case 6 -> 129;
               case 7 -> 38;
               case 8 -> 240;
               case 9 -> 45;
               case 10 -> 63;
               case 11 -> 26;
               case 12 -> 2;
               case 13 -> 202;
               case 14 -> 135;
               case 15 -> 58;
               case 16 -> 233;
               case 17 -> 126;
               case 18 -> 236;
               case 19 -> 188;
               case 20 -> 9;
               case 21 -> 117;
               case 22 -> 191;
               case 23 -> 87;
               case 24 -> 225;
               case 25 -> 208;
               case 26 -> 42;
               case 27 -> 160;
               case 28 -> 90;
               case 29 -> 39;
               case 30 -> 255;
               case 31 -> 98;
               case 32 -> 20;
               case 33 -> 74;
               case 34 -> 14;
               case 35 -> 127;
               case 36 -> 211;
               case 37 -> 7;
               case 38 -> 163;
               case 39 -> 17;
               case 40 -> 142;
               case 41 -> 237;
               case 42 -> 131;
               case 43 -> 185;
               case 44 -> 125;
               case 45 -> 214;
               case 46 -> 123;
               case 47 -> 172;
               case 48 -> 48;
               case 49 -> 92;
               case 50 -> 198;
               case 51 -> 253;
               case 52 -> 65;
               case 53 -> 95;
               case 54 -> 130;
               case 55 -> 103;
               case 56 -> 133;
               case 57 -> 99;
               case 58 -> 209;
               case 59 -> 112;
               case 60 -> 76;
               case 61 -> 241;
               case 62 -> 242;
               case 63 -> 43;
               case 64 -> 100;
               case 65 -> 190;
               case 66 -> 228;
               case 67 -> 16;
               case 68 -> 52;
               case 69 -> 213;
               case 70 -> 19;
               case 71 -> 229;
               case 72 -> 80;
               case 73 -> 109;
               case 74 -> 107;
               case 75 -> 72;
               case 76 -> 41;
               case 77 -> 220;
               case 78 -> 30;
               case 79 -> 128;
               case 80 -> 151;
               case 81 -> 167;
               case 82 -> 207;
               case 83 -> 23;
               case 84 -> 169;
               case 85 -> 153;
               case 86 -> 31;
               case 87 -> 147;
               case 88 -> 136;
               case 89 -> 73;
               case 90 -> 171;
               case 91 -> 114;
               case 92 -> 199;
               case 93 -> 180;
               case 94 -> 215;
               case 95 -> 104;
               case 96 -> 132;
               case 97 -> 118;
               case 98 -> 251;
               case 99 -> 71;
               case 100 -> 4;
               case 101 -> 82;
               case 102 -> 49;
               case 103 -> 150;
               case 104 -> 249;
               case 105 -> 10;
               case 106 -> 101;
               case 107 -> 35;
               case 108 -> 250;
               case 109 -> 6;
               case 110 -> 119;
               case 111 -> 120;
               case 112 -> 245;
               case 113 -> 252;
               case 114 -> 79;
               case 115 -> 186;
               case 116 -> 192;
               case 117 -> 140;
               case 118 -> 149;
               case 119 -> 157;
               case 120 -> 53;
               case 121 -> 77;
               case 122 -> 193;
               case 123 -> 230;
               case 124 -> 221;
               case 125 -> 227;
               case 126 -> 89;
               case 127 -> 158;
               case 128 -> 113;
               case 129 -> 88;
               case 130 -> 83;
               case 131 -> 176;
               case 132 -> 197;
               case 133 -> 22;
               case 134 -> 234;
               case 135 -> 226;
               case 136 -> 86;
               case 137 -> 3;
               case 138 -> 1;
               case 139 -> 57;
               case 140 -> 121;
               case 141 -> 204;
               case 142 -> 224;
               case 143 -> 13;
               case 144 -> 146;
               case 145 -> 156;
               case 146 -> 93;
               case 147 -> 223;
               case 148 -> 165;
               case 149 -> 70;
               case 150 -> 0;
               case 151 -> 216;
               case 152 -> 168;
               case 153 -> 106;
               case 154 -> 85;
               case 155 -> 144;
               case 156 -> 166;
               case 157 -> 182;
               case 158 -> 231;
               case 159 -> 55;
               case 160 -> 67;
               case 161 -> 134;
               case 162 -> 27;
               case 163 -> 68;
               case 164 -> 122;
               case 165 -> 32;
               case 166 -> 34;
               case 167 -> 170;
               case 168 -> 154;
               case 169 -> 116;
               case 170 -> 244;
               case 171 -> 195;
               case 172 -> 8;
               case 173 -> 155;
               case 174 -> 69;
               case 175 -> 40;
               case 176 -> 84;
               case 177 -> 44;
               case 178 -> 50;
               case 179 -> 162;
               case 180 -> 194;
               case 181 -> 46;
               case 182 -> 36;
               case 183 -> 232;
               case 184 -> 178;
               case 185 -> 94;
               case 186 -> 243;
               case 187 -> 246;
               case 188 -> 206;
               case 189 -> 210;
               case 190 -> 139;
               case 191 -> 159;
               case 192 -> 189;
               case 193 -> 66;
               case 194 -> 78;
               case 195 -> 141;
               case 196 -> 81;
               case 197 -> 143;
               case 198 -> 238;
               case 199 -> 110;
               case 200 -> 33;
               case 201 -> 217;
               case 202 -> 62;
               case 203 -> 203;
               case 204 -> 60;
               case 205 -> 51;
               case 206 -> 59;
               case 207 -> 111;
               case 208 -> 64;
               case 209 -> 61;
               case 210 -> 179;
               case 211 -> 105;
               case 212 -> 201;
               case 213 -> 181;
               case 214 -> 173;
               case 215 -> 212;
               case 216 -> 219;
               case 217 -> 75;
               case 218 -> 29;
               case 219 -> 15;
               case 220 -> 96;
               case 221 -> 37;
               case 222 -> 247;
               case 223 -> 12;
               case 224 -> 164;
               case 225 -> 102;
               case 226 -> 137;
               case 227 -> 148;
               case 228 -> 97;
               case 229 -> 235;
               case 230 -> 145;
               case 231 -> 24;
               case 232 -> 152;
               case 233 -> 56;
               case 234 -> 196;
               case 235 -> 25;
               case 236 -> 115;
               case 237 -> 177;
               case 238 -> 200;
               case 239 -> 124;
               case 240 -> 222;
               case 241 -> 248;
               case 242 -> 239;
               case 243 -> 183;
               case 244 -> 108;
               case 245 -> 161;
               case 246 -> 184;
               case 247 -> 175;
               case 248 -> 5;
               case 249 -> 138;
               case 250 -> 28;
               case 251 -> 18;
               case 252 -> 254;
               case 253 -> 21;
               case 254 -> 54;
               default -> 218;
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
}
