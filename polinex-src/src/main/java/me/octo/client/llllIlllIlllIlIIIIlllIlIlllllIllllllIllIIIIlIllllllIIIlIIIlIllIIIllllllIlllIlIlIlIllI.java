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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI {
   public static me.octo.client.PXDyn Object = null; // PX-FIX missing field

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private ArrayList<llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
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
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
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
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private boolean IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static String[] a;
   private static String[] b;

   public llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = 15379;
      short var10004 = 16150;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 32.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var1 = Vec3.ZERO;
      var10003 = 15408;
      var10004 = -13150;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
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
      short var10001 = 15422;
      short var10002 = 31005;
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

   public final boolean f() {
      return this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   public final void e(boolean var1) {
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
   }

   private final void g() { Object var9 = null; // PX-FIX hoist
        
      Collection var20 = null; // PX-FIX
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
      boolean var4 = false;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
             var9 = var8.next();
            var20 = var6;
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var9;
            if (var1 == null) {
               break;
            }

            boolean var11 = false;
            var6.add(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var10.a())
            );
            if (var1 != null) {
               continue;
            }
         }

         var20 = var6;
         break;
      }

      List var2 = (List)var20;
      var3 = this.a(var2);
      List var14 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         var3,
         0.0,
         0,
         (Function1)(
            new Function1<Vec3, Boolean>() {
   public Boolean invoke(Vec3 p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 19935;
                  short var10005 = 30254;
                  var10005 = 19933;
                  short var10006 = 25204;
               }

               public final Boolean a(Vec3 var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 19934;
                  short var10002 = 31868;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  return ((llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI)this.receiver).c(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3x = 0;
                  String var2x = "\u0085µÔï'\u007fýë\"áQZ\u0016\bè*\u0002\u008c®2CU\fó<ü\u009e\u009bNïÜ\u009b§0Þ-Ç$(\u0083a\u0098\u0015À)ªB](_LK\u0097kª\u008d£\u000fÉÐ\u0099¿D\u0012W\u0098\u0083\u0080¿\u0018";
                  int var4x = "\u0085µÔï'\u007fýë\"áQZ\u0016\bè*\u0002\u008c®2CU\fó<ü\u009e\u009bNïÜ\u009b§0Þ-Ç$(\u0083a\u0098\u0015À)ªB](_LK\u0097kª\u008d£\u000fÉÐ\u0099¿D\u0012W\u0098\u0083\u0080¿\u0018"
                     .length();
                  char var1x = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2x.substring(++var0, var0 + var1x).toCharArray();
                        int var10004 = var10003.length;
                        int var6x = 0;
                        byte var13 = 77;
                        var10002 = var10003;
                        int var8x = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 77;
                           var10006 = var6x;
                        } else {
                           var13 = 77;
                           var8x = var10004;
                           if (var10004 <= var6x) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 77;
                           var10006 = var6x;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6x % 7) {
                              case 0 -> 39;
                              case 1 -> 69;
                              case 2 -> 112;
                              case 3 -> 105;
                              case 4 -> 121;
                              case 5 -> 110;
                              default -> 120;
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
                  int var2x = (var0 ^ 19935) & 65535;
                  if (b[var2x] == null) {
                     char[] var3 = a[var2x].toCharArray();

                     short var4x = switch (var3[0] & 0xFF) {
                        case 0 -> 176;
                        case 1 -> 92;
                        case 2 -> 103;
                        case 3 -> 255;
                        case 4 -> 81;
                        case 5 -> 25;
                        case 6 -> 31;
                        case 7 -> 199;
                        case 8 -> 128;
                        case 9 -> 238;
                        case 10 -> 11;
                        case 11 -> 72;
                        case 12 -> 154;
                        case 13 -> 73;
                        case 14 -> 21;
                        case 15 -> 242;
                        case 16 -> 163;
                        case 17 -> 125;
                        case 18 -> 34;
                        case 19 -> 102;
                        case 20 -> 210;
                        case 21 -> 215;
                        case 22 -> 13;
                        case 23 -> 4;
                        case 24 -> 60;
                        case 25 -> 116;
                        case 26 -> 99;
                        case 27 -> 194;
                        case 28 -> 204;
                        case 29 -> 227;
                        case 30 -> 185;
                        case 31 -> 89;
                        case 32 -> 61;
                        case 33 -> 6;
                        case 34 -> 202;
                        case 35 -> 162;
                        case 36 -> 1;
                        case 37 -> 181;
                        case 38 -> 132;
                        case 39 -> 30;
                        case 40 -> 41;
                        case 41 -> 52;
                        case 42 -> 170;
                        case 43 -> 127;
                        case 44 -> 140;
                        case 45 -> 144;
                        case 46 -> 19;
                        case 47 -> 225;
                        case 48 -> 29;
                        case 49 -> 98;
                        case 50 -> 107;
                        case 51 -> 71;
                        case 52 -> 62;
                        case 53 -> 157;
                        case 54 -> 94;
                        case 55 -> 137;
                        case 56 -> 212;
                        case 57 -> 124;
                        case 58 -> 112;
                        case 59 -> 130;
                        case 60 -> 33;
                        case 61 -> 164;
                        case 62 -> 5;
                        case 63 -> 77;
                        case 64 -> 76;
                        case 65 -> 193;
                        case 66 -> 27;
                        case 67 -> 9;
                        case 68 -> 172;
                        case 69 -> 183;
                        case 70 -> 231;
                        case 71 -> 150;
                        case 72 -> 203;
                        case 73 -> 143;
                        case 74 -> 222;
                        case 75 -> 188;
                        case 76 -> 22;
                        case 77 -> 46;
                        case 78 -> 165;
                        case 79 -> 100;
                        case 80 -> 69;
                        case 81 -> 97;
                        case 82 -> 96;
                        case 83 -> 180;
                        case 84 -> 159;
                        case 85 -> 213;
                        case 86 -> 233;
                        case 87 -> 47;
                        case 88 -> 114;
                        case 89 -> 90;
                        case 90 -> 120;
                        case 91 -> 151;
                        case 92 -> 178;
                        case 93 -> 251;
                        case 94 -> 195;
                        case 95 -> 70;
                        case 96 -> 249;
                        case 97 -> 80;
                        case 98 -> 14;
                        case 99 -> 243;
                        case 100 -> 174;
                        case 101 -> 82;
                        case 102 -> 190;
                        case 103 -> 44;
                        case 104 -> 49;
                        case 105 -> 138;
                        case 106 -> 24;
                        case 107 -> 252;
                        case 108 -> 110;
                        case 109 -> 42;
                        case 110 -> 16;
                        case 111 -> 216;
                        case 112 -> 106;
                        case 113 -> 32;
                        case 114 -> 229;
                        case 115 -> 118;
                        case 116 -> 142;
                        case 117 -> 40;
                        case 118 -> 228;
                        case 119 -> 189;
                        case 120 -> 63;
                        case 121 -> 240;
                        case 122 -> 121;
                        case 123 -> 12;
                        case 124 -> 115;
                        case 125 -> 160;
                        case 126 -> 83;
                        case 127 -> 87;
                        case 128 -> 184;
                        case 129 -> 235;
                        case 130 -> 226;
                        case 131 -> 161;
                        case 132 -> 175;
                        case 133 -> 214;
                        case 134 -> 59;
                        case 135 -> 248;
                        case 136 -> 117;
                        case 137 -> 221;
                        case 138 -> 186;
                        case 139 -> 196;
                        case 140 -> 166;
                        case 141 -> 55;
                        case 142 -> 43;
                        case 143 -> 217;
                        case 144 -> 139;
                        case 145 -> 146;
                        case 146 -> 93;
                        case 147 -> 66;
                        case 148 -> 23;
                        case 149 -> 67;
                        case 150 -> 207;
                        case 151 -> 179;
                        case 152 -> 54;
                        case 153 -> 65;
                        case 154 -> 152;
                        case 155 -> 75;
                        case 156 -> 156;
                        case 157 -> 205;
                        case 158 -> 223;
                        case 159 -> 153;
                        case 160 -> 15;
                        case 161 -> 177;
                        case 162 -> 232;
                        case 163 -> 241;
                        case 164 -> 105;
                        case 165 -> 64;
                        case 166 -> 2;
                        case 167 -> 123;
                        case 168 -> 50;
                        case 169 -> 246;
                        case 170 -> 17;
                        case 171 -> 129;
                        case 172 -> 91;
                        case 173 -> 36;
                        case 174 -> 219;
                        case 175 -> 201;
                        case 176 -> 56;
                        case 177 -> 211;
                        case 178 -> 136;
                        case 179 -> 224;
                        case 180 -> 131;
                        case 181 -> 35;
                        case 182 -> 208;
                        case 183 -> 18;
                        case 184 -> 234;
                        case 185 -> 145;
                        case 186 -> 20;
                        case 187 -> 126;
                        case 188 -> 57;
                        case 189 -> 149;
                        case 190 -> 158;
                        case 191 -> 209;
                        case 192 -> 53;
                        case 193 -> 171;
                        case 194 -> 182;
                        case 195 -> 133;
                        case 196 -> 104;
                        case 197 -> 198;
                        case 198 -> 101;
                        case 199 -> 48;
                        case 200 -> 155;
                        case 201 -> 197;
                        case 202 -> 109;
                        case 203 -> 51;
                        case 204 -> 236;
                        case 205 -> 8;
                        case 206 -> 148;
                        case 207 -> 37;
                        case 208 -> 28;
                        case 209 -> 254;
                        case 210 -> 119;
                        case 211 -> 74;
                        case 212 -> 111;
                        case 213 -> 250;
                        case 214 -> 192;
                        case 215 -> 135;
                        case 216 -> 45;
                        case 217 -> 78;
                        case 218 -> 58;
                        case 219 -> 26;
                        case 220 -> 218;
                        case 221 -> 187;
                        case 222 -> 169;
                        case 223 -> 253;
                        case 224 -> 206;
                        case 225 -> 141;
                        case 226 -> 122;
                        case 227 -> 167;
                        case 228 -> 39;
                        case 229 -> 147;
                        case 230 -> 230;
                        case 231 -> 173;
                        case 232 -> 113;
                        case 233 -> 237;
                        case 234 -> 85;
                        case 235 -> 108;
                        case 236 -> 245;
                        case 237 -> 84;
                        case 238 -> 38;
                        case 239 -> 168;
                        case 240 -> 3;
                        case 241 -> 134;
                        case 242 -> 68;
                        case 243 -> 247;
                        case 244 -> 79;
                        case 245 -> 10;
                        case 246 -> 239;
                        case 247 -> 95;
                        case 248 -> 0;
                        case 249 -> 86;
                        case 250 -> 7;
                        case 251 -> 220;
                        case 252 -> 191;
                        case 253 -> 200;
                        case 254 -> 88;
                        default -> 244;
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
      int var5 = 0;
      int var15 = var14.size();

      while (true) {
         if (var5 < var15) {
            Vec3 var16 = (Vec3)var14.get(var5);
            Vec3 var17 = (Vec3)var14.get((var5 + 1) % var14.size());
            boolean var18 = this.b(var16, var17);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               .add(
                  new llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var16, var18
                  )
               );
            var5++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         int var21 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
         int var10001 = var3.size();
         short var10002 = 15396;
         short var10003 = 6951;
         var10003 = 15418;
         short var10004 = 14957;
         var10004 = 15417;
         short var10005 = -23161;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "§aGenerated smooth path with " + var21 + " points from " + var10001 + " waypoints"
         );
         break;
      }
   }

   private final List<Vec3> a(List<? extends Vec3> var1) { BlockPos var9 = null; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         ArrayList var4 = new ArrayList();
         int var5 = 0;
         int var6 = var1.size();

         Object var10000;
         while (true) {
            if (var5 < var6) {
               Vec3 var7 = (Vec3)var1.get(var5);
               Vec3 var8 = (Vec3)var1.get((var5 + 1) % var1.size());
               var10000 = var4;
               if (var2 == null) {
                  break;
               }

               var4.add(var7);
                var9 = this.a(var7, var8);
               label29:
               if (var2 != null) {
                  if (var9 != null) {
                     Vec3 var10 = this.a(var7, var8, var9);
                     if (var2 == null) {
                        break label29;
                     }

                     if (var10 != null) {
                        var4.add(var10);
                        short var10001 = 15397;
                        short var10002 = 22603;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                           "§e[SandBot] Inserted waypoint to avoid cactus at " + var9
                        );
                     }
                  }

                  var5++;
               }

               if (var2 != null) {
                  continue;
               }
            }

            var10000 = var4;
            break;
         }

         return (List<Vec3>)var10000;
      } else {
         return ((List<Vec3>)(Object)(var1));
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final BlockPos a(Vec3 var1, Vec3 var2) { double var9 = 0.0; // PX-FIX hoist
        
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         double var5 = var1.distanceTo(var2);
         int var7 = RangesKt.coerceAtLeast((int)(var5 * 2), 5);
         int var8 = 0;
         int var10000 = var8;
         if (var3 != null) {
            if (var8 > var7) {
               return null;
            }

            var10000 = var8;
         }

         while (true) {
             var9 = (double)var10000 / var7;
            Vec3 var17 = var1.lerp(var2, var9);
            short var10002 = 15377;
            short var10003 = -21881;
            Intrinsics.checkNotNullExpressionValue(var17, "lerp(...)");
            Vec3 var11 = var17;
            BlockPos var18 = BlockPos.containing(var11);
            var10002 = 15416;
            var10003 = 31230;
            Intrinsics.checkNotNullExpressionValue(var18, "containing(...)");
            BlockPos var12 = var18;
            int var13 = -1;
            var10000 = var13;

            label78: {
               label77:
               while (var10000 < 2) {
                  var10000 = -1;
                  if (var3 == null) {
                     break label78;
                  }

                  int var14 = -1;

                  label74:
                  while (true) {
                     var10000 = var14;

                     label72:
                     while (true) {
                        if (var10000 >= 2) {
                           break label74;
                        }

                        var10000 = 0;
                        if (var3 == null) {
                           continue label77;
                        }

                        int var15 = 0;

                        while (var15 < 2) {
                           BlockPos var22 = var12.offset(var13, var15, var14);
                           var10002 = 15394;
                           var10003 = 8205;
                           Intrinsics.checkNotNullExpressionValue(var22, "offset(...)");
                           BlockPos var16 = var22;
                           if (var3 != null) {
                              var10000 = ((var4.getBlockState(var16).is(Blocks.CACTUS)) ? 1 : 0);
                              if (var3 == null) {
                                 continue label72;
                              }

                              if (var10000 != 0) {
                                 return var16;
                              }

                              var15++;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var14++;
                        if (var3 == null) {
                           break label74;
                        }
                        break;
                     }
                  }

                  var13++;
                  if (var3 == null) {
                     break;
                  }

                  var10000 = var13;
               }

               var10000 = var8;
            }

            if (var10000 == var7) {
               break;
            }

            var8++;
            if (var3 == null) {
               break;
            }

            var10000 = var8;
         }

         return null;
      } else {
         return null;
      }
   }

   private final Vec3 a(Vec3 var1, Vec3 var2, BlockPos var3) { double var9 = 0.0; // PX-FIX hoist
        
      String var4;
      Vec3 var11;
      Vec3 var12;
      boolean var24;
      label77: {
         label80: {
            Vec3 var5 = new Vec3(var3.getX() + 0.5, var1.y, var3.getZ() + 0.5);
            Vec3 var10000 = var2.subtract(var1).normalize();
            short var10002 = 15404;
            short var10003 = 5406;
            Intrinsics.checkNotNullExpressionValue(var10000, "normalize(...)");
            Vec3 var6 = var10000;
            Vec3 var20 = new Vec3(-var6.z, 0.0, var6.x).normalize();
            var10002 = 15382;
            var10003 = -28227;
            Intrinsics.checkNotNullExpressionValue(var20, "normalize(...)");
            Vec3 var7 = var20;
            Vec3 var21 = new Vec3(var6.z, 0.0, -var6.x).normalize();
            var10002 = 15382;
            var10003 = -28227;
            Intrinsics.checkNotNullExpressionValue(var21, "normalize(...)");
            Vec3 var8 = var21;
            String var22 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
             var9 = 3.0;
            Vec3 var10001 = var5.add(var7.scale(var9));
            var10003 = 15412;
            short var10004 = -17852;
            Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
            var11 = var10001;
            var4 = var22;
            Vec3 var23 = var5.add(var8.scale(var9));
            var10002 = 15407;
            var10003 = 25746;
            Intrinsics.checkNotNullExpressionValue(var23, "add(...)");
            var12 = var23;
            var24 = this.a(var11);
            if (var4 != null) {
               if (var24) {
                  break label80;
               }

               var24 = this.c(var11);
            }

            if (var4 == null) {
               break label77;
            }

            if (var24) {
               var24 =( 1 != 0);
               break label77;
            }
         }

         var24 =( 0 != 0);
      }

      boolean var13;
      label66: {
         label81: {
            var13 = (boolean)var24;
            var24 = this.a(var12);
            if (var4 != null) {
               if (var24) {
                  break label81;
               }

               var24 = this.c(var12);
            }

            if (var4 == null) {
               break label66;
            }

            if (var24) {
               var24 = (1 != 0);
               break label66;
            }
         }

         var24 = (0 != 0);
      }

      boolean var14;
      var14 = var24;
      var24 = var13;
      label55:
      if (var4 != null) {
         if (var13) {
            var24 = var14;
            if (var4 == null) {
               break label55;
            }

            if (var14) {
               double var15 = var1.distanceTo(var11) + var11.distanceTo(var2);
               double var17 = var1.distanceTo(var12) + var12.distanceTo(var2);
               Vec3 var19 = var15 < var17 ? var11 : var12;
               String var28;
               if (var15 < var17) {
                  var24 =( 15410 != 0);
                  short var32 = -2548;
                  var28 = "left";
               } else {
                  var24 =( 15405 != 0);
                  short var33 = 11797;
                  var28 = "right";
               }

               short var34 = 15406;
               short var40 = -4952;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§a[SandBot] Added anchor 3 blocks to " + var28
               );
               return var19;
            }
         }

         var24 = var13;
      }

      if (var4 != null) {
         if (var24) {
            var24 =( 15383 != 0);
            short var36 = 8668;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§a[SandBot] Added anchor 3 blocks to left"
            );
            return var11;
         }

         var24 = var14;
      }

      if (var24) {
         var24 =( 15389 != 0);
         short var35 = 32555;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§a[SandBot] Added anchor 3 blocks to right"
         );
         return var12;
      } else {
         return null;
      }
   }

   private final boolean a(Vec3 var1) { int var9 = 0; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         BlockPos var10000 = BlockPos.containing(var1);
         short var10002 = 15398;
         short var10003 = -24600;
         Intrinsics.checkNotNullExpressionValue(var10000, "containing(...)");
         BlockPos var4 = var10000;
         int var5 = -1;

         label63:
         while (true) {
             var9 = var5;

            label60:
            while (var9 < 2) {
               if (var2 == null) {
                  return ((Boolean)(Object)((boolean)(Object)(-1)));
               }

               int var6 = -1;

               label57:
               while (true) {
                  int var11 = var6;

                  label55:
                  while (true) {
                     if (var11 >= 2) {
                        break label57;
                     }

                     var9 = 0;
                     if (var2 == null) {
                        continue label60;
                     }

                     int var7 = 0;

                     while (var7 < 2) {
                        var10000 = var4.offset(var5, var7, var6);
                        var10002 = 15400;
                        var10003 = -29719;
                        Intrinsics.checkNotNullExpressionValue(var10000, "offset(...)");
                        BlockPos var8 = var10000;
                        if (var2 != null) {
                           var11 = ((var3.getBlockState(var8).is(Blocks.CACTUS)) ? 1 : 0);
                           if (var2 == null) {
                              continue label55;
                           }

                           if (var11 != 0) {
                              return true;
                           }

                           var7++;
                        }

                        if (var2 == null) {
                           break;
                        }
                     }

                     var6++;
                     if (var2 == null) {
                        break label57;
                     }
                     break;
                  }
               }

               var5++;
               if (var2 != null) {
                  continue label63;
               }
               break;
            }

            return (0 != 0);
         }
      } else {
         return false;
      }
   }

   private final Vec3 b(Vec3 var1) { int var9 = 0; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         BlockPos var10000 = BlockPos.containing(var1);
         short var10002 = 15398;
         short var10003 = -24600;
         Intrinsics.checkNotNullExpressionValue(var10000, "containing(...)");
         BlockPos var4 = var10000;
         BlockPos var5 = null;
         double var6 = Double.MAX_VALUE;
         int var8 = -1;

         label92:
         while (true) {
            int var21 = var8;

            label89:
            while (true) {
               if (var21 < 2) {
                  if (var2 == null) {
                     break;
                  }

                   var9 = -1;

                  label84:
                  do {
                     int var22 = var9;

                     label81:
                     while (true) {
                        if (var22 >= 2) {
                           break label84;
                        }

                        var21 = 0;
                        if (var2 == null) {
                           continue label89;
                        }

                        int var10 = 0;

                        while (true) {
                           if (var10 >= 2) {
                              break label81;
                           }

                           var10000 = var4.offset(var8, var10, var9);
                           var10002 = 15400;
                           var10003 = -29719;
                           Intrinsics.checkNotNullExpressionValue(var10000, "offset(...)");
                           BlockPos var11 = var10000;
                           label76:
                           if (var2 != null) {
                              var22 = ((var3.getBlockState(var11).is(Blocks.CACTUS)) ? 1 : 0);
                              if (var2 == null) {
                                 break;
                              }

                              if (var22 != 0) {
                                 double var12 = var1.distanceTo(Vec3.atCenterOf(var11));
                                 if (var2 == null) {
                                    break label76;
                                 }

                                 if (var12 < var6) {
                                    var6 = var12;
                                    var5 = var11;
                                 }
                              }

                              var10++;
                           }

                           if (var2 == null) {
                              break label81;
                           }
                        }
                     }

                     var9++;
                  } while (var2 != null);

                  var8++;
                  if (var2 != null) {
                     continue label92;
                  }
               }

               var10000 = var5;
               if (var2 == null) {
                  break label92;
               }

               if (var5 == null) {
                  return null;
               }
               break;
            }

            var10000 = var5;
            break;
         }

         Vec3 var25 = Vec3.atCenterOf(var10000);
         var10002 = 15415;
         var10003 = 23964;
         Intrinsics.checkNotNullExpressionValue(var25, "atCenterOf(...)");
         Vec3 var15 = var25;
         Vec3 var26 = var1.subtract(var15).normalize();
         var10002 = 15382;
         var10003 = -28227;
         Intrinsics.checkNotNullExpressionValue(var26, "normalize(...)");
         Vec3 var16 = var26;
         Double[] var18 = new Double[]{0.8, 1.0, 1.2};
         List var17 = CollectionsKt.listOf(var18);
         Iterator var19 = var17.iterator();

         label49:
         while (var19.hasNext()) {
            double var20 = ((Number)var19.next()).doubleValue();
            Vec3 var27 = var1.add(var16.scale(var20));
            var10002 = 15407;
            var10003 = 25746;
            Intrinsics.checkNotNullExpressionValue(var27, "add(...)");

            Vec3 var14;
            do {
               var14 = var27;
               if (this.a(var14)) {
                  continue label49;
               }

               var27 = var14;
            } while (var2 == null);

            return var14;
         }

         return null;
      } else {
         return null;
      }
   }

   private final boolean b(Vec3 var1, Vec3 var2) {
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         double var5 = var2.y - var1.y;
         double var7;
         int var10000 = (var7 = var5 - 0.3) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
         if (var3 != null) {
            if (var10000 > 0) {
               return true;
            }

            var10000 = 0;
         }

         return (var10000 != 0);
      } else {
         return false;
      }
   }

   private final boolean c(Vec3 var1) { int var9 = 0; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
         ClientLevel var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
         BlockPos var10000 = BlockPos.containing(var1);
         short var10002 = 15398;
         short var10003 = -24600;
         Intrinsics.checkNotNullExpressionValue(var10000, "containing(...)");
         BlockPos var4 = var10000;
         BlockState var12 = var3.getBlockState(var4.below());
         var10002 = 15402;
         var10003 = -6787;
         Intrinsics.checkNotNullExpressionValue(var12, "getBlockState(...)");
         BlockState var5 = var12;
         BlockState var13 = var3.getBlockState(var4);
         var10002 = 15409;
         var10003 = 30494;
         Intrinsics.checkNotNullExpressionValue(var13, "getBlockState(...)");
         BlockState var6 = var13;
         BlockState var14 = var3.getBlockState(var4.above());
         var10002 = 15409;
         var10003 = 30494;
         Intrinsics.checkNotNullExpressionValue(var14, "getBlockState(...)");
         BlockState var7 = var14;
         byte var15 = ((byte)((var5.isAir()) ? 1 : 0));
         if (var2 != null) {
            if (var15 != 0) {
               return false;
            }

            var15 = ((byte)((var6.isAir()) ? 1 : 0));
         }

         label82:
         if (var2 != null) {
            if (var15 == 0) {
               var15 = ((byte)((var6.getBlock().defaultBlockState().canBeReplaced()) ? 1 : 0));
               if (var2 == null) {
                  break label82;
               }

               if (var15 == 0) {
                  return false;
               }
            }

            var15 = ((byte)((var7.isAir()) ? 1 : 0));
         }

         label75:
         if (var2 != null) {
            if (var15 == 0) {
               var15 = ((byte)((var7.getBlock().defaultBlockState().canBeReplaced()) ? 1 : 0));
               if (var2 == null) {
                  break label75;
               }

               if (var15 == 0) {
                  return false;
               }
            }

            var15 = -1;
         }

         int var8 = var15;

         label67:
         while (true) {
            int var16 = var8;

            label64:
            while (var16 < 2) {
               if (var2 == null) {
                  return ((Boolean)(Object)((boolean)(Object)(-1)));
               }

                var9 = -1;

               while (var9 < 2) {
                  var10000 = var4.offset(var8, 1, var9);
                  var10002 = 15400;
                  var10003 = -29719;
                  Intrinsics.checkNotNullExpressionValue(var10000, "offset(...)");
                  BlockPos var10 = var10000;
                  BlockState var19 = var3.getBlockState(var10);
                  var10002 = 15409;
                  var10003 = 30494;
                  Intrinsics.checkNotNullExpressionValue(var19, "getBlockState(...)");
                  BlockState var11 = var19;
                  if (var2 != null) {
                     var16 = ((var11.is(Blocks.CACTUS)) ? 1 : 0);
                     if (var2 == null) {
                        continue label64;
                     }

                     if (var16 != 0) {
                        return false;
                     }

                     var9++;
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               var8++;
               if (var2 != null) {
                  continue label67;
               }
               break;
            }

            return (1 != 0);
         }
      } else {
         return false;
      }
   }

   public final void h() { float var9 = 0.0f; // PX-FIX hoist
        
      Object var69 = null; // PX-FIX
      Object var53 = null; // PX-FIX
      byte var52 = 0; // PX-FIX
      byte var51 = 0; // PX-FIX
      int var49 = 0; // PX-FIX
      Object var48 = null; // PX-FIX
      int var45 = 0; // PX-FIX
      Object var40 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 15411;
      short var10003 = 13375;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", false);
      String var1 = var10000;
      if (var1 != null) {
         label313:
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            boolean var33 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty();
            if (var1 != null) {
               if (var33) {
                  break label313;
               }

               var33 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n();
            }

            if (var33) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               return;
            }

            llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI var34 = this;
            if (var1 != null) {
               if (this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI != null) {
                  this.k();
               }

               this.j();
               var34 = this;
            }

            int var35 = ((var34.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
            if (var1 != null) {
               if (var35 != 0) {
                  this.g();
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.i();
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
               }

               var35 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
            }

            if (var1 != null) {
               if (var35 != 0) {
                  short var54 = 15413;
                  short var61 = 9320;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "§c[SandBot] No valid path generated, fix waypoints or contact support."
                  );
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
                  return;
               }

               var35 = ((java.util.function.Supplier<Integer>)(() -> { this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(2000); return 0; })).get();
            }

            label341: {
               if (var1 != null) {
                  if (var35 == 0) {
                     break label341;
                  }

                  var35 = this.i();
               }

               int var2 = var35;
               Vec3 var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var2).a();
               double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var3, false);
               if (var1 == null || var4 > 4.0) {
                  short var36 = 15403;
                  short var10001 = 28408;
                  String var7 = "%.1f";
                  Object[] var8 = new Object[]{var4};
                  var10000 = String.format(var7, Arrays.copyOf(var8, var8.length));
                  var10002 = 15376;
                  var10003 = -27475;
                  Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
                  var10001 = 15393;
                  var10002 = 24530;
                  var10002 = 15423;
                  var10003 = 18688;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§e[SandBot] Off-route detected! Resyncing... (" + var10000 + "m from path)"
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

            Vec3 var17 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            int var38 = ((java.util.function.Supplier<Integer>)(() -> { this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(1000); return 0; })).get();
            if (var1 != null) {
               if (var38 != 0) {
                  label281: {
                     label280: {
                        label322: {
                           double var18 = var17.distanceTo(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
                           double var72;
                           int var39 = (var72 = var18 - 0.2) == 0.0 ? 0 : (var72 < 0.0 ? -1 : 1);
                           if (var1 != null) {
                              if (var39 >= 0) {
                                 break label322;
                              }

                              var39 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                           }

                           int var5 = var39;
                           this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var5 + 1;
                           var40 = this;
                           if (var1 == null) {
                              break label281;
                           }

                           if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll < 3) {
                              break label280;
                           }

                           short var41 = 15420;
                           short var56 = 31804;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "§c[SandBot] Stuck detected! Finding nearest path point..."
                           );
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.i();
                           this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                           me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .g();
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .p();
                           if (var1 != null) {
                              break label280;
                           }
                        }

                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                     }

                     var40 = this;
                  }

                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var17;
               }

               var38 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4)
                  % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
            }

            label340: {
               int var19 = var38;
               double var20 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var19).a(), false);
               double var73;
               int var42 = (var73 = var20 - 1.75) == 0.0 ? 0 : (var73 < 0.0 ? -1 : 1);
               if (var1 != null) {
                  if (var42 < 0) {
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = (
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + 4
                        )
                        % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
                  }

                  var10000 = String.valueOf(me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
                  if (var1 == null) {
                     break label340;
                  }

                  var42 = ((me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .i()) ? 1 : 0);
               }

               if (var42 == 0) {
                  label255: {
                     byte var44 = ((byte)((this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) ? 1 : 0));
                     if (var1 != null) {
                        if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
                           var45 = 10;
                           break label255;
                        }

                        var44 = 8;
                     }

                     var45 = var44 + Random.Default.nextInt(4);
                  }

                  int var6 = var45;
                  int var22 = (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var6)
                     % this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
                  Vec3 var25 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var22).a();
                   var9 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var25)
                     .a();
                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
                     new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                        var9,
                        this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI + (float)Random.Default.nextLong(-2L, 2L)
                     )
                  );
               }

               var10000 = String.valueOf(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var19));
            }

            Vec3 var21 = ((llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(Object)var10000)
               .a();
            llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI var46 = this;
            if (var1 != null) {
               label245: {
                  if (this.a(var21)) {
                     Vec3 var23 = this.b(var21);
                     if (var1 == null) {
                        break label245;
                     }

                     if (var23 != null) {
                        var21 = var23;
                     }
                  }

                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var21,
                     false);
               }

               var46 = this;
            }

            LocalPlayer var47 = var46.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
            Intrinsics.checkNotNull(var46.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player);
            double var24 = var47.getY();
            if (var1 != null) {
               if (var24 > this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl + 0.2) {
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
               }

               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var24;
            }

            label326: {
               List var26 = this.a(5);
               var var11 = var26;
               boolean var12 = false;
               var48 = var11;
               label237:
               if (var1 != null) {
                  if (var11 instanceof Collection) {
                     var48 = (Collection)var11;
                     if (var1 == null) {
                        break label237;
                     }

                     if (((me.octo.client.PXDyn)var48).isEmpty()) {
                        var49 = 0;
                        break label326;
                     }
                  }

                  var48 = var11;
               }

               Iterator var13 = ((me.octo.client.PXDyn)var48).iterator();

               label228:
               while (true) {
                  if (!var13.hasNext()) {
                     var49 = 0;
                     break;
                  }

                  Object var14 = var13.next();
                  llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var15 = (llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var14;
                  boolean var16 = false;
                  var49 = ((var15.b()) ? 1 : 0);

                  while (true) {
                     label224: {
                        label329: {
                           if (var1 != null) {
                              if (var49 == 0) {
                                 break label329;
                              }

                              double var74;
                              var49 = (
                                       var74 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a(var15.a(), false)
                                          - 2.5
                                    )
                                    == 0.0
                                 ? 0
                                 : (var74 < 0.0 ? -1 : 1);
                           }

                           if (var1 != null) {
                              if (var49 >= 0) {
                                 break label329;
                              }

                              double var75;
                              var49 = (var75 = var15.a().y - (var24 + 0.1)) == 0.0 ? 0 : (var75 < 0.0 ? -1 : 1);
                           }

                           if (var1 == null) {
                              break label224;
                           }

                           if (var49 > 0) {
                              var49 = 1;
                              break label224;
                           }
                        }

                        var49 = 0;
                     }

                     if (var49 == 0) {
                        break;
                     }

                     var49 = 1;
                     if (var1 != null) {
                        break label228;
                     }
                  }
               }
            }

            int var10;
            byte var27;
            var10 = var49;
            LocalPlayer var50 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player;
            Intrinsics.checkNotNull(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.player);
            var27 = ((byte)((var50.horizontalCollision) ? 1 : 0));
            var51 = var27;
            label201:
            if (var1 != null) {
               if (var27 != 0) {
                  var51 = ((byte)((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0));
                  if (var1 == null) {
                     break label201;
                  }

                  if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                     this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
                  }
               }

               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = (var27 != 0);
               var51 = var27;
            }

            label194: {
               label330: {
                  if (var1 != null) {
                     if (var51 == 0) {
                        break label330;
                     }

                     var51 = ((java.util.function.Supplier<Byte>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(200); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label194;
                  }

                  if (var51 != 0) {
                     var51 = 1;
                     break label194;
                  }
               }

               var51 = 0;
            }

            byte var28;
            var28 = var51;
            var52 = var27;
            label183:
            if (var1 != null) {
               if (var27 != 0) {
                  var52 = ((java.util.function.Supplier<Byte>)(() -> { this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(500); return 0; })).get();
                  if (var1 == null) {
                     break label183;
                  }

                  if (var52 != 0) {
                     int var29 = this.i();
                     Vec3 var31 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var29).a();
                     double var32 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var31, false);
                     double var76;
                     var52 = (byte)((var76 = ((byte)((var32 - 3.0 != 0.0) ? 1 : 0))) == (byte)((0.0 != 0) ? 0 : (var76 < 0.0 ? -1 : 1)) ? 1 : 0);
                     if (var1 == null) {
                        break label183;
                     }

                     if (var52 < 0) {
                        this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var29;
                     }
                  }
               }

               var52 =(byte)( var10);
            }

            label173: {
               label331: {
                  label171:
                  if (var1 != null) {
                     if (var52 == 0) {
                        var52 = var28;
                        if (var1 == null) {
                           break label171;
                        }

                        if (var28 == 0) {
                           break label331;
                        }
                     }

                     var52 = ((java.util.function.Supplier<Byte>)(() -> { this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(400); return 0; })).get();
                  }

                  if (var1 == null) {
                     break label173;
                  }

                  if (var52 != 0) {
                     var52 = 1;
                     break label173;
                  }
               }

               var52 = 0;
            }

            label158: {
               label332: {
                  int var30 = var52;
                  short var57 = 15414;
                  var10002 = 13120;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("jump", (var30 != 0));
                  var57 = 15380;
                  var10002 = -3025;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sprint", true);
                  var57 = 15381;
                  var10002 = -9055;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sneak", false);
                  var53 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  var57 = 15419;
                  var10002 = -28147;
                  var69 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .j();
                  if (var1 != null) {
                     if (((Boolean)(var69))) {
                        break label332;
                     }

                     var69 = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
                  }

                  if (var1 == null) {
                     break label158;
                  }

                  if (!((Boolean)var69)) {
                     var69 = true;
                     break label158;
                  }
               }

               var69 = false;
            }

            ((me.octo.client.PXDyn)var53).a("attack", var69);
            return;
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
      }
   }

   private final List<llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      int var1
   ) {
      ArrayList var7 = null; // PX-FIX
      ArrayList var3 = new ArrayList();
      int var4 = 0;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
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

      return (List<llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var7;
   }

   private final int i() {
       int var9 = 0; // PX-FIX decl var9
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var2 = 0;
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

   private final void j() { me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
        
      Object var8 = null; // PX-FIX
      Object var7 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      int var10000 = ((this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) ? 1 : 0);
      if (var1 != null) {
         if (this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) {
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
         label126: {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
            if (var1 != null) {
               if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
                  var10000 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.b();
                  break label126;
               }

               if (var1 == null) {
                  return;
               }

               var5 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
               var10001 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
            }

            if (var10001 == null) {
               return;
            }

            var10000 = var5.b();
         }

         int var2;
         var2 = var10000;
         var7 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         label97:
         if (var1 != null) {
            label95: {
               if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
                  var8 = this;
                  if (var1 == null) {
                     break label95;
                  }

                  if (this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl != null) {
                     var7 = ((java.util.function.Supplier<Object>)(() -> { this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.a(30500); return null; })).get();
                     if (var1 == null) {
                        break label97;
                     }

                     if (((Boolean)(var7))) {
                        this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = true;
                         var9 = me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        Function0 var10002 = null;
                        me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10003 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
                        Intrinsics.checkNotNull(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl);
                        var9.a(2, var10002, CollectionsKt.listOf(var10003.b()), var2);
                        return;
                     }
                  }
               }

               var8 = this;
            }

            var7 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         }

         label129: {
            label83:
            if (var1 != null) {
               label81: {
                  if (((Boolean)(var7))) {
                     var10 = this;
                     if (var1 == null) {
                        break label81;
                     }

                     if (this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll != null) {
                        long var3 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ? 30500L : 20500L;
                        var7 = ((java.util.function.Supplier<Object>)(() -> { this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.a(var3); return null; })).get();
                        if (var1 == null) {
                           break label83;
                        }

                        if (((Boolean)(var7))) {
                           this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = true;
                           me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           Function0 var13 = null;
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var15 = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
                           Intrinsics.checkNotNull(this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll);
                           var11.a(2, var13, CollectionsKt.listOf(var15.b()), var2);
                           return;
                        }
                     }
                  }

                  var10 = this;
               }

               if (var1 == null) {
                  break label129;
               }

               var7 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            }

            if (!((Boolean)var7)) {
               return;
            }

            var10 = this;
         }

         if (var1 != null) {
            if (this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII == null) {
               return;
            }

            var10 = this;
         }

         if (var1 != null) {
            if (!(Boolean)((me.octo.client.PXDyn)(Object)this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII).a(30000)) {
               return;
            }

            var10 = this;
         }

         this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = true;
         me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Function0 var14 = null;
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
         Intrinsics.checkNotNull(this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII);
         var12.a(2, var14, CollectionsKt.listOf(var16.b()), var2);
      }
   }

   private final void k() { me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
        
      Object var14 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a(
         me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false)) {
         if (this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI == null) {
            return;
         }

         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
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
         if (var1 != null && this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            boolean var7 = false;
            var4.add(var6.b());
         }

         if (this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
            boolean var10 = false;
            var4.add(var8.b());
         }

         var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o();
         if (var10000 != null) {
             var9 = var10000;
            boolean var11 = false;
            if (var1 != null && var3.b() != var9.b()) {
               var4.add(var9.b());
            }
         }

         label44: {
            var4.add(var3.b());
            me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .w();
            var10000 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
            if (var1 != null) {
               if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
                  var14 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.b();
                  break label44;
               }

               var10000 = var2;
            }

            var14 = var10000.b();
         }

         int var5 =((Integer)( var14));
         me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(2, llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI::p, CollectionsKt.toList(var4), var5);
      }
   }

   public final void a(
      @NotNull List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1,
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
   ) {
      short var10001 = 15421;
      short var10002 = -30082;
      Intrinsics.checkNotNullParameter(var1, "startWaypoints");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.addAll(var1);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.f();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
      String var3 = var10000;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w()
         .y;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var2;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .q();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         false);
      llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI var5 = this;
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      if (var3 != null) {
         this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var7;
         this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = false;
         var5 = this;
         if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
            var10002 = 15399;
            short var10003 = -11897;
            var7 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("Rogue Sword");
         } else {
            var7 = null;
         }
      }

      label36: {
         var5.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var7;
         llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI var6 = this;
         if (var3 != null) {
            if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
               var10001 = 15392;
               var10002 = -30248;
               me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("Weirder Tuba");
               if (var3 != null) {
                  if (var4 != null) {
                     this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var4;
                     this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = true;
                     if (var3 != null) {
                        break label36;
                     }
                  }

                  var10002 = 15401;
                  short var12 = -410;
                  this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("Weird Tuba");
                  this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
               }

               if (var3 != null) {
                  break label36;
               }
            }

            this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = null;
            var6 = this;
         }

         var6.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
      }

      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
         ? me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .s()
         : null;
   }

   public final void l() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      short var10001 = 15395;
      short var10002 = 3999;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("attack", false);
      var10001 = 15388;
      var10002 = 6156;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sprint", false);
      var10001 = 15378;
      var10002 = -25832;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("jump", false);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
   }

   @NotNull
   public final List<Vec3> m() { llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null; // PX-FIX hoist
        
      Collection var12 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Iterable var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      boolean var3 = false;
      Collection var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      boolean var6 = false;
      String var1 = var10000;
      Iterator var7 = var2.iterator();

      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var12 = var5;
             var9 = (llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8;
            if (var1 == null) {
               break;
            }

            boolean var10 = false;
            var5.add(var9.a());
            if (var1 != null) {
               continue;
            }
         }

         var12 = var5;
         break;
      }

      return (List<Vec3>)var12;
   }

   public final int n() { double var9 = 0.0; // PX-FIX hoist
        
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

   public final int o() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   private static final Unit a(llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI var0) {
      var0.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = false;
      var0.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.f();
      return Unit.INSTANCE;
   }

   private static final Unit b(llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI var0) {
      var0.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = false;
      var0.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.f();
      return Unit.INSTANCE;
   }

   private static final Unit c(llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI var0) {
      var0.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = false;
      var0.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.f();
      return Unit.INSTANCE;
   }

   private static final Unit p() {
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .x();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[42];
      int var3 = 0;
      String var2 = "\u009f\u0093$\u0011\u0004Üi2Cç\u0088÷\u0000uï³g\u009d\u0019\u009f\u0087#\\±\u0091=\u0099&\u009e\u0081Ý§\"u\u001a\u0003bp>\r\naL%k¢«\u0011\u0085º\u0083ú\u0019,Õ\u000e\u0093Þo}\u0005)é<¹ó\u0019£|¦\b\u000e\u008d7Nñc;æ\u000f¸àÆ¼L\u0083\u008f°\u009e\u0093b'æáV\u0004h\u0086\u0098D\u0012\u0006Ñà\u008e[\u001d)\u0002\u0090íuâ/NJ#S\u0099\u0004JsÕó\u0005ÚÆü%ì\u0004°¯Nw\u000eÎ¹z\u0080§Ò¯Ö!<\fº\u0018G9\u008f\u0007&\u0083D\u008eaxB®¨Þ\u0019K'\u0019\u008b3Â\u008e\u00045ðÄK×(ò\u000eúþ@Ä'{/c{\u0091\u0005³/\u00831%\\\u007f\u0007õ½\u001c\u007fP\u000e.ÕH\fÕ/Ã\u008cliïÕQo0ï\u0007O¨èC(\u0004s\n±Ì¬FyXø¯Æú\u000fFývvÝôXû/\u0083Q\u0004\u0080\u0085\u009a\u0006ÍS_Î£V\r;\u0092ózCÖxH\u009d\u0080I\u0090\"1l·ZSË\u0094\u0090;|ÆoÓûð$14¤\u000e£è£±K4\u00818\u001c\u007fé¾IÜc\t\u0006\u0019ùxeã\u0000\r\u0093÷¶S/Ç\u001d\u009cZX\\\u001b\u008er1ïÑ\\\u0002¹É\r\u007f\u0088:\u001aûÆ=\u0014¢¯È±õ¤\u000b<Ó'²Û\u0004!\u009b\u009bGª\u000f\u008aÅïqî\u0014>çã\u0000Èt³\u008bü.Ó\u0092\u00ad÷5\u0000O©\u0087\u0094\u0010\u0099\u0012±ÊX^ÓS%\u00146ÆX{v_³É\u0001\u000e×G\u0012Cºò½«\u0007ÿ\u00ad\u0012\u0099VÏ\fUÔ¡\u001eÅ3âÇÝv8¥\u0006\u007fö\tziÀ\u000b°\u0082-¶»\u0016V^ Ñù\u0005/\u0011a1\u0002\u000eé\u001f33êc¹¿ÿ5't\u0088\u008c\b\u0091ªÄª\u008fÿôu%\u0002\u008c\u0097°rè§´\u009a7³íh=HÃZ®\u00136\u008cE\u0018`\u009eÒ~\u00adÏ\u001d¤u9!\u008e'â\n¦àß\u0098\n¦=ÍòÜ\u000b%\u009e\u009f5íf\u009cPy\u0010Ò\u0004¦Û»É\u0012ô\u0092¾æ\u0090\u0010P£¿Ù\u0090d\u0093\u009eÝ9¡Ú\u0005ð¦¹)D\u0006\u0017_RÃÉá)\u0005\u0084w±nÈ$°ê·½ý©?p\u0083]¦ó7\u0090e\u009bdîRp½\u000e\u001f\u009c5>)n&þõ¡è \u000ed\u0085\u0082`Ü\t\u007fò'\u009c<Aë*\t`@@\u008eÍ(z\u0088d\u000b¨Ô\u0012JÎT|\u0016eØQ\u0010\u0092ur\u0011\u000b\u0098v'³\u0015\u008fT¿Iz\u0002\u0004àn\u0089Y";
      int var4 = "\u009f\u0093$\u0011\u0004Üi2Cç\u0088÷\u0000uï³g\u009d\u0019\u009f\u0087#\\±\u0091=\u0099&\u009e\u0081Ý§\"u\u001a\u0003bp>\r\naL%k¢«\u0011\u0085º\u0083ú\u0019,Õ\u000e\u0093Þo}\u0005)é<¹ó\u0019£|¦\b\u000e\u008d7Nñc;æ\u000f¸àÆ¼L\u0083\u008f°\u009e\u0093b'æáV\u0004h\u0086\u0098D\u0012\u0006Ñà\u008e[\u001d)\u0002\u0090íuâ/NJ#S\u0099\u0004JsÕó\u0005ÚÆü%ì\u0004°¯Nw\u000eÎ¹z\u0080§Ò¯Ö!<\fº\u0018G9\u008f\u0007&\u0083D\u008eaxB®¨Þ\u0019K'\u0019\u008b3Â\u008e\u00045ðÄK×(ò\u000eúþ@Ä'{/c{\u0091\u0005³/\u00831%\\\u007f\u0007õ½\u001c\u007fP\u000e.ÕH\fÕ/Ã\u008cliïÕQo0ï\u0007O¨èC(\u0004s\n±Ì¬FyXø¯Æú\u000fFývvÝôXû/\u0083Q\u0004\u0080\u0085\u009a\u0006ÍS_Î£V\r;\u0092ózCÖxH\u009d\u0080I\u0090\"1l·ZSË\u0094\u0090;|ÆoÓûð$14¤\u000e£è£±K4\u00818\u001c\u007fé¾IÜc\t\u0006\u0019ùxeã\u0000\r\u0093÷¶S/Ç\u001d\u009cZX\\\u001b\u008er1ïÑ\\\u0002¹É\r\u007f\u0088:\u001aûÆ=\u0014¢¯È±õ¤\u000b<Ó'²Û\u0004!\u009b\u009bGª\u000f\u008aÅïqî\u0014>çã\u0000Èt³\u008bü.Ó\u0092\u00ad÷5\u0000O©\u0087\u0094\u0010\u0099\u0012±ÊX^ÓS%\u00146ÆX{v_³É\u0001\u000e×G\u0012Cºò½«\u0007ÿ\u00ad\u0012\u0099VÏ\fUÔ¡\u001eÅ3âÇÝv8¥\u0006\u007fö\tziÀ\u000b°\u0082-¶»\u0016V^ Ñù\u0005/\u0011a1\u0002\u000eé\u001f33êc¹¿ÿ5't\u0088\u008c\b\u0091ªÄª\u008fÿôu%\u0002\u008c\u0097°rè§´\u009a7³íh=HÃZ®\u00136\u008cE\u0018`\u009eÒ~\u00adÏ\u001d¤u9!\u008e'â\n¦àß\u0098\n¦=ÍòÜ\u000b%\u009e\u009f5íf\u009cPy\u0010Ò\u0004¦Û»É\u0012ô\u0092¾æ\u0090\u0010P£¿Ù\u0090d\u0093\u009eÝ9¡Ú\u0005ð¦¹)D\u0006\u0017_RÃÉá)\u0005\u0084w±nÈ$°ê·½ý©?p\u0083]¦ó7\u0090e\u009bdîRp½\u000e\u001f\u009c5>)n&þõ¡è \u000ed\u0085\u0082`Ü\t\u007fò'\u009c<Aë*\t`@@\u008eÍ(z\u0088d\u000b¨Ô\u0012JÎT|\u0016eØQ\u0010\u0092ur\u0011\u000b\u0098v'³\u0015\u008fT¿Iz\u0002\u0004àn\u0089Y"
         .length();
      char var1 = 'F';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 78;
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
                     case 0 -> 75;
                     case 1 -> 71;
                     case 2 -> 49;
                     case 3 -> 80;
                     case 4 -> 112;
                     case 5 -> 36;
                     default -> 73;
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
                     b = new String[42];
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

                  var2 = "¢4aEN´ÂÝÔø\u0098öï¼Z\u0011ú\u0016åÃ°\u0019}\tÐ\u001dU¶H\u009c¶§\u0099\u0099xÒÞ\u0097K\u009a\u000e\u008e\u0006\u0004?Ò-;Þ";
                  var4 = "¢4aEN´ÂÝÔø\u0098öï¼Z\u0011ú\u0016åÃ°\u0019}\tÐ\u001dU¶H\u009c¶§\u0099\u0099xÒÞ\u0097K\u009a\u000e\u008e\u0006\u0004?Ò-;Þ".length();
                  var1 = '*';
                  var8 = -1;
            }

            var10000 = 104;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15413) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 53;
            case 1 -> 104;
            case 2 -> 42;
            case 3 -> 186;
            case 4 -> 211;
            case 5 -> 47;
            case 6 -> 210;
            case 7 -> 8;
            case 8 -> 82;
            case 9 -> 76;
            case 10 -> 29;
            case 11 -> 218;
            case 12 -> 98;
            case 13 -> 39;
            case 14 -> 171;
            case 15 -> 127;
            case 16 -> 21;
            case 17 -> 194;
            case 18 -> 206;
            case 19 -> 195;
            case 20 -> 66;
            case 21 -> 142;
            case 22 -> 138;
            case 23 -> 215;
            case 24 -> 6;
            case 25 -> 223;
            case 26 -> 115;
            case 27 -> 40;
            case 28 -> 94;
            case 29 -> 139;
            case 30 -> 146;
            case 31 -> 208;
            case 32 -> 154;
            case 33 -> 99;
            case 34 -> 229;
            case 35 -> 35;
            case 36 -> 96;
            case 37 -> 81;
            case 38 -> 120;
            case 39 -> 184;
            case 40 -> 106;
            case 41 -> 71;
            case 42 -> 189;
            case 43 -> 165;
            case 44 -> 32;
            case 45 -> 111;
            case 46 -> 207;
            case 47 -> 60;
            case 48 -> 149;
            case 49 -> 172;
            case 50 -> 238;
            case 51 -> 49;
            case 52 -> 155;
            case 53 -> 221;
            case 54 -> 105;
            case 55 -> 58;
            case 56 -> 4;
            case 57 -> 28;
            case 58 -> 204;
            case 59 -> 63;
            case 60 -> 224;
            case 61 -> 116;
            case 62 -> 79;
            case 63 -> 232;
            case 64 -> 247;
            case 65 -> 197;
            case 66 -> 70;
            case 67 -> 222;
            case 68 -> 244;
            case 69 -> 250;
            case 70 -> 123;
            case 71 -> 180;
            case 72 -> 19;
            case 73 -> 248;
            case 74 -> 167;
            case 75 -> 11;
            case 76 -> 48;
            case 77 -> 163;
            case 78 -> 200;
            case 79 -> 141;
            case 80 -> 209;
            case 81 -> 88;
            case 82 -> 205;
            case 83 -> 91;
            case 84 -> 143;
            case 85 -> 34;
            case 86 -> 196;
            case 87 -> 84;
            case 88 -> 101;
            case 89 -> 52;
            case 90 -> 230;
            case 91 -> 135;
            case 92 -> 118;
            case 93 -> 0;
            case 94 -> 54;
            case 95 -> 145;
            case 96 -> 236;
            case 97 -> 174;
            case 98 -> 124;
            case 99 -> 87;
            case 100 -> 159;
            case 101 -> 126;
            case 102 -> 188;
            case 103 -> 50;
            case 104 -> 80;
            case 105 -> 125;
            case 106 -> 182;
            case 107 -> 108;
            case 108 -> 102;
            case 109 -> 57;
            case 110 -> 140;
            case 111 -> 2;
            case 112 -> 151;
            case 113 -> 201;
            case 114 -> 173;
            case 115 -> 255;
            case 116 -> 112;
            case 117 -> 22;
            case 118 -> 86;
            case 119 -> 227;
            case 120 -> 75;
            case 121 -> 89;
            case 122 -> 132;
            case 123 -> 92;
            case 124 -> 242;
            case 125 -> 190;
            case 126 -> 177;
            case 127 -> 73;
            case 128 -> 78;
            case 129 -> 5;
            case 130 -> 1;
            case 131 -> 55;
            case 132 -> 41;
            case 133 -> 10;
            case 134 -> 85;
            case 135 -> 219;
            case 136 -> 178;
            case 137 -> 72;
            case 138 -> 15;
            case 139 -> 245;
            case 140 -> 134;
            case 141 -> 161;
            case 142 -> 56;
            case 143 -> 252;
            case 144 -> 20;
            case 145 -> 119;
            case 146 -> 18;
            case 147 -> 241;
            case 148 -> 157;
            case 149 -> 234;
            case 150 -> 36;
            case 151 -> 38;
            case 152 -> 69;
            case 153 -> 233;
            case 154 -> 43;
            case 155 -> 239;
            case 156 -> 251;
            case 157 -> 199;
            case 158 -> 130;
            case 159 -> 166;
            case 160 -> 44;
            case 161 -> 25;
            case 162 -> 61;
            case 163 -> 114;
            case 164 -> 37;
            case 165 -> 16;
            case 166 -> 3;
            case 167 -> 26;
            case 168 -> 254;
            case 169 -> 129;
            case 170 -> 23;
            case 171 -> 168;
            case 172 -> 95;
            case 173 -> 226;
            case 174 -> 179;
            case 175 -> 203;
            case 176 -> 202;
            case 177 -> 46;
            case 178 -> 246;
            case 179 -> 153;
            case 180 -> 243;
            case 181 -> 51;
            case 182 -> 131;
            case 183 -> 152;
            case 184 -> 103;
            case 185 -> 12;
            case 186 -> 136;
            case 187 -> 113;
            case 188 -> 45;
            case 189 -> 192;
            case 190 -> 176;
            case 191 -> 217;
            case 192 -> 33;
            case 193 -> 193;
            case 194 -> 187;
            case 195 -> 214;
            case 196 -> 128;
            case 197 -> 216;
            case 198 -> 225;
            case 199 -> 170;
            case 200 -> 100;
            case 201 -> 68;
            case 202 -> 65;
            case 203 -> 198;
            case 204 -> 59;
            case 205 -> 90;
            case 206 -> 164;
            case 207 -> 160;
            case 208 -> 67;
            case 209 -> 144;
            case 210 -> 158;
            case 211 -> 121;
            case 212 -> 24;
            case 213 -> 14;
            case 214 -> 97;
            case 215 -> 117;
            case 216 -> 62;
            case 217 -> 74;
            case 218 -> 213;
            case 219 -> 253;
            case 220 -> 212;
            case 221 -> 183;
            case 222 -> 77;
            case 223 -> 147;
            case 224 -> 249;
            case 225 -> 181;
            case 226 -> 228;
            case 227 -> 13;
            case 228 -> 9;
            case 229 -> 137;
            case 230 -> 133;
            case 231 -> 148;
            case 232 -> 31;
            case 233 -> 30;
            case 234 -> 162;
            case 235 -> 235;
            case 236 -> 156;
            case 237 -> 110;
            case 238 -> 107;
            case 239 -> 175;
            case 240 -> 64;
            case 241 -> 231;
            case 242 -> 169;
            case 243 -> 93;
            case 244 -> 17;
            case 245 -> 27;
            case 246 -> 109;
            case 247 -> 150;
            case 248 -> 122;
            case 249 -> 220;
            case 250 -> 7;
            case 251 -> 191;
            case 252 -> 237;
            case 253 -> 240;
            case 254 -> 185;
            default -> 83;
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
      // PX-FIX RC4-50: masked default-arg constructor restored from jar bytecode (descriptor (Lnet/minecraft/world/phys/Vec3;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V)
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(net.minecraft.world.phys.Vec3 p1, boolean p2, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
      if ((mask & 2) != 0) { p2 = false; }
      this(p1, p2);
      }
      // PX-FIX RC4-50: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Lme/octo/client/llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll self, net.minecraft.world.phys.Vec3 p1, boolean p2, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return self.a(p1, p2);
      }
      @NotNull
      private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull Vec3 var1, boolean var2) {
         short var10001 = -12039;
         short var10002 = 29086;
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
      public final llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull Vec3 var1, boolean var2
      ) {
         short var10001 = -12037;
         short var10002 = 29856;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return new llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -12038;
         short var10003 = 13577;
         var10003 = -12040;
         short var10004 = -1128;
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
               var10000 instanceof llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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
         String var2 = "A4\u00ad\u000e\u0012Aä(/á\u0011U\u008d©\u001en µ";
         int var4 = "A4\u00ad\u000e\u0012Aä(/á\u0011U\u008d©\u001en µ".length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 98;
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
                        case 0 -> 39;
                        case 1 -> 113;
                        case 2 -> 66;
                        case 3 -> 37;
                        case 4 -> 127;
                        case 5 -> 100;
                        default -> 6;
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

                     var2 = "\u0010l\u0011\u0007åÜayéü\u0091";
                     var4 = "\u0010l\u0011\u0007åÜayéü\u0091".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 118;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -12037) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 65;
               case 1 -> 255;
               case 2 -> 247;
               case 3 -> 242;
               case 4 -> 44;
               case 5 -> 49;
               case 6 -> 188;
               case 7 -> 182;
               case 8 -> 42;
               case 9 -> 206;
               case 10 -> 40;
               case 11 -> 244;
               case 12 -> 84;
               case 13 -> 19;
               case 14 -> 200;
               case 15 -> 239;
               case 16 -> 222;
               case 17 -> 127;
               case 18 -> 173;
               case 19 -> 51;
               case 20 -> 191;
               case 21 -> 79;
               case 22 -> 141;
               case 23 -> 23;
               case 24 -> 193;
               case 25 -> 167;
               case 26 -> 55;
               case 27 -> 131;
               case 28 -> 234;
               case 29 -> 153;
               case 30 -> 185;
               case 31 -> 39;
               case 32 -> 100;
               case 33 -> 1;
               case 34 -> 71;
               case 35 -> 103;
               case 36 -> 151;
               case 37 -> 77;
               case 38 -> 209;
               case 39 -> 18;
               case 40 -> 227;
               case 41 -> 45;
               case 42 -> 122;
               case 43 -> 146;
               case 44 -> 111;
               case 45 -> 43;
               case 46 -> 81;
               case 47 -> 113;
               case 48 -> 57;
               case 49 -> 157;
               case 50 -> 97;
               case 51 -> 253;
               case 52 -> 105;
               case 53 -> 10;
               case 54 -> 168;
               case 55 -> 152;
               case 56 -> 186;
               case 57 -> 66;
               case 58 -> 190;
               case 59 -> 123;
               case 60 -> 197;
               case 61 -> 93;
               case 62 -> 160;
               case 63 -> 52;
               case 64 -> 150;
               case 65 -> 109;
               case 66 -> 171;
               case 67 -> 196;
               case 68 -> 199;
               case 69 -> 129;
               case 70 -> 64;
               case 71 -> 208;
               case 72 -> 58;
               case 73 -> 195;
               case 74 -> 174;
               case 75 -> 95;
               case 76 -> 46;
               case 77 -> 83;
               case 78 -> 67;
               case 79 -> 94;
               case 80 -> 223;
               case 81 -> 187;
               case 82 -> 114;
               case 83 -> 125;
               case 84 -> 61;
               case 85 -> 143;
               case 86 -> 204;
               case 87 -> 2;
               case 88 -> 155;
               case 89 -> 41;
               case 90 -> 163;
               case 91 -> 6;
               case 92 -> 243;
               case 93 -> 238;
               case 94 -> 91;
               case 95 -> 212;
               case 96 -> 228;
               case 97 -> 226;
               case 98 -> 225;
               case 99 -> 213;
               case 100 -> 47;
               case 101 -> 78;
               case 102 -> 189;
               case 103 -> 210;
               case 104 -> 17;
               case 105 -> 216;
               case 106 -> 217;
               case 107 -> 169;
               case 108 -> 205;
               case 109 -> 92;
               case 110 -> 202;
               case 111 -> 75;
               case 112 -> 70;
               case 113 -> 248;
               case 114 -> 252;
               case 115 -> 120;
               case 116 -> 124;
               case 117 -> 27;
               case 118 -> 28;
               case 119 -> 148;
               case 120 -> 156;
               case 121 -> 224;
               case 122 -> 107;
               case 123 -> 229;
               case 124 -> 87;
               case 125 -> 245;
               case 126 -> 16;
               case 127 -> 13;
               case 128 -> 29;
               case 129 -> 172;
               case 130 -> 139;
               case 131 -> 12;
               case 132 -> 31;
               case 133 -> 178;
               case 134 -> 180;
               case 135 -> 145;
               case 136 -> 88;
               case 137 -> 118;
               case 138 -> 21;
               case 139 -> 99;
               case 140 -> 133;
               case 141 -> 56;
               case 142 -> 158;
               case 143 -> 233;
               case 144 -> 69;
               case 145 -> 115;
               case 146 -> 26;
               case 147 -> 218;
               case 148 -> 53;
               case 149 -> 154;
               case 150 -> 119;
               case 151 -> 251;
               case 152 -> 211;
               case 153 -> 176;
               case 154 -> 63;
               case 155 -> 207;
               case 156 -> 192;
               case 157 -> 138;
               case 158 -> 86;
               case 159 -> 134;
               case 160 -> 128;
               case 161 -> 68;
               case 162 -> 220;
               case 163 -> 236;
               case 164 -> 254;
               case 165 -> 183;
               case 166 -> 221;
               case 167 -> 25;
               case 168 -> 4;
               case 169 -> 7;
               case 170 -> 184;
               case 171 -> 38;
               case 172 -> 96;
               case 173 -> 159;
               case 174 -> 162;
               case 175 -> 231;
               case 176 -> 5;
               case 177 -> 246;
               case 178 -> 60;
               case 179 -> 194;
               case 180 -> 0;
               case 181 -> 144;
               case 182 -> 166;
               case 183 -> 250;
               case 184 -> 102;
               case 185 -> 8;
               case 186 -> 241;
               case 187 -> 161;
               case 188 -> 112;
               case 189 -> 230;
               case 190 -> 37;
               case 191 -> 214;
               case 192 -> 50;
               case 193 -> 36;
               case 194 -> 24;
               case 195 -> 147;
               case 196 -> 179;
               case 197 -> 54;
               case 198 -> 240;
               case 199 -> 149;
               case 200 -> 126;
               case 201 -> 140;
               case 202 -> 177;
               case 203 -> 135;
               case 204 -> 11;
               case 205 -> 80;
               case 206 -> 90;
               case 207 -> 30;
               case 208 -> 9;
               case 209 -> 72;
               case 210 -> 130;
               case 211 -> 104;
               case 212 -> 117;
               case 213 -> 108;
               case 214 -> 22;
               case 215 -> 62;
               case 216 -> 34;
               case 217 -> 116;
               case 218 -> 203;
               case 219 -> 48;
               case 220 -> 137;
               case 221 -> 35;
               case 222 -> 181;
               case 223 -> 215;
               case 224 -> 14;
               case 225 -> 85;
               case 226 -> 198;
               case 227 -> 170;
               case 228 -> 142;
               case 229 -> 89;
               case 230 -> 32;
               case 231 -> 76;
               case 232 -> 201;
               case 233 -> 33;
               case 234 -> 20;
               case 235 -> 101;
               case 236 -> 165;
               case 237 -> 82;
               case 238 -> 232;
               case 239 -> 219;
               case 240 -> 235;
               case 241 -> 136;
               case 242 -> 175;
               case 243 -> 132;
               case 244 -> 59;
               case 245 -> 121;
               case 246 -> 3;
               case 247 -> 74;
               case 248 -> 73;
               case 249 -> 98;
               case 250 -> 15;
               case 251 -> 110;
               case 252 -> 249;
               case 253 -> 164;
               case 254 -> 237;
               default -> 106;
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

   public static final boolean a(me.octo.client.llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI p1, net.minecraft.world.phys.Vec3 p2) {
      return p1.c(p2);
   }
   // PX-FIX synth restored from jar bytecode
   public static void a(me.octo.client.llllIlllIlllIlIIIIlllIlIlllllIllllllIllIIIIlIllllllIIIlIIIlIllIIIllllllIlllIlIlIlIllI p0, java.util.List p1, me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p2, int p3, java.lang.Object p4) {
      if ((p3 & 2) != 0) {
         p2 = null;
      }
      p0.a(p1, p2);
   }
}
