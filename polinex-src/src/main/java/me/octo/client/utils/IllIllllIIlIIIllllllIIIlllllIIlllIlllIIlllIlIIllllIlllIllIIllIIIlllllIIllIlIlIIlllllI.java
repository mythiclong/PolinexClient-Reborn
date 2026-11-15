package me.octo.client.utils;

import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryUtil;

public final class IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI {
   private final long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private volatile int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private volatile int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private volatile long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private volatile boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private Thread IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private float[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final String lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final String lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] a;
   private static String[] b;

   public IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI(
      long var1, @NotNull IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII var3
   ) {
      short var10001 = -25049;
      short var10002 = 6541;
      Intrinsics.checkNotNullParameter(var3, "relay");
      super();
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 854;
      int[] var4 = var10000;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 480;
      IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI var7 = this;
      float[] var5 = new float[24];

      try {
         var5[0] = -1.0F;
         var5[1] = 1.0F;
         var5[2] = 0.0F;
         var5[3] = 1.0F;
         var5[4] = -1.0F;
         var5[5] = -1.0F;
         var5[6] = 0.0F;
         var5[7] = 0.0F;
         var5[8] = 1.0F;
         var5[9] = -1.0F;
         var5[10] = 1.0F;
         var5[11] = 0.0F;
         var5[12] = -1.0F;
         var5[13] = 1.0F;
         var5[14] = 0.0F;
         var5[15] = 1.0F;
         var5[16] = 1.0F;
         var5[17] = -1.0F;
         var5[18] = 1.0F;
         var5[19] = 0.0F;
         var5[20] = 1.0F;
         var5[21] = 1.0F;
         var5[22] = 1.0F;
         var5[23] = 1.0F;
         var7.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var5;
         var10001 = -25053;
         var10002 = -6900;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = "#version 330 core\nlayout (location = 0) in vec2 aPos;\nlayout (location = 1) in vec2 aTexCoords;\nout vec2 TexCoords;\nvoid main() {\n    gl_Position = vec4(aPos.x, aPos.y, 0.0, 1.0);\n    TexCoords = aTexCoords;\n}";
         var10001 = -25051;
         var10002 = -29215;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = "#version 330 core\nout vec4 FragColor;\nin vec2 TexCoords;\nuniform sampler2D screenTexture;\nvoid main() {\n    FragColor = texture(screenTexture, TexCoords);\n}";
         if (var4 == null) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
            );
         }
      } catch (RuntimeException var6) {
         throw (RuntimeException)a(var6);
      }
   }

   public final int a() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(int var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final int b() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void b(int var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   public final long c() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void a(long var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   public final void d() {
      int[] var1 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var1 != null && this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         return;
      }

      if (var1 != null) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
      }

      Thread var2 = new Thread(new Runnable() {
         @Override
         public void run() {
            a(IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.this);
         }
      }, "Polinex-PiP-Present");
      var2.setDaemon(true);
      var2.start();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
   }

   public final void e() {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a();
   }

   public final void b(long param1) {
      int[] var3 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      if (var3 != null) {
         Thread var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         if (var4 != null) {
            try {
               var4.join(param1);
            } catch (Exception var5) {
            }
         }
      }

      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = null;
   }

   private final void f() {
      int[] var1 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      org.lwjgl.glfw.GLFW.glfwMakeContextCurrent(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      org.lwjgl.opengl.GL.createCapabilities();
      org.lwjgl.glfw.GLFW.glfwSwapInterval(0);
      this.g();
      this.h();
      org.lwjgl.opengl.GL11.glViewport(0, 0, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      org.lwjgl.opengl.GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      org.lwjgl.opengl.GL11.glClear(16384);

      try {
         org.lwjgl.glfw.GLFW.glfwSwapBuffers(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);

         while (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(100L);

            if (!this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               break;
            }

            if (var2 > 0) {
               this.c(var2);
            }
         }
      } catch (Exception var2) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("PiP present thread crashed: " + var2.getMessage());
         var2.printStackTrace();
      } finally {
         this.i();
         org.lwjgl.glfw.GLFW.glfwMakeContextCurrent(0L);
      }
   }

   private final void c(int var1) {
      GL11.glViewport(
         0,
         0,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      GL20.glUseProgram(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, var1);
      GL11.glDisable(2929);
      GL11.glDisable(3042);
      GL30.glBindVertexArray(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
      GL11.glDrawArrays(4, 0, 6);
      GL30.glBindVertexArray(0);
      GLFW.glfwSwapBuffers(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = System.currentTimeMillis();
   }

   private final void g() {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = GL30.glGenVertexArrays();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = GL15.glGenBuffers();
      GL30.glBindVertexArray(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
      GL15.glBindBuffer(34962, this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
      FloatBuffer var10000 = MemoryUtil.memAllocFloat(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.length);
      short var10002 = -25054;
      short var10003 = 13508;
      Intrinsics.checkNotNullExpressionValue(var10000, "memAllocFloat(...)");
      FloatBuffer var1 = var10000;
      var1.put(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl).flip();
      GL15.glBufferData(34962, var1, 35044);
      MemoryUtil.memFree(var1);
      GL20.glEnableVertexAttribArray(0);
      GL20.glVertexAttribPointer(0, 2, 5126, false, 16, 0L);
      GL20.glEnableVertexAttribArray(1);
      GL20.glVertexAttribPointer(1, 2, 5126, false, 16, 8L);
      GL30.glBindVertexArray(0);
   }

   private final void h() {
      int var2 = org.lwjgl.opengl.GL20.glCreateShader(35633);
      org.lwjgl.opengl.GL20.glShaderSource(var2, this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
      org.lwjgl.opengl.GL20.glCompileShader(var2);
      if (org.lwjgl.opengl.GL20.glGetShaderi(var2, 35713) == 0) {
         throw new RuntimeException("PiP vertex shader: " + org.lwjgl.opengl.GL20.glGetShaderInfoLog(var2));
      }
      int var3 = org.lwjgl.opengl.GL20.glCreateShader(35632);
      org.lwjgl.opengl.GL20.glShaderSource(var3, this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
      org.lwjgl.opengl.GL20.glCompileShader(var3);
      if (org.lwjgl.opengl.GL20.glGetShaderi(var3, 35713) == 0) {
         throw new RuntimeException("PiP fragment shader: " + org.lwjgl.opengl.GL20.glGetShaderInfoLog(var3));
      }
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = org.lwjgl.opengl.GL20.glCreateProgram();
      org.lwjgl.opengl.GL20.glAttachShader(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, var2);
      org.lwjgl.opengl.GL20.glAttachShader(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, var3);
      org.lwjgl.opengl.GL20.glLinkProgram(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      if (org.lwjgl.opengl.GL20.glGetProgrami(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, 35714) == 0) {
         throw new RuntimeException("PiP shader link: " + org.lwjgl.opengl.GL20.glGetProgramInfoLog(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI));
      }
      org.lwjgl.opengl.GL20.glDeleteShader(var2);
      org.lwjgl.opengl.GL20.glDeleteShader(var3);
      org.lwjgl.opengl.GL20.glUseProgram(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      int var4 = org.lwjgl.opengl.GL20.glGetUniformLocation(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, "screenTexture");
      if (var4 >= 0) {
         org.lwjgl.opengl.GL20.glUniform1i(var4, 0);
      }
      org.lwjgl.opengl.GL20.glUseProgram(0);
   }

   private final void i() {
      int[] var1 = me.octo.client.utils.lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      try {
         if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != 0) {
            org.lwjgl.opengl.GL30.glDeleteVertexArrays(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0;
         }

         if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII != 0) {
            org.lwjgl.opengl.GL15.glDeleteBuffers(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0;
         }

         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI != 0) {
            org.lwjgl.opengl.GL20.glDeleteProgram(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0;
         }
      } catch (Exception var2) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("PiP present cleanup error:" + var2.getMessage());
      }
   }

   private static final void a(IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI var0) {
      var0.f();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "zL\u009fÁÝDEui©\u0084ýÇ`Þ¥\u0091d.\u009c\u0018àÇuã¦+ç!\u008a\u0090\u0095:Â\u0015Ã£ísÞ½9Ý\u0080ÃL\nX\u000e\u0002|íÊ§\u0091~m\u001f;g^\u001c\u0093¾o[lw\u000e}?\r´æ\u0084*\u009e\u008a\u0010@f~19Ür}\u009fÏzû:b\u009c¹qUX&´Àª\u0083ÖÔ>ôÚ8Å\b\u00856°\u000128Ê=ÓËÔ¯éäO~\u000b\u000e\u0096s¬y\u0097\u008e¼ãhX\u0010\u0003¥A¨w¸IåuQ`\u001dp\u001du\u0083«l* âòS\u0000\u008aûþ~}ÙêÕÁ¹'ð\u0011P±æñT/Óý´ÃÜ\u0089\u008b\u009bG\f(\u0005Ã\u0019Î(à\u001c*;© ¾\u001féµw#ðFÍ¡(Ò¾T\u001b\\\u0010ü«\\®+{\u0088\u001b\n*\u00ad\u0082>[ù=u2°dÒá)ZdÐþ¼áØa®ÁÌy\u00121\u0090m9 \u007f¿tÕ\u000bø@´H[ìHüÑú¯\u009b\u009ch\u009bZ@\u000f~U\u000b\u0082\u0011\u0002¹A¢,#8_Âû\u0000\f\u0015æ9Ùº¼càë\u009b\u009f?]P\u0093e\u000f\u009fF\u008b\u0092\u0003b\r\u0088n\u000b{\f`\u0000ÈÅLâ\u00061\u009bBv\u0090KÚfà´þ\u009es¹.dG¿\n\u008dç»ðáÐ91bG¥è\u001dm\u0015Ã¹\u0097*\u0098§iR'sC.A|1ZÙâ\u000eèJd½s5\r@©v|]d:\u0001Ò\u0016{ßÊU.ºC[\u009aä\u0098ª\u0098ª¨H\u001f®\u009b\u0089\tÇE<g\u0088(\u008bw |Ð\u0005\u0017\u0099\u0000\\\u007fgJ\u008a\u0002ìS\\N%n\u0085\u0083\u00ad\u0092#°cÁQe<¬kü\u0010¾àAÒ-qàOõé\u0017MTÕ\u0015£¨\u0098Ò\u008eQ?h!\u0005)¼û;*ý¢4o(Ô";
      int var4 = "zL\u009fÁÝDEui©\u0084ýÇ`Þ¥\u0091d.\u009c\u0018àÇuã¦+ç!\u008a\u0090\u0095:Â\u0015Ã£ísÞ½9Ý\u0080ÃL\nX\u000e\u0002|íÊ§\u0091~m\u001f;g^\u001c\u0093¾o[lw\u000e}?\r´æ\u0084*\u009e\u008a\u0010@f~19Ür}\u009fÏzû:b\u009c¹qUX&´Àª\u0083ÖÔ>ôÚ8Å\b\u00856°\u000128Ê=ÓËÔ¯éäO~\u000b\u000e\u0096s¬y\u0097\u008e¼ãhX\u0010\u0003¥A¨w¸IåuQ`\u001dp\u001du\u0083«l* âòS\u0000\u008aûþ~}ÙêÕÁ¹'ð\u0011P±æñT/Óý´ÃÜ\u0089\u008b\u009bG\f(\u0005Ã\u0019Î(à\u001c*;© ¾\u001féµw#ðFÍ¡(Ò¾T\u001b\\\u0010ü«\\®+{\u0088\u001b\n*\u00ad\u0082>[ù=u2°dÒá)ZdÐþ¼áØa®ÁÌy\u00121\u0090m9 \u007f¿tÕ\u000bø@´H[ìHüÑú¯\u009b\u009ch\u009bZ@\u000f~U\u000b\u0082\u0011\u0002¹A¢,#8_Âû\u0000\f\u0015æ9Ùº¼càë\u009b\u009f?]P\u0093e\u000f\u009fF\u008b\u0092\u0003b\r\u0088n\u000b{\f`\u0000ÈÅLâ\u00061\u009bBv\u0090KÚfà´þ\u009es¹.dG¿\n\u008dç»ðáÐ91bG¥è\u001dm\u0015Ã¹\u0097*\u0098§iR'sC.A|1ZÙâ\u000eèJd½s5\r@©v|]d:\u0001Ò\u0016{ßÊU.ºC[\u009aä\u0098ª\u0098ª¨H\u001f®\u009b\u0089\tÇE<g\u0088(\u008bw |Ð\u0005\u0017\u0099\u0000\\\u007fgJ\u008a\u0002ìS\\N%n\u0085\u0083\u00ad\u0092#°cÁQe<¬kü\u0010¾àAÒ-qàOõé\u0017MTÕ\u0015£¨\u0098Ò\u008eQ?h!\u0005)¼û;*ý¢4o(Ô"
         .length();
      char var1 = 19;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 66;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 93;
                     case 1 -> 4;
                     case 2 -> 71;
                     case 3 -> 41;
                     case 4 -> 67;
                     case 5 -> 114;
                     default -> 71;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[11];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = ".§¢ÓBn\u001eüm*â\u0082Q\u0013\u001aTA£K\u0086h\u009a\\Ù/p\u001a¹µ\u0017$\\×";
                  var4 = ".§¢ÓBn\u001eüm*â\u0082Q\u0013\u001aTA£K\u0086h\u009a\\Ù/p\u001a¹µ\u0017$\\×".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 77;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -25052) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 10;
            case 1 -> 48;
            case 2 -> 178;
            case 3 -> 237;
            case 4 -> 199;
            case 5 -> 55;
            case 6 -> 230;
            case 7 -> 189;
            case 8 -> 170;
            case 9 -> 4;
            case 10 -> 136;
            case 11 -> 169;
            case 12 -> 194;
            case 13 -> 8;
            case 14 -> 242;
            case 15 -> 131;
            case 16 -> 110;
            case 17 -> 105;
            case 18 -> 197;
            case 19 -> 116;
            case 20 -> 24;
            case 21 -> 65;
            case 22 -> 150;
            case 23 -> 109;
            case 24 -> 108;
            case 25 -> 177;
            case 26 -> 87;
            case 27 -> 3;
            case 28 -> 12;
            case 29 -> 250;
            case 30 -> 182;
            case 31 -> 112;
            case 32 -> 118;
            case 33 -> 26;
            case 34 -> 121;
            case 35 -> 40;
            case 36 -> 56;
            case 37 -> 64;
            case 38 -> 69;
            case 39 -> 210;
            case 40 -> 123;
            case 41 -> 61;
            case 42 -> 92;
            case 43 -> 44;
            case 44 -> 80;
            case 45 -> 227;
            case 46 -> 129;
            case 47 -> 86;
            case 48 -> 141;
            case 49 -> 18;
            case 50 -> 155;
            case 51 -> 161;
            case 52 -> 218;
            case 53 -> 216;
            case 54 -> 42;
            case 55 -> 231;
            case 56 -> 90;
            case 57 -> 229;
            case 58 -> 233;
            case 59 -> 239;
            case 60 -> 207;
            case 61 -> 50;
            case 62 -> 215;
            case 63 -> 9;
            case 64 -> 0;
            case 65 -> 53;
            case 66 -> 117;
            case 67 -> 52;
            case 68 -> 16;
            case 69 -> 124;
            case 70 -> 83;
            case 71 -> 60;
            case 72 -> 114;
            case 73 -> 253;
            case 74 -> 115;
            case 75 -> 193;
            case 76 -> 35;
            case 77 -> 214;
            case 78 -> 240;
            case 79 -> 204;
            case 80 -> 95;
            case 81 -> 62;
            case 82 -> 59;
            case 83 -> 163;
            case 84 -> 195;
            case 85 -> 99;
            case 86 -> 77;
            case 87 -> 33;
            case 88 -> 151;
            case 89 -> 142;
            case 90 -> 147;
            case 91 -> 73;
            case 92 -> 119;
            case 93 -> 21;
            case 94 -> 2;
            case 95 -> 66;
            case 96 -> 78;
            case 97 -> 82;
            case 98 -> 243;
            case 99 -> 190;
            case 100 -> 39;
            case 101 -> 96;
            case 102 -> 98;
            case 103 -> 160;
            case 104 -> 168;
            case 105 -> 179;
            case 106 -> 203;
            case 107 -> 126;
            case 108 -> 248;
            case 109 -> 51;
            case 110 -> 100;
            case 111 -> 58;
            case 112 -> 43;
            case 113 -> 23;
            case 114 -> 186;
            case 115 -> 196;
            case 116 -> 122;
            case 117 -> 222;
            case 118 -> 140;
            case 119 -> 254;
            case 120 -> 184;
            case 121 -> 148;
            case 122 -> 57;
            case 123 -> 172;
            case 124 -> 113;
            case 125 -> 245;
            case 126 -> 247;
            case 127 -> 252;
            case 128 -> 17;
            case 129 -> 149;
            case 130 -> 225;
            case 131 -> 176;
            case 132 -> 32;
            case 133 -> 31;
            case 134 -> 79;
            case 135 -> 104;
            case 136 -> 84;
            case 137 -> 102;
            case 138 -> 28;
            case 139 -> 7;
            case 140 -> 37;
            case 141 -> 162;
            case 142 -> 202;
            case 143 -> 27;
            case 144 -> 232;
            case 145 -> 213;
            case 146 -> 228;
            case 147 -> 241;
            case 148 -> 20;
            case 149 -> 183;
            case 150 -> 137;
            case 151 -> 212;
            case 152 -> 171;
            case 153 -> 132;
            case 154 -> 46;
            case 155 -> 1;
            case 156 -> 238;
            case 157 -> 74;
            case 158 -> 134;
            case 159 -> 72;
            case 160 -> 167;
            case 161 -> 188;
            case 162 -> 174;
            case 163 -> 135;
            case 164 -> 156;
            case 165 -> 192;
            case 166 -> 6;
            case 167 -> 120;
            case 168 -> 205;
            case 169 -> 143;
            case 170 -> 54;
            case 171 -> 235;
            case 172 -> 181;
            case 173 -> 173;
            case 174 -> 88;
            case 175 -> 158;
            case 176 -> 198;
            case 177 -> 175;
            case 178 -> 166;
            case 179 -> 103;
            case 180 -> 139;
            case 181 -> 5;
            case 182 -> 146;
            case 183 -> 191;
            case 184 -> 220;
            case 185 -> 97;
            case 186 -> 255;
            case 187 -> 201;
            case 188 -> 145;
            case 189 -> 38;
            case 190 -> 249;
            case 191 -> 75;
            case 192 -> 187;
            case 193 -> 36;
            case 194 -> 67;
            case 195 -> 125;
            case 196 -> 130;
            case 197 -> 226;
            case 198 -> 221;
            case 199 -> 224;
            case 200 -> 251;
            case 201 -> 91;
            case 202 -> 209;
            case 203 -> 246;
            case 204 -> 41;
            case 205 -> 133;
            case 206 -> 185;
            case 207 -> 107;
            case 208 -> 47;
            case 209 -> 211;
            case 210 -> 152;
            case 211 -> 94;
            case 212 -> 85;
            case 213 -> 127;
            case 214 -> 22;
            case 215 -> 11;
            case 216 -> 29;
            case 217 -> 81;
            case 218 -> 144;
            case 219 -> 165;
            case 220 -> 223;
            case 221 -> 219;
            case 222 -> 89;
            case 223 -> 234;
            case 224 -> 154;
            case 225 -> 200;
            case 226 -> 45;
            case 227 -> 244;
            case 228 -> 206;
            case 229 -> 70;
            case 230 -> 68;
            case 231 -> 93;
            case 232 -> 164;
            case 233 -> 180;
            case 234 -> 13;
            case 235 -> 15;
            case 236 -> 106;
            case 237 -> 153;
            case 238 -> 159;
            case 239 -> 14;
            case 240 -> 101;
            case 241 -> 71;
            case 242 -> 25;
            case 243 -> 34;
            case 244 -> 30;
            case 245 -> 76;
            case 246 -> 236;
            case 247 -> 128;
            case 248 -> 49;
            case 249 -> 208;
            case 250 -> 157;
            case 251 -> 217;
            case 252 -> 19;
            case 253 -> 138;
            case 254 -> 111;
            default -> 63;
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
}
