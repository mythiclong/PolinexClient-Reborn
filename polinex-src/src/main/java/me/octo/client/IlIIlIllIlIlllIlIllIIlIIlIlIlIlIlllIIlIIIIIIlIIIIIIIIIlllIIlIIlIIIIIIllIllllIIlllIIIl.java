package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl
   extends IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll {
   @NotNull
   public static IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   @NotNull
   private BlockPos lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   @NotNull
   private List<? extends BlockPos> lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   @NotNull
   private List<? extends BlockPos> lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   @Nullable
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   @Nullable
   private BlockPos lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   private boolean llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   @Nullable
   private BlockPos llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   @NotNull
   private final HashMap<BlockPos, Long> IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   private boolean IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   @NotNull
   private final List<Vec3> IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   private static double llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private static double IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private static double IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   private static double IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   @NotNull
   private static Set<Block> IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   private static String[] c;
   private static String[] d;

   public IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl() {
      super(false);
      BlockPos var10001 = BlockPos.ZERO;
      short var10003 = -1150;
      short var10004 = 1338;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = var10001;
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = CollectionsKt.emptyList();
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = CollectionsKt.emptyList();
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = new HashMap<>();
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3[] var1 = new Vec3[]{
         new Vec3(0.3, 0.0, 0.3),
         new Vec3(0.3, 0.0, -0.3),
         new Vec3(-0.3, 0.0, 0.3),
         new Vec3(-0.3, 0.0, -0.3),
         new Vec3(0.3, 0.0, 0.0),
         new Vec3(-0.3, 0.0, 0.0),
         new Vec3(0.0, 0.0, 0.3),
         new Vec3(0.0, 0.0, -0.3)
      };
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = CollectionsKt.listOf(var1);
   }

   @NotNull
   public final BlockPos V() {
      return this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   }

   public final void e(@NotNull BlockPos var1) {
      short var10001 = -1129;
      short var10002 = 620;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = var1;
   }

   @NotNull
   public final List<BlockPos> W() {
      return ((List<BlockPos>)(Object)(this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII));
   }

   public final void e(@NotNull List<? extends BlockPos> var1) {
      short var10001 = -1151;
      short var10002 = 25204;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = var1;
   }

   @NotNull
   @Override
   protected List<Vec3> v() { String var10000 = null; // PX-FIX hoist
        
      Collection var13 = null; // PX-FIX
       var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      List var2 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(0.5, 5.0);
      Iterable var3 = var2;
      boolean var4 = false;
      String var1 = var10000;
      Collection var6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var3, 10));
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            var13 = var6;
            BlockPos var10 = (BlockPos)var9;
            if (var1 == null) {
               break;
            }

            boolean var11 = false;
            var6.add(new Vec3(var10).add(0.5, 1.0, 0.5).add(this.g()));
            if (var1 != null) {
               continue;
            }
         }

         var13 = var6;
         break;
      }

      return (List<Vec3>)var13;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI g(
      @NotNull Vec3 var1
   ) { String var10000 = null; // PX-FIX hoist
        
      int var36 = 0; // PX-FIX
       var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = -1140;
      short var10003 = -25724;
      Intrinsics.checkNotNullParameter(var1, "destination");
      String var2 = var10000;
      if (var2 != null) {
         ClientLevel var32 = this.a().level;
         if (var32 != null) {
            Vec3 var4;
            ArrayList var7;
            label153: {
               ClientLevel var3 = var32;
               Vec3 var33 = var1.add(0.0, 0.3500000000000001, 0.0);
               var10002 = -1152;
               var10003 = -3761;
               Intrinsics.checkNotNullExpressionValue(var33, "add(...)");
               var4 = var33;
               byte var5 = 5;
               BlockPos var34 = BlockPos.containing(var1);
               var10002 = -1101;
               var10003 = 10222;
               Intrinsics.checkNotNullExpressionValue(var34, "containing(...)");
               BlockPos var6 = var34;
               var7 = new ArrayList();
               int var8 = -var5;
               int var35 = var8;
               if (var2 != null) {
                  if (var8 > var5) {
                     break label153;
                  }

                  var35 = -var5;
               }

               while (true) {
                  byte var10001;
                  label170: {
                     int var9 = var35;
                     if (var9 <= var5) {
                        do {
                           int var10 = -var5;
                           var36 = var10;
                           var10001 = var5;
                           if (var2 == null) {
                              break label170;
                           }

                           label171: {
                              if (var10 <= var5) {
                                 do {
                                    BlockPos var37 = var6.offset(var8, var9, var10);
                                    var10002 = -1146;
                                    var10003 = 23682;
                                    Intrinsics.checkNotNullExpressionValue(var37, "offset(...)");
                                    BlockPos var11 = var37;
                                    BlockState var38 = var3.getBlockState(var11);
                                    var10002 = -1139;
                                    var10003 = -19511;
                                    Intrinsics.checkNotNullExpressionValue(var38, "getBlockState(...)");
                                    BlockState var12 = var38;
                                    var36 = ((this.b(var12)) ? 1 : 0);
                                    if (var2 == null) {
                                       var10001 = var5;
                                       break label171;
                                    }

                                    label140: {
                                       label139:
                                       if ((var36 == 0)) {
                                          me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var39 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                          Vec3 var46 = var11.getCenter();
                                          var10003 = -1135;
                                          short var10004 = 5115;
                                          Intrinsics.checkNotNullExpressionValue(var46, "getCenter(...)");
                                          me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var14 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                                             var39, var46, 4.5, null, var4);
                                          if (var2 == null) {
                                             break;
                                          }

                                          me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var40 = var14;
                                          if (var2 != null) {
                                             if (var14.b()
                                                != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                                )
                                              {
                                                break label139;
                                             }

                                             var40 = var14;
                                          }

                                          var36 = ((Intrinsics.areEqual(var40.c(), var11)) ? 1 : 0);
                                          if (var2 == null) {
                                             break label140;
                                          }

                                          if ((var36 == 0)) {
                                             var7.add(
                                                new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                                                   var11, var12
                                                )
                                             );
                                          }
                                       }

                                       var36 = var10;
                                    }

                                    var10001 = var5;
                                    if (var2 == null) {
                                       break label171;
                                    }

                                    if (var36 ==( ((var5 == 0)) ? 1 : 0)) {
                                       break;
                                    }

                                    var10++;
                                 } while (var2 != null);
                              }

                              var36 = var9;
                              var10001 = var5;
                           }

                           if (var2 == null) {
                              break label170;
                           }

                           if (var36 == var10001) {
                              break;
                           }

                           var9++;
                        } while (var2 != null);
                     }

                     var36 = var8;
                     var10001 = var5;
                  }

                  if (var36 == var10001) {
                     break;
                  }

                  var8++;
                  if (var2 == null) {
                     break;
                  }

                  var35 = -var5;
               }
            }

            Iterable var19 = var7;
            boolean var20 = false;
            var var22 = new ArrayList();
            boolean var23 = false;
            Iterator var26 = var19.iterator();

            while (true) {
               if (var26.hasNext()) {
                  Object var15 = var26.next();
                  IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var17 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var15;
                  boolean var18 = false;
                  boolean var41 = this.c(var17.a(), var4);
                  if (var2 == null) {
                     break;
                  }

                  if (var2 != null) {
                     if (!var41) {
                        continue;
                     }

                     var22.add(var15);
                  }

                  if (var2 != null) {
                     continue;
                  }
               }

               var19 = (Iterable & List)var22;
               boolean var42 = false;
               break;
            }

            Iterator var21;
            Object var22x = null; // PX-FIX var-split (reuse)
            label167: {
               var21 = var19.iterator();
               boolean var43 = var21.hasNext();
               if (var2 != null) {
                  if (!var43) {
                     return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null;
                  }

                  var22x = var21.next();
                  var10000 = String.valueOf(var21);
                  if (var2 == null) {
                     break label167;
                  }

                  var43 = var21.hasNext();
               }

               if (!var43) {
                  return ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var22x));
               }

               var10000 = (String)(Object)var22x;
            }

            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
            boolean var27 = false;
            double var25 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var1, var24.c());

            while (true) {
               Object var28 = var21.next();
               IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var29 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var28;
               boolean var31 = false;
               double var30 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var1, var29.c());
               if (Double.compare(var25, var30) > 0) {
                  var22x = var28;
                  var25 = var30;
               }

               while (!var21.hasNext()) {
                  if (var2 != null) {
                     return ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var22x));
                  }

                  var25 = var30;
               }
            }
         }
      }

      return null;
   }

   @Override
   public int h(@NotNull Vec3 var1) { String var10000 = null; // PX-FIX hoist
        
       var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = -1132;
      short var10003 = 244;
      Intrinsics.checkNotNullParameter(var1, "eyePos");
      String var2 = var10000;
      if (var2 != null) {
         ClientLevel var12 = this.a().level;
         if (var12 != null) {
            ClientLevel var3 = var12;
            BlockPos var13 = BlockPos.containing(var1);
            var10002 = -1102;
            var10003 = -4345;
            Intrinsics.checkNotNullExpressionValue(var13, "containing(...)");
            BlockPos var4 = var13;
            int var5 = 0;
            int var6 = -5;

            label71:
            while (true) {
               int var14 = var6;

               label68:
               while (var14 < 6) {
                  if (var2 == null) {
                     return -5;
                  }

                  int var7 = -5;

                  label65:
                  while (true) {
                     int var16 = var7;

                     label63:
                     while (true) {
                        if (var16 >= 6) {
                           break label65;
                        }

                        var14 = -5;
                        if (var2 == null) {
                           continue label68;
                        }

                        int var8 = -5;

                        while (var8 < 6) {
                           BlockPos var17 = var4.offset(var6, var7, var8);
                           var10002 = -1146;
                           var10003 = 23682;
                           Intrinsics.checkNotNullExpressionValue(var17, "offset(...)");
                           BlockPos var9 = var17;
                           BlockState var18 = var3.getBlockState(var9);
                           var10002 = -1139;
                           var10003 = -19511;
                           Intrinsics.checkNotNullExpressionValue(var18, "getBlockState(...)");
                           BlockState var10 = var18;
                           label57:
                           if (var2 != null) {
                              var16 = ((this.b(var10)) ? 1 : 0);
                              if (var2 == null) {
                                 continue label63;
                              }

                              if (var16 != 0) {
                                 me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var19 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                 Vec3 var10001 = var9.getCenter();
                                 var10003 = -1133;
                                 short var10004 = 21436;
                                 Intrinsics.checkNotNullExpressionValue(var10001, "getCenter(...)");
                                 me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var11 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                                    var19, var10001, 4.5, null, var1);
                                 if (var2 == null) {
                                    break label57;
                                 }

                                 if (var11.b()
                                       == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                    && Intrinsics.areEqual(var11.c(), var9)) {
                                    var5++;
                                 }
                              }

                              var8++;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        var7++;
                        if (var2 == null) {
                           break label65;
                        }
                        break;
                     }
                  }

                  var6++;
                  if (var2 != null) {
                     continue label71;
                  }
                  break;
               }

               return var5;
            }
         }
      }

      return 0;
   }

   @Override
   public void A() {
       boolean var10000 = false; // PX-FIX decl var10000
      IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl var2;
      label40: {
         String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         var10000 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .al();
         label35:
         if (var1 != null) {
            if ((me.octo.client.PxTruth.truth(var10000))) {
               var10000 = this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
               if (var1 != null) {
                  if (this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll) {
                     return;
                  }

                  var10000 = ((java.util.function.Supplier<Boolean>)(() -> { this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.a(500); return false; })).get();
               }

               if (var1 == null) {
                  break label35;
               }

               if ((me.octo.client.PxTruth.truth(var10000))) {
                  return;
               }
            }

            var2 = this;
            if (var1 == null) {
               break label40;
            }

            super.A();
            var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
         }

         if (!(me.octo.client.PxTruth.truth(var10000))) {
            return;
         }

         var2 = this;
      }

      var2.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = true;
   }

   @Override
   public void u() { int var10000 = 0; // PX-FIX hoist
        
      Object var53 = null; // PX-FIX
      Object var51 = null; // PX-FIX
      Object var46 = null; // PX-FIX
      Object var43 = null; // PX-FIX
      Object var40 = null; // PX-FIX
      byte var38 = 0; // PX-FIX
      Object var37 = null; // PX-FIX
      Object var35 = null; // PX-FIX
      byte var33 = 0; // PX-FIX
      Object var32 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
       var10000 = ((me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j()) ? 1 : 0);
      if (var1 != null) {
         if (var10000 != 0) {
            this.i(false);
            this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
            return;
         }

         var10000 = ((lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
            .al()) ? 1 : 0);
      }

      byte var2;
      label538: {
         label542: {
            var2 = (byte)var10000;
            var10000 = var2;
            if (var1 != null) {
               if (var2 == 0) {
                  break label542;
               }

               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var26 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e();
               short var10001 = -1125;
               short var10002 = 22019;
               var10000 = ((var26.c("No Sneak")) ? 1 : 0);
            }

            if (var1 == null) {
               break label538;
            }

            if (var10000 != 0) {
               var10000 = (byte)1;
               break label538;
            }
         }

         var10000 = (byte)0;
      }

      byte var3;
      label527: {
         label543: {
            var3 =(byte)( var10000);
            var10000 = var2;
            if (var1 != null) {
               if (var2 == 0) {
                  break label543;
               }

               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var28 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e();
               short var56 = -1137;
               short var65 = -20234;
               var10000 = ((var28.c("Sneak Only")) ? 1 : 0);
            }

            if (var1 == null) {
               break label527;
            }

            if (var10000 != 0) {
               var10000 = (byte)1;
               break label527;
            }
         }

         var10000 = (byte)0;
      }

      byte var4 =(byte)( var10000);
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = this.k();
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var29 = var5;
      if (var1 != null) {
         if (var5 == null) {
            int var75;
            label544: {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               short var64 = -1121;
               short var74 = 1099;
               var75 = var3;
               if (var1 != null) {
                  if (var3 != 0) {
                     var75 = 0;
                     break label544;
                  }

                  var75 = var4;
               }

               if (var1 != null) {
                  if (var75 != 0) {
                     var75 = 1;
                     break label544;
                  }

                  var75 = ((java.util.function.Supplier<Integer>)(() -> { this.p().a(5000); return 0; })).get();
               }

               if (var1 != null) {
                  var75 = var75 == 0 ? 1 : 0;
               }
            }

            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", (var75 != 0));
            this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = null;
            this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = false;
            this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
            return;
         }

         var29 = var5;
      }

      Vec3 var6;
      Vec3 var7;
      label515: {
         label545: {
            var6 = var29.c();
            var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u();
            Vec3 var8 = var5.d();
            Vec3 var30 = var8;
            if (var1 != null) {
               if (var8 == null) {
                  break label545;
               }

               var30 = var7;
            }

            double var79;
            var10000 = (var79 = var30.distanceToSqr(var8) - 19.802500000000002) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
            if (var1 != null) {
               if (var10000 > 0) {
                  break label545;
               }

               var10000 = ((this.a(var7, var8, var5.a())) ? 1 : 0);
            }

            if (var1 == null) {
               break label515;
            }

            if (var10000 != 0) {
               var10000 = 1;
               break label515;
            }
         }

         var10000 = 0;
      }

      int var9 = var10000;
      if (var9 == 0) {
         var5.a(this.a(var7, var5));
      }

      Vec3 var57;
      label498: {
         var32 = this;
         if (var1 != null) {
            var57 = var5.d();
            if (var57 != null) {
               break label498;
            }
         }

         var57 = var6;
      }

      Vec3 var10;
      byte var11;
      byte var12;
      label492: {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(var32, var57, null);
         var10 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
         Vec3 var66 = var10.add(0.0, 1.27, 0.0);
         short var10004 = -1152;
         short var10005 = -3761;
         Intrinsics.checkNotNullExpressionValue(var66, "add(...)");
         var11 = ((byte)((this.a(var5, var66)) ? 1 : 0));
         var66 = var10.add(0.0, 1.62, 0.0);
         var10004 = -1152;
         var10005 = -3761;
         Intrinsics.checkNotNullExpressionValue(var66, "add(...)");
         var12 = ((byte)((this.a(var5, var66)) ? 1 : 0));
         var33 = var3;
         if (var1 != null) {
            if (var3 != 0) {
               var33 = var12;
               break label492;
            }

            var33 = var4;
         }

         label487:
         if (var1 != null) {
            label484:
            if (var33 == 0) {
               var33 = var2;
               if (var1 != null) {
                  if (var2 == 0) {
                     break label484;
                  }

                  var33 = var11;
               }

               if (var1 != null) {
                  if (var33 == 0) {
                     var33 = var12;
                     if (var1 == null) {
                        break label487;
                     }

                     if (var12 == 0) {
                        var33 = 0;
                        break label487;
                     }
                  }

                  var33 = 1;
               }
               break label487;
            }

            var33 = var11;
         }
      }

      byte var13;
      double var14;
      label469: {
         var13 = var33;
         var14 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var6, true);
         if (var1 != null) {
            BlockHitResult var34 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .I();
            if (var34 != null) {
               var35 = var34.getBlockPos();
               break label469;
            }
         }

         var35 = null;
      }

      label463: {
         label462: {
            label547: {
               BlockPos var16 =((BlockPos)( var35));
               ClientLevel var17 = this.a().level;
               BlockPos var36 = var16;
               if (var1 != null) {
                  if (var16 == null) {
                     break label547;
                  }

                  var36 = var16;
               }

               var37 = Intrinsics.areEqual(var36, var5.a());
               if (var1 == null) {
                  break label463;
               }

               if (!(me.octo.client.PxTruth.truth(var37))) {
                  break label462;
               }

               label455:
               if (var17 != null) {
                  BlockState var58 = var17.getBlockState(var16);
                  short var10003 = -1139;
                  short var77 = -19511;
                  Intrinsics.checkNotNullExpressionValue(var58, "getBlockState(...)");
                  var37 = this.a(var58);
                  if (var1 != null) {
                     if ((me.octo.client.PxTruth.truth(var37))) {
                        break label455;
                     }

                     var37 = var13;
                  }

                  if (var1 == null) {
                     break label463;
                  }

                  if (!(me.octo.client.PxTruth.truth(var37))) {
                     break label462;
                  }
               }
            }

            var37 = 0;
            break label463;
         }

         var37 = 1;
      }

      byte var18;
      label440: {
         label548: {
            var18 =((Byte)( var37));
            var38 = var2;
            if (var1 != null) {
               if (var2 != 0) {
                  break label548;
               }

               var38 = var18;
            }

            if (var1 != null) {
               if (var38 != 0) {
                  break label548;
               }

               var38 = var11;
            }

            if (var1 == null) {
               break label440;
            }

            if (var38 == 0) {
               var38 = 1;
               break label440;
            }
         }

         var38 = 0;
      }

      byte var19 = var38;
      int var39 = ((Intrinsics.areEqual(this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI, var5.a())) ? 1 : 0);
      if (var1 != null) {
         if (var39 == 0) {
            this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = var5.a();
            this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
         }

         var39 = var18;
      }

      label583: {
         label422: {
            label421: {
               label550: {
                  if (var1 != null) {
                     if (var39 != 0) {
                        this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
                        if (var1 != null) {
                           break label550;
                        }
                     }

                     var40 = this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
                     if (var1 == null) {
                        break label583;
                     }

                     var39 = ((java.util.function.Supplier<Integer>)(() -> { this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.a(800); return 0; })).get();
                  }

                  if (var39 != 0) {
                     break label421;
                  }

                  var39 = var2;
                  if (var1 == null) {
                     break label422;
                  }

                  if (var2 != 0) {
                     var39 = var13;
                     if (var1 == null) {
                        break label422;
                     }

                     if (var13 == 0) {
                        break label421;
                     }
                  }
               }

               var39 = var19;
               break label422;
            }

            this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.put(var5.a(), System.currentTimeMillis() + 250L);
            this.a((kotlin.jvm.functions.Function1)null);
            this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = null;
            this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = false;
            var40 = this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
            break label583;
         }

         if (var1 != null) {
            if (var39 != 0) {
               label394: {
                  short var59 = -1148;
                  short var68 = 27212;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sneak", true);
                  this.p().f();
                  if (var1 != null) {
                     LocalPlayer var42 = this.a().player;
                     if (var42 != null) {
                        var43 = var42.isCrouching();
                        if (var1 != null) {
                           ;
                        }
                        break label394;
                     }
                  }

                  var43 = false;
               }

               if ((me.octo.client.PxTruth.truth(var43))) {
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var6,
                     false);
                  if (var1 != null) {
                     return;
                  }
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               if (var1 != null) {
                  return;
               }
            }

            var39 = var3;
         }

         if (var1 != null) {
            if (var39 != 0) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               short var60 = -1148;
               short var69 = 27212;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sneak", false);
               if (var1 != null) {
                  return;
               }
            }

            var39 = var4;
         }

         label375: {
            label374: {
               label554: {
                  if (var1 != null) {
                     if (var39 != 0) {
                        break label554;
                     }

                     var39 = var2;
                  }

                  if (var1 == null) {
                     break label375;
                  }

                  if (var39 != 0) {
                     break label374;
                  }
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               short var61 = -1148;
               short var70 = 27212;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sneak", true);
               if (var1 != null) {
                  return;
               }
            }

            var39 = ((Intrinsics.areEqual(this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII, var5.a())) ? 1 : 0);
         }

         if (var1 != null) {
            if (var39 == 0) {
               this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = var5.a();
               this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = false;
            }

            var39 = var11;
         }

         label359: {
            if (var1 != null) {
               if (var39 != 0) {
                  break label359;
               }

               var39 = var12;
            }

            if (var39 != 0) {
               this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = true;
            }
         }

         Vec3 var44 = var5.d();
         if (var44 == null) {
            var44 = var6;
         }

         label352: {
            label555: {
               Vec3 var20 = var44;
               var39 = ((lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d()
                  .al()) ? 1 : 0);
               if (var1 != null) {
                  if (var39 == 0) {
                     break label555;
                  }

                  var39 = var12;
               }

               if (var1 != null) {
                  if (var39 == 0) {
                     break label555;
                  }

                  double var80;
                  var39 = (var80 = var14 - 4.0) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
               }

               if (var1 != null) {
                  if (var39 <= 0) {
                     break label555;
                  }

                  var46 = var10.add(0.0, 1.62, 0.0);
                  if (var1 == null) {
                     break label352;
                  }

                  double var81;
                  var39 = (var81 = (Double)((me.octo.client.PXDyn)var46).distanceToSqr(var20) - var10.add(0.0, 1.27, 0.0).distanceToSqr(var20)) == 0.0 ? 0 : (var81 < 0.0 ? -1 : 1);
               }

               if (var39 < 0) {
                  this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = true;
               }
            }

            var46 = new Vec3(Math.floor(var10.x) + 0.5, var10.y, Math.floor(var10.z) + 0.5);
         }

         Vec3 var21;
         var21 =((Vec3)( var46));
         var39 = ((lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
            .al()) ? 1 : 0);
         label331:
         if (var1 != null) {
            if (var39 == 0) {
               double var82;
               var39 = (
                        var82 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c(var10, var21)
                           - 0.2
                     )
                     == 0.0
                  ? 0
                  : (var82 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  break label331;
               }

               if (var39 >= 0) {
                  var39 = 0;
                  break label331;
               }
            }

            var39 = 1;
         }

         label323: {
            label558: {
               int var22 = var39;
               IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl var48 = this;
               if (var1 != null) {
                  label309:
                  if (this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl) {
                     var39 = var12;
                     if (var1 != null) {
                        if (var12 == 0) {
                           break label309;
                        }

                        var39 = var22;
                     }

                     if (var39 == 0) {
                        label314: {
                           short var62 = -1148;
                           short var71 = 27212;
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("sneak", true);
                           if (var1 != null) {
                              LocalPlayer var50 = this.a().player;
                              if (var50 != null) {
                                 var51 = var50.isCrouching();
                                 if (var1 != null) {
                                    ;
                                 }
                                 break label314;
                              }
                           }

                           var51 = false;
                        }

                        if ((me.octo.client.PxTruth.truth(var51))) {
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                              var10,
                              var21,
                              false,
                              0.0);
                           if (var1 != null) {
                              return;
                           }
                        }

                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .p();
                        if (var1 != null) {
                           return;
                        }
                     }
                  }

                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .p();
                  if (var1 == null) {
                     break label558;
                  }

                  var48 = this;
               }

               LocalPlayer var52 = var48.a().player;
               if (var52 != null) {
                  var53 = var52.getDeltaMovement();
                  break label323;
               }
            }

            var53 = null;
         }

         label292: {
            label291: {
               label561: {
                  Vec3 var23 =((Vec3)( var53));
                  Vec3 var54 = var23;
                  if (var1 != null) {
                     if (var23 == null) {
                        break label561;
                     }

                     var54 = var23;
                  }

                  double var83;
                  var39 = (var83 = var54.x * var23.x + var23.z * var23.z - 1.0E-4) == 0.0 ? 0 : (var83 < 0.0 ? -1 : 1);
                  if (var1 == null) {
                     break label292;
                  }

                  if (var39 < 0) {
                     break label291;
                  }
               }

               this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.f();
            }

            var39 = ((this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl) ? 1 : 0);
         }

         label279: {
            label562: {
               if (var1 != null) {
                  if (var39 == 0) {
                     break label562;
                  }

                  var39 = var12;
               }

               if (var1 != null) {
                  if (var39 == 0) {
                     break label562;
                  }

                  var39 = ((java.util.function.Supplier<Integer>)(() -> { this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.a(50); return 0; })).get();
               }

               if (var1 == null) {
                  break label279;
               }

               if (var39 != 0) {
                  var39 = 1;
                  break label279;
               }
            }

            var39 = 0;
         }

         int var24 = var39;
         short var63 = -1148;
         int var72 = 27212;
         var72 = var24;
         if (var1 != null) {
            var72 = var24 == 0 ? 1 : 0;
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("sneak", (var72 != 0));
         return;
      }

      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
   }

   private final boolean a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      Vec3 var2
   ) { Object var10000 = null; // PX-FIX hoist
        
      int var40 = 0; // PX-FIX
      Object var39 = null; // PX-FIX
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 != null) {
          var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var4 = (ClientLevel)var10000;
            double var5 = var1.a().getX();
            double var7 = var1.a().getY();
            double var9 = var1.a().getZ();
            BlockState var31 = var4.getBlockState(var1.a());
            short var10002 = -1139;
            short var10003 = -19511;
            Intrinsics.checkNotNullExpressionValue(var31, "getBlockState(...)");
            BlockState var11 = var31;
            List var32 = var11.getShape(var4, var1.a()).toAabbs();
            var10002 = -1124;
            var10003 = 6329;
            Intrinsics.checkNotNullExpressionValue(var32, "toAabbs(...)");
            Collection var13 = var32;
            boolean var14 = false;
            var var16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var13, 10));
            boolean var17 = false;
            Iterator var18 = var13.iterator();

            while (true) {
               if (var18.hasNext()) {
                  Object var19 = var18.next();
                  var10000 = (ClientLevel)(Object)(var16);
                  AABB var20 = (AABB)var19;
                  if (var3 == null) {
                     break;
                  }

                  boolean var21 = false;
                  var16.add(var20.move(var5, var7, var9));
                  if (var3 != null) {
                     continue;
                  }
               }

               var10000 = ((ClientLevel)(Object)((Collection & List)var16));
               break;
            }

            label108: {
               var13 = ((Collection)(Object)(var10000));
               boolean var34 = var13.isEmpty();
               if (var3 != null) {
                  if (!var34) {
                     var10000 = ((ClientLevel)(Object)(var13));
                     break label108;
                  }

                  boolean var35 = false;
               }

               var10000 = CollectionsKt.listOf(
                  me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var1.a(), var11)
               );
            }

            label102:
            for (AABB var47 : ((List<AABB>)var10000)) {
               var10002 = -1122;
               var10003 = -28591;
               Intrinsics.checkNotNullExpressionValue(var47, "next(...)");
               AABB var25 = (AABB)var47;
               Vec3 var15 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var2, var25);
               double var45;
               int var38 = (var45 = var2.distanceToSqr(var15) - 19.802500000000002) == 0.0 ? 0 : (var45 < 0.0 ? -1 : 1);

               do {
                  if (var3 != null) {
                     if (var38 > 0) {
                        continue label102;
                     }

                     var38 = ((this.a(var2, var15, var1.a())) ? 1 : 0);
                  }

                  label126: {
                     label127: {
                        if (var3 != null) {
                           if ((var38 == 0)) {
                              return true;
                           }

                           var16 = ((ArrayList)(Object)(this.a(var25, var2)));
                           var17 = false;
                           var39 = var16;
                           if (var3 == null) {
                              break label127;
                           }

                           var38 = ((var16 instanceof Collection) ? 1 : 0);
                        }

                        if ((var38 == 0)) {
                           var39 = (Collection)var16;
                           if (var3 == null) {
                              break label127;
                           }

                           if (((me.octo.client.PXDyn)var39).isEmpty()) {
                              var40 = 0;
                              break label126;
                           }
                        }

                        var39 = var16;
                     }

                     var18 = ((me.octo.client.PXDyn)var39).iterator();

                     label84:
                     while (true) {
                        if (!var18.hasNext()) {
                           var40 = 0;
                           break;
                        }

                        Object var28 = var18.next();
                        Vec3 var29 = (Vec3)var28;
                        boolean var30 = false;
                        double var46;
                        var40 = (var46 = var2.distanceToSqr(var29) - 19.802500000000002) == 0.0 ? 0 : (var46 < 0.0 ? -1 : 1);

                        while (true) {
                           label80: {
                              label131: {
                                 if (var3 != null) {
                                    if (var40 > 0) {
                                       break label131;
                                    }

                                    var40 = ((this.a(var2, var29, var1.a())) ? 1 : 0);
                                 }

                                 if (var3 == null) {
                                    break label80;
                                 }

                                 if (var40 != 0) {
                                    var40 = 1;
                                    break label80;
                                 }
                              }

                              var40 = 0;
                           }

                           if (var40 == 0) {
                              break;
                           }

                           var40 = 1;
                           if (var3 != null) {
                              break label84;
                           }
                        }
                     }
                  }

                  if (var40 == 0) {
                     continue label102;
                  }

                  var38 = 1;
               } while (var3 == null);

               return true;
            }

            return false;
         }
      }

      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final Vec3 a(
      Vec3 var1,
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2
   ) { ClientLevel var10000 = null; // PX-FIX hoist
        
      Object var85 = null; // PX-FIX
      Collection var84 = null; // PX-FIX
      Collection var81 = null; // PX-FIX
      String var3 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var3 != null) {
          var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var4 = var10000;
            double var5 = var2.a().getX();
            double var7 = var2.a().getY();
            double var9 = var2.a().getZ();
            List var80 = var4.getBlockState(var2.a()).getShape(var4, var2.a()).toAabbs();
            short var10002 = -1104;
            short var10003 = -19499;
            Intrinsics.checkNotNullExpressionValue(var80, "toAabbs(...)");
            Iterable var12 = var80;
            boolean var13 = false;
            Collection var15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var12, 10));
            boolean var16 = false;
            Iterator var17 = var12.iterator();

            while (true) {
               if (var17.hasNext()) {
                  Object var18 = var17.next();
                  var81 = var15;
                  AABB var19 = (AABB)var18;
                  if (var3 == null) {
                     break;
                  }

                  boolean var21 = false;
                  var15.add(var19.move(var5, var7, var9));
                  if (var3 != null) {
                     continue;
                  }
               }

               var81 = var15;
               break;
            }

            List var11 = (List)var81;
            var10000 = ((ClientLevel)(Object)(var11));
            if (var3 != null) {
               if (var11.isEmpty()) {
                  return var2.c();
               }

               var10000 = ((ClientLevel)(Object)(var11));
            }

            Object var28 = var10000;
            boolean var14 = false;
            Collection var37 = new ArrayList();
            boolean var41 = false;
            Iterator var46 = ((me.octo.client.PXDyn)var28).iterator();

            while (true) {
               if (var46.hasNext()) {
                  Object var49 = var46.next();
                  AABB var58 = (AABB)var49;
                  boolean var22 = false;
                  me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var83 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  Intrinsics.checkNotNull(var58);
                  Iterable var59 = CollectionsKt.plus(
                     me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                        var83, var58, 0.25, 0.0, var1, 0.0, 20, null
                     ),
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var1, var58)
                  );
                  var84 = var37;
                  if (var3 == null) {
                     break;
                  }

                  CollectionsKt.addAll(var37, var59);
                  if (var3 != null) {
                     continue;
                  }
               }

               var84 = var37;
               break;
            }

            List var27 = (List)var84;
            Iterable var30 = var27;
            boolean var33 = false;
            var var42 = new ArrayList();
            boolean var47 = false;

            for (Object var60 : var30) {
               label217: {
                  label247: {
                     Vec3 var68 = (Vec3)var60;
                     boolean var24 = false;
                     double var98;
                     var85 = (var98 = var1.distanceToSqr(var68) - 19.802500000000002) == 0.0 ? 0 : (var98 < 0.0 ? -1 : 1);
                     if (var3 != null) {
                        if ((me.octo.client.PxTruth.truth(var85))) {
                           break label247;
                        }

                        var85 = this.a(var1, var68, var2.a());
                     }

                     if (var3 == null) {
                        break label217;
                     }

                     if (!(me.octo.client.PxTruth.truth(var85))) {
                        var85 = 1;
                        break label217;
                     }
                  }

                  var85 = 0;
               }

               if (!(me.octo.client.PxTruth.truth(var85))) {
                  var42.add(var60);
                  if (var3 == null) {
                     break;
                  }
               }
            }

            List var29 = var42;
            Iterable var34 = var29;
            var16 = false;
            var var48 = new ArrayList();
            boolean var51 = false;
            Iterator var61 = var34.iterator();

            while (true) {
               if (var61.hasNext()) {
                  Object var69 = var61.next();
                  Vec3 var76 = (Vec3)var69;
                  boolean var25 = false;
                  boolean var86 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(
                     this, var76, var2.a(), var1, 0.0);
                  if (var3 == null) {
                     break;
                  }

                  if (var3 != null) {
                     if (!var86) {
                        continue;
                     }

                     var48.add(var69);
                  }

                  if (var3 != null) {
                     continue;
                  }
               }

               var34 = (Iterable & List)var48;
               boolean var87 = false;
               break;
            }

            label249: {
               label250: {
                  var17 = var34.iterator();
                  boolean var88 = var17.hasNext();
                  if (var3 != null) {
                     if (!var88) {
                        var10000 = null;
                        break label249;
                     }

                     var48 = ((ArrayList)(var17.next()));
                     var10000 = ((ClientLevel)(Object)(var17));
                     if (var3 == null) {
                        break label250;
                     }

                     var88 = var17.hasNext();
                  }

                  if (!var88) {
                     var10000 = (ClientLevel)(Object)(var48);
                     break label249;
                  }

                  var10000 = (ClientLevel)(Object)(var48);
               }

               Vec3 var52 = (Vec3)(Object)(var10000);
               boolean var62 = false;
               double var53 = var1.distanceToSqr(var52);

               label175:
               while (true) {
                  Object var63 = var17.next();
                  Vec3 var70 = (Vec3)var63;
                  boolean var77 = false;
                  double var71 = var1.distanceToSqr(var70);
                  if (Double.compare(var53, var71) > 0) {
                     var48 =((ArrayList)( var63));
                     var53 = var71;
                  }

                  while (!var17.hasNext()) {
                     if (var3 != null) {
                        var10000 = (ClientLevel)(Object)(var48);
                        break label175;
                     }

                     var53 = var71;
                  }
               }
            }

            Vec3 var31 = (Vec3)(Object)(var10000);
            if (var3 != null) {
               if (var31 != null) {
                  boolean var45 = false;
                  return var31;
               }

               Iterable var35 = var29;
               var16 = false;
               var17 = var35.iterator();
            }

            label253: {
               label254: {
                  boolean var91 = var17.hasNext();
                  if (var3 != null) {
                     if (!var91) {
                        var10000 = null;
                        break label253;
                     }

                     var48 = ((ArrayList)(var17.next()));
                     var10000 = ((ClientLevel)(Object)(var17));
                     if (var3 == null) {
                        break label254;
                     }

                     var91 = var17.hasNext();
                  }

                  if (!var91) {
                     var10000 = (ClientLevel)(Object)(var48);
                     break label253;
                  }

                  var10000 = (ClientLevel)(Object)(var48);
               }

               Vec3 var54 = (Vec3)(Object)(var10000);
               boolean var64 = false;
               double var55 = var1.distanceToSqr(var54);

               label148:
               while (true) {
                  Object var65 = var17.next();
                  Vec3 var72 = (Vec3)var65;
                  boolean var78 = false;
                  double var73 = var1.distanceToSqr(var72);
                  if (Double.compare(var55, var73) > 0) {
                     var48 =((ArrayList)( var65));
                     var55 = var73;
                  }

                  while (!var17.hasNext()) {
                     if (var3 != null) {
                        var10000 = (ClientLevel)(Object)(var48);
                        break label148;
                     }

                     var55 = var73;
                  }
               }
            }

            Vec3 var32 = (Vec3)(Object)(var10000);
            if (var3 != null) {
               if (var32 != null) {
                  boolean var44 = false;
                  return var32;
               }

               Iterable var36 = var27;
               var16 = false;
               var17 = var36.iterator();
            }

            label257: {
               label258: {
                  boolean var94 = var17.hasNext();
                  if (var3 != null) {
                     if (!var94) {
                        var10000 = null;
                        break label257;
                     }

                     var48 = ((ArrayList)(var17.next()));
                     var10000 = ((ClientLevel)(Object)(var17));
                     if (var3 == null) {
                        break label258;
                     }

                     var94 = var17.hasNext();
                  }

                  if (!var94) {
                     var10000 = (ClientLevel)(Object)(var48);
                     break label257;
                  }

                  var10000 = (ClientLevel)(Object)(var48);
               }

               Vec3 var56 = (Vec3)(Object)(var10000);
               boolean var66 = false;
               double var57 = var1.distanceToSqr(var56);

               label121:
               while (true) {
                  Object var67 = var17.next();
                  Vec3 var74 = (Vec3)var67;
                  boolean var79 = false;
                  double var75 = var1.distanceToSqr(var74);
                  if (Double.compare(var57, var75) > 0) {
                     var48 =((ArrayList)( var67));
                     var57 = var75;
                  }

                  while (!var17.hasNext()) {
                     if (var3 != null) {
                        var10000 = (ClientLevel)(Object)(var48);
                        break label121;
                     }

                     var57 = var75;
                  }
               }
            }

            Vec3 var97 = (Vec3)(Object)(var10000);
            if (var10000 == null) {
               var97 = var2.c();
            }

            return var97;
         }
      }

      return var2.c();
   }

   private final boolean a(BlockState var1) {
      String var2;
      Object var9;
      var var3 = IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
      var9 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var4 = false;
      var2 = (String)var9;
      var9 = var3;
      label36:
      if (var2 != null) {
         if (var3 instanceof Collection) {
            var9 = (Collection)var3;
            if (var2 == null) {
               break label36;
            }

            if (((me.octo.client.PXDyn)var9).isEmpty()) {
               return false;
            }
         }

         var9 = var3;
      }

      for (Object var6 : (Iterable<?>)(var9)) {
         Block var7 = (Block)var6;
         boolean var8 = false;
         boolean var10 = var1.is(var7);

         while (var10) {
            var10 = true;
            if (var2 != null) {
               return true;
            }
         }
      }

      return false;
   }

   private final boolean a(Vec3 var1, Vec3 var2, BlockPos var3) { ClientLevel var10000 = null; // PX-FIX hoist
        
      String var4 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var4 != null) {
          var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var5 = var10000;
            BlockPos var6 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d()
                  .al()
               ? me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .s()
               : null;
            Iterator var10 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var1, var2)
               .iterator();
            short var10002 = -1126;
            short var10003 = -29572;
            Intrinsics.checkNotNullExpressionValue(var10, "iterator(...)");
            Iterator var7 = var10;

            while (true) {
               boolean var12;
               if (var7.hasNext()) {
                  var10000 = (ClientLevel)var7.next();
                  var10002 = -1128;
                  var10003 = -23726;
                  Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                  BlockPos var8 = (BlockPos)(Object)(var10000);
                  var12 = Intrinsics.areEqual(var8, var3);
                  if (var4 != null) {
                     if (var4 != null) {
                        if (var12) {
                           return true;
                        }

                        var12 = Intrinsics.areEqual(var8, var6);
                     }

                     if (var4 != null) {
                        if (!var12) {
                           BlockState var13 = var5.getBlockState(var8);
                           var10002 = -1139;
                           var10003 = -19511;
                           Intrinsics.checkNotNullExpressionValue(var13, "getBlockState(...)");
                           BlockState var9 = var13;
                           boolean var14 = var9.isAir();
                           if (var4 != null) {
                              if (var14) {
                                 continue;
                              }

                              var14 = this.a(var9);
                           }

                           if (var4 != null) {
                              if (var14) {
                                 continue;
                              }

                              var14 = false;
                           }

                           return var14;
                        }

                        var12 = false;
                     }

                     return var12;
                  }
               } else {
                  var12 = false;
               }

               return var12;
            }
         }
      }

      return false;
   }

   private final List<Vec3> a(AABB var1, Vec3 var2) { String var10000 = null; // PX-FIX hoist
        
      String var3;
      double var4;
      double var6;
      double var8;
      double var10;
      double var20;
      label36: {
         var4 = (var1.minX + var1.maxX) / 2.0;
         var6 = (var1.minY + var1.maxY) / 2.0;
         var8 = (var1.minZ + var1.maxZ) / 2.0;
          var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         var10 = 0.001;
         var3 = var10000;
         var20 = var2.x;
         double var10001 = var4;
         if (var3 != null) {
            if (var2.x < var4) {
               var20 = var1.minX + var10;
               break label36;
            }

            var20 = var1.maxX;
            var10001 = var10;
         }

         var20 -= var10001;
      }

      double var12;
      label30: {
         var12 = var20;
         var20 = var2.y;
         double var25 = var6;
         if (var3 != null) {
            if (var2.y < var6) {
               var20 = var1.minY + var10;
               break label30;
            }

            var20 = var1.maxY;
            var25 = var10;
         }

         var20 -= var25;
      }

      double var14;
      label24: {
         var14 = var20;
         var20 = var2.z;
         double var26 = var8;
         if (var3 != null) {
            if (var2.z < var8) {
               var20 = var1.minZ + var10;
               break label24;
            }

            var20 = var1.maxZ;
            var26 = var10;
         }

         var20 -= var26;
      }

      double var16 = var20;
      Vec3[] var18 = new Vec3[]{new Vec3(var12, var6, var8), new Vec3(var4, var14, var8), new Vec3(var4, var6, var16)};
      return CollectionsKt.listOf(var18);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI E() { String var10000 = null; // PX-FIX hoist
        
      Object var41 = null; // PX-FIX
      Object var38 = null; // PX-FIX
      Object var37 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      List var2 = this.X();
       var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Collection var4 = var2;
      String var1 = var10000;
      boolean var5 = false;
      Iterable var6 = var4;
      var var7 = new ArrayList();
      boolean var8 = false;
      Object var9 = var4.iterator();

      while (true) {
         if (((me.octo.client.PXDyn)var9).hasNext()) {
            Object var10 = ((me.octo.client.PXDyn)var9).next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var12 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10;
            boolean var13 = false;
            var37 = this.i();
            if (var1 == null) {
               break;
            }

            label154: {
               label164: {
                  var38 = ((me.octo.client.PXDyn)var37).contains(var12.a());
                  if (var1 != null) {
                     if ((me.octo.client.PxTruth.truth(var38))) {
                        break label164;
                     }

                     var38 = this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.contains(var12.a());
                  }

                  if (var1 == null) {
                     break label154;
                  }

                  if (!(me.octo.client.PxTruth.truth(var38))) {
                     var38 = true;
                     break label154;
                  }
               }

               var38 = false;
            }

            if (!(me.octo.client.PxTruth.truth(var38))) {
               continue;
            }

            var7.add(var10);
            if (var1 != null) {
               continue;
            }
         }

         var37 = var7;
         break;
      }

      label138: {
         label165: {
            var4 = (Collection)var37;
            boolean var39 = var4.isEmpty();
            if (var1 != null) {
               if (!var39) {
                  var10000 = String.valueOf(var4);
                  break label165;
               }

               var5 = false;
               var6 = var2;
               boolean var40 = false;
            }

            var9 = new ArrayList();
            boolean var22 = false;

            for (Object var30 : var6) {
               IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var30;
               boolean var16 = false;
               var41 = this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.contains(var15.a());
               if (var1 == null) {
                  break label138;
               }

               if (var1 != null) {
                  if (!(me.octo.client.PxTruth.truth(var41))) {
                     continue;
                  }

                  ((me.octo.client.PXDyn)var9).add(var30);
               }

               if (var1 == null) {
                  break;
               }
            }

            var10000 = String.valueOf((List)var9);
         }

         var4 = (Collection)(Object)(var10000);
         var41 = var4.isEmpty();
      }

      label167: {
         if (var1 != null) {
            if (!(me.octo.client.PxTruth.truth(var41))) {
               var10000 = String.valueOf(var4);
               break label167;
            }

            var5 = false;
            var6 = var2;
            boolean var43 = false;
         }

         var9 = new ArrayList();
         boolean var23 = false;

         for (Object var31 : var6) {
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var34 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var31;
            boolean var36 = false;
            var10000 = String.valueOf(this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII);
            if (var1 == null) {
               break label167;
            }

            boolean var45 = this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.contains(var34.a());
            if (var1 != null) {
               if (!var45) {
                  continue;
               }

               ((me.octo.client.PXDyn)var9).add(var31);
            }

            if (var1 == null) {
               break;
            }
         }

         var10000 = String.valueOf((List)var9);
      }

      List var3 = (List)(Object)(var10000);
      boolean var46 = var3.isEmpty();
      if (var1 != null) {
         if (var46) {
            return null;
         }

         var6 = var3;
         boolean var47 = false;
      }

      label169: {
         label170: {
            var21 = var6.iterator();
            boolean var48 = ((me.octo.client.PXDyn)var21).hasNext();
            if (var1 != null) {
               if (!var48) {
                  var10000 = null;
                  break label169;
               }

               var9 = ((me.octo.client.PXDyn)var21).next();
               var10000 =((String)( var21));
               if (var1 == null) {
                  break label170;
               }

               var48 = ((me.octo.client.PXDyn)var21).hasNext();
            }

            if (!var48) {
               var10000 = (String)var9;
               break label169;
            }

            var10000 = (String)var9;
         }

         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var24 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
         boolean var28 = false;
         double var25 = this.b(var24);

         label82:
         while (true) {
            Object var29 = ((me.octo.client.PXDyn)var21).next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var32 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var29;
            boolean var35 = false;
            double var33 = this.b(var32);
            if (Double.compare(var25, var33) > 0) {
               var9 = var29;
               var25 = var33;
            }

            while (!(Boolean)((me.octo.client.PXDyn)var21).hasNext()) {
               if (var1 != null) {
                  var10000 = (String)var9;
                  break label82;
               }

               var25 = var33;
            }
         }
      }

      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var51 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
      if ((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000
         == null) {
         return null;
      } else {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var18 = var51;
         this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = var18;
         return var18;
      }
   }

   private final double b(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) { String var10000 = null; // PX-FIX hoist
        
      Vec3 var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(var1.a());
      double var6 = 0.0;
      var6 += me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var3, true)
         * 0.5;
       var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      var6 += me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(var3)
         * 0.1;
      String var2 = var10000;
      if (var2 != null && this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll != null) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
         boolean var5 = false;
         if (var2 != null
            && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(
                     var3,
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .d(var4.a())
                  )
               > 1.5) {
            var6 += 2.0;
         }
      }

      return this.a(var3, var6, 50.0);
   }

   private final List<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> X() { ClientLevel var10000 = null; // PX-FIX hoist
        
      boolean var34 = false; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var28 = null; // PX-FIX
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
          var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var2;
            boolean var3;
            Vec3 var4;
            ArrayList var5;
            label187: {
               label188: {
                  var2 = var10000;
                  var3 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .d()
                     .al();
                  var4 = var3
                     ? me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w()
                     : me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g(this.h());
                  var5 = new ArrayList();
                  boolean var24 = var3;
                  if (var1 != null) {
                     if (!var3) {
                        break label188;
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var25 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .e();
                     short var10001 = -1145;
                     short var10002 = 11516;
                     var24 = var25.c("Sneak Only");
                  }

                  if (var1 != null) {
                     if (!var24) {
                        var5.add(var4.add(0.0, 1.62, 0.0));
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var26 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .e();
                     short var35 = -1149;
                     short var36 = -6235;
                     var24 = var26.c("No Sneak");
                  }

                  if (var1 != null) {
                     if (var24) {
                        break label187;
                     }

                     var5.add(var4.add(0.0, 1.27, 0.0));
                  }

                  if (var1 != null) {
                     break label187;
                  }
               }

               for (Vec3 var7 : this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll) {
                  var5.add(var4.add(var7.x, 1.27, var7.z));
                  if (var1 == null) {
                     break label187;
                  }

                  if (var1 == null) {
                     break;
                  }
               }

               var5.add(var4.add(0.0, 1.27, 0.0));
            }

            label155: {
               long var22 = System.currentTimeMillis();
               IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl var27 = this;
               if (var1 != null) {
                  this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll
                     .entrySet()
                     .removeIf(null);
                  if (var3) {
                     var28 = BlockPos.containing(var4);
                     break label155;
                  }

                  var27 = this;
               }

               var28 = var27.h();
            }

            BlockPos var9 =((BlockPos)( var28));
            Intrinsics.checkNotNull(var9);
            BlockPos var8 = var9;
            ArrayList var23 = new ArrayList();
            int var10 = -6;

            label148:
            while (true) {
               int var29 = var10;

               label146:
               while (var29 < 7) {
                  int var11 = -6;

                  label143:
                  while (true) {
                     int var30 = var11;

                     label141:
                     while (true) {
                        if (var30 >= 7) {
                           break label143;
                        }

                        var29 = -6;
                        if (var1 == null) {
                           continue label146;
                        }

                        int var12 = -6;

                        while (var12 < 7) {
                           var30 = var11;
                           if (var1 == null) {
                              continue label141;
                           }

                           label135: {
                              label193: {
                                 label194: {
                                    if (var1 != null) {
                                       if (var11 != 0) {
                                          break label194;
                                       }

                                       var30 = var12;
                                    }

                                    if (var1 != null) {
                                       if (var30 != 0) {
                                          break label194;
                                       }

                                       var30 = var10;
                                    }

                                    if (var30 <= 0) {
                                       break label193;
                                    }
                                 }

                                 BlockPos var31 = var8.offset(var11, var10, var12);
                                 short var37 = -1130;
                                 short var10003 = -12152;
                                 Intrinsics.checkNotNullExpressionValue(var31, "offset(...)");
                                 BlockPos var13 = var31;
                                 if (var1 == null) {
                                    break label135;
                                 }

                                 if (!this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.containsKey(var13)) {
                                    BlockState var32 = var2.getBlockState(var13);
                                    var37 = -1136;
                                    var10003 = 25322;
                                    Intrinsics.checkNotNullExpressionValue(var32, "getBlockState(...)");
                                    BlockState var14 = var32;
                                    if (var1 == null) {
                                       break label135;
                                    }

                                    if (this.b(var14)) {
                                       IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15;
                                       label195: {
                                          var15 = new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                                             var13, var14
                                          );
                                          var var16 = var5;
                                          boolean var17 = false;
                                          var33 = var16;
                                          label115:
                                          if (var1 != null) {
                                             if (var16 instanceof Collection) {
                                                var33 = var16;
                                                if (var1 == null) {
                                                   break label115;
                                                }

                                                if (((me.octo.client.PXDyn)var33).isEmpty()) {
                                                   var34 = false;
                                                   break label195;
                                                }
                                             }

                                             var33 = var16;
                                          }

                                          Iterator var18 = ((me.octo.client.PXDyn)var33).iterator();

                                          label108:
                                          while (true) {
                                             if (!var18.hasNext()) {
                                                var34 = false;
                                                break;
                                             }

                                             Object var19 = var18.next();
                                             Vec3 var20 = (Vec3)var19;
                                             boolean var21 = false;
                                             var34 = this.a(var15, var20);

                                             while (var34) {
                                                var34 = true;
                                                if (var1 != null) {
                                                   break label108;
                                                }
                                             }
                                          }
                                       }

                                       if (var34) {
                                          var23.add(var15);
                                       }
                                    }
                                 }
                              }

                              var12++;
                           }

                           if (var1 == null) {
                              break;
                           }
                        }

                        var11++;
                        if (var1 == null) {
                           break label143;
                        }
                        break;
                     }
                  }

                  var10++;
                  if (var1 == null) {
                     return CollectionsKt.toList(var23);
                  }
                  continue label148;
               }

               return CollectionsKt.toList(var23);
            }
         }
      }

      return CollectionsKt.emptyList();
   }

   private final boolean b(BlockState var1) {
      String var2;
      boolean var10000;
      var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      var10000 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b()
         .al();
      label115:
      if (var2 != null) {
         if (var10000) {
            var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .m();
            if (var2 == null) {
               break label115;
            }

            if (var10000) {
               var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .r(var1);
               if (var2 == null) {
                  break label115;
               }

               if (var10000) {
                  return true;
               }
            }
         }

         var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .s(var1);
      }

      if (var2 != null) {
         if (var10000) {
            lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var3 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            short var10001 = -1134;
            short var10002 = -19416;
            var10000 = var3.b("Amber");
            if (var2 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .u(var1);
      }

      if (var2 != null) {
         if (var10000) {
            lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var4 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            short var10 = -1141;
            short var16 = -16796;
            var10000 = var4.b("Jade");
            if (var2 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .v(var1);
      }

      if (var2 != null) {
         if (var10000) {
            lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var5 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            short var11 = -1123;
            short var17 = 29378;
            var10000 = var5.b("Amethyst");
            if (var2 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .t(var1);
      }

      if (var2 != null) {
         if (var10000) {
            lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var6 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            short var12 = -1142;
            short var18 = 10700;
            var10000 = var6.b("Sapphire");
            if (var2 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .B(var1);
      }

      if (var2 != null) {
         if (var10000) {
            lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var7 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            short var13 = -1138;
            short var19 = 29722;
            var10000 = var7.b("Ruby");
            if (var2 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .r(var1);
      }

      if (var2 != null) {
         if (var10000) {
            lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var8 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            short var14 = -1144;
            short var20 = 1831;
            var10000 = var8.b("Topaz");
            if (var2 == null) {
               return var10000;
            }

            if (var10000) {
               return true;
            }
         }

         var10000 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .w(var1);
      }

      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var9 = lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
         short var15 = -1131;
         short var21 = 1564;
         var10000 = var9.b("Jasper");
      }

      return var2 == null ? var10000 : var10000;
   }

   @Override
   public void c(@NotNull BlockPos var1) {
      short var10001 = -1127;
      short var10002 = 11485;
      Intrinsics.checkNotNullParameter(var1, "pos");
      me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var2 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(var1)
         .add(this.g());
      short var10004 = -1147;
      short var10005 = -5534;
      Intrinsics.checkNotNullExpressionValue(var3, "add(...)");
      Vec3 var10003 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII)
         .add(this.g());
      var10005 = -1152;
      short var10006 = -3761;
      Intrinsics.checkNotNullExpressionValue(var10003, "add(...)");
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = CollectionsKt.toList(var2.b(var3, var10003));
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = null;
      this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = null;
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = false;
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = null;
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.clear();
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = false;
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.f();
      super.c(var1);
   }

   private static final boolean a(long var0, Entry var2) { String var10000 = null; // PX-FIX hoist
        
       var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = -1143;
      short var10003 = -26018;
      Intrinsics.checkNotNullParameter(var2, "it");
      String var3 = var10000;
      long var5;
      int var4 = (var5 = ((Number)var2.getValue()).longValue() - var0) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var3 != null) {
         var4 = var4 < 0 ? 1 : 0;
      }

      return (var4 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { byte var10000 = (byte)0; // PX-FIX hoist
        
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[35];
      int var3 = 0;
      String var2 = "ÑÙZ\u0091\u0090\u000eI\u008a½Ô¯Ø\u0096ó¯ôè\u001aß_\u0012v¤Z\u0010Z`\u0017ËK`>\u0005è¬Ôc4¡\u000e*hÑ\u0088\"S'\u0082\u0099Ú.ß\u0007ç\u000b\u0013\ní\u0097õ\u009c\u0081iÆ\u0083\u0015\u0007Eè\u001d{À\u00adp\u0006{Ë¨p4 \u0006óîeïSö\r°\u0085\\7¤©h\u0093R\u000bF#\r\bÀdÔRW\u0011ö®\tÂNè{Å¼e|\u009b\u0003và¨\tödn>\u0015\u0014\u007fiØ\u0005ëñnóè\f\u008e¬\u0001y¬\u0007\u0016È\u0004qJk\b£g\u0013WDn@Á\u0004\br)ã\b\u0012%\u008ez\u001c\u0014\u009f\u000e\b\u0089rs\u0081/4þj\u0007ôÑ+\\\u0006I¨\u000b\u0081\n¿\u0097¿\u009cÈiï\u00830\nÍx\u008eÂô2\t\"\u001eõ\u0005+\fvLë\b&ã\u0086³\u0091r)¢\b\u0010× È\u0095\t{.\u0004R\u009fFÔ\u0005öõ\u001bRà\u0002\u0019\u0010\u0004yÜ>6\n\u0018\u00874=£ÍãÝC\n\u000bB2¸ôä\rgX=õ\u0082\u0012q1º¢F6\u0094\u0001;90.)ÉìÏ34\u000f;Gm\u0011è¶àÕ$ò\u0000|\u0004\u0094l";
      int var4 = "ÑÙZ\u0091\u0090\u000eI\u008a½Ô¯Ø\u0096ó¯ôè\u001aß_\u0012v¤Z\u0010Z`\u0017ËK`>\u0005è¬Ôc4¡\u000e*hÑ\u0088\"S'\u0082\u0099Ú.ß\u0007ç\u000b\u0013\ní\u0097õ\u009c\u0081iÆ\u0083\u0015\u0007Eè\u001d{À\u00adp\u0006{Ë¨p4 \u0006óîeïSö\r°\u0085\\7¤©h\u0093R\u000bF#\r\bÀdÔRW\u0011ö®\tÂNè{Å¼e|\u009b\u0003và¨\tödn>\u0015\u0014\u007fiØ\u0005ëñnóè\f\u008e¬\u0001y¬\u0007\u0016È\u0004qJk\b£g\u0013WDn@Á\u0004\br)ã\b\u0012%\u008ez\u001c\u0014\u009f\u000e\b\u0089rs\u0081/4þj\u0007ôÑ+\\\u0006I¨\u000b\u0081\n¿\u0097¿\u009cÈiï\u00830\nÍx\u008eÂô2\t\"\u001eõ\u0005+\fvLë\b&ã\u0086³\u0091r)¢\b\u0010× È\u0095\t{.\u0004R\u009fFÔ\u0005öõ\u001bRà\u0002\u0019\u0010\u0004yÜ>6\n\u0018\u00874=£ÍãÝC\n\u000bB2¸ôä\rgX=õ\u0082\u0012q1º¢F6\u0094\u0001;90.)ÉìÏ34\u000f;Gm\u0011è¶àÕ$ò\u0000|\u0004\u0094l"
         .length();
      char var1 = 5;
      int var9 = -1;

      label52:
while (true) {
          var10000 = 23;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 124;
                     case 1 -> 36;
                     case 2 -> 17;
                     case 3 -> 126;
                     case 4 -> 80;
                     case 5 -> 61;
                     default -> 33;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[35];
                     IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = new IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     Block[] var7 = new Block[]{
                        Blocks.STONE,
                        Blocks.INFESTED_STONE,
                        Blocks.GOLD_ORE,
                        Blocks.IRON_ORE,
                        Blocks.COAL_ORE,
                        Blocks.LAPIS_ORE,
                        Blocks.DIAMOND_ORE,
                        Blocks.REDSTONE_ORE,
                        Blocks.EMERALD_ORE
                     };
                     IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = SetsKt.setOf(var7);
                     break label52;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "ëöÑ\u0081Ù\u0002`å\u0092RpÎ¬dß\fò\u0093(8/\u0089À¿x9cÄ";
                  var4 = "ëöÑ\u0081Ù\u0002`å\u0092RpÎ¬dß\fò\u0093(8/\u0089À¿x9cÄ".length();
                  var1 = 15;
                  var9 = -1;
            }

            var10000 = 88;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -1134) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 210;
            case 1 -> 222;
            case 2 -> 165;
            case 3 -> 245;
            case 4 -> 231;
            case 5 -> 137;
            case 6 -> 9;
            case 7 -> 179;
            case 8 -> 131;
            case 9 -> 145;
            case 10 -> 198;
            case 11 -> 146;
            case 12 -> 2;
            case 13 -> 239;
            case 14 -> 126;
            case 15 -> 132;
            case 16 -> 127;
            case 17 -> 167;
            case 18 -> 218;
            case 19 -> 65;
            case 20 -> 211;
            case 21 -> 201;
            case 22 -> 151;
            case 23 -> 177;
            case 24 -> 159;
            case 25 -> 223;
            case 26 -> 76;
            case 27 -> 103;
            case 28 -> 118;
            case 29 -> 112;
            case 30 -> 3;
            case 31 -> 26;
            case 32 -> 4;
            case 33 -> 215;
            case 34 -> 119;
            case 35 -> 108;
            case 36 -> 228;
            case 37 -> 252;
            case 38 -> 153;
            case 39 -> 196;
            case 40 -> 246;
            case 41 -> 55;
            case 42 -> 156;
            case 43 -> 238;
            case 44 -> 166;
            case 45 -> 251;
            case 46 -> 90;
            case 47 -> 58;
            case 48 -> 143;
            case 49 -> 109;
            case 50 -> 154;
            case 51 -> 197;
            case 52 -> 221;
            case 53 -> 31;
            case 54 -> 63;
            case 55 -> 56;
            case 56 -> 69;
            case 57 -> 241;
            case 58 -> 150;
            case 59 -> 60;
            case 60 -> 13;
            case 61 -> 10;
            case 62 -> 21;
            case 63 -> 174;
            case 64 -> 25;
            case 65 -> 213;
            case 66 -> 147;
            case 67 -> 20;
            case 68 -> 240;
            case 69 -> 135;
            case 70 -> 224;
            case 71 -> 52;
            case 72 -> 102;
            case 73 -> 244;
            case 74 -> 234;
            case 75 -> 61;
            case 76 -> 84;
            case 77 -> 54;
            case 78 -> 121;
            case 79 -> 232;
            case 80 -> 212;
            case 81 -> 15;
            case 82 -> 130;
            case 83 -> 117;
            case 84 -> 115;
            case 85 -> 95;
            case 86 -> 176;
            case 87 -> 229;
            case 88 -> 101;
            case 89 -> 249;
            case 90 -> 200;
            case 91 -> 169;
            case 92 -> 87;
            case 93 -> 79;
            case 94 -> 254;
            case 95 -> 175;
            case 96 -> 152;
            case 97 -> 38;
            case 98 -> 188;
            case 99 -> 1;
            case 100 -> 172;
            case 101 -> 93;
            case 102 -> 133;
            case 103 -> 136;
            case 104 -> 107;
            case 105 -> 149;
            case 106 -> 49;
            case 107 -> 124;
            case 108 -> 157;
            case 109 -> 183;
            case 110 -> 43;
            case 111 -> 237;
            case 112 -> 230;
            case 113 -> 217;
            case 114 -> 67;
            case 115 -> 214;
            case 116 -> 28;
            case 117 -> 158;
            case 118 -> 32;
            case 119 -> 89;
            case 120 -> 113;
            case 121 -> 110;
            case 122 -> 19;
            case 123 -> 164;
            case 124 -> 100;
            case 125 -> 141;
            case 126 -> 250;
            case 127 -> 27;
            case 128 -> 88;
            case 129 -> 114;
            case 130 -> 138;
            case 131 -> 247;
            case 132 -> 83;
            case 133 -> 205;
            case 134 -> 0;
            case 135 -> 226;
            case 136 -> 185;
            case 137 -> 111;
            case 138 -> 180;
            case 139 -> 24;
            case 140 -> 80;
            case 141 -> 33;
            case 142 -> 248;
            case 143 -> 77;
            case 144 -> 190;
            case 145 -> 6;
            case 146 -> 14;
            case 147 -> 18;
            case 148 -> 142;
            case 149 -> 144;
            case 150 -> 191;
            case 151 -> 219;
            case 152 -> 74;
            case 153 -> 170;
            case 154 -> 155;
            case 155 -> 46;
            case 156 -> 29;
            case 157 -> 94;
            case 158 -> 12;
            case 159 -> 209;
            case 160 -> 140;
            case 161 -> 192;
            case 162 -> 195;
            case 163 -> 168;
            case 164 -> 189;
            case 165 -> 134;
            case 166 -> 7;
            case 167 -> 123;
            case 168 -> 99;
            case 169 -> 139;
            case 170 -> 173;
            case 171 -> 30;
            case 172 -> 233;
            case 173 -> 194;
            case 174 -> 71;
            case 175 -> 85;
            case 176 -> 181;
            case 177 -> 34;
            case 178 -> 37;
            case 179 -> 5;
            case 180 -> 86;
            case 181 -> 72;
            case 182 -> 98;
            case 183 -> 16;
            case 184 -> 199;
            case 185 -> 116;
            case 186 -> 45;
            case 187 -> 42;
            case 188 -> 182;
            case 189 -> 220;
            case 190 -> 122;
            case 191 -> 106;
            case 192 -> 44;
            case 193 -> 50;
            case 194 -> 216;
            case 195 -> 92;
            case 196 -> 208;
            case 197 -> 97;
            case 198 -> 11;
            case 199 -> 184;
            case 200 -> 57;
            case 201 -> 105;
            case 202 -> 81;
            case 203 -> 203;
            case 204 -> 206;
            case 205 -> 36;
            case 206 -> 104;
            case 207 -> 66;
            case 208 -> 160;
            case 209 -> 129;
            case 210 -> 64;
            case 211 -> 59;
            case 212 -> 8;
            case 213 -> 148;
            case 214 -> 51;
            case 215 -> 70;
            case 216 -> 187;
            case 217 -> 53;
            case 218 -> 225;
            case 219 -> 202;
            case 220 -> 82;
            case 221 -> 47;
            case 222 -> 255;
            case 223 -> 243;
            case 224 -> 120;
            case 225 -> 125;
            case 226 -> 204;
            case 227 -> 62;
            case 228 -> 73;
            case 229 -> 40;
            case 230 -> 68;
            case 231 -> 178;
            case 232 -> 193;
            case 233 -> 227;
            case 234 -> 253;
            case 235 -> 171;
            case 236 -> 23;
            case 237 -> 17;
            case 238 -> 128;
            case 239 -> 236;
            case 240 -> 35;
            case 241 -> 207;
            case 242 -> 96;
            case 243 -> 242;
            case 244 -> 39;
            case 245 -> 41;
            case 246 -> 186;
            case 247 -> 163;
            case 248 -> 161;
            case 249 -> 235;
            case 250 -> 78;
            case 251 -> 75;
            case 252 -> 162;
            case 253 -> 91;
            case 254 -> 22;
            default -> 48;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
