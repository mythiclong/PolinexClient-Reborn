package me.octo.client.utils.player.pathfinder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll() {
   }

   @NotNull
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @NotNull long[] var1, double var2
   ) {
      Collection var27 = null; // PX-FIX
      short var10001 = 15331;
      short var10002 = 11528;
      Intrinsics.checkNotNullParameter(var1, "path");
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      int var7 = 0;
      long[] var8 = var1;
      Collection var9 = new ArrayList(var1.length);
      int var4 = var10000;
      boolean var10 = false;
      int var11 = 0;
      int var12 = var1.length;

      while (true) {
         if (var11 < var12) {
            long var13 = var8[var11];
            var27 = var9;
            if (var4 == 0) {
               break;
            }

            boolean var17 = false;
            BlockPos var18 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .e(var13);
            var9.add(
               new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var18,
                  lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g(var18),
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               )
            );
            var11++;
            if (var4 != 0) {
               continue;
            }
         }

         var27 = var9;
         break;
      }

      List var5 = (List)var27;
      ArrayList var6 = new ArrayList();
      var6.add(CollectionsKt.first(var5));
      var7 = 0;

      while (true) {
         if (var7 < var5.size() - 1) {
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var21 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var5.get(
               var7
            );
            int var22 = var7 + 1;
            Vec3 var28 = var21.b()
               .add(0.0, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B(), 0.0);
            var10002 = 15332;
            short var10003 = -9011;
            Intrinsics.checkNotNullExpressionValue(var28, "add(...)");
            Vec3 var23 = var28;
            var11 = 0;
            var12 = var7 + 1;
            var10000 = var5.size();
            if (var4 == 0) {
               break;
            }

            int var26 = var10000;

            label57: {
               while (var12 < var26) {
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var5.get(
                     var12
                  );
                  var10000 = ((NativePathFinder.canEtherwarpTo(
                     var23.x,
                     var23.y,
                     var23.z,
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var14.a()),
                     var2
                  )) ? 1 : 0);
                  if (var4 == 0) {
                     break label57;
                  }

                  label80: {
                     if (var4 != 0) {
                        if (var10000 != 0) {
                           var22 = var12;
                           var11 = 0;
                           if (var4 != 0) {
                              break label80;
                           }
                        }

                        var10000 = ++var11;
                     }

                     if (var4 == 0) {
                        break label57;
                     }

                     if (var10000 > 100) {
                        break;
                     }
                  }

                  var12++;
                  if (var4 == 0) {
                     break;
                  }
               }

               var6.add(var5.get(var22));
               var10000 = var22;
            }

            var7 = var10000;
            if (var4 != 0) {
               continue;
            }
         }

         List var31 = var6;
         if (var4 == 0) {
            return var31;
         }

         var10000 = ((Intrinsics.areEqual(
            ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)CollectionsKt.last(
                  var31
               ))
               .a(),
            ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)CollectionsKt.last(
                  var5
               ))
               .a()
         )) ? 1 : 0);
         break;
      }

      if (var10000 == 0) {
         var6.add(CollectionsKt.last(var5));
      }

      return var6;
   }

   @NotNull
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @NotNull long[] var1, double var2, double var4, boolean var6
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = 15330;
      short var10003 = -26658;
      Intrinsics.checkNotNullParameter(var1, "path");
      int var7 = var10000;
      if (var7 != 0) {
         ClientLevel var13 = this.a().level;
         if (var13 != null) {
            ClientLevel var8 = var13;
            List var9 = this.a(var1, var2, var4, var8);
            if (!var6) {
               return var9;
            }

            List var10 = this.b(var9, var4);
            List var11 = this.a(var10, var2);
            return this.a(var11);
         }
      }

      return CollectionsKt.emptyList();
   }

   private final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var1
   ) {
      int var13 = 0; // PX-FIX
      int var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (var2 == 0) {
         Object var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var3 = (ClientLevel)var10000;
            ArrayList var4 = new ArrayList();
            var4.add(CollectionsKt.first(var1));
            int var5 = 0;

            while (true) {
               if (var5 < var1.size() - 1) {
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
                     var5
                  );
                  var10000 = ((ClientLevel)(Object)(var6.c()));
                  if (var2 != 0) {
                     break;
                  }

                  int var7 = var10000
                        == IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     ? 1
                     : 0;
                  int var8 = var5 + 1;
                  var13 = var7;
                  label54:
                  if (var2 == 0) {
                     if (var7 != 0) {
                        int var9 = var5 + 1;
                        int var10 = var1.size();

                        while (var9 < var10) {
                           IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
                              var9
                           );
                           var13 = ((var3.isLoaded(var11.a())) ? 1 : 0);
                           if (var2 != 0 || var2 != 0) {
                              break label54;
                           }

                           if (var13 == 0
                              || var11.c()
                                 != IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                            {
                              break;
                           }

                           label77: {
                              label103: {
                                 int var14 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                                    lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                    var6.b(),
                                    var11.b(),
                                    null,
                                    0,
                                    false,
                                    0.0,
                                    false,
                                    false,
                                    0.05);
                                 if (var2 == 0) {
                                    if (var14 == 0) {
                                       break label103;
                                    }

                                    var14 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                                       lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                       var6.b(),
                                       var11.b(),
                                       null,
                                       0,
                                       false,
                                       0.0,
                                       false,
                                       false,
                                       -0.1);
                                 }

                                 if (var2 == 0) {
                                    if (var14 == 0) {
                                       break label103;
                                    }

                                    var14 = var9;
                                 }

                                 var8 = var14;
                                 if (var2 == 0) {
                                    break label77;
                                 }
                              }

                              if (var2 == 0) {
                                 break;
                              }
                           }

                           var9++;
                           if (var2 != 0) {
                              break;
                           }
                        }
                     }

                     var4.add(var1.get(var8));
                     var13 = var8;
                  }

                  var5 = var13;
                  if (var2 == 0) {
                     continue;
                  }
               }

               List var15 = var4;
               if (var2 != 0) {
                  return var15;
               }

               var10000 = (ClientLevel)CollectionsKt.last(var15);
               break;
            }

            if (!Intrinsics.areEqual(
               ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000)
                  .a(),
               ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)CollectionsKt.last(
                     var1
                  ))
                  .a()
            )) {
               var4.add(CollectionsKt.last(var1));
            }

            return var4;
         }
      }

      return var1;
   }

   private final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var1,
      double var2
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      ArrayList var5 = new ArrayList();
      int var4 = var10000;
      double var6 = var2 * 0.6;
      int var8 = 0;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = null;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10 = null;
      int var11 = 0;

      while (var8 <= CollectionsKt.getLastIndex(var1)) {
         if (var4 == 0) {
            return var1;
         }

         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12;
         label109: {
            var12 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
               var8
            );
            if (var4 != 0) {
               if (var8 < CollectionsKt.getLastIndex(var1)) {
                  break label109;
               }

               var5.add(var12);
            }

            if (var4 != 0) {
               break;
            }
         }

         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var21 = var9;
         if (var4 != 0) {
            if (var9 == null) {
               label119: {
                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var22 = var12;
                  if (var4 != 0) {
                     if (var12.c()
                        != IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        )
                      {
                        var10 = var12;
                        var5.add(var12);
                        if (var4 != 0) {
                           break label119;
                        }
                     }

                     var22 = var10;
                  }

                  if (var4 != 0) {
                     if (var22 == null) {
                        var5.add(var12);
                        if (var4 != 0) {
                           break label119;
                        }
                     }

                     var22 = var12;
                  }

                  var9 = var22;
               }

               var8++;
               if (var4 != 0) {
                  continue;
               }
            }

            var21 = var10;
         }

         if (var21 == null) {
            var5.add(var12);
            var8++;
            if (var4 != 0) {
               continue;
            }
         }

         int var13 = var8;
         var11 = var8;

         while (true) {
            label77:
            if (var13 <= CollectionsKt.getLastIndex(var1)) {
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
                  var13
               );
               double var15 = var14.b().y - var10.b().y;
               double var17 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var14.b(), var10.b());
               double var24;
               var10000 = (var24 = var17 - var6) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
               if (var4 == 0) {
                  break;
               }

               label74: {
                  label121: {
                     if (var4 != 0) {
                        if (var10000 >= 0) {
                           break label121;
                        }

                        double var25;
                        var10000 = (var25 = var15 - var2) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
                     }

                     if (var4 != 0) {
                        if (var10000 > 0) {
                           break label121;
                        }

                        var9 = var14;
                        var10000 = var13;
                     }

                     var11 = var10000;
                     if (var4 != 0) {
                        break label74;
                     }
                  }

                  if (var4 != 0) {
                     break label77;
                  }
               }

               var13++;
               if (var4 != 0) {
                  continue;
               }
            }

            var9.a(
               IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
            var5.add(var9);
            var10000 = var11;
            break;
         }

         if (var4 != 0) {
            var10000 = var10000 == var8
               ? var8
               : IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var11 + 1, var8 + 1),
                     CollectionsKt.getLastIndex(var1)
                  );
         }

         var8 = var10000;
         var10 = var9;
         var9 = null;
      }

      return var5;
   }

   private final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b(
      List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var1,
      double var2
   ) {
      ArrayList var5 = new ArrayList();
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      int var6 = CollectionsKt.getLastIndex(var1);
      int var4 = var10000;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = null;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = null;
      int var9 = var6;

      label95:
      while (true) {
         var10000 = var6;

         label92:
         while (var10000 >= 0) {
            if (var4 == 0) {
               return var1;
            }

            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10;
            label89: {
               var10 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
                  var6
               );
               if (var4 != 0) {
                  if (var6 != 0) {
                     break label89;
                  }

                  var5.add(var10);
               }

               if (var4 != 0) {
                  break;
               }
            }

            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var26 = var7;
            if (var4 != 0) {
               if (var7 == null) {
                  label75: {
                     IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var27 = var10;
                     if (var4 != 0) {
                        if (var10.c()
                           != IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                           )
                         {
                           var5.add(var10);
                           break label75;
                        }

                        var27 = var10;
                     }

                     var7 = var27;
                     var5.add(var10);
                  }

                  var6--;
                  if (var4 != 0) {
                     continue label95;
                  }
               }

               var26 = var10;
            }

            double var11 = var26.b().x;
            double var13 = var10.b().y + me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B();
            double var15 = var10.b().z;
            byte var28 = ((byte)((NativePathFinder.canEtherwarpTo(
               var11,
               var13,
               var15,
               IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var7.a()),
               var2
            )) ? 1 : 0));
            if (var4 != 0) {
               if (var28 != 0) {
                  var8 = var10;
                  var9 = var6--;
                  if (var4 != 0) {
                     continue label95;
                  }
               }

               var28 = 20;
            }

            byte var17 = var28;
            int var18 = 0;
            int var19 = var6;

            label66:
            while (true) {
               var10000 = var19;

               do {
                  if (var10000 < 0) {
                     break label66;
                  }

                  IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var20 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
                     var19
                  );
                  var11 = var20.b().x;
                  var13 = var20.b().y + me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.B();
                  var15 = var20.b().z;
                  var10000 = ((NativePathFinder.canEtherwarpTo(
                     var11,
                     var13,
                     var15,
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var7.a()),
                     var2
                  )) ? 1 : 0);
                  if (var4 == 0) {
                     continue label92;
                  }

                  if (var4 != 0) {
                     if (var10000 != 0) {
                        var8 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var1.get(
                           var19
                        );
                        var9 = var19;
                        var18 = 0;
                        var19--;
                        if (var4 != 0) {
                           continue label66;
                        }
                     }

                     var19--;
                     var10000 = ++var18;
                  }
               } while (var4 == 0);

               if (var10000 == var17) {
                  break;
               }
            }

            if (var8 != null) {
               var5.add(var8);
               var6 = var9;
            }

            var7 = null;
            var8 = null;
            continue label95;
         }

         return CollectionsKt.reversed(var5);
      }
   }

   private final boolean a(BlockPos var1, ClientLevel var2) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      BlockState var10001 = var2.getBlockState(var1);
      short var10003 = 15329;
      short var10004 = -5286;
      Intrinsics.checkNotNullExpressionValue(var10001, "getBlockState(...)");
      BlockState var4 = var10001;
      int var3 = var10000;
      boolean var5 = var4.isAir();
      if (var3 == 0) {
         if (!var5) {
            var5 = var4.getCollisionShape(var2, var1).isEmpty();
            if (var3 != 0) {
               return var5;
            }

            if (!var5) {
               return false;
            }
         }

         var5 = true;
      }

      return var5;
   }

   private final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      long[] var1, double var2, double var4, ClientLevel var6
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      ArrayList var8 = new ArrayList();
      BlockPos var10 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .e(ArraysKt.first(var1));
      int var7 = var10000;
      boolean var11 = false;
      var8.add(
         new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var10,
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(var10),
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )
      );
      var10000 = var1.length;
      if (var7 != 0) {
         if (var10000 == 1) {
            return var8;
         }

         var10000 = 1;
      }

      int var9 = var10000;
      int var18 = ArraysKt.getLastIndex(var1);
      if (var9 <= var18) {
         do {
            BlockPos var19 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .e(var1[var9 - 1]);
            BlockPos var12 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .e(var1[var9]);
            Vec3 var13 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(var12);
            double var14 = var13.y
               - lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var19)
                  .y;
            BlockState var21 = var6.getBlockState(var12);
            short var10002 = 15328;
            short var10003 = -15258;
            Intrinsics.checkNotNullExpressionValue(var21, "getBlockState(...)");
            BlockState var16 = var21;
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var23;
            if (var14 > var2) {
               var23 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               if (var7 != 0) {
               }
            } else {
               label79: {
                  var10000 = var14 > 0.5625D ? 1 : 0;
                  label67:
                  if (var7 != 0) {
                     if (var10000 > 0) {
                        var10000 = ((this.a(new BlockPos(var19.getX(), var12.getY(), var19.getZ()), var6)) ? 1 : 0);
                        if (var7 == 0) {
                           break label67;
                        }

                        if (var10000 == 0) {
                           var23 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                           break label79;
                        }
                     }

                     var10000 = ((var16.getBlock() instanceof StairBlock) ? 1 : 0);
                  }

                  if (var7 != 0) {
                     if (var10000 != 0 && var16.getValue(StairBlock.HALF) == Half.BOTTOM) {
                        double var27;
                        var10000 = (var27 = Math.abs(var14) - 1.0) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
                        if (var7 != 0) {
                           var10000 = (((var10000 == 0) ? 1 : 0));
                        }

                        if ((var10000 != 0)) {
                           var23 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           break label79;
                        }
                     }

                     var10000 = var14 > 0.5625D ? 1 : 0;
                  }

                  var23 = var10000 > 0
                     ? IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     : IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               }
            }

            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var17 = var23;
            if (var7 == 0) {
               return var8;
            }

            var8.add(
               new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var12, var13, var17
               )
            );
            if (var9 == var18) {
               break;
            }

            var9++;
         } while (var7 != 0);
      }

      return var8;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0019ÙïÌf\u009c\tÏ\r¸\u0085\u0094ø\u0007M\u0093_Ì\u0012k¸¡à¯\u00190\u007f*®aVd_Þ\u0098-\u00ad\u0004\u0004\u008c¹È";
      int var4 = "\u0019ÙïÌf\u009c\tÏ\r¸\u0085\u0094ø\u0007M\u0093_Ì\u0012k¸¡à¯\u00190\u007f*®aVd_Þ\u0098-\u00ad\u0004\u0004\u008c¹È".length();
      char var1 = 18;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 107;
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
                     case 0 -> 59;
                     case 1 -> 91;
                     case 2 -> 82;
                     case 3 -> 17;
                     case 4 -> 65;
                     case 5 -> 68;
                     default -> 105;
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
                     c = var5;
                     d = new String[5];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll();
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

                  var2 = "\u0013M«\u0000\b\u0087í\u001añx\u00ad}2";
                  var4 = "\u0013M«\u0000\b\u0087í\u001añx\u00ad}2".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 93;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15328) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 38;
            case 1 -> 118;
            case 2 -> 209;
            case 3 -> 123;
            case 4 -> 116;
            case 5 -> 138;
            case 6 -> 10;
            case 7 -> 216;
            case 8 -> 53;
            case 9 -> 15;
            case 10 -> 131;
            case 11 -> 197;
            case 12 -> 96;
            case 13 -> 97;
            case 14 -> 137;
            case 15 -> 159;
            case 16 -> 243;
            case 17 -> 195;
            case 18 -> 62;
            case 19 -> 110;
            case 20 -> 55;
            case 21 -> 149;
            case 22 -> 199;
            case 23 -> 63;
            case 24 -> 174;
            case 25 -> 80;
            case 26 -> 8;
            case 27 -> 85;
            case 28 -> 108;
            case 29 -> 54;
            case 30 -> 109;
            case 31 -> 244;
            case 32 -> 175;
            case 33 -> 102;
            case 34 -> 14;
            case 35 -> 251;
            case 36 -> 33;
            case 37 -> 98;
            case 38 -> 245;
            case 39 -> 166;
            case 40 -> 162;
            case 41 -> 23;
            case 42 -> 150;
            case 43 -> 185;
            case 44 -> 228;
            case 45 -> 233;
            case 46 -> 178;
            case 47 -> 57;
            case 48 -> 65;
            case 49 -> 129;
            case 50 -> 240;
            case 51 -> 34;
            case 52 -> 39;
            case 53 -> 224;
            case 54 -> 2;
            case 55 -> 214;
            case 56 -> 156;
            case 57 -> 94;
            case 58 -> 36;
            case 59 -> 254;
            case 60 -> 157;
            case 61 -> 112;
            case 62 -> 192;
            case 63 -> 161;
            case 64 -> 19;
            case 65 -> 218;
            case 66 -> 74;
            case 67 -> 4;
            case 68 -> 183;
            case 69 -> 64;
            case 70 -> 81;
            case 71 -> 50;
            case 72 -> 125;
            case 73 -> 56;
            case 74 -> 205;
            case 75 -> 184;
            case 76 -> 126;
            case 77 -> 121;
            case 78 -> 226;
            case 79 -> 227;
            case 80 -> 86;
            case 81 -> 213;
            case 82 -> 190;
            case 83 -> 188;
            case 84 -> 186;
            case 85 -> 250;
            case 86 -> 122;
            case 87 -> 198;
            case 88 -> 87;
            case 89 -> 60;
            case 90 -> 196;
            case 91 -> 52;
            case 92 -> 215;
            case 93 -> 12;
            case 94 -> 78;
            case 95 -> 75;
            case 96 -> 20;
            case 97 -> 41;
            case 98 -> 93;
            case 99 -> 146;
            case 100 -> 17;
            case 101 -> 176;
            case 102 -> 66;
            case 103 -> 79;
            case 104 -> 189;
            case 105 -> 46;
            case 106 -> 204;
            case 107 -> 47;
            case 108 -> 84;
            case 109 -> 89;
            case 110 -> 238;
            case 111 -> 92;
            case 112 -> 132;
            case 113 -> 173;
            case 114 -> 13;
            case 115 -> 5;
            case 116 -> 231;
            case 117 -> 3;
            case 118 -> 30;
            case 119 -> 222;
            case 120 -> 249;
            case 121 -> 158;
            case 122 -> 72;
            case 123 -> 191;
            case 124 -> 73;
            case 125 -> 130;
            case 126 -> 100;
            case 127 -> 71;
            case 128 -> 179;
            case 129 -> 148;
            case 130 -> 11;
            case 131 -> 143;
            case 132 -> 99;
            case 133 -> 0;
            case 134 -> 134;
            case 135 -> 232;
            case 136 -> 61;
            case 137 -> 128;
            case 138 -> 115;
            case 139 -> 193;
            case 140 -> 83;
            case 141 -> 217;
            case 142 -> 114;
            case 143 -> 237;
            case 144 -> 120;
            case 145 -> 153;
            case 146 -> 6;
            case 147 -> 246;
            case 148 -> 234;
            case 149 -> 59;
            case 150 -> 68;
            case 151 -> 147;
            case 152 -> 18;
            case 153 -> 182;
            case 154 -> 90;
            case 155 -> 208;
            case 156 -> 35;
            case 157 -> 168;
            case 158 -> 194;
            case 159 -> 49;
            case 160 -> 113;
            case 161 -> 201;
            case 162 -> 202;
            case 163 -> 43;
            case 164 -> 136;
            case 165 -> 212;
            case 166 -> 106;
            case 167 -> 141;
            case 168 -> 29;
            case 169 -> 247;
            case 170 -> 165;
            case 171 -> 7;
            case 172 -> 101;
            case 173 -> 155;
            case 174 -> 242;
            case 175 -> 95;
            case 176 -> 45;
            case 177 -> 235;
            case 178 -> 70;
            case 179 -> 139;
            case 180 -> 206;
            case 181 -> 31;
            case 182 -> 26;
            case 183 -> 236;
            case 184 -> 151;
            case 185 -> 220;
            case 186 -> 241;
            case 187 -> 28;
            case 188 -> 207;
            case 189 -> 135;
            case 190 -> 104;
            case 191 -> 119;
            case 192 -> 170;
            case 193 -> 25;
            case 194 -> 27;
            case 195 -> 203;
            case 196 -> 164;
            case 197 -> 163;
            case 198 -> 24;
            case 199 -> 48;
            case 200 -> 145;
            case 201 -> 111;
            case 202 -> 219;
            case 203 -> 51;
            case 204 -> 223;
            case 205 -> 91;
            case 206 -> 9;
            case 207 -> 172;
            case 208 -> 69;
            case 209 -> 88;
            case 210 -> 252;
            case 211 -> 253;
            case 212 -> 103;
            case 213 -> 229;
            case 214 -> 124;
            case 215 -> 21;
            case 216 -> 67;
            case 217 -> 160;
            case 218 -> 44;
            case 219 -> 255;
            case 220 -> 210;
            case 221 -> 152;
            case 222 -> 239;
            case 223 -> 37;
            case 224 -> 82;
            case 225 -> 77;
            case 226 -> 42;
            case 227 -> 171;
            case 228 -> 105;
            case 229 -> 76;
            case 230 -> 211;
            case 231 -> 230;
            case 232 -> 167;
            case 233 -> 142;
            case 234 -> 32;
            case 235 -> 225;
            case 236 -> 16;
            case 237 -> 133;
            case 238 -> 127;
            case 239 -> 248;
            case 240 -> 117;
            case 241 -> 140;
            case 242 -> 169;
            case 243 -> 22;
            case 244 -> 154;
            case 245 -> 181;
            case 246 -> 180;
            case 247 -> 107;
            case 248 -> 177;
            case 249 -> 187;
            case 250 -> 1;
            case 251 -> 40;
            case 252 -> 58;
            case 253 -> 144;
            case 254 -> 221;
            default -> 200;
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
}
