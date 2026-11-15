package me.octo.client;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class lIlIIllIIIIlllllIIllIllllIIIlIllIlIllIIlIIlllIIllIIllIIlIIllIllIllIlIlIIIllllIlIlllll {
   @NotNull
   public static lIlIIllIIIIlllllIIllIllllIIIlIllIlIllIIlIIlllIIllIIllIIlIIllIllIllIlIlIIIllllIlIlllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   private lIlIIllIIIIlllllIIllIllllIIIlIllIlIllIIlIIlllIIllIIllIIlIIllIllIllIlIlIIIllllIlIlllll() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u001eR\u0018B]> 'H\u0005HAl\u0013>D\tU4\u0016I\u0018HB-!>_\rKC5u1U\u0014B\\l&8Q\t\u0007B-6%S\u001f\u0007N*!2NLNA80%N\u0019W[%:9OB\u0006\u0016X\bHA?";
      int var5 = "\u001eR\u0018B]> 'H\u0005HAl\u0013>D\tU4\u0016I\u0018HB-!>_\rKC5u1U\u0014B\\l&8Q\t\u0007B-6%S\u001f\u0007N*!2NLNA80%N\u0019W[%:9OB\u0006\u0016X\bHA?"
         .length();
      char var2 = 18;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 26;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 26;
               var10006 = var6;
            } else {
               var13 = 26;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 26;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 77;
                  case 1 -> 38;
                  case 2 -> 118;
                  case 3 -> 61;
                  case 4 -> 53;
                  case 5 -> 86;
                  default -> 79;
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
         var1 += var2;
         if (var1 >= var5) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIllIIIIlllllIIllIllllIIIlIllIlIllIIlIIlllIIllIIllIIlIIllIllIllIlIlIIIllllIlIlllll();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl(
                  var0[0],
                  var0[1],
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  var0[2],
                  true
               , new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]);
               break pxClinit;
            }

         var2 = var3.charAt(var1);
      }
      }
   }
}
