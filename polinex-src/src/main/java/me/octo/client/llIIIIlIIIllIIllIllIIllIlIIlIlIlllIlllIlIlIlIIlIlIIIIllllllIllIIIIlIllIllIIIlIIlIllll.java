package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
   implements IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl {
   private static String[] b;
   private static String[] c;

   @Override
   public void a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      short var10002 = 30871;
      short var10003 = 2992;
      Intrinsics.checkNotNullParameter(var1, "context");
      byte var3 = ((byte)((lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()) ? 1 : 0));
      int[] var2 = var10000;
      int var5 = var3;
      if (var2 == null) {
         if (var3 != 0) {
            return;
         }

         var5 = var1.a(0, 2);
      }

      label24: {
         int var4 = var5;
         if (var2 == null) {
            switch (var4) {
               case 0:
                  this.b(var1);
                  break;
               case 1:
                  break label24;
               default:
                  return;
            }
         }

         if (var2 == null) {
            return;
         }
      }

      this.c(var1);
   }

   private final void b(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      short var10002 = 30869;
      short var10003 = 19375;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", true);
      try {
         var1.a(50L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      String[] var4 = new String[4];
      var10003 = 30870;
      short var10004 = 18197;
      var4[0] = "forward";
      var10003 = 30868;
      var10004 = 13949;
      var4[1] = "back";
      var10003 = 30867;
      var10004 = 15614;
      var4[2] = "left";
      var10003 = 30876;
      var10004 = -19655;
      var4[3] = "right";
      List var3 = CollectionsKt.listOf(var4);
      String var15 = (String)var3.get(var1.a(0, var3.size()));
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var15, true);
      try {
         var1.a(120L + var1.a(0L, 100L));
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      try {
         var1.a(40L + var1.a(0L, 60L));
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      Iterable var6 = var3;
      boolean var7 = false;
      var var9 = new ArrayList();
      boolean var10 = false;
      int[] var2 = var10000;

      for (Object var12 : var6) {
         String var13 = (String)var12;
         boolean var14 = false;
         boolean var17 = Intrinsics.areEqual(var13, var15);
         if (var2 == null) {
            var17 = !var17;
         }

         if (var17) {
            var9.add(var12);
            if (var2 != null) {
               break;
            }
         }
      }

      List var5 = var9;
      String var16 = (String)var5.get(var1.a(0, var5.size()));
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var16, true);
      try {
         var1.a(200L + var1.a(0L, 150L));
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = 30869;
      var10002 = 19375;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", false);
   }

   private final void c(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      String[] var3 = new String[4];
      short var10002 = 30878;
      short var10003 = -29922;
      var3[0] = "forward";
      var10002 = 30864;
      var10003 = 4863;
      var3[1] = "back";
      var10002 = 30879;
      var10003 = 29215;
      var3[2] = "left";
      var10002 = 30865;
      var10003 = -24576;
      var3[3] = "right";
      List var2 = CollectionsKt.listOf(var3);
      String var4 = (String)var2.get(var1.a(0, var2.size()));
      short var10001 = 30877;
      var10002 = -4097;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", true);
      try {
         var1.a(50L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var4, true);
      try {
         var1.a(150L + var1.a(0L, 100L));
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      try {
         var1.a(80L + var1.a(0L, 70L));
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var4, true);
      try {
         var1.a(180L + var1.a(0L, 120L));
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      var10001 = 30869;
      var10002 = 19375;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", false);
   }

   @NotNull
   @Override
   public String b() {
      short var10000 = 30866;
      short var10001 = 4990;
      return "Mistake";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "ïÈ\u0087Ö\u0083kb\u0007*ß\u008678>\u0081\u0004Ï+\u0016y\u0005ÜAAÐ¤\u0007VÕÿ°\u00adÝ¦\u0004f1é¡\u0004IKÆu\u0005G \u0011\u0002ó\u0007Bê2\u00925ã´\u0004c#Iã";
      int var4 = "ïÈ\u0087Ö\u0083kb\u0007*ß\u008678>\u0081\u0004Ï+\u0016y\u0005ÜAAÐ¤\u0007VÕÿ°\u00adÝ¦\u0004f1é¡\u0004IKÆu\u0005G \u0011\u0002ó\u0007Bê2\u00925ã´\u0004c#Iã"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 17;
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
                     case 0 -> 29;
                     case 1 -> 1;
                     case 2 -> 50;
                     case 3 -> 41;
                     case 4 -> 91;
                     case 5 -> 76;
                     default -> 99;
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
                     b = var5;
                     c = new String[12];
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

                  var2 = "\fñ\u0088Ø0\u0005ÓÂPPv";
                  var4 = "\fñ\u0088Ø0\u0005ÓÂPPv".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 39;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30870) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 255;
            case 1 -> 53;
            case 2 -> 23;
            case 3 -> 116;
            case 4 -> 84;
            case 5 -> 135;
            case 6 -> 6;
            case 7 -> 254;
            case 8 -> 79;
            case 9 -> 39;
            case 10 -> 118;
            case 11 -> 126;
            case 12 -> 4;
            case 13 -> 235;
            case 14 -> 251;
            case 15 -> 233;
            case 16 -> 145;
            case 17 -> 94;
            case 18 -> 155;
            case 19 -> 66;
            case 20 -> 93;
            case 21 -> 240;
            case 22 -> 149;
            case 23 -> 243;
            case 24 -> 137;
            case 25 -> 143;
            case 26 -> 210;
            case 27 -> 176;
            case 28 -> 185;
            case 29 -> 89;
            case 30 -> 36;
            case 31 -> 211;
            case 32 -> 8;
            case 33 -> 177;
            case 34 -> 10;
            case 35 -> 197;
            case 36 -> 152;
            case 37 -> 119;
            case 38 -> 107;
            case 39 -> 167;
            case 40 -> 165;
            case 41 -> 158;
            case 42 -> 46;
            case 43 -> 253;
            case 44 -> 206;
            case 45 -> 181;
            case 46 -> 123;
            case 47 -> 186;
            case 48 -> 35;
            case 49 -> 193;
            case 50 -> 201;
            case 51 -> 223;
            case 52 -> 77;
            case 53 -> 105;
            case 54 -> 245;
            case 55 -> 48;
            case 56 -> 178;
            case 57 -> 75;
            case 58 -> 88;
            case 59 -> 213;
            case 60 -> 95;
            case 61 -> 17;
            case 62 -> 69;
            case 63 -> 73;
            case 64 -> 170;
            case 65 -> 232;
            case 66 -> 237;
            case 67 -> 55;
            case 68 -> 194;
            case 69 -> 216;
            case 70 -> 5;
            case 71 -> 106;
            case 72 -> 156;
            case 73 -> 52;
            case 74 -> 128;
            case 75 -> 199;
            case 76 -> 175;
            case 77 -> 60;
            case 78 -> 246;
            case 79 -> 229;
            case 80 -> 32;
            case 81 -> 112;
            case 82 -> 127;
            case 83 -> 138;
            case 84 -> 182;
            case 85 -> 183;
            case 86 -> 40;
            case 87 -> 207;
            case 88 -> 7;
            case 89 -> 64;
            case 90 -> 103;
            case 91 -> 147;
            case 92 -> 51;
            case 93 -> 56;
            case 94 -> 236;
            case 95 -> 24;
            case 96 -> 221;
            case 97 -> 121;
            case 98 -> 224;
            case 99 -> 110;
            case 100 -> 161;
            case 101 -> 171;
            case 102 -> 230;
            case 103 -> 71;
            case 104 -> 129;
            case 105 -> 59;
            case 106 -> 248;
            case 107 -> 20;
            case 108 -> 18;
            case 109 -> 198;
            case 110 -> 82;
            case 111 -> 28;
            case 112 -> 169;
            case 113 -> 65;
            case 114 -> 90;
            case 115 -> 98;
            case 116 -> 3;
            case 117 -> 142;
            case 118 -> 179;
            case 119 -> 38;
            case 120 -> 244;
            case 121 -> 43;
            case 122 -> 74;
            case 123 -> 205;
            case 124 -> 130;
            case 125 -> 249;
            case 126 -> 9;
            case 127 -> 15;
            case 128 -> 131;
            case 129 -> 45;
            case 130 -> 34;
            case 131 -> 41;
            case 132 -> 62;
            case 133 -> 132;
            case 134 -> 11;
            case 135 -> 226;
            case 136 -> 50;
            case 137 -> 228;
            case 138 -> 250;
            case 139 -> 33;
            case 140 -> 192;
            case 141 -> 67;
            case 142 -> 196;
            case 143 -> 180;
            case 144 -> 83;
            case 145 -> 72;
            case 146 -> 70;
            case 147 -> 122;
            case 148 -> 184;
            case 149 -> 13;
            case 150 -> 168;
            case 151 -> 102;
            case 152 -> 209;
            case 153 -> 0;
            case 154 -> 1;
            case 155 -> 222;
            case 156 -> 215;
            case 157 -> 63;
            case 158 -> 162;
            case 159 -> 85;
            case 160 -> 212;
            case 161 -> 203;
            case 162 -> 14;
            case 163 -> 124;
            case 164 -> 159;
            case 165 -> 154;
            case 166 -> 44;
            case 167 -> 146;
            case 168 -> 242;
            case 169 -> 219;
            case 170 -> 96;
            case 171 -> 190;
            case 172 -> 109;
            case 173 -> 252;
            case 174 -> 54;
            case 175 -> 19;
            case 176 -> 2;
            case 177 -> 87;
            case 178 -> 57;
            case 179 -> 151;
            case 180 -> 153;
            case 181 -> 208;
            case 182 -> 108;
            case 183 -> 157;
            case 184 -> 166;
            case 185 -> 241;
            case 186 -> 113;
            case 187 -> 78;
            case 188 -> 76;
            case 189 -> 174;
            case 190 -> 58;
            case 191 -> 225;
            case 192 -> 141;
            case 193 -> 188;
            case 194 -> 200;
            case 195 -> 220;
            case 196 -> 173;
            case 197 -> 16;
            case 198 -> 80;
            case 199 -> 97;
            case 200 -> 117;
            case 201 -> 202;
            case 202 -> 136;
            case 203 -> 218;
            case 204 -> 30;
            case 205 -> 187;
            case 206 -> 160;
            case 207 -> 91;
            case 208 -> 12;
            case 209 -> 114;
            case 210 -> 234;
            case 211 -> 227;
            case 212 -> 120;
            case 213 -> 68;
            case 214 -> 231;
            case 215 -> 81;
            case 216 -> 99;
            case 217 -> 148;
            case 218 -> 29;
            case 219 -> 163;
            case 220 -> 42;
            case 221 -> 31;
            case 222 -> 164;
            case 223 -> 189;
            case 224 -> 247;
            case 225 -> 104;
            case 226 -> 204;
            case 227 -> 144;
            case 228 -> 27;
            case 229 -> 217;
            case 230 -> 172;
            case 231 -> 26;
            case 232 -> 25;
            case 233 -> 101;
            case 234 -> 86;
            case 235 -> 139;
            case 236 -> 150;
            case 237 -> 191;
            case 238 -> 49;
            case 239 -> 239;
            case 240 -> 61;
            case 241 -> 140;
            case 242 -> 134;
            case 243 -> 21;
            case 244 -> 195;
            case 245 -> 100;
            case 246 -> 238;
            case 247 -> 133;
            case 248 -> 22;
            case 249 -> 47;
            case 250 -> 92;
            case 251 -> 115;
            case 252 -> 125;
            case 253 -> 37;
            case 254 -> 111;
            default -> 214;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

  // PX-FIX synth restored from jar bytecode
  public boolean a() { return me.octo.client.IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl.super.a(); }
}
