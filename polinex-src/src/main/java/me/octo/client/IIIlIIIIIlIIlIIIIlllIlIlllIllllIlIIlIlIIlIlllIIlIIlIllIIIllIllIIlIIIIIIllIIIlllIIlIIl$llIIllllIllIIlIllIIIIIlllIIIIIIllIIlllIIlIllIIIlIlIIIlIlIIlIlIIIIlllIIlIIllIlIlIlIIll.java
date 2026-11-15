package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1;
      boolean var4 = false;
      Comparable var10000 = ((Comparable)(Object)(var3.c()));
      var3 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var2;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Comparable)(Object)(var3.c()));
   }
}
