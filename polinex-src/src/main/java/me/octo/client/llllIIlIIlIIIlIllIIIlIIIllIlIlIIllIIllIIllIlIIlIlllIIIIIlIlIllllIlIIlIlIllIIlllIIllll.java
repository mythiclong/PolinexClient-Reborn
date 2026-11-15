package me.octo.client;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI
public final class llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll(Object... px) {
        }
        // PX-RESTORED no-arg ctor (jar <init>()V, access 0x1; javap -c -> aload_0 / invokespecial java/lang/Object.<init>:()V / return)
        public llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll() {
        }

   private static String[] a;
   private static String[] b;

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -23100;
      short var10002 = 12096;
      var10002 = -23102;
      short var10003 = 18723;
      var10000 = var10000.a("breakscreen", "Preview the scheduler break screen");
      var10001 = -23097;
      var10002 = 9748;
      return var10000.a("simbreak").a(llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll::a).a();
   }

   private static final void a(Minecraft var0) {
      var0.setScreen(new lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI(true));
   }

   private static final Unit a(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      short var10001 = -23098;
      short var10002 = 9168;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      Minecraft var10000 = Minecraft.getInstance();
      var10002 = -23099;
      short var10003 = 10333;
      Intrinsics.checkNotNullExpressionValue(var10000, "getInstance(...)");
      Minecraft var1 = var10000;
      short var2 = -23101;
      var1.execute(null);
      var10001 = -12534;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7Opening simulated break screen…");
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "5|kÐ×ìî\u0013<?¼þ\b\u0013J\n\u009e\u0099Ð\u0003ß\u000bÇ³«Ú½-¿\u00adâô\n\u0010\u009f÷\u0014\u008f|ª5NMÿ\u009e²|8-º";
      int var4 = "5|kÐ×ìî\u0013<?¼þ\b\u0013J\n\u009e\u0099Ð\u0003ß\u000bÇ³«Ú½-¿\u00adâô\n\u0010\u009f÷\u0014\u008f|ª5NMÿ\u009e²|8-º".length();
      char var1 = '\f';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 22;
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
                     case 0 -> 20;
                     case 1 -> 65;
                     case 2 -> 78;
                     case 3 -> 13;
                     case 4 -> 119;
                     case 5 -> 61;
                     default -> 87;
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
                     b = new String[6];
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

                  var2 = ";j7\u0081[ÒB£\u00adW¬²\u0010\u000bg\u0003\u0082ZÉÊ° @-Åå%ËÁ68*CÝ!èân{\u0013@ØÕ0Vx\u009a@x´½l\u0019\u000eõQøi-\tÕkç\u0012\u009etò⁼";
                  var4 = ";j7\u0081[ÒB£\u00adW¬²\u0010\u000bg\u0003\u0082ZÉÊ° @-Åå%ËÁ68*CÝ!èân{\u0013@ØÕ0Vx\u009a@x´½l\u0019\u000eõQøi-\tÕkç\u0012\u009etò⁼"
                     .length();
                  var1 = '"';
                  var8 = -1;
            }

            var10000 = 110;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -23098) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 33;
            case 1 -> 235;
            case 2 -> 219;
            case 3 -> 113;
            case 4 -> 162;
            case 5 -> 212;
            case 6 -> 247;
            case 7 -> 111;
            case 8 -> 210;
            case 9 -> 142;
            case 10 -> 38;
            case 11 -> 25;
            case 12 -> 246;
            case 13 -> 56;
            case 14 -> 35;
            case 15 -> 174;
            case 16 -> 243;
            case 17 -> 178;
            case 18 -> 4;
            case 19 -> 226;
            case 20 -> 123;
            case 21 -> 86;
            case 22 -> 55;
            case 23 -> 199;
            case 24 -> 209;
            case 25 -> 136;
            case 26 -> 24;
            case 27 -> 14;
            case 28 -> 41;
            case 29 -> 137;
            case 30 -> 15;
            case 31 -> 155;
            case 32 -> 240;
            case 33 -> 97;
            case 34 -> 72;
            case 35 -> 42;
            case 36 -> 139;
            case 37 -> 63;
            case 38 -> 204;
            case 39 -> 103;
            case 40 -> 50;
            case 41 -> 129;
            case 42 -> 242;
            case 43 -> 65;
            case 44 -> 165;
            case 45 -> 230;
            case 46 -> 192;
            case 47 -> 186;
            case 48 -> 135;
            case 49 -> 217;
            case 50 -> 195;
            case 51 -> 122;
            case 52 -> 169;
            case 53 -> 80;
            case 54 -> 211;
            case 55 -> 197;
            case 56 -> 61;
            case 57 -> 23;
            case 58 -> 138;
            case 59 -> 250;
            case 60 -> 27;
            case 61 -> 95;
            case 62 -> 37;
            case 63 -> 84;
            case 64 -> 152;
            case 65 -> 18;
            case 66 -> 187;
            case 67 -> 132;
            case 68 -> 145;
            case 69 -> 189;
            case 70 -> 203;
            case 71 -> 205;
            case 72 -> 143;
            case 73 -> 150;
            case 74 -> 62;
            case 75 -> 236;
            case 76 -> 52;
            case 77 -> 168;
            case 78 -> 140;
            case 79 -> 70;
            case 80 -> 245;
            case 81 -> 253;
            case 82 -> 48;
            case 83 -> 167;
            case 84 -> 164;
            case 85 -> 108;
            case 86 -> 119;
            case 87 -> 202;
            case 88 -> 1;
            case 89 -> 206;
            case 90 -> 208;
            case 91 -> 146;
            case 92 -> 82;
            case 93 -> 156;
            case 94 -> 151;
            case 95 -> 106;
            case 96 -> 198;
            case 97 -> 115;
            case 98 -> 251;
            case 99 -> 207;
            case 100 -> 39;
            case 101 -> 47;
            case 102 -> 120;
            case 103 -> 78;
            case 104 -> 171;
            case 105 -> 58;
            case 106 -> 21;
            case 107 -> 144;
            case 108 -> 159;
            case 109 -> 100;
            case 110 -> 134;
            case 111 -> 32;
            case 112 -> 96;
            case 113 -> 83;
            case 114 -> 69;
            case 115 -> 102;
            case 116 -> 110;
            case 117 -> 90;
            case 118 -> 44;
            case 119 -> 220;
            case 120 -> 60;
            case 121 -> 218;
            case 122 -> 223;
            case 123 -> 116;
            case 124 -> 176;
            case 125 -> 68;
            case 126 -> 126;
            case 127 -> 71;
            case 128 -> 54;
            case 129 -> 224;
            case 130 -> 53;
            case 131 -> 112;
            case 132 -> 222;
            case 133 -> 244;
            case 134 -> 185;
            case 135 -> 241;
            case 136 -> 254;
            case 137 -> 180;
            case 138 -> 237;
            case 139 -> 93;
            case 140 -> 141;
            case 141 -> 46;
            case 142 -> 79;
            case 143 -> 193;
            case 144 -> 101;
            case 145 -> 194;
            case 146 -> 213;
            case 147 -> 40;
            case 148 -> 233;
            case 149 -> 89;
            case 150 -> 147;
            case 151 -> 166;
            case 152 -> 221;
            case 153 -> 28;
            case 154 -> 57;
            case 155 -> 130;
            case 156 -> 124;
            case 157 -> 99;
            case 158 -> 249;
            case 159 -> 225;
            case 160 -> 232;
            case 161 -> 170;
            case 162 -> 8;
            case 163 -> 104;
            case 164 -> 98;
            case 165 -> 200;
            case 166 -> 67;
            case 167 -> 16;
            case 168 -> 73;
            case 169 -> 227;
            case 170 -> 190;
            case 171 -> 81;
            case 172 -> 109;
            case 173 -> 248;
            case 174 -> 94;
            case 175 -> 160;
            case 176 -> 76;
            case 177 -> 5;
            case 178 -> 74;
            case 179 -> 216;
            case 180 -> 43;
            case 181 -> 188;
            case 182 -> 173;
            case 183 -> 154;
            case 184 -> 163;
            case 185 -> 118;
            case 186 -> 238;
            case 187 -> 252;
            case 188 -> 131;
            case 189 -> 148;
            case 190 -> 6;
            case 191 -> 87;
            case 192 -> 127;
            case 193 -> 183;
            case 194 -> 2;
            case 195 -> 175;
            case 196 -> 75;
            case 197 -> 153;
            case 198 -> 26;
            case 199 -> 214;
            case 200 -> 17;
            case 201 -> 177;
            case 202 -> 181;
            case 203 -> 239;
            case 204 -> 66;
            case 205 -> 215;
            case 206 -> 12;
            case 207 -> 161;
            case 208 -> 229;
            case 209 -> 191;
            case 210 -> 0;
            case 211 -> 133;
            case 212 -> 85;
            case 213 -> 128;
            case 214 -> 231;
            case 215 -> 114;
            case 216 -> 121;
            case 217 -> 105;
            case 218 -> 196;
            case 219 -> 13;
            case 220 -> 182;
            case 221 -> 10;
            case 222 -> 107;
            case 223 -> 51;
            case 224 -> 29;
            case 225 -> 228;
            case 226 -> 49;
            case 227 -> 157;
            case 228 -> 31;
            case 229 -> 234;
            case 230 -> 149;
            case 231 -> 92;
            case 232 -> 20;
            case 233 -> 172;
            case 234 -> 255;
            case 235 -> 11;
            case 236 -> 77;
            case 237 -> 88;
            case 238 -> 91;
            case 239 -> 22;
            case 240 -> 45;
            case 241 -> 158;
            case 242 -> 201;
            case 243 -> 19;
            case 244 -> 125;
            case 245 -> 179;
            case 246 -> 64;
            case 247 -> 184;
            case 248 -> 34;
            case 249 -> 3;
            case 250 -> 7;
            case 251 -> 9;
            case 252 -> 117;
            case 253 -> 36;
            case 254 -> 59;
            default -> 30;
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
