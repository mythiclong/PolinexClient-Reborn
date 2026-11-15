package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIlIllIIlIIllIlIllllllllllIlIIlIIllIlIIIlIIlllIllIllIIlIIIlIIIlIlIllIlllIIllIIlIlllII {
   // PX-FIX PhaseA-RESe: exact jar getter (was a generic <T> T stub; jar body is getstatic+areturn)
   public static llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = ">e_Nj\u0017>e_Nj\u000f\b\u001b*u@q]\u001e]Y\\Tt\u000f\".Z";
      int var5 = ">e_Nj\u0017>e_Nj\u000f\b\u001b*u@q]\u001e]Y\\Tt\u000f\".Z".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 85;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 85;
               var10006 = var6;
            } else {
               var13 = 85;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 85;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 40;
                  case 1 -> 95;
                  case 2 -> 102;
                  case 3 -> 116;
                  case 4 -> 77;
                  case 5 -> 122;
                  default -> 50;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIIllIIlIlIlIIIllIlIllIIlIlllllIIlllllIIIlIllIlIIllllIlIIIIllIlIlIllIIlllIlIIlllII(
               var0[0], var0[1], -4978518
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
