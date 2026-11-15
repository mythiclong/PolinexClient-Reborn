package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIlIllIIIIllIIlllIlIIlllIlIllIlIIlIlIlIIIIlllIlIIIIIIllIlIlIllIlIllIIIllIlIllIIllllII {
   @NotNull
   public static lIlIllIIIIllIIlllIlIIlllIlIllIlIIlIlIlIIIIlllIlIIIIIIllIlIlIllIlIllIIIllIlIllIIllllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   private lIlIllIIIIllIIlllIlIIlllIlIllIlIIlIlIlIIIIlllIlIIIIIIllIlIlIllIlIllIIIllIlIllIIllllII() {
   }

   @NotNull
   public final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "u\u00109NU8sK\u00182SU9sJ\u00102J\u001086N\f2R\u0010#=\u001d\u00151QU8sM\u001c,@_8>\\\u0017=C\u001e\u000en\u001a?H^#=ZY,G^-6";
      int var5 = "u\u00109NU8sK\u00182SU9sJ\u00102J\u001086N\f2R\u0010#=\u001d\u00151QU8sM\u001c,@_8>\\\u0017=C\u001e\u000en\u001a?H^#=ZY,G^-6".length();
      char var2 = '/';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 78;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 78;
               var10006 = var6;
            } else {
               var13 = 78;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 78;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 115;
                  case 1 -> 55;
                  case 2 -> 16;
                  case 3 -> 104;
                  case 4 -> 126;
                  case 5 -> 4;
                  default -> 29;
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
         if (var4 >= var0.length) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIllIIIIllIIlllIlIIlllIlIllIlIIlIlIlIIIIlllIlIIIIIIllIlIlIllIlIllIIIllIlIllIIllllII();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
                  var0[1], var0[0], 10, 500, 100, 1
               );
               break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
