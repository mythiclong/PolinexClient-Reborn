package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIIIIllIllIIIllIIIlIIllllllllllIIlIllIIIIlllIlIllIlllIIIIlIlIlIIllllIIlllIlllIIIlIIll {
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u00142]by,N95\u0019D1\u001aR(2W`\u0012\u00142]by,N95\u0019S8\u0019\u0006\u0013+\\i";
      int var5 = "\u00142]by,N95\u0019D1\u001aR(2W`\u0012\u00142]by,N95\u0019S8\u0019\u0006\u0013+\\i".length();
      char var2 = 18;
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 120;
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
                     case 0 -> 36;
                     case 1 -> 35;
                     case 2 -> 65;
                     case 3 -> 127;
                     case 4 -> 33;
                     case 5 -> 3;
                     default -> 94;
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
                        var0[0], var0[2], false
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        var0[1], var0[3], false
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

                  var3 = "aA8\u0019D5:W[3\fE|&U\u0015#\u0001R5\u0000gqw\u001e_|$W\u0015#\u0001R5+ZT#IUz0\u0012\\$IXe-\\\u001b<aA8\u0019D5:W[3\fE|&U\u0015#\u0001R5\u0000gqw\u001e_|$W\u0015#\u0001R58^T.\fE5$[F#I\u001fA)P\u001cw\u0000D5 WY3G";
                  var5 = "aA8\u0019D5:W[3\fE|&U\u0015#\u0001R5\u0000gqw\u001e_|$W\u0015#\u0001R5+ZT#IUz0\u0012\\$IXe-\\\u001b<aA8\u0019D5:W[3\fE|&U\u0015#\u0001R5\u0000gqw\u001e_|$W\u0015#\u0001R58^T.\fE5$[F#I\u001fA)P\u001cw\u0000D5 WY3G"
                     .length();
                  var2 = '3';
                  var8 = -1;
            }

            var10000 = 22;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
