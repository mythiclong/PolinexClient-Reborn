package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import me.octo.client.IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll;
import me.octo.client.lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll;
import me.octo.client.llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll;
import me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.events.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.events.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import net.minecraft.client.Camera;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({Camera.class})
public abstract class CameraMixin {
   @Shadow
   private boolean detached;
   @Shadow
   private float yRot;
   @Shadow
   private float xRot;
   @Shadow
   private Vec3 position;
   @Shadow
   private Quaternionf rotation;
   @Shadow
   private int matrixPropertiesDirty;
   @Shadow
   private static Vector3f FORWARDS;
   @Shadow
   private static Vector3f UP;
   @Shadow
   private static Vector3f LEFT;
   @Shadow
   private MutableBlockPos blockPosition;
   @Shadow
   private Vector3f forwards;
   @Shadow
   private Vector3f up;
   @Shadow
   private Vector3f left;

   @ModifyArgs(
      method = {"alignWithEntity"},
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Camera;setRotation(FF)V"
      )
   )
   private void onUpdateSetRotationArgs(Args var1) {
      lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var2 = lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
      if (var2.aG()) {
         var1.set(0, var2.ah());
         var1.set(1, var2.ai());
      } else {
         IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll var3 = IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         if (var3.aG()) {
            var1.set(0, var3.ag());
            var1.set(1, var3.ah());
         }
      }
   }

   @Inject(
      method = {"getMaxZoom"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void onClipToSpace(float var1, CallbackInfoReturnable<Float> var2) {
      IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll var3 = IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll var4 = llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      boolean var5 = var3.aG() && this.detached || var4.ae() && llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll.aH().ae();
      if (var5) {
         float var6 = var1;
         if (var3.aG()) {
            var6 = var3.ai();
         }

         var2.setReturnValue(var6);
      }
   }

   @ModifyArg(
      method = {"setupPerspective"},
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Camera;getMaxZoom(F)F"
      ),
      index = 0
   )
   private float modifyDesiredCameraDistance(float var1) {
      IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll var2 = IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll var3 = llIIlIIIlIIIlIllIlIllIIlIIlIlllIIIIlIIlIIIllIlIlIlIIIllllIllIIIllllIIIIIllIllIIllllll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      if (var2.aG() && this.detached) {
         return var2.ai();
      } else {
         return var3.ae() ? var3.ah() : var1;
      }
   }

   @ModifyReturnValue(
      method = {"calculateFov"},
      at = {@At("RETURN")}
   )
   private float onCalculateFov(float var1) {
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         var1
      );
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var2);
      return var2.k();
   }

   @Inject(
      method = {"setRotation"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onSetRotation(float var1, float var2, CallbackInfo var3) {
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = new lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var1, var2
      );
      if (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var4)) {
         var3.cancel();
      } else {
         if (var4.l()) {
            var3.cancel();
            this.setRotationNoEvent(var4.n(), var4.o());
         }
      }
   }

   @Inject(
      method = {"setPosition(Lnet/minecraft/world/phys/Vec3;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onSetPosition(Vec3 var1, CallbackInfo var2) {
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = new lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         this.position.x, this.position.y, this.position.z
      );
      if (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var3)) {
         var2.cancel();
      } else {
         if (var3.l()) {
            var2.cancel();
            this.setPositionNoEvent(var3.n(), var3.o(), var3.p());
         }
      }
   }

   @Unique
   private void setPositionNoEvent(double var1, double var3, double var5) {
      this.position = new Vec3(var1, var3, var5);
      this.blockPosition.set(var1, var3, var5);
   }

   @Unique
   private void setRotationNoEvent(float var1, float var2) {
      this.xRot = var2;
      this.yRot = var1;
      this.rotation.rotationYXZ((float) Math.PI - var1 * (float) (Math.PI / 180.0), -var2 * (float) (Math.PI / 180.0), 0.0F);
      FORWARDS.rotate(this.rotation, this.forwards);
      UP.rotate(this.rotation, this.up);
      LEFT.rotate(this.rotation, this.left);
      this.matrixPropertiesDirty |= 3;
   }
}
