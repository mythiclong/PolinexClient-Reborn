package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll<T>
   implements Comparator<T> {
   public final me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII this$0; // PX-FIX missing field v2
   
   public lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
      lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII var1
   ) {
      this.this$0 = var1;
   }

   public final int compare(T var1, T var2) {
      boolean var4 = false;
      Comparable var5 = ((PXDyn)(Object)this.this$0).a(var1);
      var4 = false;
      return ComparisonsKt.compareValues(var5, ((PXDyn)(Object)this.this$0).a(var2));
   }
}
