package me.octo.client.mixin.render;

import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Optional;
import me.octo.client.lIlIIIlIIlIIllIlllllllIllIlIIlIIIIlIIIllIIllIlIllIIllIllIIIlIIIIlIlIllIIlllIIIlIllIII;
import me.octo.client.utils.IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII;
import net.minecraft.client.renderer.OutlineBufferSource;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.rendertype.RenderType;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({OutlineBufferSource.class})
public abstract class OutlineBufferSourceMixin implements lIlIIIlIIlIIllIlllllllIllIlIIlIIIIlIIIllIIllIlIllIIllIllIIIlIIIIlIlIllIIlllIIIlIllIII {
   @Shadow
   @Final
   private BufferSource outlineBufferSource;
   @Shadow
   private int outlineColor;

   @Nullable
   @Override
   public VertexConsumer polinex_getSingleDrawBuffers(RenderType var1) {
      Optional var2 = var1.outline();
      if (var2.isEmpty()) {
         return null;
      } else {
         VertexConsumer var3 = this.outlineBufferSource.getBuffer((RenderType)var2.get());
         return IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII.a(var3, this.outlineColor);
      }
   }
}
