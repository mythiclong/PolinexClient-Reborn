package me.octo.client;

import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI
   extends IIlIIIIlIIlIllllIlllIIIIIIIIIIlIIllllIIlllIIIIIlIllIIIIlIlIIIlIllIlIIIlllIllIIIIlIIIl {
   @NotNull
   public static IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String c;

   private IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI() {
      super(
         c,
         IIIlIIIIlIlllllllllIlIIllIIIIIIIIIIIIlllIIIlIllIIIlIllIllIIIllIIIIlllIlIlIIllIIIIlIIl.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
         false,
         false,
         8,
         null
      );
   }

   @Override
   public boolean c() {
      boolean var1 = lIlIlIllIIlIIlIIIIlIIlIIlIIIllIIIIllIllIIllIlllIIIlllIIIIIllIlllIIIIIIIlIIIIllIlIIlIl.e();
      Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (!var1) {
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            == null) {
            return false;
         }

         var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      return var10000.level != null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      char[] var10003 = "%'o0\u0012\u0004\u0012".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 51;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 51;
         var10006 = var0;
      } else {
         var6 = 51;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI();
            break pxClinit;
         }

         var10005 = var10003;
         var10 = 51;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 89;
            case 1 -> 97;
            case 2 -> 40;
            case 3 -> 111;
            case 4 -> 72;
            case 5 -> 89;
            default -> 68;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               c = var8;
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new IIIlllllllIlllIIIlIllllIIllIllllIlIlllIIlIlllIIIIlllllIlIIlIlIlIlIllIIIlllIIIIIllIIlI();
               break pxClinit;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
      }
   }
}
