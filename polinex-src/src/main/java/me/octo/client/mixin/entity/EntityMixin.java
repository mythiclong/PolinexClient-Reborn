package me.octo.client.mixin.entity;

import me.octo.client.IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII;
import me.octo.client.IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII;
import me.octo.client.lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl;
import me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.events.impl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Entity.class})
public abstract class EntityMixin {
   @Shadow
   public float xRotO;
   @Shadow
   public float yRotO;
   @Shadow
   private Vec3 position;
   @Shadow
   private float yRot;
   @Shadow
   private float xRot;
   @Shadow
   private boolean onGround;
   @Shadow
   public boolean noPhysics;
   @Shadow
   private Entity vehicle;

   @Shadow
   public abstract void setOnGround(boolean var1);

   @Shadow
   protected abstract void setRot(float var1, float var2);

   @Shadow
   public abstract void setPosRaw(double var1, double var3, double var5);

   @Shadow
   public abstract boolean onGround();

   @Shadow
   public abstract void setXRot(float var1);

   @Shadow
   public abstract void setYRot(float var1);

   @Shadow
   public abstract float getXRot();

   @Shadow
   public abstract float getYRot();

   @Shadow
   public abstract double getZ();

   @Shadow
   public abstract double getY();

   @Shadow
   public abstract double getX();

   @Inject(
      method = {"shouldRenderAtSqrDistance"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void polinex$forceRenderDistance(double var1, CallbackInfoReturnable<Boolean> var3) {
      Entity var4 = (Entity)(Object)this;
      if (lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aJ()) {
         var3.setReturnValue(false);
      } else {
         if (IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.b(var4)
            || IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.b(var4)) {
            var3.setReturnValue(true);
         }
      }
   }

   @Inject(
      method = {"shouldRender(DDD)Z"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void polinex$forceRender(double var1, double var3, double var5, CallbackInfoReturnable<Boolean> var7) {
      Entity var8 = (Entity)(Object)this;
      if (lIIllIIllIlIIlIllIIlIIIlIllIllIlllIlllIlIIIlIIIlIIlllllIIIIIllIIIllllIlIIIllllIllIlIl.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .aJ()) {
         var7.setReturnValue(false);
      } else {
         if (IIlIlIIIIlIllllIIllIlIllIIllIlllIIIIIllIIIllllllIllIIllIIIlIIIlllllIIIIIlIIllllllIIII.b(var8)
            || IlIIlllllllllIllllIlllIllIlIIlIIIIIlIIllIIIllllIllIlIlIIllllllIIIIlIIllIIIlIIIIllIIII.b(var8)) {
            var7.setReturnValue(true);
         }
      }
   }

   @Inject(
      method = {"turn"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void changeLookDirection(double var1, double var3, CallbackInfo var5) {
      if ((Object)this instanceof LocalPlayer) {
         IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var6 = new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
            var1, var3
         );
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var6);
         if (var6.l()) {
            this.changeLookDirectionNoEvent(
               var6.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var6.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            );
            var5.cancel();
         }

         if (var6.e()) {
            var5.cancel();
         }
      }
   }

   @Unique
   private void changeLookDirectionNoEvent(double var1, double var3) {
      float var5 = (float)var3;
      float var6 = (float)var1;
      this.setXRot(this.getXRot() + var5);
      this.setYRot(this.getYRot() + var6);
      this.setXRot(Mth.clamp(this.getXRot(), -90.0F, 90.0F));
      this.xRotO += var5;
      this.yRotO += var6;
      this.xRotO = Mth.clamp(this.xRotO, -90.0F, 90.0F);
      if (this.vehicle != null) {
         this.vehicle.onPassengerTurned((Entity)(Object)this);
      }
   }
}
