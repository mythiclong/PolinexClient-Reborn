package me.octo.client.utils;

import dev.jnic.PdfVaZ.JNICLoader;
import java.io.File;
import java.net.http.HttpClient;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl {
   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

   @NotNull
   public static lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static HttpClient lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   private lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl() {
   }

   @JvmStatic
   @NotNull
   public static final native lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      @NotNull File var0, @NotNull String var1, @NotNull String var2, @NotNull String var3
   );

   private final native lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      File var1, String var2, String var3
   );

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static native String a(int var0, int var1);

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      // PX-FIX RC4-47: masked default-arg constructor restored from jar bytecode (descriptor (ZLjava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V)
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(boolean p1, java.lang.String p2, java.lang.Integer p3, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
      if ((mask & 4) != 0) { p3 = null; }
      this(p1, p2, p3);
      }
      // PX-FIX RC4-47: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/utils/lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lme/octo/client/utils/lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll self, boolean p1, java.lang.String p2, java.lang.Integer p3, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if ((mask & 4) != 0) { p3 = self.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      return self.a(p1, p2, p3);
      }
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(boolean var1, @Nullable String var2, @Nullable Integer var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         boolean var1, @Nullable String var2, @Nullable Integer var3
      ) {
         return new lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 16802;
         Integer var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -9243;
         short var10002 = 16800;
         short var10003 = -29009;
         short var10004 = 16801;
         short var10005 = 26056;
         return "UploadResult(success=" + var3 + ", viewUrl=" + var2 + ", viewUrlExpiresInSeconds=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         boolean var1;
         int var4;
         int var6;
         label25: {
            boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
            int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var4 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var6 = 0;
                  break label25;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var6 = var10001.hashCode();
         }

         int var3 = var4 + var6;
         var4 = var3 * 31;
         Integer var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var1) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
               return var4 + 0;
            }

            var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return var4 + var7.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2) {
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
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "`]\u008e*2Z\u001dMîõ\u001aGþj^®Ô\u008e\u009c\u009c·ÆUêa\u0091½ï\bðë\u00836Ï}åD\u0015#\nª\u009cëY¥K\u0001\u0088\u009d\u0080V^\u007fk\nË\u0003ï\u0087";
         int var4 = "`]\u008e*2Z\u001dMîõ\u001aGþj^®Ô\u008e\u009c\u009c·ÆUêa\u0091½ï\bðë\u00836Ï}åD\u0015#\nª\u009cëY¥K\u0001\u0088\u009d\u0080V^\u007fk\nË\u0003ï\u0087"
            .length();
         char var1 = '\n';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 9;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 9;
                  var10006 = var6;
               } else {
                  var13 = 9;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 9;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 105;
                     case 1 -> 127;
                     case 2 -> 88;
                     case 3 -> 11;
                     case 4 -> 29;
                     case 5 -> 101;
                     default -> 76;
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
               b = new String[3];
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 16800) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 131;
               case 1 -> 144;
               case 2 -> 237;
               case 3 -> 22;
               case 4 -> 108;
               case 5 -> 206;
               case 6 -> 3;
               case 7 -> 208;
               case 8 -> 104;
               case 9 -> 162;
               case 10 -> 211;
               case 11 -> 155;
               case 12 -> 103;
               case 13 -> 45;
               case 14 -> 35;
               case 15 -> 245;
               case 16 -> 91;
               case 17 -> 88;
               case 18 -> 4;
               case 19 -> 54;
               case 20 -> 229;
               case 21 -> 110;
               case 22 -> 92;
               case 23 -> 171;
               case 24 -> 42;
               case 25 -> 158;
               case 26 -> 53;
               case 27 -> 65;
               case 28 -> 186;
               case 29 -> 27;
               case 30 -> 102;
               case 31 -> 143;
               case 32 -> 50;
               case 33 -> 219;
               case 34 -> 253;
               case 35 -> 160;
               case 36 -> 98;
               case 37 -> 169;
               case 38 -> 46;
               case 39 -> 189;
               case 40 -> 96;
               case 41 -> 52;
               case 42 -> 168;
               case 43 -> 77;
               case 44 -> 41;
               case 45 -> 148;
               case 46 -> 152;
               case 47 -> 134;
               case 48 -> 137;
               case 49 -> 184;
               case 50 -> 230;
               case 51 -> 30;
               case 52 -> 120;
               case 53 -> 93;
               case 54 -> 157;
               case 55 -> 81;
               case 56 -> 190;
               case 57 -> 154;
               case 58 -> 73;
               case 59 -> 199;
               case 60 -> 176;
               case 61 -> 28;
               case 62 -> 61;
               case 63 -> 218;
               case 64 -> 63;
               case 65 -> 128;
               case 66 -> 39;
               case 67 -> 207;
               case 68 -> 251;
               case 69 -> 179;
               case 70 -> 118;
               case 71 -> 16;
               case 72 -> 8;
               case 73 -> 216;
               case 74 -> 71;
               case 75 -> 7;
               case 76 -> 49;
               case 77 -> 126;
               case 78 -> 89;
               case 79 -> 180;
               case 80 -> 135;
               case 81 -> 225;
               case 82 -> 13;
               case 83 -> 122;
               case 84 -> 149;
               case 85 -> 249;
               case 86 -> 174;
               case 87 -> 223;
               case 88 -> 242;
               case 89 -> 68;
               case 90 -> 94;
               case 91 -> 36;
               case 92 -> 163;
               case 93 -> 183;
               case 94 -> 100;
               case 95 -> 153;
               case 96 -> 113;
               case 97 -> 107;
               case 98 -> 203;
               case 99 -> 57;
               case 100 -> 112;
               case 101 -> 25;
               case 102 -> 215;
               case 103 -> 59;
               case 104 -> 244;
               case 105 -> 151;
               case 106 -> 167;
               case 107 -> 156;
               case 108 -> 255;
               case 109 -> 43;
               case 110 -> 214;
               case 111 -> 212;
               case 112 -> 150;
               case 113 -> 106;
               case 114 -> 67;
               case 115 -> 226;
               case 116 -> 238;
               case 117 -> 32;
               case 118 -> 101;
               case 119 -> 165;
               case 120 -> 0;
               case 121 -> 130;
               case 122 -> 185;
               case 123 -> 111;
               case 124 -> 119;
               case 125 -> 252;
               case 126 -> 105;
               case 127 -> 221;
               case 128 -> 29;
               case 129 -> 205;
               case 130 -> 11;
               case 131 -> 198;
               case 132 -> 220;
               case 133 -> 23;
               case 134 -> 170;
               case 135 -> 6;
               case 136 -> 74;
               case 137 -> 58;
               case 138 -> 76;
               case 139 -> 34;
               case 140 -> 141;
               case 141 -> 166;
               case 142 -> 114;
               case 143 -> 62;
               case 144 -> 210;
               case 145 -> 117;
               case 146 -> 233;
               case 147 -> 181;
               case 148 -> 51;
               case 149 -> 133;
               case 150 -> 44;
               case 151 -> 247;
               case 152 -> 70;
               case 153 -> 48;
               case 154 -> 75;
               case 155 -> 188;
               case 156 -> 121;
               case 157 -> 55;
               case 158 -> 85;
               case 159 -> 235;
               case 160 -> 24;
               case 161 -> 5;
               case 162 -> 127;
               case 163 -> 195;
               case 164 -> 82;
               case 165 -> 140;
               case 166 -> 246;
               case 167 -> 231;
               case 168 -> 90;
               case 169 -> 191;
               case 170 -> 164;
               case 171 -> 115;
               case 172 -> 236;
               case 173 -> 21;
               case 174 -> 241;
               case 175 -> 213;
               case 176 -> 194;
               case 177 -> 64;
               case 178 -> 227;
               case 179 -> 1;
               case 180 -> 209;
               case 181 -> 123;
               case 182 -> 97;
               case 183 -> 201;
               case 184 -> 222;
               case 185 -> 250;
               case 186 -> 200;
               case 187 -> 187;
               case 188 -> 14;
               case 189 -> 204;
               case 190 -> 202;
               case 191 -> 60;
               case 192 -> 69;
               case 193 -> 33;
               case 194 -> 31;
               case 195 -> 79;
               case 196 -> 178;
               case 197 -> 95;
               case 198 -> 136;
               case 199 -> 83;
               case 200 -> 2;
               case 201 -> 18;
               case 202 -> 80;
               case 203 -> 145;
               case 204 -> 173;
               case 205 -> 248;
               case 206 -> 177;
               case 207 -> 40;
               case 208 -> 224;
               case 209 -> 139;
               case 210 -> 47;
               case 211 -> 161;
               case 212 -> 228;
               case 213 -> 78;
               case 214 -> 84;
               case 215 -> 172;
               case 216 -> 254;
               case 217 -> 142;
               case 218 -> 109;
               case 219 -> 196;
               case 220 -> 240;
               case 221 -> 9;
               case 222 -> 12;
               case 223 -> 125;
               case 224 -> 99;
               case 225 -> 116;
               case 226 -> 182;
               case 227 -> 56;
               case 228 -> 20;
               case 229 -> 86;
               case 230 -> 17;
               case 231 -> 87;
               case 232 -> 239;
               case 233 -> 243;
               case 234 -> 138;
               case 235 -> 217;
               case 236 -> 192;
               case 237 -> 193;
               case 238 -> 124;
               case 239 -> 37;
               case 240 -> 129;
               case 241 -> 15;
               case 242 -> 19;
               case 243 -> 175;
               case 244 -> 72;
               case 245 -> 26;
               case 246 -> 197;
               case 247 -> 38;
               case 248 -> 146;
               case 249 -> 232;
               case 250 -> 10;
               case 251 -> 147;
               case 252 -> 159;
               case 253 -> 132;
               case 254 -> 66;
               default -> 234;
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
