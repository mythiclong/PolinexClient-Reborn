package me.octo.client;

import java.util.Comparator;
import kotlin.Triple;
import kotlin.comparisons.ComparisonsKt;

public final class IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      Triple var3 = (Triple)var1;
      boolean var4 = false;
      var var10000 = (Double)var3.getSecond();
      var3 = (Triple)var2;
      Double var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Double)var3.getSecond());
   }
}
