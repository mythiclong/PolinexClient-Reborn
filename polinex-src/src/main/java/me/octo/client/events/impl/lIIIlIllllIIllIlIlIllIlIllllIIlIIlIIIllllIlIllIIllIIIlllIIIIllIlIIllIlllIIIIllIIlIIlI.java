package me.octo.client.events.impl;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import org.jetbrains.annotations.NotNull;

@me.octo.client.events.impl.base.annotations.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
public final class lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   private final ClientboundLevelParticlesPacket IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String c;

   public lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI(@NotNull ClientboundLevelParticlesPacket var1) {
      Intrinsics.checkNotNullParameter(var1, c);
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   @NotNull
   public final ClientboundLevelParticlesPacket k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "FUG298".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 44;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 44;
         var10006 = var0;
      } else {
         var6 = 44;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 44;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 26;
            case 1 -> 24;
            case 2 -> 8;
            case 3 -> 117;
            case 4 -> 112;
            case 5 -> 96;
            default -> 78;
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
               break pxClinit; // PX-FIX
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   } // PX-FIX end pxClinit
   }
}
