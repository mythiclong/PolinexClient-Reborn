package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IllIIllIIIIIIlIIllllllIIllIIIIIIlIlIlIlIlIlllllllIIIIlIIIIlIlIllIIIIllIllIIllIlIlllIl {
   @NotNull
   private static lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   @NotNull
   public static final lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "O\u001fx\u001bF\u0006M\u0015m\u001fSJ";
      int var5 = "O\u001fx\u001bF\u0006M\u0015m\u001fSJ".length();
      char var2 = 5;
      int var9 = -1;

      label53:
while (true) {
         byte var10000 = 17;
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
                     case 0 -> 18;
                     case 1 -> 107;
                     case 2 -> 14;
                     case 3 -> 99;
                     case 4 -> 35;
                     case 5 -> 55;
                     default -> 63;
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
                     String var25 = var0[3];
                     var31 = var0[2];
                     String[] var7 = new String[]{var0[1], var0[0]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
                        var25, var31, var7
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

                  var3 = "X\u0017{\u001fYZ\u0006r\u001db\b\u001a@S`\u0017eZWABn\\\nE\u0007|\u001fH\u000ekd\u0016r";
                  var5 = "X\u0017{\u001fYZ\u0006r\u001db\b\u001a@S`\u0017eZWABn\\\nE\u0007|\u001fH\u000ekd\u0016r".length();
                  var2 = 23;
                  var9 = -1;
            }

            var10000 = 25;
            var10001 = var3.substring(++var9, var9 + var2);
            var10002 = 0;
         }
      }
   }
}
