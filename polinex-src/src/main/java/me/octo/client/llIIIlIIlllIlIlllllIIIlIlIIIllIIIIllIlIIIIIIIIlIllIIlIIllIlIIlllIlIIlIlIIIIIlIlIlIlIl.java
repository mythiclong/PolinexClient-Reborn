package me.octo.client;

import org.jetbrains.annotations.NotNull;

public interface llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl
   extends IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   @Override
   default void a(char var1, int var2) {
   }

   @Deprecated
   public static void a(@NotNull llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var0) {
      var0.d();
   }

   @Deprecated
   public static void a(@NotNull llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var0, char var1, int var2) {
      var0.a(var1, var2);
   }

   @Deprecated
   public static boolean a(
      @NotNull llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6
   ) {
      return var0.a(var1, var2, var3, var4, var5, var6);
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      @Deprecated
      public static void a(@NotNull llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var0, char var1, int var2) {
         var0.a(var1, var2);
      }

      @Deprecated
      public static void a(@NotNull llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var0) {
         var0.d();
      }

      @Deprecated
      public static boolean a(
         @NotNull llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var0,
         int var1,
         int var2,
         int var3,
         int var4,
         int var5,
         int var6
      ) {
         return var0.a(var1, var2, var3, var4, var5, var6);
      }

      public static void b(boolean var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static boolean b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public static boolean c() {
         boolean var0 = b();
         return !var0;
      }

      static {
         if (c()) {
            b(true);
         }
      }
   }
}
