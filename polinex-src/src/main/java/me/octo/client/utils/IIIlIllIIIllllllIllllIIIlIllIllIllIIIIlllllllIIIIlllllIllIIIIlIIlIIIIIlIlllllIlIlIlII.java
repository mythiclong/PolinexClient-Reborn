package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII {
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   @NotNull
   public static IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Set<Triple<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll, Double, Integer>> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Set<Triple<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll, Double, Integer>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   private IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII() {
   }

   private final Set<Triple<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll, Double, Integer>> a(boolean var1) {
      return var1
         ? lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         : IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   private final boolean a(IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var1, boolean var2) {
      int[] var3;
      Object var10;
      var var4 = this.a(var2);
      var10 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      boolean var5 = false;
      var3 = (int[])var10;
      var10 = var4;
      label36:
      if (var3 != null) {
         if (var4 instanceof Collection) {
            var10 = (Collection)var4;
            if (var3 == null) {
               break label36;
            }

            if (((me.octo.client.PXDyn)var10).isEmpty()) {
               return false;
            }
         }

         var10 = var4;
      }

      for (Object var7 : (Iterable<?>)(var10)) {
         Triple var8 = (Triple)var7;
         boolean var9 = false;
         boolean var11 = Intrinsics.areEqual(var8.getFirst(), var1);

         while (var11) {
            var11 = true;
            if (var3 != null) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   public final Integer a(@NotNull Set<Integer> var1, @NotNull Set<Integer> var2, @Nullable String var3, boolean var4) {
      int var69 = 0; // PX-FIX
      boolean var68 = false; // PX-FIX
      Object var67 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      short var10002 = 16835;
      short var10003 = 30921;
      Intrinsics.checkNotNullParameter(var1, "fossilLocations");
      int[] var5 = var10000;
      short var10001 = 16832;
      var10002 = 656;
      Intrinsics.checkNotNullParameter(var2, "dirtLocations");
      Set var6 = new LinkedHashSet();
      int var7 = 0;

      while (true) {
         if (var7 < 54) {
            var10000 = (int[])(Object)var1;
            if (var5 == null) {
               break;
            }

            label277: {
               boolean var64 = var1.contains(var7);
               if (var5 != null) {
                  if (var64) {
                     break label277;
                  }

                  var64 = var2.contains(var7);
               }

               if (var5 != null && !var64) {
                  var6.add(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(var7));
               }
            }

            var7++;
            if (var5 != null) {
               continue;
            }
         }

         var10000 = (int[])(Object)var1;
         break;
      }

      Object var8 = var10000;
      int var9 = 0;
      var var11 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)var8, 10));
      boolean var12 = false;
      Iterator var13 = ((me.octo.client.PXDyn)var8).iterator();

      while (true) {
         if (var13.hasNext()) {
            Object var14 = var13.next();
            var10000 = (int[])(Object)var11;
            int var15 = ((Number)var14).intValue();
            if (var5 == null) {
               break;
            }

            boolean var16 = false;
            var11.add(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(var15));
            if (var5 != null) {
               continue;
            }
         }

         var10000 = (int[])(Object)var11;
         break;
      }

      label245: {
         label278: {
            var24 = CollectionsKt.toSet((Iterable)var11);
            var10000 = (int[])var24;
            if (var5 != null) {
               if (!(Boolean)((me.octo.client.PXDyn)var24).isEmpty()) {
                  break label278;
               }

               var10000 = (int[])(Object)var6;
            }

            label279: {
               Object var26 = var10000;
               boolean var10 = false;
               var67 = var26;
               label237:
               if (var5 != null) {
                  if (var26 instanceof Collection) {
                     var67 = (Collection)var26;
                     if (var5 == null) {
                        break label237;
                     }

                     if (((me.octo.client.PXDyn)var67).isEmpty()) {
                        var68 = true;
                        break label279;
                     }
                  }

                  var67 = var26;
               }

               Iterator var31 = ((me.octo.client.PXDyn)var67).iterator();

               label230:
               while (true) {
                  if (!var31.hasNext()) {
                     var68 = true;
                     break;
                  }

                  Object var32 = var31.next();
                  IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var34 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var32;
                  boolean var38 = false;
                  var68 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var34, var4);

                  while (!var68) {
                     var68 = false;
                     if (var5 != null) {
                        break label230;
                     }
                  }
               }
            }

            if (var68) {
               var69 = 1;
               break label245;
            }
         }

         var69 = 0;
      }

      byte var25 =(byte)( var69);
      int var70 = var25;
      if (var5 != null) {
         if (var25 == 0) {
            Map var28 = new LinkedHashMap();
            double var30 = 0.0;
            List var33 = var5 != null && var3 != null
               ? IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var3)
               : (List)IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.g();
            int var71 = var33.size();
            if (var5 != null) {
               if (var71 == 1
                  && var33.get(0)
                     == IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                {
                  return null;
               }

               var71 = 0;
            }

            int var35 = var71;

            while (var35 < 9) {
               int var39 = 0;

               while (true) {
                  if (var39 < 6) {
                     if (var5 == null) {
                        break;
                     }

                     Iterator var43 = var33.iterator();

                     label197:
                     while (true) {
                        boolean var72 = var43.hasNext();

                        while (true) {
                           if (!var72) {
                              break label197;
                           }

                           IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var45 = (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll)var43.next();
                           Iterator var17 = var45.e().iterator();

                           while (true) {
                              var72 = var17.hasNext();

                              lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl var19;
                              do {
                                 if (!var72) {
                                    continue label197;
                                 }

                                 llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var18 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl)var17.next();
                                 var19 = ((lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl)var18.a().invoke(var45.d()))
                                    .a(var35, var39);
                                 var72 = this.a(var19, var6, var24);
                              } while (var5 == null);

                              if (var5 == null) {
                                 break;
                              }

                              if (var72 || var5 == null) {
                                 var30++;

                                 for (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var21 : var19.a()) {
                                    var28.compute(var21, null);
                                    if (var5 == null) {
                                       continue label197;
                                    }

                                    if (var5 == null) {
                                       break label197;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var39++;
                     if (var5 != null) {
                        continue;
                     }
                  }

                  var35++;
                  break;
               }

               if (var5 == null) {
                  break;
               }
            }

            boolean var40 = false;
            Map var46 = new LinkedHashMap();
            boolean var49 = false;
            Iterator var52 = var28.entrySet().iterator();

            while (true) {
               if (var52.hasNext()) {
                  Entry var55 = (Entry)var52.next();
                  boolean var60 = false;
                  var10000 = (int[])var24;
                  if (var5 == null) {
                     break;
                  }

                  if (var5 != null) {
                     if (!(Boolean)((me.octo.client.PXDyn)var24).contains(var55.getKey())) {
                        continue;
                     }

                     var46.put(var55.getKey(), var55.getValue());
                  }

                  if (var5 != null) {
                     continue;
                  }
               }

               var10000 = (int[])(Object)(var46.keySet());
               break;
            }

            Entry var36 = ((Entry)(Object)(var10000));
            var40 = false;

            for (Object var47 : (Iterable<?>)(var36)) {
               IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var50 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var47;
               boolean var53 = false;
               var28.remove(var50);
               if (var5 != null && var5 != null) {
                  continue;
               }
               break;
            }

            label298: {
               Iterable var48 = var28.entrySet();
               Iterator var51 = var48.iterator();
               var10000 = (int[])(Object)var51;
               if (var5 != null) {
                  if (!var51.hasNext()) {
                     var10000 = null;
                     break label298;
                  }

                  var10000 = (int[])var51.next();
               }

               Object var54 = var10000;
               var10000 = (int[])(Object)var51;
               if (var5 != null) {
                  if (!var51.hasNext()) {
                     var10000 = (int[])var54;
                     break label298;
                  }

                  var10000 = (int[])var54;
               }

               Entry var56 = (Entry)(Object)var10000;
               boolean var58 = false;
               int var57 = ((Number)var56.getValue()).intValue();

               do {
                  Object var59 = var51.next();
                  Entry var61 = (Entry)var59;
                  boolean var22 = false;
                  int var62 = ((Number)var61.getValue()).intValue();
                  if (var57 < var62) {
                     var54 = var59;
                     var57 = var62;
                  }
               } while (var51.hasNext());

               var10000 = (int[])var54;
            }

            Entry var77 = (Entry)(Object)var10000;
            if ((Entry)(Object)var10000 == null) {
               return null;
            }

            var36 = var77;
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var42 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var36.getKey();
            return var42.c();
         }

         var70 = var6.size();
      }

      var9 = var70;
      if (var9 >= this.a(var4).size()) {
         return null;
      } else {
         Triple var29 = (Triple)CollectionsKt.elementAt(this.a(var4), var9);
         return ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var29.getFirst()).c();
      }
   }

   private final boolean a(
      lIIIIlIIlIIlIIIIlllIllIlllIIIIIllIIIlIIIllIIlIlllIIlIIIllIlIlIlIllllIlIIIllIllIIlllIl var1,
      Set<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> var2,
      Set<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> var3
   ) {
      Object var13 = null; // PX-FIX
      int[] var4;
      boolean var14;
      label68: {
         var var5 = var1.a();
         int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         boolean var6 = false;
         var4 = var10000;
         var13 = var5;
         label64:
         if (var4 != null) {
            if (var5 instanceof Collection) {
               var13 = (Collection)var5;
               if (var4 == null) {
                  break label64;
               }

               if (((me.octo.client.PXDyn)var13).isEmpty()) {
                  var14 = false;
                  break label68;
               }
            }

            var13 = var5;
         }

         Iterator var7 = ((me.octo.client.PXDyn)var13).iterator();

         label55:
         while (true) {
            if (!var7.hasNext()) {
               var14 = false;
               break;
            }

            Object var8 = var7.next();
            IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var9 = (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)var8;
            boolean var10 = false;
            var14 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var9, var2);

            while (true) {
               if (var4 != null) {
                  var14 = !var14;
               }

               if (!var14) {
                  break;
               }

               var14 = true;
               if (var4 != null) {
                  break label55;
               }
            }
         }
      }

      if (var14) {
         return false;
      } else {
         for (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var12 : var3) {
            var14 = var1.a().contains(var12);

            while (!var14) {
               var14 = false;
               if (var4 != null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private final boolean a(
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var1,
      Set<IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll> var2
   ) {
      int[] var3 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      int var10000 = ((var2.contains(var1)) ? 1 : 0);
      if (var3 != null) {
         if (var10000 != 0) {
            return false;
         }

         var10000 = var1.a();
      }

      if (var3 != null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         var10000 = var1.b();
      }

      if (var3 != null) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         var10000 = var1.a();
      }

      byte var10001 = 9;
      if (var3 != null) {
         if (var10000 >= 9) {
            return (0 != 0);
         }

         var10000 = var1.b();
         if (var3 == null) {
            return (var10000 != 0);
         }

         var10001 = 6;
      }

      return (var10000 < var10001);
   }

   private static final Integer a(IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var0, Integer var1) {
      int[] var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      short var10002 = 16834;
      short var10003 = -15990;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      int[] var2 = var10000;
      return var2 != null && var1 != null ? var1 + 1 : 1;
   }

   private static final Integer a(Function2 var0, Object var1, Object var2) {
      return ((Integer)(Object)(var0.invoke(var1, var2)));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "êä\u0001^öÏÉ\u001a!\u008f\u0082\u0084\u000fÙ\u008dk,\u001fN\u0085M\u0090Ã\u0005Z\u008f\u000f\n\r\u0093\u0006a\u009cZ¼\u0083~\u008dbH`B";
      int var4 = "êä\u0001^öÏÉ\u001a!\u008f\u0082\u0084\u000fÙ\u008dk,\u001fN\u0085M\u0090Ã\u0005Z\u008f\u000f\n\r\u0093\u0006a\u009cZ¼\u0083~\u008dbH`B"
         .length();
      char var1 = '\f';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var15 = 5;
            var10002 = var10003;
            int var10 = var10004;
            byte var18;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var18 = 5;
               var10006 = var6;
            } else {
               var15 = 5;
               var10 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var18 = 5;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var18 ^ switch (var6 % 7) {
                  case 0 -> 72;
                  case 1 -> 70;
                  case 2 -> 37;
                  case 3 -> 1;
                  case 4 -> 7;
                  case 5 -> 63;
                  default -> 43;
               });
               var6++;
               if (var15 == 0) {
                  var10006 = var15;
                  var10005 = var10002;
                  var18 = var15;
               } else {
                  if (var10 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var18 = var15;
                  var10006 = var6;
               }
            }
         }

         String var17 = new String(var10002).intern();
         byte var12 = -1;
         var5[var3++] = var17;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[3];
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII();
            Triple[] var7 = new Triple[]{
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(4, 2), 0.515, 404),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(5, 3), 0.393, 196),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(3, 2), 0.513, 119),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(7, 2), 0.345, 58),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(1, 3), 0.342, 38),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(3, 4), 0.6, 25),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(5, 1), 0.8, 10),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(4, 3), 1.0, 2)
            };
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = SetsKt.setOf(var7);
            var7 = new Triple[]{
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(4, 2), 0.515, 404),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(5, 4), 0.413, 196),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(3, 3), 0.461, 115),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(5, 2), 0.387, 62),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(3, 1), 0.342, 38),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(7, 3), 0.48, 25),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(1, 2), 0.846, 13),
               new Triple(new IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll(3, 4), 1.0, 2)
            };
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = SetsKt.setOf(var7);
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 16834) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 170;
            case 1 -> 24;
            case 2 -> 198;
            case 3 -> 171;
            case 4 -> 49;
            case 5 -> 141;
            case 6 -> 59;
            case 7 -> 110;
            case 8 -> 253;
            case 9 -> 46;
            case 10 -> 108;
            case 11 -> 102;
            case 12 -> 168;
            case 13 -> 178;
            case 14 -> 244;
            case 15 -> 103;
            case 16 -> 13;
            case 17 -> 5;
            case 18 -> 115;
            case 19 -> 122;
            case 20 -> 139;
            case 21 -> 209;
            case 22 -> 29;
            case 23 -> 186;
            case 24 -> 16;
            case 25 -> 150;
            case 26 -> 76;
            case 27 -> 160;
            case 28 -> 182;
            case 29 -> 216;
            case 30 -> 212;
            case 31 -> 2;
            case 32 -> 193;
            case 33 -> 89;
            case 34 -> 137;
            case 35 -> 3;
            case 36 -> 192;
            case 37 -> 213;
            case 38 -> 116;
            case 39 -> 200;
            case 40 -> 173;
            case 41 -> 189;
            case 42 -> 126;
            case 43 -> 229;
            case 44 -> 33;
            case 45 -> 175;
            case 46 -> 119;
            case 47 -> 135;
            case 48 -> 82;
            case 49 -> 39;
            case 50 -> 143;
            case 51 -> 28;
            case 52 -> 7;
            case 53 -> 227;
            case 54 -> 80;
            case 55 -> 204;
            case 56 -> 146;
            case 57 -> 30;
            case 58 -> 169;
            case 59 -> 25;
            case 60 -> 44;
            case 61 -> 157;
            case 62 -> 75;
            case 63 -> 134;
            case 64 -> 151;
            case 65 -> 233;
            case 66 -> 236;
            case 67 -> 81;
            case 68 -> 51;
            case 69 -> 63;
            case 70 -> 55;
            case 71 -> 219;
            case 72 -> 225;
            case 73 -> 90;
            case 74 -> 228;
            case 75 -> 145;
            case 76 -> 32;
            case 77 -> 45;
            case 78 -> 221;
            case 79 -> 147;
            case 80 -> 95;
            case 81 -> 211;
            case 82 -> 245;
            case 83 -> 18;
            case 84 -> 12;
            case 85 -> 74;
            case 86 -> 71;
            case 87 -> 70;
            case 88 -> 130;
            case 89 -> 52;
            case 90 -> 205;
            case 91 -> 66;
            case 92 -> 140;
            case 93 -> 180;
            case 94 -> 6;
            case 95 -> 188;
            case 96 -> 64;
            case 97 -> 121;
            case 98 -> 220;
            case 99 -> 208;
            case 100 -> 206;
            case 101 -> 58;
            case 102 -> 250;
            case 103 -> 144;
            case 104 -> 37;
            case 105 -> 247;
            case 106 -> 22;
            case 107 -> 179;
            case 108 -> 149;
            case 109 -> 164;
            case 110 -> 84;
            case 111 -> 114;
            case 112 -> 202;
            case 113 -> 62;
            case 114 -> 161;
            case 115 -> 53;
            case 116 -> 138;
            case 117 -> 85;
            case 118 -> 242;
            case 119 -> 56;
            case 120 -> 104;
            case 121 -> 40;
            case 122 -> 73;
            case 123 -> 174;
            case 124 -> 23;
            case 125 -> 246;
            case 126 -> 254;
            case 127 -> 238;
            case 128 -> 68;
            case 129 -> 35;
            case 130 -> 48;
            case 131 -> 91;
            case 132 -> 152;
            case 133 -> 54;
            case 134 -> 154;
            case 135 -> 159;
            case 136 -> 20;
            case 137 -> 109;
            case 138 -> 125;
            case 139 -> 142;
            case 140 -> 1;
            case 141 -> 158;
            case 142 -> 167;
            case 143 -> 218;
            case 144 -> 172;
            case 145 -> 105;
            case 146 -> 27;
            case 147 -> 42;
            case 148 -> 215;
            case 149 -> 101;
            case 150 -> 249;
            case 151 -> 4;
            case 152 -> 87;
            case 153 -> 232;
            case 154 -> 79;
            case 155 -> 203;
            case 156 -> 106;
            case 157 -> 0;
            case 158 -> 128;
            case 159 -> 181;
            case 160 -> 230;
            case 161 -> 19;
            case 162 -> 223;
            case 163 -> 185;
            case 164 -> 210;
            case 165 -> 183;
            case 166 -> 65;
            case 167 -> 239;
            case 168 -> 72;
            case 169 -> 237;
            case 170 -> 21;
            case 171 -> 120;
            case 172 -> 123;
            case 173 -> 47;
            case 174 -> 9;
            case 175 -> 217;
            case 176 -> 34;
            case 177 -> 77;
            case 178 -> 156;
            case 179 -> 252;
            case 180 -> 136;
            case 181 -> 8;
            case 182 -> 248;
            case 183 -> 94;
            case 184 -> 43;
            case 185 -> 129;
            case 186 -> 86;
            case 187 -> 251;
            case 188 -> 243;
            case 189 -> 240;
            case 190 -> 226;
            case 191 -> 97;
            case 192 -> 194;
            case 193 -> 36;
            case 194 -> 60;
            case 195 -> 222;
            case 196 -> 148;
            case 197 -> 196;
            case 198 -> 131;
            case 199 -> 153;
            case 200 -> 163;
            case 201 -> 162;
            case 202 -> 96;
            case 203 -> 26;
            case 204 -> 199;
            case 205 -> 98;
            case 206 -> 93;
            case 207 -> 15;
            case 208 -> 201;
            case 209 -> 195;
            case 210 -> 107;
            case 211 -> 88;
            case 212 -> 57;
            case 213 -> 177;
            case 214 -> 10;
            case 215 -> 231;
            case 216 -> 191;
            case 217 -> 92;
            case 218 -> 17;
            case 219 -> 31;
            case 220 -> 234;
            case 221 -> 100;
            case 222 -> 214;
            case 223 -> 50;
            case 224 -> 38;
            case 225 -> 83;
            case 226 -> 235;
            case 227 -> 133;
            case 228 -> 69;
            case 229 -> 61;
            case 230 -> 67;
            case 231 -> 112;
            case 232 -> 41;
            case 233 -> 190;
            case 234 -> 11;
            case 235 -> 155;
            case 236 -> 197;
            case 237 -> 165;
            case 238 -> 127;
            case 239 -> 224;
            case 240 -> 117;
            case 241 -> 124;
            case 242 -> 207;
            case 243 -> 255;
            case 244 -> 184;
            case 245 -> 14;
            case 246 -> 113;
            case 247 -> 99;
            case 248 -> 111;
            case 249 -> 78;
            case 250 -> 166;
            case 251 -> 118;
            case 252 -> 241;
            case 253 -> 176;
            case 254 -> 132;
            default -> 187;
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
