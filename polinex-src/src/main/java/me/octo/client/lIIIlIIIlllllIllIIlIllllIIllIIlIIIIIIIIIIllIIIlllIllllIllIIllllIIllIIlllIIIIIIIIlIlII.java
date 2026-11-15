package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIIIlIIIlllllIllIIlIllllIIllIIlIIIIIIIIIIllIIIlllIllllIllIIllllIIllIIlllIIIIIIIIlIlII {
   @NotNull
   public static lIIIlIIIlllllIllIIlIllllIIllIIlIIIIIIIIIIllIIIlllIllllIllIIllllIIllIIlllIIIIIIIIlIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   private lIIIlIIIlllllIllIIlIllllIIllIIlIIIIIIIIIIllIIIlllIllllIllIIllllIIllIIlllIIIIIIIIlIlII() {
   }

   @NotNull
   public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\\r\u0002s\u000eEq3Q\b7?7\\r\u000b*z@h`}\u0005??\u0004u{u\u0014s3B!js\u0012s9Eo4hG<4A!g}\u0017s\u001dH`pu\u00136zs`\u007fw\u0002!)\n";
      int var5 = "\\r\u0002s\u000eEq3Q\b7?7\\r\u000b*z@h`}\u0005??\u0004u{u\u0014s3B!js\u0012s9Eo4hG<4A!g}\u0017s\u001dH`pu\u00136zs`\u007fw\u0002!)\n"
         .length();
      char var2 = '\f';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 58;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 58;
               var10006 = var6;
            } else {
               var13 = 58;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 58;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 41;
                  case 1 -> 38;
                  case 2 -> 93;
                  case 3 -> 105;
                  case 4 -> 96;
                  case 5 -> 30;
                  default -> 59;
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
         if ((var1 += var2) >= var5) { // PX-FIX jar final-chunk test: construction only after the last decoded string
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIlIIIlllllIllIIlIllllIIllIIlIIIIIIIIIIllIIIlllIllllIllIIllllIIllIIlllIIIIIIIIlIlII();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
               var0[0], var0[1], true
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
