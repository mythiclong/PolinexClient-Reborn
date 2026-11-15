package me.octo.client;

import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl
   implements lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll {
   public static me.octo.client.IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX missing field (typed to WhenMappings)

   @NotNull
   public static IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final Set<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private Double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private Double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @JvmField
   @NotNull
   private static Lazy<KSerializer<Object>>[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] a;
   private static String[] b;

   // PX-FIX PhaseA: the kotlinx missing-field guard
   //   PluginExceptionsKt.throwMissingFieldException(seen, 95, <$serializer INSTANCE>.getDescriptor())
   // is omitted: the jar-only $serializer nested class has no source file in this tree.
   // Field assignment / seen-mask handling are transcribed from the jar bytecode.
   public IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl(int var1, String var2, String var3, int var4, String var5, Set<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> var6, Double var7, Double var8, kotlinx.serialization.internal.SerializationConstructorMarker var9) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (var1 & 32) == 0 ? null : var7;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
   }

   public IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl(String var1, String var2, int var3, String var4, Set<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> var5, Double var6, Double var7, int var8, kotlin.jvm.internal.DefaultConstructorMarker var9) {
      this(var1, var2, var3, var4, var5, (var8 & 32) != 0 ? null : var6, (var8 & 64) != 0 ? null : var7);
   }

   public IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl(
      @NotNull String var1,
      @NotNull String var2,
      int var3,
      @NotNull String var4,
      @NotNull Set<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> var5,
      @Nullable Double var6,
      @Nullable Double var7
   ) {
      short var10001 = 18022;
      short var10002 = 21590;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = 18030;
      var10002 = 28455;
      Intrinsics.checkNotNullParameter(var2, "uselessDisplayName");
      var10001 = 18017;
      var10002 = 18088;
      Intrinsics.checkNotNullParameter(var4, "displayName");
      var10001 = 18020;
      var10002 = -9897;
      Intrinsics.checkNotNullParameter(var5, "pieces");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var6;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
   }

   @NotNull
   @Override
   public String a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String g() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Override
   public int d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   @Override
   public String b() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final Set<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @Nullable
   @Override
   public Double c() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @Override
   public void a(@Nullable Double var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   @Nullable
   @Override
   public Double e() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @Override
   public void b(@Nullable Double var1) {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }

   @NotNull
   public final String o() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String p() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int q() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final String r() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final Set<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> s() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @Nullable
   public final Double t() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @Nullable
   public final Double u() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl a(
      @NotNull String var1,
      @NotNull String var2,
      int var3,
      @NotNull String var4,
      @NotNull Set<IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII> var5,
      @Nullable Double var6,
      @Nullable Double var7
   ) {
      short var10001 = 18027;
      short var10002 = -12348;
      Intrinsics.checkNotNullParameter(var1, "id");
      var10001 = 18018;
      var10002 = 14198;
      Intrinsics.checkNotNullParameter(var2, "uselessDisplayName");
      var10001 = 18023;
      var10002 = -21797;
      Intrinsics.checkNotNullParameter(var4, "displayName");
      var10001 = 18021;
      var10002 = 13648;
      Intrinsics.checkNotNullParameter(var5, "pieces");
      return new IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl(var1, var2, var3, var4, var5, var6, var7);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 18026;
      Double var1 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      Double var2 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Set var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      String var7 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10001 = 28418;
      short var10002 = 18028;
      short var10003 = -2387;
      short var10004 = 18019;
      short var10005 = -25159;
      short var10006 = 18016;
      short var10007 = 24561;
      short var10008 = 18025;
      short var10009 = 6752;
      short var10010 = 18024;
      short var10011 = -18023;
      short var10012 = 18029;
      short var10013 = 24871;
      return "MuseumArmor(id="
         + var7
         + ", uselessDisplayName="
         + var6
         + ", xp="
         + var5
         + ", displayName="
         + var4
         + ", pieces="
         + var3
         + ", price="
         + var2
         + ", pricePerXP="
         + var1
         + ")";
   }

   @Override
   public int hashCode() {
      String var1;
      int var8;
      int var10;
      label25: {
         String var10000 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
         var1 = var10000;
         var2 = var2 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var2 = var2 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
         var2 = var2 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
         var8 = var2 * 31;
         Double var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         if (var1 != null) {
            if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll == null) {
               var10 = 0;
               break label25;
            }

            var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         var10 = var10001.hashCode();
      }

      int var7 = var8 + var10;
      var8 = var7 * 31;
      Double var11 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      if (var1 != null) {
         if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll == null) {
            return var8 + 0;
         }

         var11 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      return var8 + var11.hashCode();
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
         if (!(var10000 instanceof IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl)) {
            return false;
         }

         var10000 = var1;
      }

      IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl var3 = (IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl)var10000;
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

         var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      if (var2 != null) {
         if (var4 != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var4 == 0) {
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

         var4 = ((Intrinsics.areEqual(
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         )) ? 1 : 0);
      }

      if (var2 != null) {
         if (var4 == 0) {
            return false;
         }

         var4 = ((Intrinsics.areEqual(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
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
      char[] var21 = null; // PX-FIX
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "a¸ÁDíídì\u0092¾{s\u0016;\u000bQ\u0099\u0091\u0019\rm\u0091à\u0083ÖF\u0012=[9\u0004ÅCª\u007f§pÞ1\u0095\u0016ÿs5X\u0005\u009e\u0095\"ø@\u0006îZær>c\u0006FgóÕ\u009c\u0097\u0002-\u0005\u000bÿ\"Dn·\u0083Æ=im\u001b\b2=¿ï®ó\\\u0002\tÈ\u00adàæIª-g×\u000fRÜý;\u0099\u0092\u0001®¢¦ø0\u001bçT\u0002;(\u0015ßI\u0007`\u0010,\u0006YüRõ»Û®*ËfPhsX";
      int var4 = "a¸ÁDíídì\u0092¾{s\u0016;\u000bQ\u0099\u0091\u0019\rm\u0091à\u0083ÖF\u0012=[9\u0004ÅCª\u007f§pÞ1\u0095\u0016ÿs5X\u0005\u009e\u0095\"ø@\u0006îZær>c\u0006FgóÕ\u009c\u0097\u0002-\u0005\u000bÿ\"Dn·\u0083Æ=im\u001b\b2=¿ï®ó\\\u0002\tÈ\u00adàæIª-g×\u000fRÜý;\u0099\u0092\u0001®¢¦ø0\u001bçT\u0002;(\u0015ßI\u0007`\u0010,\u0006YüRõ»Û®*ËfPhsX"
         .length();
      char var1 = 14;
      int var9 = -1;

      label52:
while (true) {
         byte var10000 = 33;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 40;
                     case 1 -> 11;
                     case 2 -> 32;
                     case 3 -> 122;
                     case 4 -> 79;
                     case 5 -> 27;
                     default -> 68;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[15];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     Lazy[] var7 = new Lazy[]{
                        null,
                        null,
                        null,
                        null,
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           new kotlin.jvm.functions.Function0() {
                              @NotNull
                              public Object invoke() {
                                 return (KSerializer)(
                                    new LinkedHashSetSerializer(
                                       (KSerializer)IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    )
                                 );
                              }
                           }
                        ),
                        null,
                        null
                     };
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var7;
                     break label52;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "Â«éu,èDDêÈ\u009as$\u0012\u0088åÇ\u009bRø\u0010@¸ßu\u008c¨é\u0010Ä\u0080æ";
                  var4 = "Â«éu,èDDêÈ\u009as$\u0012\u0088åÇ\u009bRø\u0010@¸ßu\u008c¨é\u0010Ä\u0080æ".length();
                  var1 = '\r';
                  var9 = -1;
            }

            var10000 = 97;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 18016) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 157;
            case 1 -> 162;
            case 2 -> 251;
            case 3 -> 175;
            case 4 -> 96;
            case 5 -> 219;
            case 6 -> 241;
            case 7 -> 83;
            case 8 -> 168;
            case 9 -> 11;
            case 10 -> 186;
            case 11 -> 163;
            case 12 -> 200;
            case 13 -> 113;
            case 14 -> 31;
            case 15 -> 54;
            case 16 -> 44;
            case 17 -> 214;
            case 18 -> 63;
            case 19 -> 2;
            case 20 -> 72;
            case 21 -> 176;
            case 22 -> 143;
            case 23 -> 147;
            case 24 -> 88;
            case 25 -> 160;
            case 26 -> 151;
            case 27 -> 112;
            case 28 -> 228;
            case 29 -> 19;
            case 30 -> 243;
            case 31 -> 132;
            case 32 -> 42;
            case 33 -> 149;
            case 34 -> 187;
            case 35 -> 135;
            case 36 -> 9;
            case 37 -> 114;
            case 38 -> 197;
            case 39 -> 111;
            case 40 -> 193;
            case 41 -> 229;
            case 42 -> 47;
            case 43 -> 182;
            case 44 -> 3;
            case 45 -> 249;
            case 46 -> 189;
            case 47 -> 14;
            case 48 -> 15;
            case 49 -> 146;
            case 50 -> 105;
            case 51 -> 90;
            case 52 -> 53;
            case 53 -> 209;
            case 54 -> 35;
            case 55 -> 152;
            case 56 -> 4;
            case 57 -> 103;
            case 58 -> 213;
            case 59 -> 130;
            case 60 -> 117;
            case 61 -> 8;
            case 62 -> 221;
            case 63 -> 145;
            case 64 -> 109;
            case 65 -> 198;
            case 66 -> 171;
            case 67 -> 26;
            case 68 -> 237;
            case 69 -> 10;
            case 70 -> 148;
            case 71 -> 30;
            case 72 -> 238;
            case 73 -> 156;
            case 74 -> 138;
            case 75 -> 207;
            case 76 -> 150;
            case 77 -> 64;
            case 78 -> 230;
            case 79 -> 17;
            case 80 -> 245;
            case 81 -> 41;
            case 82 -> 82;
            case 83 -> 66;
            case 84 -> 180;
            case 85 -> 37;
            case 86 -> 33;
            case 87 -> 164;
            case 88 -> 108;
            case 89 -> 99;
            case 90 -> 235;
            case 91 -> 236;
            case 92 -> 210;
            case 93 -> 107;
            case 94 -> 100;
            case 95 -> 227;
            case 96 -> 40;
            case 97 -> 49;
            case 98 -> 5;
            case 99 -> 50;
            case 100 -> 226;
            case 101 -> 78;
            case 102 -> 28;
            case 103 -> 191;
            case 104 -> 173;
            case 105 -> 141;
            case 106 -> 97;
            case 107 -> 195;
            case 108 -> 93;
            case 109 -> 194;
            case 110 -> 220;
            case 111 -> 32;
            case 112 -> 91;
            case 113 -> 139;
            case 114 -> 51;
            case 115 -> 6;
            case 116 -> 170;
            case 117 -> 68;
            case 118 -> 126;
            case 119 -> 167;
            case 120 -> 43;
            case 121 -> 177;
            case 122 -> 70;
            case 123 -> 85;
            case 124 -> 39;
            case 125 -> 13;
            case 126 -> 56;
            case 127 -> 131;
            case 128 -> 127;
            case 129 -> 206;
            case 130 -> 95;
            case 131 -> 239;
            case 132 -> 104;
            case 133 -> 133;
            case 134 -> 225;
            case 135 -> 129;
            case 136 -> 71;
            case 137 -> 12;
            case 138 -> 244;
            case 139 -> 128;
            case 140 -> 16;
            case 141 -> 77;
            case 142 -> 196;
            case 143 -> 172;
            case 144 -> 181;
            case 145 -> 185;
            case 146 -> 76;
            case 147 -> 118;
            case 148 -> 178;
            case 149 -> 61;
            case 150 -> 46;
            case 151 -> 254;
            case 152 -> 215;
            case 153 -> 94;
            case 154 -> 102;
            case 155 -> 212;
            case 156 -> 123;
            case 157 -> 124;
            case 158 -> 247;
            case 159 -> 223;
            case 160 -> 65;
            case 161 -> 232;
            case 162 -> 79;
            case 163 -> 211;
            case 164 -> 84;
            case 165 -> 81;
            case 166 -> 20;
            case 167 -> 80;
            case 168 -> 231;
            case 169 -> 36;
            case 170 -> 224;
            case 171 -> 45;
            case 172 -> 55;
            case 173 -> 101;
            case 174 -> 216;
            case 175 -> 48;
            case 176 -> 1;
            case 177 -> 154;
            case 178 -> 199;
            case 179 -> 153;
            case 180 -> 38;
            case 181 -> 92;
            case 182 -> 252;
            case 183 -> 205;
            case 184 -> 86;
            case 185 -> 59;
            case 186 -> 121;
            case 187 -> 98;
            case 188 -> 34;
            case 189 -> 144;
            case 190 -> 122;
            case 191 -> 18;
            case 192 -> 116;
            case 193 -> 115;
            case 194 -> 125;
            case 195 -> 159;
            case 196 -> 106;
            case 197 -> 158;
            case 198 -> 67;
            case 199 -> 183;
            case 200 -> 204;
            case 201 -> 69;
            case 202 -> 208;
            case 203 -> 222;
            case 204 -> 165;
            case 205 -> 89;
            case 206 -> 119;
            case 207 -> 203;
            case 208 -> 21;
            case 209 -> 7;
            case 210 -> 110;
            case 211 -> 233;
            case 212 -> 174;
            case 213 -> 142;
            case 214 -> 179;
            case 215 -> 25;
            case 216 -> 255;
            case 217 -> 74;
            case 218 -> 253;
            case 219 -> 22;
            case 220 -> 87;
            case 221 -> 57;
            case 222 -> 218;
            case 223 -> 234;
            case 224 -> 60;
            case 225 -> 188;
            case 226 -> 58;
            case 227 -> 62;
            case 228 -> 136;
            case 229 -> 242;
            case 230 -> 169;
            case 231 -> 192;
            case 232 -> 0;
            case 233 -> 29;
            case 234 -> 201;
            case 235 -> 24;
            case 236 -> 246;
            case 237 -> 184;
            case 238 -> 240;
            case 239 -> 155;
            case 240 -> 27;
            case 241 -> 202;
            case 242 -> 250;
            case 243 -> 166;
            case 244 -> 52;
            case 245 -> 161;
            case 246 -> 73;
            case 247 -> 23;
            case 248 -> 190;
            case 249 -> 75;
            case 250 -> 134;
            case 251 -> 120;
            case 252 -> 137;
            case 253 -> 140;
            case 254 -> 217;
            default -> 248;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final KSerializer<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> a() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
         return (KSerializer<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl>)IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker p0) {  }
   }

   public static void f() {
   }

   public static void h() {
   }

   public static void i() {
   }

   public static void j() {
   }

   public static void l() {
   }

   public static void m() {
   }

   public static void n() {
   }

   private static final KSerializer v() {
      return (KSerializer)new LinkedHashSetSerializer(
         (KSerializer)IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
   }

   public static final Lazy[] w() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public static final void a(IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl var0, CompositeEncoder var1, SerialDescriptor var2) {
      Lazy[] var3 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      var1.encodeStringElement(var2, 0, var0.a());
      var1.encodeStringElement(var2, 1, var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      var1.encodeIntElement(var2, 2, var0.d());
      var1.encodeStringElement(var2, 3, var0.b());
      var1.encodeSerializableElement(var2, 4, (SerializationStrategy)var3[4].getValue(), var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      if (var1.shouldEncodeElementDefault(var2, 5) || var0.c() != null) {
         var1.encodeNullableSerializableElement(var2, 5, (SerializationStrategy)DoubleSerializer.INSTANCE, var0.c());
      }
      var1.encodeNullableSerializableElement(var2, 6, (SerializationStrategy)DoubleSerializer.INSTANCE, var0.e());
   }

   public static IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl a(IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl var0, String var1, String var2, int var3, String var4, Set var5, Double var6, Double var7, int var8, Object var9) {
      if ((var8 & 1) != 0) {
         var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var8 & 2) != 0) {
         var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var8 & 4) != 0) {
         var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      if ((var8 & 8) != 0) {
         var4 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      if ((var8 & 16) != 0) {
         var5 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }
      if ((var8 & 32) != 0) {
         var6 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }
      if ((var8 & 64) != 0) {
         var7 = var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }
      return var0.a(var1, var2, var3, var4, var5, var6, var7);
   }
}
