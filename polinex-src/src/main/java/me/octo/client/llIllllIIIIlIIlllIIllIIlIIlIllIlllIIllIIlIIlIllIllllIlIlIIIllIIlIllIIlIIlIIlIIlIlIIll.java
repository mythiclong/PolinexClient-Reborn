package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public final class llIllllIIIIlIIlllIIllIIlIIlIllIlllIIllIIlIIlIllIllllIlIlIIIllIIlIllIIlIIlIIlIIlIlIIll
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static llIllllIIIIlIIlllIIllIIlIIlIllIlllIIllIIlIIlIllIllllIlIlIIIllIIlIllIIlIIlIIlIIlIlIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private llIllllIIIIlIIlllIIllIIlIIlIllIlllIIllIIlIIlIllIllllIlIlIIIllIIlIllIIlIIlIIlIIlIlIIll() {
   }

   public final int a(@NotNull BlockPos var1) {
      String var10000 = lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.b();
      short var10002 = -26085;
      short var10003 = 31253;
      Intrinsics.checkNotNullParameter(var1, "center");
      String var2 = var10000;
      if (var2 != null) {
         ClientLevel var8 = this.a().level;
         if (var8 != null) {
            ClientLevel var3 = var8;
            byte var9 = ((byte)((var3.isLoaded(var1)) ? 1 : 0));
            if (var2 != null) {
               if (var9 == 0) {
                  return 0;
               }

               var9 = 0;
            }

            int var4 = var9;
            int var5 = -4;

            label67:
            while (true) {
               int var10 = var5;

               label64:
               while (var10 < 5) {
                  if (var2 == null) {
                     return -3;
                  }

                  int var6 = -3;

                  label61:
                  while (true) {
                     int var12 = var6;

                     label59:
                     while (true) {
                        if (var12 >= 4) {
                           break label61;
                        }

                        var10 = -4;
                        if (var2 == null) {
                           continue label64;
                        }

                        int var7 = -4;

                        while (var7 < 5) {
                           me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var13 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           BlockState var10001 = var3.getBlockState(var1.offset(var5, var6, var7));
                           var10003 = -26086;
                           short var10004 = -22220;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getBlockState(...)");
                           var12 = ((var13.k(var10001)) ? 1 : 0);
                           if (var2 == null) {
                              continue label59;
                           }

                           if (var12 != 0) {
                              var4++;
                           }

                           var7++;
                           if (var2 == null) {
                              break;
                           }
                        }

                        var6++;
                        if (var2 == null) {
                           break label61;
                        }
                        break;
                     }
                  }

                  var5++;
                  if (var2 != null) {
                     continue label67;
                  }
                  break;
               }

               return var4;
            }
         }
      }

      return 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "«ç\u0015\u009bNz\u0012bÀ²IêÍÿðlm\u000f\tHÓN¶\rÎ";
      int var4 = "«ç\u0015\u009bNz\u0012bÀ²IêÍÿðlm\u000f\tHÓN¶\rÎ".length();
      char var1 = 6;
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
                  case 0 -> 102;
                  case 1 -> 73;
                  case 2 -> 38;
                  case 3 -> 24;
                  case 4 -> 5;
                  case 5 -> 105;
                  default -> 107;
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
            c = var5;
            d = new String[2];
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIllllIIIIlIIlllIIllIIlIIlIllIlllIIllIIlIIlIllIllllIlIlIIIllIIlIllIIlIIlIIlIIlIlIIll();
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26085) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 34;
            case 1 -> 240;
            case 2 -> 164;
            case 3 -> 226;
            case 4 -> 222;
            case 5 -> 102;
            case 6 -> 249;
            case 7 -> 97;
            case 8 -> 189;
            case 9 -> 1;
            case 10 -> 44;
            case 11 -> 173;
            case 12 -> 169;
            case 13 -> 194;
            case 14 -> 90;
            case 15 -> 209;
            case 16 -> 101;
            case 17 -> 64;
            case 18 -> 42;
            case 19 -> 206;
            case 20 -> 205;
            case 21 -> 182;
            case 22 -> 27;
            case 23 -> 123;
            case 24 -> 9;
            case 25 -> 14;
            case 26 -> 118;
            case 27 -> 73;
            case 28 -> 186;
            case 29 -> 57;
            case 30 -> 215;
            case 31 -> 187;
            case 32 -> 241;
            case 33 -> 35;
            case 34 -> 74;
            case 35 -> 232;
            case 36 -> 140;
            case 37 -> 6;
            case 38 -> 236;
            case 39 -> 124;
            case 40 -> 41;
            case 41 -> 201;
            case 42 -> 231;
            case 43 -> 177;
            case 44 -> 87;
            case 45 -> 195;
            case 46 -> 171;
            case 47 -> 246;
            case 48 -> 216;
            case 49 -> 55;
            case 50 -> 19;
            case 51 -> 72;
            case 52 -> 84;
            case 53 -> 181;
            case 54 -> 168;
            case 55 -> 167;
            case 56 -> 109;
            case 57 -> 94;
            case 58 -> 104;
            case 59 -> 244;
            case 60 -> 7;
            case 61 -> 253;
            case 62 -> 214;
            case 63 -> 105;
            case 64 -> 207;
            case 65 -> 198;
            case 66 -> 76;
            case 67 -> 119;
            case 68 -> 106;
            case 69 -> 115;
            case 70 -> 59;
            case 71 -> 174;
            case 72 -> 111;
            case 73 -> 37;
            case 74 -> 251;
            case 75 -> 160;
            case 76 -> 66;
            case 77 -> 243;
            case 78 -> 70;
            case 79 -> 128;
            case 80 -> 143;
            case 81 -> 129;
            case 82 -> 88;
            case 83 -> 184;
            case 84 -> 91;
            case 85 -> 69;
            case 86 -> 223;
            case 87 -> 13;
            case 88 -> 17;
            case 89 -> 138;
            case 90 -> 39;
            case 91 -> 141;
            case 92 -> 250;
            case 93 -> 203;
            case 94 -> 22;
            case 95 -> 67;
            case 96 -> 176;
            case 97 -> 155;
            case 98 -> 146;
            case 99 -> 112;
            case 100 -> 122;
            case 101 -> 10;
            case 102 -> 235;
            case 103 -> 126;
            case 104 -> 227;
            case 105 -> 185;
            case 106 -> 252;
            case 107 -> 77;
            case 108 -> 224;
            case 109 -> 153;
            case 110 -> 58;
            case 111 -> 108;
            case 112 -> 8;
            case 113 -> 154;
            case 114 -> 132;
            case 115 -> 162;
            case 116 -> 180;
            case 117 -> 225;
            case 118 -> 83;
            case 119 -> 32;
            case 120 -> 152;
            case 121 -> 161;
            case 122 -> 25;
            case 123 -> 0;
            case 124 -> 159;
            case 125 -> 11;
            case 126 -> 43;
            case 127 -> 50;
            case 128 -> 172;
            case 129 -> 81;
            case 130 -> 114;
            case 131 -> 139;
            case 132 -> 208;
            case 133 -> 2;
            case 134 -> 63;
            case 135 -> 38;
            case 136 -> 156;
            case 137 -> 117;
            case 138 -> 157;
            case 139 -> 234;
            case 140 -> 133;
            case 141 -> 100;
            case 142 -> 245;
            case 143 -> 54;
            case 144 -> 23;
            case 145 -> 134;
            case 146 -> 218;
            case 147 -> 254;
            case 148 -> 130;
            case 149 -> 158;
            case 150 -> 219;
            case 151 -> 24;
            case 152 -> 16;
            case 153 -> 200;
            case 154 -> 230;
            case 155 -> 80;
            case 156 -> 163;
            case 157 -> 82;
            case 158 -> 47;
            case 159 -> 148;
            case 160 -> 142;
            case 161 -> 220;
            case 162 -> 136;
            case 163 -> 4;
            case 164 -> 15;
            case 165 -> 165;
            case 166 -> 33;
            case 167 -> 248;
            case 168 -> 217;
            case 169 -> 60;
            case 170 -> 78;
            case 171 -> 71;
            case 172 -> 89;
            case 173 -> 204;
            case 174 -> 135;
            case 175 -> 150;
            case 176 -> 48;
            case 177 -> 49;
            case 178 -> 61;
            case 179 -> 52;
            case 180 -> 255;
            case 181 -> 96;
            case 182 -> 26;
            case 183 -> 103;
            case 184 -> 213;
            case 185 -> 30;
            case 186 -> 85;
            case 187 -> 95;
            case 188 -> 121;
            case 189 -> 151;
            case 190 -> 127;
            case 191 -> 62;
            case 192 -> 51;
            case 193 -> 5;
            case 194 -> 211;
            case 195 -> 202;
            case 196 -> 178;
            case 197 -> 183;
            case 198 -> 239;
            case 199 -> 199;
            case 200 -> 196;
            case 201 -> 190;
            case 202 -> 110;
            case 203 -> 28;
            case 204 -> 40;
            case 205 -> 192;
            case 206 -> 191;
            case 207 -> 193;
            case 208 -> 116;
            case 209 -> 120;
            case 210 -> 75;
            case 211 -> 188;
            case 212 -> 86;
            case 213 -> 56;
            case 214 -> 46;
            case 215 -> 68;
            case 216 -> 79;
            case 217 -> 221;
            case 218 -> 137;
            case 219 -> 29;
            case 220 -> 229;
            case 221 -> 53;
            case 222 -> 92;
            case 223 -> 247;
            case 224 -> 98;
            case 225 -> 175;
            case 226 -> 12;
            case 227 -> 149;
            case 228 -> 179;
            case 229 -> 18;
            case 230 -> 31;
            case 231 -> 238;
            case 232 -> 99;
            case 233 -> 107;
            case 234 -> 145;
            case 235 -> 3;
            case 236 -> 93;
            case 237 -> 21;
            case 238 -> 45;
            case 239 -> 65;
            case 240 -> 147;
            case 241 -> 20;
            case 242 -> 228;
            case 243 -> 242;
            case 244 -> 125;
            case 245 -> 144;
            case 246 -> 197;
            case 247 -> 210;
            case 248 -> 131;
            case 249 -> 36;
            case 250 -> 233;
            case 251 -> 170;
            case 252 -> 237;
            case 253 -> 166;
            case 254 -> 212;
            default -> 113;
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
}
