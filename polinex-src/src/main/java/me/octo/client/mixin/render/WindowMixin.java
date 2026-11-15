package me.octo.client.mixin.render;

import com.mojang.blaze3d.platform.MacosUtil;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.platform.Window;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Window.class})
public class WindowMixin {
   @Inject(
      method = {"setIcon"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onSetIcon(CallbackInfo param1) throws IOException {
      int platform = GLFW.glfwGetPlatform();
      switch (platform) {
         case GLFW.GLFW_PLATFORM_WIN32:
         case GLFW.GLFW_PLATFORM_WAYLAND:
         case GLFW.GLFW_PLATFORM_X11:
            ByteBuffer buffer = null;
            ByteBuffer buffer2 = null;
            try (InputStream stream = WindowMixin.class.getResourceAsStream("/assets/polinex/logo16.png");
                 NativeImage nativeImage = NativeImage.read(stream);
                 InputStream stream2 = WindowMixin.class.getResourceAsStream("/assets/polinex/logo32.png");
                 NativeImage nativeImage2 = NativeImage.read(stream2);
                 MemoryStack memoryStack = MemoryStack.stackPush()) {
               buffer = MemoryUtil.memAlloc(nativeImage.getWidth() * nativeImage.getHeight() * 4);
               buffer.asIntBuffer().put(nativeImage.getPixelsABGR());
               buffer2 = MemoryUtil.memAlloc(nativeImage2.getWidth() * nativeImage2.getHeight() * 4);
               buffer2.asIntBuffer().put(nativeImage2.getPixelsABGR());
               GLFWImage.Buffer buffer3 = GLFWImage.malloc(2, memoryStack);
               buffer3.position(0);
               buffer3.width(nativeImage.getWidth());
               buffer3.height(nativeImage.getHeight());
               buffer3.pixels(buffer);
               buffer3.position(1);
               buffer3.width(nativeImage2.getWidth());
               buffer3.height(nativeImage2.getHeight());
               buffer3.pixels(buffer2);
               buffer3.position(0);
               GLFW.glfwSetWindowIcon(((Window)(Object)this).handle(), buffer3);
            } finally {
               if (buffer != null) {
                  MemoryUtil.memFree(buffer);
               }
               if (buffer2 != null) {
                  MemoryUtil.memFree(buffer2);
               }
            }
            param1.cancel();
            return;
         case GLFW.GLFW_PLATFORM_COCOA:
            MacosUtil.loadIcon(() -> WindowMixin.class.getResourceAsStream("/assets/polinex/logo.png"));
            param1.cancel();
            return;
         default:
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Not setting icon for unrecognized platform: " + platform);
      }
   }

   @Redirect(
      method = {"<init>"},
      at = @At(
         value = "INVOKE",
         target = "Lorg/lwjgl/glfw/GLFW;glfwWindowHint(II)V",
         ordinal = 5,
         remap = false
      ),
      require = 0
   )
   private void changeOpenGlForwardCompat(int var1, int var2) {
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
