package me.octo.client;

import kotlin.jvm.JvmField;
import net.minecraft.client.gui.screens.ChatScreen;
import org.jetbrains.annotations.NotNull;

public final class IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll
   extends IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII {
   @NotNull
   public static IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @JvmField
   @NotNull
   public static IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] f;
   private static String[] g;

   private IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll() {
      short var10001 = 9852;
      short var10002 = -29649;
      var10002 = 9855;
      short var10003 = -30435;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10004 = 9853;
      short var10005 = -26327;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIIllIllIIIllIIIlIIllllllllllIIlIllIIIIlllIlIllIlllIIIIlIlIlIIllllIIlllIlllIIIlIIll.a(),
         lIIIIllIllIIIllIIIlIIllllllllllIIlIllIIIIlllIlIllIlllIIIIlIlIlIIllllIIlllIlllIIIlIIll.b()
      };
      super("HUD Configuration", "Controls when the HUD overlay is shown.", var3, "HUD Editor", var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÈI¼õÏI\\åÛ\u0094\u0011\u001a¬æI\u0082Õ4\u000e7¬Ô½\u0097Þ\u00865Z'9íÂHX+zÄõRñg\u0082$×³Å0èÀ9\u0097ÿ\u0000\u001b\u001bq\u001fæõCêÝ\u0084Ö²³\u001aÂ";
      int var4 = "ÈI¼õÏI\\åÛ\u0094\u0011\u001a¬æI\u0082Õ4\u000e7¬Ô½\u0097Þ\u00865Z'9íÂHX+zÄõRñg\u0082$×³Å0èÀ9\u0097ÿ\u0000\u001b\u001bq\u001fæõCêÝ\u0084Ö²³\u001aÂ"
         .length();
      char var1 = '\n';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 28;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 28;
               var10006 = var6;
            } else {
               var13 = 28;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 28;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 43;
                  case 1 -> 39;
                  case 2 -> 90;
                  case 3 -> 120;
                  case 4 -> 5;
                  case 5 -> 39;
                  default -> 30;
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
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               (kotlin.jvm.internal.DefaultConstructorMarker) null
            );
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll();
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 9853) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 135;
            case 1 -> 221;
            case 2 -> 205;
            case 3 -> 251;
            case 4 -> 79;
            case 5 -> 216;
            case 6 -> 177;
            case 7 -> 236;
            case 8 -> 32;
            case 9 -> 85;
            case 10 -> 20;
            case 11 -> 204;
            case 12 -> 252;
            case 13 -> 43;
            case 14 -> 208;
            case 15 -> 73;
            case 16 -> 53;
            case 17 -> 140;
            case 18 -> 65;
            case 19 -> 155;
            case 20 -> 96;
            case 21 -> 13;
            case 22 -> 16;
            case 23 -> 104;
            case 24 -> 21;
            case 25 -> 237;
            case 26 -> 209;
            case 27 -> 206;
            case 28 -> 160;
            case 29 -> 215;
            case 30 -> 254;
            case 31 -> 186;
            case 32 -> 183;
            case 33 -> 103;
            case 34 -> 154;
            case 35 -> 200;
            case 36 -> 59;
            case 37 -> 1;
            case 38 -> 37;
            case 39 -> 82;
            case 40 -> 17;
            case 41 -> 253;
            case 42 -> 212;
            case 43 -> 232;
            case 44 -> 227;
            case 45 -> 202;
            case 46 -> 201;
            case 47 -> 195;
            case 48 -> 228;
            case 49 -> 78;
            case 50 -> 0;
            case 51 -> 238;
            case 52 -> 11;
            case 53 -> 9;
            case 54 -> 8;
            case 55 -> 158;
            case 56 -> 94;
            case 57 -> 185;
            case 58 -> 157;
            case 59 -> 231;
            case 60 -> 24;
            case 61 -> 47;
            case 62 -> 188;
            case 63 -> 71;
            case 64 -> 87;
            case 65 -> 138;
            case 66 -> 218;
            case 67 -> 175;
            case 68 -> 30;
            case 69 -> 51;
            case 70 -> 35;
            case 71 -> 168;
            case 72 -> 189;
            case 73 -> 242;
            case 74 -> 222;
            case 75 -> 119;
            case 76 -> 75;
            case 77 -> 122;
            case 78 -> 198;
            case 79 -> 169;
            case 80 -> 49;
            case 81 -> 80;
            case 82 -> 213;
            case 83 -> 76;
            case 84 -> 55;
            case 85 -> 240;
            case 86 -> 250;
            case 87 -> 164;
            case 88 -> 182;
            case 89 -> 56;
            case 90 -> 41;
            case 91 -> 184;
            case 92 -> 57;
            case 93 -> 239;
            case 94 -> 224;
            case 95 -> 194;
            case 96 -> 136;
            case 97 -> 156;
            case 98 -> 40;
            case 99 -> 106;
            case 100 -> 229;
            case 101 -> 191;
            case 102 -> 245;
            case 103 -> 2;
            case 104 -> 179;
            case 105 -> 10;
            case 106 -> 166;
            case 107 -> 18;
            case 108 -> 118;
            case 109 -> 214;
            case 110 -> 146;
            case 111 -> 23;
            case 112 -> 93;
            case 113 -> 143;
            case 114 -> 84;
            case 115 -> 144;
            case 116 -> 120;
            case 117 -> 91;
            case 118 -> 174;
            case 119 -> 112;
            case 120 -> 50;
            case 121 -> 210;
            case 122 -> 153;
            case 123 -> 15;
            case 124 -> 233;
            case 125 -> 148;
            case 126 -> 92;
            case 127 -> 28;
            case 128 -> 63;
            case 129 -> 66;
            case 130 -> 99;
            case 131 -> 36;
            case 132 -> 171;
            case 133 -> 5;
            case 134 -> 134;
            case 135 -> 247;
            case 136 -> 100;
            case 137 -> 83;
            case 138 -> 97;
            case 139 -> 67;
            case 140 -> 137;
            case 141 -> 54;
            case 142 -> 77;
            case 143 -> 133;
            case 144 -> 249;
            case 145 -> 90;
            case 146 -> 235;
            case 147 -> 230;
            case 148 -> 149;
            case 149 -> 6;
            case 150 -> 74;
            case 151 -> 115;
            case 152 -> 34;
            case 153 -> 38;
            case 154 -> 113;
            case 155 -> 42;
            case 156 -> 211;
            case 157 -> 163;
            case 158 -> 167;
            case 159 -> 111;
            case 160 -> 29;
            case 161 -> 131;
            case 162 -> 150;
            case 163 -> 44;
            case 164 -> 26;
            case 165 -> 187;
            case 166 -> 64;
            case 167 -> 162;
            case 168 -> 139;
            case 169 -> 33;
            case 170 -> 19;
            case 171 -> 225;
            case 172 -> 226;
            case 173 -> 142;
            case 174 -> 248;
            case 175 -> 61;
            case 176 -> 105;
            case 177 -> 132;
            case 178 -> 121;
            case 179 -> 3;
            case 180 -> 170;
            case 181 -> 45;
            case 182 -> 161;
            case 183 -> 31;
            case 184 -> 127;
            case 185 -> 4;
            case 186 -> 107;
            case 187 -> 241;
            case 188 -> 193;
            case 189 -> 217;
            case 190 -> 244;
            case 191 -> 89;
            case 192 -> 27;
            case 193 -> 190;
            case 194 -> 14;
            case 195 -> 203;
            case 196 -> 70;
            case 197 -> 128;
            case 198 -> 60;
            case 199 -> 165;
            case 200 -> 46;
            case 201 -> 109;
            case 202 -> 125;
            case 203 -> 192;
            case 204 -> 223;
            case 205 -> 101;
            case 206 -> 181;
            case 207 -> 110;
            case 208 -> 116;
            case 209 -> 72;
            case 210 -> 145;
            case 211 -> 52;
            case 212 -> 7;
            case 213 -> 58;
            case 214 -> 12;
            case 215 -> 95;
            case 216 -> 123;
            case 217 -> 141;
            case 218 -> 117;
            case 219 -> 69;
            case 220 -> 151;
            case 221 -> 129;
            case 222 -> 197;
            case 223 -> 152;
            case 224 -> 22;
            case 225 -> 68;
            case 226 -> 196;
            case 227 -> 178;
            case 228 -> 159;
            case 229 -> 246;
            case 230 -> 176;
            case 231 -> 62;
            case 232 -> 86;
            case 233 -> 199;
            case 234 -> 88;
            case 235 -> 48;
            case 236 -> 234;
            case 237 -> 25;
            case 238 -> 173;
            case 239 -> 102;
            case 240 -> 130;
            case 241 -> 219;
            case 242 -> 180;
            case 243 -> 39;
            case 244 -> 172;
            case 245 -> 147;
            case 246 -> 126;
            case 247 -> 108;
            case 248 -> 243;
            case 249 -> 98;
            case 250 -> 207;
            case 251 -> 81;
            case 252 -> 255;
            case 253 -> 220;
            case 254 -> 124;
            default -> 114;
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

      public final boolean a() {
         boolean var1;
         boolean var10000;
         var1 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
         var10000 = ((lIIIIllIllIIIllIIIlIIllllllllllIIlIllIIIIlllIlIllIlllIIIIlIlIlIIllllIIlllIlllIIIlIIll.a())).al();
         label31:
         if (var1) {
            if (var10000) {
               var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .screen instanceof ChatScreen;
               if (!var1) {
                  break label31;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = ((lIIIIllIllIIIllIIIlIIllllllllllIIlIllIIIIlllIlIllIlllIIIIlIlIlIIllllIIlllIlllIIIlIIll.b())).al();
         }

         if (var1) {
            if (var10000) {
               var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .options
                  .keyPlayerList
                  .isDown();
               if (!var1) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = false;
         }

         return var10000;
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
}
