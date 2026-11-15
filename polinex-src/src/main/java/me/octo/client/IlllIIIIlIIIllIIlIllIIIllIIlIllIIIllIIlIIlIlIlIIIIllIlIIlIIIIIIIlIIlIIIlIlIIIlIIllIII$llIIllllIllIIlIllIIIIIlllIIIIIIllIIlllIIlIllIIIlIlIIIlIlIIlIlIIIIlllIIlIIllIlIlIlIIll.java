package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.world.phys.Vec3;

public final class IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll<T>
   implements Comparator<T> {
   public static net.minecraft.world.phys.Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field v2
   
   public IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
      Vec3 var1
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      int var10000 = IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII.c();
      Vec3 var4 = (Vec3)var1;
      boolean var5 = false;
      Comparable var10001 = (Comparable)Double.valueOf(var4.distanceTo(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
      var4 = (Vec3)var2;
      Comparable var6 = var10001;
      int var3 = var10000;
      var5 = false;
      var10000 = ComparisonsKt.compareValues(var6, (Comparable)Double.valueOf(var4.distanceTo(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)));
      if (var3 != 0) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }

      return var10000;
   }
}
