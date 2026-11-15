package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

public abstract class llIllIIlllIIIlIIIIlIIIIIllIllIIIlIIIlllIlIllIlIIIllIllllIIlIllIIllIIllIIIlIIIIlIlllll extends Screen {
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   public llIllIIlllIIIlIIIIlIIIIIllIllIIIlIIIlllIlIllIlIIIllIllllIIlIllIIllIIllIIIlIIIIlIlllll(@NotNull Component var1) {
      short var10001 = -16849;
      short var10002 = -5296;
      Intrinsics.checkNotNullParameter(var1, "title");
      super(var1);
   }

   public boolean a(double var1, double var3, int var5) {
      return false;
   }

   public boolean b(double var1, double var3, int var5) {
      return false;
   }

   public boolean a(double var1, double var3, int var5, double var6, double var8) {
      return false;
   }

   public boolean a(int var1, int var2, int var3) {
      return false;
   }

   public boolean b(int var1, int var2, int var3) {
      return false;
   }

   public boolean a(char var1, int var2) {
      return false;
   }

   @Override
   public final boolean mouseClicked(@NotNull MouseButtonEvent var1, boolean var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = -16851;
      short var10003 = 25569;
      Intrinsics.checkNotNullParameter(var1, "click");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      boolean var4 = this.a(var1.x(), var1.y(), var1.button());
      if (var3 != null) {
         if (!var4) {
            boolean var5 = super.mouseClicked(var1, var2);
            if (var3 == null) {
               return var5;
            }

            if (!var5) {
               return false;
            }
         }

         var4 = true;
      }

      return var4;
   }

   @Override
   public final boolean mouseReleased(@NotNull MouseButtonEvent var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = -16854;
      short var10003 = -10921;
      Intrinsics.checkNotNullParameter(var1, "click");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var3 = this.b(var1.x(), var1.y(), var1.button());
      if (var2 != null) {
         if (!var3) {
            boolean var4 = super.mouseReleased(var1);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   @Override
   public final boolean mouseDragged(@NotNull MouseButtonEvent var1, double var2, double var4) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var6;
      boolean var7;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = -16851;
      short var10003 = 25569;
      Intrinsics.checkNotNullParameter(var1, "click");
      var6 = var10000;
      var7 = this.a(var1.x(), var1.y(), var1.button(), var2, var4);
      label22:
      if (var6 != null) {
         if (!var7) {
            var7 = super.mouseDragged(var1, var2, var4);
            if (var6 == null) {
               break label22;
            }

            if (!var7) {
               var7 = false;
               break label22;
            }
         }

         var7 = true;
      }

      if (var6 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var7;
   }

   @Override
   public final boolean keyPressed(@NotNull KeyEvent var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = -16850;
      short var10003 = -15883;
      Intrinsics.checkNotNullParameter(var1, "input");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var3 = this.a(var1.key(), var1.scancode(), var1.modifiers());
      if (var2 != null) {
         if (!var3) {
            boolean var4 = super.keyPressed(var1);
            if (var2 == null) {
               return var4;
            }

            if (!var4) {
               return false;
            }
         }

         var3 = true;
      }

      return var3;
   }

   @Override
   public final boolean keyReleased(@NotNull KeyEvent var1) {
      boolean var3;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = b();
      short var10002 = -16850;
      short var10003 = -15883;
      Intrinsics.checkNotNullParameter(var1, "input");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      var3 = this.b(var1.key(), var1.scancode(), var1.modifiers());
      label22:
      if (var2 != null) {
         if (!var3) {
            var3 = super.keyReleased(var1);
            if (var2 == null) {
               break label22;
            }

            if (!var3) {
               var3 = false;
               break label22;
            }
         }

         var3 = true;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]);
      }

      return var3;
   }

   @Override
   public final boolean charTyped(@NotNull CharacterEvent var1) {
      // Restored from the original bytecode (offsets 17-95): the obfuscator's guard
      // (b()) is non-null at runtime, so the live path is the one that forwards the
      // character to this.a(char, int). The decompiled null branch returned early and
      // swallowed every keystroke, which is why mod text fields never received input.
      Intrinsics.checkNotNullParameter(var1, "input");
      if (!var1.isAllowedChatCharacter()) {
         return super.charTyped(var1);
      }

      char[] var2 = Character.toChars(var1.codepoint());
      if (var2.length != 1) {
         return super.charTyped(var1);
      }

      return this.a(var2[0], 0) || super.charTyped(var1);
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] b() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[5];
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1];
      int var3 = 0;
      String var2 = "ºra»ì\u0005Î\u007fUäÿ\u0005_\u0017Ý\u0017{";
      int var4 = "ºra»ì\u0005Î\u007fUäÿ\u0005_\u0017Ý\u0017{".length();
      char var1 = 5;
      b(var10000);
      int var8 = -1;

