package me.octo.client.utils.player;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundOpenScreenPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.PositionMoveRotation;
import net.minecraft.world.entity.Relative;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Vec3 IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] c;
   private static String[] d;

   private IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll() {
   }

   @NotNull
   public static final Vec3 g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI i() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI j() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI k() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI l() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 19271;
      byte var10003 = 54;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var3 = m();
      if (var2 != null) {
         if (!var3) {
            return;
         }

         LocalPlayer var4 = this.a().player;
         Intrinsics.checkNotNull(var4);
         var3 = var4.isInLiquid();
      }

      if (var2 != null) {
         if (var3) {
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f();
         }

         LocalPlayer var5 = this.a().player;
         Intrinsics.checkNotNull(var5);
         var3 = var5.onGround();
      }

      if (var2 != null) {
         if (var3) {
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.f();
         }

         LocalPlayer var6 = this.a().player;
         Intrinsics.checkNotNull(var6);
         var3 = var6.horizontalCollision;
      }

      if (!var3) {
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.f();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      short var10001 = 19266;
      short var10002 = -13853;
      Intrinsics.checkNotNullParameter(var1, "event");
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      short var10001 = 19271;
      byte var10002 = 54;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var4 = var3 instanceof ClientboundOpenScreenPacket;
      if (var2 != null) {
         if (!var4) {
            return;
         }

         var4 = true;
      }

      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var4;
   }

   @JvmStatic
   public static final boolean m() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Minecraft var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a();
      if (var0 != null) {
         if (var10000.player == null) {
            return false;
         }

         var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a();
      }

      return var10000.level != null;
   }

   @JvmStatic
   public static final boolean n() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      boolean var10000 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      if (var0 != null) {
         if (!lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            Screen var2 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().screen;
            if (var2 == null) {
               return false;
            }

            Screen var1 = var2;
            var10000 = var1 instanceof ChatScreen;
            if (var0 != null) {
               var10000 = !var10000;
            }

            return var10000;
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
         var10000 = true;
      }

      return var10000;
   }

   @NotNull
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI o() {
      LocalPlayer var10002 = this.a().player;
      Intrinsics.checkNotNull(var10002);
      float var1 = var10002.getYRot();
      LocalPlayer var10003 = this.a().player;
      Intrinsics.checkNotNull(var10003);
      return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var1, var10003.getXRot());
   }

   public final boolean p() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      double var4;
      int var2 = (var4 = Math.abs(var10000.getDeltaMovement().x) - 0.01) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
      if (var1 != null) {
         if (var2 >= 0) {
            return (0 != 0);
         }

         var10000 = this.a().player;
         Intrinsics.checkNotNull(var10000);
         double var5;
         var2 = (var5 = Math.abs(var10000.getDeltaMovement().z) - 0.01) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
      }

      if (var1 == null) {
         return (var2 != 0);
      } else {
         return (var2 < 0);
      }
   }

   @NotNull
   public final BlockPos q() {
      LocalPlayer var10002 = this.a().player;
      Intrinsics.checkNotNull(var10002);
      int var1 = (int)Math.floor(var10002.getX());
      LocalPlayer var10003 = this.a().player;
      Intrinsics.checkNotNull(var10003);
      int var2 = (int)Math.floor(var10003.getY());
      LocalPlayer var10004 = this.a().player;
      Intrinsics.checkNotNull(var10004);
      return new BlockPos(var1, var2, (int)Math.floor(var10004.getZ()));
   }

   @NotNull
   public final BlockPos r() {
      LocalPlayer var10002 = this.a().player;
      Intrinsics.checkNotNull(var10002);
      int var1 = (int)var10002.getX();
      LocalPlayer var10003 = this.a().player;
      Intrinsics.checkNotNull(var10003);
      int var2 = (int)(var10003.getY() + x());
      LocalPlayer var10004 = this.a().player;
      Intrinsics.checkNotNull(var10004);
      return new BlockPos(var1, var2, (int)var10004.getZ());
   }

   @NotNull
   public final BlockPos s() {
      LocalPlayer var10002 = this.a().player;
      Intrinsics.checkNotNull(var10002);
      int var1 = (int)Math.floor(var10002.getX());
      LocalPlayer var10003 = this.a().player;
      Intrinsics.checkNotNull(var10003);
      int var2 = (int)Math.floor(var10003.getY() - 0.01);
      LocalPlayer var10004 = this.a().player;
      Intrinsics.checkNotNull(var10004);
      return new BlockPos(var1, var2, (int)Math.floor(var10004.getZ()));
   }

   @NotNull
   public final BlockPos t() {
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      double var1 = var10000.getX();
      LocalPlayer var10001 = this.a().player;
      Intrinsics.checkNotNull(var10001);
      double var3 = var10001.getY() - 0.5;
      LocalPlayer var10002 = this.a().player;
      Intrinsics.checkNotNull(var10002);
      BlockPos var2 = BlockPos.containing(var1, var3, var10002.getZ());
      short var4 = 19270;
      short var10003 = -7673;
      Intrinsics.checkNotNullExpressionValue(var2, "containing(...)");
      return var2;
   }

   @JvmStatic
   @NotNull
   public static final Vec3 u() {
      LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      if (var10000 == null) {
         Vec3 var7 = Vec3.ZERO;
         short var10002 = 19289;
         short var10003 = -12192;
         Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
         return var7;
      } else {
         LocalPlayer var0 = var10000;
         double var1 = Mth.lerp(1.0, var0.xo, var0.getX());
         double var3 = Mth.lerp(1.0, var0.yo, var0.getY()) + x();
         double var5 = Mth.lerp(1.0, var0.zo, var0.getZ());
         return new Vec3(var1, var3, var5);
      }
   }

   @JvmStatic
   @NotNull
   public static final Vec3 v() {
      LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      if (var10000 == null) {
         Vec3 var7 = Vec3.ZERO;
         short var10002 = 19293;
         short var10003 = -9463;
         Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
         return var7;
      } else {
         LocalPlayer var0 = var10000;
         double var1 = Mth.lerp(1.0, var0.xo, var0.getX());
         double var3 = Mth.lerp(1.0, var0.yo, var0.getY()) + y();
         double var5 = Mth.lerp(1.0, var0.zo, var0.getZ());
         return new Vec3(var1, var3, var5);
      }
   }

   @JvmStatic
   @NotNull
   public static final Vec3 w() {
      LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      Intrinsics.checkNotNull(var10000);
      return IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10000);
   }

   @JvmStatic
   public static final float x() {
      LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      Intrinsics.checkNotNull(var10000);
      return var10000.isShiftKeyDown() ? 1.27F : 1.62F;
   }

   @JvmStatic
   public static final float y() {
      LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      Intrinsics.checkNotNull(var10000);
      return var10000.isShiftKeyDown() ? 1.54F : 1.62F;
   }

   @JvmStatic
   public static final double z() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      Intrinsics.checkNotNull(var10000);
      boolean var1 = var10000.isShiftKeyDown();
      if (var0 != null) {
         if (var1) {
            return B();
         }

         short var10001 = 19284;
         short var10002 = -6108;
         var1 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("sneak");
      }

      return !var1 ? 1.62 : B();
   }

   @JvmStatic
   @NotNull
   public static final Vec3 A() {
      LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      if (var10000 == null) {
         Vec3 var2 = Vec3.ZERO;
         short var3 = 19289;
         short var4 = -12192;
         Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
         return var2;
      } else {
         LocalPlayer var0 = var10000;
         Vec3 var1 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var0).add(0.0, z(), 0.0);
         short var10002 = 19283;
         short var10003 = 27557;
         Intrinsics.checkNotNullExpressionValue(var1, "add(...)");
         return var1;
      }
   }

   @JvmStatic
   public static final double B() {
      return 1.27;
   }

   public final boolean a(@NotNull String var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 19265;
      short var10003 = -26329;
      Intrinsics.checkNotNullParameter(var1, "displayName");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var3 = this.a().screen instanceof ContainerScreen;
      if (var2 != null) {
         if (!var3) {
            return false;
         }

         LocalPlayer var4 = this.a().player;
         Intrinsics.checkNotNull(var4);
         var3 = var4.containerMenu instanceof ChestMenu;
      }

      if (var2 != null) {
         if (!var3) {
            return false;
         }

         Screen var10001 = this.a().screen;
         var10003 = 19282;
         short var10004 = 655;
         Intrinsics.checkNotNull(var10001, "null cannot be cast to non-null type net.minecraft.client.gui.screens.inventory.ContainerScreen");
         String var5 = ((ContainerScreen)var10001).getTitle().getString();
         var10003 = 19276;
         var10004 = 23918;
         Intrinsics.checkNotNullExpressionValue(var5, "getString(...)");
         var3 = Intrinsics.areEqual(var1, StringsKt.trim(var5).toString());
      }

      return var2 == null ? var3 : var3;
   }

   public final boolean C() {
      return this.a().screen != null;
   }

   public final float D() {
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      float var1 = var10000.getYRot();
      float var2 = MathKt.roundToInt(var1 / 90.0F) * 90.0F;
      short var10001 = 19295;
      short var10002 = -6743;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("yaw: " + var2);
      return var2;
   }

   public final boolean E() { BlockPos var9 = null; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      LocalPlayer var10001 = this.a().player;
      Intrinsics.checkNotNull(var10001);
      double var2 = Math.toRadians(var10001.getYRot());
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      int var4 = (int)(-Math.sin(var2));
      int var5 = (int)Math.cos(var2);
      LocalPlayer var8 = this.a().player;
      Intrinsics.checkNotNull(var8);
       var9 = var8.blockPosition().offset(var4, 0, var5);
      short var10002 = 19286;
      short var10003 = -23959;
      Intrinsics.checkNotNullExpressionValue(var9, "offset(...)");
      BlockPos var6 = var9;
      ClientLevel var10 = this.a().level;
      Intrinsics.checkNotNull(var10);
      Block var11 = var10.getBlockState(var6).getBlock();
      var10002 = 19269;
      var10003 = -11683;
      Intrinsics.checkNotNullExpressionValue(var11, "getBlock(...)");
      Block var7 = var11;
      boolean var12 = Intrinsics.areEqual(var7, Blocks.AIR);
      if (var1 != null) {
         if (var12) {
            return false;
         }

         var12 = Intrinsics.areEqual(var7, Blocks.WATER);
      }

      return var1 == null ? var12 : !var12;
   }

   public final boolean F() { ClientLevel var9 = null; // PX-FIX hoist
        
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      double var2 = Math.toRadians(var10000.getYRot());
      int var4 = (int)(-Math.cos(var2));
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      int var5 = (int)Math.sin(var2);
      LocalPlayer var10001 = this.a().player;
      Intrinsics.checkNotNull(var10001);
      BlockPos var12 = var10001.blockPosition().offset(var4, 0, var5);
      short var10003 = 19286;
      short var10004 = -23959;
      Intrinsics.checkNotNullExpressionValue(var12, "offset(...)");
      BlockPos var6 = var12;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var8;
       var9 = this.a().level;
      Intrinsics.checkNotNull(var9);
      Block var10 = var9.getBlockState(var6).getBlock();
      short var10002 = 19269;
      var10003 = -11683;
      Intrinsics.checkNotNullExpressionValue(var10, "getBlock(...)");
      Block var7 = var10;
      boolean var11 = Intrinsics.areEqual(var7, Blocks.AIR);
      if (var1 != null) {
         if (var11) {
            return false;
         }

         var11 = Intrinsics.areEqual(var7, Blocks.WATER);
      }

      return var1 == null ? var11 : !var11;
   }

   public final boolean G() {
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      double var2 = Math.toRadians(var10000.getYRot());
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      int var4 = (int)Math.cos(var2);
      int var5 = (int)(-Math.sin(var2));
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var8;
      var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      BlockPos var10 = var10000.blockPosition().offset(var4, 0, var5);
      short var10002 = 19281;
      short var10003 = 6767;
      Intrinsics.checkNotNullExpressionValue(var10, "offset(...)");
      BlockPos var6 = var10;
      ClientLevel var11 = this.a().level;
      Intrinsics.checkNotNull(var11);
      Block var12 = var11.getBlockState(var6).getBlock();
      var10002 = 19294;
      var10003 = -12501;
      Intrinsics.checkNotNullExpressionValue(var12, "getBlock(...)");
      Block var7 = var12;
      boolean var13 = Intrinsics.areEqual(var7, Blocks.AIR);
      if (var1 != null) {
         if (var13) {
            return false;
         }

         var13 = Intrinsics.areEqual(var7, Blocks.WATER);
      }

      return var1 == null ? var13 : !var13;
   }

   @Nullable
   public final EntityHitResult H() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      HitResult var2 = this.a().hitResult;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      HitResult var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return null;
         }

         var3 = var2;
      }

      if (var1 == null) {
         return (EntityHitResult)var3;
      } else {
         return var3.getType() == Type.ENTITY ? (EntityHitResult)var2 : null;
      }
   }

   @Nullable
   public final BlockHitResult I() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      HitResult var2 = this.a().hitResult;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      HitResult var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return null;
         }

         var3 = var2;
      }

      if (var1 == null) {
         return (BlockHitResult)var3;
      } else {
         return var3.getType() == Type.BLOCK ? (BlockHitResult)var2 : null;
      }
   }

   public final boolean J() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      HitResult var2 = this.a().hitResult;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      HitResult var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return false;
         }

         var3 = var2;
      }

      return var3.getType() == Type.MISS;
   }

   public final boolean a(@NotNull BlockPos var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 19267;
      short var10003 = -11520;
      Intrinsics.checkNotNullParameter(var1, "pos");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      BlockHitResult var3 = this.I();
      BlockHitResult var4 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return false;
         }

         var4 = var3;
      }

      boolean var5 = Intrinsics.areEqual(var4.getLocation(), var1);
      return var2 == null ? var5 : var5;
   }

   public final int K() {
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      return var10000.getInventory().getSelectedSlot();
   }

   @NotNull
   public final ItemStack L() {
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      ItemStack var1 = var10000.getMainHandItem();
      short var10002 = 19280;
      short var10003 = -12096;
      Intrinsics.checkNotNullExpressionValue(var1, "getMainHandItem(...)");
      return var1;
   }

   public final boolean b(int var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      int var10000 = this.K();
      if (var2 != null) {
         var10000 = var10000 == var1 ? 1 : 0;
      }

      int var3 = var10000;
      var10000 = var3;
      if (var2 != null) {
         if (var3 != 0) {
            return (var3 != 0);
         }

         var10000 = (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.a(Integer.valueOf(100)) ? 1 : 0);
      }

      if (var2 != null) {
         if (var10000 == 0) {
            return (var3 != 0);
         }

         var10000 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
            .a(Integer.valueOf(100)) ? 1 : 0;
      }

      if (var2 == null) {
         return (var10000 != 0);
      } else if (var10000 != 0) {
         LocalPlayer var5 = this.a().player;
         Intrinsics.checkNotNull(var5);
         var5.getInventory().setSelectedSlot(var1);
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.f();
         return (1 != 0);
      } else {
         return (var3 != 0);
      }
   }

   public final boolean M() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         ItemStack var10000 = this.L();
         if (var10000 != null) {
            ItemStack var2 = var10000;
            if (var1 != null) {
               Item var4 = var2.getItem();
               if (var4 != null) {
                  Item var3 = var4;
                  boolean var5 = Intrinsics.areEqual(var3, Items.DIAMOND_SHOVEL);
                  if (var1 != null) {
                     if (!var5) {
                        boolean var6 = Intrinsics.areEqual(var3, Items.DIAMOND_SWORD);
                        if (var1 == null) {
                           return var6;
                        }

                        if (!var6) {
                           return false;
                        }
                     }

                     var5 = true;
                  }

                  return var5;
               }
            }

            return false;
         }
      }

      return false;
   }

   public final boolean N() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         ItemStack var10000 = this.L();
         if (var10000 != null) {
            ItemStack var2 = var10000;
            Component var3 = var2.getCustomName();
            if (var1 != null) {
               if (var3 == null) {
                  return false;
               }

               var3 = var2.getHoverName();
            }

            String var4 = var3.getString();
            short var10002 = 19291;
            short var10003 = 7169;
            Intrinsics.checkNotNullExpressionValue(var4, "getString(...)");
            CharSequence var5 = var4;
            short var10001 = 19274;
            var10002 = 11387;
            boolean var6 = StringsKt.contains(var5, "Etherwarp Conduit", false);
            if (var1 == null) {
               return var6;
            }

            if (var6) {
               return true;
            }

            return false;
         }
      }

      return false;
   }

   @Nullable
   public final BlockPos O() { BlockPos var9 = null; // PX-FIX hoist
        
      BlockState var20 = null; // PX-FIX
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      LocalPlayer var2 = var10000;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var12 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      AABB var10001 = var2.getBoundingBox();
      short var10003 = 19264;
      short var10004 = -7248;
      Intrinsics.checkNotNullExpressionValue(var10001, "getBoundingBox(...)");
      AABB var3 = var10001;
      var10001 = var3.inflate(0.1, 0.0, 0.1);
      var10003 = 19273;
      var10004 = 10970;
      Intrinsics.checkNotNullExpressionValue(var10001, "inflate(...)");
      AABB var4 = var10001;
      ClientLevel var22 = this.a().level;
      Intrinsics.checkNotNull(var22);
      Iterable var23 = var22.getBlockCollisions(var2, var4);
      var10003 = 19268;
      var10004 = -30965;
      Intrinsics.checkNotNullExpressionValue(var23, "getBlockCollisions(...)");
      Iterable var5 = var23;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var12;
      Iterator var6 = var5.iterator();

      label51:
      while (true) {
         int var13 = ((var6.hasNext()) ? 1 : 0);

         while (var13 != 0) {
            var10000 = (LocalPlayer)var6.next();
            short var10002 = 19277;
            var10003 = 4215;
            Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
            VoxelShape var7 = (VoxelShape)(Object)var10000;
            AABB var15 = var7.bounds();
            var10002 = 19292;
            var10003 = 31904;
            Intrinsics.checkNotNullExpressionValue(var15, "bounds(...)");
            AABB var8 = var15;
            BlockPos var16 = BlockPos.containing(var8.minX + 0.01, var8.minY + 0.01, var8.minZ + 0.01);
            var10002 = 19270;
            var10003 = -7673;
            Intrinsics.checkNotNullExpressionValue(var16, "containing(...)");
             var9 = var16;
            ClientLevel var17 = this.a().level;
            Intrinsics.checkNotNull(var17);
            BlockState var18 = var17.getBlockState(var9);
            var10002 = 19288;
            var10003 = -3301;
            Intrinsics.checkNotNullExpressionValue(var18, "getBlockState(...)");
            BlockState var10 = var18;
            Block var19 = var10.getBlock();
            var10002 = 19269;
            var10003 = -11683;
            Intrinsics.checkNotNullExpressionValue(var19, "getBlock(...)");
            Block var11 = var19;
            var13 = ((var10.is(Blocks.LADDER)) ? 1 : 0);
            if (var1 != null) {
               if (var13 != 0) {
                  continue label51;
               }

               var13 = ((var11 instanceof StairBlock) ? 1 : 0);
            }

            if (var1 != null) {
               label42: {
                  if (var13 != 0) {
                     var20 = var10;
                     if (var1 == null) {
                        break label42;
                     }

                     if (var10.getValue(StairBlock.HALF) != Half.TOP) {
                        continue label51;
                     }
                  }

                  var20 = var10;
               }

               var13 = ((var20.isAir()) ? 1 : 0);
            }

            if (var1 != null) {
               if (var13 != 0) {
                  continue label51;
               }

               double var37;
               var13 = (var37 = var8.maxY - var2.getY() - 0.5) == 0.0 ? 0 : (var37 < 0.0 ? -1 : 1);
            }

            if (var1 != null) {
               if (var13 > 0) {
                  return var9;
               }
               continue label51;
            }
         }

         return null;
      }
   }

   public final boolean c(int var1) {
       boolean var9 = false; // PX-FIX decl var9
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      Object var3 = null;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .l();
         if (var8 != null) {
            var3 = var8;
            int var4 = 0;

            while (true) {
               if (var4 < var1) {
                  var9 = false;
                  if (var2 == null) {
                     break;
                  }

                  label51: {
                     boolean var6 = false;
                     me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     if (var2 != null) {
                        me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(
                           me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                           1.0,
                           0.0,
                           (me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3,
                           false,
                           0.0);
                        if (var11 == null) {
                           break label51;
                        }

                        var3 = var11;
                        var10 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     }

                     boolean var12 = var10.k();
                     if (var2 == null) {
                        return var12;
                     }

                     if (var12) {
                        return true;
                     }
                  }

                  var4++;
                  if (var2 != null) {
                     continue;
                  }
               }

               var9 = false;
               break;
            }

            return var9;
         }
      }

      return false;
   }

   public final boolean P() {
      int var32 = 0; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            if (var1 != null) {
               ClientLevel var26 = this.a().level;
               if (var26 != null) {
                  ClientLevel var3;
                  label174: {
                     var3 = var26;
                     BlockPos var27 = BlockPos.containing(var2.getX(), var2.getY() - 0.1, var2.getZ());
                     short var10002 = 19290;
                     short var10003 = 18864;
                     Intrinsics.checkNotNullExpressionValue(var27, "containing(...)");
                     BlockPos var4 = var27;
                     BlockState var28 = var3.getBlockState(var4);
                     var10002 = 19279;
                     var10003 = -29428;
                     Intrinsics.checkNotNullExpressionValue(var28, "getBlockState(...)");
                     BlockState var5 = var28;
                     VoxelShape var29 = var5.getShape(var3, var4);
                     var10002 = 19272;
                     var10003 = -21507;
                     Intrinsics.checkNotNullExpressionValue(var29, "getShape(...)");
                     VoxelShape var6 = var29;
                     int var30 = ((var5.isAir()) ? 1 : 0);
                     if (var1 != null) {
                        if ((var30 != 0)) {
                           break label174;
                        }

                        var30 = ((var6.isEmpty()) ? 1 : 0);
                     }

                     if (var1 != null) {
                        if ((var30 != 0)) {
                           break label174;
                        }

                        double var46;
                        var30 = (var46 = var6.bounds().maxY - 1.0) == 0.0 ? 0 : (var46 < 0.0 ? -1 : 1);
                     }

                     if (var1 != null) {
                        var30 = (((var30 == 0) ? 1 : 0));
                     }

                     if ((var30 != 0)) {
                        return false;
                     }
                  }

                  AABB var31 = var2.getBoundingBox().inflate(0.1, 0.1, 0.1);
                  short var38 = 19287;
                  short var43 = 14380;
                  Intrinsics.checkNotNullExpressionValue(var31, "inflate(...)");
                  AABB var7 = var31;
                  double var8 = 0.15;
                  int var10 = (int)Math.floor(var7.minX);
                  int var11 = (int)Math.ceil(var7.maxX);
                  int var12 = (int)Math.floor(var7.minY);
                  int var13 = (int)Math.floor(var7.maxY);
                  int var14 = (int)Math.floor(var7.minZ);
                  int var15 = (int)Math.ceil(var7.maxZ);
                  int var16 = var10;
                  if (var1 != null) {
                     if (var10 <= var11) {
                        do {
                           int var10001;
                           label187: {
                              int var17 = var12;
                              if (var12 <= var13) {
                                 do {
                                    int var18 = var14;
                                    var32 = var14;
                                    var10001 = var15;
                                    if (var1 == null) {
                                       break label187;
                                    }

                                    label140: {
                                       label188: {
                                          if (var14 <= var15) {
                                             do {
                                                BlockPos var19 = new BlockPos(var16, var17, var18);
                                                BlockState var33 = var3.getBlockState(var19);
                                                var38 = 19288;
                                                var43 = -3301;
                                                Intrinsics.checkNotNullExpressionValue(var33, "getBlockState(...)");
                                                BlockState var20 = var33;
                                                VoxelShape var34 = var20.getShape(var3, var19);
                                                var38 = 19278;
                                                var43 = -32508;
                                                Intrinsics.checkNotNullExpressionValue(var34, "getShape(...)");
                                                VoxelShape var21 = var34;
                                                var32 = ((var20.isAir()) ? 1 : 0);
                                                if (var1 == null) {
                                                   break label188;
                                                }

                                                label134: {
                                                   label133:
                                                   if ((var32 != 0)) {
                                                      var32 = ((var21.isEmpty()) ? 1 : 0);
                                                      if (var1 == null) {
                                                         break label134;
                                                      }

                                                      label181: {
                                                         if (var1 != null) {
                                                            if ((var32 == 0)) {
                                                               break label181;
                                                            }

                                                            double var47;
                                                            var32 = (var47 = var21.bounds().maxY - 1.0) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
                                                         }

                                                         if (var1 != null) {
                                                            var32 =( (var32 != 0) ? 1 : 0);
                                                         }

                                                         if ((var32 != 0)) {
                                                            break label133;
                                                         }
                                                      }

                                                      double var22 = var2.getX() - var16;
                                                      double var24 = var2.getZ() - var18;
                                                      double var48;
                                                      int var35 = (var48 = var22 - var8) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
                                                      if (var1 == null) {
                                                         return (var35 != 0);
                                                      }

                                                      if (var35 < 0) {
                                                         return (1 != 0);
                                                      }

                                                      double var49;
                                                      int var52 = (var49 = var22 - (1.0 - var8)) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
                                                      if (var1 == null) {
                                                         return (var52 != 0);
                                                      }

                                                      if (var52 > 0) {
                                                         return (1 != 0);
                                                      }

                                                      double var50;
                                                      int var53 = (var50 = var24 - var8) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
                                                      if (var1 == null) {
                                                         return (var53 != 0);
                                                      }

                                                      if (var53 < 0) {
                                                         return (1 != 0);
                                                      }

                                                      double var51;
                                                      var32 = (var51 = var24 - (1.0 - var8)) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
                                                      if (var1 == null) {
                                                         break label134;
                                                      }

                                                      if ((((var32 != 0) ? 1 : 0)) > 0) {
                                                         return (1 != 0);
                                                      }
                                                   }

                                                   var32 = var18;
                                                }

                                                var10001 = var15;
                                                if (var1 == null) {
                                                   break label140;
                                                }

                                                if (var32 ==( ((var15 == 0)) ? 1 : 0)) {
                                                   break;
                                                }

                                                var18++;
                                             } while (var1 != null);
                                          }

                                          var32 = var17;
                                       }

                                       var10001 = var13;
                                    }

                                    if (var1 == null) {
                                       break label187;
                                    }

                                    if (var32 ==( ((var10001 == 0)) ? 1 : 0)) {
                                       break;
                                    }

                                    var17++;
                                 } while (var1 != null);
                              }

                              var32 = var16;
                              if (var1 == null) {
                                 return (var16 != 0);
                              }

                              var10001 = var11;
                           }

                           if (var32 == var10001) {
                              break;
                           }

                           var16++;
                        } while (var1 != null);
                     }

                     return (0 != 0);
                  }

                  return (var10 != 0);
               }
            }

            return false;
         }
      }

      return false;
   }

   public final void a(double var1, double var3, double var5, float var7, float var8) { me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9 = null; // PX-FIX hoist
        
      EnumSet var10 = EnumSet.of(Relative.Y_ROT);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      PositionMoveRotation var11 = new PositionMoveRotation(new Vec3(var1, var3, var5), Vec3.ZERO, var7, var8);
       var9 = var10000;
      ClientboundPlayerPositionPacket var12 = new ClientboundPlayerPositionPacket(0, var11, var10);
      if (var9 != null) {
         LocalPlayer var13 = this.a().player;
         if (var13 != null) {
            var13.setPosRaw(var1, var3, var5);
         }
      }

      LocalPlayer var14 = this.a().player;
      if (var14 != null) {
         var14.setYRot(var7);
      }

      LocalPlayer var15 = this.a().player;
      if (var15 != null) {
         var15.setXRot(var8);
      }

      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(new IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll(var12));
   }

   public final double Q() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            double var3 = var2.getX() - var2.xo;
            double var5 = var2.getZ() - var2.zo;
            return Math.sqrt(var3 * var3 + var5 * var5);
         }
      }

      return 0.0;
   }

   @NotNull
   public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll R() {
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      LocalPlayer var1 = var10000;
      Vec3 var2 = new Vec3(var1.xo, var1.yo, var1.zo);
      return lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(var2, IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var1));
   }

   @Nullable
   public final BlockPos S() { me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9 = null; // PX-FIX hoist
        
      LocalPlayer var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      float var2 = var10000.getYRot() + 180.0F;
      Vec3 var3 = new Vec3(
         (float)Math.sin(
               IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f(var2)
            )
            * 0.1,
         0.0,
         -(
               (float)Math.cos(
                  IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .f(var2)
               )
            )
            * 0.1
      );
      var10000 = this.a().player;
      Intrinsics.checkNotNull(var10000);
      Vec3 var8 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10000).add(0.0, 0.5, 0.0);
      short var10002 = 19275;
      short var10003 = 21543;
      Intrinsics.checkNotNullExpressionValue(var8, "add(...)");
      Vec3 var4 = var8;
       var9 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      int var5 = 1;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var9;

      while (var5 < 16) {
         Vec3 var10 = var4.add(var3);
         var10002 = 19275;
         var10003 = 21543;
         Intrinsics.checkNotNullExpressionValue(var10, "add(...)");
         var4 = var10;
         BlockPos var11 = BlockPos.containing(var4);
         var10002 = 19270;
         var10003 = -7673;
         Intrinsics.checkNotNullExpressionValue(var11, "containing(...)");
         BlockPos var6 = var11;
         if (var1 != null) {
            if (!Intrinsics.areEqual(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .j(var6),
               Blocks.AIR
            )) {
               return var6;
            }

            var5++;
         }

         if (var1 == null) {
            break;
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[31];
      int var3 = 0;
      String var2 = "í«¦\u008dºÎÈFXJQ{®Kw\u0094ß\b T³-Ég>Z\ré\u009d\\N`PÛVQ³NÊÊ\fõ\u0006\u0002hòY´\u008d\r,\u0003>\rEàÉáÒ¥\u008dè\u009bd\u00170á\u0012ú]>G(LE\u0014\u0088n.:,W\u0016\u0095\u0099\u0017\u000eW\u0000\u008bý\u00865\u0081\u0080o\u0005/Úá[\tòF\u001b\u0012EWi[\u0093\u0005\u0001Ð\u0012«\u0086\u0003\u008alÂ\u0013þ+¾\u0089;\u008fI:\u009f_·sÓÞ¤þ\t}\u009a\u000b\u001dF¦\u009bÜ\u00adÁÂs,!\u000f\u0094Smû\u0016-#üÕ\"V\u0098\b\u0014·\u0005+ÒWë.\u0017\u00946ó*\u0091ár¡~Ãïï´\u00adÏ»Má[Îªhë\rfÍ\u00adUZ\u000e\u000b\\:=#\u001bg\u000fÈYæºg\u0005\rù\u0010\u0082î\u008c\u001f\u0096U\u000e¤åõAI¢xrP[È\u0011\u001d\"\u0012Ë\u0095\u0018^ìoÝp\u009bâL«`e\u009fÓ¨ß\u0004\u0000\u008bÝ´\r\u0016\u008c£}\u009b\u000b3ü=)Ã\u0099{\u0005\u0093ëÍmy\u000bQ\u001cï\b;\u0010eEÓóß\u0004¸mÊh_2¸\u0017ÇZ»ÌbÆ\u001eh\u0018T\u0080ðÆÅÃø\u0084S¯Ì\u0087µDØ\u0087\u0092C{Î\u0083E8ï%Ä\u00826v\u00938 ¸³ÕÙ\"v¼Éw&«,¼t\u0094w\tÚÔ§\u0089\u0000\u000fÞ\u009a\u0094SkÆÌwåà@\u009b\u0084\u0001m¤\u0099\"ÜùÝ\u0097ào#û£¿\bë\u0080Ê·æ4Û0\u0014\u00adûÔ\u009cxßî\u0083cÁ\"«\u0019²ÀËh\u001d± \u000b\u0005ýÚ\u0001í\u0088\u009e±¬m0\u000bñ#DÚ>óäÞã\u0080Ù";
      int var4 = "í«¦\u008dºÎÈFXJQ{®Kw\u0094ß\b T³-Ég>Z\ré\u009d\\N`PÛVQ³NÊÊ\fõ\u0006\u0002hòY´\u008d\r,\u0003>\rEàÉáÒ¥\u008dè\u009bd\u00170á\u0012ú]>G(LE\u0014\u0088n.:,W\u0016\u0095\u0099\u0017\u000eW\u0000\u008bý\u00865\u0081\u0080o\u0005/Úá[\tòF\u001b\u0012EWi[\u0093\u0005\u0001Ð\u0012«\u0086\u0003\u008alÂ\u0013þ+¾\u0089;\u008fI:\u009f_·sÓÞ¤þ\t}\u009a\u000b\u001dF¦\u009bÜ\u00adÁÂs,!\u000f\u0094Smû\u0016-#üÕ\"V\u0098\b\u0014·\u0005+ÒWë.\u0017\u00946ó*\u0091ár¡~Ãïï´\u00adÏ»Má[Îªhë\rfÍ\u00adUZ\u000e\u000b\\:=#\u001bg\u000fÈYæºg\u0005\rù\u0010\u0082î\u008c\u001f\u0096U\u000e¤åõAI¢xrP[È\u0011\u001d\"\u0012Ë\u0095\u0018^ìoÝp\u009bâL«`e\u009fÓ¨ß\u0004\u0000\u008bÝ´\r\u0016\u008c£}\u009b\u000b3ü=)Ã\u0099{\u0005\u0093ëÍmy\u000bQ\u001cï\b;\u0010eEÓóß\u0004¸mÊh_2¸\u0017ÇZ»ÌbÆ\u001eh\u0018T\u0080ðÆÅÃø\u0084S¯Ì\u0087µDØ\u0087\u0092C{Î\u0083E8ï%Ä\u00826v\u00938 ¸³ÕÙ\"v¼Éw&«,¼t\u0094w\tÚÔ§\u0089\u0000\u000fÞ\u009a\u0094SkÆÌwåà@\u009b\u0084\u0001m¤\u0099\"ÜùÝ\u0097ào#û£¿\bë\u0080Ê·æ4Û0\u0014\u00adûÔ\u009cxßî\u0083cÁ\"«\u0019²ÀËh\u001d± \u000b\u0005ýÚ\u0001í\u0088\u009e±¬m0\u000bñ#DÚ>óäÞã\u0080Ù"
         .length();
      b(false);
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 75;
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
                     case 0 -> 54;
                     case 1 -> 18;
                     case 2 -> 122;
                     case 3 -> 7;
                     case 4 -> 20;
                     case 5 -> 3;
                     default -> 98;
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
                     d = new String[31];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Vec3(0.0, 1.27, 0.0);
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
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

                  var2 = "QnS \u001d\u0085\u008cÓÏ\"\u009e:\u0005·ÂÕ8¤";
                  var4 = "QnS \u001d\u0085\u008cÓÏ\"\u009e:\u0005·ÂÕ8¤".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 7;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(boolean var0) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var0;
   }

   public static boolean T() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public static boolean U() {
      boolean var0 = T();
      return !var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 19274) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 164;
            case 1 -> 199;
            case 2 -> 72;
            case 3 -> 122;
            case 4 -> 190;
            case 5 -> 230;
            case 6 -> 126;
            case 7 -> 161;
            case 8 -> 98;
            case 9 -> 172;
            case 10 -> 181;
            case 11 -> 233;
            case 12 -> 80;
            case 13 -> 55;
            case 14 -> 141;
            case 15 -> 64;
            case 16 -> 52;
            case 17 -> 227;
            case 18 -> 130;
            case 19 -> 58;
            case 20 -> 255;
            case 21 -> 102;
            case 22 -> 245;
            case 23 -> 148;
            case 24 -> 197;
            case 25 -> 184;
            case 26 -> 144;
            case 27 -> 225;
            case 28 -> 115;
            case 29 -> 238;
            case 30 -> 200;
            case 31 -> 253;
            case 32 -> 100;
            case 33 -> 143;
            case 34 -> 17;
            case 35 -> 251;
            case 36 -> 214;
            case 37 -> 84;
            case 38 -> 70;
            case 39 -> 159;
            case 40 -> 37;
            case 41 -> 177;
            case 42 -> 33;
            case 43 -> 24;
            case 44 -> 82;
            case 45 -> 104;
            case 46 -> 111;
            case 47 -> 97;
            case 48 -> 14;
            case 49 -> 162;
            case 50 -> 92;
            case 51 -> 81;
            case 52 -> 79;
            case 53 -> 173;
            case 54 -> 169;
            case 55 -> 123;
            case 56 -> 165;
            case 57 -> 65;
            case 58 -> 43;
            case 59 -> 116;
            case 60 -> 108;
            case 61 -> 136;
            case 62 -> 117;
            case 63 -> 5;
            case 64 -> 151;
            case 65 -> 185;
            case 66 -> 228;
            case 67 -> 211;
            case 68 -> 73;
            case 69 -> 8;
            case 70 -> 53;
            case 71 -> 1;
            case 72 -> 107;
            case 73 -> 129;
            case 74 -> 207;
            case 75 -> 142;
            case 76 -> 63;
            case 77 -> 95;
            case 78 -> 243;
            case 79 -> 110;
            case 80 -> 168;
            case 81 -> 149;
            case 82 -> 27;
            case 83 -> 216;
            case 84 -> 223;
            case 85 -> 76;
            case 86 -> 3;
            case 87 -> 32;
            case 88 -> 28;
            case 89 -> 86;
            case 90 -> 54;
            case 91 -> 247;
            case 92 -> 62;
            case 93 -> 235;
            case 94 -> 152;
            case 95 -> 109;
            case 96 -> 35;
            case 97 -> 160;
            case 98 -> 189;
            case 99 -> 210;
            case 100 -> 241;
            case 101 -> 25;
            case 102 -> 11;
            case 103 -> 7;
            case 104 -> 153;
            case 105 -> 50;
            case 106 -> 99;
            case 107 -> 31;
            case 108 -> 140;
            case 109 -> 89;
            case 110 -> 0;
            case 111 -> 96;
            case 112 -> 234;
            case 113 -> 188;
            case 114 -> 90;
            case 115 -> 6;
            case 116 -> 61;
            case 117 -> 157;
            case 118 -> 85;
            case 119 -> 42;
            case 120 -> 88;
            case 121 -> 66;
            case 122 -> 232;
            case 123 -> 137;
            case 124 -> 202;
            case 125 -> 57;
            case 126 -> 59;
            case 127 -> 131;
            case 128 -> 139;
            case 129 -> 71;
            case 130 -> 114;
            case 131 -> 204;
            case 132 -> 120;
            case 133 -> 45;
            case 134 -> 47;
            case 135 -> 44;
            case 136 -> 249;
            case 137 -> 242;
            case 138 -> 39;
            case 139 -> 49;
            case 140 -> 134;
            case 141 -> 226;
            case 142 -> 41;
            case 143 -> 150;
            case 144 -> 166;
            case 145 -> 127;
            case 146 -> 13;
            case 147 -> 124;
            case 148 -> 10;
            case 149 -> 38;
            case 150 -> 174;
            case 151 -> 60;
            case 152 -> 48;
            case 153 -> 158;
            case 154 -> 78;
            case 155 -> 205;
            case 156 -> 229;
            case 157 -> 170;
            case 158 -> 179;
            case 159 -> 156;
            case 160 -> 176;
            case 161 -> 15;
            case 162 -> 19;
            case 163 -> 196;
            case 164 -> 23;
            case 165 -> 69;
            case 166 -> 191;
            case 167 -> 186;
            case 168 -> 34;
            case 169 -> 237;
            case 170 -> 195;
            case 171 -> 16;
            case 172 -> 252;
            case 173 -> 21;
            case 174 -> 209;
            case 175 -> 193;
            case 176 -> 26;
            case 177 -> 91;
            case 178 -> 246;
            case 179 -> 93;
            case 180 -> 201;
            case 181 -> 218;
            case 182 -> 74;
            case 183 -> 112;
            case 184 -> 178;
            case 185 -> 83;
            case 186 -> 135;
            case 187 -> 236;
            case 188 -> 254;
            case 189 -> 12;
            case 190 -> 217;
            case 191 -> 145;
            case 192 -> 30;
            case 193 -> 22;
            case 194 -> 77;
            case 195 -> 180;
            case 196 -> 68;
            case 197 -> 106;
            case 198 -> 213;
            case 199 -> 118;
            case 200 -> 46;
            case 201 -> 183;
            case 202 -> 244;
            case 203 -> 4;
            case 204 -> 221;
            case 205 -> 154;
            case 206 -> 20;
            case 207 -> 75;
            case 208 -> 9;
            case 209 -> 2;
            case 210 -> 133;
            case 211 -> 239;
            case 212 -> 240;
            case 213 -> 198;
            case 214 -> 56;
            case 215 -> 203;
            case 216 -> 113;
            case 217 -> 67;
            case 218 -> 132;
            case 219 -> 94;
            case 220 -> 101;
            case 221 -> 138;
            case 222 -> 87;
            case 223 -> 192;
            case 224 -> 231;
            case 225 -> 36;
            case 226 -> 206;
            case 227 -> 250;
            case 228 -> 220;
            case 229 -> 105;
            case 230 -> 182;
            case 231 -> 194;
            case 232 -> 222;
            case 233 -> 125;
            case 234 -> 103;
            case 235 -> 128;
            case 236 -> 219;
            case 237 -> 40;
            case 238 -> 18;
            case 239 -> 248;
            case 240 -> 167;
            case 241 -> 119;
            case 242 -> 187;
            case 243 -> 146;
            case 244 -> 163;
            case 245 -> 224;
            case 246 -> 29;
            case 247 -> 121;
            case 248 -> 175;
            case 249 -> 51;
            case 250 -> 147;
            case 251 -> 215;
            case 252 -> 208;
            case 253 -> 212;
            case 254 -> 171;
            default -> 155;
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

   // PX-FIX synth restored from jar bytecode
  public static void h() { }
}
