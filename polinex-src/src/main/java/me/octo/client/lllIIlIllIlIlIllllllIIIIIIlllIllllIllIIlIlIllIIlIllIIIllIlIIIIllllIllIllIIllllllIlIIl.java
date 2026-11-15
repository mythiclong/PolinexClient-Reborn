package me.octo.client;

import java.util.ArrayList;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.MatchResult;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.entity.Entity;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import java.util.Iterator;
import net.minecraft.client.player.LocalPlayer;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;

public final class lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
   @NotNull
   public static lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private final HashSet<String> llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private int IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private int llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   @NotNull
   private BlockPos lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @NotNull
   private Vec3 IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private boolean IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private boolean lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private final List<Pair<BlockPos, Vec3>> IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @JvmField
   @NotNull
   public static lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private static String[] h;
   private static String[] i;

   public lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl() {
      short var10001 = -26096;
      short var10002 = 2559;
      var10002 = -26093;
      short var10003 = 9539;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var7 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -26092;
      short var10005 = 14245;
      String[] var1 = new String[3];
      short var10007 = -26101;
      short var10008 = 4986;
      var1[0] = "Press Configure to choose what to forge in each slot.";
      var10007 = -26097;
      var10008 = -15721;
      var1[1] = "Enable the Forges widget in /tablist or it can't see what's ready.";
      var10007 = -26088;
      var10008 = 19813;
      var1[2] = "It warps to the forge and stays parked, reforging whenever something finishes.";
      List var12 = CollectionsKt.listOf(var1);
      List var10006 = CollectionsKt.emptyList();
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var2 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIIlllllIlIllIIIlIlllIIllIlIIIlIIlIIIIIllIlIIlllllllIIIllllIIIIIIIIlllIIlIlIllllllll.c()
      };
      super(
         "Forge Macro",
         "Waits at the forge and forges your configured items the moment they're ready, no cooldown. Stops once everything is used up.",
         var7,
         "Mining",
         var12,
         var10006,
         false,
         var2
      );
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new HashSet<>();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[7];
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 500;
      BlockPos var4 = BlockPos.ZERO;
      var10003 = -26089;
      var10004 = 24385;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var4;
      Vec3 var5 = Vec3.ZERO;
      var10003 = -26082;
      var10004 = -4653;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var5;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Pair[] var3 = new Pair[]{
         new Pair(new BlockPos(22, 150, -88), new Vec3(23.5, 152.5, -87.5)),
         new Pair(new BlockPos(-22, 150, -80), new Vec3(-22.5, 152.5, -79.5)),
         new Pair(new BlockPos(22, 150, -58), new Vec3(23.5, 152.5, -57.5)),
         new Pair(new BlockPos(-22, 150, -50), new Vec3(-22.5, 152.5, -49.5))
      };
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = CollectionsKt.listOf(var3);
   }

   @Override
   public void M() {
      try {
         this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.clear();
         this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
         this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = false;
         this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = true;
         this.aM();
         super.M();
         this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.f();
         if (this.a6().isEmpty()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Forge Macro: no items configured. Press Configure to pick what to forge.");
         }
      }
      catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
         throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
      }
   }

   @Override
   public void N() {
      block4: {
         block5: {
            int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().c(true);
            int n2 = n;
            try {
               try {
                  llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
                  if (n2 == 0) break block4;
                  if (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d()) break block5;
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
               throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
            }
         }
         this.aN();
         super.N();
      }
   }

   @Override
   public void aC() {
   boolean var2;
   switch (this.W()) {
      case IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl:
         var2 = this.aK();
         break;
      case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
         this.a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = true;
         var2 = true;
         break;
      default:
         throw new kotlin.NoWhenBranchMatchedException();
   }
   if (var2) {
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.f();
   }
   }

   private final void bb() {
   if (!this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.a(java.lang.Integer.valueOf(1500))) {
      return;
   }
   this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.f();
   if (this.a8()) {
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Forge Macro: every configured item is out of materials. Stopping.");
      IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      return;
   }
   if (!this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll) {
      this.a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 2000);
      return;
   }
   if (this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
   } else if (this.a9()) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
   } else if (this.a_()) {
      return;
   } else if (this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.a(java.lang.Integer.valueOf(300000))) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
   } else {
      return;
   }
   this.bc();
   }

   private final void bc() {
      this.ba();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.f();
      Pair pair = (Pair)CollectionsKt.random((Collection)this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll, (Random)((Random)Random.Default));
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = (BlockPos)pair.getFirst();
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = (Vec3)pair.getSecond();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
      this.a5();
   }

   private final void bd() {
      block47: {
         block48: {
            double d;
            boolean blD = false;
            int n;
            block46: {
               EntityHitResult entityHitResult;
               block45: {
                  block44: {
                     block41: {
                        block42: {
                           IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll illIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
                           block43: {
                              int n2 = 0;
                              boolean blN2 = false;
                              block39: {
                                 block37: {
                                    block38: {
                                       lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl2;
                                       block35: {
                                          block36: {
                                             n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
                                             try {
                                                try {
                                                   lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl2 = this;
                                                   if (n == 0) break block35;
                                                   if (lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl2.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll != IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) break block36;
                                                }
                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                   throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                                }
                                                this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                                                this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                                                this.a5();
                                                return;
                                             }
                                             catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                             }
                                          }
                                          lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl2 = this;
                                       }
                                       try {
                                          try {
                                             blN2 = lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl2.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.a((Number)30000);
                                             if (n == 0) break block37;
                                             if (!blN2) break block38;
                                          }
                                          catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                             throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                          }
                                          this.bf();
                                          return;
                                       }
                                       catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                          throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                       }
                                    }
                                    double d2 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI, true) - 3.5;
                                    n2 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                 }
                                 try {
                                    try {
                                       block40: {
                                          try {
                                             try {
                                                try {
                                                   try {
                                                      if (n == 0) break block39;
                                                      if (n2 >= 0) break block40;
                                                   }
                                                   catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                      throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                                   }
                                                   llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
                                                   if (n == 0) break block41;
                                                }
                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                   throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                                }
                                                if (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d()) break block42;
                                             }
                                             catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                             }
                                             IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
                                             if (n != 0) break block42;
                                          }
                                          catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                             throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                          }
                                       }
                                       illIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e();
                                       if (n == 0) break block43;
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                       throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                    }
                                    n2 = illIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d() ? 1 : 0;
                                 }
                                 catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                 }
                              }
                              try {
                                 if (n2 != 0) {
                                    IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().a(this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl, (net.minecraft.world.phys.Vec3)null, false);
                                 }
                              }
                              catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                 throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                              }
                              illIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e();
                           }
                           illIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.c(false);
                        }
                        IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI);
                     }
                     try {
                        try {
                           if (n == 0) break block44;
                           entityHitResult = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.H();
                           if (entityHitResult != null) break block45;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                           throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                        }
                     }
                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                     }
                  }
                  return;
               }
               EntityHitResult entityHitResult2 = entityHitResult;
               try {
                  try {
                     Entity entity = entityHitResult2.getEntity();
                     Intrinsics.checkNotNullExpressionValue((Object)entity, (String)"getEntity(...)");
                     double d3 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(entity)) - 0.2;
                     d = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                     if (n == 0) break block46;
                     if (d >= 0) break block47;
                  }
                  catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                     throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                  }
                  blD = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.a((Number)1000);
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
            }
            try {
               try {
                  if (n == 0) break block48;
                  if (!blD) break block47;
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
               blD = me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j();
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
               throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
            }
         }
         this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.f();
      }
   }

   private final void bg() {
      block4: {
         int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         try {
            LocalPlayer localPlayer;
            try {
               if (n != 0 || (localPlayer = this.ap().player) == null) break block4;
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
               throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
            }
            localPlayer.closeContainer();
         }
         catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
            throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
         }
      }
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
      this.a5();
   }

   @Override
   public void aB() {
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = false;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = true;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }
   private final void a5() {
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = 500 + Random.Default.nextInt(500);
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.f();
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
   }
   private final List<Integer> a6() {
      Iterable iterable = (Iterable)new IntRange(1, 7);
      boolean bl = false;
      int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      Iterable iterable2 = iterable;
      Collection collection = new ArrayList();
      boolean bl2 = false;
      for (Object t : iterable2) {
         boolean bl3;
         block9: {
            block8: {
               int n2;
               IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI;
               block7: {
                  int n3 = ((Number)t).intValue();
                  boolean bl4 = false;
                  try {
                     try {
                        ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        n2 = n3;
                        if (n != 0) break block7;
                        if (ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.b(n2)) break block8;
                     }
                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                     }
                     ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     n2 = n3;
                  }
                  catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                     throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                  }
               }
               try {
                  if (ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.a(n2) == null) break block8;
                  bl3 = true;
                  break block9;
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
            }
            bl3 = false;
         }
         if (!bl3) continue;
         collection.add(t);
         if (n == 0) continue;
         break;
      }
      return (List)collection;
   }
   private final List<String> a7() {
      Iterable iterable = this.a6();
      boolean bl = false;
      Iterable iterable2 = iterable;
      Collection collection = new ArrayList();
      boolean bl2 = false;
      int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      Iterable iterable3 = iterable2;
      boolean bl3 = false;
      Iterator iterator = iterable3.iterator();
      while (iterator.hasNext()) {
         String string;
         block15: {
            block12: {
               block14: {
                  block13: {
                     Object t;
                     Object t2 = t = iterator.next();
                     boolean bl4 = false;
                     int n2 = ((Number)t2).intValue();
                     boolean bl5 = false;
                     try {
                        try {
                           if (n != 0) break;
                           if (n != 0) break block12;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                           throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                        }
                        string = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(n2);
                        if (string == null) break block12;
                     }
                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                     }
                     String string2 = string;
                     boolean bl6 = false;
                     try {
                        IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
                        try {
                           if (n != 0 || (illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(string2)) == null) break block13;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                           throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                        }
                        string = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
                        break block14;
                     }
                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                     }
                  }
                  string = null;
               }
               try {
                  if (n == 0) break block15;
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
            }
            string = null;
         }
         if (string != null) {
            String string3 = string;
            boolean bl7 = false;
            collection.add(string3);
         }
         if (n == 0) continue;
         break;
      }
      return (List)collection;
   }
   private final boolean a8() {
      boolean bl;
      block21: {
         block20: {
            boolean bl2;
            int n;
            List<Integer> list;
            block15: {
               block16: {
                  list = this.a6();
                  n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
                  try {
                     bl2 = ((Collection)list).isEmpty();
                     if (n == 0) break block15;
                     if (bl2) break block16;
                  }
                  catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                     throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                  }
                  bl2 = true;
                  break block15;
               }
               bl2 = false;
            }
            if (bl2) {
               boolean bl3 = false;
               block19: {
                  Iterable iterable;
                  block17: {
                     Iterable iterable2;
                     block18: {
                        iterable2 = list;
                        boolean bl4 = false;
                        try {
                           try {
                              try {
                                 try {
                                    iterable = iterable2;
                                    if (n == 0) break block17;
                                    if (!(iterable instanceof Collection)) break block18;
                                 }
                                 catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                 }
                                 iterable = (Collection)iterable2;
                                 if (n == 0) break block17;
                              }
                              catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                 throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                              }
                              if (!((Collection)iterable).isEmpty()) break block18;
                           }
                           catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                              throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                           }
                           bl3 = true;
                           break block19;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                           throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                        }
                     }
                     iterable = iterable2;
                  }
                  for (Object t : iterable) {
                     int n2 = ((Number)t).intValue();
                     boolean bl5 = false;
                     boolean bl6 = CollectionsKt.contains((Iterable)this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll, (Object)IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(n2));
                     while (!bl6) {
                        bl6 = false;
                        if (n == 0) continue;
                        break block19;
                     }
                  }
                  bl3 = true;
               }
               try {
                  if (!bl3) break block20;
                  bl = true;
                  break block21;
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
            }
         }
         bl = false;
      }
      return bl;
   }
   private final boolean a9() {
      List<String> list = lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h();
      int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      List<String> list2 = this.a7();
      Regex regex = new Regex("^(\\d+)\\.\\s+EMPTY$");
      Iterator<String> iterator = list.iterator();
      block32: while (true) {
         boolean bl = false;
         block46: {
            Iterable iterable;
            String string;
            block44: {
               Iterable iterable2;
               block45: {
                  boolean bl2 = iterator.hasNext();
                  do {
                     block37: {
                        block42: {
                           int n2;
                           IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI;
                           block43: {
                              int n3;
                              int n4;
                              block40: {
                                 block39: {
                                    block41: {
                                       int n5;
                                       block38: {
                                          int n6;
                                          Object object;
                                          block36: {
                                             if (!bl2) return false;
                                             String string2 = iterator.next();
                                             string = ((Object)StringsKt.trim((CharSequence)string2)).toString();
                                             MatchResult matchResult = ((Regex)regex).find((CharSequence)string, 0);
                                             try {
                                                try {
                                                   object = matchResult;
                                                   if (n != 0) break block36;
                                                   if (object == null) break block37;
                                                }
                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                   throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                                }
                                                object = matchResult.getGroupValues().get(1);
                                             }
                                             catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                             }
                                          }
                                          try {
                                             Integer n7 = StringsKt.toIntOrNull((String)((String)object));
                                             if (n7 == null) continue block32;
                                             n6 = n7;
                                          }
                                          catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                             throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                          }
                                          n4 = n6;
                                          try {
                                             try {
                                                try {
                                                   n3 = 1;
                                                   n5 = n4;
                                                   if (n != 0) break block38;
                                                   if (n3 > n5) break block39;
                                                }
                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                   throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                                }
                                                n3 = n4;
                                                if (n != 0) break block40;
                                             }
                                             catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                             }
                                             n5 = 8;
                                          }
                                          catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                             throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                          }
                                       }
                                       try {
                                          if (n3 >= n5) break block41;
                                          n3 = 1;
                                          break block40;
                                       }
                                       catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                          throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                       }
                                    }
                                    n3 = 0;
                                    break block40;
                                 }
                                 n3 = 0;
                              }
                              try {
                                 try {
                                    try {
                                       if (n3 == 0) break block42;
                                       ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                       n2 = n4;
                                       if (n != 0) break block43;
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                       throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                    }
                                    if (ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.b(n2)) break block42;
                                 }
                                 catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                                 }
                                 ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                 n2 = n4;
                              }
                              catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                 throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                              }
                           }
                           String string3 = ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.a(n2);
                           try {
                              boolean bl3;
                              try {
                                 if (string3 == null) break block42;
                                 bl3 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.contains(string3);
                                 if (n != 0) return bl3;
                              }
                              catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                 throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                              }
                              if (bl3) break block42;
                              return true;
                           }
                           catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                              throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                           }
                        }
                        if (n == 0) continue block32;
                     }
                     bl2 = StringsKt.endsWith((String)string, (String)": Ready!", false);
                  } while (n != 0);
                  if (!bl2) continue;
                  iterable2 = list2;
                  boolean bl4 = false;
                  try {
                     try {
                        try {
                           try {
                              iterable = iterable2;
                              if (n != 0) break block44;
                              if (!(iterable instanceof Collection)) break block45;
                           }
                           catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                              throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                           }
                           iterable = (Collection)iterable2;
                           if (n != 0) break block44;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                           throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                        }
                        if (!((Collection)iterable).isEmpty()) break block45;
                     }
                     catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                     }
                     bl = false;
                     break block46;
                  }
                  catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                     throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                  }
               }
               iterable = iterable2;
            }
            for (Object t : iterable) {
               String string4 = (String)t;
               boolean bl5 = false;
               boolean bl6 = StringsKt.contains((CharSequence)string, (CharSequence)string4, false);
               while (bl6) {
                  bl6 = true;
                  if (n != 0) continue;
                  break block46;
               }
            }
            bl = false;
         }
         if (bl) return true;
      }
   }
   private final boolean a_() {
      List list = lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h();
      List list2 = this.a7();
      Regex regex = new Regex("^(\\d+)\\.\\s+EMPTY$");
      for (Object obj : (Iterable)list) {
         String string = (String)obj;
         String string2 = StringsKt.trim((CharSequence)string).toString();
         if (regex.find((CharSequence)string2, 0) != null) {
            return true;
         }
         if (!StringsKt.contains((CharSequence)string2, (CharSequence)":", false)) {
            continue;
         }
         for (Object obj2 : (Iterable)list2) {
            if (StringsKt.contains((CharSequence)string2, (CharSequence)(String)obj2, false)) {
               return true;
            }
         }
      }
      return false;
   }
   private final void ba() {
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[7];
      int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      for (int i = 1; i < 8; ++i) {
         IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
         block13: {
            String string = null;
            int n2;
            IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI;
            block12: {
               try {
                  try {
                     ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     n2 = i;
                     if (n == 0) break block12;
                     if (ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.b(n2)) continue;
                  }
                  catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                     throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
                  }
                  ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  n2 = i;
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
            }
            try {
               if (ilIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.a(n2) == null) {
                  continue;
               }
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
               throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
            }
            String string2 = string;
            try {
               try {
                  if (n == 0) continue;
                  illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(string2);
                  if (illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI != null) break block13;
                  continue;
               }
               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
               }
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
               throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
            }
         }
         IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2 = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
         this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[i - 1] = new lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2.c(), illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2.d(), illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2.b(), illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2.a());
         if (n != 0) continue;
      }
   }
   private final void be() {
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int n = this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = n + 1;
      this.a5();
   }
   private final void bf() {
      block4: {
         int n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         try {
            LocalPlayer localPlayer;
            try {
               if (n == 0 || (localPlayer = this.ap().player) == null) break block4;
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
               throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
            }
            localPlayer.closeContainer();
         }
         catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
            throw lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.a(noWhenBranchMatchedException);
         }
      }
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().c(true);
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.f();
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      // PX-R1761: rebuilt from javap -c (730 instructions). Drives the forge GUI: it watches the
      // container title and the ready/completed lore of the seven slot rows, clicks the configured
      // process or the Confirm button, and parks in the configured slots.
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      String var3 = param1.k();
      if (var3 != null) {
         java.util.List var42 = param1.m();
         if (var42 != null) {
            java.util.List var4 = var42;
            if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI == IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               if (kotlin.jvm.internal.Intrinsics.areEqual(var3, "The Forge")) {
                  this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               }
            } else if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI == IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               switch (me.octo.client.lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.ordinal()]) {
                  case 1:
                     if (!this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.a((Number)this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl)) {
                        return;
                     }
                     boolean var18 = false;
                     for (int var21 = 0; var21 < 7; var21++) {
                        net.minecraft.world.inventory.Slot var55 = null;
                        for (Object var38 : var4) {
                           net.minecraft.world.inventory.Slot var40 = (net.minecraft.world.inventory.Slot)var38;
                           if (var40.index == 10 + var21) {
                              var55 = var40;
                              break;
                           }
                        }
                        if (var55 != null) {
                           net.minecraft.world.inventory.Slot var24 = var55;
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var56 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           net.minecraft.world.item.ItemStack var61 = var24.getItem();
                           kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var61, "getItem(...)");
                           java.util.List<net.minecraft.network.chat.Component> var29 = var56.d(var61);
                           boolean var58;
                           if (var29 instanceof java.util.Collection && ((java.util.Collection)var29).isEmpty()) {
                              var58 = false;
                           } else {
                              var58 = false;
                              for (net.minecraft.network.chat.Component var39 : var29) {
                                 me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var57 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                 String var62 = var39.getString();
                                 kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var62, "getString(...)");
                                 if (var57.a(var62).contains("Completed")) {
                                    var58 = true;
                                    break;
                                 }
                              }
                           }
                           if (var58) {
                              var18 = true;
                           }
                        }
                     }
                     if (var18) {
                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(48, 0, net.minecraft.world.inventory.ContainerInput.PICKUP);
                     }
                     this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     this.a5();
                     break;
                  case 2:
                     if (!kotlin.jvm.internal.Intrinsics.areEqual(var3, "The Forge")) {
                        return;
                     }
                     if (!this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.a((Number)this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl)) {
                        return;
                     }
                     for (int var17 = this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII; var17 < 7; var17++) {
                        me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var51 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[var17];
                        if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[var17] != null) {
                           me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var20 = var51;
                           if (!this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.contains(var20.d())) {
                              net.minecraft.world.inventory.Slot var52 = (net.minecraft.world.inventory.Slot)kotlin.collections.CollectionsKt.getOrNull(var4, 10 + var17);
                              if (var52 != null) {
                                 net.minecraft.world.inventory.Slot var23 = var52;
                                 if (var23.hasItem()) {
                                    me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var53 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                    String var60 = var23.getItem().getHoverName().getString();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var60, "getString(...)");
                                    if (var53.a(var60).contains("Slot #")) {
                                       me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var23.index, 0, net.minecraft.world.inventory.ContainerInput.PICKUP);
                                       this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var17;
                                       this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                                       this.a5();
                                       return;
                                    }
                                 }
                              }
                           }
                        }
                     }
                     this.bf();
                     break;
                  case 3:
                     if (!var3.startsWith("Select Process")) {
                        return;
                     }
                     if (!this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.a((Number)this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl)) {
                        return;
                     }
                     me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var50 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII];
                     if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII] == null) {
                        this.be();
                        return;
                     }
                     me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var16 = var50;
                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var16.b(), 0, net.minecraft.world.inventory.ContainerInput.PICKUP);
                     this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                     this.a5();
                     break;
                  case 4:
                     if (!this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.a((Number)this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl)) {
                        return;
                     }
                     me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var48 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII];
                     if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII] == null) {
                        this.be();
                        return;
                     }
                     me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = var48;
                     if (!kotlin.jvm.internal.Intrinsics.areEqual(var3, var15.a())) {
                        return;
                     }
                     for (net.minecraft.world.inventory.Slot var22 : (java.util.List<net.minecraft.world.inventory.Slot>)var4) {
                        if (var22.hasItem()) {
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var49 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           net.minecraft.world.item.ItemStack var59 = var22.getItem();
                           kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var59, "getItem(...)");
                           if (kotlin.jvm.internal.Intrinsics.areEqual(var49.b(var59), var15.d())) {
                              me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var22.index, 0, net.minecraft.world.inventory.ContainerInput.PICKUP);
                              this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              this.a5();
                              return;
                           }
                        }
                     }
                     break;
                  case 5:
                     if (!this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.a((Number)this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl)) {
                        return;
                     }
                     me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var43 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII];
                     if (this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII] == null) {
                        this.be();
                        return;
                     }
                     me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = var43;
                     net.minecraft.world.inventory.Slot var47 = null;
                     for (Object var11 : var4) {
                        net.minecraft.world.inventory.Slot var12 = (net.minecraft.world.inventory.Slot)var11;
                        if (var12.hasItem()) {
                           me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var44 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                           String var10001 = var12.getItem().getHoverName().getString();
                           kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                           if (kotlin.jvm.internal.Intrinsics.areEqual(var44.a(var10001).trim(), "Confirm")) {
                              var47 = var12;
                              break;
                           }
                        }
                     }
                     if (var47 == null) {
                        return;
                     }
                     net.minecraft.world.inventory.Slot var6 = var47;
                     net.minecraft.world.item.Item var7 = (net.minecraft.world.item.Item)net.minecraft.world.item.Item.BY_BLOCK.get(net.minecraft.world.level.block.Blocks.RED_TERRACOTTA);
                     if (var7 != null && var6.getItem().is(var7)) {
                        this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.add(var5.d());
                        this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII++;
                        this.bg();
                        return;
                     }
                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var6.index, 0, net.minecraft.world.inventory.ContainerInput.PICKUP);
                     this.be();
               }
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "j\"\u0081,ÃjÖN«Æ\u0098tõ¼ªÍ¯\u0084Cá\t\u001b3\u0099&¨y\u00811/\u00978yÔìu<úx¤½Ed\u001c\u001eÉ,É\u0087÷¦\u0093qæ¥ËJß/ü½Ì\u008düÊ\u000e<'Hó-q\u001c:Vüâ6Ý.\u000e\u0003Õ¯\u00adÑº\u0083C¥Ó\u009cÓ\u0012\u0092NË\u008a\tQÎ\u0085Î¹qnè½¯Ñ,\u0089\u001a÷1_U\u0006ôº:~\u0098µ)Ã+\u0083¢qrNá\u009bT\u0011\u0015I¾y?G\u0018I\nìKá\u0018\u009dëL\u0097µ+t\u0084º]¥ü\u0017\u0019käª\u0097gï±{\nSà\f\bQÎ'ý¥\u0002\u0013XQCB\u0004\u0018Ip\u0006\u0011 líIë¬EñÕ\u0096Ë >\u00931\u0087ì\u0005<b\u001b\u0017t|þú;ëúã\tjºó\u0096KÓìw³;¢f¸¬xà±ÚDúûá`hÊ\u0084íA¤\u0095ÅÛØò\u0000áHTm¡¹?æ«\f\u0091gé\u0083ßÍfÓÈ\u0083°¸¬¸\u0004SàæF\u0091¹â0,èµ,Í\u008bò~\u0014g\u0092R@\fû(\u0081£Vs\u0091tj\u0082Z¦éÒ+ÜéÝE\b\u0091N;\fsæ\u0087\u001eãWCõÅgç\u0007\u0091£G\u001d\u0088?\u0012\u000e\u008e#\u001eeýq_æ >ñn¿%\u000b]Úg3\u001f\u0089M2ØIö\u0004ÁdK£\u0011´\u001coG»mOÉ\u0094\u0091ãÀ;\u008f\u0091\u0004ø\b\u007f¬ðYÍÂ§×\u0006¼z-ïÂ\u009a5ÂÏW;ú\u001e+ÎÖ\r\u009dÆÆ\u000b \u008b\u0089·ASNL5HÌ\u009ecµÒQ\u0007)\u0001»îzó\u009aªR±*\u0014u÷\u0089qZ\u0012EÆ\rù\u000e¡vQï\u0002\u0004El\b\u0088Ó\\B\u001bH\u0099Üÿó\f\u0091/1\u0094)\u007f\u0089\t\b,t^S@¹\u0098\u0091\u009bI\u009fg}\u000bØn\u0095\u0018ÿ\u008fná\u0004C·ÿì\u009e\u009eÁ)x¾²C\f#ú3\u0007o×\u0084#Ñ¥háJôôt÷ob\"S\u0017\tÉ\u008dOÎï\u0086B: B4d:ÀÌ\u0017r\u0019ô\u008cV´Å@\u001b§«\u0090µ\u001ba\u0006W\u000f\u008eØßU1\f½\u0094<\u0091?D,-^\u00adÚÏy\u0096Z>\u008bT¸E àp\b\u0006Ó\u0097æK²¬Sâ\u0081\u009eÆ\fZ\u0084\u0084\u009d´ò+ù}\fçé\t\u008dÍ:qb!\u009a\u0087ü";
      int var4 = "j\"\u0081,ÃjÖN«Æ\u0098tõ¼ªÍ¯\u0084Cá\t\u001b3\u0099&¨y\u00811/\u00978yÔìu<úx¤½Ed\u001c\u001eÉ,É\u0087÷¦\u0093qæ¥ËJß/ü½Ì\u008düÊ\u000e<'Hó-q\u001c:Vüâ6Ý.\u000e\u0003Õ¯\u00adÑº\u0083C¥Ó\u009cÓ\u0012\u0092NË\u008a\tQÎ\u0085Î¹qnè½¯Ñ,\u0089\u001a÷1_U\u0006ôº:~\u0098µ)Ã+\u0083¢qrNá\u009bT\u0011\u0015I¾y?G\u0018I\nìKá\u0018\u009dëL\u0097µ+t\u0084º]¥ü\u0017\u0019käª\u0097gï±{\nSà\f\bQÎ'ý¥\u0002\u0013XQCB\u0004\u0018Ip\u0006\u0011 líIë¬EñÕ\u0096Ë >\u00931\u0087ì\u0005<b\u001b\u0017t|þú;ëúã\tjºó\u0096KÓìw³;¢f¸¬xà±ÚDúûá`hÊ\u0084íA¤\u0095ÅÛØò\u0000áHTm¡¹?æ«\f\u0091gé\u0083ßÍfÓÈ\u0083°¸¬¸\u0004SàæF\u0091¹â0,èµ,Í\u008bò~\u0014g\u0092R@\fû(\u0081£Vs\u0091tj\u0082Z¦éÒ+ÜéÝE\b\u0091N;\fsæ\u0087\u001eãWCõÅgç\u0007\u0091£G\u001d\u0088?\u0012\u000e\u008e#\u001eeýq_æ >ñn¿%\u000b]Úg3\u001f\u0089M2ØIö\u0004ÁdK£\u0011´\u001coG»mOÉ\u0094\u0091ãÀ;\u008f\u0091\u0004ø\b\u007f¬ðYÍÂ§×\u0006¼z-ïÂ\u009a5ÂÏW;ú\u001e+ÎÖ\r\u009dÆÆ\u000b \u008b\u0089·ASNL5HÌ\u009ecµÒQ\u0007)\u0001»îzó\u009aªR±*\u0014u÷\u0089qZ\u0012EÆ\rù\u000e¡vQï\u0002\u0004El\b\u0088Ó\\B\u001bH\u0099Üÿó\f\u0091/1\u0094)\u007f\u0089\t\b,t^S@¹\u0098\u0091\u009bI\u009fg}\u000bØn\u0095\u0018ÿ\u008fná\u0004C·ÿì\u009e\u009eÁ)x¾²C\f#ú3\u0007o×\u0084#Ñ¥háJôôt÷ob\"S\u0017\tÉ\u008dOÎï\u0086B: B4d:ÀÌ\u0017r\u0019ô\u008cV´Å@\u001b§«\u0090µ\u001ba\u0006W\u000f\u008eØßU1\f½\u0094<\u0091?D,-^\u00adÚÏy\u0096Z>\u008bT¸E àp\b\u0006Ó\u0097æK²¬Sâ\u0081\u009eÆ\fZ\u0084\u0084\u009d´ò+ù}\fçé\t\u008dÍ:qb!\u009a\u0087ü"
         .length();
      char var1 = 'A';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 49;
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
                     case 0 -> 82;
                     case 1 -> 6;
                     case 2 -> 109;
                     case 3 -> 90;
                     case 4 -> 16;
                     case 5 -> 24;
                     default -> 63;
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
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl();
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

                  var2 = " _! \u007fÚ\t\u0017¶:M1õ£N\u0088";
                  var4 = " _! \u007fÚ\t\u0017¶:M1õ£N\u0088".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 105;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26085) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 192;
            case 1 -> 85;
            case 2 -> 153;
            case 3 -> 173;
            case 4 -> 58;
            case 5 -> 27;
            case 6 -> 216;
            case 7 -> 154;
            case 8 -> 2;
            case 9 -> 120;
            case 10 -> 66;
            case 11 -> 94;
            case 12 -> 64;
            case 13 -> 111;
            case 14 -> 107;
            case 15 -> 218;
            case 16 -> 129;
            case 17 -> 196;
            case 18 -> 44;
            case 19 -> 14;
            case 20 -> 1;
            case 21 -> 238;
            case 22 -> 65;
            case 23 -> 50;
            case 24 -> 116;
            case 25 -> 15;
            case 26 -> 81;
            case 27 -> 147;
            case 28 -> 164;
            case 29 -> 206;
            case 30 -> 108;
            case 31 -> 232;
            case 32 -> 45;
            case 33 -> 48;
            case 34 -> 46;
            case 35 -> 3;
            case 36 -> 224;
            case 37 -> 55;
            case 38 -> 252;
            case 39 -> 131;
            case 40 -> 11;
            case 41 -> 220;
            case 42 -> 251;
            case 43 -> 16;
            case 44 -> 204;
            case 45 -> 168;
            case 46 -> 247;
            case 47 -> 101;
            case 48 -> 100;
            case 49 -> 124;
            case 50 -> 87;
            case 51 -> 248;
            case 52 -> 184;
            case 53 -> 239;
            case 54 -> 213;
            case 55 -> 140;
            case 56 -> 254;
            case 57 -> 170;
            case 58 -> 103;
            case 59 -> 169;
            case 60 -> 40;
            case 61 -> 230;
            case 62 -> 135;
            case 63 -> 228;
            case 64 -> 150;
            case 65 -> 52;
            case 66 -> 110;
            case 67 -> 244;
            case 68 -> 148;
            case 69 -> 68;
            case 70 -> 229;
            case 71 -> 128;
            case 72 -> 8;
            case 73 -> 9;
            case 74 -> 74;
            case 75 -> 205;
            case 76 -> 185;
            case 77 -> 151;
            case 78 -> 12;
            case 79 -> 84;
            case 80 -> 208;
            case 81 -> 0;
            case 82 -> 160;
            case 83 -> 226;
            case 84 -> 145;
            case 85 -> 191;
            case 86 -> 165;
            case 87 -> 133;
            case 88 -> 155;
            case 89 -> 223;
            case 90 -> 49;
            case 91 -> 90;
            case 92 -> 18;
            case 93 -> 166;
            case 94 -> 236;
            case 95 -> 188;
            case 96 -> 10;
            case 97 -> 47;
            case 98 -> 177;
            case 99 -> 78;
            case 100 -> 176;
            case 101 -> 76;
            case 102 -> 22;
            case 103 -> 158;
            case 104 -> 144;
            case 105 -> 89;
            case 106 -> 80;
            case 107 -> 227;
            case 108 -> 72;
            case 109 -> 21;
            case 110 -> 56;
            case 111 -> 210;
            case 112 -> 25;
            case 113 -> 167;
            case 114 -> 28;
            case 115 -> 162;
            case 116 -> 225;
            case 117 -> 30;
            case 118 -> 209;
            case 119 -> 214;
            case 120 -> 242;
            case 121 -> 106;
            case 122 -> 240;
            case 123 -> 178;
            case 124 -> 231;
            case 125 -> 29;
            case 126 -> 175;
            case 127 -> 38;
            case 128 -> 61;
            case 129 -> 187;
            case 130 -> 70;
            case 131 -> 200;
            case 132 -> 241;
            case 133 -> 31;
            case 134 -> 143;
            case 135 -> 93;
            case 136 -> 98;
            case 137 -> 122;
            case 138 -> 114;
            case 139 -> 20;
            case 140 -> 35;
            case 141 -> 174;
            case 142 -> 123;
            case 143 -> 199;
            case 144 -> 215;
            case 145 -> 99;
            case 146 -> 43;
            case 147 -> 33;
            case 148 -> 97;
            case 149 -> 139;
            case 150 -> 102;
            case 151 -> 23;
            case 152 -> 75;
            case 153 -> 172;
            case 154 -> 112;
            case 155 -> 250;
            case 156 -> 193;
            case 157 -> 121;
            case 158 -> 212;
            case 159 -> 179;
            case 160 -> 7;
            case 161 -> 137;
            case 162 -> 73;
            case 163 -> 118;
            case 164 -> 136;
            case 165 -> 201;
            case 166 -> 26;
            case 167 -> 59;
            case 168 -> 132;
            case 169 -> 203;
            case 170 -> 161;
            case 171 -> 104;
            case 172 -> 130;
            case 173 -> 63;
            case 174 -> 243;
            case 175 -> 119;
            case 176 -> 105;
            case 177 -> 180;
            case 178 -> 171;
            case 179 -> 253;
            case 180 -> 62;
            case 181 -> 42;
            case 182 -> 189;
            case 183 -> 149;
            case 184 -> 41;
            case 185 -> 113;
            case 186 -> 207;
            case 187 -> 37;
            case 188 -> 53;
            case 189 -> 125;
            case 190 -> 194;
            case 191 -> 92;
            case 192 -> 190;
            case 193 -> 249;
            case 194 -> 36;
            case 195 -> 195;
            case 196 -> 39;
            case 197 -> 217;
            case 198 -> 156;
            case 199 -> 159;
            case 200 -> 71;
            case 201 -> 115;
            case 202 -> 79;
            case 203 -> 235;
            case 204 -> 255;
            case 205 -> 219;
            case 206 -> 163;
            case 207 -> 5;
            case 208 -> 157;
            case 209 -> 221;
            case 210 -> 222;
            case 211 -> 109;
            case 212 -> 138;
            case 213 -> 202;
            case 214 -> 88;
            case 215 -> 4;
            case 216 -> 134;
            case 217 -> 34;
            case 218 -> 142;
            case 219 -> 117;
            case 220 -> 127;
            case 221 -> 86;
            case 222 -> 67;
            case 223 -> 19;
            case 224 -> 141;
            case 225 -> 246;
            case 226 -> 13;
            case 227 -> 197;
            case 228 -> 198;
            case 229 -> 95;
            case 230 -> 6;
            case 231 -> 24;
            case 232 -> 245;
            case 233 -> 234;
            case 234 -> 51;
            case 235 -> 211;
            case 236 -> 32;
            case 237 -> 17;
            case 238 -> 69;
            case 239 -> 152;
            case 240 -> 96;
            case 241 -> 181;
            case 242 -> 182;
            case 243 -> 186;
            case 244 -> 54;
            case 245 -> 233;
            case 246 -> 237;
            case 247 -> 82;
            case 248 -> 60;
            case 249 -> 83;
            case 250 -> 77;
            case 251 -> 57;
            case 252 -> 126;
            case 253 -> 183;
            case 254 -> 91;
            default -> 146;
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

   private static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      public static lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] a() {
         return (lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         String var0
      ) {
         return Enum.valueOf(
            lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] c() { return new me.octo.client.lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl }; }
}

   private static enum IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

      public static lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] a() {
         return (lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clone();
      }

      public static lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         String var0
      ) {
         return Enum.valueOf(
            lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> b() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI};
      private static final EnumEntries<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] c() { return new me.octo.client.lllIIlIllIlIlIllllllIIIIIIlllIllllIllIIlIlIllIIlIllIIIllIlIIIIllllIllIllIIllllllIlIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI }; }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
