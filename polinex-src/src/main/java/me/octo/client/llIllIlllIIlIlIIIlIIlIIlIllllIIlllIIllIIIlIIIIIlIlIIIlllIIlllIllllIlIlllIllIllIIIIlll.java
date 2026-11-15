package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class llIllIlllIIlIlIIIlIIlIIlIllllIIlllIIllIIIlIIIIIlIlIIIlllIIlllIllllIlIlllIllIllIIIIlll {
   // PX-FIX PhaseA-RESe: exact jar getter (was a generic <T> T stub; jar body is getstatic+areturn)
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "r(iYF\b-\u001e&oOF\u0013.\u0013=uCA\b-\u0013%vD\u0003\u001b,Jdm_\u0012\u0012'F0:W\bZ)P0s@\u0003Z8R7i\u0012a!tS\u0011Z\u001f[!t\u0016#\u00028Z6\u007fR";
      int var5 = "r(iYF\b-\u001e&oOF\u0013.\u0013=uCA\b-\u0013%vD\u0003\u001b,Jdm_\u0012\u0012'F0:W\bZ)P0s@\u0003Z8R7i\u0012a!tS\u0011Z\u001f[!t\u0016#\u00028Z6\u007fR"
         .length();
      char var2 = '4';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 70;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 70;
               var10006 = var6;
            } else {
               var13 = 70;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 70;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 117;
                  case 1 -> 2;
                  case 2 -> 92;
                  case 3 -> 112;
                  case 4 -> 32;
                  case 5 -> 60;
                  default -> 14;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
               "Renew When Expired", "Also re-buy if you're already without an active pass", true
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
