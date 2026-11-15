package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IlIIllIIIlIllIllIIIIlIllIlIlllllIlllIllIIIlIllllIIlllIIIllIIllllIlllIIIIIllIIIlIlIlIl {
   @NotNull
   public static IlIIllIIIlIllIllIIIIlIllIlIlllllIlllIllIIIlIllllIIlllIIIllIIllllIlllIIIIIllIIIlIlIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   private IlIIllIIIlIllIllIIIIlIllIlIlllllIlllIllIIIlIllllIIlllIIIllIIllllIlllIIIIIllIIIlIlIlIl() {
   }

   @NotNull
   public final llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "*4n>.&u\r4\u007f=\u0006&(t8`\u0013$9$|$k\u0018cK8u$|Tt\u0019(v=.\u0003x\u000e/:8zTy\u0018a\u007f<~\u0000iE";
      int var5 = "*4n>.&u\r4\u007f=\u0006&(t8`\u0013$9$|$k\u0018cK8u$|Tt\u0019(v=.\u0003x\u000e/:8zTy\u0018a\u007f<~\u0000iE".length();
      char var2 = 11;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 90;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 90;
               var10006 = var6;
            } else {
               var13 = 90;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 90;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 49;
                  case 1 -> 27;
                  case 2 -> 64;
                  case 3 -> 11;
                  case 4 -> 84;
                  case 5 -> 46;
                  default -> 74;
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
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIllIIIlIllIllIIIIlIllIlIlllllIlllIllIIIlIllllIIlllIIIllIIllllIlllIIIIIllIIIlIlIlIl();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl(
                  var0[0],
                  var0[2],
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  var0[1],
                  true
               , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
               break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
