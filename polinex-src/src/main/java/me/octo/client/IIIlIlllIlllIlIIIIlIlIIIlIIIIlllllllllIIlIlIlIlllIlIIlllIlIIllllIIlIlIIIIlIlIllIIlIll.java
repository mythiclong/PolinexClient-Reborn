package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class IIIlIlllIlllIlIIIIlIlIIIlIIIIlllllllllIIlIlIlIlllIlIIlllIlIIllllIIlIlIIIIlIlIllIIlIll {
   @JvmField
   @NotNull
   public static lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "7D2S04v(E\nU.%3C;\u001a-%|\u000eE9\u001a*>.\u0015N.V?2kGR1O,q`\u0006F;\u001a)8z\u000f\u0005\u0004)B=Q";
      int var5 = "7D2S04v(E\nU.%3C;\u001a-%|\u000eE9\u001a*>.\u0015N.V?2kGR1O,q`\u0006F;\u001a)8z\u000f\u0005\u0004)B=Q".length();
      char var2 = '\f';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 116;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 116;
               var10006 = var6;
            } else {
               var13 = 116;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 116;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 19;
                  case 1 -> 95;
                  case 2 -> 42;
                  case 3 -> 78;
                  case 4 -> 42;
                  case 5 -> 37;
                  default -> 122;
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
            var0[2] = "Nick";   // recovered from the original jar at runtime
            var0[1] = "The string to replace your name with.";
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIlIIlIllIlIIlIlIIIIlllllIllllIIllIlIlIlllIIIIllIlIllIIllIlIlllIlIIIIlIIIIIIlllllII(
               var0[2], var0[1], var0[0]
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
