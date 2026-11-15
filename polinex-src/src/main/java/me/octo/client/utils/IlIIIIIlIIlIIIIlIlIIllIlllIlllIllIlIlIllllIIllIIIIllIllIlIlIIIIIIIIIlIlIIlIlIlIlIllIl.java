package me.octo.client.utils;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; } // PX-FIX ovld2
   private static String a;

   private static String a(byte[] var0) {
       String var8 = null; // PX-FIX decl var8
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.f();
      StringBuilder var2 = new StringBuilder(2 * var0.length);
      byte[] var3 = var0;
      int var4 = var0.length;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            byte var6 = var3[var5];
            String var7 = Integer.toHexString(255 & var6);
            if (var1 == null) {
               var8 = var7;
               if (var1 != null) {
                  break;
               }

               if (var7.length() == 1) {
                  var2.append('0');
               }

               var2.append(var7);
               var5++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var8 = var2.toString();
         break;
      }

      return var8;
   }

   public static long a(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance(a);
         return ByteBuffer.wrap(var1.digest(var0.getBytes(StandardCharsets.UTF_8))).getLong();
      } catch (NoSuchAlgorithmException var2) {
         return 0L;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String var8 = null; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var10003 = "~\u0019oK*He".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 2;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 2;
         var10006 = var0;
      } else {
         var6 = 2;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 2;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 47;
            case 1 -> 83;
            case 2 -> 44;
            case 3 -> 100;
            case 4 -> 26;
            case 5 -> 127;
            default -> 81;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
                var8 = new String(var10002).intern();
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
