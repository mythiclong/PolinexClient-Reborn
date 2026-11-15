package me.octo.client;

import net.minecraft.world.phys.Vec3;

public final class IIllIIllIllIIIIlllIIlIIIIllIIlllllIIIIIllllIlIIlIIIIIIIIlllIIIIlIIIlIIIIlIIlIIlllIlII {
   private static final boolean a(Vec3 var0) {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var10000 = Double.isNaN(var0.x);
      if (var1 == 0) {
         if (!var10000) {
            var10000 = Double.isNaN(var0.y);
            if (var1 != 0) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Double.isNaN(var0.z);
               if (var1 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   private static final boolean b(Vec3 var0) {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var10000 = Double.isInfinite(var0.x);
      if (var1 == 0) {
         if (!var10000) {
            var10000 = Double.isInfinite(var0.y);
            if (var1 != 0) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Double.isInfinite(var0.z);
               if (var1 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }
}
