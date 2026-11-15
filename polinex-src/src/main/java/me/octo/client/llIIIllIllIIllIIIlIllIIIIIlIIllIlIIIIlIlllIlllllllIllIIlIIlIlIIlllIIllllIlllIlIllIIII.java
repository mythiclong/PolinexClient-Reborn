package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII {
   public static me.octo.client.PXDyn Object = null; // PX-FIX missing field

   @NotNull
   private BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final Minecraft IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final HashSet<BlockPos> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private BlockPos IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private BlockPos llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @Nullable
   private lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private ArrayList<AABB> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final HashSet<BlockPos> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private Vec3 IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private final double llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static String[] a;
   private static String[] b;

   public llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII(
      @NotNull BlockPos var1, @NotNull lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var2
   ) {
      short var10001 = 26610;
      short var10002 = 2963;
      Intrinsics.checkNotNullParameter(var1, "startPos");
      var10001 = 26586;
      var10002 = 8228;
      Intrinsics.checkNotNullParameter(var2, "directionData");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 5;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 9;
      Minecraft var4 = Minecraft.getInstance();
      short var10003 = 26592;
      short var10004 = 19486;
      Intrinsics.checkNotNullExpressionValue(var4, "getInstance(...)");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .getY();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashSet<>();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.a(0.0F);
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ArrayList<>();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashSet<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new Vec3(0.0, 0.0, 0.0);
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 0.25;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   @NotNull
   public final lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(@NotNull lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var1) {
      short var10001 = 26612;
      short var10002 = 15464;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final int b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int c() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final BlockPos d() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void a(@NotNull BlockPos var1) {
      short var10001 = 26619;
      short var10002 = 6500;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   @Nullable
   public final lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII e() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void a(@Nullable lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII var1) {
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   @Nullable
   public final llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI f() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(@Nullable llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @NotNull
   public final ArrayList<AABB> g() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void a(@NotNull ArrayList<AABB> var1) {
      short var10001 = 26612;
      short var10002 = 15464;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI h() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void a(
      @NotNull Vec3 param1,
      @NotNull Vec3 param2,
      @NotNull lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI param3,
      boolean param4
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush 26614
      // 004: sipush -28027
      // 007: pop2
      // 008: ldc "currentPosition"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 010: aload 2
      // 011: sipush 26594
      // 014: sipush -16482
      // 017: pop2
      // 018: ldc "forwardPosition"
      // 01a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01d: astore 5
      // 01f: aload 3
      // 020: sipush 26606
      // 023: sipush -10241
      // 026: pop2
      // 027: ldc "moveDirectionData"
      // 029: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 02c: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 02f: aload 0
      // 030: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 033: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 036: astore 6
      // 038: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 03b: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 03e: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 041: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 044: astore 7
      // 046: bipush 0
      // 047: istore 8
      // 049: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 04c: aload 6
      // 04e: aload 7
      // 050: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.d (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 053: ldc2_w 2.25
      // 056: dcmpg
      // 057: ifge 0a5
      // 05a: aload 0
      // 05b: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/util/HashSet;
      // 05e: aload 0
      // 05f: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 062: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 065: pop
      // 066: aload 0
      // 067: aload 0
      // 068: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 06b: aload 0
      // 06c: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lnet/minecraft/core/BlockPos;
      // 06f: checkcast net/minecraft/core/Vec3i
      // 072: invokevirtual net/minecraft/core/BlockPos.offset (Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;
      // 075: dup
      // 076: sipush 26598
      // 079: sipush -21838
      // 07c: pop2
      // 07d: ldc "offset(...)"
      // 07f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 082: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 085: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 088: aload 0
      // 089: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 08c: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 08f: astore 6
      // 091: bipush 1
      // 092: istore 8
      // 094: aload 5
      // 096: ifnull 188
      // 099: aload 5
      // 09b: ifnonnull 049
      // 09e: goto 0a5
      // 0a1: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a4: athrow
      // 0a5: iload 8
      // 0a7: aload 5
      // 0a9: ifnull 18a
      // 0ac: ifne 177
      // 0af: goto 0b6
      // 0b2: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 0ba: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0bd: dup
      // 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0c1: invokevirtual net/minecraft/client/player/LocalPlayer.onGround ()Z
      // 0c4: aload 5
      // 0c6: ifnull 18a
      // 0c9: goto 0d0
      // 0cc: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cf: athrow
      // 0d0: ifeq 177
      // 0d3: goto 0da
      // 0d6: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 0de: astore 9
      // 0e0: bipush 0
      // 0e1: istore 10
      // 0e3: iload 10
      // 0e5: bipush 6
      // 0e7: if_icmpge 177
      // 0ea: aload 9
      // 0ec: aload 0
      // 0ed: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lnet/minecraft/core/BlockPos;
      // 0f0: checkcast net/minecraft/core/Vec3i
      // 0f3: invokevirtual net/minecraft/core/BlockPos.offset (Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;
      // 0f6: dup
      // 0f7: sipush 26598
      // 0fa: sipush -21838
      // 0fd: pop2
      // 0fe: ldc "offset(...)"
      // 100: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 103: astore 9
      // 105: aload 5
      // 107: ifnull 172
      // 10a: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 10d: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 110: aload 9
      // 112: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 115: bipush 0
      // 116: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 119: ldc2_w 2.25
      // 11c: dcmpg
      // 11d: aload 5
      // 11f: ifnull 18a
      // 122: goto 129
      // 125: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 128: athrow
      // 129: ifge 168
      // 12c: goto 133
      // 12f: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 132: athrow
      // 133: aload 0
      // 134: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/util/HashSet;
      // 137: aload 0
      // 138: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 13b: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 13e: pop
      // 13f: aload 0
      // 140: aload 9
      // 142: aload 0
      // 143: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lnet/minecraft/core/BlockPos;
      // 146: checkcast net/minecraft/core/Vec3i
      // 149: invokevirtual net/minecraft/core/BlockPos.offset (Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;
      // 14c: dup
      // 14d: sipush 26598
      // 150: sipush -21838
      // 153: pop2
      // 154: ldc "offset(...)"
      // 156: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 159: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 15c: aload 5
      // 15e: ifnonnull 177
      // 161: goto 168
      // 164: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 167: athrow
      // 168: iinc 10 1
      // 16b: goto 172
      // 16e: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 171: athrow
      // 172: aload 5
      // 174: ifnonnull 0e3
      // 177: aload 0
      // 178: aload 5
      // 17a: ifnull 31e
      // 17d: aconst_null
      // 17e: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI;
      // 181: goto 188
      // 184: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 187: athrow
      // 188: iload 4
      // 18a: ifeq 31d
      // 18d: aload 0
      // 18e: aconst_null
      // 18f: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII;
      // 192: aload 0
      // 193: aload 5
      // 195: ifnull 31e
      // 198: goto 19f
      // 19b: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 19e: athrow
      // 19f: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 1a2: sipush 240
      // 1a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a8: checkcast java/lang/Number
      // 1ab: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 1ae: ifeq 31d
      // 1b1: goto 1b8
      // 1b4: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.i ()Lkotlin/Pair;
      // 1bc: dup
      // 1bd: ifnull 314
      // 1c0: goto 1c7
      // 1c3: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c6: athrow
      // 1c7: astore 11
      // 1c9: sipush 26603
      // 1cc: bipush 0
      // 1cd: istore 12
      // 1cf: sipush -4302
      // 1d2: aload 11
      // 1d4: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 1d7: checkcast me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl
      // 1da: astore 13
      // 1dc: aload 11
      // 1de: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 1e1: checkcast net/minecraft/core/BlockPos
      // 1e4: astore 14
      // 1e6: pop2
      // 1e7: ldc_w "Powder Macro"
      // 1ea: astore 15
      // 1ec: aload 5
      // 1ee: ifnull 243
      // 1f1: aload 13
      // 1f3: getstatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 1f6: swap
      // 1f7: invokevirtual me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.ordinal ()I
      // 1fa: iaload
      // 1fb: tableswitch 257 1 6 41 77 113 149 185 221
      // 220: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 223: athrow
      // 224: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 227: ldc2_w 5000
      // 22a: aload 15
      // 22c: sipush 26609
      // 22f: sipush -27227
      // 232: pop2
      // 233: ldc_w "Detected: Open air area"
      // 236: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 239: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 23c: goto 243
      // 23f: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 242: athrow
      // 243: aload 5
      // 245: ifnonnull 308
      // 248: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 24b: ldc2_w 5000
      // 24e: aload 15
      // 250: sipush 26608
      // 253: sipush -30367
      // 256: pop2
      // 257: ldc_w "Detected: Big air gap infront"
      // 25a: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 25d: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 260: aload 5
      // 262: ifnonnull 308
      // 265: goto 26c
      // 268: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 26b: athrow
      // 26c: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 26f: ldc2_w 5000
      // 272: aload 15
      // 274: sipush 26580
      // 277: sipush -22552
      // 27a: pop2
      // 27b: ldc_w "Detected: Border of the selected area"
      // 27e: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 281: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 284: aload 5
      // 286: ifnonnull 308
      // 289: goto 290
      // 28c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28f: athrow
      // 290: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 293: ldc2_w 5000
      // 296: aload 15
      // 298: sipush 26576
      // 29b: sipush -7782
      // 29e: pop2
      // 29f: ldc_w "Detected: Bedrock wall"
      // 2a2: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 2a5: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 2a8: aload 5
      // 2aa: ifnonnull 308
      // 2ad: goto 2b4
      // 2b0: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b3: athrow
      // 2b4: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 2b7: ldc2_w 5000
      // 2ba: aload 15
      // 2bc: sipush 26599
      // 2bf: sipush 22372
      // 2c2: pop2
      // 2c3: ldc_w "Detected: Structure in the way"
      // 2c6: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 2c9: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 2cc: aload 5
      // 2ce: ifnonnull 308
      // 2d1: goto 2d8
      // 2d4: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d7: athrow
      // 2d8: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 2db: ldc2_w 5000
      // 2de: aload 15
      // 2e0: sipush 26577
      // 2e3: sipush -16439
      // 2e6: pop2
      // 2e7: ldc_w "Detected: Vein in the way"
      // 2ea: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 2ed: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 2f0: aload 5
      // 2f2: ifnonnull 308
      // 2f5: goto 2fc
      // 2f8: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2fb: athrow
      // 2fc: new kotlin/NoWhenBranchMatchedException
      // 2ff: dup
      // 300: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 303: athrow
      // 304: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 307: athrow
      // 308: aload 0
      // 309: aload 13
      // 30b: aload 14
      // 30d: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;Lnet/minecraft/core/BlockPos;)V
      // 310: nop
      // 311: goto 316
      // 314: pop
      // 315: nop
      // 316: aload 0
      // 317: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 31a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 31d: aload 0
      // 31e: aload 1
      // 31f: aload 2
      // 320: aload 3
      // 321: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;)Lme/octo/client/llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI;
      // 324: astore 10
      // 326: bipush 0
      // 327: istore 11
      // 329: aload 5
      // 32b: ifnull 34d
      // 32e: aload 10
      // 330: invokevirtual me/octo/client/llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI.f ()Lme/octo/client/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 333: getstatic me/octo/client/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 336: if_acmpne 34b
      // 339: goto 340
      // 33c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 33f: athrow
      // 340: aload 0
      // 341: aload 10
      // 343: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI;
      // 346: return
      // 347: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 34a: athrow
      // 34b: nop
      // 34c: nop
      // 34d: return
   }

   private final llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI a(
      Vec3 param1, Vec3 param2, lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI param3
   ) {
      int[] guard = me.octo.client.IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      ArrayList<String> directions = new ArrayList<>();
      Object state6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param2);
      lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI state7 = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(
         ((me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI)state6).a()
      );
      Vec3 eye = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(
         (net.minecraft.world.entity.Entity)this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.player
      );
      if (guard == null && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, eye) > 1.0) {
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.f();
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = eye;
      }

      boolean v9 = this.a(eye, state7, 3);
      boolean v10 = this.a(eye, state7);
      if (guard == null) {
         boolean cond = v9 && !v10 && this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(Integer.valueOf(2000))
            || this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.a(Integer.valueOf(2000));
         if (cond && this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.player.horizontalCollision) {
            this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = true;
            this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = false;
         }

         if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.a(Integer.valueOf(5000))) {
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.f();
            this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = true;
         }

         if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll && !this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(Integer.valueOf(400))) {
            directions.add("backward");
         }

         if (this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll && !this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.a(Integer.valueOf(350))) {
            directions.add("forward");
         }

         if (!v9) {
            for (Object o : me.octo.client.utils.player.pathfinder.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(kotlin.collections.CollectionsKt.listOf(param2), 1)) {
               directions.add((String)o);
            }
         }
      }

      int v16 = 0;
      kotlin.jvm.internal.Ref.ObjectRef refObj = new kotlin.jvm.internal.Ref.ObjectRef();
      kotlin.jvm.internal.Ref.BooleanRef refBool = new kotlin.jvm.internal.Ref.BooleanRef();
      if (guard == null) {
         Vec3 sideRaw = param3.b().scale(0.2);
         Vec3 side = new Vec3(sideRaw.x, 0.0, sideRaw.z);
         Vec3 upRaw = param3.d().scale(0.3);
         Vec3 up = new Vec3(upRaw.x, 0.0, upRaw.z);
         Vec3 downRaw = param3.c().scale(0.3);
         Vec3 down = new Vec3(downRaw.x, 0.0, downRaw.z);
         BlockPos bp = this.a(eye, side);
         if (bp != null) {
            a(this, refObj, refBool, bp);
         } else {
            bp = this.a(eye.add(up), side);
            if (bp != null) {
               a(this, refObj, refBool, bp);
            } else {
               bp = this.a(eye.add(down), side);
               if (bp != null) {
                  a(this, refObj, refBool, bp);
               }
            }
         }

         if (!refBool.element) {
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
         }

         v16 = 1;
         if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.player.isUnderWater() || this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.player.isInLava()) {
            v16 = 0;
         }

         if (me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.x() || me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.y()) {
            v16 = 0;
         }

         if (this.a(eye, state7, 7)) {
            v16 = 0;
         }

         if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.player.getSpeed() < 0.2) {
            v16 = 0;
         }

         if (v16 != 0 && this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a(Integer.valueOf(200))) {
            // skip
         } else {
            directions.add("forward");
            directions.add("sprint");
            if (v16 == 0) {
               this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.f();
            }
            v16 = 0;
         }
      }

      net.minecraft.world.phys.HitResult hit = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hitResult;
      BlockPos hitPos = hit instanceof net.minecraft.world.phys.BlockHitResult ? ((net.minecraft.world.phys.BlockHitResult)hit).getBlockPos() : null;
      boolean v18 = hitPos == null || hitPos.getY() != me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s().getY();

      if (guard == null) {
         if (directions.contains("forward") && directions.contains("backward")) {
            ArrayList<String> filtered = new ArrayList<>();
            for (String str : directions) {
               if (!str.equals("forward")) {
                  filtered.add(str);
               }
            }
            directions = filtered;
         }

         if (directions.isEmpty()) {
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.f();
         }
      }

      return new llIIlIllIIlIlllllIIlIIIIIIllIIIlIIIlIlllIIIIlIlllllllIlIIlIlIlIIlIlIlllIlIIlllIIIlllI(
         new ArrayList<Vec3>(), directions, v16 != 0, v18, (BlockPos)refObj.element,
         me.octo.client.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
   }
   private final boolean a(Vec3 var1, lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var2, int var3) {
      int[] var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      Vec3[] var6 = new Vec3[]{var1, null, null};
      int[] var4 = var10000;
      Vec3 var10002 = var1.add(var2.c().scale(0.2));
      short var10004 = 26595;
      short var10005 = 22034;
      Intrinsics.checkNotNullExpressionValue(var10002, "add(...)");
      var6[1] = var10002;
      var10002 = var1.add(var2.d().scale(0.2));
      var10004 = 26595;
      var10005 = 22034;
      Intrinsics.checkNotNullExpressionValue(var10002, "add(...)");
      var6[2] = var10002;
      Iterator var5 = CollectionsKt.listOf(var6).iterator();

      label44:
      while (true) {
         int var12 = ((var5.hasNext()) ? 1 : 0);

         while (var12 != 0) {
            Vec3 var11 = (Vec3)var5.next();
            Vec3 var7 = var11;
            int var8 = 0;

            label40:
            while (true) {
               var12 = var8;
               if (var4 == null) {
                  break;
               }

               if (var8 > var3) {
                  continue label44;
               }

               do {
                  ClientLevel var13 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
                  Intrinsics.checkNotNull(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level);
                  Block var14 = var13.getBlockState(BlockPos.containing(var7)).getBlock();
                  short var18 = 26579;
                  short var10003 = -2244;
                  Intrinsics.checkNotNullExpressionValue(var14, "getBlock(...)");
                  Block var9 = var14;
                  int var15;
                  if (lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .contains(var9)) {
                     try {
                        var15 = 1;
                        if (var4 != null) {
                           return true;
                        }
                     } catch (NoWhenBranchMatchedException var10) {
                        throw (RuntimeException)a(var10);
                     }
                  } else {
                     Vec3 var16 = var7.add(var2.b());
                     short var19 = 26595;
                     var10003 = 22034;
                     Intrinsics.checkNotNullExpressionValue(var16, "add(...)");
                     var7 = var16;
                     var15 = var8;
                  }

                  if (var15 == var3) {
                     continue label44;
                  }

                  var8++;
                  if (var4 == null) {
                     continue label40;
                  }
               } while (var4 != null);

               return false;
            }
         }

         return false;
      }
   }

   private final boolean a(Vec3 var1, lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var2) {
      ClientLevel var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
      Intrinsics.checkNotNull(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level);
      Block var4 = var10000.getBlockState(BlockPos.containing(var1.add(var2.b()))).getBlock();
      short var10002 = 26588;
      short var10003 = -15556;
      Intrinsics.checkNotNullExpressionValue(var4, "getBlock(...)");
      Block var3 = var4;
      return lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .contains(var3);
   }

   private final Pair<IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl, BlockPos> i() {
      BlockPos var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
      int[] var1 = me.octo.client.IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      Vec3 var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var2);
      BlockPos var4 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, 10);
      Vec3 var5 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var4);
      if (this.d(var2)) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7c[BLACKLIST] Current position is blacklisted, avoiding");
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var2);
      }
      net.minecraft.client.player.LocalPlayer var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.player;
      Intrinsics.checkNotNull(var10000);
      if (var10000.getY() - (double)this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll < -2.0) {
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, null);
      }
      if (!this.k()) {
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, null);
      }
      ClientLevel var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
      Intrinsics.checkNotNull(var10001);
      Block var6 = var10001.getBlockState(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q().offset(0, 2, 0)).getBlock();
      Intrinsics.checkNotNullExpressionValue(var6, "getBlock(...)");
      if (me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().contains(var6)) {
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, null);
      }
      BlockPos var7 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, 4).offset(0, 1, 0);
      Intrinsics.checkNotNullExpressionValue(var7, "offset(...)");
      Vec3 var8 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var7);
      ArrayList var9a = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      boolean var9;
      if (var9a instanceof Collection && ((Collection)var9a).isEmpty()) {
         var9 = false;
      } else {
         var9 = false;
         Iterator var11 = ((Iterable)var9a).iterator();
         while (var11.hasNext()) {
            AABB var12 = (AABB)var11.next();
            if (var12.contains(var8)) {
               var9 = true;
               break;
            }
         }
      }
      if (var9) {
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var7);
      }
      Vec3 var9b = new Vec3(0.0, 1.0, 0.0);
      ArrayList var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3, var5);
      int var11b = 0;
      int var12b = 8;
      Iterator var13 = CollectionsKt.listOf(new Float[]{-25.0f, -15.0f, 0.0f, 15.0f, 25.0f}).iterator();
      while (var13.hasNext()) {
         float var14 = ((Number)var13.next()).floatValue();
         me.octo.client.lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var15 = new me.octo.client.lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() + var14);
         Vec3 var16 = var3;
         int var17 = 1;
         while (true) {
            Vec3 var10002 = var16.add(var15.b());
            Intrinsics.checkNotNullExpressionValue(var10002, "add(...)");
            var16 = var10002;
            ClientLevel var10003 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
            Intrinsics.checkNotNull(var10003);
            Block var18 = var10003.getBlockState(BlockPos.containing(var16)).getBlock();
            Intrinsics.checkNotNullExpressionValue(var18, "getBlock(...)");
            ClientLevel var10004 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
            Intrinsics.checkNotNull(var10004);
            Block var19 = var10004.getBlockState(BlockPos.containing(var16.add(0.0, 1.0, 0.0))).getBlock();
            Intrinsics.checkNotNullExpressionValue(var19, "getBlock(...)");
            if (me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(var18) || me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(var19)) {
               var11b++;
            }
            if (var17 == var12b) {
               break;
            }
            var17++;
         }
      }
      if (var11b < 8) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7c[NO BLOCKS] Only " + var11b + " mineable blocks in cone - avoiding");
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(3000L, "NO BLOCKS", "No mineable blocks ahead!", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, null);
      }
      int var13b = 0;
      int var14b = 0;
      Iterator var15b = CollectionsKt.take(CollectionsKt.sortedWith((Iterable)var10, (java.util.Comparator)new me.octo.client.llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()), 5).iterator();
      while (var15b.hasNext()) {
         Pair var16b = (Pair)var15b.next();
         BlockPos var17b = (BlockPos)var16b.component1();
         Block var18b = (Block)var16b.component2();
         if (var18b != null && me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(var18b)) {
            var14b++;
         }
         BlockPos var17b0 = var17b.offset(0, -1, 0);
         Intrinsics.checkNotNullExpressionValue(var17b0, "offset(...)");
         BlockPos var19b = BlockPos.containing(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var17b0));
         Intrinsics.checkNotNullExpressionValue(var19b, "containing(...)");
         ClientLevel var10005 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
         Intrinsics.checkNotNull(var10005);
         if (var10005.getBlockState(var19b).isAir()) {
            var13b++;
         }
      }
      if (var14b > 0 && var13b >= 2) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7e[THIN LAYER] Mining through gap - " + var14b + " blocks ahead");
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(3000L, "THIN LAYER", "Avoiding Thin Layer!", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }
      if (var13b >= 2 && var14b == 0) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7c[AIR GAP] Detected - avoiding");
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(3000L, "AIR GAP", "Avoiding Air Gap!", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, null);
      }
      Vec3 var9c = var3.add(var9b);
      Intrinsics.checkNotNullExpressionValue(var9c, "add(...)");
      Vec3 var9d = var5.add(var9b);
      Intrinsics.checkNotNullExpressionValue(var9d, "add(...)");
      List var15c = CollectionsKt.plus(var10, (Iterable)me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var9c, var9d));
      Iterator var16c = CollectionsKt.take(CollectionsKt.sortedWith((Iterable)var15c, (java.util.Comparator)new me.octo.client.llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll()), 10).iterator();
      while (var16c.hasNext()) {
         Pair var17c = (Pair)var16c.next();
         BlockPos var18c = (BlockPos)var17c.component1();
         Block var19c = (Block)var17c.component2();
         if (var19c == null) {
            continue;
         }
         Block var20 = var19c;
         if (me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().contains(var20)) {
            return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var18c);
         }
         if (var20.defaultBlockState().isAir()) {
            continue;
         }
         if (me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(var20)) {
            continue;
         }
         if (me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().contains(var20)) {
            continue;
         }
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, null);
      }
      boolean var17d;
      if (var15c instanceof Collection && ((Collection)var15c).isEmpty()) {
         var17d = false;
      } else {
         var17d = false;
         Iterator var18d = ((Iterable)var15c).iterator();
         while (var18d.hasNext()) {
            Pair var20d = (Pair)var18d.next();
            Block var22 = (Block)var20d.component2();
            if (Intrinsics.areEqual(var22, net.minecraft.world.level.block.Blocks.BEDROCK)) {
               var17d = true;
               break;
            }
         }
      }
      if (var17d) {
         return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, null);
      }
      me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var16e = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3, var5);
      me.octo.client.lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var17e = new me.octo.client.lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(var16e.a());
      int var18e = 0;
      int var19e = 55;
      Iterator var20e = var15c.iterator();
      scan: {
         while (var20e.hasNext()) {
            Pair var21 = (Pair)var20e.next();
            BlockPos var22b = (BlockPos)var21.component1();
            Block var23 = (Block)var21.component2();
            Vec3 var24 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var22b);
            net.minecraft.world.level.block.state.BlockState var10006 = var23 != null ? var23.defaultBlockState() : null;
            if (var10006 != null && var10006.isAir()) {
               var18e++;
            }
            if (var18e >= var19e) {
               break scan;
            }
            ClientLevel var10007 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
            Intrinsics.checkNotNull(var10007);
            if (var10007.getBlockState(BlockPos.containing(var24.add(var17e.c()))).isAir()) {
               var18e++;
            }
            if (var18e >= var19e) {
               break scan;
            }
            ClientLevel var10008 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
            Intrinsics.checkNotNull(var10008);
            if (var10008.getBlockState(BlockPos.containing(var24.add(var17e.d()))).isAir()) {
               var18e++;
            }
            if (var18e >= var19e) {
               break scan;
            }
         }
         return null;
      }
      return new Pair<>(me.octo.client.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, null);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 003: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.q ()Lnet/minecraft/core/BlockPos;
      // 006: astore 2
      // 007: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 00a: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 00d: aload 2
      // 00e: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 011: astore 3
      // 012: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 015: aload 0
      // 016: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 019: aload 0
      // 01a: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lnet/minecraft/core/BlockPos;
      // 01d: bipush 10
      // 01f: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/core/BlockPos;
      // 022: astore 4
      // 024: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 027: aload 4
      // 029: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 02c: astore 5
      // 02e: astore 1
      // 02f: aload 0
      // 030: aload 2
      // 031: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.d (Lnet/minecraft/core/BlockPos;)Z
      // 034: aload 1
      // 035: ifnull 077
      // 038: ifeq 05f
      // 03b: goto 042
      // 03e: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 041: athrow
      // 042: sipush 26582
      // 045: sipush 13801
      // 048: pop2
      // 049: ldc_w "§c[BLACKLIST] Current position is blacklisted, avoiding"
      // 04c: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 04f: new kotlin/Pair
      // 052: dup
      // 053: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 056: aload 2
      // 057: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 05a: areturn
      // 05b: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 063: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 066: dup
      // 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 06a: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 06d: aload 0
      // 06e: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll I
      // 071: i2d
      // 072: dsub
      // 073: ldc2_w -2.0
      // 076: dcmpg
      // 077: aload 1
      // 078: ifnull 0a4
      // 07b: ifge 095
      // 07e: goto 085
      // 081: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 084: athrow
      // 085: new kotlin/Pair
      // 088: dup
      // 089: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 08c: aconst_null
      // 08d: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 090: areturn
      // 091: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 094: athrow
      // 095: aload 0
      // 096: aload 1
      // 097: ifnull 0b8
      // 09a: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.k ()Z
      // 09d: goto 0a4
      // 0a0: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a3: athrow
      // 0a4: ifne 0b7
      // 0a7: new kotlin/Pair
      // 0aa: dup
      // 0ab: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 0ae: aconst_null
      // 0af: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0b2: areturn
      // 0b3: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 0bb: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 0be: dup
      // 0bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0c2: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0c5: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.q ()Lnet/minecraft/core/BlockPos;
      // 0c8: bipush 0
      // 0c9: bipush 2
      // 0ca: bipush 0
      // 0cb: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 0ce: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0d1: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 0d4: dup
      // 0d5: sipush 26579
      // 0d8: sipush -2244
      // 0db: pop2
      // 0dc: ldc_w "getBlock(...)"
      // 0df: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e2: astore 6
      // 0e4: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 0e7: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.e ()Ljava/util/Set;
      // 0ea: aload 6
      // 0ec: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0f1: ifeq 104
      // 0f4: new kotlin/Pair
      // 0f7: dup
      // 0f8: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 0fb: aconst_null
      // 0fc: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0ff: areturn
      // 100: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 103: athrow
      // 104: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 107: aload 0
      // 108: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/core/BlockPos;
      // 10b: aload 0
      // 10c: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lnet/minecraft/core/BlockPos;
      // 10f: bipush 4
      // 110: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/core/BlockPos;
      // 113: bipush 0
      // 114: bipush 1
      // 115: bipush 0
      // 116: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 119: dup
      // 11a: sipush 26598
      // 11d: sipush -21838
      // 120: pop2
      // 121: ldc "offset(...)"
      // 123: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 126: astore 7
      // 128: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 12b: aload 7
      // 12d: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 130: astore 8
      // 132: aload 0
      // 133: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/ArrayList;
      // 136: checkcast java/lang/Iterable
      // 139: astore 9
      // 13b: bipush 0
      // 13c: istore 10
      // 13e: aload 9
      // 140: aload 1
      // 141: ifnull 17a
      // 144: instanceof java/util/Collection
      // 147: ifeq 178
      // 14a: goto 151
      // 14d: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 150: athrow
      // 151: aload 9
      // 153: checkcast java/util/Collection
      // 156: aload 1
      // 157: ifnull 17a
      // 15a: goto 161
      // 15d: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 160: athrow
      // 161: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 166: ifeq 178
      // 169: goto 170
      // 16c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16f: athrow
      // 170: bipush 0
      // 171: goto 1b1
      // 174: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 177: athrow
      // 178: aload 9
      // 17a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 17f: astore 11
      // 181: aload 11
      // 183: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 188: ifeq 1b0
      // 18b: aload 11
      // 18d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 192: astore 12
      // 194: aload 12
      // 196: checkcast net/minecraft/world/phys/AABB
      // 199: astore 13
      // 19b: bipush 0
      // 19c: istore 14
      // 19e: aload 13
      // 1a0: aload 8
      // 1a2: invokevirtual net/minecraft/world/phys/AABB.contains (Lnet/minecraft/world/phys/Vec3;)Z
      // 1a5: ifeq 181
      // 1a8: bipush 1
      // 1a9: aload 1
      // 1aa: ifnull 1a5
      // 1ad: goto 1b1
      // 1b0: bipush 0
      // 1b1: ifeq 1c5
      // 1b4: new kotlin/Pair
      // 1b7: dup
      // 1b8: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 1bb: aload 7
      // 1bd: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 1c0: areturn
      // 1c1: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c4: athrow
      // 1c5: new net/minecraft/world/phys/Vec3
      // 1c8: dup
      // 1c9: dconst_0
      // 1ca: dconst_1
      // 1cb: dconst_0
      // 1cc: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 1cf: astore 9
      // 1d1: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 1d4: aload 3
      // 1d5: aload 5
      // 1d7: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 1da: astore 10
      // 1dc: bipush 0
      // 1dd: istore 11
      // 1df: bipush 8
      // 1e1: istore 12
      // 1e3: bipush 5
      // 1e4: anewarray 598
      // 1e7: astore 14
      // 1e9: aload 14
      // 1eb: bipush 0
      // 1ec: ldc_w -25.0
      // 1ef: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1f2: aastore
      // 1f3: aload 14
      // 1f5: bipush 1
      // 1f6: ldc_w -15.0
      // 1f9: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1fc: aastore
      // 1fd: aload 14
      // 1ff: bipush 2
      // 200: fconst_0
      // 201: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 204: aastore
      // 205: aload 14
      // 207: bipush 3
      // 208: ldc_w 15.0
      // 20b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 20e: aastore
      // 20f: aload 14
      // 211: bipush 4
      // 212: ldc_w 25.0
      // 215: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 218: aastore
      // 219: aload 14
      // 21b: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 21e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 223: astore 13
      // 225: aload 13
      // 227: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 22c: ifeq 314
      // 22f: aload 13
      // 231: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 236: checkcast java/lang/Number
      // 239: invokevirtual java/lang/Number.floatValue ()F
      // 23c: fstore 14
      // 23e: new me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI
      // 241: dup
      // 242: aload 0
      // 243: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 246: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.a ()F
      // 249: fload 14
      // 24b: fadd
      // 24c: invokespecial me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.<init> (F)V
      // 24f: astore 15
      // 251: aload 3
      // 252: astore 16
      // 254: bipush 1
      // 255: istore 17
      // 257: aload 16
      // 259: aload 15
      // 25b: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.b ()Lnet/minecraft/world/phys/Vec3;
      // 25e: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 261: dup
      // 262: sipush 26595
      // 265: sipush 22034
      // 268: pop2
      // 269: ldc_w "add(...)"
      // 26c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 26f: astore 16
      // 271: aload 0
      // 272: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 275: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 278: dup
      // 279: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 27c: aload 16
      // 27e: checkcast net/minecraft/core/Position
      // 281: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 284: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 287: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 28a: dup
      // 28b: sipush 26579
      // 28e: sipush -2244
      // 291: pop2
      // 292: ldc_w "getBlock(...)"
      // 295: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 298: astore 18
      // 29a: aload 0
      // 29b: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 29e: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 2a1: dup
      // 2a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 2a5: aload 16
      // 2a7: dconst_0
      // 2a8: dconst_1
      // 2a9: dconst_0
      // 2aa: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 2ad: checkcast net/minecraft/core/Position
      // 2b0: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 2b3: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 2b6: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 2b9: dup
      // 2ba: sipush 26579
      // 2bd: sipush -2244
      // 2c0: pop2
      // 2c1: ldc_w "getBlock(...)"
      // 2c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2c7: astore 19
      // 2c9: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 2cc: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.a ()Ljava/util/Set;
      // 2cf: aload 18
      // 2d1: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 2d6: ifne 2ff
      // 2d9: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 2dc: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.a ()Ljava/util/Set;
      // 2df: aload 19
      // 2e1: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 2e6: aload 1
      // 2e7: ifnull 304
      // 2ea: aload 1
      // 2eb: ifnull 304
      // 2ee: goto 2f5
      // 2f1: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f4: athrow
      // 2f5: ifeq 302
      // 2f8: goto 2ff
      // 2fb: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2fe: athrow
      // 2ff: iinc 11 1
      // 302: iload 17
      // 304: iload 12
      // 306: if_icmpeq 225
      // 309: iinc 17 1
      // 30c: aload 1
      // 30d: ifnull 254
      // 310: aload 1
      // 311: ifnonnull 257
      // 314: iload 11
      // 316: aload 1
      // 317: ifnull 376
      // 31a: bipush 8
      // 31c: if_icmpge 375
      // 31f: goto 326
      // 322: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 325: athrow
      // 326: iload 11
      // 328: sipush 26601
      // 32b: sipush -16264
      // 32e: pop2
      // 32f: ldc_w "§c[NO BLOCKS] Only "
      // 332: swap
      // 333: sipush 26605
      // 336: sipush 19524
      // 339: pop2
      // 33a: ldc_w " mineable blocks in cone - avoiding"
      // 33d: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 342: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 345: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 348: ldc2_w 3000
      // 34b: sipush 26600
      // 34e: sipush 1931
      // 351: pop2
      // 352: ldc_w "NO BLOCKS"
      // 355: sipush 26618
      // 358: sipush -32188
      // 35b: pop2
      // 35c: ldc_w "No mineable blocks ahead!"
      // 35f: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 362: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 365: new kotlin/Pair
      // 368: dup
      // 369: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 36c: aconst_null
      // 36d: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 370: areturn
      // 371: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 374: athrow
      // 375: bipush 0
      // 376: istore 13
      // 378: bipush 0
      // 379: istore 14
      // 37b: aload 10
      // 37d: checkcast java/lang/Iterable
      // 380: astore 16
      // 382: bipush 0
      // 383: istore 17
      // 385: aload 16
      // 387: new me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 38a: dup
      // 38b: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> ()V
      // 38e: checkcast java/util/Comparator
      // 391: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
      // 394: checkcast java/lang/Iterable
      // 397: bipush 5
      // 398: invokestatic kotlin/collections/CollectionsKt.take (Ljava/lang/Iterable;I)Ljava/util/List;
      // 39b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3a0: astore 15
      // 3a2: aload 15
      // 3a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a9: ifeq 456
      // 3ac: aload 15
      // 3ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b3: checkcast kotlin/Pair
      // 3b6: astore 16
      // 3b8: aload 16
      // 3ba: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 3bd: checkcast net/minecraft/core/BlockPos
      // 3c0: astore 17
      // 3c2: aload 16
      // 3c4: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 3c7: checkcast net/minecraft/world/level/block/Block
      // 3ca: astore 18
      // 3cc: aload 1
      // 3cd: ifnull 4c4
      // 3d0: aload 18
      // 3d2: ifnull 3fd
      // 3d5: goto 3dc
      // 3d8: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3db: athrow
      // 3dc: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 3df: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.a ()Ljava/util/Set;
      // 3e2: aload 18
      // 3e4: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 3e9: ifeq 3fd
      // 3ec: goto 3f3
      // 3ef: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f2: athrow
      // 3f3: iinc 14 1
      // 3f6: goto 3fd
      // 3f9: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3fc: athrow
      // 3fd: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 400: aload 17
      // 402: bipush 0
      // 403: bipush -1
      // 404: bipush 0
      // 405: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 408: dup
      // 409: sipush 26598
      // 40c: sipush -21838
      // 40f: pop2
      // 410: ldc "offset(...)"
      // 412: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 415: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 418: checkcast net/minecraft/core/Position
      // 41b: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 41e: dup
      // 41f: sipush 26584
      // 422: sipush -15200
      // 425: pop2
      // 426: ldc_w "containing(...)"
      // 429: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 42c: astore 19
      // 42e: aload 1
      // 42f: ifnull 452
      // 432: aload 0
      // 433: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 436: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 439: dup
      // 43a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 43d: aload 19
      // 43f: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 442: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 445: ifeq 3a2
      // 448: goto 44f
      // 44b: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 44e: athrow
      // 44f: iinc 13 1
      // 452: aload 1
      // 453: ifnonnull 3a2
      // 456: iload 14
      // 458: aload 1
      // 459: ifnull 4c6
      // 45c: ifle 4c4
      // 45f: goto 466
      // 462: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 465: athrow
      // 466: iload 13
      // 468: bipush 2
      // 469: aload 1
      // 46a: ifnull 4d2
      // 46d: goto 474
      // 470: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 473: athrow
      // 474: if_icmplt 4c4
      // 477: goto 47e
      // 47a: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 47d: athrow
      // 47e: iload 14
      // 480: sipush 26611
      // 483: sipush -4597
      // 486: pop2
      // 487: ldc_w "§e[THIN LAYER] Mining through gap - "
      // 48a: swap
      // 48b: sipush 26593
      // 48e: sipush -22767
      // 491: pop2
      // 492: ldc_w " blocks ahead"
      // 495: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 49a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 49d: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 4a0: ldc2_w 3000
      // 4a3: sipush 26623
      // 4a6: sipush -14182
      // 4a9: pop2
      // 4aa: ldc_w "THIN LAYER"
      // 4ad: sipush 26583
      // 4b0: sipush 3633
      // 4b3: pop2
      // 4b4: ldc_w "Avoiding Thin Layer!"
      // 4b7: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 4ba: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 4bd: goto 4c4
      // 4c0: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4c3: athrow
      // 4c4: iload 13
      // 4c6: aload 1
      // 4c7: ifnull 4d7
      // 4ca: bipush 2
      // 4cb: goto 4d2
      // 4ce: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4d1: athrow
      // 4d2: if_icmplt 517
      // 4d5: iload 14
      // 4d7: ifne 517
      // 4da: sipush 26615
      // 4dd: sipush -10561
      // 4e0: pop2
      // 4e1: ldc_w "§c[AIR GAP] Detected - avoiding"
      // 4e4: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 4e7: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 4ea: ldc2_w 3000
      // 4ed: sipush 26622
      // 4f0: sipush -32725
      // 4f3: pop2
      // 4f4: ldc_w "AIR GAP"
      // 4f7: sipush 26581
      // 4fa: sipush -26570
      // 4fd: pop2
      // 4fe: ldc_w "Avoiding Air Gap!"
      // 501: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 504: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 507: new kotlin/Pair
      // 50a: dup
      // 50b: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 50e: aconst_null
      // 50f: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 512: areturn
      // 513: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 516: athrow
      // 517: aload 10
      // 519: checkcast java/util/Collection
      // 51c: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 51f: aload 3
      // 520: aload 9
      // 522: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 525: dup
      // 526: sipush 26595
      // 529: sipush 22034
      // 52c: pop2
      // 52d: ldc_w "add(...)"
      // 530: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 533: aload 5
      // 535: aload 9
      // 537: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 53a: dup
      // 53b: sipush 26595
      // 53e: sipush 22034
      // 541: pop2
      // 542: ldc_w "add(...)"
      // 545: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 548: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 54b: checkcast java/lang/Iterable
      // 54e: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 551: astore 15
      // 553: aload 15
      // 555: checkcast java/lang/Iterable
      // 558: astore 17
      // 55a: bipush 0
      // 55b: istore 18
      // 55d: aload 17
      // 55f: new me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 562: dup
      // 563: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> ()V
      // 566: checkcast java/util/Comparator
      // 569: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
      // 56c: checkcast java/lang/Iterable
      // 56f: bipush 10
      // 571: invokestatic kotlin/collections/CollectionsKt.take (Ljava/lang/Iterable;I)Ljava/util/List;
      // 574: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 579: astore 16
      // 57b: aload 16
      // 57d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 582: ifeq 640
      // 585: aload 16
      // 587: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 58c: checkcast kotlin/Pair
      // 58f: astore 17
      // 591: aload 17
      // 593: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 596: checkcast net/minecraft/core/BlockPos
      // 599: astore 18
      // 59b: aload 17
      // 59d: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 5a0: checkcast net/minecraft/world/level/block/Block
      // 5a3: astore 19
      // 5a5: aload 1
      // 5a6: ifnull 5be
      // 5a9: aload 19
      // 5ab: dup
      // 5ac: ifnonnull 5c1
      // 5af: goto 5b6
      // 5b2: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5b5: athrow
      // 5b6: pop
      // 5b7: goto 5be
      // 5ba: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5bd: athrow
      // 5be: goto 57b
      // 5c1: astore 20
      // 5c3: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 5c6: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.b ()Ljava/util/Set;
      // 5c9: aload 20
      // 5cb: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 5d0: aload 1
      // 5d1: ifnull 5f7
      // 5d4: ifeq 5ef
      // 5d7: goto 5de
      // 5da: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5dd: athrow
      // 5de: new kotlin/Pair
      // 5e1: dup
      // 5e2: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 5e5: aload 18
      // 5e7: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 5ea: areturn
      // 5eb: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5ee: athrow
      // 5ef: aload 20
      // 5f1: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 5f4: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 5f7: aload 1
      // 5f8: ifnull 612
      // 5fb: ifne 57b
      // 5fe: goto 605
      // 601: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 604: athrow
      // 605: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 608: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.a ()Ljava/util/Set;
      // 60b: aload 20
      // 60d: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 612: aload 1
      // 613: ifnull 62d
      // 616: ifne 57b
      // 619: goto 620
      // 61c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 61f: athrow
      // 620: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 623: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.c ()Ljava/util/Set;
      // 626: aload 20
      // 628: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 62d: aload 1
      // 62e: ifnull 582
      // 631: ifne 57b
      // 634: new kotlin/Pair
      // 637: dup
      // 638: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 63b: aconst_null
      // 63c: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 63f: areturn
      // 640: aload 15
      // 642: checkcast java/lang/Iterable
      // 645: astore 16
      // 647: bipush 0
      // 648: istore 17
      // 64a: aload 16
      // 64c: aload 1
      // 64d: ifnull 686
      // 650: instanceof java/util/Collection
      // 653: ifeq 684
      // 656: goto 65d
      // 659: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 65c: athrow
      // 65d: aload 16
      // 65f: checkcast java/util/Collection
      // 662: aload 1
      // 663: ifnull 686
      // 666: goto 66d
      // 669: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 66c: athrow
      // 66d: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 672: ifeq 684
      // 675: goto 67c
      // 678: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 67b: athrow
      // 67c: bipush 0
      // 67d: goto 6c8
      // 680: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 683: athrow
      // 684: aload 16
      // 686: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 68b: astore 18
      // 68d: aload 18
      // 68f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 694: ifeq 6c7
      // 697: aload 18
      // 699: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 69e: astore 19
      // 6a0: aload 19
      // 6a2: checkcast kotlin/Pair
      // 6a5: astore 20
      // 6a7: bipush 0
      // 6a8: istore 21
      // 6aa: aload 20
      // 6ac: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 6af: checkcast net/minecraft/world/level/block/Block
      // 6b2: astore 22
      // 6b4: aload 22
      // 6b6: getstatic net/minecraft/world/level/block/Blocks.BEDROCK Lnet/minecraft/world/level/block/Block;
      // 6b9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 6bc: ifeq 68d
      // 6bf: bipush 1
      // 6c0: aload 1
      // 6c1: ifnull 6bc
      // 6c4: goto 6c8
      // 6c7: bipush 0
      // 6c8: ifeq 6db
      // 6cb: new kotlin/Pair
      // 6ce: dup
      // 6cf: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 6d2: aconst_null
      // 6d3: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 6d6: areturn
      // 6d7: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6da: athrow
      // 6db: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 6de: aload 3
      // 6df: aload 5
      // 6e1: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 6e4: astore 16
      // 6e6: new me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI
      // 6e9: dup
      // 6ea: aload 16
      // 6ec: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 6ef: invokespecial me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.<init> (F)V
      // 6f2: astore 17
      // 6f4: bipush 0
      // 6f5: istore 18
      // 6f7: bipush 55
      // 6f9: istore 19
      // 6fb: aload 15
      // 6fd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 702: astore 20
      // 704: aload 20
      // 706: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 70b: ifeq 82a
      // 70e: aload 20
      // 710: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 715: checkcast kotlin/Pair
      // 718: astore 21
      // 71a: aload 21
      // 71c: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
      // 71f: checkcast net/minecraft/core/BlockPos
      // 722: astore 22
      // 724: aload 21
      // 726: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
      // 729: checkcast net/minecraft/world/level/block/Block
      // 72c: astore 23
      // 72e: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 731: aload 22
      // 733: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 736: astore 24
      // 738: aload 1
      // 739: ifnull 776
      // 73c: aload 23
      // 73e: dup
      // 73f: ifnull 775
      // 742: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 745: dup
      // 746: ifnull 775
      // 749: goto 750
      // 74c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 74f: athrow
      // 750: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 753: aload 1
      // 754: ifnull 772
      // 757: goto 75e
      // 75a: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 75d: athrow
      // 75e: bipush 1
      // 75f: if_icmpne 771
      // 762: goto 769
      // 765: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 768: athrow
      // 769: bipush 1
      // 76a: goto 777
      // 76d: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 770: athrow
      // 771: bipush 0
      // 772: goto 777
      // 775: pop
      // 776: bipush 0
      // 777: ifeq 77d
      // 77a: iinc 18 1
      // 77d: iload 18
      // 77f: iload 19
      // 781: aload 1
      // 782: ifnull 817
      // 785: if_icmpge 813
      // 788: goto 78f
      // 78b: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 78e: athrow
      // 78f: aload 0
      // 790: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 793: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 796: dup
      // 797: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 79a: aload 24
      // 79c: aload 17
      // 79e: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 7a1: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 7a4: checkcast net/minecraft/core/Position
      // 7a7: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 7aa: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 7ad: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 7b0: aload 1
      // 7b1: ifnull 7ca
      // 7b4: goto 7bb
      // 7b7: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7ba: athrow
      // 7bb: ifeq 7c8
      // 7be: goto 7c5
      // 7c1: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7c4: athrow
      // 7c5: iinc 18 1
      // 7c8: iload 18
      // 7ca: iload 19
      // 7cc: aload 1
      // 7cd: ifnull 817
      // 7d0: if_icmpge 813
      // 7d3: goto 7da
      // 7d6: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7d9: athrow
      // 7da: aload 0
      // 7db: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 7de: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 7e1: dup
      // 7e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 7e5: aload 24
      // 7e7: aload 17
      // 7e9: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.d ()Lnet/minecraft/world/phys/Vec3;
      // 7ec: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 7ef: checkcast net/minecraft/core/Position
      // 7f2: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 7f5: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 7f8: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 7fb: aload 1
      // 7fc: ifnull 815
      // 7ff: goto 806
      // 802: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 805: athrow
      // 806: ifeq 813
      // 809: goto 810
      // 80c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 80f: athrow
      // 810: iinc 18 1
      // 813: iload 18
      // 815: iload 19
      // 817: if_icmplt 704
      // 81a: new kotlin/Pair
      // 81d: dup
      // 81e: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 821: aconst_null
      // 822: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 825: aload 1
      // 826: ifnull 729
      // 829: areturn
      // 82a: aconst_null
      // 82b: areturn
   }

   public final void a(@NotNull IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl param1, @Nullable BlockPos param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 003: aload 1
      // 004: sipush 26597
      // 007: sipush 9266
      // 00a: pop2
      // 00b: ldc_w "obstruction"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 3
      // 012: aload 3
      // 013: ifnull 057
      // 016: aload 1
      // 017: getstatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 01a: swap
      // 01b: invokevirtual me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.ordinal ()I
      // 01e: iaload
      // 01f: tableswitch 1754 1 6 60 41 1735 1716 632 299
      // 044: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 047: athrow
      // 048: aload 0
      // 049: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 04c: aload 2
      // 04d: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;Lnet/minecraft/core/BlockPos;)V
      // 050: goto 057
      // 053: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 056: athrow
      // 057: aload 3
      // 058: ifnonnull 705
      // 05b: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 05e: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 061: astore 4
      // 063: new java/util/ArrayList
      // 066: dup
      // 067: invokespecial java/util/ArrayList.<init> ()V
      // 06a: astore 5
      // 06c: aload 3
      // 06d: ifnull 091
      // 070: aload 4
      // 072: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.f (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 075: dup
      // 076: ifnull 090
      // 079: goto 080
      // 07c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07f: athrow
      // 080: astore 8
      // 082: bipush 0
      // 083: istore 9
      // 085: aload 5
      // 087: aload 8
      // 089: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 08c: pop
      // 08d: goto 092
      // 090: pop
      // 091: nop
      // 092: bipush 0
      // 093: istore 6
      // 095: iload 6
      // 097: sipush 1000
      // 09a: if_icmpge 13e
      // 09d: aload 4
      // 09f: aload 0
      // 0a0: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lnet/minecraft/core/BlockPos;
      // 0a3: checkcast net/minecraft/core/Vec3i
      // 0a6: invokevirtual net/minecraft/core/BlockPos.offset (Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;
      // 0a9: dup
      // 0aa: sipush 26602
      // 0ad: sipush -17339
      // 0b0: pop2
      // 0b1: ldc "offset(...)"
      // 0b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b6: astore 4
      // 0b8: aload 3
      // 0b9: ifnull 13a
      // 0bc: aload 0
      // 0bd: aload 3
      // 0be: ifnull 13f
      // 0c1: goto 0c8
      // 0c4: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c7: athrow
      // 0c8: aload 4
      // 0ca: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.b (Lnet/minecraft/core/BlockPos;)Z
      // 0cd: ifne 130
      // 0d0: goto 0d7
      // 0d3: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d6: athrow
      // 0d7: aload 4
      // 0d9: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.f (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 0dc: dup
      // 0dd: ifnonnull 0ef
      // 0e0: goto 0e7
      // 0e3: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e6: athrow
      // 0e7: pop
      // 0e8: goto 130
      // 0eb: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ee: athrow
      // 0ef: astore 7
      // 0f1: aload 0
      // 0f2: aload 7
      // 0f4: aload 0
      // 0f5: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 0f8: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.b (Lnet/minecraft/world/phys/Vec3;Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;)Z
      // 0fb: aload 3
      // 0fc: ifnull 117
      // 0ff: ifeq 12c
      // 102: goto 109
      // 105: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 108: athrow
      // 109: aload 5
      // 10b: aload 7
      // 10d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 110: goto 117
      // 113: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 116: athrow
      // 117: pop
      // 118: aload 0
      // 119: new me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII
      // 11c: dup
      // 11d: aload 5
      // 11f: getstatic me/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 122: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 125: invokespecial me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII.<init> (Ljava/util/ArrayList;Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;)V
      // 128: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII;
      // 12b: return
      // 12c: aload 3
      // 12d: ifnonnull 13e
      // 130: iinc 6 1
      // 133: goto 13a
      // 136: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 139: athrow
      // 13a: aload 3
      // 13b: ifnonnull 095
      // 13e: aload 0
      // 13f: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 142: aload 2
      // 143: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;Lnet/minecraft/core/BlockPos;)V
      // 146: aload 3
      // 147: ifnonnull 705
      // 14a: aload 2
      // 14b: dup
      // 14c: ifnonnull 15c
      // 14f: goto 156
      // 152: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 155: athrow
      // 156: pop
      // 157: return
      // 158: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15b: athrow
      // 15c: pop
      // 15d: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 160: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 163: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.t ()Lnet/minecraft/core/BlockPos;
      // 166: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 169: astore 4
      // 16b: aload 0
      // 16c: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 16f: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.b ()Lnet/minecraft/world/phys/Vec3;
      // 172: astore 5
      // 174: bipush 12
      // 176: istore 6
      // 178: iload 6
      // 17a: bipush 17
      // 17c: if_icmpge 28b
      // 17f: getstatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
      // 182: aload 4
      // 184: aload 5
      // 186: iload 6
      // 188: invokevirtual me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/world/phys/Vec3;
      // 18b: checkcast net/minecraft/core/Position
      // 18e: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 191: dup
      // 192: sipush 26589
      // 195: sipush -23258
      // 198: pop2
      // 199: ldc_w "containing(...)"
      // 19c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 19f: astore 7
      // 1a1: aload 3
      // 1a2: ifnull 1d1
      // 1a5: aload 0
      // 1a6: aload 3
      // 1a7: ifnull 28c
      // 1aa: goto 1b1
      // 1ad: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b0: athrow
      // 1b1: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl;
      // 1b4: aload 7
      // 1b6: aload 0
      // 1b7: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/ArrayList;
      // 1ba: bipush 0
      // 1bb: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lnet/minecraft/core/BlockPos;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;
      // 1be: dup
      // 1bf: ifnonnull 1d4
      // 1c2: goto 1c9
      // 1c5: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c8: athrow
      // 1c9: pop
      // 1ca: goto 1d1
      // 1cd: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d0: athrow
      // 1d1: goto 284
      // 1d4: astore 8
      // 1d6: aload 8
      // 1d8: checkcast java/lang/Iterable
      // 1db: astore 10
      // 1dd: bipush 0
      // 1de: istore 11
      // 1e0: aload 10
      // 1e2: astore 12
      // 1e4: new java/util/ArrayList
      // 1e7: dup
      // 1e8: invokespecial java/util/ArrayList.<init> ()V
      // 1eb: checkcast java/util/Collection
      // 1ee: astore 13
      // 1f0: bipush 0
      // 1f1: istore 14
      // 1f3: aload 12
      // 1f5: astore 15
      // 1f7: bipush 0
      // 1f8: istore 16
      // 1fa: aload 15
      // 1fc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 201: astore 17
      // 203: aload 17
      // 205: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20a: ifeq 256
      // 20d: aload 17
      // 20f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 214: astore 18
      // 216: aload 18
      // 218: astore 19
      // 21a: bipush 0
      // 21b: istore 20
      // 21d: aload 19
      // 21f: checkcast net/minecraft/core/BlockPos
      // 222: astore 21
      // 224: bipush 0
      // 225: istore 22
      // 227: aload 3
      // 228: ifnull 257
      // 22b: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 22e: aload 21
      // 230: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 233: dup
      // 234: ifnull 250
      // 237: goto 23e
      // 23a: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 23d: athrow
      // 23e: astore 23
      // 240: bipush 0
      // 241: istore 24
      // 243: aload 13
      // 245: aload 23
      // 247: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 24c: pop
      // 24d: goto 251
      // 250: pop
      // 251: nop
      // 252: aload 3
      // 253: ifnonnull 203
      // 256: nop
      // 257: aload 13
      // 259: checkcast java/util/List
      // 25c: nop
      // 25d: astore 9
      // 25f: aload 0
      // 260: new me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII
      // 263: dup
      // 264: aload 9
      // 266: checkcast java/lang/Iterable
      // 269: new java/util/ArrayList
      // 26c: dup
      // 26d: invokespecial java/util/ArrayList.<init> ()V
      // 270: checkcast java/util/Collection
      // 273: invokestatic kotlin/collections/CollectionsKt.toCollection (Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;
      // 276: checkcast java/util/ArrayList
      // 279: getstatic me/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 27c: aload 1
      // 27d: invokespecial me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII.<init> (Ljava/util/ArrayList;Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;)V
      // 280: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII;
      // 283: return
      // 284: iinc 6 1
      // 287: aload 3
      // 288: ifnonnull 178
      // 28b: aload 0
      // 28c: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 28f: aconst_null
      // 290: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;Lnet/minecraft/core/BlockPos;)V
      // 293: aload 3
      // 294: ifnonnull 705
      // 297: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 29a: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 29d: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.t ()Lnet/minecraft/core/BlockPos;
      // 2a0: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 2a3: astore 4
      // 2a5: aload 0
      // 2a6: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 2a9: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 2ac: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.e (Lnet/minecraft/core/BlockPos;)V
      // 2af: aload 0
      // 2b0: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 2b3: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.e ()Lnet/minecraft/world/phys/Vec3;
      // 2b6: astore 5
      // 2b8: new net/minecraft/world/phys/Vec3
      // 2bb: dup
      // 2bc: dconst_0
      // 2bd: ldc2_w 0.51
      // 2c0: dconst_0
      // 2c1: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 2c4: astore 6
      // 2c6: new kotlin/ranges/IntRange
      // 2c9: dup
      // 2ca: bipush 6
      // 2cc: bipush 15
      // 2ce: invokespecial kotlin/ranges/IntRange.<init> (II)V
      // 2d1: astore 7
      // 2d3: bipush 1
      // 2d4: istore 8
      // 2d6: iload 8
      // 2d8: bipush 3
      // 2d9: if_icmpge 6b7
      // 2dc: aload 7
      // 2de: invokevirtual kotlin/ranges/IntRange.getFirst ()I
      // 2e1: istore 9
      // 2e3: aload 7
      // 2e5: invokevirtual kotlin/ranges/IntRange.getLast ()I
      // 2e8: istore 10
      // 2ea: aload 3
      // 2eb: ifnull 6cf
      // 2ee: aload 3
      // 2ef: ifnull 6b3
      // 2f2: goto 2f9
      // 2f5: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f8: athrow
      // 2f9: iload 9
      // 2fb: iload 10
      // 2fd: if_icmpgt 6b0
      // 300: goto 307
      // 303: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 306: athrow
      // 307: getstatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
      // 30a: aload 4
      // 30c: aload 5
      // 30e: iload 9
      // 310: invokestatic java/lang/Math.abs (I)I
      // 313: invokevirtual me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/world/phys/Vec3;
      // 316: astore 11
      // 318: getstatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
      // 31b: aload 11
      // 31d: aload 0
      // 31e: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 321: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 324: iload 8
      // 326: aload 0
      // 327: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI I
      // 32a: imul
      // 32b: invokevirtual me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/world/phys/Vec3;
      // 32e: astore 12
      // 330: getstatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
      // 333: aload 11
      // 335: aload 0
      // 336: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 339: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.d ()Lnet/minecraft/world/phys/Vec3;
      // 33c: iload 8
      // 33e: aload 0
      // 33f: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI I
      // 342: imul
      // 343: invokevirtual me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/world/phys/Vec3;
      // 346: astore 13
      // 348: aload 12
      // 34a: checkcast net/minecraft/core/Position
      // 34d: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 350: dup
      // 351: sipush 26584
      // 354: sipush -15200
      // 357: pop2
      // 358: ldc_w "containing(...)"
      // 35b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 35e: astore 14
      // 360: aload 13
      // 362: checkcast net/minecraft/core/Position
      // 365: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 368: dup
      // 369: sipush 26584
      // 36c: sipush -15200
      // 36f: pop2
      // 370: ldc_w "containing(...)"
      // 373: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 376: astore 15
      // 378: aload 0
      // 379: aload 14
      // 37b: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.d (Lnet/minecraft/core/BlockPos;)Z
      // 37e: ifne 39a
      // 381: aload 0
      // 382: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl;
      // 385: aload 14
      // 387: aload 0
      // 388: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/ArrayList;
      // 38b: bipush 0
      // 38c: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lnet/minecraft/core/BlockPos;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;
      // 38f: aload 3
      // 390: ifnull 39b
      // 393: goto 39b
      // 396: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 399: athrow
      // 39a: aconst_null
      // 39b: astore 16
      // 39d: aload 0
      // 39e: aload 3
      // 39f: ifnull 3b9
      // 3a2: aload 15
      // 3a4: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.d (Lnet/minecraft/core/BlockPos;)Z
      // 3a7: ifne 3c9
      // 3aa: goto 3b1
      // 3ad: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b0: athrow
      // 3b1: aload 0
      // 3b2: goto 3b9
      // 3b5: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b8: athrow
      // 3b9: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl;
      // 3bc: aload 15
      // 3be: aload 0
      // 3bf: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Ljava/util/ArrayList;
      // 3c2: bipush 0
      // 3c3: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lnet/minecraft/core/BlockPos;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;
      // 3c6: goto 3ca
      // 3c9: aconst_null
      // 3ca: astore 17
      // 3cc: aload 16
      // 3ce: aload 3
      // 3cf: ifnull 404
      // 3d2: ifnull 402
      // 3d5: goto 3dc
      // 3d8: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3db: athrow
      // 3dc: aload 0
      // 3dd: aload 12
      // 3df: aload 6
      // 3e1: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 3e4: dup
      // 3e5: sipush 26595
      // 3e8: sipush 22034
      // 3eb: pop2
      // 3ec: ldc_w "add(...)"
      // 3ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3f2: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;)Z
      // 3f5: ifne 402
      // 3f8: goto 3ff
      // 3fb: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3fe: athrow
      // 3ff: aconst_null
      // 400: astore 16
      // 402: aload 17
      // 404: aload 3
      // 405: ifnull 43a
      // 408: ifnull 438
      // 40b: goto 412
      // 40e: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 411: athrow
      // 412: aload 0
      // 413: aload 13
      // 415: aload 6
      // 417: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 41a: dup
      // 41b: sipush 26595
      // 41e: sipush 22034
      // 421: pop2
      // 422: ldc_w "add(...)"
      // 425: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 428: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;)Z
      // 42b: ifne 438
      // 42e: goto 435
      // 431: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 434: athrow
      // 435: aconst_null
      // 436: astore 17
      // 438: aload 16
      // 43a: aload 3
      // 43b: ifnull 453
      // 43e: dup
      // 43f: ifnull 4e5
      // 442: goto 449
      // 445: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 448: athrow
      // 449: checkcast java/lang/Iterable
      // 44c: goto 453
      // 44f: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 452: athrow
      // 453: astore 21
      // 455: bipush 0
      // 456: istore 22
      // 458: aload 21
      // 45a: astore 23
      // 45c: new java/util/ArrayList
      // 45f: dup
      // 460: invokespecial java/util/ArrayList.<init> ()V
      // 463: checkcast java/util/Collection
      // 466: astore 24
      // 468: bipush 0
      // 469: istore 25
      // 46b: aload 23
      // 46d: astore 26
      // 46f: bipush 0
      // 470: istore 27
      // 472: aload 26
      // 474: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 479: astore 28
      // 47b: aload 28
      // 47d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 482: ifeq 4c7
      // 485: aload 28
      // 487: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 48c: astore 29
      // 48e: aload 29
      // 490: astore 30
      // 492: bipush 0
      // 493: istore 31
      // 495: aload 30
      // 497: checkcast net/minecraft/core/BlockPos
      // 49a: astore 32
      // 49c: bipush 0
      // 49d: istore 33
      // 49f: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 4a2: aload 32
      // 4a4: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 4a7: aload 3
      // 4a8: ifnull 365
      // 4ab: dup
      // 4ac: ifnull 4c1
      // 4af: astore 34
      // 4b1: bipush 0
      // 4b2: istore 35
      // 4b4: aload 24
      // 4b6: aload 34
      // 4b8: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 4bd: pop
      // 4be: goto 4c2
      // 4c1: pop
      // 4c2: nop
      // 4c3: aload 3
      // 4c4: ifnonnull 47b
      // 4c7: nop
      // 4c8: aload 24
      // 4ca: checkcast java/util/List
      // 4cd: nop
      // 4ce: checkcast java/lang/Iterable
      // 4d1: new java/util/ArrayList
      // 4d4: dup
      // 4d5: invokespecial java/util/ArrayList.<init> ()V
      // 4d8: checkcast java/util/Collection
      // 4db: invokestatic kotlin/collections/CollectionsKt.toCollection (Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;
      // 4de: checkcast java/util/ArrayList
      // 4e1: aload 3
      // 4e2: ifnonnull 4ee
      // 4e5: pop
      // 4e6: aconst_null
      // 4e7: goto 4ee
      // 4ea: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4ed: athrow
      // 4ee: astore 18
      // 4f0: aload 3
      // 4f1: ifnull 59e
      // 4f4: aload 17
      // 4f6: dup
      // 4f7: ifnull 596
      // 4fa: goto 501
      // 4fd: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 500: athrow
      // 501: checkcast java/lang/Iterable
      // 504: astore 22
      // 506: bipush 0
      // 507: istore 23
      // 509: aload 22
      // 50b: astore 24
      // 50d: new java/util/ArrayList
      // 510: dup
      // 511: invokespecial java/util/ArrayList.<init> ()V
      // 514: checkcast java/util/Collection
      // 517: astore 25
      // 519: bipush 0
      // 51a: istore 26
      // 51c: aload 24
      // 51e: astore 27
      // 520: bipush 0
      // 521: istore 28
      // 523: aload 27
      // 525: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 52a: astore 29
      // 52c: aload 29
      // 52e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 533: ifeq 578
      // 536: aload 29
      // 538: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 53d: astore 30
      // 53f: aload 30
      // 541: astore 31
      // 543: bipush 0
      // 544: istore 32
      // 546: aload 31
      // 548: checkcast net/minecraft/core/BlockPos
      // 54b: astore 33
      // 54d: bipush 0
      // 54e: istore 34
      // 550: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 553: aload 33
      // 555: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 558: aload 3
      // 559: ifnull 365
      // 55c: dup
      // 55d: ifnull 572
      // 560: astore 35
      // 562: bipush 0
      // 563: istore 36
      // 565: aload 25
      // 567: aload 35
      // 569: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 56e: pop
      // 56f: goto 573
      // 572: pop
      // 573: nop
      // 574: aload 3
      // 575: ifnonnull 52c
      // 578: nop
      // 579: aload 25
      // 57b: checkcast java/util/List
      // 57e: nop
      // 57f: checkcast java/lang/Iterable
      // 582: new java/util/ArrayList
      // 585: dup
      // 586: invokespecial java/util/ArrayList.<init> ()V
      // 589: checkcast java/util/Collection
      // 58c: invokestatic kotlin/collections/CollectionsKt.toCollection (Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;
      // 58f: checkcast java/util/ArrayList
      // 592: aload 3
      // 593: ifnonnull 59f
      // 596: pop
      // 597: goto 59e
      // 59a: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 59d: athrow
      // 59e: aconst_null
      // 59f: astore 19
      // 5a1: iload 9
      // 5a3: ifge 5b0
      // 5a6: getstatic me/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 5a9: goto 5b3
      // 5ac: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5af: athrow
      // 5b0: getstatic me/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 5b3: astore 20
      // 5b5: aload 18
      // 5b7: aload 3
      // 5b8: ifnull 62a
      // 5bb: ifnull 621
      // 5be: goto 5c5
      // 5c1: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5c4: athrow
      // 5c5: aload 19
      // 5c7: aload 3
      // 5c8: ifnull 62a
      // 5cb: goto 5d2
      // 5ce: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5d1: athrow
      // 5d2: ifnull 621
      // 5d5: goto 5dc
      // 5d8: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5db: athrow
      // 5dc: aload 18
      // 5de: aload 3
      // 5df: ifnull 604
      // 5e2: goto 5e9
      // 5e5: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5e8: athrow
      // 5e9: invokevirtual java/util/ArrayList.size ()I
      // 5ec: aload 19
      // 5ee: invokevirtual java/util/ArrayList.size ()I
      // 5f1: if_icmpge 607
      // 5f4: goto 5fb
      // 5f7: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5fa: athrow
      // 5fb: aload 18
      // 5fd: goto 604
      // 600: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 603: athrow
      // 604: goto 609
      // 607: aload 19
      // 609: astore 21
      // 60b: aload 0
      // 60c: new me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII
      // 60f: dup
      // 610: aload 21
      // 612: aload 20
      // 614: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 617: invokespecial me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII.<init> (Ljava/util/ArrayList;Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;)V
      // 61a: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII;
      // 61d: aload 3
      // 61e: ifnonnull 685
      // 621: aload 18
      // 623: goto 62a
      // 626: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 629: athrow
      // 62a: aload 3
      // 62b: ifnull 65e
      // 62e: ifnull 655
      // 631: goto 638
      // 634: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 637: athrow
      // 638: aload 0
      // 639: new me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII
      // 63c: dup
      // 63d: aload 18
      // 63f: aload 20
      // 641: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 644: invokespecial me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII.<init> (Ljava/util/ArrayList;Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;)V
      // 647: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII;
      // 64a: aload 3
      // 64b: ifnonnull 685
      // 64e: goto 655
      // 651: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 654: athrow
      // 655: aload 19
      // 657: goto 65e
      // 65a: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 65d: athrow
      // 65e: aload 3
      // 65f: ifnull 687
      // 662: ifnull 685
      // 665: goto 66c
      // 668: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 66b: athrow
      // 66c: aload 0
      // 66d: new me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII
      // 670: dup
      // 671: aload 19
      // 673: aload 20
      // 675: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 678: invokespecial me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII.<init> (Ljava/util/ArrayList;Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;)V
      // 67b: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII;
      // 67e: goto 685
      // 681: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 684: athrow
      // 685: aload 16
      // 687: aload 3
      // 688: ifnull 697
      // 68b: ifnonnull 69a
      // 68e: goto 695
      // 691: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 694: athrow
      // 695: aload 17
      // 697: ifnull 69b
      // 69a: return
      // 69b: iload 9
      // 69d: iload 10
      // 69f: if_icmpeq 6b0
      // 6a2: iinc 9 1
      // 6a5: aload 3
      // 6a6: ifnonnull 307
      // 6a9: goto 6b0
      // 6ac: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6af: athrow
      // 6b0: iinc 8 1
      // 6b3: aload 3
      // 6b4: ifnonnull 2d6
      // 6b7: aload 0
      // 6b8: new me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII
      // 6bb: dup
      // 6bc: new java/util/ArrayList
      // 6bf: dup
      // 6c0: invokespecial java/util/ArrayList.<init> ()V
      // 6c3: getstatic me/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 6c6: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 6c9: invokespecial me/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII.<init> (Ljava/util/ArrayList;Lme/octo/client/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;)V
      // 6cc: putfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIlIIllllIIIIIIIIlllIIllllIIIllllllIlIIIIIlIlIIIlIlIIllIIIIIIlllllIlIlllIllIIllIIlIII;
      // 6cf: aload 3
      // 6d0: ifnonnull 705
      // 6d3: aload 0
      // 6d4: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 6d7: aload 2
      // 6d8: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;Lnet/minecraft/core/BlockPos;)V
      // 6db: aload 3
      // 6dc: ifnonnull 705
      // 6df: goto 6e6
      // 6e2: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6e5: athrow
      // 6e6: aload 0
      // 6e7: getstatic me/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 6ea: aload 2
      // 6eb: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lme/octo/client/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;Lnet/minecraft/core/BlockPos;)V
      // 6ee: aload 3
      // 6ef: ifnonnull 705
      // 6f2: goto 6f9
      // 6f5: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6f8: athrow
      // 6f9: new kotlin/NoWhenBranchMatchedException
      // 6fc: dup
      // 6fd: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 700: athrow
      // 701: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 704: athrow
      // 705: return
   }

   public final boolean b(@NotNull BlockPos param1) {
      // PX-FIX PhaseA(T3b): body restored from the jar bytecode (javap -c). The flattening guards
      // keyed on IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIllllIllIlIIlllIIIlIIIIIlllIIl.d()
      // are the obfuscator's decoys; the intended logic is the non-null path:
      // !isAir(pos) && isAir(pos+1) && isAir(pos+2).
      Intrinsics.checkNotNullParameter(param1, "pos");
      Block block = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level.getBlockState(param1).getBlock();
      Block block2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level.getBlockState(param1.offset(0, 1, 0)).getBlock();
      Block block3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level.getBlockState(param1.offset(0, 2, 0)).getBlock();
      return !block.defaultBlockState().isAir() && block2.defaultBlockState().isAir() && block3.defaultBlockState().isAir();}

   private final boolean a(Vec3 param1) {
      var var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b();
      var var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c();
      var var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d();
      var var4 = new Vec3(0.0, 1.0, 0.0);
      var var5 = new Vec3[]{param1.subtract(var4), param1.add(var2).subtract(var4), param1.add(var3).subtract(var4)};
      var var6 = me.octo.client.IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      var var7 = CollectionsKt.arrayListOf(var5);
      for (int var8 = 0; var8 < 6; var8++) {
         for (int var9 = 0; var9 <= CollectionsKt.getLastIndex(var7); var9++) {
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level.getBlockState(BlockPos.containing(var7.get(var9))).isAir()) {
               return false;
            }
            var7.set(var9, var7.get(var9).add(var1));
         }
      }
      var var19 = new Vec3[]{param1, param1.add(var2), param1.add(var3), param1.add(var2).add(var2), param1.add(var3).add(var3), param1.add(var4), param1.add(var2).add(var4), param1.add(var3).add(var4), param1.add(var2).add(var2).add(var4), param1.add(var3).add(var3).add(var4)};
      var var20 = CollectionsKt.arrayListOf(var19);
      int var21 = 15;
      double var22 = 0.0;
      int var23 = 1;
      while (true) {
         for (int var24 = 0; var24 <= CollectionsKt.getLastIndex(var20); var24++) {
            var var25 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level.getBlockState(BlockPos.containing(var20.get(var24))).getBlock();
            if (me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(var25)) {
               var22 += 1.0;
            }
            var20.set(var24, var20.get(var24).add(var1));
         }
         if (var23 == var21) {
            break;
         }
         var23++;
      }
      double var26 = (double)(var21 * var20.size());
      return var22 / var26 > 0.5;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 004: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.b ()Lnet/minecraft/world/phys/Vec3;
      // 007: astore 3
      // 008: aload 0
      // 009: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 00c: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 00f: astore 4
      // 011: aload 0
      // 012: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI;
      // 015: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.d ()Lnet/minecraft/world/phys/Vec3;
      // 018: astore 5
      // 01a: new net/minecraft/world/phys/Vec3
      // 01d: dup
      // 01e: dconst_0
      // 01f: dconst_1
      // 020: dconst_0
      // 021: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 024: astore 6
      // 026: bipush 3
      // 027: anewarray 138
      // 02a: astore 8
      // 02c: aload 8
      // 02e: bipush 0
      // 02f: aload 1
      // 030: aload 6
      // 032: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 035: aastore
      // 036: aload 8
      // 038: bipush 1
      // 039: aload 1
      // 03a: aload 4
      // 03c: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 03f: aload 6
      // 041: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 044: aastore
      // 045: aload 8
      // 047: bipush 2
      // 048: aload 1
      // 049: aload 5
      // 04b: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 04e: aload 6
      // 050: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 053: aastore
      // 054: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 057: aload 8
      // 059: invokestatic kotlin/collections/CollectionsKt.arrayListOf ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 05c: astore 7
      // 05e: bipush 0
      // 05f: istore 8
      // 061: astore 2
      // 062: iload 8
      // 064: bipush 6
      // 066: if_icmpge 102
      // 069: bipush 0
      // 06a: istore 9
      // 06c: aload 7
      // 06e: checkcast java/util/List
      // 071: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 074: istore 10
      // 076: aload 2
      // 077: ifnull 0fe
      // 07a: iload 9
      // 07c: aload 2
      // 07d: ifnull 104
      // 080: goto 087
      // 083: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 086: athrow
      // 087: iload 10
      // 089: if_icmpgt 0fb
      // 08c: goto 093
      // 08f: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 092: athrow
      // 093: aload 0
      // 094: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 097: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 09a: dup
      // 09b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 09e: aload 7
      // 0a0: iload 9
      // 0a2: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0a5: checkcast net/minecraft/core/Position
      // 0a8: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 0ab: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0ae: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0b1: ifeq 0c5
      // 0b4: goto 0bb
      // 0b7: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ba: athrow
      // 0bb: bipush 0
      // 0bc: aload 2
      // 0bd: ifnull 0e8
      // 0c0: ireturn
      // 0c1: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c4: athrow
      // 0c5: aload 7
      // 0c7: iload 9
      // 0c9: aload 7
      // 0cb: iload 9
      // 0cd: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0d0: checkcast net/minecraft/world/phys/Vec3
      // 0d3: aload 3
      // 0d4: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 0d7: invokevirtual java/util/ArrayList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 0da: pop
      // 0db: aload 2
      // 0dc: ifnull 0fe
      // 0df: iload 9
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e7: athrow
      // 0e8: iload 10
      // 0ea: if_icmpeq 0fb
      // 0ed: iinc 9 1
      // 0f0: aload 2
      // 0f1: ifnonnull 093
      // 0f4: goto 0fb
      // 0f7: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fa: athrow
      // 0fb: iinc 8 1
      // 0fe: aload 2
      // 0ff: ifnonnull 062
      // 102: bipush 10
      // 104: anewarray 138
      // 107: astore 9
      // 109: aload 9
      // 10b: bipush 0
      // 10c: aload 1
      // 10d: aastore
      // 10e: aload 9
      // 110: bipush 1
      // 111: aload 1
      // 112: aload 4
      // 114: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 117: dup
      // 118: sipush 26595
      // 11b: sipush 22034
      // 11e: pop2
      // 11f: ldc_w "add(...)"
      // 122: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 125: aastore
      // 126: aload 9
      // 128: bipush 2
      // 129: aload 1
      // 12a: aload 5
      // 12c: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 12f: dup
      // 130: sipush 26595
      // 133: sipush 22034
      // 136: pop2
      // 137: ldc_w "add(...)"
      // 13a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 13d: aastore
      // 13e: aload 9
      // 140: bipush 3
      // 141: aload 1
      // 142: aload 4
      // 144: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 147: aload 4
      // 149: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 14c: dup
      // 14d: sipush 26595
      // 150: sipush 22034
      // 153: pop2
      // 154: ldc_w "add(...)"
      // 157: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 15a: aastore
      // 15b: aload 9
      // 15d: bipush 4
      // 15e: aload 1
      // 15f: aload 5
      // 161: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 164: aload 5
      // 166: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 169: dup
      // 16a: sipush 26595
      // 16d: sipush 22034
      // 170: pop2
      // 171: ldc_w "add(...)"
      // 174: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 177: aastore
      // 178: aload 9
      // 17a: bipush 5
      // 17b: aload 1
      // 17c: aload 6
      // 17e: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 181: dup
      // 182: sipush 26595
      // 185: sipush 22034
      // 188: pop2
      // 189: ldc_w "add(...)"
      // 18c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 18f: aastore
      // 190: aload 9
      // 192: bipush 6
      // 194: aload 1
      // 195: aload 4
      // 197: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 19a: aload 6
      // 19c: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 19f: dup
      // 1a0: sipush 26595
      // 1a3: sipush 22034
      // 1a6: pop2
      // 1a7: ldc_w "add(...)"
      // 1aa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1ad: aastore
      // 1ae: aload 9
      // 1b0: bipush 7
      // 1b2: aload 1
      // 1b3: aload 5
      // 1b5: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 1b8: aload 6
      // 1ba: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 1bd: dup
      // 1be: sipush 26595
      // 1c1: sipush 22034
      // 1c4: pop2
      // 1c5: ldc_w "add(...)"
      // 1c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1cb: aastore
      // 1cc: aload 9
      // 1ce: bipush 8
      // 1d0: aload 1
      // 1d1: aload 4
      // 1d3: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 1d6: aload 4
      // 1d8: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 1db: aload 6
      // 1dd: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 1e0: dup
      // 1e1: sipush 26595
      // 1e4: sipush 22034
      // 1e7: pop2
      // 1e8: ldc_w "add(...)"
      // 1eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1ee: aastore
      // 1ef: aload 9
      // 1f1: bipush 9
      // 1f3: aload 1
      // 1f4: aload 5
      // 1f6: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 1f9: aload 5
      // 1fb: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 1fe: aload 6
      // 200: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 203: dup
      // 204: sipush 26595
      // 207: sipush 22034
      // 20a: pop2
      // 20b: ldc_w "add(...)"
      // 20e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 211: aastore
      // 212: aload 9
      // 214: invokestatic kotlin/collections/CollectionsKt.arrayListOf ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 217: astore 8
      // 219: bipush 15
      // 21b: istore 9
      // 21d: dconst_0
      // 21e: dstore 10
      // 220: bipush 1
      // 221: istore 12
      // 223: bipush 0
      // 224: istore 13
      // 226: aload 8
      // 228: checkcast java/util/List
      // 22b: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 22e: istore 14
      // 230: iload 13
      // 232: iload 14
      // 234: if_icmpgt 2bd
      // 237: aload 0
      // 238: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 23b: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 23e: dup
      // 23f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 242: aload 8
      // 244: iload 13
      // 246: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 249: checkcast net/minecraft/core/Position
      // 24c: invokestatic net/minecraft/core/BlockPos.containing (Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;
      // 24f: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 252: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 255: dup
      // 256: sipush 26579
      // 259: sipush -2244
      // 25c: pop2
      // 25d: ldc_w "getBlock(...)"
      // 260: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 263: astore 15
      // 265: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 268: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.a ()Ljava/util/Set;
      // 26b: aload 15
      // 26d: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 272: aload 2
      // 273: ifnull 2bf
      // 276: ifeq 287
      // 279: dload 10
      // 27b: dstore 16
      // 27d: dload 16
      // 27f: dconst_1
      // 280: dadd
      // 281: aload 2
      // 282: ifnull 2e6
      // 285: dstore 10
      // 287: aload 8
      // 289: iload 13
      // 28b: aload 8
      // 28d: iload 13
      // 28f: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 292: checkcast net/minecraft/world/phys/Vec3
      // 295: aload 3
      // 296: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 299: invokevirtual java/util/ArrayList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 29c: pop
      // 29d: iload 13
      // 29f: iload 14
      // 2a1: aload 2
      // 2a2: ifnull 2c1
      // 2a5: if_icmpeq 2bd
      // 2a8: goto 2af
      // 2ab: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ae: athrow
      // 2af: iinc 13 1
      // 2b2: aload 2
      // 2b3: ifnonnull 237
      // 2b6: goto 2bd
      // 2b9: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2bc: athrow
      // 2bd: iload 12
      // 2bf: iload 9
      // 2c1: aload 2
      // 2c2: ifnull 2e4
      // 2c5: if_icmpeq 2dd
      // 2c8: goto 2cf
      // 2cb: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ce: athrow
      // 2cf: iinc 12 1
      // 2d2: aload 2
      // 2d3: ifnonnull 223
      // 2d6: goto 2dd
      // 2d9: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2dc: athrow
      // 2dd: iload 9
      // 2df: aload 8
      // 2e1: invokevirtual java/util/ArrayList.size ()I
      // 2e4: imul
      // 2e5: i2d
      // 2e6: dstore 12
      // 2e8: dload 10
      // 2ea: dload 12
      // 2ec: ddiv
      // 2ed: ldc2_w 0.5
      // 2f0: dcmpl
      // 2f1: aload 2
      // 2f2: ifnull 300
      // 2f5: ifle 303
      // 2f8: goto 2ff
      // 2fb: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2fe: athrow
      // 2ff: bipush 1
      // 300: goto 304
      // 303: bipush 0
      // 304: ireturn
   }

   private final boolean b(Vec3 param1, lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI param2) {
      int var4 = 10;
      Vec3 var5 = param2.b();
      Vec3 var6 = param2.c();
      Vec3 var7 = param2.d();
      var var8 = kotlin.collections.CollectionsKt.plus(
         kotlin.collections.CollectionsKt.plus(
            kotlin.collections.CollectionsKt.plus(
               kotlin.collections.CollectionsKt.plus(
                  this.a(param1, var5, var4),
                  this.a(param1, var6.add(param1), var4)
               ),
               this.a(param1, var7.add(param1), var4)
            ),
            this.a(param1, var6.add(var6.add(param1)), var4)
         ),
         this.a(param1, var7.add(var7.add(param1)), var4)
      );
      var var9 = kotlin.collections.CollectionsKt.plus(
         kotlin.collections.CollectionsKt.plus(
            kotlin.collections.CollectionsKt.plus(
               kotlin.collections.CollectionsKt.plus(
                  this.b(param1, var5, var4),
                  this.b(param1, var6.add(param1), var4)
               ),
               this.b(param1, var7.add(param1), var4)
            ),
            this.b(param1, var6.add(var6.add(param1)), var4)
         ),
         this.b(param1, var7.add(var7.add(param1)), var4)
      );
      double var10 = (double)var8.size();
      double var12 = (double)var9.size();
      int var16 = 0;
      for (Block var19 : var8) {
         if (me.octo.client.lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(var19)) {
            var16++;
         }
      }
      if ((double)var16 / var10 < 0.9) {
         return false;
      }
      int var17 = 0;
      for (Block var21 : var9) {
         if (var21.defaultBlockState().isAir()) {
            var17++;
         }
      }
      if ((double)var17 / var12 > 0.1) {
         return false;
      }
      return true;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 10
      // 002: istore 4
      // 004: aload 2
      // 005: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.b ()Lnet/minecraft/world/phys/Vec3;
      // 008: astore 5
      // 00a: aload 2
      // 00b: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 00e: astore 6
      // 010: aload 2
      // 011: invokevirtual me/octo/client/lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI.d ()Lnet/minecraft/world/phys/Vec3;
      // 014: astore 7
      // 016: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 5
      // 01d: iload 4
      // 01f: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 022: checkcast java/util/Collection
      // 025: aload 0
      // 026: aload 1
      // 027: aload 6
      // 029: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 02c: dup
      // 02d: sipush 26595
      // 030: sipush 22034
      // 033: pop2
      // 034: ldc_w "add(...)"
      // 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 03a: aload 5
      // 03c: iload 4
      // 03e: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 041: checkcast java/lang/Iterable
      // 044: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 047: checkcast java/util/Collection
      // 04a: aload 0
      // 04b: aload 1
      // 04c: aload 7
      // 04e: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 051: dup
      // 052: sipush 26595
      // 055: sipush 22034
      // 058: pop2
      // 059: ldc_w "add(...)"
      // 05c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05f: aload 5
      // 061: iload 4
      // 063: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 066: checkcast java/lang/Iterable
      // 069: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 06c: checkcast java/util/Collection
      // 06f: aload 0
      // 070: aload 1
      // 071: aload 6
      // 073: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 076: aload 6
      // 078: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 07b: dup
      // 07c: sipush 26595
      // 07f: sipush 22034
      // 082: pop2
      // 083: ldc_w "add(...)"
      // 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 089: aload 5
      // 08b: iload 4
      // 08d: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 090: checkcast java/lang/Iterable
      // 093: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 096: checkcast java/util/Collection
      // 099: aload 0
      // 09a: aload 1
      // 09b: aload 7
      // 09d: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 0a0: aload 7
      // 0a2: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 0a5: dup
      // 0a6: sipush 26595
      // 0a9: sipush 22034
      // 0ac: pop2
      // 0ad: ldc_w "add(...)"
      // 0b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b3: aload 5
      // 0b5: iload 4
      // 0b7: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 0ba: checkcast java/lang/Iterable
      // 0bd: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 0c0: astore 8
      // 0c2: aload 0
      // 0c3: aload 1
      // 0c4: aload 5
      // 0c6: iload 4
      // 0c8: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 0cb: checkcast java/util/Collection
      // 0ce: aload 0
      // 0cf: aload 1
      // 0d0: aload 6
      // 0d2: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 0d5: dup
      // 0d6: sipush 26595
      // 0d9: sipush 22034
      // 0dc: pop2
      // 0dd: ldc_w "add(...)"
      // 0e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e3: aload 5
      // 0e5: iload 4
      // 0e7: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 0ea: checkcast java/lang/Iterable
      // 0ed: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 0f0: checkcast java/util/Collection
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: aload 7
      // 0f7: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 0fa: dup
      // 0fb: sipush 26595
      // 0fe: sipush 22034
      // 101: pop2
      // 102: ldc_w "add(...)"
      // 105: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 108: aload 5
      // 10a: iload 4
      // 10c: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 10f: checkcast java/lang/Iterable
      // 112: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 115: checkcast java/util/Collection
      // 118: aload 0
      // 119: aload 1
      // 11a: aload 6
      // 11c: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 11f: aload 6
      // 121: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 124: dup
      // 125: sipush 26595
      // 128: sipush 22034
      // 12b: pop2
      // 12c: ldc_w "add(...)"
      // 12f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 132: aload 5
      // 134: iload 4
      // 136: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 139: checkcast java/lang/Iterable
      // 13c: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 13f: checkcast java/util/Collection
      // 142: aload 0
      // 143: aload 1
      // 144: aload 7
      // 146: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 149: aload 7
      // 14b: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 14e: dup
      // 14f: sipush 26595
      // 152: sipush 22034
      // 155: pop2
      // 156: ldc_w "add(...)"
      // 159: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 15c: aload 5
      // 15e: iload 4
      // 160: invokespecial me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Ljava/util/List;
      // 163: checkcast java/lang/Iterable
      // 166: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 169: astore 9
      // 16b: astore 3
      // 16c: aload 8
      // 16e: invokeinterface java/util/List.size ()I 1
      // 173: i2d
      // 174: dstore 10
      // 176: aload 9
      // 178: invokeinterface java/util/List.size ()I 1
      // 17d: i2d
      // 17e: dstore 12
      // 180: aload 8
      // 182: checkcast java/lang/Iterable
      // 185: astore 14
      // 187: bipush 0
      // 188: istore 15
      // 18a: aload 14
      // 18c: instanceof java/util/Collection
      // 18f: aload 3
      // 190: ifnull 1c5
      // 193: ifeq 1c4
      // 196: goto 19d
      // 199: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 19c: athrow
      // 19d: aload 14
      // 19f: checkcast java/util/Collection
      // 1a2: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 1a7: aload 3
      // 1a8: ifnull 1c5
      // 1ab: goto 1b2
      // 1ae: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b1: athrow
      // 1b2: ifeq 1c4
      // 1b5: goto 1bc
      // 1b8: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1bb: athrow
      // 1bc: bipush 0
      // 1bd: goto 22f
      // 1c0: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c3: athrow
      // 1c4: bipush 0
      // 1c5: istore 16
      // 1c7: aload 14
      // 1c9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1ce: astore 17
      // 1d0: aload 17
      // 1d2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d7: ifeq 22d
      // 1da: aload 17
      // 1dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1e1: astore 18
      // 1e3: aload 18
      // 1e5: checkcast net/minecraft/world/level/block/Block
      // 1e8: astore 19
      // 1ea: bipush 0
      // 1eb: istore 20
      // 1ed: getstatic me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI;
      // 1f0: invokevirtual me/octo/client/lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.a ()Ljava/util/Set;
      // 1f3: aload 19
      // 1f5: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 1fa: aload 3
      // 1fb: ifnull 237
      // 1fe: aload 3
      // 1ff: ifnull 223
      // 202: goto 209
      // 205: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 208: athrow
      // 209: ifeq 1d0
      // 20c: goto 213
      // 20f: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 212: athrow
      // 213: iinc 16 1
      // 216: aload 3
      // 217: ifnull 229
      // 21a: iload 16
      // 21c: goto 223
      // 21f: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 222: athrow
      // 223: ifge 1d0
      // 226: invokestatic kotlin/collections/CollectionsKt.throwCountOverflow ()V
      // 229: aload 3
      // 22a: ifnonnull 1d0
      // 22d: iload 16
      // 22f: i2d
      // 230: dload 10
      // 232: ddiv
      // 233: ldc2_w 0.9
      // 236: dcmpg
      // 237: aload 3
      // 238: ifnull 254
      // 23b: iflt 309
      // 23e: goto 245
      // 241: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 244: athrow
      // 245: aload 9
      // 247: checkcast java/lang/Iterable
      // 24a: astore 14
      // 24c: bipush 0
      // 24d: istore 15
      // 24f: aload 14
      // 251: instanceof java/util/Collection
      // 254: aload 3
      // 255: ifnull 28a
      // 258: ifeq 289
      // 25b: goto 262
      // 25e: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 261: athrow
      // 262: aload 14
      // 264: checkcast java/util/Collection
      // 267: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 26c: aload 3
      // 26d: ifnull 28a
      // 270: goto 277
      // 273: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 276: athrow
      // 277: ifeq 289
      // 27a: goto 281
      // 27d: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 280: athrow
      // 281: bipush 0
      // 282: goto 2ef
      // 285: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 288: athrow
      // 289: bipush 0
      // 28a: istore 16
      // 28c: aload 14
      // 28e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 293: astore 17
      // 295: aload 17
      // 297: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29c: ifeq 2ed
      // 29f: aload 17
      // 2a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a6: astore 18
      // 2a8: aload 18
      // 2aa: checkcast net/minecraft/world/level/block/Block
      // 2ad: astore 19
      // 2af: bipush 0
      // 2b0: istore 20
      // 2b2: aload 19
      // 2b4: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 2b7: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 2ba: aload 3
      // 2bb: ifnull 2f7
      // 2be: aload 3
      // 2bf: ifnull 2e3
      // 2c2: goto 2c9
      // 2c5: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c8: athrow
      // 2c9: ifeq 295
      // 2cc: goto 2d3
      // 2cf: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d2: athrow
      // 2d3: iinc 16 1
      // 2d6: aload 3
      // 2d7: ifnull 2e9
      // 2da: iload 16
      // 2dc: goto 2e3
      // 2df: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2e2: athrow
      // 2e3: ifge 295
      // 2e6: invokestatic kotlin/collections/CollectionsKt.throwCountOverflow ()V
      // 2e9: aload 3
      // 2ea: ifnonnull 295
      // 2ed: iload 16
      // 2ef: i2d
      // 2f0: dload 12
      // 2f2: ddiv
      // 2f3: ldc2_w 0.1
      // 2f6: dcmpl
      // 2f7: aload 3
      // 2f8: ifnull 306
      // 2fb: ifgt 309
      // 2fe: goto 305
      // 301: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 304: athrow
      // 305: bipush 1
      // 306: goto 30a
      // 309: bipush 0
      // 30a: ireturn
   }

   public final boolean b(@NotNull Vec3 param1) {
      Intrinsics.checkNotNullParameter(param1, "forwardPosition");
      Vec3 var2 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s());
      if (var2 == null) {
         return false;
      }
      Vec3 var3 = var2.add(0.0, 0.01, 0.0);
      ArrayList<Pair<BlockPos, Block>> var4 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3, param1);
      if (var4.isEmpty()) {
         return false;
      }
      for (Pair<BlockPos, Block> var5 : var4) {
         Block var6 = var5.component2();
         if (var6 != null && lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().contains(var6)) {
            return true;
         }
      }
      return false;}

   private final BlockPos a(Vec3 param1, Vec3 param2) {
      Vec3 var3 = param1;
      for (int n = 0; n < 1000; ++n) {
         BlockPos blockPos = BlockPos.containing(var3);
         Block block = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level.getBlockState(blockPos).getBlock();
         if (lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().contains(block)) {
            return blockPos;
         }
         var3 = var3.add(param2);
      }
      return null;}

   private final List<Block> a(Vec3 var1, Vec3 var2, int var3) {
      Object var38 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      int[] var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      Iterable var6 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            var1,
            lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var1, var2, var3)
         );
      int[] var4 = var10000;
      boolean var7 = false;
      var var9 = new ArrayList();
      boolean var10 = false;
      boolean var12 = false;

      for (Object var14 : var6) {
         boolean var16 = false;
         Pair var17 = (Pair)var14;
         boolean var18 = false;

         label67: {
            try {
               if (var4 == null) {
                  break;
               }

               var36 = (Block)var17.getSecond();
               if (var36 == null) {
                  break label67;
               }
            } catch (NoWhenBranchMatchedException var23) {
               throw (RuntimeException)a(var23);
            }

            Block var19 =((Block)( var36));
            boolean var20 = false;
            var9.add(var19);
         }

         if (var4 == null) {
            break;
         }
      }

      var var37 = var9;
      lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var10001 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var10002 = var1.add(0.0, 1.0, 0.0);
      short var10004 = 26595;
      short var10005 = 22034;
      Intrinsics.checkNotNullExpressionValue(var10002, "add(...)");
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var10003 = lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var39 = var1.add(0.0, 1.0, 0.0);
      short var10006 = 26595;
      short var10007 = 22034;
      Intrinsics.checkNotNullExpressionValue(var39, "add(...)");
      var6 = var10001.a(var10002, var10003.a(var39, var2, var3));
      Collection var21 = var37;
      var7 = false;
      var9 = new ArrayList();
      var10 = false;
      var12 = false;

      for (Object var30 : var6) {
         boolean var31 = false;
         Pair var32 = (Pair)var30;
         boolean var33 = false;

         label68: {
            try {
               if (var4 == null) {
                  break;
               }

               var38 = (Block)var32.getSecond();
               if (var38 == null) {
                  break label68;
               }
            } catch (NoWhenBranchMatchedException var22) {
               throw (RuntimeException)a(var22);
            }

            Block var34 =((Block)( var38));
            boolean var35 = false;
            var9.add(var34);
         }

         if (var4 == null) {
            break;
         }
      }

      return CollectionsKt.plus(var21, var9);
   }

   private final List<Block> b(Vec3 var1, Vec3 var2, int var3) {
      Object var22 = null; // PX-FIX
      lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var10000 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var10001 = var1.subtract(0.0, 1.0, 0.0);
      short var10003 = 26590;
      short var10004 = 5318;
      Intrinsics.checkNotNullExpressionValue(var10001, "subtract(...)");
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var10002 = lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var23 = var1.subtract(0.0, 1.0, 0.0);
      short var10005 = 26591;
      short var10006 = 13727;
      Intrinsics.checkNotNullExpressionValue(var23, "subtract(...)");
      Iterable var5 = var10000.a(var10001, var10002.a(var23, var2, var3));
      boolean var6 = false;
      var var8 = new ArrayList();
      int[] var21 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      boolean var9 = false;
      int[] var4 = var21;
      boolean var11 = false;

      for (Object var13 : var5) {
         boolean var15 = false;
         Pair var16 = (Pair)var13;
         boolean var17 = false;

         label37: {
            try {
               if (var4 == null) {
                  break;
               }

               var22 = (Block)var16.getSecond();
               if (var22 == null) {
                  break label37;
               }
            } catch (NoWhenBranchMatchedException var20) {
               throw (RuntimeException)a(var20);
            }

            Block var18 =((Block)( var22));
            boolean var19 = false;
            var8.add(var18);
         }

         if (var4 == null) {
            break;
         }
      }

      return var8;
   }

   private final BlockPos a(float var1) {
      Vec3 var2 = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() + var1
         )
         .b();
      return new BlockPos((int)Math.rint(var2.x), 0, (int)Math.rint(var2.z));
   }

   @Nullable
   public final BlockPos j() {
      BlockPos var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s();
      ArrayList var3 = new ArrayList();
      for (int var4 = -2; var4 < 3; var4++) {
         for (int var5 = -2; var5 < 3; var5++) {
            BlockPos var6 = var2.offset(var4, 0, var5);
            Intrinsics.checkNotNullExpressionValue(var6, "offset(...)");
            ClientLevel var9 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
            Intrinsics.checkNotNull(var9);
            Block var7 = var9.getBlockState(var6).getBlock();
            Intrinsics.checkNotNullExpressionValue(var7, "getBlock(...)");
            ClientLevel var12 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
            Intrinsics.checkNotNull(var12);
            Block var8 = var12.getBlockState(var6.offset(0, 1, 0)).getBlock();
            Intrinsics.checkNotNullExpressionValue(var8, "getBlock(...)");
            ClientLevel var13 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
            Intrinsics.checkNotNull(var13);
            Block var10 = var13.getBlockState(var6.offset(0, 2, 0)).getBlock();
            Intrinsics.checkNotNullExpressionValue(var10, "getBlock(...)");
            if (!var7.defaultBlockState().isAir() && var8.defaultBlockState().isAir() && var10.defaultBlockState().isAir() && this.c(var6)) {
               var3.add(var6);
            }
         }
      }
      Iterator var14 = var3.iterator();
      if (!var14.hasNext()) {
         return null;
      }
      BlockPos var7x = (BlockPos)var14.next();
      double var8x = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var7x), false);
      while (var14.hasNext()) {
         BlockPos var10x = (BlockPos)var14.next();
         double var11 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var10x), false);
         if (Double.compare(var8x, var11) > 0) {
            var7x = var10x;
            var8x = var11;
         }
      }
      return var7x;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 003: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 006: astore 2
      // 007: new java/util/ArrayList
      // 00a: dup
      // 00b: invokespecial java/util/ArrayList.<init> ()V
      // 00e: astore 3
      // 00f: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 012: bipush -2
      // 014: istore 4
      // 016: astore 1
      // 017: iload 4
      // 019: bipush 3
      // 01a: if_icmpge 13f
      // 01d: bipush -2
      // 01f: istore 5
      // 021: iload 5
      // 023: bipush 3
      // 024: if_icmpge 138
      // 027: aload 2
      // 028: iload 4
      // 02a: bipush 0
      // 02b: iload 5
      // 02d: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 030: dup
      // 031: sipush 26598
      // 034: sipush -21838
      // 037: pop2
      // 038: ldc "offset(...)"
      // 03a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 03d: astore 6
      // 03f: aload 0
      // 040: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 043: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 046: dup
      // 047: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 04a: aload 6
      // 04c: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 04f: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 052: dup
      // 053: sipush 26579
      // 056: sipush -2244
      // 059: pop2
      // 05a: ldc_w "getBlock(...)"
      // 05d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 060: astore 7
      // 062: aload 0
      // 063: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 066: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 069: dup
      // 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 06d: aload 6
      // 06f: bipush 0
      // 070: bipush 1
      // 071: bipush 0
      // 072: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 075: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 078: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 07b: dup
      // 07c: sipush 26579
      // 07f: sipush -2244
      // 082: pop2
      // 083: ldc_w "getBlock(...)"
      // 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 089: astore 8
      // 08b: aload 0
      // 08c: getfield me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lnet/minecraft/client/Minecraft;
      // 08f: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 092: dup
      // 093: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 096: aload 6
      // 098: bipush 0
      // 099: bipush 2
      // 09a: bipush 0
      // 09b: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 09e: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0a1: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 0a4: dup
      // 0a5: sipush 26579
      // 0a8: sipush -2244
      // 0ab: pop2
      // 0ac: ldc_w "getBlock(...)"
      // 0af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b2: astore 10
      // 0b4: aload 1
      // 0b5: ifnull 134
      // 0b8: aload 7
      // 0ba: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 0bd: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0c0: aload 1
      // 0c1: ifnull 019
      // 0c4: goto 0cb
      // 0c7: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ca: athrow
      // 0cb: ifne 131
      // 0ce: aload 8
      // 0d0: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 0d3: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0d6: aload 1
      // 0d7: ifnull 0fa
      // 0da: goto 0e1
      // 0dd: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e0: athrow
      // 0e1: ifeq 131
      // 0e4: goto 0eb
      // 0e7: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ea: athrow
      // 0eb: aload 10
      // 0ed: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 0f0: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0f3: goto 0fa
      // 0f6: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f9: athrow
      // 0fa: aload 1
      // 0fb: ifnull 115
      // 0fe: ifeq 131
      // 101: goto 108
      // 104: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 107: athrow
      // 108: aload 0
      // 109: aload 6
      // 10b: invokevirtual me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.c (Lnet/minecraft/core/BlockPos;)Z
      // 10e: goto 115
      // 111: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 114: athrow
      // 115: aload 1
      // 116: ifnull 130
      // 119: ifeq 131
      // 11c: goto 123
      // 11f: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 122: athrow
      // 123: aload 3
      // 124: aload 6
      // 126: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 129: goto 130
      // 12c: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12f: athrow
      // 130: pop
      // 131: iinc 5 1
      // 134: aload 1
      // 135: ifnonnull 021
      // 138: iinc 4 1
      // 13b: aload 1
      // 13c: ifnonnull 017
      // 13f: aload 3
      // 140: checkcast java/lang/Iterable
      // 143: astore 4
      // 145: bipush 0
      // 146: istore 5
      // 148: aload 4
      // 14a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 14f: astore 6
      // 151: aload 6
      // 153: aload 1
      // 154: ifnull 175
      // 157: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15c: ifne 16e
      // 15f: goto 166
      // 162: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 165: athrow
      // 166: aconst_null
      // 167: goto 1f6
      // 16a: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16d: athrow
      // 16e: aload 6
      // 170: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 175: astore 7
      // 177: aload 6
      // 179: aload 1
      // 17a: ifnull 197
      // 17d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 182: ifne 195
      // 185: goto 18c
      // 188: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18b: athrow
      // 18c: aload 7
      // 18e: goto 1f6
      // 191: invokestatic me/octo/client/llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 194: athrow
      // 195: aload 7
      // 197: checkcast net/minecraft/core/BlockPos
      // 19a: astore 8
      // 19c: bipush 0
      // 19d: istore 10
      // 19f: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 1a2: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 1a5: aload 8
      // 1a7: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 1aa: bipush 0
      // 1ab: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 1ae: dstore 8
      // 1b0: aload 6
      // 1b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b7: astore 10
      // 1b9: aload 10
      // 1bb: checkcast net/minecraft/core/BlockPos
      // 1be: astore 11
      // 1c0: bipush 0
      // 1c1: istore 13
      // 1c3: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 1c6: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 1c9: aload 11
      // 1cb: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 1ce: bipush 0
      // 1cf: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 1d2: dstore 11
      // 1d4: dload 8
      // 1d6: dload 11
      // 1d8: invokestatic java/lang/Double.compare (DD)I
      // 1db: ifle 1e6
      // 1de: aload 10
      // 1e0: astore 7
      // 1e2: dload 11
      // 1e4: dstore 8
      // 1e6: aload 6
      // 1e8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ed: ifne 1b0
      // 1f0: aload 1
      // 1f1: ifnull 1e2
      // 1f4: aload 7
      // 1f6: checkcast net/minecraft/core/BlockPos
      // 1f9: areturn
   }

   public final boolean c(@NotNull BlockPos param1) {
      Intrinsics.checkNotNullParameter(param1, "pos");
      for (int n2 = -this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; n2 < 1; ++n2) {
         for (int n4 = -1; n4 < 2; ++n4) {
            for (int n5 = 0; n5 < 2; ++n5) {
               Block block = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level.getBlockState(param1.offset(n4, n2, n5)).getBlock();
               if (lIIllIIIIIlIIlIIIIlIllllllIlllIlIlIllIIllIIIllIIIIlIlIlllIIllIIIlllIIIlIlIIIIllIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().contains(block) && !block.defaultBlockState().isAir()) {
                  return false;
               }
            }
         }
      }
      return true;}

   public final boolean k() {
      return true;
   }

   public final void l() {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a() + 180.0F
      );
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.a(0.0F);
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .s();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   private final boolean d(BlockPos var1) {
      int[] var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      int var3 = -3;
      int[] var2 = var10000;

      label53:
      while (true) {
         int var6 = var3;

         label47:
         while (var6 < 4) {
            if (var2 == null) {
               return ((Boolean)(Object)((boolean)(Object)(-3)));
            }

            for (int var4 = -3; var4 < 4; var4++) {
               var6 = ((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.contains(var1.offset(var3, 0, var4))) ? 1 : 0);
               if (var2 == null) {
                  continue label47;
               }

               try {
                  if (var2 == null) {
                     return (var6 != 0);
                  }

                  if (var6 != 0) {
                     return (1 != 0);
                  }
               } catch (NoWhenBranchMatchedException var5) {
                  throw (RuntimeException)a(var5);
               }
               break;
            }

            var3++;
            if (var2 != null) {
               continue label53;
            }

            return (0 != 0);
         }

         return (0 != 0);
      }
   }

   public final void e(@NotNull BlockPos var1) {
      int var6 = 0; // PX-FIX
      int[] var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
      short var10002 = 26620;
      short var10003 = -5270;
      Intrinsics.checkNotNullParameter(var1, "pos");
      int[] var2 = var10000;
      int var3 = -1;

      while (true) {
         if (var3 < 2) {
            var6 = -1;
            if (var2 == null) {
               break;
            }

            int var4 = -1;

            label32: {
               while (var4 < 2) {
                  try {
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.add(var1.offset(var3, 0, var4));
                     var4++;
                     if (var2 == null) {
                        break label32;
                     }

                     if (var2 == null) {
                        break;
                     }
                  } catch (NoWhenBranchMatchedException var5) {
                     throw (RuntimeException)a(var5);
                  }
               }

               var3++;
            }

            if (var2 != null) {
               continue;
            }
         }

         var6 = var1.getX();
         break;
      }

      int var10001 = var1.getZ();
      var10002 = 26587;
      var10003 = 32236;
      var10003 = 26617;
      short var10004 = -18646;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
         "§c[BLACKLIST] Added 3x3 area around " + var6 + ", " + var10001
      );
   }

   public final void m() {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
   }

    private static final void a(
       llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII param0,
       ObjectRef<BlockPos> param1,
       BooleanRef param2,
       BlockPos param3
    ) {
       double d = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param3), false);
       if (d >= 4.0) return;
       if (param0.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.a((java.lang.Number) java.lang.Integer.valueOf(1500))) {
          param1.element = param3;
       }
       param2.element = true;
    }

   private static final Vec3 f(BlockPos var0) {
      Vec3 var10000 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(var0)
         .add(0.0, 0.01, 0.0);
      short var10002 = 26595;
      short var10003 = 22034;
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[48];
      int var3 = 0;
      String var2 = "ºx\u0001V§JxT$þTýÆy£9\u0000\u001aO\u000e{\rÆ\u00ad\u0095ÒéÉ\u001c\u00034iàt¨+éâ`t\u0098Ë\u00923b\u001dª\u009eÇ®ß\u0084\u0088:\u0014¥lG\f\u0095_\tþ\u0094:;¥>U§Y\u009b\u00028\u0082\u0017Ç»j\nj\u0010>¨Â÷»\u0014X\u008bÖE½Fmyâ3÷\u000f\u009aÞ\u0004£gÊH\u009ejÐwÍ/5û\u001f;]E4oQ´A\u0005ýE{ö7R¼ùûë\r\u008dPCÉë¥@K\u0011\u0019+\u0007xFûp%'\u000b\u000fc#\u009e@0\u000f6¹·4ÌQX¦\u0015\u0019ÆdU²Y\u0014\u0013t?\u0085}Ïè¨haÎ\u0081A }\b]\u0086\u0016\u0007X\u0087ÿH¥ \u001b\u0007\u000eà38\u0085\u0000\u0080\u0002\u0004ø\u0007|Ö\u009eK2à \nvõs`\u0090+nÍ\u0017³\u0003\u000fÂÆ\u0007\u008a\u0007£Ä\u0097\u009fÂ\u000fX=ù\u0083Üw«¶\u0004Õºm\u0096!Ì\bÀL\u001b\u0098\u001bü¿i\u0010\u0003\u001aµ\u0012\u009c½]ÿÉû.æÎÆ(ì\r\t°C\u0086TÕï¨ws\u0017Ô£\u000béµó¾\u000fR\u0019ªÖºÉ\u001eU\f8ü Îwsë\u008c\u0082\u007f÷y\u0095vâ\u0097\\\u00022>Ô:\u0007fIkX{\bÅ\f»\u0090\u000fý=I\u000b\u0010^Ù@êk\u001böóa\u0085\u000b#èª\u0015$'|\u0004zo\\\fÆñß\t¹WÇ¯KX\u0087Õ\tå%1\u0091ð\u009b\u0081ª¾\u0013T\u0095¨\"Ô\u000fg½_\u001b×¥i´ *ôNá\u0011d\u0003\u0010V@\u0086¯Å\\/<ÎA\u0006Þ\u008eÝ\u0006½³ò°²Ê\b·\u0097\u0091\u0005ô+lx#«S\u0012\u0015Ý\u008c\t\u0084\u009c{é\u0099\u0090¨Ï\u009fõVJB\u00907\u0085+â?´\u0017ð6åñ/Tß\u0003d «\r¹1â|t\u0006\u0015\u001ds¡¼O¹\u0016\u0082¥ÂÉ\u007fh\u009c§\u0096\u0016<=\u0005\u0005\u0013\t¡ßûR\u0093_\u0019Ä¾\nªf\u0004¿*ò§¤\u000b\u008dßáÇ\\Mâ\tÚP\u0013eS7ä!¾¸\u0015°=\u00006A\u0081¢¸³\u0096Ñ¡BÓöÞi§L(Ü\u0080¯±)¾>>O¡\u0095\u008d\u001aF\u009eKXm\u0085\u0019\u0084U´á\u0080\u001bÜ\u009f£<\u0014M\u0012\u0085Bè\u0089\u0082&%19/À\u0098Ã îíG¹%{Vý·\u0098§`^\t)ÏÐmåÀÐÛ\u0098\u0087]7Ó\u008f\u0015\u009a]Î\u001eo\u0088\u00ad^â®\u0013ÉÉ\u0011©±\u00196{\u0007ð÷k\u001eñf¶®§ü²\rh,½uVÿµ^j'^â\u000b$\u00006\"Z\u0086ìO\u008bx0H\u008c\u0081v³xQS\u0018oÁ\u0085¨ÍðQÚn\u0086\u0017¬\u0011b\"êó\u000f¾\u0083\u009cWï\u0095Ç«Ã|\"\u0094«N\u0083\bÍ\u0013Þ\u0095\u001d9Q:\rø\u0001J^«¼3\u009a·\u00ad$Îª\rc¾9©ÅBþE\u000eV\u0013±L";
      int var4 = "ºx\u0001V§JxT$þTýÆy£9\u0000\u001aO\u000e{\rÆ\u00ad\u0095ÒéÉ\u001c\u00034iàt¨+éâ`t\u0098Ë\u00923b\u001dª\u009eÇ®ß\u0084\u0088:\u0014¥lG\f\u0095_\tþ\u0094:;¥>U§Y\u009b\u00028\u0082\u0017Ç»j\nj\u0010>¨Â÷»\u0014X\u008bÖE½Fmyâ3÷\u000f\u009aÞ\u0004£gÊH\u009ejÐwÍ/5û\u001f;]E4oQ´A\u0005ýE{ö7R¼ùûë\r\u008dPCÉë¥@K\u0011\u0019+\u0007xFûp%'\u000b\u000fc#\u009e@0\u000f6¹·4ÌQX¦\u0015\u0019ÆdU²Y\u0014\u0013t?\u0085}Ïè¨haÎ\u0081A }\b]\u0086\u0016\u0007X\u0087ÿH¥ \u001b\u0007\u000eà38\u0085\u0000\u0080\u0002\u0004ø\u0007|Ö\u009eK2à \nvõs`\u0090+nÍ\u0017³\u0003\u000fÂÆ\u0007\u008a\u0007£Ä\u0097\u009fÂ\u000fX=ù\u0083Üw«¶\u0004Õºm\u0096!Ì\bÀL\u001b\u0098\u001bü¿i\u0010\u0003\u001aµ\u0012\u009c½]ÿÉû.æÎÆ(ì\r\t°C\u0086TÕï¨ws\u0017Ô£\u000béµó¾\u000fR\u0019ªÖºÉ\u001eU\f8ü Îwsë\u008c\u0082\u007f÷y\u0095vâ\u0097\\\u00022>Ô:\u0007fIkX{\bÅ\f»\u0090\u000fý=I\u000b\u0010^Ù@êk\u001böóa\u0085\u000b#èª\u0015$'|\u0004zo\\\fÆñß\t¹WÇ¯KX\u0087Õ\tå%1\u0091ð\u009b\u0081ª¾\u0013T\u0095¨\"Ô\u000fg½_\u001b×¥i´ *ôNá\u0011d\u0003\u0010V@\u0086¯Å\\/<ÎA\u0006Þ\u008eÝ\u0006½³ò°²Ê\b·\u0097\u0091\u0005ô+lx#«S\u0012\u0015Ý\u008c\t\u0084\u009c{é\u0099\u0090¨Ï\u009fõVJB\u00907\u0085+â?´\u0017ð6åñ/Tß\u0003d «\r¹1â|t\u0006\u0015\u001ds¡¼O¹\u0016\u0082¥ÂÉ\u007fh\u009c§\u0096\u0016<=\u0005\u0005\u0013\t¡ßûR\u0093_\u0019Ä¾\nªf\u0004¿*ò§¤\u000b\u008dßáÇ\\Mâ\tÚP\u0013eS7ä!¾¸\u0015°=\u00006A\u0081¢¸³\u0096Ñ¡BÓöÞi§L(Ü\u0080¯±)¾>>O¡\u0095\u008d\u001aF\u009eKXm\u0085\u0019\u0084U´á\u0080\u001bÜ\u009f£<\u0014M\u0012\u0085Bè\u0089\u0082&%19/À\u0098Ã îíG¹%{Vý·\u0098§`^\t)ÏÐmåÀÐÛ\u0098\u0087]7Ó\u008f\u0015\u009a]Î\u001eo\u0088\u00ad^â®\u0013ÉÉ\u0011©±\u00196{\u0007ð÷k\u001eñf¶®§ü²\rh,½uVÿµ^j'^â\u000b$\u00006\"Z\u0086ìO\u008bx0H\u008c\u0081v³xQS\u0018oÁ\u0085¨ÍðQÚn\u0086\u0017¬\u0011b\"êó\u000f¾\u0083\u009cWï\u0095Ç«Ã|\"\u0094«N\u0083\bÍ\u0013Þ\u0095\u001d9Q:\rø\u0001J^«¼3\u009a·\u00ad$Îª\rc¾9©ÅBþE\u000eV\u0013±L"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 103;
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
                     case 0 -> 23;
                     case 1 -> 90;
                     case 2 -> 67;
                     case 3 -> 17;
                     case 4 -> 93;
                     case 5 -> 69;
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
                     b = new String[48];
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

                  var2 = "Ø\f\u0083\u0096\u0015\u0016tR\u0012\u0005Ý\u0096Ø\u000fªdSæ[î\u001c\u0089õu©ø\u0097\u008eI";
                  var4 = "Ø\f\u0083\u0096\u0015\u0016tR\u0012\u0005Ý\u0096Ø\u000fªdSæ[î\u001c\u0089õu©ø\u0097\u008eI".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 6;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 26610) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 84;
            case 1 -> 13;
            case 2 -> 32;
            case 3 -> 6;
            case 4 -> 71;
            case 5 -> 106;
            case 6 -> 72;
            case 7 -> 179;
            case 8 -> 52;
            case 9 -> 165;
            case 10 -> 163;
            case 11 -> 153;
            case 12 -> 222;
            case 13 -> 192;
            case 14 -> 131;
            case 15 -> 216;
            case 16 -> 25;
            case 17 -> 14;
            case 18 -> 114;
            case 19 -> 63;
            case 20 -> 134;
            case 21 -> 46;
            case 22 -> 56;
            case 23 -> 83;
            case 24 -> 168;
            case 25 -> 89;
            case 26 -> 40;
            case 27 -> 238;
            case 28 -> 144;
            case 29 -> 200;
            case 30 -> 172;
            case 31 -> 12;
            case 32 -> 20;
            case 33 -> 196;
            case 34 -> 129;
            case 35 -> 75;
            case 36 -> 245;
            case 37 -> 3;
            case 38 -> 62;
            case 39 -> 132;
            case 40 -> 80;
            case 41 -> 155;
            case 42 -> 213;
            case 43 -> 43;
            case 44 -> 59;
            case 45 -> 101;
            case 46 -> 154;
            case 47 -> 234;
            case 48 -> 70;
            case 49 -> 99;
            case 50 -> 233;
            case 51 -> 31;
            case 52 -> 81;
            case 53 -> 185;
            case 54 -> 23;
            case 55 -> 166;
            case 56 -> 231;
            case 57 -> 127;
            case 58 -> 223;
            case 59 -> 1;
            case 60 -> 50;
            case 61 -> 181;
            case 62 -> 22;
            case 63 -> 48;
            case 64 -> 206;
            case 65 -> 255;
            case 66 -> 175;
            case 67 -> 69;
            case 68 -> 60;
            case 69 -> 143;
            case 70 -> 187;
            case 71 -> 94;
            case 72 -> 150;
            case 73 -> 221;
            case 74 -> 133;
            case 75 -> 211;
            case 76 -> 110;
            case 77 -> 4;
            case 78 -> 79;
            case 79 -> 209;
            case 80 -> 93;
            case 81 -> 100;
            case 82 -> 119;
            case 83 -> 9;
            case 84 -> 202;
            case 85 -> 232;
            case 86 -> 199;
            case 87 -> 170;
            case 88 -> 36;
            case 89 -> 122;
            case 90 -> 18;
            case 91 -> 235;
            case 92 -> 160;
            case 93 -> 214;
            case 94 -> 37;
            case 95 -> 215;
            case 96 -> 35;
            case 97 -> 95;
            case 98 -> 118;
            case 99 -> 19;
            case 100 -> 152;
            case 101 -> 240;
            case 102 -> 229;
            case 103 -> 146;
            case 104 -> 138;
            case 105 -> 7;
            case 106 -> 41;
            case 107 -> 88;
            case 108 -> 113;
            case 109 -> 254;
            case 110 -> 248;
            case 111 -> 39;
            case 112 -> 21;
            case 113 -> 198;
            case 114 -> 107;
            case 115 -> 10;
            case 116 -> 210;
            case 117 -> 82;
            case 118 -> 54;
            case 119 -> 237;
            case 120 -> 8;
            case 121 -> 184;
            case 122 -> 16;
            case 123 -> 141;
            case 124 -> 189;
            case 125 -> 169;
            case 126 -> 225;
            case 127 -> 91;
            case 128 -> 45;
            case 129 -> 51;
            case 130 -> 102;
            case 131 -> 29;
            case 132 -> 191;
            case 133 -> 220;
            case 134 -> 28;
            case 135 -> 44;
            case 136 -> 203;
            case 137 -> 156;
            case 138 -> 61;
            case 139 -> 241;
            case 140 -> 123;
            case 141 -> 33;
            case 142 -> 226;
            case 143 -> 148;
            case 144 -> 186;
            case 145 -> 212;
            case 146 -> 0;
            case 147 -> 145;
            case 148 -> 182;
            case 149 -> 176;
            case 150 -> 109;
            case 151 -> 74;
            case 152 -> 5;
            case 153 -> 188;
            case 154 -> 87;
            case 155 -> 86;
            case 156 -> 96;
            case 157 -> 140;
            case 158 -> 137;
            case 159 -> 17;
            case 160 -> 77;
            case 161 -> 201;
            case 162 -> 151;
            case 163 -> 147;
            case 164 -> 112;
            case 165 -> 97;
            case 166 -> 85;
            case 167 -> 2;
            case 168 -> 224;
            case 169 -> 205;
            case 170 -> 34;
            case 171 -> 208;
            case 172 -> 111;
            case 173 -> 180;
            case 174 -> 104;
            case 175 -> 58;
            case 176 -> 65;
            case 177 -> 26;
            case 178 -> 247;
            case 179 -> 250;
            case 180 -> 217;
            case 181 -> 130;
            case 182 -> 76;
            case 183 -> 178;
            case 184 -> 47;
            case 185 -> 239;
            case 186 -> 27;
            case 187 -> 78;
            case 188 -> 30;
            case 189 -> 204;
            case 190 -> 120;
            case 191 -> 105;
            case 192 -> 98;
            case 193 -> 53;
            case 194 -> 116;
            case 195 -> 157;
            case 196 -> 251;
            case 197 -> 115;
            case 198 -> 49;
            case 199 -> 173;
            case 200 -> 57;
            case 201 -> 142;
            case 202 -> 218;
            case 203 -> 15;
            case 204 -> 177;
            case 205 -> 246;
            case 206 -> 243;
            case 207 -> 193;
            case 208 -> 103;
            case 209 -> 197;
            case 210 -> 139;
            case 211 -> 126;
            case 212 -> 66;
            case 213 -> 190;
            case 214 -> 68;
            case 215 -> 162;
            case 216 -> 42;
            case 217 -> 158;
            case 218 -> 195;
            case 219 -> 73;
            case 220 -> 125;
            case 221 -> 230;
            case 222 -> 249;
            case 223 -> 242;
            case 224 -> 124;
            case 225 -> 92;
            case 226 -> 164;
            case 227 -> 136;
            case 228 -> 253;
            case 229 -> 121;
            case 230 -> 24;
            case 231 -> 117;
            case 232 -> 174;
            case 233 -> 11;
            case 234 -> 252;
            case 235 -> 236;
            case 236 -> 55;
            case 237 -> 135;
            case 238 -> 244;
            case 239 -> 38;
            case 240 -> 207;
            case 241 -> 194;
            case 242 -> 228;
            case 243 -> 227;
            case 244 -> 67;
            case 245 -> 183;
            case 246 -> 64;
            case 247 -> 161;
            case 248 -> 159;
            case 249 -> 90;
            case 250 -> 219;
            case 251 -> 108;
            case 252 -> 167;
            case 253 -> 128;
            case 254 -> 171;
            default -> 149;
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
