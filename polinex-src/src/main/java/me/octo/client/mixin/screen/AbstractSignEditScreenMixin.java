package me.octo.client.mixin.screen;

import me.octo.client.lIllIIIllllIIIlIllIlllllIlIlIIlIIlIlIIlIlIlIIIIIIIIIIIlllIllIIllIlIlIIlIIIIlllllIIIlI;
import me.octo.client.utils.llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI;
import net.minecraft.client.gui.screens.inventory.AbstractSignEditScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.entity.SignText;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({AbstractSignEditScreen.class})
public abstract class AbstractSignEditScreenMixin {
   @Shadow
   @Final
   protected SignBlockEntity sign;
   @Shadow
   @Final
   private String[] messages;
   @Shadow
   @Final
   private boolean isFrontText;

   @Inject(
      method = {"<init>(Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZZLnet/minecraft/network/chat/Component;)V"},
      at = {@At("TAIL")}
   )
   private void polinex$sanitizeInitialMessages(SignBlockEntity var1, boolean var2, boolean var3, Component var4, CallbackInfo var5) {
      if (lIllIIIllllIIIlIllIlllllIlIlIIlIIlIlIIlIlIlIIIIIIIIIIIlllIllIIllIlIlIIlIIIIlllllIIIlI.ag()) {
         SignText var6 = this.sign.getText(this.isFrontText);

         for (int var7 = 0; var7 < this.messages.length; var7++) {
            this.messages[var7] = llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI.a(var6.getMessage(var7, var3));
         }
      }
   }
}
