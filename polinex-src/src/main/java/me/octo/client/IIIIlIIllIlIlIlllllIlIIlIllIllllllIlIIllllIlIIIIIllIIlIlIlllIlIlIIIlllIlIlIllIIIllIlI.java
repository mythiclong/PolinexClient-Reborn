package me.octo.client;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI {

   @NotNull
   private final List<Class<? extends Entity>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<AABB> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final List<AABB> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final Vec3 IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final List<Function1<Entity, Boolean>> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private List<AABB> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] b;
   private static String[] c;

   public IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
      @NotNull List<? extends Class<? extends Entity>> var1,
      @NotNull List<String> var2,
      @NotNull List<? extends AABB> var3,
      @NotNull List<? extends AABB> var4,
      @NotNull Vec3 var5,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7,
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var8,
      @NotNull List<? extends Function1<? super Entity, Boolean>> var9,
      @NotNull List<? extends AABB> var10,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11
   ) {
      short var10001 = -31357;
      short var10002 = 20679;
      Intrinsics.checkNotNullParameter(var1, "targetClasses");
      var10001 = -31351;
      var10002 = 29473;
      Intrinsics.checkNotNullParameter(var2, "targetNames");
      var10001 = -31331;
      var10002 = 26055;
      Intrinsics.checkNotNullParameter(var3, "targetBoxes");
      var10001 = -31345;
      var10002 = 21054;
      Intrinsics.checkNotNullParameter(var4, "ignoreBoxes");
      var10001 = -31344;
      var10002 = -31029;
      Intrinsics.checkNotNullParameter(var5, "hotZone");
      var10001 = -31348;
      var10002 = 19721;
      Intrinsics.checkNotNullParameter(var6, "warpLocation");
      var10001 = -31337;
      var10002 = -11283;
      Intrinsics.checkNotNullParameter(var7, "location");
      var10001 = -31358;
      var10002 = 15195;
      Intrinsics.checkNotNullParameter(var8, "route");
      var10001 = -31329;
      var10002 = 24369;
      Intrinsics.checkNotNullParameter(var9, "targetPriority");
      var10001 = -31350;
      var10002 = -15508;
      Intrinsics.checkNotNullParameter(var10, "idleBoxes");
      var10001 = -31355;
      var10002 = -12154;
      Intrinsics.checkNotNullParameter(var11, "bounds");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ((List<Class<? extends Entity>>)(Object)(var1));
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((List<AABB>)(Object)(var3));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = ((List<AABB>)(Object)(var4));
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = ((List<Function1<Entity,Boolean>>)(Object)(var9));
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = ((List<AABB>)(Object)(var10));
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
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
   public final List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> h() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final List<Function1<Entity, Boolean>> i() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final List<AABB> j() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll k() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final List<Class<? extends Entity>> l() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final List<String> m() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<AABB> n() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final List<AABB> o() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final Vec3 p() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI q() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI r() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> s() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final List<Function1<Entity, Boolean>> t() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final List<AABB> u() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll v() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI a(
      @NotNull List<? extends Class<? extends Entity>> var1,
      @NotNull List<String> var2,
      @NotNull List<? extends AABB> var3,
      @NotNull List<? extends AABB> var4,
      @NotNull Vec3 var5,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6,
      @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7,
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var8,
      @NotNull List<? extends Function1<? super Entity, Boolean>> var9,
      @NotNull List<? extends AABB> var10,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11
   ) {
      short var10001 = -31330;
      short var10002 = 20775;
      Intrinsics.checkNotNullParameter(var1, "targetClasses");
      var10001 = -31338;
      var10002 = 5939;
      Intrinsics.checkNotNullParameter(var2, "targetNames");
      var10001 = -31354;
      var10002 = 29316;
      Intrinsics.checkNotNullParameter(var3, "targetBoxes");
      var10001 = -31356;
      var10002 = -15846;
      Intrinsics.checkNotNullParameter(var4, "ignoreBoxes");
      var10001 = -31332;
      var10002 = 3020;
      Intrinsics.checkNotNullParameter(var5, "hotZone");
      var10001 = -31352;
      var10002 = 24003;
      Intrinsics.checkNotNullParameter(var6, "warpLocation");
      var10001 = -31336;
      var10002 = -21517;
      Intrinsics.checkNotNullParameter(var7, "location");
      var10001 = -31301;
      var10002 = 26466;
      Intrinsics.checkNotNullParameter(var8, "route");
      var10001 = -31334;
      var10002 = 19672;
      Intrinsics.checkNotNullParameter(var9, "targetPriority");
      var10001 = -31347;
      var10002 = 14752;
      Intrinsics.checkNotNullParameter(var10, "idleBoxes");
      var10001 = -31343;
      var10002 = 7463;
      Intrinsics.checkNotNullParameter(var11, "bounds");
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11
      );
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = -31349;
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      List var2 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      List var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      List var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      List var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      List var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      List var10 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      List var11 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10001 = 24547;
      short var10002 = -31342;
      short var10003 = 1732;
      short var10004 = -31360;
      short var10005 = 23492;
      short var10006 = -31335;
      short var10007 = -10102;
      short var10008 = -31346;
      short var10009 = 20276;
      short var10010 = -31359;
      short var10011 = -31160;
      short var10012 = -31339;
      short var10013 = -22148;
      short var10014 = -31340;
      short var10015 = -11171;
      short var10016 = -31341;
      short var10017 = 16969;
      short var10018 = -31333;
      short var10019 = 22876;
      short var10020 = -31353;
      short var10021 = -10392;
      return "CombatArea(targetClasses="
         + var11
         + ", targetNames="
         + var10
         + ", targetBoxes="
         + var9
         + ", ignoreBoxes="
         + var8
         + ", hotZone="
         + var7
         + ", warpLocation="
         + var6
         + ", location="
         + var5
         + ", route="
         + var4
         + ", targetPriority="
         + var3
         + ", idleBoxes="
         + var2
         + ", bounds="
         + var1
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      var1 = var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      var1 = var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      var1 = var1 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      var1 = var1 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
      var1 = var1 * 31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.hashCode();
      var1 = var1 * 31 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.hashCode();
      var1 = var1 * 31 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.hashCode();
      var1 = var1 * 31 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.hashCode();
      return var1 * 31 + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String[] var2 = w();
      IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = (IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI)var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI)) {
            return false;
         }

         var10000 = (IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI)var1;
      }

      IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI var3 = var10000;
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

         var4 = Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
      }

      label114: {
         if (var2 == null) {
            if (!var4) {
               return false;
            }

            var10000 = this;
            if (var2 != null) {
               break label114;
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

      label116: {
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var2 == null) {
            if (var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               != var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               return false;
            }

            var10000 = this;
            if (var2 != null) {
               break label116;
            }

            var6 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            var10001 = var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         if (var6 != var10001) {
            return false;
         }

         var10000 = this;
      }

      boolean var8 = Intrinsics.areEqual(
         var10000.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      if (var2 == null) {
         if (!var8) {
            return false;
         }

         var8 = Intrinsics.areEqual(
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
            var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         );
      }

      if (var2 == null) {
         if (!var8) {
            return false;
         }

         var8 = Intrinsics.areEqual(
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
            var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         );
      }

      if (var2 == null) {
         if (!var8) {
            return false;
         }

         var8 = Intrinsics.areEqual(
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         );
      }

      if (var2 == null) {
         if (!var8) {
            return false;
         }

         var8 = true;
      }

      return var8;
   }

   public static void b(String[] var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var0;
   }

   public static String[] w() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[33];
      int var3 = 0;
      String var2 = "-KÆNô\u001d\u0095øY[H\u009b\u000e¥£\u009f9®\u0081äE6X\u0097äã\t\u000eïú\u009e{ýÒÆ@?\ròB\u0003\u0014\b\t½\u00003\u007f\u001bÒ´\u000e\u0092\u0086y\u009dr\u0015\u007f×E\nù®.@\r\u0088\u008c:Ü\u001a=aÌÿ¨¦iã\u000bj¾f\u009a\u0091õ\u0011ÖÉ\u009eZ\u0007\u0095¾\u0000h\u0091+}\u0011q\u001bPA\u0086[!i$\u0006Ð\u0097u±\u001b\u0092\u0007\u000e[z\u0015m.Þ4Ù\u0098\u0003\u009eL9Õ\u0006õáF·s\u007f\u0007\u008f<C8ù!p\b¯-Ô!åY\u0081ü\u000bkuFã\u0095Ú\u009d=À,Ì\u000bm[ËGÿR,\u0093\u0089ûé\b\u008ap)\"hë\u001bG\u0019\u0001ÆÅ_\u001dè\u0007huó(C\u0010HÕÉæÔN\u0089óò\u009f\u0093`\t\bÑ\u008aÐöå\u0004¦\u001d\u000bHä\"Ñ\u0019\u009c\fõò5\u008a\fIZa\u0011Xj\u0005SBíº\u0093\u000bÝ¨2\u0096\u0093l¤Ö\u007f\u009e\u008c\n\u0091\u001dP\u008f\u001fpÞ\u008c¥¬\t\u008c\u0017\u001a\bäþFÅU\f\u001a'\u000b¾\u0015\u009f¬íw:\u001ci\r\u008flÚÀ\u0006¾â¼\u008f¦¨¨\"\u0005\u0012@¨\u0099¯\u000fÓþ\u0007ý\u000fÛ9\u0097\u0018²\u001fv/L§\u000e[¯\u0015×.\u008943\u0094P\u0087é\u00ada\tO»\u0081[oÞúö\u0013\u000b\u0018p(CXÎ(±îr¾\u0006þB'Ã_ñ";
      int var4 = "-KÆNô\u001d\u0095øY[H\u009b\u000e¥£\u009f9®\u0081äE6X\u0097äã\t\u000eïú\u009e{ýÒÆ@?\ròB\u0003\u0014\b\t½\u00003\u007f\u001bÒ´\u000e\u0092\u0086y\u009dr\u0015\u007f×E\nù®.@\r\u0088\u008c:Ü\u001a=aÌÿ¨¦iã\u000bj¾f\u009a\u0091õ\u0011ÖÉ\u009eZ\u0007\u0095¾\u0000h\u0091+}\u0011q\u001bPA\u0086[!i$\u0006Ð\u0097u±\u001b\u0092\u0007\u000e[z\u0015m.Þ4Ù\u0098\u0003\u009eL9Õ\u0006õáF·s\u007f\u0007\u008f<C8ù!p\b¯-Ô!åY\u0081ü\u000bkuFã\u0095Ú\u009d=À,Ì\u000bm[ËGÿR,\u0093\u0089ûé\b\u008ap)\"hë\u001bG\u0019\u0001ÆÅ_\u001dè\u0007huó(C\u0010HÕÉæÔN\u0089óò\u009f\u0093`\t\bÑ\u008aÐöå\u0004¦\u001d\u000bHä\"Ñ\u0019\u009c\fõò5\u008a\fIZa\u0011Xj\u0005SBíº\u0093\u000bÝ¨2\u0096\u0093l¤Ö\u007f\u009e\u008c\n\u0091\u001dP\u008f\u001fpÞ\u008c¥¬\t\u008c\u0017\u001a\bäþFÅU\f\u001a'\u000b¾\u0015\u009f¬íw:\u001ci\r\u008flÚÀ\u0006¾â¼\u008f¦¨¨\"\u0005\u0012@¨\u0099¯\u000fÓþ\u0007ý\u000fÛ9\u0097\u0018²\u001fv/L§\u000e[¯\u0015×.\u008943\u0094P\u0087é\u00ada\tO»\u0081[oÞúö\u0013\u000b\u0018p(CXÎ(±îr¾\u0006þB'Ã_ñ"
         .length();
      char var1 = '\f';
      b(null);
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 42;
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
                     case 0 -> 125;
                     case 1 -> 18;
                     case 2 -> 99;
                     case 3 -> 74;
                     case 4 -> 7;
                     case 5 -> 127;
                     default -> 39;
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
                     b = var5;
                     c = new String[33];
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

                  var2 = "\u0006ßÚë\u001dPæÂ¤\u008fd\u0005Ç¾\u0081Õ\u0019";
                  var4 = "\u0006ßÚë\u001dPæÂ¤\u008fd\u0005Ç¾\u0081Õ\u0019".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 31;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31333) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 23;
            case 1 -> 218;
            case 2 -> 211;
            case 3 -> 170;
            case 4 -> 87;
            case 5 -> 204;
            case 6 -> 38;
            case 7 -> 45;
            case 8 -> 106;
            case 9 -> 104;
            case 10 -> 96;
            case 11 -> 168;
            case 12 -> 164;
            case 13 -> 55;
            case 14 -> 136;
            case 15 -> 123;
            case 16 -> 83;
            case 17 -> 247;
            case 18 -> 226;
            case 19 -> 46;
            case 20 -> 116;
            case 21 -> 145;
            case 22 -> 80;
            case 23 -> 169;
            case 24 -> 52;
            case 25 -> 194;
            case 26 -> 64;
            case 27 -> 214;
            case 28 -> 252;
            case 29 -> 2;
            case 30 -> 90;
            case 31 -> 182;
            case 32 -> 224;
            case 33 -> 190;
            case 34 -> 244;
            case 35 -> 93;
            case 36 -> 132;
            case 37 -> 220;
            case 38 -> 63;
            case 39 -> 176;
            case 40 -> 8;
            case 41 -> 151;
            case 42 -> 25;
            case 43 -> 143;
            case 44 -> 205;
            case 45 -> 19;
            case 46 -> 107;
            case 47 -> 150;
            case 48 -> 228;
            case 49 -> 234;
            case 50 -> 39;
            case 51 -> 249;
            case 52 -> 212;
            case 53 -> 158;
            case 54 -> 75;
            case 55 -> 98;
            case 56 -> 208;
            case 57 -> 231;
            case 58 -> 102;
            case 59 -> 165;
            case 60 -> 235;
            case 61 -> 126;
            case 62 -> 118;
            case 63 -> 147;
            case 64 -> 60;
            case 65 -> 24;
            case 66 -> 47;
            case 67 -> 85;
            case 68 -> 78;
            case 69 -> 36;
            case 70 -> 133;
            case 71 -> 130;
            case 72 -> 22;
            case 73 -> 121;
            case 74 -> 202;
            case 75 -> 97;
            case 76 -> 40;
            case 77 -> 207;
            case 78 -> 117;
            case 79 -> 73;
            case 80 -> 20;
            case 81 -> 77;
            case 82 -> 11;
            case 83 -> 115;
            case 84 -> 71;
            case 85 -> 69;
            case 86 -> 206;
            case 87 -> 149;
            case 88 -> 43;
            case 89 -> 3;
            case 90 -> 159;
            case 91 -> 86;
            case 92 -> 125;
            case 93 -> 135;
            case 94 -> 193;
            case 95 -> 54;
            case 96 -> 210;
            case 97 -> 14;
            case 98 -> 31;
            case 99 -> 184;
            case 100 -> 13;
            case 101 -> 155;
            case 102 -> 9;
            case 103 -> 222;
            case 104 -> 189;
            case 105 -> 221;
            case 106 -> 225;
            case 107 -> 243;
            case 108 -> 144;
            case 109 -> 10;
            case 110 -> 178;
            case 111 -> 196;
            case 112 -> 1;
            case 113 -> 250;
            case 114 -> 172;
            case 115 -> 15;
            case 116 -> 140;
            case 117 -> 227;
            case 118 -> 180;
            case 119 -> 120;
            case 120 -> 216;
            case 121 -> 84;
            case 122 -> 6;
            case 123 -> 61;
            case 124 -> 156;
            case 125 -> 181;
            case 126 -> 141;
            case 127 -> 65;
            case 128 -> 188;
            case 129 -> 153;
            case 130 -> 198;
            case 131 -> 35;
            case 132 -> 160;
            case 133 -> 56;
            case 134 -> 134;
            case 135 -> 42;
            case 136 -> 192;
            case 137 -> 197;
            case 138 -> 91;
            case 139 -> 113;
            case 140 -> 236;
            case 141 -> 248;
            case 142 -> 4;
            case 143 -> 215;
            case 144 -> 32;
            case 145 -> 183;
            case 146 -> 79;
            case 147 -> 95;
            case 148 -> 137;
            case 149 -> 129;
            case 150 -> 94;
            case 151 -> 49;
            case 152 -> 245;
            case 153 -> 67;
            case 154 -> 16;
            case 155 -> 177;
            case 156 -> 41;
            case 157 -> 154;
            case 158 -> 62;
            case 159 -> 167;
            case 160 -> 26;
            case 161 -> 152;
            case 162 -> 103;
            case 163 -> 255;
            case 164 -> 237;
            case 165 -> 139;
            case 166 -> 175;
            case 167 -> 92;
            case 168 -> 241;
            case 169 -> 187;
            case 170 -> 217;
            case 171 -> 57;
            case 172 -> 88;
            case 173 -> 101;
            case 174 -> 30;
            case 175 -> 18;
            case 176 -> 162;
            case 177 -> 112;
            case 178 -> 199;
            case 179 -> 109;
            case 180 -> 203;
            case 181 -> 50;
            case 182 -> 213;
            case 183 -> 230;
            case 184 -> 246;
            case 185 -> 166;
            case 186 -> 171;
            case 187 -> 146;
            case 188 -> 99;
            case 189 -> 70;
            case 190 -> 148;
            case 191 -> 253;
            case 192 -> 239;
            case 193 -> 53;
            case 194 -> 34;
            case 195 -> 21;
            case 196 -> 186;
            case 197 -> 128;
            case 198 -> 74;
            case 199 -> 0;
            case 200 -> 29;
            case 201 -> 5;
            case 202 -> 127;
            case 203 -> 111;
            case 204 -> 119;
            case 205 -> 254;
            case 206 -> 122;
            case 207 -> 28;
            case 208 -> 105;
            case 209 -> 138;
            case 210 -> 173;
            case 211 -> 48;
            case 212 -> 76;
            case 213 -> 44;
            case 214 -> 157;
            case 215 -> 223;
            case 216 -> 27;
            case 217 -> 7;
            case 218 -> 201;
            case 219 -> 238;
            case 220 -> 142;
            case 221 -> 108;
            case 222 -> 242;
            case 223 -> 124;
            case 224 -> 179;
            case 225 -> 232;
            case 226 -> 58;
            case 227 -> 51;
            case 228 -> 131;
            case 229 -> 33;
            case 230 -> 191;
            case 231 -> 66;
            case 232 -> 163;
            case 233 -> 114;
            case 234 -> 185;
            case 235 -> 72;
            case 236 -> 59;
            case 237 -> 110;
            case 238 -> 100;
            case 239 -> 229;
            case 240 -> 161;
            case 241 -> 240;
            case 242 -> 82;
            case 243 -> 251;
            case 244 -> 17;
            case 245 -> 12;
            case 246 -> 233;
            case 247 -> 195;
            case 248 -> 89;
            case 249 -> 81;
            case 250 -> 219;
            case 251 -> 209;
            case 252 -> 37;
            case 253 -> 68;
            case 254 -> 200;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }
   public IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(java.util.List var1, java.util.List var2, java.util.List var3, java.util.List var4, net.minecraft.world.phys.Vec3 var5, me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6, me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7, java.util.List var8, java.util.List var9, java.util.List var10, me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11, int var12, kotlin.jvm.internal.DefaultConstructorMarker var13) { /* flags 0x1001 */
      this(var1, var2, var3, var4, var5, var6, var7, var8, (((var12 & 256) != 0) ? kotlin.collections.CollectionsKt.emptyList() : var9), (((var12 & 512) != 0) ? kotlin.collections.CollectionsKt.emptyList() : var10), (((var12 & 1024) != 0) ? null : var11));
   }

   public static me.octo.client.IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI a(me.octo.client.IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI var0, java.util.List var1, java.util.List var2, java.util.List var3, java.util.List var4, net.minecraft.world.phys.Vec3 var5, me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6, me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7, java.util.List var8, java.util.List var9, java.util.List var10, me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11, int var12, java.lang.Object var13) { /* flags 0x1009 */
      String[] var14 = w();
      if (var14 == null && (var12 & 1) != 0) { var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if (var14 == null && (var12 & 2) != 0) { var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      if (var14 == null && (var12 & 4) != 0) { var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
      if (var14 == null && (var12 & 8) != 0) { var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
      if (var14 == null && (var12 & 16) != 0) { var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
      if (var14 == null && (var12 & 32) != 0) { var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
      if (var14 == null && (var12 & 64) != 0) { var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll; }
      if (var14 == null && (var12 & 128) != 0) { var8 = var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll; }
      if (var14 == null && (var12 & 256) != 0) { var9 = var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII; }
      if (var14 == null && (var12 & 512) != 0) { var10 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI; }
      if ((var12 & 1024) != 0) { var11 = var0.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl; }
      return var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

}
