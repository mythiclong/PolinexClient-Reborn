package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IlIllIIlIIIIlllllllIIIlllIlIIIIIIlIIllllllIIlIllIllIlllIllIlIIlIllIlIIlIllIIIIlIIIIlI {
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
      String var3 = "td\u0000\n49.e,\u000e\u0013pU1jNO\u000f{\u0002\u0010\u0007n\n\u0011{\u0002CpM<9:\u000etd\u0000\n4&\u0013Fo\n]V\u0014\u0011";
      int var5 = "td\u0000\n49.e,\u000e\u0013pU1jNO\u000f{\u0002\u0010\u0007n\n\u0011{\u0002CpM<9:\u000etd\u0000\n4&\u0013Fo\n]V\u0014\u0011".length();
      char var2 = '!';
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 53;
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
                     case 0 -> 18;
                     case 1 -> 57;
                     case 2 -> 90;
                     case 3 -> 72;
                     case 4 -> 33;
                     case 5 -> 64;
                     default -> 86;
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
                        var0[3], var0[0], true
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        var0[1], var0[2], true
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

                  var3 = "dt\u0010\u001a$\u0011\u001bR<,=E&6\u0017~\u001e\u001f$\u0004\u0007\u0017h\u0017\b$\u0007\u001cCh\u0010\u0000*\u0012dt\u0010\u001a$(\u001cBo\u001aMF\u0010\u0007Cs\u0011\u001e";
                  var5 = "dt\u0010\u001a$\u0011\u001bR<,=E&6\u0017~\u001e\u001f$\u0004\u0007\u0017h\u0017\b$\u0007\u001cCh\u0010\u0000*\u0012dt\u0010\u001a$(\u001cBo\u001aMF\u0010\u0007Cs\u0011\u001e"
                     .length();
                  var2 = '!';
                  var8 = -1;
            }

            var10000 = 37;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
