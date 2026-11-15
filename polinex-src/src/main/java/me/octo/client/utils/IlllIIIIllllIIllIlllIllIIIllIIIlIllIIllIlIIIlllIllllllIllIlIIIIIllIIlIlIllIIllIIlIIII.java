package me.octo.client.utils;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IlllIIIIllllIIllIlllIllIIIllIIIlIllIIllIlIIIlllIllllllIllIlIIIIIllIIlIlIllIIllIIlIIII {
   private static String[] a;
   private static String[] b;

   @NotNull
   public static final <K, V> Map<K, V> a(K var0, V var1) {
      boolean var2 = false;
      return MapsKt.mapOf(TuplesKt.to(var0, var1));
   }

   @NotNull
   public static final <K, V> Map<K, V> a(K var0, V var1, K var2, V var3) {
      boolean var5 = false;
      Pair[] var6 = new Pair[2];
      lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII.d();
      var6[0] = TuplesKt.to(var0, var1);
      var6[1] = TuplesKt.to(var2, var3);
      Map var10000 = MapsKt.mapOf(var6);
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII.b("i0yIoc");
      }

      return var10000;
   }

   @NotNull
   public static final <K extends Enum<K>, V> Map<K, V> a() {
      boolean var0 = false;
      Intrinsics.reifiedOperationMarker(4, "K");
      return (Map<K, V>)new EnumMap(Enum.class);
   }

   @NotNull
   public static final <K, V> Iterator<Entry<K, V>> a(@NotNull Object2ObjectOpenHashMap<K, V> var0) {
      short var10001 = -26132;
      short var10002 = -3906;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      boolean var1 = false;
      ObjectIterator var10000 = var0.object2ObjectEntrySet().fastIterator();
      var10002 = -26131;
      short var10003 = 9245;
      Intrinsics.checkNotNullExpressionValue(var10000, "fastIterator(...)");
      return (Iterator<Entry<K, V>>)var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u009dô\u0096µK\u0088h\u0001(\u00945×¼ì\fÕ¿\u0006\u0001È\u000f\u0098:Ù";
      int var4 = "\u009dô\u0096µK\u0088h\u0001(\u00945×¼ì\fÕ¿\u0006\u0001È\u000f\u0098:Ù".length();
      char var1 = 17;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 36;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 36;
               var10006 = var6;
            } else {
               var13 = 36;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 36;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 114;
                  case 1 -> 5;
                  case 2 -> 18;
                  case 3 -> 18;
                  case 4 -> 47;
                  case 5 -> 82;
                  default -> 65;
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
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26131) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 74;
            case 1 -> 42;
            case 2 -> 168;
            case 3 -> 27;
            case 4 -> 195;
            case 5 -> 148;
            case 6 -> 76;
            case 7 -> 109;
            case 8 -> 86;
            case 9 -> 248;
            case 10 -> 215;
            case 11 -> 13;
            case 12 -> 48;
            case 13 -> 198;
            case 14 -> 206;
            case 15 -> 77;
            case 16 -> 10;
            case 17 -> 226;
            case 18 -> 43;
            case 19 -> 119;
            case 20 -> 85;
            case 21 -> 35;
            case 22 -> 239;
            case 23 -> 78;
            case 24 -> 202;
            case 25 -> 177;
            case 26 -> 157;
            case 27 -> 190;
            case 28 -> 130;
            case 29 -> 244;
            case 30 -> 192;
            case 31 -> 38;
            case 32 -> 231;
            case 33 -> 101;
            case 34 -> 6;
            case 35 -> 34;
            case 36 -> 104;
            case 37 -> 88;
            case 38 -> 151;
            case 39 -> 15;
            case 40 -> 172;
            case 41 -> 19;
            case 42 -> 147;
            case 43 -> 227;
            case 44 -> 87;
            case 45 -> 166;
            case 46 -> 94;
            case 47 -> 4;
            case 48 -> 59;
            case 49 -> 69;
            case 50 -> 37;
            case 51 -> 51;
            case 52 -> 26;
            case 53 -> 41;
            case 54 -> 128;
            case 55 -> 18;
            case 56 -> 8;
            case 57 -> 205;
            case 58 -> 111;
            case 59 -> 230;
            case 60 -> 161;
            case 61 -> 229;
            case 62 -> 163;
            case 63 -> 11;
            case 64 -> 106;
            case 65 -> 224;
            case 66 -> 66;
            case 67 -> 62;
            case 68 -> 60;
            case 69 -> 134;
            case 70 -> 57;
            case 71 -> 96;
            case 72 -> 117;
            case 73 -> 139;
            case 74 -> 238;
            case 75 -> 90;
            case 76 -> 121;
            case 77 -> 153;
            case 78 -> 7;
            case 79 -> 2;
            case 80 -> 218;
            case 81 -> 22;
            case 82 -> 211;
            case 83 -> 23;
            case 84 -> 3;
            case 85 -> 30;
            case 86 -> 175;
            case 87 -> 83;
            case 88 -> 193;
            case 89 -> 116;
            case 90 -> 33;
            case 91 -> 141;
            case 92 -> 47;
            case 93 -> 254;
            case 94 -> 126;
            case 95 -> 14;
            case 96 -> 79;
            case 97 -> 222;
            case 98 -> 194;
            case 99 -> 149;
            case 100 -> 162;
            case 101 -> 0;
            case 102 -> 234;
            case 103 -> 129;
            case 104 -> 28;
            case 105 -> 122;
            case 106 -> 252;
            case 107 -> 103;
            case 108 -> 24;
            case 109 -> 150;
            case 110 -> 152;
            case 111 -> 49;
            case 112 -> 221;
            case 113 -> 189;
            case 114 -> 53;
            case 115 -> 208;
            case 116 -> 179;
            case 117 -> 209;
            case 118 -> 92;
            case 119 -> 70;
            case 120 -> 164;
            case 121 -> 203;
            case 122 -> 173;
            case 123 -> 240;
            case 124 -> 21;
            case 125 -> 46;
            case 126 -> 39;
            case 127 -> 180;
            case 128 -> 63;
            case 129 -> 72;
            case 130 -> 123;
            case 131 -> 247;
            case 132 -> 200;
            case 133 -> 217;
            case 134 -> 184;
            case 135 -> 154;
            case 136 -> 91;
            case 137 -> 120;
            case 138 -> 159;
            case 139 -> 127;
            case 140 -> 185;
            case 141 -> 214;
            case 142 -> 212;
            case 143 -> 176;
            case 144 -> 73;
            case 145 -> 44;
            case 146 -> 84;
            case 147 -> 25;
            case 148 -> 210;
            case 149 -> 89;
            case 150 -> 132;
            case 151 -> 187;
            case 152 -> 241;
            case 153 -> 133;
            case 154 -> 81;
            case 155 -> 138;
            case 156 -> 228;
            case 157 -> 107;
            case 158 -> 65;
            case 159 -> 155;
            case 160 -> 113;
            case 161 -> 58;
            case 162 -> 145;
            case 163 -> 131;
            case 164 -> 99;
            case 165 -> 20;
            case 166 -> 174;
            case 167 -> 199;
            case 168 -> 249;
            case 169 -> 56;
            case 170 -> 114;
            case 171 -> 67;
            case 172 -> 216;
            case 173 -> 219;
            case 174 -> 182;
            case 175 -> 40;
            case 176 -> 136;
            case 177 -> 181;
            case 178 -> 188;
            case 179 -> 204;
            case 180 -> 169;
            case 181 -> 45;
            case 182 -> 191;
            case 183 -> 183;
            case 184 -> 156;
            case 185 -> 186;
            case 186 -> 55;
            case 187 -> 233;
            case 188 -> 118;
            case 189 -> 223;
            case 190 -> 135;
            case 191 -> 102;
            case 192 -> 97;
            case 193 -> 93;
            case 194 -> 61;
            case 195 -> 17;
            case 196 -> 100;
            case 197 -> 98;
            case 198 -> 9;
            case 199 -> 197;
            case 200 -> 196;
            case 201 -> 201;
            case 202 -> 137;
            case 203 -> 112;
            case 204 -> 82;
            case 205 -> 108;
            case 206 -> 68;
            case 207 -> 207;
            case 208 -> 245;
            case 209 -> 158;
            case 210 -> 124;
            case 211 -> 75;
            case 212 -> 110;
            case 213 -> 235;
            case 214 -> 225;
            case 215 -> 36;
            case 216 -> 52;
            case 217 -> 115;
            case 218 -> 250;
            case 219 -> 31;
            case 220 -> 170;
            case 221 -> 29;
            case 222 -> 142;
            case 223 -> 32;
            case 224 -> 243;
            case 225 -> 12;
            case 226 -> 125;
            case 227 -> 1;
            case 228 -> 237;
            case 229 -> 213;
            case 230 -> 64;
            case 231 -> 178;
            case 232 -> 140;
            case 233 -> 16;
            case 234 -> 253;
            case 235 -> 146;
            case 236 -> 54;
            case 237 -> 165;
            case 238 -> 71;
            case 239 -> 236;
            case 240 -> 232;
            case 241 -> 105;
            case 242 -> 50;
            case 243 -> 220;
            case 244 -> 160;
            case 245 -> 251;
            case 246 -> 246;
            case 247 -> 171;
            case 248 -> 255;
            case 249 -> 167;
            case 250 -> 80;
            case 251 -> 144;
            case 252 -> 5;
            case 253 -> 95;
            case 254 -> 143;
            default -> 242;
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
