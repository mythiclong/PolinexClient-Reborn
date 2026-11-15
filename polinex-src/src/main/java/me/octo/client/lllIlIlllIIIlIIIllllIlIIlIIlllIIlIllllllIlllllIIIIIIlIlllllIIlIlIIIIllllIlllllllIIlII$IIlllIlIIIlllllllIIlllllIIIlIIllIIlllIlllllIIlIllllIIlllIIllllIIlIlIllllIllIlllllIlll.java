package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class lllIlIlllIIIlIIIllllIlIIlIIlllIIlIllllllIlllllIIIIIIlIlllllIIlIlIIIIllllIlllllllIIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var3 = (IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl)var2;
      boolean var4 = false;
      Comparable var10000 = var3.g();
      var3 = (IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl)var1;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, var3.g());
   }
}
