package me.octo.client.utils.player;

import com.mojang.blaze3d.platform.InputConstants.Type;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.MultiPlayerGameModeAccessor;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.game.ServerboundInteractPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] c;
   private static String[] d;

   private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private final boolean h() {
      return ((java.util.function.Supplier<Boolean>)(() -> { IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .k()
         .a(100); return false; })).get();
   }

   @SubscribeEvent(
      priority = EventPriority.LOWEST
   )
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3771;
      short var10003 = -24227;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var3 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      if (var2 != null) {
         if (!lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
            return;
         }

         var3 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      label26: {
         label35: {
            if (var2 != null) {
               if (!var3) {
                  break label35;
               }

               var3 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            if (var3) {
               p();
               if (var2 != null) {
                  break label26;
               }
            }

            m();
            if (var2 != null) {
               break label26;
            }
         }

         l();
      }

      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
   }

   public final boolean i() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      boolean var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(
         Integer.valueOf(lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
      );
      if (var1 != null) {
         label20:
         if (var10000) {
            var10000 = this.h();
            if (var1 != null) {
               if (!var10000) {
                  break label20;
               }

               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
               this.r();
               var10000 = true;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   public final boolean j() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      boolean var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(
         Integer.valueOf(lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
      );
      if (var1 != null) {
         label20:
         if (var10000) {
            var10000 = this.h();
            if (var1 != null) {
               if (!var10000) {
                  break label20;
               }

               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
               this.r();
               var10000 = true;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   public final boolean k() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      boolean var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(
         Integer.valueOf(lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)
      );
      if (var1 != null) {
         label20:
         if (var10000) {
            var10000 = this.h();
            if (var1 != null) {
               if (!var10000) {
                  break label20;
               }

               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
               var10000 = true;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   @JvmStatic
   public static final void l() {
      n();
   }

   @JvmStatic
   public static final void m() {
      o();
   }

   @JvmStatic
   public static final void n() {
      KeyMapping.click(Type.MOUSE.getOrCreate(0));
   }

   @JvmStatic
   public static final void o() {
      KeyMapping.click(Type.MOUSE.getOrCreate(1));
   }

   @JvmStatic
   public static final void p() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = var10000;
      if (var0 != null) {
         LocalPlayer var3 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
         if (var3 != null) {
            LocalPlayer var1 = var3;
            boolean var2 = false;
            if (var0 != null) {
               ClientPacketListener var4 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().getConnection();
               if (var4 != null) {
                  InteractionHand var10003 = InteractionHand.MAIN_HAND;
                  int var10004 = var1.inventoryMenu.incrementStateId();
                  LocalPlayer var10005 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                  Intrinsics.checkNotNull(var10005);
                  float var5 = var10005.getYRot();
                  LocalPlayer var10006 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                  Intrinsics.checkNotNull(var10006);
                  var4.send(new ServerboundUseItemPacket(var10003, var10004, var5, var10006.getXRot()));
               }
            }
         }
      }
   }

   @JvmStatic
   public static final boolean a(float var0, float var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         LocalPlayer var5 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
         if (var5 != null) {
            LocalPlayer var3 = var5;
            boolean var4 = false;
            if (var2 != null) {
               ClientPacketListener var6 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().getConnection();
               if (var6 != null) {
                  var6.send(new ServerboundUseItemPacket(InteractionHand.MAIN_HAND, var3.inventoryMenu.incrementStateId(), var0, var1));
               }
            }
         }
      }

      return true;
   }

   public final void a(@NotNull String var1) {
      short var10001 = 3770;
      short var10002 = -14491;
      Intrinsics.checkNotNullParameter(var1, "itemId");
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(() -> b(var1));
   }

   public final void b(int var1) {
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(() -> c(var1));
   }

   private final void q() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         MultiPlayerGameMode var10000 = this.a().gameMode;
         if (var10000 != null) {
            MultiPlayerGameMode var2 = var10000;
            boolean var3 = false;
            ((MultiPlayerGameModeAccessor)var2).invokeEnsureHasSentCarriedItem();
         }
      }
   }

   private final void r() {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 75
         + me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .nextInt(75);
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.f();
   }

   public final void a(@NotNull Entity var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3774;
      int var10003 = 5516;
      Intrinsics.checkNotNullParameter(var1, "entity");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 != null) {
         ClientPacketListener var3 = this.a().getConnection();
         if (var3 != null) {
            var10003 = var1.getId();
            InteractionHand var10004 = InteractionHand.MAIN_HAND;
            Vec3 var10005 = var1.position();
            LocalPlayer var10006 = this.a().player;
            Intrinsics.checkNotNull(var10006);
            var3.send(new ServerboundInteractPacket(var10003, var10004, var10005, var10006.isShiftKeyDown()));
         }
      }

      LocalPlayer var4 = this.a().player;
      if (var4 != null) {
         var4.swing(InteractionHand.MAIN_HAND);
      }
   }

   public final void a(int var1, int var2, @NotNull ContainerInput var3) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 3775;
      short var10003 = 14176;
      Intrinsics.checkNotNullParameter(var3, "actionType");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;
      LocalPlayer var5 = this.a().player;
      LocalPlayer var9 = var5;
      if (var4 != null) {
         if (var5 == null) {
            return;
         }

         var9 = var5;
      }

      int var6 = var9.containerMenu.containerId;
      if (var4 != null) {
         MultiPlayerGameMode var10 = this.a().gameMode;
         if (var10 != null) {
            var10.handleContainerInput(var6, var1, var2, var3, var5);
         }
      }
   }

   private static final Unit b(String var0) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            boolean var3 = false;
            int var4 = 0;

            while (var4 < 9) {
               ItemStack var7 = var2.getInventory().getItem(var4);
               short var10002 = 3773;
               short var10003 = -28256;
               Intrinsics.checkNotNullExpressionValue(var7, "getItem(...)");
               ItemStack var5 = var7;
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  if (Intrinsics.areEqual(
                     var0,
                     IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g(var5)
                  )) {
                     int var6 = var2.getInventory().getSelectedSlot();
                     var2.getInventory().setSelectedSlot(var4);
                     try {
                        Thread.sleep(55L);
                     }
                     catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                     }
                     me.octo.client.utils.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var8 = me.octo.client.utils.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     InteractionHand var9 = InteractionHand.MAIN_HAND;
                     int var10004 = var2.inventoryMenu.incrementStateId();
                     LocalPlayer var10005 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                     Intrinsics.checkNotNull(var10005);
                     float var10 = var10005.getYRot();
                     LocalPlayer var10006 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                     Intrinsics.checkNotNull(var10006);
                     var8.a(new ServerboundUseItemPacket(var9, var10004, var10, var10006.getXRot()));
                     try {
                        Thread.sleep(55L);
                     }
                     catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                     }
                     var2.getInventory().setSelectedSlot(var6);
                     return Unit.INSTANCE;
                  }

                  var4++;
               }

               if (var1 == null) {
                  break;
               }
            }
         }
      }

      return Unit.INSTANCE;
   }

   private static final Unit c(int var0) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var1 != null) {
         LocalPlayer var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            boolean var3 = false;
            int var4 = 0;

            while (var4 < 9) {
               ItemStack var7 = var2.getInventory().getItem(var4);
               short var10002 = 3772;
               short var10003 = 1698;
               Intrinsics.checkNotNullExpressionValue(var7, "getItem(...)");
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  if (var4 == var0) {
                     int var6 = var2.getInventory().getSelectedSlot();
                     var2.getInventory().setSelectedSlot(var4);
                     try {
                        Thread.sleep(100L);
                     }
                     catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                     }
                     me.octo.client.utils.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var8 = me.octo.client.utils.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     InteractionHand var9 = InteractionHand.MAIN_HAND;
                     int var10004 = var2.inventoryMenu.incrementStateId();
                     LocalPlayer var10005 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                     Intrinsics.checkNotNull(var10005);
                     float var10 = var10005.getYRot();
                     LocalPlayer var10006 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
                     Intrinsics.checkNotNull(var10006);
                     var8.a(new ServerboundUseItemPacket(var9, var10004, var10, var10006.getXRot()));
                     try {
                        Thread.sleep(250L);
                     }
                     catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                     }
                     var2.getInventory().setSelectedSlot(var6);
                     return Unit.INSTANCE;
                  }

                  var4++;
               }

               if (var1 == null) {
                  break;
               }
            }
         }
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "ñ\u0011;\u0017#-\nÁZ¹Òh\u0082#7\u0095m\f\u0000\u0084Gï¬\nú\u001dî\u0018ç\u000b\f9h`rH¹fk}Ö\u0095Ò";
      int var4 = "ñ\u0011;\u0017#-\nÁZ¹Òh\u0082#7\u0095m\f\u0000\u0084Gï¬\nú\u001dî\u0018ç\u000b\f9h`rH¹fk}Ö\u0095Ò".length();
      char var1 = 6;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 119;
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
                     case 0 -> 65;
                     case 1 -> 35;
                     case 2 -> 9;
                     case 3 -> 2;
                     case 4 -> 114;
                     case 5 -> 43;
                     default -> 47;
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
                     d = new String[6];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 50
                        + me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                           .nextInt(12);
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

                  var2 = "M\u0090\u0088Âã¶\u0005~Ëcè£";
                  var4 = "M\u0090\u0088Âã¶\u0005~Ëcè£".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 1;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 3774) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 51;
            case 1 -> 128;
            case 2 -> 237;
            case 3 -> 13;
            case 4 -> 212;
            case 5 -> 126;
            case 6 -> 109;
            case 7 -> 28;
            case 8 -> 116;
            case 9 -> 72;
            case 10 -> 158;
            case 11 -> 191;
            case 12 -> 133;
            case 13 -> 1;
            case 14 -> 102;
            case 15 -> 56;
            case 16 -> 63;
            case 17 -> 203;
            case 18 -> 157;
            case 19 -> 204;
            case 20 -> 50;
            case 21 -> 108;
            case 22 -> 44;
            case 23 -> 43;
            case 24 -> 209;
            case 25 -> 239;
            case 26 -> 132;
            case 27 -> 118;
            case 28 -> 74;
            case 29 -> 143;
            case 30 -> 251;
            case 31 -> 225;
            case 32 -> 57;
            case 33 -> 137;
            case 34 -> 135;
            case 35 -> 176;
            case 36 -> 139;
            case 37 -> 252;
            case 38 -> 120;
            case 39 -> 23;
            case 40 -> 87;
            case 41 -> 247;
            case 42 -> 178;
            case 43 -> 216;
            case 44 -> 30;
            case 45 -> 85;
            case 46 -> 65;
            case 47 -> 36;
            case 48 -> 147;
            case 49 -> 208;
            case 50 -> 145;
            case 51 -> 148;
            case 52 -> 231;
            case 53 -> 194;
            case 54 -> 81;
            case 55 -> 75;
            case 56 -> 107;
            case 57 -> 106;
            case 58 -> 190;
            case 59 -> 127;
            case 60 -> 20;
            case 61 -> 6;
            case 62 -> 2;
            case 63 -> 189;
            case 64 -> 188;
            case 65 -> 167;
            case 66 -> 146;
            case 67 -> 88;
            case 68 -> 47;
            case 69 -> 187;
            case 70 -> 162;
            case 71 -> 210;
            case 72 -> 101;
            case 73 -> 177;
            case 74 -> 205;
            case 75 -> 175;
            case 76 -> 94;
            case 77 -> 73;
            case 78 -> 254;
            case 79 -> 113;
            case 80 -> 41;
            case 81 -> 155;
            case 82 -> 26;
            case 83 -> 236;
            case 84 -> 22;
            case 85 -> 40;
            case 86 -> 235;
            case 87 -> 122;
            case 88 -> 37;
            case 89 -> 164;
            case 90 -> 105;
            case 91 -> 99;
            case 92 -> 250;
            case 93 -> 233;
            case 94 -> 229;
            case 95 -> 198;
            case 96 -> 206;
            case 97 -> 173;
            case 98 -> 90;
            case 99 -> 161;
            case 100 -> 159;
            case 101 -> 69;
            case 102 -> 77;
            case 103 -> 211;
            case 104 -> 214;
            case 105 -> 222;
            case 106 -> 32;
            case 107 -> 11;
            case 108 -> 67;
            case 109 -> 134;
            case 110 -> 197;
            case 111 -> 169;
            case 112 -> 166;
            case 113 -> 174;
            case 114 -> 0;
            case 115 -> 79;
            case 116 -> 8;
            case 117 -> 213;
            case 118 -> 84;
            case 119 -> 18;
            case 120 -> 238;
            case 121 -> 82;
            case 122 -> 153;
            case 123 -> 86;
            case 124 -> 140;
            case 125 -> 168;
            case 126 -> 230;
            case 127 -> 182;
            case 128 -> 130;
            case 129 -> 245;
            case 130 -> 111;
            case 131 -> 89;
            case 132 -> 228;
            case 133 -> 149;
            case 134 -> 49;
            case 135 -> 154;
            case 136 -> 58;
            case 137 -> 246;
            case 138 -> 136;
            case 139 -> 192;
            case 140 -> 179;
            case 141 -> 207;
            case 142 -> 201;
            case 143 -> 80;
            case 144 -> 195;
            case 145 -> 114;
            case 146 -> 253;
            case 147 -> 115;
            case 148 -> 219;
            case 149 -> 221;
            case 150 -> 59;
            case 151 -> 171;
            case 152 -> 151;
            case 153 -> 200;
            case 154 -> 100;
            case 155 -> 16;
            case 156 -> 242;
            case 157 -> 156;
            case 158 -> 29;
            case 159 -> 68;
            case 160 -> 55;
            case 161 -> 215;
            case 162 -> 78;
            case 163 -> 104;
            case 164 -> 7;
            case 165 -> 15;
            case 166 -> 121;
            case 167 -> 39;
            case 168 -> 96;
            case 169 -> 38;
            case 170 -> 223;
            case 171 -> 110;
            case 172 -> 103;
            case 173 -> 53;
            case 174 -> 152;
            case 175 -> 83;
            case 176 -> 64;
            case 177 -> 248;
            case 178 -> 98;
            case 179 -> 95;
            case 180 -> 3;
            case 181 -> 226;
            case 182 -> 61;
            case 183 -> 220;
            case 184 -> 196;
            case 185 -> 10;
            case 186 -> 66;
            case 187 -> 93;
            case 188 -> 76;
            case 189 -> 24;
            case 190 -> 141;
            case 191 -> 240;
            case 192 -> 217;
            case 193 -> 227;
            case 194 -> 255;
            case 195 -> 14;
            case 196 -> 160;
            case 197 -> 193;
            case 198 -> 199;
            case 199 -> 234;
            case 200 -> 185;
            case 201 -> 33;
            case 202 -> 34;
            case 203 -> 46;
            case 204 -> 12;
            case 205 -> 144;
            case 206 -> 181;
            case 207 -> 27;
            case 208 -> 97;
            case 209 -> 70;
            case 210 -> 17;
            case 211 -> 119;
            case 212 -> 52;
            case 213 -> 232;
            case 214 -> 21;
            case 215 -> 60;
            case 216 -> 142;
            case 217 -> 91;
            case 218 -> 62;
            case 219 -> 186;
            case 220 -> 224;
            case 221 -> 150;
            case 222 -> 184;
            case 223 -> 45;
            case 224 -> 180;
            case 225 -> 48;
            case 226 -> 241;
            case 227 -> 92;
            case 228 -> 243;
            case 229 -> 31;
            case 230 -> 25;
            case 231 -> 170;
            case 232 -> 35;
            case 233 -> 129;
            case 234 -> 125;
            case 235 -> 123;
            case 236 -> 54;
            case 237 -> 172;
            case 238 -> 4;
            case 239 -> 5;
            case 240 -> 138;
            case 241 -> 244;
            case 242 -> 183;
            case 243 -> 131;
            case 244 -> 249;
            case 245 -> 19;
            case 246 -> 117;
            case 247 -> 202;
            case 248 -> 163;
            case 249 -> 9;
            case 250 -> 165;
            case 251 -> 42;
            case 252 -> 218;
            case 253 -> 112;
            case 254 -> 124;
            default -> 71;
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
}
