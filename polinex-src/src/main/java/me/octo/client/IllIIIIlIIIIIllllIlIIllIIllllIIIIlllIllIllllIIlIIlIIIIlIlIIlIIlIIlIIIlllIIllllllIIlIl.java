package me.octo.client;

import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

public interface IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl {
   String a = "UnknownAction"; // PXC golden: probe r1008 == original

   void a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1);

   default boolean a() {
      return false;
   }

   @NotNull
   default String b() {
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var1 != null) {
         String var10000 = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
         if (var10000 != null) {
            return var10000;
         }
      }

      return a;
   }

   public static boolean a(IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl arg0) {
      return arg0.a();
   }

   @NotNull
   public static String b(IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl arg0) {
      return arg0.b();
   }


   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Deprecated
      public static boolean a(@NotNull IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl var0) {
         return var0.a();
      }

      @Deprecated
      @NotNull
      public static String b(@NotNull IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl var0) {
         return var0.b();
      }
   }
}
