package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIIIIIIIlllllIllIlIlIIIIllIlIllIllIIlllIlIllllIlIIIlIlIlIllIlllllllIlllIllIlIIIIIllII {
   // PX-FIX missing no-arg method
   public static final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl a() { // PX-FIX sig per jar (a:()LIllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;)
      return null;
   }

   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "-\u0017\u001e\f\tRA\u0007R\u001f\u001eP\u0013N\u001d\u0017\u0000M\u001d\u0007[\u0001\u0000\u001d\u0002\u001dR\\\u001c\u0000\u001c\u001eP\u0000M\rR\u0010\b\u0016\u001dZ\fR\u0010\u001f\u0015\u0013C\u0000\u001c\u0015C\u000b+\u0000\u0017\f\u001bRl\f\u001e\u0013\u0014";
      int var5 = "-\u0017\u001e\f\tRA\u0007R\u001f\u001eP\u0013N\u001d\u0017\u0000M\u001d\u0007[\u0001\u0000\u001d\u0002\u001dR\\\u001c\u0000\u001c\u001eP\u0000M\rR\u0010\b\u0016\u001dZ\fR\u0010\u001f\u0015\u0013C\u0000\u001c\u0015C\u000b+\u0000\u0017\f\u001bRl\f\u001e\u0013\u0014"
         .length();
      char var2 = '5';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 8;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            } else {
               var13 = 8;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 97;
                  case 1 -> 122;
                  case 2 -> 122;
                  case 3 -> 101;
                  case 4 -> 120;
                  case 5 -> 122;
                  default -> 32;
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
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
               var0[1], var0[0], 100, 1000, 300, 50
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
