package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll
   extends IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll {
   private final float IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private final float IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private int lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static String[] d;
   private static String[] e;

   public IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll(
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      boolean var3
   ) {
      short var10001 = 641;
      short var10002 = -28310;
      Intrinsics.checkNotNullParameter(var1, "resolution");
      var10001 = 659;
      var10002 = -30359;
      Intrinsics.checkNotNullParameter(var2, "category");
      super(var1, var2, var3);
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 10.0F;
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = 8.0F;
   }

   @Override
   protected float r() {
      return this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   }

   private final String a(IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var1) {
      int[] var2 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      short var10000 = ((short)((this.i()) ? 1 : 0));
      if (var2 == null) {
         if ((var10000 == 0)) {
            return var1.l();
         }

         var10000 = ((short)((var1.m() instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI) ? 1 : 0));
      }

      String var4;
      if ((var10000 != 0)) {
         var10000 = 642;
         short var10001 = -17243;
         var4 = "MACROS";
      } else {
         var10000 = 640;
         short var6 = 6092;
         var4 = "FEATURES";
      }

      return var4;
   }

   @Override
   public void a(@NotNull List<? extends IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl> var1) {
      short var10001 = 669;
      short var10002 = -7712;
      Intrinsics.checkNotNullParameter(var1, "categories");
      Collection var2 = var1;
      boolean var3 = false;
      this.a(( IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl[]) var2.toArray(new IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl[0]));
      Arrays.sort(this.f(), (IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl x, IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl y) -> a(this, x, y)); // PX-FIX BSM#0/#1: Function2 -> Comparator
      this.F();
      this.c(false);
   }

   public final void a(
      @NotNull List<? extends IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl> var1,
      @NotNull Comparator<IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl> var2
   ) {
      short var10001 = 671;
      short var10002 = -1662;
      Intrinsics.checkNotNullParameter(var1, "categories");
      var10001 = 670;
      var10002 = 31237;
      Intrinsics.checkNotNullParameter(var2, "comparator");
      Collection var3 = var1;
      boolean var4 = false;
      this.a(( IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl[]) var3.toArray(new IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl[0]));
      Arrays.sort(this.f(), var2);
      this.c(false);
   }

   private final void K() {
      // PX-FIX r90: transcribed from the jar bytecode (javap -c -p, 576 lines). Builds the
      // per-module grid layout (module -> [leftColumn, y]) consumed by a(GuiGraphicsExtractor,...).
      this.B().clear();
      float var2 = this.i() ? 40.0F : 16.0F;
      float var3 = 0.0F;
      float var4 = 0.0F;
      String var5 = null;
      String var6 = null;
      String var7 = null;
      HashMap<String, Boolean> var8 = new HashMap<String, Boolean>();
      HashMap<String, Float> var9 = new HashMap<String, Float>();
      List<String> var10 = new ArrayList<String>();
      HashMap<String, Float> var11 = new HashMap<String, Float>();
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl[] var12 = this.f();
      int var13 = 0;
      int var14 = var12.length;
      while (var13 < var14) {
         IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var15 = var12[var13];
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var16 = var15.m();
      int var17 = 0;
      try {
         Class<?> var18 = Class.forName(
            "me.octo.client." + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":13NNY5UCK5D!CK"))),
            false,
            (ClassLoader)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
         java.lang.reflect.Field var19 = var18.getDeclaredField(
            IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":L0RY1SC00L229428!@#")))
         );
         var19.setAccessible(true);
         Object var20 = var19.get((Object)null);
         Intrinsics.checkNotNull(var20, "null cannot be cast to non-null type kotlin.Int");
         if (((Integer)var20).intValue() == IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b()) {
            var17 = 1;
         }
      } catch (Exception var21) {
      }

      if ((me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII || !var16.c() || var17 != 0) && var16.b()) {
         String var22 = this.a(var15);
         float var23 = (float)this.a(var16, var15) + this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
         String var24 = var16.aj();
         if (this.i()) {
            if (!Intrinsics.areEqual(var22, var5)) {
               var5 = var22;
               float var25 = Math.max(var3, var4) + var2;
               var3 = var25;
               var4 = var25;
            }
            boolean var25 = var3 <= var4;
            var8.put(var24, Boolean.valueOf(var25));
            var9.put(var24, Float.valueOf(var25 ? var3 : var4));
            if (var25) {
               var3 += var23;
            } else {
               var4 += var23;
            }
         } else {
            boolean var25 = var3 <= var4;
            var8.put(var24, Boolean.valueOf(var25));
            if (var25) {
               if (!Intrinsics.areEqual(var22, var6)) {
                  boolean hasPreviousSection = var6 != null;
                  var6 = var22;
                  Float var26 = var11.get(var22);
                  if (var26 == null) {
                     if (hasPreviousSection) {
                        var3 += var2;
                     }
                     var11.put(var22, Float.valueOf(var3));
                  } else {
                     var3 = Math.max(var3, var26.floatValue() + var2);
                  }
               }
               var9.put(var24, Float.valueOf(var3));
               var3 += var23;
            } else {
               if (!Intrinsics.areEqual(var22, var7)) {
                  boolean hasPreviousSection = var7 != null;
                  var7 = var22;
                  Float var26 = var11.get(var22);
                  if (var26 == null) {
                     if (hasPreviousSection) {
                        var4 += var2;
                     }
                     var11.put(var22, Float.valueOf(var4));
                  } else {
                     var4 = Math.max(var4, var26.floatValue() + var2);
                  }
               }
               var9.put(var24, Float.valueOf(var4));
               var4 += var23;
            }
         }

         if (!Intrinsics.areEqual(var22, var5)) {
            var5 = var22;
            var10.add(var24);
         }
      }
      var13++;
      }

      if (!this.i()) {
         this.a(var10, var8, var9);
      }

      for (Map.Entry<String, Boolean> var27 : var8.entrySet()) {
         String var28 = var27.getKey();
         boolean var29 = var27.getValue().booleanValue();
         Map<String, kotlin.Pair<Boolean, Integer>> var30 = this.B();
         Float var31 = var9.get(var28);
         var30.put(var28, new kotlin.Pair<Boolean, Integer>(Boolean.valueOf(var29), Integer.valueOf(var31 != null ? (int)var31.floatValue() : 0)));
      }

      this.c(true);
   }

   private final void a(List<String> var1, HashMap<String, Boolean> var2, HashMap<String, Float> var3) {
      Boolean var28 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      Boolean var23 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      float var5 = 12.0F;
      int var6 = 0;
      int[] var4 = var10000;

      while (var6++ < 64) {
         Iterable var8 = var1;
         int var9 = 0;
         List var7 = CollectionsKt.sortedWith(
            var8,
            new IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var3
            )
         );
         byte var18 = 0;
         var9 = 0;
         int var10 = var7.size();

         while (true) {
            label96:
            if (var9 < var10) {
               int var11 = var9 + 1;
               var21 = var7.size();
               if (var4 != null) {
                  break;
               }

               int var12 =((Integer)( var21));

               while (true) {
                  if (var11 < var12) {
                     String var13 = (String)var7.get(var9);
                     String var14 = (String)var7.get(var11);
                     if (var4 != null) {
                        break;
                     }

                     label88: {
                        if (var4 == null) {
                           Boolean var22 = (Boolean)var2.get(var13);
                           if (var22 != null) {
                              var23 = var22;
                              break label88;
                           }
                        }

                        var23 = false;
                     }

                     Boolean var10001;
                     label82: {
                        var24 = var23;
                        if (var4 == null) {
                           var10001 = (Boolean)var2.get(var14);
                           if (var10001 != null) {
                              break label82;
                           }
                        }

                        var10001 = false;
                     }

                     label76: {
                        if (!Intrinsics.areEqual(var24, var10001)) {
                           Float var25 = (Float)var3.get(var13);
                           if (var25 != null) {
                              float var15 = var25;
                              if (var4 == null) {
                                 Float var26 = (Float)var3.get(var14);
                                 if (var26 != null) {
                                    float var16 = var26;
                                    float var17 = var16 - var15;
                                    if (var4 != null) {
                                       break label76;
                                    }

                                    if (var17 > 0.5F && var17 <= var5) {
                                       label67: {
                                          if (var4 == null) {
                                             var10001 = (Boolean)var2.get(var13);
                                             if (var10001 != null) {
                                                var28 = var10001;
                                                break label67;
                                             }
                                          }

                                          var28 = false;
                                       }

                                       this.a(var28, var15, var17, var2, var3);
                                       var18 = 1;
                                       if (var4 == null) {
                                          break label96;
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var11++;
                     }

                     if (var4 == null) {
                        continue;
                     }
                  }

                  var9++;
                  break;
               }

               if (var4 == null) {
                  continue;
               }
            }

            var21 = var18;
            break;
         }

         if ((me.octo.client.PxTruth.truth(var21))) {
            break;
         }
      }
   }

   private final void a(boolean var1, float var2, float var3, HashMap<String, Boolean> var4, HashMap<String, Float> var5) {
      Set<String> keys = var5.keySet();
      int[] marker = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      List<String> toShift = new ArrayList<>();

      for (String key : keys) {
         boolean column = false;
         if (marker == null) {
            Boolean value = var4.get(key);
            if (value != null) {
               column = value;
            }
         }

         if (column != var1) {
            continue;
         }

         float position = 0.0F;
         if (marker == null) {
            Float value = var5.get(key);
            if (value != null) {
               position = value;
            }
         }

         if (marker != null || position >= var2 - 0.5F) {
            toShift.add(key);
         }
      }

      for (String key : toShift) {
         float position = 0.0F;
         if (marker == null) {
            Float value = var5.get(key);
            if (value != null) {
               position = value;
            }
         }
         var5.put(key, position + var3);
      }
   }

   @Override
   public boolean a(@NotNull GuiGraphicsExtractor param1, int param2, int param3, float param4) {
      Intrinsics.checkNotNullParameter(param1, "context");
      int[] pad = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      long startNanos = System.nanoTime();
      float delta = kotlin.ranges.RangesKt.coerceIn((float)(startNanos - this.A()) / 1000000.0F, 0.0F, 50.0F);
      this.a(startNanos);
      int hidden = 0;
      int step = Math.max(1, (int)(delta / 16.0F * 1.33F));

      for (int i = 0; i < step; i++) {
         this.g().e();
      }

      try {
         Class<?> clazz = Class.forName(
            "me.octo.client." + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":13NNY5UCK5D!CK"))),
            false,
            (ClassLoader)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
         java.lang.reflect.Field reflected = clazz.getDeclaredField(
            IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":L0RY1SC00L229428!@#")))
         );
         reflected.setAccessible(true);
         Object value = reflected.get((Object)null);
         Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
         if (((Integer)value).intValue() == IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b()) {
            hidden = 1;
         }
      } catch (Exception varReflection) {
      }

      int hash = 1;

      for (IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl category : this.f()) {
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll entry = category.m();
         if ((me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII || !entry.c() || hidden != 0) && entry.b()) {
            hash = hash * 31 + entry.aj().hashCode();
         }
      }

      if (hash != this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI) {
         this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = hash;
         this.c(false);
      }

      if (!this.C()) {
         this.K();
      }

      this.b((IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)null);
      int scroll = this.g().d();
      long nowMs = System.currentTimeMillis();
      int baseY = (int)this.p() + 15;
      String lastSub = null;
      this.t().clear();
      float x = this.o();
      float yTotal = this.o() + this.s() + this.r();
      int topY = baseY + scroll;
      int bottomY = baseY + scroll;
      long openTime = System.currentTimeMillis();
      boolean animating = this.z();
      if (this.z()) {
         this.b(false);
      }

      float panelX = this.k() + 5.0F;
      float panelY = this.l() + 5.0F;
      float panelW = this.a().e() - panelX - 5.0F;
      float panelH = this.n() - 10.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(panelX, panelY, panelW, panelH);
      int drawn = 0;
      int index = 0;

      for (IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl category2 : this.f()) {
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll skill = category2.m();
         boolean hiddenItem = false;
         try {
            Class<?> clazz = Class.forName(
               "me.octo.client." + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":13NNY5UCK5D!CK"))),
               false,
               (ClassLoader)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
            java.lang.reflect.Field reflected = clazz.getDeclaredField(
               IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":L0RY1SC00L229428!@#")))
            );
            reflected.setAccessible(true);
            Object value = reflected.get((Object)null);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer)value).intValue() == IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b()) {
               hiddenItem = true;
            }
         } catch (Exception varReflection2) {
         }

         if (!me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII && skill.c() && !hiddenItem) {
            continue;
         }

         if (!skill.b()) {
            continue;
         }

         me.octo.client.llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(skill, nowMs);
         String name = this.a(category2);
         boolean draw = false;
         kotlin.Pair<Boolean, Integer> pair = this.B().get(skill.aj());
         if (pair == null) {
            pair = new kotlin.Pair<Boolean, Integer>(Boolean.valueOf(topY <= bottomY), Integer.valueOf(0));
         }

         boolean firstColumn = pair.getFirst().booleanValue();
         float rowY = firstColumn ? x : yTotal;
         float pairY = (float)(baseY + ((Number)pair.getSecond()).intValue());
         int rowTop = (int)(pairY + (float)scroll);
         if (!Intrinsics.areEqual(name, lastSub)) {
            index = 0;
            draw = true;
            this.t().put(name, Integer.valueOf(rowTop - 14));
            lastSub = name;
            drawn++;
         }

         if (draw) {
            String subKey = name + "sub_";
            float subX = pairY;
            Map<String, IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl> subMap = this.w();
            IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl sub = subMap.get(subKey);
            if (sub == null) {
               sub = new IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl(subX, rowY, subX, rowY, nowMs, 0L, 0L, 64, (kotlin.jvm.internal.DefaultConstructorMarker)null);
               subMap.put(subKey, sub);
            }

            sub.a(subX, rowY, nowMs, 0L);
            int subBottom = (int)(sub.f(nowMs) + (float)scroll);
            if (param4 > 0.0F) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param4 * 0.7F);
               if (this.i()) {
                  float labelY = (float)(subBottom - 26);
                  float barY = labelY + 9.0F;
                  String upper = name.toUpperCase(java.util.Locale.ROOT);
                  Intrinsics.checkNotNullExpressionValue(upper, "toUpperCase(...)");
                  float textWidth = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, upper, false, 2, (Object)null);
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, upper, (double)x, (double)labelY, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(), false, 16, (Object)null);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(x + textWidth + 12.0F, barY, yTotal + this.s() - (x + textWidth + 12.0F), 1.0F, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.A().a(0.6F), 0.5F);
                  kotlin.Unit unit = kotlin.Unit.INSTANCE;
               } else {
                  float labelY = (float)(subBottom - 14);
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll font = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  String upper = name.toUpperCase(java.util.Locale.ROOT);
                  Intrinsics.checkNotNullExpressionValue(upper, "toUpperCase(...)");
                  Double boxed = Double.valueOf(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(font, upper, (double)(sub.g(nowMs) + 4.0F), (double)labelY, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(), false, 16, (Object)null));
               }

               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            }
         }

         Map<String, IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl> hoverMap = this.v();
         String skillKey = skill.aj();
         IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl hoverAnim = hoverMap.get(skillKey);
         if (hoverAnim == null) {
            hoverAnim = new IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl(pairY, rowY, pairY, rowY, nowMs, 0L, 0L, 64, (kotlin.jvm.internal.DefaultConstructorMarker)null);
            hoverMap.put(skillKey, hoverAnim);
         }

         hoverAnim.a(pairY, rowY, nowMs, 0L);
         float hoverF = hoverAnim.f(nowMs);
         float hoverG = hoverAnim.g(nowMs);
         float hoverH = hoverAnim.h(nowMs);
         int hoverTop = (int)(hoverF + (float)scroll);
         me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll bounds = this.a().a(hoverG, this.l(), hoverG + this.s(), this.l() + this.n());
         float alpha = param4;
         float fade = 1.0F;
         if (animating) {
            long delay = (long)drawn * 100L + (long)index * 50L;
            long elapsed = openTime - this.x() - delay;
            if (elapsed < 0L) {
               fade = 0.0F;
               alpha = 0.0F;
            } else if (elapsed < this.y()) {
               float ratio = me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m((float)elapsed / (float)this.y());
               fade = ratio;
               alpha = param4 * ratio;
            }
         }

         boolean highlighted = fade > 0.9F && param4 > 0.9F;
         float progress = me.octo.client.llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(skill);
         Integer selectedValue = me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().get(skill.aj());
         int selected;
         if (selectedValue != null) {
            selected = selectedValue.intValue();
         } else {
            int computed = category2.b(this.a());
            me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().put(skill.aj(), Integer.valueOf(computed));
            selected = computed;
         }

         Integer storedValue = me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().get(skill.aj());
         int storedOffset;
         if (storedValue != null) {
            storedOffset = storedValue.intValue();
         } else if (skill.aq()) {
            int computed = category2.c(this.a());
            me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().put(skill.aj(), Integer.valueOf(computed));
            storedOffset = computed;
         } else {
            storedOffset = selected;
         }

         Integer cachedValue = me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().get(skill.aj());
         int cached = cachedValue != null ? cachedValue.intValue() : 0;
         int maxOffset = Math.max(storedOffset, cached);
         int animated;
         if (skill.aq() && progress > 0.001F) {
            animated = kotlin.ranges.RangesKt.coerceAtLeast((int)((float)selected + (float)(maxOffset - selected) * progress), selected);
         } else {
            animated = selected;
         }

         if (!((float)(hoverTop + animated) > panelY && (float)hoverTop < panelY + panelH)) {
            int nextY = rowTop + animated + 8;
            if (firstColumn) {
               topY = nextY;
            } else {
               bottomY = nextY;
            }

            index++;
            continue;
         }

         boolean mouseOver = (float)param2 >= hoverG
            && (float)param2 <= hoverG + this.s()
            && param3 >= hoverTop
            && param3 <= hoverTop + animated
            && (float)param3 > this.l() + 5.0F
            && (float)param3 < this.l() + this.n() - 5.0F;
         boolean special = skill.aq() && !(skill instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI);
         boolean isSkill = skill instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;
         Map<String, me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll> glowMap = this.u();
         String glowKey = skill.aj();
         me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll glow = glowMap.get(glowKey);
         if (glow == null) {
            glow = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(200);
            glowMap.put(glowKey, glow);
         }

         if (mouseOver && !me.octo.client.llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()) {
            glow.a(1.0F);
         } else {
            glow.a(0.0F);
         }

         float glowSize = glow.e() * (isSkill ? 10.0F : 6.0F);
         float centerX = hoverG + this.s() / 2.0F;
         float centerY = (float)hoverTop + (float)animated / 2.0F;
         boolean expanding = hoverH < 0.999F;
         boolean glowOn = special || isSkill;
         float pulse = glowOn ? 1.0F + glow.e() * 0.01F : 1.0F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         if (expanding || glowOn && glow.e() > 0.01F) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(centerX, centerY);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(hoverH * pulse, hoverH * pulse);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(-centerX, -centerY);
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(alpha);
         if (alpha > 0.0F) {
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll shadow = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().b(0.92F).b(glowSize, glowSize, glowSize);
            float radius = me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ar();
            if (special && glow.e() > 0.02F) {
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, hoverG, (float)hoverTop, this.s(), (float)animated, radius, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah(), glow.e() * 0.42F, 3.0F, 0, 256, (Object)null);
            }

            if (isSkill) {
               Intrinsics.checkNotNull(skill, "null cannot be cast to non-null type me.octo.client.gui.clickgui.modules.impl.MacroModule");
               if (((IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)skill).D()) {
                  me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(hoverG, (float)hoverTop, this.s(), (float)animated, radius, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah(), 2200L, 0.45F * alpha, 0.85F * alpha, 12.0F);
               }
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(hoverG, (float)hoverTop, this.s(), (float)animated, shadow, radius);
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll border = isSkill ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.35F + 0.45F * glow.e()) : me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.A();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(hoverG, (float)hoverTop, this.s(), (float)animated, 1.0F, border, radius);
            boolean macro = skill instanceof me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl && ((me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl)skill).ae();
            if (macro) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(hoverG, (float)hoverTop, this.s(), (float)animated, 1.0F, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(0.15F), radius);
            }
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(hoverG - 4.0F, (float)hoverTop, this.s() + 8.0F, (float)animated + 4.0F);
         me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll result = category2.a(param1, bounds, hoverTop, param2, param3);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         int resultOffset = result.a() - hoverTop;
         me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().put(skill.aj(), Integer.valueOf(resultOffset));
         if (progress == 0.0F) {
            Integer previousValue = me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().get(skill.aj());
            int previous = previousValue != null ? previousValue.intValue() : 0;
            if (Math.abs(resultOffset - previous) > 2) {
               me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().put(skill.aj(), Integer.valueOf(resultOffset));
               this.c(false);
            }
         } else if (progress >= 0.999F) {
            Integer previousValue2 = me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().get(skill.aj());
            int previous2 = previousValue2 != null ? previousValue2.intValue() : 0;
            if (Math.abs(resultOffset - previous2) > 2) {
               me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().put(skill.aj(), Integer.valueOf(resultOffset));
               this.c(false);
            }
         }

         if (!me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().contains(skill.aj())) {
            ((java.util.Collection)me.octo.client.IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d()).add(skill.aj());
            this.c(false);
         }

         if (highlighted) {
            if (mouseOver && special && !me.octo.client.llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()) {
               this.b((IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)new me.octo.client.IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(skill, this));
            } else if (result.c()
               && (float)param3 > this.l() + 5.0F
               && (float)param3 < this.l() + this.n() - 5.0F) {
               this.b(result.b());
            }
         }

         int afterOffset = result.a() - hoverTop;
         int afterY = rowTop + afterOffset + 8;
         if (firstColumn) {
            topY = afterY;
         } else {
            bottomY = afterY;
         }

         index++;
      }

      int contentHeight = Math.max(topY, bottomY) - 30;
      this.a(-(int)((float)(contentHeight - scroll) - (this.l() + this.n() - 10.0F) + 30.0F));
      if (!this.i()) {
         int listTop = (int)this.p() + 15;
         Integer maxValue = kotlin.collections.CollectionsKt.maxOrNull(this.t().values());
         if (maxValue != null) {
            int tallest = ((Number)maxValue).intValue();
            int unused = 0;
            int wanted = listTop - tallest + scroll;
            if (wanted < this.h()) {
               this.a(wanted);
            }

            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
         }
      }

      if (this.h() < 0) {
         if ((float)this.h() > this.g().h()) {
            this.g().a((float)this.h());
         }
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
      return this.j() != null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: aload 1
      // 0001: sipush 658
      // 0004: sipush 21461
      // 0007: pop2
      // 0008: ldc_w "context"
      // 000b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 000e: invokestatic me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n ()[I
      // 0011: invokestatic java/lang/System.nanoTime ()J
      // 0014: lstore 6
      // 0016: lload 6
      // 0018: aload 0
      // 0019: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.A ()J
      // 001c: lsub
      // 001d: l2f
      // 001e: ldc_w 1000000.0
      // 0021: fdiv
      // 0022: fconst_0
      // 0023: ldc_w 50.0
      // 0026: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 0029: fstore 8
      // 002b: aload 0
      // 002c: lload 6
      // 002e: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (J)V
      // 0031: bipush 1
      // 0032: istore 10
      // 0034: fload 8
      // 0036: ldc 16.0
      // 0038: fdiv
      // 0039: ldc_w 1.33
      // 003c: fmul
      // 003d: f2i
      // 003e: istore 11
      // 0040: iload 10
      // 0042: iload 11
      // 0044: invokestatic java/lang/Math.max (II)I
      // 0047: istore 9
      // 0049: bipush 0
      // 004a: istore 10
      // 004c: astore 5
      // 004e: iload 10
      // 0050: iload 9
      // 0052: if_icmpge 0078
      // 0055: iload 10
      // 0057: istore 11
      // 0059: bipush 0
      // 005a: istore 12
      // 005c: aload 0
      // 005d: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // 0060: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 0063: pop
      // 0064: iinc 10 1
      // 0067: aload 5
      // 0069: ifnonnull 007c
      // 006c: aload 5
      // 006e: ifnull 004e
      // 0071: goto 0078
      // 0074: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0077: athrow
      // 0078: bipush 0
      // 0079: istore 10
      // 007b: nop
      // 007c: new java/util/Random
      // 007f: dup
      // 0080: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 0083: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 0086: ldc ":"
      // 0088: swap
      // 0089: sipush 645
      // 008c: sipush -5717
      // 008f: pop2
      // 0090: ldc ":13NNY5UCK5D!CK"
      // 0092: invokedynamic makeConcatWithConstants (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 0097: invokestatic me/octo/client/utils/IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a (Ljava/lang/String;)J
      // 009a: invokespecial java/util/Random.<init> (J)V
      // 009d: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a (Ljava/util/Random;)Ljava/lang/String;
      // 00a0: sipush 660
      // 00a3: sipush -1068
      // 00a6: pop2
      // 00a7: ldc "me.octo.client."
      // 00a9: swap
      // 00aa: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 00af: bipush 0
      // 00b0: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 00b3: checkcast java/lang/ClassLoader
      // 00b6: invokestatic java/lang/Class.forName (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
      // 00b9: astore 11
      // 00bb: aload 11
      // 00bd: new java/util/Random
      // 00c0: dup
      // 00c1: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 00c4: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 00c7: ldc ":"
      // 00c9: swap
      // 00ca: sipush 667
      // 00cd: sipush 29092
      // 00d0: pop2
      // 00d1: ldc ":L0RY1SC00L229428!@#"
      // 00d3: invokedynamic makeConcatWithConstants (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 00d8: invokestatic me/octo/client/utils/IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a (Ljava/lang/String;)J
      // 00db: invokespecial java/util/Random.<init> (J)V
      // 00de: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a (Ljava/util/Random;)Ljava/lang/String;
      // 00e1: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 00e4: astore 12
      // 00e6: aload 12
      // 00e8: bipush 1
      // 00e9: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 00ec: aload 12
      // 00ee: aconst_null
      // 00ef: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00f2: dup
      // 00f3: sipush 643
      // 00f6: sipush -14603
      // 00f9: pop2
      // 00fa: ldc "null cannot be cast to non-null type kotlin.Int"
      // 00fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 00ff: checkcast java/lang/Integer
      // 0102: invokevirtual java/lang/Integer.intValue ()I
      // 0105: istore 13
      // 0107: iload 13
      // 0109: aload 5
      // 010b: ifnonnull 0124
      // 010e: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b ()I
      // 0111: if_icmpne 0123
      // 0114: goto 011b
      // 0117: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 011a: athrow
      // 011b: bipush 1
      // 011c: istore 10
      // 011e: goto 0123
      // 0121: astore 11
      // 0123: bipush 1
      // 0124: istore 11
      // 0126: aload 0
      // 0127: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.f ()[Lme/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl;
      // 012a: astore 12
      // 012c: bipush 0
      // 012d: istore 13
      // 012f: aload 12
      // 0131: arraylength
      // 0132: istore 14
      // 0134: iload 13
      // 0136: iload 14
      // 0138: if_icmpge 01d2
      // 013b: aload 12
      // 013d: iload 13
      // 013f: aaload
      // 0140: astore 15
      // 0142: aload 15
      // 0144: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.m ()Lme/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll; 1
      // 0149: astore 16
      // 014b: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Z
      // 014e: aload 5
      // 0150: ifnonnull 01d4
      // 0153: aload 5
      // 0155: ifnonnull 01a8
      // 0158: goto 015f
      // 015b: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015e: athrow
      // 015f: ifne 019c
      // 0162: goto 0169
      // 0165: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0168: athrow
      // 0169: aload 16
      // 016b: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.c ()Z
      // 016e: aload 5
      // 0170: ifnonnull 01a8
      // 0173: goto 017a
      // 0176: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0179: athrow
      // 017a: ifeq 019c
      // 017d: goto 0184
      // 0180: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0183: athrow
      // 0184: iload 10
      // 0186: aload 5
      // 0188: ifnonnull 01a8
      // 018b: goto 0192
      // 018e: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0191: athrow
      // 0192: ifeq 01ca
      // 0195: goto 019c
      // 0198: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019b: athrow
      // 019c: aload 16
      // 019e: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.b ()Z
      // 01a1: goto 01a8
      // 01a4: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a7: athrow
      // 01a8: aload 5
      // 01aa: ifnonnull 01c8
      // 01ad: ifne 01ba
      // 01b0: goto 01b7
      // 01b3: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b6: athrow
      // 01b7: goto 01ca
      // 01ba: iload 11
      // 01bc: bipush 31
      // 01be: imul
      // 01bf: aload 16
      // 01c1: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 01c4: invokevirtual java/lang/String.hashCode ()I
      // 01c7: iadd
      // 01c8: istore 11
      // 01ca: iinc 13 1
      // 01cd: aload 5
      // 01cf: ifnull 0134
      // 01d2: iload 11
      // 01d4: aload 5
      // 01d6: ifnonnull 01fd
      // 01d9: aload 0
      // 01da: getfield me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI I
      // 01dd: if_icmpeq 01f9
      // 01e0: goto 01e7
      // 01e3: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e6: athrow
      // 01e7: aload 0
      // 01e8: iload 11
      // 01ea: putfield me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI I
      // 01ed: aload 0
      // 01ee: bipush 0
      // 01ef: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.c (Z)V
      // 01f2: goto 01f9
      // 01f5: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f8: athrow
      // 01f9: aload 0
      // 01fa: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.C ()Z
      // 01fd: aload 5
      // 01ff: ifnonnull 0223
      // 0202: ifne 0217
      // 0205: goto 020c
      // 0208: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020b: athrow
      // 020c: aload 0
      // 020d: invokespecial me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.K ()V
      // 0210: goto 0217
      // 0213: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0216: athrow
      // 0217: aload 0
      // 0218: aconst_null
      // 0219: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.b (Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;)V
      // 021c: aload 0
      // 021d: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // 0220: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.d ()I
      // 0223: istore 12
      // 0225: invokestatic java/lang/System.currentTimeMillis ()J
      // 0228: lstore 13
      // 022a: aload 0
      // 022b: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.p ()F
      // 022e: f2i
      // 022f: bipush 15
      // 0231: iadd
      // 0232: istore 15
      // 0234: aconst_null
      // 0235: astore 16
      // 0237: aload 0
      // 0238: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.t ()Ljava/util/Map;
      // 023b: invokeinterface java/util/Map.clear ()V 1
      // 0240: aload 0
      // 0241: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.o ()F
      // 0244: fstore 17
      // 0246: aload 0
      // 0247: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.o ()F
      // 024a: aload 0
      // 024b: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 024e: fadd
      // 024f: aload 0
      // 0250: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.r ()F
      // 0253: fadd
      // 0254: fstore 18
      // 0256: iload 15
      // 0258: iload 12
      // 025a: iadd
      // 025b: istore 19
      // 025d: iload 15
      // 025f: iload 12
      // 0261: iadd
      // 0262: istore 20
      // 0264: invokestatic java/lang/System.currentTimeMillis ()J
      // 0267: lstore 21
      // 0269: aload 0
      // 026a: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.z ()Z
      // 026d: istore 23
      // 026f: aload 0
      // 0270: aload 5
      // 0272: ifnonnull 028f
      // 0275: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.z ()Z
      // 0278: ifeq 028e
      // 027b: goto 0282
      // 027e: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0281: athrow
      // 0282: aload 0
      // 0283: bipush 0
      // 0284: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.b (Z)V
      // 0287: goto 028e
      // 028a: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028d: athrow
      // 028e: aload 0
      // 028f: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.k ()F
      // 0292: bipush 5
      // 0293: i2f
      // 0294: fadd
      // 0295: fstore 24
      // 0297: aload 0
      // 0298: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 029b: bipush 5
      // 029c: i2f
      // 029d: fadd
      // 029e: fstore 25
      // 02a0: aload 0
      // 02a1: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a ()Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 02a4: invokevirtual me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.e ()F
      // 02a7: fload 24
      // 02a9: fsub
      // 02aa: bipush 5
      // 02ab: i2f
      // 02ac: fsub
      // 02ad: fstore 26
      // 02af: aload 0
      // 02b0: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.n ()F
      // 02b3: bipush 10
      // 02b5: i2f
      // 02b6: fsub
      // 02b7: fstore 27
      // 02b9: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 02bc: fload 24
      // 02be: fload 25
      // 02c0: fload 26
      // 02c2: fload 27
      // 02c4: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFF)V
      // 02c7: bipush 0
      // 02c8: istore 28
      // 02ca: bipush 0
      // 02cb: istore 29
      // 02cd: aload 0
      // 02ce: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.f ()[Lme/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl;
      // 02d1: astore 30
      // 02d3: bipush 0
      // 02d4: istore 31
      // 02d6: aload 30
      // 02d8: arraylength
      // 02d9: istore 32
      // 02db: iload 31
      // 02dd: iload 32
      // 02df: if_icmpge 10db
      // 02e2: aload 30
      // 02e4: iload 31
      // 02e6: aaload
      // 02e7: astore 33
      // 02e9: aload 33
      // 02eb: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.m ()Lme/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll; 1
      // 02f0: astore 34
      // 02f2: bipush 0
      // 02f3: istore 35
      // 02f5: nop
      // 02f6: new java/util/Random
      // 02f9: dup
      // 02fa: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 02fd: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 0300: ldc ":"
      // 0302: swap
      // 0303: sipush 665
      // 0306: sipush 1118
      // 0309: pop2
      // 030a: ldc ":13NNY5UCK5D!CK"
      // 030c: invokedynamic makeConcatWithConstants (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 0311: invokestatic me/octo/client/utils/IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a (Ljava/lang/String;)J
      // 0314: invokespecial java/util/Random.<init> (J)V
      // 0317: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a (Ljava/util/Random;)Ljava/lang/String;
      // 031a: sipush 661
      // 031d: sipush -20634
      // 0320: pop2
      // 0321: ldc "me.octo.client."
      // 0323: swap
      // 0324: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0329: bipush 0
      // 032a: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 032d: checkcast java/lang/ClassLoader
      // 0330: invokestatic java/lang/Class.forName (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
      // 0333: astore 36
      // 0335: aload 36
      // 0337: new java/util/Random
      // 033a: dup
      // 033b: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll J
      // 033e: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/lang/String;
      // 0341: ldc ":"
      // 0343: swap
      // 0344: sipush 663
      // 0347: sipush 10288
      // 034a: pop2
      // 034b: ldc ":L0RY1SC00L229428!@#"
      // 034d: invokedynamic makeConcatWithConstants (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 0352: invokestatic me/octo/client/utils/IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a (Ljava/lang/String;)J
      // 0355: invokespecial java/util/Random.<init> (J)V
      // 0358: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a (Ljava/util/Random;)Ljava/lang/String;
      // 035b: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 035e: astore 37
      // 0360: aload 37
      // 0362: bipush 1
      // 0363: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 0366: aload 37
      // 0368: aconst_null
      // 0369: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 036c: dup
      // 036d: sipush 662
      // 0370: sipush -17984
      // 0373: pop2
      // 0374: ldc "null cannot be cast to non-null type kotlin.Int"
      // 0376: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 0379: checkcast java/lang/Integer
      // 037c: invokevirtual java/lang/Integer.intValue ()I
      // 037f: istore 38
      // 0381: iload 38
      // 0383: aload 5
      // 0385: ifnonnull 03ac
      // 0388: invokestatic me/octo/client/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b ()I
      // 038b: aload 5
      // 038d: ifnonnull 10e4
      // 0390: goto 0397
      // 0393: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0396: athrow
      // 0397: if_icmpne 03a9
      // 039a: goto 03a1
      // 039d: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a0: athrow
      // 03a1: bipush 1
      // 03a2: istore 35
      // 03a4: goto 03a9
      // 03a7: astore 36
      // 03a9: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Z
      // 03ac: aload 5
      // 03ae: ifnonnull 03fa
      // 03b1: ifne 03ee
      // 03b4: goto 03bb
      // 03b7: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03ba: athrow
      // 03bb: aload 34
      // 03bd: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.c ()Z
      // 03c0: aload 5
      // 03c2: ifnonnull 03fa
      // 03c5: goto 03cc
      // 03c8: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03cb: athrow
      // 03cc: ifeq 03ee
      // 03cf: goto 03d6
      // 03d2: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d5: athrow
      // 03d6: iload 35
      // 03d8: aload 5
      // 03da: ifnonnull 03fa
      // 03dd: goto 03e4
      // 03e0: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e3: athrow
      // 03e4: ifeq 10d3
      // 03e7: goto 03ee
      // 03ea: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03ed: athrow
      // 03ee: aload 34
      // 03f0: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.b ()Z
      // 03f3: goto 03fa
      // 03f6: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f9: athrow
      // 03fa: ifne 0400
      // 03fd: goto 10d3
      // 0400: getstatic me/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0403: aload 34
      // 0405: lload 13
      // 0407: invokevirtual me/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lme/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll;J)V
      // 040a: aload 0
      // 040b: aload 33
      // 040d: invokespecial me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Lme/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl;)Ljava/lang/String;
      // 0410: astore 36
      // 0412: bipush 0
      // 0413: istore 37
      // 0415: aload 5
      // 0417: ifnonnull 043e
      // 041a: aload 0
      // 041b: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.B ()Ljava/util/Map;
      // 041e: aload 34
      // 0420: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0423: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0428: checkcast kotlin/Pair
      // 042b: dup
      // 042c: ifnonnull 045c
      // 042f: goto 0436
      // 0432: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0435: athrow
      // 0436: pop
      // 0437: goto 043e
      // 043a: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043d: athrow
      // 043e: new kotlin/Pair
      // 0441: dup
      // 0442: iload 19
      // 0444: iload 20
      // 0446: if_icmpgt 0451
      // 0449: bipush 1
      // 044a: goto 0452
      // 044d: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0450: athrow
      // 0451: bipush 0
      // 0452: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0455: bipush 0
      // 0456: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0459: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 045c: astore 38
      // 045e: aload 38
      // 0460: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 0463: checkcast java/lang/Boolean
      // 0466: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0469: istore 39
      // 046b: iload 39
      // 046d: ifeq 0479
      // 0470: fload 17
      // 0472: goto 047b
      // 0475: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0478: athrow
      // 0479: fload 18
      // 047b: fstore 40
      // 047d: iload 15
      // 047f: aload 38
      // 0481: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 0484: checkcast java/lang/Number
      // 0487: invokevirtual java/lang/Number.intValue ()I
      // 048a: iadd
      // 048b: i2f
      // 048c: fstore 41
      // 048e: fload 41
      // 0490: iload 12
      // 0492: i2f
      // 0493: fadd
      // 0494: f2i
      // 0495: istore 42
      // 0497: aload 36
      // 0499: aload 16
      // 049b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 049e: aload 5
      // 04a0: ifnonnull 04db
      // 04a3: ifne 04d9
      // 04a6: goto 04ad
      // 04a9: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04ac: athrow
      // 04ad: bipush 0
      // 04ae: istore 29
      // 04b0: bipush 1
      // 04b1: istore 37
      // 04b3: aload 0
      // 04b4: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.t ()Ljava/util/Map;
      // 04b7: astore 43
      // 04b9: iload 42
      // 04bb: bipush 14
      // 04bd: isub
      // 04be: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04c1: astore 44
      // 04c3: aload 43
      // 04c5: aload 36
      // 04c7: aload 44
      // 04c9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 04ce: pop
      // 04cf: aload 36
      // 04d1: astore 16
      // 04d3: iload 28
      // 04d5: iinc 28 1
      // 04d8: pop
      // 04d9: iload 37
      // 04db: ifeq 0664
      // 04de: aload 36
      // 04e0: sipush 666
      // 04e3: sipush -24256
      // 04e6: pop2
      // 04e7: ldc_w "sub_"
      // 04ea: swap
      // 04eb: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 04f0: astore 43
      // 04f2: fload 41
      // 04f4: fstore 44
      // 04f6: aload 0
      // 04f7: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.w ()Ljava/util/Map;
      // 04fa: astore 46
      // 04fc: aload 43
      // 04fe: astore 47
      // 0500: bipush 0
      // 0501: istore 48
      // 0503: aload 46
      // 0505: aload 47
      // 0507: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 050c: astore 49
      // 050e: aload 49
      // 0510: ifnonnull 053f
      // 0513: bipush 0
      // 0514: istore 50
      // 0516: new me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 0519: dup
      // 051a: fload 44
      // 051c: fload 40
      // 051e: fload 44
      // 0520: fload 40
      // 0522: lload 13
      // 0524: lconst_0
      // 0525: lconst_0
      // 0526: bipush 64
      // 0528: aconst_null
      // 0529: invokespecial me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.<init> (FFFFJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 052c: astore 51
      // 052e: aload 46
      // 0530: aload 47
      // 0532: aload 51
      // 0534: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0539: pop
      // 053a: aload 51
      // 053c: goto 0541
      // 053f: aload 49
      // 0541: nop
      // 0542: checkcast me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 0545: astore 45
      // 0547: aload 45
      // 0549: fload 44
      // 054b: fload 40
      // 054d: lload 13
      // 054f: lconst_0
      // 0550: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a (FFJJ)V
      // 0553: aload 45
      // 0555: lload 13
      // 0557: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.f (J)F
      // 055a: iload 12
      // 055c: i2f
      // 055d: fadd
      // 055e: f2i
      // 055f: istore 46
      // 0561: fload 4
      // 0563: fconst_0
      // 0564: fcmpl
      // 0565: aload 5
      // 0567: ifnonnull 058e
      // 056a: ifle 0664
      // 056d: goto 0574
      // 0570: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0573: athrow
      // 0574: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g ()V
      // 0577: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 057a: fload 4
      // 057c: ldc_w 0.7
      // 057f: fmul
      // 0580: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (F)V
      // 0583: aload 0
      // 0584: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.i ()Z
      // 0587: goto 058e
      // 058a: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058d: athrow
      // 058e: aload 5
      // 0590: ifnonnull 0626
      // 0593: ifeq 0621
      // 0596: goto 059d
      // 0599: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059c: athrow
      // 059d: iload 46
      // 059f: bipush 26
      // 05a1: isub
      // 05a2: i2f
      // 05a3: fstore 47
      // 05a5: fload 47
      // 05a7: ldc_w 9.0
      // 05aa: fadd
      // 05ab: fstore 48
      // 05ad: aload 36
      // 05af: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 05b2: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 05b5: dup
      // 05b6: sipush 668
      // 05b9: sipush 11977
      // 05bc: pop2
      // 05bd: ldc_w "toUpperCase(...)"
      // 05c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 05c3: astore 49
      // 05c5: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 05c8: aload 49
      // 05ca: bipush 0
      // 05cb: bipush 2
      // 05cc: aconst_null
      // 05cd: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;ZILjava/lang/Object;)D
      // 05d0: d2f
      // 05d1: fstore 50
      // 05d3: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 05d6: aload 49
      // 05d8: fload 17
      // 05da: f2d
      // 05db: fload 47
      // 05dd: f2d
      // 05de: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 05e1: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 05e4: bipush 0
      // 05e5: bipush 16
      // 05e7: aconst_null
      // 05e8: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 05eb: pop2
      // 05ec: fload 17
      // 05ee: fload 50
      // 05f0: fadd
      // 05f1: ldc_w 12.0
      // 05f4: fadd
      // 05f5: fload 48
      // 05f7: fload 18
      // 05f9: aload 0
      // 05fa: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 05fd: fadd
      // 05fe: fload 17
      // 0600: fload 50
      // 0602: fadd
      // 0603: ldc_w 12.0
      // 0606: fadd
      // 0607: fsub
      // 0608: fconst_1
      // 0609: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 060c: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.A ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 060f: ldc_w 0.6
      // 0612: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0615: ldc_w 0.5
      // 0618: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 061b: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 061e: goto 0660
      // 0621: iload 46
      // 0623: bipush 14
      // 0625: isub
      // 0626: i2f
      // 0627: fstore 47
      // 0629: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 062c: aload 36
      // 062e: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0631: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0634: dup
      // 0635: sipush 644
      // 0638: sipush -26945
      // 063b: pop2
      // 063c: ldc_w "toUpperCase(...)"
      // 063f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0642: aload 45
      // 0644: lload 13
      // 0646: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.g (J)F
      // 0649: bipush 4
      // 064a: i2f
      // 064b: fadd
      // 064c: f2d
      // 064d: fload 47
      // 064f: f2d
      // 0650: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0653: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0656: bipush 0
      // 0657: bipush 16
      // 0659: aconst_null
      // 065a: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 065d: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 0660: pop
      // 0661: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h ()V
      // 0664: aload 0
      // 0665: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.v ()Ljava/util/Map;
      // 0668: astore 44
      // 066a: aload 34
      // 066c: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 066f: astore 45
      // 0671: bipush 0
      // 0672: istore 46
      // 0674: aload 44
      // 0676: aload 45
      // 0678: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 067d: astore 47
      // 067f: aload 47
      // 0681: ifnonnull 06b0
      // 0684: bipush 0
      // 0685: istore 48
      // 0687: new me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 068a: dup
      // 068b: fload 41
      // 068d: fload 40
      // 068f: fload 41
      // 0691: fload 40
      // 0693: lload 13
      // 0695: lconst_0
      // 0696: lconst_0
      // 0697: bipush 64
      // 0699: aconst_null
      // 069a: invokespecial me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.<init> (FFFFJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 069d: astore 49
      // 069f: aload 44
      // 06a1: aload 45
      // 06a3: aload 49
      // 06a5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 06aa: pop
      // 06ab: aload 49
      // 06ad: goto 06b2
      // 06b0: aload 47
      // 06b2: nop
      // 06b3: checkcast me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl
      // 06b6: astore 43
      // 06b8: aload 43
      // 06ba: fload 41
      // 06bc: fload 40
      // 06be: lload 13
      // 06c0: lconst_0
      // 06c1: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.a (FFJJ)V
      // 06c4: aload 43
      // 06c6: lload 13
      // 06c8: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.f (J)F
      // 06cb: fstore 44
      // 06cd: aload 43
      // 06cf: lload 13
      // 06d1: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.g (J)F
      // 06d4: fstore 45
      // 06d6: aload 43
      // 06d8: lload 13
      // 06da: invokevirtual me/octo/client/IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.h (J)F
      // 06dd: fstore 46
      // 06df: fload 44
      // 06e1: iload 12
      // 06e3: i2f
      // 06e4: fadd
      // 06e5: f2i
      // 06e6: istore 47
      // 06e8: aload 0
      // 06e9: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a ()Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 06ec: fload 45
      // 06ee: aload 0
      // 06ef: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 06f2: fload 45
      // 06f4: aload 0
      // 06f5: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 06f8: fadd
      // 06f9: aload 0
      // 06fa: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 06fd: aload 0
      // 06fe: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.n ()F
      // 0701: fadd
      // 0702: invokevirtual me/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.a (FFFF)Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 0705: astore 48
      // 0707: fload 4
      // 0709: fstore 49
      // 070b: fconst_1
      // 070c: fstore 50
      // 070e: iload 23
      // 0710: aload 5
      // 0712: ifnonnull 0796
      // 0715: ifeq 0790
      // 0718: goto 071f
      // 071b: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071e: athrow
      // 071f: iload 28
      // 0721: i2l
      // 0722: ldc2_w 100
      // 0725: lmul
      // 0726: iload 29
      // 0728: i2l
      // 0729: ldc2_w 50
      // 072c: lmul
      // 072d: ladd
      // 072e: lstore 51
      // 0730: lload 21
      // 0732: aload 0
      // 0733: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.x ()J
      // 0736: lsub
      // 0737: lload 51
      // 0739: lsub
      // 073a: lstore 53
      // 073c: lload 53
      // 073e: lconst_0
      // 073f: lcmp
      // 0740: aload 5
      // 0742: ifnonnull 0768
      // 0745: ifge 075a
      // 0748: goto 074f
      // 074b: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074e: athrow
      // 074f: fconst_0
      // 0750: fstore 50
      // 0752: fconst_0
      // 0753: fstore 49
      // 0755: aload 5
      // 0757: ifnull 0790
      // 075a: lload 53
      // 075c: aload 0
      // 075d: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.y ()J
      // 0760: lcmp
      // 0761: goto 0768
      // 0764: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0767: athrow
      // 0768: aload 5
      // 076a: ifnonnull 0796
      // 076d: ifge 0790
      // 0770: goto 0777
      // 0773: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0776: athrow
      // 0777: lload 53
      // 0779: l2f
      // 077a: aload 0
      // 077b: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.y ()J
      // 077e: l2f
      // 077f: fdiv
      // 0780: invokestatic me/octo/client/utils/player/IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m (F)F
      // 0783: fstore 55
      // 0785: fload 55
      // 0787: fstore 50
      // 0789: fload 4
      // 078b: fload 55
      // 078d: fmul
      // 078e: fstore 49
      // 0790: fload 50
      // 0792: ldc_w 0.9
      // 0795: fcmpl
      // 0796: aload 5
      // 0798: ifnonnull 07b2
      // 079b: ifle 07c5
      // 079e: goto 07a5
      // 07a1: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a4: athrow
      // 07a5: fload 4
      // 07a7: ldc_w 0.9
      // 07aa: fcmpl
      // 07ab: goto 07b2
      // 07ae: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b1: athrow
      // 07b2: aload 5
      // 07b4: ifnonnull 07c2
      // 07b7: ifle 07c5
      // 07ba: goto 07c1
      // 07bd: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c0: athrow
      // 07c1: bipush 1
      // 07c2: goto 07c6
      // 07c5: bipush 0
      // 07c6: istore 51
      // 07c8: getstatic me/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 07cb: aload 34
      // 07cd: invokevirtual me/octo/client/llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d (Lme/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll;)F
      // 07d0: fstore 52
      // 07d2: aload 5
      // 07d4: ifnonnull 0800
      // 07d7: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 07da: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // 07dd: aload 34
      // 07df: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 07e2: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 07e7: checkcast java/lang/Integer
      // 07ea: dup
      // 07eb: ifnull 07ff
      // 07ee: goto 07f5
      // 07f1: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f4: athrow
      // 07f5: invokevirtual java/lang/Integer.intValue ()I
      // 07f8: goto 082d
      // 07fb: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07fe: athrow
      // 07ff: pop
      // 0800: aload 33
      // 0802: aload 0
      // 0803: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a ()Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 0806: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.b (Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;)I 2
      // 080b: istore 55
      // 080d: iload 55
      // 080f: istore 56
      // 0811: bipush 0
      // 0812: istore 57
      // 0814: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0817: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // 081a: aload 34
      // 081c: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 081f: iload 56
      // 0821: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0824: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0829: pop
      // 082a: nop
      // 082b: iload 55
      // 082d: istore 53
      // 082f: aload 5
      // 0831: ifnonnull 085d
      // 0834: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0837: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Ljava/util/Map;
      // 083a: aload 34
      // 083c: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 083f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0844: checkcast java/lang/Integer
      // 0847: dup
      // 0848: ifnull 085c
      // 084b: goto 0852
      // 084e: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0851: athrow
      // 0852: invokevirtual java/lang/Integer.intValue ()I
      // 0855: goto 08aa
      // 0858: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085b: athrow
      // 085c: pop
      // 085d: aload 34
      // 085f: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aq ()Z
      // 0862: aload 5
      // 0864: ifnonnull 0883
      // 0867: ifeq 08a8
      // 086a: goto 0871
      // 086d: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0870: athrow
      // 0871: aload 33
      // 0873: aload 0
      // 0874: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a ()Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;
      // 0877: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.c (Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;)I 2
      // 087c: goto 0883
      // 087f: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0882: athrow
      // 0883: istore 56
      // 0885: iload 56
      // 0887: istore 57
      // 0889: bipush 0
      // 088a: istore 58
      // 088c: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 088f: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Ljava/util/Map;
      // 0892: aload 34
      // 0894: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0897: iload 57
      // 0899: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 089c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 08a1: pop
      // 08a2: nop
      // 08a3: iload 56
      // 08a5: goto 08aa
      // 08a8: iload 53
      // 08aa: istore 54
      // 08ac: aload 5
      // 08ae: ifnonnull 08da
      // 08b1: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 08b4: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Ljava/util/Map;
      // 08b7: aload 34
      // 08b9: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 08bc: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 08c1: checkcast java/lang/Integer
      // 08c4: dup
      // 08c5: ifnull 08d9
      // 08c8: goto 08cf
      // 08cb: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08ce: athrow
      // 08cf: invokevirtual java/lang/Integer.intValue ()I
      // 08d2: goto 08db
      // 08d5: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d8: athrow
      // 08d9: pop
      // 08da: bipush 0
      // 08db: istore 55
      // 08dd: iload 54
      // 08df: iload 55
      // 08e1: invokestatic java/lang/Math.max (II)I
      // 08e4: istore 56
      // 08e6: aload 34
      // 08e8: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aq ()Z
      // 08eb: aload 5
      // 08ed: ifnonnull 0907
      // 08f0: ifeq 0933
      // 08f3: goto 08fa
      // 08f6: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f9: athrow
      // 08fa: fload 52
      // 08fc: ldc_w 0.001
      // 08ff: fcmpl
      // 0900: goto 0907
      // 0903: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0906: athrow
      // 0907: aload 5
      // 0909: ifnonnull 0930
      // 090c: ifle 0933
      // 090f: goto 0916
      // 0912: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0915: athrow
      // 0916: iload 53
      // 0918: i2f
      // 0919: iload 56
      // 091b: iload 53
      // 091d: isub
      // 091e: i2f
      // 091f: fload 52
      // 0921: fmul
      // 0922: fadd
      // 0923: f2i
      // 0924: iload 53
      // 0926: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 0929: goto 0930
      // 092c: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092f: athrow
      // 0930: goto 0935
      // 0933: iload 53
      // 0935: istore 57
      // 0937: iload 47
      // 0939: iload 57
      // 093b: iadd
      // 093c: i2f
      // 093d: fload 25
      // 093f: fcmpg
      // 0940: aload 5
      // 0942: ifnonnull 097d
      // 0945: ifle 096e
      // 0948: goto 094f
      // 094b: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094e: athrow
      // 094f: iload 47
      // 0951: i2f
      // 0952: fload 25
      // 0954: fload 27
      // 0956: fadd
      // 0957: fcmpl
      // 0958: aload 5
      // 095a: ifnonnull 09bb
      // 095d: goto 0964
      // 0960: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0963: athrow
      // 0964: iflt 09af
      // 0967: goto 096e
      // 096a: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096d: athrow
      // 096e: iload 42
      // 0970: iload 57
      // 0972: iadd
      // 0973: bipush 8
      // 0975: iadd
      // 0976: goto 097d
      // 0979: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097c: athrow
      // 097d: istore 58
      // 097f: iload 39
      // 0981: aload 5
      // 0983: ifnonnull 09a2
      // 0986: ifeq 0999
      // 0989: goto 0990
      // 098c: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098f: athrow
      // 0990: iload 58
      // 0992: istore 19
      // 0994: aload 5
      // 0996: ifnull 09a4
      // 0999: iload 58
      // 099b: goto 09a2
      // 099e: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a1: athrow
      // 09a2: istore 20
      // 09a4: iload 29
      // 09a6: iinc 29 1
      // 09a9: pop
      // 09aa: aload 5
      // 09ac: ifnull 10d3
      // 09af: iload 2
      // 09b0: i2f
      // 09b1: fload 45
      // 09b3: fcmpl
      // 09b4: goto 09bb
      // 09b7: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09ba: athrow
      // 09bb: aload 5
      // 09bd: ifnonnull 09db
      // 09c0: iflt 0a61
      // 09c3: goto 09ca
      // 09c6: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c9: athrow
      // 09ca: iload 2
      // 09cb: i2f
      // 09cc: fload 45
      // 09ce: aload 0
      // 09cf: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 09d2: fadd
      // 09d3: fcmpg
      // 09d4: goto 09db
      // 09d7: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09da: athrow
      // 09db: aload 5
      // 09dd: ifnonnull 09eb
      // 09e0: ifgt 0a61
      // 09e3: goto 09ea
      // 09e6: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e9: athrow
      // 09ea: iload 3
      // 09eb: iload 47
      // 09ed: aload 5
      // 09ef: ifnonnull 0a15
      // 09f2: if_icmplt 0a61
      // 09f5: goto 09fc
      // 09f8: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09fb: athrow
      // 09fc: iload 3
      // 09fd: aload 5
      // 09ff: ifnonnull 0a29
      // 0a02: goto 0a09
      // 0a05: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a08: athrow
      // 0a09: iload 47
      // 0a0b: iload 57
      // 0a0d: iadd
      // 0a0e: goto 0a15
      // 0a11: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a14: athrow
      // 0a15: if_icmpgt 0a61
      // 0a18: iload 3
      // 0a19: i2f
      // 0a1a: aload 0
      // 0a1b: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 0a1e: bipush 5
      // 0a1f: i2f
      // 0a20: fadd
      // 0a21: fcmpl
      // 0a22: goto 0a29
      // 0a25: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a28: athrow
      // 0a29: aload 5
      // 0a2b: ifnonnull 0a4e
      // 0a2e: ifle 0a61
      // 0a31: goto 0a38
      // 0a34: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a37: athrow
      // 0a38: iload 3
      // 0a39: i2f
      // 0a3a: aload 0
      // 0a3b: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 0a3e: aload 0
      // 0a3f: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.n ()F
      // 0a42: fadd
      // 0a43: bipush 5
      // 0a44: i2f
      // 0a45: fsub
      // 0a46: fcmpg
      // 0a47: goto 0a4e
      // 0a4a: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4d: athrow
      // 0a4e: aload 5
      // 0a50: ifnonnull 0a5e
      // 0a53: ifge 0a61
      // 0a56: goto 0a5d
      // 0a59: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5c: athrow
      // 0a5d: bipush 1
      // 0a5e: goto 0a62
      // 0a61: bipush 0
      // 0a62: istore 58
      // 0a64: aload 34
      // 0a66: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aq ()Z
      // 0a69: aload 5
      // 0a6b: ifnonnull 0a84
      // 0a6e: ifeq 0a97
      // 0a71: goto 0a78
      // 0a74: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a77: athrow
      // 0a78: aload 34
      // 0a7a: instanceof me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI
      // 0a7d: goto 0a84
      // 0a80: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a83: athrow
      // 0a84: aload 5
      // 0a86: ifnonnull 0a94
      // 0a89: ifne 0a97
      // 0a8c: goto 0a93
      // 0a8f: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a92: athrow
      // 0a93: bipush 1
      // 0a94: goto 0a98
      // 0a97: bipush 0
      // 0a98: istore 59
      // 0a9a: aload 34
      // 0a9c: instanceof me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI
      // 0a9f: istore 60
      // 0aa1: aload 0
      // 0aa2: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.u ()Ljava/util/Map;
      // 0aa5: astore 62
      // 0aa7: aload 34
      // 0aa9: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0aac: astore 63
      // 0aae: bipush 0
      // 0aaf: istore 64
      // 0ab1: aload 62
      // 0ab3: aload 63
      // 0ab5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0aba: astore 65
      // 0abc: aload 65
      // 0abe: ifnonnull 0ae1
      // 0ac1: bipush 0
      // 0ac2: istore 66
      // 0ac4: new me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll
      // 0ac7: dup
      // 0ac8: sipush 200
      // 0acb: invokespecial me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.<init> (I)V
      // 0ace: astore 66
      // 0ad0: aload 62
      // 0ad2: aload 63
      // 0ad4: aload 66
      // 0ad6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0adb: pop
      // 0adc: aload 66
      // 0ade: goto 0ae3
      // 0ae1: aload 65
      // 0ae3: nop
      // 0ae4: checkcast me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll
      // 0ae7: astore 61
      // 0ae9: iload 58
      // 0aeb: aload 5
      // 0aed: ifnonnull 0b07
      // 0af0: ifeq 0b1c
      // 0af3: goto 0afa
      // 0af6: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af9: athrow
      // 0afa: getstatic me/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI;
      // 0afd: invokevirtual me/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.a ()Z
      // 0b00: goto 0b07
      // 0b03: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b06: athrow
      // 0b07: ifne 0b1c
      // 0b0a: aload 61
      // 0b0c: fconst_1
      // 0b0d: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.a (F)V
      // 0b10: aload 5
      // 0b12: ifnull 0b29
      // 0b15: goto 0b1c
      // 0b18: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1b: athrow
      // 0b1c: aload 61
      // 0b1e: fconst_0
      // 0b1f: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.a (F)V
      // 0b22: goto 0b29
      // 0b25: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b28: athrow
      // 0b29: aload 61
      // 0b2b: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 0b2e: iload 60
      // 0b30: ifeq 0b3c
      // 0b33: ldc 10.0
      // 0b35: goto 0b3f
      // 0b38: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3b: athrow
      // 0b3c: ldc_w 6.0
      // 0b3f: fmul
      // 0b40: fstore 62
      // 0b42: fload 45
      // 0b44: aload 0
      // 0b45: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 0b48: fconst_2
      // 0b49: fdiv
      // 0b4a: fadd
      // 0b4b: fstore 63
      // 0b4d: iload 47
      // 0b4f: i2f
      // 0b50: iload 57
      // 0b52: i2f
      // 0b53: fconst_2
      // 0b54: fdiv
      // 0b55: fadd
      // 0b56: fstore 64
      // 0b58: fload 46
      // 0b5a: ldc_w 0.999
      // 0b5d: fcmpg
      // 0b5e: aload 5
      // 0b60: ifnonnull 0b6e
      // 0b63: ifge 0b71
      // 0b66: goto 0b6d
      // 0b69: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6c: athrow
      // 0b6d: bipush 1
      // 0b6e: goto 0b72
      // 0b71: bipush 0
      // 0b72: istore 65
      // 0b74: iload 59
      // 0b76: aload 5
      // 0b78: ifnonnull 0b9e
      // 0b7b: ifne 0b9d
      // 0b7e: goto 0b85
      // 0b81: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b84: athrow
      // 0b85: iload 60
      // 0b87: aload 5
      // 0b89: ifnonnull 0b9e
      // 0b8c: goto 0b93
      // 0b8f: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b92: athrow
      // 0b93: ifeq 0ba1
      // 0b96: goto 0b9d
      // 0b99: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9c: athrow
      // 0b9d: bipush 1
      // 0b9e: goto 0ba2
      // 0ba1: bipush 0
      // 0ba2: istore 66
      // 0ba4: iload 66
      // 0ba6: ifeq 0bbb
      // 0ba9: fconst_1
      // 0baa: aload 61
      // 0bac: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 0baf: ldc_w 0.01
      // 0bb2: fmul
      // 0bb3: fadd
      // 0bb4: goto 0bbc
      // 0bb7: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bba: athrow
      // 0bbb: fconst_1
      // 0bbc: fstore 67
      // 0bbe: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g ()V
      // 0bc1: aload 5
      // 0bc3: ifnonnull 0c2a
      // 0bc6: iload 65
      // 0bc8: ifne 0c09
      // 0bcb: goto 0bd2
      // 0bce: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd1: athrow
      // 0bd2: iload 66
      // 0bd4: aload 5
      // 0bd6: ifnonnull 0c4e
      // 0bd9: goto 0be0
      // 0bdc: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bdf: athrow
      // 0be0: ifeq 0c36
      // 0be3: goto 0bea
      // 0be6: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be9: athrow
      // 0bea: aload 61
      // 0bec: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 0bef: ldc_w 0.01
      // 0bf2: fcmpl
      // 0bf3: aload 5
      // 0bf5: ifnonnull 0c4e
      // 0bf8: goto 0bff
      // 0bfb: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bfe: athrow
      // 0bff: ifle 0c36
      // 0c02: goto 0c09
      // 0c05: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c08: athrow
      // 0c09: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0c0c: fload 63
      // 0c0e: fload 64
      // 0c10: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FF)V
      // 0c13: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0c16: fload 46
      // 0c18: fload 67
      // 0c1a: fmul
      // 0c1b: fload 46
      // 0c1d: fload 67
      // 0c1f: fmul
      // 0c20: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FF)V
      // 0c23: goto 0c2a
      // 0c26: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c29: athrow
      // 0c2a: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0c2d: fload 63
      // 0c2f: fneg
      // 0c30: fload 64
      // 0c32: fneg
      // 0c33: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FF)V
      // 0c36: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0c39: fload 49
      // 0c3b: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (F)V
      // 0c3e: aload 5
      // 0c40: ifnonnull 0e1f
      // 0c43: fload 49
      // 0c45: fconst_0
      // 0c46: fcmpl
      // 0c47: goto 0c4e
      // 0c4a: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4d: athrow
      // 0c4e: ifle 0e02
      // 0c51: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0c54: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.j ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0c57: ldc_w 0.92
      // 0c5a: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.b (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0c5d: fload 62
      // 0c5f: fload 62
      // 0c61: fload 62
      // 0c63: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.b (FFF)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0c66: astore 68
      // 0c68: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0c6b: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ar ()F
      // 0c6e: fstore 69
      // 0c70: iload 66
      // 0c72: aload 5
      // 0c74: ifnonnull 0cd4
      // 0c77: ifeq 0cd2
      // 0c7a: goto 0c81
      // 0c7d: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c80: athrow
      // 0c81: aload 61
      // 0c83: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 0c86: ldc_w 0.02
      // 0c89: fcmpl
      // 0c8a: aload 5
      // 0c8c: ifnonnull 0cd4
      // 0c8f: goto 0c96
      // 0c92: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c95: athrow
      // 0c96: ifle 0cd2
      // 0c99: goto 0ca0
      // 0c9c: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9f: athrow
      // 0ca0: getstatic me/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl;
      // 0ca3: fload 45
      // 0ca5: iload 47
      // 0ca7: i2f
      // 0ca8: aload 0
      // 0ca9: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 0cac: iload 57
      // 0cae: i2f
      // 0caf: fload 69
      // 0cb1: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0cb4: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0cb7: aload 61
      // 0cb9: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 0cbc: ldc_w 0.42
      // 0cbf: fmul
      // 0cc0: ldc_w 3.0
      // 0cc3: bipush 0
      // 0cc4: sipush 256
      // 0cc7: aconst_null
      // 0cc8: invokestatic me/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a (Lme/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl;FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;FFIILjava/lang/Object;)V
      // 0ccb: goto 0cd2
      // 0cce: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd1: athrow
      // 0cd2: iload 60
      // 0cd4: aload 5
      // 0cd6: ifnonnull 0d57
      // 0cd9: ifeq 0d42
      // 0cdc: goto 0ce3
      // 0cdf: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce2: athrow
      // 0ce3: aload 34
      // 0ce5: dup
      // 0ce6: sipush 656
      // 0ce9: sipush -6315
      // 0cec: pop2
      // 0ced: ldc_w "null cannot be cast to non-null type me.octo.client.gui.clickgui.modules.impl.MacroModule"
      // 0cf0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 0cf3: checkcast me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI
      // 0cf6: invokevirtual me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.D ()Z
      // 0cf9: aload 5
      // 0cfb: ifnonnull 0d57
      // 0cfe: goto 0d05
      // 0d01: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d04: athrow
      // 0d05: ifeq 0d42
      // 0d08: goto 0d0f
      // 0d0b: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0e: athrow
      // 0d0f: getstatic me/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl;
      // 0d12: fload 45
      // 0d14: iload 47
      // 0d16: i2f
      // 0d17: aload 0
      // 0d18: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 0d1b: iload 57
      // 0d1d: i2f
      // 0d1e: fload 69
      // 0d20: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0d23: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0d26: ldc2_w 2200
      // 0d29: ldc_w 0.45
      // 0d2c: fload 49
      // 0d2e: fmul
      // 0d2f: ldc_w 0.85
      // 0d32: fload 49
      // 0d34: fmul
      // 0d35: ldc_w 12.0
      // 0d38: invokevirtual me/octo/client/utils/lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;JFFF)V
      // 0d3b: goto 0d42
      // 0d3e: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d41: athrow
      // 0d42: fload 45
      // 0d44: iload 47
      // 0d46: i2f
      // 0d47: aload 0
      // 0d48: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 0d4b: iload 57
      // 0d4d: i2f
      // 0d4e: aload 68
      // 0d50: fload 69
      // 0d52: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 0d55: iload 60
      // 0d57: ifeq 0d77
      // 0d5a: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0d5d: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0d60: ldc_w 0.35
      // 0d63: ldc_w 0.45
      // 0d66: aload 61
      // 0d68: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.e ()F
      // 0d6b: fmul
      // 0d6c: fadd
      // 0d6d: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0d70: goto 0d7d
      // 0d73: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d76: athrow
      // 0d77: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0d7a: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.A ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0d7d: astore 70
      // 0d7f: fload 45
      // 0d81: iload 47
      // 0d83: i2f
      // 0d84: aload 0
      // 0d85: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 0d88: iload 57
      // 0d8a: i2f
      // 0d8b: fconst_1
      // 0d8c: aload 70
      // 0d8e: fload 69
      // 0d90: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 0d93: aload 34
      // 0d95: instanceof me/octo/client/llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl
      // 0d98: aload 5
      // 0d9a: ifnonnull 0db6
      // 0d9d: ifeq 0dc9
      // 0da0: goto 0da7
      // 0da3: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da6: athrow
      // 0da7: aload 34
      // 0da9: checkcast me/octo/client/llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl
      // 0dac: invokevirtual me/octo/client/llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl.ae ()Z
      // 0daf: goto 0db6
      // 0db2: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db5: athrow
      // 0db6: aload 5
      // 0db8: ifnonnull 0dc6
      // 0dbb: ifeq 0dc9
      // 0dbe: goto 0dc5
      // 0dc1: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc4: athrow
      // 0dc5: bipush 1
      // 0dc6: goto 0dca
      // 0dc9: bipush 0
      // 0dca: istore 71
      // 0dcc: aload 5
      // 0dce: ifnonnull 0e1f
      // 0dd1: iload 71
      // 0dd3: ifeq 0e02
      // 0dd6: goto 0ddd
      // 0dd9: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ddc: athrow
      // 0ddd: fload 45
      // 0ddf: iload 47
      // 0de1: i2f
      // 0de2: aload 0
      // 0de3: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 0de6: iload 57
      // 0de8: i2f
      // 0de9: fconst_1
      // 0dea: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0ded: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0df0: ldc_w 0.15
      // 0df3: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0df6: fload 69
      // 0df8: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 0dfb: goto 0e02
      // 0dfe: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e01: athrow
      // 0e02: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0e05: fload 45
      // 0e07: ldc_w 4.0
      // 0e0a: fsub
      // 0e0b: iload 47
      // 0e0d: i2f
      // 0e0e: aload 0
      // 0e0f: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.s ()F
      // 0e12: ldc 8.0
      // 0e14: fadd
      // 0e15: iload 57
      // 0e17: i2f
      // 0e18: ldc_w 4.0
      // 0e1b: fadd
      // 0e1c: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFF)V
      // 0e1f: aload 33
      // 0e21: aload 1
      // 0e22: aload 48
      // 0e24: iload 47
      // 0e26: iload 2
      // 0e27: iload 3
      // 0e28: invokeinterface me/octo/client/IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.a (Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lme/octo/client/llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll;III)Lme/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll; 6
      // 0e2d: astore 68
      // 0e2f: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 0e32: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.i ()V
      // 0e35: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h ()V
      // 0e38: aload 68
      // 0e3a: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.a ()I
      // 0e3d: iload 47
      // 0e3f: isub
      // 0e40: istore 69
      // 0e42: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0e45: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Ljava/util/Map;
      // 0e48: astore 70
      // 0e4a: aload 34
      // 0e4c: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0e4f: astore 71
      // 0e51: iload 69
      // 0e53: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e56: astore 72
      // 0e58: aload 70
      // 0e5a: aload 71
      // 0e5c: aload 72
      // 0e5e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e63: pop
      // 0e64: fload 52
      // 0e66: fconst_0
      // 0e67: fcmpg
      // 0e68: aload 5
      // 0e6a: ifnonnull 0e78
      // 0e6d: ifne 0e7b
      // 0e70: goto 0e77
      // 0e73: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e76: athrow
      // 0e77: bipush 1
      // 0e78: goto 0e7c
      // 0e7b: bipush 0
      // 0e7c: ifeq 0eed
      // 0e7f: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0e82: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // 0e85: aload 34
      // 0e87: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0e8a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e8f: checkcast java/lang/Integer
      // 0e92: dup
      // 0e93: ifnull 0ea7
      // 0e96: goto 0e9d
      // 0e99: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9c: athrow
      // 0e9d: invokevirtual java/lang/Integer.intValue ()I
      // 0ea0: goto 0ea9
      // 0ea3: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea6: athrow
      // 0ea7: pop
      // 0ea8: bipush 0
      // 0ea9: istore 70
      // 0eab: iload 69
      // 0ead: iload 70
      // 0eaf: isub
      // 0eb0: invokestatic java/lang/Math.abs (I)I
      // 0eb3: aload 5
      // 0eb5: ifnonnull 0f7d
      // 0eb8: bipush 2
      // 0eb9: if_icmple 0f6d
      // 0ebc: goto 0ec3
      // 0ebf: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec2: athrow
      // 0ec3: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0ec6: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/util/Map;
      // 0ec9: astore 71
      // 0ecb: aload 34
      // 0ecd: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0ed0: astore 72
      // 0ed2: iload 69
      // 0ed4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ed7: astore 73
      // 0ed9: aload 71
      // 0edb: aload 72
      // 0edd: aload 73
      // 0edf: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ee4: pop
      // 0ee5: aload 0
      // 0ee6: bipush 0
      // 0ee7: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.c (Z)V
      // 0eea: goto 0f6d
      // 0eed: fload 52
      // 0eef: ldc_w 0.999
      // 0ef2: fcmpl
      // 0ef3: aload 5
      // 0ef5: ifnonnull 0f7d
      // 0ef8: iflt 0f6d
      // 0efb: goto 0f02
      // 0efe: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f01: athrow
      // 0f02: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0f05: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Ljava/util/Map;
      // 0f08: aload 34
      // 0f0a: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0f0d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f12: checkcast java/lang/Integer
      // 0f15: dup
      // 0f16: ifnull 0f2a
      // 0f19: goto 0f20
      // 0f1c: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1f: athrow
      // 0f20: invokevirtual java/lang/Integer.intValue ()I
      // 0f23: goto 0f2c
      // 0f26: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f29: athrow
      // 0f2a: pop
      // 0f2b: bipush 0
      // 0f2c: istore 70
      // 0f2e: iload 69
      // 0f30: iload 70
      // 0f32: isub
      // 0f33: invokestatic java/lang/Math.abs (I)I
      // 0f36: aload 5
      // 0f38: ifnonnull 0f7d
      // 0f3b: bipush 2
      // 0f3c: if_icmple 0f6d
      // 0f3f: goto 0f46
      // 0f42: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f45: athrow
      // 0f46: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0f49: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Ljava/util/Map;
      // 0f4c: astore 71
      // 0f4e: aload 34
      // 0f50: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0f53: astore 72
      // 0f55: iload 69
      // 0f57: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f5a: astore 73
      // 0f5c: aload 71
      // 0f5e: aload 72
      // 0f60: aload 73
      // 0f62: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f67: pop
      // 0f68: aload 0
      // 0f69: bipush 0
      // 0f6a: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.c (Z)V
      // 0f6d: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0f70: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/util/Set;
      // 0f73: aload 34
      // 0f75: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0f78: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0f7d: aload 5
      // 0f7f: ifnonnull 0fac
      // 0f82: ifne 0faa
      // 0f85: goto 0f8c
      // 0f88: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8b: athrow
      // 0f8c: getstatic me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0f8f: invokevirtual me/octo/client/IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/util/Set;
      // 0f92: checkcast java/util/Collection
      // 0f95: astore 70
      // 0f97: aload 34
      // 0f99: invokevirtual me/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.aj ()Ljava/lang/String;
      // 0f9c: aload 70
      // 0f9e: swap
      // 0f9f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0fa4: pop
      // 0fa5: aload 0
      // 0fa6: bipush 0
      // 0fa7: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.c (Z)V
      // 0faa: iload 51
      // 0fac: aload 5
      // 0fae: ifnonnull 109c
      // 0fb1: ifeq 1094
      // 0fb4: goto 0fbb
      // 0fb7: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fba: athrow
      // 0fbb: iload 58
      // 0fbd: aload 5
      // 0fbf: ifnonnull 1030
      // 0fc2: goto 0fc9
      // 0fc5: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc8: athrow
      // 0fc9: ifeq 1024
      // 0fcc: goto 0fd3
      // 0fcf: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd2: athrow
      // 0fd3: iload 59
      // 0fd5: aload 5
      // 0fd7: ifnonnull 1030
      // 0fda: goto 0fe1
      // 0fdd: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe0: athrow
      // 0fe1: ifeq 1024
      // 0fe4: goto 0feb
      // 0fe7: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fea: athrow
      // 0feb: getstatic me/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI;
      // 0fee: invokevirtual me/octo/client/llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.a ()Z
      // 0ff1: aload 5
      // 0ff3: ifnonnull 1030
      // 0ff6: goto 0ffd
      // 0ff9: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ffc: athrow
      // 0ffd: ifne 1024
      // 1000: goto 1007
      // 1003: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1006: athrow
      // 1007: aload 0
      // 1008: new me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 100b: dup
      // 100c: aload 34
      // 100e: aload 0
      // 100f: invokespecial me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Lme/octo/client/IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll;Lme/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll;)V
      // 1012: checkcast me/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII
      // 1015: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.b (Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;)V
      // 1018: aload 5
      // 101a: ifnull 1094
      // 101d: goto 1024
      // 1020: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1023: athrow
      // 1024: aload 68
      // 1026: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.c ()Z
      // 1029: goto 1030
      // 102c: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102f: athrow
      // 1030: aload 5
      // 1032: ifnonnull 109c
      // 1035: ifeq 1094
      // 1038: goto 103f
      // 103b: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103e: athrow
      // 103f: iload 3
      // 1040: i2f
      // 1041: aload 0
      // 1042: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 1045: bipush 5
      // 1046: i2f
      // 1047: fadd
      // 1048: fcmpl
      // 1049: aload 5
      // 104b: ifnonnull 109c
      // 104e: goto 1055
      // 1051: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1054: athrow
      // 1055: ifle 1094
      // 1058: goto 105f
      // 105b: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105e: athrow
      // 105f: iload 3
      // 1060: i2f
      // 1061: aload 0
      // 1062: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 1065: aload 0
      // 1066: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.n ()F
      // 1069: fadd
      // 106a: bipush 5
      // 106b: i2f
      // 106c: fsub
      // 106d: fcmpg
      // 106e: aload 5
      // 1070: ifnonnull 109c
      // 1073: goto 107a
      // 1076: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1079: athrow
      // 107a: ifge 1094
      // 107d: goto 1084
      // 1080: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1083: athrow
      // 1084: aload 0
      // 1085: aload 68
      // 1087: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.b ()Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;
      // 108a: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.b (Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;)V
      // 108d: goto 1094
      // 1090: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1093: athrow
      // 1094: aload 68
      // 1096: invokevirtual me/octo/client/lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll.a ()I
      // 1099: iload 47
      // 109b: isub
      // 109c: istore 70
      // 109e: iload 42
      // 10a0: iload 70
      // 10a2: iadd
      // 10a3: bipush 8
      // 10a5: iadd
      // 10a6: istore 71
      // 10a8: iload 39
      // 10aa: aload 5
      // 10ac: ifnonnull 10cb
      // 10af: ifeq 10c2
      // 10b2: goto 10b9
      // 10b5: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b8: athrow
      // 10b9: iload 71
      // 10bb: istore 19
      // 10bd: aload 5
      // 10bf: ifnull 10cd
      // 10c2: iload 71
      // 10c4: goto 10cb
      // 10c7: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10ca: athrow
      // 10cb: istore 20
      // 10cd: iload 29
      // 10cf: iinc 29 1
      // 10d2: pop
      // 10d3: iinc 31 1
      // 10d6: aload 5
      // 10d8: ifnull 02db
      // 10db: iload 19
      // 10dd: iload 20
      // 10df: invokestatic java/lang/Math.max (II)I
      // 10e2: bipush 30
      // 10e4: isub
      // 10e5: istore 30
      // 10e7: aload 0
      // 10e8: iload 30
      // 10ea: iload 12
      // 10ec: isub
      // 10ed: i2f
      // 10ee: aload 0
      // 10ef: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.l ()F
      // 10f2: aload 0
      // 10f3: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.n ()F
      // 10f6: fadd
      // 10f7: bipush 10
      // 10f9: i2f
      // 10fa: fsub
      // 10fb: fsub
      // 10fc: bipush 30
      // 10fe: i2f
      // 10ff: fadd
      // 1100: f2i
      // 1101: ineg
      // 1102: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (I)V
      // 1105: aload 0
      // 1106: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.i ()Z
      // 1109: aload 5
      // 110b: ifnonnull 1199
      // 110e: ifne 1189
      // 1111: goto 1118
      // 1114: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1117: athrow
      // 1118: aload 0
      // 1119: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.p ()F
      // 111c: f2i
      // 111d: bipush 15
      // 111f: iadd
      // 1120: istore 31
      // 1122: aload 5
      // 1124: ifnonnull 1187
      // 1127: aload 0
      // 1128: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.t ()Ljava/util/Map;
      // 112b: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 1130: checkcast java/lang/Iterable
      // 1133: invokestatic kotlin/collections/CollectionsKt.maxOrNull (Ljava/lang/Iterable;)Ljava/lang/Comparable;
      // 1136: checkcast java/lang/Integer
      // 1139: dup
      // 113a: ifnull 1186
      // 113d: goto 1144
      // 1140: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1143: athrow
      // 1144: checkcast java/lang/Number
      // 1147: invokevirtual java/lang/Number.intValue ()I
      // 114a: istore 34
      // 114c: bipush 0
      // 114d: istore 35
      // 114f: iload 31
      // 1151: iload 34
      // 1153: isub
      // 1154: iload 12
      // 1156: iadd
      // 1157: istore 36
      // 1159: aload 5
      // 115b: ifnonnull 1180
      // 115e: iload 36
      // 1160: aload 0
      // 1161: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.h ()I
      // 1164: if_icmpge 117b
      // 1167: goto 116e
      // 116a: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116d: athrow
      // 116e: aload 0
      // 116f: iload 36
      // 1171: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (I)V
      // 1174: goto 117b
      // 1177: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117a: athrow
      // 117b: nop
      // 117c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 117f: pop
      // 1180: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1183: goto 1188
      // 1186: pop
      // 1187: aconst_null
      // 1188: pop
      // 1189: aload 0
      // 118a: aload 5
      // 118c: ifnonnull 11dc
      // 118f: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.h ()I
      // 1192: goto 1199
      // 1195: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1198: athrow
      // 1199: ifge 11d2
      // 119c: aload 0
      // 119d: aload 5
      // 119f: ifnonnull 11dc
      // 11a2: goto 11a9
      // 11a5: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a8: athrow
      // 11a9: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.h ()I
      // 11ac: i2f
      // 11ad: aload 0
      // 11ae: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // 11b1: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.h ()F
      // 11b4: fcmpl
      // 11b5: ifle 11d2
      // 11b8: goto 11bf
      // 11bb: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11be: athrow
      // 11bf: aload 0
      // 11c0: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.g ()Lme/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
      // 11c3: aload 0
      // 11c4: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.h ()I
      // 11c7: i2f
      // 11c8: invokevirtual me/octo/client/utils/llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.a (F)V
      // 11cb: goto 11d2
      // 11ce: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d1: athrow
      // 11d2: getstatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
      // 11d5: invokevirtual me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.i ()V
      // 11d8: aload 0
      // 11d9: invokevirtual me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.j ()Lme/octo/client/IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII;
      // 11dc: ifnull 11e7
      // 11df: bipush 1
      // 11e0: goto 11e8
      // 11e3: invokestatic me/octo/client/IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e6: athrow
      // 11e7: bipush 0
      // 11e8: ireturn
   }

   private static final int a(
      IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll var0,
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var1,
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var2
   ) {
      int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var4 = var1.m();
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var5 = var2.m();
      int[] var3 = var10000;
      int var11 = ((var0.i()) ? 1 : 0);
      if (var3 == null) {
         if (var11 != 0) {
            int var14 = ((var4 instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI) ? 1 : 0);
            if (var3 == null) {
               var14 = var14 != 0 ? 0 : 1;
            }

            int var9 = var14;
            int var15 = ((var5 instanceof IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI) ? 1 : 0);
            if (var3 == null) {
               var15 = var15 != 0 ? 0 : 1;
            }

            int var10 = var15;
            int var8 = Intrinsics.compare(var9, var10);
            int var16 = var8;
            if (var3 == null) {
               if (var8 != 0) {
                  return var8;
               }

               var16 = var4.aj().compareTo(var5.aj());
            }

            return var16;
         }

         var11 = var4.am().compareTo(var5.am());
      }

      int var6 = var11;
      int var12 = var6;
      if (var3 == null) {
         if (var6 != 0) {
            return var6;
         }

         var12 = Intrinsics.compare(var5.ao(), var4.ao());
      }

      int var7 = var12;
      int var13 = var7;
      if (var3 == null) {
         if (var7 != 0) {
            return var7;
         }

         var13 = var4.aj().compareTo(var5.aj());
      }

      return var13;
   }

   private static final int a(Function2 var0, Object var1, Object var2) {
      return ((Number)var0.invoke(var1, var2)).intValue();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "f\fß\u0007Ô_«;\u0014Y<¬\u0080\u0019¡ÊC-è¡ñæÍ¯¢üÙØrMò÷'Ú\u0094æV#\"\b;û\u0082Iè\u000fà\u008df/\u0001_Ã(dß{öÙá%y\u0002ÁÉÿ\u000bÛÏÂ¦[\u0095\u009cär#\u009aøå´\u008d¹þÁ\u0080¦UÛèÇRó\t\u0086\u0002ïÿ3\b>\tt2c\u008b§\u009f\u0007,·,;3\u008eé\u000fá\u0085\u001a-»8%Ææ\u0097\u0081\u0006qO¶\u000f»\u008dQ,Ò\u0018\bÂC\u00175\u0016çMd\u0014\tR¤æ\u008b\u009eb\u0092æ\u0081\u009dD/÷°qT@\u0085E/ÖÑÝ¶\n?6\u0093Fv$\u001cwðõ\u00173¥/âY\u0002Rd:1\u0083Ù\u0098Wl\u0010h4µ K~\u0019Í¦\u0018NÊëç\u0019\u000f\fø\u0007}\u008b\u001añqMR\u008c\\H6R\u000fìq\u008bêå§c\u009eus É|ÎX\u0014\u008d=4\u000b\u0099# %®w\u0094\u009a\u000e,\u0094\nÐ/\u0015¨\u0004æ\u0096km\n*>öÔ3W\u00ad\u0014O}\u0010¿*\u0090\u008cíá\u0083£\u008eäÂÙÔ\nJ \ndê?N\n\u0004\u008a~«0\n7ÛL²X1\u0015{#/\nt]\t6 Z£ìB\u007f\blÍ\u008a;\u001d\u0080+N/i\u0090*\u009eô:é3½b[\u009e\u0098 \b\u001d\u008cäØÊ§\u0007\u008dÄÁ%ü[w\u0007\u0091\u001a×uB\u0088µ{Æm]\f1H\u0004·ä\u0006Âò7^òë";
      int var4 = "f\fß\u0007Ô_«;\u0014Y<¬\u0080\u0019¡ÊC-è¡ñæÍ¯¢üÙØrMò÷'Ú\u0094æV#\"\b;û\u0082Iè\u000fà\u008df/\u0001_Ã(dß{öÙá%y\u0002ÁÉÿ\u000bÛÏÂ¦[\u0095\u009cär#\u009aøå´\u008d¹þÁ\u0080¦UÛèÇRó\t\u0086\u0002ïÿ3\b>\tt2c\u008b§\u009f\u0007,·,;3\u008eé\u000fá\u0085\u001a-»8%Ææ\u0097\u0081\u0006qO¶\u000f»\u008dQ,Ò\u0018\bÂC\u00175\u0016çMd\u0014\tR¤æ\u008b\u009eb\u0092æ\u0081\u009dD/÷°qT@\u0085E/ÖÑÝ¶\n?6\u0093Fv$\u001cwðõ\u00173¥/âY\u0002Rd:1\u0083Ù\u0098Wl\u0010h4µ K~\u0019Í¦\u0018NÊëç\u0019\u000f\fø\u0007}\u008b\u001añqMR\u008c\\H6R\u000fìq\u008bêå§c\u009eus É|ÎX\u0014\u008d=4\u000b\u0099# %®w\u0094\u009a\u000e,\u0094\nÐ/\u0015¨\u0004æ\u0096km\n*>öÔ3W\u00ad\u0014O}\u0010¿*\u0090\u008cíá\u0083£\u008eäÂÙÔ\nJ \ndê?N\n\u0004\u008a~«0\n7ÛL²X1\u0015{#/\nt]\t6 Z£ìB\u007f\blÍ\u008a;\u001d\u0080+N/i\u0090*\u009eô:é3½b[\u009e\u0098 \b\u001d\u008cäØÊ§\u0007\u008dÄÁ%ü[w\u0007\u0091\u001a×uB\u0088µ{Æm]\f1H\u0004·ä\u0006Âò7^òë"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 91;
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
                     case 0 -> 79;
                     case 1 -> 90;
                     case 2 -> 17;
                     case 3 -> 64;
                     case 4 -> 98;
                     case 5 -> 83;
                     default -> 78;
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
                     d = var5;
                     e = new String[22];
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

                  var2 = "4dq\u009f47w¥ì¹ÉP\u0091Æ\u0018\u0010ç\u0016êzÓN5')\u0005G\u0094\u0015Ò\u0003J";
                  var4 = "4dq\u009f47w¥ì¹ÉP\u0091Æ\u0018\u0010ç\u0016êzÓN5')\u0005G\u0094\u0015Ò\u0003J".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 72;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 657) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 238;
            case 1 -> 37;
            case 2 -> 116;
            case 3 -> 54;
            case 4 -> 125;
            case 5 -> 215;
            case 6 -> 5;
            case 7 -> 71;
            case 8 -> 89;
            case 9 -> 146;
            case 10 -> 36;
            case 11 -> 110;
            case 12 -> 133;
            case 13 -> 193;
            case 14 -> 214;
            case 15 -> 2;
            case 16 -> 55;
            case 17 -> 203;
            case 18 -> 115;
            case 19 -> 58;
            case 20 -> 92;
            case 21 -> 28;
            case 22 -> 8;
            case 23 -> 254;
            case 24 -> 60;
            case 25 -> 174;
            case 26 -> 130;
            case 27 -> 195;
            case 28 -> 139;
            case 29 -> 9;
            case 30 -> 106;
            case 31 -> 113;
            case 32 -> 66;
            case 33 -> 61;
            case 34 -> 199;
            case 35 -> 197;
            case 36 -> 205;
            case 37 -> 189;
            case 38 -> 178;
            case 39 -> 87;
            case 40 -> 15;
            case 41 -> 200;
            case 42 -> 32;
            case 43 -> 144;
            case 44 -> 239;
            case 45 -> 40;
            case 46 -> 51;
            case 47 -> 187;
            case 48 -> 196;
            case 49 -> 24;
            case 50 -> 109;
            case 51 -> 162;
            case 52 -> 207;
            case 53 -> 70;
            case 54 -> 26;
            case 55 -> 177;
            case 56 -> 122;
            case 57 -> 159;
            case 58 -> 30;
            case 59 -> 13;
            case 60 -> 94;
            case 61 -> 183;
            case 62 -> 131;
            case 63 -> 72;
            case 64 -> 216;
            case 65 -> 224;
            case 66 -> 59;
            case 67 -> 93;
            case 68 -> 35;
            case 69 -> 150;
            case 70 -> 235;
            case 71 -> 85;
            case 72 -> 227;
            case 73 -> 120;
            case 74 -> 48;
            case 75 -> 27;
            case 76 -> 170;
            case 77 -> 76;
            case 78 -> 108;
            case 79 -> 4;
            case 80 -> 102;
            case 81 -> 11;
            case 82 -> 31;
            case 83 -> 247;
            case 84 -> 181;
            case 85 -> 62;
            case 86 -> 100;
            case 87 -> 251;
            case 88 -> 7;
            case 89 -> 166;
            case 90 -> 210;
            case 91 -> 153;
            case 92 -> 175;
            case 93 -> 218;
            case 94 -> 167;
            case 95 -> 96;
            case 96 -> 88;
            case 97 -> 186;
            case 98 -> 114;
            case 99 -> 231;
            case 100 -> 56;
            case 101 -> 23;
            case 102 -> 39;
            case 103 -> 171;
            case 104 -> 0;
            case 105 -> 127;
            case 106 -> 169;
            case 107 -> 147;
            case 108 -> 91;
            case 109 -> 79;
            case 110 -> 107;
            case 111 -> 157;
            case 112 -> 111;
            case 113 -> 241;
            case 114 -> 126;
            case 115 -> 213;
            case 116 -> 74;
            case 117 -> 220;
            case 118 -> 194;
            case 119 -> 121;
            case 120 -> 142;
            case 121 -> 138;
            case 122 -> 243;
            case 123 -> 237;
            case 124 -> 201;
            case 125 -> 226;
            case 126 -> 229;
            case 127 -> 252;
            case 128 -> 47;
            case 129 -> 208;
            case 130 -> 242;
            case 131 -> 25;
            case 132 -> 67;
            case 133 -> 176;
            case 134 -> 253;
            case 135 -> 221;
            case 136 -> 128;
            case 137 -> 42;
            case 138 -> 173;
            case 139 -> 164;
            case 140 -> 49;
            case 141 -> 75;
            case 142 -> 202;
            case 143 -> 52;
            case 144 -> 137;
            case 145 -> 156;
            case 146 -> 21;
            case 147 -> 22;
            case 148 -> 99;
            case 149 -> 163;
            case 150 -> 38;
            case 151 -> 33;
            case 152 -> 217;
            case 153 -> 1;
            case 154 -> 149;
            case 155 -> 222;
            case 156 -> 45;
            case 157 -> 180;
            case 158 -> 168;
            case 159 -> 64;
            case 160 -> 118;
            case 161 -> 148;
            case 162 -> 6;
            case 163 -> 209;
            case 164 -> 41;
            case 165 -> 29;
            case 166 -> 44;
            case 167 -> 165;
            case 168 -> 82;
            case 169 -> 19;
            case 170 -> 12;
            case 171 -> 234;
            case 172 -> 65;
            case 173 -> 103;
            case 174 -> 112;
            case 175 -> 18;
            case 176 -> 154;
            case 177 -> 135;
            case 178 -> 104;
            case 179 -> 69;
            case 180 -> 101;
            case 181 -> 155;
            case 182 -> 219;
            case 183 -> 249;
            case 184 -> 124;
            case 185 -> 225;
            case 186 -> 57;
            case 187 -> 248;
            case 188 -> 68;
            case 189 -> 143;
            case 190 -> 14;
            case 191 -> 80;
            case 192 -> 246;
            case 193 -> 140;
            case 194 -> 20;
            case 195 -> 255;
            case 196 -> 53;
            case 197 -> 119;
            case 198 -> 184;
            case 199 -> 136;
            case 200 -> 198;
            case 201 -> 16;
            case 202 -> 90;
            case 203 -> 141;
            case 204 -> 117;
            case 205 -> 236;
            case 206 -> 81;
            case 207 -> 151;
            case 208 -> 161;
            case 209 -> 132;
            case 210 -> 233;
            case 211 -> 245;
            case 212 -> 98;
            case 213 -> 204;
            case 214 -> 10;
            case 215 -> 105;
            case 216 -> 134;
            case 217 -> 86;
            case 218 -> 211;
            case 219 -> 212;
            case 220 -> 158;
            case 221 -> 78;
            case 222 -> 240;
            case 223 -> 190;
            case 224 -> 43;
            case 225 -> 84;
            case 226 -> 179;
            case 227 -> 192;
            case 228 -> 160;
            case 229 -> 97;
            case 230 -> 95;
            case 231 -> 228;
            case 232 -> 223;
            case 233 -> 129;
            case 234 -> 244;
            case 235 -> 46;
            case 236 -> 172;
            case 237 -> 34;
            case 238 -> 230;
            case 239 -> 232;
            case 240 -> 145;
            case 241 -> 77;
            case 242 -> 191;
            case 243 -> 182;
            case 244 -> 17;
            case 245 -> 206;
            case 246 -> 73;
            case 247 -> 152;
            case 248 -> 185;
            case 249 -> 3;
            case 250 -> 50;
            case 251 -> 250;
            case 252 -> 188;
            case 253 -> 63;
            case 254 -> 83;
            default -> 123;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2, boolean var3, int var4, kotlin.jvm.internal.DefaultConstructorMarker var5) {
      if ((var4 & 4) != 0) {
         var3 = false;
      }

      this(var1, var2, var3);
   }

}
