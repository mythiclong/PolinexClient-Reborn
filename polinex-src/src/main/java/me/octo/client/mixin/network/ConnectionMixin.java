package me.octo.client.mixin.network;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.utils.IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll;
import me.octo.client.utils.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ClientboundCustomPayloadPacket;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.protocol.game.ClientboundAnimatePacket;
import net.minecraft.network.protocol.game.ClientboundAwardStatsPacket;
import net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundMoveEntityPacket;
import net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket;
import net.minecraft.network.protocol.game.ClientboundRotateHeadPacket;
import net.minecraft.network.protocol.game.ClientboundSectionBlocksUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;
import net.minecraft.network.protocol.game.ClientboundSetEquipmentPacket;
import net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket;
import net.minecraft.network.protocol.game.ClientboundSetTimePacket;
import net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket;
import net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Connection.class})
public class ConnectionMixin {
   @Inject(
      method = {"send(Lnet/minecraft/network/protocol/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSend(Packet<?> var1, CallbackInfo var2) {
      if (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(
            (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI(
               var1
            ))
         )) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onReceive(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      if (!(var2 instanceof ClientboundLevelParticlesPacket)
         && !(var2 instanceof ClientboundSetPlayerTeamPacket)
         && !(var2 instanceof ClientboundMoveEntityPacket)
         && !(var2 instanceof ClientboundEntityEventPacket)
         && !(var2 instanceof ClientboundAnimatePacket)
         && !(var2 instanceof ClientboundTeleportEntityPacket)
         && !(var2 instanceof ClientboundEntityPositionSyncPacket)
         && !(var2 instanceof ClientboundRotateHeadPacket)
         && !(var2 instanceof ClientboundSetEntityDataPacket)
         && !(var2 instanceof ClientboundCustomPayloadPacket)
         && !(var2 instanceof ClientboundRemoveEntitiesPacket)
         && !(var2 instanceof ClientboundAwardStatsPacket)
         && !(var2 instanceof ClientboundSetEquipmentPacket)
         && !(var2 instanceof ClientboundBlockUpdatePacket)
         && !(var2 instanceof ClientboundSetTimePacket)
         && !(var2 instanceof ClientboundSectionBlocksUpdatePacket)
         && !(var2 instanceof ClientboundUpdateAttributesPacket)
         && !(var2 instanceof ClientboundAddEntityPacket)) {
         boolean var4 = true;
         if (var2 instanceof ClientboundSetEntityMotionPacket var5
            && lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
               != null
            && var5.id()
               != lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getId()) {
            var4 = false;
         }

         if (var4
            && llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .b(
                  (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll(
                     var2
                  ))
               )) {
            var3.cancel();
         }
      }
   }

   @ModifyArg(
      method = {"connect"},
      at = @At(
         value = "INVOKE",
         target = "Lio/netty/bootstrap/Bootstrap;handler(Lio/netty/channel/ChannelHandler;)Lio/netty/bootstrap/AbstractBootstrap;",
         remap = false
      ),
      index = 0,
      require = 0
   )
   private static ChannelHandler addSocks5ProxyHandler(final ChannelHandler originalHandler) {
      return new ChannelInitializer<Channel>() {
         protected void initChannel(Channel var1) throws Exception {
            llllllIlIlIIlIIllIIllllIllIlIlIllIIIlIIlIllllIlIllIIIIlllIIlIllIIlIIlIllIIIlIIIllIllI var2 = IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b();

            label47: {
               try {
                  if (var2 == null
                     || !IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()) {
                     break label47;
                  }
               } catch (Exception var6) {
                  throw (RuntimeException)a(var6);
               }

               InetSocketAddress var3 = new InetSocketAddress(var2.c(), var2.d());

               Socks5ProxyHandler var4;
               label35: {
                  label34: {
                     label33: {
                        try {
                           switch (var2.b()) {
                              case lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI:
                                 if (!var2.e().isEmpty()) {
                                    break label33;
                                 }
                                 break;
                              case IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl:
                                 break label34;
                              default:
                                 break label47;
                           }
                        } catch (Exception var5) {
                           throw (RuntimeException)a(var5);
                        }

                        var4 = new Socks5ProxyHandler(var3);
                        break label35;
                     }

                     var4 = new Socks5ProxyHandler(var3, var2.e(), var2.f());
                     break label35;
                  }

                  var1.pipeline().addFirst("socks4-proxy", new Socks4ProxyHandler(var3));
                  break label47;
               }

               var1.pipeline().addFirst("socks5-proxy", var4);
            }

            var1.pipeline().addLast("original-initializer", originalHandler);
         }

         private static Exception a(Exception var0x) {
            return var0x;
         }
      };
   }

   @Inject(
      method = {"handleDisconnection"},
      at = {@At("TAIL")}
   )
   public void onDisconnect(CallbackInfo var1) {
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(
            (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new me.octo.client.events.impl.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII())
         );
   }
}
