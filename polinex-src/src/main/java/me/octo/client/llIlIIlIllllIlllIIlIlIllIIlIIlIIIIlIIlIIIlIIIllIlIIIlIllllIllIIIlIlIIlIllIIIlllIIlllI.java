package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class llIlIIlIllllIlllIIlIlIllIIlIIlIIIIlIIlIIIlIIIllIlIIIlIllllIllIIIlIlIIlIllIIIlllIIlllI {
   // PX-FIX PhaseA-RESe: exact jar getter (was a generic <T> T stub; jar body is getstatic+areturn)
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "!pM\u000fk;pSYS\u0015idT\u00071<{P\u0003\"(q\u0005tR\u0019gib\u001bpRZa;z\u0000fT\u001bk;5\u001af\u001c\u0015litSCU\u0016n(r\u0016g\u001c4R\n;";
      int var5 = "!pM\u000fk;pSYS\u0015idT\u00071<{P\u0003\"(q\u0005tR\u0019gib\u001bpRZa;z\u0000fT\u001bk;5\u001af\u001c\u0015litSCU\u0016n(r\u0016g\u001c4R\n;"
         .length();
      char var2 = 15;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 61;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 61;
               var10006 = var6;
            } else {
               var13 = 61;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 61;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 78;
                  case 1 -> 40;
                  case 2 -> 1;
                  case 3 -> 71;
                  case 4 -> 63;
                  case 5 -> 116;
                  default -> 40;
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
         var1 += var2;
         if (var1 >= var5) {
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                  var0[0], var0[1], true
               );
               break pxClinit;
            }

         var2 = var3.charAt(var1);
      }
      }
   }
}
