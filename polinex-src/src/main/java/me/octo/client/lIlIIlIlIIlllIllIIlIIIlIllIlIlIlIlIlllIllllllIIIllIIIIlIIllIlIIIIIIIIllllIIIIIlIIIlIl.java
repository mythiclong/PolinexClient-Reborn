package me.octo.client;

import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;

public final class lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl {
   @NotNull
   public static lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static String IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] a;
   private static String[] b;

   private lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl() {
   }

   @Nullable
   public final lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull List<lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll> param1,
      @NotNull Set<? extends BlockPos> param2,
      @NotNull List<? extends Vec3> param3,
      boolean param4,
      boolean param5
   ) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[TRYBLOCK]], but top level block is 21[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
   }

   private final double a(boolean var1, lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var2) {
      try {
         if (var1) {
            return 3.0
               * llIllllIIIIlIIlllIIllIIlIIlIllIlllIIllIIlIIlIllIllllIlIlIIIllIIlIllIIlIIlIIlIIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var2.a());
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }

      return 0.0;
   }

   private final boolean a(Vec3 param1, BlockPos param2) {
      String var3 = b();
      net.minecraft.world.phys.Vec3 var4 = param2.getCenter();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var4, "getCenter(...)");
      boolean var1 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4, param1, 5.0D);;
      if (var3 == null) {
         return true;
      }
      if (!var1) {
         return false;
      }
      boolean var2 = java.lang.Math.abs(param1.y - (double)param2.getY()) < 3.0D;
      if (var3 == null) {
         return true;
      }
      return var2;
   }

   public final boolean a(@NotNull BlockPos param1, @NotNull List<? extends Vec3> param2) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "vein");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param2, "others");
      if (param2.isEmpty()) { return false; }
      for (net.minecraft.world.phys.Vec3 var8 : param2) {
         if (IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var8, param1)) { return true; }
      }
      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "\u0099\u009e¹Ã¯\u009cEÔÎ\u000eQÅNw\u0005Ü1?\u001b×\t\u0097\u008f\u008fþ\u0085Ä¤ü.\u0007¸K¦F\u0015¦F\u0005\u001e\u0003«Õ]\u0006ã=\u0014}Lí\u00068M\u0098¬\u0003\u008e\u0004Ôï>À\u0004¨@Ð\u001f\u0003çù\u0090\tØ\u0089!)\u0005çÂï\u0086\u000b6÷k\u008b7d\u008eÙ<\u008bß";
      int var4 = "\u0099\u009e¹Ã¯\u009cEÔÎ\u000eQÅNw\u0005Ü1?\u001b×\t\u0097\u008f\u008fþ\u0085Ä¤ü.\u0007¸K¦F\u0015¦F\u0005\u001e\u0003«Õ]\u0006ã=\u0014}Lí\u00068M\u0098¬\u0003\u008e\u0004Ôï>À\u0004¨@Ð\u001f\u0003çù\u0090\tØ\u0089!)\u0005çÂï\u0086\u000b6÷k\u008b7d\u008eÙ<\u008bß"
         .length();
      char var1 = 14;
      b("hZz5zc");
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 114;
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
                     case 0 -> 26;
                     case 1 -> 29;
                     case 2 -> 10;
                     case 3 -> 5;
                     case 4 -> 122;
                     case 5 -> 61;
                     default -> 126;
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
                     b = new String[14];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl();
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = "";
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

                  var2 = "\u0090\u009c3(È\u0083út\u0097mò®\u000e\u0004\u008e´\u007f°µ\u0018OÛÃMÂs)";
                  var4 = "\u0090\u009c3(È\u0083út\u0097mò®\u000e\u0004\u008e´\u007f°µ\u0018OÛÃMÂs)".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 111;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(String var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var0;
   }

   public static String b() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 22154) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 126;
            case 1 -> 131;
            case 2 -> 202;
            case 3 -> 169;
            case 4 -> 91;
            case 5 -> 185;
            case 6 -> 217;
            case 7 -> 111;
            case 8 -> 27;
            case 9 -> 11;
            case 10 -> 250;
            case 11 -> 39;
            case 12 -> 113;
            case 13 -> 78;
            case 14 -> 226;
            case 15 -> 152;
            case 16 -> 7;
            case 17 -> 154;
            case 18 -> 242;
            case 19 -> 43;
            case 20 -> 107;
            case 21 -> 248;
            case 22 -> 143;
            case 23 -> 253;
            case 24 -> 114;
            case 25 -> 180;
            case 26 -> 5;
            case 27 -> 215;
            case 28 -> 237;
            case 29 -> 103;
            case 30 -> 1;
            case 31 -> 212;
            case 32 -> 148;
            case 33 -> 25;
            case 34 -> 179;
            case 35 -> 245;
            case 36 -> 203;
            case 37 -> 12;
            case 38 -> 54;
            case 39 -> 75;
            case 40 -> 108;
            case 41 -> 239;
            case 42 -> 16;
            case 43 -> 40;
            case 44 -> 118;
            case 45 -> 45;
            case 46 -> 59;
            case 47 -> 188;
            case 48 -> 249;
            case 49 -> 243;
            case 50 -> 153;
            case 51 -> 53;
            case 52 -> 240;
            case 53 -> 88;
            case 54 -> 225;
            case 55 -> 100;
            case 56 -> 22;
            case 57 -> 60;
            case 58 -> 23;
            case 59 -> 224;
            case 60 -> 164;
            case 61 -> 151;
            case 62 -> 29;
            case 63 -> 101;
            case 64 -> 183;
            case 65 -> 204;
            case 66 -> 85;
            case 67 -> 170;
            case 68 -> 67;
            case 69 -> 98;
            case 70 -> 128;
            case 71 -> 244;
            case 72 -> 21;
            case 73 -> 157;
            case 74 -> 71;
            case 75 -> 109;
            case 76 -> 19;
            case 77 -> 216;
            case 78 -> 135;
            case 79 -> 82;
            case 80 -> 58;
            case 81 -> 241;
            case 82 -> 219;
            case 83 -> 125;
            case 84 -> 162;
            case 85 -> 48;
            case 86 -> 50;
            case 87 -> 96;
            case 88 -> 76;
            case 89 -> 231;
            case 90 -> 55;
            case 91 -> 247;
            case 92 -> 14;
            case 93 -> 178;
            case 94 -> 97;
            case 95 -> 139;
            case 96 -> 171;
            case 97 -> 190;
            case 98 -> 116;
            case 99 -> 252;
            case 100 -> 235;
            case 101 -> 233;
            case 102 -> 52;
            case 103 -> 121;
            case 104 -> 161;
            case 105 -> 92;
            case 106 -> 17;
            case 107 -> 255;
            case 108 -> 61;
            case 109 -> 133;
            case 110 -> 37;
            case 111 -> 165;
            case 112 -> 49;
            case 113 -> 9;
            case 114 -> 228;
            case 115 -> 93;
            case 116 -> 47;
            case 117 -> 35;
            case 118 -> 156;
            case 119 -> 74;
            case 120 -> 181;
            case 121 -> 102;
            case 122 -> 86;
            case 123 -> 28;
            case 124 -> 232;
            case 125 -> 234;
            case 126 -> 89;
            case 127 -> 144;
            case 128 -> 2;
            case 129 -> 73;
            case 130 -> 127;
            case 131 -> 211;
            case 132 -> 141;
            case 133 -> 155;
            case 134 -> 18;
            case 135 -> 218;
            case 136 -> 220;
            case 137 -> 209;
            case 138 -> 66;
            case 139 -> 31;
            case 140 -> 79;
            case 141 -> 150;
            case 142 -> 221;
            case 143 -> 137;
            case 144 -> 175;
            case 145 -> 105;
            case 146 -> 57;
            case 147 -> 176;
            case 148 -> 198;
            case 149 -> 132;
            case 150 -> 119;
            case 151 -> 51;
            case 152 -> 134;
            case 153 -> 38;
            case 154 -> 158;
            case 155 -> 95;
            case 156 -> 46;
            case 157 -> 208;
            case 158 -> 10;
            case 159 -> 213;
            case 160 -> 124;
            case 161 -> 34;
            case 162 -> 20;
            case 163 -> 112;
            case 164 -> 168;
            case 165 -> 205;
            case 166 -> 136;
            case 167 -> 182;
            case 168 -> 142;
            case 169 -> 63;
            case 170 -> 84;
            case 171 -> 83;
            case 172 -> 207;
            case 173 -> 72;
            case 174 -> 33;
            case 175 -> 104;
            case 176 -> 69;
            case 177 -> 24;
            case 178 -> 194;
            case 179 -> 163;
            case 180 -> 62;
            case 181 -> 140;
            case 182 -> 15;
            case 183 -> 238;
            case 184 -> 123;
            case 185 -> 196;
            case 186 -> 167;
            case 187 -> 36;
            case 188 -> 254;
            case 189 -> 159;
            case 190 -> 236;
            case 191 -> 6;
            case 192 -> 172;
            case 193 -> 138;
            case 194 -> 160;
            case 195 -> 189;
            case 196 -> 206;
            case 197 -> 145;
            case 198 -> 147;
            case 199 -> 94;
            case 200 -> 42;
            case 201 -> 0;
            case 202 -> 186;
            case 203 -> 41;
            case 204 -> 30;
            case 205 -> 65;
            case 206 -> 146;
            case 207 -> 199;
            case 208 -> 166;
            case 209 -> 120;
            case 210 -> 56;
            case 211 -> 149;
            case 212 -> 44;
            case 213 -> 130;
            case 214 -> 222;
            case 215 -> 192;
            case 216 -> 187;
            case 217 -> 90;
            case 218 -> 106;
            case 219 -> 68;
            case 220 -> 223;
            case 221 -> 229;
            case 222 -> 26;
            case 223 -> 4;
            case 224 -> 110;
            case 225 -> 193;
            case 226 -> 246;
            case 227 -> 87;
            case 228 -> 3;
            case 229 -> 173;
            case 230 -> 227;
            case 231 -> 201;
            case 232 -> 80;
            case 233 -> 13;
            case 234 -> 129;
            case 235 -> 81;
            case 236 -> 200;
            case 237 -> 32;
            case 238 -> 210;
            case 239 -> 191;
            case 240 -> 197;
            case 241 -> 177;
            case 242 -> 230;
            case 243 -> 115;
            case 244 -> 70;
            case 245 -> 214;
            case 246 -> 184;
            case 247 -> 122;
            case 248 -> 64;
            case 249 -> 99;
            case 250 -> 195;
            case 251 -> 8;
            case 252 -> 174;
            case 253 -> 117;
            case 254 -> 77;
            default -> 251;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      // PX-FIX RC4-227: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Lme/octo/client/lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll;Lnet/minecraft/core/BlockPos;DILjava/lang/Object;)Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI self, me.octo.client.lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll p1, net.minecraft.core.BlockPos p2, double p3, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 4) != 0) { p3 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      return self.a(p1, p2, p3);
      }
      @NotNull
      private final lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final BlockPos lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var1, @NotNull BlockPos var2, double var3
      ) {
         short var10001 = 21837;
         short var10002 = 3902;
         Intrinsics.checkNotNullParameter(var1, "vein");
         var10001 = 21834;
         byte var6 = 118;
         Intrinsics.checkNotNullParameter(var2, "goal");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockPos b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockPos e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var1, @NotNull BlockPos var2, double var3
      ) {
         short var10001 = 21832;
         short var10002 = 22727;
         Intrinsics.checkNotNullParameter(var1, "vein");
         var10001 = 21833;
         var10002 = -22409;
         Intrinsics.checkNotNullParameter(var2, "goal");
         return new lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 21838;
         double var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         BlockPos var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 26375;
         short var10002 = 21839;
         short var10003 = -14002;
         short var10004 = 21836;
         short var10005 = -32645;
         return "Scored(vein=" + var4 + ", goal=" + var3 + ", score=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + Double.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Double.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "Ýªü\\ñ\u0015\u009bj\u0004ÍYõÂ\fµ\u0013}QT\u0091)e\u009aàºy\u0007+î6Ø0\u00164\u0004\u0000ÒL³";
         int var4 = "Ýªü\\ñ\u0015\u009bj\u0004ÍYõÂ\fµ\u0013}QT\u0091)e\u009aàºy\u0007+î6Ø0\u00164\u0004\u0000ÒL³".length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 106;
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
                        case 0 -> 79;
                        case 1 -> 57;
                        case 2 -> 83;
                        case 3 -> 78;
                        case 4 -> 81;
                        case 5 -> 13;
                        default -> 79;
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
                        b = new String[7];
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

                     var2 = "à\u00ad%[\u0004\u0097\u009fË\u001d";
                     var4 = "à\u00ad%[\u0004\u0097\u009fË\u001d".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 65;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 21836) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 216;
               case 1 -> 163;
               case 2 -> 233;
               case 3 -> 170;
               case 4 -> 208;
               case 5 -> 222;
               case 6 -> 149;
               case 7 -> 79;
               case 8 -> 220;
               case 9 -> 178;
               case 10 -> 106;
               case 11 -> 70;
               case 12 -> 144;
               case 13 -> 11;
               case 14 -> 44;
               case 15 -> 119;
               case 16 -> 5;
               case 17 -> 184;
               case 18 -> 127;
               case 19 -> 22;
               case 20 -> 24;
               case 21 -> 122;
               case 22 -> 200;
               case 23 -> 183;
               case 24 -> 156;
               case 25 -> 192;
               case 26 -> 254;
               case 27 -> 29;
               case 28 -> 255;
               case 29 -> 182;
               case 30 -> 42;
               case 31 -> 49;
               case 32 -> 109;
               case 33 -> 131;
               case 34 -> 6;
               case 35 -> 172;
               case 36 -> 13;
               case 37 -> 116;
               case 38 -> 93;
               case 39 -> 213;
               case 40 -> 196;
               case 41 -> 101;
               case 42 -> 23;
               case 43 -> 16;
               case 44 -> 236;
               case 45 -> 129;
               case 46 -> 168;
               case 47 -> 209;
               case 48 -> 186;
               case 49 -> 142;
               case 50 -> 190;
               case 51 -> 249;
               case 52 -> 45;
               case 53 -> 20;
               case 54 -> 1;
               case 55 -> 152;
               case 56 -> 38;
               case 57 -> 223;
               case 58 -> 224;
               case 59 -> 125;
               case 60 -> 185;
               case 61 -> 118;
               case 62 -> 103;
               case 63 -> 12;
               case 64 -> 14;
               case 65 -> 18;
               case 66 -> 245;
               case 67 -> 212;
               case 68 -> 52;
               case 69 -> 145;
               case 70 -> 187;
               case 71 -> 31;
               case 72 -> 36;
               case 73 -> 181;
               case 74 -> 54;
               case 75 -> 64;
               case 76 -> 201;
               case 77 -> 58;
               case 78 -> 74;
               case 79 -> 150;
               case 80 -> 253;
               case 81 -> 90;
               case 82 -> 215;
               case 83 -> 43;
               case 84 -> 51;
               case 85 -> 226;
               case 86 -> 112;
               case 87 -> 17;
               case 88 -> 67;
               case 89 -> 230;
               case 90 -> 46;
               case 91 -> 225;
               case 92 -> 37;
               case 93 -> 195;
               case 94 -> 243;
               case 95 -> 166;
               case 96 -> 237;
               case 97 -> 84;
               case 98 -> 104;
               case 99 -> 99;
               case 100 -> 154;
               case 101 -> 219;
               case 102 -> 188;
               case 103 -> 193;
               case 104 -> 78;
               case 105 -> 146;
               case 106 -> 229;
               case 107 -> 33;
               case 108 -> 53;
               case 109 -> 117;
               case 110 -> 251;
               case 111 -> 228;
               case 112 -> 199;
               case 113 -> 8;
               case 114 -> 140;
               case 115 -> 28;
               case 116 -> 2;
               case 117 -> 132;
               case 118 -> 55;
               case 119 -> 177;
               case 120 -> 39;
               case 121 -> 72;
               case 122 -> 35;
               case 123 -> 80;
               case 124 -> 244;
               case 125 -> 204;
               case 126 -> 128;
               case 127 -> 205;
               case 128 -> 89;
               case 129 -> 76;
               case 130 -> 96;
               case 131 -> 143;
               case 132 -> 250;
               case 133 -> 71;
               case 134 -> 203;
               case 135 -> 92;
               case 136 -> 197;
               case 137 -> 234;
               case 138 -> 40;
               case 139 -> 60;
               case 140 -> 176;
               case 141 -> 164;
               case 142 -> 56;
               case 143 -> 123;
               case 144 -> 68;
               case 145 -> 66;
               case 146 -> 169;
               case 147 -> 232;
               case 148 -> 113;
               case 149 -> 161;
               case 150 -> 157;
               case 151 -> 10;
               case 152 -> 102;
               case 153 -> 120;
               case 154 -> 134;
               case 155 -> 111;
               case 156 -> 50;
               case 157 -> 247;
               case 158 -> 59;
               case 159 -> 81;
               case 160 -> 94;
               case 161 -> 88;
               case 162 -> 231;
               case 163 -> 65;
               case 164 -> 9;
               case 165 -> 3;
               case 166 -> 180;
               case 167 -> 130;
               case 168 -> 95;
               case 169 -> 136;
               case 170 -> 153;
               case 171 -> 97;
               case 172 -> 240;
               case 173 -> 41;
               case 174 -> 210;
               case 175 -> 133;
               case 176 -> 114;
               case 177 -> 30;
               case 178 -> 19;
               case 179 -> 48;
               case 180 -> 0;
               case 181 -> 175;
               case 182 -> 148;
               case 183 -> 138;
               case 184 -> 165;
               case 185 -> 73;
               case 186 -> 75;
               case 187 -> 105;
               case 188 -> 21;
               case 189 -> 135;
               case 190 -> 27;
               case 191 -> 221;
               case 192 -> 158;
               case 193 -> 217;
               case 194 -> 100;
               case 195 -> 82;
               case 196 -> 147;
               case 197 -> 87;
               case 198 -> 126;
               case 199 -> 235;
               case 200 -> 218;
               case 201 -> 57;
               case 202 -> 69;
               case 203 -> 206;
               case 204 -> 246;
               case 205 -> 139;
               case 206 -> 4;
               case 207 -> 34;
               case 208 -> 141;
               case 209 -> 171;
               case 210 -> 124;
               case 211 -> 252;
               case 212 -> 174;
               case 213 -> 155;
               case 214 -> 25;
               case 215 -> 115;
               case 216 -> 189;
               case 217 -> 63;
               case 218 -> 191;
               case 219 -> 83;
               case 220 -> 198;
               case 221 -> 137;
               case 222 -> 15;
               case 223 -> 159;
               case 224 -> 151;
               case 225 -> 241;
               case 226 -> 202;
               case 227 -> 110;
               case 228 -> 121;
               case 229 -> 77;
               case 230 -> 211;
               case 231 -> 85;
               case 232 -> 160;
               case 233 -> 62;
               case 234 -> 214;
               case 235 -> 61;
               case 236 -> 239;
               case 237 -> 98;
               case 238 -> 238;
               case 239 -> 47;
               case 240 -> 242;
               case 241 -> 108;
               case 242 -> 179;
               case 243 -> 86;
               case 244 -> 173;
               case 245 -> 248;
               case 246 -> 162;
               case 247 -> 194;
               case 248 -> 167;
               case 249 -> 227;
               case 250 -> 207;
               case 251 -> 91;
               case 252 -> 107;
               case 253 -> 32;
               case 254 -> 26;
               default -> 7;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      // PX-FIX RC4-226: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Ljava/util/List;ILjava/lang/Object;)Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll self, me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p1, java.util.List p2, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return self.a(p1, p2);
      }
      @NotNull
      private final lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final List<lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         @NotNull List<lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var2
      ) {
         short var10001 = -11616;
         short var10002 = -25059;
         Intrinsics.checkNotNullParameter(var1, "chosen");
         var10001 = -11612;
         var10002 = -31391;
         Intrinsics.checkNotNullParameter(var2, "fallbacks");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final List<lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final List<lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         @NotNull List<lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var2
      ) {
         short var10001 = -11611;
         short var10002 = 27572;
         Intrinsics.checkNotNullParameter(var1, "chosen");
         var10001 = -11614;
         var10002 = -27551;
         Intrinsics.checkNotNullParameter(var2, "fallbacks");
         return new lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -11615;
         short var10003 = -16871;
         var10003 = -11613;
         short var10004 = -7950;
         return "Result(chosen="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", fallbacks="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.b();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u001dàôª_\u0014\u000eTIÖ5\u008d;µFð\u009f¨2T\u007f\tôsoïHO\u0089wN\fFÑ0ßæè\u0092%\u001cµ_«";
         int var4 = "\u001dàôª_\u0014\u000eTIÖ5\u008d;µFð\u009f¨2T\u007f\tôsoïHO\u0089wN\fFÑ0ßæè\u0092%\u001cµ_«".length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 4;
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
                        case 0 -> 127;
                        case 1 -> 10;
                        case 2 -> 92;
                        case 3 -> 101;
                        case 4 -> 41;
                        case 5 -> 26;
                        default -> 108;
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

                     var2 = "Í[Vôq2°Æw\u0006~I\u0086\u0081\u000fo";
                     var4 = "Í[Vôq2°Æw\u0006~I\u0086\u0081\u000fo".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 61;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -11616) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 140;
               case 1 -> 111;
               case 2 -> 210;
               case 3 -> 81;
               case 4 -> 208;
               case 5 -> 182;
               case 6 -> 77;
               case 7 -> 222;
               case 8 -> 40;
               case 9 -> 113;
               case 10 -> 69;
               case 11 -> 248;
               case 12 -> 117;
               case 13 -> 75;
               case 14 -> 0;
               case 15 -> 221;
               case 16 -> 12;
               case 17 -> 28;
               case 18 -> 229;
               case 19 -> 160;
               case 20 -> 67;
               case 21 -> 170;
               case 22 -> 46;
               case 23 -> 194;
               case 24 -> 64;
               case 25 -> 197;
               case 26 -> 70;
               case 27 -> 185;
               case 28 -> 192;
               case 29 -> 219;
               case 30 -> 176;
               case 31 -> 207;
               case 32 -> 131;
               case 33 -> 65;
               case 34 -> 60;
               case 35 -> 36;
               case 36 -> 132;
               case 37 -> 32;
               case 38 -> 154;
               case 39 -> 19;
               case 40 -> 82;
               case 41 -> 233;
               case 42 -> 109;
               case 43 -> 100;
               case 44 -> 68;
               case 45 -> 27;
               case 46 -> 161;
               case 47 -> 156;
               case 48 -> 26;
               case 49 -> 152;
               case 50 -> 212;
               case 51 -> 144;
               case 52 -> 94;
               case 53 -> 38;
               case 54 -> 102;
               case 55 -> 254;
               case 56 -> 30;
               case 57 -> 92;
               case 58 -> 108;
               case 59 -> 122;
               case 60 -> 85;
               case 61 -> 225;
               case 62 -> 130;
               case 63 -> 129;
               case 64 -> 83;
               case 65 -> 133;
               case 66 -> 146;
               case 67 -> 153;
               case 68 -> 139;
               case 69 -> 145;
               case 70 -> 48;
               case 71 -> 190;
               case 72 -> 62;
               case 73 -> 167;
               case 74 -> 95;
               case 75 -> 135;
               case 76 -> 123;
               case 77 -> 72;
               case 78 -> 101;
               case 79 -> 86;
               case 80 -> 209;
               case 81 -> 253;
               case 82 -> 234;
               case 83 -> 177;
               case 84 -> 13;
               case 85 -> 243;
               case 86 -> 74;
               case 87 -> 8;
               case 88 -> 186;
               case 89 -> 184;
               case 90 -> 2;
               case 91 -> 149;
               case 92 -> 52;
               case 93 -> 1;
               case 94 -> 240;
               case 95 -> 143;
               case 96 -> 22;
               case 97 -> 211;
               case 98 -> 181;
               case 99 -> 151;
               case 100 -> 180;
               case 101 -> 106;
               case 102 -> 24;
               case 103 -> 51;
               case 104 -> 42;
               case 105 -> 142;
               case 106 -> 235;
               case 107 -> 17;
               case 108 -> 79;
               case 109 -> 217;
               case 110 -> 171;
               case 111 -> 114;
               case 112 -> 45;
               case 113 -> 179;
               case 114 -> 231;
               case 115 -> 66;
               case 116 -> 220;
               case 117 -> 119;
               case 118 -> 73;
               case 119 -> 53;
               case 120 -> 91;
               case 121 -> 134;
               case 122 -> 57;
               case 123 -> 56;
               case 124 -> 162;
               case 125 -> 172;
               case 126 -> 241;
               case 127 -> 206;
               case 128 -> 215;
               case 129 -> 237;
               case 130 -> 199;
               case 131 -> 148;
               case 132 -> 230;
               case 133 -> 137;
               case 134 -> 159;
               case 135 -> 6;
               case 136 -> 227;
               case 137 -> 118;
               case 138 -> 96;
               case 139 -> 223;
               case 140 -> 29;
               case 141 -> 136;
               case 142 -> 115;
               case 143 -> 120;
               case 144 -> 107;
               case 145 -> 126;
               case 146 -> 203;
               case 147 -> 103;
               case 148 -> 183;
               case 149 -> 198;
               case 150 -> 116;
               case 151 -> 39;
               case 152 -> 226;
               case 153 -> 251;
               case 154 -> 99;
               case 155 -> 239;
               case 156 -> 250;
               case 157 -> 61;
               case 158 -> 246;
               case 159 -> 20;
               case 160 -> 138;
               case 161 -> 178;
               case 162 -> 125;
               case 163 -> 55;
               case 164 -> 252;
               case 165 -> 84;
               case 166 -> 105;
               case 167 -> 9;
               case 168 -> 35;
               case 169 -> 7;
               case 170 -> 242;
               case 171 -> 16;
               case 172 -> 244;
               case 173 -> 214;
               case 174 -> 247;
               case 175 -> 169;
               case 176 -> 34;
               case 177 -> 155;
               case 178 -> 88;
               case 179 -> 41;
               case 180 -> 50;
               case 181 -> 187;
               case 182 -> 71;
               case 183 -> 174;
               case 184 -> 80;
               case 185 -> 4;
               case 186 -> 216;
               case 187 -> 5;
               case 188 -> 158;
               case 189 -> 3;
               case 190 -> 23;
               case 191 -> 201;
               case 192 -> 49;
               case 193 -> 124;
               case 194 -> 200;
               case 195 -> 104;
               case 196 -> 245;
               case 197 -> 21;
               case 198 -> 164;
               case 199 -> 11;
               case 200 -> 191;
               case 201 -> 98;
               case 202 -> 25;
               case 203 -> 89;
               case 204 -> 78;
               case 205 -> 168;
               case 206 -> 15;
               case 207 -> 175;
               case 208 -> 141;
               case 209 -> 58;
               case 210 -> 37;
               case 211 -> 255;
               case 212 -> 121;
               case 213 -> 249;
               case 214 -> 224;
               case 215 -> 76;
               case 216 -> 31;
               case 217 -> 236;
               case 218 -> 18;
               case 219 -> 173;
               case 220 -> 90;
               case 221 -> 238;
               case 222 -> 147;
               case 223 -> 93;
               case 224 -> 14;
               case 225 -> 112;
               case 226 -> 59;
               case 227 -> 205;
               case 228 -> 193;
               case 229 -> 97;
               case 230 -> 196;
               case 231 -> 163;
               case 232 -> 63;
               case 233 -> 47;
               case 234 -> 44;
               case 235 -> 218;
               case 236 -> 128;
               case 237 -> 166;
               case 238 -> 54;
               case 239 -> 195;
               case 240 -> 33;
               case 241 -> 10;
               case 242 -> 228;
               case 243 -> 43;
               case 244 -> 157;
               case 245 -> 165;
               case 246 -> 213;
               case 247 -> 202;
               case 248 -> 87;
               case 249 -> 127;
               case 250 -> 204;
               case 251 -> 110;
               case 252 -> 188;
               case 253 -> 150;
               case 254 -> 232;
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

  // PX-FIX synth restored from jar bytecode
  public static me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl p0, java.util.List p1, java.util.Set p2, java.util.List p3, boolean p4, boolean p5, int p6, java.lang.Object p7) {
    if ((p6 & 16) != 0) { p5 = false; }
    return p0.a(p1, p2, p3, p4, p5);
  }
}
