package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IIIIlllIIlIIIlIIlIllllIllIIIIllIIIlIIIlIIlIllllIIIIIlIIIIIIIIllIlIlIIIllllllIlIIIllII {
   public static final lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public static final IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII b() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public static final IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII c() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   private static lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var0 = new String[9];
      int var4 = 0;
      String var3 = "blob\u0003\u0014glvy\n:S^e:x\u000f:Sblob\u0003q\n_lniI/\u001fXm}\u0005ajno\u000f\u0006glvy\n:\u000eblob\u0003\u007f\u0007^#J`\u0006&]\r\\lx\"\u00053\u0012Kf4d\u000e+";
      int var5 = "blob\u0003\u0014glvy\n:S^e:x\u000f:Sblob\u0003q\n_lniI/\u001fXm}\u0005ajno\u000f\u0006glvy\n:\u000eblob\u0003\u007f\u0007^#J`\u0006&]\r\\lx\"\u00053\u0012Kf4d\u000e+"
         .length();
      char var2 = 5;
      int var9 = -1;

      label53:
while (true) {
         byte var10000 = 109;
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
                     case 0 -> 92;
                     case 1 -> 110;
                     case 2 -> 119;
                     case 3 -> 97;
                     case 4 -> 10;
                     case 5 -> 50;
                     default -> 30;
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
                     String var25 = var0[0];
                     var31 = var0[5];
                     String[] var7 = new String[]{var0[8], var0[2], var0[6]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
                        var25, var31, var7
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII(
                        var0[4], var0[1], 0.0F, 1.0F, 1.0F, 0.1F, 0, 64, null
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIIIlIlIllllIIIllIllIIIIIlIIllIIIlIIIIllIlIIlIIIIIIIllIIIIIllIlIllIIIIIIlIlllllIII(
                        var0[3], var0[7], 0.0F, 2.0F, 1.0F, 0.1F, 0, 64, null
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

                  var3 = "6=98X(K\u0000t93U(w\t!#?\u001e\n\u00145#?_e\n\t&/";
                  var5 = "6=98X(K\u0000t93U(w\t!#?\u001e\n\u00145#?_e\n\t&/".length();
                  var2 = 19;
                  var9 = -1;
            }

            var10000 = 58;
            var10001 = var3.substring(++var9, var9 + var2);
            var10002 = 0;
         }
      }
   }
}
