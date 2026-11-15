package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIIIIlIlIlIllIllllIllIlIIIIIIlllIIlIIlIlIIlIlllllIIlIIlIllIIlIIIIIlIIIIllIlIlIllIllII {
   public static final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl c() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public static final lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public static final IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   private static float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var0 = new String[10];
      int var4 = 0;
      String var3 = "GW47\u0017M_ ::@QbN?::P_zP'\u007fnZU}\u0010\r]Q'>nZ_a\u001e\u00113oA\u001dMR&-:GBnW?\u007fvV^hJ;\u007fwF\\{W#3sVB!\u0006B[76o^\tFP':t@Y{G\u0007^K23sGI1GQ$\u007fwFSg\u001e0>wVBn\u001e!0nRDfQ=\u007fy\\^{L:=oGU|\u001e{z:\\V/X&3v\u001a\u001e";
      int var5 = "GW47\u0017M_ ::@QbN?::P_zP'\u007fnZU}\u0010\r]Q'>nZ_a\u001e\u00113oA\u001dMR&-:GBnW?\u007fvV^hJ;\u007fwF\\{W#3sVB!\u0006B[76o^\tFP':t@Y{G\u0007^K23sGI1GQ$\u007fwFSg\u001e0>wVBn\u001e!0nRDfQ=\u007fy\\^{L:=oGU|\u001e{z:\\V/X&3v\u001a\u001e"
         .length();
      char var2 = 4;
      int var9 = -1;

      label53:
while (true) {
         byte var10000 = 36;
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
                     case 0 -> 43;
                     case 1 -> 26;
                     case 2 -> 119;
                     case 3 -> 123;
                     case 4 -> 62;
                     case 5 -> 23;
                     default -> 20;
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
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII(
                        var0[5], var0[3], 0.0F, 5.0F, 1.0F, 0.1F, 0, 64, null
                     );
                     String var25 = var0[6];
                     var31 = var0[1];
                     String[] var7 = new String[]{var0[9], var0[4], var0[0], var0[8]};
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
                        var25, var31, 1, var7
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
                        var0[2], var0[7], 5, 50, 25, 0, 32, null
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

                  var3 = "3;ND\u0012\u0003*8M";
                  var5 = "3;ND\u0012\u0003*8M".length();
                  var2 = 5;
                  var9 = -1;
            }

            var10000 = 77;
            var10001 = var3.substring(++var9, var9 + var2);
            var10002 = 0;
         }
      }
   }
}
