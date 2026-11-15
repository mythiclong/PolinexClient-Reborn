package me.octo.client.mixin.client;

import me.octo.client.lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Options.class})
public class OptionsMixin {
   @Inject(
      method = {"getEffectiveRenderDistance"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getEffectiveRenderDistance(CallbackInfoReturnable<Integer> var1) {
      if (lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aH()) {
         var1.setReturnValue(
            lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               .ai()
         );
      }
   }
}
