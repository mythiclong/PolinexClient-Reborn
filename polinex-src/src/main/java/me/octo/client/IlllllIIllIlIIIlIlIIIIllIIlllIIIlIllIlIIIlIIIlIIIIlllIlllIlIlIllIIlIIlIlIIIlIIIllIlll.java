package me.octo.client;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll
   extends IIIIIIIIIllIIlllIlIllIIllllIIllIIlllIlIIIIIllIllIlIlIlIIIIIIIIlIllIIIllIlIIIlIlllIllI {
   public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

   int a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4);

   default boolean b() {
      return true;
   }

   default boolean c() {
      return false;
   }

   boolean a(@NotNull String var1);

   @Nullable
   default lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll f() {
      return null;
   }

   @NotNull
   IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g();

   @NotNull
   default IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return this.g();
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Deprecated
      public static boolean a(@NotNull IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0) {
         return var0.b();
      }

      @Deprecated
      public static boolean b(@NotNull IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0) {
         return var0.c();
      }

      @Deprecated
      @Nullable
      public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll c(
         @NotNull IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0
      ) {
         return var0.f();
      }

      @Deprecated
      @NotNull
      public static IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl d(
         @NotNull IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0
      ) {
         return var0.h();
      }
   }

   public static boolean a(IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0) {
      return var0.b();
   }

   public static boolean b(IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0) {
      return var0.c();
   }

   public static lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll c(IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0) {
      return var0.f();
   }

   public static IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl d(IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll var0) {
      return var0.h();
   }
}
