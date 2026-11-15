package me.octo.client;

import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class IIIlllIIIlllIllIIIlIIlIlIIlIIlIIIlIlIlllIIIllIllllIIIIllIllIIIlllIlllIllIIIIIIIllllll {
   private static String a;

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void a(me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      Object var9 = null; // PX-FIX
      boolean var2 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.c();
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         Packet var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Packet var10000 = var4;
         if (!var2) {
            if (!(var4 instanceof ServerboundUseItemPacket)) {
               return;
            }

            var10000 = var4;
         }

         ItemStack var5;
         label70: {
            label81: {
               ServerboundUseItemPacket var3 = (ServerboundUseItemPacket)var10000;
               me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.i();
               InteractionHand var6 = var3.getHand();
               var5 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getItemInHand(var6);
               ItemStack var7 = var5;
               if (!var2) {
                  if (var5 == null) {
                     break label81;
                  }

                  var7 = var5;
               }

               label82: {
                  if (!var2) {
                     if (var7.getItem() == Items.DIAMOND_SHOVEL) {
                        break label82;
                     }

                     var7 = var5;
                  }

                  Component var8 = var7.getCustomName();
                  if (!var2) {
                     if (var8 == null) {
                        break label81;
                     }

                     var8 = var5.getHoverName();
                  }

                  var9 = var8.getString().contains(a);
                  if (var2) {
                     break label70;
                  }

                  if (!(me.octo.client.PxTruth.truth(var9))) {
                     break label81;
                  }
               }

               me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.j();
               me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.i();
            }

            var9 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .M();
         }

         label48:
         if (!var2) {
            if (!(me.octo.client.PxTruth.truth(var9))) {
               var9 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .N();
               if (var2) {
                  break label48;
               }

               if (!(me.octo.client.PxTruth.truth(var9))) {
                  ItemStack var10 = var5;
                  if (!var2) {
                     if (var5 == null) {
                        return;
                     }

                     var10 = var5;
                  }

                  if (var10.getItem() != Items.DIAMOND_SHOVEL) {
                     return;
                  }
               }
            }

            var9 = IIlIlIIIllIlllIlIIIIIIIIIIIIlIlIIlIIllllIllllIllllIIllIllIlIIllllllIllIlllIllIIIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((me.octo.client.PxTruth.truth(var9))) {
            me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.g();
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "\fe=\\jz5;auzwc0<x!".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 66;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 66;
         var10006 = var0;
      } else {
         var6 = 66;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 66;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 11;
            case 1 -> 83;
            case 2 -> 23;
            case 3 -> 123;
            case 4 -> 90;
            case 5 -> 79;
            default -> 22;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               break pxClinit; // PX-FIX
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   } // PX-FIX end pxClinit
   }
}
