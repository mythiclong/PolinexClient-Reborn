package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   @NotNull
   private IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private final double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @Nullable
   private Integer llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private ArrayList<lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private ArrayList<lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @Nullable
   private lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private final ArrayList<Integer> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @Nullable
   private Vec3 lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private double IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private Vec3 IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private double IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @Nullable
   private Vec3 IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static int[] lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static String[] a;
   private static String[] b;

   public lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI(
      @NotNull IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII var1
   ) {
      short var10001 = 10827;
      short var10002 = -18676;
      Intrinsics.checkNotNullParameter(var1, "config");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      Minecraft var3 = Minecraft.getInstance();
      short var10003 = 10870;
      short var10004 = 8161;
      Intrinsics.checkNotNullExpressionValue(var3, "getInstance(...)");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      String[] var2 = new String[7];
      var10003 = 10818;
      var10004 = 31135;
      var2[0] = "Voidgloom Seraph";
      var10003 = 10852;
      var10004 = -11469;
      var2[1] = "Revenant Horror";
      var10003 = 10868;
      var10004 = -29513;
      var2[2] = "Atoned Horror";
      var10003 = 10829;
      var10004 = -2646;
      var2[3] = "Tarantula Broodfather";
      var10003 = 10822;
      var10004 = 22009;
      var2[4] = "Sven Packmaster";
      var10003 = 10861;
      var10004 = 26905;
      var2[5] = "Inferno Demonlord";
      var10003 = 10820;
      var10004 = -21776;
      var2[6] = "Riftstalker Bloodfiend";
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.listOf(var2);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 1.1F;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 9.0;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0.8;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 0.55;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0.55;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0.2;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = true;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new ArrayList<>();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new ArrayList<>();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new ArrayList<>();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var4 = Vec3.ZERO;
      var10003 = 10869;
      var10004 = 30067;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var4;
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = -1.0;
   }

   @NotNull
   public final IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final void a(@NotNull IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII var1) {
      short var10001 = 10857;
      short var10002 = 14959;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   private final int b() {
      return 300;
   }

   public final boolean c() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void a(boolean var1) {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final boolean d() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void b(boolean var1) {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final boolean e() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void c(boolean var1) {
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   public final boolean f() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void d(boolean var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final boolean g() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void e(boolean var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final boolean h() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void f(boolean var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   @Nullable
   public final Integer i() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void a(@Nullable Integer var1) {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   public final boolean j() {
      int[] var1 = r();
      lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var10000 = this;
      if (var1 == null) {
         if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
            return false;
         }

         var10000 = this;
      }

      boolean var2 = var10000.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.isEmpty();
      if (var1 == null) {
         if (!var2) {
            return false;
         }

         var2 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.isEmpty();
      }

      return var1 != null ? var2 : var2;
   }

   @NotNull
   public final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll k() {
      int[] var1;
      Integer var2;
      lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      label23: {
         var1 = r();
         if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
            LivingEntity var10003 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a();
            if (var10003 != null) {
               var2 = var10003.getId();
               if (var1 == null) {
                  break label23;
               }
            }
         }

         var2 = null;
      }

      Integer var3;
      label17: {
         if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
            LivingEntity var10004 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a();
            if (var10004 != null) {
               var3 = (int)var10004.getHealth();
               if (var1 == null) {
                  break label17;
               }
            }
         }

         var3 = null;
      }

      var10000 = new lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         var2,
         var3,
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.size(),
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.size(),
         this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.size(),
         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.b()
      );
      return var10000;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var66 = null; // PX-FIX
      Object var55 = null; // PX-FIX
      Object var54 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      Object var51 = null; // PX-FIX
      lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var50 = null; // PX-FIX
      Object var46 = null; // PX-FIX
      byte var43 = 0; // PX-FIX
      Object var42 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      int[] var10000 = r();
      int var10002 = 10860;
      short var10003 = -16161;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player != null) {
            LocalPlayer var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
            if (var2 == null) {
               if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n()) {
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .t();
                  return;
               }

               this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.c();
               this.m();
               this.l();
            }

            lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
            if (var2 == null) {
               if (var4 == null) {
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .t();
                  return;
               }

               this.a(var4);
            }

            label542: {
               int var32 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .K();
               if (var2 == null) {
                  if (var32 == this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII) {
                     break label542;
                  }

                  var32 = ((java.util.function.Supplier<Integer>)(() -> { me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g()
                     .a(200); return 0; })).get();
               }

               if (var2 == null && var32 != 0) {
                  me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .b(this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII);
               }
            }

            Vec3 var5 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);
            Vec3 var33 = var3.getEyePosition();
            var10002 = (short)10871;
            var10003 = -8181;
            Intrinsics.checkNotNullExpressionValue(var33, "getEyePosition(...)");
            Vec3 var6 = var33;
            Vec3 var7 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4.a());
            double var70;
            int var34 = (var70 = var6.y - var4.a().getBoundingBox().getCenter().y) == 0.0 ? 0 : (var70 < 0.0 ? -1 : 1);
            if (var2 == null) {
               var34 = var34 > 0 ? 1 : 0;
            }

            int var8 = var34;
            double var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var5, var7);
            Vec3 var11 = this.a(var4.a(), var6);
            byte var12 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var5,
               var7,
               null,
               0,
               false,
               0.0,
               false,
               false,
               0.0);
            byte var13 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var7,
               var5,
               null,
               0,
               false,
               0.0,
               false,
               false,
               0.0);
            Vec3 var14 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            Vec3 var35 = var14;
            if (var2 == null) {
               label505:
               if (var14 != null && ((java.util.function.Supplier<Boolean>)(() -> { this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.a(this.b()); return null; })).get()) {
                  label517: {
                     me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var15 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                        me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                        var14,
                        this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(),
                        null);
                     Entity var16 = var15.d();
                     double var17 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .d(var14);
                     Entity var36 = var16;
                     if (var2 == null) {
                        if (var16 == null) {
                           break label517;
                        }

                        var36 = var16;
                     }

                     label512:
                     if (var36.getClass() == var4.a().getClass()) {
                        int var37 = var8;
                        if (var2 == null) {
                           if (var8 !=( (!this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll) ? 1 : 0)) {
                              break label512;
                           }

                           var37 = var12;
                        }

                        if (var2 == null) {
                           if (var37 != 0) {
                              break label505;
                           }

                           double var71;
                           var37 = (
                                    var71 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .a(var6, var14)
                                       - 2.9
                                 )
                                 == 0.0
                              ? 0
                              : (var71 < 0.0 ? -1 : 1);
                        }

                        if (var2 == null) {
                           if (var37 >= 0) {
                              break label505;
                           }

                           double var72;
                           var37 = (var72 = var17 - 0.1) == 0.0 ? 0 : (var72 < 0.0 ? -1 : 1);
                        }

                        if (var37 >= 0) {
                           break label505;
                        }

                        EntityHitResult var38 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .H();
                        if ((var38 != null ? var38.getEntity() : null) != null) {
                           break label505;
                        }
                     }
                  }

                  this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
               }

               var35 = var14;
            }

            if (var2 == null) {
               label487: {
                  if (var35 != null) {
                     double var26 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var7, var14);
                     var39 = this;
                     if (var2 != null) {
                        break label487;
                     }

                     if (Math.abs(this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll - var26) > 0.5) {
                        this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
                     }
                  }

                  var39 = this;
               }

               var35 = ((Vec3)(Object)(this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll));
            }

            label481:
            if (var2 == null) {
               if (var35 == null) {
                  var35 = var11;
                  if (var2 != null) {
                     break label481;
                  }

                  if (var11 != null) {
                     this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var11;
                     this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.f();
                     this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = (var8 != 0);
                     this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var7, var11);
                     this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = -1.0;
                  }
               }

               var35 = var4.a().getDeltaMovement().normalize().scale(0.3);
               var10002 = (short)10873;
               var10003 = 21035;
               Intrinsics.checkNotNullExpressionValue(var35, "scale(...)");
            }

            Vec3 var27 = var35;
            Vec3 var28 = new Vec3(var27.x, 0.0, var27.z);
            Vec3 var40 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            Vec3 var10001 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            if (var2 == null) {
               if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll == null) {
                  var40 = var4.a().getBoundingBox().getCenter();
               }

               var40 = var40.add(var28);
               var10001 = var40;
            }

            Vec3 var29;
            label473: {
               var10002 = (short)10848;
               var10003 = 5571;
               Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
               var29 = var40;
               if (var2 == null) {
                  MobEffectInstance var41 = var3.getEffect(MobEffects.JUMP_BOOST);
                  if (var41 != null) {
                     var42 = var41.getAmplifier();
                     break label473;
                  }
               }

               var42 = 0;
            }

            label467: {
               label545: {
                  label465: {
                     label576: {
                        label463: {
                           label547: {
                              int var18 =((Integer)( var42));
                              var43 = var12;
                              if (var2 == null) {
                                 if (var12 != 0) {
                                    double var73;
                                    var43 = (byte)((var73 = ((byte)((var9 - 8.0 != 0.0) ? 1 : 0))) == (byte)((0.0 != 0) ? 0 : (var73 < 0.0 ? -1 : 1)) ? 1 : 0);
                                    if (var2 != null) {
                                       break label463;
                                    }

                                    if (var43 < 0) {
                                       break label547;
                                    }
                                 }

                                 var43 = var13;
                              }

                              label548: {
                                 if (var2 == null) {
                                    if (var43 == 0) {
                                       break label548;
                                    }

                                    var43 = ((byte)((this.a(var5, var7, var4)) ? 1 : 0));
                                 }

                                 if (var2 == null) {
                                    if (var43 == 0) {
                                       break label548;
                                    }

                                    double var74;
                                    var43 = (byte)((var74 = ((byte)((Math.abs(var5.y - var7.y) - 3.0 != 0.0) ? 1 : 0))) == (byte)((0.0 != 0) ? 0 : (var74 < 0.0 ? -1 : 1)) ? 1 : 0);
                                 }

                                 if (var2 != null) {
                                    break label463;
                                 }

                                 if (var43 < 0) {
                                    break label547;
                                 }
                              }

                              Vec3 var44 = var11;
                              if (var2 == null) {
                                 if (var11 != null) {
                                    double var75;
                                    var43 = (byte)((var75 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .a(var6, var11)
                                          - 2.9) == 0.0
                                       ? 0
                                       : (var75 < 0.0 ? -1 : 1));
                                    if (var2 != null) {
                                       break label463;
                                    }

                                    if (var43 < 0) {
                                       break label547;
                                    }
                                 }

                                 var44 = var11;
                              }

                              if (var44 != null) {
                                 double var76;
                                 int var45 = (var76 = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll - -1.0) == 0.0
                                    ? 0
                                    : (var76 < 0.0 ? -1 : 1);
                                 if (var2 == null) {
                                    var45 = (((var45 == 0) ? 1 : 0));
                                 }

                                 if ((var45 == 0)) {
                                    var43 =(byte)( var18);
                                    if (var2 != null) {
                                       break label463;
                                    }

                                    if (var18 >= 2) {
                                       break label547;
                                    }
                                 }
                              }

                              var46 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j();
                              if (var2 != null) {
                                 break label465;
                              }

                              if (((Boolean)(var46))) {
                                 break label576;
                              }

                              double var77;
                              var46 = (var77 = var9 - 8.0) == 0.0 ? 0 : (var77 < 0.0 ? -1 : 1);
                              if (var2 != null) {
                                 break label465;
                              }

                              if (((Boolean)var46)) {
                                 break label576;
                              }
                           }

                           var43 = ((byte)((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .d()) ? 1 : 0));
                        }

                        label414:
                        if (var2 == null) {
                           if (var43 == 0) {
                              var43 = ((byte)((this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0));
                              if (var2 != null) {
                                 break label414;
                              }

                              if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e()
                                    .k();
                              }
                           }

                           var43 = ((byte)((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0));
                        }

                        if (var43 == 0) {
                           me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var29);
                        }

                        double var47;
                        if (var11 != null) {
                           boolean var25 = false;
                           var47 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var6, var11);
                        } else {
                           var47 = 0.0;
                        }

                        double var19 = var47;
                        double var21 = Math.max(
                           me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a(var6, var29),
                           var19
                        );
                        var46 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        label401:
                        if (var2 == null) {
                           label399:
                           if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                              double var78;
                              var46 = (var78 = var21 - 3.0) == 0.0 ? 0 : (var78 < 0.0 ? -1 : 1);
                              label384:
                              if (var2 == null) {
                                 label395:
                                 if (((Boolean)var46)) {
                                    lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var48 = this;
                                    if (var2 == null) {
                                       if (!this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
                                          var46 = var3.onGround();
                                          if (var2 != null) {
                                             break label384;
                                          }

                                          if (!((Boolean)var46)) {
                                             break label395;
                                          }

                                          double var79;
                                          var46 = (var79 = Math.abs(var5.y - var7.y) - 0.5) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
                                          if (var2 != null) {
                                             break label384;
                                          }

                                          if (((Boolean)var46)) {
                                             break label395;
                                          }
                                       }

                                       var48 = this;
                                    }

                                    var48.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.f();
                                 }

                                 double var80;
                                 var46 = (var80 = var21 - 3.0) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
                              }

                              if (var2 == null) {
                                 if (((Boolean)var46)) {
                                    me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .p();
                                    short var56 = 10850;
                                    var10002 = (short)31070;
                                    double var81;
                                    var10002 = (var81 = var21 - 0.5) == 0.0 ? 0 : (var81 < 0.0 ? -1 : 1);
                                    if (var2 == null) {
                                       var10002 = var10002 < 0 ? 1 : 0;
                                    }

                                    me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a("backward", (var10002 != 0));
                                    if (var2 == null) {
                                       break label399;
                                    }
                                 }

                                 this.a(var7);
                                 double var82;
                                 var46 = (var82 = var9 - this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) == 0.0
                                    ? 0
                                    : (var82 < 0.0 ? -1 : 1);
                              }

                              if (var2 != null) {
                                 break label401;
                              }

                              if (((Boolean)var46)) {
                                 short var57 = 10866;
                                 short var64 = 4763;
                                 me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a("jump", true);
                                 this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = -1.0;
                              }
                           }

                           var46 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                        }

                        if (var2 != null) {
                           break label467;
                        }

                        if (!((Boolean)var46)) {
                           break label545;
                        }

                        EntityHitResult var23 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .H();
                        EntityHitResult var49 = var23;
                        if (var2 == null) {
                           if (var23 == null) {
                              break label545;
                           }

                           var49 = var23;
                        }

                        if (var49.getEntity().getClass() != var4.a().getClass()) {
                           break label545;
                        }

                        byte var24 = ((byte)((me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .i()) ? 1 : 0));
                        var46 = var24;
                        if (var2 != null) {
                           break label467;
                        }

                        if (var24 == 0) {
                           break label545;
                        }

                        var46 = var23.getEntity().getId();
                        if (var2 != null) {
                           break label467;
                        }

                        if (((Integer)var46) != var4.a().getId()) {
                           break label545;
                        }

                        var46 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        if (var2 != null) {
                           break label467;
                        }

                        if (!this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
                           break label545;
                        }

                        var46 = var4.b();
                        if (var2 != null) {
                           break label467;
                        }

                        if (!((Boolean)var46)) {
                           break label545;
                        }

                        this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
                        this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(var4.a().getId());
                        if (var2 == null) {
                           break label545;
                        }
                     }

                     var46 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  }

                  if (var2 == null) {
                     if (((Boolean)(var46))) {
                        label342: {
                           label554: {
                              label340: {
                                 lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var30 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
                                 label339:
                                 if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                    .e()
                                    .d()) {
                                    label556: {
                                       var50 = var30;
                                       if (var2 == null) {
                                          if (var30 == null) {
                                             break label556;
                                          }

                                          var50 = var30;
                                       }

                                       if (var2 != null) {
                                          break label340;
                                       }

                                       if (var50.a().getId() != var4.a().getId()) {
                                          break label339;
                                       }
                                    }

                                    double var83;
                                    var46 = (
                                             var83 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .a(this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, var7)
                                                - 2.0
                                          )
                                          == 0.0
                                       ? 0
                                       : (var83 < 0.0 ? -1 : 1);
                                    if (var2 != null) {
                                       break label342;
                                    }

                                    if (((Boolean)var46)) {
                                       break label554;
                                    }
                                 }

                                 var50 = var4;
                              }

                              label323: {
                                 label322: {
                                    label557: {
                                       label320: {
                                          BlockPos var20 = var50.c();
                                          if (var20 != null) {
                                             var51 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                                ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                   .e())),
                                                ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var20)),
                                                0,
                                                false);
                                             if (var2 != null) {
                                                break label320;
                                             }

                                             if (((Boolean)(var51))) {
                                                var52 = this;
                                                if (var2 != null) {
                                                   break label322;
                                                }

                                                if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                                                   break label557;
                                                }

                                                me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
                                                   var29
                                                );
                                                if (var2 == null) {
                                                   break label557;
                                                }
                                             }
                                          }

                                          var51 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j();
                                       }

                                       label308: {
                                          label559: {
                                             if (var2 == null) {
                                                if (((Boolean)(var51))) {
                                                   boolean var53 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                                                   if (var2 == null) {
                                                      if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                                                         me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
                                                            var29
                                                         );
                                                      }

                                                      this.a(var7);
                                                      var52 = this;
                                                      if (var2 != null) {
                                                         break label322;
                                                      }

                                                      var53 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
                                                   }

                                                   if (var53) {
                                                      break label557;
                                                   }

                                                   EntityHitResult var31 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                      .H();
                                                   if (var2 != null) {
                                                      break label323;
                                                   }

                                                   if (var31 == null || var31.getEntity().getClass() != var4.a().getClass()) {
                                                      break label557;
                                                   }

                                                   me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                      .i();
                                                   if (var2 == null) {
                                                      break label557;
                                                   }
                                                }

                                                var54 = me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                                if (var2 != null) {
                                                   break label559;
                                                }

                                                var51 = me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                   .i();
                                             }

                                             if (!((Boolean)var51)) {
                                                break label308;
                                             }

                                             var54 = me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                          }

                                          ((me.octo.client.PXDyn)var54).g();
                                       }

                                       this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
                                       this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(var4.a().getId());
                                    }

                                    var52 = this;
                                 }

                                 this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var7;
                              }

                              if (var2 == null) {
                                 break label545;
                              }
                           }

                           var46 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                        }

                        if (var2 != null) {
                           break label467;
                        }

                        if (!((Boolean)var46)) {
                           break label545;
                        }

                        me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var29);
                        if (var2 == null) {
                           break label545;
                        }
                     }

                     var46 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                  }

                  if (var2 != null) {
                     break label467;
                  }

                  if (((Boolean)(var46))) {
                     me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var29);
                  }
               }

               var46 = ((java.util.function.Supplier<Object>)(() -> { me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
                  .a(1000); return null; })).get();
            }

            if (!((Boolean)var46)) {
               label257: {
                  label563: {
                     var55 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     short var58 = 10877;
                     short var65 = -17537;
                     var66 = ((java.util.function.Supplier<Object>)(() -> { this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.a(350); return null; })).get();
                     if (var2 == null) {
                        if (((Boolean)(var66))) {
                           break label563;
                        }

                        var66 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .P();
                     }

                     if (var2 == null) {
                        if (((Boolean)(var66))) {
                           break label563;
                        }

                        var66 = ((java.util.function.Supplier<Object>)(() -> { me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .i()
                           .a(300); return null; })).get();
                     }

                     if (var2 != null) {
                        break label257;
                     }

                     if (((Boolean)(var66))) {
                        var66 = true;
                        break label257;
                     }
                  }

                  var66 = false;
               }

               ((me.octo.client.PXDyn)var55).a("sneak", var66);
            }

            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var4;
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      int[] var10000 = r();
      short var10002 = 10825;
      short var10003 = -21138;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 == null && this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
         lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = !IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .d()
            ? me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
            : me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         AABB var13 = var3.a().getBoundingBox();
         var10002 = 10862;
         var10003 = 269;
         Intrinsics.checkNotNullExpressionValue(var13, "getBoundingBox(...)");
         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
            var13,
            null,
            new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var4.o()),
            1.5F,
            null,
            null,
            0.0F,
            false,
            0.0F);
         double var5 = 0.2;
         if (var2 == null && this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll != null) {
            Vec3 var7 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            boolean var8 = false;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = !IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .d()
               ? me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
               : me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               new AABB(var7.x - var5, var7.y - var5, var7.z - var5, var7.x + var5, var7.y + var5, var7.z + var5),
               null,
               new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var9.o()),
               1.5F,
               null,
               null,
               0.0F,
               false,
               0.0F);
         }

         if (this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI != null) {
            Vec3 var10 = this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
            boolean var11 = false;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var12 = !IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .d()
               ? me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
               : me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               new AABB(var10.x - var5, var10.y - var5, var10.z - var5, var10.x + var5, var10.y + var5, var10.z + var5),
               null,
               new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var12.o()),
               1.5F,
               null,
               null,
               0.0F,
               false,
               0.0F);
         }
      }
   }

   private final void a(Vec3 var1) {
      Object var8 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      int[] var2;
      float var3;
      float var9;
      label71: {
         var3 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(var1)
            .a();
         int[] var10000 = r();
         double var4 = 90.0;
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         var2 = var10000;
         double var18;
         var8 = (var18 = var3 - -var4) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
         label67:
         if (var2 == null) {
            if (((Boolean)var8)) {
               double var19;
               var8 = (var19 = var3 - var4) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
               if (var2 != null) {
                  break label67;
               }

               if (((Boolean)var8)) {
                  short var10001 = 10819;
                  short var10002 = 29663;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("forward", true);
               }
            }

            var9 = var3;
            if (var2 != null) {
               break label71;
            }

            float var20;
            var8 = (var20 = var3 - -160.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
         }

         if (((Boolean)var8)) {
            var9 = var3;
            if (var2 != null) {
               break label71;
            }

            if (var3 <= -20.0F) {
               short var12 = 10875;
               short var15 = 30802;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("left", true);
            }
         }

         var9 = var3;
      }

      label52: {
         double var6 = var9;
         double var21;
         var10 = (var21 = 20.0 - var6) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
         if (var2 == null) {
            if (((Boolean)var10)) {
               var10 = 0;
               break label52;
            }

            double var22;
            var10 = (var22 = var6 - 160.0) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
         }

         if (var2 == null) {
            var10 = ((Boolean)var10) ? 1 : 0;
         }
      }

      if (!((Boolean)var10)) {
         short var13 = 10831;
         short var16 = -11789;
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("right", true);
      }

      label44: {
         float var23;
         int var11 = (var23 = var3 - -90.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
         if (var2 == null) {
            if (var11 <= 0) {
               break label44;
            }

            float var24;
            var11 = (var24 = var3 - 90.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
         }

         if (var11 < 0) {
            return;
         }
      }

      short var14 = 10874;
      short var17 = -5395;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("backward", true);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void a(
      lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      boolean var82 = false; // PX-FIX
      Object var80 = null; // PX-FIX
      Object var73 = null; // PX-FIX
      int var71 = 0; // PX-FIX
      boolean var69 = false; // PX-FIX
      int[] var2 = r();
      if (var2 == null && this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null) {
         ClientLevel var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
         Iterable var10000 = var3.entitiesForRendering();
         short var10002 = 10859;
         short var10003 = -18492;
         Intrinsics.checkNotNullExpressionValue(var10000, "entitiesForRendering(...)");
         Iterable var5 = var10000;
         boolean var6 = false;
         var var8 = new ArrayList();
         boolean var9 = false;

         for (Object var11 : var5) {
            boolean var65 = var11 instanceof ArmorStand;
            if (var2 == null) {
               if (!var65) {
                  continue;
               }

               var8.add(var11);
            }

            if (var2 != null) {
               break;
            }
         }

         List var4 = var8;
         LivingEntity var25 = var1.a();
         Iterable var7 = var4;
         boolean var29 = false;
         var var37 = new ArrayList();
         boolean var41 = false;
         Iterator var12 = var7.iterator();

         while (true) {
            if (var12.hasNext()) {
               Object var13 = var12.next();
               ArmorStand var15 = (ArmorStand)var13;
               boolean var16 = false;
               me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var66 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               String var10001 = var15.getName().getString();
               var10003 = 10864;
               short var10004 = 27866;
               Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
               String var18 = var66.a(var10001);
               var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2 != null) {
                  break;
               }

               label287: {
                  var var19 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  boolean var20 = false;
                  var10000 = var19;
                  label260:
                  if (var2 == null) {
                     if (var19 instanceof Collection) {
                        var10000 = (Collection)var19;
                        if (var2 != null) {
                           break label260;
                        }

                        if ((!var10000.iterator().hasNext())) {
                           var69 = false;
                           break label287;
                        }
                     }

                     var10000 = var19;
                  }

                  Iterator var21 = var10000.iterator();

                  label253:
                  while (true) {
                     if (!var21.hasNext()) {
                        var69 = false;
                        break;
                     }

                     Object var22 = var21.next();
                     String var23 = (String)var22;
                     boolean var24 = false;
                     var69 = StringsKt.contains(var18, var23, false);

                     while (var69) {
                        var69 = true;
                        if (var2 == null) {
                           break label253;
                        }
                     }
                  }
               }

               if (var2 == null) {
                  if (!var69) {
                     continue;
                  }

                  var37.add(var13);
               }

               if (var2 == null) {
                  continue;
               }
            }

            var10000 = var37;
            break;
         }

         label289: {
            List var26 = ((List)(Object)(var10000));
            var7 = var26;
            boolean var30 = false;
            var10000 = var7;
            label233:
            if (var2 == null) {
               if (var7 instanceof Collection) {
                  var10000 = (Collection)var7;
                  if (var2 != null) {
                     break label233;
                  }

                  if ((!var10000.iterator().hasNext())) {
                     var71 = 0;
                     break label289;
                  }
               }

               var10000 = var7;
            }

            Iterator var33 = var10000.iterator();

            label224:
            while (true) {
               if (!var33.hasNext()) {
                  var71 = 0;
                  break;
               }

               Object var38 = var33.next();
               ArmorStand var42 = (ArmorStand)var38;
               boolean var46 = false;
               double var95;
               var71 = (
                        var95 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(
                                 me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var25),
                                 me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var42)
                              )
                           - this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                     )
                     == 0.0
                  ? 0
                  : (var95 < 0.0 ? -1 : 1);

               while (true) {
                  if (var2 == null) {
                     var71 = var71 < 0 ? 1 : 0;
                  }

                  if (var71 == 0) {
                     break;
                  }

                  var71 = 1;
                  if (var2 == null) {
                     break label224;
                  }
               }
            }
         }

         if (var71 != 0) {
            this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
            this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.add(var25.getId());
         } else {
            Iterable var31 = var4;
            var9 = false;
            var var43 = new ArrayList();
            boolean var47 = false;

            for (Object var54 : var31) {
               label208: {
                  label293: {
                     String var64;
                     ArmorStand var58 = (ArmorStand)var54;
                     boolean var62 = false;
                     me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var72 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     String var83 = var58.getName().getString();
                     var10003 = 10849;
                     short var92 = -410;
                     Intrinsics.checkNotNullExpressionValue(var83, "getString(...)");
                     var64 = var72.a(var83);
                     short var84 = 10856;
                     var10002 = -16004;
                     var73 = StringsKt.startsWith(var64, "[Lv", false);
                     label206:
                     if (var2 == null) {
                        if (!((Boolean)var73)) {
                           var73 = StringsKt.contains(var64, "⊙", false);
                           if (var2 != null) {
                              break label206;
                           }

                           if (!((Boolean)var73)) {
                              break label293;
                           }
                        }

                        var73 = StringsKt.contains(var64, "❤", false);
                     }

                     if (var2 == null) {
                        if (!((Boolean)var73)) {
                           break label293;
                        }

                        var73 = StringsKt.contains(var64, "☠", false);
                     }

                     if (var2 != null) {
                        break label208;
                     }

                     if (!((Boolean)var73)) {
                        var73 = true;
                        break label208;
                     }
                  }

                  var73 = false;
               }

               if (((Boolean)(var73))) {
                  var43.add(var54);
                  if (var2 != null) {
                     break;
                  }
               }
            }

            label294: {
               List var28 =((List)( var43));
               Iterable var35 = var28;
               boolean var39 = false;
               Iterator var44 = var35.iterator();
               var10000 = ((Iterable)(Object)(var44));
               if (var2 == null) {
                  if (!var44.hasNext()) {
                     var10000 = null;
                     break label294;
                  }

                  var10000 = (Iterable)var44.next();
               }

               Object var48 = var10000;
               var10000 = ((Iterable)(Object)(var44));
               if (var2 == null) {
                  if (!var44.hasNext()) {
                     var10000 = (Iterable)var48;
                     break label294;
                  }

                  var10000 = (Iterable)var48;
               }

               ArmorStand var51 = (ArmorStand)var10000;
               boolean var55 = false;
               me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var76 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               Vec3 var85 = var25.getEyePosition();
               var10003 = 10871;
               short var93 = -8181;
               Intrinsics.checkNotNullExpressionValue(var85, "getEyePosition(...)");
               double var52 = var76.b(
                  var85, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var51)
               );

               label171:
               while (true) {
                  Object var56 = var44.next();
                  ArmorStand var59 = (ArmorStand)var56;
                  boolean var63 = false;
                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var77 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  var85 = var25.getEyePosition();
                  var10003 = 10871;
                  var93 = -8181;
                  Intrinsics.checkNotNullExpressionValue(var85, "getEyePosition(...)");
                  double var60 = var77.b(
                     var85, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var59)
                  );
                  if (Double.compare(var52, var60) > 0) {
                     var48 = var56;
                     var52 = var60;
                  }

                  while (!var44.hasNext()) {
                     if (var2 == null) {
                        var10000 = (Iterable)var48;
                        break label171;
                     }

                     var52 = var60;
                  }
               }
            }

            label158: {
               ArmorStand var32 = (ArmorStand)var10000;
               if (var2 == null && var32 != null) {
                  Component var79 = var32.getName();
                  label152:
                  if (var79 != null) {
                     var80 = var79.getString();
                     if (var2 == null) {
                        if (var80 == null) {
                           break label152;
                        }

                        var80 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                    .aPX(var80);
                     }

                     if (var2 == null) {
                        break label158;
                     }
                  }
               }

               var80 = null;
            }

            String var36 =((String)( var80));
            if (!var1.b() && var36 != null) {
               label297: {
                  var var40 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f();
                  var41 = false;
                  var10000 = var40;
                  label139:
                  if (var2 == null) {
                     if (var40 instanceof Collection) {
                        var10000 = (Collection)var40;
                        if (var2 != null) {
                           break label139;
                        }

                        if ((!var10000.iterator().hasNext())) {
                           var82 = false;
                           break label297;
                        }
                     }

                     var10000 = var40;
                  }

                  var12 = var10000.iterator();

                  label132:
                  while (true) {
                     if (!var12.hasNext()) {
                        var82 = false;
                        break;
                     }

                     Object var53 = var12.next();
                     String var57 = (String)var53;
                     boolean var61 = false;
                     var82 = StringsKt.contains(var36, var57, false);

                     while (var82) {
                        var82 = true;
                        if (var2 == null) {
                           break label132;
                        }
                     }
                  }
               }

               if (var82) {
                  if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
                     this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a(true);
                  }
               }
            }
         }
      }
   }

   private final boolean a(
      Vec3 var1,
      Vec3 var2,
      lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3
   ) {
      Object var58 = null; // PX-FIX
      Object var54 = null; // PX-FIX
      boolean var51 = false; // PX-FIX
      Iterable var50 = null; // PX-FIX
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1, var2);
      int[] var10000 = r();
      int var6 = 0;
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var8 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[1];
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 10867;
      short var10009 = 572;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      var8[0] = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var1, var10006, var5.a(), var5.b(), true
      );
      ArrayList var7 = CollectionsKt.arrayListOf(var8);
      int[] var4 = var10000;
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24 = (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)CollectionsKt.last(
         var7
      );
      boolean var9 = true;

      while (true) {
         label220:
         if (var6 <= 100) {
            var6++;
            if (var4 != null) {
               break;
            }

            if (var4 != null) {
               continue;
            }

            me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var48 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               1.0,
               0.0,
               var24,
               false,
                0.0,
                24,
                null);
            if (var48 == null) {
               continue;
            }

            me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10 = var48;
            var24 = var10;
            var7.add(var10);
            this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var10.a();
            boolean var49 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .k();
            if (var4 == null) {
               if (var49) {
                  label230: {
                     Iterable var11 = (Iterable)(new IntRange(0, 3));
                     boolean var12 = false;
                     var50 = var11;
                     label212:
                     if (var4 == null) {
                        if (var11 instanceof Collection) {
                           var50 = (Collection)var11;
                           if (var4 != null) {
                              break label212;
                           }

                           if ((!var50.iterator().hasNext())) {
                              var51 = false;
                              break label230;
                           }
                        }

                        var50 = var11;
                     }

                     Iterator var13 = var50.iterator();

                     label203:
                     while (true) {
                        if (!var13.hasNext()) {
                           var51 = false;
                           break;
                        }

                        int var14 = ((IntIterator)var13).nextInt();
                        int var15 = var14;
                        boolean var52 = false;

                        while (true) {
                           label199: {
                              Vec3 var53 = ((me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var7.get(
                                    Math.max(0, CollectionsKt.getLastIndex(var7) - var15)
                                 ))
                                 .a()
                                 .add(0.0, 1.26, 0.0);
                              short var10002 = 10858;
                              short var10003 = 15653;
                              Intrinsics.checkNotNullExpressionValue(var53, "add(...)");
                              Vec3 var17 = var53;
                              Vec3 var18 = this.a(var3.a(), var17);
                              if (var18 != null) {
                                 double var65;
                                 var54 = (
                                          var65 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .a(var17, var18)
                                             - 2.8
                                       )
                                       == 0.0
                                    ? 0
                                    : (var65 < 0.0 ? -1 : 1);
                                 if (var4 != null) {
                                    break label199;
                                 }

                                 if (((Boolean)var54)) {
                                    var54 = 1;
                                    break label199;
                                 }
                              }

                              var54 = 0;
                           }

                           if (((Boolean)(var54))) {
                              break;
                           }

                           var51 = true;
                           if (var4 == null) {
                              break label203;
                           }
                        }
                     }
                  }

                  var9 = var51;
                  if (var4 == null) {
                     break label220;
                  }
               }

               var49 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var2, var10.a(), 0.5);
            }

            if (var4 == null) {
               if (!var49) {
                  continue;
               }

               var49 = false;
            }

            var9 = var49;
         }

         if (var4 != null) {
            return var9;
         }

         if (!var9) {
            double var66;
            int var56 = (var66 = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll - -1.0) == 0.0
               ? 0
               : (var66 < 0.0 ? -1 : 1);
            if (var4 == null) {
               var56 = (((var56 == 0) ? 1 : 0));
            }

            if ((var56 != 0)) {
               Iterable var26 = (Iterable)RangesKt.downTo(20, 0);
               lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var22 = this;
               boolean var27 = false;
               Iterable var30 = var26;
               var var32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var26, 10));
               boolean var34 = false;
               Iterator var16 = var26.iterator();

               label173: {
                  while (var16.hasNext()) {
                     int var41 = ((IntIterator)var16).nextInt();
                     boolean var19 = false;
                     var32.add(
                        ((me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var7.get(
                              Math.max(0, CollectionsKt.getLastIndex(var7) - var41)
                           ))
                           .a()
                           .add(0.0, 1.26, 0.0)
                     );
                     if (var4 != null) {
                        break label173;
                     }

                     if (var4 != null) {
                        break;
                     }
                  }

                  var26 = var32;
                  var22 = this;
                  var27 = false;
                  var30 = var26;
                  var32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var26, 10));
                  var34 = false;
               }

               label162: {
                  for (Object var42 : var30) {
                     Vec3 var44 = (Vec3)var42;
                     boolean var46 = false;
                     me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var10001 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     Intrinsics.checkNotNull(var44);
                     var32.add(TuplesKt.to(var44, var10001.c(var2, var44)));
                     if (var4 != null) {
                        break label162;
                     }

                     if (var4 != null) {
                        break;
                     }
                  }

                  var26 = var32;
                  var22 = var22;
                  var27 = false;
                  var30 = var26;
                  var32 = new ArrayList();
                  var34 = false;
               }

               label151: {
                  for (Object var43 : var30) {
                     Pair var45 = (Pair)var43;
                     boolean var47 = false;
                     double var20 = var2.y - ((Vec3)var45.getFirst()).y;
                     double var67;
                     int var57 = (var67 = 2.5 - var20) == 0.0 ? 0 : (var67 < 0.0 ? -1 : 1);
                     if (var4 != null) {
                        break label151;
                     }

                     label147: {
                        if (var4 == null) {
                           if (var57 > 0) {
                              var57 = 0;
                              break label147;
                           }

                           double var68;
                           var57 = (var68 = var20 - 6.0) == 0.0 ? 0 : (var68 < 0.0 ? -1 : 1);
                        }

                        if (var4 == null) {
                           var57 = var57 <= 0 ? 1 : 0;
                        }
                     }

                     label141: {
                        if (var57 != 0) {
                           double var69;
                           var58 = (var69 = ((Number)var45.getSecond()).doubleValue() - 6.0) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
                           if (var4 != null) {
                              break label141;
                           }

                           if (((Boolean)var58)) {
                              var58 = 1;
                              break label141;
                           }
                        }

                        var58 = 0;
                     }

                     if (!((Boolean)var58)) {
                        var32.add(var43);
                        if (var4 != null) {
                           break;
                        }
                     }
                  }

                  var26 = var32;
                  var22 = var22;
                  boolean var59 = false;
               }

               Iterator var31 = var26.iterator();

               label125:
               while (true) {
                  if (!var31.hasNext()) {
                     var10000 = null;
                     break;
                  }

                  Object var33 = var31.next();
                  var10000 = (int[])var33;

                  while (true) {
                     Pair var37 = (Pair)(Object)var10000;
                     boolean var40 = false;
                     Entity var61 = var3.a();
                     Object var64 = var37.getFirst();
                     short var10004 = 10826;
                     short var10005 = -7126;
                     Intrinsics.checkNotNullExpressionValue(var64, "<get-first>(...)");
                     if (this.a(var61, (Vec3)var64) == null) {
                        break;
                     }

                     var10000 = (int[])var33;
                     if (var4 == null) {
                        break label125;
                     }
                  }
               }

               double var63;
               label113: {
                  Pair var25 = (Pair)(Object)var10000;
                  Object var62 = var25;
                  if (var4 == null) {
                     if (var25 == null) {
                        var63 = -1.0;
                        break label113;
                     }

                     var62 = var25.getSecond();
                  }

                  var63 = ((Number)var62).doubleValue();
               }

               var22.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var63;
            }
         }
         break;
      }

      return false;
   }

   private final Vec3 a(Entity var1, Vec3 var2) {
      int var33 = 0; // PX-FIX
      int[] var3 = r();
      if (var3 == null && this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player != null) {
         LocalPlayer var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
         AABB var10000 = var1.getBoundingBox();
         short var10002 = 10876;
         short var10003 = 21169;
         Intrinsics.checkNotNullExpressionValue(var10000, "getBoundingBox(...)");
         AABB var5 = var10000;
         double var39;
         int var32 = (var39 = var2.y - var5.getCenter().y) == 0.0 ? 0 : (var39 < 0.0 ? -1 : 1);
         if (var3 == null) {
            var32 = var32 > 0 ? 1 : 0;
         }

         int var6 = var32;
         double var7 = var5.minY + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll * (var5.maxY - var5.minY);
         double var9 = var5.minY + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII * (var5.maxY - var5.minY);
         double var11 = var5.minY + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI * (var5.maxY - var5.minY);
         double var13 = var5.minY + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll * (var5.maxY - var5.minY);
         Iterable var16 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
            me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var5,
            0.0,
            0.0,
            var2,
            0.0,
            22,
            null
         );
         boolean var17 = false;
         var var19 = new ArrayList();
         boolean var20 = false;

         for (Object var22 : var16) {
            label100: {
               label112: {
                  Vec3 var23;
                  var23 = (Vec3)var22;
                  boolean var24 = false;
                  var33 = var6;
                  label98:
                  if (var3 == null) {
                     if (var6 != 0) {
                        double var40;
                        var33 = (var40 = var23.y - var13) == 0.0 ? 0 : (var40 < 0.0 ? -1 : 1);
                        if (var3 != null) {
                           break label98;
                        }

                        if (var33 > 0) {
                           double var41;
                           var33 = (var41 = var23.y - var11) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
                           if (var3 != null) {
                              break label100;
                           }

                           if (var33 < 0) {
                              break label112;
                           }
                        }
                     }

                     var33 = var6;
                  }

                  label113: {
                     if (var3 == null) {
                        if (var33 != 0) {
                           break label113;
                        }

                        double var42;
                        var33 = (var42 = var23.y - var9) == 0.0 ? 0 : (var42 < 0.0 ? -1 : 1);
                     }

                     if (var3 == null) {
                        if (var33 <= 0) {
                           break label113;
                        }

                        double var43;
                        var33 = (var43 = var23.y - var7) == 0.0 ? 0 : (var43 < 0.0 ? -1 : 1);
                     }

                     if (var3 != null) {
                        break label100;
                     }

                     if (var33 < 0) {
                        break label112;
                     }
                  }

                  var33 = 0;
                  break label100;
               }

               var33 = 1;
            }

            if (var33 != 0) {
               var19.add(var22);
               if (var3 != null) {
                  break;
               }
            }
         }

         List var15 = var19;
         ArrayList var25 = new ArrayList();
         Iterator var26 = var15.iterator();

         while (true) {
            if (var26.hasNext()) {
               Vec3 var18 = (Vec3)var26.next();
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var29 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var18, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(), var2);
               Entity var31 = var29.d();
               if (var3 != null) {
                  break;
               }

               Entity var34 = var31;
               if (var3 == null) {
                  if (var31 == null) {
                     continue;
                  }

                  var34 = var31;
               }

               int var35 = var34.getId();
               if (var3 == null) {
                  if (var35 != var1.getId()) {
                     continue;
                  }

                  var25.add(var18);
               }

               if (var3 == null) {
                  continue;
               }
            }

            if (var25.size() < 3) {
               return null;
            }
            break;
         }

         Vec3 var36 = var4.getEyePosition();
         var10002 = 10863;
         var10003 = -11067;
         Intrinsics.checkNotNullExpressionValue(var36, "getEyePosition(...)");
         Vec3 var27 = var36;
         Iterable var28 = var25;
         boolean var30 = false;
         return (Vec3)CollectionsKt.randomOrNull(
            CollectionsKt.take(
               CollectionsKt.sortedWith(
                  var28,
                  new lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var27
                  )
               ),
               10
            ),
            (Random)Random.Default
         );
      } else {
         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void l() {
      Object var50 = null; // PX-FIX
      int var41 = 0; // PX-FIX
      int[] var1 = r();
      if (var1 == null && this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player != null) {
         LocalPlayer var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
         lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
         lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = var3;
         if (var1 == null) {
            label261:
            if (var3 != null) {
               Entity var5;
               label267: {
                  int var4 = var3.a().getId();
                  var5 = var1 == null && this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null
                     ? this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level.getEntity(var4)
                     : null;
                  if (var1 == null) {
                     if (var5 != null
                        && !(((LivingEntity)var5).getHealth() < this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI)) {
                        break label267;
                     }

                     this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
                     this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(var4);
                  }

                  if (var1 == null) {
                     break label261;
                  }
               }

               this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  (LivingEntity)var5, var3.b()
               );
            }

            var10000 = var3;
         }

         label285: {
            label256: {
               if (var1 == null) {
                  if (var10000 != null) {
                     var10000 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                     if (var1 == null) {
                        if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
                           lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var22 = null;
                           double var18 = 0.0;
                           var18 = this.a(var3, var2);
                           ArrayList[] var7 = new ArrayList[]{
                              this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
                              this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
                           };
                           List var6 = CollectionsKt.listOf(var7);
                           int var25 = 0;

                           label230:
                           do {
                              int var40 = var25;

                              label227:
                              while (true) {
                                 if (var40 >= 2) {
                                    break label230;
                                 }

                                 var41 = var25;
                                 if (var1 != null) {
                                    break label285;
                                 }

                                 double var8 = var25 == 0 ? 1.0 : 0.8;
                                 Iterable var10 = (Iterable)var6.get(var25);
                                 boolean var11 = false;
                                 Iterator var12 = var10.iterator();

                                 while (true) {
                                    if (!var12.hasNext()) {
                                       break label227;
                                    }

                                    Object var13 = var12.next();
                                    lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var14 = (lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var13;
                                    boolean var15 = false;
                                    if (var1 == null) {
                                       var40 = ((this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.b(var14.a().getId())) ? 1 : 0);
                                       if (var1 != null) {
                                          break;
                                       }

                                       label212:
                                       if (var40 == 0) {
                                          double var16 = this.a(var14, var2) * 1.5 * var8;
                                          double var42 = var16;
                                          if (var1 == null) {
                                             if (!(var16 < var18)) {
                                                break label212;
                                             }

                                             var22 = var14;
                                             var42 = var16;
                                          }

                                          var18 = var42;
                                       }
                                    }

                                    if (var1 != null) {
                                       break label227;
                                    }
                                 }
                              }

                              var25++;
                           } while (var1 == null);

                           var10000 = var22;
                           if (var1 == null) {
                              if (var22 == null) {
                                 return;
                              }

                              var10000 = var22;
                           }

                           label198: {
                              BlockPos var26 = var10000.c();
                              lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var44 = this;
                              if (var1 == null) {
                                 if (!this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j()
                                    && (
                                       var26 == null
                                          || !me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
                                             me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                             var26,
                                             false,
                                             2,
                                             null)
                                    )) {
                                    break label198;
                                 }

                                 var44 = this;
                              }

                              var44.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var22;
                              if (var1 == null) {
                                 break label256;
                              }
                           }

                           this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(var22.a().getId());
                           if (var1 == null) {
                              break label256;
                           }
                        }

                        var10000 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                     }
                  } else {
                     var10000 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                  }
               }

               while (var10000 == null) {
                  lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var23 = null;
                  double var20 = 0.0;
                  var20 = Double.MAX_VALUE;
                  ArrayList[] var27 = new ArrayList[]{
                     this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
                     this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
                  };
                  List var24 = CollectionsKt.listOf(var27);
                  var41 = 0;
                  if (var1 != null) {
                     break label285;
                  }

                  int var28 = 0;

                  label188:
                  while (true) {
                     int var45 = var28;

                     label186:
                     while (true) {
                        if (var45 >= 2) {
                           break label188;
                        }

                        var41 = var28;
                        if (var1 != null) {
                           break label285;
                        }

                        double var30 = var28 == 0 ? 1.0 : 0.8;
                        Iterable var31 = (Iterable)var24.get(var28);
                        boolean var32 = false;

                        for (Object var34 : var31) {
                           lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var35 = (lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var34;
                           boolean var36 = false;
                           if (var1 == null) {
                              var45 = ((this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.b(var35.a().getId())) ? 1 : 0);
                              if (var1 != null) {
                                 continue label186;
                              }

                              label170:
                              if (var45 == 0) {
                                 double var37 = this.a(var35, var2) * var30;
                                 double var46 = var37;
                                 if (var1 == null) {
                                    if (!(var37 < var20)) {
                                       break label170;
                                    }

                                    var23 = var35;
                                    var46 = var37;
                                 }

                                 var20 = var46;
                              }
                           }

                           if (var1 != null) {
                              break;
                           }
                        }

                        var28++;
                        if (var1 != null) {
                           break label188;
                        }
                        break;
                     }
                  }

                  var10000 = var23;
                  if (var1 == null) {
                     if (var23 == null && var1 == null) {
                        break;
                     }

                     var10000 = var23;
                  }

                  label252: {
                     BlockPos var29 = var10000.c();
                     lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var48 = this;
                     if (var1 == null) {
                        if (!this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j()) {
                           if (var29 == null
                              || !me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
                                 me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                 var29,
                                 false,
                                 2,
                                 null)) {
                              break label252;
                           }

                           var48 = this;
                        } else {
                           var48 = this;
                        }
                     }

                     var48.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var23;
                     if (var1 == null) {
                        var10000 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
                        continue;
                     }
                  }

                  this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(var23.a().getId());
                  if (var1 != null) {
                     break;
                  }

                  var10000 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
               }
            }

            label141: {
               if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
                  LivingEntity var49 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a();
                  if (var49 != null) {
                     var50 = var49.getId();
                     if (var1 == null) {
                        break label141;
                     }
                  }
               }

               var50 = null;
            }

            Integer var51;
            label135: {
               if (this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll != null) {
                  LivingEntity var10001 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.a();
                  if (var10001 != null) {
                     var51 = var10001.getId();
                     if (var1 == null) {
                        break label135;
                     }
                  }
               }

               var51 = null;
            }

            var41 = ((Intrinsics.areEqual(var50, var51)) ? 1 : 0);
         }

         if (var41 == 0) {
            int var52;
            label127: {
               label298: {
                  this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
                  double var53;
                  var52 = (var53 = Random.Default.nextDouble() - 0.3) == 0.0 ? 0 : (var53 < 0.0 ? -1 : 1);
                  if (var1 == null) {
                     if (var52 >= 0) {
                        break label298;
                     }

                     var52 = ((this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) ? 1 : 0);
                  }

                  if (var1 != null) {
                     break label127;
                  }

                  if (var52 != 0) {
                     var52 = 1;
                     break label127;
                  }
               }

               var52 = 0;
            }

            this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = (var52 != 0);
         }
      }
   }

   private final void m() {
      boolean var77 = false; // PX-FIX
      boolean var76 = false; // PX-FIX
      Object var74 = null; // PX-FIX
      boolean var70 = false; // PX-FIX
      Object var63 = null; // PX-FIX
      int[] var1 = r();
      if (var1 == null && this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level != null) {
         ClientLevel var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.clear();
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.clear();
         Iterable var10000 = var2.entitiesForRendering();
         short var10002 = 10878;
         short var10003 = -16514;
         Intrinsics.checkNotNullExpressionValue(var10000, "entitiesForRendering(...)");
         Iterable var4 = var10000;
         boolean var5 = false;
         var var7 = new ArrayList();
         boolean var8 = false;

         for (Object var10 : var4) {
            boolean var61 = var10 instanceof ArmorStand;
            if (var1 == null) {
               if (!var61) {
                  continue;
               }

               var7.add(var10);
            }

            if (var1 != null) {
               break;
            }
         }

         List var3 = var7;
         Iterable var24 = var3;
         boolean var6 = false;
         var var31 = new ArrayList();
         boolean var34 = false;

         for (Object var11 : var24) {
            label217: {
               label241: {
                  String var14;
                  ArmorStand var12 = (ArmorStand)var11;
                  boolean var13 = false;
                  me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var62 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  String var10001 = var12.getName().getString();
                  var10003 = 10849;
                  short var10004 = -410;
                  Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                  var14 = var62.a(var10001);
                  short var79 = 10821;
                  var10002 = -26118;
                  var63 = StringsKt.startsWith(var14, "[Lv", false);
                  label215:
                  if (var1 == null) {
                     if (!((Boolean)var63)) {
                        var63 = StringsKt.contains(var14, "⊙", false);
                        if (var1 != null) {
                           break label215;
                        }

                        if (!((Boolean)var63)) {
                           break label241;
                        }
                     }

                     var63 = StringsKt.contains(var14, "❤", false);
                  }

                  if (var1 == null) {
                     if (!((Boolean)var63)) {
                        break label241;
                     }

                     var63 = StringsKt.contains(var14, "☠", false);
                  }

                  if (var1 != null) {
                     break label217;
                  }

                  if (!((Boolean)var63)) {
                     var63 = true;
                     break label217;
                  }
               }

               var63 = false;
            }

            if (((Boolean)(var63))) {
               var31.add(var11);
               if (var1 != null) {
                  break;
               }
            }
         }

         List var23 = var31;
         Iterable var26 = var3;
         boolean var28 = false;
         var var35 = new ArrayList();
         boolean var38 = false;

         for (Object var44 : var26) {
            ArmorStand var47 = (ArmorStand)var44;
            boolean var50 = false;
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var64 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var80 = var47.getName().getString();
            var10003 = 10849;
            short var90 = -410;
            Intrinsics.checkNotNullExpressionValue(var80, "getString(...)");
            CharSequence var65 = var64.a(var80);
            short var81 = 10865;
            var10002 = 15046;
            boolean var66 = StringsKt.contains(var65, "Black Hole", false);
            if (var1 == null) {
               if (!var66) {
                  continue;
               }

               var35.add(var44);
            }

            if (var1 != null) {
               break;
            }
         }

         List var25 = var35;
         Iterable var29 = var3;
         var8 = false;
         var var39 = new ArrayList();
         boolean var42 = false;
         Iterator var45 = var29.iterator();

         while (true) {
            if (var45.hasNext()) {
               Object var48 = var45.next();
               ArmorStand var51 = (ArmorStand)var48;
               boolean var15 = false;
               me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var67 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               String var82 = var51.getName().getString();
               var10003 = 10849;
               short var91 = -410;
               Intrinsics.checkNotNullExpressionValue(var82, "getString(...)");
               String var16 = var67.a(var82);
               var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var1 != null) {
                  break;
               }

               label244: {
                  var var17 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  boolean var18 = false;
                  var10000 = var17;
                  label174:
                  if (var1 == null) {
                     if (var17 instanceof Collection) {
                        var10000 = (Collection)var17;
                        if (var1 != null) {
                           break label174;
                        }

                        if ((!var10000.iterator().hasNext())) {
                           var70 = false;
                           break label244;
                        }
                     }

                     var10000 = var17;
                  }

                  Iterator var19 = var10000.iterator();

                  label167:
                  while (true) {
                     if (!var19.hasNext()) {
                        var70 = false;
                        break;
                     }

                     Object var20 = var19.next();
                     String var21 = (String)var20;
                     boolean var22 = false;
                     var70 = StringsKt.contains(var16, var21, false);

                     while (var70) {
                        var70 = true;
                        if (var1 == null) {
                           break label167;
                        }
                     }
                  }
               }

               if (var1 == null) {
                  if (!var70) {
                     continue;
                  }

                  var39.add(var48);
               }

               if (var1 == null) {
                  continue;
               }
            }

            var10000 = var39;
            break;
         }

         List var27 = ((List)(Object)(var10000));
         Integer var30 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         var10000 = var2.entitiesForRendering();
         var10002 = 10878;
         var10003 = -16514;
         Intrinsics.checkNotNullExpressionValue(var10000, "entitiesForRendering(...)");
         Sequence var33 = SequencesKt.filter(
            SequencesKt.map(
               SequencesKt.filter(
                  SequencesKt.map(
                     SequencesKt.filter(
                        SequencesKt.filter(
                           SequencesKt.filter(
                              SequencesKt.filter(
                                 SequencesKt.filter(
                                    SequencesKt.filter(
                                       SequencesKt.filter(
                                          CollectionsKt.asSequence(var10000),
                                          (t) -> true
                                       ),
                                       (t) -> true
                                    ),
                                    (t) -> true
                                 ),
                                 (t) -> true
                              ),
                              (t) -> true
                           ),
                           (t) -> true
                        ),
                        (t) -> true
                     ),
                     (t) -> t
                  ),
                  (t) -> true
               ),
               (t) -> t
            ),
            (t) -> true
         );
         var34 = false;

         for (Object var43 : (Iterable<?>)(var33)) {
            Pair var46 = (Pair)var43;
            boolean var49 = false;
            if (var1 == null) {
               label142: {
                  if (var1 == null) {
                     ArmorStand var72 = (ArmorStand)var46.getSecond();
                     if (var72 != null) {
                        Component var73 = var72.getName();
                        label136:
                        if (var73 != null) {
                           var74 = var73.getString();
                           if (var1 == null) {
                              if (var74 == null) {
                                 break label136;
                              }

                              var74 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                    .aPX(var74);
                           }

                           if (var1 == null) {
                              break label142;
                           }
                        }
                     }
                  }

                  var74 = null;
               }

               label127: {
                  String var52 =((String)( var74));
                  if (var52 != null) {
                     label248: {
                        var var53 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f();
                        boolean var55 = false;
                        var10000 = var53;
                        label123:
                        if (var1 == null) {
                           if (var53 instanceof Collection) {
                              var10000 = (Collection)var53;
                              if (var1 != null) {
                                 break label123;
                              }

                              if ((!var10000.iterator().hasNext())) {
                                 var76 = false;
                                 break label248;
                              }
                           }

                           var10000 = var53;
                        }

                        Iterator var56 = var10000.iterator();

                        label116:
                        while (true) {
                           if (!var56.hasNext()) {
                              var76 = false;
                              break;
                           }

                           Object var57 = var56.next();
                           String var58 = (String)var57;
                           boolean var59 = false;
                           var76 = StringsKt.contains(var52, var58, false);

                           while (var76) {
                              var76 = true;
                              if (var1 == null) {
                                 break label116;
                              }
                           }
                        }
                     }

                     if (var76) {
                        var77 = true;
                        break label127;
                     }
                  }

                  var77 = false;
               }

               label102: {
                  boolean var60 = var77;
                  lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var54 = new lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                     (LivingEntity)var46.getFirst(), var60
                  );
                  lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var78 = this;
                  if (var1 == null) {
                     if (this.a((Entity)var46.getFirst(), (ArmorStand)var46.getSecond())) {
                        this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.add(var54);
                        break label102;
                     }

                     var78 = this;
                  }

                  var78.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.add(var54);
               }

               if (var1 == null) {
                  continue;
               }
            }
            break;
         }
      }
   }

   public double a(
      @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull LocalPlayer var2
   ) {
      short var10001 = 10855;
      short var10002 = -29180;
      Intrinsics.checkNotNullParameter(var1, "mob");
      var10001 = 10853;
      var10002 = -4336;
      Intrinsics.checkNotNullParameter(var2, "player");
      return 0.0;
   }

   public boolean a(@NotNull Entity var1, @Nullable ArmorStand var2) {
      short var10001 = 10851;
      short var10002 = -15166;
      Intrinsics.checkNotNullParameter(var1, "entity");
      return false;
   }

   private final void n() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .v();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
   }

   public boolean o() {
      int[] var10000 = r();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
      int[] var1 = var10000;
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2);
      me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            new me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var2.b(), var2.a(), var2.d(), var2.c()
            )
         );
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = this.p();
      int var3 = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
      if (var1 == null) {
         if (this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII == -1) {
            this.q();
            return false;
         }

         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = null;
         short var4 = 10828;
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
         short var10001 = 22415;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Start");
         var3 = 1;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new int[5]);
      }

      return (var3 != 0);
   }

   public int p() {
      int[] var1 = r();
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h());
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = var10000;
      if (var1 == null) {
         if (var10000 != null) {
            return var10000.b();
         }

         var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .q();
         var10001 = var10000;
      }

      if (var1 == null) {
         if (var10001 != null) {
            return var10000.b();
         }

         if (var1 != null) {
            return null != null ? null : -1;
         }

         var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .n();
         var10001 = var10000;
      }

      if (var10001 != null) {
         Integer var2 = var10000.b();
         return var2 != null ? var2 : -1;
      } else {
         return null != null ? null : -1;
      }
   }

   public void q() {
      short var10000 = 10823;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
      short var10001 = -31019;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
      this.n();
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
         );
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Stop");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private static final ArmorStand a(List<? extends ArmorStand> var0, Entity var1) {
      Iterable var3 = var0;
      boolean var4 = false;
      int[] var10000 = r();
      Iterator var5 = var3.iterator();
      int[] var2 = var10000;
      var10000 = (int[])(Object)var5;
      if (var2 == null) {
         if (!var5.hasNext()) {
            return (ArmorStand)null;
         }

         var10000 = (int[])var5.next();
      }

      Object var6 = var10000;
      var10000 = (int[])(Object)var5;
      if (var2 == null) {
         if (!var5.hasNext()) {
            return (ArmorStand)var6;
         }

         var10000 = (int[])var6;
      }

      ArmorStand var7 = (ArmorStand)(Object)var10000;
      boolean var9 = false;
      me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var10001 = var1.getEyePosition();
      short var10003 = 10871;
      short var10004 = -8181;
      Intrinsics.checkNotNullExpressionValue(var10001, "getEyePosition(...)");
      double var13 = var18.b(
         var10001, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7)
      );

      while (true) {
         Object var14 = var5.next();
         ArmorStand var10 = (ArmorStand)var14;
         boolean var12 = false;
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var19 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var10001 = var1.getEyePosition();
         var10003 = 10871;
         var10004 = -8181;
         Intrinsics.checkNotNullExpressionValue(var10001, "getEyePosition(...)");
         double var15 = var19.b(
            var10001, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10)
         );
         if (Double.compare(var13, var15) > 0) {
            var6 = var14;
            var13 = var15;
         }

         while (!var5.hasNext()) {
            if (var2 == null) {
               return (ArmorStand)var6;
            }

            var13 = var15;
         }
      }
   }

   private static final boolean a(Integer var0, Entity var1) {
      int[] var2 = r();
      Entity var10000 = var1;
      if (var2 == null) {
         short var10001 = 10851;
         short var10002 = -15166;
         Intrinsics.checkNotNullParameter(var1, "entity");
         if (var0 == null) {
            return (1 != 0);
         }

         var10000 = var1;
      }

      int var3 = var10000.getId();
      if (var2 != null) {
         return (var3 != 0);
      } else {
         return !(var3 != var0);
      }
   }

   private static final boolean a(lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var0, Entity var1) {
      int[] var2;
      Object var9;
      short var10001 = 10851;
      short var10002 = -15166;
      Intrinsics.checkNotNullParameter(var1, "entity");
      var9 = r();
      var var3 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d();
      var2 = (int[])var9;
      boolean var4 = false;
      var9 = var3;
      label36:
      if (var2 == null) {
         if (var3 instanceof Collection) {
            var9 = (Collection)var3;
            if (var2 != null) {
               break label36;
            }

            if (((me.octo.client.PXDyn)var9).isEmpty()) {
               return false;
            }
         }

         var9 = var3;
      }

      for (Object var6 : (Iterable<?>)(var9)) {
         Class var7 = (Class)var6;
         boolean var8 = false;
         boolean var10 = Intrinsics.areEqual(var7, var1.getClass());

         while (var10) {
            var10 = true;
            if (var2 == null) {
               return true;
            }
         }
      }

      return false;
   }

   private static final boolean b(lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var0, Entity var1) {
      int[] var10000 = r();
      short var10002 = 10824;
      short var10003 = -164;
      Intrinsics.checkNotNullParameter(var1, "it");
      int[] var2 = var10000;
      boolean var3 = var0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.contains(var1.getId());
      if (var2 == null) {
         if (var3) {
            return false;
         }

         var3 = var0.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.b(var1.getId());
      }

      return var2 != null ? var3 : !var3;
   }

   private static final boolean a(Integer var0, lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var1, Entity var2) {
      boolean var11 = false; // PX-FIX
      Object var10 = null; // PX-FIX
      int[] var10000 = r();
      short var10002 = 10830;
      short var10003 = -8609;
      Intrinsics.checkNotNullParameter(var2, "entity");
      int[] var3 = var10000;
      if (var0 == null) {
         label47: {
            var var4 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
            boolean var5 = false;
            var10 = var4;
            label41:
            if (var3 == null) {
               if (var4 instanceof Collection) {
                  var10 = (Collection)var4;
                  if (var3 != null) {
                     break label41;
                  }

                  if (((me.octo.client.PXDyn)var10).isEmpty()) {
                     var11 = false;
                     break label47;
                  }
               }

               var10 = var4;
            }

            Iterator var6 = ((me.octo.client.PXDyn)var10).iterator();

            label34:
            while (true) {
               if (!var6.hasNext()) {
                  var11 = false;
                  break;
               }

               Object var7 = var6.next();
               AABB var8 = (AABB)var7;
               boolean var9 = false;
               var11 = var8.contains(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2));

               while (var11) {
                  var11 = true;
                  if (var3 == null) {
                     break label34;
                  }
               }
            }
         }

         if (!var11) {
            return false;
         }
      }

      return true;
   }

   private static final boolean b(Integer var0, lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var1, Entity var2) {
      boolean var11 = false; // PX-FIX
      Object var10 = null; // PX-FIX
      int[] var10000 = r();
      short var10002 = 10851;
      short var10003 = -15166;
      Intrinsics.checkNotNullParameter(var2, "entity");
      int[] var3 = var10000;
      if (var0 == null) {
         label47: {
            var var4 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
            boolean var5 = false;
            var10 = var4;
            label41:
            if (var3 == null) {
               if (var4 instanceof Collection) {
                  var10 = (Collection)var4;
                  if (var3 != null) {
                     break label41;
                  }

                  if (((me.octo.client.PXDyn)var10).isEmpty()) {
                     var11 = false;
                     break label47;
                  }
               }

               var10 = var4;
            }

            Iterator var6 = ((me.octo.client.PXDyn)var10).iterator();

            label34:
            while (true) {
               if (!var6.hasNext()) {
                  var11 = false;
                  break;
               }

               Object var7 = var6.next();
               AABB var8 = (AABB)var7;
               boolean var9 = false;
               var11 = var8.contains(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2));

               while (var11) {
                  var11 = true;
                  if (var3 == null) {
                     break label34;
                  }
               }
            }
         }

         if (var11) {
            return false;
         }
      }

      return true;
   }

   private static final boolean c(Integer var0, lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var1, Entity var2) {
      boolean var11 = false; // PX-FIX
      Object var10 = null; // PX-FIX
      int[] var10000 = r();
      short var10002 = 10851;
      short var10003 = -15166;
      Intrinsics.checkNotNullParameter(var2, "entity");
      int[] var3 = var10000;
      if (var0 == null) {
         label47: {
            var var4 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
            boolean var5 = false;
            var10 = var4;
            label41:
            if (var3 == null) {
               if (var4 instanceof Collection) {
                  var10 = (Collection)var4;
                  if (var3 != null) {
                     break label41;
                  }

                  if (((me.octo.client.PXDyn)var10).isEmpty()) {
                     var11 = false;
                     break label47;
                  }
               }

               var10 = var4;
            }

            Iterator var6 = ((me.octo.client.PXDyn)var10).iterator();

            label34:
            while (true) {
               if (!var6.hasNext()) {
                  var11 = false;
                  break;
               }

               Object var7 = var6.next();
               String var8 = (String)var7;
               boolean var9 = false;
               String var12 = var2.getName().getString();
               var10002 = 10849;
               var10003 = -410;
               Intrinsics.checkNotNullExpressionValue(var12, "getString(...)");
               var11 = StringsKt.contains(var12, var8, true);

               while (var11) {
                  var11 = true;
                  if (var3 == null) {
                     break label34;
                  }
               }
            }
         }

         if (!var11) {
            return false;
         }
      }

      return true;
   }

   private static final boolean a(List var0, lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var1, Entity var2) {
      Object var11 = null; // PX-FIX
      int[] var3;
      int var12;
      label56: {
         int[] var10000 = r();
         short var10002 = 10824;
         short var10003 = -164;
         Intrinsics.checkNotNullParameter(var2, "it");
         var3 = var10000;
         var var5 = var0;
         boolean var6 = false;
         var11 = var5;
         label52:
         if (var3 == null) {
            if (var5 instanceof Collection) {
               var11 = (Collection)var5;
               if (var3 != null) {
                  break label52;
               }

               if (((me.octo.client.PXDyn)var11).isEmpty()) {
                  var12 = 1;
                  break label56;
               }
            }

            var11 = var5;
         }

         Iterator var7 = ((me.octo.client.PXDyn)var11).iterator();

         label43:
         while (true) {
            if (!var7.hasNext()) {
               var12 = 1;
               break;
            }

            Object var8 = var7.next();
            ArmorStand var9 = (ArmorStand)var8;
            boolean var10 = false;
            me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var13 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Vec3 var10001 = var2.getEyePosition();
            var10003 = 10871;
            short var10004 = -8181;
            Intrinsics.checkNotNullExpressionValue(var10001, "getEyePosition(...)");
            double var16;
            var12 = (
                     var16 = var13.b(
                           var10001, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var9)
                        )
                        - var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  )
                  == 0.0
               ? 0
               : (var16 < 0.0 ? -1 : 1);

            while (true) {
               if (var3 == null) {
                  var12 = var12 > 0 ? 1 : 0;
               }

               if (var12 != 0) {
                  break;
               }

               var12 = 0;
               if (var3 == null) {
                  break label43;
               }
            }
         }
      }

      int var4 = var12;
      var12 = var4;
      if (var3 == null) {
         if (var4 == 0) {
            var1.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.add(var2.getId());
         }

         var12 = var4;
      }

      return (var12 != 0);
   }

   private static final Pair b(List var0, Entity var1) {
      short var10001 = 10824;
      short var10002 = -164;
      Intrinsics.checkNotNullParameter(var1, "it");
      return TuplesKt.to(var1, a(var0, var1));
   }

   private static final boolean a(List var0, Pair var1) {
      int[] var2;
      Object var9;
      var9 = r();
      short var10002 = 10872;
      short var10003 = -13698;
      Intrinsics.checkNotNullParameter(var1, "pair");
      var2 = (int[])var9;
      var var3 = var0;
      boolean var4 = false;
      var9 = var3;
      label44:
      if (var2 == null) {
         if (var3 instanceof Collection) {
            var9 = (Collection)var3;
            if (var2 != null) {
               break label44;
            }

            if (((me.octo.client.PXDyn)var9).isEmpty()) {
               return (1 != 0);
            }
         }

         var9 = var3;
      }

      label35:
      for (Object var6 : (Iterable<?>)(var9)) {
         ArmorStand var7 = (ArmorStand)var6;
         boolean var8 = false;
         var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Object var10001 = var1.getFirst();
         var10003 = 10879;
         short var10004 = 3714;
         Intrinsics.checkNotNullExpressionValue(var10001, "<get-first>(...)");
         double var13;
         int var10 = (
                  var13 = (Double)((me.octo.client.PXDyn)var9).b(
                        me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((Entity)var10001),
                        me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7)
                     )
                     - 16.0
               )
               == 0.0
            ? 0
            : (var13 < 0.0 ? -1 : 1);

         do {
            if (var2 == null) {
               var10 = var10 > 0 ? 1 : 0;
            }

            if (var10 != 0) {
               continue label35;
            }

            var10 = 0;
         } while (var2 != null);

         return (0 != 0);
      }

      return (1 != 0);
   }

   private static final Pair a(Pair var0) {
      short var10001 = 10824;
      short var10002 = -164;
      Intrinsics.checkNotNullParameter(var0, "it");
      Object var10000 = var0.getFirst();
      var10002 = 10854;
      short var10003 = -11891;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type net.minecraft.world.entity.LivingEntity");
      return TuplesKt.to((LivingEntity)var10000, var0.getSecond());
   }

   private static final boolean a(lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI var0, Pair var1) {
      int[] var10000 = r();
      short var10002 = 10816;
      short var10003 = -1273;
      Intrinsics.checkNotNullParameter(var1, "it");
      int[] var2 = var10000;
      float var4;
      int var3 = (
               var4 = ((LivingEntity)var1.getFirst()).getHealth() - var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )
            == 0.0F
         ? 0
         : (var4 < 0.0F ? -1 : 1);
      if (var2 == null) {
         var3 = var3 > 0 ? 1 : 0;
      }

      return (var3 != 0);
   }

   public static void b(int[] var0) {
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var0;
   }

   public static int[] r() {
      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[47];
      int var3 = 0;
      String var2 = "\u0098ª±_p\u0086T¸óÌÜ«m±ÐÜDß\u0099\u00131.\u0084ÈÀ\u0083¨\u0001\u008f\u0096\u0019,¤\u0019é\u001dcç}\u0005=AV\u007f¤\u0011\u0097l©Ê>ì\"É1%\u0006Ñ|b\u0094l)\b\\Mÿèê\f.\u0094\u0019\u001f-\u0003î=â\u008e¼í¸À\u0014SB\u0010=Å\u00869á\u001aNóQ=\u0003\u008fKê\u0007\u009då0T1]&L\u0081Z¢}F?;Q÷»¨\u0006\u009f7*ÿ]\u0002Ao\u0010qk\u009f§íIÆ\u0003¤\u008aÔ\u0017ÕÞ^61\u0006\"5eó±\u0002w(\u0092é¼\nGDÐtô\u0096 \n(X\u0099\u00800¹Ù\u0005Åd-½ós53\u0089\u0003\u0091\u0015Í\u000fÑJ\td$6ÿ(Ïê3½\u0084R\t\u0006Yvi×ÖÌ\b¸ª\u0007òK+4\u009b\u0006HMéâ`s\b¯X\u0081J%X×\u001e\u000eÛMÙ²f\u000féd\u00adZ\u0091\u009bå\u0007\u0019x>ï\u008c ®=5\u009b\u0089\u000e2\u008a\u0086+¥¢\u0095Õ\u0083\u0087\u0002@ØK\u0010\u0001Â£&CJ?FcÝÎº\u001câ\u0091-\u0013æI~#\u0089\tkI\u0014ò lòI#Ã:<V\u00054á£\u007f\u0005\b@L\u0018.¨°Hè\u0004£\u008c®\u00ad\u00044ÝÌ\u0005\n\u0088\u007f0\rýzî\u009b«ì\u0010{3Ígþí¾\u0016ð±YÂÞíÉÌ\u0013¿æUÑú ïeg\u001a\u0004½\u0007+\u009d[í/¬\r\u0001O{ü[J4>~©¾µ\u008b\u0004÷æàÿ\u0004ÂHO#\u0004¬å\u008b\u009f\u000e\u0016\u008a`JQ\u0010\u000f\u0087q&\n\u0014\u0096ö\nØ\u008e-ÒPgòpÀ´\u0006¸8÷L£¦\u0005\u0014!\u0084\u0089¼\u00053 c\r\u0086\u0015R\u001e»nöæ¾\u009dÞ/U`Ýé\u008aj\u0085\u0012FÏi\u00100½\u0085É\u0087·§ùp*¬DP=\u0018Ö\u0006Ò)f@Õ×\u0002\u0089ý\u0005µkG:\u0086\u000f\u0098M\u0012þx>ü)\n\u001a§#ßª¤\u0004Ø\"\u0010O\u0016A¸\u000b¦kH§HaÐÙ WúXb°)Dø\u0014e\u0003á\u001b'\u0010óìÖú*É\u0017`¾óÅìá\u0083§æ";
      int var4 = "\u0098ª±_p\u0086T¸óÌÜ«m±ÐÜDß\u0099\u00131.\u0084ÈÀ\u0083¨\u0001\u008f\u0096\u0019,¤\u0019é\u001dcç}\u0005=AV\u007f¤\u0011\u0097l©Ê>ì\"É1%\u0006Ñ|b\u0094l)\b\\Mÿèê\f.\u0094\u0019\u001f-\u0003î=â\u008e¼í¸À\u0014SB\u0010=Å\u00869á\u001aNóQ=\u0003\u008fKê\u0007\u009då0T1]&L\u0081Z¢}F?;Q÷»¨\u0006\u009f7*ÿ]\u0002Ao\u0010qk\u009f§íIÆ\u0003¤\u008aÔ\u0017ÕÞ^61\u0006\"5eó±\u0002w(\u0092é¼\nGDÐtô\u0096 \n(X\u0099\u00800¹Ù\u0005Åd-½ós53\u0089\u0003\u0091\u0015Í\u000fÑJ\td$6ÿ(Ïê3½\u0084R\t\u0006Yvi×ÖÌ\b¸ª\u0007òK+4\u009b\u0006HMéâ`s\b¯X\u0081J%X×\u001e\u000eÛMÙ²f\u000féd\u00adZ\u0091\u009bå\u0007\u0019x>ï\u008c ®=5\u009b\u0089\u000e2\u008a\u0086+¥¢\u0095Õ\u0083\u0087\u0002@ØK\u0010\u0001Â£&CJ?FcÝÎº\u001câ\u0091-\u0013æI~#\u0089\tkI\u0014ò lòI#Ã:<V\u00054á£\u007f\u0005\b@L\u0018.¨°Hè\u0004£\u008c®\u00ad\u00044ÝÌ\u0005\n\u0088\u007f0\rýzî\u009b«ì\u0010{3Ígþí¾\u0016ð±YÂÞíÉÌ\u0013¿æUÑú ïeg\u001a\u0004½\u0007+\u009d[í/¬\r\u0001O{ü[J4>~©¾µ\u008b\u0004÷æàÿ\u0004ÂHO#\u0004¬å\u008b\u009f\u000e\u0016\u008a`JQ\u0010\u000f\u0087q&\n\u0014\u0096ö\nØ\u008e-ÒPgòpÀ´\u0006¸8÷L£¦\u0005\u0014!\u0084\u0089¼\u00053 c\r\u0086\u0015R\u001e»nöæ¾\u009dÞ/U`Ýé\u008aj\u0085\u0012FÏi\u00100½\u0085É\u0087·§ùp*¬DP=\u0018Ö\u0006Ò)f@Õ×\u0002\u0089ý\u0005µkG:\u0086\u000f\u0098M\u0012þx>ü)\n\u001a§#ßª¤\u0004Ø\"\u0010O\u0016A¸\u000b¦kH§HaÐÙ WúXb°)Dø\u0014e\u0003á\u001b'\u0010óìÖú*É\u0017`¾óÅìá\u0083§æ"
         .length();
      b(null);
      char var1 = 19;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 81;
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
                     case 0 -> 72;
                     case 1 -> 68;
                     case 2 -> 47;
                     case 3 -> 114;
                     case 4 -> 77;
                     case 5 -> 39;
                     default -> 100;
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
                     b = new String[47];
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

                  var2 = "\u0096\u0007]\u009e/ p\u0002\u0084\u0089";
                  var4 = "\u0096\u0007]\u009e/ p\u0002\u0084\u0089".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 19;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 10862) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 0;
            case 1 -> 103;
            case 2 -> 41;
            case 3 -> 48;
            case 4 -> 6;
            case 5 -> 90;
            case 6 -> 97;
            case 7 -> 167;
            case 8 -> 101;
            case 9 -> 218;
            case 10 -> 194;
            case 11 -> 198;
            case 12 -> 58;
            case 13 -> 116;
            case 14 -> 61;
            case 15 -> 114;
            case 16 -> 245;
            case 17 -> 76;
            case 18 -> 161;
            case 19 -> 199;
            case 20 -> 232;
            case 21 -> 168;
            case 22 -> 117;
            case 23 -> 135;
            case 24 -> 94;
            case 25 -> 47;
            case 26 -> 176;
            case 27 -> 35;
            case 28 -> 106;
            case 29 -> 182;
            case 30 -> 40;
            case 31 -> 123;
            case 32 -> 42;
            case 33 -> 69;
            case 34 -> 143;
            case 35 -> 179;
            case 36 -> 158;
            case 37 -> 59;
            case 38 -> 180;
            case 39 -> 173;
            case 40 -> 118;
            case 41 -> 21;
            case 42 -> 22;
            case 43 -> 203;
            case 44 -> 84;
            case 45 -> 33;
            case 46 -> 252;
            case 47 -> 185;
            case 48 -> 146;
            case 49 -> 248;
            case 50 -> 44;
            case 51 -> 32;
            case 52 -> 254;
            case 53 -> 253;
            case 54 -> 72;
            case 55 -> 148;
            case 56 -> 70;
            case 57 -> 83;
            case 58 -> 24;
            case 59 -> 249;
            case 60 -> 240;
            case 61 -> 86;
            case 62 -> 217;
            case 63 -> 110;
            case 64 -> 224;
            case 65 -> 214;
            case 66 -> 171;
            case 67 -> 186;
            case 68 -> 12;
            case 69 -> 1;
            case 70 -> 119;
            case 71 -> 223;
            case 72 -> 34;
            case 73 -> 56;
            case 74 -> 187;
            case 75 -> 139;
            case 76 -> 55;
            case 77 -> 18;
            case 78 -> 46;
            case 79 -> 244;
            case 80 -> 49;
            case 81 -> 142;
            case 82 -> 209;
            case 83 -> 235;
            case 84 -> 154;
            case 85 -> 64;
            case 86 -> 27;
            case 87 -> 163;
            case 88 -> 230;
            case 89 -> 178;
            case 90 -> 8;
            case 91 -> 174;
            case 92 -> 23;
            case 93 -> 5;
            case 94 -> 190;
            case 95 -> 115;
            case 96 -> 43;
            case 97 -> 122;
            case 98 -> 220;
            case 99 -> 130;
            case 100 -> 132;
            case 101 -> 60;
            case 102 -> 108;
            case 103 -> 141;
            case 104 -> 126;
            case 105 -> 125;
            case 106 -> 162;
            case 107 -> 177;
            case 108 -> 205;
            case 109 -> 210;
            case 110 -> 145;
            case 111 -> 221;
            case 112 -> 239;
            case 113 -> 120;
            case 114 -> 159;
            case 115 -> 131;
            case 116 -> 19;
            case 117 -> 241;
            case 118 -> 243;
            case 119 -> 112;
            case 120 -> 251;
            case 121 -> 242;
            case 122 -> 50;
            case 123 -> 156;
            case 124 -> 188;
            case 125 -> 233;
            case 126 -> 92;
            case 127 -> 127;
            case 128 -> 152;
            case 129 -> 39;
            case 130 -> 68;
            case 131 -> 71;
            case 132 -> 183;
            case 133 -> 65;
            case 134 -> 238;
            case 135 -> 78;
            case 136 -> 31;
            case 137 -> 202;
            case 138 -> 102;
            case 139 -> 30;
            case 140 -> 229;
            case 141 -> 206;
            case 142 -> 82;
            case 143 -> 201;
            case 144 -> 99;
            case 145 -> 73;
            case 146 -> 160;
            case 147 -> 7;
            case 148 -> 208;
            case 149 -> 51;
            case 150 -> 175;
            case 151 -> 247;
            case 152 -> 151;
            case 153 -> 11;
            case 154 -> 13;
            case 155 -> 216;
            case 156 -> 36;
            case 157 -> 17;
            case 158 -> 212;
            case 159 -> 134;
            case 160 -> 96;
            case 161 -> 155;
            case 162 -> 104;
            case 163 -> 149;
            case 164 -> 62;
            case 165 -> 29;
            case 166 -> 74;
            case 167 -> 181;
            case 168 -> 88;
            case 169 -> 166;
            case 170 -> 195;
            case 171 -> 170;
            case 172 -> 165;
            case 173 -> 38;
            case 174 -> 150;
            case 175 -> 164;
            case 176 -> 137;
            case 177 -> 207;
            case 178 -> 200;
            case 179 -> 231;
            case 180 -> 128;
            case 181 -> 77;
            case 182 -> 236;
            case 183 -> 3;
            case 184 -> 219;
            case 185 -> 105;
            case 186 -> 124;
            case 187 -> 250;
            case 188 -> 93;
            case 189 -> 113;
            case 190 -> 204;
            case 191 -> 225;
            case 192 -> 226;
            case 193 -> 67;
            case 194 -> 193;
            case 195 -> 95;
            case 196 -> 169;
            case 197 -> 157;
            case 198 -> 45;
            case 199 -> 213;
            case 200 -> 153;
            case 201 -> 14;
            case 202 -> 28;
            case 203 -> 100;
            case 204 -> 57;
            case 205 -> 52;
            case 206 -> 53;
            case 207 -> 111;
            case 208 -> 4;
            case 209 -> 211;
            case 210 -> 184;
            case 211 -> 255;
            case 212 -> 89;
            case 213 -> 107;
            case 214 -> 66;
            case 215 -> 129;
            case 216 -> 246;
            case 217 -> 109;
            case 218 -> 140;
            case 219 -> 234;
            case 220 -> 20;
            case 221 -> 75;
            case 222 -> 189;
            case 223 -> 81;
            case 224 -> 10;
            case 225 -> 80;
            case 226 -> 144;
            case 227 -> 147;
            case 228 -> 2;
            case 229 -> 172;
            case 230 -> 26;
            case 231 -> 37;
            case 232 -> 16;
            case 233 -> 138;
            case 234 -> 227;
            case 235 -> 222;
            case 236 -> 237;
            case 237 -> 136;
            case 238 -> 191;
            case 239 -> 63;
            case 240 -> 215;
            case 241 -> 192;
            case 242 -> 15;
            case 243 -> 196;
            case 244 -> 228;
            case 245 -> 91;
            case 246 -> 79;
            case 247 -> 197;
            case 248 -> 87;
            case 249 -> 121;
            case 250 -> 54;
            case 251 -> 85;
            case 252 -> 9;
            case 253 -> 98;
            case 254 -> 133;
            default -> 25;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private ArrayList<Pair<Integer, Long>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
      private static String a;

      @NotNull
      public final ArrayList<Pair<Integer, Long>> a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(@NotNull ArrayList<Pair<Integer, Long>> var1) {
         Intrinsics.checkNotNullParameter(var1, a);
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final int b() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
      }

      public final void a(int var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(new Pair(var1, System.currentTimeMillis()));
      }

      public final boolean b(int var1) {
         int[] var2;
         Object var9;
         var var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var9 = lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.r();
         boolean var4 = false;
         var2 = (int[])var9;
         var9 = var3;
         label44:
         if (var2 == null) {
            if (var3 instanceof Collection) {
               var9 = var3;
               if (var2 != null) {
                  break label44;
               }

               if (((me.octo.client.PXDyn)var9).isEmpty()) {
                  return (0 != 0);
               }
            }

            var9 = var3;
         }

         label35:
         for (Object var6 : (Iterable<?>)(var9)) {
            Pair var7 = (Pair)var6;
            boolean var8 = false;
            int var10 = ((Number)var7.getFirst()).intValue();

            do {
               if (var2 == null) {
                  var10 = var10 == var1 ? 1 : 0;
               }

               if (var10 == 0) {
                  continue label35;
               }

               var10 = 1;
            } while (var2 != null);

            return (1 != 0);
         }

         return (0 != 0);
      }

      public final void c() {
      Object var7 = null; // PX-FIX
         ArrayList var2 = new ArrayList();
         int[] var10000 = lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.r();
         long var3 = System.currentTimeMillis();
         int[] var1 = var10000;
         int var5 = 0;
         int var6 = CollectionsKt.getLastIndex(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         if (var1 == null) {
            if (var5 <= var6) {
               do {
                  label23: {
                     if (var3
                           - ((Number)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var5).getSecond())
                              .longValue()
                        < 3000L) {
                        var7 = var2.add(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var5));
                        if (var1 != null) {
                           break label23;
                        }
                     }

                     var7 = var5;
                  }

                  if ((Boolean)var7 == ((var6 == 0))) {
                     break;
                  }

                  var5++;
               } while (var1 == null);
            }

            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var2;
         }
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         char[] var10003 = "Ebn_Q[B".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 15;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 15;
            var10006 = var0;
         } else {
            var6 = 15;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 15;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 118;
               case 1 -> 30;
               case 2 -> 4;
               case 3 -> 36;
               case 4 -> 115;
               case 5 -> 107;
               default -> 115;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
         }
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final LivingEntity IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String a;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull LivingEntity var1, boolean var2) {
         Intrinsics.checkNotNullParameter(var1, a);
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final LivingEntity a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(boolean var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      @Nullable
      public final BlockPos c() {
         return me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         char[] var10003 = "@1!DXd".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 33;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 33;
            var10006 = var0;
         } else {
            var6 = 33;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 33;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 4;
               case 1 -> 126;
               case 2 -> 116;
               case 3 -> 12;
               case 4 -> 13;
               case 5 -> 60;
               default -> 14;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
         }
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, boolean p1, Integer p2, Integer p3, int p4, int p5, int p6, int p7, int m, Object mk) {
      if ((m & 1) != 0) {
         p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((m & 2) != 0) {
         p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((m & 4) != 0) {
         p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((m & 8) != 0) {
         p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      if ((m & 16) != 0) {
         p5 = p0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }
      if ((m & 32) != 0) {
         p6 = p0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }
      if ((m & 64) != 0) {
         p7 = p0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }
      return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(p1, p2, p3, p4, p5, p6, p7);
   }

      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final Integer lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         boolean var1, @Nullable Integer var2, @Nullable Integer var3, int var4, int var5, int var6, int var7
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Integer b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Integer i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         boolean var1, @Nullable Integer var2, @Nullable Integer var3, int var4, int var5, int var6, int var7
      ) {
         return new lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 32499;
         int var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         int var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         int var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Integer var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Integer var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 12632;
         short var10002 = 32496;
         byte var10003 = -45;
         short var10004 = 32500;
         short var10005 = -23597;
         short var10006 = 32497;
         short var10007 = -3638;
         short var10008 = 32502;
         short var10009 = -16509;
         short var10010 = 32498;
         short var10011 = 919;
         short var10012 = 32501;
         short var10013 = -2839;
         return "ProgressSnapshot(enabled="
            + var7
            + ", targetId="
            + var6
            + ", targetHealth="
            + var5
            + ", mobs="
            + var4
            + ", priorityMobs="
            + var3
            + ", deletedIds="
            + var2
            + ", temporaryDeletedIds="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int[] var1;
         int var9;
         int var11;
         label29: {
            int[] var10000 = lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.r();
            int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var9 = var2 * 31;
            Integer var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 == null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var11 = 0;
                  break label29;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var11 = var10001.hashCode();
         }

         label23: {
            int var3 = var9 + var11;
            var9 = var3 * 31;
            Integer var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 == null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var11 = 0;
                  break label23;
               }

               var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var11 = var12.hashCode();
         }

         int var4 = var9 + var11;
         var4 = var4 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var4 = var4 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var4 = var4 * 31 + Integer.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         var4 = var4 * 31 + Integer.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         if (var1 != null) {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
            );
         }

         return var4;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.r();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         if (var2 == null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         int var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var2 == null) {
            if (var4 != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            var10001 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var2 == null) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var10001 = var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         if (var2 == null) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var2 != null) {
               return (boolean)(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != 0);
            }

            var10001 = var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "îßØRÜüÛ/\u0019£\u0092\u0007$\b\u0098¦þ¹Õ\r\u000f¾ôzU\u007f&\f¸Ùwg§\u0019dda;\u0093\u0015$W(A±´\u0094\u0099¯À\u0087küYGEAõ0\u000f%p¡§óB>ø¤XXá®¬]";
         int var4 = "îßØRÜüÛ/\u0019£\u0092\u0007$\b\u0098¦þ¹Õ\r\u000f¾ôzU\u007f&\f¸Ùwg§\u0019dda;\u0093\u0015$W(A±´\u0094\u0099¯À\u0087küYGEAõ0\u000f%p¡§óB>ø¤XXá®¬]"
            .length();
         char var1 = 11;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 50;
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
                        case 0 -> 127;
                        case 1 -> 118;
                        case 2 -> 67;
                        case 3 -> 86;
                        case 4 -> 83;
                        case 5 -> 34;
                        default -> 7;
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
                        b = new String[7];
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

                     var2 = "ÏÝ´^\u0006¦>ß\u008e%AÛÏ\u008aRnv÷I¦k\u0006\u000fZ\u0093\u0002\u0080P\u0097m\u001eOnúó\rÞµ";
                     var4 = "ÏÝ´^\u0006¦>ß\u008e%AÛÏ\u008aRnv÷I¦k\u0006\u000fZ\u0093\u0002\u0080P\u0097m\u001eOnúó\rÞµ".length();
                     var1 = 22;
                     var8 = -1;
               }

               var10000 = 114;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 32496) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 89;
               case 1 -> 139;
               case 2 -> 140;
               case 3 -> 2;
               case 4 -> 207;
               case 5 -> 117;
               case 6 -> 192;
               case 7 -> 88;
               case 8 -> 214;
               case 9 -> 1;
               case 10 -> 38;
               case 11 -> 9;
               case 12 -> 17;
               case 13 -> 233;
               case 14 -> 227;
               case 15 -> 224;
               case 16 -> 97;
               case 17 -> 66;
               case 18 -> 64;
               case 19 -> 198;
               case 20 -> 109;
               case 21 -> 185;
               case 22 -> 101;
               case 23 -> 35;
               case 24 -> 202;
               case 25 -> 59;
               case 26 -> 239;
               case 27 -> 98;
               case 28 -> 36;
               case 29 -> 250;
               case 30 -> 158;
               case 31 -> 120;
               case 32 -> 245;
               case 33 -> 129;
               case 34 -> 51;
               case 35 -> 37;
               case 36 -> 150;
               case 37 -> 179;
               case 38 -> 190;
               case 39 -> 135;
               case 40 -> 119;
               case 41 -> 223;
               case 42 -> 152;
               case 43 -> 58;
               case 44 -> 238;
               case 45 -> 215;
               case 46 -> 100;
               case 47 -> 31;
               case 48 -> 177;
               case 49 -> 93;
               case 50 -> 172;
               case 51 -> 29;
               case 52 -> 128;
               case 53 -> 243;
               case 54 -> 124;
               case 55 -> 165;
               case 56 -> 211;
               case 57 -> 108;
               case 58 -> 12;
               case 59 -> 170;
               case 60 -> 144;
               case 61 -> 40;
               case 62 -> 141;
               case 63 -> 166;
               case 64 -> 175;
               case 65 -> 204;
               case 66 -> 41;
               case 67 -> 18;
               case 68 -> 136;
               case 69 -> 85;
               case 70 -> 246;
               case 71 -> 237;
               case 72 -> 209;
               case 73 -> 220;
               case 74 -> 63;
               case 75 -> 79;
               case 76 -> 232;
               case 77 -> 47;
               case 78 -> 249;
               case 79 -> 122;
               case 80 -> 77;
               case 81 -> 96;
               case 82 -> 193;
               case 83 -> 75;
               case 84 -> 148;
               case 85 -> 149;
               case 86 -> 10;
               case 87 -> 8;
               case 88 -> 162;
               case 89 -> 53;
               case 90 -> 225;
               case 91 -> 229;
               case 92 -> 182;
               case 93 -> 73;
               case 94 -> 188;
               case 95 -> 32;
               case 96 -> 116;
               case 97 -> 110;
               case 98 -> 126;
               case 99 -> 191;
               case 100 -> 106;
               case 101 -> 127;
               case 102 -> 80;
               case 103 -> 255;
               case 104 -> 143;
               case 105 -> 133;
               case 106 -> 74;
               case 107 -> 56;
               case 108 -> 216;
               case 109 -> 4;
               case 110 -> 174;
               case 111 -> 86;
               case 112 -> 94;
               case 113 -> 208;
               case 114 -> 123;
               case 115 -> 44;
               case 116 -> 107;
               case 117 -> 28;
               case 118 -> 24;
               case 119 -> 45;
               case 120 -> 167;
               case 121 -> 252;
               case 122 -> 105;
               case 123 -> 178;
               case 124 -> 69;
               case 125 -> 81;
               case 126 -> 27;
               case 127 -> 3;
               case 128 -> 137;
               case 129 -> 157;
               case 130 -> 181;
               case 131 -> 57;
               case 132 -> 82;
               case 133 -> 163;
               case 134 -> 194;
               case 135 -> 60;
               case 136 -> 186;
               case 137 -> 195;
               case 138 -> 241;
               case 139 -> 21;
               case 140 -> 114;
               case 141 -> 159;
               case 142 -> 76;
               case 143 -> 183;
               case 144 -> 176;
               case 145 -> 160;
               case 146 -> 67;
               case 147 -> 55;
               case 148 -> 104;
               case 149 -> 115;
               case 150 -> 22;
               case 151 -> 39;
               case 152 -> 218;
               case 153 -> 125;
               case 154 -> 7;
               case 155 -> 121;
               case 156 -> 20;
               case 157 -> 212;
               case 158 -> 196;
               case 159 -> 11;
               case 160 -> 70;
               case 161 -> 168;
               case 162 -> 146;
               case 163 -> 68;
               case 164 -> 169;
               case 165 -> 112;
               case 166 -> 173;
               case 167 -> 48;
               case 168 -> 240;
               case 169 -> 5;
               case 170 -> 102;
               case 171 -> 221;
               case 172 -> 222;
               case 173 -> 71;
               case 174 -> 213;
               case 175 -> 92;
               case 176 -> 217;
               case 177 -> 91;
               case 178 -> 203;
               case 179 -> 180;
               case 180 -> 118;
               case 181 -> 151;
               case 182 -> 33;
               case 183 -> 184;
               case 184 -> 52;
               case 185 -> 155;
               case 186 -> 111;
               case 187 -> 171;
               case 188 -> 142;
               case 189 -> 199;
               case 190 -> 90;
               case 191 -> 247;
               case 192 -> 84;
               case 193 -> 138;
               case 194 -> 251;
               case 195 -> 161;
               case 196 -> 132;
               case 197 -> 95;
               case 198 -> 205;
               case 199 -> 103;
               case 200 -> 30;
               case 201 -> 206;
               case 202 -> 210;
               case 203 -> 0;
               case 204 -> 23;
               case 205 -> 15;
               case 206 -> 234;
               case 207 -> 228;
               case 208 -> 154;
               case 209 -> 189;
               case 210 -> 201;
               case 211 -> 78;
               case 212 -> 219;
               case 213 -> 26;
               case 214 -> 248;
               case 215 -> 235;
               case 216 -> 87;
               case 217 -> 62;
               case 218 -> 253;
               case 219 -> 50;
               case 220 -> 25;
               case 221 -> 131;
               case 222 -> 99;
               case 223 -> 49;
               case 224 -> 113;
               case 225 -> 236;
               case 226 -> 130;
               case 227 -> 65;
               case 228 -> 254;
               case 229 -> 153;
               case 230 -> 156;
               case 231 -> 19;
               case 232 -> 14;
               case 233 -> 200;
               case 234 -> 226;
               case 235 -> 42;
               case 236 -> 72;
               case 237 -> 231;
               case 238 -> 242;
               case 239 -> 43;
               case 240 -> 164;
               case 241 -> 61;
               case 242 -> 13;
               case 243 -> 134;
               case 244 -> 230;
               case 245 -> 197;
               case 246 -> 34;
               case 247 -> 244;
               case 248 -> 54;
               case 249 -> 46;
               case 250 -> 16;
               case 251 -> 83;
               case 252 -> 145;
               case 253 -> 187;
               case 254 -> 6;
               default -> 147;
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
}
