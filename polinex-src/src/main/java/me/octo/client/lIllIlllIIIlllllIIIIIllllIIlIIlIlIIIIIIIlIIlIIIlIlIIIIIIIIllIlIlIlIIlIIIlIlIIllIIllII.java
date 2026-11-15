package me.octo.client;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII {
   @NotNull
   private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private AABB IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final Map<Double, Integer> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   public lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII(@NotNull Vec3 var1, int var2) {
      short var10001 = -4211;
      short var10002 = -30250;
      Intrinsics.checkNotNullParameter(var1, "center");
      IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = Double.NaN;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new LinkedHashMap<>();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }
   }

   @NotNull
   public final Vec3 a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final double c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(double var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void a(boolean var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   @Nullable
   public final AABB e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void a(@Nullable AABB var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   public final boolean a(@NotNull Vec3 var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      short var10002 = -4209;
      short var10003 = 3319;
      Intrinsics.checkNotNullParameter(var1, "pos");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      double var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var1);
      double var11;
      int var8 = (var11 = var3 - 10.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
      if (var2 != null) {
         if (var8 > 0) {
            return false;
         }

         var8 = MathKt.roundToInt(var3 * 2);
      }

      double var5 = var8 / 2.0;
      int var9 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
      if (var2 != null) {
         if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            Integer var10005 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .merge(var5, 1, Integer::sum);
            Intrinsics.checkNotNull(var10005);
            int var7 = ((Number)(Object)var10005).intValue();
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var5;
            if (var2 == null) {
               return (var7 != 0);
            }

            if (var7 <= 15) {
               return (1 != 0);
            }

            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clear();
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
            if (var2 != null) {
               return (1 != 0);
            }
         }

         double var12;
         var9 = (var12 = Math.abs(var5 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) - 1.0) == 0.0
            ? 0
            : (var12 < 0.0 ? -1 : 1);
      }

      if (var2 == null) {
         return (var9 != 0);
      } else {
         return !(var9 > 0);
      }
   }

   @Nullable
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(boolean var1, @Nullable Vec3 var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var10000 = this;
      if (var3 != null) {
         if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
            return null;
         }

         var10000 = this;
      }

      boolean var4 = var10000.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var3 != null) {
         if (!var10000.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return null;
         }

         var4 = var1;
      }

      if (var4 || var2 != null) {
         llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI var5 = llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         AABB var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Intrinsics.checkNotNull(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         return llIIIIIIIllIllIIllIlIIlIlIIIlllllllllIIIlllIIIlIIlIlIllIlIllIlllllIllIIllllIlIIllIllI.a(var5, var10001, var1, null, false);
      } else {
         return null;
      }
   }

   // PX-FIX TOP3d2: Kotlin default-args bridge, jar access 4105. Jar body evaluates the guard ONCE:
   //   int[] slot5 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();  <-- not null, so bit 1 is always applied
   //   if ((mask & 1) != 0 && slot5 != null) { if (param1) param1 = <current field>; }   if ((mask & 2) != 0) param2 = null;
   //   return this.a(param1, param2);   <-- literal translation of the bytecode below.
   @Nullable
   public static me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(
      lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var0, boolean var1, @Nullable Vec3 var2, int var3, Object var4) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      if ((var3 & 1) != 0 && var5 != null) {
         if (var1) {
            var1 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }
      }

      if ((var3 & 2) != 0) {
         var2 = null;
      }

      return var0.a(var1, var2);
   }

   // PX-FIX TOP3d2: Kotlin default-args bridge for the STATIC factory a(Vec3,int), jar access 4105. Jar body:
   //   int[] slot5 = guard.f();
   //   if ((mask & 1) != 0 && slot5 != null) { param1 = this.<center field>; }   if ((mask & 2) != 0) { param2 = this.<id field>; }
   //   return this.a(param1, param2);   <-- note: a STATIC method whose body starts from slot 0 as an instance reference.
   @NotNull
   public static lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII a(
      lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var0, @NotNull Vec3 var1, int var2, int var3, Object var4) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      if ((var3 & 1) != 0 && var5 != null) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      return var0.a(var1, var2);
   }

   @NotNull
   public final Vec3 f() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int g() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII a(@NotNull Vec3 var1, int var2) {
      short var10001 = -4212;
      short var10002 = -11201;
      Intrinsics.checkNotNullParameter(var1, "center");
      return new lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = -4216;
      short var10003 = -10136;
      var10003 = -4210;
      short var10004 = 15118;
      return "Hotspot(center="
         + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         + ", id="
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII.f();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII)) {
            return false;
         }

         var10000 = var1;
      }

      lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var3 = (lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII)var10000;
      int var4 = ((Intrinsics.areEqual(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      )) ? 1 : 0);
      if (var2 != null) {
         if (var4 == 0) {
            return false;
         }

         var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var2 != null) {
         if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return false;
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   private static final Integer a(Function2 var0, Object var1, Object var2) {
      return (Integer)var0.invoke(var1, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u009eð\u0019îÕ±\u0006\u0080ÔÚj\u00ad!\u0005\u0099ÕX·B";
      int var4 = "\u009eð\u0019îÕ±\u0006\u0080ÔÚj\u00ad!\u0005\u0099ÕX·B".length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 110;
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
                     case 0 -> 98;
                     case 1 -> 125;
                     case 2 -> 68;
                     case 3 -> 65;
                     case 4 -> 27;
                     case 5 -> 111;
                     default -> 3;
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
                     b = new String[5];
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

                  var2 = "/\u0002÷\u000f\t¡\u000b<o¥\u0090\u0086\u0081\u0087¨É\u0083Æ\u001c";
                  var4 = "/\u0002÷\u000f\t¡\u000b<o¥\u0090\u0086\u0081\u0087¨É\u0083Æ\u001c".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 49;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -4212) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 228;
            case 1 -> 133;
            case 2 -> 198;
            case 3 -> 105;
            case 4 -> 15;
            case 5 -> 197;
            case 6 -> 39;
            case 7 -> 74;
            case 8 -> 247;
            case 9 -> 164;
            case 10 -> 230;
            case 11 -> 190;
            case 12 -> 56;
            case 13 -> 73;
            case 14 -> 150;
            case 15 -> 239;
            case 16 -> 23;
            case 17 -> 176;
            case 18 -> 122;
            case 19 -> 178;
            case 20 -> 11;
            case 21 -> 53;
            case 22 -> 31;
            case 23 -> 65;
            case 24 -> 229;
            case 25 -> 90;
            case 26 -> 16;
            case 27 -> 188;
            case 28 -> 42;
            case 29 -> 14;
            case 30 -> 99;
            case 31 -> 2;
            case 32 -> 220;
            case 33 -> 187;
            case 34 -> 69;
            case 35 -> 50;
            case 36 -> 225;
            case 37 -> 71;
            case 38 -> 217;
            case 39 -> 245;
            case 40 -> 58;
            case 41 -> 135;
            case 42 -> 89;
            case 43 -> 129;
            case 44 -> 253;
            case 45 -> 174;
            case 46 -> 254;
            case 47 -> 154;
            case 48 -> 182;
            case 49 -> 26;
            case 50 -> 37;
            case 51 -> 173;
            case 52 -> 212;
            case 53 -> 91;
            case 54 -> 33;
            case 55 -> 120;
            case 56 -> 184;
            case 57 -> 249;
            case 58 -> 124;
            case 59 -> 139;
            case 60 -> 8;
            case 61 -> 160;
            case 62 -> 24;
            case 63 -> 161;
            case 64 -> 67;
            case 65 -> 123;
            case 66 -> 83;
            case 67 -> 117;
            case 68 -> 195;
            case 69 -> 240;
            case 70 -> 175;
            case 71 -> 97;
            case 72 -> 224;
            case 73 -> 54;
            case 74 -> 244;
            case 75 -> 130;
            case 76 -> 189;
            case 77 -> 246;
            case 78 -> 192;
            case 79 -> 156;
            case 80 -> 145;
            case 81 -> 95;
            case 82 -> 241;
            case 83 -> 186;
            case 84 -> 41;
            case 85 -> 168;
            case 86 -> 119;
            case 87 -> 72;
            case 88 -> 101;
            case 89 -> 209;
            case 90 -> 86;
            case 91 -> 172;
            case 92 -> 29;
            case 93 -> 207;
            case 94 -> 92;
            case 95 -> 152;
            case 96 -> 216;
            case 97 -> 70;
            case 98 -> 180;
            case 99 -> 82;
            case 100 -> 52;
            case 101 -> 47;
            case 102 -> 19;
            case 103 -> 1;
            case 104 -> 201;
            case 105 -> 179;
            case 106 -> 215;
            case 107 -> 165;
            case 108 -> 151;
            case 109 -> 75;
            case 110 -> 183;
            case 111 -> 9;
            case 112 -> 177;
            case 113 -> 134;
            case 114 -> 148;
            case 115 -> 146;
            case 116 -> 106;
            case 117 -> 18;
            case 118 -> 40;
            case 119 -> 227;
            case 120 -> 114;
            case 121 -> 205;
            case 122 -> 250;
            case 123 -> 93;
            case 124 -> 235;
            case 125 -> 68;
            case 126 -> 218;
            case 127 -> 84;
            case 128 -> 25;
            case 129 -> 147;
            case 130 -> 110;
            case 131 -> 63;
            case 132 -> 170;
            case 133 -> 36;
            case 134 -> 60;
            case 135 -> 203;
            case 136 -> 88;
            case 137 -> 236;
            case 138 -> 109;
            case 139 -> 213;
            case 140 -> 231;
            case 141 -> 126;
            case 142 -> 28;
            case 143 -> 211;
            case 144 -> 12;
            case 145 -> 51;
            case 146 -> 78;
            case 147 -> 57;
            case 148 -> 223;
            case 149 -> 85;
            case 150 -> 153;
            case 151 -> 171;
            case 152 -> 118;
            case 153 -> 38;
            case 154 -> 191;
            case 155 -> 80;
            case 156 -> 243;
            case 157 -> 100;
            case 158 -> 104;
            case 159 -> 158;
            case 160 -> 81;
            case 161 -> 144;
            case 162 -> 125;
            case 163 -> 77;
            case 164 -> 162;
            case 165 -> 149;
            case 166 -> 196;
            case 167 -> 210;
            case 168 -> 181;
            case 169 -> 111;
            case 170 -> 238;
            case 171 -> 4;
            case 172 -> 252;
            case 173 -> 131;
            case 174 -> 222;
            case 175 -> 233;
            case 176 -> 206;
            case 177 -> 237;
            case 178 -> 48;
            case 179 -> 121;
            case 180 -> 22;
            case 181 -> 6;
            case 182 -> 96;
            case 183 -> 255;
            case 184 -> 159;
            case 185 -> 232;
            case 186 -> 113;
            case 187 -> 87;
            case 188 -> 116;
            case 189 -> 248;
            case 190 -> 13;
            case 191 -> 157;
            case 192 -> 7;
            case 193 -> 137;
            case 194 -> 94;
            case 195 -> 0;
            case 196 -> 128;
            case 197 -> 169;
            case 198 -> 62;
            case 199 -> 136;
            case 200 -> 202;
            case 201 -> 242;
            case 202 -> 208;
            case 203 -> 214;
            case 204 -> 142;
            case 205 -> 103;
            case 206 -> 234;
            case 207 -> 30;
            case 208 -> 98;
            case 209 -> 35;
            case 210 -> 199;
            case 211 -> 112;
            case 212 -> 44;
            case 213 -> 55;
            case 214 -> 166;
            case 215 -> 32;
            case 216 -> 167;
            case 217 -> 61;
            case 218 -> 127;
            case 219 -> 76;
            case 220 -> 107;
            case 221 -> 115;
            case 222 -> 64;
            case 223 -> 3;
            case 224 -> 194;
            case 225 -> 140;
            case 226 -> 45;
            case 227 -> 46;
            case 228 -> 59;
            case 229 -> 108;
            case 230 -> 132;
            case 231 -> 226;
            case 232 -> 219;
            case 233 -> 21;
            case 234 -> 66;
            case 235 -> 27;
            case 236 -> 138;
            case 237 -> 221;
            case 238 -> 49;
            case 239 -> 251;
            case 240 -> 10;
            case 241 -> 204;
            case 242 -> 20;
            case 243 -> 17;
            case 244 -> 193;
            case 245 -> 5;
            case 246 -> 79;
            case 247 -> 200;
            case 248 -> 34;
            case 249 -> 185;
            case 250 -> 143;
            case 251 -> 163;
            case 252 -> 141;
            case 253 -> 43;
            case 254 -> 102;
            default -> 155;
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

   // PX-FIX PhaseA-inline: jar-only nested class restored from row11.javap.txt (see phaseA-nested-inline-BD2.md).
   static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
         extends kotlin.jvm.internal.FunctionReferenceImpl
         implements kotlin.jvm.functions.Function2 {
      // PX-FIX PhaseA-pending: the a[]/b[] cipher tables and this class' decryptor are unreachable
      // (the jar calls neither the decryptor nor the interface method from anywhere); the fields and the
      // method descriptor are preserved exactly, the table *contents* are equivalent, not literal.
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         super(2, Integer.TYPE, "plus", "plus(I)I", 0);
      }

      public final java.lang.Integer a(int var1, int var2) {
         return Integer.valueOf(var1 + var2);
      }

      public java.lang.Object invoke(java.lang.Object var1, java.lang.Object var2) {
         return this.a(((Number)var1).intValue(), ((Number)var2).intValue());
      }

      static {
         a = new String[2];
         b = new String[2];
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
      }

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ 4928) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 207;
               case 1 -> 238;
               case 2 -> 230;
               case 3 -> 62;
               case 4 -> 131;
               case 5 -> 138;
               case 6 -> 208;
               case 7 -> 199;
               case 8 -> 48;
               case 9 -> 136;
               case 10 -> 85;
               case 11 -> 180;
               case 12 -> 165;
               case 13 -> 245;
               case 14 -> 106;
               case 15 -> 183;
               case 16 -> 22;
               case 17 -> 37;
               case 18 -> 234;
               case 19 -> 95;
               case 20 -> 227;
               case 21 -> 145;
               case 22 -> 229;
               case 23 -> 157;
               case 24 -> 228;
               case 25 -> 109;
               case 26 -> 241;
               case 27 -> 1;
               case 28 -> 21;
               case 29 -> 212;
               case 30 -> 152;
               case 31 -> 58;
               case 32 -> 2;
               case 33 -> 146;
               case 34 -> 158;
               case 35 -> 231;
               case 36 -> 113;
               case 37 -> 143;
               case 38 -> 122;
               case 39 -> 142;
               case 40 -> 67;
               case 41 -> 137;
               case 42 -> 132;
               case 43 -> 182;
               case 44 -> 49;
               case 45 -> 78;
               case 46 -> 9;
               case 47 -> 81;
               case 48 -> 102;
               case 49 -> 44;
               case 50 -> 33;
               case 51 -> 211;
               case 52 -> 239;
               case 53 -> 196;
               case 54 -> 129;
               case 55 -> 192;
               case 56 -> 162;
               case 57 -> 236;
               case 58 -> 79;
               case 59 -> 90;
               case 60 -> 115;
               case 61 -> 164;
               case 62 -> 135;
               case 63 -> 30;
               case 64 -> 153;
               case 65 -> 171;
               case 66 -> 213;
               case 67 -> 12;
               case 68 -> 63;
               case 69 -> 94;
               case 70 -> 75;
               case 71 -> 189;
               case 72 -> 159;
               case 73 -> 254;
               case 74 -> 28;
               case 75 -> 225;
               case 76 -> 150;
               case 77 -> 166;
               case 78 -> 163;
               case 79 -> 10;
               case 80 -> 65;
               case 81 -> 253;
               case 82 -> 178;
               case 83 -> 190;
               case 84 -> 194;
               case 85 -> 69;
               case 86 -> 161;
               case 87 -> 191;
               case 88 -> 46;
               case 89 -> 160;
               case 90 -> 127;
               case 91 -> 98;
               case 92 -> 204;
               case 93 -> 149;
               case 94 -> 97;
               case 95 -> 200;
               case 96 -> 246;
               case 97 -> 103;
               case 98 -> 96;
               case 99 -> 173;
               case 100 -> 29;
               case 101 -> 209;
               case 102 -> 210;
               case 103 -> 27;
               case 104 -> 89;
               case 105 -> 4;
               case 106 -> 233;
               case 107 -> 0;
               case 108 -> 130;
               case 109 -> 18;
               case 110 -> 247;
               case 111 -> 100;
               case 112 -> 193;
               case 113 -> 19;
               case 114 -> 244;
               case 115 -> 45;
               case 116 -> 51;
               case 117 -> 250;
               case 118 -> 155;
               case 119 -> 77;
               case 120 -> 205;
               case 121 -> 240;
               case 122 -> 187;
               case 123 -> 111;
               case 124 -> 156;
               case 125 -> 112;
               case 126 -> 181;
               case 127 -> 73;
               case 128 -> 154;
               case 129 -> 118;
               case 130 -> 167;
               case 131 -> 61;
               case 132 -> 243;
               case 133 -> 120;
               case 134 -> 221;
               case 135 -> 175;
               case 136 -> 141;
               case 137 -> 219;
               case 138 -> 64;
               case 139 -> 84;
               case 140 -> 140;
               case 141 -> 99;
               case 142 -> 168;
               case 143 -> 237;
               case 144 -> 68;
               case 145 -> 170;
               case 146 -> 195;
               case 147 -> 59;
               case 148 -> 3;
               case 149 -> 197;
               case 150 -> 40;
               case 151 -> 169;
               case 152 -> 55;
               case 153 -> 83;
               case 154 -> 172;
               case 155 -> 14;
               case 156 -> 23;
               case 157 -> 53;
               case 158 -> 87;
               case 159 -> 26;
               case 160 -> 220;
               case 161 -> 101;
               case 162 -> 116;
               case 163 -> 203;
               case 164 -> 144;
               case 165 -> 56;
               case 166 -> 108;
               case 167 -> 201;
               case 168 -> 139;
               case 169 -> 39;
               case 170 -> 80;
               case 171 -> 251;
               case 172 -> 214;
               case 173 -> 17;
               case 174 -> 232;
               case 175 -> 151;
               case 176 -> 60;
               case 177 -> 5;
               case 178 -> 104;
               case 179 -> 255;
               case 180 -> 248;
               case 181 -> 184;
               case 182 -> 105;
               case 183 -> 124;
               case 184 -> 16;
               case 185 -> 86;
               case 186 -> 216;
               case 187 -> 57;
               case 188 -> 8;
               case 189 -> 218;
               case 190 -> 252;
               case 191 -> 249;
               case 192 -> 13;
               case 193 -> 15;
               case 194 -> 52;
               case 195 -> 235;
               case 196 -> 174;
               case 197 -> 20;
               case 198 -> 198;
               case 199 -> 50;
               case 200 -> 11;
               case 201 -> 134;
               case 202 -> 36;
               case 203 -> 117;
               case 204 -> 7;
               case 205 -> 107;
               case 206 -> 32;
               case 207 -> 185;
               case 208 -> 119;
               case 209 -> 217;
               case 210 -> 82;
               case 211 -> 128;
               case 212 -> 70;
               case 213 -> 25;
               case 214 -> 92;
               case 215 -> 206;
               case 216 -> 222;
               case 217 -> 41;
               case 218 -> 242;
               case 219 -> 125;
               case 220 -> 114;
               case 221 -> 224;
               case 222 -> 93;
               case 223 -> 186;
               case 224 -> 47;
               case 225 -> 179;
               case 226 -> 72;
               case 227 -> 226;
               case 228 -> 31;
               case 229 -> 38;
               case 230 -> 76;
               case 231 -> 133;
               case 232 -> 126;
               case 233 -> 215;
               case 234 -> 6;
               case 235 -> 71;
               case 236 -> 147;
               case 237 -> 88;
               case 238 -> 110;
               case 239 -> 42;
               case 240 -> 35;
               case 241 -> 202;
               case 242 -> 43;
               case 243 -> 24;
               case 244 -> 54;
               case 245 -> 148;
               case 246 -> 74;
               case 247 -> 34;
               case 248 -> 177;
               case 249 -> 188;
               case 250 -> 176;
               case 251 -> 66;
               case 252 -> 123;
               case 253 -> 121;
               case 254 -> 223;
               default -> 91;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) { var5 += 256; }
            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) { var6 += 256; }
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
}
