package me.octo.client.utils;

import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII {
   private static String[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] b;
   private static String[] c;

   @NotNull
   public static final <T> Optional<T> a() {
      Optional var10000 = Optional.empty();
      short var10002 = -2271;
      short var10003 = 30096;
      Intrinsics.checkNotNullExpressionValue(var10000, "empty(...)");
      return var10000;
   }

   @NotNull
   public static final <T> Optional<T> a(@Nullable T var0) {
      Optional var10000 = Optional.ofNullable(var0);
      short var10002 = -2272;
      short var10003 = 24962;
      Intrinsics.checkNotNullExpressionValue(var10000, "ofNullable(...)");
      return var10000;
   }

   @NotNull
   public static final <K, V> Map<K, V> a(@NotNull Map<K, ? extends V> var0) {
      String[] var1;
      Map var5;
      label28: {
         label31: {
            String[] var10000 = b();
            short var10002 = -2267;
            short var10003 = 7237;
            Intrinsics.checkNotNullParameter(var0, "<this>");
            var1 = var10000;
            int var4 = ((var0.isEmpty()) ? 1 : 0);
            if (var1 == null) {
               if (var4 != 0) {
                  var5 = MapsKt.emptyMap();
                  break label28;
               }

               var5 = var0;
               if (var1 != null) {
                  break label31;
               }

               var4 = var0.size();
            }

            if (var4 == 1) {
               Entry var2 = (Entry)CollectionsKt.first(var0.entrySet());
               boolean var3 = false;
               var5 = Map.of(var2.getKey(), var2.getValue());
               var10002 = -2266;
               var10003 = 9930;
               Intrinsics.checkNotNullExpressionValue(var5, "let(...)");
               break label28;
            }

            var5 = Map.copyOf(var0);
         }

         short var7 = -2265;
         short var9 = 3104;
         Intrinsics.checkNotNullExpressionValue(var5, "copyOf(...)");
      }

      if (var1 != null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var5;
   }

   @NotNull
   public static final <K, V> Function<K, V> a(@NotNull Map<K, V> var0, @NotNull Function1<? super K, ? extends V> var1) {
      short var10001 = -2268;
      short var10002 = 19926;
      Intrinsics.checkNotNullParameter(var0, "cache");
      var10001 = -2270;
      var10002 = 802;
      Intrinsics.checkNotNullParameter(var1, "compute");
      return k -> (V)a(var0, var1, k); // PX-FIX BSM: 捕获 (var0,var1) → java.util.function.Function
   }

   private static final Object a(Map var0, Function1 var1, Object var2) {
      Intrinsics.checkNotNullParameter(var2, "k");
      boolean var5 = false;
      Object var6 = var0.get(var2);
      Object var10000;
      if (var6 == null) {
         boolean var7 = false;
         Object var8 = var1.invoke(var2);
         var0.put(var2, var8);
         var10000 = var8;
      } else {
         var10000 = var6;
      }

      return var10000;
   }

   public static void b(String[] var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
   }

   public static String[] b() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "¥\u0003ð¶§\u0006p,õå{è\b\"¢ùF8å¹D\u000b\u0003>7Ï\u0004çuB<¥¶\u000fÈ\u000býM\u00870\u000b¿Ñ\u0094\u0000¦-j]";
      int var4 = "¥\u0003ð¶§\u0006p,õå{è\b\"¢ùF8å¹D\u000b\u0003>7Ï\u0004çuB<¥¶\u000fÈ\u000býM\u00870\u000b¿Ñ\u0094\u0000¦-j]".length();
      b(null);
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 71;
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
                     case 0 -> 124;
                     case 1 -> 81;
                     case 2 -> 8;
                     case 3 -> 118;
                     case 4 -> 125;
                     case 5 -> 79;
                     default -> 123;
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
                     b = var5;
                     c = new String[7];
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

                  var2 = "´zÇÈì%^]_\u0081\u0007«kÿ¬Yq.";
                  var4 = "´zÇÈì%^]_\u0081\u0007«kÿ¬Yq.".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 42;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2268) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 10;
            case 1 -> 225;
            case 2 -> 36;
            case 3 -> 28;
            case 4 -> 196;
            case 5 -> 104;
            case 6 -> 98;
            case 7 -> 208;
            case 8 -> 156;
            case 9 -> 109;
            case 10 -> 15;
            case 11 -> 152;
            case 12 -> 65;
            case 13 -> 75;
            case 14 -> 68;
            case 15 -> 115;
            case 16 -> 137;
            case 17 -> 79;
            case 18 -> 174;
            case 19 -> 97;
            case 20 -> 81;
            case 21 -> 170;
            case 22 -> 58;
            case 23 -> 182;
            case 24 -> 173;
            case 25 -> 85;
            case 26 -> 207;
            case 27 -> 17;
            case 28 -> 113;
            case 29 -> 201;
            case 30 -> 136;
            case 31 -> 159;
            case 32 -> 32;
            case 33 -> 241;
            case 34 -> 21;
            case 35 -> 126;
            case 36 -> 37;
            case 37 -> 165;
            case 38 -> 91;
            case 39 -> 181;
            case 40 -> 60;
            case 41 -> 43;
            case 42 -> 117;
            case 43 -> 50;
            case 44 -> 190;
            case 45 -> 78;
            case 46 -> 157;
            case 47 -> 153;
            case 48 -> 194;
            case 49 -> 180;
            case 50 -> 142;
            case 51 -> 119;
            case 52 -> 33;
            case 53 -> 149;
            case 54 -> 235;
            case 55 -> 222;
            case 56 -> 197;
            case 57 -> 155;
            case 58 -> 252;
            case 59 -> 205;
            case 60 -> 184;
            case 61 -> 151;
            case 62 -> 55;
            case 63 -> 243;
            case 64 -> 120;
            case 65 -> 57;
            case 66 -> 29;
            case 67 -> 251;
            case 68 -> 5;
            case 69 -> 128;
            case 70 -> 27;
            case 71 -> 167;
            case 72 -> 200;
            case 73 -> 218;
            case 74 -> 25;
            case 75 -> 206;
            case 76 -> 168;
            case 77 -> 175;
            case 78 -> 202;
            case 79 -> 108;
            case 80 -> 74;
            case 81 -> 178;
            case 82 -> 118;
            case 83 -> 23;
            case 84 -> 158;
            case 85 -> 95;
            case 86 -> 96;
            case 87 -> 198;
            case 88 -> 62;
            case 89 -> 77;
            case 90 -> 246;
            case 91 -> 89;
            case 92 -> 35;
            case 93 -> 44;
            case 94 -> 87;
            case 95 -> 226;
            case 96 -> 131;
            case 97 -> 34;
            case 98 -> 2;
            case 99 -> 103;
            case 100 -> 42;
            case 101 -> 148;
            case 102 -> 177;
            case 103 -> 254;
            case 104 -> 107;
            case 105 -> 11;
            case 106 -> 84;
            case 107 -> 129;
            case 108 -> 245;
            case 109 -> 111;
            case 110 -> 160;
            case 111 -> 232;
            case 112 -> 112;
            case 113 -> 144;
            case 114 -> 248;
            case 115 -> 172;
            case 116 -> 211;
            case 117 -> 223;
            case 118 -> 138;
            case 119 -> 247;
            case 120 -> 141;
            case 121 -> 179;
            case 122 -> 63;
            case 123 -> 80;
            case 124 -> 134;
            case 125 -> 0;
            case 126 -> 3;
            case 127 -> 66;
            case 128 -> 139;
            case 129 -> 53;
            case 130 -> 209;
            case 131 -> 233;
            case 132 -> 147;
            case 133 -> 221;
            case 134 -> 121;
            case 135 -> 105;
            case 136 -> 193;
            case 137 -> 176;
            case 138 -> 18;
            case 139 -> 56;
            case 140 -> 94;
            case 141 -> 244;
            case 142 -> 83;
            case 143 -> 212;
            case 144 -> 236;
            case 145 -> 102;
            case 146 -> 228;
            case 147 -> 220;
            case 148 -> 8;
            case 149 -> 88;
            case 150 -> 16;
            case 151 -> 19;
            case 152 -> 31;
            case 153 -> 191;
            case 154 -> 186;
            case 155 -> 99;
            case 156 -> 203;
            case 157 -> 14;
            case 158 -> 217;
            case 159 -> 185;
            case 160 -> 52;
            case 161 -> 183;
            case 162 -> 240;
            case 163 -> 30;
            case 164 -> 169;
            case 165 -> 237;
            case 166 -> 213;
            case 167 -> 166;
            case 168 -> 1;
            case 169 -> 195;
            case 170 -> 145;
            case 171 -> 90;
            case 172 -> 215;
            case 173 -> 199;
            case 174 -> 12;
            case 175 -> 133;
            case 176 -> 189;
            case 177 -> 239;
            case 178 -> 163;
            case 179 -> 7;
            case 180 -> 46;
            case 181 -> 20;
            case 182 -> 72;
            case 183 -> 64;
            case 184 -> 204;
            case 185 -> 41;
            case 186 -> 4;
            case 187 -> 49;
            case 188 -> 253;
            case 189 -> 249;
            case 190 -> 22;
            case 191 -> 227;
            case 192 -> 13;
            case 193 -> 187;
            case 194 -> 24;
            case 195 -> 214;
            case 196 -> 219;
            case 197 -> 188;
            case 198 -> 127;
            case 199 -> 171;
            case 200 -> 51;
            case 201 -> 124;
            case 202 -> 123;
            case 203 -> 54;
            case 204 -> 101;
            case 205 -> 231;
            case 206 -> 47;
            case 207 -> 76;
            case 208 -> 39;
            case 209 -> 73;
            case 210 -> 40;
            case 211 -> 140;
            case 212 -> 146;
            case 213 -> 45;
            case 214 -> 38;
            case 215 -> 67;
            case 216 -> 92;
            case 217 -> 238;
            case 218 -> 192;
            case 219 -> 229;
            case 220 -> 86;
            case 221 -> 216;
            case 222 -> 210;
            case 223 -> 135;
            case 224 -> 122;
            case 225 -> 242;
            case 226 -> 9;
            case 227 -> 154;
            case 228 -> 106;
            case 229 -> 143;
            case 230 -> 114;
            case 231 -> 116;
            case 232 -> 125;
            case 233 -> 162;
            case 234 -> 6;
            case 235 -> 82;
            case 236 -> 255;
            case 237 -> 224;
            case 238 -> 26;
            case 239 -> 70;
            case 240 -> 250;
            case 241 -> 59;
            case 242 -> 61;
            case 243 -> 230;
            case 244 -> 234;
            case 245 -> 164;
            case 246 -> 93;
            case 247 -> 48;
            case 248 -> 69;
            case 249 -> 130;
            case 250 -> 150;
            case 251 -> 110;
            case 252 -> 161;
            case 253 -> 132;
            case 254 -> 100;
            default -> 71;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }
}
