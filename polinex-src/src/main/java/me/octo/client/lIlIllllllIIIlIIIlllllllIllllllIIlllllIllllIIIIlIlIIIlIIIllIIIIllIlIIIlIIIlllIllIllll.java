package me.octo.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.InputConstants.Key;
import com.mojang.blaze3d.platform.InputConstants.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.KeyMappingAccessor;
import net.minecraft.client.CameraType;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Options;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ServerboundKeepAlivePacket;
import net.minecraft.network.protocol.common.ServerboundPongPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundAcceptTeleportationPacket;
import net.minecraft.network.protocol.ping.ServerboundPingRequestPacket;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public final class lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {

   @NotNull
   public static lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private RemotePlayer lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private double lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private double llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private double lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private double IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private float IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private float IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @Nullable
   private CameraType llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private long lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @JvmField
   @NotNull
   public static lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static String[] f;
   private static String[] g;

   private lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll() {
      short var10001 = -21443;
      short var10002 = -13508;
      var10002 = -21450;
      short var10003 = 9316;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = -21442;
      short var10005 = -4685;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIlIllllIlIIIIIlIlIllIllllllIlIllllllIllllllllIllIlllIIIllIllIlIIIIllllIllIIIIIlIIlI.a()
      };
      super("Freecam", "Detaches your camera from your player.", var3, "Player", var1);
   }

   @Nullable
   public final RemotePlayer ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(@Nullable RemotePlayer var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final float ah() {
      return this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   }

   public final void a(float var1) {
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var1;
   }

   public final float ai() {
      return this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   }

   public final void b(float var1) {
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var1;
   }

   @Override
   public void aB() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      LocalPlayer var2 = this.ap().player;
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      ClientLevel var3 = this.ap().level;
      int[] var1 = var10000;
      if (var1 == null) {
         if (var2 != null && var3 != null) {
            Iterable var5 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            Iterator var6 = var5.iterator();

            label33:
            while (true) {
               if (var6.hasNext()) {
                  Object var7 = var6.next();
                  var10000 = (int[])var7;

                  while (true) {
                     IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var8 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)(Object)var10000;
                     boolean var9 = false;
                     if (!var8.G()) {
                        continue label33;
                     }

                     var10000 = (int[])var7;
                     if (var1 == null) {
                        break label33;
                     }
                  }
               }

               var10000 = null;
               break;
            }

            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var4 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)(Object)var10000;
            if (var1 == null) {
               if (var4 != null) {
                  short var13 = -21468;
                  boolean var10 = false;
                  short var14 = 8033;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
                     "You can't freecam when a macro is active."
                  );
                  this.a(false);
                  return;
               }

               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = true;
               this.aL();
               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var2.getAbilities().flying;
               this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var2.getAbilities().mayfly;
               this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var2.noPhysics;
               this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = this.ap().options.getCameraType();
               this.ap().options.setCameraType(CameraType.THIRD_PERSON_BACK);
               this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var2.getX();
               this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var2.getY() + var2.getEyeHeight(var2.getPose());
               this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var2.getZ();
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
               this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var2.getYRot();
               this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var2.getXRot();
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
               this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = 0L;
               this.aH();
               this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = true;
               super.aB();
            }

            return;
         }

         short var11 = -21454;
         short var10001 = -16546;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
            "Freecam can't be enabled without being in a world."
         );
         this.a(false);
      }
   }

   @Override
   public void aC() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var1;
      label59: {
         lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var8;
         label62: {
            var1 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
            boolean var10000 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
            if (var1 == null) {
               if (!this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
                  this.aH();
                  this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = false;
                  this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = null;
                  this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = 0L;
                  super.aC();
                  return;
               }

               var8 = this;
               if (var1 != null) {
                  break label62;
               }

               var10000 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
            }

            if (!var10000) {
               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  RemotePlayer var2 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  boolean var3 = false;
                  if (var1 == null) {
                     ClientLevel var9 = this.ap().level;
                     if (var9 != null) {
                        var9.removeEntity(var2.getId(), RemovalReason.DISCARDED);
                     }
                  }

                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
                  break label59;
               }

               if (var1 == null) {
                  break label59;
               }
            }

            var8 = this;
         }

         var8.aH();
      }

      LocalPlayer var10 = this.ap().player;
      if (var10 != null) {
         LocalPlayer var4 = var10;
         boolean var6 = false;
         var4.getAbilities().flying = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
         var4.getAbilities().mayfly = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
         var4.noPhysics = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
         boolean var11 = var4.onGround();
         if (var1 == null) {
            if (var11) {
               var4.setDeltaMovement(Vec3.ZERO);
            }

            var11 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
         }

         if (!var11) {
            var4.setPosRaw(
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            );
            var4.setYRot(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
            var4.setXRot(this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl);
         }
      }

      if (this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI != null) {
         CameraType var5 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
         boolean var7 = false;
         this.ap().options.setCameraType(var5);
      }

      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = null;
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = 0L;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = false;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
      super.aC();
   }

   public final boolean aG() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var1 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      boolean var10000 = this.aA();
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      }

      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      }

      return var1 != null ? var10000 : var10000;
   }

   public final void aH() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      this.aI();
      int[] var1 = var10000;
      if (var1 == null) {
         LocalPlayer var4 = this.ap().player;
         if (var4 != null) {
            LocalPlayer var2 = var4;
            boolean var3 = false;
            var2.input.tick();
         }
      }
   }

   public final void a(double var1, double var3) {
      if (this.aG()) {
         float var5 = (float)var3 * 0.15F;
         float var6 = (float)var1 * 0.15F;
         this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII += var6;
         this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = Mth.clamp(
            this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll + var5, -90.0F, 90.0F
         );
      }
   }

   public final void b(double var1, double var3) {
      Object var16 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var5 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      int var10000 = ((this.aG()) ? 1 : 0);
      if (var5 == null) {
         if ((var10000 == 0)) {
            return;
         }

         double var17;
         var10000 = (var17 = var1 - 0.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
      }

      if (var5 == null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      if ((var10000 != 0)) {
         double var18;
         var10000 = (var18 = var3 - 0.0) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
         if (var5 == null) {
            var10000 = (((var10000 == 0) ? 1 : 0));
         }

         if ((var10000 != 0)) {
            return;
         }
      }

      double var10;
      double var12;
      label55: {
         double var6 = this.ap().options.sensitivity().get().doubleValue() * 0.6F + 0.2F;
         double var8 = var6 * var6 * var6 * 8.0;
         var10 = var1 * var8;
         var12 = var3 * var8;
         boolean var15 = this.ap().options.invertMouseX().get();
         if (var5 == null) {
            if (var15) {
               var10 = -var10;
            }

            var16 = this;
            if (var5 != null) {
               break label55;
            }

            var15 = this.ap().options.invertMouseY().get();
         }

         if (var15) {
            var12 = -var12;
         }

         var16 = this;
      }

      this.a(var10, var12);
   }

   public final void aI() {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var1 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      if (var1 == null) {
         Options var10000 = this.ap().options;
         if (var10000 != null) {
            Options var2 = var10000;
            var2.keyUp.setDown(false);
            var2.keyDown.setDown(false);
            var2.keyLeft.setDown(false);
            var2.keyRight.setDown(false);
            var2.keyJump.setDown(false);
            var2.keyShift.setDown(false);
            var2.keySprint.setDown(false);
            return;
         }
      }
   }

   public final boolean a(@NotNull KeyEvent var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = -21448;
      short var10003 = -5271;
      Intrinsics.checkNotNullParameter(var1, "keyInput");
      int[] var2 = var10000;
      boolean var10 = this.aG();
      if (var2 == null) {
         if (var10 && this.ap().screen == null) {
            Key var11 = InputConstants.getKey(var1);
            var10002 = -21441;
            var10003 = 11573;
            Intrinsics.checkNotNullExpressionValue(var11, "getKey(...)");
            Key var3 = var11;
            boolean var12 = Intrinsics.areEqual(var3, InputConstants.UNKNOWN);
            if (var2 == null) {
               if (!var12) {
                  var var4 = this.aK();
                  boolean var5 = false;
                  var10000 = (int[])(Object)var4;
                  label45:
                  if (var2 == null) {
                     if (var4 instanceof Collection) {
                        var10000 = (int[])(Object)((Collection)var4);
                        if (var2 != null) {
                           break label45;
                        }

                        if ((var10000.length == 0)) {
                           return false;
                        }
                     }

                     var10000 = (int[])(Object)var4;
                  }

                  for (Object var7 : var10000) {
                     Key var8 = (Key)var7;
                     boolean var9 = false;
                     boolean var14 = Intrinsics.areEqual(var8, var3);

                     while (var14) {
                        var14 = true;
                        if (var2 == null) {
                           return true;
                        }
                     }
                  }

                  return false;
               }

               var12 = false;
            }

            return var12;
         }

         var10 = false;
      }

      return var10;
   }

   public final boolean a(int var1) {
      Object var10 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      int var10000 = ((this.aG()) ? 1 : 0);
      if (var2 == null) {
         label73:
         if ((var10000 != 0)) {
            lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var9 = this;
            if (var2 == null) {
               if (this.ap().screen != null) {
                  break label73;
               }

               var9 = this;
            }

            var var3 = var9.aK();
            boolean var4 = false;
            var10 = var3;
            label62:
            if (var2 == null) {
               if (var3 instanceof Collection) {
                  var10 = (Collection)var3;
                  if (var2 != null) {
                     break label62;
                  }

                  if (((me.octo.client.PXDyn)var10).isEmpty()) {
                     return false;
                  }
               }

               var10 = var3;
            }

            label53:
            for (Object var6 : (Iterable<?>)(var10)) {
               Key var7 = (Key)var6;
               var10000 = (int)((0 != 0) ? 1 : 0);

               do {
                  label49: {
                     label83: {
                        Key var13 =((Key)( var7));
                        if (var2 == null) {
                           if (var7.getType() != Type.MOUSE) {
                              break label83;
                           }

                           var13 =((Key)( var7));
                        }

                        var10000 = var13.getValue();
                        if (var2 != null) {
                           break label49;
                        }

                        if (var10000 == var1) {
                           var10000 = 1;
                           break label49;
                        }
                     }

                     var10000 = 0;
                  }

                  if (var10000 == 0) {
                     continue label53;
                  }
               } while (var2 != null);

               return true;
            }

            return false;
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   private final List<KeyMapping> aJ() {
      Options var10000 = this.ap().options;
      short var10002 = -21444;
      short var10003 = -32559;
      Intrinsics.checkNotNullExpressionValue(var10000, "options");
      Options var1 = var10000;
      KeyMapping[] var2 = new KeyMapping[]{var1.keyUp, var1.keyDown, var1.keyLeft, var1.keyRight, var1.keyJump, var1.keyShift, var1.keySprint};
      return CollectionsKt.listOf(var2);
   }

   private final Collection<Key> aK() {
      Object var12 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      Iterable var2 = this.aJ();
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      boolean var3 = false;
      int[] var1 = var10000;
      var var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      boolean var6 = false;
      Iterator var7 = var2.iterator();

      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            var12 = var5;
            KeyMapping var9 = (KeyMapping)var8;
            if (var1 != null) {
               break;
            }

            boolean var10 = false;
            short var10001 = -21465;
            short var10002 = 1740;
            Intrinsics.checkNotNull(var9, "null cannot be cast to non-null type me.octo.client.mixin.accessors.KeyMappingAccessor");
            var5.add(((KeyMappingAccessor)var9).getKey());
            if (var1 == null) {
               continue;
            }
         }

         var12 = var5;
         break;
      }

      return (Collection<Key>)var12;
   }

   public final void aL() {
      Object var11 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var1;
      List var2;
      boolean var12;
      label58: {
         int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         var2 = this.aJ();
         var1 = var10000;
         var var3 = var2;
         boolean var4 = false;
         var11 = var3;
         label54:
         if (var1 == null) {
            if (var3 instanceof Collection) {
               var11 = (Collection)var3;
               if (var1 != null) {
                  break label54;
               }

               if (((me.octo.client.PXDyn)var11).isEmpty()) {
                  var12 = true;
                  break label58;
               }
            }

            var11 = var3;
         }

         Iterator var5 = ((me.octo.client.PXDyn)var11).iterator();

         label45:
         while (true) {
            if (!var5.hasNext()) {
               var12 = true;
               break;
            }

            Object var6 = var5.next();
            KeyMapping var7 = (KeyMapping)var6;
            boolean var8 = false;
            short var10001 = -21467;
            short var10002 = 17874;
            Intrinsics.checkNotNull(var7, "null cannot be cast to non-null type me.octo.client.mixin.accessors.KeyMappingAccessor");
            var12 = Intrinsics.areEqual(((KeyMappingAccessor)var7).getKey(), InputConstants.UNKNOWN);

            while (!var12) {
               var12 = false;
               if (var1 == null) {
                  break label45;
               }
            }
         }
      }

      if (var12) {
         Iterator var9 = var2.iterator();

         while (true) {
            if (var9.hasNext()) {
               KeyMapping var10 = (KeyMapping)var9.next();
               var10.setDown(false);
               var10.setKey(var10.getDefaultKey());
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            KeyMapping.resetMapping();
            this.aI();
            this.ap().options.save();
            break;
         }
      }
   }

   @SubscribeEvent
   public final void a(
      @NotNull me.octo.client.events.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (var2 == null) {
         if (!this.aG()) {
            return;
         }

         var1.a(
            this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII,
            this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
         );
      }
   }

   @SubscribeEvent
   public final void a(
      @NotNull me.octo.client.events.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (var2 == null) {
         if (!this.aG()) {
            return;
         }

         var1.a(
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
            this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll,
            this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
         );
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (var2 == null) {
         if (!this.aG()) {
            return;
         }

         var1.a(true);
         var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CameraType.THIRD_PERSON_BACK;
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var3 = this;
      if (var2 == null) {
         if (!this.aG()) {
            return;
         }

         var3 = this;
      }

      var3.a(
         var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         var1.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
      var1.a(true);
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (var2 == null) {
         if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) {
            return;
         }

         var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         var1.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         var1.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1) {
      double var9 = 0; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var7 = this;
      if (var2 == null) {
         if (!this.aG()) {
            return;
         }

         var7 = this;
      }

      long var3;
      label39: {
         var7.aH();
         var3 = System.nanoTime();
         long var8 = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
         long var10001 = 0L;
         if (var2 == null) {
            if (this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII == 0L) {
               var9 = 0.0;
               break label39;
            }

            var8 = var3;
            var10001 = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
         }

         var9 = RangesKt.coerceIn((var8 - var10001) / 1.0E9, 0.0, 0.05);
      }

      double var5 = var9;
      lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var10 = this;
      if (var2 == null) {
         this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var3;
         if (var5 <= 0.0) {
            return;
         }

         var10 = this;
      }

      if (var2 == null) {
         if (var10.ap().screen != null) {
            return;
         }

         var10 = this;
      }

      var10.a(var5);
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      Iterable var4 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Iterator var5 = var4.iterator();
      int[] var2 = var10000;

      label44:
      while (true) {
         if (var5.hasNext()) {
            Object var6 = var5.next();
            var10000 = (int[])var6;

            while (true) {
               IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var7 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)(Object)var10000;
               boolean var8 = false;
               if (!var7.G()) {
                  continue label44;
               }

               var10000 = (int[])var6;
               if (var2 == null) {
                  break label44;
               }
            }
         }

         var10000 = null;
         break;
      }

      IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var3 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)(Object)var10000;
      if (var2 == null && var3 == null) {
         lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var14 = this;
         if (var2 == null) {
            if (!this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) {
               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  RemotePlayer var9 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  boolean var11 = false;
                  var9.setPosRaw(
                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                  );
                  var9.setDeltaMovement(Vec3.ZERO);
                  return;
               }

               if (var2 == null) {
                  return;
               }
            }

            var14 = this;
         }

         var14.aH();
      } else {
         short var13 = -21446;
         boolean var10 = false;
         short var10001 = -30350;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
            "You can't freecam when a macro is active."
         );
         this.aC();
      }
   }

   private final void a(double var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      Options var10001 = this.ap().options;
      short var10003 = -21470;
      short var10004 = 519;
      Intrinsics.checkNotNullExpressionValue(var10001, "options");
      Options var4 = var10001;
      int[] var3 = var10000;
      KeyMapping var10002 = var4.keyUp;
      var10004 = -21455;
      short var10005 = -19944;
      Intrinsics.checkNotNullExpressionValue(var4.keyUp, "keyUp");
      boolean var30 = this.a(var10002);
      KeyMapping var36 = var4.keyDown;
      var10005 = -21451;
      short var10006 = 15200;
      Intrinsics.checkNotNullExpressionValue(var4.keyDown, "keyDown");
      double var5 = this.a(var30, this.a(var36));
      var10002 = var4.keyLeft;
      var10004 = -21445;
      var10005 = 8168;
      Intrinsics.checkNotNullExpressionValue(var4.keyLeft, "keyLeft");
      boolean var31 = this.a(var10002);
      KeyMapping var37 = var4.keyRight;
      var10005 = -21452;
      var10006 = 15458;
      Intrinsics.checkNotNullExpressionValue(var4.keyRight, "keyRight");
      double var7 = this.a(var31, this.a(var37));
      var10002 = var4.keyJump;
      var10004 = -21456;
      var10005 = -14497;
      Intrinsics.checkNotNullExpressionValue(var4.keyJump, "keyJump");
      boolean var32 = this.a(var10002);
      KeyMapping var38 = var4.keyShift;
      var10005 = -21447;
      var10006 = -23762;
      Intrinsics.checkNotNullExpressionValue(var4.keyShift, "keyShift");
      double var9 = this.a(var32, this.a(var38));
      double var51;
      int var25 = (var51 = var5 - 0.0) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
      if (var3 == null) {
         var25 = (((var25 == 0) ? 1 : 0));
      }

      if ((var25 != 0)) {
         double var52;
         int var26 = (var52 = var7 - 0.0) == 0.0 ? 0 : (var52 < 0.0 ? -1 : 1);
         if (var3 == null) {
            var26 = (((var26 == 0) ? 1 : 0));
         }

         if ((var26 != 0)) {
            double var53;
            int var27 = (var53 = var9 - 0.0) == 0.0 ? 0 : (var53 < 0.0 ? -1 : 1);
            if (var3 == null) {
               var27 = (((var27 == 0) ? 1 : 0));
            }

            if ((var27 != 0)) {
               return;
            }
         }
      }

      KeyMapping var33 = var4.keySprint;
      var10003 = -21449;
      var10004 = -14407;
      Intrinsics.checkNotNullExpressionValue(var4.keySprint, "keySprint");
      double var11 = this.a(var33) ? 2.0 : 1.0;
      double var13 = ((me.octo.client.PXDyn)(Object)(lIIlIllllIlIIIIIlIlIllIllllllIlIllllllIllllllllIllIlllIIIllIllIlIIIIllllIllIIIIIlIIlI.a())).<Double>q() * var11 * var1;
      double var54;
      int var28 = (var54 = var5 - 0.0) == 0.0 ? 0 : (var54 < 0.0 ? -1 : 1);
      if (var3 == null) {
         var28 = (((var28 == 0) ? 1 : 0));
      }

      label75: {
         if ((var28 != 0)) {
            double var55;
            int var29 = (var55 = var7 - 0.0) == 0.0 ? 0 : (var55 < 0.0 ? -1 : 1);
            if (var3 == null) {
               var29 = (((var29 == 0) ? 1 : 0));
            }

            if ((var29 != 0)) {
               break label75;
            }
         }

         double var15 = Math.toRadians(this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII);
         double var17 = -(var5 * Math.sin(var15) - var7 * Math.cos(var15));
         double var19 = var5 * Math.cos(var15) + var7 * Math.sin(var15);
         double var21 = Math.sqrt(var17 * var17 + var19 * var19);
         if (var3 != null) {
            return;
         }

         if (var21 > 0.0) {
            var17 /= var21;
            var19 /= var21;
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl += var17 * var13;
            this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll += var19 * var13;
         }
      }

      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll += var9 * var13;
   }

   private final double a(boolean var1, boolean var2) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var3 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      boolean var10000 = var1;
      if (var3 == null) {
         if (var1 == var2) {
            return 0.0;
         }

         var10000 = var1;
      }

      return var10000 ? 1.0 : -1.0;
   }

   private final boolean a(KeyMapping var1) {
      short var10001 = -21467;
      short var10002 = 17874;
      Intrinsics.checkNotNull(var1, "null cannot be cast to non-null type me.octo.client.mixin.accessors.KeyMappingAccessor");
      Key var2 = ((KeyMappingAccessor)var1).getKey();
      Intrinsics.checkNotNull(var2);
      return this.a(var2);
   }

   private final boolean a(Key var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      int var10000 = ((Intrinsics.areEqual(var1, InputConstants.UNKNOWN)) ? 1 : 0);
      if (var2 == null) {
         if ((var10000 == 0)) {
            long var3 = this.ap().getWindow().handle();
            var10000 = ((int[])lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[var1.getType()
               .ordinal()];
            if (var2 == null) {
               switch (var10000) {
                  case 1:
                     var10000 = GLFW.glfwGetKey(var3, var1.getValue());
                     break;
                  case 2:
                     var10000 = GLFW.glfwGetMouseButton(var3, var1.getValue());
                     if (var2 == null) {
                        var10000 = var10000 == 1 ? 1 : 0;
                     }

                     return (var10000 != 0);
                  default:
                     return (0 != 0);
               }
            }

            if (var2 == null) {
               var10000 = var10000 == 1 ? 1 : 0;
            }

            return (var10000 != 0);
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var7 = null; // PX-FIX
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 == null) {
         Intrinsics.checkNotNullParameter(var1, "e");
         if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) {
            return;
         }

         var10000 = var1;
      }

      label67: {
         Packet var5 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Packet var6 = var5;
         if (var2 == null) {
            if (!(var5 instanceof ClientboundPlayerPositionPacket)) {
               var7 = null;
               break label67;
            }

            var6 = var5;
         }

         var7 = (ClientboundPlayerPositionPacket)var6;
      }

      if (var7 != null) {
         ClientboundPlayerPositionPacket var3 =((ClientboundPlayerPositionPacket)( var7));
         if (var2 == null) {
            ClientPacketListener var8 = this.ap().getConnection();
            if (var8 != null) {
               var8.send(new ServerboundAcceptTeleportationPacket(var3.id()));
            }
         }

         Vec3 var9 = var3.change().position();
         short var10002 = -21453;
         short var10003 = -6542;
         Intrinsics.checkNotNullExpressionValue(var9, "position(...)");
         Vec3 var4 = var9;
         double var13;
         int var10 = (var13 = var4.x - 0.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
         if (var2 == null) {
            var10 = (((var10 == 0) ? 1 : 0));
         }

         label57: {
            if ((var10 != 0)) {
               double var14;
               int var11 = (var14 = var4.y - 0.0) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  var11 = (((var11 == 0) ? 1 : 0));
               }

               if ((var11 != 0)) {
                  double var15;
                  int var12 = (var15 = var4.z - 0.0) == 0.0 ? 0 : (var15 < 0.0 ? -1 : 1);
                  if (var2 == null) {
                     var12 = (((var12 == 0) ? 1 : 0));
                  }

                  if ((var12 != 0)) {
                     break label57;
                  }
               }
            }

            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var4.x;
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var4.y;
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var4.z;
         }

         var1.a(true);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      Object IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = null; // PX-FIX
      int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var10000 = var1;
      if (var2 == null) {
         short var10001 = -21466;
         short var10002 = -2916;
         Intrinsics.checkNotNullParameter(var1, "packet");
         if (this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) {
            return;
         }

         var10000 = var1;
      }

      Packet var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var4 = var3 instanceof ServerboundKeepAlivePacket;
      if (var2 == null) {
         if (var4) {
            return;
         }

         var4 = var3 instanceof ServerboundPongPacket;
      }

      if (var2 == null) {
         if (var4) {
            return;
         }

         var4 = var3 instanceof ServerboundPingRequestPacket;
      }

      if (var2 == null) {
         if (var4) {
            return;
         }

         var4 = var3 instanceof ServerboundAcceptTeleportationPacket;
      }

      if (!var4) {
         var1.a(true);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.aC();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public final void a(@NotNull me.octo.client.events.impl.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.aH();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = "¤/3zÒ®ÁõcÅ\u0010¶6Ü¯l\u0088\u0092\u008e><Úc\u0081\n¿<M\u0092ë¶\u0006³\u001b\u001f}uW\t\u000eX¡¦?[\u0001\u000f¢\b\u0091/RIX\u0092Ö\u009b\u0007ç¤\u009c.\u0087ºí2¢\u009d Ý\u0093×á¡-nó\u008amC\u0003\u009bqèIq\u00199Ú½\u0085\u00059¼=°¨×Ã¦È¥\f\u00885Þ(Nñ\u007f\u001b\u0093¥X\u001dò\r\u009bza\u0093h\u009bio5\u007f\u0092\u0007T\u0007Ó_\u001a_MAó\u0005\u000bÁ\u0001\u0093+\u0006\u0092\u008ev~Ë/\u000bB\"¨ñ§¡äz-\u0095P\u0007\u008a.¸å¯Rõ\u0007ë\u0004\u0089î¶±E)\u0082ÇHm\u009c,\u0003Ù\u0005Ç\u000b\u0083jØÑ\u0001GzrÇCÅ3eU¡+fl\u001e\u008e\u001f«Cø\u0019\u0094Z)Gw\u0007ÍfÙ~%¨è\b\rëÁÊ-\u008d\u0082\u008d\bs¢\u000eùÒ«¨s\u0006VÅÈ©^\u0083VàKÌéu{\u001a8ÒÔº\u0015\u000b\u0012YZq\u0000:ù8Bo»\u0091\u0097YÎà¤´b.Õ¾¿;L\u0011J@0ÈÔÒLð+kyb½ì\u0018áß\u0013#¿ÛôÕ\u00136¢¶\u0092éÀBu~\u0086lÀ^ùÞo,ÐÂ¢\u0013\u0010¿)°.\u000ePT\u008b\u001a-&YoPæ¢@Nu\u00934ú\u008bb*\u0091v?Oµàd\u001fP\u0099ª¾$\\ý0³T";
      int var4 = "¤/3zÒ®ÁõcÅ\u0010¶6Ü¯l\u0088\u0092\u008e><Úc\u0081\n¿<M\u0092ë¶\u0006³\u001b\u001f}uW\t\u000eX¡¦?[\u0001\u000f¢\b\u0091/RIX\u0092Ö\u009b\u0007ç¤\u009c.\u0087ºí2¢\u009d Ý\u0093×á¡-nó\u008amC\u0003\u009bqèIq\u00199Ú½\u0085\u00059¼=°¨×Ã¦È¥\f\u00885Þ(Nñ\u007f\u001b\u0093¥X\u001dò\r\u009bza\u0093h\u009bio5\u007f\u0092\u0007T\u0007Ó_\u001a_MAó\u0005\u000bÁ\u0001\u0093+\u0006\u0092\u008ev~Ë/\u000bB\"¨ñ§¡äz-\u0095P\u0007\u008a.¸å¯Rõ\u0007ë\u0004\u0089î¶±E)\u0082ÇHm\u009c,\u0003Ù\u0005Ç\u000b\u0083jØÑ\u0001GzrÇCÅ3eU¡+fl\u001e\u008e\u001f«Cø\u0019\u0094Z)Gw\u0007ÍfÙ~%¨è\b\rëÁÊ-\u008d\u0082\u008d\bs¢\u000eùÒ«¨s\u0006VÅÈ©^\u0083VàKÌéu{\u001a8ÒÔº\u0015\u000b\u0012YZq\u0000:ù8Bo»\u0091\u0097YÎà¤´b.Õ¾¿;L\u0011J@0ÈÔÒLð+kyb½ì\u0018áß\u0013#¿ÛôÕ\u00136¢¶\u0092éÀBu~\u0086lÀ^ùÞo,ÐÂ¢\u0013\u0010¿)°.\u000ePT\u008b\u001a-&YoPæ¢@Nu\u00934ú\u008bb*\u0091v?Oµàd\u001fP\u0099ª¾$\\ý0³T"
         .length();
      char var1 = '&';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 40;
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
                     case 1 -> 56;
                     case 2 -> 120;
                     case 3 -> 29;
                     case 4 -> 15;
                     case 5 -> 74;
                     default -> 61;
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
                     g = new String[21];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll();
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

                  var2 = "Ã=ÚUÅ\u009e~ö,\u007f\u0017\u0012Ì\u0080ÓzRv,E\u0088§\u000buo<ôÉ'6>B\r£¨\u0003\u008b©u\u0084¾\u009beÓ\u0015Þz\u000bH\u000ft\u0001\\ý\u0085\u0011í\u0088\u0012Ü3G\u0099\u0016\u0081À\u0084Up§\u0011°xÇmY>Lå\fó´´¯ Z\u00073Cý:uÛÜ";
                  var4 = "Ã=ÚUÅ\u009e~ö,\u007f\u0017\u0012Ì\u0080ÓzRv,E\u0088§\u000buo<ôÉ'6>B\r£¨\u0003\u008b©u\u0084¾\u009beÓ\u0015Þz\u000bH\u000ft\u0001\\ý\u0085\u0011í\u0088\u0012Ü3G\u0099\u0016\u0081À\u0084Up§\u0011°xÇmY>Lå\fó´´¯ Z\u00073Cý:uÛÜ"
                     .length();
                  var1 = 'V';
                  var8 = -1;
            }

            var10000 = 113;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21450) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 63;
            case 1 -> 115;
            case 2 -> 56;
            case 3 -> 162;
            case 4 -> 140;
            case 5 -> 175;
            case 6 -> 219;
            case 7 -> 11;
            case 8 -> 47;
            case 9 -> 204;
            case 10 -> 43;
            case 11 -> 156;
            case 12 -> 26;
            case 13 -> 141;
            case 14 -> 83;
            case 15 -> 244;
            case 16 -> 136;
            case 17 -> 171;
            case 18 -> 52;
            case 19 -> 210;
            case 20 -> 174;
            case 21 -> 134;
            case 22 -> 114;
            case 23 -> 132;
            case 24 -> 241;
            case 25 -> 160;
            case 26 -> 123;
            case 27 -> 34;
            case 28 -> 222;
            case 29 -> 85;
            case 30 -> 1;
            case 31 -> 51;
            case 32 -> 148;
            case 33 -> 187;
            case 34 -> 253;
            case 35 -> 135;
            case 36 -> 6;
            case 37 -> 177;
            case 38 -> 227;
            case 39 -> 116;
            case 40 -> 36;
            case 41 -> 130;
            case 42 -> 99;
            case 43 -> 118;
            case 44 -> 64;
            case 45 -> 35;
            case 46 -> 104;
            case 47 -> 54;
            case 48 -> 146;
            case 49 -> 74;
            case 50 -> 238;
            case 51 -> 178;
            case 52 -> 233;
            case 53 -> 234;
            case 54 -> 231;
            case 55 -> 176;
            case 56 -> 214;
            case 57 -> 250;
            case 58 -> 168;
            case 59 -> 208;
            case 60 -> 152;
            case 61 -> 79;
            case 62 -> 139;
            case 63 -> 13;
            case 64 -> 30;
            case 65 -> 223;
            case 66 -> 20;
            case 67 -> 9;
            case 68 -> 186;
            case 69 -> 247;
            case 70 -> 215;
            case 71 -> 183;
            case 72 -> 19;
            case 73 -> 125;
            case 74 -> 190;
            case 75 -> 103;
            case 76 -> 22;
            case 77 -> 28;
            case 78 -> 129;
            case 79 -> 88;
            case 80 -> 82;
            case 81 -> 255;
            case 82 -> 45;
            case 83 -> 243;
            case 84 -> 159;
            case 85 -> 191;
            case 86 -> 41;
            case 87 -> 203;
            case 88 -> 61;
            case 89 -> 185;
            case 90 -> 182;
            case 91 -> 121;
            case 92 -> 246;
            case 93 -> 201;
            case 94 -> 80;
            case 95 -> 151;
            case 96 -> 40;
            case 97 -> 98;
            case 98 -> 110;
            case 99 -> 252;
            case 100 -> 32;
            case 101 -> 95;
            case 102 -> 131;
            case 103 -> 165;
            case 104 -> 57;
            case 105 -> 194;
            case 106 -> 170;
            case 107 -> 69;
            case 108 -> 217;
            case 109 -> 212;
            case 110 -> 16;
            case 111 -> 75;
            case 112 -> 242;
            case 113 -> 254;
            case 114 -> 211;
            case 115 -> 25;
            case 116 -> 154;
            case 117 -> 236;
            case 118 -> 38;
            case 119 -> 77;
            case 120 -> 173;
            case 121 -> 147;
            case 122 -> 180;
            case 123 -> 235;
            case 124 -> 149;
            case 125 -> 179;
            case 126 -> 142;
            case 127 -> 111;
            case 128 -> 5;
            case 129 -> 138;
            case 130 -> 193;
            case 131 -> 232;
            case 132 -> 55;
            case 133 -> 17;
            case 134 -> 150;
            case 135 -> 81;
            case 136 -> 196;
            case 137 -> 181;
            case 138 -> 91;
            case 139 -> 78;
            case 140 -> 21;
            case 141 -> 29;
            case 142 -> 229;
            case 143 -> 37;
            case 144 -> 112;
            case 145 -> 101;
            case 146 -> 248;
            case 147 -> 199;
            case 148 -> 169;
            case 149 -> 127;
            case 150 -> 66;
            case 151 -> 94;
            case 152 -> 27;
            case 153 -> 144;
            case 154 -> 216;
            case 155 -> 113;
            case 156 -> 67;
            case 157 -> 106;
            case 158 -> 145;
            case 159 -> 31;
            case 160 -> 207;
            case 161 -> 228;
            case 162 -> 8;
            case 163 -> 4;
            case 164 -> 76;
            case 165 -> 107;
            case 166 -> 105;
            case 167 -> 126;
            case 168 -> 14;
            case 169 -> 157;
            case 170 -> 239;
            case 171 -> 117;
            case 172 -> 33;
            case 173 -> 62;
            case 174 -> 205;
            case 175 -> 163;
            case 176 -> 60;
            case 177 -> 249;
            case 178 -> 86;
            case 179 -> 3;
            case 180 -> 65;
            case 181 -> 153;
            case 182 -> 143;
            case 183 -> 12;
            case 184 -> 240;
            case 185 -> 197;
            case 186 -> 0;
            case 187 -> 92;
            case 188 -> 84;
            case 189 -> 72;
            case 190 -> 218;
            case 191 -> 224;
            case 192 -> 161;
            case 193 -> 58;
            case 194 -> 10;
            case 195 -> 164;
            case 196 -> 133;
            case 197 -> 166;
            case 198 -> 100;
            case 199 -> 87;
            case 200 -> 73;
            case 201 -> 109;
            case 202 -> 206;
            case 203 -> 128;
            case 204 -> 15;
            case 205 -> 23;
            case 206 -> 42;
            case 207 -> 97;
            case 208 -> 46;
            case 209 -> 71;
            case 210 -> 188;
            case 211 -> 137;
            case 212 -> 124;
            case 213 -> 48;
            case 214 -> 120;
            case 215 -> 172;
            case 216 -> 192;
            case 217 -> 189;
            case 218 -> 119;
            case 219 -> 220;
            case 220 -> 96;
            case 221 -> 167;
            case 222 -> 202;
            case 223 -> 18;
            case 224 -> 68;
            case 225 -> 225;
            case 226 -> 221;
            case 227 -> 200;
            case 228 -> 158;
            case 229 -> 108;
            case 230 -> 24;
            case 231 -> 184;
            case 232 -> 251;
            case 233 -> 7;
            case 234 -> 89;
            case 235 -> 226;
            case 236 -> 237;
            case 237 -> 53;
            case 238 -> 155;
            case 239 -> 122;
            case 240 -> 50;
            case 241 -> 93;
            case 242 -> 49;
            case 243 -> 102;
            case 244 -> 195;
            case 245 -> 90;
            case 246 -> 2;
            case 247 -> 59;
            case 248 -> 209;
            case 249 -> 245;
            case 250 -> 198;
            case 251 -> 213;
            case 252 -> 39;
            case 253 -> 70;
            case 254 -> 230;
            default -> 44;
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
   }
}
