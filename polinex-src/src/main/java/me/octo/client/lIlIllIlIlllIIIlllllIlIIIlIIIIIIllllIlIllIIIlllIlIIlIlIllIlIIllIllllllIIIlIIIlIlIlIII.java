package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII<T extends IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl> {
   @NotNull
   private final T IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII<T>.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String a;

   public lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII(@NotNull T var1) {
      Intrinsics.checkNotNullParameter(var1, a);
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (T)var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();
   }

   public final boolean a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ae();
   }

   @NotNull
   public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
      lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = new lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      boolean var3 = false;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var1);
      return var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "#\u007f9>4`\u00155w$<".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 81;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      } else {
         var6 = 81;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 16;
            case 1 -> 79;
            case 2 -> 27;
            case 3 -> 10;
            case 4 -> 54;
            case 5 -> 84;
            default -> 48;
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

   public static final boolean a(lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII var0) {
      return var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public static final void a(lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII var0, boolean var1) {
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public static final List b(lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII var0) {
      return var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      extends IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl {
      @NotNull
      private final T lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private final me.octo.client.lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII this$0;
      private static String IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private static String f;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull T var2) {
         Intrinsics.checkNotNullParameter(var2, f);
         super(var2.aa(), var2.ab());
         this.this$0 = me.octo.client.lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.this;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (T)var2;
      }

      public boolean ae() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.ae();
      }

       public void af() {
          if (lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.a(this.this$0)) return;
          lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.a(this.this$0, true);
          try {
             this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.af();
             for (lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 : (java.util.List<lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>) lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.b(this.this$0)) {
                var7.c(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.ae());
             }
          } finally {
             lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.a(this.this$0, false);
          }
       }

      public void b(boolean param1) {
         String var2 = this.ap();
         if (var2 != null && lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.a(this.this$0)) {
            return;
         }

         lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.a(this.this$0, true);
         try {
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b(param1);
            for (lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7
                 : (java.util.List<lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>) lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.b(this.this$0)) {
               var7.c(param1);
            }
         } finally {
            lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.a(this.this$0, false);
         }
      }

      private final void c(boolean var1) {
         super.b(var1);
      }

      public static void b(String var0) {
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var0;
      }

      public static String ap() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         if (ap() == null) {
            b("Hya3cb");
         }

         char[] var10003 = "SP!co\u007f".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 111;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 111;
            var10006 = var0;
         } else {
            var6 = 111;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               f = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 111;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 79;
               case 1 -> 80;
               case 2 -> 59;
               case 3 -> 126;
               case 4 -> 99;
               case 5 -> 117;
               default -> 29;
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
                  f = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
      }
}
   }
}
