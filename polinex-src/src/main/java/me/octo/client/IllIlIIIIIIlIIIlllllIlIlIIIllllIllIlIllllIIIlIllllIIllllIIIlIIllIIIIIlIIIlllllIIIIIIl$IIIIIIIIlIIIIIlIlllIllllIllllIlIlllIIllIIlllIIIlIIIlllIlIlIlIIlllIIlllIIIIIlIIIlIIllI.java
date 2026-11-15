package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.world.phys.Vec3;

public final class IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI<T>
   implements Comparator<T> {
   final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   public IllIlIIIIIIlIIIlllllIlIlIIIllllIllIlIllllIIIlIllllIIllllIIIlIIllIIIIIlIIIlllllIIIIIIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
      Vec3 var1
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      BlockPos var3 = (BlockPos)var1;
      Comparable var10000 = Double.valueOf(var3.distToCenterSqr((Position)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
      var3 = (BlockPos)var2;
      return ComparisonsKt.compareValues(var10000, Double.valueOf(var3.distToCenterSqr((Position)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)));
   }
}
