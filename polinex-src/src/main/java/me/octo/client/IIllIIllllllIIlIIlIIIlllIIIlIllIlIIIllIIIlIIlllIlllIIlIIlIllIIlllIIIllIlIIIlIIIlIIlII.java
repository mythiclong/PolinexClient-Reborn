package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII {

   @NotNull
   public static IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<AABB> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<AABB> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final List<Class<? extends Entity>> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final List<String> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final List<String> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final List<String> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final List<String> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] a;
   private static String[] b;

   public IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
      @NotNull List<? extends AABB> var1,
      @NotNull List<? extends AABB> var2,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var3,
      @NotNull List<? extends Class<? extends Entity>> var4,
      @NotNull List<String> var5,
      @NotNull List<String> var6,
      @NotNull List<String> var7,
      @NotNull List<String> var8,
      boolean var9,
      boolean var10
   ) {
      short var10001 = -14063;
      short var10002 = -2662;
      Intrinsics.checkNotNullParameter(var1, "combatAreas");
      var10001 = -14076;
      var10002 = -16241;
      Intrinsics.checkNotNullParameter(var2, "ignoreAreas");
      var10001 = -14074;
      var10002 = -28584;
      Intrinsics.checkNotNullParameter(var3, "bounds");
      var10001 = -14077;
      var10002 = 32444;
      Intrinsics.checkNotNullParameter(var4, "classes");
      var10001 = -14065;
      var10002 = -10706;
      Intrinsics.checkNotNullParameter(var5, "names");
      var10001 = -14064;
      var10002 = 11102;
      Intrinsics.checkNotNullParameter(var6, "ignoreOneTap");
      var10001 = -14078;
      var10002 = 3157;
      Intrinsics.checkNotNullParameter(var7, "ignoreCompletely");
      var10001 = -14052;
      var10002 = 25936;
      Intrinsics.checkNotNullParameter(var8, "prioritySwords");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = ((List<AABB>)(Object)(var1));
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((List<AABB>)(Object)(var2));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = ((List<Class<? extends Entity>>)(Object)(var4));
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var6;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var8;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var9;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var10;
   }

   public IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
      List var1,
      List var2,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var3,
      List var4,
      List var5,
      List var6,
      List var7,
      List var8,
      boolean var9,
      boolean var10,
      int var11,
      kotlin.jvm.internal.DefaultConstructorMarker var12
   ) {
      if ((var11 & 256) != 0) {
         var9 = true;
      }

      if ((var11 & 512) != 0) {
         var10 = false;
      }

      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @NotNull
   public static IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII a(
      IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII var0,
      List var1,
      List var2,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var3,
      List var4,
      List var5,
      List var6,
      List var7,
      List var8,
      boolean var9,
      boolean var10,
      int var11,
      java.lang.Object var12
   ) {
      if ((var11 & 1) != 0) {
         var1 = var0.a();
      }

      if ((var11 & 2) != 0) {
         var2 = var0.b();
      }

      if ((var11 & 4) != 0) {
         var3 = var0.c();
      }

      if ((var11 & 8) != 0) {
         var4 = var0.d();
      }

      if ((var11 & 16) != 0) {
         var5 = var0.e();
      }

      if ((var11 & 32) != 0) {
         var6 = var0.f();
      }

      if ((var11 & 64) != 0) {
         var7 = var0.g();
      }

      if ((var11 & 128) != 0) {
         var8 = var0.h();
      }

      if ((var11 & 256) != 0) {
         var9 = var0.i();
      }

      if ((var11 & 512) != 0) {
         var10 = var0.j();
      }
      return var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @NotNull
   public final List<AABB> a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<AABB> b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final List<Class<? extends Entity>> d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final List<String> e() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final List<String> f() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final List<String> g() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final List<String> h() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final boolean i() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final boolean j() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final List<AABB> k() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<AABB> l() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid m() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final List<Class<? extends Entity>> n() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final List<String> o() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final List<String> p() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final List<String> q() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final List<String> r() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final boolean s() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final boolean t() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII a(
      @NotNull List<? extends AABB> var1,
      @NotNull List<? extends AABB> var2,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var3,
      @NotNull List<? extends Class<? extends Entity>> var4,
      @NotNull List<String> var5,
      @NotNull List<String> var6,
      @NotNull List<String> var7,
      @NotNull List<String> var8,
      boolean var9,
      boolean var10
   ) {
      short var10001 = -14071;
      short var10002 = -5795;
      Intrinsics.checkNotNullParameter(var1, "combatAreas");
      var10001 = -14073;
      var10002 = 29297;
      Intrinsics.checkNotNullParameter(var2, "ignoreAreas");
      var10001 = -14050;
      var10002 = 6749;
      Intrinsics.checkNotNullParameter(var3, "bounds");
      var10001 = -14067;
      var10002 = -2457;
      Intrinsics.checkNotNullParameter(var4, "classes");
      var10001 = -14080;
      var10002 = -17139;
      Intrinsics.checkNotNullParameter(var5, "names");
      var10001 = -14068;
      var10002 = -6335;
      Intrinsics.checkNotNullParameter(var6, "ignoreOneTap");
      var10001 = -14075;
      var10002 = -9206;
      Intrinsics.checkNotNullParameter(var7, "ignoreCompletely");
      var10001 = -14072;
      var10002 = -10949;
      Intrinsics.checkNotNullParameter(var8, "prioritySwords");
      return new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
         var1, var2, var3, var4, var5, var6, var7, var8, var9, var10
      );
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = -14079;
      boolean var1 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      boolean var2 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      List var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      List var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      List var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      List var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      List var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      List var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      List var10 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10001 = 29228;
      short var10002 = -14069;
      short var10003 = 25540;
      short var10004 = -14053;
      short var10005 = -9518;
      short var10006 = -14056;
      short var10007 = 5359;
      short var10008 = -14070;
      short var10009 = -32720;
      short var10010 = -14066;
      short var10011 = 31085;
      short var10012 = -14051;
      short var10013 = 12662;
      short var10014 = -14054;
      short var10015 = -20470;
      short var10016 = -14049;
      short var10017 = 23306;
      short var10018 = -14055;
      short var10019 = -26468;
      return "CombatConfig(combatAreas="
         + var10
         + ", ignoreAreas="
         + var9
         + ", bounds="
         + var8
         + ", classes="
         + var7
         + ", names="
         + var6
         + ", ignoreOneTap="
         + var5
         + ", ignoreCompletely="
         + var4
         + ", prioritySwords="
         + var3
         + ", allowSneaking="
         + var2
         + ", skipReachability="
         + var1
         + ")";
   }

   @Override
   public int hashCode() {
      int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      String var10000 = IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      var2 = var2 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      String var1 = var10000;
      var2 = var2 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      var2 = var2 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      var2 = var2 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
      var2 = var2 * 31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.hashCode();
      var2 = var2 * 31 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.hashCode();
      var2 = var2 * 31 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.hashCode();
      var2 = var2 * 31 + Boolean.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
      if (var1 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }

      return var2;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII)) {
            return false;
         }

         var10000 = var1;
      }

      IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII var3 = (IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII)var10000;
      boolean var4 = Intrinsics.areEqual(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
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

         var4 = Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
            var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
            var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
            var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         );
      }

      if (var2 == null) {
         if (!var4) {
            return false;
         }

         var4 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      boolean var10001 = var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (var2 == null) {
         if (var4 != var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            return false;
         }

         var4 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         if (var2 != null) {
            return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }

         var10001 = var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      return var4 == var10001;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "tó\\IªIoø$û¶\u0083»M\u000b¾Qp®¸\u0004iäA\u0004ö\b\r>£æ\u00ad\u007ft÷\u000ezxJ(tj-F¸¶\u007f\u009cÞ\u0091\f\u008bP\u009e\u008a\u0015=£ì×¯6L\u0007Ó\u0002Ñ¶\u0013%~\u000f¸§\u0012Ó\u007f\u0015L©\u009aWô\n½\u009d+\u0005ìt\u0096Âv\u0005N\u009eÂ\u009fü\u0019\u0085\u001c3\u0007Ð1f_éÊ\u0093\u0083\u0095ê\u001c_¦.\u0099BÉ¨\u0004j\u0094\u0010qÉÁ¹þ[Ò!|\u0013Gnö\u0013¤²\u0007\u0086¤{bF¿Ô\u000b<\u008ch\u0011ËNv\u009e¢K\u008a\u0010MþF_\u000e\u0087Ìº¿`?\u0000ùÞE\u000b\u0006J\u0010×\u008aR\n\u000b6V)Jã%só\u0002æ\u009e\nD\b\u0087-\u0089¼}\u0003¡Q\u0013î\u0089Â\u001a;¾\u0003 ykn\u0014AÔ\u0086×\u0080£À\u0011\u0005È¼+\u0097½¶°þî\u0012ë\u009fäù³/\tÈ³\u0017Y®L\u0018µ¶\u000e¾È\u0005.\u0081¥\ne\u0088H#õ\t\u0083\u0013'\u0083áW\u0001\u0085\u0083»o\u0014ÏgÞ\u0085¢|\u0007[+\u0006\u0003$þ\fwÚ\u0010\u0014\u0004\u008f¬Ç\u0090\u001c/\u0014|$:+]ªU";
      int var4 = "tó\\IªIoø$û¶\u0083»M\u000b¾Qp®¸\u0004iäA\u0004ö\b\r>£æ\u00ad\u007ft÷\u000ezxJ(tj-F¸¶\u007f\u009cÞ\u0091\f\u008bP\u009e\u008a\u0015=£ì×¯6L\u0007Ó\u0002Ñ¶\u0013%~\u000f¸§\u0012Ó\u007f\u0015L©\u009aWô\n½\u009d+\u0005ìt\u0096Âv\u0005N\u009eÂ\u009fü\u0019\u0085\u001c3\u0007Ð1f_éÊ\u0093\u0083\u0095ê\u001c_¦.\u0099BÉ¨\u0004j\u0094\u0010qÉÁ¹þ[Ò!|\u0013Gnö\u0013¤²\u0007\u0086¤{bF¿Ô\u000b<\u008ch\u0011ËNv\u009e¢K\u008a\u0010MþF_\u000e\u0087Ìº¿`?\u0000ùÞE\u000b\u0006J\u0010×\u008aR\n\u000b6V)Jã%só\u0002æ\u009e\nD\b\u0087-\u0089¼}\u0003¡Q\u0013î\u0089Â\u001a;¾\u0003 ykn\u0014AÔ\u0086×\u0080£À\u0011\u0005È¼+\u0097½¶°þî\u0012ë\u009fäù³/\tÈ³\u0017Y®L\u0018µ¶\u000e¾È\u0005.\u0081¥\ne\u0088H#õ\t\u0083\u0013'\u0083áW\u0001\u0085\u0083»o\u0014ÏgÞ\u0085¢|\u0007[+\u0006\u0003$þ\fwÚ\u0010\u0014\u0004\u008f¬Ç\u0090\u001c/\u0014|$:+]ªU"
         .length();
      char var1 = 14;
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
                     case 0 -> 71;
                     case 1 -> 40;
                     case 2 -> 10;
                     case 3 -> 70;
                     case 4 -> 113;
                     case 5 -> 100;
                     default -> 123;
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
                     b = new String[26];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII(
                        CollectionsKt.emptyList(),
                        CollectionsKt.emptyList(),
                        me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(),
                        CollectionsKt.emptyList(),
                        CollectionsKt.emptyList(),
                        CollectionsKt.emptyList(),
                        CollectionsKt.emptyList(),
                        CollectionsKt.emptyList(),
                        false,
                        false,
                        768,
                        null
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

                  var2 = "û×\u0000êV¡[ïX_WÂ\u000bÖ\u0010í\u0016\u009b\u0083\u009d\u0084O\u0098§";
                  var4 = "û×\u0000êV¡[ïX_WÂ\u000bÖ\u0010í\u0016\u009b\u0083\u009d\u0084O\u0098§".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 21;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -14072) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 194;
            case 1 -> 160;
            case 2 -> 120;
            case 3 -> 222;
            case 4 -> 150;
            case 5 -> 231;
            case 6 -> 228;
            case 7 -> 51;
            case 8 -> 225;
            case 9 -> 124;
            case 10 -> 80;
            case 11 -> 133;
            case 12 -> 166;
            case 13 -> 234;
            case 14 -> 94;
            case 15 -> 156;
            case 16 -> 152;
            case 17 -> 23;
            case 18 -> 142;
            case 19 -> 206;
            case 20 -> 30;
            case 21 -> 5;
            case 22 -> 59;
            case 23 -> 25;
            case 24 -> 67;
            case 25 -> 45;
            case 26 -> 252;
            case 27 -> 255;
            case 28 -> 216;
            case 29 -> 148;
            case 30 -> 162;
            case 31 -> 40;
            case 32 -> 36;
            case 33 -> 161;
            case 34 -> 211;
            case 35 -> 53;
            case 36 -> 82;
            case 37 -> 149;
            case 38 -> 218;
            case 39 -> 12;
            case 40 -> 6;
            case 41 -> 117;
            case 42 -> 130;
            case 43 -> 159;
            case 44 -> 213;
            case 45 -> 205;
            case 46 -> 17;
            case 47 -> 31;
            case 48 -> 132;
            case 49 -> 28;
            case 50 -> 35;
            case 51 -> 192;
            case 52 -> 118;
            case 53 -> 125;
            case 54 -> 68;
            case 55 -> 131;
            case 56 -> 200;
            case 57 -> 245;
            case 58 -> 201;
            case 59 -> 235;
            case 60 -> 219;
            case 61 -> 126;
            case 62 -> 196;
            case 63 -> 88;
            case 64 -> 198;
            case 65 -> 181;
            case 66 -> 116;
            case 67 -> 144;
            case 68 -> 233;
            case 69 -> 107;
            case 70 -> 134;
            case 71 -> 191;
            case 72 -> 227;
            case 73 -> 123;
            case 74 -> 98;
            case 75 -> 43;
            case 76 -> 193;
            case 77 -> 140;
            case 78 -> 26;
            case 79 -> 168;
            case 80 -> 113;
            case 81 -> 48;
            case 82 -> 27;
            case 83 -> 37;
            case 84 -> 172;
            case 85 -> 4;
            case 86 -> 15;
            case 87 -> 73;
            case 88 -> 137;
            case 89 -> 18;
            case 90 -> 138;
            case 91 -> 246;
            case 92 -> 32;
            case 93 -> 236;
            case 94 -> 204;
            case 95 -> 61;
            case 96 -> 1;
            case 97 -> 151;
            case 98 -> 21;
            case 99 -> 0;
            case 100 -> 145;
            case 101 -> 139;
            case 102 -> 63;
            case 103 -> 83;
            case 104 -> 55;
            case 105 -> 170;
            case 106 -> 178;
            case 107 -> 185;
            case 108 -> 11;
            case 109 -> 221;
            case 110 -> 78;
            case 111 -> 19;
            case 112 -> 71;
            case 113 -> 74;
            case 114 -> 237;
            case 115 -> 188;
            case 116 -> 226;
            case 117 -> 220;
            case 118 -> 70;
            case 119 -> 7;
            case 120 -> 248;
            case 121 -> 14;
            case 122 -> 34;
            case 123 -> 199;
            case 124 -> 136;
            case 125 -> 250;
            case 126 -> 8;
            case 127 -> 217;
            case 128 -> 128;
            case 129 -> 239;
            case 130 -> 212;
            case 131 -> 49;
            case 132 -> 179;
            case 133 -> 176;
            case 134 -> 33;
            case 135 -> 169;
            case 136 -> 85;
            case 137 -> 230;
            case 138 -> 240;
            case 139 -> 75;
            case 140 -> 153;
            case 141 -> 50;
            case 142 -> 147;
            case 143 -> 164;
            case 144 -> 47;
            case 145 -> 247;
            case 146 -> 101;
            case 147 -> 109;
            case 148 -> 214;
            case 149 -> 180;
            case 150 -> 182;
            case 151 -> 121;
            case 152 -> 20;
            case 153 -> 119;
            case 154 -> 232;
            case 155 -> 79;
            case 156 -> 190;
            case 157 -> 84;
            case 158 -> 76;
            case 159 -> 41;
            case 160 -> 91;
            case 161 -> 209;
            case 162 -> 175;
            case 163 -> 167;
            case 164 -> 197;
            case 165 -> 57;
            case 166 -> 114;
            case 167 -> 249;
            case 168 -> 65;
            case 169 -> 158;
            case 170 -> 99;
            case 171 -> 244;
            case 172 -> 187;
            case 173 -> 86;
            case 174 -> 171;
            case 175 -> 97;
            case 176 -> 238;
            case 177 -> 242;
            case 178 -> 154;
            case 179 -> 44;
            case 180 -> 135;
            case 181 -> 81;
            case 182 -> 215;
            case 183 -> 10;
            case 184 -> 69;
            case 185 -> 157;
            case 186 -> 58;
            case 187 -> 72;
            case 188 -> 165;
            case 189 -> 243;
            case 190 -> 241;
            case 191 -> 253;
            case 192 -> 111;
            case 193 -> 127;
            case 194 -> 110;
            case 195 -> 173;
            case 196 -> 108;
            case 197 -> 90;
            case 198 -> 46;
            case 199 -> 93;
            case 200 -> 223;
            case 201 -> 177;
            case 202 -> 186;
            case 203 -> 13;
            case 204 -> 62;
            case 205 -> 38;
            case 206 -> 174;
            case 207 -> 64;
            case 208 -> 56;
            case 209 -> 251;
            case 210 -> 96;
            case 211 -> 183;
            case 212 -> 207;
            case 213 -> 52;
            case 214 -> 163;
            case 215 -> 112;
            case 216 -> 66;
            case 217 -> 141;
            case 218 -> 189;
            case 219 -> 60;
            case 220 -> 89;
            case 221 -> 102;
            case 222 -> 146;
            case 223 -> 3;
            case 224 -> 92;
            case 225 -> 24;
            case 226 -> 208;
            case 227 -> 184;
            case 228 -> 104;
            case 229 -> 9;
            case 230 -> 115;
            case 231 -> 143;
            case 232 -> 155;
            case 233 -> 77;
            case 234 -> 100;
            case 235 -> 22;
            case 236 -> 29;
            case 237 -> 87;
            case 238 -> 195;
            case 239 -> 229;
            case 240 -> 2;
            case 241 -> 103;
            case 242 -> 54;
            case 243 -> 129;
            case 244 -> 210;
            case 245 -> 254;
            case 246 -> 203;
            case 247 -> 105;
            case 248 -> 224;
            case 249 -> 95;
            case 250 -> 16;
            case 251 -> 122;
            case 252 -> 106;
            case 253 -> 39;
            case 254 -> 202;
            default -> 42;
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


   @NotNull
   public static final IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII u() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII a() {
         return IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public static void b(String var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static String b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (b() != null) {
            b("PJNzob");
         }
      }
   
      // PX-FIX-ok: Kotlin synthetic default-ctor bridge (jar: <init>(DefaultConstructorMarker)V -> this())
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) {
         this();
      }
}
}
