package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIlIIlIllIIIlIlIlllIIlIllIlIIlIlllIIllIIIllIIIIIIlllIlllIllllIlIllIlIIIIIIIllllllll {
   @NotNull
   private String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private List<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @Nullable
   private Function1<? super String, Unit> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public IIIIlIIlIllIIIlIlIlllIIlIllIlIIlIlllIIllIIIllIIIIIIlllIlllIllllIlIllIlIIIIIIIllllllll() {
      short var10001 = -6092;
      short var10002 = 15310;
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "All";
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = CollectionsKt.emptyList();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
         200
      );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
         200
      );
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
         180
      );
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final List<String> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(@NotNull List<String> var1) {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      short var10002 = -6096;
      short var10003 = -8980;
      Intrinsics.checkNotNullParameter(var1, "subs");
      int[] var2 = var10000;
      boolean var3 = Intrinsics.areEqual(var1, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      if (var2 == null) {
         if (var3) {
            return;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         short var10001 = -6092;
         var10002 = 15310;
         var3 = Intrinsics.areEqual(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, "All");
      }

      if (var2 == null) {
         if (var3) {
            return;
         }

         var3 = var1.contains(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      }

      if (!var3) {
         short var4 = -6092;
         var10002 = 15310;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "All";
      }
   }

   public final boolean a(@NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var65 = null; // PX-FIX
      int var62 = 0; // PX-FIX
      Object var61 = null; // PX-FIX
      Object var60 = null; // PX-FIX
      float var58 = 0; // PX-FIX
      int var56 = 0; // PX-FIX
      Collection var54 = null; // PX-FIX
      float var37 = 0; // PX-FIX
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      int var10002 = -6093;
      short var10003 = 20705;
      Intrinsics.checkNotNullParameter(var1, "context");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
      int[] var9 = var10000;
      List var52 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var9 == null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.isEmpty()) {
            return false;
         }

         short var53 = -6092;
         short var10001 = 15310;
         var52 = CollectionsKt.plus(CollectionsKt.listOf("All"), this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      List var10 = var52;
      float var11 = 18.0F;
      float var12 = 4.0F;
      float var13 = 8.0F;
      float var14 = 24.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var8);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var2,
         var3 + var5 - 1.0F,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .A(),
         0.0F
      );
      Iterable var16 = var10;
      int var17 = 0;
      Collection var19 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var16, 10));
      int var20 = 0;
      Iterator var21 = var16.iterator();

      while (true) {
         if (var21.hasNext()) {
            Object var22 = var21.next();
            var54 = var19;
            String var23 = (String)var22;
            if (var9 != null) {
               break;
            }

            boolean var24 = false;
            var19.add(
               (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                     var23,
                     0,
                     false, 6, null)
                  + var11
            );
            if (var9 == null) {
               continue;
            }
         }

         var54 = var19;
         break;
      }

      List var15 = (List)var54;
      float var35 = CollectionsKt.sumOfFloat(var15) + var12 * (var10.size() - 1) + var13 * 2;
      float var74;
      int var55 = (var74 = var35 - var4) == 0.0F ? 0 : (var74 < 0.0F ? -1 : 1);
      if (var9 == null) {
         var55 = var55 > 0 ? 1 : 0;
      }

      label240: {
         label239: {
            var17 = var55;
            int var18 = var10.indexOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var56 = var17;
            label238:
            if (var9 == null) {
               if (var17 != 0) {
                  var56 = var18;
                  if (var9 != null) {
                     break label238;
                  }

                  if (var18 >= 0) {
                     var37 = var13;
                     var20 = 0;

                     while (var20 < var18) {
                        var37 += ((Number)var15.get(var20)).floatValue() + var12;
                        var20++;
                        if (var9 != null) {
                           break label240;
                        }

                        if (var9 != null) {
                           break;
                        }
                     }

                     float var46;
                     float var67;
                     label221: {
                        label220: {
                           float var39 = var37 + ((Number)var15.get(var18)).floatValue();
                           float var42 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.h();
                           float var45 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.h() + var4;
                           var46 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.h();
                           float var75;
                           int var57 = (var75 = var37 - (var42 + var14)) == 0.0F ? 0 : (var75 < 0.0F ? -1 : 1);
                           if (var9 == null) {
                              if (var57 < 0) {
                                 var46 = RangesKt.coerceAtLeast(var37 - var14, 0.0F);
                                 if (var9 == null) {
                                    break label220;
                                 }
                              }

                              var58 = var39;
                              var67 = var45 - var14;
                              if (var9 != null) {
                                 break label221;
                              }

                              float var76;
                              var57 = (var76 = var39 - var67) == 0.0F ? 0 : (var76 < 0.0F ? -1 : 1);
                           }

                           if (var57 > 0) {
                              var46 = var39 - var4 + var14;
                           }
                        }

                        var58 = var35 - var4;
                        var67 = 0.0F;
                     }

                     float var49 = RangesKt.coerceAtLeast(var58, var67);
                     var46 = RangesKt.coerceIn(var46, 0.0F, var49);
                     IIIIlIIlIllIIIlIlIlllIIlIllIlIIlIlllIIllIIIllIIIIIIlllIlllIllllIlIllIlIIIIIIIllllllll var59 = this;
                     if (var9 == null) {
                        if (!this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
                           this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c(var46);
                           this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = true;
                           if (var9 == null) {
                              break label239;
                           }
                        }

                        var59 = this;
                     }

                     var59.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(var46);
                     break label239;
                  }
               }

               var56 = var17;
            }

            if (var56 == 0) {
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c(0.0F);
            }
         }

         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .e();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var2, var3, var4, var5);
         var37 = var2 + var13 - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      Iterator var40 = var10.iterator();
      int var43 = 0;

      while (true) {
         if (var40.hasNext()) {
            var43++;
            String var48 = (String)var40.next();
            float var50 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               var48,
               0,
               false, 6, null);
            float var25 = var50 + var11;
            var60 = var6;
            if (var9 != null) {
               break;
            }

            label196: {
               label257: {
                  float var77;
                  var61 = (var77 = ((Float)var60) - var2) == 0.0F ? 0 : (var77 < 0.0F ? -1 : 1);
                  if (var9 == null) {
                     if ((me.octo.client.PxTruth.truth(var61))) {
                        break label257;
                     }

                     float var78;
                     var61 = (var78 = var6 - (var2 + var4)) == 0.0F ? 0 : (var78 < 0.0F ? -1 : 1);
                  }

                  if (var9 != null) {
                     break label196;
                  }

                  if ((me.octo.client.PxTruth.truth(var61))) {
                     var61 = 1;
                     break label196;
                  }
               }

               var61 = 0;
            }

            label185: {
               label258: {
                  int var27 =((Integer)( var61));
                  var62 = var27;
                  if (var9 == null) {
                     if (var27 == 0) {
                        break label258;
                     }

                     float var79;
                     var62 = (var79 = var6 - var37) == 0.0F ? 0 : (var79 < 0.0F ? -1 : 1);
                  }

                  if (var9 == null) {
                     if (var62 < 0) {
                        break label258;
                     }

                     float var80;
                     var62 = (var80 = var6 - (var37 + var25)) == 0.0F ? 0 : (var80 < 0.0F ? -1 : 1);
                  }

                  if (var9 == null) {
                     if (var62 > 0) {
                        break label258;
                     }

                     float var81;
                     var62 = (var81 = var7 - var3) == 0.0F ? 0 : (var81 < 0.0F ? -1 : 1);
                  }

                  if (var9 == null) {
                     if (var62 < 0) {
                        break label258;
                     }

                     float var82;
                     var62 = (var82 = var7 - (var3 + var5)) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
                  }

                  if (var9 != null) {
                     break label185;
                  }

                  if (var62 <= 0) {
                     var62 = 1;
                     break label185;
                  }
               }

               var62 = 0;
            }

            int var28 = var62;
            byte var29 = ((byte)((Intrinsics.areEqual(var48, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)) ? 1 : 0));
            if (var28 != 0) {
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var48;
            }

            String var68;
            label158: {
               label259: {
                  short var69 = -6095;
                  var10003 = 13843;
                  var68 = "tab:" + var48;
                  var10002 = var28;
                  if (var9 == null) {
                     if (var28 == 0) {
                        break label259;
                     }

                     var10002 = var29;
                  }

                  if (var9 != null) {
                     break label158;
                  }

                  if (var10002 == 0) {
                     var10002 = 1;
                     break label158;
                  }
               }

               var10002 = 0;
            }

            float var30 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var68,
               (var10002 != 0),
               0.0F,
               4,
               null
            );
            float var83;
            int var64 = (var83 = var30 - 0.01F) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
            if (var9 == null) {
               if (var64 > 0) {
                  int var31 = RangesKt.coerceIn((int)(var30 * 40.0F), 0, 255);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var37 + 2.0F,
                     var3 + 4.0F,
                     var25 - 4.0F,
                     var5 - 8.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .g()
                        .a(var31),
                     6.0F
                  );
               }

               short var71 = -6091;
               var10003 = -30595;
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a("tabrip:" + var48, var37, var3, var25, var5, 6.0F);
               var64 = var29;
            }

            label146: {
               if (var9 == null) {
                  if (var64 != 0) {
                     var65 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah();
                     break label146;
                  }

                  var64 = var28;
               }

               var65 = var64 != 0
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c();
            }

            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var51 = var65;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
               var48,
               var37 + var11 / 2.0F,
               var3 + var5 / 2.0F + 1.0F,
               var51,
               false, 16, null);
            if (var9 == null) {
               if (var29 != 0) {
                  float var32 = var37 + var11 / 2.0F;
                  float var84;
                  int var66 = (var84 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI - 0.0F) == 0.0F
                     ? 0
                     : (var84 < 0.0F ? -1 : 1);
                  if (var9 == null) {
                     var66 = (((var66 == 0) ? 1 : 0));
                  }

                  label135: {
                     if ((var66 != 0)) {
                        this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.c(var32);
                        this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.c(var50);
                        this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var32;
                        this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var50;
                        if (var9 == null) {
                           break label135;
                        }
                     }

                     this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(var32);
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var50);
                  }

                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var32;
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var50;
               }

               var37 += var25 + var12;
            }

            if (var9 == null) {
               continue;
            }
         }

         var60 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.e();
         break;
      }

      float var41 =((Float)( var60));
      float var44 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.e();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var41,
         var3 + var5 - 2.0F,
         var44,
         2.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah(),
         1.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null;
   }

   @Nullable
   public final Function1<String, Unit> c() {
      return ((Function1<String,Unit>)(Object)(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl));
   }

   public final void a(@Nullable Function1<? super String, Unit> var1) {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final void a(@NotNull String var1) {
      Object var4 = null; // PX-FIX
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      short var10002 = -6089;
      short var10003 = -16486;
      Intrinsics.checkNotNullParameter(var1, "name");
      int[] var2 = var10000;
      boolean var3 = Intrinsics.areEqual(var1, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      if (var2 == null) {
         if (var3) {
            return;
         }

         short var10001 = -6094;
         var10002 = -2776;
         var3 = Intrinsics.areEqual(var1, "All");
      }

      label25: {
         label24: {
            if (var2 == null) {
               if (var3) {
                  break label24;
               }

               var4 = this;
               if (var2 != null) {
                  break label25;
               }

               var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var1);
            }

            if (!var3) {
               return;
            }
         }

         var4 = this;
      }

      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final void d() {
      int[] var1 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      if (var1 == null && this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         String var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var3 = false;
         if (var1 == null && !Intrinsics.areEqual(var2, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var2;
            if (var1 == null && this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null) {
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.invoke(var2);
            }

            short var10002 = -6090;
            short var10003 = 13425;
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(
                  "tabrip:" + var2,
                  0.0F,
                  0.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(140),
                  60.0F,
                  450L
               );
         }
      }
   }

   public final void e() {
      short var10001 = -6092;
      short var10002 = 15310;
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "All";
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0.0F;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c(0.0F);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "_Þu0\u008fîú\u0003s±\u0094\u0004\u008aF6¢\u0004*`Å¹\u0004üä®©\u0007\u0018td¬,³M";
      int var4 = "_Þu0\u008fîú\u0003s±\u0094\u0004\u008aF6¢\u0004*`Å¹\u0004üä®©\u0007\u0018td¬,³M".length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 17;
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
                     case 0 -> 4;
                     case 1 -> 56;
                     case 2 -> 76;
                     case 3 -> 41;
                     case 4 -> 93;
                     case 5 -> 124;
                     default -> 46;
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
                     b = new String[8];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "?\u001b4õ\u0092,.\u0003'\u0083ª";
                  var4 = "?\u001b4õ\u0092,.\u0003'\u0083ª".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 78;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -6093) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 20;
            case 1 -> 48;
            case 2 -> 193;
            case 3 -> 214;
            case 4 -> 79;
            case 5 -> 76;
            case 6 -> 133;
            case 7 -> 94;
            case 8 -> 28;
            case 9 -> 174;
            case 10 -> 234;
            case 11 -> 2;
            case 12 -> 16;
            case 13 -> 248;
            case 14 -> 13;
            case 15 -> 81;
            case 16 -> 86;
            case 17 -> 53;
            case 18 -> 236;
            case 19 -> 59;
            case 20 -> 104;
            case 21 -> 62;
            case 22 -> 74;
            case 23 -> 75;
            case 24 -> 200;
            case 25 -> 103;
            case 26 -> 7;
            case 27 -> 105;
            case 28 -> 34;
            case 29 -> 10;
            case 30 -> 206;
            case 31 -> 6;
            case 32 -> 217;
            case 33 -> 52;
            case 34 -> 49;
            case 35 -> 113;
            case 36 -> 186;
            case 37 -> 97;
            case 38 -> 171;
            case 39 -> 230;
            case 40 -> 175;
            case 41 -> 85;
            case 42 -> 151;
            case 43 -> 64;
            case 44 -> 237;
            case 45 -> 99;
            case 46 -> 138;
            case 47 -> 137;
            case 48 -> 143;
            case 49 -> 155;
            case 50 -> 247;
            case 51 -> 92;
            case 52 -> 210;
            case 53 -> 251;
            case 54 -> 23;
            case 55 -> 148;
            case 56 -> 152;
            case 57 -> 69;
            case 58 -> 47;
            case 59 -> 93;
            case 60 -> 180;
            case 61 -> 112;
            case 62 -> 253;
            case 63 -> 160;
            case 64 -> 32;
            case 65 -> 169;
            case 66 -> 135;
            case 67 -> 58;
            case 68 -> 91;
            case 69 -> 22;
            case 70 -> 241;
            case 71 -> 83;
            case 72 -> 17;
            case 73 -> 170;
            case 74 -> 184;
            case 75 -> 109;
            case 76 -> 132;
            case 77 -> 185;
            case 78 -> 177;
            case 79 -> 199;
            case 80 -> 205;
            case 81 -> 36;
            case 82 -> 116;
            case 83 -> 26;
            case 84 -> 226;
            case 85 -> 44;
            case 86 -> 84;
            case 87 -> 231;
            case 88 -> 127;
            case 89 -> 115;
            case 90 -> 245;
            case 91 -> 90;
            case 92 -> 242;
            case 93 -> 50;
            case 94 -> 102;
            case 95 -> 130;
            case 96 -> 159;
            case 97 -> 0;
            case 98 -> 191;
            case 99 -> 203;
            case 100 -> 37;
            case 101 -> 14;
            case 102 -> 1;
            case 103 -> 154;
            case 104 -> 163;
            case 105 -> 106;
            case 106 -> 250;
            case 107 -> 168;
            case 108 -> 167;
            case 109 -> 162;
            case 110 -> 176;
            case 111 -> 46;
            case 112 -> 244;
            case 113 -> 8;
            case 114 -> 207;
            case 115 -> 125;
            case 116 -> 254;
            case 117 -> 124;
            case 118 -> 183;
            case 119 -> 72;
            case 120 -> 123;
            case 121 -> 63;
            case 122 -> 225;
            case 123 -> 238;
            case 124 -> 224;
            case 125 -> 27;
            case 126 -> 164;
            case 127 -> 182;
            case 128 -> 68;
            case 129 -> 54;
            case 130 -> 194;
            case 131 -> 61;
            case 132 -> 235;
            case 133 -> 111;
            case 134 -> 3;
            case 135 -> 172;
            case 136 -> 42;
            case 137 -> 77;
            case 138 -> 4;
            case 139 -> 189;
            case 140 -> 120;
            case 141 -> 229;
            case 142 -> 66;
            case 143 -> 255;
            case 144 -> 212;
            case 145 -> 15;
            case 146 -> 208;
            case 147 -> 161;
            case 148 -> 21;
            case 149 -> 197;
            case 150 -> 122;
            case 151 -> 202;
            case 152 -> 25;
            case 153 -> 119;
            case 154 -> 73;
            case 155 -> 141;
            case 156 -> 87;
            case 157 -> 153;
            case 158 -> 35;
            case 159 -> 40;
            case 160 -> 192;
            case 161 -> 211;
            case 162 -> 38;
            case 163 -> 158;
            case 164 -> 128;
            case 165 -> 70;
            case 166 -> 98;
            case 167 -> 11;
            case 168 -> 243;
            case 169 -> 134;
            case 170 -> 165;
            case 171 -> 144;
            case 172 -> 29;
            case 173 -> 173;
            case 174 -> 139;
            case 175 -> 33;
            case 176 -> 110;
            case 177 -> 12;
            case 178 -> 82;
            case 179 -> 157;
            case 180 -> 249;
            case 181 -> 136;
            case 182 -> 147;
            case 183 -> 218;
            case 184 -> 223;
            case 185 -> 71;
            case 186 -> 80;
            case 187 -> 78;
            case 188 -> 221;
            case 189 -> 140;
            case 190 -> 30;
            case 191 -> 178;
            case 192 -> 204;
            case 193 -> 150;
            case 194 -> 156;
            case 195 -> 216;
            case 196 -> 209;
            case 197 -> 18;
            case 198 -> 179;
            case 199 -> 89;
            case 200 -> 117;
            case 201 -> 220;
            case 202 -> 239;
            case 203 -> 95;
            case 204 -> 232;
            case 205 -> 121;
            case 206 -> 240;
            case 207 -> 41;
            case 208 -> 129;
            case 209 -> 196;
            case 210 -> 233;
            case 211 -> 100;
            case 212 -> 51;
            case 213 -> 198;
            case 214 -> 107;
            case 215 -> 24;
            case 216 -> 146;
            case 217 -> 101;
            case 218 -> 213;
            case 219 -> 118;
            case 220 -> 39;
            case 221 -> 215;
            case 222 -> 188;
            case 223 -> 45;
            case 224 -> 131;
            case 225 -> 166;
            case 226 -> 60;
            case 227 -> 227;
            case 228 -> 222;
            case 229 -> 31;
            case 230 -> 55;
            case 231 -> 252;
            case 232 -> 190;
            case 233 -> 19;
            case 234 -> 96;
            case 235 -> 114;
            case 236 -> 57;
            case 237 -> 228;
            case 238 -> 246;
            case 239 -> 142;
            case 240 -> 181;
            case 241 -> 65;
            case 242 -> 5;
            case 243 -> 67;
            case 244 -> 56;
            case 245 -> 195;
            case 246 -> 43;
            case 247 -> 88;
            case 248 -> 149;
            case 249 -> 219;
            case 250 -> 108;
            case 251 -> 187;
            case 252 -> 145;
            case 253 -> 126;
            case 254 -> 9;
            default -> 201;
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
