package me.octo.client.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII {
   @NotNull
   public static lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII() {
   }

   private final int a(int var1, String var2) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d();
      int var4 = GL20.glCreateShader(var1);
      GL20.glShaderSource(var4, var2);
      GL20.glCompileShader(var4);
      int var5 = GL20.glGetShaderi(var4, 35713);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      int var7 = var5;
      if (var3 == null) {
         if (var5 == 0) {
            String var8 = GL20.glGetShaderInfoLog(var4);
            short var10002 = -29254;
            short var10003 = 17050;
            Intrinsics.checkNotNullExpressionValue(var8, "glGetShaderInfoLog(...)");
            String var6 = var8;
            short var10001 = -29255;
            var10002 = 5755;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Blur shader compilation failed: " + var6);
            GL20.glDeleteShader(var4);
            return 0;
         }

         var7 = var4;
      }

      return var7;
   }

   private final int a(String var1) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d();
      int var3 = this.a(35633, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      int var4 = this.a(35632, var1);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      int var8 = var3;
      if (var2 == null) {
         label28:
         if (var3 != 0) {
            int var9 = var4;
            if (var2 == null) {
               if (var4 == 0) {
                  break label28;
               }

               var9 = GL20.glCreateProgram();
            }

            int var5 = var9;
            GL20.glAttachShader(var5, var3);
            GL20.glAttachShader(var5, var4);
            GL20.glLinkProgram(var5);
            int var6 = GL20.glGetProgrami(var5, 35714);
            int var10 = var6;
            if (var2 == null) {
               if (var6 == 0) {
                  String var11 = GL20.glGetProgramInfoLog(var5);
                  short var10002 = -29251;
                  short var10003 = 7257;
                  Intrinsics.checkNotNullExpressionValue(var11, "glGetProgramInfoLog(...)");
                  String var7 = var11;
                  short var10001 = -29252;
                  var10002 = 31123;
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Blur shader linking failed: " + var7);
                  GL20.glDeleteProgram(var5);
                  return 0;
               }

               GL20.glDeleteShader(var3);
               GL20.glDeleteShader(var4);
               var10 = var5;
            }

            return var10;
         }

         var8 = 0;
      }

      return var8;
   }

   private final void a() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d();
      int var10000 =(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var1 == null) {
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            return;
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.a(
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         );
         var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var1 == null) {
         if (var10000 == 0) {
            short var5 = -29259;
            short var6 = 20134;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[BlurRenderer] Failed to create blur shader program");
            return;
         }

         short var4 = -29249;
         short var10001 = 31466;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d("[BlurRenderer] Blur shader created successfully");
         var10000 = 16;
      }

      float[] var3 = new float[var10000];
      var3[0] = -1.0F;
      var3[1] = -1.0F;
      var3[2] = 0.0F;
      var3[3] = 0.0F;
      var3[4] = 1.0F;
      var3[5] = -1.0F;
      var3[6] = 1.0F;
      var3[7] = 0.0F;
      var3[8] = -1.0F;
      var3[9] = 1.0F;
      var3[10] = 0.0F;
      var3[11] = 1.0F;
      var3[12] = 1.0F;
      var3[13] = 1.0F;
      var3[14] = 1.0F;
      var3[15] = 1.0F;
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = GL30.glGenVertexArrays();
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = GL30.glGenBuffers();
      GL30.glBindVertexArray(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      GL30.glBindBuffer(34962, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      GL30.glBufferData(34962, var3, 35044);
      GL30.glVertexAttribPointer(0, 2, 5126, false, 16, 0L);
      GL30.glEnableVertexAttribArray(0);
      GL30.glVertexAttribPointer(1, 2, 5126, false, 16, 8L);
      GL30.glEnableVertexAttribArray(1);
      GL30.glBindBuffer(34962, 0);
      GL30.glBindVertexArray(0);
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
   }

   private final void a(int var1, int var2) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3;
      int var10000;
      var3 = IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d();
      var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      label38:
      if (var3 == null) {
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != 0) {
            var10000 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var3 != null) {
               break label38;
            }

            if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll == var1) {
               var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               if (var3 != null) {
                  break label38;
               }

               if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == var2) {
                  return;
               }
            }
         }

         var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      if (var3 == null) {
         if (var10000 != 0) {
            GL30.glDeleteFramebuffers(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            GL11.glDeleteTextures(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = GL11.glGenTextures();
         GL11.glBindTexture(3553, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         GL11.glTexImage2D(3553,  0,  6408,  var1,  var2,  0,  6408,  5121, (float [])null);;
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glBindTexture(3553, 0);
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = GL30.glGenFramebuffers();
         GL30.glBindFramebuffer(36160, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 0);
         var10000 = GL30.glCheckFramebufferStatus(36160);
      }

      char var10001 = '賕';
      if (var3 == null) {
         if (var10000 != 36053) {
            short var4 = -29250;
            short var5 = -9241;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[BlurRenderer] Framebuffer is not complete!");
         }

         var10000 = 36160;
         var10001 = 0;
      }

      GL30.glBindFramebuffer(var10000, var10001);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final int a(int var1, int var2, float var3) {
      int var5 = GL11.glGetInteger(36010);
      int var6 = GL11.glGetInteger(36006);
      int var7 = GL11.glGetInteger(35725);
      int var8 = GL11.glGetInteger(34229);
      int var9 = GL11.glGetInteger(34964);
      int var10 = GL11.glGetInteger(34016);
      int var11 = GL11.glGetInteger(32873);
      int[] var12 = new int[4];
      GL11.glGetIntegerv(2978, var12);
      int var13 = 0;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d();
      int var14 = 0;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = var10000;
      boolean var18 = false /* VF: Semaphore variable */;

      int var20;
      label108: {
         try {
            var18 = true;
            this.a();
            int var25 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var4 == null) {
               if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == 0) {
                  var20 = 0;
                  var18 = false;
                  break label108;
               }

               this.a(var1, var2);
               var13 = GL11.glGenTextures();
               GL11.glBindTexture(3553, var13);
               GL11.glTexImage2D(3553,  0,  6408,  var1,  var2,  0,  6408,  5121, (float [])null);;
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               var14 = GL30.glGenFramebuffers();
               GL30.glBindFramebuffer(36009, var14);
               GL30.glFramebufferTexture2D(36009, 36064, 3553, var13, 0);
               GL30.glBindFramebuffer(36008, var6);
               GL30.glBlitFramebuffer(0, 0, var1, var2, 0, 0, var1, var2, 16384, 9729);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL30.glBindFramebuffer(36160, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
               GL11.glViewport(0, 0, var1, var2);
               GL11.glClear(16384);
               GL20.glUseProgram(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
               short var10001 = -29257;
               short var10002 = 26600;
               GL20.glUniform1i(GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "image"), 0);
               var10001 = -29260;
               var10002 = -920;
               GL20.glUniform2f(
                  GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "resolution"), var1, var2
               );
               var10001 = -29258;
               var10002 = 8688;
               GL20.glUniform1f(
                  GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "blurSize"), var3
               );
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, var13);
               GL30.glBindVertexArray(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
               GL11.glDrawArrays(5, 0, 4);
               var25 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var20 = var25;
            var18 = false;
         } finally {
            if (var18) {
               int var24 = var14;
               if (var4 == null) {
                  if (var14 != 0) {
                     GL30.glDeleteFramebuffers(var14);
                  }

                  var24 = var13;
               }

               if (var4 == null) {
                  if (var24 != 0) {
                     GL11.glDeleteTextures(var13);
                  }

                  GL30.glBindVertexArray(var8);
                  GL15.glBindBuffer(34962, var9);
                  GL20.glUseProgram(var7);
                  GL13.glActiveTexture(var10);
                  GL11.glBindTexture(3553, var11);
                  GL30.glBindFramebuffer(36008, var5);
                  GL30.glBindFramebuffer(36009, var6);
                  var24 = var12[0];
               }

               GL11.glViewport(var24, var12[1], var12[2], var12[3]);
            }
         }

         int var26 = var14;
         if (var4 == null) {
            if (var14 != 0) {
               GL30.glDeleteFramebuffers(var14);
            }

            var26 = var13;
         }

         if (var4 == null) {
            if (var26 != 0) {
               GL11.glDeleteTextures(var13);
            }

            GL30.glBindVertexArray(var8);
            GL15.glBindBuffer(34962, var9);
            GL20.glUseProgram(var7);
            GL13.glActiveTexture(var10);
            GL11.glBindTexture(3553, var11);
            GL30.glBindFramebuffer(36008, var5);
            GL30.glBindFramebuffer(36009, var6);
            GL11.glViewport(var12[0], var12[1], var12[2], var12[3]);
            var26 = var20;
         }

         if (var4 != null) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }

         return var26;
      }

      GL30.glBindVertexArray(var8);
      GL15.glBindBuffer(34962, var9);
      GL20.glUseProgram(var7);
      GL13.glActiveTexture(var10);
      GL11.glBindTexture(3553, var11);
      GL30.glBindFramebuffer(36008, var5);
      GL30.glBindFramebuffer(36009, var6);
      GL11.glViewport(var12[0], var12[1], var12[2], var12[3]);
      return var20;
   }

   public final void b() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d();
      int var10000 =(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var1 == null) {
         if (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            return;
         }

         GL20.glDeleteProgram(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         GL30.glDeleteVertexArrays(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         GL30.glDeleteBuffers(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      if (var1 == null) {
         if (var10000 != 0) {
            GL30.glDeleteFramebuffers(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            GL11.glDeleteTextures(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         }

         var10000 = 0;
      }

      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (var10000 != 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var24 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "\u00849AüG1ó]´F#-W\u0098¢N¯{ãòJ\u0013\u001d½\u001cû\u0080\u001dÜìãBNØüÞÂ¼\u0086Vn\u001dú4ëøvMò×o>¶/ïõ¼\u009e°mÜ\u0095§i15_¡¹\u0011b\u0002k\u008c±\u0093Ûn\fã_°óí>_[B\u0011\u009dâÐ»Ä<±²Ï\u008d\u0011\u009d+M+èE:\u0016\u008dú\u008d\u0084t\u0088÷\u0016¬ãÞÌ>\u0086ö\"\u0007äpðÐØ\u0003î\u000eÉ¢¬^\u00908ýô\u0010<=\u0012 n¨¯ÙºC\u0088Z\u0081~õ\u0092Ö\u008aö2j\u000bÜÃ,£>Ë]\u0088_£\u0084`~\u009bÄ\u001eYü¾\u0091µÓÒI×a+n£È\u0098ãzmR¦&f/h\u0083r¡\u0082F6³çkÍ½,\u0000×¢¨\u008d?õ»:8_\u0081Ñ\u0083\u000e\u0096bÕõl\r³\b9äü\u0090\u008cìµ\r\u0014\u0018n\fÔu#®\u0092Ñ§òê1\u0091\u009ai²\u0018¯=Úpåy¦\u0092S[\u000fÞü\u0087\u001b¿{D`¿\u009b°\u0083Ñ\u0005sÓ%\u00184åó\u0096j\u008a»Æ,ÁÆÞë°¢%Ã©¡üÚðEf\u008fpy{9Æ°zÆ\u0089z¢«º\u0019ï\u0090\u009f?ÎrPÉ\u008flbxÒG·\u009e\u00adcò¾¶ÌÓ\u0082>\u0081H«\u009c\u0093¼î\u0006Ä\u0096M?\u0010T×8ˣYT\u0014\u001f\u008c\u0081pT=\u0007ï1¿àòð¤w\u0086çµI«uñç&\u009bÜ\rÝðën\u0003\u0010H)c´?ÐèPûzë9Hã\u0080%¿öÇ¯àZ$¦õÈõ¸3¹|ó\u0085Aå*Zb«Þ¯°Ã#\u0097\u0013ìÔaÎ\u001a^\u0018à&\u0013\u008e\u0084¡\"B\u0098 óþ´Ù4\u0082qh\u001awE\u001c\u0010\u0015|£v\u0088<\u0002?¼b\u0080£´o\u008d?\u008d¶Æ·v\u009c\u008ehê</½\u0088J\u0086\u001b\u0013zÅj-T¸våÝ\u0004G7ú(\u0011\u0092ÀÉÇµ\u000b\u008f\u009f\u009dn\rð\u0012ÀýcR\u001a\u0011óW¥a¥Ç\u0086òªs: ç-Ý¸ÙÚ\u008aB§ê¸\u008a\u0089üP«ºF\u0086Î\u0084D9Q»è#;]\u00ad\"X¼A¤?Ä\u0083\u0093\u009fWfóÑ\u0082ÈC¡\u0094\u0080\u0080ç\u0006zzÚªLº-L¾[ë:\n&¹á¢%YQÇB\u0099ÿkÜý1\u001b\u0093ÒkÌ\u0094í æsÅ\u0089MI\u009c\u0016õJShw'\t\tWzZ*\u0099ÐY(uãbj\u0006\u0012\u009c»\u00adXbµ;¬Ú]\u0007<ªD\t\fh\u0099o6;6«ÐC\u008dÈa\u0086Îffá\u0096\r\u008fÛâdh+@*¥r\u0085\u008b\u0095\u008b«*\u00839;Ã¬$\u000f° èÔ\u0088RJTt\u001f\u0010d'×\u0084Éè:í>Úw¯dÕ×êß\u0082ÈM\u001a\u0086\u007fÐæKÚ\r;6\u0005\u0005¹\u0007\u0012u[õÛ\u008dì½Gr\u001d ÕBt/þ)okz\u0088Ô+\u000eÈò\u0011A©\u0082NqÃ|@+\u0011B\u008fäÉØ\u008fÖ¸[$\u0097Ó\rÌô\nbË\u0006s\u008c+\u0092vT½ÈÜ1\u0001%Øî\u008eÄ\u008a(b\u0092\u0006ÇÙÀÄhæÐï\u0010»Ø®É\u0019\u0015<u\u008d\u008d\u0082¿äMëº£\u0018hi\u0083vü¸×¢L^\u0094\u0003\u000f\u008a«\u0004D\u0005qäÑ\u0015¯~\u0086]ã\u0005wM×ky¡\u008b~æßüIÔÑÐ¯\u0003®ÐæÐ¼yát\u008cà,\u008a\u007f'´Tª\u0012ñMh\\Z*µ\u0099b^.Óé{\u009aÞJ/ùíë»\u008d×(ÆÒW3\u007fqý$©HÆþPªOáMv\u0006\u0082\u0085S£l\u0007Æ\u0083Ï\u0086@±äªÄz\u0011ÔªF$Â÷\u0087Ígüvhf½P x\u0091m\u007f.\u0002RRß? ý>\u0094·hïV.¶\u0011u \u0011H\u008fÔÐ¡Ó3\u0092öðp\u008aãH\bð\u0088¬\u0000¹{ýñy.WP\u0088_\u0082\u001eÎ\u008b4\u0007ÝPîÏ|3\u009cÝ`a\fÀ\u0011\u0001¤ßä\u0085A\u0098\u0003m\u0017ÊÚ\u0088\u0080~½Î¡I\u0001ì\u0014ø\u0017\u009d\u0095COv{^ä\u00983Ç\u0005¹\u0080\u0010®Èí%faÔU\u009dø\u0092Gê}K¹Î:\u008fÂ¤9m4\u0081³µiÉåäÖÎÉ\u0011\u000f\u00995K÷`[`\b¨Á\n\u0091a`ÕÉz?³ãA";
      int var4 = "\u00849AüG1ó]´F#-W\u0098¢N¯{ãòJ\u0013\u001d½\u001cû\u0080\u001dÜìãBNØüÞÂ¼\u0086Vn\u001dú4ëøvMò×o>¶/ïõ¼\u009e°mÜ\u0095§i15_¡¹\u0011b\u0002k\u008c±\u0093Ûn\fã_°óí>_[B\u0011\u009dâÐ»Ä<±²Ï\u008d\u0011\u009d+M+èE:\u0016\u008dú\u008d\u0084t\u0088÷\u0016¬ãÞÌ>\u0086ö\"\u0007äpðÐØ\u0003î\u000eÉ¢¬^\u00908ýô\u0010<=\u0012 n¨¯ÙºC\u0088Z\u0081~õ\u0092Ö\u008aö2j\u000bÜÃ,£>Ë]\u0088_£\u0084`~\u009bÄ\u001eYü¾\u0091µÓÒI×a+n£È\u0098ãzmR¦&f/h\u0083r¡\u0082F6³çkÍ½,\u0000×¢¨\u008d?õ»:8_\u0081Ñ\u0083\u000e\u0096bÕõl\r³\b9äü\u0090\u008cìµ\r\u0014\u0018n\fÔu#®\u0092Ñ§òê1\u0091\u009ai²\u0018¯=Úpåy¦\u0092S[\u000fÞü\u0087\u001b¿{D`¿\u009b°\u0083Ñ\u0005sÓ%\u00184åó\u0096j\u008a»Æ,ÁÆÞë°¢%Ã©¡üÚðEf\u008fpy{9Æ°zÆ\u0089z¢«º\u0019ï\u0090\u009f?ÎrPÉ\u008flbxÒG·\u009e\u00adcò¾¶ÌÓ\u0082>\u0081H«\u009c\u0093¼î\u0006Ä\u0096M?\u0010T×8ˣYT\u0014\u001f\u008c\u0081pT=\u0007ï1¿àòð¤w\u0086çµI«uñç&\u009bÜ\rÝðën\u0003\u0010H)c´?ÐèPûzë9Hã\u0080%¿öÇ¯àZ$¦õÈõ¸3¹|ó\u0085Aå*Zb«Þ¯°Ã#\u0097\u0013ìÔaÎ\u001a^\u0018à&\u0013\u008e\u0084¡\"B\u0098 óþ´Ù4\u0082qh\u001awE\u001c\u0010\u0015|£v\u0088<\u0002?¼b\u0080£´o\u008d?\u008d¶Æ·v\u009c\u008ehê</½\u0088J\u0086\u001b\u0013zÅj-T¸våÝ\u0004G7ú(\u0011\u0092ÀÉÇµ\u000b\u008f\u009f\u009dn\rð\u0012ÀýcR\u001a\u0011óW¥a¥Ç\u0086òªs: ç-Ý¸ÙÚ\u008aB§ê¸\u008a\u0089üP«ºF\u0086Î\u0084D9Q»è#;]\u00ad\"X¼A¤?Ä\u0083\u0093\u009fWfóÑ\u0082ÈC¡\u0094\u0080\u0080ç\u0006zzÚªLº-L¾[ë:\n&¹á¢%YQÇB\u0099ÿkÜý1\u001b\u0093ÒkÌ\u0094í æsÅ\u0089MI\u009c\u0016õJShw'\t\tWzZ*\u0099ÐY(uãbj\u0006\u0012\u009c»\u00adXbµ;¬Ú]\u0007<ªD\t\fh\u0099o6;6«ÐC\u008dÈa\u0086Îffá\u0096\r\u008fÛâdh+@*¥r\u0085\u008b\u0095\u008b«*\u00839;Ã¬$\u000f° èÔ\u0088RJTt\u001f\u0010d'×\u0084Éè:í>Úw¯dÕ×êß\u0082ÈM\u001a\u0086\u007fÐæKÚ\r;6\u0005\u0005¹\u0007\u0012u[õÛ\u008dì½Gr\u001d ÕBt/þ)okz\u0088Ô+\u000eÈò\u0011A©\u0082NqÃ|@+\u0011B\u008fäÉØ\u008fÖ¸[$\u0097Ó\rÌô\nbË\u0006s\u008c+\u0092vT½ÈÜ1\u0001%Øî\u008eÄ\u008a(b\u0092\u0006ÇÙÀÄhæÐï\u0010»Ø®É\u0019\u0015<u\u008d\u008d\u0082¿äMëº£\u0018hi\u0083vü¸×¢L^\u0094\u0003\u000f\u008a«\u0004D\u0005qäÑ\u0015¯~\u0086]ã\u0005wM×ky¡\u008b~æßüIÔÑÐ¯\u0003®ÐæÐ¼yát\u008cà,\u008a\u007f'´Tª\u0012ñMh\\Z*µ\u0099b^.Óé{\u009aÞJ/ùíë»\u008d×(ÆÒW3\u007fqý$©HÆþPªOáMv\u0006\u0082\u0085S£l\u0007Æ\u0083Ï\u0086@±äªÄz\u0011ÔªF$Â÷\u0087Ígüvhf½P x\u0091m\u007f.\u0002RRß? ý>\u0094·hïV.¶\u0011u \u0011H\u008fÔÐ¡Ó3\u0092öðp\u008aãH\bð\u0088¬\u0000¹{ýñy.WP\u0088_\u0082\u001eÎ\u008b4\u0007ÝPîÏ|3\u009cÝ`a\fÀ\u0011\u0001¤ßä\u0085A\u0098\u0003m\u0017ÊÚ\u0088\u0080~½Î¡I\u0001ì\u0014ø\u0017\u009d\u0095COv{^ä\u00983Ç\u0005¹\u0080\u0010®Èí%faÔU\u009dø\u0092Gê}K¹Î:\u008fÂ¤9m4\u0081³µiÉåäÖÎÉ\u0011\u000f\u00995K÷`[`\b¨Á\n\u0091a`ÕÉz?³ãA"
         .length();
      char var1 = 24;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 57;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = (byte)var10000;
               var24 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var31 = (byte)var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 113;
                     case 1 -> 2;
                     case 2 -> 45;
                     case 3 -> 1;
                     case 4 -> 15;
                     case 5 -> 9;
                     default -> 108;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var24;
                     var36 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var40 = var24;
                     var36 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var24).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[12];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII();
                     var10000 = -29256;
                     short var18 = -15580;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = "#version 330 core\nlayout (location = 0) in vec2 aPos;\nlayout (location = 1) in vec2 aTexCoord;\nout vec2 TexCoord;\n\nvoid main() {\n    gl_Position = vec4(aPos, 0.0, 1.0);\n    TexCoord = aTexCoord;\n}";
                     var10000 = -29253;
                     short var19 = 10562;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "#version 330 core\nout vec4 FragColor;\nin vec2 TexCoord;\n\nuniform sampler2D image;\nuniform vec2 resolution;\nuniform float blurSize;\n\nvoid main() {\n    float Pi = 6.28318530718;\n    float Directions = 32.0;\n    float Quality = 8.0;\n    float Size = blurSize;\n\n    vec2 Radius = Size / resolution;\n    vec2 uv = TexCoord;\n    vec4 Color = texture(image, uv);\n\n    for(float d = 0.0; d < Pi; d += Pi / Directions) {\n        for(float i = 1.0 / Quality; i <= 1.0; i += 1.0 / Quality) {\n            Color += texture(image, uv + vec2(cos(d), sin(d)) * Radius * i);\n        }\n    }\n\n    // Total samples = 1 (center) + Directions * Quality (loop samples)\n    // = 1 + 16 * 3 = 49\n    Color /= (Quality * Directions + 1.0);\n    FragColor = Color;\n}";
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "B²Í\u0013\u0098\b\u001a\u0098¸b\u0096\u0093¿ ";
                  var4 = "B²Í\u0013\u0098\b\u001a\u0098¸b\u0096\u0093¿ ".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 110;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -29251) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 225;
            case 1 -> 203;
            case 2 -> 45;
            case 3 -> 134;
            case 4 -> 130;
            case 5 -> 137;
            case 6 -> 150;
            case 7 -> 113;
            case 8 -> 69;
            case 9 -> 26;
            case 10 -> 123;
            case 11 -> 196;
            case 12 -> 63;
            case 13 -> 140;
            case 14 -> 58;
            case 15 -> 3;
            case 16 -> 89;
            case 17 -> 16;
            case 18 -> 106;
            case 19 -> 30;
            case 20 -> 104;
            case 21 -> 206;
            case 22 -> 119;
            case 23 -> 252;
            case 24 -> 211;
            case 25 -> 71;
            case 26 -> 214;
            case 27 -> 248;
            case 28 -> 186;
            case 29 -> 145;
            case 30 -> 217;
            case 31 -> 80;
            case 32 -> 118;
            case 33 -> 95;
            case 34 -> 195;
            case 35 -> 48;
            case 36 -> 124;
            case 37 -> 160;
            case 38 -> 23;
            case 39 -> 81;
            case 40 -> 226;
            case 41 -> 182;
            case 42 -> 156;
            case 43 -> 8;
            case 44 -> 18;
            case 45 -> 163;
            case 46 -> 233;
            case 47 -> 12;
            case 48 -> 116;
            case 49 -> 129;
            case 50 -> 75;
            case 51 -> 0;
            case 52 -> 78;
            case 53 -> 107;
            case 54 -> 198;
            case 55 -> 108;
            case 56 -> 103;
            case 57 -> 120;
            case 58 -> 50;
            case 59 -> 65;
            case 60 -> 98;
            case 61 -> 148;
            case 62 -> 21;
            case 63 -> 121;
            case 64 -> 213;
            case 65 -> 231;
            case 66 -> 197;
            case 67 -> 178;
            case 68 -> 54;
            case 69 -> 139;
            case 70 -> 251;
            case 71 -> 159;
            case 72 -> 239;
            case 73 -> 31;
            case 74 -> 66;
            case 75 -> 28;
            case 76 -> 154;
            case 77 -> 34;
            case 78 -> 155;
            case 79 -> 109;
            case 80 -> 202;
            case 81 -> 6;
            case 82 -> 36;
            case 83 -> 172;
            case 84 -> 115;
            case 85 -> 59;
            case 86 -> 175;
            case 87 -> 9;
            case 88 -> 221;
            case 89 -> 168;
            case 90 -> 229;
            case 91 -> 190;
            case 92 -> 236;
            case 93 -> 180;
            case 94 -> 88;
            case 95 -> 2;
            case 96 -> 56;
            case 97 -> 70;
            case 98 -> 187;
            case 99 -> 122;
            case 100 -> 22;
            case 101 -> 94;
            case 102 -> 64;
            case 103 -> 96;
            case 104 -> 173;
            case 105 -> 152;
            case 106 -> 136;
            case 107 -> 171;
            case 108 -> 84;
            case 109 -> 176;
            case 110 -> 151;
            case 111 -> 143;
            case 112 -> 100;
            case 113 -> 244;
            case 114 -> 179;
            case 115 -> 72;
            case 116 -> 39;
            case 117 -> 207;
            case 118 -> 51;
            case 119 -> 73;
            case 120 -> 83;
            case 121 -> 13;
            case 122 -> 27;
            case 123 -> 246;
            case 124 -> 208;
            case 125 -> 14;
            case 126 -> 177;
            case 127 -> 53;
            case 128 -> 85;
            case 129 -> 1;
            case 130 -> 181;
            case 131 -> 132;
            case 132 -> 253;
            case 133 -> 32;
            case 134 -> 149;
            case 135 -> 191;
            case 136 -> 232;
            case 137 -> 11;
            case 138 -> 92;
            case 139 -> 105;
            case 140 -> 135;
            case 141 -> 200;
            case 142 -> 247;
            case 143 -> 210;
            case 144 -> 67;
            case 145 -> 146;
            case 146 -> 19;
            case 147 -> 215;
            case 148 -> 93;
            case 149 -> 49;
            case 150 -> 112;
            case 151 -> 250;
            case 152 -> 157;
            case 153 -> 144;
            case 154 -> 29;
            case 155 -> 185;
            case 156 -> 243;
            case 157 -> 242;
            case 158 -> 77;
            case 159 -> 192;
            case 160 -> 17;
            case 161 -> 138;
            case 162 -> 166;
            case 163 -> 90;
            case 164 -> 201;
            case 165 -> 125;
            case 166 -> 33;
            case 167 -> 238;
            case 168 -> 194;
            case 169 -> 57;
            case 170 -> 62;
            case 171 -> 164;
            case 172 -> 227;
            case 173 -> 222;
            case 174 -> 237;
            case 175 -> 68;
            case 176 -> 184;
            case 177 -> 110;
            case 178 -> 141;
            case 179 -> 162;
            case 180 -> 44;
            case 181 -> 219;
            case 182 -> 212;
            case 183 -> 91;
            case 184 -> 82;
            case 185 -> 86;
            case 186 -> 46;
            case 187 -> 245;
            case 188 -> 4;
            case 189 -> 117;
            case 190 -> 55;
            case 191 -> 153;
            case 192 -> 188;
            case 193 -> 111;
            case 194 -> 234;
            case 195 -> 47;
            case 196 -> 128;
            case 197 -> 205;
            case 198 -> 24;
            case 199 -> 142;
            case 200 -> 220;
            case 201 -> 38;
            case 202 -> 170;
            case 203 -> 74;
            case 204 -> 174;
            case 205 -> 224;
            case 206 -> 25;
            case 207 -> 235;
            case 208 -> 114;
            case 209 -> 133;
            case 210 -> 5;
            case 211 -> 165;
            case 212 -> 223;
            case 213 -> 255;
            case 214 -> 7;
            case 215 -> 79;
            case 216 -> 249;
            case 217 -> 189;
            case 218 -> 158;
            case 219 -> 52;
            case 220 -> 254;
            case 221 -> 102;
            case 222 -> 167;
            case 223 -> 41;
            case 224 -> 76;
            case 225 -> 37;
            case 226 -> 241;
            case 227 -> 131;
            case 228 -> 216;
            case 229 -> 240;
            case 230 -> 204;
            case 231 -> 35;
            case 232 -> 97;
            case 233 -> 169;
            case 234 -> 40;
            case 235 -> 161;
            case 236 -> 60;
            case 237 -> 147;
            case 238 -> 228;
            case 239 -> 127;
            case 240 -> 87;
            case 241 -> 218;
            case 242 -> 42;
            case 243 -> 101;
            case 244 -> 15;
            case 245 -> 61;
            case 246 -> 209;
            case 247 -> 199;
            case 248 -> 230;
            case 249 -> 10;
            case 250 -> 43;
            case 251 -> 20;
            case 252 -> 126;
            case 253 -> 193;
            case 254 -> 99;
            default -> 183;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // PX-FIX synth restored from jar bytecode
  public static int a(me.octo.client.utils.lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII p0, int p1, int p2, float p3, int p4, java.lang.Object p5) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] pxmask = IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.d();
      if ((pxmask != null) || (p4 & 4) != 0) { p3 = 8.0f; }
      return p0.a(p1, p2, p3);
   }
}
