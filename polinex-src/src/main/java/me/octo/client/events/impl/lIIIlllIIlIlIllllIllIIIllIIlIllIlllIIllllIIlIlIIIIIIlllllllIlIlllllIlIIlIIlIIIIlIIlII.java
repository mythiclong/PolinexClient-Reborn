package me.octo.client.events.impl;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.world.scores.Objective;
import org.jetbrains.annotations.NotNull;

@me.octo.client.events.impl.base.annotations.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
public final class lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   private final GuiGraphicsExtractor IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final Objective IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] c;
   private static String[] d;

   public lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII(@NotNull GuiGraphicsExtractor var1, @NotNull Objective var2) {
      short var10001 = 28737;
      short var10002 = -18852;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 28736;
      var10002 = 24909;
      Intrinsics.checkNotNullParameter(var2, "objective");
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
   }

   @NotNull
   public final GuiGraphicsExtractor k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final Objective l() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÙÁRôët\u001f\tû\u0090\u009fcÐ¹£oä";
      int var4 = "ÙÁRôët\u001f\tû\u0090\u009fcÐ¹£oä".length();
      char var1 = 7;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 96;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 96;
               var10006 = var6;
            } else {
               var13 = 96;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 96;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 120;
                  case 1 -> 50;
                  case 2 -> 107;
                  case 3 -> 16;
                  case 4 -> 102;
                  case 5 -> 6;
                  default -> 127;
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
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 28737) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 221;
            case 1 -> 83;
            case 2 -> 200;
            case 3 -> 212;
            case 4 -> 241;
            case 5 -> 216;
            case 6 -> 238;
            case 7 -> 211;
            case 8 -> 243;
            case 9 -> 203;
            case 10 -> 151;
            case 11 -> 90;
            case 12 -> 223;
            case 13 -> 220;
            case 14 -> 207;
            case 15 -> 250;
            case 16 -> 97;
            case 17 -> 25;
            case 18 -> 35;
            case 19 -> 41;
            case 20 -> 237;
            case 21 -> 182;
            case 22 -> 141;
            case 23 -> 110;
            case 24 -> 43;
            case 25 -> 65;
            case 26 -> 215;
            case 27 -> 194;
            case 28 -> 2;
            case 29 -> 80;
            case 30 -> 142;
            case 31 -> 118;
            case 32 -> 131;
            case 33 -> 140;
            case 34 -> 152;
            case 35 -> 228;
            case 36 -> 119;
            case 37 -> 82;
            case 38 -> 95;
            case 39 -> 104;
            case 40 -> 210;
            case 41 -> 52;
            case 42 -> 192;
            case 43 -> 214;
            case 44 -> 54;
            case 45 -> 168;
            case 46 -> 50;
            case 47 -> 139;
            case 48 -> 226;
            case 49 -> 38;
            case 50 -> 169;
            case 51 -> 9;
            case 52 -> 71;
            case 53 -> 108;
            case 54 -> 177;
            case 55 -> 44;
            case 56 -> 252;
            case 57 -> 233;
            case 58 -> 176;
            case 59 -> 253;
            case 60 -> 89;
            case 61 -> 254;
            case 62 -> 28;
            case 63 -> 26;
            case 64 -> 183;
            case 65 -> 61;
            case 66 -> 209;
            case 67 -> 70;
            case 68 -> 156;
            case 69 -> 189;
            case 70 -> 133;
            case 71 -> 126;
            case 72 -> 196;
            case 73 -> 218;
            case 74 -> 161;
            case 75 -> 5;
            case 76 -> 124;
            case 77 -> 198;
            case 78 -> 107;
            case 79 -> 0;
            case 80 -> 202;
            case 81 -> 160;
            case 82 -> 144;
            case 83 -> 37;
            case 84 -> 30;
            case 85 -> 96;
            case 86 -> 81;
            case 87 -> 67;
            case 88 -> 248;
            case 89 -> 4;
            case 90 -> 121;
            case 91 -> 178;
            case 92 -> 229;
            case 93 -> 19;
            case 94 -> 72;
            case 95 -> 129;
            case 96 -> 69;
            case 97 -> 123;
            case 98 -> 128;
            case 99 -> 16;
            case 100 -> 135;
            case 101 -> 13;
            case 102 -> 29;
            case 103 -> 149;
            case 104 -> 222;
            case 105 -> 27;
            case 106 -> 55;
            case 107 -> 197;
            case 108 -> 100;
            case 109 -> 31;
            case 110 -> 230;
            case 111 -> 86;
            case 112 -> 106;
            case 113 -> 57;
            case 114 -> 217;
            case 115 -> 74;
            case 116 -> 185;
            case 117 -> 167;
            case 118 -> 56;
            case 119 -> 240;
            case 120 -> 163;
            case 121 -> 64;
            case 122 -> 154;
            case 123 -> 143;
            case 124 -> 179;
            case 125 -> 127;
            case 126 -> 45;
            case 127 -> 112;
            case 128 -> 79;
            case 129 -> 34;
            case 130 -> 62;
            case 131 -> 188;
            case 132 -> 245;
            case 133 -> 66;
            case 134 -> 73;
            case 135 -> 249;
            case 136 -> 170;
            case 137 -> 46;
            case 138 -> 132;
            case 139 -> 8;
            case 140 -> 147;
            case 141 -> 68;
            case 142 -> 150;
            case 143 -> 91;
            case 144 -> 11;
            case 145 -> 162;
            case 146 -> 247;
            case 147 -> 173;
            case 148 -> 103;
            case 149 -> 113;
            case 150 -> 32;
            case 151 -> 157;
            case 152 -> 3;
            case 153 -> 51;
            case 154 -> 219;
            case 155 -> 6;
            case 156 -> 232;
            case 157 -> 60;
            case 158 -> 59;
            case 159 -> 40;
            case 160 -> 20;
            case 161 -> 199;
            case 162 -> 208;
            case 163 -> 246;
            case 164 -> 206;
            case 165 -> 195;
            case 166 -> 47;
            case 167 -> 239;
            case 168 -> 187;
            case 169 -> 84;
            case 170 -> 137;
            case 171 -> 181;
            case 172 -> 48;
            case 173 -> 235;
            case 174 -> 101;
            case 175 -> 174;
            case 176 -> 255;
            case 177 -> 78;
            case 178 -> 227;
            case 179 -> 158;
            case 180 -> 225;
            case 181 -> 111;
            case 182 -> 33;
            case 183 -> 175;
            case 184 -> 138;
            case 185 -> 10;
            case 186 -> 201;
            case 187 -> 88;
            case 188 -> 15;
            case 189 -> 166;
            case 190 -> 39;
            case 191 -> 49;
            case 192 -> 251;
            case 193 -> 186;
            case 194 -> 87;
            case 195 -> 145;
            case 196 -> 14;
            case 197 -> 109;
            case 198 -> 77;
            case 199 -> 244;
            case 200 -> 114;
            case 201 -> 130;
            case 202 -> 58;
            case 203 -> 17;
            case 204 -> 53;
            case 205 -> 184;
            case 206 -> 18;
            case 207 -> 213;
            case 208 -> 224;
            case 209 -> 42;
            case 210 -> 180;
            case 211 -> 148;
            case 212 -> 36;
            case 213 -> 171;
            case 214 -> 236;
            case 215 -> 116;
            case 216 -> 98;
            case 217 -> 93;
            case 218 -> 1;
            case 219 -> 155;
            case 220 -> 102;
            case 221 -> 191;
            case 222 -> 231;
            case 223 -> 153;
            case 224 -> 164;
            case 225 -> 63;
            case 226 -> 117;
            case 227 -> 193;
            case 228 -> 242;
            case 229 -> 7;
            case 230 -> 115;
            case 231 -> 172;
            case 232 -> 159;
            case 233 -> 105;
            case 234 -> 92;
            case 235 -> 205;
            case 236 -> 22;
            case 237 -> 99;
            case 238 -> 94;
            case 239 -> 76;
            case 240 -> 21;
            case 241 -> 165;
            case 242 -> 134;
            case 243 -> 234;
            case 244 -> 122;
            case 245 -> 190;
            case 246 -> 120;
            case 247 -> 146;
            case 248 -> 204;
            case 249 -> 75;
            case 250 -> 85;
            case 251 -> 24;
            case 252 -> 125;
            case 253 -> 23;
            case 254 -> 12;
            default -> 136;
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
