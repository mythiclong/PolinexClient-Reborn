package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledFuture;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.RangesKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;

public final class lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI(Object... px) {
           this(0L); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   public lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI(long var1, int var2, kotlin.jvm.internal.DefaultConstructorMarker var3) {
      if ((var2 & 1) != 0) {
         var1 = System.currentTimeMillis();
      }

      this(var1);
   }

   private final long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Random lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private volatile boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private ScheduledFuture<?> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private volatile boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private Vec3 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final List<Vec3> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final Map<Float, Long> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final List<Float> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final Set<BlockPos> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] a;
   private static String[] b;

   public lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI(long var1) {
      Object var7 = null; // PX-FIX
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      String var10000 = r();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = RandomKt.Random(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var10002 = Vec3.ZERO;
      short var10004 = 971;
      short var10005 = -14807;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10002;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Collections.synchronizedList(new ArrayList<>(20));
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = Collections.synchronizedMap(
         new LinkedHashMap<Float, Long>() {
            private static String a;

            @Override
            protected boolean removeEldestEntry(Entry<Float, Long> var1) {
               String var10000x = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
               Intrinsics.checkNotNullParameter(var1, a);
               String var2 = var10000x;
               int var3 = this.size();
               if (var2 != null) {
                  var3 = var3 > 50 ? 1 : 0;
               }

               return (var3 != 0);
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
   pxClinit: {
               char[] var10003 = "p?Z\u00018\\".toCharArray();
               int var10004x = var10003.length;
               int var0 = 0;
               byte var6 = 118;
               char[] var10002x = var10003;
               int var1x = var10004x;
               byte var10;
               char[] var10005x;
               int var10006;
               if (var10004x <= 1) {
                  var10005x = var10003;
                  var10 = 118;
                  var10006 = var0;
               } else {
                  var6 = 118;
                  var1x = var10004x;
                  if (var10004x <= var0) {
                     String var9 = new String(var10003).intern();
                     byte var4 = -1;
                     a = var9;
                     break pxClinit;
                  }

                  var10005x = var10003;
                  var10 = 118;
                  var10006 = var0;
               }

               while (true) {
                  var10005x[var10006] = (char)(var10005x[var10006] ^ var10 ^ switch (var0 % 7) {
                     case 0 -> 99;
                     case 1 -> 37;
                     case 2 -> 72;
                     case 3 -> 18;
                     case 4 -> 61;
                     case 5 -> 94;
                     default -> 78;
                  });
                  var0++;
                  if (var6 == 0) {
                     var10006 = var6;
                     var10005x = var10002x;
                     var10 = var6;
                  } else {
                     if (var1x <= var0) {
                        String var8 = new String(var10002x).intern();
                        byte var3 = -1;
                        a = var8;
                        break pxClinit;
                     }

                     var10005x = var10002x;
                     var10 = var6;
                     var10006 = var0;
                  }
               }
            }
}
         }
      );
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Collections.synchronizedList(new ArrayList<>(10));
      String var3 = var10000;

      try {
         label31: {
   pxClinit: {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Collections.synchronizedSet(new LinkedHashSet<>());
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.currentTimeMillis();
            if (var3 != null) {
               var7 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player;
               if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                  != null) {
                  break label31;
               }
            }

            break pxClinit;
         }
}
      } catch (NoSuchElementException var6) {
         throw (RuntimeException)a(var6);
      }

      LocalPlayer var4 =((LocalPlayer)( var7));
      boolean var5 = false;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var4.getY();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
         var4
      );
   }

   public final boolean a() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final boolean b() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void a(boolean var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   public final double c() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final Vec3 d() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final float e() {
   float elapsed = (float)(System.currentTimeMillis() - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
   float value;
   if (elapsed < 3000.0F) {
      value = 1.0F;
   } else if (elapsed < 8000.0F) {
      value = 1.0F - (elapsed - 3000.0F) / 5000.0F * 0.4F;
   } else if (elapsed < 15000.0F) {
      value = 0.6F - (elapsed - 8000.0F) / 7000.0F * 0.3F;
   } else {
      value = 0.3F;
   }

   return RangesKt.coerceIn(value, 0.3F, 1.0F);
   }

   public final float f() {
      float var1 = this.e();
      return 0.78F + var1 * 0.32F;
   }

   public final boolean g() {
   Object player = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
   if (player == null) {
      return false;
   } else {
      LocalPlayer localPlayer = (LocalPlayer)player;
      return Math.abs(localPlayer.getY() - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) < 1.5;
   }
   }

   public final void a(long var1) throws InterruptedException {
      try {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.b(var1);
         if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
         }
      } catch (InterruptedException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   public final int a(int var1, int var2) {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.nextInt(var1, var2);
   }

   public final long a(long var1, long var3) {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.nextLong(var1, var3);
   }

   public final float h() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.nextFloat();
   }

   public final boolean i() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.nextBoolean();
   }

   public final <T> T a(@NotNull List<? extends T> var1) {
      short var10001 = 970;
      short var10002 = -17117;
      Intrinsics.checkNotNullParameter(var1, "list");
      return (T)var1.get(this.a(0, var1.size()));
   }

   private final float a(float param1) {
   float floatValue = param1 % 360.0F;
   if (floatValue >= 180.0F) {
      floatValue -= 360.0F;
   }

   if (floatValue < -180.0F) {
      floatValue += 360.0F;
   }

   return floatValue;
   }

   public static List a(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var0, int var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = 5;
      }

      return var0.a(var1);
   }

   @NotNull
   public final List<Float> a(int var1) {
      Object var15 = null; // PX-FIX
      Iterable var3 = llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1);
      boolean var4 = false;
      var var6 = new ArrayList();
      String var10000 = r();
      boolean var7 = false;
      Iterator var8 = var3.iterator();
      String var2 = var10000;

      while (var8.hasNext()) {
         Object var9 = var8.next();
         float var10 = ((Number)var9).floatValue();
         boolean var11 = false;

         label53: {
            label52: {
               try {
                  var15 = this.f(var10);
                  if (var2 == null) {
                     break label53;
                  }

                  if (!((Boolean)var15)) {
                     break label52;
                  }
               } catch (NoSuchElementException var13) {
                  throw (RuntimeException)a(var13);
               }

               var15 = false;
               break label53;
            }

            var15 = true;
         }

         if (((Boolean)(var15))) {
            var6.add(var9);
            if (var2 == null) {
               break;
            }
         }
      }

      var var14 = CollectionsKt.take(var6, var1);

      try {
         boolean var16 = var14.isEmpty();
         if (var2 == null) {
            return llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var1);
         }

         if (!var16) {
            return (List<Float>)var14;
         }
      } catch (NoSuchElementException var12) {
         throw (RuntimeException)a(var12);
      }

      boolean var17 = false;
      return llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1);
   }


   public final boolean k() {
   synchronized (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
      if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.size() < 10) {
         return false;
      } else {
         List<Vec3> list = CollectionsKt.takeLast(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, 10);
         List<Double> list2 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));

         for (Vec3 vec3 : list) {
            list2.add(vec3.x);
         }

         double d = CollectionsKt.averageOfDouble(list2);
         List<Double> list3 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));

         for (Vec3 vec4 : list) {
            list3.add(vec4.y);
         }

         double e = CollectionsKt.averageOfDouble(list3);
         List<Double> list4 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));

         for (Vec3 vec5 : list) {
            list4.add(vec5.z);
         }

         double f = CollectionsKt.averageOfDouble(list4);
         double g = 0.0;

         for (Vec3 vec6 : list) {
            double h = vec6.x - d;
            double i = vec6.y - e;
            double j = vec6.z - f;
            double dist = Math.sqrt(h * h + i * i + j * j);
            g = Math.max(g, dist);
         }

         return g < 2.0;
      }
   }
   }

   public final void d(float var1) {
      float var2 = this.a(var1);
      Map var10000 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10002 = 969;
      short var10003 = -12831;
      Intrinsics.checkNotNullExpressionValue(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, "badWallYaws");
      Map var3 = var10000;
      Float var4 = var2;
      Long var5 = System.currentTimeMillis();
      var3.put(var4, var5);
   }

   public final void e(float param1) {
   float floatValue = this.a(param1);
   synchronized (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.add(floatValue);
      if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.size() > 10) {
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.remove(0);
      }
   }
   }

   public final boolean f(float param1) {
   long longValue = System.currentTimeMillis();
   float floatValue = this.a(param1);
   Iterator<Map.Entry<Float, Long>> iterator = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.entrySet().iterator();

   while (iterator.hasNext()) {
      Map.Entry<Float, Long> entry = iterator.next();
      if (longValue - entry.getValue() > 15000L) {
         iterator.remove();
      }
   }

   if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.keySet().isEmpty()) {
      return false;
   } else {
      for (Float floatObject : this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.keySet()) {
         if (Math.abs(this.a(floatValue - floatObject)) < 15.0F) {
            return true;
         }
      }

      return false;
   }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic java/lang/System.currentTimeMillis ()J
      // 03: lstore 3
      // 04: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r ()Ljava/lang/String;
      // 07: aload 0
      // 08: fload 1
      // 09: invokespecial me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (F)F
      // 0c: fstore 5
      // 0e: astore 2
      // 0f: aload 0
      // 10: getfield me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Ljava/util/Map;
      // 13: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 18: lload 3
      // 19: invokedynamic invoke (J)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JLjava/util/Map$Entry;)Z, (Ljava/util/Map$Entry;)Ljava/lang/Boolean; ]
      // 1e: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
      // 23: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
      // 28: pop
      // 29: aload 0
      // 2a: getfield me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Ljava/util/Map;
      // 2d: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 32: checkcast java/lang/Iterable
      // 35: astore 6
      // 37: bipush 0
      // 38: istore 7
      // 3a: aload 6
      // 3c: aload 2
      // 3d: ifnull 76
      // 40: instanceof java/util/Collection
      // 43: ifeq 74
      // 46: goto 4d
      // 49: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 6
      // 4f: checkcast java/util/Collection
      // 52: aload 2
      // 53: ifnull 76
      // 56: goto 5d
      // 59: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 62: ifeq 74
      // 65: goto 6c
      // 68: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: bipush 0
      // 6d: goto ca
      // 70: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: aload 6
      // 76: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 7b: astore 8
      // 7d: aload 8
      // 7f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 84: ifeq c9
      // 87: aload 8
      // 89: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8e: astore 9
      // 90: aload 9
      // 92: checkcast java/lang/Float
      // 95: astore 10
      // 97: bipush 0
      // 98: istore 11
      // 9a: aload 0
      // 9b: fload 5
      // 9d: aload 10
      // 9f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // a2: aload 10
      // a4: invokevirtual java/lang/Float.floatValue ()F
      // a7: fsub
      // a8: invokespecial me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (F)F
      // ab: invokestatic java/lang/Math.abs (F)F
      // ae: ldc_w 15.0
      // b1: fcmpg
      // b2: aload 2
      // b3: ifnull ba
      // b6: ifge bd
      // b9: bipush 1
      // ba: goto be
      // bd: bipush 0
      // be: ifeq 7d
      // c1: bipush 1
      // c2: aload 2
      // c3: ifnull b2
      // c6: goto ca
      // c9: bipush 0
      // ca: ireturn
   }


   @NotNull
   public final List<Float> l() {
      List<Float> var1 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      Intrinsics.checkNotNullExpressionValue(var1, "goodRotationYaws");
      synchronized (var1) {
         boolean var2 = false;
         List<Float> var3 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         Intrinsics.checkNotNullExpressionValue(var3, "goodRotationYaws");
         return CollectionsKt.toList(var3);
      }
   }

   public final void a(@NotNull BlockPos pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(pos);
   }

   public final boolean b(@NotNull BlockPos pos) {
      Intrinsics.checkNotNullParameter(pos, "pos");
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.contains(pos);
   }

   public final void j() {
      if (r() == null) {
         return;
      }
      LocalPlayer var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var2 == null) {
         return;
      }
      List<Vec3> var3 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      Intrinsics.checkNotNullExpressionValue(var3, "positionHistory");
      synchronized (var3) {
         boolean var4 = false;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.add(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((Entity)var2));
         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.size() > 20) {
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.remove(0);
         }
      }
   }

   public final boolean m() {
      return llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d();
   }

   public final void n() {
      String var1 = r();
      if (var1 == null) {
         return;
      }
      if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
         return;
      }
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(0L, 50L, () -> a(this));
   }

   @NotNull
   public final Pair<Float, Float> b(float var1) {
      return llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1);
   }

   public final float c(float var1) {
      Pair<Float, Float> var2 = this.b(var1);
      float var3 = ((Number)var2.component1()).floatValue();
      float var4 = ((Number)var2.component2()).floatValue();
      float var5 = (var3 + var4) / 2.0F;
      float var6 = (var4 - var3) / 2.0F;
      float var7 = var6 * 0.6F;
      return RangesKt.coerceIn(var5 + (this.h() * 2.0F - 1.0F) * var7, var3, var4);
   }

   private final void o() {
      LocalPlayer var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var2 == null) {
         return;
      }
      int var3 = var2.getInventory().getSelectedSlot();
      if (var3 == 8) {
         var3 = this.a(0, 8);
      }
      int var4 = this.a(0, 3);
      try {
         switch (var4) {
            case 0: {
               int var5 = this.h() < 0.5F ? 1 : 2;
               int var6 = this.h() < 0.5F ? 1 : -1;
               int var7 = (var3 + var5 * var6 + 9) % 9;
               if (var7 > 7) {
                  var7 = this.a(0, 8);
               }
               var2.getInventory().setSelectedSlot(var7);
               this.a(this.a(100L, 250L));
               if (this.h() < 0.4F) {
                  var2.getInventory().setSelectedSlot(RangesKt.coerceIn(var3, 0, 7));
               }
               break;
            }
            case 1: {
               int var8 = this.a(0, 8);
               var2.getInventory().setSelectedSlot(var8);
               this.a(this.a(150L, 350L));
               if (this.h() < 0.5F) {
                  var2.getInventory().setSelectedSlot(RangesKt.coerceIn(var3, 0, 7));
               }
               break;
            }
            default: {
               int var9 = this.a(0, 8);
               var2.getInventory().setSelectedSlot(var9);
               this.a(this.a(80L, 150L));
               var2.getInventory().setSelectedSlot(RangesKt.coerceIn(var3, 0, 7));
            }
         }
      } catch (InterruptedException var10) {
         throw new RuntimeException(var10);
      }
      return;
   }

   public final void p() {
      String var1 = r();
      if (var1 != null) {
         if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            return;
         }
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
      }
      java.util.concurrent.ScheduledFuture<?> var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var2 != null) {
         var2.cancel(false);
      }
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
   }

   public final void q() {
      this.p();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.clear();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.clear();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.clear();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
   }

   private static final boolean a(long var0, Entry var2) {
      String var10000 = r();
      short var10002 = 967;
      short var10003 = -32646;
      Intrinsics.checkNotNullParameter(var2, "it");
      String var3 = var10000;

      try {
         Object var10001 = var2.getValue();
         var10003 = 966;
         short var10004 = -24749;
         Intrinsics.checkNotNullExpressionValue(var10001, "<get-value>(...)");
         long var7;
         int var5 = (var7 = var0 - ((Number)var10001).longValue() - 15000L) == 0L ? 0 : (var7 < 0L ? -1 : 1);
         if (var3 == null) {
            return (var5 != 0);
         }

         if (var5 > 0) {
            return (1 != 0);
         }
      } catch (NoSuchElementException var4) {
         throw (RuntimeException)a(var4);
      }

      return (0 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit a(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI param0) {
      try {
         if (!param0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            return Unit.INSTANCE;
         }

         float floatValue = param0.h();
         if (floatValue < 0.35F) {
            int intValue = 2 + param0.a(0, 4);

            for (int intValue2 = 0; intValue2 < intValue; intValue2++) {
               if (!param0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
                  break;
               }

               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i();
               long longValue;
               if (param0.h() < 0.3F) {
                  longValue = param0.a(35L, 70L);
               } else if (param0.h() < 0.6F) {
                  longValue = param0.a(50L, 90L);
               } else {
                  longValue = param0.a(70L, 130L);
               }

               param0.a(longValue);
            }

            long longValue3;
            if (param0.h() < 0.4F) {
               longValue3 = param0.a(300L, 600L);
            } else if (param0.h() < 0.7F) {
               longValue3 = param0.a(500L, 900L);
            } else {
               longValue3 = param0.a(700L, 1200L);
            }

            param0.a(longValue3);
         } else if (floatValue < 0.55F) {
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i();
            if (param0.h() < 0.3F) {
               param0.a(param0.a(40L, 80L));
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i();
            }

            param0.a(param0.a(200L, 450L));
         } else if (floatValue < 0.75F) {
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i();
            param0.a(param0.a(150L, 350L));
         } else {
            param0.a(param0.a(250L, 550L));
         }

         if (param0.h() < 0.08F) {
            param0.o();
         }
      } catch (InterruptedException interruptedException) {
         throw (RuntimeException)a(interruptedException);
      }

      return Unit.INSTANCE;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: ifnull 01f
      // 009: getfield me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Z
      // 00c: ifne 01e
      // 00f: goto 016
      // 012: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 019: areturn
      // 01a: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 0
      // 01f: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.h ()F
      // 022: fstore 2
      // 023: nop
      // 024: fload 2
      // 025: ldc_w 0.35
      // 028: fcmpg
      // 029: aload 1
      // 02a: ifnull 14a
      // 02d: ifge 13e
      // 030: goto 037
      // 033: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: bipush 2
      // 038: aload 0
      // 039: bipush 0
      // 03a: bipush 4
      // 03b: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (II)I
      // 03e: iadd
      // 03f: istore 3
      // 040: bipush 0
      // 041: istore 4
      // 043: iload 4
      // 045: iload 3
      // 046: if_icmpge 0da
      // 049: aload 0
      // 04a: getfield me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Z
      // 04d: aload 1
      // 04e: ifnull 0e2
      // 051: aload 1
      // 052: ifnull 0e2
      // 055: goto 05c
      // 058: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: ifeq 0da
      // 05f: goto 066
      // 062: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 069: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.i ()Z
      // 06c: pop
      // 06d: nop
      // 06e: aload 0
      // 06f: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.h ()F
      // 072: ldc 0.3
      // 074: fcmpg
      // 075: aload 1
      // 076: ifnull 0ad
      // 079: goto 080
      // 07c: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: ifge 09b
      // 083: goto 08a
      // 086: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: aload 0
      // 08b: ldc2_w 35
      // 08e: ldc2_w 70
      // 091: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 094: goto 0cb
      // 097: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 1
      // 09d: ifnull 0c2
      // 0a0: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.h ()F
      // 0a3: ldc 0.6
      // 0a5: fcmpg
      // 0a6: goto 0ad
      // 0a9: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: ifge 0c1
      // 0b0: aload 0
      // 0b1: ldc2_w 50
      // 0b4: ldc2_w 90
      // 0b7: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 0ba: goto 0cb
      // 0bd: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: ldc2_w 70
      // 0c5: ldc2_w 130
      // 0c8: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 0cb: lstore 5
      // 0cd: aload 0
      // 0ce: lload 5
      // 0d0: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (J)V
      // 0d3: iinc 4 1
      // 0d6: aload 1
      // 0d7: ifnonnull 043
      // 0da: nop
      // 0db: aload 0
      // 0dc: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.h ()F
      // 0df: ldc 0.4
      // 0e1: fcmpg
      // 0e2: aload 1
      // 0e3: ifnull 114
      // 0e6: ifge 101
      // 0e9: goto 0f0
      // 0ec: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: ldc2_w 300
      // 0f4: ldc2_w 600
      // 0f7: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 0fa: goto 132
      // 0fd: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: aload 0
      // 102: aload 1
      // 103: ifnull 129
      // 106: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.h ()F
      // 109: ldc_w 0.7
      // 10c: fcmpg
      // 10d: goto 114
      // 110: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: ifge 128
      // 117: aload 0
      // 118: ldc2_w 500
      // 11b: ldc2_w 900
      // 11e: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 121: goto 132
      // 124: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 0
      // 129: ldc2_w 700
      // 12c: ldc2_w 1200
      // 12f: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 132: lstore 4
      // 134: aload 0
      // 135: lload 4
      // 137: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (J)V
      // 13a: aload 1
      // 13b: ifnonnull 1f7
      // 13e: fload 2
      // 13f: ldc_w 0.55
      // 142: fcmpg
      // 143: goto 14a
      // 146: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149: athrow
      // 14a: aload 1
      // 14b: ifnull 1b7
      // 14e: ifge 1ab
      // 151: goto 158
      // 154: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 15b: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.i ()Z
      // 15e: pop
      // 15f: aload 0
      // 160: aload 1
      // 161: ifnull 198
      // 164: goto 16b
      // 167: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.h ()F
      // 16e: ldc 0.3
      // 170: fcmpg
      // 171: ifge 197
      // 174: goto 17b
      // 177: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17a: athrow
      // 17b: aload 0
      // 17c: aload 0
      // 17d: ldc2_w 40
      // 180: ldc2_w 80
      // 183: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 186: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (J)V
      // 189: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 18c: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.i ()Z
      // 18f: pop
      // 190: goto 197
      // 193: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 196: athrow
      // 197: aload 0
      // 198: ldc2_w 200
      // 19b: ldc2_w 450
      // 19e: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 1a1: lstore 3
      // 1a2: aload 0
      // 1a3: lload 3
      // 1a4: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (J)V
      // 1a7: aload 1
      // 1a8: ifnonnull 1f7
      // 1ab: fload 2
      // 1ac: ldc_w 0.75
      // 1af: fcmpg
      // 1b0: goto 1b7
      // 1b3: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: aload 1
      // 1b8: ifnull 1d2
      // 1bb: ifge 1e7
      // 1be: goto 1c5
      // 1c1: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c4: athrow
      // 1c5: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 1c8: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.i ()Z
      // 1cb: goto 1d2
      // 1ce: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: pop
      // 1d3: aload 0
      // 1d4: ldc2_w 150
      // 1d7: ldc2_w 350
      // 1da: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 1dd: lstore 3
      // 1de: aload 0
      // 1df: lload 3
      // 1e0: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (J)V
      // 1e3: aload 1
      // 1e4: ifnonnull 1f7
      // 1e7: aload 0
      // 1e8: ldc2_w 250
      // 1eb: ldc2_w 550
      // 1ee: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (JJ)J
      // 1f1: lstore 3
      // 1f2: aload 0
      // 1f3: lload 3
      // 1f4: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (J)V
      // 1f7: aload 0
      // 1f8: aload 1
      // 1f9: ifnull 215
      // 1fc: invokevirtual me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.h ()F
      // 1ff: ldc_w 0.08
      // 202: fcmpg
      // 203: ifge 218
      // 206: goto 20d
      // 209: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: aload 0
      // 20e: goto 215
      // 211: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 214: athrow
      // 215: invokespecial me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.o ()V
      // 218: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 21b: areturn
   }

   public lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI() {
      this(0L, 1, null);
   }

   public static void b(String var0) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
   }

   public static String r() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "*®³òv!Ãì´«Â\u008f{RA6\u0003/\u0019ú\u0010P«üR\u009f5þn\u0013û6\u0085å\u0013\u0092\u001e\u000fF\u0095×\u0098CÆ\u009cÙ\u001bã\u0090\u009c\u0098zÃ\u0004Ù#j\u0007\u0004?Bg¹\u000b£\u008a,\u008aÜxÛ\u009c¹\u0084È\u000f \u009e\u001bùÚê¯\\}S\\\u008a\u0001¸ð\u0002A\\";
      int var4 = "*®³òv!Ãì´«Â\u008f{RA6\u0003/\u0019ú\u0010P«üR\u009f5þn\u0013û6\u0085å\u0013\u0092\u001e\u000fF\u0095×\u0098CÆ\u009cÙ\u001bã\u0090\u009c\u0098zÃ\u0004Ù#j\u0007\u0004?Bg¹\u000b£\u008a,\u008aÜxÛ\u009c¹\u0084È\u000f \u009e\u001bùÚê¯\\}S\\\u008a\u0001¸ð\u0002A\\"
         .length();
      b("YtRckb");
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 57;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 25;
                     case 1 -> 31;
                     case 2 -> 47;
                     case 3 -> 60;
                     case 4 -> 43;
                     case 5 -> 97;
                     default -> 26;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[11];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "VWj¸\u0015\u000fFrÞ´\u0093Ë1w¤\u0002\u0003\u008d¡Â";
                  var4 = "VWj¸\u0015\u000fFrÞ´\u0093Ë1w¤\u0002\u0003\u008d¡Â".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 89;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 975) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 12;
            case 1 -> 217;
            case 2 -> 20;
            case 3 -> 112;
            case 4 -> 128;
            case 5 -> 77;
            case 6 -> 163;
            case 7 -> 6;
            case 8 -> 171;
            case 9 -> 103;
            case 10 -> 238;
            case 11 -> 180;
            case 12 -> 248;
            case 13 -> 131;
            case 14 -> 203;
            case 15 -> 106;
            case 16 -> 14;
            case 17 -> 142;
            case 18 -> 231;
            case 19 -> 51;
            case 20 -> 133;
            case 21 -> 29;
            case 22 -> 41;
            case 23 -> 24;
            case 24 -> 151;
            case 25 -> 239;
            case 26 -> 92;
            case 27 -> 39;
            case 28 -> 107;
            case 29 -> 64;
            case 30 -> 26;
            case 31 -> 176;
            case 32 -> 67;
            case 33 -> 153;
            case 34 -> 149;
            case 35 -> 18;
            case 36 -> 62;
            case 37 -> 17;
            case 38 -> 122;
            case 39 -> 73;
            case 40 -> 155;
            case 41 -> 179;
            case 42 -> 60;
            case 43 -> 148;
            case 44 -> 86;
            case 45 -> 251;
            case 46 -> 90;
            case 47 -> 150;
            case 48 -> 109;
            case 49 -> 34;
            case 50 -> 115;
            case 51 -> 47;
            case 52 -> 38;
            case 53 -> 111;
            case 54 -> 45;
            case 55 -> 254;
            case 56 -> 211;
            case 57 -> 236;
            case 58 -> 204;
            case 59 -> 61;
            case 60 -> 193;
            case 61 -> 143;
            case 62 -> 146;
            case 63 -> 130;
            case 64 -> 161;
            case 65 -> 9;
            case 66 -> 199;
            case 67 -> 11;
            case 68 -> 198;
            case 69 -> 219;
            case 70 -> 37;
            case 71 -> 50;
            case 72 -> 120;
            case 73 -> 2;
            case 74 -> 32;
            case 75 -> 213;
            case 76 -> 83;
            case 77 -> 101;
            case 78 -> 244;
            case 79 -> 93;
            case 80 -> 167;
            case 81 -> 214;
            case 82 -> 82;
            case 83 -> 166;
            case 84 -> 65;
            case 85 -> 79;
            case 86 -> 170;
            case 87 -> 95;
            case 88 -> 188;
            case 89 -> 200;
            case 90 -> 97;
            case 91 -> 228;
            case 92 -> 157;
            case 93 -> 126;
            case 94 -> 186;
            case 95 -> 116;
            case 96 -> 224;
            case 97 -> 114;
            case 98 -> 108;
            case 99 -> 190;
            case 100 -> 205;
            case 101 -> 245;
            case 102 -> 123;
            case 103 -> 56;
            case 104 -> 105;
            case 105 -> 195;
            case 106 -> 81;
            case 107 -> 22;
            case 108 -> 46;
            case 109 -> 10;
            case 110 -> 152;
            case 111 -> 156;
            case 112 -> 144;
            case 113 -> 49;
            case 114 -> 197;
            case 115 -> 52;
            case 116 -> 31;
            case 117 -> 250;
            case 118 -> 55;
            case 119 -> 85;
            case 120 -> 78;
            case 121 -> 216;
            case 122 -> 127;
            case 123 -> 206;
            case 124 -> 159;
            case 125 -> 69;
            case 126 -> 249;
            case 127 -> 43;
            case 128 -> 42;
            case 129 -> 139;
            case 130 -> 196;
            case 131 -> 0;
            case 132 -> 71;
            case 133 -> 140;
            case 134 -> 218;
            case 135 -> 232;
            case 136 -> 185;
            case 137 -> 4;
            case 138 -> 223;
            case 139 -> 135;
            case 140 -> 58;
            case 141 -> 173;
            case 142 -> 184;
            case 143 -> 240;
            case 144 -> 241;
            case 145 -> 136;
            case 146 -> 125;
            case 147 -> 89;
            case 148 -> 113;
            case 149 -> 222;
            case 150 -> 201;
            case 151 -> 76;
            case 152 -> 7;
            case 153 -> 59;
            case 154 -> 234;
            case 155 -> 212;
            case 156 -> 33;
            case 157 -> 87;
            case 158 -> 233;
            case 159 -> 169;
            case 160 -> 1;
            case 161 -> 30;
            case 162 -> 23;
            case 163 -> 91;
            case 164 -> 53;
            case 165 -> 98;
            case 166 -> 68;
            case 167 -> 13;
            case 168 -> 118;
            case 169 -> 165;
            case 170 -> 164;
            case 171 -> 119;
            case 172 -> 158;
            case 173 -> 174;
            case 174 -> 25;
            case 175 -> 209;
            case 176 -> 16;
            case 177 -> 96;
            case 178 -> 243;
            case 179 -> 227;
            case 180 -> 172;
            case 181 -> 160;
            case 182 -> 54;
            case 183 -> 110;
            case 184 -> 255;
            case 185 -> 183;
            case 186 -> 121;
            case 187 -> 63;
            case 188 -> 175;
            case 189 -> 132;
            case 190 -> 221;
            case 191 -> 40;
            case 192 -> 246;
            case 193 -> 178;
            case 194 -> 84;
            case 195 -> 36;
            case 196 -> 104;
            case 197 -> 230;
            case 198 -> 187;
            case 199 -> 99;
            case 200 -> 48;
            case 201 -> 215;
            case 202 -> 74;
            case 203 -> 145;
            case 204 -> 168;
            case 205 -> 210;
            case 206 -> 117;
            case 207 -> 100;
            case 208 -> 235;
            case 209 -> 247;
            case 210 -> 21;
            case 211 -> 237;
            case 212 -> 57;
            case 213 -> 44;
            case 214 -> 189;
            case 215 -> 19;
            case 216 -> 27;
            case 217 -> 3;
            case 218 -> 137;
            case 219 -> 162;
            case 220 -> 208;
            case 221 -> 225;
            case 222 -> 129;
            case 223 -> 192;
            case 224 -> 35;
            case 225 -> 181;
            case 226 -> 88;
            case 227 -> 102;
            case 228 -> 253;
            case 229 -> 177;
            case 230 -> 75;
            case 231 -> 124;
            case 232 -> 229;
            case 233 -> 242;
            case 234 -> 194;
            case 235 -> 154;
            case 236 -> 207;
            case 237 -> 80;
            case 238 -> 138;
            case 239 -> 70;
            case 240 -> 191;
            case 241 -> 202;
            case 242 -> 94;
            case 243 -> 72;
            case 244 -> 15;
            case 245 -> 141;
            case 246 -> 220;
            case 247 -> 226;
            case 248 -> 28;
            case 249 -> 134;
            case 250 -> 252;
            case 251 -> 66;
            case 252 -> 182;
            case 253 -> 5;
            case 254 -> 8;
            default -> 147;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}
