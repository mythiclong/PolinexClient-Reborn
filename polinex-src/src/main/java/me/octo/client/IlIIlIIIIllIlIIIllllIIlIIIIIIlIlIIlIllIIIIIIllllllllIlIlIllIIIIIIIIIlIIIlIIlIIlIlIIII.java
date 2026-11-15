package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII {
   public static int var11 = 0; // PX-FIX (retyped int) missing field v2
   
   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private ArrayList<IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private Vec3 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static String[] a;
   private static String[] b;

   public IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -2954;
      short var10004 = -10139;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 35.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var1 = Vec3.ZERO;
      var10003 = -2961;
      var10004 = -25541;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   public final boolean a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(boolean var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(@NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) {
      short var10001 = -2959;
      short var10002 = 6984;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean c() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void b(boolean var1) {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   public final boolean d() {
      return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   }

   public final void c(boolean var1) {
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var1;
   }

   public final boolean e() {
      return this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   public final void d(boolean var1) {
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var1;
   }

   private final void f() { Object var9 = null; // PX-FIX hoist
         boolean var11 = false; // PX-FIX hoist
        
      Collection var19 = null; // PX-FIX
      Object receiver = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      String var1 = var10000;
      var10000 = String.valueOf(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      if (var1 != null) {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) {
            return;
         }

         var10000 = String.valueOf((Iterable)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      List var3 = ((List)(Object)(var10000));
      int var4 = 0;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
             var9 = var8.next();
            var19 = var6;
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var9;
            if (var1 == null) {
               break;
            }

             var11 = false;
            var6.add(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var10.a())
            );
            if (var1 != null) {
               continue;
            }
         }

         var19 = var6;
         break;
      }

      List var2 = (List)var19;
      var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         var2,
         0.0,
         0,
         (Function1)(
            new Function1<Vec3, Boolean>() {
   public Boolean invoke(Vec3 p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 24741;
                  short var10005 = 17309;
                  var10005 = 24743;
                  short var10006 = 25573;
               }

               public final Boolean a(Vec3 var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 24740;
                  short var10002 = -1405;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  return ((IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3x = 0;
                  String var2x = "\u001cFl.é\u0005zpÐ\u0019°\u009ch\u008eóø\u0002W¤2\u009e0<àãÜ;Kø~µpÈ\u0013çKkWd¯¶Éía\u0089G\u0014¾6!\u0004;G'îÐ)/'\r\u0006Zc¬8ð·Ïg%";
                  int var4x = "\u001cFl.é\u0005zpÐ\u0019°\u009ch\u008eóø\u0002W¤2\u009e0<àãÜ;Kø~µpÈ\u0013çKkWd¯¶Éía\u0089G\u0014¾6!\u0004;G'îÐ)/'\r\u0006Zc¬8ð·Ïg%"
                     .length();
                  char var1x = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2x.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6x = 0;
                        byte var13 = 70;
                        var10002 = var10003;
                        int var8x = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 70;
                           var10006 = var6x;
                        } else {
                           var13 = 70;
                           var8x = var10004;
                           if (var10004 <= var6x) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 70;
                           var10006 = var6x;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6x % 7) {
                              case 0 -> 88;
                              case 1 -> 98;
                              case 2 -> 126;
                              case 3 -> 88;
                              case 4 -> 11;
                              case 5 -> 96;
                              default -> 2;
                           });
                           var6x++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002;
                              var16 = var13;
                           } else {
                              if (var8x <= var6x) {
                                 break;
                              }

                              var10005 = var10002;
                              var16 = var13;
                              var10006 = var6x;
                           }
                        }
                     }

                     String var15 = new String(var10002).intern();
                     byte var10x = -1;
                     var5[var3x++] = var15;
                     if ((var0 += var1x) >= var4x) {
                        a = var5;
                        b = new String[3];
                        break pxClinit;
                     }

                     var1x = var2x.charAt(var0);
                  }
                  }
               }

               private static String a(int var0, int var1x) {
                  int var2x = (var0 ^ 24741) & 65535;
                  if (b[var2x] == null) {
                     char[] var3 = a[var2x].toCharArray();

                     short var4x = switch (var3[0] & 0xFF) {
                        case 0 -> 161;
                        case 1 -> 73;
                        case 2 -> 50;
                        case 3 -> 149;
                        case 4 -> 78;
                        case 5 -> 181;
                        case 6 -> 152;
                        case 7 -> 20;
                        case 8 -> 192;
                        case 9 -> 139;
                        case 10 -> 92;
                        case 11 -> 127;
                        case 12 -> 35;
                        case 13 -> 67;
                        case 14 -> 197;
                        case 15 -> 208;
                        case 16 -> 185;
                        case 17 -> 251;
                        case 18 -> 138;
                        case 19 -> 214;
                        case 20 -> 90;
                        case 21 -> 3;
                        case 22 -> 33;
                        case 23 -> 17;
                        case 24 -> 59;
                        case 25 -> 18;
                        case 26 -> 169;
                        case 27 -> 159;
                        case 28 -> 108;
                        case 29 -> 249;
                        case 30 -> 203;
                        case 31 -> 200;
                        case 32 -> 135;
                        case 33 -> 15;
                        case 34 -> 48;
                        case 35 -> 25;
                        case 36 -> 248;
                        case 37 -> 116;
                        case 38 -> 23;
                        case 39 -> 58;
                        case 40 -> 7;
                        case 41 -> 66;
                        case 42 -> 244;
                        case 43 -> 10;
                        case 44 -> 89;
                        case 45 -> 6;
                        case 46 -> 98;
                        case 47 -> 103;
                        case 48 -> 209;
                        case 49 -> 53;
                        case 50 -> 114;
                        case 51 -> 51;
                        case 52 -> 211;
                        case 53 -> 105;
                        case 54 -> 239;
                        case 55 -> 61;
                        case 56 -> 119;
                        case 57 -> 178;
                        case 58 -> 143;
                        case 59 -> 28;
                        case 60 -> 115;
                        case 61 -> 223;
                        case 62 -> 111;
                        case 63 -> 167;
                        case 64 -> 70;
                        case 65 -> 82;
                        case 66 -> 55;
                        case 67 -> 86;
                        case 68 -> 2;
                        case 69 -> 132;
                        case 70 -> 227;
                        case 71 -> 155;
                        case 72 -> 184;
                        case 73 -> 74;
                        case 74 -> 11;
                        case 75 -> 63;
                        case 76 -> 87;
                        case 77 -> 233;
                        case 78 -> 157;
                        case 79 -> 38;
                        case 80 -> 162;
                        case 81 -> 137;
                        case 82 -> 198;
                        case 83 -> 177;
                        case 84 -> 196;
                        case 85 -> 102;
                        case 86 -> 106;
                        case 87 -> 72;
                        case 88 -> 142;
                        case 89 -> 230;
                        case 90 -> 54;
                        case 91 -> 182;
                        case 92 -> 153;
                        case 93 -> 109;
                        case 94 -> 160;
                        case 95 -> 146;
                        case 96 -> 189;
                        case 97 -> 97;
                        case 98 -> 175;
                        case 99 -> 99;
                        case 100 -> 193;
                        case 101 -> 171;
                        case 102 -> 40;
                        case 103 -> 176;
                        case 104 -> 8;
                        case 105 -> 215;
                        case 106 -> 41;
                        case 107 -> 37;
                        case 108 -> 12;
                        case 109 -> 234;
                        case 110 -> 243;
                        case 111 -> 13;
                        case 112 -> 43;
                        case 113 -> 129;
                        case 114 -> 93;
                        case 115 -> 47;
                        case 116 -> 57;
                        case 117 -> 122;
                        case 118 -> 236;
                        case 119 -> 170;
                        case 120 -> 144;
                        case 121 -> 231;
                        case 122 -> 64;
                        case 123 -> 107;
                        case 124 -> 88;
                        case 125 -> 205;
                        case 126 -> 4;
                        case 127 -> 21;
                        case 128 -> 252;
                        case 129 -> 190;
                        case 130 -> 247;
                        case 131 -> 240;
                        case 132 -> 151;
                        case 133 -> 225;
                        case 134 -> 36;
                        case 135 -> 134;
                        case 136 -> 173;
                        case 137 -> 5;
                        case 138 -> 133;
                        case 139 -> 22;
                        case 140 -> 77;
                        case 141 -> 84;
                        case 142 -> 76;
                        case 143 -> 221;
                        case 144 -> 145;
                        case 145 -> 1;
                        case 146 -> 16;
                        case 147 -> 26;
                        case 148 -> 31;
                        case 149 -> 131;
                        case 150 -> 241;
                        case 151 -> 242;
                        case 152 -> 180;
                        case 153 -> 168;
                        case 154 -> 191;
                        case 155 -> 45;
                        case 156 -> 136;
                        case 157 -> 216;
                        case 158 -> 204;
                        case 159 -> 218;
                        case 160 -> 83;
                        case 161 -> 75;
                        case 162 -> 130;
                        case 163 -> 237;
                        case 164 -> 110;
                        case 165 -> 140;
                        case 166 -> 245;
                        case 167 -> 117;
                        case 168 -> 56;
                        case 169 -> 100;
                        case 170 -> 42;
                        case 171 -> 79;
                        case 172 -> 19;
                        case 173 -> 158;
                        case 174 -> 95;
                        case 175 -> 224;
                        case 176 -> 165;
                        case 177 -> 104;
                        case 178 -> 238;
                        case 179 -> 81;
                        case 180 -> 34;
                        case 181 -> 141;
                        case 182 -> 52;
                        case 183 -> 49;
                        case 184 -> 29;
                        case 185 -> 46;
                        case 186 -> 217;
                        case 187 -> 186;
                        case 188 -> 94;
                        case 189 -> 39;
                        case 190 -> 60;
                        case 191 -> 163;
                        case 192 -> 126;
                        case 193 -> 235;
                        case 194 -> 202;
                        case 195 -> 156;
                        case 196 -> 62;
                        case 197 -> 125;
                        case 198 -> 226;
                        case 199 -> 219;
                        case 200 -> 96;
                        case 201 -> 118;
                        case 202 -> 255;
                        case 203 -> 166;
                        case 204 -> 80;
                        case 205 -> 220;
                        case 206 -> 113;
                        case 207 -> 69;
                        case 208 -> 44;
                        case 209 -> 27;
                        case 210 -> 91;
                        case 211 -> 250;
                        case 212 -> 123;
                        case 213 -> 148;
                        case 214 -> 201;
                        case 215 -> 183;
                        case 216 -> 154;
                        case 217 -> 229;
                        case 218 -> 179;
                        case 219 -> 71;
                        case 220 -> 101;
                        case 221 -> 195;
                        case 222 -> 194;
                        case 223 -> 207;
                        case 224 -> 120;
                        case 225 -> 232;
                        case 226 -> 68;
                        case 227 -> 253;
                        case 228 -> 9;
                        case 229 -> 147;
                        case 230 -> 14;
                        case 231 -> 206;
                        case 232 -> 85;
                        case 233 -> 210;
                        case 234 -> 212;
                        case 235 -> 121;
                        case 236 -> 199;
                        case 237 -> 222;
                        case 238 -> 228;
                        case 239 -> 188;
                        case 240 -> 164;
                        case 241 -> 124;
                        case 242 -> 112;
                        case 243 -> 0;
                        case 244 -> 254;
                        case 245 -> 24;
                        case 246 -> 187;
                        case 247 -> 32;
                        case 248 -> 174;
                        case 249 -> 65;
                        case 250 -> 213;
                        case 251 -> 128;
                        case 252 -> 150;
                        case 253 -> 30;
                        case 254 -> 246;
                        default -> 172;
                     };
                     int var5 = (var1x & 0xFF) - var4x;
                     if (var5 < 0) {
                        var5 += 256;
                     }

                     int var6x = ((var1x & 65535) >>> 8) - var4x;
                     if (var6x < 0) {
                        var6x += 256;
                     }

                     for (int var7x = 0; var7x < var3.length; var7x++) {
                        int var8x = var7x % 2;
                        char var10002 = var3[var7x];
                        if (var8x == 0) {
                           var3[var7x] = (char)(var10002 ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7x]) & 0xFF;
                        } else {
                           var3[var7x] = (char)(var10002 ^ var6x);
                           var6x = ((var6x >>> 3 | var6x << 5) ^ var3[var7x]) & 0xFF;
                        }
                     }

                     b[var2x] = new String(var3).intern();
                  }

                  return b[var2x];
               }
            }
         ));
      var4 = 0;
      int var5 = var3.size();

      while (true) {
         if (var4 < var5) {
            Vec3 var15 = (Vec3)var3.get(var4);
            Vec3 var16 = (Vec3)var3.get((var4 + 1) % var3.size());
            boolean var17 = this.a(var15, var16);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               .add(
                  new IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var15, var17
                  )
               );
            var4++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         int var20 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
         short var10001 = -2971;
         short var10002 = 18847;
         var10002 = -2973;
         short var10003 = -28413;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "§aGenerated smooth path with " + var20 + " points"
         );
         break;
      }
   }

   private final boolean a(Vec3 var1, Vec3 var2) { BlockPos var11 = null; // PX-FIX hoist
        
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         double var5 = var2.y - var1.y;
         double var24;
         int var10000 = (var24 = var5 - 0.3) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
         if (var3 != null) {
            if (var10000 <= 0) {
               BlockPos var7;
               int var9;
               int var10;
               label52: {
                  BlockPos var13 = BlockPos.containing(var1);
                  short var10002 = -2948;
                  short var10003 = 24317;
                  Intrinsics.checkNotNullExpressionValue(var13, "containing(...)");
                  var7 = var13;
                  BlockPos var14 = BlockPos.containing(var2);
                  var10002 = -2958;
                  var10003 = 7332;
                  Intrinsics.checkNotNullExpressionValue(var14, "containing(...)");
                  BlockPos var8 = var14;
                  var9 = var8.getX() - var7.getX();
                  var10 = var8.getZ() - var7.getZ();
                  var10000 = var9;
                  if (var3 != null) {
                     if (var9 != 0) {
                        break label52;
                     }

                     var10000 = var10;
                  }

                  if (var3 == null) {
                     return (var10000 != 0);
                  }

                  if (var10000 == 0) {
                     return (0 != 0);
                  }
               }

               BlockPos var16 = var7.offset(RangesKt.coerceIn(var9, -1, 1), 0, RangesKt.coerceIn(var10, -1, 1));
               short var19 = -2964;
               short var22 = -12647;
               Intrinsics.checkNotNullExpressionValue(var16, "offset(...)");
                var11 = var16;
               BlockState var17 = var4.getBlockState(var11);
               var19 = -2949;
               var22 = 29896;
               Intrinsics.checkNotNullExpressionValue(var17, "getBlockState(...)");
               BlockState var12 = var17;
               boolean var25 = var12.isAir();
               if (var3 == null) {
                  return var25;
               }

               if (!var25) {
                  var25 = var12.getBlock().defaultBlockState().canBeReplaced();
                  if (var3 == null) {
                     return var25;
                  }

                  if (!var25) {
                     return true;
                  }
               }

               return (0 != 0);
            }

            var10000 = 1;
         }

         return (var10000 != 0);
      } else {
         return false;
      }
   }

   private final boolean a(Vec3 var1) { BlockState var9 = null; // PX-FIX hoist
         boolean var11 = false; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         BlockPos var10000 = BlockPos.containing(var1);
         short var10002 = -2958;
         short var10003 = 7332;
         Intrinsics.checkNotNullExpressionValue(var10000, "containing(...)");
         BlockPos var4 = var10000;
         BlockState var8 = var3.getBlockState(var4.below());
         var10002 = -2950;
         var10003 = 14919;
         Intrinsics.checkNotNullExpressionValue(var8, "getBlockState(...)");
         BlockState var5 = var8;
          var9 = var3.getBlockState(var4);
         var10002 = -2950;
         var10003 = 14919;
         Intrinsics.checkNotNullExpressionValue(var9, "getBlockState(...)");
         BlockState var6 = var9;
         BlockState var10 = var3.getBlockState(var4.above());
         var10002 = -2950;
         var10003 = 14919;
         Intrinsics.checkNotNullExpressionValue(var10, "getBlockState(...)");
         BlockState var7 = var10;
          var11 = var5.isAir();
         if (var2 != null) {
            if (var11) {
               return false;
            }

            var11 = var6.isAir();
         }

         label42:
         if (var2 != null) {
            if (!var11) {
               var11 = var6.getBlock().defaultBlockState().canBeReplaced();
               if (var2 == null) {
                  break label42;
               }

               if (!var11) {
                  return false;
               }
            }

            var11 = var7.isAir();
         }

         if (var2 != null) {
            if (!var11) {
               boolean var18 = var7.getBlock().defaultBlockState().canBeReplaced();
               if (var2 == null) {
                  return var18;
               }

               if (!var18) {
                  return false;
               }
            }

            var11 = true;
         }

         return var11;
      } else {
         return false;
      }
   }

   public final void g() { float var9 = 0.0f; // PX-FIX hoist
        
      Object var55 = null; // PX-FIX
      byte var53 = 0; // PX-FIX
      Object var51 = null; // PX-FIX
      double var49 = 0; // PX-FIX
      Object var48 = null; // PX-FIX
      byte var47 = 0; // PX-FIX
      Object var43 = null; // PX-FIX
      Object var40 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         label333:
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            int var10000 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) ? 1 : 0);
            if (var1 != null) {
               if ((var10000 != 0)) {
                  break label333;
               }

               var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n()) ? 1 : 0);
            }

            if ((var10000 != 0)) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               return;
            }

            IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII var34 = this;
            if (var1 != null) {
               if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
                  this.j();
               }

               var34 = this;
            }

            var34.i();
            var10000 = ((me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j()) ? 1 : 0);
            label320:
            if (var1 != null) {
               if (var10000 == 0) {
                  var10000 = ((this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) ? 1 : 0);
                  if (var1 == null) {
                     break label320;
                  }

                  if (!this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
                     var10000 = ((java.util.function.Supplier<Integer>)(() -> { me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .k()
                        .a(100); return 0; })).get();
                     if (var1 == null) {
                        break label320;
                     }

                     if (var10000 != 0) {
                        if (this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll != null) {
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
                           boolean var5 = false;
                           if (var1 != null
                              && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .K()
                                 != var4.b()) {
                              me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .b(var4.b());
                           }
                        }
                     }
                  }
               }

               var10000 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
            }

            if (var1 != null) {
               if (var10000 != 0) {
                  this.f();
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.h();
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
               }

               var10000 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
            }

            if (var1 != null) {
               if (var10000 != 0) {
                  short var56 = -2972;
                  short var63 = 29104;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "§c[CrimsonBot] No valid path generated, fix waypoints or contact support."
                  );
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
                  return;
               }

               var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(2000); return 0; })).get();
            }

            label363: {
               if (var1 != null) {
                  if (var10000 == 0) {
                     break label363;
                  }

                  var10000 = this.h();
               }

               int var2 = var10000;
               Vec3 var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var2).a();
               double var21 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var3, false);
               if (var1 == null || var21 > 4.0) {
                  short var36 = -2947;
                  short var10001 = 29311;
                  String var7 = "%.1f";
                  Object[] var8 = new Object[]{var21};
                  String var37 = String.format(var7, Arrays.copyOf(var8, var8.length));
                  short var10002 = -2956;
                  short var10003 = -25942;
                  Intrinsics.checkNotNullExpressionValue(var37, "format(...)");
                  var10001 = -2975;
                  var10002 = -9634;
                  var10002 = -2974;
                  var10003 = -21083;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§e[CrimsonBot] Off-route detected! Resyncing... (" + var37 + "m from path)"
                  );
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var2;
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g();
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
               }

               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.f();
            }

            Vec3 var18 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(1000); return 0; })).get();
            if (var1 != null) {
               if (var10000 != 0) {
                  label291: {
                     label290: {
                        label342: {
                           double var19 = var18.distanceTo(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
                           double var72;
                           var10000 = (var72 = var19 - 0.2) == 0.0 ? 0 : (var72 < 0.0 ? -1 : 1);
                           if (var1 != null) {
                              if (var10000 >= 0) {
                                 break label342;
                              }

                              var10000 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                           }

                           int var23 = var10000;
                           this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var23 + 1;
                           var40 = this;
                           if (var1 == null) {
                              break label291;
                           }

                           if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll < 3) {
                              break label290;
                           }

                           short var41 = -2963;
                           short var58 = 12419;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "§c[CrimsonBot] Stuck detected! Finding nearest path point..."
                           );
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.h();
                           this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                           me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .g();
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .p();
                           if (var1 != null) {
                              break label290;
                           }
                        }

                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                     }

                     var40 = this;
                  }

                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var18;
               }

               var10000 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4)
                  % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            }

            label362: {
               int var20 = var10000;
               double var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var20).a(), false);
               double var73;
               var10000 = (var73 = var22 - 1.75) == 0.0 ? 0 : (var73 < 0.0 ? -1 : 1);
               if (var1 != null) {
                  if (var10000 < 0) {
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4
                        )
                        % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                  }

                  var43 = me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  if (var1 == null) {
                     break label362;
                  }

                  var10000 = ((me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .i()) ? 1 : 0);
               }

               if (var10000 == 0) {
                  label265: {
                     byte var44 = ((byte)((this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) ? 1 : 0));
                     if (var1 != null) {
                        if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
                           var10000 = 10;
                           break label265;
                        }

                        var44 = 8;
                     }

                     var10000 = var44 + Random.Default.nextInt(4);
                  }

                  int var6 = var10000;
                  int var25 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var6)
                     % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                  Vec3 var27 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var25).a();
                   var9 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var27)
                     .a();
                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
                     new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                        var9,
                        this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI + (float)Random.Default.nextLong(-2L, 2L)
                     )
                  );
               }

               var43 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var20);
            }

            byte var26;
            label257: {
               label256: {
                  label346: {
                     Vec3 var24;
                     var24 = ((IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var43)
                        .a();
                     LocalPlayer var46 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
                     Intrinsics.checkNotNull(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player);
                     var26 = ((byte)((var46.horizontalCollision) ? 1 : 0));
                     var47 = var26;
                     label254:
                     if (var1 != null) {
                        if (var26 != 0) {
                           var47 = ((byte)((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0));
                           if (var1 == null) {
                              break label254;
                           }

                           if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                              this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
                           }
                        }

                        this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = (var26 != 0);
                        if (var1 == null) {
                           break label346;
                        }

                        var47 = var26;
                     }

                     if (var47 != 0) {
                        var48 = this;
                        if (var1 == null) {
                           break label256;
                        }

                        if (((java.util.function.Supplier<Boolean>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(500); return false; })).get()) {
                           int var28 = this.h();
                           Vec3 var30 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var28).a();
                           double var10 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var30, false);
                           var49 = var10;
                           if (var1 == null) {
                              break label257;
                           }

                           if (var10 < 3.0) {
                              this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var28;
                              var24 = var30;
                           }
                        }
                     }

                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        var24,
                        false);
                  }

                  var48 = this;
               }

               LocalPlayer var50 = ((LocalPlayer)(Object)(((me.octo.client.PXDyn)(Object)((me.octo.client.PXDyn)var48).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).player));
               Intrinsics.checkNotNull(((me.octo.client.PXDyn)(Object)((me.octo.client.PXDyn)var48).IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).player);
               var49 = var50.getY();
            }

            double var29 = var49;
            if (var1 != null) {
               if (var29 > this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + 0.2) {
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
               }

               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var29;
            }

            label348: {
               List var31 = this.a(5);
               var var12 = var31;
               boolean var13 = false;
               var51 = var12;
               label233:
               if (var1 != null) {
                  if (var12 instanceof Collection) {
                     var51 = (Collection)var12;
                     if (var1 == null) {
                        break label233;
                     }

                     if (((me.octo.client.PXDyn)var51).isEmpty()) {
                        var10000 = 0;
                        break label348;
                     }
                  }

                  var51 = var12;
               }

               Iterator var14 = ((me.octo.client.PXDyn)var51).iterator();

               label224:
               while (true) {
                  if (!var14.hasNext()) {
                     var10000 = 0;
                     break;
                  }

                  Object var15 = var14.next();
                  IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = (IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var15;
                  boolean var17 = false;
                  var10000 = ((var16.b()) ? 1 : 0);

                  while (true) {
                     label220: {
                        label351: {
                           if (var1 != null) {
                              if (var10000 == 0) {
                                 break label351;
                              }

                              double var74;
                              var10000 = (
                                       var74 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a(var16.a(), false)
                                          - 2.5
                                    )
                                    == 0.0
                                 ? 0
                                 : (var74 < 0.0 ? -1 : 1);
                           }

                           if (var1 != null) {
                              if (var10000 >= 0) {
                                 break label351;
                              }

                              double var75;
                              var10000 = (var75 = var16.a().y - (var29 + 0.1)) == 0.0 ? 0 : (var75 < 0.0 ? -1 : 1);
                           }

                           if (var1 == null) {
                              break label220;
                           }

                           if (var10000 > 0) {
                              var10000 = 1;
                              break label220;
                           }
                        }

                        var10000 = 0;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     var10000 = 1;
                     if (var1 != null) {
                        break label224;
                     }
                  }
               }
            }

            int var11;
            label197: {
               label352: {
                  var11 = var10000;
                  var53 = var26;
                  if (var1 != null) {
                     if (var26 == 0) {
                        break label352;
                     }

                     var53 = ((java.util.function.Supplier<Byte>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(200); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label197;
                  }

                  if (var53 != 0) {
                     var53 = 1;
                     break label197;
                  }
               }

               var53 = 0;
            }

            label186: {
               label353: {
                  byte var32 = var53;
                  var10000 = var11;
                  label184:
                  if (var1 != null) {
                     if (var11 == 0) {
                        var10000 = var32;
                        if (var1 == null) {
                           break label184;
                        }

                        if (var32 == 0) {
                           break label353;
                        }
                     }

                     var10000 = ((java.util.function.Supplier<Integer>)(() -> { this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(400); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label186;
                  }

                  if (var10000 != 0) {
                     var10000 = 1;
                     break label186;
                  }
               }

               var10000 = 0;
            }

            short var70;
            label171: {
               label354: {
                  int var33 = var10000;
                  short var59 = -2969;
                  var70 = -17687;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("jump", (var33 != 0));
                  var59 = -2957;
                  var70 = 30029;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sprint", true);
                  var59 = -2970;
                  var70 = -29007;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sneak", false);
                  var55 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  var59 = -2951;
                  var70 = 15303;
                  var70 = ((short)((me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .j()) ? 1 : 0));
                  if (var1 != null) {
                     if ((var70 != 0)) {
                        break label354;
                     }

                     var70 = ((short)((this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) ? 1 : 0));
                  }

                  if (var1 == null) {
                     break label171;
                  }

                  if ((var70 == 0)) {
                     var70 = 1;
                     break label171;
                  }
               }

               var70 = 0;
            }

            ((me.octo.client.PXDyn)var55).a("attack", (var70 != 0));
            return;
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
      }
   }

   private final List<IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      int var1
   ) {
      ArrayList var7 = null; // PX-FIX
      ArrayList var3 = new ArrayList();
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var4 = 0;
      int var5 = RangesKt.coerceAtMost(var1, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size());
      String var2 = var10000;

      while (true) {
         if (var4 < var5) {
            int var6 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var4)
               % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            var7 = var3;
            if (var2 == null) {
               break;
            }

            var3.add(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var6));
            var4++;
            if (var2 != null) {
               continue;
            }
         }

         var7 = var3;
         break;
      }

      return (List<IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var7;
   }

   private final int h() {
       int var9 = 0; // PX-FIX decl var9
      int var2 = 0;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      double var3 = Double.MAX_VALUE;
      String var1 = var10000;
      int var5 = 0;
      int var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();

      while (true) {
         if (var5 < var6) {
            double var7 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var5).a(), false);
            if (var1 != null) {
               double var10;
               var9 = (var10 = var7 - var3) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  break;
               }

               if (var9 < 0) {
                  var3 = var7;
                  var2 = var5;
               }

               var5++;
            }

            if (var1 != null) {
               continue;
            }
         }

         var9 = var2;
         break;
      }

      return var9;
   }

   private final int b(Vec3 var1) { double var9 = 0.0; // PX-FIX hoist
        
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var3 = 0;
      double var4 = Double.MAX_VALUE;
      int var6 = 0;
      int var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size();
      String var2 = var10000;

      while (true) {
         if (var6 < var7) {
            Vec3 var8 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var6).a());
             var9 = var1.distanceTo(var8);
            if (var2 != null) {
               double var12;
               var11 = (var12 = var9 - var4) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  break;
               }

               if (var11 < 0) {
                  var4 = var9;
                  var3 = var6;
               }

               var6++;
            }

            if (var2 != null) {
               continue;
            }
         }

         var11 = var3;
         break;
      }

      return var11;
   }

   private final void i() { me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
         me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = null; // PX-FIX hoist
        
      Object var8 = null; // PX-FIX
      Object var7 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) ? 1 : 0);
      if (var1 != null) {
         if (this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
            return;
         }

         var10000 = ((me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j()) ? 1 : 0);
      }

      if (var1 != null) {
         if ((var10000 != 0)) {
            return;
         }

         var10000 = ((me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()) ? 1 : 0);
      }

      if ((var10000 != 0)) {
         label104: {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            if (var1 != null) {
               if (this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll != null) {
                  var10000 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.b();
                  break label104;
               }

               if (var1 == null) {
                  return;
               }

               var5 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
               var10001 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
            }

            if (var10001 == null) {
               return;
            }

            var10000 = var5.b();
         }

         int var2;
         label107: {
            var2 = var10000;
            var7 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            label73:
            if (var1 != null) {
               label71: {
                  if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
                     var8 = this;
                     if (var1 == null) {
                        break label71;
                     }

                     if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll != null) {
                        var7 = ((java.util.function.Supplier<Object>)(() -> { this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.a(30500); return null; })).get();
                        if (var1 == null) {
                           break label73;
                        }

                        if ((me.octo.client.PxTruth.truth(var7))) {
                           this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = true;
                            var9 = me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           Function0 var10002 = null;
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10003 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
                           Intrinsics.checkNotNull(this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll);
                           var9.a(2, var10002, CollectionsKt.listOf(var10003.b()), var2);
                           return;
                        }
                     }
                  }

                  var8 = this;
               }

               if (var1 == null) {
                  break label107;
               }

               var7 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            }

            if (!(me.octo.client.PxTruth.truth(var7))) {
               return;
            }

            var8 = this;
         }

         if (var1 != null) {
            if (this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == null) {
               return;
            }

            var8 = this;
         }

         long var3 = (boolean)this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ? 30500L : 20500L;
         IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII var10 = this;
         if (var1 != null) {
            if (!((java.util.function.Supplier<Boolean>)(() -> { this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.a(var3); return false; })).get()) {
               return;
            }

            var10 = this;
         }

         var10.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = true;
          var11 = me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Function0 var12 = null;
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
         Intrinsics.checkNotNull(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl);
         var11.a(2, var12, CollectionsKt.listOf(var13.b()), var2);
      }
   }

   private final void j() { me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
         boolean var11 = false; // PX-FIX hoist
        
      Object var14 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a(
         me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false)) {
         if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
         if (var1 == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .q();
         if (var10000 == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var10000;
         ArrayList var4 = new ArrayList();
         if (var1 != null && this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
            boolean var7 = false;
            var4.add(var6.b());
         }

         if (this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
            boolean var10 = false;
            var4.add(var8.b());
         }

         var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o();
         if (var10000 != null) {
             var9 = var10000;
             var11 = false;
            if (var1 != null && var3.b() != var9.b()) {
               var4.add(var9.b());
            }
         }

         label44: {
            var4.add(var3.b());
            me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .w();
            var10000 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            if (var1 != null) {
               if (this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll != null) {
                  var14 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.b();
                  break label44;
               }

               var10000 = var2;
            }

            var14 = var10000.b();
         }

         int var5 =((Integer)( var14));
         me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(2, IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII::o, CollectionsKt.toList(var4), var5);
      }
   }

   public final void a(
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1,
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
   ) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = -2952;
      short var10003 = -14134;
      Intrinsics.checkNotNullParameter(var1, "startWaypoints");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.addAll(var1);
      String var3 = var10000;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.f();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w()
         .y;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var2;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .q();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false);
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
      boolean var5 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      if (var3 != null) {
         if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
            var10002 = -2960;
            var10003 = 29202;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("Rogue Sword");
         }

         var5 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      }

      if (var5) {
         short var10001 = -2945;
         var10002 = -18412;
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("Weirder Tuba");
         if (var3 != null) {
            if (var4 != null) {
               this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var4;
               this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = true;
               if (var3 != null) {
                  return;
               }
            }

            var10002 = -2946;
            var10003 = -10260;
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("Weird Tuba");
         }

         this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = false;
      }
   }

   public final void k() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = -2953;
      short var10002 = 5970;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      var10001 = -2976;
      var10002 = 17712;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sprint", false);
      var10001 = -2955;
      var10002 = 32496;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("jump", false);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
   }

   @NotNull
   public final List<Vec3> l() { IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
        
      Iterable var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      boolean var3 = false;
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      boolean var6 = false;
      Iterator var7 = var2.iterator();

      Collection var10000;
      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var10000 = var5;
             var9 = (IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8;
            if (var1 == null) {
               break;
            }

            boolean var10 = false;
            var5.add(var9.a());
            if (var1 != null) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return (List<Vec3>)var10000;
   }

   public final int m() { double var9 = 0.0; // PX-FIX hoist
        
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) ? 1 : 0);
      if (var1 != null) {
         if (var10000 != 0) {
            return 0;
         }

         var10000 = 0;
      }

      int var2 = var10000;
      double var3 = Double.MAX_VALUE;
      Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      int var6 = 0;
      int var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size();

      while (true) {
         if (var6 < var7) {
            Vec3 var8 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var6).a());
             var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var5, var8);
            if (var1 != null) {
               double var12;
               var10000 = (var12 = var9 - var3) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  break;
               }

               if (var10000 < 0) {
                  var3 = var9;
                  var2 = var6;
               }

               var6++;
            }

            if (var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public final int n() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   private static final Unit a(IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII var0) {
      var0.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
      var0.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.f();
      return Unit.INSTANCE;
   }

   private static final Unit b(IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII var0) {
      var0.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
      var0.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.f();
      return Unit.INSTANCE;
   }

   private static final Unit o() {
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .x();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[27];
      int var3 = 0;
      String var2 = "\u0000½Lp\u000b\u0092û\u008cüÝP¼ ¼Ç9\u0006\u0004N¿>\u007f\u009a\u0010ùdÆ`]d\u001e\u000e\u007féE\u000b4\u0000½ê\u0007, ]\u0011^\u009c\u001f\u000bd)õ¾AWÐGd\u0005\u0006\u0006\u009aQ:Q\u0004a\u000f'£\u0083î£55uC\u008b\u008fÅ\u0089\u001f\r\u0004DJ>¨\u000fº\u00050:Õ¯û&\u009aá´\u0088î¶á\fæ`\u000eÛðYæ<\u009cÐC±\nÏÖ+\rTÆTw\u001eR\u0006\u0087\u001eÏ4qÛ\u000eÇÖ\u0082>x×öÀË'\u0002\u0019\u000b\u0091\u0012I\u008fÐ\u0016\u009dÜS\u008c\u001eå÷#\u00adÔ¬±V\u0098\u00123\u0012\u009f¥tªnB¹<\u0003\u00183³\u007f],\u0005\u001d`à\u001eX\u0013ÜÑÍZ\u0097¹\n×jvÊ>ß\f\u0095¦FÙ\u0014EÞ>\u0095ãIoúã\u007f/ÖÖ\u0013]\u0017\u0007?åZ\u0098Û^°.(sßÃ\u0099\u008cgà«8_@bµæ|j\u008fÕxc»C[$m\u00ad\\óÐ\u0097ÞÄgSå^à¼Q\u009aÍêB\u009aOÜÔçJ\u008f»/c\u0004\u0013O..\u0005\u0093ã\fÒ21®ðÛø(&6\rAÔ\u0084G\u0095U\u0096;\u0096ËDÚ\rì\u007f%Y\u0018\u0011ýp\u000eµÇ9k\u008dÄØõÇÜ¶3Im¢d\u0080<±\u0006\u001a>*¼\u0006Ü\u0007×\u0005·Û\u000b0Ó\fªÿõÅj\u0092\u008d\u001cÜ\u008fÒ3<°\u0097\u0018ÒPc9¥ Á¸å\u0012\u0001f\u00ad\u009a\u0095Ûy6³¯ì5\u0015`ªl\u0095C\u009d4(Ä16\u0003)\u0094\u001f2¦F\u009d\u0019\u009fÒÔ®\u0097\t\u008b{\u001dám\u0099\u007f\u009a";
      int var4 = "\u0000½Lp\u000b\u0092û\u008cüÝP¼ ¼Ç9\u0006\u0004N¿>\u007f\u009a\u0010ùdÆ`]d\u001e\u000e\u007féE\u000b4\u0000½ê\u0007, ]\u0011^\u009c\u001f\u000bd)õ¾AWÐGd\u0005\u0006\u0006\u009aQ:Q\u0004a\u000f'£\u0083î£55uC\u008b\u008fÅ\u0089\u001f\r\u0004DJ>¨\u000fº\u00050:Õ¯û&\u009aá´\u0088î¶á\fæ`\u000eÛðYæ<\u009cÐC±\nÏÖ+\rTÆTw\u001eR\u0006\u0087\u001eÏ4qÛ\u000eÇÖ\u0082>x×öÀË'\u0002\u0019\u000b\u0091\u0012I\u008fÐ\u0016\u009dÜS\u008c\u001eå÷#\u00adÔ¬±V\u0098\u00123\u0012\u009f¥tªnB¹<\u0003\u00183³\u007f],\u0005\u001d`à\u001eX\u0013ÜÑÍZ\u0097¹\n×jvÊ>ß\f\u0095¦FÙ\u0014EÞ>\u0095ãIoúã\u007f/ÖÖ\u0013]\u0017\u0007?åZ\u0098Û^°.(sßÃ\u0099\u008cgà«8_@bµæ|j\u008fÕxc»C[$m\u00ad\\óÐ\u0097ÞÄgSå^à¼Q\u009aÍêB\u009aOÜÔçJ\u008f»/c\u0004\u0013O..\u0005\u0093ã\fÒ21®ðÛø(&6\rAÔ\u0084G\u0095U\u0096;\u0096ËDÚ\rì\u007f%Y\u0018\u0011ýp\u000eµÇ9k\u008dÄØõÇÜ¶3Im¢d\u0080<±\u0006\u001a>*¼\u0006Ü\u0007×\u0005·Û\u000b0Ó\fªÿõÅj\u0092\u008d\u001cÜ\u008fÒ3<°\u0097\u0018ÒPc9¥ Á¸å\u0012\u0001f\u00ad\u009a\u0095Ûy6³¯ì5\u0015`ªl\u0095C\u009d4(Ä16\u0003)\u0094\u001f2¦F\u009d\u0019\u009fÒÔ®\u0097\t\u008b{\u001dám\u0099\u007f\u009a"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 121;
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
                     case 0 -> 73;
                     case 1 -> 89;
                     case 2 -> 121;
                     case 3 -> 17;
                     case 4 -> 104;
                     case 5 -> 15;
                     default -> 57;
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
                     b = new String[27];
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

                  var2 = ";\u0015\u0004\u0096ßAù\u0083\u00952\u009d\u0004~Ò\u000b\u0015";
                  var4 = ";\u0015\u0004\u0096ßAù\u0083\u00952\u009d\u0004~Ò\u000b\u0015".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 92;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -2955) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 219;
            case 1 -> 218;
            case 2 -> 149;
            case 3 -> 227;
            case 4 -> 151;
            case 5 -> 196;
            case 6 -> 58;
            case 7 -> 159;
            case 8 -> 135;
            case 9 -> 214;
            case 10 -> 141;
            case 11 -> 21;
            case 12 -> 199;
            case 13 -> 23;
            case 14 -> 1;
            case 15 -> 94;
            case 16 -> 155;
            case 17 -> 57;
            case 18 -> 97;
            case 19 -> 120;
            case 20 -> 254;
            case 21 -> 195;
            case 22 -> 194;
            case 23 -> 48;
            case 24 -> 249;
            case 25 -> 186;
            case 26 -> 67;
            case 27 -> 247;
            case 28 -> 40;
            case 29 -> 52;
            case 30 -> 127;
            case 31 -> 123;
            case 32 -> 152;
            case 33 -> 228;
            case 34 -> 119;
            case 35 -> 160;
            case 36 -> 205;
            case 37 -> 25;
            case 38 -> 224;
            case 39 -> 81;
            case 40 -> 126;
            case 41 -> 154;
            case 42 -> 215;
            case 43 -> 243;
            case 44 -> 80;
            case 45 -> 13;
            case 46 -> 88;
            case 47 -> 193;
            case 48 -> 150;
            case 49 -> 161;
            case 50 -> 47;
            case 51 -> 138;
            case 52 -> 253;
            case 53 -> 252;
            case 54 -> 102;
            case 55 -> 115;
            case 56 -> 244;
            case 57 -> 114;
            case 58 -> 108;
            case 59 -> 19;
            case 60 -> 176;
            case 61 -> 0;
            case 62 -> 212;
            case 63 -> 112;
            case 64 -> 98;
            case 65 -> 125;
            case 66 -> 79;
            case 67 -> 24;
            case 68 -> 76;
            case 69 -> 109;
            case 70 -> 4;
            case 71 -> 248;
            case 72 -> 220;
            case 73 -> 167;
            case 74 -> 153;
            case 75 -> 171;
            case 76 -> 175;
            case 77 -> 99;
            case 78 -> 166;
            case 79 -> 172;
            case 80 -> 168;
            case 81 -> 83;
            case 82 -> 111;
            case 83 -> 240;
            case 84 -> 12;
            case 85 -> 177;
            case 86 -> 130;
            case 87 -> 216;
            case 88 -> 62;
            case 89 -> 255;
            case 90 -> 158;
            case 91 -> 137;
            case 92 -> 106;
            case 93 -> 237;
            case 94 -> 107;
            case 95 -> 184;
            case 96 -> 197;
            case 97 -> 101;
            case 98 -> 145;
            case 99 -> 250;
            case 100 -> 213;
            case 101 -> 51;
            case 102 -> 85;
            case 103 -> 148;
            case 104 -> 53;
            case 105 -> 61;
            case 106 -> 181;
            case 107 -> 10;
            case 108 -> 211;
            case 109 -> 28;
            case 110 -> 192;
            case 111 -> 35;
            case 112 -> 204;
            case 113 -> 90;
            case 114 -> 11;
            case 115 -> 128;
            case 116 -> 46;
            case 117 -> 217;
            case 118 -> 162;
            case 119 -> 208;
            case 120 -> 134;
            case 121 -> 170;
            case 122 -> 63;
            case 123 -> 71;
            case 124 -> 122;
            case 125 -> 78;
            case 126 -> 140;
            case 127 -> 34;
            case 128 -> 92;
            case 129 -> 209;
            case 130 -> 33;
            case 131 -> 36;
            case 132 -> 84;
            case 133 -> 144;
            case 134 -> 27;
            case 135 -> 180;
            case 136 -> 17;
            case 137 -> 3;
            case 138 -> 20;
            case 139 -> 232;
            case 140 -> 200;
            case 141 -> 31;
            case 142 -> 41;
            case 143 -> 7;
            case 144 -> 54;
            case 145 -> 6;
            case 146 -> 104;
            case 147 -> 133;
            case 148 -> 100;
            case 149 -> 245;
            case 150 -> 32;
            case 151 -> 203;
            case 152 -> 89;
            case 153 -> 95;
            case 154 -> 174;
            case 155 -> 157;
            case 156 -> 72;
            case 157 -> 139;
            case 158 -> 37;
            case 159 -> 87;
            case 160 -> 164;
            case 161 -> 210;
            case 162 -> 230;
            case 163 -> 225;
            case 164 -> 91;
            case 165 -> 132;
            case 166 -> 223;
            case 167 -> 156;
            case 168 -> 16;
            case 169 -> 124;
            case 170 -> 116;
            case 171 -> 5;
            case 172 -> 185;
            case 173 -> 14;
            case 174 -> 222;
            case 175 -> 43;
            case 176 -> 74;
            case 177 -> 163;
            case 178 -> 103;
            case 179 -> 66;
            case 180 -> 143;
            case 181 -> 165;
            case 182 -> 207;
            case 183 -> 241;
            case 184 -> 136;
            case 185 -> 235;
            case 186 -> 121;
            case 187 -> 42;
            case 188 -> 86;
            case 189 -> 142;
            case 190 -> 59;
            case 191 -> 18;
            case 192 -> 242;
            case 193 -> 229;
            case 194 -> 93;
            case 195 -> 45;
            case 196 -> 22;
            case 197 -> 236;
            case 198 -> 173;
            case 199 -> 77;
            case 200 -> 50;
            case 201 -> 183;
            case 202 -> 9;
            case 203 -> 234;
            case 204 -> 117;
            case 205 -> 131;
            case 206 -> 69;
            case 207 -> 231;
            case 208 -> 29;
            case 209 -> 118;
            case 210 -> 49;
            case 211 -> 201;
            case 212 -> 113;
            case 213 -> 129;
            case 214 -> 147;
            case 215 -> 105;
            case 216 -> 251;
            case 217 -> 146;
            case 218 -> 75;
            case 219 -> 82;
            case 220 -> 191;
            case 221 -> 8;
            case 222 -> 55;
            case 223 -> 238;
            case 224 -> 64;
            case 225 -> 56;
            case 226 -> 182;
            case 227 -> 233;
            case 228 -> 246;
            case 229 -> 15;
            case 230 -> 26;
            case 231 -> 60;
            case 232 -> 239;
            case 233 -> 189;
            case 234 -> 198;
            case 235 -> 38;
            case 236 -> 2;
            case 237 -> 73;
            case 238 -> 202;
            case 239 -> 169;
            case 240 -> 187;
            case 241 -> 190;
            case 242 -> 221;
            case 243 -> 226;
            case 244 -> 30;
            case 245 -> 39;
            case 246 -> 206;
            case 247 -> 70;
            case 248 -> 96;
            case 249 -> 110;
            case 250 -> 188;
            case 251 -> 179;
            case 252 -> 44;
            case 253 -> 178;
            case 254 -> 65;
            default -> 68;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull Vec3 var1, boolean var2) {
         short var10001 = -10796;
         short var10002 = -7949;
         Intrinsics.checkNotNullParameter(var1, "pos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final Vec3 a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Vec3 c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull Vec3 var1, boolean var2
      ) {
         short var10001 = -10794;
         short var10002 = -4522;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return new IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -10793;
         short var10003 = -30736;
         var10003 = -10795;
         short var10004 = 27888;
         return "PathPoint(pos="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", jump="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != null) {
            if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "Å\u008d·\u0007\u008ej\u0010î%¦È";
         int var4 = "Å\u008d·\u0007\u008ej\u0010î%¦È".length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 90;
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
                        case 0 -> 64;
                        case 1 -> 36;
                        case 2 -> 27;
                        case 3 -> 103;
                        case 4 -> 31;
                        case 5 -> 45;
                        default -> 99;
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
                        b = new String[4];
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

                     var2 = "¬o£\u000eVªß»\u0005\u0094;³7Æ§Î\u0010Î";
                     var4 = "¬o£\u000eVªß»\u0005\u0094;³7Æ§Î\u0010Î".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 9;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -10796) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 91;
               case 1 -> 170;
               case 2 -> 209;
               case 3 -> 137;
               case 4 -> 225;
               case 5 -> 230;
               case 6 -> 176;
               case 7 -> 55;
               case 8 -> 221;
               case 9 -> 40;
               case 10 -> 105;
               case 11 -> 149;
               case 12 -> 211;
               case 13 -> 13;
               case 14 -> 45;
               case 15 -> 148;
               case 16 -> 139;
               case 17 -> 60;
               case 18 -> 18;
               case 19 -> 93;
               case 20 -> 153;
               case 21 -> 41;
               case 22 -> 47;
               case 23 -> 164;
               case 24 -> 150;
               case 25 -> 112;
               case 26 -> 253;
               case 27 -> 194;
               case 28 -> 119;
               case 29 -> 158;
               case 30 -> 235;
               case 31 -> 161;
               case 32 -> 181;
               case 33 -> 101;
               case 34 -> 58;
               case 35 -> 165;
               case 36 -> 3;
               case 37 -> 64;
               case 38 -> 124;
               case 39 -> 122;
               case 40 -> 218;
               case 41 -> 177;
               case 42 -> 130;
               case 43 -> 92;
               case 44 -> 59;
               case 45 -> 107;
               case 46 -> 98;
               case 47 -> 24;
               case 48 -> 43;
               case 49 -> 110;
               case 50 -> 251;
               case 51 -> 131;
               case 52 -> 77;
               case 53 -> 121;
               case 54 -> 159;
               case 55 -> 20;
               case 56 -> 33;
               case 57 -> 74;
               case 58 -> 115;
               case 59 -> 255;
               case 60 -> 254;
               case 61 -> 200;
               case 62 -> 172;
               case 63 -> 210;
               case 64 -> 66;
               case 65 -> 17;
               case 66 -> 129;
               case 67 -> 171;
               case 68 -> 166;
               case 69 -> 125;
               case 70 -> 162;
               case 71 -> 248;
               case 72 -> 228;
               case 73 -> 44;
               case 74 -> 118;
               case 75 -> 138;
               case 76 -> 106;
               case 77 -> 226;
               case 78 -> 127;
               case 79 -> 75;
               case 80 -> 36;
               case 81 -> 140;
               case 82 -> 32;
               case 83 -> 196;
               case 84 -> 231;
               case 85 -> 99;
               case 86 -> 4;
               case 87 -> 250;
               case 88 -> 116;
               case 89 -> 180;
               case 90 -> 21;
               case 91 -> 237;
               case 92 -> 120;
               case 93 -> 84;
               case 94 -> 227;
               case 95 -> 136;
               case 96 -> 133;
               case 97 -> 23;
               case 98 -> 191;
               case 99 -> 154;
               case 100 -> 9;
               case 101 -> 239;
               case 102 -> 207;
               case 103 -> 80;
               case 104 -> 26;
               case 105 -> 69;
               case 106 -> 83;
               case 107 -> 95;
               case 108 -> 6;
               case 109 -> 167;
               case 110 -> 168;
               case 111 -> 2;
               case 112 -> 183;
               case 113 -> 65;
               case 114 -> 8;
               case 115 -> 35;
               case 116 -> 245;
               case 117 -> 188;
               case 118 -> 14;
               case 119 -> 233;
               case 120 -> 0;
               case 121 -> 79;
               case 122 -> 30;
               case 123 -> 51;
               case 124 -> 111;
               case 125 -> 52;
               case 126 -> 113;
               case 127 -> 103;
               case 128 -> 246;
               case 129 -> 49;
               case 130 -> 204;
               case 131 -> 195;
               case 132 -> 87;
               case 133 -> 169;
               case 134 -> 15;
               case 135 -> 117;
               case 136 -> 192;
               case 137 -> 27;
               case 138 -> 48;
               case 139 -> 22;
               case 140 -> 114;
               case 141 -> 224;
               case 142 -> 72;
               case 143 -> 184;
               case 144 -> 160;
               case 145 -> 234;
               case 146 -> 217;
               case 147 -> 198;
               case 148 -> 56;
               case 149 -> 7;
               case 150 -> 89;
               case 151 -> 63;
               case 152 -> 220;
               case 153 -> 34;
               case 154 -> 214;
               case 155 -> 90;
               case 156 -> 156;
               case 157 -> 128;
               case 158 -> 11;
               case 159 -> 132;
               case 160 -> 201;
               case 161 -> 104;
               case 162 -> 88;
               case 163 -> 141;
               case 164 -> 144;
               case 165 -> 86;
               case 166 -> 46;
               case 167 -> 222;
               case 168 -> 61;
               case 169 -> 53;
               case 170 -> 243;
               case 171 -> 25;
               case 172 -> 76;
               case 173 -> 50;
               case 174 -> 203;
               case 175 -> 31;
               case 176 -> 206;
               case 177 -> 242;
               case 178 -> 82;
               case 179 -> 57;
               case 180 -> 54;
               case 181 -> 252;
               case 182 -> 28;
               case 183 -> 249;
               case 184 -> 232;
               case 185 -> 94;
               case 186 -> 219;
               case 187 -> 71;
               case 188 -> 85;
               case 189 -> 134;
               case 190 -> 38;
               case 191 -> 186;
               case 192 -> 163;
               case 193 -> 96;
               case 194 -> 70;
               case 195 -> 175;
               case 196 -> 5;
               case 197 -> 135;
               case 198 -> 213;
               case 199 -> 16;
               case 200 -> 208;
               case 201 -> 37;
               case 202 -> 155;
               case 203 -> 1;
               case 204 -> 236;
               case 205 -> 247;
               case 206 -> 229;
               case 207 -> 197;
               case 208 -> 202;
               case 209 -> 212;
               case 210 -> 39;
               case 211 -> 97;
               case 212 -> 12;
               case 213 -> 42;
               case 214 -> 147;
               case 215 -> 215;
               case 216 -> 123;
               case 217 -> 199;
               case 218 -> 108;
               case 219 -> 173;
               case 220 -> 190;
               case 221 -> 78;
               case 222 -> 142;
               case 223 -> 68;
               case 224 -> 182;
               case 225 -> 174;
               case 226 -> 238;
               case 227 -> 10;
               case 228 -> 216;
               case 229 -> 193;
               case 230 -> 157;
               case 231 -> 241;
               case 232 -> 126;
               case 233 -> 178;
               case 234 -> 102;
               case 235 -> 100;
               case 236 -> 185;
               case 237 -> 223;
               case 238 -> 143;
               case 239 -> 205;
               case 240 -> 152;
               case 241 -> 146;
               case 242 -> 62;
               case 243 -> 109;
               case 244 -> 187;
               case 245 -> 73;
               case 246 -> 19;
               case 247 -> 29;
               case 248 -> 189;
               case 249 -> 240;
               case 250 -> 179;
               case 251 -> 151;
               case 252 -> 145;
               case 253 -> 81;
               case 254 -> 67;
               default -> 244;
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
         public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(net.minecraft.world.phys.Vec3 p0, boolean p1, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this(p0, (mask & 2) != 0 ? false : p1);
      }
      public static me.octo.client.IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, net.minecraft.world.phys.Vec3 p1, boolean p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}

   public static void a(
      me.octo.client.IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII var0,
      java.util.List var1,
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2,
      int var3,
      java.lang.Object var4
   ) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }
      
      var0.a(var1, var2);
   }

   public static final boolean a(
      me.octo.client.IlIIlIIIIllIlIIIllllIIlIIIIIIlIlIIlIllIIIIIIllllllllIlIlIllIIIIIIIIIlIIIlIIlIIlIlIIII var0,
      net.minecraft.world.phys.Vec3 var1
   ) {
      return var0.a(var1);
   }
}
