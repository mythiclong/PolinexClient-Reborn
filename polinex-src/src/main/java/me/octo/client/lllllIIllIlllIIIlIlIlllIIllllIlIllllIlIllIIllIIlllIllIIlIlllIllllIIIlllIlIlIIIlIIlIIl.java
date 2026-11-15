package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lllllIIllIlllIIIlIlIlllIIllllIlIllllIlIllIIllIIlllIllIIlIlllIllllIIIlllIlIlIIIlIIlIIl {
   @NotNull
   public static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl b() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "^\u0003nl\t\u0010V*\u0007p)K\u001c^e\u0018f)J\u0011]i\u0001jgNYQlJaeF\u001aS*\u001dbz\t\u0018[~\u001fbeE\u0000\u0018g\u0003mlMYKo\u0018ul[TKc\u000ef\u000bO\u0012w{HY|o\u0006bp";
      int var5 = "^\u0003nl\t\u0010V*\u0007p)K\u001c^e\u0018f)J\u0011]i\u0001jgNYQlJaeF\u001aS*\u001dbz\t\u0018[~\u001fbeE\u0000\u0018g\u0003mlMYKo\u0018ul[TKc\u000ef\u000bO\u0012w{HY|o\u0006bp"
         .length();
      char var2 = 'B';
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 32;
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
                     case 0 -> 42;
                     case 1 -> 74;
                     case 2 -> 35;
                     case 3 -> 41;
                     case 4 -> 9;
                     case 5 -> 89;
                     default -> 24;
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
                        var0[1], var0[2], false
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
                        var0[3], var0[0], 50, 500, 200, 10
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

                  var3 = "3n\u000b\u00074% \u0013z\u001e\ful*[t\u001a\u0001\"`!\u00186\u001d\u0019:f/\u0005\u0010 w\u0013\u001c1d0\u001fy\u0011U\u0011`(\u0017o";
                  var5 = "3n\u000b\u00074% \u0013z\u001e\ful*[t\u001a\u0001\"`!\u00186\u001d\u0019:f/\u0005\u0010 w\u0013\u001c1d0\u001fy\u0011U\u0011`(\u0017o"
                     .length();
                  var2 = 29;
                  var8 = -1;
            }

            var10000 = 92;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
