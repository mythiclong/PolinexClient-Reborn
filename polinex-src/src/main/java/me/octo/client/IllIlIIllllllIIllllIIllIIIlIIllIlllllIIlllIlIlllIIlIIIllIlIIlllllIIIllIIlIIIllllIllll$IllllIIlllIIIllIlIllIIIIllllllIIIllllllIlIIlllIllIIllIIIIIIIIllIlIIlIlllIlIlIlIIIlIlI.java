package me.octo.client;

import java.util.Comparator;
import java.util.Map.Entry;
import kotlin.comparisons.ComparisonsKt;

public final class IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      Entry var3 = (Entry)var1;
      boolean var4 = false;
      var var10000 = (Integer)var3.getValue();
      var3 = (Entry)var2;
      Integer var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Integer)var3.getValue());
   }
}
