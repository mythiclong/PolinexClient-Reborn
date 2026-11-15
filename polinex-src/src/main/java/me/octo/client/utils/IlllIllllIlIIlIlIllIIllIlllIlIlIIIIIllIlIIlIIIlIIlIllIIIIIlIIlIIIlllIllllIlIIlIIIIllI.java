package me.octo.client.utils;

import org.jetbrains.annotations.NotNull;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public final class IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI {
   @NotNull
   public static IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI();
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static volatile int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 60;

   private IlllIllllIlIIlIlIllIIllIlllIlIlIIIIIllIlIIlIIIlIIlIllIIIIIlIIlIIIlllIllllIlIIlIIIIllI() {
   }

   public final int a() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void b() {
   long var2 = System.nanoTime();
   long var1 = var2 - IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   if (var1 < 1000000000L) {
      return;
   }

   long var4;
   try {
      var4 = net.minecraft.client.Minecraft.getInstance().getWindow().handle();
   } catch (Throwable var9) {
      return;
   }

   if (var4 == 0L) {
      return;
   }

   long var6 = org.lwjgl.glfw.GLFW.glfwGetWindowMonitor(var4);
   if (var6 == 0L) {
      var6 = this.a(var4);
   }

   if (var6 == 0L) {
      return;
   }

   if (var6 != lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
      org.lwjgl.glfw.GLFWVidMode var8 = org.lwjgl.glfw.GLFW.glfwGetVideoMode(var6);
      if (var8 != null) {
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.ranges.RangesKt.coerceAtLeast(var8.refreshRate(), 1);
      }
   }
   }

   private final long a(long var1) {
       long var21 = 0L; // PX-FIX decl var21
      int var24 = 0; // PX-FIX
      int var23 = 0; // PX-FIX
      int[] var4 = new int[1];
      int[] var5 = new int[1];
      GLFW.glfwGetWindowPos(var1, var4, var5);
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      int var6 = var4[0]
         + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .getWidth()
            / 2;
      int[] var3 = var10000;
      int var7 = var5[0]
         + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .getWindow()
               .getHeight()
            / 2;
      if (var3 != null) {
         PointerBuffer var20 = GLFW.glfwGetMonitors();
         if (var20 != null) {
            PointerBuffer var8 = var20;
            long var9 = 0L;
            int var11 = 0;
            int var12 = var8.limit();

            while (true) {
               label76:
               if (var11 < var12) {
                  long var13 = var8.get(var11);
                  int[] var15 = new int[1];
                  int[] var16 = new int[1];
                  GLFW.glfwGetMonitorPos(var13, var15, var16);
                  if (var3 != null) {
                     var21 = var13;
                     if (var3 == null) {
                        break;
                     }

                     GLFWVidMode var22 = GLFW.glfwGetVideoMode(var13);
                     if (var22 != null) {
                        GLFWVidMode var17;
                        label70: {
                           var17 = var22;
                           int var18 = var15[0];
                           var23 = var6;
                           int var10001 = var15[0] + var17.width();
                           if (var3 != null) {
                              if (var6 >= var10001) {
                                 var23 = 0;
                                 break label70;
                              }

                              var23 = var18;
                              if (var3 == null) {
                                 break label70;
                              }

                              var10001 = var6;
                           }

                           var23 = var23 <= var10001 ? 1 : 0;
                        }

                        if (var23 != 0) {
                           label61: {
                              int var19 = var16[0];
                              var24 = var7;
                              int var25 = var16[0] + var17.height();
                              if (var3 != null) {
                                 if (var7 >= var25) {
                                    var24 = 0;
                                    break label61;
                                 }

                                 var24 = var19;
                                 if (var3 == null) {
                                    break label61;
                                 }

                                 var25 = var7;
                              }

                              var24 = var24 <= var25 ? 1 : 0;
                           }

                           if (var24 != 0) {
                              var9 = var13;
                              if (var3 != null) {
                                 break label76;
                              }
                           }
                        }
                     }
                  }

                  var11++;
                  if (var3 != null) {
                     continue;
                  }
               }

               var21 = var9;
               break;
            }

            if (var3 != null) {
               var21 = var21 != 0L ? var9 : GLFW.glfwGetPrimaryMonitor();
            }

            return var21;
         }
      }

      return GLFW.glfwGetPrimaryMonitor();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
