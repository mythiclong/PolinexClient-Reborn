package me.octo.client;

import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

public class lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   public static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] d;

   public lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var8 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      int[] var2 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
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
            Packet var9 = var4;
            if (var2 != null) {
               if (!(var4 instanceof ClientboundPlayerPositionPacket)) {
                  return;
               }

               var9 = var4;
            }

            ClientboundPlayerPositionPacket var3 = (ClientboundPlayerPositionPacket)var9;
            if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .tickCount
               >= 100) {
               label82: {
                  if (lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                     != null) {
                     var10 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                     if (var2 == null) {
                        break label82;
                     }

                     if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
                        Vec3 var5;
                        Vec3 var6;
                        var8 = var3.change().position();
                        var5 = new Vec3(((me.octo.client.PXDyn)var8).x(), ((me.octo.client.PXDyn)var8).y(), ((me.octo.client.PXDyn)var8).z());
                        var6 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                           .getCenter()
                           .add(0.0, 0.55, 0.0);
                        var11 = var6.equals(var5);
                        label59:
                        if (var2 != null) {
                           label64:
                           if (!((Boolean)var11)) {
                              label103: {
                                 double var12;
                                 var11 = (var12 = var6.x - var5.x) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
                                 label72:
                                 if (var2 != null) {
                                    if (((Boolean)(var11))) {
                                       double var13;
                                       var11 = (var13 = var6.z - var5.z) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
                                       if (var2 == null) {
                                          break label72;
                                       }

                                       if (((Boolean)(var11))) {
                                          break label103;
                                       }
                                    }

                                    double var14;
                                    var11 = (var14 = var6.y - var5.y) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
                                 }

                                 if (var2 == null) {
                                    break label59;
                                 }

                                 if (!((Boolean)var11)) {
                                    break label64;
                                 }
                              }

                              var11 = 0;
                              break label59;
                           }

                           var11 = 1;
                        }

                        int var7 =((Integer)( var11));
                        var10 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.b(
                           var5,
                           lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                        );
                        if (var2 == null) {
                           break label82;
                        }

                        if (!((Boolean)var10)) {
                           var10 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.b(
                              var8,
                              lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.a(
                                 this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                                 this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              )
                           );
                           if (var2 == null) {
                              break label82;
                           }

                           if (!((Boolean)var10)) {
                              var10 = var7;
                              if (var2 == null) {
                                 break label82;
                              }

                              if ((var7 == 0)) {
                                 var10 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.a(var5, var6);
                                 if (var2 == null) {
                                    break label82;
                                 }

                                 if (!((Boolean)var10)) {
                                    short var10001 = -13524;
                                    short var10002 = -19191;
                                    this.a("INCORRECT ETHERWARP");
                                 }
                              }
                           }
                        }
                     }
                  }

                  var10 = 0;
               }

               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (boolean)var10;
            }
         }
      }
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      Object var8 = null; // PX-FIX
      Packet var18 = null; // PX-FIX
      Object var15 = null; // PX-FIX
      boolean var14 = false; // PX-FIX
      Object var12 = null; // PX-FIX
      int[] var2 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
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
         label154: {
            Packet var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            boolean var10 = var4 instanceof ServerboundUseItemPacket;
            if (var2 != null) {
               label92:
               if (var10) {
                  ServerboundUseItemPacket var3;
                  label138: {
                     label164: {
                        var3 = (ServerboundUseItemPacket)var4;
                        var8 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           .player
                           .getMainHandItem();
                        label127:
                        if (lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI instanceof IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl
                           )
                         {
                           label158: {
                              me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
                                 .a()
                                 .a5();
                              if (var2 != null) {
                                 if (var11 == null) {
                                    break label127;
                                 }

                                 var12 = IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
                                    .a();
                                 if (var2 == null) {
                                    break label158;
                                 }

                                 var11 = ((me.octo.client.PXDyn)var12).a5();
                              }

                              if (var11.a().getItem() != Items.DIAMOND_SHOVEL) {
                                 break label127;
                              }

                              var12 = IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
                                 .a();
                           }

                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = ((me.octo.client.PXDyn)var12).W();
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
                           if (var2 != null) {
                              if (var13
                                 == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
                                 )
                               {
                                 break label164;
                              }

                              var13 = IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
                                 .a()
                                 .W();
                              var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
                           }

                           if (var13 == var10001) {
                              break label164;
                           }
                        }

                        var14 = false;
                        break label138;
                     }

                     var14 = true;
                  }

                  boolean var5;
                  var5 = var14;
                  var15 = ((me.octo.client.PXDyn)var8).isEmpty();
                  label114:
                  if (var2 != null) {
                     label112:
                     if (!((Boolean)var15)) {
                        String var6 = ((me.octo.client.PXDyn)(Object)(((me.octo.client.PXDyn)var8).getHoverName())).getString();
                        label110:
                        if (((me.octo.client.PXDyn)var8).getItem() != Items.DIAMOND_SHOVEL) {
                           short var22 = -13523;
                           short var10002 = -6338;
                           var15 = var6.contains("Etherwarp Conduit");
                           if (var2 != null) {
                              if (((Boolean)(var15))) {
                                 break label110;
                              }

                              var15 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .M();
                           }

                           if (var2 == null) {
                              break label114;
                           }

                           if (!((Boolean)var15)) {
                              break label112;
                           }
                        }

                        if (lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                           != null) {
                           boolean var16 = var5;
                           if (var2 != null) {
                              if (var5) {
                                 return;
                              }

                              var16 = true;
                           }

                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var16;
                           this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3.getYRot();
                           this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var3.getXRot();
                        }
                     }

                     var15 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .M();
                  }

                  label98:
                  if (var2 != null) {
                     if (!((Boolean)var15)) {
                        var15 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .N();
                        if (var2 == null) {
                           break label98;
                        }

                        if (!((Boolean)var15)) {
                           break label92;
                        }
                     }

                     var15 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  }

                  if (((Boolean)var15)
                     && lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                        != null) {
                     boolean var17 = var5;
                     if (var2 != null) {
                        if (var5) {
                           return;
                        }

                        var17 = true;
                     }

                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var17;
                  }
               }

               var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               var18 = var4;
               if (var2 == null) {
                  break label154;
               }

               var10 = var4 instanceof ServerboundSetCarriedItemPacket;
            }

            if (!var10) {
               return;
            }

            var18 = var4;
         }

         ServerboundSetCarriedItemPacket var7 = (ServerboundSetCarriedItemPacket)var18;
         ItemStack var9 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
            .getInventory()
            .getItem(var7.getSlot());
         ItemStack var19 = var9;
         if (var2 != null) {
            if (var9.getItem() == Items.DIAMOND_SHOVEL) {
               return;
            }

            var19 = var9;
         }

         String var20 = var19.getHoverName().getString();
         short var23 = -13521;
         short var24 = -9327;
         boolean var21 = var20.contains("Etherwarp Conduit");
         if (var2 != null) {
            if (var21) {
               return;
            }

            var21 = false;
         }

         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var21;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "é¿IÛ3\u0000\u0088}\u008cB\u001f\u000ec\u0094,³Û\u0013\u008aa\u0083W\u0004Ûn¶Ô,²ø67CüÀÃ,\u0011²ñ\"\u0012^9%Z9¦©\u0092µ\u0007öÁ\u0080";
      int var4 = "é¿IÛ3\u0000\u0088}\u008cB\u001f\u000ec\u0094,³Û\u0013\u008aa\u0083W\u0004Ûn¶Ô,²ø67CüÀÃ,\u0011²ñ\"\u0012^9%Z9¦©\u0092µ\u0007öÁ\u0080".length();
      char var1 = 17;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 25;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 25;
               var10006 = var6;
            } else {
               var13 = 25;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 25;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 78;
                  case 1 -> 118;
                  case 2 -> 2;
                  case 3 -> 71;
                  case 4 -> 119;
                  case 5 -> 23;
                  default -> 103;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            d = new String[3];
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -13523) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 48;
            case 1 -> 144;
            case 2 -> 206;
            case 3 -> 181;
            case 4 -> 215;
            case 5 -> 224;
            case 6 -> 235;
            case 7 -> 95;
            case 8 -> 249;
            case 9 -> 240;
            case 10 -> 188;
            case 11 -> 19;
            case 12 -> 62;
            case 13 -> 185;
            case 14 -> 195;
            case 15 -> 168;
            case 16 -> 180;
            case 17 -> 175;
            case 18 -> 146;
            case 19 -> 129;
            case 20 -> 198;
            case 21 -> 103;
            case 22 -> 94;
            case 23 -> 182;
            case 24 -> 254;
            case 25 -> 199;
            case 26 -> 190;
            case 27 -> 10;
            case 28 -> 15;
            case 29 -> 45;
            case 30 -> 216;
            case 31 -> 226;
            case 32 -> 68;
            case 33 -> 110;
            case 34 -> 202;
            case 35 -> 127;
            case 36 -> 108;
            case 37 -> 227;
            case 38 -> 155;
            case 39 -> 130;
            case 40 -> 119;
            case 41 -> 159;
            case 42 -> 40;
            case 43 -> 47;
            case 44 -> 166;
            case 45 -> 204;
            case 46 -> 252;
            case 47 -> 114;
            case 48 -> 63;
            case 49 -> 32;
            case 50 -> 149;
            case 51 -> 169;
            case 52 -> 80;
            case 53 -> 191;
            case 54 -> 161;
            case 55 -> 138;
            case 56 -> 69;
            case 57 -> 36;
            case 58 -> 105;
            case 59 -> 112;
            case 60 -> 28;
            case 61 -> 58;
            case 62 -> 243;
            case 63 -> 93;
            case 64 -> 38;
            case 65 -> 231;
            case 66 -> 162;
            case 67 -> 23;
            case 68 -> 174;
            case 69 -> 176;
            case 70 -> 60;
            case 71 -> 136;
            case 72 -> 35;
            case 73 -> 22;
            case 74 -> 85;
            case 75 -> 160;
            case 76 -> 37;
            case 77 -> 158;
            case 78 -> 4;
            case 79 -> 116;
            case 80 -> 33;
            case 81 -> 41;
            case 82 -> 87;
            case 83 -> 97;
            case 84 -> 137;
            case 85 -> 12;
            case 86 -> 171;
            case 87 -> 225;
            case 88 -> 75;
            case 89 -> 233;
            case 90 -> 17;
            case 91 -> 56;
            case 92 -> 163;
            case 93 -> 142;
            case 94 -> 246;
            case 95 -> 120;
            case 96 -> 133;
            case 97 -> 140;
            case 98 -> 196;
            case 99 -> 30;
            case 100 -> 145;
            case 101 -> 184;
            case 102 -> 236;
            case 103 -> 66;
            case 104 -> 128;
            case 105 -> 157;
            case 106 -> 57;
            case 107 -> 82;
            case 108 -> 101;
            case 109 -> 61;
            case 110 -> 46;
            case 111 -> 81;
            case 112 -> 211;
            case 113 -> 220;
            case 114 -> 205;
            case 115 -> 212;
            case 116 -> 253;
            case 117 -> 73;
            case 118 -> 83;
            case 119 -> 51;
            case 120 -> 141;
            case 121 -> 20;
            case 122 -> 228;
            case 123 -> 135;
            case 124 -> 29;
            case 125 -> 154;
            case 126 -> 232;
            case 127 -> 124;
            case 128 -> 153;
            case 129 -> 70;
            case 130 -> 251;
            case 131 -> 126;
            case 132 -> 102;
            case 133 -> 88;
            case 134 -> 115;
            case 135 -> 26;
            case 136 -> 21;
            case 137 -> 7;
            case 138 -> 111;
            case 139 -> 245;
            case 140 -> 122;
            case 141 -> 150;
            case 142 -> 54;
            case 143 -> 164;
            case 144 -> 193;
            case 145 -> 118;
            case 146 -> 238;
            case 147 -> 187;
            case 148 -> 131;
            case 149 -> 223;
            case 150 -> 203;
            case 151 -> 43;
            case 152 -> 219;
            case 153 -> 2;
            case 154 -> 76;
            case 155 -> 132;
            case 156 -> 53;
            case 157 -> 234;
            case 158 -> 123;
            case 159 -> 14;
            case 160 -> 183;
            case 161 -> 239;
            case 162 -> 92;
            case 163 -> 221;
            case 164 -> 104;
            case 165 -> 201;
            case 166 -> 18;
            case 167 -> 197;
            case 168 -> 152;
            case 169 -> 218;
            case 170 -> 79;
            case 171 -> 170;
            case 172 -> 1;
            case 173 -> 148;
            case 174 -> 147;
            case 175 -> 248;
            case 176 -> 34;
            case 177 -> 8;
            case 178 -> 55;
            case 179 -> 242;
            case 180 -> 9;
            case 181 -> 109;
            case 182 -> 107;
            case 183 -> 27;
            case 184 -> 44;
            case 185 -> 52;
            case 186 -> 172;
            case 187 -> 255;
            case 188 -> 89;
            case 189 -> 6;
            case 190 -> 67;
            case 191 -> 11;
            case 192 -> 113;
            case 193 -> 91;
            case 194 -> 139;
            case 195 -> 78;
            case 196 -> 192;
            case 197 -> 179;
            case 198 -> 143;
            case 199 -> 59;
            case 200 -> 173;
            case 201 -> 3;
            case 202 -> 72;
            case 203 -> 207;
            case 204 -> 151;
            case 205 -> 209;
            case 206 -> 74;
            case 207 -> 86;
            case 208 -> 189;
            case 209 -> 39;
            case 210 -> 50;
            case 211 -> 213;
            case 212 -> 13;
            case 213 -> 98;
            case 214 -> 65;
            case 215 -> 106;
            case 216 -> 24;
            case 217 -> 250;
            case 218 -> 222;
            case 219 -> 64;
            case 220 -> 25;
            case 221 -> 117;
            case 222 -> 165;
            case 223 -> 237;
            case 224 -> 16;
            case 225 -> 178;
            case 226 -> 125;
            case 227 -> 230;
            case 228 -> 90;
            case 229 -> 241;
            case 230 -> 177;
            case 231 -> 217;
            case 232 -> 247;
            case 233 -> 71;
            case 234 -> 214;
            case 235 -> 0;
            case 236 -> 77;
            case 237 -> 84;
            case 238 -> 244;
            case 239 -> 208;
            case 240 -> 200;
            case 241 -> 156;
            case 242 -> 99;
            case 243 -> 31;
            case 244 -> 194;
            case 245 -> 49;
            case 246 -> 42;
            case 247 -> 5;
            case 248 -> 186;
            case 249 -> 210;
            case 250 -> 96;
            case 251 -> 229;
            case 252 -> 121;
            case 253 -> 134;
            case 254 -> 167;
            default -> 100;
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
