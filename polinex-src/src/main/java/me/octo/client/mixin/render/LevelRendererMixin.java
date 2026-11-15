package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.framegraph.FrameGraphBuilder;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.resource.GraphicsResourceAllocator;
import com.mojang.blaze3d.vertex.PoseStack;
import me.octo.client.IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI;
import me.octo.client.lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl;
import me.octo.client.lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl;
import me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.llIlIlIllllIIIIIllllIlIIIlIlIlIIllIlIIllIIlIIIIlIIlIIIIllIIlllIIIIIIIIllIllIlllIIlIlI;
import me.octo.client.events.impl.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll;
import me.octo.client.utils.llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.LevelTargetBundle;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.client.renderer.chunk.ChunkSectionsToRender;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.state.level.LevelRenderState;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LevelRenderer.class})
public abstract class LevelRendererMixin {
   @Shadow
   @Final
   private Minecraft minecraft;

   @Shadow
   @Nullable
   public abstract RenderTarget entityOutlineTarget();

   @Shadow
   protected abstract boolean shouldShowEntityOutlines();

   @Inject(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "NEW",
         target = "()Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;"
      )}
   )
   private void onRender(
      GraphicsResourceAllocator var1,
      DeltaTracker var2,
      boolean var3,
      CameraRenderState var4,
      Matrix4fc var5,
      GpuBufferSlice var6,
      Vector4f var7,
      boolean var8,
      ChunkSectionsToRender var9,
      CallbackInfo var10
   ) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI var11 = IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         if (var11.c()) {
            PoseStack var12 = llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a();
            var12.mulPose(var5);
            IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll var13 = new IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll(
               var11.d(),
               var12,
               var4,
               var2.getGameTimeDeltaPartialTick(false),
               IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var13);
            llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(var12);
            if (var13.p()) {
               var11.a(true);
            }
         }
      }
   }

   @Inject(
      method = {"lambda$addMainPass$0"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/OutlineBufferSource;endOutlineBatch()V"
      )}
   )
   private void onDrawOutlines(CallbackInfo var1) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            .a(this.minecraft.getMainRenderTarget());
      }
   }

   @Inject(
      method = {"lambda$addMainPass$0"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/OutlineBufferSource;endOutlineBatch()V",
         shift = Shift.AFTER
      )}
   )
   private void onRenderGlow(CallbackInfo var1) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         RenderTarget var2 = this.entityOutlineTarget();
         if (var2 != null) {
            if (lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.f()) {
               lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.a(var2);
            } else if (this.shouldShowEntityOutlines()) {
               PoseStack var3 = llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .a();
               var2.blitToScreen();
               CameraRenderState var4 = this.minecraft.gameRenderer.getGameRenderState().levelRenderState.cameraRenderState;
               IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll var5 = new IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll(
                  var2,
                  var3,
                  var4,
                  this.minecraft.getDeltaTracker().getGameTimeDeltaPartialTick(false),
                  IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               );
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var5);
               llIlIlIllllIIIIIllllIlIIIlIlIlIIllIlIIllIIlIIIIlIIlIIIIllIIlllIIIIIIIIllIllIlllIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = llIlIlIllllIIIIIllllIlIIIlIlIlIIllIlIIllIIlIIIIlIIlIIIIllIIlllIIIIIIIIllIllIlllIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  | var5.p();
               llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .a(var3);
            }
         }
      }
   }

   @Inject(
      method = {"doEntityOutline"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void polinex$cancelVanillaOutlineBlit(CallbackInfo var1) {
      if (lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.g()) {
         var1.cancel();
      }
   }

   @WrapOperation(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/PostChain;addToFrame(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;IILnet/minecraft/client/renderer/LevelTargetBundle;)V"
      )}
   )
   private void polinex$skipOutlinePostChain(PostChain var1, FrameGraphBuilder var2, int var3, int var4, LevelTargetBundle var5, Operation<Void> var6) {
      if (!lIlIIIllllIllllllllIlIIIllIIIIIIIIlIllllllIIllIlllIIIIIlIllIIIIIIlllIlIllIIIIlIIlllIl.f()) {
         var6.call(new Object[]{var1, var2, var3, var4, var5});
      }
   }

   @WrapOperation(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/renderer/state/level/LevelRenderState;haveGlowingEntities:Z",
         opcode = 180
      )}
   )
   private boolean modifyDrawOutline(LevelRenderState var1, Operation<Boolean> var2) {
      boolean var3 = llIlIlIllllIIIIIllllIlIIIlIlIlIIllIlIIllIIlIIIIlIIlIIIIllIIlllIIIIIIIIllIllIlllIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var3) {
         llIlIlIllllIIIIIllllIlIIIlIlIlIIllIlIIllIIlIIIIlIIlIIIIllIIlllIIIIIIIIllIllIlllIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
         return true;
      } else {
         return (Boolean)var2.call(new Object[]{var1});
      }
   }
}
