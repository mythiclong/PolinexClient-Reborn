package me.octo.client;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.core.BlockPos;

public final class llIIIllIllIIllIIIlIllIIIIIlIIllIlIIIIlIlllIlllllllIllIIlIIlIlIIlllIIllllIlllIlIllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      Pair var3 = (Pair)var1;
      boolean var4 = false;
      Comparable var10000 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((BlockPos)var3.getFirst(), true);
      var3 = (Pair)var2;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(
         var5,
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a((BlockPos)var3.getFirst(), true)
      );
   }
}
