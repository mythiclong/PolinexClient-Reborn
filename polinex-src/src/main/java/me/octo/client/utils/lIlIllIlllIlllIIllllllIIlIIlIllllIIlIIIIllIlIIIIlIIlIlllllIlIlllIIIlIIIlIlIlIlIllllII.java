package me.octo.client.utils;

import dev.jnic.PdfVaZ.JNICLoader;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.loader.impl.FabricLoaderImpl;
import net.fabricmc.loader.impl.ModContainerImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII {
   @NotNull
   public static lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII() {
   }

   @JvmStatic
   public static final native boolean a(@NotNull String var0);

   private static final native boolean a(String var0, ModContainerImpl var1);

   private static final native boolean a(Function1 var0, Object var1);

   private static final native boolean a(FabricLoaderImpl var0, Map<String, ?> var1, String var2);

   private static final native String b(String var0);

   private static final native void c(String var0);

   private static Exception a(Exception var0) {
      return var0;
   }

   private static native String a(int var0, int var1);

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, String p1, String p2, String p3, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((m & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((m & 4) != 0) {
         p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(p1, p2, p3);
   }

      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String var1, @NotNull String var2, @NotNull String var3
      ) {
         short var10001 = -16191;
         short var10002 = 25129;
         Intrinsics.checkNotNullParameter(var1, "id");
         var10001 = -16192;
         var10002 = 26756;
         Intrinsics.checkNotNullParameter(var2, "name");
         var10001 = -16190;
         var10002 = -29978;
         Intrinsics.checkNotNullParameter(var3, "version");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull String var1, @NotNull String var2, @NotNull String var3
      ) {
         short var10001 = -16186;
         short var10002 = 13541;
         Intrinsics.checkNotNullParameter(var1, "id");
         var10001 = -16185;
         var10002 = -10854;
         Intrinsics.checkNotNullParameter(var2, "name");
         var10001 = -16189;
         var10002 = -20762;
         Intrinsics.checkNotNullParameter(var3, "version");
         return new lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -16183;
         String var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 27239;
         short var10002 = -16188;
         short var10003 = -29302;
         short var10004 = -16187;
         short var10005 = 8106;
         return "ModInfo(id=" + var3 + ", name=" + var2 + ", version=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 == null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "8/\u0004ì¤@Í\u0007§\u001f-(\u000bNß\u0007§3-\u00ad\u000bþß\n(ÜÉ«\böÀ5á\n\u0007\u0016|\u0016»÷f\u0097\u00040\u0019Ûz";
         int var4 = "8/\u0004ì¤@Í\u0007§\u001f-(\u000bNß\u0007§3-\u00ad\u000bþß\n(ÜÉ«\böÀ5á\n\u0007\u0016|\u0016»÷f\u0097\u00040\u0019Ûz".length();
         char var1 = 2;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 72;
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
                        case 0 -> 59;
                        case 1 -> 88;
                        case 2 -> 53;
                        case 3 -> 59;
                        case 4 -> 28;
                        case 5 -> 31;
                        default -> 86;
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

                     var2 = "6+\u000bÎ\u0080ºZÚ\u0084ó{¶Å.";
                     var4 = "6+\u000bÎ\u0080ºZÚ\u0084ó{¶Å.".length();
                     var1 = 2;
                     var8 = -1;
               }

               var10000 = 126;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -16191) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 113;
               case 1 -> 163;
               case 2 -> 53;
               case 3 -> 158;
               case 4 -> 4;
               case 5 -> 175;
               case 6 -> 83;
               case 7 -> 104;
               case 8 -> 1;
               case 9 -> 210;
               case 10 -> 160;
               case 11 -> 189;
               case 12 -> 110;
               case 13 -> 219;
               case 14 -> 253;
               case 15 -> 146;
               case 16 -> 103;
               case 17 -> 171;
               case 18 -> 242;
               case 19 -> 141;
               case 20 -> 90;
               case 21 -> 188;
               case 22 -> 42;
               case 23 -> 66;
               case 24 -> 3;
               case 25 -> 150;
               case 26 -> 165;
               case 27 -> 32;
               case 28 -> 237;
               case 29 -> 130;
               case 30 -> 112;
               case 31 -> 249;
               case 32 -> 162;
               case 33 -> 20;
               case 34 -> 76;
               case 35 -> 29;
               case 36 -> 239;
               case 37 -> 169;
               case 38 -> 234;
               case 39 -> 196;
               case 40 -> 52;
               case 41 -> 8;
               case 42 -> 70;
               case 43 -> 33;
               case 44 -> 18;
               case 45 -> 91;
               case 46 -> 58;
               case 47 -> 213;
               case 48 -> 156;
               case 49 -> 107;
               case 50 -> 248;
               case 51 -> 198;
               case 52 -> 216;
               case 53 -> 38;
               case 54 -> 84;
               case 55 -> 128;
               case 56 -> 140;
               case 57 -> 50;
               case 58 -> 129;
               case 59 -> 222;
               case 60 -> 243;
               case 61 -> 211;
               case 62 -> 252;
               case 63 -> 46;
               case 64 -> 176;
               case 65 -> 187;
               case 66 -> 14;
               case 67 -> 109;
               case 68 -> 125;
               case 69 -> 92;
               case 70 -> 155;
               case 71 -> 111;
               case 72 -> 251;
               case 73 -> 62;
               case 74 -> 218;
               case 75 -> 7;
               case 76 -> 183;
               case 77 -> 136;
               case 78 -> 173;
               case 79 -> 89;
               case 80 -> 99;
               case 81 -> 138;
               case 82 -> 19;
               case 83 -> 47;
               case 84 -> 207;
               case 85 -> 61;
               case 86 -> 152;
               case 87 -> 159;
               case 88 -> 148;
               case 89 -> 105;
               case 90 -> 236;
               case 91 -> 51;
               case 92 -> 87;
               case 93 -> 230;
               case 94 -> 102;
               case 95 -> 93;
               case 96 -> 209;
               case 97 -> 88;
               case 98 -> 233;
               case 99 -> 23;
               case 100 -> 122;
               case 101 -> 65;
               case 102 -> 34;
               case 103 -> 49;
               case 104 -> 35;
               case 105 -> 94;
               case 106 -> 22;
               case 107 -> 124;
               case 108 -> 63;
               case 109 -> 11;
               case 110 -> 55;
               case 111 -> 144;
               case 112 -> 30;
               case 113 -> 21;
               case 114 -> 181;
               case 115 -> 203;
               case 116 -> 75;
               case 117 -> 229;
               case 118 -> 96;
               case 119 -> 0;
               case 120 -> 135;
               case 121 -> 67;
               case 122 -> 151;
               case 123 -> 9;
               case 124 -> 145;
               case 125 -> 71;
               case 126 -> 245;
               case 127 -> 28;
               case 128 -> 123;
               case 129 -> 204;
               case 130 -> 197;
               case 131 -> 24;
               case 132 -> 126;
               case 133 -> 250;
               case 134 -> 235;
               case 135 -> 170;
               case 136 -> 74;
               case 137 -> 115;
               case 138 -> 78;
               case 139 -> 161;
               case 140 -> 241;
               case 141 -> 12;
               case 142 -> 17;
               case 143 -> 132;
               case 144 -> 225;
               case 145 -> 27;
               case 146 -> 127;
               case 147 -> 59;
               case 148 -> 120;
               case 149 -> 244;
               case 150 -> 98;
               case 151 -> 149;
               case 152 -> 69;
               case 153 -> 56;
               case 154 -> 231;
               case 155 -> 82;
               case 156 -> 57;
               case 157 -> 179;
               case 158 -> 101;
               case 159 -> 147;
               case 160 -> 202;
               case 161 -> 143;
               case 162 -> 182;
               case 163 -> 254;
               case 164 -> 191;
               case 165 -> 238;
               case 166 -> 142;
               case 167 -> 64;
               case 168 -> 221;
               case 169 -> 81;
               case 170 -> 25;
               case 171 -> 226;
               case 172 -> 85;
               case 173 -> 240;
               case 174 -> 227;
               case 175 -> 174;
               case 176 -> 118;
               case 177 -> 228;
               case 178 -> 186;
               case 179 -> 199;
               case 180 -> 44;
               case 181 -> 80;
               case 182 -> 167;
               case 183 -> 121;
               case 184 -> 133;
               case 185 -> 95;
               case 186 -> 86;
               case 187 -> 246;
               case 188 -> 164;
               case 189 -> 193;
               case 190 -> 200;
               case 191 -> 208;
               case 192 -> 41;
               case 193 -> 5;
               case 194 -> 60;
               case 195 -> 106;
               case 196 -> 172;
               case 197 -> 180;
               case 198 -> 15;
               case 199 -> 255;
               case 200 -> 217;
               case 201 -> 220;
               case 202 -> 31;
               case 203 -> 192;
               case 204 -> 195;
               case 205 -> 36;
               case 206 -> 100;
               case 207 -> 137;
               case 208 -> 43;
               case 209 -> 72;
               case 210 -> 224;
               case 211 -> 117;
               case 212 -> 68;
               case 213 -> 206;
               case 214 -> 108;
               case 215 -> 247;
               case 216 -> 157;
               case 217 -> 39;
               case 218 -> 194;
               case 219 -> 13;
               case 220 -> 178;
               case 221 -> 77;
               case 222 -> 214;
               case 223 -> 114;
               case 224 -> 232;
               case 225 -> 166;
               case 226 -> 26;
               case 227 -> 37;
               case 228 -> 185;
               case 229 -> 215;
               case 230 -> 119;
               case 231 -> 79;
               case 232 -> 48;
               case 233 -> 2;
               case 234 -> 10;
               case 235 -> 73;
               case 236 -> 201;
               case 237 -> 116;
               case 238 -> 184;
               case 239 -> 190;
               case 240 -> 205;
               case 241 -> 40;
               case 242 -> 168;
               case 243 -> 223;
               case 244 -> 177;
               case 245 -> 212;
               case 246 -> 131;
               case 247 -> 153;
               case 248 -> 134;
               case 249 -> 54;
               case 250 -> 45;
               case 251 -> 154;
               case 252 -> 139;
               case 253 -> 97;
               case 254 -> 16;
               default -> 6;
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

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicClinit() {
    }

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    private static void $jnicLoader() {
    }
}
