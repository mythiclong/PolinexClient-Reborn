package me.octo.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.world.scores.PlayerScoreEntry;

public final class llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<T>
   implements Comparator<T> {
   public static java.util.Comparator IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field v2
   
   public llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
      Comparator var1
   ) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final int compare(T var1, T var2) {
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.compare(var1, var2);
      String var3 = var10000;
      int var10 = var4;
      if (var3 == null) {
         if (var4 != 0) {
            var10 = var4;
         } else {
            PlayerScoreEntry var5 = (PlayerScoreEntry)var1;
            boolean var6 = false;
            Comparable var11 = var5.owner();
            var5 = (PlayerScoreEntry)var2;
            Comparable var7 = var11;
            var6 = false;
            var10 = ComparisonsKt.compareValues(var7, var5.owner());
         }
      }

      return var10;
   }
}
