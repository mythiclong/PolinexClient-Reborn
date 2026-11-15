package me.octo.client.utils.player;

import java.util.Collection;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

public final class lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI {
   public static int var5 = 0; // PX-FIX (retyped int) missing field v2
   
   @NotNull
   public static lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ArrayDeque<Long> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ArrayDeque<Long> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String a;

   private lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI() {
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl var1) {
      long var3;
      label16: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         Intrinsics.checkNotNullParameter(var1, a);
         var3 = System.currentTimeMillis();
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
         if (var2 != null) {
            if (!var1.k()) {
               break label16;
            }

            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.addLast(var3);
         }

         if (var2 != null) {
            return;
         }
      }

      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.addLast(var3);
   }

   public final int a() {
       int var5 = 0; // PX-FIX decl var5
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      long var2 = System.currentTimeMillis();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;

      while (true) {
         boolean var4;
         if (!((Collection)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).isEmpty()) {
            var4 = true;
            if (var1 != null) {
            }
         } else {
            var4 = false;
         }

         if (var4) {
            long var6;
            var5 = (var6 = var2 - ((Number)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.first()).longValue() - 1000L)
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
            if (var1 == null) {
               break;
            }

            if (var5 > 0) {
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.removeFirst();
               if (var1 != null) {
                  continue;
               }
            }
         }

         var5 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
         break;
      }

      return var5;
   }

   public final int b() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      long var2 = System.currentTimeMillis();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;

      while (true) {
         boolean var4;
         if (!((Collection)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl).isEmpty()) {
            var4 = true;
            if (var1 != null) {
            }
         } else {
            var4 = false;
         }

         if (var4) {
            long var6;
            var5 = (var6 = var2 - ((Number)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.first()).longValue() - 1000L)
                  == 0L
               ? 0
               : (var6 < 0L ? -1 : 1);
            if (var1 == null) {
               break;
            }

            if (var5 > 0) {
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.removeFirst();
               if (var1 != null) {
                  continue;
               }
            }
         }

         var5 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size();
         break;
      }

      return var5;
   }

   public final int c() {
      return this.a() + this.b();
   }

   public final void d() {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "W!KmT".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 124;
      char[] var10002 = var10003;
      int var1 = var10004;
      char[] var10;
      byte var14;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var10 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 124;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var14 = 78;
               break;
            case 1:
               var14 = 43;
               break;
            case 2:
               var14 = 82;
               break;
            case 3:
               var14 = 127;
               break;
            case 4:
               var14 = 92;
               break;
            case 5:
               var14 = 98;
               break;
            default:
               var14 = 29;
         }
      } else {
         var6 = 124;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayDeque(150);
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayDeque(150);
            break pxClinit; // PX-FIX
         }

         var10 = var10003;
         var10005 = var0;
         char var15 = var10003[var0];
         var10007 = 124;
         var10006 = var15;
         switch (var0 % 7) {
            case 0:
               var14 = 78;
               break;
            case 1:
               var14 = 43;
               break;
            case 2:
               var14 = 82;
               break;
            case 3:
               var14 = 127;
               break;
            case 4:
               var14 = 92;
               break;
            case 5:
               var14 = 98;
               break;
            default:
               var14 = 29;
         }
      }

      while (true) {
         var10[var10005] = (char)(var10006 ^ var10007 ^ var14);
         var0++;
         if (var6 == 0) {
            var10 = var10002;
            var10005 = var6;
            char var17 = var10002[var6];
            var10007 = var6;
            var10006 = var17;
            switch (var0 % 7) {
               case 0:
                  var14 = 78;
                  break;
               case 1:
                  var14 = 43;
                  break;
               case 2:
                  var14 = 82;
                  break;
               case 3:
                  var14 = 127;
                  break;
               case 4:
                  var14 = 92;
                  break;
               case 5:
                  var14 = 98;
                  break;
               default:
                  var14 = 29;
            }
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayDeque(150);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayDeque(150);
               break pxClinit; // PX-FIX
            }

            var10 = var10002;
            var10005 = var0;
            char var16 = var10002[var0];
            var10007 = var6;
            var10006 = var16;
            switch (var0 % 7) {
               case 0:
                  var14 = 78;
                  break;
               case 1:
                  var14 = 43;
                  break;
               case 2:
                  var14 = 82;
                  break;
               case 3:
                  var14 = 127;
                  break;
               case 4:
                  var14 = 92;
                  break;
               case 5:
                  var14 = 98;
                  break;
               default:
                  var14 = 29;
            }
         }
      }
   } // PX-FIX end pxClinit
   }
}