      label52:
while (true) {
         byte var9 = 102;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 22;
                     case 1 -> 21;
                     case 2 -> 106;
                     case 3 -> 43;
                     case 4 -> 45;
                     case 5 -> 83;
                     default -> 104;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[5];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\\Òþê+\u0005ìfè|é";
                  var4 = "\\Òþê+\u0005ìfè|é".length();
                  var1 = 5;
                  var8 = -1;
            }

            var9 = 60;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -16850) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 15;
            case 1 -> 148;
            case 2 -> 224;
            case 3 -> 107;
            case 4 -> 46;
            case 5 -> 241;
            case 6 -> 187;
            case 7 -> 100;
            case 8 -> 93;
            case 9 -> 79;
            case 10 -> 56;
            case 11 -> 43;
            case 12 -> 35;
            case 13 -> 164;
            case 14 -> 109;
            case 15 -> 169;
            case 16 -> 162;
            case 17 -> 146;
            case 18 -> 24;
            case 19 -> 239;
            case 20 -> 1;
            case 21 -> 234;
            case 22 -> 117;
            case 23 -> 55;
            case 24 -> 106;
            case 25 -> 180;
            case 26 -> 202;
            case 27 -> 57;
            case 28 -> 236;
            case 29 -> 254;
            case 30 -> 52;
            case 31 -> 39;
            case 32 -> 119;
            case 33 -> 29;
            case 34 -> 16;
            case 35 -> 217;
            case 36 -> 131;
            case 37 -> 248;
            case 38 -> 244;
            case 39 -> 198;
            case 40 -> 14;
            case 41 -> 220;
            case 42 -> 215;
            case 43 -> 67;
            case 44 -> 2;
            case 45 -> 136;
            case 46 -> 219;
            case 47 -> 185;
            case 48 -> 235;
            case 49 -> 77;
            case 50 -> 70;
            case 51 -> 9;
            case 52 -> 126;
            case 53 -> 175;
            case 54 -> 157;
            case 55 -> 214;
            case 56 -> 229;
            case 57 -> 30;
            case 58 -> 115;
            case 59 -> 168;
            case 60 -> 36;
            case 61 -> 166;
            case 62 -> 114;
            case 63 -> 179;
            case 64 -> 21;
            case 65 -> 245;
            case 66 -> 132;
            case 67 -> 78;
            case 68 -> 68;
            case 69 -> 112;
            case 70 -> 58;
            case 71 -> 90;
            case 72 -> 7;
            case 73 -> 133;
            case 74 -> 174;
            case 75 -> 250;
            case 76 -> 137;
            case 77 -> 151;
            case 78 -> 190;
            case 79 -> 243;
            case 80 -> 49;
            case 81 -> 135;
            case 82 -> 23;
            case 83 -> 128;
            case 84 -> 92;
            case 85 -> 249;
            case 86 -> 18;
            case 87 -> 240;
            case 88 -> 121;
            case 89 -> 139;
            case 90 -> 51;
            case 91 -> 47;
            case 92 -> 150;
            case 93 -> 177;
            case 94 -> 11;
            case 95 -> 28;
            case 96 -> 165;
            case 97 -> 163;
            case 98 -> 213;
            case 99 -> 205;
            case 100 -> 83;
            case 101 -> 222;
            case 102 -> 183;
            case 103 -> 20;
            case 104 -> 186;
            case 105 -> 42;
            case 106 -> 145;
            case 107 -> 228;
            case 108 -> 231;
            case 109 -> 159;
            case 110 -> 124;
            case 111 -> 118;
            case 112 -> 8;
            case 113 -> 192;
            case 114 -> 50;
            case 115 -> 122;
            case 116 -> 209;
            case 117 -> 120;
            case 118 -> 204;
            case 119 -> 102;
            case 120 -> 142;
            case 121 -> 98;
            case 122 -> 171;
            case 123 -> 0;
            case 124 -> 44;
            case 125 -> 172;
            case 126 -> 32;
            case 127 -> 226;
            case 128 -> 182;
            case 129 -> 247;
            case 130 -> 152;
            case 131 -> 60;
            case 132 -> 161;
            case 133 -> 191;
            case 134 -> 59;
            case 135 -> 37;
            case 136 -> 141;
            case 137 -> 211;
            case 138 -> 153;
            case 139 -> 232;
            case 140 -> 72;
            case 141 -> 212;
            case 142 -> 188;
            case 143 -> 110;
            case 144 -> 31;
            case 145 -> 54;
            case 146 -> 242;
            case 147 -> 65;
            case 148 -> 195;
            case 149 -> 201;
            case 150 -> 73;
            case 151 -> 61;
            case 152 -> 105;
            case 153 -> 129;
            case 154 -> 255;
            case 155 -> 156;
            case 156 -> 88;
            case 157 -> 233;
            case 158 -> 108;
            case 159 -> 155;
            case 160 -> 253;
            case 161 -> 81;
            case 162 -> 196;
            case 163 -> 87;
            case 164 -> 75;
            case 165 -> 203;
            case 166 -> 96;
            case 167 -> 104;
            case 168 -> 45;
            case 169 -> 149;
            case 170 -> 97;
            case 171 -> 144;
            case 172 -> 22;
            case 173 -> 25;
            case 174 -> 197;
            case 175 -> 48;
            case 176 -> 252;
            case 177 -> 27;
            case 178 -> 38;
            case 179 -> 173;
            case 180 -> 74;
            case 181 -> 154;
            case 182 -> 199;
            case 183 -> 26;
            case 184 -> 246;
            case 185 -> 33;
            case 186 -> 13;
            case 187 -> 216;
            case 188 -> 237;
            case 189 -> 103;
            case 190 -> 134;
            case 191 -> 85;
            case 192 -> 127;
            case 193 -> 138;
            case 194 -> 10;
            case 195 -> 193;
            case 196 -> 227;
            case 197 -> 208;
            case 198 -> 178;
            case 199 -> 194;
            case 200 -> 3;
            case 201 -> 12;
            case 202 -> 82;
            case 203 -> 181;
            case 204 -> 63;
            case 205 -> 140;
            case 206 -> 62;
            case 207 -> 99;
            case 208 -> 76;
            case 209 -> 53;
            case 210 -> 40;
            case 211 -> 69;
            case 212 -> 95;
            case 213 -> 123;
            case 214 -> 5;
            case 215 -> 80;
            case 216 -> 221;
            case 217 -> 17;
            case 218 -> 143;
            case 219 -> 94;
            case 220 -> 4;
            case 221 -> 158;
            case 222 -> 34;
            case 223 -> 147;
            case 224 -> 86;
            case 225 -> 223;
            case 226 -> 170;
            case 227 -> 184;
            case 228 -> 167;
            case 229 -> 160;
            case 230 -> 230;
            case 231 -> 176;
            case 232 -> 66;
            case 233 -> 130;
            case 234 -> 111;
            case 235 -> 125;
            case 236 -> 225;
            case 237 -> 206;
            case 238 -> 113;
            case 239 -> 89;
            case 240 -> 207;
            case 241 -> 64;
            case 242 -> 71;
            case 243 -> 84;
            case 244 -> 189;
            case 245 -> 41;
            case 246 -> 238;
            case 247 -> 6;
            case 248 -> 218;
            case 249 -> 200;
            case 250 -> 210;
            case 251 -> 101;
            case 252 -> 91;
            case 253 -> 19;
            case 254 -> 251;
            default -> 116;
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
