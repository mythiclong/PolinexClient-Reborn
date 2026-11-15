package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIlIllIlIlIlllIlllIIIlIlIlIlIlIIIlllIIllIIllIIlIIlIlIIlIlllllllIlIlIllllIIIlIIllIIllI {
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
      String var3 = "\u0007\u00145IL\u0019R'\u0018q_ZKP*\u000fqe{\u0019@=\u0012<\fKQCo\u000e2CM\\D \u001c#H\u0011\u000b\u0007\u00145I\u001fjC=\u000b4^";
      int var5 = "\u0007\u00145IL\u0019R'\u0018q_ZKP*\u000fqe{\u0019@=\u0012<\fKQCo\u000e2CM\\D \u001c#H\u0011\u000b\u0007\u00145I\u001fjC=\u000b4^".length();
      char var2 = '(';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 10;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 10;
               var10006 = var6;
            } else {
               var13 = 10;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 10;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 69;
                  case 1 -> 119;
                  case 2 -> 91;
                  case 3 -> 38;
                  case 4 -> 53;
                  case 5 -> 51;
                  default -> 44;
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
         if (var4 >= var0.length) {   // PX-FIX: construct only after both decoded strings are stored
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
               var0[1], var0[0], false
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
