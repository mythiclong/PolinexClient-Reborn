package me.octo.client.utils.player.pathfinder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
   }

   @Nullable
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @Nullable Entity var1
   ) {
      int var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      if (var2 == 0) {
         BlockPos var10000 = this.b(this.a().player);
         if (var10000 != null) {
            BlockPos var3 = var10000;
            if (var2 == 0) {
               var10000 = this.b(var1);
               if (var10000 != null) {
                  BlockPos var4 = var10000;
                  return this.a(var4, var3, true);
               }
            }

            return null;
         }
      }

      return null;
   }

   @Nullable
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @NotNull BlockPos var1
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = 23522;
      short var10003 = -1176;
      Intrinsics.checkNotNullParameter(var1, "to");
      int var2 = var10000;
      if (var2 != 0) {
         BlockPos var4 = this.b(this.a().player);
         if (var4 != null) {
            BlockPos var3 = var4;
            return this.a(var1, var3, true);
         }
      }

      return null;
   }

   @Nullable
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @NotNull BlockPos var1, boolean var2
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = 23522;
      short var10003 = -1176;
      Intrinsics.checkNotNullParameter(var1, "to");
      int var3 = var10000;
      if (var3 != 0) {
         BlockPos var5 = this.b(this.a().player);
         if (var5 != null) {
            BlockPos var4 = var5;
            return this.a(var1, var4, var2);
         }
      }

      return null;
   }

   @Nullable
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @NotNull BlockPos var1, @NotNull BlockPos var2
   ) {
      short var10001 = 23522;
      short var10002 = -1176;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10001 = 23521;
      var10002 = 19529;
      Intrinsics.checkNotNullParameter(var2, "from");
      return this.a(var1, var2, true);
   }

   @Nullable
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(
      @NotNull BlockPos var1, @NotNull BlockPos var2, boolean var3
   ) {
      short var10001 = 23522;
      short var10002 = -1176;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10001 = 23521;
      var10002 = 19529;
      Intrinsics.checkNotNullParameter(var2, "from");
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      long var5 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
      long var7 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2);
      int var4 = var10000;
      double var9 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .o();
      double var11 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
      long[] var13 = NativePathFinder.findPath(var5, var7, (float)var9, (int)var11, true);
      Intrinsics.checkNotNull(var13);
      var10000 = var13.length;
      if (var4 != 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return var10000 != 0
         ? null
         : llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var13, var9, var11, var3);
   }

   @Nullable
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b(
      @NotNull BlockPos var1
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = 23523;
      short var10003 = -8772;
      Intrinsics.checkNotNullParameter(var1, "to");
      int var2 = var10000;
      if (var2 != 0) {
         BlockPos var4 = this.b(this.a().player);
         if (var4 != null) {
            BlockPos var3 = var4;
            return this.b(var1, var3);
         }
      }

      return null;
   }

   @Nullable
   public final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b(
      @NotNull BlockPos var1, @NotNull BlockPos var2
   ) {
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      short var10002 = 23522;
      short var10003 = -1176;
      Intrinsics.checkNotNullParameter(var1, "to");
      var10002 = 23520;
      var10003 = 4213;
      Intrinsics.checkNotNullParameter(var2, "from");
      int var3 = var10000;
      long var4 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var1);
      long var6 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(var2);
      double var8 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .o();
      double var10 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
      long[] var12 = NativePathFinder.findPath(var4, var6, (float)var8, (int)var10, true);
      Intrinsics.checkNotNull(var12);
      var10000 = var12.length;
      if (var3 != 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return var10000 != 0
         ? null
         : llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var12, var10);
   }

   @Nullable
   public final BlockPos b(@Nullable Entity var1) {
       BlockPos var26 = null; // PX-FIX decl var26
      int var10000 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      ClientLevel var3 = this.a().level;
      int var2 = var10000;
      if (var1 != null && var3 != null) {
         AABB var27 = var1.getBoundingBox();
         short var10002 = 23527;
         short var10003 = 8756;
         Intrinsics.checkNotNullExpressionValue(var27, "getBoundingBox(...)");
         AABB var4 = var27;
         double var5 = var1.getY() - 0.01;
         BlockPos[] var8 = new BlockPos[]{
            BlockPos.containing(var4.minX, var5, var4.minZ),
            BlockPos.containing(var4.minX, var5, var4.maxZ),
            BlockPos.containing(var4.maxX, var5, var4.minZ),
            BlockPos.containing(var4.maxX, var5, var4.maxZ)
         };
         Iterable var22 = CollectionsKt.distinct(CollectionsKt.listOf(var8));
         boolean var9 = false;
         var var11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var22, 10));
         boolean var12 = false;
         Iterator var13 = var22.iterator();

         while (true) {
            if (var13.hasNext()) {
               Object var14 = var13.next();
               BlockPos var15 = (BlockPos)var14;
               boolean var16 = false;
               double var17 = Math.max(0.0, Math.min(var4.maxX, var15.getX() + 1.0) - Math.max(var4.minX, (double)var15.getX()));
               double var19 = Math.max(0.0, Math.min(var4.maxZ, var15.getZ() + 1.0) - Math.max(var4.minZ, (double)var15.getZ()));
               var11.add(TuplesKt.to(var15, var17 * var19));
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            }

            var22 = var11;
            var9 = false;
            break;
         }

         List var7 = CollectionsKt.sortedWith(
            var22,
            new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()
         );
         int var23 = 0;

         while (var23 < 257) {
            label56:
            for (Pair var10 :((Pair[])(Object)( var7))) {
               BlockPos var28 = ((BlockPos)var10.getFirst()).offset(0, -var23, 0);
               var10002 = 23526;
               var10003 = -25813;
               Intrinsics.checkNotNullExpressionValue(var28, "offset(...)");

               do {
                  var26 = var28;
                  boolean var29 = NativePathFinder.isWalkable(
                     IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var26)
                  );
                  if (var2 != 0) {
                     if (var29) {
                        return var26;
                     }

                     var29 = var3.getBlockState(var26).is(Blocks.LADDER);
                  }

                  if (var2 != 0) {
                     if (!var29) {
                        continue label56;
                     }

                     var29 = var3.getBlockState(var26.offset(0, 1, 0)).is(Blocks.LADDER);
                  }

                  if (var2 != 0) {
                     if (!var29) {
                        continue label56;
                     }

                     var29 = var3.getBlockState(var26.offset(0, 2, 0)).is(Blocks.LADDER);
                  }

                  if (!var29) {
                     continue label56;
                  }

                  var28 = var26;
               } while (var2 == 0);

               return var26;
            }

            var23++;
            if (var2 == 0) {
               break;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u009bE\u0002È\u001a\u0004dQ\u0014\u009a\u0004{à÷¬";
      int var4 = "\u009bE\u0002È\u001a\u0004dQ\u0014\u009a\u0004{à÷¬".length();
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 112;
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
                     case 0 -> 113;
                     case 1 -> 85;
                     case 2 -> 13;
                     case 3 -> 53;
                     case 4 -> 64;
                     case 5 -> 8;
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
                     c = var5;
                     d = new String[6];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
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

                  var2 = "hx\u0081K\u0014è!\u0082\t¥Íä£¡þ\u008a¯[\u0086\u000bO\u0092~D±\u001f\u0098\u0017÷Tó";
                  var4 = "hx\u0081K\u0014è!\u0082\t¥Íä£¡þ\u008a¯[\u0086\u000bO\u0092~D±\u001f\u0098\u0017÷Tó".length();
                  var1 = 19;
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 23523) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 120;
            case 1 -> 15;
            case 2 -> 101;
            case 3 -> 221;
            case 4 -> 106;
            case 5 -> 215;
            case 6 -> 150;
            case 7 -> 211;
            case 8 -> 143;
            case 9 -> 154;
            case 10 -> 103;
            case 11 -> 200;
            case 12 -> 72;
            case 13 -> 132;
            case 14 -> 241;
            case 15 -> 80;
            case 16 -> 170;
            case 17 -> 247;
            case 18 -> 214;
            case 19 -> 42;
            case 20 -> 135;
            case 21 -> 44;
            case 22 -> 114;
            case 23 -> 14;
            case 24 -> 145;
            case 25 -> 182;
            case 26 -> 203;
            case 27 -> 122;
            case 28 -> 231;
            case 29 -> 180;
            case 30 -> 79;
            case 31 -> 204;
            case 32 -> 16;
            case 33 -> 91;
            case 34 -> 54;
            case 35 -> 34;
            case 36 -> 151;
            case 37 -> 173;
            case 38 -> 48;
            case 39 -> 113;
            case 40 -> 53;
            case 41 -> 18;
            case 42 -> 141;
            case 43 -> 148;
            case 44 -> 232;
            case 45 -> 174;
            case 46 -> 249;
            case 47 -> 116;
            case 48 -> 55;
            case 49 -> 50;
            case 50 -> 75;
            case 51 -> 108;
            case 52 -> 85;
            case 53 -> 61;
            case 54 -> 181;
            case 55 -> 254;
            case 56 -> 153;
            case 57 -> 92;
            case 58 -> 47;
            case 59 -> 164;
            case 60 -> 49;
            case 61 -> 124;
            case 62 -> 235;
            case 63 -> 140;
            case 64 -> 36;
            case 65 -> 176;
            case 66 -> 84;
            case 67 -> 222;
            case 68 -> 71;
            case 69 -> 138;
            case 70 -> 126;
            case 71 -> 115;
            case 72 -> 194;
            case 73 -> 227;
            case 74 -> 149;
            case 75 -> 110;
            case 76 -> 51;
            case 77 -> 13;
            case 78 -> 188;
            case 79 -> 226;
            case 80 -> 184;
            case 81 -> 100;
            case 82 -> 217;
            case 83 -> 119;
            case 84 -> 152;
            case 85 -> 67;
            case 86 -> 95;
            case 87 -> 137;
            case 88 -> 195;
            case 89 -> 225;
            case 90 -> 98;
            case 91 -> 87;
            case 92 -> 212;
            case 93 -> 185;
            case 94 -> 234;
            case 95 -> 190;
            case 96 -> 86;
            case 97 -> 129;
            case 98 -> 45;
            case 99 -> 9;
            case 100 -> 73;
            case 101 -> 70;
            case 102 -> 202;
            case 103 -> 56;
            case 104 -> 186;
            case 105 -> 147;
            case 106 -> 20;
            case 107 -> 246;
            case 108 -> 29;
            case 109 -> 163;
            case 110 -> 62;
            case 111 -> 172;
            case 112 -> 69;
            case 113 -> 236;
            case 114 -> 35;
            case 115 -> 97;
            case 116 -> 255;
            case 117 -> 65;
            case 118 -> 30;
            case 119 -> 183;
            case 120 -> 196;
            case 121 -> 213;
            case 122 -> 89;
            case 123 -> 210;
            case 124 -> 4;
            case 125 -> 136;
            case 126 -> 245;
            case 127 -> 40;
            case 128 -> 94;
            case 129 -> 118;
            case 130 -> 3;
            case 131 -> 109;
            case 132 -> 27;
            case 133 -> 125;
            case 134 -> 52;
            case 135 -> 93;
            case 136 -> 207;
            case 137 -> 76;
            case 138 -> 22;
            case 139 -> 59;
            case 140 -> 142;
            case 141 -> 192;
            case 142 -> 25;
            case 143 -> 7;
            case 144 -> 201;
            case 145 -> 198;
            case 146 -> 239;
            case 147 -> 251;
            case 148 -> 43;
            case 149 -> 31;
            case 150 -> 168;
            case 151 -> 127;
            case 152 -> 240;
            case 153 -> 160;
            case 154 -> 206;
            case 155 -> 83;
            case 156 -> 58;
            case 157 -> 74;
            case 158 -> 39;
            case 159 -> 250;
            case 160 -> 121;
            case 161 -> 21;
            case 162 -> 99;
            case 163 -> 175;
            case 164 -> 63;
            case 165 -> 19;
            case 166 -> 252;
            case 167 -> 139;
            case 168 -> 68;
            case 169 -> 159;
            case 170 -> 24;
            case 171 -> 167;
            case 172 -> 223;
            case 173 -> 12;
            case 174 -> 155;
            case 175 -> 209;
            case 176 -> 191;
            case 177 -> 224;
            case 178 -> 11;
            case 179 -> 144;
            case 180 -> 228;
            case 181 -> 165;
            case 182 -> 248;
            case 183 -> 133;
            case 184 -> 8;
            case 185 -> 208;
            case 186 -> 26;
            case 187 -> 216;
            case 188 -> 78;
            case 189 -> 179;
            case 190 -> 111;
            case 191 -> 161;
            case 192 -> 253;
            case 193 -> 112;
            case 194 -> 6;
            case 195 -> 199;
            case 196 -> 77;
            case 197 -> 193;
            case 198 -> 237;
            case 199 -> 17;
            case 200 -> 157;
            case 201 -> 171;
            case 202 -> 64;
            case 203 -> 82;
            case 204 -> 102;
            case 205 -> 146;
            case 206 -> 220;
            case 207 -> 104;
            case 208 -> 166;
            case 209 -> 5;
            case 210 -> 37;
            case 211 -> 156;
            case 212 -> 230;
            case 213 -> 38;
            case 214 -> 41;
            case 215 -> 105;
            case 216 -> 229;
            case 217 -> 96;
            case 218 -> 158;
            case 219 -> 205;
            case 220 -> 32;
            case 221 -> 218;
            case 222 -> 23;
            case 223 -> 107;
            case 224 -> 233;
            case 225 -> 81;
            case 226 -> 131;
            case 227 -> 243;
            case 228 -> 0;
            case 229 -> 2;
            case 230 -> 28;
            case 231 -> 178;
            case 232 -> 1;
            case 233 -> 187;
            case 234 -> 57;
            case 235 -> 244;
            case 236 -> 134;
            case 237 -> 238;
            case 238 -> 10;
            case 239 -> 46;
            case 240 -> 123;
            case 241 -> 197;
            case 242 -> 242;
            case 243 -> 66;
            case 244 -> 33;
            case 245 -> 162;
            case 246 -> 128;
            case 247 -> 88;
            case 248 -> 177;
            case 249 -> 130;
            case 250 -> 117;
            case 251 -> 189;
            case 252 -> 60;
            case 253 -> 169;
            case 254 -> 219;
            default -> 90;
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

   public static enum IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   

      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] a() {
         return (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clone();
      }

      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         String var0
      ) {
         return Enum.valueOf(
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> b() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII};
   private static final EnumEntries<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] c() { return new me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII }; }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull BlockPos var1,
         @NotNull Vec3 var2,
         @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3
      ) {
         short var10001 = -27587;
         short var10002 = -13614;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -27588;
         var10002 = -22220;
         Intrinsics.checkNotNullParameter(var2, "topCenter");
         var10001 = -27600;
         var10002 = 24349;
         Intrinsics.checkNotNullParameter(var3, "type");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void a(
         @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1
      ) {
         short var10001 = -27586;
         short var10002 = -12851;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      @NotNull
      public final BlockPos d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Vec3 e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull BlockPos var1,
         @NotNull Vec3 var2,
         @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3
      ) {
         short var10001 = -27591;
         short var10002 = 9119;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = -27590;
         var10002 = 13088;
         Intrinsics.checkNotNullParameter(var2, "topCenter");
         var10001 = -27592;
         var10002 = -24030;
         Intrinsics.checkNotNullParameter(var3, "type");
         return new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -27599;
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Vec3 var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 14645;
         short var10002 = -27589;
         short var10003 = 18544;
         short var10004 = -27585;
         short var10005 = 28467;
         return "Node(pos=" + var3 + ", topCenter=" + var2 + ", type=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            if (var2 != 0) {
               return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  == var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         return !var4
            ? false
            : this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               == var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[10];
         int var3 = 0;
         String var2 = "Ä\u007fT,\u0003[ö \t½ç{Íe\u0085íK¿\fug5W=R@2?Æ\u009f=\t¹\u0019û\u0012u~ï4ÿ\u0003ÐáQ\u0007a\u0018´\u009acï&\u0007.È^´PÜµ";
         int var4 = "Ä\u007fT,\u0003[ö \t½ç{Íe\u0085íK¿\fug5W=R@2?Æ\u009f=\t¹\u0019û\u0012u~ï4ÿ\u0003ÐáQ\u0007a\u0018´\u009acï&\u0007.È^´PÜµ".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 48;
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
                        case 0 -> 67;
                        case 1 -> 117;
                        case 2 -> 24;
                        case 3 -> 104;
                        case 4 -> 36;
                        case 5 -> 66;
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
                        a = var5;
                        b = new String[10];
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

                     var2 = "L©åV\tæ\rÙ\u0016J¢WÄ\u007f";
                     var4 = "L©åV\tæ\rÙ\u0016J¢WÄ\u007f".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 20;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -27592) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 231;
               case 1 -> 84;
               case 2 -> 178;
               case 3 -> 169;
               case 4 -> 155;
               case 5 -> 127;
               case 6 -> 70;
               case 7 -> 201;
               case 8 -> 211;
               case 9 -> 145;
               case 10 -> 87;
               case 11 -> 176;
               case 12 -> 107;
               case 13 -> 100;
               case 14 -> 239;
               case 15 -> 216;
               case 16 -> 146;
               case 17 -> 40;
               case 18 -> 159;
               case 19 -> 1;
               case 20 -> 238;
               case 21 -> 39;
               case 22 -> 234;
               case 23 -> 199;
               case 24 -> 135;
               case 25 -> 172;
               case 26 -> 110;
               case 27 -> 174;
               case 28 -> 17;
               case 29 -> 190;
               case 30 -> 78;
               case 31 -> 49;
               case 32 -> 220;
               case 33 -> 166;
               case 34 -> 150;
               case 35 -> 8;
               case 36 -> 111;
               case 37 -> 46;
               case 38 -> 170;
               case 39 -> 249;
               case 40 -> 71;
               case 41 -> 18;
               case 42 -> 19;
               case 43 -> 200;
               case 44 -> 27;
               case 45 -> 148;
               case 46 -> 183;
               case 47 -> 38;
               case 48 -> 50;
               case 49 -> 37;
               case 50 -> 129;
               case 51 -> 218;
               case 52 -> 32;
               case 53 -> 217;
               case 54 -> 61;
               case 55 -> 33;
               case 56 -> 161;
               case 57 -> 120;
               case 58 -> 108;
               case 59 -> 180;
               case 60 -> 223;
               case 61 -> 248;
               case 62 -> 222;
               case 63 -> 221;
               case 64 -> 198;
               case 65 -> 144;
               case 66 -> 60;
               case 67 -> 195;
               case 68 -> 137;
               case 69 -> 56;
               case 70 -> 23;
               case 71 -> 12;
               case 72 -> 7;
               case 73 -> 210;
               case 74 -> 192;
               case 75 -> 208;
               case 76 -> 63;
               case 77 -> 104;
               case 78 -> 4;
               case 79 -> 125;
               case 80 -> 59;
               case 81 -> 83;
               case 82 -> 171;
               case 83 -> 179;
               case 84 -> 105;
               case 85 -> 167;
               case 86 -> 149;
               case 87 -> 242;
               case 88 -> 64;
               case 89 -> 75;
               case 90 -> 165;
               case 91 -> 79;
               case 92 -> 130;
               case 93 -> 194;
               case 94 -> 232;
               case 95 -> 57;
               case 96 -> 126;
               case 97 -> 247;
               case 98 -> 14;
               case 99 -> 85;
               case 100 -> 158;
               case 101 -> 204;
               case 102 -> 151;
               case 103 -> 124;
               case 104 -> 113;
               case 105 -> 154;
               case 106 -> 243;
               case 107 -> 117;
               case 108 -> 133;
               case 109 -> 162;
               case 110 -> 240;
               case 111 -> 213;
               case 112 -> 214;
               case 113 -> 187;
               case 114 -> 53;
               case 115 -> 30;
               case 116 -> 168;
               case 117 -> 246;
               case 118 -> 142;
               case 119 -> 16;
               case 120 -> 24;
               case 121 -> 163;
               case 122 -> 35;
               case 123 -> 241;
               case 124 -> 29;
               case 125 -> 101;
               case 126 -> 58;
               case 127 -> 252;
               case 128 -> 43;
               case 129 -> 230;
               case 130 -> 251;
               case 131 -> 31;
               case 132 -> 15;
               case 133 -> 207;
               case 134 -> 106;
               case 135 -> 48;
               case 136 -> 77;
               case 137 -> 182;
               case 138 -> 55;
               case 139 -> 215;
               case 140 -> 140;
               case 141 -> 25;
               case 142 -> 228;
               case 143 -> 72;
               case 144 -> 224;
               case 145 -> 47;
               case 146 -> 3;
               case 147 -> 69;
               case 148 -> 227;
               case 149 -> 52;
               case 150 -> 115;
               case 151 -> 96;
               case 152 -> 235;
               case 153 -> 74;
               case 154 -> 160;
               case 155 -> 2;
               case 156 -> 229;
               case 157 -> 134;
               case 158 -> 226;
               case 159 -> 139;
               case 160 -> 98;
               case 161 -> 10;
               case 162 -> 253;
               case 163 -> 255;
               case 164 -> 36;
               case 165 -> 114;
               case 166 -> 62;
               case 167 -> 156;
               case 168 -> 136;
               case 169 -> 212;
               case 170 -> 157;
               case 171 -> 153;
               case 172 -> 51;
               case 173 -> 66;
               case 174 -> 91;
               case 175 -> 93;
               case 176 -> 143;
               case 177 -> 54;
               case 178 -> 34;
               case 179 -> 193;
               case 180 -> 122;
               case 181 -> 82;
               case 182 -> 131;
               case 183 -> 95;
               case 184 -> 138;
               case 185 -> 6;
               case 186 -> 26;
               case 187 -> 123;
               case 188 -> 80;
               case 189 -> 186;
               case 190 -> 237;
               case 191 -> 225;
               case 192 -> 116;
               case 193 -> 181;
               case 194 -> 233;
               case 195 -> 45;
               case 196 -> 76;
               case 197 -> 20;
               case 198 -> 9;
               case 199 -> 28;
               case 200 -> 22;
               case 201 -> 86;
               case 202 -> 118;
               case 203 -> 73;
               case 204 -> 89;
               case 205 -> 44;
               case 206 -> 102;
               case 207 -> 0;
               case 208 -> 21;
               case 209 -> 112;
               case 210 -> 68;
               case 211 -> 236;
               case 212 -> 189;
               case 213 -> 244;
               case 214 -> 65;
               case 215 -> 119;
               case 216 -> 164;
               case 217 -> 206;
               case 218 -> 152;
               case 219 -> 81;
               case 220 -> 141;
               case 221 -> 254;
               case 222 -> 67;
               case 223 -> 90;
               case 224 -> 103;
               case 225 -> 147;
               case 226 -> 177;
               case 227 -> 41;
               case 228 -> 94;
               case 229 -> 121;
               case 230 -> 209;
               case 231 -> 188;
               case 232 -> 109;
               case 233 -> 97;
               case 234 -> 5;
               case 235 -> 92;
               case 236 -> 173;
               case 237 -> 197;
               case 238 -> 250;
               case 239 -> 88;
               case 240 -> 203;
               case 241 -> 128;
               case 242 -> 13;
               case 243 -> 219;
               case 244 -> 42;
               case 245 -> 202;
               case 246 -> 185;
               case 247 -> 175;
               case 248 -> 245;
               case 249 -> 11;
               case 250 -> 132;
               case 251 -> 205;
               case 252 -> 191;
               case 253 -> 184;
               case 254 -> 99;
               default -> 196;
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
      // PX-FIX synth restored from jar bytecode
      // PX-FIX synth restored from jar bytecode: Kotlin default-argument bridge
      public static me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0,
         net.minecraft.core.BlockPos p1,
         net.minecraft.world.phys.Vec3 p2,
         me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll p3,
         int p4,
         java.lang.Object p5
      ) {
         if ((p4 & 1) != 0) {
            p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }
         if ((p4 & 2) != 0) {
            p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }
         if ((p4 & 4) != 0) {
            p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }
         return p0.a(p1, p2, p3);
      }
   }
}
