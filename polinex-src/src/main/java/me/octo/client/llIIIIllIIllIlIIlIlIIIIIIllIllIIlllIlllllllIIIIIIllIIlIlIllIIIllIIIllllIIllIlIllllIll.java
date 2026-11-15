package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class llIIIIllIIllIlIIlIlIIIIIIllIllIIlllIlllllllIIIIIIllIIlIlIllIIIllIIIllllIIllIlIllllIll {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String a;

   public llIIIIllIIllIlIIlIlIIIIIIllIllIIlllIlllllllIIIIIIllIIlIlIllIIIllIIIllllIIllIlIllllIll() {
      Minecraft var10001 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var10001, a);
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      char[] var10003 = "-f_.[\u001c<+mH\u0002\u001dAfd*".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 115;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 115;
         var10006 = var0;
      } else {
         var6 = 115;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit;
         }

         var10005 = var10003;
         var10 = 115;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 57;
            case 1 -> 112;
            case 2 -> 88;
            case 3 -> 20;
            case 4 -> 70;
            case 5 -> 28;
            default -> 59;
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
               a = var8;
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
