package me.octo.client;

import java.io.File;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      File var3 = (File)var1;
      boolean var4 = false;
      Comparable var10000 = var3.lastModified();
      var3 = (File)var2;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, var3.lastModified());
   }
}
