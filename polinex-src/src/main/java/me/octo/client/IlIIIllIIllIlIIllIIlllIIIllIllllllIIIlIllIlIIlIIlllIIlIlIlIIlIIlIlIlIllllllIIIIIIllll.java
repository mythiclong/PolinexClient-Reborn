package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;

public final class IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   private final List<Vec3> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private Vec3 IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private Vec3 lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private List<? extends BlockPos> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @Nullable
   private ArrayList<Vec3> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private Vec3 IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private double IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private final double IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private final int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private final int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] c;
   private static String[] d;

   public IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll() {
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
      Vec3[] var1 = new Vec3[]{Vec3.ZERO, new Vec3(0.35, 0.0, 0.0), new Vec3(-0.35, 0.0, 0.0), new Vec3(0.0, 0.0, 0.35), new Vec3(0.0, 0.0, -0.35)};
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.listOf(var1);
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = CollectionsKt.emptyList();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = Double.MAX_VALUE;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.25;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 100;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 250;
   }

   public final boolean a(@NotNull BlockPos param1, @Nullable Integer param2) {
      var var1 = me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      var var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      var var3 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      if (var3 != null && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var2, var3) > 0.5) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
      }
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var2;
      if (!param1.equals(me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h()) || me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().a(Integer.valueOf(100))) {
         me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1);
         this.j();
      }
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().f();
      Integer var4 = param2;
      if (var4 == null) {
         var4 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.n().b();
      }
      if (var4 != null) {
         me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var4);
      }
      if (this.a().player != null && this.a().player.isVisuallySwimming()) {
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.f();
      }
      boolean var5 = !this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(Integer.valueOf(400));
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("jump", var5);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", !var5);
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, param1, (Vec3)null, 2, (Object)null).d();
      if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.isEmpty() && this.a().player != null && this.a().player.onGround()) {
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(1.0, 20.0);
      }
      if (this.a(param1, var2)) {
         me.octo.client.IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h();
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
         return true;
      }
      if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(Integer.valueOf(350))) {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
      }
      boolean var6 = this.a(param1);
      if (!var6) {
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
      }
      if (var6 && this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.a(Integer.valueOf(this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI)) && this.g()) {
         return false;
      }
      var var7 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      if (var7 == null) {
         if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null && !this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.isEmpty() && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(Integer.valueOf(this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll))) {
            var var8 = this.b(param1, var2);
            if (var8 != null) {
               var var9 = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var8.getFirst(), (BlockPos)null, 2, (Object)null);
               if (var9 != null && !var9.isEmpty()) {
                  var9.set(CollectionsKt.getLastIndex(var9), var8.getSecond());
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var9;
                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
                  this.i();
               }
            }
            if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null) {
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
            }
         }
         var var10 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         if (var10 != null && this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl < var10.size()) {
            double var11 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var2, CollectionsKt.last(var10));
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", var5 && var11 < 3.0);
            var var12 = var10.get(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
            switch (this.a(var12, var2).ordinal()) {
            case 1:
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl + 1;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
               this.i();
               break;
            case 2:
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
               this.i();
               break;
            case 0:
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2, var12, false, 0.0, 12, (Object)null);
               break;
            default:
               throw new kotlin.NoWhenBranchMatchedException();
            }
         } else {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", !var5);
            this.i();
         }
         if (var10 == null) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
         }
         me.octo.client.IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param1));
      } else {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", !var5);
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
         me.octo.client.IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var7);
         double var13 = me.octo.client.IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var7);
         if (var6 && var13 < this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) {
            this.g();
         }
      }
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush -25042
      // 004: sipush -31379
      // 007: pop2
      // 008: ldc "pos"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 010: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 013: astore 4
      // 015: aload 0
      // 016: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/world/phys/Vec3;
      // 019: astore 5
      // 01b: astore 3
      // 01c: aload 3
      // 01d: ifnull 05e
      // 020: aload 5
      // 022: ifnull 058
      // 025: goto 02c
      // 028: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02b: athrow
      // 02c: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 02f: aload 4
      // 031: aload 5
      // 033: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 036: dstore 6
      // 038: dload 6
      // 03a: ldc2_w 0.5
      // 03d: dcmpl
      // 03e: aload 3
      // 03f: ifnull 073
      // 042: ifle 058
      // 045: goto 04c
      // 048: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04b: athrow
      // 04c: aload 0
      // 04d: bipush 1
      // 04e: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Z
      // 051: goto 058
      // 054: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 057: athrow
      // 058: aload 0
      // 059: aload 4
      // 05b: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/world/phys/Vec3;
      // 05e: aload 3
      // 05f: ifnull 0aa
      // 062: aload 1
      // 063: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 066: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.h ()Lnet/minecraft/core/BlockPos;
      // 069: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 06c: goto 073
      // 06f: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 072: athrow
      // 073: ifeq 09c
      // 076: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 079: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 07c: aload 3
      // 07d: ifnull 0b4
      // 080: goto 087
      // 083: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 086: athrow
      // 087: bipush 100
      // 089: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08c: checkcast java/lang/Number
      // 08f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 092: ifeq 0ae
      // 095: goto 09c
      // 098: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09b: athrow
      // 09c: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 09f: aload 1
      // 0a0: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a (Lnet/minecraft/core/BlockPos;)V
      // 0a3: goto 0aa
      // 0a6: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.j ()V
      // 0ae: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 0b1: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0b4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0b7: aload 2
      // 0b8: dup
      // 0b9: aload 3
      // 0ba: ifnull 0f4
      // 0bd: ifnonnull 0f3
      // 0c0: goto 0c7
      // 0c3: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c6: athrow
      // 0c7: pop
      // 0c8: aload 3
      // 0c9: ifnull 0f2
      // 0cc: goto 0d3
      // 0cf: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d2: athrow
      // 0d3: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0d6: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.n ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0d9: dup
      // 0da: ifnull 0f1
      // 0dd: goto 0e4
      // 0e0: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e3: athrow
      // 0e4: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ea: goto 0f3
      // 0ed: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f0: athrow
      // 0f1: pop
      // 0f2: aconst_null
      // 0f3: dup
      // 0f4: ifnull 10e
      // 0f7: checkcast java/lang/Number
      // 0fa: invokevirtual java/lang/Number.intValue ()I
      // 0fd: istore 8
      // 0ff: bipush 0
      // 100: istore 9
      // 102: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 105: iload 8
      // 107: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 10a: pop
      // 10b: goto 110
      // 10e: pop
      // 10f: nop
      // 110: aload 0
      // 111: invokevirtual me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a ()Lnet/minecraft/client/Minecraft;
      // 114: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 117: dup
      // 118: ifnull 140
      // 11b: invokevirtual net/minecraft/client/player/LocalPlayer.isVisuallySwimming ()Z
      // 11e: aload 3
      // 11f: ifnull 13d
      // 122: goto 129
      // 125: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 128: athrow
      // 129: bipush 1
      // 12a: if_icmpne 13c
      // 12d: goto 134
      // 130: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 133: athrow
      // 134: bipush 1
      // 135: goto 142
      // 138: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13b: athrow
      // 13c: bipush 0
      // 13d: goto 142
      // 140: pop
      // 141: bipush 0
      // 142: ifeq 153
      // 145: aload 0
      // 146: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 149: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 14c: goto 153
      // 14f: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 152: athrow
      // 153: aload 0
      // 154: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 157: sipush 400
      // 15a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15d: checkcast java/lang/Number
      // 160: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 163: aload 3
      // 164: ifnull 172
      // 167: ifne 175
      // 16a: goto 171
      // 16d: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 170: athrow
      // 171: bipush 1
      // 172: goto 176
      // 175: bipush 0
      // 176: istore 6
      // 178: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 17b: sipush -25041
      // 17e: sipush -13573
      // 181: pop2
      // 182: ldc "jump"
      // 184: iload 6
      // 186: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 189: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 18c: sipush -25047
      // 18f: sipush 29254
      // 192: pop2
      // 193: ldc "sneak"
      // 195: iload 6
      // 197: aload 3
      // 198: ifnull 1a6
      // 19b: ifne 1a9
      // 19e: goto 1a5
      // 1a1: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a4: athrow
      // 1a5: bipush 1
      // 1a6: goto 1aa
      // 1a9: bipush 0
      // 1aa: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 1ad: aload 0
      // 1ae: aload 3
      // 1af: ifnull 1d2
      // 1b2: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 1b5: aload 1
      // 1b6: aconst_null
      // 1b7: bipush 2
      // 1b8: aconst_null
      // 1b9: invokestatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a (Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1bc: dup
      // 1bd: ifnull 1d1
      // 1c0: goto 1c7
      // 1c3: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c6: athrow
      // 1c7: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 1ca: goto 1d3
      // 1cd: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d0: athrow
      // 1d1: pop
      // 1d2: aconst_null
      // 1d3: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lnet/minecraft/world/phys/Vec3;
      // 1d6: aload 0
      // 1d7: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/List;
      // 1da: invokeinterface java/util/List.isEmpty ()Z 1
      // 1df: aload 3
      // 1e0: ifnull 245
      // 1e3: ifeq 23e
      // 1e6: goto 1ed
      // 1e9: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: invokevirtual me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a ()Lnet/minecraft/client/Minecraft;
      // 1f1: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1f4: dup
      // 1f5: ifnull 224
      // 1f8: goto 1ff
      // 1fb: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1fe: athrow
      // 1ff: invokevirtual net/minecraft/client/player/LocalPlayer.onGround ()Z
      // 202: aload 3
      // 203: ifnull 221
      // 206: goto 20d
      // 209: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 20c: athrow
      // 20d: bipush 1
      // 20e: if_icmpne 220
      // 211: goto 218
      // 214: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 217: athrow
      // 218: bipush 1
      // 219: goto 226
      // 21c: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 21f: athrow
      // 220: bipush 0
      // 221: goto 226
      // 224: pop
      // 225: bipush 0
      // 226: ifeq 23e
      // 229: aload 0
      // 22a: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 22d: dconst_1
      // 22e: ldc2_w 20.0
      // 231: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (DD)Ljava/util/List;
      // 234: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/List;
      // 237: goto 23e
      // 23a: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 23d: athrow
      // 23e: aload 0
      // 23f: aload 1
      // 240: aload 4
      // 242: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Z
      // 245: aload 3
      // 246: ifnull 275
      // 249: ifeq 265
      // 24c: goto 253
      // 24f: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 252: athrow
      // 253: getstatic me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl;
      // 256: invokevirtual me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.h ()V
      // 259: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 25c: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 25f: bipush 1
      // 260: ireturn
      // 261: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 264: athrow
      // 265: aload 0
      // 266: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 269: sipush 350
      // 26c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 26f: checkcast java/lang/Number
      // 272: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 275: aload 3
      // 276: ifnull 294
      // 279: ifeq 28f
      // 27c: goto 283
      // 27f: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 282: athrow
      // 283: aload 0
      // 284: bipush 1
      // 285: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Z
      // 288: goto 28f
      // 28b: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28e: athrow
      // 28f: aload 0
      // 290: aload 1
      // 291: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lnet/minecraft/core/BlockPos;)Z
      // 294: istore 7
      // 296: iload 7
      // 298: aload 3
      // 299: ifnull 2b6
      // 29c: ifne 2b4
      // 29f: goto 2a6
      // 2a2: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 2aa: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 2ad: goto 2b4
      // 2b0: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b3: athrow
      // 2b4: iload 7
      // 2b6: aload 3
      // 2b7: ifnull 2dc
      // 2ba: ifeq 2ee
      // 2bd: goto 2c4
      // 2c0: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c3: athrow
      // 2c4: aload 0
      // 2c5: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 2c8: aload 0
      // 2c9: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI I
      // 2cc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2cf: checkcast java/lang/Number
      // 2d2: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 2d5: goto 2dc
      // 2d8: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2db: athrow
      // 2dc: aload 3
      // 2dd: ifnull 2eb
      // 2e0: ifeq 2ee
      // 2e3: goto 2ea
      // 2e6: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2e9: athrow
      // 2ea: bipush 1
      // 2eb: goto 2ef
      // 2ee: bipush 0
      // 2ef: istore 8
      // 2f1: iload 8
      // 2f3: aload 3
      // 2f4: ifnull 317
      // 2f7: ifeq 320
      // 2fa: goto 301
      // 2fd: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 300: athrow
      // 301: aload 0
      // 302: aload 3
      // 303: ifnull 321
      // 306: goto 30d
      // 309: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 30c: athrow
      // 30d: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.g ()Z
      // 310: goto 317
      // 313: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 316: athrow
      // 317: ifeq 320
      // 31a: bipush 0
      // 31b: ireturn
      // 31c: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 31f: athrow
      // 320: aload 0
      // 321: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lnet/minecraft/world/phys/Vec3;
      // 324: astore 9
      // 326: aload 9
      // 328: ifnonnull 5a3
      // 32b: aload 0
      // 32c: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 32f: aload 3
      // 330: ifnull 438
      // 333: goto 33a
      // 336: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 339: athrow
      // 33a: ifnonnull 434
      // 33d: goto 344
      // 340: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 343: athrow
      // 344: aload 0
      // 345: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/List;
      // 348: checkcast java/util/Collection
      // 34b: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 350: aload 3
      // 351: ifnull 366
      // 354: goto 35b
      // 357: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 35a: athrow
      // 35b: ifne 369
      // 35e: goto 365
      // 361: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 364: athrow
      // 365: bipush 1
      // 366: goto 36a
      // 369: bipush 0
      // 36a: ifeq 434
      // 36d: aload 0
      // 36e: aload 3
      // 36f: ifnull 435
      // 372: goto 379
      // 375: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 378: athrow
      // 379: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 37c: aload 0
      // 37d: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll I
      // 380: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 383: checkcast java/lang/Number
      // 386: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 389: ifeq 434
      // 38c: goto 393
      // 38f: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 392: athrow
      // 393: aload 0
      // 394: aload 1
      // 395: aload 4
      // 397: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.b (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Lkotlin/Pair;
      // 39a: astore 10
      // 39c: aload 10
      // 39e: ifnull 414
      // 3a1: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 3a4: aload 10
      // 3a6: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 3a9: checkcast net/minecraft/core/BlockPos
      // 3ac: aconst_null
      // 3ad: bipush 2
      // 3ae: aconst_null
      // 3af: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Lme/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;ILjava/lang/Object;)Ljava/util/ArrayList;
      // 3b2: astore 11
      // 3b4: aload 11
      // 3b6: aload 3
      // 3b7: ifnull 418
      // 3ba: ifnull 414
      // 3bd: goto 3c4
      // 3c0: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3c3: athrow
      // 3c4: aload 11
      // 3c6: checkcast java/util/Collection
      // 3c9: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 3ce: aload 3
      // 3cf: ifnull 3e4
      // 3d2: goto 3d9
      // 3d5: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3d8: athrow
      // 3d9: ifne 3e7
      // 3dc: goto 3e3
      // 3df: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e2: athrow
      // 3e3: bipush 1
      // 3e4: goto 3e8
      // 3e7: bipush 0
      // 3e8: ifeq 414
      // 3eb: aload 11
      // 3ed: aload 11
      // 3ef: checkcast java/util/List
      // 3f2: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 3f5: aload 10
      // 3f7: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 3fa: invokevirtual java/util/ArrayList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 3fd: pop
      // 3fe: aload 0
      // 3ff: aload 11
      // 401: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 404: aload 0
      // 405: bipush 0
      // 406: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl I
      // 409: aload 0
      // 40a: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.i ()V
      // 40d: goto 414
      // 410: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 413: athrow
      // 414: aload 0
      // 415: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 418: aload 3
      // 419: ifnull 438
      // 41c: ifnonnull 434
      // 41f: goto 426
      // 422: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 425: athrow
      // 426: aload 0
      // 427: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 42a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 42d: goto 434
      // 430: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 433: athrow
      // 434: aload 0
      // 435: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 438: astore 10
      // 43a: aload 10
      // 43c: ifnull 558
      // 43f: aload 0
      // 440: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl I
      // 443: aload 10
      // 445: invokevirtual java/util/ArrayList.size ()I
      // 448: if_icmpge 558
      // 44b: goto 452
      // 44e: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 451: athrow
      // 452: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 455: aload 4
      // 457: aload 10
      // 459: checkcast java/util/List
      // 45c: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 45f: checkcast net/minecraft/world/phys/Vec3
      // 462: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 465: dstore 11
      // 467: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 46a: sipush -25047
      // 46d: sipush 29254
      // 470: pop2
      // 471: ldc "sneak"
      // 473: iload 6
      // 475: aload 3
      // 476: ifnull 490
      // 479: ifne 4a2
      // 47c: goto 483
      // 47f: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 482: athrow
      // 483: dload 11
      // 485: ldc2_w 3.0
      // 488: dcmpg
      // 489: goto 490
      // 48c: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48f: athrow
      // 490: aload 3
      // 491: ifnull 49f
      // 494: ifge 4a2
      // 497: goto 49e
      // 49a: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 49d: athrow
      // 49e: bipush 1
      // 49f: goto 4a3
      // 4a2: bipush 0
      // 4a3: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 4a6: aload 10
      // 4a8: aload 0
      // 4a9: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl I
      // 4ac: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 4af: dup
      // 4b0: sipush -25044
      // 4b3: sipush -31454
      // 4b6: pop2
      // 4b7: ldc_w "get(...)"
      // 4ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4bd: checkcast net/minecraft/world/phys/Vec3
      // 4c0: astore 13
      // 4c2: aload 0
      // 4c3: aload 3
      // 4c4: ifnull 50c
      // 4c7: aload 13
      // 4c9: aload 4
      // 4cb: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 4ce: getstatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 4d1: swap
      // 4d2: invokevirtual me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ordinal ()I
      // 4d5: iaload
      // 4d6: tableswitch 118 1 3 30 61 92
      // 4f0: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4f3: athrow
      // 4f4: aload 0
      // 4f5: aload 0
      // 4f6: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl I
      // 4f9: bipush 1
      // 4fa: iadd
      // 4fb: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl I
      // 4fe: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 501: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 504: aload 0
      // 505: goto 50c
      // 508: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 50b: athrow
      // 50c: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.i ()V
      // 50f: aload 3
      // 510: ifnonnull 580
      // 513: aload 0
      // 514: aconst_null
      // 515: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 518: aload 0
      // 519: bipush 0
      // 51a: putfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl I
      // 51d: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 520: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 523: aload 0
      // 524: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.i ()V
      // 527: aload 3
      // 528: ifnonnull 580
      // 52b: goto 532
      // 52e: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 531: athrow
      // 532: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 535: aload 4
      // 537: aload 13
      // 539: bipush 0
      // 53a: dconst_0
      // 53b: bipush 12
      // 53d: aconst_null
      // 53e: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 541: aload 3
      // 542: ifnonnull 580
      // 545: goto 54c
      // 548: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 54b: athrow
      // 54c: new kotlin/NoWhenBranchMatchedException
      // 54f: dup
      // 550: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 553: athrow
      // 554: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 557: athrow
      // 558: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 55b: sipush -25047
      // 55e: sipush 29254
      // 561: pop2
      // 562: ldc "sneak"
      // 564: iload 6
      // 566: aload 3
      // 567: ifnull 575
      // 56a: ifne 578
      // 56d: goto 574
      // 570: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 573: athrow
      // 574: bipush 1
      // 575: goto 579
      // 578: bipush 0
      // 579: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 57c: aload 0
      // 57d: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.i ()V
      // 580: aload 10
      // 582: ifnonnull 592
      // 585: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 588: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 58b: goto 592
      // 58e: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 591: athrow
      // 592: getstatic me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl;
      // 595: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 598: aload 1
      // 599: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 59c: invokevirtual me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.a (Lnet/minecraft/world/phys/Vec3;)V
      // 59f: aload 3
      // 5a0: ifnonnull 61e
      // 5a3: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 5a6: sipush -25047
      // 5a9: sipush 29254
      // 5ac: pop2
      // 5ad: ldc "sneak"
      // 5af: iload 6
      // 5b1: aload 3
      // 5b2: ifnull 5c7
      // 5b5: goto 5bc
      // 5b8: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5bb: athrow
      // 5bc: ifne 5ca
      // 5bf: goto 5c6
      // 5c2: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5c5: athrow
      // 5c6: bipush 1
      // 5c7: goto 5cb
      // 5ca: bipush 0
      // 5cb: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 5ce: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 5d1: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 5d4: getstatic me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl;
      // 5d7: aload 9
      // 5d9: invokevirtual me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.a (Lnet/minecraft/world/phys/Vec3;)V
      // 5dc: getstatic me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl;
      // 5df: aload 9
      // 5e1: invokevirtual me/octo/client/IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl.b (Lnet/minecraft/world/phys/Vec3;)D
      // 5e4: dstore 10
      // 5e6: iload 7
      // 5e8: aload 3
      // 5e9: ifnull 61f
      // 5ec: ifeq 61e
      // 5ef: goto 5f6
      // 5f2: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5f5: athrow
      // 5f6: dload 10
      // 5f8: aload 0
      // 5f9: getfield me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl D
      // 5fc: dcmpg
      // 5fd: aload 3
      // 5fe: ifnull 61f
      // 601: goto 608
      // 604: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 607: athrow
      // 608: ifge 61e
      // 60b: goto 612
      // 60e: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 611: athrow
      // 612: aload 0
      // 613: invokespecial me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.g ()Z
      // 616: pop
      // 617: goto 61e
      // 61a: invokestatic me/octo/client/IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 61d: athrow
      // 61e: bipush 0
      // 61f: ireturn
   }

   private final boolean a(BlockPos param1) {
      var var3 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i());
      if (!var3.a()) {
         return false;
      }
      return kotlin.jvm.internal.Intrinsics.areEqual(var3.b(), param1);
   }

   private final boolean g() {
        boolean bl;
        block14: {
            block15: {
                int[] nArray;
                block12: {
                    block13: {
                        boolean bl2;
                        block10: {
                            block11: {
                                nArray = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
                                try {
                                    try {
                                        try {
                                            bl2 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                                            if (nArray == null) break block10;
                                            if (!bl2) break block11;
                                        }
                                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                            throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                                        }
                                        bl = this.h();
                                        if (nArray == null) break block12;
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                        throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                                    }
                                    if (bl) break block13;
                                }
                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                                }
                            }
                            bl2 = false;
                        }
                        return bl2;
                    }
                    bl = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j();
                }
                try {
                    try {
                        if (nArray == null) break block14;
                        if (bl) break block15;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                    }
                    return false;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                }
            }
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
            bl = true;
        }
        return bl;
   }

   private final boolean h() {
        boolean bl;
        block16: {
            block17: {
                block15: {
                    boolean bl2;
                    int[] nArray;
                    block13: {
                        block12: {
                            block14: {
                                nArray = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
                                try {
                                    try {
                                        try {
                                            LocalPlayer localPlayer;
                                            try {
                                                if (nArray == null || (localPlayer = this.a().player) == null) break block12;
                                            }
                                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                                            }
                                            bl2 = localPlayer.isShiftKeyDown();
                                            if (nArray == null) break block13;
                                        }
                                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                            throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                                        }
                                        if (!bl2) break block14;
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                        throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                                    }
                                    bl2 = true;
                                    break block13;
                                }
                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                                }
                            }
                            bl2 = false;
                            break block13;
                        }
                        bl2 = false;
                    }
                    try {
                        try {
                            if (bl2) break block15;
                            bl = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak");
                            if (nArray == null) break block16;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                        }
                        if (!bl) break block17;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.a(noWhenBranchMatchedException);
                    }
                }
                bl = true;
                break block16;
            }
            bl = false;
        }
        return bl;
   }

   private final boolean a(BlockPos var1, Vec3 var2) {
      return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.b(
         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         var1,
         var2,
         0.0);
   }

   private final Pair<BlockPos, Vec3> b(BlockPos param1, Vec3 param2) {
      ArrayList<Pair<BlockPos, Vec3>> var4 = new ArrayList<>();
      int[] var3 = me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      double var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B();
      for (BlockPos var8 : this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         Vec3 var9 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var8);
         for (Vec3 var11 : this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            Vec3 var13 = var9.add(var11);
            Vec3 var14 = var13.add(0.0, var5, 0.0);
            List var16 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1, var14);
            if (!var16.isEmpty()) {
               var4.add(new Pair<BlockPos, Vec3>(var8, var13));
            }
         }
      }
      var var7 = var4.iterator();
      if (!var7.hasNext()) {
         return null;
      }
      Pair var10 = (Pair)var7.next();
      if (!var7.hasNext()) {
         return var10;
      }
      double var12 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(param2, (Vec3)var10.getSecond());
      while (var7.hasNext()) {
         Pair var17 = (Pair)var7.next();
         double var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(param2, (Vec3)var17.getSecond());
         if (Double.compare(var12, var18) > 0) {
            var10 = var17;
            var12 = var18;
         }
      }
      return var10;
   }

   private final IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      Vec3 param1, Vec3 param2
   ) {
      int[] var3 = me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(param2, param1);
      Vec3 var6 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      if (var6 == null || me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var6, param1) > 0.01) {
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = param1;
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var4;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
      }
      if (var4 < this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll - 0.05) {
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var4;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
      }
      if (me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2, 0.35)) {
         return me.octo.client.IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a((Number)900)
         ? me.octo.client.IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         : me.octo.client.IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   private final void i() {
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = null;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = Double.MAX_VALUE;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
   }

   private final void j() {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = null;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = CollectionsKt.emptyList();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
      this.i();
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "\u0012Ïãq#Ñö\u0084\t:\u007fÂ;\u008cOÅP\f\u0003ô¡Í\u0004áí(\u007f\bô\u0007éIpÖ\u009cd\u0005Þuý\u0005\u0096";
      int var4 = "\u0012Ïãq#Ñö\u0084\t:\u007fÂ;\u008cOÅP\f\u0003ô¡Í\u0004áí(\u007f\bô\u0007éIpÖ\u009cd\u0005Þuý\u0005\u0096".length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 2;
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
                     case 0 -> 88;
                     case 1 -> 58;
                     case 2 -> 23;
                     case 3 -> 108;
                     case 4 -> 43;
                     case 5 -> 51;
                     default -> 112;
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
                     c = var5;
                     d = new String[8];
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

                  var2 = "2÷ê\u008cËµ0Ó\u0005ºQªZ§";
                  var4 = "2÷ê\u008cËµ0Ó\u0005ºQªZ§".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 119;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25044) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 0;
            case 1 -> 246;
            case 2 -> 188;
            case 3 -> 197;
            case 4 -> 182;
            case 5 -> 46;
            case 6 -> 119;
            case 7 -> 171;
            case 8 -> 59;
            case 9 -> 245;
            case 10 -> 202;
            case 11 -> 102;
            case 12 -> 81;
            case 13 -> 193;
            case 14 -> 216;
            case 15 -> 68;
            case 16 -> 153;
            case 17 -> 235;
            case 18 -> 63;
            case 19 -> 100;
            case 20 -> 127;
            case 21 -> 64;
            case 22 -> 118;
            case 23 -> 149;
            case 24 -> 191;
            case 25 -> 24;
            case 26 -> 73;
            case 27 -> 130;
            case 28 -> 189;
            case 29 -> 34;
            case 30 -> 84;
            case 31 -> 26;
            case 32 -> 252;
            case 33 -> 199;
            case 34 -> 253;
            case 35 -> 215;
            case 36 -> 39;
            case 37 -> 91;
            case 38 -> 82;
            case 39 -> 227;
            case 40 -> 38;
            case 41 -> 228;
            case 42 -> 238;
            case 43 -> 60;
            case 44 -> 128;
            case 45 -> 126;
            case 46 -> 129;
            case 47 -> 186;
            case 48 -> 250;
            case 49 -> 220;
            case 50 -> 157;
            case 51 -> 254;
            case 52 -> 190;
            case 53 -> 40;
            case 54 -> 170;
            case 55 -> 25;
            case 56 -> 205;
            case 57 -> 44;
            case 58 -> 158;
            case 59 -> 156;
            case 60 -> 56;
            case 61 -> 114;
            case 62 -> 30;
            case 63 -> 113;
            case 64 -> 31;
            case 65 -> 16;
            case 66 -> 200;
            case 67 -> 134;
            case 68 -> 74;
            case 69 -> 222;
            case 70 -> 115;
            case 71 -> 35;
            case 72 -> 243;
            case 73 -> 86;
            case 74 -> 151;
            case 75 -> 3;
            case 76 -> 23;
            case 77 -> 154;
            case 78 -> 174;
            case 79 -> 89;
            case 80 -> 196;
            case 81 -> 66;
            case 82 -> 140;
            case 83 -> 101;
            case 84 -> 6;
            case 85 -> 99;
            case 86 -> 32;
            case 87 -> 218;
            case 88 -> 177;
            case 89 -> 166;
            case 90 -> 20;
            case 91 -> 209;
            case 92 -> 97;
            case 93 -> 167;
            case 94 -> 184;
            case 95 -> 229;
            case 96 -> 226;
            case 97 -> 77;
            case 98 -> 122;
            case 99 -> 249;
            case 100 -> 255;
            case 101 -> 58;
            case 102 -> 232;
            case 103 -> 173;
            case 104 -> 18;
            case 105 -> 104;
            case 106 -> 212;
            case 107 -> 214;
            case 108 -> 247;
            case 109 -> 37;
            case 110 -> 54;
            case 111 -> 176;
            case 112 -> 203;
            case 113 -> 57;
            case 114 -> 95;
            case 115 -> 234;
            case 116 -> 45;
            case 117 -> 236;
            case 118 -> 67;
            case 119 -> 87;
            case 120 -> 70;
            case 121 -> 1;
            case 122 -> 172;
            case 123 -> 145;
            case 124 -> 146;
            case 125 -> 208;
            case 126 -> 165;
            case 127 -> 204;
            case 128 -> 136;
            case 129 -> 195;
            case 130 -> 210;
            case 131 -> 51;
            case 132 -> 79;
            case 133 -> 201;
            case 134 -> 83;
            case 135 -> 10;
            case 136 -> 121;
            case 137 -> 161;
            case 138 -> 180;
            case 139 -> 17;
            case 140 -> 251;
            case 141 -> 85;
            case 142 -> 219;
            case 143 -> 108;
            case 144 -> 224;
            case 145 -> 75;
            case 146 -> 150;
            case 147 -> 242;
            case 148 -> 76;
            case 149 -> 2;
            case 150 -> 163;
            case 151 -> 142;
            case 152 -> 141;
            case 153 -> 120;
            case 154 -> 13;
            case 155 -> 106;
            case 156 -> 111;
            case 157 -> 225;
            case 158 -> 9;
            case 159 -> 164;
            case 160 -> 109;
            case 161 -> 41;
            case 162 -> 194;
            case 163 -> 162;
            case 164 -> 198;
            case 165 -> 61;
            case 166 -> 4;
            case 167 -> 192;
            case 168 -> 98;
            case 169 -> 133;
            case 170 -> 211;
            case 171 -> 169;
            case 172 -> 137;
            case 173 -> 152;
            case 174 -> 143;
            case 175 -> 181;
            case 176 -> 206;
            case 177 -> 71;
            case 178 -> 123;
            case 179 -> 231;
            case 180 -> 178;
            case 181 -> 93;
            case 182 -> 52;
            case 183 -> 28;
            case 184 -> 11;
            case 185 -> 185;
            case 186 -> 179;
            case 187 -> 42;
            case 188 -> 207;
            case 189 -> 43;
            case 190 -> 103;
            case 191 -> 144;
            case 192 -> 107;
            case 193 -> 132;
            case 194 -> 159;
            case 195 -> 5;
            case 196 -> 12;
            case 197 -> 230;
            case 198 -> 160;
            case 199 -> 105;
            case 200 -> 110;
            case 201 -> 138;
            case 202 -> 33;
            case 203 -> 241;
            case 204 -> 175;
            case 205 -> 48;
            case 206 -> 221;
            case 207 -> 131;
            case 208 -> 55;
            case 209 -> 53;
            case 210 -> 14;
            case 211 -> 117;
            case 212 -> 78;
            case 213 -> 217;
            case 214 -> 139;
            case 215 -> 36;
            case 216 -> 94;
            case 217 -> 88;
            case 218 -> 69;
            case 219 -> 65;
            case 220 -> 49;
            case 221 -> 187;
            case 222 -> 148;
            case 223 -> 8;
            case 224 -> 239;
            case 225 -> 125;
            case 226 -> 96;
            case 227 -> 223;
            case 228 -> 62;
            case 229 -> 47;
            case 230 -> 233;
            case 231 -> 7;
            case 232 -> 15;
            case 233 -> 50;
            case 234 -> 80;
            case 235 -> 183;
            case 236 -> 90;
            case 237 -> 248;
            case 238 -> 19;
            case 239 -> 72;
            case 240 -> 168;
            case 241 -> 29;
            case 242 -> 135;
            case 243 -> 21;
            case 244 -> 92;
            case 245 -> 240;
            case 246 -> 112;
            case 247 -> 155;
            case 248 -> 27;
            case 249 -> 124;
            case 250 -> 22;
            case 251 -> 244;
            case 252 -> 147;
            case 253 -> 237;
            case 254 -> 116;
            default -> 213;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   private static enum llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      public static IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] a() {
         return (IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         String var0
      ) {
         return Enum.valueOf(
            IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      // PX-FIX synth restored from jar bytecode
      // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
      private static me.octo.client.IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] c() {
         me.octo.client.IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var0 = new me.octo.client.IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[3];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var0[2] = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return var0;
      }
   }

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
  public static boolean a(me.octo.client.IlIIIllIIllIlIIllIIlllIIIllIllllllIIIlIllIlIIlIIlllIIlIlIlIIlIIlIlIlIllllllIIIIIIllll p0, net.minecraft.core.BlockPos p1, java.lang.Integer p2, int p3, java.lang.Object p4) {
    return p0.a(p1, p2);
  }
}
