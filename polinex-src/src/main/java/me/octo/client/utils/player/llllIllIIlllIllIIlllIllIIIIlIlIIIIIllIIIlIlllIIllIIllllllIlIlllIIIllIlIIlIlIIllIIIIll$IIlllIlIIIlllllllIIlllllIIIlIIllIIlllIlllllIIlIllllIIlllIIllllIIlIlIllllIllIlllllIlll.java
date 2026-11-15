package me.octo.client.utils.player;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;

public final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<T>
   implements Comparator<T> {
   final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   
   
   public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
      BlockPos var1
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3;
      double var52;
      label99: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var4 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)var1;
         var3 = var10000;
         boolean var5 = false;
         if (var3 != null) {
            Vec3 var51 = var4.d();
            if (var51 != null) {
               Vec3 var6 = var51;
               boolean var7 = false;
               double var8 = var6.x - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getX();
               double var10 = var6.y - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getY();
               double var12 = var6.z - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getZ();
               double var14 = Math.abs(var8 - 0.5);
               double var16 = Math.abs(var10 - 0.5);
               double var18 = Math.abs(var12 - 0.5);
               double var20 = Math.max(var14, Math.max(var16, var18));
               double var64;
               int var53 = (var64 = var20 - var16) == 0.0 ? 0 : (var64 < 0.0 ? -1 : 1);
               if (var3 != null) {
                  var53 = (((var53 == 0) ? 1 : 0));
               }

               int var22 = var53;
               double var65;
               int var54 = (var65 = var20 - var14) == 0.0 ? 0 : (var65 < 0.0 ? -1 : 1);
               if (var3 != null) {
                  var54 = (((var54 == 0) ? 1 : 0));
               }

               if ((var54 != 0)) {
                  var52 = var16 * var16 + var18 * var18;
               } else {
                  double var66;
                  int var56 = (var66 = var20 - var16) == 0.0 ? 0 : (var66 < 0.0 ? -1 : 1);
                  if (var3 != null) {
                     var56 = (((var56 == 0) ? 1 : 0));
                  }

                  var52 =(( ((Double)(Object)(((var56 != 0 ? 1 : 0)!= 0) ? var14 * var14 + var18 * var18 : var14 * var14 + var16 * var16))));
               }

               double var23 = var52;
               double var25 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(
                  llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  var6,
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               );
               double var27 = Math.max(0.0, 0.24 - var25) * 18.0;
               double var29 =(( ((var22 != 0 ? 1 : 0)!= 0) ? 0.35 : 0.0));
               double var31 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.m().length - var4.e()) * 1.25;
               var52 = var31 + var23 + var27 + var29;
               break label99;
            }
         }

         var52 = Double.MAX_VALUE;
      }

      Comparable var57 = var52;
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var34 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid)var2;
      Comparable var33 = var57;
      boolean var35 = false;
      if (var3 != null) {
         Vec3 var58 = var34.d();
         if (var58 != null) {
            Vec3 var36 = var58;
            boolean var37 = false;
            double var38 = var36.x - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getX();
            double var39 = var36.y - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getY();
            double var40 = var36.z - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getZ();
            double var41 = Math.abs(var38 - 0.5);
            double var42 = Math.abs(var39 - 0.5);
            double var43 = Math.abs(var40 - 0.5);
            double var44 = Math.max(var41, Math.max(var42, var43));
            double var67;
            int var60 = (var67 = var44 - var42) == 0.0 ? 0 : (var67 < 0.0 ? -1 : 1);
            if (var3 != null) {
               var60 = (((var60 == 0) ? 1 : 0));
            }

            int var45 = var60;
            double var68;
            int var61 = (var68 = var44 - var41) == 0.0 ? 0 : (var68 < 0.0 ? -1 : 1);
            if (var3 != null) {
               var61 = (((var61 == 0) ? 1 : 0));
            }

            if ((var61 != 0)) {
               var52 = var42 * var42 + var43 * var43;
            } else {
               double var69;
               int var63 = (var69 = var44 - var42) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
               if (var3 != null) {
                  var63 = (((var63 == 0) ? 1 : 0));
               }

               var52 =(( ((Double)(Object)(((var63 != 0 ? 1 : 0)!= 0) ? var41 * var41 + var43 * var43 : var41 * var41 + var42 * var42))));
            }

            double var46 = var52;
            double var47 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(
               llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var36,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            double var48 = Math.max(0.0, 0.24 - var47) * 18.0;
            double var49 =(( ((var45 != 0 ? 1 : 0)!= 0) ? 0.35 : 0.0));
            double var50 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.m().length - var34.e()) * 1.25;
            return ComparisonsKt.compareValues(var33, var50 + var46 + var48 + var49);
         }
      }

      return ComparisonsKt.compareValues(var33, Double.MAX_VALUE);
   }
}
