package me.octo.client;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
    public static <T> T a(Object p0) { return null; } // PX-FIX ovld2
   @NotNull
   public static IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final ConcurrentHashMap<BlockPos, Block> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final ArrayList<BlockPos> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @Nullable
   private BlockPos IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private Vec3 IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private BlockPos IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] f;
   private static String[] g;

   public IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI() {
      short var10001 = -17459;
      short var10002 = 3342;
      var10002 = -17472;
      short var10003 = 29108;
      short var10004 = -17470;
      short var10005 = -10107;
      super(
         "Powder Chest Aura",
         "Automatically solves powder chests, either by aiming at particles or by right-clicking chests. BLATANT!",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Crystal Hollows",
         new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ConcurrentHashMap<>();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ArrayList<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
   }

   public void af() {
      IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI var2;
      int[] var10000 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      this.a((kotlin.jvm.functions.Function1)null);
      int[] var1 = var10000;
      var2 = this;
      label17:
      if (var1 != null) {
         if (this.ap().player != null) {
            var2 = this;
            if (var1 == null) {
               break label17;
            }

            if (this.ap().level != null) {
               short var3 = -17463;
               short var10001 = 15761;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b("pq extreme");
            }
         }

         var2 = this;
      }

      var2.af();
   }

   @SubscribeEvent
   public final void a(@Nullable IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = null;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      // PX-R1757: rebuilt from javap -c (402 instructions). Scans the 12x12x12 cube around the
      // player for chest blocks, remembers them, then right-clicks the pending target once the
      // 300 ms re-click timer has elapsed.
      try {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
         if (this.ap().player == null) {
            return;
         }
         if (this.ap().level == null) {
            return;
         }
         me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         kotlin.jvm.internal.Intrinsics.checkNotNull(var1);
         if (var1.j() < 20) {
            return;
         }
         net.minecraft.client.player.LocalPlayer var2 = this.ap().player;
         if (var2 == null) {
            return;
         }
         net.minecraft.world.phys.Vec3 var3 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            .a(var2);
         if (var3 == null) {
            return;
         }
         for (int var4 = (int)(var3.x - 6.0); var4 <= (int)(var3.x + 5.0); var4++) {
            for (int var5 = (int)(var3.y - 6.0); var5 <= (int)(var3.y + 5.0); var5++) {
               for (int var6 = (int)(var3.z - 6.0); var6 <= (int)(var3.z + 5.0); var6++) {
                  net.minecraft.core.BlockPos var7 = new net.minecraft.core.BlockPos(var4, var5, var6);
                  net.minecraft.client.multiplayer.ClientLevel var8 = this.ap().level;
                  net.minecraft.world.level.block.state.BlockState var9 = var8 == null ? null : var8.getBlockState(var7);
                  if (var9 != null) {
                     net.minecraft.world.level.block.Block var10 = var9.getBlock();
                     kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10, "getBlock(...)");
                     if (this.a(var10)) {
                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var7, var10);
                     }
                  }
               }
            }
         }
         if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl == null) {
            return;
         }
         if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a((Number)300)) {
            return;
         }
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.f();
         net.minecraft.core.BlockPos var11 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         if (var11 != null) {
            net.minecraft.world.InteractionHand var12 = net.minecraft.world.InteractionHand.MAIN_HAND;
            net.minecraft.world.phys.BlockHitResult var13 = new net.minecraft.world.phys.BlockHitResult(
               new net.minecraft.world.phys.Vec3(var11.getX() + 0.5, var11.getY() + 0.5, var11.getZ() + 0.5),
               net.minecraft.core.Direction.UP,
               var11,
               false
            );
            net.minecraft.client.player.LocalPlayer var14 = this.ap().player;
            if (var14 != null) {
               net.minecraft.world.InteractionResult var15 = this.ap().gameMode == null
                  ? null
                  : this.ap().gameMode.useItemOn(var14, var12, var13);
               if (var15 != null && var15.consumesAction()) {
                  var14.swing(var12);
               }
            }
         }
         if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl);
         }
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      } catch (Exception var16) {
         System.out.println("PowderChestHelper onTick error: " + var16.getMessage());
         var16.printStackTrace();
      }
   }

   @SubscribeEvent
   public final void b(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII event) {
      // PX-R996: reconstructed from javap -c (131 instructions). Redirects the client hit result at
      // the pending chest while the module is active; errors are logged as onPostTick.
      try {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
         if (this.ap().player == null || this.ap().level == null) {
            return;
         }
         if (me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
            return;
         }
         if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().j() >= 20) {
            return;
         }
         if (!me.octo.client.lIIllIlllllIlIIlIlIIIlIlIllIllIIIlIIlIIIIIlllIllIIIllIIlIIllIlIlIIIIlllIlIIlIIlIIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.ae()) {
            return;
         }
         net.minecraft.world.phys.Vec3 var1 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         if (var1 != null) {
            net.minecraft.core.BlockPos var2 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            if (var2 != null) {
               net.minecraft.world.phys.Vec3 var3 = new net.minecraft.world.phys.Vec3(
                  var1.x, this.ap().player.getEyeY(), var1.z);
               this.ap().hitResult = (net.minecraft.world.phys.HitResult) new net.minecraft.world.phys.BlockHitResult(
                  var3, net.minecraft.core.Direction.fromYRot((double) this.ap().player.getYRot()), var2, false);
            }
         }
      } catch (Exception var4) {
         System.out.println("PowderChestHelper onPostTick error: " + var4.getMessage());
         var4.printStackTrace();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI event) {
      // PX-R997: reconstructed from javap -c (281 instructions). Tracks the nearest crit-particle
      // chest: while a pending position exists only its vector is refreshed (0.7 axis tolerance),
      // otherwise a new candidate is validated and stored if the block is a chest and not yet queued.
      try {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
         if (this.ap().player == null || this.ap().level == null) {
            return;
         }
         net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket var1 = event.k();
         if (me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
            return;
         }
         if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().j() >= 20) {
            return;
         }
         if (!kotlin.jvm.internal.Intrinsics.areEqual(var1.getParticle().getType(), net.minecraft.core.particles.ParticleTypes.CRIT)) {
            return;
         }
         net.minecraft.world.phys.Vec3 var2 = new net.minecraft.world.phys.Vec3(var1.getX(), var1.getY(), var1.getZ());
         net.minecraft.core.BlockPos var3 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         if (var3 != null) {
            net.minecraft.world.phys.Vec3 var4 = new net.minecraft.world.phys.Vec3(
               (double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5);
            if (this.ap().player.distanceToSqr(var4) > 64.0) {
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = null;
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
               return;
            }
            if (Math.abs(var4.x - var2.x) >= 0.7) {
               return;
            }
            if (Math.abs(var4.y - var2.y) >= 0.7) {
               return;
            }
            if (Math.abs(var4.z - var2.z) >= 0.7) {
               return;
            }
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var2;
            return;
         }
         if (!me.octo.client.IIlIIIllllIlIllIIIlIllIIllllllIIlIlllIllIIIlIlIlIllIIllIllllIIllIIIlIIIlIlIllIlIllllI.c(var2)) {
            return;
         }
         if (this.ap().player.distanceToSqr(var2) >= 64.0) {
            return;
         }
         net.minecraft.core.BlockPos var4 = me.octo.client.IIlIIIllllIlIllIIIlIllIIllllllIIlIlllIllIIIlIlIlIllIIllIllllIIllIIIlIIIlIlIllIlIllllI.a(var2);
         net.minecraft.world.level.block.state.BlockState var5 = var4 != null ? this.ap().level.getBlockState(var4) : null;
         net.minecraft.world.level.block.Block var6 = var5 != null ? var5.getBlock() : null;
         if (!(var6 instanceof net.minecraft.world.level.block.ChestBlock)) {
            return;
         }
         if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.contains(var4)) {
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var2;
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var4;
         }
      } catch (Exception var7) {
         System.out.println("PowderChestHelper onParticle error: " + var7.getMessage());
         var7.printStackTrace();
      }
   }

   @SubscribeEvent(
      receiveCanceled = true
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll event) {
      // PX-R995: reconstructed from javap -c (115 instructions). Detects the powder-chest unlock
      // message and records the pending chest position for the helper.
      try {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
         if (this.ap().player == null || this.ap().level == null) {
            return;
         }
         if (!(event.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket)) {
            return;
         }
         if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().j() >= 20) {
            return;
         }
         if (!kotlin.text.StringsKt.contains(
            (CharSequence)((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)event.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI).content().getString(),
            (CharSequence)"You have successfully picked the lock on this chest!", false)) {
            return;
         }
         net.minecraft.core.BlockPos var1 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         if (var1 != null) {
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(var1);
         }
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = null;
      } catch (Exception var2) {
         System.out.println("PowderChestHelper onChatMessage error: " + var2.getMessage());
         var2.printStackTrace();
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // PX-R1757: rebuilt from javap -c (447 instructions). While the module holds less than 20
      // queued chests it highlights every chest in the 21x21x21 cube around the player; otherwise
      // it only draws the pending target outline.
      try {
         kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
         if (this.ap().player == null) {
            return;
         }
         if (this.ap().level == null) {
            return;
         }
         if (me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
            return;
         }
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            java.awt.Color.CYAN.getRGB() | -16777216
         );
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            java.awt.Color.GREEN.getRGB() | -16777216
         );
         me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         kotlin.jvm.internal.Intrinsics.checkNotNull(var5);
         if (var5.j() >= 20) {
            for (java.util.Map.Entry var7 : this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.entrySet()) {
               if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl != null) {
                  continue;
               }

               net.minecraft.core.BlockPos var8 = (net.minecraft.core.BlockPos)var7.getKey();
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var8, "<get-key>(...)");
               if (!this.a(var8)) {
                  continue;
               }
               if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.contains(var8)) {
                  continue;
               }

               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var8;
            }

            net.minecraft.client.player.LocalPlayer var9 = this.ap().player;
            if (var9 != null) {
               net.minecraft.world.phys.Vec3 var10 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
                  .a(var9);
               if (var10 != null) {
                  for (int var11 = -10; var11 < 11; var11++) {
                     for (int var12 = -10; var12 < 11; var12++) {
                        for (int var13 = -10; var13 < 11; var13++) {
                           net.minecraft.core.BlockPos var14 = new net.minecraft.core.BlockPos(
                              (int)var10.x + var11,
                              (int)var10.y + var12,
                              (int)var10.z + var13
                           );
                           net.minecraft.client.multiplayer.ClientLevel var15 = this.ap().level;
                           kotlin.jvm.internal.Intrinsics.checkNotNull(var15);
                           net.minecraft.world.level.block.Block var16 = var15.getBlockState(var14).getBlock();
                           if (var16 instanceof ChestBlock && !this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.contains(var14)) {
                              IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                                 new net.minecraft.world.phys.AABB(
                                    (double)var14.getX() + 0.05,
                                    (double)var14.getY(),
                                    (double)var14.getZ() + 0.05,
                                    (double)var14.getX() + 0.95,
                                    (double)var14.getY() + 0.9,
                                    (double)var14.getZ() + 0.95
                                 ),
                                 var3,
                                 null,
                                 0.0F,
                                 null,
                                 null,
                                 0.0F,
                                 false,
                                 0.0F
                              );
                           }
                        }
                     }
                  }
               }
            }

            return;
         }

         if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl != null) {
            net.minecraft.world.phys.Vec3 var17 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
               new net.minecraft.world.phys.AABB(
                  var17.x - 0.1, var17.y - 0.1, var17.z - 0.1,
                  var17.x + 0.1, var17.y + 0.1, var17.z + 0.1
               ),
               var4,
               null,
               0.0F,
               null,
               null,
               0.0F,
               false,
               0.0F
            );
            if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl != null) {
               net.minecraft.core.BlockPos var18 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
               net.minecraft.client.multiplayer.ClientLevel var19 = this.ap().level;
               net.minecraft.world.level.block.Block var20 = var19 == null ? null : var19.getBlockState(var18).getBlock();
               if (!(var20 instanceof ChestBlock)) {
                  this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = null;
                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = null;
               } else {
                  IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                     new net.minecraft.world.phys.AABB(
                        (double)var18.getX() + 0.05,
                        (double)var18.getY(),
                        (double)var18.getZ() + 0.05,
                        (double)var18.getX() + 0.95,
                        (double)var18.getY() + 0.9,
                        (double)var18.getZ() + 0.95
                     ),
                     var3,
                     null,
                     0.0F,
                     null,
                     null,
                     0.0F,
                     false,
                     0.0F
                  );
                  return;
               }
            }
         }
      } catch (Exception var21) {
         System.out.println("PowderChestHelper onRenderWorldLast error: " + var21.getMessage());
         var21.printStackTrace();
      }
   }

   private final boolean a(Block var1) {
      return var1 instanceof ChestBlock;
   }

   private final boolean a(BlockPos param1) {
         boolean var3;
         try {
            var var1 = me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            double var4 = (var1 == null) ? Double.MAX_VALUE
                  : (this.ap().player != null ? this.ap().player.distanceToSqr((double)param1.getX(), (double)param1.getY(), (double)param1.getZ()) : Double.MAX_VALUE);
            double dist = var4 - 36.0d;
            var3 = (var1 == null) ? (dist != 0.0d) : (dist < 0.0d);
         } catch (Throwable var6) {
            var3 = false;
         }
         return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "\u008c£Gù½\t×î[;Ü Ø¼ë'Ã4/;ñîôäâðº£Û\u0019¯\u0095\u0083\u0000ËYø\u008dgÚ·,r\u007f_§¹\u0004sÅ\u0095\u0086Î\u0012\u009e4&\u0004¹ylyÞjq\u008d$'/ÎôQ\u009f\u0019Ý\u0087c\\x¼IPP(\u008e«ç±Q\u0080!ÿÿªÍ÷\bi \u008ch®\u009b\u008aY*¤\u0003\u000f1\f\u000e\u0095\u000bÝ·»mFÛÎæ\u000f@$AK\u007fÔû\u0013µ[Ê\u0007¿]{Æ»n\u0001\u007f\u009b¶áw'bö7p\u0089L`¥ì\u000fÀ\u0019ig\u0011\u009fE\u001c×s\u000e'j»u¾%Vì³\u0096Ù¾ã~|¶ük\u008bäØ®eÅáíA+x\u009b8\u0095Ã>/C\u0089Od6Ò¦\u001aH\u001aÑAy\u0005È×o\u0098P\u0099b4ì\u0015´\u001c'\u009dÔ\u008fÄç+ÃÚ]ð5#ÌX¿\u000eæ8o£\u0094\"B\u0018æe\u009d×¸\u0006\r*Ç\u000b+é\rj\u001cY\náx@cîÑQWþ\\©9\u008e~Adl[\u0010\u0019\u008f0SÚH\u00adh\u0010tR#f\u0084wÍ\u0016È\rEQ-úÛ)¹¡\"f\u001cáR |¯ØH\u000f\u0080+)\u0019IÅ\u00944ÿRI<\u009b<*\u0011â\u00ad\tÁª}®\u0091©ðr\u0005ã.ªH\u0000\u0011h/ZX_\u0082BB6|\u008bÚ_ ×=:\u000e\u0001B\u0084ì\u009c\u001f>ñ\u0002:Ì¬O\u0017$Që}À»\u0091½\u000bË\r\u009f\u001c\u007fî;k\u0011ß\u0099¢¡û.<ËöBôä\u0000°à\u00adAMY";
      int var4 = "\u008c£Gù½\t×î[;Ü Ø¼ë'Ã4/;ñîôäâðº£Û\u0019¯\u0095\u0083\u0000ËYø\u008dgÚ·,r\u007f_§¹\u0004sÅ\u0095\u0086Î\u0012\u009e4&\u0004¹ylyÞjq\u008d$'/ÎôQ\u009f\u0019Ý\u0087c\\x¼IPP(\u008e«ç±Q\u0080!ÿÿªÍ÷\bi \u008ch®\u009b\u008aY*¤\u0003\u000f1\f\u000e\u0095\u000bÝ·»mFÛÎæ\u000f@$AK\u007fÔû\u0013µ[Ê\u0007¿]{Æ»n\u0001\u007f\u009b¶áw'bö7p\u0089L`¥ì\u000fÀ\u0019ig\u0011\u009fE\u001c×s\u000e'j»u¾%Vì³\u0096Ù¾ã~|¶ük\u008bäØ®eÅáíA+x\u009b8\u0095Ã>/C\u0089Od6Ò¦\u001aH\u001aÑAy\u0005È×o\u0098P\u0099b4ì\u0015´\u001c'\u009dÔ\u008fÄç+ÃÚ]ð5#ÌX¿\u000eæ8o£\u0094\"B\u0018æe\u009d×¸\u0006\r*Ç\u000b+é\rj\u001cY\náx@cîÑQWþ\\©9\u008e~Adl[\u0010\u0019\u008f0SÚH\u00adh\u0010tR#f\u0084wÍ\u0016È\rEQ-úÛ)¹¡\"f\u001cáR |¯ØH\u000f\u0080+)\u0019IÅ\u00944ÿRI<\u009b<*\u0011â\u00ad\tÁª}®\u0091©ðr\u0005ã.ªH\u0000\u0011h/ZX_\u0082BB6|\u008bÚ_ ×=:\u000e\u0001B\u0084ì\u009c\u001f>ñ\u0002:Ì¬O\u0017$Që}À»\u0091½\u000bË\r\u009f\u001c\u007fî;k\u0011ß\u0099¢¡û.<ËöBôä\u0000°à\u00adAMY"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 92;
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
                     case 0 -> 55;
                     case 1 -> 78;
                     case 2 -> 75;
                     case 3 -> 69;
                     case 4 -> 86;
                     case 5 -> 108;
                     default -> 93;
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
                     g = new String[16];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI();
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

                  var2 = "ô{¸\rÒZ*×÷¨£]\u0001\u008a\n\u001d\u0019$á\u00931\u0094wR\u009b";
                  var4 = "ô{¸\rÒZ*×÷¨£]\u0001\u008a\n\u001d\u0019$á\u00931\u0094wR\u009b".length();
                  var1 = 14;
                  var8 = -1;
            }

            var10000 = 50;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -17466) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 87;
            case 1 -> 152;
            case 2 -> 11;
            case 3 -> 187;
            case 4 -> 97;
            case 5 -> 52;
            case 6 -> 242;
            case 7 -> 148;
            case 8 -> 249;
            case 9 -> 30;
            case 10 -> 161;
            case 11 -> 18;
            case 12 -> 225;
            case 13 -> 156;
            case 14 -> 8;
            case 15 -> 44;
            case 16 -> 28;
            case 17 -> 49;
            case 18 -> 82;
            case 19 -> 136;
            case 20 -> 22;
            case 21 -> 62;
            case 22 -> 89;
            case 23 -> 122;
            case 24 -> 41;
            case 25 -> 145;
            case 26 -> 238;
            case 27 -> 1;
            case 28 -> 163;
            case 29 -> 69;
            case 30 -> 175;
            case 31 -> 209;
            case 32 -> 252;
            case 33 -> 227;
            case 34 -> 169;
            case 35 -> 204;
            case 36 -> 53;
            case 37 -> 231;
            case 38 -> 220;
            case 39 -> 196;
            case 40 -> 133;
            case 41 -> 86;
            case 42 -> 120;
            case 43 -> 138;
            case 44 -> 168;
            case 45 -> 200;
            case 46 -> 105;
            case 47 -> 201;
            case 48 -> 237;
            case 49 -> 19;
            case 50 -> 7;
            case 51 -> 48;
            case 52 -> 203;
            case 53 -> 54;
            case 54 -> 197;
            case 55 -> 146;
            case 56 -> 240;
            case 57 -> 166;
            case 58 -> 101;
            case 59 -> 183;
            case 60 -> 58;
            case 61 -> 158;
            case 62 -> 59;
            case 63 -> 12;
            case 64 -> 32;
            case 65 -> 245;
            case 66 -> 132;
            case 67 -> 190;
            case 68 -> 250;
            case 69 -> 9;
            case 70 -> 157;
            case 71 -> 160;
            case 72 -> 135;
            case 73 -> 78;
            case 74 -> 36;
            case 75 -> 45;
            case 76 -> 76;
            case 77 -> 85;
            case 78 -> 229;
            case 79 -> 179;
            case 80 -> 116;
            case 81 -> 50;
            case 82 -> 106;
            case 83 -> 211;
            case 84 -> 248;
            case 85 -> 51;
            case 86 -> 0;
            case 87 -> 55;
            case 88 -> 206;
            case 89 -> 174;
            case 90 -> 108;
            case 91 -> 92;
            case 92 -> 224;
            case 93 -> 184;
            case 94 -> 104;
            case 95 -> 66;
            case 96 -> 46;
            case 97 -> 118;
            case 98 -> 233;
            case 99 -> 199;
            case 100 -> 181;
            case 101 -> 178;
            case 102 -> 17;
            case 103 -> 80;
            case 104 -> 25;
            case 105 -> 90;
            case 106 -> 230;
            case 107 -> 65;
            case 108 -> 124;
            case 109 -> 16;
            case 110 -> 244;
            case 111 -> 142;
            case 112 -> 63;
            case 113 -> 39;
            case 114 -> 37;
            case 115 -> 40;
            case 116 -> 94;
            case 117 -> 111;
            case 118 -> 96;
            case 119 -> 171;
            case 120 -> 182;
            case 121 -> 153;
            case 122 -> 121;
            case 123 -> 216;
            case 124 -> 151;
            case 125 -> 202;
            case 126 -> 212;
            case 127 -> 143;
            case 128 -> 147;
            case 129 -> 226;
            case 130 -> 170;
            case 131 -> 115;
            case 132 -> 144;
            case 133 -> 159;
            case 134 -> 26;
            case 135 -> 42;
            case 136 -> 114;
            case 137 -> 194;
            case 138 -> 246;
            case 139 -> 129;
            case 140 -> 4;
            case 141 -> 165;
            case 142 -> 164;
            case 143 -> 253;
            case 144 -> 14;
            case 145 -> 195;
            case 146 -> 67;
            case 147 -> 198;
            case 148 -> 219;
            case 149 -> 73;
            case 150 -> 71;
            case 151 -> 91;
            case 152 -> 95;
            case 153 -> 6;
            case 154 -> 107;
            case 155 -> 74;
            case 156 -> 173;
            case 157 -> 3;
            case 158 -> 189;
            case 159 -> 210;
            case 160 -> 60;
            case 161 -> 110;
            case 162 -> 141;
            case 163 -> 208;
            case 164 -> 214;
            case 165 -> 247;
            case 166 -> 79;
            case 167 -> 130;
            case 168 -> 167;
            case 169 -> 149;
            case 170 -> 35;
            case 171 -> 5;
            case 172 -> 185;
            case 173 -> 131;
            case 174 -> 24;
            case 175 -> 61;
            case 176 -> 72;
            case 177 -> 207;
            case 178 -> 154;
            case 179 -> 57;
            case 180 -> 188;
            case 181 -> 77;
            case 182 -> 109;
            case 183 -> 177;
            case 184 -> 191;
            case 185 -> 75;
            case 186 -> 180;
            case 187 -> 162;
            case 188 -> 99;
            case 189 -> 29;
            case 190 -> 34;
            case 191 -> 127;
            case 192 -> 172;
            case 193 -> 117;
            case 194 -> 125;
            case 195 -> 103;
            case 196 -> 241;
            case 197 -> 64;
            case 198 -> 254;
            case 199 -> 70;
            case 200 -> 150;
            case 201 -> 134;
            case 202 -> 243;
            case 203 -> 213;
            case 204 -> 192;
            case 205 -> 31;
            case 206 -> 217;
            case 207 -> 251;
            case 208 -> 113;
            case 209 -> 155;
            case 210 -> 83;
            case 211 -> 232;
            case 212 -> 13;
            case 213 -> 10;
            case 214 -> 27;
            case 215 -> 123;
            case 216 -> 128;
            case 217 -> 68;
            case 218 -> 176;
            case 219 -> 100;
            case 220 -> 221;
            case 221 -> 137;
            case 222 -> 234;
            case 223 -> 98;
            case 224 -> 15;
            case 225 -> 33;
            case 226 -> 126;
            case 227 -> 20;
            case 228 -> 140;
            case 229 -> 218;
            case 230 -> 255;
            case 231 -> 222;
            case 232 -> 223;
            case 233 -> 193;
            case 234 -> 38;
            case 235 -> 93;
            case 236 -> 186;
            case 237 -> 236;
            case 238 -> 102;
            case 239 -> 21;
            case 240 -> 205;
            case 241 -> 43;
            case 242 -> 88;
            case 243 -> 139;
            case 244 -> 2;
            case 245 -> 81;
            case 246 -> 84;
            case 247 -> 23;
            case 248 -> 235;
            case 249 -> 215;
            case 250 -> 56;
            case 251 -> 228;
            case 252 -> 119;
            case 253 -> 47;
            case 254 -> 239;
            default -> 112;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI a() {
         return IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
    public static final me.octo.client.IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI ag() {
        return me.octo.client.IlIIIllIlllIIIIlllIlIIIlIIlllIIIlllIlIllIIIllllllIlIIlIIlIllIlIlIlIlIlllIIllIIIlIIllI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
    }
}
