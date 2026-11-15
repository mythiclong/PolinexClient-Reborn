package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;
import kotlin.text.MatchResult;
import net.minecraft.world.level.block.Block;
import me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.client.multiplayer.ClientLevel;
import java.util.Collection;
import kotlin.text.StringsKt;
import kotlin.TuplesKt;

public final class lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   
   @NotNull
   public static lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Regex IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BlockPos[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] c;
   private static String[] d;

   private lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll() {
   }

   @NotNull
   public final Regex g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final BlockPos[] h() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final boolean a(@NotNull BlockPos blockPos) {
       boolean bl;
       block14: {
           block16: {
               block15: {
                   Object object;
                   int[] nArray;
                   block13: {
                       block12: {
                           int[] nArray2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d();
                           Intrinsics.checkNotNullParameter(blockPos, "blockPos");
                           nArray = nArray2;
                           try {
                               try {
                                   try {
                                       if (nArray == null) break block12;
                                       object = this.a().level;
                                       if (object == null) break block12;
                                   }
                                   catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                       throw lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.a(noWhenBranchMatchedException);
                                   }
                                   if ((object = ((Level)object).getBlockState(blockPos)) != null) break block13;
                               }
                               catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                   throw lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.a(noWhenBranchMatchedException);
                               }
                           }
                           catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                               throw lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.a(noWhenBranchMatchedException);
                           }
                       }
                       return false;
                   }
                   BlockState object2 = (BlockState)object;
                   try {
                       try {
                           try {
                               bl = object2.is(Blocks.STRIPPED_SPRUCE_WOOD);
                               if (nArray == null) break block14;
                               if (bl) break block15;
                           }
                           catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                               throw lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.a(noWhenBranchMatchedException);
                           }
                           bl = object2.is(Blocks.MANGROVE_WOOD);
                           if (nArray == null) break block14;
                       }
                       catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                           throw lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.a(noWhenBranchMatchedException);
                       }
                       if (!bl) break block16;
                   }
                   catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                       throw lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.a(noWhenBranchMatchedException);
                   }
               }
               bl = true;
               break block14;
           }
           bl = false;
       }
       return bl;
   }

   @NotNull
   public final Pair<ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII>, Pair<BlockPos, BlockPos>> a(
      @NotNull Level world,
      @NotNull BlockPos start,
      @NotNull Set<BlockPos> visited,
      @NotNull List<? extends IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> expectedTypes
   ) {
      Intrinsics.checkNotNullParameter(world, "world");
      Intrinsics.checkNotNullParameter(start, "start");
      Intrinsics.checkNotNullParameter(visited, "visited");
      Intrinsics.checkNotNullParameter(expectedTypes, "expectedTypes");

      ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> result = new ArrayList<>();
      kotlin.collections.ArrayDeque<BlockPos> queue = new kotlin.collections.ArrayDeque<>();
      queue.add(start);
      visited.add(start);

      int minX = start.getX();
      int minY = start.getY();
      int minZ = start.getZ();
      int maxX = start.getX();
      int maxY = start.getY();
      int maxZ = start.getZ();

      while (!queue.isEmpty()) {
         BlockPos current = queue.removeFirst();
         IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII type = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(current);
         if (type == null) {
            continue;
         }
         result.add(type);

         minX = Math.min(minX, current.getX());
         minY = Math.min(minY, current.getY());
         minZ = Math.min(minZ, current.getZ());
         maxX = Math.max(maxX, current.getX());
         maxY = Math.max(maxY, current.getY());
         maxZ = Math.max(maxZ, current.getZ());

         for (BlockPos offset : lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            BlockPos next = current.offset(offset.getX(), offset.getY(), offset.getZ());
            if (!visited.contains(next) && expectedTypes.contains(this.b(next))) {
               visited.add(next);
               queue.add(next);
            }
         }
      }

      BlockPos min = new BlockPos(minX, minY, minZ);
      BlockPos max = new BlockPos(maxX, maxY, maxZ);
      return TuplesKt.to(result, TuplesKt.to(min, max));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "Óõ\u0004ö\u001e?\u008dH\u0005\u0087Ç³º8\u0005¥\u009d`\u0097#\">Ï¤ÏZ´N\u001e É\u008eY⊙\rù\u009dcd\u0014Û\u0096Ö¥b\u0017Á\u0083\n*ñI½¢È\u000b¹êìN%\u001eb\u0091ÛÈs\ry\u0091È\u001b5ùd\u009aù\u008b\u0090\u0084E\rêÍÈ]»õ\u001eÛëýÁSÛ\bL\u0002÷\b`àB³\b»\u0000\u0081\u008a¼\u0099+è\u0007E[\\\u008c\u0095\u000e\u000b\b1«e7â4î)\rÊòß\u0086\u0091Ó\u007fbæâ¸\u0018¤\r¤¾\u0012\u000f(âHD\u0000&d\u0080?";
      int var4 = "Óõ\u0004ö\u001e?\u008dH\u0005\u0087Ç³º8\u0005¥\u009d`\u0097#\">Ï¤ÏZ´N\u001e É\u008eY⊙\rù\u009dcd\u0014Û\u0096Ö¥b\u0017Á\u0083\n*ñI½¢È\u000b¹êìN%\u001eb\u0091ÛÈs\ry\u0091È\u001b5ùd\u009aù\u008b\u0090\u0084E\rêÍÈ]»õ\u001eÛëýÁSÛ\bL\u0002÷\b`àB³\b»\u0000\u0081\u008a¼\u0099+è\u0007E[\\\u008c\u0095\u000e\u000b\b1«e7â4î)\rÊòß\u0086\u0091Ó\u007fbæâ¸\u0018¤\r¤¾\u0012\u000f(âHD\u0000&d\u0080?"
         .length();
      char var1 = '\b';
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 2;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 98;
                     case 1 -> 54;
                     case 2 -> 49;
                     case 3 -> 78;
                     case 4 -> 19;
                     case 5 -> 53;
                     default -> 7;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[15];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll();
                     var10002 = -18909;
                     short var32 = -22744;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Regex("Sweep:\\s*(?:∮|§[0-9a-fk-or])*(\\d+)");
                     BlockPos[] var7 = new BlockPos[]{
                        new BlockPos(-1, -1, -1),
                        new BlockPos(-1, -1, 0),
                        new BlockPos(-1, -1, 1),
                        new BlockPos(-1, 0, -1),
                        new BlockPos(-1, 0, 0),
                        new BlockPos(-1, 0, 1),
                        new BlockPos(-1, 1, -1),
                        new BlockPos(-1, 1, 0),
                        new BlockPos(-1, 1, 1),
                        new BlockPos(0, -1, -1),
                        new BlockPos(0, -1, 0),
                        new BlockPos(0, -1, 1),
                        new BlockPos(0, 0, -1),
                        new BlockPos(0, 0, 1),
                        new BlockPos(0, 1, -1),
                        new BlockPos(0, 1, 0),
                        new BlockPos(0, 1, 1),
                        new BlockPos(1, -1, -1),
                        new BlockPos(1, -1, 0),
                        new BlockPos(1, -1, 1),
                        new BlockPos(1, 0, -1),
                        new BlockPos(1, 0, 0),
                        new BlockPos(1, 0, 1),
                        new BlockPos(1, 1, -1),
                        new BlockPos(1, 1, 0),
                        new BlockPos(1, 1, 1)
                     };
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "a3æ\u009f\u0005rþG\u0083L";
                  var4 = "a3æ\u009f\u0005rþG\u0083L".length();
                  var1 = 4;
                  var9 = -1;
            }

            var10000 = 9;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   @NotNull
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI b(@NotNull BlockPos blockPos) {
      Intrinsics.checkNotNullParameter(blockPos, "blockPos");
      ClientLevel var2 = this.a().level;
      Block var3 = var2 != null ? var2.getBlockState(blockPos).getBlock() : null;
      if (Intrinsics.areEqual(var3, Blocks.STRIPPED_SPRUCE_WOOD)) {
         return IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if (Intrinsics.areEqual(var3, Blocks.STRIPPED_MANGROVE_WOOD)) {
         return IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      return IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII c(@NotNull BlockPos blockPos) {
      Intrinsics.checkNotNullParameter(blockPos, "blockPos");
      ClientLevel var2 = this.a().level;
      if (var2 == null) {
         return null;
      }
      BlockState var3 = var2.getBlockState(blockPos);
      Block var4 = var3.getBlock();
      if (Intrinsics.areEqual(var4, Blocks.STRIPPED_SPRUCE_WOOD)) {
         return new IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, blockPos, var3);
      }
      if (Intrinsics.areEqual(var4, Blocks.STRIPPED_MANGROVE_WOOD)) {
         return new IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, blockPos, var3);
      }
      return null;
   }

   public final int a(@NotNull IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII foragingBlock) {
      Intrinsics.checkNotNullParameter(foragingBlock, "foragingBlock");
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2 = foragingBlock.a();
      if (var2 == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         return 7;
      }
      if (var2 == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         return 50;
      }
      if (var2 == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         return 0;
      }
      throw new NoWhenBranchMatchedException();
   }

   public final int i() {
      List<String> var1 = CollectionsKt.asReversed(lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h());
      for (String var5 : var1) {
         if (!var5.contains("Sweep")) {
            continue;
         }
         MatchResult var6 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.find(var5, 0);
         if (var6 == null || var6.getGroups() == null || var6.getGroups().get(1) == null || var6.getGroups().get(1).getValue() == null) {
            return 0;
         }
         return Integer.parseInt(var6.getGroups().get(1).getValue());
      }
      return 0;
   }

   public final boolean a(@NotNull IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll tree) {
      Intrinsics.checkNotNullParameter(tree, "tree");
      for (Entity var5 : IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(CollectionsKt.listOf(ArmorStand.class), CollectionsKt.listOf("FIG TREE", "MANGROVE TREE"))) {
         if (tree.d().contains(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var5))) {
            return true;
         }
      }
      return false;
   }

   @Nullable
   public final IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll a(@NotNull BlockPos startPos, @NotNull List<? extends IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> expectedTypes) {
      Intrinsics.checkNotNullParameter(startPos, "startPos");
      Intrinsics.checkNotNullParameter(expectedTypes, "expectedTypes");
      ClientLevel var3 = this.a().level;
      if (var3 == null) {
         return null;
      }
      Pair<ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII>, Pair<BlockPos, BlockPos>> var4 = this.a(var3, startPos, new LinkedHashSet<BlockPos>(), expectedTypes);
      ArrayList<IIIIllIIlllIIlIIIIlIlIllIIIllIlIIlIIIIIIIlIlIllIlIlIllIlIlllllIlIlIlllIIIIIllllIIIlII> var5 = var4.component1();
      Pair<BlockPos, BlockPos> var6 = var4.component2();
      if (var5.size() < 4) {
         return null;
      }
      BlockPos var7 = var6.component1();
      BlockPos var8 = var6.component2();
      AABB var9 = new AABB((double)var7.getX(), (double)var7.getY(), (double)var7.getZ(), (double)var8.getX(), (double)var8.getY(), (double)var8.getZ());
      BlockPos var10 = new BlockPos((var7.getX() + var8.getX()) / 2, (var7.getY() + var8.getY()) / 2, (var7.getZ() + var8.getZ()) / 2);
      return new IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll(var5.get(0).a(), var5, var6, var9, var10, var5.size());
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -18912) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 19;
            case 1 -> 180;
            case 2 -> 236;
            case 3 -> 45;
            case 4 -> 79;
            case 5 -> 71;
            case 6 -> 2;
            case 7 -> 35;
            case 8 -> 112;
            case 9 -> 39;
            case 10 -> 228;
            case 11 -> 140;
            case 12 -> 167;
            case 13 -> 101;
            case 14 -> 97;
            case 15 -> 31;
            case 16 -> 245;
            case 17 -> 201;
            case 18 -> 0;
            case 19 -> 184;
            case 20 -> 181;
            case 21 -> 193;
            case 22 -> 156;
            case 23 -> 68;
            case 24 -> 249;
            case 25 -> 62;
            case 26 -> 216;
            case 27 -> 223;
            case 28 -> 21;
            case 29 -> 56;
            case 30 -> 182;
            case 31 -> 43;
            case 32 -> 162;
            case 33 -> 242;
            case 34 -> 163;
            case 35 -> 78;
            case 36 -> 225;
            case 37 -> 175;
            case 38 -> 214;
            case 39 -> 152;
            case 40 -> 132;
            case 41 -> 46;
            case 42 -> 145;
            case 43 -> 246;
            case 44 -> 59;
            case 45 -> 206;
            case 46 -> 58;
            case 47 -> 81;
            case 48 -> 141;
            case 49 -> 251;
            case 50 -> 169;
            case 51 -> 150;
            case 52 -> 219;
            case 53 -> 252;
            case 54 -> 47;
            case 55 -> 92;
            case 56 -> 244;
            case 57 -> 212;
            case 58 -> 40;
            case 59 -> 49;
            case 60 -> 89;
            case 61 -> 172;
            case 62 -> 166;
            case 63 -> 54;
            case 64 -> 17;
            case 65 -> 82;
            case 66 -> 53;
            case 67 -> 183;
            case 68 -> 157;
            case 69 -> 105;
            case 70 -> 129;
            case 71 -> 176;
            case 72 -> 121;
            case 73 -> 142;
            case 74 -> 111;
            case 75 -> 98;
            case 76 -> 135;
            case 77 -> 80;
            case 78 -> 119;
            case 79 -> 215;
            case 80 -> 137;
            case 81 -> 109;
            case 82 -> 93;
            case 83 -> 196;
            case 84 -> 138;
            case 85 -> 241;
            case 86 -> 5;
            case 87 -> 133;
            case 88 -> 102;
            case 89 -> 72;
            case 90 -> 160;
            case 91 -> 8;
            case 92 -> 229;
            case 93 -> 15;
            case 94 -> 27;
            case 95 -> 114;
            case 96 -> 147;
            case 97 -> 209;
            case 98 -> 200;
            case 99 -> 115;
            case 100 -> 127;
            case 101 -> 211;
            case 102 -> 159;
            case 103 -> 120;
            case 104 -> 38;
            case 105 -> 232;
            case 106 -> 248;
            case 107 -> 23;
            case 108 -> 55;
            case 109 -> 237;
            case 110 -> 208;
            case 111 -> 198;
            case 112 -> 227;
            case 113 -> 48;
            case 114 -> 187;
            case 115 -> 168;
            case 116 -> 205;
            case 117 -> 77;
            case 118 -> 188;
            case 119 -> 234;
            case 120 -> 24;
            case 121 -> 174;
            case 122 -> 239;
            case 123 -> 202;
            case 124 -> 75;
            case 125 -> 13;
            case 126 -> 179;
            case 127 -> 70;
            case 128 -> 165;
            case 129 -> 243;
            case 130 -> 123;
            case 131 -> 116;
            case 132 -> 63;
            case 133 -> 1;
            case 134 -> 146;
            case 135 -> 139;
            case 136 -> 117;
            case 137 -> 25;
            case 138 -> 51;
            case 139 -> 90;
            case 140 -> 73;
            case 141 -> 144;
            case 142 -> 52;
            case 143 -> 177;
            case 144 -> 124;
            case 145 -> 22;
            case 146 -> 231;
            case 147 -> 204;
            case 148 -> 4;
            case 149 -> 107;
            case 150 -> 12;
            case 151 -> 66;
            case 152 -> 253;
            case 153 -> 213;
            case 154 -> 218;
            case 155 -> 173;
            case 156 -> 148;
            case 157 -> 64;
            case 158 -> 30;
            case 159 -> 151;
            case 160 -> 134;
            case 161 -> 189;
            case 162 -> 36;
            case 163 -> 161;
            case 164 -> 203;
            case 165 -> 190;
            case 166 -> 233;
            case 167 -> 100;
            case 168 -> 32;
            case 169 -> 91;
            case 170 -> 128;
            case 171 -> 250;
            case 172 -> 42;
            case 173 -> 41;
            case 174 -> 194;
            case 175 -> 235;
            case 176 -> 154;
            case 177 -> 33;
            case 178 -> 164;
            case 179 -> 96;
            case 180 -> 76;
            case 181 -> 95;
            case 182 -> 149;
            case 183 -> 136;
            case 184 -> 195;
            case 185 -> 130;
            case 186 -> 153;
            case 187 -> 88;
            case 188 -> 126;
            case 189 -> 60;
            case 190 -> 118;
            case 191 -> 11;
            case 192 -> 14;
            case 193 -> 131;
            case 194 -> 28;
            case 195 -> 158;
            case 196 -> 84;
            case 197 -> 197;
            case 198 -> 170;
            case 199 -> 104;
            case 200 -> 34;
            case 201 -> 143;
            case 202 -> 113;
            case 203 -> 7;
            case 204 -> 221;
            case 205 -> 37;
            case 206 -> 155;
            case 207 -> 185;
            case 208 -> 199;
            case 209 -> 65;
            case 210 -> 108;
            case 211 -> 254;
            case 212 -> 18;
            case 213 -> 240;
            case 214 -> 6;
            case 215 -> 226;
            case 216 -> 125;
            case 217 -> 210;
            case 218 -> 94;
            case 219 -> 9;
            case 220 -> 50;
            case 221 -> 83;
            case 222 -> 26;
            case 223 -> 20;
            case 224 -> 224;
            case 225 -> 192;
            case 226 -> 44;
            case 227 -> 171;
            case 228 -> 103;
            case 229 -> 186;
            case 230 -> 207;
            case 231 -> 247;
            case 232 -> 57;
            case 233 -> 106;
            case 234 -> 69;
            case 235 -> 16;
            case 236 -> 87;
            case 237 -> 99;
            case 238 -> 255;
            case 239 -> 10;
            case 240 -> 110;
            case 241 -> 222;
            case 242 -> 220;
            case 243 -> 29;
            case 244 -> 191;
            case 245 -> 178;
            case 246 -> 122;
            case 247 -> 217;
            case 248 -> 238;
            case 249 -> 230;
            case 250 -> 61;
            case 251 -> 67;
            case 252 -> 85;
            case 253 -> 86;
            case 254 -> 3;
            default -> 74;
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
