package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   public static me.octo.client.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX missing field (typed to WhenMappings)

   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private List<me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private List<me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private List<? extends BlockPos> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private ArrayList<Vec3> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   public IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -32309;
      short var10004 = -19757;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
   }

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -32318;
      short var10002 = 21098;
      var10002 = -32316;
      short var10003 = -3848;
      var10000 = var10000.a("pathfind", "Pathfinding debug and visualization")
         .a(
            IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a("x")
               .a(
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
               .b()
         )
         .a(
            IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a("y")
               .a(
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
               .b()
         )
         .a(
            IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a("z")
               .a(
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
               .b()
         );
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = -32317;
      var10003 = 6325;
      return var10000.a(
            var2.a("option")
               .a(
                  IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
               .b()
         )
         .a((kotlin.jvm.functions.Function1)null)
         .a();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      short var10002 = -32312;
      short var10003 = 16161;
      Intrinsics.checkNotNullParameter(var1, "event");
      String[] var2 = var10000;
      if (var2 != null) {
         LevelRenderContext var56 = var1.k();
         if (var56 != null) {
            LevelRenderContext var3 = var56;
            if (var2 != null && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level != null) {
               ClientLevel var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
               List var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var5 != null) {
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
                  Iterable var7 = var5;
                  int var8 = 0;

                  for (Object var10 : var7) {
                     me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var11 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10;
                     boolean var12 = false;
                     BlockPos var13 = var11.a();
                     AABB var14 = me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var4, var13);
                     me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        var3,
                        var14,
                        var6,
                        1.0,
                        true);
                     me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(
                        var14, var6.a(0.3F), false);
                     if (var2 == null || var2 == null) {
                        break;
                     }
                  }

                  int var20 = 0;
                  var8 = CollectionsKt.getLastIndex(var5);

                  while (var20 < var8) {
                     Vec3[] var27 = new Vec3[]{
                        ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var5.get(
                              var20
                           ))
                           .b(),
                        ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var5.get(
                              var20 + 1
                           ))
                           .b()
                     };
                     me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(var27, var6, 1.0F);
                     var20++;
                     if (var2 == null) {
                        break;
                     }
                  }
               }

               ArrayList var19 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               var10000 = ((String[])(Object)(var19));
               if (var2 != null) {
                  if (var19 != null) {
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var21 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
                     int var24 = 0;
                     int var28 = CollectionsKt.getLastIndex(var19);

                     while (var24 < var28) {
                        Vec3[] var32 = new Vec3[]{(Vec3)var19.get(var24), (Vec3)var19.get(var24 + 1)};
                        me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(var32, var21, 1.0F);
                        var24++;
                        if (var2 == null) {
                           break;
                        }
                     }
                  }

                  var10000 = ((String[])(Object)(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII));
               }

               Object var22 = var10000;
               var10000 = (String[])var22;
               if (var2 != null) {
                  if (var22 != null) {
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var25 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
                     Iterable var29 = (Iterable)var22;
                     boolean var33 = false;

                     for (Object var41 : var29) {
                        BlockPos var45 = (BlockPos)var41;
                        boolean var49 = false;
                        AABB var15 = me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var4, var45);
                        me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                           var3,
                           var15,
                           var25,
                           1.0,
                           true);
                        me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(
                           var15, var25.a(0.8F), 0.0F, false);
                        if (var2 == null || var2 == null) {
                           break;
                        }
                     }
                  }

                  var10000 = ((String[])(Object)(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI));
               }

               Object var26 = var10000;
               if (var2 != null && var26 != null) {
                  Iterable var30 = (Iterable)var26;
                  boolean var34 = false;

                  for (Object var42 : var30) {
                     me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var46 = (me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var42;
                     boolean var50 = false;
                     if (var2 == null) {
                        break;
                     }
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var52 = switch (((int[])IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var46.c()
                        .ordinal()]) {
                        case 1 -> me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                        case 2 -> me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
                        default -> me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
                     };
                     BlockPos var16 = var46.a();
                     AABB var17 = me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var4, var16);
                     me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                        var3,
                        var17,
                        var52,
                        1.0,
                        true);
                     me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(
                        var17, var52.a(0.3F), false);
                     if (var2 == null) {
                        break;
                     }
                  }
               }

               List var31 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               var10000 = ((String[])(Object)(var31));
               if (var2 != null) {
                  if (var31 == null) {
                     return;
                  }

                  var10000 = ((String[])(Object)(var31));
               }

               Object var35 = var10000;
               int var39 = 0;

               for (Object var47 : (Iterable<?>)(var35)) {
                  me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var51 = (me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var47;
                  boolean var53 = false;
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var54 = a(var51.c());
                  BlockPos var55 = var51.a();
                  AABB var18 = me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var4, var55);
                  me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                     var3,
                     var18,
                     var54.a(1.0F),
                     1.0,
                     true);
                  me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(var18, var54.a(0.3F), true);
                  if (var2 == null || var2 == null) {
                     break;
                  }
               }

               int var36 = 0;
               var39 = CollectionsKt.getLastIndex(var31);

               while (var36 < var39) {
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var44 = a(
                     ((me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var31.get(
                           var36 + 1
                        ))
                        .c()
                  );
                  Vec3[] var48 = new Vec3[]{
                     ((me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var31.get(
                           var36
                        ))
                        .b(),
                     ((me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var31.get(
                           var36 + 1
                        ))
                        .b()
                  };
                  me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.a(var48, var44.a(1.0F), 1.0F);
                  var36++;
                  if (var2 == null) {
                     break;
                  }
               }

               return;
            }

            return;
         }
      }
   }

   private static final Unit a(
      IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      Object var69 = null; // PX-FIX
      Object var65 = null; // PX-FIX
      Object var61 = null; // PX-FIX
      BlockPos var28 = null; // PX-FIX
      short var10001 = -32306;
      short var10002 = 17350;
      Intrinsics.checkNotNullParameter(var1, "context");
      String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var4 = var1;
      String var5 = "x";
      boolean var6 = false;
      Iterable var7 = var1.a().b();
      boolean var8 = false;
      int var9 = 0;
      String[] var2 = var10000;

      label273: {
         for (Object var11 : var7) {
            int var12 = var9++;
            if (var2 != null) {
               int var60 = var12;
               if (var2 != null) {
                  if (var12 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var60 = var12;
               }

               IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var13 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var11;
               int var14 = var60;
               boolean var15 = false;
               if (var2 != null && Intrinsics.areEqual(var13.a(), var5) && var14 < var4.b().length) {
                  var10000 = (String[])var4.b()[var14];
                  if (!((Object)var10000 instanceof Integer)) {
                     var10000 = null;
                  }

                  var61 = (Integer)(Object)var10000;
                  break label273;
               }

               if (var2 != null) {
                  continue;
               }
            }
            break;
         }

         var61 = null;
      }

      Integer var3 =((Integer)( var61));
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var20 = var1;
      String var22 = "y";
      boolean var25 = false;
      Iterable var29 = var1.a().b();
      boolean var33 = false;
      int var36 = 0;

      label256: {
         for (Object var43 : var29) {
            int var47 = var36++;
            if (var2 != null) {
               int var64 = var47;
               if (var2 != null) {
                  if (var47 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var64 = var47;
               }

               IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var50 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var43;
               int var53 = var64;
               boolean var16 = false;
               if (var2 != null && Intrinsics.areEqual(var50.a(), var22) && var53 < var20.b().length) {
                  var10000 = (String[])var20.b()[var53];
                  if (!((Object)var10000 instanceof Integer)) {
                     var10000 = null;
                  }

                  var65 = (Integer)(Object)var10000;
                  break label256;
               }

               if (var2 != null) {
                  continue;
               }
            }
            break;
         }

         var65 = null;
      }

      Integer var19 =((Integer)( var65));
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var23 = var1;
      String var26 = "z";
      var8 = false;
      Iterable var34 = var1.a().b();
      boolean var37 = false;
      int var40 = 0;

      label239: {
         for (Object var48 : var34) {
            int var51 = var40++;
            if (var2 != null) {
               int var68 = var51;
               if (var2 != null) {
                  if (var51 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var68 = var51;
               }

               IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var54 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var48;
               int var56 = var68;
               boolean var17 = false;
               if (var2 != null && Intrinsics.areEqual(var54.a(), var26) && var56 < var23.b().length) {
                  var10000 = (String[])var23.b()[var56];
                  if (!((Object)var10000 instanceof Integer)) {
                     var10000 = null;
                  }

                  var69 = (Integer)(Object)var10000;
                  break label239;
               }

               if (var2 != null) {
                  continue;
               }
            }
            break;
         }

         var69 = null;
      }

      Integer var21 =((Integer)( var69));
      short var71 = -32305;
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var27 = var1;
      var10001 = -6353;
      String var31 = "option";
      var33 = false;
      Iterable var38 = var1.a().b();
      boolean var41 = false;
      int var45 = 0;

      label222: {
         for (Object var52 : var38) {
            int var55 = var45++;
            if (var2 != null) {
               int var73 = var55;
               if (var2 != null) {
                  if (var55 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var73 = var55;
               }

               IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var57 = (IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var52;
               int var58 = var73;
               boolean var18 = false;
               if (var2 != null && Intrinsics.areEqual(var57.a(), var31) && var58 < var27.b().length) {
                  var10000 = (String[])var27.b()[var58];
                  if (!((Object)var10000 instanceof String)) {
                     var10000 = null;
                  }

                  var10000 = (String[])(Object)(String)(Object)var10000;
                  break label222;
               }

               if (var2 != null) {
                  continue;
               }
            }
            break;
         }

         var10000 = null;
      }

      String var24 = String.valueOf(var10000);
      Integer var76 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return Unit.INSTANCE;
         }

         var76 = var19;
      }

      if (var2 != null) {
         if (var76 == null) {
            return Unit.INSTANCE;
         }

         var76 = var21;
      }

      if (var76 != null) {
         label194: {
            var28 = new BlockPos(var3, var19, var21);
            if (var2 != null && var24 != null) {
               var10000 = ((String[])(Object)(var24.toLowerCase(Locale.ROOT)));
               var10002 = -32307;
               short var10003 = 27979;
               Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
               if (var2 != null) {
                  break label194;
               }
            }

            var10000 = null;
         }

         String var32 = String.valueOf(var10000);
         String var78 = var32;
         if (var2 != null) {
            if (var32 == null) {
               return Unit.INSTANCE;
            }

            var78 = var32;
         }

         label292: {
            label293: {
               label294: {
                  label295: {
                     label174: {
                        label283: {
                           int var79 = var78.hashCode();
                           if (var2 != null) {
                              switch (var79) {
                                 case -1052618729:
                                    var10001 = -32315;
                                    var10002 = -7060;
                                    if (!var32.equals("native")) {
                                       return Unit.INSTANCE;
                                    }
                                    break label294;
                                 case -1050168434:
                                    var10001 = -32311;
                                    var10002 = -8782;
                                    if (!var32.equals("etherwarp")) {
                                       return Unit.INSTANCE;
                                    }
                                    break label295;
                                 case 3433509:
                                    var10001 = -32314;
                                    var10002 = 19023;
                                    var79 = ((var32.equals("path")) ? 1 : 0);
                                    break;
                                 case 95458899:
                                    var10001 = -32320;
                                    var10002 = -3089;
                                    if (!var32.equals("debug")) {
                                       return Unit.INSTANCE;
                                    }
                                    break label292;
                                 case 107947501:
                                    var10001 = -32313;
                                    var10002 = 22965;
                                    if (!var32.equals("quick")) {
                                       return Unit.INSTANCE;
                                    }
                                    break label283;
                                 case 747804969:
                                    var10001 = -32319;
                                    var10002 = 18223;
                                    if (!var32.equals("position")) {
                                       return Unit.INSTANCE;
                                    }
                                    break label174;
                                 case 1299205405:
                                    var10001 = -32308;
                                    var10002 = 5199;
                                    if (!var32.equals("native-debug")) {
                                       return Unit.INSTANCE;
                                    }
                                    break label293;
                                 default:
                                    return Unit.INSTANCE;
                              }
                           }

                           if (var79 == 0) {
                              return Unit.INSTANCE;
                           }

                           var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var28, true);
                           if (var2 != null) {
                              return Unit.INSTANCE;
                           }
                        }

                        var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .b(var28, true);
                        if (var2 != null) {
                           return Unit.INSTANCE;
                        }
                     }

                     var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var28, BlockPos.ZERO);
                     if (var2 != null) {
                        return Unit.INSTANCE;
                     }
                  }

                  var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .b(var28);
                  if (var2 != null) {
                     return Unit.INSTANCE;
                  }
               }

               var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var28);
               if (var2 != null) {
                  return Unit.INSTANCE;
               }
            }

            var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var28, false);
            if (var2 != null) {
               return Unit.INSTANCE;
            }
         }

         var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var28, true);
         if (var2 != null && var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
            List var42 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            boolean var46 = false;
            var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
         }
      }

      return Unit.INSTANCE;
   }

   private static final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0
   ) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      return switch ((Integer)(((int[])IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var0.ordinal()])) {
         case 1 -> me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         case 2 -> me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         default -> me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      };
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "Wß¨\u0095\u007f\u0092#\u0005#\u001b\u000b\u0019l\u0014!´7ÿ\u0083\u0011Â$\u0018X²\u0007\u001d:¬%M%~Ù\u008b\u0093\u0016ÂÉ\u009a\u00ad\u008a\u0005\u0004{#\u009d\u00ad\u0004#(ûj\b`H\u0094¨\u001d9Å\u0081\u0005bxSùÅ\u0006\u00930\u0011[Q@\bcuóÁ\u00045·\n\u0010#\u0001G\u0087¼\u0016\u008fÄPUhyëß4Å\f\u0080ÕRÔ ºbv]Ñ]\u0095\u0006Bº+\n\u0016j\u0007\u0092\u0006¦|ô\fÐ\t \u00130·÷IPNË";
      int var4 = "Wß¨\u0095\u007f\u0092#\u0005#\u001b\u000b\u0019l\u0014!´7ÿ\u0083\u0011Â$\u0018X²\u0007\u001d:¬%M%~Ù\u008b\u0093\u0016ÂÉ\u009a\u00ad\u008a\u0005\u0004{#\u009d\u00ad\u0004#(ûj\b`H\u0094¨\u001d9Å\u0081\u0005bxSùÅ\u0006\u00930\u0011[Q@\bcuóÁ\u00045·\n\u0010#\u0001G\u0087¼\u0016\u008fÄPUhyëß4Å\f\u0080ÕRÔ ºbv]Ñ]\u0095\u0006Bº+\n\u0016j\u0007\u0092\u0006¦|ô\fÐ\t \u00130·÷IPNË"
         .length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 85;
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
                     case 0 -> 89;
                     case 1 -> 70;
                     case 2 -> 65;
                     case 3 -> 125;
                     case 4 -> 49;
                     case 5 -> 81;
                     default -> 42;
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
                     b = new String[15];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "xR²R\u0089\u0010;A\u0089fÇZX?çØô^ü¿RM";
                  var4 = "xR²R\u0089\u0010;A\u0089fÇZX?çØô^ü¿RM".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 81;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -32315) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 68;
            case 1 -> 198;
            case 2 -> 185;
            case 3 -> 10;
            case 4 -> 186;
            case 5 -> 141;
            case 6 -> 234;
            case 7 -> 128;
            case 8 -> 60;
            case 9 -> 159;
            case 10 -> 103;
            case 11 -> 196;
            case 12 -> 45;
            case 13 -> 81;
            case 14 -> 102;
            case 15 -> 44;
            case 16 -> 146;
            case 17 -> 72;
            case 18 -> 130;
            case 19 -> 89;
            case 20 -> 29;
            case 21 -> 20;
            case 22 -> 216;
            case 23 -> 79;
            case 24 -> 151;
            case 25 -> 11;
            case 26 -> 194;
            case 27 -> 85;
            case 28 -> 47;
            case 29 -> 52;
            case 30 -> 104;
            case 31 -> 43;
            case 32 -> 153;
            case 33 -> 143;
            case 34 -> 112;
            case 35 -> 3;
            case 36 -> 83;
            case 37 -> 62;
            case 38 -> 136;
            case 39 -> 226;
            case 40 -> 147;
            case 41 -> 178;
            case 42 -> 208;
            case 43 -> 91;
            case 44 -> 105;
            case 45 -> 249;
            case 46 -> 38;
            case 47 -> 240;
            case 48 -> 238;
            case 49 -> 98;
            case 50 -> 96;
            case 51 -> 127;
            case 52 -> 228;
            case 53 -> 223;
            case 54 -> 163;
            case 55 -> 203;
            case 56 -> 64;
            case 57 -> 4;
            case 58 -> 184;
            case 59 -> 46;
            case 60 -> 205;
            case 61 -> 129;
            case 62 -> 204;
            case 63 -> 142;
            case 64 -> 131;
            case 65 -> 212;
            case 66 -> 195;
            case 67 -> 110;
            case 68 -> 30;
            case 69 -> 231;
            case 70 -> 190;
            case 71 -> 126;
            case 72 -> 87;
            case 73 -> 181;
            case 74 -> 76;
            case 75 -> 7;
            case 76 -> 214;
            case 77 -> 99;
            case 78 -> 14;
            case 79 -> 175;
            case 80 -> 107;
            case 81 -> 121;
            case 82 -> 119;
            case 83 -> 171;
            case 84 -> 152;
            case 85 -> 193;
            case 86 -> 93;
            case 87 -> 54;
            case 88 -> 22;
            case 89 -> 1;
            case 90 -> 237;
            case 91 -> 55;
            case 92 -> 124;
            case 93 -> 172;
            case 94 -> 56;
            case 95 -> 202;
            case 96 -> 16;
            case 97 -> 40;
            case 98 -> 101;
            case 99 -> 247;
            case 100 -> 180;
            case 101 -> 160;
            case 102 -> 82;
            case 103 -> 242;
            case 104 -> 34;
            case 105 -> 167;
            case 106 -> 177;
            case 107 -> 232;
            case 108 -> 19;
            case 109 -> 170;
            case 110 -> 229;
            case 111 -> 75;
            case 112 -> 12;
            case 113 -> 188;
            case 114 -> 253;
            case 115 -> 192;
            case 116 -> 31;
            case 117 -> 108;
            case 118 -> 58;
            case 119 -> 39;
            case 120 -> 251;
            case 121 -> 137;
            case 122 -> 162;
            case 123 -> 254;
            case 124 -> 206;
            case 125 -> 21;
            case 126 -> 80;
            case 127 -> 115;
            case 128 -> 90;
            case 129 -> 149;
            case 130 -> 86;
            case 131 -> 59;
            case 132 -> 6;
            case 133 -> 49;
            case 134 -> 209;
            case 135 -> 78;
            case 136 -> 139;
            case 137 -> 5;
            case 138 -> 77;
            case 139 -> 250;
            case 140 -> 109;
            case 141 -> 63;
            case 142 -> 134;
            case 143 -> 156;
            case 144 -> 230;
            case 145 -> 88;
            case 146 -> 219;
            case 147 -> 111;
            case 148 -> 220;
            case 149 -> 122;
            case 150 -> 25;
            case 151 -> 224;
            case 152 -> 51;
            case 153 -> 227;
            case 154 -> 239;
            case 155 -> 252;
            case 156 -> 26;
            case 157 -> 35;
            case 158 -> 201;
            case 159 -> 197;
            case 160 -> 106;
            case 161 -> 133;
            case 162 -> 165;
            case 163 -> 18;
            case 164 -> 15;
            case 165 -> 100;
            case 166 -> 113;
            case 167 -> 13;
            case 168 -> 67;
            case 169 -> 225;
            case 170 -> 221;
            case 171 -> 84;
            case 172 -> 215;
            case 173 -> 17;
            case 174 -> 213;
            case 175 -> 135;
            case 176 -> 37;
            case 177 -> 9;
            case 178 -> 97;
            case 179 -> 148;
            case 180 -> 174;
            case 181 -> 158;
            case 182 -> 65;
            case 183 -> 95;
            case 184 -> 243;
            case 185 -> 154;
            case 186 -> 53;
            case 187 -> 94;
            case 188 -> 117;
            case 189 -> 222;
            case 190 -> 236;
            case 191 -> 182;
            case 192 -> 248;
            case 193 -> 245;
            case 194 -> 155;
            case 195 -> 114;
            case 196 -> 116;
            case 197 -> 73;
            case 198 -> 28;
            case 199 -> 218;
            case 200 -> 27;
            case 201 -> 41;
            case 202 -> 166;
            case 203 -> 36;
            case 204 -> 199;
            case 205 -> 32;
            case 206 -> 241;
            case 207 -> 207;
            case 208 -> 61;
            case 209 -> 23;
            case 210 -> 24;
            case 211 -> 157;
            case 212 -> 244;
            case 213 -> 140;
            case 214 -> 69;
            case 215 -> 179;
            case 216 -> 164;
            case 217 -> 200;
            case 218 -> 189;
            case 219 -> 144;
            case 220 -> 233;
            case 221 -> 235;
            case 222 -> 8;
            case 223 -> 0;
            case 224 -> 191;
            case 225 -> 145;
            case 226 -> 217;
            case 227 -> 132;
            case 228 -> 161;
            case 229 -> 42;
            case 230 -> 211;
            case 231 -> 125;
            case 232 -> 183;
            case 233 -> 120;
            case 234 -> 173;
            case 235 -> 176;
            case 236 -> 168;
            case 237 -> 92;
            case 238 -> 48;
            case 239 -> 70;
            case 240 -> 255;
            case 241 -> 123;
            case 242 -> 50;
            case 243 -> 74;
            case 244 -> 187;
            case 245 -> 150;
            case 246 -> 2;
            case 247 -> 118;
            case 248 -> 33;
            case 249 -> 66;
            case 250 -> 210;
            case 251 -> 138;
            case 252 -> 169;
            case 253 -> 246;
            case 254 -> 71;
            default -> 57;
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
