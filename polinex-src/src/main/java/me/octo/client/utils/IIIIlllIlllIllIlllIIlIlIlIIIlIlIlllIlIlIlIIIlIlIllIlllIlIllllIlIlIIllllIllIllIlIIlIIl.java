package me.octo.client.utils;

import org.lwjgl.glfw.GLFW;

public class IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl {
   public static boolean a(int var0) {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      int var10000 = GLFW.glfwGetKey(
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .getWindow()
            .handle(),
         var0
      );
      if (var1 == null) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      return (var10000 != 0);
   }
}
