package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl {
   public static me.octo.client.PXDyn var31 = null; // PX-FIX missing field v2
   
   @NotNull
   public static lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Object lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Object();
   @NotNull
   private final LinkedHashMap<String, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new LinkedHashMap<>();
   @NotNull
   private final HashMap<String, lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap<>();
   private long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final ArrayList<Pair<Long, Float>> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new ArrayList<>();
   @NotNull
   private final ArrayList<Pair<Long, Float>> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new ArrayList<>();
   @NotNull
   private final ArrayList<Pair<Long, Double>> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new ArrayList<>();
   private double lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private double lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @Nullable
   public static lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] a;
   private static String[] b;

   // $VF: Extended synchronized range to monitorexit
   public final void a() {
      int[] var10000 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      Object var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      int[] var1 = var10000;
      synchronized (var2) {
         boolean var3 = false;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 0L;
         Unit var6 = Unit.INSTANCE;
      }

      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 0L;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0L;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.clear();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.clear();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.clear();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0L;
      me.octo.client.utils.IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      if (var1 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }
   }

   // $VF: Extended synchronized range to monitorexit
   public final void a(long var1) { Object var14 = null; // PX-FIX hoist
        
       var14 = null; // PX-FIX
      int[] var3 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      if (var1 > 0L) {
         Object var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         synchronized (var4) {
            boolean var5 = false;
            long var16;
            int var10000 = (var16 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI - 0L) == 0L
               ? 0
               : (var16 < 0L ? -1 : 1);
            if (var3 == null) {
               if (var10000 != 0) {
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI += var1;
               }

               long var17;
               var10000 = (var17 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll - 0L) == 0L
                  ? 0
                  : (var17 < 0L ? -1 : 1);
            }

            if (var3 == null) {
               if (var10000 != 0) {
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll += var1;
               }

               long var18;
               var10000 = (var18 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll - 0L) == 0L
                  ? 0
                  : (var18 < 0L ? -1 : 1);
            }

            if (var3 == null) {
               if (var10000 != 0) {
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll += var1;
               }

               long var19;
               var10000 = (var19 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl - 0L) == 0L
                  ? 0
                  : (var19 < 0L ? -1 : 1);
            }

            if (var3 == null) {
               if (var10000 != 0) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl += var1;
               }

               var10000 = 0;
            }

            int var6 = var10000;
            int var7 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.size();

            while (true) {
               if (var6 < var7) {
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .set(
                        var6,
                        TuplesKt.to(
                           ((Number)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var6).getFirst())
                                 .longValue()
                              + var1,
                           this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var6).getSecond()
                        )
                     );
                  var6++;
                  if (var3 != null) {
                     break;
                  }

                  if (var3 == null) {
                     continue;
                  }
               }

               var6 = 0;
               break;
            }

            var7 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.size();

            while (true) {
               if (var6 < var7) {
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                     .set(
                        var6,
                        TuplesKt.to(
                           ((Number)this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var6).getFirst())
                                 .longValue()
                              + var1,
                           this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var6).getSecond()
                        )
                     );
                  var6++;
                  if (var3 != null) {
                     break;
                  }

                  if (var3 == null) {
                     continue;
                  }
               }

               var6 = 0;
               break;
            }

            var7 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.size();

            while (true) {
               if (var6 < var7) {
                  var14 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  if (var3 != null) {
                     break;
                  }

                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                     .set(
                        var6,
                        TuplesKt.to(
                           ((Number)this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var6).getFirst())
                                 .longValue()
                              + var1,
                           this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var6).getSecond()
                        )
                     );
                  var6++;
                  if (var3 == null) {
                     continue;
                  }
               }

               var14 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.values();
               break;
            }

            for (Object var15 : (Iterable<?>)(var14)) {
               short var10002 = 1760;
               short var10003 = 8733;
               Intrinsics.checkNotNullExpressionValue(var15, "next(...)");
               lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = (lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var15;
               var13.a(var13.b() + var1);
               if (var3 == null && var3 == null) {
                  continue;
               }
               break;
            }

            Unit var9 = Unit.INSTANCE;
         }
      }
   }

   public final void b() {
      long var1 = System.currentTimeMillis();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.c();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.h();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }

   // $VF: Extended synchronized range to monitorexit
   public final void a(@NotNull String var1, int var2) { Object var14 = null; // PX-FIX hoist
        
      Integer var16 = null; // PX-FIX
       var14 = null; // PX-FIX
      int[] var3 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10000 = ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)(Object)(var1));
      if (var3 == null) {
         short var10001 = 1766;
         short var10002 = -24422;
         Intrinsics.checkNotNullParameter(var1, "id");
         if (var2 <= 0) {
            return;
         }

         var10000 = (lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      Object var4 = var10000;
      synchronized (var4) {
         int var6;
         label54: {
            label62: {
               boolean var5 = false;
               var6 = var2;
               lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  .get(var1);
               var10000 = var7;
               if (var3 == null) {
                  if (var7 == null) {
                     break label62;
                  }

                  var10000 = var7;
               }

               var14 = var10000.a();
               if (var3 != null) {
                  break label54;
               }

               if (((Boolean)var14)) {
                  int var8 = Math.min(var2, var7.a());
                  var7.a(var7.a() - var8);
                  var6 = var2 - var8;
                  var14 = var7.a();
                  if (var3 != null) {
                     break label54;
                  }

                  if (((Boolean)var14)) {
                     this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.remove(var1);
                  }
               }
            }

            var14 = var6;
         }

         if (((Boolean)var14)) {
            Map var12;
            label39: {
               var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var3 == null) {
                  Integer var15 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var1);
                  if (var15 != null) {
                     var16 = var15;
                     break label39;
                  }
               }

               var16 = 0;
            }

            Integer var9 = var16 + var6;
            var12.put(var1, var9);
         }

         Unit var11 = Unit.INSTANCE;
      }
   }

   // $VF: Extended synchronized range to monitorexit
   public final void b(@NotNull String var1, int var2) { lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var14 = null; // PX-FIX hoist
        
      Integer var18 = null; // PX-FIX
      int[] var3 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      Integer var10000 = ((Integer)(Object)(var1));
      if (var3 == null) {
         short var10001 = 1765;
         short var10002 = -2168;
         Intrinsics.checkNotNullParameter(var1, "id");
         if (var2 <= 0) {
            return;
         }

         var10000 = (Integer)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      Object var4 = var10000;
      synchronized (var4) {
         Map var6;
         label32: {
            boolean var5 = false;
            var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var3 == null) {
               var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var1);
               if (var10000 != null) {
                  var18 = var10000;
                  break label32;
               }
            }

            var18 = 0;
         }

         Integer var7 = var18 + var2;
         var6.put(var1, var7);
         Map var15 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var9 = false;
         Object var10 = var15.get(var1);
         Object var10005 = null; // PX-FIX var-split (宏表 var10000 Integer/Object 双用途拆分)
         if (var10 == null) {
            boolean var11 = false;
            lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var16 = new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               0, 0L
            );
            var15.put(var1, var16);
            var10005 = var16;
         } else {
            var10005 = var10;
         }

          var14 = (lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10005;
         var14.a(var14.a() + var2);
         var14.a(System.currentTimeMillis());
         Unit var13 = Unit.INSTANCE;
      }
   }

   // $VF: Extended synchronized range to monitorexit
   public final void a(int var1) {
      Object var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      synchronized (var2) {
         boolean var3 = false;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII += var1;
         Unit var6 = Unit.INSTANCE;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void b(long var1) {
      int[] var10000 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      Object var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      synchronized (var4){} // $VF: monitorenter 
      int[] var3 = var10000;

      try {
         boolean var5 = false;
         Iterator var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.entrySet().iterator();

         label70:
         while (true) {
            int var11 = ((var6.hasNext()) ? 1 : 0);

            while (true) {
               if (var11 == 0) {
                  break label70;
               }

               var10000 = (int[])var6.next();
               short var10002 = 1761;
               short var10003 = -32037;
               Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
               Entry var7 = (Entry)(Object)var10000;
               if (var3 != null) {
                  break label70;
               }

               if (var3 == null) {
                  if (((lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var7.getValue())
                        .a()
                     > 0) {
                     long var13;
                     var11 = (
                              var13 = var1
                                 - ((lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var7.getValue())
                                    .b()
                                 - 45000L
                           )
                           == 0L
                        ? 0
                        : (var13 < 0L ? -1 : 1);
                     if (var3 != null) {
                        continue;
                     }

                     if (var11 <= 0) {
                        break;
                     }
                  }

                  var6.remove();
               }

               if (var3 == null) {
                  break;
               }
               break label70;
            }
         }

         Unit var10 = Unit.INSTANCE;
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Extended synchronized range to monitorexit
   public final double c() {
       double var14 = 0.0; // PX-FIX decl var14
      int[] var10000 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      Object var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      int[] var1 = var10000;
      synchronized (var2) {
         boolean var3 = false;
         double var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Iterator var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.entrySet().iterator();

         while (true) {
            if (var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               String var8 = (String)var7.getKey();
               int var9 = ((Number)var7.getValue()).intValue();
               var14 = var4
                  + var9
                     * me.octo.client.utils.IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var8);
               if (var1 != null) {
                  break;
               }

               var4 = var14;
               if (var1 == null) {
                  continue;
               }
            }

            var14 = var4;
            break;
         }

         return var14;
      }
   }

   public final double d() {
      int[] var1 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      long var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      long var10001 = 0L;
      if (var1 == null) {
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == 0L) {
            return 0.0;
         }

         var10000 = System.currentTimeMillis();
         var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      double var2 = (var10000 - var10001) / 3600000.0;
      double var4 = var2;
      double var6 = 0.0;
      if (var1 == null) {
         if (!(var2 > 0.0)) {
            return 0.0;
         }

         var4 = this.c();
         var6 = var2;
      }

      return var4 / var6;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void e() { lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl var14 = null; // PX-FIX hoist
        
      int[] var1;
      long var2;
      double var4;
      label124: {
         double var6;
         label120: {
            int[] var10000 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
            var2 = System.currentTimeMillis();
            this.b(var2);
            var4 = this.c();
            var1 = var10000;
            var6 = this.h();
             var14 = this;
            if (var1 == null) {
               if (this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
                  break label120;
               }

               this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var4;
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var6;
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
               var14 = this;
            }

            var14.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var2;
            if (var1 == null) {
               break label124;
            }
         }

         double var8;
         double var16;
         label112: {
            var8 = RangesKt.coerceIn(var2 - this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, 1L, 250L) / 1000.0;
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var2;
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
               + (var4 - this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) * (1.0 - Math.exp(-var8 / 0.5));
            double var23;
            int var15 = (var23 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI - var4) == 0.0
               ? 0
               : (var23 < 0.0 ? -1 : 1);
            if (var1 == null) {
               if (var15 > 0) {
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var4;
               }

               var16 = var6;
               if (var1 != null) {
                  break label112;
               }

               double var24;
               var15 = (var24 = var6 - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) == 0.0
                  ? 0
                  : (var24 < 0.0 ? -1 : 1);
            }

            var16 = var15 >= 0 ? 0.6 : 20.0;
         }

         double var10 = var16;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            + (var6 - this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) * (1.0 - Math.exp(-var8 / var10));
      }

      int var17;
      long var25;
      var17 = (var25 = var2 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll - 3000L) == 0L
         ? 0
         : (var25 < 0L ? -1 : 1);
      label105:
      if (var1 == null) {
         if (var17 >= 0) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.add(TuplesKt.to(var2, var4));
            long var12 = var2 - 960000L;

            do {
               boolean var18;
               if (!this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.isEmpty()) {
                  var18 = true;
                  if (var1 == null) {
                  }
               } else {
                  var18 = false;
               }

               if (!var18) {
                  break;
               }

               long var26;
               var17 = (
                        var26 = ((Number)((Pair)CollectionsKt.first(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl))
                                 .getFirst())
                              .longValue()
                           - var12
                     )
                     == 0L
                  ? 0
                  : (var26 < 0L ? -1 : 1);
               if (var1 != null) {
                  break label105;
               }

               if (var17 >= 0) {
                  break;
               }

               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.remove(0);
            } while (var1 == null);
         }

         long var27;
         var17 = (var27 = var2 - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll - 250L) == 0L
            ? 0
            : (var27 < 0L ? -1 : 1);
      }

      if (var1 == null) {
         if (var17 < 0) {
            return;
         }

         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var2;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .add(TuplesKt.to(var2, (float)this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI));
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            .add(TuplesKt.to(var2, (float)this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl));
      }

      long var13 = var2 - 185000L;

      while (true) {
         boolean var19;
         if (!this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.isEmpty()) {
            var19 =( 1 != 0);
            if (var1 == null) {
            }
         } else {
            var19 =( 0 != 0);
         }

         if (var19) {
            long var28;
            var19 = (
                     var28 = ((Number)((Pair)CollectionsKt.first(this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII))
                              .getFirst())
                           .longValue()
                        - var13
                  )
                  == 0L;
            if (var1 == null) {
               if ((var19 ? 1 : 0) < 0) {
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.remove(0);
                  if (var1 == null) {
                     continue;
                  }
               }

               var19 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.isEmpty();
            }
         } else {
            var19 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.isEmpty();
         }

         while (true) {
            boolean var21;
            if (var19) {
               var21 = true;
               if (var1 == null) {
               }
            } else {
               var21 = false;
            }

            if (!var21) {
               return;
            }

            Number var22 = (Number)((Pair)CollectionsKt.first(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI))
               .getFirst();
            if (var1 == null) {
               if (var22.longValue() >= var13) {
                  return;
               }

               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.remove(0);
            }

            if (var1 != null) {
               return;
            }

            var19 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.isEmpty();
         }
      }
   }

   public final double f() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final double g() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final double h() { lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl var14 = null; // PX-FIX hoist
        
      int[] var10000 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      long var2 = System.currentTimeMillis();
      int[] var1 = var10000;
       var14 = this;
      if (var1 == null) {
         if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.size() >= 2) {
            long var4 = var2 - 900000L;
            Iterable var8 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            boolean var9 = false;
            Iterator var10 = var8.iterator();

            label53:
            while (true) {
               if (var10.hasNext()) {
                  Object var11 = var10.next();
                  Pair var12 = (Pair)var11;
                  boolean var13 = false;
                  var10000 = (int[])var12.getFirst();

                  while (true) {
                     long var20;
                     int var16 = (var20 = ((Number)(Object)var10000).longValue() - var4) == 0L ? 0 : (var20 < 0L ? -1 : 1);
                     if (var1 == null) {
                        var16 = var16 >= 0 ? 1 : 0;
                     }

                     if (var16 == 0) {
                        continue label53;
                     }

                     var10000 = (int[])var11;
                     if (var1 == null) {
                        break label53;
                     }
                  }
               }

               var10000 = null;
               break;
            }

            label42: {
               var10000 = (int[])(Object)(((Pair)(Object)var10000));
               if (var1 == null) {
                  if (var10000 != null) {
                     break label42;
                  }

                  var10000 = (int[])(Object)(CollectionsKt.first(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl));
               }

               var10000 = (int[])(Object)(((Pair)(Object)var10000));
            }

            Object var6 = var10000;
            double var7 = (var2 - ((Number)((me.octo.client.PXDyn)var6).getFirst()).longValue()) / 3600000.0;
            double var18 = var7;
            double var10001 = 0.0;
            if (var1 == null) {
               if (!(var7 > 0.0)) {
                  return this.d();
               }

               var18 = this.c() - ((Number)((me.octo.client.PXDyn)var6).getSecond()).doubleValue();
               var10001 = var7;
            }

            return var18 / var10001;
         }

         var14 = this;
      }

      return var14.d();
   }

   @NotNull
   public final List<Pair<Long, Float>> i() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final List<Pair<Long, Float>> j() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final List<lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b(
      int var1
   ) { double var14 = 0.0; // PX-FIX hoist
        
      Object var35 = null; // PX-FIX
      List var31 = null; // PX-FIX hoist
      int[] var10000 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      Object var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      int[] var2 = var10000;
      synchronized (var3) {
         boolean var4 = false;
         ArrayList var5 = new ArrayList();
         Iterator var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.entrySet().iterator();

         while (true) {
            if (var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               String var8 = (String)var7.getKey();
               int var9 = ((Number)var7.getValue()).intValue();
               double var10 = var9
                  * me.octo.client.utils.IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var8);
               double var43;
               var35 = (var43 = var10 - 0.0) == 0.0 ? 0 : (var43 < 0.0 ? -1 : 1);
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  if (((Boolean)var35)) {
                     continue;
                  }

                  var5.add(
                     new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var8), var10
                     )
                  );
               }

               if (var2 == null) {
                  continue;
               }
            }

            long var44;
            var35 = (var44 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII - 0L) == 0L ? 0 : (var44 < 0L ? -1 : 1);
            break;
         }

         if (var2 == null && ((Boolean)var35)) {
            short var10003 = 1767;
            short var10004 = -13824;
            var5.add(
               new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  "Coins", this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               )
            );
         }

         label140: {
            var31 = var5;
            boolean var32 = false;
            int var36 = var31.size();
            int var10001 = 1;
            if (var2 == null) {
               if (var36 > 1) {
                  CollectionsKt.sortWith(
                     var31,
                     new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll()
                  );
               }

               var10000 = (int[])(Object)var5;
               if (var2 != null) {
                  break label140;
               }

               var36 = var5.size();
               var10001 = var1;
            }

            if (var36 <= var10001) {
               return var5;
            }

            var31 = CollectionsKt.drop(var5, var1);
            var10000 = (int[])(Object)(CollectionsKt.toMutableList(CollectionsKt.take(var5, var1)));
         }

         Object var33 = var10000;
         int var38 = var31.size();
         short var10002 = 1764;
         short var40 = -14049;
         var40 = 1763;
         short var42 = -22767;
         String var39 = "and " + var38 + " more";
         Iterable var34 = ((Iterable)(Object)(var31));
         String var12 = var39;
          var14 = 0.0;
         Iterator var16 = var34.iterator();

         double var19;
         while (true) {
            if (var16.hasNext()) {
               Object var17 = var16.next();
               lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var18 = (lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var17;
               var19 = var14;
               boolean var21 = false;
               double var22 = var18.b();
               var14 += var22;
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            }

            var19 = var14;
            break;
         }

         ((me.octo.client.PXDyn)var33).add(
            new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var12, var19
            )
         );
         return (List<lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>)var33;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { int var14 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\u008c\u000f\u0004\rG3T\u0005å\u0018EÐ\u008b\u0002XD\tQ¼J\u0015\u0002ö\u000ffm";
      int var4 = "\u008c\u000f\u0004\rG3T\u0005å\u0018EÐ\u008b\u0002XD\tQ¼J\u0015\u0002ö\u000ffm".length();
      char var1 = 2;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 61;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
                var14 = var10004;
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
                     case 0 -> 41;
                     case 1 -> 54;
                     case 2 -> 4;
                     case 3 -> 99;
                     case 4 -> 14;
                     case 5 -> 118;
                     default -> 23;
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
                     b = new String[7];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ar1±\u0010\u001f0&÷\u0005®jX½\u0085";
                  var4 = "ar1±\u0010\u001f0&÷\u0005®jX½\u0085".length();
                  var1 = '\t';
                  var8 = -1;
            }

            var10000 = 7;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 1765) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 61;
            case 1 -> 195;
            case 2 -> 184;
            case 3 -> 98;
            case 4 -> 155;
            case 5 -> 217;
            case 6 -> 218;
            case 7 -> 125;
            case 8 -> 190;
            case 9 -> 105;
            case 10 -> 142;
            case 11 -> 71;
            case 12 -> 44;
            case 13 -> 148;
            case 14 -> 131;
            case 15 -> 209;
            case 16 -> 173;
            case 17 -> 221;
            case 18 -> 212;
            case 19 -> 40;
            case 20 -> 133;
            case 21 -> 46;
            case 22 -> 164;
            case 23 -> 199;
            case 24 -> 96;
            case 25 -> 167;
            case 26 -> 88;
            case 27 -> 43;
            case 28 -> 138;
            case 29 -> 52;
            case 30 -> 63;
            case 31 -> 93;
            case 32 -> 73;
            case 33 -> 231;
            case 34 -> 204;
            case 35 -> 139;
            case 36 -> 65;
            case 37 -> 49;
            case 38 -> 172;
            case 39 -> 161;
            case 40 -> 23;
            case 41 -> 68;
            case 42 -> 247;
            case 43 -> 30;
            case 44 -> 107;
            case 45 -> 153;
            case 46 -> 37;
            case 47 -> 210;
            case 48 -> 111;
            case 49 -> 207;
            case 50 -> 97;
            case 51 -> 188;
            case 52 -> 157;
            case 53 -> 229;
            case 54 -> 135;
            case 55 -> 230;
            case 56 -> 32;
            case 57 -> 80;
            case 58 -> 235;
            case 59 -> 203;
            case 60 -> 76;
            case 61 -> 91;
            case 62 -> 158;
            case 63 -> 122;
            case 64 -> 189;
            case 65 -> 134;
            case 66 -> 50;
            case 67 -> 186;
            case 68 -> 10;
            case 69 -> 176;
            case 70 -> 129;
            case 71 -> 14;
            case 72 -> 16;
            case 73 -> 119;
            case 74 -> 130;
            case 75 -> 225;
            case 76 -> 117;
            case 77 -> 144;
            case 78 -> 160;
            case 79 -> 252;
            case 80 -> 250;
            case 81 -> 227;
            case 82 -> 171;
            case 83 -> 19;
            case 84 -> 174;
            case 85 -> 143;
            case 86 -> 206;
            case 87 -> 55;
            case 88 -> 168;
            case 89 -> 84;
            case 90 -> 67;
            case 91 -> 126;
            case 92 -> 109;
            case 93 -> 179;
            case 94 -> 242;
            case 95 -> 183;
            case 96 -> 149;
            case 97 -> 245;
            case 98 -> 205;
            case 99 -> 45;
            case 100 -> 41;
            case 101 -> 238;
            case 102 -> 141;
            case 103 -> 21;
            case 104 -> 182;
            case 105 -> 213;
            case 106 -> 248;
            case 107 -> 194;
            case 108 -> 4;
            case 109 -> 8;
            case 110 -> 234;
            case 111 -> 7;
            case 112 -> 114;
            case 113 -> 53;
            case 114 -> 18;
            case 115 -> 56;
            case 116 -> 17;
            case 117 -> 241;
            case 118 -> 28;
            case 119 -> 103;
            case 120 -> 140;
            case 121 -> 253;
            case 122 -> 112;
            case 123 -> 115;
            case 124 -> 95;
            case 125 -> 81;
            case 126 -> 240;
            case 127 -> 170;
            case 128 -> 113;
            case 129 -> 25;
            case 130 -> 215;
            case 131 -> 69;
            case 132 -> 192;
            case 133 -> 220;
            case 134 -> 92;
            case 135 -> 255;
            case 136 -> 177;
            case 137 -> 85;
            case 138 -> 156;
            case 139 -> 89;
            case 140 -> 12;
            case 141 -> 146;
            case 142 -> 165;
            case 143 -> 36;
            case 144 -> 243;
            case 145 -> 108;
            case 146 -> 147;
            case 147 -> 123;
            case 148 -> 193;
            case 149 -> 128;
            case 150 -> 197;
            case 151 -> 219;
            case 152 -> 151;
            case 153 -> 86;
            case 154 -> 226;
            case 155 -> 121;
            case 156 -> 237;
            case 157 -> 79;
            case 158 -> 5;
            case 159 -> 94;
            case 160 -> 59;
            case 161 -> 66;
            case 162 -> 178;
            case 163 -> 239;
            case 164 -> 127;
            case 165 -> 39;
            case 166 -> 35;
            case 167 -> 208;
            case 168 -> 33;
            case 169 -> 163;
            case 170 -> 100;
            case 171 -> 222;
            case 172 -> 31;
            case 173 -> 187;
            case 174 -> 0;
            case 175 -> 62;
            case 176 -> 211;
            case 177 -> 166;
            case 178 -> 70;
            case 179 -> 201;
            case 180 -> 244;
            case 181 -> 216;
            case 182 -> 57;
            case 183 -> 6;
            case 184 -> 251;
            case 185 -> 159;
            case 186 -> 162;
            case 187 -> 9;
            case 188 -> 196;
            case 189 -> 72;
            case 190 -> 22;
            case 191 -> 48;
            case 192 -> 198;
            case 193 -> 214;
            case 194 -> 150;
            case 195 -> 200;
            case 196 -> 191;
            case 197 -> 132;
            case 198 -> 180;
            case 199 -> 202;
            case 200 -> 175;
            case 201 -> 24;
            case 202 -> 228;
            case 203 -> 152;
            case 204 -> 102;
            case 205 -> 75;
            case 206 -> 11;
            case 207 -> 90;
            case 208 -> 26;
            case 209 -> 27;
            case 210 -> 233;
            case 211 -> 223;
            case 212 -> 60;
            case 213 -> 104;
            case 214 -> 83;
            case 215 -> 87;
            case 216 -> 118;
            case 217 -> 232;
            case 218 -> 185;
            case 219 -> 15;
            case 220 -> 58;
            case 221 -> 54;
            case 222 -> 120;
            case 223 -> 136;
            case 224 -> 34;
            case 225 -> 116;
            case 226 -> 154;
            case 227 -> 47;
            case 228 -> 181;
            case 229 -> 77;
            case 230 -> 246;
            case 231 -> 145;
            case 232 -> 2;
            case 233 -> 124;
            case 234 -> 38;
            case 235 -> 3;
            case 236 -> 224;
            case 237 -> 101;
            case 238 -> 82;
            case 239 -> 51;
            case 240 -> 1;
            case 241 -> 78;
            case 242 -> 42;
            case 243 -> 110;
            case 244 -> 169;
            case 245 -> 236;
            case 246 -> 106;
            case 247 -> 64;
            case 248 -> 74;
            case 249 -> 99;
            case 250 -> 13;
            case 251 -> 137;
            case 252 -> 29;
            case 253 -> 249;
            case 254 -> 20;
            default -> 254;
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

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int var1, long var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void a(int var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final long b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(long var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull String var1, double var2) {
         short var10001 = -22356;
         short var10002 = 16537;
         Intrinsics.checkNotNullParameter(var1, "display");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull String var1, double var2
      ) {
         short var10001 = -22355;
         short var10002 = 16273;
         Intrinsics.checkNotNullParameter(var1, "display");
         return new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -22354;
         double var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 11893;
         short var10002 = -22353;
         short var10003 = 23779;
         return "Contribution(display=" + var3 + ", value=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { int var14 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "fG0íN\bj\u0007Â$¤\u0081Ü\u00858";
         int var4 = "fG0íN\bj\u0007Â$¤\u0081Ü\u00858".length();
         char var1 = 7;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 70;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                   var14 = var10004;
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
                        case 0 -> 37;
                        case 1 -> 103;
                        case 2 -> 77;
                        case 3 -> 83;
                        case 4 -> 30;
                        case 5 -> 78;
                        default -> 118;
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
                        b = new String[4];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "0÷5\u0001À9,(\u00158\u0011®n¶\u007f87ñ¸\u0011\u008f©\u0086\u0098çË7Ô_Z";
                     var4 = "0÷5\u0001À9,(\u00158\u0011®n¶\u007f87ñ¸\u0011\u008f©\u0086\u0098çË7Ô_Z".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 33;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -22355) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 146;
               case 1 -> 62;
               case 2 -> 217;
               case 3 -> 135;
               case 4 -> 37;
               case 5 -> 48;
               case 6 -> 186;
               case 7 -> 136;
               case 8 -> 243;
               case 9 -> 102;
               case 10 -> 197;
               case 11 -> 4;
               case 12 -> 120;
               case 13 -> 81;
               case 14 -> 188;
               case 15 -> 124;
               case 16 -> 206;
               case 17 -> 176;
               case 18 -> 83;
               case 19 -> 251;
               case 20 -> 82;
               case 21 -> 224;
               case 22 -> 103;
               case 23 -> 211;
               case 24 -> 230;
               case 25 -> 218;
               case 26 -> 231;
               case 27 -> 187;
               case 28 -> 90;
               case 29 -> 175;
               case 30 -> 155;
               case 31 -> 221;
               case 32 -> 119;
               case 33 -> 168;
               case 34 -> 133;
               case 35 -> 233;
               case 36 -> 75;
               case 37 -> 80;
               case 38 -> 158;
               case 39 -> 23;
               case 40 -> 182;
               case 41 -> 30;
               case 42 -> 184;
               case 43 -> 161;
               case 44 -> 109;
               case 45 -> 106;
               case 46 -> 132;
               case 47 -> 11;
               case 48 -> 123;
               case 49 -> 172;
               case 50 -> 52;
               case 51 -> 17;
               case 52 -> 203;
               case 53 -> 167;
               case 54 -> 46;
               case 55 -> 239;
               case 56 -> 238;
               case 57 -> 173;
               case 58 -> 78;
               case 59 -> 208;
               case 60 -> 246;
               case 61 -> 111;
               case 62 -> 149;
               case 63 -> 121;
               case 64 -> 179;
               case 65 -> 112;
               case 66 -> 12;
               case 67 -> 114;
               case 68 -> 95;
               case 69 -> 177;
               case 70 -> 14;
               case 71 -> 162;
               case 72 -> 91;
               case 73 -> 5;
               case 74 -> 183;
               case 75 -> 28;
               case 76 -> 241;
               case 77 -> 204;
               case 78 -> 33;
               case 79 -> 67;
               case 80 -> 79;
               case 81 -> 113;
               case 82 -> 101;
               case 83 -> 34;
               case 84 -> 97;
               case 85 -> 27;
               case 86 -> 0;
               case 87 -> 151;
               case 88 -> 87;
               case 89 -> 71;
               case 90 -> 174;
               case 91 -> 44;
               case 92 -> 170;
               case 93 -> 96;
               case 94 -> 57;
               case 95 -> 25;
               case 96 -> 219;
               case 97 -> 26;
               case 98 -> 254;
               case 99 -> 59;
               case 100 -> 1;
               case 101 -> 171;
               case 102 -> 222;
               case 103 -> 139;
               case 104 -> 245;
               case 105 -> 190;
               case 106 -> 223;
               case 107 -> 55;
               case 108 -> 38;
               case 109 -> 86;
               case 110 -> 43;
               case 111 -> 137;
               case 112 -> 153;
               case 113 -> 207;
               case 114 -> 3;
               case 115 -> 115;
               case 116 -> 117;
               case 117 -> 53;
               case 118 -> 66;
               case 119 -> 131;
               case 120 -> 10;
               case 121 -> 64;
               case 122 -> 253;
               case 123 -> 150;
               case 124 -> 250;
               case 125 -> 130;
               case 126 -> 104;
               case 127 -> 237;
               case 128 -> 19;
               case 129 -> 63;
               case 130 -> 152;
               case 131 -> 145;
               case 132 -> 198;
               case 133 -> 147;
               case 134 -> 84;
               case 135 -> 159;
               case 136 -> 213;
               case 137 -> 156;
               case 138 -> 69;
               case 139 -> 18;
               case 140 -> 42;
               case 141 -> 178;
               case 142 -> 9;
               case 143 -> 205;
               case 144 -> 8;
               case 145 -> 47;
               case 146 -> 244;
               case 147 -> 164;
               case 148 -> 36;
               case 149 -> 39;
               case 150 -> 15;
               case 151 -> 29;
               case 152 -> 68;
               case 153 -> 236;
               case 154 -> 21;
               case 155 -> 180;
               case 156 -> 255;
               case 157 -> 40;
               case 158 -> 65;
               case 159 -> 50;
               case 160 -> 118;
               case 161 -> 212;
               case 162 -> 185;
               case 163 -> 154;
               case 164 -> 85;
               case 165 -> 229;
               case 166 -> 110;
               case 167 -> 122;
               case 168 -> 35;
               case 169 -> 201;
               case 170 -> 209;
               case 171 -> 20;
               case 172 -> 73;
               case 173 -> 166;
               case 174 -> 140;
               case 175 -> 160;
               case 176 -> 92;
               case 177 -> 228;
               case 178 -> 31;
               case 179 -> 49;
               case 180 -> 220;
               case 181 -> 13;
               case 182 -> 200;
               case 183 -> 143;
               case 184 -> 165;
               case 185 -> 240;
               case 186 -> 194;
               case 187 -> 202;
               case 188 -> 24;
               case 189 -> 215;
               case 190 -> 99;
               case 191 -> 105;
               case 192 -> 163;
               case 193 -> 88;
               case 194 -> 252;
               case 195 -> 128;
               case 196 -> 189;
               case 197 -> 216;
               case 198 -> 94;
               case 199 -> 54;
               case 200 -> 196;
               case 201 -> 210;
               case 202 -> 148;
               case 203 -> 141;
               case 204 -> 235;
               case 205 -> 249;
               case 206 -> 126;
               case 207 -> 74;
               case 208 -> 22;
               case 209 -> 116;
               case 210 -> 6;
               case 211 -> 32;
               case 212 -> 72;
               case 213 -> 7;
               case 214 -> 127;
               case 215 -> 16;
               case 216 -> 248;
               case 217 -> 41;
               case 218 -> 169;
               case 219 -> 98;
               case 220 -> 234;
               case 221 -> 138;
               case 222 -> 58;
               case 223 -> 192;
               case 224 -> 181;
               case 225 -> 134;
               case 226 -> 199;
               case 227 -> 56;
               case 228 -> 61;
               case 229 -> 89;
               case 230 -> 60;
               case 231 -> 108;
               case 232 -> 242;
               case 233 -> 77;
               case 234 -> 100;
               case 235 -> 191;
               case 236 -> 70;
               case 237 -> 142;
               case 238 -> 195;
               case 239 -> 227;
               case 240 -> 226;
               case 241 -> 51;
               case 242 -> 76;
               case 243 -> 125;
               case 244 -> 214;
               case 245 -> 225;
               case 246 -> 93;
               case 247 -> 247;
               case 248 -> 193;
               case 249 -> 129;
               case 250 -> 144;
               case 251 -> 107;
               case 252 -> 232;
               case 253 -> 45;
               case 254 -> 157;
               default -> 2;
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
   
   // PX-FIX RC2: Kotlin default-args sibling, restored from jar bytecode
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI px0, String var0, double var1, int pxMask, Object pxMarker) {
      int[] disc = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
      if (disc == null && (pxMask & 1) != 0) {
         var0 = px0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if (disc == null && (pxMask & 2) != 0) {
         var1 = px0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      return px0.a(var0, var1);
   }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final String a(@NotNull String var1) {
         short var10001 = -945;
         short var10002 = -5658;
         Intrinsics.checkNotNullParameter(var1, "id");
         String var10000 = var1.toLowerCase(Locale.ROOT);
         var10002 = -953;
         short var10003 = -27714;
         Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
         CharSequence var3 = var10000;
         String[] var2 = new String[]{"_"};
         return CollectionsKt.joinToString(
            StringsKt.split(var3, var2, false, 0),
            " ",
            "",
            "",
            -1,
            "...",
            lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll::b
         );
      }

      @NotNull
      public final String a(double var1) { short var14 = (short)0; // PX-FIX hoist
        
         int[] var3 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
         double var24;
         int var10000 = (var24 = var1 - 1.0E9) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
         if (var3 == null) {
            if (var10000 >= 0) {
               short var17 = -946;
               Locale var8 = Locale.US;
               short var19 = 8037;
               String var10 = "%.2fB";
               Object[] var12 = new Object[]{var1 / 1000000000};
               String var28 = String.format(var8, var10, Arrays.copyOf(var12, var12.length));
               short var21 = -948;
               short var23 = -26912;
               Intrinsics.checkNotNullExpressionValue(var28, "format(...)");
               return var28;
            }

            double var25;
            var10000 = (var25 = var1 - 1000000.0) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
         }

         if (var3 == null) {
            if (var10000 >= 0) {
               short var16 = -956;
               Locale var7 = Locale.US;
               short var18 = 18470;
               String var9 = "%.2fM";
               Object[] var11 = new Object[]{var1 / 1000000};
               String var27 = String.format(var7, var9, Arrays.copyOf(var11, var11.length));
               short var20 = -949;
               short var22 = 19390;
               Intrinsics.checkNotNullExpressionValue(var27, "format(...)");
               return var27;
            }

            if (var3 != null) {
               return String.valueOf((long)var1);
            }

            double var26;
            var10000 = (var26 = var1 - 1000.0) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
         }

         if (var10000 >= 0) {
             var14 = -955;
            Locale var4 = Locale.US;
            short var10001 = -10560;
            String var5 = "%.1fk";
            Object[] var6 = new Object[]{var1 / 1000};
            String var15 = String.format(var4, var5, Arrays.copyOf(var6, var6.length));
            short var10002 = -949;
            short var10003 = 19390;
            Intrinsics.checkNotNullExpressionValue(var15, "format(...)");
            return var15;
         } else {
            return String.valueOf((long)var1);
         }
      }

      private static final CharSequence b(String var0) {
         short var10001 = -951;
         short var10002 = -6527;
         Intrinsics.checkNotNullParameter(var0, "it");
         int[] var1 = IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll.h();
         int var10000 = var0.length();
         if (var1 == null) {
            var10000 = var10000 > 0 ? 1 : 0;
         }

         String var11;
         if (var10000 != 0) {
            StringBuilder var7 = new StringBuilder();
            char var3 = var0.charAt(0);
            StringBuilder var5 = var7;
            byte var4 = 0;
            String var8 = String.valueOf(var3);
            var10002 = -950;
            short var10003 = 11478;
            Intrinsics.checkNotNull(var8, "null cannot be cast to non-null type java.lang.String");
            String var9 = var8.toUpperCase(Locale.ROOT);
            var10002 = -947;
            var10003 = 30984;
            Intrinsics.checkNotNullExpressionValue(var9, "toUpperCase(...)");
            StringBuilder var10 = var5.append(var9);
            var4 = 1;
            String var12 = var0.substring(var4);
            var10003 = -952;
            short var10004 = 13325;
            Intrinsics.checkNotNullExpressionValue(var12, "substring(...)");
            var11 = var10.append(var12).toString();
         } else {
            var11 = var0;
         }

         return var11;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { int var14 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[11];
         int var3 = 0;
         String var2 = ">×\u0086\u008aæ\u009b+\u0006¤v>Bñ°\u0004H\u000bP@<ecÉò\u0012Áix\u0002ñ\u009c\u0005nÀ\u0090\u0017\u009d\u0002gü\u000eå«-_FU \u0007«\u0085R\n^x\u000b\u0081\u0018\u0006n$¨\u001a>ÜìÛ5[õJ\u008b1\"\u0098Ú¬yÀ4Q<Û±ÐÈ\u009aõ&\n\u0082C\u0099\u001cMµ«å,ÿ©sD¢J\u0019\u008eË,\u0014[\u0094\n:uNÊ}V\u0013k\u0005\u008d\u000bïn8";
         int var4 = ">×\u0086\u008aæ\u009b+\u0006¤v>Bñ°\u0004H\u000bP@<ecÉò\u0012Áix\u0002ñ\u009c\u0005nÀ\u0090\u0017\u009d\u0002gü\u000eå«-_FU \u0007«\u0085R\n^x\u000b\u0081\u0018\u0006n$¨\u001a>ÜìÛ5[õJ\u008b1\"\u0098Ú¬yÀ4Q<Û±ÐÈ\u009aõ&\n\u0082C\u0099\u001cMµ«å,ÿ©sD¢J\u0019\u008eË,\u0014[\u0094\n:uNÊ}V\u0013k\u0005\u008d\u000bïn8"
            .length();
         char var1 = 16;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 83;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                   var14 = var10004;
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
                        case 0 -> 7;
                        case 1 -> 100;
                        case 2 -> 55;
                        case 3 -> 55;
                        case 4 -> 102;
                        case 5 -> 14;
                        default -> 14;
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
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "+¥=¾\"\u0010t3Ó\ft²\u009b&·wYg\u0018\u0011<y";
                     var4 = "+¥=¾\"\u0010t3Ó\ft²\u009b&·wYg\u0018\u0011<y".length();
                     var1 = 5;
                     var8 = -1;
               }

               var10000 = 114;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -947) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 69;
               case 1 -> 73;
               case 2 -> 111;
               case 3 -> 235;
               case 4 -> 126;
               case 5 -> 49;
               case 6 -> 247;
               case 7 -> 220;
               case 8 -> 210;
               case 9 -> 79;
               case 10 -> 128;
               case 11 -> 139;
               case 12 -> 238;
               case 13 -> 32;
               case 14 -> 237;
               case 15 -> 117;
               case 16 -> 30;
               case 17 -> 207;
               case 18 -> 56;
               case 19 -> 15;
               case 20 -> 203;
               case 21 -> 202;
               case 22 -> 245;
               case 23 -> 134;
               case 24 -> 149;
               case 25 -> 62;
               case 26 -> 224;
               case 27 -> 58;
               case 28 -> 181;
               case 29 -> 94;
               case 30 -> 81;
               case 31 -> 148;
               case 32 -> 221;
               case 33 -> 8;
               case 34 -> 101;
               case 35 -> 233;
               case 36 -> 67;
               case 37 -> 40;
               case 38 -> 135;
               case 39 -> 98;
               case 40 -> 180;
               case 41 -> 253;
               case 42 -> 236;
               case 43 -> 212;
               case 44 -> 25;
               case 45 -> 92;
               case 46 -> 22;
               case 47 -> 108;
               case 48 -> 48;
               case 49 -> 200;
               case 50 -> 77;
               case 51 -> 39;
               case 52 -> 137;
               case 53 -> 129;
               case 54 -> 116;
               case 55 -> 121;
               case 56 -> 47;
               case 57 -> 74;
               case 58 -> 70;
               case 59 -> 194;
               case 60 -> 219;
               case 61 -> 9;
               case 62 -> 133;
               case 63 -> 252;
               case 64 -> 228;
               case 65 -> 96;
               case 66 -> 199;
               case 67 -> 205;
               case 68 -> 31;
               case 69 -> 63;
               case 70 -> 169;
               case 71 -> 170;
               case 72 -> 193;
               case 73 -> 44;
               case 74 -> 3;
               case 75 -> 240;
               case 76 -> 84;
               case 77 -> 145;
               case 78 -> 222;
               case 79 -> 124;
               case 80 -> 159;
               case 81 -> 91;
               case 82 -> 231;
               case 83 -> 0;
               case 84 -> 21;
               case 85 -> 5;
               case 86 -> 168;
               case 87 -> 86;
               case 88 -> 248;
               case 89 -> 115;
               case 90 -> 10;
               case 91 -> 164;
               case 92 -> 114;
               case 93 -> 206;
               case 94 -> 171;
               case 95 -> 71;
               case 96 -> 195;
               case 97 -> 179;
               case 98 -> 255;
               case 99 -> 189;
               case 100 -> 27;
               case 101 -> 143;
               case 102 -> 23;
               case 103 -> 103;
               case 104 -> 7;
               case 105 -> 162;
               case 106 -> 234;
               case 107 -> 102;
               case 108 -> 2;
               case 109 -> 72;
               case 110 -> 146;
               case 111 -> 197;
               case 112 -> 223;
               case 113 -> 160;
               case 114 -> 106;
               case 115 -> 24;
               case 116 -> 87;
               case 117 -> 144;
               case 118 -> 46;
               case 119 -> 59;
               case 120 -> 66;
               case 121 -> 178;
               case 122 -> 225;
               case 123 -> 147;
               case 124 -> 52;
               case 125 -> 218;
               case 126 -> 154;
               case 127 -> 214;
               case 128 -> 165;
               case 129 -> 20;
               case 130 -> 188;
               case 131 -> 186;
               case 132 -> 16;
               case 133 -> 242;
               case 134 -> 41;
               case 135 -> 173;
               case 136 -> 28;
               case 137 -> 89;
               case 138 -> 183;
               case 139 -> 99;
               case 140 -> 113;
               case 141 -> 4;
               case 142 -> 192;
               case 143 -> 68;
               case 144 -> 104;
               case 145 -> 125;
               case 146 -> 175;
               case 147 -> 136;
               case 148 -> 120;
               case 149 -> 85;
               case 150 -> 78;
               case 151 -> 158;
               case 152 -> 227;
               case 153 -> 156;
               case 154 -> 198;
               case 155 -> 249;
               case 156 -> 61;
               case 157 -> 209;
               case 158 -> 190;
               case 159 -> 82;
               case 160 -> 64;
               case 161 -> 243;
               case 162 -> 150;
               case 163 -> 166;
               case 164 -> 140;
               case 165 -> 26;
               case 166 -> 65;
               case 167 -> 95;
               case 168 -> 14;
               case 169 -> 226;
               case 170 -> 229;
               case 171 -> 131;
               case 172 -> 241;
               case 173 -> 90;
               case 174 -> 141;
               case 175 -> 177;
               case 176 -> 110;
               case 177 -> 75;
               case 178 -> 6;
               case 179 -> 42;
               case 180 -> 208;
               case 181 -> 213;
               case 182 -> 123;
               case 183 -> 118;
               case 184 -> 76;
               case 185 -> 232;
               case 186 -> 244;
               case 187 -> 239;
               case 188 -> 251;
               case 189 -> 19;
               case 190 -> 153;
               case 191 -> 119;
               case 192 -> 43;
               case 193 -> 36;
               case 194 -> 155;
               case 195 -> 29;
               case 196 -> 184;
               case 197 -> 60;
               case 198 -> 176;
               case 199 -> 142;
               case 200 -> 100;
               case 201 -> 127;
               case 202 -> 157;
               case 203 -> 163;
               case 204 -> 34;
               case 205 -> 105;
               case 206 -> 54;
               case 207 -> 38;
               case 208 -> 187;
               case 209 -> 13;
               case 210 -> 45;
               case 211 -> 174;
               case 212 -> 152;
               case 213 -> 11;
               case 214 -> 217;
               case 215 -> 83;
               case 216 -> 161;
               case 217 -> 196;
               case 218 -> 33;
               case 219 -> 182;
               case 220 -> 1;
               case 221 -> 172;
               case 222 -> 51;
               case 223 -> 132;
               case 224 -> 211;
               case 225 -> 250;
               case 226 -> 97;
               case 227 -> 130;
               case 228 -> 191;
               case 229 -> 17;
               case 230 -> 88;
               case 231 -> 80;
               case 232 -> 230;
               case 233 -> 185;
               case 234 -> 37;
               case 235 -> 55;
               case 236 -> 109;
               case 237 -> 93;
               case 238 -> 107;
               case 239 -> 138;
               case 240 -> 122;
               case 241 -> 35;
               case 242 -> 204;
               case 243 -> 112;
               case 244 -> 167;
               case 245 -> 216;
               case 246 -> 246;
               case 247 -> 53;
               case 248 -> 151;
               case 249 -> 57;
               case 250 -> 215;
               case 251 -> 50;
               case 252 -> 254;
               case 253 -> 201;
               case 254 -> 18;
               default -> 12;
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
}
