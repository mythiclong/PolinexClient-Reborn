package me.octo.client;

import java.io.File;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl {
   @NotNull
   public static llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Lazy lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static HashMap<String, String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl() {
   }

   private final File a() {
      Lazy var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return (File)var1.getValue();
   }

   private final void b() {
      String var1 = lIlllllIIIlllIlIllIIlllIIlIlIIIllIllllIlIIllIIlIlllIIllIIIIllIlIIlIlIlIllIllIlIllIIlI.i();
      if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
         return;
      }
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
      if (var1 != null) {
         java.io.File[] var3 = this.a().listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(java.io.File file) {
               return llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl.a(file);
            }
         });
         if (var3 != null) {
            for (java.io.File var5 : var3) {
               try {
                  String var11 = kotlin.io.FilesKt.readText(var5, java.nio.charset.StandardCharsets.UTF_8);
                  lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII var6 = (lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII)me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(var11, lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII.class);
                  ((java.util.Map)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl).put(var6.a(), var6.d());
               } catch (Exception var6b) {
               }
            }
         }
      }
   }

   public final boolean a(@NotNull String var1, @NotNull String var2) {
      short var10001 = -7661;
      short var10002 = 29542;
      Intrinsics.checkNotNullParameter(var1, "title");
      var10001 = -7657;
      var10002 = 12986;
      Intrinsics.checkNotNullParameter(var2, "signature");
      this.b();
      return Intrinsics.areEqual(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var1), var2);
   }

   public final void a(@NotNull lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII var1) {
      short var10001 = -7656;
      short var10002 = 11472;
      Intrinsics.checkNotNullParameter(var1, "gui");
      this.b();

      try {
         llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var1, this.b(var1.a()), true);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(var1.a(), var1.d());
      } catch (Exception var3) {
      }
   }

   @Nullable
   public final lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII a(@NotNull String param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "title");
      java.io.File var3 = this.b(param1);
      if (!var3.exists()) { return null; }
      try {
         String var8 = kotlin.io.FilesKt.readText(var3, kotlin.text.Charsets.UTF_8);
         return (me.octo.client.lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII) me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(var8, me.octo.client.lIIIIllllIlIIIIlIlIllllIIllIlIlIIlIIIIlIIlllIlIIllllllIIlIIllIIlIIlllllIIllIIlllIIIII.class);
      } catch (Exception var5) {
         return null;
      }
   }

   private final File b(String var1) {
      File var10002 = this.a();
      String var10003 = this.c(var1);
      short var10004 = -7664;
      short var10005 = -27048;
      return new File(var10002, var10003 + ".json");
   }

   private final String c(String var1) {
      String var10000 = lIlllllIIIlllIlIllIIlllIIlIlIIIllIllllIlIIllIIlIlllIIllIIIIllIlIIlIlIlIllIllIlIllIIlI.i();
      CharSequence var3 = var1;
      short var10003 = -7659;
      short var10004 = -17430;
      Regex var4 = new Regex("[^A-Za-z0-9 _#'-]");
      String var2 = var10000;
      String var5 = "_";
      var3 = StringsKt.trim(var4.replace(var3, var5)).toString();
      int var8 = var3.length();
      if (var2 != null) {
         var8 = var8 == 0 ? 1 : 0;
      }

      if (var8 != 0) {
         boolean var7 = false;
         short var9 = -7658;
         short var10001 = -7714;
         var10000 = "unknown";
      } else {
         var10000 = String.valueOf(var3);
      }

      return var10000;
   }

   private static final File c() {
      short var10003 = -7662;
      short var10004 = 30224;
      File var0 = new File(
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         "guis"
      );
      boolean var2 = false;
      var0.mkdirs();
      return var0;
   }

   private static final boolean a(File var0) {
      Intrinsics.checkNotNull(var0);
      String var10000 = FilesKt.getExtension(var0);
      short var10001 = -7663;
      short var10002 = 2189;
      return Intrinsics.areEqual(var10000, "json");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "Ø\u001a$\u0004¼\u0004n\u008e\"\u00ad\u0004ÌàÜ»\u0005.\u0084ì·I\u0005Á\u009d\u0011\u0094ö\u0011A/þR§²Ìêlâ\u008d¿áô$¹½\u0007r*Y\u0087\t5É";
      int var4 = "Ø\u001a$\u0004¼\u0004n\u008e\"\u00ad\u0004ÌàÜ»\u0005.\u0084ì·I\u0005Á\u009d\u0011\u0094ö\u0011A/þR§²Ìêlâ\u008d¿áô$¹½\u0007r*Y\u0087\t5É"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 56;
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
                     case 0 -> 29;
                     case 1 -> 89;
                     case 2 -> 59;
                     case 3 -> 27;
                     case 4 -> 19;
                     case 5 -> 77;
                     default -> 89;
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
                     b = new String[9];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = LazyKt.lazy(
                        llIIIIIllIlIIlllIlIlIlIlIIIIllIIlIIIIIIllIIlIllIIlIIIllIIIIlIIllIllIIIlllIIllllIIIIIl::c
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new HashMap<>();
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

                  var2 = "èÎ{Gu\u0095)\nm\u0003Ó!\u0084";
                  var4 = "èÎ{Gu\u0095)\nm\u0003Ó!\u0084".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 4;
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
      int var2 = (var0 ^ -7664) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 222;
            case 1 -> 199;
            case 2 -> 200;
            case 3 -> 121;
            case 4 -> 68;
            case 5 -> 215;
            case 6 -> 161;
            case 7 -> 169;
            case 8 -> 148;
            case 9 -> 48;
            case 10 -> 193;
            case 11 -> 231;
            case 12 -> 111;
            case 13 -> 93;
            case 14 -> 210;
            case 15 -> 117;
            case 16 -> 191;
            case 17 -> 139;
            case 18 -> 85;
            case 19 -> 132;
            case 20 -> 39;
            case 21 -> 236;
            case 22 -> 163;
            case 23 -> 145;
            case 24 -> 158;
            case 25 -> 50;
            case 26 -> 149;
            case 27 -> 131;
            case 28 -> 125;
            case 29 -> 10;
            case 30 -> 166;
            case 31 -> 77;
            case 32 -> 172;
            case 33 -> 62;
            case 34 -> 124;
            case 35 -> 78;
            case 36 -> 164;
            case 37 -> 24;
            case 38 -> 2;
            case 39 -> 21;
            case 40 -> 90;
            case 41 -> 144;
            case 42 -> 16;
            case 43 -> 80;
            case 44 -> 66;
            case 45 -> 112;
            case 46 -> 226;
            case 47 -> 168;
            case 48 -> 143;
            case 49 -> 89;
            case 50 -> 103;
            case 51 -> 178;
            case 52 -> 98;
            case 53 -> 245;
            case 54 -> 232;
            case 55 -> 61;
            case 56 -> 137;
            case 57 -> 26;
            case 58 -> 88;
            case 59 -> 252;
            case 60 -> 114;
            case 61 -> 32;
            case 62 -> 214;
            case 63 -> 40;
            case 64 -> 182;
            case 65 -> 72;
            case 66 -> 216;
            case 67 -> 17;
            case 68 -> 198;
            case 69 -> 138;
            case 70 -> 6;
            case 71 -> 208;
            case 72 -> 151;
            case 73 -> 110;
            case 74 -> 106;
            case 75 -> 108;
            case 76 -> 126;
            case 77 -> 237;
            case 78 -> 254;
            case 79 -> 204;
            case 80 -> 217;
            case 81 -> 176;
            case 82 -> 107;
            case 83 -> 228;
            case 84 -> 79;
            case 85 -> 38;
            case 86 -> 255;
            case 87 -> 188;
            case 88 -> 155;
            case 89 -> 248;
            case 90 -> 0;
            case 91 -> 11;
            case 92 -> 244;
            case 93 -> 1;
            case 94 -> 84;
            case 95 -> 196;
            case 96 -> 159;
            case 97 -> 36;
            case 98 -> 71;
            case 99 -> 235;
            case 100 -> 171;
            case 101 -> 211;
            case 102 -> 227;
            case 103 -> 170;
            case 104 -> 179;
            case 105 -> 219;
            case 106 -> 206;
            case 107 -> 152;
            case 108 -> 73;
            case 109 -> 134;
            case 110 -> 202;
            case 111 -> 54;
            case 112 -> 229;
            case 113 -> 58;
            case 114 -> 67;
            case 115 -> 51;
            case 116 -> 250;
            case 117 -> 238;
            case 118 -> 224;
            case 119 -> 22;
            case 120 -> 128;
            case 121 -> 70;
            case 122 -> 127;
            case 123 -> 186;
            case 124 -> 12;
            case 125 -> 92;
            case 126 -> 82;
            case 127 -> 118;
            case 128 -> 63;
            case 129 -> 27;
            case 130 -> 135;
            case 131 -> 47;
            case 132 -> 49;
            case 133 -> 253;
            case 134 -> 156;
            case 135 -> 3;
            case 136 -> 97;
            case 137 -> 25;
            case 138 -> 105;
            case 139 -> 230;
            case 140 -> 207;
            case 141 -> 43;
            case 142 -> 57;
            case 143 -> 69;
            case 144 -> 119;
            case 145 -> 239;
            case 146 -> 192;
            case 147 -> 197;
            case 148 -> 76;
            case 149 -> 242;
            case 150 -> 109;
            case 151 -> 74;
            case 152 -> 41;
            case 153 -> 154;
            case 154 -> 45;
            case 155 -> 147;
            case 156 -> 218;
            case 157 -> 8;
            case 158 -> 146;
            case 159 -> 42;
            case 160 -> 246;
            case 161 -> 30;
            case 162 -> 175;
            case 163 -> 120;
            case 164 -> 113;
            case 165 -> 187;
            case 166 -> 15;
            case 167 -> 4;
            case 168 -> 7;
            case 169 -> 249;
            case 170 -> 18;
            case 171 -> 116;
            case 172 -> 241;
            case 173 -> 100;
            case 174 -> 101;
            case 175 -> 173;
            case 176 -> 203;
            case 177 -> 94;
            case 178 -> 81;
            case 179 -> 212;
            case 180 -> 65;
            case 181 -> 52;
            case 182 -> 5;
            case 183 -> 181;
            case 184 -> 183;
            case 185 -> 205;
            case 186 -> 122;
            case 187 -> 95;
            case 188 -> 96;
            case 189 -> 141;
            case 190 -> 102;
            case 191 -> 37;
            case 192 -> 213;
            case 193 -> 225;
            case 194 -> 87;
            case 195 -> 142;
            case 196 -> 233;
            case 197 -> 123;
            case 198 -> 28;
            case 199 -> 33;
            case 200 -> 34;
            case 201 -> 167;
            case 202 -> 35;
            case 203 -> 23;
            case 204 -> 59;
            case 205 -> 20;
            case 206 -> 174;
            case 207 -> 243;
            case 208 -> 104;
            case 209 -> 251;
            case 210 -> 91;
            case 211 -> 160;
            case 212 -> 185;
            case 213 -> 220;
            case 214 -> 247;
            case 215 -> 129;
            case 216 -> 221;
            case 217 -> 14;
            case 218 -> 64;
            case 219 -> 55;
            case 220 -> 223;
            case 221 -> 99;
            case 222 -> 86;
            case 223 -> 190;
            case 224 -> 29;
            case 225 -> 180;
            case 226 -> 162;
            case 227 -> 195;
            case 228 -> 9;
            case 229 -> 177;
            case 230 -> 201;
            case 231 -> 83;
            case 232 -> 13;
            case 233 -> 130;
            case 234 -> 153;
            case 235 -> 150;
            case 236 -> 140;
            case 237 -> 234;
            case 238 -> 60;
            case 239 -> 46;
            case 240 -> 31;
            case 241 -> 56;
            case 242 -> 157;
            case 243 -> 115;
            case 244 -> 53;
            case 245 -> 194;
            case 246 -> 75;
            case 247 -> 240;
            case 248 -> 165;
            case 249 -> 184;
            case 250 -> 209;
            case 251 -> 44;
            case 252 -> 19;
            case 253 -> 133;
            case 254 -> 136;
            default -> 189;
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
