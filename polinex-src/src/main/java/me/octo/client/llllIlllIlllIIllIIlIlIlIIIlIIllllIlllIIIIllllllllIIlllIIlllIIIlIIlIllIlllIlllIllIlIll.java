package me.octo.client;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public final class llllIlllIlllIIllIIlIlIlIIIlIIllllIlllIIIIllllllllIIlllIIlllIIIlIIlIllIlllIlllIllIlIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llllIlllIlllIIllIIlIlIlIIIlIIllllIlllIIIIllllllllIIlllIIlllIIIlIIlIllIlllIlllIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static llllIlllIlllIIllIIlIlIlIIIlIIllllIlllIIIIllllllllIIlllIIlllIIIlIIlIllIlllIlllIllIlIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private llllIlllIlllIIllIIlIlIlIIIlIIllllIlllIIIIllllllllIIlllIIlllIIIlIIlIllIlllIlllIllIlIll() {
      short var10001 = 29892;
      short var10002 = 9961;
      var10002 = 29889;
      short var10003 = -19008;
      short var10004 = 29898;
      short var10005 = 5051;
      super(
         "Jasper Drill Bug",
         "Abuses the Jasper Drill Bug to gain more mining speed on gemstones. A Jasper Drill is required!",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         "Crystal Hollows"
      );
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (!var1.c()) {
         label66: {
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 != null) {
               if (var4
                  == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                {
                  break label66;
               }

               var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
               var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            }

            if (var4 != var10001) {
               return;
            }
         }

         llllIlllIlllIIllIIlIlIlIIIlIIllllIlllIIIIllllllllIIlllIIlllIIIlIIlIllIlllIlllIllIlIll var5 = this;
         if (var2 != null) {
            if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               return;
            }

            var5 = this;
         }

         BlockPos var3 = var5.ag();
         if (var3 != null) {
            double var18;
            int var6 = (
                     var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u(),
                              me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .d(var3)
                           )
                        - 4.0
                  )
                  == 0.0
               ? 0
               : (var18 < 0.0 ? -1 : 1);
            if (var2 != null) {
               if (var6 >= 0) {
                  return;
               }

               short var8 = 29913;
               short var10002 = -25051;
               var6 = ((me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .c("Jasper Drill X")) ? 1 : 0);
            }

            label71: {
               if (var2 != null) {
                  if (var6 != 0) {
                     break label71;
                  }

                  short var9 = 29903;
                  short var14 = -2966;
                  var6 = ((me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c("Gemstone Drill LT-522")) ? 1 : 0);
               }

               if (var2 != null) {
                  if (var6 != 0) {
                     break label71;
                  }

                  short var10 = 29897;
                  short var15 = 20714;
                  var6 = ((me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c("Ruby Drill TX-15")) ? 1 : 0);
               }

               if (var2 != null) {
                  if (var6 != 0) {
                     break label71;
                  }

                  short var11 = 29890;
                  short var16 = -363;
                  var6 = ((me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c("Topaz Drill KGR-12")) ? 1 : 0);
               }

               if (var6 == 0) {
                  return;
               }
            }

            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
            short var7 = 29900;
            ClientPacketListener var12 = this.ap().getConnection();
            Intrinsics.checkNotNull(var12);
            Action var10004 = Action.START_DESTROY_BLOCK;
            LocalPlayer var10006 = this.ap().player;
            Intrinsics.checkNotNull(var10006);
            var12.send(new ServerboundPlayerActionPacket(var10004, var3, Direction.fromYRot(var10006.getYRot())));
            short var13 = 12843;
            LocalPlayer var17 = this.ap().player;
            Intrinsics.checkNotNull(var17);
            var17.swing(InteractionHand.MAIN_HAND);
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "Successfully used Jasper Drill Bug! You can now mine with additional mining speed until you change lobbies!"
            );
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      Object var6 = null; // PX-FIX
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var2 = var10000;
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         label48: {
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 != null) {
               if (var4
                  == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                {
                  break label48;
               }

               var4 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
               var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            }

            if (var4 != var10001) {
               return;
            }
         }

         label54: {
            boolean var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var2 != null) {
               if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                  return;
               }

               var6 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               if (var2 == null) {
                  break label54;
               }

               var5 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof ServerboundPlayerActionPacket;
            }

            if (!var5) {
               return;
            }

            var6 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         label29: {
            Packet var3 =((Packet)( var6));
            Action var7 = ((ServerboundPlayerActionPacket)var3).getAction();
            Action var8 = Action.ABORT_DESTROY_BLOCK;
            if (var2 != null) {
               if (var7 == Action.ABORT_DESTROY_BLOCK) {
                  break label29;
               }

               var7 = ((ServerboundPlayerActionPacket)var3).getAction();
               var8 = Action.STOP_DESTROY_BLOCK;
            }

            if (var7 != var8) {
               return;
            }
         }

         var1.a(true);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.c(false);
   }

   private final BlockPos ag() {
      BlockPos var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      BlockPos var3 = null;
      int[] var1 = var10000;
      double var4 = Double.MAX_VALUE;
      int var6 = -4;

      label81:
      while (true) {
         int var12 = var6;

         label79:
         while (var12 < 5) {
            int var7 = -4;

            label76:
            while (true) {
               int var13 = var7;

               label74:
               while (true) {
                  if (var13 >= 5) {
                     break label76;
                  }

                  var12 = -4;
                  if (var1 == null) {
                     continue label79;
                  }

                  int var8 = -4;

                  while (var8 < 5) {
                     var13 = var7;
                     if (var1 == null) {
                        continue label74;
                     }

                     label68: {
                        label88: {
                           label89: {
                              if (var1 != null) {
                                 if (var7 != 0) {
                                    break label89;
                                 }

                                 var13 = var8;
                              }

                              if (var1 != null) {
                                 if (var13 != 0) {
                                    break label89;
                                 }

                                 var13 = var6;
                              }

                              if (var13 <= 0) {
                                 break label88;
                              }
                           }

                           BlockPos var14 = var2.offset(new Vec3i(var7, var6, var8));
                           short var10002 = 29902;
                           short var10003 = -9371;
                           Intrinsics.checkNotNullExpressionValue(var14, "offset(...)");
                           BlockPos var9 = var14;
                           if (var1 == null) {
                              break label68;
                           }

                           me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl var15 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           ClientLevel var10001 = this.ap().level;
                           Intrinsics.checkNotNull(var10001);
                           BlockState var16 = var10001.getBlockState(var9);
                           var10003 = 29894;
                           short var10004 = 24635;
                           Intrinsics.checkNotNullExpressionValue(var16, "getBlockState(...)");
                           if (var15.D(var16)) {
                              double var10 = var2.distSqr(var9);
                              if (var1 == null) {
                                 break label68;
                              }

                              if (var10 < var4) {
                                 var4 = var10;
                                 var3 = var9;
                              }
                           }
                        }

                        var8++;
                     }

                     if (var1 == null) {
                        break;
                     }
                  }

                  var7++;
                  if (var1 == null) {
                     break label76;
                  }
                  break;
               }
            }

            var6++;
            if (var1 == null) {
               return var3;
            }
            continue label81;
         }

         return var3;
      }
   }

   @Override
   public void aB() {
      label20: {
         int[] var1;
         label19: {
            int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            super.aB();
            var1 = var10000;
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var1 != null) {
               if (var3
                  == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                {
                  break label19;
               }

               var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
               var10001 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            }

            if (var3 != var10001) {
               break label20;
            }
         }

         String[] var2 = new String[7];
         short var10002 = 29893;
         short var10003 = 28441;
         var2[0] = "Jasper Drill Bug Instructions";
         var10002 = 29888;
         var10003 = 7588;
         var2[1] = "In order to properly use this feature, you should enable it in the lobby in which you want to mine";
         var10002 = 29912;
         var10003 = -8046;
         var2[2] = "After enabling it come up to a gemstone and wait for a confirmation message in chat";
         var10002 = 29896;
         var10003 = -12975;
         var2[3] = "If you got a message it means the bug worked and you have additional 800 mining speed now";
         var10002 = 29891;
         var10003 = -11929;
         var2[4] = "Remember! You need to do this everytime you change your lobby!";
         var10002 = 29895;
         var10003 = 18581;
         var2[5] = "This feature will automatically disable on lobby change OR if you're no longer in the Crystal Hollows OR Glacite Mines!";
         var10002 = 29899;
         var10003 = -13899;
         var2[6] = "Enjoy mining!";
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(var2);
         if (var1 != null) {
            return;
         }
      }

      short var4 = 29901;
      short var5 = -7280;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "Failed to enable Jasper Drill Bug! You need to be in the Crystal Hollows OR Glacite Mines!"
      );
      this.c(false);
   }

   @Override
   public void aC() {
      super.aC();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      String var2 = "(Ê>«Ã5\u0096&\f@\u0002Ü'÷\u0099ØòFk\u0083\u008aì\u0094\u0082$^F Ê\u0012K/¹ÃÐ\u0015Æ\"\u0005@(\u00ad`B\u009eàÖV\u0015g|´\fj§\u0012àOÏ\u0088\u009fó#od¼N\u0017ÇwÐtwôìSü\u009b)\u008büj\u0084\u001a\u0001?Ý\u008d \u0010|°\u008e\u0095\u0090Ã\báÄox\u0017\u0010]\\\u0083\u000fà85iË2£\u0017HÒ\u0005ûM¥d\rÖ¨&øÕÞÍª\u0082\u0003¼\fvkÙµ\u001a/fú:\u0018º¾Á\u0000\u009ao8Æ\u0005\u0010M$\u0095\u0085_Ç#ÏQ\u0010F¿ruP ¼\u0083^@íåfµ\u0091N\u0084£\u000bµÙÇ\u0000¢¢¥z\u0015_í\u0094ÜôyN>É\u0096ûRq\u008a_j½¡ÛÔÏò\u0014>\u000ea?*t\u001ac\u0006»è\u0018\u0083.G\u008a¬\u0018\u001f\u0094Ó¢Øû?xìrZòGÂè6ûcß²Z\u0090NÙD&V~hÅ\u001eÉ\u0087 bMUo¶ù\u0082ç Þ\u009d<ÓY\u0006¨:7ÍwÅ\tÒ´Ù\u009b\tF\u0010\u008d\u009a\u009e\u0080ª\u000fx\u0092\u000f\u0013ÑÈÂË2\u001bË¡ÓP¸y.ÊÖ-\u0081\\5¿äa$ôu\u009e1X\u000b?\u0001xØ\u008f\u0011\\Ê\u001dç@\u0015\u0001Ô\u0099\u0001È1Áý.I²Ãe\u001cQ»!¾\u0080\u000eýbÝ2\u0080«\tð4¸ú$5\u001178ËÞåöVøG\u0000*ÅYJ\u0004\u0096ª#U\u0004.^±\u007f\u001d\u0084k\u000fE\u008e6ìñÎaTßwãßõuü©b\u0000gE0\u0081.Û\u001c\u009fç\u0019ÔìF_½õ²¹ÎG¼\u0095\u009aÒ,]\u009a\u009c\u0084÷(¤Ê&\u0087e>®\n¸_\u0092û5\u0003WmOø0ûb³jJL¤þ\\è¾ô»#Íæ§ÒC\u0099¶\u0092\u0012XÃd ×4i.R-;\u009e1?J\u0007ý\u0088RqÆ\u0088<\u0017\u0019³\u0019±Öáä\u0094î9\u001bUªâJ\u008cB\u008d\u007fÞJ\u009f\u008a- Â¦\u009c¿bã,~ZµÞ\u0002ø\u0089\u0012ó\u001e«\u0001>.ú¯oÞäUU\u0085æ§\u008eo>µU¸'õ,Wå\u0097Û\u008f\u007f\u0095\u0001;ôÚ\u0012ý½¸Qd\u001aeú\u0083\u0080ZáHOê@¡|\u009ecÓÃ©\u007f*Ø\u0086vñ¦X.5\u000eÌ\u00ad\n\u0002-\u009e]\u0012³.\u0010\u001c3\u0088z& a@ïÖ\u008c½3X\u000bó\u001dqÁ%$\u0093ë×99ùVXhä`d\u008co\u0094\u009d\tà;8é.Ë£´\u0012{\u0015ë\b¤\u0007Z5\u0082¯)4n\u0018\u0016\u0095|QwóÃ²O}ñ¢É|z&¾»%\u0006Ä\u0093x½=Â/Z}ÞÄ!ñ{\u008a\u008c±ì\u0018J\u001a£\u0019\u001e\u00ad\u0006³^,û'ÐÐX\u0013Òwp\u008b«\u0096Ï1\u0004v\u008dÉ.Ns\u0017æ\u000b£\u008a\u0003Gõ\u0082~ÖE\u001fÔÍñ\u0092\u008aRò\u009a¯$è¨sUm¼%\u0093êÐï\u0019w»ób´/KPÊaAAÎ9ï\u008c\u0093\"Ö";
      int var4 = "(Ê>«Ã5\u0096&\f@\u0002Ü'÷\u0099ØòFk\u0083\u008aì\u0094\u0082$^F Ê\u0012K/¹ÃÐ\u0015Æ\"\u0005@(\u00ad`B\u009eàÖV\u0015g|´\fj§\u0012àOÏ\u0088\u009fó#od¼N\u0017ÇwÐtwôìSü\u009b)\u008büj\u0084\u001a\u0001?Ý\u008d \u0010|°\u008e\u0095\u0090Ã\báÄox\u0017\u0010]\\\u0083\u000fà85iË2£\u0017HÒ\u0005ûM¥d\rÖ¨&øÕÞÍª\u0082\u0003¼\fvkÙµ\u001a/fú:\u0018º¾Á\u0000\u009ao8Æ\u0005\u0010M$\u0095\u0085_Ç#ÏQ\u0010F¿ruP ¼\u0083^@íåfµ\u0091N\u0084£\u000bµÙÇ\u0000¢¢¥z\u0015_í\u0094ÜôyN>É\u0096ûRq\u008a_j½¡ÛÔÏò\u0014>\u000ea?*t\u001ac\u0006»è\u0018\u0083.G\u008a¬\u0018\u001f\u0094Ó¢Øû?xìrZòGÂè6ûcß²Z\u0090NÙD&V~hÅ\u001eÉ\u0087 bMUo¶ù\u0082ç Þ\u009d<ÓY\u0006¨:7ÍwÅ\tÒ´Ù\u009b\tF\u0010\u008d\u009a\u009e\u0080ª\u000fx\u0092\u000f\u0013ÑÈÂË2\u001bË¡ÓP¸y.ÊÖ-\u0081\\5¿äa$ôu\u009e1X\u000b?\u0001xØ\u008f\u0011\\Ê\u001dç@\u0015\u0001Ô\u0099\u0001È1Áý.I²Ãe\u001cQ»!¾\u0080\u000eýbÝ2\u0080«\tð4¸ú$5\u001178ËÞåöVøG\u0000*ÅYJ\u0004\u0096ª#U\u0004.^±\u007f\u001d\u0084k\u000fE\u008e6ìñÎaTßwãßõuü©b\u0000gE0\u0081.Û\u001c\u009fç\u0019ÔìF_½õ²¹ÎG¼\u0095\u009aÒ,]\u009a\u009c\u0084÷(¤Ê&\u0087e>®\n¸_\u0092û5\u0003WmOø0ûb³jJL¤þ\\è¾ô»#Íæ§ÒC\u0099¶\u0092\u0012XÃd ×4i.R-;\u009e1?J\u0007ý\u0088RqÆ\u0088<\u0017\u0019³\u0019±Öáä\u0094î9\u001bUªâJ\u008cB\u008d\u007fÞJ\u009f\u008a- Â¦\u009c¿bã,~ZµÞ\u0002ø\u0089\u0012ó\u001e«\u0001>.ú¯oÞäUU\u0085æ§\u008eo>µU¸'õ,Wå\u0097Û\u008f\u007f\u0095\u0001;ôÚ\u0012ý½¸Qd\u001aeú\u0083\u0080ZáHOê@¡|\u009ecÓÃ©\u007f*Ø\u0086vñ¦X.5\u000eÌ\u00ad\n\u0002-\u009e]\u0012³.\u0010\u001c3\u0088z& a@ïÖ\u008c½3X\u000bó\u001dqÁ%$\u0093ë×99ùVXhä`d\u008co\u0094\u009d\tà;8é.Ë£´\u0012{\u0015ë\b¤\u0007Z5\u0082¯)4n\u0018\u0016\u0095|QwóÃ²O}ñ¢É|z&¾»%\u0006Ä\u0093x½=Â/Z}ÞÄ!ñ{\u008a\u008c±ì\u0018J\u001a£\u0019\u001e\u00ad\u0006³^,û'ÐÐX\u0013Òwp\u008b«\u0096Ï1\u0004v\u008dÉ.Ns\u0017æ\u000b£\u008a\u0003Gõ\u0082~ÖE\u001fÔÍñ\u0092\u008aRò\u009a¯$è¨sUm¼%\u0093êÐï\u0019w»ób´/KPÊaAAÎ9ï\u008c\u0093\"Ö"
         .length();
      char var1 = 'Y';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 60;
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
                     case 0 -> 100;
                     case 1 -> 37;
                     case 2 -> 76;
                     case 3 -> 62;
                     case 4 -> 125;
                     case 5 -> 31;
                     default -> 88;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llllIlllIlllIIllIIlIlIlIIIlIIllllIlllIIIIllllllllIIlllIIlllIIIlIIlIllIlllIlllIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new llllIlllIlllIIllIIlIlIlIIIlIIllllIlllIIIIllllllllIIlllIIlllIIIlIIlIllIlllIlllIllIlIll();
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

                  var2 = "\u0099)¸&=£_ï;ª\u008a°P\u0094X\bÍ©\u0082ð\u0093(ê/Å¼<}\u008c4\u0003`\u0083dkég?ÇÆÞ3#\u009dm:ÿð:St$à{\u0096àH\u0005{¦\u0015s^\u000b\u0097b\u0014LÂi:ï\u00adK?Læ\u0012À\u0014\u0098N\u008c\u000eH¥ïE'*¬ì»®ë_2ó";
                  var4 = "\u0099)¸&=£_ï;ª\u008a°P\u0094X\bÍ©\u0082ð\u0093(ê/Å¼<}\u008c4\u0003`\u0083dkég?ÇÆÞ3#\u009dm:ÿð:St$à{\u0096àH\u0005{¦\u0015s^\u000b\u0097b\u0014LÂi:ï\u00adK?Læ\u0012À\u0014\u0098N\u008c\u000eH¥ïE'*¬ì»®ë_2ó"
                     .length();
                  var1 = 'S';
                  var8 = -1;
            }

            var10000 = 121;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 29896) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 0;
            case 1 -> 187;
            case 2 -> 70;
            case 3 -> 129;
            case 4 -> 211;
            case 5 -> 177;
            case 6 -> 133;
            case 7 -> 184;
            case 8 -> 212;
            case 9 -> 50;
            case 10 -> 174;
            case 11 -> 209;
            case 12 -> 63;
            case 13 -> 238;
            case 14 -> 96;
            case 15 -> 232;
            case 16 -> 115;
            case 17 -> 180;
            case 18 -> 77;
            case 19 -> 55;
            case 20 -> 59;
            case 21 -> 120;
            case 22 -> 121;
            case 23 -> 49;
            case 24 -> 169;
            case 25 -> 88;
            case 26 -> 227;
            case 27 -> 196;
            case 28 -> 101;
            case 29 -> 1;
            case 30 -> 98;
            case 31 -> 159;
            case 32 -> 155;
            case 33 -> 60;
            case 34 -> 246;
            case 35 -> 247;
            case 36 -> 116;
            case 37 -> 250;
            case 38 -> 29;
            case 39 -> 132;
            case 40 -> 109;
            case 41 -> 182;
            case 42 -> 81;
            case 43 -> 84;
            case 44 -> 143;
            case 45 -> 162;
            case 46 -> 253;
            case 47 -> 23;
            case 48 -> 136;
            case 49 -> 190;
            case 50 -> 43;
            case 51 -> 131;
            case 52 -> 248;
            case 53 -> 145;
            case 54 -> 199;
            case 55 -> 172;
            case 56 -> 235;
            case 57 -> 4;
            case 58 -> 113;
            case 59 -> 163;
            case 60 -> 28;
            case 61 -> 27;
            case 62 -> 171;
            case 63 -> 237;
            case 64 -> 61;
            case 65 -> 52;
            case 66 -> 90;
            case 67 -> 31;
            case 68 -> 219;
            case 69 -> 242;
            case 70 -> 148;
            case 71 -> 128;
            case 72 -> 215;
            case 73 -> 44;
            case 74 -> 233;
            case 75 -> 102;
            case 76 -> 119;
            case 77 -> 226;
            case 78 -> 103;
            case 79 -> 208;
            case 80 -> 87;
            case 81 -> 137;
            case 82 -> 142;
            case 83 -> 8;
            case 84 -> 138;
            case 85 -> 6;
            case 86 -> 112;
            case 87 -> 106;
            case 88 -> 220;
            case 89 -> 76;
            case 90 -> 5;
            case 91 -> 41;
            case 92 -> 127;
            case 93 -> 110;
            case 94 -> 249;
            case 95 -> 69;
            case 96 -> 214;
            case 97 -> 229;
            case 98 -> 38;
            case 99 -> 252;
            case 100 -> 176;
            case 101 -> 224;
            case 102 -> 123;
            case 103 -> 93;
            case 104 -> 33;
            case 105 -> 80;
            case 106 -> 231;
            case 107 -> 197;
            case 108 -> 167;
            case 109 -> 37;
            case 110 -> 203;
            case 111 -> 46;
            case 112 -> 24;
            case 113 -> 13;
            case 114 -> 126;
            case 115 -> 183;
            case 116 -> 189;
            case 117 -> 32;
            case 118 -> 161;
            case 119 -> 140;
            case 120 -> 200;
            case 121 -> 191;
            case 122 -> 25;
            case 123 -> 149;
            case 124 -> 206;
            case 125 -> 107;
            case 126 -> 71;
            case 127 -> 83;
            case 128 -> 95;
            case 129 -> 89;
            case 130 -> 92;
            case 131 -> 130;
            case 132 -> 205;
            case 133 -> 216;
            case 134 -> 36;
            case 135 -> 47;
            case 136 -> 73;
            case 137 -> 170;
            case 138 -> 7;
            case 139 -> 35;
            case 140 -> 223;
            case 141 -> 230;
            case 142 -> 234;
            case 143 -> 118;
            case 144 -> 111;
            case 145 -> 117;
            case 146 -> 225;
            case 147 -> 178;
            case 148 -> 114;
            case 149 -> 22;
            case 150 -> 20;
            case 151 -> 15;
            case 152 -> 10;
            case 153 -> 75;
            case 154 -> 153;
            case 155 -> 14;
            case 156 -> 19;
            case 157 -> 86;
            case 158 -> 17;
            case 159 -> 158;
            case 160 -> 201;
            case 161 -> 228;
            case 162 -> 56;
            case 163 -> 240;
            case 164 -> 39;
            case 165 -> 175;
            case 166 -> 91;
            case 167 -> 30;
            case 168 -> 173;
            case 169 -> 181;
            case 170 -> 164;
            case 171 -> 150;
            case 172 -> 18;
            case 173 -> 85;
            case 174 -> 243;
            case 175 -> 57;
            case 176 -> 11;
            case 177 -> 193;
            case 178 -> 94;
            case 179 -> 100;
            case 180 -> 68;
            case 181 -> 160;
            case 182 -> 195;
            case 183 -> 210;
            case 184 -> 192;
            case 185 -> 244;
            case 186 -> 251;
            case 187 -> 134;
            case 188 -> 78;
            case 189 -> 141;
            case 190 -> 104;
            case 191 -> 202;
            case 192 -> 21;
            case 193 -> 147;
            case 194 -> 58;
            case 195 -> 105;
            case 196 -> 151;
            case 197 -> 222;
            case 198 -> 207;
            case 199 -> 34;
            case 200 -> 241;
            case 201 -> 99;
            case 202 -> 53;
            case 203 -> 122;
            case 204 -> 179;
            case 205 -> 82;
            case 206 -> 45;
            case 207 -> 12;
            case 208 -> 72;
            case 209 -> 218;
            case 210 -> 255;
            case 211 -> 26;
            case 212 -> 213;
            case 213 -> 108;
            case 214 -> 3;
            case 215 -> 254;
            case 216 -> 185;
            case 217 -> 67;
            case 218 -> 9;
            case 219 -> 124;
            case 220 -> 125;
            case 221 -> 51;
            case 222 -> 146;
            case 223 -> 144;
            case 224 -> 188;
            case 225 -> 16;
            case 226 -> 40;
            case 227 -> 165;
            case 228 -> 157;
            case 229 -> 166;
            case 230 -> 204;
            case 231 -> 64;
            case 232 -> 66;
            case 233 -> 221;
            case 234 -> 42;
            case 235 -> 139;
            case 236 -> 156;
            case 237 -> 168;
            case 238 -> 198;
            case 239 -> 135;
            case 240 -> 74;
            case 241 -> 217;
            case 242 -> 65;
            case 243 -> 239;
            case 244 -> 62;
            case 245 -> 245;
            case 246 -> 97;
            case 247 -> 79;
            case 248 -> 48;
            case 249 -> 154;
            case 250 -> 54;
            case 251 -> 152;
            case 252 -> 236;
            case 253 -> 194;
            case 254 -> 2;
            default -> 186;
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
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
