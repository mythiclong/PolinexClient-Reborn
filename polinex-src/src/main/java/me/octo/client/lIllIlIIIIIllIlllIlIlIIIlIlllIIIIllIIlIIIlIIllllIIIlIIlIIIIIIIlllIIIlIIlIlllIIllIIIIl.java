package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl
   extends IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll {
   @NotNull
   private ArrayList<BlockPos> IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = new ArrayList<>();
   private int lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   @NotNull
   private List<? extends Vec3> lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = CollectionsKt.emptyList();
   @NotNull
   private List<? extends BlockPos> lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = CollectionsKt.emptyList();
   @NotNull
   private Vec3 IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   @Nullable
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   @Nullable
   private List<? extends Vec3> llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   private int llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   private final double IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   private boolean IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   private final double IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   private final double lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   @Nullable
   private Vec3 IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   @Nullable
   private BlockPos llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private boolean IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private static String[] c;
   private static String[] d;

   public lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl() {
      super(false);
      Vec3 var10001 = Vec3.ZERO;
      short var10003 = 26821;
      short var10004 = -30300;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = var10001;
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = 4.5;
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = 1.62;
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = 1.27;
   }

   @NotNull
   public final ArrayList<BlockPos> V() {
      return this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   }

   public final void b(@NotNull ArrayList<BlockPos> var1) {
      short var10001 = 26833;
      short var10002 = -19245;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = var1;
   }

   @NotNull
   @Override
   protected List<Vec3> v() {
      return ((List<Vec3>)(Object)(this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI g(
      @NotNull Vec3 var1
   ) {
      Object var43 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 26841;
      short var10003 = -24884;
      Intrinsics.checkNotNullParameter(var1, "destination");
      String var2 = var10000;
      if (var2 != null) {
         ClientLevel var38 = this.a().level;
         if (var38 != null) {
            ClientLevel var3 = var38;
            Vec3 var39 = var1.add(0.0, 0.3500000000000001, 0.0);
            var10002 = 26840;
            var10003 = -22751;
            Intrinsics.checkNotNullExpressionValue(var39, "add(...)");
            Vec3 var4 = var39;
            Iterable var5 = this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
            boolean var6 = false;
            Iterable var7 = var5;
            var var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, 10));
            boolean var9 = false;
            Iterator var11 = var5.iterator();

            while (true) {
               if (var11.hasNext()) {
                  Object var12 = var11.next();
                  BlockPos var14 = (BlockPos)var12;
                  boolean var15 = false;
                  BlockState var49 = var3.getBlockState(var14);
                  short var10005 = 26845;
                  short var10006 = -22506;
                  Intrinsics.checkNotNullExpressionValue(var49, "getBlockState(...)");
                  var8.add(
                     new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        var14, var49
                     )
                  );
                  if (var2 == null) {
                     break;
                  }

                  if (var2 != null) {
                     continue;
                  }
               }

               var5 = (Iterable & List)var8;
               var6 = false;
               var7 = var5;
               var8 = new ArrayList();
               var9 = false;
               break;
            }

            var11 = var7.iterator();

            while (true) {
               if (var11.hasNext()) {
                  Object var29 = var11.next();
                  IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var33 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var29;
                  boolean var36 = false;
                  boolean var40 = this.i().contains(var33.a());
                  if (var2 == null) {
                     break;
                  }

                  label119: {
                     label142: {
                        if (var2 != null) {
                           if (var40) {
                              break label142;
                           }

                           var40 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .o(var33.b());
                        }

                        if (var2 == null) {
                           break label119;
                        }

                        if (var40) {
                           var40 = true;
                           break label119;
                        }
                     }

                     var40 = false;
                  }

                  if (!var40) {
                     continue;
                  }

                  var8.add(var29);
                  if (var2 != null) {
                     continue;
                  }
               }

               var5 = (Iterable & List)var8;
               var6 = false;
               var7 = var5;
               var8 = new ArrayList();
               boolean var41 = false;
               break;
            }

            var11 = var7.iterator();

            while (true) {
               if (var11.hasNext()) {
                  Object var30 = var11.next();
                  IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var34 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var30;
                  boolean var37 = false;
                  me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var16 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                     me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     var34.c(),
                     4.5,
                     null,
                     var4);
                  if (var2 == null) {
                     break;
                  }

                  label97: {
                     label144: {
                        me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var42 = var16;
                        if (var2 != null) {
                           if (var16.b()
                              != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              )
                            {
                              break label144;
                           }

                           var42 = var16;
                        }

                        var43 = Intrinsics.areEqual(var42.c(), var34.a());
                        if (var2 == null) {
                           break label97;
                        }

                        if (((Boolean)(var43))) {
                           var43 = true;
                           break label97;
                        }
                     }

                     var43 = false;
                  }

                  if (!((Boolean)var43)) {
                     continue;
                  }

                  var8.add(var30);
                  if (var2 != null) {
                     continue;
                  }
               }

               var5 = (Iterable & List)var8;
               var6 = false;
               break;
            }

            Object var8x = null; // PX-FIX var-split (reuse)
            label146: {
               var21 = var5.iterator();
               boolean var44 = ((me.octo.client.PXDyn)var21).hasNext();
               if (var2 != null) {
                  if (!var44) {
                     return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null;
                  }

                  var8x = ((me.octo.client.PXDyn)var21).next();
                  var10000 =((String)( var21));
                  if (var2 == null) {
                     break label146;
                  }

                  var44 = ((me.octo.client.PXDyn)var21).hasNext();
               }

               if (!var44) {
                  return ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var8x));
               }

               var10000 = (String)(Object)var8x;
            }

            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var23 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
            boolean var27 = false;
            double var24 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var1, var23.c());

            while (true) {
               Object var28 = ((me.octo.client.PXDyn)var21).next();
               IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var31 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var28;
               boolean var35 = false;
               double var32 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var1, var31.c());
               if (Double.compare(var24, var32) > 0) {
                  var8x = var28;
                  var24 = var32;
               }

               while (!(Boolean)((me.octo.client.PXDyn)var21).hasNext()) {
                  if (var2 != null) {
                     return ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var8x));
                  }

                  var24 = var32;
               }
            }
         }
      }

      return null;
   }

   @Override
   public void u() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         if (!me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j()) {
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = this.k();
            if (var1 != null) {
               if (var2 != null) {
                  Vec3 var3 = this.b(var2);
                  Vec3 var10000 = var3;
                  if (var1 != null) {
                     if (var3 == null) {
                        lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl var10 = this;
                        if (var1 != null) {
                           if (((java.util.function.Supplier<Boolean>)(() -> { this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.a(1500); return false; })).get()) {
                              this.X();
                           }

                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .p();
                           this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
                           var10 = this;
                        }

                        var10.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
                        return;
                     }

                     var10000 = this.l();
                  }

                  label103: {
                     label102: {
                        Vec3 var4 = var10000;
                        if (var1 != null) {
                           if (var4 == null) {
                              break label102;
                           }

                           IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(this, null, var4);
                        }

                        if (var1 != null) {
                           break label103;
                        }
                     }

                     IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(this, var3, null);
                  }

                  lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6;
                  lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7;
                  boolean var10001;
                  Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
                  Vec3 var10003 = var5.add(0.0, this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll, 0.0);
                  short var10005 = 26820;
                  short var10006 = 18424;
                  Intrinsics.checkNotNullExpressionValue(var10003, "add(...)");
                  var6 = this.a(var2, var3, var10003);
                  var10003 = var5.add(0.0, this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI, 0.0);
                  var10005 = 26820;
                  var10006 = 18424;
                  Intrinsics.checkNotNullExpressionValue(var10003, "add(...)");
                  var7 = this.a(var2, var3, var10003);
                  var10001 = var6.c();
                  label94:
                  if (var1 != null) {
                     if (!var10001) {
                        var10001 = var7.c();
                        if (var1 == null) {
                           break label94;
                        }

                        if (!var10001) {
                           var10001 =( 0 != 0);
                           break label94;
                        }
                     }

                     var10001 =( 1 != 0);
                  }

                  this.f((boolean)var10001);
                  int var8 = ((var6.c()) ? 1 : 0);
                  if (var1 != null) {
                     if (var8 != 0) {
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .p();
                        var10001 =( 26846 != 0);
                        short var10002 = 15467;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("sneak", false);
                        this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.f();
                        this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
                        if (var1 != null) {
                           if (var6.a()) {
                              return;
                           }

                           this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
                        }

                        if (var1 != null) {
                           return;
                        }
                     }

                     var8 = ((var7.c()) ? 1 : 0);
                  }

                  label75: {
                     if (var1 != null) {
                        if (var8 == 0) {
                           break label75;
                        }

                        double var18;
                        var8 = (var18 = var7.b() - var6.b()) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
                     }

                     if (var8 < 0) {
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .p();
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var9 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        var10001 =( 26822 != 0);
                        short var13 = 14546;
                        boolean var14 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .P();
                        if (var1 != null) {
                           var14 = !var14;
                        }

                        var9.a("sneak", var14);
                        this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.f();
                        this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
                        if (var1 != null) {
                           if (var7.a()) {
                              return;
                           }

                           this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
                        }

                        if (var1 != null) {
                           return;
                        }
                     }
                  }

                  this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = true;
                  this.a(var2, var6, var7);
                  return;
               }

               this.W();
            }

            return;
         }

         this.i(false);
      }
   }

   private final Vec3 b(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl var10000 = this;
      if (var2 != null) {
         if (!Intrinsics.areEqual(this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII, var1.a())) {
            this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
            this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = var1.a();
         }

         var10000 = this;
      }

      Vec3 var4 = var10000.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
      if (var2 != null) {
         if (var10000.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll != null) {
            if (var2 == null) {
               return this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
            }

            if (this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII) {
               return this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
            }
         }

         var4 = var1.d();
      }

      Vec3 var3 = var4;
      Vec3 var6 = var3;
      if (var2 != null) {
         if (var3 != null) {
            this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = var3;
         }

         var6 = this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
      }

      return var6;
   }

   private final lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      Vec3 var2,
      Vec3 var3
   ) {
      Object var18 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      AABB var5 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .f(var1.a());
      String var4 = var10000;
      List var6 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var5, var3);
      double var7 = Double.MAX_VALUE;
      boolean var9 = false;
      Iterator var10 = var6.iterator();

      while (true) {
         if (var10.hasNext()) {
            Vec3 var11 = (Vec3)var10.next();
            me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var12 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
               me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var11,
               this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll,
               null,
               var3);
            var18 = Intrinsics.areEqual(var12.c(), var1.a());
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               if (!((Boolean)var18)) {
                  continue;
               }

               var18 = true;
            }

            var9 =((Boolean)( var18));
            double var13 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var3, var11);
            double var19 = var13;
            if (var4 != null) {
               if (!(var13 < var7)) {
                  continue;
               }

               var19 = var13;
            }

            var7 = var19;
            if (var4 != null) {
               continue;
            }
         }

         var18 = var9;
         break;
      }

      if (!((Boolean)var18)) {
         double var16 = RangesKt.coerceIn(var3.x, var5.minX, var5.maxX);
         double var17 = RangesKt.coerceIn(var3.y, var5.minY, var5.maxY);
         double var14 = RangesKt.coerceIn(var3.z, var5.minZ, var5.maxZ);
         var7 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var3, new Vec3(var16, var17, var14));
      }

      return new lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var9, var7
      );
   }

   private final Vec3 j(Vec3 var1) {
      Object var17 = null; // PX-FIX
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            BlockPos var15 = BlockPos.containing(var1);
            short var19 = 26847;
            short var22 = 2638;
            Intrinsics.checkNotNullExpressionValue(var15, "containing(...)");
            BlockPos var4 = var15;
            BlockPos[] var6 = new BlockPos[]{
               var4.offset(1, 0, 0),
               var4.offset(-1, 0, 0),
               var4.offset(0, 0, 1),
               var4.offset(0, 0, -1),
               var4.offset(1, 0, 1),
               var4.offset(1, 0, -1),
               var4.offset(-1, 0, 1),
               var4.offset(-1, 0, -1)
            };
            List var5 = CollectionsKt.listOf(var6);
            int var13 = 0;
            double var7 = 0.0;
            double var9 = 0.0;
            Iterator var11 = var5.iterator();

            while (true) {
               if (var11.hasNext()) {
                  var10000 = (ClientLevel)var11.next();
                  var19 = 26823;
                  var22 = -24928;
                  Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                  BlockPos var12 = (BlockPos)(Object)var10000;
                  if (var2 != null) {
                     var17 = var3.getBlockState(var12.offset(0, -1, 0)).isAir();
                     if (var2 == null) {
                        break;
                     }

                     if (((Boolean)(var17))) {
                        continue;
                     }

                     var13++;
                     var7 += (var4.getX() - var12.getX()) * 0.2;
                     var9 += (var4.getZ() - var12.getZ()) * 0.2;
                  }

                  if (var2 != null) {
                     continue;
                  }
               }

               var17 = var13;
               break;
            }

            Vec3 var18;
            if ((((((Boolean)(Object)((Boolean)var17 ? 1 : 0)))) ? 1 : 0)  >= 3) {
               var18 = new Vec3(var7, 0.0, var9);
            } else {
               var18 = Vec3.ZERO;
               var19 = 26821;
               var22 = -30300;
               Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
            }

            return var18;
         }
      }

      Vec3 var14 = Vec3.ZERO;
      short var10002 = 26844;
      short var10003 = 15747;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return var14;
   }

   private final void a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2,
      lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3
   ) {
      Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      List var6 = this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
      String var4 = var10000;
      if (var4 != null) {
         label35:
         if (var6 != null) {
            int var9 = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
            if (var4 != null) {
               if (this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI > CollectionsKt.getLastIndex(var6)) {
                  break label35;
               }

               var9 = ((me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a((Vec3)var6.get(this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI), var5, 0.2)) ? 1 : 0);
            }

            if (var4 != null) {
               if (var9 != 0) {
                  int var7 = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI++;
               }

               var9 = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
            }

            label51: {
               label66: {
                  label62: {
                     if (var4 != null) {
                        if (var9 > CollectionsKt.getLastIndex(var6)) {
                           break label66;
                        }

                        if (var4 == null) {
                           break label62;
                        }

                        var9 = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
                     }

                     if (var9 > 0) {
                        var6.get(this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI - 1);
                     }
                  }

                  Vec3 var8 = this.j(var5);
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  Vec3 var10001 = var5.add(var8);
                  short var10003 = 26820;
                  short var10004 = 18424;
                  Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                     var10,
                     var10001,
                     (Vec3)var6.get(this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI),
                     true,
                     0.0);
                  short var11 = 26822;
                  short var10002 = 14546;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sneak", true);
                  short var12 = 26835;
                  var10002 = 26493;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(
                        "jump",
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .j()
                     );
                  if (var4 != null) {
                     break label51;
                  }
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  var5,
                  this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll,
                  true,
                  0.0);
               short var13 = 26822;
               short var16 = 14546;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sneak", true);
            }

            this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.f();
            if (var4 != null) {
               return;
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
      }

      short var14 = 26822;
      short var17 = 14546;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("sneak", true);
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void b(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 26834;
      short var10003 = -7561;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      if (this.b()) {
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var3 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
               .o()
         );
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var4 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
               .o()
         );
         llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var5 = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl
               .o()
         );
         List var6 = this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
         if (var6 != null) {
            double var7 = 0.1;
            int var9 = 0;
            int var10 = CollectionsKt.getLastIndex(var6);

            while (var9 < var10) {
               Vec3 var11 = (Vec3)var6.get(var9);
               IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                  new AABB(var11.x - var7, var11.y - var7, var11.z - var7, var11.x + var7, var11.y + var7, var11.z + var7),
                  null,
                  var3,
                  1.5F,
                  null,
                  null,
                  0.0F,
                  false,
                  0.0F);
               var9++;
               if (var2 == null) {
                  return;
               }

               if (var2 == null) {
                  break;
               }
            }

            if (this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI <= CollectionsKt.getLastIndex(var6)) {
               double var13 = 0.15;
               Vec3 var14 = (Vec3)var6.get(this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI);
               IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
                  new AABB(var14.x - var13, var14.y - var13, var14.z - var13, var14.x + var13, var14.y + var13, var14.z + var13),
                  null,
                  var4,
                  1.5F,
                  null,
                  null,
                  0.0F,
                  false,
                  0.0F);
            }
         }

         double var12 = 0.2;
         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
            new AABB(
               this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.x - var12,
               this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.y - var12,
               this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.z - var12,
               this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.x + var12,
               this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.y + var12,
               this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.z + var12
            ),
            null,
            var5,
            1.5F,
            null,
            null,
            0.0F,
            false,
            0.0F);
      }
   }

   private final void W() {
      label18: {
         String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Vec3 var2 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(this.h());
         String var1 = var10000;
         double var4;
         int var3 = (
                  var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var2, false)
                     - 1.0
               )
               == 0.0
            ? 0
            : (var4 < 0.0 ? -1 : 1);
         if (var1 != null) {
            if (var3 <= 0) {
               break label18;
            }

            var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
               me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(),
               var2,
               null,
               0,
               false,
               0.0,
               false,
               false,
               0.0);
         }

         if (var3 != 0) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var2,
               false);
            if (var1 != null) {
               return;
            }
         }
      }

      this.i(false);
   }

   private final void X() {
      ArrayList var10000 = this.i();
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10001 = this.k();
      Intrinsics.checkNotNull(var10001);
      var10000.add(var10001.a());
      this.a((lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI)null);;
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
      this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.f();
   }

   @Nullable
   @Override
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI E() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = this.Y();
         if (var10000 != null) {
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = var10000;
            double var3;
            int var10001 = (
                     var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(var2.c(), true)
                        - 5.0
                  )
                  == 0.0
               ? 0
               : (var3 < 0.0 ? -1 : 1);
            if (var1 != null) {
               var10001 = var10001 > 0 ? 1 : 0;
            }

            this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = (var10001 != 0);
            return var2;
         }
      }

      return null;
   }

   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI Y() {
      String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var1 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            boolean var3 = this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.isEmpty();
            if (var1 != null) {
               var3 = !var3;
            }

            if (var3) {
               return this.a(var2);
            }

            return this.b(var2);
         }
      }

      return null;
   }

   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      Level var1
   ) {
      Object var22 = null; // PX-FIX
      Object var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Object var3 = null;
      String var2 = (String)var10000;

      label57:
      while (
         this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
            < this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.size()
      ) {
         var10000 = this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII
            .get(this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII);
         short var10002 = 26836;
         short var10003 = 1624;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");

         do {
            BlockPos var4 = (BlockPos)(Object)var10000;
            BlockState var21 = var1.getBlockState(var4);
            var10002 = 26845;
            var10003 = -22506;
            Intrinsics.checkNotNullExpressionValue(var21, "getBlockState(...)");
            BlockState var5 = var21;
            int var6 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII++;
            if (!me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .o(var5)) {
               continue label57;
            }

            var10000 = new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var4, var5
            );
         } while (var2 == null);

         var3 = var10000;
         break;
      }

      if (var3 == null) {
         return null;
      } else {
         ArrayList var18 = this.e(
            ((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3).a()
         );
         if (var18.isEmpty()) {
            return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3;
         } else {
            ArrayList var24;
            label43: {
               Pair var19 = this.e(var18);
               this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = (Vec3)var19.getSecond();
               var22 = this;
               if (var2 != null) {
                  List var10001 = ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null).a(
                     me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     ((BlockPos)(var19.getFirst())),
                     false);
                  if (var10001 != null) {
                     Iterable var7 = var10001;
                     boolean var8 = false;
                     var var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, 10));
                     boolean var11 = false;

                     for (Object var13 : var7) {
                        me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var14 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var13;
                        boolean var15 = false;
                        var10.add(var14.b());
                        if (var2 == null) {
                           return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3;
                        }

                        if (var2 == null) {
                           break;
                        }
                     }

                     List var23 = var10;
                     var22 = this;
                     var24 = (ArrayList)CollectionsKt.toCollection(var23, new ArrayList());
                     if (var2 != null) {
                        break label43;
                     }
                  }
               }

               var24 = null;
            }

            this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = var24;
            this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = 1;
            return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var3;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI b(
      Level var1
   ) {
      Object var99 = null; // PX-FIX
      Object var87 = null; // PX-FIX
      Object var85 = null; // PX-FIX
      Object var84 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      Object var101 = null; // PX-FIX
      int var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t()
         .getY();
      Iterable var5 = this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      boolean var6 = false;
      Iterable var7 = var5;
      String var2 = var10000;
      var var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, 10));
      boolean var9 = false;
      Iterator var10 = var5.iterator();

      while (true) {
         if (var10.hasNext()) {
            Object var11 = var10.next();
            BlockPos var12 = (BlockPos)var11;
            boolean var13 = false;
            BlockState var10003 = var1.getBlockState(var12);
            short var10005 = 26845;
            short var10006 = -22506;
            Intrinsics.checkNotNullExpressionValue(var10003, "getBlockState(...)");
            var8.add(
               new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  var12, var10003
               )
            );
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         var5 = var8;
         var6 = false;
         var7 = var5;
         var8 = new ArrayList();
         var9 = false;
         break;
      }

      var10 = var7.iterator();

      while (true) {
         if (var10.hasNext()) {
            Object var49 = var10.next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var56 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var49;
            boolean var60 = false;
            var84 = this.i();
            if (var2 == null) {
               break;
            }

            label230: {
               label249: {
                  var85 = ((me.octo.client.PXDyn)var84).contains(var56.a());
                  if (var2 != null) {
                     if (((Boolean)(var85))) {
                        break label249;
                     }

                     var85 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .o(var56.b());
                  }

                  if (var2 == null) {
                     break label230;
                  }

                  if (((Boolean)(var85))) {
                     var85 = true;
                     break label230;
                  }
               }

               var85 = false;
            }

            if (!((Boolean)var85)) {
               continue;
            }

            var8.add(var49);
            if (var2 != null) {
               continue;
            }
         }

         var84 = var8;
         break;
      }

      Object var4 = var84;
      Iterable var30 = (Iterable)var4;
      boolean var32 = false;
      var var40 = new ArrayList();
      boolean var45 = false;

      for (Object var57 : var30) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var61 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var57;
         boolean var15 = false;
         boolean var86 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(
            me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            var61.a(),
             false,
             2,
             null);
         if (var2 != null) {
            if (!var86) {
               continue;
            }

            var40.add(var57);
         }

         if (var2 == null) {
            break;
         }
      }

      List var28 = var40;
      HashMap var31 = new HashMap();
      Iterator var33 = var28.iterator();

      while (true) {
         if (var33.hasNext()) {
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var36 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var33.next();
            var87 = this;
            if (var2 == null) {
               break;
            }

            ArrayList var41 = this.e(var36.a());
            boolean var88 = var41.isEmpty();
            if (var2 != null) {
               var88 = !var88;
            }

            if (!var88) {
               continue;
            }

            var31.put(var36, var41);
            if (var2 != null) {
               continue;
            }
         }

         var87 = this;
         break;
      }

      Set var10001 = var31.keySet();
      short var103 = 26837;
      short var10004 = 8995;
      Intrinsics.checkNotNullExpressionValue(var10001, "<get-keys>(...)");
      var7 = var10001;
      lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl var25 =((lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl)( var87));
      boolean var37 = false;
      Iterable var42 = var7;
      var var46 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, 10));
      boolean var51 = false;
      Object var58 = var7.iterator();

      while (true) {
         if (((me.octo.client.PXDyn)var58).hasNext()) {
            Object var62 = ((me.octo.client.PXDyn)var58).next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var66 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var62;
            boolean var16 = false;
            var46.add(var66.a());
            if (var2 == null) {
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         var25.a(var46);
         break;
      }

      int var89 = var31.keySet().size();
      if (var2 != null) {
         if (var89 < 5) {
            return null;
         }

         Set var90 = var31.keySet();
         short var10002 = 26839;
         var103 = 26038;
         Intrinsics.checkNotNullExpressionValue(var90, "<get-keys>(...)");
         var42 = var90;
         boolean var91 = false;
      }

      label252: {
         label253: {
            var52 = var42.iterator();
            boolean var92 = ((me.octo.client.PXDyn)var52).hasNext();
            if (var2 != null) {
               if (!var92) {
                  var10000 = null;
                  break label252;
               }

               var58 = ((me.octo.client.PXDyn)var52).next();
               var10000 =((String)( var52));
               if (var2 == null) {
                  break label253;
               }

               var92 = ((me.octo.client.PXDyn)var52).hasNext();
            }

            if (!var92) {
               var10000 = (String)var58;
               break label252;
            }

            var10000 = (String)var58;
         }

         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var63 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
         boolean var67 = false;
         Intrinsics.checkNotNull(var63);
         double var64 = this.c(var63);

         label168:
         while (true) {
            Object var68 = ((me.octo.client.PXDyn)var52).next();
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var72 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var68;
            boolean var18 = false;
            Intrinsics.checkNotNull(var72);
            double var73 = this.c(var72);
            if (Double.compare(var64, var73) > 0) {
               var58 = var68;
               var64 = var73;
            }

            while (!(Boolean)((me.octo.client.PXDyn)var52).hasNext()) {
               if (var2 != null) {
                  var10000 = (String)var58;
                  break label168;
               }

               var64 = var73;
            }
         }
      }

      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var95 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000;
      if ((IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)(Object)var10000
         == null) {
         return null;
      } else {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var35 = var95;
         if (var2 != null) {
            ArrayList var96 = (ArrayList)var31.get(var35);
            if (var96 != null) {
               var8 = var96;
               Iterable var47 = var8;
               var51 = false;
               var var65 = new ArrayList();
               boolean var69 = false;

               for (Object var77 : var47) {
                  Pair var19 = (Pair)var77;
                  boolean var20 = false;
                  int var97 = Math.abs(((BlockPos)var19.getFirst()).getY() - var3);
                  if (var2 != null) {
                     var97 = var97 <= 0 ? 1 : 0;
                  }

                  if (var97 != 0) {
                     var65.add(var77);
                     if (var2 == null) {
                        break;
                     }
                  }
               }

               List var43 = var65;
               boolean var98 = var43.isEmpty();
               if (var2 != null) {
                  var98 = !var98;
               }

               List var48 = var98 ? var43 : var8;
               Iterable var54 = var48;
               boolean var59 = false;
               var var70 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var54, 10));
               boolean var75 = false;
               Iterator var78 = var54.iterator();

               while (true) {
                  if (var78.hasNext()) {
                     Object var79 = var78.next();
                     Pair var81 = (Pair)var79;
                     boolean var21 = false;
                     var70.add((Vec3)var81.getSecond());
                     if (var2 == null) {
                        break;
                     }

                     if (var2 != null) {
                        continue;
                     }
                  }

                  this.b((java.util.List<? extends Vec3>)var70);
                  break;
               }

               label130: {
                  Pair var55 = this.e(var48);
                  this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = (Vec3)var55.getSecond();
                  var99 = this;
                  if (var2 != null) {
                     List var100 = ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null).a(
                        me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        ((BlockPos)(var55.getFirst())),
                        false);
                     if (var100 != null) {
                        Iterable var71 = var100;
                        var75 = false;
                        var var80 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var71, 10));
                        boolean var82 = false;

                        for (Object var22 : var71) {
                           me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var23 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var22;
                           boolean var24 = false;
                           var80.add(var23.b());
                           if (var2 == null) {
                              return var35;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        List var102 = var80;
                        var99 = this;
                        var101 = (ArrayList)CollectionsKt.toCollection(var102, new ArrayList());
                        break label130;
                     }
                  }

                  var101 = null;
               }

               ((me.octo.client.PXDyn)var99).llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = var101;
               this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = 1;
               return var35;
            }
         }

         return null;
      }
   }

   private final ArrayList<Pair<BlockPos, Vec3>> e(BlockPos var1) {
      Object var34 = null; // PX-FIX
      boolean var31 = false; // PX-FIX
      Object var30 = null; // PX-FIX
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            ArrayList var4 = new ArrayList();
            int var5 = -2;

            label127:
            while (true) {
               int var22 = var5;

               label125:
               while (var22 < 3) {
                  int var6 = -2;

                  label122:
                  while (true) {
                     int var23 = var6;

                     label120:
                     while (true) {
                        if (var23 >= 3) {
                           break label122;
                        }

                        var22 = -2;
                        if (var2 == null) {
                           continue label125;
                        }

                        int var7 = -2;

                        while (var7 < 3) {
                           BlockPos var24 = var1.offset(var5, var6, var7);
                           short var10002 = 26843;
                           short var10003 = 27833;
                           Intrinsics.checkNotNullExpressionValue(var24, "offset(...)");
                           BlockPos var8 = var24;
                           BlockState var25 = var3.getBlockState(var8);
                           var10002 = 26845;
                           var10003 = -22506;
                           Intrinsics.checkNotNullExpressionValue(var25, "getBlockState(...)");
                           BlockState var9 = var25;
                           BlockState var26 = var3.getBlockState(var8.offset(0, 1, 0));
                           var10002 = 26845;
                           var10003 = -22506;
                           Intrinsics.checkNotNullExpressionValue(var26, "getBlockState(...)");
                           BlockState var10 = var26;
                           BlockState var27 = var3.getBlockState(var8.offset(0, 2, 0));
                           var10002 = 26845;
                           var10003 = -22506;
                           Intrinsics.checkNotNullExpressionValue(var27, "getBlockState(...)");
                           BlockState var11 = var27;
                           label114:
                           if (var2 != null) {
                              var23 = ((var9.isAir()) ? 1 : 0);
                              if (var2 == null) {
                                 continue label120;
                              }

                              label111:
                              if (var23 == 0) {
                                 boolean var28 = var10.isAir();
                                 if (var2 != null) {
                                    if (!var28) {
                                       break label111;
                                    }

                                    var28 = var11.isAir();
                                 }

                                 if (var28) {
                                    Vec3 var12;
                                    label140: {
                                       Vec3 var29 = new Vec3(var8.getX() + 0.5, var8.getY() + 1.0, var8.getZ() + 0.5).add(this.g());
                                       var10002 = 26820;
                                       var10003 = 18424;
                                       Intrinsics.checkNotNullExpressionValue(var29, "add(...)");
                                       var12 = var29;
                                       AABB var13 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .f(var1);
                                       var var15 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                          .a(var13, var12);
                                       boolean var16 = false;
                                       var30 = var15;
                                       label102:
                                       if (var2 != null) {
                                          if (var15 instanceof Collection) {
                                             var30 = (Collection)var15;
                                             if (var2 == null) {
                                                break label102;
                                             }

                                             if (((me.octo.client.PXDyn)var30).isEmpty()) {
                                                var31 = false;
                                                break label140;
                                             }
                                          }

                                          var30 = var15;
                                       }

                                       Iterator var17 = ((me.octo.client.PXDyn)var30).iterator();

                                       label95:
                                       while (true) {
                                          if (!var17.hasNext()) {
                                             var31 = false;
                                             break;
                                          }

                                          Object var18 = var17.next();
                                          Vec3 var19 = (Vec3)var18;
                                          boolean var32 = false;

                                          while (true) {
                                             label91: {
                                                label143: {
                                                   BlockPos var21 = ((me.octo.client.PXDyn)(Object)(me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                                                         me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                                         var19,
                                                         4.5,
                                                         null,
                                                         var12)
                                                      )).c();
                                                   BlockPos var33 = var21;
                                                   if (var2 != null) {
                                                      if (var21 == null) {
                                                         break label143;
                                                      }

                                                      var33 = var21;
                                                   }

                                                   var34 = Intrinsics.areEqual(var33, var1);
                                                   if (var2 == null) {
                                                      break label91;
                                                   }

                                                   if (((Boolean)(var34))) {
                                                      var34 = true;
                                                      break label91;
                                                   }
                                                }

                                                var34 = false;
                                             }

                                             if (!((Boolean)var34)) {
                                                break;
                                             }

                                             var31 = true;
                                             if (var2 != null) {
                                                break label95;
                                             }
                                          }
                                       }
                                    }

                                    boolean var14 = var31;
                                    if (var2 == null) {
                                       break label114;
                                    }

                                    if (var14) {
                                       var4.add(TuplesKt.to(var8, var12));
                                    }
                                 }
                              }

                              var7++;
                           }

                           if (var2 == null) {
                              break;
                           }
                        }

                        var6++;
                        if (var2 == null) {
                           break label122;
                        }
                        break;
                     }
                  }

                  var5++;
                  if (var2 == null) {
                     return var4;
                  }
                  continue label127;
               }

               return var4;
            }
         }
      }

      return new ArrayList<>();
   }

   private final Pair<BlockPos, Vec3> e(List<? extends Pair<? extends BlockPos, ? extends Vec3>> var1) {
      Object var27 = null; // PX-FIX
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      String var2 = var10000;
      int var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t()
         .getY();
      List var5 = this.a(6.0, 3);
      Iterable var7 = var1;
      boolean var8 = false;
      List var6 = CollectionsKt.take(
         CollectionsKt.sortedWith(
            var7,
            new lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var4, var3, var5
            )
         ),
         3
      );
      var10000 = ((String)(Object)(me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI));
      if (var2 != null) {
         if (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .k()) {
            label76: {
               Iterable var18 = var6;
               boolean var9 = false;
               Iterator var10 = var18.iterator();
               var10000 = ((String)(Object)(var10));
               if (var2 != null) {
                  if (!var10.hasNext()) {
                     var10000 = null;
                     break label76;
                  }

                  var10000 = (String)var10.next();
               }

               Object var11 = var10000;
               var10000 = ((String)(Object)(var10));
               if (var2 != null) {
                  if (!var10.hasNext()) {
                     var10000 = (String)var11;
                     break label76;
                  }

                  var10000 = (String)var11;
               }

               label64: {
                  Pair var12 = (Pair)(Object)var10000;
                  boolean var14 = false;
                  if (var2 != null) {
                     List var26 = ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null).a(
                        me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        ((BlockPos)(var12.getFirst())),
                        false);
                     if (var26 != null) {
                        var27 = var26.size();
                        break label64;
                     }
                  }

                  var27 = 999.0;
               }

               double var19 =((Double)( var27));

               label58:
               while (true) {
                  Object var20 = var10.next();
                  Pair var15 = (Pair)var20;
                  boolean var17 = false;
                  List var28 = ((me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null).a(
                     me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     ((BlockPos)(var15.getFirst())),
                     false);
                  double var21 = var28 != null ? var28.size() : 999.0;

                  do {
                     int var29 = Double.compare(var19, var21);
                     if (var2 != null) {
                        if (var29 > 0) {
                           var11 = var20;
                           var19 = var21;
                        }

                        var29 = ((var10.hasNext()) ? 1 : 0);
                     }

                     if (var29 != 0) {
                        continue label58;
                     }
                  } while (var2 == null);

                  var10000 = (String)var11;
                  break;
               }
            }

            Pair var23 = (Pair)(Object)var10000;
            if (var2 != null && (Pair)(Object)var10000 == null) {
               var23 = (Pair)CollectionsKt.first(var6);
            }

            return var23;
         }

         var10000 = (String)CollectionsKt.first(var6);
      }

      return ((Pair<BlockPos,Vec3>)(Object)((Pair<BlockPos, Vec3>)(Object)var10000));
   }

   private final double c(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      int var25 = 0; // PX-FIX
      Object var24 = null; // PX-FIX
      String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      if (var2 != null) {
         me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         if (var10000 != null) {
            me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = var10000;
            Vec3 var4 = var1.c();
            Vec3 var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            int var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t()
               .getY();
            double var7 = 0.0;
            var7 += Math.abs(var1.a().getY() - var6) * 20.0;
            var7 += me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var5, var4)
               * 1.5;
            var7 += me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .d(var4)
               * 0.1;
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
            if (var3.k() > 100 && var9 != null) {
               double var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var9.c(), var4);
               if (var2 != null) {
                  if (var23 < 5.0) {
                     var7 += 20.0;
                  }

                  var23 = var7;
               }

               double var17;
               label74: {
                  Iterable var10;
                  var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(var1.a(), 1, 1, 1);
                  var17 = var23;
                  boolean var11 = false;
                  var24 = var10 instanceof Collection;
                  label62:
                  if (var2 != null) {
                     if (!((Boolean)var24)) {
                        var24 = ((Collection)var10).isEmpty();
                        if (var2 == null) {
                           break label62;
                        }

                        if (!((Boolean)var24)) {
                           var25 = 0;
                           break label74;
                        }
                     }

                     var24 = 0;
                  }

                  int var12 =((Integer)( var24));

                  for (Object var14 : var10) {
                     BlockPos var15 = (BlockPos)var14;
                     boolean var16 = false;
                     ClientLevel var26 = this.a().level;
                     Intrinsics.checkNotNull(var26);
                     var25 = ((var26.getBlockState(var15).is(Blocks.BEDROCK)) ? 1 : 0);
                     if (var2 == null) {
                        break label74;
                     }

                     label76: {
                        if (var2 != null) {
                           if (var25 == 0) {
                              continue;
                           }

                           var12++;
                           if (var2 == null) {
                              break label76;
                           }

                           var25 = var12;
                        }

                        if (var25 >= 0) {
                           continue;
                        }

                        CollectionsKt.throwCountOverflow();
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  var25 = var12;
               }

               int var19 = var25;
               var7 = var17 + var19 * 2.0;
            }

            return this.a(var4, var7, 30.0);
         }
      }

      return Double.MAX_VALUE;
   }

   private final List<BlockPos> f(List<? extends BlockPos> var1) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      HashSet var3 = new HashSet();
      Iterator var4 = var1.iterator();
      String var2 = var10000;

      label90:
      while (true) {
         byte var11 = ((byte)((var4.hasNext()) ? 1 : 0));

         label88:
         while (var11 != 0) {
            BlockPos var5 = (BlockPos)var4.next();
            var11 = -6;

            label86:
            while (true) {
               int var6 = var11;

               do {
                  int var12 = var6;

                  label81:
                  while (true) {
                     if (var12 >= 7) {
                        continue label90;
                     }

                     var11 = -6;
                     if (var2 == null) {
                        continue label86;
                     }

                     if (var2 == null) {
                        continue label88;
                     }

                     int var7 = -6;

                     while (true) {
                        int var13 = var7;

                        label76:
                        while (true) {
                           if (var13 >= 7) {
                              break label81;
                           }

                           var12 = -6;
                           if (var2 == null) {
                              continue label81;
                           }

                           int var8 = -6;

                           while (true) {
                              if (var8 >= 7) {
                                 break label76;
                              }

                              BlockPos var14 = var5.offset(var7, var6, var8);
                              short var10002 = 26832;
                              short var10003 = -19389;
                              Intrinsics.checkNotNullExpressionValue(var14, "offset(...)");
                              BlockPos var9 = var14;
                              if (var2 != null) {
                                 var13 = ((var3.contains(var9)) ? 1 : 0);
                                 if (var2 == null) {
                                    break;
                                 }

                                 if (var13 == 0) {
                                    ClientLevel var15 = this.a().level;
                                    Intrinsics.checkNotNull(var15);
                                    BlockState var16 = var15.getBlockState(var9);
                                    var10002 = 26838;
                                    var10003 = -12384;
                                    Intrinsics.checkNotNullExpressionValue(var16, "getBlockState(...)");
                                    BlockState var10 = var16;
                                    if (var2 != null
                                       && (
                                          me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .o(var10)
                                             || var2 != null && var10.is(Blocks.BEDROCK)
                                       )) {
                                       var3.add(var9);
                                    }
                                 }

                                 var8++;
                              }

                              if (var2 == null) {
                                 break label76;
                              }
                           }
                        }

                        var7++;
                        if (var2 == null) {
                           break label81;
                        }
                     }
                  }

                  var6++;
               } while (var2 != null);

               return CollectionsKt.toList(var3);
            }
         }

         return CollectionsKt.toList(var3);
      }
   }

   @Override
   public void c(@NotNull BlockPos var1) {
      String var10000 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
      short var10002 = 26842;
      short var10003 = -22531;
      Intrinsics.checkNotNullParameter(var1, "pos");
      String var2 = var10000;
      boolean var15 = this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.isEmpty();
      if (var2 != null) {
         var15 = !var15;
      }

      label38: {
         if (var15) {
            this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = 0;
            if (var2 != null) {
               break label38;
            }
         }

         List var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(0.5, 10.0);
         Iterable var4 = var3;
         boolean var5 = false;
         var var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
         boolean var8 = false;

         label28: {
            for (Object var10 : var4) {
               BlockPos var11 = (BlockPos)var10;
               boolean var12 = false;
               var7.add(new Vec3(var11).add(0.5, 1.0, 0.5).add(this.g()));
               if (var2 == null) {
                  break label28;
               }

               if (var2 == null) {
                  break;
               }
            }

            this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = var7;
            this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = this.f(var3);
         }

         this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = null;
      }

      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
      this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = null;
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = null;
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = 0;
      super.c(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[20];
      int var3 = 0;
      String var2 = "¾ÌDfÙ§>\u009d·\u0096Ã°\u0081;ä\u0012Ån\nFbW&\u0015R\u009d\u0012\u0088\u0090+ã¬ôW\u000føÙ\u008cÄÀó\u001d\u0017ÓÇO\u009a\u0010~Ö\bw±\\×ê\u0003p´\u00041º!ü\u0005îj<\u009b\u008f\u0007¯ýfÖ\u009dåí\u000b=?\u000e>»T~H\u0006\u0081\u0002\u000f\u0011«\u000e\u0083¶\u0019\u001d\u0018¤m\u001f½\u001a\u009a\u0097\u0005qg\u001b.t\u0012ºPå\u0081\u009f¯\u0099\n¥~ìôO¤\u0018]\u008bi\u0004NaÇ\u008e\u000b,\u008a,\u0088ÿ\u0082ö\u0092\u0017Ú \u0003´\u000bÖ\u000b\u00909Ä\u009aY=æf2\u0014l\bÞ+¿¥\u0084M½}\t¿Àa¥Æ\u009a3\u0080n\u0005ô\t«ãb";
      int var4 = "¾ÌDfÙ§>\u009d·\u0096Ã°\u0081;ä\u0012Ån\nFbW&\u0015R\u009d\u0012\u0088\u0090+ã¬ôW\u000føÙ\u008cÄÀó\u001d\u0017ÓÇO\u009a\u0010~Ö\bw±\\×ê\u0003p´\u00041º!ü\u0005îj<\u009b\u008f\u0007¯ýfÖ\u009dåí\u000b=?\u000e>»T~H\u0006\u0081\u0002\u000f\u0011«\u000e\u0083¶\u0019\u001d\u0018¤m\u001f½\u001a\u009a\u0097\u0005qg\u001b.t\u0012ºPå\u0081\u009f¯\u0099\n¥~ìôO¤\u0018]\u008bi\u0004NaÇ\u008e\u000b,\u008a,\u0088ÿ\u0082ö\u0092\u0017Ú \u0003´\u000bÖ\u000b\u00909Ä\u009aY=æf2\u0014l\bÞ+¿¥\u0084M½}\t¿Àa¥Æ\u009a3\u0080n\u0005ô\t«ãb"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 24;
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
                     case 0 -> 64;
                     case 1 -> 58;
                     case 2 -> 94;
                     case 3 -> 92;
                     case 4 -> 101;
                     case 5 -> 106;
                     default -> 95;
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
                     d = new String[20];
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

                  var2 = "\u0088\u008a4Ø\bYwd\u0005Ôr\u009c±";
                  var4 = "\u0088\u008a4Ø\bYwd\u0005Ôr\u009c±".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 26839) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 198;
            case 1 -> 150;
            case 2 -> 227;
            case 3 -> 61;
            case 4 -> 45;
            case 5 -> 64;
            case 6 -> 27;
            case 7 -> 20;
            case 8 -> 24;
            case 9 -> 186;
            case 10 -> 22;
            case 11 -> 94;
            case 12 -> 4;
            case 13 -> 95;
            case 14 -> 116;
            case 15 -> 190;
            case 16 -> 173;
            case 17 -> 14;
            case 18 -> 240;
            case 19 -> 229;
            case 20 -> 195;
            case 21 -> 230;
            case 22 -> 55;
            case 23 -> 93;
            case 24 -> 90;
            case 25 -> 136;
            case 26 -> 156;
            case 27 -> 131;
            case 28 -> 149;
            case 29 -> 218;
            case 30 -> 207;
            case 31 -> 154;
            case 32 -> 222;
            case 33 -> 138;
            case 34 -> 165;
            case 35 -> 92;
            case 36 -> 21;
            case 37 -> 184;
            case 38 -> 91;
            case 39 -> 87;
            case 40 -> 82;
            case 41 -> 17;
            case 42 -> 85;
            case 43 -> 72;
            case 44 -> 81;
            case 45 -> 191;
            case 46 -> 106;
            case 47 -> 16;
            case 48 -> 76;
            case 49 -> 189;
            case 50 -> 193;
            case 51 -> 170;
            case 52 -> 188;
            case 53 -> 171;
            case 54 -> 59;
            case 55 -> 31;
            case 56 -> 56;
            case 57 -> 161;
            case 58 -> 52;
            case 59 -> 234;
            case 60 -> 118;
            case 61 -> 241;
            case 62 -> 182;
            case 63 -> 194;
            case 64 -> 113;
            case 65 -> 19;
            case 66 -> 213;
            case 67 -> 79;
            case 68 -> 34;
            case 69 -> 3;
            case 70 -> 252;
            case 71 -> 132;
            case 72 -> 221;
            case 73 -> 36;
            case 74 -> 69;
            case 75 -> 254;
            case 76 -> 162;
            case 77 -> 248;
            case 78 -> 215;
            case 79 -> 124;
            case 80 -> 28;
            case 81 -> 141;
            case 82 -> 137;
            case 83 -> 153;
            case 84 -> 239;
            case 85 -> 104;
            case 86 -> 86;
            case 87 -> 109;
            case 88 -> 50;
            case 89 -> 216;
            case 90 -> 127;
            case 91 -> 226;
            case 92 -> 128;
            case 93 -> 40;
            case 94 -> 176;
            case 95 -> 62;
            case 96 -> 105;
            case 97 -> 143;
            case 98 -> 175;
            case 99 -> 147;
            case 100 -> 142;
            case 101 -> 57;
            case 102 -> 88;
            case 103 -> 33;
            case 104 -> 51;
            case 105 -> 122;
            case 106 -> 231;
            case 107 -> 49;
            case 108 -> 140;
            case 109 -> 152;
            case 110 -> 183;
            case 111 -> 112;
            case 112 -> 107;
            case 113 -> 110;
            case 114 -> 255;
            case 115 -> 151;
            case 116 -> 158;
            case 117 -> 9;
            case 118 -> 68;
            case 119 -> 108;
            case 120 -> 196;
            case 121 -> 179;
            case 122 -> 206;
            case 123 -> 134;
            case 124 -> 77;
            case 125 -> 44;
            case 126 -> 197;
            case 127 -> 37;
            case 128 -> 157;
            case 129 -> 130;
            case 130 -> 217;
            case 131 -> 53;
            case 132 -> 202;
            case 133 -> 115;
            case 134 -> 58;
            case 135 -> 133;
            case 136 -> 46;
            case 137 -> 250;
            case 138 -> 54;
            case 139 -> 84;
            case 140 -> 169;
            case 141 -> 139;
            case 142 -> 204;
            case 143 -> 245;
            case 144 -> 67;
            case 145 -> 71;
            case 146 -> 47;
            case 147 -> 219;
            case 148 -> 212;
            case 149 -> 172;
            case 150 -> 120;
            case 151 -> 80;
            case 152 -> 168;
            case 153 -> 103;
            case 154 -> 200;
            case 155 -> 7;
            case 156 -> 119;
            case 157 -> 166;
            case 158 -> 203;
            case 159 -> 0;
            case 160 -> 135;
            case 161 -> 98;
            case 162 -> 63;
            case 163 -> 12;
            case 164 -> 5;
            case 165 -> 73;
            case 166 -> 180;
            case 167 -> 125;
            case 168 -> 6;
            case 169 -> 249;
            case 170 -> 244;
            case 171 -> 187;
            case 172 -> 243;
            case 173 -> 100;
            case 174 -> 160;
            case 175 -> 26;
            case 176 -> 83;
            case 177 -> 201;
            case 178 -> 121;
            case 179 -> 210;
            case 180 -> 211;
            case 181 -> 66;
            case 182 -> 164;
            case 183 -> 177;
            case 184 -> 178;
            case 185 -> 99;
            case 186 -> 89;
            case 187 -> 159;
            case 188 -> 144;
            case 189 -> 185;
            case 190 -> 1;
            case 191 -> 65;
            case 192 -> 126;
            case 193 -> 117;
            case 194 -> 235;
            case 195 -> 167;
            case 196 -> 13;
            case 197 -> 181;
            case 198 -> 11;
            case 199 -> 123;
            case 200 -> 32;
            case 201 -> 101;
            case 202 -> 246;
            case 203 -> 43;
            case 204 -> 238;
            case 205 -> 208;
            case 206 -> 209;
            case 207 -> 30;
            case 208 -> 174;
            case 209 -> 35;
            case 210 -> 146;
            case 211 -> 48;
            case 212 -> 2;
            case 213 -> 228;
            case 214 -> 214;
            case 215 -> 39;
            case 216 -> 163;
            case 217 -> 242;
            case 218 -> 25;
            case 219 -> 199;
            case 220 -> 223;
            case 221 -> 96;
            case 222 -> 155;
            case 223 -> 70;
            case 224 -> 74;
            case 225 -> 236;
            case 226 -> 145;
            case 227 -> 75;
            case 228 -> 41;
            case 229 -> 237;
            case 230 -> 220;
            case 231 -> 23;
            case 232 -> 205;
            case 233 -> 29;
            case 234 -> 232;
            case 235 -> 38;
            case 236 -> 97;
            case 237 -> 224;
            case 238 -> 148;
            case 239 -> 253;
            case 240 -> 18;
            case 241 -> 247;
            case 242 -> 42;
            case 243 -> 111;
            case 244 -> 10;
            case 245 -> 15;
            case 246 -> 60;
            case 247 -> 8;
            case 248 -> 129;
            case 249 -> 233;
            case 250 -> 102;
            case 251 -> 225;
            case 252 -> 251;
            case 253 -> 192;
            case 254 -> 78;
            default -> 114;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(boolean var1, double var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         String var1 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         int var10000 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         if (var1 != null) {
            if (!this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return (0 != 0);
            }

            double var2;
            var10000 = (var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - 4.5) == 0.0
               ? 0
               : (var2 < 0.0 ? -1 : 1);
         }

         if (var1 == null) {
            return (var10000 != 0);
         } else {
            return (var10000 <= 0);
         }
      }

      public final boolean d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         boolean var1, double var2
      ) {
         return new lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -21516;
         double var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 32004;
         short var10002 = -21515;
         short var10003 = 15649;
         return "StanceInfo(canSee=" + var3 + ", distanceToBlock=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllIIllIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "¥\u0015Ô½ûÇ\u009c+\u000e\u0091È\u009cãW\u0016·¦\u0089\u0012Ø\u001cîE\t.ø%ªZ\u0085¢\u009a\u001fBú\u0099æ";
         int var4 = "¥\u0015Ô½ûÇ\u009c+\u000e\u0091È\u009cãW\u0016·¦\u0089\u0012Ø\u001cîE\t.ø%ªZ\u0085¢\u009a\u001fBú\u0099æ".length();
         char var1 = 18;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 105;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 105;
                  var10006 = var6;
               } else {
                  var13 = 105;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 105;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 122;
                     case 1 -> 86;
                     case 2 -> 51;
                     case 3 -> 5;
                     case 4 -> 109;
                     case 5 -> 82;
                     default -> 76;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -21516) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 206;
               case 1 -> 108;
               case 2 -> 85;
               case 3 -> 190;
               case 4 -> 114;
               case 5 -> 72;
               case 6 -> 208;
               case 7 -> 109;
               case 8 -> 99;
               case 9 -> 147;
               case 10 -> 209;
               case 11 -> 21;
               case 12 -> 182;
               case 13 -> 189;
               case 14 -> 194;
               case 15 -> 4;
               case 16 -> 16;
               case 17 -> 8;
               case 18 -> 242;
               case 19 -> 249;
               case 20 -> 63;
               case 21 -> 118;
               case 22 -> 42;
               case 23 -> 0;
               case 24 -> 96;
               case 25 -> 12;
               case 26 -> 43;
               case 27 -> 164;
               case 28 -> 175;
               case 29 -> 226;
               case 30 -> 195;
               case 31 -> 88;
               case 32 -> 163;
               case 33 -> 241;
               case 34 -> 172;
               case 35 -> 15;
               case 36 -> 157;
               case 37 -> 197;
               case 38 -> 79;
               case 39 -> 80;
               case 40 -> 51;
               case 41 -> 202;
               case 42 -> 36;
               case 43 -> 196;
               case 44 -> 52;
               case 45 -> 131;
               case 46 -> 5;
               case 47 -> 134;
               case 48 -> 81;
               case 49 -> 243;
               case 50 -> 220;
               case 51 -> 204;
               case 52 -> 250;
               case 53 -> 95;
               case 54 -> 98;
               case 55 -> 143;
               case 56 -> 110;
               case 57 -> 53;
               case 58 -> 180;
               case 59 -> 19;
               case 60 -> 91;
               case 61 -> 153;
               case 62 -> 237;
               case 63 -> 57;
               case 64 -> 34;
               case 65 -> 219;
               case 66 -> 7;
               case 67 -> 1;
               case 68 -> 200;
               case 69 -> 159;
               case 70 -> 198;
               case 71 -> 225;
               case 72 -> 83;
               case 73 -> 64;
               case 74 -> 55;
               case 75 -> 74;
               case 76 -> 246;
               case 77 -> 213;
               case 78 -> 167;
               case 79 -> 229;
               case 80 -> 254;
               case 81 -> 192;
               case 82 -> 6;
               case 83 -> 117;
               case 84 -> 227;
               case 85 -> 251;
               case 86 -> 26;
               case 87 -> 152;
               case 88 -> 112;
               case 89 -> 38;
               case 90 -> 100;
               case 91 -> 212;
               case 92 -> 48;
               case 93 -> 3;
               case 94 -> 17;
               case 95 -> 130;
               case 96 -> 148;
               case 97 -> 32;
               case 98 -> 183;
               case 99 -> 23;
               case 100 -> 78;
               case 101 -> 73;
               case 102 -> 230;
               case 103 -> 92;
               case 104 -> 75;
               case 105 -> 211;
               case 106 -> 186;
               case 107 -> 71;
               case 108 -> 247;
               case 109 -> 214;
               case 110 -> 216;
               case 111 -> 135;
               case 112 -> 177;
               case 113 -> 22;
               case 114 -> 239;
               case 115 -> 39;
               case 116 -> 76;
               case 117 -> 37;
               case 118 -> 59;
               case 119 -> 139;
               case 120 -> 68;
               case 121 -> 101;
               case 122 -> 47;
               case 123 -> 103;
               case 124 -> 173;
               case 125 -> 155;
               case 126 -> 116;
               case 127 -> 9;
               case 128 -> 162;
               case 129 -> 221;
               case 130 -> 40;
               case 131 -> 29;
               case 132 -> 13;
               case 133 -> 132;
               case 134 -> 113;
               case 135 -> 2;
               case 136 -> 127;
               case 137 -> 222;
               case 138 -> 255;
               case 139 -> 215;
               case 140 -> 199;
               case 141 -> 145;
               case 142 -> 150;
               case 143 -> 218;
               case 144 -> 102;
               case 145 -> 128;
               case 146 -> 124;
               case 147 -> 50;
               case 148 -> 217;
               case 149 -> 54;
               case 150 -> 228;
               case 151 -> 161;
               case 152 -> 193;
               case 153 -> 28;
               case 154 -> 93;
               case 155 -> 106;
               case 156 -> 140;
               case 157 -> 248;
               case 158 -> 49;
               case 159 -> 210;
               case 160 -> 149;
               case 161 -> 234;
               case 162 -> 160;
               case 163 -> 232;
               case 164 -> 86;
               case 165 -> 236;
               case 166 -> 253;
               case 167 -> 87;
               case 168 -> 125;
               case 169 -> 187;
               case 170 -> 179;
               case 171 -> 129;
               case 172 -> 44;
               case 173 -> 33;
               case 174 -> 121;
               case 175 -> 191;
               case 176 -> 223;
               case 177 -> 123;
               case 178 -> 205;
               case 179 -> 165;
               case 180 -> 61;
               case 181 -> 97;
               case 182 -> 31;
               case 183 -> 235;
               case 184 -> 168;
               case 185 -> 45;
               case 186 -> 115;
               case 187 -> 62;
               case 188 -> 24;
               case 189 -> 233;
               case 190 -> 94;
               case 191 -> 203;
               case 192 -> 224;
               case 193 -> 244;
               case 194 -> 25;
               case 195 -> 120;
               case 196 -> 82;
               case 197 -> 142;
               case 198 -> 35;
               case 199 -> 10;
               case 200 -> 158;
               case 201 -> 144;
               case 202 -> 166;
               case 203 -> 58;
               case 204 -> 137;
               case 205 -> 111;
               case 206 -> 141;
               case 207 -> 185;
               case 208 -> 27;
               case 209 -> 104;
               case 210 -> 171;
               case 211 -> 46;
               case 212 -> 238;
               case 213 -> 11;
               case 214 -> 105;
               case 215 -> 119;
               case 216 -> 240;
               case 217 -> 154;
               case 218 -> 178;
               case 219 -> 252;
               case 220 -> 170;
               case 221 -> 174;
               case 222 -> 151;
               case 223 -> 89;
               case 224 -> 90;
               case 225 -> 60;
               case 226 -> 69;
               case 227 -> 20;
               case 228 -> 181;
               case 229 -> 176;
               case 230 -> 77;
               case 231 -> 138;
               case 232 -> 169;
               case 233 -> 156;
               case 234 -> 65;
               case 235 -> 41;
               case 236 -> 56;
               case 237 -> 136;
               case 238 -> 126;
               case 239 -> 184;
               case 240 -> 122;
               case 241 -> 70;
               case 242 -> 133;
               case 243 -> 146;
               case 244 -> 84;
               case 245 -> 66;
               case 246 -> 30;
               case 247 -> 188;
               case 248 -> 67;
               case 249 -> 207;
               case 250 -> 245;
               case 251 -> 107;
               case 252 -> 14;
               case 253 -> 18;
               case 254 -> 231;
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
   
    public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, boolean var1, double var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        return var0.a(var1, var2);
    }}
}
