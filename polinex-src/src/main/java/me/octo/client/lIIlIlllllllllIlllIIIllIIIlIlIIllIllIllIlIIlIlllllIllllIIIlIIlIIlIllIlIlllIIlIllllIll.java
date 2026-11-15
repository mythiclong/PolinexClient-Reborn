package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll
   extends IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll {
   public static me.octo.client.PXDyn var15 = null; // PX-FIX missing field v2
   
   private boolean IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = true;
   @NotNull
   private lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private ArrayList<BlockPos> lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = new ArrayList<>();
   private int lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   @NotNull
   private List<? extends Vec3> IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = CollectionsKt.emptyList();
   @NotNull
   private List<? extends BlockPos> lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = CollectionsKt.emptyList();
   @NotNull
   private Vec3 llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   @Nullable
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   @Nullable
   private List<? extends Vec3> IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   private int IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   @Nullable
   private Vec3 lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   private double IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   private boolean lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   private static String[] c;
   private static String[] d;

   public lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll() {
      super(false);
      Vec3 var10001 = Vec3.ZERO;
      short var10003 = 1450;
      short var10004 = -14215;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = var10001;
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = 4.3;
   }

   public final boolean V() {
      return this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   }

   public final void k(boolean var1) {
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = var1;
   }

   @NotNull
   public final ArrayList<BlockPos> W() {
      return this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   }

   public final void b(@NotNull ArrayList<BlockPos> var1) {
      short var10001 = 1440;
      short var10002 = -28472;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 1453;
      short var10003 = -24035;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (var2 != null) {
         LevelRenderContext var13 = var1.k();
         if (var13 != null) {
            LevelRenderContext var3 = var13;
            double var4 = 0.2;
            if (var2 != null && this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll != null) {
               Iterable var6 = this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
               boolean var7 = false;

               for (Object var9 : var6) {
                  Vec3 var10 = (Vec3)var9;
                  boolean var11 = false;
                  AABB var12 = new AABB(var10.subtract(var4, var4, var4), var10.add(var4, var4, var4));
                  me.octo.client.utils.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                     var3,
                     var12,
                     me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
                     1.0,
                     true);
                  if (var2 == null || var2 == null) {
                     break;
                  }
               }
            }

            return;
         }
      }
   }

   @Override
   public void u() { boolean var15 = false; // PX-FIX hoist
        
      Object var28 = null; // PX-FIX
      boolean var27 = false; // PX-FIX
      Object var24 = null; // PX-FIX
      Object var20 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         if (!me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j()) {
            LocalPlayer var10000 = this.a().player;
            if (var10000 == null) {
               return;
            }

            LocalPlayer var2 = var10000;
            Vec3 var3 = llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var2);
            lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll var18 = this;
            if (var1 != null) {
               if (this.m()) {
                  return;
               }

               var18 = this;
            }

            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = var18.k();
            if (var1 != null) {
               if (var4 != null) {
                  label217: {
                     double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var4.c(), true);
                     lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll var19 = this;
                     if (var1 != null) {
                        if (this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI != null && !(var5 < 4.5)) {
                           break label217;
                        }

                        var19 = this;
                     }

                     var19.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = var4.d();
                  }

                  Vec3 var8;
                  label232: {
                     label209: {
                        Vec3 var7 = this.l();
                        var8 = this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
                        if (var1 != null) {
                           if (var7 == null) {
                              break label209;
                           }

                           IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(this, null, var7);
                        }

                        if (var1 != null) {
                           break label232;
                        }
                     }

                     Vec3 var10001;
                     label201: {
                        var20 = this;
                        if (var1 != null) {
                           var10001 = var8;
                           if (var8 != null) {
                              break label201;
                           }
                        }

                        var10001 = var4.c();
                     }

                     IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(var20, var10001, null);
                  }

                  label195:
                  if (var8 != null
                     && me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .d(var8)
                        <= 0.1) {
                     BlockHitResult var9 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .I();
                     BlockHitResult var21 = var9;
                     if (var1 != null) {
                        if (var9 == null) {
                           break label195;
                        }

                        var21 = var9;
                     }

                     if (!Intrinsics.areEqual(var21.getBlockPos(), var4.a())) {
                        IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var22 = this.k();
                        if (var22 != null) {
                           var22.a(
                              IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(
                                 this, var4.a(), var8, null, false)
                           );
                        }

                        this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = null;
                     }
                  }

                  Vec3 var30;
                  label187: {
                     if (var1 != null) {
                        var30 = var8;
                        if (var8 != null) {
                           break label187;
                        }
                     }

                     var30 = var4.c();
                  }

                  label180: {
                     label233: {
                        double var16 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(var30, true);
                        double var11 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(
                                 this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl,
                                 me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
                                 0.3
                              )
                           ? 4.5
                           : this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
                        double var34;
                        int var23 = (var34 = var16 - var11) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
                        if (var1 != null) {
                           if (var23 <= 0 && var8 != null) {
                              break label233;
                           }

                           var23 = ((this.a(var4, var3, 3)) ? 1 : 0);
                        }

                        label172: {
                           label234: {
                              if (var1 != null) {
                                 if (var23 != 0) {
                                    this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = true;
                                    me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                                       me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                       var3,
                                       var4.c(),
                                       false,
                                       0.0);
                                    if (var1 != null) {
                                       break label172;
                                    }
                                 }

                                 var24 = this;
                                 if (var1 == null) {
                                    break label234;
                                 }

                                 var23 = ((this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI) ? 1 : 0);
                              }

                              if (var23 != 0) {
                                 me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .g(true);
                                 this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = false;
                              }

                              var24 = this;
                           }

                           this.b(var4);
                        }

                        label161: {
                           label236: {
                              label159: {
                                 boolean var25 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .P();
                                 if (var1 != null) {
                                    if (var25) {
                                       break label159;
                                    }

                                    var25 = var2.onGround();
                                 }

                                 if (var25) {
                                    break label236;
                                 }
                              }

                              int var26;
                              if (this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll != null) {
                                 List var14 = this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
                                  var15 = false;
                                 double var35;
                                 var26 = (
                                          var35 = ((Vec3)var14.get(
                                                   Math.min(
                                                      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl,
                                                      CollectionsKt.getLastIndex(var14)
                                                   )
                                                ))
                                                .y
                                             - var2.getY()
                                             - -0.5
                                       )
                                       == 0.0
                                    ? 0
                                    : (var35 < 0.0 ? -1 : 1);
                                 if (var1 != null) {
                                    var26 = var26 <= 0 ? 1 : 0;
                                 }
                              } else {
                                 var26 = 0;
                              }

                              if (var26 != 0) {
                                 var27 = true;
                                 break label161;
                              }
                           }

                           var27 = false;
                        }

                        boolean var13 = var27;
                        if (var1 != null) {
                           if (var13) {
                              this.q().f();
                              if (var1 != null) {
                                 break label180;
                              }
                           }

                           this.p().f();
                        }

                        if (var1 != null) {
                           break label180;
                        }
                     }

                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .p();
                  }

                  var28 = ((java.util.function.Supplier<Object>)(() -> { this.p().a(5000); return null; })).get();
                  label141:
                  if (var1 != null) {
                     label132:
                     if (((Boolean)(var28))) {
                        label238: {
                           short var31 = 1443;
                           short var10002 = 5443;
                           var28 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("sneak");
                           if (var1 != null) {
                              if (!((Boolean)var28)) {
                                 break label238;
                              }

                              var28 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var4.a());
                           }

                           if (var1 == null) {
                              break label141;
                           }

                           if (((Boolean)(var28))) {
                              break label132;
                           }
                        }

                        var28 = false;
                        break label141;
                     }

                     var28 = true;
                  }

                  boolean var17;
                  label239: {
                     var17 =((Boolean)( var28));
                     boolean var29 = var17;
                     if (var1 != null) {
                        if (!var17) {
                           this.q().f();
                           if (var1 != null) {
                              break label239;
                           }
                        }

                        var29 = ((java.util.function.Supplier<Boolean>)(() -> { this.q().a(100); return false; })).get();
                     }

                     if (var1 != null) {
                        if (var29) {
                           break label239;
                        }

                        var29 = false;
                     }

                     var17 = var29;
                  }

                  short var32 = 1444;
                  short var33 = -9521;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sneak", var17);
                  return;
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
            }

            return;
         }

         this.i(false);
      }
   }

   private final void b(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      Object var8 = null; // PX-FIX
      Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      List var4 = this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
      String var2 = var10000;
      List var6 = var4;
      if (var2 != null) {
         label56:
         if (var4 != null) {
            var10000 = ((String)(Object)(this));
            if (var2 != null) {
               if (this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl > CollectionsKt.getLastIndex(var4)) {
                  break label56;
               }

               var10000 = (String)var4.get(this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl);
            }

            Vec3 var5 = (Vec3)(Object)var10000;
            if (var2 != null) {
               if (me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var5, var3, 0.25)) {
                  this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl++;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g(true);
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  (Vec3)var4.get(this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl - 1),
                  var5,
                  true,
                  0.0);
            }

            if (var2 != null) {
               return;
            }
         }

         var6 = var4;
      }

      label46: {
         if (var6 != null) {
            var8 = this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
            if (var2 == null) {
               break label46;
            }

            if (this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl == var4.size()) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(true);
               this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl++;
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var3,
            this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl,
            true,
            0.0);
         var8 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl, var3, 0.2);
      }

      if (var2 != null) {
         if (((Boolean)(var8))) {
            return;
         }

         var8 = this.a(var1, var3, 2);
      }

      if (var2 != null) {
         if (!((Boolean)var8)) {
            return;
         }

         short var9 = 1445;
         short var10001 = 20079;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("cooked?");
         this.i().add(var1.a());
      }

      this.a((IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI)null);;
   }

   private final boolean a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      Vec3 var2,
      int var3
   ) {
      Object var16 = null; // PX-FIX
      Object var13 = null; // PX-FIX
      BlockPos var5 = var1.a();
      boolean var15 = false; // PX-FIX hoist
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Vec3 var6 = var1.c();
      Vec3 var7 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(var5);
      String var4 = var10000;
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var8 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2, var7);
      int var9 = 0;
      int var10 = 0;
      Vec3 var10003 = Vec3.ZERO;
      short var10005 = 1452;
      short var10006 = -6857;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var2, var10003, var8.a(), var8.b(), true
      );

      while (true) {
         while (true) {
            if (var10 > 300) {
               return false;
            }

            var10++;
            var13 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               1.0,
               0.0,
               var11,
               true,
               0.0);
            if (var4 == null) {
               break;
            }

            if (var13 != null) {
               var11 = ((me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)(((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)( var13))));
               var13 = var11;
               break;
            }
         }

         label80: {
            label90: {
               label78: {
                  Vec3 var14 = ((me.octo.client.PXDyn)(Object)(((me.octo.client.PXDyn)var13).a())).add(0.0, 1.27, 0.0);
                  short var10002 = 1448;
                  short var17 = -22751;
                  Intrinsics.checkNotNullExpressionValue(var14, "add(...)");
                  Vec3 var12 = var14;
                  if (var4 != null) {
                     if (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(this, var5, null, var12, false)
                        != null) {
                        var15 = ((Boolean)(Object)(var11.e()));
                        if (var4 == null) {
                           break label78;
                        }

                        if (((Boolean)(Object)(var15))) {
                           double var18;
                           var16 = (
                                    var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .a(var12, var6)
                                       - this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll
                                 )
                                 == 0.0
                              ? 0
                              : (var18 < 0.0 ? -1 : 1);
                           if (var4 == null) {
                              break label80;
                           }

                           if (((Boolean)var16)) {
                              var16 = ++var9;
                              if (var4 == null) {
                                 break label80;
                              }

                              if (var9 == var3) {
                                 return true;
                              }
                           }
                           break label90;
                        }
                     }

                     var9 = 0;
                  }

                  var15 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .k();
               }

               if (var4 == null) {
                  return ((Boolean)(Object)(var15));
               }

               if (((Boolean)(Object)(var15))) {
                  return false;
               }

               var16 = var11.e();
               if (var4 == null) {
                  break label80;
               }

               if (((Boolean)(var16))) {
                  return false;
               }
            }

            var16 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var7, var11.a(), 0.5);
         }

         if (var4 != null) {
            if (((Boolean)(var16))) {
               continue;
            }

            double var19;
            var16 = (var19 = Math.abs(var11.a().y - var7.y) - 0.5) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
         }

         if (var4 != null) {
            if (((Boolean)var16)) {
               continue;
            }

            var16 = 1;
         }

         return (boolean)var16;
      }
   }

   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI E() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll var4 = this;
            if (var1 != null) {
               if (this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
                  == lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  )
                {
                  return this.a(var2);
               }

               var4 = this;
            }

            return var4.b(var2);
         }
      }

      return null;
   }

   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      Level var1
   ) {
      Object var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Object var3 = null;
      String var2 = (String)var10000;

      label27:
      while (
         this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl
            <= CollectionsKt.getLastIndex(this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII)
      ) {
         var10000 = this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII
            .get(this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl);
         short var10002 = 1442;
         short var10003 = 11744;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");

         do {
            BlockPos var4 = (BlockPos)(Object)var10000;
            BlockState var10 = var1.getBlockState(var4);
            var10002 = 1447;
            var10003 = -11920;
            Intrinsics.checkNotNullExpressionValue(var10, "getBlockState(...)");
            BlockState var5 = var10;
            int var6 = this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl++;
            if (!me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .o(var5)) {
               continue label27;
            }

            var10000 = new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var4, var5
            );
         } while (var2 == null);

         var3 = var10000;
         break;
      }

      if (var3 == null) {
         return null;
      } else {
         ArrayList var7 = this.e(
            ((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3).a()
         );
         if (var7.isEmpty()) {
            return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3;
         } else {
            Pair var8 = this.e(var7);
            this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = null;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(true);
            this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = (Vec3)var8.getSecond();
            this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a((BlockPos)var8.getFirst(), true);
            this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = 1;
            return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI b(
      Level var1
   ) { boolean var15 = false; // PX-FIX hoist
        
      Object var80 = null; // PX-FIX
      Object var78 = null; // PX-FIX
      Object var77 = null; // PX-FIX
      Object var49 = null; // PX-FIX
      int var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t()
         .getY();
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Iterable var5 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
      String var2 = var10000;
      boolean var6 = false;
      Iterable var7 = var5;
      var var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, 10));
      boolean var9 = false;
      Iterator var10 = var5.iterator();

      while (true) {
         if (var10.hasNext()) {
            Object var11 = var10.next();
            BlockPos var12 = (BlockPos)var11;
            boolean var13 = false;
            BlockState var10003 = var1.getBlockState(var12);
            short var10005 = 1447;
            short var10006 = -11920;
            Intrinsics.checkNotNullExpressionValue(var10003, "getBlockState(...)");
            var8.add(
               new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  var12, var10003
               )
            );
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         var5 = var8;
         var6 = false;
         var7 = var5;
         var8 = new ArrayList();
         var9 = false;
         break;
      }

      var10 = var7.iterator();

      while (true) {
         if (var10.hasNext()) {
            Object var46 = var10.next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var54 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var46;
            boolean var58 = false;
            var77 = this.i();
            if (var2 == null) {
               break;
            }

            label201: {
               label220: {
                  var78 = ((me.octo.client.PXDyn)var77).contains(var54.a());
                  if (var2 != null) {
                     if (((Boolean)(var78))) {
                        break label220;
                     }

                     var78 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .o(var54.b());
                  }

                  if (var2 == null) {
                     break label201;
                  }

                  if (((Boolean)(var78))) {
                     var78 = true;
                     break label201;
                  }
               }

               var78 = false;
            }

            if (!((Boolean)var78)) {
               continue;
            }

            var8.add(var46);
            if (var2 != null) {
               continue;
            }
         }

         var77 = var8;
         break;
      }

      Object var4 = var77;
      Iterable var27 = (Iterable)var4;
      boolean var29 = false;
      var var37 = new ArrayList();
      boolean var42 = false;

      for (Object var55 : var27) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var59 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var55;
          var15 = false;
         boolean var79 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
            me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var59.a(),
            false);
         if (var2 != null) {
            if (!var79) {
               continue;
            }

            var37.add(var55);
         }

         if (var2 == null) {
            break;
         }
      }

      List var25 = var37;
      HashMap var28 = new HashMap();
      Iterator var30 = var25.iterator();

      while (true) {
         if (var30.hasNext()) {
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var33 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var30.next();
            var80 = this;
            if (var2 == null) {
               break;
            }

            ArrayList var38 = this.e(var33.a());
            boolean var81 = var38.isEmpty();
            if (var2 != null) {
               var81 = !var81;
            }

            if (!var81) {
               continue;
            }

            var28.put(var33, var38);
            if (var2 != null) {
               continue;
            }
         }

         var80 = this;
         break;
      }

      Set var10001 = var28.keySet();
      short var94 = 1449;
      short var10004 = 16116;
      Intrinsics.checkNotNullExpressionValue(var10001, "<get-keys>(...)");
      var7 = var10001;
      lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll var22 =((lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll)( var80));
      boolean var34 = false;
      Iterable var39 = var7;
      var var43 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, 10));
      boolean var48 = false;
      Object var56 = var7.iterator();

      while (true) {
         if (((me.octo.client.PXDyn)var56).hasNext()) {
            Object var60 = ((me.octo.client.PXDyn)var56).next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var64 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var60;
            boolean var16 = false;
            var43.add(var64.a());
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         var22.a(var43);
         break;
      }

      int var82 = var28.keySet().size();
      if (var2 != null) {
         if (var82 < 5) {
            return null;
         }

         Set var83 = var28.keySet();
         short var10002 = 1441;
         var94 = -11820;
         Intrinsics.checkNotNullExpressionValue(var83, "<get-keys>(...)");
         var39 = var83;
         boolean var84 = false;
      }

      label223: {
         label224: {
            var49 = var39.iterator();
            boolean var85 = ((me.octo.client.PXDyn)var49).hasNext();
            if (var2 != null) {
               if (!var85) {
                  var10000 = null;
                  break label223;
               }

               var56 = ((me.octo.client.PXDyn)var49).next();
               var10000 =((String)( var49));
               if (var2 == null) {
                  break label224;
               }

               var85 = ((me.octo.client.PXDyn)var49).hasNext();
            }

            if (!var85) {
               var10000 = (String)var56;
               break label223;
            }

            var10000 = (String)var56;
         }

         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var61 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
         boolean var65 = false;
         Intrinsics.checkNotNull(var61);
         double var62 = this.c(var61);

         label139:
         while (true) {
            Object var66 = ((me.octo.client.PXDyn)var49).next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var69 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var66;
            boolean var18 = false;
            Intrinsics.checkNotNull(var69);
            double var70 = this.c(var69);
            if (Double.compare(var62, var70) > 0) {
               var56 = var66;
               var62 = var70;
            }

            while (!(Boolean)((me.octo.client.PXDyn)var49).hasNext()) {
               if (var2 != null) {
                  var10000 = (String)var56;
                  break label139;
               }

               var62 = var70;
            }
         }
      }

      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var88 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
      if ((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000
         == null) {
         return null;
      } else {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var32 = var88;
         if (var2 != null) {
            ArrayList var89 = (ArrayList)var28.get(var32);
            if (var89 != null) {
               var8 = var89;
               Iterable var44 = var8;
               var48 = false;
               var var63 = new ArrayList();
               boolean var67 = false;

               for (Object var73 : var44) {
                  Pair var19 = (Pair)var73;
                  boolean var20 = false;
                  int var90 = Math.abs(((BlockPos)var19.getFirst()).getY() - var3);
                  if (var2 != null) {
                     var90 = var90 <= 0 ? 1 : 0;
                  }

                  if (var90 != 0) {
                     var63.add(var73);
                     if (var2 == null) {
                        break;
                     }
                  }
               }

               label111: {
                  List var40 = var63;
                  Collection var51 = var40;
                  boolean var91 = var51.isEmpty();
                  if (var2 != null) {
                     if (!var91) {
                        var10000 = ((String)(Object)(var51));
                        break label111;
                     }

                     boolean var92 = false;
                  }

                  var10000 = ((String)(Object)(var8));
               }

               List var45 = (List)(Object)var10000;
               Iterable var52 = var45;
               boolean var57 = false;
               var var68 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var52, 10));
               boolean var72 = false;
               Iterator var74 = var52.iterator();

               while (true) {
                  if (var74.hasNext()) {
                     Object var75 = var74.next();
                     Pair var76 = (Pair)var75;
                     boolean var21 = false;
                     var68.add((Vec3)var76.getSecond());
                     if (var2 == null) {
                        break;
                     }

                     if (var2 != null) {
                        continue;
                     }
                  }

                  this.b((java.util.List<? extends Vec3>)var68);
                  this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = null;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g(true);
                  break;
               }

               Pair var53 = this.e(var45);
               this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = (Vec3)var53.getSecond();
               this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a((BlockPos)var53.getFirst(), true);
               this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = 1;
               return var32;
            }
         }

         return null;
      }
   }

   private final ArrayList<Pair<BlockPos, Vec3>> e(BlockPos var1) { Object var15 = null; // PX-FIX hoist
        
      Object var34 = null; // PX-FIX
      boolean var31 = false; // PX-FIX
      Object var30 = null; // PX-FIX
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            ArrayList var4 = new ArrayList();
            int var5 = -3;

            label127:
            while (true) {
               int var22 = var5;

               label125:
               while (var22 < 4) {
                  int var6 = -3;

                  label122:
                  while (true) {
                     int var23 = var6;

                     label120:
                     while (true) {
                        if (var23 >= 4) {
                           break label122;
                        }

                        var22 = -3;
                        if (var2 == null) {
                           continue label125;
                        }

                        int var7 = -3;

                        while (var7 < 4) {
                           BlockPos var24 = var1.offset(var5, var6, var7);
                           short var10002 = 1468;
                           short var10003 = 29880;
                           Intrinsics.checkNotNullExpressionValue(var24, "offset(...)");
                           BlockPos var8 = var24;
                           BlockState var25 = var3.getBlockState(var8);
                           var10002 = 1447;
                           var10003 = -11920;
                           Intrinsics.checkNotNullExpressionValue(var25, "getBlockState(...)");
                           BlockState var9 = var25;
                           BlockState var26 = var3.getBlockState(var8.offset(0, 1, 0));
                           var10002 = 1447;
                           var10003 = -11920;
                           Intrinsics.checkNotNullExpressionValue(var26, "getBlockState(...)");
                           BlockState var10 = var26;
                           BlockState var27 = var3.getBlockState(var8.offset(0, 2, 0));
                           var10002 = 1447;
                           var10003 = -11920;
                           Intrinsics.checkNotNullExpressionValue(var27, "getBlockState(...)");
                           BlockState var11 = var27;
                           label114:
                           if (var2 != null) {
                              var23 = ((var9.isAir()) ? 1 : 0);
                              if (var2 == null) {
                                 continue label120;
                              }

                              label111:
                              if (var23 == 0) {
                                 boolean var28 = var10.isAir();
                                 if (var2 != null) {
                                    if (!var28) {
                                       break label111;
                                    }

                                    var28 = var11.isAir();
                                 }

                                 if (var28) {
                                    Vec3 var12;
                                    label140: {
                                       Vec3 var29 = new Vec3(var8.getX() + 0.5, var8.getY() + 1.0, var8.getZ() + 0.5).add(this.g());
                                       var10002 = 1454;
                                       var10003 = 19542;
                                       Intrinsics.checkNotNullExpressionValue(var29, "add(...)");
                                       var12 = var29;
                                       AABB var13 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .f(var1);
                                        var15 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .a(var13, var12);
                                       boolean var16 = false;
                                       var30 = var15;
                                       label102:
                                       if (var2 != null) {
                                          if (var15 instanceof Collection) {
                                             var30 = (Collection)var15;
                                             if (var2 == null) {
                                                break label102;
                                             }

                                             if (((me.octo.client.PXDyn)var30).isEmpty()) {
                                                var31 = false;
                                                break label140;
                                             }
                                          }

                                          var30 = var15;
                                       }

                                       Iterator var17 = ((me.octo.client.PXDyn)var30).iterator();

                                       label95:
                                       while (true) {
                                          if (!var17.hasNext()) {
                                             var31 = false;
                                             break;
                                          }

                                          Object var18 = var17.next();
                                          Vec3 var19 = (Vec3)var18;
                                          boolean var32 = false;

                                          while (true) {
                                             label91: {
                                                label143: {
                                                   BlockPos var21 = ((me.octo.client.PXDyn)(Object)(me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                                                         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                                         var19,
                                                         4.5,
                                                         null,
                                                         var12)
                                                      )).c();
                                                   BlockPos var33 = var21;
                                                   if (var2 != null) {
                                                      if (var21 == null) {
                                                         break label143;
                                                      }

                                                      var33 = var21;
                                                   }

                                                   var34 = Intrinsics.areEqual(var33, var1);
                                                   if (var2 == null) {
                                                      break label91;
                                                   }

                                                   if (((Boolean)(var34))) {
                                                      var34 = true;
                                                      break label91;
                                                   }
                                                }

                                                var34 = false;
                                             }

                                             if (!((Boolean)var34)) {
                                                break;
                                             }

                                             var31 = true;
                                             if (var2 != null) {
                                                break label95;
                                             }
                                          }
                                       }
                                    }

                                    boolean var14 = var31;
                                    if (var2 == null) {
                                       break label114;
                                    }

                                    if (var14) {
                                       var4.add(TuplesKt.to(var8, var12));
                                    }
                                 }
                              }

                              var7++;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        var6++;
                        if (var2 == null) {
                           break label122;
                        }
                        break;
                     }
                  }

                  var5++;
                  if (var2 == null) {
                     return var4;
                  }
                  continue label127;
               }

               return var4;
            }
         }
      }

      return new ArrayList<>();
   }

   private final Pair<BlockPos, Vec3> e(List<? extends Pair<? extends BlockPos, ? extends Vec3>> var1) { Pair var15 = null; // PX-FIX hoist
        
      Object var27 = null; // PX-FIX
      Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      int var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t()
         .getY();
      List var5 = this.a(6.0, 3);
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Iterable var7 = var1;
      String var2 = var10000;
      boolean var8 = false;
      List var6 = CollectionsKt.take(
         CollectionsKt.sortedWith(
            var7,
            new lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var4, var3, var5
            )
         ),
         3
      );
      var10000 = ((String)(Object)(me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI));
      if (var2 != null) {
         if (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .k()) {
            label76: {
               Iterable var18 = var6;
               boolean var9 = false;
               Iterator var10 = var18.iterator();
               var10000 = ((String)(Object)(var10));
               if (var2 != null) {
                  if (!var10.hasNext()) {
                     var10000 = null;
                     break label76;
                  }

                  var10000 = (String)var10.next();
               }

               Object var11 = var10000;
               var10000 = ((String)(Object)(var10));
               if (var2 != null) {
                  if (!var10.hasNext()) {
                     var10000 = (String)var11;
                     break label76;
                  }

                  var10000 = (String)var11;
               }

               label64: {
                  Pair var12 = (Pair)(Object)var10000;
                  boolean var14 = false;
                  if (var2 != null) {
                     ArrayList var26 = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(
                        me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        (BlockPos)var12.getFirst(),
                        null,
                        2,
                        null
                     );
                     if (var26 != null) {
                        var27 = var26.size();
                        break label64;
                     }
                  }

                  var27 = 999.0;
               }

               double var19 =((Double)( var27));

               label58:
               while (true) {
                  Object var20 = var10.next();
                   var15 = (Pair)var20;
                  boolean var17 = false;
                  ArrayList var28 = me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a(
                     me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     (BlockPos)var15.getFirst(),
                     null,
                     2,
                     null
                  );
                  double var21 = var28 != null ? var28.size() : 999.0;

                  do {
                     int var29 = Double.compare(var19, var21);
                     if (var2 != null) {
                        if (var29 > 0) {
                           var11 = var20;
                           var19 = var21;
                        }

                        var29 = ((var10.hasNext()) ? 1 : 0);
                     }

                     if (var29 != 0) {
                        continue label58;
                     }
                  } while (var2 == null);

                  var10000 = (String)var11;
                  break;
               }
            }

            Pair var23 = (Pair)(Object)var10000;
            if (var2 != null && (Pair)(Object)var10000 == null) {
               var23 = (Pair)CollectionsKt.first(var6);
            }

            return var23;
         }

         var10000 = (String)CollectionsKt.first(var6);
      }

      return ((Pair<BlockPos,Vec3>)(Object)((Pair<BlockPos, Vec3>)(Object)var10000));
   }

   private final double c(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) { BlockPos var15 = null; // PX-FIX hoist
        
      int var25 = 0; // PX-FIX
      Object var24 = null; // PX-FIX
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         if (var10000 != null) {
            me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var10000;
            Vec3 var4 = var1.c();
            Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            int var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t()
               .getY();
            double var7 = 0.0;
            var7 += Math.abs(var1.a().getY() - var6) * 20.0;
            var7 += me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var5, var4)
               * 1.5;
            var7 += me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .d(var4)
               * 0.1;
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
            if (var3.k() > 100 && var9 != null) {
               double var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var9.c(), var4);
               if (var2 != null) {
                  if (var23 < 5.0) {
                     var7 += 20.0;
                  }

                  var23 = var7;
               }

               double var17;
               label74: {
                  Iterable var10;
                  var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var1.a(), 1, 1, 1);
                  var17 = var23;
                  boolean var11 = false;
                  var24 = var10 instanceof Collection;
                  label62:
                  if (var2 != null) {
                     if (!((Boolean)var24)) {
                        var24 = ((Collection)var10).isEmpty();
                        if (var2 == null) {
                           break label62;
                        }

                        if (!((Boolean)var24)) {
                           var25 = 0;
                           break label74;
                        }
                     }

                     var24 = 0;
                  }

                  int var12 =((Integer)( var24));

                  for (Object var14 : var10) {
                      var15 = (BlockPos)var14;
                     boolean var16 = false;
                     ClientLevel var26 = this.a().level;
                     Intrinsics.checkNotNull(var26);
                     var25 = ((var26.getBlockState(var15).is(Blocks.BEDROCK)) ? 1 : 0);
                     if (var2 == null) {
                        break label74;
                     }

                     label76: {
                        if (var2 != null) {
                           if (var25 == 0) {
                              continue;
                           }

                           var12++;
                           if (var2 == null) {
                              break label76;
                           }

                           var25 = var12;
                        }

                        if (var25 >= 0) {
                           continue;
                        }

                        CollectionsKt.throwCountOverflow();
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  var25 = var12;
               }

               int var19 = var25;
               var7 = var17 + var19 * 2.0;
            }

            return this.a(var4, var7, 30.0);
         }
      }

      return Double.MAX_VALUE;
   }

   private final List<BlockPos> f(List<? extends BlockPos> var1) { BlockPos var15 = null; // PX-FIX hoist
        
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            HashSet var4 = new HashSet();
            Iterator var5 = var1.iterator();

            label94:
            while (true) {
               byte var12 = ((byte)((var5.hasNext()) ? 1 : 0));

               label92:
               while (var12 != 0) {
                  BlockPos var6 = (BlockPos)var5.next();
                  var12 = -6;

                  label90:
                  while (true) {
                     int var7 = var12;

                     do {
                        int var13 = var7;

                        label85:
                        while (true) {
                           if (var13 >= 7) {
                              continue label94;
                           }

                           var12 = -6;
                           if (var2 == null) {
                              continue label90;
                           }

                           if (var2 == null) {
                              continue label92;
                           }

                           int var8 = -6;

                           while (true) {
                              int var14 = var8;

                              label80:
                              while (true) {
                                 if (var14 >= 7) {
                                    break label85;
                                 }

                                 var13 = -6;
                                 if (var2 == null) {
                                    continue label85;
                                 }

                                 int var9 = -6;

                                 while (true) {
                                    if (var9 >= 7) {
                                       break label80;
                                    }

                                     var15 = var6.offset(var8, var7, var9);
                                    short var10002 = 1446;
                                    short var10003 = -18283;
                                    Intrinsics.checkNotNullExpressionValue(var15, "offset(...)");
                                    BlockPos var10 = var15;
                                    if (var2 != null) {
                                       var14 = ((var4.contains(var10)) ? 1 : 0);
                                       if (var2 == null) {
                                          break;
                                       }

                                       if (var14 == 0) {
                                          BlockState var16 = var3.getBlockState(var10);
                                          var10002 = 1455;
                                          var10003 = 20496;
                                          Intrinsics.checkNotNullExpressionValue(var16, "getBlockState(...)");
                                          BlockState var11 = var16;
                                          if (var2 != null
                                             && (
                                                me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                      .o(var11)
                                                   || var2 != null && var11.is(Blocks.BEDROCK)
                                             )) {
                                             var4.add(var10);
                                          }
                                       }

                                       var9++;
                                    }

                                    if (var2 == null) {
                                       break label80;
                                    }
                                 }
                              }

                              var8++;
                              if (var2 == null) {
                                 break label85;
                              }
                           }
                        }

                        var7++;
                     } while (var2 != null);

                     return CollectionsKt.toList(var4);
                  }
               }

               return CollectionsKt.toList(var4);
            }
         }
      }

      return CollectionsKt.emptyList();
   }

   @Override
   public void c(@NotNull BlockPos var1) { List var15 = null; // PX-FIX hoist
        
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 1451;
      short var10003 = 25760;
      Intrinsics.checkNotNullParameter(var1, "pos");
      String var2 = var10000;
      lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll var16 = this;
      boolean var10001 = this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.isEmpty();
      if (var2 != null) {
         var10001 = !var10001;
      }

      lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var17;
      if (var10001) {
         this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = 0;
         var17 = lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      } else {
         List var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(0.5, 10.0);
         Iterable var4 = var3;
         boolean var5 = false;
         var var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
         boolean var8 = false;

         for (Object var10 : var4) {
            BlockPos var11 = (BlockPos)var10;
            boolean var12 = false;
            var7.add(new Vec3(var11).add(0.5, 1.0, 0.5).add(this.g()));
            if (var2 == null) {
               return;
            }

            if (var2 == null) {
               break;
            }
         }

          var15 = var7;
         var16 = this;
         this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = var15;
         this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = this.f(var3);
         this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = null;
         var17 = lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      var16.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = var17;
      this.e(this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII);
      super.c(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "Í\u0017\u000f/\u0005\u0099xj¶.\bªÂ\u0089÷)¥´i\u0012,\u0099\u008f×¹Çá\u000eÁF\u000f\u0098\u0091\u0095Ê\u0010i¯\b\u0099eï\u0003å;-º\u000f\u0002`k\u009cWZS+qøt\u0016ÕSg\u0004\u0084?&*\u0003Âv \u0005.IH\u0084u\u0007{çúzfun\u000bp+\u001fÓòKë¢ßdV\u0012Z\u008cAu`\u0093Ú\u0084¦\u0017ã²\fÐy¸\u001fº\u0007\u0089i\u001a+yøÍ\u000fÂÓsêT\u00943ò}Ãõqå¿a\b\u0007ÇêvW\u0095{o";
      int var4 = "Í\u0017\u000f/\u0005\u0099xj¶.\bªÂ\u0089÷)¥´i\u0012,\u0099\u008f×¹Çá\u000eÁF\u000f\u0098\u0091\u0095Ê\u0010i¯\b\u0099eï\u0003å;-º\u000f\u0002`k\u009cWZS+qøt\u0016ÕSg\u0004\u0084?&*\u0003Âv \u0005.IH\u0084u\u0007{çúzfun\u000bp+\u001fÓòKë¢ßdV\u0012Z\u008cAu`\u0093Ú\u0084¦\u0017ã²\fÐy¸\u001fº\u0007\u0089i\u001a+yøÍ\u000fÂÓsêT\u00943ò}Ãõqå¿a\b\u0007ÇêvW\u0095{o"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 125;
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
                     case 0 -> 97;
                     case 1 -> 22;
                     case 2 -> 11;
                     case 3 -> 127;
                     case 4 -> 109;
                     case 5 -> 101;
                     default -> 43;
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
                     d = new String[17];
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

                  var2 = "\u008f7µ\u0082\u0003\u000b³\t®^\r3ÝdÐu~";
                  var4 = "\u008f7µ\u0082\u0003\u000b³\t®^\r3ÝdÐu~".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 24;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 1452) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 97;
            case 1 -> 196;
            case 2 -> 166;
            case 3 -> 39;
            case 4 -> 108;
            case 5 -> 234;
            case 6 -> 161;
            case 7 -> 178;
            case 8 -> 82;
            case 9 -> 21;
            case 10 -> 96;
            case 11 -> 164;
            case 12 -> 93;
            case 13 -> 65;
            case 14 -> 56;
            case 15 -> 168;
            case 16 -> 74;
            case 17 -> 231;
            case 18 -> 195;
            case 19 -> 224;
            case 20 -> 170;
            case 21 -> 216;
            case 22 -> 90;
            case 23 -> 139;
            case 24 -> 55;
            case 25 -> 1;
            case 26 -> 9;
            case 27 -> 100;
            case 28 -> 201;
            case 29 -> 46;
            case 30 -> 210;
            case 31 -> 207;
            case 32 -> 150;
            case 33 -> 248;
            case 34 -> 6;
            case 35 -> 155;
            case 36 -> 173;
            case 37 -> 167;
            case 38 -> 114;
            case 39 -> 220;
            case 40 -> 24;
            case 41 -> 251;
            case 42 -> 228;
            case 43 -> 140;
            case 44 -> 76;
            case 45 -> 47;
            case 46 -> 103;
            case 47 -> 64;
            case 48 -> 185;
            case 49 -> 89;
            case 50 -> 142;
            case 51 -> 77;
            case 52 -> 49;
            case 53 -> 118;
            case 54 -> 162;
            case 55 -> 149;
            case 56 -> 194;
            case 57 -> 2;
            case 58 -> 163;
            case 59 -> 0;
            case 60 -> 99;
            case 61 -> 138;
            case 62 -> 106;
            case 63 -> 252;
            case 64 -> 147;
            case 65 -> 54;
            case 66 -> 73;
            case 67 -> 232;
            case 68 -> 44;
            case 69 -> 80;
            case 70 -> 79;
            case 71 -> 15;
            case 72 -> 212;
            case 73 -> 113;
            case 74 -> 53;
            case 75 -> 158;
            case 76 -> 59;
            case 77 -> 75;
            case 78 -> 223;
            case 79 -> 95;
            case 80 -> 86;
            case 81 -> 239;
            case 82 -> 18;
            case 83 -> 36;
            case 84 -> 151;
            case 85 -> 202;
            case 86 -> 117;
            case 87 -> 136;
            case 88 -> 227;
            case 89 -> 230;
            case 90 -> 171;
            case 91 -> 204;
            case 92 -> 244;
            case 93 -> 169;
            case 94 -> 105;
            case 95 -> 81;
            case 96 -> 41;
            case 97 -> 218;
            case 98 -> 193;
            case 99 -> 200;
            case 100 -> 29;
            case 101 -> 50;
            case 102 -> 174;
            case 103 -> 107;
            case 104 -> 192;
            case 105 -> 102;
            case 106 -> 37;
            case 107 -> 199;
            case 108 -> 146;
            case 109 -> 253;
            case 110 -> 175;
            case 111 -> 27;
            case 112 -> 181;
            case 113 -> 32;
            case 114 -> 121;
            case 115 -> 226;
            case 116 -> 42;
            case 117 -> 176;
            case 118 -> 101;
            case 119 -> 84;
            case 120 -> 26;
            case 121 -> 205;
            case 122 -> 22;
            case 123 -> 236;
            case 124 -> 16;
            case 125 -> 141;
            case 126 -> 60;
            case 127 -> 70;
            case 128 -> 134;
            case 129 -> 129;
            case 130 -> 209;
            case 131 -> 182;
            case 132 -> 48;
            case 133 -> 61;
            case 134 -> 188;
            case 135 -> 51;
            case 136 -> 123;
            case 137 -> 68;
            case 138 -> 186;
            case 139 -> 125;
            case 140 -> 225;
            case 141 -> 72;
            case 142 -> 87;
            case 143 -> 184;
            case 144 -> 148;
            case 145 -> 132;
            case 146 -> 177;
            case 147 -> 122;
            case 148 -> 91;
            case 149 -> 31;
            case 150 -> 67;
            case 151 -> 211;
            case 152 -> 183;
            case 153 -> 58;
            case 154 -> 17;
            case 155 -> 143;
            case 156 -> 71;
            case 157 -> 109;
            case 158 -> 11;
            case 159 -> 4;
            case 160 -> 112;
            case 161 -> 197;
            case 162 -> 3;
            case 163 -> 237;
            case 164 -> 233;
            case 165 -> 206;
            case 166 -> 66;
            case 167 -> 157;
            case 168 -> 144;
            case 169 -> 13;
            case 170 -> 187;
            case 171 -> 247;
            case 172 -> 119;
            case 173 -> 115;
            case 174 -> 5;
            case 175 -> 238;
            case 176 -> 159;
            case 177 -> 14;
            case 178 -> 12;
            case 179 -> 120;
            case 180 -> 111;
            case 181 -> 213;
            case 182 -> 127;
            case 183 -> 88;
            case 184 -> 250;
            case 185 -> 45;
            case 186 -> 38;
            case 187 -> 128;
            case 188 -> 145;
            case 189 -> 241;
            case 190 -> 7;
            case 191 -> 98;
            case 192 -> 254;
            case 193 -> 235;
            case 194 -> 57;
            case 195 -> 203;
            case 196 -> 189;
            case 197 -> 30;
            case 198 -> 92;
            case 199 -> 240;
            case 200 -> 165;
            case 201 -> 133;
            case 202 -> 19;
            case 203 -> 156;
            case 204 -> 85;
            case 205 -> 104;
            case 206 -> 20;
            case 207 -> 229;
            case 208 -> 25;
            case 209 -> 172;
            case 210 -> 110;
            case 211 -> 34;
            case 212 -> 116;
            case 213 -> 245;
            case 214 -> 137;
            case 215 -> 33;
            case 216 -> 160;
            case 217 -> 249;
            case 218 -> 130;
            case 219 -> 62;
            case 220 -> 255;
            case 221 -> 83;
            case 222 -> 242;
            case 223 -> 28;
            case 224 -> 179;
            case 225 -> 180;
            case 226 -> 94;
            case 227 -> 52;
            case 228 -> 243;
            case 229 -> 219;
            case 230 -> 152;
            case 231 -> 191;
            case 232 -> 217;
            case 233 -> 126;
            case 234 -> 135;
            case 235 -> 43;
            case 236 -> 153;
            case 237 -> 246;
            case 238 -> 40;
            case 239 -> 10;
            case 240 -> 69;
            case 241 -> 78;
            case 242 -> 23;
            case 243 -> 222;
            case 244 -> 154;
            case 245 -> 63;
            case 246 -> 190;
            case 247 -> 35;
            case 248 -> 131;
            case 249 -> 221;
            case 250 -> 198;
            case 251 -> 124;
            case 252 -> 208;
            case 253 -> 215;
            case 254 -> 8;
            default -> 214;
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

   public static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public static lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() {
     me.octo.client.lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var0 = new me.octo.client.lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlIllllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[2];
     var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
     var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
     return var0;
  }
}
}
