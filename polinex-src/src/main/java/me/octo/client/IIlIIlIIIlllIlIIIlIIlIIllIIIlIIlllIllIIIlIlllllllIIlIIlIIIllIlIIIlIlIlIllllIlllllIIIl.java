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

public final class IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   private final List<Vec3> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final List<Vec3> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private Vec3 lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private Vec3 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private List<? extends BlockPos> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private ArrayList<Vec3> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private Vec3 IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private double IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private double llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private int lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private double llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private final int lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private List<String> llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private int IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static String[] c;
   private static String[] d;

   public IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl() {
      int[] var10000 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
      Vec3[] var2 = new Vec3[]{Vec3.ZERO, new Vec3(0.35, 0.0, 0.0), new Vec3(-0.35, 0.0, 0.0), new Vec3(0.0, 0.0, 0.35), new Vec3(0.0, 0.0, -0.35)};
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.listOf(var2);
      var2 = new Vec3[]{
         Vec3.ZERO,
         new Vec3(0.35, 0.0, 0.0),
         new Vec3(-0.35, 0.0, 0.0),
         new Vec3(0.0, 0.0, 0.35),
         new Vec3(0.0, 0.0, -0.35),
         new Vec3(0.3, 0.0, 0.3),
         new Vec3(0.3, 0.0, -0.3),
         new Vec3(-0.3, 0.0, 0.3),
         new Vec3(-0.3, 0.0, -0.3)
      };
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = CollectionsKt.listOf(var2);
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = CollectionsKt.emptyList();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = Double.MAX_VALUE;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 0.25;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 100;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 250;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = 2.0;
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = 220;
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 250;
      int[] var1 = var10000;
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl var6 = this;
      String[] var5 = new String[4];

      try {
         short var10003 = -22223;
         short var10004 = -8453;
         var5[0] = "forward";
         var10003 = -22217;
         var10004 = 14900;
         var5[1] = "left";
         var10003 = -22224;
         var10004 = -21544;
         var5[2] = "right";
         var10003 = -22213;
         var10004 = 2490;
         var5[3] = "backward";
         var6.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = CollectionsKt.listOf(var5);
         if (var1 == null) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
            );
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   public final boolean a(@NotNull BlockPos param1, @Nullable Integer param2) {
      Intrinsics.checkNotNullParameter(param1, "pos");
      Vec3 var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      Vec3 var5 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var5 != null) {
         double var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4, var5);
         if (var6 > 0.5D) {
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
         }
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var4;
      }
      if (!Intrinsics.areEqual(param1, me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h()) || me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().a((Number)100)) {
         me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1);
         this.l();
      }
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().f();
      Integer var7 = param2;
      if (var7 == null) {
         var var30 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.n();
         var7 = var30 != null ? Integer.valueOf(var30.b()) : null;
      }
      if (var7 != null) {
         me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var7.intValue());
      }
      LocalPlayer var31 = this.a().player;
      if (var31 != null && var31.isVisuallySwimming()) {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.f();
      }
      boolean var32 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a((Number)400);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("jump", var32);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", !var32);
      var var33 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, param1, (Vec3)null, 2, (Object)null);
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var33 != null ? var33.d() : null;
      if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.isEmpty()) {
         LocalPlayer var34 = this.a().player;
         if (var34 != null && var34.onGround()) {
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(1.0D, 20.0D);
         }
      }
      if (this.a(param1, var4)) {
         me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h();
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
         return true;
      }
      if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a((Number)350)) {
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
      }
      boolean var35 = this.a(param1);
      if (!var35) {
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
      }
      boolean var8 = var35 && this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a((Number)this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll);
      if (var8 && this.i()) {
         return false;
      }
      Vec3 var9 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      if (var9 == null) {
         this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.f();
         this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.f();
         this.h();
         if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl == null) {
            if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.isEmpty() && this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a((Number)this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll)) {
               Pair var10 = this.c(param1, var4);
               if (var10 != null) {
                  ArrayList var11 = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (BlockPos)var10.getFirst(), (BlockPos)null, 2, (Object)null);
                  if (var11 != null && !var11.isEmpty()) {
                     var11.set(CollectionsKt.getLastIndex(var11), var10.getSecond());
                     this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var11;
                     this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
                     this.k();
                  }
               }
               if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl == null) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.f();
               }
            }
         }
         ArrayList var10b = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         if (var10b != null && this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl < var10b.size()) {
            double var11b = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var4, (Vec3)CollectionsKt.last(var10b));
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", !var32 && var11b < 3.0D);
            Vec3 var13 = (Vec3)var10b.get(this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl);
            Intrinsics.checkNotNullExpressionValue(var13, "get(...)");
            var var14 = this.a(var13, var4);
            if (var14 == me.octo.client.IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl++;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
               this.k();
            } else if (var14 == me.octo.client.IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
               this.k();
            } else if (var14 == me.octo.client.IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var4, var13, false, 0.0D, 12, (Object)null);
            } else {
               throw new kotlin.NoWhenBranchMatchedException();
            }
         } else {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", !var32);
            this.k();
         }
         if (var10b == null && !this.b(param1, var4)) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
         }
         me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param1));
      } else {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", !var32);
         me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.a(var9);
         double var10x = me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var9);
         boolean var12 = var10x < this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
         if (!var12) {
            this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.f();
         }
         boolean var13x = !var32 && !var35 && var12;
         if (!var13x) {
            this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.f();
            this.h();
         }
         boolean var14x = var35 && var10x < this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI || var12 && this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.a((Number)this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll);
         boolean var15 = var14x && this.i();
         if (var15) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
            return false;
         }
         if (var13x && this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.a((Number)this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll)) {
            this.g();
         }
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
      }
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush -22219
      // 004: sipush 30476
      // 007: pop2
      // 008: ldc "pos"
      // 00a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00d: invokestatic me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l ()[I
      // 010: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w ()Lnet/minecraft/world/phys/Vec3;
      // 013: astore 4
      // 015: astore 3
      // 016: aload 0
      // 017: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/world/phys/Vec3;
      // 01a: astore 5
      // 01c: aload 3
      // 01d: ifnull 05e
      // 020: aload 5
      // 022: ifnull 058
      // 025: goto 02c
      // 028: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
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
      // 048: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04b: athrow
      // 04c: aload 0
      // 04d: bipush 1
      // 04e: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Z
      // 051: goto 058
      // 054: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 057: athrow
      // 058: aload 0
      // 059: aload 4
      // 05b: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lnet/minecraft/world/phys/Vec3;
      // 05e: aload 3
      // 05f: ifnull 0aa
      // 062: aload 1
      // 063: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 066: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.h ()Lnet/minecraft/core/BlockPos;
      // 069: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 06c: goto 073
      // 06f: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 072: athrow
      // 073: ifeq 09c
      // 076: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 079: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 07c: aload 3
      // 07d: ifnull 0b4
      // 080: goto 087
      // 083: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 086: athrow
      // 087: bipush 100
      // 089: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08c: checkcast java/lang/Number
      // 08f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 092: ifeq 0ae
      // 095: goto 09c
      // 098: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09b: athrow
      // 09c: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 09f: aload 1
      // 0a0: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a (Lnet/minecraft/core/BlockPos;)V
      // 0a3: goto 0aa
      // 0a6: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.l ()V
      // 0ae: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 0b1: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.g ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0b4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0b7: aload 2
      // 0b8: dup
      // 0b9: aload 3
      // 0ba: ifnull 0f4
      // 0bd: ifnonnull 0f3
      // 0c0: goto 0c7
      // 0c3: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c6: athrow
      // 0c7: pop
      // 0c8: aload 3
      // 0c9: ifnull 0f2
      // 0cc: goto 0d3
      // 0cf: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d2: athrow
      // 0d3: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0d6: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.n ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0d9: dup
      // 0da: ifnull 0f1
      // 0dd: goto 0e4
      // 0e0: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e3: athrow
      // 0e4: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ea: goto 0f3
      // 0ed: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
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
      // 111: invokevirtual me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 114: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 117: dup
      // 118: ifnull 140
      // 11b: invokevirtual net/minecraft/client/player/LocalPlayer.isVisuallySwimming ()Z
      // 11e: aload 3
      // 11f: ifnull 13d
      // 122: goto 129
      // 125: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 128: athrow
      // 129: bipush 1
      // 12a: if_icmpne 13c
      // 12d: goto 134
      // 130: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 133: athrow
      // 134: bipush 1
      // 135: goto 142
      // 138: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13b: athrow
      // 13c: bipush 0
      // 13d: goto 142
      // 140: pop
      // 141: bipush 0
      // 142: ifeq 153
      // 145: aload 0
      // 146: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 149: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 14c: goto 153
      // 14f: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 152: athrow
      // 153: aload 0
      // 154: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 157: sipush 400
      // 15a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15d: checkcast java/lang/Number
      // 160: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 163: aload 3
      // 164: ifnull 172
      // 167: ifne 175
      // 16a: goto 171
      // 16d: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 170: athrow
      // 171: bipush 1
      // 172: goto 176
      // 175: bipush 0
      // 176: istore 6
      // 178: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 17b: sipush -22210
      // 17e: sipush -18162
      // 181: pop2
      // 182: ldc_w "jump"
      // 185: iload 6
      // 187: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 18a: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 18d: sipush -22216
      // 190: sipush -14482
      // 193: pop2
      // 194: ldc_w "sneak"
      // 197: iload 6
      // 199: aload 3
      // 19a: ifnull 1a8
      // 19d: ifne 1ab
      // 1a0: goto 1a7
      // 1a3: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a6: athrow
      // 1a7: bipush 1
      // 1a8: goto 1ac
      // 1ab: bipush 0
      // 1ac: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 1af: aload 0
      // 1b0: aload 3
      // 1b1: ifnull 1d4
      // 1b4: getstatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
      // 1b7: aload 1
      // 1b8: aconst_null
      // 1b9: bipush 2
      // 1ba: aconst_null
      // 1bb: invokestatic me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a (Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lme/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1be: dup
      // 1bf: ifnull 1d3
      // 1c2: goto 1c9
      // 1c5: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c8: athrow
      // 1c9: invokevirtual me/octo/client/utils/player/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 1cc: goto 1d5
      // 1cf: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d2: athrow
      // 1d3: pop
      // 1d4: aconst_null
      // 1d5: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/world/phys/Vec3;
      // 1d8: aload 0
      // 1d9: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/List;
      // 1dc: invokeinterface java/util/List.isEmpty ()Z 1
      // 1e1: aload 3
      // 1e2: ifnull 247
      // 1e5: ifeq 240
      // 1e8: goto 1ef
      // 1eb: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ee: athrow
      // 1ef: aload 0
      // 1f0: invokevirtual me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a ()Lnet/minecraft/client/Minecraft;
      // 1f3: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1f6: dup
      // 1f7: ifnull 226
      // 1fa: goto 201
      // 1fd: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 200: athrow
      // 201: invokevirtual net/minecraft/client/player/LocalPlayer.onGround ()Z
      // 204: aload 3
      // 205: ifnull 223
      // 208: goto 20f
      // 20b: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 20e: athrow
      // 20f: bipush 1
      // 210: if_icmpne 222
      // 213: goto 21a
      // 216: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 219: athrow
      // 21a: bipush 1
      // 21b: goto 228
      // 21e: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 221: athrow
      // 222: bipush 0
      // 223: goto 228
      // 226: pop
      // 227: bipush 0
      // 228: ifeq 240
      // 22b: aload 0
      // 22c: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 22f: dconst_1
      // 230: ldc2_w 20.0
      // 233: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (DD)Ljava/util/List;
      // 236: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/List;
      // 239: goto 240
      // 23c: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 23f: athrow
      // 240: aload 0
      // 241: aload 1
      // 242: aload 4
      // 244: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Z
      // 247: aload 3
      // 248: ifnull 277
      // 24b: ifeq 267
      // 24e: goto 255
      // 251: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 254: athrow
      // 255: getstatic me/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 258: invokevirtual me/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.h ()V
      // 25b: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 25e: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 261: bipush 1
      // 262: ireturn
      // 263: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 266: athrow
      // 267: aload 0
      // 268: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 26b: sipush 350
      // 26e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 271: checkcast java/lang/Number
      // 274: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 277: aload 3
      // 278: ifnull 296
      // 27b: ifeq 291
      // 27e: goto 285
      // 281: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 284: athrow
      // 285: aload 0
      // 286: bipush 1
      // 287: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Z
      // 28a: goto 291
      // 28d: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 290: athrow
      // 291: aload 0
      // 292: aload 1
      // 293: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lnet/minecraft/core/BlockPos;)Z
      // 296: istore 7
      // 298: iload 7
      // 29a: aload 3
      // 29b: ifnull 2b8
      // 29e: ifne 2b6
      // 2a1: goto 2a8
      // 2a4: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a7: athrow
      // 2a8: aload 0
      // 2a9: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 2ac: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 2af: goto 2b6
      // 2b2: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b5: athrow
      // 2b6: iload 7
      // 2b8: aload 3
      // 2b9: ifnull 2de
      // 2bc: ifeq 2f0
      // 2bf: goto 2c6
      // 2c2: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 2ca: aload 0
      // 2cb: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll I
      // 2ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2d1: checkcast java/lang/Number
      // 2d4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 2d7: goto 2de
      // 2da: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2dd: athrow
      // 2de: aload 3
      // 2df: ifnull 2ed
      // 2e2: ifeq 2f0
      // 2e5: goto 2ec
      // 2e8: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2eb: athrow
      // 2ec: bipush 1
      // 2ed: goto 2f1
      // 2f0: bipush 0
      // 2f1: istore 8
      // 2f3: iload 8
      // 2f5: aload 3
      // 2f6: ifnull 319
      // 2f9: ifeq 322
      // 2fc: goto 303
      // 2ff: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 302: athrow
      // 303: aload 0
      // 304: aload 3
      // 305: ifnull 323
      // 308: goto 30f
      // 30b: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 30e: athrow
      // 30f: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.i ()Z
      // 312: goto 319
      // 315: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 318: athrow
      // 319: ifeq 322
      // 31c: bipush 0
      // 31d: ireturn
      // 31e: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 321: athrow
      // 322: aload 0
      // 323: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lnet/minecraft/world/phys/Vec3;
      // 326: astore 9
      // 328: aload 3
      // 329: ifnull 351
      // 32c: aload 9
      // 32e: ifnonnull 5d6
      // 331: goto 338
      // 334: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 337: athrow
      // 338: aload 0
      // 339: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 33c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 33f: aload 0
      // 340: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 343: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 346: aload 0
      // 347: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.h ()V
      // 34a: goto 351
      // 34d: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 350: athrow
      // 351: aload 0
      // 352: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 355: aload 3
      // 356: ifnull 457
      // 359: ifnonnull 453
      // 35c: goto 363
      // 35f: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 362: athrow
      // 363: aload 0
      // 364: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/List;
      // 367: checkcast java/util/Collection
      // 36a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 36f: aload 3
      // 370: ifnull 385
      // 373: goto 37a
      // 376: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 379: athrow
      // 37a: ifne 388
      // 37d: goto 384
      // 380: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 383: athrow
      // 384: bipush 1
      // 385: goto 389
      // 388: bipush 0
      // 389: ifeq 453
      // 38c: aload 0
      // 38d: aload 3
      // 38e: ifnull 454
      // 391: goto 398
      // 394: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 397: athrow
      // 398: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 39b: aload 0
      // 39c: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll I
      // 39f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3a2: checkcast java/lang/Number
      // 3a5: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 3a8: ifeq 453
      // 3ab: goto 3b2
      // 3ae: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3b1: athrow
      // 3b2: aload 0
      // 3b3: aload 1
      // 3b4: aload 4
      // 3b6: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.c (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Lkotlin/Pair;
      // 3b9: astore 10
      // 3bb: aload 10
      // 3bd: ifnull 433
      // 3c0: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 3c3: aload 10
      // 3c5: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 3c8: checkcast net/minecraft/core/BlockPos
      // 3cb: aconst_null
      // 3cc: bipush 2
      // 3cd: aconst_null
      // 3ce: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Lme/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;ILjava/lang/Object;)Ljava/util/ArrayList;
      // 3d1: astore 11
      // 3d3: aload 11
      // 3d5: aload 3
      // 3d6: ifnull 437
      // 3d9: ifnull 433
      // 3dc: goto 3e3
      // 3df: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e2: athrow
      // 3e3: aload 11
      // 3e5: checkcast java/util/Collection
      // 3e8: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 3ed: aload 3
      // 3ee: ifnull 403
      // 3f1: goto 3f8
      // 3f4: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f7: athrow
      // 3f8: ifne 406
      // 3fb: goto 402
      // 3fe: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 401: athrow
      // 402: bipush 1
      // 403: goto 407
      // 406: bipush 0
      // 407: ifeq 433
      // 40a: aload 11
      // 40c: aload 11
      // 40e: checkcast java/util/List
      // 411: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 414: aload 10
      // 416: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 419: invokevirtual java/util/ArrayList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 41c: pop
      // 41d: aload 0
      // 41e: aload 11
      // 420: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 423: aload 0
      // 424: bipush 0
      // 425: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl I
      // 428: aload 0
      // 429: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.k ()V
      // 42c: goto 433
      // 42f: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 432: athrow
      // 433: aload 0
      // 434: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 437: aload 3
      // 438: ifnull 457
      // 43b: ifnonnull 453
      // 43e: goto 445
      // 441: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 444: athrow
      // 445: aload 0
      // 446: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 449: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 44c: goto 453
      // 44f: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 452: athrow
      // 453: aload 0
      // 454: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 457: astore 10
      // 459: aload 10
      // 45b: ifnull 57c
      // 45e: aload 0
      // 45f: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl I
      // 462: aload 10
      // 464: invokevirtual java/util/ArrayList.size ()I
      // 467: if_icmpge 57c
      // 46a: goto 471
      // 46d: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 470: athrow
      // 471: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 474: aload 4
      // 476: aload 10
      // 478: checkcast java/util/List
      // 47b: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 47e: checkcast net/minecraft/world/phys/Vec3
      // 481: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 484: dstore 11
      // 486: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 489: sipush -22216
      // 48c: sipush -14482
      // 48f: pop2
      // 490: ldc_w "sneak"
      // 493: iload 6
      // 495: aload 3
      // 496: ifnull 4b0
      // 499: ifne 4c2
      // 49c: goto 4a3
      // 49f: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4a2: athrow
      // 4a3: dload 11
      // 4a5: ldc2_w 3.0
      // 4a8: dcmpg
      // 4a9: goto 4b0
      // 4ac: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4af: athrow
      // 4b0: aload 3
      // 4b1: ifnull 4bf
      // 4b4: ifge 4c2
      // 4b7: goto 4be
      // 4ba: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4bd: athrow
      // 4be: bipush 1
      // 4bf: goto 4c3
      // 4c2: bipush 0
      // 4c3: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 4c6: aload 10
      // 4c8: aload 0
      // 4c9: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl I
      // 4cc: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 4cf: dup
      // 4d0: sipush -22222
      // 4d3: sipush -12400
      // 4d6: pop2
      // 4d7: ldc_w "get(...)"
      // 4da: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4dd: checkcast net/minecraft/world/phys/Vec3
      // 4e0: astore 13
      // 4e2: aload 0
      // 4e3: aload 13
      // 4e5: aload 4
      // 4e7: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4ea: astore 14
      // 4ec: aload 3
      // 4ed: ifnull 533
      // 4f0: aload 14
      // 4f2: getstatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 4f5: swap
      // 4f6: invokevirtual me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.ordinal ()I
      // 4f9: iaload
      // 4fa: tableswitch 118 1 3 30 61 92
      // 514: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 517: athrow
      // 518: aload 0
      // 519: aload 0
      // 51a: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl I
      // 51d: bipush 1
      // 51e: iadd
      // 51f: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl I
      // 522: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 525: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 528: aload 0
      // 529: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.k ()V
      // 52c: goto 533
      // 52f: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 532: athrow
      // 533: aload 3
      // 534: ifnonnull 5a5
      // 537: aload 0
      // 538: aconst_null
      // 539: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 53c: aload 0
      // 53d: bipush 0
      // 53e: putfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl I
      // 541: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 544: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 547: aload 0
      // 548: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.k ()V
      // 54b: aload 3
      // 54c: ifnonnull 5a5
      // 54f: goto 556
      // 552: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 555: athrow
      // 556: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 559: aload 4
      // 55b: aload 13
      // 55d: bipush 0
      // 55e: dconst_0
      // 55f: bipush 12
      // 561: aconst_null
      // 562: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 565: aload 3
      // 566: ifnonnull 5a5
      // 569: goto 570
      // 56c: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 56f: athrow
      // 570: new kotlin/NoWhenBranchMatchedException
      // 573: dup
      // 574: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 577: athrow
      // 578: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 57b: athrow
      // 57c: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 57f: sipush -22216
      // 582: sipush -14482
      // 585: pop2
      // 586: ldc_w "sneak"
      // 589: iload 6
      // 58b: aload 3
      // 58c: ifnull 59a
      // 58f: ifne 59d
      // 592: goto 599
      // 595: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 598: athrow
      // 599: bipush 1
      // 59a: goto 59e
      // 59d: bipush 0
      // 59e: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 5a1: aload 0
      // 5a2: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.k ()V
      // 5a5: aload 10
      // 5a7: ifnonnull 5c8
      // 5aa: aload 0
      // 5ab: aload 1
      // 5ac: aload 4
      // 5ae: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.b (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Z
      // 5b1: ifne 5c8
      // 5b4: goto 5bb
      // 5b7: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5ba: athrow
      // 5bb: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 5be: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 5c1: goto 5c8
      // 5c4: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5c7: athrow
      // 5c8: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 5cb: aload 1
      // 5cc: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.d (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 5cf: invokestatic me/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.a (Lnet/minecraft/world/phys/Vec3;)V
      // 5d2: aload 3
      // 5d3: ifnonnull 7b0
      // 5d6: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 5d9: sipush -22216
      // 5dc: sipush -14482
      // 5df: pop2
      // 5e0: ldc_w "sneak"
      // 5e3: iload 6
      // 5e5: aload 3
      // 5e6: ifnull 5fb
      // 5e9: goto 5f0
      // 5ec: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5ef: athrow
      // 5f0: ifne 5fe
      // 5f3: goto 5fa
      // 5f6: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5f9: athrow
      // 5fa: bipush 1
      // 5fb: goto 5ff
      // 5fe: bipush 0
      // 5ff: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 602: aload 9
      // 604: invokestatic me/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.a (Lnet/minecraft/world/phys/Vec3;)V
      // 607: getstatic me/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 60a: aload 9
      // 60c: invokevirtual me/octo/client/utils/player/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.c (Lnet/minecraft/world/phys/Vec3;)D
      // 60f: dstore 10
      // 611: dload 10
      // 613: aload 0
      // 614: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl D
      // 617: dcmpg
      // 618: aload 3
      // 619: ifnull 627
      // 61c: ifge 62a
      // 61f: goto 626
      // 622: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 625: athrow
      // 626: bipush 1
      // 627: goto 62b
      // 62a: bipush 0
      // 62b: istore 12
      // 62d: iload 12
      // 62f: aload 3
      // 630: ifnull 64d
      // 633: ifne 64b
      // 636: goto 63d
      // 639: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 63c: athrow
      // 63d: aload 0
      // 63e: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 641: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 644: goto 64b
      // 647: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 64a: athrow
      // 64b: iload 6
      // 64d: aload 3
      // 64e: ifnull 65d
      // 651: ifne 67f
      // 654: goto 65b
      // 657: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 65a: athrow
      // 65b: iload 7
      // 65d: aload 3
      // 65e: ifnull 66d
      // 661: ifne 67f
      // 664: goto 66b
      // 667: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 66a: athrow
      // 66b: iload 12
      // 66d: aload 3
      // 66e: ifnull 67c
      // 671: ifeq 67f
      // 674: goto 67b
      // 677: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 67a: athrow
      // 67b: bipush 1
      // 67c: goto 680
      // 67f: bipush 0
      // 680: istore 13
      // 682: iload 13
      // 684: aload 3
      // 685: ifnull 6a6
      // 688: ifne 6a4
      // 68b: goto 692
      // 68e: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 691: athrow
      // 692: aload 0
      // 693: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 696: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 699: aload 0
      // 69a: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.h ()V
      // 69d: goto 6a4
      // 6a0: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6a3: athrow
      // 6a4: iload 7
      // 6a6: aload 3
      // 6a7: ifnull 6d2
      // 6aa: ifeq 6d0
      // 6ad: goto 6b4
      // 6b0: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6b3: athrow
      // 6b4: dload 10
      // 6b6: aload 0
      // 6b7: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI D
      // 6ba: dcmpg
      // 6bb: aload 3
      // 6bc: ifnull 707
      // 6bf: goto 6c6
      // 6c2: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6c5: athrow
      // 6c6: iflt 706
      // 6c9: goto 6d0
      // 6cc: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6cf: athrow
      // 6d0: iload 12
      // 6d2: aload 3
      // 6d3: ifnull 6f8
      // 6d6: ifeq 70a
      // 6d9: goto 6e0
      // 6dc: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6df: athrow
      // 6e0: aload 0
      // 6e1: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 6e4: aload 0
      // 6e5: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll I
      // 6e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6eb: checkcast java/lang/Number
      // 6ee: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 6f1: goto 6f8
      // 6f4: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6f7: athrow
      // 6f8: aload 3
      // 6f9: ifnull 707
      // 6fc: ifeq 70a
      // 6ff: goto 706
      // 702: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 705: athrow
      // 706: bipush 1
      // 707: goto 70b
      // 70a: bipush 0
      // 70b: istore 14
      // 70d: iload 14
      // 70f: aload 3
      // 710: ifnull 728
      // 713: ifeq 73a
      // 716: goto 71d
      // 719: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 71c: athrow
      // 71d: aload 0
      // 71e: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.i ()Z
      // 721: goto 728
      // 724: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 727: athrow
      // 728: aload 3
      // 729: ifnull 737
      // 72c: ifeq 73a
      // 72f: goto 736
      // 732: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 735: athrow
      // 736: bipush 1
      // 737: goto 73b
      // 73a: bipush 0
      // 73b: istore 15
      // 73d: iload 15
      // 73f: aload 3
      // 740: ifnull 767
      // 743: ifeq 75e
      // 746: goto 74d
      // 749: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 74c: athrow
      // 74d: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 750: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 753: aload 3
      // 754: ifnonnull 7b0
      // 757: goto 75e
      // 75a: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 75d: athrow
      // 75e: iload 13
      // 760: goto 767
      // 763: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 766: athrow
      // 767: aload 3
      // 768: ifnull 798
      // 76b: ifeq 7a3
      // 76e: goto 775
      // 771: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 774: athrow
      // 775: aload 0
      // 776: aload 3
      // 777: ifnull 79c
      // 77a: goto 781
      // 77d: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 780: athrow
      // 781: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 784: aload 0
      // 785: getfield me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll I
      // 788: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 78b: checkcast java/lang/Number
      // 78e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 791: goto 798
      // 794: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 797: athrow
      // 798: ifeq 7a3
      // 79b: aload 0
      // 79c: invokespecial me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.g ()V
      // 79f: aload 3
      // 7a0: ifnonnull 7b0
      // 7a3: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 7a6: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 7a9: goto 7b0
      // 7ac: invokestatic me/octo/client/IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7af: athrow
      // 7b0: bipush 0
      // 7b1: ireturn
   }

    private final void g() {
       me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
       me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", true);
       int var2 = 4;
       if (this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII % var2 == 0) {
          me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((String) this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll), true);
       }
       this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII + 1;
       if (this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII % (var2 * 4) == 0) {
          this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = (this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll + 1) % this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.size();
       }
    }

   private final void h() {
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = 0;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 0;
   }

   private final boolean a(BlockPos param1) {
      var var3 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i());
      if (!var3.a()) {
         return false;
      }
      return kotlin.jvm.internal.Intrinsics.areEqual(var3.b(), param1);
   }

   private final void k() {
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = null;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = Double.MAX_VALUE;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
   }

   private final void l() {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = CollectionsKt.emptyList();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
      this.k();
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.f();
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.f();
      this.h();
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "ûj\u009c£Ú\u0094¨Ã\u0005\u008e\u008dµ|\u0089\u0005éóz]-\u0007K\u000f\u00ad\u001buk±\t\u000e1\u0006\u0094\u0002¥uâæ\u0004\u0000!\u009b\u0096\bb\u0018yÌty}~\u0003«\u009dd\t\u0014nE\u007fjØxMG\bZÚ\u001ar¦Ê\tã\u0005³\u0083\u0012½}";
      int var4 = "ûj\u009c£Ú\u0094¨Ã\u0005\u008e\u008dµ|\u0089\u0005éóz]-\u0007K\u000f\u00ad\u001buk±\t\u000e1\u0006\u0094\u0002¥uâæ\u0004\u0000!\u009b\u0096\bb\u0018yÌty}~\u0003«\u009dd\t\u0014nE\u007fjØxMG\bZÚ\u001ar¦Ê\tã\u0005³\u0083\u0012½}"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 20;
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
                     case 1 -> 21;
                     case 2 -> 98;
                     case 3 -> 59;
                     case 4 -> 71;
                     case 5 -> 18;
                     default -> 72;
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
                     d = new String[13];
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

                  var2 = "8ï||\u009a!î;\u0004aA4Â";
                  var4 = "8ï||\u009a!î;\u0004aA4Â".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 63;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -22222) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 216;
            case 1 -> 109;
            case 2 -> 194;
            case 3 -> 171;
            case 4 -> 141;
            case 5 -> 134;
            case 6 -> 73;
            case 7 -> 178;
            case 8 -> 57;
            case 9 -> 79;
            case 10 -> 82;
            case 11 -> 225;
            case 12 -> 153;
            case 13 -> 20;
            case 14 -> 37;
            case 15 -> 142;
            case 16 -> 241;
            case 17 -> 117;
            case 18 -> 39;
            case 19 -> 63;
            case 20 -> 185;
            case 21 -> 112;
            case 22 -> 143;
            case 23 -> 226;
            case 24 -> 125;
            case 25 -> 155;
            case 26 -> 75;
            case 27 -> 135;
            case 28 -> 70;
            case 29 -> 9;
            case 30 -> 78;
            case 31 -> 89;
            case 32 -> 85;
            case 33 -> 253;
            case 34 -> 163;
            case 35 -> 251;
            case 36 -> 119;
            case 37 -> 102;
            case 38 -> 147;
            case 39 -> 159;
            case 40 -> 10;
            case 41 -> 116;
            case 42 -> 181;
            case 43 -> 239;
            case 44 -> 101;
            case 45 -> 199;
            case 46 -> 183;
            case 47 -> 2;
            case 48 -> 210;
            case 49 -> 45;
            case 50 -> 86;
            case 51 -> 208;
            case 52 -> 114;
            case 53 -> 214;
            case 54 -> 172;
            case 55 -> 120;
            case 56 -> 95;
            case 57 -> 104;
            case 58 -> 51;
            case 59 -> 205;
            case 60 -> 137;
            case 61 -> 50;
            case 62 -> 244;
            case 63 -> 202;
            case 64 -> 175;
            case 65 -> 12;
            case 66 -> 77;
            case 67 -> 38;
            case 68 -> 123;
            case 69 -> 247;
            case 70 -> 11;
            case 71 -> 26;
            case 72 -> 32;
            case 73 -> 228;
            case 74 -> 13;
            case 75 -> 220;
            case 76 -> 154;
            case 77 -> 187;
            case 78 -> 246;
            case 79 -> 5;
            case 80 -> 80;
            case 81 -> 36;
            case 82 -> 156;
            case 83 -> 245;
            case 84 -> 33;
            case 85 -> 231;
            case 86 -> 1;
            case 87 -> 74;
            case 88 -> 126;
            case 89 -> 88;
            case 90 -> 48;
            case 91 -> 69;
            case 92 -> 233;
            case 93 -> 192;
            case 94 -> 158;
            case 95 -> 29;
            case 96 -> 97;
            case 97 -> 165;
            case 98 -> 87;
            case 99 -> 235;
            case 100 -> 90;
            case 101 -> 136;
            case 102 -> 55;
            case 103 -> 195;
            case 104 -> 44;
            case 105 -> 111;
            case 106 -> 196;
            case 107 -> 200;
            case 108 -> 98;
            case 109 -> 23;
            case 110 -> 190;
            case 111 -> 169;
            case 112 -> 160;
            case 113 -> 76;
            case 114 -> 252;
            case 115 -> 94;
            case 116 -> 248;
            case 117 -> 56;
            case 118 -> 58;
            case 119 -> 61;
            case 120 -> 27;
            case 121 -> 234;
            case 122 -> 19;
            case 123 -> 62;
            case 124 -> 115;
            case 125 -> 240;
            case 126 -> 67;
            case 127 -> 100;
            case 128 -> 93;
            case 129 -> 53;
            case 130 -> 105;
            case 131 -> 118;
            case 132 -> 14;
            case 133 -> 238;
            case 134 -> 229;
            case 135 -> 207;
            case 136 -> 8;
            case 137 -> 188;
            case 138 -> 174;
            case 139 -> 52;
            case 140 -> 124;
            case 141 -> 146;
            case 142 -> 24;
            case 143 -> 68;
            case 144 -> 46;
            case 145 -> 60;
            case 146 -> 198;
            case 147 -> 130;
            case 148 -> 250;
            case 149 -> 71;
            case 150 -> 140;
            case 151 -> 211;
            case 152 -> 206;
            case 153 -> 223;
            case 154 -> 107;
            case 155 -> 151;
            case 156 -> 217;
            case 157 -> 108;
            case 158 -> 139;
            case 159 -> 255;
            case 160 -> 177;
            case 161 -> 131;
            case 162 -> 47;
            case 163 -> 176;
            case 164 -> 42;
            case 165 -> 21;
            case 166 -> 203;
            case 167 -> 7;
            case 168 -> 193;
            case 169 -> 22;
            case 170 -> 121;
            case 171 -> 243;
            case 172 -> 15;
            case 173 -> 152;
            case 174 -> 162;
            case 175 -> 164;
            case 176 -> 232;
            case 177 -> 204;
            case 178 -> 249;
            case 179 -> 145;
            case 180 -> 3;
            case 181 -> 129;
            case 182 -> 150;
            case 183 -> 91;
            case 184 -> 173;
            case 185 -> 213;
            case 186 -> 16;
            case 187 -> 59;
            case 188 -> 25;
            case 189 -> 34;
            case 190 -> 72;
            case 191 -> 149;
            case 192 -> 254;
            case 193 -> 179;
            case 194 -> 212;
            case 195 -> 157;
            case 196 -> 167;
            case 197 -> 0;
            case 198 -> 168;
            case 199 -> 66;
            case 200 -> 197;
            case 201 -> 127;
            case 202 -> 218;
            case 203 -> 161;
            case 204 -> 35;
            case 205 -> 189;
            case 206 -> 215;
            case 207 -> 4;
            case 208 -> 221;
            case 209 -> 227;
            case 210 -> 6;
            case 211 -> 17;
            case 212 -> 65;
            case 213 -> 84;
            case 214 -> 96;
            case 215 -> 28;
            case 216 -> 31;
            case 217 -> 40;
            case 218 -> 201;
            case 219 -> 41;
            case 220 -> 170;
            case 221 -> 133;
            case 222 -> 64;
            case 223 -> 122;
            case 224 -> 219;
            case 225 -> 191;
            case 226 -> 106;
            case 227 -> 92;
            case 228 -> 128;
            case 229 -> 81;
            case 230 -> 222;
            case 231 -> 148;
            case 232 -> 182;
            case 233 -> 99;
            case 234 -> 113;
            case 235 -> 184;
            case 236 -> 49;
            case 237 -> 30;
            case 238 -> 186;
            case 239 -> 144;
            case 240 -> 180;
            case 241 -> 83;
            case 242 -> 242;
            case 243 -> 138;
            case 244 -> 230;
            case 245 -> 166;
            case 246 -> 54;
            case 247 -> 209;
            case 248 -> 132;
            case 249 -> 237;
            case 250 -> 18;
            case 251 -> 110;
            case 252 -> 103;
            case 253 -> 43;
            case 254 -> 236;
            default -> 224;
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


   // PX-RESTORED from javap -c of the reference jar (Kotlin $default bridge).
   public static boolean a(IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl param0, BlockPos param1, Integer param2, int param3, Object param4) {
      IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      if ((param3 & 2) != 0) {
         param2 = null;
      }
      return param0.a(param1, param2);
   }

   // PX-RESTORED from javap -c; the watermark array is non-null, so the null arm is dead.
   private final boolean i() {
      IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      if (!this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
         return false;
      }
      if (!this.j()) {
         return false;
      }
      if (!IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
         return false;
      }
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.f();
      return true;
   }

   // PX-RESTORED from javap -c; "sneak" is const #290 of the reference class.
   private final boolean j() {
      IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      return (this.a().player != null && this.a().player.isShiftKeyDown()) || llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak");
   }

   // PX-RESTORED from javap -c; calls the jar's static Kotlin $default bridge verbatim (mask 4 -> default 0.3).
   private final boolean a(BlockPos param1, Vec3 param2) {
      return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.b(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, param1, param2, 0.0);
   }

   // PX-RESTORED from javap -c (Vineflower could not decompile this method).
   private final boolean b(BlockPos param1, Vec3 param2) {
      IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      double var4 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B();
      Vec3 var6 = null;
      double var7 = Double.MAX_VALUE;
      for (Vec3 var10 : CollectionsKt.drop(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, 1)) {
         Vec3 var11 = param2.add(var10);
         if (!llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1, var11.add(0.0, var4, 0.0)).isEmpty()) {
            double var12 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(param2, var11);
            if (var12 < var7) {
               var7 = var12;
               var6 = var11;
            }
         }
      }
      if (var6 == null) {
         return false;
      }
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param2, var6, false, 0.0);
      return true;
   }

   // PX-RESTORED from javap -c (Vineflower could not decompile this method).
   private final kotlin.Pair<BlockPos, Vec3> c(BlockPos param1, Vec3 param2) {
      if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.isEmpty()) {
         return null;
      }
      double var4 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B();
      BlockPos var10 = null;
      double var11 = 0.0;
      boolean var13 = true;
      for (BlockPos var16 : this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
         if (var13) {
            var13 = false;
            var10 = var16;
            var11 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(param2, lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var16));
         } else {
            double var14 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(param2, lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var16));
            if (Double.compare(var11, var14) > 0) {
               var10 = var16;
               var11 = var14;
            }
         }
      }
      Intrinsics.checkNotNull(var10);
      Vec3 var7 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var10);
      for (Vec3 var9 : this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
         Vec3 var17 = var7.add(var9);
         if (!llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1, var17.add(0.0, var4, 0.0)).isEmpty()) {
            return new kotlin.Pair<BlockPos, Vec3>(var10, var17);
         }
      }
      kotlin.Pair<BlockPos, Vec3> var8 = null;
      double var9b = Double.MAX_VALUE;
      for (BlockPos var18 : this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
         if (Intrinsics.areEqual(var18, var10)) {
            continue;
         }
         Vec3 var19 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var18);
         for (Vec3 var20 : this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            Vec3 var21 = var19.add(var20);
            if (llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1, var21.add(0.0, var4, 0.0)).isEmpty()) {
               continue;
            }
            double var22 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(param2, var21);
            if (var22 < var9b) {
               var9b = var22;
               var8 = new kotlin.Pair<BlockPos, Vec3>(var18, var21);
            }
         }
      }
      return var8;
   }

   // PX-RESTORED from javap -c; RAY.g / RAY.a are PX-FIX stubs in another agent's file (see report).
   private final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(Vec3 param1, Vec3 param2) {
      double var4 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(param2, param1);
      IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      Vec3 var6 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      if (var6 == null || IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var6, param1) > 0.01) {
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = param1;
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var4;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
      } else if (var4 < this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl - 0.05) {
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var4;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
      }
      if (lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2, 0.35)) {
         return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(Integer.valueOf(900))) {
         return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   private static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      public static IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIlIIlIIIlllIlIIIlIIlIIllIIIlIIlllIllIIIlIlllllllIIlIIlIIIllIlIIIlIlIlIllllIlllllIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() {
         return values();
      }

   }
}
