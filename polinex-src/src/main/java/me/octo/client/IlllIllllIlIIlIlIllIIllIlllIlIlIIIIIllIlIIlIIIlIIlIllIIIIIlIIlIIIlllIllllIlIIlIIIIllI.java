package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI {
   @NotNull
   public static IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI() {
   }

   // PX-RESTORE: Kotlin a$default synthetic (bytecode a:(LIlllIllllIlIIlIl...;JIObject;)Ljava/util/List;)
   public static List<IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl> a(
      IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI var0,
      long var1,
      int var3,
      Object var4
   ) {
      if ((var3 & 1) != 0) {
         var1 = System.currentTimeMillis();
      }

      return var0.a(var1);
   }

   @NotNull
   public final List<IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl> a(long var1) {
       List<IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl> var24 = null; // PX-FIX decl var24
      Object var23 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      Random var4 = RandomKt.Random(var1);
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      List var5 = new ArrayList();
      int var6 = 6 + var4.nextInt(4);
      String var3 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            boolean var9 = false;
            var5.add(new llllIlIllIlIIIIllIllIllllIIIlIlIIIllIIlIIIIlIlIlIllllIllIlIIlIIIIIlIllIIlIIIIlIIIIlll());
            var7++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         var7 = 1 + var4.nextInt(2);
         break;
      }

      int var8 = 0;

      label125: {
         while (true) {
            if (var8 < var7) {
               boolean var10 = false;
               var5.add(new IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl());
               var8++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            float var30;
            var22 = (var30 = var4.nextFloat() - 0.4F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
            if (var3 == null) {
               break label125;
            }

            if ((me.octo.client.PxTruth.truth(var22))) {
               var5.add(new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll());
            }

            var8 = var4.nextInt(3);
            break;
         }

         var22 = 0;
      }

      int var16 =((Integer)( var22));

      label112: {
         while (true) {
            if (var16 < var8) {
               boolean var11 = false;
               var5.add(new lIllllIIIllllIlllIIlllllIllIllllIllllllllllIllIlIlIIIIlIllIlIlIIlIlIlllIlIllllllllIlI());
               var16++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            float var31;
            var23 = (var31 = var4.nextFloat() - 0.5F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
            if (var3 == null) {
               break label112;
            }

            if ((me.octo.client.PxTruth.truth(var23))) {
               var5.add(new lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl());
            }
            break;
         }

         float var32;
         var23 = (var32 = var4.nextFloat() - 0.3F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
      }

      label148: {
         if (var3 != null) {
            if ((me.octo.client.PxTruth.truth(var23))) {
               var5.add(new llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII());
            }

            var24 = var5;
            if (var3 == null) {
               break label148;
            }

            CollectionsKt.shuffle(var5, var4);
            var23 = lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
               .al();
         }

         label82:
         if (!(me.octo.client.PxTruth.truth(var23))) {
            String var17 = lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d()
               .y();
            short var10001 = -12124;
            short var10002 = -2160;
            int var25 = ((Intrinsics.areEqual(var17, "Custom")) ? 1 : 0);
            if (var3 != null) {
               if (var25 != 0) {
                  float var33;
                  int var26 = (var33 = var4.nextFloat() - 0.5F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
                  if (var3 != null) {
                     var26 = var26 < 0 ? 2 : 1;
                  }

                  int var18 = var26;
                  int var20 = var5.size() / (var18 + 1);
                  int var12 = 0;

                  do {
                     if (var12 >= var18) {
                        break label82;
                     }

                     int var13 = (var12 + 1) * var20;
                     int var27 = var20;
                     if (var3 != null) {
                        var27 = var20 > 2 ? var4.nextInt(-var20 / 3, var20 / 3) : 0;
                     }

                     int var14 = var27;
                     int var15 = RangesKt.coerceIn(var13 + var14, 0, var5.size());
                     var5.add(var15, new IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll());
                     var12++;
                  } while (var3 != null);
               }

               var10001 = -12123;
               var10002 = 8350;
               var25 = ((Intrinsics.areEqual(var17, "Generator")) ? 1 : 0);
            }

            if (var3 != null) {
               if (var25 == 0) {
                  break label82;
               }

               var25 = var5.size();
            }

            if (var3 != null) {
               var25 = var25 > 2 ? var4.nextInt(-var5.size() / 3, var5.size() / 3) : 0;
            }

            int var19 = var25;
            int var21 = RangesKt.coerceIn(var5.size() + var19, 0, var5.size());
            var5.add(var21, new llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll());
         }

         var24 = var5;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.b("bHzFV");
      }

      return var24;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "^æÃ6sr\u0084\\\u001b\u0006\u008c\t\u0000È¨\u0092";
      int var4 = "^æÃ6sr\u0084\\\u001b\u0006\u008c\t\u0000È¨\u0092".length();
      char var1 = '\t';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 98;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 98;
               var10006 = var6;
            } else {
               var13 = 98;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 98;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 93;
                  case 1 -> 73;
                  case 2 -> 76;
                  case 3 -> 65;
                  case 4 -> 125;
                  case 5 -> 26;
                  default -> 35;
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
            b = new String[2];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -12123) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 50;
            case 1 -> 54;
            case 2 -> 24;
            case 3 -> 185;
            case 4 -> 101;
            case 5 -> 52;
            case 6 -> 105;
            case 7 -> 244;
            case 8 -> 162;
            case 9 -> 47;
            case 10 -> 215;
            case 11 -> 127;
            case 12 -> 246;
            case 13 -> 190;
            case 14 -> 249;
            case 15 -> 238;
            case 16 -> 200;
            case 17 -> 3;
            case 18 -> 4;
            case 19 -> 206;
            case 20 -> 89;
            case 21 -> 38;
            case 22 -> 22;
            case 23 -> 236;
            case 24 -> 130;
            case 25 -> 163;
            case 26 -> 66;
            case 27 -> 186;
            case 28 -> 251;
            case 29 -> 159;
            case 30 -> 41;
            case 31 -> 75;
            case 32 -> 72;
            case 33 -> 194;
            case 34 -> 67;
            case 35 -> 187;
            case 36 -> 205;
            case 37 -> 248;
            case 38 -> 161;
            case 39 -> 214;
            case 40 -> 146;
            case 41 -> 196;
            case 42 -> 150;
            case 43 -> 44;
            case 44 -> 144;
            case 45 -> 173;
            case 46 -> 210;
            case 47 -> 49;
            case 48 -> 5;
            case 49 -> 154;
            case 50 -> 226;
            case 51 -> 133;
            case 52 -> 103;
            case 53 -> 148;
            case 54 -> 237;
            case 55 -> 171;
            case 56 -> 135;
            case 57 -> 197;
            case 58 -> 107;
            case 59 -> 116;
            case 60 -> 126;
            case 61 -> 97;
            case 62 -> 151;
            case 63 -> 30;
            case 64 -> 14;
            case 65 -> 172;
            case 66 -> 109;
            case 67 -> 232;
            case 68 -> 199;
            case 69 -> 46;
            case 70 -> 33;
            case 71 -> 20;
            case 72 -> 223;
            case 73 -> 137;
            case 74 -> 104;
            case 75 -> 245;
            case 76 -> 157;
            case 77 -> 139;
            case 78 -> 217;
            case 79 -> 122;
            case 80 -> 39;
            case 81 -> 174;
            case 82 -> 6;
            case 83 -> 110;
            case 84 -> 118;
            case 85 -> 113;
            case 86 -> 7;
            case 87 -> 129;
            case 88 -> 230;
            case 89 -> 208;
            case 90 -> 17;
            case 91 -> 242;
            case 92 -> 182;
            case 93 -> 168;
            case 94 -> 119;
            case 95 -> 233;
            case 96 -> 239;
            case 97 -> 120;
            case 98 -> 65;
            case 99 -> 175;
            case 100 -> 57;
            case 101 -> 48;
            case 102 -> 222;
            case 103 -> 111;
            case 104 -> 90;
            case 105 -> 91;
            case 106 -> 70;
            case 107 -> 254;
            case 108 -> 58;
            case 109 -> 16;
            case 110 -> 114;
            case 111 -> 220;
            case 112 -> 79;
            case 113 -> 42;
            case 114 -> 224;
            case 115 -> 63;
            case 116 -> 125;
            case 117 -> 64;
            case 118 -> 192;
            case 119 -> 181;
            case 120 -> 96;
            case 121 -> 85;
            case 122 -> 123;
            case 123 -> 255;
            case 124 -> 209;
            case 125 -> 138;
            case 126 -> 234;
            case 127 -> 235;
            case 128 -> 128;
            case 129 -> 80;
            case 130 -> 106;
            case 131 -> 221;
            case 132 -> 51;
            case 133 -> 94;
            case 134 -> 87;
            case 135 -> 108;
            case 136 -> 82;
            case 137 -> 247;
            case 138 -> 253;
            case 139 -> 21;
            case 140 -> 60;
            case 141 -> 31;
            case 142 -> 201;
            case 143 -> 132;
            case 144 -> 227;
            case 145 -> 68;
            case 146 -> 191;
            case 147 -> 56;
            case 148 -> 252;
            case 149 -> 231;
            case 150 -> 250;
            case 151 -> 179;
            case 152 -> 169;
            case 153 -> 158;
            case 154 -> 177;
            case 155 -> 170;
            case 156 -> 76;
            case 157 -> 183;
            case 158 -> 213;
            case 159 -> 73;
            case 160 -> 26;
            case 161 -> 74;
            case 162 -> 8;
            case 163 -> 203;
            case 164 -> 141;
            case 165 -> 180;
            case 166 -> 145;
            case 167 -> 115;
            case 168 -> 178;
            case 169 -> 218;
            case 170 -> 155;
            case 171 -> 228;
            case 172 -> 69;
            case 173 -> 207;
            case 174 -> 176;
            case 175 -> 95;
            case 176 -> 13;
            case 177 -> 142;
            case 178 -> 124;
            case 179 -> 160;
            case 180 -> 32;
            case 181 -> 61;
            case 182 -> 0;
            case 183 -> 77;
            case 184 -> 28;
            case 185 -> 165;
            case 186 -> 71;
            case 187 -> 152;
            case 188 -> 10;
            case 189 -> 59;
            case 190 -> 81;
            case 191 -> 45;
            case 192 -> 36;
            case 193 -> 27;
            case 194 -> 92;
            case 195 -> 86;
            case 196 -> 23;
            case 197 -> 29;
            case 198 -> 189;
            case 199 -> 188;
            case 200 -> 102;
            case 201 -> 216;
            case 202 -> 140;
            case 203 -> 34;
            case 204 -> 156;
            case 205 -> 55;
            case 206 -> 211;
            case 207 -> 225;
            case 208 -> 25;
            case 209 -> 37;
            case 210 -> 15;
            case 211 -> 198;
            case 212 -> 240;
            case 213 -> 166;
            case 214 -> 143;
            case 215 -> 202;
            case 216 -> 229;
            case 217 -> 84;
            case 218 -> 19;
            case 219 -> 241;
            case 220 -> 18;
            case 221 -> 117;
            case 222 -> 112;
            case 223 -> 93;
            case 224 -> 212;
            case 225 -> 83;
            case 226 -> 62;
            case 227 -> 243;
            case 228 -> 11;
            case 229 -> 131;
            case 230 -> 121;
            case 231 -> 1;
            case 232 -> 149;
            case 233 -> 78;
            case 234 -> 9;
            case 235 -> 184;
            case 236 -> 193;
            case 237 -> 153;
            case 238 -> 88;
            case 239 -> 204;
            case 240 -> 100;
            case 241 -> 43;
            case 242 -> 136;
            case 243 -> 134;
            case 244 -> 12;
            case 245 -> 2;
            case 246 -> 147;
            case 247 -> 35;
            case 248 -> 167;
            case 249 -> 98;
            case 250 -> 99;
            case 251 -> 40;
            case 252 -> 195;
            case 253 -> 219;
            case 254 -> 164;
            default -> 53;
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
