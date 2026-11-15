package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IIlllllIlIlIlIIIIIlllIIlIlIlllIIIIlIllIlIIlIlIllIIlllIIIIllIIlllIIlIlIIIlIlIlIlIlllIl {
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   @NotNull
   public static final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "t/\u0003W\u0019X+C.\u0000\u001e\u000fLnT.\u000b\u0012J\\!\u0000%\u0003W\u0019M:\u000e\u0004t.\u000b\u0012";
      int var5 = "t/\u0003W\u0019X+C.\u0000\u001e\u000fLnT.\u000b\u0012J\\!\u0000%\u0003W\u0019M:\u000e\u0004t.\u000b\u0012".length();
      char var2 = 29;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 53;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            } else {
               var13 = 53;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 53;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 21;
                  case 1 -> 114;
                  case 2 -> 83;
                  case 3 -> 66;
                  case 4 -> 95;
                  case 5 -> 29;
                  default -> 123;
               });
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if (true) {   // PX-FIX: assignment block runs unconditionally (jar reaches it on the final decoded string)
            var0[1] = "Time";   // recovered from the original jar at runtime
            var0[0] = "The specified time to be set.";
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
               var0[1], var0[0], 0, 200, 200, 10
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
