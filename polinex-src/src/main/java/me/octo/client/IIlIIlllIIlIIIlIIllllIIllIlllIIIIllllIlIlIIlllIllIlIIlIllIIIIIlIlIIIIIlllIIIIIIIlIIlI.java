package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IIlIIlllIIlIIIlIIllllIIllIlllIIIIllllIlIlIIlllIllIlIIlIllIIIIIlIlIIIIIlllIIIIIIIlIIlI {
   public static final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "0sy#9]c\u0014sr%<wg2`9d\u001df|6|w&\u001b~b0rj&\u0011|+>puj\u0011an0vwb\u000b<";
      int var5 = "0sy#9]c\u0014sr%<wg2`9d\u001df|6|w&\u001b~b0rj&\u0011|+>puj\u0011an0vwb\u000b<".length();
      char var2 = '\n';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 79;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 79;
               var10006 = var6;
            } else {
               var13 = 79;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 79;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 55;
                  case 1 -> 93;
                  case 2 -> 68;
                  case 3 -> 28;
                  case 4 -> 86;
                  case 5 -> 86;
                  default -> 73;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if (true) {   // PX-FIX: assignment block runs unconditionally (jar reaches it on the final decoded string)
            // Values recovered from the original jar at runtime (Probe6):
            var0[0] = "Harp Delay";
            var0[1] = "Delay between clicks in milliseconds.";
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
               var0[0], var0[1], 40, 150, 100, 5
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
