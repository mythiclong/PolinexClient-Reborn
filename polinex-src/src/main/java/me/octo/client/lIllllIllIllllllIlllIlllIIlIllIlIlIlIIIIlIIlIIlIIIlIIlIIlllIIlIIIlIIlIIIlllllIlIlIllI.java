package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class lIllllIllIllllllIlllIlllIIlIllIlIlIlIIIIlIIlIIlIIIlIIlIIlllIIlIIIlIIlIIIlllllIlIlIllI {
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   @NotNull
   public static final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = ">R\u0016h\u001f\u007f\u007f\u0007Z\u0012lKP~\u0012->R\u0016hL\u0019s\u001a[\u001cj\u001fZ\u007f\u0011R\u00008HQu\u001b\u0017\u0010wO@y\u001bPS{WXdUZ\u0016kLXw\u0010D]";
      int var5 = ">R\u0016h\u001f\u007f\u007f\u0007Z\u0012lKP~\u0012->R\u0016hL\u0019s\u001a[\u001cj\u001fZ\u007f\u0011R\u00008HQu\u001b\u0017\u0010wO@y\u001bPS{WXdUZ\u0016kLXw\u0010D]"
         .length();
      char var2 = 15;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 125;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 125;
               var10006 = var6;
            } else {
               var13 = 125;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 125;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 8;
                  case 1 -> 74;
                  case 2 -> 14;
                  case 3 -> 101;
                  case 4 -> 66;
                  case 5 -> 68;
                  default -> 109;
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
            var0[0] = "Keep Formatting";   // recovered from the original jar at runtime
            var0[1] = "Keeps color codes when copying chat messages.";
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
               var0[0], var0[1], false
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
