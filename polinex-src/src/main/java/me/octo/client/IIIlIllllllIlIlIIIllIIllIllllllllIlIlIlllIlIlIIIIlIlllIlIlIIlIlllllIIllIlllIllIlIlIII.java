package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII
   extends IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII {
   @NotNull
   public static IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] f;
   private static String[] g;

   private IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII() {
      short var10001 = 5646;
      short var10002 = 10426;
      var10002 = 5647;
      short var10003 = -26971;
      short var10004 = 5643;
      short var10005 = -22406;
      super(
         "Rotation Speeds",
         "Speed ranges for each rotation mode.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         "Rotations",
         103
      );
   }

   @Override
   public boolean aq() {
      return true;
   }

   @Override
   public int ar() {
      return 7;
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new IlllllIllIlllIIIlIlllIIllIIIIllllllIllIlIlIlllIlIlIlIlIlIlIIlllllIIIIIlIlllllllIllIll(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 5645;
      short var10002 = -23364;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = 5642;
      var10002 = 22845;
      var1.a("name", this.aj());
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 5644;
      short var10002 = -18925;
      Intrinsics.checkNotNullParameter(var1, "data");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "[F%'\u0000/\u0083ÛtC¼\u0099\\Q»¤Ç9´¯ª¡\u0014m>GkÕ\u0083ÆÀâZÚµæ\u000f\u0087ç\u008eëV{F><%'ñÝ\u008az\u0004\u0016\u0014LZ\u0004Í\u00827\u0088";
      int var4 = "[F%'\u0000/\u0083ÛtC¼\u0099\\Q»¤Ç9´¯ª¡\u0014m>GkÕ\u0083ÆÀâZÚµæ\u000f\u0087ç\u008eëV{F><%'ñÝ\u008az\u0004\u0016\u0014LZ\u0004Í\u00827\u0088"
         .length();
      char var1 = '$';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 40;
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
                     case 0 -> 122;
                     case 1 -> 85;
                     case 2 -> 112;
                     case 3 -> 115;
                     case 4 -> 42;
                     case 5 -> 97;
                     default -> 113;
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
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII();
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

                  var2 = "´ô.O\u0084)Ú²:\u0004Øä\u0001\u0086";
                  var4 = "´ô.O\u0084)Ú²:\u0004Øä\u0001\u0086".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 46;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 5647) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 89;
            case 1 -> 115;
            case 2 -> 218;
            case 3 -> 42;
            case 4 -> 57;
            case 5 -> 69;
            case 6 -> 188;
            case 7 -> 158;
            case 8 -> 26;
            case 9 -> 75;
            case 10 -> 142;
            case 11 -> 207;
            case 12 -> 90;
            case 13 -> 129;
            case 14 -> 107;
            case 15 -> 84;
            case 16 -> 94;
            case 17 -> 133;
            case 18 -> 15;
            case 19 -> 81;
            case 20 -> 240;
            case 21 -> 182;
            case 22 -> 170;
            case 23 -> 117;
            case 24 -> 13;
            case 25 -> 199;
            case 26 -> 71;
            case 27 -> 184;
            case 28 -> 31;
            case 29 -> 12;
            case 30 -> 127;
            case 31 -> 67;
            case 32 -> 121;
            case 33 -> 233;
            case 34 -> 141;
            case 35 -> 255;
            case 36 -> 223;
            case 37 -> 136;
            case 38 -> 32;
            case 39 -> 196;
            case 40 -> 143;
            case 41 -> 40;
            case 42 -> 82;
            case 43 -> 87;
            case 44 -> 122;
            case 45 -> 161;
            case 46 -> 219;
            case 47 -> 226;
            case 48 -> 44;
            case 49 -> 172;
            case 50 -> 185;
            case 51 -> 238;
            case 52 -> 205;
            case 53 -> 227;
            case 54 -> 213;
            case 55 -> 50;
            case 56 -> 246;
            case 57 -> 193;
            case 58 -> 61;
            case 59 -> 229;
            case 60 -> 186;
            case 61 -> 150;
            case 62 -> 139;
            case 63 -> 211;
            case 64 -> 216;
            case 65 -> 190;
            case 66 -> 74;
            case 67 -> 83;
            case 68 -> 156;
            case 69 -> 154;
            case 70 -> 66;
            case 71 -> 166;
            case 72 -> 236;
            case 73 -> 125;
            case 74 -> 85;
            case 75 -> 157;
            case 76 -> 63;
            case 77 -> 252;
            case 78 -> 41;
            case 79 -> 2;
            case 80 -> 224;
            case 81 -> 77;
            case 82 -> 55;
            case 83 -> 204;
            case 84 -> 103;
            case 85 -> 29;
            case 86 -> 130;
            case 87 -> 254;
            case 88 -> 131;
            case 89 -> 230;
            case 90 -> 99;
            case 91 -> 222;
            case 92 -> 194;
            case 93 -> 167;
            case 94 -> 197;
            case 95 -> 176;
            case 96 -> 135;
            case 97 -> 88;
            case 98 -> 155;
            case 99 -> 21;
            case 100 -> 217;
            case 101 -> 58;
            case 102 -> 195;
            case 103 -> 171;
            case 104 -> 35;
            case 105 -> 232;
            case 106 -> 119;
            case 107 -> 128;
            case 108 -> 251;
            case 109 -> 14;
            case 110 -> 10;
            case 111 -> 65;
            case 112 -> 177;
            case 113 -> 134;
            case 114 -> 80;
            case 115 -> 8;
            case 116 -> 22;
            case 117 -> 215;
            case 118 -> 54;
            case 119 -> 210;
            case 120 -> 180;
            case 121 -> 59;
            case 122 -> 68;
            case 123 -> 96;
            case 124 -> 234;
            case 125 -> 101;
            case 126 -> 220;
            case 127 -> 178;
            case 128 -> 43;
            case 129 -> 78;
            case 130 -> 202;
            case 131 -> 241;
            case 132 -> 148;
            case 133 -> 104;
            case 134 -> 36;
            case 135 -> 253;
            case 136 -> 169;
            case 137 -> 242;
            case 138 -> 208;
            case 139 -> 120;
            case 140 -> 91;
            case 141 -> 92;
            case 142 -> 225;
            case 143 -> 5;
            case 144 -> 1;
            case 145 -> 124;
            case 146 -> 7;
            case 147 -> 132;
            case 148 -> 102;
            case 149 -> 60;
            case 150 -> 118;
            case 151 -> 11;
            case 152 -> 151;
            case 153 -> 97;
            case 154 -> 165;
            case 155 -> 137;
            case 156 -> 214;
            case 157 -> 247;
            case 158 -> 98;
            case 159 -> 24;
            case 160 -> 6;
            case 161 -> 27;
            case 162 -> 9;
            case 163 -> 160;
            case 164 -> 53;
            case 165 -> 39;
            case 166 -> 245;
            case 167 -> 108;
            case 168 -> 244;
            case 169 -> 191;
            case 170 -> 116;
            case 171 -> 34;
            case 172 -> 64;
            case 173 -> 93;
            case 174 -> 0;
            case 175 -> 30;
            case 176 -> 106;
            case 177 -> 162;
            case 178 -> 62;
            case 179 -> 49;
            case 180 -> 221;
            case 181 -> 86;
            case 182 -> 192;
            case 183 -> 159;
            case 184 -> 45;
            case 185 -> 149;
            case 186 -> 113;
            case 187 -> 72;
            case 188 -> 100;
            case 189 -> 33;
            case 190 -> 173;
            case 191 -> 183;
            case 192 -> 28;
            case 193 -> 52;
            case 194 -> 110;
            case 195 -> 114;
            case 196 -> 231;
            case 197 -> 25;
            case 198 -> 147;
            case 199 -> 144;
            case 200 -> 18;
            case 201 -> 189;
            case 202 -> 138;
            case 203 -> 23;
            case 204 -> 163;
            case 205 -> 47;
            case 206 -> 152;
            case 207 -> 4;
            case 208 -> 249;
            case 209 -> 145;
            case 210 -> 109;
            case 211 -> 237;
            case 212 -> 105;
            case 213 -> 51;
            case 214 -> 209;
            case 215 -> 153;
            case 216 -> 111;
            case 217 -> 164;
            case 218 -> 168;
            case 219 -> 243;
            case 220 -> 175;
            case 221 -> 123;
            case 222 -> 235;
            case 223 -> 206;
            case 224 -> 200;
            case 225 -> 126;
            case 226 -> 70;
            case 227 -> 19;
            case 228 -> 17;
            case 229 -> 48;
            case 230 -> 3;
            case 231 -> 38;
            case 232 -> 112;
            case 233 -> 228;
            case 234 -> 201;
            case 235 -> 46;
            case 236 -> 181;
            case 237 -> 239;
            case 238 -> 187;
            case 239 -> 146;
            case 240 -> 16;
            case 241 -> 79;
            case 242 -> 248;
            case 243 -> 56;
            case 244 -> 174;
            case 245 -> 76;
            case 246 -> 212;
            case 247 -> 140;
            case 248 -> 73;
            case 249 -> 250;
            case 250 -> 198;
            case 251 -> 179;
            case 252 -> 37;
            case 253 -> 203;
            case 254 -> 20;
            default -> 95;
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
}
