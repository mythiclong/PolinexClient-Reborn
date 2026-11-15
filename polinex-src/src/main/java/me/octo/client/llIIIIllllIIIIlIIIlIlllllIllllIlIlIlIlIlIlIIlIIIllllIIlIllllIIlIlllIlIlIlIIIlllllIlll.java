package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll
   extends llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII {
   @NotNull
   public static llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static List<llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @NotNull
   private static Map<me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI, String> IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @NotNull
   private static Map<String, me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @NotNull
   private static String[] lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static String[] c;
   private static String[] d;

   private llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll() {
      short var10001 = -31659;
      short var10002 = 17863;
      var10002 = -31635;
      short var10003 = 29948;
      var10003 = -31624;
      short var10004 = 13140;
      var10004 = -31650;
      short var10005 = 18777;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] var1 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      };
      List var6 = CollectionsKt.arrayListOf(var1);
      short var10006 = -31657;
      short var10007 = 6708;
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      String[] var2 = new String[6];
      short var10010 = -31660;
      short var10011 = 16265;
      var2[0] = "Hub";
      var10010 = -31672;
      var10011 = 21648;
      var2[1] = "Crimson_Isle";
      var10010 = -31680;
      var10011 = 7269;
      var2[2] = "The_Park";
      var10010 = -31644;
      var10011 = 14701;
      var2[3] = "Spiders_Den";
      var10010 = -31666;
      var10011 = -31422;
      var2[4] = "Backwater_Bayou";
      var10010 = -31674;
      var10011 = -5353;
      var2[5] = "Galatea";
      super(
         "Fishing Route Editor",
         "FishingMacro-Routes",
         "FishingMacro",
         "fishing_route",
         var6,
         "fishing",
         var7,
         CollectionsKt.listOf(var2),
         CollectionsKt.emptyList(),
         false,
         true,
         true,
         false,
         4608,
         null
      );
   }

   @NotNull
   public final List<llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII> S() {
      return lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   }

   @NotNull
   public final String[] T() {
      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   }

   @Nullable
   @Override
   public String C() {
      me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
      return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.get(var1);
   }

   @Nullable
   @Override
   public String D() {
      return this.C();
   }

   @Nullable
   @Override
   public String E() {
      return IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d()
         .V();
   }

   @Override
   public boolean G() {
      Object lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII = null; // PX-FIX
      String var1 = ((me.octo.client.PXDyn)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII).Q();
      boolean var10000 = this.I();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .al();
      }

      return var1 == null ? var10000 : var10000;
   }

   @NotNull
   @Override
   public ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> B() {
      Object lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII = null; // PX-FIX
      String var1 = ((me.octo.client.PXDyn)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII).Q();
      if (var1 != null) {
         String var10000 = this.D();
         if (var10000 != null) {
            String var2 = var10000;
            if (var1 != null) {
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var11 = this.o(var2);
               if (var11 != null) {
                  me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = var11;
                  Iterable var5 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  boolean var6 = false;
                  Iterator var7 = var5.iterator();

                  label37:
                  while (true) {
                     if (var7.hasNext()) {
                        Object var8 = var7.next();
                        var10000 = (String)var8;

                        while (true) {
                           llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var9 = (llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII)(Object)var10000;
                           boolean var10 = false;
                           if (var9.b() != var3) {
                              continue label37;
                           }

                           var10000 = (String)var8;
                           if (var1 != null) {
                              break label37;
                           }
                        }
                     }

                     var10000 = null;
                     break;
                  }

                  llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var13 = (llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII)(Object)var10000;
                  if ((llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII)(Object)var10000 == null) {
                     return new ArrayList<>();
                  }

                  llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var4 = var13;
                  this.a(var4.b());
                  this.a(
                     new IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI(
                        ((Number)var4.g().getFirst()).floatValue(), ((Number)var4.g().getSecond()).floatValue()
                     )
                  );
                  return new ArrayList<>(var4.e());
               }
            }

            return new ArrayList<>();
         }
      }

      return new ArrayList<>();
   }

   @Override
   public boolean I() {
      return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.containsKey(
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   @NotNull
   @Override
   public IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl J() {
      return IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
   }

   @Nullable
   public final me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI o(@NotNull String var1) {
      short var10001 = -31661;
      short var10002 = -22703;
      Intrinsics.checkNotNullParameter(var1, "folderName");
      return IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.get(var1);
   }

   @Nullable
   public final String b(@NotNull me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1) {
      short var10001 = -31678;
      short var10002 = -14033;
      Intrinsics.checkNotNullParameter(var1, "location");
      return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.get(var1);
   }

   public final boolean c(@NotNull me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1) {
      short var10001 = -31652;
      short var10002 = 13356;
      Intrinsics.checkNotNullParameter(var1, "location");
      return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.containsKey(var1);
   }

   @Override
   public void a(@NotNull String[] var1) {
      Object lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII = null; // PX-FIX
      String var10000 = ((me.octo.client.PXDyn)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII).Q();
      short var10002 = -31620;
      short var10003 = -19655;
      Intrinsics.checkNotNullParameter(var1, "msg");
      String var2 = var10000;
      int var5 = var1.length;
      if (var2 != null) {
         var5 = var5 == 0 ? 1 : 0;
      }

      if (var5 != 0) {
         super.a(var1);
      } else {
         var10000 = var1[0].toLowerCase(Locale.ROOT);
         var10002 = -31647;
         var10003 = -12153;
         Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
         String var3 = var10000;
         if (var2 != null) {
            short var10001 = -31646;
            var10002 = 26034;
            if (Intrinsics.areEqual(var3, "createroute")) {
               String[] var7 = var1;
               if (var2 != null) {
                  if (var1.length < 2) {
                     short var8 = -31663;
                     var10001 = -16127;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        "§cUsage: /fishing createroute <name>"
                     );
                     if (var2 != null) {
                        return;
                     }
                  }

                  var7 = var1;
               }

               String var4 = CollectionsKt.joinToString(ArraysKt.slice(var7, RangesKt.until(1, var1.length)), " ", null, null, 0, null, null);
               this.p(var4);
               return;
            }

            super.a(var1);
         }
      }
   }

   public final boolean p(@NotNull String param1) {
      Object lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII = null; // PX-FIX
      Intrinsics.checkNotNullParameter(param1, "routeName");
      me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      String var4 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.get(var3);
      if (var4 == null) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, "Fishing Route Editor", "You must be in a valid fishing location (Hub, Crimson Isle, Barn, Park, Spider's Den, Galatea, or Backwater Bayou)", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         return false;
      }

      if (kotlin.text.StringsKt.isBlank(param1) || new kotlin.text.Regex("[/\\\\.]").containsMatchIn(param1)) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, "Fishing Route Editor", "Invalid route name. Avoid using special characters.", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         return false;
      }

      boolean var6;
      try {
         java.nio.file.Path var5 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(this.b(), var4);
         if (!java.nio.file.Files.exists(var5, new java.nio.file.LinkOption[0])) {
            Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.createDirectories(var5, new java.nio.file.attribute.FileAttribute[0]), "createDirectories(...)");
         }

         java.nio.file.Path var7 = var5.resolve(param1 + ".json");
         Intrinsics.checkNotNull(var7);
         if (java.nio.file.Files.exists(var7, new java.nio.file.LinkOption[0])) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, "Fishing Route Editor", "Route '" + param1 + "' already exists in " + var4, me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            return false;
         }

         me.octo.client.IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var8 = new me.octo.client.IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(CollectionsKt.emptyList(), me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var3), null, null);
         java.io.File var9 = var7.toFile();
         Intrinsics.checkNotNullExpressionValue(var9, "toFile(...)");
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var8, var9, true);
         me.octo.client.IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().F();
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, "Fishing Route Editor", "Created route '" + param1 + "' in " + var4 + "! Use /fishing add to add waypoints.", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var6 = true;
      } catch (Exception var10) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, "Fishing Route Editor", "Failed to create route: " + var10.getMessage(), me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var6 = false;
      }

      return var6;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.Q ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -31638
      // 007: sipush 31168
      // 00a: pop2
      // 00b: ldc_w "routeName"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 014: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 017: astore 3
      // 018: getstatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Ljava/util/Map;
      // 01b: aload 3
      // 01c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 021: checkcast java/lang/String
      // 024: astore 4
      // 026: astore 2
      // 027: aload 4
      // 029: aload 2
      // 02a: ifnull 060
      // 02d: ifnonnull 05c
      // 030: goto 037
      // 033: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 03a: ldc2_w 5000
      // 03d: sipush -31664
      // 040: sipush 5318
      // 043: pop2
      // 044: ldc "Fishing Route Editor"
      // 046: sipush -31653
      // 049: sipush -13370
      // 04c: pop2
      // 04d: ldc_w "You must be in a valid fishing location (Hub, Crimson Isle, Barn, Park, Spider's Den, Galatea, or Backwater Bayou)"
      // 050: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 053: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 056: bipush 0
      // 057: ireturn
      // 058: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: aload 1
      // 05d: checkcast java/lang/CharSequence
      // 060: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 063: aload 2
      // 064: ifnull 0bb
      // 067: ifne 09b
      // 06a: goto 071
      // 06d: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 1
      // 072: checkcast java/lang/CharSequence
      // 075: astore 5
      // 077: aload 2
      // 078: ifnull 0bd
      // 07b: new kotlin/text/Regex
      // 07e: dup
      // 07f: sipush -31636
      // 082: sipush -4218
      // 085: pop2
      // 086: ldc_w "[/\\\\.]"
      // 089: invokespecial kotlin/text/Regex.<init> (Ljava/lang/String;)V
      // 08c: aload 5
      // 08e: invokevirtual kotlin/text/Regex.containsMatchIn (Ljava/lang/CharSequence;)Z
      // 091: ifeq 0bc
      // 094: goto 09b
      // 097: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 09e: ldc2_w 5000
      // 0a1: sipush -31664
      // 0a4: sipush 5318
      // 0a7: pop2
      // 0a8: ldc "Fishing Route Editor"
      // 0aa: sipush -31662
      // 0ad: sipush -15408
      // 0b0: pop2
      // 0b1: ldc_w "Invalid route name. Avoid using special characters."
      // 0b4: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0b7: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 0ba: bipush 0
      // 0bb: ireturn
      // 0bc: nop
      // 0bd: getstatic me/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl;
      // 0c0: aload 0
      // 0c1: invokevirtual me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b ()Ljava/lang/String;
      // 0c4: aload 4
      // 0c6: invokevirtual me/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.b (Ljava/lang/String;Ljava/lang/String;)Ljava/nio/file/Path;
      // 0c9: astore 5
      // 0cb: aload 5
      // 0cd: aload 2
      // 0ce: ifnull 128
      // 0d1: bipush 0
      // 0d2: anewarray 362
      // 0d5: dup
      // 0d6: arraylength
      // 0d7: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0da: checkcast [Ljava/nio/file/LinkOption;
      // 0dd: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 0e0: ifne 111
      // 0e3: goto 0ea
      // 0e6: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 5
      // 0ec: bipush 0
      // 0ed: anewarray 380
      // 0f0: dup
      // 0f1: arraylength
      // 0f2: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0f5: checkcast [Ljava/nio/file/attribute/FileAttribute;
      // 0f8: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 0fb: dup
      // 0fc: sipush -31640
      // 0ff: sipush 29703
      // 102: pop2
      // 103: ldc_w "createDirectories(...)"
      // 106: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 109: pop
      // 10a: goto 111
      // 10d: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 5
      // 113: aload 1
      // 114: sipush -31630
      // 117: sipush -10317
      // 11a: pop2
      // 11b: ldc_w ".json"
      // 11e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 123: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 128: astore 6
      // 12a: aload 6
      // 12c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 12f: aload 6
      // 131: bipush 0
      // 132: anewarray 362
      // 135: dup
      // 136: arraylength
      // 137: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 13a: checkcast [Ljava/nio/file/LinkOption;
      // 13d: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 140: aload 2
      // 141: ifnull 18a
      // 144: ifeq 18b
      // 147: goto 14e
      // 14a: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 151: ldc2_w 5000
      // 154: sipush -31664
      // 157: sipush 5318
      // 15a: pop2
      // 15b: ldc "Fishing Route Editor"
      // 15d: aload 1
      // 15e: aload 4
      // 160: sipush -31619
      // 163: sipush 1333
      // 166: pop2
      // 167: ldc_w "Route '"
      // 16a: dup_x2
      // 16b: pop
      // 16c: sipush -31675
      // 16f: sipush -27096
      // 172: pop2
      // 173: ldc_w "' already exists in "
      // 176: swap
      // 177: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 17c: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 17f: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 182: bipush 0
      // 183: goto 18a
      // 186: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: ireturn
      // 18b: new me/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll
      // 18e: dup
      // 18f: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 192: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 195: aload 3
      // 196: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.b (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;)Ljava/lang/String;
      // 199: aconst_null
      // 19a: aconst_null
      // 19b: bipush 8
      // 19d: aconst_null
      // 19e: invokespecial me/octo/client/IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.<init> (Ljava/util/List;Ljava/lang/String;Lme/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI;Lme/octo/client/lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 1a1: astore 7
      // 1a3: getstatic me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
      // 1a6: aload 7
      // 1a8: aload 6
      // 1aa: invokeinterface java/nio/file/Path.toFile ()Ljava/io/File; 1
      // 1af: dup
      // 1b0: sipush -31623
      // 1b3: sipush 10073
      // 1b6: pop2
      // 1b7: ldc_w "toFile(...)"
      // 1ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1bd: bipush 1
      // 1be: invokevirtual me/octo/client/utils/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.b (Ljava/lang/Object;Ljava/io/File;Z)V
      // 1c1: getstatic me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI;
      // 1c4: invokevirtual me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.d ()Lme/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll;
      // 1c7: invokevirtual me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.F ()V
      // 1ca: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 1cd: ldc2_w 5000
      // 1d0: sipush -31664
      // 1d3: sipush 5318
      // 1d6: pop2
      // 1d7: ldc "Fishing Route Editor"
      // 1d9: aload 1
      // 1da: aload 4
      // 1dc: sipush -31668
      // 1df: sipush 5381
      // 1e2: pop2
      // 1e3: ldc_w "Created route '"
      // 1e6: dup_x2
      // 1e7: pop
      // 1e8: sipush -31671
      // 1eb: sipush -21336
      // 1ee: pop2
      // 1ef: ldc_w "' in "
      // 1f2: swap
      // 1f3: sipush -31629
      // 1f6: sipush -17702
      // 1f9: pop2
      // 1fa: ldc_w "! Use /fishing add to add waypoints."
      // 1fd: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 202: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 205: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 208: bipush 1
      // 209: istore 5
      // 20b: goto 23d
      // 20e: astore 6
      // 210: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 213: ldc2_w 5000
      // 216: sipush -31664
      // 219: sipush 5318
      // 21c: pop2
      // 21d: ldc "Fishing Route Editor"
      // 21f: aload 6
      // 221: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 224: sipush -31648
      // 227: sipush -6329
      // 22a: pop2
      // 22b: ldc_w "Failed to create route: "
      // 22e: swap
      // 22f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 234: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 237: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 23a: bipush 0
      // 23b: istore 5
      // 23d: iload 5
      // 23f: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 242: ifnonnull 252
      // 245: ldc_w "WwKwT"
      // 248: invokestatic me/octo/client/lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII.f (Ljava/lang/String;)V
      // 24b: goto 252
      // 24e: invokestatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 251: athrow
      // 252: ireturn
   }

   @Override
   public void A() {
      Object lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII = null; // PX-FIX
      short var10000 = -31655;
      short var10001 = -25019;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Basic Fishing Macro commands");
      String var10002 = this.f();
      short var10003 = -31658;
      short var10004 = 16054;
      this.m("/" + var10002 + " help - Gives a list of possible commands");
      var10002 = this.f();
      var10003 = -31676;
      short var38 = -53;
      this.m("/" + var10002 + " createroute [name] - Creates a new route");
      var10002 = this.f();
      var10003 = -31641;
      var38 = -9222;
      this.m("/" + var10002 + " deleteroute [name] - Deletes an existing route");
      var10002 = this.f();
      var10003 = -31643;
      var38 = 7706;
      this.m("/" + var10002 + " copy - Copies a route to clipboard");
      var10002 = this.f();
      var10003 = -31651;
      var38 = -25523;
      this.m("/" + var10002 + " import - Imports a route from clipboard");
      var10000 = -31633;
      var10001 = 15203;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Route editing commands");
      String var5 = ((me.octo.client.PXDyn)lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII).Q();
      String var35 = this.f();
      var38 = -31670;
      short var10005 = -12550;
      this.m("/" + var35 + " clear - Removes all waypoints");
      String var1 = var5;
      var10002 = this.f();
      var10003 = -31642;
      var38 = -18471;
      this.m("/" + var10002 + " add [type] [number (optional)]");
      var10002 = this.f();
      var10003 = -31645;
      var38 = -12944;
      this.m("/" + var10002 + " remove [number (optional)]");
      var10001 = -31667;
      short var23 = 22577;
      this.m("[number] is at which waypoint number the waypoint will be added or inserted");
      var10000 = -31649;
      var10001 = -15047;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Allowed waypoint types");

      for (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var3 : this.e()) {
         label51: {
            label50: {
               label49: {
                  label48: {
                     label47: {
                        label46: {
                           label59: {
                              if (var1 != null) {
                                 switch (((int[])(Object)(llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl))[var3.ordinal()]) { // PX-FIX switchmap-string

                                    case 1:
                                       var10001 = -31637;
                                       short var24 = -5352;
                                       this.m("walk is for pathfinding to the waypoint");
                                       break;
                                    case 2:
                                       break label59;
                                    case 3:
                                       break label46;
                                    case 4:
                                       break label47;
                                    case 5:
                                       break label48;
                                    case 6:
                                       break label49;
                                    case 7:
                                       break label50;
                                    default:
                                       break label51;
                                 }
                              }

                              if (var1 != null) {
                                 continue;
                              }

                              lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                                 new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
                              );
                           }

                           var10001 = -31618;
                           short var25 = 3453;
                           this.m("warp is for etherwarping to the waypoint");
                           if (var1 != null) {
                              continue;
                           }
                        }

                        var10001 = -31656;
                        short var26 = -15817;
                        this.m("mine is for mining the block the mine waypoint highlights");
                        if (var1 != null) {
                           continue;
                        }
                     }

                     var10001 = -31634;
                     short var27 = -12254;
                     this.m("vein is for starting mining when the previous waypoint has been reached");
                     if (var1 != null) {
                        continue;
                     }
                  }

                  var10001 = -31639;
                  short var28 = 11551;
                  this.m("tree is for starting tree mining when the previous waypoint has been reached");
                  if (var1 != null) {
                     continue;
                  }
               }

               var10001 = -31673;
               short var29 = 24010;
               this.m("heat is for a cooling off waypoint");
               if (var1 != null) {
                  continue;
               }
            }

            var10001 = -31665;
            short var30 = -23736;
            this.m("rotation adds the final rotation to your route (i.e. fishing route)");
         }

         if (var1 == null) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var45 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[58];
      int var3 = 0;
      String var2 = "3\fÂh\u001e!þ°\u007f:\u001f\u008a\u0095»´üOrÿÎÚìíy×N\u000bb]»>+\u008b2O\u0005q2XÆÃ\fÌy\u0007´{r¼ô\u0093\u0085´dC\u0094\u0012\u0006kâ\u0002i\ra¿¦r\u0004&\u008ef\u0092CQnN\u008fè@Dï\u008b¾\u0098\u001dZCEôC#}óF\"xª#òN*¿ï\u001a\u0099\u008c*²dPõA$ÿmÐ\u001fñÍ&ÛÝ\u000fÑÿ\u008f\u0013%Né\u0086[\u009aß*ÃÇ<K\u0094Ø\u000b\u001ft\rrR¼\t\névÍÄÚ\ba«Kú\u001cô¿ibq\u0000ymg6\u008e4Ô½\u009d#5W¨ô7\u0090\u0007á[\u009bû\u0097\u001cc¼è\u001d>\u0085'Än\u001d\u000b\u008fï\u0098w{\u0017nul/ìv¯\u000f\u0081à¢\u008bE\u0012\u0096Ì¦\u000eW\u009b\u001f\tj\b-sÂ\u009emM%è\bÅ`æ%\u000bËT4\u0007\u009a Lâ°?-\bÜkü\u009dª-Ýä\"²L\u008eþ\u0010\u0007õã+ëwsøÊVüv»\u0089³²\u0092\\Ì¥¿\"\u0012Ã\u0091\u009dïó\u0086\u0007áS#\u008c]ò\u0090\u0014C¶\u0016TQE×b XýûTÛÝû½ÁQ\u0017)©æ¿|\u0006yHÀA\u008d\u0014£\u0013FOwû\fN#²\u0007sjê¼«\u001f\u009bäÓRõ@Ê\u0086\\G\b²ôrÝ®`½\u0016\u00adÑ}éë¶ß=\u0011¤\u000eL0`\u0099\u0088Ñ\u009bhôxùÛS¶5ûA¶kÊ§\u0010\u0014\fBMwdÅHþ\u0014=´~åv²o¡\u0086¢Áw\u007fà7X\u0018T0ceêÛ\u0095],WÔkgm\u007f\u0084\u001a\u009aAÑE\b'n\u0083ø?jÞê±@4\u0011-\u0097I&\u0005\u0089ïWÈ^ðó\u009c:Ö\f¾\u0081I«²\u0091\u0085\u0088´\nP\u0095\u001c6ìcs¾A>\u0002Ô°$±ì\u0015<\tÜÔWÍ«\u0095ù\u0081T2è69Ï\u0000\u008bë^\u0096<Ñ\u0012\u00adP»\u0010\u009aË\u0090hû\"Ë¨\u0081¾GU\u0005cé$¡\u0014akÃ\u0080±ßi\u008fÄZ\u0005\u0015Y\u0092Ñ}ãB\u0019\u008a\u0018\u0097)\u0095zÃ\u0016\\\u008dRõp\u0012SÌ\u001b\u0000I\u0091[\u0085ànC\u0089\u0099ð t\rêUXLÓÉù¢(S\u00860%(=E2VE\u008dþÊæ\u0081×Õ¡µ_®xÅß÷dÒ+p\u0011xÆùz\u00801yÂ\u0002i\u0001Ò³`ó\b\u0081Únr\u001a!vi\n]º±{\u001e¾äí\u0098I3à\u008aÖY¢Dq\u008bZæÈ\u0086ìª]þ¹=u\u0005¤\u0095|¿£?¢\u0010\u0081\u009fÏº\u00adHmsãÜ\u009eZ\u001a§J\r¹4¢§|)s$F\u0082\u0012æpí\u0086k×ãrsÜâ\u0088¹î~\u0099Òù`løÏ\u0015ûô¦ªýÕÉ?±~\u0014ßÂÚ¾\u0083\u0097ó\u0016IU\u008eð$do\"µ\u00121\u0081\u0007!\b!çü¼\u001c)¤$\tG4bu/\u008ftâ\u0003Ü)\u0080Ïí~\u0083´íd\u0011ò2¹\u0000f\u0013]\u0096*¿¤\u001c\u0091\u0082O4l\u001d\u0014\u0090a3Ê¾\u0019TÇ½o\u0010·÷\u008c\u0015?ú±Øõ\u0003µ\u0082I'Ø[2\u0087+Ô\u0092\u0099Ç¤ê\u009aZ¶&\u001d\u0084eøÇu\u0019c|Yhº[|\u001a\u00167+Mø÷æÎ&\tÙO®ÕÇEð%ØLU\u0001é³x\u009dø°\u008a\u0081C>l7\u0096\u00807\u008fÞ\u0099ø«§6g\u0083\u0003\u009d©p$ç«K\u0099òÖkÇ\u008d,T[2¬Æ\u0099D¢\u001eAu§â\u0082Å ºè\u001e#ÍÒ³Ëëøv½¿\u0091DDgN¦\u0016s·Øa\nO_.»8â\u0016wêbê§vk\u0086\bu\u0016HÝ¸\u0087\u0005a¬\u000bÛ!\u009c\u001cû ð± \u0013\u0019\u0087ªGG}\u0098¢~\u009cNdÊ\u0019Î1×\"\n_'\u000e{ù\u0007\u001ca ^ãª\u0014v\u0019l\u0003L%\u0015HZ¢.Èr\u0018N³\u0016[ó\u00adpõTiA\u000b´©¤\u0017lS8\u0087\u0007÷nÁP¯\f\u009bK\u0015\u00138ß&\u001d\u001cã\u0000õ\u0004åupô~\u001eLéý\u0018\u0006«6Å\u009aí\u0092\u001b}\u008c2\nL¼Îh¥\u009b;\u0011\u0095'\u0089ãùýÎ\u0002n²\ti$ås\u000b\u009a\u0086åG\u00ad\u008b\u009d°\u0014<ö\u0010$¶îñÃ\u00923¿ÕsX÷§]V\u0087\u0018Õ\u0012\u0081©½ûþ\u0084z\u0096d(\u00adøoÙëJ\u009aK\u0005°\u008e#/(Í\u0098÷\u0013 në\u0085è\u008c\u000f\u0000Ó-Å·ZÇé\u0083^RV ÊÚUµ\u00ad\u00165\u0003+\u009c¢y¸\u0091/ZÆÕ}/\u0093÷\u001fÃää\u007fø\u0017ïÌ\u0099vÚ\u008b½\u009b\u0095S×\u0005\n\u0002õl\r§|ÍîúuÕÎ#\u0094\u0093\u0005Ç÷í%Þ\u0081L¡ÎdN\u0002[\u0098\u009eôÑÈã-\u001d$Õ.RÄ5b}¯\u0014|\u000b\b\u001f\u008d3<·\u009dò\u0004Sè\u000bý*3\u0095ëcgh[\u0000\u0003\u000f£[Á\u0087ìÜÐÔ|Ð;c_î¯\u000bÕ\\Úª\u0015?Ëg\u0094õ\u009a\f!o\u0005\u000bx!\u008c\u00ad\u0095îG\u0011\u0003§\u009c\u000b(â\u0004kwÝ²LU\u001c=\u0091© ÅÂÉ\u0093M\u0083\tí\u0013C\u009d!à$f\u0015náB.F\u0085\u0092g\u0099Ê¯\u0007\u001a7òÚLÊÇ\u0003ò&%";
      int var4 = "3\fÂh\u001e!þ°\u007f:\u001f\u008a\u0095»´üOrÿÎÚìíy×N\u000bb]»>+\u008b2O\u0005q2XÆÃ\fÌy\u0007´{r¼ô\u0093\u0085´dC\u0094\u0012\u0006kâ\u0002i\ra¿¦r\u0004&\u008ef\u0092CQnN\u008fè@Dï\u008b¾\u0098\u001dZCEôC#}óF\"xª#òN*¿ï\u001a\u0099\u008c*²dPõA$ÿmÐ\u001fñÍ&ÛÝ\u000fÑÿ\u008f\u0013%Né\u0086[\u009aß*ÃÇ<K\u0094Ø\u000b\u001ft\rrR¼\t\névÍÄÚ\ba«Kú\u001cô¿ibq\u0000ymg6\u008e4Ô½\u009d#5W¨ô7\u0090\u0007á[\u009bû\u0097\u001cc¼è\u001d>\u0085'Än\u001d\u000b\u008fï\u0098w{\u0017nul/ìv¯\u000f\u0081à¢\u008bE\u0012\u0096Ì¦\u000eW\u009b\u001f\tj\b-sÂ\u009emM%è\bÅ`æ%\u000bËT4\u0007\u009a Lâ°?-\bÜkü\u009dª-Ýä\"²L\u008eþ\u0010\u0007õã+ëwsøÊVüv»\u0089³²\u0092\\Ì¥¿\"\u0012Ã\u0091\u009dïó\u0086\u0007áS#\u008c]ò\u0090\u0014C¶\u0016TQE×b XýûTÛÝû½ÁQ\u0017)©æ¿|\u0006yHÀA\u008d\u0014£\u0013FOwû\fN#²\u0007sjê¼«\u001f\u009bäÓRõ@Ê\u0086\\G\b²ôrÝ®`½\u0016\u00adÑ}éë¶ß=\u0011¤\u000eL0`\u0099\u0088Ñ\u009bhôxùÛS¶5ûA¶kÊ§\u0010\u0014\fBMwdÅHþ\u0014=´~åv²o¡\u0086¢Áw\u007fà7X\u0018T0ceêÛ\u0095],WÔkgm\u007f\u0084\u001a\u009aAÑE\b'n\u0083ø?jÞê±@4\u0011-\u0097I&\u0005\u0089ïWÈ^ðó\u009c:Ö\f¾\u0081I«²\u0091\u0085\u0088´\nP\u0095\u001c6ìcs¾A>\u0002Ô°$±ì\u0015<\tÜÔWÍ«\u0095ù\u0081T2è69Ï\u0000\u008bë^\u0096<Ñ\u0012\u00adP»\u0010\u009aË\u0090hû\"Ë¨\u0081¾GU\u0005cé$¡\u0014akÃ\u0080±ßi\u008fÄZ\u0005\u0015Y\u0092Ñ}ãB\u0019\u008a\u0018\u0097)\u0095zÃ\u0016\\\u008dRõp\u0012SÌ\u001b\u0000I\u0091[\u0085ànC\u0089\u0099ð t\rêUXLÓÉù¢(S\u00860%(=E2VE\u008dþÊæ\u0081×Õ¡µ_®xÅß÷dÒ+p\u0011xÆùz\u00801yÂ\u0002i\u0001Ò³`ó\b\u0081Únr\u001a!vi\n]º±{\u001e¾äí\u0098I3à\u008aÖY¢Dq\u008bZæÈ\u0086ìª]þ¹=u\u0005¤\u0095|¿£?¢\u0010\u0081\u009fÏº\u00adHmsãÜ\u009eZ\u001a§J\r¹4¢§|)s$F\u0082\u0012æpí\u0086k×ãrsÜâ\u0088¹î~\u0099Òù`løÏ\u0015ûô¦ªýÕÉ?±~\u0014ßÂÚ¾\u0083\u0097ó\u0016IU\u008eð$do\"µ\u00121\u0081\u0007!\b!çü¼\u001c)¤$\tG4bu/\u008ftâ\u0003Ü)\u0080Ïí~\u0083´íd\u0011ò2¹\u0000f\u0013]\u0096*¿¤\u001c\u0091\u0082O4l\u001d\u0014\u0090a3Ê¾\u0019TÇ½o\u0010·÷\u008c\u0015?ú±Øõ\u0003µ\u0082I'Ø[2\u0087+Ô\u0092\u0099Ç¤ê\u009aZ¶&\u001d\u0084eøÇu\u0019c|Yhº[|\u001a\u00167+Mø÷æÎ&\tÙO®ÕÇEð%ØLU\u0001é³x\u009dø°\u008a\u0081C>l7\u0096\u00807\u008fÞ\u0099ø«§6g\u0083\u0003\u009d©p$ç«K\u0099òÖkÇ\u008d,T[2¬Æ\u0099D¢\u001eAu§â\u0082Å ºè\u001e#ÍÒ³Ëëøv½¿\u0091DDgN¦\u0016s·Øa\nO_.»8â\u0016wêbê§vk\u0086\bu\u0016HÝ¸\u0087\u0005a¬\u000bÛ!\u009c\u001cû ð± \u0013\u0019\u0087ªGG}\u0098¢~\u009cNdÊ\u0019Î1×\"\n_'\u000e{ù\u0007\u001ca ^ãª\u0014v\u0019l\u0003L%\u0015HZ¢.Èr\u0018N³\u0016[ó\u00adpõTiA\u000b´©¤\u0017lS8\u0087\u0007÷nÁP¯\f\u009bK\u0015\u00138ß&\u001d\u001cã\u0000õ\u0004åupô~\u001eLéý\u0018\u0006«6Å\u009aí\u0092\u001b}\u008c2\nL¼Îh¥\u009b;\u0011\u0095'\u0089ãùýÎ\u0002n²\ti$ås\u000b\u009a\u0086åG\u00ad\u008b\u009d°\u0014<ö\u0010$¶îñÃ\u00923¿ÕsX÷§]V\u0087\u0018Õ\u0012\u0081©½ûþ\u0084z\u0096d(\u00adøoÙëJ\u009aK\u0005°\u008e#/(Í\u0098÷\u0013 në\u0085è\u008c\u000f\u0000Ó-Å·ZÇé\u0083^RV ÊÚUµ\u00ad\u00165\u0003+\u009c¢y¸\u0091/ZÆÕ}/\u0093÷\u001fÃää\u007fø\u0017ïÌ\u0099vÚ\u008b½\u009b\u0095S×\u0005\n\u0002õl\r§|ÍîúuÕÎ#\u0094\u0093\u0005Ç÷í%Þ\u0081L¡ÎdN\u0002[\u0098\u009eôÑÈã-\u001d$Õ.RÄ5b}¯\u0014|\u000b\b\u001f\u008d3<·\u009dò\u0004Sè\u000bý*3\u0095ëcgh[\u0000\u0003\u000f£[Á\u0087ìÜÐÔ|Ð;c_î¯\u000bÕ\\Úª\u0015?Ëg\u0094õ\u009a\f!o\u0005\u000bx!\u008c\u00ad\u0095îG\u0011\u0003§\u009c\u000b(â\u0004kwÝ²LU\u001c=\u0091© ÅÂÉ\u0093M\u0083\tí\u0013C\u009d!à$f\u0015náB.F\u0085\u0092g\u0099Ê¯\u0007\u001a7òÚLÊÇ\u0003ò&%"
         .length();
      char var1 = 4;
      int var22 = -1;

      label71:
      while (true) {
         byte var10000 = 88;
         String var10001 = var2.substring(++var22, var22 + var1);
         byte var10002 = -1;

         while (true) {
            label66: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var6 = 0;
               byte var52 = var10000;
               var45 = var49;
               int var39 = var10004;
               byte var64;
               char[] var75;
               int var10006;
               if (var10004 <= 1) {
                  var75 = var49;
                  var64 = var10000;
                  var10006 = var6;
               } else {
                  var52 = var10000;
                  var39 = var10004;
                  if (var10004 <= var6) {
                     break label66;
                  }

                  var75 = var49;
                  var64 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var75[var10006] = (char)(var75[var10006] ^ var64 ^ switch (var6 % 7) {
                     case 0 -> 94;
                     case 1 -> 30;
                     case 2 -> 68;
                     case 3 -> 90;
                     case 4 -> 119;
                     case 5 -> 83;
                     default -> 29;
                  });
                  var6++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var75 = var45;
                     var64 = var52;
                  } else {
                     if (var39 <= var6) {
                        break;
                     }

                     var75 = var45;
                     var64 = var52;
                     var10006 = var6;
                  }
               }
            }

            String var54 = new String(var45).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var54;
                  if ((var22 += var1) >= var4) {
                     c = var5;
                     d = new String[58];
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll();
                     llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII[] var7 = new llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII[]{
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .d(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .e(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .f(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .g(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .h(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .i(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .j(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .k(),
                        lIllIIIlllIIIlIllIIlIlIIlIIlllllIlIlIlIlIIIIIllIlllIllIIIIlllIIllIlIIlIIlllllIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .l()
                     };
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = CollectionsKt.listOf(var7);
                     Pair[] var23 = new Pair[7];
                     short var55 = -31617;
                     short var68 = -27956;
                     var23[0] = TuplesKt.to(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                        "Hub"
                     );
                     short var56 = -31654;
                     var68 = -4042;
                     var23[1] = TuplesKt.to(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
                        "Crimson_Isle"
                     );
                     short var57 = -31677;
                     var68 = 29589;
                     var23[2] = TuplesKt.to(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                        "The_Park"
                     );
                     short var58 = -31621;
                     var68 = 32266;
                     var23[3] = TuplesKt.to(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
                        "Spiders_Den"
                     );
                     short var59 = -31622;
                     var68 = 30176;
                     var23[4] = TuplesKt.to(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll,
                        "Backwater_Bayou"
                     );
                     short var60 = -31669;
                     var68 = -10461;
                     var23[5] = TuplesKt.to(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll,
                        "Barn"
                     );
                     short var61 = -31679;
                     var68 = -17778;
                     var23[6] = TuplesKt.to(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                        "Galatea"
                     );
                     IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = MapsKt.mapOf(var23);
                     Iterable var24 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.entrySet();
                     boolean var8 = false;
                     int var9 = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(var24, 10)), 16);
                     Map var11 = new LinkedHashMap(var9);
                     boolean var12 = false;

                     for (Object var14 : var24) {
                        Entry var16 = (Entry)var14;
                        boolean var17 = false;
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var18 = (me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var16.getKey();
                        String var19 = (String)var16.getValue();
                        Pair var33 = TuplesKt.to(var19, var18);
                        var11.put(var33.getFirst(), var33.getSecond());
                     }

                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var11;
                     Iterable var25 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                     var8 = false;
                     var var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var25, 10));
                     boolean var29 = false;

                     for (Object var31 : var25) {
                        llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var32 = (llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII)var31;
                        boolean var15 = false;
                        var10.add(llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.b(var32.b()));
                     }

                     Collection var26 = CollectionsKt.filterNotNull(CollectionsKt.distinct(var10));
                     var8 = false;
                     lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = ((String[])(Object)(var26.toArray(new String[0])));
                     break pxClinit;
                  }

                  var1 = var2.charAt(var22);
                  break;
               default:
                  var5[var3++] = var54;
                  if ((var22 += var1) < var4) {
                     var1 = var2.charAt(var22);
                     continue label71;
                  }

                  var2 = "\u00101²\u0087\\ºñNOð3ú\u001aà\u009b$Ó[\"\u0080\u0093\u0091C\u0092·\n\u001e\u0098xüÖ~¦\u0088\u0098\u009e\u0005m\u0005Õ\u001eY";
                  var4 = "\u00101²\u0087\\ºñNOð3ú\u001aà\u009b$Ó[\"\u0080\u0093\u0091C\u0092·\n\u001e\u0098xüÖ~¦\u0088\u0098\u009e\u0005m\u0005Õ\u001eY"
                     .length();
                  var1 = '$';
                  var22 = -1;
            }

            var10000 = 42;
            var10001 = var2.substring(++var22, var22 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception b(Exception var0) {
      return var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -31669) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 159;
            case 1 -> 202;
            case 2 -> 187;
            case 3 -> 27;
            case 4 -> 136;
            case 5 -> 91;
            case 6 -> 155;
            case 7 -> 143;
            case 8 -> 169;
            case 9 -> 161;
            case 10 -> 189;
            case 11 -> 182;
            case 12 -> 217;
            case 13 -> 99;
            case 14 -> 16;
            case 15 -> 95;
            case 16 -> 37;
            case 17 -> 53;
            case 18 -> 152;
            case 19 -> 184;
            case 20 -> 175;
            case 21 -> 137;
            case 22 -> 177;
            case 23 -> 206;
            case 24 -> 76;
            case 25 -> 124;
            case 26 -> 62;
            case 27 -> 102;
            case 28 -> 231;
            case 29 -> 191;
            case 30 -> 127;
            case 31 -> 146;
            case 32 -> 0;
            case 33 -> 164;
            case 34 -> 49;
            case 35 -> 200;
            case 36 -> 240;
            case 37 -> 43;
            case 38 -> 156;
            case 39 -> 243;
            case 40 -> 90;
            case 41 -> 107;
            case 42 -> 115;
            case 43 -> 22;
            case 44 -> 24;
            case 45 -> 5;
            case 46 -> 236;
            case 47 -> 48;
            case 48 -> 211;
            case 49 -> 10;
            case 50 -> 17;
            case 51 -> 242;
            case 52 -> 100;
            case 53 -> 172;
            case 54 -> 77;
            case 55 -> 13;
            case 56 -> 32;
            case 57 -> 134;
            case 58 -> 163;
            case 59 -> 50;
            case 60 -> 67;
            case 61 -> 138;
            case 62 -> 132;
            case 63 -> 197;
            case 64 -> 26;
            case 65 -> 158;
            case 66 -> 233;
            case 67 -> 252;
            case 68 -> 87;
            case 69 -> 198;
            case 70 -> 221;
            case 71 -> 196;
            case 72 -> 222;
            case 73 -> 255;
            case 74 -> 29;
            case 75 -> 103;
            case 76 -> 44;
            case 77 -> 72;
            case 78 -> 71;
            case 79 -> 150;
            case 80 -> 92;
            case 81 -> 11;
            case 82 -> 69;
            case 83 -> 248;
            case 84 -> 121;
            case 85 -> 97;
            case 86 -> 126;
            case 87 -> 245;
            case 88 -> 253;
            case 89 -> 194;
            case 90 -> 30;
            case 91 -> 20;
            case 92 -> 224;
            case 93 -> 85;
            case 94 -> 54;
            case 95 -> 64;
            case 96 -> 105;
            case 97 -> 4;
            case 98 -> 214;
            case 99 -> 63;
            case 100 -> 149;
            case 101 -> 203;
            case 102 -> 73;
            case 103 -> 123;
            case 104 -> 61;
            case 105 -> 82;
            case 106 -> 229;
            case 107 -> 74;
            case 108 -> 93;
            case 109 -> 237;
            case 110 -> 228;
            case 111 -> 166;
            case 112 -> 108;
            case 113 -> 23;
            case 114 -> 140;
            case 115 -> 157;
            case 116 -> 81;
            case 117 -> 241;
            case 118 -> 14;
            case 119 -> 88;
            case 120 -> 101;
            case 121 -> 219;
            case 122 -> 153;
            case 123 -> 21;
            case 124 -> 46;
            case 125 -> 129;
            case 126 -> 230;
            case 127 -> 246;
            case 128 -> 218;
            case 129 -> 141;
            case 130 -> 235;
            case 131 -> 56;
            case 132 -> 45;
            case 133 -> 168;
            case 134 -> 180;
            case 135 -> 65;
            case 136 -> 131;
            case 137 -> 186;
            case 138 -> 51;
            case 139 -> 28;
            case 140 -> 25;
            case 141 -> 75;
            case 142 -> 151;
            case 143 -> 109;
            case 144 -> 116;
            case 145 -> 31;
            case 146 -> 104;
            case 147 -> 208;
            case 148 -> 110;
            case 149 -> 232;
            case 150 -> 247;
            case 151 -> 181;
            case 152 -> 113;
            case 153 -> 112;
            case 154 -> 205;
            case 155 -> 145;
            case 156 -> 179;
            case 157 -> 94;
            case 158 -> 96;
            case 159 -> 165;
            case 160 -> 170;
            case 161 -> 227;
            case 162 -> 52;
            case 163 -> 9;
            case 164 -> 139;
            case 165 -> 249;
            case 166 -> 185;
            case 167 -> 2;
            case 168 -> 254;
            case 169 -> 38;
            case 170 -> 201;
            case 171 -> 193;
            case 172 -> 183;
            case 173 -> 144;
            case 174 -> 188;
            case 175 -> 60;
            case 176 -> 212;
            case 177 -> 204;
            case 178 -> 8;
            case 179 -> 142;
            case 180 -> 238;
            case 181 -> 6;
            case 182 -> 83;
            case 183 -> 195;
            case 184 -> 59;
            case 185 -> 34;
            case 186 -> 226;
            case 187 -> 1;
            case 188 -> 12;
            case 189 -> 148;
            case 190 -> 135;
            case 191 -> 70;
            case 192 -> 223;
            case 193 -> 167;
            case 194 -> 66;
            case 195 -> 128;
            case 196 -> 122;
            case 197 -> 244;
            case 198 -> 18;
            case 199 -> 58;
            case 200 -> 36;
            case 201 -> 147;
            case 202 -> 7;
            case 203 -> 216;
            case 204 -> 40;
            case 205 -> 199;
            case 206 -> 86;
            case 207 -> 120;
            case 208 -> 106;
            case 209 -> 47;
            case 210 -> 117;
            case 211 -> 178;
            case 212 -> 89;
            case 213 -> 3;
            case 214 -> 15;
            case 215 -> 173;
            case 216 -> 114;
            case 217 -> 39;
            case 218 -> 215;
            case 219 -> 68;
            case 220 -> 80;
            case 221 -> 225;
            case 222 -> 111;
            case 223 -> 19;
            case 224 -> 125;
            case 225 -> 171;
            case 226 -> 55;
            case 227 -> 239;
            case 228 -> 234;
            case 229 -> 192;
            case 230 -> 33;
            case 231 -> 119;
            case 232 -> 209;
            case 233 -> 213;
            case 234 -> 57;
            case 235 -> 42;
            case 236 -> 207;
            case 237 -> 79;
            case 238 -> 176;
            case 239 -> 210;
            case 240 -> 251;
            case 241 -> 154;
            case 242 -> 133;
            case 243 -> 78;
            case 244 -> 160;
            case 245 -> 35;
            case 246 -> 130;
            case 247 -> 174;
            case 248 -> 190;
            case 249 -> 41;
            case 250 -> 220;
            case 251 -> 98;
            case 252 -> 250;
            case 253 -> 118;
            case 254 -> 84;
            default -> 162;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      public static int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      static {
         int[] var0 = new int[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.values().length];
         try {
            var0[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.ordinal()] = 1;
         } catch (java.lang.NoSuchFieldError var1) {
         }
         try {
            var0[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.ordinal()] = 2;
         } catch (java.lang.NoSuchFieldError var1) {
         }
         try {
            var0[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.ordinal()] = 3;
         } catch (java.lang.NoSuchFieldError var1) {
         }
         try {
            var0[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.ordinal()] = 4;
         } catch (java.lang.NoSuchFieldError var1) {
         }
         try {
            var0[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.ordinal()] = 5;
         } catch (java.lang.NoSuchFieldError var1) {
         }
         try {
            var0[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.ordinal()] = 6;
         } catch (java.lang.NoSuchFieldError var1) {
         }
         try {
            var0[me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.ordinal()] = 7;
         } catch (java.lang.NoSuchFieldError var1) {
         }
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }
   }
}
