package me.octo.client;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import me.octo.client.utils.JNIC;

public final class lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll {
   private lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll() {
   }

   @JNIC
   public static String a(String[] var0) {
      if (var0 != null && var0.length != 0) {
         Process var1 = null;

         String var13;
         try {
            ProcessBuilder var2 = new ProcessBuilder(var0);
            var2.redirectErrorStream(true);
            var1 = var2.start();
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            InputStream var4 = var1.getInputStream();
            byte[] var5 = new byte[4096];
            long var6 = System.currentTimeMillis() + 5000L;

            while (true) {
               while (var4.available() > 0) {
                  int var8 = var4.read(var5);
                  if (var8 < 0) {
                     break;
                  }

                  var3.write(var5, 0, var8);
               }

               try {
                  var1.exitValue();
                  break;
               } catch (IllegalThreadStateException var41) {
                  if (System.currentTimeMillis() > var6) {
                     var1.destroyForcibly();
                     break;
                  }

                  try {
                     Thread.sleep(10L);
                  } catch (InterruptedException var40) {
                     Thread.currentThread().interrupt();
                     var1.destroyForcibly();
                     break;
                  }
               }
            }

            while (var4.available() > 0) {
               int var11 = var4.read(var5);
               if (var11 < 0) {
                  break;
               }

               var3.write(var5, 0, var11);
            }

            String var12 = new String(var3.toByteArray(), StandardCharsets.UTF_8);
            return var12.trim();
         } catch (Throwable var42) {
            var13 = "";
         } finally {
            if (var1 != null) {
               try {
                  var1.getInputStream().close();
               } catch (Throwable var39) {
               }

               try {
                  var1.getErrorStream().close();
               } catch (Throwable var38) {
               }

               try {
                  var1.getOutputStream().close();
               } catch (Throwable var37) {
               }
            }
         }

         return var13;
      } else {
         return "";
      }
   }

   // PX-RESTORED $jnicLoader ()V - jar access 0x1009 (public static synthetic),
   // body from javap -c: 0: return  (JNIC loader stub)
   public static void $jnicLoader() {
   }

   // PX-RESTORED <clinit> ()V (jar: 6x nop + return = no-op initialiser)
   static {
   }
}
