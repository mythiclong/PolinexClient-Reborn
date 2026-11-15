package me.octo.client;

import kotlin.Unit;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class IlIIlllllIlIllIIIlIlllIIllIlIIIlIIlIIIIIllIlIIlllllllIIIllllIIIIIIIIlllIIlIlIllllllll {
   public static final IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll c() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   private static IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   private static final void a() {
      Minecraft.getInstance().setScreen(new IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI());
   }

   private static final Unit b() {
      Minecraft.getInstance().execute(IlIIlllllIlIllIIIlIlllIIllIlIIIlIIlIIIIIllIlIIlllllllIIIllllIIIIIIIIlllIIlIlIllllllll::a);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u000b+\u0017*/{s:!E\u000b,\u0016#5y&?,\u00188fhih\"\u0016>!y&!*Y)'\u007fnh7\u0015#2<.;,\u0018>#x&?-\r$fhn-d892s&\u000e+\u000b+#<g, \u0016\"o2\t\u000b+\u0017*/{s:!";
      int var5 = "\u000b+\u0017*/{s:!E\u000b,\u0016#5y&?,\u00188fhih\"\u0016>!y&!*Y)'\u007fnh7\u0015#2<.;,\u0018>#x&?-\r$fhn-d892s&\u000e+\u000b+#<g, \u0016\"o2\t\u000b+\u0017*/{s:!"
         .length();
      char var2 = '\t';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 54;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 54;
               var10006 = var6;
            } else {
               var13 = 54;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 54;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 126;
                  case 1 -> 114;
                  case 2 -> 79;
                  case 3 -> 122;
                  case 4 -> 112;
                  case 5 -> 42;
                  default -> 48;
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
         if ((var1 += var2) >= var5) { // PX-FIX jar 39-67: assignment block runs only after the final decoded chunk (67 goto 215)
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIIIlIlIIlIIIlllllIlIIIIllIIIIlIllIllllIIIllIlIIlIIIlllIIlIIIIIlIIIllIlIIIlIIlIlIll(
               var0[2], var0[1], var0[0], IlIIlllllIlIllIIIlIlllIIllIlIIIlIIlIIIIIllIlIIlllllllIIIllllIIIIIIIIlllIIlIlIllllllll::b
            );
            break pxClinit;
         }

         var2 = var3.charAt(var1);
      }
      }
   }
}
