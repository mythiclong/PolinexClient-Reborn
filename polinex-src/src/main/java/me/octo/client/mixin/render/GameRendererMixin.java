package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.vertex.PoseStack;
import me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
import me.octo.client.IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl;
import me.octo.client.IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl;
import me.octo.client.lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl;
import me.octo.client.lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll;
import me.octo.client.llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll;
import me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.events.impl.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import me.octo.client.events.impl.IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII;
import me.octo.client.events.impl.llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII;
import me.octo.client.events.impl.llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI;
import me.octo.client.events.impl.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl;
import me.octo.client.utils.llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameRenderer.class})
public class GameRendererMixin {
   @Shadow
   @Final
   private Minecraft minecraft;
   @Shadow
   @Final
   private Camera mainCamera;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   public void hookGameRender(CallbackInfo var1) {
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(
            (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
   }

   @Inject(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/renderer/state/level/CameraEntityRenderState;isSleeping:Z",
         opcode = 180
      )}
   )
   public void hookWorldRender(
      DeltaTracker var1, CallbackInfo var2, @Local(name = {"projectionMatrix"}) Matrix4f var3, @Local(name = {"modelViewMatrix"}) Matrix4fc var4
   ) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         IllllIllIllllIlllllIlIlIlllIIIIIllllllIIlllIlIIIlIlIIlIIIlIlllIIIllllllIIlIlllIIIlIIl.a(var3, var4);
         lIlIlIllIllIllIllIIIIIlIlllIllIIIIlIlIIlllllIlIllllIIIllllIIIllIlIIlIIlllllIIllIIllll.a(var3, var4);
         llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.a(var3, var4);
         Vec3 var5 = this.mainCamera.position();
         IlIIIIlIlIllIIlllllIllIIlIlIlllIllIllIlllllIIIIIlIIlIlllIllIIIlIIIlllllIIIlIlIlIlIIIl.a(var3, var4, var5.x, var5.y, var5.z);
         PoseStack var6 = me.octo.client.utils.llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a();

         try {
            var6.mulPose(var4);
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a(this.minecraft.getMainRenderTarget(), var6, this.mainCamera);
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(
                  (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl(
                     var6, this.mainCamera, var1.getGameTimeDeltaPartialTick(false)
                  ))
               );
         } finally {
            IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.h();
            me.octo.client.utils.llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(var6);
         }
      }
   }

   @Inject(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;renderLevel(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;ZLnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;)V"
      )}
   )
   private void onRenderWorld(DeltaTracker var1, CallbackInfo var2) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         if (this.mainCamera != null) {
            float var3 = var1.getGameTimeDeltaPartialTick(true);
            IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl var4 = new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl(
               new PoseStack(),
               var3,
               var1.getGameTimeDeltaPartialTick(true),
               this.mainCamera,
               this.mainCamera.position().x,
               this.mainCamera.position().y,
               this.mainCamera.position().z
            );
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var4);
         }
      }
   }

   @Inject(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;renderLevel(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;ZLnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;)V"
      )}
   )
   private void callPreWorld(DeltaTracker var1, CallbackInfo var2) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(
               (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI())
            );
      }
   }

   @Inject(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;renderLevel(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;ZLnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;)V",
         shift = Shift.AFTER
      )}
   )
   private void callPostWorld(DeltaTracker var1, CallbackInfo var2) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(
               (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI())
            );
      }
   }

   @Inject(
      method = {"render"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/render/GuiRenderer;render(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"
      )}
   )
   private void onRenderOverlay(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(
               (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII())
            );
      }
   }

   @Inject(
      method = {"render"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/render/GuiRenderer;render(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V",
         shift = Shift.AFTER
      )}
   )
   private void onRenderScreen(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      if (!lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aK()) {
         Minecraft var4 = Minecraft.getInstance();
         Vector2f var5 = new Vector2f(var4.getWindow().getGuiScaledWidth(), var4.getWindow().getGuiScaledHeight());
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(
               (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl(
                  var5
               ))
            );
      }
   }

   @WrapOperation(
      method = {"renderLevel"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/GameRenderer;bobView(Lnet/minecraft/client/renderer/state/level/CameraRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V"
      )}
   )
   private void cancelHurtCamera(GameRenderer var1, CameraRenderState var2, PoseStack var3, Operation<Void> var4) {
      llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll var5 = llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      if (!var5.ae() || !llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll.aG().ae()) {
         var4.call(new Object[]{var1, var2, var3});
      }
   }
}
