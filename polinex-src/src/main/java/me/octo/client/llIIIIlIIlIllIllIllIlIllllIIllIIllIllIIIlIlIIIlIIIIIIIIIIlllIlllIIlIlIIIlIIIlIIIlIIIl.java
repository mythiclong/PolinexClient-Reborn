package me.octo.client;

import com.google.gson.JsonElement;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public interface llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlII

   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   String a = "json"; // PXC golden: probe r1008 == original

   void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1);

   void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1);

   @NotNull
   default JsonElement a() {
      llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1 = new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
      this.a(var1);
      return var1.a();
   }

   default void a(@NotNull JsonElement var1) {
      Intrinsics.checkNotNullParameter(var1, a);
      llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var2 = llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1);
      this.b(var2);
   }

   // PX-FIX TOP3d2: kotlinc also emits the DefaultImpls static bridges INTO the interface itself (jar access 4105).
   // Jar body uses invokespecial/InterfaceMethod a:()Lcom/google/gson/JsonElement; - javac emits invokeinterface
   // for the same call from a static interface method; descriptors and members are otherwise identical.
   @NotNull
   public static JsonElement a(llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl var0) {
      return var0.a();
   }

   // PX-FIX TOP3d2: sibling bridge of the default a(JsonElement)V (jar access 4105).
   public static void a(llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl var0, @NotNull JsonElement var1) {
      var0.a(var1);
   }


   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static String a;

      @Deprecated
      @NotNull
      public static JsonElement a(@NotNull llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl var0) {
         return var0.a();
      }

      @Deprecated
      public static void a(@NotNull llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl var0, @NotNull JsonElement var1) {
         Intrinsics.checkNotNullParameter(var1, a);
         var0.a(var1);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
         char[] var10003 = "0cp\u0010".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 49;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10 = 0;
         char[] var10005 = null;
         int var10006 = 0;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 49;
            var10006 = var0;
         } else {
            var6 = 49;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit; // PX-FIX
            }

            var10005 = var10003;
            var10 = 49;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 107;
               case 1 -> 33;
               case 2 -> 46;
               case 3 -> 79;
               case 4 -> 19;
               case 5 -> 18;
               default -> 47;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit; // PX-FIX
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
   } // PX-FIX end pxClinit
      }
   }
}
