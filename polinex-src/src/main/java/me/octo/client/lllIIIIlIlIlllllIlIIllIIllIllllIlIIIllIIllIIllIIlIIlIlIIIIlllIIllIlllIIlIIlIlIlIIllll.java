package me.octo.client;

import me.octo.client.events.impl.base.annotations.SubscribeEvent;

public class lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   private static String a;

   public lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      net.minecraft.client.Minecraft var3 = net.minecraft.client.Minecraft.getInstance();
      if (var3.player == null || var3.level == null || var3.player.tickCount <= 100) {
         return;
      }
      net.minecraft.world.phys.Vec3 var4 = new net.minecraft.world.phys.Vec3(var3.player.getX(), var3.player.getY(), var3.player.getZ());
      if (me.octo.client.lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.stream().anyMatch((net.minecraft.world.phys.Vec3 var0) -> me.octo.client.lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll.lambda$onPacket$0(var4, var0))) {
         return;
      }
      int var5 = var3.player.getInventory().getSelectedSlot();
      try {
         net.minecraft.network.protocol.Packet var8 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var8 instanceof net.minecraft.network.protocol.game.ClientboundSetHeldSlotPacket) {
            net.minecraft.network.protocol.game.ClientboundSetHeldSlotPacket var6 = (net.minecraft.network.protocol.game.ClientboundSetHeldSlotPacket) var8;
            int var7 = var6.slot();
            if (me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.m() || me.octo.client.utils.llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.n()) {
               return;
            }
            if (var7 == 0) {
               return;
            }
            if (var7 != var5) {
               this.a(var7);
            }
         }
      } catch (Exception var6x) {
         throw new java.lang.MatchException(var6x.toString(), var6x);
      }
   }

   private void a(int var1) {
      this.a(a + var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      char[] var10003 = "\u000e\t\u0010(^\u001e`\u001bf\u0010>E\ni\fk\u00054E\u001fi\u001af\n/R\u0011\f\r\u0011\u0002+7\u0018i\n\u0003\u0000/R\u0018\u0016~"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 112;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 112;
         var10006 = var0;
      } else {
         var6 = 112;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit;
         }

         var10005 = var10003;
         var10 = 112;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 46;
            case 1 -> 54;
            case 2 -> 51;
            case 3 -> 11;
            case 4 -> 103;
            case 5 -> 44;
            default -> 92;
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
               break pxClinit;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}

   private static boolean lambda$onPacket$0(net.minecraft.world.phys.Vec3 var0, net.minecraft.world.phys.Vec3 var1) {
      // PX-FIX PhaseA-RESe: exact jar lambda body (invokevirtual a:(Vec3,Vec3)D, dcmpg vs 1.0)
      return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1) < 1.0;
   }
}
