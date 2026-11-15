package me.octo.client.mixin.blaze3d.gl;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import me.octo.client.utils.lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   targets = {"com.mojang.blaze3d.opengl.GlRenderPass"}
)
public abstract class GlRenderPassMixin {
   @Shadow
   @Final
   protected HashMap<String, Object> uniforms;
   @Shadow
   @Final
   protected HashMap<String, GpuTexture> samplers;
   @Shadow
   @Final
   protected Set<String> dirtyUniforms;

   @WrapOperation(
      method = {"<init>"},
      require = 0,
      at = {@At(
         value = "NEW",
         target = "()Ljava/util/HashMap;"
      )}
   )
   private HashMap polinex$reuseHashMap(Operation<HashMap> var1) {
      return (java.util.HashMap)lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a();
   }

   @WrapOperation(
      method = {"<init>"},
      require = 0,
      at = {@At(
         value = "NEW",
         target = "()Ljava/util/HashSet;"
      )}
   )
   private HashSet polinex$reuseHashSet(Operation<HashSet> var1) {
      return (java.util.HashSet)lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         .a();
   }

   @Inject(
      method = {"close"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/opengl/GlCommandEncoder;finishRenderPass()V"
      )}
   )
   private void polinex$recyclePooled(CallbackInfo var1) {
      lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a((java.util.HashMap<java.lang.Object, java.lang.Object>)(java.util.HashMap)this.uniforms);
      lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a((java.util.HashMap<java.lang.Object, java.lang.Object>)(java.util.HashMap)this.samplers);
      if (this.dirtyUniforms instanceof HashSet var2) {
         lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            .a((java.util.HashSet<java.lang.Object>)(java.util.HashSet)var2);
      }
   }
}
