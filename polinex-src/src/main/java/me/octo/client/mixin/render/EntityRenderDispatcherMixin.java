package me.octo.client.mixin.render;

import me.octo.client.IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII;
import me.octo.client.IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII;
import me.octo.client.lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityRenderDispatcher.class})
public abstract class EntityRenderDispatcherMixin {
   @Inject(
      method = {"shouldRender"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void polinex$forceRender(Entity var1, Frustum var2, double var3, double var5, double var7, CallbackInfoReturnable<Boolean> var9) {
      if (lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aJ()) {
         var9.setReturnValue(false);
      } else {
         if (IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.b(var1)
            || IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.b(var1)) {
            var9.setReturnValue(true);
         }
      }
   }
}
