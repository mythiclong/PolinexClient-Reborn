package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIlllIIIIIIllllllllllIIllllllllllIIlllIllIIlIIIlIIlIIIIlllllIIllIllllllllIlIlIlIlIIIl {
   public static final lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public static final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl b() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   private static lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var0 = new String[10];
      int var4 = 0;
      String var3 = "P=8+3\u0019pv\u0004Q.+ \u0007K6(+/\u0016q'Q=\"+>\f>v0+n)\u0011{px!(}\fvgx=\"<\u0001{px:!}\u000bjc*:`\u001dQ=\"+>\f>u0'-5Xmn97+/Xjmx=:<\nj,\u000bQ4/78\n>V1+<\tT7'*:\u0014qm5\u0006Q4/78\n";
      int var5 = "P=8+3\u0019pv\u0004Q.+ \u0007K6(+/\u0016q'Q=\"+>\f>v0+n)\u0011{px!(}\fvgx=\"<\u0001{px:!}\u000bjc*:`\u001dQ=\"+>\f>u0'-5Xmn97+/Xjmx=:<\nj,\u000bQ4/78\n>V1+<\tT7'*:\u0014qm5\u0006Q4/78\n"
         .length();
      char var2 = '\b';
      int var9 = -1;

      label53:
while (true) {
         byte var10000 = 126;
         String var10001 = var3.substring(++var9, var9 + var2);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 124;
                     case 1 -> 38;
                     case 2 -> 48;
                     case 3 -> 48;
                     case 4 -> 35;
                     case 5 -> 6;
                     default -> 96;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var31;
                  if ((var9 += var2) >= var5) {
                     String var25 = var0[7];
                     var31 = var0[4];
                     String[] var7 = new String[]{var0[0], var0[9], var0[1], var0[6], var0[8], var0[2]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
                        var25, var31, var7
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
                        var0[5], var0[3], 1, 5, 4, 0, 32, null
                     );
                     break label53;
                  }

                  var2 = var3.charAt(var9);
                  break;
               default:
                  var0[var4++] = var31;
                  if ((var9 += var2) < var5) {
                     var2 = var3.charAt(var9);
                     continue label53;
                  }

                  var3 = "n\u000f\u0016\u0004\u00102AP\r\u0015\u0002\th\u0007\u0002\u0011\r2UP\u0007";
                  var5 = "n\u000f\u0016\u0004\u00102AP\r\u0015\u0002\th\u0007\u0002\u0011\r2UP\u0007".length();
                  var2 = 11;
                  var9 = -1;
            }

            var10000 = 64;
            var10001 = var3.substring(++var9, var9 + var2);
            var10002 = 0;
         }
      }
   }
}
