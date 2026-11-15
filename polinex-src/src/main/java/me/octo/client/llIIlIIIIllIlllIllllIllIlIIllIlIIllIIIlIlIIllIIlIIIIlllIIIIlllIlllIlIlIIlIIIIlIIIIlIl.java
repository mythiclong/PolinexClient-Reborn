package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlin.jvm.JvmStatic;

@Serializable
public final class llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl
   implements lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll {

   @NotNull
   public static llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private Double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private Double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   public llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl(
      @NotNull String var1, @NotNull String var2, @Nullable Double var3, int var4, @Nullable Double var5
   ) {
      short var10001 = -4664;
      short var10002 = 11210;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = -4660;
      var10002 = -17447;
      Intrinsics.checkNotNullParameter(var2, "displayName");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
   }

   @NotNull
   @Override
   public String a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   @Override
   public String b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   @Override
   public Double c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Override
   public void a(@Nullable Double var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   @Override
   public int d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @Nullable
   @Override
   public Double e() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @Override
   public void b(@Nullable Double var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   @NotNull
   public final String i() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String j() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final Double k() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final int l() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @Nullable
   public final Double m() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl a(
      @NotNull String var1, @NotNull String var2, @Nullable Double var3, int var4, @Nullable Double var5
   ) {
      short var10001 = -4669;
      short var10002 = 29347;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = -4662;
      var10002 = 11974;
      Intrinsics.checkNotNullParameter(var2, "displayName");
      return new llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl(var1, var2, var3, var4, var5);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = -4658;
      Double var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Double var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      String var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10001 = 29245;
      short var10002 = -4661;
      short var10003 = 10506;
      short var10004 = -4659;
      short var10005 = 24565;
      short var10006 = -4657;
      short var10007 = 6084;
      short var10008 = -4663;
      short var10009 = -27700;
      return "MuseumSpecial(id=" + var5 + ", displayName=" + var4 + ", price=" + var3 + ", xp=" + var2 + ", pricePerXP=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      String var1;
      int var6;
      int var8;
      label25: {
         String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var10000;
         var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
         var6 = var2 * 31;
         Double var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               var8 = 0;
               break label25;
            }

            var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         var8 = var10001.hashCode();
      }

      int var4 = var6 + var8;
      var4 = var4 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      var6 = var4 * 31;
      Double var9 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var1 != null) {
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
            return var6 + 0;
         }

         var9 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      return var6 + var9.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl)) {
            return false;
         }

         var10000 = var1;
      }

      llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl var3 = (llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl)var10000;
      int var4 = ((Intrinsics.areEqual(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      )) ? 1 : 0);
      if (var2 != null) {
         if (var4 == 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var4 == 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var4 == 0) {
            return false;
         }

         var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      if (var2 != null) {
         if (var4 != var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var4 == 0) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "Ms\u0089!l`p@¿æÂð\u0000o\u000bº\u009a!e\u0093Ãf(Ò\u0002p\r\u0019\u0007\u0017´3¹Ë;ü¢\fþ\u009f\u0002J³\u0005Ç1Äp\u0014\u0011\\\fñ=\u0090s\u0016\u008d·AT\u0080Òù\u0081_¤\bm^\u0099\u009fâÜñú";
      int var4 = "Ms\u0089!l`p@¿æÂð\u0000o\u000bº\u009a!e\u0093Ãf(Ò\u0002p\r\u0019\u0007\u0017´3¹Ë;ü¢\fþ\u009f\u0002J³\u0005Ç1Äp\u0014\u0011\\\fñ=\u0090s\u0016\u008d·AT\u0080Òù\u0081_¤\bm^\u0099\u009fâÜñú"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 32;
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
                     case 0 -> 117;
                     case 1 -> 32;
                     case 2 -> 103;
                     case 3 -> 34;
                     case 4 -> 14;
                     case 5 -> 16;
                     default -> 105;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (Object) null
                     );
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

                  var2 = "Ycpw\u0094¬«èF7Ï\u0002<»";
                  var4 = "Ycpw\u0094¬«èF7Ï\u0002<»".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 8;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4661) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 50;
            case 1 -> 164;
            case 2 -> 221;
            case 3 -> 83;
            case 4 -> 101;
            case 5 -> 37;
            case 6 -> 121;
            case 7 -> 33;
            case 8 -> 52;
            case 9 -> 249;
            case 10 -> 162;
            case 11 -> 91;
            case 12 -> 31;
            case 13 -> 97;
            case 14 -> 95;
            case 15 -> 24;
            case 16 -> 25;
            case 17 -> 124;
            case 18 -> 67;
            case 19 -> 169;
            case 20 -> 112;
            case 21 -> 233;
            case 22 -> 197;
            case 23 -> 14;
            case 24 -> 214;
            case 25 -> 79;
            case 26 -> 172;
            case 27 -> 170;
            case 28 -> 20;
            case 29 -> 187;
            case 30 -> 218;
            case 31 -> 84;
            case 32 -> 155;
            case 33 -> 78;
            case 34 -> 27;
            case 35 -> 217;
            case 36 -> 153;
            case 37 -> 134;
            case 38 -> 75;
            case 39 -> 133;
            case 40 -> 115;
            case 41 -> 85;
            case 42 -> 104;
            case 43 -> 247;
            case 44 -> 226;
            case 45 -> 19;
            case 46 -> 216;
            case 47 -> 71;
            case 48 -> 2;
            case 49 -> 194;
            case 50 -> 64;
            case 51 -> 149;
            case 52 -> 251;
            case 53 -> 46;
            case 54 -> 117;
            case 55 -> 61;
            case 56 -> 225;
            case 57 -> 157;
            case 58 -> 222;
            case 59 -> 62;
            case 60 -> 99;
            case 61 -> 185;
            case 62 -> 220;
            case 63 -> 43;
            case 64 -> 92;
            case 65 -> 123;
            case 66 -> 42;
            case 67 -> 60;
            case 68 -> 30;
            case 69 -> 49;
            case 70 -> 142;
            case 71 -> 173;
            case 72 -> 224;
            case 73 -> 210;
            case 74 -> 39;
            case 75 -> 10;
            case 76 -> 108;
            case 77 -> 160;
            case 78 -> 5;
            case 79 -> 102;
            case 80 -> 175;
            case 81 -> 21;
            case 82 -> 207;
            case 83 -> 1;
            case 84 -> 77;
            case 85 -> 130;
            case 86 -> 110;
            case 87 -> 98;
            case 88 -> 146;
            case 89 -> 242;
            case 90 -> 240;
            case 91 -> 7;
            case 92 -> 36;
            case 93 -> 103;
            case 94 -> 192;
            case 95 -> 234;
            case 96 -> 41;
            case 97 -> 109;
            case 98 -> 68;
            case 99 -> 11;
            case 100 -> 23;
            case 101 -> 129;
            case 102 -> 219;
            case 103 -> 96;
            case 104 -> 63;
            case 105 -> 45;
            case 106 -> 28;
            case 107 -> 118;
            case 108 -> 13;
            case 109 -> 228;
            case 110 -> 239;
            case 111 -> 179;
            case 112 -> 137;
            case 113 -> 80;
            case 114 -> 90;
            case 115 -> 54;
            case 116 -> 65;
            case 117 -> 237;
            case 118 -> 195;
            case 119 -> 198;
            case 120 -> 57;
            case 121 -> 126;
            case 122 -> 141;
            case 123 -> 158;
            case 124 -> 140;
            case 125 -> 180;
            case 126 -> 211;
            case 127 -> 206;
            case 128 -> 238;
            case 129 -> 213;
            case 130 -> 70;
            case 131 -> 161;
            case 132 -> 252;
            case 133 -> 107;
            case 134 -> 191;
            case 135 -> 166;
            case 136 -> 4;
            case 137 -> 16;
            case 138 -> 188;
            case 139 -> 127;
            case 140 -> 231;
            case 141 -> 255;
            case 142 -> 181;
            case 143 -> 93;
            case 144 -> 8;
            case 145 -> 116;
            case 146 -> 6;
            case 147 -> 47;
            case 148 -> 113;
            case 149 -> 125;
            case 150 -> 143;
            case 151 -> 150;
            case 152 -> 245;
            case 153 -> 167;
            case 154 -> 203;
            case 155 -> 132;
            case 156 -> 171;
            case 157 -> 72;
            case 158 -> 241;
            case 159 -> 223;
            case 160 -> 186;
            case 161 -> 139;
            case 162 -> 154;
            case 163 -> 202;
            case 164 -> 147;
            case 165 -> 119;
            case 166 -> 9;
            case 167 -> 253;
            case 168 -> 196;
            case 169 -> 184;
            case 170 -> 135;
            case 171 -> 0;
            case 172 -> 193;
            case 173 -> 111;
            case 174 -> 204;
            case 175 -> 89;
            case 176 -> 55;
            case 177 -> 15;
            case 178 -> 232;
            case 179 -> 248;
            case 180 -> 178;
            case 181 -> 53;
            case 182 -> 165;
            case 183 -> 22;
            case 184 -> 156;
            case 185 -> 114;
            case 186 -> 74;
            case 187 -> 120;
            case 188 -> 128;
            case 189 -> 131;
            case 190 -> 212;
            case 191 -> 51;
            case 192 -> 88;
            case 193 -> 40;
            case 194 -> 144;
            case 195 -> 246;
            case 196 -> 58;
            case 197 -> 208;
            case 198 -> 148;
            case 199 -> 76;
            case 200 -> 100;
            case 201 -> 163;
            case 202 -> 244;
            case 203 -> 168;
            case 204 -> 66;
            case 205 -> 94;
            case 206 -> 56;
            case 207 -> 235;
            case 208 -> 254;
            case 209 -> 205;
            case 210 -> 105;
            case 211 -> 176;
            case 212 -> 177;
            case 213 -> 190;
            case 214 -> 209;
            case 215 -> 138;
            case 216 -> 48;
            case 217 -> 3;
            case 218 -> 200;
            case 219 -> 86;
            case 220 -> 32;
            case 221 -> 136;
            case 222 -> 106;
            case 223 -> 215;
            case 224 -> 227;
            case 225 -> 182;
            case 226 -> 87;
            case 227 -> 38;
            case 228 -> 250;
            case 229 -> 29;
            case 230 -> 35;
            case 231 -> 159;
            case 232 -> 145;
            case 233 -> 73;
            case 234 -> 122;
            case 235 -> 199;
            case 236 -> 81;
            case 237 -> 34;
            case 238 -> 151;
            case 239 -> 59;
            case 240 -> 12;
            case 241 -> 69;
            case 242 -> 17;
            case 243 -> 152;
            case 244 -> 82;
            case 245 -> 183;
            case 246 -> 230;
            case 247 -> 189;
            case 248 -> 229;
            case 249 -> 243;
            case 250 -> 18;
            case 251 -> 236;
            case 252 -> 26;
            case 253 -> 201;
            case 254 -> 44;
            default -> 174;
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


   // PX-RESTORE TOPc: Kotlin @Serializable 合成成员，语义按 jar 字节码还原（javap -p -c）。
   public llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl(String var1, String var2, Double var3, int var4, Double var5, int var6, DefaultConstructorMarker var7) {
      if ((var6 & 4) != 0) {
         var3 = 0.0;
      }
      if ((var6 & 8) != 0) {
         var4 = 0;
      }
      if ((var6 & 16) != 0) {
         var5 = 0.0;
      }
      this(var1, var2, var3, var4, var5);
   }

   public llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl(int var1, String var2, String var3, Double var4, int var5, Double var6, SerializationConstructorMarker var7) {
      if (3 != (3 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 3, ((GeneratedSerializer)llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).getDescriptor());
      }
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (var1 & 4) != 0 ? var4 : 0.0;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (var1 & 8) != 0 ? var5 : 0;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (var1 & 16) != 0 ? var6 : 0.0;
   }

   public static final void a(@NotNull llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl var0, @NotNull CompositeEncoder var1, @NotNull SerialDescriptor var2) {
      var1.encodeStringElement(var2, 0, var0.a());
      var1.encodeStringElement(var2, 1, var0.b());
      if (var1.shouldEncodeElementDefault(var2, 2) || !Intrinsics.areEqual((Object)var0.c(), (Object)0.0)) {
         var1.encodeNullableSerializableElement(var2, 2, (SerializationStrategy)DoubleSerializer.INSTANCE, var0.c());
      }
      if (var1.shouldEncodeElementDefault(var2, 3) || var0.d() != 0) {
         var1.encodeIntElement(var2, 3, var0.d());
      }
      if (var1.shouldEncodeElementDefault(var2, 4) || !Intrinsics.areEqual((Object)var0.e(), (Object)0.0)) {
         var1.encodeNullableSerializableElement(var2, 4, (SerializationStrategy)DoubleSerializer.INSTANCE, var0.e());
      }
   }

   @JvmStatic
   public static llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl a(@NotNull llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl var0, String var1, String var2, Double var3, int var4, Double var5, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         var1 = var0.i();
      }
      if ((var6 & 2) != 0) {
         var2 = var0.j();
      }
      if ((var6 & 4) != 0) {
         var3 = var0.k();
      }
      if ((var6 & 8) != 0) {
         var4 = var0.l();
      }
      if ((var6 & 16) != 0) {
         var5 = var0.m();
      }
      return var0.a(var1, var2, var3, var4, var5);
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("id"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void f() {
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("display_name"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void g() {
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("bin"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void h() {
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final KSerializer<llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl> a() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
         return (KSerializer<llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl>)llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
   }
}
