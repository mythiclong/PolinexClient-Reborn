package me.octo.client;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

public final class IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll<T>
   implements Comparator<T> {
   public final int compare(T var1, T var2) {
      int var10000 = IIlllIIIIIlllIIlllIIIllIIIIIIlIlIIlIIIIllIlIIIllIllIlIlIIlIIIlllIIllIIllIIIllIIIIIIIl.c();
      Pair var4 = (Pair)var1;
      boolean var5 = false;
      var var10001 = (Integer)var4.getSecond();
      var4 = (Pair)var2;
      Integer var6 = var10001;
      int var3 = var10000;
      var5 = false;
      var10000 = ComparisonsKt.compareValues(var6, (Integer)var4.getSecond());
      if (var3 != 0) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }

      return var10000;
   }
}
