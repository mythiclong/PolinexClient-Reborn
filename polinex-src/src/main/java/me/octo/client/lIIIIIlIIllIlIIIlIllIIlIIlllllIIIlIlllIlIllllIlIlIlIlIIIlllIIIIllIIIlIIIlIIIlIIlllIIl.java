package me.octo.client;

import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.world.entity.PositionMoveRotation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

public class lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   private static String[] a;
   private static String[] d;

   public lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void onPacket(me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      ClientboundPlayerPositionPacket var25 = null; // PX-FIX
      int[] var2 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      int var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0);
      if (var2 != null) {
         if ((var10000 == 0)) {
            return;
         }

         var10000 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.n()) ? 1 : 0);
      }

      if ((var10000 == 0)) {
         Packet var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Packet var23 = var4;
         if (var2 != null) {
            if (!(var4 instanceof ClientboundPlayerPositionPacket)) {
               return;
            }

            var23 = var4;
         }

         ClientboundPlayerPositionPacket var3;
         label258: {
            var3 = (ClientboundPlayerPositionPacket)var23;
            var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
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

               var10000 = IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               if (var2 == null) {
                  break label258;
               }

               var10001 = 100;
            }

            if (var10000 < var10001) {
               return;
            }

            var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .M()) ? 1 : 0);
         }

         label234: {
            label260: {
               label232:
               if (var2 != null) {
                  if (var10000 == 0) {
                     var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .N()) ? 1 : 0);
                     if (var2 == null) {
                        break label232;
                     }

                     if (var10000 == 0) {
                        break label260;
                     }
                  }

                  var10000 = ((IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
               }

               if (var2 != null) {
                  if (var10000 == 0) {
                     break label260;
                  }

                  var25 = var3;
                  if (var2 == null) {
                     break label234;
                  }

                  var10000 = ((me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a(var3)) ? 1 : 0);
               }

               if (var10000 != 0) {
                  return;
               }
            }

            var25 = var3;
         }

         PositionMoveRotation var22 = var25.change();
         Vec3 var5 = var22.position();
         int var26 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.m()) ? 1 : 0);
         if (var2 != null) {
            if ((var26 != 0)) {
               return;
            }

            var26 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               .stream()
               .anyMatch(
                  var1x -> {
                     int[] var2x = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
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
               ) ? 1 : 0;
         }

         label213:
         if (var2 != null) {
            if ((var26 != 0)) {
               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var27 = llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .k();
               short var33 = -19731;
               short var10002 = -7033;
               var26 = ((var27.c("High")) ? 1 : 0);
               if (var2 != null) {
                  if ((var26 == 0)) {
                     return;
                  }

                  var26 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q()) ? 1 : 0);
               }

               if (var2 == null) {
                  break label213;
               }

               if ((var26 != 0)) {
                  return;
               }
            }

            var26 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .stream()
               .anyMatch(
                  var1x -> {
                     int[] var2x = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
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
               ) ? 1 : 0;
         }

         label264: {
            if (var2 != null) {
               if ((var26 == 0)) {
                  break label264;
               }

               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var28 = llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .k();
               short var34 = -19735;
               short var39 = 18279;
               var26 = ((var28.c("High")) ? 1 : 0);
            }

            if (var2 != null) {
               if ((var26 == 0)) {
                  return;
               }

               var26 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q()) ? 1 : 0);
            }

            if ((var26 != 0)) {
               return;
            }
         }

         float var6;
         float var7;
         double var8;
         var6 = Math.abs(
            var22.yRot()
               - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getYRot()
         );
         var7 = Math.abs(
            var22.xRot()
               - me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getXRot()
         );
         var8 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d((double)var6, (double)var7);
         double var42;
         var26 = (var42 = var8 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a()) == 0.0
            ? 0
            : (var42 < 0.0 ? -1 : 1);
         label199:
         if (var2 != null) {
            if (var26 <= 0) {
               float var43;
               var26 = (var43 = var6 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a()) == 0.0F
                  ? 0
                  : (var43 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  break label199;
               }

               if (var26 <= 0) {
                  float var44;
                  var26 = (var44 = var7 - me.octo.client.utils.lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII.a())
                        == 0.0F
                     ? 0
                     : (var44 < 0.0F ? -1 : 1);
                  if (var2 == null) {
                     break label199;
                  }

                  if (var26 <= 0) {
                     return;
                  }
               }
            }

            var26 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.o()) ? 1 : 0);
         }

         if (var2 != null) {
            if (var26 != 0) {
               return;
            }

            float var45;
            var26 = (var45 = var22.yRot() - 0.0F) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
         }

         if (var2 != null) {
            if (var26 == 0) {
               return;
            }

            float var46;
            var26 = (var46 = var6 - Math.abs(360)) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
         }

         if (var2 != null) {
            if (var26 == 0) {
               short var32 = -19733;
               short var38 = 32453;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f(
                  "You just got failsafe checked. §cDO NOT REACT OR YOU WILL GET BANNED!"
               );
               return;
            }

            double var47;
            var26 = (var47 = var5.x() - 0.0) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
         }

         label182:
         if (var2 != null) {
            if (var26 == 0) {
               double var48;
               var26 = (var48 = var5.y() - 0.0) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  break label182;
               }

               if (var26 == 0) {
                  double var49;
                  var26 = (var49 = var5.z() - 0.0) == 0.0 ? 0 : (var49 < 0.0 ? -1 : 1);
                  if (var2 == null) {
                     break label182;
                  }

                  if (var26 == 0) {
                     short var30 = -19729;
                     short var35 = 1791;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f(
                        "You just got failsafe checked. §cDO NOT REACT OR YOU WILL GET BANNED! - dev info this is from rotation check"
                     );
                     return;
                  }
               }
            }

            var26 = ((lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
               .ae()) ? 1 : 0);
         }

         label159:
         if (var2 != null) {
            if (var26 != 0) {
               var26 = ((lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI instanceof llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll) ? 1 : 0);
               if (var2 == null) {
                  break label159;
               }

               label168:
               if (var26 != 0) {
                  BlockPos var10;
                  BlockPos var11;
                  label166: {
                     var10 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                        .blockPosition();
                     var11 = var10.above();
                     Block var12 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .level
                        .getBlockState(var10)
                        .getBlock();
                     Block var13 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .level
                        .getBlockState(var11)
                        .getBlock();
                     Block var31 = var12;
                     Block var36 = Blocks.STONE;
                     if (var2 != null) {
                        if (var12 == Blocks.STONE) {
                           break label166;
                        }

                        var31 = var13;
                        var36 = Blocks.STONE;
                     }

                     if (var31 != var36) {
                        break label168;
                     }
                  }

                  byte var14 = ((byte)((lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                     .ag()
                     .stream()
                     .anyMatch(var2x -> {
                        int[] var3x = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
                        boolean var10000x = var2x.a().equals(var11);
                        if (var3x != null) {
                           if (!var10000x) {
                              var10000x = var2x.a().equals(var10);
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
                     })) ? 1 : 0));
                  var26 = var14;
                  if (var2 == null) {
                     break label159;
                  }

                  if (var14 != 0) {
                     return;
                  }
               }
            }

            double var50;
            var26 = (var50 = var5.x() - 0.0) == 0.0 ? 0 : (var50 < 0.0 ? -1 : 1);
         }

         if (var2 != null) {
            if (var26 == 0) {
               return;
            }

            double var51;
            var26 = (var51 = var5.y() - 0.0) == 0.0 ? 0 : (var51 < 0.0 ? -1 : 1);
         }

         if (var2 != null) {
            if (var26 == 0) {
               return;
            }

            double var52;
            var26 = (var52 = var5.z() - 0.0) == 0.0 ? 0 : (var52 < 0.0 ? -1 : 1);
         }

         if (var2 != null) {
            if (var26 == 0) {
               return;
            }

            var26 = ((me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.q()) ? 1 : 0);
         }

         if (var2 != null) {
            if (var26 != 0) {
               return;
            }

            var26 = ((IlllIIIlIlIIIIIIlIllIIlllllIIllIlIllIlllIIllllIlIllIIlllIIlIIlIIIIIIIllIlIlllIlIIlIII.a(var3)) ? 1 : 0);
         }

         if (var26 == 0) {
            float var10004 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
               .getYRot();
            float var15 = var22.yRot();
            float var16 = var10004;
            short var37 = -19730;
            short var40 = -3796;
            short var10003 = -19736;
            short var41 = 3831;
            short var10005 = -19732;
            short var10006 = -18893;
            short var10007 = -19734;
            short var10008 = -17008;
            short var10009 = -19741;
            short var10010 = -19008;
            this.a("DETECTED ROTATION: " + var8 + " PITCH: " + var7 + " YAW: " + var8 + " PLAYER YAW: " + var16 + " CHANGE YAW: " + var15);
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "T\u0006ÅÑN\u008c ãÍ©A\u008dm\u00905%Ï >\u0098RD\u0014\u008c[Ð.ÍzªÏªù¥Â\u0085D\u0093è³vªJ\u000f<YQº\u0011Ë½\u0016\u0082-Úéª,\u009fWOÀÈ ©{Dë£\r6\\æ#\u0007¯}å\u001a\u0091Õ&À\u0004²\u009c8\f\b\u0003¥E\tÌP5¶l·Õ¹«ÁÃÑ\nó\u0094\u0086*\u0095d*»,óBâÝ\u000båeeíéj\u0082^Ð4\u001av¾ÿËÜ\u0019ZH\u0097\u008d¨Ä\u00adN$ò\u0018Ál\rb+\u0000\u0094\u0011Xð·4×>J¨8\u0091,cp\u009cªa\u008c\"ýÓiþ\u0014n)ãîìáy\u001f³\bn¤'\u0095è\u001dCð¸Ã\u008e\u009döBiºÇ\u0013\u0011ðò\u0005\u0084þC\u0098QÅò³^A6M \u0086ô\u0004àCr÷";
      int var4 = "T\u0006ÅÑN\u008c ãÍ©A\u008dm\u00905%Ï >\u0098RD\u0014\u008c[Ð.ÍzªÏªù¥Â\u0085D\u0093è³vªJ\u000f<YQº\u0011Ë½\u0016\u0082-Úéª,\u009fWOÀÈ ©{Dë£\r6\\æ#\u0007¯}å\u001a\u0091Õ&À\u0004²\u009c8\f\b\u0003¥E\tÌP5¶l·Õ¹«ÁÃÑ\nó\u0094\u0086*\u0095d*»,óBâÝ\u000båeeíéj\u0082^Ð4\u001av¾ÿËÜ\u0019ZH\u0097\u008d¨Ä\u00adN$ò\u0018Ál\rb+\u0000\u0094\u0011Xð·4×>J¨8\u0091,cp\u009cªa\u008c\"ýÓiþ\u0014n)ãîìáy\u001f³\bn¤'\u0095è\u001dCð¸Ã\u008e\u009döBiºÇ\u0013\u0011ðò\u0005\u0084þC\u0098QÅò³^A6M \u0086ô\u0004àCr÷"
         .length();
      char var1 = 'E';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 116;
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
                     case 0 -> 36;
                     case 1 -> 11;
                     case 2 -> 54;
                     case 3 -> 40;
                     case 4 -> 123;
                     case 5 -> 24;
                     default -> 40;
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
                     d = new String[9];
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

                  var2 = "f½\u0088Hl\u001a\rê\u00ad\u0010\u0005#\u0000r;g#\u0013\u0019q";
                  var4 = "f½\u0088Hl\u001a\rê\u00ad\u0010\u0005#\u0000r;g#\u0013\u0019q".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 53;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -19733) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 130;
            case 1 -> 178;
            case 2 -> 212;
            case 3 -> 146;
            case 4 -> 104;
            case 5 -> 13;
            case 6 -> 55;
            case 7 -> 113;
            case 8 -> 128;
            case 9 -> 202;
            case 10 -> 32;
            case 11 -> 3;
            case 12 -> 152;
            case 13 -> 239;
            case 14 -> 18;
            case 15 -> 161;
            case 16 -> 79;
            case 17 -> 6;
            case 18 -> 159;
            case 19 -> 246;
            case 20 -> 28;
            case 21 -> 52;
            case 22 -> 90;
            case 23 -> 165;
            case 24 -> 249;
            case 25 -> 48;
            case 26 -> 66;
            case 27 -> 89;
            case 28 -> 179;
            case 29 -> 93;
            case 30 -> 194;
            case 31 -> 213;
            case 32 -> 122;
            case 33 -> 211;
            case 34 -> 88;
            case 35 -> 168;
            case 36 -> 201;
            case 37 -> 30;
            case 38 -> 228;
            case 39 -> 133;
            case 40 -> 63;
            case 41 -> 107;
            case 42 -> 200;
            case 43 -> 193;
            case 44 -> 99;
            case 45 -> 123;
            case 46 -> 45;
            case 47 -> 108;
            case 48 -> 91;
            case 49 -> 33;
            case 50 -> 75;
            case 51 -> 217;
            case 52 -> 77;
            case 53 -> 116;
            case 54 -> 72;
            case 55 -> 9;
            case 56 -> 141;
            case 57 -> 34;
            case 58 -> 169;
            case 59 -> 58;
            case 60 -> 135;
            case 61 -> 208;
            case 62 -> 195;
            case 63 -> 10;
            case 64 -> 172;
            case 65 -> 39;
            case 66 -> 49;
            case 67 -> 25;
            case 68 -> 111;
            case 69 -> 244;
            case 70 -> 222;
            case 71 -> 180;
            case 72 -> 62;
            case 73 -> 40;
            case 74 -> 87;
            case 75 -> 26;
            case 76 -> 247;
            case 77 -> 97;
            case 78 -> 162;
            case 79 -> 37;
            case 80 -> 109;
            case 81 -> 187;
            case 82 -> 207;
            case 83 -> 132;
            case 84 -> 42;
            case 85 -> 134;
            case 86 -> 14;
            case 87 -> 254;
            case 88 -> 53;
            case 89 -> 102;
            case 90 -> 227;
            case 91 -> 215;
            case 92 -> 203;
            case 93 -> 118;
            case 94 -> 242;
            case 95 -> 29;
            case 96 -> 205;
            case 97 -> 80;
            case 98 -> 155;
            case 99 -> 12;
            case 100 -> 36;
            case 101 -> 5;
            case 102 -> 74;
            case 103 -> 188;
            case 104 -> 198;
            case 105 -> 31;
            case 106 -> 16;
            case 107 -> 0;
            case 108 -> 184;
            case 109 -> 216;
            case 110 -> 230;
            case 111 -> 47;
            case 112 -> 71;
            case 113 -> 2;
            case 114 -> 57;
            case 115 -> 126;
            case 116 -> 199;
            case 117 -> 240;
            case 118 -> 138;
            case 119 -> 220;
            case 120 -> 73;
            case 121 -> 84;
            case 122 -> 190;
            case 123 -> 157;
            case 124 -> 243;
            case 125 -> 127;
            case 126 -> 137;
            case 127 -> 35;
            case 128 -> 156;
            case 129 -> 38;
            case 130 -> 236;
            case 131 -> 160;
            case 132 -> 241;
            case 133 -> 15;
            case 134 -> 46;
            case 135 -> 54;
            case 136 -> 131;
            case 137 -> 119;
            case 138 -> 139;
            case 139 -> 59;
            case 140 -> 20;
            case 141 -> 68;
            case 142 -> 105;
            case 143 -> 1;
            case 144 -> 206;
            case 145 -> 120;
            case 146 -> 226;
            case 147 -> 174;
            case 148 -> 96;
            case 149 -> 150;
            case 150 -> 112;
            case 151 -> 7;
            case 152 -> 170;
            case 153 -> 86;
            case 154 -> 196;
            case 155 -> 125;
            case 156 -> 151;
            case 157 -> 115;
            case 158 -> 177;
            case 159 -> 231;
            case 160 -> 64;
            case 161 -> 233;
            case 162 -> 176;
            case 163 -> 221;
            case 164 -> 117;
            case 165 -> 154;
            case 166 -> 164;
            case 167 -> 251;
            case 168 -> 235;
            case 169 -> 92;
            case 170 -> 82;
            case 171 -> 95;
            case 172 -> 149;
            case 173 -> 19;
            case 174 -> 218;
            case 175 -> 171;
            case 176 -> 143;
            case 177 -> 78;
            case 178 -> 51;
            case 179 -> 27;
            case 180 -> 101;
            case 181 -> 148;
            case 182 -> 17;
            case 183 -> 147;
            case 184 -> 145;
            case 185 -> 158;
            case 186 -> 214;
            case 187 -> 100;
            case 188 -> 210;
            case 189 -> 76;
            case 190 -> 163;
            case 191 -> 124;
            case 192 -> 70;
            case 193 -> 103;
            case 194 -> 69;
            case 195 -> 197;
            case 196 -> 44;
            case 197 -> 43;
            case 198 -> 225;
            case 199 -> 183;
            case 200 -> 56;
            case 201 -> 191;
            case 202 -> 166;
            case 203 -> 114;
            case 204 -> 185;
            case 205 -> 60;
            case 206 -> 248;
            case 207 -> 4;
            case 208 -> 83;
            case 209 -> 94;
            case 210 -> 144;
            case 211 -> 142;
            case 212 -> 245;
            case 213 -> 238;
            case 214 -> 121;
            case 215 -> 250;
            case 216 -> 186;
            case 217 -> 253;
            case 218 -> 175;
            case 219 -> 61;
            case 220 -> 21;
            case 221 -> 223;
            case 222 -> 41;
            case 223 -> 22;
            case 224 -> 136;
            case 225 -> 232;
            case 226 -> 189;
            case 227 -> 234;
            case 228 -> 50;
            case 229 -> 129;
            case 230 -> 106;
            case 231 -> 65;
            case 232 -> 67;
            case 233 -> 167;
            case 234 -> 219;
            case 235 -> 140;
            case 236 -> 209;
            case 237 -> 255;
            case 238 -> 192;
            case 239 -> 81;
            case 240 -> 224;
            case 241 -> 153;
            case 242 -> 85;
            case 243 -> 237;
            case 244 -> 110;
            case 245 -> 8;
            case 246 -> 204;
            case 247 -> 11;
            case 248 -> 181;
            case 249 -> 173;
            case 250 -> 23;
            case 251 -> 229;
            case 252 -> 182;
            case 253 -> 24;
            case 254 -> 252;
            default -> 98;
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
    public void a(me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
        this.onPacket(var1);
    }

}
