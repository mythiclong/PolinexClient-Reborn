package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public abstract class IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll<T extends IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl> {
   @NotNull
   private final T IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll<T>.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String a;

   public IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll(@NotNull T var1) {
      Intrinsics.checkNotNullParameter(var1, a);
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (T)var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();
   }

   public final int a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.M();
   }

   @NotNull
   public final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl b() {
      IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = new IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      boolean var3 = false;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var1);
      return var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "\u0012\u0014w\u0014dED\u0004\u001cj\u0016".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 25;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 25;
         var10006 = var0;
      } else {
         var6 = 25;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 25;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 105;
            case 1 -> 108;
            case 2 -> 29;
            case 3 -> 104;
            case 4 -> 46;
            case 5 -> 57;
            default -> 41;
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

   public static final boolean a(IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll var0) {
      return var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public static final void a(IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll var0, boolean var1) {
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public static final List b(IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll var0) {
      return var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      extends IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl {
      @NotNull
      private final T llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private static String f;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull T var2) {
         lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ap();
         Intrinsics.checkNotNullParameter(var2, f);
         super(var2.aa(), var2.ab(), var2.K(), var2.L(), var2.M(), 0, 32, null);
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = (T)var2;
         if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
               "vnvyec"
            );
         }
      }

      public int M() {
         Object pxThis0 = IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; // PX-FIX PhaseA this$0: JDK25 javac omits the synthetic field unless an instance method reads the enclosing instance
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.M();
      }

      public void g(int param1) {
         String var2 = me.octo.client.lIlIllIlIlllIIIlllllIlIIIlIIIIIIllllIlIllIIIlllIlIIlIlIllIlIIllIllllllIIIlIIIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.ap();
         if (var2 != null && !me.octo.client.IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.a(IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.this)) {
            try {
               me.octo.client.IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.a(IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.this, true);
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.g(param1);
               for (Object var6 : (Iterable)me.octo.client.IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.b(IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.this)) {
                  me.octo.client.IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = (me.octo.client.IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var6;
                  var7.l(param1);
                  if (var2 == null) {
                     break;
                  }
               }
            } finally {
               me.octo.client.IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.a(IIllIlIIIIIIIIIlIIlIllIlIIlllIlIlIlIIIIllllIIllllIIIllIlIlIlIIlIlllllIIIIIlllllIIIIll.this, false);
            }
         }
      }

      public boolean b() {
         return ((IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll)this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI)
            .b();
      }

      private final void l(int var1) {
         super.g(var1);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         char[] var10003 = "<04zC\u0019".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 46;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 46;
            var10006 = var0;
         } else {
            var6 = 46;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               f = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 46;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 97;
               case 1 -> 113;
               case 2 -> 111;
               case 3 -> 38;
               case 4 -> 14;
               case 5 -> 82;
               default -> 67;
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
