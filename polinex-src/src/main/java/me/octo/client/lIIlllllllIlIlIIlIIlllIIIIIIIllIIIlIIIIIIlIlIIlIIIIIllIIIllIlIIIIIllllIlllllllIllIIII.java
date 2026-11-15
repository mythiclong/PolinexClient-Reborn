package me.octo.client;

import com.mojang.blaze3d.platform.Window;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static Minecraft lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   public static boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   public lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII() {
      short var10001 = 23549;
      short var10002 = 16601;
      var10002 = 23550;
      short var10003 = 12968;
      short var10004 = 23548;
      short var10005 = 12832;
      super(
         "Mouse Ungrab",
         "Ungrabs the mouse from Minecraft when a macro starts.",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         "Macro",
         true
      , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
   }

   @JvmStatic
   public static final void ag() {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   @JvmStatic
   public static final void ah() {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "Ú\u0015.¼>'\u001b\u008f\u0093U*â\u0001Tò,5¤\u001a\u0086\fU|\u009f\u0096þ\u0014Þ¨ÜU9?\u0013D¢}\u009aé\u0095:a¢®\u009fyùÿ\u0098\u001a=\u0004Lïê¡6·\u0088BJ¢ËÊ\u008a.Î\u0098\u001cY";
      int var4 = "Ú\u0015.¼>'\u001b\u008f\u0093U*â\u0001Tò,5¤\u001a\u0086\fU|\u009f\u0096þ\u0014Þ¨ÜU9?\u0013D¢}\u009aé\u0095:a¢®\u009fyùÿ\u0098\u001a=\u0004Lïê¡6·\u0088BJ¢ËÊ\u008a.Î\u0098\u001cY"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 14;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 17;
                     case 1 -> 2;
                     case 2 -> 103;
                     case 3 -> 17;
                     case 4 -> 76;
                     case 5 -> 78;
                     default -> 77;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[4];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = 23551;
                     short var32 = -14869;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var10;
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0080\u0018Ú½[ø-\u0093\u0088ø´ÿ\u0005nG\u0011\u0098ü";
                  var4 = "\u0080\u0018Ú½[ø-\u0093\u0088ø´ÿ\u0005nG\u0011\u0098ü".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 57;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 23551) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 248;
            case 1 -> 167;
            case 2 -> 232;
            case 3 -> 101;
            case 4 -> 137;
            case 5 -> 112;
            case 6 -> 104;
            case 7 -> 135;
            case 8 -> 48;
            case 9 -> 87;
            case 10 -> 41;
            case 11 -> 60;
            case 12 -> 130;
            case 13 -> 159;
            case 14 -> 148;
            case 15 -> 52;
            case 16 -> 223;
            case 17 -> 116;
            case 18 -> 250;
            case 19 -> 201;
            case 20 -> 142;
            case 21 -> 1;
            case 22 -> 38;
            case 23 -> 190;
            case 24 -> 113;
            case 25 -> 183;
            case 26 -> 240;
            case 27 -> 164;
            case 28 -> 106;
            case 29 -> 143;
            case 30 -> 91;
            case 31 -> 32;
            case 32 -> 203;
            case 33 -> 46;
            case 34 -> 166;
            case 35 -> 99;
            case 36 -> 227;
            case 37 -> 221;
            case 38 -> 243;
            case 39 -> 218;
            case 40 -> 189;
            case 41 -> 122;
            case 42 -> 133;
            case 43 -> 204;
            case 44 -> 79;
            case 45 -> 107;
            case 46 -> 11;
            case 47 -> 209;
            case 48 -> 206;
            case 49 -> 5;
            case 50 -> 24;
            case 51 -> 3;
            case 52 -> 25;
            case 53 -> 151;
            case 54 -> 216;
            case 55 -> 254;
            case 56 -> 210;
            case 57 -> 245;
            case 58 -> 230;
            case 59 -> 202;
            case 60 -> 238;
            case 61 -> 57;
            case 62 -> 100;
            case 63 -> 56;
            case 64 -> 125;
            case 65 -> 211;
            case 66 -> 7;
            case 67 -> 225;
            case 68 -> 229;
            case 69 -> 170;
            case 70 -> 21;
            case 71 -> 199;
            case 72 -> 152;
            case 73 -> 215;
            case 74 -> 177;
            case 75 -> 81;
            case 76 -> 109;
            case 77 -> 226;
            case 78 -> 6;
            case 79 -> 196;
            case 80 -> 233;
            case 81 -> 111;
            case 82 -> 108;
            case 83 -> 28;
            case 84 -> 157;
            case 85 -> 235;
            case 86 -> 207;
            case 87 -> 8;
            case 88 -> 178;
            case 89 -> 175;
            case 90 -> 138;
            case 91 -> 251;
            case 92 -> 76;
            case 93 -> 212;
            case 94 -> 180;
            case 95 -> 188;
            case 96 -> 255;
            case 97 -> 90;
            case 98 -> 171;
            case 99 -> 193;
            case 100 -> 234;
            case 101 -> 82;
            case 102 -> 13;
            case 103 -> 68;
            case 104 -> 131;
            case 105 -> 115;
            case 106 -> 95;
            case 107 -> 222;
            case 108 -> 103;
            case 109 -> 50;
            case 110 -> 69;
            case 111 -> 127;
            case 112 -> 10;
            case 113 -> 126;
            case 114 -> 136;
            case 115 -> 97;
            case 116 -> 185;
            case 117 -> 118;
            case 118 -> 44;
            case 119 -> 161;
            case 120 -> 146;
            case 121 -> 182;
            case 122 -> 35;
            case 123 -> 63;
            case 124 -> 165;
            case 125 -> 19;
            case 126 -> 77;
            case 127 -> 98;
            case 128 -> 65;
            case 129 -> 147;
            case 130 -> 123;
            case 131 -> 117;
            case 132 -> 145;
            case 133 -> 213;
            case 134 -> 140;
            case 135 -> 198;
            case 136 -> 47;
            case 137 -> 0;
            case 138 -> 219;
            case 139 -> 252;
            case 140 -> 88;
            case 141 -> 241;
            case 142 -> 14;
            case 143 -> 61;
            case 144 -> 92;
            case 145 -> 26;
            case 146 -> 16;
            case 147 -> 15;
            case 148 -> 40;
            case 149 -> 231;
            case 150 -> 37;
            case 151 -> 237;
            case 152 -> 110;
            case 153 -> 20;
            case 154 -> 172;
            case 155 -> 114;
            case 156 -> 45;
            case 157 -> 154;
            case 158 -> 89;
            case 159 -> 173;
            case 160 -> 169;
            case 161 -> 192;
            case 162 -> 93;
            case 163 -> 168;
            case 164 -> 102;
            case 165 -> 86;
            case 166 -> 163;
            case 167 -> 205;
            case 168 -> 244;
            case 169 -> 31;
            case 170 -> 242;
            case 171 -> 85;
            case 172 -> 120;
            case 173 -> 249;
            case 174 -> 246;
            case 175 -> 174;
            case 176 -> 30;
            case 177 -> 34;
            case 178 -> 67;
            case 179 -> 36;
            case 180 -> 51;
            case 181 -> 2;
            case 182 -> 194;
            case 183 -> 70;
            case 184 -> 150;
            case 185 -> 119;
            case 186 -> 224;
            case 187 -> 186;
            case 188 -> 197;
            case 189 -> 17;
            case 190 -> 160;
            case 191 -> 58;
            case 192 -> 94;
            case 193 -> 200;
            case 194 -> 158;
            case 195 -> 55;
            case 196 -> 78;
            case 197 -> 73;
            case 198 -> 49;
            case 199 -> 247;
            case 200 -> 72;
            case 201 -> 139;
            case 202 -> 62;
            case 203 -> 228;
            case 204 -> 156;
            case 205 -> 134;
            case 206 -> 39;
            case 207 -> 239;
            case 208 -> 4;
            case 209 -> 75;
            case 210 -> 18;
            case 211 -> 54;
            case 212 -> 96;
            case 213 -> 184;
            case 214 -> 132;
            case 215 -> 9;
            case 216 -> 187;
            case 217 -> 64;
            case 218 -> 191;
            case 219 -> 27;
            case 220 -> 217;
            case 221 -> 128;
            case 222 -> 214;
            case 223 -> 84;
            case 224 -> 208;
            case 225 -> 80;
            case 226 -> 220;
            case 227 -> 71;
            case 228 -> 153;
            case 229 -> 33;
            case 230 -> 181;
            case 231 -> 236;
            case 232 -> 23;
            case 233 -> 253;
            case 234 -> 42;
            case 235 -> 149;
            case 236 -> 29;
            case 237 -> 59;
            case 238 -> 22;
            case 239 -> 155;
            case 240 -> 176;
            case 241 -> 53;
            case 242 -> 83;
            case 243 -> 74;
            case 244 -> 12;
            case 245 -> 129;
            case 246 -> 124;
            case 247 -> 179;
            case 248 -> 66;
            case 249 -> 43;
            case 250 -> 121;
            case 251 -> 141;
            case 252 -> 144;
            case 253 -> 195;
            case 254 -> 105;
            default -> 162;
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

      private static int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @JvmStatic
      public final void a() {
         int var1 = d();
         if (var1 != 0) {
            Window var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               .getWindow();
            if (var10000 != null) {
               long var2 = var10000.handle();
               int var4 = GLFW.glfwGetInputMode(var2, 208897);
               if (var1 != 0) {
                  if (var4 == 212993) {
                     return;
                  }

                  GLFW.glfwSetInputMode(var2, 208897, 212993);
                  var4 = 1;
               }

               lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = (var4 != 0);
               return;
            }
         }
      }

      @JvmStatic
      public final void b() {
         int var1 = d();
         if (var1 != 0) {
            Window var10000 = lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               .getWindow();
            if (var10000 != null) {
               long var2 = var10000.handle();
               int var4 = GLFW.glfwGetInputMode(var2, 208897);
               if (var1 != 0) {
                  if (var4 == 212995) {
                     return;
                  }

                  GLFW.glfwSetInputMode(var2, 208897, 212995);
                  var4 = 0;
               }

               lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = (var4 != 0);
               return;
            }
         }
      }

      public static void b(int var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static int c() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public static int d() {
         int var0 = c();
         return var0 == 0 ? 83 : 0;
      }

      static {
         if (d() == 0) {
            b(67);
         }
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
    public static final net.minecraft.client.Minecraft ai() {
        return me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
    }
}
