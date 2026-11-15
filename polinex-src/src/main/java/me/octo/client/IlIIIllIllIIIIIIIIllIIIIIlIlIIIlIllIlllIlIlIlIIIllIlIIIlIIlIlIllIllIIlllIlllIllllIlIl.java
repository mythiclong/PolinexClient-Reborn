package me.octo.client;

import me.octo.client.events.impl.base.annotations.SubscribeEvent;

public class IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Vec3 p0, PXDyn p1) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T b(Vec3 p0, PXDyn p1) { return null; } // PX-FIX ovld

   public static <T> T d(Object p0, Object p1) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(Vec3 p0, String p1) { return null; } // PX-FIX ovld

   public static <T> T c(Object p0, Object p1) { return null; } // PX-FIX ovld

   private static String a;

   public IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var1) {
      this.a(a);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "\ri#BO\u0007i/,\u0019PB\u0018h#b:\u0011R\u001b'\u000be<\u0010".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 95;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      } else {
         var6 = 95;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 21;
            case 1 -> 83;
            case 2 -> 17;
            case 3 -> 110;
            case 4 -> 100;
            case 5 -> 55;
            default -> 88;
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
