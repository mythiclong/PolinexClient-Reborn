package me.octo.client.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import me.octo.client.IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII;
import me.octo.client.lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII;
import me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.llIllllIIIIIlIIIlIIlllIIllllllIllIIIlIIllIIIIIllIlIIIIlIlllllIlIIllIlIlllIlllIIlIIIll;
import me.octo.client.events.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.mixin.accessors.RenderSetupAccessor;
import me.octo.client.mixin.accessors.RenderTypeAccessor;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LivingEntityRenderer.class})
public abstract class LivingEntityRendererMixin<T extends LivingEntity, S extends LivingEntityRenderState> {
   @Inject(
      method = {"extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V"},
      at = {@At("HEAD")}
   )
   private void onUpdateRenderState(LivingEntity var1, LivingEntityRenderState var2, float var3, CallbackInfo var4) {
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var5 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
         var1
      );
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var5);
   }

   @ModifyExpressionValue(
      method = {"getRenderType"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/EntityModel;renderType(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;"
      )}
   )
   @Nullable
   private RenderType polinex$chamsRenderType(@Nullable RenderType var1, @Local(argsOnly = true) S var2, @Local Identifier var3) {
      if (var1 == null) {
         return null;
      } else {
         Entity var4 = ((llIllllIIIIIlIIIlIIlllIIllllllIllIIIlIIllIIIIIllIlIIIIlIlllllIlIIllIlIlllIlllIIlIIIll)var2).polinex_getEntity();
         if (var4 != null && IlIIlIlllIllIIIlIlIlIIIllllIlllIlIIIIIIlllIIIIIlIIllIIIIIIIllIIIIllIIIlllIIlIIlllIIII.c(var4)) {
            RenderSetup var5 = ((RenderTypeAccessor)var1).getState();
            boolean var6 = ((RenderSetupAccessor)(Object)var5).getOutlineProperty() == OutlineProperty.AFFECTS_OUTLINE;
            String var7 = ((RenderTypeAccessor)var1).getName();

            return switch (var7) {
               case "entity_translucent" -> (RenderType)lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .apply(var3, var6);
               case "entity_cutout" -> (RenderType)lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  .apply(var3);
               case "entity_cutout_no_cull" -> (RenderType)lIIlIlllIllIIIllIIIIIIIlIIIlIlIIlIIlllIIIlIIIllIllIlIIlllIIIIIIIIlIllllIlIIllIIIlllII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  .apply(var3, var6);
               default -> var1;
            };
         } else {
            return var1;
         }
      }
   }
}
