package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII {
   public static int var12 = 0; // PX-FIX (retyped int) missing field v2
   
   @NotNull
   public static llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   private llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII() {
   }

   @NotNull
   public final List<IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII> a() {
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      long var2 = System.currentTimeMillis();
      String var1 = var10000;
      long var4 = var2 - lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var1 != null) {
         if (var4 <= 3000L) {
            if (var1 == null) {
               return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (!IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.isEmpty()) {
               return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }

         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.e();
         var4 = var2;
      }

      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var4;
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final List<Float> a(int var1) {
      Collection var15 = null; // PX-FIX
      Iterable var3 = this.a();
      boolean var4 = false;
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      var3 = CollectionsKt.take(
         CollectionsKt.sortedWith(
            var3,
            new llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll()
         ),
         var1
      );
      var4 = false;
      String var2 = var10000;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var15 = var6;
            IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var10 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var9;
            if (var2 == null) {
               break;
            }

            boolean var11 = false;
            var6.add(var10.a());
            if (var2 != null) {
               continue;
            }
         }

         var15 = var6;
         break;
      }

      return (List<Float>)var15;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @NotNull
   public final Pair<Float, Float> a(float var1) { boolean var12 = false; // PX-FIX hoist
        
      float var31 = 0; // PX-FIX
      Object var30 = null; // PX-FIX
      float var29 = 0; // PX-FIX
      int var28 = 0; // PX-FIX
      String var2;
      Object var26;
      label145: {
         var26 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
         Iterable var5 = this.a();
         var2 = (String)var26;
         boolean var6 = false;
         Iterator var7 = var5.iterator();
         var26 = var7;
         if (var2 != null) {
            if (!var7.hasNext()) {
               var26 = null;
               break label145;
            }

            var26 = var7.next();
         }

         Object var8 = var26;
         var26 = var7;
         if (var2 != null) {
            if (!var7.hasNext()) {
               var26 = var8;
               break label145;
            }

            var26 = var8;
         }

         IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var9 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var26;
         boolean var10 = false;
         float var11 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var9.a() - var1);
          var12 = false;
         float var18 = var11 * var11;

         label130:
         while (true) {
            Object var20 = var7.next();
            IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var21 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var20;
            var12 = false;
            float var13 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var21.a() - var1);
            boolean var14 = false;
            var11 = var13 * var13;
            if (Float.compare(var18, var11) > 0) {
               var8 = var20;
               var18 = var11;
            }

            while (!var7.hasNext()) {
               if (var2 != null) {
                  var26 = var8;
                  break label130;
               }

               var18 = var11;
            }
         }
      }

      var26 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var26;
      if ((IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var26 == null) {
         return new Pair(-30.0F, 30.0F);
      } else {
         IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var3;
         double var4;
         int var15;
         label147: {
            int var16;
            label148: {
               var3 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var26;
               var4 = var3.d();
               var15 = var3.b();
               var16 = var3.c();
               var28 = var16;
               byte var10001 = 3;
               if (var2 != null) {
                  if (var16 >= 3) {
                     var29 = -25.0F;
                     break label147;
                  }

                  var28 =((Integer)( var15));
                  if (var2 == null) {
                     break label148;
                  }

                  var10001 = 2;
               }

               if (var28 <= var10001) {
                  var29 = -15.0F;
                  break label147;
               }

               double var33;
               var28 = (var33 = var4 - 7.0) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
            }

            label104:
            if (var2 != null) {
               if (var28 >= 0) {
                  var28 =((Integer)( var15));
                  if (var2 == null) {
                     break label104;
                  }

                  if ((((var15 != 0) ? 1 : 0)) >= 6) {
                     var29 = 5.0F;
                     break label147;
                  }
               }

               double var34;
               var28 = (var34 = var4 - 5.0) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
            }

            label150: {
               byte var32;
               label151: {
                  if (var2 != null) {
                     if (var28 >= 0) {
                        var28 =((Integer)( var15));
                        var32 = 4;
                        if (var2 == null) {
                           break label151;
                        }

                        if ((((var15 != 0) ? 1 : 0)) >= 4) {
                           var29 = 0.0F;
                           break label147;
                        }
                     }

                     var28 =((Integer)( var15));
                  }

                  if (var2 == null) {
                     break label150;
                  }

                  var32 = 8;
               }

               if (var28 >= var32) {
                  var29 = 10.0F;
                  break label147;
               }

               var28 = var16;
            }

            var29 = var28 == 0 ? 5.0F : -5.0F;
         }

         float var17;
         label152: {
            var17 =((Float)( var29));
            double var35;
            var30 = (var35 = var4 - 7.0) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
            label78:
            if (var2 != null) {
               if (((Boolean)var30)) {
                  var30 = var15;
                  if (var2 == null) {
                     break label78;
                  }

                  if ((((var15 != 0) ? 1 : 0)) >= 6) {
                     var31 = 35.0F;
                     break label152;
                  }
               }

               double var36;
               var30 = (var36 = var4 - 5.0) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
            }

            if (var2 != null) {
               if (((Boolean)var30)) {
                  var31 = 25.0F;
                  break label152;
               }

               var30 = var3.e();
            }

            var31 = (Boolean)var30 ? 12.0F : 20.0F;
         }

         float var19 = var31;
         return new Pair(RangesKt.coerceIn(var17 - var19, -90.0F, 90.0F), RangesKt.coerceIn(var17 + var19, -90.0F, 90.0F));
      }
   }

   public final double b() {
       double var12 = 0.0; // PX-FIX decl var12
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      Iterable var2 = this.a();
      boolean var3 = false;
      var var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      boolean var6 = false;
      Iterator var7 = var2.iterator();
      String var1 = var10000;

      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var9 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var8;
            boolean var10 = false;
            var12 = var9.d();
            if (var1 == null) {
               break;
            }

            var5.add(var12);
            if (var1 != null) {
               continue;
            }
         }

         var12 = CollectionsKt.averageOfDouble(var5);
         break;
      }

      return var12;
   }

   public final double c() {
      double var12 = 0.0; // PX-FIX decl var12
      Iterable var2 = this.a();
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      boolean var3 = false;
      var var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10));
      String var1 = var10000;
      boolean var6 = false;
      Iterator var7 = var2.iterator();

      while (true) {
         if (var7.hasNext()) {
            Object var8 = var7.next();
            IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var9 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var8;
            boolean var10 = false;
            var12 = var9.b();
            if (var1 == null) {
               break;
            }

            var5.add(var12);
            if (var1 != null) {
               continue;
            }
         }

         var12 = CollectionsKt.averageOfDouble(var5);
         break;
      }

      return var12;
   }

   public final boolean d() { boolean var12 = false; // PX-FIX hoist
        
      Object var22 = null; // PX-FIX
      Iterable var4 = this.a();
      boolean var5 = false;
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      var var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
      boolean var8 = false;
      Iterator var9 = var4.iterator();

      double var10000;
      while (true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var11 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var10;
             var12 = false;
            var10000 = var11.d();
            if (var1 == null) {
               break;
            }

            var7.add(var10000);
            if (var1 != null) {
               continue;
            }

            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
            );
         }

         var10000 = CollectionsKt.averageOfDouble(var7);
         break;
      }

      double var2 = var10000;
      Iterable var6 = this.a();
      boolean var17 = false;
      var var18 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var6, 10));
      boolean var19 = false;
      Iterator var20 = var6.iterator();

      while (true) {
         if (var20.hasNext()) {
            Object var21 = var20.next();
            var22 = var18;
            IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII var13 = (IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII)var21;
            if (var1 == null) {
               break;
            }

            boolean var14 = false;
            var18.add(var13.b());
            if (var1 != null) {
               continue;
            }
         }

         var22 = var18;
         break;
      }

      double var16 = CollectionsKt.averageOfInt((Iterable)var22);
      double var24;
      int var23 = (var24 = var2 - 4.0) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
      if (var1 != null) {
         if (var23 >= 0) {
            double var25;
            int var26 = (var25 = var16 - 3.0) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
            if (var1 == null) {
               return (var26 != 0);
            }

            if (var26 >= 0) {
               return (0 != 0);
            }
         }

         var23 = 1;
      }

      return (var23 != 0);
   }

   private final List<IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII> e() {
      Object var37 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      if (var1 != null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         if (var1 != null
            && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .level
               != null) {
            ClientLevel var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .level;
            Vec3 var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var2);
            List var5 = new ArrayList();
            float var6 = 22.5F;
            int var7 = 0;

            while (var7 < 16) {
               float var8 = var7 * var6;
               double var9 = Math.toRadians(var8);
               double var11 = -Math.sin(var9);
               double var13 = Math.cos(var9);
               int var15 = 10;
               int var16 = 1;

               byte var29;
               while (true) {
                  label145:
                  if (var16 < 11) {
                     BlockPos var10000 = BlockPos.containing(var4.x + var11 * 2, var4.y + var16, var4.z + var13 * 2);
                     short var10002 = -24096;
                     short var10003 = -28138;
                     Intrinsics.checkNotNullExpressionValue(var10000, "containing(...)");
                     BlockPos var17 = var10000;
                     if (var1 != null) {
                        var29 = ((byte)((var3.getBlockState(var17).isAir()) ? 1 : 0));
                        if (var1 == null) {
                           break;
                        }

                        if (var29 == 0) {
                           var15 = var16 - 1;
                           if (var1 != null) {
                              break label145;
                           }
                        }

                        var16++;
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  var16 = 0;
                  var29 = 1;
                  break;
               }

               int var26 = var29;

               while (true) {
                  label130:
                  if (var26 < 6) {
                     BlockPos var30 = BlockPos.containing(var4.x + var11 * 2, var4.y - var26, var4.z + var13 * 2);
                     short var40 = -24092;
                     short var46 = -20717;
                     Intrinsics.checkNotNullExpressionValue(var30, "containing(...)");
                     BlockPos var18 = var30;
                     if (var1 != null) {
                        var29 = ((byte)((var3.getBlockState(var18).isAir()) ? 1 : 0));
                        if (var1 == null) {
                           break;
                        }

                        if (var29 == 0) {
                           var16 = var26 - 1;
                           if (var1 != null) {
                              break label130;
                           }
                        }

                        var26++;
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  var29 =(byte)( var16);
                  break;
               }

               label165: {
                  if (var1 != null) {
                     if (var29 != 0) {
                        break label165;
                     }

                     var29 = ((byte)((var3.getBlockState(BlockPos.containing(var4.x + var11 * 2, var4.y - 1, var4.z + var13 * 2)).isAir()) ? 1 : 0));
                  }

                  if (var1 != null) {
                     if (var29 == 0) {
                        break label165;
                     }

                     var29 = 5;
                  }

                  var16 = var29;
               }

               double var27 = 0.0;
               boolean var19 = false;
               boolean var20 = false;
               boolean var21 = false;
               int var22 = 1;

               while (true) {
                  label104:
                  if (var22 < 11) {
                     BlockPos var32 = BlockPos.containing(var4.x + var11 * var22, var4.y, var4.z + var13 * var22);
                     short var41 = -24092;
                     short var47 = -20717;
                     Intrinsics.checkNotNullExpressionValue(var32, "containing(...)");
                     BlockPos var23 = var32;
                     BlockState var33 = var3.getBlockState(var23);
                     var41 = -24089;
                     var47 = -15665;
                     Intrinsics.checkNotNullExpressionValue(var33, "getBlockState(...)");
                     BlockState var24 = var33;
                     if (var1 != null) {
                        var34 = var24.isAir();
                        if (var1 == null) {
                           break;
                        }

                        if (!((Boolean)var34)) {
                           label97: {
                              Block var25;
                              label96: {
                                 var19 = true;
                                 var27 = var22 - 1.0;
                                 Block var35 = var24.getBlock();
                                 var41 = -24090;
                                 var47 = -19137;
                                 Intrinsics.checkNotNullExpressionValue(var35, "getBlock(...)");
                                 var25 = var35;
                                 var36 = Intrinsics.areEqual(var25, Blocks.PRISMARINE);
                                 label95:
                                 if (var1 != null) {
                                    if (!((Boolean)var36)) {
                                       var36 = Intrinsics.areEqual(var25, Blocks.PRISMARINE_BRICKS);
                                       if (var1 == null) {
                                          break label95;
                                       }

                                       if (!((Boolean)var36)) {
                                          var37 = Intrinsics.areEqual(var25, Blocks.DARK_PRISMARINE);
                                          if (var1 == null) {
                                             break label97;
                                          }

                                          if (!((Boolean)var37)) {
                                             break label96;
                                          }
                                       }
                                    }

                                    var36 = true;
                                 }

                                 var20 =((Boolean)( var36));
                              }

                              String var38 = var25.toString();
                              var41 = -24091;
                              var47 = -15192;
                              Intrinsics.checkNotNullExpressionValue(var38, "toString(...)");
                              CharSequence var39 = var38;
                              short var10001 = -24095;
                              var41 = 32365;
                              var37 = StringsKt.contains(var39, "wool", true);
                           }

                           label82: {
                              if (var1 != null) {
                                 if (!((Boolean)var37)) {
                                    break label82;
                                 }

                                 var37 = true;
                              }

                              var21 =((Boolean)( var37));
                           }

                           if (var1 != null) {
                              break label104;
                           }
                        }

                        var22++;
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  var34 = var19;
                  break;
               }

               if (!((Boolean)var34)) {
                  var27 = 10.0;
               }

               double var28 = this.a(var15, var16, var27, var19, var20, var21);
               var5.add(
                  new IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII(
                     var8, var15, var16, var27, var19, var20, var21, var28
                  )
               );
               var7++;
               if (var1 == null) {
                  break;
               }
            }

            return var5;
         } else {
            return CollectionsKt.emptyList();
         }
      } else {
         return CollectionsKt.emptyList();
      }
   }

   private final double a(int var1, int var2, double var3, boolean var5, boolean var6, boolean var7) {
      String var8;
      double var11;
      double var15;
      label72: {
         var11 = 0.0;
         String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
         var11 += var3 * 10.0;
         var8 = var10000;
         int var10001 = var1;
         byte var10002 = 6;
         if (var8 != null) {
            if (var1 >= 6) {
               var15 = 20.0;
               break label72;
            }

            var10001 = var1;
            var10002 = 4;
         }

         if (var8 != null) {
            if (var10001 >= var10002) {
               var15 = 10.0;
               break label72;
            }

            var10001 = var1;
            var10002 = 2;
         }

         var15 = var10001 <= var10002 ? -15.0 : 0.0;
      }

      label73: {
         var11 += var15;
         int var16 = var2;
         if (var8 != null) {
            if (var2 == 0) {
               var15 = 15.0;
               break label73;
            }

            var16 = var2;
         }

         byte var18 = 1;
         if (var8 != null) {
            if (var16 == 1) {
               var15 = 5.0;
               break label73;
            }

            var16 = var2;
            var18 = 3;
         }

         var15 = var16 >= var18 ? -20.0 : 0.0;
      }

      var11 += var15;
      boolean var14 = var5;
      if (var8 != null) {
         if (!var5) {
            var11 += 25.0;
         }

         var14 = var6;
      }

      if (var8 != null) {
         if (var14) {
            var11 -= 10.0;
         }

         var14 = var7;
      }

      if (var14) {
         var11 -= 5.0;
      }

      return var11;
   }

   private final float b(float var1) {
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      float var3 = var1 % 360.0F;
      String var2 = var10000;
      float var6;
      int var4 = (var6 = var3 - 180.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var2 != null) {
         if (var4 > 0) {
            var3 -= 360.0F;
         }

         if (var2 == null) {
            return var3;
         }

         float var7;
         var4 = (var7 = var3 - -180.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      if (var4 < 0) {
         var3 += 360.0F;
      }

      return var3;
   }

   public final void f() {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 0L;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u0096\u0087p±vµN\u008cÙ?\u008f\u0011#\u000fg©\u0086t!\rÕ\u0095ì\u009a¡Å'¯?\u0012\u007fn\u001bñÆK\u0088\u0099ÖJ5ô\u009e\u009e-Kk\u001c\r`\u008aømºØ\u0007ë\\^?=5";
      int var4 = "\u0096\u0087p±vµN\u008cÙ?\u008f\u0011#\u000fg©\u0086t!\rÕ\u0095ì\u009a¡Å'¯?\u0012\u007fn\u001bñÆK\u0088\u0099ÖJ5ô\u009e\u009e-Kk\u001c\r`\u008aømºØ\u0007ë\\^?=5"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 28;
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
                     case 0 -> 71;
                     case 1 -> 33;
                     case 2 -> 124;
                     case 3 -> 12;
                     case 4 -> 35;
                     case 5 -> 14;
                     default -> 41;
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
                     b = new String[6];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.emptyList();
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

                  var2 = "N\u001fôz\u000f?ÙMº\u0098\u0014\"vÒ&¦\u0092\u0007\u0085û";
                  var4 = "N\u001fôz\u000f?ÙMº\u0098\u0014\"vÒ&¦\u0092\u0007\u0085û".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 113;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -24091) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 100;
            case 1 -> 61;
            case 2 -> 38;
            case 3 -> 222;
            case 4 -> 78;
            case 5 -> 145;
            case 6 -> 104;
            case 7 -> 202;
            case 8 -> 214;
            case 9 -> 172;
            case 10 -> 2;
            case 11 -> 174;
            case 12 -> 63;
            case 13 -> 109;
            case 14 -> 188;
            case 15 -> 30;
            case 16 -> 3;
            case 17 -> 245;
            case 18 -> 231;
            case 19 -> 207;
            case 20 -> 162;
            case 21 -> 5;
            case 22 -> 226;
            case 23 -> 54;
            case 24 -> 56;
            case 25 -> 221;
            case 26 -> 111;
            case 27 -> 220;
            case 28 -> 120;
            case 29 -> 163;
            case 30 -> 184;
            case 31 -> 241;
            case 32 -> 198;
            case 33 -> 154;
            case 34 -> 243;
            case 35 -> 125;
            case 36 -> 140;
            case 37 -> 51;
            case 38 -> 253;
            case 39 -> 66;
            case 40 -> 13;
            case 41 -> 185;
            case 42 -> 93;
            case 43 -> 52;
            case 44 -> 181;
            case 45 -> 225;
            case 46 -> 24;
            case 47 -> 135;
            case 48 -> 83;
            case 49 -> 160;
            case 50 -> 129;
            case 51 -> 189;
            case 52 -> 33;
            case 53 -> 86;
            case 54 -> 144;
            case 55 -> 254;
            case 56 -> 4;
            case 57 -> 223;
            case 58 -> 60;
            case 59 -> 227;
            case 60 -> 180;
            case 61 -> 177;
            case 62 -> 112;
            case 63 -> 164;
            case 64 -> 149;
            case 65 -> 242;
            case 66 -> 23;
            case 67 -> 89;
            case 68 -> 81;
            case 69 -> 96;
            case 70 -> 1;
            case 71 -> 127;
            case 72 -> 101;
            case 73 -> 80;
            case 74 -> 62;
            case 75 -> 200;
            case 76 -> 75;
            case 77 -> 203;
            case 78 -> 14;
            case 79 -> 48;
            case 80 -> 39;
            case 81 -> 0;
            case 82 -> 234;
            case 83 -> 233;
            case 84 -> 16;
            case 85 -> 165;
            case 86 -> 95;
            case 87 -> 137;
            case 88 -> 139;
            case 89 -> 224;
            case 90 -> 130;
            case 91 -> 182;
            case 92 -> 201;
            case 93 -> 99;
            case 94 -> 40;
            case 95 -> 235;
            case 96 -> 79;
            case 97 -> 114;
            case 98 -> 211;
            case 99 -> 27;
            case 100 -> 215;
            case 101 -> 90;
            case 102 -> 217;
            case 103 -> 190;
            case 104 -> 18;
            case 105 -> 141;
            case 106 -> 159;
            case 107 -> 244;
            case 108 -> 20;
            case 109 -> 47;
            case 110 -> 41;
            case 111 -> 26;
            case 112 -> 67;
            case 113 -> 31;
            case 114 -> 22;
            case 115 -> 15;
            case 116 -> 183;
            case 117 -> 87;
            case 118 -> 216;
            case 119 -> 134;
            case 120 -> 94;
            case 121 -> 204;
            case 122 -> 19;
            case 123 -> 232;
            case 124 -> 197;
            case 125 -> 178;
            case 126 -> 128;
            case 127 -> 9;
            case 128 -> 238;
            case 129 -> 8;
            case 130 -> 192;
            case 131 -> 71;
            case 132 -> 46;
            case 133 -> 77;
            case 134 -> 37;
            case 135 -> 7;
            case 136 -> 88;
            case 137 -> 228;
            case 138 -> 210;
            case 139 -> 12;
            case 140 -> 157;
            case 141 -> 64;
            case 142 -> 116;
            case 143 -> 121;
            case 144 -> 36;
            case 145 -> 250;
            case 146 -> 179;
            case 147 -> 6;
            case 148 -> 124;
            case 149 -> 113;
            case 150 -> 85;
            case 151 -> 251;
            case 152 -> 187;
            case 153 -> 171;
            case 154 -> 10;
            case 155 -> 43;
            case 156 -> 72;
            case 157 -> 147;
            case 158 -> 110;
            case 159 -> 246;
            case 160 -> 68;
            case 161 -> 136;
            case 162 -> 44;
            case 163 -> 17;
            case 164 -> 69;
            case 165 -> 73;
            case 166 -> 28;
            case 167 -> 236;
            case 168 -> 106;
            case 169 -> 150;
            case 170 -> 153;
            case 171 -> 55;
            case 172 -> 108;
            case 173 -> 58;
            case 174 -> 156;
            case 175 -> 50;
            case 176 -> 97;
            case 177 -> 142;
            case 178 -> 146;
            case 179 -> 84;
            case 180 -> 247;
            case 181 -> 138;
            case 182 -> 170;
            case 183 -> 240;
            case 184 -> 148;
            case 185 -> 70;
            case 186 -> 107;
            case 187 -> 59;
            case 188 -> 25;
            case 189 -> 166;
            case 190 -> 196;
            case 191 -> 117;
            case 192 -> 173;
            case 193 -> 49;
            case 194 -> 155;
            case 195 -> 105;
            case 196 -> 103;
            case 197 -> 229;
            case 198 -> 102;
            case 199 -> 167;
            case 200 -> 29;
            case 201 -> 252;
            case 202 -> 74;
            case 203 -> 195;
            case 204 -> 32;
            case 205 -> 239;
            case 206 -> 65;
            case 207 -> 193;
            case 208 -> 249;
            case 209 -> 186;
            case 210 -> 122;
            case 211 -> 131;
            case 212 -> 82;
            case 213 -> 123;
            case 214 -> 209;
            case 215 -> 219;
            case 216 -> 169;
            case 217 -> 42;
            case 218 -> 132;
            case 219 -> 118;
            case 220 -> 213;
            case 221 -> 175;
            case 222 -> 168;
            case 223 -> 11;
            case 224 -> 248;
            case 225 -> 119;
            case 226 -> 92;
            case 227 -> 126;
            case 228 -> 45;
            case 229 -> 115;
            case 230 -> 194;
            case 231 -> 208;
            case 232 -> 218;
            case 233 -> 176;
            case 234 -> 76;
            case 235 -> 21;
            case 236 -> 152;
            case 237 -> 34;
            case 238 -> 53;
            case 239 -> 91;
            case 240 -> 57;
            case 241 -> 255;
            case 242 -> 151;
            case 243 -> 161;
            case 244 -> 212;
            case 245 -> 191;
            case 246 -> 206;
            case 247 -> 98;
            case 248 -> 35;
            case 249 -> 158;
            case 250 -> 205;
            case 251 -> 230;
            case 252 -> 237;
            case 253 -> 199;
            case 254 -> 133;
            default -> 143;
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
