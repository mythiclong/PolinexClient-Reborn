package me.octo.client.utils;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.state.BlockState;

public final class llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll
   extends llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI {
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllI

   @Override
   public boolean a(int var1, int var2, int var3) {
      Object var10 = null; // PX-FIX
      int var10000 = llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.c();
      BlockPos var5 = new BlockPos(var1, var2, var3);
      int var4 = var10000;
      if (var4 != 0) {
         ClientLevel var8 = this.b();
         if (var8 != null) {
            BlockState var9 = var8.getBlockState(var5);
            if (var9 != null) {
               BlockState var6 = var9;
               var10 = var6.is(BlockTags.STAIRS);
               label49:
               if (var4 != 0) {
                  if (!((Boolean)var10)) {
                     var10 = var6.is(BlockTags.WALLS);
                     if (var4 == 0) {
                        break label49;
                     }

                     if (!((Boolean)var10)) {
                        var10 = var6.is(BlockTags.FENCES);
                        if (var4 == 0) {
                           break label49;
                        }

                        if (!((Boolean)var10)) {
                           var10 = false;
                           break label49;
                        }
                     }
                  }

                  var10 = true;
               }

               boolean var7 =((Boolean)( var10));
               boolean var11 = var7;
               if (var4 != 0) {
                  if (!var7) {
                     label34: {
                        ClientLevel var12 = this.b();
                        if (var12 != null) {
                           BlockState var13 = var12.getBlockState(var5);
                           if (var13 != null) {
                              var11 = var13.isSolidRender();
                              break label34;
                           }
                        }

                        var11 = false;
                     }

                     if (!var11) {
                        return false;
                     }
                  }

                  var11 = true;
               }

               return var11;
            }
         }
      }

      return false;
   }
}
