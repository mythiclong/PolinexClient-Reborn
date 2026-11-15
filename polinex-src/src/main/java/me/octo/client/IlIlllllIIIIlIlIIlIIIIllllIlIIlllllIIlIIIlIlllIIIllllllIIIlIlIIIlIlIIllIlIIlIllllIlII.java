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
public final class IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII
   implements lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll {
   public static me.octo.client.IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX missing field (typed to WhenMappings)

   @NotNull
   public static IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
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

   public IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII(
      @NotNull String var1, @NotNull String var2, @Nullable Double var3, int var4, @Nullable Double var5
   ) {
      short var10001 = -4737;
      short var10002 = -30151;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = -4751;
      var10002 = 26086;
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
   public final IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII a(
      @NotNull String var1, @NotNull String var2, @Nullable Double var3, int var4, @Nullable Double var5
   ) {
      short var10001 = -4739;
      short var10002 = 23187;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = -4738;
      var10002 = 17941;
      Intrinsics.checkNotNullParameter(var2, "displayName");
      return new IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII(var1, var2, var3, var4, var5);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = -4742;
      Double var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Double var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      String var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10001 = -2559;
      short var10002 = -4744;
      short var10003 = 1957;
      short var10004 = -4741;
      short var10005 = -21642;
      short var10006 = -4743;
      short var10007 = -32532;
      short var10008 = -4740;
      short var10009 = -15959;
      return "ArmorPiece(id=" + var5 + ", displayName=" + var4 + ", price=" + var3 + ", xp=" + var2 + ", pricePerXP=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      String var1;
      int var6;
      int var8;
      label25: {
         String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
         var1 = var10000;
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
         if (!(var10000 instanceof IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII)) {
            return false;
         }

         var10000 = var1;
      }

      IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII var3 = (IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII)var10000;
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
      String var2 = "{Â6Ò\u0017\u000eòy\u001b¼c\u007fä#Þï2\u008c²\u0095\b+S4â\nß\u0099\u001a\u000e\u008b\u0082ýÝ\u0096µ~Z2o¿ÖbZ\u0002_ª\r:\u007f\u0016gNo\u0011aT\u008cÅf\n\u0002°M";
      int var4 = "{Â6Ò\u0017\u000eòy\u001b¼c\u007fä#Þï2\u008c²\u0095\b+S4â\nß\u0099\u001a\u000e\u008b\u0082ýÝ\u0096µ~Z2o¿ÖbZ\u0002_ª\r:\u007f\u0016gNo\u0011aT\u008cÅf\n\u0002°M"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 34;
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
                     case 0 -> 31;
                     case 1 -> 62;
                     case 2 -> 13;
                     case 3 -> 127;
                     case 4 -> 92;
                     case 5 -> 85;
                     default -> 20;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
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

                  var2 = "ÜÃ\u0005\u001fÇ\u00ad\u0014èâò'\u000bó\\àì{Ó\u0083'\u0010\u000by";
                  var4 = "ÜÃ\u0005\u001fÇ\u00ad\u0014èâò'\u000bó\\àì{Ó\u0083'\u0010\u000by".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 46;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4743) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 158;
            case 1 -> 28;
            case 2 -> 61;
            case 3 -> 174;
            case 4 -> 144;
            case 5 -> 110;
            case 6 -> 96;
            case 7 -> 126;
            case 8 -> 131;
            case 9 -> 189;
            case 10 -> 48;
            case 11 -> 167;
            case 12 -> 66;
            case 13 -> 24;
            case 14 -> 121;
            case 15 -> 51;
            case 16 -> 101;
            case 17 -> 95;
            case 18 -> 83;
            case 19 -> 154;
            case 20 -> 71;
            case 21 -> 169;
            case 22 -> 60;
            case 23 -> 1;
            case 24 -> 152;
            case 25 -> 230;
            case 26 -> 215;
            case 27 -> 117;
            case 28 -> 26;
            case 29 -> 119;
            case 30 -> 109;
            case 31 -> 252;
            case 32 -> 198;
            case 33 -> 92;
            case 34 -> 206;
            case 35 -> 88;
            case 36 -> 211;
            case 37 -> 33;
            case 38 -> 148;
            case 39 -> 25;
            case 40 -> 254;
            case 41 -> 248;
            case 42 -> 246;
            case 43 -> 41;
            case 44 -> 116;
            case 45 -> 98;
            case 46 -> 73;
            case 47 -> 133;
            case 48 -> 46;
            case 49 -> 35;
            case 50 -> 220;
            case 51 -> 127;
            case 52 -> 160;
            case 53 -> 213;
            case 54 -> 103;
            case 55 -> 70;
            case 56 -> 15;
            case 57 -> 54;
            case 58 -> 156;
            case 59 -> 86;
            case 60 -> 223;
            case 61 -> 203;
            case 62 -> 114;
            case 63 -> 37;
            case 64 -> 17;
            case 65 -> 172;
            case 66 -> 232;
            case 67 -> 31;
            case 68 -> 184;
            case 69 -> 196;
            case 70 -> 130;
            case 71 -> 164;
            case 72 -> 42;
            case 73 -> 192;
            case 74 -> 13;
            case 75 -> 205;
            case 76 -> 105;
            case 77 -> 153;
            case 78 -> 49;
            case 79 -> 94;
            case 80 -> 45;
            case 81 -> 134;
            case 82 -> 250;
            case 83 -> 179;
            case 84 -> 242;
            case 85 -> 80;
            case 86 -> 165;
            case 87 -> 178;
            case 88 -> 231;
            case 89 -> 34;
            case 90 -> 170;
            case 91 -> 146;
            case 92 -> 209;
            case 93 -> 125;
            case 94 -> 190;
            case 95 -> 53;
            case 96 -> 214;
            case 97 -> 138;
            case 98 -> 136;
            case 99 -> 226;
            case 100 -> 171;
            case 101 -> 39;
            case 102 -> 22;
            case 103 -> 19;
            case 104 -> 9;
            case 105 -> 222;
            case 106 -> 77;
            case 107 -> 87;
            case 108 -> 2;
            case 109 -> 91;
            case 110 -> 173;
            case 111 -> 176;
            case 112 -> 113;
            case 113 -> 7;
            case 114 -> 36;
            case 115 -> 255;
            case 116 -> 74;
            case 117 -> 208;
            case 118 -> 30;
            case 119 -> 147;
            case 120 -> 185;
            case 121 -> 32;
            case 122 -> 38;
            case 123 -> 233;
            case 124 -> 44;
            case 125 -> 218;
            case 126 -> 63;
            case 127 -> 151;
            case 128 -> 241;
            case 129 -> 59;
            case 130 -> 102;
            case 131 -> 210;
            case 132 -> 141;
            case 133 -> 11;
            case 134 -> 23;
            case 135 -> 193;
            case 136 -> 93;
            case 137 -> 52;
            case 138 -> 253;
            case 139 -> 99;
            case 140 -> 5;
            case 141 -> 85;
            case 142 -> 200;
            case 143 -> 166;
            case 144 -> 183;
            case 145 -> 12;
            case 146 -> 135;
            case 147 -> 139;
            case 148 -> 3;
            case 149 -> 56;
            case 150 -> 47;
            case 151 -> 145;
            case 152 -> 107;
            case 153 -> 195;
            case 154 -> 20;
            case 155 -> 157;
            case 156 -> 197;
            case 157 -> 180;
            case 158 -> 221;
            case 159 -> 199;
            case 160 -> 72;
            case 161 -> 120;
            case 162 -> 207;
            case 163 -> 225;
            case 164 -> 57;
            case 165 -> 65;
            case 166 -> 129;
            case 167 -> 187;
            case 168 -> 124;
            case 169 -> 82;
            case 170 -> 6;
            case 171 -> 149;
            case 172 -> 90;
            case 173 -> 68;
            case 174 -> 228;
            case 175 -> 168;
            case 176 -> 111;
            case 177 -> 247;
            case 178 -> 227;
            case 179 -> 204;
            case 180 -> 219;
            case 181 -> 150;
            case 182 -> 10;
            case 183 -> 244;
            case 184 -> 235;
            case 185 -> 122;
            case 186 -> 132;
            case 187 -> 106;
            case 188 -> 236;
            case 189 -> 97;
            case 190 -> 186;
            case 191 -> 212;
            case 192 -> 202;
            case 193 -> 123;
            case 194 -> 64;
            case 195 -> 8;
            case 196 -> 251;
            case 197 -> 55;
            case 198 -> 137;
            case 199 -> 234;
            case 200 -> 163;
            case 201 -> 79;
            case 202 -> 243;
            case 203 -> 182;
            case 204 -> 29;
            case 205 -> 50;
            case 206 -> 239;
            case 207 -> 194;
            case 208 -> 245;
            case 209 -> 40;
            case 210 -> 240;
            case 211 -> 229;
            case 212 -> 18;
            case 213 -> 115;
            case 214 -> 89;
            case 215 -> 112;
            case 216 -> 76;
            case 217 -> 161;
            case 218 -> 175;
            case 219 -> 14;
            case 220 -> 159;
            case 221 -> 177;
            case 222 -> 249;
            case 223 -> 162;
            case 224 -> 155;
            case 225 -> 224;
            case 226 -> 16;
            case 227 -> 58;
            case 228 -> 191;
            case 229 -> 0;
            case 230 -> 238;
            case 231 -> 62;
            case 232 -> 81;
            case 233 -> 67;
            case 234 -> 143;
            case 235 -> 78;
            case 236 -> 108;
            case 237 -> 140;
            case 238 -> 142;
            case 239 -> 201;
            case 240 -> 4;
            case 241 -> 21;
            case 242 -> 43;
            case 243 -> 188;
            case 244 -> 216;
            case 245 -> 181;
            case 246 -> 104;
            case 247 -> 75;
            case 248 -> 27;
            case 249 -> 84;
            case 250 -> 237;
            case 251 -> 69;
            case 252 -> 100;
            case 253 -> 217;
            case 254 -> 128;
            default -> 118;
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
   public IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII(String var1, String var2, Double var3, int var4, Double var5, int var6, DefaultConstructorMarker var7) {
      if ((var6 & 8) != 0) {
         var4 = 0;
      }
      if ((var6 & 16) != 0) {
         var5 = 0.0;
      }
      this(var1, var2, var3, var4, var5);
   }

   public IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII(int var1, String var2, String var3, Double var4, int var5, Double var6, SerializationConstructorMarker var7) {
      if (7 != (7 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 7, ((GeneratedSerializer)IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).getDescriptor());
      }
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (var1 & 8) != 0 ? var5 : 0;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (var1 & 16) != 0 ? var6 : 0.0;
   }

   public static final void a(@NotNull IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII var0, @NotNull CompositeEncoder var1, @NotNull SerialDescriptor var2) {
      var1.encodeStringElement(var2, 0, var0.a());
      var1.encodeStringElement(var2, 1, var0.b());
      var1.encodeNullableSerializableElement(var2, 2, (SerializationStrategy)DoubleSerializer.INSTANCE, var0.c());
      if (var1.shouldEncodeElementDefault(var2, 3) || var0.d() != 0) {
         var1.encodeIntElement(var2, 3, var0.d());
      }
      if (var1.shouldEncodeElementDefault(var2, 4) || !Intrinsics.areEqual((Object)var0.e(), (Object)0.0)) {
         var1.encodeNullableSerializableElement(var2, 4, (SerializationStrategy)DoubleSerializer.INSTANCE, var0.e());
      }
   }

   @JvmStatic
   public static IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII a(@NotNull IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII var0, String var1, String var2, Double var3, int var4, Double var5, int var6, Object var7) {
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

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("hypixel_name"),
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
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final KSerializer<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> a() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
         return (KSerializer<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII>)IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
   }
}
