package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lllIllIIllIIIlIllllllIlllIIllIlIllIlIllIIlIlIlIlllllIIllIIIIllIllIllIIlIllIIlIlIIIlIl {
   @NotNull
   public static lllIllIIllIIIlIllllllIlllIIllIlIllIlIllIIlIlIlIlllllIIllIIIIllIllIllIIlIllIIlIlIIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   private lllIllIIllIIIlIllllllIlllIIllIlIllIlIllIIlIlIlIlllllIIllIIIIllIllIllIIlIllIIlIlIIIlIl() {
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
      String var3 = "\u0017\u001b\u0013\u000bM}'+\u0014\u001d\u001e\b9:0\u001c\fR\u0004\u007fn!\u001a\nR\u000ex \u007f\u0001_\u001d\u0003|n,\u0014\u000fR\nv,4\u001c\u0011\u0001C\f\u0017\u001b\u001aR9x>x8\u0010\u0016\b";
      int var5 = "\u0017\u001b\u0013\u000bM}'+\u0014\u001d\u001e\b9:0\u001c\fR\u0004\u007fn!\u001a\nR\u000ex \u007f\u0001_\u001d\u0003|n,\u0014\u000fR\nv,4\u001c\u0011\u0001C\f\u0017\u001b\u001aR9x>x8\u0010\u0016\b"
         .length();
      char var2 = '/';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 22;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 22;
               var10006 = var6;
            } else {
               var13 = 22;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 22;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 78;
                  case 1 -> 99;
                  case 2 -> 105;
                  case 3 -> 100;
                  case 4 -> 123;
                  case 5 -> 15;
                  default -> 88;
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
         if ((var1 += var2) >= var5) { // PX-FIX jar 47 aastore / 55 if_icmpge 67 / 67 goto 215: construction runs only on the final decoded chunk
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIllIIllIIIlIllllllIlllIIllIlIllIlIllIIlIlIlIlllllIIllIIIIllIllIllIIlIllIIlIlIIIlIl();
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
               var0[1], var0[0], true
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
