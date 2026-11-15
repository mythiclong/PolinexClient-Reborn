package me.octo.client.events.impl;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket;
import org.jetbrains.annotations.NotNull;

public final class lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   extends me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2, Object p3) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0) { return null; } // PX-FIX ovld

   @NotNull
   private final ClientboundBlockDestructionPacket IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String c;

   public lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(@NotNull ClientboundBlockDestructionPacket var1) {
      Intrinsics.checkNotNullParameter(var1, c);
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   @NotNull
   public final ClientboundBlockDestructionPacket k() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "'\u0014\"rC3".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 66;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 66;
         var10006 = var0;
      } else {
         var6 = 66;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 66;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 21;
            case 1 -> 55;
            case 2 -> 3;
            case 3 -> 91;
            case 4 -> 100;
            case 5 -> 5;
            default -> 79;
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
