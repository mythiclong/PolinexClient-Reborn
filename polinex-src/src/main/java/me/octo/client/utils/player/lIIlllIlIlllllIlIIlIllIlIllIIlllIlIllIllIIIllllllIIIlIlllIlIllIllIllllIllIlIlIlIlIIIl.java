package me.octo.client.utils.player;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.ServerboundMovePlayerPacketAccessor;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Rot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   @NotNull
   public static lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static Vec3 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @Nullable
   private static Integer lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @Nullable
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private static Runnable lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private static ArrayList<Pair<lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private static Pair<? extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, ? extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] c;
   private static String[] d;

   private lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl() {
   }

   public final boolean g() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void a(boolean var1) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1) {
      short var10001 = 28768;
      short var10002 = -12452;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      long var3 = System.currentTimeMillis();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;

      label27:
      while (true) {
         long var6;
         int var5 = (var6 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl - var3) == 0L ? 0 : (var6 < 0L ? -1 : 1);

         do {
            if (var5 > 0) {
               return;
            }

            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl += 17L;
            var5 =(( IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
            if (var2 == null) {
               if (!IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
                  continue label27;
               }

               var5 =(( lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
            }
         } while (var2 != null);

         if (var5 == 0) {
            this.j();
            if (var2 != null) {
               return;
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      Packet var8 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = 28771;
      short var10003 = -629;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var7 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      if (var2 == null) {
         if (!IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
            return;
         }

         var7 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      if (var7) {
         Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var8 = var3;
         label38:
         if (var2 == null) {
            if (!(var3 instanceof Rot)) {
               var8 = var3;
               if (var2 != null) {
                  break label38;
               }

               if (!(var3 instanceof PosRot)) {
                  return;
               }
            }

            var8 = var3;
         }

         ServerboundMovePlayerPacket var4 = (ServerboundMovePlayerPacket)var8;
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var5 = this.i();
         LocalPlayer var10 = this.a().player;
         Intrinsics.checkNotNull(var10);
         float var11 = Math.abs(var10.getYRot() + var5.a());
         LocalPlayer var12 = this.a().player;
         Intrinsics.checkNotNull(var12);
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
            var11, Math.abs(var12.getXRot() + var5.b())
         );
         double var13;
         int var9 = (
                  var13 = var6.a()
                        - Math.abs(((ServerboundMovePlayerPacketAccessor)var4).getRawYaw())
                        + (var6.b() - Math.abs(((ServerboundMovePlayerPacketAccessor)var4).getRawPitch()))
                     - 0.1
               )
               == 0.0
            ? 0
            : (var13 < 0.0 ? -1 : 1);
         if (var2 == null) {
            if (var9 > 0) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
               return;
            }

            var9 = 0;
         }

         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = (var9 != 0);
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
         if (var2 == null) {
            if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.run();
            }
         }

         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      }
   }

   public final void a(@NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1, float var2, boolean var3) {
      short var10001 = 28772;
      short var10002 = -17874;
      Intrinsics.checkNotNullParameter(var1, "rotation");
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
      this.a(999.0, 999.0, 999.0, var3, var2);
   }

   public final void a(int var1, boolean var2, float var3) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;
      if (var4 == null) {
         ClientLevel var6 = this.a().level;
         if (var6 != null) {
            Entity var7 = var6.getEntity(var1);
            if (var7 != null) {
               Entity var5 = var7;
               this.a(var5.getX(), var5.getY(), var5.getZ(), var2, var3);
               return;
            }
         }
      }
   }

   public final void a(@NotNull Vec3 var1, boolean var2, float var3) {
      short var10001 = 28770;
      short var10002 = 32384;
      Intrinsics.checkNotNullParameter(var1, "vec");
      this.a(var1.x, var1.y, var1.z, var2, var3);
   }

   private final void a(double var1, double var3, double var5, boolean var7, float var8) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Vec3(var1, var3, var5);
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var10 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9 = var10000;
      double var12;
      int var11 = (var12 = Math.abs(var10.a()) + Math.abs(var10.b()) - 0.1) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
      if (var9 == null) {
         if (var11 < 0) {
            if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll != null) {
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.run();
            }

            this.h();
            return;
         }

         IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var8;
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var7;
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = System.currentTimeMillis() - 350L;
         var11 =(( IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0);
      }

      if (var9 == null) {
         if (var11 == 0) {
            IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = (Pair<? extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, ? extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)CollectionsKt.random(
               llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI, (Random)Random.Default
            );
         }

         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 5.0F;
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
         var11 = 0;
      }

      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (var11 != 0);
   }

   public final void h() {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
   }

   public final void a(@NotNull Runnable var1) {
      short var10001 = 28769;
      short var10002 = -11904;
      Intrinsics.checkNotNullParameter(var1, "callback");
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI i() {
      Object var13 = null; // PX-FIX
      Object var12 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var2 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var9 = var2;
      if (var1 == null) {
         if (var2 == null) {
            label38: {
               label45: {
                  Object var10 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  if (var1 == null) {
                     if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
                        break label45;
                     }

                     var10 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  }

                  label31: {
                     int var6 = ((me.octo.client.PXDyn)var10).intValue();
                     boolean var7 = false;
                     if (var1 == null) {
                        ClientLevel var11 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().level;
                        if (var11 != null) {
                           var12 = var11.getEntity(var6);
                           break label31;
                        }
                     }

                     var12 = null;
                  }

                  if (var12 != null) {
                     var13 = ((me.octo.client.PXDyn)var12).getEyePosition();
                     if (var13 != null) {
                        break label38;
                     }
                  }
               }

               var13 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            Vec3 var8 =((Vec3)( var13));
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var3 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .c(var8);
            if (IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
               float var10001 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var8)
                        .b()
                  );
               LocalPlayer var10002 = this.a().player;
               Intrinsics.checkNotNull(var10002);
               var3.b(var10001 - var10002.getXRot());
            }

            return var3;
         }

         var9 = var2;
      }

      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var4 = var9;
      boolean var5 = false;
      return lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(var4);
   }

   private final void j() {
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var2 = this.i();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      float var3 = var2.a();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      float var4 = var2.b();
      float var5 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var3, var4);
      float var20 = var5;
      float var10001 = 0.2F;
      if (var1 == null) {
         if (var5 < 0.2F) {
            LocalPlayer var27 = this.a().player;
            Intrinsics.checkNotNull(var27);
            LocalPlayer var15 = var27;
            var15.setYRot(var15.getYRot() + var3);
            LocalPlayer var28 = this.a().player;
            Intrinsics.checkNotNull(var28);
            var15 = var28;
            var15.setXRot(var15.getXRot() + var4);
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
            return;
         }

         var20 = var3;
         var10001 = var5;
      }

      float var6 = var20 / var10001;
      float var7 = var4 / var5;
      float var8 = var7 / var6;
      float var9 = var6 / var7;
      IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var21 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      float var10003 = var3;
      if (var1 == null) {
         var10003 = var3 < 0.0F ? -1.0F : 1.0F;
      }

      var10003 = var10003
         * IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         * ((lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.getFirst())
            .a(var3);
      float var10004 = var8;
      if (var1 == null) {
         var10004 = var8 > var9 ? 0.5F : 1.0F;
      }

      float var10 = var21.a(-5.0F, 5.0F, var10003 * var10004 * IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
      IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var22 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var10003 = var4;
      if (var1 == null) {
         var10003 = var4 < 0.0F ? -1.0F : 1.0F;
      }

      var10003 = var10003
         * IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         * ((lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.getSecond())
            .a(var4);
      var10004 = var9;
      if (var1 == null) {
         var10004 = var9 > var8 ? 0.5F : 1.0F;
      }

      float var11 = var22.a(-5.0F, 5.0F, var10003 * var10004 * IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var12 = this.a(Math.abs(var3 / var5), Math.abs(var4 / var5));
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var13 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
         var10 + var12.a(), var11 + var12.b()
      );
      if (IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var13.a(), var13.b())
         > var5) {
         LocalPlayer var23 = this.a().player;
         Intrinsics.checkNotNull(var23);
         LocalPlayer var14 = var23;
         var14.setYRot(var14.getYRot() + var2.a());
         LocalPlayer var24 = this.a().player;
         Intrinsics.checkNotNull(var24);
         var14 = var24;
         var14.setXRot(var14.getXRot() + var2.b());
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
         if (var1 == null) {
            return;
         }
      }

      LocalPlayer var18;
      float var31;
      label61: {
         LocalPlayer var25 = this.a().player;
         Intrinsics.checkNotNull(var25);
         var18 = var25;
         var10001 = var18.getYRot();
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var10002 = var13;
         if (var1 == null) {
            if (Math.abs(var13.a()) > Math.abs(var3)) {
               var31 = var3;
               break label61;
            }

            var10002 = var13;
         }

         var31 = var10002.a();
      }

      label55: {
         var18.setYRot(var10001 + var31);
         LocalPlayer var26 = this.a().player;
         Intrinsics.checkNotNull(var26);
         var18 = var26;
         var10001 = var18.getXRot();
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var32 = var13;
         if (var1 == null) {
            if (Math.abs(var13.b()) > Math.abs(var4)) {
               var31 = var4;
               break label55;
            }

            var32 = var13;
         }

         var31 = var32.b();
      }

      var18.setXRot(var10001 + var31);
   }

   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI a(float var1, float var2) {
      float var4 = 1 - var1;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      float var5 = 1 - var2;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      long var7;
      int var6 = (var7 = System.currentTimeMillis() - llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI - 175L) == 0L
         ? 0
         : (var7 < 0L ? -1 : 1);
      if (var3 == null) {
         if (var6 < 0) {
            return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         }

         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = System.currentTimeMillis();
         var6 = Random.Default.nextInt(5);
      }

      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var6 == 0
         ? new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
            (Random.Default.nextFloat() - 0.5F) * 2 * 0.1F * var4, (Random.Default.nextFloat() - 0.5F) * 2 * 0.1F * var5
         )
         : new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(0.0F, 0.0F);
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "+\u0099\u0003¾å\bÀÇ±\u0082\u008dú\u0006ó\u0003ñ¸/\u0005\u0092G4e\u0003";
      int var4 = "+\u0099\u0003¾å\bÀÇ±\u0082\u008dú\u0006ó\u0003ñ¸/\u0005\u0092G4e\u0003".length();
      char var1 = 5;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 113;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = var10000;
               var22 = var27;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var27;
                  var36 = var10000;
                  var10006 = var6;
               } else {
                  var30 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var27;
                  var36 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 126;
                     case 1 -> 42;
                     case 2 -> 90;
                     case 3 -> 65;
                     case 4 -> 44;
                     case 5 -> 93;
                     default -> 32;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var40 = var22;
                     var36 = var30;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var40 = var22;
                     var36 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[6];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl();
                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Vec3(0.0, 0.0, 0.0);
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = System.currentTimeMillis();
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                        0.0F, 0.0F
                     );
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 1.0F;
                     Pair[] var7 = new Pair[]{
                        new Pair(
                           new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(),
                           new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll()
                        ),
                        new Pair(
                           new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(),
                           new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()
                        )
                     };
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = CollectionsKt.arrayListOf(var7);
                     Object var11 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.get(0);
                     var10002 = 28773;
                     short var33 = 29706;
                     Intrinsics.checkNotNullExpressionValue(var11, "get(...)");
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = (Pair<? extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, ? extends lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var11;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "ù$ÿ~\u000b\u0083L\u0092\bÏ3\u008e\u009e\u007f¸\u0092\u001d";
                  var4 = "ù$ÿ~\u000b\u0083L\u0092\bÏ3\u008e\u009e\u007f¸\u0092\u001d".length();
                  var1 = '\b';
                  var9 = -1;
            }

            var10000 = 115;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 28768) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 12;
            case 1 -> 165;
            case 2 -> 219;
            case 3 -> 229;
            case 4 -> 74;
            case 5 -> 109;
            case 6 -> 159;
            case 7 -> 3;
            case 8 -> 121;
            case 9 -> 98;
            case 10 -> 28;
            case 11 -> 68;
            case 12 -> 253;
            case 13 -> 6;
            case 14 -> 93;
            case 15 -> 1;
            case 16 -> 62;
            case 17 -> 240;
            case 18 -> 214;
            case 19 -> 149;
            case 20 -> 247;
            case 21 -> 146;
            case 22 -> 10;
            case 23 -> 176;
            case 24 -> 170;
            case 25 -> 111;
            case 26 -> 189;
            case 27 -> 139;
            case 28 -> 56;
            case 29 -> 21;
            case 30 -> 228;
            case 31 -> 67;
            case 32 -> 40;
            case 33 -> 207;
            case 34 -> 163;
            case 35 -> 183;
            case 36 -> 27;
            case 37 -> 22;
            case 38 -> 42;
            case 39 -> 150;
            case 40 -> 202;
            case 41 -> 211;
            case 42 -> 86;
            case 43 -> 116;
            case 44 -> 39;
            case 45 -> 33;
            case 46 -> 128;
            case 47 -> 251;
            case 48 -> 188;
            case 49 -> 29;
            case 50 -> 216;
            case 51 -> 57;
            case 52 -> 11;
            case 53 -> 234;
            case 54 -> 92;
            case 55 -> 148;
            case 56 -> 151;
            case 57 -> 79;
            case 58 -> 50;
            case 59 -> 80;
            case 60 -> 110;
            case 61 -> 9;
            case 62 -> 239;
            case 63 -> 48;
            case 64 -> 197;
            case 65 -> 52;
            case 66 -> 83;
            case 67 -> 187;
            case 68 -> 18;
            case 69 -> 82;
            case 70 -> 0;
            case 71 -> 155;
            case 72 -> 134;
            case 73 -> 60;
            case 74 -> 25;
            case 75 -> 141;
            case 76 -> 81;
            case 77 -> 194;
            case 78 -> 71;
            case 79 -> 185;
            case 80 -> 231;
            case 81 -> 41;
            case 82 -> 230;
            case 83 -> 70;
            case 84 -> 222;
            case 85 -> 45;
            case 86 -> 36;
            case 87 -> 131;
            case 88 -> 87;
            case 89 -> 94;
            case 90 -> 26;
            case 91 -> 182;
            case 92 -> 130;
            case 93 -> 103;
            case 94 -> 23;
            case 95 -> 177;
            case 96 -> 96;
            case 97 -> 145;
            case 98 -> 114;
            case 99 -> 215;
            case 100 -> 102;
            case 101 -> 243;
            case 102 -> 236;
            case 103 -> 78;
            case 104 -> 119;
            case 105 -> 221;
            case 106 -> 179;
            case 107 -> 55;
            case 108 -> 161;
            case 109 -> 152;
            case 110 -> 117;
            case 111 -> 85;
            case 112 -> 203;
            case 113 -> 244;
            case 114 -> 217;
            case 115 -> 142;
            case 116 -> 199;
            case 117 -> 173;
            case 118 -> 144;
            case 119 -> 59;
            case 120 -> 69;
            case 121 -> 218;
            case 122 -> 254;
            case 123 -> 238;
            case 124 -> 250;
            case 125 -> 210;
            case 126 -> 135;
            case 127 -> 49;
            case 128 -> 125;
            case 129 -> 15;
            case 130 -> 99;
            case 131 -> 32;
            case 132 -> 53;
            case 133 -> 106;
            case 134 -> 201;
            case 135 -> 64;
            case 136 -> 16;
            case 137 -> 63;
            case 138 -> 132;
            case 139 -> 204;
            case 140 -> 37;
            case 141 -> 180;
            case 142 -> 175;
            case 143 -> 88;
            case 144 -> 8;
            case 145 -> 233;
            case 146 -> 122;
            case 147 -> 195;
            case 148 -> 223;
            case 149 -> 66;
            case 150 -> 13;
            case 151 -> 14;
            case 152 -> 226;
            case 153 -> 156;
            case 154 -> 35;
            case 155 -> 19;
            case 156 -> 58;
            case 157 -> 147;
            case 158 -> 140;
            case 159 -> 38;
            case 160 -> 200;
            case 161 -> 118;
            case 162 -> 127;
            case 163 -> 143;
            case 164 -> 162;
            case 165 -> 242;
            case 166 -> 54;
            case 167 -> 113;
            case 168 -> 123;
            case 169 -> 126;
            case 170 -> 209;
            case 171 -> 154;
            case 172 -> 112;
            case 173 -> 186;
            case 174 -> 213;
            case 175 -> 220;
            case 176 -> 5;
            case 177 -> 178;
            case 178 -> 43;
            case 179 -> 34;
            case 180 -> 100;
            case 181 -> 61;
            case 182 -> 129;
            case 183 -> 137;
            case 184 -> 136;
            case 185 -> 89;
            case 186 -> 208;
            case 187 -> 252;
            case 188 -> 167;
            case 189 -> 95;
            case 190 -> 7;
            case 191 -> 76;
            case 192 -> 169;
            case 193 -> 133;
            case 194 -> 101;
            case 195 -> 235;
            case 196 -> 31;
            case 197 -> 120;
            case 198 -> 164;
            case 199 -> 46;
            case 200 -> 198;
            case 201 -> 181;
            case 202 -> 73;
            case 203 -> 84;
            case 204 -> 20;
            case 205 -> 90;
            case 206 -> 192;
            case 207 -> 212;
            case 208 -> 77;
            case 209 -> 157;
            case 210 -> 193;
            case 211 -> 227;
            case 212 -> 91;
            case 213 -> 138;
            case 214 -> 166;
            case 215 -> 205;
            case 216 -> 190;
            case 217 -> 158;
            case 218 -> 2;
            case 219 -> 44;
            case 220 -> 232;
            case 221 -> 174;
            case 222 -> 191;
            case 223 -> 107;
            case 224 -> 97;
            case 225 -> 184;
            case 226 -> 225;
            case 227 -> 206;
            case 228 -> 17;
            case 229 -> 237;
            case 230 -> 51;
            case 231 -> 245;
            case 232 -> 30;
            case 233 -> 124;
            case 234 -> 24;
            case 235 -> 72;
            case 236 -> 47;
            case 237 -> 255;
            case 238 -> 104;
            case 239 -> 108;
            case 240 -> 249;
            case 241 -> 65;
            case 242 -> 246;
            case 243 -> 105;
            case 244 -> 168;
            case 245 -> 75;
            case 246 -> 171;
            case 247 -> 224;
            case 248 -> 172;
            case 249 -> 241;
            case 250 -> 160;
            case 251 -> 115;
            case 252 -> 196;
            case 253 -> 4;
            case 254 -> 248;
            default -> 153;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      implements lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Override
      public float a(float var1) {
         return (float)Math.pow((Math.abs(var1) + 4.0F) * 0.01F, 1.4F) + 0.4F;
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      implements lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Override
      public float a(float var1) {
         return (float)Math.exp(Math.abs(var1) * 0.01F) - 0.45F;
      }
   }

   public interface llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      float a(float var1);
   }

   public static void a(lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var0, lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var1, float var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = 1.0F;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      var0.a(var1, var2, var3);
   }

   public static void a(lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var0, int var1, boolean var2, float var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = false;
      }

      if ((var4 & 4) != 0) {
         var3 = 1.0F;
      }

      var0.a(var1, var2, var3);
   }

   public static void a(lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var0, Vec3 var1, boolean var2, float var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = false;
      }

      if ((var4 & 4) != 0) {
         var3 = 1.0F;
      }

      var0.a(var1, var2, var3);
   }
}
