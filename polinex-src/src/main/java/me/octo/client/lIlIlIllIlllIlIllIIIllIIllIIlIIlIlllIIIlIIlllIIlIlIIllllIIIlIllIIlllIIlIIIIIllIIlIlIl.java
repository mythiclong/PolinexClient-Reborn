package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.ServerboundMovePlayerPacketAccessor;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundChatPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemOnPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Rot;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

   public static ArrayList<Vec3> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   public static ArrayList<Vec3> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

   private static boolean lambda$onPacket$0(net.minecraft.world.phys.Vec3 var0, net.minecraft.world.phys.Vec3 var1) {
      int[] var2 = k();
      double var3;
      int var10000 = (var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(new net.minecraft.world.phys.Vec3(var0.x(), var0.y(), var0.z()), var1) - 1.0) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
      if (var2 != null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return var10000 != 0;
   }
   private static boolean lambda$onPacket$1(net.minecraft.world.phys.Vec3 var0, net.minecraft.world.phys.Vec3 var1) {
      int[] var2 = k();
      double var3;
      int var10000 = (var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(new net.minecraft.world.phys.Vec3(var0.x(), var0.y(), var0.z()), var1) - 1.0) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
      if (var2 != null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return var10000 != 0;
   }
   private static boolean lambda$onPacket$2(net.minecraft.world.phys.Vec3 var0, net.minecraft.world.phys.Vec3 var1) {
      int[] var2 = k();
      double var3;
      int var10000 = (var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(new net.minecraft.world.phys.Vec3(var0.x(), var0.y(), var0.z()), var1) - 1.0) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
      if (var2 != null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return var10000 != 0;
   }
   private static boolean lambda$onPacket$3(net.minecraft.world.phys.Vec3 var0, net.minecraft.world.phys.Vec3 var1) {
      int[] var2 = k();
      double var3;
      int var10000 = (var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(new net.minecraft.world.phys.Vec3(var0.x(), var0.y(), var0.z()), var1) - 1.0) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
      if (var2 != null) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return var10000 != 0;
   }
   private static boolean lambda$onPacket$4(net.minecraft.core.BlockPos var0, net.minecraft.core.BlockPos var1, me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2) {
      int[] var3 = k();
      boolean var10000 = var2.a().equals(var0);
      if (var3 != null) {
         if (!var10000) {
            var10000 = var2.a().equals(var1);
            if (var3 == null) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final List<Vec3> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new LinkedList<>();
   private final List<float[]> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new LinkedList<>();
   private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
   private double lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0F;
   public static BlockPos lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private BlockPos IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private ClientboundPlayerPositionPacket IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static int[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] a;
   private static String[] d;

   public lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl(String var1) {
      super(var1);
      int[] var10000 = k();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
      int[] var2 = var10000;
      if (var2 == null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }
   }

   private static void h() {
      int[] var0 = k();
      long var1;
      int var10000 = (var1 = System.currentTimeMillis() - IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI - 3000L) == 0L
         ? 0
         : (var1 < 0L ? -1 : 1);
      if (var0 != null) {
         if (var10000 > 0) {
            return;
         }

         var10000 = 1;
      }

      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (var10000 != 0);
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var42 = null; // PX-FIX
      Object var39 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      Object var32 = null; // PX-FIX
      Object var26 = null; // PX-FIX
      int[] var2 = k();
      Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var2 != null) {
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            == null) {
            return;
         }

         var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var10000.level != null) {
         if (!me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.n()) {
            Packet var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            Packet var31 = var4;
            if (var2 != null) {
               if (!(var4 instanceof ClientboundPlayerPositionPacket)) {
                  return;
               }

               var31 = var4;
            }

            ClientboundPlayerPositionPacket var3;
            label648: {
               var3 = (ClientboundPlayerPositionPacket)var31;
               var32 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .tickCount;
               byte var10001 = 100;
               if (var2 != null) {
                  if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                        .tickCount
                     < 100) {
                     return;
                  }

                  var32 = IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  if (var2 == null) {
                     break label648;
                  }

                  var10001 = 100;
               }

               if (((Integer)var32) < var10001) {
                  return;
               }

               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
               var32 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .M();
            }

            label618: {
               label650: {
                  if (var2 != null) {
                     if (((Boolean)(var32))) {
                        var32 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .N();
                        if (var2 == null) {
                           break label618;
                        }

                        if (((Boolean)(var32))) {
                           break label650;
                        }
                     }

                     var32 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  }

                  if (var2 == null) {
                     break label618;
                  }

                  if (!((Boolean)var32)) {
                     var32 = me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a(var3);
                     if (var2 == null) {
                        break label618;
                     }

                     if (!((Boolean)var32)) {
                        return;
                     }
                  }
               }

               var32 = IIIlIlIlIIlIIIIlIlIIIIlIlIIIIlllllIlIllllIIllIllIllIIlIlIIIIllllllIlIIllIlllIIIIlIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                  .a()
                  .ae();
            }

            label602: {
               if (var2 != null) {
                  if (((Boolean)(var32))) {
                     break label602;
                  }

                  var32 = 10;
               }

               String[] var33 = new String[((Integer)(var32))];
               String var10003 = String.valueOf(var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
               short var10004 = 24179;
               short var10005 = -22211;
               var33[0] = "Packet " + var10003;
               short var67 = 24166;
               var10004 = -25823;
               var33[1] = "Info:";
               int var68 = var3.id();
               var10004 = 24188;
               var10005 = -16434;
               var33[2] = "ID: " + var68;
               var10003 = String.valueOf(var3.change().position());
               var10004 = 24165;
               var10005 = -7769;
               var33[3] = "Position: " + var10003;
               float var70 = var3.change().xRot();
               float var82 = var3.change().yRot();
               var10005 = 24181;
               short var10006 = 24903;
               var10006 = 24180;
               short var10007 = 30046;
               var33[4] = "Rotation: pitch" + var70 + " | yaw: " + var82;
               var10003 = String.valueOf(var3.change().deltaMovement());
               var10004 = 24167;
               var10005 = -25376;
               var33[5] = "Dleta Movement: " + var10003;
               var10003 = String.valueOf(var3.type());
               var10004 = 24171;
               var10005 = 8160;
               var33[6] = "Type: " + var10003;
               var10003 = String.valueOf(var3.type().flow());
               var10004 = 24164;
               var10005 = -27774;
               var33[7] = "Flow: " + var10003;
               var10003 = String.valueOf(var3.type().id());
               var10004 = 24161;
               var10005 = 2642;
               var33[8] = "Type Identifier: " + var10003;
               var10003 = String.valueOf(var3.relatives().stream().toList());
               var10004 = 24186;
               var10005 = 26129;
               var33[9] = "Relatives (happy family): " + var10003;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(var33);
            }

            Vec3 var5;
            var26 = var3.change();
            var5 = ((me.octo.client.PXDyn)var26).position();
            double var97;
            var34 = (var97 = var5.x() - 0.0) == 0.0 ? 0 : (var97 < 0.0 ? -1 : 1);
            label595:
            if (var2 != null) {
               if (((Boolean)(var34))) {
                  double var98;
                  var34 = (var98 = var5.y() - 0.0) == 0.0 ? 0 : (var98 < 0.0 ? -1 : 1);
                  if (var2 == null) {
                     break label595;
                  }

                  if (((Boolean)(var34))) {
                     double var99;
                     var34 = (var99 = var5.z() - 0.0) == 0.0 ? 0 : (var99 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        break label595;
                     }

                     if (((Boolean)(var34))) {
                        short var35 = 24160;
                        short var49 = 20956;
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f(
                           "You just got failsafe checked. §cDO NOT REACT OR YOU WILL GET BANNED!"
                        );
                        return;
                     }
                  }
               }

               double var100;
               var34 = (var100 = var5.x() - 0.0) == 0.0 ? 0 : (var100 < 0.0 ? -1 : 1);
            }

            label584:
            if (var2 != null) {
               if (!((Boolean)var34)) {
                  double var101;
                  var34 = (var101 = var5.y() - 0.0) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
                  if (var2 == null) {
                     break label584;
                  }

                  if (!((Boolean)var34)) {
                     double var102;
                     var34 = (var102 = var5.z() - 0.0) == 0.0 ? 0 : (var102 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        break label584;
                     }

                     if (!((Boolean)var34)) {
                        var34 = me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q();
                        if (var2 == null) {
                           break label584;
                        }

                        if (((Boolean)(var34))) {
                           float var103;
                           var34 = (var103 = (float)(double)(Double)((me.octo.client.PXDyn)var26).yRot() - 0.0F) == 0.0F ? 0 : (var103 < 0.0F ? -1 : 1);
                           if (var2 == null) {
                              break label584;
                           }

                           if (!((Boolean)var34)) {
                              var34 = me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.o();
                              if (var2 == null) {
                                 break label584;
                              }

                              if (((Boolean)(var34))) {
                                 var34 = ++this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                                 if (var2 == null) {
                                    break label584;
                                 }

                                 if ((((((Boolean)(Object)((Boolean)var34 ? 1 : 0)))) ? 1 : 0)  > 2) {
                                    if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.stream()
                                       .anyMatch(
                                          var1x -> {
                                             int[] var2x = k();
                                             double var3x;
                                             int var10000x = (
                                                      var3x = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                            .a(new Vec3(var5.x(), var5.y(), var5.z()), var1x)
                                                         - 1.0
                                                   )
                                                   == 0.0
                                                ? 0
                                                : (var3x < 0.0 ? -1 : 1);
                                             if (var2x != null) {
                                                var10000x = var10000x < 0 ? 1 : 0;
                                             }

                                             return (var10000x != 0);
                                          }
                                       )) {
                                       return;
                                    }

                                    short var50 = 24162;
                                    short var10002 = -11359;
                                    this.a("DETECTED MULTIPLE INTERRUPTIONS");
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               double var104;
               var34 = (var104 = var5.x() - 0.0) == 0.0 ? 0 : (var104 < 0.0 ? -1 : 1);
            }

            label535:
            if (var2 != null) {
               if (!((Boolean)var34)) {
                  double var105;
                  var34 = (var105 = var5.y() - 0.0) == 0.0 ? 0 : (var105 < 0.0 ? -1 : 1);
                  if (var2 == null) {
                     break label535;
                  }

                  if (!((Boolean)var34)) {
                     double var106;
                     var34 = (var106 = var5.z() - 0.0) == 0.0 ? 0 : (var106 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        break label535;
                     }

                     label556:
                     if (!((Boolean)var34)) {
                        double var107;
                        var34 = (
                                 var107 = Math.abs(
                                       var5.x()
                                          - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                             .player
                                             .getX()
                                    )
                                    - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b()
                              )
                              == 0.0
                           ? 0
                           : (var107 < 0.0 ? -1 : 1);
                        label554:
                        if (var2 != null) {
                           if (((Boolean)var34)) {
                              double var108;
                              var34 = (
                                       var108 = Math.abs(
                                             var5.z()
                                                - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                                   .player
                                                   .getZ()
                                          )
                                          - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b()
                                    )
                                    == 0.0
                                 ? 0
                                 : (var108 < 0.0 ? -1 : 1);
                              if (var2 == null) {
                                 break label554;
                              }

                              if (((Boolean)var34)) {
                                 double var109;
                                 var34 = (
                                          var109 = Math.abs(
                                                var5.y()
                                                   - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                                      .player
                                                      .getY()
                                             )
                                             - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b()
                                       )
                                       == 0.0
                                    ? 0
                                    : (var109 < 0.0 ? -1 : 1);
                                 if (var2 == null) {
                                    break label554;
                                 }

                                 if (((Boolean)var34)) {
                                    double var110;
                                    var34 = (
                                             var110 = Math.abs(
                                                   (Double)((me.octo.client.PXDyn)var26).yRot()
                                                      - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                                         .player
                                                         .getYRot()
                                                )
                                                - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a()
                                                   * 0.6
                                          )
                                          == 0.0
                                       ? 0
                                       : (var110 < 0.0 ? -1 : 1);
                                    if (var2 == null) {
                                       break label554;
                                    }

                                    if (((Boolean)var34)) {
                                       double var111;
                                       var34 = (
                                                var111 = Math.abs(
                                                      (Double)((me.octo.client.PXDyn)var26).xRot()
                                                         - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                                            .player
                                                            .getXRot()
                                                   )
                                                   - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a()
                                                      * 0.6
                                             )
                                             == 0.0
                                          ? 0
                                          : (var111 < 0.0 ? -1 : 1);
                                       if (var2 == null) {
                                          break label554;
                                       }

                                       if (((Boolean)var34)) {
                                          lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var36 = llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .k();
                                          short var51 = 24182;
                                          short var59 = 19653;
                                          var34 = var36.c("High");
                                          if (var2 == null) {
                                             break label535;
                                          }

                                          if (((Boolean)(var34))) {
                                             break label556;
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           var34 = ++this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                        }

                        if (var2 == null) {
                           break label535;
                        }

                        if (((Integer)var34) > (((this.i() != 0) ? 1 : 0))) {
                           var34 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.stream()
                              .anyMatch(
                                 var1x -> {
                                    int[] var2x = k();
                                    double var3x;
                                    int var10000x = (
                                             var3x = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .a(new Vec3(var5.x(), var5.y(), var5.z()), var1x)
                                                - 1.0
                                          )
                                          == 0.0
                                       ? 0
                                       : (var3x < 0.0 ? -1 : 1);
                                    if (var2x != null) {
                                       var10000x = var10000x < 0 ? 1 : 0;
                                    }

                                    return (var10000x != 0);
                                 }
                              );
                           if (var2 != null) {
                              if (!((Boolean)var34)) {
                                 return;
                              }

                              float var112;
                              var34 = (var112 = (float)(double)(Double)((me.octo.client.PXDyn)var26).yRot() - 0.0F) == 0.0F ? 0 : (var112 < 0.0F ? -1 : 1);
                           }

                           if (var2 == null) {
                              break label535;
                           }

                           if (!((Boolean)var34)) {
                              var34 = me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.o();
                              if (var2 == null) {
                                 break label535;
                              }

                              if (((Boolean)(var34))) {
                                 short var52 = 24187;
                                 short var60 = 12004;
                                 this.a("DETECTED MULTIPLE INTERRUPTIONS");
                              }
                           }
                        }
                     }
                  }
               }

               var34 = me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.m();
            }

            if (var2 != null) {
               if (!((Boolean)var34)) {
                  return;
               }

               var34 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.stream()
                  .anyMatch(
                     var1x -> {
                        int[] var2x = k();
                        double var3x;
                        int var10000x = (
                                 var3x = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(new Vec3(var5.x(), var5.y(), var5.z()), var1x)
                                    - 1.0
                              )
                              == 0.0
                           ? 0
                           : (var3x < 0.0 ? -1 : 1);
                        if (var2x != null) {
                           var10000x = var10000x < 0 ? 1 : 0;
                        }

                        return (var10000x != 0);
                     }
                  );
            }

            if (var2 != null) {
               if (!((Boolean)var34)) {
                  return;
               }

               var34 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.stream()
                  .anyMatch(
                     var1x -> {
                        int[] var2x = k();
                        double var3x;
                        int var10000x = (
                                 var3x = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(new Vec3(var5.x(), var5.y(), var5.z()), var1x)
                                    - 1.0
                              )
                              == 0.0
                           ? 0
                           : (var3x < 0.0 ? -1 : 1);
                        if (var2x != null) {
                           var10000x = var10000x < 0 ? 1 : 0;
                        }

                        return (var10000x != 0);
                     }
                  );
            }

            label656: {
               if (var2 != null) {
                  if (((Boolean)(var34))) {
                     break label656;
                  }

                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var37 = llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .k();
                  short var53 = 24170;
                  short var61 = 1298;
                  var34 = var37.c("High");
               }

               if (var2 != null) {
                  if (((Boolean)(var34))) {
                     return;
                  }

                  var34 = me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q();
               }

               if (!((Boolean)var34)) {
                  return;
               }
            }

            float var6 = (float)Math.abs(
               (Double)((me.octo.client.PXDyn)var26).yRot()
                  - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                     .getYRot()
            );
            float var7 = (float)Math.abs(
               (Double)((me.octo.client.PXDyn)var26).xRot()
                  - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                     .getXRot()
            );
            double var8 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d((double)var6, (double)var7);
            double var10 = var5.x()
               - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getX();
            double var12 = var5.z()
               - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getZ();
            double var14 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(var10, var12);
            double var16 = var5.y()
               - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getY();
            float var113;
            int var38 = (var113 = (float)(double)(Double)((me.octo.client.PXDyn)var26).yRot() - 0.0F) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
            if (var2 != null) {
               if (var38 != 0) {
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl++;
               }

               h();
               var38 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .M()) ? 1 : 0);
            }

            label510: {
               label657: {
                  label508: {
                     label658: {
                        label506: {
                           label659: {
                              if (var2 != null) {
                                 if (var38 == 0) {
                                    var38 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .N()) ? 1 : 0);
                                    if (var2 == null) {
                                       break label506;
                                    }

                                    if (var38 == 0) {
                                       break label659;
                                    }
                                 }

                                 var38 = ((IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
                              }

                              if (var2 == null) {
                                 break label508;
                              }

                              if (var38 != 0) {
                                 break label658;
                              }
                           }

                           var38 =(( lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
                        }

                        if (var2 == null) {
                           break label510;
                        }

                        if (var38 == 0) {
                           break label657;
                        }
                     }

                     var38 = ((this.a(
                        new Vec3(var5.x(), var5.y(), var5.z()), lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                     )) ? 1 : 0);
                  }

                  if (var2 == null) {
                     break label510;
                  }

                  if (var38 != 0) {
                     return;
                  }
               }

               var38 = 0;
            }

            int var18;
            var18 = var38;
            var39 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
               .ae();
            label470:
            if (var2 != null) {
               if (!((Boolean)var39)) {
                  var39 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI instanceof llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll;
                  if (var2 == null) {
                     break label470;
                  }

                  label479:
                  if (!((Boolean)var39)) {
                     BlockPos var19;
                     BlockPos var20;
                     label477: {
                        var19 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           .player
                           .blockPosition();
                        var20 = var19.above();
                        Block var21 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           .level
                           .getBlockState(var19)
                           .getBlock();
                        Block var22 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           .level
                           .getBlockState(var20)
                           .getBlock();
                        Block var40 = var21;
                        Block var54 = Blocks.STONE;
                        if (var2 != null) {
                           if (var21 == Blocks.STONE) {
                              break label477;
                           }

                           var40 = var22;
                           var54 = Blocks.STONE;
                        }

                        if (var40 != var54) {
                           break label479;
                        }
                     }

                     var18 = ((lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                        .ag()
                        .stream()
                        .anyMatch(var2x -> {
                           int[] var3x = k();
                           boolean var10000x = var2x.a().equals(var20);
                           if (var3x != null) {
                              if (!var10000x) {
                                 var10000x = var2x.a().equals(var19);
                                 if (var3x == null) {
                                    return var10000x;
                                 }

                                 if (!var10000x) {
                                    return false;
                                 }
                              }

                              var10000x = true;
                           }

                           return var10000x;
                        })) ? 1 : 0);
                  }
               }

               double var114;
               var39 = (var114 = var5.x() - 0.0) == 0.0 ? 0 : (var114 < 0.0 ? -1 : 1);
            }

            label661: {
               if (var2 != null) {
                  if (((Boolean)(var39))) {
                     break label661;
                  }

                  double var115;
                  var39 = (var115 = var5.y() - 0.0) == 0.0 ? 0 : (var115 < 0.0 ? -1 : 1);
               }

               if (var2 != null) {
                  if (((Boolean)(var39))) {
                     break label661;
                  }

                  double var116;
                  var39 = (var116 = var5.z() - 0.0) == 0.0 ? 0 : (var116 < 0.0 ? -1 : 1);
               }

               if (var2 != null) {
                  if (((Boolean)(var39))) {
                     break label661;
                  }

                  var39 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
               }

               label461:
               if (var2 != null) {
                  if (((Integer)var39) <= (((me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.c() != 0) ? 1 : 0))) {
                     double var117;
                     var39 = (
                              var117 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                                 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b()
                           )
                           == 0.0
                        ? 0
                        : (var117 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        break label461;
                     }

                     if (((Boolean)var39)) {
                        break label661;
                     }
                  }

                  var39 = this.a(new Vec3(var5.x(), var5.y(), var5.z()));
               }

               if (var2 != null) {
                  if (!((Boolean)var39)) {
                     return;
                  }

                  float var118;
                  var39 = (var118 = (float)(double)(Double)((me.octo.client.PXDyn)var26).yRot() - 0.0F) == 0.0F ? 0 : (var118 < 0.0F ? -1 : 1);
               }

               if (var2 != null) {
                  if (((Boolean)(var39))) {
                     break label661;
                  }

                  var39 = me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q();
               }

               if (((Boolean)(var39))) {
                  double var23 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  int var25 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  short var55 = 24176;
                  short var62 = 23736;
                  this.a("DETECTED MULTIPLE INTERRUPTIONS: " + var25 + " " + var23);
               }
            }

            label439: {
               label662: {
                  BlockPos var27 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                     .blockPosition()
                     .below();
                  BlockState var28 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .level
                     .getBlockState(var27);
                  Block var29 = var28.getBlock();
                  Block var41 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .level
                     .getBlockState(BlockPos.containing(var5.x(), var5.y(), var5.z()).below())
                     .getBlock();
                  if (var2 != null) {
                     if (var41 != var29) {
                        break label662;
                     }

                     var41 = var29;
                  }

                  var42 = var41 instanceof SlabBlock;
                  label432:
                  if (var2 != null) {
                     if (((Boolean)(var42))) {
                        var42 = var29 instanceof StairBlock;
                        if (var2 == null) {
                           break label432;
                        }

                        if (((Boolean)(var42))) {
                           break label662;
                        }
                     }

                     double var119;
                     var42 = (
                              var119 = Math.abs(var10)
                                 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b()
                           )
                           == 0.0
                        ? 0
                        : (var119 < 0.0 ? -1 : 1);
                  }

                  if (var2 != null) {
                     if (((Boolean)var42)) {
                        break label662;
                     }

                     double var120;
                     var42 = (
                              var120 = Math.abs(var12)
                                 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b()
                           )
                           == 0.0
                        ? 0
                        : (var120 < 0.0 ? -1 : 1);
                  }

                  if (var2 == null) {
                     break label439;
                  }

                  if (((Boolean)var42)) {
                     var42 = 1;
                     break label439;
                  }
               }

               var42 = 0;
            }

            int var30 =((Integer)( var42));
            double var121;
            int var43 = (var121 = var14 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b())
                  == 0.0
               ? 0
               : (var121 < 0.0 ? -1 : 1);
            if (var2 != null) {
               label412:
               if (var43 > 0) {
                  int var44 = ((this.a(new Vec3(var5.x(), var5.y(), var5.z()))) ? 1 : 0);
                  if (var2 != null) {
                     if (var44 != 0) {
                        return;
                     }

                     var44 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.r()) ? 1 : 0);
                  }

                  label665: {
                     if (var2 != null) {
                        if (var44 != 0) {
                           break label665;
                        }

                        var44 = var30;
                     }

                     if (var2 != null) {
                        if (var44 != 0) {
                           break label665;
                        }

                        var44 = var18;
                     }

                     if (var2 != null) {
                        if (var44 != 0) {
                           break label665;
                        }

                        var44 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q()) ? 1 : 0);
                     }

                     if (var2 != null) {
                        if (var44 != 0) {
                           break label665;
                        }

                        var44 = ((IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.a(var3)) ? 1 : 0);
                     }

                     if (var44 == 0) {
                        short var63 = 24189;
                        short var76 = 15198;
                        this.a("DETECTED TELEPORT: " + var14);
                        if (var2 != null) {
                           break label412;
                        }
                     }
                  }

                  short var45 = 24190;
                  short var56 = -11170;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("canceled due to exempt");
               }

               double var122;
               var43 = (var122 = var16 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.b()) == 0.0
                  ? 0
                  : (var122 < 0.0 ? -1 : 1);
            }

            if (var2 != null) {
               label381:
               if (var43 > 0) {
                  label667: {
                     int var46 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.r()) ? 1 : 0);
                     if (var2 != null) {
                        if (var46 != 0) {
                           break label667;
                        }

                        var46 = var30;
                     }

                     if (var2 != null) {
                        if (var46 != 0) {
                           break label667;
                        }

                        var46 = var18;
                     }

                     if (var2 != null) {
                        if (var46 != 0) {
                           break label667;
                        }

                        var46 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q()) ? 1 : 0);
                     }

                     if (var46 == 0) {
                        short var64 = 24163;
                        short var77 = -7883;
                        this.a("DETECTED VERTICAL TELEPORT: " + var16);
                        if (var2 != null) {
                           break label381;
                        }
                     }
                  }

                  short var47 = 24184;
                  short var57 = -24008;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("canceled due to exempt");
               }

               double var123;
               var43 = (var123 = var5.x() - 0.0) == 0.0 ? 0 : (var123 < 0.0 ? -1 : 1);
            }

            label357:
            if (var2 != null) {
               if (var43 != 0) {
                  double var124;
                  var43 = (var124 = var5.y() - 0.0) == 0.0 ? 0 : (var124 < 0.0 ? -1 : 1);
                  if (var2 == null) {
                     break label357;
                  }

                  if (var43 != 0) {
                     double var125;
                     var43 = (var125 = var5.z() - 0.0) == 0.0 ? 0 : (var125 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        break label357;
                     }

                     if (var43 != 0) {
                        double var126;
                        var43 = (
                                 var126 = Math.abs(var8)
                                    - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a() * 0.6
                              )
                              == 0.0
                           ? 0
                           : (var126 < 0.0 ? -1 : 1);
                        if (var2 == null) {
                           break label357;
                        }

                        if (var43 > 0) {
                           var43 = ((this.b(var3)) ? 1 : 0);
                           if (var2 == null) {
                              break label357;
                           }

                           if (var43 != 0) {
                              var43 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q()) ? 1 : 0);
                              if (var2 == null) {
                                 break label357;
                              }

                              if (var43 == 0) {
                                 short var58 = 24185;
                                 short var65 = 22889;
                                 this.a("DOUBLE TELEPORT");
                              }
                           }
                        }
                     }
                  }
               }

               double var127;
               var43 = (var127 = var8 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a()) == 0.0
                  ? 0
                  : (var127 < 0.0 ? -1 : 1);
            }

            label669: {
               label337:
               if (var2 != null) {
                  if (var43 <= 0) {
                     float var128;
                     var43 = (var128 = var6 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a())
                           == 0.0F
                        ? 0
                        : (var128 < 0.0F ? -1 : 1);
                     if (var2 == null) {
                        break label337;
                     }

                     if (var43 <= 0) {
                        float var129;
                        var43 = (var129 = var7 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a())
                              == 0.0F
                           ? 0
                           : (var129 < 0.0F ? -1 : 1);
                        if (var2 == null) {
                           break label337;
                        }

                        if (var43 <= 0) {
                           break label669;
                        }
                     }
                  }

                  var43 =(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
               }

               label327:
               if (var2 != null) {
                  if (var43 == 0) {
                     var43 =(( lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
                     if (var2 == null) {
                        break label327;
                     }

                     if (!lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
                        int var48 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.o()) ? 1 : 0);
                        if (var2 != null) {
                           if (var48 != 0) {
                              return;
                           }

                           var48 = ((this.a(var3)) ? 1 : 0);
                        }

                        if (var2 != null) {
                           if (var48 != 0) {
                              return;
                           }

                           float var130;
                           var48 = (var130 = (float)(double)(Double)((me.octo.client.PXDyn)var26).yRot() - 0.0F) == 0.0F ? 0 : (var130 < 0.0F ? -1 : 1);
                        }

                        if (var2 != null) {
                           if (var48 == 0) {
                              return;
                           }

                           var48 = var18;
                        }

                        if (var2 != null) {
                           if (var48 == 0) {
                              return;
                           }

                           var48 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q()) ? 1 : 0);
                        }

                        if (var2 != null) {
                           if (var48 != 0) {
                              break label669;
                           }

                           var48 = ((IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.a(var3)) ? 1 : 0);
                        }

                        if (var48 != 0) {
                           break label669;
                        }

                        short var66 = 24177;
                        short var78 = -16723;
                        this.a("DETECTED ROTATION: " + var8);
                        if (var2 != null) {
                           break label669;
                        }
                     }
                  }

                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
                  var43 = 0;
               }

               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (var43 != 0);
            }

            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var3;
         }
      }
   }

   private int i() {
      int[] var1 = k();
      lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var10000 = llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .k();
      short var10001 = 24191;
      short var10002 = 11612;
      byte var2 = ((byte)((var10000.c("Low")) ? 1 : 0));
      if (var1 != null) {
         if (var2 != 0) {
            return 3;
         }

         var2 = 2;
      }

      return var2;
   }

   private boolean a(ClientboundPlayerPositionPacket var1) {
      int[] var2 = k();
      ClientboundPlayerPositionPacket var10000 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      if (var2 != null) {
         if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl == null) {
            return false;
         }

         var10000 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      }

      float var4;
      int var3 = (var4 = var10000.change().xRot() - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if ((var3 == 0)) {
            return false;
         }

         double var5;
         var3 = (
                  var5 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().position().x()
                     - var1.change().position().x()
               )
               == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
      }

      if (var2 != null) {
         if ((var3 != 0)) {
            return (0 != 0);
         }

         double var6;
         var3 = (
                  var6 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().position().y()
                     - var1.change().position().y()
               )
               == 0.0
            ? 0
            : (var6 < 0.0 ? -1 : 1);
      }

      if (var2 != null) {
         if ((var3 != 0)) {
            return (0 != 0);
         }

         double var7;
         var3 = (
                  var7 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().position().z()
                     - var1.change().position().z()
               )
               == 0.0
            ? 0
            : (var7 < 0.0 ? -1 : 1);
      }

      if (var2 == null) {
         return (var3 != 0);
      } else {
         return (var3 != 0);
      }
   }

   private boolean b(ClientboundPlayerPositionPacket var1) {
      int[] var2 = k();
      ClientboundPlayerPositionPacket var10000 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      if (var2 != null) {
         if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl == null) {
            return false;
         }

         var10000 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      }

      float var5;
      int var3 = (var5 = var10000.change().xRot() - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if ((var3 == 0)) {
            return false;
         }

         double var6;
         var3 = (
                  var6 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().position().x()
                     - var1.change().position().x()
               )
               == 0.0
            ? 0
            : (var6 < 0.0 ? -1 : 1);
      }

      if (var2 != null) {
         if ((var3 == 0)) {
            double var7;
            int var11 = (
                     var7 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().position().y()
                        - var1.change().position().y()
                  )
                  == 0.0
               ? 0
               : (var7 < 0.0 ? -1 : 1);
            if (var2 == null) {
               return (var11 != 0);
            }

            if ((var11 == 0)) {
               double var8;
               int var12 = (
                        var8 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().position().z()
                           - var1.change().position().z()
                     )
                     == 0.0
                  ? 0
                  : (var8 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  return (var12 != 0);
               }

               if ((var12 == 0)) {
                  float var9;
                  int var4 = (
                           var9 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().yRot()
                              - var1.change().yRot()
                        )
                        == 0.0F
                     ? 0
                     : (var9 < 0.0F ? -1 : 1);
                  if (var2 != null) {
                     if ((var4 != 0)) {
                        return (0 != 0);
                     }

                     float var10;
                     var4 = (
                              var10 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.change().xRot()
                                 - var1.change().xRot()
                           )
                           == 0.0F
                        ? 0
                        : (var10 < 0.0F ? -1 : 1);
                  }

                  if (var2 == null) {
                     return (var4 != 0);
                  }

                  if ((var4 == 0)) {
                     return (1 != 0);
                  }

                  return (0 != 0);
               }
            }
         }

         var3 = 0;
      }

      return (var3 != 0);
   }

   private boolean a(Vec3 var1) {
      Object var7 = null; // PX-FIX
      int[] var10000 = k();
      Iterator var3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.iterator();
      int[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            Vec3 var4 = (Vec3)var3.next();
            if (var4 != null) {
               double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var1, var4);
               double var8;
               var7 = (var8 = var5 - 0.1) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  break;
               }

               if (((Boolean)var7)) {
                  var7 = 1;
                  break;
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         return false;
      }

      return (boolean)var7;
   }

   private boolean a(Vec3 var1, BlockPos var2) {
      int[] var3 = k();
      if (var2 != null) {
         double var4;
         int var10000 = (
                  var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var1, new Vec3(var2.getX() + 0.5, var2.getY(), var2.getZ() + 0.5))
                     - 2.0
               )
               == 0.0
            ? 0
            : (var4 < 0.0 ? -1 : 1);
         if (var3 != null) {
            var10000 = var10000 > 0 ? 1 : 0;
         }

         return (var10000 != 0);
      } else {
         return false;
      }
   }

   public static boolean b(Vec3 var0, BlockPos var1) {
      int[] var2 = k();
      if (var1 != null) {
         double var3;
         int var10000 = (
                  var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var0, new Vec3(var1.getX() + 0.5, var1.getY(), var1.getZ() + 0.5))
                     - 2.0
               )
               == 0.0
            ? 0
            : (var3 < 0.0 ? -1 : 1);
         if (var2 != null) {
            var10000 = var10000 < 0 ? 1 : 0;
         }

         return (var10000 != 0);
      } else {
         return false;
      }
   }

   public static boolean a(Vec3 var0, Vec3 var1) {
      int[] var2 = k();
      if (var1 != null) {
         double var3;
         int var10000 = (
                  var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var0, var1)
                     - 3.0
               )
               == 0.0
            ? 0
            : (var3 < 0.0 ? -1 : 1);
         if (var2 != null) {
            var10000 = var10000 < 0 ? 1 : 0;
         }

         return (var10000 != 0);
      } else {
         return false;
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void a(me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player
            == null
         || me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level
            == null) {
         return;
      }

      Packet<?> var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var4 instanceof ServerboundMovePlayerPacket.Rot || var4 instanceof ServerboundMovePlayerPacket.PosRot) {
         float var3 = ((ServerboundMovePlayerPacketAccessor)var4).getRawPitch();
         float var5 = ((ServerboundMovePlayerPacketAccessor)var4).getRawYaw();
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.add(
            new float[]{var3, var5}
         );
         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.size() > 10) {
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.removeFirst();
         }
      }

      var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var4 instanceof ServerboundMovePlayerPacket) {
         ServerboundMovePlayerPacket var6 = (ServerboundMovePlayerPacket)var4;
         ServerboundMovePlayerPacketAccessor var7 =
            (ServerboundMovePlayerPacketAccessor)var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Vec3 var8 = new Vec3(var7.getX(), var7.getY(), var7.getZ());
         if (var8.x != 0.0 && var8.y != 0.0 && var8.z != 0.0) {
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.add(var8);
            if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.size() > 10) {
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.removeFirst();
            }
         }
      }

      var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var4 instanceof ServerboundChatPacket) {
         ServerboundChatPacket var9 = (ServerboundChatPacket)var4;
         me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.g();
         me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.h();
         me.octo.client.IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0;
         if (var9.message().startsWith("/") && !var9.message().contains("/locraw")) {
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.k();
            if (me.octo.client.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
               .c("High")) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .t();
            }
         }
      }

      var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var4 instanceof ServerboundUseItemOnPacket) {
         ServerboundUseItemOnPacket var10 = (ServerboundUseItemOnPacket)var4;
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
         me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.i();
         InteractionHand var11 = var10.getHand();
         ItemStack var12 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player
            .getItemInHand(var11);
         if (var12 != null) {
            if (var12.getItem() == Items.DIAMOND_SHOVEL
               || var12.getCustomName() != null && var12.getHoverName().getString().contains("Etherwarp Conduit")) {
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
               me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.j();
               me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.i();
            }
         }

         if ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .M()
               || me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .N())
            && me.octo.client.IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.g();
            if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl++ >= 3) {
               me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.i();
               me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.j();
            }
         }
      }
   }

   @SubscribeEvent
   public void a(lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      if (!var1.c()) {
         ;
      }
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII var1) {
      int[] var2 = k();
      Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var2 != null) {
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            == null) {
            return;
         }

         var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var10000.level == null) {
         ;
      }
   }

   @SubscribeEvent
   public void a(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      int[] var2 = k();
      if (var2 != null) {
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .tickCount
               % 60
            != 0) {
            return;
         }

         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0;
      }

      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
      k();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new int[2]);
      }
   }

   private BlockPos j() {
      int[] var10000 = k();
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var2 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(64.0);
      int[] var1 = var10000;
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var3 = var2;
      if (var1 != null) {
         if (var2.a()) {
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var2.b();
            return var2.b();
         }

         var3 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

      return var3.b();
   }

   public static BlockPos a(float var0, float var1) {
      int[] var10000 = k();
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var3 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var0, var1, 64.0, false);
      int[] var2 = var10000;
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var4 = var3;
      if (var2 != null) {
         if (var3.a()) {
            return var3.b();
         }

         var4 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

      return var4.b();
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void a(me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      int[] var2 = k();
      if (var2 != null) {
         if (var1.k() != null) {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getDeltaTracker()
               .getGameTimeDeltaTicks();
         }

         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.j();
      }
   }

   private double a(Entity var1) {
      return var1.xo + (var1.getX() - var1.xo) * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   private double b(Entity var1) {
      return var1.yo + (var1.getY() - var1.yo) * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   private double c(Entity var1) {
      return var1.zo + (var1.getZ() - var1.zo) * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   private Vec3 d(Entity var1) {
      return new Vec3(this.a(var1), this.b(var1), this.c(var1));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "\u000bjé!Úü+\nSP¤±·ý^5i\u0007Ú\u0013o·wâ*!f\u0017Y¹Fè\u008bù·³t.Cd\u0098«\u0001ct`\u0097°u¤\u0010,Ï»\u0016R:\u0004®\u0013l\u0088\u0018Jn\u0096\u008e6\u0017Uz\u0016Îe\u00876Ó©-\u0004Ã\u007fS0\u0007hq¥_´ãð\b)X,r0\t\\æ\u000f\u0013\u0014\u0003\u0092\u001e\u0010{VÜDe5À¬ô\u001aÅ\tÁz]\r\nþ\u0081;öÛôCÝdèO¨H\u001cÛµ¾)\u000b\u001f9z²\u0014;]$OBeÊô\u0094?bÀ^\u000e\u009fÍê\u0005Ú\u0012åúqaÁ\tÀ\u0016Zâ'\u0081Ò5Û]\u0099*\u00918¯\u0097À#òË\u0002\u0005Ôj\u000fôÛ\nl\u0002¤\u0088S{õ4ÛB^Ä\u0016(¨iÈ\u001b\u001câx¾\u008eu¬3\u0005Sq\u0080\u0081LL\u001dC\u0003¾Xh\u0004GO¿ö\u0013È¸\u008cLüVÜ.]P9héµáµÃgv\u001f\bC\u00943ÿ¹¼ÓQö¨\u0086Øqë\to7¹ê.áB\u008eöi\u0013\u0013\u008dGI\u001c\u0003Âõ\u0003Ó¿9\u0013áõ®\u0080\nl¢§>N¦Îk\u000fóN\u0085ËôªE7\u0088ì@Ü?â6jVõÅz\tté¢ù$\"\u0081°\u0091W«\u001c±Ä*t\u00801§W\u0099xÐi:[\u00ad'\u0092AbÐ-\n\u000e~¡åAä#@6æIN\"bõWñÀ\u000f+K\u0011y\u0018\u008cÃ?\u009e\u008a¨Ü¥¢Ø\u001fù«Çd\u0005¢\u000b_^\u008b\u0010¯OQ\u008frMc\u009cõy\u0098sÛþ\u009c\u000e\u0006!lÈèQÂ\nD©¬-\fî9\u0089\u0094¿";
      int var4 = "\u000bjé!Úü+\nSP¤±·ý^5i\u0007Ú\u0013o·wâ*!f\u0017Y¹Fè\u008bù·³t.Cd\u0098«\u0001ct`\u0097°u¤\u0010,Ï»\u0016R:\u0004®\u0013l\u0088\u0018Jn\u0096\u008e6\u0017Uz\u0016Îe\u00876Ó©-\u0004Ã\u007fS0\u0007hq¥_´ãð\b)X,r0\t\\æ\u000f\u0013\u0014\u0003\u0092\u001e\u0010{VÜDe5À¬ô\u001aÅ\tÁz]\r\nþ\u0081;öÛôCÝdèO¨H\u001cÛµ¾)\u000b\u001f9z²\u0014;]$OBeÊô\u0094?bÀ^\u000e\u009fÍê\u0005Ú\u0012åúqaÁ\tÀ\u0016Zâ'\u0081Ò5Û]\u0099*\u00918¯\u0097À#òË\u0002\u0005Ôj\u000fôÛ\nl\u0002¤\u0088S{õ4ÛB^Ä\u0016(¨iÈ\u001b\u001câx¾\u008eu¬3\u0005Sq\u0080\u0081LL\u001dC\u0003¾Xh\u0004GO¿ö\u0013È¸\u008cLüVÜ.]P9héµáµÃgv\u001f\bC\u00943ÿ¹¼ÓQö¨\u0086Øqë\to7¹ê.áB\u008eöi\u0013\u0013\u008dGI\u001c\u0003Âõ\u0003Ó¿9\u0013áõ®\u0080\nl¢§>N¦Îk\u000fóN\u0085ËôªE7\u0088ì@Ü?â6jVõÅz\tté¢ù$\"\u0081°\u0091W«\u001c±Ä*t\u00801§W\u0099xÐi:[\u00ad'\u0092AbÐ-\n\u000e~¡åAä#@6æIN\"bõWñÀ\u000f+K\u0011y\u0018\u008cÃ?\u009e\u008a¨Ü¥¢Ø\u001fù«Çd\u0005¢\u000b_^\u008b\u0010¯OQ\u008frMc\u009cõy\u0098sÛþ\u009c\u000e\u0006!lÈèQÂ\nD©¬-\fî9\u0089\u0094¿"
         .length();
      char var1 = 17;
      int[] var10000 = new int[4];
      int var8 = -1;
      b(var10000);

      label52:
      while (true) {
         byte var9 = 80;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 10;
                     case 1 -> 30;
                     case 2 -> 22;
                     case 3 -> 106;
                     case 4 -> 104;
                     case 5 -> 113;
                     default -> 122;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     d = new String[26];
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>(
                        Arrays.asList(
                           new Vec3(-2.5, 70.0, -69.5),
                           new Vec3(0.5, 149.0, -68.5),
                           new Vec3(0.5, 128.0, 200.5),
                           new Vec3(-503.0, 101.0, -275.0),
                           new Vec3(-360.0, 80.0, -430.5),
                           new Vec3(-48.5, 200.0, -121.5)
                        )
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new ArrayList<>(
                        Arrays.asList(new Vec3(-48.5, 200.0, -121.5), new Vec3(0.5, 128.0, 200.5))
                     );
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Pv\u001d-\u0006\u009bcì\u0090\u0015¡";
                  var4 = "Pv\u001d-\u0006\u009bcì\u0090\u0015¡".length();
                  var1 = 4;
                  var8 = -1;
            }

            var9 = 34;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(int[] var0) {
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var0;
   }

   public static int[] k() {
      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 24178) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 213;
            case 1 -> 51;
            case 2 -> 192;
            case 3 -> 233;
            case 4 -> 174;
            case 5 -> 54;
            case 6 -> 7;
            case 7 -> 48;
            case 8 -> 46;
            case 9 -> 125;
            case 10 -> 93;
            case 11 -> 241;
            case 12 -> 216;
            case 13 -> 12;
            case 14 -> 85;
            case 15 -> 130;
            case 16 -> 175;
            case 17 -> 173;
            case 18 -> 140;
            case 19 -> 221;
            case 20 -> 92;
            case 21 -> 155;
            case 22 -> 199;
            case 23 -> 218;
            case 24 -> 237;
            case 25 -> 76;
            case 26 -> 102;
            case 27 -> 39;
            case 28 -> 251;
            case 29 -> 122;
            case 30 -> 89;
            case 31 -> 106;
            case 32 -> 87;
            case 33 -> 215;
            case 34 -> 26;
            case 35 -> 219;
            case 36 -> 210;
            case 37 -> 250;
            case 38 -> 243;
            case 39 -> 31;
            case 40 -> 6;
            case 41 -> 80;
            case 42 -> 172;
            case 43 -> 56;
            case 44 -> 248;
            case 45 -> 58;
            case 46 -> 193;
            case 47 -> 211;
            case 48 -> 234;
            case 49 -> 198;
            case 50 -> 231;
            case 51 -> 38;
            case 52 -> 32;
            case 53 -> 115;
            case 54 -> 59;
            case 55 -> 66;
            case 56 -> 161;
            case 57 -> 242;
            case 58 -> 203;
            case 59 -> 118;
            case 60 -> 64;
            case 61 -> 160;
            case 62 -> 73;
            case 63 -> 176;
            case 64 -> 236;
            case 65 -> 104;
            case 66 -> 183;
            case 67 -> 185;
            case 68 -> 99;
            case 69 -> 178;
            case 70 -> 170;
            case 71 -> 16;
            case 72 -> 14;
            case 73 -> 44;
            case 74 -> 25;
            case 75 -> 141;
            case 76 -> 247;
            case 77 -> 53;
            case 78 -> 158;
            case 79 -> 79;
            case 80 -> 133;
            case 81 -> 41;
            case 82 -> 139;
            case 83 -> 197;
            case 84 -> 74;
            case 85 -> 145;
            case 86 -> 253;
            case 87 -> 120;
            case 88 -> 103;
            case 89 -> 24;
            case 90 -> 177;
            case 91 -> 153;
            case 92 -> 114;
            case 93 -> 245;
            case 94 -> 240;
            case 95 -> 20;
            case 96 -> 128;
            case 97 -> 81;
            case 98 -> 21;
            case 99 -> 189;
            case 100 -> 164;
            case 101 -> 71;
            case 102 -> 165;
            case 103 -> 13;
            case 104 -> 144;
            case 105 -> 123;
            case 106 -> 228;
            case 107 -> 150;
            case 108 -> 230;
            case 109 -> 168;
            case 110 -> 22;
            case 111 -> 159;
            case 112 -> 204;
            case 113 -> 195;
            case 114 -> 77;
            case 115 -> 11;
            case 116 -> 62;
            case 117 -> 169;
            case 118 -> 208;
            case 119 -> 57;
            case 120 -> 226;
            case 121 -> 94;
            case 122 -> 98;
            case 123 -> 69;
            case 124 -> 52;
            case 125 -> 43;
            case 126 -> 207;
            case 127 -> 223;
            case 128 -> 109;
            case 129 -> 97;
            case 130 -> 5;
            case 131 -> 63;
            case 132 -> 220;
            case 133 -> 96;
            case 134 -> 124;
            case 135 -> 156;
            case 136 -> 91;
            case 137 -> 75;
            case 138 -> 252;
            case 139 -> 129;
            case 140 -> 214;
            case 141 -> 1;
            case 142 -> 206;
            case 143 -> 138;
            case 144 -> 90;
            case 145 -> 36;
            case 146 -> 136;
            case 147 -> 217;
            case 148 -> 191;
            case 149 -> 157;
            case 150 -> 205;
            case 151 -> 188;
            case 152 -> 163;
            case 153 -> 244;
            case 154 -> 143;
            case 155 -> 190;
            case 156 -> 33;
            case 157 -> 142;
            case 158 -> 83;
            case 159 -> 68;
            case 160 -> 179;
            case 161 -> 225;
            case 162 -> 162;
            case 163 -> 121;
            case 164 -> 40;
            case 165 -> 227;
            case 166 -> 110;
            case 167 -> 17;
            case 168 -> 35;
            case 169 -> 19;
            case 170 -> 224;
            case 171 -> 196;
            case 172 -> 27;
            case 173 -> 239;
            case 174 -> 127;
            case 175 -> 137;
            case 176 -> 194;
            case 177 -> 166;
            case 178 -> 23;
            case 179 -> 249;
            case 180 -> 45;
            case 181 -> 107;
            case 182 -> 148;
            case 183 -> 147;
            case 184 -> 10;
            case 185 -> 108;
            case 186 -> 246;
            case 187 -> 101;
            case 188 -> 2;
            case 189 -> 119;
            case 190 -> 70;
            case 191 -> 149;
            case 192 -> 152;
            case 193 -> 50;
            case 194 -> 181;
            case 195 -> 28;
            case 196 -> 126;
            case 197 -> 116;
            case 198 -> 65;
            case 199 -> 15;
            case 200 -> 82;
            case 201 -> 88;
            case 202 -> 30;
            case 203 -> 8;
            case 204 -> 3;
            case 205 -> 184;
            case 206 -> 167;
            case 207 -> 117;
            case 208 -> 238;
            case 209 -> 201;
            case 210 -> 55;
            case 211 -> 154;
            case 212 -> 84;
            case 213 -> 186;
            case 214 -> 18;
            case 215 -> 200;
            case 216 -> 151;
            case 217 -> 232;
            case 218 -> 67;
            case 219 -> 202;
            case 220 -> 95;
            case 221 -> 60;
            case 222 -> 131;
            case 223 -> 146;
            case 224 -> 86;
            case 225 -> 254;
            case 226 -> 0;
            case 227 -> 212;
            case 228 -> 180;
            case 229 -> 29;
            case 230 -> 42;
            case 231 -> 100;
            case 232 -> 9;
            case 233 -> 209;
            case 234 -> 34;
            case 235 -> 182;
            case 236 -> 229;
            case 237 -> 105;
            case 238 -> 134;
            case 239 -> 78;
            case 240 -> 4;
            case 241 -> 61;
            case 242 -> 37;
            case 243 -> 187;
            case 244 -> 132;
            case 245 -> 47;
            case 246 -> 255;
            case 247 -> 235;
            case 248 -> 112;
            case 249 -> 113;
            case 250 -> 135;
            case 251 -> 49;
            case 252 -> 222;
            case 253 -> 111;
            case 254 -> 72;
            default -> 171;
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
