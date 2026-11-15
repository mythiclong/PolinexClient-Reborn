package me.octo.client.mixin.input;

import com.mojang.blaze3d.Blaze3D;
import me.octo.client.IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll;
import me.octo.client.IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII;
import me.octo.client.IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll;
import me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII;
import me.octo.client.lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll;
import me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
import me.octo.client.llIlIlIllIIIIIlIlIllllIIIlllIIIlllIlIIlIIIlllIIIllIIIIIIllIIIIlIlIIllIIIlllIlIllIllll;
import me.octo.client.events.impl.lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI;
import me.octo.client.events.impl.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl;
import me.octo.client.utils.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.client.input.MouseButtonInfo;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MouseHandler.class})
public abstract class MouseHandlerMixin {
   @Shadow
   private double accumulatedDX;
   @Shadow
   private double accumulatedDY;
   @Shadow
   private double xpos;
   @Shadow
   private double ypos;
   @Shadow
   private double lastHandleMovementTime;
   @Unique
   private double beforeX;
   @Unique
   private double beforeY;

   @Inject(
      method = {"handleAccumulatedMovement"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void polinex$freecamMouseLook(CallbackInfo var1) {
      if (lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
            .aG()
         && lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .screen
            == null) {
         this.lastHandleMovementTime = Blaze3D.getTime();
         lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
            .b(this.accumulatedDX, this.accumulatedDY);
         this.accumulatedDX = 0.0;
         this.accumulatedDY = 0.0;
         var1.cancel();
      }
   }

   @Inject(
      method = {"onButton"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseButton(long var1, MouseButtonInfo var3, int var4, CallbackInfo var5) {
      lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl var6 = new lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl(
         var3.button(), var4, var3.modifiers()
      );
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var6);
      lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var3.button(), var4, var3.modifiers());
      if (lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
         .a(var3.button())) {
         lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll
            .aH();
         var5.cancel();
      } else if ((
            !lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               || llIlIlIllIIIIIlIlIllllIIIlllIIIlllIlIIlIIIlllIIIllIIIIIIllIIIIlIlIIllIIIlllIlIllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               || lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .screen
                  != null
         )
         && !IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()) {
         if (var6.e()) {
            var5.cancel();
         }
      } else {
         var5.cancel();
      }
   }

   @Inject(
      method = {"onScroll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
      lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI var8 = new lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI(
         var5, var3
      );
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a((me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8);
      IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll var9 = IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      if (var9.aG()
         && var5 != 0.0
         && lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .screen
            == null) {
         var9.a(var5);
         var7.cancel();
      } else if ((
            !lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               || llIlIlIllIIIIIlIlIllllIIIlllIIIlllIlIIlIIIlllIIIllIIIIIIllIIIIlIlIIllIIIlllIlIllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               || lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .screen
                  != null
         )
         && !IlIIlIllIlIIlIIIIIlllIlIIllllIlllIlIIllllIlIIlIlIlIIIIIIIlIllIlIllIIIllIIIIllllIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()) {
         if (var8.e()) {
            var7.cancel();
         }
      } else {
         var7.cancel();
      }
   }

   @Inject(
      method = {"turnPlayer"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onUpdateMouse(double var1, CallbackInfo var3) {
      lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll var4 = lIlIllllllIIIlIIIlllllllIllllllIIlllllIllllIIIIlIlIIIlIIIllIIIIllIlIIIlIIIlllIllIllll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
      if (var4.aG()) {
         var4.b(this.accumulatedDX, this.accumulatedDY);
         var3.cancel();
      } else {
         IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll var5 = IllllIIllIIIlIIlIIlIllIIllIlllIIlIllllIIlIIIIIIlIIIIIllIlllIlIIIlIlIlIIlllllIllIllIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         if (!var5.aG()
            || lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
               == null
            || this.accumulatedDX == 0.0 && this.accumulatedDY == 0.0) {
            if (lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               && !llIlIlIllIIIIIlIlIllllIIIlllIIIlllIlIIlIIIlllIIIllIIIIIIllIIIIlIlIIllIIIlllIlIllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()) {
               var3.cancel();
            }
         } else {
            var5.a(var5.ag() + (float)(this.accumulatedDX * 0.15));
            var5.b(var5.ah() + (float)(this.accumulatedDY * 0.15));
            var5.b(Math.max(-90.0F, Math.min(90.0F, var5.ah())));
            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"grabMouse"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/MouseHandler;mouseGrabbed:Z",
         ordinal = 1
      )}
   )
   private void polinex$lockXPos(CallbackInfo var1) {
      this.beforeX = this.xpos;
      this.beforeY = this.ypos;
   }

   @Inject(
      method = {"releaseMouse"},
      at = {@At("TAIL")}
   )
   private void polinex$correctCursorPosition(CallbackInfo var1) {
      if (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .screen instanceof ContainerScreen
         && IIIIIlIlllllIIIlIlIlIIIlIllllllIlIIlIlIlIlllIIIIllllllIlIIIlIIIIllIllllIIIIlllIIlllll.ag()) {
         GLFW.glfwSetCursorPos(
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .handle(),
            this.beforeX,
            this.beforeY
         );
      }
   }
}
