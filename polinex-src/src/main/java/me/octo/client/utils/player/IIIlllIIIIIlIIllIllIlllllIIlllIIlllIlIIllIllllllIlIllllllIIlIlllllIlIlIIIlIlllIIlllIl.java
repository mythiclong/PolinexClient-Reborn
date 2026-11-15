package me.octo.client.utils.player;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public final class IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl {
   @NotNull
   public static IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl();
   private static float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   private IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl() {
   }

   public final float a(float var1) {
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   public final float b(float var1) {
      return 6.0F * var1 - 6.0F * var1 * var1;
   }

   public final float c(float var1) {
      return 1.0F - (1.0F - var1) * (1.0F - var1);
   }

   public final float d(float var1) {
      return 2.0F * (1.0F - var1);
   }

   public final float e(float var1) {
      return 1.0F - (float)Math.pow(1.0F - var1, 5);
   }

   public final float f(float var1) {
      return 5.0F * (float)Math.pow(1.0F - var1, 4);
   }

   public final float g(float var1) {
      return var1 * var1 * var1;
   }

   public final float h(float var1) {
      return var1 * var1;
   }

   public final float i(float var1) {
      return var1;
   }

   public final float j(float var1) {
      return (float)Math.pow(var1, 5);
   }

   public final float k(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var4;
      int var10000 = (var4 = var1 - 0.5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var10000 < 0) {
            return 2 * var1 * var1;
         }

         var10000 = 1;
      }

      return var10000 - (float)Math.pow(-2 * var1 + 2, 2) / 2;
   }

   public final float l(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var4;
      int var10000 = (var4 = var1 - 0.5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var10000 < 0) {
            return 4 * var1 * var1 * var1;
         }

         var10000 = 1;
      }

      return var10000 - (float)Math.pow(-2 * var1 + 2, 3) / 2;
   }

   @JvmStatic
   public static final float m(float var0) {
      return 1.0F - (float)Math.pow(1.0F - var0, 3);
   }

   public final float n(float var1) {
      return 3.0F * (float)Math.pow(1.0F - var1, 2);
   }

   public final float o(float var1) {
      return (float)Math.pow(var1, 4);
   }

   public final float p(float var1) {
      return 1 - (float)Math.pow(1 - var1, 4);
   }

   public final float q(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var4;
      int var10000 = (var4 = var1 - 0.5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var10000 < 0) {
            return 8 * (float)Math.pow(var1, 4);
         }

         var10000 = 1;
      }

      return var10000 - (float)Math.pow(-2 * var1 + 2, 4) / 2;
   }

   public final float r(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var4;
      int var10000 = (var4 = var1 - 0.5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var10000 < 0) {
            return 16 * (float)Math.pow(var1, 5);
         }

         var10000 = 1;
      }

      return var10000 - (float)Math.pow(-2 * var1 + 2, 5) / 2;
   }

   public final float s(float var1) {
      return 1 - (float)Math.cos(var1 * (float) (Math.PI / 2));
   }

   public final float t(float var1) {
      return (float)Math.sin(var1 * (float) (Math.PI / 2));
   }

   public final float u(float var1) {
      return (float) (Math.PI / 2) * (float)Math.cos(var1 * (float) (Math.PI / 2));
   }

   public final float v(float var1) {
      return -((float)Math.cos((float) Math.PI * var1) - 1) / 2;
   }

   public final float w(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var3;
      int var10000 = (var3 = var1 - 0.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      return (var10000 != 0) ? 0.0F : (float)Math.pow(2.0, 10 * var1 - 10);
   }

   public final float x(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var3;
      int var10000 = (var3 = var1 - 1.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      return (var10000 != 0) ? 1.0F : 1 - (float)Math.pow(2.0, -10 * var1);
   }

   public final float y(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var6;
      int var10000 = (var6 = var1 - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      float var3;
      if ((var10000 != 0)) {
         var3 = 0.0F;
      } else {
         float var7;
         var10000 = (var7 = var1 - 1.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
         if (var2 != null) {
            var10000 = (((var10000 == 0) ? 1 : 0));
         }

         if ((var10000 != 0)) {
            var3 = 1.0F;
         } else {
            float var8;
            var10000 = (var8 = var1 - 0.5F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
            if (var2 != null) {
               if (var10000 < 0) {
                  return (float)Math.pow(2.0, 20 * var1 - 10) / 2;
               }

               var10000 = 2;
            }

            var3 = (var10000 - (float)Math.pow(2.0, -20 * var1 + 10)) / 2;
         }
      }

      return var3;
   }

   public final float z(float var1) {
      return 1 - (float)Math.sqrt(1 - (float)Math.pow(var1, 2));
   }

   public final float A(float var1) {
      return (float)Math.sqrt(1 - (float)Math.pow(var1 - 1, 2));
   }

   public final float B(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var4;
      int var10000 = (var4 = var1 - 0.5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var10000 < 0) {
            return (1 - (float)Math.sqrt(1 - (float)Math.pow(2 * var1, 2))) / 2;
         }

         var10000 = 1;
      }

      return ((float)Math.sqrt(var10000 - (float)Math.pow(-2 * var1 + 2, 2)) + 1) / 2;
   }

   public final float C(float var1) {
      float var2 = 1.70158F;
      float var3 = var2 + 1;
      return var3 * (float)Math.pow(var1, 3) - var2 * (float)Math.pow(var1, 2);
   }

   public final float D(float var1) {
      float var2 = 1.70158F;
      float var3 = var2 + 1;
      return 1 + var3 * (float)Math.pow(var1 - 1, 3) + var2 * (float)Math.pow(var1 - 1, 2);
   }

   public final float E(float var1) {
      String var10000 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var3 = 1.70158F;
      String var2 = var10000;
      float var4 = var3 * 1.525F;
      float var7;
      int var5 = (var7 = var1 - 0.5F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var5 < 0) {
            return (float)Math.pow(2 * var1, 2) * ((var4 + 1) * 2 * var1 - var4) / 2;
         }

         var5 = 2;
      }

      return ((float)Math.pow(var5 * var1 - 2, 2) * ((var4 + 1) * (var1 * 2 - 2) + var4) + 2) / 2;
   }

   public final float F(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var5;
      int var10000 = (var5 = var1 - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      float var3;
      if ((var10000 != 0)) {
         var3 = 0.0F;
      } else {
         float var6;
         var10000 = (var6 = var1 - 1.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
         if (var2 != null) {
            var10000 = (((var10000 == 0) ? 1 : 0));
         }

         var3 =(( ((Float)(Object)(((var10000 != 0 ? 1 : 0)!= 0) ? 1.0F : -((float)Math.pow(2.0, 10 * var1 - 10)) * (float)Math.sin((var1 * 10 - 10.75F) * (float) (Math.PI * 2.0 / 3.0))))));
      }

      return var3;
   }

   public final float G(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var5;
      int var10000 = (var5 = var1 - 0.0F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      float var3;
      if ((var10000 != 0)) {
         var3 = 0.0F;
      } else {
         float var6;
         var10000 = (var6 = var1 - 1.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
         if (var2 != null) {
            var10000 = (((var10000 == 0) ? 1 : 0));
         }

         var3 =(( ((Float)(Object)(((var10000 != 0 ? 1 : 0)!= 0) ? 1.0F : (float)Math.pow(2.0, -10 * var1) * (float)Math.sin((var1 * 10 - 0.75F) * (float) (Math.PI * 2.0 / 3.0)) + 1))));
      }

      return var3;
   }

   public final float H(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var6;
      int var10000 = (var6 = var1 - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10000 = (((var10000 == 0) ? 1 : 0));
      }

      float var3;
      if ((var10000 != 0)) {
         var3 = 0.0F;
      } else {
         float var7;
         var10000 = (var7 = var1 - 1.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
         if (var2 != null) {
            var10000 = (((var10000 == 0) ? 1 : 0));
         }

         if ((var10000 != 0)) {
            var3 = 1.0F;
         } else {
            float var5 = var1;
            float var10001 = 0.5F;
            if (var2 != null) {
               if (var1 < 0.5F) {
                  return -((float)Math.pow(2.0, 20 * var1 - 10) * (float)Math.sin((20 * var1 - 11.125F) * (float) (Math.PI * 4.0 / 9.0))) / 2;
               }

               var5 = (float)Math.pow(2.0, -20 * var1 + 10) * (float)Math.sin((20 * var1 - 11.125F) * (float) (Math.PI * 4.0 / 9.0)) / 2;
               var10001 = 1;
            }

            var3 = var5 + var10001;
         }
      }

      return var3;
   }

   public final float I(float var1) {
      return 1 - this.J(1 - var1);
   }

   public final float J(float var1) {
      String var10000 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var3 = 7.5625F;
      String var2 = var10000;
      float var4 = 2.75F;
      float var8;
      int var5 = (var8 = var1 - 1.0F / var4) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var5 < 0) {
            return var3 * var1 * var1;
         }

         float var9;
         var5 = (var9 = var1 - 2.0F / var4) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      }

      if (var2 != null) {
         if (var5 < 0) {
            return var3 * (var1 - 1.5F / var4) * (var1 - 1.5F / var4) + 0.75F;
         }

         float var10001 = 2.5F / var4;
         if (var2 == null) {
            return var1 + var10001;
         }

         float var10;
         var5 = (var10 = var1 - var10001) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      }

      return var5 < 0 ? var3 * (var1 - 2.25F / var4) * (var1 - 2.25F / var4) + 0.9375F : var3 * (var1 - 2.625F / var4) * (var1 - 2.625F / var4) + 0.984375F;
   }

   public final float K(float var1) {
      String var2 = lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.h();
      float var4;
      int var10000 = (var4 = var1 - 0.5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var10000 < 0) {
            return (1 - this.J(1 - 2 * var1)) / 2;
         }

         var10000 = 1;
      }

      return (var10000 + this.J(2 * var1 - 1)) / 2;
   }

   public final float L(float var1) {
      float var2 = this.a(var1);
      return this.d(var2) * this.b(var1);
   }

   public final float M(float var1) {
      float var2 = this.a(var1);
      return this.n(var2) * this.b(var1);
   }

   public final float N(float var1) {
      float var2 = this.a(var1);
      return this.f(var2) * this.b(var1);
   }

   public final float O(float var1) {
      float var2 = this.a(var1);
      return this.u(var2) * this.b(var1);
   }

   public final float P(float var1) {
      return 4.0F * (float)Math.pow(1.0F - var1, 3);
   }

   public final float Q(float var1) {
      float var2 = this.a(var1);
      return this.P(var2) * this.b(var1);
   }
}
