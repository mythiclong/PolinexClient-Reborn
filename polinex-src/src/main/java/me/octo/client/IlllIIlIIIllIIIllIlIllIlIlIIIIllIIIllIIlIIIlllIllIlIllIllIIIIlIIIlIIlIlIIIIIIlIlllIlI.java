package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IlllIIlIIIllIIIllIlIllIlIlIIIIllIIIllIIlIIIlllIllIlIllIllIIIIlIIIlIIlIlIIIIIIlIlllIlI {
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "ZIK\u000fyB\u001b?yG\u0017nG\f\u001a[^FDx\u0006\fz_L\u0006~\u0006\u0016pEJ\u0002~\u0006\u0017kTE\u0010\"";
      int var5 = "ZIK\u000fyB\u001b?yG\u0017nG\f\u001a[^FDx\u0006\fz_L\u0006~\u0006\u0016pEJ\u0002~\u0006\u0017kTE\u0010\"".length();
      char var2 = 14;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 62;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 62;
               var10006 = var6;
            } else {
               var13 = 62;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 62;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 33;
                  case 1 -> 15;
                  case 2 -> 22;
                  case 3 -> 93;
                  case 4 -> 50;
                  case 5 -> 24;
                  default -> 64;
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
         if ((var1 += var2) >= var5) { // PX-FIX jar 47 aastore / 55 if_icmpge 67 / 67 goto 215 construction
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
               var0[0], var0[1], true
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
