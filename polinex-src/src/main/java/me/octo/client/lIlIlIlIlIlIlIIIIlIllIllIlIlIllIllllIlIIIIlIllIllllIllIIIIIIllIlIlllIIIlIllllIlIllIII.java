package me.octo.client;

import me.octo.client.events.impl.base.annotations.SubscribeEvent;

public class lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(HashMap<String,Object> p0) { return null; } // PX-FIX ovld

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII(Object... px) {
           this((String)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   private static String a;

   public lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var1) {
      this.a(a);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "~dA\u0003!\u0001\n\u007fe \u0003?\u0001k`\nB\r\"\u0007ax".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 56;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 56;
         var10006 = var0;
      } else {
         var6 = 56;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 56;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 19;
            case 1 -> 18;
            case 2 -> 56;
            case 3 -> 121;
            case 4 -> 85;
            case 5 -> 124;
            default -> 18;
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
