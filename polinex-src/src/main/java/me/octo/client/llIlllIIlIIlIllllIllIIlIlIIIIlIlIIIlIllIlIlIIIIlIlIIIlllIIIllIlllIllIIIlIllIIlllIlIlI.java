package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class llIlllIIlIIlIllllIllIIlIlIIIIlIlIIIlIllIlIlIIIIlIlIIIlllIIIllIlllIllIIIlIllIIlllIlIlI {
   // PX-FIX missing no-arg method
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   // PX-FIX missing no-arg method
   public static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
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
      String var3 = "\b>\fD!Oi87\u000eH>Yi97\u0011Q/N:j4\u0011H'\u001c$+9\nI-\u001c=\"7CD&U,$&CA/H*\"r\u0011B9S<81\u0006\u0007:]*!!CA8S$j>\fD+Pi% CW8U?+&\u0006\u0007$Y===\u0011Lj]-. \u0006T9Y:fr\nI)P<.;\r@jN,.;\u0011B)H:dc\u001a \u0006Q/R=9r\u0017U+R:&3\u0017B.\u001c:#5\r\u0007+R-j3\rQ#Pi>7\u001bSjZ;%?CB)T&#<\u0004\u0007'S-g!\u0013B)U/#1CS8]'9>\u0002S#S'j9\u0006^9\u001c++1\b\u0007>Si97\u0011Q/N:d";
      int var5 = "\b>\fD!Oi87\u000eH>Yi97\u0011Q/N:j4\u0011H'\u001c$+9\nI-\u001c=\"7CD&U,$&CA/H*\"r\u0011B9S<81\u0006\u0007:]*!!CA8S$j>\fD+Pi% CW8U?+&\u0006\u0007$Y===\u0011Lj]-. \u0006T9Y:fr\nI)P<.;\r@jN,.;\u0011B)H:dc\u001a \u0006Q/R=9r\u0017U+R:&3\u0017B.\u001c:#5\r\u0007+R-j3\rQ#Pi>7\u001bSjZ;%?CB)T&#<\u0004\u0007'S-g!\u0013B)U/#1CS8]'9>\u0002S#S'j9\u0006^9\u001c++1\b\u0007>Si97\u0011Q/N:d"
         .length();
      char var2 = 127;
      int var8 = -1;

      label53:
while (true) {
         byte var10000 = 80;
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
                     case 1 -> 2;
                     case 2 -> 51;
                     case 3 -> 119;
                     case 4 -> 26;
                     case 5 -> 108;
                     default -> 25;
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
                        var0[3], var0[1], true
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        var0[2], var0[0], true
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

                  var3 = "#\t,{\u000025\u0001\u000f\"|\u0016q\u0002D,,j\u000f2#\u000b\u000b#e\u000bs\u0003\u0017\u001c7\u001d#`\u0010{\u001d\u0001\\\u001e`\u0003|G%\u0012))%|\u0011\r\u0010m]\u0001j\u0013";
                  var5 = "#\t,{\u000025\u0001\u000f\"|\u0016q\u0002D,,j\u000f2#\u000b\u000b#e\u000bs\u0003\u0017\u001c7\u001d#`\u0010{\u001d\u0001\\\u001e`\u0003|G%\u0012))%|\u0011\r\u0010m]\u0001j\u0013"
                     .length();
                  var2 = 29;
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}
