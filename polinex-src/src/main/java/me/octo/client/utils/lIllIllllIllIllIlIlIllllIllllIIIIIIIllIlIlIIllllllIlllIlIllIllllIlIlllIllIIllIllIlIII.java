package me.octo.client.utils;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

final class lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII {
   public static lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static volatile byte[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   private lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII() {
   }

   public final byte[] a(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("encodedKey");
      } else {
         byte[] var2 = decodeKey(var1.trim());
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (byte[])var2.clone();
         return (byte[])var2.clone();
      }
   }

   public final byte[] a() {
      byte[] var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return var1 == null ? new byte[0] : (byte[])var1.clone();
   }

   public final byte[] b() {
      byte[] var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return var1 == null ? null : (byte[])var1.clone();
   }

   public final void c() {
      byte[] var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = null;
      if (var1 != null) {
         Arrays.fill(var1, (byte)0);
      }
   }

   static void $jnicClinit() {
      if (IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII();
      }
   }

   private static String a(int var0, int var1) {
      return "";
   }

   public static void $jnicLoader() {
   }

   private static byte[] decodeKey(String var0) {
      if (var0.isEmpty()) {
         return new byte[0];
      } else {
         String var1 = var0.replace(" ", "").replace(":", "").replace("-", "");
         if ((var1.length() & 1) == 0 && var1.matches("(?i)[0-9a-f]+")) {
            byte[] var2 = new byte[var1.length() / 2];

            for (int var3 = 0; var3 < var2.length; var3++) {
               int var4 = Character.digit(var1.charAt(var3 * 2), 16);
               int var5 = Character.digit(var1.charAt(var3 * 2 + 1), 16);
               var2[var3] = (byte)(var4 << 4 | var5);
            }

            return var2;
         } else {
            try {
               return Base64.getDecoder().decode(var0);
            } catch (IllegalArgumentException var7) {
               try {
                  return Base64.getUrlDecoder().decode(var0);
               } catch (IllegalArgumentException var6) {
                  return var0.getBytes(StandardCharsets.UTF_8);
               }
            }
         }
      }
   }

   static {
      $jnicClinit();
   }
}
