package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IIlIlllIIlIllIIlIllIlIIllIIlIIlIllIIIIlIIlIIllIllllIllIIIlllIlIlIlIllIIIllIllIllIIIIl {
   // PX-FIX missing no-arg method
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // PX-FIX missing no-arg method
   public static lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u001cNflnsW+\u0007aei?_7C`ai?]6\u0007Bb~sVxd}lbxWv\u0011\u001bK|ngl\u0012\bBg-_zQ7Iq";
      int var5 = "\u001cNflnsW+\u0007aei?_7C`ai?]6\u0007Bb~sVxd}lbxWv\u0011\u001bK|ngl\u0012\bBg-_zQ7Iq".length();
      char var2 = '$';
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 66;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 26;
                     case 1 -> 101;
                     case 2 -> 87;
                     case 3 -> 79;
                     case 4 -> 78;
                     case 5 -> 93;
                     default -> 112;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var29;
                  if ((var8 += var2) >= var5) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        var0[2], var0[0], true
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll(
                        var0[1], var0[3], 8, 20, 12, 16, 1, 0, 128, null
                     );
                     break label53;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var29;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label53;
                  }

                  var3 = "\u0019KcikvR}M~(^uE1F0Ka{Y:G2\u0015Mg(d{Y$\u0002dad\u007fD}Ruz)iR>M~l)n_8\u0002}gmo[8\u0002c`fo[9\u0002sd`y\\s";
                  var5 = "\u0019KcikvR}M~(^uE1F0Ka{Y:G2\u0015Mg(d{Y$\u0002dad\u007fD}Ruz)iR>M~l)n_8\u0002}gmo[8\u0002c`fo[9\u0002sd`y\\s".length();
                  var2 = 23;
                  var8 = -1;
            }

            var10000 = 71;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
