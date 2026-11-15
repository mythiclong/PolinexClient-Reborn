package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llIlIIIIlIIlllIIlIIlllIlIIllllIIIIIlIllIIIIIlIlIllIIIlIIlIIIIIlIIIlIlllIIlIlIIlIlIIII {
   @NotNull
   private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static String a;

   public llIlIIIIlIIlllIIlIIlllIlIIllllIIIIIlIllIIIIIlIlIllIIIlIIlIIIIIlIIIlIlllIIlIlIIlIlIIII(@NotNull BlockPos var1) {
      Intrinsics.checkNotNullParameter(var1, a);
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @NotNull
   public final BlockPos a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final Vec3 b() {
      return me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
   }

   public final double c() {
      return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(this.b(), true);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      char[] var10003 = "\u000fIC".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 47;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 47;
         var10006 = var0;
      } else {
         var6 = 47;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit;
         }

         var10005 = var10003;
         var10 = 47;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 80;
            case 1 -> 9;
            case 2 -> 31;
            case 3 -> 67;
            case 4 -> 93;
            case 5 -> 51;
            default -> 48;
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
