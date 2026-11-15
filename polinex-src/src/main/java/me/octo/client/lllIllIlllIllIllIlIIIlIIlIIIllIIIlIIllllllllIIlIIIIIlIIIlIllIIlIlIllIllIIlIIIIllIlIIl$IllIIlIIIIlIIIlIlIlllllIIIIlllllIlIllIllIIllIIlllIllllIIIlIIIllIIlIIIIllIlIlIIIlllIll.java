package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.core.Position;
import net.minecraft.world.phys.Vec3;

public final class lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll<T>
   implements Comparator<T> {
   final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   public lllIllIlllIllIllIlIIIlIIlIIIllIIIlIIllllllllIIlIIIIIlIIIlIllIIlIlIllIllIIlIIIIllIlIIl$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
      Vec3 var1
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll var3 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)var1;
      Comparable var10000 = Double.valueOf(var3.a().distToCenterSqr((Position)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
      var3 = (lllIlIIlIlIlIlIIllIllIIlllIIlIlIIIlIIllllIlIIlllIIlIIIlIIllIIlllIIllIIIlllllIlIIlIlll)var2;
      return ComparisonsKt.compareValues(
         var10000, Double.valueOf(var3.a().distToCenterSqr((Position)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl))
      );
   }
}
