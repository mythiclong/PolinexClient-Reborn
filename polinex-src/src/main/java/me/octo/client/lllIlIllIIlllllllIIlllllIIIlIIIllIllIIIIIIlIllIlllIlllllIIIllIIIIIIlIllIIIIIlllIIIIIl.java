package me.octo.client;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = 31917;
      short var10002 = 18529;
      var10002 = 31918;
      short var10003 = 16323;
      var10000 = var10000.a("slayer", "Slayer debug");
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = 31915;
      var10003 = 11592;
      return var10000.a(
            var2.a("type")
               .a(
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
               .b()
         )
         .a(lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::a)
         .a();
   }

   private static final Unit a(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      Object var20 = null; // PX-FIX
      Object var17 = null; // PX-FIX
      int var16 = 0; // PX-FIX
      short var10001 = 31916;
      short var10002 = -8111;
      Intrinsics.checkNotNullParameter(var0, "context");
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var3 = var0;
      String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      var10001 = 31919;
      var10002 = -16387;
      String var4 = "type";
      boolean var5 = false;
      Iterable var6 = var0.a().b();
      String[] var1 = var10000;
      boolean var7 = false;
      int var8 = 0;
      Iterator var9 = var6.iterator();

      label73: {
         while (true) {
            if (var9.hasNext()) {
               Object var10 = var9.next();
               int var11 = var8++;
               var16 = var11;
               if (var1 == null) {
                  break label73;
               }

               if (var1 != null) {
                  if (var11 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var16 = var11;
               }

               IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var12 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var10;
               int var13 = var16;
               boolean var14 = false;
               if (var1 != null && Intrinsics.areEqual(var12.a(), var4) && var13 < var3.b().length) {
                  var10000 = (String[])var3.b()[var13];
                  if (!((Object)var10000 instanceof Integer)) {
                     var10000 = null;
                  }

                  var17 = (Integer)(Object)var10000;
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            }

            var17 = null;
            break;
         }

         if (var17 == null) {
            return Unit.INSTANCE;
         }

         var16 =((Integer)( var17));
      }

      label75: {
         int var2 = var16;
         int var19 = var2;
         if (var1 != null) {
            switch (var2) {
               case 0:
                  var20 = lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                     .b();
                  if (var1 == null) {
                     break label75;
                  }

                  var19 = ((me.octo.client.PXDyn)var20).c();
                  break;
               case 1:
               case 2:
               default:
                  return Unit.INSTANCE;
            }
         }

         if (var19 == 0) {
            lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .b()
               .o();
            if (var1 != null) {
               return Unit.INSTANCE;
            }
         }

         var20 = lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .b();
      }

      ((me.octo.client.PXDyn)var20).q();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\\\u008a½ï\fïU\u0019¿Dë¶#èR,L\u0006ôÉ^,¬\u0099";
      int var4 = "\\\u008a½ï\fïU\u0019¿Dë¶#èR,L\u0006ôÉ^,¬\u0099".length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 4;
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
                     case 0 -> 41;
                     case 1 -> 48;
                     case 2 -> 29;
                     case 3 -> 15;
                     case 4 -> 104;
                     case 5 -> 93;
                     default -> 94;
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

                  var2 = "\u0013\u0097§\u0091e\u0090Þ\u0004²\u0081x\u0096";
                  var4 = "\u0013\u0097§\u0091e\u0090Þ\u0004²\u0081x\u0096".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 86;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 31919) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 103;
            case 1 -> 156;
            case 2 -> 240;
            case 3 -> 231;
            case 4 -> 254;
            case 5 -> 41;
            case 6 -> 5;
            case 7 -> 110;
            case 8 -> 48;
            case 9 -> 15;
            case 10 -> 116;
            case 11 -> 190;
            case 12 -> 79;
            case 13 -> 188;
            case 14 -> 160;
            case 15 -> 126;
            case 16 -> 212;
            case 17 -> 1;
            case 18 -> 81;
            case 19 -> 223;
            case 20 -> 39;
            case 21 -> 166;
            case 22 -> 118;
            case 23 -> 61;
            case 24 -> 43;
            case 25 -> 216;
            case 26 -> 28;
            case 27 -> 49;
            case 28 -> 17;
            case 29 -> 59;
            case 30 -> 162;
            case 31 -> 99;
            case 32 -> 16;
            case 33 -> 46;
            case 34 -> 191;
            case 35 -> 129;
            case 36 -> 94;
            case 37 -> 209;
            case 38 -> 243;
            case 39 -> 228;
            case 40 -> 55;
            case 41 -> 73;
            case 42 -> 109;
            case 43 -> 22;
            case 44 -> 206;
            case 45 -> 44;
            case 46 -> 120;
            case 47 -> 204;
            case 48 -> 235;
            case 49 -> 108;
            case 50 -> 65;
            case 51 -> 100;
            case 52 -> 154;
            case 53 -> 244;
            case 54 -> 218;
            case 55 -> 155;
            case 56 -> 78;
            case 57 -> 179;
            case 58 -> 84;
            case 59 -> 180;
            case 60 -> 114;
            case 61 -> 138;
            case 62 -> 35;
            case 63 -> 178;
            case 64 -> 36;
            case 65 -> 172;
            case 66 -> 194;
            case 67 -> 238;
            case 68 -> 18;
            case 69 -> 227;
            case 70 -> 146;
            case 71 -> 159;
            case 72 -> 253;
            case 73 -> 75;
            case 74 -> 62;
            case 75 -> 13;
            case 76 -> 193;
            case 77 -> 6;
            case 78 -> 144;
            case 79 -> 229;
            case 80 -> 137;
            case 81 -> 185;
            case 82 -> 107;
            case 83 -> 163;
            case 84 -> 148;
            case 85 -> 199;
            case 86 -> 97;
            case 87 -> 232;
            case 88 -> 124;
            case 89 -> 29;
            case 90 -> 158;
            case 91 -> 11;
            case 92 -> 171;
            case 93 -> 111;
            case 94 -> 115;
            case 95 -> 189;
            case 96 -> 139;
            case 97 -> 125;
            case 98 -> 184;
            case 99 -> 131;
            case 100 -> 151;
            case 101 -> 112;
            case 102 -> 201;
            case 103 -> 70;
            case 104 -> 122;
            case 105 -> 233;
            case 106 -> 88;
            case 107 -> 21;
            case 108 -> 66;
            case 109 -> 247;
            case 110 -> 38;
            case 111 -> 245;
            case 112 -> 140;
            case 113 -> 248;
            case 114 -> 10;
            case 115 -> 105;
            case 116 -> 89;
            case 117 -> 23;
            case 118 -> 0;
            case 119 -> 123;
            case 120 -> 37;
            case 121 -> 224;
            case 122 -> 219;
            case 123 -> 142;
            case 124 -> 121;
            case 125 -> 220;
            case 126 -> 202;
            case 127 -> 45;
            case 128 -> 130;
            case 129 -> 31;
            case 130 -> 167;
            case 131 -> 141;
            case 132 -> 149;
            case 133 -> 207;
            case 134 -> 174;
            case 135 -> 177;
            case 136 -> 58;
            case 137 -> 34;
            case 138 -> 57;
            case 139 -> 226;
            case 140 -> 69;
            case 141 -> 24;
            case 142 -> 168;
            case 143 -> 255;
            case 144 -> 25;
            case 145 -> 135;
            case 146 -> 93;
            case 147 -> 196;
            case 148 -> 9;
            case 149 -> 230;
            case 150 -> 210;
            case 151 -> 134;
            case 152 -> 249;
            case 153 -> 176;
            case 154 -> 83;
            case 155 -> 87;
            case 156 -> 195;
            case 157 -> 14;
            case 158 -> 26;
            case 159 -> 53;
            case 160 -> 92;
            case 161 -> 198;
            case 162 -> 33;
            case 163 -> 128;
            case 164 -> 82;
            case 165 -> 8;
            case 166 -> 197;
            case 167 -> 145;
            case 168 -> 72;
            case 169 -> 32;
            case 170 -> 252;
            case 171 -> 165;
            case 172 -> 242;
            case 173 -> 208;
            case 174 -> 246;
            case 175 -> 2;
            case 176 -> 76;
            case 177 -> 186;
            case 178 -> 102;
            case 179 -> 211;
            case 180 -> 200;
            case 181 -> 3;
            case 182 -> 80;
            case 183 -> 221;
            case 184 -> 30;
            case 185 -> 51;
            case 186 -> 20;
            case 187 -> 237;
            case 188 -> 60;
            case 189 -> 241;
            case 190 -> 251;
            case 191 -> 90;
            case 192 -> 54;
            case 193 -> 101;
            case 194 -> 50;
            case 195 -> 217;
            case 196 -> 203;
            case 197 -> 67;
            case 198 -> 68;
            case 199 -> 74;
            case 200 -> 117;
            case 201 -> 152;
            case 202 -> 214;
            case 203 -> 56;
            case 204 -> 175;
            case 205 -> 143;
            case 206 -> 239;
            case 207 -> 192;
            case 208 -> 170;
            case 209 -> 222;
            case 210 -> 136;
            case 211 -> 106;
            case 212 -> 236;
            case 213 -> 181;
            case 214 -> 27;
            case 215 -> 64;
            case 216 -> 127;
            case 217 -> 183;
            case 218 -> 161;
            case 219 -> 47;
            case 220 -> 119;
            case 221 -> 234;
            case 222 -> 169;
            case 223 -> 173;
            case 224 -> 91;
            case 225 -> 85;
            case 226 -> 147;
            case 227 -> 132;
            case 228 -> 153;
            case 229 -> 52;
            case 230 -> 98;
            case 231 -> 95;
            case 232 -> 113;
            case 233 -> 150;
            case 234 -> 213;
            case 235 -> 77;
            case 236 -> 63;
            case 237 -> 71;
            case 238 -> 42;
            case 239 -> 7;
            case 240 -> 187;
            case 241 -> 157;
            case 242 -> 133;
            case 243 -> 104;
            case 244 -> 250;
            case 245 -> 205;
            case 246 -> 215;
            case 247 -> 86;
            case 248 -> 182;
            case 249 -> 19;
            case 250 -> 164;
            case 251 -> 40;
            case 252 -> 12;
            case 253 -> 96;
            case 254 -> 225;
            default -> 4;
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
