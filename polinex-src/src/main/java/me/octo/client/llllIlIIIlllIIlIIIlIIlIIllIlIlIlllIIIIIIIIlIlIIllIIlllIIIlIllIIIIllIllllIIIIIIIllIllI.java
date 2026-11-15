package me.octo.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI(Object... px) {
        }

   private final ScheduledExecutorService IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = Executors.newScheduledThreadPool(
      1
   );
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      boolean var1 = e();
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = 8772;
      short var10002 = -30278;
      var10002 = 8773;
      short var10003 = 2598;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var2 = var10000.a("routesearch", "Opens the Route Browser")
         .a((kotlin.jvm.functions.Function1)null)
         .a();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(!var1);
      }

      return var2;
   }

   private static final void b() {
      IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            0.0F
         );
      Minecraft.getInstance().setScreen(new lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll());
   }

   private static final void c() {
      Minecraft.getInstance().execute(llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI::b);
   }

   private static final Unit a(
      llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = 8775;
      short var10002 = 24210;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .schedule(llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI::c, 100L, TimeUnit.MILLISECONDS);
      return Unit.INSTANCE;
   }

   public static void b(boolean var0) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
   }

   public static boolean d() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public static boolean e() {
      boolean var0 = d();
      return !var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u001f¯Ã\u0013ºÁ\u0000ý:\u0019*\u0010\bÊ6&®dÈçÖ\u0089\u0010\u000bº\u0015ý¢yý½J©\u0084\u0097\fI¯\u001f\u00adK+.\u0005þ\u0006ãË";
      int var4 = "\u001f¯Ã\u0013ºÁ\u0000ý:\u0019*\u0010\bÊ6&®dÈçÖ\u0089\u0010\u000bº\u0015ý¢yý½J©\u0084\u0097\fI¯\u001f\u00adK+.\u0005þ\u0006ãË".length();
      b(true);
      char var1 = 23;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 108;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 108;
               var10006 = var6;
            } else {
               var13 = 108;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 108;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 41;
                  case 1 -> 74;
                  case 2 -> 39;
                  case 3 -> 94;
                  case 4 -> 125;
                  case 5 -> 10;
                  default -> 112;
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
            a = var5;
            b = new String[3];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 8773) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 234;
            case 1 -> 186;
            case 2 -> 136;
            case 3 -> 160;
            case 4 -> 144;
            case 5 -> 34;
            case 6 -> 115;
            case 7 -> 255;
            case 8 -> 57;
            case 9 -> 47;
            case 10 -> 148;
            case 11 -> 207;
            case 12 -> 98;
            case 13 -> 66;
            case 14 -> 181;
            case 15 -> 21;
            case 16 -> 33;
            case 17 -> 18;
            case 18 -> 39;
            case 19 -> 165;
            case 20 -> 89;
            case 21 -> 49;
            case 22 -> 244;
            case 23 -> 7;
            case 24 -> 2;
            case 25 -> 138;
            case 26 -> 167;
            case 27 -> 109;
            case 28 -> 252;
            case 29 -> 38;
            case 30 -> 253;
            case 31 -> 116;
            case 32 -> 250;
            case 33 -> 170;
            case 34 -> 62;
            case 35 -> 25;
            case 36 -> 221;
            case 37 -> 140;
            case 38 -> 0;
            case 39 -> 237;
            case 40 -> 188;
            case 41 -> 146;
            case 42 -> 55;
            case 43 -> 187;
            case 44 -> 189;
            case 45 -> 213;
            case 46 -> 29;
            case 47 -> 183;
            case 48 -> 121;
            case 49 -> 92;
            case 50 -> 48;
            case 51 -> 9;
            case 52 -> 81;
            case 53 -> 203;
            case 54 -> 190;
            case 55 -> 26;
            case 56 -> 80;
            case 57 -> 24;
            case 58 -> 198;
            case 59 -> 150;
            case 60 -> 78;
            case 61 -> 20;
            case 62 -> 73;
            case 63 -> 164;
            case 64 -> 168;
            case 65 -> 205;
            case 66 -> 128;
            case 67 -> 30;
            case 68 -> 103;
            case 69 -> 185;
            case 70 -> 90;
            case 71 -> 125;
            case 72 -> 194;
            case 73 -> 223;
            case 74 -> 59;
            case 75 -> 14;
            case 76 -> 27;
            case 77 -> 200;
            case 78 -> 56;
            case 79 -> 102;
            case 80 -> 16;
            case 81 -> 179;
            case 82 -> 152;
            case 83 -> 31;
            case 84 -> 254;
            case 85 -> 178;
            case 86 -> 1;
            case 87 -> 85;
            case 88 -> 232;
            case 89 -> 246;
            case 90 -> 17;
            case 91 -> 199;
            case 92 -> 235;
            case 93 -> 248;
            case 94 -> 118;
            case 95 -> 122;
            case 96 -> 22;
            case 97 -> 41;
            case 98 -> 173;
            case 99 -> 11;
            case 100 -> 245;
            case 101 -> 74;
            case 102 -> 130;
            case 103 -> 249;
            case 104 -> 19;
            case 105 -> 169;
            case 106 -> 226;
            case 107 -> 37;
            case 108 -> 104;
            case 109 -> 106;
            case 110 -> 182;
            case 111 -> 135;
            case 112 -> 91;
            case 113 -> 87;
            case 114 -> 227;
            case 115 -> 107;
            case 116 -> 176;
            case 117 -> 70;
            case 118 -> 6;
            case 119 -> 238;
            case 120 -> 69;
            case 121 -> 242;
            case 122 -> 46;
            case 123 -> 202;
            case 124 -> 93;
            case 125 -> 82;
            case 126 -> 53;
            case 127 -> 142;
            case 128 -> 86;
            case 129 -> 113;
            case 130 -> 8;
            case 131 -> 158;
            case 132 -> 71;
            case 133 -> 217;
            case 134 -> 43;
            case 135 -> 180;
            case 136 -> 131;
            case 137 -> 4;
            case 138 -> 84;
            case 139 -> 247;
            case 140 -> 229;
            case 141 -> 149;
            case 142 -> 151;
            case 143 -> 111;
            case 144 -> 100;
            case 145 -> 147;
            case 146 -> 228;
            case 147 -> 64;
            case 148 -> 192;
            case 149 -> 230;
            case 150 -> 58;
            case 151 -> 36;
            case 152 -> 216;
            case 153 -> 214;
            case 154 -> 159;
            case 155 -> 75;
            case 156 -> 231;
            case 157 -> 83;
            case 158 -> 209;
            case 159 -> 61;
            case 160 -> 112;
            case 161 -> 191;
            case 162 -> 206;
            case 163 -> 117;
            case 164 -> 218;
            case 165 -> 197;
            case 166 -> 12;
            case 167 -> 225;
            case 168 -> 123;
            case 169 -> 72;
            case 170 -> 134;
            case 171 -> 162;
            case 172 -> 171;
            case 173 -> 10;
            case 174 -> 224;
            case 175 -> 163;
            case 176 -> 201;
            case 177 -> 233;
            case 178 -> 15;
            case 179 -> 195;
            case 180 -> 243;
            case 181 -> 40;
            case 182 -> 215;
            case 183 -> 28;
            case 184 -> 240;
            case 185 -> 157;
            case 186 -> 97;
            case 187 -> 63;
            case 188 -> 95;
            case 189 -> 52;
            case 190 -> 101;
            case 191 -> 139;
            case 192 -> 114;
            case 193 -> 177;
            case 194 -> 251;
            case 195 -> 88;
            case 196 -> 156;
            case 197 -> 239;
            case 198 -> 110;
            case 199 -> 222;
            case 200 -> 77;
            case 201 -> 184;
            case 202 -> 108;
            case 203 -> 132;
            case 204 -> 50;
            case 205 -> 137;
            case 206 -> 35;
            case 207 -> 133;
            case 208 -> 124;
            case 209 -> 219;
            case 210 -> 99;
            case 211 -> 166;
            case 212 -> 211;
            case 213 -> 236;
            case 214 -> 174;
            case 215 -> 196;
            case 216 -> 193;
            case 217 -> 105;
            case 218 -> 68;
            case 219 -> 42;
            case 220 -> 204;
            case 221 -> 172;
            case 222 -> 208;
            case 223 -> 119;
            case 224 -> 145;
            case 225 -> 143;
            case 226 -> 23;
            case 227 -> 65;
            case 228 -> 126;
            case 229 -> 161;
            case 230 -> 120;
            case 231 -> 13;
            case 232 -> 141;
            case 233 -> 67;
            case 234 -> 96;
            case 235 -> 212;
            case 236 -> 54;
            case 237 -> 175;
            case 238 -> 129;
            case 239 -> 94;
            case 240 -> 155;
            case 241 -> 153;
            case 242 -> 241;
            case 243 -> 44;
            case 244 -> 127;
            case 245 -> 220;
            case 246 -> 210;
            case 247 -> 32;
            case 248 -> 51;
            case 249 -> 3;
            case 250 -> 79;
            case 251 -> 5;
            case 252 -> 60;
            case 253 -> 154;
            case 254 -> 76;
            default -> 45;
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
   public llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI() {
   }
}
