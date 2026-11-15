package me.octo.client;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class IlIllIlIIlIIIIllllIIIIIllIllIlIlIIlIIIIlIIlIIIIIIlIIIIIllIIllIlIllIlIlllIllIIIllIlIII {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public IlIllIlIIlIIIIllllIIIIIllIllIlIlIIlIIIIlIIlIIIIIIlIIIIIllIIllIlIllIlIlllIllIIIllIlIII() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = 6959;
      short var10004 = 26569;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 250L;
   }

   @Export
   public final void a(@NotNull String var1) {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      short var10002 = 6954;
      short var10003 = -16840;
      Intrinsics.checkNotNullParameter(var1, "text");
      long var3 = System.currentTimeMillis();
      String[] var2 = var10000;
      if (var2 != null) {
         if (var3 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            < this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            return;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var1);
      }
   }

   @Export
   public final int a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getFps();
   }

   @Export
   public final boolean b() {
      String[] var1 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      int var10000 = GLFW.glfwGetMouseButton(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().handle(), 0);
      if (var1 != null) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   @Export
   public final boolean c() {
      String[] var1 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      int var10000 = GLFW.glfwGetMouseButton(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().handle(), 1);
      if (var1 != null) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   @Export
   public final boolean a(int var1) {
      String[] var2 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      int var10000 = GLFW.glfwGetKey(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().handle(), var1);
      if (var2 != null) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   @Export
   @NotNull
   public final String d() {
      String[] var1 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      if (var1 != null) {
         ServerData var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getCurrentServer();
         if (var10000 != null && var10000.ip != null) {
            return var10000.ip;
         }
      }

      short var3 = 6958;
      short var10001 = -30131;
      return "singleplayer";
   }

   @Export
   public final boolean e() {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      String var10001 = this.d().toLowerCase(Locale.ROOT);
      short var10003 = 6953;
      short var10004 = 18314;
      Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
      String var2 = var10001;
      String[] var1 = var10000;
      CharSequence var3 = var2;
      short var6 = 6955;
      short var10002 = 20911;
      boolean var4 = StringsKt.contains(var3, "hypixel.net", false);
      if (var1 != null) {
         if (!var4) {
            CharSequence var5 = var2;
            short var7 = 6957;
            var10002 = -10089;
            boolean var9 = StringsKt.contains(var5, "hypixel.io", false);
            if (var1 == null) {
               return var9;
            }

            if (!var9) {
               return false;
            }
         }

         var4 = true;
      }

      return var4;
   }

   @Export
   public final boolean f() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
   }

   @Export
   @NotNull
   public final String g() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .name();
   }

   @Export
   public final boolean b(@NotNull String var1) {
      short var10001 = 6956;
      short var10002 = 26329;
      Intrinsics.checkNotNullParameter(var1, "locationName");

      boolean var2;
      try {
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10000 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         String var5 = var1.toUpperCase(Locale.ROOT);
         short var10003 = 6952;
         short var10004 = -20968;
         Intrinsics.checkNotNullExpressionValue(var5, "toUpperCase(...)");
         var2 = var10000 == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(var5);
      } catch (Exception var4) {
         var2 = false;
      }

      return var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "U\u0082ä\u008cÊnj\u0088\u009f¨õù½\u0003½-\u0010_g¼/üæK\u0099»\u008aq½-\u008b¯<\u0004Ã2\u001bÕ\u000btez½\u0090r6fÆ£!\fì\u001aþ\u008e}\u0011\u0005ÇãÛ¸\u008a\nÏy\r>~\u0002ëhzh";
      int var4 = "U\u0082ä\u008cÊnj\u0088\u009f¨õù½\u0003½-\u0010_g¼/üæK\u0099»\u008aq½-\u008b¯<\u0004Ã2\u001bÕ\u000btez½\u0090r6fÆ£!\fì\u001aþ\u008e}\u0011\u0005ÇãÛ¸\u008a\nÏy\r>~\u0002ëhzh"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 7;
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
                     case 0 -> 104;
                     case 1 -> 14;
                     case 2 -> 11;
                     case 3 -> 8;
                     case 4 -> 95;
                     case 5 -> 2;
                     default -> 51;
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
                     b = new String[8];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Fuc\u009aC`ÿ_V«õ±\u0010\u001cÚ¤ÌàWÍ`\u009bú¢\u0098n\u0016þ¶";
                  var4 = "Fuc\u009aC`ÿ_V«õ±\u0010\u001cÚ¤ÌàWÍ`\u009bú¢\u0098n\u0016þ¶".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 84;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 6952) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 216;
            case 1 -> 21;
            case 2 -> 48;
            case 3 -> 62;
            case 4 -> 136;
            case 5 -> 150;
            case 6 -> 139;
            case 7 -> 106;
            case 8 -> 1;
            case 9 -> 33;
            case 10 -> 153;
            case 11 -> 117;
            case 12 -> 154;
            case 13 -> 251;
            case 14 -> 193;
            case 15 -> 166;
            case 16 -> 100;
            case 17 -> 16;
            case 18 -> 198;
            case 19 -> 227;
            case 20 -> 235;
            case 21 -> 90;
            case 22 -> 125;
            case 23 -> 177;
            case 24 -> 14;
            case 25 -> 159;
            case 26 -> 225;
            case 27 -> 60;
            case 28 -> 109;
            case 29 -> 236;
            case 30 -> 129;
            case 31 -> 69;
            case 32 -> 130;
            case 33 -> 228;
            case 34 -> 84;
            case 35 -> 27;
            case 36 -> 226;
            case 37 -> 163;
            case 38 -> 19;
            case 39 -> 8;
            case 40 -> 34;
            case 41 -> 41;
            case 42 -> 178;
            case 43 -> 126;
            case 44 -> 175;
            case 45 -> 85;
            case 46 -> 169;
            case 47 -> 174;
            case 48 -> 70;
            case 49 -> 49;
            case 50 -> 167;
            case 51 -> 10;
            case 52 -> 206;
            case 53 -> 43;
            case 54 -> 244;
            case 55 -> 233;
            case 56 -> 54;
            case 57 -> 102;
            case 58 -> 202;
            case 59 -> 188;
            case 60 -> 131;
            case 61 -> 133;
            case 62 -> 72;
            case 63 -> 181;
            case 64 -> 241;
            case 65 -> 75;
            case 66 -> 204;
            case 67 -> 26;
            case 68 -> 238;
            case 69 -> 104;
            case 70 -> 110;
            case 71 -> 255;
            case 72 -> 209;
            case 73 -> 217;
            case 74 -> 147;
            case 75 -> 187;
            case 76 -> 77;
            case 77 -> 0;
            case 78 -> 184;
            case 79 -> 45;
            case 80 -> 148;
            case 81 -> 211;
            case 82 -> 197;
            case 83 -> 115;
            case 84 -> 24;
            case 85 -> 35;
            case 86 -> 53;
            case 87 -> 200;
            case 88 -> 252;
            case 89 -> 145;
            case 90 -> 254;
            case 91 -> 11;
            case 92 -> 59;
            case 93 -> 138;
            case 94 -> 231;
            case 95 -> 92;
            case 96 -> 237;
            case 97 -> 40;
            case 98 -> 199;
            case 99 -> 44;
            case 100 -> 105;
            case 101 -> 94;
            case 102 -> 218;
            case 103 -> 67;
            case 104 -> 220;
            case 105 -> 232;
            case 106 -> 50;
            case 107 -> 65;
            case 108 -> 4;
            case 109 -> 124;
            case 110 -> 186;
            case 111 -> 247;
            case 112 -> 91;
            case 113 -> 76;
            case 114 -> 39;
            case 115 -> 87;
            case 116 -> 108;
            case 117 -> 243;
            case 118 -> 230;
            case 119 -> 168;
            case 120 -> 176;
            case 121 -> 132;
            case 122 -> 68;
            case 123 -> 78;
            case 124 -> 25;
            case 125 -> 229;
            case 126 -> 28;
            case 127 -> 79;
            case 128 -> 250;
            case 129 -> 122;
            case 130 -> 137;
            case 131 -> 234;
            case 132 -> 121;
            case 133 -> 141;
            case 134 -> 240;
            case 135 -> 99;
            case 136 -> 142;
            case 137 -> 194;
            case 138 -> 36;
            case 139 -> 119;
            case 140 -> 152;
            case 141 -> 23;
            case 142 -> 246;
            case 143 -> 97;
            case 144 -> 208;
            case 145 -> 210;
            case 146 -> 127;
            case 147 -> 242;
            case 148 -> 182;
            case 149 -> 52;
            case 150 -> 22;
            case 151 -> 183;
            case 152 -> 146;
            case 153 -> 155;
            case 154 -> 2;
            case 155 -> 86;
            case 156 -> 17;
            case 157 -> 89;
            case 158 -> 83;
            case 159 -> 114;
            case 160 -> 207;
            case 161 -> 179;
            case 162 -> 9;
            case 163 -> 74;
            case 164 -> 66;
            case 165 -> 113;
            case 166 -> 98;
            case 167 -> 143;
            case 168 -> 219;
            case 169 -> 165;
            case 170 -> 18;
            case 171 -> 245;
            case 172 -> 96;
            case 173 -> 201;
            case 174 -> 123;
            case 175 -> 134;
            case 176 -> 38;
            case 177 -> 80;
            case 178 -> 161;
            case 179 -> 253;
            case 180 -> 205;
            case 181 -> 32;
            case 182 -> 162;
            case 183 -> 222;
            case 184 -> 3;
            case 185 -> 173;
            case 186 -> 58;
            case 187 -> 135;
            case 188 -> 140;
            case 189 -> 151;
            case 190 -> 7;
            case 191 -> 239;
            case 192 -> 191;
            case 193 -> 71;
            case 194 -> 42;
            case 195 -> 6;
            case 196 -> 213;
            case 197 -> 64;
            case 198 -> 73;
            case 199 -> 37;
            case 200 -> 20;
            case 201 -> 81;
            case 202 -> 111;
            case 203 -> 112;
            case 204 -> 195;
            case 205 -> 47;
            case 206 -> 88;
            case 207 -> 13;
            case 208 -> 214;
            case 209 -> 31;
            case 210 -> 157;
            case 211 -> 51;
            case 212 -> 46;
            case 213 -> 12;
            case 214 -> 82;
            case 215 -> 248;
            case 216 -> 149;
            case 217 -> 55;
            case 218 -> 120;
            case 219 -> 93;
            case 220 -> 203;
            case 221 -> 192;
            case 222 -> 249;
            case 223 -> 116;
            case 224 -> 15;
            case 225 -> 5;
            case 226 -> 30;
            case 227 -> 160;
            case 228 -> 61;
            case 229 -> 57;
            case 230 -> 224;
            case 231 -> 63;
            case 232 -> 144;
            case 233 -> 196;
            case 234 -> 107;
            case 235 -> 118;
            case 236 -> 170;
            case 237 -> 190;
            case 238 -> 215;
            case 239 -> 101;
            case 240 -> 185;
            case 241 -> 95;
            case 242 -> 189;
            case 243 -> 103;
            case 244 -> 172;
            case 245 -> 158;
            case 246 -> 212;
            case 247 -> 221;
            case 248 -> 171;
            case 249 -> 29;
            case 250 -> 156;
            case 251 -> 223;
            case 252 -> 56;
            case 253 -> 180;
            case 254 -> 164;
            default -> 128;
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
