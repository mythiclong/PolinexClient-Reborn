package me.octo.client;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl {
   @NotNull
   public static lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Lazy IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Lazy lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl() {
   }

   private final Path a() {
      Lazy var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Object var10000 = var1.getValue();
      short var10002 = -30923;
      short var10003 = 11153;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (Path)var10000;
   }

   private final Path b() {
      Lazy var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Object var10000 = var1.getValue();
      short var10002 = -30913;
      short var10003 = 2139;
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (Path)var10000;
   }

   @NotNull
   public final Path a(@NotNull String var1) {
      boolean var10000 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
      short var10002 = -30921;
      short var10003 = -26071;
      Intrinsics.checkNotNullParameter(var1, "parentFolder");
      boolean var2 = var10000;
      Path var3 = this.b().resolve(var1);
      boolean var5 = false;
      Intrinsics.checkNotNull(var3);
      Path var6 = var3;
      if (!var2) {
         LinkOption[] var10001 = new LinkOption[0];
         if (!Files.exists(var3, Arrays.copyOf(var10001, var10001.length))) {
            FileAttribute[] var7 = new FileAttribute[0];
            Path var8;
            try {
               var8 = Files.createDirectories(var3, Arrays.copyOf(var7, var7.length));
            }
            catch (java.io.IOException iOException) {
               throw new RuntimeException(iOException);
            }
            var10002 = -30934;
            var10003 = 403;
            Intrinsics.checkNotNullExpressionValue(var8, "createDirectories(...)");
         }

         var6 = var3;
         var10002 = -30927;
         var10003 = -1737;
         Intrinsics.checkNotNullExpressionValue(var3, "apply(...)");
      }

      return var6;
   }

   @NotNull
   public final Path a(@NotNull String var1, @NotNull String var2) {
      short var10001 = -30919;
      short var10002 = -30695;
      Intrinsics.checkNotNullParameter(var1, "parentFolder");
      var10001 = -30924;
      var10002 = -28484;
      Intrinsics.checkNotNullParameter(var2, "fileName");
      Path var10000 = this.a(var1);
      var10002 = -30925;
      short var10003 = 18267;
      var10000 = var10000.resolve(var2 + ".json");
      var10002 = -30930;
      var10003 = -7206;
      Intrinsics.checkNotNullExpressionValue(var10000, "resolve(...)");
      return var10000;
   }

   @NotNull
   public final Path a(@NotNull String var1, @NotNull String var2, @NotNull String var3) {
      short var10001 = -30921;
      short var10002 = -26071;
      Intrinsics.checkNotNullParameter(var1, "parentFolder");
      var10001 = -30926;
      var10002 = -12266;
      Intrinsics.checkNotNullParameter(var2, "folder");
      var10001 = -30929;
      var10002 = -13814;
      Intrinsics.checkNotNullParameter(var3, "fileName");
      Path var10000 = this.a(var1).resolve(var2);
      var10002 = -30918;
      short var10003 = -27552;
      var10000 = var10000.resolve(var3 + ".json");
      var10002 = -30916;
      var10003 = -17626;
      Intrinsics.checkNotNullExpressionValue(var10000, "resolve(...)");
      return var10000;
   }

   @NotNull
   public final Path a(@NotNull String var1, @NotNull String var2, @NotNull String var3, @NotNull String var4) {
      short var10001 = -30921;
      short var10002 = -26071;
      Intrinsics.checkNotNullParameter(var1, "parentFolder");
      var10001 = -30917;
      var10002 = -7329;
      Intrinsics.checkNotNullParameter(var2, "folder");
      var10001 = -30922;
      var10002 = -17451;
      Intrinsics.checkNotNullParameter(var3, "subFolder");
      var10001 = -30929;
      var10002 = -13814;
      Intrinsics.checkNotNullParameter(var4, "fileName");
      Path var10000 = this.a(var1).resolve(var2).resolve(var3);
      var10002 = -30918;
      short var10003 = -27552;
      var10000 = var10000.resolve(var4 + ".json");
      var10002 = -30916;
      var10003 = -17626;
      Intrinsics.checkNotNullExpressionValue(var10000, "resolve(...)");
      return var10000;
   }

   @NotNull
   public final Path b(@NotNull String var1, @NotNull String var2) {
      short var10001 = -30921;
      short var10002 = -26071;
      Intrinsics.checkNotNullParameter(var1, "parentFolder");
      var10001 = -30920;
      var10002 = -2463;
      Intrinsics.checkNotNullParameter(var2, "folderName");
      Path var10000 = this.a(var1).resolve(var2);
      var10002 = -30916;
      short var10003 = -17626;
      Intrinsics.checkNotNullExpressionValue(var10000, "resolve(...)");
      return var10000;
   }

   @NotNull
   public final Path b(@NotNull String var1, @NotNull String var2, @NotNull String var3) {
      short var10001 = -30921;
      short var10002 = -26071;
      Intrinsics.checkNotNullParameter(var1, "parentFolder");
      var10001 = -30936;
      var10002 = 25328;
      Intrinsics.checkNotNullParameter(var2, "folderName");
      var10001 = -30915;
      var10002 = 28866;
      Intrinsics.checkNotNullParameter(var3, "subFolderName");
      Path var10000 = this.a(var1).resolve(var2).resolve(var3);
      var10002 = -30916;
      short var10003 = -17626;
      Intrinsics.checkNotNullExpressionValue(var10000, "resolve(...)");
      return var10000;
   }

   private static final Path c() {
      Path var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameDirectory.toPath();
      short var10001 = -30933;
      short var10002 = 31008;
      Path var0 = var10000.resolve("polinex");
      boolean var2 = false;
      Intrinsics.checkNotNull(var0);
      FileAttribute[] var3 = new FileAttribute[0];
      Path var4;
      try {
         var4 = Files.createDirectories(var0, Arrays.copyOf(var3, var3.length));
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }
      var10002 = -30914;
      short var10003 = -3341;
      Intrinsics.checkNotNullExpressionValue(var4, "createDirectories(...)");
      return var0;
   }

   private static final Path d() {
      Path var10000 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
      short var10001 = -30928;
      short var10002 = -29534;
      Path var0 = var10000.resolve("routes");
      boolean var2 = false;
      Intrinsics.checkNotNull(var0);
      FileAttribute[] var3 = new FileAttribute[0];
      Path var4;
      try {
         var4 = Files.createDirectories(var0, Arrays.copyOf(var3, var3.length));
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }
      var10002 = -30934;
      short var10003 = 403;
      Intrinsics.checkNotNullExpressionValue(var4, "createDirectories(...)");
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "ÛX\u0082Zîv\u0005\u009cº4¨Ï\fÕ\u0083\u0089ïYç\nhXÔ8:\n4~\u007f\u009eQîi\u0081<'\rºÙ\u0097\u0013S5\u0096#Ú¼ïh\u0098\u0016oO¸\u0003\u0090ïh\\H\u0095á5ûê\u0095ÿº©^\u0091Êñ\r\u001e\u0098\u00839\u000bbCÉ\t\u0081Ëàö\f´\bæ\u0010\u0097Q²»JK;\u0091\u0005ÓµÝIò\u0006\u008fú\b\u000e¿ü\nç\u000eþdââà^\"6\u0006 %råÊ\u0092\f%\u0091\u0097\u00ad\u009a¯raWõÙ\u001e\t\u008bÝ1\u0091]w\u0089kP\r¥\u000ftÉ/n\u0019H+ÑÑÅ_\bôùg©y:\u0001n\u0007åw\u0091²\u0087Ðï\u0016\u0085Påà;\u0093\u001dÓæd4\u000bA-Â\u0007P¶\u0003ra\u008d\u0010\u0097ó2Iè\u009d\u000eÎ®È¤\u0004ÔG^Ñ\noâ\u0014\r<\u009cÄÏ\u0089î";
      int var4 = "ÛX\u0082Zîv\u0005\u009cº4¨Ï\fÕ\u0083\u0089ïYç\nhXÔ8:\n4~\u007f\u009eQîi\u0081<'\rºÙ\u0097\u0013S5\u0096#Ú¼ïh\u0098\u0016oO¸\u0003\u0090ïh\\H\u0095á5ûê\u0095ÿº©^\u0091Êñ\r\u001e\u0098\u00839\u000bbCÉ\t\u0081Ëàö\f´\bæ\u0010\u0097Q²»JK;\u0091\u0005ÓµÝIò\u0006\u008fú\b\u000e¿ü\nç\u000eþdââà^\"6\u0006 %råÊ\u0092\f%\u0091\u0097\u00ad\u009a¯raWõÙ\u001e\t\u008bÝ1\u0091]w\u0089kP\r¥\u000ftÉ/n\u0019H+ÑÑÅ_\bôùg©y:\u0001n\u0007åw\u0091²\u0087Ðï\u0016\u0085Påà;\u0093\u001dÓæd4\u000bA-Â\u0007P¶\u0003ra\u008d\u0010\u0097ó2Iè\u009d\u000eÎ®È¤\u0004ÔG^Ñ\noâ\u0014\r<\u009cÄÏ\u0089î"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 71;
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
                     case 0 -> 103;
                     case 1 -> 81;
                     case 2 -> 124;
                     case 3 -> 50;
                     case 4 -> 26;
                     case 5 -> 78;
                     default -> 40;
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
                     a = var5;
                     b = new String[22];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl();
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = -30935;
                     short var32 = 7790;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = LazyKt.lazy(
                        lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl::c
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = LazyKt.lazy(
                        lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl::d
                     );
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

                  var2 = "3Ê\u008bÛð`$1\f\u0004>äÂÃ\u001f,f\u008dä×p";
                  var4 = "3Ê\u008bÛð`$1\f\u0004>äÂÃ\u001f,f\u008dä×p".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 60;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -30917) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 48;
            case 1 -> 191;
            case 2 -> 43;
            case 3 -> 214;
            case 4 -> 17;
            case 5 -> 180;
            case 6 -> 178;
            case 7 -> 225;
            case 8 -> 149;
            case 9 -> 172;
            case 10 -> 201;
            case 11 -> 15;
            case 12 -> 185;
            case 13 -> 165;
            case 14 -> 13;
            case 15 -> 46;
            case 16 -> 160;
            case 17 -> 216;
            case 18 -> 237;
            case 19 -> 142;
            case 20 -> 239;
            case 21 -> 230;
            case 22 -> 224;
            case 23 -> 96;
            case 24 -> 61;
            case 25 -> 227;
            case 26 -> 207;
            case 27 -> 139;
            case 28 -> 154;
            case 29 -> 81;
            case 30 -> 3;
            case 31 -> 97;
            case 32 -> 44;
            case 33 -> 113;
            case 34 -> 67;
            case 35 -> 247;
            case 36 -> 190;
            case 37 -> 187;
            case 38 -> 243;
            case 39 -> 198;
            case 40 -> 124;
            case 41 -> 79;
            case 42 -> 32;
            case 43 -> 226;
            case 44 -> 215;
            case 45 -> 5;
            case 46 -> 248;
            case 47 -> 212;
            case 48 -> 242;
            case 49 -> 9;
            case 50 -> 192;
            case 51 -> 90;
            case 52 -> 183;
            case 53 -> 134;
            case 54 -> 68;
            case 55 -> 102;
            case 56 -> 66;
            case 57 -> 127;
            case 58 -> 202;
            case 59 -> 74;
            case 60 -> 98;
            case 61 -> 128;
            case 62 -> 117;
            case 63 -> 7;
            case 64 -> 161;
            case 65 -> 255;
            case 66 -> 51;
            case 67 -> 88;
            case 68 -> 21;
            case 69 -> 31;
            case 70 -> 195;
            case 71 -> 189;
            case 72 -> 246;
            case 73 -> 137;
            case 74 -> 170;
            case 75 -> 92;
            case 76 -> 152;
            case 77 -> 1;
            case 78 -> 103;
            case 79 -> 199;
            case 80 -> 166;
            case 81 -> 35;
            case 82 -> 8;
            case 83 -> 55;
            case 84 -> 221;
            case 85 -> 146;
            case 86 -> 36;
            case 87 -> 140;
            case 88 -> 220;
            case 89 -> 106;
            case 90 -> 223;
            case 91 -> 163;
            case 92 -> 95;
            case 93 -> 84;
            case 94 -> 211;
            case 95 -> 173;
            case 96 -> 54;
            case 97 -> 236;
            case 98 -> 229;
            case 99 -> 63;
            case 100 -> 197;
            case 101 -> 131;
            case 102 -> 138;
            case 103 -> 50;
            case 104 -> 252;
            case 105 -> 147;
            case 106 -> 244;
            case 107 -> 222;
            case 108 -> 14;
            case 109 -> 53;
            case 110 -> 45;
            case 111 -> 157;
            case 112 -> 60;
            case 113 -> 122;
            case 114 -> 196;
            case 115 -> 115;
            case 116 -> 200;
            case 117 -> 37;
            case 118 -> 210;
            case 119 -> 23;
            case 120 -> 109;
            case 121 -> 75;
            case 122 -> 89;
            case 123 -> 76;
            case 124 -> 218;
            case 125 -> 193;
            case 126 -> 62;
            case 127 -> 49;
            case 128 -> 156;
            case 129 -> 0;
            case 130 -> 164;
            case 131 -> 70;
            case 132 -> 251;
            case 133 -> 175;
            case 134 -> 245;
            case 135 -> 101;
            case 136 -> 209;
            case 137 -> 129;
            case 138 -> 155;
            case 139 -> 249;
            case 140 -> 203;
            case 141 -> 125;
            case 142 -> 176;
            case 143 -> 16;
            case 144 -> 4;
            case 145 -> 234;
            case 146 -> 240;
            case 147 -> 168;
            case 148 -> 64;
            case 149 -> 2;
            case 150 -> 123;
            case 151 -> 241;
            case 152 -> 181;
            case 153 -> 111;
            case 154 -> 94;
            case 155 -> 213;
            case 156 -> 24;
            case 157 -> 132;
            case 158 -> 30;
            case 159 -> 179;
            case 160 -> 171;
            case 161 -> 72;
            case 162 -> 233;
            case 163 -> 39;
            case 164 -> 87;
            case 165 -> 205;
            case 166 -> 112;
            case 167 -> 73;
            case 168 -> 22;
            case 169 -> 238;
            case 170 -> 121;
            case 171 -> 253;
            case 172 -> 33;
            case 173 -> 18;
            case 174 -> 110;
            case 175 -> 77;
            case 176 -> 167;
            case 177 -> 82;
            case 178 -> 153;
            case 179 -> 19;
            case 180 -> 99;
            case 181 -> 93;
            case 182 -> 42;
            case 183 -> 158;
            case 184 -> 119;
            case 185 -> 69;
            case 186 -> 174;
            case 187 -> 29;
            case 188 -> 206;
            case 189 -> 133;
            case 190 -> 78;
            case 191 -> 38;
            case 192 -> 182;
            case 193 -> 217;
            case 194 -> 85;
            case 195 -> 41;
            case 196 -> 11;
            case 197 -> 107;
            case 198 -> 228;
            case 199 -> 145;
            case 200 -> 57;
            case 201 -> 56;
            case 202 -> 235;
            case 203 -> 105;
            case 204 -> 231;
            case 205 -> 188;
            case 206 -> 65;
            case 207 -> 25;
            case 208 -> 47;
            case 209 -> 91;
            case 210 -> 135;
            case 211 -> 6;
            case 212 -> 10;
            case 213 -> 58;
            case 214 -> 108;
            case 215 -> 120;
            case 216 -> 12;
            case 217 -> 159;
            case 218 -> 116;
            case 219 -> 169;
            case 220 -> 104;
            case 221 -> 204;
            case 222 -> 27;
            case 223 -> 130;
            case 224 -> 219;
            case 225 -> 144;
            case 226 -> 114;
            case 227 -> 136;
            case 228 -> 151;
            case 229 -> 254;
            case 230 -> 118;
            case 231 -> 143;
            case 232 -> 52;
            case 233 -> 83;
            case 234 -> 184;
            case 235 -> 34;
            case 236 -> 250;
            case 237 -> 150;
            case 238 -> 162;
            case 239 -> 186;
            case 240 -> 86;
            case 241 -> 232;
            case 242 -> 20;
            case 243 -> 126;
            case 244 -> 26;
            case 245 -> 148;
            case 246 -> 80;
            case 247 -> 208;
            case 248 -> 177;
            case 249 -> 59;
            case 250 -> 71;
            case 251 -> 194;
            case 252 -> 100;
            case 253 -> 141;
            case 254 -> 28;
            default -> 40;
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
