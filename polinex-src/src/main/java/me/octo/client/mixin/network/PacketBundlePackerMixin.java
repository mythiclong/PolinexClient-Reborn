package me.octo.client.mixin.network;

import org.jetbrains.annotations.Nullable;
import net.minecraft.network.PacketBundlePacker;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.BundlerInfo.Bundler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({PacketBundlePacker.class})
public class PacketBundlePackerMixin {
   @Shadow
   @Nullable
   private Bundler currentBundler;

   @Redirect(
      method = {"decode(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;Ljava/util/List;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/protocol/BundlerInfo$Bundler;addPacket(Lnet/minecraft/network/protocol/Packet;)Lnet/minecraft/network/protocol/Packet;"
      )
   )
   private Packet<?> safeAddPacket(Bundler param1, Packet<?> param2) {
      try {
         return param1.addPacket(param2);
      } catch (IllegalStateException var3) {
         if (var3.getMessage() != null && var3.getMessage().contains("Too many packets in a bundle")) {
            this.currentBundler = null;
            return null;
         } else {
            throw a(var3);
         }
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
