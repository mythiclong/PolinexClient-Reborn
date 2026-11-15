package me.octo.client;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public final class IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI {
   private static final AtomicInteger START_SENTINEL = new AtomicInteger(324478056);
   private static final AtomicInteger BRANCH_SENTINEL = new AtomicInteger(610800471);

   private IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI() {
   }

   public static String a(Random var0) {
      if (var0 == null) {
         var0 = new Random(0L);
      }

      long var1 = var0.nextLong();
      long var3 = var0.nextLong();
      String var5 = Long.toUnsignedString(var1 ^ Long.rotateLeft(var3, 17), 36);
      return "me.octo.client.generated.Predicate$" + var5;
   }

   public static int a() {
      return START_SENTINEL.get();
   }

   public static int b() {
      return BRANCH_SENTINEL.get();
   }
}
