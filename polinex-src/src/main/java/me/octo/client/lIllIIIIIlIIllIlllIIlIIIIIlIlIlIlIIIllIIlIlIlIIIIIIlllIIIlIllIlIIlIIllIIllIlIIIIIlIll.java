package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.player.AbstractClientPlayer;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import kotlin.collections.IndexedValue;
import java.util.Iterator;
import net.minecraft.client.player.LocalPlayer;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public class lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
    public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld2
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIlllIlIllIIIlIllllllIIlIIIIIlIIllIllIIlllIllIIllllIlIlIIIllIIllIIlIIlIIlIIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllIlIIIIIllIIIIIIIIIIlIlIlllIlIlIlIIIllllIIlIIIIIllIIIIlllIIIlllIllIllIIlIIll


   @NotNull
   public static lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private int IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private static IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   @NotNull
   private static lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @NotNull
   private static lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private static IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private static IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private static IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private static int lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private static String[] h;
   private static String[] i;

   public lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll(
      String var1,
      String var2,
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      String var4,
      java.util.List<String> var5,
      java.util.List<String> var6,
      boolean var7,
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var8,
      int var9,
      kotlin.jvm.internal.DefaultConstructorMarker var10
   ) {
      this(var1, var2, var3, var4, (var9 & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : var5, (var9 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : var6, (var9 & 64) != 0 ? false : var7, var8);
   }

   public lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull List<String> var5,
      @NotNull List<String> var6,
      boolean var7,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var8
   ) {
      short var10001 = 30047;
      short var10002 = -28641;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 30030;
      var10002 = -23684;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 30019;
      var10002 = 24525;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 30042;
      var10002 = -21136;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 30044;
      var10002 = 15027;
      Intrinsics.checkNotNullParameter(var5, "instructions");
      var10001 = 30017;
      var10002 = 18071;
      Intrinsics.checkNotNullParameter(var6, "tips");
      var10001 = 30020;
      var10002 = 11372;
      Intrinsics.checkNotNullParameter(var8, "settings");
      super(var1, var2, var3, var4, var5, var6, var7, Arrays.copyOf(var8, var8.length));
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(false, false, false, false, false, null, 63, null);
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a5() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   public final void c(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a6() {
      return this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   }

   public final void d(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a7() {
      return this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   }

   public final void e(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a8() {
      return this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   }

   public final void f(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = var1;
   }

   public final int a9() {
      return this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   }

   public final void a(int var1) {
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var1;
   }

   public final void b(double param1) {
this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI);
net.minecraft.world.phys.Vec3 var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
java.util.ArrayList<kotlin.collections.IndexedValue> var3 = new java.util.ArrayList<kotlin.collections.IndexedValue>();
for (kotlin.collections.IndexedValue var4 : kotlin.collections.CollectionsKt.withIndex(this.ac())) {
   if (this.a((me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var4.getValue(), param1, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w())) {
      var3.add(var4);
   }
}
kotlin.collections.IndexedValue var5 = null;
double var6 = 0.0D;
java.util.Iterator var7 = var3.iterator();
if (var7.hasNext()) {
   var5 = (kotlin.collections.IndexedValue)var7.next();
   var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var2, ((me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var5.getValue()).c());
   while (var7.hasNext()) {
      kotlin.collections.IndexedValue var8 = (kotlin.collections.IndexedValue)var7.next();
      double var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var2, ((me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var8.getValue()).c());
      if (Double.compare(var6, var9) > 0) {
         var5 = var8;
         var6 = var9;
      }
   }
}
if (var5 == null) {
   return;
}
me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var5.getValue();
int var11 = var5.getIndex();
this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = Math.min(var10.b() == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ? var11 : var11 + 1, kotlin.collections.CollectionsKt.getLastIndex((java.util.List)this.ac()));
   }

   public final boolean c(double param1) {
      if (this.ac().isEmpty()) { return false; }
      for (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var8 : this.ac()) {
         if (a(this, var8, param1, (Vec3)null, 4, (Object)null)) { return true; }
      }
      return false;
   }

   public final boolean a_() {
      if (this.ac().isEmpty()) { return false; }
      for (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var6 : this.ac()) {
         if (this.a(var6)) { return true; }
      }
      return false;
   }

   public final boolean a(@NotNull IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll param1) {
      boolean var2 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      Intrinsics.checkNotNullParameter(param1, "waypoint");
      if (!var2) {
         return false;
      }
      LocalPlayer var4 = this.ap().player;
      net.minecraft.network.chat.Component var3 = var4 != null ? var4.getName() : null;
      if (var3 == null) {
         return false;
      }
      if (!var2) {
         return false;
      }
      net.minecraft.client.multiplayer.ClientLevel var5 = this.ap().level;
      java.util.List var6 = var5 != null ? var5.players() : null;
      if (var6 == null) {
         return false;
      }
      java.util.ArrayList var7 = new java.util.ArrayList();
      for (Object var8 : var6) {
         AbstractClientPlayer var9 = (AbstractClientPlayer)var8;
         if (!Intrinsics.areEqual(var9.getName(), var3)) {
            var7.add(var9);
         }
      }
      if (!var2) {
         return false;
      }
      for (Object var10 : var7) {
         AbstractClientPlayer var11 = (AbstractClientPlayer)var10;
         Intrinsics.checkNotNull(var11);
         if (this.a(param1, 3.0D, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var11))) {
            return true;
         }
      }
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e ()Z
      // 003: aload 1
      // 004: sipush 30029
      // 007: sipush -19229
      // 00a: pop2
      // 00b: ldc_w "waypoint"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: iload 2
      // 013: ifeq 03e
      // 016: aload 0
      // 017: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.ap ()Lnet/minecraft/client/Minecraft;
      // 01a: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 01d: dup
      // 01e: ifnull 036
      // 021: goto 028
      // 024: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 027: athrow
      // 028: invokevirtual net/minecraft/client/player/LocalPlayer.getName ()Lnet/minecraft/network/chat/Component;
      // 02b: dup
      // 02c: ifnonnull 040
      // 02f: goto 036
      // 032: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 035: athrow
      // 036: pop
      // 037: goto 03e
      // 03a: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: ireturn
      // 040: astore 3
      // 041: iload 2
      // 042: ifeq 0f7
      // 045: aload 0
      // 046: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.ap ()Lnet/minecraft/client/Minecraft;
      // 049: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 04c: dup
      // 04d: ifnull 0ef
      // 050: goto 057
      // 053: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 056: athrow
      // 057: invokevirtual net/minecraft/client/multiplayer/ClientLevel.players ()Ljava/util/List;
      // 05a: iload 2
      // 05b: ifeq 07a
      // 05e: goto 065
      // 061: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 064: athrow
      // 065: dup
      // 066: ifnull 0ef
      // 069: goto 070
      // 06c: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 06f: athrow
      // 070: checkcast java/lang/Iterable
      // 073: goto 07a
      // 076: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 079: athrow
      // 07a: astore 8
      // 07c: bipush 0
      // 07d: istore 9
      // 07f: aload 8
      // 081: astore 10
      // 083: new java/util/ArrayList
      // 086: dup
      // 087: invokespecial java/util/ArrayList.<init> ()V
      // 08a: checkcast java/util/Collection
      // 08d: astore 11
      // 08f: bipush 0
      // 090: istore 12
      // 092: aload 10
      // 094: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 099: astore 13
      // 09b: aload 13
      // 09d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a2: ifeq 0e5
      // 0a5: aload 13
      // 0a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ac: astore 14
      // 0ae: aload 14
      // 0b0: checkcast net/minecraft/client/player/AbstractClientPlayer
      // 0b3: astore 15
      // 0b5: bipush 0
      // 0b6: istore 16
      // 0b8: aload 15
      // 0ba: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getName ()Lnet/minecraft/network/chat/Component;
      // 0bd: aload 3
      // 0be: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0c1: iload 2
      // 0c2: ifeq 0d0
      // 0c5: ifne 0d3
      // 0c8: goto 0cf
      // 0cb: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0ce: athrow
      // 0cf: bipush 1
      // 0d0: goto 0d4
      // 0d3: bipush 0
      // 0d4: ifeq 09b
      // 0d7: aload 11
      // 0d9: aload 14
      // 0db: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0e0: pop
      // 0e1: iload 2
      // 0e2: ifne 09b
      // 0e5: aload 11
      // 0e7: checkcast java/util/List
      // 0ea: nop
      // 0eb: iload 2
      // 0ec: ifne 0f9
      // 0ef: pop
      // 0f0: goto 0f7
      // 0f3: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0f6: athrow
      // 0f7: bipush 0
      // 0f8: ireturn
      // 0f9: astore 4
      // 0fb: aload 4
      // 0fd: checkcast java/lang/Iterable
      // 100: astore 5
      // 102: bipush 0
      // 103: istore 6
      // 105: aload 5
      // 107: iload 2
      // 108: ifeq 141
      // 10b: instanceof java/util/Collection
      // 10e: ifeq 13f
      // 111: goto 118
      // 114: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 117: athrow
      // 118: aload 5
      // 11a: checkcast java/util/Collection
      // 11d: iload 2
      // 11e: ifeq 141
      // 121: goto 128
      // 124: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 127: athrow
      // 128: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 12d: ifeq 13f
      // 130: goto 137
      // 133: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 136: athrow
      // 137: bipush 0
      // 138: goto 186
      // 13b: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 13e: athrow
      // 13f: aload 5
      // 141: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 146: astore 7
      // 148: aload 7
      // 14a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14f: ifeq 185
      // 152: aload 7
      // 154: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 159: astore 8
      // 15b: aload 8
      // 15d: checkcast net/minecraft/client/player/AbstractClientPlayer
      // 160: astore 9
      // 162: bipush 0
      // 163: istore 10
      // 165: aload 0
      // 166: aload 1
      // 167: ldc2_w 3.0
      // 16a: aload 9
      // 16c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 16f: aload 9
      // 171: checkcast net/minecraft/world/entity/Entity
      // 174: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 177: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Lme/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll;DLnet/minecraft/world/phys/Vec3;)Z
      // 17a: ifeq 148
      // 17d: bipush 1
      // 17e: iload 2
      // 17f: ifeq 17a
      // 182: goto 186
      // 185: bipush 0
      // 186: ireturn
   }

   public final boolean a(
      @NotNull IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll param1, double param2, @NotNull Vec3 param4
   ) {
      Intrinsics.checkNotNullParameter(param1, "waypoint");
      boolean var5 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      Intrinsics.checkNotNullParameter(param4, "playerPos");
      Vec3 var6 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(param1.a());
      if (var5) {
         return true;
      } else {
         if (param4.x < var6.x - param2) {
            return false;
         } else if (param4.x >= var6.x + param2) {
            return false;
         } else if (param4.z < var6.z - param2) {
            return false;
         } else if (param4.z >= var6.z + param2) {
            return false;
         } else {
            return Math.abs(var6.y - param4.y) < 0.6D;
         }
      }
      // 原 jar 字节码（`javap -p -c`，方法体 101 条指令）语义：
      //   if (Nested.d()) return true;
      //   x ∈ [center.x - radius, center.x + radius) ∧ z ∈ [center.z - radius, center.z + radius) ∧ |center.y - playerPos.y| < 0.6
      // 差异说明：原字节码把 `Nested.d()` 的判定重复内联在 5 个比较点（cmp; iload5; ifne skip; ifXX false），
      // 属混淆器的控制流复制，javac 无法从任何自然 Java 源码生成同样形状；此处保留同样的判定次序与边界，语义等价。
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: sipush 30016
      // 04: sipush -28687
      // 07: pop2
      // 08: ldc_w "waypoint"
      // 0b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d ()Z
      // 11: aload 4
      // 13: sipush 30024
      // 16: sipush 21457
      // 19: pop2
      // 1a: ldc_w "playerPos"
      // 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 20: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 23: aload 1
      // 24: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.a ()Lnet/minecraft/core/BlockPos;
      // 27: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 2a: astore 6
      // 2c: istore 5
      // 2e: aload 4
      // 30: getfield net/minecraft/world/phys/Vec3.x D
      // 33: aload 6
      // 35: getfield net/minecraft/world/phys/Vec3.x D
      // 38: dload 2
      // 39: dsub
      // 3a: dcmpl
      // 3b: iload 5
      // 3d: ifne 5e
      // 40: iflt df
      // 43: goto 4a
      // 46: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 49: athrow
      // 4a: aload 4
      // 4c: getfield net/minecraft/world/phys/Vec3.x D
      // 4f: aload 6
      // 51: getfield net/minecraft/world/phys/Vec3.x D
      // 54: dload 2
      // 55: dadd
      // 56: dcmpg
      // 57: goto 5e
      // 5a: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5d: athrow
      // 5e: iload 5
      // 60: ifne 81
      // 63: ifge df
      // 66: goto 6d
      // 69: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 6c: athrow
      // 6d: aload 4
      // 6f: getfield net/minecraft/world/phys/Vec3.z D
      // 72: aload 6
      // 74: getfield net/minecraft/world/phys/Vec3.z D
      // 77: dload 2
      // 78: dsub
      // 79: dcmpl
      // 7a: goto 81
      // 7d: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 80: athrow
      // 81: iload 5
      // 83: ifne a4
      // 86: iflt df
      // 89: goto 90
      // 8c: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 8f: athrow
      // 90: aload 4
      // 92: getfield net/minecraft/world/phys/Vec3.z D
      // 95: aload 6
      // 97: getfield net/minecraft/world/phys/Vec3.z D
      // 9a: dload 2
      // 9b: dadd
      // 9c: dcmpg
      // 9d: goto a4
      // a0: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // a3: athrow
      // a4: iload 5
      // a6: ifne cc
      // a9: ifge df
      // ac: goto b3
      // af: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // b2: athrow
      // b3: aload 6
      // b5: getfield net/minecraft/world/phys/Vec3.y D
      // b8: aload 4
      // ba: getfield net/minecraft/world/phys/Vec3.y D
      // bd: dsub
      // be: invokestatic java/lang/Math.abs (D)D
      // c1: ldc2_w 0.6
      // c4: dcmpg
      // c5: goto cc
      // c8: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // cb: athrow
      // cc: iload 5
      // ce: ifne dc
      // d1: ifge df
      // d4: goto db
      // d7: invokestatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // da: athrow
      // db: bipush 1
      // dc: goto e0
      // df: bipush 0
      // e0: ireturn
   }

   @Override
   public void aM() {
      super.aM();
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .D();
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .y();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .q();
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .w();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .s();
   }

   public final int b(@NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> param1) {
      Intrinsics.checkNotNullParameter(param1, "route");
      if (param1.isEmpty()) {
         return -1;
      }

      double var3 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i();
      Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      int var6 = -1;
      int var7 = -1;

      for (int var8 = CollectionsKt.getLastIndex(param1); var8 >= 0; var8--) {
         var var9 = (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)param1.get(var8);
         if (var9.b() == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            if (var7 == -1 && me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var9.a(), false, 2, null)) {
               var7 = var8;
            }
         } else if (var9.b() == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            if (var6 == -1 && var3 > 0.0 && var5.distanceTo(var9.c()) <= var3
               && me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b(me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var9.a(), (List)null, (Vec3)null, 6, (Object)null)) {
               var6 = var8;
            }
         }

         if (var6 != -1 && var7 != -1) {
            break;
         }
      }

      if (var6 != -1) {
         return var6;
      }

      if (var7 == -1) {
         return -1;
      }

      int var8b = -1;
      double var9b = Double.MAX_VALUE;

      for (int var11 = 0; var11 <= CollectionsKt.getLastIndex(param1); var11++) {
         var var13 = (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)param1.get(var11);
         if (var13.b() != me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            continue;
         }

         double var14 = var5.distanceTo(var13.c());
         if (var14 < var9b && me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var13.a(), false, 2, null)) {
            var9b = var14;
            var8b = var11;
         }
      }

      if (var8b != -1) {
         return var8b;
      }

      return -1;
   }

   public final boolean a(@NotNull IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll param1, double param2) {
      boolean var4 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "waypoint");
      double var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w().distanceTo(param1.c());
      if (var4 && var5 > param2) {
         return false;
      }
      return me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, param1.a(), false, 2, null);
   }

   public void ba() {
   }

   @Override
   public void aH() {
      this.ba();
   }

   @Override
   public void ah() {
      this.ba();
   }

   @Override
   public void aB() {
      this.ba();
   }

   @Override
   public void N() {
      super.N();
      this.aN();
   }

   @Override
    public void aO() {
       super.aO();
       this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.b(); this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.j(true);
       this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl.b(); this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl.j(true);
       this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI.b(); this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI.j(true);
       this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.b(); this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.j(true);
       this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.b(); this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.j(true);
       this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.b(); this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.o();
    }

   public final void c(int var1) {
      short var10002 = 30043;
      short var10003 = 20785;
      var10003 = 30040;
      short var10004 = 28631;
      this.a(
         "Missing: Mining Item with at least " + var1 + " breaking power",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void bb() {
      short var10001 = 30022;
      short var10002 = -18802;
      this.a(
         "Missing: Royal Pigeon",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void bc() {
      short var10001 = 30027;
      short var10002 = 4347;
      this.a(
         "Missing: Chisel",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void bd() {
      short var10001 = 30023;
      short var10002 = 29092;
      this.a(
         "Missing: Instamine Item",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void be() {
      short var10001 = 30046;
      short var10002 = 29283;
      this.a(
         "Missing: Ranged Weapon",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void bf() {
      short var10001 = 30018;
      short var10002 = -13503;
      this.a(
         "Missing: Sword",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void bg() {
      short var10001 = 30031;
      short var10002 = -1301;
      this.a(
         "Missing: Mining Cache. Run /pn gmd",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[25];
      int var3 = 0;
      d(0);
      String var2 = "\u001a\u000e5s&)¿'\bt~ç¡\u0091g`\u001c\"\f,\u0080=Ý\u0084\u000f;bÁ\u008e\u000b¬;\u0084ÌÎS(\u001fø\u009aÞ|\u0005@\u000b\u0013\u0007î(\u0096õm\u000bæýÑ\u009aìeF®÷Ö[U\u001aº\u009cf&u\fÙÊ\u008cDé²ç\u0089ø}\u0091WìÕp³78Ä\u0001%[jCll\rÀà{]B\u009bI\u0089°\b\u008cxqÁP\u008bh\u0083U\u0085i1{g¼ë\u0004tèYïr#3\u008c&Åy\u0004\u0018º]\u0090å²\u0013·NË¨õ\tÌa\u0010;\u0093\u0013|\u0003\u008e\u000f¨J\u0014ñO\u001d]\b(©ÆÎ\u009eo\u0090b\u001fâ<m2\u0014\u008eõ\u009a\tNYóñ¡:xÉ÷çÁ\u00111\u001bhA\u000b\u0095\u001a|k®iU`ëo<À·\u0019\fº¸ÍnY\u0003UÓÈ\u0088Aäë\u001d+â¶[EbÀ\u009bê*\u00838\u0098GGUT\u009d°ýÄìªÉ\u000b¦\u0084*2\u008a6eP¹ä2pí¸\u0013«Å\u0005\u0092í\u008dÄ¶\bÇ\"\u0007vÊ\ní£\u0017Ø\u0002\u001aø\u008e<e,/' N\u0083\"ÕH\u0082§j$\u008a³î\u0015S|k7 Å \u0013\u0097Û6£uÙñ¢åæ$h´\u0004§:èÿ\b¸?aU¬íî¿\bêi°\u008a2§(=\u000e\u0085(±½û\u0094Ë9ú\u009f\u0083\u001cËò\bË\u008c\u0010ÿo¬¿e\f\u0099$\u0092Ü\u0084DX\u0015E¡\r|\u0004w:¶à\u0016ä\u0084\u009d(~&{oìTWE\u0090ùÏþÐ\u0011\u007fËZ[T 4Ë·ÌOQ\u009ead1ô\u001cD\\\u008cÇ\u001f\u0000=?Jîp\u0093,t8õÉ\u0096\u0018Ö\u0083\u00971\u0091g\u001fÜâaÅ\u0015\"Û¤µê\u0005?R¿¿4vÐ\u008fÉöª×=-Uütâf\u001c\u0098>¯ðÏZ9r|,ÌQ?\u0003\u000f8áÇø\u001cí0ç\réÕÏã\u0089¥# W\u0015RoiY\u0086¨v×ý\u0087åá\u0017h=±`H\u0089lJ.*\u0091\u0082mîzÒL3#";
      int var4 = "\u001a\u000e5s&)¿'\bt~ç¡\u0091g`\u001c\"\f,\u0080=Ý\u0084\u000f;bÁ\u008e\u000b¬;\u0084ÌÎS(\u001fø\u009aÞ|\u0005@\u000b\u0013\u0007î(\u0096õm\u000bæýÑ\u009aìeF®÷Ö[U\u001aº\u009cf&u\fÙÊ\u008cDé²ç\u0089ø}\u0091WìÕp³78Ä\u0001%[jCll\rÀà{]B\u009bI\u0089°\b\u008cxqÁP\u008bh\u0083U\u0085i1{g¼ë\u0004tèYïr#3\u008c&Åy\u0004\u0018º]\u0090å²\u0013·NË¨õ\tÌa\u0010;\u0093\u0013|\u0003\u008e\u000f¨J\u0014ñO\u001d]\b(©ÆÎ\u009eo\u0090b\u001fâ<m2\u0014\u008eõ\u009a\tNYóñ¡:xÉ÷çÁ\u00111\u001bhA\u000b\u0095\u001a|k®iU`ëo<À·\u0019\fº¸ÍnY\u0003UÓÈ\u0088Aäë\u001d+â¶[EbÀ\u009bê*\u00838\u0098GGUT\u009d°ýÄìªÉ\u000b¦\u0084*2\u008a6eP¹ä2pí¸\u0013«Å\u0005\u0092í\u008dÄ¶\bÇ\"\u0007vÊ\ní£\u0017Ø\u0002\u001aø\u008e<e,/' N\u0083\"ÕH\u0082§j$\u008a³î\u0015S|k7 Å \u0013\u0097Û6£uÙñ¢åæ$h´\u0004§:èÿ\b¸?aU¬íî¿\bêi°\u008a2§(=\u000e\u0085(±½û\u0094Ë9ú\u009f\u0083\u001cËò\bË\u008c\u0010ÿo¬¿e\f\u0099$\u0092Ü\u0084DX\u0015E¡\r|\u0004w:¶à\u0016ä\u0084\u009d(~&{oìTWE\u0090ùÏþÐ\u0011\u007fËZ[T 4Ë·ÌOQ\u009ead1ô\u001cD\\\u008cÇ\u001f\u0000=?Jîp\u0093,t8õÉ\u0096\u0018Ö\u0083\u00971\u0091g\u001fÜâaÅ\u0015\"Û¤µê\u0005?R¿¿4vÐ\u008fÉöª×=-Uütâf\u001c\u0098>¯ðÏZ9r|,ÌQ?\u0003\u000f8áÇø\u001cí0ç\réÕÏã\u0089¥# W\u0015RoiY\u0086¨v×ý\u0087åá\u0017h=±`H\u0089lJ.*\u0091\u0082mîzÒL3#"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 88;
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
                     case 0 -> 77;
                     case 1 -> 126;
                     case 2 -> 108;
                     case 3 -> 19;
                     case 4 -> 103;
                     case 5 -> 97;
                     default -> 40;
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
                     h = var5;
                     i = new String[25];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII();
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl();
                     IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = new lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll();
                     lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = new IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl();
                     llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = new IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII();
                     lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "µG½=£n)\u0080I\u009d¿Wj\u009bp YO\u0001|\u0089ÚÎÁ\u0001\u0000\u001dæ\r°»*ªJ¾\u0092{\u0092\u008b\rè\u008d×r\u001c,,&\u0004gO>\nß: ?\u009fåß ª\u0084E*¿d\u0094816Ã·\u0093|G\u009fSÏõó\u001cÈÜGN0o$6=C\b÷\u008e²\u0016p\u0086";
                  var4 = "µG½=£n)\u0080I\u009d¿Wj\u009bp YO\u0001|\u0089ÚÎÁ\u0001\u0000\u001dæ\r°»*ªJ¾\u0092{\u0092\u008b\rè\u008d×r\u001c,,&\u0004gO>\nß: ?\u009fåß ª\u0084E*¿d\u0094816Ã·\u0093|G\u009fSÏõó\u001cÈÜGN0o$6=C\b÷\u008e²\u0016p\u0086"
                     .length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void d(int var0) {
      lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = var0;
   }

   public static int bn() {
      return lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   }

   public static int bo() {
      int var0 = bn();

      try {
         return var0 == 0 ? 61 : 0;
      } catch (UnsupportedOperationException var1) {
         throw (RuntimeException)a(var1);
      }
   }


   @NotNull
   public static final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII bh() {
      return llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   }


   @NotNull
   public static final lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl bi() {
      return lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   }


   @NotNull
   public static final lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll bj() {
      return IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }


   @NotNull
   public static final IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl bk() {
      return lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   }


   @NotNull
   public static final IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII bl() {
      return llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   }


   @NotNull
   public static final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI bm() {
      return lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   }


   public static void a(@NotNull me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll param0, double param1, int param2, @Nullable Object param3) {
      if (param3 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRoute");
      }
      if ((param2 & 1) != 0) {
         param1 = 1.0;
      }
      param0.b(param1);
   }

   public static boolean b(@NotNull me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll param0, double param1, int param2, @Nullable Object param3) {
      if (param3 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isOnRoute");
      }
      if ((param2 & 1) != 0) {
         param1 = 1.0;
      }
      return param0.c(param1);
   }

   public static boolean a(@NotNull me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll param0, @NotNull me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll param1, double param2, @NotNull Vec3 param3, int param4, @Nullable Object param5) {
      if (param5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isOnWaypoint");
      }
      if ((param4 & 2) != 0) {
         param2 = 1.0;
      }
      if ((param4 & 4) != 0) {
         param3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      }
      return param0.a(param1, param2, param3);
   }

   public static boolean a(@NotNull me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll param0, @NotNull me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll param1, double param2, int param3, @Nullable Object param4) {
      if (param4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canWalkToNearbyWaypoint");
      }
      if ((param3 & 2) != 0) {
         param2 = 15.0;
      }
      return param0.a(param1, param2);
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30029) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 222;
            case 1 -> 73;
            case 2 -> 140;
            case 3 -> 89;
            case 4 -> 60;
            case 5 -> 232;
            case 6 -> 225;
            case 7 -> 54;
            case 8 -> 211;
            case 9 -> 196;
            case 10 -> 133;
            case 11 -> 249;
            case 12 -> 215;
            case 13 -> 75;
            case 14 -> 244;
            case 15 -> 107;
            case 16 -> 197;
            case 17 -> 253;
            case 18 -> 2;
            case 19 -> 139;
            case 20 -> 173;
            case 21 -> 74;
            case 22 -> 238;
            case 23 -> 94;
            case 24 -> 115;
            case 25 -> 151;
            case 26 -> 126;
            case 27 -> 160;
            case 28 -> 50;
            case 29 -> 116;
            case 30 -> 28;
            case 31 -> 243;
            case 32 -> 155;
            case 33 -> 31;
            case 34 -> 59;
            case 35 -> 235;
            case 36 -> 149;
            case 37 -> 99;
            case 38 -> 103;
            case 39 -> 166;
            case 40 -> 200;
            case 41 -> 83;
            case 42 -> 175;
            case 43 -> 159;
            case 44 -> 252;
            case 45 -> 202;
            case 46 -> 65;
            case 47 -> 198;
            case 48 -> 117;
            case 49 -> 250;
            case 50 -> 241;
            case 51 -> 178;
            case 52 -> 165;
            case 53 -> 181;
            case 54 -> 152;
            case 55 -> 188;
            case 56 -> 10;
            case 57 -> 230;
            case 58 -> 194;
            case 59 -> 162;
            case 60 -> 171;
            case 61 -> 124;
            case 62 -> 242;
            case 63 -> 68;
            case 64 -> 70;
            case 65 -> 37;
            case 66 -> 105;
            case 67 -> 87;
            case 68 -> 66;
            case 69 -> 237;
            case 70 -> 131;
            case 71 -> 191;
            case 72 -> 93;
            case 73 -> 45;
            case 74 -> 111;
            case 75 -> 157;
            case 76 -> 72;
            case 77 -> 132;
            case 78 -> 78;
            case 79 -> 51;
            case 80 -> 125;
            case 81 -> 163;
            case 82 -> 9;
            case 83 -> 134;
            case 84 -> 144;
            case 85 -> 248;
            case 86 -> 205;
            case 87 -> 161;
            case 88 -> 218;
            case 89 -> 76;
            case 90 -> 0;
            case 91 -> 15;
            case 92 -> 109;
            case 93 -> 192;
            case 94 -> 193;
            case 95 -> 146;
            case 96 -> 84;
            case 97 -> 122;
            case 98 -> 19;
            case 99 -> 62;
            case 100 -> 207;
            case 101 -> 153;
            case 102 -> 201;
            case 103 -> 147;
            case 104 -> 190;
            case 105 -> 234;
            case 106 -> 168;
            case 107 -> 20;
            case 108 -> 245;
            case 109 -> 220;
            case 110 -> 182;
            case 111 -> 90;
            case 112 -> 208;
            case 113 -> 121;
            case 114 -> 217;
            case 115 -> 177;
            case 116 -> 48;
            case 117 -> 239;
            case 118 -> 164;
            case 119 -> 69;
            case 120 -> 67;
            case 121 -> 204;
            case 122 -> 213;
            case 123 -> 21;
            case 124 -> 52;
            case 125 -> 96;
            case 126 -> 13;
            case 127 -> 3;
            case 128 -> 240;
            case 129 -> 226;
            case 130 -> 136;
            case 131 -> 186;
            case 132 -> 53;
            case 133 -> 236;
            case 134 -> 123;
            case 135 -> 179;
            case 136 -> 81;
            case 137 -> 180;
            case 138 -> 56;
            case 139 -> 71;
            case 140 -> 206;
            case 141 -> 8;
            case 142 -> 82;
            case 143 -> 17;
            case 144 -> 100;
            case 145 -> 251;
            case 146 -> 137;
            case 147 -> 212;
            case 148 -> 101;
            case 149 -> 233;
            case 150 -> 184;
            case 151 -> 228;
            case 152 -> 98;
            case 153 -> 118;
            case 154 -> 77;
            case 155 -> 141;
            case 156 -> 1;
            case 157 -> 34;
            case 158 -> 189;
            case 159 -> 22;
            case 160 -> 91;
            case 161 -> 135;
            case 162 -> 254;
            case 163 -> 195;
            case 164 -> 85;
            case 165 -> 88;
            case 166 -> 110;
            case 167 -> 26;
            case 168 -> 95;
            case 169 -> 174;
            case 170 -> 210;
            case 171 -> 199;
            case 172 -> 223;
            case 173 -> 23;
            case 174 -> 44;
            case 175 -> 224;
            case 176 -> 4;
            case 177 -> 221;
            case 178 -> 209;
            case 179 -> 39;
            case 180 -> 138;
            case 181 -> 57;
            case 182 -> 63;
            case 183 -> 154;
            case 184 -> 172;
            case 185 -> 61;
            case 186 -> 18;
            case 187 -> 80;
            case 188 -> 216;
            case 189 -> 11;
            case 190 -> 38;
            case 191 -> 55;
            case 192 -> 142;
            case 193 -> 35;
            case 194 -> 148;
            case 195 -> 113;
            case 196 -> 58;
            case 197 -> 29;
            case 198 -> 42;
            case 199 -> 127;
            case 200 -> 183;
            case 201 -> 214;
            case 202 -> 30;
            case 203 -> 219;
            case 204 -> 33;
            case 205 -> 36;
            case 206 -> 169;
            case 207 -> 120;
            case 208 -> 104;
            case 209 -> 246;
            case 210 -> 203;
            case 211 -> 46;
            case 212 -> 27;
            case 213 -> 12;
            case 214 -> 32;
            case 215 -> 227;
            case 216 -> 112;
            case 217 -> 40;
            case 218 -> 86;
            case 219 -> 119;
            case 220 -> 92;
            case 221 -> 79;
            case 222 -> 255;
            case 223 -> 106;
            case 224 -> 158;
            case 225 -> 43;
            case 226 -> 114;
            case 227 -> 24;
            case 228 -> 16;
            case 229 -> 97;
            case 230 -> 25;
            case 231 -> 129;
            case 232 -> 187;
            case 233 -> 64;
            case 234 -> 156;
            case 235 -> 170;
            case 236 -> 102;
            case 237 -> 185;
            case 238 -> 247;
            case 239 -> 47;
            case 240 -> 231;
            case 241 -> 167;
            case 242 -> 130;
            case 243 -> 229;
            case 244 -> 145;
            case 245 -> 143;
            case 246 -> 128;
            case 247 -> 5;
            case 248 -> 41;
            case 249 -> 7;
            case 250 -> 14;
            case 251 -> 108;
            case 252 -> 150;
            case 253 -> 6;
            case 254 -> 176;
            default -> 49;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII a() {
         return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
      }

      @NotNull
      public final lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl b() {
         return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
      }

      @NotNull
      public final lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll c() {
         return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
      }

      @NotNull
      public final IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl d() {
         return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
      }

      @NotNull
      public final IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII e() {
         return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
      }

      @NotNull
      public final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI f() {
         return lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
   }
}
