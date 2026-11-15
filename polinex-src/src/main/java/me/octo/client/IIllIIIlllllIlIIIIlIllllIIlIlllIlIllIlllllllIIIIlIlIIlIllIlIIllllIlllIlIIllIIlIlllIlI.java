package me.octo.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI
public final class IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   private final ScheduledExecutorService IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = Executors.newScheduledThreadPool(
      1
   );
   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      boolean var1 = llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI.e();
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -2908;
      short var10002 = -12522;
      var10002 = -2906;
      short var10003 = 9531;
      var10000 = var10000.a("macro", "Opens the Macro GUI");
      var10001 = -2907;
      var10002 = -10487;
      var10000 = var10000.a("macrogui");
      var10001 = -2911;
      var10002 = 1182;
      var10000 = var10000.a("polimacro");
      var10001 = -2909;
      var10002 = -23023;
      var10000 = var10000.a("polinexmacro");
      var10001 = -2905;
      var10002 = 21138;
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var6 = var10000.a("pnmacro")
         .a((kotlin.jvm.functions.Function1) (var5 -> a(this, (llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII) var5)))
         .a();
      if (var1) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var6;
   }

   private static final void b() {
      IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            0.0F
         );
      Minecraft.getInstance().setScreen(new lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll());
   }

   private static final void c() {
      Minecraft.getInstance().execute(IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI::b);
   }

   private static final Unit a(
      IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = -2912;
      short var10002 = 27276;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .schedule(IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI::c, 100L, TimeUnit.MILLISECONDS);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "=21V\u001fùíã\u0005ôV\bÚ8\u0007\u0018\u0017%\u000f^¶R\u0013¼¨a*Ï®i§º\u0084ü\u008cpWPþú\u0081à\tFvï\n(\f_\u0080\u0083";
      int var4 = "=21V\u001fùíã\u0005ôV\bÚ8\u0007\u0018\u0017%\u000f^¶R\u0013¼¨a*Ï®i§º\u0084ü\u008cpWPþú\u0081à\tFvï\n(\f_\u0080\u0083".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 8;
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
                     case 0 -> 50;
                     case 1 -> 99;
                     case 2 -> 122;
                     case 3 -> 74;
                     case 4 -> 31;
                     case 5 -> 40;
                     default -> 19;
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
                     b = new String[7];
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

                  var2 = "ðÎæ@MÆ1\u0017¨\u008aèc\f5\u0094\u0099Ný\u0098\u0085\u0091¶¼Þ¶";
                  var4 = "ðÎæ@MÆ1\u0017¨\u008aèc\f5\u0094\u0099Ný\u0098\u0085\u0091¶¼Þ¶".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 90;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2907) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 234;
            case 1 -> 100;
            case 2 -> 194;
            case 3 -> 155;
            case 4 -> 18;
            case 5 -> 83;
            case 6 -> 186;
            case 7 -> 159;
            case 8 -> 63;
            case 9 -> 248;
            case 10 -> 89;
            case 11 -> 182;
            case 12 -> 223;
            case 13 -> 67;
            case 14 -> 237;
            case 15 -> 161;
            case 16 -> 150;
            case 17 -> 25;
            case 18 -> 43;
            case 19 -> 75;
            case 20 -> 110;
            case 21 -> 188;
            case 22 -> 176;
            case 23 -> 167;
            case 24 -> 76;
            case 25 -> 175;
            case 26 -> 73;
            case 27 -> 246;
            case 28 -> 231;
            case 29 -> 103;
            case 30 -> 35;
            case 31 -> 90;
            case 32 -> 214;
            case 33 -> 163;
            case 34 -> 64;
            case 35 -> 125;
            case 36 -> 5;
            case 37 -> 104;
            case 38 -> 235;
            case 39 -> 204;
            case 40 -> 174;
            case 41 -> 119;
            case 42 -> 6;
            case 43 -> 147;
            case 44 -> 130;
            case 45 -> 221;
            case 46 -> 168;
            case 47 -> 29;
            case 48 -> 28;
            case 49 -> 26;
            case 50 -> 183;
            case 51 -> 42;
            case 52 -> 241;
            case 53 -> 247;
            case 54 -> 255;
            case 55 -> 69;
            case 56 -> 187;
            case 57 -> 197;
            case 58 -> 68;
            case 59 -> 166;
            case 60 -> 165;
            case 61 -> 51;
            case 62 -> 44;
            case 63 -> 134;
            case 64 -> 212;
            case 65 -> 238;
            case 66 -> 45;
            case 67 -> 122;
            case 68 -> 211;
            case 69 -> 137;
            case 70 -> 50;
            case 71 -> 180;
            case 72 -> 239;
            case 73 -> 7;
            case 74 -> 60;
            case 75 -> 131;
            case 76 -> 31;
            case 77 -> 65;
            case 78 -> 40;
            case 79 -> 101;
            case 80 -> 225;
            case 81 -> 98;
            case 82 -> 11;
            case 83 -> 148;
            case 84 -> 34;
            case 85 -> 15;
            case 86 -> 118;
            case 87 -> 144;
            case 88 -> 120;
            case 89 -> 106;
            case 90 -> 105;
            case 91 -> 185;
            case 92 -> 88;
            case 93 -> 228;
            case 94 -> 213;
            case 95 -> 200;
            case 96 -> 23;
            case 97 -> 87;
            case 98 -> 20;
            case 99 -> 0;
            case 100 -> 181;
            case 101 -> 72;
            case 102 -> 224;
            case 103 -> 80;
            case 104 -> 53;
            case 105 -> 132;
            case 106 -> 41;
            case 107 -> 12;
            case 108 -> 81;
            case 109 -> 14;
            case 110 -> 145;
            case 111 -> 84;
            case 112 -> 172;
            case 113 -> 48;
            case 114 -> 202;
            case 115 -> 157;
            case 116 -> 123;
            case 117 -> 36;
            case 118 -> 177;
            case 119 -> 226;
            case 120 -> 198;
            case 121 -> 4;
            case 122 -> 251;
            case 123 -> 220;
            case 124 -> 146;
            case 125 -> 10;
            case 126 -> 126;
            case 127 -> 97;
            case 128 -> 124;
            case 129 -> 154;
            case 130 -> 179;
            case 131 -> 116;
            case 132 -> 229;
            case 133 -> 74;
            case 134 -> 114;
            case 135 -> 195;
            case 136 -> 217;
            case 137 -> 178;
            case 138 -> 13;
            case 139 -> 113;
            case 140 -> 59;
            case 141 -> 206;
            case 142 -> 93;
            case 143 -> 219;
            case 144 -> 91;
            case 145 -> 250;
            case 146 -> 160;
            case 147 -> 17;
            case 148 -> 32;
            case 149 -> 38;
            case 150 -> 27;
            case 151 -> 121;
            case 152 -> 232;
            case 153 -> 173;
            case 154 -> 55;
            case 155 -> 39;
            case 156 -> 203;
            case 157 -> 49;
            case 158 -> 249;
            case 159 -> 201;
            case 160 -> 170;
            case 161 -> 16;
            case 162 -> 208;
            case 163 -> 215;
            case 164 -> 37;
            case 165 -> 140;
            case 166 -> 47;
            case 167 -> 252;
            case 168 -> 245;
            case 169 -> 52;
            case 170 -> 153;
            case 171 -> 96;
            case 172 -> 205;
            case 173 -> 58;
            case 174 -> 139;
            case 175 -> 253;
            case 176 -> 158;
            case 177 -> 109;
            case 178 -> 149;
            case 179 -> 85;
            case 180 -> 94;
            case 181 -> 71;
            case 182 -> 151;
            case 183 -> 156;
            case 184 -> 141;
            case 185 -> 82;
            case 186 -> 193;
            case 187 -> 184;
            case 188 -> 86;
            case 189 -> 56;
            case 190 -> 92;
            case 191 -> 79;
            case 192 -> 95;
            case 193 -> 190;
            case 194 -> 199;
            case 195 -> 143;
            case 196 -> 117;
            case 197 -> 9;
            case 198 -> 133;
            case 199 -> 57;
            case 200 -> 189;
            case 201 -> 54;
            case 202 -> 3;
            case 203 -> 77;
            case 204 -> 102;
            case 205 -> 19;
            case 206 -> 115;
            case 207 -> 209;
            case 208 -> 171;
            case 209 -> 191;
            case 210 -> 236;
            case 211 -> 129;
            case 212 -> 112;
            case 213 -> 2;
            case 214 -> 30;
            case 215 -> 207;
            case 216 -> 138;
            case 217 -> 61;
            case 218 -> 218;
            case 219 -> 24;
            case 220 -> 127;
            case 221 -> 227;
            case 222 -> 210;
            case 223 -> 222;
            case 224 -> 62;
            case 225 -> 216;
            case 226 -> 46;
            case 227 -> 240;
            case 228 -> 162;
            case 229 -> 70;
            case 230 -> 233;
            case 231 -> 230;
            case 232 -> 142;
            case 233 -> 136;
            case 234 -> 164;
            case 235 -> 196;
            case 236 -> 244;
            case 237 -> 135;
            case 238 -> 99;
            case 239 -> 8;
            case 240 -> 192;
            case 241 -> 1;
            case 242 -> 66;
            case 243 -> 152;
            case 244 -> 107;
            case 245 -> 243;
            case 246 -> 128;
            case 247 -> 242;
            case 248 -> 78;
            case 249 -> 21;
            case 250 -> 254;
            case 251 -> 111;
            case 252 -> 33;
            case 253 -> 108;
            case 254 -> 169;
            default -> 22;
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
