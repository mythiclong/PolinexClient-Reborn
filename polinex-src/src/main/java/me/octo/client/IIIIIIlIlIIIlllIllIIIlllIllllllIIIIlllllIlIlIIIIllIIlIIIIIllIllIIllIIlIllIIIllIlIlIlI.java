package me.octo.client;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI {
   public IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI(
      @NotNull List<? extends Class<? extends Entity>> var1,
      @NotNull List<String> var2,
      @NotNull List<? extends AABB> var3,
      @NotNull List<? extends AABB> var4,
      @NotNull Vec3 var5,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7,
      @NotNull lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var8,
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var9,
      @NotNull List<? extends AABB> var10,
      int var11,
      kotlin.jvm.internal.DefaultConstructorMarker var12
   ) {
      if ((var11 & 512) != 0) {
         var10 = kotlin.collections.CollectionsKt.emptyList();
      }
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI a(IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI var0,
      @NotNull List<? extends Class<? extends Entity>> var1,
      @NotNull List<String> var2,
      @NotNull List<? extends AABB> var3,
      @NotNull List<? extends AABB> var4,
      @NotNull Vec3 var5,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7,
      @NotNull lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var8,
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var9,
      @NotNull List<? extends AABB> var10,
      int var11,
      Object var12
   ) {
      if ((var11 & 1) != 0) {
         var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var11 & 2) != 0) {
         var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var11 & 4) != 0) {
         var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var11 & 8) != 0) {
         var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      if ((var11 & 16) != 0) {
         var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      if ((var11 & 32) != 0) {
         var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }
      if ((var11 & 64) != 0) {
         var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }
      if ((var11 & 128) != 0) {
         var8 = var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }
      if ((var11 & 256) != 0) {
         var9 = var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }
      if ((var11 & 512) != 0) {
         var10 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }
      return var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }


   @NotNull
   private final List<Class<? extends Entity>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<AABB> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final List<AABB> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private Vec3 IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private List<AABB> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] a;
   private static String[] b;

   public IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI(
      @NotNull List<? extends Class<? extends Entity>> var1,
      @NotNull List<String> var2,
      @NotNull List<? extends AABB> var3,
      @NotNull List<? extends AABB> var4,
      @NotNull Vec3 var5,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7,
      @NotNull lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var8,
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var9,
      @NotNull List<? extends AABB> var10
   ) {
      short var10001 = 12627;
      short var10002 = -6060;
      Intrinsics.checkNotNullParameter(var1, "targetClasses");
      var10001 = 12639;
      var10002 = -8792;
      Intrinsics.checkNotNullParameter(var2, "targetNames");
      var10001 = 12632;
      var10002 = 17304;
      Intrinsics.checkNotNullParameter(var3, "targetBoxes");
      var10001 = 12609;
      var10002 = 16381;
      Intrinsics.checkNotNullParameter(var4, "ignoreBoxes");
      var10001 = 12630;
      var10002 = 27572;
      Intrinsics.checkNotNullParameter(var5, "hotZone");
      var10001 = 12611;
      var10002 = -11951;
      Intrinsics.checkNotNullParameter(var6, "warpLocation");
      var10001 = 12608;
      var10002 = 20043;
      Intrinsics.checkNotNullParameter(var7, "location");
      var10001 = 12626;
      var10002 = 31388;
      Intrinsics.checkNotNullParameter(var8, "slayer");
      var10001 = 12637;
      var10002 = 10398;
      Intrinsics.checkNotNullParameter(var9, "route");
      var10001 = 12631;
      var10002 = -719;
      Intrinsics.checkNotNullParameter(var10, "idleBoxes");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ((List<Class<? extends Entity>>)(Object)(var1));
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((List<AABB>)(Object)(var3));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = ((List<AABB>)(Object)(var4));
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = ((List<AABB>)(Object)(var10));
   }

   @NotNull
   public final List<Class<? extends Entity>> a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final List<String> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<AABB> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final List<AABB> d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final Vec3 e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI f() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI g() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII h() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> i() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final List<AABB> j() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final List<Class<? extends Entity>> k() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final List<String> l() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<AABB> m() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final List<AABB> n() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final Vec3 o() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI p() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI q() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII r() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> s() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final List<AABB> t() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI a(
      @NotNull List<? extends Class<? extends Entity>> var1,
      @NotNull List<String> var2,
      @NotNull List<? extends AABB> var3,
      @NotNull List<? extends AABB> var4,
      @NotNull Vec3 var5,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7,
      @NotNull lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var8,
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var9,
      @NotNull List<? extends AABB> var10
   ) {
      short var10001 = 12610;
      short var10002 = 14478;
      Intrinsics.checkNotNullParameter(var1, "targetClasses");
      var10001 = 12633;
      var10002 = -13326;
      Intrinsics.checkNotNullParameter(var2, "targetNames");
      var10001 = 12613;
      var10002 = -971;
      Intrinsics.checkNotNullParameter(var3, "targetBoxes");
      var10001 = 12636;
      var10002 = -25333;
      Intrinsics.checkNotNullParameter(var4, "ignoreBoxes");
      var10001 = 12616;
      var10002 = -25953;
      Intrinsics.checkNotNullParameter(var5, "hotZone");
      var10001 = 12621;
      var10002 = 12063;
      Intrinsics.checkNotNullParameter(var6, "warpLocation");
      var10001 = 12623;
      var10002 = -30648;
      Intrinsics.checkNotNullParameter(var7, "location");
      var10001 = 12617;
      var10002 = 14269;
      Intrinsics.checkNotNullParameter(var8, "slayer");
      var10001 = 12622;
      var10002 = 19497;
      Intrinsics.checkNotNullParameter(var9, "route");
      var10001 = 12612;
      var10002 = 25626;
      Intrinsics.checkNotNullParameter(var10, "idleBoxes");
      return new IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI(
         var1, var2, var3, var4, var5, var6, var7, var8, var9, var10
      );
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 12624;
      List var1 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      List var2 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var3 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var5 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var6 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      List var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      List var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      List var9 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      List var10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = 4211;
      short var10002 = 12615;
      short var10003 = -17790;
      short var10004 = 12619;
      short var10005 = -17498;
      short var10006 = 12614;
      short var10007 = 9792;
      short var10008 = 12625;
      short var10009 = 7111;
      short var10010 = 12618;
      short var10011 = 21401;
      short var10012 = 12620;
      short var10013 = 5217;
      short var10014 = 12638;
      short var10015 = -10901;
      short var10016 = 12635;
      short var10017 = 13695;
      short var10018 = 12634;
      short var10019 = -23096;
      return "SlayerArea(targetClasses="
         + var10
         + ", targetNames="
         + var9
         + ", targetBoxes="
         + var8
         + ", ignoreBoxes="
         + var7
         + ", hotZone="
         + var6
         + ", warpLocation="
         + var5
         + ", location="
         + var4
         + ", slayer="
         + var3
         + ", route="
         + var2
         + ", idleBoxes="
         + var1
         + ")";
   }

   @Override
   public int hashCode() {
      int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.d();
      var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      var2 = var2 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      var2 = var2 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      var2 = var2 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
      var2 = var2 * 31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.hashCode();
      var2 = var2 * 31 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.hashCode();
      var2 = var2 * 31 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.hashCode();
      var2 = var2 * 31 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.hashCode();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }

      return var2;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.d();
      IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = (IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI)var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI)) {
            return false;
         }

         var10000 = (IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI)var1;
      }

      IIIIIIlIlIIIlllIllIIIlllIllllllIIIIlllllIlIlIIIIllIIlIIIIIllIllIIllIIlIllIIIllIlIlIlI var3 = var10000;
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

         var4 = Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
      }

      label106: {
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var10000 = this;
            if (var2 == null) {
               break label106;
            }

            var4 = Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (!var4) {
            return false;
         }

         var10000 = this;
      }

      label108: {
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var2 != null) {
            if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               != var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               return false;
            }

            var10000 = this;
            if (var2 == null) {
               break label108;
            }

            var6 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            var10001 = var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         if (var6 != var10001) {
            return false;
         }

         var10000 = this;
      }

      if (var2 != null) {
         if (var10000.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            != var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            return false;
         }

         var10000 = this;
      }

      boolean var8 = Intrinsics.areEqual(
         var10000.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      if (var2 != null) {
         if (!var8) {
            return false;
         }

         var8 = Intrinsics.areEqual(
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
            var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         );
      }

      if (var2 != null) {
         if (!var8) {
            return false;
         }

         var8 = true;
      }

      return var8;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[30];
      int var3 = 0;
      String var2 = "Jy\tô¤®D7\u001fî\u000f7ÿ\u009b\u000f¤d×W\u001cÍzµõÈ[0ä¥>\u0006ãp\u009d\b\u0096?\u0007\u0092äÞÚC>\u0006\b~7Ð\u009blM\u0091\u009e\u0005\u001f-7ÍU\fð\u009ch0p\r!_CRcm\u000b\u0082W\b?\u008e\u001e#úíè\u009c\f< ñ·CýGA\u008f\u0091ú\u0015\r\u0080!\u0005\u0090ô÷\u009duå¡\u001cA÷\u000b^\u0018|ySÒ\u009dáÝF!\b©¥*É3\u0007z×\u000e9wg5i\u0096ý0$\u0000ð%·Ù\u000e^&\u0096\u0019õÝæA¾\u0013;\u0088yl\u000b)\u007f0[R\u008eHYgQv\tZ\u0007þóqÂÕ¢¢\bm!ëñ9Ò\u0010\u0080\f=\u0018úÝz,e>Â½ÂN\u000bôÂ\u008bì%xª\u0089£\u0084Y\u000bä\f\u00895eC®à»fí\u000bA\u0015=\u0016ó'pbøù2\t\n\u0096\u0006\u0004±\u0002\u0097y\u001a\u0005\u008d\u0010ej\u001f\u000b÷aIVõ7I]GÑr\r5F³|\"jGÆ¾×w\u008f\u009a\u0006zM®¯ðË\nu¯ò BÆTºqT\u0019W\u008f/÷ÀÀ\u0019K3©\u0019\u0001u!\u0099aQ8±W-ÉÁÊR";
      int var4 = "Jy\tô¤®D7\u001fî\u000f7ÿ\u009b\u000f¤d×W\u001cÍzµõÈ[0ä¥>\u0006ãp\u009d\b\u0096?\u0007\u0092äÞÚC>\u0006\b~7Ð\u009blM\u0091\u009e\u0005\u001f-7ÍU\fð\u009ch0p\r!_CRcm\u000b\u0082W\b?\u008e\u001e#úíè\u009c\f< ñ·CýGA\u008f\u0091ú\u0015\r\u0080!\u0005\u0090ô÷\u009duå¡\u001cA÷\u000b^\u0018|ySÒ\u009dáÝF!\b©¥*É3\u0007z×\u000e9wg5i\u0096ý0$\u0000ð%·Ù\u000e^&\u0096\u0019õÝæA¾\u0013;\u0088yl\u000b)\u007f0[R\u008eHYgQv\tZ\u0007þóqÂÕ¢¢\bm!ëñ9Ò\u0010\u0080\f=\u0018úÝz,e>Â½ÂN\u000bôÂ\u008bì%xª\u0089£\u0084Y\u000bä\f\u00895eC®à»fí\u000bA\u0015=\u0016ó'pbøù2\t\n\u0096\u0006\u0004±\u0002\u0097y\u001a\u0005\u008d\u0010ej\u001f\u000b÷aIVõ7I]GÑr\r5F³|\"jGÆ¾×w\u008f\u009a\u0006zM®¯ðË\nu¯ò BÆTºqT\u0019W\u008f/÷ÀÀ\u0019K3©\u0019\u0001u!\u0099aQ8±W-ÉÁÊR"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 122;
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
                     case 0 -> 68;
                     case 1 -> 78;
                     case 2 -> 32;
                     case 3 -> 98;
                     case 4 -> 60;
                     case 5 -> 99;
                     default -> 59;
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
                     b = new String[30];
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

                  var2 = "\u0011Bø4ÞUO?\u009e\u0007k¿\u008eÞ&ÑÅ";
                  var4 = "\u0011Bø4ÞUO?\u009e\u0007k¿\u008eÞ&ÑÅ".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 80;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 12619) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 144;
            case 1 -> 21;
            case 2 -> 220;
            case 3 -> 153;
            case 4 -> 103;
            case 5 -> 197;
            case 6 -> 241;
            case 7 -> 87;
            case 8 -> 246;
            case 9 -> 37;
            case 10 -> 173;
            case 11 -> 213;
            case 12 -> 126;
            case 13 -> 114;
            case 14 -> 12;
            case 15 -> 249;
            case 16 -> 175;
            case 17 -> 32;
            case 18 -> 208;
            case 19 -> 127;
            case 20 -> 72;
            case 21 -> 93;
            case 22 -> 54;
            case 23 -> 210;
            case 24 -> 253;
            case 25 -> 5;
            case 26 -> 176;
            case 27 -> 121;
            case 28 -> 156;
            case 29 -> 58;
            case 30 -> 53;
            case 31 -> 255;
            case 32 -> 158;
            case 33 -> 214;
            case 34 -> 73;
            case 35 -> 177;
            case 36 -> 136;
            case 37 -> 247;
            case 38 -> 118;
            case 39 -> 150;
            case 40 -> 163;
            case 41 -> 20;
            case 42 -> 142;
            case 43 -> 212;
            case 44 -> 164;
            case 45 -> 82;
            case 46 -> 61;
            case 47 -> 206;
            case 48 -> 1;
            case 49 -> 33;
            case 50 -> 116;
            case 51 -> 42;
            case 52 -> 83;
            case 53 -> 100;
            case 54 -> 211;
            case 55 -> 201;
            case 56 -> 31;
            case 57 -> 129;
            case 58 -> 190;
            case 59 -> 30;
            case 60 -> 239;
            case 61 -> 222;
            case 62 -> 132;
            case 63 -> 123;
            case 64 -> 28;
            case 65 -> 119;
            case 66 -> 146;
            case 67 -> 86;
            case 68 -> 101;
            case 69 -> 245;
            case 70 -> 148;
            case 71 -> 183;
            case 72 -> 160;
            case 73 -> 143;
            case 74 -> 128;
            case 75 -> 96;
            case 76 -> 189;
            case 77 -> 250;
            case 78 -> 138;
            case 79 -> 140;
            case 80 -> 59;
            case 81 -> 131;
            case 82 -> 203;
            case 83 -> 0;
            case 84 -> 166;
            case 85 -> 62;
            case 86 -> 161;
            case 87 -> 88;
            case 88 -> 191;
            case 89 -> 151;
            case 90 -> 149;
            case 91 -> 169;
            case 92 -> 237;
            case 93 -> 154;
            case 94 -> 71;
            case 95 -> 115;
            case 96 -> 244;
            case 97 -> 35;
            case 98 -> 66;
            case 99 -> 125;
            case 100 -> 13;
            case 101 -> 74;
            case 102 -> 240;
            case 103 -> 79;
            case 104 -> 76;
            case 105 -> 57;
            case 106 -> 18;
            case 107 -> 152;
            case 108 -> 174;
            case 109 -> 180;
            case 110 -> 232;
            case 111 -> 112;
            case 112 -> 70;
            case 113 -> 130;
            case 114 -> 198;
            case 115 -> 81;
            case 116 -> 78;
            case 117 -> 29;
            case 118 -> 165;
            case 119 -> 2;
            case 120 -> 207;
            case 121 -> 63;
            case 122 -> 89;
            case 123 -> 235;
            case 124 -> 50;
            case 125 -> 122;
            case 126 -> 111;
            case 127 -> 157;
            case 128 -> 25;
            case 129 -> 230;
            case 130 -> 84;
            case 131 -> 200;
            case 132 -> 185;
            case 133 -> 65;
            case 134 -> 85;
            case 135 -> 39;
            case 136 -> 14;
            case 137 -> 224;
            case 138 -> 9;
            case 139 -> 91;
            case 140 -> 23;
            case 141 -> 110;
            case 142 -> 141;
            case 143 -> 8;
            case 144 -> 147;
            case 145 -> 40;
            case 146 -> 36;
            case 147 -> 4;
            case 148 -> 68;
            case 149 -> 172;
            case 150 -> 117;
            case 151 -> 80;
            case 152 -> 98;
            case 153 -> 145;
            case 154 -> 227;
            case 155 -> 223;
            case 156 -> 133;
            case 157 -> 55;
            case 158 -> 170;
            case 159 -> 187;
            case 160 -> 178;
            case 161 -> 202;
            case 162 -> 113;
            case 163 -> 134;
            case 164 -> 60;
            case 165 -> 90;
            case 166 -> 194;
            case 167 -> 251;
            case 168 -> 105;
            case 169 -> 69;
            case 170 -> 11;
            case 171 -> 75;
            case 172 -> 219;
            case 173 -> 64;
            case 174 -> 168;
            case 175 -> 77;
            case 176 -> 228;
            case 177 -> 97;
            case 178 -> 184;
            case 179 -> 221;
            case 180 -> 162;
            case 181 -> 217;
            case 182 -> 104;
            case 183 -> 231;
            case 184 -> 188;
            case 185 -> 199;
            case 186 -> 16;
            case 187 -> 243;
            case 188 -> 209;
            case 189 -> 51;
            case 190 -> 196;
            case 191 -> 182;
            case 192 -> 218;
            case 193 -> 17;
            case 194 -> 238;
            case 195 -> 216;
            case 196 -> 44;
            case 197 -> 236;
            case 198 -> 109;
            case 199 -> 7;
            case 200 -> 43;
            case 201 -> 107;
            case 202 -> 52;
            case 203 -> 226;
            case 204 -> 67;
            case 205 -> 26;
            case 206 -> 102;
            case 207 -> 47;
            case 208 -> 106;
            case 209 -> 49;
            case 210 -> 159;
            case 211 -> 34;
            case 212 -> 19;
            case 213 -> 254;
            case 214 -> 186;
            case 215 -> 135;
            case 216 -> 252;
            case 217 -> 120;
            case 218 -> 234;
            case 219 -> 233;
            case 220 -> 139;
            case 221 -> 15;
            case 222 -> 56;
            case 223 -> 95;
            case 224 -> 171;
            case 225 -> 38;
            case 226 -> 229;
            case 227 -> 242;
            case 228 -> 195;
            case 229 -> 124;
            case 230 -> 137;
            case 231 -> 248;
            case 232 -> 204;
            case 233 -> 41;
            case 234 -> 3;
            case 235 -> 45;
            case 236 -> 94;
            case 237 -> 46;
            case 238 -> 22;
            case 239 -> 225;
            case 240 -> 99;
            case 241 -> 48;
            case 242 -> 205;
            case 243 -> 155;
            case 244 -> 167;
            case 245 -> 92;
            case 246 -> 179;
            case 247 -> 192;
            case 248 -> 27;
            case 249 -> 24;
            case 250 -> 108;
            case 251 -> 193;
            case 252 -> 181;
            case 253 -> 215;
            case 254 -> 10;
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
