package me.octo.client;

import org.jetbrains.annotations.NotNull;

public interface lIIlllllIIIllIIlllllIlllIIIllIIllIIlIlIIIIlllIllllIllllIlIIIIllIllIllIlIIIIllIlIllIll {
   float a();

   void a(float var1);

   float b();

   void b(float var1);

   float c();

   void c(float var1);

   float d();

   void d(float var1);

   void a(float var1, float var2, float var3);

   void e();

   default boolean a(float var1, float var2) {
      int[] var3 = IlIlIllIlIlllIllIlIIIIllIIIIIIIIlIlllllIlIlllIIIlIllIIIllIlIIlllllIllllIIllIllllIllII.f();
      float var4;
      int var10000 = (var4 = var1 - this.a()) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
      if (var3 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var5;
         var10000 = (var5 = var1 - (this.a() + this.c())) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 > 0) {
            return (0 != 0);
         }

         float var6;
         var10000 = (var6 = var2 - this.b()) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var7;
         var10000 = (var7 = var2 - (this.b() + this.d())) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      if (var3 != null) {
         return (var10000 != 0);
      } else {
         return (var10000 <= 0);
      }
   }

   default boolean a(float var1, float var2, int var3) {
      return false;
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Deprecated
      public static boolean a(@NotNull lIIlllllIIIllIIlllllIlllIIIllIIllIIlIlIIIIlllIllllIllllIlIIIIllIllIllIlIIIIllIlIllIll var0, float var1, float var2) {
         return var0.a(var1, var2);
      }

      @Deprecated
      public static boolean a(
         @NotNull lIIlllllIIIllIIlllllIlllIIIllIIllIIlIlIIIIlllIllllIllllIlIIIIllIllIllIlIIIIllIlIllIll var0, float var1, float var2, int var3
      ) {
         return var0.a(var1, var2, var3);
      }
   }

   public static boolean a(me.octo.client.lIIlllllIIIllIIlllllIlllIIIllIIllIIlIlIIIIlllIllllIllllIlIIIIllIllIllIlIIIIllIlIllIll p1, float p2, float p3) {
      return p1.a(p2, p3);
   }
   public static boolean a(me.octo.client.lIIlllllIIIllIIlllllIlllIIIllIIllIIlIlIIIIlllIllllIllllIlIIIIllIllIllIlIIIIllIlIllIll p1, float p2, float p3, int p4) {
      return p1.a(p2, p3, p4);
   }
}
