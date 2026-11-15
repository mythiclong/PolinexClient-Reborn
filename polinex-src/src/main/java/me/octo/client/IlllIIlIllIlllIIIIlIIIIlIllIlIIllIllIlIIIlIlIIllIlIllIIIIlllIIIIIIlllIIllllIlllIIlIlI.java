package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class IlllIIlIllIlllIIIIlIIIIlIllIlIIllIllIlIIIlIlIIllIlIllIIIIlllIIIIIIlllIIllllIlllIIlIlI {
   @NotNull
   private final List<IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
   private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public final void a(@NotNull IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII var1) {
      short var10001 = -5898;
      short var10002 = 14893;
      Intrinsics.checkNotNullParameter(var1, "popup");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var1);
   }

   public final void a() {
      int[] var1 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
      if (var1 == null) {
         var10000 = !var10000;
      }

      if (var10000) {
         ((IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII)CollectionsKt.last(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            ))
            .d();
      }
   }

   public final void b() {
      Iterable var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var3 = false;
      int[] var10000 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      Iterator var4 = var2.iterator();
      int[] var1 = var10000;

      while (var4.hasNext()) {
         Object var5 = var4.next();
         IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII var6 = (IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII)var5;
         boolean var7 = false;
         var6.d();
         if (var1 == null && var1 == null) {
            continue;
         }
         break;
      }
   }

   public final boolean c() {
      int[] var1 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
      if (var1 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   @Nullable
   public final IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII d() {
      return (IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII)CollectionsKt.lastOrNull(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
   }

   private final void e() {
      int[] var1 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
         int var10000 = -5902;
         short var10001 = 21713;
         String var2 = "#version 330 core\nlayout (location = 0) in vec2 aPos;\nlayout (location = 1) in vec2 aTexCoord;\nout vec2 TexCoord;\n\nvoid main() {\n    gl_Position = vec4(aPos, 0.0, 1.0);\n    TexCoord = aTexCoord;\n}";
         var10000 = (short)-5899;
         var10001 = -28889;
         String var3 = "#version 330 core\nout vec4 FragColor;\nin vec2 TexCoord;\nuniform sampler2D image;\n\nvoid main() {\n    FragColor = texture(image, TexCoord);\n}";
         int var4 = GL20.glCreateShader(35633);
         GL20.glShaderSource(var4, var2);
         GL20.glCompileShader(var4);
         int var5 = GL20.glGetShaderi(var4, 35713);
         var10000 = var5;
         if (var1 == null) {
            if (var5 == 0) {
               String var15 = GL20.glGetShaderInfoLog(var4);
               short var10002 = -5903;
               short var10003 = -15231;
               Intrinsics.checkNotNullExpressionValue(var15, "glGetShaderInfoLog(...)");
               String var6 = var15;
               var10001 = -5890;
               var10002 = -16908;
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
                  "[PopupManager] Vertex shader compilation failed: " + var6
               );
            }

            var10000 = GL20.glCreateShader(35632);
         }

         int var11 = var10000;
         GL20.glShaderSource(var11, var3);
         GL20.glCompileShader(var11);
         int var7 = GL20.glGetShaderi(var11, 35713);
         var10000 = var7;
         if (var1 == null) {
            if (var7 == 0) {
               String var17 = GL20.glGetShaderInfoLog(var11);
               short var26 = -5901;
               short var31 = -16171;
               Intrinsics.checkNotNullExpressionValue(var17, "glGetShaderInfoLog(...)");
               String var8 = var17;
               var10001 = -5904;
               var26 = -23938;
               me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
                  "[PopupManager] Fragment shader compilation failed: " + var8
               );
            }

            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = GL20.glCreateProgram();
            GL20.glAttachShader(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var4);
            GL20.glAttachShader(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var11);
            GL20.glLinkProgram(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var10000 = GL20.glGetProgrami(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, 35714);
         }

         label31: {
            int var12 = var10000;
            var10000 = var12;
            if (var1 == null) {
               if (var12 == 0) {
                  String var19 = GL20.glGetProgramInfoLog(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                  short var28 = -5892;
                  short var32 = 14904;
                  Intrinsics.checkNotNullExpressionValue(var19, "glGetProgramInfoLog(...)");
                  String var9 = var19;
                  var10001 = -5889;
                  var28 = 2703;
                  me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
                     "[PopupManager] Program linking failed: " + var9
                  );
                  if (var1 == null) {
                     break label31;
                  }
               }

               var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var10001 = -5891;
            short var30 = -24014;
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
               "[PopupManager] Display shader program created successfully: " + var10000
            );
         }

         GL20.glDeleteShader(var4);
         GL20.glDeleteShader(var11);
         float[] var10 = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = GL30.glGenVertexArrays();
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = GL30.glGenBuffers();
         GL30.glBindVertexArray(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         GL30.glBindBuffer(34962, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         GL30.glBufferData(34962, var10, 35044);
         GL30.glVertexAttribPointer(0, 2, 5126, false, 16, 0L);
         GL30.glEnableVertexAttribArray(0);
         GL30.glVertexAttribPointer(1, 2, 5126, false, 16, 8L);
         GL30.glEnableVertexAttribArray(1);
         GL30.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      }
   }

   public final void a(float var1, float var2, float var3, float var4, float var5) {
      int[] var6 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      IlllIIlIllIlllIIIIlIIIIlIllIlIIllIllIlIIIlIlIIllIlIllIIIIlllIIIIIIlllIIllllIlllIIlIlI var10000 = this;
      if (var6 == null) {
         if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty()) {
            return;
         }

         var10000 = this;
      }

      var10000.e();
      Minecraft var20 = Minecraft.getInstance();
      short var10002 = -5900;
      short var10003 = 8191;
      Intrinsics.checkNotNullExpressionValue(var20, "getInstance(...)");
      Minecraft var7 = var20;
      float var8 = var7.getWindow().getWidth();
      float var9 = var7.getWindow().getHeight();
      int[] var10 = new int[4];
      GL11.glGetIntegerv(2978, var10);
      int var21 = var10[2];
      if (var6 == null) {
         var21 = var21 > 0 ? var10[2] : var7.getWindow().getWidth();
      }

      int var11 = var21;
      int var22 = var10[3];
      if (var6 == null) {
         var22 = var22 > 0 ? var10[3] : var7.getWindow().getHeight();
      }

      int var12 = var22;
      List var13 = new ArrayList();
      int var14 = 0;
      int var15 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();

      while (true) {
         if (var14 < var15) {
            IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII var16 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .get(var14);
            Float var17 = var16.e();
            if (var6 != null) {
               break;
            }

            label47: {
               if (var6 == null) {
                  if (var17 == null) {
                     var13.add(var16);
                     if (var6 == null) {
                        break label47;
                     }
                  }

                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.f();
               }

               float var18 = 13.0F * var17;
               int var19 = me.octo.client.utils.lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var11, var12, var18);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glEnable(3042);
               GL11.glBlendFunc(770, 771);
               GL20.glUseProgram(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
               short var10001 = -5897;
               var10002 = -1749;
               GL20.glUniform1i(
                  GL20.glGetUniformLocation(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "image"), 0
               );
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, var19);
               GL30.glBindVertexArray(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
               GL11.glDrawArrays(5, 0, 4);
               GL30.glBindVertexArray(0);
               GL20.glUseProgram(0);
               GL11.glBindTexture(3553, 0);
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var8,
                  var9,
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e()
               );
               var16.a(var1, var2, var3, var4, var5);
            }

            var14++;
            if (var6 == null) {
               continue;
            }
         }

         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.removeAll(var13);
         break;
      }
   }

   public final boolean a(float var1, float var2, float var3, float var4, int var5) {
      int[] var6 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      if (var6 == null) {
         IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII var10000 = this.d();
         if (var10000 != null) {
            return var10000.a(var1, var2, var3, var4, var5);
         }
      }

      return false;
   }

   public final boolean a(float var1, float var2, float var3, float var4, double var5, double var7) {
      int[] var9 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      if (var9 == null) {
         IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII var10000 = this.d();
         if (var10000 != null) {
            return var10000.a(var1, var2, var3, var4, var5, var7);
         }
      }

      return false;
   }

   public final boolean a(int var1, int var2, int var3) {
      int[] var4 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      if (var4 == null) {
         IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII var10000 = this.d();
         if (var10000 != null) {
            return var10000.a(var1, var2, var3);
         }
      }

      return false;
   }

   public final boolean a(char var1, int var2) {
      int[] var3 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      if (var3 == null) {
         IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII var10000 = this.d();
         if (var10000 != null) {
            return var10000.a(var1, var2);
         }
      }

      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[12];
      int var3 = 0;
      String var2 = "¨\u009f÷ÕÏP\u0001¸\t$A\u00066ìÍâ\u008b<ä¸ð\b²\\²\u0094Û#»è\r\u0098aé¼>P\u001e?ò»#/²>Î\u0095\u009f\u001a²ý\u0094â\u0096wAnµ79\u0080Á\u0099½\u008b>5bÿ\u001a¼½ZPÓ¥\u0019:\u0002\u0087\u0092þ\n\tÙt\u000fÓ§\u001f\u0006ãpvg[A\u000eÛ\u0005p¿U\u008e\u00891a*\u008erÁ\u009f³>2\rÿÞ\u000f\u0091C\u0013B\u0098¸&\u0010<)§Ùk ÊuÈt\u0004Ó\u0003x±\u0087\u0011°~\u0016à#wZµCÃË \u0005\u009a\u0083@!£\u0005N\rñ ³3\u0099£qø|è6Ìñ¨\\\u0098\u008b¨£\u0018?J\u0019\u0090âr\\Ð¤ó\u0011PÄ-l\\c\u0010±e\u0099\u0094\u0000\u0013lgá\u0094d÷\b&«ù\u0000\u0017\u0096Ë\u0003[\u001e\b~\u0097sÇRÝá\u0092>\t7%éø\u0011\u0014]Äe¨\u0093ym\u0083ð\u0094\u0001\u001f\u0091#¾\u001eR\u0003°ð\u0016ÍuU0A[_Ú\u0086\u0017\u008e\u0084S ¹\u0099g\u008a[úØÃ~Ò§\u0006\u0089\u009eçéF¢üK-  B\u008bv!\u0090\u000fum\u0091Sïë\u0091x^,Ò\u0088òß\u0014\u007f['\u008c\u009a\u0093S©§\u0000ô/\u007f\u008eÑ\u008a \u0015\u0092e\u008b\u0099@ou³xy\u00804\u00878\u0011\u000eë\b\"JßÈÓÐÐ\"BKÎü|\\E¸:Ùº\u0010Ú÷\u0092é,íA\u001a¸Ë\u009b~\u0014ä `ÒWØÀIô½-,\u0099v\u001aÇè}±-\r\u0087i1[\u0084Ê\u00197KÑlØØ\u0004(\u009b¼\u0095A?wB8±êvÿÕñ\u0017\u008c\u00ad@\u0097v\u0091s¤Ò¡f\u0011g\u000bî:-Cª4y\u008dP\u0018\u000b\u0017°Àhxªô³s:\u009aºÒ\u009f+\b.\u0006\u0096J\u001f1<<¶\u0018\u0094\u008fÀ\u0006¡\u0011\u0003\u0013\u0002ï@FÚÇ\u000báð´.À\u0015 HÝñ¼jÃ\u001c\u00887³9RË:|´\u001cäð\t\u009dn\u008deàÚË:e\u0099=ÚÞ~\u001d\u001f";
      int var4 = "¨\u009f÷ÕÏP\u0001¸\t$A\u00066ìÍâ\u008b<ä¸ð\b²\\²\u0094Û#»è\r\u0098aé¼>P\u001e?ò»#/²>Î\u0095\u009f\u001a²ý\u0094â\u0096wAnµ79\u0080Á\u0099½\u008b>5bÿ\u001a¼½ZPÓ¥\u0019:\u0002\u0087\u0092þ\n\tÙt\u000fÓ§\u001f\u0006ãpvg[A\u000eÛ\u0005p¿U\u008e\u00891a*\u008erÁ\u009f³>2\rÿÞ\u000f\u0091C\u0013B\u0098¸&\u0010<)§Ùk ÊuÈt\u0004Ó\u0003x±\u0087\u0011°~\u0016à#wZµCÃË \u0005\u009a\u0083@!£\u0005N\rñ ³3\u0099£qø|è6Ìñ¨\\\u0098\u008b¨£\u0018?J\u0019\u0090âr\\Ð¤ó\u0011PÄ-l\\c\u0010±e\u0099\u0094\u0000\u0013lgá\u0094d÷\b&«ù\u0000\u0017\u0096Ë\u0003[\u001e\b~\u0097sÇRÝá\u0092>\t7%éø\u0011\u0014]Äe¨\u0093ym\u0083ð\u0094\u0001\u001f\u0091#¾\u001eR\u0003°ð\u0016ÍuU0A[_Ú\u0086\u0017\u008e\u0084S ¹\u0099g\u008a[úØÃ~Ò§\u0006\u0089\u009eçéF¢üK-  B\u008bv!\u0090\u000fum\u0091Sïë\u0091x^,Ò\u0088òß\u0014\u007f['\u008c\u009a\u0093S©§\u0000ô/\u007f\u008eÑ\u008a \u0015\u0092e\u008b\u0099@ou³xy\u00804\u00878\u0011\u000eë\b\"JßÈÓÐÐ\"BKÎü|\\E¸:Ùº\u0010Ú÷\u0092é,íA\u001a¸Ë\u009b~\u0014ä `ÒWØÀIô½-,\u0099v\u001aÇè}±-\r\u0087i1[\u0084Ê\u00197KÑlØØ\u0004(\u009b¼\u0095A?wB8±êvÿÕñ\u0017\u008c\u00ad@\u0097v\u0091s¤Ò¡f\u0011g\u000bî:-Cª4y\u008dP\u0018\u000b\u0017°Àhxªô³s:\u009aºÒ\u009f+\b.\u0006\u0096J\u001f1<<¶\u0018\u0094\u008fÀ\u0006¡\u0011\u0003\u0013\u0002ï@FÚÇ\u000báð´.À\u0015 HÝñ¼jÃ\u001c\u00887³9RË:|´\u001cäð\t\u009dn\u008deàÚË:e\u0099=ÚÞ~\u001d\u001f"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 99;
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
                     case 0 -> 34;
                     case 1 -> 55;
                     case 2 -> 86;
                     case 3 -> 79;
                     case 4 -> 96;
                     case 5 -> 31;
                     default -> 44;
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
                     b = new String[12];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "[\u0092§P(s21ÿ\u0099\u00130ì3ÁõêxË!Z\u008d|nÛç$Ç-\u0094}ØvÅ}Ý\t\f\u009c\u0080FtÍ~\u000bÆÏ\\\u0090'\u0004\u0091L0U\u007f\u009d°\n©\u00ad6;ó;ë¢`$\u008bÏ`§3\u0091Âj3ev¼\u000bùÕ¿ÛA\u001bÈ";
                  var4 = "[\u0092§P(s21ÿ\u0099\u00130ì3ÁõêxË!Z\u008d|nÛç$Ç-\u0094}ØvÅ}Ý\t\f\u009c\u0080FtÍ~\u000bÆÏ\\\u0090'\u0004\u0091L0U\u007f\u009d°\n©\u00ad6;ó;ë¢`$\u008bÏ`§3\u0091Âj3ev¼\u000bùÕ¿ÛA\u001bÈ"
                     .length();
                  var1 = '1';
                  var8 = -1;
            }

            var10000 = 37;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -5900) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 88;
            case 1 -> 70;
            case 2 -> 213;
            case 3 -> 55;
            case 4 -> 191;
            case 5 -> 232;
            case 6 -> 241;
            case 7 -> 188;
            case 8 -> 108;
            case 9 -> 76;
            case 10 -> 37;
            case 11 -> 120;
            case 12 -> 217;
            case 13 -> 32;
            case 14 -> 189;
            case 15 -> 197;
            case 16 -> 44;
            case 17 -> 90;
            case 18 -> 101;
            case 19 -> 245;
            case 20 -> 3;
            case 21 -> 115;
            case 22 -> 150;
            case 23 -> 60;
            case 24 -> 109;
            case 25 -> 215;
            case 26 -> 123;
            case 27 -> 59;
            case 28 -> 190;
            case 29 -> 16;
            case 30 -> 62;
            case 31 -> 91;
            case 32 -> 121;
            case 33 -> 153;
            case 34 -> 75;
            case 35 -> 129;
            case 36 -> 202;
            case 37 -> 196;
            case 38 -> 106;
            case 39 -> 212;
            case 40 -> 172;
            case 41 -> 158;
            case 42 -> 31;
            case 43 -> 220;
            case 44 -> 169;
            case 45 -> 0;
            case 46 -> 125;
            case 47 -> 154;
            case 48 -> 36;
            case 49 -> 165;
            case 50 -> 255;
            case 51 -> 103;
            case 52 -> 30;
            case 53 -> 243;
            case 54 -> 162;
            case 55 -> 126;
            case 56 -> 127;
            case 57 -> 84;
            case 58 -> 219;
            case 59 -> 26;
            case 60 -> 12;
            case 61 -> 244;
            case 62 -> 164;
            case 63 -> 204;
            case 64 -> 136;
            case 65 -> 22;
            case 66 -> 254;
            case 67 -> 13;
            case 68 -> 23;
            case 69 -> 135;
            case 70 -> 41;
            case 71 -> 7;
            case 72 -> 19;
            case 73 -> 2;
            case 74 -> 11;
            case 75 -> 72;
            case 76 -> 144;
            case 77 -> 171;
            case 78 -> 155;
            case 79 -> 24;
            case 80 -> 223;
            case 81 -> 40;
            case 82 -> 82;
            case 83 -> 27;
            case 84 -> 128;
            case 85 -> 173;
            case 86 -> 181;
            case 87 -> 140;
            case 88 -> 141;
            case 89 -> 104;
            case 90 -> 235;
            case 91 -> 102;
            case 92 -> 237;
            case 93 -> 161;
            case 94 -> 186;
            case 95 -> 67;
            case 96 -> 114;
            case 97 -> 218;
            case 98 -> 187;
            case 99 -> 253;
            case 100 -> 118;
            case 101 -> 38;
            case 102 -> 35;
            case 103 -> 133;
            case 104 -> 250;
            case 105 -> 163;
            case 106 -> 234;
            case 107 -> 42;
            case 108 -> 119;
            case 109 -> 97;
            case 110 -> 105;
            case 111 -> 107;
            case 112 -> 143;
            case 113 -> 227;
            case 114 -> 145;
            case 115 -> 185;
            case 116 -> 210;
            case 117 -> 236;
            case 118 -> 180;
            case 119 -> 8;
            case 120 -> 231;
            case 121 -> 51;
            case 122 -> 63;
            case 123 -> 57;
            case 124 -> 6;
            case 125 -> 201;
            case 126 -> 198;
            case 127 -> 225;
            case 128 -> 247;
            case 129 -> 248;
            case 130 -> 184;
            case 131 -> 192;
            case 132 -> 39;
            case 133 -> 93;
            case 134 -> 177;
            case 135 -> 233;
            case 136 -> 228;
            case 137 -> 25;
            case 138 -> 208;
            case 139 -> 152;
            case 140 -> 50;
            case 141 -> 53;
            case 142 -> 157;
            case 143 -> 151;
            case 144 -> 69;
            case 145 -> 86;
            case 146 -> 21;
            case 147 -> 175;
            case 148 -> 71;
            case 149 -> 174;
            case 150 -> 230;
            case 151 -> 168;
            case 152 -> 224;
            case 153 -> 110;
            case 154 -> 77;
            case 155 -> 166;
            case 156 -> 238;
            case 157 -> 45;
            case 158 -> 28;
            case 159 -> 34;
            case 160 -> 112;
            case 161 -> 159;
            case 162 -> 148;
            case 163 -> 239;
            case 164 -> 9;
            case 165 -> 10;
            case 166 -> 179;
            case 167 -> 216;
            case 168 -> 156;
            case 169 -> 4;
            case 170 -> 160;
            case 171 -> 111;
            case 172 -> 242;
            case 173 -> 182;
            case 174 -> 1;
            case 175 -> 92;
            case 176 -> 73;
            case 177 -> 89;
            case 178 -> 65;
            case 179 -> 78;
            case 180 -> 207;
            case 181 -> 203;
            case 182 -> 138;
            case 183 -> 68;
            case 184 -> 117;
            case 185 -> 61;
            case 186 -> 200;
            case 187 -> 74;
            case 188 -> 48;
            case 189 -> 85;
            case 190 -> 176;
            case 191 -> 83;
            case 192 -> 100;
            case 193 -> 206;
            case 194 -> 170;
            case 195 -> 132;
            case 196 -> 46;
            case 197 -> 178;
            case 198 -> 139;
            case 199 -> 124;
            case 200 -> 98;
            case 201 -> 167;
            case 202 -> 52;
            case 203 -> 87;
            case 204 -> 252;
            case 205 -> 43;
            case 206 -> 246;
            case 207 -> 183;
            case 208 -> 47;
            case 209 -> 81;
            case 210 -> 193;
            case 211 -> 249;
            case 212 -> 211;
            case 213 -> 14;
            case 214 -> 131;
            case 215 -> 209;
            case 216 -> 251;
            case 217 -> 142;
            case 218 -> 18;
            case 219 -> 130;
            case 220 -> 5;
            case 221 -> 56;
            case 222 -> 20;
            case 223 -> 79;
            case 224 -> 15;
            case 225 -> 226;
            case 226 -> 58;
            case 227 -> 214;
            case 228 -> 149;
            case 229 -> 195;
            case 230 -> 96;
            case 231 -> 240;
            case 232 -> 64;
            case 233 -> 113;
            case 234 -> 49;
            case 235 -> 116;
            case 236 -> 66;
            case 237 -> 137;
            case 238 -> 80;
            case 239 -> 199;
            case 240 -> 122;
            case 241 -> 147;
            case 242 -> 205;
            case 243 -> 17;
            case 244 -> 94;
            case 245 -> 54;
            case 246 -> 95;
            case 247 -> 134;
            case 248 -> 194;
            case 249 -> 33;
            case 250 -> 221;
            case 251 -> 146;
            case 252 -> 229;
            case 253 -> 99;
            case 254 -> 29;
            default -> 222;
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
