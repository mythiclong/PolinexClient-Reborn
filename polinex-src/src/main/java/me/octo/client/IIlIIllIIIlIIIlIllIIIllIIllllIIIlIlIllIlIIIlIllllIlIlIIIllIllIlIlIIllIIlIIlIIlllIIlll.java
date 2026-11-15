package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public abstract class IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll<T extends lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll> {
   @NotNull
   private final T IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll<T>.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String a;

   public IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll(@NotNull T var1) {
      Intrinsics.checkNotNullParameter(var1, a);
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (T)var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();
   }

   public final int a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q();
   }

   public final int b() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R();
   }

   public final int c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.S();
   }

   @NotNull
   public final lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll d() {
      IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = new IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      boolean var3 = false;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var1);
      return var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "r\u001e\u001b\u001d\u001fhcd\u0016\u0006\u001f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 68;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 68;
         var10006 = var0;
      } else {
         var6 = 68;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 68;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 84;
            case 1 -> 59;
            case 2 -> 44;
            case 3 -> 60;
            case 4 -> 8;
            case 5 -> 73;
            default -> 83;
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

   public static final boolean a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll var0) {
      return var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public static final void a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll var0, boolean var1) {
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public static final List b(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll var0) {
      return var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      extends lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll {
      @NotNull
      private final T lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private static String f;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull T var2) {
         String var10000 = lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ap();
         Intrinsics.checkNotNullParameter(var2, f);
         String var3 = var10000;
         super(var2.aa(), var2.ab(), var2.O(), var2.P(), var2.Q(), var2.R(), var2.S(), 0, 128, null);
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = (T)var2;
         if (var3 == null) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
            );
         }
      }

      public int Q() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.Q();
      }

      public int R() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.R();
      }

      public int S() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.S();
      }

      public void h(int param1) {
         String var2 = me.octo.client.lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ap();
         if (var2 != null) {
           if (IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this)) {
             return;
           }
           IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this, true);
           this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.h(param1);
         }
         for (Object var6 : IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.b(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this)) {
           ((IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) var6).k(param1);
         }
         IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this, false);
      }

      public void i(int param1) {
         String var2 = lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ap();
         if (var2 != null && IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this)) {
            return;
         }

         IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this, true);
         try {
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.i(param1);
            for (IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7
                  : (java.util.List<IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>) IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.b(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this)) {
               var7.l(param1);
            }
         } finally {
            IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.a(IIlIIllIIIlIIIlIllIIIllIIllllIIIlIlIllIlIIIlIllllIlIlIIIllIllIlIlIIllIIlIIlIIlllIIlll.this, false);
         }
      }

      public boolean b() {
         return ((IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll)this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl)
            .b();
      }

      private final void k(int var1) {
         super.h(var1);
      }

      private final void l(int var1) {
         super.i(var1);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         char[] var10003 = "\u0014\u001dEF$C".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 60;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 60;
            var10006 = var0;
         } else {
            var6 = 60;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               f = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 60;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 91;
               case 1 -> 78;
               case 2 -> 12;
               case 3 -> 8;
               case 4 -> 123;
               case 5 -> 26;
               default -> 95;
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
