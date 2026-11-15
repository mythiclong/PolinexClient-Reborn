package me.octo.client;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIlIIlIIlIlIIIIlIllIIIllllIIIIlIlIlIIlIllIIIllIlIIIIlIIlllIlIIIIllllllIIlllIlIlllIIll {
    public static <T> T b(Object p0) { return null; } // PX-FIX mr3
    public static <T> T a(Object p0) { return null; } // PX-FIX mr3
   @NotNull
   public static IIlIIlIIlIlIIIIlIllIIIllllIIIIlIlIlIIlIllIIIllIlIIIIlIIlllIlIIIIllllllIIlllIlIlllIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String[] a;
   private static String[] b;

   private IIlIIlIIlIlIIIIlIllIIIllllIIIIlIlIlIIlIllIIIllIlIIIIlIIlllIlIIIIllllllIIlllIlIlllIIll() {
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI a() {
      List var10002 = CollectionsKt.listOf(Zombie.class);
      short var10003 = 25105;
      short var10004 = 2520;
      List var1 = CollectionsKt.listOf("Zombie");
      List var2 = CollectionsKt.listOf(new AABB(-160.0, 38.0, -149.0, -42.0, 61.0, -72.0));
      List var10005 = CollectionsKt.emptyList();
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 25110;
      short var10009 = 1073;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002,
         var1,
         var2,
         var10005,
         var10006,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         CollectionsKt.emptyList(),
         null,
         null,
         null,
         1792,
         null
      );
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI b() {
      List var10002 = CollectionsKt.listOf(Wolf.class);
      short var10003 = 25113;
      short var10004 = 19303;
      List var2 = CollectionsKt.listOf("Wolf");
      List var3 = CollectionsKt.listOf(new AABB(-296.0, 86.0, 36.0, -196.0, 120.0, 111.0));
      AABB[] var1 = new AABB[]{
         new AABB(-268.0, 98.0, 57.0, -262.0, 119.0, 86.0),
         me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(new BlockPos(-259, 93, 79), new BlockPos(-261, 95, 82))
      };
      List var10005 = CollectionsKt.listOf(var1);
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 25110;
      short var10009 = 1073;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002,
         var2,
         var3,
         var10005,
         var10006,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         CollectionsKt.listOf(
            new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
               new BlockPos(-217, 90, 57),
               IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )
         ),
         null,
         null,
         null,
         1792,
         null
      );
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI c() {
      List var10002 = CollectionsKt.listOf(Wolf.class);
      short var10003 = 25111;
      short var10004 = -3439;
      List var2 = CollectionsKt.listOf("Wolf");
      List var3 = CollectionsKt.listOf(new AABB(-296.0, 86.0, 36.0, -196.0, 140.0, 111.0));
      AABB[] var1 = new AABB[]{
         new AABB(-268.0, 98.0, 57.0, -262.0, 119.0, 86.0),
         me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(new BlockPos(-259, 93, 79), new BlockPos(-261, 95, 82))
      };
      List var10005 = CollectionsKt.listOf(var1);
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 25110;
      short var10009 = 1073;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002,
         var2,
         var3,
         var10005,
         var10006,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         CollectionsKt.emptyList(),
         null,
         null,
         null,
         1792,
         null
      );
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI d() {
      List var10002 = CollectionsKt.listOf(RemotePlayer.class);
      String[] var1 = new String[2];
      short var10005 = 25114;
      short var10006 = 23682;
      var1[0] = "Goblin";
      var10005 = 25115;
      var10006 = 25007;
      var1[1] = "Weakling";
      List var10003 = CollectionsKt.listOf(var1);
      List var10004 = CollectionsKt.listOf(new AABB(-171.0, 133.0, 92.0, -55.0, 166.0, 186.0));
      List var4 = CollectionsKt.listOf(new AABB(-165.0, 138.0, 158.0, -150.0, 148.0, 200.0));
      Vec3 var6 = new Vec3(-138.0, 145.0, 138.0);
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10008 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var2 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(11, 144, -22),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(38, 135, 18),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(12, 127, 54),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(6, 127, 129),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-72, 137, 152),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )
      };
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002,
         var10003,
         var10004,
         var4,
         var6,
         var10007,
         var10008,
         CollectionsKt.listOf(var2),
         CollectionsKt.emptyList(),
         CollectionsKt.emptyList(),
         null,
         1024,
         null
      );
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI e() {
      List var10002 = CollectionsKt.listOf(RemotePlayer.class);
      String[] var1 = new String[2];
      short var10005 = 25112;
      short var10006 = 18596;
      var1[0] = "Glacite Walker";
      var10005 = 25104;
      var10006 = -2614;
      var1[1] = "Ice Walker";
      List var10003 = CollectionsKt.listOf(var1);
      List var10004 = CollectionsKt.listOf(new AABB(-36.0, 126.0, 129.0, 82.0, 152.0, 192.0));
      List var4 = CollectionsKt.emptyList();
      Vec3 var6 = Vec3.ZERO;
      short var10008 = 25110;
      short var10009 = 1073;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var2 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(11, 144, -22),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(38, 135, 18),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(12, 127, 54),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(6, 127, 129),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(6, 127, 151),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )
      };
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002, var10003, var10004, var4, var6, var10007, var7, CollectionsKt.listOf(var2), null, null, null, 1792, null
      );
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI f() {
      List var10002 = CollectionsKt.listOf(RemotePlayer.class);
      short var10003 = 25117;
      short var10004 = -24796;
      List var2 = CollectionsKt.listOf("Treasuer Hunter");
      List var3 = CollectionsKt.listOf(new AABB(-171.0, 190.0, -96.0, -90.0, 207.0, -24.0));
      List var10005 = CollectionsKt.emptyList();
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 25110;
      short var10009 = 1073;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var1 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-12, 144, -25),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-65, 138, 10),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-87, 144, 2),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-85, 152, -8),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-99, 175, -27),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-99, 190, -38),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-117, 204, -53),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )
      };
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002, var2, var3, var10005, var10006, var10007, var4, CollectionsKt.listOf(var1), null, null, null, 1792, null
      );
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI g() {
      List var10002 = CollectionsKt.listOf(EnderMan.class);
      short var10003 = 25116;
      short var10004 = -16363;
      List var1 = CollectionsKt.listOf("Enderman");
      List var2 = CollectionsKt.listOf(new AABB(-619.0, 6.0, -372.0, -527.0, 53.0, -287.0));
      List var10005 = CollectionsKt.listOf(new AABB(-571.0, 4.0, -329.0, -518.0, 20.0, -288.0));
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 25110;
      short var10009 = 1073;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002,
         var1,
         var2,
         var10005,
         var10006,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
         CollectionsKt.emptyList(),
         null,
         null,
         null,
         1792,
         null
      );
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI h() {
      String[] var1 = IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI.w();
      List var10002 = CollectionsKt.listOf(EnderMan.class);
      short var10003 = 25116;
      short var10004 = -16363;
      List var4 = CollectionsKt.listOf("Enderman");
      List var5 = CollectionsKt.listOf(new AABB(-737.0, 4.0, -339.0, -618.0, 15.0, -213.0));
      List var10005 = CollectionsKt.emptyList();
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 25110;
      short var10009 = 1073;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var2 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-539, 101, -271),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-557, 67, -273),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-549, 37, -259),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-566, 16, -274),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-623, 7, -294),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )
      };
      List var7 = CollectionsKt.listOf(var2);
      List var10010 = CollectionsKt.listOf((kotlin.jvm.functions.Function1)(IIlIIlIIlIlIIIIlIllIIIllllIIIIlIlIlIIlIllIIIllIlIIIIlIIlllIlIIIIllllllIIlllIlIlllIIll::a));
      AABB[] var3 = new AABB[]{
         new AABB(-625.0, 6.0, -249.0, -633.0, 6.0, -241.0),
         new AABB(-650.0, 4.0, -264.0, -641.0, 4.0, -273.0),
         new AABB(-700.0, 4.0, -266.0, -689.0, 4.0, -276.0),
         new AABB(-713.0, 4.0, -287.0, -717.0, 4.0, -292.0),
         new AABB(-711.0, 4.0, -249.0, -718.0, 4.0, -244.0),
         new AABB(-657.0, 4.0, -318.0, -651.0, 4.0, -324.0)
      };
      IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI var10000 = new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002, var4, var5, var10005, var10006, var10007, var6, var7, var10010, CollectionsKt.listOf(var3), null, 1024, null
      );
      if (var1 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
         );
      }

      return var10000;
   }

   @NotNull
   public final IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI i() {
      String[] var1 = IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI.w();
      List var10002 = CollectionsKt.listOf(EnderMan.class);
      short var10003 = 25107;
      short var10004 = -8020;
      List var4 = CollectionsKt.listOf("Enderman");
      AABB[] var2 = new AABB[]{
         new AABB(-584.0, 74.0, -188.0, -617.0, 84.0, -203.0),
         new AABB(-610.0, 67.0, -190.0, -555.0, 50.0, -247.0),
         new AABB(-562.0, 61.0, -225.0, -602.0, 80.0, -189.0),
         new AABB(-540.0, 55.0, -330.0, -508.0, 36.0, -214.0)
      };
      List var5 = CollectionsKt.listOf(var2);
      List var10005 = CollectionsKt.emptyList();
      Vec3 var10006 = Vec3.ZERO;
      short var10008 = 25106;
      short var10009 = -28898;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var3 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-539, 101, -271),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-557, 67, -273),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-549, 37, -259),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-566, 16, -274),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-614, 7, -290),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-616, 4, -283),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )
      };
      IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI var10000 = new IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI(
         var10002,
         var4,
         var5,
         var10005,
         var10006,
         var10007,
         var6,
         CollectionsKt.listOf(var3),
         CollectionsKt.listOf((kotlin.jvm.functions.Function1)(IIlIIlIIlIlIIIIlIllIIIllllIIIIlIlIlIIlIllIIIllIlIIIIlIIlllIlIIIIllllllIIlllIlIlllIIll::b)),
         null,
         null,
         1536,
         null
      );
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI.b(new String[5]);
      }

      return var10000;
   }

   private static final boolean a(Entity var0) {
      String[] var10000 = IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI.w();
      short var10002 = 25119;
      short var10003 = -25845;
      Intrinsics.checkNotNullParameter(var0, "entity");
      String[] var1 = var10000;
      Entity var3 = var0;
      if (var1 == null) {
         if (!(var0 instanceof EnderMan)) {
            return false;
         }

         var3 = var0;
      }

      BlockState var2 = ((EnderMan)var3).getCarriedBlock();
      BlockState var4 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return false;
         }

         var4 = var2;
      }

      boolean var5 = Intrinsics.areEqual(var4, Blocks.END_PORTAL_FRAME);
      return var1 != null ? var5 : var5;
   }

   private static final boolean b(Entity var0) {
      String[] var10000 = IIIIlIIllIlIlIlllllIlIIlIllIllllllIlIIllllIlIIIIIllIIlIlIlllIlIlIIIlllIlIlIllIIIllIlI.w();
      short var10002 = 25118;
      short var10003 = -19825;
      Intrinsics.checkNotNullParameter(var0, "entity");
      String[] var1 = var10000;
      Entity var3 = var0;
      if (var1 == null) {
         if (!(var0 instanceof EnderMan)) {
            return false;
         }

         var3 = var0;
      }

      BlockState var2 = ((EnderMan)var3).getCarriedBlock();
      BlockState var4 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return false;
         }

         var4 = var2;
      }

      boolean var5 = Intrinsics.areEqual(var4, Blocks.END_PORTAL_FRAME);
      return var1 != null ? var5 : var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "\u0087üm\u009ae\u009a\b\u001e'O\u00adG\u009ca×\u000eÂhÆds±I\u008b\u0085d\u008a%\u0093Ö\u0004a8\u00ad\b\u0006'´\t· \u008d\u0006°¶û÷~\u0085\bz\u0087\u0096ÝÇY£â\u000f\u0005ÑK\u008c\\ïõ3eB\u0016è+Ý\u008a\u0004\u0005ö³\u0097\b@ZÑf/.¾\f\n\u0000¸UÓ»y n¢é\u0006»Â[SMg";
      int var4 = "\u0087üm\u009ae\u009a\b\u001e'O\u00adG\u009ca×\u000eÂhÆds±I\u008b\u0085d\u008a%\u0093Ö\u0004a8\u00ad\b\u0006'´\t· \u008d\u0006°¶û÷~\u0085\bz\u0087\u0096ÝÇY£â\u000f\u0005ÑK\u008c\\ïõ3eB\u0016è+Ý\u008a\u0004\u0005ö³\u0097\b@ZÑf/.¾\f\n\u0000¸UÓ»y n¢é\u0006»Â[SMg"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 17;
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
                     case 0 -> 58;
                     case 1 -> 71;
                     case 2 -> 36;
                     case 3 -> 48;
                     case 4 -> 56;
                     case 5 -> 115;
                     default -> 50;
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
                     b = new String[14];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIIlIIlIlIIIIlIllIIIllllIIIIlIlIlIIlIllIIIllIlIIIIlIIlllIlIIIIllllllIIlllIlIlllIIll();
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

                  var2 = "\u008b\u009a\ru\u0004µWX\u008a";
                  var4 = "\u008b\u009a\ru\u0004µWX\u008a".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 59;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25114) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 85;
            case 1 -> 57;
            case 2 -> 95;
            case 3 -> 135;
            case 4 -> 105;
            case 5 -> 120;
            case 6 -> 196;
            case 7 -> 203;
            case 8 -> 131;
            case 9 -> 195;
            case 10 -> 219;
            case 11 -> 220;
            case 12 -> 38;
            case 13 -> 178;
            case 14 -> 188;
            case 15 -> 41;
            case 16 -> 28;
            case 17 -> 58;
            case 18 -> 141;
            case 19 -> 177;
            case 20 -> 101;
            case 21 -> 197;
            case 22 -> 237;
            case 23 -> 176;
            case 24 -> 192;
            case 25 -> 18;
            case 26 -> 36;
            case 27 -> 27;
            case 28 -> 98;
            case 29 -> 83;
            case 30 -> 4;
            case 31 -> 211;
            case 32 -> 130;
            case 33 -> 20;
            case 34 -> 175;
            case 35 -> 93;
            case 36 -> 61;
            case 37 -> 189;
            case 38 -> 12;
            case 39 -> 2;
            case 40 -> 54;
            case 41 -> 243;
            case 42 -> 92;
            case 43 -> 104;
            case 44 -> 180;
            case 45 -> 84;
            case 46 -> 170;
            case 47 -> 5;
            case 48 -> 29;
            case 49 -> 250;
            case 50 -> 210;
            case 51 -> 65;
            case 52 -> 43;
            case 53 -> 77;
            case 54 -> 8;
            case 55 -> 50;
            case 56 -> 232;
            case 57 -> 229;
            case 58 -> 22;
            case 59 -> 142;
            case 60 -> 222;
            case 61 -> 231;
            case 62 -> 144;
            case 63 -> 201;
            case 64 -> 228;
            case 65 -> 216;
            case 66 -> 179;
            case 67 -> 118;
            case 68 -> 7;
            case 69 -> 109;
            case 70 -> 163;
            case 71 -> 190;
            case 72 -> 132;
            case 73 -> 245;
            case 74 -> 74;
            case 75 -> 79;
            case 76 -> 198;
            case 77 -> 26;
            case 78 -> 240;
            case 79 -> 70;
            case 80 -> 99;
            case 81 -> 1;
            case 82 -> 30;
            case 83 -> 76;
            case 84 -> 212;
            case 85 -> 235;
            case 86 -> 183;
            case 87 -> 206;
            case 88 -> 80;
            case 89 -> 202;
            case 90 -> 249;
            case 91 -> 193;
            case 92 -> 62;
            case 93 -> 66;
            case 94 -> 113;
            case 95 -> 111;
            case 96 -> 39;
            case 97 -> 218;
            case 98 -> 48;
            case 99 -> 10;
            case 100 -> 145;
            case 101 -> 143;
            case 102 -> 254;
            case 103 -> 134;
            case 104 -> 233;
            case 105 -> 255;
            case 106 -> 71;
            case 107 -> 126;
            case 108 -> 181;
            case 109 -> 161;
            case 110 -> 51;
            case 111 -> 136;
            case 112 -> 91;
            case 113 -> 149;
            case 114 -> 158;
            case 115 -> 103;
            case 116 -> 89;
            case 117 -> 186;
            case 118 -> 117;
            case 119 -> 11;
            case 120 -> 200;
            case 121 -> 46;
            case 122 -> 213;
            case 123 -> 47;
            case 124 -> 173;
            case 125 -> 110;
            case 126 -> 49;
            case 127 -> 217;
            case 128 -> 185;
            case 129 -> 112;
            case 130 -> 205;
            case 131 -> 252;
            case 132 -> 227;
            case 133 -> 40;
            case 134 -> 122;
            case 135 -> 100;
            case 136 -> 35;
            case 137 -> 247;
            case 138 -> 97;
            case 139 -> 127;
            case 140 -> 63;
            case 141 -> 114;
            case 142 -> 154;
            case 143 -> 148;
            case 144 -> 14;
            case 145 -> 86;
            case 146 -> 169;
            case 147 -> 107;
            case 148 -> 133;
            case 149 -> 19;
            case 150 -> 209;
            case 151 -> 156;
            case 152 -> 96;
            case 153 -> 128;
            case 154 -> 64;
            case 155 -> 13;
            case 156 -> 129;
            case 157 -> 208;
            case 158 -> 87;
            case 159 -> 157;
            case 160 -> 184;
            case 161 -> 153;
            case 162 -> 55;
            case 163 -> 102;
            case 164 -> 147;
            case 165 -> 226;
            case 166 -> 138;
            case 167 -> 59;
            case 168 -> 159;
            case 169 -> 207;
            case 170 -> 9;
            case 171 -> 73;
            case 172 -> 151;
            case 173 -> 37;
            case 174 -> 223;
            case 175 -> 3;
            case 176 -> 164;
            case 177 -> 242;
            case 178 -> 182;
            case 179 -> 60;
            case 180 -> 174;
            case 181 -> 67;
            case 182 -> 23;
            case 183 -> 241;
            case 184 -> 52;
            case 185 -> 187;
            case 186 -> 24;
            case 187 -> 94;
            case 188 -> 121;
            case 189 -> 199;
            case 190 -> 215;
            case 191 -> 75;
            case 192 -> 139;
            case 193 -> 16;
            case 194 -> 56;
            case 195 -> 137;
            case 196 -> 162;
            case 197 -> 253;
            case 198 -> 225;
            case 199 -> 82;
            case 200 -> 204;
            case 201 -> 31;
            case 202 -> 106;
            case 203 -> 171;
            case 204 -> 68;
            case 205 -> 234;
            case 206 -> 167;
            case 207 -> 140;
            case 208 -> 42;
            case 209 -> 239;
            case 210 -> 221;
            case 211 -> 124;
            case 212 -> 115;
            case 213 -> 88;
            case 214 -> 155;
            case 215 -> 15;
            case 216 -> 248;
            case 217 -> 78;
            case 218 -> 119;
            case 219 -> 72;
            case 220 -> 152;
            case 221 -> 34;
            case 222 -> 44;
            case 223 -> 21;
            case 224 -> 33;
            case 225 -> 6;
            case 226 -> 0;
            case 227 -> 53;
            case 228 -> 81;
            case 229 -> 214;
            case 230 -> 172;
            case 231 -> 191;
            case 232 -> 125;
            case 233 -> 246;
            case 234 -> 116;
            case 235 -> 90;
            case 236 -> 236;
            case 237 -> 244;
            case 238 -> 160;
            case 239 -> 251;
            case 240 -> 146;
            case 241 -> 150;
            case 242 -> 168;
            case 243 -> 123;
            case 244 -> 25;
            case 245 -> 224;
            case 246 -> 45;
            case 247 -> 32;
            case 248 -> 108;
            case 249 -> 238;
            case 250 -> 69;
            case 251 -> 17;
            case 252 -> 194;
            case 253 -> 166;
            case 254 -> 165;
            default -> 230;
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
