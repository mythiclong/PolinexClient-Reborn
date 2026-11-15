package me.octo.client;

import org.jetbrains.annotations.NotNull;

public final class IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII {
   @NotNull
   public static IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   private IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII() {
   }

   @NotNull
   public final IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl a() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll c() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "|6;\u0003\u0001\fD\\\".\b@mmV;!\u0005\u0014|6;\u0003\u0001\fD\\\".\b@Cn\u00199.\u0003\u0010_\ft'!\u0018\rYm\u0019*.\b\u0013";
      int var5 = "|6;\u0003\u0001\fD\\\".\b@mmV;!\u0005\u0014|6;\u0003\u0001\fD\\\".\b@Cn\u00199.\u0003\u0010_\ft'!\u0018\rYm\u0019*.\b\u0013".length();
      char var2 = 18;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 8;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            } else {
               var13 = 8;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 8;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 49;
                  case 1 -> 70;
                  case 2 -> 71;
                  case 3 -> 121;
                  case 4 -> 104;
                  case 5 -> 36;
                  default -> 8;
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
         if (var4 >= var0.length) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIIIlIlIIllllllIlIllIllIlIllIllIllIIIIIllllIIIIlllllIIlIIlIIlIIIIlllIIIllIIIIIIlIII();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl(
                  var0[2], 0, 14, 4, 0, 16, null
               );
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                  var0[1], true
               );
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lIIlIllIIllIIllllllIllllIIIIIIIllllIIllIIIIlllIllIIIIlIIlIlIllIlIlllIllIlIIIllIIllIll(
                  var0[0], 100, 2000, 400, 750, 0, 0, 96, null
               );
               break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}