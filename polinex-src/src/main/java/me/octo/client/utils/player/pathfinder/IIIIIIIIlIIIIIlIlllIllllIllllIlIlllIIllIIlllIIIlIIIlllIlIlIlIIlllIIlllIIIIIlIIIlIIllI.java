package me.octo.client.utils.player.pathfinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.level.block.state.BlockState;
import java.lang.invoke.LambdaMetafactory;
import java.util.Map;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   public static byte lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   public static byte IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   public static byte llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   public static byte lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   public static byte lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   public static byte lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   public static byte lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   public static byte IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   public static byte llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   public static byte IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   public static byte IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   public static byte IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   public static byte IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   public static byte llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   public static byte IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   public static byte lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private static HashMap<Byte, Double> llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private static List<IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private static HashMap<BlockPos, Byte> IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static HashMap<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private static HashSet<BlockPos> IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private static HashMap<BlockPos, Double> llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static HashMap<BlockPos, Double> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @NotNull
   private static HashMap<BlockPos, BlockPos> IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @NotNull
   private static BlockPos IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @Nullable
   private static BlockPos lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static String[] c;
   private static String[] d;

   private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI() {
   }

   private final ClientLevel g() {
      ClientLevel var10000 = this.a().level;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @Nullable
   public final ArrayList<Vec3> a(@NotNull BlockPos var1, @Nullable BlockPos var2) {
      short var10001 = -10007;
      short var10002 = -13058;
      Intrinsics.checkNotNullParameter(var1, "target");
      return this.a(var1, var2, false);
   }

   @Nullable
   public final ArrayList<Vec3> a(@NotNull BlockPos var1, boolean var2) {
      short var10001 = -10013;
      short var10002 = -31697;
      Intrinsics.checkNotNullParameter(var1, "target");
      return this.a(var1, null, var2);
   }

   @Nullable
   public final ArrayList<Vec3> a(@NotNull BlockPos param1, @Nullable BlockPos param2, boolean param3) {
      int var4 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Intrinsics.checkNotNullParameter(param1, "target");
      IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = param1;
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = param2;
      int var5 = 40;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid(
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getX() + var5,
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getX() - var5,
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getZ() + var5,
            IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getZ() - var5
         );
      this.h();
      if (var4 == 0) {
         return null;
      }

      BlockPos var6 = this.a(this.a().player);
      if (var6 == null) {
         return null;
      }

      Object var7o = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(var6);
      Intrinsics.checkNotNull(var7o);
      byte var7 = ((Number)var7o).byteValue();
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll varSize = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(0, 0, 0);
      Object var8o = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(Byte.valueOf(var7));
      Intrinsics.checkNotNull(var8o);
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var6, var7, varSize, ((Number)var8o).doubleValue());
      var8.b(this.c(var8.a()));
      var8.c(0.0);
      ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).put(var6, var8);

      while (!((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).isEmpty()) {
         Iterable<Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> var11 = ((Map)IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII).entrySet();
         Iterator<Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> var12 = var11.iterator();
         if (!var12.hasNext()) {
            throw new NoSuchElementException();
         }

         Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var13 = var12.next();
         if (var12.hasNext()) {
            Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var14 = var13;
            double var15 = var14.getValue().e();

            do {
               Map.Entry<BlockPos, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var16 = var12.next();
               double var17 = var16.getValue().e();
               if (Double.compare(var15, var17) > 0) {
                  var13 = var16;
                  var15 = var17;
               }
            } while (var12.hasNext());
         }

         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = var13.getValue();
         BlockPos var10 = var9.a();
         IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.remove(var10);
         IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.add(var10);
         if (var4 == 0) {
            break;
         }

         if (Intrinsics.areEqual(var10, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI)) {
            List<Vec3> var18 = this.b(var10);
            this.h();
            return this.a(var18, param3);
         }

         this.a(var9, new Function2<IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, Double, Unit>() {
            public Unit invoke(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI n, Double d) {
               return a(var9, var10, n, d);
            }
         });
      }

      this.h();
      return null;
   }

   private final double a(BlockPos param1) {
      java.lang.Double var3 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(param1);
      if (var3 != null) {
         return var3.doubleValue();
      }
      double var4 = 0.0;
      for (var var7 : lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll) {
         var var8 = param1.offset(var7.a(), var7.b(), var7.c());
         var var9 = this.g().getBlockState(var8);
         var var10 = var9.getShape((net.minecraft.world.level.BlockGetter) this.g(), var8);
         if (!var9.isAir() && !var10.isEmpty() && var10.bounds().maxY > 1.0) {
            continue;
         }
         var4 += 1.0;
      }
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(param1, var4);
      return var4;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k ()I
      // 003: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII Ljava/util/HashMap;
      // 006: aload 1
      // 007: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00a: checkcast java/lang/Double
      // 00d: astore 3
      // 00e: istore 2
      // 00f: aload 3
      // 010: iload 2
      // 011: ifeq 01f
      // 014: ifnull 023
      // 017: goto 01e
      // 01a: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01d: athrow
      // 01e: aload 3
      // 01f: invokevirtual java/lang/Double.doubleValue ()D
      // 022: dreturn
      // 023: dconst_0
      // 024: dstore 4
      // 026: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Ljava/util/List;
      // 029: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 02e: astore 6
      // 030: aload 6
      // 032: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 037: ifeq 102
      // 03a: aload 6
      // 03c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 041: checkcast me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 044: astore 7
      // 046: aload 1
      // 047: aload 7
      // 049: invokevirtual me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()I
      // 04c: aload 7
      // 04e: invokevirtual me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()I
      // 051: aload 7
      // 053: invokevirtual me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c ()I
      // 056: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 059: dup
      // 05a: sipush -10002
      // 05d: sipush -3929
      // 060: pop2
      // 061: ldc_w "offset(...)"
      // 064: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 067: astore 8
      // 069: aload 0
      // 06a: invokespecial me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.g ()Lnet/minecraft/client/multiplayer/ClientLevel;
      // 06d: aload 8
      // 06f: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 072: dup
      // 073: sipush -10008
      // 076: sipush -28378
      // 079: pop2
      // 07a: ldc_w "getBlockState(...)"
      // 07d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 080: astore 9
      // 082: aload 9
      // 084: aload 0
      // 085: invokespecial me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.g ()Lnet/minecraft/client/multiplayer/ClientLevel;
      // 088: checkcast net/minecraft/world/level/BlockGetter
      // 08b: aload 8
      // 08d: invokevirtual net/minecraft/world/level/block/state/BlockState.getShape (Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;
      // 090: dup
      // 091: sipush -10009
      // 094: sipush -29416
      // 097: pop2
      // 098: ldc_w "getShape(...)"
      // 09b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 09e: astore 10
      // 0a0: iload 2
      // 0a1: ifeq 0fe
      // 0a4: aload 9
      // 0a6: iload 2
      // 0a7: ifeq 113
      // 0aa: goto 0b1
      // 0ad: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b0: athrow
      // 0b1: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0b4: ifne 0f8
      // 0b7: goto 0be
      // 0ba: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0bd: athrow
      // 0be: aload 10
      // 0c0: invokevirtual net/minecraft/world/phys/shapes/VoxelShape.isEmpty ()Z
      // 0c3: iload 2
      // 0c4: ifeq 0e2
      // 0c7: goto 0ce
      // 0ca: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0cd: athrow
      // 0ce: ifne 030
      // 0d1: goto 0d8
      // 0d4: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0d7: athrow
      // 0d8: aload 10
      // 0da: invokevirtual net/minecraft/world/phys/shapes/VoxelShape.bounds ()Lnet/minecraft/world/phys/AABB;
      // 0dd: getfield net/minecraft/world/phys/AABB.maxY D
      // 0e0: dconst_1
      // 0e1: dcmpg
      // 0e2: iload 2
      // 0e3: ifeq 0f1
      // 0e6: ifne 0f4
      // 0e9: goto 0f0
      // 0ec: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0ef: athrow
      // 0f0: bipush 1
      // 0f1: goto 0f5
      // 0f4: bipush 0
      // 0f5: ifne 030
      // 0f8: dload 4
      // 0fa: dconst_1
      // 0fb: dadd
      // 0fc: dstore 4
      // 0fe: iload 2
      // 0ff: ifne 030
      // 102: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII Ljava/util/HashMap;
      // 105: checkcast java/util/Map
      // 108: aload 1
      // 109: dload 4
      // 10b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 10e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 113: pop
      // 114: dload 4
      // 116: dreturn
   }

   private final ArrayList<Vec3> a(List<? extends Vec3> param1, boolean param2) {
      int var3 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (param1.size() < 2) {
         return new ArrayList<Vec3>(param1);
      }

      ArrayList<Vec3> var4 = new ArrayList<Vec3>();
      if (param2) {
         var4.addAll(param1);
      } else {
         int var5 = 0;
         int var6 = param1.size() - 1;
         while (var5 < var6) {
            Vec3 var7 = var5 > 0 ? param1.get(var5 - 1) : param1.get(var5);
            Vec3 var8 = param1.get(var5);
            Vec3 var9 = param1.get(var5 + 1);
            Vec3 var10 = var5 + 2 < param1.size() ? param1.get(var5 + 2) : param1.get(var5 + 1);
            double var11 = var8.distanceTo(var9);
            int var13 = (int)(var11 / 0.1);
            for (int var14 = 0; var14 <= var13; var14++) {
               double var15 = (double)var14 / (double)kotlin.ranges.RangesKt.coerceAtLeast(var13, 1);
               var4.add(this.a(var7, var8, var9, var10, var15));
            }
            var5++;
         }
         var4.add(kotlin.collections.CollectionsKt.last(param1));
      }

      ArrayList<Vec3> var16 = new ArrayList<Vec3>();
      var16.add(kotlin.collections.CollectionsKt.first(var4));
      BlockPos var17 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
      Vec3 var18;
      if (var17 != null) {
         var18 = var17.getCenter();
      } else {
         var18 = Vec3.ZERO;
         Intrinsics.checkNotNullExpressionValue(var18, "ZERO");
      }

      int var19 = 0;
      while (var19 < kotlin.collections.CollectionsKt.getLastIndex(var4)) {
         Vec3 var20 = (Vec3)var4.get(var19);
         Intrinsics.checkNotNullExpressionValue(var20, "get(...)");
         int var21 = var19 + 1;
         int var22 = var19 + 1;
         while (var22 < var4.size()) {
            Vec3 var23 = (Vec3)var4.get(var22);
            Intrinsics.checkNotNullExpressionValue(var23, "get(...)");
            boolean var24;
            if (param2) {
               var24 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var20, var23, (Vec3)null, 0, false, 0.0, false, false, 0.2, 252, (Object)null)
                  && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var20, var23, (Vec3)null, 0, false, 0.0, false, false, -0.299, 252, (Object)null);
            } else {
               var24 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                     me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                     var20, var23, (Vec3)null, 0, false, 0.0, false, false, 0.0, 508, (Object)null);
            }

            if (var22 == kotlin.collections.CollectionsKt.getLastIndex(var4)) {
               if (var24) {
                  if (var17 == null) {
                     var21 = var22;
                  } else {
                     Vec3 var25 = (Vec3)var4.get(var22);
                     Intrinsics.checkNotNullExpressionValue(var25, "get(...)");
                     var var26 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var20, var25);
                     Vec3 var27 = Vec3.ZERO;
                     Intrinsics.checkNotNullExpressionValue(var27, "ZERO");
                     var var28 = new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var20, var27, var26.a(), var26.b(), true);
                     for (int var30 = 0; var30 <= 100; var30++) {
                        var28 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a(
                              me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                              1.0, 0.0, var28, false, 0.0, 24, (Object)null);
                        if (var28 == null) {
                           continue;
                        }

                        Vec3 var31 = var28.a().add(0.0, 1.26, 0.0);
                        Intrinsics.checkNotNullExpressionValue(var31, "add(...)");
                        var var32 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
                              var17, kotlin.collections.CollectionsKt.listOf(net.minecraft.client.player.RemotePlayer.class), var31);
                        if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var31, var18) < 16.0
                              && var32.b() == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                              && Intrinsics.areEqual(var32.c(), lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI)) {
                           var16.add(var28.a());
                           return var16;
                        }
                     }
                  }
               }
               break;
            }

            if (!var24) {
               break;
            }

            var21 = var22;
            var22++;
         }

         var16.add(var4.get(var21));
         var19 = var21;
      }

      return var16;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/player/pathfinder/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()I
      // 003: istore 3
      // 004: aload 1
      // 005: invokeinterface java/util/List.size ()I 1
      // 00a: bipush 2
      // 00b: if_icmpge 01e
      // 00e: new java/util/ArrayList
      // 011: dup
      // 012: aload 1
      // 013: checkcast java/util/Collection
      // 016: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 019: areturn
      // 01a: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01d: athrow
      // 01e: new java/util/ArrayList
      // 021: dup
      // 022: invokespecial java/util/ArrayList.<init> ()V
      // 025: astore 4
      // 027: iload 2
      // 028: iload 3
      // 029: ifne 047
      // 02c: ifeq 046
      // 02f: goto 036
      // 032: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 035: athrow
      // 036: aload 4
      // 038: aload 1
      // 039: checkcast java/util/Collection
      // 03c: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
      // 03f: goto 14c
      // 042: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 045: athrow
      // 046: bipush 0
      // 047: istore 5
      // 049: aload 1
      // 04a: invokeinterface java/util/List.size ()I 1
      // 04f: bipush 1
      // 050: isub
      // 051: istore 6
      // 053: iload 5
      // 055: iload 6
      // 057: if_icmpge 143
      // 05a: iload 5
      // 05c: iload 3
      // 05d: ifne 14c
      // 060: ifle 07e
      // 063: goto 06a
      // 066: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 069: athrow
      // 06a: aload 1
      // 06b: iload 5
      // 06d: bipush 1
      // 06e: isub
      // 06f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 074: checkcast net/minecraft/world/phys/Vec3
      // 077: goto 089
      // 07a: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 07d: athrow
      // 07e: aload 1
      // 07f: iload 5
      // 081: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 086: checkcast net/minecraft/world/phys/Vec3
      // 089: astore 7
      // 08b: aload 1
      // 08c: iload 5
      // 08e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 093: checkcast net/minecraft/world/phys/Vec3
      // 096: astore 8
      // 098: aload 1
      // 099: iload 5
      // 09b: bipush 1
      // 09c: iadd
      // 09d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0a2: checkcast net/minecraft/world/phys/Vec3
      // 0a5: astore 9
      // 0a7: iload 5
      // 0a9: bipush 2
      // 0aa: iadd
      // 0ab: aload 1
      // 0ac: invokeinterface java/util/List.size ()I 1
      // 0b1: if_icmpge 0c8
      // 0b4: aload 1
      // 0b5: iload 5
      // 0b7: bipush 2
      // 0b8: iadd
      // 0b9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0be: checkcast net/minecraft/world/phys/Vec3
      // 0c1: goto 0d5
      // 0c4: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0c7: athrow
      // 0c8: aload 1
      // 0c9: iload 5
      // 0cb: bipush 1
      // 0cc: iadd
      // 0cd: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d2: checkcast net/minecraft/world/phys/Vec3
      // 0d5: astore 10
      // 0d7: aload 8
      // 0d9: aload 9
      // 0db: invokevirtual net/minecraft/world/phys/Vec3.distanceTo (Lnet/minecraft/world/phys/Vec3;)D
      // 0de: dstore 11
      // 0e0: dload 11
      // 0e2: ldc2_w 0.1
      // 0e5: ddiv
      // 0e6: d2i
      // 0e7: istore 13
      // 0e9: bipush 0
      // 0ea: istore 14
      // 0ec: iload 3
      // 0ed: ifne 13f
      // 0f0: iload 14
      // 0f2: iload 13
      // 0f4: if_icmpgt 13c
      // 0f7: goto 0fe
      // 0fa: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0fd: athrow
      // 0fe: iload 14
      // 100: i2d
      // 101: iload 13
      // 103: bipush 1
      // 104: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (II)I
      // 107: i2d
      // 108: ddiv
      // 109: dstore 15
      // 10b: aload 0
      // 10c: aload 7
      // 10e: aload 8
      // 110: aload 9
      // 112: aload 10
      // 114: dload 15
      // 116: invokespecial me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;
      // 119: astore 17
      // 11b: aload 4
      // 11d: aload 17
      // 11f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 122: pop
      // 123: iload 14
      // 125: iload 13
      // 127: if_icmpeq 13c
      // 12a: iinc 14 1
      // 12d: iload 3
      // 12e: ifne 13f
      // 131: iload 3
      // 132: ifeq 0fe
      // 135: goto 13c
      // 138: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 13b: athrow
      // 13c: iinc 5 1
      // 13f: iload 3
      // 140: ifeq 053
      // 143: aload 4
      // 145: aload 1
      // 146: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 149: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 14c: pop
      // 14d: new java/util/ArrayList
      // 150: dup
      // 151: invokespecial java/util/ArrayList.<init> ()V
      // 154: astore 5
      // 156: aload 5
      // 158: aload 4
      // 15a: checkcast java/util/List
      // 15d: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
      // 160: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 163: pop
      // 164: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lnet/minecraft/core/BlockPos;
      // 167: astore 6
      // 169: iload 3
      // 16a: ifne 194
      // 16d: aload 6
      // 16f: dup
      // 170: ifnull 193
      // 173: goto 17a
      // 176: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 179: athrow
      // 17a: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 17d: dup
      // 17e: iload 3
      // 17f: ifne 198
      // 182: goto 189
      // 185: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 188: athrow
      // 189: ifnonnull 1a5
      // 18c: goto 193
      // 18f: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 192: athrow
      // 193: pop
      // 194: getstatic net/minecraft/world/phys/Vec3.ZERO Lnet/minecraft/world/phys/Vec3;
      // 197: dup
      // 198: sipush -10014
      // 19b: sipush -28443
      // 19e: pop2
      // 19f: ldc_w "ZERO"
      // 1a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1a5: astore 7
      // 1a7: bipush 0
      // 1a8: istore 8
      // 1aa: iload 8
      // 1ac: aload 4
      // 1ae: checkcast java/util/List
      // 1b1: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 1b4: if_icmpge 433
      // 1b7: aload 4
      // 1b9: iload 3
      // 1ba: ifne 435
      // 1bd: iload 8
      // 1bf: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1c2: dup
      // 1c3: goto 1ca
      // 1c6: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 1c9: athrow
      // 1ca: sipush -10012
      // 1cd: sipush 1615
      // 1d0: pop2
      // 1d1: ldc_w "get(...)"
      // 1d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1d7: checkcast net/minecraft/world/phys/Vec3
      // 1da: astore 9
      // 1dc: iload 8
      // 1de: bipush 1
      // 1df: iadd
      // 1e0: istore 10
      // 1e2: iload 8
      // 1e4: bipush 1
      // 1e5: iadd
      // 1e6: istore 11
      // 1e8: iload 11
      // 1ea: aload 4
      // 1ec: invokevirtual java/util/ArrayList.size ()I
      // 1ef: if_icmpge 41e
      // 1f2: aload 4
      // 1f4: iload 11
      // 1f6: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1f9: dup
      // 1fa: sipush -10010
      // 1fd: sipush -17433
      // 200: pop2
      // 201: ldc_w "get(...)"
      // 204: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 207: checkcast net/minecraft/world/phys/Vec3
      // 20a: astore 12
      // 20c: iload 2
      // 20d: iload 3
      // 20e: ifne 42d
      // 211: iload 3
      // 212: ifne 244
      // 215: goto 21c
      // 218: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 21b: athrow
      // 21c: ifeq 28a
      // 21f: goto 226
      // 222: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 225: athrow
      // 226: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 229: aload 9
      // 22b: aload 12
      // 22d: aconst_null
      // 22e: bipush 0
      // 22f: bipush 0
      // 230: dconst_0
      // 231: bipush 0
      // 232: bipush 0
      // 233: ldc2_w 0.2
      // 236: sipush 252
      // 239: aconst_null
      // 23a: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IZDZZDILjava/lang/Object;)Z
      // 23d: goto 244
      // 240: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 243: athrow
      // 244: iload 3
      // 245: ifne 287
      // 248: ifeq 286
      // 24b: goto 252
      // 24e: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 251: athrow
      // 252: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 255: aload 9
      // 257: aload 12
      // 259: aconst_null
      // 25a: bipush 0
      // 25b: bipush 0
      // 25c: dconst_0
      // 25d: bipush 0
      // 25e: bipush 0
      // 25f: ldc2_w -0.299
      // 262: sipush 252
      // 265: aconst_null
      // 266: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IZDZZDILjava/lang/Object;)Z
      // 269: iload 3
      // 26a: ifne 287
      // 26d: goto 274
      // 270: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 273: athrow
      // 274: ifeq 286
      // 277: goto 27e
      // 27a: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 27d: athrow
      // 27e: bipush 1
      // 27f: goto 29f
      // 282: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 285: athrow
      // 286: bipush 0
      // 287: goto 29f
      // 28a: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 28d: aload 9
      // 28f: aload 12
      // 291: aconst_null
      // 292: bipush 0
      // 293: bipush 0
      // 294: dconst_0
      // 295: bipush 0
      // 296: bipush 0
      // 297: dconst_0
      // 298: sipush 508
      // 29b: aconst_null
      // 29c: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IZDZZDILjava/lang/Object;)Z
      // 29f: istore 13
      // 2a1: iload 11
      // 2a3: iload 3
      // 2a4: ifne 402
      // 2a7: aload 4
      // 2a9: checkcast java/util/List
      // 2ac: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 2af: if_icmpne 3f9
      // 2b2: goto 2b9
      // 2b5: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2b8: athrow
      // 2b9: iload 13
      // 2bb: iload 3
      // 2bc: ifne 402
      // 2bf: goto 2c6
      // 2c2: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2c5: athrow
      // 2c6: ifeq 3f9
      // 2c9: goto 2d0
      // 2cc: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2cf: athrow
      // 2d0: aload 6
      // 2d2: iload 3
      // 2d3: ifne 303
      // 2d6: goto 2dd
      // 2d9: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2dc: athrow
      // 2dd: ifnull 3f9
      // 2e0: goto 2e7
      // 2e3: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 2e6: athrow
      // 2e7: aload 4
      // 2e9: iload 11
      // 2eb: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 2ee: dup
      // 2ef: sipush -10010
      // 2f2: sipush -17433
      // 2f5: pop2
      // 2f6: ldc_w "get(...)"
      // 2f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2fc: goto 303
      // 2ff: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 302: athrow
      // 303: checkcast net/minecraft/world/phys/Vec3
      // 306: astore 14
      // 308: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 30b: aload 9
      // 30d: aload 14
      // 30f: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 312: astore 15
      // 314: bipush 0
      // 315: istore 16
      // 317: new me/octo/client/utils/player/pathfinder/PXEvMid$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 31a: dup
      // 31b: aload 9
      // 31d: getstatic net/minecraft/world/phys/Vec3.ZERO Lnet/minecraft/world/phys/Vec3;
      // 320: dup
      // 321: sipush -10015
      // 324: sipush 29907
      // 327: pop2
      // 328: ldc_w "ZERO"
      // 32b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 32e: aload 15
      // 330: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 333: aload 15
      // 335: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 338: bipush 1
      // 339: invokespecial me/octo/client/utils/player/pathfinder/PXEvMid$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;FFZ)V
      // 33c: astore 17
      // 33e: iload 16
      // 340: bipush 100
      // 342: if_icmpgt 3f5
      // 345: iinc 16 1
      // 348: getstatic me/octo/client/utils/player/pathfinder/PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/PXEvMid;
      // 34b: dconst_1
      // 34c: dconst_0
      // 34d: aload 17
      // 34f: bipush 0
      // 350: dconst_0
      // 351: bipush 24
      // 353: aconst_null
      // 354: invokestatic me/octo/client/utils/player/pathfinder/PXEvMid.a (Lme/octo/client/utils/player/pathfinder/PXEvMid;DDLme/octo/client/utils/player/pathfinder/PXEvMid$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;ZDILjava/lang/Object;)Lme/octo/client/utils/player/pathfinder/PXEvMid$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 357: iload 3
      // 358: ifne 376
      // 35b: dup
      // 35c: iload 3
      // 35d: ifne 1ca
      // 360: goto 367
      // 363: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 366: athrow
      // 367: ifnonnull 372
      // 36a: pop
      // 36b: goto 33e
      // 36e: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 371: athrow
      // 372: astore 17
      // 374: aload 17
      // 376: invokevirtual me/octo/client/utils/player/pathfinder/PXEvMid$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/world/phys/Vec3;
      // 379: dconst_0
      // 37a: ldc2_w 1.26
      // 37d: dconst_0
      // 37e: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 381: dup
      // 382: sipush -10005
      // 385: sipush 25855
      // 388: pop2
      // 389: ldc_w "add(...)"
      // 38c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 38f: astore 18
      // 391: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 394: aload 6
      // 396: ldc_w net/minecraft/client/player/RemotePlayer
      // 399: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
      // 39c: aload 18
      // 39e: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a (Lnet/minecraft/core/BlockPos;Ljava/util/List;Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 3a1: astore 19
      // 3a3: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 3a6: aload 18
      // 3a8: aload 7
      // 3aa: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 3ad: ldc2_w 16.0
      // 3b0: dcmpg
      // 3b1: iload 3
      // 3b2: ifne 340
      // 3b5: ifge 33e
      // 3b8: aload 19
      // 3ba: iload 3
      // 3bb: ifne 3d0
      // 3be: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 3c1: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 3c4: if_acmpne 33e
      // 3c7: goto 3ce
      // 3ca: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 3cd: athrow
      // 3ce: aload 19
      // 3d0: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/core/BlockPos;
      // 3d3: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lnet/minecraft/core/BlockPos;
      // 3d6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 3d9: iload 3
      // 3da: ifne 3f1
      // 3dd: ifeq 33e
      // 3e0: goto 3e7
      // 3e3: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 3e6: athrow
      // 3e7: aload 5
      // 3e9: aload 17
      // 3eb: invokevirtual me/octo/client/utils/player/pathfinder/PXEvMid$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/world/phys/Vec3;
      // 3ee: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 3f1: pop
      // 3f2: aload 5
      // 3f4: areturn
      // 3f5: iload 3
      // 3f6: ifeq 41e
      // 3f9: iload 13
      // 3fb: goto 402
      // 3fe: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 401: athrow
      // 402: iload 3
      // 403: ifne 412
      // 406: ifeq 41b
      // 409: goto 410
      // 40c: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 40f: athrow
      // 410: iload 11
      // 412: istore 10
      // 414: iinc 11 1
      // 417: iload 3
      // 418: ifeq 1e8
      // 41b: goto 41e
      // 41e: aload 5
      // 420: aload 4
      // 422: iload 10
      // 424: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 427: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 42a: pop
      // 42b: iload 10
      // 42d: istore 8
      // 42f: iload 3
      // 430: ifeq 1aa
      // 433: aload 5
      // 435: areturn
   }

   private final Vec3 a(Vec3 var1, Vec3 var2, Vec3 var3, Vec3 var4, double var5) {
      double var7 = var5 * var5;
      double var9 = var7 * var5;
      double var11 = 0.5
         * (
            2.0 * var2.x
               + (-var1.x + var3.x) * var5
               + (2.0 * var1.x - 5.0 * var2.x + 4.0 * var3.x - var4.x) * var7
               + (-var1.x + 3.0 * var2.x - 3.0 * var3.x + var4.x) * var9
         );
      double var13 = 0.5
         * (
            2.0 * var2.y
               + (-var1.y + var3.y) * var5
               + (2.0 * var1.y - 5.0 * var2.y + 4.0 * var3.y - var4.y) * var7
               + (-var1.y + 3.0 * var2.y - 3.0 * var3.y + var4.y) * var9
         );
      double var15 = 0.5
         * (
            2.0 * var2.z
               + (-var1.z + var3.z) * var5
               + (2.0 * var1.z - 5.0 * var2.z + 4.0 * var3.z - var4.z) * var7
               + (-var1.z + 3.0 * var2.z - 3.0 * var3.z + var4.z) * var9
         );
      return new Vec3(var11, var13, var15);
   }

   private final List<Vec3> b(BlockPos param1) {
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      ArrayList<Vec3> var3 = new ArrayList<>();
      BlockPos var4 = param1;
      HashSet<BlockPos> var5 = new HashSet<>();

      while (true) {
         if (var4 == null) {
            break;
         }

         if (var2 == 0) {
            return CollectionsKt.reversed((Iterable)var5);
         }

         if (!var5.add(var4)) {
            break;
         }

         Byte var6 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(var4);
         if (var6 == null) {
            break;
         }

         double var7 = ((Number)llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var6)).doubleValue();
         double var9 = (double)var4.getY() + var7;
         var3.add(new Vec3((double)var4.getX() + 0.5, var9, (double)var4.getZ() + 0.5));
         var4 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.get(var4);
      }

      return CollectionsKt.reversed((Iterable)var3);
   }

   private final void a(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      Function2<? super IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, ? super Double, Unit> var2
   ) {
      BlockPos var4 = var1.a();
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Iterator var5 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = (IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var5.next();
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.a(
            var4, var6
         );

         label25: {
            try {
               if (var3 == 0) {
                  break label25;
               }

               if (var7 == null) {
                  continue;
               }
            } catch (NoSuchElementException var8) {
               throw (RuntimeException)a(var8);
            }

            var2.invoke(var7, 1.0);
         }

         if (var3 == 0) {
            break;
         }
      }
   }

   private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      BlockPos param1,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param2
   ) {
      if (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k() == 0) {
         return null;
      }

      BlockPos var4 = param1.offset(param2.a(), 0, param2.c());
      if (
         var4.getX() > IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a()
            || var4.getX() < IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b()
            || var4.getZ() > IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.c()
            || var4.getZ() < IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.d()
      ) {
         return null;
      }

      for (int var5 = 1; var5 > -2; var5--) {
         BlockPos var6 = var4.offset(0, var5, 0);
         if (IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.contains(var6)) {
            return null;
         }

         byte var7 = this.f(var6);
         if (var7 != 0) {
            if (!this.d(var6.offset(0, 1, 0))) {
               return null;
            }

            if (!this.e(var6.offset(0, 2, 0))) {
               return null;
            }

            if (var5 == 1 && !this.e(param1.offset(0, 3, 0))) {
               return null;
            }

            return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var6,
               var7,
               new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(param2.a(), var5, param2.c()),
               llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(Byte.valueOf(var7))
            );
         }
      }

      return null;
   }

   private static final Unit a(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param0,
      BlockPos param1,
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2,
      double param3
   ) {
      int guard = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      BlockPos pos = param2.a();
      if (IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.contains(pos)) {
         return Unit.INSTANCE;
      }

      double diff = param2.d() - param0.d();
      double gNew;
      if (guard == 0) {
         if (diff > 1.0) {
            return Unit.INSTANCE;
         }

         gNew = param3 + param0.g();
         if (
            param0.b() == 5
               && IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f(param1.above()) == 5
         ) {
            gNew += 2.0;
         }
      } else {
         gNew = param3 + param0.g();
         if (diff < 0.0) {
            gNew += Math.abs(diff) * 2.0;
         } else {
            gNew += 40.0;
         }
      }

      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI existing = IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get(pos);
      if (guard == 0 && existing != null && existing.g() <= gNew) {
         return Unit.INSTANCE;
      }

      Double heuristic = guard == 0
         ? llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(pos)
         : null;
      double heuristicValue = heuristic != null ? heuristic : IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(pos);
      param2.b(heuristicValue);
      param2.c(gNew);
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.put(pos, param1);
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.put(pos, param2);
      return Unit.INSTANCE;
   }
   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -10001) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 232;
            case 1 -> 183;
            case 2 -> 196;
            case 3 -> 111;
            case 4 -> 184;
            case 5 -> 68;
            case 6 -> 55;
            case 7 -> 223;
            case 8 -> 97;
            case 9 -> 47;
            case 10 -> 191;
            case 11 -> 142;
            case 12 -> 168;
            case 13 -> 147;
            case 14 -> 21;
            case 15 -> 62;
            case 16 -> 216;
            case 17 -> 207;
            case 18 -> 3;
            case 19 -> 164;
            case 20 -> 149;
            case 21 -> 255;
            case 22 -> 59;
            case 23 -> 76;
            case 24 -> 75;
            case 25 -> 101;
            case 26 -> 253;
            case 27 -> 229;
            case 28 -> 1;
            case 29 -> 144;
            case 30 -> 112;
            case 31 -> 219;
            case 32 -> 82;
            case 33 -> 85;
            case 34 -> 188;
            case 35 -> 91;
            case 36 -> 148;
            case 37 -> 49;
            case 38 -> 238;
            case 39 -> 155;
            case 40 -> 134;
            case 41 -> 89;
            case 42 -> 145;
            case 43 -> 39;
            case 44 -> 17;
            case 45 -> 57;
            case 46 -> 215;
            case 47 -> 132;
            case 48 -> 38;
            case 49 -> 86;
            case 50 -> 209;
            case 51 -> 36;
            case 52 -> 65;
            case 53 -> 217;
            case 54 -> 167;
            case 55 -> 94;
            case 56 -> 6;
            case 57 -> 37;
            case 58 -> 228;
            case 59 -> 161;
            case 60 -> 203;
            case 61 -> 193;
            case 62 -> 189;
            case 63 -> 105;
            case 64 -> 246;
            case 65 -> 16;
            case 66 -> 143;
            case 67 -> 42;
            case 68 -> 245;
            case 69 -> 139;
            case 70 -> 13;
            case 71 -> 187;
            case 72 -> 185;
            case 73 -> 186;
            case 74 -> 165;
            case 75 -> 33;
            case 76 -> 92;
            case 77 -> 154;
            case 78 -> 116;
            case 79 -> 200;
            case 80 -> 51;
            case 81 -> 159;
            case 82 -> 9;
            case 83 -> 0;
            case 84 -> 174;
            case 85 -> 214;
            case 86 -> 23;
            case 87 -> 80;
            case 88 -> 242;
            case 89 -> 131;
            case 90 -> 170;
            case 91 -> 230;
            case 92 -> 201;
            case 93 -> 195;
            case 94 -> 79;
            case 95 -> 7;
            case 96 -> 103;
            case 97 -> 208;
            case 98 -> 121;
            case 99 -> 34;
            case 100 -> 156;
            case 101 -> 237;
            case 102 -> 179;
            case 103 -> 218;
            case 104 -> 127;
            case 105 -> 30;
            case 106 -> 136;
            case 107 -> 90;
            case 108 -> 114;
            case 109 -> 192;
            case 110 -> 83;
            case 111 -> 26;
            case 112 -> 25;
            case 113 -> 77;
            case 114 -> 226;
            case 115 -> 28;
            case 116 -> 140;
            case 117 -> 113;
            case 118 -> 4;
            case 119 -> 173;
            case 120 -> 72;
            case 121 -> 40;
            case 122 -> 14;
            case 123 -> 99;
            case 124 -> 125;
            case 125 -> 117;
            case 126 -> 240;
            case 127 -> 175;
            case 128 -> 202;
            case 129 -> 120;
            case 130 -> 109;
            case 131 -> 50;
            case 132 -> 254;
            case 133 -> 58;
            case 134 -> 130;
            case 135 -> 224;
            case 136 -> 19;
            case 137 -> 60;
            case 138 -> 235;
            case 139 -> 84;
            case 140 -> 52;
            case 141 -> 22;
            case 142 -> 20;
            case 143 -> 126;
            case 144 -> 133;
            case 145 -> 241;
            case 146 -> 67;
            case 147 -> 135;
            case 148 -> 118;
            case 149 -> 87;
            case 150 -> 178;
            case 151 -> 12;
            case 152 -> 197;
            case 153 -> 8;
            case 154 -> 74;
            case 155 -> 108;
            case 156 -> 71;
            case 157 -> 41;
            case 158 -> 110;
            case 159 -> 233;
            case 160 -> 252;
            case 161 -> 95;
            case 162 -> 194;
            case 163 -> 212;
            case 164 -> 152;
            case 165 -> 169;
            case 166 -> 115;
            case 167 -> 213;
            case 168 -> 107;
            case 169 -> 177;
            case 170 -> 157;
            case 171 -> 96;
            case 172 -> 137;
            case 173 -> 32;
            case 174 -> 10;
            case 175 -> 100;
            case 176 -> 163;
            case 177 -> 239;
            case 178 -> 81;
            case 179 -> 198;
            case 180 -> 160;
            case 181 -> 24;
            case 182 -> 93;
            case 183 -> 250;
            case 184 -> 153;
            case 185 -> 48;
            case 186 -> 15;
            case 187 -> 102;
            case 188 -> 182;
            case 189 -> 181;
            case 190 -> 44;
            case 191 -> 64;
            case 192 -> 11;
            case 193 -> 104;
            case 194 -> 5;
            case 195 -> 141;
            case 196 -> 172;
            case 197 -> 63;
            case 198 -> 27;
            case 199 -> 220;
            case 200 -> 210;
            case 201 -> 88;
            case 202 -> 176;
            case 203 -> 43;
            case 204 -> 70;
            case 205 -> 78;
            case 206 -> 29;
            case 207 -> 248;
            case 208 -> 180;
            case 209 -> 251;
            case 210 -> 236;
            case 211 -> 98;
            case 212 -> 54;
            case 213 -> 225;
            case 214 -> 243;
            case 215 -> 138;
            case 216 -> 199;
            case 217 -> 227;
            case 218 -> 146;
            case 219 -> 66;
            case 220 -> 244;
            case 221 -> 151;
            case 222 -> 206;
            case 223 -> 18;
            case 224 -> 231;
            case 225 -> 122;
            case 226 -> 69;
            case 227 -> 128;
            case 228 -> 190;
            case 229 -> 234;
            case 230 -> 204;
            case 231 -> 46;
            case 232 -> 171;
            case 233 -> 166;
            case 234 -> 106;
            case 235 -> 119;
            case 236 -> 222;
            case 237 -> 45;
            case 238 -> 31;
            case 239 -> 150;
            case 240 -> 61;
            case 241 -> 129;
            case 242 -> 35;
            case 243 -> 73;
            case 244 -> 56;
            case 245 -> 249;
            case 246 -> 205;
            case 247 -> 211;
            case 248 -> 2;
            case 249 -> 123;
            case 250 -> 158;
            case 251 -> 53;
            case 252 -> 221;
            case 253 -> 124;
            case 254 -> 162;
            default -> 247;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int var1, int var2, int var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, int var2, int var3
      ) {
         return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -8502;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -10736;
         short var10002 = -8503;
         short var10003 = -9081;
         short var10004 = -8501;
         short var10005 = -19055;
         return "Offset(x=" + var3 + ", y=" + var2 + ", z=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var2 == 0) {
               return (boolean)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != 0);
            }

            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "~M:´\tB¾®\n¸ð-\u000eÕ\u0004Eå^¡";
         int var4 = "~M:´\tB¾®\n¸ð-\u000eÕ\u0004Eå^¡".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 23;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 23;
                  var10006 = var6;
               } else {
                  var13 = 23;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 23;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 15;
                     case 1 -> 20;
                     case 2 -> 50;
                     case 3 -> 115;
                     case 4 -> 17;
                     case 5 -> 67;
                     default -> 12;
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
               b = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -8501) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 240;
               case 1 -> 232;
               case 2 -> 104;
               case 3 -> 43;
               case 4 -> 11;
               case 5 -> 86;
               case 6 -> 50;
               case 7 -> 70;
               case 8 -> 51;
               case 9 -> 145;
               case 10 -> 139;
               case 11 -> 59;
               case 12 -> 80;
               case 13 -> 122;
               case 14 -> 157;
               case 15 -> 121;
               case 16 -> 91;
               case 17 -> 94;
               case 18 -> 214;
               case 19 -> 255;
               case 20 -> 203;
               case 21 -> 33;
               case 22 -> 85;
               case 23 -> 130;
               case 24 -> 106;
               case 25 -> 133;
               case 26 -> 114;
               case 27 -> 142;
               case 28 -> 146;
               case 29 -> 108;
               case 30 -> 115;
               case 31 -> 103;
               case 32 -> 213;
               case 33 -> 162;
               case 34 -> 227;
               case 35 -> 93;
               case 36 -> 220;
               case 37 -> 129;
               case 38 -> 216;
               case 39 -> 84;
               case 40 -> 141;
               case 41 -> 23;
               case 42 -> 137;
               case 43 -> 74;
               case 44 -> 169;
               case 45 -> 109;
               case 46 -> 112;
               case 47 -> 15;
               case 48 -> 61;
               case 49 -> 90;
               case 50 -> 163;
               case 51 -> 233;
               case 52 -> 175;
               case 53 -> 76;
               case 54 -> 192;
               case 55 -> 230;
               case 56 -> 38;
               case 57 -> 110;
               case 58 -> 185;
               case 59 -> 81;
               case 60 -> 5;
               case 61 -> 224;
               case 62 -> 168;
               case 63 -> 44;
               case 64 -> 19;
               case 65 -> 134;
               case 66 -> 72;
               case 67 -> 204;
               case 68 -> 102;
               case 69 -> 124;
               case 70 -> 42;
               case 71 -> 170;
               case 72 -> 36;
               case 73 -> 116;
               case 74 -> 147;
               case 75 -> 97;
               case 76 -> 17;
               case 77 -> 173;
               case 78 -> 156;
               case 79 -> 27;
               case 80 -> 183;
               case 81 -> 228;
               case 82 -> 155;
               case 83 -> 41;
               case 84 -> 180;
               case 85 -> 218;
               case 86 -> 9;
               case 87 -> 2;
               case 88 -> 226;
               case 89 -> 13;
               case 90 -> 251;
               case 91 -> 191;
               case 92 -> 248;
               case 93 -> 22;
               case 94 -> 150;
               case 95 -> 53;
               case 96 -> 140;
               case 97 -> 37;
               case 98 -> 212;
               case 99 -> 32;
               case 100 -> 46;
               case 101 -> 238;
               case 102 -> 71;
               case 103 -> 6;
               case 104 -> 31;
               case 105 -> 135;
               case 106 -> 111;
               case 107 -> 18;
               case 108 -> 132;
               case 109 -> 195;
               case 110 -> 149;
               case 111 -> 125;
               case 112 -> 48;
               case 113 -> 161;
               case 114 -> 128;
               case 115 -> 219;
               case 116 -> 243;
               case 117 -> 138;
               case 118 -> 209;
               case 119 -> 98;
               case 120 -> 177;
               case 121 -> 235;
               case 122 -> 3;
               case 123 -> 215;
               case 124 -> 1;
               case 125 -> 199;
               case 126 -> 10;
               case 127 -> 49;
               case 128 -> 164;
               case 129 -> 184;
               case 130 -> 14;
               case 131 -> 40;
               case 132 -> 117;
               case 133 -> 231;
               case 134 -> 25;
               case 135 -> 249;
               case 136 -> 73;
               case 137 -> 12;
               case 138 -> 174;
               case 139 -> 39;
               case 140 -> 62;
               case 141 -> 225;
               case 142 -> 223;
               case 143 -> 208;
               case 144 -> 246;
               case 145 -> 189;
               case 146 -> 58;
               case 147 -> 158;
               case 148 -> 52;
               case 149 -> 55;
               case 150 -> 166;
               case 151 -> 78;
               case 152 -> 196;
               case 153 -> 60;
               case 154 -> 118;
               case 155 -> 247;
               case 156 -> 35;
               case 157 -> 206;
               case 158 -> 69;
               case 159 -> 34;
               case 160 -> 221;
               case 161 -> 21;
               case 162 -> 200;
               case 163 -> 210;
               case 164 -> 190;
               case 165 -> 105;
               case 166 -> 250;
               case 167 -> 202;
               case 168 -> 193;
               case 169 -> 222;
               case 170 -> 242;
               case 171 -> 75;
               case 172 -> 187;
               case 173 -> 237;
               case 174 -> 245;
               case 175 -> 131;
               case 176 -> 7;
               case 177 -> 154;
               case 178 -> 159;
               case 179 -> 186;
               case 180 -> 160;
               case 181 -> 87;
               case 182 -> 198;
               case 183 -> 229;
               case 184 -> 54;
               case 185 -> 89;
               case 186 -> 127;
               case 187 -> 4;
               case 188 -> 205;
               case 189 -> 8;
               case 190 -> 67;
               case 191 -> 28;
               case 192 -> 45;
               case 193 -> 136;
               case 194 -> 92;
               case 195 -> 20;
               case 196 -> 239;
               case 197 -> 167;
               case 198 -> 119;
               case 199 -> 83;
               case 200 -> 181;
               case 201 -> 252;
               case 202 -> 211;
               case 203 -> 64;
               case 204 -> 77;
               case 205 -> 100;
               case 206 -> 95;
               case 207 -> 171;
               case 208 -> 26;
               case 209 -> 63;
               case 210 -> 0;
               case 211 -> 88;
               case 212 -> 126;
               case 213 -> 241;
               case 214 -> 172;
               case 215 -> 65;
               case 216 -> 30;
               case 217 -> 207;
               case 218 -> 152;
               case 219 -> 194;
               case 220 -> 188;
               case 221 -> 113;
               case 222 -> 234;
               case 223 -> 68;
               case 224 -> 29;
               case 225 -> 253;
               case 226 -> 57;
               case 227 -> 151;
               case 228 -> 79;
               case 229 -> 123;
               case 230 -> 16;
               case 231 -> 107;
               case 232 -> 254;
               case 233 -> 144;
               case 234 -> 120;
               case 235 -> 201;
               case 236 -> 236;
               case 237 -> 217;
               case 238 -> 176;
               case 239 -> 66;
               case 240 -> 179;
               case 241 -> 153;
               case 242 -> 182;
               case 243 -> 165;
               case 244 -> 47;
               case 245 -> 244;
               case 246 -> 143;
               case 247 -> 99;
               case 248 -> 24;
               case 249 -> 101;
               case 250 -> 96;
               case 251 -> 148;
               case 252 -> 82;
               case 253 -> 178;
               case 254 -> 197;
               default -> 56;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, int var1, int var2, int var3, int var4, java.lang.Object var5) {
         int var6 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         if ((var4 & 1) != 0) {
            if (var6 != 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var4 & 2) != 0) {
            if (var6 != 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var4 & 4) != 0) {
            if (var6 != 0) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         return var0.a(var1, var2, var3);
      }
}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final byte lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull BlockPos var1,
         byte var2,
         @NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
         double var4
      ) {
         short var10001 = -12711;
         short var10002 = -21647;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -12712;
         var10002 = 20701;
         Intrinsics.checkNotNullParameter(var3, "offset");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .getY()
            + var4;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final byte b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void a(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      public final double f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void b(double var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      public final double g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final void c(double var1) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "*·D@\u0088\u009d\u0003\u0097A\u001a";
         int var4 = "*·D@\u0088\u009d\u0003\u0097A\u001a".length();
         char var1 = 6;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 99;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 99;
                  var10006 = var6;
               } else {
                  var13 = 99;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 99;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 126;
                     case 1 -> 121;
                     case 2 -> 37;
                     case 3 -> 79;
                     case 4 -> 100;
                     case 5 -> 26;
                     default -> 110;
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
         int var2 = (var0 ^ -12712) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 201;
               case 1 -> 185;
               case 2 -> 1;
               case 3 -> 0;
               case 4 -> 191;
               case 5 -> 72;
               case 6 -> 135;
               case 7 -> 143;
               case 8 -> 51;
               case 9 -> 173;
               case 10 -> 56;
               case 11 -> 59;
               case 12 -> 109;
               case 13 -> 86;
               case 14 -> 111;
               case 15 -> 157;
               case 16 -> 252;
               case 17 -> 54;
               case 18 -> 255;
               case 19 -> 250;
               case 20 -> 139;
               case 21 -> 42;
               case 22 -> 241;
               case 23 -> 225;
               case 24 -> 145;
               case 25 -> 147;
               case 26 -> 73;
               case 27 -> 36;
               case 28 -> 146;
               case 29 -> 167;
               case 30 -> 239;
               case 31 -> 88;
               case 32 -> 227;
               case 33 -> 40;
               case 34 -> 177;
               case 35 -> 19;
               case 36 -> 55;
               case 37 -> 35;
               case 38 -> 134;
               case 39 -> 69;
               case 40 -> 205;
               case 41 -> 27;
               case 42 -> 113;
               case 43 -> 66;
               case 44 -> 52;
               case 45 -> 126;
               case 46 -> 10;
               case 47 -> 165;
               case 48 -> 208;
               case 49 -> 144;
               case 50 -> 39;
               case 51 -> 240;
               case 52 -> 7;
               case 53 -> 84;
               case 54 -> 108;
               case 55 -> 133;
               case 56 -> 94;
               case 57 -> 198;
               case 58 -> 97;
               case 59 -> 85;
               case 60 -> 70;
               case 61 -> 181;
               case 62 -> 91;
               case 63 -> 17;
               case 64 -> 9;
               case 65 -> 89;
               case 66 -> 193;
               case 67 -> 215;
               case 68 -> 218;
               case 69 -> 232;
               case 70 -> 247;
               case 71 -> 213;
               case 72 -> 216;
               case 73 -> 81;
               case 74 -> 44;
               case 75 -> 159;
               case 76 -> 31;
               case 77 -> 26;
               case 78 -> 102;
               case 79 -> 182;
               case 80 -> 2;
               case 81 -> 47;
               case 82 -> 230;
               case 83 -> 174;
               case 84 -> 169;
               case 85 -> 90;
               case 86 -> 140;
               case 87 -> 192;
               case 88 -> 61;
               case 89 -> 123;
               case 90 -> 172;
               case 91 -> 106;
               case 92 -> 23;
               case 93 -> 64;
               case 94 -> 163;
               case 95 -> 13;
               case 96 -> 158;
               case 97 -> 203;
               case 98 -> 3;
               case 99 -> 22;
               case 100 -> 156;
               case 101 -> 6;
               case 102 -> 15;
               case 103 -> 237;
               case 104 -> 62;
               case 105 -> 249;
               case 106 -> 114;
               case 107 -> 50;
               case 108 -> 71;
               case 109 -> 5;
               case 110 -> 238;
               case 111 -> 162;
               case 112 -> 32;
               case 113 -> 189;
               case 114 -> 168;
               case 115 -> 235;
               case 116 -> 115;
               case 117 -> 170;
               case 118 -> 226;
               case 119 -> 30;
               case 120 -> 219;
               case 121 -> 41;
               case 122 -> 118;
               case 123 -> 16;
               case 124 -> 160;
               case 125 -> 180;
               case 126 -> 166;
               case 127 -> 129;
               case 128 -> 124;
               case 129 -> 29;
               case 130 -> 20;
               case 131 -> 155;
               case 132 -> 24;
               case 133 -> 76;
               case 134 -> 18;
               case 135 -> 221;
               case 136 -> 202;
               case 137 -> 117;
               case 138 -> 119;
               case 139 -> 96;
               case 140 -> 150;
               case 141 -> 63;
               case 142 -> 245;
               case 143 -> 224;
               case 144 -> 11;
               case 145 -> 125;
               case 146 -> 65;
               case 147 -> 152;
               case 148 -> 228;
               case 149 -> 103;
               case 150 -> 236;
               case 151 -> 151;
               case 152 -> 142;
               case 153 -> 95;
               case 154 -> 234;
               case 155 -> 68;
               case 156 -> 43;
               case 157 -> 38;
               case 158 -> 207;
               case 159 -> 229;
               case 160 -> 161;
               case 161 -> 57;
               case 162 -> 149;
               case 163 -> 206;
               case 164 -> 188;
               case 165 -> 244;
               case 166 -> 4;
               case 167 -> 25;
               case 168 -> 28;
               case 169 -> 60;
               case 170 -> 254;
               case 171 -> 233;
               case 172 -> 243;
               case 173 -> 248;
               case 174 -> 176;
               case 175 -> 78;
               case 176 -> 154;
               case 177 -> 217;
               case 178 -> 53;
               case 179 -> 87;
               case 180 -> 184;
               case 181 -> 199;
               case 182 -> 116;
               case 183 -> 82;
               case 184 -> 121;
               case 185 -> 83;
               case 186 -> 175;
               case 187 -> 138;
               case 188 -> 98;
               case 189 -> 223;
               case 190 -> 34;
               case 191 -> 67;
               case 192 -> 211;
               case 193 -> 75;
               case 194 -> 122;
               case 195 -> 187;
               case 196 -> 210;
               case 197 -> 186;
               case 198 -> 214;
               case 199 -> 100;
               case 200 -> 164;
               case 201 -> 242;
               case 202 -> 137;
               case 203 -> 128;
               case 204 -> 120;
               case 205 -> 21;
               case 206 -> 49;
               case 207 -> 194;
               case 208 -> 80;
               case 209 -> 209;
               case 210 -> 171;
               case 211 -> 77;
               case 212 -> 197;
               case 213 -> 148;
               case 214 -> 130;
               case 215 -> 93;
               case 216 -> 178;
               case 217 -> 101;
               case 218 -> 58;
               case 219 -> 79;
               case 220 -> 212;
               case 221 -> 204;
               case 222 -> 190;
               case 223 -> 104;
               case 224 -> 196;
               case 225 -> 131;
               case 226 -> 92;
               case 227 -> 141;
               case 228 -> 253;
               case 229 -> 183;
               case 230 -> 200;
               case 231 -> 179;
               case 232 -> 46;
               case 233 -> 231;
               case 234 -> 107;
               case 235 -> 153;
               case 236 -> 220;
               case 237 -> 195;
               case 238 -> 12;
               case 239 -> 14;
               case 240 -> 8;
               case 241 -> 132;
               case 242 -> 112;
               case 243 -> 74;
               case 244 -> 33;
               case 245 -> 246;
               case 246 -> 105;
               case 247 -> 136;
               case 248 -> 127;
               case 249 -> 99;
               case 250 -> 222;
               case 251 -> 48;
               case 252 -> 45;
               case 253 -> 37;
               case 254 -> 251;
               default -> 110;
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

   public static final class PXEvMid {
      @NotNull
      public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public PXEvMid(int var1, int var2, int var3, int var4) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      }

      public final int a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int b() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int c() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int d() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int g() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int h() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid a(
         int var1, int var2, int var3, int var4
      ) {
         return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 11696;
         int var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         short var10001 = -23489;
         short var10002 = 11698;
         short var10003 = 3014;
         short var10004 = 11697;
         short var10005 = -31950;
         short var10006 = 11699;
         short var10007 = 17647;
         return "Bounds(upperBoundX=" + var4 + ", lowerBoundX=" + var3 + ", upperBoundZ=" + var2 + ", lowerBoundZ=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var1 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid var3 = (IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid)var10000;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 != 0) {
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var2 == 0) {
               return (boolean)(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != 0);
            }

            var10001 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "Äé\u0085óÇöh'µZÀ(rL\u0013\u0017Í\\ÏèºAM\u009eÃR¨RÚG\\\u0096êÛ";
         int var4 = "Äé\u0085óÇöh'µZÀ(rL\u0013\u0017Í\\ÏèºAM\u009eÃR¨RÚG\\\u0096êÛ".length();
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 51;
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
                        case 1 -> 31;
                        case 2 -> 125;
                        case 3 -> 44;
                        case 4 -> 38;
                        case 5 -> 67;
                        default -> 13;
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
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI((kotlin.jvm.internal.DefaultConstructorMarker) null);
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid(
                           Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE
                        );
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

                     var2 = "µ4Ñ4\u0013\u0091v¨\u0015È·\u0019ÿ\t\u000e8¿`E%¿°mÍp¬\u000e\u009eë";
                     var4 = "µ4Ñ4\u0013\u0091v¨\u0015È·\u0019ÿ\t\u000e8¿`E%¿°mÍp¬\u000e\u009eë".length();
                     var1 = 14;
                     var8 = -1;
               }

               var10000 = 48;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 11697) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 245;
               case 1 -> 71;
               case 2 -> 3;
               case 3 -> 252;
               case 4 -> 8;
               case 5 -> 5;
               case 6 -> 185;
               case 7 -> 109;
               case 8 -> 184;
               case 9 -> 202;
               case 10 -> 237;
               case 11 -> 200;
               case 12 -> 104;
               case 13 -> 137;
               case 14 -> 143;
               case 15 -> 0;
               case 16 -> 89;
               case 17 -> 187;
               case 18 -> 164;
               case 19 -> 26;
               case 20 -> 18;
               case 21 -> 118;
               case 22 -> 90;
               case 23 -> 170;
               case 24 -> 234;
               case 25 -> 97;
               case 26 -> 173;
               case 27 -> 128;
               case 28 -> 232;
               case 29 -> 46;
               case 30 -> 52;
               case 31 -> 254;
               case 32 -> 178;
               case 33 -> 190;
               case 34 -> 208;
               case 35 -> 253;
               case 36 -> 134;
               case 37 -> 219;
               case 38 -> 250;
               case 39 -> 103;
               case 40 -> 10;
               case 41 -> 238;
               case 42 -> 157;
               case 43 -> 144;
               case 44 -> 140;
               case 45 -> 147;
               case 46 -> 126;
               case 47 -> 151;
               case 48 -> 11;
               case 49 -> 56;
               case 50 -> 233;
               case 51 -> 228;
               case 52 -> 20;
               case 53 -> 95;
               case 54 -> 100;
               case 55 -> 80;
               case 56 -> 85;
               case 57 -> 204;
               case 58 -> 35;
               case 59 -> 141;
               case 60 -> 42;
               case 61 -> 127;
               case 62 -> 30;
               case 63 -> 244;
               case 64 -> 16;
               case 65 -> 165;
               case 66 -> 58;
               case 67 -> 31;
               case 68 -> 114;
               case 69 -> 156;
               case 70 -> 41;
               case 71 -> 91;
               case 72 -> 153;
               case 73 -> 6;
               case 74 -> 236;
               case 75 -> 7;
               case 76 -> 36;
               case 77 -> 34;
               case 78 -> 33;
               case 79 -> 210;
               case 80 -> 240;
               case 81 -> 44;
               case 82 -> 21;
               case 83 -> 55;
               case 84 -> 1;
               case 85 -> 4;
               case 86 -> 111;
               case 87 -> 32;
               case 88 -> 243;
               case 89 -> 177;
               case 90 -> 180;
               case 91 -> 28;
               case 92 -> 99;
               case 93 -> 76;
               case 94 -> 136;
               case 95 -> 160;
               case 96 -> 130;
               case 97 -> 131;
               case 98 -> 239;
               case 99 -> 193;
               case 100 -> 225;
               case 101 -> 75;
               case 102 -> 203;
               case 103 -> 148;
               case 104 -> 101;
               case 105 -> 38;
               case 106 -> 115;
               case 107 -> 22;
               case 108 -> 207;
               case 109 -> 121;
               case 110 -> 84;
               case 111 -> 223;
               case 112 -> 82;
               case 113 -> 197;
               case 114 -> 227;
               case 115 -> 25;
               case 116 -> 59;
               case 117 -> 48;
               case 118 -> 13;
               case 119 -> 224;
               case 120 -> 181;
               case 121 -> 37;
               case 122 -> 77;
               case 123 -> 27;
               case 124 -> 246;
               case 125 -> 199;
               case 126 -> 133;
               case 127 -> 211;
               case 128 -> 15;
               case 129 -> 98;
               case 130 -> 230;
               case 131 -> 206;
               case 132 -> 68;
               case 133 -> 66;
               case 134 -> 171;
               case 135 -> 107;
               case 136 -> 150;
               case 137 -> 142;
               case 138 -> 192;
               case 139 -> 73;
               case 140 -> 161;
               case 141 -> 63;
               case 142 -> 122;
               case 143 -> 43;
               case 144 -> 112;
               case 145 -> 251;
               case 146 -> 226;
               case 147 -> 132;
               case 148 -> 45;
               case 149 -> 242;
               case 150 -> 169;
               case 151 -> 196;
               case 152 -> 93;
               case 153 -> 221;
               case 154 -> 78;
               case 155 -> 235;
               case 156 -> 2;
               case 157 -> 86;
               case 158 -> 195;
               case 159 -> 92;
               case 160 -> 116;
               case 161 -> 67;
               case 162 -> 57;
               case 163 -> 218;
               case 164 -> 212;
               case 165 -> 105;
               case 166 -> 53;
               case 167 -> 155;
               case 168 -> 54;
               case 169 -> 152;
               case 170 -> 186;
               case 171 -> 231;
               case 172 -> 172;
               case 173 -> 248;
               case 174 -> 124;
               case 175 -> 79;
               case 176 -> 182;
               case 177 -> 83;
               case 178 -> 163;
               case 179 -> 216;
               case 180 -> 94;
               case 181 -> 129;
               case 182 -> 135;
               case 183 -> 222;
               case 184 -> 158;
               case 185 -> 255;
               case 186 -> 123;
               case 187 -> 12;
               case 188 -> 214;
               case 189 -> 117;
               case 190 -> 191;
               case 191 -> 29;
               case 192 -> 229;
               case 193 -> 49;
               case 194 -> 14;
               case 195 -> 119;
               case 196 -> 47;
               case 197 -> 23;
               case 198 -> 113;
               case 199 -> 138;
               case 200 -> 167;
               case 201 -> 39;
               case 202 -> 9;
               case 203 -> 106;
               case 204 -> 50;
               case 205 -> 145;
               case 206 -> 205;
               case 207 -> 70;
               case 208 -> 179;
               case 209 -> 241;
               case 210 -> 168;
               case 211 -> 159;
               case 212 -> 175;
               case 213 -> 51;
               case 214 -> 188;
               case 215 -> 198;
               case 216 -> 139;
               case 217 -> 154;
               case 218 -> 102;
               case 219 -> 176;
               case 220 -> 74;
               case 221 -> 64;
               case 222 -> 88;
               case 223 -> 69;
               case 224 -> 146;
               case 225 -> 81;
               case 226 -> 209;
               case 227 -> 166;
               case 228 -> 62;
               case 229 -> 40;
               case 230 -> 213;
               case 231 -> 72;
               case 232 -> 96;
               case 233 -> 87;
               case 234 -> 247;
               case 235 -> 65;
               case 236 -> 61;
               case 237 -> 215;
               case 238 -> 217;
               case 239 -> 108;
               case 240 -> 194;
               case 241 -> 220;
               case 242 -> 183;
               case 243 -> 249;
               case 244 -> 17;
               case 245 -> 162;
               case 246 -> 125;
               case 247 -> 201;
               case 248 -> 120;
               case 249 -> 19;
               case 250 -> 149;
               case 251 -> 174;
               case 252 -> 24;
               case 253 -> 189;
               case 254 -> 60;
               default -> 110;
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

      public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

         private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
         }

         @NotNull
         public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid a() {
            return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
      }
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid a(me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid var0, int var1, int var2, int var3, int var4, int var5, java.lang.Object var6) {
         int var7 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         if ((var5 & 1) != 0) {
            if (var7 != 0) {
               var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var5 & 2) != 0) {
            if (var7 != 0) {
               var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         if ((var5 & 4) != 0) {
            if (var7 != 0) {
               var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }
         }
         if ((var5 & 8) != 0) {
            if (var7 != 0) {
               var4 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
         }
         return var0.a(var1, var2, var3, var4);
      }

      // PX-FIX-ok: synthetic accessor (jar: getstatic/areturn)
      public static final me.octo.client.utils.player.pathfinder.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.PXEvMid i() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }
}

   // ===== PX-RESTORED T3c: methods present in the jar, absent from this file =====
   // PX-RESTORED Kotlin $default bridge (javap -c: masks bit 1 -> default the nullable second BlockPos).
   public static ArrayList a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var0, BlockPos var1, BlockPos var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      return var0.a(var1, var2);
   }

   // PX-RESTORED a(Entity)BlockPos (javap -c; decompilers failed): scans y=-1..1, x=-1..1, z=-6..(<6 if
   // the entity is in liquid, else 1) around the entity for a standable column and returns the nearest
   // candidate to the entity position (null when none).
   public final BlockPos a(Entity param1) {
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      if (param1 == null) {
         return null;
      } else {
         ArrayList<BlockPos> var3 = new ArrayList<>();
         BlockPos var4 = new BlockPos((int)Math.floor(param1.getX()), (int)Math.floor(param1.getY()), (int)Math.floor(param1.getZ()));
         int var5 = param1.isInLiquid() ? 6 : 1;

         for (int var6 = -1; var6 < 2; var6++) {
            for (int var7 = -1; var7 < 2; var7++) {
               for (int var8 = -6; var8 <= var5; var8++) {
                  BlockPos var9 = var4.offset(var6, var8, var7);
                  if (this.f(var9) != 0 && this.d(var9.offset(0, 1, 0)) && this.e(var9.offset(0, 2, 0))) {
                     var3.add(var9);
                  }
               }
            }
         }

         Iterator<BlockPos> var8x = var3.iterator();
         if (!var8x.hasNext()) {
            return null;
         } else {
            BlockPos var9x = var8x.next();
            if (var8x.hasNext()) {
               double var10 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(param1).distanceToSqr(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var9x));
               do {
                  BlockPos var12 = var8x.next();
                  double var13 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(param1).distanceToSqr(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var12));
                  if (var10 > var13) {
                     var9x = var12;
                     var10 = var13;
                  }
               } while (var8x.hasNext());
            }

            return var9x;
         }
      }
   }

   private final double c(BlockPos var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Double var3 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(var1);
      int var2 = var10000;

      label30: {
         try {
            if (var2 == 0) {
               return var3;
            }

            if (var3 == null) {
               break label30;
            }
         } catch (NoSuchElementException var10) {
            throw a(var10);
         }

         return var3;
      }

      int var4 = Math.abs(var1.getX() - IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getX());
      int var5 = Math.abs(var1.getZ() - IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.getZ());
      int var6 = Math.min(var4, var5);
      int var7 = Math.max(var4, var5);
      double var8 = 1.4 * var6 + (var7 - var6);
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.put(var1, var8);
      return var8;
   }

   // PX-RESTORED d(BlockPos)Z (javap -c): live branch of the anti-tamper watermark (WM.k() != 0 by default)
   // is "block code 0 or 4" i.e. a position you can stand on.
   private final boolean d(BlockPos param1) {
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      byte var3 = this.f(param1);
      return var3 == 0 || var3 == 4;
   }

   // PX-RESTORED e(BlockPos)Z (Vineflower body; the decompiler's `(boolean)` pseudo-casts on the
   // watermark-selected arms are not legal Java, so each arm is written as the equivalent boolean
   // expression it compiles to: ireturn of the raw byte for the (var2 != 0) arm, a constant otherwise.
   // Live arm at runtime = watermark.j() == 0 (the default), i.e. "block code 0".
   private final boolean e(BlockPos param1) {
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();

      try {
         byte var3 = this.f(param1);
         if (var2 != 0) {
            return var3 != 0;
         }

         if (var3 == 0) {
            return true;
         }
      } catch (NoSuchElementException var4) {
         throw a(var4);
      }

      return false;
   }

   // PX-RESTORED f(BlockPos)B (javap -c; Vineflower/CFR both failed on this method): traversal-cost
   // code of the block, cached in IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll. Live branch = watermark.j() == 0 (the default).
   private final byte f(BlockPos param1) {
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (!this.g().isLoaded(param1)) {
         return 0;
      } else {
         Byte var3 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.get(param1);
         if (var3 != null) {
            return var3;
         } else {
            BlockState var4 = this.g().getBlockState(param1);
            net.minecraft.world.level.block.Block var5 = var4.getBlock();
            byte var6;
            if (var4.isAir() || var4.getCollisionShape(this.g(), param1).isEmpty()) {
               var6 = 0;
            } else if (var5 instanceof net.minecraft.world.level.block.SlabBlock && var4.getValue(net.minecraft.world.level.block.SlabBlock.TYPE) == net.minecraft.world.level.block.state.properties.SlabType.BOTTOM) {
               var6 = 2;
            } else if (var5 instanceof net.minecraft.world.level.block.StairBlock && var4.getValue(net.minecraft.world.level.block.StairBlock.HALF) == net.minecraft.world.level.block.state.properties.Half.BOTTOM) {
               var6 = 3;
            } else if (var5 instanceof net.minecraft.world.level.block.StairBlock) {
               var6 = 1;
            } else if (var5 instanceof net.minecraft.world.level.block.CarpetBlock) {
               var6 = 4;
            } else if (var5 instanceof net.minecraft.world.level.block.FenceBlock || var5 instanceof net.minecraft.world.level.block.FenceGateBlock || var5 instanceof net.minecraft.world.level.block.WallBlock) {
               var6 = 6;
            } else if (!var4.getFluidState().isEmpty()) {
               var6 = 5;
            } else if (var5 instanceof net.minecraft.world.level.block.SnowLayerBlock) {
               switch ((Integer)var4.getValue(net.minecraft.world.level.block.SnowLayerBlock.LAYERS)) {
                  case 1:
                     var6 = 7;
                     break;
                  case 2:
                     var6 = 8;
                     break;
                  case 3:
                     var6 = 9;
                     break;
                  case 4:
                     var6 = 10;
                     break;
                  case 5:
                     var6 = 11;
                     break;
                  case 6:
                     var6 = 12;
                     break;
                  case 7:
                     var6 = 13;
                     break;
                  default:
                     var6 = 14;
               }
            } else if (Intrinsics.areEqual(var5, net.minecraft.world.level.block.Blocks.SNOW)) {
               var6 = 15;
            } else {
               var6 = 1;
            }

            IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.put(param1, var6);
            return var6;
         }
      }
   }

   private final void h() {
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.clear();
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.clear();
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.clear();
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.clear();
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.clear();
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.clear();
   }
}
