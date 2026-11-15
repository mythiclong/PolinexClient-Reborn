package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   private IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll() {
      short var10001 = -25931;
      short var10002 = -11166;
      var10002 = -25922;
      short var10003 = 11826;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -25928;
      short var10005 = 5239;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIIIlIllllIlIIlIlllIIlIlllllIlllIlIlIlIIIlIlIlllllIIlIllIIIIlIlIlIIIIIIllIlIllIlIlll.a(),
         IIIIIlIllllIlIIlIlllIIlIlllllIlllIlIlIlIIIlIlIlllllIIlIllIIIIlIlIlIIIIIIllIlIllIlIlll.b(),
         IIIIIlIllllIlIIlIlllIIlIlllllIlllIlIlIlIIIlIlIlllllIIlIllIIIIlIlIlIIIIIIllIlIllIlIlll.c()
      };
      super("Etherwarp Overlay", "Helps you find the etherwarp position in the ether.", var3, "Render", var1);
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      Object var17 = null; // PX-FIX
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -25924;
      short var10003 = -1390;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll var12 = this;
      if (var2 == null) {
         if (!this.ag()) {
            return;
         }

         var12 = this;
      }

      Minecraft var13 = var12.ap();
      if (var2 == null) {
         if (var13.screen != null) {
            return;
         }

         var13 = this.ap();
      }

      if (var13.player != null) {
         ItemStack var15 = var13.player.getMainHandItem();
         if (var15 != null) {
            CompoundTag var16 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var15);
            if (var16 != null) {
               CompoundTag var5;
               var5 = var16;
               boolean var7 = false;
               short var10001 = -25932;
               var10002 = -12085;
               var17 = var5.getIntOr("ethermerge", 0);
               label101:
               if (var2 == null) {
                  if (((Boolean)(var17))) {
                     var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var5);
                     var10001 = -25925;
                     var10002 = 13478;
                     var17 = Intrinsics.areEqual(var10000, "ETHERWARP_CONDUIT");
                     if (var2 != null) {
                        break label101;
                     }

                     if (((Boolean)(var17))) {
                        var17 = 0;
                        break label101;
                     }
                  }

                  var17 = 1;
               }

               CompoundTag var19 = ((Boolean)var17 ? var5 : null);
               if ((((Boolean)var17 ? var5 : null)) != null) {
                  CompoundTag var3 = var19;
                  short var10004 = -25923;
                  short var10005 = 21594;
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(57.0 + var3.getIntOr("tuned_transmission", 0));
                  boolean var20;
                  if (var2 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                     var20 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a();
                     if (var2 == null) {
                        ;
                     }
                  } else {
                     var20 = false;
                  }

                  if (!var20 && !(Boolean)((me.octo.client.PXDyn)(Object)(IIIIIlIllllIlIIlIlllIIlIlllllIlllIlIlIlIIIlIlIlllllIIlIllIIIIlIlIlIIIIIIllIlIllIlIlll.a())).ae()) {
                     return;
                  }

                  boolean var21;
                  if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                     var21 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a();
                     if (var2 == null) {
                        ;
                     }
                  } else {
                     var21 = false;
                  }

                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = var21
                     ? new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
                        ((me.octo.client.PXDyn)(Object)(IIIIIlIllllIlIIlIlllIIlIlllllIlllIlIlIlIIIlIlIlllllIIlIllIIIIlIlIlIIIIIIllIlIllIlIlll.c())).j()
                     )
                     : me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                  if (var2 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                     BlockPos var22 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.b();
                     if (var22 != null) {
                        BlockPos var10 = var22;
                        boolean var6 = false;
                        BlockPos var11 = new BlockPos(var10.getX(), var10.getY(), var10.getZ());
                        llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var8 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
                           var4.o()
                        );
                        llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var9 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
                           var4.a(0.7F).o()
                        );
                        if (var2 == null) {
                           switch (((me.octo.client.PXDyn)(Object)(IIIIIlIllllIlIIlIlllIIlIlllllIlllIlIlIlIIIlIlIlllllIIlIllIIIIlIlIlIIIIIIllIlIllIlIlll.b())).<Integer>x()) {
                              case 0:
                                 IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                                    var11, null, var8, 1.5F, null, null, 0.0F, false, 0.0F);
                                 if (var2 == null) {
                                    break;
                                 }
                              case 1:
                                 IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                                    var11, var9, null, 0.0F, null, null, 0.0F, false, 0.0F);
                                 if (var2 == null) {
                                    break;
                                 }
                              case 2:
                                 IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                                    var11, var9, var8, 1.5F, null, null, 0.0F, false, 0.0F);
                           }
                        }
                     }
                  }

                  return;
               }
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var14 = null; // PX-FIX
      String var2;
      IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll var9;
      label96: {
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         short var10002 = -25927;
         short var10003 = 24121;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         boolean var8 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI instanceof ServerboundUseItemPacket;
         if (var2 == null) {
            if (!var8) {
               return;
            }

            var9 = this;
            if (var2 != null) {
               break label96;
            }

            var8 = this.ag();
         }

         if (!var8) {
            return;
         }

         var9 = this;
      }

      Minecraft var10 = var9.ap();
      if (var2 == null) {
         if (var10.screen != null) {
            return;
         }

         var10 = this.ap();
      }

      if (var10.player != null) {
         ItemStack var12 = var10.player.getMainHandItem();
         if (var12 != null) {
            CompoundTag var13 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var12);
            if (var13 != null) {
               CompoundTag var4;
               var4 = var13;
               boolean var6 = false;
               short var10001 = -25930;
               short var19 = 11666;
               var14 = var4.getIntOr("ethermerge", 0);
               label72:
               if (var2 == null) {
                  if (((Boolean)(var14))) {
                     String var15 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var4);
                     var10001 = -25926;
                     var19 = -13010;
                     var14 = Intrinsics.areEqual(var15, "ETHERWARP_CONDUIT");
                     if (var2 != null) {
                        break label72;
                     }

                     if (((Boolean)(var14))) {
                        var14 = 0;
                        break label72;
                     }
                  }

                  var14 = 1;
               }

               if ((((Boolean)var14 ? var4 : null)) != null) {
                  if (var2 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                     BlockPos var16 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.b();
                     if (var16 != null) {
                        BlockPos var3 = var16;
                        boolean var7 = false;
                        boolean var17;
                        if (var2 == null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                           var17 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a();
                           if (var2 == null) {
                              var17 = !var17;
                           }
                        } else {
                           var17 = false;
                        }

                        if (!var17) {
                           Vec3 var5 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .b(var3);
                           this.ap().executeIfPossible(null);
                        }
                     }
                  }

                  return;
               }
            }
         }
      }
   }

   private final boolean ag() {
      String var1;
      boolean var2;
      label33: {
         var1 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         if (var1 == null) {
            LocalPlayer var10000 = this.ap().player;
            if (var10000 != null) {
               var2 = var10000.isShiftKeyDown();
               if (var1 == null) {
                  ;
               }
               break label33;
            }
         }

         var2 = false;
      }

      if (!var2) {
         short var10001 = -25921;
         short var10002 = -16900;
         var2 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("sneak");
         if (var1 != null) {
            return var2;
         }

         if (!var2) {
            return false;
         }
      }

      return true;
   }

   private static final void a(IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll var0, Vec3 var1) {
      LocalPlayer var10000 = var0.ap().player;
      if (var10000 != null) {
         ClientPacketListener var2 = var10000.connection;
         if (var10000.connection != null) {
            double var10003 = var1.x;
            double var10004 = var1.y;
            double var10005 = var1.z;
            LocalPlayer var10006 = var0.ap().player;
            float var5 = var10006 != null ? var10006.getYRot() : 0.0F;
            LocalPlayer var10007 = var0.ap().player;
            float var6 = var10007 != null ? var10007.getXRot() : 0.0F;
            LocalPlayer var10008 = var0.ap().player;
            var2.send(new PosRot(var10003, var10004, var10005, var5, var6, var10008 != null ? var10008.onGround() : false, false));
         }
      }

      var10000 = var0.ap().player;
      if (var10000 != null) {
         var10000.setPos(var1.x, var1.y, var1.z);
      }

      var10000 = var0.ap().player;
      if (var10000 != null) {
         var10000.setDeltaMovement(0.0, 0.0, 0.0);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "ÍS§×c\u0012\u009b¥UaG;]^k+8\u0081òª\u0096z\u0012\u000e3\\X\u0014Ù:ä\n(9\u0015ñÅ{±\u0013ñ\u009cÊütæÐ\u0018¿Ö\u0080°\u0004õÕGÜ)s!\u0004U\u0090\u000br\u0084°#Ò\u0093\u009d\b\u0093·\u009aJ\u0005Z#\u0081Í¸\u0006Þo\u001f+\u000f~\u0005íð££ã\u0011¥p£þMäÙ\u008cYdY]Ï`ÔÒ\u0083\u0011§eã\\E°Ø\u0006y5]wO%Äz\u0081\n\u0018)\u0010Ñ?\u001f\u0097®\u0007>";
      int var4 = "ÍS§×c\u0012\u009b¥UaG;]^k+8\u0081òª\u0096z\u0012\u000e3\\X\u0014Ù:ä\n(9\u0015ñÅ{±\u0013ñ\u009cÊütæÐ\u0018¿Ö\u0080°\u0004õÕGÜ)s!\u0004U\u0090\u000br\u0084°#Ò\u0093\u009d\b\u0093·\u009aJ\u0005Z#\u0081Í¸\u0006Þo\u001f+\u000f~\u0005íð££ã\u0011¥p£þMäÙ\u008cYdY]Ï`ÔÒ\u0083\u0011§eã\\E°Ø\u0006y5]wO%Äz\u0081\n\u0018)\u0010Ñ?\u001f\u0097®\u0007>"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 47;
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
                     case 0 -> 112;
                     case 1 -> 85;
                     case 2 -> 118;
                     case 3 -> 11;
                     case 4 -> 46;
                     case 5 -> 42;
                     default -> 38;
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
                     g = new String[11];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll();
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

                  var2 = "ø\u009e\u008b\u0084ï\f*6\u0080Ëé¢Ü\u0014b'Å\n(wµ¹(±ÖØ\u008cS";
                  var4 = "ø\u009e\u008b\u0084ï\f*6\u0080Ëé¢Ü\u0014b'Å\n(wµ¹(±ÖØ\u008cS".length();
                  var1 = 17;
                  var8 = -1;
            }

            var10000 = 65;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25924) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 10;
            case 1 -> 2;
            case 2 -> 236;
            case 3 -> 231;
            case 4 -> 117;
            case 5 -> 134;
            case 6 -> 79;
            case 7 -> 108;
            case 8 -> 255;
            case 9 -> 217;
            case 10 -> 9;
            case 11 -> 245;
            case 12 -> 229;
            case 13 -> 147;
            case 14 -> 248;
            case 15 -> 200;
            case 16 -> 20;
            case 17 -> 67;
            case 18 -> 106;
            case 19 -> 181;
            case 20 -> 244;
            case 21 -> 197;
            case 22 -> 253;
            case 23 -> 78;
            case 24 -> 7;
            case 25 -> 22;
            case 26 -> 198;
            case 27 -> 69;
            case 28 -> 31;
            case 29 -> 130;
            case 30 -> 49;
            case 31 -> 208;
            case 32 -> 224;
            case 33 -> 184;
            case 34 -> 157;
            case 35 -> 38;
            case 36 -> 177;
            case 37 -> 192;
            case 38 -> 119;
            case 39 -> 90;
            case 40 -> 0;
            case 41 -> 113;
            case 42 -> 110;
            case 43 -> 223;
            case 44 -> 115;
            case 45 -> 95;
            case 46 -> 33;
            case 47 -> 176;
            case 48 -> 84;
            case 49 -> 173;
            case 50 -> 178;
            case 51 -> 48;
            case 52 -> 151;
            case 53 -> 64;
            case 54 -> 230;
            case 55 -> 60;
            case 56 -> 153;
            case 57 -> 126;
            case 58 -> 143;
            case 59 -> 25;
            case 60 -> 16;
            case 61 -> 123;
            case 62 -> 86;
            case 63 -> 148;
            case 64 -> 139;
            case 65 -> 211;
            case 66 -> 88;
            case 67 -> 149;
            case 68 -> 136;
            case 69 -> 23;
            case 70 -> 166;
            case 71 -> 169;
            case 72 -> 140;
            case 73 -> 179;
            case 74 -> 100;
            case 75 -> 125;
            case 76 -> 6;
            case 77 -> 114;
            case 78 -> 43;
            case 79 -> 76;
            case 80 -> 175;
            case 81 -> 54;
            case 82 -> 77;
            case 83 -> 3;
            case 84 -> 154;
            case 85 -> 21;
            case 86 -> 59;
            case 87 -> 209;
            case 88 -> 158;
            case 89 -> 171;
            case 90 -> 195;
            case 91 -> 168;
            case 92 -> 51;
            case 93 -> 145;
            case 94 -> 70;
            case 95 -> 105;
            case 96 -> 182;
            case 97 -> 205;
            case 98 -> 215;
            case 99 -> 251;
            case 100 -> 12;
            case 101 -> 159;
            case 102 -> 240;
            case 103 -> 92;
            case 104 -> 128;
            case 105 -> 41;
            case 106 -> 40;
            case 107 -> 216;
            case 108 -> 185;
            case 109 -> 36;
            case 110 -> 133;
            case 111 -> 87;
            case 112 -> 19;
            case 113 -> 124;
            case 114 -> 188;
            case 115 -> 26;
            case 116 -> 191;
            case 117 -> 163;
            case 118 -> 219;
            case 119 -> 137;
            case 120 -> 8;
            case 121 -> 24;
            case 122 -> 89;
            case 123 -> 94;
            case 124 -> 47;
            case 125 -> 203;
            case 126 -> 62;
            case 127 -> 196;
            case 128 -> 213;
            case 129 -> 164;
            case 130 -> 32;
            case 131 -> 186;
            case 132 -> 120;
            case 133 -> 221;
            case 134 -> 35;
            case 135 -> 121;
            case 136 -> 146;
            case 137 -> 249;
            case 138 -> 63;
            case 139 -> 247;
            case 140 -> 28;
            case 141 -> 46;
            case 142 -> 18;
            case 143 -> 17;
            case 144 -> 39;
            case 145 -> 5;
            case 146 -> 155;
            case 147 -> 232;
            case 148 -> 27;
            case 149 -> 238;
            case 150 -> 30;
            case 151 -> 71;
            case 152 -> 162;
            case 153 -> 172;
            case 154 -> 138;
            case 155 -> 167;
            case 156 -> 122;
            case 157 -> 227;
            case 158 -> 75;
            case 159 -> 144;
            case 160 -> 250;
            case 161 -> 74;
            case 162 -> 235;
            case 163 -> 37;
            case 164 -> 104;
            case 165 -> 225;
            case 166 -> 201;
            case 167 -> 237;
            case 168 -> 194;
            case 169 -> 132;
            case 170 -> 222;
            case 171 -> 85;
            case 172 -> 72;
            case 173 -> 107;
            case 174 -> 102;
            case 175 -> 99;
            case 176 -> 4;
            case 177 -> 15;
            case 178 -> 98;
            case 179 -> 109;
            case 180 -> 103;
            case 181 -> 190;
            case 182 -> 187;
            case 183 -> 14;
            case 184 -> 218;
            case 185 -> 127;
            case 186 -> 68;
            case 187 -> 1;
            case 188 -> 183;
            case 189 -> 58;
            case 190 -> 45;
            case 191 -> 131;
            case 192 -> 29;
            case 193 -> 243;
            case 194 -> 66;
            case 195 -> 80;
            case 196 -> 170;
            case 197 -> 189;
            case 198 -> 34;
            case 199 -> 112;
            case 200 -> 116;
            case 201 -> 214;
            case 202 -> 142;
            case 203 -> 65;
            case 204 -> 212;
            case 205 -> 73;
            case 206 -> 165;
            case 207 -> 91;
            case 208 -> 234;
            case 209 -> 207;
            case 210 -> 180;
            case 211 -> 220;
            case 212 -> 254;
            case 213 -> 156;
            case 214 -> 50;
            case 215 -> 53;
            case 216 -> 96;
            case 217 -> 81;
            case 218 -> 97;
            case 219 -> 246;
            case 220 -> 101;
            case 221 -> 135;
            case 222 -> 56;
            case 223 -> 242;
            case 224 -> 206;
            case 225 -> 228;
            case 226 -> 199;
            case 227 -> 204;
            case 228 -> 252;
            case 229 -> 118;
            case 230 -> 129;
            case 231 -> 239;
            case 232 -> 52;
            case 233 -> 161;
            case 234 -> 13;
            case 235 -> 57;
            case 236 -> 11;
            case 237 -> 83;
            case 238 -> 241;
            case 239 -> 160;
            case 240 -> 226;
            case 241 -> 210;
            case 242 -> 61;
            case 243 -> 150;
            case 244 -> 141;
            case 245 -> 44;
            case 246 -> 93;
            case 247 -> 55;
            case 248 -> 233;
            case 249 -> 152;
            case 250 -> 111;
            case 251 -> 82;
            case 252 -> 202;
            case 253 -> 42;
            case 254 -> 174;
            default -> 193;
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
      public final IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll a() {
         return IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }
   }

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: getstatic + return
  public static me.octo.client.IIlIIlIlIlIlllIllIIllIllllIIlllIlIIllIIlIIlIIlIlllllIIllIllllIIlllIlIIIllllIIlIlIIlll ah() { return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll; }
}
