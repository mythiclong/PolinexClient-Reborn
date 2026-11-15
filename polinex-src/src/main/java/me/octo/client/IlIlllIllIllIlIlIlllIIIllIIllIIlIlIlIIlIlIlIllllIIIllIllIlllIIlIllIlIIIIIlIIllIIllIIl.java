package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IlIlllIllIllIlIlIlllIIIllIIllIIlIlIlIIlIlIlIllllIIIllIllIlllIIlIllIlIIIIIlIIllIIllIIl {
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
      String var3 = "nc\rX\u00062DI}\u0004R\u001d.\u000bD/\u0015XQ6\u000b]dA^\u001fa\u0002F}\u0012CQ1\u0001]|\u000eYQ7\rJxO\u0017(.\u0011]/\u0002V\u001c$\u0016N/\u0016^\u001d-D]`\u0015V\u0005$DFa\u0005R\u0001$\nKj\u000fC\u001d8DI}\u000eZQ8\u000bZ}AG\u001d \u001dJ}O\u0014}j\u0017R\u00032\u0001\u000fB\bS\u0015-\u0001\u0002L\r^\u0012*";
      int var5 = "nc\rX\u00062DI}\u0004R\u001d.\u000bD/\u0015XQ6\u000b]dA^\u001fa\u0002F}\u0012CQ1\u0001]|\u000eYQ7\rJxO\u0017(.\u0011]/\u0002V\u001c$\u0016N/\u0016^\u001d-D]`\u0015V\u0005$DFa\u0005R\u0001$\nKj\u000fC\u001d8DI}\u000eZQ8\u000bZ}AG\u001d \u001dJ}O\u0014}j\u0017R\u00032\u0001\u000fB\bS\u0015-\u0001\u0002L\r^\u0012*"
         .length();
      char var2 = 'e';
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 63;
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
                     case 0 -> 16;
                     case 1 -> 48;
                     case 2 -> 94;
                     case 3 -> 8;
                     case 4 -> 78;
                     case 5 -> 126;
                     default -> 91;
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
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        var0[3], var0[0], false
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

                  var3 = "b}\u001eCK\u00148s/[k\u0019>\u001bYz\u0014FK(\nTl\b\r\n8\n\\c\u001e\r\u00025^A}\u0012_\u000f{\u000ePg\bB\u0005w^]z\u0017IK6\u0017Qq\u0017HF8\u0012\\v\u0010\r\u001f4^Ap\u0016]\u0004)\u001fG|\u0017TK>\u0006\\a[Y\u0004{\u0018\\g\bYK+\u001bGf\u0014CE{)]p\u0015\r$\u0015D\u0015F\u000fL\u0012{\u0017[5\u001dD\u0019(\n\u0015e\u001e_\u00184\u0010\u00195\u0013B\u0007?^X|\u001fI\u0007>SVy\u0012N\u0000{\nZ5\u000fH\u0006+\u0011Gt\tD\u0007\"^P{\u001aO\u0007>^Sg\u001eH\u00074\u0011^5\u0012CK/\u0016\\g\u001f\r\u001b>\fFz\u0015\u0003\u0012ty\u0017B\u001c{8\\g\bYK\u000b\u001bGf\u0014C";
                  var5 = "b}\u001eCK\u00148s/[k\u0019>\u001bYz\u0014FK(\nTl\b\r\n8\n\\c\u001e\r\u00025^A}\u0012_\u000f{\u000ePg\bB\u0005w^]z\u0017IK6\u0017Qq\u0017HF8\u0012\\v\u0010\r\u001f4^Ap\u0016]\u0004)\u001fG|\u0017TK>\u0006\\a[Y\u0004{\u0018\\g\bYK+\u001bGf\u0014CE{)]p\u0015\r$\u0015D\u0015F\u000fL\u0012{\u0017[5\u001dD\u0019(\n\u0015e\u001e_\u00184\u0010\u00195\u0013B\u0007?^X|\u001fI\u0007>SVy\u0012N\u0000{\nZ5\u000fH\u0006+\u0011Gt\tD\u0007\"^P{\u001aO\u0007>^Sg\u001eH\u00074\u0011^5\u0012CK/\u0016\\g\u001f\r\u001b>\fFz\u0015\u0003\u0012ty\u0017B\u001c{8\\g\bYK\u000b\u001bGf\u0014C"
                     .length();
                  var2 = 200;
                  var8 = -1;
            }

            var10000 = 37;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
