package me.octo.client.utils;

import kotlin.jvm.internal.FloatSpreadBuilder;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public final class llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl {
    public static <T> T withStyle(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   public static llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl() {
   }

   public final boolean a(char param1) {
      return param1 >= 32 && param1 != 127;
   }

   public final boolean a(int param1) {
      return param1 == 86 && this.b();
   }

   @NotNull
   public final String a() {
      try {
         String var1 = Minecraft.getInstance().keyboardHandler.getClipboard();
         return var1 != null ? var1 : "";
      } catch (Exception var2) {
         return "";
      }
   }

   public final void a(@NotNull String var1) {
      short var10001 = -15561;
      short var10002 = 6129;
      Intrinsics.checkNotNullParameter(var1, "text");

      try {
         GLFW.glfwSetClipboardString(Minecraft.getInstance().getWindow().handle(), var1);
      } catch (Exception var3) {
      }
   }

   private final boolean b() {
      return GLFW.glfwGetKey(Minecraft.getInstance().getWindow().handle(), 341) == 1 || GLFW.glfwGetKey(Minecraft.getInstance().getWindow().handle(), 345) == 1;
   }

   public final boolean b(int param1) {
      return param1 == 65 && this.b();
   }

   public final boolean c(int param1) {
      return param1 == 88 && this.b();
   }

   public final boolean d(int param1) {
      return param1 == 67 && this.b();
   }

   @NotNull
   public final float[] a(@NotNull float[] var1, @NotNull float[] var2) {
      short var10001 = -15567;
      short var10002 = 31054;
      Intrinsics.checkNotNullParameter(var1, "arr1");
      var10001 = -15557;
      var10002 = -15207;
      Intrinsics.checkNotNullParameter(var2, "arr2");
      FloatSpreadBuilder var3 = new FloatSpreadBuilder(2);
      var3.addSpread(var1);
      var3.addSpread(var2);
      return var3.toArray();
   }

   @NotNull
   public final <T> T[] a(@NotNull T[] arr1, @NotNull T[] arr2) {
      boolean var3 = false;
      kotlin.jvm.internal.SpreadBuilder var4 = new kotlin.jvm.internal.SpreadBuilder(2);
      var4.addSpread(arr1);
      var4.addSpread(arr2);
      return (T[])((Object[])var4.toArray(new Object[var4.size()]));
   }

   @NotNull
   public final <T> T[] a(@NotNull T[][] bigArr) {
      int var2 = 0;

      for (T[] var3 : bigArr) {
         var2 += var3.length;
      }

      Object[] var4 = new Object[var2];
      int var5 = 0;

      for (T[] var6 : bigArr) {
         for (T var7 : var6) {
            var4[var5++] = var7;
         }
      }

      return (T[])(var4);
   }

   @NotNull
   public final <T> T[] a(@NotNull T[] arr, @NotNull T var2) {
      boolean var3 = false;
      return (T[])((Object[])kotlin.collections.ArraysKt.plus(arr, var2));
   }

   @NotNull
   public final <T> T[] b(@NotNull T[] fullArray, @NotNull T... removed) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullArray, "fullArray");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removed, "removed");
      java.util.Collection<Object> result = new java.util.ArrayList<Object>();
      Object[] source = (Object[]) fullArray;
      int length = source.length;
      int index = 0;
      while (index < length) {
         Object element = source[index];
         if (!kotlin.collections.ArraysKt.contains(removed, element)) {
            result.add(element);
         }

         index++;
      }

      kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
      return (T[]) ((java.util.Collection) (Object) ((java.util.Collection) (Object) result)).toArray(new Object[0]);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = ")û§ß\t\u0093´\t\u008fp±`\u001eÊ\u0002\u0002<\u0004\u0005©\"\u0096\u0006<[sÀfÐ\u0004\u001d\u0084\u009c\u0083\u0007ëý\u0091·uÂ\u0007\u0004§\u007fvL";
      int var4 = ")û§ß\t\u0093´\t\u008fp±`\u001eÊ\u0002\u0002<\u0004\u0005©\"\u0096\u0006<[sÀfÐ\u0004\u001d\u0084\u009c\u0083\u0007ëý\u0091·uÂ\u0007\u0004§\u007fvL"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 78;
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
                     case 0 -> 89;
                     case 1 -> 11;
                     case 2 -> 17;
                     case 3 -> 72;
                     case 4 -> 84;
                     case 5 -> 93;
                     default -> 120;
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
                     b = new String[10];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "PÁè\u0004ãy\u009eï";
                  var4 = "PÁè\u0004ãy\u009eï".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 7;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -15566) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 228;
            case 1 -> 51;
            case 2 -> 68;
            case 3 -> 59;
            case 4 -> 213;
            case 5 -> 8;
            case 6 -> 92;
            case 7 -> 18;
            case 8 -> 46;
            case 9 -> 139;
            case 10 -> 115;
            case 11 -> 28;
            case 12 -> 86;
            case 13 -> 95;
            case 14 -> 185;
            case 15 -> 116;
            case 16 -> 147;
            case 17 -> 215;
            case 18 -> 219;
            case 19 -> 151;
            case 20 -> 111;
            case 21 -> 248;
            case 22 -> 70;
            case 23 -> 216;
            case 24 -> 13;
            case 25 -> 0;
            case 26 -> 227;
            case 27 -> 34;
            case 28 -> 10;
            case 29 -> 131;
            case 30 -> 136;
            case 31 -> 192;
            case 32 -> 162;
            case 33 -> 57;
            case 34 -> 247;
            case 35 -> 253;
            case 36 -> 58;
            case 37 -> 23;
            case 38 -> 121;
            case 39 -> 89;
            case 40 -> 32;
            case 41 -> 123;
            case 42 -> 199;
            case 43 -> 3;
            case 44 -> 156;
            case 45 -> 211;
            case 46 -> 94;
            case 47 -> 61;
            case 48 -> 166;
            case 49 -> 172;
            case 50 -> 220;
            case 51 -> 71;
            case 52 -> 82;
            case 53 -> 106;
            case 54 -> 210;
            case 55 -> 252;
            case 56 -> 49;
            case 57 -> 201;
            case 58 -> 38;
            case 59 -> 1;
            case 60 -> 254;
            case 61 -> 27;
            case 62 -> 45;
            case 63 -> 159;
            case 64 -> 134;
            case 65 -> 90;
            case 66 -> 29;
            case 67 -> 66;
            case 68 -> 78;
            case 69 -> 102;
            case 70 -> 144;
            case 71 -> 72;
            case 72 -> 114;
            case 73 -> 184;
            case 74 -> 187;
            case 75 -> 167;
            case 76 -> 191;
            case 77 -> 26;
            case 78 -> 163;
            case 79 -> 81;
            case 80 -> 20;
            case 81 -> 62;
            case 82 -> 64;
            case 83 -> 223;
            case 84 -> 173;
            case 85 -> 37;
            case 86 -> 84;
            case 87 -> 250;
            case 88 -> 158;
            case 89 -> 214;
            case 90 -> 242;
            case 91 -> 176;
            case 92 -> 4;
            case 93 -> 198;
            case 94 -> 207;
            case 95 -> 19;
            case 96 -> 244;
            case 97 -> 87;
            case 98 -> 212;
            case 99 -> 181;
            case 100 -> 65;
            case 101 -> 103;
            case 102 -> 126;
            case 103 -> 205;
            case 104 -> 42;
            case 105 -> 2;
            case 106 -> 91;
            case 107 -> 31;
            case 108 -> 182;
            case 109 -> 5;
            case 110 -> 47;
            case 111 -> 208;
            case 112 -> 142;
            case 113 -> 194;
            case 114 -> 33;
            case 115 -> 249;
            case 116 -> 53;
            case 117 -> 152;
            case 118 -> 125;
            case 119 -> 54;
            case 120 -> 17;
            case 121 -> 104;
            case 122 -> 119;
            case 123 -> 50;
            case 124 -> 193;
            case 125 -> 30;
            case 126 -> 120;
            case 127 -> 137;
            case 128 -> 133;
            case 129 -> 236;
            case 130 -> 153;
            case 131 -> 39;
            case 132 -> 77;
            case 133 -> 122;
            case 134 -> 14;
            case 135 -> 150;
            case 136 -> 165;
            case 137 -> 98;
            case 138 -> 178;
            case 139 -> 154;
            case 140 -> 15;
            case 141 -> 6;
            case 142 -> 204;
            case 143 -> 127;
            case 144 -> 99;
            case 145 -> 146;
            case 146 -> 85;
            case 147 -> 135;
            case 148 -> 202;
            case 149 -> 117;
            case 150 -> 233;
            case 151 -> 190;
            case 152 -> 108;
            case 153 -> 112;
            case 154 -> 170;
            case 155 -> 235;
            case 156 -> 197;
            case 157 -> 44;
            case 158 -> 180;
            case 159 -> 132;
            case 160 -> 25;
            case 161 -> 41;
            case 162 -> 177;
            case 163 -> 243;
            case 164 -> 200;
            case 165 -> 36;
            case 166 -> 11;
            case 167 -> 12;
            case 168 -> 161;
            case 169 -> 101;
            case 170 -> 79;
            case 171 -> 74;
            case 172 -> 63;
            case 173 -> 188;
            case 174 -> 230;
            case 175 -> 217;
            case 176 -> 129;
            case 177 -> 195;
            case 178 -> 7;
            case 179 -> 245;
            case 180 -> 246;
            case 181 -> 148;
            case 182 -> 143;
            case 183 -> 48;
            case 184 -> 238;
            case 185 -> 97;
            case 186 -> 16;
            case 187 -> 225;
            case 188 -> 124;
            case 189 -> 189;
            case 190 -> 168;
            case 191 -> 140;
            case 192 -> 186;
            case 193 -> 229;
            case 194 -> 67;
            case 195 -> 75;
            case 196 -> 224;
            case 197 -> 171;
            case 198 -> 88;
            case 199 -> 232;
            case 200 -> 179;
            case 201 -> 93;
            case 202 -> 22;
            case 203 -> 83;
            case 204 -> 164;
            case 205 -> 55;
            case 206 -> 60;
            case 207 -> 109;
            case 208 -> 218;
            case 209 -> 145;
            case 210 -> 237;
            case 211 -> 157;
            case 212 -> 255;
            case 213 -> 40;
            case 214 -> 203;
            case 215 -> 107;
            case 216 -> 56;
            case 217 -> 9;
            case 218 -> 160;
            case 219 -> 169;
            case 220 -> 149;
            case 221 -> 222;
            case 222 -> 113;
            case 223 -> 239;
            case 224 -> 141;
            case 225 -> 196;
            case 226 -> 138;
            case 227 -> 76;
            case 228 -> 128;
            case 229 -> 118;
            case 230 -> 130;
            case 231 -> 174;
            case 232 -> 21;
            case 233 -> 80;
            case 234 -> 69;
            case 235 -> 209;
            case 236 -> 24;
            case 237 -> 96;
            case 238 -> 241;
            case 239 -> 234;
            case 240 -> 183;
            case 241 -> 43;
            case 242 -> 175;
            case 243 -> 155;
            case 244 -> 206;
            case 245 -> 35;
            case 246 -> 73;
            case 247 -> 226;
            case 248 -> 105;
            case 249 -> 251;
            case 250 -> 240;
            case 251 -> 221;
            case 252 -> 110;
            case 253 -> 231;
            case 254 -> 52;
            default -> 100;
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
