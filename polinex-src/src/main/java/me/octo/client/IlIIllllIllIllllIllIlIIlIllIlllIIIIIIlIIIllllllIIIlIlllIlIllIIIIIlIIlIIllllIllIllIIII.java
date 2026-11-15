package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.MultiPlayerGameModeProgressAccessor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final Set<BlockPos> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] f;
   private static String[] g;

   private IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII() {
      short var10001 = -510;
      short var10002 = 16696;
      var10002 = -500;
      short var10003 = 31760;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = -488;
      short var10005 = 4469;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.a(),
         lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.b(),
         lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.c(),
         lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.d(),
         lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.e()
      };
      super("Hardstone Nuker", "Nukes hardstone blocks.", var3, "Crystal Hollows", var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 5;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new LinkedHashSet<>();
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      boolean var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 != null) {
         if (!var4) {
            return;
         }

         var4 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      if (var2 != null) {
         if (var4) {
            return;
         }

         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var5 = lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.a();
         short var10001 = -509;
         short var10002 = -9255;
         var4 = var5.c("Legit");
      }

      if (var4) {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.a(
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         );
         if (var2 == null) {
            return;
         }

         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
            return;
         }

         BlockPos var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         Minecraft var6 = this.ap();
         if (var2 != null) {
            LocalPlayer var7 = var6.player;
            Intrinsics.checkNotNull(var6.player);
            if (!(
               Math.sqrt(var7.distanceToSqr(Vec3.atCenterOf(var3)))
                  < this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            )) {
               return;
            }

            var6 = this.ap();
         }

         var6.hitResult = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      Object var8 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      boolean var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 != null) {
         if (!var4) {
            return;
         }

         var4 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      if (var2 != null) {
         if (var4) {
            return;
         }

         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var5 = lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.a();
         short var10001 = -487;
         short var10002 = 31127;
         var4 = var5.c("Normal");
      }

      label73: {
         label72: {
            if (var4) {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.a(
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               );
               BlockPos var6 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               if (var2 != null) {
                  if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                     Set var7 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                     BlockPos var13 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                     Intrinsics.checkNotNull(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
                     var7.add(var13);
                  }

                  var6 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               }

               if (var2 != null) {
                  if (var6 == null) {
                     IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII var12 = this;
                     if (var2 != null) {
                        if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
                           return;
                        }

                        var12 = this;
                     }

                     var12.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
                     return;
                  }

                  var6 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               }

               if (var6 == null) {
                  return;
               }

               BlockPos var3 = var6;
               var8 = this;
               if (var2 == null) {
                  break label72;
               }

               LocalPlayer var9 = this.ap().player;
               Intrinsics.checkNotNull(var9);
               if (!(
                  Math.sqrt(var9.distanceToSqr(Vec3.atCenterOf(var3)))
                     < this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               )) {
                  Vec3 var14 = Vec3.atCenterOf(var3);
                  LocalPlayer var15 = this.ap().player;
                  Intrinsics.checkNotNull(var15);
                  this.a(new BlockHitResult(var14, Direction.fromYRot(var15.getYRot()), var3, false));
                  var8 = this;
                  break label72;
               }

               if (var1.b()) {
                  Vec3 var10003 = Vec3.atCenterOf(var3);
                  LocalPlayer var10004 = this.ap().player;
                  Intrinsics.checkNotNull(var10004);
                  this.b(new BlockHitResult(var10003, Direction.fromYRot(var10004.getYRot()), var3, false));
               }

               var10 = this;
               if (var2 == null) {
                  break label73;
               }

               ClientLevel var11 = this.ap().level;
               Intrinsics.checkNotNull(var11);
               if (var11.getBlockState(var3).getBlock() == Blocks.AIR) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
                  var10 = this;
                  break label73;
               }
            }

            return;
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
         return;
      }

      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      boolean var3 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      if (var2 != null) {
         if (lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            )
          {
            return;
         }

         var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      }

      if (var2 != null) {
         if (!var3) {
            return;
         }

         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var4 = lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.a();
         short var10001 = -502;
         short var10002 = -14679;
         var3 = var4.c("Legit");
      }

      if (var3 && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
         var1.a(true);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
   }

   @Override
   public void aB() {
      this.as();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
      if (!lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         .aA()) {
         short var10000 = -507;
         short var10001 = -5292;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§7Recommended: enable §bPingless Hardstone §7while using §bHardstone Nuker§7."
         );
      }
   }

   @Override
   public void aC() {
      this.at();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final BlockPos a(int var1) {
      int[] var2;
      BlockPos var3;
      List var5;
      List var6;
      int var28;
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      var2 = var10000;
      LocalPlayer var27 = this.ap().player;
      Intrinsics.checkNotNull(var27);
      int var4 = var27.blockPosition().getY() - 1;
      var5 = new ArrayList();
      var6 = new ArrayList();
      int var7 = -var1;
      var28 = var7;
      label164:
      if (var2 != null) {
         if (var7 <= var1) {
            do {
               int var10001;
               label180: {
                  int var8 = -var1;
                  if (var8 <= var1) {
                     do {
                        int var9 = -var1;
                        var28 = var9;
                        var10001 = var1;
                        if (var2 == null) {
                           break label180;
                        }

                        label181: {
                           if (var9 <= var1) {
                              do {
                                 BlockPos var29 = var3.offset(new Vec3i(var7,((Integer)( var8)), var9));
                                 short var10002 = -508;
                                 short var10003 = 25106;
                                 Intrinsics.checkNotNullExpressionValue(var29, "offset(...)");
                                 BlockPos var10 = var29;
                                 ClientLevel var30 = this.ap().level;
                                 Intrinsics.checkNotNull(var30);
                                 Block var31 = var30.getBlockState(var10).getBlock();
                                 var10002 = -503;
                                 var10003 = 2655;
                                 Intrinsics.checkNotNullExpressionValue(var31, "getBlock(...)");
                                 Block var11 = var31;
                                 var28 = var10.getY();
                                 var10001 = var4;
                                 if (var2 == null) {
                                    break label181;
                                 }

                                 label149: {
                                    if (var28 > var4) {
                                       var28 = ((this.a(var11)) ? 1 : 0);
                                       if (var2 == null || var2 == null) {
                                          break label149;
                                       }

                                       if (var28 != 0) {
                                          var28 = ((this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.contains(var10)) ? 1 : 0);
                                          if (var2 == null) {
                                             break label149;
                                          }

                                          if (var28 == 0) {
                                             var28 = ((this.a(var10)) ? 1 : 0);
                                             if (var2 == null) {
                                                break label149;
                                             }

                                             if (var28 != 0) {
                                                label140: {
                                                   int var12 = var10.getY() - var4;
                                                   var28 = 1;
                                                   var10001 = var12;
                                                   if (var2 != null) {
                                                      if (1 > var12) {
                                                         var28 = 0;
                                                         break label140;
                                                      }

                                                      var28 = var12;
                                                      if (var2 == null) {
                                                         break label140;
                                                      }

                                                      var10001 = 4;
                                                   }

                                                   var28 = var28 < var10001 ? 1 : 0;
                                                }

                                                if (var28 != 0) {
                                                   var5.add(var10);
                                                } else {
                                                   var6.add(var10);
                                                }
                                             }
                                          }
                                       }
                                    }

                                    var28 = var9;
                                 }

                                 var10001 = var1;
                                 if (var2 == null) {
                                    break label181;
                                 }

                                 if (var28 == var1) {
                                    break;
                                 }

                                 var9++;
                              } while (var2 != null);
                           }

                           var28 =((Integer)( var8));
                           var10001 = var1;
                        }

                        if (var2 == null) {
                           break label180;
                        }

                        if (var28 == var10001) {
                           break;
                        }

                        var8++;
                     } while (var2 != null);
                  }

                  var28 = var7;
                  if (var2 == null) {
                     break label164;
                  }

                  var10001 = var1;
               }

               if (var28 == var10001) {
                  break;
               }

               var7++;
            } while (var2 != null);
         }

         var28 = ((var5.isEmpty()) ? 1 : 0);
      }

      if (var2 != null) {
         var28 = var28 == 0 ? 1 : 0;
      }

      List var18 = var28 != 0 ? var5 : var6;
      Iterable var19 = var18;
      boolean var20 = false;
      Iterator var21 = var19.iterator();
      Object var33 = var21;
      if (var2 != null) {
         if (!var21.hasNext()) {
            return (BlockPos)null;
         }

         var33 = var21.next();
      }

      Object var22 = var33;
      Object var34 = var21;
      if (var2 != null) {
         if (!var21.hasNext()) {
            return (BlockPos)var22;
         }

         var34 = var22;
      }

      BlockPos var23 = (BlockPos)var34;
      boolean var14 = false;
      double var24 = var3.distSqr(var23);

      while (true) {
         Object var25 = var21.next();
         BlockPos var15 = (BlockPos)var25;
         boolean var17 = false;
         double var26 = var3.distSqr(var15);
         if (Double.compare(var24, var26) > 0) {
            var22 = var25;
            var24 = var26;
         }

         while (!var21.hasNext()) {
            if (var2 != null) {
               return (BlockPos)var22;
            }

            var24 = var26;
         }
      }
   }

   private final boolean a(BlockPos var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      int var10000 = lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.d().al() ? 1 : 0;
      if (var2 != null) {
         if ((var10000 != 0)) {
            LocalPlayer var12 = this.ap().player;
            if (var12 == null) {
               return false;
            }

            LocalPlayer var3 = var12;
            Vec3 var13 = var3.getEyePosition();
            short var10002 = -511;
            short var10003 = -2952;
            Intrinsics.checkNotNullExpressionValue(var13, "getEyePosition(...)");
            Vec3 var4 = var13;
            Vec3 var14 = Vec3.atCenterOf(var1);
            var10002 = -505;
            var10003 = -25418;
            Intrinsics.checkNotNullExpressionValue(var14, "atCenterOf(...)");
            Vec3 var5 = var14;
            Vec3 var15 = var5.subtract(var4);
            var10002 = -499;
            var10003 = -1892;
            Intrinsics.checkNotNullExpressionValue(var15, "subtract(...)");
            Vec3 var6 = var15;
            Vec3 var16 = var3.getLookAngle();
            var10002 = -512;
            var10003 = 31393;
            Intrinsics.checkNotNullExpressionValue(var16, "getLookAngle(...)");
            Vec3 var7 = var16;
            double var8 = var7.dot(var6.normalize());
            double var10 = Math.toDegrees(Math.acos(RangesKt.coerceIn(var8, -1.0, 1.0)));
            double var24;
            var10000 = (var24 = var10 - lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.e().O() / 2.0) == 0.0
               ? 0
               : (var24 < 0.0 ? -1 : 1);
            if (var2 != null) {
               var10000 = var10000 <= 0 ? 1 : 0;
            }

            return (var10000 != 0);
         }

         var10000 = 1;
      }

      return (var10000 != 0);
   }

   private final boolean a(Block var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      boolean var10000 = Intrinsics.areEqual(var1, Blocks.STONE);
      if (var2 != null) {
         label48:
         if (!var10000) {
            var10000 = Intrinsics.areEqual(var1, Blocks.INFESTED_STONE);
            if (var2 != null) {
               if (var10000) {
                  break label48;
               }

               var10000 = lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.b().al();
            }

            label38:
            if (var2 != null) {
               if (var10000) {
                  var10000 = this.b(var1);
                  if (var2 == null) {
                     break label38;
                  }

                  if (var10000) {
                     return true;
                  }
               }

               var10000 = lllIIIIlIlIlIlIIIllIIlIIlllllllIIlllIlllIIlIllllIIIlIllllIIlIIIlIlIIIlIIIllIIlIllIlll.c().al();
            }

            if (var2 != null) {
               if (var10000) {
                  var10000 = this.c(var1);
                  if (var2 == null) {
                     return var10000;
                  }

                  if (var10000) {
                     return true;
                  }
               }

               var10000 = false;
            }

            return var10000;
         }

         var10000 = true;
      }

      return var10000;
   }

   private final boolean b(Block var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      boolean var10000 = Intrinsics.areEqual(var1, Blocks.COAL_ORE);
      if (var2 != null) {
         if (!var10000) {
            var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_COAL_ORE);
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Intrinsics.areEqual(var1, Blocks.REDSTONE_ORE);
               if (var2 == null) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_REDSTONE_ORE);
                  if (var2 == null) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = Intrinsics.areEqual(var1, Blocks.EMERALD_ORE);
                     if (var2 == null) {
                        return var10000;
                     }

                     if (!var10000) {
                        var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_EMERALD_ORE);
                        if (var2 == null) {
                           return var10000;
                        }

                        if (!var10000) {
                           var10000 = Intrinsics.areEqual(var1, Blocks.DIAMOND_ORE);
                           if (var2 == null) {
                              return var10000;
                           }

                           if (!var10000) {
                              var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_DIAMOND_ORE);
                              if (var2 == null) {
                                 return var10000;
                              }

                              if (!var10000) {
                                 var10000 = Intrinsics.areEqual(var1, Blocks.IRON_ORE);
                                 if (var2 == null) {
                                    return var10000;
                                 }

                                 if (!var10000) {
                                    var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_IRON_ORE);
                                    if (var2 == null) {
                                       return var10000;
                                    }

                                    if (!var10000) {
                                       var10000 = Intrinsics.areEqual(var1, Blocks.GOLD_ORE);
                                       if (var2 == null) {
                                          return var10000;
                                       }

                                       if (!var10000) {
                                          var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_GOLD_ORE);
                                          if (var2 == null) {
                                             return var10000;
                                          }

                                          if (!var10000) {
                                             var10000 = Intrinsics.areEqual(var1, Blocks.LAPIS_ORE);
                                             if (var2 == null) {
                                                return var10000;
                                             }

                                             if (!var10000) {
                                                var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_LAPIS_ORE);
                                                if (var2 == null) {
                                                   return var10000;
                                                }

                                                if (!var10000) {
                                                   return false;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   private final boolean c(Block var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      boolean var10000 = Intrinsics.areEqual(var1, Blocks.TERRACOTTA);
      if (var2 != null) {
         if (!var10000) {
            var10000 = Intrinsics.areEqual(var1, Blocks.WHITE_TERRACOTTA);
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Intrinsics.areEqual(var1, Blocks.ORANGE_TERRACOTTA);
               if (var2 == null) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = Intrinsics.areEqual(var1, Blocks.MAGENTA_TERRACOTTA);
                  if (var2 == null) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = Intrinsics.areEqual(var1, Blocks.LIGHT_BLUE_TERRACOTTA);
                     if (var2 == null) {
                        return var10000;
                     }

                     if (!var10000) {
                        var10000 = Intrinsics.areEqual(var1, Blocks.YELLOW_TERRACOTTA);
                        if (var2 == null) {
                           return var10000;
                        }

                        if (!var10000) {
                           var10000 = Intrinsics.areEqual(var1, Blocks.LIME_TERRACOTTA);
                           if (var2 == null) {
                              return var10000;
                           }

                           if (!var10000) {
                              var10000 = Intrinsics.areEqual(var1, Blocks.PINK_TERRACOTTA);
                              if (var2 == null) {
                                 return var10000;
                              }

                              if (!var10000) {
                                 var10000 = Intrinsics.areEqual(var1, Blocks.GRAY_TERRACOTTA);
                                 if (var2 == null) {
                                    return var10000;
                                 }

                                 if (!var10000) {
                                    var10000 = Intrinsics.areEqual(var1, Blocks.LIGHT_GRAY_TERRACOTTA);
                                    if (var2 == null) {
                                       return var10000;
                                    }

                                    if (!var10000) {
                                       var10000 = Intrinsics.areEqual(var1, Blocks.CYAN_TERRACOTTA);
                                       if (var2 == null) {
                                          return var10000;
                                       }

                                       if (!var10000) {
                                          var10000 = Intrinsics.areEqual(var1, Blocks.PURPLE_TERRACOTTA);
                                          if (var2 == null) {
                                             return var10000;
                                          }

                                          if (!var10000) {
                                             var10000 = Intrinsics.areEqual(var1, Blocks.BLUE_TERRACOTTA);
                                             if (var2 == null) {
                                                return var10000;
                                             }

                                             if (!var10000) {
                                                var10000 = Intrinsics.areEqual(var1, Blocks.BROWN_TERRACOTTA);
                                                if (var2 == null) {
                                                   return var10000;
                                                }

                                                if (!var10000) {
                                                   var10000 = Intrinsics.areEqual(var1, Blocks.GREEN_TERRACOTTA);
                                                   if (var2 == null) {
                                                      return var10000;
                                                   }

                                                   if (!var10000) {
                                                      var10000 = Intrinsics.areEqual(var1, Blocks.RED_TERRACOTTA);
                                                      if (var2 == null) {
                                                         return var10000;
                                                      }

                                                      if (!var10000) {
                                                         var10000 = Intrinsics.areEqual(var1, Blocks.BLACK_TERRACOTTA);
                                                         if (var2 == null) {
                                                            return var10000;
                                                         }

                                                         if (!var10000) {
                                                            var10000 = Intrinsics.areEqual(var1, Blocks.CLAY);
                                                            if (var2 == null) {
                                                               return var10000;
                                                            }

                                                            if (!var10000) {
                                                               var10000 = Intrinsics.areEqual(var1, Blocks.COBBLESTONE);
                                                               if (var2 == null) {
                                                                  return var10000;
                                                               }

                                                               if (!var10000) {
                                                                  var10000 = Intrinsics.areEqual(var1, Blocks.GRAY_WOOL);
                                                                  if (var2 == null) {
                                                                     return var10000;
                                                                  }

                                                                  if (!var10000) {
                                                                     var10000 = Intrinsics.areEqual(var1, Blocks.WHITE_WOOL);
                                                                     if (var2 == null) {
                                                                        return var10000;
                                                                     }

                                                                     if (!var10000) {
                                                                        return false;
                                                                     }
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   private final void a(BlockHitResult var1) {
      Direction var10000 = var1.getDirection();
      short var10002 = -497;
      short var10003 = 31049;
      Intrinsics.checkNotNullExpressionValue(var10000, "getDirection(...)");
      Direction var3 = var10000;
      int[] var5 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      BlockPos var10001 = var1.getBlockPos();
      var10003 = -498;
      short var10004 = -32566;
      Intrinsics.checkNotNullExpressionValue(var10001, "getBlockPos(...)");
      BlockPos var4 = var10001;
      int[] var2 = var5;
      int var6 = ((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0);
      if (var2 != null) {
         if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
            return;
         }

         MultiPlayerGameMode var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .gameMode;
         var10002 = -501;
         var10003 = 31227;
         Intrinsics.checkNotNull(var7, "null cannot be cast to non-null type me.octo.client.mixin.accessors.MultiPlayerGameModeProgressAccessor");
         float var13;
         var6 = (var13 = ((MultiPlayerGameModeProgressAccessor)var7).getDestroyProgress() - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      }

      if (var2 != null) {
         var6 = (((var6 == 0) ? 1 : 0));
      }

      if ((var6 == 0)) {
         ClientPacketListener var8 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .getConnection();
         Intrinsics.checkNotNull(var8);
         var8.send(new ServerboundPlayerActionPacket(Action.ABORT_DESTROY_BLOCK, var4, var3));
         LocalPlayer var9 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a()
            .player;
         Intrinsics.checkNotNull(var9);
         var9.swing(InteractionHand.MAIN_HAND);
      }

      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
   }

   private final void b(BlockHitResult var1) {
      Minecraft var8;
      label25: {
         int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         Direction var10001 = var1.getDirection();
         short var10003 = -504;
         short var10004 = 21654;
         Intrinsics.checkNotNullExpressionValue(var10001, "getDirection(...)");
         Direction var3 = var10001;
         BlockPos var11 = var1.getBlockPos();
         var10003 = -506;
         var10004 = 27557;
         Intrinsics.checkNotNullExpressionValue(var11, "getBlockPos(...)");
         BlockPos var4 = var11;
         int[] var2 = var10000;
         boolean var5 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         if (var2 != null) {
            if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
               ClientPacketListener var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a()
                  .getConnection();
               Intrinsics.checkNotNull(var6);
               var6.send(new ServerboundPlayerActionPacket(Action.START_DESTROY_BLOCK, var4, var3));
               LocalPlayer var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a()
                  .player;
               Intrinsics.checkNotNull(var7);
               var7.swing(InteractionHand.MAIN_HAND);
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
            }

            var8 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a();
            if (var2 == null) {
               break label25;
            }

            MultiPlayerGameMode var9 = var8.gameMode;
            Intrinsics.checkNotNull(var8.gameMode);
            var5 = var9.continueDestroyBlock(var4, var3);
         }

         if (!var5) {
            return;
         }

         var8 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a();
      }

      LocalPlayer var10 = var8.player;
      Intrinsics.checkNotNull(var8.player);
      var10.swing(InteractionHand.MAIN_HAND);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "e¢÷Q\u0002~\u0018W±(+@%ü`Uj\rò.\u0005ÆYWÐÄ2\u0014Í(\u0091\u0005¿²ñ~®g*°.)kMQ\u000f\u0006\u0089\u009fü\u0081§ùQÞÞ\u008d\fF\r\u001dé`\u009fIG\u0013(qLÔ>i3|fFM\u0084X¡dDå`0ñë\u008cT\u008eg\u0083¸®r³N7IãT\u0001AYU\u0091M}\t\u0083\u00037±\u0007ÙË\u0011¬\u008fW\u0005\u008b/2Õ\u0092ep\u009bï\u0098Ï mw\u0000\u009d\u001eIÃ\u0017\u008d\u0001ù\u0016%Á¨º\rÚf¨Tøª\u0093Z²e><| \r~'\u0014Ã±\t\u0010ß*\u008bÎÛñ\u0010;`<\u000f~n4ãÖ±{ó¶\u0004ÔM\u0011å\u0094ç\u0097\u0000¦XL¹K*,\u0005qdäê\u00115\u001dý®E\u00958¶`|K\u000eJ_\u008d!×\u0013ÜYÀ/ô\u0087á\u0091\u001a}¢í+î\b_¦¦y\u000f¹¤ 54Ð\u008dIY\u000e$ÿ\u00828ã\u0005Íù¿\u0017g\u000bsÉ.he\u008e4Â\u008a9\u001bMTn/ññr%f\u000eÆäqú¤P\u0083äP2Át>ï%v\u008c\u0010Ë\n\u0098w!¼\u009b«\u0087S\u001b~~±QrKùÅé¢M²gN3\u0014ÿØ»8\u0095\u0094\u0092K\u0002áÓêfÕ¥D\"k^\u0091ÊÓ]\u0010C\u00983\u0010\u009f\u008d\b\u009fQ>\u008b\u0002¨:\u0017\u008a\u000f¨\u0094¿\u0085Ýç\u0004³\t\u0088'ú\rã¤";
      int var4 = "e¢÷Q\u0002~\u0018W±(+@%ü`Uj\rò.\u0005ÆYWÐÄ2\u0014Í(\u0091\u0005¿²ñ~®g*°.)kMQ\u000f\u0006\u0089\u009fü\u0081§ùQÞÞ\u008d\fF\r\u001dé`\u009fIG\u0013(qLÔ>i3|fFM\u0084X¡dDå`0ñë\u008cT\u008eg\u0083¸®r³N7IãT\u0001AYU\u0091M}\t\u0083\u00037±\u0007ÙË\u0011¬\u008fW\u0005\u008b/2Õ\u0092ep\u009bï\u0098Ï mw\u0000\u009d\u001eIÃ\u0017\u008d\u0001ù\u0016%Á¨º\rÚf¨Tøª\u0093Z²e><| \r~'\u0014Ã±\t\u0010ß*\u008bÎÛñ\u0010;`<\u000f~n4ãÖ±{ó¶\u0004ÔM\u0011å\u0094ç\u0097\u0000¦XL¹K*,\u0005qdäê\u00115\u001dý®E\u00958¶`|K\u000eJ_\u008d!×\u0013ÜYÀ/ô\u0087á\u0091\u001a}¢í+î\b_¦¦y\u000f¹¤ 54Ð\u008dIY\u000e$ÿ\u00828ã\u0005Íù¿\u0017g\u000bsÉ.he\u008e4Â\u008a9\u001bMTn/ññr%f\u000eÆäqú¤P\u0083äP2Át>ï%v\u008c\u0010Ë\n\u0098w!¼\u009b«\u0087S\u001b~~±QrKùÅé¢M²gN3\u0014ÿØ»8\u0095\u0094\u0092K\u0002áÓêfÕ¥D\"k^\u0091ÊÓ]\u0010C\u00983\u0010\u009f\u008d\b\u009fQ>\u008b\u0002¨:\u0017\u008a\u000f¨\u0094¿\u0085Ýç\u0004³\t\u0088'ú\rã¤"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 72;
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
                     case 0 -> 102;
                     case 1 -> 101;
                     case 2 -> 41;
                     case 3 -> 101;
                     case 4 -> 11;
                     case 5 -> 7;
                     default -> 89;
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
                     f = var5;
                     g = new String[18];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII();
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

                  var2 = "³eå\u000e\u00942\u0018\u0089À»Ø\u0093\u001aø\u0010\u0006À\u0080,\u0012Òa";
                  var4 = "³eå\u000e\u00942\u0018\u0089À»Ø\u0093\u001aø\u0010\u0006À\u0080,\u0012Òa".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 32;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -504) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 45;
            case 1 -> 251;
            case 2 -> 7;
            case 3 -> 213;
            case 4 -> 145;
            case 5 -> 202;
            case 6 -> 27;
            case 7 -> 11;
            case 8 -> 182;
            case 9 -> 52;
            case 10 -> 188;
            case 11 -> 159;
            case 12 -> 70;
            case 13 -> 174;
            case 14 -> 219;
            case 15 -> 235;
            case 16 -> 43;
            case 17 -> 141;
            case 18 -> 34;
            case 19 -> 166;
            case 20 -> 149;
            case 21 -> 88;
            case 22 -> 3;
            case 23 -> 21;
            case 24 -> 181;
            case 25 -> 244;
            case 26 -> 177;
            case 27 -> 37;
            case 28 -> 196;
            case 29 -> 185;
            case 30 -> 55;
            case 31 -> 238;
            case 32 -> 80;
            case 33 -> 6;
            case 34 -> 13;
            case 35 -> 163;
            case 36 -> 190;
            case 37 -> 225;
            case 38 -> 22;
            case 39 -> 50;
            case 40 -> 154;
            case 41 -> 64;
            case 42 -> 115;
            case 43 -> 5;
            case 44 -> 36;
            case 45 -> 90;
            case 46 -> 162;
            case 47 -> 107;
            case 48 -> 66;
            case 49 -> 140;
            case 50 -> 62;
            case 51 -> 99;
            case 52 -> 208;
            case 53 -> 160;
            case 54 -> 210;
            case 55 -> 167;
            case 56 -> 112;
            case 57 -> 103;
            case 58 -> 176;
            case 59 -> 229;
            case 60 -> 161;
            case 61 -> 117;
            case 62 -> 242;
            case 63 -> 47;
            case 64 -> 18;
            case 65 -> 97;
            case 66 -> 179;
            case 67 -> 211;
            case 68 -> 216;
            case 69 -> 84;
            case 70 -> 39;
            case 71 -> 192;
            case 72 -> 1;
            case 73 -> 14;
            case 74 -> 226;
            case 75 -> 106;
            case 76 -> 87;
            case 77 -> 54;
            case 78 -> 133;
            case 79 -> 168;
            case 80 -> 121;
            case 81 -> 74;
            case 82 -> 151;
            case 83 -> 61;
            case 84 -> 116;
            case 85 -> 130;
            case 86 -> 105;
            case 87 -> 136;
            case 88 -> 173;
            case 89 -> 215;
            case 90 -> 46;
            case 91 -> 231;
            case 92 -> 249;
            case 93 -> 224;
            case 94 -> 237;
            case 95 -> 44;
            case 96 -> 170;
            case 97 -> 195;
            case 98 -> 232;
            case 99 -> 221;
            case 100 -> 123;
            case 101 -> 73;
            case 102 -> 95;
            case 103 -> 72;
            case 104 -> 254;
            case 105 -> 201;
            case 106 -> 109;
            case 107 -> 38;
            case 108 -> 245;
            case 109 -> 155;
            case 110 -> 169;
            case 111 -> 98;
            case 112 -> 76;
            case 113 -> 233;
            case 114 -> 183;
            case 115 -> 135;
            case 116 -> 58;
            case 117 -> 129;
            case 118 -> 75;
            case 119 -> 51;
            case 120 -> 180;
            case 121 -> 184;
            case 122 -> 119;
            case 123 -> 187;
            case 124 -> 240;
            case 125 -> 127;
            case 126 -> 199;
            case 127 -> 60;
            case 128 -> 15;
            case 129 -> 171;
            case 130 -> 8;
            case 131 -> 79;
            case 132 -> 147;
            case 133 -> 234;
            case 134 -> 207;
            case 135 -> 218;
            case 136 -> 94;
            case 137 -> 118;
            case 138 -> 128;
            case 139 -> 217;
            case 140 -> 12;
            case 141 -> 125;
            case 142 -> 9;
            case 143 -> 120;
            case 144 -> 83;
            case 145 -> 204;
            case 146 -> 16;
            case 147 -> 230;
            case 148 -> 4;
            case 149 -> 17;
            case 150 -> 48;
            case 151 -> 89;
            case 152 -> 40;
            case 153 -> 29;
            case 154 -> 248;
            case 155 -> 104;
            case 156 -> 156;
            case 157 -> 113;
            case 158 -> 250;
            case 159 -> 82;
            case 160 -> 41;
            case 161 -> 220;
            case 162 -> 148;
            case 163 -> 35;
            case 164 -> 152;
            case 165 -> 111;
            case 166 -> 252;
            case 167 -> 93;
            case 168 -> 81;
            case 169 -> 31;
            case 170 -> 228;
            case 171 -> 206;
            case 172 -> 236;
            case 173 -> 114;
            case 174 -> 126;
            case 175 -> 144;
            case 176 -> 77;
            case 177 -> 33;
            case 178 -> 10;
            case 179 -> 96;
            case 180 -> 28;
            case 181 -> 212;
            case 182 -> 68;
            case 183 -> 153;
            case 184 -> 143;
            case 185 -> 194;
            case 186 -> 32;
            case 187 -> 178;
            case 188 -> 102;
            case 189 -> 63;
            case 190 -> 247;
            case 191 -> 134;
            case 192 -> 246;
            case 193 -> 0;
            case 194 -> 137;
            case 195 -> 253;
            case 196 -> 19;
            case 197 -> 122;
            case 198 -> 193;
            case 199 -> 198;
            case 200 -> 239;
            case 201 -> 150;
            case 202 -> 26;
            case 203 -> 157;
            case 204 -> 200;
            case 205 -> 23;
            case 206 -> 241;
            case 207 -> 78;
            case 208 -> 65;
            case 209 -> 85;
            case 210 -> 165;
            case 211 -> 86;
            case 212 -> 67;
            case 213 -> 2;
            case 214 -> 203;
            case 215 -> 92;
            case 216 -> 24;
            case 217 -> 205;
            case 218 -> 138;
            case 219 -> 56;
            case 220 -> 164;
            case 221 -> 71;
            case 222 -> 91;
            case 223 -> 139;
            case 224 -> 222;
            case 225 -> 69;
            case 226 -> 158;
            case 227 -> 42;
            case 228 -> 175;
            case 229 -> 49;
            case 230 -> 209;
            case 231 -> 255;
            case 232 -> 197;
            case 233 -> 132;
            case 234 -> 108;
            case 235 -> 100;
            case 236 -> 214;
            case 237 -> 20;
            case 238 -> 25;
            case 239 -> 172;
            case 240 -> 101;
            case 241 -> 59;
            case 242 -> 227;
            case 243 -> 53;
            case 244 -> 30;
            case 245 -> 191;
            case 246 -> 146;
            case 247 -> 223;
            case 248 -> 189;
            case 249 -> 131;
            case 250 -> 142;
            case 251 -> 124;
            case 252 -> 243;
            case 253 -> 186;
            case 254 -> 110;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
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

      @NotNull
      public final IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII a() {
         return IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      }
   }


  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: getstatic + return
  public static final me.octo.client.IlIIllllIllIllllIllIlIIlIllIlllIIIIIIlIIIllllllIIIlIlllIlIllIIIIIlIIlIIllllIllIllIIII ag() { return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; }
}
