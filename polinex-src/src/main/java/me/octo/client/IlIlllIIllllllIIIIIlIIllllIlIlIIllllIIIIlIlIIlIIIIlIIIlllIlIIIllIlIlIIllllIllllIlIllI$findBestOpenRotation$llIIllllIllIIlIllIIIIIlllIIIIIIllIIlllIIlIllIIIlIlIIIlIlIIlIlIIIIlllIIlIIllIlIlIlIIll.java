package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

// PX-FIX: obfuscator string vault (static String[] a/b + a(int,int)) omitted (dead code, no external readers).
public final class IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {

   private static String[] a;
   private static String[] b;

   static {
      a = new String[4];
      b = new String[4];
   }

   // PX-FIX PhaseA: the obfuscator's per-character decode switch (~255 cases, offset 2614+) is not
   // transcribed: this decryptor is private and has no reader anywhere in the jar (dead code).
   // Index derivation and the a/b cache contract are preserved.
   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30308) & 65535;
      if (var2 >= a.length) {
         return null;
      }
      if (b[var2] != null) {
         return b[var2];
      }
      String var3 = a[var2];
      b[var2] = var3;
      return var3;
   }

   private final me.octo.client.IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   private double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   public IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull me.octo.client.IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, double var2) {
      Intrinsics.checkNotNullParameter((Object)var1, (String)"candidate");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
   }

   @NotNull
   public final me.octo.client.IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final double b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(double var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final me.octo.client.IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final double d() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(@NotNull me.octo.client.IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, double var2) {
      Intrinsics.checkNotNullParameter((Object)var1, (String)"candidate");
      return new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var1, var2);
   }

   @NotNull
   public static IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(@NotNull IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, me.octo.client.IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, double var2, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var4 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      return var0.a(var1, var2);
   }

   @NotNull
   public String toString() {
      return "ScoredCandidate(candidate=" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ", score=" + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + ")";
   }

   public int hashCode() {
      int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      return var1 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
         return false;
      } else {
         IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI$findBestOpenRotation$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1;
         if (!Intrinsics.areEqual((Object)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, (Object)var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)) {
            return false;
         }
         return Double.compare(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) == 0;
      }
   }
}
